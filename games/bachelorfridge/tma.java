/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tma extends ana {
    private l field_y;
    static lo field_x;
    static ws field_w;
    static int field_v;

    private final void b(boolean param0) {
        try {
            if (param0) {
                boolean discarded$0 = ((tma) this).c((byte) 26);
            }
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "tma.B(" + param0 + ')');
        }
    }

    tma(gj param0, l param1) {
        super(param0, (bca) (Object) param1);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
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
            ((tma) this).field_y = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("tma.<init>(");
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
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
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
          throw pe.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    private final void d(int param0) {
        RuntimeException runtimeException = null;
        aga var2 = null;
        pp var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            var2 = ((tma) this).field_y.field_l.a(116, ((tma) this).field_q.field_h);
            if (var2.i(105)) {
              return;
            } else {
              ad discarded$4 = ((tma) this).field_q.a(21915, ((tma) this).field_q.b(var2, -23990));
              var3 = (pp) (Object) ((tma) this).field_y.field_o.b((byte) 90);
              oha discarded$5 = al.a(88, ((tma) this).field_y.field_k);
              var4 = 96 / ((param0 - -68) / 50);
              L1: while (true) {
                L2: {
                  L3: {
                    if (var3 == null) {
                      break L3;
                    } else {
                      var3.a(var2, ((tma) this).field_q.field_h, 12);
                      var3 = (pp) (Object) ((tma) this).field_y.field_o.c(0);
                      if (var5 != 0) {
                        break L2;
                      } else {
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  break L2;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pe.a((Throwable) (Object) runtimeException, "tma.D(" + param0 + ')');
        }
    }

    public static void c(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_w = null;
              if (!param0) {
                break L1;
              } else {
                field_v = -47;
                break L1;
              }
            }
            field_x = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "tma.C(" + param0 + ')');
        }
    }

    final boolean c(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (!((tma) this).field_y.field_p) {
              int fieldTemp$2 = ((tma) this).field_l - 1;
              ((tma) this).field_l = ((tma) this).field_l - 1;
              if (0 > fieldTemp$2) {
                var2_int = 97 / ((param0 - 71) / 47);
                this.b(false);
                stackOut_12_0 = 1;
                stackIn_13_0 = stackOut_12_0;
                break L0;
              } else {
                L1: {
                  if (((tma) this).field_l == 25) {
                    jja.a(256, -1, 70);
                    this.d(-18);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                return stackIn_11_0 != 0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "tma.A(" + param0 + ')');
        }
        return stackIn_13_0 != 0;
    }

    final static void a(int[][] param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (param1 == -5) {
                break L1;
              } else {
                field_x = null;
                break L1;
              }
            }
            tj.field_b = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("tma.E(");
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
          throw pe.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final static cj a(lu param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        cj stackIn_9_0 = null;
        cj stackIn_14_0 = null;
        cj stackIn_19_0 = null;
        Object stackIn_22_0 = null;
        cj stackIn_25_0 = null;
        cj stackIn_28_0 = null;
        cj stackIn_31_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        cj stackOut_8_0 = null;
        cj stackOut_13_0 = null;
        cj stackOut_18_0 = null;
        cj stackOut_30_0 = null;
        cj stackOut_27_0 = null;
        cj stackOut_24_0 = null;
        Object stackOut_21_0 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        try {
          var2_int = param0.b(16711935);
          if (255 == var2_int) {
            stackOut_3_0 = null;
            stackIn_4_0 = stackOut_3_0;
            return (cj) (Object) stackIn_4_0;
          } else {
            if (var2_int == 2) {
              stackOut_8_0 = ih.a(param0, param1 ^ -276);
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0;
            } else {
              if (var2_int == 1) {
                stackOut_13_0 = ig.a(param0, 104);
                stackIn_14_0 = stackOut_13_0;
                return stackIn_14_0;
              } else {
                if (var2_int == 4) {
                  stackOut_18_0 = ba.a(param0, (byte) 119);
                  stackIn_19_0 = stackOut_18_0;
                  return stackIn_19_0;
                } else {
                  if (param1 == -50) {
                    if (var2_int != 5) {
                      if (var2_int != 6) {
                        if (var2_int != 7) {
                          throw new IllegalStateException("Invalid move category");
                        } else {
                          stackOut_30_0 = gla.a(param0, (byte) -19);
                          stackIn_31_0 = stackOut_30_0;
                          return stackIn_31_0;
                        }
                      } else {
                        stackOut_27_0 = hj.a((byte) -121, param0);
                        stackIn_28_0 = stackOut_27_0;
                        return stackIn_28_0;
                      }
                    } else {
                      stackOut_24_0 = rfa.a(29428, param0);
                      stackIn_25_0 = stackOut_24_0;
                      return stackIn_25_0;
                    }
                  } else {
                    stackOut_21_0 = null;
                    stackIn_22_0 = stackOut_21_0;
                    return (cj) (Object) stackIn_22_0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var2 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var2;
            stackOut_33_1 = new StringBuilder().append("tma.F(");
            stackIn_36_0 = stackOut_33_0;
            stackIn_36_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L0;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_37_0 = stackOut_34_0;
              stackIn_37_1 = stackOut_34_1;
              stackIn_37_2 = stackOut_34_2;
              break L0;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = new lo();
        field_w = new ws();
    }
}
