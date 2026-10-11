/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hc extends ng {
    static ka[] field_T;
    static boolean field_Q;
    static volatile long field_R;
    static int field_S;
    static k field_P;
    static int field_O;

    hc(String param0, gg param1, boolean param2) {
        this(param0, param1);
        try {
          this.field_D = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "hc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        fe var8 = ia.field_i[param3][param5][param2];
        int var9 = qk.a(param3, param7, param6, param2, 125, param1, param5, param4);
        if (param0 < 20) {
          hc.d((byte) -55);
        }
        if (var9 <= 0) {
          return;
        }
        if (var8 == null) {
          return;
        }
        ol.a(-120, var8, var9);
    }

    final static void a(uf param0, byte param1) {
        try {
          int var4 = 0;
          byte[] var2 = null;
          int var3_int = 0;
          Exception var3 = null;
          int var5 = 0;
          byte[] var6 = null;
          RuntimeException stackIn_20_0 = null;
          StringBuilder stackIn_20_1 = null;
          String stackIn_21_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var2_ref = null;
          var5 = TorChallenge.field_F ? 1 : 0;
          try {
            if (param1 != -13) {
              field_S = 50;
            }
            var6 = new byte[24];
            var2 = var6;
            if (null != cf.field_d) {
              try {
                cf.field_d.a(0L, 0);
                cf.field_d.a((byte) -128, var6);
                for (var3_int = 0; var3_int < 24; var3_int++) {
                  if (var2[var3_int] == 0) {
                    continue;
                  }
                  break;
                }
                if (24 <= var3_int) {
                  throw new IOException();
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3 = (Exception) (Object) decompiledCaughtException;
                for (var4 = 0; 24 > var4; var4++) {
                  var2[var4] = (byte)-1;
                }
              }
              param0.a(24, 0, var2, -16384);
            } else {
              param0.a(24, 0, var2, -16384);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_20_0 = var2_ref;
            stackIn_20_1 = new StringBuilder().append("hc.AA(");
            if (param0 == null) {
              stackIn_21_2 = "null";
            } else {
              stackIn_21_2 = "{...}";
            }
            throw oj.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, ka param8) {
        dd.field_u = param5;
        vk.field_d = param8;
        rl.field_f = param3;
        pi.field_b = param6;
        if (param1 < 86) {
          return;
        }
        try {
          si.field_J = param0;
          fd.field_f = param4;
          vk.field_k = param7;
          bh.field_t = param2;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "hc.EA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    final static void d(byte param0) {
        int var8_int = 0;
        String[][] dupTemp$0 = null;
        long[][] dupTemp$1 = null;
        int[][] dupTemp$2 = null;
        int var19 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        ae var4_ref_ae = null;
        int var5 = 0;
        ji var6 = null;
        int var6_int = 0;
        int var7 = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        pa var28 = null;
        int var3Lifetime1;
        int var25Lifetime1;
        int var25Lifetime2;
        var26 = TorChallenge.field_F ? 1 : 0;
        try {
          var28 = id.field_b;
          var2 = var28.j(-105);
          if (param0 != -117) {
            hc.c((byte) -46);
          }
          if (var2 == 0) {
            var3 = var28.c(false);
            var4_ref_ae = (ae) (bk.field_t.c((byte) -110));
            while (var4_ref_ae != null) {
              if (var4_ref_ae.field_o != var3) {
                var4_ref_ae = (ae) (bk.field_t.c(-270));
                continue;
              }
              break;
            }
            if (var4_ref_ae == null) {
              ob.b(-127);
              return;
            }
            var5 = var28.j(-127);
            if (var5 != 0) {
              var6_int = var4_ref_ae.field_r;
              ph.field_b[0].field_e = false;
              var7 = var4_ref_ae.field_q;
              ph.field_b[0].field_g = mf.field_a;
              ph.field_b[0].field_a = null;
              for (var8_int = 1; var5 > var8_int; var8_int++) {
                ph.field_b[var8_int].field_g = var28.b(false);
                ph.field_b[var8_int].field_e = false;
                if (var28.j(-121) == 1) {
                  ph.field_b[var8_int].field_a = var28.b(false);
                } else {
                  ph.field_b[var8_int].field_a = null;
                }
              }
              dupTemp$0 = new String[3][var6_int];
              var4_ref_ae.field_i = dupTemp$0;
              var8 = dupTemp$0;
              var9 = new String[3][var6_int];
              dupTemp$1 = new long[3][var6_int];
              var4_ref_ae.field_t = dupTemp$1;
              var10 = dupTemp$1;
              dupTemp$2 = new int[3][var7 * var6_int];
              var4_ref_ae.field_l = dupTemp$2;
              var11 = dupTemp$2;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              var16 = 0;
              var17 = 0;
              var18 = var28.j(param0 + 25);
              if (0 < var18) {
                for (var19 = 0; var19 < var18; var19++) {
                  var20 = var28.j(-85);
                  var21 = ph.field_b[var20].field_g;
                  var22 = var28.k(-120);
                  var24 = var28.field_q;
                  if (var19 < var6_int) {
                    var8[0][var12] = var21;
                    var9[0][var12] = ph.field_b[var20].field_a;
                    var10[0][var12] = var22;
                    var12++;
                    for (var25 = 0; var7 > var25; var25++) {
                      incrementValue$3 = var15;
                      var15++;
                      var11[0][incrementValue$3] = var28.i(51);
                    }
                  }
                  if (var21 != null &&
                    jc.a(var21, 26691)) {
                    var8[1][var13] = mf.field_a;
                    var9[1][var13] = null;
                    var10[1][var13] = var22;
                    var13++;
                    var28.field_q = var24;
                    for (var25Lifetime1 = 0; var25Lifetime1 < var7; var25Lifetime1++) {
                      incrementValue$4 = var16;
                      var16++;
                      var11[1][incrementValue$4] = var28.i(46);
                    }
                  }
                  if (var6_int > var14 &&
                    !ph.field_b[var20].field_e) {
                    ph.field_b[var20].field_e = true;
                    var8[2][var14] = var21;
                    var9[2][var14] = ph.field_b[var20].field_a;
                    var10[2][var14] = var22;
                    var14++;
                    var28.field_q = var24;
                    for (var25Lifetime2 = 0; var7 > var25Lifetime2; var25Lifetime2++) {
                      incrementValue$5 = var17;
                      var17++;
                      var11[2][incrementValue$5] = var28.i(param0 + 158);
                    }
                  }
                }
              }
            }
            var4_ref_ae.field_n = true;
            var4_ref_ae.a(true);
            return;
          }
          if (var2 == 1) {
            var3Lifetime1 = var28.c(false);
            var4 = var28.k(param0 ^ 95);
            var6 = (ji) (wf.field_g.c((byte) 1));
            while (var6 != null) {
              if (var6.field_l != var3Lifetime1) {
                var6 = (ji) (wf.field_g.c(-270));
                continue;
              }
              break;
            }
            if (var6 == null) {
              ob.b(-99);
              return;
            }
            var6.field_x = var4;
            var6.a(true);
            return;
          }
          td.a("HS1: " + ck.a(param0 - 13182), (Throwable) null, (byte) -92);
          ob.b(-89);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "hc.BA(" + param0 + ')');
        }
    }

    private hc(String param0, gg param1) {
        this(param0, kl.field_e.field_f, param1);
        try {
          this.field_q = kl.field_e.field_l;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "hc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_T = null;
        field_P = null;
        if (param0 > -23) {
          field_P = (k) null;
        }
    }

    final static boolean c(byte param0) {
        int var1;
        boolean stackIn_7_0 = false;
        boolean decompiledFrameRemainder0 = true;
        var1 = -73 % ((param0 + 52) / 54);
        if (li.field_K >= 20 &&
          ih.f((byte) -108) && (!(0 < uk.field_H) ||
          mf.a((byte) -119))) {
          stackIn_7_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_7_0 = true;
        }
        return stackIn_7_0;
    }

    private hc(String param0, j param1, gg param2) {
        super(param0, param1, param2);
        try {
          this.field_q = kl.field_e.field_l;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "hc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        this.field_D = !this.field_D ? true : false;
        super.a(param0, param1 ^ 0, param2, param3);
        if (param1 != -13461) {
          field_Q = true;
        }
    }

    static {
        field_Q = false;
        field_R = 0L;
        field_P = new k(7, 0, 1, 1);
    }
}
