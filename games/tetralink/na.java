/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class na extends mc {
    static int field_y;
    int field_F;
    String field_C;
    int field_o;
    int field_t;
    int field_w;
    int field_E;
    static String[] field_p;
    static String field_G;
    hi field_D;
    static int[] field_v;
    kg field_H;
    int field_x;
    static String[] field_n;
    private static int[] field_B;
    dn field_s;
    static String field_q;
    static int[] field_z;
    int field_u;
    boolean field_r;
    String field_A;

    void f(int param0) {
        try {
            if (param0 >= -63) {
                this.field_r = false;
            }
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "na.UA(" + param0 + ')');
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        try {
            this.field_u = param0;
            this.field_w = param1;
            int var6_int = -28 / ((-61 - param2) / 51);
            this.field_F = param4;
            this.field_t = param3;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "na.FA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    void a(na param0, int param1, int param2, boolean param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int stackIn_1_0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
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
              var5_int = this.b(aa.field_Nb, 1343807649, param1, param2, a.field_a) ? 1 : 0;
              stackOut_0_0 = var5_int;
              stackIn_3_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if (this.field_r) {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_1_0 = stackIn_1_0;
                stackOut_1_1 = 1;
                stackIn_4_0 = stackOut_1_0;
                stackIn_4_1 = stackOut_1_1;
                break L1;
              }
            }
            L2: {
              if (stackIn_4_0 != stackIn_4_1) {
                break L2;
              } else {
                this.field_r = var5_int != 0;
                if (this.field_s == null) {
                  break L2;
                } else {
                  if (this.field_s instanceof ol) {
                    ((ol) ((Object) this.field_s)).a(var5_int != 0, 30162, (na) (this));
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
            }
            L3: {
              if (param3) {
                break L3;
              } else {
                field_G = (String) null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (runtimeException);
            stackOut_18_1 = new StringBuilder().append("na.MA(");
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L4;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    StringBuilder a(Hashtable param0, StringBuilder param1, int param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
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
              if (param3 == -372494750) {
                break L1;
              } else {
                field_z = (int[]) null;
                break L1;
              }
            }
            L2: {
              if (this.a(param0, param2, 91, param1)) {
                this.a(-121, param1, param0, param2);
                break L2;
              } else {
                break L2;
              }
            }
            stackOut_7_0 = (StringBuilder) (param1);
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var5);
            stackOut_9_1 = new StringBuilder().append("na.WA(");
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_8_0;
    }

    String e(int param0) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        String stackOut_1_0 = null;
        try {
          L0: {
            if (param0 == 0) {
              L1: {
                if (this.field_r) {
                  stackOut_6_0 = this.field_C;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_4_0 = null;
                  stackIn_7_0 = (String) ((Object) stackOut_4_0);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (String) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2), "na.IA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    final void a(int param0, StringBuilder param1, Hashtable param2, int param3) {
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        StringBuilder discarded$12 = null;
        StringBuilder discarded$13 = null;
        StringBuilder discarded$14 = null;
        StringBuilder discarded$15 = null;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var6 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              discarded$8 = param1.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_t).append(",").append(this.field_w).append(" ").append(this.field_F).append("x").append(this.field_u);
              if (this.field_A == null) {
                break L1;
              } else {
                discarded$9 = param1.append(" text=\"").append(this.field_A).append('"');
                break L1;
              }
            }
            L2: {
              if (this.field_r) {
                discarded$10 = param1.append(" mouseover");
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (this.c(3)) {
                discarded$11 = param1.append(" focused");
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (null != this.field_H) {
                L5: {
                  discarded$12 = param1.append(" renderer=");
                  if (this.field_H instanceof na) {
                    break L5;
                  } else {
                    discarded$13 = param1.append(this.field_H);
                    if (var6 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                param1 = this.a(param2, param1, 1 + param3, -372494750);
                break L4;
              } else {
                break L4;
              }
            }
            L6: {
              if (null == this.field_s) {
                break L6;
              } else {
                L7: {
                  discarded$14 = param1.append(" listener=");
                  if (this.field_s instanceof na) {
                    break L7;
                  } else {
                    discarded$15 = param1.append(this.field_s);
                    if (var6 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                param1 = this.a(param2, param1, 1 + param3, -372494750);
                break L6;
              }
            }
            L8: {
              if (param0 < -106) {
                break L8;
              } else {
                na.a(-1, false);
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) (var5);
            stackOut_32_1 = new StringBuilder().append("na.OA(").append(param0).append(',');
            stackIn_35_0 = stackOut_32_0;
            stackIn_35_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param1 == null) {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L9;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_36_0 = stackOut_33_0;
              stackIn_36_1 = stackOut_33_1;
              stackIn_36_2 = stackOut_33_2;
              break L9;
            }
          }
          L10: {
            stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
            stackOut_36_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',');
            stackIn_39_0 = stackOut_36_0;
            stackIn_39_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param2 == null) {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L10;
            } else {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "{...}";
              stackIn_40_0 = stackOut_37_0;
              stackIn_40_1 = stackOut_37_1;
              stackIn_40_2 = stackOut_37_2;
              break L10;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param3 + ')');
        }
    }

    boolean a(na param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (this.b(param6, 1343807649, param1, param3, param5)) {
                this.field_x = param2;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param4 == -32738) {
                break L2;
              } else {
                this.field_A = (String) null;
                break L2;
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
            stackOut_9_0 = (RuntimeException) (var8);
            stackOut_9_1 = new StringBuilder().append("na.PA(");
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_8_0 != 0;
    }

    void a(int param0, boolean param1, na param2, int param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.field_x = 0;
              if (!param1) {
                break L1;
              } else {
                this.field_E = 33;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("na.AB(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void c(boolean param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        ve var9 = null;
        int var10 = 0;
        int stackIn_20_0 = 0;
        ve stackIn_27_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        ve stackOut_26_0 = null;
        ve stackOut_24_0 = null;
        var10 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              var1_int = hd.field_q + -ja.field_j;
              if (param0) {
                break L1;
              } else {
                field_v = (int[]) null;
                break L1;
              }
            }
            ja.field_j = nh.field_Nb - (var1_int >> 1004132961);
            ab.field_Q = -(hk.field_a >> 1343807649) + fk.field_S;
            hd.field_q = var1_int + ja.field_j;
            var2 = ab.field_Q;
            var3 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if ((var3 ^ -1) <= (hk.field_b.length ^ -1)) {
                    break L4;
                  } else {
                    var4 = bi.field_c[var3];
                    if (var10 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          if ((var4 ^ -1) <= -1) {
                            break L6;
                          } else {
                            var5 = wa.field_d;
                            if (var10 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L7: {
                          if ((var4 ^ -1) != (hb.field_a.field_b ^ -1)) {
                            break L7;
                          } else {
                            var5 = bm.field_n;
                            if (var10 == 0) {
                              break L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var5 = uj.field_w;
                        break L5;
                      }
                      L8: {
                        var6 = hk.field_b[var3];
                        if (0 > var4) {
                          stackOut_19_0 = 0;
                          stackIn_20_0 = stackOut_19_0;
                          break L8;
                        } else {
                          stackOut_17_0 = 1;
                          stackIn_20_0 = stackOut_17_0;
                          break L8;
                        }
                      }
                      L9: {
                        var7 = tn.a(stackIn_20_0 != 0, 1, var6);
                        var8 = -(var7 >> 892111009) + nh.field_Nb;
                        if (-1 >= (var4 ^ -1)) {
                          L10: {
                            if ((hb.field_a.field_b ^ -1) == (var4 ^ -1)) {
                              stackOut_26_0 = aa.field_Wb;
                              stackIn_27_0 = stackOut_26_0;
                              break L10;
                            } else {
                              stackOut_24_0 = bn.field_b;
                              stackIn_27_0 = stackOut_24_0;
                              break L10;
                            }
                          }
                          L11: {
                            var9 = stackIn_27_0;
                            var2 = var2 + cd.field_e;
                            if (var9 != null) {
                              var9.a(var2, var8 + -ao.field_a, (byte) -126, var7 + (ao.field_a << -2040831199), i.field_n - -(hc.field_q << -207763743));
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          var2 = var2 + hc.field_q;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L12: {
                        L13: {
                          if (-1 >= (var4 ^ -1)) {
                            break L13;
                          } else {
                            ko.field_u.b(var6, var8, var2 - -h.field_a, var5, -1);
                            var2 = var2 + hl.field_wb;
                            if (var10 == 0) {
                              break L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        oi.field_a.b(var6, var8, var2 - -nj.field_d, var5, -1);
                        var2 = var2 + (hc.field_q - -cd.field_e - -i.field_n);
                        break L12;
                      }
                      var3++;
                      if (var10 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1), "na.KA(" + param0 + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              L2: {
                var2_int = 0;
                var3 = en.field_K;
                if (5 <= var3) {
                  break L2;
                } else {
                  var2_int = var3 * var3 * 8192 / 1100;
                  if (var6 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if ((var3 ^ -1) <= -106) {
                  break L3;
                } else {
                  var2_int = (var3 * 16384 - 40960) / 220;
                  if (var6 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              if (var3 >= 120) {
                break L1;
              } else {
                var3 = -var3 + 120;
                var2_int = 8192 - var3 * var3 * 8192 / 3300;
                break L1;
              }
            }
            L4: {
              var4 = 1;
              var5 = 0;
              if (param0 != 3) {
                break L4;
              } else {
                var4 = -1;
                break L4;
              }
            }
            L5: {
              if (-2 != (param0 ^ -1)) {
                break L5;
              } else {
                var5 = 1;
                break L5;
              }
            }
            L6: {
              if (-5 == (param0 ^ -1)) {
                var5 = 1;
                var4 = 1;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (5 != param0) {
                break L7;
              } else {
                var4 = -1;
                var5 = 1;
                break L7;
              }
            }
            L8: {
              if (!param1) {
                break L8;
              } else {
                na.a(-61, true);
                break L8;
              }
            }
            L9: {
              if (param0 == 6) {
                var5 = -1;
                var4 = 1;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              L11: {
                if (-8 == (param0 ^ -1)) {
                  break L11;
                } else {
                  if (param0 != 8) {
                    break L10;
                  } else {
                    break L11;
                  }
                }
              }
              var4 = -1;
              var5 = -1;
              break L10;
            }
            L12: {
              if ((param0 ^ -1) != -12) {
                break L12;
              } else {
                var4 = -1;
                break L12;
              }
            }
            L13: {
              if (-13 == (param0 ^ -1)) {
                var4 = -1;
                var5 = -1;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if ((param0 ^ -1) != -14) {
                break L14;
              } else {
                var4 = 1;
                var5 = -1;
                break L14;
              }
            }
            L15: {
              if ((param0 ^ -1) == -15) {
                var5 = 1;
                var4 = -1;
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              if (-16 != (param0 ^ -1)) {
                break L16;
              } else {
                var4 = 1;
                var5 = 1;
                break L16;
              }
            }
            bk.field_k = fk.a(var5 * var2_int, (byte) -67, var2_int * var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2), "na.CB(" + param0 + ',' + param1 + ')');
        }
    }

    public static void c(byte param0) {
        try {
            field_v = null;
            field_p = null;
            field_n = null;
            field_z = null;
            field_B = null;
            field_G = null;
            field_q = null;
            if (param0 != 101) {
                na.c((byte) 52);
            }
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "na.TA(" + param0 + ')');
        }
    }

    public final String toString() {
        RuntimeException var1 = null;
        String stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_0_0 = null;
        try {
          L0: {
            stackOut_0_0 = this.a(new Hashtable(), new StringBuilder(), 0, -372494750).toString();
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1), "na.toString()");
        }
        return stackIn_1_0;
    }

    na(String param0, dn param1) {
        this(param0, dh.field_q.field_e, param1);
    }

    final void b(byte param0) {
        try {
            this.a(this.field_u, this.field_w, -117, this.field_t, this.field_F);
            if (param0 <= 4) {
                this.field_t = -71;
            }
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "na.VA(" + param0 + ')');
        }
    }

    boolean a(int param0, char param1, int param2, na param3) {
        int discarded$2 = 0;
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 1) {
                break L1;
              } else {
                discarded$2 = this.d(-61);
                break L1;
              }
            }
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var5);
            stackOut_5_1 = new StringBuilder().append("na.DB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final void a(int param0, int param1, int param2) {
        int discarded$2 = 0;
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              var4_int = this.d(param2 + 23335);
              var5_int = 0;
              if (param2 == -23452) {
                break L1;
              } else {
                discarded$2 = this.d(-24);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                if ((var5_int ^ -1) < (var4_int ^ -1)) {
                  break L3;
                } else {
                  this.a(0, param1, param0, var5_int);
                  var5_int++;
                  if (var6 == 0) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                var5 = tl.h(8);
                if (var5 != null) {
                  dh.field_q.a(var5, ph.field_z, fi.field_Db, -63);
                  break L4;
                } else {
                  break L4;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) runtimeException), "na.GB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    int d(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 < -114) {
                break L1;
              } else {
                this.field_t = 76;
                break L1;
              }
            }
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2), "na.RA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final boolean a(int param0, boolean param1, int param2, boolean param3) {
        boolean discarded$2 = false;
        boolean discarded$3 = false;
        RuntimeException var5 = null;
        int var5_int = 0;
        ed var6 = null;
        int var7 = 0;
        boolean stackIn_48_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_47_0 = false;
        var7 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (!param3) {
                break L1;
              } else {
                discarded$2 = this.a((na) null, -123);
                break L1;
              }
            }
            L2: {
              L3: {
                this.a((na) (this), param0, param2, true);
                var5_int = this.c(3) ? 1 : 0;
                if (!param1) {
                  break L3;
                } else {
                  L4: {
                    if (-1 == (hc.field_p ^ -1)) {
                      break L4;
                    } else {
                      if (var5_int == 0) {
                        break L4;
                      } else {
                        discarded$3 = this.a(-19137, (na) (this), param2, a.field_a, param0, aa.field_Nb, hc.field_p);
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (tm.field_t != 0) {
                      L6: {
                        if (!this.a((na) (this), param0, tm.field_t, param2, -32738, li.field_o, ci.field_B)) {
                          break L6;
                        } else {
                          param1 = false;
                          if (var7 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      if (var5_int != 0) {
                        this.f(-101);
                        break L5;
                      } else {
                        break L5;
                      }
                    } else {
                      break L5;
                    }
                  }
                  if ((ho.field_X ^ -1) != -1) {
                    break L2;
                  } else {
                    if (fl.field_q != 0) {
                      L7: {
                        this.a(a.field_a, false, (na) (this), param2, aa.field_Nb, param0);
                        var6 = gi.field_c;
                        if (var6 != null) {
                          L8: {
                            if (var6.field_s instanceof hf) {
                              ((hf) ((Object) var6.field_s)).a(var6, 87, (te) null);
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          gi.field_c = null;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      if (var7 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    } else {
                      break L2;
                    }
                  }
                }
              }
              if (var5_int == 0) {
                break L2;
              } else {
                if (-1 == (tm.field_t ^ -1)) {
                  break L2;
                } else {
                  this.f(-119);
                  break L2;
                }
              }
            }
            fl.field_q = ho.field_X;
            bh.a(-57, this.e(0));
            stackOut_47_0 = param1;
            stackIn_48_0 = stackOut_47_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var5), "na.BB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_48_0;
    }

    final boolean a(int param0, char param1, int param2) {
        boolean discarded$2 = false;
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_5_0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_15_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        boolean stackOut_12_0 = false;
        int stackOut_14_0 = 0;
        try {
          L0: {
            L1: {
              if (!this.c(3)) {
                break L1;
              } else {
                if (!this.a(param0, param1, param2 + 82, (na) (this))) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_5_0 = stackOut_4_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L2: {
              if (param2 == -81) {
                break L2;
              } else {
                discarded$2 = this.c(-34);
                break L2;
              }
            }
            var4_int = param0;
            if ((var4_int ^ -1) == -81) {
              stackOut_12_0 = this.a((na) (this), -384169950);
              stackIn_13_0 = stackOut_12_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_14_0 = 0;
              stackIn_15_0 = stackOut_14_0;
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var4), "na.LA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0;
          } else {
            return stackIn_15_0 != 0;
          }
        }
    }

    boolean c(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 3) {
                break L1;
              } else {
                this.field_t = -110;
                break L1;
              }
            }
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2), "na.JA(" + param0 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 == 1343807649) {
                break L1;
              } else {
                field_z = (int[]) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (param2 + this.field_t > param0) {
                  break L3;
                } else {
                  if (param3 + this.field_w > param4) {
                    break L3;
                  } else {
                    if (this.field_F + this.field_t + param2 <= param0) {
                      break L3;
                    } else {
                      if (param3 - (-this.field_w + -this.field_u) <= param4) {
                        break L3;
                      } else {
                        stackOut_13_0 = 1;
                        stackIn_16_0 = stackOut_13_0;
                        break L2;
                      }
                    }
                  }
                }
              }
              stackOut_15_0 = 0;
              stackIn_16_0 = stackOut_15_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var6), "na.QA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_16_0 != 0;
    }

    final boolean a(Hashtable param0, int param1, int param2, StringBuilder param3) {
        StringBuilder discarded$4 = null;
        Object discarded$5 = null;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (param2 > 37) {
              if (param0.containsKey(this)) {
                discarded$4 = param3.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                discarded$5 = param0.put(this, this);
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var5);
            stackOut_8_1 = new StringBuilder().append("na.SA(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L1;
            }
          }
          L2: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L2;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            return stackIn_7_0 != 0;
          }
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((param3 ^ -1) != -1) {
                break L1;
              } else {
                if (null == this.field_H) {
                  break L1;
                } else {
                  this.field_H.a((na) (this), param1, param2, true, true);
                  break L1;
                }
              }
            }
            L2: {
              if (param0 == 0) {
                break L2;
              } else {
                this.field_D = (hi) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var5), "na.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    boolean a(na param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 == -384169950) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("na.EB(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    boolean a(int param0, na param1, int param2, int param3, int param4, int param5, int param6) {
        String discarded$2 = null;
        RuntimeException var8 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -19137) {
                break L1;
              } else {
                discarded$2 = this.toString();
                break L1;
              }
            }
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var8);
            stackOut_5_1 = new StringBuilder().append("na.NA(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final static void a(int[] param0, boolean param1, int[] param2, int param3, boolean param4, boolean param5, id param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_59_0 = 0;
        int stackOut_59_1 = 0;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        var30 = TetraLink.field_J;
        try {
          L0: {
            var7_int = 2147483647;
            var8 = -2147483648;
            var21 = param0[3] >> 51254242;
            var22 = param0[4] >> 1740655426;
            var23 = param0[5] >> -372494750;
            var24 = param0[6] >> -1073592638;
            var25 = param0[7] >> 262979618;
            var26 = param0[8] >> 1752008642;
            var27 = param0[param3] >> -831292062;
            var28 = param0[10] >> -2087496862;
            var29 = param0[11] >> -384169950;
            var12 = var23 * param2[5] + var22 * param2[4] + param2[3] * var21 >> -1756744658;
            var13 = var24 * param2[3] - -(var25 * param2[4]) + param2[5] * var26 >> 1539150414;
            var20 = param2[9] * var27 - -(var28 * param2[10]) - -(param2[11] * var29) >> 563881582;
            var14 = param2[4] * var28 + (var27 * param2[3] + var29 * param2[5]) >> 1219411950;
            var19 = var26 * param2[11] + (param2[10] * var25 + param2[9] * var24) >> 37351950;
            var16 = var25 * param2[7] + (var24 * param2[6] + param2[8] * var26) >> -1104839410;
            var18 = var21 * param2[9] + param2[10] * var22 + param2[11] * var23 >> -1538741938;
            var15 = var23 * param2[8] + (var21 * param2[6] - -(var22 * param2[7])) >> 381106382;
            var17 = var29 * param2[8] + param2[7] * var28 + var27 * param2[6] >> -832683154;
            var21 = param2[0] - param0[0];
            var22 = -param0[1] + param2[1];
            var23 = -param0[2] + param2[2];
            var9 = var21 * param0[3] + (param0[4] * var22 - -(var23 * param0[5])) >> -mh.field_a + 16;
            var10 = param0[8] * var23 + var22 * param0[7] + var21 * param0[6] >> 16 + -mh.field_a;
            var11 = param0[10] * var22 + param0[9] * var21 + var23 * param0[11] >> 737360400;
            var21 = vn.field_a;
            var22 = vn.field_f;
            var23 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (param6.field_q <= var23) {
                      break L4;
                    } else {
                      var24 = param6.field_D[var23];
                      var25 = param6.field_i[var23];
                      var26 = param6.field_R[var23];
                      var27 = var9 - -(var18 * var26 + (var24 * var12 - -(var25 * var15)) >> -mh.field_a + 16);
                      var28 = var10 + (var19 * var26 + var25 * var16 + var24 * var13 >> 16 - mh.field_a);
                      var29 = var11 + (var14 * var24 - -(var25 * var17) - -(var20 * var26) >> -975441360);
                      stackOut_3_0 = var29;
                      stackOut_3_1 = 50;
                      stackIn_60_0 = stackOut_3_0;
                      stackIn_60_1 = stackOut_3_1;
                      stackIn_4_0 = stackOut_3_0;
                      stackIn_4_1 = stackOut_3_1;
                      if (var30 != 0) {
                        break L3;
                      } else {
                        L5: {
                          L6: {
                            if (stackIn_4_0 < stackIn_4_1) {
                              break L6;
                            } else {
                              L7: {
                                lj.field_b[var23] = var27 / var29 + var21;
                                pl.field_f[var23] = var22 - -(var28 / var29);
                                if (var29 >= var7_int) {
                                  break L7;
                                } else {
                                  var7_int = var29;
                                  break L7;
                                }
                              }
                              L8: {
                                if ((var8 ^ -1) <= (var29 ^ -1)) {
                                  break L8;
                                } else {
                                  var8 = var29;
                                  break L8;
                                }
                              }
                              nc.field_b[var23] = var29;
                              if (var30 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          nc.field_b[var23] = -2147483648;
                          break L5;
                        }
                        L9: {
                          if (!param4) {
                            break L9;
                          } else {
                            oa.field_q[var23] = var27 >> mh.field_a;
                            jg.field_e[var23] = var28 >> mh.field_a;
                            bk.field_d[var23] = var29;
                            break L9;
                          }
                        }
                        var23++;
                        if (var30 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  L10: {
                    if (param6.field_F == null) {
                      break L10;
                    } else {
                      if (null == param6.field_G) {
                        break L10;
                      } else {
                        if (null == param6.field_B) {
                          break L10;
                        } else {
                          if (param6.field_C == null) {
                            break L10;
                          } else {
                            if (param6.field_E == null) {
                              break L10;
                            } else {
                              if (null == param6.field_H) {
                                break L10;
                              } else {
                                if (param6.field_c == null) {
                                  break L10;
                                } else {
                                  if (null == param6.field_z) {
                                    break L10;
                                  } else {
                                    if (param6.field_h == null) {
                                      break L10;
                                    } else {
                                      var23 = 0;
                                      L11: while (true) {
                                        if (param6.field_s <= var23) {
                                          break L10;
                                        } else {
                                          var24 = param6.field_F[var23];
                                          var25 = param6.field_G[var23];
                                          var26 = param6.field_B[var23];
                                          lb.field_S[var23] = (var18 * var26 + var24 * var12 + var15 * var25 >> 1855792656) + var9;
                                          em.field_i[var23] = var10 - -(var24 * var13 + var25 * var16 - -(var26 * var19) >> 244597328);
                                          pe.field_a[var23] = (var14 * var24 + (var17 * var25 + var26 * var20) >> 1020613520) + var11;
                                          var24 = param6.field_C[var23];
                                          var25 = param6.field_E[var23];
                                          var26 = param6.field_H[var23];
                                          mb.field_w[var23] = var9 - -(var26 * var18 + var25 * var15 + var12 * var24 >> -1694118416);
                                          pm.field_e[var23] = (var26 * var19 + (var13 * var24 + var16 * var25) >> 1110671696) + var10;
                                          lb.field_Q[var23] = var11 + (var20 * var26 + (var25 * var17 + var24 * var14) >> 1297121776);
                                          var24 = param6.field_c[var23];
                                          var25 = param6.field_z[var23];
                                          var26 = param6.field_h[var23];
                                          nl.field_f[var23] = (var26 * var18 + (var15 * var25 + var24 * var12) >> 1206383024) + var9;
                                          da.field_d[var23] = (var26 * var19 + var25 * var16 + var24 * var13 >> -26059984) + var10;
                                          field_B[var23] = (var26 * var20 + var17 * var25 + var14 * var24 >> 283612336) + var11;
                                          var23++;
                                          if (var30 != 0) {
                                            break L2;
                                          } else {
                                            if (var30 == 0) {
                                              continue L11;
                                            } else {
                                              break L10;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  L12: {
                    if (!param1) {
                      break L12;
                    } else {
                      var9 = param2[3];
                      var10 = param2[4];
                      var11 = param2[5];
                      var12 = param2[6];
                      var13 = param2[7];
                      var14 = param2[8];
                      var15 = param2[9];
                      var16 = param2[10];
                      var17 = param2[11];
                      var18 = 0;
                      L13: while (true) {
                        if ((param6.field_O ^ -1) >= (var18 ^ -1)) {
                          break L12;
                        } else {
                          stackOut_54_0 = var18 ^ -1;
                          stackOut_54_1 = kk.field_T.length ^ -1;
                          stackIn_60_0 = stackOut_54_0;
                          stackIn_60_1 = stackOut_54_1;
                          stackIn_55_0 = stackOut_54_0;
                          stackIn_55_1 = stackOut_54_1;
                          if (var30 != 0) {
                            break L3;
                          } else {
                            if (stackIn_55_0 <= stackIn_55_1) {
                              break L12;
                            } else {
                              var19 = param6.field_l[var18];
                              var20 = param6.field_d[var18];
                              var21 = param6.field_y[var18];
                              kk.field_T[var18] = var20 * var12 + var19 * var9 - -(var21 * var15) >> 174416144;
                              bf.field_p[var18] = var16 * var21 + var10 * var19 - -(var13 * var20) >> 1868878928;
                              od.field_X[var18] = var21 * var17 + (var14 * var20 + var19 * var11) >> 1920396336;
                              var18++;
                              if (var30 == 0) {
                                continue L13;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_59_0 = var8;
                  stackOut_59_1 = var7_int;
                  stackIn_60_0 = stackOut_59_0;
                  stackIn_60_1 = stackOut_59_1;
                  break L3;
                }
                nh.a(stackIn_60_0, stackIn_60_1, param6, true, param5);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var7 = decompiledCaughtException;
            stackOut_62_0 = (RuntimeException) (var7);
            stackOut_62_1 = new StringBuilder().append("na.FB(");
            stackIn_65_0 = stackOut_62_0;
            stackIn_65_1 = stackOut_62_1;
            stackIn_63_0 = stackOut_62_0;
            stackIn_63_1 = stackOut_62_1;
            if (param0 == null) {
              stackOut_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackOut_65_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackOut_65_2 = "null";
              stackIn_66_0 = stackOut_65_0;
              stackIn_66_1 = stackOut_65_1;
              stackIn_66_2 = stackOut_65_2;
              break L14;
            } else {
              stackOut_63_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackOut_63_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackOut_63_2 = "{...}";
              stackIn_66_0 = stackOut_63_0;
              stackIn_66_1 = stackOut_63_1;
              stackIn_66_2 = stackOut_63_2;
              break L14;
            }
          }
          L15: {
            stackOut_66_0 = (RuntimeException) ((Object) stackIn_66_0);
            stackOut_66_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_66_2).append(',').append(param1).append(',');
            stackIn_69_0 = stackOut_66_0;
            stackIn_69_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param2 == null) {
              stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L15;
            } else {
              stackOut_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackOut_67_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackOut_67_2 = "{...}";
              stackIn_70_0 = stackOut_67_0;
              stackIn_70_1 = stackOut_67_1;
              stackIn_70_2 = stackOut_67_2;
              break L15;
            }
          }
          L16: {
            stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
            stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_73_0 = stackOut_70_0;
            stackIn_73_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param6 == null) {
              stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackOut_73_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L16;
            } else {
              stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackOut_71_2 = "{...}";
              stackIn_74_0 = stackOut_71_0;
              stackIn_74_1 = stackOut_71_1;
              stackIn_74_2 = stackOut_71_2;
              break L16;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_74_0), stackIn_74_2 + ')');
        }
    }

    protected na() {
        this.field_E = 0;
        this.field_o = 0;
    }

    na(String param0, kg param1, dn param2) {
        RuntimeException runtimeException = null;
        jh var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        this.field_E = 0;
        this.field_o = 0;
        try {
          L0: {
            L1: {
              this.field_H = param1;
              this.field_A = param0;
              this.field_s = param2;
              if (this.field_H instanceof jh) {
                var4 = (jh) ((Object) this.field_H);
                this.field_F = var4.a((na) (this), (byte) 36);
                this.field_u = var4.a((na) (this), 91);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (runtimeException);
            stackOut_5_1 = new StringBuilder().append("na.<init>(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    na(int param0, int param1, int param2, int param3, kg param4, dn param5) {
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
        this.field_E = 0;
        this.field_o = 0;
        try {
          L0: {
            this.field_t = param0;
            this.field_u = param3;
            this.field_s = param5;
            this.field_F = param2;
            this.field_w = param1;
            this.field_H = param4;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("na.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param4 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param5 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    static {
        field_B = new int[8192];
        field_q = "This game has started.";
        field_p = new String[4];
        field_v = new int[4];
        field_z = new int[4];
        field_y = 0;
        field_n = new String[4];
        field_G = "Please enter your date of birth to enable chat:";
    }
}
