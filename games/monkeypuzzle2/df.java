/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class df extends wj {
    static String field_o;
    static le[] field_q;
    private rj field_n;
    static ad field_p;
    private rj field_r;

    final static void f(int param0) {
        int var1_int = 0;
        int var2 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (param0 != 18180) {
            df.f((byte) -8);
          }
          ge.h(80, 0, 560, 480);
          for (var1_int = 0; fg.field_a > var1_int; var1_int++) {
            if (n.field_d[var1_int][0] > 0.0f) {
              cc.field_a[ul.field_O[var1_int]][hh.field_r[var1_int]].c((int)pl.field_f[var1_int][0], (int)pl.field_f[var1_int][1]);
            } else {
              cc.field_a[ul.field_O[var1_int]][hh.field_r[var1_int]].f((int)pl.field_f[var1_int][0], (int)pl.field_f[var1_int][1]);
            }
          }
          ge.h(0, 0, 640, 480);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "df.BA(" + param0 + ')');
        }
    }

    final static void h(int param0) {
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var1_int = -126 / ((param0 - 64) / 47);
          var2 = cl.field_g;
          var3 = 0;
          var4 = var2.length;
          while (var3 < var4) {
            var2[var3++] = 0;
            var2[var3++] = 0;
            var2[var3++] = 0;
            var2[var3++] = 0;
            var2[var3++] = 0;
            var2[var3++] = 0;
            var2[var3++] = 0;
            var2[var3++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "df.C(" + param0 + ')');
        }
    }

    final static void e(int param0) {
        if (!ha.field_db) {
          throw new IllegalStateException();
        }
        cf.field_c = true;
        hl.a((byte) -60, false);
        int var1 = -79 % ((21 - param0) / 46);
        k.field_g = 0;
    }

    df(rj param0, rj param1, rj param2) {
        super(param0);
        try {
          this.field_r = param2;
          this.field_n = param1;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "df.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(int param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_18_0 = null;
        String stackIn_23_0 = null;
        String stackIn_27_0 = null;
        String stackIn_31_0 = null;
        String stackIn_33_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = this.field_n.field_s.toLowerCase();
          var4 = param1.toLowerCase();
          if (var4.length() == 0) {
            return null;
          }
          if (param0 != 1) {
            stackIn_5_0 = (String) null;
            return stackIn_5_0;
          }
          var5 = var4;
          if (tl.a(0, var5)) {
            stackIn_8_0 = dd.field_a;
            return stackIn_8_0;
          }
          if (bg.a(param0 ^ 4827, var5)) {
            stackIn_11_0 = qi.field_E;
            return stackIn_11_0;
          }
          if (sg.a(var5, false)) {
            stackIn_14_0 = eb.field_E;
            return stackIn_14_0;
          }
          if (this.a((byte) 119, param1)) {
            stackIn_18_0 = ad.field_d;
            return stackIn_18_0;
          }
          if (var6.length() <= 0) {
            stackIn_33_0 = pb.field_i;
            return stackIn_33_0;
          }
          if (qj.a(var5, false, var6)) {
            stackIn_23_0 = fc.field_b;
            return stackIn_23_0;
          }
          if (ue.a(var5, var6, (byte) 66)) {
            stackIn_27_0 = ck.field_d;
            return stackIn_27_0;
          }
          if (!di.a(95, var6, var5)) {
            return dd.field_a;
          }
          stackIn_31_0 = fc.field_b;
          return stackIn_31_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_36_0 = var3;
          stackIn_36_1 = new StringBuilder().append("df.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    private final boolean a(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 50) {
            field_p = (ad) null;
          }
          var3 = this.field_r.field_s.toLowerCase();
          var4 = param1.toLowerCase();
          if (var3.length() > 0) {
            if (0 >= var4.length()) {
              return false;
            }
            var5 = var3.lastIndexOf("@");
            if (0 <= var5 &&
              var5 < -1 + var3.length()) {
              var6 = var3.substring(0, var5);
              var7 = var3.substring(1 + var5);
              if (var4.indexOf(var6) >= 0) {
                return true;
              }
              stackIn_14_0 = (0 <= var4.indexOf(var7));
              return stackIn_14_0;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("df.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static void a(gk param0, boolean param1) {
        try {
          int var4 = 0;
          byte[] var2 = null;
          int var3_int = 0;
          int var5 = 0;
          byte[] var6 = null;
          RuntimeException stackIn_22_0 = null;
          StringBuilder stackIn_22_1 = null;
          String stackIn_23_2 = null;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          RuntimeException var2_ref = null;
          Exception var3 = null;
          var5 = MonkeyPuzzle2.field_F ? 1 : 0;
          try {
            if (param1) {
              return;
            }
            var6 = new byte[24];
            var2 = var6;
            if (hj.field_D != null) {
              try {
                hj.field_D.a((byte) 101, 0L);
                hj.field_D.a(3805, var6);
                for (var3_int = 0; var3_int < 24; var3_int++) {
                  if (0 == var2[var3_int]) {
                    continue;
                  }
                  break;
                }
                if (24 <= var3_int) {
                  throw new IOException();
                }
                param0.b(var2, 24, -2, 0);
                decompiledRegionSelector0 = 0;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3 = (Exception) (Object) decompiledCaughtException;
                for (var4 = 0; var4 < 24; var4++) {
                  var2[var4] = (byte)-1;
                }
                decompiledRegionSelector0 = 1;
              }
              if (decompiledRegionSelector0 == 0) {
                return;
              }
            }
            param0.b(var2, 24, -2, 0);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_22_0 = var2_ref;
            stackIn_22_1 = new StringBuilder().append("df.G(");
            if (param0 == null) {
              stackIn_23_2 = "null";
            } else {
              stackIn_23_2 = "{...}";
            }
            throw la.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static ai a(String param0, ad param1, byte param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ai stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param1.c(param0, (byte) -105);
          var5 = param1.a(param3, var4_int, param2 ^ -28509);
          if (param2 != 118) {
            field_q = (le[]) null;
          }
          stackIn_3_0 = rd.a(var5, param1, var4_int, 1896);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("df.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void f(byte param0) {
        if (param0 > -17) {
          return;
        }
        ua.field_v = new pj();
    }

    final na a(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        na stackIn_4_0 = null;
        na stackIn_7_0 = null;
        na stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_n.field_s.toLowerCase();
          if (param1 != 3917) {
            df.f((byte) 86);
          }
          var4 = param0.toLowerCase();
          if (var4.length() == 0) {
            stackIn_4_0 = ol.field_h;
            return stackIn_4_0;
          }
          if (!ph.a(var3, -67, var4)) {
            stackIn_7_0 = ol.field_h;
            return stackIn_7_0;
          }
          if (!this.a((byte) 76, param0)) {
            return wj.field_i;
          }
          stackIn_11_0 = ol.field_h;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("df.B(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void g(int param0) {
        field_p = null;
        field_q = null;
        field_o = null;
        if (param0 != 0) {
          field_p = (ad) null;
        }
    }

    static {
    }
}
