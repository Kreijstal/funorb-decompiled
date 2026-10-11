/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class im implements Iterable {
    int field_g;
    static int[] field_h;
    hl[] field_j;
    static volatile int field_e;
    static byte[] field_i;
    static hj field_b;
    static hj field_k;
    static String field_f;
    static int field_a;
    static long field_c;
    private hl field_d;

    final void a(byte param0, hl param1, long param2) {
        hl var5 = null;
        try {
          if (param1.field_a != null) {
            param1.d(0);
          }
          var5 = this.field_j[(int)(param2 & (long)(-1 + this.field_g))];
          param1.field_a = var5.field_a;
          param1.field_h = var5;
          param1.field_a.field_h = param1;
          param1.field_f = param2;
          if (param0 != 27) {
            im.a(114);
          }
          param1.field_h.field_a = param1;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "im.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final hl a(long param0, int param1) {
        hl var4;
        int var5_int;
        hl var5;
        int var6;
        var6 = HoldTheLine.field_D;
        var4 = this.field_j[(int)((long)(this.field_g - 1) & param0)];
        this.field_d = var4.field_h;
        while (true) {
          if (this.field_d == var4) {
            this.field_d = null;
            var5_int = 104 / ((param1 - 83) / 36);
            return null;
          }
          if (~param0 != ~this.field_d.field_f) {
            this.field_d = this.field_d.field_h;
            continue;
          }
          break;
        }
        var5 = this.field_d;
        this.field_d = this.field_d.field_h;
        return var5;
    }

    public static void a(int param0) {
        int var1 = -60 / ((param0 - 29) / 46);
        field_i = null;
        field_k = null;
        field_b = null;
        field_f = null;
        field_h = null;
    }

    final static boolean a(ee param0, ee param1, int param2) {
        boolean stackIn_19_0 = false;
        boolean stackIn_22_0 = false;
        boolean stackIn_27_0 = false;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (!param0.field_z) {
            return false;
          }
          if (!param1.field_z) {
            return false;
          }
          if (-param1.field_q + param0.field_q <= 1 &&
            -1 <= -param1.field_q + param0.field_q) {
            if ((param1.field_B + param0.field_B) * (param0.field_B + param1.field_B) < (-param0.field_A.field_f + param1.field_A.field_f) * (param1.field_A.field_f - param0.field_A.field_f) + (-param0.field_A.field_h + param1.field_A.field_h) * (-param0.field_A.field_h + param1.field_A.field_h)) {
              return false;
            }
            if (param2 != 32758) {
              return true;
            }
            if (param0.field_p &&
              param1.field_p) {
              stackIn_19_0 = l.a(0, param0.field_i, param1.field_k, param0.field_k, param0.field_w, param1.field_i, param0.field_A, param1.field_w, param1.field_A);
              return stackIn_19_0;
            }
            if (param0.field_p) {
              stackIn_22_0 = ca.a(param1.field_A, param0.field_i, param0.field_A, param1.field_B, param0.field_w, param0.field_k, 107);
              return stackIn_22_0;
            }
            if (param1.field_p) {
              stackIn_27_0 = ca.a(param0.field_A, param1.field_i, param1.field_A, param0.field_B, param1.field_w, param1.field_k, 109);
              return stackIn_27_0;
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("im.E(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, th param1) {
        int var2_int = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        try {
          si.field_jb = param1.k(-70) << 5;
          var2_int = param1.f((byte) -28);
          ef.field_b = var2_int << 18 & 1835008;
          si.field_jb = si.field_jb + (var2_int >> 3);
          ef.field_b = ef.field_b + (param1.k(-125) << 2);
          var2_intLifetime1 = param1.f((byte) -48);
          ae.field_a = var2_intLifetime1 << 15 & 2064384;
          ef.field_b = ef.field_b + (var2_intLifetime1 >> 6);
          ae.field_a = ae.field_a + (param1.f((byte) -117) << 7);
          var2_intLifetime2 = param1.f((byte) -97);
          ae.field_a = ae.field_a + (var2_intLifetime2 >> 1);
          dk.field_l = (1 & var2_intLifetime2) << 16;
          if (param0 <= 70) {
            field_k = (hj) null;
          }
          dk.field_l = dk.field_l + param1.k(82);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "im.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private im() throws Throwable {
        throw new Error();
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new nc(this));
    }

    static {
        field_e = 0;
        field_c = 0L;
        field_f = "(green)";
    }
}
