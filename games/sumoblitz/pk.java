/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.Class;
import java.lang.String;

class pk extends ms {
    String field_t;
    boolean field_k;
    int field_q;
    int field_n;
    ag field_u;
    int field_v;
    int field_p;
    String field_m;
    int field_s;
    qm field_o;
    int field_r;
    int field_l;
    mh field_w;

    final void a(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        var6 = Sumoblitz.field_L ? 1 : 0;
        var4 = ((pk) this).e(93);
        var5_int = 0;
        L0: while (true) {
          L1: {
            if (var5_int > var4) {
              break L1;
            } else {
              ((pk) this).a(param1, param0, (byte) -110, var5_int);
              var5_int++;
              if (var6 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          var5 = jd.e(102);
          if (var5 == null) {
            if (param2) {
              ((pk) this).field_s = 113;
              return;
            } else {
              return;
            }
          } else {
            ks.field_x.a(za.field_k, 13421772, hq.field_b, var5);
            if (!param2) {
              return;
            } else {
              ((pk) this).field_s = 113;
              return;
            }
          }
        }
    }

    void a(pk param0, boolean param1, int param2, int param3, int param4, int param5) {
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
              ((pk) this).field_l = 0;
              if (!param1) {
                break L1;
              } else {
                ((pk) this).field_p = 20;
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
            stackOut_3_1 = new StringBuilder().append("pk.T(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
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
          throw qo.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static Class a(byte param0, String param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_6_0 = null;
        Class stackIn_9_0 = null;
        Class stackIn_13_0 = null;
        Class stackIn_17_0 = null;
        Class stackIn_21_0 = null;
        Class stackIn_24_0 = null;
        Class stackIn_30_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        Class stackOut_2_0 = null;
        Class stackOut_12_0 = null;
        Class stackOut_16_0 = null;
        Class stackOut_20_0 = null;
        Class stackOut_29_0 = null;
        Class stackOut_23_0 = null;
        Class stackOut_8_0 = null;
        Class stackOut_5_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        try {
          L0: {
            if (param1.equals((Object) (Object) "B")) {
              stackOut_2_0 = Byte.TYPE;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (!param1.equals((Object) (Object) "I")) {
                if (!param1.equals((Object) (Object) "S")) {
                  if (param1.equals((Object) (Object) "J")) {
                    stackOut_12_0 = Long.TYPE;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  } else {
                    if (param1.equals((Object) (Object) "Z")) {
                      stackOut_16_0 = Boolean.TYPE;
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0;
                    } else {
                      if (param1.equals((Object) (Object) "F")) {
                        stackOut_20_0 = Float.TYPE;
                        stackIn_21_0 = stackOut_20_0;
                        return stackIn_21_0;
                      } else {
                        if (!param1.equals((Object) (Object) "D")) {
                          L1: {
                            if (param0 == -24) {
                              break L1;
                            } else {
                              pk.d((byte) -20);
                              break L1;
                            }
                          }
                          if (param1.equals((Object) (Object) "C")) {
                            stackOut_29_0 = Character.TYPE;
                            stackIn_30_0 = stackOut_29_0;
                            break L0;
                          } else {
                            return Class.forName(param1);
                          }
                        } else {
                          stackOut_23_0 = Double.TYPE;
                          stackIn_24_0 = stackOut_23_0;
                          return stackIn_24_0;
                        }
                      }
                    }
                  }
                } else {
                  stackOut_8_0 = Short.TYPE;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              } else {
                stackOut_5_0 = Integer.TYPE;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var2;
            stackOut_31_1 = new StringBuilder().append("pk.NB(").append(param0).append(44);
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L2;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 41);
        }
        return stackIn_30_0;
    }

    final void c(boolean param0) {
        ((pk) this).a(-57, ((pk) this).field_r, ((pk) this).field_v, ((pk) this).field_p, ((pk) this).field_q);
        if (param0) {
            ((pk) this).field_t = null;
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
              if (param3 == 0) {
                break L1;
              } else {
                String discarded$2 = ((pk) this).toString();
                break L1;
              }
            }
            L2: {
              if (((pk) this).a(param0, param1, -123, param2)) {
                ((pk) this).a(param0, (byte) -128, param2, param1);
                break L2;
              } else {
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
            stackOut_7_1 = new StringBuilder().append("pk.S(").append(param0).append(44);
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
          throw qo.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param3 + 41);
        }
        return stackIn_6_0;
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        ((pk) this).field_q = param4;
        ((pk) this).field_v = param2;
        int var6 = -104 % ((param0 - 28) / 63);
        ((pk) this).field_p = param3;
        ((pk) this).field_r = param1;
    }

    void a(int param0, int param1, pk param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              var5_int = 66 % ((-25 - param1) / 45);
              var6 = ((pk) this).b(ko.field_p, -1, param0, pi.field_e, param3) ? 1 : 0;
              if (((pk) this).field_k) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              stackOut_3_0 = stackIn_3_0;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (var6 != 0) {
                stackOut_5_0 = stackIn_5_0;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L2;
              } else {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L2;
              }
            }
            L3: {
              if (stackIn_6_0 != stackIn_6_1) {
                L4: {
                  stackOut_8_0 = this;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_9_0 = stackOut_8_0;
                  if (var6 == 0) {
                    stackOut_10_0 = this;
                    stackOut_10_1 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    break L4;
                  } else {
                    stackOut_9_0 = this;
                    stackOut_9_1 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    break L4;
                  }
                }
                ((pk) this).field_k = stackIn_11_1 != 0;
                if (((pk) this).field_o == null) {
                  break L3;
                } else {
                  if (!(((pk) this).field_o instanceof bd)) {
                    break L3;
                  } else {
                    ((bd) (Object) ((pk) this).field_o).a(103, var6 != 0, (pk) this);
                    break L3;
                  }
                }
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("pk.U(").append(param0).append(44).append(param1).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param3 + 41);
        }
    }

    final boolean a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        int var5_int = 0;
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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
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
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var5_int = 110 / ((param2 - -73) / 48);
            if (!param1.containsKey(this)) {
              Object discarded$4 = param1.put(this, this);
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              StringBuilder discarded$5 = param3.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
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
            stackOut_5_1 = new StringBuilder().append("pk.PB(").append(param0).append(44);
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
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
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
          throw qo.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_4_0 != 0;
    }

    final static void d(byte param0) {
        if (!vs.b((byte) 9)) {
          ah.field_g = kc.c(-5204);
          if (null == ah.field_g) {
            if (param0 >= -15) {
              pk.d((byte) -33);
              return;
            } else {
              return;
            }
          } else {
            db discarded$7 = pd.a(ah.field_g, 6, 5412);
            if (param0 < -15) {
              return;
            } else {
              pk.d((byte) -33);
              return;
            }
          }
        } else {
          if (param0 < -15) {
            return;
          } else {
            pk.d((byte) -33);
            return;
          }
        }
    }

    final boolean a(int param0, int param1, boolean param2, int param3) {
        int var5 = 0;
        jh var6 = null;
        int var7 = 0;
        var7 = Sumoblitz.field_L ? 1 : 0;
        ((pk) this).a(param1, -71, (pk) this, param0);
        var5 = ((pk) this).d(param3) ? 1 : 0;
        if (param3 == -1) {
          L0: {
            L1: {
              if (!param2) {
                break L1;
              } else {
                L2: {
                  if (0 == pn.field_r) {
                    break L2;
                  } else {
                    if (var5 == 0) {
                      break L2;
                    } else {
                      L3: {
                        boolean discarded$2 = ((pk) this).a(param0, pn.field_r, -1, param1, pi.field_e, (pk) this, ko.field_p);
                        if (hk.field_c == 0) {
                          break L3;
                        } else {
                          L4: {
                            if (((pk) this).a((pk) this, param3 ^ 80, jc.field_f, hk.field_c, param1, nb.field_a, param0)) {
                              break L4;
                            } else {
                              if (var5 != 0) {
                                ((pk) this).c((byte) -116);
                                if (var7 == 0) {
                                  break L3;
                                } else {
                                  break L4;
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          param2 = false;
                          break L3;
                        }
                      }
                      L5: {
                        if (ar.field_G != 0) {
                          break L5;
                        } else {
                          if (ml.field_l == 0) {
                            break L5;
                          } else {
                            L6: {
                              ((pk) this).a((pk) this, false, param1, pi.field_e, ko.field_p, param0);
                              var6 = gt.field_gb;
                              if (var6 == null) {
                                break L6;
                              } else {
                                if (!(var6.field_o instanceof sf)) {
                                  gt.field_gb = null;
                                  break L6;
                                } else {
                                  ((sf) (Object) var6.field_o).a(var6, (st) null, 20302);
                                  gt.field_gb = null;
                                  break L6;
                                }
                              }
                            }
                            if (var7 == 0) {
                              break L5;
                            } else {
                              if (var5 == 0) {
                                break L5;
                              } else {
                                if (0 != hk.field_c) {
                                  ((pk) this).c((byte) 115);
                                  break L5;
                                } else {
                                  ml.field_l = ar.field_G;
                                  ek.a(((pk) this).c(-6696), -124);
                                  return param2;
                                }
                              }
                            }
                          }
                        }
                      }
                      ml.field_l = ar.field_G;
                      ek.a(((pk) this).c(-6696), -124);
                      return param2;
                    }
                  }
                }
                if (hk.field_c != 0) {
                  L7: {
                    L8: {
                      if (((pk) this).a((pk) this, param3 ^ 80, jc.field_f, hk.field_c, param1, nb.field_a, param0)) {
                        break L8;
                      } else {
                        if (var5 != 0) {
                          ((pk) this).c((byte) -116);
                          if (var7 == 0) {
                            break L7;
                          } else {
                            break L8;
                          }
                        } else {
                          if (ar.field_G == 0) {
                            L9: {
                              if (ml.field_l == 0) {
                                break L9;
                              } else {
                                ((pk) this).a((pk) this, false, param1, pi.field_e, ko.field_p, param0);
                                var6 = gt.field_gb;
                                if (var6 == null) {
                                  if (var7 == 0) {
                                    break L9;
                                  } else {
                                    if (var5 == 0) {
                                      break L9;
                                    } else {
                                      if (0 != hk.field_c) {
                                        ((pk) this).c((byte) 115);
                                        break L9;
                                      } else {
                                        ml.field_l = ar.field_G;
                                        ek.a(((pk) this).c(-6696), -124);
                                        return param2;
                                      }
                                    }
                                  }
                                } else {
                                  if (!(var6.field_o instanceof sf)) {
                                    L10: {
                                      gt.field_gb = null;
                                      if (var7 == 0) {
                                        break L10;
                                      } else {
                                        if (var5 == 0) {
                                          break L10;
                                        } else {
                                          if (0 != hk.field_c) {
                                            ((pk) this).c((byte) 115);
                                            break L10;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                    }
                                    ml.field_l = ar.field_G;
                                    ek.a(((pk) this).c(-6696), -124);
                                    return param2;
                                  } else {
                                    ((sf) (Object) var6.field_o).a(var6, (st) null, 20302);
                                    L11: {
                                      gt.field_gb = null;
                                      if (var7 == 0) {
                                        break L11;
                                      } else {
                                        if (var5 == 0) {
                                          break L11;
                                        } else {
                                          if (0 != hk.field_c) {
                                            ((pk) this).c((byte) 115);
                                            break L11;
                                          } else {
                                            ml.field_l = ar.field_G;
                                            ek.a(((pk) this).c(-6696), -124);
                                            return param2;
                                          }
                                        }
                                      }
                                    }
                                    ml.field_l = ar.field_G;
                                    ek.a(((pk) this).c(-6696), -124);
                                    return param2;
                                  }
                                }
                              }
                            }
                            ml.field_l = ar.field_G;
                            ek.a(((pk) this).c(-6696), -124);
                            return param2;
                          } else {
                            ml.field_l = ar.field_G;
                            ek.a(((pk) this).c(-6696), -124);
                            return param2;
                          }
                        }
                      }
                    }
                    param2 = false;
                    break L7;
                  }
                  if (ar.field_G != 0) {
                    break L0;
                  } else {
                    if (ml.field_l == 0) {
                      break L0;
                    } else {
                      ((pk) this).a((pk) this, false, param1, pi.field_e, ko.field_p, param0);
                      var6 = gt.field_gb;
                      if (var6 == null) {
                        if (var7 == 0) {
                          break L0;
                        } else {
                          break L1;
                        }
                      } else {
                        if (!(var6.field_o instanceof sf)) {
                          L12: {
                            gt.field_gb = null;
                            if (var7 == 0) {
                              break L12;
                            } else {
                              if (var5 == 0) {
                                break L12;
                              } else {
                                if (0 != hk.field_c) {
                                  ((pk) this).c((byte) 115);
                                  break L12;
                                } else {
                                  ml.field_l = ar.field_G;
                                  ek.a(((pk) this).c(-6696), -124);
                                  return param2;
                                }
                              }
                            }
                          }
                          ml.field_l = ar.field_G;
                          ek.a(((pk) this).c(-6696), -124);
                          return param2;
                        } else {
                          ((sf) (Object) var6.field_o).a(var6, (st) null, 20302);
                          L13: {
                            gt.field_gb = null;
                            if (var7 == 0) {
                              break L13;
                            } else {
                              if (var5 == 0) {
                                break L13;
                              } else {
                                if (0 != hk.field_c) {
                                  ((pk) this).c((byte) 115);
                                  break L13;
                                } else {
                                  ml.field_l = ar.field_G;
                                  ek.a(((pk) this).c(-6696), -124);
                                  return param2;
                                }
                              }
                            }
                          }
                          ml.field_l = ar.field_G;
                          ek.a(((pk) this).c(-6696), -124);
                          return param2;
                        }
                      }
                    }
                  }
                } else {
                  L14: {
                    if (ar.field_G != 0) {
                      break L14;
                    } else {
                      if (ml.field_l == 0) {
                        break L14;
                      } else {
                        ((pk) this).a((pk) this, false, param1, pi.field_e, ko.field_p, param0);
                        var6 = gt.field_gb;
                        if (var6 == null) {
                          if (var7 == 0) {
                            break L14;
                          } else {
                            if (var5 == 0) {
                              break L14;
                            } else {
                              if (0 != hk.field_c) {
                                ((pk) this).c((byte) 115);
                                break L14;
                              } else {
                                ml.field_l = ar.field_G;
                                ek.a(((pk) this).c(-6696), -124);
                                return param2;
                              }
                            }
                          }
                        } else {
                          if (!(var6.field_o instanceof sf)) {
                            L15: {
                              gt.field_gb = null;
                              if (var7 == 0) {
                                break L15;
                              } else {
                                if (var5 == 0) {
                                  break L15;
                                } else {
                                  if (0 != hk.field_c) {
                                    ((pk) this).c((byte) 115);
                                    break L15;
                                  } else {
                                    ml.field_l = ar.field_G;
                                    ek.a(((pk) this).c(-6696), -124);
                                    return param2;
                                  }
                                }
                              }
                            }
                            ml.field_l = ar.field_G;
                            ek.a(((pk) this).c(-6696), -124);
                            return param2;
                          } else {
                            ((sf) (Object) var6.field_o).a(var6, (st) null, 20302);
                            L16: {
                              gt.field_gb = null;
                              if (var7 == 0) {
                                break L16;
                              } else {
                                if (var5 == 0) {
                                  break L16;
                                } else {
                                  if (0 != hk.field_c) {
                                    ((pk) this).c((byte) 115);
                                    break L16;
                                  } else {
                                    ml.field_l = ar.field_G;
                                    ek.a(((pk) this).c(-6696), -124);
                                    return param2;
                                  }
                                }
                              }
                            }
                            ml.field_l = ar.field_G;
                            ek.a(((pk) this).c(-6696), -124);
                            return param2;
                          }
                        }
                      }
                    }
                  }
                  ml.field_l = ar.field_G;
                  ek.a(((pk) this).c(-6696), -124);
                  return param2;
                }
              }
            }
            if (var5 == 0) {
              break L0;
            } else {
              if (0 != hk.field_c) {
                ((pk) this).c((byte) 115);
                break L0;
              } else {
                ml.field_l = ar.field_G;
                ek.a(((pk) this).c(-6696), -124);
                return param2;
              }
            }
          }
          ml.field_l = ar.field_G;
          ek.a(((pk) this).c(-6696), -124);
          return param2;
        } else {
          L17: {
            L18: {
              ((pk) this).field_n = 102;
              if (!param2) {
                break L18;
              } else {
                if (0 != pn.field_r) {
                  if (var5 != 0) {
                    L19: {
                      boolean discarded$3 = ((pk) this).a(param0, pn.field_r, -1, param1, pi.field_e, (pk) this, ko.field_p);
                      if (hk.field_c == 0) {
                        break L19;
                      } else {
                        L20: {
                          if (((pk) this).a((pk) this, param3 ^ 80, jc.field_f, hk.field_c, param1, nb.field_a, param0)) {
                            break L20;
                          } else {
                            if (var5 != 0) {
                              ((pk) this).c((byte) -116);
                              if (var7 == 0) {
                                break L19;
                              } else {
                                break L20;
                              }
                            } else {
                              break L19;
                            }
                          }
                        }
                        param2 = false;
                        break L19;
                      }
                    }
                    if (ar.field_G != 0) {
                      break L17;
                    } else {
                      if (ml.field_l == 0) {
                        break L17;
                      } else {
                        L21: {
                          ((pk) this).a((pk) this, false, param1, pi.field_e, ko.field_p, param0);
                          var6 = gt.field_gb;
                          if (var6 == null) {
                            break L21;
                          } else {
                            if (!(var6.field_o instanceof sf)) {
                              gt.field_gb = null;
                              break L21;
                            } else {
                              ((sf) (Object) var6.field_o).a(var6, (st) null, 20302);
                              gt.field_gb = null;
                              break L21;
                            }
                          }
                        }
                        if (var7 == 0) {
                          break L17;
                        } else {
                          break L18;
                        }
                      }
                    }
                  } else {
                    L22: {
                      if (hk.field_c == 0) {
                        break L22;
                      } else {
                        L23: {
                          if (((pk) this).a((pk) this, param3 ^ 80, jc.field_f, hk.field_c, param1, nb.field_a, param0)) {
                            break L23;
                          } else {
                            if (var5 != 0) {
                              ((pk) this).c((byte) -116);
                              if (var7 == 0) {
                                break L22;
                              } else {
                                break L23;
                              }
                            } else {
                              break L22;
                            }
                          }
                        }
                        param2 = false;
                        break L22;
                      }
                    }
                    L24: {
                      if (ar.field_G != 0) {
                        break L24;
                      } else {
                        if (ml.field_l == 0) {
                          break L24;
                        } else {
                          L25: {
                            ((pk) this).a((pk) this, false, param1, pi.field_e, ko.field_p, param0);
                            var6 = gt.field_gb;
                            if (var6 == null) {
                              break L25;
                            } else {
                              if (!(var6.field_o instanceof sf)) {
                                gt.field_gb = null;
                                break L25;
                              } else {
                                ((sf) (Object) var6.field_o).a(var6, (st) null, 20302);
                                gt.field_gb = null;
                                break L25;
                              }
                            }
                          }
                          if (var7 == 0) {
                            break L24;
                          } else {
                            if (var5 == 0) {
                              break L24;
                            } else {
                              if (0 != hk.field_c) {
                                ((pk) this).c((byte) 115);
                                break L24;
                              } else {
                                break L24;
                              }
                            }
                          }
                        }
                      }
                    }
                    ml.field_l = ar.field_G;
                    ek.a(((pk) this).c(-6696), -124);
                    return param2;
                  }
                } else {
                  L26: {
                    if (hk.field_c == 0) {
                      break L26;
                    } else {
                      L27: {
                        if (((pk) this).a((pk) this, param3 ^ 80, jc.field_f, hk.field_c, param1, nb.field_a, param0)) {
                          break L27;
                        } else {
                          if (var5 != 0) {
                            ((pk) this).c((byte) -116);
                            if (var7 == 0) {
                              break L26;
                            } else {
                              break L27;
                            }
                          } else {
                            break L26;
                          }
                        }
                      }
                      param2 = false;
                      break L26;
                    }
                  }
                  L28: {
                    if (ar.field_G != 0) {
                      break L28;
                    } else {
                      if (ml.field_l == 0) {
                        break L28;
                      } else {
                        L29: {
                          ((pk) this).a((pk) this, false, param1, pi.field_e, ko.field_p, param0);
                          var6 = gt.field_gb;
                          if (var6 == null) {
                            break L29;
                          } else {
                            if (!(var6.field_o instanceof sf)) {
                              gt.field_gb = null;
                              break L29;
                            } else {
                              ((sf) (Object) var6.field_o).a(var6, (st) null, 20302);
                              gt.field_gb = null;
                              break L29;
                            }
                          }
                        }
                        if (var7 == 0) {
                          break L28;
                        } else {
                          if (var5 == 0) {
                            break L28;
                          } else {
                            if (0 != hk.field_c) {
                              ((pk) this).c((byte) 115);
                              break L28;
                            } else {
                              break L28;
                            }
                          }
                        }
                      }
                    }
                  }
                  ml.field_l = ar.field_G;
                  ek.a(((pk) this).c(-6696), -124);
                  return param2;
                }
              }
            }
            if (var5 == 0) {
              break L17;
            } else {
              if (0 != hk.field_c) {
                ((pk) this).c((byte) 115);
                break L17;
              } else {
                break L17;
              }
            }
          }
          ml.field_l = ar.field_G;
          ek.a(((pk) this).c(-6696), -124);
          return param2;
        }
    }

    boolean a(pk param0, int param1, int param2, int param3, int param4, int param5, int param6) {
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
            if (param1 < -42) {
              if (((pk) this).b(param5, -1, param4, param2, param6)) {
                ((pk) this).field_l = param3;
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
            stackOut_7_1 = new StringBuilder().append("pk.R(");
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
          throw qo.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_6_0 != 0;
    }

    boolean b(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_17_0 = 0;
        if (param1 == -1) {
          if (((pk) this).field_r + param2 <= param0) {
            if (((pk) this).field_v + param4 > param3) {
              return false;
            } else {
              L0: {
                L1: {
                  if (param0 >= ((pk) this).field_q + ((pk) this).field_r + param2) {
                    break L1;
                  } else {
                    if (((pk) this).field_p + (param4 + ((pk) this).field_v) <= param3) {
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
          ((pk) this).a(-12, -50, (byte) 63, 31);
          if (((pk) this).field_r + param2 <= param0) {
            if (((pk) this).field_v + param4 <= param3) {
              if (param0 < ((pk) this).field_q + ((pk) this).field_r + param2) {
                if (((pk) this).field_p + (param4 + ((pk) this).field_v) <= param3) {
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

    boolean d(int param0) {
        if (param0 != -1) {
            ((pk) this).field_w = null;
            return false;
        }
        return false;
    }

    final void a(int param0, byte param1, StringBuilder param2, Hashtable param3) {
        RuntimeException var5 = null;
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
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            StringBuilder discarded$8 = param2.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(((pk) this).field_r).append(",").append(((pk) this).field_v).append(" ").append(((pk) this).field_q).append("x").append(((pk) this).field_p);
            if (param1 == -128) {
              L1: {
                if (((pk) this).field_m == null) {
                  break L1;
                } else {
                  StringBuilder discarded$9 = param2.append(" text=\"").append(((pk) this).field_m).append(34);
                  break L1;
                }
              }
              L2: {
                if (!((pk) this).field_k) {
                  break L2;
                } else {
                  StringBuilder discarded$10 = param2.append(" mouseover");
                  break L2;
                }
              }
              L3: {
                if (!((pk) this).d(-1)) {
                  break L3;
                } else {
                  StringBuilder discarded$11 = param2.append(" focused");
                  break L3;
                }
              }
              L4: {
                if (null != ((pk) this).field_w) {
                  L5: {
                    StringBuilder discarded$12 = param2.append(" renderer=");
                    if (((pk) this).field_w instanceof pk) {
                      break L5;
                    } else {
                      StringBuilder discarded$13 = param2.append(((pk) this).field_w);
                      if (var6 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  param2 = ((pk) this).a(param0 - -1, param3, param2, 0);
                  break L4;
                } else {
                  break L4;
                }
              }
              L6: {
                if (((pk) this).field_o == null) {
                  break L6;
                } else {
                  L7: {
                    StringBuilder discarded$14 = param2.append(" listener=");
                    if (((pk) this).field_o instanceof pk) {
                      break L7;
                    } else {
                      StringBuilder discarded$15 = param2.append(((pk) this).field_o);
                      if (var6 == 0) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  param2 = ((pk) this).a(param0 - -1, param3, param2, 0);
                  break L6;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5;
            stackOut_21_1 = new StringBuilder().append("pk.OB(").append(param0).append(44).append(param1).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          L9: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param3 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, pk param5, int param6) {
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
            if (param2 == -1) {
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
            stackOut_5_1 = new StringBuilder().append("pk.RA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param5 == null) {
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
          throw qo.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param6 + 41);
        }
        return stackIn_4_0 != 0;
    }

    public final String toString() {
        return ((pk) this).a(0, new Hashtable(), new StringBuilder(), 0).toString();
    }

    void a(int param0, int param1, byte param2, int param3) {
        Object var6 = null;
        if (param3 == 0) {
          if (((pk) this).field_w != null) {
            ((pk) this).field_w.a((pk) this, param1, 5592405, true, param0);
            if (param2 >= -35) {
              var6 = null;
              boolean discarded$6 = ((pk) this).a((pk) null, (byte) -58);
              return;
            } else {
              return;
            }
          } else {
            if (param2 >= -35) {
              var6 = null;
              boolean discarded$7 = ((pk) this).a((pk) null, (byte) -58);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param2 >= -35) {
            var6 = null;
            boolean discarded$8 = ((pk) this).a((pk) null, (byte) -58);
            return;
          } else {
            return;
          }
        }
    }

    pk(String param0, qm param1) {
        this(param0, ks.field_x.field_e, param1);
    }

    final static boolean a(int param0, int param1, int param2) {
        if (param2 != 52) {
            return true;
        }
        return 0 != (param0 & 52) ? true : false;
    }

    boolean a(pk param0, byte param1) {
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
            if (param1 == 61) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              String discarded$2 = ((pk) this).toString();
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("pk.Q(");
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
          throw qo.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0 != 0;
    }

    void c(byte param0) {
        int var2 = -25 / ((64 - param0) / 51);
    }

    int e(int param0) {
        int var2 = -90 / ((-10 - param0) / 46);
        return 0;
    }

    final boolean a(char param0, int param1, boolean param2) {
        int var4 = 0;
        if (!((pk) this).d(-1)) {
            if (!param2) {
                ((pk) this).a(-3, -1, (byte) 78, -21);
                var4 = param1;
                if (var4 != 80) {
                    return false;
                }
                return ((pk) this).a((pk) this, (byte) 61);
            }
            var4 = param1;
            if (!(var4 != 80)) {
                return ((pk) this).a((pk) this, (byte) 61);
            }
            return false;
        }
        if (!((pk) this).a((pk) this, param0, (byte) 108, param1)) {
            if (!param2) {
                ((pk) this).a(-3, -1, (byte) 78, -21);
                var4 = param1;
                if (!(var4 != 80)) {
                    return ((pk) this).a((pk) this, (byte) 61);
                }
                return false;
            }
            var4 = param1;
            if (!(var4 != 80)) {
                return ((pk) this).a((pk) this, (byte) 61);
            }
            return false;
        }
        return true;
    }

    boolean a(pk param0, char param1, byte param2, int param3) {
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
            if (param2 > 9) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              ((pk) this).field_k = false;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("pk.KA(");
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
          throw qo.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_3_0 != 0;
    }

    String c(int param0) {
        String stackIn_4_0 = null;
        String stackIn_8_0 = null;
        String stackOut_7_0 = null;
        Object stackOut_6_0 = null;
        String stackOut_3_0 = null;
        Object stackOut_2_0 = null;
        if (param0 != -6696) {
          L0: {
            ((pk) this).field_n = -60;
            if (((pk) this).field_k) {
              stackOut_7_0 = ((pk) this).field_t;
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
            if (((pk) this).field_k) {
              stackOut_3_0 = ((pk) this).field_t;
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

    protected pk() {
        ((pk) this).field_n = 0;
        ((pk) this).field_s = 0;
    }

    pk(String param0, mh param1, qm param2) {
        RuntimeException runtimeException = null;
        de var4 = null;
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
        ((pk) this).field_n = 0;
        ((pk) this).field_s = 0;
        try {
          L0: {
            L1: {
              ((pk) this).field_w = param1;
              ((pk) this).field_m = param0;
              ((pk) this).field_o = param2;
              if (!(((pk) this).field_w instanceof de)) {
                break L1;
              } else {
                var4 = (de) (Object) ((pk) this).field_w;
                ((pk) this).field_q = var4.a((pk) this, (byte) 83);
                ((pk) this).field_p = var4.b((pk) this, (byte) 105);
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
            stackOut_4_1 = new StringBuilder().append("pk.<init>(");
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
          throw qo.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    pk(int param0, int param1, int param2, int param3, mh param4, qm param5) {
        ((pk) this).field_n = 0;
        ((pk) this).field_s = 0;
        try {
            ((pk) this).field_r = param0;
            ((pk) this).field_o = param5;
            ((pk) this).field_p = param3;
            ((pk) this).field_w = param4;
            ((pk) this).field_v = param1;
            ((pk) this).field_q = param2;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "pk.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
