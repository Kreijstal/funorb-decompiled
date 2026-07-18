/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.awt.Frame;

final class pd {
    private rk[] field_d;
    private int field_a;
    String field_g;
    float field_b;
    private int field_c;
    static String field_h;
    static int[] field_f;
    private int field_i;
    static String field_e;

    final boolean a(int param0) {
        int var3 = 0;
        rk var4 = null;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 == 28296) {
          L0: while (true) {
            if (((pd) this).field_a <= ((pd) this).field_c) {
              return true;
            } else {
              var4 = ((pd) this).field_d[((pd) this).field_c];
              if (!var4.field_e.a(-72)) {
                this.a(1, 0, var4);
                return false;
              } else {
                L1: {
                  if (var4.field_c < 0) {
                    break L1;
                  } else {
                    if (var4.field_e.a(false, var4.field_c)) {
                      break L1;
                    } else {
                      this.a(1, var4.field_e.b(var4.field_c, 11619), var4);
                      return false;
                    }
                  }
                }
                L2: {
                  if (var4.field_i == null) {
                    break L2;
                  } else {
                    if (var4.field_e.a(0, var4.field_i)) {
                      break L2;
                    } else {
                      this.a(1, var4.field_e.a(var4.field_i, (byte) -81), var4);
                      return false;
                    }
                  }
                }
                L3: {
                  if (var4.field_c >= 0) {
                    break L3;
                  } else {
                    if (var4.field_i != null) {
                      break L3;
                    } else {
                      if (null == var4.field_b) {
                        break L3;
                      } else {
                        if (var4.field_e.b(0)) {
                          break L3;
                        } else {
                          this.a(1, var4.field_e.b(true), var4);
                          return false;
                        }
                      }
                    }
                  }
                }
                ((pd) this).field_c = ((pd) this).field_c + 1;
                continue L0;
              }
            }
          }
        } else {
          return true;
        }
    }

    final static boolean a(int param0, CharSequence param1, int param2, boolean param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_36_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_35_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_23_0 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var11 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            var7 = param1.length();
            var8 = 0;
            L1: while (true) {
              if (var8 >= var7) {
                stackOut_35_0 = var5;
                stackIn_36_0 = stackOut_35_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    var9 = param1.charAt(var8);
                    if (var8 != 0) {
                      break L3;
                    } else {
                      if (45 != var9) {
                        if (var9 != 43) {
                          break L3;
                        } else {
                          break L2;
                        }
                      } else {
                        var4_int = 1;
                        break L2;
                      }
                    }
                  }
                  L4: {
                    L5: {
                      if (var9 < 48) {
                        break L5;
                      } else {
                        if (var9 > 57) {
                          break L5;
                        } else {
                          var9 -= 48;
                          break L4;
                        }
                      }
                    }
                    L6: {
                      if (var9 < 65) {
                        break L6;
                      } else {
                        if (var9 > 90) {
                          break L6;
                        } else {
                          var9 -= 55;
                          break L4;
                        }
                      }
                    }
                    if (var9 < 97) {
                      stackOut_19_0 = 0;
                      stackIn_20_0 = stackOut_19_0;
                      return stackIn_20_0 != 0;
                    } else {
                      if (var9 <= 122) {
                        var9 -= 87;
                        break L4;
                      } else {
                        return false;
                      }
                    }
                  }
                  if (10 > var9) {
                    L7: {
                      if (var4_int == 0) {
                        break L7;
                      } else {
                        var9 = -var9;
                        break L7;
                      }
                    }
                    var10 = var9 + 10 * var6;
                    if (var10 / 10 != var6) {
                      stackOut_29_0 = 0;
                      stackIn_30_0 = stackOut_29_0;
                      return stackIn_30_0 != 0;
                    } else {
                      var5 = 1;
                      var6 = var10;
                      break L2;
                    }
                  } else {
                    stackOut_23_0 = 0;
                    stackIn_24_0 = stackOut_23_0;
                    return stackIn_24_0 != 0;
                  }
                }
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var4;
            stackOut_37_1 = new StringBuilder().append("pd.A(").append(65).append(',');
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param1 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L8;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L8;
            }
          }
          throw la.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + ',' + 10 + ',' + true + ')');
        }
        return stackIn_36_0 != 0;
    }

    final static void a(boolean param0) {
        if (!(qb.field_b)) {
            return;
        }
        if (ck.field_b < 0) {
            return;
        }
        int var1 = jk.field_u * th.field_o[ck.field_b] / 30;
        if (var1 > th.field_o[ck.field_b]) {
            var1 = th.field_o[ck.field_b];
        }
        vh.field_E[ck.field_b].b(sl.field_k[ck.field_b], -((var1 + -th.field_o[ck.field_b]) / 2) + si.field_v[ck.field_b], m.field_e[ck.field_b], var1);
    }

    private final void a(int param0, int param1, rk param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              var4_float = (float)param1 / 100.0f + (float)(1 + ((pd) this).field_c);
              ((pd) this).field_b = var4_float * (float)((pd) this).field_i / (float)(1 + ((pd) this).field_a);
              if (0 == param1) {
                ((pd) this).field_g = param2.field_f;
                break L1;
              } else {
                ((pd) this).field_g = param2.field_b + " - " + param1 + "%";
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("pd.D(").append(1).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    public static void a(byte param0) {
        field_h = null;
        field_f = null;
        int var1 = 0;
        field_e = null;
    }

    private pd() throws Throwable {
        throw new Error();
    }

    final static java.awt.Frame a(int param0, int param1, md param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        eg[] var6_array = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        eg[] var10 = null;
        ic var11 = null;
        Object stackIn_25_0 = null;
        java.awt.Frame stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.awt.Frame stackOut_26_0 = null;
        Object stackOut_24_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (param2.a(2)) {
              L1: {
                if (param4 == 0) {
                  var10 = eg.a(param2, true);
                  var6_array = var10;
                  if (var6_array != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var10.length <= var8) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          return null;
                        }
                      } else {
                        L3: {
                          if (var10[var8].field_a != 640) {
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var8++;
                        continue L2;
                      }
                    }
                  } else {
                    return null;
                  }
                } else {
                  break L1;
                }
              }
              var11 = param2.a(640, 480, false, 0, param4);
              L4: while (true) {
                if (var11.field_g != 0) {
                  var7 = (java.awt.Frame) var11.field_b;
                  if (var7 != null) {
                    if (var11.field_g != 2) {
                      stackOut_26_0 = (java.awt.Frame) var7;
                      stackIn_27_0 = stackOut_26_0;
                      break L0;
                    } else {
                      rk.a(param2, var7, false);
                      stackOut_24_0 = null;
                      stackIn_25_0 = stackOut_24_0;
                      return (java.awt.Frame) (Object) stackIn_25_0;
                    }
                  } else {
                    return null;
                  }
                } else {
                  em.a(10L, false);
                  continue L4;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var6;
            stackOut_28_1 = new StringBuilder().append("pd.F(").append(0).append(',').append(0).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L5;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L5;
            }
          }
          throw la.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + 640 + ',' + param4 + ',' + 480 + ')');
        }
        return stackIn_27_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "If you do nothing the game will revert to normal view in <%0> second.";
        field_e = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}
