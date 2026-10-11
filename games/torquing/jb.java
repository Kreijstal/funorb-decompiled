/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jb {
    int field_a;
    static fj field_c;
    static String field_e;
    static int field_d;
    static ia field_b;

    final static boolean a(int param0) {
        RuntimeException var1 = null;
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 28) {
            jb.a((double[]) null, true, (double[]) null, -1.3623750460198865, 0.7041108610855004, 54);
          }
          stackIn_10_0 = (vd.field_c != null) && (vd.field_c.e(17));
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var1), "jb.A(" + param0 + ')');
        }
    }

    final static void a(double[] param0, boolean param1, double[] param2, double param3, double param4, int param5) {
        int stackIn_16_0 = 0;
        int stackIn_48_0 = 0;
        double stackIn_66_0 = 0.0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_82_2 = null;
        RuntimeException decompiledCaughtException = null;
        double[] var8 = null;
        RuntimeException var8_ref = null;
        double[] var9 = null;
        Object var10 = null;
        int var11_int = 0;
        double var11 = 0.0;
        int var12_int = 0;
        double[] var12_ref_double__ = null;
        double var12 = 0.0;
        int var14 = 0;
        double[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var11_intLifetime1;
        double var12Lifetime1;
        int var14Lifetime1;
        int var11_intLifetime2;
        int var11_intLifetime3;
        var17 = Torquing.field_u;
        try {
          if (param5 != 25152) {
            jb.a((double[]) null, true, (double[]) null, -0.33512462018887446, -0.5906299405943304, -46);
          }
          var8 = param2;
          var9 = param2;
          param2[2] = 0.0;
          var8[0] = 0.0;
          var9[1] = 0.0;
          var10 = null;
          L1: while (null == var10) {
            var10 = ll.a(mg.field_a, vf.field_e, (byte) 123);
            if (null != var10) {
              var11_int = 0;
              var12_int = 0;
              while (true) {
                if (var12_int < ia.field_i) {
                  stackIn_16_0 = $cfr$dcmpl(((double[]) (var10))[var12_int], -(1.5 * vf.field_e[var12_int]) + 5.0 / param4);
                  if (var17 == 0) {
                    if (stackIn_16_0 > 0) {
                      var11_int = 1;
                    }
                    var12_int++;
                    continue;
                  }
                } else {
                  stackIn_16_0 = var11_int;
                }
                if (stackIn_16_0 == 0 &&
                  !(((double[]) (var10))[8] > 5.0 + bd.field_y * 1.1)) {
                  break;
                }
                var10 = null;
                break;
              }
            }
            if (null != var10) {
              continue;
            }
            if (vf.field_e[8] != 0.0) {
              vf.field_e[8] = 0.0;
              var11_intLifetime2 = 0;
              while (var11_intLifetime2 < 8) {
                var12_ref_double__ = mg.field_a[var11_intLifetime2];
                mg.field_a[8][var11_intLifetime2] = 0.0;
                var12_ref_double__[8] = 0.0;
                var11_intLifetime2++;
                if (var17 != 0) {
                  continue L1;
                }
              }
              if (var17 == 0) {
                continue;
              }
            }
            var11_intLifetime3 = -1;
            var12 = Double.NEGATIVE_INFINITY;
            var14 = 0;
            while (true) {
              if (var14 < ia.field_i) {
                stackIn_48_0 = $cfr$dcmpl(0.0, vf.field_e[var14]);
                if (var17 == 0) {
                  if (stackIn_48_0 != 0 &&
                    vf.field_e[var14] > var12) {
                    var11_intLifetime3 = var14;
                    var12 = vf.field_e[var14];
                  }
                  var14++;
                  continue;
                }
              } else {
                vf.field_e[var11_intLifetime3] = 0.0;
                stackIn_48_0 = 0;
              }
              break;
            }
            var14Lifetime1 = stackIn_48_0;
            while (8 > var14Lifetime1) {
              var15 = mg.field_a[var14Lifetime1];
              mg.field_a[var11_intLifetime3][var14Lifetime1] = 0.0;
              var16 = var11_intLifetime3;
              var15[var16] = 0.0;
              var14Lifetime1++;
              if (var17 != 0) {
                continue L1;
              }
            }
            if (var17 == 0) {
              continue L1;
            }
            break;
          }
          var11_intLifetime1 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(ia.field_i > var11_intLifetime1)))) {
            var12Lifetime1 = ((double[]) (var10))[var11_intLifetime1];
            stackIn_66_0 = 1e-7;
            if (var17 == 0) {
              if (stackIn_66_0 < var12Lifetime1) {
                param2[1] = param2[1] + bn.field_f[var11_intLifetime1][7] * var12Lifetime1;
                if (!param1) {
                  param2[0] = param2[0] + bn.field_f[var11_intLifetime1][6] * var12Lifetime1;
                  param2[2] = param2[2] + bn.field_f[var11_intLifetime1][8] * var12Lifetime1;
                }
              }
              var11_intLifetime1++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_66_0 = ((double[]) (var10))[8];
          }
          var11 = stackIn_66_0;
          if (var11 > 1e-7) {
            if (!param1) {
              param2[2] = param2[2] + var11 * ia.field_d;
              param2[0] = param2[0] + var11 * tf.field_c;
            }
            param2[1] = param2[1] + mc.field_m * var11;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_77_0 = var8_ref;
          stackIn_77_1 = new StringBuilder().append("jb.C(");
          if (param0 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          stackIn_81_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_82_2 = "null";
          } else {
            stackIn_82_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_77_0), ((StringBuilder) (Object) stackIn_81_1).append(stackIn_82_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_e = null;
          if (param0 >= -58) {
            field_d = 83;
          }
          field_b = null;
          field_c = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var1), "jb.B(" + param0 + ')');
        }
    }

    final static t[] a(int param0, la param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        t[] stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param1.a(-1, param3);
          if (param0 != 0) {
            jb.a(-44, (la) null, (String) null, (String) null);
          }
          var5 = param1.a(param2, -110, var4_int);
          stackIn_4_0 = gk.a(105, var4_int, param1, var5);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("jb.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_c = new fj(256);
        field_d = -1;
    }

    private static int $cfr$dcmpl(double left, double right) {
        return left > right ? 1 : (left == right ? 0 : -1);
    }
}
