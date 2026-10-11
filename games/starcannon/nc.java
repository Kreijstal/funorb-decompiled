/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class nc {
    static Random field_c;
    static String field_e;
    static String field_d;
    static String field_a;
    private java.util.zip.Inflater field_b;

    final static void a(int param0) {
        int var15 = 0;
        int var17_int = 0;
        int var18 = 0;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        lb var4_ref_lb = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        lb var17 = null;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        double var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = StarCannon.field_A;
        try {
          fb.field_l = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          if (param0 != -1196777214) {
            return;
          }
          var1_int = ci.field_g.length;
          var21 = new int[var1_int];
          var20 = var21;
          var2 = var20;
          for (var3 = 0; var3 < var1_int; var3++) {
            var4_ref_lb = ci.field_g[var3];
            var4_ref_lb.c((byte) -3);
            lj.a(var3, 8710);
            var5 = var4_ref_lb.field_p + var4_ref_lb.field_M >> 1;
            var6 = var4_ref_lb.field_w + var4_ref_lb.field_F >> 1;
            var7 = var4_ref_lb.field_k + var4_ref_lb.field_v >> 1;
            var8 = fb.field_l[9] >> 2;
            var9 = fb.field_l[10] >> 2;
            var10_int = fb.field_l[11] >> 2;
            var11 = var10_int * la.field_d[5] + (var9 * la.field_d[4] + var8 * la.field_d[3]) >> 14;
            var12 = var10_int * la.field_d[8] + (la.field_d[7] * var9 + var8 * la.field_d[6]) >> 14;
            var13 = la.field_d[11] * var10_int + (var8 * la.field_d[9] + var9 * la.field_d[10]) >> 14;
            var2[var3] = var5 * var11 + var6 * var12 + var7 * var13 >> 16;
          }
          var3Lifetime1 = fb.field_l[9] >> 8;
          var4 = fb.field_l[10] >> 8;
          var5Lifetime1 = fb.field_l[11] >> 8;
          var6Lifetime1 = qb.field_h << 4;
          var7Lifetime1 = 0;
          var8Lifetime1 = qf.a(var6Lifetime1, (byte) -112) >> 8;
          var9Lifetime1 = ue.b(var6Lifetime1, param0 ^ -1196777089) >> 8;
          if (pe.field_d != -1 &&
            la.field_c != -1) {
            var9Lifetime1 = -128;
            var8Lifetime1 = 240 - la.field_c;
            var7Lifetime1 = -320 + pe.field_d;
          }
          var10 = 256.0 / Math.sqrt((double)(var7Lifetime1 * var7Lifetime1 + var8Lifetime1 * var8Lifetime1 + var9Lifetime1 * var9Lifetime1));
          var9Lifetime1 = (int)((double)var9Lifetime1 * var10);
          var8Lifetime1 = (int)((double)var8Lifetime1 * var10);
          var7Lifetime1 = (int)((double)var7Lifetime1 * var10);
          var12Lifetime1 = -var3Lifetime1 + var7Lifetime1;
          var13Lifetime1 = var8Lifetime1 - var4;
          var14 = -var5Lifetime1 + var9Lifetime1;
          var10Lifetime1 = 256.0 / Math.sqrt((double)(var13Lifetime1 * var13Lifetime1 + var12Lifetime1 * var12Lifetime1 + var14 * var14));
          var13Lifetime1 = (int)((double)var13Lifetime1 * var10Lifetime1);
          var14 = (int)((double)var14 * var10Lifetime1);
          var12Lifetime1 = (int)((double)var12Lifetime1 * var10Lifetime1);
          for (var15 = 0; ci.field_g.length > var15; var15++) {
            var16 = 0;
            for (var17_int = 1; ci.field_g.length > var17_int; var17_int++) {
              if (var21[var16] < var21[var17_int]) {
                var16 = var17_int;
              }
            }
            var21[var16] = -2147483648;
            var17 = ci.field_g[var16];
            lj.a(var16, 8710);
            for (var18 = 0; var18 < 3; var18++) {
              la.field_d[var18] = la.field_d[var18] + ck.field_h[var15][var18];
            }
            sh.a(false, false, 88, la.field_d, var17, fb.field_l, true);
            kb.a(var9Lifetime1, param0 ^ -1196711933, var12Lifetime1, var17, var14, var8Lifetime1, var7Lifetime1, var13Lifetime1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1), "nc.F(" + param0 + ')');
        }
    }

    public nc() {
        this(-1, 1000000, 1000000);
    }

    final static id a(byte param0, id param1, int[] param2) {
        id var3 = null;
        RuntimeException var3_ref = null;
        id stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new id(0, 0, 0);
          var3.field_b = param1.field_b;
          var3.field_k = param1.field_k;
          var3.field_m = param2;
          var3.field_g = param1.field_g;
          if (param0 >= -60) {
            nc.a(false, -94);
          }
          var3.field_e = param1.field_e;
          var3.field_f = param1.field_f;
          var3.field_h = param1.field_h;
          var3.field_n = param1.field_n;
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("nc.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void a(rb param0, boolean param1, byte[] param2) {
        try {
          Exception exception = null;
          RuntimeException runtimeException = null;
          RuntimeException stackIn_15_0 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param0.field_f[param0.field_g] == 31 &&
              -117 == param0.field_f[1 + param0.field_g]) {
              if (null == this.field_b) {
                this.field_b = new java.util.zip.Inflater(true);
              }
              try {
                this.field_b.setInput(param0.field_f, 10 + param0.field_g, -10 + (-param0.field_g - (8 - param0.field_f.length)));
                this.field_b.inflate(param2);
                if (!param1) {
                  field_a = (String) null;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                exception = (Exception) (Object) decompiledCaughtException;
                this.field_b.reset();
                throw new RuntimeException("");
              }
              this.field_b.reset();
              return;
            }
            throw new RuntimeException("");
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            runtimeException = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_15_0 = runtimeException;
            stackIn_15_1 = new StringBuilder().append("nc.C(");
            if (param0 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw sd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(boolean param0, int param1) {
        int stackIn_62_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_83_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = StarCannon.field_A;
        try {
          ck.field_f = ck.field_f + 65536;
          while (fk.a(ck.field_f, kk.field_e, (byte) -117) >= 65536) {
            fk.field_a = fk.field_a + 1;
            ck.field_f = ck.field_f - kk.field_e;
          }
          var2_int = -1;
          if (og.field_d == null) {
            if (null != pa.field_I) {
              var2_int = pa.field_I.length;
            }
          } else {
            var2_int = og.field_d.length;
          }
          if (param1 != ~var2_int) {
            boolean decompiledFrameRemainder0 = true;
            if (rk.field_a < kk.field_c) {
              rk.field_a = rk.field_a + 1;
              if (kk.field_a < rk.field_a && (null == og.field_d ||
                null == og.field_d[ag.field_o])) {
                rk.field_a = rk.field_a - 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                if (kk.field_c <= rk.field_a &&
                  null == og.field_d[(ag.field_o + 1) % var2_int]) {
                  rk.field_a = rk.field_a - 1;
                }
              }
            }
            if (rk.field_a >= kk.field_c) {
              od.field_i = ag.field_o;
              rk.field_a = rk.field_a - kk.field_c;
              if (cc.field_j) {
                ag.field_o = ag.field_o + 1;
                if (var2_int <= ag.field_o) {
                  ag.field_o = ag.field_o - var2_int;
                }
              } else {
                ag.field_o = ag.field_o - 1;
                if (0 > ag.field_o) {
                  ag.field_o = ag.field_o + var2_int;
                }
              }
            }
            if (rk.field_a > kk.field_a) {
              cc.field_j = true;
            }
          }
          if (ge.field_b != null) {
            var3 = -(ge.field_b.field_q / 2) + 357;
            var4 = 0;
            if (kg.field_a != 0 &&
              var3 < kc.field_Q &&
              ge.field_b.field_v + var3 > kc.field_Q) {
              if (269 - ge.field_b.field_u < rg.field_B &&
                rg.field_B < 269) {
                cc.field_j = false;
                var4 = 1;
                rk.field_a = kk.field_c;
              }
              if (rg.field_B > 586 &&
                rg.field_B < 586 + ge.field_b.field_u) {
                cc.field_j = true;
                rk.field_a = kk.field_c;
                var4 = 1;
              }
            }
            if (var4 == 0 &&
              kk.field_a < rk.field_a &&
              var3 < la.field_c &&
              la.field_c < var3 + ge.field_b.field_v) {
              if (269 - ge.field_b.field_u < pe.field_d &&
                269 > pe.field_d) {
                rk.field_a = kk.field_a;
              }
              if (pe.field_d > 586 &&
                586 + ge.field_b.field_u > pe.field_d) {
                rk.field_a = kk.field_a;
              }
            }
          }
          if (param0) {
            ea.field_a.a(td.a(rg.field_B, kc.field_Q, true), td.a(pe.field_d, la.field_c, true), -104);
            if (ea.field_a.g(0)) {
              if (ea.field_a.field_k == 0) {
                stackIn_62_0 = 3;
                return stackIn_62_0;
              }
              if (1 == ea.field_a.field_k) {
                stackIn_66_0 = 2;
                return stackIn_66_0;
              }
            }
            while (ad.e((byte) 93)) {
              ea.field_a.b(0, param1 - 101);
              if (ea.field_a.g(0)) {
                if (ea.field_a.field_k == 0) {
                  stackIn_73_0 = 3;
                  return stackIn_73_0;
                }
                if (ea.field_a.field_k == 1) {
                  stackIn_77_0 = 1;
                  return stackIn_77_0;
                }
              }
              if (lb.field_B != 13) {
                continue;
              }
              stackIn_81_0 = 1;
              return stackIn_81_0;
            }
          }
          stackIn_83_0 = 0;
          return stackIn_83_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "nc.G(" + param0 + ',' + param1 + ')');
        }
    }

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3Lifetime1;
        var4 = StarCannon.field_A;
        try {
          var2_int = param1.charAt(0);
          for (var3 = 1; param1.length() > var3; var3++) {
            if (~var2_int != ~param1.charAt(var3)) {
              return false;
            }
          }
          var3Lifetime1 = -5 / ((param0 - 19) / 63);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("nc.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_e = null;
        field_d = null;
        int var1 = -4 % ((param0 + 55) / 54);
        field_c = null;
        field_a = null;
    }

    final static void a(byte param0) {
        if (param0 < 45) {
          return;
        }
        int var1 = ii.a(6940);
        int var2 = wc.d(20);
        u.field_c.a(-qf.field_g + p.field_g, (qf.field_g << 1) + var1, 122, nd.field_m - qc.field_g, var2 + (qc.field_g << 1));
        bg.b(1000);
    }

    private nc(int param0, int param1, int param2) {
    }

    static {
        field_a = "Password is valid";
        field_d = "Unpacking music";
        field_e = "Fullscreen";
        field_c = new Random();
    }
}
