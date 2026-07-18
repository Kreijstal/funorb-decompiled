/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi extends vg {
    private int field_h;
    private int field_k;
    private int field_l;
    private int field_f;
    private bs field_g;
    private int field_j;
    private int field_i;

    final boolean a(int param0, int param1) {
        if (!this.b(120)) {
          if (param1 != 3) {
            int discarded$4 = ((pi) this).b(-6, -25);
            return false;
          } else {
            return false;
          }
        } else {
          if (param0 <= ((pi) this).field_h) {
            if (param1 == 3) {
              return false;
            } else {
              int discarded$5 = ((pi) this).b(-6, -25);
              return false;
            }
          } else {
            return true;
          }
        }
    }

    final boolean a(int param0, int param1, int param2) {
        if (((pi) this).a(param2, 3)) {
          return true;
        } else {
          if (param1 == -1) {
            if (((pi) this).field_k > 0) {
              if (param0 < ((pi) this).field_l) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            boolean discarded$8 = ((pi) this).a(-125, -75, 17);
            if (((pi) this).field_k > 0) {
              if (param0 < ((pi) this).field_l) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    private final int a(boolean param0) {
        return ((pi) this).field_j;
    }

    pi(bs param0, int param1, int param2, int param3, int param4, int param5) {
        this(param0, param1, param2, param3, param4);
        try {
            ((pi) this).field_h = param5;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "pi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean a(pi param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_27_0 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            if (!((pi) this).field_g.a(false, param0.field_g)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (((pi) this).field_i != param0.field_i) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                L1: {
                  if (!this.b(120)) {
                    break L1;
                  } else {
                    if (param0.field_h == ((pi) this).field_h) {
                      break L1;
                    } else {
                      stackOut_10_0 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      return stackIn_11_0 != 0;
                    }
                  }
                }
                L2: {
                  L3: {
                    if (((pi) this).field_k == param1) {
                      break L3;
                    } else {
                      if (param0.field_k != 0) {
                        L4: {
                          var3_int = this.a(false);
                          var4 = param0.a(false);
                          var5 = this.c(-30481);
                          var6 = param0.c(param1 ^ -30481);
                          if (var4 > var5) {
                            break L4;
                          } else {
                            if (var6 < var3_int) {
                              break L4;
                            } else {
                              L5: {
                                var7 = iia.d(var5, var6, 2);
                                var8 = et.b(var4, var3_int, param1 ^ -120);
                                if (((pi) this).field_k >= param0.field_k) {
                                  break L5;
                                } else {
                                  ((pi) this).field_f = param0.field_f;
                                  break L5;
                                }
                              }
                              ((pi) this).field_j = var8;
                              ((pi) this).field_k = var7 + -var8;
                              break L2;
                            }
                          }
                        }
                        stackOut_22_0 = 0;
                        stackIn_23_0 = stackOut_22_0;
                        return stackIn_23_0 != 0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (((pi) this).field_k == 0) {
                    ((pi) this).field_k = 0;
                    return true;
                  } else {
                    ((pi) this).field_f = param0.field_f;
                    ((pi) this).field_k = 0;
                    break L2;
                  }
                }
                stackOut_27_0 = 1;
                stackIn_28_0 = stackOut_27_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var3;
            stackOut_29_1 = new StringBuilder().append("pi.J(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L6;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L6;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ',' + param1 + ')');
        }
        return stackIn_28_0 != 0;
    }

    final boolean c(int param0, int param1) {
        if (param1 >= 95) {
          if (((pi) this).field_j <= param0) {
            if (0 != ((pi) this).field_k) {
              if (param0 < ((pi) this).field_l) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final void a(dt param0, int param1) {
        try {
            if (param1 > -52) {
                int discarded$0 = this.c(22);
            }
            ((pi) this).field_g.a(((pi) this).field_h, (byte) 102, param0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "pi.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(dt param0, int param1, int param2) {
        try {
            if (param2 != 0) {
                String discarded$0 = ((pi) this).toString();
            }
            ((pi) this).field_g.a(param0, 113, ((pi) this).field_h, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "pi.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int a(int param0) {
        if (param0 != 3) {
            return -84;
        }
        return ((pi) this).field_i;
    }

    private final void a(kh param0, int param1) {
        try {
            param0.h((byte) 112);
            ((pi) this).field_g = lka.a(-90, param0, 26);
            ((pi) this).field_f = param0.b((byte) 44, 3);
            ((pi) this).field_i = param0.b((byte) 44, 3);
            ((pi) this).field_j = param0.b((byte) 44, 32);
            ((pi) this).field_k = param0.b((byte) 44, 8);
            ((pi) this).field_l = ((pi) this).field_j + 50 * ((pi) this).field_k;
            if (!(!this.b(122))) {
                ((pi) this).field_h = param0.b((byte) 44, 5);
            }
            param0.i((byte) 98);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "pi.E(" + (param0 != null ? "{...}" : "null") + ',' + -124 + ')');
        }
    }

    private final boolean b(int param0) {
        if (param0 <= 118) {
            return true;
        }
        return ((pi) this).field_g.a(false);
    }

    final int b(int param0, int param1) {
        Object var4 = null;
        if (param1 > -15) {
          var4 = null;
          ((pi) this).a((dt) null, -69);
          return param0 + -((pi) this).field_j;
        } else {
          return param0 + -((pi) this).field_j;
        }
    }

    private final int c(int param0) {
        if (param0 != -30481) {
            return -32;
        }
        return ((pi) this).field_l;
    }

    public final String toString() {
        String var1 = "PendingEvent";
        var1 = var1 + "(instigator: " + ((pi) this).field_f + ", course:" + ((pi) this).field_i;
        if (!(!this.b(121))) {
            var1 = var1 + ", room:" + ((pi) this).field_h;
        }
        var1 = var1 + ", start:" + ((pi) this).field_j + ", duration:" + ((pi) this).field_k + ")";
        return var1;
    }

    private pi(bs param0, int param1, int param2, int param3, int param4) {
        try {
            ((pi) this).field_l = param4 * 50 + param3;
            ((pi) this).field_g = param0;
            ((pi) this).field_j = param3;
            ((pi) this).field_k = param4;
            ((pi) this).field_i = param2;
            ((pi) this).field_f = param1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "pi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    pi(kh param0) {
        try {
            this.a(param0, -124);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "pi.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(kh param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              param0.i(8);
              if (param1 == -19733) {
                break L1;
              } else {
                boolean discarded$3 = ((pi) this).c(123, -124);
                break L1;
              }
            }
            L2: {
              ((pi) this).field_g.a(param0, -5);
              param0.a((byte) -32, ((pi) this).field_f, 3);
              param0.a((byte) -2, ((pi) this).field_i, 3);
              param0.a((byte) -128, ((pi) this).field_j, 32);
              param0.a((byte) 95, ((pi) this).field_k, 8);
              if (this.b(122)) {
                param0.a((byte) -125, ((pi) this).field_h, 5);
                param0.k(-1826190686);
                break L2;
              } else {
                param0.k(-1826190686);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("pi.F(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ')');
        }
    }

    static {
    }
}
