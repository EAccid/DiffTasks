package rxjava;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import rx.functions.Action1;


public class MainRx {

    public static void main(String[] args) {

        Observable.just("Hello, me!")
                .subscribe(System.out::println);

        Observable<String> observableL = Observable.create(observer -> {
            observer.onNext("Hello world 0!");
            observer.onComplete();
        });


        Observable<String> observable = Observable.create(new ObservableOnSubscribe<String>() {
                    @Override
                    public void subscribe(ObservableEmitter<String> e) throws Exception {
                        e.onNext("Hello world 1!");
                        e.onComplete();
                    }
                }
        );


        Subscriber<String> subscriber = new Subscriber<String>() {
            @Override
            public void onSubscribe(Subscription subscription) {
                System.out.println("onSubscribe");
            }

            @Override
            public void onNext(String s) {
                System.out.println("onNext: " + s);
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("onError");

            }

            @Override
            public void onComplete() {
                System.out.println("onComplete");

            }
        };


        rx.Observable.just("1", "2")
                .subscribe(new Action1<String>() {
                    @Override
                    public void call(String s) {
                        System.out.println(s);
                    }
                });

        rx.Observable.just("1", "2")
                .subscribe(s -> {
                    System.out.println(s);
                });

    }

}
