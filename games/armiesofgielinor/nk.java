/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class nk {
    int field_f;
    static String field_t;
    int[][] field_r;
    byte[] field_v;
    byte[] field_n;
    byte[][] field_c;
    int[] field_B;
    byte[] field_e;
    int field_I;
    boolean[] field_l;
    byte[] field_d;
    int[] field_y;
    static byte[] field_C;
    int field_i;
    int field_j;
    static int field_m;
    byte[] field_o;
    int field_b;
    int field_q;
    int field_L;
    int[] field_u;
    int field_g;
    int field_z;
    int field_E;
    int field_a;
    int[] field_h;
    byte field_K;
    int field_x;
    byte[] field_s;
    int[][] field_k;
    int[][] field_H;
    int field_w;
    int field_J;
    int field_F;
    boolean[] field_p;

    public static void b(byte param0) {
        field_t = null;
        if (param0 != 75) {
            return;
        }
        try {
            field_C = null;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "nk.A(" + param0 + ')');
        }
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            cq.field_u = new int[vs.field_e.length];
            var1_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var1_int <= ~vs.field_e.length) {
                    break L3;
                  } else {
                    cq.field_u[var1_int] = va.field_G[vs.field_e[var1_int].field_h];
                    var1_int++;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 > 79) {
                  break L2;
                } else {
                  nk.a((byte) 84);
                  break L2;
                }
              }
              var1_int = 0;
              L4: while (true) {
                stackOut_11_0 = var1_int;
                stackOut_11_1 = ef.field_c;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                L5: while (true) {
                  L6: {
                    L7: {
                      if (stackIn_12_0 >= stackIn_12_1) {
                        break L7;
                      } else {
                        if (var4 != 0) {
                          break L6;
                        } else {
                          var2 = 0;
                          L8: while (true) {
                            L9: {
                              if (ks.field_y <= var2) {
                                break L9;
                              } else {
                                var3 = cq.field_u[var1_int * ks.field_y + var2];
                                stackOut_16_0 = 1;
                                stackOut_16_1 = var3;
                                stackIn_12_0 = stackOut_16_0;
                                stackIn_12_1 = stackOut_16_1;
                                stackIn_17_0 = stackOut_16_0;
                                stackIn_17_1 = stackOut_16_1;
                                if (var4 != 0) {
                                  continue L5;
                                } else {
                                  L10: {
                                    if (stackIn_17_0 == stackIn_17_1) {
                                      L11: {
                                        var3 = 7;
                                        if (!ta.field_L) {
                                          break L11;
                                        } else {
                                          var3 = 4;
                                          break L11;
                                        }
                                      }
                                      L12: {
                                        L13: {
                                          if (0 == var2) {
                                            break L13;
                                          } else {
                                            if (cq.field_u[-1 + (var2 + var1_int * ks.field_y)] == 1) {
                                              break L13;
                                            } else {
                                              break L12;
                                            }
                                          }
                                        }
                                        var3 = 1;
                                        break L12;
                                      }
                                      L14: {
                                        L15: {
                                          if (~(-1 + ks.field_y) == ~var2) {
                                            break L15;
                                          } else {
                                            if (1 == cq.field_u[1 + var2 + var1_int * ks.field_y]) {
                                              break L15;
                                            } else {
                                              break L14;
                                            }
                                          }
                                        }
                                        var3 = 1;
                                        break L14;
                                      }
                                      L16: {
                                        L17: {
                                          if (var1_int == 0) {
                                            break L17;
                                          } else {
                                            if (cq.field_u[var2 + ks.field_y * (var1_int - 1)] != 1) {
                                              break L16;
                                            } else {
                                              break L17;
                                            }
                                          }
                                        }
                                        var3 = 1;
                                        break L16;
                                      }
                                      L18: {
                                        L19: {
                                          if (~(-1 + ef.field_c) == ~var1_int) {
                                            break L19;
                                          } else {
                                            if (cq.field_u[(var1_int - -1) * ks.field_y + var2] == 1) {
                                              break L19;
                                            } else {
                                              break L18;
                                            }
                                          }
                                        }
                                        var3 = 1;
                                        break L18;
                                      }
                                      cq.field_u[var1_int * ks.field_y + var2] = var3;
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  }
                                  var2++;
                                  if (var4 == 0) {
                                    continue L8;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                            var1_int++;
                            if (var4 == 0) {
                              continue L4;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                    }
                    break L6;
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "nk.C(" + param0 + ')');
        }
    }

    final static String a(boolean param0, CharSequence param1, byte param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_8_0 = null;
        String stackIn_13_0 = null;
        Object stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        String stackOut_12_0 = null;
        Object stackOut_15_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var3 = be.a(-127, param1, param0);
              if (param2 <= -34) {
                break L1;
              } else {
                nk.b((byte) -25);
                break L1;
              }
            }
            if (null != var3) {
              stackOut_7_0 = (String) var3;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            } else {
              var4 = 0;
              L2: while (true) {
                L3: {
                  if (var4 >= param1.length()) {
                    break L3;
                  } else {
                    if (wg.a(param1.charAt(var4), -3904)) {
                      var4++;
                      if (var5 == 0) {
                        continue L2;
                      } else {
                        break L3;
                      }
                    } else {
                      stackOut_12_0 = od.field_h;
                      stackIn_13_0 = stackOut_12_0;
                      return stackIn_13_0;
                    }
                  }
                }
                stackOut_15_0 = null;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3_ref;
            stackOut_17_1 = new StringBuilder().append("nk.B(").append(param0).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param2 + ')');
        }
        return (String) (Object) stackIn_16_0;
    }

    final static wk[] a(int param0, byte param1, int param2, kl param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        wk[] stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        wk[] stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (!kp.a(false, param0, param3, param2)) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (wk[]) (Object) stackIn_4_0;
            } else {
              if (param1 == 28) {
                stackOut_8_0 = se.a((byte) 32);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (wk[]) (Object) stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("nk.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_9_0;
    }

    nk() {
        ((nk) this).field_l = new boolean[16];
        ((nk) this).field_c = new byte[6][258];
        ((nk) this).field_o = new byte[4096];
        ((nk) this).field_y = new int[6];
        ((nk) this).field_u = new int[256];
        ((nk) this).field_i = 0;
        ((nk) this).field_n = new byte[256];
        ((nk) this).field_H = new int[6][258];
        ((nk) this).field_d = new byte[18002];
        ((nk) this).field_s = new byte[18002];
        ((nk) this).field_r = new int[6][258];
        ((nk) this).field_B = new int[257];
        ((nk) this).field_h = new int[16];
        ((nk) this).field_q = 0;
        ((nk) this).field_k = new int[6][258];
        ((nk) this).field_p = new boolean[256];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "TAB - hide chat temporarily";
    }
}
