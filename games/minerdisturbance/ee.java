/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee extends em {
    static String field_K;
    sb field_G;
    static int field_J;
    static String field_E;
    static String field_H;
    int field_D;
    byte field_I;

    final byte[] c(byte param0) {
        Object var3 = null;
        if (param0 == -115) {
          if (!((ee) this).field_C) {
            if (((ee) this).field_G.field_o < ((ee) this).field_G.field_u.length + -((ee) this).field_I) {
              throw new RuntimeException();
            } else {
              return ((ee) this).field_G.field_u;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          var3 = null;
          ee.a((String) null, (String[]) null, (byte) -97, -80);
          if (!((ee) this).field_C) {
            if (((ee) this).field_G.field_o < ((ee) this).field_G.field_u.length + -((ee) this).field_I) {
              throw new RuntimeException();
            } else {
              return ((ee) this).field_G.field_u;
            }
          } else {
            throw new RuntimeException();
          }
        }
    }

    final int f(int param0) {
        if (null == ((ee) this).field_G) {
          return 0;
        } else {
          if (param0 != 100) {
            return -24;
          } else {
            return ((ee) this).field_G.field_o * 100 / (-((ee) this).field_I + ((ee) this).field_G.field_u.length);
          }
        }
    }

    public static void h() {
        field_H = null;
        field_E = null;
        field_K = null;
    }

    final static void i() {
        int discarded$0 = -14933;
        int var1 = ma.o();
        int var2 = ei.n(0);
        rb.field_e.a(var2 - -(rf.field_b << 1), lj.field_p + -rf.field_b, var1 - -(pm.field_c << 1), 26202, cg.field_o - pm.field_c);
        int discarded$1 = -107;
        ik.n();
    }

    final static void a(String param0, String[] param1, byte param2, int param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var5 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (param2 == -98) {
              break L0;
            } else {
              field_E = null;
              break L0;
            }
          }
          ic.field_l = kd.field_p;
          if (param3 != 255) {
            if (100 > param3) {
              int discarded$6 = 1;
              vk.field_g = ij.a(param3, param0);
              return;
            } else {
              if (param3 <= 105) {
                vk.field_g = rh.a(124, param1);
                return;
              } else {
                int discarded$7 = 1;
                vk.field_g = ij.a(param3, param0);
                return;
              }
            }
          } else {
            L1: {
              if (me.field_j >= 13) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L1;
              }
            }
            int discarded$8 = 105;
            vk.field_g = hn.a(stackIn_7_0 != 0);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("ee.B(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          L3: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L3;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static boolean e() {
        int var1_int = 0;
        RuntimeException var1 = null;
        tc var2 = null;
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_34_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_33_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        var3 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (53 != lj.field_t) {
              if (fn.field_o) {
                if (lj.field_t != 13) {
                  L1: {
                    L2: {
                      var1_int = 0;
                      if (!qd.field_O[86]) {
                        break L2;
                      } else {
                        if (qd.field_O[82]) {
                          var1_int = 3;
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    L3: {
                      if (qd.field_O[86]) {
                        break L3;
                      } else {
                        if (!qd.field_O[82]) {
                          break L3;
                        } else {
                          var1_int = 1;
                          break L1;
                        }
                      }
                    }
                    if (!qd.field_O[86]) {
                      break L1;
                    } else {
                      if (qd.field_O[82]) {
                        break L1;
                      } else {
                        var1_int = 2;
                        break L1;
                      }
                    }
                  }
                  var2 = (tc) (Object) ii.field_b.b(103);
                  L4: while (true) {
                    if (var2 == null) {
                      stackOut_33_0 = 0;
                      stackIn_34_0 = stackOut_33_0;
                      break L0;
                    } else {
                      L5: {
                        if (var1_int != var2.field_q) {
                          break L5;
                        } else {
                          if (var2.field_w == lj.field_t) {
                            var2.field_u.a(false);
                            fn.field_o = false;
                            stackOut_28_0 = 1;
                            stackIn_29_0 = stackOut_28_0;
                            return stackIn_29_0 != 0;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var2 = (tc) (Object) ii.field_b.b((byte) 56);
                      continue L4;
                    }
                  }
                } else {
                  fn.field_o = false;
                  stackOut_11_0 = 1;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0 != 0;
                }
              } else {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0 != 0;
              }
            } else {
              L6: {
                if (fn.field_o) {
                  stackOut_4_0 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  break L6;
                } else {
                  stackOut_3_0 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  break L6;
                }
              }
              fn.field_o = stackIn_5_0 != 0;
              stackOut_5_0 = 1;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var1, "ee.D(" + 75 + 41);
        }
        return stackIn_34_0 != 0;
    }

    ee() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "Discard";
        field_J = 256;
        field_H = "Reset Tips";
        field_K = "Return to game";
    }
}
