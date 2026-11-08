/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class IterableDualLinkDeque implements Iterable {
    static UiLayoutNode field_b;
    DualLinkNode field_d;
    static IntrusiveDeque field_f;
    static UiLayoutNode field_h;
    static int field_a;
    static long field_c;
    static Sprite field_g;
    static String field_e;

    public final Iterator iterator() {
        return (Iterator) ((Object) new DualLinkDequeIterator(this));
    }

    final DualLinkNode pollFirst(byte param0) {
        DualLinkNode var2 = this.field_d.field_f;
        if (var2 == this.field_d) {
          return null;
        }
        var2.unlinkSecondary(-124);
        if (param0 == -120) {
          return var2;
        }
        field_a = 106;
        return var2;
    }

    final void addLast(int param0, DualLinkNode param1) {
        if (null != param1.field_e) {
          param1.unlinkSecondary(-81);
        }
        param1.field_f = this.field_d;
        if (param0 != -8545) {
          return;
        }
        try {
          param1.field_e = this.field_d.field_e;
          param1.field_e.field_f = param1;
          param1.field_f.field_e = param1;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ci.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    IterableDualLinkDeque() {
        this.field_d = new DualLinkNode();
        this.field_d.field_f = this.field_d;
        this.field_d.field_e = this.field_d;
    }

    final static void a(boolean param0) {
        int var2 = 0;
        int var1 = DiagnosticsOverlaySupport.b((byte) 46);
        if (!param0) {
          var2 = IntrusiveNode.d((byte) 101);
          TrinketCountSortCriterion.field_p.drawPanel(-ProxySocketConnector.field_f + GameQuickChatResolver.field_a, (mt.field_a << 1) + var2, ChatInputState.field_c - mt.field_a, (ProxySocketConnector.field_f << 1) + var1, 3);
          CheckboxPainter.a(0);
          return;
        }
    }

    public static void releaseStatics(int param0) {
        field_e = null;
        field_f = null;
        field_g = null;
        field_h = null;
        if (param0 > 4) {
          field_b = null;
          return;
        }
        field_f = (IntrusiveDeque) null;
        field_b = null;
    }

    static {
        field_f = new IntrusiveDeque();
        field_e = "concluded";
    }
}
