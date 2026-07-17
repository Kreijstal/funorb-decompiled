/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

class pj extends ca {
    int field_v;
    String field_i;
    ag field_h;
    int field_s;
    static String[] field_o;
    boolean field_t;
    static String field_w;
    int field_m;
    int field_q;
    int field_f;
    String field_l;
    int field_r;
    static hj[] field_u;
    static int field_p;
    static String field_k;
    dm field_g;
    td field_j;
    int field_n;

    public static void e(int param0) {
        field_u = null;
        if (param0 >= -66) {
          field_k = null;
          field_w = null;
          field_k = null;
          field_o = null;
          return;
        } else {
          field_w = null;
          field_k = null;
          field_o = null;
          return;
        }
    }

    void a(byte param0, pj param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
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
            if (param0 == -77) {
              L1: {
                var5_int = ((pj) this).a((byte) 3, ua.field_a, vl.field_d, param3, param2) ? 1 : 0;
                if (var5_int != 0) {
                  stackOut_4_0 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  break L1;
                } else {
                  stackOut_3_0 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  break L1;
                }
              }
              L2: {
                if (stackIn_5_0 != (((pj) this).field_t ? 1 : 0)) {
                  break L2;
                } else {
                  L3: {
                    stackOut_6_0 = this;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var5_int == 0) {
                      stackOut_8_0 = this;
                      stackOut_8_1 = 0;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      break L3;
                    } else {
                      stackOut_7_0 = this;
                      stackOut_7_1 = 1;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_9_1 = stackOut_7_1;
                      break L3;
                    }
                  }
                  ((pj) this).field_t = stackIn_9_1 != 0;
                  if (null == ((pj) this).field_h) {
                    break L2;
                  } else {
                    if (!(((pj) this).field_h instanceof cl)) {
                      break L2;
                    } else {
                      ((cl) (Object) ((pj) this).field_h).a((byte) 43, var5_int != 0, (pj) this);
                      break L2;
                    }
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("pj.A(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        var6 = OrbDefence.field_D ? 1 : 0;
        var4 = ((pj) this).f(param0 + -20680);
        var5_int = 0;
        L0: while (true) {
          L1: {
            if (var4 < var5_int) {
              break L1;
            } else {
              ((pj) this).a(param1, var5_int, param0 + 1048493, param2);
              var5_int++;
              if (var6 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            var5 = wj.g(param0 ^ -16392);
            if (var5 != null) {
              mb.field_a.a(sl.field_ab, uk.field_c, 0, var5);
              break L2;
            } else {
              break L2;
            }
          }
          if (param0 != 82) {
            field_o = null;
            return;
          } else {
            return;
          }
        }
    }

    String g(int param0) {
        String stackIn_4_0 = null;
        String stackIn_8_0 = null;
        String stackOut_7_0 = null;
        Object stackOut_6_0 = null;
        String stackOut_3_0 = null;
        Object stackOut_2_0 = null;
        if (param0 != -8235) {
          L0: {
            ((pj) this).field_s = -7;
            if (((pj) this).field_t) {
              stackOut_7_0 = ((pj) this).field_i;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = null;
              stackIn_8_0 = (String) (Object) stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (((pj) this).field_t) {
              stackOut_3_0 = ((pj) this).field_i;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = null;
              stackIn_4_0 = (String) (Object) stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    final void c(int param0) {
        ((pj) this).a(((pj) this).field_s, ((pj) this).field_n, ((pj) this).field_r, (byte) -90, ((pj) this).field_m);
        if (param0 != -26385) {
            ((pj) this).field_m = -40;
        }
    }

    public final String toString() {
        return ((pj) this).a((byte) -46, new Hashtable(), 0, new StringBuilder()).toString();
    }

    boolean a(boolean param0, int param1, int param2, int param3, int param4, int param5, pj param6) {
        RuntimeException var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (!param0) {
              stackOut_3_0 = 0;
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
          L1: {
            var8 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var8;
            stackOut_5_1 = new StringBuilder().append("pj.LA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param6 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0 != 0;
    }

    void h(int param0) {
        if (param0 != 0) {
            ((pj) this).field_n = -29;
        }
    }

    boolean a(char param0, int param1, pj param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param3 == 0) {
              stackOut_3_0 = 0;
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
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("pj.I(").append(param0).append(44).append(param1).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param3 + 41);
        }
        return stackIn_4_0 != 0;
    }

    boolean a(byte param0, pj param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param0 <= -115) {
                break L1;
              } else {
                field_k = null;
                break L1;
              }
            }
            if (((pj) this).a((byte) 3, param5, param4, param6, param3)) {
              ((pj) this).field_v = param2;
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var8;
            stackOut_6_1 = new StringBuilder().append("pj.F(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_5_0 != 0;
    }

    void a(int param0, int param1, byte param2, pj param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((pj) this).field_v = 0;
              if (param2 < -91) {
                break L1;
              } else {
                ((pj) this).h(-66);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("pj.J(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param3 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param4 + 44 + param5 + 41);
        }
    }

    pj(String param0, ag param1) {
        this(param0, mb.field_a.field_f, param1);
    }

    boolean d(int param0) {
        if (param0 != -81) {
            ((pj) this).field_f = 35;
            return false;
        }
        return false;
    }

    final boolean a(char param0, boolean param1, int param2) {
        int var4 = 0;
        if (!((pj) this).d(-81)) {
          var4 = param2;
          if (var4 != 80) {
            if (!param1) {
              ((pj) this).field_s = 4;
              return false;
            } else {
              return false;
            }
          } else {
            return ((pj) this).a(-81, (pj) this);
          }
        } else {
          if (!((pj) this).a(param0, param2, (pj) this, 0)) {
            var4 = param2;
            if (var4 != 80) {
              if (param1) {
                return false;
              } else {
                ((pj) this).field_s = 4;
                return false;
              }
            } else {
              return ((pj) this).a(-81, (pj) this);
            }
          } else {
            return true;
          }
        }
    }

    final void a(int param0, byte param1, Hashtable param2, StringBuilder param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              StringBuilder discarded$8 = param3.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(((pj) this).field_s).append(",").append(((pj) this).field_n).append(" ").append(((pj) this).field_m).append("x").append(((pj) this).field_r);
              if (((pj) this).field_l != null) {
                StringBuilder discarded$9 = param3.append(" text=\"").append(((pj) this).field_l).append(34);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((pj) this).field_t) {
                StringBuilder discarded$10 = param3.append(" mouseover");
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!((pj) this).d(-81)) {
                break L3;
              } else {
                StringBuilder discarded$11 = param3.append(" focused");
                break L3;
              }
            }
            L4: {
              if (null != ((pj) this).field_j) {
                L5: {
                  StringBuilder discarded$12 = param3.append(" renderer=");
                  if (!(((pj) this).field_j instanceof pj)) {
                    break L5;
                  } else {
                    param3 = ((pj) this).a((byte) -85, param2, 1 + param0, param3);
                    if (var6 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                StringBuilder discarded$13 = param3.append(((pj) this).field_j);
                break L4;
              } else {
                break L4;
              }
            }
            L6: {
              if (param1 <= -88) {
                break L6;
              } else {
                pj.a(-49, (hj) null);
                break L6;
              }
            }
            L7: {
              if (((pj) this).field_h != null) {
                L8: {
                  StringBuilder discarded$14 = param3.append(" listener=");
                  if (!(((pj) this).field_h instanceof pj)) {
                    break L8;
                  } else {
                    param3 = ((pj) this).a((byte) -32, param2, param0 - -1, param3);
                    if (var6 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                StringBuilder discarded$15 = param3.append(((pj) this).field_h);
                break L7;
              } else {
                break L7;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var5;
            stackOut_22_1 = new StringBuilder().append("pj.HB(").append(param0).append(44).append(param1).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          L10: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L10;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 41);
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param2 == 1048575) {
          if (param1 == 0) {
            if (((pj) this).field_j == null) {
              return;
            } else {
              ((pj) this).field_j.a(param0, param3, (pj) this, -4394, true);
              return;
            }
          } else {
            return;
          }
        } else {
          boolean discarded$10 = ((pj) this).a(86, false, true, -95);
          if (param1 == 0) {
            if (((pj) this).field_j == null) {
              return;
            } else {
              ((pj) this).field_j.a(param0, param3, (pj) this, -4394, true);
              return;
            }
          } else {
            return;
          }
        }
    }

    final static void a(int param0, hj param1) {
        try {
            if (param0 != 0) {
                field_o = null;
            }
            lc.field_w = param1;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "pj.WA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    int f(int param0) {
        if (param0 != -20598) {
            ((pj) this).field_h = null;
            return 0;
        }
        return 0;
    }

    final boolean a(byte param0, int param1, int param2, int param3, int param4) {
        int stackIn_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_17_0 = 0;
        if (param0 == 3) {
          if (param1 >= param4 + ((pj) this).field_s) {
            if (param2 < param3 - -((pj) this).field_n) {
              return false;
            } else {
              L0: {
                L1: {
                  if (param1 >= ((pj) this).field_m + (((pj) this).field_s + param4)) {
                    break L1;
                  } else {
                    if (param2 >= ((pj) this).field_r + (param3 - -((pj) this).field_n)) {
                      break L1;
                    } else {
                      stackOut_16_0 = 1;
                      stackIn_18_0 = stackOut_16_0;
                      break L0;
                    }
                  }
                }
                stackOut_17_0 = 0;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              }
              return stackIn_18_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          ((pj) this).field_v = 72;
          if (param1 >= param4 + ((pj) this).field_s) {
            if (param2 >= param3 - -((pj) this).field_n) {
              if (param1 < ((pj) this).field_m + (((pj) this).field_s + param4)) {
                if (param2 >= ((pj) this).field_r + (param3 - -((pj) this).field_n)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        CharSequence var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var2_int = -108 / ((43 - param0) / 51);
              var3 = param1.getParameter("username");
              if (var3 == null) {
                break L1;
              } else {
                var4 = (CharSequence) (Object) var3;
                if (bk.a(127, var4) != 0L) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("pj.AB(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    void a(int param0, int param1, int param2, byte param3, int param4) {
        ((pj) this).field_r = param2;
        ((pj) this).field_m = param4;
        ((pj) this).field_n = param1;
        if (param3 != -90) {
            return;
        }
        ((pj) this).field_s = param0;
    }

    final boolean a(int param0, boolean param1, boolean param2, int param3) {
        int var5 = 0;
        dd var6 = null;
        int var7 = 0;
        var7 = OrbDefence.field_D ? 1 : 0;
        if (!param1) {
          ((pj) this).a((byte) -77, (pj) this, param3, param0);
          var5 = ((pj) this).d(-81) ? 1 : 0;
          if (!param2) {
            L0: {
              if (var5 == 0) {
                break L0;
              } else {
                if (gi.field_e != 0) {
                  ((pj) this).h(0);
                  break L0;
                } else {
                  ud.field_j = of.field_G;
                  fg.a(101, ((pj) this).g(-8235));
                  return param2;
                }
              }
            }
            ud.field_j = of.field_G;
            fg.a(101, ((pj) this).g(-8235));
            return param2;
          } else {
            if (of.field_K != 0) {
              if (var5 != 0) {
                boolean discarded$1 = ((pj) this).a(param1, param3, param0, of.field_K, ua.field_a, vl.field_d, (pj) this);
                if (gi.field_e != 0) {
                  L1: {
                    if (((pj) this).a((byte) -120, (pj) this, gi.field_e, param3, bg.field_c, ig.field_fb, param0)) {
                      param2 = false;
                      break L1;
                    } else {
                      if (var5 == 0) {
                        break L1;
                      } else {
                        ((pj) this).h(0);
                        if (var7 == 0) {
                          break L1;
                        } else {
                          L2: {
                            param2 = false;
                            if (of.field_G != 0) {
                              break L2;
                            } else {
                              if (ud.field_j != 0) {
                                L3: {
                                  ((pj) this).a(param0, ua.field_a, (byte) -98, (pj) this, param3, vl.field_d);
                                  var6 = al.field_c;
                                  if (var6 == null) {
                                    break L3;
                                  } else {
                                    L4: {
                                      if (var6.field_h instanceof wk) {
                                        ((wk) (Object) var6.field_h).a(-114, var6, (mm) null);
                                        break L4;
                                      } else {
                                        break L4;
                                      }
                                    }
                                    al.field_c = null;
                                    break L3;
                                  }
                                }
                                if (var7 == 0) {
                                  break L2;
                                } else {
                                  if (var5 == 0) {
                                    break L2;
                                  } else {
                                    if (gi.field_e != 0) {
                                      ((pj) this).h(0);
                                      break L2;
                                    } else {
                                      break L2;
                                    }
                                  }
                                }
                              } else {
                                ud.field_j = of.field_G;
                                fg.a(101, ((pj) this).g(-8235));
                                return param2;
                              }
                            }
                          }
                          ud.field_j = of.field_G;
                          fg.a(101, ((pj) this).g(-8235));
                          return param2;
                        }
                      }
                    }
                  }
                  if (of.field_G == 0) {
                    if (ud.field_j != 0) {
                      L5: {
                        ((pj) this).a(param0, ua.field_a, (byte) -98, (pj) this, param3, vl.field_d);
                        var6 = al.field_c;
                        if (var6 == null) {
                          break L5;
                        } else {
                          L6: {
                            if (var6.field_h instanceof wk) {
                              ((wk) (Object) var6.field_h).a(-114, var6, (mm) null);
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          al.field_c = null;
                          break L5;
                        }
                      }
                      if (var7 != 0) {
                        L7: {
                          if (var5 == 0) {
                            break L7;
                          } else {
                            if (gi.field_e != 0) {
                              ((pj) this).h(0);
                              break L7;
                            } else {
                              ud.field_j = of.field_G;
                              fg.a(101, ((pj) this).g(-8235));
                              return param2;
                            }
                          }
                        }
                        ud.field_j = of.field_G;
                        fg.a(101, ((pj) this).g(-8235));
                        return param2;
                      } else {
                        ud.field_j = of.field_G;
                        fg.a(101, ((pj) this).g(-8235));
                        return param2;
                      }
                    } else {
                      ud.field_j = of.field_G;
                      fg.a(101, ((pj) this).g(-8235));
                      return param2;
                    }
                  } else {
                    ud.field_j = of.field_G;
                    fg.a(101, ((pj) this).g(-8235));
                    return param2;
                  }
                } else {
                  L8: {
                    if (of.field_G != 0) {
                      break L8;
                    } else {
                      if (ud.field_j != 0) {
                        L9: {
                          ((pj) this).a(param0, ua.field_a, (byte) -98, (pj) this, param3, vl.field_d);
                          var6 = al.field_c;
                          if (var6 == null) {
                            break L9;
                          } else {
                            L10: {
                              if (var6.field_h instanceof wk) {
                                ((wk) (Object) var6.field_h).a(-114, var6, (mm) null);
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            al.field_c = null;
                            break L9;
                          }
                        }
                        if (var7 == 0) {
                          break L8;
                        } else {
                          if (var5 == 0) {
                            break L8;
                          } else {
                            if (gi.field_e != 0) {
                              ((pj) this).h(0);
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                        }
                      } else {
                        ud.field_j = of.field_G;
                        fg.a(101, ((pj) this).g(-8235));
                        return param2;
                      }
                    }
                  }
                  ud.field_j = of.field_G;
                  fg.a(101, ((pj) this).g(-8235));
                  return param2;
                }
              } else {
                if (gi.field_e != 0) {
                  L11: {
                    if (((pj) this).a((byte) -120, (pj) this, gi.field_e, param3, bg.field_c, ig.field_fb, param0)) {
                      param2 = false;
                      break L11;
                    } else {
                      if (var5 == 0) {
                        break L11;
                      } else {
                        ((pj) this).h(0);
                        if (var7 == 0) {
                          break L11;
                        } else {
                          L12: {
                            param2 = false;
                            if (of.field_G != 0) {
                              break L12;
                            } else {
                              if (ud.field_j != 0) {
                                L13: {
                                  ((pj) this).a(param0, ua.field_a, (byte) -98, (pj) this, param3, vl.field_d);
                                  var6 = al.field_c;
                                  if (var6 == null) {
                                    break L13;
                                  } else {
                                    L14: {
                                      if (var6.field_h instanceof wk) {
                                        ((wk) (Object) var6.field_h).a(-114, var6, (mm) null);
                                        break L14;
                                      } else {
                                        break L14;
                                      }
                                    }
                                    al.field_c = null;
                                    break L13;
                                  }
                                }
                                if (var7 == 0) {
                                  break L12;
                                } else {
                                  if (var5 == 0) {
                                    break L12;
                                  } else {
                                    if (gi.field_e != 0) {
                                      ((pj) this).h(0);
                                      break L12;
                                    } else {
                                      ud.field_j = of.field_G;
                                      fg.a(101, ((pj) this).g(-8235));
                                      return param2;
                                    }
                                  }
                                }
                              } else {
                                ud.field_j = of.field_G;
                                fg.a(101, ((pj) this).g(-8235));
                                return param2;
                              }
                            }
                          }
                          ud.field_j = of.field_G;
                          fg.a(101, ((pj) this).g(-8235));
                          return param2;
                        }
                      }
                    }
                  }
                  L15: {
                    if (of.field_G != 0) {
                      break L15;
                    } else {
                      if (ud.field_j != 0) {
                        L16: {
                          ((pj) this).a(param0, ua.field_a, (byte) -98, (pj) this, param3, vl.field_d);
                          var6 = al.field_c;
                          if (var6 == null) {
                            break L16;
                          } else {
                            L17: {
                              if (var6.field_h instanceof wk) {
                                ((wk) (Object) var6.field_h).a(-114, var6, (mm) null);
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            al.field_c = null;
                            break L16;
                          }
                        }
                        if (var7 == 0) {
                          break L15;
                        } else {
                          if (var5 == 0) {
                            break L15;
                          } else {
                            if (gi.field_e != 0) {
                              ((pj) this).h(0);
                              break L15;
                            } else {
                              ud.field_j = of.field_G;
                              fg.a(101, ((pj) this).g(-8235));
                              return param2;
                            }
                          }
                        }
                      } else {
                        ud.field_j = of.field_G;
                        fg.a(101, ((pj) this).g(-8235));
                        return param2;
                      }
                    }
                  }
                  ud.field_j = of.field_G;
                  fg.a(101, ((pj) this).g(-8235));
                  return param2;
                } else {
                  L18: {
                    if (of.field_G != 0) {
                      break L18;
                    } else {
                      if (ud.field_j != 0) {
                        L19: {
                          ((pj) this).a(param0, ua.field_a, (byte) -98, (pj) this, param3, vl.field_d);
                          var6 = al.field_c;
                          if (var6 == null) {
                            break L19;
                          } else {
                            L20: {
                              if (var6.field_h instanceof wk) {
                                ((wk) (Object) var6.field_h).a(-114, var6, (mm) null);
                                break L20;
                              } else {
                                break L20;
                              }
                            }
                            al.field_c = null;
                            break L19;
                          }
                        }
                        if (var7 == 0) {
                          break L18;
                        } else {
                          if (var5 == 0) {
                            break L18;
                          } else {
                            if (gi.field_e != 0) {
                              ((pj) this).h(0);
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                        }
                      } else {
                        ud.field_j = of.field_G;
                        fg.a(101, ((pj) this).g(-8235));
                        return param2;
                      }
                    }
                  }
                  ud.field_j = of.field_G;
                  fg.a(101, ((pj) this).g(-8235));
                  return param2;
                }
              }
            } else {
              if (gi.field_e != 0) {
                L21: {
                  if (((pj) this).a((byte) -120, (pj) this, gi.field_e, param3, bg.field_c, ig.field_fb, param0)) {
                    param2 = false;
                    break L21;
                  } else {
                    if (var5 == 0) {
                      break L21;
                    } else {
                      ((pj) this).h(0);
                      if (var7 == 0) {
                        break L21;
                      } else {
                        L22: {
                          param2 = false;
                          if (of.field_G != 0) {
                            break L22;
                          } else {
                            if (ud.field_j != 0) {
                              L23: {
                                ((pj) this).a(param0, ua.field_a, (byte) -98, (pj) this, param3, vl.field_d);
                                var6 = al.field_c;
                                if (var6 == null) {
                                  break L23;
                                } else {
                                  L24: {
                                    if (var6.field_h instanceof wk) {
                                      ((wk) (Object) var6.field_h).a(-114, var6, (mm) null);
                                      break L24;
                                    } else {
                                      break L24;
                                    }
                                  }
                                  al.field_c = null;
                                  break L23;
                                }
                              }
                              if (var7 == 0) {
                                break L22;
                              } else {
                                if (var5 == 0) {
                                  break L22;
                                } else {
                                  if (gi.field_e != 0) {
                                    ((pj) this).h(0);
                                    break L22;
                                  } else {
                                    break L22;
                                  }
                                }
                              }
                            } else {
                              ud.field_j = of.field_G;
                              fg.a(101, ((pj) this).g(-8235));
                              return param2;
                            }
                          }
                        }
                        ud.field_j = of.field_G;
                        fg.a(101, ((pj) this).g(-8235));
                        return param2;
                      }
                    }
                  }
                }
                L25: {
                  if (of.field_G != 0) {
                    break L25;
                  } else {
                    if (ud.field_j != 0) {
                      L26: {
                        ((pj) this).a(param0, ua.field_a, (byte) -98, (pj) this, param3, vl.field_d);
                        var6 = al.field_c;
                        if (var6 == null) {
                          break L26;
                        } else {
                          L27: {
                            if (var6.field_h instanceof wk) {
                              ((wk) (Object) var6.field_h).a(-114, var6, (mm) null);
                              break L27;
                            } else {
                              break L27;
                            }
                          }
                          al.field_c = null;
                          break L26;
                        }
                      }
                      if (var7 == 0) {
                        break L25;
                      } else {
                        if (var5 == 0) {
                          break L25;
                        } else {
                          if (gi.field_e != 0) {
                            ((pj) this).h(0);
                            break L25;
                          } else {
                            ud.field_j = of.field_G;
                            fg.a(101, ((pj) this).g(-8235));
                            return param2;
                          }
                        }
                      }
                    } else {
                      ud.field_j = of.field_G;
                      fg.a(101, ((pj) this).g(-8235));
                      return param2;
                    }
                  }
                }
                ud.field_j = of.field_G;
                fg.a(101, ((pj) this).g(-8235));
                return param2;
              } else {
                L28: {
                  if (of.field_G != 0) {
                    break L28;
                  } else {
                    if (ud.field_j != 0) {
                      L29: {
                        ((pj) this).a(param0, ua.field_a, (byte) -98, (pj) this, param3, vl.field_d);
                        var6 = al.field_c;
                        if (var6 == null) {
                          break L29;
                        } else {
                          L30: {
                            if (var6.field_h instanceof wk) {
                              ((wk) (Object) var6.field_h).a(-114, var6, (mm) null);
                              break L30;
                            } else {
                              break L30;
                            }
                          }
                          al.field_c = null;
                          break L29;
                        }
                      }
                      if (var7 == 0) {
                        break L28;
                      } else {
                        if (var5 == 0) {
                          break L28;
                        } else {
                          if (gi.field_e != 0) {
                            ((pj) this).h(0);
                            break L28;
                          } else {
                            break L28;
                          }
                        }
                      }
                    } else {
                      ud.field_j = of.field_G;
                      fg.a(101, ((pj) this).g(-8235));
                      return param2;
                    }
                  }
                }
                ud.field_j = of.field_G;
                fg.a(101, ((pj) this).g(-8235));
                return param2;
              }
            }
          }
        } else {
          return false;
        }
    }

    boolean a(int param0, pj param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param0 == -81) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              boolean discarded$2 = ((pj) this).a(-59, (pj) null);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("pj.E(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0 != 0;
    }

    StringBuilder a(byte param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
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
              if (param0 < -23) {
                break L1;
              } else {
                field_p = 37;
                break L1;
              }
            }
            L2: {
              if (!((pj) this).a(9882, param3, param2, param1)) {
                break L2;
              } else {
                ((pj) this).a(param2, (byte) -116, param1, param3);
                break L2;
              }
            }
            stackOut_4_0 = (StringBuilder) param3;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("pj.C(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44).append(param2).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
        return stackIn_5_0;
    }

    final boolean a(int param0, StringBuilder param1, int param2, Hashtable param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
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
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
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
            if (param0 == 9882) {
              if (!param3.containsKey(this)) {
                Object discarded$4 = param3.put(this, this);
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                StringBuilder discarded$5 = param1.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
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
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("pj.EB(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          L2: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44).append(param2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_7_0 != 0;
    }

    protected pj() {
        ((pj) this).field_f = 0;
        ((pj) this).field_q = 0;
    }

    pj(String param0, td param1, ag param2) {
        RuntimeException runtimeException = null;
        rj var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        ((pj) this).field_f = 0;
        ((pj) this).field_q = 0;
        try {
          L0: {
            L1: {
              ((pj) this).field_h = param2;
              ((pj) this).field_l = param0;
              ((pj) this).field_j = param1;
              if (!(((pj) this).field_j instanceof rj)) {
                break L1;
              } else {
                var4 = (rj) (Object) ((pj) this).field_j;
                ((pj) this).field_m = var4.c((pj) this, true);
                ((pj) this).field_r = var4.b((pj) this, true);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("pj.<init>(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
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
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    pj(int param0, int param1, int param2, int param3, td param4, ag param5) {
        ((pj) this).field_f = 0;
        ((pj) this).field_q = 0;
        try {
            ((pj) this).field_r = param3;
            ((pj) this).field_j = param4;
            ((pj) this).field_h = param5;
            ((pj) this).field_n = param1;
            ((pj) this).field_s = param0;
            ((pj) this).field_m = param2;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "pj.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
