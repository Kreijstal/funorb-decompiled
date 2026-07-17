/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class rc extends gg {
    int field_t;
    static kb field_o;
    String field_z;
    dg field_n;
    int field_j;
    String field_i;
    jf field_h;
    int field_k;
    boolean field_v;
    int field_q;
    int field_u;
    static int field_l;
    static String field_s;
    int field_m;
    j field_w;
    static String field_p;
    static String field_y;
    int field_x;
    static java.awt.Image field_r;

    boolean a(int param0, rc param1, int param2, int param3, int param4, int param5, byte param6) {
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
            if (param6 > 33) {
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
            var8 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var8;
            stackOut_5_1 = new StringBuilder().append("rc.LA(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
          throw fc.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_4_0 != 0;
    }

    void a(int param0, int param1, int param2, rc param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
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
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
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
            var5_int = ((rc) this).a(ad.field_m, gb.field_j, param0, param2, param1 + -18970) ? 1 : 0;
            if (param1 == 18874) {
              L1: {
                stackOut_2_0 = var5_int;
                stackIn_4_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (((rc) this).field_v) {
                  stackOut_4_0 = stackIn_4_0;
                  stackOut_4_1 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  break L1;
                } else {
                  stackOut_3_0 = stackIn_3_0;
                  stackOut_3_1 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  break L1;
                }
              }
              L2: {
                if (stackIn_5_0 != stackIn_5_1) {
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
                  ((rc) this).field_v = stackIn_9_1 != 0;
                  if (null == ((rc) this).field_n) {
                    break L2;
                  } else {
                    if (((rc) this).field_n instanceof mk) {
                      ((mk) (Object) ((rc) this).field_n).a((rc) this, (byte) -121, var5_int != 0);
                      break L2;
                    } else {
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
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("rc.JA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
    }

    public static void e(int param0) {
        field_y = null;
        field_r = null;
        if (param0 != -24922) {
            rc.a(32, 42, -124, -105, (o) null, -64, 78, (byte) 43);
        }
        field_p = null;
        field_s = null;
        field_o = null;
    }

    final void b(StringBuilder param0, int param1, Hashtable param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var6 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              StringBuilder discarded$8 = param0.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(((rc) this).field_m).append(",").append(((rc) this).field_j).append(" ").append(((rc) this).field_t).append("x").append(((rc) this).field_x);
              if (null != ((rc) this).field_i) {
                StringBuilder discarded$9 = param0.append(" text=\"").append(((rc) this).field_i).append(34);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((rc) this).field_v) {
                StringBuilder discarded$10 = param0.append(" mouseover");
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (((rc) this).b(true)) {
                StringBuilder discarded$11 = param0.append(" focused");
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (((rc) this).field_w != null) {
                StringBuilder discarded$12 = param0.append(" renderer=");
                if (((rc) this).field_w instanceof rc) {
                  param0 = ((rc) this).a(-100, param2, param0, 1 + param3);
                  break L4;
                } else {
                  StringBuilder discarded$13 = param0.append(((rc) this).field_w);
                  break L4;
                }
              } else {
                break L4;
              }
            }
            L5: {
              if (((rc) this).field_n == null) {
                break L5;
              } else {
                StringBuilder discarded$14 = param0.append(" listener=");
                if (((rc) this).field_n instanceof rc) {
                  param0 = ((rc) this).a(-57, param2, param0, 1 + param3);
                  break L5;
                } else {
                  StringBuilder discarded$15 = param0.append(((rc) this).field_n);
                  break L5;
                }
              }
            }
            var5_int = 10 / ((param1 - -43) / 58);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5;
            stackOut_21_1 = new StringBuilder().append("rc.DB(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          L7: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44).append(param1).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param3 + 41);
        }
    }

    void a(int param0, int param1, rc param2, int param3, int param4, int param5) {
        try {
            ((rc) this).field_u = param1;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "rc.O(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    boolean a(char param0, byte param1, int param2, rc param3) {
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
            var5_int = 75 / ((param1 - 31) / 56);
            stackOut_0_0 = 0;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5;
            stackOut_2_1 = new StringBuilder().append("rc.C(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param3 == null) {
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
          throw fc.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
        return stackIn_1_0 != 0;
    }

    final static boolean a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
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
              if (param0 > 85) {
                break L1;
              } else {
                boolean discarded$2 = rc.a(-41, (CharSequence) null);
                break L1;
              }
            }
            stackOut_2_0 = wh.a(false, param1, (byte) -123);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("rc.AB(").append(param0).append(44);
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
          throw fc.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    public final String toString() {
        return ((rc) this).a(-43, new Hashtable(), new StringBuilder(), 0).toString();
    }

    boolean b(boolean param0) {
        if (!param0) {
            field_r = null;
            return false;
        }
        return false;
    }

    boolean a(int param0, rc param1) {
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
            if (param0 == -1463) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              ((rc) this).field_w = null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("rc.MA(").append(param0).append(44);
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
          throw fc.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0 != 0;
    }

    final boolean a(int param0, char param1, byte param2) {
        if (((rc) this).b(true)) {
            if (((rc) this).a(param1, (byte) -25, param0, (rc) this)) {
                return true;
            }
        }
        int var4 = param0;
        if (var4 == 80) {
            return ((rc) this).a(-1463, (rc) this);
        }
        var4 = 2 / ((23 - param2) / 52);
        return false;
    }

    final boolean a(int param0, int param1, boolean param2, int param3) {
        int var5 = 0;
        bc var6 = null;
        int var7 = 0;
        L0: {
          var7 = SolKnight.field_L ? 1 : 0;
          if (param0 == -1) {
            break L0;
          } else {
            boolean discarded$3 = ((rc) this).a(118, 41, -10, 127, -68);
            break L0;
          }
        }
        L1: {
          ((rc) this).a(param3, 18874, param1, (rc) this);
          var5 = ((rc) this).b(true) ? 1 : 0;
          if (param2) {
            L2: {
              if (0 == cl.field_n) {
                break L2;
              } else {
                if (var5 == 0) {
                  break L2;
                } else {
                  boolean discarded$4 = ((rc) this).a(param3, (rc) this, param1, gb.field_j, cl.field_n, ad.field_m, (byte) 96);
                  break L2;
                }
              }
            }
            L3: {
              if (hg.field_F == 0) {
                break L3;
              } else {
                if (!((rc) this).a(hg.field_F, param3, false, db.field_o, s.field_gb, param1, (rc) this)) {
                  if (var5 == 0) {
                    break L3;
                  } else {
                    ((rc) this).g(0);
                    break L3;
                  }
                } else {
                  param2 = false;
                  break L3;
                }
              }
            }
            if (wb.field_c != 0) {
              break L1;
            } else {
              if (ne.field_j != 0) {
                ((rc) this).a(ad.field_m, 0, (rc) this, param1, gb.field_j, param3);
                var6 = jf.field_a;
                if (var6 != null) {
                  L4: {
                    if (!(var6.field_n instanceof gk)) {
                      break L4;
                    } else {
                      ((gk) (Object) var6.field_n).a((th) null, -7935, var6);
                      break L4;
                    }
                  }
                  jf.field_a = null;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                ne.field_j = wb.field_c;
                pd.a(125, ((rc) this).c((byte) 78));
                return param2;
              }
            }
          } else {
            if (var5 == 0) {
              break L1;
            } else {
              if (0 != hg.field_F) {
                ((rc) this).g(0);
                break L1;
              } else {
                break L1;
              }
            }
          }
        }
        ne.field_j = wb.field_c;
        pd.a(125, ((rc) this).c((byte) 78));
        return param2;
    }

    void g(int param0) {
        if (param0 != 0) {
            int discarded$0 = ((rc) this).f(36);
        }
    }

    boolean a(int param0, int param1, boolean param2, int param3, int param4, int param5, rc param6) {
        RuntimeException var8 = null;
        int stackIn_2_0 = 0;
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
        int stackOut_1_0 = 0;
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
            if (!param2) {
              if (((rc) this).a(param4, param3, param1, param5, -113)) {
                ((rc) this).field_u = param0;
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                return false;
              }
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
            stackOut_7_0 = (RuntimeException) var8;
            stackOut_7_1 = new StringBuilder().append("rc.S(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param6 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_6_0 != 0;
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param1 == 0) {
            if (null != ((rc) this).field_w) {
                ((rc) this).field_w.a((byte) 124, param0, true, param2, (rc) this);
            }
        }
        if (param3 != 0) {
            ((rc) this).a(-1, 35, -37, -9);
        }
    }

    String c(byte param0) {
        if (param0 <= 14) {
            ((rc) this).field_i = null;
        }
        if (!((rc) this).field_v) {
            return null;
        }
        return ((rc) this).field_z;
    }

    int f(int param0) {
        int var2 = -86 / ((param0 - 17) / 43);
        return 0;
    }

    final void a(int param0, int param1, int param2) {
        int var5_int = 0;
        int var6 = SolKnight.field_L ? 1 : 0;
        if (param0 != 19550) {
            return;
        }
        int var4 = ((rc) this).f(-73);
        for (var5_int = 0; var5_int <= var4; var5_int++) {
            ((rc) this).a(param2, var5_int, param1, 0);
        }
        String var5 = va.a(true);
        if (!(var5 == null)) {
            ph.field_f.a(20, kd.field_c, bf.field_a, var5);
        }
    }

    StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
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
              if (((rc) this).a(param2, -1, param1, param3)) {
                ((rc) this).b(param2, -108, param1, param3);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 < -41) {
                break L2;
              } else {
                ((rc) this).a(38, -79, 40, 69);
                break L2;
              }
            }
            stackOut_5_0 = (StringBuilder) param2;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("rc.GA(").append(param0).append(44);
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
          throw fc.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param3 + 41);
        }
        return stackIn_6_0;
    }

    void b(int param0, int param1, int param2, int param3, int param4) {
        ((rc) this).field_m = param2;
        ((rc) this).field_j = param4;
        ((rc) this).field_t = param1;
        if (param3 != 0) {
            rc.e(-46);
        }
        ((rc) this).field_x = param0;
    }

    final void d(int param0) {
        ((rc) this).b(((rc) this).field_x, ((rc) this).field_t, ((rc) this).field_m, 0, ((rc) this).field_j);
        if (param0 != 1) {
            boolean discarded$0 = ((rc) this).a('�', (byte) -59, 25, (rc) null);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, o param4, int param5, int param6, byte param7) {
        RuntimeException var8 = null;
        o var8_ref = null;
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var19 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (~mi.field_b < ~param1) {
                param0 = param0 - (mi.field_b - param1);
                param1 = mi.field_b;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (~param5 <= ~mi.field_l) {
                break L2;
              } else {
                param2 = param2 - (-param5 + mi.field_l);
                param5 = mi.field_l;
                break L2;
              }
            }
            L3: {
              if (mi.field_k >= param1 - -param0) {
                break L3;
              } else {
                param0 = -param1 + mi.field_k;
                break L3;
              }
            }
            L4: {
              if (~(param2 + param5) >= ~mi.field_e) {
                break L4;
              } else {
                param2 = -param5 + mi.field_e;
                break L4;
              }
            }
            L5: {
              if (param0 <= 0) {
                break L5;
              } else {
                if (0 >= param2) {
                  break L5;
                } else {
                  var8_ref = param4.c();
                  var9 = mi.field_f;
                  var10 = mi.field_a;
                  var11 = mi.field_d;
                  var12 = new int[4];
                  mi.b(var12);
                  param4.a();
                  mi.d(var12[0], var12[1], var12[2], var12[3]);
                  var13 = param4.field_p * param5 + param1;
                  var14 = -param0 + param4.field_p;
                  var15 = var8_ref.field_v;
                  field_p = null;
                  var16 = param5;
                  L6: while (true) {
                    if (param2 + param5 <= var16) {
                      var8_ref.d(-param4.field_s, -param4.field_n);
                      mi.a(var9, var10, var11);
                      mi.a(var12);
                      break L0;
                    } else {
                      var17 = param1;
                      L7: while (true) {
                        if (param0 + param1 <= var17) {
                          var13 = var13 + var14;
                          var16++;
                          continue L6;
                        } else {
                          L8: {
                            var18 = var15[var13];
                            if (var18 == 0) {
                              break L8;
                            } else {
                              L9: {
                                L10: {
                                  if (var17 <= 0) {
                                    break L10;
                                  } else {
                                    if (var15[-1 + var13] == 0) {
                                      break L9;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                L11: {
                                  if (var16 <= 0) {
                                    break L11;
                                  } else {
                                    if (var15[var13 + -param4.field_p] == 0) {
                                      break L9;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                L12: {
                                  if (var17 >= -1 + param4.field_p) {
                                    break L12;
                                  } else {
                                    if (var15[1 + var13] == 0) {
                                      break L9;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                if (var16 >= param4.field_t - 1) {
                                  break L8;
                                } else {
                                  if (var15[param4.field_p + var13] == 0) {
                                    break L9;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              mi.e(var17, var16, param3, param6);
                              break L8;
                            }
                          }
                          var13++;
                          var17++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var8 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var8;
            stackOut_36_1 = new StringBuilder().append("rc.TA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param4 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L13;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L13;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + 44 + param5 + 44 + param6 + 44 + 43 + 41);
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        if (param4 < -52) {
          L0: {
            L1: {
              if (((rc) this).field_m + param2 > param1) {
                break L1;
              } else {
                if (param0 < ((rc) this).field_j + param3) {
                  break L1;
                } else {
                  if (((rc) this).field_t + ((rc) this).field_m + param2 <= param1) {
                    break L1;
                  } else {
                    if (param0 >= ((rc) this).field_x + (param3 - -((rc) this).field_j)) {
                      break L1;
                    } else {
                      stackOut_6_0 = 1;
                      stackIn_8_0 = stackOut_6_0;
                      break L0;
                    }
                  }
                }
              }
            }
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return true;
        }
    }

    rc(String param0, dg param1) {
        this(param0, ph.field_f.field_a, param1);
    }

    final boolean a(StringBuilder param0, int param1, Hashtable param2, int param3) {
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
              if (param1 == -1) {
                break L1;
              } else {
                boolean discarded$6 = ((rc) this).a(37, (rc) null);
                break L1;
              }
            }
            if (param2.containsKey(this)) {
              StringBuilder discarded$7 = param0.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              Object discarded$8 = param2.put(this, this);
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
            stackOut_7_1 = new StringBuilder().append("rc.VA(");
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
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param1).append(44);
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
          throw fc.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param3 + 41);
        }
        return stackIn_6_0 != 0;
    }

    protected rc() {
        ((rc) this).field_k = 0;
        ((rc) this).field_q = 0;
    }

    rc(String param0, j param1, dg param2) {
        RuntimeException runtimeException = null;
        eg var4 = null;
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
        ((rc) this).field_k = 0;
        ((rc) this).field_q = 0;
        try {
          L0: {
            L1: {
              ((rc) this).field_w = param1;
              ((rc) this).field_n = param2;
              ((rc) this).field_i = param0;
              if (!(((rc) this).field_w instanceof eg)) {
                break L1;
              } else {
                var4 = (eg) (Object) ((rc) this).field_w;
                ((rc) this).field_t = var4.a(true, (rc) this);
                ((rc) this).field_x = var4.a((rc) this, -125);
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
            stackOut_4_1 = new StringBuilder().append("rc.<init>(");
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
          throw fc.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    rc(int param0, int param1, int param2, int param3, j param4, dg param5) {
        ((rc) this).field_k = 0;
        ((rc) this).field_q = 0;
        try {
            ((rc) this).field_x = param3;
            ((rc) this).field_n = param5;
            ((rc) this).field_j = param1;
            ((rc) this).field_m = param0;
            ((rc) this).field_t = param2;
            ((rc) this).field_w = param4;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "rc.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Next Level";
        field_o = new kb();
        field_p = "Creating your account";
        field_y = "Email: ";
    }
}
