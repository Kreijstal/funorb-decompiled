/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb extends mh {
    int field_Y;
    private dj field_M;
    int field_Q;
    static String field_R;
    static long[][] field_L;
    static ll[] field_cb;
    int field_T;
    Object[] field_W;
    static int[] field_U;
    static long[] field_V;
    private ti field_X;
    static String field_S;
    static int field_P;
    static String field_O;
    static String field_Z;
    static ll[] field_ab;
    static String field_N;
    static int field_bb;

    final boolean a(byte param0, int param1, int param2, int param3, int param4) {
        ((mb) this).field_Q = -1;
        if (!((mb) this).field_X.field_G) {
          return false;
        } else {
          if (((mb) this).field_X.field_H.field_P.field_w) {
            if (((mb) this).field_W == null) {
              return this.a((byte) -47, param1, param2, param3, param4);
            } else {
              param4 = param4 - (((mb) this).field_n + param3);
              param2 = param2 - (param1 + ((mb) this).field_j);
              if (param0 == -47) {
                if (0 <= param4) {
                  if (param2 >= 0) {
                    if (((mb) this).field_v >= param4) {
                      if (((mb) this).field_k >= param2) {
                        ((mb) this).field_Q = param2 / ((mb) this).field_T;
                        if (((mb) this).field_Q >= ((mb) this).field_W.length) {
                          ((mb) this).field_Q = -1;
                          return true;
                        } else {
                          return true;
                        }
                      } else {
                        return false;
                      }
                    } else {
                      return false;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          } else {
            return false;
          }
        }
    }

    public static void a(int param0) {
        field_N = null;
        field_cb = null;
        field_L = null;
        if (param0 <= 119) {
          return;
        } else {
          field_U = null;
          field_Z = null;
          field_R = null;
          field_O = null;
          field_V = null;
          field_S = null;
          field_ab = null;
          return;
        }
    }

    final static int a(int param0, int param1) {
        if (-1 == (param0 ^ -1)) {
          return 57;
        } else {
          if (param0 == 1) {
            return 54;
          } else {
            if (param0 == -3) {
              return 54;
            } else {
              if (param1 == 813231272) {
                if (-4 == param0) {
                  return 54;
                } else {
                  if (4 != param0) {
                    if ((param0 ^ -1) == -6) {
                      return 57;
                    } else {
                      return 27;
                    }
                  } else {
                    return 72;
                  }
                }
              } else {
                return -38;
              }
            }
          }
        }
    }

    final int f(int param0) {
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 27825) {
          return ((int[]) ((Object[]) ((mb) this).field_W[1])[7])[21];
        } else {
          L0: {
            if (null != ((mb) this).field_W) {
              stackOut_3_0 = ((mb) this).field_T * (1 + 2 * ((mb) this).field_W.length) >> 1313345889;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 200;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        this.a(-105, param1, param2, param3);
        param1 = param1 - ((mb) this).field_n;
        if (param0 < -99) {
          param3 = param3 - ((mb) this).field_j;
          if (((mb) this).field_W != null) {
            var5 = param3 / ((mb) this).field_T;
            if (-1 >= (var5 ^ -1)) {
              if (((mb) this).field_W.length <= var5) {
                return;
              } else {
                ((mb) this).field_Y = var5;
                ((mb) this).field_X.a(0);
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

    final static int j(byte param0) {
        if (param0 != 19) {
            int discarded$0 = mb.a(-104, 99);
            return -bk.field_I + bj.field_tb;
        }
        return -bk.field_I + bj.field_tb;
    }

    final Object g(int param0) {
        if (param0 >= 125) {
          if (((mb) this).field_W != null) {
            if ((((mb) this).field_Y ^ -1) == 0) {
              return null;
            } else {
              return ((mb) this).field_W[((mb) this).field_Y];
            }
          } else {
            return null;
          }
        } else {
          ((mb) this).a((byte) -47, ((int[]) ((mb) this).field_W[4])[0], ((int[]) ((mb) this).field_W[3])[0], 2);
          if (((mb) this).field_W != null) {
            if ((((mb) this).field_Y ^ -1) == 0) {
              return null;
            } else {
              return ((mb) this).field_W[((mb) this).field_Y];
            }
          } else {
            return null;
          }
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        String var10 = null;
        int var11 = 0;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 < -52) {
          if (param2 != 0) {
            return;
          } else {
            L0: {
              var5 = ((mb) this).field_n + param1;
              var6 = param3 - -((mb) this).field_j;
              de.d(var5, var6, ((mb) this).field_v, ((mb) this).field_k, 0);
              var7 = ((mb) this).field_Y;
              if (-1 != ((mb) this).field_Q) {
                var7 = ((mb) this).field_Q;
                break L0;
              } else {
                break L0;
              }
            }
            if (null == ((mb) this).field_W) {
              return;
            } else {
              var8 = 0;
              L1: while (true) {
                if (((mb) this).field_W.length <= var8) {
                  return;
                } else {
                  L2: {
                    var9 = ((mb) this).field_W[var8];
                    var10 = var9.toString();
                    if (var8 == var7) {
                      de.e(var5 + 2, var6 + 4, ((mb) this).field_v - 4, ((mb) this).field_T, 2188450, 128);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var6 = var6 + ((mb) this).field_T;
                  ((mb) this).field_M.a(var10, var5 + 2, var6, 10000536, -1);
                  var8++;
                  continue L1;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    private final void a(Object[] param0, byte param1, int param2) {
        ((mb) this).field_Q = -1;
        ((mb) this).field_W = param0;
        if (param1 == 10) {
          ((mb) this).field_Y = param2;
          if (param0 != null) {
            if (0 >= (((mb) this).field_Y ^ -1)) {
              if (((mb) this).field_W.length <= ((mb) this).field_Y) {
                throw new IllegalStateException();
              } else {
                return;
              }
            } else {
              throw new IllegalStateException();
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0, Object param1, dl param2) {
        Exception var3 = null;
        int var3_int = 0;
        int var4 = 0;
        Object var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = ArcanistsMulti.field_G ? 1 : 0;
                    if (param2.field_a != null) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    var3_int = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (-51 >= (var3_int ^ -1)) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (null == param2.field_a.peekEvent()) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    ao.a(1L, 1);
                    var3_int++;
                    statePc = 3;
                    continue stateLoop;
                }
                case 6: {
                    try {
                        if (param0 < -48) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var5 = null;
                        mb.a(-54, (Object) null, (dl) null);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (param1 == null) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        param2.field_a.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param1, 1001, "dummy"));
                        return;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    var3 = (Exception) (Object) caughtException;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    mb(ti param0, dj param1, Object[] param2, int param3) {
        super((qm) (Object) param0);
        ((mb) this).field_X = param0;
        ((mb) this).field_M = param1;
        ((mb) this).field_T = ((mb) this).field_M.field_m + ((mb) this).field_M.field_C;
        this.a(param2, (byte) 10, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        long var8 = 0L;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        int var15 = 0;
        long stackIn_5_0 = 0L;
        long stackOut_4_0 = 0L;
        long stackOut_3_0 = 0L;
        field_L = new long[8][256];
        field_R = "Earn more wands by playing Rated games.";
        field_V = new long[11];
        field_U = new int[]{18, 19, 20};
        var0 = 0;
        L0: while (true) {
          if (-257 >= var0) {
            field_V[0] = 0L;
            var15 = 1;
            var0 = var15;
            L1: while (true) {
              if (10 < var15) {
                field_S = "Send private message to <%0>";
                field_O = "Invite players";
                field_Z = "Screen Size";
                field_N = "Names can only contain letters, numbers, spaces and underscores";
              } else {
                var1 = -8 + var15 * 8;
                field_V[var15] = kh.a(on.a(field_L[7][7 + var1], 255L), kh.a(on.a(field_L[6][var1 - -6], 65280L), kh.a(kh.a(kh.a(kh.a(on.a(280375465082880L, field_L[2][var1 + 2]), kh.a(on.a(field_L[0][var1], -72057594037927936L), on.a(71776119061217280L, field_L[1][1 + var1]))), on.a(field_L[3][3 + var1], 1095216660480L)), on.a(4278190080L, field_L[4][var1 - -4])), on.a(16711680L, field_L[5][var1 + 5]))));
                var15++;
                continue L1;
              }
            }
          } else {
            L2: {
              var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦���䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬���贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀���﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓���鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
              if (-1 == (1 & var0)) {
                stackOut_4_0 = (long)(var1 >>> 813231272);
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = (long)(var1 & 255);
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var2 = stackIn_5_0;
              var4 = var2 << -861045823;
              if (-257L >= (var4 ^ -1L)) {
                var4 = var4 ^ 285L;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var6 = var4 << -376276479;
              if ((var6 ^ -1L) <= -257L) {
                var6 = var6 ^ 285L;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var8 = var2 ^ var6;
              var10 = var6 << -1309733183;
              if (var10 >= 256L) {
                var10 = var10 ^ 285L;
                break L5;
              } else {
                break L5;
              }
            }
            var12 = var10 ^ var2;
            field_L[0][var0] = vg.a(vg.a(vg.a(vg.a(vg.a(vg.a(var6 << 1632052200, vg.a(var2 << -2109000520, var2 << -965168976)), var2 << 281165088), var10 << -710310888), var8 << -1486712560), var4 << 442549704), var12);
            var14 = 1;
            L6: while (true) {
              if (-9 >= (var14 ^ -1)) {
                var0++;
                continue L0;
              } else {
                field_L[var14][var0] = vg.a(field_L[-1 + var14][var0] >>> 2067180808, field_L[var14 + -1][var0] << 377389304);
                var14++;
                continue L6;
              }
            }
          }
        }
    }
}
