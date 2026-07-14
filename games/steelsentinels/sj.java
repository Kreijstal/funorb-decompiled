/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.net.URL;
import java.lang.String;

final class sj extends we {
    static gh field_J;
    static String field_C;
    static int[] field_v;
    static String field_B;
    private int[] field_G;
    private boolean field_H;
    private int field_D;
    private tg field_L;
    private int field_K;
    static wk[] field_x;
    static cm field_y;
    static gh field_z;
    private ic field_O;
    private int[] field_I;
    private ic field_M;
    private tg field_s;
    private int field_E;
    private ic field_t;
    private int field_A;
    static wk field_F;
    private tg field_w;
    static gi field_u;
    private boolean field_N;

    final synchronized int a() {
        return 2;
    }

    public static void b(boolean param0) {
        field_F = null;
        field_y = null;
        field_x = null;
        field_z = null;
        field_B = null;
        field_u = null;
        field_v = null;
        if (param0) {
            Object var2 = null;
            sj.a((String) null, -123, (Throwable) null);
        }
        field_J = null;
        field_C = null;
    }

    final void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_31_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_60_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_58_0 = 0;
        var11 = SteelSentinels.field_G;
        if (((sj) this).field_A <= 0) {
          ((sj) this).d(param2);
          return;
        } else {
          L0: {
            if (((sj) this).field_N) {
              L1: {
                if (((sj) this).field_K <= 0) {
                  break L1;
                } else {
                  if (((sj) this).field_O.d((byte) 90)) {
                    break L1;
                  } else {
                    ((sj) this).field_N = false;
                    ((sj) this).field_s = null;
                    ((sj) this).field_K = -((sj) this).field_K;
                    break L0;
                  }
                }
              }
              if (((sj) this).field_K >= 0) {
                break L0;
              } else {
                if (!((sj) this).field_M.d((byte) 90)) {
                  ((sj) this).field_K = -((sj) this).field_K;
                  ((sj) this).field_N = false;
                  ((sj) this).field_w = null;
                  break L0;
                } else {
                  break L0;
                }
              }
            } else {
              break L0;
            }
          }
          L2: {
            var4 = (((sj) this).field_D >> -1888025300) * ((sj) this).field_A / 256;
            var5 = -var4 + ((sj) this).field_A;
            if (0 == ((sj) this).field_K) {
              break L2;
            } else {
              ((sj) this).field_D = ((sj) this).field_D + ((sj) this).field_K * param2;
              if ((((sj) this).field_D ^ -1) > -1048577) {
                if ((((sj) this).field_D ^ -1) >= -1) {
                  ((sj) this).field_D = 0;
                  if (!((sj) this).field_N) {
                    ((sj) this).field_K = 0;
                    if (((sj) this).field_H) {
                      break L2;
                    } else {
                      L3: {
                        if (((sj) this).field_s != null) {
                          ((sj) this).field_O.c((byte) -109);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      ((sj) this).field_s = null;
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              } else {
                ((sj) this).field_D = 1048576;
                if (((sj) this).field_N) {
                  break L2;
                } else {
                  ((sj) this).field_K = 0;
                  if (((sj) this).field_H) {
                    break L2;
                  } else {
                    L4: {
                      if (((sj) this).field_w == null) {
                        break L4;
                      } else {
                        ((sj) this).field_M.c((byte) -40);
                        break L4;
                      }
                    }
                    ((sj) this).field_w = null;
                    break L2;
                  }
                }
              }
            }
          }
          L5: {
            if (tb.field_b) {
              stackOut_30_0 = param2 << 86814241;
              stackIn_31_0 = stackOut_30_0;
              break L5;
            } else {
              stackOut_29_0 = param2;
              stackIn_31_0 = stackOut_29_0;
              break L5;
            }
          }
          L6: {
            var6 = stackIn_31_0;
            if (256 <= ((sj) this).field_E) {
              break L6;
            } else {
              L7: {
                if (((sj) this).field_s != null) {
                  break L7;
                } else {
                  if (null == ((sj) this).field_w) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              if (var4 == 256) {
                ((sj) this).field_O.a(param0, param1, param2);
                break L6;
              } else {
                if (-257 != (var5 ^ -1)) {
                  L8: {
                    L9: {
                      if (null == ((sj) this).field_G) {
                        break L9;
                      } else {
                        if (var6 > ((sj) this).field_G.length) {
                          break L9;
                        } else {
                          ii.a(((sj) this).field_G, 0, var6);
                          ii.a(((sj) this).field_I, 0, var6);
                          break L8;
                        }
                      }
                    }
                    ((sj) this).field_I = new int[var6];
                    ((sj) this).field_G = new int[var6];
                    break L8;
                  }
                  L10: {
                    ((sj) this).field_O.a(((sj) this).field_G, 0, param2);
                    ((sj) this).field_M.a(((sj) this).field_I, 0, param2);
                    if (tb.field_b) {
                      param1 = param1 << 1;
                      stackOut_44_0 = param1 << 1;
                      stackIn_45_0 = stackOut_44_0;
                      break L10;
                    } else {
                      stackOut_43_0 = param1;
                      stackIn_45_0 = stackOut_43_0;
                      break L10;
                    }
                  }
                  var7 = stackIn_45_0;
                  var8 = 0;
                  L11: while (true) {
                    if (var8 >= var6) {
                      break L6;
                    } else {
                      param0[var7 - -var8] = param0[var7 - -var8] + (((sj) this).field_G[var8] * var4 - -(var5 * ((sj) this).field_I[var8]) >> -990402872);
                      var8++;
                      continue L11;
                    }
                  }
                } else {
                  ((sj) this).field_M.a(param0, param1, param2);
                  break L6;
                }
              }
            }
          }
          L12: {
            if (((sj) this).field_L == null) {
              break L12;
            } else {
              if (0 != ((sj) this).field_E) {
                L13: {
                  L14: {
                    if (null == ((sj) this).field_G) {
                      break L14;
                    } else {
                      if (((sj) this).field_G.length >= var6) {
                        ii.a(((sj) this).field_G, 0, var6);
                        break L13;
                      } else {
                        break L14;
                      }
                    }
                  }
                  ((sj) this).field_G = new int[var6];
                  ((sj) this).field_I = new int[var6];
                  break L13;
                }
                L15: {
                  ((sj) this).field_t.a(((sj) this).field_G, 0, param2);
                  if (!tb.field_b) {
                    stackOut_59_0 = param1;
                    stackIn_60_0 = stackOut_59_0;
                    break L15;
                  } else {
                    param1 = param1 << 1;
                    stackOut_58_0 = param1 << 1;
                    stackIn_60_0 = stackOut_58_0;
                    break L15;
                  }
                }
                var7 = stackIn_60_0;
                var8 = ((sj) this).field_A * ((sj) this).field_E / 256;
                var9 = ((sj) this).field_A + -var8;
                var10 = 0;
                L16: while (true) {
                  if (var10 >= var6) {
                    break L12;
                  } else {
                    param0[var10 + var7] = var8 * ((sj) this).field_G[var10] + param0[var10 + var7] * var9 >> 1373565576;
                    var10++;
                    continue L16;
                  }
                }
              } else {
                break L12;
              }
            }
          }
          return;
        }
    }

    final static void a(String param0, String param1, int param2, byte param3, String param4, int param5) {
        if (param3 != 21) {
            field_x = null;
        }
        na var6 = new na(param5, param4, param2, param0, param1);
        tf.a(var6, (byte) -107);
    }

    final synchronized void d(int param0) {
        int var3 = 0;
        L0: {
          var3 = SteelSentinels.field_G;
          if ((((sj) this).field_D ^ -1) >= -1) {
            if (1048576 > ((sj) this).field_D) {
              if (null == ((sj) this).field_w) {
                break L0;
              } else {
                ((sj) this).field_M.d(param0);
                break L0;
              }
            } else {
              if (1048576 <= ((sj) this).field_D) {
                break L0;
              } else {
                if (null == ((sj) this).field_w) {
                  break L0;
                } else {
                  ((sj) this).field_M.d(param0);
                  break L0;
                }
              }
            }
          } else {
            if (1048576 <= ((sj) this).field_D) {
              break L0;
            } else {
              if (null == ((sj) this).field_w) {
                break L0;
              } else {
                ((sj) this).field_M.d(param0);
                break L0;
              }
            }
          }
        }
        L1: {
          if (0 >= ((sj) this).field_E) {
            break L1;
          } else {
            if (null != ((sj) this).field_L) {
              ((sj) this).field_t.d(param0);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (((sj) this).field_N) {
            L3: {
              if (-1 <= (((sj) this).field_K ^ -1)) {
                break L3;
              } else {
                if (((sj) this).field_O.d((byte) 90)) {
                  break L3;
                } else {
                  ((sj) this).field_K = -((sj) this).field_K;
                  ((sj) this).field_s = null;
                  ((sj) this).field_N = false;
                  break L2;
                }
              }
            }
            if ((((sj) this).field_K ^ -1) <= -1) {
              break L2;
            } else {
              if (!((sj) this).field_M.d((byte) 90)) {
                ((sj) this).field_N = false;
                ((sj) this).field_K = -((sj) this).field_K;
                ((sj) this).field_w = null;
                break L2;
              } else {
                break L2;
              }
            }
          } else {
            break L2;
          }
        }
        L4: {
          if (-1 == ((sj) this).field_K) {
            break L4;
          } else {
            ((sj) this).field_D = ((sj) this).field_D + ((sj) this).field_K * param0;
            if (-1048577 <= ((sj) this).field_D) {
              ((sj) this).field_D = 1048576;
              if (!((sj) this).field_N) {
                ((sj) this).field_K = 0;
                if (((sj) this).field_H) {
                  break L4;
                } else {
                  L5: {
                    if (((sj) this).field_w == null) {
                      break L5;
                    } else {
                      ((sj) this).field_M.c((byte) -72);
                      break L5;
                    }
                  }
                  ((sj) this).field_w = null;
                  break L4;
                }
              } else {
                break L4;
              }
            } else {
              if ((((sj) this).field_D ^ -1) < -1) {
                break L4;
              } else {
                ((sj) this).field_D = 0;
                if (((sj) this).field_N) {
                  break L4;
                } else {
                  ((sj) this).field_K = 0;
                  if (((sj) this).field_H) {
                    break L4;
                  } else {
                    L6: {
                      if (((sj) this).field_s != null) {
                        ((sj) this).field_O.c((byte) -49);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    ((sj) this).field_s = null;
                    break L4;
                  }
                }
              }
            }
          }
        }
    }

    private final void a(int param0, ic param1, int param2, int param3) {
        if (param2 != 17396) {
            ((sj) this).a(-97, 18);
        }
        param1.a(-1, (byte) 37, param3);
        param1.a((byte) 61, param0);
    }

    final static void a(String param0, int param1, Throwable param2) {
        try {
            Exception var3 = null;
            String var3_ref = null;
            wj var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            pn stackIn_14_0 = null;
            java.net.URL stackIn_14_1 = null;
            java.net.URL stackIn_14_2 = null;
            java.net.URL stackIn_14_3 = null;
            StringBuilder stackIn_14_4 = null;
            pn stackIn_15_0 = null;
            java.net.URL stackIn_15_1 = null;
            java.net.URL stackIn_15_2 = null;
            java.net.URL stackIn_15_3 = null;
            StringBuilder stackIn_15_4 = null;
            pn stackIn_16_0 = null;
            java.net.URL stackIn_16_1 = null;
            java.net.URL stackIn_16_2 = null;
            java.net.URL stackIn_16_3 = null;
            StringBuilder stackIn_16_4 = null;
            String stackIn_16_5 = null;
            pn stackOut_13_0 = null;
            java.net.URL stackOut_13_1 = null;
            java.net.URL stackOut_13_2 = null;
            java.net.URL stackOut_13_3 = null;
            StringBuilder stackOut_13_4 = null;
            pn stackOut_14_0 = null;
            java.net.URL stackOut_14_1 = null;
            java.net.URL stackOut_14_2 = null;
            java.net.URL stackOut_14_3 = null;
            StringBuilder stackOut_14_4 = null;
            String stackOut_14_5 = null;
            pn stackOut_15_0 = null;
            java.net.URL stackOut_15_1 = null;
            java.net.URL stackOut_15_2 = null;
            java.net.URL stackOut_15_3 = null;
            StringBuilder stackOut_15_4 = null;
            String stackOut_15_5 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = SteelSentinels.field_G;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3_ref = "";
                            if (param2 != null) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var3_ref = pg.a((byte) -85, param2);
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (param0 == null) {
                                statePc = 9;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (param2 != null) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var3_ref = var3_ref + " | ";
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var3_ref = var3_ref + param0;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            ji.a(var3_ref, -29771);
                            if (param1 < -13) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        return;
                    }
                    case 11: {
                        try {
                            var7 = ee.a(":", var3_ref, "%3a", 98);
                            var8 = ee.a("@", var7, "%40", 101);
                            var9 = ee.a("&", var8, "%26", -20);
                            var10 = ee.a("#", var9, "%23", 97);
                            if (null != ug.field_O) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        return;
                    }
                    case 13: {
                        try {
                            stackOut_13_0 = ug.field_M;
                            stackOut_13_1 = null;
                            stackOut_13_2 = null;
                            stackOut_13_3 = ug.field_O.getCodeBase();
                            stackOut_13_4 = new StringBuilder().append("clienterror.ws?c=").append(dd.field_d).append("&u=");
                            stackIn_15_0 = stackOut_13_0;
                            stackIn_15_1 = stackOut_13_1;
                            stackIn_15_2 = stackOut_13_2;
                            stackIn_15_3 = stackOut_13_3;
                            stackIn_15_4 = stackOut_13_4;
                            stackIn_14_0 = stackOut_13_0;
                            stackIn_14_1 = stackOut_13_1;
                            stackIn_14_2 = stackOut_13_2;
                            stackIn_14_3 = stackOut_13_3;
                            stackIn_14_4 = stackOut_13_4;
                            if (ih.field_q == null) {
                                statePc = 15;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            stackOut_14_0 = (pn) (Object) stackIn_14_0;
                            stackOut_14_1 = null;
                            stackOut_14_2 = null;
                            stackOut_14_3 = (java.net.URL) (Object) stackIn_14_3;
                            stackOut_14_4 = (StringBuilder) (Object) stackIn_14_4;
                            stackOut_14_5 = ih.field_q;
                            stackIn_16_0 = stackOut_14_0;
                            stackIn_16_1 = stackOut_14_1;
                            stackIn_16_2 = stackOut_14_2;
                            stackIn_16_3 = stackOut_14_3;
                            stackIn_16_4 = stackOut_14_4;
                            stackIn_16_5 = stackOut_14_5;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            stackOut_15_0 = (pn) (Object) stackIn_15_0;
                            stackOut_15_1 = null;
                            stackOut_15_2 = null;
                            stackOut_15_3 = (java.net.URL) (Object) stackIn_15_3;
                            stackOut_15_4 = (StringBuilder) (Object) stackIn_15_4;
                            stackOut_15_5 = "" + oa.field_P;
                            stackIn_16_0 = stackOut_15_0;
                            stackIn_16_1 = stackOut_15_1;
                            stackIn_16_2 = stackOut_15_2;
                            stackIn_16_3 = stackOut_15_3;
                            stackIn_16_4 = stackOut_15_4;
                            stackIn_16_5 = stackOut_15_5;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            new java.net.URL(stackIn_16_3, stackIn_16_5 + "&v1=" + pn.field_p + "&v2=" + pn.field_r + "&e=" + var10);
                            var4 = ((pn) (Object) stackIn_16_0).a(stackIn_16_1, 38);
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (-1 != (var4.field_a ^ -1)) {
                                statePc = 19;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            a.a((byte) 126, 1L);
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if ((var4.field_a ^ -1) != -2) {
                                statePc = 23;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            var5 = (DataInputStream) var4.field_c;
                            int discarded$1 = var5.read();
                            var5.close();
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 23: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final we d() {
        return null;
    }

    final static boolean a(boolean param0) {
        int var1 = 0;
        int var2 = 0;
        double var3 = 0.0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        L0: {
          var15 = SteelSentinels.field_G;
          var1 = 0;
          if (param0) {
            break L0;
          } else {
            boolean discarded$1 = sj.a(false);
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (var2 >= 640) {
            return var1 != 0;
          } else {
            L2: {
              var3 = 374.0 + (double)(var2 - 320) * (0.000234375 * (double)(var2 - 320));
              var5 = (int)Math.ceil(var3);
              if (var2 != oh.field_f) {
                break L2;
              } else {
                if (var5 > pi.field_c) {
                  break L2;
                } else {
                  var1 = 1;
                  break L2;
                }
              }
            }
            jg.a(0, 48, var2, false, 480, var5);
            var6 = var5 - 1;
            var7 = var5 + 1;
            var8 = (int)(((double)var5 - var3) * 256.0);
            var9 = 200;
            var5 = var6 - 1;
            L3: while (true) {
              if (var5 <= var6 + -20) {
                pb.d(var2, var6, -var6 + var7, 4210752);
                if (-1 >= (var8 ^ -1)) {
                  var10 = var2 + (var6 + -1) * pb.field_c;
                  var11 = (pb.field_g[var10] & 16711680) >> 1550233776;
                  var12 = pb.field_g[var10] >> -1705008472 & 255;
                  var13 = pb.field_g[var10] & 255;
                  var14 = var8 * 64;
                  var13 = (var13 * (256 - var8) + var14) / 256;
                  var12 = (var14 + var12 * (256 - var8)) / 256;
                  var11 = (var14 + var11 * (256 - var8)) / 256;
                  pb.field_g[var10] = vn.a(var13, vn.a(var11 << 351878352, var12 << 1390114664));
                  var10 = var2 + pb.field_c * var7;
                  var13 = 255 & pb.field_g[var10];
                  var14 = 16384 - var8 * 64;
                  var12 = pb.field_g[var10] >> 799734824 & 255;
                  var11 = (pb.field_g[var10] & 16711680) >> 74252304;
                  var11 = (var11 * var8 - -var14) / 256;
                  var13 = (var13 * var8 + var14) / 256;
                  var12 = (var8 * var12 + var14) / 256;
                  pb.field_g[var10] = vn.a(vn.a(var12 << 1004630152, var11 << 1735337648), var13);
                  var2++;
                  continue L1;
                } else {
                  var2++;
                  continue L1;
                }
              } else {
                var10 = var2 + var5 * pb.field_c;
                var11 = (16711680 & pb.field_g[var10]) >> 1633023952;
                var12 = (pb.field_g[var10] & 65280) >> 1918875112;
                var13 = 255 & pb.field_g[var10];
                var11 = var11 * (256 + -var9) / 256;
                var12 = var12 * (-var9 + 256) / 256;
                var13 = var13 * (256 - var9) / 256;
                var9 = var9 * 6 / 7;
                pb.field_g[var10] = vn.a(vn.a(var11 << -407074608, var12 << 1257349608), var13);
                var5--;
                continue L3;
              }
            }
          }
        }
    }

    final synchronized void a(int param0, int param1) {
        if (param1 != -1) {
            return;
        }
        ((sj) this).field_A = param0;
    }

    final synchronized void a(int param0, tg param1, int param2, int param3, boolean param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_30_0 = 0;
        ic stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        ic stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        ic stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_41_2 = 0;
        ic stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        ic stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        ic stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        ic stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        ic stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        int stackOut_50_2 = 0;
        ic stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        ic stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        ic stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int stackOut_40_2 = 0;
        ic stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int stackOut_39_2 = 0;
        L0: {
          var8 = SteelSentinels.field_G;
          if (!((sj) this).field_N) {
            break L0;
          } else {
            if (!param4) {
              break L0;
            } else {
              L1: {
                if (-1 > (((sj) this).field_K ^ -1)) {
                  L2: {
                    if (null == ((sj) this).field_s) {
                      break L2;
                    } else {
                      ((sj) this).field_O.c((byte) -98);
                      break L2;
                    }
                  }
                  ((sj) this).field_s = param1;
                  if (param1 != null) {
                    ((sj) this).field_O.a(true, false, param1);
                    this.a(param3, ((sj) this).field_O, 17396, param0);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  L3: {
                    if (((sj) this).field_w == null) {
                      break L3;
                    } else {
                      ((sj) this).field_M.c((byte) -69);
                      break L3;
                    }
                  }
                  ((sj) this).field_w = param1;
                  if (param1 != null) {
                    ((sj) this).field_M.a(true, false, param1);
                    this.a(param3, ((sj) this).field_M, 17396, param0);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              return;
            }
          }
        }
        L4: {
          if (param5 == 21997) {
            break L4;
          } else {
            ((sj) this).field_D = 96;
            break L4;
          }
        }
        L5: {
          stackOut_16_0 = this;
          stackIn_18_0 = stackOut_16_0;
          stackIn_17_0 = stackOut_16_0;
          if (!param4) {
            stackOut_18_0 = this;
            stackOut_18_1 = 0;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            break L5;
          } else {
            stackOut_17_0 = this;
            stackOut_17_1 = 1;
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            break L5;
          }
        }
        ((sj) this).field_N = stackIn_19_1 != 0;
        if (param1 != ((sj) this).field_s) {
          if (((sj) this).field_w == param1) {
            ((sj) this).field_K = -param2;
            this.a(param3, ((sj) this).field_M, 17396, param0);
            return;
          } else {
            L6: {
              if (null == ((sj) this).field_s) {
                var7 = 1;
                break L6;
              } else {
                if (null != ((sj) this).field_w) {
                  L7: {
                    if ((((sj) this).field_D ^ -1) <= -524289) {
                      stackOut_29_0 = 0;
                      stackIn_30_0 = stackOut_29_0;
                      break L7;
                    } else {
                      stackOut_28_0 = 1;
                      stackIn_30_0 = stackOut_28_0;
                      break L7;
                    }
                  }
                  var7 = stackIn_30_0;
                  break L6;
                } else {
                  var7 = 0;
                  break L6;
                }
              }
            }
            L8: {
              if (var7 == 0) {
                L9: {
                  if (null != ((sj) this).field_w) {
                    ((sj) this).field_M.c((byte) -51);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  ((sj) this).field_w = param1;
                  if (param1 != null) {
                    L11: {
                      stackOut_48_0 = ((sj) this).field_M;
                      stackOut_48_1 = 1;
                      stackIn_50_0 = stackOut_48_0;
                      stackIn_50_1 = stackOut_48_1;
                      stackIn_49_0 = stackOut_48_0;
                      stackIn_49_1 = stackOut_48_1;
                      if (param4) {
                        stackOut_50_0 = (ic) (Object) stackIn_50_0;
                        stackOut_50_1 = stackIn_50_1;
                        stackOut_50_2 = 0;
                        stackIn_51_0 = stackOut_50_0;
                        stackIn_51_1 = stackOut_50_1;
                        stackIn_51_2 = stackOut_50_2;
                        break L11;
                      } else {
                        stackOut_49_0 = (ic) (Object) stackIn_49_0;
                        stackOut_49_1 = stackIn_49_1;
                        stackOut_49_2 = 1;
                        stackIn_51_0 = stackOut_49_0;
                        stackIn_51_1 = stackOut_49_1;
                        stackIn_51_2 = stackOut_49_2;
                        break L11;
                      }
                    }
                    ((ic) (Object) stackIn_51_0).a(stackIn_51_1 != 0, stackIn_51_2 != 0, param1);
                    this.a(param3, ((sj) this).field_M, 17396, param0);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                ((sj) this).field_K = -param2;
                break L8;
              } else {
                L12: {
                  if (null != ((sj) this).field_s) {
                    ((sj) this).field_O.c((byte) -77);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  ((sj) this).field_s = param1;
                  if (param1 != null) {
                    L14: {
                      stackOut_38_0 = ((sj) this).field_O;
                      stackOut_38_1 = 1;
                      stackIn_40_0 = stackOut_38_0;
                      stackIn_40_1 = stackOut_38_1;
                      stackIn_39_0 = stackOut_38_0;
                      stackIn_39_1 = stackOut_38_1;
                      if (param4) {
                        stackOut_40_0 = (ic) (Object) stackIn_40_0;
                        stackOut_40_1 = stackIn_40_1;
                        stackOut_40_2 = 0;
                        stackIn_41_0 = stackOut_40_0;
                        stackIn_41_1 = stackOut_40_1;
                        stackIn_41_2 = stackOut_40_2;
                        break L14;
                      } else {
                        stackOut_39_0 = (ic) (Object) stackIn_39_0;
                        stackOut_39_1 = stackIn_39_1;
                        stackOut_39_2 = 1;
                        stackIn_41_0 = stackOut_39_0;
                        stackIn_41_1 = stackOut_39_1;
                        stackIn_41_2 = stackOut_39_2;
                        break L14;
                      }
                    }
                    ((ic) (Object) stackIn_41_0).a(stackIn_41_1 != 0, stackIn_41_2 != 0, param1);
                    this.a(param3, ((sj) this).field_O, 17396, param0);
                    break L13;
                  } else {
                    break L13;
                  }
                }
                ((sj) this).field_K = param2;
                break L8;
              }
            }
            return;
          }
        } else {
          ((sj) this).field_K = param2;
          this.a(param3, ((sj) this).field_O, 17396, param0);
          return;
        }
    }

    final static int a(byte param0) {
        int var1 = -51 % ((-72 - param0) / 33);
        return (int)(1000000000L / ud.field_v);
    }

    final we b() {
        return null;
    }

    private sj() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "You have no sentinel to configure.";
        field_v = new int[110];
        field_B = "(<%0> players want to join)";
        field_v[58] = 75;
        field_v[18] = 75;
        field_v[68] = 400;
        field_v[71] = 400;
        field_v[61] = 200;
        field_v[30] = 75;
        field_v[35] = 900;
        field_v[95] = 1000;
        field_v[88] = 900;
        field_v[64] = 300;
        field_v[83] = 600;
        field_v[79] = 700;
        field_v[36] = 700;
        field_v[17] = 75;
        field_v[23] = 75;
        field_v[65] = 300;
        field_v[87] = 800;
        field_v[48] = 1000;
        field_v[54] = 75;
        field_v[85] = 800;
        field_v[81] = 700;
        field_v[62] = 200;
        field_v[84] = 800;
        field_v[24] = 75;
        field_v[21] = 75;
        field_v[19] = 400;
        field_v[74] = 500;
        field_v[59] = 75;
        field_v[93] = 1000;
        field_v[1] = 75;
        field_v[51] = 700;
        field_v[47] = 800;
        field_v[43] = 500;
        field_v[29] = 75;
        field_v[67] = 300;
        field_v[56] = 75;
        field_v[22] = 300;
        field_v[76] = 600;
        field_v[63] = 200;
        field_v[33] = 400;
        field_v[78] = 600;
        field_v[72] = 500;
        field_v[75] = 600;
        field_v[45] = 600;
        field_v[31] = 200;
        field_v[25] = 300;
        field_v[34] = 500;
        field_v[50] = 1000;
        field_v[66] = 300;
        field_v[52] = 1000;
        field_v[69] = 400;
        field_v[37] = 200;
        field_v[91] = 900;
        field_v[53] = 75;
        field_v[60] = 75;
        field_v[26] = 75;
        field_v[89] = 900;
        field_v[82] = 700;
        field_v[86] = 800;
        field_v[77] = 600;
        field_v[80] = 700;
        field_v[2] = 75;
        field_v[44] = 700;
        field_v[90] = 900;
        field_v[28] = 600;
        field_v[32] = 300;
        field_v[46] = 900;
        field_v[27] = 600;
        field_v[38] = 700;
        field_v[49] = 1000;
        field_v[20] = 200;
        field_v[3] = 75;
        field_v[73] = 500;
        field_v[92] = 1000;
        field_v[70] = 400;
    }
}
