/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ni extends lh {
    int field_i;
    static int field_j;
    byte[] field_k;

    final void a(int param0, int param1) {
        if (param0 != -11) {
            ((ni) this).c((byte) -92, 81);
        }
        int fieldTemp$0 = ((ni) this).field_i;
        ((ni) this).field_i = ((ni) this).field_i + 1;
        ((ni) this).field_k[fieldTemp$0] = (byte)param1;
    }

    final String h(int param0) {
        int var2 = ((ni) this).field_i;
        while (true) {
            int fieldTemp$0 = ((ni) this).field_i;
            ((ni) this).field_i = ((ni) this).field_i + 1;
            if (0 == ((ni) this).field_k[fieldTemp$0]) {
                break;
            }
        }
        int var3 = -1 + (((ni) this).field_i - var2);
        if (var3 == param0) {
            return "";
        }
        int discarded$1 = 0;
        return pg.a(var3, var2, ((ni) this).field_k);
    }

    final void b(byte[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
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
        var6 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var5_int = param1;
            if (param2 < -56) {
              L1: while (true) {
                if (var5_int >= param3 + param1) {
                  break L0;
                } else {
                  int fieldTemp$7 = ((ni) this).field_i;
                  ((ni) this).field_i = ((ni) this).field_i + 1;
                  param0[var5_int] = ((ni) this).field_k[fieldTemp$7];
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
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("ni.U(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean g(int param0) {
        if (param0 > -110) {
            ((ni) this).field_i = 56;
        }
        ((ni) this).field_i = ((ni) this).field_i - 4;
        int var2 = uj.a(false, 0, ((ni) this).field_i, ((ni) this).field_k);
        int var3 = ((ni) this).c((byte) 122);
        if (var3 != var2) {
            return false;
        }
        return true;
    }

    final static dj a(int param0, int param1, rh param2, rh param3, int param4) {
        RuntimeException var5 = null;
        dj stackIn_4_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        dj stackOut_3_0 = null;
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
        try {
          L0: {
            if (ha.a(param3, -32180, param4, param0)) {
              stackOut_3_0 = bk.a(-26395, param2.a(param4, (byte) 121, param0));
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("ni.MA(").append(param0).append(',').append(-2974).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param4 + ')');
        }
        return stackIn_4_0;
    }

    final void b(int param0, boolean param1) {
        ((ni) this).field_k[-4 + ((ni) this).field_i - param0] = (byte)(param0 >> 24);
        ((ni) this).field_k[-3 + -param0 + ((ni) this).field_i] = (byte)(param0 >> 16);
        ((ni) this).field_k[-param0 + (((ni) this).field_i + -2)] = (byte)(param0 >> 8);
        ((ni) this).field_k[-1 + (((ni) this).field_i + -param0)] = (byte)param0;
        if (param1) {
            ((ni) this).field_k = null;
        }
    }

    final void b(byte param0, int param1) {
        int fieldTemp$0 = ((ni) this).field_i;
        ((ni) this).field_i = ((ni) this).field_i + 1;
        ((ni) this).field_k[fieldTemp$0] = (byte)(param1 >> 8);
        int var3 = -47 / ((18 - param0) / 57);
        int fieldTemp$1 = ((ni) this).field_i;
        ((ni) this).field_i = ((ni) this).field_i + 1;
        ((ni) this).field_k[fieldTemp$1] = (byte)param1;
    }

    final static String a(int param0, char param1, byte param2) {
        int var4 = 0;
        int var5 = fleas.field_A ? 1 : 0;
        char[] var6 = new char[param0];
        char[] var3 = var6;
        for (var4 = 0; param0 > var4; var4++) {
            var6[var4] = '*';
        }
        return new String(var6);
    }

    final long f(int param0) {
        long var2 = (long)((ni) this).c((byte) 123) & 4294967295L;
        long var4 = (long)((ni) this).c((byte) -113) & 4294967295L;
        if (param0 >= -58) {
            int discarded$0 = ((ni) this).e(false);
        }
        return (var2 << 32) + var4;
    }

    final static String d() {
        String var1 = "";
        if (null != lg.field_b) {
            var1 = lg.field_b.j(-1);
        }
        if (var1.length() == 0) {
            int discarded$0 = 10158;
            var1 = em.c();
        }
        if (var1.length() == 0) {
            var1 = gg.field_a;
        }
        return var1;
    }

    final int d(byte param0) {
        ((ni) this).field_i = ((ni) this).field_i + 2;
        int var2 = 85 / ((5 - param0) / 53);
        return (((ni) this).field_k[((ni) this).field_i - 1] & 255) + (((ni) this).field_k[((ni) this).field_i - 2] << 8 & 65280);
    }

    final void a(java.math.BigInteger param0, java.math.BigInteger param1, int param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
            var4_int = ((ni) this).field_i;
            ((ni) this).field_i = 0;
            var5 = new byte[var4_int];
            ((ni) this).b(var5, 0, -57, var4_int);
            var6 = new java.math.BigInteger(var5);
            var7 = var6.modPow(param0, param1);
            var8 = var7.toByteArray();
            int var9 = -100 / ((param2 - 32) / 33);
            ((ni) this).field_i = 0;
            ((ni) this).b((byte) 103, var8.length);
            ((ni) this).a(var8, var8.length, 0, 0);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "ni.LA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final String e(int param0) {
        int fieldTemp$0 = ((ni) this).field_i;
        ((ni) this).field_i = ((ni) this).field_i + 1;
        int var2 = ((ni) this).field_k[fieldTemp$0];
        if (!(var2 == 0)) {
            throw new IllegalStateException("");
        }
        if (param0 > -51) {
            field_j = 127;
        }
        int var3 = ((ni) this).field_i;
        while (true) {
            int fieldTemp$1 = ((ni) this).field_i;
            ((ni) this).field_i = ((ni) this).field_i + 1;
            if (((ni) this).field_k[fieldTemp$1] == 0) {
                break;
            }
        }
        int var4 = -1 + ((ni) this).field_i + -var3;
        if (var4 == 0) {
            return "";
        }
        int discarded$2 = 0;
        return pg.a(var4, var3, ((ni) this).field_k);
    }

    final int e(byte param0) {
        if (param0 <= 53) {
            return 78;
        }
        if (((ni) this).field_k[((ni) this).field_i] < 0) {
            return 2147483647 & ((ni) this).c((byte) -62);
        }
        return ((ni) this).d((byte) -53);
    }

    final void c(byte param0, int param1) {
        if (param0 > -27) {
            int discarded$0 = ((ni) this).d(-55);
        }
        ((ni) this).field_k[-1 + (-param1 + ((ni) this).field_i)] = (byte)param1;
    }

    private final void a(boolean param0, long param1) {
        int fieldTemp$0 = ((ni) this).field_i;
        ((ni) this).field_i = ((ni) this).field_i + 1;
        ((ni) this).field_k[fieldTemp$0] = (byte)(int)(param1 >> 48);
        int fieldTemp$1 = ((ni) this).field_i;
        ((ni) this).field_i = ((ni) this).field_i + 1;
        ((ni) this).field_k[fieldTemp$1] = (byte)(int)(param1 >> 40);
        int fieldTemp$2 = ((ni) this).field_i;
        ((ni) this).field_i = ((ni) this).field_i + 1;
        ((ni) this).field_k[fieldTemp$2] = (byte)(int)(param1 >> 32);
        int fieldTemp$3 = ((ni) this).field_i;
        ((ni) this).field_i = ((ni) this).field_i + 1;
        ((ni) this).field_k[fieldTemp$3] = (byte)(int)(param1 >> 24);
        int fieldTemp$4 = ((ni) this).field_i;
        ((ni) this).field_i = ((ni) this).field_i + 1;
        ((ni) this).field_k[fieldTemp$4] = (byte)(int)(param1 >> 16);
        int fieldTemp$5 = ((ni) this).field_i;
        ((ni) this).field_i = ((ni) this).field_i + 1;
        ((ni) this).field_k[fieldTemp$5] = (byte)(int)(param1 >> 8);
        int fieldTemp$6 = ((ni) this).field_i;
        ((ni) this).field_i = ((ni) this).field_i + 1;
        ((ni) this).field_k[fieldTemp$6] = (byte)(int)param1;
    }

    final void a(int param0, boolean param1) {
        if (0 != (-128 & param0)) {
            if (-1 != (param0 & -16384)) {
                if (-1 != (param0 & -2097152)) {
                    if (0 != (-268435456 & param0)) {
                        ((ni) this).a(-11, 128 | param0 >>> 28);
                    }
                    ((ni) this).a(-11, param0 >>> 21 | 128);
                }
                ((ni) this).a(-11, 128 | param0 >>> 14);
            }
            ((ni) this).a(-11, param0 >>> 7 | 128);
        }
        if (!param1) {
            return;
        }
        ((ni) this).a(-11, param0 & 127);
    }

    final void a(int param0, String param1) {
        int var3_int = 0;
        CharSequence var5 = null;
        try {
            var3_int = param1.indexOf(' ');
            if (!(var3_int < 0)) {
                throw new IllegalArgumentException("");
            }
            var5 = (CharSequence) (Object) param1;
            ((ni) this).field_i = ((ni) this).field_i + af.a(0, ((ni) this).field_k, param1.length(), var5, -109, ((ni) this).field_i);
            int fieldTemp$0 = ((ni) this).field_i;
            ((ni) this).field_i = ((ni) this).field_i + 1;
            ((ni) this).field_k[fieldTemp$0] = (byte) 0;
            int var4 = -75 / ((57 - param0) / 54);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "ni.DA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, int param1) {
        if (param0 < 117) {
        }
        ((ni) this).field_k[-2 + ((ni) this).field_i + -param1] = (byte)(param1 >> 8);
        ((ni) this).field_k[-param1 + (((ni) this).field_i - 1)] = (byte)param1;
    }

    final void a(int param0, byte param1) {
        if (param1 > -14) {
            ((ni) this).a(99, -17);
        }
        int fieldTemp$0 = ((ni) this).field_i;
        ((ni) this).field_i = ((ni) this).field_i + 1;
        ((ni) this).field_k[fieldTemp$0] = (byte)(param0 >> 24);
        int fieldTemp$1 = ((ni) this).field_i;
        ((ni) this).field_i = ((ni) this).field_i + 1;
        ((ni) this).field_k[fieldTemp$1] = (byte)(param0 >> 16);
        int fieldTemp$2 = ((ni) this).field_i;
        ((ni) this).field_i = ((ni) this).field_i + 1;
        ((ni) this).field_k[fieldTemp$2] = (byte)(param0 >> 8);
        int fieldTemp$3 = ((ni) this).field_i;
        ((ni) this).field_i = ((ni) this).field_i + 1;
        ((ni) this).field_k[fieldTemp$3] = (byte)param0;
    }

    final int c(boolean param0) {
        ((ni) this).field_i = ((ni) this).field_i + 3;
        if (!param0) {
            return -121;
        }
        return (16711680 & ((ni) this).field_k[((ni) this).field_i + -3] << 16) - (-(65280 & ((ni) this).field_k[((ni) this).field_i + -2] << 8) + -(255 & ((ni) this).field_k[-1 + ((ni) this).field_i]));
    }

    final int e(boolean param0) {
        if (param0) {
            return 3;
        }
        int fieldTemp$0 = ((ni) this).field_i;
        ((ni) this).field_i = ((ni) this).field_i + 1;
        return ((ni) this).field_k[fieldTemp$0] & 255;
    }

    final void b(String param0, byte param1) {
        RuntimeException var3 = null;
        long var3_long = 0L;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var10 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 94) {
                break L1;
              } else {
                ((ni) this).field_i = 64;
                break L1;
              }
            }
            var3_long = 0L;
            var5 = 0L;
            var7 = param0.length();
            var8 = 19;
            L2: while (true) {
              if (var8 < 0) {
                this.a(true, var3_long);
                this.a(true, var5);
                break L0;
              } else {
                var3_long = var3_long * 38L;
                if (var7 > var8) {
                  L3: {
                    L4: {
                      var9 = param0.charAt(var8);
                      if (var9 < 65) {
                        break L4;
                      } else {
                        if (var9 > 90) {
                          break L4;
                        } else {
                          var3_long = var3_long + (long)(2 - -var9 - 65);
                          break L3;
                        }
                      }
                    }
                    L5: {
                      if (var9 < 97) {
                        break L5;
                      } else {
                        if (var9 <= 122) {
                          var3_long = var3_long + (long)(-97 + (var9 + 2));
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var9 < 48) {
                        break L6;
                      } else {
                        if (var9 <= 57) {
                          var3_long = var3_long + (long)(28 + (var9 - 48));
                          break L3;
                        } else {
                          break L6;
                        }
                      }
                    }
                    var3_long = var3_long + 1L;
                    break L3;
                  }
                  L7: {
                    if (var8 != 10) {
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  var8--;
                  continue L2;
                } else {
                  L8: {
                    if (var8 != 10) {
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  var8--;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var3;
            stackOut_26_1 = new StringBuilder().append("ni.M(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L9;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L9;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param1 + ')');
        }
    }

    final int a(int param0) {
        int var2 = param0 & ((ni) this).field_k[((ni) this).field_i];
        if (var2 >= 128) {
            return -49152 + ((ni) this).d((byte) 82);
        }
        return ((ni) this).e(false) - 64;
    }

    final void a(long param0, byte param1) {
        int fieldTemp$0 = ((ni) this).field_i;
        ((ni) this).field_i = ((ni) this).field_i + 1;
        ((ni) this).field_k[fieldTemp$0] = (byte)(int)(param0 >> 32);
        if (param1 != -39) {
            int discarded$1 = ((ni) this).d((byte) 35);
        }
        int fieldTemp$2 = ((ni) this).field_i;
        ((ni) this).field_i = ((ni) this).field_i + 1;
        ((ni) this).field_k[fieldTemp$2] = (byte)(int)(param0 >> 24);
        int fieldTemp$3 = ((ni) this).field_i;
        ((ni) this).field_i = ((ni) this).field_i + 1;
        ((ni) this).field_k[fieldTemp$3] = (byte)(int)(param0 >> 16);
        int fieldTemp$4 = ((ni) this).field_i;
        ((ni) this).field_i = ((ni) this).field_i + 1;
        ((ni) this).field_k[fieldTemp$4] = (byte)(int)(param0 >> 8);
        int fieldTemp$5 = ((ni) this).field_i;
        ((ni) this).field_i = ((ni) this).field_i + 1;
        ((ni) this).field_k[fieldTemp$5] = (byte)(int)param0;
    }

    final void a(byte[] param0, int param1, int param2, int param3) {
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
        var6 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (param3 == 0) {
              var5_int = param2;
              L1: while (true) {
                if (param2 + param1 <= var5_int) {
                  break L0;
                } else {
                  int fieldTemp$7 = ((ni) this).field_i;
                  ((ni) this).field_i = ((ni) this).field_i + 1;
                  ((ni) this).field_k[fieldTemp$7] = param0[var5_int];
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
            stackOut_7_1 = new StringBuilder().append("ni.FA(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
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
          throw pf.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(String param0, byte param1) {
        int var3_int = 0;
        CharSequence var5 = null;
        try {
            var3_int = param0.indexOf(' ');
            if (!(var3_int < 0)) {
                throw new IllegalArgumentException("");
            }
            int fieldTemp$0 = ((ni) this).field_i;
            ((ni) this).field_i = ((ni) this).field_i + 1;
            ((ni) this).field_k[fieldTemp$0] = (byte) 0;
            int var4 = -40 % ((-3 - param1) / 39);
            var5 = (CharSequence) (Object) param0;
            ((ni) this).field_i = ((ni) this).field_i + af.a(0, ((ni) this).field_k, param0.length(), var5, -111, ((ni) this).field_i);
            int fieldTemp$1 = ((ni) this).field_i;
            ((ni) this).field_i = ((ni) this).field_i + 1;
            ((ni) this).field_k[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "ni.S(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int b(boolean param0) {
        int var4 = fleas.field_A ? 1 : 0;
        int fieldTemp$0 = ((ni) this).field_i;
        ((ni) this).field_i = ((ni) this).field_i + 1;
        int var2 = ((ni) this).field_k[fieldTemp$0];
        if (!param0) {
            ((ni) this).b(108, true);
        }
        int var3 = 0;
        while (var2 < 0) {
            var3 = (127 & var2 | var3) << 7;
            int fieldTemp$1 = ((ni) this).field_i;
            ((ni) this).field_i = ((ni) this).field_i + 1;
            var2 = ((ni) this).field_k[fieldTemp$1];
        }
        return var2 | var3;
    }

    final int d(int param0) {
        if (param0 != -13583) {
            field_j = 28;
        }
        int var2 = 255 & ((ni) this).field_k[((ni) this).field_i];
        if (var2 >= 128) {
            return ((ni) this).d((byte) -53) - 32768;
        }
        return ((ni) this).e(false);
    }

    final void a(int param0, int[] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var10 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var3_int = ((ni) this).field_i / 8;
            ((ni) this).field_i = param0;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var3_int) {
                break L0;
              } else {
                var5 = ((ni) this).c((byte) 123);
                var6 = ((ni) this).c((byte) 124);
                var7 = 0;
                var8 = -1640531527;
                var9 = 32;
                L2: while (true) {
                  int incrementValue$5 = var9;
                  var9--;
                  if (0 >= incrementValue$5) {
                    ((ni) this).field_i = ((ni) this).field_i - 8;
                    ((ni) this).a(var5, (byte) -54);
                    ((ni) this).a(var6, (byte) -22);
                    var4++;
                    continue L1;
                  } else {
                    var5 = var5 + ((var6 >>> 5 ^ var6 << 4) - -var6 ^ param1[var7 & 3] + var7);
                    var7 = var7 + var8;
                    var6 = var6 + (var7 - -param1[var7 >>> 11 & 759169027] ^ (var5 << 4 ^ var5 >>> 5) + var5);
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("ni.SA(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    final void d(int param0, int param1) {
        int var4 = fleas.field_A ? 1 : 0;
        while (param0 > ((ni) this).field_i) {
            int fieldTemp$0 = ((ni) this).field_i;
            ((ni) this).field_i = ((ni) this).field_i + 1;
            ((ni) this).field_k[fieldTemp$0] = (byte) 0;
        }
        if (param1 != 0) {
            ((ni) this).field_k = null;
        }
    }

    final void a(boolean param0, int param1) {
        int fieldTemp$0 = ((ni) this).field_i;
        ((ni) this).field_i = ((ni) this).field_i + 1;
        ((ni) this).field_k[fieldTemp$0] = (byte)(param1 >> 16);
        int fieldTemp$1 = ((ni) this).field_i;
        ((ni) this).field_i = ((ni) this).field_i + 1;
        ((ni) this).field_k[fieldTemp$1] = (byte)(param1 >> 8);
        if (param0) {
            ((ni) this).field_k = null;
        }
        int fieldTemp$2 = ((ni) this).field_i;
        ((ni) this).field_i = ((ni) this).field_i + 1;
        ((ni) this).field_k[fieldTemp$2] = (byte)param1;
    }

    final String a(byte param0) {
        if (param0 != -115) {
            ((ni) this).field_i = 77;
        }
        if (((ni) this).field_k[((ni) this).field_i] == 0) {
            ((ni) this).field_i = ((ni) this).field_i + 1;
            return null;
        }
        return ((ni) this).h(param0 ^ -115);
    }

    final void b(int param0, int param1) {
        if (64 > param1) {
            if (-64 <= param1) {
                ((ni) this).a(param0 + 24202, 64 + param1);
                return;
            }
        }
        if (param0 != -24213) {
            this.a(true, -123L);
        }
        if (param1 < 16384) {
            if (!(-16384 > param1)) {
                ((ni) this).b((byte) 107, 49152 + param1);
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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var13 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var5_int = ((ni) this).field_i;
            ((ni) this).field_i = param1;
            var6 = (-param1 + param3) / 8;
            var7 = 0;
            L1: while (true) {
              if (var7 >= var6) {
                L2: {
                  if (param2 == -1) {
                    break L2;
                  } else {
                    String discarded$2 = ((ni) this).h(-4);
                    break L2;
                  }
                }
                ((ni) this).field_i = var5_int;
                break L0;
              } else {
                var8 = ((ni) this).c((byte) -35);
                var9 = ((ni) this).c((byte) 22);
                var10 = -957401312;
                var11 = -1640531527;
                var12 = 32;
                L3: while (true) {
                  int incrementValue$3 = var12;
                  var12--;
                  if (incrementValue$3 <= 0) {
                    ((ni) this).field_i = ((ni) this).field_i - 8;
                    ((ni) this).a(var8, (byte) -118);
                    ((ni) this).a(var9, (byte) -108);
                    var7++;
                    continue L1;
                  } else {
                    var9 = var9 - (var10 - -param0[var10 >>> 11 & -1547698173] ^ (var8 << 4 ^ var8 >>> 5) + var8);
                    var10 = var10 - var11;
                    var8 = var8 - (param0[3 & var10] + var10 ^ var9 + (var9 << 4 ^ var9 >>> 5));
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
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("ni.RA(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final byte i(int param0) {
        if (param0 > -17) {
            return (byte) 18;
        }
        int fieldTemp$0 = ((ni) this).field_i;
        ((ni) this).field_i = ((ni) this).field_i + 1;
        return ((ni) this).field_k[fieldTemp$0];
    }

    final int c(int param0, int param1) {
        int var3 = uj.a(false, param0, ((ni) this).field_i, ((ni) this).field_k);
        if (param1 != -30532) {
            ((ni) this).field_i = -52;
        }
        ((ni) this).a(var3, (byte) -73);
        return var3;
    }

    final int c(byte param0) {
        ((ni) this).field_i = ((ni) this).field_i + 4;
        int var2 = 41 / ((86 - param0) / 36);
        return ((((ni) this).field_k[((ni) this).field_i + -2] & 255) << 8) + (((((ni) this).field_k[((ni) this).field_i + -3] & 255) << 16) + (-16777216 & ((ni) this).field_k[-4 + ((ni) this).field_i] << 24) + (((ni) this).field_k[-1 + ((ni) this).field_i] & 255));
    }

    final void a(int param0, long param1) {
        int fieldTemp$0 = ((ni) this).field_i;
        ((ni) this).field_i = ((ni) this).field_i + 1;
        ((ni) this).field_k[fieldTemp$0] = (byte)(int)(param1 >> 56);
        int fieldTemp$1 = ((ni) this).field_i;
        ((ni) this).field_i = ((ni) this).field_i + 1;
        ((ni) this).field_k[fieldTemp$1] = (byte)(int)(param1 >> 48);
        int fieldTemp$2 = ((ni) this).field_i;
        ((ni) this).field_i = ((ni) this).field_i + 1;
        ((ni) this).field_k[fieldTemp$2] = (byte)(int)(param1 >> 40);
        int fieldTemp$3 = ((ni) this).field_i;
        ((ni) this).field_i = ((ni) this).field_i + 1;
        ((ni) this).field_k[fieldTemp$3] = (byte)(int)(param1 >> 32);
        int var4 = 94 / ((param0 - 37) / 35);
        int fieldTemp$4 = ((ni) this).field_i;
        ((ni) this).field_i = ((ni) this).field_i + 1;
        ((ni) this).field_k[fieldTemp$4] = (byte)(int)(param1 >> 24);
        int fieldTemp$5 = ((ni) this).field_i;
        ((ni) this).field_i = ((ni) this).field_i + 1;
        ((ni) this).field_k[fieldTemp$5] = (byte)(int)(param1 >> 16);
        int fieldTemp$6 = ((ni) this).field_i;
        ((ni) this).field_i = ((ni) this).field_i + 1;
        ((ni) this).field_k[fieldTemp$6] = (byte)(int)(param1 >> 8);
        int fieldTemp$7 = ((ni) this).field_i;
        ((ni) this).field_i = ((ni) this).field_i + 1;
        ((ni) this).field_k[fieldTemp$7] = (byte)(int)param1;
    }

    ni(int param0) {
        ((ni) this).field_k = gf.a(-101, param0);
        ((ni) this).field_i = 0;
    }

    ni(byte[] param0) {
        try {
            ((ni) this).field_i = 0;
            ((ni) this).field_k = param0;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "ni.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 0;
    }
}
