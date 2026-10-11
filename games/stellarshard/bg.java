/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bg implements Iterable {
    ah field_b;
    static th field_c;
    static wb field_a;

    private bg() throws Throwable {
        throw new Error();
    }

    final ah b(byte param0) {
        ah var2 = this.field_b.field_m;
        if (this.field_b != var2) {
          int var3 = 65 / ((0 - param0) / 47);
          var2.c((byte) 36);
          return var2;
        }
        return null;
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 > -74) {
          field_c = (th) null;
          field_c = null;
          return;
        }
        field_c = null;
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5) {
        int stackIn_8_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_57_0 = 0;
        int var6;
        int var7;
        String var8;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        String var8Lifetime1;
        ge.field_n[fh.field_b] = param5;
        fj.field_b[fh.field_b] = fh.field_b;
        se.field_B[fh.field_b] = param1;
        if (param1 < ta.field_q) {
          af.field_k = param1;
          if (param0 >= 73) {
            if (param1 > oe.field_c) {
              ce.field_b = param1;
            }
            qf.field_g[fh.field_b] = param4;
            wb.field_e[fh.field_b] = param3;
            vc.field_f[fh.field_b] = param2;
            var6 = param4 - (-param3 - param2);
            if (var6 != 0) {
              stackIn_8_0 = 1000 * param4 / var6;
            } else {
              stackIn_8_0 = 0;
            }
            var7 = stackIn_8_0;
          } else {
            var8 = (String) null;
            bg.a(-95, -87, 106, 102, (ej) null, 54, (String) null, 31, -43);
            if (param1 > oe.field_c) {
              ce.field_b = param1;
            }
            qf.field_g[fh.field_b] = param4;
            wb.field_e[fh.field_b] = param3;
            vc.field_f[fh.field_b] = param2;
            var6 = param4 - (-param3 - param2);
            if (var6 != 0) {
              stackIn_24_0 = 1000 * param4 / var6;
            } else {
              stackIn_24_0 = 0;
            }
            var7 = stackIn_24_0;
          }
          vh.field_h[fh.field_b] = var7;
          if (ce.field_b < var7) {
            ce.field_b = var7;
          }
          fh.field_b = fh.field_b + 1;
          if (af.field_k > var7) {
            af.field_k = var7;
          }
          return;
        }
        if (param0 >= 73) {
          if (param1 > oe.field_c) {
            ce.field_b = param1;
          }
          qf.field_g[fh.field_b] = param4;
          wb.field_e[fh.field_b] = param3;
          vc.field_f[fh.field_b] = param2;
          var6Lifetime1 = param4 - (-param3 - param2);
          if (var6Lifetime1 != 0) {
            stackIn_57_0 = 1000 * param4 / var6Lifetime1;
          } else {
            stackIn_57_0 = 0;
          }
          var7Lifetime1 = stackIn_57_0;
          vh.field_h[fh.field_b] = var7Lifetime1;
          if (ce.field_b < var7Lifetime1) {
            ce.field_b = var7Lifetime1;
          }
          fh.field_b = fh.field_b + 1;
          if (af.field_k > var7Lifetime1) {
            af.field_k = var7Lifetime1;
          }
          return;
        }
        var8Lifetime1 = (String) null;
        bg.a(-95, -87, 106, 102, (ej) null, 54, (String) null, 31, -43);
        if (param1 > oe.field_c) {
          ce.field_b = param1;
        }
        qf.field_g[fh.field_b] = param4;
        wb.field_e[fh.field_b] = param3;
        vc.field_f[fh.field_b] = param2;
        var6Lifetime2 = param4 - (-param3 - param2);
        if (var6Lifetime2 != 0) {
          stackIn_41_0 = 1000 * param4 / var6Lifetime2;
        } else {
          stackIn_41_0 = 0;
        }
        var7Lifetime2 = stackIn_41_0;
        vh.field_h[fh.field_b] = var7Lifetime2;
        if (ce.field_b < var7Lifetime2) {
          ce.field_b = var7Lifetime2;
        }
        fh.field_b = fh.field_b + 1;
        if (af.field_k > var7Lifetime2) {
          af.field_k = var7Lifetime2;
        }
        return;
    }

    final static void a(int param0, int param1, int param2, int param3, ej param4, int param5, String param6, int param7, int param8) {
        try {
          n.field_d = param1;
          ld.field_C = param2;
          ll.field_b = param3;
          fd.field_nb = param5;
          sk.field_b = param7;
          l.field_b = param8;
          vc.field_g = param6;
          fa.field_p = param4;
          if (param0 < 39) {
            byte[] var10 = (byte[]) null;
            bg.a(7, (byte[]) null, -15);
          }
          od.field_v = (fb) ((Object) new wj());
          ib.field_k = new rk(param4);
          mc.field_c = new vh(od.field_v, ib.field_k);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "bg.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new s(this));
    }

    final static int a(int param0, byte[] param1, int param2) {
        RuntimeException var3 = null;
        byte[] var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 0) {
            var4 = (byte[]) null;
            bg.a(-89, (byte[]) null, 45);
          }
          stackIn_3_0 = jj.a(0, param1, param0, -64);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("bg.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(boolean param0, ah param1) {
        try {
          if (param1.field_l != null) {
            param1.c((byte) 36);
          }
          if (!param0) {
            ah var4 = (ah) null;
            this.a(false, (ah) null);
          }
          param1.field_m = this.field_b;
          param1.field_l = this.field_b.field_l;
          param1.field_l.field_m = param1;
          param1.field_m.field_l = param1;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "bg.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = new th();
        field_a = new wb();
    }
}
