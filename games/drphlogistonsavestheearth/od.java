/*
 * Decompiled by CFR-JS 0.4.0.
 */
class od extends gi {
    byte[] field_h;
    int field_j;
    static he[] field_i;
    static he field_k;

    final void b(int param0, int param1) {
        ((od) this).field_h[-4 + (((od) this).field_j + -param0)] = (byte)(param0 >> 24);
        int var3 = 51 / ((param1 - -32) / 49);
        ((od) this).field_h[((od) this).field_j - (param0 - -3)] = (byte)(param0 >> 16);
        ((od) this).field_h[-param0 + ((od) this).field_j + -2] = (byte)(param0 >> 8);
        ((od) this).field_h[-1 + -param0 + ((od) this).field_j] = (byte)param0;
    }

    final long a(byte param0) {
        long var2 = (long)((od) this).h(57) & 4294967295L;
        long var4 = (long)((od) this).h(125) & 4294967295L;
        if (param0 != -53) {
            return 37L;
        }
        return var4 + (var2 << 32);
    }

    final int c(byte param0) {
        int var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        int fieldTemp$0 = ((od) this).field_j;
        ((od) this).field_j = ((od) this).field_j + 1;
        int var2 = ((od) this).field_h[fieldTemp$0];
        int var3 = 0;
        if (param0 != 58) {
            Object var5 = null;
            ((od) this).a(23, (String) null);
        }
        while (var2 < 0) {
            var3 = (var3 | var2 & 127) << 7;
            int fieldTemp$1 = ((od) this).field_j;
            ((od) this).field_j = ((od) this).field_j + 1;
            var2 = ((od) this).field_h[fieldTemp$1];
        }
        return var2 | var3;
    }

    final void a(int param0, int param1) {
        ((od) this).field_h[param0 + -param1 + ((od) this).field_j] = (byte)(param1 >> 8);
        ((od) this).field_h[-1 + (-param1 + ((od) this).field_j)] = (byte)param1;
    }

    final void a(int param0, boolean param1) {
        int fieldTemp$0 = ((od) this).field_j;
        ((od) this).field_j = ((od) this).field_j + 1;
        ((od) this).field_h[fieldTemp$0] = (byte)(param0 >> 16);
        if (param1) {
            return;
        }
        int fieldTemp$1 = ((od) this).field_j;
        ((od) this).field_j = ((od) this).field_j + 1;
        ((od) this).field_h[fieldTemp$1] = (byte)(param0 >> 8);
        int fieldTemp$2 = ((od) this).field_j;
        ((od) this).field_j = ((od) this).field_j + 1;
        ((od) this).field_h[fieldTemp$2] = (byte)param0;
    }

    final void c(int param0, int param1) {
        int fieldTemp$0 = ((od) this).field_j;
        ((od) this).field_j = ((od) this).field_j + 1;
        ((od) this).field_h[fieldTemp$0] = (byte)(param0 >> 8);
        int fieldTemp$1 = ((od) this).field_j;
        ((od) this).field_j = ((od) this).field_j + 1;
        ((od) this).field_h[fieldTemp$1] = (byte)param0;
        if (param1 != -17402) {
            field_i = null;
        }
    }

    final void a(int param0, long param1) {
        int fieldTemp$0 = ((od) this).field_j;
        ((od) this).field_j = ((od) this).field_j + 1;
        ((od) this).field_h[fieldTemp$0] = (byte)(int)(param1 >> 32);
        int fieldTemp$1 = ((od) this).field_j;
        ((od) this).field_j = ((od) this).field_j + 1;
        ((od) this).field_h[fieldTemp$1] = (byte)(int)(param1 >> 24);
        int fieldTemp$2 = ((od) this).field_j;
        ((od) this).field_j = ((od) this).field_j + 1;
        ((od) this).field_h[fieldTemp$2] = (byte)(int)(param1 >> 16);
        int fieldTemp$3 = ((od) this).field_j;
        ((od) this).field_j = ((od) this).field_j + 1;
        ((od) this).field_h[fieldTemp$3] = (byte)(int)(param1 >> 8);
        if (param0 != 1992910808) {
            return;
        }
        int fieldTemp$4 = ((od) this).field_j;
        ((od) this).field_j = ((od) this).field_j + 1;
        ((od) this).field_h[fieldTemp$4] = (byte)(int)param1;
    }

    final String i(int param0) {
        if (((od) this).field_h[((od) this).field_j] == 0) {
            ((od) this).field_j = ((od) this).field_j + 1;
            return null;
        }
        if (param0 != 715718304) {
            return null;
        }
        return ((od) this).b((byte) -60);
    }

    final void b(int param0, int param1, int param2, byte[] param3) {
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
            if (param2 == 128) {
              var5_int = param0;
              L1: while (true) {
                if (param0 + param1 <= var5_int) {
                  break L0;
                } else {
                  int fieldTemp$7 = ((od) this).field_j;
                  ((od) this).field_j = ((od) this).field_j + 1;
                  param3[var5_int] = ((od) this).field_h[fieldTemp$7];
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
            stackOut_7_1 = new StringBuilder().append("od.DA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
          throw ie.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    final int j(int param0) {
        if (param0 != -788751192) {
            return -114;
        }
        ((od) this).field_j = ((od) this).field_j + 2;
        return ((255 & ((od) this).field_h[((od) this).field_j - 2]) << 8) + (255 & ((od) this).field_h[((od) this).field_j + -1]);
    }

    final byte n(int param0) {
        int var2 = 89 / ((9 - param0) / 59);
        int fieldTemp$0 = ((od) this).field_j;
        ((od) this).field_j = ((od) this).field_j + 1;
        return ((od) this).field_h[fieldTemp$0];
    }

    final void a(java.math.BigInteger param0, java.math.BigInteger param1, int param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
            var4_int = ((od) this).field_j;
            ((od) this).field_j = param2;
            var5 = new byte[var4_int];
            ((od) this).b(0, var4_int, 128, var5);
            var6 = new java.math.BigInteger(var5);
            var7 = var6.modPow(param1, param0);
            var8 = var7.toByteArray();
            ((od) this).field_j = 0;
            ((od) this).c(var8.length, param2 ^ -17402);
            ((od) this).a(var8.length, 0, 29211, var8);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "od.V(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(int param0, String param1) {
        CharSequence var4 = null;
        int var3_int = param1.indexOf(' ');
        if (!(var3_int < 0)) {
            throw new IllegalArgumentException("");
        }
        int fieldTemp$0 = ((od) this).field_j;
        ((od) this).field_j = ((od) this).field_j + 1;
        ((od) this).field_h[fieldTemp$0] = (byte) 0;
        if (param0 != -23805) {
            return;
        }
        try {
            var4 = (CharSequence) (Object) param1;
            ((od) this).field_j = ((od) this).field_j + ge.a(((od) this).field_h, ((od) this).field_j, 0, param1.length(), var4, -124);
            int fieldTemp$1 = ((od) this).field_j;
            ((od) this).field_j = ((od) this).field_j + 1;
            ((od) this).field_h[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "od.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(boolean param0) {
        if (!param0) {
            return -42;
        }
        if (((od) this).field_h[((od) this).field_j] >= 0) {
            return ((od) this).j(-788751192);
        }
        return ((od) this).h(-88) & 2147483647;
    }

    final void a(int param0, byte param1) {
        int fieldTemp$0 = ((od) this).field_j;
        ((od) this).field_j = ((od) this).field_j + 1;
        ((od) this).field_h[fieldTemp$0] = (byte)(param0 >> 24);
        int fieldTemp$1 = ((od) this).field_j;
        ((od) this).field_j = ((od) this).field_j + 1;
        ((od) this).field_h[fieldTemp$1] = (byte)(param0 >> 16);
        int var3 = 33 / ((param1 - 53) / 50);
        int fieldTemp$2 = ((od) this).field_j;
        ((od) this).field_j = ((od) this).field_j + 1;
        ((od) this).field_h[fieldTemp$2] = (byte)(param0 >> 8);
        int fieldTemp$3 = ((od) this).field_j;
        ((od) this).field_j = ((od) this).field_j + 1;
        ((od) this).field_h[fieldTemp$3] = (byte)param0;
    }

    final void a(int[] param0, int param1) {
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
            var3_int = ((od) this).field_j / 8;
            ((od) this).field_j = 0;
            var4 = 0;
            L1: while (true) {
              if (var3_int <= var4) {
                L2: {
                  if (param1 == 7221) {
                    break L2;
                  } else {
                    int discarded$2 = ((od) this).g(-78);
                    break L2;
                  }
                }
                break L0;
              } else {
                var5 = ((od) this).h(param1 + -7219);
                var6 = ((od) this).h(98);
                var7 = 0;
                var8 = -1640531527;
                var9 = 32;
                L3: while (true) {
                  int incrementValue$3 = var9;
                  var9--;
                  if (incrementValue$3 <= 0) {
                    ((od) this).field_j = ((od) this).field_j - 8;
                    ((od) this).a(var5, (byte) 126);
                    ((od) this).a(var6, (byte) 105);
                    var4++;
                    continue L1;
                  } else {
                    var5 = var5 + (var6 + (var6 << 4 ^ var6 >>> 5) ^ param0[3 & var7] + var7);
                    var7 = var7 + var8;
                    var6 = var6 + (param0[654311427 & var7 >>> 11] + var7 ^ var5 + (var5 >>> 5 ^ var5 << 4));
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
            stackOut_10_1 = new StringBuilder().append("od.UA(");
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
          throw ie.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ')');
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
        int fieldTemp$0 = ((od) this).field_j;
        ((od) this).field_j = ((od) this).field_j + 1;
        ((od) this).field_h[fieldTemp$0] = (byte)(int)(param0 >> 56);
        int fieldTemp$1 = ((od) this).field_j;
        ((od) this).field_j = ((od) this).field_j + 1;
        ((od) this).field_h[fieldTemp$1] = (byte)(int)(param0 >> 48);
        int fieldTemp$2 = ((od) this).field_j;
        ((od) this).field_j = ((od) this).field_j + 1;
        ((od) this).field_h[fieldTemp$2] = (byte)(int)(param0 >> 40);
        int fieldTemp$3 = ((od) this).field_j;
        ((od) this).field_j = ((od) this).field_j + 1;
        ((od) this).field_h[fieldTemp$3] = (byte)(int)(param0 >> 32);
        int fieldTemp$4 = ((od) this).field_j;
        ((od) this).field_j = ((od) this).field_j + 1;
        ((od) this).field_h[fieldTemp$4] = (byte)(int)(param0 >> 24);
        int fieldTemp$5 = ((od) this).field_j;
        ((od) this).field_j = ((od) this).field_j + 1;
        ((od) this).field_h[fieldTemp$5] = (byte)(int)(param0 >> 16);
        int fieldTemp$6 = ((od) this).field_j;
        ((od) this).field_j = ((od) this).field_j + 1;
        ((od) this).field_h[fieldTemp$6] = (byte)(int)(param0 >> 8);
        int fieldTemp$7 = ((od) this).field_j;
        ((od) this).field_j = ((od) this).field_j + 1;
        ((od) this).field_h[fieldTemp$7] = (byte)(int)param0;
        int var4 = 10 / ((42 - param1) / 60);
    }

    final int g(int param0) {
        if (param0 != -1) {
            byte discarded$0 = ((od) this).n(9);
        }
        ((od) this).field_j = ((od) this).field_j + 3;
        return ((255 & ((od) this).field_h[((od) this).field_j + -3]) << 16) - -(65280 & ((od) this).field_h[-2 + ((od) this).field_j] << 8) + (255 & ((od) this).field_h[((od) this).field_j + -1]);
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
                ((od) this).field_h = null;
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
                L7: {
                  if (10 != var8) {
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
            stackOut_22_0 = (RuntimeException) var3;
            stackOut_22_1 = new StringBuilder().append("od.S(").append(param0).append(',');
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
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
    }

    final void c(int param0, byte param1) {
        if (param1 > -81) {
            return;
        }
        int fieldTemp$0 = ((od) this).field_j;
        ((od) this).field_j = ((od) this).field_j + 1;
        ((od) this).field_h[fieldTemp$0] = (byte)param0;
    }

    final void b(int param0, byte param1) {
        ((od) this).field_h[((od) this).field_j - (param0 - -1)] = (byte)param0;
        if (param1 != 87) {
            ((od) this).a(-36, 79);
        }
    }

    final int l(int param0) {
        if (param0 != 31760) {
            ((od) this).field_h = null;
        }
        int fieldTemp$0 = ((od) this).field_j;
        ((od) this).field_j = ((od) this).field_j + 1;
        return ((od) this).field_h[fieldTemp$0] & 255;
    }

    final void a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        Object var4 = null;
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
                var5 = (CharSequence) (Object) param0;
                ((od) this).field_j = ((od) this).field_j + ge.a(((od) this).field_h, ((od) this).field_j, 0, param0.length(), var5, -125);
                int fieldTemp$2 = ((od) this).field_j;
                ((od) this).field_j = ((od) this).field_j + 1;
                ((od) this).field_h[fieldTemp$2] = (byte) 0;
                if (param1 == -1) {
                  break L1;
                } else {
                  var4 = null;
                  ((od) this).b(88, 90, -54, (byte[]) null);
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
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("od.O(");
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
          throw ie.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
    }

    final void a(int[] param0, boolean param1, int param2, int param3) {
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
              var5_int = ((od) this).field_j;
              ((od) this).field_j = param2;
              var6 = (-param2 + param3) / 8;
              if (param1) {
                break L1;
              } else {
                var14 = null;
                ((od) this).a((String) null, -6);
                break L1;
              }
            }
            var7 = 0;
            L2: while (true) {
              if (var7 >= var6) {
                ((od) this).field_j = var5_int;
                break L0;
              } else {
                var8 = ((od) this).h(106);
                var9 = ((od) this).h(12);
                var10 = -957401312;
                var11 = -1640531527;
                var12 = 32;
                L3: while (true) {
                  int incrementValue$1 = var12;
                  var12--;
                  if (incrementValue$1 <= 0) {
                    ((od) this).field_j = ((od) this).field_j - 8;
                    ((od) this).a(var8, (byte) -112);
                    ((od) this).a(var9, (byte) 119);
                    var7++;
                    continue L2;
                  } else {
                    var9 = var9 - (param0[-1421869053 & var10 >>> 11] + var10 ^ var8 + (var8 >>> 5 ^ var8 << 4));
                    var10 = var10 - var11;
                    var8 = var8 - (param0[3 & var10] + var10 ^ (var9 << 4 ^ var9 >>> 5) - -var9);
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
            stackOut_11_1 = new StringBuilder().append("od.RA(");
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
          throw ie.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int d(int param0, byte param1) {
        int var4 = -46 / ((83 - param1) / 33);
        int var3 = ml.a(((od) this).field_h, param0, ((od) this).field_j, false);
        ((od) this).a(var3, (byte) -125);
        return var3;
    }

    private final void a(long param0, int param1) {
        int fieldTemp$0 = ((od) this).field_j;
        ((od) this).field_j = ((od) this).field_j + 1;
        ((od) this).field_h[fieldTemp$0] = (byte)(int)(param0 >> 48);
        int fieldTemp$1 = ((od) this).field_j;
        ((od) this).field_j = ((od) this).field_j + 1;
        ((od) this).field_h[fieldTemp$1] = (byte)(int)(param0 >> 40);
        int fieldTemp$2 = ((od) this).field_j;
        ((od) this).field_j = ((od) this).field_j + 1;
        ((od) this).field_h[fieldTemp$2] = (byte)(int)(param0 >> 32);
        int fieldTemp$3 = ((od) this).field_j;
        ((od) this).field_j = ((od) this).field_j + 1;
        ((od) this).field_h[fieldTemp$3] = (byte)(int)(param0 >> 24);
        int fieldTemp$4 = ((od) this).field_j;
        ((od) this).field_j = ((od) this).field_j + 1;
        ((od) this).field_h[fieldTemp$4] = (byte)(int)(param0 >> 16);
        int fieldTemp$5 = ((od) this).field_j;
        ((od) this).field_j = ((od) this).field_j + 1;
        ((od) this).field_h[fieldTemp$5] = (byte)(int)(param0 >> 8);
        int fieldTemp$6 = ((od) this).field_j;
        ((od) this).field_j = ((od) this).field_j + 1;
        ((od) this).field_h[fieldTemp$6] = (byte)(int)param0;
        int var4 = -21 % ((-8 - param1) / 63);
    }

    final void a(byte param0, int param1) {
        int var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        while (param1 > ((od) this).field_j) {
            int fieldTemp$0 = ((od) this).field_j;
            ((od) this).field_j = ((od) this).field_j + 1;
            ((od) this).field_h[fieldTemp$0] = (byte) 0;
        }
        if (param0 > -25) {
            Object var5 = null;
            ((od) this).a((java.math.BigInteger) null, (java.math.BigInteger) null, -51);
        }
    }

    final int f(int param0) {
        int var2 = ((od) this).field_h[((od) this).field_j] & 255;
        if (param0 != 2350) {
            field_i = null;
        }
        if (var2 < 128) {
            return -64 + ((od) this).l(31760);
        }
        return ((od) this).j(param0 + -788753542) - 49152;
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
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == 29211) {
                break L1;
              } else {
                field_i = null;
                break L1;
              }
            }
            var5_int = param1;
            L2: while (true) {
              if (param1 - -param0 <= var5_int) {
                break L0;
              } else {
                int fieldTemp$8 = ((od) this).field_j;
                ((od) this).field_j = ((od) this).field_j + 1;
                ((od) this).field_h[fieldTemp$8] = param3[var5_int];
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
            stackOut_7_1 = new StringBuilder().append("od.MA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
          throw ie.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    final boolean m(int param0) {
        ((od) this).field_j = ((od) this).field_j - 4;
        int var2 = ml.a(((od) this).field_h, param0, ((od) this).field_j, false);
        int var3 = ((od) this).h(param0 + -120);
        if (var2 == var3) {
            return true;
        }
        return false;
    }

    od(int param0) {
        ((od) this).field_j = 0;
        ((od) this).field_h = sc.a(-16705, param0);
    }

    od(byte[] param0) {
        try {
            ((od) this).field_h = param0;
            ((od) this).field_j = 0;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "od.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final int k(int param0) {
        if (param0 != 7021) {
            Object var3 = null;
            ((od) this).b(64, 105, -79, (byte[]) null);
        }
        int var2 = ((od) this).field_h[((od) this).field_j] & 255;
        if (var2 < 128) {
            return ((od) this).l(param0 + 24739);
        }
        return -32768 + ((od) this).j(-788751192);
    }

    final static void a(int param0, ag param1) {
        if (param0 != -1630758008) {
            return;
        }
        try {
            ff.field_O.a((gi) (Object) new ml(param1, (gi) (Object) param1), 255);
            ej.field_a.a((ic) (Object) param1);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "od.AB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int h(int param0) {
        int var2 = -44 % ((param0 - -46) / 32);
        ((od) this).field_j = ((od) this).field_j + 4;
        return (255 & ((od) this).field_h[-1 + ((od) this).field_j]) + (((255 & ((od) this).field_h[((od) this).field_j + -2]) << 8) + (((od) this).field_h[-4 + ((od) this).field_j] << 24 & -16777216)) + (((od) this).field_h[-3 + ((od) this).field_j] << 16 & 16711680);
    }

    final void c(byte param0, int param1) {
        if (!((-128 & param1) == 0)) {
            if (!((param1 & -16384) == -1)) {
                if (!(-1 == (param1 & -2097152))) {
                    if (!((param1 & -268435456) == 0)) {
                        ((od) this).c(param1 >>> 28 | 128, (byte) -108);
                    }
                    ((od) this).c(128 | param1 >>> 21, (byte) -107);
                }
                ((od) this).c((2099811 | param1) >>> 14, (byte) -115);
            }
            ((od) this).c(128 | param1 >>> 7, (byte) -98);
        }
        int var3 = 101 / ((-47 - param0) / 62);
        ((od) this).c(127 & param1, (byte) -107);
    }

    final String b(byte param0) {
        int var2 = ((od) this).field_j;
        if (param0 >= -25) {
            return null;
        }
        while (true) {
            int fieldTemp$0 = ((od) this).field_j;
            ((od) this).field_j = ((od) this).field_j + 1;
            if (((od) this).field_h[fieldTemp$0] == 0) {
                break;
            }
        }
        int var3 = -1 + (-var2 + ((od) this).field_j);
        if (var3 == 0) {
            return "";
        }
        return p.a(var3, (byte) 79, ((od) this).field_h, var2);
    }

    final String e(int param0) {
        int fieldTemp$0 = ((od) this).field_j;
        ((od) this).field_j = ((od) this).field_j + 1;
        int var2 = ((od) this).field_h[fieldTemp$0];
        if (param0 >= -21) {
            return null;
        }
        if (var2 != 0) {
            throw new IllegalStateException("");
        }
        int var3 = ((od) this).field_j;
        while (true) {
            int fieldTemp$1 = ((od) this).field_j;
            ((od) this).field_j = ((od) this).field_j + 1;
            if (((od) this).field_h[fieldTemp$1] == 0) {
                break;
            }
        }
        int var4 = ((od) this).field_j + (-var3 - 1);
        if (var4 == 0) {
            return "";
        }
        return p.a(var4, (byte) 79, ((od) this).field_h, var3);
    }

    final void b(byte param0, int param1) {
        if (64 > param1) {
            if (param1 >= -64) {
                ((od) this).c(param1 - -64, (byte) -121);
                return;
            }
        }
        if (param1 < 16384) {
            if (!(param1 < -16384)) {
                ((od) this).c(49152 + param1, -17402);
                return;
            }
        }
        int var3 = -78 % ((42 - param0) / 51);
        throw new IllegalArgumentException();
    }

    static {
    }
}
