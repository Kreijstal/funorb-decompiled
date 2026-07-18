/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ij extends gj implements da {
    static int[] field_H;
    private String[] field_K;
    static String[] field_J;
    static int field_I;
    static int field_L;
    private bb[] field_M;
    static si[] field_F;
    private pe field_G;

    final boolean a(int param0, int param1, qa param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        boolean stackIn_9_0 = false;
        int stackIn_12_0 = 0;
        boolean stackIn_15_0 = false;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        boolean stackOut_8_0 = false;
        int stackOut_16_0 = 0;
        boolean stackOut_14_0 = false;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (param1 == 98) {
                stackOut_8_0 = ((ij) this).b(param2, -28533);
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              } else {
                if (param0 == -2) {
                  if (param1 != 99) {
                    stackOut_16_0 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    break L0;
                  } else {
                    stackOut_14_0 = ((ij) this).a(32, param2);
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0;
                  }
                } else {
                  stackOut_11_0 = 1;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var5;
            stackOut_18_1 = new StringBuilder().append("ij.N(").append(param0).append(',').append(param1).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L1;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L1;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param3 + ')');
        }
        return stackIn_17_0 != 0;
    }

    ij(pe param0) {
        super(0, 0, 0, 0, (ch) null);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            ((ij) this).field_G = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ij.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    final static int a(int param0) {
        try {
            IOException var1 = null;
            RuntimeException var1_ref = null;
            ni var1_ref2 = null;
            int var1_int = 0;
            int stackIn_5_0 = 0;
            int stackIn_10_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_24_0 = 0;
            int stackIn_36_0 = 0;
            int stackIn_44_0 = 0;
            int stackIn_47_0 = 0;
            int stackIn_52_0 = 0;
            int stackIn_54_0 = 0;
            int stackIn_56_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_9_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_4_0 = 0;
            int stackOut_23_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_51_0 = 0;
            int stackOut_53_0 = 0;
            int stackOut_46_0 = 0;
            int stackOut_55_0 = 0;
            try {
              if (td.field_k.field_c >= 4) {
                if (td.field_k.field_b != -1) {
                  if (td.field_k.field_b == -2) {
                    stackOut_9_0 = 4;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  } else {
                    stackOut_11_0 = 1;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  }
                } else {
                  stackOut_4_0 = 3;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0;
                }
              } else {
                L0: {
                  if (lc.field_r == 0) {
                    nj.field_a = mh.field_x.a(il.field_g, (byte) 32, fh.field_g);
                    lc.field_r = lc.field_r + 1;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                L1: {
                  if (lc.field_r != 1) {
                    break L1;
                  } else {
                    if (2 == nj.field_a.field_b) {
                      stackOut_23_0 = wb.a(-1, 5);
                      stackIn_24_0 = stackOut_23_0;
                      return stackIn_24_0;
                    } else {
                      if (nj.field_a.field_b != 1) {
                        break L1;
                      } else {
                        lc.field_r = lc.field_r + 1;
                        break L1;
                      }
                    }
                  }
                }
                L2: {
                  if (lc.field_r != 2) {
                    break L2;
                  } else {
                    jj.field_M = new td((java.net.Socket) nj.field_a.field_e, mh.field_x);
                    var1_ref2 = new ni(13);
                    ob.a(wj.field_d, of.field_b, (byte) -19, b.field_a, var1_ref2);
                    var1_ref2.a(-11, 15);
                    var1_ref2.a(tj.field_c, (byte) -28);
                    jj.field_M.a((byte) -92, 13, 0, var1_ref2.field_k);
                    lc.field_r = lc.field_r + 1;
                    mk.field_e = 30000L + lj.a((byte) -80);
                    break L2;
                  }
                }
                L3: {
                  if (3 == lc.field_r) {
                    L4: {
                      if (0 >= jj.field_M.e(-110)) {
                        break L4;
                      } else {
                        var1_int = jj.field_M.f(1605772320);
                        if (var1_int == 0) {
                          lc.field_r = lc.field_r + 1;
                          if (!fleas.field_A) {
                            break L3;
                          } else {
                            break L4;
                          }
                        } else {
                          stackOut_35_0 = wb.a(var1_int, 5);
                          stackIn_36_0 = stackOut_35_0;
                          return stackIn_36_0;
                        }
                      }
                    }
                    if (~lj.a((byte) -25) < ~mk.field_e) {
                      stackOut_43_0 = wb.a(-2, 5);
                      stackIn_44_0 = stackOut_43_0;
                      return stackIn_44_0;
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                if (param0 > 94) {
                  if (lc.field_r == 4) {
                    td.field_k.a((Object) (Object) jj.field_M, md.field_S, (byte) 105);
                    lc.field_r = 0;
                    jj.field_M = null;
                    nj.field_a = null;
                    stackOut_51_0 = 0;
                    stackIn_52_0 = stackOut_51_0;
                    return stackIn_52_0;
                  } else {
                    stackOut_53_0 = -1;
                    stackIn_54_0 = stackOut_53_0;
                    return stackIn_54_0;
                  }
                } else {
                  stackOut_46_0 = -52;
                  stackIn_47_0 = stackOut_46_0;
                  return stackIn_47_0;
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (IOException) (Object) decompiledCaughtException;
              stackOut_55_0 = wb.a(-3, 5);
              stackIn_56_0 = stackOut_55_0;
              return stackIn_56_0;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw pf.a((Throwable) (Object) var1_ref, "ij.CA(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, String param1, String param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                ij.e((byte) 47);
                break L1;
              }
            }
            L2: {
              if (ok.field_x == null) {
                break L2;
              } else {
                ok.field_x.n(-22645);
                break L2;
              }
            }
            lg.field_b = new ul(param1, param2, false, true, true);
            ak.field_a.d((qa) (Object) lg.field_b, 26034);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("ij.DA(").append(param0).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L4;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    public static void e(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_H = null;
              field_F = null;
              if (param0 == -20) {
                break L1;
              } else {
                ij.e((byte) -66);
                break L1;
              }
            }
            field_J = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var1, "ij.AA(" + param0 + ')');
        }
    }

    public final void a(int param0, int param1, int param2, int param3, bb param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        int var7 = 0;
        bb stackIn_4_0 = null;
        bb stackIn_4_1 = null;
        bb stackIn_11_0 = null;
        bb stackIn_11_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        bb stackOut_3_0 = null;
        bb stackOut_3_1 = null;
        bb stackOut_10_0 = null;
        bb stackOut_10_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var7 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var6_int <= ~((ij) this).field_K.length) {
                    break L3;
                  } else {
                    stackOut_3_0 = ((ij) this).field_M[var6_int];
                    stackOut_3_1 = (bb) param4;
                    stackIn_11_0 = stackOut_3_0;
                    stackIn_11_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 != stackIn_4_1) {
                          break L4;
                        } else {
                          ((ij) this).field_G.a(((ij) this).field_K[var6_int], (byte) -96);
                          break L4;
                        }
                      }
                      var6_int++;
                      if (var7 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_10_0 = (bb) param4;
                stackOut_10_1 = ((ij) this).field_M[((ij) this).field_K.length];
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                break L2;
              }
              L5: {
                if (stackIn_11_0 != stackIn_11_1) {
                  break L5;
                } else {
                  ((ij) this).field_G.a(-92);
                  break L5;
                }
              }
              L6: {
                if (param3 == 248) {
                  break L6;
                } else {
                  ij.e((byte) -83);
                  break L6;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            runtimeException = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) runtimeException;
            stackOut_18_1 = new StringBuilder().append("ij.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L7;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        RuntimeException runtimeException = null;
        fa var5 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            super.b(param0, param1, param2, param3);
            if (param3 == 0) {
              L1: {
                var5 = ug.field_e;
                if (((ij) this).field_K == null) {
                  break L1;
                } else {
                  int discarded$2 = var5.a(lc.field_s, param1 + ((ij) this).field_y, ((ij) this).field_z + param0, ((ij) this).field_u, 20, 16777215, -1, 0, 0, var5.field_H + var5.field_K);
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pf.a((Throwable) (Object) runtimeException, "ij.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(String[] param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4_int = 0;
        me var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var6 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              ((ij) this).field_C.f(1);
              if (null == param0) {
                break L1;
              } else {
                if (param0.length != 0) {
                  var3_int = param0.length;
                  ((ij) this).field_K = new String[var3_int];
                  var4_int = 0;
                  L2: while (true) {
                    L3: {
                      if (~var3_int >= ~var4_int) {
                        break L3;
                      } else {
                        ((ij) this).field_K[var4_int] = al.a((CharSequence) (Object) param0[var4_int], (byte) 111).replace(' ', ' ');
                        var4_int++;
                        if (var6 == 0) {
                          continue L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var4 = new me(ug.field_e, 0, 1);
                    ((ij) this).field_M = new bb[var3_int - -1];
                    var5 = 0;
                    L4: while (true) {
                      L5: {
                        L6: {
                          if (~var5 <= ~var3_int) {
                            break L6;
                          } else {
                            ((ij) this).field_M[var5] = new bb(((ij) this).field_K[var5], (kd) this);
                            ((ij) this).field_M[var5].field_p = (ch) (Object) var4;
                            ((ij) this).field_M[var5].field_m = lh.field_d;
                            ((ij) this).field_M[var5].a(0, 80, 20 + var5 * 16, 15, 80);
                            ((ij) this).a((qa) (Object) ((ij) this).field_M[var5], (byte) -89);
                            var5++;
                            if (var6 != 0) {
                              break L5;
                            } else {
                              if (var6 == 0) {
                                continue L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        ((ij) this).field_M[var3_int] = new bb(ue.field_b, (kd) this);
                        var5 = -104 / ((param1 - 15) / 54);
                        ((ij) this).field_M[var3_int].field_p = (ch) (Object) var4;
                        ((ij) this).field_M[var3_int].a(0, 100, (var3_int - -1) * 16 + 20, 15, 80);
                        ((ij) this).a((qa) (Object) ((ij) this).field_M[var3_int], (byte) -112);
                        break L5;
                      }
                      break L0;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            ((ij) this).field_K = null;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3;
            stackOut_18_1 = new StringBuilder().append("ij.BA(");
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L7;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = 10;
        field_J = new String[]{"Complete first five levels of either set", "Complete first ten levels of either set", "Complete first twenty levels of either set", "Complete all levels of both sets", "Destroy the golden walls on level 'Golden Fleas'", "Save all fleas on level 1 of the Classic set", "Save all fleas on level 2 of the Classic set", "Save all fleas on level 3 of the Classic set", "Save all fleas on level 4 of the Classic set", "Save all fleas on level 5 of the Classic set", "Complete level 12 of the New set without any fleas drowning", "Get all fleas in the air at the same time on any level", "Complete the first five levels (of either set) without restarting", "Complete the first ten levels (of either set) without restarting", "Complete the first twenty levels (of either set) without restarting", "Complete all levels (of either set) without restarting"};
    }
}
