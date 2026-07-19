/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wq extends nm {
    int field_l;
    static int field_j;
    static String field_m;
    byte[] field_k;
    static String[] field_i;

    final void a(byte param0, int param1) {
        if (param0 != 47) {
            byte[] var4 = (byte[]) null;
            this.a(99, (byte[]) null, 100, 7);
        }
        int fieldTemp$0 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$0] = (byte)(param1 >> -687701936);
        int fieldTemp$1 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$1] = (byte)(param1 >> -667446904);
        int fieldTemp$2 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$2] = (byte)param1;
    }

    public static void h(int param0) {
        field_i = null;
        if (param0 != 0) {
            field_j = -113;
        }
        field_m = null;
    }

    final int c(boolean param0) {
        if (param0) {
            this.field_l = -16;
        }
        if (0 <= this.field_k[this.field_l]) {
            return this.i(65280);
        }
        return 2147483647 & this.e(255);
    }

    final byte b(boolean param0) {
        if (!param0) {
            field_j = 8;
        }
        int fieldTemp$0 = this.field_l;
        this.field_l = this.field_l + 1;
        return this.field_k[fieldTemp$0];
    }

    final void b(int param0, byte param1) {
        if (param0 < 64) {
            if (!(-64 > param0)) {
                this.a(80, param0 - -64);
                return;
            }
        }
        if (-16385 < (param0 ^ -1)) {
            if (!(-16384 > param0)) {
                this.b((byte) 121, 49152 + param0);
                return;
            }
        }
        if (param1 < 110) {
            return;
        }
        throw new IllegalArgumentException();
    }

    final int e(int param0) {
        if (param0 != 255) {
            field_m = (String) null;
        }
        this.field_l = this.field_l + 4;
        return (255 & this.field_k[-1 + this.field_l]) + (((255 & this.field_k[this.field_l + -3]) << -1078545808) + ((255 & this.field_k[this.field_l - 4]) << 204942008)) - -(this.field_k[this.field_l - 2] << 151151784 & 65280);
    }

    final void a(java.math.BigInteger param0, java.math.BigInteger param1, int param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
            var4_int = this.field_l;
            this.field_l = 0;
            var5 = new byte[var4_int];
            this.a(0, var5, 110, var4_int);
            var6 = new java.math.BigInteger(var5);
            var7 = var6.modPow(param0, param1);
            var8 = var7.toByteArray();
            this.field_l = 0;
            this.b((byte) 126, var8.length);
            if (param2 != 19775) {
                this.field_l = -13;
            }
            this.a(var8, param2 + -19776, 0, var8.length);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "wq.FA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(int param0, int[] param1) {
        int discarded$4 = 0;
        int incrementValue$5 = 0;
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
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var3_int = this.field_l / 8;
            this.field_l = 0;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var3_int) {
                L2: {
                  if (param0 == 18146) {
                    break L2;
                  } else {
                    discarded$4 = this.k(-91);
                    break L2;
                  }
                }
                break L0;
              } else {
                var5 = this.e(255);
                var6 = this.e(255);
                var7 = 0;
                var8 = -1640531527;
                var9 = 32;
                L3: while (true) {
                  incrementValue$5 = var9;
                  var9--;
                  if (incrementValue$5 <= 0) {
                    this.field_l = this.field_l - 8;
                    this.a(var5, (byte) -79);
                    this.a(var6, (byte) -79);
                    var4++;
                    continue L1;
                  } else {
                    var5 = var5 + (var6 + (var6 << -946715356 ^ var6 >>> -1641792475) ^ var7 + param1[3 & var7]);
                    var7 = var7 + var8;
                    var6 = var6 + (param1[(var7 & 6958) >>> 1379321195] + var7 ^ (var5 >>> -612958331 ^ var5 << 1769981188) + var5);
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3);
            stackOut_10_1 = new StringBuilder().append("wq.HA(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    final int c(int param0) {
        int discarded$0 = 0;
        if (param0 != -1342) {
            discarded$0 = this.k(54);
        }
        int var2 = this.field_k[this.field_l] & 255;
        if ((var2 ^ -1) <= -129) {
            return this.i(65280) - 49152;
        }
        return this.l(255) - 64;
    }

    final String d(int param0) {
        int fieldTemp$0 = 0;
        int var2 = this.field_l;
        while (true) {
            fieldTemp$0 = this.field_l;
            this.field_l = this.field_l + 1;
            if (-1 == (this.field_k[fieldTemp$0] ^ -1)) {
                break;
            }
        }
        int var3 = param0 + (this.field_l + -var2);
        if (-1 == (var3 ^ -1)) {
            return "";
        }
        return df.a(var3, -113, this.field_k, var2);
    }

    final void a(int param0, byte param1) {
        if (param1 != -79) {
            this.a((byte) 92, 64L);
        }
        int fieldTemp$0 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$0] = (byte)(param0 >> 1141642936);
        int fieldTemp$1 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$1] = (byte)(param0 >> 2060656496);
        int fieldTemp$2 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$2] = (byte)(param0 >> 1990220584);
        int fieldTemp$3 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$3] = (byte)param0;
    }

    final void a(String param0, int param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        int fieldTemp$0 = 0;
        try {
            var3_int = param0.indexOf(' ');
            if (!((var3_int ^ -1) > param1)) {
                throw new IllegalArgumentException("");
            }
            var4 = (CharSequence) ((Object) param0);
            this.field_l = this.field_l + hj.a(param0.length(), this.field_k, (byte) 86, this.field_l, var4, 0);
            fieldTemp$0 = this.field_l;
            this.field_l = this.field_l + 1;
            this.field_k[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "wq.OA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void c(byte param0, int param1) {
        if (param0 > -26) {
            this.a(-112L, (byte) -53);
        }
        this.field_k[this.field_l + (-param1 + -4)] = (byte)(param1 >> 304937912);
        this.field_k[-3 + -param1 + this.field_l] = (byte)(param1 >> 1132017520);
        this.field_k[-2 + -param1 + this.field_l] = (byte)(param1 >> 1770750088);
        this.field_k[-1 + this.field_l - param1] = (byte)param1;
    }

    final void b(int param0, int param1) {
        if ((param1 ^ -1) <= -1) {
            if (!(-129 >= (param1 ^ -1))) {
                this.a(-113, param1);
                return;
            }
        }
        if (param0 >= (param1 ^ -1)) {
            if (-32769 < (param1 ^ -1)) {
                this.b((byte) 109, param1 + 32768);
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    final String m(int param0) {
        if (this.field_k[this.field_l] == 0) {
            this.field_l = this.field_l + 1;
            return null;
        }
        if (param0 != 0) {
            return (String) null;
        }
        return this.d(-1);
    }

    final void e(byte param0, int param1) {
        int discarded$0 = 0;
        if (-1 != (param1 & -128 ^ -1)) {
            if ((-16384 & param1) != 0) {
                if (!(0 == (param1 & -2097152))) {
                    if (!(0 == (-268435456 & param1))) {
                        this.a(-115, param1 >>> 1187961404 | 128);
                    }
                    this.a(125, (270066403 | param1) >>> 1468025749);
                }
                this.a(105, 128 | param1 >>> 444751726);
            }
            this.a(-100, param1 >>> -1084662233 | 128);
        }
        this.a(-104, 127 & param1);
        if (param0 > -53) {
            discarded$0 = this.e(-13);
        }
    }

    final void a(byte[] param0, int param1, int param2, int param3) {
        int fieldTemp$7 = 0;
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
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -1) {
                break L1;
              } else {
                field_j = 69;
                break L1;
              }
            }
            var5_int = param2;
            L2: while (true) {
              if (var5_int >= param2 + param3) {
                break L0;
              } else {
                fieldTemp$7 = this.field_l;
                this.field_l = this.field_l + 1;
                this.field_k[fieldTemp$7] = param0[var5_int];
                var5_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("wq.RA(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int a(int param0) {
        this.field_l = this.field_l + 2;
        if (param0 <= 125) {
            field_m = (String) null;
        }
        int var2 = ((255 & this.field_k[-2 + this.field_l]) << 455080648) - -(this.field_k[-1 + this.field_l] & 255);
        if (!(32767 >= var2)) {
            var2 = var2 - 65536;
        }
        return var2;
    }

    final void f(byte param0, int param1) {
        int discarded$0 = 0;
        int fieldTemp$1 = 0;
        int var4 = BrickABrac.field_J ? 1 : 0;
        if (param0 != -74) {
            discarded$0 = this.l(-125);
        }
        while (param1 > this.field_l) {
            fieldTemp$1 = this.field_l;
            this.field_l = this.field_l + 1;
            this.field_k[fieldTemp$1] = (byte) 0;
        }
    }

    private final void a(byte param0, long param1) {
        int fieldTemp$0 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$0] = (byte)(int)(param1 >> -1307694672);
        if (param0 != -109) {
            field_j = -111;
        }
        int fieldTemp$1 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$1] = (byte)(int)(param1 >> -1120909848);
        int fieldTemp$2 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$2] = (byte)(int)(param1 >> 1344064736);
        int fieldTemp$3 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$3] = (byte)(int)(param1 >> -33659624);
        int fieldTemp$4 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$4] = (byte)(int)(param1 >> 131818576);
        int fieldTemp$5 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$5] = (byte)(int)(param1 >> -1632991224);
        int fieldTemp$6 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$6] = (byte)(int)param1;
    }

    final void a(int param0, byte[] param1, int param2, int param3) {
        int fieldTemp$2 = 0;
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
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var5_int = param0;
            L1: while (true) {
              if (var5_int >= param0 + param3) {
                L2: {
                  if (param2 > 109) {
                    break L2;
                  } else {
                    this.a(-126, -11L);
                    break L2;
                  }
                }
                break L0;
              } else {
                fieldTemp$2 = this.field_l;
                this.field_l = this.field_l + 1;
                param1[var5_int] = this.field_k[fieldTemp$2];
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("wq.F(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void d(byte param0, int param1) {
        int discarded$0 = 0;
        this.field_k[-1 + -param1 + this.field_l] = (byte)param1;
        if (param0 < 112) {
            discarded$0 = this.e(-32);
        }
    }

    final void a(long param0, byte param1) {
        int fieldTemp$0 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$0] = (byte)(int)(param0 >> -274379168);
        int fieldTemp$1 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$1] = (byte)(int)(param0 >> 1989118680);
        if (param1 != -32) {
            field_i = (String[]) null;
        }
        int fieldTemp$2 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$2] = (byte)(int)(param0 >> -560320816);
        int fieldTemp$3 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$3] = (byte)(int)(param0 >> 919627912);
        int fieldTemp$4 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$4] = (byte)(int)param0;
    }

    final int l(int param0) {
        if (param0 != 255) {
            this.a((byte) 71, 82L);
        }
        int fieldTemp$0 = this.field_l;
        this.field_l = this.field_l + 1;
        return 255 & this.field_k[fieldTemp$0];
    }

    final int k(int param0) {
        boolean discarded$0 = false;
        if (param0 != -32768) {
            discarded$0 = this.d((byte) 73);
        }
        int var2 = this.field_k[this.field_l] & 255;
        if (var2 >= 128) {
            return -32768 + this.i(65280);
        }
        return this.l(255);
    }

    final void a(int param0, String param1) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        try {
            var3_int = param1.indexOf(' ');
            if (param0 <= var3_int) {
                throw new IllegalArgumentException("");
            }
            fieldTemp$0 = this.field_l;
            this.field_l = this.field_l + 1;
            this.field_k[fieldTemp$0] = (byte) 0;
            var4 = (CharSequence) ((Object) param1);
            this.field_l = this.field_l + hj.a(param1.length(), this.field_k, (byte) 86, this.field_l, var4, 0);
            fieldTemp$1 = this.field_l;
            this.field_l = this.field_l + 1;
            this.field_k[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "wq.BA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int[] param0, int param1, int param2, byte param3) {
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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var13 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var5_int = this.field_l;
            this.field_l = param1;
            var6 = (-param1 + param2) / 8;
            var7 = 0;
            L1: while (true) {
              if (var7 >= var6) {
                var7 = 103 / ((param3 - -1) / 55);
                this.field_l = var5_int;
                break L0;
              } else {
                var8 = this.e(255);
                var9 = this.e(255);
                var10 = -957401312;
                var11 = -1640531527;
                var12 = 32;
                L2: while (true) {
                  incrementValue$1 = var12;
                  var12--;
                  if (incrementValue$1 <= 0) {
                    this.field_l = this.field_l - 8;
                    this.a(var8, (byte) -79);
                    this.a(var9, (byte) -79);
                    var7++;
                    continue L1;
                  } else {
                    var9 = var9 - (var8 + (var8 << -793250620 ^ var8 >>> -1566216443) ^ param0[var10 >>> -1183638901 & 367001603] + var10);
                    var10 = var10 - var11;
                    var8 = var8 - (var9 + (var9 >>> 464504037 ^ var9 << -1023497756) ^ param0[3 & var10] + var10);
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var5);
            stackOut_9_1 = new StringBuilder().append("wq.O(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, long param1) {
        int fieldTemp$0 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$0] = (byte)(int)(param1 >> -265878984);
        if (param0 != -23054) {
            field_m = (String) null;
        }
        int fieldTemp$1 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$1] = (byte)(int)(param1 >> 1412866288);
        int fieldTemp$2 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$2] = (byte)(int)(param1 >> -1055489688);
        int fieldTemp$3 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$3] = (byte)(int)(param1 >> -2080572768);
        int fieldTemp$4 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$4] = (byte)(int)(param1 >> 1887682520);
        int fieldTemp$5 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$5] = (byte)(int)(param1 >> -1909828016);
        int fieldTemp$6 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$6] = (byte)(int)(param1 >> 736090184);
        int fieldTemp$7 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$7] = (byte)(int)param1;
    }

    final void c(int param0, int param1) {
        if (param1 != 255) {
            this.field_l = 13;
        }
        this.field_k[-param0 + (this.field_l - 2)] = (byte)(param0 >> -671331128);
        this.field_k[this.field_l + -param0 + -1] = (byte)param0;
    }

    final static tp[] a(String param0, mf param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        tp[] stackIn_2_0 = null;
        tp[] stackIn_4_0 = null;
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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        tp[] stackOut_3_0 = null;
        tp[] stackOut_1_0 = null;
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
            var4_int = param1.a(param0, false);
            var5 = param1.a(var4_int, -24, param2);
            if (param3 == -946715356) {
              stackOut_3_0 = ba.a(var4_int, var5, -59, param1);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (tp[]) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var4);
            stackOut_5_1 = new StringBuilder().append("wq.W(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
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
          L2: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final int i(int param0) {
        this.field_l = this.field_l + 2;
        if (param0 != 65280) {
            this.field_l = 113;
        }
        return (255 & this.field_k[-1 + this.field_l]) + (65280 & this.field_k[-2 + this.field_l] << -1065335576);
    }

    final int c(byte param0) {
        int fieldTemp$1 = 0;
        int var5 = BrickABrac.field_J ? 1 : 0;
        int var3 = 49 % ((param0 - 44) / 57);
        int fieldTemp$0 = this.field_l;
        this.field_l = this.field_l + 1;
        int var2 = this.field_k[fieldTemp$0];
        int var4 = 0;
        while (-1 < (var2 ^ -1)) {
            var4 = (127 & var2 | var4) << 902878759;
            fieldTemp$1 = this.field_l;
            this.field_l = this.field_l + 1;
            var2 = this.field_k[fieldTemp$1];
        }
        return var2 | var4;
    }

    final void a(boolean param0, String param1) {
        RuntimeException var3 = null;
        long var3_long = 0L;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                this.field_k = (byte[]) null;
                break L1;
              }
            }
            var3_long = 0L;
            var5 = 0L;
            var7 = param1.length();
            var8 = 19;
            L2: while (true) {
              if (0 > var8) {
                this.a((byte) -109, var3_long);
                this.a((byte) -109, var5);
                break L0;
              } else {
                L3: {
                  var3_long = var3_long * 38L;
                  if (var8 >= var7) {
                    break L3;
                  } else {
                    L4: {
                      var9 = param1.charAt(var8);
                      if (var9 < 65) {
                        break L4;
                      } else {
                        if (90 >= var9) {
                          var3_long = var3_long + (long)(-65 + (var9 + 2));
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (var9 < 97) {
                        break L5;
                      } else {
                        if (var9 > 122) {
                          break L5;
                        } else {
                          var3_long = var3_long + (long)(-95 + var9);
                          break L3;
                        }
                      }
                    }
                    L6: {
                      if (var9 < 48) {
                        break L6;
                      } else {
                        if (57 >= var9) {
                          var3_long = var3_long + (long)(28 - (-var9 + 48));
                          break L3;
                        } else {
                          break L6;
                        }
                      }
                    }
                    var3_long = var3_long + 1L;
                    break L3;
                  }
                }
                L7: {
                  if (-11 == (var8 ^ -1)) {
                    var5 = var3_long;
                    var3_long = 0L;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                var8--;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var3);
            stackOut_24_1 = new StringBuilder().append("wq.K(").append(param0).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
    }

    final int j(int param0) {
        this.field_l = this.field_l + 3;
        if (param0 != 48) {
            this.field_l = 59;
        }
        int var2 = (this.field_k[-1 + this.field_l] & 255) + (((255 & this.field_k[-2 + this.field_l]) << 1004901768) + ((this.field_k[this.field_l - 3] & 255) << 1640381200));
        if (!(var2 <= 8388607)) {
            var2 = var2 - 16777216;
        }
        return var2;
    }

    final String a(byte param0) {
        int fieldTemp$0 = this.field_l;
        this.field_l = this.field_l + 1;
        int var2 = this.field_k[fieldTemp$0];
        if (-1 != (var2 ^ -1)) {
            throw new IllegalStateException("");
        }
        int var3 = this.c((byte) 110);
        if (param0 != 24) {
            this.d((byte) 106, 82);
        }
        if (var3 - -this.field_l > this.field_k.length) {
            throw new IllegalStateException("");
        }
        String var4 = mj.a((byte) -116, var3, this.field_l, this.field_k);
        this.field_l = this.field_l + var3;
        return var4;
    }

    final int d(int param0, int param1) {
        int discarded$0 = 0;
        int var3 = ba.a(this.field_k, 9, param1, this.field_l);
        if (param0 != 3) {
            discarded$0 = this.c(46);
        }
        this.a(var3, (byte) -79);
        return var3;
    }

    final String f(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = this.field_l;
        this.field_l = this.field_l + 1;
        int var2 = this.field_k[fieldTemp$0];
        if (!(0 == var2)) {
            throw new IllegalStateException("");
        }
        int var3 = this.field_l;
        if (param0 != 255) {
            this.a((byte) -99, -73);
        }
        while (true) {
            fieldTemp$1 = this.field_l;
            this.field_l = this.field_l + 1;
            if (0 == this.field_k[fieldTemp$1]) {
                break;
            }
        }
        int var4 = -1 + (-var3 + this.field_l);
        if (!(0 != var4)) {
            return "";
        }
        return df.a(var4, 34, this.field_k, var3);
    }

    final boolean d(byte param0) {
        this.field_l = this.field_l - 4;
        int var2 = ba.a(this.field_k, param0 + 36, 0, this.field_l);
        int var3 = this.e(255);
        if (!(var2 != var3)) {
            return true;
        }
        if (param0 != -27) {
            field_j = -56;
            return false;
        }
        return false;
    }

    final void b(byte param0, int param1) {
        if (param0 < 106) {
            return;
        }
        int fieldTemp$0 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$0] = (byte)(param1 >> 1498634568);
        int fieldTemp$1 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$1] = (byte)param1;
    }

    final int e(byte param0) {
        this.field_l = this.field_l + 3;
        if (param0 != -34) {
            return 20;
        }
        return (255 & this.field_k[this.field_l + -1]) + ((this.field_k[-3 + this.field_l] & 255) << 2114161392) + (this.field_k[this.field_l - 2] << -1805182168 & 65280);
    }

    final long g(int param0) {
        if (param0 != -32768) {
            this.f((byte) 23, -28);
        }
        long var2 = 4294967295L & (long)this.e(param0 ^ -32513);
        long var4 = (long)this.e(param0 + 33023) & 4294967295L;
        return var4 + (var2 << 1957517792);
    }

    final void a(int param0, int param1) {
        int fieldTemp$0 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$0] = (byte)param1;
        int var3 = -41 / ((-67 - param0) / 32);
    }

    wq(int param0) {
        this.field_l = 0;
        this.field_k = gd.a(param0, (byte) 113);
    }

    wq(byte[] param0) {
        try {
            this.field_l = 0;
            this.field_k = param0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "wq.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = "This game option is only available to members.";
    }
}
