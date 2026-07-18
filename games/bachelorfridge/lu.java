/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lu extends bw {
    static ee field_f;
    int field_g;
    byte[] field_h;

    final void e(int param0, int param1) {
        int fieldTemp$0 = ((lu) this).field_g;
        ((lu) this).field_g = ((lu) this).field_g + 1;
        ((lu) this).field_h[fieldTemp$0] = (byte)(param0 >> 24);
        int fieldTemp$1 = ((lu) this).field_g;
        ((lu) this).field_g = ((lu) this).field_g + 1;
        ((lu) this).field_h[fieldTemp$1] = (byte)(param0 >> 16);
        int fieldTemp$2 = ((lu) this).field_g;
        ((lu) this).field_g = ((lu) this).field_g + 1;
        ((lu) this).field_h[fieldTemp$2] = (byte)(param0 >> 8);
        int fieldTemp$3 = ((lu) this).field_g;
        ((lu) this).field_g = ((lu) this).field_g + 1;
        ((lu) this).field_h[fieldTemp$3] = (byte)param0;
        if (param1 != -1615464796) {
            int discarded$4 = ((lu) this).b(-122);
        }
    }

    final void c(byte param0, int param1) {
        if (param0 < 58) {
            Object var4 = null;
            ((lu) this).a((String) null, -16);
        }
        if (param1 < 64) {
            if (param1 >= -64) {
                ((lu) this).d(64 + param1, 0);
                return;
            }
        }
        if (param1 < 16384) {
            if (param1 >= -16384) {
                ((lu) this).b(49152 + param1, -122);
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    final void d(int param0, int param1) {
        int fieldTemp$0 = ((lu) this).field_g;
        ((lu) this).field_g = ((lu) this).field_g + 1;
        ((lu) this).field_h[fieldTemp$0] = (byte)param0;
        if (param1 != 0) {
            ((lu) this).b(32, -12L);
        }
    }

    final void a(int param0, String param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        long var4 = 0L;
        long var6 = 0L;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var11 = BachelorFridge.field_y;
        try {
          L0: {
            var3_int = 89 / ((-41 - param0) / 51);
            var4 = 0L;
            var6 = 0L;
            var8 = param1.length();
            var9 = 19;
            L1: while (true) {
              if (0 > var9) {
                int discarded$2 = 10847;
                this.a(var4);
                int discarded$3 = 10847;
                this.a(var6);
                break L0;
              } else {
                L2: {
                  var4 = var4 * 38L;
                  if (var9 < var8) {
                    L3: {
                      var10 = param1.charAt(var9);
                      if (65 > var10) {
                        break L3;
                      } else {
                        if (var10 <= 90) {
                          var4 = var4 + (long)(var10 + -63);
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L4: {
                      if (var10 < 97) {
                        break L4;
                      } else {
                        if (var10 <= 122) {
                          var4 = var4 + (long)(var10 - 95);
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (var10 < 48) {
                        break L5;
                      } else {
                        if (var10 > 57) {
                          break L5;
                        } else {
                          var4 = var4 + (long)(-48 + (var10 + 28));
                          break L2;
                        }
                      }
                    }
                    var4 = var4 + 1L;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L6: {
                  if (var9 == 10) {
                    var6 = var4;
                    var4 = 0L;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                var9--;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var3;
            stackOut_23_1 = new StringBuilder().append("lu.JA(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
    }

    final int b(int param0) {
        if (param0 != 16711935) {
            Object var3 = null;
            ((lu) this).a((String) null, 67);
        }
        int fieldTemp$0 = ((lu) this).field_g;
        ((lu) this).field_g = ((lu) this).field_g + 1;
        return ((lu) this).field_h[fieldTemp$0] & 255;
    }

    final void c(int param0, int param1) {
        if (param0 != -1607631824) {
            return;
        }
        int fieldTemp$0 = ((lu) this).field_g;
        ((lu) this).field_g = ((lu) this).field_g + 1;
        ((lu) this).field_h[fieldTemp$0] = (byte)(param1 >> 16);
        int fieldTemp$1 = ((lu) this).field_g;
        ((lu) this).field_g = ((lu) this).field_g + 1;
        ((lu) this).field_h[fieldTemp$1] = (byte)(param1 >> 8);
        int fieldTemp$2 = ((lu) this).field_g;
        ((lu) this).field_g = ((lu) this).field_g + 1;
        ((lu) this).field_h[fieldTemp$2] = (byte)param1;
    }

    final void a(java.math.BigInteger param0, int param1, java.math.BigInteger param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
            var4_int = ((lu) this).field_g;
            ((lu) this).field_g = 0;
            var5 = new byte[var4_int];
            ((lu) this).a(var5, var4_int, param1 ^ 128, 0);
            var6 = new java.math.BigInteger(var5);
            var7 = var6.modPow(param2, param0);
            var8 = var7.toByteArray();
            ((lu) this).field_g = 0;
            ((lu) this).b(var8.length, -118);
            ((lu) this).a(param1, param1 + -122, var8.length, var8);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "lu.HB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final String g(int param0) {
        int var2 = 102 % ((param0 - 3) / 35);
        int var3 = ((lu) this).field_g;
        while (true) {
            int fieldTemp$0 = ((lu) this).field_g;
            ((lu) this).field_g = ((lu) this).field_g + 1;
            if (((lu) this).field_h[fieldTemp$0] == 0) {
                break;
            }
        }
        int var4 = -var3 + (((lu) this).field_g - 1);
        if (!(0 != var4)) {
            return "";
        }
        return gt.a(var3, ((lu) this).field_h, (byte) 104, var4);
    }

    final void a(byte param0, String param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        try {
            if (param0 != -50) {
                ((lu) this).field_h = null;
            }
            var3_int = param1.indexOf(' ');
            if (0 <= var3_int) {
                throw new IllegalArgumentException("");
            }
            var4 = (CharSequence) (Object) param1;
            int discarded$0 = 0;
            ((lu) this).field_g = ((lu) this).field_g + jm.a(param1.length(), -56, ((lu) this).field_g, var4, ((lu) this).field_h);
            int fieldTemp$1 = ((lu) this).field_g;
            ((lu) this).field_g = ((lu) this).field_g + 1;
            ((lu) this).field_h[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "lu.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int f(byte param0) {
        int var2 = -58 / ((-76 - param0) / 45);
        if (0 > ((lu) this).field_h[((lu) this).field_g]) {
            return 2147483647 & ((lu) this).f(-60);
        }
        return ((lu) this).e((byte) 57);
    }

    final int e(int param0) {
        if (param0 != -4095) {
            int discarded$0 = ((lu) this).a(106, -5);
        }
        int var2 = ((lu) this).field_h[((lu) this).field_g] & 255;
        if (var2 < 128) {
            return ((lu) this).b(16711935) + -64;
        }
        return ((lu) this).e((byte) 92) + -49152;
    }

    final int a(int param0, int param1) {
        int var3 = mk.a(((lu) this).field_h, param0, -123, ((lu) this).field_g);
        if (param1 != 19) {
            byte discarded$0 = ((lu) this).b(false);
        }
        ((lu) this).e(var3, -1615464796);
        return var3;
    }

    final void a(int param0, byte param1) {
        if ((-128 & param0) != 0) {
            if (!(0 == (param0 & -16384))) {
                if ((param0 & -2097152) != 0) {
                    if (!((-268435456 & param0) == 0)) {
                        ((lu) this).d(128 | param0 >>> 28, 0);
                    }
                    ((lu) this).d(param0 >>> 21 | 128, 0);
                }
                ((lu) this).d(128 | param0 >>> 14, 0);
            }
            ((lu) this).d((param0 | 16411) >>> 7, 0);
        }
        if (param1 > -123) {
            field_f = null;
        }
        ((lu) this).d(127 & param0, 0);
    }

    final void a(int param0, int param1, int[] param2, int param3) {
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
        var13 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var5_int = ((lu) this).field_g;
              if (param0 == 17654) {
                break L1;
              } else {
                int discarded$2 = ((lu) this).a(-29, -92);
                break L1;
              }
            }
            ((lu) this).field_g = param1;
            var6 = (-param1 + param3) / 8;
            var7 = 0;
            L2: while (true) {
              if (var7 >= var6) {
                ((lu) this).field_g = var5_int;
                break L0;
              } else {
                var8 = ((lu) this).f(127);
                var9 = ((lu) this).f(83);
                var10 = -957401312;
                var11 = -1640531527;
                var12 = 32;
                L3: while (true) {
                  int incrementValue$3 = var12;
                  var12--;
                  if (incrementValue$3 <= 0) {
                    ((lu) this).field_g = ((lu) this).field_g - 8;
                    ((lu) this).e(var8, -1615464796);
                    ((lu) this).e(var9, -1615464796);
                    var7++;
                    continue L2;
                  } else {
                    var9 = var9 - (param2[(var10 & 6721) >>> 11] + var10 ^ (var8 >>> 5 ^ var8 << 4) + var8);
                    var10 = var10 - var11;
                    var8 = var8 - (var9 + (var9 << 4 ^ var9 >>> 5) ^ param2[var10 & 3] + var10);
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
            stackOut_11_1 = new StringBuilder().append("lu.I(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param3 + ')');
        }
    }

    final int f(int param0) {
        int var2 = -7 % ((-1 - param0) / 48);
        ((lu) this).field_g = ((lu) this).field_g + 4;
        return (255 & ((lu) this).field_h[((lu) this).field_g - 1]) + ((((lu) this).field_h[((lu) this).field_g + -2] & 255) << 8) + (-16777216 & ((lu) this).field_h[((lu) this).field_g - 4] << 24) - -(16711680 & ((lu) this).field_h[-3 + ((lu) this).field_g] << 16);
    }

    final int e(byte param0) {
        if (param0 < 44) {
            lu.d((byte) 2);
        }
        ((lu) this).field_g = ((lu) this).field_g + 2;
        return ((((lu) this).field_h[-2 + ((lu) this).field_g] & 255) << 8) - -(255 & ((lu) this).field_h[((lu) this).field_g - 1]);
    }

    final void b(int param0, long param1) {
        int fieldTemp$0 = ((lu) this).field_g;
        ((lu) this).field_g = ((lu) this).field_g + 1;
        ((lu) this).field_h[fieldTemp$0] = (byte)(int)(param1 >> 56);
        int fieldTemp$1 = ((lu) this).field_g;
        ((lu) this).field_g = ((lu) this).field_g + 1;
        ((lu) this).field_h[fieldTemp$1] = (byte)(int)(param1 >> 48);
        int fieldTemp$2 = ((lu) this).field_g;
        ((lu) this).field_g = ((lu) this).field_g + 1;
        ((lu) this).field_h[fieldTemp$2] = (byte)(int)(param1 >> 40);
        int fieldTemp$3 = ((lu) this).field_g;
        ((lu) this).field_g = ((lu) this).field_g + 1;
        ((lu) this).field_h[fieldTemp$3] = (byte)(int)(param1 >> 32);
        int fieldTemp$4 = ((lu) this).field_g;
        ((lu) this).field_g = ((lu) this).field_g + 1;
        ((lu) this).field_h[fieldTemp$4] = (byte)(int)(param1 >> 24);
        int fieldTemp$5 = ((lu) this).field_g;
        ((lu) this).field_g = ((lu) this).field_g + 1;
        ((lu) this).field_h[fieldTemp$5] = (byte)(int)(param1 >> 16);
        int fieldTemp$6 = ((lu) this).field_g;
        ((lu) this).field_g = ((lu) this).field_g + 1;
        ((lu) this).field_h[fieldTemp$6] = (byte)(int)(param1 >> 8);
        if (param0 != 1686281208) {
            return;
        }
        int fieldTemp$7 = ((lu) this).field_g;
        ((lu) this).field_g = ((lu) this).field_g + 1;
        ((lu) this).field_h[fieldTemp$7] = (byte)(int)param1;
    }

    final static String a(CharSequence param0) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
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
            L1: {
              int discarded$2 = 1;
              var2 = uga.a(mp.a(param0), 120);
              if (var2 == null) {
                var2 = "";
                break L1;
              } else {
                break L1;
              }
            }
            stackOut_3_0 = (String) var2;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("lu.RA(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + 7995 + ')');
        }
        return stackIn_4_0;
    }

    final void b(int param0, boolean param1) {
        if (!param1) {
            field_f = null;
        }
        if (param0 >= 0) {
            if (!(param0 >= 128)) {
                ((lu) this).d(param0, 0);
                return;
            }
        }
        if (param0 >= 0) {
            if (!(param0 >= 32768)) {
                ((lu) this).b(param0 + 32768, -126);
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    final String h(byte param0) {
        int fieldTemp$0 = ((lu) this).field_g;
        ((lu) this).field_g = ((lu) this).field_g + 1;
        int var2 = ((lu) this).field_h[fieldTemp$0];
        int var3 = 7 % ((58 - param0) / 61);
        if (!(var2 == 0)) {
            throw new IllegalStateException("");
        }
        int var4 = ((lu) this).d(-1);
        if (!(((lu) this).field_h.length >= ((lu) this).field_g + var4)) {
            throw new IllegalStateException("");
        }
        int discarded$1 = 258048;
        String var5 = ida.a(var4, ((lu) this).field_h, ((lu) this).field_g);
        ((lu) this).field_g = ((lu) this).field_g + var4;
        return var5;
    }

    final int c(byte param0) {
        ((lu) this).field_g = ((lu) this).field_g + 2;
        if (param0 != -85) {
            return -126;
        }
        int var2 = ((255 & ((lu) this).field_h[((lu) this).field_g - 2]) << 8) + (((lu) this).field_h[((lu) this).field_g + -1] & 255);
        if (!(var2 <= 32767)) {
            var2 = var2 - 65536;
        }
        return var2;
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
        var10 = BachelorFridge.field_y;
        try {
          L0: {
            var3_int = ((lu) this).field_g / 8;
            ((lu) this).field_g = 0;
            var4 = param1;
            L1: while (true) {
              if (var3_int <= var4) {
                break L0;
              } else {
                var5 = ((lu) this).f(param1 ^ 92);
                var6 = ((lu) this).f(param1 + 78);
                var7 = 0;
                var8 = -1640531527;
                var9 = 32;
                L2: while (true) {
                  int incrementValue$5 = var9;
                  var9--;
                  if (0 >= incrementValue$5) {
                    ((lu) this).field_g = ((lu) this).field_g - 8;
                    ((lu) this).e(var5, -1615464796);
                    ((lu) this).e(var6, -1615464796);
                    var4++;
                    continue L1;
                  } else {
                    var5 = var5 + ((var6 >>> 5 ^ var6 << 4) - -var6 ^ param0[3 & var7] + var7);
                    var7 = var7 + var8;
                    var6 = var6 + (var7 - -param0[(7636 & var7) >>> 11] ^ var5 + (var5 >>> 5 ^ var5 << 4));
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
            stackOut_8_1 = new StringBuilder().append("lu.GB(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
        }
    }

    final String g(byte param0) {
        int var2 = 124 / ((param0 - -3) / 50);
        if (!(((lu) this).field_h[((lu) this).field_g] != 0)) {
            ((lu) this).field_g = ((lu) this).field_g + 1;
            return null;
        }
        return ((lu) this).g(97);
    }

    final int d(int param0) {
        int var4 = BachelorFridge.field_y;
        int fieldTemp$0 = ((lu) this).field_g;
        ((lu) this).field_g = ((lu) this).field_g + 1;
        int var2 = ((lu) this).field_h[fieldTemp$0];
        int var3 = 0;
        while (var2 < 0) {
            var3 = (var3 | var2 & 127) << 7;
            int fieldTemp$1 = ((lu) this).field_g;
            ((lu) this).field_g = ((lu) this).field_g + 1;
            var2 = ((lu) this).field_h[fieldTemp$1];
        }
        if (param0 != -1) {
            ((lu) this).field_h = null;
        }
        return var2 | var3;
    }

    final boolean j(int param0) {
        ((lu) this).field_g = ((lu) this).field_g - param0;
        int var2 = mk.a(((lu) this).field_h, 0, -111, ((lu) this).field_g);
        int var3 = ((lu) this).f(49);
        if (var2 != var3) {
            return false;
        }
        return true;
    }

    final void a(int param0, boolean param1) {
        int var4 = BachelorFridge.field_y;
        if (param1) {
            ((lu) this).field_g = -52;
        }
        while (((lu) this).field_g < param0) {
            int fieldTemp$0 = ((lu) this).field_g;
            ((lu) this).field_g = ((lu) this).field_g + 1;
            ((lu) this).field_h[fieldTemp$0] = (byte) 0;
        }
    }

    final static void a(int param0, int param1, byte param2) {
        uha var6 = null;
        uha var7 = null;
        pf var4 = null;
        if (!(param0 == hja.field_i)) {
            var6 = (uha) (Object) ola.field_g.a((long)hja.field_i, (byte) -87);
            var7 = var6;
            if (!(var7 == null)) {
                var7.field_Cb = null;
            }
            hja.field_i = param0;
            var4 = sja.field_fb;
            var4.c(param1, (byte) 113);
            var4.d(3, 0);
            var4.d(11, 0);
            var4.b(param0, -122);
        }
        int var3 = -23 % ((-24 - param2) / 57);
    }

    final long c(int param0) {
        if (param0 >= -93) {
            field_f = null;
        }
        long var2 = 4294967295L & (long)((lu) this).f(78);
        long var4 = (long)((lu) this).f(-62) & 4294967295L;
        return (var2 << 32) + var4;
    }

    final void a(byte param0, int param1) {
        ((lu) this).field_h[-param1 + (((lu) this).field_g - 2)] = (byte)(param1 >> 8);
        ((lu) this).field_h[-param1 + ((lu) this).field_g - 1] = (byte)param1;
        if (param0 != -88) {
            ((lu) this).field_g = 60;
        }
    }

    final void b(byte param0, int param1) {
        ((lu) this).field_h[-1 + ((lu) this).field_g + -param1] = (byte)param1;
        int var3 = -126 / ((26 - param0) / 50);
    }

    final static void a(int param0, kv param1, int param2, byte param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int[] param11, int param12, int[] param13, int param14, int param15, int param16) {
        int var17_int = 0;
        int var18 = 0;
        double var19 = 0.0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        double var37 = 0.0;
        double var39 = 0.0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        int var57 = 0;
        int var58 = 0;
        int var59 = 0;
        int var60 = 0;
        int var61 = 0;
        int var62 = 0;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        int var67 = 0;
        int stackIn_69_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_125_0 = 0;
        int stackIn_131_0 = 0;
        int stackIn_141_0 = 0;
        int stackIn_146_0 = 0;
        int stackIn_184_0 = 0;
        int stackIn_190_0 = 0;
        int stackIn_199_0 = 0;
        int stackIn_205_0 = 0;
        int stackIn_241_0 = 0;
        int stackIn_246_0 = 0;
        int stackIn_255_0 = 0;
        int stackIn_262_0 = 0;
        int stackOut_240_0 = 0;
        int stackOut_239_0 = 0;
        int stackOut_245_0 = 0;
        int stackOut_244_0 = 0;
        int stackOut_254_0 = 0;
        int stackOut_253_0 = 0;
        int stackOut_261_0 = 0;
        int stackOut_260_0 = 0;
        int stackOut_183_0 = 0;
        int stackOut_182_0 = 0;
        int stackOut_189_0 = 0;
        int stackOut_188_0 = 0;
        int stackOut_198_0 = 0;
        int stackOut_197_0 = 0;
        int stackOut_204_0 = 0;
        int stackOut_203_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_123_0 = 0;
        int stackOut_130_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_140_0 = 0;
        int stackOut_139_0 = 0;
        int stackOut_145_0 = 0;
        int stackOut_144_0 = 0;
        L0: {
          var67 = BachelorFridge.field_y;
          if (0 == param5) {
            break L0;
          } else {
            if (param15 == 0) {
              break L0;
            } else {
              var17_int = param1.field_q;
              param10 = param10 - (param1.field_t << 4);
              param14 = param14 - (param1.field_u << 4);
              var18 = param1.field_p;
              var19 = 0.00009587379924285257 * (double)(param6 & 65535);
              var21 = (int)Math.floor(0.5 + Math.sin(var19) * (double)param5);
              var22 = (int)Math.floor(Math.cos(var19) * (double)param5 + 0.5);
              var23 = (int)Math.floor(0.5 + (double)param15 * Math.sin(var19));
              var24 = (int)Math.floor(0.5 + Math.cos(var19) * (double)param15);
              var25 = var23 * -param14 + var22 * -param10;
              var26 = var24 * -param14 + --param10 * var21;
              var27 = var22 * (-param10 + (var17_int << 4)) + var23 * -param14;
              var28 = var21 * -((var17_int << 4) - param10) - -(var24 * -param14);
              var29 = ((var18 << 4) + -param14) * var23 + -param10 * var22;
              var30 = --param10 * var21 - -((-param14 + (var18 << 4)) * var24);
              L1: {
                var31 = var22 * (-param10 + (var17_int << 4)) - -((-param14 + (var18 << 4)) * var23);
                var32 = -((var17_int << 4) + -param10) * var21 - -(var24 * ((var18 << 4) - param14));
                if (var27 <= var25) {
                  var33 = var27;
                  var34 = var25;
                  break L1;
                } else {
                  var34 = var27;
                  var33 = var25;
                  break L1;
                }
              }
              L2: {
                if (~var33 < ~var29) {
                  var33 = var29;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (var33 <= var31) {
                  break L3;
                } else {
                  var33 = var31;
                  break L3;
                }
              }
              L4: {
                if (var34 >= var29) {
                  break L4;
                } else {
                  var34 = var29;
                  break L4;
                }
              }
              L5: {
                if (~var31 < ~var34) {
                  var34 = var31;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (var26 >= var28) {
                  var35 = var28;
                  var36 = var26;
                  break L6;
                } else {
                  var36 = var28;
                  var35 = var26;
                  break L6;
                }
              }
              L7: {
                if (~var35 >= ~var30) {
                  break L7;
                } else {
                  var35 = var30;
                  break L7;
                }
              }
              L8: {
                if (~var36 > ~var30) {
                  var36 = var30;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (var35 > var32) {
                  var35 = var32;
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                var34 = var34 - -4095 >> 12;
                if (var32 <= var36) {
                  break L10;
                } else {
                  var36 = var32;
                  break L10;
                }
              }
              L11: {
                var33 = var33 >> 12;
                var35 = var35 >> 12;
                var34 = var34 + param8;
                var35 = var35 + param12;
                var36 = var36 - -4095 >> 12;
                var33 = var33 + param8;
                var33 = var33 >> 4;
                var35 = var35 >> 4;
                var34 = 15 + var34 >> 4;
                var36 = var36 + param12;
                if (~dg.field_f >= ~var33) {
                  break L11;
                } else {
                  var33 = dg.field_f;
                  break L11;
                }
              }
              L12: {
                if (var34 <= dg.field_h) {
                  break L12;
                } else {
                  var34 = dg.field_h;
                  break L12;
                }
              }
              L13: {
                var36 = var36 - -15 >> 4;
                if (~dg.field_j < ~var35) {
                  var35 = dg.field_j;
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                var34 = -var34 + var33;
                if (var36 <= dg.field_k) {
                  break L14;
                } else {
                  var36 = dg.field_k;
                  break L14;
                }
              }
              if (var34 < 0) {
                var36 = -var36 + var35;
                if (var36 >= 0) {
                  return;
                } else {
                  L15: {
                    param4 = dg.field_i * var35 + var33;
                    param0 = var34 + dg.field_i;
                    var37 = 16777216.0 / (double)param5;
                    var21 = (int)Math.floor(Math.sin(var19) * var37 + 0.5);
                    var39 = 16777216.0 / (double)param15;
                    var22 = (int)Math.floor(0.5 + var37 * Math.cos(var19));
                    var23 = (int)Math.floor(0.5 + Math.sin(var19) * var39);
                    var24 = (int)Math.floor(var39 * Math.cos(var19) + 0.5);
                    var41 = -param8 + ((var33 << 4) - -8);
                    var42 = -param12 + (var35 << 4) - -8;
                    param7 = -(var21 * var42 >> 4) + (param10 << 8);
                    param16 = (param14 << 8) + (var42 * var24 >> 4);
                    var43 = var41 * var22 >> 4;
                    var44 = var23 * var41 >> 4;
                    var48 = var17_int << 12;
                    var49 = var18 << 12;
                    if (var22 < 0) {
                      if (0 > var23) {
                        var46 = var36;
                        L16: while (true) {
                          if (var46 == 0) {
                            break L15;
                          } else {
                            L17: {
                              L18: {
                                var51 = param16 + var44;
                                var45 = var34;
                                var50 = var43 + param7;
                                var47 = -var48 + var50;
                                if (-var48 + var50 < 0) {
                                  break L18;
                                } else {
                                  if (var22 == 0) {
                                    param4 = param4 - var45;
                                    break L17;
                                  } else {
                                    var47 = (var22 - var47) / var22;
                                    var45 = var45 + var47;
                                    var50 = var50 + var22 * var47;
                                    param4 = param4 + var47;
                                    var51 = var51 + var23 * var47;
                                    break L18;
                                  }
                                }
                              }
                              L19: {
                                var47 = -var49 + var51;
                                if (-var49 + var51 < 0) {
                                  break L19;
                                } else {
                                  if (0 != var23) {
                                    var47 = (-var47 + var23) / var23;
                                    var51 = var51 + var23 * var47;
                                    var50 = var50 + var47 * var22;
                                    var45 = var45 + var47;
                                    param4 = param4 + var47;
                                    break L19;
                                  } else {
                                    param4 = param4 - var45;
                                    break L17;
                                  }
                                }
                              }
                              L20: while (true) {
                                L21: {
                                  if (var45 == 0) {
                                    break L21;
                                  } else {
                                    if (var50 < -4096) {
                                      break L21;
                                    } else {
                                      if (var51 < -4096) {
                                        break L21;
                                      } else {
                                        L22: {
                                          var53 = var51;
                                          var52 = var50;
                                          param2 = var50 >> 12;
                                          param9 = var51 >> 12;
                                          var53 = var53 & 4095;
                                          var52 = var52 & 4095;
                                          var62 = param9 * var17_int + param2;
                                          if (0 > param9) {
                                            var55 = 0;
                                            var58 = 0;
                                            var59 = 0;
                                            var54 = 0;
                                            break L22;
                                          } else {
                                            L23: {
                                              if (var17_int + -1 > param2) {
                                                L24: {
                                                  var55 = param13[var62 + 1];
                                                  if (0 != var55) {
                                                    stackOut_240_0 = (-var53 + 4096) * var52;
                                                    stackIn_241_0 = stackOut_240_0;
                                                    break L24;
                                                  } else {
                                                    stackOut_239_0 = 0;
                                                    stackIn_241_0 = stackOut_239_0;
                                                    break L24;
                                                  }
                                                }
                                                var59 = stackIn_241_0;
                                                break L23;
                                              } else {
                                                var59 = 0;
                                                var55 = 0;
                                                break L23;
                                              }
                                            }
                                            if (param2 < 0) {
                                              var58 = 0;
                                              var54 = 0;
                                              break L22;
                                            } else {
                                              L25: {
                                                var54 = param13[var62];
                                                if (var54 != 0) {
                                                  stackOut_245_0 = (-var52 + 4096) * (-var53 + 4096);
                                                  stackIn_246_0 = stackOut_245_0;
                                                  break L25;
                                                } else {
                                                  stackOut_244_0 = 0;
                                                  stackIn_246_0 = stackOut_244_0;
                                                  break L25;
                                                }
                                              }
                                              var58 = stackIn_246_0;
                                              break L22;
                                            }
                                          }
                                        }
                                        L26: {
                                          if (~param9 > ~(-1 + var18)) {
                                            L27: {
                                              if (0 > param2) {
                                                var60 = 0;
                                                var56 = 0;
                                                break L27;
                                              } else {
                                                L28: {
                                                  var56 = param13[var62 - -var17_int];
                                                  if (0 != var56) {
                                                    stackOut_254_0 = (-var52 + 4096) * var53;
                                                    stackIn_255_0 = stackOut_254_0;
                                                    break L28;
                                                  } else {
                                                    stackOut_253_0 = 0;
                                                    stackIn_255_0 = stackOut_253_0;
                                                    break L28;
                                                  }
                                                }
                                                var60 = stackIn_255_0;
                                                break L27;
                                              }
                                            }
                                            if (~param2 > ~(-1 + var17_int)) {
                                              L29: {
                                                var57 = param13[1 + (var17_int + var62)];
                                                if (var57 != 0) {
                                                  stackOut_261_0 = var52 * var53;
                                                  stackIn_262_0 = stackOut_261_0;
                                                  break L29;
                                                } else {
                                                  stackOut_260_0 = 0;
                                                  stackIn_262_0 = stackOut_260_0;
                                                  break L29;
                                                }
                                              }
                                              var61 = stackIn_262_0;
                                              break L26;
                                            } else {
                                              var57 = 0;
                                              var61 = 0;
                                              break L26;
                                            }
                                          } else {
                                            var57 = 0;
                                            var61 = 0;
                                            var60 = 0;
                                            var56 = 0;
                                            break L26;
                                          }
                                        }
                                        L30: {
                                          var58 = var58 >> 16;
                                          var61 = var61 >> 16;
                                          var59 = var59 >> 16;
                                          var60 = var60 >> 16;
                                          var66 = var58 - -var59 + var60 - -var61;
                                          if (var66 < 256) {
                                            if (var66 < 128) {
                                              break L30;
                                            } else {
                                              L31: {
                                                var63 = (16711935 & var54) * var58 - -(var59 * (var55 & 16711935));
                                                var64 = var58 * (var54 & 65280) + var59 * (65280 & var55);
                                                var63 = var63 + (var61 * (var57 & 16711935) + var60 * (16711935 & var56));
                                                var64 = var64 + (var60 * (65280 & var56) - -((65280 & var57) * var61));
                                                var65 = (65535 & var63) / var66 + ((var63 >>> 16) / var66 << 16) + (var64 / var66 & 65280);
                                                if (var65 != 0) {
                                                  break L31;
                                                } else {
                                                  var65 = 1;
                                                  break L31;
                                                }
                                              }
                                              param11[param4] = var65;
                                              break L30;
                                            }
                                          } else {
                                            L32: {
                                              var63 = (16711935 & var54) * var58 - -(var59 * (var55 & 16711935));
                                              var64 = var59 * (65280 & var55) + (65280 & var54) * var58;
                                              var63 = var63 + ((16711935 & var57) * var61 + (var56 & 16711935) * var60);
                                              var64 = var64 + ((65280 & var57) * var61 + var60 * (var56 & 65280));
                                              var65 = (-419495681 & var63 >>> 8) + ((var64 & 16711716) >>> 8);
                                              if (var65 != 0) {
                                                break L32;
                                              } else {
                                                var65 = 1;
                                                break L32;
                                              }
                                            }
                                            param11[param4] = var65;
                                            break L30;
                                          }
                                        }
                                        var45++;
                                        param4++;
                                        var51 = var51 + var23;
                                        var50 = var50 + var22;
                                        continue L20;
                                      }
                                    }
                                  }
                                }
                                param4 = param4 - var45;
                                break L17;
                              }
                            }
                            param4 = param4 + param0;
                            var46++;
                            param7 = param7 - var21;
                            param16 = param16 + var24;
                            continue L16;
                          }
                        }
                      } else {
                        var46 = var36;
                        L33: while (true) {
                          if (0 == var46) {
                            break L15;
                          } else {
                            L34: {
                              L35: {
                                var45 = var34;
                                var51 = param16 - -var44;
                                var50 = param7 - -var43;
                                var47 = var50 - var48;
                                if (var50 - var48 >= 0) {
                                  if (var22 != 0) {
                                    var47 = (-var47 + var22) / var22;
                                    var50 = var50 + var22 * var47;
                                    var51 = var51 + var47 * var23;
                                    var45 = var45 + var47;
                                    param4 = param4 + var47;
                                    break L35;
                                  } else {
                                    param4 = param4 - var45;
                                    break L34;
                                  }
                                } else {
                                  break L35;
                                }
                              }
                              L36: {
                                var47 = var51 - -4096;
                                if (0 > var51 - -4096) {
                                  if (0 != var23) {
                                    var47 = (-1 + (var23 + -var47)) / var23;
                                    var51 = var51 + var47 * var23;
                                    var45 = var45 + var47;
                                    param4 = param4 + var47;
                                    var50 = var50 + var22 * var47;
                                    break L36;
                                  } else {
                                    param4 = param4 - var45;
                                    break L34;
                                  }
                                } else {
                                  break L36;
                                }
                              }
                              L37: while (true) {
                                L38: {
                                  if (var45 == 0) {
                                    break L38;
                                  } else {
                                    if (var50 < -4096) {
                                      break L38;
                                    } else {
                                      param9 = var51 >> 12;
                                      if (~var18 < ~(var51 >> 12)) {
                                        L39: {
                                          var52 = var50;
                                          param2 = var50 >> 12;
                                          var53 = var51;
                                          var52 = var52 & 4095;
                                          var62 = param2 + var17_int * param9;
                                          var53 = var53 & 4095;
                                          if (-1 + var18 <= param9) {
                                            var57 = 0;
                                            var56 = 0;
                                            var60 = 0;
                                            var61 = 0;
                                            break L39;
                                          } else {
                                            L40: {
                                              if (var17_int - 1 <= param2) {
                                                var61 = 0;
                                                var57 = 0;
                                                break L40;
                                              } else {
                                                L41: {
                                                  var57 = param13[1 + var17_int + var62];
                                                  if (var57 == 0) {
                                                    stackOut_183_0 = 0;
                                                    stackIn_184_0 = stackOut_183_0;
                                                    break L41;
                                                  } else {
                                                    stackOut_182_0 = var52 * var53;
                                                    stackIn_184_0 = stackOut_182_0;
                                                    break L41;
                                                  }
                                                }
                                                var61 = stackIn_184_0;
                                                break L40;
                                              }
                                            }
                                            if (0 > param2) {
                                              var60 = 0;
                                              var56 = 0;
                                              break L39;
                                            } else {
                                              L42: {
                                                var56 = param13[var62 - -var17_int];
                                                if (var56 != 0) {
                                                  stackOut_189_0 = var53 * (-var52 + 4096);
                                                  stackIn_190_0 = stackOut_189_0;
                                                  break L42;
                                                } else {
                                                  stackOut_188_0 = 0;
                                                  stackIn_190_0 = stackOut_188_0;
                                                  break L42;
                                                }
                                              }
                                              var60 = stackIn_190_0;
                                              break L39;
                                            }
                                          }
                                        }
                                        L43: {
                                          if (0 > param9) {
                                            var54 = 0;
                                            var58 = 0;
                                            var59 = 0;
                                            var55 = 0;
                                            break L43;
                                          } else {
                                            L44: {
                                              if (param2 >= 0) {
                                                L45: {
                                                  var54 = param13[var62];
                                                  if (var54 == 0) {
                                                    stackOut_198_0 = 0;
                                                    stackIn_199_0 = stackOut_198_0;
                                                    break L45;
                                                  } else {
                                                    stackOut_197_0 = (-var52 + 4096) * (4096 + -var53);
                                                    stackIn_199_0 = stackOut_197_0;
                                                    break L45;
                                                  }
                                                }
                                                var58 = stackIn_199_0;
                                                break L44;
                                              } else {
                                                var58 = 0;
                                                var54 = 0;
                                                break L44;
                                              }
                                            }
                                            if (param2 < -1 + var17_int) {
                                              L46: {
                                                var55 = param13[1 + var62];
                                                if (var55 == 0) {
                                                  stackOut_204_0 = 0;
                                                  stackIn_205_0 = stackOut_204_0;
                                                  break L46;
                                                } else {
                                                  stackOut_203_0 = (4096 - var53) * var52;
                                                  stackIn_205_0 = stackOut_203_0;
                                                  break L46;
                                                }
                                              }
                                              var59 = stackIn_205_0;
                                              break L43;
                                            } else {
                                              var55 = 0;
                                              var59 = 0;
                                              break L43;
                                            }
                                          }
                                        }
                                        L47: {
                                          var58 = var58 >> 16;
                                          var59 = var59 >> 16;
                                          var61 = var61 >> 16;
                                          var60 = var60 >> 16;
                                          var66 = var60 + var58 + (var59 - -var61);
                                          if (var66 < 256) {
                                            if (var66 >= 128) {
                                              L48: {
                                                var63 = var58 * (var54 & 16711935) + (16711935 & var55) * var59;
                                                var63 = var63 + ((16711935 & var57) * var61 + var60 * (var56 & 16711935));
                                                var64 = var58 * (var54 & 65280) + var59 * (var55 & 65280);
                                                var64 = var64 + ((var57 & 65280) * var61 + (65280 & var56) * var60);
                                                var65 = (65280 & var64 / var66) + ((var63 >>> 16) / var66 << 16) + (var63 & 65535) / var66;
                                                if (var65 == 0) {
                                                  var65 = 1;
                                                  break L48;
                                                } else {
                                                  break L48;
                                                }
                                              }
                                              param11[param4] = var65;
                                              break L47;
                                            } else {
                                              break L47;
                                            }
                                          } else {
                                            L49: {
                                              var63 = (16711935 & var55) * var59 + (var54 & 16711935) * var58;
                                              var63 = var63 + (var61 * (var57 & 16711935) + (var56 & 16711935) * var60);
                                              var64 = (var55 & 65280) * var59 + (var54 & 65280) * var58;
                                              var64 = var64 + ((65280 & var57) * var61 + (65280 & var56) * var60);
                                              var65 = (var63 >>> 8 & 956236031) + ((var64 & 16711808) >>> 8);
                                              if (0 != var65) {
                                                break L49;
                                              } else {
                                                var65 = 1;
                                                break L49;
                                              }
                                            }
                                            param11[param4] = var65;
                                            break L47;
                                          }
                                        }
                                        var51 = var51 + var23;
                                        param4++;
                                        var50 = var50 + var22;
                                        var45++;
                                        continue L37;
                                      } else {
                                        break L38;
                                      }
                                    }
                                  }
                                }
                                param4 = param4 - var45;
                                break L34;
                              }
                            }
                            var46++;
                            param16 = param16 + var24;
                            param7 = param7 - var21;
                            param4 = param4 + param0;
                            continue L33;
                          }
                        }
                      }
                    } else {
                      L50: {
                        if (var21 >= 0) {
                          break L50;
                        } else {
                          if (var23 >= 0) {
                            break L50;
                          } else {
                            var46 = var36;
                            L51: while (true) {
                              if (var46 == 0) {
                                break L15;
                              } else {
                                L52: {
                                  L53: {
                                    var50 = var43 + param7;
                                    var51 = var44 + param16;
                                    var45 = var34;
                                    var47 = var50 - -4096;
                                    if (var50 - -4096 >= 0) {
                                      break L53;
                                    } else {
                                      if (var22 != 0) {
                                        var47 = (var22 + (-1 - var47)) / var22;
                                        var51 = var51 + var23 * var47;
                                        var50 = var50 + var22 * var47;
                                        param4 = param4 + var47;
                                        var45 = var45 + var47;
                                        break L53;
                                      } else {
                                        param4 = param4 - var45;
                                        break L52;
                                      }
                                    }
                                  }
                                  L54: {
                                    var47 = -var49 + var51;
                                    if (-var49 + var51 < 0) {
                                      break L54;
                                    } else {
                                      if (var23 == 0) {
                                        param4 = param4 - var45;
                                        break L52;
                                      } else {
                                        var47 = (-var47 + var23) / var23;
                                        param4 = param4 + var47;
                                        var51 = var51 + var23 * var47;
                                        var50 = var50 + var22 * var47;
                                        var45 = var45 + var47;
                                        break L54;
                                      }
                                    }
                                  }
                                  L55: while (true) {
                                    L56: {
                                      if (var45 == 0) {
                                        break L56;
                                      } else {
                                        if (var51 < -4096) {
                                          break L56;
                                        } else {
                                          param2 = var50 >> 12;
                                          if (~var17_int >= ~(var50 >> 12)) {
                                            break L56;
                                          } else {
                                            L57: {
                                              var52 = var50;
                                              var53 = var51;
                                              param9 = var51 >> 12;
                                              var52 = var52 & 4095;
                                              var53 = var53 & 4095;
                                              var62 = var17_int * param9 - -param2;
                                              if (~param9 <= ~(-1 + var18)) {
                                                var60 = 0;
                                                var61 = 0;
                                                var56 = 0;
                                                var57 = 0;
                                                break L57;
                                              } else {
                                                L58: {
                                                  if (param2 < -1 + var17_int) {
                                                    L59: {
                                                      var57 = param13[var17_int + var62 + 1];
                                                      if (0 != var57) {
                                                        stackOut_68_0 = var52 * var53;
                                                        stackIn_69_0 = stackOut_68_0;
                                                        break L59;
                                                      } else {
                                                        stackOut_67_0 = 0;
                                                        stackIn_69_0 = stackOut_67_0;
                                                        break L59;
                                                      }
                                                    }
                                                    var61 = stackIn_69_0;
                                                    break L58;
                                                  } else {
                                                    var61 = 0;
                                                    var57 = 0;
                                                    break L58;
                                                  }
                                                }
                                                if (0 > param2) {
                                                  var56 = 0;
                                                  var60 = 0;
                                                  break L57;
                                                } else {
                                                  L60: {
                                                    var56 = param13[var62 + var17_int];
                                                    if (var56 != 0) {
                                                      stackOut_73_0 = var53 * (4096 - var52);
                                                      stackIn_74_0 = stackOut_73_0;
                                                      break L60;
                                                    } else {
                                                      stackOut_72_0 = 0;
                                                      stackIn_74_0 = stackOut_72_0;
                                                      break L60;
                                                    }
                                                  }
                                                  var60 = stackIn_74_0;
                                                  break L57;
                                                }
                                              }
                                            }
                                            L61: {
                                              if (param9 < 0) {
                                                var55 = 0;
                                                var58 = 0;
                                                var54 = 0;
                                                var59 = 0;
                                                break L61;
                                              } else {
                                                L62: {
                                                  if (param2 >= 0) {
                                                    L63: {
                                                      var54 = param13[var62];
                                                      if (var54 != 0) {
                                                        stackOut_82_0 = (4096 + -var52) * (4096 + -var53);
                                                        stackIn_83_0 = stackOut_82_0;
                                                        break L63;
                                                      } else {
                                                        stackOut_81_0 = 0;
                                                        stackIn_83_0 = stackOut_81_0;
                                                        break L63;
                                                      }
                                                    }
                                                    var58 = stackIn_83_0;
                                                    break L62;
                                                  } else {
                                                    var54 = 0;
                                                    var58 = 0;
                                                    break L62;
                                                  }
                                                }
                                                if (param2 >= -1 + var17_int) {
                                                  var55 = 0;
                                                  var59 = 0;
                                                  break L61;
                                                } else {
                                                  L64: {
                                                    var55 = param13[1 + var62];
                                                    if (var55 == 0) {
                                                      stackOut_87_0 = 0;
                                                      stackIn_88_0 = stackOut_87_0;
                                                      break L64;
                                                    } else {
                                                      stackOut_86_0 = (4096 + -var53) * var52;
                                                      stackIn_88_0 = stackOut_86_0;
                                                      break L64;
                                                    }
                                                  }
                                                  var59 = stackIn_88_0;
                                                  break L61;
                                                }
                                              }
                                            }
                                            L65: {
                                              var61 = var61 >> 16;
                                              var60 = var60 >> 16;
                                              var58 = var58 >> 16;
                                              var59 = var59 >> 16;
                                              var66 = var61 + var59 + (var58 - -var60);
                                              if (var66 < 256) {
                                                if (var66 < 128) {
                                                  break L65;
                                                } else {
                                                  L66: {
                                                    var63 = var58 * (16711935 & var54) - -(var59 * (var55 & 16711935));
                                                    var63 = var63 + ((16711935 & var57) * var61 + var60 * (var56 & 16711935));
                                                    var64 = (65280 & var55) * var59 + var58 * (65280 & var54);
                                                    var64 = var64 + (var60 * (65280 & var56) - -((65280 & var57) * var61));
                                                    var65 = (var63 & 65535) / var66 + (var64 / var66 & 65280) + ((var63 >>> 16) / var66 << 16);
                                                    if (var65 != 0) {
                                                      break L66;
                                                    } else {
                                                      var65 = 1;
                                                      break L66;
                                                    }
                                                  }
                                                  param11[param4] = var65;
                                                  break L65;
                                                }
                                              } else {
                                                L67: {
                                                  var63 = (var55 & 16711935) * var59 + (16711935 & var54) * var58;
                                                  var64 = var58 * (65280 & var54) + var59 * (var55 & 65280);
                                                  var63 = var63 + ((16711935 & var56) * var60 - -((16711935 & var57) * var61));
                                                  var64 = var64 + (var60 * (var56 & 65280) + var61 * (var57 & 65280));
                                                  var65 = ((16711735 & var64) >>> 8) + ((var63 & -16711692) >>> 8);
                                                  if (var65 == 0) {
                                                    var65 = 1;
                                                    break L67;
                                                  } else {
                                                    break L67;
                                                  }
                                                }
                                                param11[param4] = var65;
                                                break L65;
                                              }
                                            }
                                            var50 = var50 + var22;
                                            param4++;
                                            var51 = var51 + var23;
                                            var45++;
                                            continue L55;
                                          }
                                        }
                                      }
                                    }
                                    param4 = param4 - var45;
                                    break L52;
                                  }
                                }
                                var46++;
                                param4 = param4 + param0;
                                param7 = param7 - var21;
                                param16 = param16 + var24;
                                continue L51;
                              }
                            }
                          }
                        }
                      }
                      var46 = var36;
                      L68: while (true) {
                        if (var46 == 0) {
                          break L15;
                        } else {
                          L69: {
                            L70: {
                              var45 = var34;
                              var51 = var44 + param16;
                              var50 = var43 + param7;
                              var47 = var50 + 4096;
                              if (var50 + 4096 < 0) {
                                if (var22 == 0) {
                                  param4 = param4 - var45;
                                  break L69;
                                } else {
                                  var47 = (-1 + (var22 - var47)) / var22;
                                  var45 = var45 + var47;
                                  var50 = var50 + var47 * var22;
                                  var51 = var51 + var23 * var47;
                                  param4 = param4 + var47;
                                  break L70;
                                }
                              } else {
                                break L70;
                              }
                            }
                            L71: {
                              var47 = var51 + 4096;
                              if (0 > var51 + 4096) {
                                if (var23 == 0) {
                                  param4 = param4 - var45;
                                  break L69;
                                } else {
                                  var47 = (var23 + (-1 + -var47)) / var23;
                                  var45 = var45 + var47;
                                  param4 = param4 + var47;
                                  var50 = var50 + var22 * var47;
                                  var51 = var51 + var23 * var47;
                                  break L71;
                                }
                              } else {
                                break L71;
                              }
                            }
                            L72: while (true) {
                              L73: {
                                if (0 == var45) {
                                  break L73;
                                } else {
                                  param2 = var50 >> 12;
                                  if (var50 >> 12 >= var17_int) {
                                    break L73;
                                  } else {
                                    param9 = var51 >> 12;
                                    if (~var18 >= ~(var51 >> 12)) {
                                      break L73;
                                    } else {
                                      L74: {
                                        var62 = param2 + param9 * var17_int;
                                        var52 = var50;
                                        var53 = var51;
                                        var53 = var53 & 4095;
                                        var52 = var52 & 4095;
                                        if (0 > param9) {
                                          var59 = 0;
                                          var58 = 0;
                                          var55 = 0;
                                          var54 = 0;
                                          break L74;
                                        } else {
                                          L75: {
                                            if (param2 >= var17_int + -1) {
                                              var55 = 0;
                                              var59 = 0;
                                              break L75;
                                            } else {
                                              L76: {
                                                var55 = param13[1 + var62];
                                                if (var55 == 0) {
                                                  stackOut_124_0 = 0;
                                                  stackIn_125_0 = stackOut_124_0;
                                                  break L76;
                                                } else {
                                                  stackOut_123_0 = (-var53 + 4096) * var52;
                                                  stackIn_125_0 = stackOut_123_0;
                                                  break L76;
                                                }
                                              }
                                              var59 = stackIn_125_0;
                                              break L75;
                                            }
                                          }
                                          if (param2 < 0) {
                                            var58 = 0;
                                            var54 = 0;
                                            break L74;
                                          } else {
                                            L77: {
                                              var54 = param13[var62];
                                              if (var54 == 0) {
                                                stackOut_130_0 = 0;
                                                stackIn_131_0 = stackOut_130_0;
                                                break L77;
                                              } else {
                                                stackOut_129_0 = (-var52 + 4096) * (4096 + -var53);
                                                stackIn_131_0 = stackOut_129_0;
                                                break L77;
                                              }
                                            }
                                            var58 = stackIn_131_0;
                                            break L74;
                                          }
                                        }
                                      }
                                      L78: {
                                        if (~param9 > ~(var18 - 1)) {
                                          L79: {
                                            if (0 <= param2) {
                                              L80: {
                                                var56 = param13[var62 + var17_int];
                                                if (var56 == 0) {
                                                  stackOut_140_0 = 0;
                                                  stackIn_141_0 = stackOut_140_0;
                                                  break L80;
                                                } else {
                                                  stackOut_139_0 = var53 * (-var52 + 4096);
                                                  stackIn_141_0 = stackOut_139_0;
                                                  break L80;
                                                }
                                              }
                                              var60 = stackIn_141_0;
                                              break L79;
                                            } else {
                                              var56 = 0;
                                              var60 = 0;
                                              break L79;
                                            }
                                          }
                                          if (~param2 <= ~(-1 + var17_int)) {
                                            var57 = 0;
                                            var61 = 0;
                                            break L78;
                                          } else {
                                            L81: {
                                              var57 = param13[1 + var62 + var17_int];
                                              if (var57 == 0) {
                                                stackOut_145_0 = 0;
                                                stackIn_146_0 = stackOut_145_0;
                                                break L81;
                                              } else {
                                                stackOut_144_0 = var52 * var53;
                                                stackIn_146_0 = stackOut_144_0;
                                                break L81;
                                              }
                                            }
                                            var61 = stackIn_146_0;
                                            break L78;
                                          }
                                        } else {
                                          var56 = 0;
                                          var57 = 0;
                                          var60 = 0;
                                          var61 = 0;
                                          break L78;
                                        }
                                      }
                                      L82: {
                                        var58 = var58 >> 16;
                                        var61 = var61 >> 16;
                                        var60 = var60 >> 16;
                                        var59 = var59 >> 16;
                                        var66 = var61 + (var60 + var59 + var58);
                                        if (256 <= var66) {
                                          L83: {
                                            var63 = (16711935 & var55) * var59 + (16711935 & var54) * var58;
                                            var64 = (65280 & var55) * var59 + var58 * (65280 & var54);
                                            var63 = var63 + ((var57 & 16711935) * var61 + (16711935 & var56) * var60);
                                            var64 = var64 + (var61 * (65280 & var57) + var60 * (var56 & 65280));
                                            var65 = (989790463 & var63 >>> 8) - -((16711850 & var64) >>> 8);
                                            if (0 == var65) {
                                              var65 = 1;
                                              break L83;
                                            } else {
                                              break L83;
                                            }
                                          }
                                          param11[param4] = var65;
                                          break L82;
                                        } else {
                                          if (128 <= var66) {
                                            L84: {
                                              var63 = (var54 & 16711935) * var58 + (16711935 & var55) * var59;
                                              var63 = var63 + (var61 * (var57 & 16711935) + (var56 & 16711935) * var60);
                                              var64 = var59 * (var55 & 65280) + var58 * (var54 & 65280);
                                              var64 = var64 + (var61 * (var57 & 65280) + (65280 & var56) * var60);
                                              var65 = (65535 & var63) / var66 + ((var63 >>> 16) / var66 << 16) + (65280 & var64 / var66);
                                              if (var65 == 0) {
                                                var65 = 1;
                                                break L84;
                                              } else {
                                                break L84;
                                              }
                                            }
                                            param11[param4] = var65;
                                            break L82;
                                          } else {
                                            break L82;
                                          }
                                        }
                                      }
                                      var50 = var50 + var22;
                                      param4++;
                                      var45++;
                                      var51 = var51 + var23;
                                      continue L72;
                                    }
                                  }
                                }
                              }
                              param4 = param4 - var45;
                              break L69;
                            }
                          }
                          param4 = param4 + param0;
                          var46++;
                          param16 = param16 + var24;
                          param7 = param7 - var21;
                          continue L68;
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    final void a(int param0, long param1) {
        if (param0 != 4096) {
            ((lu) this).field_h = null;
        }
        int fieldTemp$0 = ((lu) this).field_g;
        ((lu) this).field_g = ((lu) this).field_g + 1;
        ((lu) this).field_h[fieldTemp$0] = (byte)(int)(param1 >> 32);
        int fieldTemp$1 = ((lu) this).field_g;
        ((lu) this).field_g = ((lu) this).field_g + 1;
        ((lu) this).field_h[fieldTemp$1] = (byte)(int)(param1 >> 24);
        int fieldTemp$2 = ((lu) this).field_g;
        ((lu) this).field_g = ((lu) this).field_g + 1;
        ((lu) this).field_h[fieldTemp$2] = (byte)(int)(param1 >> 16);
        int fieldTemp$3 = ((lu) this).field_g;
        ((lu) this).field_g = ((lu) this).field_g + 1;
        ((lu) this).field_h[fieldTemp$3] = (byte)(int)(param1 >> 8);
        int fieldTemp$4 = ((lu) this).field_g;
        ((lu) this).field_g = ((lu) this).field_g + 1;
        ((lu) this).field_h[fieldTemp$4] = (byte)(int)param1;
    }

    final int a(int param0) {
        ((lu) this).field_g = ((lu) this).field_g + param0;
        return (((lu) this).field_h[((lu) this).field_g - 3] << 16 & 16711680) - (-(((lu) this).field_h[-2 + ((lu) this).field_g] << 8 & 65280) + -(255 & ((lu) this).field_h[((lu) this).field_g - 1]));
    }

    final void b(int param0, int param1) {
        if (param1 >= -110) {
            return;
        }
        int fieldTemp$0 = ((lu) this).field_g;
        ((lu) this).field_g = ((lu) this).field_g + 1;
        ((lu) this).field_h[fieldTemp$0] = (byte)(param0 >> 8);
        int fieldTemp$1 = ((lu) this).field_g;
        ((lu) this).field_g = ((lu) this).field_g + 1;
        ((lu) this).field_h[fieldTemp$1] = (byte)param0;
    }

    final void a(int param0, int param1, int param2, byte[] param3) {
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
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            var5_int = param0;
            L1: while (true) {
              if (param0 - -param2 <= var5_int) {
                L2: {
                  if (param1 <= -71) {
                    break L2;
                  } else {
                    lu.a(7, 17, (byte) 45);
                    break L2;
                  }
                }
                break L0;
              } else {
                int fieldTemp$2 = ((lu) this).field_g;
                ((lu) this).field_g = ((lu) this).field_g + 1;
                ((lu) this).field_h[fieldTemp$2] = param3[var5_int];
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("lu.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
          throw pe.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    public static void d(byte param0) {
        field_f = null;
        if (param0 != -19) {
            lu.d((byte) -30);
        }
    }

    private final void a(long param0) {
        int fieldTemp$0 = ((lu) this).field_g;
        ((lu) this).field_g = ((lu) this).field_g + 1;
        ((lu) this).field_h[fieldTemp$0] = (byte)(int)(param0 >> 48);
        int fieldTemp$1 = ((lu) this).field_g;
        ((lu) this).field_g = ((lu) this).field_g + 1;
        ((lu) this).field_h[fieldTemp$1] = (byte)(int)(param0 >> 40);
        int fieldTemp$2 = ((lu) this).field_g;
        ((lu) this).field_g = ((lu) this).field_g + 1;
        ((lu) this).field_h[fieldTemp$2] = (byte)(int)(param0 >> 32);
        int fieldTemp$3 = ((lu) this).field_g;
        ((lu) this).field_g = ((lu) this).field_g + 1;
        ((lu) this).field_h[fieldTemp$3] = (byte)(int)(param0 >> 24);
        int fieldTemp$4 = ((lu) this).field_g;
        ((lu) this).field_g = ((lu) this).field_g + 1;
        ((lu) this).field_h[fieldTemp$4] = (byte)(int)(param0 >> 16);
        int fieldTemp$5 = ((lu) this).field_g;
        ((lu) this).field_g = ((lu) this).field_g + 1;
        ((lu) this).field_h[fieldTemp$5] = (byte)(int)(param0 >> 8);
        int fieldTemp$6 = ((lu) this).field_g;
        ((lu) this).field_g = ((lu) this).field_g + 1;
        ((lu) this).field_h[fieldTemp$6] = (byte)(int)param0;
    }

    lu(int param0) {
        ((lu) this).field_g = 0;
        ((lu) this).field_h = sd.a(param0, 5000);
    }

    final void a(String param0, int param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        if (param1 <= 63) {
            return;
        }
        try {
            var3_int = param0.indexOf(' ');
            if (var3_int >= 0) {
                throw new IllegalArgumentException("");
            }
            int fieldTemp$0 = ((lu) this).field_g;
            ((lu) this).field_g = ((lu) this).field_g + 1;
            ((lu) this).field_h[fieldTemp$0] = (byte) 0;
            var4 = (CharSequence) (Object) param0;
            int discarded$1 = 0;
            ((lu) this).field_g = ((lu) this).field_g + jm.a(param0.length(), -113, ((lu) this).field_g, var4, ((lu) this).field_h);
            int fieldTemp$2 = ((lu) this).field_g;
            ((lu) this).field_g = ((lu) this).field_g + 1;
            ((lu) this).field_h[fieldTemp$2] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "lu.Q(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final byte b(boolean param0) {
        if (!param0) {
            return (byte) -48;
        }
        int fieldTemp$0 = ((lu) this).field_g;
        ((lu) this).field_g = ((lu) this).field_g + 1;
        return ((lu) this).field_h[fieldTemp$0];
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
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param2 == 128) {
                break L1;
              } else {
                byte discarded$9 = ((lu) this).b(false);
                break L1;
              }
            }
            var5_int = param3;
            L2: while (true) {
              if (param3 + param1 <= var5_int) {
                break L0;
              } else {
                int fieldTemp$10 = ((lu) this).field_g;
                ((lu) this).field_g = ((lu) this).field_g + 1;
                param0[var5_int] = ((lu) this).field_h[fieldTemp$10];
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
            stackOut_7_1 = new StringBuilder().append("lu.EA(");
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
          throw pe.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void b(int param0, byte param1) {
        ((lu) this).field_h[-4 + ((lu) this).field_g - param0] = (byte)(param0 >> 24);
        ((lu) this).field_h[((lu) this).field_g - (param0 + 3)] = (byte)(param0 >> 16);
        ((lu) this).field_h[((lu) this).field_g - param0 + -2] = (byte)(param0 >> 8);
        int var3 = -22 / ((-33 - param1) / 54);
        ((lu) this).field_h[-1 + (((lu) this).field_g - param0)] = (byte)param0;
    }

    final String i(int param0) {
        int fieldTemp$0 = ((lu) this).field_g;
        ((lu) this).field_g = ((lu) this).field_g + 1;
        int var2 = ((lu) this).field_h[fieldTemp$0];
        if (!(0 == var2)) {
            throw new IllegalStateException("");
        }
        int var3 = ((lu) this).field_g;
        while (true) {
            int fieldTemp$1 = ((lu) this).field_g;
            ((lu) this).field_g = ((lu) this).field_g + 1;
            if (((lu) this).field_h[fieldTemp$1] == 0) {
                break;
            }
        }
        int var4 = -1 + (-var3 + ((lu) this).field_g);
        if (!(var4 != param0)) {
            return "";
        }
        return gt.a(var3, ((lu) this).field_h, (byte) 104, var4);
    }

    final int h(int param0) {
        int var2 = 255 & ((lu) this).field_h[((lu) this).field_g];
        if (param0 != 16711935) {
            ((lu) this).b(96, (byte) 59);
        }
        if (var2 >= 128) {
            return -32768 + ((lu) this).e((byte) 120);
        }
        return ((lu) this).b(16711935);
    }

    lu(byte[] param0) {
        try {
            ((lu) this).field_h = param0;
            ((lu) this).field_g = 0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "lu.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
