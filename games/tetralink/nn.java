/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class nn extends ae {
    private int field_P;
    private long field_bb;
    static int[] field_S;
    static boolean field_X;
    static boolean field_R;
    private boolean field_Z;
    static ah field_T;
    private int field_ab;
    static int field_cb;
    private boolean field_W;
    private int field_Q;
    static byte[] field_Y;
    private int field_V;
    private long field_U;

    private final void m(int param0) {
        if (!(!(((nn) this).field_s instanceof ih))) {
            ((ih) (Object) ((nn) this).field_s).a((nn) this, (byte) 101);
        }
        if (param0 != 82) {
            Object var3 = null;
            this.a((String) null, false);
        }
    }

    nn(String param0, dn param1, int param2) {
        super(param0, param1);
        ((nn) this).field_Z = false;
        ((nn) this).field_ab = -1;
        ((nn) this).field_U = 0L;
        try {
            ((nn) this).field_P = param2;
            ((nn) this).field_H = dh.field_q.field_r;
            ((nn) this).a(true, 103, param0);
            ((nn) this).field_W = true;
            ((nn) this).field_bb = k.a(0);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "nn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean a(na param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        long var8_long = 0L;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            L1: {
              if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
                break L1;
              } else {
                if (((nn) this).field_H instanceof jh) {
                  L2: {
                    var8_int = ((jh) (Object) ((nn) this).field_H).a(param3, param1, a.field_a, aa.field_Nb, (na) this, (byte) -34);
                    stackOut_3_0 = this;
                    stackOut_3_1 = 81;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var8_int == -1) {
                      stackOut_5_0 = this;
                      stackOut_5_1 = stackIn_5_1;
                      stackOut_5_2 = 0;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      stackIn_6_2 = stackOut_5_2;
                      break L2;
                    } else {
                      stackOut_4_0 = this;
                      stackOut_4_1 = stackIn_4_1;
                      stackOut_4_2 = var8_int;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      stackIn_6_2 = stackOut_4_2;
                      break L2;
                    }
                  }
                  L3: {
                    this.c(stackIn_6_1, stackIn_6_2);
                    var8_long = k.a(0);
                    stackOut_6_0 = this;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (-((nn) this).field_U + var8_long >= 250L) {
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
                  L4: {
                    ((nn) this).field_Z = stackIn_9_1 != 0;
                    if (((nn) this).field_Z) {
                      L5: {
                        ((nn) this).field_Q = this.n(-33);
                        ((nn) this).field_V = this.d(false);
                        if (0 >= ((nn) this).field_V) {
                          break L5;
                        } else {
                          if (((nn) this).field_A.charAt(-1 + ((nn) this).field_V) == 32) {
                            ((nn) this).field_V = ((nn) this).field_V - 1;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                      ((nn) this).field_ab = ((nn) this).field_V;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  ((nn) this).field_U = var8_long;
                  stackOut_16_0 = 1;
                  stackIn_17_0 = stackOut_16_0;
                  return stackIn_17_0 != 0;
                } else {
                  break L1;
                }
              }
            }
            if (param4 == -32738) {
              stackOut_21_0 = 0;
              stackIn_22_0 = stackOut_21_0;
              break L0;
            } else {
              stackOut_19_0 = 0;
              stackIn_20_0 = stackOut_19_0;
              return stackIn_20_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var8;
            stackOut_23_1 = new StringBuilder().append("nn.PA(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L6;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_22_0 != 0;
    }

    private final void c(int param0, int param1) {
        ((nn) this).field_V = param1;
        if (!sn.field_a[param0]) {
            ((nn) this).field_Q = ((nn) this).field_V;
        }
    }

    public static void e(boolean param0) {
        field_T = null;
        field_S = null;
        field_Y = null;
    }

    final void a(boolean param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (param1 > 11) {
                break L1;
              } else {
                nn.g((byte) -70);
                break L1;
              }
            }
            L2: {
              if (param2 == null) {
                param2 = "";
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              ((nn) this).field_A = param2;
              var4_int = param2.length();
              if (((nn) this).field_P == -1) {
                break L3;
              } else {
                if (((nn) this).field_P < var4_int) {
                  ((nn) this).field_A = ((nn) this).field_A.substring(0, ((nn) this).field_P);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              int dupTemp$3 = ((nn) this).field_A.length();
              ((nn) this).field_Q = dupTemp$3;
              ((nn) this).field_V = dupTemp$3;
              if (!param0) {
                ((nn) this).j(-12956);
                break L4;
              } else {
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("nn.E(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    final static String a(CharSequence param0, boolean param1, int param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        Object stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        Object stackOut_13_0 = null;
        String stackOut_8_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = TetraLink.field_J;
        try {
          L0: {
            var3 = wg.a(param0, -3, param1);
            if (var3 != null) {
              stackOut_3_0 = (String) var3;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              var4 = 0;
              L1: while (true) {
                if (var4 >= param0.length()) {
                  if (param2 != 82) {
                    field_X = true;
                    stackOut_13_0 = null;
                    stackIn_14_0 = stackOut_13_0;
                    break L0;
                  } else {
                    return null;
                  }
                } else {
                  if (om.a(param0.charAt(var4), false)) {
                    var4++;
                    continue L1;
                  } else {
                    stackOut_8_0 = tc.field_t;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("nn.R(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param1 + ',' + param2 + ')');
        }
        return (String) (Object) stackIn_14_0;
    }

    void a(na param0, int param1, int param2, boolean param3) {
        jh var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              super.a(param0, param1, param2, param3);
              this.h((byte) -85);
              if (((nn) this).field_x == 1) {
                L2: {
                  if (((nn) this).field_H instanceof jh) {
                    var5 = (jh) (Object) ((nn) this).field_H;
                    var6 = var5.a(param2, param1, a.field_a, aa.field_Nb, (na) this, (byte) -34);
                    if (var6 != -1) {
                      L3: {
                        if (!((nn) this).field_Z) {
                          break L3;
                        } else {
                          if (var6 >= ((nn) this).field_ab) {
                            break L3;
                          } else {
                            if (var6 <= ((nn) this).field_Q) {
                              break L3;
                            } else {
                              var6 = ((nn) this).field_ab;
                              break L3;
                            }
                          }
                        }
                      }
                      ((nn) this).field_V = var6;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                ((nn) this).field_bb = k.a(0);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5_ref;
            stackOut_13_1 = new StringBuilder().append("nn.MA(");
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
          throw oi.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final String g(int param0) {
        int var2 = ((nn) this).field_V <= ((nn) this).field_Q ? ((nn) this).field_V : ((nn) this).field_Q;
        if (param0 < 43) {
            return null;
        }
        int var3 = ((nn) this).field_Q >= ((nn) this).field_V ? ((nn) this).field_Q : ((nn) this).field_V;
        return ((nn) this).field_A.substring(var2, var3);
    }

    final void k(int param0) {
        ((nn) this).field_A = "";
        ((nn) this).field_Q = 0;
        ((nn) this).field_V = param0;
        ((nn) this).j(-12956);
    }

    private final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (((nn) this).field_V != ((nn) this).field_Q) {
            var2 = ((nn) this).field_V > ((nn) this).field_Q ? ((nn) this).field_Q : ((nn) this).field_V;
            var3 = ((nn) this).field_Q >= ((nn) this).field_V ? ((nn) this).field_Q : ((nn) this).field_V;
            ((nn) this).field_Q = var2;
            ((nn) this).field_V = var2;
            ((nn) this).field_A = ((nn) this).field_A.substring(0, var2) + ((nn) this).field_A.substring(var3, ((nn) this).field_A.length());
            ((nn) this).j(-12956);
        }
        if (param0 != 1) {
            Object var4 = null;
            ((nn) this).a(false, -8, (String) null);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        jh var8 = null;
        long var6 = 0L;
        if (param0 != 0) {
            return;
        }
        if (((nn) this).field_H != null) {
            if (!(0 != param3)) {
                ((nn) this).field_H.a((na) this, param1, param2, true, ((nn) this).field_K);
                if (((nn) this).field_H instanceof jh) {
                    var8 = (jh) (Object) ((nn) this).field_H;
                    if (((nn) this).field_Q != ((nn) this).field_V) {
                        var8.a(((nn) this).field_Q, 18985, ((nn) this).field_V, param1, param2, (na) this);
                    }
                    var6 = k.a(param0);
                    if ((var6 - ((nn) this).field_bb) % 1000L < 500L) {
                        var8.a((na) this, param2, ((nn) this).field_V, 0, param1);
                    }
                }
            }
        }
    }

    final static int f(byte param0) {
        if (param0 >= -43) {
            int discarded$0 = nn.f((byte) -110);
        }
        return -ja.field_j + hd.field_q;
    }

    final boolean a(int param0, char param1, int param2, na param3) {
        RuntimeException var5 = null;
        int stackIn_6_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_57_0 = 0;
        Object stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        Object stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        Object stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        int stackIn_63_2 = 0;
        int stackIn_64_0 = 0;
        Object stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        Object stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        Object stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        int stackIn_69_2 = 0;
        int stackIn_70_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_74_0 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_71_0 = 0;
        Object stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        Object stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        int stackOut_68_2 = 0;
        Object stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        int stackOut_67_2 = 0;
        int stackOut_69_0 = 0;
        Object stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        Object stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        int stackOut_62_2 = 0;
        Object stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        int stackOut_61_2 = 0;
        int stackOut_63_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        try {
          L0: {
            L1: {
              ((nn) this).field_bb = k.a(param2 + -1);
              if (param2 == 1) {
                break L1;
              } else {
                int discarded$2 = nn.i(88);
                break L1;
              }
            }
            L2: {
              if (param1 == 60) {
                break L2;
              } else {
                if (param1 == 62) {
                  break L2;
                } else {
                  L3: {
                    if (param1 < 32) {
                      break L3;
                    } else {
                      if (126 < param1) {
                        break L3;
                      } else {
                        L4: {
                          if (((nn) this).field_V == ((nn) this).field_Q) {
                            break L4;
                          } else {
                            this.h(param2);
                            break L4;
                          }
                        }
                        L5: {
                          if (((nn) this).field_P == -1) {
                            break L5;
                          } else {
                            if (~((nn) this).field_A.length() > ~((nn) this).field_P) {
                              break L5;
                            } else {
                              return true;
                            }
                          }
                        }
                        L6: {
                          if (((nn) this).field_V >= ((nn) this).field_A.length()) {
                            ((nn) this).field_A = ((nn) this).field_A + param1;
                            int dupTemp$3 = ((nn) this).field_A.length();
                            ((nn) this).field_V = dupTemp$3;
                            ((nn) this).field_Q = dupTemp$3;
                            break L6;
                          } else {
                            ((nn) this).field_A = ((nn) this).field_A.substring(0, ((nn) this).field_V) + param1 + ((nn) this).field_A.substring(((nn) this).field_V, ((nn) this).field_A.length());
                            ((nn) this).field_V = ((nn) this).field_V + 1;
                            ((nn) this).field_Q = ((nn) this).field_V;
                            break L6;
                          }
                        }
                        ((nn) this).j(param2 + -12957);
                        stackOut_17_0 = 1;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0 != 0;
                      }
                    }
                  }
                  L7: {
                    if (param0 != 85) {
                      if (101 != param0) {
                        if (param0 == 13) {
                          ((nn) this).k(0);
                          stackOut_71_0 = 1;
                          stackIn_72_0 = stackOut_71_0;
                          return stackIn_72_0 != 0;
                        } else {
                          if (96 == param0) {
                            if (((nn) this).field_V <= 0) {
                              break L7;
                            } else {
                              L8: {
                                stackOut_66_0 = this;
                                stackOut_66_1 = 81;
                                stackIn_68_0 = stackOut_66_0;
                                stackIn_68_1 = stackOut_66_1;
                                stackIn_67_0 = stackOut_66_0;
                                stackIn_67_1 = stackOut_66_1;
                                if (!sn.field_a[82]) {
                                  stackOut_68_0 = this;
                                  stackOut_68_1 = stackIn_68_1;
                                  stackOut_68_2 = ((nn) this).field_V + -1;
                                  stackIn_69_0 = stackOut_68_0;
                                  stackIn_69_1 = stackOut_68_1;
                                  stackIn_69_2 = stackOut_68_2;
                                  break L8;
                                } else {
                                  stackOut_67_0 = this;
                                  stackOut_67_1 = stackIn_67_1;
                                  stackOut_67_2 = this.n(param2 ^ -34);
                                  stackIn_69_0 = stackOut_67_0;
                                  stackIn_69_1 = stackOut_67_1;
                                  stackIn_69_2 = stackOut_67_2;
                                  break L8;
                                }
                              }
                              this.c(stackIn_69_1, stackIn_69_2);
                              stackOut_69_0 = 1;
                              stackIn_70_0 = stackOut_69_0;
                              return stackIn_70_0 != 0;
                            }
                          } else {
                            if (param0 == 97) {
                              if (~((nn) this).field_V > ~((nn) this).field_A.length()) {
                                L9: {
                                  stackOut_60_0 = this;
                                  stackOut_60_1 = 81;
                                  stackIn_62_0 = stackOut_60_0;
                                  stackIn_62_1 = stackOut_60_1;
                                  stackIn_61_0 = stackOut_60_0;
                                  stackIn_61_1 = stackOut_60_1;
                                  if (!sn.field_a[82]) {
                                    stackOut_62_0 = this;
                                    stackOut_62_1 = stackIn_62_1;
                                    stackOut_62_2 = ((nn) this).field_V - -1;
                                    stackIn_63_0 = stackOut_62_0;
                                    stackIn_63_1 = stackOut_62_1;
                                    stackIn_63_2 = stackOut_62_2;
                                    break L9;
                                  } else {
                                    stackOut_61_0 = this;
                                    stackOut_61_1 = stackIn_61_1;
                                    stackOut_61_2 = this.d(false);
                                    stackIn_63_0 = stackOut_61_0;
                                    stackIn_63_1 = stackOut_61_1;
                                    stackIn_63_2 = stackOut_61_2;
                                    break L9;
                                  }
                                }
                                this.c(stackIn_63_1, stackIn_63_2);
                                stackOut_63_0 = 1;
                                stackIn_64_0 = stackOut_63_0;
                                return stackIn_64_0 != 0;
                              } else {
                                break L7;
                              }
                            } else {
                              if (param0 != 102) {
                                if (param0 != 103) {
                                  if (param0 == 84) {
                                    this.m(param2 ^ 83);
                                    stackOut_56_0 = 1;
                                    stackIn_57_0 = stackOut_56_0;
                                    return stackIn_57_0 != 0;
                                  } else {
                                    L10: {
                                      if (!sn.field_a[82]) {
                                        break L10;
                                      } else {
                                        if (param0 == 65) {
                                          this.f(true);
                                          stackOut_54_0 = 1;
                                          stackIn_55_0 = stackOut_54_0;
                                          return stackIn_55_0 != 0;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    L11: {
                                      if (!sn.field_a[82]) {
                                        break L11;
                                      } else {
                                        if (param0 != 66) {
                                          break L11;
                                        } else {
                                          this.l(83);
                                          stackOut_48_0 = 1;
                                          stackIn_49_0 = stackOut_48_0;
                                          return stackIn_49_0 != 0;
                                        }
                                      }
                                    }
                                    if (!sn.field_a[82]) {
                                      break L7;
                                    } else {
                                      if (67 != param0) {
                                        break L7;
                                      } else {
                                        this.e((byte) 77);
                                        stackOut_52_0 = 1;
                                        stackIn_53_0 = stackOut_52_0;
                                        return stackIn_53_0 != 0;
                                      }
                                    }
                                  }
                                } else {
                                  this.c(param2 + 80, ((nn) this).field_A.length());
                                  stackOut_40_0 = 1;
                                  stackIn_41_0 = stackOut_40_0;
                                  return stackIn_41_0 != 0;
                                }
                              } else {
                                this.c(81, 0);
                                stackOut_37_0 = 1;
                                stackIn_38_0 = stackOut_37_0;
                                return stackIn_38_0 != 0;
                              }
                            }
                          }
                        }
                      } else {
                        if (((nn) this).field_V != ((nn) this).field_Q) {
                          this.h(1);
                          stackOut_31_0 = 1;
                          stackIn_32_0 = stackOut_31_0;
                          return stackIn_32_0 != 0;
                        } else {
                          if (~((nn) this).field_V <= ~((nn) this).field_A.length()) {
                            break L7;
                          } else {
                            ((nn) this).field_Q = 1 + ((nn) this).field_V;
                            this.h(1);
                            stackOut_29_0 = 1;
                            stackIn_30_0 = stackOut_29_0;
                            return stackIn_30_0 != 0;
                          }
                        }
                      }
                    } else {
                      if (~((nn) this).field_V != ~((nn) this).field_Q) {
                        this.h(1);
                        stackOut_24_0 = 1;
                        stackIn_25_0 = stackOut_24_0;
                        return stackIn_25_0 != 0;
                      } else {
                        if (((nn) this).field_V <= 0) {
                          break L7;
                        } else {
                          ((nn) this).field_Q = ((nn) this).field_V - 1;
                          this.h(1);
                          stackOut_22_0 = 1;
                          stackIn_23_0 = stackOut_22_0;
                          return stackIn_23_0 != 0;
                        }
                      }
                    }
                  }
                  stackOut_73_0 = 0;
                  stackIn_74_0 = stackOut_73_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            return stackIn_6_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackOut_75_0 = (RuntimeException) var5;
            stackOut_75_1 = new StringBuilder().append("nn.DB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_77_0 = stackOut_75_0;
            stackIn_77_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param3 == null) {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L12;
            } else {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "{...}";
              stackIn_78_0 = stackOut_76_0;
              stackIn_78_1 = stackOut_76_1;
              stackIn_78_2 = stackOut_76_2;
              break L12;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_78_0, stackIn_78_2 + ')');
        }
        return stackIn_74_0 != 0;
    }

    private final void f(boolean param0) {
        this.l(93);
        this.h(1);
    }

    private final int n(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = TetraLink.field_J;
        if (((nn) this).field_V != 0) {
          L0: {
            if (param0 == -33) {
              break L0;
            } else {
              field_Y = null;
              break L0;
            }
          }
          var2 = ((nn) this).field_V - 1;
          L1: while (true) {
            L2: {
              if (var2 <= 0) {
                break L2;
              } else {
                if (((nn) this).field_A.charAt(-1 + var2) == 32) {
                  break L2;
                } else {
                  var2--;
                  continue L1;
                }
              }
            }
            return var2;
          }
        } else {
          return ((nn) this).field_V;
        }
    }

    final static void g(byte param0) {
        int var1_int = 0;
        int var2 = TetraLink.field_J;
        try {
            var1_int = 0;
            if (param0 >= -73) {
                Object var3 = null;
                String discarded$0 = nn.a((CharSequence) null, true, 124);
            }
            while (pl.field_d > var1_int) {
                n.field_L[var1_int] = null;
                var1_int++;
            }
            pl.field_d = 0;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "nn.O(" + param0 + ')');
        }
    }

    void j(int param0) {
        if (((nn) this).field_s instanceof ih) {
            ((ih) (Object) ((nn) this).field_s).a((byte) 73, (nn) this);
        }
        if (param0 != -12956) {
            this.e((byte) 22);
        }
    }

    final static int i(int param0) {
        if (param0 < 66) {
            field_T = null;
        }
        return ea.field_a;
    }

    private final void h(byte param0) {
        hi var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        jh var10 = null;
        var9 = TetraLink.field_J;
        if (((nn) this).field_W) {
          if (((nn) this).field_H instanceof jh) {
            var10 = (jh) (Object) ((nn) this).field_H;
            var5 = -2;
            var3 = var10.a((na) this, false);
            var4 = var3.b((byte) 66);
            var6 = var10.b((na) this, 92);
            var7 = var10.a(true) >> 1;
            if (var4 >= var6 - var7) {
              L0: {
                var8 = ((nn) this).field_E + var3.a(((nn) this).field_V, true);
                if (var8 > -var7 + var6) {
                  ((nn) this).field_E = -var7 - -var6 - (var8 - ((nn) this).field_E);
                  break L0;
                } else {
                  if (var7 > var8) {
                    ((nn) this).field_E = ((nn) this).field_E + (-var8 + var7);
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
              L1: {
                if (((nn) this).field_E > 0) {
                  ((nn) this).field_E = 0;
                  break L1;
                } else {
                  if (-var6 - -var7 > ((nn) this).field_E) {
                    ((nn) this).field_E = -var6 - -var7;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              return;
            } else {
              ((nn) this).field_o = 0;
              ((nn) this).field_E = 0;
              return;
            }
          } else {
            return;
          }
        } else {
          ((nn) this).field_o = 0;
          ((nn) this).field_E = 0;
          return;
        }
    }

    private final void a(String param0, boolean param1) {
        int var3_int = 0;
        if (!(((nn) this).field_P == -1)) {
            var3_int = ((nn) this).field_P + -((nn) this).field_A.length();
            if (0 <= var3_int) {
                return;
            }
            param0 = param0.substring(0, var3_int);
        }
        if (!param1) {
            return;
        }
        try {
            if (((nn) this).field_V == ((nn) this).field_A.length()) {
                ((nn) this).field_A = ((nn) this).field_A + param0;
            } else {
                ((nn) this).field_A = ((nn) this).field_A.substring(0, ((nn) this).field_V) + param0 + ((nn) this).field_A.substring(((nn) this).field_V, ((nn) this).field_A.length());
            }
            ((nn) this).field_V = ((nn) this).field_V + param0.length();
            ((nn) this).field_Q = ((nn) this).field_V;
            ((nn) this).j(-12956);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "nn.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void e(byte param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                  this.h(1);
                  this.a(var2, true);
                  if (param0 >= 29) {
                    break L1;
                  } else {
                    ((nn) this).field_P = -31;
                    break L1;
                  }
                }
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2_ref = (Exception) (Object) decompiledCaughtException;
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void l(int param0) {
        String var2 = this.g(46);
        if (param0 <= 26) {
            return;
        }
        if (!(var2.length() <= 0)) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.g(71)), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    private final int d(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = TetraLink.field_J;
        var2 = ((nn) this).field_A.length();
        if (((nn) this).field_V != var2) {
          var3 = 1 + ((nn) this).field_V;
          L0: while (true) {
            L1: {
              if (var2 <= var3) {
                break L1;
              } else {
                if (((nn) this).field_A.charAt(var3 + -1) == 32) {
                  break L1;
                } else {
                  var3++;
                  continue L0;
                }
              }
            }
            return var3;
          }
        } else {
          return ((nn) this).field_V;
        }
    }

    final static void a(String param0, float param1, int param2, boolean param3) {
        try {
            if (nl.field_a == null) {
                nl.field_a = new ug(mf.field_s, wg.field_b);
                mf.field_s.a((na) (Object) nl.field_a, false);
            }
            nl.field_a.a(param0, (byte) -122, param1, param3);
            ra.a();
            i.b(true, 122);
            int var4_int = 0;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "nn.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + -122 + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_cb = 0;
    }
}
