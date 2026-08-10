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
        int var1 = 100 / ((param0 - -82) / 37);
        field_e = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != 12018) {
            return;
        }
        s.a(param0, 0, this.field_d, param1, param3, param2);
    }

    final static int a(int param0) {
        if (param0 != -27486) {
            return -94;
        }
        return hp.a((byte) 99, g.field_a, 256) << 644485840 | hp.a((byte) -91, g.field_a, 256) << -1968869272 | hp.a((byte) -97, g.field_a, 256);
    }

    final static boolean a(long param0, String param1, int param2) {
        ml var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 2) {
                break L1;
              } else {
                var5 = (byte[]) null;
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
                  stackIn_5_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
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
                    stackIn_10_0 = 1;
                    break L3;
                  }
                }
              }
              stackIn_10_0 = 0;
              break L3;
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4_ref);

            stackIn_13_1 = new StringBuilder().append("pd.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    pd(ja[] param0) {
        try {
            this.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "pd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, byte[] param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
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
                field_e = (String) null;
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
                                    var5 = oq.field_w[var4];
                                    var6 = vj.field_p[var4];
                                    var7 = var6 * var5;
                                    var20 = new byte[var7];
                                    var18 = var20;
                                    var8 = var18;
                                    qp.field_t[var4] = var20;
                                    var21 = new byte[var7];
                                    var19 = var21;
                                    var9 = var19;
                                    vf.field_b[var4] = var21;
                                    var10 = 0;
                                    var11 = var17.g(31365);
                                    stackIn_24_0 = -1;
                                    stackIn_24_1 = 1 & var11 ^ -1;
                                    L8: {
                                      if (stackIn_24_0 != stackIn_24_1) {
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
                                                        dupTemp$0 = var17.d(-249699580);
                                                        var9[var12 + var5 * var13] = dupTemp$0;
                                                        var14 = dupTemp$0;
                                                        stackIn_48_0 = var10;

                                                        if (0 == (var14 ^ -1)) {
                                                          stackIn_49_0 = stackIn_48_0;
                                                          stackIn_49_1 = 0;
                                                          break L12;
                                                        } else {
                                                          stackIn_49_0 = stackIn_48_0;
                                                          stackIn_49_1 = 1;
                                                          break L12;
                                                        }
                                                      }
                                                      var10 = stackIn_49_0 | stackIn_49_1;
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
                                                    dupTemp$1 = var17.d(-249699580);
                                                    var9[var12] = dupTemp$1;
                                                    var13 = dupTemp$1;
                                                    stackIn_33_0 = var10;

                                                    if (0 == (var13 ^ -1)) {
                                                      stackIn_34_0 = stackIn_33_0;
                                                      stackIn_34_1 = 0;
                                                      break L16;
                                                    } else {
                                                      stackIn_34_0 = stackIn_33_0;
                                                      stackIn_34_1 = 1;
                                                      break L16;
                                                    }
                                                  }
                                                  var10 = stackIn_34_0 | stackIn_34_1;
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
                                  if (-1 != (tp.field_t[var4] ^ -1)) {
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
            stackIn_55_0 = (RuntimeException) (var2);

            stackIn_55_1 = new StringBuilder().append("pd.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "null";
              break L18;
            } else {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "{...}";
              break L18;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_56_0), stackIn_56_2 + ')');
        }
    }

    static {
        field_f = "This is your RuneScape clan if you have one.";
        field_a = "Waiting for extra data";
        field_e = "Press TAB to chat or F10 to open Quick Chat.";
        field_c = 67;
    }
}
