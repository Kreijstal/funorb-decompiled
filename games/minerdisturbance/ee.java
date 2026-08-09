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
        String[] var3;
        if (param0 == -115) {
          if (!this.field_C) {
            if (this.field_G.field_o < this.field_G.field_u.length + -this.field_I) {
              throw new RuntimeException();
            } else {
              return this.field_G.field_u;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          var3 = (String[]) null;
          ee.a((String) null, (String[]) null, (byte) -97, -80);
          if (!this.field_C) {
            if (this.field_G.field_o < this.field_G.field_u.length + -this.field_I) {
              throw new RuntimeException();
            } else {
              return this.field_G.field_u;
            }
          } else {
            throw new RuntimeException();
          }
        }
    }

    final int f(int param0) {
        if (null == this.field_G) {
          return 0;
        } else {
          if (param0 != 100) {
            return -24;
          } else {
            return this.field_G.field_o * 100 / (-this.field_I + this.field_G.field_u.length);
          }
        }
    }

    public static void h(int param0) {
        field_H = null;
        if (param0 != 256) {
            field_K = (String) null;
            field_E = null;
            field_K = null;
            return;
        }
        field_E = null;
        field_K = null;
    }

    final static void i(int param0) {
        int var1 = ma.o(-14933);
        int var2 = ei.n(param0 ^ param0);
        rb.field_e.a(var2 - -(rf.field_b << 1027286305), lj.field_p + -rf.field_b, var1 - -(pm.field_c << 1067089121), 26202, cg.field_o - pm.field_c);
        ik.n(-107);
    }

    final static void a(String param0, String[] param1, byte param2, int param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (param2 == -98) {
              break L0;
            } else {
              field_E = (String) null;
              break L0;
            }
          }
          ic.field_l = kd.field_p;
          if (-256 != (param3 ^ -1)) {
            if (100 > param3) {
              vk.field_g = ij.a(param3, param0, true);
              return;
            } else {
              if ((param3 ^ -1) >= -106) {
                vk.field_g = rh.a(124, param1);
                return;
              } else {
                vk.field_g = ij.a(param3, param0, true);
                return;
              }
            }
          } else {
            L1: {
              if ((me.field_j ^ -1) <= -14) {
                stackIn_7_0 = 0;
                break L1;
              } else {
                stackIn_7_0 = 1;
                break L1;
              }
            }
            vk.field_g = hn.a(stackIn_7_0 != 0, (byte) 105);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("ee.B(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L3;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static boolean e(byte param0) {
        int var1_int = 0;
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_36_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        tc var2 = null;
        var3 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (53 != lj.field_t) {
              if (fn.field_o) {
                if ((lj.field_t ^ -1) != -14) {
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
                  var2 = (tc) ((Object) ii.field_b.b(103));
                  L4: while (true) {
                    if (var2 == null) {
                      if (param0 == 75) {
                        stackIn_36_0 = 0;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        field_J = -10;
                        return false;
                      }
                    } else {
                      L5: {
                        if (var1_int != var2.field_q) {
                          break L5;
                        } else {
                          if (var2.field_w == lj.field_t) {
                            var2.field_u.a(false);
                            fn.field_o = false;
                            stackIn_31_0 = 1;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var2 = (tc) ((Object) ii.field_b.b((byte) 56));
                      continue L4;
                    }
                  }
                } else {
                  fn.field_o = false;
                  stackIn_12_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_9_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              L6: {
                if (fn.field_o) {
                  stackIn_5_0 = 0;
                  break L6;
                } else {
                  stackIn_5_0 = 1;
                  break L6;
                }
              }
              fn.field_o = stackIn_5_0 != 0;
              stackIn_6_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1), "ee.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_31_0 != 0;
              } else {
                return stackIn_36_0 != 0;
              }
            }
          }
        }
    }

    ee() {
    }

    static {
        field_E = "Discard";
        field_J = 256;
        field_H = "Reset Tips";
        field_K = "Return to game";
    }
}
