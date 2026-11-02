/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wa {
    private DualLinkNode field_c;
    static java.util.zip.CRC32 field_b;
    static int[] field_d;
    private DualLinkNode field_a;

    final DualLinkNode d(int param0) {
        int var3 = -97 / ((param0 - 73) / 51);
        DualLinkNode var2 = this.field_a;
        if (this.field_c != var2) {
          this.field_a = var2.field_t;
          return var2;
        }
        this.field_a = null;
        return null;
    }

    final DualLinkNode c(int param0) {
        DualLinkNode var2 = this.field_c.field_t;
        if (param0 != 8192) {
          this.b(-20);
          if (var2 != this.field_c) {
            var2.a((byte) -119);
            return var2;
          }
          return null;
        }
        if (var2 != this.field_c) {
          var2.a((byte) -119);
          return var2;
        }
        return null;
    }

    final DualLinkNode a(int param0) {
        int var2 = 13 / ((param0 - 24) / 52);
        DualLinkNode var3 = this.field_c.field_t;
        if (var3 == this.field_c) {
          this.field_a = null;
          return null;
        }
        this.field_a = var3.field_t;
        return var3;
    }

    final int b(int param0) {
        int var5 = MinerDisturbance.field_ab;
        int var2 = 0;
        int var4 = 119 / ((param0 - 25) / 53);
        DualLinkNode var3 = this.field_c.field_t;
        while (var3 != this.field_c) {
          var3 = var3.field_t;
          var2++;
        }
        return var2;
    }

    final void a(DualLinkNode param0, boolean param1) {
        if (param0.field_q != null) {
          param0.a((byte) -112);
        }
        if (param1) {
          return;
        }
        try {
          param0.field_t = this.field_c;
          param0.field_q = this.field_c.field_q;
          param0.field_q.field_t = param0;
          param0.field_t.field_q = param0;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "wa.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public wa() {
        this.field_c = new DualLinkNode();
        this.field_c.field_q = this.field_c;
        this.field_c.field_t = this.field_c;
    }

    public static void e(int param0) {
        field_b = null;
        if (param0 < 10) {
          field_b = (java.util.zip.CRC32) null;
          field_d = null;
          return;
        }
        field_d = null;
    }

    static {
        field_d = new int[8192];
        field_b = new java.util.zip.CRC32();
    }
}
