/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ed extends li {
    static boolean field_q;
    static int field_n;
    int field_u;
    static String field_r;
    static String field_o;
    static String field_s;
    byte[] field_p;
    static boolean field_t;

    final void f(int param0, int param1) {
        int var3 = 86 / ((param1 - 16) / 62);
        int fieldTemp$0 = ((ed) this).field_u;
        ((ed) this).field_u = ((ed) this).field_u + 1;
        ((ed) this).field_p[fieldTemp$0] = (byte)param0;
    }

    final void a(byte param0, int param1) {
        if (param0 > -110) {
            int discarded$0 = ((ed) this).l(-69);
        }
        ((ed) this).field_p[-2 + -param1 + ((ed) this).field_u] = (byte)(param1 >> 8);
        ((ed) this).field_p[-1 + (-param1 + ((ed) this).field_u)] = (byte)param1;
    }

    final void a(int param0, byte[] param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var6 = 36 / ((param3 - -2) / 61);
            var5_int = param0;
            L1: while (true) {
              if (var5_int >= param2 + param0) {
                break L0;
              } else {
                int fieldTemp$7 = ((ed) this).field_u;
                ((ed) this).field_u = ((ed) this).field_u + 1;
                param1[var5_int] = ((ed) this).field_p[fieldTemp$7];
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("ed.E(").append(param0).append(',');
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
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int m(int param0) {
        ((ed) this).field_u = ((ed) this).field_u + 3;
        if (param0 != 0) {
            return 87;
        }
        return (((ed) this).field_p[((ed) this).field_u - 1] & 255) + ((((ed) this).field_p[-3 + ((ed) this).field_u] << 16 & 16711680) - -(65280 & ((ed) this).field_p[-2 + ((ed) this).field_u] << 8));
    }

    final void b(int param0, byte param1) {
        if (param0 < 64) {
            if (-64 <= param0) {
                ((ed) this).f(param0 + 64, -92);
                return;
            }
        }
        if (param1 > -39) {
            byte discarded$0 = ((ed) this).g(63);
        }
        if (param0 < 16384) {
            if (!(param0 < -16384)) {
                ((ed) this).d(param0 - -49152, -1783);
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    final int a(int param0) {
        if (param0 < 41) {
            return -124;
        }
        if (((ed) this).field_p[((ed) this).field_u] < 0) {
            return 2147483647 & ((ed) this).b(true);
        }
        return ((ed) this).a((byte) -11);
    }

    final long i(int param0) {
        if (param0 != -31016) {
            return 69L;
        }
        long var2 = 4294967295L & (long)((ed) this).b(true);
        long var4 = 4294967295L & (long)((ed) this).b(true);
        return (var2 << 32) - -var4;
    }

    final void b(byte param0, long param1) {
        int fieldTemp$0 = ((ed) this).field_u;
        ((ed) this).field_u = ((ed) this).field_u + 1;
        ((ed) this).field_p[fieldTemp$0] = (byte)(int)(param1 >> 32);
        int fieldTemp$1 = ((ed) this).field_u;
        ((ed) this).field_u = ((ed) this).field_u + 1;
        ((ed) this).field_p[fieldTemp$1] = (byte)(int)(param1 >> 24);
        if (param0 < 4) {
            field_q = false;
        }
        int fieldTemp$2 = ((ed) this).field_u;
        ((ed) this).field_u = ((ed) this).field_u + 1;
        ((ed) this).field_p[fieldTemp$2] = (byte)(int)(param1 >> 16);
        int fieldTemp$3 = ((ed) this).field_u;
        ((ed) this).field_u = ((ed) this).field_u + 1;
        ((ed) this).field_p[fieldTemp$3] = (byte)(int)(param1 >> 8);
        int fieldTemp$4 = ((ed) this).field_u;
        ((ed) this).field_u = ((ed) this).field_u + 1;
        ((ed) this).field_p[fieldTemp$4] = (byte)(int)param1;
    }

    public static void e(int param0) {
        field_s = null;
        field_r = null;
        field_o = null;
    }

    final void e(int param0, int param1) {
        int fieldTemp$0 = ((ed) this).field_u;
        ((ed) this).field_u = ((ed) this).field_u + 1;
        ((ed) this).field_p[fieldTemp$0] = (byte)(param0 >> 24);
        int fieldTemp$1 = ((ed) this).field_u;
        ((ed) this).field_u = ((ed) this).field_u + 1;
        ((ed) this).field_p[fieldTemp$1] = (byte)(param0 >> 16);
        int fieldTemp$2 = ((ed) this).field_u;
        ((ed) this).field_u = ((ed) this).field_u + 1;
        ((ed) this).field_p[fieldTemp$2] = (byte)(param0 >> 8);
        if (param1 != 0) {
            return;
        }
        int fieldTemp$3 = ((ed) this).field_u;
        ((ed) this).field_u = ((ed) this).field_u + 1;
        ((ed) this).field_p[fieldTemp$3] = (byte)param0;
    }

    final void g(int param0, int param1) {
        ((ed) this).field_p[-4 + (((ed) this).field_u - param0)] = (byte)(param0 >> 24);
        int var3 = -106 / ((param1 - -9) / 50);
        ((ed) this).field_p[-param0 + ((ed) this).field_u + -3] = (byte)(param0 >> 16);
        ((ed) this).field_p[((ed) this).field_u - param0 - 2] = (byte)(param0 >> 8);
        ((ed) this).field_p[((ed) this).field_u - param0 + -1] = (byte)param0;
    }

    final int b(boolean param0) {
        if (!param0) {
            return 108;
        }
        ((ed) this).field_u = ((ed) this).field_u + 4;
        return (255 & ((ed) this).field_p[-1 + ((ed) this).field_u]) + ((((ed) this).field_p[-3 + ((ed) this).field_u] & 255) << 16) + ((((ed) this).field_p[((ed) this).field_u + -4] << 24 & -16777216) - -(65280 & ((ed) this).field_p[((ed) this).field_u - 2] << 8));
    }

    final static er a(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = Vertigo2.field_L ? 1 : 0;
        er var6 = new er(param1, param1);
        er var3 = var6;
        for (var4 = 0; var3.field_F.length > var4; var4++) {
            var6.field_F[var4] = param0;
        }
        return var3;
    }

    final void a(byte param0, String param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        try {
            var3_int = param1.indexOf(' ');
            if (!(var3_int < 0)) {
                throw new IllegalArgumentException("");
            }
            var4 = (CharSequence) (Object) param1;
            ((ed) this).field_u = ((ed) this).field_u + l.a(param0 + 108, ((ed) this).field_p, var4, param1.length(), 0, ((ed) this).field_u);
            int fieldTemp$0 = ((ed) this).field_u;
            ((ed) this).field_u = ((ed) this).field_u + 1;
            ((ed) this).field_p[fieldTemp$0] = (byte)param0;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "ed.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, String param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        try {
            if (param0 != 684868900) {
            }
            var3_int = param1.indexOf(' ');
            if (!(var3_int < 0)) {
                throw new IllegalArgumentException("");
            }
            int fieldTemp$0 = ((ed) this).field_u;
            ((ed) this).field_u = ((ed) this).field_u + 1;
            ((ed) this).field_p[fieldTemp$0] = (byte) 0;
            var4 = (CharSequence) (Object) param1;
            ((ed) this).field_u = ((ed) this).field_u + l.a(87, ((ed) this).field_p, var4, param1.length(), 0, ((ed) this).field_u);
            int fieldTemp$1 = ((ed) this).field_u;
            ((ed) this).field_u = ((ed) this).field_u + 1;
            ((ed) this).field_p[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "ed.EA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(boolean param0) {
        int var4 = Vertigo2.field_L ? 1 : 0;
        int fieldTemp$0 = ((ed) this).field_u;
        ((ed) this).field_u = ((ed) this).field_u + 1;
        int var2 = ((ed) this).field_p[fieldTemp$0];
        int var3 = 0;
        if (param0) {
            ((ed) this).field_u = -91;
        }
        while (var2 < 0) {
            var3 = (var2 & 127 | var3) << 7;
            int fieldTemp$1 = ((ed) this).field_u;
            ((ed) this).field_u = ((ed) this).field_u + 1;
            var2 = ((ed) this).field_p[fieldTemp$1];
        }
        return var2 | var3;
    }

    private final void a(long param0, int param1) {
        int fieldTemp$0 = ((ed) this).field_u;
        ((ed) this).field_u = ((ed) this).field_u + 1;
        ((ed) this).field_p[fieldTemp$0] = (byte)(int)(param0 >> 48);
        int fieldTemp$1 = ((ed) this).field_u;
        ((ed) this).field_u = ((ed) this).field_u + 1;
        ((ed) this).field_p[fieldTemp$1] = (byte)(int)(param0 >> 40);
        int fieldTemp$2 = ((ed) this).field_u;
        ((ed) this).field_u = ((ed) this).field_u + 1;
        ((ed) this).field_p[fieldTemp$2] = (byte)(int)(param0 >> 32);
        int fieldTemp$3 = ((ed) this).field_u;
        ((ed) this).field_u = ((ed) this).field_u + 1;
        ((ed) this).field_p[fieldTemp$3] = (byte)(int)(param0 >> 24);
        int fieldTemp$4 = ((ed) this).field_u;
        ((ed) this).field_u = ((ed) this).field_u + 1;
        ((ed) this).field_p[fieldTemp$4] = (byte)(int)(param0 >> 16);
        int fieldTemp$5 = ((ed) this).field_u;
        ((ed) this).field_u = ((ed) this).field_u + 1;
        ((ed) this).field_p[fieldTemp$5] = (byte)(int)(param0 >> 8);
        int fieldTemp$6 = ((ed) this).field_u;
        ((ed) this).field_u = ((ed) this).field_u + 1;
        ((ed) this).field_p[fieldTemp$6] = (byte)(int)param0;
    }

    final void a(byte param0, long param1) {
        int fieldTemp$0 = ((ed) this).field_u;
        ((ed) this).field_u = ((ed) this).field_u + 1;
        ((ed) this).field_p[fieldTemp$0] = (byte)(int)(param1 >> 56);
        int fieldTemp$1 = ((ed) this).field_u;
        ((ed) this).field_u = ((ed) this).field_u + 1;
        ((ed) this).field_p[fieldTemp$1] = (byte)(int)(param1 >> 48);
        int fieldTemp$2 = ((ed) this).field_u;
        ((ed) this).field_u = ((ed) this).field_u + 1;
        ((ed) this).field_p[fieldTemp$2] = (byte)(int)(param1 >> 40);
        if (param0 >= -108) {
            return;
        }
        int fieldTemp$3 = ((ed) this).field_u;
        ((ed) this).field_u = ((ed) this).field_u + 1;
        ((ed) this).field_p[fieldTemp$3] = (byte)(int)(param1 >> 32);
        int fieldTemp$4 = ((ed) this).field_u;
        ((ed) this).field_u = ((ed) this).field_u + 1;
        ((ed) this).field_p[fieldTemp$4] = (byte)(int)(param1 >> 24);
        int fieldTemp$5 = ((ed) this).field_u;
        ((ed) this).field_u = ((ed) this).field_u + 1;
        ((ed) this).field_p[fieldTemp$5] = (byte)(int)(param1 >> 16);
        int fieldTemp$6 = ((ed) this).field_u;
        ((ed) this).field_u = ((ed) this).field_u + 1;
        ((ed) this).field_p[fieldTemp$6] = (byte)(int)(param1 >> 8);
        int fieldTemp$7 = ((ed) this).field_u;
        ((ed) this).field_u = ((ed) this).field_u + 1;
        ((ed) this).field_p[fieldTemp$7] = (byte)(int)param1;
    }

    final int n(int param0) {
        ((ed) this).field_u = ((ed) this).field_u + param0;
        int var2 = (((ed) this).field_p[-2 + ((ed) this).field_u] << 8 & 65280) - -(255 & ((ed) this).field_p[((ed) this).field_u + -1]);
        if (!(var2 <= 32767)) {
            var2 = var2 - 65536;
        }
        return var2;
    }

    final int h(int param0) {
        if (param0 != -11) {
            field_r = null;
        }
        int fieldTemp$0 = ((ed) this).field_u;
        ((ed) this).field_u = ((ed) this).field_u + 1;
        return ((ed) this).field_p[fieldTemp$0] & 255;
    }

    final void a(int param0, byte param1) {
        if (param0 >= 0) {
            if (128 > param0) {
                ((ed) this).f(param0, param1 ^ 61);
                return;
            }
        }
        if (param1 != -73) {
            field_q = false;
        }
        if (param0 >= 0) {
            if (!(param0 >= 32768)) {
                ((ed) this).d(param0 + 32768, param1 + -1710);
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    final void a(int[] param0, int param1, int param2, int param3) {
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
        Object var14 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var13 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var5_int = ((ed) this).field_u;
            ((ed) this).field_u = param2;
            var6 = (-param2 + param1) / 8;
            var7 = 0;
            L1: while (true) {
              if (var7 >= var6) {
                L2: {
                  ((ed) this).field_u = var5_int;
                  if (param3 == -123) {
                    break L2;
                  } else {
                    var14 = null;
                    ((ed) this).a((java.math.BigInteger) null, (java.math.BigInteger) null, -97);
                    break L2;
                  }
                }
                break L0;
              } else {
                var8 = ((ed) this).b(true);
                var9 = ((ed) this).b(true);
                var10 = -957401312;
                var11 = -1640531527;
                var12 = 32;
                L3: while (true) {
                  int incrementValue$1 = var12;
                  var12--;
                  if (0 >= incrementValue$1) {
                    ((ed) this).field_u = ((ed) this).field_u - 8;
                    ((ed) this).e(var8, 0);
                    ((ed) this).e(var9, 0);
                    var7++;
                    continue L1;
                  } else {
                    var9 = var9 - ((var8 << 4 ^ var8 >>> 5) + var8 ^ param0[(var10 & 6974) >>> 11] + var10);
                    var10 = var10 - var11;
                    var8 = var8 - (var10 - -param0[3 & var10] ^ var9 + (var9 << 4 ^ var9 >>> 5));
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("ed.J(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
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
          throw wn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final byte g(int param0) {
        if (param0 <= 78) {
            field_o = null;
        }
        int fieldTemp$0 = ((ed) this).field_u;
        ((ed) this).field_u = ((ed) this).field_u + 1;
        return ((ed) this).field_p[fieldTemp$0];
    }

    final int a(byte param0) {
        ((ed) this).field_u = ((ed) this).field_u + 2;
        if (param0 != -11) {
            return -23;
        }
        return ((255 & ((ed) this).field_p[-2 + ((ed) this).field_u]) << 8) - -(255 & ((ed) this).field_p[-1 + ((ed) this).field_u]);
    }

    final void a(int[] param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var10 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var3_int = ((ed) this).field_u / 8;
            if (param1 == -12257) {
              ((ed) this).field_u = 0;
              var4 = 0;
              L1: while (true) {
                if (var4 >= var3_int) {
                  break L0;
                } else {
                  var5 = ((ed) this).b(true);
                  var6 = ((ed) this).b(true);
                  var7 = 0;
                  var8 = -1640531527;
                  var9 = 32;
                  L2: while (true) {
                    int incrementValue$5 = var9;
                    var9--;
                    if (incrementValue$5 <= 0) {
                      ((ed) this).field_u = ((ed) this).field_u - 8;
                      ((ed) this).e(var5, 0);
                      ((ed) this).e(var6, 0);
                      var4++;
                      continue L1;
                    } else {
                      var5 = var5 + ((var6 << 4 ^ var6 >>> 5) + var6 ^ param0[var7 & 3] + var7);
                      var7 = var7 + var8;
                      var6 = var6 + (var7 - -param0[(var7 & 6169) >>> 11] ^ var5 + (var5 << 4 ^ var5 >>> 5));
                      continue L2;
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("ed.JA(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ')');
        }
    }

    final static void a(long param0, int param1, byte param2) {
        mi var4 = uh.field_Wb;
        var4.j(param1, 127);
        var4.field_u = var4.field_u + 1;
        int var5 = var4.field_u;
        var4.f(7, 98);
        if (param2 > -95) {
            field_s = null;
        }
        var4.a((byte) -111, param0);
        var4.b((byte) 11, -var5 + var4.field_u);
    }

    final void d(int param0, int param1) {
        int fieldTemp$0 = ((ed) this).field_u;
        ((ed) this).field_u = ((ed) this).field_u + 1;
        ((ed) this).field_p[fieldTemp$0] = (byte)(param0 >> 8);
        if (param1 != -1783) {
            field_o = null;
        }
        int fieldTemp$1 = ((ed) this).field_u;
        ((ed) this).field_u = ((ed) this).field_u + 1;
        ((ed) this).field_p[fieldTemp$1] = (byte)param0;
    }

    final int j(int param0) {
        if (param0 != -3084) {
            byte discarded$0 = ((ed) this).g(-33);
        }
        int var2 = 255 & ((ed) this).field_p[((ed) this).field_u];
        if (var2 >= 128) {
            return -49152 + ((ed) this).a((byte) -11);
        }
        return ((ed) this).h(param0 ^ 3073) + -64;
    }

    final int c(int param0, int param1) {
        int var3 = om.a(((ed) this).field_u, param0, ((ed) this).field_p, 255);
        int var4 = 104 % ((-61 - param1) / 59);
        ((ed) this).e(var3, 0);
        return var3;
    }

    final void b(int param0, int param1) {
        int var3 = -111 / ((58 - param1) / 32);
        if (!(0 == (-128 & param0))) {
            if (!((param0 & -16384) == 0)) {
                if (!((param0 & -2097152) == 0)) {
                    if ((param0 & -268435456) != 0) {
                        ((ed) this).f(128 | param0 >>> 28, 104);
                    }
                    ((ed) this).f(128 | param0 >>> 21, 89);
                }
                ((ed) this).f(param0 >>> 14 | 128, 95);
            }
            ((ed) this).f(128 | param0 >>> 7, 80);
        }
        ((ed) this).f(127 & param0, 82);
    }

    final static void a(boolean param0, boolean param1) {
        el.field_e = !param0 ? new lb(or.field_k, de.field_g) : new lb(cg.field_c, oi.field_a);
        hk.field_o = new cr(0L, (cr) null);
        hk.field_o.b((cr) (Object) el.field_e.field_b, 118);
        hk.field_o.b(ne.field_G, 118);
        wc.field_m = new cr(0L, hb.field_D);
        lr.field_P = new cr(0L, (cr) null);
        wc.field_m.b(he.field_x, 118);
        wc.field_m.b(lr.field_P, 126);
        lr.field_P.b(im.field_j, 120);
        lr.field_P.b(Vertigo2.field_M, 120);
        ho.a(0, param0);
    }

    final boolean o(int param0) {
        if (param0 != -4111) {
            ((ed) this).f(113, 62);
        }
        ((ed) this).field_u = ((ed) this).field_u - 4;
        int var2 = om.a(((ed) this).field_u, 0, ((ed) this).field_p, 255);
        int var3 = ((ed) this).b(true);
        if (var2 == var3) {
            return true;
        }
        return false;
    }

    final void a(java.math.BigInteger param0, java.math.BigInteger param1, int param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
            var4_int = ((ed) this).field_u;
            ((ed) this).field_u = 0;
            var5 = new byte[var4_int];
            ((ed) this).a(0, var5, var4_int, -66);
            var6 = new java.math.BigInteger(var5);
            var7 = var6.modPow(param0, param1);
            if (param2 != 9157) {
                byte discarded$0 = ((ed) this).g(59);
            }
            var8 = var7.toByteArray();
            ((ed) this).field_u = 0;
            ((ed) this).d(var8.length, param2 ^ -9524);
            ((ed) this).a(0, param2 ^ -1119, var8, var8.length);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "ed.W(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void b(int param0, String param1) {
        long var3_long = 0L;
        RuntimeException var3 = null;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var10 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var3_long = 0L;
            var5 = (long)param0;
            var7 = param1.length();
            var8 = 19;
            L1: while (true) {
              if (var8 < 0) {
                this.a(var3_long, -8245);
                this.a(var5, -8245);
                break L0;
              } else {
                L2: {
                  var3_long = var3_long * 38L;
                  if (var7 > var8) {
                    L3: {
                      var9 = param1.charAt(var8);
                      if (var9 < 65) {
                        break L3;
                      } else {
                        if (var9 <= 90) {
                          var3_long = var3_long + (long)(2 + var9 - 65);
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L4: {
                      if (var9 < 97) {
                        break L4;
                      } else {
                        if (var9 > 122) {
                          break L4;
                        } else {
                          var3_long = var3_long + (long)(var9 - 95);
                          break L2;
                        }
                      }
                    }
                    L5: {
                      if (var9 < 48) {
                        break L5;
                      } else {
                        if (var9 > 57) {
                          break L5;
                        } else {
                          var3_long = var3_long + (long)(-48 + var9 + 28);
                          break L2;
                        }
                      }
                    }
                    var3_long = var3_long + 1L;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L6: {
                  if (var8 == 10) {
                    var5 = var3_long;
                    var3_long = 0L;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                var8--;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var3;
            stackOut_22_1 = new StringBuilder().append("ed.M(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
    }

    final String c(boolean param0) {
        int fieldTemp$0 = ((ed) this).field_u;
        ((ed) this).field_u = ((ed) this).field_u + 1;
        int var2 = ((ed) this).field_p[fieldTemp$0];
        if (!(var2 == 0)) {
            throw new IllegalStateException("");
        }
        if (!param0) {
            field_n = 79;
        }
        int var3 = ((ed) this).field_u;
        while (true) {
            int fieldTemp$1 = ((ed) this).field_u;
            ((ed) this).field_u = ((ed) this).field_u + 1;
            if (((ed) this).field_p[fieldTemp$1] == 0) {
                break;
            }
        }
        int var4 = -1 + (-var3 + ((ed) this).field_u);
        if (!(0 != var4)) {
            return "";
        }
        return mj.a(87, ((ed) this).field_p, var3, var4);
    }

    final void h(int param0, int param1) {
        int var4 = Vertigo2.field_L ? 1 : 0;
        while (param0 > ((ed) this).field_u) {
            int fieldTemp$0 = ((ed) this).field_u;
            ((ed) this).field_u = ((ed) this).field_u + 1;
            ((ed) this).field_p[fieldTemp$0] = (byte) 0;
        }
        if (param1 != 2) {
            ((ed) this).field_p = null;
        }
    }

    final String f(int param0) {
        int var2 = ((ed) this).field_u;
        if (param0 != 128) {
            int discarded$0 = ((ed) this).c(56, 64);
        }
        while (true) {
            int fieldTemp$1 = ((ed) this).field_u;
            ((ed) this).field_u = ((ed) this).field_u + 1;
            if (((ed) this).field_p[fieldTemp$1] == 0) {
                break;
            }
        }
        int var3 = -1 + (-var2 + ((ed) this).field_u);
        if (var3 == 0) {
            return "";
        }
        return mj.a(param0 + -236, ((ed) this).field_p, var2, var3);
    }

    final int l(int param0) {
        if (param0 != -1317721944) {
            Object var3 = null;
            ((ed) this).a(109, (byte[]) null, -99, 99);
        }
        int var2 = 255 & ((ed) this).field_p[((ed) this).field_u];
        if (var2 < 128) {
            return ((ed) this).h(param0 + 1317721933);
        }
        return ((ed) this).a((byte) -11) - 32768;
    }

    final String k(int param0) {
        if (0 == ((ed) this).field_p[((ed) this).field_u]) {
            ((ed) this).field_u = ((ed) this).field_u + 1;
            return null;
        }
        if (param0 > -70) {
            return null;
        }
        return ((ed) this).f(128);
    }

    final void i(int param0, int param1) {
        int fieldTemp$0 = ((ed) this).field_u;
        ((ed) this).field_u = ((ed) this).field_u + 1;
        ((ed) this).field_p[fieldTemp$0] = (byte)(param1 >> 16);
        int fieldTemp$1 = ((ed) this).field_u;
        ((ed) this).field_u = ((ed) this).field_u + 1;
        ((ed) this).field_p[fieldTemp$1] = (byte)(param1 >> 8);
        if (param0 != -1725083856) {
            return;
        }
        int fieldTemp$2 = ((ed) this).field_u;
        ((ed) this).field_u = ((ed) this).field_u + 1;
        ((ed) this).field_p[fieldTemp$2] = (byte)param1;
    }

    ed(int param0) {
        ((ed) this).field_u = 0;
        ((ed) this).field_p = vc.a(param0, (byte) -69);
    }

    final void b(byte param0, int param1) {
        int var3 = 1 % ((-44 - param0) / 50);
        ((ed) this).field_p[((ed) this).field_u - (param1 - -1)] = (byte)param1;
    }

    final void a(int param0, int param1, byte[] param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (param1 == -10140) {
              var5_int = param0;
              L1: while (true) {
                if (var5_int >= param3 + param0) {
                  break L0;
                } else {
                  int fieldTemp$7 = ((ed) this).field_u;
                  ((ed) this).field_u = ((ed) this).field_u + 1;
                  ((ed) this).field_p[fieldTemp$7] = param2[var5_int];
                  var5_int++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("ed.G(").append(param0).append(',').append(param1).append(',');
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
          throw wn.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param3 + ')');
        }
    }

    ed(byte[] param0) {
        try {
            ((ed) this).field_u = 0;
            ((ed) this).field_p = param0;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "ed.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 0;
        field_s = "Type your age in years";
        field_o = "Anonymous";
        field_t = false;
        field_r = "You must be a member to play with the current options.";
    }
}
