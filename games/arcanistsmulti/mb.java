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
              return super.a((byte) -47, param1, param2, param3, param4);
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
        field_U = null;
        field_Z = null;
        field_R = null;
        field_O = null;
        field_V = null;
        field_S = null;
        field_ab = null;
    }

    final static int a(int param0, int param1) {
        if (!(param0 != 0)) {
            return 57;
        }
        if (!(param0 != 1)) {
            return 54;
        }
        if (!(param0 != 2)) {
            return 54;
        }
        if (param1 != 813231272) {
            return -38;
        }
        if (!(param0 != 3)) {
            return 54;
        }
        if (4 == param0) {
            return 72;
        }
        if (param0 == 5) {
            return 57;
        }
        return 27;
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
              stackOut_3_0 = ((mb) this).field_T * (1 + 2 * ((mb) this).field_W.length) >> 1;
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
        super.a(-105, param1, param2, param3);
        param1 = param1 - ((mb) this).field_n;
        if (param0 < -99) {
          param3 = param3 - ((mb) this).field_j;
          if (((mb) this).field_W != null) {
            var5 = param3 / ((mb) this).field_T;
            if (var5 >= 0) {
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
        return -bk.field_I + bj.field_tb;
    }

    final Object g(int param0) {
        if (param0 >= 125) {
          if (((mb) this).field_W != null) {
            if (((mb) this).field_Y == -1) {
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
            if (((mb) this).field_Y == -1) {
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
        RuntimeException var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            ((mb) this).field_Q = -1;
            ((mb) this).field_W = param0;
            if (param1 == 10) {
              ((mb) this).field_Y = param2;
              if (param0 == null) {
                break L0;
              } else {
                L1: {
                  if (((mb) this).field_Y < -1) {
                    break L1;
                  } else {
                    if (((mb) this).field_W.length <= ((mb) this).field_Y) {
                      break L1;
                    } else {
                      return;
                    }
                  }
                }
                throw new IllegalStateException();
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("mb.RA(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static void a(int param0, Object param1, dl param2) {
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var3_int = 0;
        int var4 = 0;
        Object var5 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (param2.field_a != null) {
              var3_int = 0;
              L1: while (true) {
                L2: {
                  if (var3_int >= 50) {
                    break L2;
                  } else {
                    if (null == param2.field_a.peekEvent()) {
                      break L2;
                    } else {
                      ao.a(1L, 1);
                      var3_int++;
                      continue L1;
                    }
                  }
                }
                try {
                  L3: {
                    L4: {
                      if (param0 < -48) {
                        break L4;
                      } else {
                        var5 = null;
                        mb.a(-54, (Object) null, (dl) null);
                        break L4;
                      }
                    }
                    if (param1 == null) {
                      break L3;
                    } else {
                      param2.field_a.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param1, 1001, "dummy"));
                      return;
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var3 = (Exception) (Object) decompiledCaughtException;
                  return;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("mb.VA(").append(param0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
    }

    mb(ti param0, dj param1, Object[] param2, int param3) {
        super((qm) (Object) param0);
        try {
            ((mb) this).field_X = param0;
            ((mb) this).field_M = param1;
            ((mb) this).field_T = ((mb) this).field_M.field_m + ((mb) this).field_M.field_C;
            this.a(param2, (byte) 10, param3);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "mb.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
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
          if (var0 >= 256) {
            field_V[0] = 0L;
            var15 = 1;
            var0 = var15;
            L1: while (true) {
              if (10 < var15) {
                field_S = "Send private message to <%0>";
                field_O = "Invite players";
                field_Z = "Screen Size";
                field_N = "Names can only contain letters, numbers, spaces and underscores";
                return;
              } else {
                var1 = -8 + var15 * 8;
                field_V[var15] = kh.a(on.a(field_L[7][7 + var1], 255L), kh.a(on.a(field_L[6][var1 - -6], 65280L), kh.a(kh.a(kh.a(kh.a(on.a(280375465082880L, field_L[2][var1 + 2]), kh.a(on.a(field_L[0][var1], -72057594037927936L), on.a(71776119061217280L, field_L[1][1 + var1]))), on.a(field_L[3][3 + var1], 1095216660480L)), on.a(4278190080L, field_L[4][var1 - -4])), on.a(16711680L, field_L[5][var1 + 5]))));
                var15++;
                continue L1;
              }
            }
          } else {
            L2: {
              var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
              if ((1 & var0) == 0) {
                stackOut_4_0 = (long)(var1 >>> 8);
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
              var4 = var2 << 1;
              if (var4 >= 256L) {
                var4 = var4 ^ 285L;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var6 = var4 << 1;
              if (var6 >= 256L) {
                var6 = var6 ^ 285L;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var8 = var2 ^ var6;
              var10 = var6 << 1;
              if (var10 >= 256L) {
                var10 = var10 ^ 285L;
                break L5;
              } else {
                break L5;
              }
            }
            var12 = var10 ^ var2;
            field_L[0][var0] = vg.a(vg.a(vg.a(vg.a(vg.a(vg.a(var6 << 40, vg.a(var2 << 56, var2 << 48)), var2 << 32), var10 << 24), var8 << 16), var4 << 8), var12);
            var14 = 1;
            L6: while (true) {
              if (var14 >= 8) {
                var0++;
                continue L0;
              } else {
                field_L[var14][var0] = vg.a(field_L[-1 + var14][var0] >>> 8, field_L[var14 + -1][var0] << 56);
                var14++;
                continue L6;
              }
            }
          }
        }
    }
}
