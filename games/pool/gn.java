/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gn {
    static boolean field_f;
    static String field_a;
    static int field_b;
    static int field_d;
    static int field_c;
    static eg field_e;

    final static dd[] a(dd[] param0, byte param1) {
        RuntimeException var2 = null;
        dd[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        dd[] stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              param0[3].field_y = param0[3].field_A;
              if (param1 == -29) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            param0[1].field_w = param0[1].field_z;
            param0[5].field_y = param0[5].field_A;
            param0[7].field_w = param0[7].field_z;
            stackOut_3_0 = (dd[]) param0;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("gn.A(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(int param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (wg.field_Nb == null) {
                  break L2;
                } else {
                  if (param0 <= wg.field_Nb.length) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              wg.field_Nb = new int[param0 * 2];
              break L1;
            }
            L3: {
              L4: {
                if (kb.field_g == null) {
                  break L4;
                } else {
                  if (param0 <= kb.field_g.length) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              kb.field_g = new int[param0 * 2];
              break L3;
            }
            L5: {
              L6: {
                if (null == ob.field_y) {
                  break L6;
                } else {
                  if (~ob.field_y.length <= ~param0) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              ob.field_y = new int[param0 * 2];
              break L5;
            }
            if (!param2) {
              L7: {
                L8: {
                  if (om.field_s == null) {
                    break L8;
                  } else {
                    if (om.field_s.length >= param0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                om.field_s = new int[2 * param0];
                break L7;
              }
              L9: {
                L10: {
                  if (gd.field_d == null) {
                    break L10;
                  } else {
                    if (gd.field_d.length < param0) {
                      break L10;
                    } else {
                      break L9;
                    }
                  }
                }
                gd.field_d = new int[param0 * 2];
                break L9;
              }
              L11: {
                L12: {
                  if (ah.field_c == null) {
                    break L12;
                  } else {
                    if (ah.field_c.length >= param0) {
                      break L11;
                    } else {
                      break L12;
                    }
                  }
                }
                ah.field_c = new int[param0 * 2];
                break L11;
              }
              L13: {
                L14: {
                  if (ep.field_H == null) {
                    break L14;
                  } else {
                    if (param1 + param0 <= ep.field_H.length) {
                      break L13;
                    } else {
                      break L14;
                    }
                  }
                }
                ep.field_H = new int[2 * (param1 + param0)];
                break L13;
              }
              L15: {
                L16: {
                  if (im.field_cc == null) {
                    break L16;
                  } else {
                    if (im.field_cc.length >= param0) {
                      break L15;
                    } else {
                      break L16;
                    }
                  }
                }
                im.field_cc = new boolean[2 * param0];
                break L15;
              }
              rn.field_d = 2147483647;
              q.field_a = -2147483648;
              jl.field_c = -2147483648;
              jh.field_c = 0;
              gr.field_z = 2147483647;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var3, "gn.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static eg a(eg param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        Object stackIn_9_0 = null;
        eg stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        eg stackOut_11_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var3 = Pool.field_O;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~param0.field_q.length >= ~var2_int) {
                    break L3;
                  } else {
                    param0.field_q[var2_int] = -param0.field_q[var2_int];
                    var2_int++;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param1 == 5) {
                  jf.a(param0, (byte) 38);
                  param0.a();
                  break L2;
                } else {
                  stackOut_8_0 = null;
                  stackIn_9_0 = stackOut_8_0;
                  return (eg) (Object) stackIn_9_0;
                }
              }
              stackOut_11_0 = (eg) param0;
              stackIn_12_0 = stackOut_11_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2;
            stackOut_13_1 = new StringBuilder().append("gn.B(");
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ')');
        }
        return stackIn_12_0;
    }

    public static void a(int param0) {
        if (param0 != 1) {
            return;
        }
        try {
            field_e = null;
            field_a = null;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "gn.D(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Now you have potted a ball, that group - either spots (balls 1-7) or stripes (balls 9-15) - becomes yours. Your objective is now to pot the rest of the balls of your group, then the black ball. You must always hit one of your balls first!";
        field_c = 50;
    }
}
