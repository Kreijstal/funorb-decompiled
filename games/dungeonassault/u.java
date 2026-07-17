/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u extends gd {
    static ad field_U;
    static cf[] field_T;
    static int field_P;
    static String field_S;
    h field_Q;
    static boolean field_O;
    static String field_R;

    final static int a(int param0, int param1, boolean param2) {
        if (param0 == 0) {
          if (0 != param1) {
            if (param1 < 0) {
              return -2048;
            } else {
              return 2048;
            }
          } else {
            return 0;
          }
        } else {
          if (param0 < 0) {
            if (0 != param1) {
              if (param1 >= 0) {
                return -d.a(-81, -param0, param1) + 4096;
              } else {
                return d.a(-89, -param0, -param1) - 4096;
              }
            } else {
              return 4096;
            }
          } else {
            if (0 != param1) {
              if (param1 >= 0) {
                return d.a(-103, param0, param1);
              } else {
                return -d.a(-120, param0, -param1);
              }
            } else {
              return 0;
            }
          }
        }
    }

    u(int param0, int param1, h param2) {
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
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
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
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        try {
          L0: {
            L1: {
              ((u) this).field_Q = param2;
              var19 = ((u) this).field_Q.field_F;
              var4_ref = var19;
              int discarded$2 = 918;
              var5 = ib.a(((u) this).field_Q);
              var6 = jn.a(var19, new int[2], -78, (se) (Object) db.field_v);
              var7 = var6.length * db.field_v.field_H - -la.field_b.field_H - -42;
              if (0 >= pb.field_G) {
                if (0 != (1 & ((u) this).field_Q.field_x)) {
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
              if (0 == gm.field_d.field_e) {
                if (0 != (((u) this).field_Q.field_x & 2)) {
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
              if (var6.length <= var15) {
                L4: {
                  var14 = var14 + (la.field_b.field_H - -2);
                  if (var8 == 0) {
                    if (var9 == 0) {
                      int discarded$3 = 30496;
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
                var14 += 4;
                var12.e();
                var15 = -45 + var7;
                gf.a();
                var11.e(0, 0, 16744448);
                gk.a(52, ((u) this).field_Q, 95, 16744448, var14);
                rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                var13.e();
                gf.a();
                var11.e(0, 0, 12690143);
                gk.a(52, ((u) this).field_Q, 118, 10449103, var14);
                rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                var11.e();
                gk.a(52, ((u) this).field_Q, 115, 12632256, var14);
                rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                jh.b();
                var16 = rb.a(16, var12, 255, (byte) 99);
                var17 = rb.a(16, var12, 16711680, (byte) -128);
                ((u) this).a(var12, var11, var17, var13, (byte) 106, var16);
                ((u) this).field_n = (en) (Object) new fc(((u) this).field_Q);
                if (var10 != 0) {
                  ((u) this).field_w = false;
                  break L0;
                } else {
                  return;
                }
              } else {
                L5: {
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
                    break L5;
                  } else {
                    stackOut_16_0 = (gp) (Object) stackIn_16_0;
                    stackOut_16_1 = (String) (Object) stackIn_16_1;
                    stackOut_16_2 = 0;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_18_2 = stackOut_16_2;
                    break L5;
                  }
                }
                L6: {
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
                    break L6;
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
                    break L6;
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
          L7: {
            var4 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var4;
            stackOut_31_1 = new StringBuilder().append("u.<init>(").append(param0).append(44).append(param1).append(44);
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param2 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L7;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L7;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 41);
        }
    }

    final static void a(int param0, lb param1) {
        RuntimeException var2 = null;
        int var4 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        var4 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (um.field_i != null) {
                break L1;
              } else {
                um.field_i = new hb[8];
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("u.B(").append(1).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        cn var8 = null;
        int var9 = 0;
        int var10 = 0;
        cn var13 = null;
        cn stackIn_12_0 = null;
        cn stackOut_11_0 = null;
        Object stackOut_10_0 = null;
        var4 = -3 + ((u) this).field_t - -param0;
        var5 = -3 + (param2 + ((u) this).field_i);
        var6 = ((u) this).field_q + var4 + 5;
        var7 = ((u) this).field_x + var5 - -5;
        if (var4 <= gf.field_h) {
          if (gf.field_e >= var5) {
            if (gf.field_j <= var6) {
              if (gf.field_f <= var7) {
                L0: {
                  gf.b(var4, var5, 5 + ((u) this).field_q, ((u) this).field_x + 5, 0, 128);
                  super.b(param0, param1, param2);
                  if (null != ((u) this).field_Q.field_e) {
                    stackOut_11_0 = ((u) this).field_Q.field_e.a(40, 0, 40, 0);
                    stackIn_12_0 = stackOut_11_0;
                    break L0;
                  } else {
                    stackOut_10_0 = null;
                    stackIn_12_0 = (cn) (Object) stackOut_10_0;
                    break L0;
                  }
                }
                var13 = stackIn_12_0;
                var8 = var13;
                var9 = ((u) this).field_x + var5 - 42;
                var10 = 5 + var4;
                if (var13 == null) {
                  gf.b(var10, var9, 32, 32, 0);
                  return;
                } else {
                  var13.c(var10, var9);
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static String a(se param0, byte param1, String param2, int param3, int param4, int param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var6_int = 106 % ((-21 - param1) / 43);
            int discarded$2 = 0;
            stackOut_0_0 = ia.a(param5, param0, an.a(param4, (byte) -109, param3, param2));
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var6;
            stackOut_2_1 = new StringBuilder().append("u.C(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44).append(param1).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_1_0;
    }

    public static void c() {
        field_R = null;
        field_S = null;
        field_T = null;
        int var1 = 52;
        field_U = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_S = "<col=8B1717>Disarm</col>";
        field_U = new ad(7, 0, 1, 1);
        field_R = "Monster attacks.";
    }
}
