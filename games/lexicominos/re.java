/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class re extends ql {
    private w field_W;
    private int field_Y;
    private int field_bb;
    static java.math.BigInteger field_T;
    private int field_S;
    private ia field_U;
    private rb field_R;
    static String field_cb;
    private int field_V;
    private int field_ab;
    static ge field_X;
    static int field_Z;

    boolean f(byte param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_27_0 = 0;
        boolean stackIn_29_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_28_0 = false;
        int stackOut_26_0 = 0;
        var3 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((re) this).field_R == null) {
                break L1;
              } else {
                L2: {
                  if (((re) this).field_R == ok.field_k) {
                    break L2;
                  } else {
                    if (((re) this).field_R != rl.field_H) {
                      break L1;
                    } else {
                      L3: {
                        int fieldTemp$2 = ((re) this).field_V + 1;
                        ((re) this).field_V = ((re) this).field_V + 1;
                        if (~fieldTemp$2 == ~((re) this).field_bb) {
                          break L3;
                        } else {
                          ((re) this).field_U.field_E = (((re) this).field_V << 303147688) / ((re) this).field_bb;
                          if (var3 == 0) {
                            break L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                      ((re) this).field_U.field_E = 256;
                      ((re) this).field_R = null;
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                L4: {
                  int fieldTemp$3 = ((re) this).field_V + 1;
                  ((re) this).field_V = ((re) this).field_V + 1;
                  if (~fieldTemp$3 != ~((re) this).field_S) {
                    break L4;
                  } else {
                    ((re) this).field_R = fb.field_f;
                    ((re) this).a(12 + ((re) this).field_W.field_j, (byte) -91, ((re) this).field_Y, ((re) this).field_ab + 12 + ((re) this).field_W.field_v);
                    ((re) this).field_U.field_E = 0;
                    ((re) this).field_V = 0;
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                }
                ((re) this).field_U.field_E = -((((re) this).field_V << -265658136) / ((re) this).field_S) + 256;
                break L1;
              }
            }
            if (param0 < -21) {
              stackOut_28_0 = super.f((byte) -102);
              stackIn_29_0 = stackOut_28_0;
              break L0;
            } else {
              stackOut_26_0 = 0;
              stackIn_27_0 = stackOut_26_0;
              return stackIn_27_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var2, "re.G(" + param0 + ')');
        }
        return stackIn_29_0;
    }

    public static void i(byte param0) {
        try {
            field_X = null;
            field_T = null;
            field_cb = null;
            if (param0 != -27) {
                field_cb = null;
            }
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "re.EA(" + param0 + ')');
        }
    }

    re(eg param0, w param1, int param2, int param3, int param4) {
        super(param0, param1.field_j + 12, param1.field_v + (param2 + 12));
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
            ((re) this).field_ab = param2;
            ((re) this).field_bb = param3;
            ((re) this).field_S = param3;
            ((re) this).field_Y = param4;
            this.a(param1, (byte) 125);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("re.<init>(");
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
          throw ld.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    boolean a(char param0, int param1, w param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, (byte) 99)) {
              L1: {
                if (null != ((re) this).field_U) {
                  L2: {
                    if (param1 != 98) {
                      break L2;
                    } else {
                      boolean discarded$2 = ((re) this).field_U.a((byte) 44, param2);
                      break L2;
                    }
                  }
                  if (param1 != 99) {
                    break L1;
                  } else {
                    boolean discarded$3 = ((re) this).field_U.a((byte) 44, param2);
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              var5_int = -75 / ((-13 - param3) / 55);
              stackOut_12_0 = 0;
              stackIn_13_0 = stackOut_12_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("re.P(").append(param0).append(',').append(param1).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L3;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param3 + ')');
        }
        return stackIn_13_0 != 0;
    }

    private final void a(w param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (param1 == 125) {
                break L1;
              } else {
                this.a((w) null, (byte) -90);
                break L1;
              }
            }
            L2: {
              if (null != ((re) this).field_U) {
                ((re) this).field_U.b((byte) -118);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                if (null != param0) {
                  break L4;
                } else {
                  ((re) this).field_U = new ia();
                  if (!Lexicominos.field_L) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              param0.a(param0.field_v, param0.field_j, true, ((re) this).field_ab + 6, 6);
              ((re) this).field_U = new ia(param0);
              break L3;
            }
            ((re) this).b((byte) 57, (w) (Object) ((re) this).field_U);
            ((re) this).field_W = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("re.DA(");
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
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L5;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ')');
        }
    }

    final void h(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (ok.field_k == ((re) this).field_R) {
              return;
            } else {
              L1: {
                if (param0 == 38) {
                  break L1;
                } else {
                  ((re) this).field_Y = 51;
                  break L1;
                }
              }
              ((re) this).field_R = rl.field_H;
              ((re) this).field_V = 0;
              this.a(((re) this).field_W, (byte) 125);
              ((re) this).field_U.field_E = 0;
              ((re) this).field_W = null;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var2, "re.I(" + param0 + ')');
        }
    }

    final boolean a(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == 26) {
              ((re) this).f(true);
              stackOut_3_0 = super.a((byte) 26);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var2, "re.F(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void f(boolean param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                ((re) this).field_R = null;
                break L1;
              }
            }
            L2: {
              if (((re) this).field_R == null) {
                break L2;
              } else {
                L3: {
                  if (rl.field_H != ((re) this).field_R) {
                    ((re) this).b(((re) this).field_W.field_j + 12, -119, ((re) this).field_W.field_v + (12 + ((re) this).field_ab));
                    this.a(((re) this).field_W, (byte) 125);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                ((re) this).field_U.field_E = 256;
                ((re) this).field_R = null;
                break L2;
              }
            }
            super.f(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var2, "re.H(" + param0 + ')');
        }
    }

    void b(int param0, w param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            if (param0 >= 115) {
              L1: {
                L2: {
                  ((re) this).field_W = param1;
                  if (fb.field_f != ((re) this).field_R) {
                    break L2;
                  } else {
                    ((re) this).a(((re) this).field_W.field_j + 12, (byte) -125, ((re) this).field_Y, ((re) this).field_W.field_v + (12 - -((re) this).field_ab));
                    ((re) this).field_V = 0;
                    if (!Lexicominos.field_L) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (((re) this).field_R != ok.field_k) {
                  ((re) this).field_R = ok.field_k;
                  ((re) this).field_V = 0;
                  break L1;
                } else {
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
          L3: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("re.AA(").append(param0).append(',');
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
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L3;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_T = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_cb = "This entry doesn't match";
        field_Z = 0;
    }
}
