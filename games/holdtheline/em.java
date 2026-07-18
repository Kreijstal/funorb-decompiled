/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class em extends gd {
    static boolean field_o;
    static int field_j;
    static String[] field_m;
    static int field_l;
    static String[] field_k;
    static int[][] field_i;
    private static int[][] field_n;

    final static void a(int param0, boolean param1) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (!param1) {
                  break L2;
                } else {
                  if (kf.field_U != null) {
                    break L2;
                  } else {
                    if (!of.a(-969)) {
                      break L2;
                    } else {
                      if (!hf.a(wi.field_b, 0)) {
                        break L2;
                      } else {
                        kf.field_U = oc.a(0, 0, 480, -123, wi.field_b, 640);
                        if (null == kf.field_U) {
                          break L1;
                        } else {
                          am.a((java.awt.Canvas) (Object) kf.field_U, 114);
                          if (HoldTheLine.field_D == 0) {
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
              }
              if (param1) {
                break L1;
              } else {
                if (kf.field_U != null) {
                  om.a(-46342, (java.awt.Canvas) (Object) kf.field_U);
                  kd.field_b.requestFocus();
                  kf.field_U.a(wi.field_b, param0 ^ -29472);
                  kf.field_U = null;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L3: {
              if (param0 == -29486) {
                break L3;
              } else {
                String discarded$2 = em.b(true);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var2, "em.U(" + param0 + ',' + param1 + ')');
        }
    }

    final fd a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        fd stackIn_4_0 = null;
        fd stackIn_13_0 = null;
        fd stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        fd stackOut_3_0 = null;
        fd stackOut_14_0 = null;
        fd stackOut_12_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            if (!ik.a((CharSequence) (Object) param0, true)) {
              stackOut_3_0 = g.field_k;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                var3_int = mo.a((CharSequence) (Object) param0, (byte) -116);
                if (param1 > 52) {
                  break L1;
                } else {
                  fd discarded$2 = ((em) this).a((String) null, (byte) 76);
                  break L1;
                }
              }
              L2: {
                if (var3_int <= 0) {
                  break L2;
                } else {
                  if (var3_int <= 130) {
                    stackOut_14_0 = tg.field_d;
                    stackIn_15_0 = stackOut_14_0;
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_12_0 = g.field_k;
              stackIn_13_0 = stackOut_12_0;
              return stackIn_13_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("em.N(");
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L3;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param1 + ')');
        }
        return stackIn_15_0;
    }

    final static String b(boolean param0) {
        RuntimeException var1 = null;
        String var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_8_0 = null;
        String stackIn_22_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        String stackOut_21_0 = null;
        var5 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_o = true;
                break L1;
              }
            }
            L2: {
              L3: {
                var1_ref = "(" + ab.field_pb + " " + hc.field_e + " " + rd.field_l + ") " + vn.field_c;
                if (ad.field_c <= 0) {
                  break L3;
                } else {
                  var1_ref = var1_ref + ":";
                  var2 = 0;
                  L4: while (true) {
                    if (~ad.field_c >= ~var2) {
                      break L3;
                    } else {
                      stackOut_7_0 = var1_ref + ' ';
                      stackIn_22_0 = stackOut_7_0;
                      stackIn_8_0 = stackOut_7_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        L5: {
                          L6: {
                            var1_ref = stackIn_8_0;
                            var3 = rd.field_e.field_i[var2] & 255;
                            var4 = var3 >> -1583350908;
                            if (10 <= var4) {
                              break L6;
                            } else {
                              var4 += 48;
                              if (var5 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var4 += 55;
                          break L5;
                        }
                        L7: {
                          L8: {
                            var3 = var3 & 15;
                            var1_ref = var1_ref + (char)var4;
                            if (var3 < 10) {
                              break L8;
                            } else {
                              var3 += 55;
                              if (var5 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          var3 += 48;
                          break L7;
                        }
                        var1_ref = var1_ref + (char)var3;
                        var2++;
                        if (var5 == 0) {
                          continue L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_21_0 = (String) var1_ref;
              stackIn_22_0 = stackOut_21_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var1, "em.T(" + param0 + ')');
        }
        return stackIn_22_0;
    }

    public static void g(int param0) {
        try {
            field_n = null;
            field_k = null;
            field_m = null;
            int var1_int = -100 % ((param0 - -65) / 53);
            field_i = null;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "em.S(" + param0 + ')');
        }
    }

    final static int a(boolean param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_10_0 = 0;
        var2 = HoldTheLine.field_D;
        try {
          L0: {
            boolean discarded$12 = ka.field_b.a(go.field_e, lh.field_b, param0, false);
            ka.field_b.g((byte) -59);
            L1: while (true) {
              L2: {
                L3: {
                  if (!qh.c(-99)) {
                    break L3;
                  } else {
                    boolean discarded$13 = ka.field_b.a(aa.field_n, pk.field_M, (byte) 108);
                    if (var2 != 0) {
                      break L2;
                    } else {
                      if (var2 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (-1 != v.field_B) {
                  break L2;
                } else {
                  if (aa.field_k) {
                    stackOut_15_0 = 3;
                    stackIn_16_0 = stackOut_15_0;
                    return stackIn_16_0;
                  } else {
                    if (ak.field_b == sf.field_n) {
                      stackOut_20_0 = 1;
                      stackIn_21_0 = stackOut_20_0;
                      return stackIn_21_0;
                    } else {
                      if (!fj.field_o.a(250)) {
                        stackOut_25_0 = 1;
                        stackIn_26_0 = stackOut_25_0;
                        return stackIn_26_0;
                      } else {
                        if (bb.field_a == sf.field_n) {
                          stackOut_30_0 = 2;
                          stackIn_31_0 = stackOut_30_0;
                          return stackIn_31_0;
                        } else {
                          stackOut_32_0 = -1;
                          stackIn_33_0 = stackOut_32_0;
                          break L0;
                        }
                      }
                    }
                  }
                }
              }
              var1_int = v.field_B;
              go.a(0, -1);
              stackOut_10_0 = var1_int;
              stackIn_11_0 = stackOut_10_0;
              return stackIn_11_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var1, "em.V(" + param0 + ')');
        }
        return stackIn_33_0;
    }

    final String a(String param0, boolean param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (((em) this).a(param0, (byte) 89) != g.field_k) {
              if (param1) {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (String) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = vd.field_d;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("em.L(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L1;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
        return (String) (Object) stackIn_7_0;
    }

    em(nk param0) {
        super(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new int[14][];
        field_i = field_n;
        field_n[7] = new int[1];
        field_n[5] = new int[1];
        field_n[9] = new int[2];
        field_n[12] = new int[0];
        field_n[10] = new int[1];
        field_n[13] = new int[2];
        field_n[3] = new int[1];
        field_n[1] = new int[5];
        field_n[11] = new int[0];
        field_n[8] = new int[1];
        field_n[6] = new int[1];
        field_n[2] = new int[1];
        field_n[4] = new int[2];
        field_n[0] = new int[8];
        field_l = -1;
    }
}
