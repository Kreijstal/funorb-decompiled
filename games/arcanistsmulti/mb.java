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
        this.field_Q = -1;
        if (!this.field_X.field_G) {
          return false;
        } else {
          if (this.field_X.field_H.field_P.field_w) {
            if (this.field_W == null) {
              return super.a((byte) -47, param1, param2, param3, param4);
            } else {
              param4 = param4 - (this.field_n + param3);
              param2 = param2 - (param1 + this.field_j);
              if (param0 == -47) {
                if (0 <= param4) {
                  if (param2 >= 0) {
                    if (this.field_v >= param4) {
                      if (this.field_k >= param2) {
                        this.field_Q = param2 / this.field_T;
                        if (this.field_Q >= this.field_W.length) {
                          this.field_Q = -1;
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
        field_L = (long[][]) null;
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
            if ((param0 ^ -1) == -3) {
              return 54;
            } else {
              if (param1 == 813231272) {
                if (-4 == (param0 ^ -1)) {
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
        if (param0 != 27825) {
          return ((int[]) (((Object[]) (this.field_W[1]))[7]))[21];
        } else {
          L0: {
            if (null != this.field_W) {
              stackIn_4_0 = this.field_T * (1 + 2 * this.field_W.length) >> 1313345889;
              break L0;
            } else {
              stackIn_4_0 = 200;
              break L0;
            }
          }
          return stackIn_4_0;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5;
        super.a(-105, param1, param2, param3);
        param1 = param1 - this.field_n;
        if (param0 < -99) {
          param3 = param3 - this.field_j;
          if (this.field_W != null) {
            var5 = param3 / this.field_T;
            if (-1 >= (var5 ^ -1)) {
              if (this.field_W.length <= var5) {
                return;
              } else {
                this.field_Y = var5;
                this.field_X.a(0);
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
            mb.a(-104, 99);
            return -bk.field_I + bj.field_tb;
        }
        return -bk.field_I + bj.field_tb;
    }

    final Object g(int param0) {
        if (param0 >= 125) {
          if (this.field_W != null) {
            if ((this.field_Y ^ -1) == 0) {
              return null;
            } else {
              return this.field_W[this.field_Y];
            }
          } else {
            return null;
          }
        } else {
          this.a((byte) -47, ((int[]) (this.field_W[4]))[0], ((int[]) (this.field_W[3]))[0], 2);
          if (this.field_W != null) {
            if ((this.field_Y ^ -1) == 0) {
              return null;
            } else {
              return this.field_W[this.field_Y];
            }
          } else {
            return null;
          }
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        Object var9;
        String var10;
        int var11;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 < -52) {
          if (param2 != 0) {
            return;
          } else {
            L0: {
              var5 = this.field_n + param1;
              var6 = param3 - -this.field_j;
              de.d(var5, var6, this.field_v, this.field_k, 0);
              var7 = this.field_Y;
              if (-1 != this.field_Q) {
                var7 = this.field_Q;
                break L0;
              } else {
                break L0;
              }
            }
            if (null == this.field_W) {
              return;
            } else {
              var8 = 0;
              L1: while (true) {
                if (this.field_W.length <= var8) {
                  return;
                } else {
                  L2: {
                    var9 = this.field_W[var8];
                    var10 = var9.toString();
                    if (var8 == var7) {
                      de.e(var5 + 2, var6 + 4, this.field_v - 4, this.field_T, 2188450, 128);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var6 = var6 + this.field_T;
                  this.field_M.a(var10, var5 + 2, var6, 10000536, -1);
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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_Q = -1;
            this.field_W = param0;
            if (param1 == 10) {
              this.field_Y = param2;
              if (param0 == null) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (0 < (this.field_Y ^ -1)) {
                    break L1;
                  } else {
                    if (this.field_W.length <= this.field_Y) {
                      break L1;
                    } else {
                      return;
                    }
                  }
                }
                throw new IllegalStateException();
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("mb.RA(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, Object param1, dl param2) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        dl var5 = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (param2.field_a != null) {
              var3_int = 0;
              L1: while (true) {
                L2: {
                  if (-51 >= (var3_int ^ -1)) {
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
                        var5 = (dl) null;
                        mb.a(-54, (Object) null, (dl) null);
                        break L4;
                      }
                    }
                    if (param1 == null) {
                      break L3;
                    } else {
                      param2.field_a.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param1, 1001, "dummy")));
                      return;
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var3 = (Exception) (Object) decompiledCaughtException;
                  return;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("mb.VA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    mb(ti param0, dj param1, Object[] param2, int param3) {
        super(param0);
        try {
            this.field_X = param0;
            this.field_M = param1;
            this.field_T = this.field_M.field_m + this.field_M.field_C;
            this.a(param2, (byte) 10, param3);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "mb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        int var0 = 0;
        int var1 = 0;
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        long var8 = 0L;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        field_L = new long[8][256];
        field_R = "Earn more wands by playing Rated games.";
        field_V = new long[11];
        field_U = new int[]{18, 19, 20};
        for (var0 = 0; -257 < (var0 ^ -1); var0++) {
            var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
            var2 = -1 != (1 & var0 ^ -1) ? (long)(var1 & 255) : (long)(var1 >>> 813231272);
            var4 = var2 << -861045823;
            if (!(-257L < (var4 ^ -1L))) {
                var4 = var4 ^ 285L;
            }
            var6 = var4 << -376276479;
            if (!((var6 ^ -1L) > -257L)) {
                var6 = var6 ^ 285L;
            }
            var8 = var2 ^ var6;
            var10 = var6 << -1309733183;
            if (!(var10 < 256L)) {
                var10 = var10 ^ 285L;
            }
            var12 = var10 ^ var2;
            field_L[0][var0] = vg.a(vg.a(vg.a(vg.a(vg.a(vg.a(var6 << 1632052200, vg.a(var2 << -2109000520, var2 << -965168976)), var2 << 281165088), var10 << -710310888), var8 << -1486712560), var4 << 442549704), var12);
            for (var14 = 1; -9 < (var14 ^ -1); var14++) {
                field_L[var14][var0] = vg.a(field_L[-1 + var14][var0] >>> 2067180808, field_L[var14 + -1][var0] << 377389304);
            }
        }
        field_V[0] = 0L;
        int var15 = 1;
        var0 = var15;
        while (10 >= var15) {
            var1 = -8 + var15 * 8;
            field_V[var15] = kh.a(on.a(field_L[7][7 + var1], 255L), kh.a(on.a(field_L[6][var1 - -6], 65280L), kh.a(kh.a(kh.a(kh.a(on.a(280375465082880L, field_L[2][var1 + 2]), kh.a(on.a(field_L[0][var1], -72057594037927936L), on.a(71776119061217280L, field_L[1][1 + var1]))), on.a(field_L[3][3 + var1], 1095216660480L)), on.a(4278190080L, field_L[4][var1 - -4])), on.a(16711680L, field_L[5][var1 + 5]))));
            var15++;
        }
        field_S = "Send private message to <%0>";
        field_O = "Invite players";
        field_Z = "Screen Size";
        field_N = "Names can only contain letters, numbers, spaces and underscores";
    }
}
