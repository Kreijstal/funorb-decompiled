/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ka extends gg {
    static int field_q;
    static int field_p;
    static pf field_n;
    int field_k;
    static String field_l;
    static ba field_m;
    static long field_o;
    byte[] field_r;

    final int h(int param0) {
        if (param0 != 26491) {
            return 2;
        }
        if (((ka) this).field_r[((ka) this).field_k] < 0) {
            return ((ka) this).b(false) & 2147483647;
        }
        return ((ka) this).c((byte) 100);
    }

    final void b(int param0, int param1) {
        int fieldTemp$0 = ((ka) this).field_k;
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[fieldTemp$0] = (byte)(param1 >> 24);
        if (param0 != 0) {
            return;
        }
        int fieldTemp$1 = ((ka) this).field_k;
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[fieldTemp$1] = (byte)(param1 >> 16);
        int fieldTemp$2 = ((ka) this).field_k;
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[fieldTemp$2] = (byte)(param1 >> 8);
        int fieldTemp$3 = ((ka) this).field_k;
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[fieldTemp$3] = (byte)param1;
    }

    final void a(int param0, int param1) {
        int var4 = stellarshard.field_B;
        while (((ka) this).field_k < param0) {
            int fieldTemp$0 = ((ka) this).field_k;
            ((ka) this).field_k = ((ka) this).field_k + 1;
            ((ka) this).field_r[fieldTemp$0] = (byte) 0;
        }
        if (param1 != -18920) {
            field_q = 77;
            return;
        }
    }

    final String f(byte param0) {
        int fieldTemp$0 = ((ka) this).field_k;
        ((ka) this).field_k = ((ka) this).field_k + 1;
        int var2 = ((ka) this).field_r[fieldTemp$0];
        if (!(var2 == 0)) {
            throw new IllegalStateException("");
        }
        if (param0 != 94) {
            return null;
        }
        int var3 = ((ka) this).field_k;
        while (true) {
            int fieldTemp$1 = ((ka) this).field_k;
            ((ka) this).field_k = ((ka) this).field_k + 1;
            if (((ka) this).field_r[fieldTemp$1] == 0) {
                break;
            }
        }
        int var4 = ((ka) this).field_k + (-var3 + -1);
        if (!(0 != var4)) {
            return "";
        }
        return kk.a(var4, (byte) 121, var3, ((ka) this).field_r);
    }

    final void a(boolean param0, int param1) {
        int fieldTemp$0 = ((ka) this).field_k;
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[fieldTemp$0] = (byte)param1;
        if (param0) {
            field_p = 77;
        }
    }

    final String e(byte param0) {
        int var2 = ((ka) this).field_k;
        while (true) {
            int fieldTemp$0 = ((ka) this).field_k;
            ((ka) this).field_k = ((ka) this).field_k + 1;
            if (((ka) this).field_r[fieldTemp$0] == 0) {
                break;
            }
        }
        int var3 = -1 + (((ka) this).field_k - var2);
        if (!(var3 != 0)) {
            return "";
        }
        if (param0 < 78) {
            return null;
        }
        return kk.a(var3, (byte) 93, var2, ((ka) this).field_r);
    }

    final void a(int param0, long param1) {
        int fieldTemp$0 = ((ka) this).field_k;
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[fieldTemp$0] = (byte)(int)(param1 >> 32);
        int fieldTemp$1 = ((ka) this).field_k;
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[fieldTemp$1] = (byte)(int)(param1 >> 24);
        int fieldTemp$2 = ((ka) this).field_k;
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[fieldTemp$2] = (byte)(int)(param1 >> 16);
        if (param0 <= 9) {
            ((ka) this).field_r = null;
            int fieldTemp$3 = ((ka) this).field_k;
            ((ka) this).field_k = ((ka) this).field_k + 1;
            ((ka) this).field_r[fieldTemp$3] = (byte)(int)(param1 >> 8);
            int fieldTemp$4 = ((ka) this).field_k;
            ((ka) this).field_k = ((ka) this).field_k + 1;
            ((ka) this).field_r[fieldTemp$4] = (byte)(int)param1;
            return;
        }
        int fieldTemp$5 = ((ka) this).field_k;
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[fieldTemp$5] = (byte)(int)(param1 >> 8);
        int fieldTemp$6 = ((ka) this).field_k;
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[fieldTemp$6] = (byte)(int)param1;
    }

    final boolean a(boolean param0) {
        ((ka) this).field_k = ((ka) this).field_k - 4;
        int var2 = jj.a(0, ((ka) this).field_r, ((ka) this).field_k, -107);
        int var3 = ((ka) this).b(false);
        if (var3 == var2) {
            return true;
        }
        if (!param0) {
            return true;
        }
        return false;
    }

    final void c(int param0, int param1) {
        int fieldTemp$0 = ((ka) this).field_k;
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[fieldTemp$0] = (byte)(param0 >> 8);
        if (param1 > -110) {
            ((ka) this).field_k = 36;
            int fieldTemp$1 = ((ka) this).field_k;
            ((ka) this).field_k = ((ka) this).field_k + 1;
            ((ka) this).field_r[fieldTemp$1] = (byte)param0;
            return;
        }
        int fieldTemp$2 = ((ka) this).field_k;
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[fieldTemp$2] = (byte)param0;
    }

    final byte g(int param0) {
        int var2 = 103 % ((param0 - 45) / 56);
        int fieldTemp$0 = ((ka) this).field_k;
        ((ka) this).field_k = ((ka) this).field_k + 1;
        return ((ka) this).field_r[fieldTemp$0];
    }

    final String a(int param0) {
        if (!(((ka) this).field_r[((ka) this).field_k] != param0)) {
            ((ka) this).field_k = ((ka) this).field_k + 1;
            return null;
        }
        return ((ka) this).e((byte) 87);
    }

    final int c(int param0, byte param1) {
        int var3 = 0;
        if (param1 != -3) {
            field_l = null;
            var3 = jj.a(param0, ((ka) this).field_r, ((ka) this).field_k, -65);
            ((ka) this).b(0, var3);
            return var3;
        }
        var3 = jj.a(param0, ((ka) this).field_r, ((ka) this).field_k, -65);
        ((ka) this).b(0, var3);
        return var3;
    }

    final void a(int param0, int[] param1, int param2, int param3) {
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
        int var14 = 0;
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
        var14 = stellarshard.field_B;
        try {
          L0: {
            var5_int = ((ka) this).field_k;
            ((ka) this).field_k = param2;
            var6 = (-param2 + param3) / 8;
            var7 = 0;
            var8 = -113 % ((param0 - 29) / 33);
            L1: while (true) {
              if (var6 <= var7) {
                ((ka) this).field_k = var5_int;
                break L0;
              } else {
                var9 = ((ka) this).b(false);
                var10 = ((ka) this).b(false);
                var11 = -957401312;
                var12 = -1640531527;
                var13 = 32;
                L2: while (true) {
                  int incrementValue$1 = var13;
                  var13--;
                  if (incrementValue$1 <= 0) {
                    ((ka) this).field_k = ((ka) this).field_k - 8;
                    ((ka) this).b(0, var9);
                    ((ka) this).b(0, var10);
                    var7++;
                    continue L1;
                  } else {
                    var10 = var10 - (var9 + (var9 >>> 5 ^ var9 << 4) ^ var11 + param1[(7205 & var11) >>> 11]);
                    var11 = var11 - var12;
                    var9 = var9 - (var11 + param1[3 & var11] ^ (var10 >>> 5 ^ var10 << 4) + var10);
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
            stackOut_9_0 = (RuntimeException) var5;
            stackOut_9_1 = new StringBuilder().append("ka.HA(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final int c(byte param0) {
        if (param0 < 21) {
            return 45;
        }
        ((ka) this).field_k = ((ka) this).field_k + 2;
        return (((ka) this).field_r[((ka) this).field_k + -2] << 8 & 65280) + (255 & ((ka) this).field_r[((ka) this).field_k - 1]);
    }

    public static void a(byte param0) {
        field_n = null;
        field_l = null;
        field_m = null;
        int var1 = -51;
    }

    final void a(byte param0, int param1) {
        if (param1 >= 64) {
            if (16384 <= param1) {
                if (param0 < 3) {
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (param1 < -16384) {
                if (param0 < 3) {
                    return;
                }
                throw new IllegalArgumentException();
            }
            ((ka) this).c(param1 - -49152, -128);
            return;
        }
        if (param1 < -64) {
            if (16384 <= param1) {
                if (param0 < 3) {
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (param1 < -16384) {
                if (param0 < 3) {
                    return;
                }
                throw new IllegalArgumentException();
            }
            ((ka) this).c(param1 - -49152, -128);
            return;
        }
        ((ka) this).a(false, param1 + 64);
    }

    final void b(String param0, int param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        if (param1 != -9799) {
            return;
        }
        try {
            var3_int = param0.indexOf(' ');
            if (!(var3_int < 0)) {
                throw new IllegalArgumentException("");
            }
            var4 = (CharSequence) (Object) param0;
            ((ka) this).field_k = ((ka) this).field_k + qi.a(((ka) this).field_r, param1 + 9689, ((ka) this).field_k, 0, var4, param0.length());
            int fieldTemp$0 = ((ka) this).field_k;
            ((ka) this).field_k = ((ka) this).field_k + 1;
            ((ka) this).field_r[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "ka.DA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void a(boolean param0, java.math.BigInteger param1, java.math.BigInteger param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
            if (param0) {
                ((ka) this).field_r = null;
            }
            var4_int = ((ka) this).field_k;
            ((ka) this).field_k = 0;
            var5 = new byte[var4_int];
            ((ka) this).a(0, (byte) -108, var4_int, var5);
            var6 = new java.math.BigInteger(var5);
            var7 = var6.modPow(param2, param1);
            var8 = var7.toByteArray();
            ((ka) this).field_k = 0;
            ((ka) this).c(var8.length, -123);
            ((ka) this).a(var8.length, 0, (byte) -13, var8);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "ka.SA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, int param1, byte param2, byte[] param3) {
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
        var6 = stellarshard.field_B;
        try {
          L0: {
            if (param2 == -13) {
              var5_int = param1;
              L1: while (true) {
                if (param1 - -param0 <= var5_int) {
                  break L0;
                } else {
                  int fieldTemp$8 = ((ka) this).field_k;
                  ((ka) this).field_k = ((ka) this).field_k + 1;
                  ((ka) this).field_r[fieldTemp$8] = param3[var5_int];
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
            stackOut_7_1 = new StringBuilder().append("ka.NA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
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
          throw ma.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    final void a(int param0, byte param1, int param2, byte[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
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
        var6 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              if (param1 < -99) {
                break L1;
              } else {
                var7 = null;
                ((ka) this).a(true, (String) null);
                break L1;
              }
            }
            var5_int = param0;
            L2: while (true) {
              if (var5_int >= param2 + param0) {
                break L0;
              } else {
                int fieldTemp$7 = ((ka) this).field_k;
                ((ka) this).field_k = ((ka) this).field_k + 1;
                param3[var5_int] = ((ka) this).field_r[fieldTemp$7];
                var5_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("ka.KA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
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
          throw ma.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    final int f(int param0) {
        if (param0 != 4) {
            ((ka) this).field_k = 119;
            int fieldTemp$0 = ((ka) this).field_k;
            ((ka) this).field_k = ((ka) this).field_k + 1;
            return 255 & ((ka) this).field_r[fieldTemp$0];
        }
        int fieldTemp$1 = ((ka) this).field_k;
        ((ka) this).field_k = ((ka) this).field_k + 1;
        return 255 & ((ka) this).field_r[fieldTemp$1];
    }

    final long d(int param0) {
        if (param0 != 0) {
            return 47L;
        }
        long var2 = (long)((ka) this).b(false) & 4294967295L;
        long var4 = 4294967295L & (long)((ka) this).b(false);
        return var4 + (var2 << 32);
    }

    final void b(int param0, byte param1) {
        if (param1 <= 118) {
            return;
        }
        int fieldTemp$0 = ((ka) this).field_k;
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[fieldTemp$0] = (byte)(param0 >> 16);
        int fieldTemp$1 = ((ka) this).field_k;
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[fieldTemp$1] = (byte)(param0 >> 8);
        int fieldTemp$2 = ((ka) this).field_k;
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[fieldTemp$2] = (byte)param0;
    }

    final int d(byte param0) {
        int var2 = 255 & ((ka) this).field_r[((ka) this).field_k];
        int var3 = -99 / ((58 - param0) / 37);
        if (var2 < 128) {
            return ((ka) this).f(4);
        }
        return -32768 + ((ka) this).c((byte) 24);
    }

    final int b(boolean param0) {
        ((ka) this).field_k = ((ka) this).field_k + 4;
        if (param0) {
            field_o = 122L;
            return (((ka) this).field_r[((ka) this).field_k + -1] & 255) + ((((ka) this).field_r[((ka) this).field_k - 2] << 8 & 65280) + ((((ka) this).field_r[-3 + ((ka) this).field_k] & 255) << 16)) + (-16777216 & ((ka) this).field_r[-4 + ((ka) this).field_k] << 24);
        }
        return (((ka) this).field_r[((ka) this).field_k + -1] & 255) + ((((ka) this).field_r[((ka) this).field_k - 2] << 8 & 65280) + ((((ka) this).field_r[-3 + ((ka) this).field_k] & 255) << 16)) + (-16777216 & ((ka) this).field_r[-4 + ((ka) this).field_k] << 24);
    }

    final void a(int param0, byte param1) {
        ((ka) this).field_r[-param0 + ((ka) this).field_k - 1] = (byte)param0;
        int var3 = 41 % ((param1 - -11) / 53);
    }

    final void a(int param0, String param1) {
        int var3_int = 0;
        CharSequence var5 = null;
        try {
            var3_int = param1.indexOf(' ');
            if (var3_int >= 0) {
                throw new IllegalArgumentException("");
            }
            int fieldTemp$0 = ((ka) this).field_k;
            ((ka) this).field_k = ((ka) this).field_k + 1;
            ((ka) this).field_r[fieldTemp$0] = (byte) 0;
            var5 = (CharSequence) (Object) param1;
            ((ka) this).field_k = ((ka) this).field_k + qi.a(((ka) this).field_r, -53, ((ka) this).field_k, 0, var5, param1.length());
            int var4 = 89 % ((37 - param0) / 39);
            int fieldTemp$1 = ((ka) this).field_k;
            ((ka) this).field_k = ((ka) this).field_k + 1;
            ((ka) this).field_r[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "ka.R(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(byte param0, int[] param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
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
        var10 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              var3_int = ((ka) this).field_k / 8;
              ((ka) this).field_k = 0;
              if (param0 == 12) {
                break L1;
              } else {
                ((ka) this).field_r = null;
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var3_int <= var4) {
                break L0;
              } else {
                var5 = ((ka) this).b(false);
                var6 = ((ka) this).b(false);
                var7 = 0;
                var8 = -1640531527;
                var9 = 32;
                L3: while (true) {
                  int incrementValue$1 = var9;
                  var9--;
                  if (incrementValue$1 <= 0) {
                    ((ka) this).field_k = ((ka) this).field_k - 8;
                    ((ka) this).b(0, var5);
                    ((ka) this).b(0, var6);
                    var4++;
                    continue L2;
                  } else {
                    var5 = var5 + (var6 + (var6 << 4 ^ var6 >>> 5) ^ param1[3 & var7] + var7);
                    var7 = var7 + var8;
                    var6 = var6 + (var7 + param1[729808899 & var7 >>> 11] ^ var5 + (var5 >>> 5 ^ var5 << 4));
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
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("ka.RA(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
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
          throw ma.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
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
        var10 = stellarshard.field_B;
        try {
          L0: {
            var3_long = 0L;
            var5 = 0L;
            var7 = param1.length();
            var8 = 19;
            L1: while (true) {
              if (0 > var8) {
                this.b(8, var3_long);
                if (!param0) {
                  this.b(8, var5);
                  break L0;
                } else {
                  return;
                }
              } else {
                L2: {
                  var3_long = var3_long * 38L;
                  if (var8 < var7) {
                    L3: {
                      L4: {
                        var9 = param1.charAt(var8);
                        if (var9 < 65) {
                          break L4;
                        } else {
                          if (90 < var9) {
                            break L4;
                          } else {
                            var3_long = var3_long + (long)(2 - (-var9 + 65));
                            break L3;
                          }
                        }
                      }
                      L5: {
                        if (var9 < 97) {
                          break L5;
                        } else {
                          if (122 < var9) {
                            break L5;
                          } else {
                            var3_long = var3_long + (long)(var9 - 95);
                            break L3;
                          }
                        }
                      }
                      L6: {
                        if (var9 < 48) {
                          break L6;
                        } else {
                          if (57 >= var9) {
                            var3_long = var3_long + (long)(var9 + -20);
                            break L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var3_long = var3_long + 1L;
                      break L3;
                    }
                    if (var8 != 10) {
                      break L2;
                    } else {
                      var5 = var3_long;
                      var3_long = 0L;
                      break L2;
                    }
                  } else {
                    if (var8 != 10) {
                      break L2;
                    } else {
                      var5 = var3_long;
                      var3_long = 0L;
                      break L2;
                    }
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
            stackOut_24_0 = (RuntimeException) var3;
            stackOut_24_1 = new StringBuilder().append("ka.P(").append(param0).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
        }
    }

    final int e(int param0) {
        int var2 = 0;
        if (param0 != -64) {
            field_n = null;
            var2 = ((ka) this).field_r[((ka) this).field_k] & 255;
            if (var2 >= 128) {
                return -49152 + ((ka) this).c((byte) 43);
            }
            return ((ka) this).f(4) + -64;
        }
        var2 = ((ka) this).field_r[((ka) this).field_k] & 255;
        if (var2 >= 128) {
            return -49152 + ((ka) this).c((byte) 43);
        }
        return ((ka) this).f(4) + -64;
    }

    final int c(boolean param0) {
        ((ka) this).field_k = ((ka) this).field_k + 3;
        if (!param0) {
            int discarded$0 = ((ka) this).c(true);
            return (255 & ((ka) this).field_r[((ka) this).field_k - 1]) + ((((ka) this).field_r[-3 + ((ka) this).field_k] << 16 & 16711680) + ((255 & ((ka) this).field_r[-2 + ((ka) this).field_k]) << 8));
        }
        return (255 & ((ka) this).field_r[((ka) this).field_k - 1]) + ((((ka) this).field_r[-3 + ((ka) this).field_k] << 16 & 16711680) + ((255 & ((ka) this).field_r[-2 + ((ka) this).field_k]) << 8));
    }

    ka(int param0) {
        ((ka) this).field_k = 0;
        ((ka) this).field_r = ee.a(param0, true);
    }

    private final void b(int param0, long param1) {
        int fieldTemp$0 = ((ka) this).field_k;
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[fieldTemp$0] = (byte)(int)(param1 >> 48);
        int fieldTemp$1 = ((ka) this).field_k;
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[fieldTemp$1] = (byte)(int)(param1 >> 40);
        if (param0 != 8) {
            return;
        }
        int fieldTemp$2 = ((ka) this).field_k;
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[fieldTemp$2] = (byte)(int)(param1 >> 32);
        int fieldTemp$3 = ((ka) this).field_k;
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[fieldTemp$3] = (byte)(int)(param1 >> 24);
        int fieldTemp$4 = ((ka) this).field_k;
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[fieldTemp$4] = (byte)(int)(param1 >> 16);
        int fieldTemp$5 = ((ka) this).field_k;
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[fieldTemp$5] = (byte)(int)(param1 >> 8);
        int fieldTemp$6 = ((ka) this).field_k;
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[fieldTemp$6] = (byte)(int)param1;
    }

    ka(byte[] param0) {
        try {
            ((ka) this).field_k = 0;
            ((ka) this).field_r = param0;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "ka.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(byte param0, long param1) {
        int fieldTemp$0 = ((ka) this).field_k;
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[fieldTemp$0] = (byte)(int)(param1 >> 56);
        int fieldTemp$1 = ((ka) this).field_k;
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[fieldTemp$1] = (byte)(int)(param1 >> 48);
        int fieldTemp$2 = ((ka) this).field_k;
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[fieldTemp$2] = (byte)(int)(param1 >> 40);
        int fieldTemp$3 = ((ka) this).field_k;
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[fieldTemp$3] = (byte)(int)(param1 >> 32);
        int fieldTemp$4 = ((ka) this).field_k;
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[fieldTemp$4] = (byte)(int)(param1 >> 24);
        int fieldTemp$5 = ((ka) this).field_k;
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[fieldTemp$5] = (byte)(int)(param1 >> 16);
        if (param0 < 116) {
            return;
        }
        int fieldTemp$6 = ((ka) this).field_k;
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[fieldTemp$6] = (byte)(int)(param1 >> 8);
        int fieldTemp$7 = ((ka) this).field_k;
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[fieldTemp$7] = (byte)(int)param1;
    }

    final void d(int param0, int param1) {
        ((ka) this).field_r[-2 + -param1 + ((ka) this).field_k] = (byte)(param1 >> 8);
        ((ka) this).field_r[-param1 + (((ka) this).field_k + param0)] = (byte)param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Bounce gun";
    }
}
