/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cp extends gd {
    static String field_T;
    static boolean field_U;
    static String field_P;
    ac field_S;
    static String[] field_Q;
    static int field_R;
    static String field_O;

    final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        cn var8 = null;
        int var9 = 0;
        int var10 = 0;
        if (param1 == 8187) {
          var4 = param0 + (((cp) this).field_t - 3);
          var5 = -3 + (param2 + ((cp) this).field_i);
          var6 = 5 + (((cp) this).field_q + var4);
          var7 = 5 + var5 - -((cp) this).field_x;
          if (var4 > gf.field_h) {
            return;
          } else {
            L0: {
              if (gf.field_e < var5) {
                break L0;
              } else {
                if (gf.field_j > var6) {
                  break L0;
                } else {
                  if (var7 < gf.field_f) {
                    break L0;
                  } else {
                    L1: {
                      gf.b(var4, var5, ((cp) this).field_q - -5, ((cp) this).field_x - -5, 0, 128);
                      super.b(param0, param1, param2);
                      var8 = ((cp) this).field_S.field_d.a(40, 0, 40, 0);
                      var9 = ((cp) this).field_x + var5 - 42;
                      var10 = var4 - -5;
                      if (var8 != null) {
                        var8.c(var10, var9);
                        break L1;
                      } else {
                        gf.b(var10, var9, 32, 32, 0);
                        break L1;
                      }
                    }
                    return;
                  }
                }
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    cp(int param0, int param1, ac param2) {
        super(param0, param1, 0, 0, 0);
        RuntimeException var4 = null;
        String var4_ref = null;
        int var5 = 0;
        String[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        cn var11 = null;
        cn var12 = null;
        cn var13 = null;
        int var14 = 0;
        int var15 = 0;
        cn var16 = null;
        cn var17 = null;
        String var19 = null;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        gp stackIn_16_0 = null;
        String stackIn_16_1 = null;
        gp stackIn_17_0 = null;
        String stackIn_17_1 = null;
        gp stackIn_18_0 = null;
        String stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        gp stackIn_19_0 = null;
        String stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        int stackIn_19_3 = 0;
        gp stackIn_20_0 = null;
        String stackIn_20_1 = null;
        int stackIn_20_2 = 0;
        int stackIn_20_3 = 0;
        gp stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        int stackIn_21_3 = 0;
        int stackIn_21_4 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        gp stackOut_15_0 = null;
        String stackOut_15_1 = null;
        gp stackOut_17_0 = null;
        String stackOut_17_1 = null;
        int stackOut_17_2 = 0;
        gp stackOut_16_0 = null;
        String stackOut_16_1 = null;
        int stackOut_16_2 = 0;
        gp stackOut_18_0 = null;
        String stackOut_18_1 = null;
        int stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        gp stackOut_20_0 = null;
        String stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        int stackOut_20_4 = 0;
        gp stackOut_19_0 = null;
        String stackOut_19_1 = null;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        int stackOut_19_4 = 0;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        try {
          L0: {
            L1: {
              ((cp) this).field_S = param2;
              var19 = ((cp) this).field_S.field_z;
              var4_ref = var19;
              var5 = ((cp) this).field_S.field_c;
              var6 = jn.a(var19, new int[2], -108, (se) (Object) db.field_v);
              var7 = db.field_v.field_H * var6.length + la.field_b.field_H + 42;
              if (pb.field_G <= 0) {
                if ((((cp) this).field_S.field_j & 1) != 0) {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 0;
                  stackIn_7_0 = stackOut_4_0;
                  break L1;
                }
              } else {
                stackOut_2_0 = 0;
                stackIn_7_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var8 = stackIn_7_0;
              if (gm.field_d.field_e == 0) {
                if ((((cp) this).field_S.field_j & 2) != 0) {
                  stackOut_11_0 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  break L2;
                } else {
                  stackOut_10_0 = 0;
                  stackIn_13_0 = stackOut_10_0;
                  break L2;
                }
              } else {
                stackOut_8_0 = 0;
                stackIn_13_0 = stackOut_8_0;
                break L2;
              }
            }
            var9 = stackIn_13_0;
            var10 = var8 | var9;
            var11 = new cn(140, var7);
            var12 = new cn(140, var7);
            var13 = new cn(140, var7);
            jh.a(var11);
            gf.a();
            var14 = 0;
            var15 = 0;
            L3: while (true) {
              if (var15 >= var6.length) {
                L4: {
                  var14 = var14 + (la.field_b.field_H - -2);
                  if (var8 == 0) {
                    if (var9 == 0) {
                      int discarded$1 = 30496;
                      la.field_b.b(jk.a(new String[1], n.field_a), 52, var14, 12632256, -1);
                      break L4;
                    } else {
                      la.field_b.b(be.field_q, 52, var14, 16711680, -1);
                      break L4;
                    }
                  } else {
                    la.field_b.b(dn.field_T, 52, var14, 16711680, -1);
                    break L4;
                  }
                }
                L5: {
                  var14 += 4;
                  var12.e();
                  var15 = -40 + (var7 + -5);
                  gf.a();
                  var11.e(0, 0, 16744448);
                  al.a(52, var14, false, ((cp) this).field_S, 16744448);
                  rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                  var13.e();
                  gf.a();
                  var11.e(0, 0, 12690143);
                  al.a(52, var14, false, ((cp) this).field_S, 10449103);
                  rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                  var11.e();
                  al.a(52, var14, false, ((cp) this).field_S, 12632256);
                  rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                  jh.b();
                  var16 = rb.a(16, var12, 255, (byte) -95);
                  var17 = rb.a(16, var12, 16711680, (byte) -75);
                  ((cp) this).a(var12, var11, var17, var13, (byte) 126, var16);
                  ((cp) this).field_n = (en) (Object) new bd(((cp) this).field_S);
                  if (var10 == 0) {
                    break L5;
                  } else {
                    ((cp) this).field_w = false;
                    break L5;
                  }
                }
                break L0;
              } else {
                L6: {
                  var14 = var14 + la.field_b.field_H;
                  stackOut_15_0 = la.field_b;
                  stackOut_15_1 = var6[var15];
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  if (var15 != 0) {
                    stackOut_17_0 = (gp) (Object) stackIn_17_0;
                    stackOut_17_1 = (String) (Object) stackIn_17_1;
                    stackOut_17_2 = la.field_b.field_H;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    break L6;
                  } else {
                    stackOut_16_0 = (gp) (Object) stackIn_16_0;
                    stackOut_16_1 = (String) (Object) stackIn_16_1;
                    stackOut_16_2 = 0;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_18_2 = stackOut_16_2;
                    break L6;
                  }
                }
                L7: {
                  stackOut_18_0 = (gp) (Object) stackIn_18_0;
                  stackOut_18_1 = (String) (Object) stackIn_18_1;
                  stackOut_18_2 = stackIn_18_2;
                  stackOut_18_3 = var14;
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  stackIn_20_2 = stackOut_18_2;
                  stackIn_20_3 = stackOut_18_3;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  stackIn_19_3 = stackOut_18_3;
                  if (var10 == 0) {
                    stackOut_20_0 = (gp) (Object) stackIn_20_0;
                    stackOut_20_1 = (String) (Object) stackIn_20_1;
                    stackOut_20_2 = stackIn_20_2;
                    stackOut_20_3 = stackIn_20_3;
                    stackOut_20_4 = 16760832;
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    stackIn_21_2 = stackOut_20_2;
                    stackIn_21_3 = stackOut_20_3;
                    stackIn_21_4 = stackOut_20_4;
                    break L7;
                  } else {
                    stackOut_19_0 = (gp) (Object) stackIn_19_0;
                    stackOut_19_1 = (String) (Object) stackIn_19_1;
                    stackOut_19_2 = stackIn_19_2;
                    stackOut_19_3 = stackIn_19_3;
                    stackOut_19_4 = 8421504;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_21_1 = stackOut_19_1;
                    stackIn_21_2 = stackOut_19_2;
                    stackIn_21_3 = stackOut_19_3;
                    stackIn_21_4 = stackOut_19_4;
                    break L7;
                  }
                }
                ((gp) (Object) stackIn_21_0).b(stackIn_21_1, stackIn_21_2, stackIn_21_3, stackIn_21_4, -1);
                var15++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var4;
            stackOut_30_1 = new StringBuilder().append("cp.<init>(").append(param0).append(',').append(param1).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param2 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L8;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L8;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ')');
        }
    }

    final static void a(int param0, java.applet.Applet param1, byte param2, int param3, String[] param4) {
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var8 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              mj.field_f = param1.getParameter("overxgames");
              if (null == mj.field_f) {
                mj.field_f = "0";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              dh.field_f = param1.getParameter("overxachievements");
              if (dh.field_f != null) {
                break L2;
              } else {
                dh.field_f = "0";
                break L2;
              }
            }
            L3: {
              var6 = param1.getParameter("currency");
              if (var6 == null) {
                wo.field_g = 2;
                break L3;
              } else {
                int discarded$29 = 10;
                if (!sj.a((CharSequence) (Object) var6)) {
                  wo.field_g = 2;
                  break L3;
                } else {
                  wo.field_g = ri.a((byte) 87, (CharSequence) (Object) var6);
                  break L3;
                }
              }
            }
            uj.field_d = 16777215;
            lj.field_u = 0;
            ld.field_c = 0;
            en.field_b = new cn[param4.length];
            var7 = 0;
            L4: while (true) {
              if (var7 >= param4.length) {
                ec.field_l = param4;
                break L0;
              } else {
                en.field_b[var7] = new cn(317, 34);
                var7++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var6_ref;
            stackOut_16_1 = new StringBuilder().append("cp.D(").append(0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          L6: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(-36).append(',').append(0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + 16777215 + ')');
        }
    }

    final static int f(int param0, int param1, int param2) {
        int var3 = 49 % ((56 - param0) / 49);
        int var4 = param2 >>> 31;
        return (var4 + param2) / param1 - var4;
    }

    public static void c() {
        field_O = null;
        field_Q = null;
        field_P = null;
        field_T = null;
    }

    final static void f() {
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = DungeonAssault.field_K;
        try {
          L0: {
            int discarded$37 = -123;
            if (!fm.a()) {
              L1: {
                if (cm.field_R == null) {
                  break L1;
                } else {
                  if (!cm.field_R.field_g) {
                    break L1;
                  } else {
                    int discarded$38 = 930;
                    ib.a();
                    na.field_D.a((lm) (Object) new nm(na.field_D, of.field_g), -1);
                    break L1;
                  }
                }
              }
              return;
            } else {
              boolean discarded$39 = na.field_D.a(am.field_e, (byte) 66, bp.field_d, true);
              na.field_D.b(true);
              L2: while (true) {
                int discarded$40 = 47;
                if (!ha.b()) {
                  break L0;
                } else {
                  boolean discarded$41 = na.field_D.a(127, mm.field_t, ob.field_Yb);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var1, "cp.B(" + -30208 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = "If the trap here is triggered, the room will almost instantly fill with a gangrenous-looking poison gas.";
        field_U = false;
        field_O = "Giant Rats";
        field_R = 64;
        field_T = "Login: ";
    }
}
