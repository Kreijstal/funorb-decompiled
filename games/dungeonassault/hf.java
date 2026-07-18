/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hf extends sj {
    static nh field_pb;
    private int field_jb;
    private lm field_xb;
    private int field_lb;
    static String field_ub;
    static md field_ob;
    static int field_sb;
    private int field_qb;
    private int field_tb;
    private sd field_rb;
    private fb field_kb;
    static ad field_wb;
    static ed field_nb;
    static eh field_ib;
    static cn field_Ab;
    private int field_vb;
    static int[] field_yb;
    static String field_zb;
    static pp field_mb;

    private final void b(lm param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (((hf) this).field_rb == null) {
                break L1;
              } else {
                ((hf) this).field_rb.a(false);
                break L1;
              }
            }
            L2: {
              L3: {
                var3_int = -47 / ((param1 - 32) / 42);
                if (param0 == null) {
                  break L3;
                } else {
                  param0.b(0, param0.field_x, ((hf) this).field_tb + 6, 6, param0.field_s);
                  ((hf) this).field_rb = new sd(param0);
                  if (DungeonAssault.field_K == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              ((hf) this).field_rb = new sd();
              break L2;
            }
            ((hf) this).b((byte) -57, (lm) (Object) ((hf) this).field_rb);
            ((hf) this).field_xb = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("hf.C(");
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L4;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ')');
        }
    }

    hf(ji param0, lm param1, int param2, int param3, int param4) {
        super(param0, 12 - -param1.field_x, param1.field_s + (param2 + 12));
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
            ((hf) this).field_qb = param3;
            ((hf) this).field_jb = param3;
            ((hf) this).field_tb = param2;
            ((hf) this).field_vb = param4;
            this.b(param1, (byte) 98);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("hf.<init>(");
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
          throw vk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void i(byte param0) {
        RuntimeException var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != in.field_C) {
                var1_ref = (Object) (Object) in.field_C;
                synchronized (var1_ref) {
                  L2: {
                    in.field_C = null;
                    break L2;
                  }
                }
                break L1;
              } else {
                break L1;
              }
            }
            L3: {
              if (param0 <= -5) {
                break L3;
              } else {
                field_ib = null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (RuntimeException) (Object) decompiledCaughtException;
          throw vk.a((Throwable) (Object) var1, "hf.G(" + param0 + ')');
        }
    }

    final boolean i(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        try {
          L0: {
            ((hf) this).h((byte) 99);
            if (param0 == 462) {
              stackOut_3_0 = super.i(param0);
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
          throw vk.a((Throwable) (Object) var2, "hf.E(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    boolean a(lm param0, char param1, int param2, byte param3) {
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
              if (param3 >= 55) {
                break L1;
              } else {
                ((hf) this).field_rb = null;
                break L1;
              }
            }
            if (!super.a(param0, param1, param2, (byte) 124)) {
              L2: {
                if (((hf) this).field_rb == null) {
                  break L2;
                } else {
                  L3: {
                    if (98 != param2) {
                      break L3;
                    } else {
                      boolean discarded$3 = ((hf) this).field_rb.a(34, param0);
                      break L3;
                    }
                  }
                  if (param2 == 99) {
                    boolean discarded$4 = ((hf) this).field_rb.a(34, param0);
                    break L2;
                  } else {
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
            stackOut_18_1 = new StringBuilder().append("hf.W(");
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
          throw vk.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_17_0 != 0;
    }

    final void h(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = -105 % ((22 - param0) / 35);
              if (((hf) this).field_kb != null) {
                L2: {
                  if (((hf) this).field_kb != lp.field_o) {
                    ((hf) this).b(-30, ((hf) this).field_xb.field_s + (12 - -((hf) this).field_tb), ((hf) this).field_xb.field_x + 12);
                    this.b(((hf) this).field_xb, (byte) -74);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                ((hf) this).field_rb.field_H = 256;
                ((hf) this).field_kb = null;
                break L1;
              } else {
                break L1;
              }
            }
            super.h((byte) -89);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw vk.a((Throwable) (Object) runtimeException, "hf.K(" + param0 + ')');
        }
    }

    final void k(int param0) {
        if (!(hi.field_b != ((hf) this).field_kb)) {
            return;
        }
        try {
            ((hf) this).field_lb = 0;
            ((hf) this).field_kb = lp.field_o;
            this.b(((hf) this).field_xb, (byte) 100);
            ((hf) this).field_rb.field_H = param0;
            ((hf) this).field_xb = null;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "hf.J(" + param0 + ')');
        }
    }

    void b(int param0, lm param1) {
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
              L2: {
                ((hf) this).field_xb = param1;
                if (ec.field_i == ((hf) this).field_kb) {
                  break L2;
                } else {
                  if (hi.field_b != ((hf) this).field_kb) {
                    ((hf) this).field_kb = hi.field_b;
                    ((hf) this).field_lb = 0;
                    if (DungeonAssault.field_K == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              ((hf) this).b(12 - -((hf) this).field_xb.field_x, ((hf) this).field_vb, ((hf) this).field_xb.field_s + ((hf) this).field_tb + 12, 22284);
              ((hf) this).field_lb = 0;
              break L1;
            }
            L3: {
              if (param0 == 1) {
                break L3;
              } else {
                ((hf) this).field_xb = null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("hf.L(").append(param0).append(',');
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
          throw vk.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
    }

    public static void m(int param0) {
        try {
            field_pb = null;
            field_Ab = null;
            field_zb = null;
            field_wb = null;
            field_mb = null;
            field_yb = null;
            field_nb = null;
            field_ub = null;
            field_ob = null;
            field_ib = null;
            if (param0 != 0) {
                field_Ab = null;
            }
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "hf.A(" + param0 + ')');
        }
    }

    boolean f(byte param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_27_0 = 0;
        boolean stackIn_29_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_28_0 = false;
        int stackOut_26_0 = 0;
        var3 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (((hf) this).field_kb != null) {
                L2: {
                  if (((hf) this).field_kb == hi.field_b) {
                    break L2;
                  } else {
                    if (lp.field_o == ((hf) this).field_kb) {
                      L3: {
                        int fieldTemp$2 = ((hf) this).field_lb + 1;
                        ((hf) this).field_lb = ((hf) this).field_lb + 1;
                        if (fieldTemp$2 == ((hf) this).field_qb) {
                          break L3;
                        } else {
                          ((hf) this).field_rb.field_H = (((hf) this).field_lb << 203271624) / ((hf) this).field_qb;
                          if (var3 == 0) {
                            break L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                      ((hf) this).field_kb = null;
                      ((hf) this).field_rb.field_H = 256;
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                L4: {
                  int fieldTemp$3 = ((hf) this).field_lb + 1;
                  ((hf) this).field_lb = ((hf) this).field_lb + 1;
                  if (fieldTemp$3 != ((hf) this).field_jb) {
                    break L4;
                  } else {
                    ((hf) this).field_kb = ec.field_i;
                    ((hf) this).b(12 - -((hf) this).field_xb.field_x, ((hf) this).field_vb, ((hf) this).field_tb + 12 - -((hf) this).field_xb.field_s, param0 ^ -22358);
                    ((hf) this).field_lb = 0;
                    ((hf) this).field_rb.field_H = 0;
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                }
                ((hf) this).field_rb.field_H = 256 + -((((hf) this).field_lb << 1377236968) / ((hf) this).field_jb);
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 == -90) {
              stackOut_28_0 = super.f((byte) -90);
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
          throw vk.a((Throwable) (Object) var2, "hf.F(" + param0 + ')');
        }
        return stackIn_29_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ub = "Username: ";
        field_ob = new md();
        field_zb = "Names should contain a maximum of 12 characters";
        field_yb = new int[16384];
        field_wb = new ad(13, 0, 1, 0);
    }
}
