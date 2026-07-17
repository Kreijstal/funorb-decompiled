/*
 * Decompiled by CFR-JS 0.4.0.
 */
class te extends s {
    static String field_J;
    static int field_O;
    static boolean field_G;
    private String[] field_K;
    static String field_L;
    private cc field_H;
    static String[] field_N;
    private im field_I;
    static fk field_M;

    final void a(int param0, byte param1, int param2, int param3) {
        if (param1 != 53) {
            return;
        }
        ((te) this).a(param3, param0, ((rj) (Object) ((te) this).field_j).b((pj) this, true), (byte) -90, param2);
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        ((te) this).a((byte) -127);
    }

    te(String param0, td param1) {
        super(param0, (ag) null);
        ((te) this).field_H = null;
        try {
            ((te) this).field_j = param1;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "te.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, String param1, int param2) {
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
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
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (param2 == 2) {
              L1: {
                L2: {
                  if (null == ((te) this).field_K) {
                    break L2;
                  } else {
                    if (((te) this).field_K.length <= param0) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  var7 = new String[param0 - -1];
                  var8 = var7;
                  var4 = var8;
                  if (null == ((te) this).field_K) {
                    break L3;
                  } else {
                    var5 = 0;
                    L4: while (true) {
                      if (var5 >= ((te) this).field_K.length) {
                        break L3;
                      } else {
                        var7[var5] = ((te) this).field_K[var5];
                        var5++;
                        continue L4;
                      }
                    }
                  }
                }
                ((te) this).field_K = var8;
                break L1;
              }
              ((te) this).field_K[param0] = param1;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) runtimeException;
            stackOut_13_1 = new StringBuilder().append("te.R(").append(param0).append(44);
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
          throw dd.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param2 + 41);
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        rj var3 = null;
        dm var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        ed var12 = null;
        int var13 = 0;
        int var14 = 0;
        cc var15 = null;
        int var16 = 0;
        Object var17 = null;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        var16 = OrbDefence.field_D ? 1 : 0;
        ((te) this).field_I = new im();
        var2 = 0;
        var3 = (rj) (Object) ((te) this).field_j;
        var4 = var3.a((pj) this, true);
        L0: while (true) {
          var5 = ((te) this).field_l.indexOf("<hotspot=", var2);
          if (var5 == -1) {
            L1: {
              if (param0 == -127) {
                break L1;
              } else {
                var17 = null;
                boolean discarded$1 = ((te) this).a(-25, (pj) null);
                break L1;
              }
            }
            return;
          } else {
            var7 = ((te) this).field_l.indexOf(">", var5);
            var6 = ((te) this).field_l.substring(9 + var5, var7);
            var7 = Integer.parseInt(var6);
            var2 = ((te) this).field_l.indexOf("</hotspot>", var5);
            var8 = var4.a(var5, (byte) 107);
            var9 = var4.a(var2, (byte) 107);
            var10 = null;
            var11 = var8;
            L2: while (true) {
              if (var11 > var9) {
                continue L0;
              } else {
                L3: {
                  var12 = var4.field_c[var11];
                  if (var11 != var8) {
                    stackOut_6_0 = var12.field_g[0];
                    stackIn_7_0 = stackOut_6_0;
                    break L3;
                  } else {
                    stackOut_5_0 = var4.a(param0 ^ 12, var5);
                    stackIn_7_0 = stackOut_5_0;
                    break L3;
                  }
                }
                L4: {
                  var13 = stackIn_7_0;
                  if (var9 != var11) {
                    if (var12 != null) {
                      stackOut_11_0 = var12.field_g[var12.field_g.length - 1];
                      stackIn_12_0 = stackOut_11_0;
                      break L4;
                    } else {
                      stackOut_10_0 = 0;
                      stackIn_12_0 = stackOut_10_0;
                      break L4;
                    }
                  } else {
                    stackOut_8_0 = var4.a(param0 + 32, var2);
                    stackIn_12_0 = stackOut_8_0;
                    break L4;
                  }
                }
                L5: {
                  var14 = stackIn_12_0;
                  var15 = new cc(var7, var13, var12.field_f, -var13 + var14, Math.max(var3.a((byte) -128), -var12.field_f + var12.field_c));
                  if (var10 == null) {
                    break L5;
                  } else {
                    ((cc) var10).field_p = var15;
                    break L5;
                  }
                }
                ((te) this).field_I.a(-92, (ca) (Object) var15);
                var10 = (Object) (Object) var15;
                var11++;
                continue L2;
              }
            }
          }
        }
    }

    final static int j(int param0) {
        return h.field_H;
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (param2 != 1048575) {
            cc discarded$0 = this.a(-110, 35, 78);
        }
        if (param1 != 0) {
            return;
        }
        rj var9 = (rj) (Object) ((te) this).field_j;
        cc var6 = ((te) this).field_H;
        if (var6 == null) {
        } else {
            var7 = var9.a((pj) this, param3, (byte) 54);
            var8 = var9.a((pj) this, 9534, param0);
            do {
                wh.a(var6.field_s + 2, false, -2 + var7 - -var6.field_o, var6.field_n + 2, -2 + var8 - -var6.field_g);
                var6 = var6.field_p;
            } while (var6 != null);
        }
    }

    void a(byte param0, pj param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
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
              super.a(param0, param1, param2, param3);
              ((te) this).field_H = null;
              if (!((te) this).field_t) {
                break L1;
              } else {
                var5_int = ua.field_a + -param2 + -((te) this).field_s;
                var6 = vl.field_d - param3 + -((te) this).field_n;
                ((te) this).field_H = this.a(-2, var6, var5_int);
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
            stackOut_3_1 = new StringBuilder().append("te.A(").append(param0).append(44);
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
          throw dd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param2 + 44 + param3 + 41);
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
            L1: {
              if (param0 == -81) {
                break L1;
              } else {
                ((te) this).b(-120, 119, 43, -76);
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
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("te.E(").append(param0).append(44);
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
        return stackIn_3_0 != 0;
    }

    String g(int param0) {
        if (param0 != -8235) {
            return null;
        }
        if (((te) this).field_H == null) {
            return null;
        }
        if (((te) this).field_K == null) {
            return null;
        }
        if (((te) this).field_K.length <= ((te) this).field_H.field_q) {
            return null;
        }
        return ((te) this).field_K[((te) this).field_H.field_q];
    }

    private final cc a(int param0, int param1, int param2) {
        cc var5 = null;
        int var6 = OrbDefence.field_D ? 1 : 0;
        cc var4 = (cc) (Object) ((te) this).field_I.b((byte) -22);
        while (var4 != null) {
            var5 = var4;
            while (var5 != null) {
                if (param2 >= var5.field_o) {
                    if (var5.field_g <= param1) {
                        if (var5.field_s + var5.field_o > param2) {
                            if (!(var5.field_g + var5.field_n < param1)) {
                                return var4;
                            }
                        }
                    }
                }
                var5 = var5.field_p;
            }
            var4 = (cc) (Object) ((te) this).field_I.d(param0 ^ -853);
        }
        if (param0 == -2) {
            return null;
        }
        field_L = null;
        return null;
    }

    public static void k(int param0) {
        field_N = null;
        field_J = null;
        field_M = null;
        if (param0 != -3213) {
            te.k(-125);
        }
        field_L = null;
    }

    final void b(int param0, int param1, int param2, int param3) {
        super.b(param0, param1, param2, param3);
        if (param0 != 84) {
            ((te) this).a(93, (byte) 51, 88, -37);
        }
        int var5 = -((te) this).field_s + param3;
        int var6 = -((te) this).field_n + param1;
        cc var7 = this.a(param0 ^ -86, var6, var5);
        if (var7 != null) {
            if (!(null == ((te) this).field_h)) {
                ((ff) (Object) ((te) this).field_h).a(param2, var7.field_q, (byte) 101, (te) this);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "to return to the normal view.";
        field_G = false;
        field_N = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_L = "Please enter your age in years";
        field_M = new fk(0);
    }
}
