/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wua extends od {
    static int field_n;
    private int[] field_k;
    static apa field_o;
    private String[] field_l;
    private int[][] field_q;
    int[] field_m;
    static String field_p;

    final static boolean c(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 49) {
            break L0;
          } else {
            wua.a((byte) 74);
            break L0;
          }
        }
        L1: {
          L2: {
            if (-11 < (gda.field_c ^ -1)) {
              break L2;
            } else {
              if (cga.field_f < 13) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = TombRacer.field_G ? 1 : 0;
          if (param0 > 37) {
            break L0;
          } else {
            wua.a((byte) -54);
            break L0;
          }
        }
        L1: {
          if (this.field_m != null) {
            var2 = 0;
            L2: while (true) {
              if (this.field_m.length <= var2) {
                break L1;
              } else {
                this.field_m[var2] = fh.a(this.field_m[var2], 32768);
                var2++;
                if (var3 == 0) {
                  continue L2;
                } else {
                  return;
                }
              }
            }
          } else {
            break L1;
          }
        }
    }

    final void a(uia param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
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
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = -85 % ((param1 - 27) / 57);
            L1: while (true) {
              var4 = param0.h(255);
              if (-1 == (var4 ^ -1)) {
                break L0;
              } else {
                this.a(param0, var4, (byte) 46);
                if (var5 == 0) {
                  continue L1;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("wua.B(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    private final void a(uia param0, int param1, byte param2) {
        int[] array$1 = null;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        su var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 >= 3) {
                break L1;
              } else {
                field_o = (apa) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (-2 != (param1 ^ -1)) {
                  break L3;
                } else {
                  this.field_l = rga.a(32287, param0.e((byte) -76), '<');
                  if (var9 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (param1 == 2) {
                  break L4;
                } else {
                  if ((param1 ^ -1) == -4) {
                    var4_int = param0.h(255);
                    this.field_q = new int[var4_int][];
                    this.field_k = new int[var4_int];
                    var5 = 0;
                    L5: while (true) {
                      if (var5 >= var4_int) {
                        if (var9 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      } else {
                        var6 = param0.d(122);
                        var7 = li.a(var6, (byte) 126);
                        if (var9 != 0) {
                          break L2;
                        } else {
                          L6: {
                            L7: {
                              if (var7 != null) {
                                this.field_k[var5] = var6;
                                array$1 = new int[var7.field_b];
                                this.field_q[var5] = array$1;
                                var8 = 0;
                                L8: while (true) {
                                  if (var8 >= var7.field_b) {
                                    break L7;
                                  } else {
                                    this.field_q[var5][var8] = param0.d(124);
                                    var8++;
                                    if (var9 != 0) {
                                      break L6;
                                    } else {
                                      if (var9 == 0) {
                                        continue L8;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L7;
                              }
                            }
                            var5++;
                            break L6;
                          }
                          continue L5;
                        }
                      }
                    }
                  } else {
                    if (4 != param1) {
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              var4_int = param0.h(255);
              this.field_m = new int[var4_int];
              var5 = 0;
              L9: while (true) {
                if (var4_int <= var5) {
                  break L2;
                } else {
                  this.field_m[var5] = param0.d(123);
                  var5++;
                  if (var9 == 0) {
                    continue L9;
                  } else {
                    return;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) (var4);
            stackOut_30_1 = new StringBuilder().append("wua.C(");
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L10;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L10;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final String b(byte param0) {
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        StringBuilder stackIn_7_0 = null;
        StringBuilder stackIn_10_0 = null;
        StringBuilder stackOut_6_0 = null;
        StringBuilder stackOut_9_0 = null;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          var5 = new StringBuilder(80);
          var2 = var5;
          if (param0 == -5) {
            break L0;
          } else {
            this.field_k = (int[]) null;
            break L0;
          }
        }
        if (null != this.field_l) {
          discarded$6 = var5.append(this.field_l[0]);
          var3 = 1;
          L1: while (true) {
            L2: {
              L3: {
                if (this.field_l.length <= var3) {
                  break L3;
                } else {
                  discarded$7 = var2.append("...");
                  stackOut_6_0 = var5.append(this.field_l[var3]);
                  stackIn_10_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (var4 != 0) {
                    break L2;
                  } else {
                    var3++;
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              stackOut_9_0 = (StringBuilder) (var2);
              stackIn_10_0 = stackOut_9_0;
              break L2;
            }
            return ((StringBuilder) (Object) stackIn_10_0).toString();
          }
        } else {
          return "";
        }
    }

    public static void a(byte param0) {
        field_o = null;
        field_p = null;
        if (param0 > -1) {
            field_p = (String) null;
        }
    }

    wua() {
    }

    static {
        field_p = "Private";
    }
}
