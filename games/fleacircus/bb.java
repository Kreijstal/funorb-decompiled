/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class bb extends qa {
    boolean field_G;
    static int field_C;
    boolean field_D;
    static String field_H;
    static String field_I;
    static String field_J;
    static int field_E;
    private boolean field_B;
    private boolean field_F;
    static Boolean field_A;

    final StringBuilder a(StringBuilder param0, Hashtable param1, int param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (param3 <= -47) {
                break L1;
              } else {
                ((bb) this).field_D = true;
                break L1;
              }
            }
            L2: {
              if (((bb) this).a(param1, 95, param0, param2)) {
                L3: {
                  ((bb) this).a(param2, 96, param0, param1);
                  if (((bb) this).field_G) {
                    StringBuilder discarded$4 = param0.append(" active");
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (((bb) this).field_D) {
                  break L2;
                } else {
                  StringBuilder discarded$5 = param0.append(" disabled");
                  break L2;
                }
              } else {
                break L2;
              }
            }
            stackOut_9_0 = (StringBuilder) param0;
            stackIn_10_0 = stackOut_9_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("bb.S(");
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
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_10_0;
    }

    bb(String param0, ch param1, kd param2) {
        super(param0, param1, param2);
        ((bb) this).field_D = true;
        ((bb) this).field_B = true;
        ((bb) this).field_F = false;
    }

    boolean a(int param0, boolean param1, int param2, qa param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (param1) {
              if (!((bb) this).field_D) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                if (((bb) this).b(param0, param6, 0, param4, param2)) {
                  L1: {
                    boolean discarded$2 = ((bb) this).a(param3, -117);
                    ((bb) this).field_v = param5;
                    if (null == ((bb) this).field_s) {
                      break L1;
                    } else {
                      if (!(((bb) this).field_s instanceof dg)) {
                        break L1;
                      } else {
                        ((dg) (Object) ((bb) this).field_s).a(param2, (bb) this, param5, param4, 769, param0, param6);
                        break L1;
                      }
                    }
                  }
                  stackOut_9_0 = 1;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0 != 0;
                } else {
                  return false;
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
          L2: {
            var8 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var8;
            stackOut_13_1 = new StringBuilder().append("bb.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_12_0 != 0;
    }

    void a(int param0, int param1, int param2, int param3) {
        if (((bb) this).field_s != null) {
          if (((bb) this).field_s instanceof da) {
            ((da) (Object) ((bb) this).field_s).a(param0, param2, param3, 248, (bb) this);
            if (param1 != 84) {
              ((bb) this).field_B = true;
              return;
            } else {
              return;
            }
          } else {
            if (param1 != 84) {
              ((bb) this).field_B = true;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param1 != 84) {
            ((bb) this).field_B = true;
            return;
          } else {
            return;
          }
        }
    }

    void a(int param0, int param1, qa param2, byte param3) {
        if (param3 > -85) {
            return;
        }
        try {
            super.a(param0, param1, param2, (byte) -94);
            if (((bb) this).field_v != 0) {
                if (((bb) this).field_v == kc.field_f) {
                    return;
                }
                if (((bb) this).b(param0, param1, 0, ag.field_f, kc.field_b)) {
                    if (!(kc.field_f != 0)) {
                        ((bb) this).a(kc.field_b + -param0, 84, -param1 + ag.field_f, ((bb) this).field_v);
                    }
                }
                ((bb) this).a((byte) 5, param2, param1, ag.field_f, kc.field_b, param0);
            }
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "bb.I(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    boolean a(int param0, int param1, qa param2, char param3) {
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
            if (param0 == -2) {
              L1: {
                if (!((bb) this).e(~param0)) {
                  break L1;
                } else {
                  L2: {
                    if (84 == param1) {
                      break L2;
                    } else {
                      if (param1 != 83) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  ((bb) this).a(-1, 84, -1, 1);
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
            stackOut_11_1 = new StringBuilder().append("bb.N(").append(param0).append(',').append(param1).append(',');
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
          throw pf.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param3 + ')');
        }
        return stackIn_10_0 != 0;
    }

    bb(String param0, kd param1) {
        this(param0, nf.field_M.field_p, param1);
    }

    boolean a(qa param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (!((bb) this).field_D) {
                break L1;
              } else {
                if (!((bb) this).field_B) {
                  break L1;
                } else {
                  L2: {
                    param0.f(-1);
                    ((bb) this).field_F = true;
                    if (((bb) this).field_s == null) {
                      break L2;
                    } else {
                      if (((bb) this).field_s instanceof p) {
                        ((p) (Object) ((bb) this).field_s).a((qa) this, ((bb) this).field_F, (byte) -31);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (param1 < -26) {
                    stackOut_11_0 = 1;
                    stackIn_12_0 = stackOut_11_0;
                    break L0;
                  } else {
                    ((bb) this).field_D = true;
                    return true;
                  }
                }
              }
            }
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("bb.A(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ')');
        }
        return stackIn_12_0 != 0;
    }

    final void a(byte param0, qa param1, int param2, int param3, int param4, int param5) {
        try {
            if (param0 != 5) {
                Object var8 = null;
                boolean discarded$0 = ((bb) this).a((qa) null, 66);
            }
            if (((bb) this).field_s != null) {
                if (!(!(((bb) this).field_s instanceof dg))) {
                    ((dg) (Object) ((bb) this).field_s).a(param2, param5, true, (bb) this, param4, param3);
                }
            }
            ((bb) this).field_v = 0;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "bb.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a(int param0) {
        field_H = null;
        field_I = null;
        field_A = null;
        field_J = null;
    }

    final void f(int param0) {
        if (((bb) this).field_F) {
          ((bb) this).field_F = false;
          if (((bb) this).field_s != null) {
            if (((bb) this).field_s instanceof p) {
              ((p) (Object) ((bb) this).field_s).a((qa) this, ((bb) this).field_F, (byte) -31);
              if (param0 != -1) {
                field_A = null;
                return;
              } else {
                return;
              }
            } else {
              if (param0 != -1) {
                field_A = null;
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0 != -1) {
              field_A = null;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 != -1) {
            field_A = null;
            return;
          } else {
            return;
          }
        }
    }

    final boolean e(int param0) {
        Object var3 = null;
        if (param0 != 1) {
          var3 = null;
          boolean discarded$2 = ((bb) this).a(-92, -95, (qa) null, '');
          return ((bb) this).field_F;
        } else {
          return ((bb) this).field_F;
        }
    }

    protected bb() {
        ((bb) this).field_D = true;
        ((bb) this).field_B = true;
        ((bb) this).field_F = false;
        ((bb) this).field_p = nf.field_M.field_h;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Show help";
        field_J = "Player names can be up to 12 letters, numbers and underscores";
        field_I = "Next";
    }
}
