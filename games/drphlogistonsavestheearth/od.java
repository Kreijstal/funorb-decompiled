/*
 * Decompiled by CFR-JS 0.4.0.
 */
class od extends gi {
    byte[] field_h;
    int field_j;
    static he[] field_i;
    static he field_k;

    final void b(int param0, int param1) {
        this.field_h[-4 + (this.field_j + -param0)] = (byte)(param0 >> -206044616);
        int var3 = 51 / ((param1 - -32) / 49);
        this.field_h[this.field_j - (param0 - -3)] = (byte)(param0 >> 960794896);
        this.field_h[-param0 + this.field_j + -2] = (byte)(param0 >> 1510996904);
        this.field_h[-1 + -param0 + this.field_j] = (byte)param0;
    }

    final long a(byte param0) {
        long var2 = (long)this.h(57) & 4294967295L;
        long var4 = (long)this.h(125) & 4294967295L;
        if (param0 != -53) {
            return 37L;
        }
        return var4 + (var2 << 715718304);
    }

    final int c(byte param0) {
        int fieldTemp$1 = 0;
        int var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        int fieldTemp$0 = this.field_j;
        this.field_j = this.field_j + 1;
        int var2 = this.field_h[fieldTemp$0];
        int var3 = 0;
        if (param0 != 58) {
            String var5 = (String) null;
            this.a(23, (String) null);
        }
        while (-1 < (var2 ^ -1)) {
            var3 = (var3 | var2 & 127) << 1138042375;
            fieldTemp$1 = this.field_j;
            this.field_j = this.field_j + 1;
            var2 = this.field_h[fieldTemp$1];
        }
        return var2 | var3;
    }

    final void a(int param0, int param1) {
        this.field_h[param0 + -param1 + this.field_j] = (byte)(param1 >> 1633249736);
        this.field_h[-1 + (-param1 + this.field_j)] = (byte)param1;
    }

    final void a(int param0, boolean param1) {
        int fieldTemp$0 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$0] = (byte)(param0 >> 2112358064);
        if (param1) {
            return;
        }
        int fieldTemp$1 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$1] = (byte)(param0 >> 804133544);
        int fieldTemp$2 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$2] = (byte)param0;
    }

    final void c(int param0, int param1) {
        int fieldTemp$0 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$0] = (byte)(param0 >> -1046807800);
        int fieldTemp$1 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$1] = (byte)param0;
        if (param1 != -17402) {
            field_i = (he[]) null;
        }
    }

    final void a(int param0, long param1) {
        int fieldTemp$0 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$0] = (byte)(int)(param1 >> -1197274272);
        int fieldTemp$1 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$1] = (byte)(int)(param1 >> 1992910808);
        int fieldTemp$2 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$2] = (byte)(int)(param1 >> -498891376);
        int fieldTemp$3 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$3] = (byte)(int)(param1 >> 795802184);
        if (param0 != 1992910808) {
            return;
        }
        int fieldTemp$4 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$4] = (byte)(int)param1;
    }

    final String i(int param0) {
        if (this.field_h[this.field_j] == 0) {
            this.field_j = this.field_j + 1;
            return null;
        }
        if (param0 != 715718304) {
            return (String) null;
        }
        return this.b((byte) -60);
    }

    final void b(int param0, int param1, int param2, byte[] param3) {
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (param2 == 128) {
              var5_int = param0;
              L1: while (true) {
                if (param0 + param1 <= var5_int) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  fieldTemp$7 = this.field_j;
                  this.field_j = this.field_j + 1;
                  param3[var5_int] = this.field_h[fieldTemp$7];
                  var5_int++;
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
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("od.DA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int j(int param0) {
        if (param0 != -788751192) {
            return -114;
        }
        this.field_j = this.field_j + 2;
        return ((255 & this.field_h[this.field_j - 2]) << -788751192) + (255 & this.field_h[this.field_j + -1]);
    }

    final byte n(int param0) {
        int var2 = 89 / ((9 - param0) / 59);
        int fieldTemp$0 = this.field_j;
        this.field_j = this.field_j + 1;
        return this.field_h[fieldTemp$0];
    }

    final void a(java.math.BigInteger param0, java.math.BigInteger param1, int param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
            var4_int = this.field_j;
            this.field_j = param2;
            var5 = new byte[var4_int];
            this.b(0, var4_int, 128, var5);
            var6 = new java.math.BigInteger(var5);
            var7 = var6.modPow(param1, param0);
            var8 = var7.toByteArray();
            this.field_j = 0;
            this.c(var8.length, param2 ^ -17402);
            this.a(var8.length, 0, 29211, var8);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "od.V(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(int param0, String param1) {
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        int var3_int = param1.indexOf(' ');
        if (!(-1 < (var3_int ^ -1))) {
            throw new IllegalArgumentException("");
        }
        int fieldTemp$0 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$0] = (byte) 0;
        if (param0 != -23805) {
            return;
        }
        try {
            var4 = (CharSequence) ((Object) param1);
            this.field_j = this.field_j + ge.a(this.field_h, this.field_j, 0, param1.length(), var4, -124);
            fieldTemp$1 = this.field_j;
            this.field_j = this.field_j + 1;
            this.field_h[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "od.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(boolean param0) {
        if (!param0) {
            return -42;
        }
        if ((this.field_h[this.field_j] ^ -1) <= -1) {
            return this.j(-788751192);
        }
        return this.h(-88) & 2147483647;
    }

    final void a(int param0, byte param1) {
        int fieldTemp$0 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$0] = (byte)(param0 >> 2026627896);
        int fieldTemp$1 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$1] = (byte)(param0 >> 665388400);
        int var3 = 33 / ((param1 - 53) / 50);
        int fieldTemp$2 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$2] = (byte)(param0 >> 845166792);
        int fieldTemp$3 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$3] = (byte)param0;
    }

    final void a(int[] param0, int param1) {
        int discarded$2 = 0;
        int incrementValue$3 = 0;
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
        var10 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var3_int = this.field_j / 8;
            this.field_j = 0;
            var4 = 0;
            L1: while (true) {
              if (var3_int <= var4) {
                L2: {
                  if (param1 == 7221) {
                    break L2;
                  } else {
                    discarded$2 = this.g(-78);
                    break L2;
                  }
                }
                break L0;
              } else {
                var5 = this.h(param1 + -7219);
                var6 = this.h(98);
                var7 = 0;
                var8 = -1640531527;
                var9 = 32;
                L3: while (true) {
                  incrementValue$3 = var9;
                  var9--;
                  if ((incrementValue$3 ^ -1) >= -1) {
                    this.field_j = this.field_j - 8;
                    this.a(var5, (byte) 126);
                    this.a(var6, (byte) 105);
                    var4++;
                    continue L1;
                  } else {
                    var5 = var5 + (var6 + (var6 << 1723075908 ^ var6 >>> -1858534235) ^ param0[3 & var7] + var7);
                    var7 = var7 + var8;
                    var6 = var6 + (param0[654311427 & var7 >>> -216435989] + var7 ^ var5 + (var5 >>> -2128198619 ^ var5 << 1230421380));
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
            stackOut_10_1 = new StringBuilder().append("od.UA(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
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
          throw ie.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    public static void d(int param0) {
        field_i = null;
        if (param0 != 4) {
            od.d(-59);
        }
        field_k = null;
    }

    final void a(long param0, byte param1) {
        int fieldTemp$0 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$0] = (byte)(int)(param0 >> -123083208);
        int fieldTemp$1 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$1] = (byte)(int)(param0 >> 1864498800);
        int fieldTemp$2 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$2] = (byte)(int)(param0 >> -1524568344);
        int fieldTemp$3 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$3] = (byte)(int)(param0 >> 163401952);
        int fieldTemp$4 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$4] = (byte)(int)(param0 >> 498168088);
        int fieldTemp$5 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$5] = (byte)(int)(param0 >> 1093539536);
        int fieldTemp$6 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$6] = (byte)(int)(param0 >> 1072688328);
        int fieldTemp$7 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$7] = (byte)(int)param0;
        int var4 = 10 / ((42 - param1) / 60);
    }

    final int g(int param0) {
        byte discarded$0 = 0;
        if (param0 != -1) {
            discarded$0 = this.n(9);
        }
        this.field_j = this.field_j + 3;
        return ((255 & this.field_h[this.field_j + -3]) << 140147472) - -(65280 & this.field_h[-2 + this.field_j] << 1556658056) + (255 & this.field_h[this.field_j + -1]);
    }

    final void b(int param0, String param1) {
        RuntimeException var3 = null;
        long var3_long = 0L;
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
        var10 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_long = 0L;
              var5 = 0L;
              var7 = param1.length();
              var8 = 19;
              if (param0 == 1) {
                break L1;
              } else {
                this.field_h = (byte[]) null;
                break L1;
              }
            }
            L2: while (true) {
              if (var8 < 0) {
                this.a(var3_long, 113);
                this.a(var5, param0 + -88);
                break L0;
              } else {
                L3: {
                  var3_long = var3_long * 38L;
                  if (var8 >= var7) {
                    break L3;
                  } else {
                    L4: {
                      var9 = param1.charAt(var8);
                      if (65 > var9) {
                        break L4;
                      } else {
                        if (90 < var9) {
                          break L4;
                        } else {
                          var3_long = var3_long + (long)(-63 - -var9);
                          break L3;
                        }
                      }
                    }
                    L5: {
                      if (97 > var9) {
                        break L5;
                      } else {
                        if (122 >= var9) {
                          var3_long = var3_long + (long)(2 - -var9 - 97);
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
                          var3_long = var3_long + (long)(28 + var9 - 48);
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
                if (10 == var8) {
                  var5 = var3_long;
                  var3_long = 0L;
                  var8--;
                  continue L2;
                } else {
                  var8--;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var3);
            stackOut_22_1 = new StringBuilder().append("od.S(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
    }

    final void c(int param0, byte param1) {
        if (param1 > -81) {
            return;
        }
        int fieldTemp$0 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$0] = (byte)param0;
    }

    final void b(int param0, byte param1) {
        this.field_h[this.field_j - (param0 - -1)] = (byte)param0;
        if (param1 != 87) {
            this.a(-36, 79);
        }
    }

    final int l(int param0) {
        if (param0 != 31760) {
            this.field_h = (byte[]) null;
        }
        int fieldTemp$0 = this.field_j;
        this.field_j = this.field_j + 1;
        return this.field_h[fieldTemp$0] & 255;
    }

    final void a(String param0, int param1) {
        int fieldTemp$2 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        CharSequence var5 = null;
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
        try {
          L0: {
            var3_int = param0.indexOf(' ');
            if (var3_int < 0) {
              L1: {
                var5 = (CharSequence) ((Object) param0);
                this.field_j = this.field_j + ge.a(this.field_h, this.field_j, 0, param0.length(), var5, -125);
                fieldTemp$2 = this.field_j;
                this.field_j = this.field_j + 1;
                this.field_h[fieldTemp$2] = (byte) 0;
                if (param1 == -1) {
                  break L1;
                } else {
                  var4 = (byte[]) null;
                  this.b(88, 90, -54, (byte[]) null);
                  break L1;
                }
              }
              break L0;
            } else {
              throw new IllegalArgumentException("");
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("od.O(");
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
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
    }

    final void a(int[] param0, boolean param1, int param2, int param3) {
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
        String var14 = null;
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
        var13 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = this.field_j;
              this.field_j = param2;
              var6 = (-param2 + param3) / 8;
              if (param1) {
                break L1;
              } else {
                var14 = (String) null;
                this.a((String) null, -6);
                break L1;
              }
            }
            var7 = 0;
            L2: while (true) {
              if (var7 >= var6) {
                this.field_j = var5_int;
                break L0;
              } else {
                var8 = this.h(106);
                var9 = this.h(12);
                var10 = -957401312;
                var11 = -1640531527;
                var12 = 32;
                L3: while (true) {
                  incrementValue$1 = var12;
                  var12--;
                  if (incrementValue$1 <= 0) {
                    this.field_j = this.field_j - 8;
                    this.a(var8, (byte) -112);
                    this.a(var9, (byte) 119);
                    var7++;
                    continue L2;
                  } else {
                    var9 = var9 - (param0[-1421869053 & var10 >>> 1995571275] + var10 ^ var8 + (var8 >>> -11806043 ^ var8 << 175858596));
                    var10 = var10 - var11;
                    var8 = var8 - (param0[3 & var10] + var10 ^ (var9 << -1981782460 ^ var9 >>> 1620993029) - -var9);
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
            stackOut_11_1 = new StringBuilder().append("od.RA(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
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
          throw ie.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int d(int param0, byte param1) {
        int var4 = -46 / ((83 - param1) / 33);
        int var3 = ml.a(this.field_h, param0, this.field_j, false);
        this.a(var3, (byte) -125);
        return var3;
    }

    private final void a(long param0, int param1) {
        int fieldTemp$0 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$0] = (byte)(int)(param0 >> 1930374064);
        int fieldTemp$1 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$1] = (byte)(int)(param0 >> 1504015208);
        int fieldTemp$2 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$2] = (byte)(int)(param0 >> 1094605024);
        int fieldTemp$3 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$3] = (byte)(int)(param0 >> 381447768);
        int fieldTemp$4 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$4] = (byte)(int)(param0 >> 676066640);
        int fieldTemp$5 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$5] = (byte)(int)(param0 >> -1630758008);
        int fieldTemp$6 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$6] = (byte)(int)param0;
        int var4 = -21 % ((-8 - param1) / 63);
    }

    final void a(byte param0, int param1) {
        int fieldTemp$0 = 0;
        int var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        while (param1 > this.field_j) {
            fieldTemp$0 = this.field_j;
            this.field_j = this.field_j + 1;
            this.field_h[fieldTemp$0] = (byte) 0;
        }
        if (param0 > -25) {
            java.math.BigInteger var5 = (java.math.BigInteger) null;
            this.a((java.math.BigInteger) null, (java.math.BigInteger) null, -51);
        }
    }

    final int f(int param0) {
        int var2 = this.field_h[this.field_j] & 255;
        if (param0 != 2350) {
            field_i = (he[]) null;
        }
        if ((var2 ^ -1) > -129) {
            return -64 + this.l(31760);
        }
        return this.j(param0 + -788753542) - 49152;
    }

    final void a(int param0, int param1, int param2, byte[] param3) {
        int fieldTemp$8 = 0;
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
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == 29211) {
                break L1;
              } else {
                field_i = (he[]) null;
                break L1;
              }
            }
            var5_int = param1;
            L2: while (true) {
              if (param1 - -param0 <= var5_int) {
                break L0;
              } else {
                fieldTemp$8 = this.field_j;
                this.field_j = this.field_j + 1;
                this.field_h[fieldTemp$8] = param3[var5_int];
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
            stackOut_7_1 = new StringBuilder().append("od.MA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
          throw ie.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final boolean m(int param0) {
        this.field_j = this.field_j - 4;
        int var2 = ml.a(this.field_h, param0, this.field_j, false);
        int var3 = this.h(param0 + -120);
        if (var2 == var3) {
            return true;
        }
        return false;
    }

    od(int param0) {
        this.field_j = 0;
        this.field_h = sc.a(-16705, param0);
    }

    od(byte[] param0) {
        try {
            this.field_h = param0;
            this.field_j = 0;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "od.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final int k(int param0) {
        if (param0 != 7021) {
            byte[] var3 = (byte[]) null;
            this.b(64, 105, -79, (byte[]) null);
        }
        int var2 = this.field_h[this.field_j] & 255;
        if ((var2 ^ -1) > -129) {
            return this.l(param0 + 24739);
        }
        return -32768 + this.j(-788751192);
    }

    final static void a(int param0, ag param1) {
        if (param0 != -1630758008) {
            return;
        }
        try {
            ff.field_O.a(new ml(param1, param1), 255);
            ej.field_a.a(param1);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "od.AB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int h(int param0) {
        int var2 = -44 % ((param0 - -46) / 32);
        this.field_j = this.field_j + 4;
        return (255 & this.field_h[-1 + this.field_j]) + (((255 & this.field_h[this.field_j + -2]) << 62037672) + (this.field_h[-4 + this.field_j] << -613899848 & -16777216)) + (this.field_h[-3 + this.field_j] << 74417968 & 16711680);
    }

    final void c(byte param0, int param1) {
        if (!((-128 & param1) == 0)) {
            if (!((param1 & -16384) == 0)) {
                if (!(-1 == (param1 & -2097152 ^ -1))) {
                    if (!((param1 & -268435456) == 0)) {
                        this.c(param1 >>> -1442545636 | 128, (byte) -108);
                    }
                    this.c(128 | param1 >>> 454182229, (byte) -107);
                }
                this.c((2099811 | param1) >>> -1302818450, (byte) -115);
            }
            this.c(128 | param1 >>> -785839257, (byte) -98);
        }
        int var3 = 101 / ((-47 - param0) / 62);
        this.c(127 & param1, (byte) -107);
    }

    final String b(byte param0) {
        int fieldTemp$0 = 0;
        int var2 = this.field_j;
        if (param0 >= -25) {
            return (String) null;
        }
        while (true) {
            fieldTemp$0 = this.field_j;
            this.field_j = this.field_j + 1;
            if (-1 == (this.field_h[fieldTemp$0] ^ -1)) {
                break;
            }
        }
        int var3 = -1 + (-var2 + this.field_j);
        if (var3 == 0) {
            return "";
        }
        return p.a(var3, (byte) 79, this.field_h, var2);
    }

    final String e(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = this.field_j;
        this.field_j = this.field_j + 1;
        int var2 = this.field_h[fieldTemp$0];
        if (param0 >= -21) {
            return (String) null;
        }
        if (-1 != (var2 ^ -1)) {
            throw new IllegalStateException("");
        }
        int var3 = this.field_j;
        while (true) {
            fieldTemp$1 = this.field_j;
            this.field_j = this.field_j + 1;
            if (-1 == (this.field_h[fieldTemp$1] ^ -1)) {
                break;
            }
        }
        int var4 = this.field_j + (-var3 - 1);
        if (-1 == (var4 ^ -1)) {
            return "";
        }
        return p.a(var4, (byte) 79, this.field_h, var3);
    }

    final void b(byte param0, int param1) {
        if (64 > param1) {
            if ((param1 ^ -1) <= 63) {
                this.c(param1 - -64, (byte) -121);
                return;
            }
        }
        if (-16385 < (param1 ^ -1)) {
            if (!(16383 < (param1 ^ -1))) {
                this.c(49152 + param1, -17402);
                return;
            }
        }
        int var3 = -78 % ((42 - param0) / 51);
        throw new IllegalArgumentException();
    }

    static {
    }
}
