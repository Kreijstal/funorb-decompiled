/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk {
    private ps field_e;
    private Object[][] field_d;
    private Object[] field_a;
    static nf field_g;
    private ip field_h;
    private int field_b;
    private boolean field_f;
    static String field_c;

    final synchronized boolean c(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (this.a(param0, (byte) 42)) {
              if (((gk) this).field_a[param0] == null) {
                this.a(param0, true);
                if (param1 == 0) {
                  if (null == ((gk) this).field_a[param0]) {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    break L0;
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0 != 0;
                  }
                } else {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                }
              } else {
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
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
          throw pn.a((Throwable) (Object) var3, "gk.P(" + param0 + ',' + param1 + ')');
        }
        return stackIn_13_0 != 0;
    }

    private final synchronized boolean a(int param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (((gk) this).b((byte) 118)) {
              L1: {
                if (param0 < 0) {
                  break L1;
                } else {
                  if (param0 >= ((gk) this).field_e.field_j.length) {
                    break L1;
                  } else {
                    if (((gk) this).field_e.field_j[param0] == 0) {
                      break L1;
                    } else {
                      if (param1 == 42) {
                        stackOut_19_0 = 1;
                        stackIn_20_0 = stackOut_19_0;
                        break L0;
                      } else {
                        stackOut_17_0 = 0;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0 != 0;
                      }
                    }
                  }
                }
              }
              if (ak.field_e) {
                throw new IllegalArgumentException(Integer.toString(param0));
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
          throw pn.a((Throwable) (Object) var3, "gk.I(" + param0 + ',' + param1 + ')');
        }
        return stackIn_20_0 != 0;
    }

    final boolean a(String param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            if (!((gk) this).b((byte) -99)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                param0 = param0.toLowerCase();
                param2 = param2.toLowerCase();
                var4_int = ((gk) this).field_e.field_b.a(false, bg.a((CharSequence) (Object) param0, (byte) 120));
                if (param1 < -76) {
                  break L1;
                } else {
                  int discarded$2 = ((gk) this).b(((int[]) ((gk) this).field_a[0])[0], -77);
                  break L1;
                }
              }
              if (var4_int >= 0) {
                var5 = ((gk) this).field_e.field_r[var4_int].a(false, bg.a((CharSequence) (Object) param2, (byte) 120));
                if (0 > var5) {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  return stackIn_15_0 != 0;
                } else {
                  stackOut_16_0 = 1;
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
                }
              } else {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4;
            stackOut_18_1 = new StringBuilder().append("gk.O(");
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
              break L2;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L2;
            }
          }
          L3: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(',');
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L3;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L3;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
        return stackIn_17_0 != 0;
    }

    private final synchronized boolean b(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_21_0 = 0;
        try {
          L0: {
            if (!((gk) this).b((byte) 108)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (param1 > 73) {
                  break L1;
                } else {
                  ((gk) this).field_h = null;
                  break L1;
                }
              }
              L2: {
                if (param0 < 0) {
                  break L2;
                } else {
                  if (param2 < 0) {
                    break L2;
                  } else {
                    if (~((gk) this).field_e.field_j.length >= ~param0) {
                      break L2;
                    } else {
                      if (~param2 > ~((gk) this).field_e.field_j[param0]) {
                        stackOut_24_0 = 1;
                        stackIn_25_0 = stackOut_24_0;
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              if (ak.field_e) {
                throw new IllegalArgumentException(param0 + " " + param2);
              } else {
                stackOut_21_0 = 0;
                stackIn_22_0 = stackOut_21_0;
                return stackIn_22_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var4, "gk.Q(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_25_0 != 0;
    }

    final synchronized boolean b(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_2_0 = 0;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (((gk) this).b((byte) -71)) {
              var2_int = 1;
              var3 = param0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (((gk) this).field_e.field_o.length <= var3) {
                      break L3;
                    } else {
                      stackOut_6_0 = ((gk) this).field_e.field_o[var3];
                      stackIn_16_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        L4: {
                          var4 = stackIn_7_0;
                          if (null != ((gk) this).field_a[var4]) {
                            break L4;
                          } else {
                            this.a(var4, true);
                            if (((gk) this).field_a[var4] == null) {
                              var2_int = 0;
                              break L4;
                            } else {
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
                  stackOut_15_0 = var2_int;
                  stackIn_16_0 = stackOut_15_0;
                  break L2;
                }
                break L0;
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
          throw pn.a((Throwable) (Object) var2, "gk.J(" + param0 + ')');
        }
        return stackIn_16_0 != 0;
    }

    final int a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
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
            L1: {
              if (param1 == -79) {
                break L1;
              } else {
                gk.c(((byte[]) ((gk) this).field_a[17])[0]);
                break L1;
              }
            }
            if (!((gk) this).b((byte) 102)) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              param0 = param0.toLowerCase();
              var3_int = ((gk) this).field_e.field_b.a(false, bg.a((CharSequence) (Object) param0, (byte) 120));
              stackOut_8_0 = ((gk) this).a(var3_int, 100);
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("gk.L(");
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
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
          throw pn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final synchronized int a(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param1 == 100) {
              if (!this.a(param0, (byte) 42)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (((gk) this).field_a[param0] != null) {
                  stackOut_11_0 = 100;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                } else {
                  stackOut_13_0 = ((gk) this).field_h.b(1, param0);
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                }
              }
            } else {
              stackOut_1_0 = -113;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var3, "gk.T(" + param0 + ',' + param1 + ')');
        }
        return stackIn_14_0;
    }

    final synchronized byte[] a(String param0, byte param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_12_0 = null;
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
        Object stackOut_11_0 = null;
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
            if (!((gk) this).b((byte) -94)) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (byte[]) (Object) stackIn_4_0;
            } else {
              param0 = param0.toLowerCase();
              param2 = param2.toLowerCase();
              var4_int = ((gk) this).field_e.field_b.a(false, bg.a((CharSequence) (Object) param0, (byte) 120));
              if (!this.a(var4_int, (byte) 42)) {
                stackOut_8_0 = null;
                stackIn_9_0 = stackOut_8_0;
                return (byte[]) (Object) stackIn_9_0;
              } else {
                if (param1 == -71) {
                  var5 = ((gk) this).field_e.field_r[var4_int].a(false, bg.a((CharSequence) (Object) param2, (byte) 120));
                  stackOut_13_0 = ((gk) this).a(var4_int, param1 + -10399, var5);
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                } else {
                  stackOut_11_0 = null;
                  stackIn_12_0 = stackOut_11_0;
                  return (byte[]) (Object) stackIn_12_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("gk.S(");
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
              break L1;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L1;
            }
          }
          L2: {
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
              break L2;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
        return stackIn_14_0;
    }

    final int b(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            if (!this.a(param0, (byte) 42)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                if (param1 == 27912) {
                  break L1;
                } else {
                  ((gk) this).field_d = (Object[][]) ((Object[]) ((gk) this).field_a[4])[2];
                  break L1;
                }
              }
              stackOut_8_0 = ((gk) this).field_e.field_j[param0];
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var3, "gk.R(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final int a(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            if (!((gk) this).b((byte) -25)) {
              stackOut_3_0 = -1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                if (param0 >= 56) {
                  break L1;
                } else {
                  int discarded$2 = ((gk) this).a(((byte[]) ((gk) this).field_a[0])[2]);
                  break L1;
                }
              }
              stackOut_8_0 = ((gk) this).field_e.field_j.length;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2, "gk.K(" + param0 + ')');
        }
        return stackIn_9_0;
    }

    public static void c(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_c = null;
              if (param0 == -73) {
                break L1;
              } else {
                field_g = null;
                break L1;
              }
            }
            field_g = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var1, "gk.C(" + param0 + ')');
        }
    }

    private final synchronized byte[] a(int[] param0, int param1, int param2, int param3) {
        Object var5 = null;
        int var6 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_45_0 = null;
        Object stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        Object stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        Object stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_16_0 = null;
        Object stackOut_44_0 = null;
        Object stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        Object stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        Object stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        try {
          L0: {
            if (!this.b(param2, 100, param1)) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (byte[]) (Object) stackIn_4_0;
            } else {
              L1: {
                var5 = null;
                if (param3 <= -44) {
                  break L1;
                } else {
                  int discarded$1 = ((gk) this).b(8, 111);
                  break L1;
                }
              }
              L2: {
                L3: {
                  if (null == ((gk) this).field_d[param2]) {
                    break L3;
                  } else {
                    if (((gk) this).field_d[param2][param1] != null) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var6 = this.a(param1, param0, param2, (byte) 40) ? 1 : 0;
                if (var6 != 0) {
                  break L2;
                } else {
                  this.a(param2, true);
                  var6 = this.a(param1, param0, param2, (byte) 65) ? 1 : 0;
                  if (var6 == 0) {
                    stackOut_16_0 = null;
                    stackIn_17_0 = stackOut_16_0;
                    return (byte[]) (Object) stackIn_17_0;
                  } else {
                    break L2;
                  }
                }
              }
              if (null == ((gk) this).field_d[param2]) {
                throw new RuntimeException("");
              } else {
                L4: {
                  if (null != ((gk) this).field_d[param2][param1]) {
                    var5 = (Object) (Object) rb.a(false, ((gk) this).field_d[param2][param1], -45);
                    if (null == var5) {
                      throw new RuntimeException("");
                    } else {
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (null != var5) {
                    L6: {
                      if (((gk) this).field_b == 1) {
                        break L6;
                      } else {
                        if (((gk) this).field_b != 2) {
                          break L5;
                        } else {
                          ((gk) this).field_d[param2] = null;
                          if (!AceOfSkies.field_G) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    ((gk) this).field_d[param2][param1] = null;
                    if (((gk) this).field_e.field_j[param2] != 1) {
                      break L5;
                    } else {
                      ((gk) this).field_d[param2] = null;
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                stackOut_44_0 = var5;
                stackIn_45_0 = stackOut_44_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_46_0 = var5;
            stackOut_46_1 = new StringBuilder().append("gk.E(");
            stackIn_49_0 = stackOut_46_0;
            stackIn_49_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param0 == null) {
              stackOut_49_0 = stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L7;
            } else {
              stackOut_47_0 = stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "{...}";
              stackIn_50_0 = stackOut_47_0;
              stackIn_50_1 = stackOut_47_1;
              stackIn_50_2 = stackOut_47_2;
              break L7;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_50_0, stackIn_50_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return (byte[]) (Object) stackIn_45_0;
    }

    final synchronized boolean a(int param0, byte param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 > 29) {
                break L1;
              } else {
                byte[] discarded$2 = ((gk) this).d(-108, ((int[]) ((Object[]) ((Object[]) ((gk) this).field_a[22])[3])[0])[3]);
                break L1;
              }
            }
            if (this.b(param2, 113, param0)) {
              L2: {
                if (((gk) this).field_d[param2] == null) {
                  break L2;
                } else {
                  if (((gk) this).field_d[param2][param0] == null) {
                    break L2;
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0 != 0;
                  }
                }
              }
              if (null == ((gk) this).field_a[param2]) {
                this.a(param2, true);
                if (null != ((gk) this).field_a[param2]) {
                  stackOut_18_0 = 1;
                  stackIn_19_0 = stackOut_18_0;
                  return stackIn_19_0 != 0;
                } else {
                  stackOut_20_0 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  break L0;
                }
              } else {
                stackOut_13_0 = 1;
                stackIn_14_0 = stackOut_13_0;
                return stackIn_14_0 != 0;
              }
            } else {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var4, "gk.V(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_21_0 != 0;
    }

    private final synchronized void a(int param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (!((gk) this).field_f) {
                  break L2;
                } else {
                  ((gk) this).field_a[param0] = (Object) (Object) ((gk) this).field_h.a(param0, 2);
                  if (!AceOfSkies.field_G) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((gk) this).field_a[param0] = sf.a(false, -137, ((gk) this).field_h.a(param0, 2));
              break L1;
            }
            L3: {
              if (param1) {
                break L3;
              } else {
                byte[] discarded$2 = this.a((int[]) null, -97, -90, -106);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var3, "gk.G(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized boolean b(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              if (((gk) this).field_e != null) {
                break L1;
              } else {
                ((gk) this).field_e = ((gk) this).field_h.a(true);
                if (null == ((gk) this).field_e) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0 != 0;
                } else {
                  ((gk) this).field_a = new Object[((gk) this).field_e.field_l];
                  ((gk) this).field_d = new Object[((gk) this).field_e.field_l][];
                  break L1;
                }
              }
            }
            var2_int = -122 % ((param0 - 37) / 44);
            stackOut_9_0 = 1;
            stackIn_10_0 = stackOut_9_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2, "gk.W(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final synchronized int a(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        var6 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (!((gk) this).b((byte) -37)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              var2_int = -90 / ((24 - param0) / 63);
              var3 = 0;
              var4 = 0;
              var5 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~var5 <= ~((gk) this).field_a.length) {
                      break L3;
                    } else {
                      stackOut_8_0 = ~((gk) this).field_e.field_k[var5];
                      stackOut_8_1 = -1;
                      stackIn_16_0 = stackOut_8_0;
                      stackIn_16_1 = stackOut_8_1;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      if (var6 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (stackIn_9_0 < stackIn_9_1) {
                            var4 = var4 + ((gk) this).a(var5, 100);
                            var3 += 100;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var5++;
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_15_0 = -1;
                  stackOut_15_1 = ~var3;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  break L2;
                }
                if (stackIn_16_0 != stackIn_16_1) {
                  var5 = var4 * 100 / var3;
                  stackOut_19_0 = var5;
                  stackIn_20_0 = stackOut_19_0;
                  break L0;
                } else {
                  stackOut_17_0 = 100;
                  stackIn_18_0 = stackOut_17_0;
                  return stackIn_18_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2, "gk.D(" + param0 + ')');
        }
        return stackIn_20_0;
    }

    final int b(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (!((gk) this).b((byte) -42)) {
              stackOut_3_0 = -1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              param0 = param0.toLowerCase();
              var3_int = ((gk) this).field_e.field_b.a(false, bg.a((CharSequence) (Object) param0, (byte) 120));
              if (param1 == 0) {
                if (!this.a(var3_int, (byte) 42)) {
                  stackOut_11_0 = -1;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                } else {
                  stackOut_13_0 = var3_int;
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                }
              } else {
                stackOut_6_0 = ((int[]) ((gk) this).field_a[5])[9];
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("gk.AA(");
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
              break L1;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L1;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ')');
        }
        return stackIn_14_0;
    }

    final boolean a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_1_0 = 0;
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
            if (((gk) this).b((byte) -81)) {
              param0 = param0.toLowerCase();
              var3_int = 68 / ((param1 - 64) / 52);
              var4 = ((gk) this).field_e.field_b.a(false, bg.a((CharSequence) (Object) param0, (byte) 120));
              if (var4 < 0) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                break L0;
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
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("gk.B(");
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
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
          throw pn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_9_0 != 0;
    }

    private final synchronized boolean a(int param0, int[] param1, int param2, byte param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        Object[] var9 = null;
        int var9_int = 0;
        byte[] var9_array = null;
        int var10_int = 0;
        rb var10 = null;
        byte[] var10_array = null;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        rb var13 = null;
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
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int[] stackIn_16_0 = null;
        int stackIn_30_0 = 0;
        int[] stackIn_32_0 = null;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        int stackIn_56_2 = 0;
        int stackIn_80_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_122_0 = 0;
        int stackIn_131_0 = 0;
        int stackIn_141_0 = 0;
        int stackIn_150_0 = 0;
        int stackIn_163_0 = 0;
        RuntimeException stackIn_165_0 = null;
        StringBuilder stackIn_165_1 = null;
        RuntimeException stackIn_167_0 = null;
        StringBuilder stackIn_167_1 = null;
        RuntimeException stackIn_168_0 = null;
        StringBuilder stackIn_168_1 = null;
        String stackIn_168_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int[] stackOut_15_0 = null;
        int[] stackOut_31_0 = null;
        int stackOut_29_0 = 0;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        int stackOut_55_2 = 0;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        int stackOut_53_2 = 0;
        int stackOut_79_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_121_0 = 0;
        int stackOut_130_0 = 0;
        int stackOut_140_0 = 0;
        int stackOut_149_0 = 0;
        int stackOut_162_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_164_0 = null;
        StringBuilder stackOut_164_1 = null;
        RuntimeException stackOut_167_0 = null;
        StringBuilder stackOut_167_1 = null;
        String stackOut_167_2 = null;
        RuntimeException stackOut_165_0 = null;
        StringBuilder stackOut_165_1 = null;
        String stackOut_165_2 = null;
        var22 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (this.a(param2, (byte) 42)) {
              if (((gk) this).field_a[param2] == null) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              } else {
                L1: {
                  var5_int = ((gk) this).field_e.field_k[param2];
                  var6 = ((gk) this).field_e.field_q[param2];
                  if (null == ((gk) this).field_d[param2]) {
                    ((gk) this).field_d[param2] = new Object[((gk) this).field_e.field_j[param2]];
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var7 = ((gk) this).field_d[param2];
                var8 = 1;
                var9_int = 0;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (~var5_int >= ~var9_int) {
                        break L4;
                      } else {
                        stackOut_15_0 = (int[]) var6;
                        stackIn_32_0 = stackOut_15_0;
                        stackIn_16_0 = stackOut_15_0;
                        if (var22 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              if (stackIn_16_0 != null) {
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
                            if (null == var7[var10_int]) {
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
                      stackOut_31_0 = (int[]) param1;
                      stackIn_32_0 = stackOut_31_0;
                      break L3;
                    } else {
                      stackOut_29_0 = 1;
                      stackIn_30_0 = stackOut_29_0;
                      return stackIn_30_0 != 0;
                    }
                  }
                  L8: {
                    L9: {
                      if (stackIn_32_0 == null) {
                        break L9;
                      } else {
                        L10: {
                          if (param1[0] != 0) {
                            break L10;
                          } else {
                            if (param1[1] != 0) {
                              break L10;
                            } else {
                              if (0 != param1[2]) {
                                break L10;
                              } else {
                                if (0 != param1[3]) {
                                  break L10;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                        var9_array = rb.a(true, ((gk) this).field_a[param2], -62);
                        var10 = new rb(var9_array);
                        var10.a(5, param1, 1515088773, var10.field_f.length);
                        break L8;
                      }
                    }
                    var9_array = rb.a(false, ((gk) this).field_a[param2], -84);
                    break L8;
                  }
                  if (param3 > 3) {
                    try {
                      L11: {
                        var10_array = pn.a(var9_array, 0);
                        break L11;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L12: {
                        var11_ref_RuntimeException = decompiledCaughtException;
                        stackOut_52_0 = (RuntimeException) var11_ref_RuntimeException;
                        stackOut_52_1 = new StringBuilder();
                        stackIn_55_0 = stackOut_52_0;
                        stackIn_55_1 = stackOut_52_1;
                        stackIn_53_0 = stackOut_52_0;
                        stackIn_53_1 = stackOut_52_1;
                        if (param1 == null) {
                          stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
                          stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
                          stackOut_55_2 = 0;
                          stackIn_56_0 = stackOut_55_0;
                          stackIn_56_1 = stackOut_55_1;
                          stackIn_56_2 = stackOut_55_2;
                          break L12;
                        } else {
                          stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
                          stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
                          stackOut_53_2 = 1;
                          stackIn_56_0 = stackOut_53_0;
                          stackIn_56_1 = stackOut_53_1;
                          stackIn_56_2 = stackOut_53_2;
                          break L12;
                        }
                      }
                      throw pn.a((Throwable) (Object) stackIn_56_0, (stackIn_56_2 != 0) + " " + param2 + " " + var9_array.length + " " + lj.a(-124, var9_array, var9_array.length) + " " + lj.a(-118, var9_array, var9_array.length + -2) + " " + ((gk) this).field_e.field_g[param2] + " " + ((gk) this).field_e.field_t);
                    }
                    L13: {
                      if (((gk) this).field_f) {
                        ((gk) this).field_a[param2] = null;
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
                                if (((gk) this).field_b != 0) {
                                  break L20;
                                } else {
                                  var7[var11] = sf.a(false, -137, var10_array);
                                  if (var22 == 0) {
                                    break L19;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                              var7[var11] = (Object) (Object) var10_array;
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
                          if (((gk) this).field_b != 2) {
                            break L21;
                          } else {
                            var11 = var10_array.length;
                            var11--;
                            var12 = var10_array[var11] & 255;
                            var11 = var11 - var12 * (var5_int * 4);
                            var13 = new rb(var10_array);
                            var14_int = 0;
                            var15_int = 0;
                            var13.field_g = var11;
                            var16 = 0;
                            L22: while (true) {
                              L23: {
                                L24: {
                                  if (var12 <= var16) {
                                    break L24;
                                  } else {
                                    var17 = 0;
                                    stackOut_79_0 = 0;
                                    stackIn_96_0 = stackOut_79_0;
                                    stackIn_80_0 = stackOut_79_0;
                                    if (var22 != 0) {
                                      break L23;
                                    } else {
                                      var18 = stackIn_80_0;
                                      L25: while (true) {
                                        L26: {
                                          L27: {
                                            if (var18 >= var5_int) {
                                              break L27;
                                            } else {
                                              var17 = var17 + var13.a((byte) 115);
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
                                                  if (param0 == var19) {
                                                    var14_int = var14_int + var17;
                                                    var15_int = var19;
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
                                stackOut_95_0 = var14_int;
                                stackIn_96_0 = stackOut_95_0;
                                break L23;
                              }
                              if (stackIn_96_0 == 0) {
                                stackOut_98_0 = 1;
                                stackIn_99_0 = stackOut_98_0;
                                return stackIn_99_0 != 0;
                              } else {
                                var16_ref_byte__ = new byte[var14_int];
                                var13.field_g = var11;
                                var14_int = 0;
                                var17 = 0;
                                var18 = 0;
                                L31: while (true) {
                                  L32: {
                                    if (var18 >= var12) {
                                      break L32;
                                    } else {
                                      var19 = 0;
                                      stackOut_102_0 = 0;
                                      stackIn_163_0 = stackOut_102_0;
                                      stackIn_103_0 = stackOut_102_0;
                                      if (var22 != 0) {
                                        break L14;
                                      } else {
                                        var20 = stackIn_103_0;
                                        L33: while (true) {
                                          L34: {
                                            L35: {
                                              if (~var20 <= ~var5_int) {
                                                break L35;
                                              } else {
                                                var19 = var19 + var13.a((byte) 118);
                                                if (var22 != 0) {
                                                  break L34;
                                                } else {
                                                  L36: {
                                                    L37: {
                                                      if (var6 == null) {
                                                        break L37;
                                                      } else {
                                                        var21 = var6[var20];
                                                        if (var22 == 0) {
                                                          break L36;
                                                        } else {
                                                          break L37;
                                                        }
                                                      }
                                                    }
                                                    var21 = var20;
                                                    break L36;
                                                  }
                                                  L38: {
                                                    if (var21 == param0) {
                                                      au.a(var10_array, var17, var16_ref_byte__, var14_int, var19);
                                                      var14_int = var14_int + var19;
                                                      break L38;
                                                    } else {
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
                              }
                            }
                          }
                        }
                        var11 = var10_array.length;
                        var11--;
                        var12 = var10_array[var11] & 255;
                        var11 = var11 - var5_int * var12 * 4;
                        var13 = new rb(var10_array);
                        var14 = new int[var5_int];
                        var13.field_g = var11;
                        var15_int = 0;
                        L39: while (true) {
                          L40: {
                            L41: {
                              if (var12 <= var15_int) {
                                break L41;
                              } else {
                                var16 = 0;
                                stackOut_121_0 = 0;
                                stackIn_131_0 = stackOut_121_0;
                                stackIn_122_0 = stackOut_121_0;
                                if (var22 != 0) {
                                  break L40;
                                } else {
                                  var17 = stackIn_122_0;
                                  L42: while (true) {
                                    L43: {
                                      L44: {
                                        if (var5_int <= var17) {
                                          break L44;
                                        } else {
                                          var16 = var16 + var13.a((byte) 122);
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
                            stackOut_130_0 = var5_int;
                            stackIn_131_0 = stackOut_130_0;
                            break L40;
                          }
                          var15 = new byte[stackIn_131_0][];
                          var16 = 0;
                          L45: while (true) {
                            L46: {
                              L47: {
                                if (var5_int <= var16) {
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
                              var13.field_g = var11;
                              var16 = 0;
                              break L46;
                            }
                            var17 = 0;
                            L48: while (true) {
                              L49: {
                                L50: {
                                  if (~var12 >= ~var17) {
                                    break L50;
                                  } else {
                                    var18 = 0;
                                    stackOut_140_0 = 0;
                                    stackIn_150_0 = stackOut_140_0;
                                    stackIn_141_0 = stackOut_140_0;
                                    if (var22 != 0) {
                                      break L49;
                                    } else {
                                      var19 = stackIn_141_0;
                                      L51: while (true) {
                                        L52: {
                                          L53: {
                                            if (var19 >= var5_int) {
                                              break L53;
                                            } else {
                                              var18 = var18 + var13.a((byte) 109);
                                              au.a(var10_array, var16, var15[var19], var14[var19], var18);
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
                                stackOut_149_0 = 0;
                                stackIn_150_0 = stackOut_149_0;
                                break L49;
                              }
                              var17 = stackIn_150_0;
                              L54: while (true) {
                                if (~var5_int >= ~var17) {
                                  break L15;
                                } else {
                                  L55: {
                                    L56: {
                                      if (null == var6) {
                                        break L56;
                                      } else {
                                        var18 = var6[var17];
                                        if (var22 == 0) {
                                          break L55;
                                        } else {
                                          break L56;
                                        }
                                      }
                                    }
                                    var18 = var17;
                                    break L55;
                                  }
                                  L57: {
                                    L58: {
                                      if (((gk) this).field_b == 0) {
                                        break L58;
                                      } else {
                                        var7[var18] = (Object) (Object) var15[var17];
                                        if (var22 == 0) {
                                          break L57;
                                        } else {
                                          break L58;
                                        }
                                      }
                                    }
                                    var7[var18] = sf.a(false, -137, var15[var17]);
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
                      stackOut_162_0 = 1;
                      stackIn_163_0 = stackOut_162_0;
                      break L14;
                    }
                    break L0;
                  } else {
                    stackOut_48_0 = 1;
                    stackIn_49_0 = stackOut_48_0;
                    return stackIn_49_0 != 0;
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L59: {
            var5 = decompiledCaughtException;
            stackOut_164_0 = (RuntimeException) var5;
            stackOut_164_1 = new StringBuilder().append("gk.F(").append(param0).append(',');
            stackIn_167_0 = stackOut_164_0;
            stackIn_167_1 = stackOut_164_1;
            stackIn_165_0 = stackOut_164_0;
            stackIn_165_1 = stackOut_164_1;
            if (param1 == null) {
              stackOut_167_0 = (RuntimeException) (Object) stackIn_167_0;
              stackOut_167_1 = (StringBuilder) (Object) stackIn_167_1;
              stackOut_167_2 = "null";
              stackIn_168_0 = stackOut_167_0;
              stackIn_168_1 = stackOut_167_1;
              stackIn_168_2 = stackOut_167_2;
              break L59;
            } else {
              stackOut_165_0 = (RuntimeException) (Object) stackIn_165_0;
              stackOut_165_1 = (StringBuilder) (Object) stackIn_165_1;
              stackOut_165_2 = "{...}";
              stackIn_168_0 = stackOut_165_0;
              stackIn_168_1 = stackOut_165_1;
              stackIn_168_2 = stackOut_165_2;
              break L59;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_168_0, stackIn_168_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_163_0 != 0;
    }

    final synchronized byte[] d(int param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_4_0 = null;
        byte[] stackIn_9_0 = null;
        Object stackIn_12_0 = null;
        byte[] stackIn_17_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        byte[] stackOut_8_0 = null;
        byte[] stackOut_16_0 = null;
        Object stackOut_11_0 = null;
        try {
          if (!((gk) this).b((byte) 100)) {
            stackOut_3_0 = null;
            stackIn_4_0 = stackOut_3_0;
            return (byte[]) (Object) stackIn_4_0;
          } else {
            if (1 == ((gk) this).field_e.field_j.length) {
              stackOut_8_0 = ((gk) this).a(0, -10470, param0);
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0;
            } else {
              if (this.a(param0, (byte) 42)) {
                if (param1 == ~((gk) this).field_e.field_j[param0]) {
                  stackOut_16_0 = ((gk) this).a(param0, param1 ^ 10468, 0);
                  stackIn_17_0 = stackOut_16_0;
                  return stackIn_17_0;
                } else {
                  throw new RuntimeException();
                }
              } else {
                stackOut_11_0 = null;
                stackIn_12_0 = stackOut_11_0;
                return (byte[]) (Object) stackIn_12_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var3, "gk.A(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean a(String param0, boolean param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_7_0 = false;
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
        boolean stackOut_6_0 = false;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
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
            if (((gk) this).b((byte) 114)) {
              param2 = param2.toLowerCase();
              param0 = param0.toLowerCase();
              var4_int = ((gk) this).field_e.field_b.a(false, bg.a((CharSequence) (Object) param2, (byte) 120));
              if (this.a(var4_int, (byte) 42)) {
                var5 = ((gk) this).field_e.field_r[var4_int].a(param1, bg.a((CharSequence) (Object) param0, (byte) 120));
                stackOut_6_0 = ((gk) this).a(var5, (byte) 40, var4_int);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
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
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("gk.U(");
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
          L2: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',');
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
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_7_0;
    }

    final byte[] a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param1 == -10470) {
              stackOut_3_0 = this.a((int[]) null, param2, param0, -53);
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
          throw pn.a((Throwable) (Object) var4, "gk.N(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    final int a(int param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (!this.a(param1, (byte) 42)) {
              stackOut_3_0 = -1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                if (param0 < -26) {
                  break L1;
                } else {
                  ((int[]) ((gk) this).field_a[2])[0] = -26;
                  break L1;
                }
              }
              param2 = param2.toLowerCase();
              var4_int = ((gk) this).field_e.field_r[param1].a(false, bg.a((CharSequence) (Object) param2, (byte) 120));
              if (!this.b(param1, 91, var4_int)) {
                stackOut_11_0 = -1;
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0;
              } else {
                stackOut_13_0 = var4_int;
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
            stackOut_15_1 = new StringBuilder().append("gk.M(").append(param0).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
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
          throw pn.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
        return stackIn_14_0;
    }

    gk(ip param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        ((gk) this).field_e = null;
        try {
          L0: {
            L1: {
              if (0 > param2) {
                break L1;
              } else {
                if (param2 <= 2) {
                  ((gk) this).field_h = param0;
                  ((gk) this).field_f = param1;
                  ((gk) this).field_b = param2;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) runtimeException;
            stackOut_7_1 = new StringBuilder().append("gk.<init>(");
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean c(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        boolean stackOut_8_0 = false;
        int stackOut_6_0 = 0;
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
            if (!((gk) this).b((byte) 106)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              param0 = param0.toLowerCase();
              if (param1 == -14012) {
                var3_int = ((gk) this).field_e.field_b.a(false, bg.a((CharSequence) (Object) param0, (byte) 120));
                stackOut_8_0 = ((gk) this).c(var3_int, 0);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("gk.H(");
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
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
          throw pn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new nf();
        field_c = "Loading sound effects";
    }
}
