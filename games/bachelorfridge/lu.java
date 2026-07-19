/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lu extends bw {
    static ee field_f;
    int field_g;
    byte[] field_h;

    final void e(int param0, int param1) {
        int discarded$4 = 0;
        int fieldTemp$0 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_h[fieldTemp$0] = (byte)(param0 >> 1715731576);
        int fieldTemp$1 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_h[fieldTemp$1] = (byte)(param0 >> -1322558256);
        int fieldTemp$2 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_h[fieldTemp$2] = (byte)(param0 >> -1854103096);
        int fieldTemp$3 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_h[fieldTemp$3] = (byte)param0;
        if (param1 != -1615464796) {
            discarded$4 = this.b(-122);
        }
    }

    final void c(byte param0, int param1) {
        if (param0 < 58) {
            String var4 = (String) null;
            this.a((String) null, -16);
        }
        if ((param1 ^ -1) > -65) {
            if ((param1 ^ -1) <= 63) {
                this.d(64 + param1, 0);
                return;
            }
        }
        if (param1 < 16384) {
            if (16383 >= (param1 ^ -1)) {
                this.b(49152 + param1, -122);
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    final void d(int param0, int param1) {
        int fieldTemp$0 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_h[fieldTemp$0] = (byte)param0;
        if (param1 != 0) {
            this.b(32, -12L);
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
                this.a(var4, 10847);
                this.a(var6, 10847);
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
                          var4 = var4 + (long)(var10 + 2 + -97);
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
                  if ((var9 ^ -1) == -11) {
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
            stackOut_23_0 = (RuntimeException) (var3);
            stackOut_23_1 = new StringBuilder().append("lu.JA(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
    }

    final int b(int param0) {
        if (param0 != 16711935) {
            String var3 = (String) null;
            this.a((String) null, 67);
        }
        int fieldTemp$0 = this.field_g;
        this.field_g = this.field_g + 1;
        return this.field_h[fieldTemp$0] & 255;
    }

    final void c(int param0, int param1) {
        if (param0 != -1607631824) {
            return;
        }
        int fieldTemp$0 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_h[fieldTemp$0] = (byte)(param1 >> -1607631824);
        int fieldTemp$1 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_h[fieldTemp$1] = (byte)(param1 >> 1102045992);
        int fieldTemp$2 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_h[fieldTemp$2] = (byte)param1;
    }

    final void a(java.math.BigInteger param0, int param1, java.math.BigInteger param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
            var4_int = this.field_g;
            this.field_g = 0;
            var5 = new byte[var4_int];
            this.a(var5, var4_int, param1 ^ 128, 0);
            var6 = new java.math.BigInteger(var5);
            var7 = var6.modPow(param2, param0);
            var8 = var7.toByteArray();
            this.field_g = 0;
            this.b(var8.length, -118);
            this.a(param1, param1 + -122, var8.length, var8);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "lu.HB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final String g(int param0) {
        int fieldTemp$0 = 0;
        int var2 = 102 % ((param0 - 3) / 35);
        int var3 = this.field_g;
        while (true) {
            fieldTemp$0 = this.field_g;
            this.field_g = this.field_g + 1;
            if (this.field_h[fieldTemp$0] == 0) {
                break;
            }
        }
        int var4 = -var3 + (this.field_g - 1);
        if (!(0 != var4)) {
            return "";
        }
        return gt.a(var3, this.field_h, (byte) 104, var4);
    }

    final void a(byte param0, String param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        int fieldTemp$0 = 0;
        try {
            if (param0 != -50) {
                this.field_h = (byte[]) null;
            }
            var3_int = param1.indexOf(' ');
            if (0 <= var3_int) {
                throw new IllegalArgumentException("");
            }
            var4 = (CharSequence) ((Object) param1);
            this.field_g = this.field_g + jm.a(param1.length(), -56, this.field_g, var4, this.field_h, 0);
            fieldTemp$0 = this.field_g;
            this.field_g = this.field_g + 1;
            this.field_h[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "lu.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int f(byte param0) {
        int var2 = -58 / ((-76 - param0) / 45);
        if (0 > this.field_h[this.field_g]) {
            return 2147483647 & this.f(-60);
        }
        return this.e((byte) 57);
    }

    final int e(int param0) {
        int discarded$0 = 0;
        if (param0 != -4095) {
            discarded$0 = this.a(106, -5);
        }
        int var2 = this.field_h[this.field_g] & 255;
        if (var2 < 128) {
            return this.b(16711935) + -64;
        }
        return this.e((byte) 92) + -49152;
    }

    final int a(int param0, int param1) {
        byte discarded$0 = 0;
        int var3 = mk.a(this.field_h, param0, -123, this.field_g);
        if (param1 != 19) {
            discarded$0 = this.b(false);
        }
        this.e(var3, -1615464796);
        return var3;
    }

    final void a(int param0, byte param1) {
        if ((-128 & param0) != 0) {
            if (!(0 == (param0 & -16384))) {
                if (-1 != (param0 & -2097152 ^ -1)) {
                    if (!((-268435456 & param0) == 0)) {
                        this.d(128 | param0 >>> -1347123012, 0);
                    }
                    this.d(param0 >>> 1797024885 | 128, 0);
                }
                this.d(128 | param0 >>> 328315214, 0);
            }
            this.d((param0 | 16411) >>> -1055374489, 0);
        }
        if (param1 > -123) {
            field_f = (ee) null;
        }
        this.d(127 & param0, 0);
    }

    final void a(int param0, int param1, int[] param2, int param3) {
        int discarded$2 = 0;
        int incrementValue$3 = 0;
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
              var5_int = this.field_g;
              if (param0 == 17654) {
                break L1;
              } else {
                discarded$2 = this.a(-29, -92);
                break L1;
              }
            }
            this.field_g = param1;
            var6 = (-param1 + param3) / 8;
            var7 = 0;
            L2: while (true) {
              if (var7 >= var6) {
                this.field_g = var5_int;
                break L0;
              } else {
                var8 = this.f(127);
                var9 = this.f(83);
                var10 = -957401312;
                var11 = -1640531527;
                var12 = 32;
                L3: while (true) {
                  incrementValue$3 = var12;
                  var12--;
                  if (-1 <= (incrementValue$3 ^ -1)) {
                    this.field_g = this.field_g - 8;
                    this.e(var8, -1615464796);
                    this.e(var9, -1615464796);
                    var7++;
                    continue L2;
                  } else {
                    var9 = var9 - (param2[(var10 & 6721) >>> -89194549] + var10 ^ (var8 >>> -563061179 ^ var8 << -950404572) + var8);
                    var10 = var10 - var11;
                    var8 = var8 - (var9 + (var9 << -882383292 ^ var9 >>> -325817979) ^ param2[var10 & 3] + var10);
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
            stackOut_11_0 = (RuntimeException) (var5);
            stackOut_11_1 = new StringBuilder().append("lu.I(").append(param0).append(',').append(param1).append(',');
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
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
    }

    final int f(int param0) {
        int var2 = -7 % ((-1 - param0) / 48);
        this.field_g = this.field_g + 4;
        return (255 & this.field_h[this.field_g - 1]) + ((this.field_h[this.field_g + -2] & 255) << -1740695512) + (-16777216 & this.field_h[this.field_g - 4] << 1065783640) - -(16711680 & this.field_h[-3 + this.field_g] << 742625008);
    }

    final int e(byte param0) {
        if (param0 < 44) {
            lu.d((byte) 2);
        }
        this.field_g = this.field_g + 2;
        return ((this.field_h[-2 + this.field_g] & 255) << -368249720) - -(255 & this.field_h[this.field_g - 1]);
    }

    final void b(int param0, long param1) {
        int fieldTemp$0 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_h[fieldTemp$0] = (byte)(int)(param1 >> 1686281208);
        int fieldTemp$1 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_h[fieldTemp$1] = (byte)(int)(param1 >> 1884537776);
        int fieldTemp$2 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_h[fieldTemp$2] = (byte)(int)(param1 >> -707170008);
        int fieldTemp$3 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_h[fieldTemp$3] = (byte)(int)(param1 >> 1230910816);
        int fieldTemp$4 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_h[fieldTemp$4] = (byte)(int)(param1 >> -1274710760);
        int fieldTemp$5 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_h[fieldTemp$5] = (byte)(int)(param1 >> 150802640);
        int fieldTemp$6 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_h[fieldTemp$6] = (byte)(int)(param1 >> 1553183432);
        if (param0 != 1686281208) {
            return;
        }
        int fieldTemp$7 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_h[fieldTemp$7] = (byte)(int)param1;
    }

    final static String a(CharSequence param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var2 = uga.a(mp.a(param0, true), 120);
              if (var2 == null) {
                var2 = "";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 == 7995) {
                break L2;
              } else {
                lu.a(-44, 8, (byte) -11);
                break L2;
              }
            }
            stackOut_5_0 = (String) (var2);
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2_ref);
            stackOut_7_1 = new StringBuilder().append("lu.RA(");
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
          throw pe.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    final void b(int param0, boolean param1) {
        if (!param1) {
            field_f = (ee) null;
        }
        if ((param0 ^ -1) <= -1) {
            if (!(param0 >= 128)) {
                this.d(param0, 0);
                return;
            }
        }
        if (param0 >= 0) {
            if (!((param0 ^ -1) <= -32769)) {
                this.b(param0 + 32768, -126);
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    final String h(byte param0) {
        int fieldTemp$0 = this.field_g;
        this.field_g = this.field_g + 1;
        int var2 = this.field_h[fieldTemp$0];
        int var3 = 7 % ((58 - param0) / 61);
        if (!(var2 == 0)) {
            throw new IllegalStateException("");
        }
        int var4 = this.d(-1);
        if (!(this.field_h.length >= this.field_g + var4)) {
            throw new IllegalStateException("");
        }
        String var5 = ida.a(var4, this.field_h, this.field_g, 258048);
        this.field_g = this.field_g + var4;
        return var5;
    }

    final int c(byte param0) {
        this.field_g = this.field_g + 2;
        if (param0 != -85) {
            return -126;
        }
        int var2 = ((255 & this.field_h[this.field_g - 2]) << -225157560) + (this.field_h[this.field_g + -1] & 255);
        if (!(-32768 <= (var2 ^ -1))) {
            var2 = var2 - 65536;
        }
        return var2;
    }

    final void a(int[] param0, int param1) {
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
            var3_int = this.field_g / 8;
            this.field_g = 0;
            var4 = param1;
            L1: while (true) {
              if (var3_int <= var4) {
                break L0;
              } else {
                var5 = this.f(param1 ^ 92);
                var6 = this.f(param1 + 78);
                var7 = 0;
                var8 = -1640531527;
                var9 = 32;
                L2: while (true) {
                  incrementValue$5 = var9;
                  var9--;
                  if (0 >= incrementValue$5) {
                    this.field_g = this.field_g - 8;
                    this.e(var5, -1615464796);
                    this.e(var6, -1615464796);
                    var4++;
                    continue L1;
                  } else {
                    var5 = var5 + ((var6 >>> 387416133 ^ var6 << -761181852) - -var6 ^ param0[3 & var7] + var7);
                    var7 = var7 + var8;
                    var6 = var6 + (var7 - -param0[(7636 & var7) >>> -835055637] ^ var5 + (var5 >>> -1834900891 ^ var5 << -1549012412));
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
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("lu.GB(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    final String g(byte param0) {
        int var2 = 124 / ((param0 - -3) / 50);
        if (!(this.field_h[this.field_g] != 0)) {
            this.field_g = this.field_g + 1;
            return null;
        }
        return this.g(97);
    }

    final int d(int param0) {
        int fieldTemp$1 = 0;
        int var4 = BachelorFridge.field_y;
        int fieldTemp$0 = this.field_g;
        this.field_g = this.field_g + 1;
        int var2 = this.field_h[fieldTemp$0];
        int var3 = 0;
        while (var2 < 0) {
            var3 = (var3 | var2 & 127) << 212555559;
            fieldTemp$1 = this.field_g;
            this.field_g = this.field_g + 1;
            var2 = this.field_h[fieldTemp$1];
        }
        if (param0 != -1) {
            this.field_h = (byte[]) null;
        }
        return var2 | var3;
    }

    final boolean j(int param0) {
        this.field_g = this.field_g - param0;
        int var2 = mk.a(this.field_h, 0, -111, this.field_g);
        int var3 = this.f(49);
        if (var2 != var3) {
            return false;
        }
        return true;
    }

    final void a(int param0, boolean param1) {
        int fieldTemp$0 = 0;
        int var4 = BachelorFridge.field_y;
        if (param1) {
            this.field_g = -52;
        }
        while (this.field_g < param0) {
            fieldTemp$0 = this.field_g;
            this.field_g = this.field_g + 1;
            this.field_h[fieldTemp$0] = (byte) 0;
        }
    }

    final static void a(int param0, int param1, byte param2) {
        uha var6 = null;
        uha var7 = null;
        pf var4 = null;
        if (!(param0 == hja.field_i)) {
            var6 = (uha) ((Object) ola.field_g.a((long)hja.field_i, (byte) -87));
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
            field_f = (ee) null;
        }
        long var2 = 4294967295L & (long)this.f(78);
        long var4 = (long)this.f(-62) & 4294967295L;
        return (var2 << 112245600) + var4;
    }

    final void a(byte param0, int param1) {
        this.field_h[-param1 + (this.field_g - 2)] = (byte)(param1 >> -1262005208);
        this.field_h[-param1 + this.field_g - 1] = (byte)param1;
        if (param0 != -88) {
            this.field_g = 60;
        }
    }

    final void b(byte param0, int param1) {
        this.field_h[-1 + this.field_g + -param1] = (byte)param1;
        int var3 = -126 / ((26 - param0) / 50);
    }

    final static void a(int param0, kv param1, int param2, byte param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int[] param11, int param12, int[] param13, int param14, int param15, int param16) {
        RuntimeException var17 = null;
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
        int stackIn_70_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_132_0 = 0;
        int stackIn_142_0 = 0;
        int stackIn_147_0 = 0;
        int stackIn_185_0 = 0;
        int stackIn_191_0 = 0;
        int stackIn_200_0 = 0;
        int stackIn_206_0 = 0;
        int stackIn_241_0 = 0;
        int stackIn_246_0 = 0;
        int stackIn_255_0 = 0;
        int stackIn_262_0 = 0;
        RuntimeException stackIn_276_0 = null;
        StringBuilder stackIn_276_1 = null;
        RuntimeException stackIn_277_0 = null;
        StringBuilder stackIn_277_1 = null;
        RuntimeException stackIn_278_0 = null;
        StringBuilder stackIn_278_1 = null;
        String stackIn_278_2 = null;
        RuntimeException stackIn_279_0 = null;
        StringBuilder stackIn_279_1 = null;
        RuntimeException stackIn_280_0 = null;
        StringBuilder stackIn_280_1 = null;
        RuntimeException stackIn_281_0 = null;
        StringBuilder stackIn_281_1 = null;
        String stackIn_281_2 = null;
        RuntimeException stackIn_282_0 = null;
        StringBuilder stackIn_282_1 = null;
        RuntimeException stackIn_283_0 = null;
        StringBuilder stackIn_283_1 = null;
        RuntimeException stackIn_284_0 = null;
        StringBuilder stackIn_284_1 = null;
        String stackIn_284_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_240_0 = 0;
        int stackOut_239_0 = 0;
        int stackOut_245_0 = 0;
        int stackOut_244_0 = 0;
        int stackOut_254_0 = 0;
        int stackOut_253_0 = 0;
        int stackOut_261_0 = 0;
        int stackOut_260_0 = 0;
        int stackOut_184_0 = 0;
        int stackOut_183_0 = 0;
        int stackOut_190_0 = 0;
        int stackOut_189_0 = 0;
        int stackOut_199_0 = 0;
        int stackOut_198_0 = 0;
        int stackOut_205_0 = 0;
        int stackOut_204_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_130_0 = 0;
        int stackOut_141_0 = 0;
        int stackOut_140_0 = 0;
        int stackOut_146_0 = 0;
        int stackOut_145_0 = 0;
        RuntimeException stackOut_275_0 = null;
        StringBuilder stackOut_275_1 = null;
        RuntimeException stackOut_277_0 = null;
        StringBuilder stackOut_277_1 = null;
        String stackOut_277_2 = null;
        RuntimeException stackOut_276_0 = null;
        StringBuilder stackOut_276_1 = null;
        String stackOut_276_2 = null;
        RuntimeException stackOut_278_0 = null;
        StringBuilder stackOut_278_1 = null;
        RuntimeException stackOut_280_0 = null;
        StringBuilder stackOut_280_1 = null;
        String stackOut_280_2 = null;
        RuntimeException stackOut_279_0 = null;
        StringBuilder stackOut_279_1 = null;
        String stackOut_279_2 = null;
        RuntimeException stackOut_281_0 = null;
        StringBuilder stackOut_281_1 = null;
        RuntimeException stackOut_283_0 = null;
        StringBuilder stackOut_283_1 = null;
        String stackOut_283_2 = null;
        RuntimeException stackOut_282_0 = null;
        StringBuilder stackOut_282_1 = null;
        String stackOut_282_2 = null;
        var67 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (0 == param5) {
                break L1;
              } else {
                if (param15 == 0) {
                  break L1;
                } else {
                  var17_int = param1.field_q;
                  param10 = param10 - (param1.field_t << -1620198556);
                  param14 = param14 - (param1.field_u << 696320612);
                  var18 = param1.field_p;
                  var19 = 0.00009587379924285257 * (double)(param6 & 65535);
                  var21 = (int)Math.floor(0.5 + Math.sin(var19) * (double)param5);
                  var22 = (int)Math.floor(Math.cos(var19) * (double)param5 + 0.5);
                  var23 = (int)Math.floor(0.5 + (double)param15 * Math.sin(var19));
                  var24 = (int)Math.floor(0.5 + Math.cos(var19) * (double)param15);
                  var25 = var23 * -param14 + var22 * -param10;
                  var26 = var24 * -param14 + --param10 * var21;
                  var27 = var22 * (-param10 + (var17_int << -170090652)) + var23 * -param14;
                  var28 = var21 * -((var17_int << 638252356) - param10) - -(var24 * -param14);
                  var29 = ((var18 << -1902802140) + -param14) * var23 + -param10 * var22;
                  var30 = --param10 * var21 - -((-param14 + (var18 << 1991780964)) * var24);
                  if (param3 == -4) {
                    L2: {
                      var31 = var22 * (-param10 + (var17_int << -1615464796)) - -((-param14 + (var18 << 1492064484)) * var23);
                      var32 = -((var17_int << 2037875844) + -param10) * var21 - -(var24 * ((var18 << -970740380) - param14));
                      if (var27 <= var25) {
                        var33 = var27;
                        var34 = var25;
                        break L2;
                      } else {
                        var34 = var27;
                        var33 = var25;
                        break L2;
                      }
                    }
                    L3: {
                      if (var33 > var29) {
                        var33 = var29;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      if (var33 <= var31) {
                        break L4;
                      } else {
                        var33 = var31;
                        break L4;
                      }
                    }
                    L5: {
                      if (var34 >= var29) {
                        break L5;
                      } else {
                        var34 = var29;
                        break L5;
                      }
                    }
                    L6: {
                      if (var31 > var34) {
                        var34 = var31;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      if (var26 >= var28) {
                        var35 = var28;
                        var36 = var26;
                        break L7;
                      } else {
                        var36 = var28;
                        var35 = var26;
                        break L7;
                      }
                    }
                    L8: {
                      if (var35 <= var30) {
                        break L8;
                      } else {
                        var35 = var30;
                        break L8;
                      }
                    }
                    L9: {
                      if (var36 < var30) {
                        var36 = var30;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (var35 > var32) {
                        var35 = var32;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      var34 = var34 - -4095 >> -773987700;
                      if (var32 <= var36) {
                        break L11;
                      } else {
                        var36 = var32;
                        break L11;
                      }
                    }
                    L12: {
                      var33 = var33 >> 12;
                      var35 = var35 >> 12;
                      var34 = var34 + param8;
                      var35 = var35 + param12;
                      var36 = var36 - -4095 >> 2068936332;
                      var33 = var33 + param8;
                      var33 = var33 >> 4;
                      var35 = var35 >> 4;
                      var34 = 15 + var34 >> -1628432380;
                      var36 = var36 + param12;
                      if (dg.field_f <= var33) {
                        break L12;
                      } else {
                        var33 = dg.field_f;
                        break L12;
                      }
                    }
                    L13: {
                      if (var34 <= dg.field_h) {
                        break L13;
                      } else {
                        var34 = dg.field_h;
                        break L13;
                      }
                    }
                    L14: {
                      var36 = var36 - -15 >> 1895927108;
                      if (dg.field_j > var35) {
                        var35 = dg.field_j;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    L15: {
                      var34 = -var34 + var33;
                      if (var36 <= dg.field_k) {
                        break L15;
                      } else {
                        var36 = dg.field_k;
                        break L15;
                      }
                    }
                    if (var34 < 0) {
                      var36 = -var36 + var35;
                      if (-1 >= (var36 ^ -1)) {
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        L16: {
                          param4 = dg.field_i * var35 + var33;
                          param0 = var34 + dg.field_i;
                          var37 = 16777216.0 / (double)param5;
                          var21 = (int)Math.floor(Math.sin(var19) * var37 + 0.5);
                          var39 = 16777216.0 / (double)param15;
                          var22 = (int)Math.floor(0.5 + var37 * Math.cos(var19));
                          var23 = (int)Math.floor(0.5 + Math.sin(var19) * var39);
                          var24 = (int)Math.floor(var39 * Math.cos(var19) + 0.5);
                          var41 = -param8 + ((var33 << -1786589660) - -8);
                          var42 = -param12 + (var35 << 1124997540) - -8;
                          param7 = -(var21 * var42 >> -549220412) + (param10 << -493300088);
                          param16 = (param14 << -1783808760) + (var42 * var24 >> -246236220);
                          var43 = var41 * var22 >> 717568740;
                          var44 = var23 * var41 >> -1388004892;
                          var48 = var17_int << -1074366772;
                          var49 = var18 << 1660582124;
                          if (-1 < (var22 ^ -1)) {
                            if (0 > var23) {
                              var46 = var36;
                              L17: while (true) {
                                if (-1 == (var46 ^ -1)) {
                                  break L16;
                                } else {
                                  L18: {
                                    L19: {
                                      var51 = param16 + var44;
                                      var45 = var34;
                                      var50 = var43 + param7;
                                      var47 = -var48 + var50;
                                      if (-var48 + var50 < 0) {
                                        break L19;
                                      } else {
                                        if (var22 == 0) {
                                          param4 = param4 - var45;
                                          break L18;
                                        } else {
                                          var47 = (var22 - var47) / var22;
                                          var45 = var45 + var47;
                                          var50 = var50 + var22 * var47;
                                          param4 = param4 + var47;
                                          var51 = var51 + var23 * var47;
                                          break L19;
                                        }
                                      }
                                    }
                                    L20: {
                                      var47 = -var49 + var51;
                                      if (-var49 + var51 < 0) {
                                        break L20;
                                      } else {
                                        if (0 != var23) {
                                          var47 = (-var47 + var23) / var23;
                                          var51 = var51 + var23 * var47;
                                          var50 = var50 + var47 * var22;
                                          var45 = var45 + var47;
                                          param4 = param4 + var47;
                                          break L20;
                                        } else {
                                          param4 = param4 - var45;
                                          break L18;
                                        }
                                      }
                                    }
                                    L21: while (true) {
                                      L22: {
                                        if (var45 == 0) {
                                          break L22;
                                        } else {
                                          if ((var50 ^ -1) > 4095) {
                                            break L22;
                                          } else {
                                            if (4095 < (var51 ^ -1)) {
                                              break L22;
                                            } else {
                                              L23: {
                                                var53 = var51;
                                                var52 = var50;
                                                param2 = var50 >> 1820248396;
                                                param9 = var51 >> -1555639572;
                                                var53 = var53 & 4095;
                                                var52 = var52 & 4095;
                                                var62 = param9 * var17_int + param2;
                                                if (0 > param9) {
                                                  var55 = 0;
                                                  var58 = 0;
                                                  var59 = 0;
                                                  var54 = 0;
                                                  break L23;
                                                } else {
                                                  L24: {
                                                    if (var17_int + -1 > param2) {
                                                      L25: {
                                                        var55 = param13[var62 + 1];
                                                        if (0 != var55) {
                                                          stackOut_240_0 = (-var53 + 4096) * var52;
                                                          stackIn_241_0 = stackOut_240_0;
                                                          break L25;
                                                        } else {
                                                          stackOut_239_0 = 0;
                                                          stackIn_241_0 = stackOut_239_0;
                                                          break L25;
                                                        }
                                                      }
                                                      var59 = stackIn_241_0;
                                                      break L24;
                                                    } else {
                                                      var59 = 0;
                                                      var55 = 0;
                                                      break L24;
                                                    }
                                                  }
                                                  if (-1 < (param2 ^ -1)) {
                                                    var58 = 0;
                                                    var54 = 0;
                                                    break L23;
                                                  } else {
                                                    L26: {
                                                      var54 = param13[var62];
                                                      if (var54 != 0) {
                                                        stackOut_245_0 = (-var52 + 4096) * (-var53 + 4096);
                                                        stackIn_246_0 = stackOut_245_0;
                                                        break L26;
                                                      } else {
                                                        stackOut_244_0 = 0;
                                                        stackIn_246_0 = stackOut_244_0;
                                                        break L26;
                                                      }
                                                    }
                                                    var58 = stackIn_246_0;
                                                    break L23;
                                                  }
                                                }
                                              }
                                              L27: {
                                                if (param9 < -1 + var18) {
                                                  L28: {
                                                    if (0 > param2) {
                                                      var60 = 0;
                                                      var56 = 0;
                                                      break L28;
                                                    } else {
                                                      L29: {
                                                        var56 = param13[var62 - -var17_int];
                                                        if (0 != var56) {
                                                          stackOut_254_0 = (-var52 + 4096) * var53;
                                                          stackIn_255_0 = stackOut_254_0;
                                                          break L29;
                                                        } else {
                                                          stackOut_253_0 = 0;
                                                          stackIn_255_0 = stackOut_253_0;
                                                          break L29;
                                                        }
                                                      }
                                                      var60 = stackIn_255_0;
                                                      break L28;
                                                    }
                                                  }
                                                  if (param2 < -1 + var17_int) {
                                                    L30: {
                                                      var57 = param13[1 + (var17_int + var62)];
                                                      if (-1 != (var57 ^ -1)) {
                                                        stackOut_261_0 = var52 * var53;
                                                        stackIn_262_0 = stackOut_261_0;
                                                        break L30;
                                                      } else {
                                                        stackOut_260_0 = 0;
                                                        stackIn_262_0 = stackOut_260_0;
                                                        break L30;
                                                      }
                                                    }
                                                    var61 = stackIn_262_0;
                                                    break L27;
                                                  } else {
                                                    var57 = 0;
                                                    var61 = 0;
                                                    break L27;
                                                  }
                                                } else {
                                                  var57 = 0;
                                                  var61 = 0;
                                                  var60 = 0;
                                                  var56 = 0;
                                                  break L27;
                                                }
                                              }
                                              L31: {
                                                var58 = var58 >> 16;
                                                var61 = var61 >> 16;
                                                var59 = var59 >> 16;
                                                var60 = var60 >> 16;
                                                var66 = var58 - -var59 + var60 - -var61;
                                                if (var66 < 256) {
                                                  if ((var66 ^ -1) > -129) {
                                                    break L31;
                                                  } else {
                                                    L32: {
                                                      var63 = (16711935 & var54) * var58 - -(var59 * (var55 & 16711935));
                                                      var64 = var58 * (var54 & 65280) + var59 * (65280 & var55);
                                                      var63 = var63 + (var61 * (var57 & 16711935) + var60 * (16711935 & var56));
                                                      var64 = var64 + (var60 * (65280 & var56) - -((65280 & var57) * var61));
                                                      var65 = (65535 & var63) / var66 + ((var63 >>> 216592272) / var66 << 812293296) + (var64 / var66 & 65280);
                                                      if (var65 != 0) {
                                                        break L32;
                                                      } else {
                                                        var65 = 1;
                                                        break L32;
                                                      }
                                                    }
                                                    param11[param4] = var65;
                                                    break L31;
                                                  }
                                                } else {
                                                  L33: {
                                                    var63 = (16711935 & var54) * var58 - -(var59 * (var55 & 16711935));
                                                    var64 = var59 * (65280 & var55) + (65280 & var54) * var58;
                                                    var63 = var63 + ((16711935 & var57) * var61 + (var56 & 16711935) * var60);
                                                    var64 = var64 + ((65280 & var57) * var61 + var60 * (var56 & 65280));
                                                    var65 = (-419495681 & var63 >>> 1429564552) + ((var64 & 16711716) >>> -2046936984);
                                                    if (var65 != 0) {
                                                      break L33;
                                                    } else {
                                                      var65 = 1;
                                                      break L33;
                                                    }
                                                  }
                                                  param11[param4] = var65;
                                                  break L31;
                                                }
                                              }
                                              var45++;
                                              param4++;
                                              var51 = var51 + var23;
                                              var50 = var50 + var22;
                                              continue L21;
                                            }
                                          }
                                        }
                                      }
                                      param4 = param4 - var45;
                                      break L18;
                                    }
                                  }
                                  param4 = param4 + param0;
                                  var46++;
                                  param7 = param7 - var21;
                                  param16 = param16 + var24;
                                  continue L17;
                                }
                              }
                            } else {
                              var46 = var36;
                              L34: while (true) {
                                if (0 == var46) {
                                  break L16;
                                } else {
                                  L35: {
                                    L36: {
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
                                          break L36;
                                        } else {
                                          param4 = param4 - var45;
                                          break L35;
                                        }
                                      } else {
                                        break L36;
                                      }
                                    }
                                    L37: {
                                      var47 = var51 - -4096;
                                      if (0 > var51 - -4096) {
                                        if (0 != var23) {
                                          var47 = (-1 + (var23 + -var47)) / var23;
                                          var51 = var51 + var47 * var23;
                                          var45 = var45 + var47;
                                          param4 = param4 + var47;
                                          var50 = var50 + var22 * var47;
                                          break L37;
                                        } else {
                                          param4 = param4 - var45;
                                          break L35;
                                        }
                                      } else {
                                        break L37;
                                      }
                                    }
                                    L38: while (true) {
                                      L39: {
                                        if (var45 == 0) {
                                          break L39;
                                        } else {
                                          if (4095 < (var50 ^ -1)) {
                                            break L39;
                                          } else {
                                            param9 = var51 >> 208689804;
                                            if (var18 > var51 >> 208689804) {
                                              L40: {
                                                var52 = var50;
                                                param2 = var50 >> -606741172;
                                                var53 = var51;
                                                var52 = var52 & 4095;
                                                var62 = param2 + var17_int * param9;
                                                var53 = var53 & 4095;
                                                if (-1 + var18 <= param9) {
                                                  var57 = 0;
                                                  var56 = 0;
                                                  var60 = 0;
                                                  var61 = 0;
                                                  break L40;
                                                } else {
                                                  L41: {
                                                    if (var17_int - 1 <= param2) {
                                                      var61 = 0;
                                                      var57 = 0;
                                                      break L41;
                                                    } else {
                                                      L42: {
                                                        var57 = param13[1 + var17_int + var62];
                                                        if (var57 == 0) {
                                                          stackOut_184_0 = 0;
                                                          stackIn_185_0 = stackOut_184_0;
                                                          break L42;
                                                        } else {
                                                          stackOut_183_0 = var52 * var53;
                                                          stackIn_185_0 = stackOut_183_0;
                                                          break L42;
                                                        }
                                                      }
                                                      var61 = stackIn_185_0;
                                                      break L41;
                                                    }
                                                  }
                                                  if (0 > param2) {
                                                    var60 = 0;
                                                    var56 = 0;
                                                    break L40;
                                                  } else {
                                                    L43: {
                                                      var56 = param13[var62 - -var17_int];
                                                      if (var56 != 0) {
                                                        stackOut_190_0 = var53 * (-var52 + 4096);
                                                        stackIn_191_0 = stackOut_190_0;
                                                        break L43;
                                                      } else {
                                                        stackOut_189_0 = 0;
                                                        stackIn_191_0 = stackOut_189_0;
                                                        break L43;
                                                      }
                                                    }
                                                    var60 = stackIn_191_0;
                                                    break L40;
                                                  }
                                                }
                                              }
                                              L44: {
                                                if (0 > param9) {
                                                  var54 = 0;
                                                  var58 = 0;
                                                  var59 = 0;
                                                  var55 = 0;
                                                  break L44;
                                                } else {
                                                  L45: {
                                                    if ((param2 ^ -1) <= -1) {
                                                      L46: {
                                                        var54 = param13[var62];
                                                        if (var54 == 0) {
                                                          stackOut_199_0 = 0;
                                                          stackIn_200_0 = stackOut_199_0;
                                                          break L46;
                                                        } else {
                                                          stackOut_198_0 = (-var52 + 4096) * (4096 + -var53);
                                                          stackIn_200_0 = stackOut_198_0;
                                                          break L46;
                                                        }
                                                      }
                                                      var58 = stackIn_200_0;
                                                      break L45;
                                                    } else {
                                                      var58 = 0;
                                                      var54 = 0;
                                                      break L45;
                                                    }
                                                  }
                                                  if (param2 < -1 + var17_int) {
                                                    L47: {
                                                      var55 = param13[1 + var62];
                                                      if (var55 == 0) {
                                                        stackOut_205_0 = 0;
                                                        stackIn_206_0 = stackOut_205_0;
                                                        break L47;
                                                      } else {
                                                        stackOut_204_0 = (4096 - var53) * var52;
                                                        stackIn_206_0 = stackOut_204_0;
                                                        break L47;
                                                      }
                                                    }
                                                    var59 = stackIn_206_0;
                                                    break L44;
                                                  } else {
                                                    var55 = 0;
                                                    var59 = 0;
                                                    break L44;
                                                  }
                                                }
                                              }
                                              L48: {
                                                var58 = var58 >> 16;
                                                var59 = var59 >> 16;
                                                var61 = var61 >> 16;
                                                var60 = var60 >> 16;
                                                var66 = var60 + var58 + (var59 - -var61);
                                                if ((var66 ^ -1) > -257) {
                                                  if ((var66 ^ -1) <= -129) {
                                                    L49: {
                                                      var63 = var58 * (var54 & 16711935) + (16711935 & var55) * var59;
                                                      var63 = var63 + ((16711935 & var57) * var61 + var60 * (var56 & 16711935));
                                                      var64 = var58 * (var54 & 65280) + var59 * (var55 & 65280);
                                                      var64 = var64 + ((var57 & 65280) * var61 + (65280 & var56) * var60);
                                                      var65 = (65280 & var64 / var66) + ((var63 >>> 1899378096) / var66 << -901895120) + (var63 & 65535) / var66;
                                                      if (var65 == 0) {
                                                        var65 = 1;
                                                        break L49;
                                                      } else {
                                                        break L49;
                                                      }
                                                    }
                                                    param11[param4] = var65;
                                                    break L48;
                                                  } else {
                                                    break L48;
                                                  }
                                                } else {
                                                  L50: {
                                                    var63 = (16711935 & var55) * var59 + (var54 & 16711935) * var58;
                                                    var63 = var63 + (var61 * (var57 & 16711935) + (var56 & 16711935) * var60);
                                                    var64 = (var55 & 65280) * var59 + (var54 & 65280) * var58;
                                                    var64 = var64 + ((65280 & var57) * var61 + (65280 & var56) * var60);
                                                    var65 = (var63 >>> -346129880 & 956236031) + ((var64 & 16711808) >>> 1429626504);
                                                    if (0 != var65) {
                                                      break L50;
                                                    } else {
                                                      var65 = 1;
                                                      break L50;
                                                    }
                                                  }
                                                  param11[param4] = var65;
                                                  break L48;
                                                }
                                              }
                                              var51 = var51 + var23;
                                              param4++;
                                              var50 = var50 + var22;
                                              var45++;
                                              continue L38;
                                            } else {
                                              break L39;
                                            }
                                          }
                                        }
                                      }
                                      param4 = param4 - var45;
                                      break L35;
                                    }
                                  }
                                  var46++;
                                  param16 = param16 + var24;
                                  param7 = param7 - var21;
                                  param4 = param4 + param0;
                                  continue L34;
                                }
                              }
                            }
                          } else {
                            L51: {
                              if (var21 >= 0) {
                                break L51;
                              } else {
                                if (-1 >= (var23 ^ -1)) {
                                  break L51;
                                } else {
                                  var46 = var36;
                                  L52: while (true) {
                                    if (var46 == 0) {
                                      break L16;
                                    } else {
                                      L53: {
                                        L54: {
                                          var50 = var43 + param7;
                                          var51 = var44 + param16;
                                          var45 = var34;
                                          var47 = var50 - -4096;
                                          if (-1 >= (var50 - -4096 ^ -1)) {
                                            break L54;
                                          } else {
                                            if (-1 != (var22 ^ -1)) {
                                              var47 = (var22 + (-1 - var47)) / var22;
                                              var51 = var51 + var23 * var47;
                                              var50 = var50 + var22 * var47;
                                              param4 = param4 + var47;
                                              var45 = var45 + var47;
                                              break L54;
                                            } else {
                                              param4 = param4 - var45;
                                              break L53;
                                            }
                                          }
                                        }
                                        L55: {
                                          var47 = -var49 + var51;
                                          if (-var49 + var51 < 0) {
                                            break L55;
                                          } else {
                                            if (var23 == 0) {
                                              param4 = param4 - var45;
                                              break L53;
                                            } else {
                                              var47 = (-var47 + var23) / var23;
                                              param4 = param4 + var47;
                                              var51 = var51 + var23 * var47;
                                              var50 = var50 + var22 * var47;
                                              var45 = var45 + var47;
                                              break L55;
                                            }
                                          }
                                        }
                                        L56: while (true) {
                                          L57: {
                                            if (var45 == 0) {
                                              break L57;
                                            } else {
                                              if ((var51 ^ -1) > 4095) {
                                                break L57;
                                              } else {
                                                param2 = var50 >> -882658548;
                                                if (var17_int <= var50 >> -882658548) {
                                                  break L57;
                                                } else {
                                                  L58: {
                                                    var52 = var50;
                                                    var53 = var51;
                                                    param9 = var51 >> 879466668;
                                                    var52 = var52 & 4095;
                                                    var53 = var53 & 4095;
                                                    var62 = var17_int * param9 - -param2;
                                                    if (param9 >= -1 + var18) {
                                                      var60 = 0;
                                                      var61 = 0;
                                                      var56 = 0;
                                                      var57 = 0;
                                                      break L58;
                                                    } else {
                                                      L59: {
                                                        if (param2 < -1 + var17_int) {
                                                          L60: {
                                                            var57 = param13[var17_int + var62 + 1];
                                                            if (0 != var57) {
                                                              stackOut_69_0 = var52 * var53;
                                                              stackIn_70_0 = stackOut_69_0;
                                                              break L60;
                                                            } else {
                                                              stackOut_68_0 = 0;
                                                              stackIn_70_0 = stackOut_68_0;
                                                              break L60;
                                                            }
                                                          }
                                                          var61 = stackIn_70_0;
                                                          break L59;
                                                        } else {
                                                          var61 = 0;
                                                          var57 = 0;
                                                          break L59;
                                                        }
                                                      }
                                                      if (0 > param2) {
                                                        var56 = 0;
                                                        var60 = 0;
                                                        break L58;
                                                      } else {
                                                        L61: {
                                                          var56 = param13[var62 + var17_int];
                                                          if (var56 != 0) {
                                                            stackOut_74_0 = var53 * (4096 - var52);
                                                            stackIn_75_0 = stackOut_74_0;
                                                            break L61;
                                                          } else {
                                                            stackOut_73_0 = 0;
                                                            stackIn_75_0 = stackOut_73_0;
                                                            break L61;
                                                          }
                                                        }
                                                        var60 = stackIn_75_0;
                                                        break L58;
                                                      }
                                                    }
                                                  }
                                                  L62: {
                                                    if (-1 < (param9 ^ -1)) {
                                                      var55 = 0;
                                                      var58 = 0;
                                                      var54 = 0;
                                                      var59 = 0;
                                                      break L62;
                                                    } else {
                                                      L63: {
                                                        if (-1 >= (param2 ^ -1)) {
                                                          L64: {
                                                            var54 = param13[var62];
                                                            if (var54 != 0) {
                                                              stackOut_83_0 = (4096 + -var52) * (4096 + -var53);
                                                              stackIn_84_0 = stackOut_83_0;
                                                              break L64;
                                                            } else {
                                                              stackOut_82_0 = 0;
                                                              stackIn_84_0 = stackOut_82_0;
                                                              break L64;
                                                            }
                                                          }
                                                          var58 = stackIn_84_0;
                                                          break L63;
                                                        } else {
                                                          var54 = 0;
                                                          var58 = 0;
                                                          break L63;
                                                        }
                                                      }
                                                      if (param2 >= -1 + var17_int) {
                                                        var55 = 0;
                                                        var59 = 0;
                                                        break L62;
                                                      } else {
                                                        L65: {
                                                          var55 = param13[1 + var62];
                                                          if (var55 == 0) {
                                                            stackOut_88_0 = 0;
                                                            stackIn_89_0 = stackOut_88_0;
                                                            break L65;
                                                          } else {
                                                            stackOut_87_0 = (4096 + -var53) * var52;
                                                            stackIn_89_0 = stackOut_87_0;
                                                            break L65;
                                                          }
                                                        }
                                                        var59 = stackIn_89_0;
                                                        break L62;
                                                      }
                                                    }
                                                  }
                                                  L66: {
                                                    var61 = var61 >> 16;
                                                    var60 = var60 >> 16;
                                                    var58 = var58 >> 16;
                                                    var59 = var59 >> 16;
                                                    var66 = var61 + var59 + (var58 - -var60);
                                                    if (-257 < (var66 ^ -1)) {
                                                      if (var66 < 128) {
                                                        break L66;
                                                      } else {
                                                        L67: {
                                                          var63 = var58 * (16711935 & var54) - -(var59 * (var55 & 16711935));
                                                          var63 = var63 + ((16711935 & var57) * var61 + var60 * (var56 & 16711935));
                                                          var64 = (65280 & var55) * var59 + var58 * (65280 & var54);
                                                          var64 = var64 + (var60 * (65280 & var56) - -((65280 & var57) * var61));
                                                          var65 = (var63 & 65535) / var66 + (var64 / var66 & 65280) + ((var63 >>> 1501223504) / var66 << 682560944);
                                                          if (-1 != (var65 ^ -1)) {
                                                            break L67;
                                                          } else {
                                                            var65 = 1;
                                                            break L67;
                                                          }
                                                        }
                                                        param11[param4] = var65;
                                                        break L66;
                                                      }
                                                    } else {
                                                      L68: {
                                                        var63 = (var55 & 16711935) * var59 + (16711935 & var54) * var58;
                                                        var64 = var58 * (65280 & var54) + var59 * (var55 & 65280);
                                                        var63 = var63 + ((16711935 & var56) * var60 - -((16711935 & var57) * var61));
                                                        var64 = var64 + (var60 * (var56 & 65280) + var61 * (var57 & 65280));
                                                        var65 = ((16711735 & var64) >>> 615566472) + ((var63 & -16711692) >>> 1359723400);
                                                        if (-1 == (var65 ^ -1)) {
                                                          var65 = 1;
                                                          break L68;
                                                        } else {
                                                          break L68;
                                                        }
                                                      }
                                                      param11[param4] = var65;
                                                      break L66;
                                                    }
                                                  }
                                                  var50 = var50 + var22;
                                                  param4++;
                                                  var51 = var51 + var23;
                                                  var45++;
                                                  continue L56;
                                                }
                                              }
                                            }
                                          }
                                          param4 = param4 - var45;
                                          break L53;
                                        }
                                      }
                                      var46++;
                                      param4 = param4 + param0;
                                      param7 = param7 - var21;
                                      param16 = param16 + var24;
                                      continue L52;
                                    }
                                  }
                                }
                              }
                            }
                            var46 = var36;
                            L69: while (true) {
                              if (var46 == 0) {
                                break L16;
                              } else {
                                L70: {
                                  L71: {
                                    var45 = var34;
                                    var51 = var44 + param16;
                                    var50 = var43 + param7;
                                    var47 = var50 + 4096;
                                    if (var50 + 4096 < 0) {
                                      if (var22 == 0) {
                                        param4 = param4 - var45;
                                        break L70;
                                      } else {
                                        var47 = (-1 + (var22 - var47)) / var22;
                                        var45 = var45 + var47;
                                        var50 = var50 + var47 * var22;
                                        var51 = var51 + var23 * var47;
                                        param4 = param4 + var47;
                                        break L71;
                                      }
                                    } else {
                                      break L71;
                                    }
                                  }
                                  L72: {
                                    var47 = var51 + 4096;
                                    if (0 > var51 + 4096) {
                                      if (var23 == 0) {
                                        param4 = param4 - var45;
                                        break L70;
                                      } else {
                                        var47 = (var23 + (-1 + -var47)) / var23;
                                        var45 = var45 + var47;
                                        param4 = param4 + var47;
                                        var50 = var50 + var22 * var47;
                                        var51 = var51 + var23 * var47;
                                        break L72;
                                      }
                                    } else {
                                      break L72;
                                    }
                                  }
                                  L73: while (true) {
                                    L74: {
                                      if (0 == var45) {
                                        break L74;
                                      } else {
                                        param2 = var50 >> 1466910124;
                                        if (var50 >> 1466910124 >= var17_int) {
                                          break L74;
                                        } else {
                                          param9 = var51 >> 1992710028;
                                          if (var18 <= var51 >> 1992710028) {
                                            break L74;
                                          } else {
                                            L75: {
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
                                                break L75;
                                              } else {
                                                L76: {
                                                  if (param2 >= var17_int + -1) {
                                                    var55 = 0;
                                                    var59 = 0;
                                                    break L76;
                                                  } else {
                                                    L77: {
                                                      var55 = param13[1 + var62];
                                                      if (-1 == (var55 ^ -1)) {
                                                        stackOut_125_0 = 0;
                                                        stackIn_126_0 = stackOut_125_0;
                                                        break L77;
                                                      } else {
                                                        stackOut_124_0 = (-var53 + 4096) * var52;
                                                        stackIn_126_0 = stackOut_124_0;
                                                        break L77;
                                                      }
                                                    }
                                                    var59 = stackIn_126_0;
                                                    break L76;
                                                  }
                                                }
                                                if (-1 < (param2 ^ -1)) {
                                                  var58 = 0;
                                                  var54 = 0;
                                                  break L75;
                                                } else {
                                                  L78: {
                                                    var54 = param13[var62];
                                                    if (var54 == 0) {
                                                      stackOut_131_0 = 0;
                                                      stackIn_132_0 = stackOut_131_0;
                                                      break L78;
                                                    } else {
                                                      stackOut_130_0 = (-var52 + 4096) * (4096 + -var53);
                                                      stackIn_132_0 = stackOut_130_0;
                                                      break L78;
                                                    }
                                                  }
                                                  var58 = stackIn_132_0;
                                                  break L75;
                                                }
                                              }
                                            }
                                            L79: {
                                              if (param9 < var18 - 1) {
                                                L80: {
                                                  if (0 <= param2) {
                                                    L81: {
                                                      var56 = param13[var62 + var17_int];
                                                      if (var56 == 0) {
                                                        stackOut_141_0 = 0;
                                                        stackIn_142_0 = stackOut_141_0;
                                                        break L81;
                                                      } else {
                                                        stackOut_140_0 = var53 * (-var52 + 4096);
                                                        stackIn_142_0 = stackOut_140_0;
                                                        break L81;
                                                      }
                                                    }
                                                    var60 = stackIn_142_0;
                                                    break L80;
                                                  } else {
                                                    var56 = 0;
                                                    var60 = 0;
                                                    break L80;
                                                  }
                                                }
                                                if (param2 >= -1 + var17_int) {
                                                  var57 = 0;
                                                  var61 = 0;
                                                  break L79;
                                                } else {
                                                  L82: {
                                                    var57 = param13[1 + var62 + var17_int];
                                                    if (var57 == 0) {
                                                      stackOut_146_0 = 0;
                                                      stackIn_147_0 = stackOut_146_0;
                                                      break L82;
                                                    } else {
                                                      stackOut_145_0 = var52 * var53;
                                                      stackIn_147_0 = stackOut_145_0;
                                                      break L82;
                                                    }
                                                  }
                                                  var61 = stackIn_147_0;
                                                  break L79;
                                                }
                                              } else {
                                                var56 = 0;
                                                var57 = 0;
                                                var60 = 0;
                                                var61 = 0;
                                                break L79;
                                              }
                                            }
                                            L83: {
                                              var58 = var58 >> 16;
                                              var61 = var61 >> 16;
                                              var60 = var60 >> 16;
                                              var59 = var59 >> 16;
                                              var66 = var61 + (var60 + var59 + var58);
                                              if (256 <= var66) {
                                                L84: {
                                                  var63 = (16711935 & var55) * var59 + (16711935 & var54) * var58;
                                                  var64 = (65280 & var55) * var59 + var58 * (65280 & var54);
                                                  var63 = var63 + ((var57 & 16711935) * var61 + (16711935 & var56) * var60);
                                                  var64 = var64 + (var61 * (65280 & var57) + var60 * (var56 & 65280));
                                                  var65 = (989790463 & var63 >>> -43798328) - -((16711850 & var64) >>> -110921272);
                                                  if (0 == var65) {
                                                    var65 = 1;
                                                    break L84;
                                                  } else {
                                                    break L84;
                                                  }
                                                }
                                                param11[param4] = var65;
                                                break L83;
                                              } else {
                                                if (128 <= var66) {
                                                  L85: {
                                                    var63 = (var54 & 16711935) * var58 + (16711935 & var55) * var59;
                                                    var63 = var63 + (var61 * (var57 & 16711935) + (var56 & 16711935) * var60);
                                                    var64 = var59 * (var55 & 65280) + var58 * (var54 & 65280);
                                                    var64 = var64 + (var61 * (var57 & 65280) + (65280 & var56) * var60);
                                                    var65 = (65535 & var63) / var66 + ((var63 >>> 1283879824) / var66 << -1028723952) + (65280 & var64 / var66);
                                                    if (var65 == 0) {
                                                      var65 = 1;
                                                      break L85;
                                                    } else {
                                                      break L85;
                                                    }
                                                  }
                                                  param11[param4] = var65;
                                                  break L83;
                                                } else {
                                                  break L83;
                                                }
                                              }
                                            }
                                            var50 = var50 + var22;
                                            param4++;
                                            var45++;
                                            var51 = var51 + var23;
                                            continue L73;
                                          }
                                        }
                                      }
                                    }
                                    param4 = param4 - var45;
                                    break L70;
                                  }
                                }
                                param4 = param4 + param0;
                                var46++;
                                param16 = param16 + var24;
                                param7 = param7 - var21;
                                continue L69;
                              }
                            }
                          }
                        }
                        decompiledRegionSelector0 = 4;
                        break L0;
                      }
                    } else {
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L86: {
            var17 = decompiledCaughtException;
            stackOut_275_0 = (RuntimeException) (var17);
            stackOut_275_1 = new StringBuilder().append("lu.T(").append(param0).append(',');
            stackIn_277_0 = stackOut_275_0;
            stackIn_277_1 = stackOut_275_1;
            stackIn_276_0 = stackOut_275_0;
            stackIn_276_1 = stackOut_275_1;
            if (param1 == null) {
              stackOut_277_0 = (RuntimeException) ((Object) stackIn_277_0);
              stackOut_277_1 = (StringBuilder) ((Object) stackIn_277_1);
              stackOut_277_2 = "null";
              stackIn_278_0 = stackOut_277_0;
              stackIn_278_1 = stackOut_277_1;
              stackIn_278_2 = stackOut_277_2;
              break L86;
            } else {
              stackOut_276_0 = (RuntimeException) ((Object) stackIn_276_0);
              stackOut_276_1 = (StringBuilder) ((Object) stackIn_276_1);
              stackOut_276_2 = "{...}";
              stackIn_278_0 = stackOut_276_0;
              stackIn_278_1 = stackOut_276_1;
              stackIn_278_2 = stackOut_276_2;
              break L86;
            }
          }
          L87: {
            stackOut_278_0 = (RuntimeException) ((Object) stackIn_278_0);
            stackOut_278_1 = ((StringBuilder) (Object) stackIn_278_1).append(stackIn_278_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
            stackIn_280_0 = stackOut_278_0;
            stackIn_280_1 = stackOut_278_1;
            stackIn_279_0 = stackOut_278_0;
            stackIn_279_1 = stackOut_278_1;
            if (param11 == null) {
              stackOut_280_0 = (RuntimeException) ((Object) stackIn_280_0);
              stackOut_280_1 = (StringBuilder) ((Object) stackIn_280_1);
              stackOut_280_2 = "null";
              stackIn_281_0 = stackOut_280_0;
              stackIn_281_1 = stackOut_280_1;
              stackIn_281_2 = stackOut_280_2;
              break L87;
            } else {
              stackOut_279_0 = (RuntimeException) ((Object) stackIn_279_0);
              stackOut_279_1 = (StringBuilder) ((Object) stackIn_279_1);
              stackOut_279_2 = "{...}";
              stackIn_281_0 = stackOut_279_0;
              stackIn_281_1 = stackOut_279_1;
              stackIn_281_2 = stackOut_279_2;
              break L87;
            }
          }
          L88: {
            stackOut_281_0 = (RuntimeException) ((Object) stackIn_281_0);
            stackOut_281_1 = ((StringBuilder) (Object) stackIn_281_1).append(stackIn_281_2).append(',').append(param12).append(',');
            stackIn_283_0 = stackOut_281_0;
            stackIn_283_1 = stackOut_281_1;
            stackIn_282_0 = stackOut_281_0;
            stackIn_282_1 = stackOut_281_1;
            if (param13 == null) {
              stackOut_283_0 = (RuntimeException) ((Object) stackIn_283_0);
              stackOut_283_1 = (StringBuilder) ((Object) stackIn_283_1);
              stackOut_283_2 = "null";
              stackIn_284_0 = stackOut_283_0;
              stackIn_284_1 = stackOut_283_1;
              stackIn_284_2 = stackOut_283_2;
              break L88;
            } else {
              stackOut_282_0 = (RuntimeException) ((Object) stackIn_282_0);
              stackOut_282_1 = (StringBuilder) ((Object) stackIn_282_1);
              stackOut_282_2 = "{...}";
              stackIn_284_0 = stackOut_282_0;
              stackIn_284_1 = stackOut_282_1;
              stackIn_284_2 = stackOut_282_2;
              break L88;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_284_0), stackIn_284_2 + ',' + param14 + ',' + param15 + ',' + param16 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final void a(int param0, long param1) {
        if (param0 != 4096) {
            this.field_h = (byte[]) null;
        }
        int fieldTemp$0 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_h[fieldTemp$0] = (byte)(int)(param1 >> -396794016);
        int fieldTemp$1 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_h[fieldTemp$1] = (byte)(int)(param1 >> 1740107928);
        int fieldTemp$2 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_h[fieldTemp$2] = (byte)(int)(param1 >> 491115984);
        int fieldTemp$3 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_h[fieldTemp$3] = (byte)(int)(param1 >> -452777080);
        int fieldTemp$4 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_h[fieldTemp$4] = (byte)(int)param1;
    }

    final int a(int param0) {
        this.field_g = this.field_g + param0;
        return (this.field_h[this.field_g - 3] << -181834288 & 16711680) - (-(this.field_h[-2 + this.field_g] << -1551858488 & 65280) + -(255 & this.field_h[this.field_g - 1]));
    }

    final void b(int param0, int param1) {
        if (param1 >= -110) {
            return;
        }
        int fieldTemp$0 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_h[fieldTemp$0] = (byte)(param0 >> -1219719416);
        int fieldTemp$1 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_h[fieldTemp$1] = (byte)param0;
    }

    final void a(int param0, int param1, int param2, byte[] param3) {
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
                fieldTemp$2 = this.field_g;
                this.field_g = this.field_g + 1;
                this.field_h[fieldTemp$2] = param3[var5_int];
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
            stackOut_7_1 = new StringBuilder().append("lu.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
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
          throw pe.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    public static void d(byte param0) {
        field_f = null;
        if (param0 != -19) {
            lu.d((byte) -30);
        }
    }

    private final void a(long param0, int param1) {
        int fieldTemp$0 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_h[fieldTemp$0] = (byte)(int)(param0 >> -360425616);
        int fieldTemp$1 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_h[fieldTemp$1] = (byte)(int)(param0 >> 477344680);
        int fieldTemp$2 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_h[fieldTemp$2] = (byte)(int)(param0 >> -1236150816);
        int fieldTemp$3 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_h[fieldTemp$3] = (byte)(int)(param0 >> -2029614760);
        int fieldTemp$4 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_h[fieldTemp$4] = (byte)(int)(param0 >> 783602704);
        int fieldTemp$5 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_h[fieldTemp$5] = (byte)(int)(param0 >> 493647752);
        int fieldTemp$6 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_h[fieldTemp$6] = (byte)(int)param0;
        if (param1 != 10847) {
            this.field_h = (byte[]) null;
        }
    }

    lu(int param0) {
        this.field_g = 0;
        this.field_h = sd.a(param0, 5000);
    }

    final void a(String param0, int param1) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        if (param1 <= 63) {
            return;
        }
        try {
            var3_int = param0.indexOf(' ');
            if (var3_int >= 0) {
                throw new IllegalArgumentException("");
            }
            fieldTemp$0 = this.field_g;
            this.field_g = this.field_g + 1;
            this.field_h[fieldTemp$0] = (byte) 0;
            var4 = (CharSequence) ((Object) param0);
            this.field_g = this.field_g + jm.a(param0.length(), -113, this.field_g, var4, this.field_h, 0);
            fieldTemp$1 = this.field_g;
            this.field_g = this.field_g + 1;
            this.field_h[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "lu.Q(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final byte b(boolean param0) {
        if (!param0) {
            return (byte) -48;
        }
        int fieldTemp$0 = this.field_g;
        this.field_g = this.field_g + 1;
        return this.field_h[fieldTemp$0];
    }

    final void a(byte[] param0, int param1, int param2, int param3) {
        byte discarded$9 = 0;
        int fieldTemp$10 = 0;
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
                discarded$9 = this.b(false);
                break L1;
              }
            }
            var5_int = param3;
            L2: while (true) {
              if (param3 + param1 <= var5_int) {
                break L0;
              } else {
                fieldTemp$10 = this.field_g;
                this.field_g = this.field_g + 1;
                param0[var5_int] = this.field_h[fieldTemp$10];
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
            stackOut_7_1 = new StringBuilder().append("lu.EA(");
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
          throw pe.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void b(int param0, byte param1) {
        this.field_h[-4 + this.field_g - param0] = (byte)(param0 >> 1652238136);
        this.field_h[this.field_g - (param0 + 3)] = (byte)(param0 >> 1505090928);
        this.field_h[this.field_g - param0 + -2] = (byte)(param0 >> -406565048);
        int var3 = -22 / ((-33 - param1) / 54);
        this.field_h[-1 + (this.field_g - param0)] = (byte)param0;
    }

    final String i(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = this.field_g;
        this.field_g = this.field_g + 1;
        int var2 = this.field_h[fieldTemp$0];
        if (!(0 == var2)) {
            throw new IllegalStateException("");
        }
        int var3 = this.field_g;
        while (true) {
            fieldTemp$1 = this.field_g;
            this.field_g = this.field_g + 1;
            if (this.field_h[fieldTemp$1] == 0) {
                break;
            }
        }
        int var4 = -1 + (-var3 + this.field_g);
        if (!(var4 != param0)) {
            return "";
        }
        return gt.a(var3, this.field_h, (byte) 104, var4);
    }

    final int h(int param0) {
        int var2 = 255 & this.field_h[this.field_g];
        if (param0 != 16711935) {
            this.b(96, (byte) 59);
        }
        if ((var2 ^ -1) <= -129) {
            return -32768 + this.e((byte) 120);
        }
        return this.b(16711935);
    }

    lu(byte[] param0) {
        try {
            this.field_h = param0;
            this.field_g = 0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "lu.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
