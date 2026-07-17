/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class qa extends lh {
    boolean field_x;
    static int field_k;
    kd field_s;
    int field_u;
    int field_v;
    ch field_p;
    int field_r;
    static bi field_l;
    ne field_w;
    int field_n;
    static String field_o;
    int field_z;
    int field_j;
    int field_y;
    String field_i;
    String field_m;
    static String field_q;
    static String field_t;

    void a(int param0, int param1, int param2, int param3, int param4) {
        ((qa) this).field_z = param2;
        ((qa) this).field_j = param3;
        if (param4 != 80) {
          field_k = 51;
          ((qa) this).field_u = param1;
          ((qa) this).field_y = param0;
          return;
        } else {
          ((qa) this).field_u = param1;
          ((qa) this).field_y = param0;
          return;
        }
    }

    final boolean a(Hashtable param0, int param1, StringBuilder param2, int param3) {
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
            var5_int = 122 % ((8 - param1) / 54);
            if (!param0.containsKey(this)) {
              Object discarded$4 = param0.put(this, this);
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              StringBuilder discarded$5 = param2.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
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
            stackOut_5_1 = new StringBuilder().append("qa.G(");
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
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param1).append(44);
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
          throw pf.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param3 + 41);
        }
        return stackIn_4_0 != 0;
    }

    public static void d(int param0) {
        field_o = null;
        field_t = null;
        field_q = null;
        field_l = null;
        field_q = null;
    }

    public final String toString() {
        return ((qa) this).a(new StringBuilder(), new Hashtable(), 0, -83).toString();
    }

    StringBuilder a(StringBuilder param0, Hashtable param1, int param2, int param3) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
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
        Object stackOut_1_0 = null;
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
            if (param3 < -47) {
              L1: {
                if (((qa) this).a(param1, 108, param0, param2)) {
                  ((qa) this).a(param2, 95, param0, param1);
                  break L1;
                } else {
                  break L1;
                }
              }
              stackOut_6_0 = (StringBuilder) param0;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (StringBuilder) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("qa.S(");
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
            if (param1 == null) {
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
          throw pf.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_7_0;
    }

    boolean a(qa param0, int param1) {
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
            if (param1 <= -26) {
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
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("qa.A(");
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
          throw pf.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
        return stackIn_4_0 != 0;
    }

    void a(int param0, int param1, qa param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        Object stackOut_9_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if (param3 < -85) {
              L1: {
                var5_int = ((qa) this).b(param0, param1, 0, ag.field_f, kc.field_b) ? 1 : 0;
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
                stackOut_5_0 = stackIn_5_0;
                stackIn_7_0 = stackOut_5_0;
                stackIn_6_0 = stackOut_5_0;
                if (((qa) this).field_x) {
                  stackOut_7_0 = stackIn_7_0;
                  stackOut_7_1 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  break L2;
                } else {
                  stackOut_6_0 = stackIn_6_0;
                  stackOut_6_1 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  break L2;
                }
              }
              L3: {
                if (stackIn_8_0 == stackIn_8_1) {
                  break L3;
                } else {
                  L4: {
                    stackOut_9_0 = this;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    if (var5_int == 0) {
                      stackOut_11_0 = this;
                      stackOut_11_1 = 0;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      break L4;
                    } else {
                      stackOut_10_0 = this;
                      stackOut_10_1 = 1;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      break L4;
                    }
                  }
                  ((qa) this).field_x = stackIn_12_1 != 0;
                  if (null == ((qa) this).field_s) {
                    break L3;
                  } else {
                    if (((qa) this).field_s instanceof mb) {
                      ((mb) (Object) ((qa) this).field_s).a(-12999, var5_int != 0, (qa) this);
                      break L3;
                    } else {
                      break L3;
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
          L5: {
            var5 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var5;
            stackOut_17_1 = new StringBuilder().append("qa.I(").append(param0).append(44).append(param1).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param3 + 41);
        }
    }

    boolean a(int param0, boolean param1, int param2, qa param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
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
              if (((qa) this).b(param0, param6, 0, param4, param2)) {
                ((qa) this).field_v = param5;
                break L1;
              } else {
                break L1;
              }
            }
            if (param1) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              ((qa) this).field_p = null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var8;
            stackOut_7_1 = new StringBuilder().append("qa.K(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
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
          throw pf.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_6_0 != 0;
    }

    final static void a(byte param0, int param1) {
        try {
            try {
                Object discarded$0 = eb.a("resizing", new Object[1], -11745, rl.a((byte) -116));
            } catch (Throwable throwable) {
            }
            int var2 = -46 % ((43 - param0) / 61);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(int param0, int param1, boolean param2, int param3) {
        int var5 = 0;
        pk var6 = null;
        int var7 = 0;
        var7 = fleas.field_A ? 1 : 0;
        ((qa) this).a(param0, param3, (qa) this, (byte) -111);
        var5 = ((qa) this).e(1) ? 1 : 0;
        if (!param2) {
          L0: {
            if (var5 == 0) {
              break L0;
            } else {
              if (jk.field_r == 0) {
                break L0;
              } else {
                ((qa) this).f(-1);
                ta.field_u = kc.field_f;
                if (param1 >= 38) {
                  df.a(0, ((qa) this).g(4));
                  return param2;
                } else {
                  return false;
                }
              }
            }
          }
          ta.field_u = kc.field_f;
          if (param1 >= 38) {
            df.a(0, ((qa) this).g(4));
            return param2;
          } else {
            return false;
          }
        } else {
          if (al.field_f != 0) {
            if (var5 != 0) {
              L1: {
                boolean discarded$1 = ((qa) this).a(param0, (qa) this, kc.field_b, -31628, ag.field_f, param3, al.field_f);
                if (jk.field_r == 0) {
                  break L1;
                } else {
                  if (((qa) this).a(param0, true, ob.field_e, (qa) this, pb.field_d, jk.field_r, param3)) {
                    param2 = false;
                    break L1;
                  } else {
                    if (var5 == 0) {
                      break L1;
                    } else {
                      ((qa) this).f(-1);
                      if (var7 == 0) {
                        break L1;
                      } else {
                        L2: {
                          param2 = false;
                          if (0 != kc.field_f) {
                            break L2;
                          } else {
                            if (ta.field_u != 0) {
                              L3: {
                                ((qa) this).a((byte) 5, (qa) this, param3, ag.field_f, kc.field_b, param0);
                                var6 = wi.field_e;
                                if (var6 != null) {
                                  L4: {
                                    if (var6.field_s instanceof vd) {
                                      ((vd) (Object) var6.field_s).a(var6, (qj) null, (byte) -46);
                                      break L4;
                                    } else {
                                      break L4;
                                    }
                                  }
                                  wi.field_e = null;
                                  break L3;
                                } else {
                                  break L3;
                                }
                              }
                              if (var7 == 0) {
                                break L2;
                              } else {
                                if (var5 == 0) {
                                  break L2;
                                } else {
                                  if (jk.field_r == 0) {
                                    break L2;
                                  } else {
                                    ((qa) this).f(-1);
                                    break L2;
                                  }
                                }
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                        ta.field_u = kc.field_f;
                        if (param1 >= 38) {
                          df.a(0, ((qa) this).g(4));
                          return param2;
                        } else {
                          return false;
                        }
                      }
                    }
                  }
                }
              }
              if (0 == kc.field_f) {
                if (ta.field_u != 0) {
                  L5: {
                    ((qa) this).a((byte) 5, (qa) this, param3, ag.field_f, kc.field_b, param0);
                    var6 = wi.field_e;
                    if (var6 != null) {
                      L6: {
                        if (var6.field_s instanceof vd) {
                          ((vd) (Object) var6.field_s).a(var6, (qj) null, (byte) -46);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      wi.field_e = null;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L7: {
                    if (var7 == 0) {
                      break L7;
                    } else {
                      if (var5 == 0) {
                        break L7;
                      } else {
                        if (jk.field_r == 0) {
                          break L7;
                        } else {
                          ((qa) this).f(-1);
                          ta.field_u = kc.field_f;
                          if (param1 >= 38) {
                            df.a(0, ((qa) this).g(4));
                            return param2;
                          } else {
                            return false;
                          }
                        }
                      }
                    }
                  }
                  ta.field_u = kc.field_f;
                  if (param1 >= 38) {
                    df.a(0, ((qa) this).g(4));
                    return param2;
                  } else {
                    return false;
                  }
                } else {
                  ta.field_u = kc.field_f;
                  if (param1 >= 38) {
                    df.a(0, ((qa) this).g(4));
                    return param2;
                  } else {
                    return false;
                  }
                }
              } else {
                ta.field_u = kc.field_f;
                if (param1 >= 38) {
                  df.a(0, ((qa) this).g(4));
                  return param2;
                } else {
                  return false;
                }
              }
            } else {
              L8: {
                if (jk.field_r == 0) {
                  break L8;
                } else {
                  if (((qa) this).a(param0, true, ob.field_e, (qa) this, pb.field_d, jk.field_r, param3)) {
                    param2 = false;
                    break L8;
                  } else {
                    if (var5 == 0) {
                      break L8;
                    } else {
                      ((qa) this).f(-1);
                      if (var7 == 0) {
                        break L8;
                      } else {
                        L9: {
                          param2 = false;
                          if (0 != kc.field_f) {
                            break L9;
                          } else {
                            if (ta.field_u != 0) {
                              L10: {
                                ((qa) this).a((byte) 5, (qa) this, param3, ag.field_f, kc.field_b, param0);
                                var6 = wi.field_e;
                                if (var6 != null) {
                                  L11: {
                                    if (var6.field_s instanceof vd) {
                                      ((vd) (Object) var6.field_s).a(var6, (qj) null, (byte) -46);
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  }
                                  wi.field_e = null;
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              if (var7 == 0) {
                                break L9;
                              } else {
                                if (var5 == 0) {
                                  break L9;
                                } else {
                                  if (jk.field_r == 0) {
                                    break L9;
                                  } else {
                                    ((qa) this).f(-1);
                                    ta.field_u = kc.field_f;
                                    if (param1 < 38) {
                                      return false;
                                    } else {
                                      df.a(0, ((qa) this).g(4));
                                      return param2;
                                    }
                                  }
                                }
                              }
                            } else {
                              ta.field_u = kc.field_f;
                              if (param1 < 38) {
                                return false;
                              } else {
                                df.a(0, ((qa) this).g(4));
                                return param2;
                              }
                            }
                          }
                        }
                        ta.field_u = kc.field_f;
                        if (param1 < 38) {
                          return false;
                        } else {
                          df.a(0, ((qa) this).g(4));
                          return param2;
                        }
                      }
                    }
                  }
                }
              }
              L12: {
                if (0 != kc.field_f) {
                  break L12;
                } else {
                  if (ta.field_u != 0) {
                    L13: {
                      ((qa) this).a((byte) 5, (qa) this, param3, ag.field_f, kc.field_b, param0);
                      var6 = wi.field_e;
                      if (var6 != null) {
                        L14: {
                          if (var6.field_s instanceof vd) {
                            ((vd) (Object) var6.field_s).a(var6, (qj) null, (byte) -46);
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        wi.field_e = null;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    if (var7 == 0) {
                      break L12;
                    } else {
                      if (var5 == 0) {
                        break L12;
                      } else {
                        if (jk.field_r == 0) {
                          break L12;
                        } else {
                          ((qa) this).f(-1);
                          ta.field_u = kc.field_f;
                          if (param1 >= 38) {
                            df.a(0, ((qa) this).g(4));
                            return param2;
                          } else {
                            return false;
                          }
                        }
                      }
                    }
                  } else {
                    ta.field_u = kc.field_f;
                    if (param1 < 38) {
                      return false;
                    } else {
                      df.a(0, ((qa) this).g(4));
                      return param2;
                    }
                  }
                }
              }
              ta.field_u = kc.field_f;
              if (param1 >= 38) {
                df.a(0, ((qa) this).g(4));
                return param2;
              } else {
                return false;
              }
            }
          } else {
            L15: {
              if (jk.field_r == 0) {
                break L15;
              } else {
                if (((qa) this).a(param0, true, ob.field_e, (qa) this, pb.field_d, jk.field_r, param3)) {
                  param2 = false;
                  break L15;
                } else {
                  if (var5 == 0) {
                    break L15;
                  } else {
                    ((qa) this).f(-1);
                    if (var7 == 0) {
                      break L15;
                    } else {
                      L16: {
                        param2 = false;
                        if (0 != kc.field_f) {
                          break L16;
                        } else {
                          if (ta.field_u != 0) {
                            L17: {
                              ((qa) this).a((byte) 5, (qa) this, param3, ag.field_f, kc.field_b, param0);
                              var6 = wi.field_e;
                              if (var6 != null) {
                                L18: {
                                  if (var6.field_s instanceof vd) {
                                    ((vd) (Object) var6.field_s).a(var6, (qj) null, (byte) -46);
                                    break L18;
                                  } else {
                                    break L18;
                                  }
                                }
                                wi.field_e = null;
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            if (var7 == 0) {
                              break L16;
                            } else {
                              if (var5 == 0) {
                                break L16;
                              } else {
                                if (jk.field_r == 0) {
                                  break L16;
                                } else {
                                  ((qa) this).f(-1);
                                  break L16;
                                }
                              }
                            }
                          } else {
                            break L16;
                          }
                        }
                      }
                      ta.field_u = kc.field_f;
                      if (param1 < 38) {
                        return false;
                      } else {
                        df.a(0, ((qa) this).g(4));
                        return param2;
                      }
                    }
                  }
                }
              }
            }
            L19: {
              if (0 != kc.field_f) {
                break L19;
              } else {
                if (ta.field_u != 0) {
                  L20: {
                    ((qa) this).a((byte) 5, (qa) this, param3, ag.field_f, kc.field_b, param0);
                    var6 = wi.field_e;
                    if (var6 != null) {
                      L21: {
                        if (var6.field_s instanceof vd) {
                          ((vd) (Object) var6.field_s).a(var6, (qj) null, (byte) -46);
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      wi.field_e = null;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  if (var7 == 0) {
                    break L19;
                  } else {
                    if (var5 == 0) {
                      break L19;
                    } else {
                      if (jk.field_r == 0) {
                        break L19;
                      } else {
                        ((qa) this).f(-1);
                        ta.field_u = kc.field_f;
                        if (param1 < 38) {
                          return false;
                        } else {
                          df.a(0, ((qa) this).g(4));
                          return param2;
                        }
                      }
                    }
                  }
                } else {
                  ta.field_u = kc.field_f;
                  if (param1 < 38) {
                    return false;
                  } else {
                    df.a(0, ((qa) this).g(4));
                    return param2;
                  }
                }
              }
            }
            ta.field_u = kc.field_f;
            if (param1 < 38) {
              return false;
            } else {
              df.a(0, ((qa) this).g(4));
              return param2;
            }
          }
        }
    }

    void f(int param0) {
        if (param0 != -1) {
            ((qa) this).field_m = null;
        }
    }

    final static dd h(int param0) {
        int var1 = 0;
        byte[] var2 = null;
        int[] var3 = null;
        int var4_int = 0;
        dd var4 = null;
        int var5 = 0;
        var5 = fleas.field_A ? 1 : 0;
        var1 = ob.field_a[0] * ij.field_H[0];
        var2 = of.field_d[0];
        var3 = new int[var1];
        var4_int = 0;
        L0: while (true) {
          L1: {
            if (var1 <= var4_int) {
              break L1;
            } else {
              var3[var4_int] = rd.field_d[sc.a((int) var2[var4_int], 255)];
              var4_int++;
              if (var5 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          var4 = new dd(e.field_e, uf.field_k, vg.field_I[0], b.field_b[0], ij.field_H[0], ob.field_a[0], var3);
          c.o(-28210);
          return var4;
        }
    }

    String g(int param0) {
        if (param0 == 4) {
          if (!((qa) this).field_x) {
            return null;
          } else {
            return ((qa) this).field_m;
          }
        } else {
          boolean discarded$9 = ((qa) this).a('P', (byte) 48, 41);
          if (!((qa) this).field_x) {
            return null;
          } else {
            return ((qa) this).field_m;
          }
        }
    }

    qa(String param0, kd param1) {
        this(param0, nf.field_M.field_i, param1);
    }

    final void a(int param0, int param1, StringBuilder param2, Hashtable param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
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
        var6 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              StringBuilder discarded$8 = param2.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(((qa) this).field_y).append(",").append(((qa) this).field_z).append(" ").append(((qa) this).field_u).append("x").append(((qa) this).field_j);
              if (null == ((qa) this).field_i) {
                break L1;
              } else {
                StringBuilder discarded$9 = param2.append(" text=\"").append(((qa) this).field_i).append(34);
                break L1;
              }
            }
            L2: {
              if (((qa) this).field_x) {
                StringBuilder discarded$10 = param2.append(" mouseover");
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!((qa) this).e(1)) {
                break L3;
              } else {
                StringBuilder discarded$11 = param2.append(" focused");
                break L3;
              }
            }
            L4: {
              if (((qa) this).field_p == null) {
                break L4;
              } else {
                L5: {
                  StringBuilder discarded$12 = param2.append(" renderer=");
                  if (!(((qa) this).field_p instanceof qa)) {
                    break L5;
                  } else {
                    param2 = ((qa) this).a(param2, param3, param0 - -1, -71);
                    if (var6 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                StringBuilder discarded$13 = param2.append(((qa) this).field_p);
                break L4;
              }
            }
            L6: {
              var5_int = 27 / ((param1 - 36) / 46);
              if (null != ((qa) this).field_s) {
                L7: {
                  StringBuilder discarded$14 = param2.append(" listener=");
                  if (((qa) this).field_s instanceof qa) {
                    break L7;
                  } else {
                    StringBuilder discarded$15 = param2.append(((qa) this).field_s);
                    if (var6 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                param2 = ((qa) this).a(param2, param3, 1 + param0, -110);
                break L6;
              } else {
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var5;
            stackOut_19_1 = new StringBuilder().append("qa.P(").append(param0).append(44).append(param1).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          L9: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param3 == null) {
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
          throw pf.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
    }

    final void b(boolean param0) {
        ((qa) this).a(((qa) this).field_y, ((qa) this).field_u, ((qa) this).field_z, ((qa) this).field_j, 80);
        if (param0) {
            String discarded$0 = ((qa) this).g(-71);
        }
    }

    void b(int param0, int param1, boolean param2, int param3) {
        if (param2) {
          if (0 == param3) {
            if (null == ((qa) this).field_p) {
              return;
            } else {
              ((qa) this).field_p.a(-96, param1, true, (qa) this, param0);
              return;
            }
          } else {
            return;
          }
        } else {
          field_o = null;
          if (0 != param3) {
            return;
          } else {
            L0: {
              if (null != ((qa) this).field_p) {
                ((qa) this).field_p.a(-96, param1, true, (qa) this, param0);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          }
        }
    }

    int c(byte param0) {
        if (param0 != 8) {
            field_o = null;
            return 0;
        }
        return 0;
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        var6 = fleas.field_A ? 1 : 0;
        var4 = ((qa) this).c((byte) 8);
        var5_int = param0;
        L0: while (true) {
          L1: {
            if (var4 < var5_int) {
              break L1;
            } else {
              ((qa) this).b(param1, param2, true, var5_int);
              var5_int++;
              if (var6 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            var5 = oe.a(param0 ^ 19007);
            if (var5 != null) {
              nf.field_M.a(param0 + 13421772, aa.field_t, var5, gg.field_f);
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
    }

    boolean a(int param0, int param1, qa param2, char param3) {
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
            L1: {
              if (param0 == -2) {
                break L1;
              } else {
                ((qa) this).a(46, -115, (StringBuilder) null, (Hashtable) null);
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
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("qa.N(").append(param0).append(44).append(param1).append(44);
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
          throw pf.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param3 + 41);
        }
        return stackIn_3_0 != 0;
    }

    void a(byte param0, qa param1, int param2, int param3, int param4, int param5) {
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
              ((qa) this).field_v = 0;
              if (param0 == 5) {
                break L1;
              } else {
                qa.d(-24);
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
            stackOut_3_1 = new StringBuilder().append("qa.R(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          throw pf.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final boolean a(char param0, byte param1, int param2) {
        int var4 = 0;
        if (param1 <= -15) {
          if (((qa) this).e(1)) {
            if (!((qa) this).a(-2, param2, (qa) this, param0)) {
              var4 = param2;
              if (80 == var4) {
                return ((qa) this).a((qa) this, -124);
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            var4 = param2;
            if (80 == var4) {
              return ((qa) this).a((qa) this, -124);
            } else {
              return false;
            }
          }
        } else {
          dd discarded$5 = qa.h(111);
          if (((qa) this).e(1)) {
            if (!((qa) this).a(-2, param2, (qa) this, param0)) {
              var4 = param2;
              if (80 == var4) {
                return ((qa) this).a((qa) this, -124);
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            var4 = param2;
            if (80 == var4) {
              return ((qa) this).a((qa) this, -124);
            } else {
              return false;
            }
          }
        }
    }

    boolean a(int param0, qa param1, int param2, int param3, int param4, int param5, int param6) {
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
            if (param3 == -31628) {
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
            stackOut_5_1 = new StringBuilder().append("qa.O(").append(param0).append(44);
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
          throw pf.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_4_0 != 0;
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4) {
        if (param2 == 0) {
          if (param1 - -((qa) this).field_y <= param3) {
            if (param4 >= param0 + ((qa) this).field_z) {
              if (((qa) this).field_u + param1 - -((qa) this).field_y > param3) {
                if (((qa) this).field_j + param0 + ((qa) this).field_z <= param4) {
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
          return true;
        }
    }

    protected qa() {
        ((qa) this).field_n = 0;
        ((qa) this).field_r = 0;
    }

    qa(String param0, ch param1, kd param2) {
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
        ((qa) this).field_n = 0;
        ((qa) this).field_r = 0;
        try {
          L0: {
            L1: {
              ((qa) this).field_s = param2;
              ((qa) this).field_i = param0;
              ((qa) this).field_p = param1;
              if (!(((qa) this).field_p instanceof eg)) {
                break L1;
              } else {
                var4 = (eg) (Object) ((qa) this).field_p;
                ((qa) this).field_u = var4.a(-110, (qa) this);
                ((qa) this).field_j = var4.b(-101, (qa) this);
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
            stackOut_4_1 = new StringBuilder().append("qa.<init>(");
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
          throw pf.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    qa(int param0, int param1, int param2, int param3, ch param4, kd param5) {
        ((qa) this).field_n = 0;
        ((qa) this).field_r = 0;
        try {
            ((qa) this).field_j = param3;
            ((qa) this).field_y = param0;
            ((qa) this).field_p = param4;
            ((qa) this).field_s = param5;
            ((qa) this).field_u = param2;
            ((qa) this).field_z = param1;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "qa.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    boolean e(int param0) {
        if (param0 != 1) {
            boolean discarded$0 = ((qa) this).a(-97, -125, (qa) null, 'ﾹ');
            return false;
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "<%0>Slopes:<%1> Fleas can climb these.";
        field_k = 4;
        field_q = "They can only be placed on empty squares.";
        field_t = "Passwords can only contain letters and numbers";
    }
}
