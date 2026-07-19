/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wm extends gn {
    private la field_R;
    static ul field_V;
    static String field_U;
    static String field_P;
    private int field_O;
    static int[] field_Q;
    static String field_S;
    int field_N;
    int field_M;
    static String field_T;

    public static void h(byte param0) {
        field_P = null;
        field_S = null;
        field_Q = null;
        if (param0 < 5) {
          field_T = (String) null;
          field_T = null;
          field_V = null;
          field_U = null;
          return;
        } else {
          field_T = null;
          field_V = null;
          field_U = null;
          return;
        }
    }

    final int a(byte param0) {
        int var2 = 111 / ((param0 - -8) / 48);
        return this.field_R.b(1);
    }

    final static ao[] b(boolean param0) {
        ao[] discarded$0 = null;
        if (!param0) {
            discarded$0 = wm.b(false);
            return new ao[]{hd.field_r, sf.field_d, so.field_o, km.field_W, mk.field_g, ae.field_h, bq.field_i, ka.field_b, mo.field_Lb, ha.field_i, cn.field_j, hd.field_w, oa.field_a, eb.field_w};
        }
        return new ao[]{hd.field_r, sf.field_d, so.field_o, km.field_W, mk.field_g, ae.field_h, bq.field_i, ka.field_b, mo.field_Lb, ha.field_i, cn.field_j, hd.field_w, oa.field_a, eb.field_w};
    }

    final int g(byte param0) {
        if (param0 != -106) {
            return -4;
        }
        return this.field_O;
    }

    final static ul a(int param0, int param1, boolean param2, boolean param3, int param4, boolean param5) {
        try {
            int var6_int = 0;
            IOException var6 = null;
            Object var7 = null;
            Object var8 = null;
            cn var9 = null;
            ul stackIn_12_0 = null;
            Throwable decompiledCaughtException = null;
            ul stackOut_11_0 = null;
            try {
              L0: {
                L1: {
                  var6_int = 122 % ((-63 - param4) / 63);
                  var7 = null;
                  if (p.field_a.field_i == null) {
                    break L1;
                  } else {
                    hc.field_b = new of(p.field_a.field_i, 5200, 0);
                    p.field_a.field_i = null;
                    var7 = new bq(255, hc.field_b, new of(p.field_a.field_k, 12000, 0), 2097152);
                    break L1;
                  }
                }
                L2: {
                  var8 = null;
                  if (hc.field_b == null) {
                    break L2;
                  } else {
                    L3: {
                      if (rl.field_r == null) {
                        rl.field_r = new of[p.field_a.field_t.length];
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      if (rl.field_r[param0] != null) {
                        break L4;
                      } else {
                        rl.field_r[param0] = new of(p.field_a.field_t[param0], 12000, 0);
                        p.field_a.field_t[param0] = null;
                        break L4;
                      }
                    }
                    var8 = new bq(param0, hc.field_b, rl.field_r[param0], 2097152);
                    break L2;
                  }
                }
                L5: {
                  var9 = tj.field_a.a(param0, (bq) (var7), -15893, (bq) (var8), param3);
                  if (!param5) {
                    break L5;
                  } else {
                    var9.a(false);
                    break L5;
                  }
                }
                stackOut_11_0 = new ul(var9, param2, param1);
                stackIn_12_0 = stackOut_11_0;
                break L0;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(var6.toString());
            }
            return stackIn_12_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int f(int param0) {
        int discarded$0 = 0;
        if (param0 != 1) {
            discarded$0 = wm.f(-92);
            return 1;
        }
        return 1;
    }

    final static void a(int param0, java.applet.Applet param1) {
        ul discarded$0 = null;
        try {
            if (param0 != -1) {
                discarded$0 = wm.a(0, -46, true, false, 5, false);
            }
            ra.a(param1, -89, "");
            em.a(false, param1);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "wm.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private wm() throws Throwable {
        throw new Error();
    }

    final int a(int param0, boolean param1) {
        if (-1 >= (param0 ^ -1)) {
          if (param0 < this.field_R.b(1)) {
            if (param1) {
              this.field_M = -39;
              return this.field_R.a((byte) 105, param0);
            } else {
              return this.field_R.a((byte) 105, param0);
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    final boolean a(int param0, int param1, int param2, cf param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var14 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackOut_25_0 = 0;
              stackIn_26_0 = stackOut_25_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L1: {
                var8_int = -param5 + param1 + -this.field_M;
                var9 = this.field_n - this.field_M * 2;
                if (var8_int > var9) {
                  var8_int = var9;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var8_int >= 0) {
                  break L2;
                } else {
                  var8_int = 0;
                  break L2;
                }
              }
              L3: {
                L4: {
                  var8_int = var8_int * this.field_O / var9;
                  if (param2 == 1) {
                    break L4;
                  } else {
                    if (param2 != 2) {
                      break L3;
                    } else {
                      var10 = 2147483647;
                      var11 = -1;
                      var12 = 0;
                      L5: while (true) {
                        L6: {
                          L7: {
                            L8: {
                              if (this.field_R.b(1) <= var12) {
                                break L8;
                              } else {
                                var13 = this.field_R.a((byte) 105, var12) + -var8_int;
                                var13 = var13 * var13;
                                var16 = var10;
                                var15 = var13;
                                if (var14 != 0) {
                                  if (var15 <= var16) {
                                    break L7;
                                  } else {
                                    break L6;
                                  }
                                } else {
                                  L9: {
                                    if (var15 >= var16) {
                                      break L9;
                                    } else {
                                      var10 = var13;
                                      var11 = var12;
                                      break L9;
                                    }
                                  }
                                  var12++;
                                  if (var14 == 0) {
                                    continue L5;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                            if ((var11 ^ -1) <= -1) {
                              break L7;
                            } else {
                              break L6;
                            }
                          }
                          this.field_R.a(-102, var11);
                          break L6;
                        }
                        if (var14 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                this.field_R.b((byte) -7, var8_int);
                break L3;
              }
              stackOut_23_0 = 1;
              stackIn_24_0 = stackOut_23_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var8 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var8);
            stackOut_27_1 = new StringBuilder().append("wm.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param3 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L10;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L10;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_24_0 != 0;
        } else {
          return stackIn_26_0 != 0;
        }
    }

    static {
        field_U = "Select any zombie!";
        field_P = "Keep them away from the other portals.";
        field_S = "To Customer Support";
        field_Q = new int[10];
        field_T = "Invalid date";
    }
}
