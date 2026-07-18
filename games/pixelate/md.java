/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md extends db {
    static boolean field_Y;
    private String field_ab;
    private int field_X;
    static String field_V;
    private ml field_W;
    private tf field_Z;

    final String b(byte param0) {
        if (param0 > 16) {
            return null;
        }
        ((md) this).field_ab = null;
        return null;
    }

    final static void a(tf param0, tf param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            Pixelate.field_E = param1;
            u.field_f = new tf(Pixelate.field_E.field_A, Pixelate.field_E.field_B);
            u.field_f.c();
            Pixelate.field_E.f(0, 0);
            var3_int = 5395026;
            var4 = t.field_d;
            var5 = 0;
            L1: while (true) {
              if (t.field_k.length <= var5) {
                qa.field_g = new tf(640, 480);
                qa.field_g.c();
                param0.c(0, 0, 255, 80);
                param0.c(320, 0, 255, 80);
                param0.c(0, 240, 80, 0);
                param0.c(320, 240, 80, 0);
                qa.field_f.a(19692);
                break L0;
              } else {
                L2: {
                  if (t.field_k[var5] < var3_int) {
                    t.field_k[var5] = 0;
                    break L2;
                  } else {
                    var6 = -(var5 / t.field_j) + t.field_d;
                    var7 = 255 * var6 / var4;
                    t.field_k[var5] = bq.a(bq.a(var7 << 8, var7 << 16), var7 >> 1);
                    var5++;
                    break L2;
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("md.C(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + 80 + ')');
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        String var5 = null;
        dj var6 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        tf var17 = null;
        Object var18 = null;
        tf var19 = null;
        tf var20 = null;
        tf var21 = null;
        tf var22 = null;
        Object var24 = null;
        tf var25 = null;
        tf var26 = null;
        tf var27 = null;
        af var28 = null;
        af var29 = null;
        L0: {
          L1: {
            var18 = null;
            var24 = null;
            var14 = Pixelate.field_H ? 1 : 0;
            var6 = ((md) this).field_W.a((byte) 113);
            if (var6 == uo.field_b) {
              break L1;
            } else {
              if (tg.field_j == var6) {
                break L1;
              } else {
                var5 = ((md) this).field_W.b((byte) -7);
                if (var5 == null) {
                  var5 = ((md) this).field_ab;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
          var5 = ec.field_m;
          break L0;
        }
        if (var5.equals((Object) (Object) ((md) this).field_q)) {
          L2: {
            super.a(param0, param1, param2, (byte) -25);
            var6 = ((md) this).field_W.a((byte) 97);
            var29 = (af) (Object) ((md) this).field_y;
            var9 = ((md) this).field_z + param2;
            var10 = var29.a(param0, (ng) this, (byte) 107) + (var29.b(-117, (ng) this).b(1) >> 1);
            var11 = -23 / ((param3 - 70) / 49);
            if (var6 == uo.field_b) {
              break L2;
            } else {
              if (tg.field_j == var6) {
                break L2;
              } else {
                if (sk.field_a != var6) {
                  if (var6 == qk.field_g) {
                    var25 = ha.field_g[1];
                    var25.b(var9, var10 + -(var25.field_E >> 1), 256);
                    return;
                  } else {
                    return;
                  }
                } else {
                  var26 = ha.field_g[2];
                  var26.b(var9, var10 + -(var26.field_E >> 1), 256);
                  return;
                }
              }
            }
          }
          var27 = ha.field_g[0];
          var12 = var27.field_A << 1;
          var13 = var27.field_B << 1;
          if (null != ((md) this).field_Z) {
            if (((md) this).field_Z.field_F >= var12) {
              if (((md) this).field_Z.field_E < var13) {
                ((md) this).field_Z = new tf(var12, var13);
                h.a(-119, ((md) this).field_Z);
                var27.a(112, 144, var27.field_A << 4, var27.field_B << 4, -((md) this).field_X << 10, 4096);
                int discarded$6 = 92;
                ia.a();
                ((md) this).field_Z.b(-(var27.field_A >> 1) + var9, var10 - var27.field_B, 256);
                return;
              } else {
                h.a(-72, ((md) this).field_Z);
                t.d();
                var27.a(112, 144, var27.field_A << 4, var27.field_B << 4, -((md) this).field_X << 10, 4096);
                int discarded$7 = 92;
                ia.a();
                ((md) this).field_Z.b(-(var27.field_A >> 1) + var9, var10 - var27.field_B, 256);
                return;
              }
            } else {
              ((md) this).field_Z = new tf(var12, var13);
              h.a(-119, ((md) this).field_Z);
              var27.a(112, 144, var27.field_A << 4, var27.field_B << 4, -((md) this).field_X << 10, 4096);
              int discarded$8 = 92;
              ia.a();
              ((md) this).field_Z.b(-(var27.field_A >> 1) + var9, var10 - var27.field_B, 256);
              return;
            }
          } else {
            ((md) this).field_Z = new tf(var12, var13);
            h.a(-119, ((md) this).field_Z);
            var27.a(112, 144, var27.field_A << 4, var27.field_B << 4, -((md) this).field_X << 10, 4096);
            int discarded$9 = 92;
            ia.a();
            ((md) this).field_Z.b(-(var27.field_A >> 1) + var9, var10 - var27.field_B, 256);
            return;
          }
        } else {
          ((md) this).field_q = var5;
          ((md) this).a(1829);
          super.a(param0, param1, param2, (byte) -25);
          var6 = ((md) this).field_W.a((byte) 97);
          var28 = (af) (Object) ((md) this).field_y;
          var9 = ((md) this).field_z + param2;
          var10 = var28.a(param0, (ng) this, (byte) 107) + (var28.b(-117, (ng) this).b(1) >> 1);
          var11 = -23 / ((param3 - 70) / 49);
          if (var6 != uo.field_b) {
            if (tg.field_j != var6) {
              if (sk.field_a != var6) {
                if (var6 == qk.field_g) {
                  var21 = ha.field_g[1];
                  var21.b(var9, var10 + -(var21.field_E >> 1), 256);
                  return;
                } else {
                  return;
                }
              } else {
                var22 = ha.field_g[2];
                var22.b(var9, var10 + -(var22.field_E >> 1), 256);
                return;
              }
            } else {
              L3: {
                L4: {
                  var20 = ha.field_g[0];
                  var17 = var20;
                  var12 = var20.field_A << 1;
                  var13 = var20.field_B << 1;
                  if (null == ((md) this).field_Z) {
                    break L4;
                  } else {
                    if (((md) this).field_Z.field_F < var12) {
                      break L4;
                    } else {
                      if (((md) this).field_Z.field_E >= var13) {
                        h.a(-72, ((md) this).field_Z);
                        t.d();
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                ((md) this).field_Z = new tf(var12, var13);
                h.a(-119, ((md) this).field_Z);
                break L3;
              }
              var20.a(112, 144, var20.field_A << 4, var20.field_B << 4, -((md) this).field_X << 10, 4096);
              int discarded$10 = 92;
              ia.a();
              ((md) this).field_Z.b(-(var20.field_A >> 1) + var9, var10 - var20.field_B, 256);
              return;
            }
          } else {
            L5: {
              L6: {
                var19 = ha.field_g[0];
                var12 = var19.field_A << 1;
                var13 = var19.field_B << 1;
                if (null == ((md) this).field_Z) {
                  break L6;
                } else {
                  if (((md) this).field_Z.field_F < var12) {
                    break L6;
                  } else {
                    if (((md) this).field_Z.field_E >= var13) {
                      h.a(-72, ((md) this).field_Z);
                      t.d();
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              ((md) this).field_Z = new tf(var12, var13);
              h.a(-119, ((md) this).field_Z);
              break L5;
            }
            var19.a(112, 144, var19.field_A << 4, var19.field_B << 4, -((md) this).field_X << 10, 4096);
            int discarded$11 = 92;
            ia.a();
            ((md) this).field_Z.b(-(var19.field_A >> 1) + var9, var10 - var19.field_B, 256);
            return;
          }
        }
    }

    final static void a(rh param0) {
        RuntimeException var3 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            de.field_b.a(22125, (fa) (Object) param0);
            int discarded$2 = 3;
            sd.a((byte) -52, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("md.B(");
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
          throw aa.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + true + ',' + 3 + ')');
        }
    }

    final boolean a(ng param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param1 == 27) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              ((md) this).field_W = null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("md.HA(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    public static void c() {
        field_V = null;
    }

    md(ml param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (eb) (Object) ih.a());
        int discarded$0 = 45;
        try {
            ((md) this).field_ab = param1;
            ((md) this).field_W = param0;
            ((md) this).a(param4, (byte) 121, param3, param2, param5);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "md.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(int param0, int param1, int param2, ng param3) {
        try {
            ((md) this).field_X = ((md) this).field_X + 1;
            if (param0 != 40) {
                field_V = null;
            }
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "md.L(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_V = "Accept <%0> into this game";
    }
}
