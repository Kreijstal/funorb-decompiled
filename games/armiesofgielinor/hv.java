/*
 * Decompiled by CFR-JS 0.4.0.
 */
class hv extends fw {
    static int[] field_R;
    private at field_P;
    private String[] field_Q;
    static String field_O;
    private ct field_M;
    static rn field_N;

    final void a(int param0, int param1, int param2, boolean param3) {
        super.a(param0, param1, param2, param3);
        int var5 = -((hv) this).field_B + param1;
        int var6 = param2 + -((hv) this).field_p;
        ct var7 = this.a(var6, (byte) -61, var5);
        if (var7 != null) {
            if (!(null == ((hv) this).field_x)) {
                ((nq) (Object) ((hv) this).field_x).a(var7.field_n, param0, (byte) 112, (hv) this);
            }
        }
    }

    final void a(int param0) {
        int var2 = 0;
        pm var3 = null;
        ju var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        ts var12 = null;
        int var13 = 0;
        int var14 = 0;
        ct var15 = null;
        int var16 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        var16 = ArmiesOfGielinor.field_M ? 1 : 0;
        ((hv) this).field_P = new at();
        var2 = 0;
        var3 = (pm) (Object) ((hv) this).field_k;
        var4 = var3.a(-77, (kb) this);
        if (param0 <= -115) {
          L0: while (true) {
            var5 = ((hv) this).field_v.indexOf("<hotspot=", var2);
            if (var5 != -1) {
              var7 = ((hv) this).field_v.indexOf(">", var5);
              var6 = ((hv) this).field_v.substring(var5 - -9, var7);
              var7 = Integer.parseInt(var6);
              var2 = ((hv) this).field_v.indexOf("</hotspot>", var5);
              var8 = var4.a(0, var5);
              var9 = var4.a(0, var2);
              var10 = null;
              var11 = var8;
              L1: while (true) {
                if (var9 < var11) {
                  continue L0;
                } else {
                  L2: {
                    var12 = var4.field_b[var11];
                    if (var8 != var11) {
                      stackOut_8_0 = var12.field_i[0];
                      stackIn_9_0 = stackOut_8_0;
                      break L2;
                    } else {
                      stackOut_7_0 = var4.a((byte) -66, var5);
                      stackIn_9_0 = stackOut_7_0;
                      break L2;
                    }
                  }
                  L3: {
                    var13 = stackIn_9_0;
                    if (var11 != var9) {
                      if (var12 == null) {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        break L3;
                      } else {
                        stackOut_12_0 = var12.field_i[-1 + var12.field_i.length];
                        stackIn_14_0 = stackOut_12_0;
                        break L3;
                      }
                    } else {
                      stackOut_10_0 = var4.a((byte) -66, var2);
                      stackIn_14_0 = stackOut_10_0;
                      break L3;
                    }
                  }
                  L4: {
                    var14 = stackIn_14_0;
                    var15 = new ct(var7, var13, var12.field_n, -var13 + var14, Math.max(var3.a(true), var12.field_c - var12.field_n));
                    if (var10 != null) {
                      ((ct) var10).field_k = var15;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  ((hv) this).field_P.a((byte) -119, (tc) (Object) var15);
                  var10 = (Object) (Object) var15;
                  var11++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    boolean a(int param0, kb param1) {
        RuntimeException var3 = null;
        Object var4 = null;
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
              if (param0 == 11) {
                break L1;
              } else {
                var4 = null;
                ((hv) this).a(-45, 118, 84, (kb) null);
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
            stackOut_4_1 = new StringBuilder().append("hv.M(").append(param0).append(',');
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
          throw ig.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    private final ct a(int param0, byte param1, int param2) {
        ct var4 = null;
        ct var5 = null;
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        var4 = (ct) (Object) ((hv) this).field_P.e((byte) 107);
        L0: while (true) {
          if (var4 == null) {
            return null;
          } else {
            var5 = var4;
            L1: while (true) {
              if (var5 == null) {
                var4 = (ct) (Object) ((hv) this).field_P.a((byte) 123);
                continue L0;
              } else {
                L2: {
                  if (param2 < var5.field_r) {
                    break L2;
                  } else {
                    if (param0 < var5.field_l) {
                      break L2;
                    } else {
                      if (var5.field_r - -var5.field_p <= param2) {
                        break L2;
                      } else {
                        if (var5.field_q + var5.field_l >= param0) {
                          return var4;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                var5 = var5.field_k;
                continue L1;
              }
            }
          }
        }
    }

    void a(int param0, int param1, int param2, kb param3) {
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
              ((hv) this).field_M = null;
              if (!((hv) this).field_t) {
                break L1;
              } else {
                var5_int = -param1 + (sm.field_d - ((hv) this).field_B);
                var6 = -param2 + ko.field_b + -((hv) this).field_p;
                ((hv) this).field_M = this.a(var6, (byte) -61, var5_int);
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
            stackOut_3_1 = new StringBuilder().append("hv.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
          throw ig.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    hv(String param0, kh param1) {
        super(param0, (qo) null);
        ((hv) this).field_M = null;
        try {
            ((hv) this).field_k = param1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "hv.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param3 != 8192) {
            field_R = null;
        }
        super.a(param0, param1, param2, param3, param4);
        ((hv) this).a(-128);
    }

    public static void b() {
        field_N = null;
        field_O = null;
        field_R = null;
    }

    String h(int param0) {
        if (((hv) this).field_M == null) {
            return null;
        }
        if (null == ((hv) this).field_Q) {
            return null;
        }
        if (param0 != 21384) {
            return null;
        }
        if (((hv) this).field_Q.length <= ((hv) this).field_M.field_n) {
            return null;
        }
        return ((hv) this).field_Q[((hv) this).field_M.field_n];
    }

    final void a(String param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        String[] var8 = null;
        String[] var9 = null;
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
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (null == ((hv) this).field_Q) {
                  break L2;
                } else {
                  if (((hv) this).field_Q.length <= param2) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                var8 = new String[param2 - -1];
                var9 = var8;
                var4 = var9;
                if (null == ((hv) this).field_Q) {
                  break L3;
                } else {
                  var5 = 0;
                  L4: while (true) {
                    if (var5 >= ((hv) this).field_Q.length) {
                      break L3;
                    } else {
                      var8[var5] = ((hv) this).field_Q[var5];
                      var5++;
                      continue L4;
                    }
                  }
                }
              }
              ((hv) this).field_Q = var9;
              break L1;
            }
            L5: {
              if (!param1) {
                break L5;
              } else {
                var7 = null;
                ((hv) this).a((String) null, false, -3);
                break L5;
              }
            }
            ((hv) this).field_Q[param2] = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) runtimeException;
            stackOut_13_1 = new StringBuilder().append("hv.CA(");
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
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        ((hv) this).a(param2, param0, param3, 8192, ((pm) (Object) ((hv) this).field_k).a((kb) this, -2));
        if (param1 != 9567) {
            ((hv) this).field_P = null;
        }
    }

    void a(int param0, int param1, byte param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, (byte) -124, param3);
        if (param3 != 0) {
            return;
        }
        pm var5 = (pm) (Object) ((hv) this).field_k;
        ct var6 = ((hv) this).field_M;
        if (var6 != null) {
            var7 = var5.a((kb) this, param0, (byte) -123);
            var8 = var5.a(-18033, param1, (kb) this);
            do {
                na.c(2 + var6.field_p, var7 - (-var6.field_r - -2), 116, 2 + var6.field_q, -2 + (var6.field_l + var8));
                var6 = var6.field_k;
            } while (var6 != null);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = "This unit has no magical ability.";
        field_N = new rn();
    }
}
