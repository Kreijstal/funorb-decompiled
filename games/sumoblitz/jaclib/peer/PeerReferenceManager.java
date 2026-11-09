/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.peer;

public final class PeerReferenceManager {
    private jaclib.peer.PeerReference head;
    java.lang.ref.ReferenceQueue queue;
    private jaclib.peer.PeerReference tail;

    public final void pollReleasedReferences(int guard) {
        this.drainQueue(false);
        if (guard == 12575) {
          return;
        }
        this.tail = (jaclib.peer.PeerReference) null;
    }

    private final void releaseAndUnlink(int guard, jaclib.peer.PeerReference reference) {
        reference.release(guard - 19176);
        if (this.head == reference) {
          this.head = reference.next;
        }
        if (this.tail == reference) {
          this.tail = reference.previous;
        }
        if (reference.next != null) {
          reference.next.previous = reference.previous;
        }
        if (reference.previous != null) {
          reference.previous.next = reference.next;
        }
        if (guard == 19176) {
          return;
        }
        this.head = (jaclib.peer.PeerReference) null;
    }

    public final void releaseAll(int guard) {
        jaclib.peer.PeerReference var3 = null;
        if (guard != -25924) {
          var3 = (jaclib.peer.PeerReference) null;
          this.add((jaclib.peer.PeerReference) null, -79);
        } else {
          this.drainQueue(false);
          while (this.tail != null) {
            this.releaseAndUnlink(19176, this.tail);
          }
          this.drainQueue(false);
          return;
        }
        this.drainQueue(false);
        while (this.tail != null) {
          this.releaseAndUnlink(19176, this.tail);
        }
        this.drainQueue(false);
    }

    final void add(jaclib.peer.PeerReference reference, int guard) {
        if (guard == -13587) {
          reference.next = null;
          reference.previous = this.tail;
          if (null != this.head) {
            this.tail.next = reference;
          } else {
            this.head = reference;
          }
          this.tail = reference;
          return;
        }
    }

    private final void drainQueue(boolean guard) {
        java.lang.ref.Reference var2;
        jaclib.peer.PeerReference var3;
        if (guard) {
          return;
        }
        while (true) {
          var2 = this.queue.poll();
          if (var2 == null) {
            return;
          }
          var3 = (jaclib.peer.PeerReference) ((Object) var2);
          this.releaseAndUnlink(19176, var3);
        }
    }

    public PeerReferenceManager() {
        this.queue = new java.lang.ref.ReferenceQueue();
    }
}
