/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk {
    static String field_b;
    private int field_i;
    private boolean field_f;
    private int field_c;
    private int field_d;
    bi field_g;
    static String[] field_a;
    private int field_j;
    bi[] field_h;
    private int field_e;

    final wk a(bi[] param0, int param1) {
        ((wk) this).field_h = param0;
        if (param1 > -62) {
            return null;
        }
        return (wk) this;
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        int var1 = -11 % ((-6 - param0) / 63);
    }

    final static void a(boolean param0, boolean param1) {
        wa.a((byte) 109, param1, param0);
    }

    final wk a(byte param0, int param1) {
        if (param0 <= 47) {
            return null;
        }
        ((wk) this).field_c = param1;
        return (wk) this;
    }

    final static boolean a(int param0, CharSequence param1, int param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var12 = ShatteredPlansClient.field_F ? 1 : 0;
          if (-3 < (param0 ^ -1)) {
            break L0;
          } else {
            if ((param0 ^ -1) < -37) {
              break L0;
            } else {
              var4 = 0;
              var5 = 0;
              var6 = 0;
              var7 = param1.length();
              var8 = -2 % ((param2 - 69) / 57);
              var9 = 0;
              L1: while (true) {
                if (var9 >= var7) {
                  return var5 != 0;
                } else {
                  L2: {
                    var10 = param1.charAt(var9);
                    if (-1 == (var9 ^ -1)) {
                      if (var10 != 45) {
                        if (var10 != 43) {
                          break L2;
                        } else {
                          if (!param3) {
                            break L2;
                          } else {
                            var9++;
                            continue L1;
                          }
                        }
                      } else {
                        var4 = 1;
                        var9++;
                        continue L1;
                      }
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      if (var10 < 48) {
                        break L4;
                      } else {
                        if (var10 > 57) {
                          break L4;
                        } else {
                          var10 -= 48;
                          break L3;
                        }
                      }
                    }
                    L5: {
                      if (65 > var10) {
                        break L5;
                      } else {
                        if (var10 <= 90) {
                          var10 -= 55;
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (var10 < 97) {
                      return false;
                    } else {
                      if (122 >= var10) {
                        var10 -= 87;
                        break L3;
                      } else {
                        return false;
                      }
                    }
                  }
                  if (param0 <= var10) {
                    return false;
                  } else {
                    L6: {
                      if (var4 != 0) {
                        var10 = -var10;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var11 = var6 * param0 - -var10;
                    if (var11 / param0 != var6) {
                      return false;
                    } else {
                      var6 = var11;
                      var5 = 1;
                      var9++;
                      continue L1;
                    }
                  }
                }
              }
            }
          }
        }
        throw new IllegalArgumentException("" + param0);
    }

    final wk a(int param0, boolean param1) {
        if (param1) {
            ((wk) this).field_e = 102;
        }
        ((wk) this).field_j = param0;
        return (wk) this;
    }

    final static int a(int param0, String param1, nq param2, int[] param3) {
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = null;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (rm.field_g != null) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    rm.field_g = new String[32];
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    try {
                        var4 = param2.a(param1, param3, rm.field_g);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    arrayIndexOutOfBoundsException = (ArrayIndexOutOfBoundsException) (Object) caughtException;
                    if (-1025 < (rm.field_g.length ^ -1)) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    return -1;
                }
                case 6: {
                    rm.field_g = new String[rm.field_g.length << 1699380865];
                    statePc = 2;
                    continue stateLoop;
                }
                case 7: {
                    if (param0 == -9615) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    return 47;
                }
                case 9: {
                    return var4;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(vg param0, wk param1, gn param2, int param3, int param4, int param5) {
        if (((wk) this).field_f) {
            param1.a(param3, true, param0, param5, param2);
            param1.a(false);
        }
        if (!(null == ((wk) this).field_g)) {
            param1.field_g = ((wk) this).field_g;
        }
        if ((((wk) this).field_e ^ -1) <= param4) {
            param1.field_e = ((wk) this).field_e;
        }
        if (!(((wk) this).field_h == null)) {
            param1.field_h = ((wk) this).field_h;
        }
        if (!(((wk) this).field_c < -1)) {
            param1.field_c = ((wk) this).field_c;
        }
        if (!(-2147483648 == ((wk) this).field_i)) {
            param1.field_i = ((wk) this).field_i;
        }
        if (-2147483648 != ((wk) this).field_j) {
            param1.field_j = ((wk) this).field_j;
        }
        if (!(-2147483648 == ((wk) this).field_d)) {
            param1.field_d = ((wk) this).field_d;
        }
    }

    final void a(boolean param0) {
        ((wk) this).field_h = null;
        if (param0) {
            wk discarded$0 = ((wk) this).a(15, true);
        }
        ((wk) this).field_c = 0;
        ((wk) this).field_g = null;
        ((wk) this).field_e = -1;
        ((wk) this).field_i = 0;
        ((wk) this).field_j = 0;
        ((wk) this).field_d = 256;
    }

    final void a(byte param0, wk param1) {
        param1.field_j = ((wk) this).field_j;
        param1.field_h = ((wk) this).field_h;
        param1.field_d = ((wk) this).field_d;
        param1.field_g = ((wk) this).field_g;
        param1.field_f = ((wk) this).field_f;
        param1.field_e = ((wk) this).field_e;
        if (param0 <= 39) {
            ((wk) this).field_i = 24;
        }
        param1.field_i = ((wk) this).field_i;
        param1.field_c = ((wk) this).field_c;
    }

    final static void a(byte param0, java.awt.Component param1) {
        param1.addMouseListener((java.awt.event.MouseListener) (Object) pd.field_j);
        if (param0 != -58) {
            return;
        }
        param1.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) pd.field_j);
        param1.addFocusListener((java.awt.event.FocusListener) (Object) pd.field_j);
    }

    final wk a(boolean param0, int param1) {
        if (param1 != -28639) {
            ((wk) this).field_h = null;
        }
        ((wk) this).field_f = param0 ? true : false;
        return (wk) this;
    }

    final wk a(int param0, int param1) {
        ((wk) this).field_e = param0;
        if (param1 != 1) {
            Object var4 = null;
            ((wk) this).a(-68, false, (vg) null, 40, (gn) null);
        }
        return (wk) this;
    }

    final void a(int param0, boolean param1, vg param2, int param3, gn param4) {
        int var6_int = 0;
        String var6 = null;
        int var7 = 0;
        nq stackIn_20_0 = null;
        String stackIn_20_1 = null;
        nq stackIn_21_0 = null;
        String stackIn_21_1 = null;
        nq stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        nq stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        int stackIn_23_4 = 0;
        int stackIn_23_5 = 0;
        nq stackIn_24_0 = null;
        String stackIn_24_1 = null;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        int stackIn_24_4 = 0;
        int stackIn_24_5 = 0;
        nq stackIn_25_0 = null;
        String stackIn_25_1 = null;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        int stackIn_25_6 = 0;
        nq stackIn_26_0 = null;
        String stackIn_26_1 = null;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        int stackIn_26_4 = 0;
        int stackIn_26_5 = 0;
        int stackIn_26_6 = 0;
        int stackIn_26_7 = 0;
        nq stackIn_27_0 = null;
        String stackIn_27_1 = null;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        int stackIn_27_4 = 0;
        int stackIn_27_5 = 0;
        int stackIn_27_6 = 0;
        int stackIn_27_7 = 0;
        nq stackIn_28_0 = null;
        String stackIn_28_1 = null;
        int stackIn_28_2 = 0;
        int stackIn_28_3 = 0;
        int stackIn_28_4 = 0;
        int stackIn_28_5 = 0;
        int stackIn_28_6 = 0;
        int stackIn_28_7 = 0;
        int stackIn_28_8 = 0;
        nq stackOut_19_0 = null;
        String stackOut_19_1 = null;
        nq stackOut_21_0 = null;
        String stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        nq stackOut_20_0 = null;
        String stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        nq stackOut_22_0 = null;
        String stackOut_22_1 = null;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        int stackOut_22_4 = 0;
        int stackOut_22_5 = 0;
        nq stackOut_24_0 = null;
        String stackOut_24_1 = null;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        int stackOut_24_4 = 0;
        int stackOut_24_5 = 0;
        int stackOut_24_6 = 0;
        nq stackOut_23_0 = null;
        String stackOut_23_1 = null;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        int stackOut_23_4 = 0;
        int stackOut_23_5 = 0;
        int stackOut_23_6 = 0;
        nq stackOut_25_0 = null;
        String stackOut_25_1 = null;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        int stackOut_25_4 = 0;
        int stackOut_25_5 = 0;
        int stackOut_25_6 = 0;
        int stackOut_25_7 = 0;
        nq stackOut_27_0 = null;
        String stackOut_27_1 = null;
        int stackOut_27_2 = 0;
        int stackOut_27_3 = 0;
        int stackOut_27_4 = 0;
        int stackOut_27_5 = 0;
        int stackOut_27_6 = 0;
        int stackOut_27_7 = 0;
        int stackOut_27_8 = 0;
        nq stackOut_26_0 = null;
        String stackOut_26_1 = null;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        int stackOut_26_4 = 0;
        int stackOut_26_5 = 0;
        int stackOut_26_6 = 0;
        int stackOut_26_7 = 0;
        int stackOut_26_8 = 0;
        L0: {
          em.a(param2.field_n, param2.field_x, 7, param2.field_q + param3, ((wk) this).field_h, param2.field_m + param0);
          if (null != ((wk) this).field_g) {
            L1: {
              var6_int = param0 + (param2.field_m + ((wk) this).field_i);
              if ((param4.field_r ^ -1) != -2) {
                break L1;
              } else {
                var6_int = var6_int + (-((wk) this).field_g.field_o + param2.field_x) / 2;
                break L1;
              }
            }
            L2: {
              var7 = param2.field_q + param3 + ((wk) this).field_j;
              if (2 == param4.field_r) {
                var6_int = var6_int + (-((wk) this).field_g.field_o + param2.field_x);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param4.field_l == 1) {
                var7 = var7 + (-((wk) this).field_g.field_p + param2.field_n) / 2;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (2 == param4.field_l) {
                var7 = var7 + (param2.field_n + -((wk) this).field_g.field_p);
                break L4;
              } else {
                break L4;
              }
            }
            ((wk) this).field_g.f(var6_int, var7);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1) {
          L5: {
            var6 = param4.b(param1, param2);
            if (var6 == null) {
              break L5;
            } else {
              if (param4.field_c == null) {
                break L5;
              } else {
                if (((wk) this).field_c > -1) {
                  break L5;
                } else {
                  L6: {
                    stackOut_19_0 = param4.field_c;
                    stackOut_19_1 = (String) var6;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_21_1 = stackOut_19_1;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    if (2147483647 == ((wk) this).field_i) {
                      stackOut_21_0 = (nq) (Object) stackIn_21_0;
                      stackOut_21_1 = (String) (Object) stackIn_21_1;
                      stackOut_21_2 = 0;
                      stackIn_22_0 = stackOut_21_0;
                      stackIn_22_1 = stackOut_21_1;
                      stackIn_22_2 = stackOut_21_2;
                      break L6;
                    } else {
                      stackOut_20_0 = (nq) (Object) stackIn_20_0;
                      stackOut_20_1 = (String) (Object) stackIn_20_1;
                      stackOut_20_2 = ((wk) this).field_i;
                      stackIn_22_0 = stackOut_20_0;
                      stackIn_22_1 = stackOut_20_1;
                      stackIn_22_2 = stackOut_20_2;
                      break L6;
                    }
                  }
                  L7: {
                    stackOut_22_0 = (nq) (Object) stackIn_22_0;
                    stackOut_22_1 = (String) (Object) stackIn_22_1;
                    stackOut_22_2 = stackIn_22_2 + (param4.field_o + param0) + param2.field_m;
                    stackOut_22_3 = param3;
                    stackOut_22_4 = -param2.field_q;
                    stackOut_22_5 = -param4.field_b;
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_24_1 = stackOut_22_1;
                    stackIn_24_2 = stackOut_22_2;
                    stackIn_24_3 = stackOut_22_3;
                    stackIn_24_4 = stackOut_22_4;
                    stackIn_24_5 = stackOut_22_5;
                    stackIn_23_0 = stackOut_22_0;
                    stackIn_23_1 = stackOut_22_1;
                    stackIn_23_2 = stackOut_22_2;
                    stackIn_23_3 = stackOut_22_3;
                    stackIn_23_4 = stackOut_22_4;
                    stackIn_23_5 = stackOut_22_5;
                    if (2147483647 == (((wk) this).field_j ^ -1)) {
                      stackOut_24_0 = (nq) (Object) stackIn_24_0;
                      stackOut_24_1 = (String) (Object) stackIn_24_1;
                      stackOut_24_2 = stackIn_24_2;
                      stackOut_24_3 = stackIn_24_3;
                      stackOut_24_4 = stackIn_24_4;
                      stackOut_24_5 = stackIn_24_5;
                      stackOut_24_6 = 0;
                      stackIn_25_0 = stackOut_24_0;
                      stackIn_25_1 = stackOut_24_1;
                      stackIn_25_2 = stackOut_24_2;
                      stackIn_25_3 = stackOut_24_3;
                      stackIn_25_4 = stackOut_24_4;
                      stackIn_25_5 = stackOut_24_5;
                      stackIn_25_6 = stackOut_24_6;
                      break L7;
                    } else {
                      stackOut_23_0 = (nq) (Object) stackIn_23_0;
                      stackOut_23_1 = (String) (Object) stackIn_23_1;
                      stackOut_23_2 = stackIn_23_2;
                      stackOut_23_3 = stackIn_23_3;
                      stackOut_23_4 = stackIn_23_4;
                      stackOut_23_5 = stackIn_23_5;
                      stackOut_23_6 = ((wk) this).field_j;
                      stackIn_25_0 = stackOut_23_0;
                      stackIn_25_1 = stackOut_23_1;
                      stackIn_25_2 = stackOut_23_2;
                      stackIn_25_3 = stackOut_23_3;
                      stackIn_25_4 = stackOut_23_4;
                      stackIn_25_5 = stackOut_23_5;
                      stackIn_25_6 = stackOut_23_6;
                      break L7;
                    }
                  }
                  L8: {
                    stackOut_25_0 = (nq) (Object) stackIn_25_0;
                    stackOut_25_1 = (String) (Object) stackIn_25_1;
                    stackOut_25_2 = stackIn_25_2;
                    stackOut_25_3 = stackIn_25_3 - (stackIn_25_4 + (stackIn_25_5 - stackIn_25_6));
                    stackOut_25_4 = -param4.field_g + (param2.field_x - param4.field_o);
                    stackOut_25_5 = param2.field_n + -param4.field_b - param4.field_f;
                    stackOut_25_6 = ((wk) this).field_c;
                    stackOut_25_7 = ((wk) this).field_e;
                    stackIn_27_0 = stackOut_25_0;
                    stackIn_27_1 = stackOut_25_1;
                    stackIn_27_2 = stackOut_25_2;
                    stackIn_27_3 = stackOut_25_3;
                    stackIn_27_4 = stackOut_25_4;
                    stackIn_27_5 = stackOut_25_5;
                    stackIn_27_6 = stackOut_25_6;
                    stackIn_27_7 = stackOut_25_7;
                    stackIn_26_0 = stackOut_25_0;
                    stackIn_26_1 = stackOut_25_1;
                    stackIn_26_2 = stackOut_25_2;
                    stackIn_26_3 = stackOut_25_3;
                    stackIn_26_4 = stackOut_25_4;
                    stackIn_26_5 = stackOut_25_5;
                    stackIn_26_6 = stackOut_25_6;
                    stackIn_26_7 = stackOut_25_7;
                    if (2147483647 == (((wk) this).field_d ^ -1)) {
                      stackOut_27_0 = (nq) (Object) stackIn_27_0;
                      stackOut_27_1 = (String) (Object) stackIn_27_1;
                      stackOut_27_2 = stackIn_27_2;
                      stackOut_27_3 = stackIn_27_3;
                      stackOut_27_4 = stackIn_27_4;
                      stackOut_27_5 = stackIn_27_5;
                      stackOut_27_6 = stackIn_27_6;
                      stackOut_27_7 = stackIn_27_7;
                      stackOut_27_8 = 256;
                      stackIn_28_0 = stackOut_27_0;
                      stackIn_28_1 = stackOut_27_1;
                      stackIn_28_2 = stackOut_27_2;
                      stackIn_28_3 = stackOut_27_3;
                      stackIn_28_4 = stackOut_27_4;
                      stackIn_28_5 = stackOut_27_5;
                      stackIn_28_6 = stackOut_27_6;
                      stackIn_28_7 = stackOut_27_7;
                      stackIn_28_8 = stackOut_27_8;
                      break L8;
                    } else {
                      stackOut_26_0 = (nq) (Object) stackIn_26_0;
                      stackOut_26_1 = (String) (Object) stackIn_26_1;
                      stackOut_26_2 = stackIn_26_2;
                      stackOut_26_3 = stackIn_26_3;
                      stackOut_26_4 = stackIn_26_4;
                      stackOut_26_5 = stackIn_26_5;
                      stackOut_26_6 = stackIn_26_6;
                      stackOut_26_7 = stackIn_26_7;
                      stackOut_26_8 = ((wk) this).field_d;
                      stackIn_28_0 = stackOut_26_0;
                      stackIn_28_1 = stackOut_26_1;
                      stackIn_28_2 = stackOut_26_2;
                      stackIn_28_3 = stackOut_26_3;
                      stackIn_28_4 = stackOut_26_4;
                      stackIn_28_5 = stackOut_26_5;
                      stackIn_28_6 = stackOut_26_6;
                      stackIn_28_7 = stackOut_26_7;
                      stackIn_28_8 = stackOut_26_8;
                      break L8;
                    }
                  }
                  int discarded$1 = ((nq) (Object) stackIn_28_0).a(stackIn_28_1, stackIn_28_2, stackIn_28_3, stackIn_28_4, stackIn_28_5, stackIn_28_6, stackIn_28_7, stackIn_28_8, param4.field_r, param4.field_l, param4.field_j);
                  break L5;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final wk a(int param0, byte param1) {
        ((wk) this).field_i = param0;
        if (param1 <= 86) {
            ((wk) this).field_f = true;
        }
        return (wk) this;
    }

    wk() {
        ((wk) this).field_c = -2;
        ((wk) this).field_j = -2147483648;
        ((wk) this).field_f = false;
        ((wk) this).field_d = -2147483648;
        ((wk) this).field_i = -2147483648;
        ((wk) this).field_g = null;
        ((wk) this).field_e = -2;
        ((wk) this).field_h = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Ignore";
        field_a = new String[]{"(Old) Standard", "(Old) Cautious", "Tutorial", "Standard", "Aggressive", "Reckless", "Isolationist", "Defensive", "Task"};
    }
}
