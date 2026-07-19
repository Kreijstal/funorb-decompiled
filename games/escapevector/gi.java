/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi {
    int field_h;
    String field_n;
    int field_a;
    static te field_i;
    private static int field_d;
    int[] field_k;
    static te field_c;
    private long field_b;
    private int field_m;
    private String field_j;
    private boolean field_g;
    static int[] field_e;
    int field_f;
    static int field_l;

    final int b(int param0) {
        L0: {
          if (this.field_g) {
            break L0;
          } else {
            L1: {
              if (2 != this.field_a) {
                break L1;
              } else {
                if ((this.field_m ^ -1) >= -1) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            if (this.field_b != en.field_l) {
              L2: {
                if (-3 != (mi.field_g ^ -1)) {
                  break L2;
                } else {
                  if (kl.a(this.field_j, 0)) {
                    return 1;
                  } else {
                    break L2;
                  }
                }
              }
              if (param0 >= 40) {
                return 0;
              } else {
                return 89;
              }
            } else {
              return 1;
            }
          }
        }
        return 2;
    }

    final static void a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        jk var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var1_int = jb.field_u.length;
            jb.field_k = new jk[var1_int];
            var2 = param0;
            L1: while (true) {
              if (var2 >= var1_int) {
                break L0;
              } else {
                var3 = jb.field_u[var2];
                var4 = jb.field_h[var2];
                var5 = jb.field_v[var2];
                var6 = new jk(var3, var4, var5);
                jb.field_k[var2] = var6;
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "gi.A(" + param0 + ')');
        }
    }

    final static void a(int param0, int[] param1, int param2, int param3, int[] param4) {
        int incrementValue$1 = 0;
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var13 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (param2 == 1) {
                break L1;
              } else {
                var14 = (int[]) null;
                gi.a(-43, (int[]) null, -42, 84, (int[]) null);
                break L1;
              }
            }
            L2: {
              if (param3 >= param0) {
                break L2;
              } else {
                L3: {
                  var5_int = (param0 + param3) / 2;
                  var6 = param3;
                  var7 = param4[var5_int];
                  param4[var5_int] = param4[param0];
                  param4[param0] = var7;
                  var8 = param1[var5_int];
                  param1[var5_int] = param1[param0];
                  param1[param0] = var8;
                  if (-2147483648 != (var7 ^ -1)) {
                    stackOut_6_0 = 1;
                    stackIn_7_0 = stackOut_6_0;
                    break L3;
                  } else {
                    stackOut_5_0 = 0;
                    stackIn_7_0 = stackOut_5_0;
                    break L3;
                  }
                }
                var9 = stackIn_7_0;
                var10 = param3;
                L4: while (true) {
                  if (var10 >= param0) {
                    param4[param0] = param4[var6];
                    param4[var6] = var7;
                    param1[param0] = param1[var6];
                    param1[var6] = var8;
                    gi.a(-1 + var6, param1, param2 ^ 0, param3, param4);
                    gi.a(param0, param1, param2 ^ 0, var6 - -1, param4);
                    break L2;
                  } else {
                    if (param4[var10] < var7 + (var9 & var10)) {
                      var11 = param4[var10];
                      param4[var10] = param4[var6];
                      param4[var6] = var11;
                      var12 = param1[var10];
                      param1[var10] = param1[var6];
                      incrementValue$1 = var6;
                      var6++;
                      param1[incrementValue$1] = var12;
                      var10++;
                      continue L4;
                    } else {
                      var10++;
                      continue L4;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var5);
            stackOut_14_1 = new StringBuilder().append("gi.B(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param4 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
    }

    final static int a(byte param0, ih param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
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
            var2_int = co.a(param1, (byte) -127);
            var3 = mn.a(param0 ^ 16, (char) var2_int, 20);
            if (param0 == -96) {
              stackOut_3_0 = param1.b(var3);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 21;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("gi.D(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void c(int param0) {
        field_c = null;
        if (param0 != -13885) {
            return;
        }
        field_i = null;
        field_e = null;
    }

    final static void a(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = EscapeVector.field_A;
        try {
          L0: {
            if (param0 < -49) {
              var1_int = 0;
              L1: while (true) {
                if (var1_int >= mh.field_a.length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  mh.field_a[var1_int] = 0;
                  var1_int++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "gi.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    gi(boolean param0) {
        this.field_j = rm.field_g;
        this.field_g = rm.field_c;
        this.field_h = im.field_a;
        this.field_f = jn.field_d;
        this.field_m = ve.field_g;
        this.field_n = od.field_d;
        this.field_a = fl.field_o;
        this.field_b = ah.field_e;
        if (param0) {
            this.field_k = bo.field_H;
        } else {
            this.field_k = null;
        }
    }

    static {
        int var0 = 0;
        field_d = 398339;
        field_c = new te(1, 1, 256);
        for (var0 = 0; var0 < 256; var0++) {
            field_c.field_l[var0] = field_d;
        }
        field_c.field_l[0] = 0;
        field_i = new te(3, 3, 256);
        field_i.field_l[1] = 2917671;
    }
}
