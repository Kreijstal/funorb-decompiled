/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class DualLinkDequeIterator implements Iterator {
    static UiComponent field_e;
    static int field_a;
    private DualLinkNode lastReturned;
    static int field_g;
    private DualLinkNode nextNode;
    static String progressJungleFinishing;
    private IterableDualLinkDeque deque;

    final static PlayingSound a(int param0, PcmSampleStream param1) {
        PlayingSound var2 = null;
        RuntimeException var2_ref = null;
        PlayingSound stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new PlayingSound(param1, param1);
          HighScoreSubmission.field_o.addFirst((byte) -74, var2);
          if (param0 != -24296) {
            DualLinkDequeIterator.releaseStatics(-16);
          }
          SpaceObject.field_d.addSubstream(param1);
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("mn.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final boolean hasNext() {
        return this.deque.sentinel != this.nextNode;
    }

    final static boolean a(boolean param0) {
        if (param0) {
          return !TextInputValidator.field_j.isComplete(114) ? true : false;
        }
        DualLinkDequeIterator.releaseStatics(69);
        return !TextInputValidator.field_j.isComplete(114) ? true : false;
    }

    public final void remove() {
        if (null == this.lastReturned) {
          throw new IllegalStateException();
        }
        this.lastReturned.unlinkNode(false);
        this.lastReturned = null;
    }

    public final Object next() {
        Object var1 = this.nextNode;
        if (this.deque.sentinel == var1) {
          var1 = null;
          this.nextNode = null;
        } else {
          this.nextNode = ((DualLinkNode) (var1)).field_q;
        }
        this.lastReturned = (DualLinkNode) (var1);
        return var1;
    }

    public static void releaseStatics(int param0) {
        if (param0 != 19000) {
          field_g = 83;
          field_e = null;
          progressJungleFinishing = null;
          return;
        }
        field_e = null;
        progressJungleFinishing = null;
    }

    DualLinkDequeIterator(IterableDualLinkDeque param0) {
        this.lastReturned = null;
        try {
          this.deque = param0;
          this.nextNode = this.deque.sentinel.field_q;
          this.lastReturned = null;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "mn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        progressJungleFinishing = "Catching breath!";
    }
}
