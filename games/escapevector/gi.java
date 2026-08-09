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
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        jk var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
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
        int incrementValue$0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
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
                    stackIn_7_0 = 1;
                    break L3;
                  } else {
                    stackIn_7_0 = 0;
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
                    if ((param4[var10] ^ -1) > (var7 + (var9 & var10) ^ -1)) {
                      var11 = param4[var10];
                      param4[var10] = param4[var6];
                      param4[var6] = var11;
                      var12 = param1[var10];
                      param1[var10] = param1[var6];
                      incrementValue$0 = var6;
                      var6++;
                      param1[incrementValue$0] = var12;
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
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("gi.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
        }
    }

    final static int a(byte param0, ih param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = co.a(param1, (byte) -127);
            var3 = mn.a(param0 ^ 16, (char) var2_int, 20);
            if (param0 == -96) {
              stackIn_4_0 = param1.b(var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 21;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("gi.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
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
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
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
