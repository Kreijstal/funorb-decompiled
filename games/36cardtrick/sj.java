/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sj {
    static int field_c;
    static be field_d;
    static bk field_a;
    static Calendar field_b;

    final static int a(int param0, int param1, Random param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Main.field_T;
        try {
          if (param1 <= 0) {
            throw new IllegalArgumentException();
          }
          if (ng.a(param1, (byte) -101)) {
            stackIn_6_0 = (int)((4294967295L & (long)param2.nextInt()) * (long)param1 >> 32);
            return stackIn_6_0;
          }
          var3_int = -2147483648 - (int)(4294967296L % (long)param1);
          if (param0 != 10999) {
            field_a = (bk) null;
          }
          do {
            var4 = param2.nextInt();
          } while (var4 >= var3_int);
          stackIn_11_0 = sk.a(param0 - 10970, param1, var4);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("sj.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static Object a(boolean param0, int param1, byte[] param2) {
        ei var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        ei stackIn_6_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == null) {
            stackIn_2_0 = null;
            return stackIn_2_0;
          }
          if (param1 < param2.length) {
            var3 = new ei();
            ((vf) ((Object) var3)).a(param2, (byte) 120);
            stackIn_6_0 = var3;
            return stackIn_6_0;
          }
          if (param0) {
            stackIn_11_0 = bf.a(0, param2);
            return stackIn_11_0;
          }
          stackIn_9_0 = (byte[]) (param2);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("sj.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static kc b(byte param0) {
        int var5_int = 0;
        int var6 = Main.field_T;
        int var1 = hb.field_a[0] * na.field_q[0];
        byte[] var2 = rd.field_k[0];
        int[] var3 = new int[var1];
        int var4 = -87 % ((-29 - param0) / 59);
        for (var5_int = 0; var5_int < var1; var5_int++) {
          var3[var5_int] = jf.field_i[bc.a(255, (int) var2[var5_int])];
        }
        kc var5 = new kc(p.field_l, gk.field_a, kb.field_c[0], ml.field_b[0], na.field_q[0], hb.field_a[0], var3);
        rh.d(-128);
        return var5;
    }

    final static void a(byte param0) {
        int var3 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        String stackIn_28_0 = null;
        String stackIn_35_0 = null;
        boolean stackIn_40_0 = false;
        boolean stackIn_41_1 = false;
        vg stackIn_46_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        vg var9 = null;
        int var10 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var10 = Main.field_T;
        try {
          if (param0 > -60) {
            return;
          }
          var1_int = qe.field_E;
          var2 = 0;
          if (v.field_R == 2) {
            var3_long = -jl.field_c + id.a(87);
            var2 = (int)((10999L - var3_long) / 1000L);
            if (var2 < 0) {
              var2 = 0;
            }
          }
          for (var3 = 0; var3 < me.field_a.length; var3++) {
            var4 = wd.field_d[var3];
            if (var4 < 0) {
              var5 = af.field_jb;
            } else {
              if (var4 == cg.field_e.field_k) {
                var5 = ca.field_b;
              } else {
                var5 = wg.field_a;
              }
            }
            var6 = me.field_a[var3];
            if (v.field_R == 2 &&
              var2 == 1) {
              if (tf.field_p.length <= ia.field_d.length) {
                stackIn_19_0 = ia.field_d.length;
              } else {
                stackIn_19_0 = tf.field_p.length;
              }
              var7 = stackIn_19_0;
              if (gl.field_G.length > da.field_c.length) {
                stackIn_22_0 = gl.field_G.length;
              } else {
                stackIn_22_0 = da.field_c.length;
              }
              var8 = stackIn_22_0;
              if (var3 >= 6 &&
                var3 < var7 + 6) {
                if (ia.field_d.length + (var3 - 6 - var7) >= 0) {
                  stackIn_28_0 = ia.field_d[ia.field_d.length + (-6 + (var3 - var7))];
                } else {
                  stackIn_28_0 = "";
                }
                var6 = stackIn_28_0;
              }
              if (var3 >= var7 + 7 &&
                var3 < 7 - (-var7 - var8)) {
                if (-7 + (var3 - var7) >= da.field_c.length) {
                  stackIn_35_0 = "";
                } else {
                  stackIn_35_0 = da.field_c[-7 + var3 - var7];
                }
                var6 = stackIn_35_0;
              }
            }
            if (var4 == -2) {
              var6 = Integer.toString(var2);
            }
            stackIn_40_0 = false;
            stackIn_41_1 = !(var4 < 0);
            var7Lifetime1 = hj.a(stackIn_40_0, stackIn_41_1, var6);
            var8Lifetime1 = dl.field_g - (var7Lifetime1 >> 1);
            if (var4 >= 0) {
              var1_int = var1_int + e.field_i;
              if (cg.field_e.field_k == var4) {
                stackIn_46_0 = ie.field_m;
              } else {
                stackIn_46_0 = wd.field_b;
              }
              var9 = stackIn_46_0;
              if (var9 != null) {
                var9.a((byte) -122, var1_int, tl.field_b + (a.field_o << 1), var8Lifetime1 - tc.field_b, var7Lifetime1 + (tc.field_b << 1));
              }
              var1_int = var1_int + a.field_o;
            }
            if (var4 >= 0) {
              c.field_u.b(var6, var8Lifetime1, var1_int + field_c, var5, -1);
              var1_int = var1_int + (a.field_o - (-e.field_i - tl.field_b));
            } else {
              mb.field_a.b(var6, var8Lifetime1, mg.field_q + var1_int, var5, -1);
              var1_int = var1_int + sa.field_d;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "sj.E(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          return;
        }
        field_a = null;
        field_b = null;
        field_d = null;
    }

    final static nc a(String param0, byte param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        byte[] var6 = null;
        nc stackIn_3_0 = null;
        nc stackIn_7_0 = null;
        nc stackIn_17_0 = null;
        nc stackIn_21_0 = null;
        Object stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Main.field_T;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_3_0 = ec.field_j;
            return stackIn_3_0;
          }
          if (var2_int > 63) {
            stackIn_7_0 = dj.field_f;
            return stackIn_7_0;
          }
          for (var3 = 0; var3 < var2_int; var3++) {
            var4 = param0.charAt(var3);
            if (var4 == 45) {
              if (var3 == 0 ||
                var2_int - 1 == var3) {
                stackIn_17_0 = ij.field_i;
                return stackIn_17_0;
              }
            } else {
              if (ag.field_c.indexOf(var4) == -1) {
                stackIn_21_0 = ij.field_i;
                return stackIn_21_0;
              }
            }
          }
          if (param1 == 8) {
            return null;
          }
          var6 = (byte[]) null;
          sj.a(true, 21, (byte[]) null);
          stackIn_26_0 = null;
          return (nc) (stackIn_26_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_29_0 = var2;
          stackIn_29_1 = new StringBuilder().append("sj.C(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, String param1, String[] param2, int param3) {
        int var5 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Main.field_T;
        try {
          if (param0 <= 23) {
            field_a = (bk) null;
          }
          jc.field_P = gg.field_b;
          if (255 != param3) {
            if (param3 >= 100 &&
              param3 <= 105) {
              mh.field_a = pf.a(-109, param2);
              return;
            }
            mh.field_a = nc.a(param3, 0, param1);
          } else {
            stackIn_6_0 = -1;
            stackIn_7_1 = !(13 <= ok.field_c);
            mh.field_a = il.a(stackIn_6_0, stackIn_7_1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("sj.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_d = new be();
        field_a = new bk();
        field_b = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
