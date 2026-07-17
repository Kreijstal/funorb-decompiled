/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qa extends hf {
    static int[] field_I;
    private fk field_P;
    private vd field_Q;
    static String field_N;
    static he[] field_S;
    private String[] field_R;
    static int[] field_T;
    static nh field_L;
    static int[] field_J;
    static nh field_M;
    static String field_O;

    String e(int param0) {
        if (((qa) this).field_P == null) {
            return null;
        }
        if (null == ((qa) this).field_R) {
            return null;
        }
        if (param0 >= -39) {
            return null;
        }
        if (((qa) this).field_P.field_s >= ((qa) this).field_R.length) {
            return null;
        }
        return ((qa) this).field_R[((qa) this).field_P.field_s];
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (param0 != 0) {
            field_T = null;
        }
        ((qa) this).a(param3, ((va) (Object) ((qa) this).field_l).a(170, (vg) this), param2, 16535, param1);
    }

    final void h(int param0) {
        int var2 = 0;
        va var3 = null;
        em var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        mi var12 = null;
        int var13 = 0;
        int var14 = 0;
        fk var15 = null;
        int var16 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        var16 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        ((qa) this).field_Q = new vd();
        var2 = 0;
        var3 = (va) (Object) ((qa) this).field_l;
        var4 = var3.a((vg) this, true);
        L0: while (true) {
          var5 = ((qa) this).field_p.indexOf("<hotspot=", var2);
          if (-1 != var5) {
            var7 = ((qa) this).field_p.indexOf(">", var5);
            var6 = ((qa) this).field_p.substring(var5 + 9, var7);
            var7 = Integer.parseInt(var6);
            var2 = ((qa) this).field_p.indexOf("</hotspot>", var5);
            var8 = var4.b(var5, -12280);
            var9 = var4.b(var2, -12280);
            var10 = null;
            var11 = var8;
            L1: while (true) {
              if (var9 < var11) {
                continue L0;
              } else {
                L2: {
                  var12 = var4.field_a[var11];
                  if (var8 != var11) {
                    stackOut_7_0 = var12.field_a[0];
                    stackIn_8_0 = stackOut_7_0;
                    break L2;
                  } else {
                    stackOut_6_0 = var4.a(74, var5);
                    stackIn_8_0 = stackOut_6_0;
                    break L2;
                  }
                }
                L3: {
                  var13 = stackIn_8_0;
                  if (var9 != var11) {
                    if (var12 == null) {
                      stackOut_12_0 = 0;
                      stackIn_13_0 = stackOut_12_0;
                      break L3;
                    } else {
                      stackOut_11_0 = var12.field_a[var12.field_a.length - 1];
                      stackIn_13_0 = stackOut_11_0;
                      break L3;
                    }
                  } else {
                    stackOut_9_0 = var4.a(-88, var2);
                    stackIn_13_0 = stackOut_9_0;
                    break L3;
                  }
                }
                L4: {
                  var14 = stackIn_13_0;
                  var15 = new fk(var7, var13, var12.field_e, var14 - var13, Math.max(var3.a((byte) -116), -var12.field_e + var12.field_b));
                  if (var10 == null) {
                    break L4;
                  } else {
                    ((fk) var10).field_k = var15;
                    break L4;
                  }
                }
                var10 = (Object) (Object) var15;
                ((qa) this).field_Q.a((gi) (Object) var15, 255);
                var11++;
                continue L1;
              }
            }
          } else {
            var5 = -128 / ((param0 - -57) / 43);
            return;
          }
        }
    }

    void a(vg param0, int param1, int param2, byte param3) {
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
              super.a(param0, param1, param2, (byte) -128);
              ((qa) this).field_P = null;
              if (!((qa) this).field_n) {
                break L1;
              } else {
                var5_int = ck.field_c + -param1 + -((qa) this).field_o;
                var6 = -((qa) this).field_m + (ob.field_g - param2);
                ((qa) this).field_P = this.a(var6, var5_int, (byte) 122);
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
            stackOut_3_1 = new StringBuilder().append("qa.I(");
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
          throw ie.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 44 + param2 + 44 + -128 + 41);
        }
    }

    public static void a(byte param0) {
        field_J = null;
        field_I = null;
        if (param0 != 122) {
            qa.a((byte) 76);
        }
        field_O = null;
        field_L = null;
        field_N = null;
        field_M = null;
        field_T = null;
        field_S = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param3 != 16535) {
            field_J = null;
        }
        super.a(param0, param1, param2, param3, param4);
        ((qa) this).h(param3 + -16466);
    }

    final static void a(int param0, int[] param1, int param2, int param3, int param4) {
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              param3--;
              if (param3 < 0) {
                L2: {
                  if (param4 == -2141888031) {
                    break L2;
                  } else {
                    field_L = null;
                    break L2;
                  }
                }
                break L0;
              } else {
                var9 = param1;
                var5 = var9;
                var6 = param0;
                var7 = param2;
                var9[var6] = (rk.a(var9[var6], 16711422) >> 1) + var7;
                param0++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5_ref;
            stackOut_6_1 = new StringBuilder().append("qa.MA(").append(param0).append(44);
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
          throw ie.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    void a(int param0, int param1, byte param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (!(param1 == 0)) {
            return;
        }
        va var5 = (va) (Object) ((qa) this).field_l;
        fk var6 = ((qa) this).field_P;
        if (var6 != null) {
            var7 = var5.a((vg) this, param2 ^ -1540021398, param0);
            var8 = var5.a((vg) this, param3, (byte) -124);
            do {
                ce.a(var6.field_j + 2, -2 + var6.field_o + var7, param2 ^ 16598, 2 + var6.field_n, var8 - -var6.field_i + -2);
                var6 = var6.field_k;
            } while (var6 != null);
        }
    }

    qa(String param0, cg param1) {
        super(param0, (fd) null);
        ((qa) this).field_P = null;
        try {
            ((qa) this).field_l = param1;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "qa.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    boolean a(boolean param0, vg param1) {
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
              if (!param0) {
                break L1;
              } else {
                ((qa) this).h(29);
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
            stackOut_4_1 = new StringBuilder().append("qa.M(").append(param0).append(44);
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
          throw ie.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0 != 0;
    }

    private final fk a(int param0, int param1, byte param2) {
        fk var5_ref_fk = null;
        int var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        fk var4 = (fk) (Object) ((qa) this).field_Q.h(-11151);
        while (var4 != null) {
            var5_ref_fk = var4;
            while (var5_ref_fk != null) {
                if (param1 >= var5_ref_fk.field_o) {
                    if (var5_ref_fk.field_i <= param0) {
                        if (var5_ref_fk.field_o + var5_ref_fk.field_n > param1) {
                            if (var5_ref_fk.field_i + var5_ref_fk.field_j >= param0) {
                                return var4;
                            }
                        }
                    }
                }
                var5_ref_fk = var5_ref_fk.field_k;
            }
            var4 = (fk) (Object) ((qa) this).field_Q.e(0);
        }
        int var5 = 85 % ((59 - param2) / 51);
        return null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int var5 = -((qa) this).field_o + param3;
        int var6 = -((qa) this).field_m + param2;
        fk var7 = this.a(var6, var5, (byte) -70);
        if (var7 != null) {
            if (!(null == ((qa) this).field_u)) {
                ((ra) (Object) ((qa) this).field_u).a(var7.field_s, -99, (qa) this, param0);
            }
        }
    }

    final void a(String param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (((qa) this).field_R == null) {
                  break L2;
                } else {
                  if (param1 >= ((qa) this).field_R.length) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                var7 = new String[1 + param1];
                var4 = var7;
                if (((qa) this).field_R != null) {
                  var5 = 0;
                  L4: while (true) {
                    if (var5 >= ((qa) this).field_R.length) {
                      break L3;
                    } else {
                      var7[var5] = ((qa) this).field_R[var5];
                      var5++;
                      continue L4;
                    }
                  }
                } else {
                  break L3;
                }
              }
              ((qa) this).field_R = var4;
              break L1;
            }
            ((qa) this).field_R[param1] = param0;
            var4_int = 53 / ((61 - param2) / 48);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) runtimeException;
            stackOut_12_1 = new StringBuilder().append("qa.OA(");
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
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = new int[]{1, 1, 1, 1, 1, -3, 0, 1, 0, 0, 0, -4, 1, 1, 1, 1, 1, -5, -6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, 0, 1, 1, 1, 0, 2, 0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        field_N = "Members";
        field_T = new int[]{5, 10, 5, 1, 3, 10, 10, 10, 10, 20, 30, 10, 10, 10, 10, 5, 5, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 5, 10, 25, 10, 5, 5, 10, 10, 10, 10, 10, 10, 5, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 30, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        field_O = "Unpacking graphics";
    }
}
