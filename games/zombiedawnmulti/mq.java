/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.Class;

final class mq extends nc {
    static cj field_l;
    static String field_q;
    static String field_p;
    static int field_r;
    static String field_o;
    private int field_n;
    private int field_t;
    private int[] field_s;
    private int[] field_m;

    final int d(int param0, int param1) {
        L0: {
          if (param0 < -65) {
            break L0;
          } else {
            field_p = null;
            break L0;
          }
        }
        L1: {
          if (!wc.j(106)) {
            break L1;
          } else {
            if (((mq) this).field_d != 6) {
              if (param1 != 0) {
                return 100 + ((mq) this).a((byte) -118, param1);
              } else {
                return 350 + ((mq) this).a((byte) -118, param1);
              }
            } else {
              break L1;
            }
          }
        }
        return ((mq) this).a((byte) -118, param1) - -((mq) this).field_k;
    }

    final void a(boolean param0) {
        String[] var3 = null;
        String var4 = null;
        String var5 = null;
        sl var6 = null;
        ef var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        ri var10 = null;
        int var11 = 0;
        int var12 = 0;
        ri var12_ref_ri = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        String[] var19 = null;
        L0: {
          var18 = ZombieDawnMulti.field_E ? 1 : 0;
          super.a(param0);
          var19 = dg.field_G;
          var3 = ih.field_e;
          var4 = vg.field_n;
          var5 = nk.field_q;
          var6 = ah.field_e;
          var7 = pb.field_e;
          if (((mq) this).field_d == 6) {
            var7.b(sn.field_Mb, 320, 300, 16777215, 0);
            break L0;
          } else {
            break L0;
          }
        }
        var8 = ng.field_e;
        var9 = 0;
        L1: while (true) {
          if (sf.field_b <= var9) {
            L2: {
              var7.b(kb.field_E, 320, var8 - -72, 16777215, 0);
              var7.b(vk.field_G, 320, 18 + (40 + (var8 + 32)), 14540083, 0);
              var9 = -1;
              if (((mq) this).field_t == -1) {
                if (-1 == ((mq) this).field_n) {
                  break L2;
                } else {
                  var9 = ((mq) this).field_n;
                  break L2;
                }
              } else {
                var9 = ((mq) this).field_t;
                break L2;
              }
            }
            L3: {
              if (var9 != -1) {
                var10 = this.g(0, var9);
                var10.a(110, 140);
                int discarded$1 = var6.a(var19[var9], 260, 105, 300, 85, 0, 0, 1, 2, 35);
                var11 = 280;
                var12 = 200;
                var13 = 280;
                var14 = 100;
                var15 = var7.field_C - -var7.field_r;
                var16 = var15 * var7.a(var3[var9], var11, var12, var13, var14, 16777215, 0, 0, 0, var15);
                var12 = var12 + (var16 - (-var15 + -6));
                var7.c(var5 + 100 * ra.field_n[var9], var11, var12, 16777215, 0);
                var12 = var12 + (6 + var15);
                var7.c(var4, var11, var12, 16777215, 0);
                var11 = var11 + var7.a(var4);
                var17 = 0;
                L4: while (true) {
                  if (ra.field_n[var9] <= var17) {
                    break L3;
                  } else {
                    of.field_k.g(var17 * (of.field_k.field_z >> 1) + var11, 2 + -of.field_k.field_u + var12);
                    var17++;
                    continue L4;
                  }
                }
              } else {
                break L3;
              }
            }
            return;
          } else {
            L5: {
              if (((mq) this).field_d != 6) {
                break L5;
              } else {
                if (this.h(var9, 86)) {
                  break L5;
                } else {
                  var9++;
                  continue L1;
                }
              }
            }
            if (this.f(-1, var9)) {
              L6: {
                var10_int = ((mq) this).field_m[var9];
                var11 = ((mq) this).field_s[var9];
                if (((mq) this).field_t == var9) {
                  oo.b(-3 + var10_int, -3 + var11, 38, 38, 6, 0, 128);
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (((mq) this).field_n != var9) {
                  break L7;
                } else {
                  oo.b(var10_int + -3, var11 + -3, 38, 38, 6, 16777215);
                  break L7;
                }
              }
              var12_ref_ri = this.g(0, var9);
              var12_ref_ri.b(var10_int, var11);
              var9++;
              continue L1;
            } else {
              var9++;
              continue L1;
            }
          }
        }
    }

    final void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var15 = null;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        super.a(0, param1, param2);
        ((mq) this).field_m = new int[sf.field_b];
        ((mq) this).field_s = new int[sf.field_b];
        ((mq) this).field_t = -1;
        ((mq) this).field_n = -1;
        var4 = 0;
        var5 = 0;
        L0: while (true) {
          if (var5 >= sf.field_b) {
            sf.field_a = (640 - (sf.field_g - 8) * var4 - (var4 - 1) * (-sf.field_g + sf.field_e)) / 2;
            var5 = sf.field_a;
            var6 = ng.field_e;
            var7 = param0;
            var8 = 0;
            L1: while (true) {
              if (var8 >= sf.field_b) {
                return;
              } else {
                if (this.f(~param0, var8)) {
                  L2: {
                    var9 = var5;
                    var10 = var6;
                    ((mq) this).field_m[var8] = var9;
                    if (var7 % 2 != 1) {
                      break L2;
                    } else {
                      var10 += 24;
                      break L2;
                    }
                  }
                  var7++;
                  ((mq) this).field_s[var8] = var10;
                  var5 = var5 + (sf.field_e - 8);
                  var8++;
                  continue L1;
                } else {
                  var15 = ((mq) this).field_m;
                  var10 = var8;
                  ((mq) this).field_s[var8] = -100;
                  var15[var10] = -100;
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            if (this.f(-1, var5)) {
              var4++;
              var5++;
              continue L0;
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    final int a(byte param0, int param1) {
        if (!(((mq) this).field_d != 6)) {
            return param1 != 0 ? 350 : 100;
        }
        if (param0 != -118) {
            return 51;
        }
        if (wc.j(108)) {
            return 0 == param1 ? 50 : 470;
        }
        return 320 - (((mq) this).field_k >> 1);
    }

    final static Class a(String param0, byte param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_2_0 = null;
        Class stackIn_6_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_14_0 = null;
        Class stackIn_17_0 = null;
        Class stackIn_21_0 = null;
        Class stackIn_26_0 = null;
        Class stackIn_29_0 = null;
        Class stackIn_31_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        Class stackOut_5_0 = null;
        Class stackOut_9_0 = null;
        Class stackOut_13_0 = null;
        Class stackOut_20_0 = null;
        Class stackOut_30_0 = null;
        Class stackOut_28_0 = null;
        Class stackOut_25_0 = null;
        Class stackOut_16_0 = null;
        Class stackOut_1_0 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        try {
          L0: {
            if (!param0.equals((Object) (Object) "B")) {
              if (param0.equals((Object) (Object) "I")) {
                stackOut_5_0 = Integer.TYPE;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                if (param0.equals((Object) (Object) "S")) {
                  stackOut_9_0 = Short.TYPE;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  if (param0.equals((Object) (Object) "J")) {
                    stackOut_13_0 = Long.TYPE;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  } else {
                    if (!param0.equals((Object) (Object) "Z")) {
                      if (param0.equals((Object) (Object) "F")) {
                        stackOut_20_0 = Float.TYPE;
                        stackIn_21_0 = stackOut_20_0;
                        return stackIn_21_0;
                      } else {
                        L1: {
                          if (param1 < -16) {
                            break L1;
                          } else {
                            mq.e(-4);
                            break L1;
                          }
                        }
                        if (!param0.equals((Object) (Object) "D")) {
                          if (!param0.equals((Object) (Object) "C")) {
                            stackOut_30_0 = Class.forName(param0);
                            stackIn_31_0 = stackOut_30_0;
                            break L0;
                          } else {
                            stackOut_28_0 = Character.TYPE;
                            stackIn_29_0 = stackOut_28_0;
                            return stackIn_29_0;
                          }
                        } else {
                          stackOut_25_0 = Double.TYPE;
                          stackIn_26_0 = stackOut_25_0;
                          return stackIn_26_0;
                        }
                      }
                    } else {
                      stackOut_16_0 = Boolean.TYPE;
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0;
                    }
                  }
                }
              }
            } else {
              stackOut_1_0 = Byte.TYPE;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var2;
            stackOut_32_1 = new StringBuilder().append("mq.A(");
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param0 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L2;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L2;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ',' + param1 + ')');
        }
        return stackIn_31_0;
    }

    public static void e(int param0) {
        field_o = null;
        field_l = null;
        field_q = null;
        field_p = null;
        if (param0 != 22324) {
            mq.e(-115);
        }
    }

    private final ri g(int param0, int param1) {
        if (this.h(param1, 29)) {
            return la.field_l[param1];
        }
        return null;
    }

    private final boolean h(int param0, int param1) {
        if (param1 <= 10) {
            field_l = null;
        }
        int[] var4 = ((mq) this).field_d != 6 ? k.field_n : fc.field_m;
        int[] var3 = var4;
        return fq.a(param0, 127, var4);
    }

    mq(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
        ((mq) this).field_n = -1;
        ((mq) this).field_t = -1;
    }

    private final boolean e(int param0, int param1) {
        return param1 == 13 || param1 == 16;
    }

    private final boolean f(int param0, int param1) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -1) {
            break L0;
          } else {
            ((mq) this).field_n = -73;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.h(param1, 119)) {
              break L2;
            } else {
              if (this.e(-17, param1)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = ZombieDawnMulti.field_E ? 1 : 0;
          super.a(param0);
          ((mq) this).field_n = -1;
          var2 = sf.field_e - sf.field_g >> 1;
          if (ng.field_e >= bo.field_d) {
            break L0;
          } else {
            if (~(ng.field_e - -(2 * sf.field_g)) >= ~bo.field_d) {
              break L0;
            } else {
              if (sf.field_a + -var2 >= bd.field_g) {
                break L0;
              } else {
                var3 = -1;
                var4 = 0;
                L1: while (true) {
                  L2: {
                    if (var4 >= sf.field_b) {
                      break L2;
                    } else {
                      L3: {
                        if (~((mq) this).field_m[var4] < ~bd.field_g) {
                          break L3;
                        } else {
                          if (~(sf.field_g + ((mq) this).field_m[var4]) >= ~bd.field_g) {
                            break L3;
                          } else {
                            if (bo.field_d < ((mq) this).field_s[var4]) {
                              break L3;
                            } else {
                              if (bo.field_d >= sf.field_g + ((mq) this).field_s[var4]) {
                                break L3;
                              } else {
                                var3 = var4;
                                break L2;
                              }
                            }
                          }
                        }
                      }
                      var4++;
                      continue L1;
                    }
                  }
                  L4: {
                    if (~sf.field_b >= ~var3) {
                      break L4;
                    } else {
                      ((mq) this).field_n = var3;
                      break L4;
                    }
                  }
                  if (((mq) this).field_d != 6) {
                    break L0;
                  } else {
                    if (((mq) this).field_n < 0) {
                      break L0;
                    } else {
                      if (!this.h(((mq) this).field_n, 47)) {
                        ((mq) this).field_n = -1;
                        break L0;
                      } else {
                        break L0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        L5: {
          if (kd.field_b != 0) {
            if (((mq) this).field_t != ((mq) this).field_n) {
              if (-1 != ((mq) this).field_n) {
                ((mq) this).field_t = ((mq) this).field_n;
                break L5;
              } else {
                break L5;
              }
            } else {
              ((mq) this).field_t = -1;
              break L5;
            }
          } else {
            break L5;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = 500;
        field_o = "Select a human or enemy zombie!";
        field_p = "Accept <%0> into this game";
        field_q = "Click";
    }
}
