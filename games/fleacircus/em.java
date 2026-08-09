/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class em extends IOException {
    static int[] field_e;
    static int field_f;
    static String field_a;
    static int field_d;
    static int field_b;
    static String field_h;
    static rh field_c;
    static nd field_g;

    final static void a(int param0) {
        ia.field_p[4] = new int[]{5};
        tk.a(34, 185, new int[]{5}, 455, -119, 4, 383);
        pi.field_b[4] = new t(4);
        tk.a(34, 57, new int[]{8, 9, 10, 5}, 600, -126, 2, 383);
        pi.field_b[2] = new t(2);
        tk.a(34, 165, new int[]{20, 5}, 475, -120, 8, 410);
        pi.field_b[8] = new t(8);
        ia.field_p[6] = new int[]{22};
        tk.a(70, 165, new int[]{22}, 475, -125, 6, 295);
        if (param0 <= -51) {
          pi.field_b[6] = new t(6);
          rh.field_c.field_d = rh.field_c.field_D.field_N * 11;
          if (-1 > (wc.field_q ^ -1)) {
            if (!lf.a(fg.field_q, 31849)) {
              return;
            } else {
              tk.a(34, 155, new int[]{1, 19, 12, 13, 4, 3, 7}, 485, -123, 1, 135);
              pi.field_b[1] = new t(1);
              return;
            }
          } else {
            return;
          }
        } else {
          em.a(19);
          pi.field_b[6] = new t(6);
          rh.field_c.field_d = rh.field_c.field_D.field_N * 11;
          if (-1 <= (wc.field_q ^ -1)) {
            return;
          } else {
            L0: {
              if (lf.a(fg.field_q, 31849)) {
                tk.a(34, 155, new int[]{1, 19, 12, 13, 4, 3, 7}, 485, -123, 1, 135);
                pi.field_b[1] = new t(1);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          }
        }
    }

    final static int a(int param0, boolean param1, int param2) {
        if (df.field_b != null) {
          if (ha.field_l <= param2) {
            if (param2 < ha.field_l + df.field_b.field_w) {
              L0: {
                if (mg.field_e > param0) {
                  break L0;
                } else {
                  if (param0 >= df.field_b.field_t + mg.field_e) {
                    break L0;
                  } else {
                    return 0;
                  }
                }
              }
              L1: {
                if (param2 < mh.field_w) {
                  break L1;
                } else {
                  if (param2 >= mh.field_w - -df.field_b.field_w) {
                    break L1;
                  } else {
                    if (rj.field_o > param0) {
                      break L1;
                    } else {
                      if (df.field_b.field_t + rj.field_o <= param0) {
                        break L1;
                      } else {
                        return 1;
                      }
                    }
                  }
                }
              }
              if (param1) {
                em.b(-117);
                return -1;
              } else {
                return -1;
              }
            } else {
              L2: {
                if (param2 < mh.field_w) {
                  break L2;
                } else {
                  if (param2 >= mh.field_w - -df.field_b.field_w) {
                    break L2;
                  } else {
                    if (rj.field_o > param0) {
                      break L2;
                    } else {
                      if (df.field_b.field_t + rj.field_o <= param0) {
                        break L2;
                      } else {
                        return 1;
                      }
                    }
                  }
                }
              }
              if (param1) {
                em.b(-117);
                return -1;
              } else {
                return -1;
              }
            }
          } else {
            if (param2 >= mh.field_w) {
              if (param2 < mh.field_w - -df.field_b.field_w) {
                L3: {
                  if (rj.field_o > param0) {
                    break L3;
                  } else {
                    if (df.field_b.field_t + rj.field_o <= param0) {
                      break L3;
                    } else {
                      return 1;
                    }
                  }
                }
                if (param1) {
                  em.b(-117);
                  return -1;
                } else {
                  return -1;
                }
              } else {
                if (param1) {
                  em.b(-117);
                  return -1;
                } else {
                  return -1;
                }
              }
            } else {
              if (param1) {
                em.b(-117);
                return -1;
              } else {
                return -1;
              }
            }
          }
        } else {
          return -1;
        }
    }

    em(String param0) {
        super(param0);
    }

    final static String c(int param0) {
        if (!(b.field_e != null)) {
            return "";
        }
        if (param0 != 10158) {
            field_d = -125;
            return b.field_e;
        }
        return b.field_e;
    }

    final static void a(dd param0, byte param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if ((3 & (param0.field_w | param0.field_t | param0.field_q | param0.field_v)) != 0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var2_int = (3 & param0.field_q) + param0.field_w;
                        var2_int = -(3 & var2_int) - (-4 - var2_int);
                        var3 = param0.field_t - -(3 & param0.field_v);
                        var3 = 4 + -(var3 & 3) + var3;
                        var4 = new int[var3 * var2_int];
                        if (param1 < -45) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return;
                }
                case 5: {
                    try {
                        var5 = 0;
                        var6 = (param0.field_v & 3) * var2_int + (3 & param0.field_q);
                        var7 = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var7 >= param0.field_t) {
                            statePc = 15;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var9 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var8 = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (param0.field_w <= var8) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        incrementValue$0 = var6;
                        var6++;
                        incrementValue$1 = var5;
                        var5++;
                        var4[incrementValue$0] = param0.field_B[incrementValue$1];
                        var8++;
                        if (var9 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var9 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var6 = var6 + (var2_int + -param0.field_w);
                        var7++;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var9 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        param0.field_B = var4;
                        param0.field_w = var2_int;
                        param0.field_q = param0.field_q & -4;
                        param0.field_t = var3;
                        param0.field_v = param0.field_v & -4;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_19_0 = (RuntimeException) (var2);
                    stackIn_18_0 = stackIn_19_0;
                    stackIn_19_1 = new StringBuilder().append("em.F(");
                    stackIn_18_1 = stackIn_19_1;
                    if (param0 == null) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackIn_20_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_20_1 = (StringBuilder) ((Object) stackIn_18_1);
                    stackIn_20_2 = "{...}";
                    statePc = 20;
                    continue stateLoop;
                }
                case 19: {
                    stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
                    stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                    stackIn_20_2 = "null";
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    throw pf.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
                }
                case 21: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(byte param0, char param1) {
        if (param0 <= -52) {
          if (param1 >= 48) {
            if (param1 > 57) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_d = 68;
          if (param1 >= 48) {
            if (param1 > 57) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void b(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != 3505) {
          em.b(17);
          field_h = null;
          field_e = null;
          field_g = null;
          return;
        } else {
          field_h = null;
          field_e = null;
          field_g = null;
          return;
        }
    }

    static {
        field_f = 0;
        field_a = "Flea Circus is a puzzle game in which you must direct fleas from their starting location to the level exit. You can do this by placing three different types of item into the level: left slopes, right slopes and blocks.";
        field_b = 0;
        field_h = "<%0>Spider:<%1> eats fleas for breakfast, lunch and dinner. Keep your fleas away from them!";
    }
}
