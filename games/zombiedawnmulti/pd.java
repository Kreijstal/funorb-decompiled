/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pd {
    private ja[] field_d;
    static String field_f;
    static cj field_b;
    static String field_a;
    static String field_e;
    static int field_c;

    public static void a(byte param0) {
        field_b = null;
        field_f = null;
        field_a = null;
        int var1 = 25;
        field_e = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != 12018) {
            return;
        }
        s.a(param0, 0, ((pd) this).field_d, param1, param3, param2);
    }

    final static int a(int param0) {
        return hp.a((byte) 99, g.field_a, 256) << 16 | hp.a((byte) -91, g.field_a, 256) << 8 | hp.a((byte) -97, g.field_a, 256);
    }

    final static boolean a(long param0, String param1, int param2) {
        ml var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 2) {
                break L1;
              } else {
                var5 = null;
                pd.a((byte) 9, (byte[]) null);
                break L1;
              }
            }
            L2: {
              var4 = dn.a(param1, false);
              if (var4 == null) {
                break L2;
              } else {
                if (var4.field_Nb == null) {
                  break L2;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0 != 0;
                }
              }
            }
            L3: {
              L4: {
                if (mh.field_c == null) {
                  break L4;
                } else {
                  if (vm.a(param0, (byte) -81) == null) {
                    break L4;
                  } else {
                    stackOut_8_0 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    break L3;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L3;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4_ref;
            stackOut_11_1 = new StringBuilder().append("pd.C(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 41);
        }
        return stackIn_10_0 != 0;
    }

    pd(ja[] param0) {
        try {
            ((pd) this).field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "pd.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(byte param0, byte[] param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        k var16 = null;
        k var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_44_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        var15 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var16 = new k(param1);
              var17 = var16;
              var17.field_j = -2 + param1.length;
              qc.field_v = var17.d((byte) 69);
              ll.field_h = new boolean[qc.field_v];
              qj.field_o = new int[qc.field_v];
              k.field_i = new int[qc.field_v];
              if (param0 > 82) {
                break L1;
              } else {
                field_e = null;
                break L1;
              }
            }
            vf.field_b = new byte[qc.field_v][];
            oq.field_w = new int[qc.field_v];
            qp.field_t = new byte[qc.field_v][];
            vj.field_p = new int[qc.field_v];
            var17.field_j = param1.length + -7 - 8 * qc.field_v;
            ie.field_nb = var17.d((byte) 69);
            hj.field_a = var17.d((byte) 69);
            var3 = 1 + (var17.g(31365) & 255);
            var4 = 0;
            L2: while (true) {
              if (var4 >= qc.field_v) {
                var4 = 0;
                L3: while (true) {
                  if (qc.field_v <= var4) {
                    var4 = 0;
                    L4: while (true) {
                      if (var4 >= qc.field_v) {
                        var4 = 0;
                        L5: while (true) {
                          if (var4 >= qc.field_v) {
                            var17.field_j = -(var3 * 3) + -4 + (param1.length + -(8 * qc.field_v));
                            tp.field_t = new int[var3];
                            var4 = 1;
                            L6: while (true) {
                              if (var4 >= var3) {
                                var17.field_j = 0;
                                var4 = 0;
                                L7: while (true) {
                                  if (var4 >= qc.field_v) {
                                    break L0;
                                  } else {
                                    L8: {
                                      var5 = oq.field_w[var4];
                                      var6 = vj.field_p[var4];
                                      var7 = var6 * var5;
                                      var24 = new byte[var7];
                                      var22 = var24;
                                      var20 = var22;
                                      var18 = var20;
                                      var8 = var18;
                                      qp.field_t[var4] = var24;
                                      var25 = new byte[var7];
                                      var23 = var25;
                                      var21 = var23;
                                      var19 = var21;
                                      var9 = var19;
                                      vf.field_b[var4] = var25;
                                      var10 = 0;
                                      var11 = var17.g(31365);
                                      if ((1 & var11) != 0) {
                                        var12 = 0;
                                        L9: while (true) {
                                          if (var5 <= var12) {
                                            if ((var11 & 2) == 0) {
                                              break L8;
                                            } else {
                                              var12 = 0;
                                              L10: while (true) {
                                                if (var12 >= var5) {
                                                  break L8;
                                                } else {
                                                  var13 = 0;
                                                  L11: while (true) {
                                                    if (var6 <= var13) {
                                                      var12++;
                                                      continue L10;
                                                    } else {
                                                      L12: {
                                                        byte dupTemp$2 = var17.d(-249699580);
                                                        var9[var12 + var5 * var13] = dupTemp$2;
                                                        var14 = dupTemp$2;
                                                        stackOut_44_0 = var10;
                                                        stackIn_46_0 = stackOut_44_0;
                                                        stackIn_45_0 = stackOut_44_0;
                                                        if (var14 == -1) {
                                                          stackOut_46_0 = stackIn_46_0;
                                                          stackOut_46_1 = 0;
                                                          stackIn_47_0 = stackOut_46_0;
                                                          stackIn_47_1 = stackOut_46_1;
                                                          break L12;
                                                        } else {
                                                          stackOut_45_0 = stackIn_45_0;
                                                          stackOut_45_1 = 1;
                                                          stackIn_47_0 = stackOut_45_0;
                                                          stackIn_47_1 = stackOut_45_1;
                                                          break L12;
                                                        }
                                                      }
                                                      var10 = stackIn_47_0 | stackIn_47_1;
                                                      var13++;
                                                      continue L11;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            var13 = 0;
                                            L13: while (true) {
                                              if (var13 >= var6) {
                                                var12++;
                                                continue L9;
                                              } else {
                                                var8[var13 * var5 + var12] = var17.d(-249699580);
                                                var13++;
                                                continue L13;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        var12 = 0;
                                        L14: while (true) {
                                          if (var7 <= var12) {
                                            if ((var11 & 2) == 0) {
                                              break L8;
                                            } else {
                                              var12 = 0;
                                              L15: while (true) {
                                                if (var7 <= var12) {
                                                  break L8;
                                                } else {
                                                  L16: {
                                                    byte dupTemp$3 = var17.d(-249699580);
                                                    var9[var12] = dupTemp$3;
                                                    var13 = dupTemp$3;
                                                    stackOut_29_0 = var10;
                                                    stackIn_31_0 = stackOut_29_0;
                                                    stackIn_30_0 = stackOut_29_0;
                                                    if (var13 == -1) {
                                                      stackOut_31_0 = stackIn_31_0;
                                                      stackOut_31_1 = 0;
                                                      stackIn_32_0 = stackOut_31_0;
                                                      stackIn_32_1 = stackOut_31_1;
                                                      break L16;
                                                    } else {
                                                      stackOut_30_0 = stackIn_30_0;
                                                      stackOut_30_1 = 1;
                                                      stackIn_32_0 = stackOut_30_0;
                                                      stackIn_32_1 = stackOut_30_1;
                                                      break L16;
                                                    }
                                                  }
                                                  var10 = stackIn_32_0 | stackIn_32_1;
                                                  var12++;
                                                  continue L15;
                                                }
                                              }
                                            }
                                          } else {
                                            var8[var12] = var17.d(-249699580);
                                            var12++;
                                            continue L14;
                                          }
                                        }
                                      }
                                    }
                                    ll.field_h[var4] = var10 != 0;
                                    var4++;
                                    continue L7;
                                  }
                                }
                              } else {
                                L17: {
                                  tp.field_t[var4] = var17.e(128);
                                  if (tp.field_t[var4] != 0) {
                                    break L17;
                                  } else {
                                    tp.field_t[var4] = 1;
                                    break L17;
                                  }
                                }
                                var4++;
                                continue L6;
                              }
                            }
                          } else {
                            vj.field_p[var4] = var17.d((byte) 69);
                            var4++;
                            continue L5;
                          }
                        }
                      } else {
                        oq.field_w[var4] = var17.d((byte) 69);
                        var4++;
                        continue L4;
                      }
                    }
                  } else {
                    qj.field_o[var4] = var17.d((byte) 69);
                    var4++;
                    continue L3;
                  }
                }
              } else {
                k.field_i[var4] = var16.d((byte) 69);
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var2 = decompiledCaughtException;
            stackOut_51_0 = (RuntimeException) var2;
            stackOut_51_1 = new StringBuilder().append("pd.B(").append(param0).append(44);
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param1 == null) {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L18;
            } else {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "{...}";
              stackIn_54_0 = stackOut_52_0;
              stackIn_54_1 = stackOut_52_1;
              stackIn_54_2 = stackOut_52_2;
              break L18;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "This is your RuneScape clan if you have one.";
        field_a = "Waiting for extra data";
        field_e = "Press TAB to chat or F10 to open Quick Chat.";
        field_c = 67;
    }
}
