/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class n extends v {
    static int[][][] field_db;
    private int field_hb;
    private int field_nb;
    private int field_gb;
    static String field_fb;
    private int field_bb;
    private hi field_eb;
    static int[][][] field_kb;
    private p field_mb;
    private ee field_ib;
    static mi field_cb;
    static int field_jb;
    private int field_lb;

    final static void g(byte param0) {
        String var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (eb.field_m) {
              L1: {
                if (da.field_c == null) {
                  break L1;
                } else {
                  da.field_c.o(77);
                  break L1;
                }
              }
              var1 = pd.f((byte) 48);
              kb.field_O = new fg(var1, (String) null, true, false, false);
              t.field_b.a((byte) 69, (ee) (Object) bg.field_K);
              bg.field_K.c(0, (ee) (Object) kb.field_O);
              bg.field_K.d(true);
              var2 = 9 / ((param0 - -2) / 62);
              break L0;
            } else {
              throw new IllegalStateException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var1_ref, "n.T(" + param0 + ')');
        }
    }

    public static void l(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_cb = null;
              if (param0 == 5) {
                break L1;
              } else {
                n.l(-121);
                break L1;
              }
            }
            field_db = null;
            field_fb = null;
            field_kb = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var1, "n.V(" + param0 + ')');
        }
    }

    n(si param0, ee param1, int param2, int param3, int param4) {
        super(param0, 12 - -param1.field_p, 12 + param2 + param1.field_l);
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
            ((n) this).field_bb = param3;
            ((n) this).field_nb = param3;
            ((n) this).field_hb = param4;
            ((n) this).field_gb = param2;
            this.b(param1, 18744);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("n.<init>(");
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
          throw oj.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    boolean j(int param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_27_0 = 0;
        boolean stackIn_29_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_28_0 = false;
        int stackOut_26_0 = 0;
        var3 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null != ((n) this).field_mb) {
                L2: {
                  if (v.field_Y == ((n) this).field_mb) {
                    break L2;
                  } else {
                    if (((n) this).field_mb != ac.field_c) {
                      break L1;
                    } else {
                      L3: {
                        int fieldTemp$2 = ((n) this).field_lb + 1;
                        ((n) this).field_lb = ((n) this).field_lb + 1;
                        if (~fieldTemp$2 == ~((n) this).field_bb) {
                          break L3;
                        } else {
                          ((n) this).field_eb.field_H = (((n) this).field_lb << 851528232) / ((n) this).field_bb;
                          if (var3 == 0) {
                            break L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                      ((n) this).field_mb = null;
                      ((n) this).field_eb.field_H = 256;
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                L4: {
                  int fieldTemp$3 = ((n) this).field_lb + 1;
                  ((n) this).field_lb = ((n) this).field_lb + 1;
                  if (~fieldTemp$3 == ~((n) this).field_nb) {
                    break L4;
                  } else {
                    ((n) this).field_eb.field_H = -((((n) this).field_lb << 1716485288) / ((n) this).field_nb) + 256;
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                }
                ((n) this).field_mb = ng.field_C;
                ((n) this).a(((n) this).field_gb + (12 - -((n) this).field_ib.field_l), ((n) this).field_hb, ((n) this).field_ib.field_p + 12, false);
                ((n) this).field_eb.field_H = 0;
                ((n) this).field_lb = 0;
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 == 1) {
              stackOut_28_0 = super.j(1);
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
          throw oj.a((Throwable) (Object) var2, "n.M(" + param0 + ')');
        }
        return stackIn_29_0;
    }

    boolean a(int param0, char param1, byte param2, ee param3) {
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_4_0 = 0;
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
            L1: {
              if (param2 > 9) {
                break L1;
              } else {
                ((n) this).k(41);
                break L1;
              }
            }
            if (!super.a(param0, param1, (byte) 33, param3)) {
              L2: {
                if (((n) this).field_eb == null) {
                  break L2;
                } else {
                  L3: {
                    if (98 == param0) {
                      boolean discarded$3 = ((n) this).field_eb.a(param3, 0);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  if (99 != param0) {
                    break L2;
                  } else {
                    boolean discarded$4 = ((n) this).field_eb.a(param3, 0);
                    break L2;
                  }
                }
              }
              stackOut_16_0 = 0;
              stackIn_17_0 = stackOut_16_0;
              break L0;
            } else {
              stackOut_4_0 = 1;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var5;
            stackOut_18_1 = new StringBuilder().append("n.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L4;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
        return stackIn_17_0 != 0;
    }

    final void k(int param0) {
        if (!(v.field_Y != ((n) this).field_mb)) {
            return;
        }
        try {
            ((n) this).field_lb = 0;
            ((n) this).field_mb = ac.field_c;
            this.b(((n) this).field_ib, param0 ^ 18744);
            ((n) this).field_ib = null;
            ((n) this).field_eb.field_H = param0;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "n.DA(" + param0 + ')');
        }
    }

    final void d(boolean param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != ((n) this).field_mb) {
                L2: {
                  if (((n) this).field_mb == ac.field_c) {
                    break L2;
                  } else {
                    ((n) this).b(0, ((n) this).field_ib.field_l + 12 + ((n) this).field_gb, 12 + ((n) this).field_ib.field_p);
                    this.b(((n) this).field_ib, 18744);
                    break L2;
                  }
                }
                ((n) this).field_eb.field_H = 256;
                ((n) this).field_mb = null;
                break L1;
              } else {
                break L1;
              }
            }
            super.d(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var2, "n.BA(" + param0 + ')');
        }
    }

    private final void b(ee param0, int param1) {
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
            L1: {
              if (null == ((n) this).field_eb) {
                break L1;
              } else {
                ((n) this).field_eb.a(true);
                break L1;
              }
            }
            L2: {
              L3: {
                if (param0 == null) {
                  break L3;
                } else {
                  param0.a((byte) 105, 6, param0.field_l, param0.field_p, 6 - -((n) this).field_gb);
                  ((n) this).field_eb = new hi(param0);
                  if (!TorChallenge.field_F) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              ((n) this).field_eb = new hi();
              break L2;
            }
            L4: {
              ((n) this).a(param1 + -18744, (ee) (Object) ((n) this).field_eb);
              ((n) this).field_ib = null;
              if (param1 == 18744) {
                break L4;
              } else {
                field_cb = null;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("n.AA(");
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
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L5;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ')');
        }
    }

    void c(int param0, ee param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              L2: {
                ((n) this).field_ib = param1;
                if (ng.field_C != ((n) this).field_mb) {
                  break L2;
                } else {
                  ((n) this).a(12 - (-((n) this).field_gb - ((n) this).field_ib.field_l), ((n) this).field_hb, 12 - -((n) this).field_ib.field_p, false);
                  ((n) this).field_lb = 0;
                  if (!TorChallenge.field_F) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (v.field_Y != ((n) this).field_mb) {
                ((n) this).field_lb = 0;
                ((n) this).field_mb = v.field_Y;
                break L1;
              } else {
                break L1;
              }
            }
            L3: {
              if (param0 == 0) {
                break L3;
              } else {
                ((n) this).c(-2, (ee) null);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("n.P(").append(param0).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L4;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
    }

    final boolean h(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        try {
          L0: {
            ((n) this).d(true);
            if (param0 >= 83) {
              stackOut_3_0 = super.h(113);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var2, "n.O(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_fb = "Invalid password.";
        field_db = new int[][][]{new int[7][], new int[7][], new int[7][]};
    }
}
