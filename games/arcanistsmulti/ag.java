/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ag extends qm {
    private boolean field_y;
    static Random field_D;
    int field_F;
    static boolean field_E;
    boolean field_z;
    boolean field_B;
    static ij field_C;
    static String field_A;
    private boolean field_G;
    static String field_x;

    ag(String param0, pf param1, wc param2) {
        super(param0, param1, param2);
        ((ag) this).field_F = 0;
        ((ag) this).field_B = true;
        ((ag) this).field_G = true;
        ((ag) this).field_y = false;
    }

    boolean a(qm param0, byte param1, char param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (param1 < -120) {
              L1: {
                if (!((ag) this).d(-2116)) {
                  break L1;
                } else {
                  L2: {
                    if (param3 == 84) {
                      break L2;
                    } else {
                      if (param3 != 83) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  ((ag) this).a(-122, -1, 1, -1);
                  stackOut_7_0 = 1;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("ag.N(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_10_0 != 0;
    }

    void a(int param0, int param1, int param2, int param3) {
        ((ag) this).field_F = param2;
        if (param0 < -99) {
          if (null != ((ag) this).field_o) {
            if (!(((ag) this).field_o instanceof vb)) {
              return;
            } else {
              ((vb) (Object) ((ag) this).field_o).a(true, param3, param1, param2, (ag) this);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    boolean a(int param0, int param1, qm param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              var8_int = 48 / ((-42 - param4) / 35);
              if (!((ag) this).field_B) {
                break L1;
              } else {
                if (!((ag) this).a((byte) -47, param3, param0, param6, param5)) {
                  break L1;
                } else {
                  L2: {
                    boolean discarded$2 = ((ag) this).a(0, param2);
                    ((ag) this).field_t = param1;
                    if (null == ((ag) this).field_o) {
                      break L2;
                    } else {
                      if (!(((ag) this).field_o instanceof cl)) {
                        break L2;
                      } else {
                        ((cl) (Object) ((ag) this).field_o).a(31017, (ag) this, param0, param3, param6, param5, param1);
                        break L2;
                      }
                    }
                  }
                  stackOut_5_0 = 1;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0 != 0;
                }
              }
            }
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var8;
            stackOut_9_1 = new StringBuilder().append("ag.DA(").append(param0).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_8_0 != 0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, qm param5) {
        try {
            if (param1 != -20592) {
                field_A = null;
            }
            if (((ag) this).field_o != null) {
                if (((ag) this).field_o instanceof cl) {
                    ((cl) (Object) ((ag) this).field_o).a(param0, false, param4, param2, (ag) this, param3);
                }
            }
            ((ag) this).field_t = 0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ag.IA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    void a(qm param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
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
              super.a(param0, param1, param2, param3);
              ((ag) this).field_F = 0;
              if (0 == ((ag) this).field_t) {
                break L1;
              } else {
                if (wk.field_m == ((ag) this).field_t) {
                  break L1;
                } else {
                  L2: {
                    if (!((ag) this).a((byte) -47, param3, me.field_I, param1, an.field_g)) {
                      break L2;
                    } else {
                      if (wk.field_m != 0) {
                        break L2;
                      } else {
                        ((ag) this).a(-102, -param1 + an.field_g, ((ag) this).field_t, me.field_I + -param3);
                        break L2;
                      }
                    }
                  }
                  ((ag) this).a(me.field_I, -20592, an.field_g, param3, param1, param0);
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) runtimeException;
            stackOut_7_1 = new StringBuilder().append("ag.E(");
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
          throw aa.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    ag(String param0, wc param1) {
        this(param0, io.field_n.field_u, param1);
    }

    ag(int param0, int param1, int param2, int param3, pf param4, wc param5) {
        super(param0, param1, param2, param3, param4, param5);
        ((ag) this).field_F = 0;
        ((ag) this).field_B = true;
        ((ag) this).field_G = true;
        ((ag) this).field_y = false;
    }

    boolean a(int param0, qm param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (!((ag) this).field_B) {
                break L1;
              } else {
                if (!((ag) this).field_G) {
                  break L1;
                } else {
                  L2: {
                    param1.d((byte) 29);
                    ((ag) this).field_y = true;
                    if (param0 == 0) {
                      break L2;
                    } else {
                      var4 = null;
                      boolean discarded$2 = ((ag) this).a((qm) null, (byte) 125, 'B', 9);
                      break L2;
                    }
                  }
                  L3: {
                    if (((ag) this).field_o == null) {
                      break L3;
                    } else {
                      if (!(((ag) this).field_o instanceof wb)) {
                        break L3;
                      } else {
                        ((wb) (Object) ((ag) this).field_o).a(false, ((ag) this).field_y, (qm) this);
                        break L3;
                      }
                    }
                  }
                  stackOut_10_0 = 1;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                }
              }
            }
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("ag.A(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_11_0 != 0;
    }

    final static void a(byte param0) {
        sb.field_h[92] = 74;
        sb.field_h[46] = 72;
        sb.field_h[93] = 43;
        sb.field_h[59] = 57;
        sb.field_h[91] = 42;
        sb.field_h[61] = 27;
        sb.field_h[222] = 58;
        sb.field_h[192] = 28;
        if (param0 != -60) {
          ag.a((byte) -28);
          sb.field_h[520] = 59;
          sb.field_h[44] = 71;
          sb.field_h[47] = 73;
          sb.field_h[45] = 26;
          return;
        } else {
          sb.field_h[520] = 59;
          sb.field_h[44] = 71;
          sb.field_h[47] = 73;
          sb.field_h[45] = 26;
          return;
        }
    }

    final StringBuilder a(StringBuilder param0, int param1, Hashtable param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (((ag) this).a(param0, (byte) -90, param2, param1)) {
                L2: {
                  ((ag) this).a(param0, param1, param2, 1);
                  if (!((ag) this).field_z) {
                    break L2;
                  } else {
                    StringBuilder discarded$4 = param0.append(" active");
                    break L2;
                  }
                }
                if (((ag) this).field_B) {
                  break L1;
                } else {
                  StringBuilder discarded$5 = param0.append(" disabled");
                  break L1;
                }
              } else {
                break L1;
              }
            }
            var5_int = -113 / ((param3 - 50) / 60);
            stackOut_6_0 = (StringBuilder) param0;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("ag.FA(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param3 + ')');
        }
        return stackIn_7_0;
    }

    final void d(byte param0) {
        if (param0 == 29) {
          if (((ag) this).field_y) {
            ((ag) this).field_y = false;
            if (null != ((ag) this).field_o) {
              if (!(((ag) this).field_o instanceof wb)) {
                return;
              } else {
                ((wb) (Object) ((ag) this).field_o).a(false, ((ag) this).field_y, (qm) this);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void a(ij param0, byte param1) {
        if (param0 == null) {
            return;
        }
        nn.field_q = param0;
        co.field_f.field_G.c(81);
        try {
            co.field_f.a((kc) (Object) nn.field_q, 60);
            oj.field_i = true;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ag.QA(" + (param0 != null ? "{...}" : "null") + ',' + -104 + ')');
        }
    }

    final boolean d(int param0) {
        if (param0 != -2116) {
            field_x = null;
            return ((ag) this).field_y;
        }
        return ((ag) this).field_y;
    }

    public static void e(int param0) {
        field_C = null;
        field_x = null;
        field_D = null;
        field_A = null;
    }

    public ag() {
        ((ag) this).field_F = 0;
        ((ag) this).field_B = true;
        ((ag) this).field_G = true;
        ((ag) this).field_y = false;
        ((ag) this).field_r = io.field_n.field_y;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = new Random();
        field_A = "Off";
        field_x = "As you see, you performed a mighty leap when you pressed 'Enter'.<br>Try it again.";
    }
}
