/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class f extends ji {
    private int field_G;
    private int field_z;
    static ve field_H;
    static int field_y;
    static long field_F;
    static int field_B;
    static String[] field_I;
    static String field_J;
    static String field_D;

    final static void a(long param0, int param1, int param2, jj param3, int param4, int param5, int param6, int param7, boolean param8, int param9, boolean param10, String param11, int param12, int param13) {
        try {
          RuntimeException stackIn_16_0 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          IOException var15 = null;
          RuntimeException var15_ref = null;
          try {
            id.field_f = new mi(param12);
            uh.field_Wb = new mi(param2);
            kr.field_g = param3;
            cl.field_d = param6;
            pl.field_i = param8;
            lm.field_G = param10;
            if (param13 != 6) {
              f.b(true);
            }
            nb.field_y = param11;
            nj.field_e = param4;
            ng.field_c = param1;
            bl.field_C = param9;
            ne.field_P = param5;
            kj.field_B = param7;
            ff.field_d = param0;
            if (null != kr.field_g.field_k) {
              try {
                as.field_d = new im(kr.field_g.field_k, 64, 0);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var15 = (IOException) (Object) decompiledCaughtException;
                throw new RuntimeException(var15.toString());
              }
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var15_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_16_0 = var15_ref;
            stackIn_16_1 = new StringBuilder().append("f.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
            if (param11 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw wn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param12).append(',').append(param13).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public f() {
        super(1, true);
        this.field_z = 0;
        this.field_G = 4096;
    }

    public static void b(byte param0) {
        int var1 = 14 % ((param0 - 5) / 51);
        field_D = null;
        field_J = null;
        field_I = null;
        field_H = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, String param5, int param6, boolean param7) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        try {
          if (param2 <= 107) {
            field_F = -27L;
          }
          if (bp.field_C.field_tb != 0 &&
            !pe.field_r) {
            if (hj.field_b) {
              g.a((byte) -10);
            } else {
              il.field_a = true;
            }
          }
          if (il.field_a) {
            ca.a(param1, param4, param6, param4, 20, param0, param5, 126, param3);
            gk.field_c.a(0, param7);
            if (param7) {
              if (0 != kk.field_a.field_tb) {
                il.field_a = false;
              }
              if (oa.field_s.field_tb != 0) {
                fb.h(0);
                il.field_a = false;
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_18_0 = var8;
          stackIn_18_1 = new StringBuilder().append("f.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final static int b(boolean param0) {
        if (param0) {
          f.g(-57);
          return sf.field_d;
        }
        return sf.field_d;
    }

    final static int g(int param0) {
        try {
          int stackIn_14_0 = 0;
          int stackIn_26_0 = 0;
          int stackIn_30_0 = 0;
          int stackIn_35_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          ed var2 = null;
          if (4 <= kb.field_e.field_m) {
            if (kb.field_e.field_j == -1) {
              return 3;
            }
            if (kb.field_e.field_j == -2) {
              return 4;
            }
            return 1;
          }
          try {
            if (param0 == al.field_t) {
              pq.field_f = or.field_f.a(param0 - 108, rf.field_l, lm.field_H);
              al.field_t = al.field_t + 1;
            }
            if (1 == al.field_t) {
              if (pq.field_f.field_b == 2) {
                stackIn_14_0 = pl.a((byte) 11, -1);
                return stackIn_14_0;
              }
              if (pq.field_f.field_b == 1) {
                al.field_t = al.field_t + 1;
              }
            }
            if (al.field_t == 2) {
              fn.field_y = new pm((java.net.Socket) (pq.field_f.field_d), or.field_f);
              var2 = new ed(13);
              jo.a(var2, od.field_Kb, qi.field_a, 124, il.field_h);
              var2.f(15, param0 - 85);
              var2.e(rf.field_q, 0);
              fn.field_y.a(0, 13, 127, var2.field_p);
              al.field_t = al.field_t + 1;
              pq.field_e = 30000L + gk.a(param0 + 60);
            }
            if (al.field_t == 3) {
              if (fn.field_y.a(15166) > 0) {
                var1_int = fn.field_y.a((byte) -113);
                if (0 != var1_int) {
                  stackIn_30_0 = pl.a((byte) 11, var1_int);
                  return stackIn_30_0;
                }
                al.field_t = al.field_t + 1;
              } else {
                if (pq.field_e < gk.a(param0 + 75)) {
                  stackIn_26_0 = pl.a((byte) 11, -2);
                  return stackIn_26_0;
                }
              }
            }
            if (al.field_t != 4) {
              return -1;
            }
            kb.field_e.a(fn.field_y, ni.field_f, -128);
            pq.field_f = null;
            fn.field_y = null;
            al.field_t = 0;
            stackIn_35_0 = 0;
            return stackIn_35_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return pl.a((byte) 11, -3);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int var6_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int[] var7 = null;
        int var8 = 0;
        var8 = Vertigo2.field_L ? 1 : 0;
        try {
          incrementValue$0 = param3;
          param3++;
          ki.a(-118, param1, vl.field_e[incrementValue$0], param0, param2);
          incrementValue$1 = param5;
          param5--;
          ki.a(param4 - 84, param1, vl.field_e[incrementValue$1], param0, param2);
          if (param4 != -8) {
            return;
          }
          for (var6_int = param3; var6_int <= param5; var6_int++) {
            var7 = vl.field_e[var6_int];
            var7[param0] = param2;
            var7[param1] = param2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var6), "f.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void c(byte param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = Vertigo2.field_L ? 1 : 0;
        try {
          if (!gf.a((byte) -105)) {
            if (null != dc.field_L &&
              dc.field_L.field_e) {
              cp.a((byte) 127);
              qb.field_d.b(new gr(qb.field_d, sd.field_I), 0);
            }
            return;
          }
          if (param0 != -6) {
            field_I = (String[]) null;
          }
          qb.field_d.a(qg.field_I, true, (byte) 115, oj.field_N);
          qb.field_d.l(0);
          while (gf.a(false)) {
            qb.field_d.a(-122, de.field_f, ji.field_r);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var1), "f.A(" + param0 + ')');
        }
    }

    final void a(byte param0, int param1, ed param2) {
        int var4_int = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        ed var5 = null;
        try {
          var4_int = param1;
          if (var4_int == 0) {
            this.field_z = param2.a((byte) -11);
          } else {
            if (var4_int == 1) {
              this.field_G = param2.a((byte) -11);
            }
          }
          if (param0 != 110) {
            var5 = (ed) null;
            this.a((byte) -51, 30, (ed) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("f.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final int[] c(int param0, int param1) {
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_13_2 = 0;
        int[] stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_24_2 = 0;
        int[] var3;
        int[] var4;
        int var5;
        int var6;
        int var7;
        int[] var8;
        int[] var9;
        int[] var11;
        int var5Lifetime1;
        int var6Lifetime1;
        int[] var3Lifetime1;
        int[] var8Lifetime1;
        int[] var9Lifetime1;
        var7 = Vertigo2.field_L ? 1 : 0;
        if (param1 > 91) {
          var8 = this.field_x.a(param0, (byte) -46);
          var3 = var8;
          if (!this.field_x.field_i) {
            return var8;
          }
          var11 = this.a(0, -1, param0);
          for (var5 = 0; we.field_M > var5; var5++) {
            var6 = var11[var5];
            stackIn_22_0 = var8;
            stackIn_22_1 = var5;
            if (this.field_z <= var6 &&
              this.field_G >= var6) {
              stackIn_24_2 = 4096;
            } else {
              stackIn_24_2 = 0;
            }
            stackIn_22_0[stackIn_22_1] = stackIn_24_2;
          }
          return var8;
        }
        field_B = -52;
        var8Lifetime1 = this.field_x.a(param0, (byte) -46);
        var3Lifetime1 = var8Lifetime1;
        if (!this.field_x.field_i) {
          return var8Lifetime1;
        }
        var9 = this.a(0, -1, param0);
        var4 = var9;
        for (var5Lifetime1 = 0; we.field_M > var5Lifetime1; var5Lifetime1++) {
          var9Lifetime1 = var4;
          var6Lifetime1 = var9Lifetime1[var5Lifetime1];
          stackIn_11_0 = var8Lifetime1;
          stackIn_11_1 = var5Lifetime1;
          if (this.field_z <= var6Lifetime1 &&
            this.field_G >= var6Lifetime1) {
            stackIn_13_2 = 4096;
          } else {
            stackIn_13_2 = 0;
          }
          stackIn_11_0[stackIn_11_1] = stackIn_13_2;
        }
        return var8Lifetime1;
    }

    static {
        field_H = new ve(6, 0, 4, 2);
        field_I = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_D = "Rating";
        field_J = "Remove <%0> from ignore list";
    }
}
