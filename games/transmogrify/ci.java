/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci {
    private ih field_c;
    static boolean[] field_g;
    private Object[][] field_d;
    static da field_f;
    private int field_e;
    private boolean field_a;
    private el field_b;
    private Object[] field_h;

    final int a(int param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (this.b(14555, param0)) {
              if (param1 >= 71) {
                stackOut_6_0 = ((ci) this).field_b.field_i[param0];
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = 34;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var3, "ci.T(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    private final synchronized void a(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (!((ci) this).field_a) {
                  break L2;
                } else {
                  ((ci) this).field_h[param0] = (Object) (Object) ((ci) this).field_c.a(param0, 119);
                  if (!Transmogrify.field_A) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((ci) this).field_h[param0] = lf.a((byte) -43, false, ((ci) this).field_c.a(param0, 57));
              break L1;
            }
            var3_int = 62 / ((-6 - param1) / 62);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var3, "ci.D(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized int b(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_24_0 = 0;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (!((ci) this).a((byte) -123)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              var2_int = 0;
              var3 = 0;
              var4 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (((ci) this).field_h.length <= var4) {
                      break L3;
                    } else {
                      stackOut_8_0 = -1;
                      stackOut_8_1 = ~((ci) this).field_b.field_s[var4];
                      stackIn_16_0 = stackOut_8_0;
                      stackIn_16_1 = stackOut_8_1;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (stackIn_9_0 > stackIn_9_1) {
                            var3 = var3 + ((ci) this).a(true, var4);
                            var2_int += 100;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var4++;
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_15_0 = param0;
                  stackOut_15_1 = -22884;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  break L2;
                }
                L5: {
                  if (stackIn_16_0 == stackIn_16_1) {
                    break L5;
                  } else {
                    boolean discarded$1 = ((ci) this).a(((byte[]) ((Object[]) ((ci) this).field_h[1])[1])[1], (String) null);
                    break L5;
                  }
                }
                if (var2_int == 0) {
                  stackOut_22_0 = 100;
                  stackIn_23_0 = stackOut_22_0;
                  return stackIn_23_0;
                } else {
                  var4 = var3 * 100 / var2_int;
                  stackOut_24_0 = var4;
                  stackIn_25_0 = stackOut_24_0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var2, "ci.F(" + param0 + ')');
        }
        return stackIn_25_0;
    }

    final synchronized boolean a(byte param0) {
        RuntimeException var2 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 <= -112) {
                break L1;
              } else {
                int discarded$2 = ((ci) this).a(5, (String) ((ci) this).field_h[3]);
                break L1;
              }
            }
            L2: {
              if (null == ((ci) this).field_b) {
                ((ci) this).field_b = ((ci) this).field_c.a(-110);
                if (((ci) this).field_b != null) {
                  ((ci) this).field_d = new Object[((ci) this).field_b.field_l][];
                  ((ci) this).field_h = new Object[((ci) this).field_b.field_l];
                  break L2;
                } else {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                }
              } else {
                break L2;
              }
            }
            stackOut_10_0 = 1;
            stackIn_11_0 = stackOut_10_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var2, "ci.V(" + param0 + ')');
        }
        return stackIn_11_0 != 0;
    }

    final synchronized byte[] b(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_7_0 = null;
        Object stackIn_12_0 = null;
        byte[] stackIn_17_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_6_0 = null;
        Object stackOut_11_0 = null;
        byte[] stackOut_16_0 = null;
        Object stackOut_1_0 = null;
        try {
          if (((ci) this).a((byte) -118)) {
            if (1 == ((ci) this).field_b.field_i.length) {
              stackOut_6_0 = ((ci) this).a((byte) -93, param1, 0);
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              if (!this.b(14555, param1)) {
                stackOut_11_0 = null;
                stackIn_12_0 = stackOut_11_0;
                return (byte[]) (Object) stackIn_12_0;
              } else {
                if (((ci) this).field_b.field_i[param1] == 1) {
                  stackOut_16_0 = ((ci) this).a((byte) -93, 0, param1);
                  stackIn_17_0 = stackOut_16_0;
                  return stackIn_17_0;
                } else {
                  var3_int = 42 % ((param0 - -22) / 63);
                  throw new RuntimeException();
                }
              }
            }
          } else {
            stackOut_1_0 = null;
            stackIn_2_0 = stackOut_1_0;
            return (byte[]) (Object) stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var3, "ci.H(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized byte[] a(String param0, byte param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_9_0 = null;
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_8_0 = null;
        byte[] stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            if (!((ci) this).a((byte) -128)) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (byte[]) (Object) stackIn_4_0;
            } else {
              param2 = param2.toLowerCase();
              param0 = param0.toLowerCase();
              var4_int = ((ci) this).field_b.field_h.a(gb.a(-14741, (CharSequence) (Object) param2), false);
              if (!this.b(14555, var4_int)) {
                stackOut_8_0 = null;
                stackIn_9_0 = stackOut_8_0;
                return (byte[]) (Object) stackIn_9_0;
              } else {
                L1: {
                  if (param1 > 66) {
                    break L1;
                  } else {
                    field_f = (da) ((ci) this).field_h[3];
                    break L1;
                  }
                }
                var5 = ((ci) this).field_b.field_t[var4_int].a(gb.a(-14741, (CharSequence) (Object) param0), false);
                stackOut_13_0 = ((ci) this).a((byte) -93, var5, var4_int);
                stackIn_14_0 = stackOut_13_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("ci.Q(");
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L2;
            }
          }
          L3: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param1).append(',');
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L3;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L3;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
        return stackIn_14_0;
    }

    final synchronized boolean c(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (((ci) this).a((byte) -117)) {
              var2_int = 1;
              if (param0 == 32031) {
                var3 = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      if (~((ci) this).field_b.field_c.length >= ~var3) {
                        break L3;
                      } else {
                        stackOut_9_0 = ((ci) this).field_b.field_c[var3];
                        stackIn_17_0 = stackOut_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var5 != 0) {
                          break L2;
                        } else {
                          L4: {
                            var4 = stackIn_10_0;
                            if (((ci) this).field_h[var4] != null) {
                              break L4;
                            } else {
                              this.a(var4, param0 + -31917);
                              if (null != ((ci) this).field_h[var4]) {
                                break L4;
                              } else {
                                var2_int = 0;
                                break L4;
                              }
                            }
                          }
                          var3++;
                          if (var5 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    stackOut_16_0 = var2_int;
                    stackIn_17_0 = stackOut_16_0;
                    break L2;
                  }
                  break L0;
                }
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var2, "ci.P(" + param0 + ')');
        }
        return stackIn_17_0 != 0;
    }

    final int a(int param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (this.b(param0 + 14556, param2)) {
              param1 = param1.toLowerCase();
              var4_int = ((ci) this).field_b.field_t[param2].a(gb.a(-14741, (CharSequence) (Object) param1), false);
              if (param0 == -1) {
                if (!this.a(var4_int, (byte) 87, param2)) {
                  stackOut_9_0 = -1;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  stackOut_11_0 = var4_int;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                }
              } else {
                stackOut_4_0 = -93;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = -1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("ci.M(").append(param0).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L1;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param2 + ')');
        }
        return stackIn_12_0;
    }

    final synchronized int a(boolean param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                int[] discarded$2 = ((ci) this).a(((boolean[]) ((ci) this).field_h[0])[12]);
                break L1;
              }
            }
            if (this.b(14555, param1)) {
              if (((ci) this).field_h[param1] != null) {
                stackOut_9_0 = 100;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0;
              } else {
                stackOut_11_0 = ((ci) this).field_c.b(-42, param1);
                stackIn_12_0 = stackOut_11_0;
                break L0;
              }
            } else {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var3, "ci.B(" + param0 + ',' + param1 + ')');
        }
        return stackIn_12_0;
    }

    final static boolean a(char param0, int param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        char stackIn_23_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        char stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_7_0 = 0;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (Character.isISOControl(param0)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              if (!qk.a(param0, (byte) -110)) {
                var2 = h.field_l;
                var3 = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      L4: {
                        L5: {
                          if (var3 >= var2.length) {
                            break L5;
                          } else {
                            var4 = var2[var3];
                            stackOut_11_0 = ~param0;
                            stackOut_11_1 = ~var4;
                            stackIn_21_0 = stackOut_11_0;
                            stackIn_21_1 = stackOut_11_1;
                            stackIn_12_0 = stackOut_11_0;
                            stackIn_12_1 = stackOut_11_1;
                            if (var5 != 0) {
                              L6: while (true) {
                                if (stackIn_21_0 >= stackIn_21_1) {
                                  break L3;
                                } else {
                                  var4 = var2[var3];
                                  stackOut_22_0 = param0;
                                  stackIn_30_0 = stackOut_22_0;
                                  stackIn_23_0 = stackOut_22_0;
                                  if (var5 != 0) {
                                    break L2;
                                  } else {
                                    if (stackIn_23_0 != var4) {
                                      var3++;
                                      if (var5 == 0) {
                                        stackOut_20_0 = var3;
                                        stackOut_20_1 = var2.length;
                                        stackIn_21_0 = stackOut_20_0;
                                        stackIn_21_1 = stackOut_20_1;
                                        continue L6;
                                      } else {
                                        break L3;
                                      }
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                              }
                            } else {
                              if (stackIn_12_0 == stackIn_12_1) {
                                stackOut_16_0 = 1;
                                stackIn_17_0 = stackOut_16_0;
                                return stackIn_17_0 != 0;
                              } else {
                                var3++;
                                if (var5 == 0) {
                                  continue L1;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                        }
                        var2 = hf.field_k;
                        var3 = param1;
                        L7: while (true) {
                          stackOut_20_0 = var3;
                          stackOut_20_1 = var2.length;
                          stackIn_21_0 = stackOut_20_0;
                          stackIn_21_1 = stackOut_20_1;
                          if (stackIn_21_0 >= stackIn_21_1) {
                            break L3;
                          } else {
                            var4 = var2[var3];
                            stackOut_22_0 = param0;
                            stackIn_30_0 = stackOut_22_0;
                            stackIn_23_0 = stackOut_22_0;
                            if (var5 != 0) {
                              break L2;
                            } else {
                              if (stackIn_23_0 != var4) {
                                var3++;
                                if (var5 == 0) {
                                  continue L7;
                                } else {
                                  break L3;
                                }
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      }
                      stackOut_26_0 = 1;
                      stackIn_27_0 = stackOut_26_0;
                      return stackIn_27_0 != 0;
                    }
                    stackOut_29_0 = 0;
                    stackIn_30_0 = stackOut_29_0;
                    break L2;
                  }
                  break L0;
                }
              } else {
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var2_ref, "ci.J(" + param0 + ',' + param1 + ')');
        }
        return stackIn_30_0 != 0;
    }

    private final synchronized boolean b(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (((ci) this).a((byte) -123)) {
              L1: {
                if (0 > param1) {
                  break L1;
                } else {
                  if (((ci) this).field_b.field_i.length <= param1) {
                    break L1;
                  } else {
                    if (((ci) this).field_b.field_i[param1] != 0) {
                      L2: {
                        if (param0 == 14555) {
                          break L2;
                        } else {
                          ((ci) this).field_a = false;
                          break L2;
                        }
                      }
                      stackOut_19_0 = 1;
                      stackIn_20_0 = stackOut_19_0;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              if (uk.field_gb) {
                throw new IllegalArgumentException(Integer.toString(param1));
              } else {
                stackOut_13_0 = 0;
                stackIn_14_0 = stackOut_13_0;
                return stackIn_14_0 != 0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var3, "ci.N(" + param0 + ',' + param1 + ')');
        }
        return stackIn_20_0 != 0;
    }

    private final synchronized boolean a(int param0, int[] param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        Object[] var9 = null;
        int var9_int = 0;
        byte[] var9_array = null;
        int var10_int = 0;
        byte[] var10 = null;
        oa var10_ref = null;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        oa var13 = null;
        int[] var14 = null;
        int var14_int = 0;
        int var15_int = 0;
        byte[][] var15 = null;
        int var16 = 0;
        byte[] var16_ref_byte__ = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        Object stackIn_17_0 = null;
        int[] stackIn_17_1 = null;
        int stackIn_31_0 = 0;
        Object stackIn_33_0 = null;
        int[] stackIn_33_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        int stackIn_54_2 = 0;
        int stackIn_78_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_136_0 = 0;
        int stackIn_145_0 = 0;
        int stackIn_158_0 = 0;
        RuntimeException stackIn_160_0 = null;
        StringBuilder stackIn_160_1 = null;
        RuntimeException stackIn_162_0 = null;
        StringBuilder stackIn_162_1 = null;
        RuntimeException stackIn_163_0 = null;
        StringBuilder stackIn_163_1 = null;
        String stackIn_163_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_9_0 = 0;
        Object stackOut_16_0 = null;
        int[] stackOut_16_1 = null;
        Object stackOut_32_0 = null;
        int[] stackOut_32_1 = null;
        int stackOut_30_0 = 0;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        int stackOut_53_2 = 0;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        int stackOut_51_2 = 0;
        int stackOut_77_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_116_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_135_0 = 0;
        int stackOut_144_0 = 0;
        int stackOut_157_0 = 0;
        RuntimeException stackOut_159_0 = null;
        StringBuilder stackOut_159_1 = null;
        RuntimeException stackOut_162_0 = null;
        StringBuilder stackOut_162_1 = null;
        String stackOut_162_2 = null;
        RuntimeException stackOut_160_0 = null;
        StringBuilder stackOut_160_1 = null;
        String stackOut_160_2 = null;
        var22 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (!this.b(14555, param2)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              if (null == ((ci) this).field_h[param2]) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0 != 0;
              } else {
                L1: {
                  var5_int = ((ci) this).field_b.field_s[param2];
                  var6 = ((ci) this).field_b.field_f[param2];
                  if (((ci) this).field_d[param2] != null) {
                    break L1;
                  } else {
                    ((ci) this).field_d[param2] = new Object[((ci) this).field_b.field_i[param2]];
                    break L1;
                  }
                }
                var7 = ((ci) this).field_d[param2];
                var8 = 1;
                var9_int = param3;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (~var9_int <= ~var5_int) {
                        break L4;
                      } else {
                        stackOut_16_0 = null;
                        stackOut_16_1 = (int[]) var6;
                        stackIn_33_0 = stackOut_16_0;
                        stackIn_33_1 = stackOut_16_1;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        if (var22 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              if (stackIn_17_0 != (Object) (Object) stackIn_17_1) {
                                break L6;
                              } else {
                                var10_int = var9_int;
                                if (var22 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            var10_int = var6[var9_int];
                            break L5;
                          }
                          L7: {
                            if (var7[var10_int] == null) {
                              var8 = 0;
                              if (var22 == 0) {
                                break L4;
                              } else {
                                break L7;
                              }
                            } else {
                              break L7;
                            }
                          }
                          var9_int++;
                          if (var22 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    if (var8 == 0) {
                      stackOut_32_0 = null;
                      stackOut_32_1 = (int[]) param1;
                      stackIn_33_0 = stackOut_32_0;
                      stackIn_33_1 = stackOut_32_1;
                      break L3;
                    } else {
                      stackOut_30_0 = 1;
                      stackIn_31_0 = stackOut_30_0;
                      return stackIn_31_0 != 0;
                    }
                  }
                  L8: {
                    L9: {
                      if (stackIn_33_0 == (Object) (Object) stackIn_33_1) {
                        break L9;
                      } else {
                        L10: {
                          if (param1[0] != 0) {
                            break L10;
                          } else {
                            if (param1[1] != 0) {
                              break L10;
                            } else {
                              if (param1[2] != 0) {
                                break L10;
                              } else {
                                if (param1[3] == 0) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                        }
                        var9_array = cf.a(((ci) this).field_h[param2], true, (byte) 16);
                        var10_ref = new oa(var9_array);
                        var10_ref.a(param1, false, 5, var10_ref.field_g.length);
                        break L8;
                      }
                    }
                    var9_array = cf.a(((ci) this).field_h[param2], false, (byte) 16);
                    break L8;
                  }
                  try {
                    L11: {
                      var10 = lk.a(70, var9_array);
                      break L11;
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L12: {
                      var11_ref_RuntimeException = decompiledCaughtException;
                      stackOut_50_0 = (RuntimeException) var11_ref_RuntimeException;
                      stackOut_50_1 = new StringBuilder();
                      stackIn_53_0 = stackOut_50_0;
                      stackIn_53_1 = stackOut_50_1;
                      stackIn_51_0 = stackOut_50_0;
                      stackIn_51_1 = stackOut_50_1;
                      if (null == param1) {
                        stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
                        stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
                        stackOut_53_2 = 0;
                        stackIn_54_0 = stackOut_53_0;
                        stackIn_54_1 = stackOut_53_1;
                        stackIn_54_2 = stackOut_53_2;
                        break L12;
                      } else {
                        stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
                        stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
                        stackOut_51_2 = 1;
                        stackIn_54_0 = stackOut_51_0;
                        stackIn_54_1 = stackOut_51_1;
                        stackIn_54_2 = stackOut_51_2;
                        break L12;
                      }
                    }
                    throw ch.a((Throwable) (Object) stackIn_54_0, (stackIn_54_2 != 0) + " " + param2 + " " + var9_array.length + " " + v.a(var9_array, var9_array.length, (byte) 40) + " " + v.a(var9_array, var9_array.length + -2, (byte) 40) + " " + ((ci) this).field_b.field_j[param2] + " " + ((ci) this).field_b.field_r);
                  }
                  L13: {
                    if (((ci) this).field_a) {
                      ((ci) this).field_h[param2] = null;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    L15: {
                      L16: {
                        if (var5_int > 1) {
                          break L16;
                        } else {
                          L17: {
                            L18: {
                              if (null != var6) {
                                break L18;
                              } else {
                                var11 = 0;
                                if (var22 == 0) {
                                  break L17;
                                } else {
                                  break L18;
                                }
                              }
                            }
                            var11 = var6[0];
                            break L17;
                          }
                          L19: {
                            L20: {
                              if (((ci) this).field_e == 0) {
                                break L20;
                              } else {
                                var7[var11] = (Object) (Object) var10;
                                if (var22 == 0) {
                                  break L19;
                                } else {
                                  break L20;
                                }
                              }
                            }
                            var7[var11] = lf.a((byte) -43, false, var10);
                            break L19;
                          }
                          if (var22 == 0) {
                            break L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                      L21: {
                        if (2 != ((ci) this).field_e) {
                          break L21;
                        } else {
                          var11 = var10.length;
                          var11--;
                          var12 = 255 & var10[var11];
                          var11 = var11 - 4 * var12 * var5_int;
                          var13 = new oa(var10);
                          var14_int = 0;
                          var15_int = 0;
                          var13.field_h = var11;
                          var16 = 0;
                          L22: while (true) {
                            L23: {
                              L24: {
                                if (var12 <= var16) {
                                  break L24;
                                } else {
                                  var17 = 0;
                                  stackOut_77_0 = 0;
                                  stackIn_94_0 = stackOut_77_0;
                                  stackIn_78_0 = stackOut_77_0;
                                  if (var22 != 0) {
                                    break L23;
                                  } else {
                                    var18 = stackIn_78_0;
                                    L25: while (true) {
                                      L26: {
                                        L27: {
                                          if (~var18 <= ~var5_int) {
                                            break L27;
                                          } else {
                                            var17 = var17 + var13.c((byte) -107);
                                            if (var22 != 0) {
                                              break L26;
                                            } else {
                                              L28: {
                                                L29: {
                                                  if (null != var6) {
                                                    break L29;
                                                  } else {
                                                    var19 = var18;
                                                    if (var22 == 0) {
                                                      break L28;
                                                    } else {
                                                      break L29;
                                                    }
                                                  }
                                                }
                                                var19 = var6[var18];
                                                break L28;
                                              }
                                              L30: {
                                                if (~var19 == ~param0) {
                                                  var15_int = var19;
                                                  var14_int = var14_int + var17;
                                                  break L30;
                                                } else {
                                                  break L30;
                                                }
                                              }
                                              var18++;
                                              if (var22 == 0) {
                                                continue L25;
                                              } else {
                                                break L27;
                                              }
                                            }
                                          }
                                        }
                                        var16++;
                                        break L26;
                                      }
                                      if (var22 == 0) {
                                        continue L22;
                                      } else {
                                        break L24;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_93_0 = var14_int;
                              stackIn_94_0 = stackOut_93_0;
                              break L23;
                            }
                            if (stackIn_94_0 != 0) {
                              var16_ref_byte__ = new byte[var14_int];
                              var14_int = 0;
                              var13.field_h = var11;
                              var17 = 0;
                              var18 = 0;
                              L31: while (true) {
                                L32: {
                                  if (~var12 >= ~var18) {
                                    break L32;
                                  } else {
                                    var19 = 0;
                                    stackOut_99_0 = 0;
                                    stackIn_158_0 = stackOut_99_0;
                                    stackIn_100_0 = stackOut_99_0;
                                    if (var22 != 0) {
                                      break L14;
                                    } else {
                                      var20 = stackIn_100_0;
                                      L33: while (true) {
                                        L34: {
                                          L35: {
                                            if (var5_int <= var20) {
                                              break L35;
                                            } else {
                                              var19 = var19 + var13.c((byte) -110);
                                              if (var22 != 0) {
                                                break L34;
                                              } else {
                                                L36: {
                                                  L37: {
                                                    if (null != var6) {
                                                      break L37;
                                                    } else {
                                                      var21 = var20;
                                                      if (var22 == 0) {
                                                        break L36;
                                                      } else {
                                                        break L37;
                                                      }
                                                    }
                                                  }
                                                  var21 = var6[var20];
                                                  break L36;
                                                }
                                                L38: {
                                                  if (param0 != var21) {
                                                    break L38;
                                                  } else {
                                                    ji.a(var10, var17, var16_ref_byte__, var14_int, var19);
                                                    var14_int = var14_int + var19;
                                                    break L38;
                                                  }
                                                }
                                                var17 = var17 + var19;
                                                var20++;
                                                if (var22 == 0) {
                                                  continue L33;
                                                } else {
                                                  break L35;
                                                }
                                              }
                                            }
                                          }
                                          var18++;
                                          break L34;
                                        }
                                        if (var22 == 0) {
                                          continue L31;
                                        } else {
                                          break L32;
                                        }
                                      }
                                    }
                                  }
                                }
                                var7[var15_int] = (Object) (Object) var16_ref_byte__;
                                if (var22 == 0) {
                                  break L15;
                                } else {
                                  break L21;
                                }
                              }
                            } else {
                              stackOut_95_0 = 1;
                              stackIn_96_0 = stackOut_95_0;
                              return stackIn_96_0 != 0;
                            }
                          }
                        }
                      }
                      var11 = var10.length;
                      var11--;
                      var12 = 255 & var10[var11];
                      var11 = var11 - 4 * (var12 * var5_int);
                      var13 = new oa(var10);
                      var13.field_h = var11;
                      var14 = new int[var5_int];
                      var15_int = 0;
                      L39: while (true) {
                        L40: {
                          L41: {
                            if (var15_int >= var12) {
                              break L41;
                            } else {
                              var16 = 0;
                              stackOut_116_0 = 0;
                              stackIn_126_0 = stackOut_116_0;
                              stackIn_117_0 = stackOut_116_0;
                              if (var22 != 0) {
                                break L40;
                              } else {
                                var17 = stackIn_117_0;
                                L42: while (true) {
                                  L43: {
                                    L44: {
                                      if (~var5_int >= ~var17) {
                                        break L44;
                                      } else {
                                        var16 = var16 + var13.c((byte) -106);
                                        var14[var17] = var14[var17] + var16;
                                        var17++;
                                        if (var22 != 0) {
                                          break L43;
                                        } else {
                                          if (var22 == 0) {
                                            continue L42;
                                          } else {
                                            break L44;
                                          }
                                        }
                                      }
                                    }
                                    var15_int++;
                                    break L43;
                                  }
                                  if (var22 == 0) {
                                    continue L39;
                                  } else {
                                    break L41;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_125_0 = var5_int;
                          stackIn_126_0 = stackOut_125_0;
                          break L40;
                        }
                        var15 = new byte[stackIn_126_0][];
                        var16 = 0;
                        L45: while (true) {
                          L46: {
                            L47: {
                              if (var16 >= var5_int) {
                                break L47;
                              } else {
                                var15[var16] = new byte[var14[var16]];
                                var14[var16] = 0;
                                var16++;
                                if (var22 != 0) {
                                  break L46;
                                } else {
                                  if (var22 == 0) {
                                    continue L45;
                                  } else {
                                    break L47;
                                  }
                                }
                              }
                            }
                            var13.field_h = var11;
                            var16 = 0;
                            break L46;
                          }
                          var17 = 0;
                          L48: while (true) {
                            L49: {
                              L50: {
                                if (~var17 <= ~var12) {
                                  break L50;
                                } else {
                                  var18 = 0;
                                  stackOut_135_0 = 0;
                                  stackIn_145_0 = stackOut_135_0;
                                  stackIn_136_0 = stackOut_135_0;
                                  if (var22 != 0) {
                                    break L49;
                                  } else {
                                    var19 = stackIn_136_0;
                                    L51: while (true) {
                                      L52: {
                                        L53: {
                                          if (~var19 <= ~var5_int) {
                                            break L53;
                                          } else {
                                            var18 = var18 + var13.c((byte) -119);
                                            ji.a(var10, var16, var15[var19], var14[var19], var18);
                                            var16 = var16 + var18;
                                            var14[var19] = var14[var19] + var18;
                                            var19++;
                                            if (var22 != 0) {
                                              break L52;
                                            } else {
                                              if (var22 == 0) {
                                                continue L51;
                                              } else {
                                                break L53;
                                              }
                                            }
                                          }
                                        }
                                        var17++;
                                        break L52;
                                      }
                                      if (var22 == 0) {
                                        continue L48;
                                      } else {
                                        break L50;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_144_0 = 0;
                              stackIn_145_0 = stackOut_144_0;
                              break L49;
                            }
                            var17 = stackIn_145_0;
                            L54: while (true) {
                              if (var17 >= var5_int) {
                                break L15;
                              } else {
                                L55: {
                                  L56: {
                                    if (null != var6) {
                                      break L56;
                                    } else {
                                      var18 = var17;
                                      if (var22 == 0) {
                                        break L55;
                                      } else {
                                        break L56;
                                      }
                                    }
                                  }
                                  var18 = var6[var17];
                                  break L55;
                                }
                                L57: {
                                  L58: {
                                    if (0 != ((ci) this).field_e) {
                                      break L58;
                                    } else {
                                      var7[var18] = lf.a((byte) -43, false, var15[var17]);
                                      if (var22 == 0) {
                                        break L57;
                                      } else {
                                        break L58;
                                      }
                                    }
                                  }
                                  var7[var18] = (Object) (Object) var15[var17];
                                  break L57;
                                }
                                var17++;
                                if (var22 == 0) {
                                  continue L54;
                                } else {
                                  break L15;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_157_0 = 1;
                    stackIn_158_0 = stackOut_157_0;
                    break L14;
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L59: {
            var5 = decompiledCaughtException;
            stackOut_159_0 = (RuntimeException) var5;
            stackOut_159_1 = new StringBuilder().append("ci.K(").append(param0).append(',');
            stackIn_162_0 = stackOut_159_0;
            stackIn_162_1 = stackOut_159_1;
            stackIn_160_0 = stackOut_159_0;
            stackIn_160_1 = stackOut_159_1;
            if (param1 == null) {
              stackOut_162_0 = (RuntimeException) (Object) stackIn_162_0;
              stackOut_162_1 = (StringBuilder) (Object) stackIn_162_1;
              stackOut_162_2 = "null";
              stackIn_163_0 = stackOut_162_0;
              stackIn_163_1 = stackOut_162_1;
              stackIn_163_2 = stackOut_162_2;
              break L59;
            } else {
              stackOut_160_0 = (RuntimeException) (Object) stackIn_160_0;
              stackOut_160_1 = (StringBuilder) (Object) stackIn_160_1;
              stackOut_160_2 = "{...}";
              stackIn_163_0 = stackOut_160_0;
              stackIn_163_1 = stackOut_160_1;
              stackIn_163_2 = stackOut_160_2;
              break L59;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_163_0, stackIn_163_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_158_0 != 0;
    }

    private final synchronized boolean a(int param0, byte param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        try {
          L0: {
            if (!((ci) this).a((byte) -118)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (param1 > 72) {
                  break L1;
                } else {
                  boolean discarded$2 = ((ci) this).a((byte) -97, (String) ((ci) this).field_h[2], (String) null);
                  break L1;
                }
              }
              L2: {
                if (param2 < 0) {
                  break L2;
                } else {
                  if (0 > param0) {
                    break L2;
                  } else {
                    if (((ci) this).field_b.field_i.length <= param2) {
                      break L2;
                    } else {
                      if (~((ci) this).field_b.field_i[param2] < ~param0) {
                        stackOut_25_0 = 1;
                        stackIn_26_0 = stackOut_25_0;
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              if (!uk.field_gb) {
                stackOut_23_0 = 0;
                stackIn_24_0 = stackOut_23_0;
                return stackIn_24_0 != 0;
              } else {
                throw new IllegalArgumentException(param2 + " " + param0);
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var4, "ci.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_26_0 != 0;
    }

    final byte[] a(byte param0, int param1, int param2) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param0 == -93) {
              stackOut_3_0 = this.a(param1, param2, (int[]) null, param0 ^ 20);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var4, "ci.U(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    final boolean a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        boolean stackOut_5_0 = false;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            var3_int = 88 / ((62 - param0) / 48);
            if (!((ci) this).a((byte) -117)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              param1 = param1.toLowerCase();
              var4 = ((ci) this).field_b.field_h.a(gb.a(-14741, (CharSequence) (Object) param1), false);
              stackOut_5_0 = ((ci) this).a((byte) 107, var4);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("ci.L(").append(param0).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L1;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_6_0;
    }

    private final synchronized byte[] a(int param0, int param1, int[] param2, int param3) {
        Object var5 = null;
        int var6 = 0;
        byte[] stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_40_0 = null;
        Object stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        Object stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        Object stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_14_0 = null;
        Object stackOut_39_0 = null;
        Object stackOut_4_0 = null;
        byte[] stackOut_1_0 = null;
        Object stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        Object stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        Object stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        try {
          L0: {
            if (param3 <= -46) {
              if (this.a(param0, (byte) 88, param1)) {
                L1: {
                  L2: {
                    var5 = null;
                    if (null == ((ci) this).field_d[param1]) {
                      break L2;
                    } else {
                      if (((ci) this).field_d[param1][param0] == null) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  var6 = this.a(param0, param2, param1, 0) ? 1 : 0;
                  if (var6 != 0) {
                    break L1;
                  } else {
                    this.a(param1, -69);
                    var6 = this.a(param0, param2, param1, 0) ? 1 : 0;
                    if (var6 != 0) {
                      break L1;
                    } else {
                      stackOut_14_0 = null;
                      stackIn_15_0 = stackOut_14_0;
                      return (byte[]) (Object) stackIn_15_0;
                    }
                  }
                }
                if (((ci) this).field_d[param1] != null) {
                  L3: {
                    if (((ci) this).field_d[param1][param0] == null) {
                      break L3;
                    } else {
                      var5 = (Object) (Object) cf.a(((ci) this).field_d[param1][param0], false, (byte) 16);
                      if (var5 != null) {
                        break L3;
                      } else {
                        throw new RuntimeException("");
                      }
                    }
                  }
                  L4: {
                    if (null != var5) {
                      L5: {
                        if (((ci) this).field_e != 1) {
                          break L5;
                        } else {
                          ((ci) this).field_d[param1][param0] = null;
                          if (((ci) this).field_b.field_i[param1] != 1) {
                            break L4;
                          } else {
                            ((ci) this).field_d[param1] = null;
                            if (!Transmogrify.field_A) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      if (((ci) this).field_e == 2) {
                        ((ci) this).field_d[param1] = null;
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  stackOut_39_0 = var5;
                  stackIn_40_0 = stackOut_39_0;
                  break L0;
                } else {
                  throw new RuntimeException("");
                }
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (byte[]) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = (byte[]) ((ci) this).field_h[2];
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_41_0 = var5;
            stackOut_41_1 = new StringBuilder().append("ci.A(").append(param0).append(',').append(param1).append(',');
            stackIn_44_0 = stackOut_41_0;
            stackIn_44_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param2 == null) {
              stackOut_44_0 = stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L6;
            } else {
              stackOut_42_0 = stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_45_0 = stackOut_42_0;
              stackIn_45_1 = stackOut_42_1;
              stackIn_45_2 = stackOut_42_2;
              break L6;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_45_0, stackIn_45_2 + ',' + param3 + ')');
        }
        return (byte[]) (Object) stackIn_40_0;
    }

    final int[] a(boolean param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        int[] stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (((ci) this).a((byte) -114)) {
              if (!param0) {
                stackOut_6_0 = ((ci) this).field_b.field_c;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (int[]) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (int[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var2, "ci.BA(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    final int a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
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
            if (!((ci) this).a((byte) -119)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                param1 = param1.toLowerCase();
                var3_int = ((ci) this).field_b.field_h.a(gb.a(-14741, (CharSequence) (Object) param1), false);
                if (param0 == 0) {
                  break L1;
                } else {
                  int discarded$2 = ((ci) this).a(((int[]) ((ci) this).field_h[1])[1], (String) ((ci) this).field_h[4], -26);
                  break L1;
                }
              }
              stackOut_8_0 = ((ci) this).a(true, var3_int);
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("ci.R(").append(param0).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L2;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_9_0;
    }

    final int a(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        try {
          L0: {
            var2_int = 53 % ((52 - param0) / 32);
            if (!((ci) this).a((byte) -123)) {
              stackOut_3_0 = -1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              stackOut_5_0 = ((ci) this).field_b.field_i.length;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var2, "ci.G(" + param0 + ')');
        }
        return stackIn_6_0;
    }

    final synchronized boolean a(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (this.b(14555, param1)) {
              var3_int = 114 % ((param0 - 40) / 56);
              if (((ci) this).field_h[param1] != null) {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                this.a(param1, -124);
                if (null == ((ci) this).field_h[param1]) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  stackOut_9_0 = 1;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0 != 0;
                }
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var3, "ci.E(" + param0 + ',' + param1 + ')');
        }
        return stackIn_12_0 != 0;
    }

    public static void d(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_g = null;
              if (param0 <= -74) {
                break L1;
              } else {
                ci.d(-75);
                break L1;
              }
            }
            field_f = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var1, "ci.I(" + param0 + ')');
        }
    }

    final boolean b(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        boolean stackOut_4_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (((ci) this).a((byte) -115)) {
              param1 = param1.toLowerCase();
              if (param0 == -120) {
                var3_int = ((ci) this).field_b.field_h.a(gb.a(-14741, (CharSequence) (Object) param1), false);
                if (var3_int < 0) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0 != 0;
                } else {
                  stackOut_11_0 = 1;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                }
              } else {
                stackOut_4_0 = ((boolean[]) ((Object[]) ((ci) this).field_h[10])[0])[4];
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("ci.O(").append(param0).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L1;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_12_0 != 0;
    }

    final boolean a(byte param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        boolean stackIn_2_0 = false;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        boolean stackOut_11_0 = false;
        int stackOut_9_0 = 0;
        boolean stackOut_1_0 = false;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if (param0 >= 17) {
              if (!((ci) this).a((byte) -116)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                param2 = param2.toLowerCase();
                param1 = param1.toLowerCase();
                var4_int = ((ci) this).field_b.field_h.a(gb.a(-14741, (CharSequence) (Object) param2), false);
                if (this.b(14555, var4_int)) {
                  var5 = ((ci) this).field_b.field_t[var4_int].a(gb.a(-14741, (CharSequence) (Object) param1), false);
                  stackOut_11_0 = ((ci) this).a(var5, 0, var4_int);
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0 != 0;
                }
              }
            } else {
              stackOut_1_0 = ((boolean[]) ((ci) this).field_h[0])[3];
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("ci.S(").append(param0).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L1;
            }
          }
          L2: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L2;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L2;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
        return stackIn_12_0;
    }

    final synchronized boolean a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (this.a(param0, (byte) 77, param2)) {
              L1: {
                if (null == ((ci) this).field_d[param2]) {
                  break L1;
                } else {
                  if (null != ((ci) this).field_d[param2][param0]) {
                    stackOut_9_0 = 1;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0 != 0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (param1 == 0) {
                  break L2;
                } else {
                  ((int[]) ((Object[]) ((ci) this).field_h[5])[22])[8] = ((int[]) ((ci) this).field_h[2])[5];
                  break L2;
                }
              }
              if (null != ((ci) this).field_h[param2]) {
                stackOut_17_0 = 1;
                stackIn_18_0 = stackOut_17_0;
                return stackIn_18_0 != 0;
              } else {
                this.a(param2, -102);
                if (null == ((ci) this).field_h[param2]) {
                  stackOut_22_0 = 0;
                  stackIn_23_0 = stackOut_22_0;
                  break L0;
                } else {
                  stackOut_20_0 = 1;
                  stackIn_21_0 = stackOut_20_0;
                  return stackIn_21_0 != 0;
                }
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var4, "ci.W(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_23_0 != 0;
    }

    final int b(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (((ci) this).a((byte) -113)) {
              param1 = param1.toLowerCase();
              var3_int = ((ci) this).field_b.field_h.a(gb.a(-14741, (CharSequence) (Object) param1), false);
              if (this.b(14555, var3_int)) {
                if (param0 >= 39) {
                  stackOut_9_0 = var3_int;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_7_0 = 17;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                stackOut_4_0 = -1;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = -1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("ci.AA(").append(param0).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L1;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_10_0;
    }

    ci(ih param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        ((ci) this).field_b = null;
        try {
          L0: {
            L1: {
              if (param2 < 0) {
                break L1;
              } else {
                if (param2 > 2) {
                  break L1;
                } else {
                  ((ci) this).field_a = param1;
                  ((ci) this).field_c = param0;
                  ((ci) this).field_e = param2;
                  break L0;
                }
              }
            }
            throw new IllegalArgumentException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) runtimeException;
            stackOut_8_1 = new StringBuilder().append("ci.<init>(");
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
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L2;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new boolean[8];
        field_g[4] = true;
        field_g[3] = true;
        field_g[2] = true;
        field_g[5] = true;
        field_g[6] = true;
    }
}
