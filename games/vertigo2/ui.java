/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui {
    short field_f;
    static cr field_b;
    boolean field_c;
    boolean field_a;
    static int field_g;
    boolean field_i;
    int field_h;
    static lg field_e;
    static int field_d;

    final static er[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int stackIn_13_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_53_0 = 0;
        er[] stackIn_64_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        er[] var10 = null;
        er[] var11_ref_er__ = null;
        int var11 = 0;
        int var12 = 0;
        er var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var11Lifetime1;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime2Lifetime1;
        int var12Lifetime2Lifetime2;
        var15 = Vertigo2.field_L ? 1 : 0;
        try {
          var9_int = param0 + param1 + param5;
          var10 = new er[]{new er(var9_int, var9_int), new er(param8, var9_int), new er(var9_int, var9_int), new er(var9_int, param8), new er(64, 64), new er(var9_int, param8), new er(var9_int, var9_int), new er(param8, var9_int), new er(var9_int, var9_int)};
          var11_ref_er__ = var10;
          var12 = 0;
          L0: while (true) {
            if (var12 < var11_ref_er__.length) {
              var13 = var11_ref_er__[var12];
              stackIn_13_0 = 0;
              if (var15 != 0) {
                break L0;
              }
              var14 = stackIn_13_0;
              while (var14 < var13.field_F.length) {
                var13.field_F[var14] = param7;
                var14++;
              }
              var12++;
              continue L0;
            }
            stackIn_13_0 = param6;
            break;
          }
          if (stackIn_13_0 != 5) {
            field_d = 37;
          }
          var11 = 0;
          L7: while (true) {
            if (var11 < param0) {
              stackIn_28_0 = 0;
              if (var15 != 0) {
                break L7;
              }
              var12Lifetime1 = stackIn_28_0;
              while (var9_int > var12Lifetime1) {
                var10[6].field_F[var12Lifetime1 + (-1 + (var9_int - var11)) * var9_int] = param2;
                var10[8].field_F[var12Lifetime1 + (-1 - var11 + var9_int) * var9_int] = param2;
                var10[2].field_F[-1 + var9_int + (-var11 + var9_int * var12Lifetime1)] = param2;
                var10[8].field_F[-var11 + var9_int - 1 + var9_int * var12Lifetime1] = param2;
                var12Lifetime1++;
              }
              var11++;
              continue L7;
            }
            stackIn_28_0 = 0;
            break;
          }
          var11Lifetime1 = stackIn_28_0;
          while (true) {
            stackIn_30_0 = param0;
            stackIn_30_1 = var11Lifetime1;
            if (stackIn_30_0 > stackIn_30_1) {
              stackIn_41_0 = 0;
              if (var15 == 0) {
                var12Lifetime2 = stackIn_41_0;
                while (var12Lifetime2 < var9_int) {
                  var10[0].field_F[var12Lifetime2 + var9_int * var11Lifetime1] = param4;
                  var10[0].field_F[var9_int * var12Lifetime2 + var11Lifetime1] = param4;
                  stackIn_30_0 = var9_int - var11Lifetime1;
                  stackIn_30_1 = var12Lifetime2;
                  if (stackIn_30_0 > stackIn_30_1) {
                    var10[2].field_F[var11Lifetime1 * var9_int + var12Lifetime2] = param4;
                    var10[6].field_F[var9_int * var12Lifetime2 + var11Lifetime1] = param4;
                  }
                  var12Lifetime2++;
                }
                var11Lifetime1++;
                continue;
              }
            } else {
              stackIn_41_0 = 0;
            }
            var11Lifetime1 = stackIn_41_0;
            L20: while (true) {
              if (param8 > var11Lifetime1) {
                stackIn_53_0 = 0;
                if (var15 != 0) {
                  break L20;
                }
                var12Lifetime2Lifetime1 = stackIn_53_0;
                while (param0 > var12Lifetime2Lifetime1) {
                  var10[7].field_F[var11Lifetime1 + (-var12Lifetime2Lifetime1 + (var9_int - 1)) * param8] = param2;
                  var10[5].field_F[-var12Lifetime2Lifetime1 + (-1 + (var9_int + var11Lifetime1 * var9_int))] = param2;
                  var10[1].field_F[var11Lifetime1 + param8 * var12Lifetime2Lifetime1] = param4;
                  var10[3].field_F[var12Lifetime2Lifetime1 + var11Lifetime1 * var9_int] = param4;
                  var12Lifetime2Lifetime1++;
                }
                var11Lifetime1++;
                continue L20;
              }
              stackIn_53_0 = 0;
              break;
            }
            var11Lifetime1 = stackIn_53_0;
            L26: while (param8 >> 1 > var11Lifetime1) {
              var12Lifetime2Lifetime2 = 0;
              while (true) {
                if (param5 > var12Lifetime2Lifetime2) {
                  var10[1].field_F[param8 * (-1 - var12Lifetime2Lifetime2 + var9_int) + var11Lifetime1] = param3;
                  var10[3].field_F[-1 + (var9_int - (var12Lifetime2Lifetime2 - var11Lifetime1 * var9_int))] = param3;
                  var10[7].field_F[var11Lifetime1 + var12Lifetime2Lifetime2 * param8] = param3;
                  var10[5].field_F[var12Lifetime2Lifetime2 + var11Lifetime1 * var9_int] = param3;
                  var12Lifetime2Lifetime2++;
                  if (var15 == 0) {
                    continue;
                  }
                } else {
                  var11Lifetime1++;
                }
                break;
              }
              if (var15 == 0) {
                continue L26;
              }
              break;
            }
            stackIn_64_0 = var10;
            return stackIn_64_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var9), "ui.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static boolean c(int param0) {
        RuntimeException var1 = null;
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -100) {
            ui.a(-32, -26, -60, -33, 84, -75, 106, 100, 13);
          }
          stackIn_10_0 = (null != t.field_m) && (t.field_m.a(false));
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var1), "ui.E(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 64) {
          return;
        }
        try {
          field_e = null;
          field_b = null;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "ui.C(" + param0 + ')');
        }
    }

    final static void a(long param0, int param1, byte param2) {
        RuntimeException runtimeException = null;
        mi var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = uh.field_Wb;
          var4.j(param1, 124);
          var4.field_u = var4.field_u + 1;
          var5 = var4.field_u;
          var4.f(6, 88);
          if (param2 < 85) {
            field_b = (cr) null;
          }
          var4.a((byte) -117, param0);
          var4.b((byte) 117, var4.field_u - var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) runtimeException), "ui.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static String b(int param0) {
        String stackIn_59_0 = null;
        Object stackIn_105_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object var1 = null;
        Object var2 = null;
        String var3 = null;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        var10 = Vertigo2.field_L ? 1 : 0;
        try {
          var1 = null;
          var2 = null;
          if (field_g == 0 &&
            null != sj.field_d) {
            var2 = w.field_E;
          }
          if (2 == field_g &&
            !dh.a((byte) 127)) {
            if (!c.a(sm.field_Kb, (byte) -125)) {
              var2 = Vertigo2.a(new String[]{ea.field_b}, bj.field_b, param0 ^ 410);
              if (var10 != 0) {
                var2 = Vertigo2.a(new String[]{ea.field_b}, qo.field_E, 91);
              }
            } else {
              var2 = Vertigo2.a(new String[]{ea.field_b}, qo.field_E, 91);
            }
            if (pm.field_a) {
              dh.a((byte) -114, (String) (var2), 2, (String) null, 0, (String) null);
              on.a(9110);
            }
          }
          if (null == var2 &&
            !nb.field_z &&
            null == gk.field_c) {
            var2 = na.field_l;
          }
          if (param0 != -485) {
            field_b = (cr) null;
          }
          if (null != var2) {
            ir.a((String) null, lj.field_p, (String) (var2), 0, 0);
          } else {
            var3 = qe.field_V;
            var3 = jk.a(15709, var3);
            var4 = "";
            var5 = "|";
            var6 = field_g;
            var7 = 0;
            if (var6 == 2) {
              var4 = Vertigo2.a(new String[]{ea.field_b}, di.field_B, -114);
              var8 = Vertigo2.a(new String[]{var3}, af.field_L, -128);
              var7 = -485 + (dj.field_d.field_Fb + field_b.field_Fb) - (-cg.field_f.c(var8) + cg.field_f.c(var4));
              if (var7 < 0) {
                var7 = 0;
              }
            } else {
              if (0 == var6) {
                if (gd.field_j == null &&
                  fq.field_i) {
                  var4 = "[" + fb.field_A + "] ";
                }
                if (gd.field_j != null) {
                  boolean decompiledSharedTail0 = (!(ar.field_t) ||
                    null == v.field_a);
                  if (!decompiledSharedTail0) {
                    var4 = "[" + v.field_a + "] ";
                    decompiledSharedTail0 = (var10 != 0);
                  }
                  if (decompiledSharedTail0) {
                    var4 = "[" + Vertigo2.a(new String[]{gd.field_j.field_Nb}, ie.field_Rb, param0 ^ 411) + "] ";
                  }
                  var6 = 1;
                }
              }
              if (tb.a((byte) 118)) {
                stackIn_59_0 = ": ";
              } else {
                stackIn_59_0 = "<img=3>: ";
              }
              var8 = stackIn_59_0;
              var4 = var4 + var3 + var8;
              if (!pe.field_r) {
                if (hj.field_b) {
                  var4 = "<col=999999>" + var4 + pb.field_c + "</col>";
                  var5 = "";
                  if (var10 != 0) {
                    var5 = "";
                    var4 = "<col=999999>" + var4 + ah.field_k + "</col>";
                  }
                }
              } else {
                var5 = "";
                var4 = "<col=999999>" + var4 + ah.field_k + "</col>";
              }
              var9 = cg.field_f.c(var4);
              if (!tb.a((byte) 122)) {
                if (dj.field_d.field_pb &&
                  var9 > (-dj.field_d.field_ob + ed.field_n)) {
                  if (!pe.field_r) {
                    var1 = pb.field_c;
                  } else {
                    var1 = "Broken!";
                  }
                }
                if (dj.field_d.field_tb != 0 &&
                  dj.field_d.field_ub < var9 &&
                  !pe.field_r) {
                  g.a((byte) -10);
                }
              }
            }
            ir.a(var5, gg.field_n[var6], var4 + cc.b(fb.field_D.toString()), var7, 0);
            if (!il.field_a) {
              field_b.field_pb = false;
            }
            if (field_b.field_pb) {
              var1 = Vertigo2.a(new String[]{var3, ea.field_b}, bd.field_g, -113);
            }
          }
          stackIn_105_0 = var1;
          return (String) (stackIn_105_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) (var1), "ui.A(" + param0 + ')');
        }
    }

    static {
        field_g = 0;
    }
}
