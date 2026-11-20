/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SecondaryNodeDequeIterator implements Iterator {
    private SecondaryNodeDeque deque;
    static llb field_a;
    private DualLinkNode lastReturned;
    static String field_c;
    private DualLinkNode nextNode;

    final static void a(int param0) {
        spb.a((byte) -95);
        if (null != igb.field_a) {
          kl.a(igb.field_a, param0 ^ 92);
        }
        if (param0 != 1) {
          SecondaryNodeDequeIterator.a(121);
          nmb.d(-87);
          CarouselPlayerEventFactory.b(14194);
          GetPedrosRepairModeSwitchtime.a(16928);
          if (GetRepairModeActiveTime.e(215)) {
            RequestNewestBlackboxRecording.field_p.writeIsaacByte(24335, 1);
            lnb.b(0, 127);
            ifb.l(-125);
            return;
          }
          ifb.l(-125);
          return;
        }
        nmb.d(-87);
        CarouselPlayerEventFactory.b(14194);
        GetPedrosRepairModeSwitchtime.a(16928);
        if (!GetRepairModeActiveTime.e(215)) {
          ifb.l(-125);
          return;
        }
        RequestNewestBlackboxRecording.field_p.writeIsaacByte(24335, 1);
        lnb.b(0, 127);
        ifb.l(-125);
    }

    public static void clearSharedReferences(byte param0) {
        if (param0 >= -76) {
          field_c = (String) null;
          field_c = null;
          field_a = null;
          return;
        }
        field_c = null;
        field_a = null;
    }

    public final boolean hasNext() {
        return this.deque.sentinel != this.nextNode;
    }

    public final void remove() {
        if (null == this.lastReturned) {
          throw new IllegalStateException();
        }
        this.lastReturned.unlinkSecondary((byte) -35);
        this.lastReturned = null;
    }

    public final Object next() {
        Object var1 = this.nextNode;
        if (var1 == this.deque.sentinel) {
          this.nextNode = null;
          var1 = null;
        } else {
          this.nextNode = ((DualLinkNode) (var1)).secondaryNext;
        }
        this.lastReturned = (DualLinkNode) (var1);
        return var1;
    }

    SecondaryNodeDequeIterator(SecondaryNodeDeque param0) {
        this.lastReturned = null;
        try {
          this.deque = param0;
          this.nextNode = this.deque.sentinel.secondaryNext;
          this.lastReturned = null;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "jn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "Disarm self destruct";
    }
}
