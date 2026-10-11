/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ga {
    private int field_b;
    private int[] field_e;
    private int field_g;
    static int field_a;
    static int field_d;
    static int field_f;
    int field_c;

    final void a(int param0, String param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 != -18879) {
          return;
        }
        try {
          var3_int = this.field_b != 0 ? 65280 : 16762115;
          if (sh.field_f <= this.field_c) {
            fi.a(320, 332, 35, oc.field_S, var3_int);
          } else {
            var4 = this.field_c * 35 / 1000;
            var5 = var4 >> 1;
            fi.a(320, 349 - var5, var4, oc.field_S, var3_int);
            t.f(0, -var5 + 355, 640, var4 / 2 + 343);
          }
          rk.field_e.b(param1, 320, 360, 0, -1);
          t.c();
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ga.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, boolean param1) {
        if (param0 > -124) {
          return;
        }
        if (param1) {
          if (this.field_c >= sh.field_f) {
            return;
          }
          this.field_c = this.field_c + ap.field_a;
          if (sh.field_f >= this.field_c) {
            return;
          }
          this.field_c = sh.field_f;
          return;
        }
        if (this.field_c <= 0) {
          return;
        }
        this.field_c = this.field_c - ap.field_c;
        if (this.field_c < 0) {
          this.field_c = 0;
          return;
        }
    }

    final boolean a(int param0, int param1, int param2) {
        if (param2 >= -68) {
          return false;
        }
        if (param1 <= 170) {
          return false;
        }
        if (param1 >= 314) {
          return false;
        }
        if (this.field_g >= param0) {
          return false;
        }
        if (param0 < 144 + this.field_g) {
          return true;
        }
        return false;
    }

    final void a(byte param0) {
        this.field_c = 0;
        int var2 = -81 % ((21 - param0) / 63);
    }

    final void a(boolean param0) {
        if (param0) {
          this.field_c = -4;
          if (this.field_c <= 0) {
            if (this.field_c >= sh.field_f) {
              lg.field_d[this.field_b].b(this.field_g, 170);
              return;
            }
            lg.field_d[this.field_b].b(72 + this.field_g, 242, 0, this.field_c + 4096 - sh.field_f);
            return;
          }
          t.a(72 + this.field_g << 4, 3872, 600 + this.field_c, -1 + this.field_e.length, this.field_e);
          if (this.field_c >= sh.field_f) {
            lg.field_d[this.field_b].b(this.field_g, 170);
            return;
          }
          lg.field_d[this.field_b].b(72 + this.field_g, 242, 0, this.field_c + 4096 - sh.field_f);
          return;
        }
        if (this.field_c > 0) {
          t.a(72 + this.field_g << 4, 3872, 600 + this.field_c, -1 + this.field_e.length, this.field_e);
          if (this.field_c >= sh.field_f) {
            lg.field_d[this.field_b].b(this.field_g, 170);
            return;
          }
          lg.field_d[this.field_b].b(72 + this.field_g, 242, 0, this.field_c + 4096 - sh.field_f);
          return;
        }
        if (this.field_c >= sh.field_f) {
          lg.field_d[this.field_b].b(this.field_g, 170);
          return;
        }
        lg.field_d[this.field_b].b(72 + this.field_g, 242, 0, this.field_c + 4096 - sh.field_f);
    }

    final static rk a(int param0, int param1) {
        double var2 = 1.0;
        var2 = var2 + (((double)param0 - (double)param1) / 16.0 + ((double)ok.a(tg.field_f, -99, 7) - 3.0) / 10.0);
        return new rk(1 + ok.a(tg.field_f, param1 ^ -102, 14), 10, of.a(var2, 65536));
    }

    final static void a(int param0, int param1, int param2, int param3, ak param4, ak param5, byte[] param6, int param7, int param8, ak param9) {
        int var11 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var12 = 0;
        var12 = Pixelate.field_H ? 1 : 0;
        try {
          hn.field_f = -1L;
          oe.field_Rb = param6;
          um.field_k = param8;
          fj.field_b = param6.length;
          bn.field_S = null;
          rl.field_r = false;
          qm.field_J = new byte[(7 + um.field_k) / 8];
          io.field_c = null;
          var10_int = 0;
          for (var11 = 0; oe.field_Rb.length > var11; var11++) {
            var10_int = var10_int + (255 & oe.field_Rb[var11]);
          }
          var10_int = (7 + var10_int) / 8;
          k.field_k = new byte[var10_int];
          if (null == param5.field_L) {
            param5.field_L = new bb();
          }
          i.field_n = param5.field_L;
          i.field_n.e(param3 ^ -121);
          il.field_d = new vg(param1);
          ka.field_X = 0;
          ec.field_r = 0;
          gi.field_a = -1;
          ui.field_e = -1;
          if (param9.field_L == null) {
            param9.field_L = new bb();
          }
          nk.field_a = param9.field_L;
          nk.field_a.e(123);
          dg.field_f = new vg(param2);
          if (null == param4.field_L) {
            param4.field_L = new bb();
          }
          wi.field_a = param4.field_L;
          if (param3 != 3) {
            field_d = 20;
          }
          wi.field_a.e(param3 ^ 91);
          eh.field_f = new vg(param7);
          bo.field_e = 0L;
          mh.field_b = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_17_0 = var10;
          stackIn_17_1 = new StringBuilder().append("ga.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param5 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param6 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    ga(int param0, int param1, int[] param2) {
        try {
          this.field_b = param0;
          this.field_e = param2;
          this.field_g = param1;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ga.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = 0;
        field_a = field_d;
    }
}
