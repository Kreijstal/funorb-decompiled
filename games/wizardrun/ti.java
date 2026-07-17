/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti {
    private int field_e;
    private int[] field_f;
    private int[] field_b;
    private int field_d;
    private int field_c;
    static int field_a;
    private int field_g;
    static String field_h;

    final static wd a(byte param0) {
        if (fi.field_y == ej.field_b) {
            throw new IllegalStateException();
        }
        if (!(fi.field_y != mi.field_z)) {
            fi.field_y = ej.field_b;
            return ki.field_F;
        }
        int var1 = -21;
        return null;
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = wizardrun.field_H;
          if (param0 <= -92) {
            break L0;
          } else {
            field_a = 113;
            break L0;
          }
        }
        var7 = -1640531527;
        var8 = -1640531527;
        var5 = -1640531527;
        var4 = -1640531527;
        var10 = -1640531527;
        var3 = -1640531527;
        var6 = -1640531527;
        var9 = -1640531527;
        var2 = 0;
        L1: while (true) {
          if (4 <= var2) {
            var2 = 0;
            L2: while (true) {
              if (var2 >= 256) {
                var2 = 0;
                L3: while (true) {
                  if (var2 >= 256) {
                    this.d((byte) 121);
                    ((ti) this).field_g = 256;
                    return;
                  } else {
                    var6 = var6 + ((ti) this).field_b[3 + var2];
                    var4 = var4 + ((ti) this).field_b[var2 - -1];
                    var9 = var9 + ((ti) this).field_b[6 + var2];
                    var7 = var7 + ((ti) this).field_b[4 + var2];
                    var3 = var3 + ((ti) this).field_b[var2];
                    var10 = var10 + ((ti) this).field_b[7 + var2];
                    var8 = var8 + ((ti) this).field_b[var2 - -5];
                    var5 = var5 + ((ti) this).field_b[2 + var2];
                    var3 = var3 ^ var4 << 11;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
                    var4 = var4 ^ var5 >>> 2;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
                    var5 = var5 ^ var6 << 8;
                    var8 = var8 + var5;
                    var6 = var6 + var7;
                    var6 = var6 ^ var7 >>> 16;
                    var9 = var9 + var6;
                    var7 = var7 + var8;
                    var7 = var7 ^ var8 << 10;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> 4;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << 8;
                    var10 = var10 + var3;
                    var4 = var4 + var9;
                    var10 = var10 ^ var3 >>> 9;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    ((ti) this).field_b[var2] = var3;
                    ((ti) this).field_b[1 + var2] = var4;
                    ((ti) this).field_b[2 + var2] = var5;
                    ((ti) this).field_b[var2 + 3] = var6;
                    ((ti) this).field_b[4 + var2] = var7;
                    ((ti) this).field_b[5 + var2] = var8;
                    ((ti) this).field_b[var2 + 6] = var9;
                    ((ti) this).field_b[var2 + 7] = var10;
                    var2 += 8;
                    continue L3;
                  }
                }
              } else {
                var9 = var9 + ((ti) this).field_f[var2 - -6];
                var6 = var6 + ((ti) this).field_f[3 + var2];
                var4 = var4 + ((ti) this).field_f[1 + var2];
                var3 = var3 + ((ti) this).field_f[var2];
                var10 = var10 + ((ti) this).field_f[7 + var2];
                var7 = var7 + ((ti) this).field_f[var2 - -4];
                var8 = var8 + ((ti) this).field_f[var2 - -5];
                var5 = var5 + ((ti) this).field_f[2 + var2];
                var3 = var3 ^ var4 << 11;
                var4 = var4 + var5;
                var6 = var6 + var3;
                var4 = var4 ^ var5 >>> 2;
                var5 = var5 + var6;
                var7 = var7 + var4;
                var5 = var5 ^ var6 << 8;
                var6 = var6 + var7;
                var8 = var8 + var5;
                var6 = var6 ^ var7 >>> 16;
                var7 = var7 + var8;
                var9 = var9 + var6;
                var7 = var7 ^ var8 << 10;
                var8 = var8 + var9;
                var10 = var10 + var7;
                var8 = var8 ^ var9 >>> 4;
                var3 = var3 + var8;
                var9 = var9 + var10;
                var9 = var9 ^ var10 << 8;
                var4 = var4 + var9;
                var10 = var10 + var3;
                var10 = var10 ^ var3 >>> 9;
                var3 = var3 + var4;
                var5 = var5 + var10;
                ((ti) this).field_b[var2] = var3;
                ((ti) this).field_b[var2 - -1] = var4;
                ((ti) this).field_b[var2 - -2] = var5;
                ((ti) this).field_b[3 + var2] = var6;
                ((ti) this).field_b[4 + var2] = var7;
                ((ti) this).field_b[5 + var2] = var8;
                ((ti) this).field_b[var2 - -6] = var9;
                ((ti) this).field_b[var2 + 7] = var10;
                var2 += 8;
                continue L2;
              }
            }
          } else {
            var3 = var3 ^ var4 << 11;
            var4 = var4 + var5;
            var6 = var6 + var3;
            var4 = var4 ^ var5 >>> 2;
            var5 = var5 + var6;
            var7 = var7 + var4;
            var5 = var5 ^ var6 << 8;
            var6 = var6 + var7;
            var8 = var8 + var5;
            var6 = var6 ^ var7 >>> 16;
            var9 = var9 + var6;
            var7 = var7 + var8;
            var7 = var7 ^ var8 << 10;
            var8 = var8 + var9;
            var10 = var10 + var7;
            var8 = var8 ^ var9 >>> 4;
            var9 = var9 + var10;
            var3 = var3 + var8;
            var9 = var9 ^ var10 << 8;
            var10 = var10 + var3;
            var4 = var4 + var9;
            var10 = var10 ^ var3 >>> 9;
            var3 = var3 + var4;
            var5 = var5 + var10;
            var2++;
            continue L1;
          }
        }
    }

    private final void d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = wizardrun.field_H;
        int fieldTemp$3 = ((ti) this).field_c + 1;
        ((ti) this).field_c = ((ti) this).field_c + 1;
        ((ti) this).field_d = ((ti) this).field_d + fieldTemp$3;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 256) {
            return;
          } else {
            L1: {
              var3 = ((ti) this).field_b[var2];
              if (0 == (var2 & 2)) {
                if ((1 & var2) == 0) {
                  ((ti) this).field_e = ((ti) this).field_e ^ ((ti) this).field_e << 13;
                  break L1;
                } else {
                  ((ti) this).field_e = ((ti) this).field_e ^ ((ti) this).field_e >>> 6;
                  break L1;
                }
              } else {
                if (0 != (var2 & 1)) {
                  ((ti) this).field_e = ((ti) this).field_e ^ ((ti) this).field_e >>> 16;
                  break L1;
                } else {
                  ((ti) this).field_e = ((ti) this).field_e ^ ((ti) this).field_e << 2;
                  break L1;
                }
              }
            }
            ((ti) this).field_e = ((ti) this).field_e + ((ti) this).field_b[128 + var2 & 255];
            int dupTemp$4 = ((ti) this).field_d + (((ti) this).field_e + ((ti) this).field_b[kl.b(255, var3 >> 2)]);
            var4 = dupTemp$4;
            ((ti) this).field_b[var2] = dupTemp$4;
            int dupTemp$5 = ((ti) this).field_b[kl.b(261240, var4) >> 8 >> 2] + var3;
            ((ti) this).field_d = dupTemp$5;
            ((ti) this).field_f[var2] = dupTemp$5;
            var2++;
            continue L0;
          }
        }
    }

    public static void c(byte param0) {
        field_h = null;
    }

    final int b(byte param0) {
        if (!(0 != ((ti) this).field_g)) {
            this.d((byte) 121);
            ((ti) this).field_g = 256;
        }
        if (param0 <= 58) {
            this.b(13);
        }
        int fieldTemp$0 = ((ti) this).field_g - 1;
        ((ti) this).field_g = ((ti) this).field_g - 1;
        return ((ti) this).field_f[fieldTemp$0];
    }

    final static gb a(int param0, String param1, kl param2, String param3, kl param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        gb stackIn_3_0 = null;
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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        gb stackOut_2_0 = null;
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
              var5_int = param2.b(-1, param1);
              var6 = param2.a(var5_int, param3, param0 + -800875572);
              if (param0 == 800863586) {
                break L1;
              } else {
                field_h = null;
                break L1;
              }
            }
            stackOut_2_0 = dh.a(var6, var5_int, (byte) -119, param4, param2);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("ti.A(").append(param0).append(44);
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
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
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
            if (param3 == null) {
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
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
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
          throw bd.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_3_0;
    }

    ti(int[] param0) {
        int var2_int = 0;
        try {
            ((ti) this).field_b = new int[256];
            ((ti) this).field_f = new int[256];
            for (var2_int = 0; var2_int < param0.length; var2_int++) {
                ((ti) this).field_f[var2_int] = param0[var2_int];
            }
            this.b(-97);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "ti.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = wizardrun.field_H;
        try {
          L0: {
            if (!pk.a((byte) -35)) {
              L1: {
                if (ki.field_E == null) {
                  break L1;
                } else {
                  if (!ki.field_E.field_b) {
                    break L1;
                  } else {
                    di.a((byte) 60);
                    kj.field_b.b((ub) (Object) new vg(kj.field_b, cf.field_f), (byte) 96);
                    break L1;
                  }
                }
              }
              return;
            } else {
              if (param0 == 8) {
                boolean discarded$17 = kj.field_b.a(param0 + 118, true, ne.field_g, sf.field_d);
                kj.field_b.g((byte) 118);
                L2: while (true) {
                  if (!ae.a(-61)) {
                    break L0;
                  } else {
                    boolean discarded$18 = kj.field_b.a(param0 ^ -125, vk.field_r, ae.field_a);
                    continue L2;
                  }
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var1, "ti.B(" + param0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Back";
    }
}
