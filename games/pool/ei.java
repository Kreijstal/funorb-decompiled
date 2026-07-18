/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

class ei extends ma {
    int field_D;
    int field_v;
    static vh field_A;
    int field_l;
    int field_y;
    fp field_z;
    boolean field_s;
    static int field_u;
    int field_r;
    static int field_o;
    String field_m;
    String field_p;
    op field_x;
    static java.math.BigInteger field_q;
    int field_n;
    int field_C;
    static int field_B;
    cc field_t;
    static String field_E;
    static String field_w;

    ei(String param0, cc param1) {
        this(param0, db.field_Sb.field_c, param1);
    }

    void a(ei param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
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
            if (param1 == 958) {
              L1: {
                var5_int = ((ei) this).a(param2, param3, wn.field_i, param1 + -959, gg.field_f) ? 1 : 0;
                if (var5_int != (((ei) this).field_s ? 1 : 0)) {
                  L2: {
                    stackOut_4_0 = this;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (var5_int == 0) {
                      stackOut_6_0 = this;
                      stackOut_6_1 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      break L2;
                    } else {
                      stackOut_5_0 = this;
                      stackOut_5_1 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      break L2;
                    }
                  }
                  ((ei) this).field_s = stackIn_7_1 != 0;
                  if (null == ((ei) this).field_t) {
                    break L1;
                  } else {
                    if (((ei) this).field_t instanceof qj) {
                      ((qj) (Object) ((ei) this).field_t).a(var5_int != 0, (ei) this, -101);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
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
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("ei.S(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void c(byte param0) {
        field_q = null;
        field_A = null;
        if (param0 != 80) {
            return;
        }
        field_E = null;
        field_w = null;
    }

    boolean a(ei param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        RuntimeException var8 = null;
        Object var9 = null;
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
            L1: {
              if (param4 <= -126) {
                break L1;
              } else {
                var9 = null;
                ((ei) this).a((ei) null, 51, 64, -111);
                break L1;
              }
            }
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var8;
            stackOut_4_1 = new StringBuilder().append("ei.WA(");
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
          throw wm.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_3_0 != 0;
    }

    boolean a(ei param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
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
            var3_int = 44 / ((param1 - -43) / 47);
            stackOut_0_0 = 0;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("ei.M(");
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
          throw wm.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0 != 0;
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
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
            if (null == field_E) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              L1: {
                if (param0 == -71) {
                  break L1;
                } else {
                  field_A = null;
                  break L1;
                }
              }
              L2: {
                if (param1.toLowerCase().indexOf(field_E.toLowerCase()) < 0) {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  break L2;
                } else {
                  stackOut_7_0 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2;
            stackOut_10_1 = new StringBuilder().append("ei.FB(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
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
          throw wm.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_9_0 != 0;
    }

    int c(int param0) {
        if (param0 < 33) {
            String discarded$0 = ((ei) this).e(-86);
            return 0;
        }
        return 0;
    }

    StringBuilder a(StringBuilder param0, int param1, Hashtable param2, int param3) {
        RuntimeException var5 = null;
        Object stackIn_4_0 = null;
        StringBuilder stackIn_6_0 = null;
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
        StringBuilder stackOut_5_0 = null;
        Object stackOut_3_0 = null;
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
              if (!((ei) this).b(param1, param2, param0, -1)) {
                break L1;
              } else {
                ((ei) this).a(1, param2, param0, param1);
                break L1;
              }
            }
            if (param3 > 13) {
              stackOut_5_0 = (StringBuilder) param0;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (StringBuilder) (Object) stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("ei.EA(");
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
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',');
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
          throw wm.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    boolean a(char param0, int param1, boolean param2, ei param3) {
        RuntimeException var5 = null;
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
            if (!param2) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              field_o = 14;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("ei.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param3 == null) {
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
          throw wm.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final boolean a(int param0, int param1, char param2) {
        int var4 = 0;
        if (param0 == -81) {
          if (((ei) this).d(param0 + -11)) {
            if (!((ei) this).a(param2, param1, false, (ei) this)) {
              var4 = param1;
              if (var4 == 80) {
                return ((ei) this).a((ei) this, (byte) -103);
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            var4 = param1;
            if (var4 == 80) {
              return ((ei) this).a((ei) this, (byte) -103);
            } else {
              return false;
            }
          }
        } else {
          ((ei) this).field_s = true;
          if (((ei) this).d(param0 + -11)) {
            if (!((ei) this).a(param2, param1, false, (ei) this)) {
              var4 = param1;
              if (var4 == 80) {
                return ((ei) this).a((ei) this, (byte) -103);
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            var4 = param1;
            if (var4 == 80) {
              return ((ei) this).a((ei) this, (byte) -103);
            } else {
              return false;
            }
          }
        }
    }

    void a(int param0, int param1, int param2, boolean param3, int param4) {
        ((ei) this).field_D = param4;
        if (param3) {
          boolean discarded$2 = ((ei) this).d(43);
          ((ei) this).field_l = param0;
          ((ei) this).field_C = param1;
          ((ei) this).field_y = param2;
          return;
        } else {
          ((ei) this).field_l = param0;
          ((ei) this).field_C = param1;
          ((ei) this).field_y = param2;
          return;
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4) {
        Object var7 = null;
        int stackIn_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_17_0 = 0;
        if (param3 == -1) {
          if (param0 - -((ei) this).field_C <= param2) {
            if (param4 < ((ei) this).field_D + param1) {
              return false;
            } else {
              L0: {
                L1: {
                  if (((ei) this).field_C + param0 + ((ei) this).field_l <= param2) {
                    break L1;
                  } else {
                    if (param4 >= ((ei) this).field_y + ((ei) this).field_D + param1) {
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
          var7 = null;
          boolean discarded$1 = ((ei) this).a((ei) null, 25, false, 45, 66, -10, 22);
          if (param0 - -((ei) this).field_C <= param2) {
            if (param4 >= ((ei) this).field_D + param1) {
              if (((ei) this).field_C + param0 + ((ei) this).field_l > param2) {
                if (param4 >= ((ei) this).field_y + ((ei) this).field_D + param1) {
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

    final static dd[] a(byte param0, int param1) {
        dd[] var2 = null;
        Object var3 = null;
        dd[] var4 = null;
        var4 = new dd[9];
        var2 = var4;
        if (param0 <= 4) {
          var3 = null;
          boolean discarded$6 = ei.a((byte) 3, (String) null);
          int discarded$7 = 7;
          var4[4] = ad.a(param1, 64);
          return var2;
        } else {
          int discarded$8 = 7;
          var4[4] = ad.a(param1, 64);
          return var2;
        }
    }

    final void a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              StringBuilder discarded$8 = param2.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(((ei) this).field_C).append(",").append(((ei) this).field_D).append(" ").append(((ei) this).field_l).append("x").append(((ei) this).field_y);
              if (null == ((ei) this).field_m) {
                break L1;
              } else {
                StringBuilder discarded$9 = param2.append(" text=\"").append(((ei) this).field_m).append('"');
                break L1;
              }
            }
            L2: {
              if (!((ei) this).field_s) {
                break L2;
              } else {
                StringBuilder discarded$10 = param2.append(" mouseover");
                break L2;
              }
            }
            L3: {
              if (!((ei) this).d(123)) {
                break L3;
              } else {
                StringBuilder discarded$11 = param2.append(" focused");
                break L3;
              }
            }
            L4: {
              if (param0 == 1) {
                break L4;
              } else {
                ((ei) this).field_y = -51;
                break L4;
              }
            }
            L5: {
              if (((ei) this).field_z != null) {
                StringBuilder discarded$12 = param2.append(" renderer=");
                if (!(((ei) this).field_z instanceof ei)) {
                  StringBuilder discarded$13 = param2.append((Object) (Object) ((ei) this).field_z);
                  break L5;
                } else {
                  param2 = ((ei) this).a(param2, param3 + 1, param1, 25);
                  break L5;
                }
              } else {
                break L5;
              }
            }
            L6: {
              if (((ei) this).field_t != null) {
                StringBuilder discarded$14 = param2.append(" listener=");
                if (!(((ei) this).field_t instanceof ei)) {
                  StringBuilder discarded$15 = param2.append((Object) (Object) ((ei) this).field_t);
                  break L6;
                } else {
                  param2 = ((ei) this).a(param2, param3 - -1, param1, 75);
                  break L6;
                }
              } else {
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var5;
            stackOut_19_1 = new StringBuilder().append("ei.LB(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          L8: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
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
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param3 + ')');
        }
    }

    boolean d(int param0) {
        int var2 = 101 % ((7 - param0) / 48);
        return false;
    }

    final boolean a(int param0, int param1, boolean param2, int param3) {
        int var5 = 0;
        wj var6 = null;
        ((ei) this).a((ei) this, 958, param1, param3);
        if (param0 > -118) {
          L0: {
            ei.c((byte) 17);
            var5 = ((ei) this).d(85) ? 1 : 0;
            if (!param2) {
              if (var5 == 0) {
                break L0;
              } else {
                if (0 == ne.field_s) {
                  break L0;
                } else {
                  ((ei) this).d((byte) 99);
                  sa.field_t = cd.field_b;
                  ue.a((byte) 70, ((ei) this).e(-94));
                  return param2;
                }
              }
            } else {
              if (wp.field_d != 0) {
                if (var5 == 0) {
                  L1: {
                    if (ne.field_s == 0) {
                      break L1;
                    } else {
                      if (((ei) this).a((ei) this, param1, true, ne.field_s, ua.field_o, param3, lq.field_W)) {
                        param2 = false;
                        break L1;
                      } else {
                        if (var5 != 0) {
                          L2: {
                            ((ei) this).d((byte) 99);
                            if (cd.field_b != 0) {
                              break L2;
                            } else {
                              if (sa.field_t == 0) {
                                break L2;
                              } else {
                                ((ei) this).a(param1, wn.field_i, param3, gg.field_f, (byte) 105, (ei) this);
                                var6 = uh.field_u;
                                if (var6 != null) {
                                  if (!(var6.field_t instanceof jm)) {
                                    uh.field_u = null;
                                    sa.field_t = cd.field_b;
                                    ue.a((byte) 70, ((ei) this).e(-94));
                                    return param2;
                                  } else {
                                    ((jm) (Object) var6.field_t).a(-87, (k) null, var6);
                                    uh.field_u = null;
                                    sa.field_t = cd.field_b;
                                    ue.a((byte) 70, ((ei) this).e(-94));
                                    return param2;
                                  }
                                } else {
                                  sa.field_t = cd.field_b;
                                  ue.a((byte) 70, ((ei) this).e(-94));
                                  return param2;
                                }
                              }
                            }
                          }
                          sa.field_t = cd.field_b;
                          ue.a((byte) 70, ((ei) this).e(-94));
                          return param2;
                        } else {
                          if (cd.field_b == 0) {
                            if (sa.field_t != 0) {
                              ((ei) this).a(param1, wn.field_i, param3, gg.field_f, (byte) 105, (ei) this);
                              var6 = uh.field_u;
                              if (var6 != null) {
                                if (!(var6.field_t instanceof jm)) {
                                  uh.field_u = null;
                                  sa.field_t = cd.field_b;
                                  ue.a((byte) 70, ((ei) this).e(-94));
                                  return param2;
                                } else {
                                  ((jm) (Object) var6.field_t).a(-87, (k) null, var6);
                                  uh.field_u = null;
                                  sa.field_t = cd.field_b;
                                  ue.a((byte) 70, ((ei) this).e(-94));
                                  return param2;
                                }
                              } else {
                                sa.field_t = cd.field_b;
                                ue.a((byte) 70, ((ei) this).e(-94));
                                return param2;
                              }
                            } else {
                              sa.field_t = cd.field_b;
                              ue.a((byte) 70, ((ei) this).e(-94));
                              return param2;
                            }
                          } else {
                            sa.field_t = cd.field_b;
                            ue.a((byte) 70, ((ei) this).e(-94));
                            return param2;
                          }
                        }
                      }
                    }
                  }
                  if (cd.field_b != 0) {
                    break L0;
                  } else {
                    if (sa.field_t == 0) {
                      break L0;
                    } else {
                      ((ei) this).a(param1, wn.field_i, param3, gg.field_f, (byte) 105, (ei) this);
                      var6 = uh.field_u;
                      if (var6 != null) {
                        if (!(var6.field_t instanceof jm)) {
                          uh.field_u = null;
                          sa.field_t = cd.field_b;
                          ue.a((byte) 70, ((ei) this).e(-94));
                          return param2;
                        } else {
                          ((jm) (Object) var6.field_t).a(-87, (k) null, var6);
                          uh.field_u = null;
                          sa.field_t = cd.field_b;
                          ue.a((byte) 70, ((ei) this).e(-94));
                          return param2;
                        }
                      } else {
                        sa.field_t = cd.field_b;
                        ue.a((byte) 70, ((ei) this).e(-94));
                        return param2;
                      }
                    }
                  }
                } else {
                  L3: {
                    boolean discarded$2 = ((ei) this).a((ei) this, wn.field_i, wp.field_d, param3, (byte) -127, gg.field_f, param1);
                    if (ne.field_s == 0) {
                      break L3;
                    } else {
                      if (((ei) this).a((ei) this, param1, true, ne.field_s, ua.field_o, param3, lq.field_W)) {
                        param2 = false;
                        break L3;
                      } else {
                        if (var5 != 0) {
                          ((ei) this).d((byte) 99);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    if (cd.field_b != 0) {
                      break L4;
                    } else {
                      if (sa.field_t == 0) {
                        break L4;
                      } else {
                        ((ei) this).a(param1, wn.field_i, param3, gg.field_f, (byte) 105, (ei) this);
                        var6 = uh.field_u;
                        if (var6 != null) {
                          if (!(var6.field_t instanceof jm)) {
                            uh.field_u = null;
                            sa.field_t = cd.field_b;
                            ue.a((byte) 70, ((ei) this).e(-94));
                            return param2;
                          } else {
                            ((jm) (Object) var6.field_t).a(-87, (k) null, var6);
                            uh.field_u = null;
                            sa.field_t = cd.field_b;
                            ue.a((byte) 70, ((ei) this).e(-94));
                            return param2;
                          }
                        } else {
                          sa.field_t = cd.field_b;
                          ue.a((byte) 70, ((ei) this).e(-94));
                          return param2;
                        }
                      }
                    }
                  }
                  sa.field_t = cd.field_b;
                  ue.a((byte) 70, ((ei) this).e(-94));
                  return param2;
                }
              } else {
                L5: {
                  if (ne.field_s == 0) {
                    break L5;
                  } else {
                    if (((ei) this).a((ei) this, param1, true, ne.field_s, ua.field_o, param3, lq.field_W)) {
                      param2 = false;
                      break L5;
                    } else {
                      if (var5 != 0) {
                        L6: {
                          ((ei) this).d((byte) 99);
                          if (cd.field_b != 0) {
                            break L6;
                          } else {
                            if (sa.field_t == 0) {
                              break L6;
                            } else {
                              ((ei) this).a(param1, wn.field_i, param3, gg.field_f, (byte) 105, (ei) this);
                              var6 = uh.field_u;
                              if (var6 != null) {
                                if (!(var6.field_t instanceof jm)) {
                                  uh.field_u = null;
                                  break L6;
                                } else {
                                  ((jm) (Object) var6.field_t).a(-87, (k) null, var6);
                                  uh.field_u = null;
                                  break L6;
                                }
                              } else {
                                sa.field_t = cd.field_b;
                                ue.a((byte) 70, ((ei) this).e(-94));
                                return param2;
                              }
                            }
                          }
                        }
                        sa.field_t = cd.field_b;
                        ue.a((byte) 70, ((ei) this).e(-94));
                        return param2;
                      } else {
                        L7: {
                          if (cd.field_b != 0) {
                            break L7;
                          } else {
                            if (sa.field_t == 0) {
                              break L7;
                            } else {
                              ((ei) this).a(param1, wn.field_i, param3, gg.field_f, (byte) 105, (ei) this);
                              var6 = uh.field_u;
                              if (var6 != null) {
                                if (!(var6.field_t instanceof jm)) {
                                  uh.field_u = null;
                                  break L7;
                                } else {
                                  ((jm) (Object) var6.field_t).a(-87, (k) null, var6);
                                  uh.field_u = null;
                                  break L7;
                                }
                              } else {
                                sa.field_t = cd.field_b;
                                ue.a((byte) 70, ((ei) this).e(-94));
                                return param2;
                              }
                            }
                          }
                        }
                        sa.field_t = cd.field_b;
                        ue.a((byte) 70, ((ei) this).e(-94));
                        return param2;
                      }
                    }
                  }
                }
                L8: {
                  if (cd.field_b != 0) {
                    break L8;
                  } else {
                    if (sa.field_t == 0) {
                      break L8;
                    } else {
                      ((ei) this).a(param1, wn.field_i, param3, gg.field_f, (byte) 105, (ei) this);
                      var6 = uh.field_u;
                      if (var6 != null) {
                        if (!(var6.field_t instanceof jm)) {
                          uh.field_u = null;
                          sa.field_t = cd.field_b;
                          ue.a((byte) 70, ((ei) this).e(-94));
                          return param2;
                        } else {
                          ((jm) (Object) var6.field_t).a(-87, (k) null, var6);
                          uh.field_u = null;
                          sa.field_t = cd.field_b;
                          ue.a((byte) 70, ((ei) this).e(-94));
                          return param2;
                        }
                      } else {
                        sa.field_t = cd.field_b;
                        ue.a((byte) 70, ((ei) this).e(-94));
                        return param2;
                      }
                    }
                  }
                }
                sa.field_t = cd.field_b;
                ue.a((byte) 70, ((ei) this).e(-94));
                return param2;
              }
            }
          }
          sa.field_t = cd.field_b;
          ue.a((byte) 70, ((ei) this).e(-94));
          return param2;
        } else {
          L9: {
            var5 = ((ei) this).d(85) ? 1 : 0;
            if (!param2) {
              if (var5 == 0) {
                break L9;
              } else {
                if (0 == ne.field_s) {
                  break L9;
                } else {
                  ((ei) this).d((byte) 99);
                  sa.field_t = cd.field_b;
                  ue.a((byte) 70, ((ei) this).e(-94));
                  return param2;
                }
              }
            } else {
              L10: {
                if (wp.field_d == 0) {
                  break L10;
                } else {
                  if (var5 == 0) {
                    break L10;
                  } else {
                    L11: {
                      boolean discarded$3 = ((ei) this).a((ei) this, wn.field_i, wp.field_d, param3, (byte) -127, gg.field_f, param1);
                      if (ne.field_s == 0) {
                        break L11;
                      } else {
                        if (((ei) this).a((ei) this, param1, true, ne.field_s, ua.field_o, param3, lq.field_W)) {
                          param2 = false;
                          break L11;
                        } else {
                          if (var5 != 0) {
                            ((ei) this).d((byte) 99);
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    L12: {
                      if (cd.field_b != 0) {
                        break L12;
                      } else {
                        if (sa.field_t == 0) {
                          break L12;
                        } else {
                          ((ei) this).a(param1, wn.field_i, param3, gg.field_f, (byte) 105, (ei) this);
                          var6 = uh.field_u;
                          if (var6 != null) {
                            if (!(var6.field_t instanceof jm)) {
                              uh.field_u = null;
                              break L12;
                            } else {
                              ((jm) (Object) var6.field_t).a(-87, (k) null, var6);
                              uh.field_u = null;
                              break L12;
                            }
                          } else {
                            sa.field_t = cd.field_b;
                            ue.a((byte) 70, ((ei) this).e(-94));
                            return param2;
                          }
                        }
                      }
                    }
                    sa.field_t = cd.field_b;
                    ue.a((byte) 70, ((ei) this).e(-94));
                    return param2;
                  }
                }
              }
              L13: {
                if (ne.field_s == 0) {
                  break L13;
                } else {
                  if (((ei) this).a((ei) this, param1, true, ne.field_s, ua.field_o, param3, lq.field_W)) {
                    param2 = false;
                    break L13;
                  } else {
                    if (var5 != 0) {
                      L14: {
                        ((ei) this).d((byte) 99);
                        if (cd.field_b != 0) {
                          break L14;
                        } else {
                          if (sa.field_t == 0) {
                            break L14;
                          } else {
                            ((ei) this).a(param1, wn.field_i, param3, gg.field_f, (byte) 105, (ei) this);
                            var6 = uh.field_u;
                            if (var6 != null) {
                              if (!(var6.field_t instanceof jm)) {
                                uh.field_u = null;
                                break L14;
                              } else {
                                ((jm) (Object) var6.field_t).a(-87, (k) null, var6);
                                uh.field_u = null;
                                break L14;
                              }
                            } else {
                              sa.field_t = cd.field_b;
                              ue.a((byte) 70, ((ei) this).e(-94));
                              return param2;
                            }
                          }
                        }
                      }
                      sa.field_t = cd.field_b;
                      ue.a((byte) 70, ((ei) this).e(-94));
                      return param2;
                    } else {
                      L15: {
                        if (cd.field_b != 0) {
                          break L15;
                        } else {
                          if (sa.field_t == 0) {
                            break L15;
                          } else {
                            ((ei) this).a(param1, wn.field_i, param3, gg.field_f, (byte) 105, (ei) this);
                            var6 = uh.field_u;
                            if (var6 != null) {
                              if (!(var6.field_t instanceof jm)) {
                                uh.field_u = null;
                                break L15;
                              } else {
                                ((jm) (Object) var6.field_t).a(-87, (k) null, var6);
                                uh.field_u = null;
                                break L15;
                              }
                            } else {
                              sa.field_t = cd.field_b;
                              ue.a((byte) 70, ((ei) this).e(-94));
                              return param2;
                            }
                          }
                        }
                      }
                      sa.field_t = cd.field_b;
                      ue.a((byte) 70, ((ei) this).e(-94));
                      return param2;
                    }
                  }
                }
              }
              if (cd.field_b != 0) {
                break L9;
              } else {
                if (sa.field_t == 0) {
                  break L9;
                } else {
                  ((ei) this).a(param1, wn.field_i, param3, gg.field_f, (byte) 105, (ei) this);
                  var6 = uh.field_u;
                  if (var6 != null) {
                    if (!(var6.field_t instanceof jm)) {
                      uh.field_u = null;
                      sa.field_t = cd.field_b;
                      ue.a((byte) 70, ((ei) this).e(-94));
                      return param2;
                    } else {
                      ((jm) (Object) var6.field_t).a(-87, (k) null, var6);
                      uh.field_u = null;
                      sa.field_t = cd.field_b;
                      ue.a((byte) 70, ((ei) this).e(-94));
                      return param2;
                    }
                  } else {
                    sa.field_t = cd.field_b;
                    ue.a((byte) 70, ((ei) this).e(-94));
                    return param2;
                  }
                }
              }
            }
          }
          sa.field_t = cd.field_b;
          ue.a((byte) 70, ((ei) this).e(-94));
          return param2;
        }
    }

    boolean a(ei param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
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
        try {
          L0: {
            L1: {
              if (!((ei) this).a(param1, param5, param6, -1, param4)) {
                break L1;
              } else {
                ((ei) this).field_n = param3;
                break L1;
              }
            }
            if (param2) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var8;
            stackOut_7_1 = new StringBuilder().append("ei.AA(");
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
          throw wm.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_6_0 != 0;
    }

    String e(int param0) {
        String stackIn_4_0 = null;
        String stackIn_8_0 = null;
        String stackOut_7_0 = null;
        Object stackOut_6_0 = null;
        String stackOut_3_0 = null;
        Object stackOut_2_0 = null;
        if (param0 > -10) {
          L0: {
            int discarded$10 = ((ei) this).c(-28);
            if (((ei) this).field_s) {
              stackOut_7_0 = ((ei) this).field_p;
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
            if (((ei) this).field_s) {
              stackOut_3_0 = ((ei) this).field_p;
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

    public final String toString() {
        return ((ei) this).a(new StringBuilder(), 0, new Hashtable(), 99).toString();
    }

    void a(int param0, int param1, int param2, int param3, byte param4, ei param5) {
        try {
            if (param4 < 62) {
                boolean discarded$0 = ((ei) this).a(-128, 68, 'ﾮ');
            }
            ((ei) this).field_n = 0;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "ei.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean b(int param0, Hashtable param1, StringBuilder param2, int param3) {
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
              if (param3 == -1) {
                break L1;
              } else {
                boolean discarded$6 = ((ei) this).a(84, -105, '￈');
                break L1;
              }
            }
            if (param1.containsKey(this)) {
              StringBuilder discarded$7 = param2.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              Object discarded$8 = param1.put(this, this);
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("ei.MB(").append(param0).append(',');
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
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
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
          throw wm.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_6_0 != 0;
    }

    final void a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        var4 = ((ei) this).c(66);
        var5_int = 0;
        L0: while (true) {
          if (var4 < var5_int) {
            if (param1 >= 73) {
              var5 = jd.a(9383);
              if (var5 != null) {
                db.field_Sb.a((byte) -52, ne.field_n, id.field_b, var5);
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            ((ei) this).a(var5_int, (byte) -118, param0, param2);
            var5_int++;
            continue L0;
          }
        }
    }

    void a(int param0, byte param1, int param2, int param3) {
        int var5 = 0;
        if (param0 == 0) {
          if (null == ((ei) this).field_z) {
            var5 = -117 / ((-42 - param1) / 53);
            return;
          } else {
            ((ei) this).field_z.a(true, param2, (byte) 71, param3, (ei) this);
            var5 = -117 / ((-42 - param1) / 53);
            return;
          }
        } else {
          var5 = -117 / ((-42 - param1) / 53);
          return;
        }
    }

    final void e(byte param0) {
        if (param0 > -64) {
          field_o = -58;
          ((ei) this).a(((ei) this).field_l, ((ei) this).field_C, ((ei) this).field_y, false, ((ei) this).field_D);
          return;
        } else {
          ((ei) this).a(((ei) this).field_l, ((ei) this).field_C, ((ei) this).field_y, false, ((ei) this).field_D);
          return;
        }
    }

    void d(byte param0) {
        if (param0 != 99) {
            Object var3 = null;
            boolean discarded$0 = ((ei) this).a((ei) null, -125, false, 30, 62, -88, -86);
        }
    }

    protected ei() {
        ((ei) this).field_v = 0;
        ((ei) this).field_r = 0;
    }

    ei(String param0, fp param1, cc param2) {
        RuntimeException runtimeException = null;
        io var4 = null;
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
        ((ei) this).field_v = 0;
        ((ei) this).field_r = 0;
        try {
          L0: {
            L1: {
              ((ei) this).field_t = param2;
              ((ei) this).field_z = param1;
              ((ei) this).field_m = param0;
              if (!(((ei) this).field_z instanceof io)) {
                break L1;
              } else {
                var4 = (io) (Object) ((ei) this).field_z;
                ((ei) this).field_l = var4.a((ei) this, -1848150943);
                ((ei) this).field_y = var4.a(1, (ei) this);
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
            stackOut_4_1 = new StringBuilder().append("ei.<init>(");
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
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
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
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
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
          throw wm.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    ei(int param0, int param1, int param2, int param3, fp param4, cc param5) {
        ((ei) this).field_v = 0;
        ((ei) this).field_r = 0;
        try {
            ((ei) this).field_y = param3;
            ((ei) this).field_D = param1;
            ((ei) this).field_t = param5;
            ((ei) this).field_C = param0;
            ((ei) this).field_z = param4;
            ((ei) this).field_l = param2;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "ei.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 500;
        field_u = 0;
        field_q = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_w = "You are on <%0>";
    }
}
