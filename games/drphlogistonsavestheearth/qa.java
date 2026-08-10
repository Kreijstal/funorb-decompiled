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
        if (this.field_P == null) {
            return null;
        }
        if (null == this.field_R) {
            return null;
        }
        if (param0 >= -39) {
            return (String) null;
        }
        if (this.field_P.field_s >= this.field_R.length) {
            return null;
        }
        return this.field_R[this.field_P.field_s];
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (param0 != 0) {
            field_T = (int[]) null;
        }
        this.a(param3, ((va) ((Object) this.field_l)).a(170, (vg) (this)), param2, 16535, param1);
    }

    final void h(int param0) {
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int var2;
        va var3;
        em var4;
        int var5;
        String var6;
        int var7;
        int var8;
        int var9;
        Object var10;
        int var11;
        mi var12;
        int var13;
        int var14;
        fk var15;
        int var16;
        var16 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        this.field_Q = new vd();
        var2 = 0;
        var3 = (va) ((Object) this.field_l);
        var4 = var3.a((vg) (this), true);
        L0: while (true) {
          var5 = this.field_p.indexOf("<hotspot=", var2);
          if (-1 != var5) {
            var7 = this.field_p.indexOf(">", var5);
            var6 = this.field_p.substring(var5 + 9, var7);
            var7 = Integer.parseInt(var6);
            var2 = this.field_p.indexOf("</hotspot>", var5);
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
                  if ((var8 ^ -1) != (var11 ^ -1)) {
                    stackIn_8_0 = var12.field_a[0];
                    break L2;
                  } else {
                    stackIn_8_0 = var4.a(74, var5);
                    break L2;
                  }
                }
                L3: {
                  var13 = stackIn_8_0;
                  if (var9 != var11) {
                    if (var12 == null) {
                      stackIn_13_0 = 0;
                      break L3;
                    } else {
                      stackIn_13_0 = var12.field_a[var12.field_a.length - 1];
                      break L3;
                    }
                  } else {
                    stackIn_13_0 = var4.a(-88, var2);
                    break L3;
                  }
                }
                L4: {
                  var14 = stackIn_13_0;
                  var15 = new fk(var7, var13, var12.field_e, var14 - var13, Math.max(var3.a((byte) -116), -var12.field_e + var12.field_b));
                  if (var10 == null) {
                    break L4;
                  } else {
                    ((fk) (var10)).field_k = var15;
                    break L4;
                  }
                }
                var10 = var15;
                this.field_Q.a(var15, 255);
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
        int var5_int = 0;
        int var6 = 0;
        try {
            super.a(param0, param1, param2, (byte) -128);
            this.field_P = null;
            if (param3 >= -127) {
                this.field_Q = (vd) null;
            }
            if (this.field_n) {
                var5_int = ck.field_c + -param1 + -this.field_o;
                var6 = -this.field_m + (ob.field_g - param2);
                this.field_P = this.a(var6, var5_int, (byte) 122);
            }
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "qa.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
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
            field_J = (int[]) null;
        }
        super.a(param0, param1, param2, param3 + 0, param4);
        this.h(param3 + -16466);
    }

    final static void a(int param0, int[] param1, int param2, int param3, int param4) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              param3--;
              if (-1 < (param3 ^ -1)) {
                L2: {
                  if (param4 == -2141888031) {
                    break L2;
                  } else {
                    field_L = (nh) null;
                    break L2;
                  }
                }
                break L0;
              } else {
                var9 = param1;
                var5 = var9;
                var6 = param0;
                var7 = param2;
                var9[var6] = (rk.a(var9[var6], 16711422) >> -2141888031) + var7;
                param0++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5_ref);

            stackIn_8_1 = new StringBuilder().append("qa.MA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    void a(int param0, int param1, byte param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (!(param1 == 0)) {
            return;
        }
        va var5 = (va) ((Object) this.field_l);
        fk var6 = this.field_P;
        if (var6 != null) {
            var7 = var5.a((vg) (this), param2 ^ -1540021398, param0);
            var8 = var5.a((vg) (this), param3, (byte) -124);
            do {
                ce.a(var6.field_j + 2, -2 + var6.field_o + var7, param2 ^ 16598, 2 + var6.field_n, var8 - -var6.field_i + -2);
                var6 = var6.field_k;
            } while (var6 != null);
        }
    }

    qa(String param0, cg param1) {
        super(param0, (fd) null);
        this.field_P = null;
        try {
            this.field_l = param1;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "qa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    boolean a(boolean param0, vg param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                this.h(29);
                break L1;
              }
            }
            stackIn_3_0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("qa.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    private final fk a(int param0, int param1, byte param2) {
        fk var5_ref_fk = null;
        int var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        fk var4 = (fk) ((Object) this.field_Q.h(-11151));
        while (var4 != null) {
            var5_ref_fk = var4;
            while (var5_ref_fk != null) {
                if ((param1 ^ -1) <= (var5_ref_fk.field_o ^ -1) && var5_ref_fk.field_i <= param0 && var5_ref_fk.field_o + var5_ref_fk.field_n > param1 && var5_ref_fk.field_i + var5_ref_fk.field_j >= param0) {
                    return var4;
                }
                var5_ref_fk = var5_ref_fk.field_k;
            }
            var4 = (fk) ((Object) this.field_Q.e(0));
        }
        int var5 = 85 % ((59 - param2) / 51);
        return null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int var5 = -this.field_o + param3;
        int var6 = -this.field_m + param2;
        fk var7 = this.a(var6, var5, (byte) -70);
        if (var7 != null) {
            if (!(null == this.field_u)) {
                ((ra) ((Object) this.field_u)).a(var7.field_s, -99, (qa) (this), param0);
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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (this.field_R == null) {
                  break L2;
                } else {
                  if (param1 >= this.field_R.length) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                var7 = new String[1 + param1];
                var4 = var7;
                if (this.field_R != null) {
                  var5 = 0;
                  L4: while (true) {
                    if (var5 >= this.field_R.length) {
                      break L3;
                    } else {
                      var7[var5] = this.field_R[var5];
                      var5++;
                      continue L4;
                    }
                  }
                } else {
                  break L3;
                }
              }
              this.field_R = var4;
              break L1;
            }
            this.field_R[param1] = param0;
            var4_int = 53 / ((61 - param2) / 48);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (runtimeException);

            stackIn_14_1 = new StringBuilder().append("qa.OA(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_I = new int[]{1, 1, 1, 1, 1, -3, 0, 1, 0, 0, 0, -4, 1, 1, 1, 1, 1, -5, -6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, 0, 1, 1, 1, 0, 2, 0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        field_N = "Members";
        field_T = new int[]{5, 10, 5, 1, 3, 10, 10, 10, 10, 20, 30, 10, 10, 10, 10, 5, 5, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 5, 10, 25, 10, 5, 5, 10, 10, 10, 10, 10, 10, 5, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 30, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        field_O = "Unpacking graphics";
    }
}
