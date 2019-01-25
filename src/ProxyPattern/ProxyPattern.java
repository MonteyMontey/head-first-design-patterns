package ProxyPattern;

public class ProxyPattern {
    /* Not going to implement this right now but it works like the following:

    Remote Proxy (proxy acts as a local representative for an object that lives in another JVM):

     * 1. You have an object (client object) that makes a request to another object (client helper)
     * 2. For the client object it seems like client helper is a completely normal object that just returns what the
     *    client object wants to know
     * 3. In reality, the client helper object doesn't know shit and needs to forward the request to another object
     *    in a different JVM!
     * 4. The client helper forwards the request to the Service helper object on another JVM via the internet, which
     *    then unpacks the request and forwards it to the service object on the same machine
     * 5. The service object knows the answer to the request and returns it to the service helper object
     * 6. Then the service helper object will send it to the client helper object which will answer the client object
     *

     Virtual Proxy(proxy acts as an representative for an object that may be expensive to create, so it defers
     the creation of the object until it is needed and is the surrogate for it if it doesn't exist):

    e.g. loading an image on a website:
    1. the image proxy first creates an image icon and starts loading it from a network url
    2. while it's loading the image proxy displays "Loading, please wait"
    3. when the image is fully loaded, ImageProxy delegates method calls to the image icon, e.g.
       paintIcon(), getWidth(), getHeight()


    Protection Proxy:
    limits access to the real subject. Based on some condition the proxy filters the calls and only
    some of them are let through to the real subject. The code example below is an example of protection proxy.


    there are also a shit ton of other variations, e.g. firewall proxy, smart reference proxy, caching proxy,
    synchronization proxy, copy on write proxy, complexity hiding proxy...


    INSIGHT: Caching int the browser is a proxy pattern!

*/
}
