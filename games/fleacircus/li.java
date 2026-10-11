/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class li implements Iterable {
    static int field_i;
    static String field_e;
    static String field_d;
    lh[] field_f;
    private lh field_a;
    static String field_c;
    static String field_b;
    int field_g;
    static int field_j;
    static String field_h;

    public static void a(byte param0) {
        field_e = null;
        if (param0 >= -62) {
          return;
        }
        field_d = null;
        field_h = null;
        field_c = null;
        field_b = null;
    }

    final void a(long param0, lh param1, byte param2) {
        lh var5 = null;
        try {
          if (param2 != 43) {
            li.a((byte) -31);
          }
          if (null != param1.field_a) {
            param1.c(param2 ^ -44);
          }
          var5 = this.field_f[(int)((long)(this.field_g - 1) & param0)];
          param1.field_a = var5.field_a;
          param1.field_h = var5;
          param1.field_a.field_h = param1;
          param1.field_h.field_a = param1;
          param1.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "li.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(boolean param0, byte param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        int var2Lifetime2;
        var3 = fleas.field_A ? 1 : 0;
        if (wc.field_q > 0) {
          if (aa.field_r == null) {
            rh.field_p = wf.a(0, 640, 0, fg.field_q, 0, 480);
          } else {
            rh.field_p = aa.field_r.b(param1 - 7862);
            qa.a((byte) 116, 2);
          }
          if (rh.field_p == null) {
            var2 = 3;
          } else {
            var2 = 2;
            aj.a(0, rh.field_p);
          }
          if (param1 != -74) {
            return;
          }
          if (null != aa.field_r) {
            return;
          }
          if (sc.field_a) {
            pf.a(var2, 1, param0);
          }
          return;
        }
        if (!qh.c((byte) 71)) {
          var2Lifetime1 = 1;
          if (param1 != -74) {
            return;
          }
          if (null != aa.field_r) {
            return;
          }
          if (!sc.field_a) {
            return;
          }
          pf.a(var2Lifetime1, 1, param0);
          return;
        }
        var2Lifetime2 = 0;
        if (param1 != -74) {
          return;
        }
        if (null != aa.field_r) {
          return;
        }
        if (!sc.field_a) {
          return;
        }
        pf.a(var2Lifetime2, 1, param0);
    }

    private li() throws Throwable {
        throw new Error();
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new na(this));
    }

    final lh a(boolean param0, long param1) {
        lh var4;
        lh var5;
        int var6;
        var6 = fleas.field_A ? 1 : 0;
        if (!param0) {
          return (lh) null;
        }
        var4 = this.field_f[(int)(param1 & (long)(this.field_g - 1))];
        this.field_a = var4.field_h;
        while (true) {
          if (var4 == this.field_a) {
            this.field_a = null;
            return null;
          }
          if (this.field_a.field_c != param1) {
            this.field_a = this.field_a.field_h;
            continue;
          }
          break;
        }
        var5 = this.field_a;
        this.field_a = this.field_a.field_h;
        return var5;
    }

    static {
        field_c = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_b = "FULL ACCESS";
        field_e = "Loading graphics";
        field_h = "Waiting for extra data";
        field_j = 2;
    }
}
