/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mi extends nm {
    static wg field_q;
    static Calendar field_u;
    static int field_v;
    jc field_x;
    static String[] field_t;
    static String field_n;
    private vl field_w;
    lb field_p;
    static String field_o;
    static int field_r;
    static int[] field_s;

    private final void a(int param0, int param1, qd param2) {
        vl stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        qd stackIn_7_2 = null;
        boolean stackIn_8_3;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          if ((this.field_w.field_Q[param2.field_n] & 4) != 0 &&
            param2.field_J < 0) {
            var4_int = this.field_w.field_E[param2.field_n] / md.field_l;
            var5 = (var4_int + (1048575 - param2.field_x)) / var4_int;
            param2.field_x = param1 * var4_int + param2.field_x & 1048575;
            if (param1 >= var5) {
              if (0 == this.field_w.field_r[param2.field_n]) {
                param2.field_j = na.a(param2.field_H, param2.field_j.k(), param2.field_j.j(), param2.field_j.l());
              } else {
                param2.field_j = na.a(param2.field_H, param2.field_j.k(), 0, param2.field_j.l());
                stackIn_7_0 = this.field_w;
                stackIn_7_1 = -76;
                stackIn_7_2 = (qd) (param2);
                stackIn_8_3 = !(param2.field_q.field_p[param2.field_C] >= 0);
                ((vl) (Object) stackIn_7_0).a((byte) stackIn_7_1, stackIn_7_2, stackIn_8_3);
              }
              if (0 > param2.field_q.field_p[param2.field_C]) {
                param2.field_j.f(-1);
              }
              param1 = param2.field_x / var4_int;
            }
          }
          param2.field_j.a(param1);
          if (param0 > 23) {
            return;
          }
          field_v = -9;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("mi.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    private final void a(qd param0, int param1, int param2, int param3, int param4, int[] param5) {
        vl stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        qd stackIn_13_2 = null;
        boolean stackIn_14_3;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        na var11 = null;
        int var12 = 0;
        var12 = Chess.field_G;
        try {
          if ((this.field_w.field_Q[param0.field_n] & 4) != 0 &&
            param0.field_J < 0) {
            var7_int = this.field_w.field_E[param0.field_n] / md.field_l;
            while (true) {
              var8 = (-param0.field_x + (var7_int + 1048575)) / var7_int;
              if (var8 > param3) {
                param0.field_x = param0.field_x + var7_int * param3;
                break;
              }
              param0.field_j.a(param5, param2, var8);
              param2 = param2 + var8;
              param3 = param3 - var8;
              param0.field_x = param0.field_x + (-1048576 + var8 * var7_int);
              var9 = md.field_l / 100;
              var10 = 262144 / var7_int;
              if (var10 < var9) {
                var9 = var10;
              }
              var11 = param0.field_j;
              if (this.field_w.field_r[param0.field_n] == 0) {
                param0.field_j = na.a(param0.field_H, var11.k(), var11.j(), var11.l());
              } else {
                param0.field_j = na.a(param0.field_H, var11.k(), 0, var11.l());
                stackIn_13_0 = this.field_w;
                stackIn_13_1 = -71;
                stackIn_13_2 = (qd) (param0);
                stackIn_14_3 = !(0 <= param0.field_q.field_p[param0.field_C]);
                ((vl) (Object) stackIn_13_0).a((byte) stackIn_13_1, stackIn_13_2, stackIn_14_3);
                param0.field_j.b(var9, var11.j());
              }
              if (0 > param0.field_q.field_p[param0.field_C]) {
                param0.field_j.f(-1);
              }
              var11.d(var9);
              var11.a(param5, param2, -param2 + param1);
              if (!var11.g()) {
                continue;
              }
              this.field_p.a(var11);
            }
          }
          if (param4 != -2771) {
            this.field_p = (lb) null;
          }
          param0.field_j.a(param5, param2, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_28_0 = var7;
          stackIn_28_1 = new StringBuilder().append("mi.D(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final void a(int[] param0, int param1, int param2) {
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        qd var6 = null;
        int var7 = 0;
        var7 = Chess.field_G;
        try {
          this.field_p.a(param0, param1, param2);
          var6 = (qd) (this.field_x.g(-18110));
          while (var6 != null) {
            stackIn_4_0 = this.field_w.a((byte) -25, var6);
            boolean decompiledFrameCompleted0 = true;
            if (!stackIn_4_0) {
              var4_int = param1;
              var5 = param2;
              while (var5 > var6.field_B) {
                this.a(var6, var4_int + var5, var4_int, var6.field_B, -2771, param0);
                var4_int = var4_int + var6.field_B;
                var5 = var5 - var6.field_B;
                if (this.field_w.a(35, var5, param0, var4_int, var6)) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted0) {
                this.a(var6, var4_int + var5, var4_int, var5, -2771, param0);
                var6.field_B = var6.field_B - var5;
              }
            }
            var6 = (qd) (this.field_x.a((byte) -112));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("mi.A(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static r a(int param0, long param1) {
        if (param0 != 134217727) {
          field_o = (String) null;
          return (r) (cm.field_v.a(param1, 3000));
        }
        return (r) (cm.field_v.a(param1, 3000));
    }

    final static void a(byte param0, boolean param1) {
        int stackIn_5_0;
        int stackIn_5_1;
        int stackIn_5_2;
        int stackIn_5_3;
        boolean stackIn_5_4;
        int stackIn_5_5;
        int stackIn_5_6;
        int stackIn_5_7;
        boolean stackIn_6_8 = false;
        int stackIn_9_9;
        boolean stackIn_9_10;
        boolean stackIn_11_11 = false;
        int stackIn_21_0;
        int stackIn_21_1;
        int stackIn_21_2;
        int stackIn_21_3;
        boolean stackIn_21_4;
        int stackIn_21_5;
        int stackIn_21_6;
        int stackIn_21_7;
        boolean stackIn_22_8 = false;
        int stackIn_25_9;
        boolean stackIn_25_10;
        boolean stackIn_27_11 = false;
        int stackIn_36_0;
        int stackIn_36_1;
        int stackIn_36_2;
        int stackIn_36_3;
        boolean stackIn_36_4;
        int stackIn_36_5;
        int stackIn_36_6;
        int stackIn_36_7;
        boolean stackIn_37_8 = false;
        int stackIn_40_9;
        boolean stackIn_40_10;
        boolean stackIn_42_11 = false;
        int var2;
        nc.i(20579);
        if (param0 != -78) {
          mi.a((byte) 66, true);
        }
        if (pd.field_Rb == null) {
          var2 = 0;
          stackIn_5_0 = param0 - 46;
          stackIn_5_1 = 15;
          stackIn_5_2 = 14;
          stackIn_5_3 = 11;
          stackIn_5_4 = param1;
          stackIn_5_5 = fl.field_p;
          stackIn_5_6 = 13;
          stackIn_5_7 = 0;
          stackIn_6_8 = (50 >= fl.field_n) ? false : true;
          stackIn_9_9 = var2;
          stackIn_9_10 = true;
          stackIn_11_11 = (hj.field_i) || (hl.field_h);
          bh.a(stackIn_5_0, stackIn_5_1, stackIn_5_2, stackIn_5_3, stackIn_5_4, stackIn_5_5, stackIn_5_6, stackIn_5_7, stackIn_6_8, stackIn_9_9 != 0, stackIn_9_10, stackIn_11_11);
        } else {
          if (g.a(param0 + 77, pd.field_Rb.field_Xb)) {
            var2 = 1;
            stackIn_36_0 = param0 - 46;
            stackIn_36_1 = 15;
            stackIn_36_2 = 14;
            stackIn_36_3 = 11;
            stackIn_36_4 = param1;
            stackIn_36_5 = fl.field_p;
            stackIn_36_6 = 13;
            stackIn_36_7 = 0;
            stackIn_37_8 = (50 >= fl.field_n) ? false : true;
            stackIn_40_9 = var2;
            stackIn_40_10 = true;
            stackIn_42_11 = (hj.field_i) || (hl.field_h);
            bh.a(stackIn_36_0, stackIn_36_1, stackIn_36_2, stackIn_36_3, stackIn_36_4, stackIn_36_5, stackIn_36_6, stackIn_36_7, stackIn_37_8, stackIn_40_9 != 0, stackIn_40_10, stackIn_42_11);
            if (ob.field_w) {
              qn.field_U.f(57, param0 ^ 28);
              ob.field_w = false;
            }
            if (!tg.field_p) {
              return;
            }
            qn.field_U.f(10, -68);
            tg.field_p = false;
            return;
          }
          var2 = 0;
          stackIn_21_0 = param0 - 46;
          stackIn_21_1 = 15;
          stackIn_21_2 = 14;
          stackIn_21_3 = 11;
          stackIn_21_4 = param1;
          stackIn_21_5 = fl.field_p;
          stackIn_21_6 = 13;
          stackIn_21_7 = 0;
          stackIn_22_8 = (50 >= fl.field_n) ? false : true;
          stackIn_25_9 = var2;
          stackIn_25_10 = true;
          stackIn_27_11 = (hj.field_i) || (hl.field_h);
          bh.a(stackIn_21_0, stackIn_21_1, stackIn_21_2, stackIn_21_3, stackIn_21_4, stackIn_21_5, stackIn_21_6, stackIn_21_7, stackIn_22_8, stackIn_25_9 != 0, stackIn_25_10, stackIn_27_11);
        }
        if (ob.field_w) {
          qn.field_U.f(57, param0 ^ 28);
          ob.field_w = false;
        }
        if (!tg.field_p) {
          return;
        }
        qn.field_U.f(10, -68);
        tg.field_p = false;
    }

    final int d() {
        return 0;
    }

    public static void c(byte param0) {
        field_t = null;
        field_o = null;
        field_s = null;
        field_q = null;
        field_n = null;
        field_u = null;
        if (param0 < 42) {
          mi.a((byte) -41, true);
          return;
        }
    }

    final nm a() {
        qd var1 = (qd) (this.field_x.g(-18110));
        if (var1 == null) {
          return null;
        }
        if (var1.field_j == null) {
          return this.b();
        }
        return (nm) ((Object) var1.field_j);
    }

    final nm b() {
        qd var1_ref = null;
        int var2 = Chess.field_G;
        do {
          var1_ref = (qd) (this.field_x.a((byte) -125));
          if (var1_ref == null) {
            return null;
          }
        } while (var1_ref.field_j == null);
        return (nm) ((Object) var1_ref.field_j);
    }

    final void a(int param0) {
        int var2;
        qd var3;
        int var4;
        var4 = Chess.field_G;
        this.field_p.a(param0);
        var3 = (qd) (this.field_x.g(-18110));
        while (var3 != null) {
          if (!this.field_w.a((byte) -25, var3)) {
            var2 = param0;
            do {
              if (var2 <= var3.field_B) {
                this.a(32, var2, var3);
                var3.field_B = var3.field_B - var2;
                break;
              }
              this.a(54, var3.field_B, var3);
              var2 = var2 - var3.field_B;
            } while (!this.field_w.a(35, var2, (int[]) null, 0, var3));
          }
          var3 = (qd) (this.field_x.a((byte) -127));
        }
    }

    mi(vl param0) {
        this.field_x = new jc();
        this.field_p = new lb();
        try {
          this.field_w = param0;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "mi.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = "New Game";
        field_v = 0;
        field_u = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_r = 0;
        field_o = "Your email address is used to identify this account";
        field_s = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
