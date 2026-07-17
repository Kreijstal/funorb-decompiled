/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

class qg extends wf {
    boolean field_g;
    int field_p;
    String field_k;
    int field_o;
    ue field_i;
    String field_j;
    int field_n;
    int field_l;
    int field_r;
    int field_h;
    ui field_q;
    int field_s;
    ma field_m;

    qg(String param0, ma param1) {
        this(param0, vi.field_e.field_q, param1);
    }

    boolean b(int param0, int param1, qg param2, int param3, int param4, int param5, int param6) {
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
              if (!((qg) this).b(param3, param6, -1, param0, param5)) {
                break L1;
              } else {
                ((qg) this).field_s = param1;
                break L1;
              }
            }
            if (param4 == -30386) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              ((qg) this).field_k = null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var8;
            stackOut_6_1 = new StringBuilder().append("qg.O(").append(param0).append(44).append(param1).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
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
          throw ch.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_5_0 != 0;
    }

    final void a(StringBuilder param0, int param1, int param2, Hashtable param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              StringBuilder discarded$8 = param0.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(((qg) this).field_p).append(",").append(((qg) this).field_n).append(" ").append(((qg) this).field_l).append("x").append(((qg) this).field_h);
              if (((qg) this).field_k == null) {
                break L1;
              } else {
                StringBuilder discarded$9 = param0.append(" text=\"").append(((qg) this).field_k).append(34);
                break L1;
              }
            }
            L2: {
              if (((qg) this).field_g) {
                StringBuilder discarded$10 = param0.append(" mouseover");
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var5_int = -48 % ((param1 - 22) / 40);
              if (((qg) this).b((byte) 121)) {
                StringBuilder discarded$11 = param0.append(" focused");
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (null != ((qg) this).field_q) {
                L5: {
                  StringBuilder discarded$12 = param0.append(" renderer=");
                  if (!(((qg) this).field_q instanceof qg)) {
                    break L5;
                  } else {
                    param0 = ((qg) this).a(param2 - -1, -109, param0, param3);
                    if (var6 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                StringBuilder discarded$13 = param0.append(((qg) this).field_q);
                break L4;
              } else {
                break L4;
              }
            }
            L6: {
              if (((qg) this).field_m == null) {
                break L6;
              } else {
                L7: {
                  StringBuilder discarded$14 = param0.append(" listener=");
                  if (((qg) this).field_m instanceof qg) {
                    break L7;
                  } else {
                    StringBuilder discarded$15 = param0.append(((qg) this).field_m);
                    if (var6 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                param0 = ((qg) this).a(1 + param2, -115, param0, param3);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var5;
            stackOut_20_1 = new StringBuilder().append("qg.CB(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          L9: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param3 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
    }

    final static void b(boolean param0) {
        if (!(ge.field_x)) {
            throw new IllegalStateException();
        }
        bg.field_n = true;
        n.a(true, param0);
        gl.field_y = 0;
    }

    final static int d(int param0) {
        if (param0 != -20493) {
            return 104;
        }
        return gj.field_l;
    }

    final void c(byte param0) {
        if (param0 <= 14) {
          int discarded$2 = ((qg) this).g(100);
          ((qg) this).a(-96, ((qg) this).field_n, ((qg) this).field_p, ((qg) this).field_l, ((qg) this).field_h);
          return;
        } else {
          ((qg) this).a(-96, ((qg) this).field_n, ((qg) this).field_p, ((qg) this).field_l, ((qg) this).field_h);
          return;
        }
    }

    final boolean a(int param0, char param1, int param2) {
        int var4 = 0;
        if (!((qg) this).b((byte) 38)) {
          var4 = param2;
          if (var4 != 80) {
            if (param0 != -81) {
              ((qg) this).field_p = 19;
              return false;
            } else {
              return false;
            }
          } else {
            return ((qg) this).a((qg) this, -106);
          }
        } else {
          if (!((qg) this).a(param2, (qg) this, (byte) -27, param1)) {
            var4 = param2;
            if (var4 != 80) {
              if (param0 == -81) {
                return false;
              } else {
                ((qg) this).field_p = 19;
                return false;
              }
            } else {
              return ((qg) this).a((qg) this, -106);
            }
          } else {
            return true;
          }
        }
    }

    void e(int param0) {
        if (param0 != -29113) {
            ((qg) this).a(84, 80, 23, -23, 76);
        }
    }

    boolean a(int param0, qg param1, byte param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var5_int = -77 % ((65 - param2) / 55);
            stackOut_0_0 = 0;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5;
            stackOut_2_1 = new StringBuilder().append("qg.K(").append(param0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_1_0 != 0;
    }

    final boolean a(byte param0, Hashtable param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
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
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
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
        try {
          L0: {
            L1: {
              if (param0 <= -1) {
                break L1;
              } else {
                ((qg) this).a(93, 124, 81, -75, -10);
                break L1;
              }
            }
            if (!param1.containsKey(this)) {
              Object discarded$4 = param1.put(this, this);
              stackOut_5_0 = 1;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              StringBuilder discarded$5 = param2.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("qg.TA(").append(param0).append(44);
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
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
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
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param3 + 41);
        }
        return stackIn_6_0 != 0;
    }

    int g(int param0) {
        if (param0 >= -41) {
            int discarded$0 = qg.a((byte) 106, -11);
            return 0;
        }
        return 0;
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 112 / ((param0 - -29) / 53);
        ((qg) this).field_l = param3;
        ((qg) this).field_h = param4;
        ((qg) this).field_n = param1;
        ((qg) this).field_p = param2;
    }

    boolean a(int param0, int param1, qg param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
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
            if (param5 == -17) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              ((qg) this).field_g = true;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var8;
            stackOut_4_1 = new StringBuilder().append("qg.R(").append(param0).append(44).append(param1).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
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
          throw ch.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_3_0 != 0;
    }

    void a(int param0, byte param1, qg param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int stackIn_5_0 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
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
              var5_int = ((qg) this).b(param3, param0, -1, oa.field_j, bk.field_a) ? 1 : 0;
              if (param1 == -12) {
                break L1;
              } else {
                ((qg) this).field_s = 86;
                break L1;
              }
            }
            L2: {
              if (((qg) this).field_g) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              if (stackIn_5_0 != var5_int) {
                break L3;
              } else {
                L4: {
                  stackOut_6_0 = this;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (var5_int == 0) {
                    stackOut_8_0 = this;
                    stackOut_8_1 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    break L4;
                  } else {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    break L4;
                  }
                }
                ((qg) this).field_g = stackIn_9_1 != 0;
                if (null == ((qg) this).field_m) {
                  break L3;
                } else {
                  if (((qg) this).field_m instanceof ja) {
                    ((ja) (Object) ((qg) this).field_m).a(var5_int != 0, 5257, (qg) this);
                    break L3;
                  } else {
                    return;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) runtimeException;
            stackOut_14_1 = new StringBuilder().append("qg.B(").append(param0).append(44).append(param1).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
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
          throw ch.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param3 + 41);
        }
    }

    String f(int param0) {
        String stackIn_4_0 = null;
        String stackIn_8_0 = null;
        String stackOut_7_0 = null;
        Object stackOut_6_0 = null;
        String stackOut_3_0 = null;
        Object stackOut_2_0 = null;
        if (param0 != 4) {
          L0: {
            ((qg) this).field_s = 3;
            if (((qg) this).field_g) {
              stackOut_7_0 = ((qg) this).field_j;
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
            if (((qg) this).field_g) {
              stackOut_3_0 = ((qg) this).field_j;
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

    void a(int param0, int param1, qg param2, int param3, int param4, int param5) {
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
              ((qg) this).field_s = 0;
              if (param3 == -1) {
                break L1;
              } else {
                int discarded$2 = ((qg) this).g(-118);
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
            stackOut_3_1 = new StringBuilder().append("qg.BA(").append(param0).append(44).append(param1).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
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
          throw ch.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    public final String toString() {
        return ((qg) this).a(0, -21, new StringBuilder(), new Hashtable()).toString();
    }

    boolean b(byte param0) {
        int var2 = 95 / ((param0 - -57) / 46);
        return false;
    }

    boolean a(qg param0, int param1) {
        RuntimeException var3 = null;
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
            if (param1 <= -11) {
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
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("qg.M(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
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
          throw ch.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
        return stackIn_4_0 != 0;
    }

    final static boolean a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = -6 / ((param1 - 17) / 55);
            var3 = (CharSequence) (Object) param0;
            stackOut_0_0 = kf.field_e.equals((Object) (Object) hj.a((byte) -126, var3));
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("qg.BB(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 41);
        }
        return stackIn_1_0;
    }

    void a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        var5 = 112 / ((param3 - 77) / 34);
        if (param2 == 0) {
          if (null == ((qg) this).field_q) {
            return;
          } else {
            ((qg) this).field_q.a(param0, param1, true, (byte) 110, (qg) this);
            return;
          }
        } else {
          return;
        }
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4) {
        if (param2 == -1) {
          if (param3 >= ((qg) this).field_p + param0) {
            if (param1 - -((qg) this).field_n <= param4) {
              if (param3 < ((qg) this).field_l + (param0 - -((qg) this).field_p)) {
                if (param4 >= ((qg) this).field_n + param1 + ((qg) this).field_h) {
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
        } else {
          ((qg) this).field_o = -25;
          if (param3 >= ((qg) this).field_p + param0) {
            if (param1 - -((qg) this).field_n <= param4) {
              if (param3 < ((qg) this).field_l + (param0 - -((qg) this).field_p)) {
                if (param4 >= ((qg) this).field_n + param1 + ((qg) this).field_h) {
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

    final static int a(byte param0, int param1) {
        int var2 = 0;
        var2 = 0;
        if (0 <= param1) {
          if (65536 > param1) {
            L0: {
              if (param1 >= 256) {
                var2 += 8;
                param1 = param1 >>> 8;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (param1 >= 16) {
                var2 += 4;
                param1 = param1 >>> 4;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 < 4) {
                break L2;
              } else {
                var2 += 2;
                param1 = param1 >>> 2;
                break L2;
              }
            }
            L3: {
              if (param1 < 1) {
                break L3;
              } else {
                param1 = param1 >>> 1;
                var2++;
                break L3;
              }
            }
            if (param0 < 69) {
              return 21;
            } else {
              return param1 + var2;
            }
          } else {
            L4: {
              param1 = param1 >>> 16;
              var2 += 16;
              if (param1 >= 256) {
                var2 += 8;
                param1 = param1 >>> 8;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (param1 >= 16) {
                var2 += 4;
                param1 = param1 >>> 4;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (param1 < 4) {
                break L6;
              } else {
                var2 += 2;
                param1 = param1 >>> 2;
                break L6;
              }
            }
            L7: {
              if (param1 < 1) {
                break L7;
              } else {
                param1 = param1 >>> 1;
                var2++;
                break L7;
              }
            }
            if (param0 < 69) {
              return 21;
            } else {
              return param1 + var2;
            }
          }
        } else {
          L8: {
            param1 = param1 >>> 16;
            var2 += 16;
            if (param1 >= 256) {
              var2 += 8;
              param1 = param1 >>> 8;
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            if (param1 >= 16) {
              var2 += 4;
              param1 = param1 >>> 4;
              break L9;
            } else {
              break L9;
            }
          }
          L10: {
            if (param1 < 4) {
              break L10;
            } else {
              var2 += 2;
              param1 = param1 >>> 2;
              break L10;
            }
          }
          L11: {
            if (param1 < 1) {
              break L11;
            } else {
              param1 = param1 >>> 1;
              var2++;
              break L11;
            }
          }
          if (param0 < 69) {
            return 21;
          } else {
            return param1 + var2;
          }
        }
    }

    StringBuilder a(int param0, int param1, StringBuilder param2, Hashtable param3) {
        RuntimeException var5 = null;
        Object stackIn_5_0 = null;
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
        Object stackOut_4_0 = null;
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
              if (((qg) this).a((byte) -103, param3, param2, param0)) {
                ((qg) this).a(param2, 78, param0, param3);
                break L1;
              } else {
                break L1;
              }
            }
            if (param1 <= -20) {
              stackOut_6_0 = (StringBuilder) param2;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (StringBuilder) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("qg.Q(").append(param0).append(44).append(param1).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
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
          throw ch.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_7_0;
    }

    final boolean a(int param0, int param1, boolean param2, int param3) {
        int var5 = 0;
        vl var6 = null;
        int var7 = 0;
        var7 = Transmogrify.field_A ? 1 : 0;
        ((qg) this).a(param0, (byte) -12, (qg) this, param1);
        var5 = ((qg) this).b((byte) 63) ? 1 : 0;
        if (param3 == 4) {
          L0: {
            if (param2) {
              break L0;
            } else {
              if (var5 != 0) {
                if (0 != tg.field_d) {
                  ((qg) this).e(-29113);
                  if (var7 != 0) {
                    break L0;
                  } else {
                    hi.field_g = b.field_k;
                    eg.a(((qg) this).f(param3), (byte) 126);
                    return param2;
                  }
                } else {
                  hi.field_g = b.field_k;
                  eg.a(((qg) this).f(param3), (byte) 126);
                  return param2;
                }
              } else {
                hi.field_g = b.field_k;
                eg.a(((qg) this).f(param3), (byte) 126);
                return param2;
              }
            }
          }
          L1: {
            if (f.field_a == 0) {
              break L1;
            } else {
              if (var5 != 0) {
                boolean discarded$1 = ((qg) this).a(param1, bk.field_a, (qg) this, param0, f.field_a, -17, oa.field_j);
                break L1;
              } else {
                if (tg.field_d != 0) {
                  L2: {
                    L3: {
                      if (((qg) this).b(ol.field_b, tg.field_d, (qg) this, param1, -30386, nk.field_c, param0)) {
                        break L3;
                      } else {
                        if (var5 != 0) {
                          ((qg) this).e(-29113);
                          if (var7 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        } else {
                          if (b.field_k == 0) {
                            if (hi.field_g != 0) {
                              ((qg) this).a(param0, oa.field_j, (qg) this, -1, bk.field_a, param1);
                              var6 = b.field_i;
                              if (var6 != null) {
                                if (!(var6.field_m instanceof s)) {
                                  b.field_i = null;
                                  hi.field_g = b.field_k;
                                  eg.a(((qg) this).f(param3), (byte) 126);
                                  return param2;
                                } else {
                                  ((s) (Object) var6.field_m).a((g) null, 2089, var6);
                                  b.field_i = null;
                                  hi.field_g = b.field_k;
                                  eg.a(((qg) this).f(param3), (byte) 126);
                                  return param2;
                                }
                              } else {
                                hi.field_g = b.field_k;
                                eg.a(((qg) this).f(param3), (byte) 126);
                                return param2;
                              }
                            } else {
                              hi.field_g = b.field_k;
                              eg.a(((qg) this).f(param3), (byte) 126);
                              return param2;
                            }
                          } else {
                            hi.field_g = b.field_k;
                            eg.a(((qg) this).f(param3), (byte) 126);
                            return param2;
                          }
                        }
                      }
                    }
                    param2 = false;
                    break L2;
                  }
                  if (b.field_k == 0) {
                    if (hi.field_g != 0) {
                      ((qg) this).a(param0, oa.field_j, (qg) this, -1, bk.field_a, param1);
                      var6 = b.field_i;
                      if (var6 == null) {
                        hi.field_g = b.field_k;
                        eg.a(((qg) this).f(param3), (byte) 126);
                        return param2;
                      } else {
                        if (!(var6.field_m instanceof s)) {
                          b.field_i = null;
                          hi.field_g = b.field_k;
                          eg.a(((qg) this).f(param3), (byte) 126);
                          return param2;
                        } else {
                          ((s) (Object) var6.field_m).a((g) null, 2089, var6);
                          b.field_i = null;
                          hi.field_g = b.field_k;
                          eg.a(((qg) this).f(param3), (byte) 126);
                          return param2;
                        }
                      }
                    } else {
                      hi.field_g = b.field_k;
                      eg.a(((qg) this).f(param3), (byte) 126);
                      return param2;
                    }
                  } else {
                    hi.field_g = b.field_k;
                    eg.a(((qg) this).f(param3), (byte) 126);
                    return param2;
                  }
                } else {
                  if (b.field_k == 0) {
                    if (hi.field_g != 0) {
                      ((qg) this).a(param0, oa.field_j, (qg) this, -1, bk.field_a, param1);
                      var6 = b.field_i;
                      if (var6 == null) {
                        hi.field_g = b.field_k;
                        eg.a(((qg) this).f(param3), (byte) 126);
                        return param2;
                      } else {
                        if (!(var6.field_m instanceof s)) {
                          b.field_i = null;
                          hi.field_g = b.field_k;
                          eg.a(((qg) this).f(param3), (byte) 126);
                          return param2;
                        } else {
                          ((s) (Object) var6.field_m).a((g) null, 2089, var6);
                          b.field_i = null;
                          hi.field_g = b.field_k;
                          eg.a(((qg) this).f(param3), (byte) 126);
                          return param2;
                        }
                      }
                    } else {
                      hi.field_g = b.field_k;
                      eg.a(((qg) this).f(param3), (byte) 126);
                      return param2;
                    }
                  } else {
                    hi.field_g = b.field_k;
                    eg.a(((qg) this).f(param3), (byte) 126);
                    return param2;
                  }
                }
              }
            }
          }
          L4: {
            if (tg.field_d == 0) {
              break L4;
            } else {
              L5: {
                if (((qg) this).b(ol.field_b, tg.field_d, (qg) this, param1, -30386, nk.field_c, param0)) {
                  break L5;
                } else {
                  if (var5 != 0) {
                    ((qg) this).e(-29113);
                    if (var7 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  } else {
                    L6: {
                      if (b.field_k != 0) {
                        break L6;
                      } else {
                        if (hi.field_g == 0) {
                          break L6;
                        } else {
                          ((qg) this).a(param0, oa.field_j, (qg) this, -1, bk.field_a, param1);
                          var6 = b.field_i;
                          if (var6 == null) {
                            break L6;
                          } else {
                            if (!(var6.field_m instanceof s)) {
                              b.field_i = null;
                              hi.field_g = b.field_k;
                              eg.a(((qg) this).f(param3), (byte) 126);
                              return param2;
                            } else {
                              ((s) (Object) var6.field_m).a((g) null, 2089, var6);
                              b.field_i = null;
                              hi.field_g = b.field_k;
                              eg.a(((qg) this).f(param3), (byte) 126);
                              return param2;
                            }
                          }
                        }
                      }
                    }
                    hi.field_g = b.field_k;
                    eg.a(((qg) this).f(param3), (byte) 126);
                    return param2;
                  }
                }
              }
              param2 = false;
              break L4;
            }
          }
          L7: {
            if (b.field_k != 0) {
              break L7;
            } else {
              if (hi.field_g == 0) {
                break L7;
              } else {
                ((qg) this).a(param0, oa.field_j, (qg) this, -1, bk.field_a, param1);
                var6 = b.field_i;
                if (var6 == null) {
                  break L7;
                } else {
                  if (!(var6.field_m instanceof s)) {
                    b.field_i = null;
                    hi.field_g = b.field_k;
                    eg.a(((qg) this).f(param3), (byte) 126);
                    return param2;
                  } else {
                    ((s) (Object) var6.field_m).a((g) null, 2089, var6);
                    b.field_i = null;
                    hi.field_g = b.field_k;
                    eg.a(((qg) this).f(param3), (byte) 126);
                    return param2;
                  }
                }
              }
            }
          }
          hi.field_g = b.field_k;
          eg.a(((qg) this).f(param3), (byte) 126);
          return param2;
        } else {
          return false;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        var6 = Transmogrify.field_A ? 1 : 0;
        var4 = ((qg) this).g(-64);
        if (param1 >= -13) {
          return;
        } else {
          var5_int = 0;
          L0: while (true) {
            L1: {
              if (var5_int > var4) {
                break L1;
              } else {
                ((qg) this).a(param2, param0, var5_int, (byte) 123);
                var5_int++;
                if (var6 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              var5 = ra.a((byte) 113);
              if (var5 != null) {
                vi.field_e.a(og.field_e, 60, var5, qi.field_d);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          }
        }
    }

    protected qg() {
        ((qg) this).field_r = 0;
        ((qg) this).field_o = 0;
    }

    qg(String param0, ui param1, ma param2) {
        m var4 = null;
        RuntimeException var4_ref = null;
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
        ((qg) this).field_r = 0;
        ((qg) this).field_o = 0;
        try {
          L0: {
            ((qg) this).field_m = param2;
            ((qg) this).field_q = param1;
            ((qg) this).field_k = param0;
            if (!(((qg) this).field_q instanceof m)) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4 = (m) (Object) ((qg) this).field_q;
              ((qg) this).field_l = var4.a(-1, (qg) this);
              ((qg) this).field_h = var4.b((qg) this, 228);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref;
            stackOut_4_1 = new StringBuilder().append("qg.<init>(");
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
          L2: {
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
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
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
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    qg(int param0, int param1, int param2, int param3, ui param4, ma param5) {
        ((qg) this).field_r = 0;
        ((qg) this).field_o = 0;
        try {
            ((qg) this).field_n = param1;
            ((qg) this).field_l = param2;
            ((qg) this).field_q = param4;
            ((qg) this).field_h = param3;
            ((qg) this).field_m = param5;
            ((qg) this).field_p = param0;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "qg.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
