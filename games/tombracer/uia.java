/*
 * Decompiled by CFR-JS 0.4.0.
 */
class uia extends vg {
    int field_h;
    byte[] field_g;
    static String field_f;

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
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -48) {
                break L1;
              } else {
                break L1;
              }
            }
            var3_int = ((uia) this).field_h / 8;
            ((uia) this).field_h = 0;
            var4 = 0;
            L2: while (true) {
              if (var4 >= var3_int) {
                break L0;
              } else {
                var5 = ((uia) this).e(-51);
                var6 = ((uia) this).e(param0 ^ 120);
                var7 = 0;
                var8 = -1640531527;
                var9 = 32;
                L3: while (true) {
                  int incrementValue$1 = var9;
                  var9--;
                  if (0 >= incrementValue$1) {
                    ((uia) this).field_h = ((uia) this).field_h - 8;
                    ((uia) this).a(var5, (byte) 0);
                    ((uia) this).a(var6, (byte) -98);
                    var4++;
                    continue L2;
                  } else {
                    var5 = var5 + (var6 + (var6 << 4 ^ var6 >>> 5) ^ param1[3 & var7] + var7);
                    var7 = var7 + var8;
                    var6 = var6 + (var5 + (var5 << 4 ^ var5 >>> 5) ^ var7 + param1[var7 >>> 11 & -866123773]);
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
            stackOut_10_1 = new StringBuilder().append("uia.KA(").append(param0).append(44);
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
          throw tba.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    final int b(boolean param0) {
        ((uia) this).field_h = ((uia) this).field_h + 2;
        int var2 = (((uia) this).field_g[((uia) this).field_h + -1] & 255) + (65280 & ((uia) this).field_g[-2 + ((uia) this).field_h] << 8);
        if (!(var2 <= 32767)) {
            var2 = var2 - 65536;
        }
        if (param0) {
            return 56;
        }
        return var2;
    }

    final void a(int param0, byte param1) {
        int fieldTemp$0 = ((uia) this).field_h;
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[fieldTemp$0] = (byte)(param0 >> 24);
        int fieldTemp$1 = ((uia) this).field_h;
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[fieldTemp$1] = (byte)(param0 >> 16);
        int fieldTemp$2 = ((uia) this).field_h;
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[fieldTemp$2] = (byte)(param0 >> 8);
        int fieldTemp$3 = ((uia) this).field_h;
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[fieldTemp$3] = (byte)param0;
        int var3 = 125 % ((43 - param1) / 33);
    }

    final void a(byte[] param0, int param1, int param2, int param3) {
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
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var5_int = param1;
            if (param2 < -79) {
              L1: while (true) {
                if (param1 + param3 <= var5_int) {
                  break L0;
                } else {
                  int fieldTemp$7 = ((uia) this).field_h;
                  ((uia) this).field_h = ((uia) this).field_h + 1;
                  param0[var5_int] = ((uia) this).field_g[fieldTemp$7];
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
            stackOut_6_1 = new StringBuilder().append("uia.BA(");
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
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final byte c(byte param0) {
        if (param0 < 27) {
            return (byte) -82;
        }
        int fieldTemp$0 = ((uia) this).field_h;
        ((uia) this).field_h = ((uia) this).field_h + 1;
        return ((uia) this).field_g[fieldTemp$0];
    }

    final int b(byte param0) {
        int var5 = TombRacer.field_G ? 1 : 0;
        int var2 = -48 % ((-58 - param0) / 58);
        int fieldTemp$0 = ((uia) this).field_h;
        ((uia) this).field_h = ((uia) this).field_h + 1;
        int var3 = ((uia) this).field_g[fieldTemp$0];
        int var4 = 0;
        while (0 > var3) {
            var4 = (var4 | var3 & 127) << 7;
            int fieldTemp$1 = ((uia) this).field_h;
            ((uia) this).field_h = ((uia) this).field_h + 1;
            var3 = ((uia) this).field_g[fieldTemp$1];
        }
        return var3 | var4;
    }

    final void a(byte param0, int param1) {
        int fieldTemp$0 = ((uia) this).field_h;
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[fieldTemp$0] = (byte)param1;
        int fieldTemp$1 = ((uia) this).field_h;
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[fieldTemp$1] = (byte)(param1 >> 8);
        if (param0 != -35) {
            return;
        }
        int fieldTemp$2 = ((uia) this).field_h;
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[fieldTemp$2] = (byte)(param1 >> 16);
        int fieldTemp$3 = ((uia) this).field_h;
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[fieldTemp$3] = (byte)(param1 >> 24);
    }

    final String e(byte param0) {
        int var2 = ((uia) this).field_h;
        if (param0 != -76) {
            byte discarded$0 = ((uia) this).c((byte) -16);
        }
        while (true) {
            int fieldTemp$1 = ((uia) this).field_h;
            ((uia) this).field_h = ((uia) this).field_h + 1;
            if (((uia) this).field_g[fieldTemp$1] == 0) {
                break;
            }
        }
        int var3 = ((uia) this).field_h - (var2 + 1);
        if (var3 == 0) {
            return "";
        }
        return nia.a(((uia) this).field_g, var2, var3, 255);
    }

    final void a(int param0, java.math.BigInteger param1, java.math.BigInteger param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
            var4_int = ((uia) this).field_h;
            ((uia) this).field_h = 0;
            var5 = new byte[var4_int];
            ((uia) this).a(var5, 0, -102, var4_int);
            var6 = new java.math.BigInteger(var5);
            var7 = var6.modPow(param1, param2);
            var8 = var7.toByteArray();
            ((uia) this).field_h = 0;
            ((uia) this).f(-1477662136, var8.length);
            if (param0 <= 87) {
                int discarded$0 = ((uia) this).b(false);
            }
            ((uia) this).a(0, var8, var8.length, 107);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "uia.CB(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, int param1) {
        ((uia) this).field_g[((uia) this).field_h - param0 - 4] = (byte)(param0 >> 24);
        ((uia) this).field_g[-3 + (-param0 + ((uia) this).field_h)] = (byte)(param0 >> 16);
        if (param1 != 22726) {
            Object var4 = null;
            ((uia) this).a((byte) 83, (int[]) null);
        }
        ((uia) this).field_g[-2 + (-param0 + ((uia) this).field_h)] = (byte)(param0 >> 8);
        ((uia) this).field_g[((uia) this).field_h + -param0 - 1] = (byte)param0;
    }

    final int a(int param0) {
        ((uia) this).field_h = ((uia) this).field_h + 3;
        if (param0 != -32768) {
            return 55;
        }
        return ((((uia) this).field_g[-2 + ((uia) this).field_h] & 255) << 8) + (((uia) this).field_g[-3 + ((uia) this).field_h] << 16 & 16711680) + (255 & ((uia) this).field_g[((uia) this).field_h + -1]);
    }

    final void a(int param0, long param1) {
        int fieldTemp$0 = ((uia) this).field_h;
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[fieldTemp$0] = (byte)(int)(param1 >> 56);
        int fieldTemp$1 = ((uia) this).field_h;
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[fieldTemp$1] = (byte)(int)(param1 >> 48);
        int fieldTemp$2 = ((uia) this).field_h;
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[fieldTemp$2] = (byte)(int)(param1 >> 40);
        int fieldTemp$3 = ((uia) this).field_h;
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[fieldTemp$3] = (byte)(int)(param1 >> 32);
        int fieldTemp$4 = ((uia) this).field_h;
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[fieldTemp$4] = (byte)(int)(param1 >> 24);
        if (param0 != 1736565456) {
            ((uia) this).field_g = null;
        }
        int fieldTemp$5 = ((uia) this).field_h;
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[fieldTemp$5] = (byte)(int)(param1 >> 16);
        int fieldTemp$6 = ((uia) this).field_h;
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[fieldTemp$6] = (byte)(int)(param1 >> 8);
        int fieldTemp$7 = ((uia) this).field_h;
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[fieldTemp$7] = (byte)(int)param1;
    }

    final void c(int param0, byte param1) {
        if (0 <= param0) {
            if (!(128 <= param0)) {
                ((uia) this).i(param0, 0);
                return;
            }
        }
        int var3 = -126 % ((param1 - -18) / 58);
        if (param0 >= 0) {
            if (!(32768 <= param0)) {
                ((uia) this).f(-1477662136, 32768 + param0);
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    public static void a(boolean param0) {
        field_f = null;
    }

    final void b(int param0, byte param1) {
        ((uia) this).field_g[-2 + (((uia) this).field_h - param0)] = (byte)(param0 >> 8);
        ((uia) this).field_g[-param0 + (((uia) this).field_h - 1)] = (byte)param0;
        int var3 = -48 % ((param1 - 56) / 42);
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
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -84984444) {
                break L1;
              } else {
                ((uia) this).i(54, 87);
                break L1;
              }
            }
            var5_int = ((uia) this).field_h;
            ((uia) this).field_h = param3;
            var6 = (-param3 + param0) / 8;
            var7 = 0;
            L2: while (true) {
              if (var6 <= var7) {
                ((uia) this).field_h = var5_int;
                break L0;
              } else {
                var8 = ((uia) this).e(-88);
                var9 = ((uia) this).e(-102);
                var10 = -957401312;
                var11 = -1640531527;
                var12 = 32;
                L3: while (true) {
                  int incrementValue$1 = var12;
                  var12--;
                  if (incrementValue$1 <= 0) {
                    ((uia) this).field_h = ((uia) this).field_h - 8;
                    ((uia) this).a(var8, (byte) -9);
                    ((uia) this).a(var9, (byte) 95);
                    var7++;
                    continue L2;
                  } else {
                    var9 = var9 - (param2[(7261 & var10) >>> 11] + var10 ^ (var8 << 4 ^ var8 >>> 5) - -var8);
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
            stackOut_11_1 = new StringBuilder().append("uia.N(").append(param0).append(44).append(param1).append(44);
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
          throw tba.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param3 + 41);
        }
    }

    final void a(String param0, int param1) {
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
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3_long = 0L;
            var5 = 0L;
            var7 = param0.length();
            var8 = 19;
            L1: while (true) {
              if (var8 < 0) {
                L2: {
                  this.a(var3_long, -106);
                  if (param1 < -122) {
                    break L2;
                  } else {
                    ((uia) this).field_g = null;
                    break L2;
                  }
                }
                this.a(var5, -120);
                break L0;
              } else {
                L3: {
                  var3_long = var3_long * 38L;
                  if (var7 <= var8) {
                    break L3;
                  } else {
                    L4: {
                      var9 = param0.charAt(var8);
                      if (var9 < 65) {
                        break L4;
                      } else {
                        if (var9 <= 90) {
                          var3_long = var3_long + (long)(var9 + -63);
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
                        if (122 < var9) {
                          break L5;
                        } else {
                          var3_long = var3_long + (long)(-95 - -var9);
                          break L3;
                        }
                      }
                    }
                    L6: {
                      if (var9 < 48) {
                        break L6;
                      } else {
                        if (var9 <= 57) {
                          var3_long = var3_long + (long)(-48 + (28 - -var9));
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
                  if (var8 == 10) {
                    var5 = var3_long;
                    var3_long = 0L;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                var8--;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var3;
            stackOut_24_1 = new StringBuilder().append("uia.JA(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param1 + 41);
        }
    }

    uia(int param0) {
        ((uia) this).field_h = 0;
        ((uia) this).field_g = fba.a(param0, 0);
    }

    final void b(int param0, int param1) {
        int var4 = TombRacer.field_G ? 1 : 0;
        if (param0 != 716148936) {
            return;
        }
        while (((uia) this).field_h < param1) {
            int fieldTemp$0 = ((uia) this).field_h;
            ((uia) this).field_h = ((uia) this).field_h + 1;
            ((uia) this).field_g[fieldTemp$0] = (byte) 0;
        }
    }

    final void e(int param0, int param1) {
        if (param0 != -5338) {
            return;
        }
        if (param1 < 64) {
            if (param1 >= -64) {
                ((uia) this).i(64 + param1, 0);
                return;
            }
        }
        if (param1 < 16384) {
            if (!(param1 < -16384)) {
                ((uia) this).f(-1477662136, 49152 + param1);
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    final int d(byte param0) {
        if (param0 != -46) {
            return -59;
        }
        int var2 = ((uia) this).field_g[((uia) this).field_h] & 255;
        if (var2 >= 128) {
            return -32768 + ((uia) this).d(param0 + 168);
        }
        return ((uia) this).h(255);
    }

    final void a(int param0, byte[] param1, int param2, int param3) {
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
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param0;
              if (param3 >= 52) {
                break L1;
              } else {
                ((uia) this).field_h = -97;
                break L1;
              }
            }
            L2: while (true) {
              if (var5_int >= param2 + param0) {
                break L0;
              } else {
                int fieldTemp$7 = ((uia) this).field_h;
                ((uia) this).field_h = ((uia) this).field_h + 1;
                ((uia) this).field_g[fieldTemp$7] = param1[var5_int];
                var5_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("uia.W(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final int d(int param0) {
        if (param0 <= 120) {
            field_f = null;
        }
        ((uia) this).field_h = ((uia) this).field_h + 2;
        return (((uia) this).field_g[-2 + ((uia) this).field_h] << 8 & 65280) - -(((uia) this).field_g[-1 + ((uia) this).field_h] & 255);
    }

    final void d(int param0, byte param1) {
        ((uia) this).field_g[-1 + -param0 + ((uia) this).field_h] = (byte)param0;
        int var3 = -105 % ((-62 - param1) / 33);
    }

    final void h(int param0, int param1) {
        int fieldTemp$0 = ((uia) this).field_h;
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[fieldTemp$0] = (byte)(param1 >> 16);
        int fieldTemp$1 = ((uia) this).field_h;
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[fieldTemp$1] = (byte)(param1 >> 8);
        int var3 = 1 % ((param0 - -36) / 40);
        int fieldTemp$2 = ((uia) this).field_h;
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[fieldTemp$2] = (byte)param1;
    }

    final String f(int param0) {
        int fieldTemp$0 = ((uia) this).field_h;
        ((uia) this).field_h = ((uia) this).field_h + 1;
        int var2 = ((uia) this).field_g[fieldTemp$0];
        if (!(var2 == 0)) {
            throw new IllegalStateException("");
        }
        int var3 = ((uia) this).field_h;
        while (true) {
            int fieldTemp$1 = ((uia) this).field_h;
            ((uia) this).field_h = ((uia) this).field_h + 1;
            if (((uia) this).field_g[fieldTemp$1] == 0) {
                break;
            }
        }
        if (param0 <= 113) {
            field_f = null;
        }
        int var4 = ((uia) this).field_h - (var3 + 1);
        if (var4 == 0) {
            return "";
        }
        return nia.a(((uia) this).field_g, var3, var4, 255);
    }

    uia(byte[] param0) {
        try {
            ((uia) this).field_h = 0;
            ((uia) this).field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "uia.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final void d(int param0, int param1) {
        int fieldTemp$0 = ((uia) this).field_h;
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[fieldTemp$0] = (byte)param0;
        int var3 = -23 / ((73 - param1) / 46);
        int fieldTemp$1 = ((uia) this).field_h;
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[fieldTemp$1] = (byte)(param0 >> 8);
    }

    final long b(int param0) {
        if (param0 != 290646880) {
            return 127L;
        }
        long var2 = (long)((uia) this).e(-81) & 4294967295L;
        long var4 = 4294967295L & (long)((uia) this).e(111);
        return var4 + (var2 << 32);
    }

    final int f(byte param0) {
        if (param0 >= -127) {
            return 93;
        }
        int var2 = ((uia) this).field_g[((uia) this).field_h] & 255;
        if (var2 >= 128) {
            return -49152 + ((uia) this).d(127);
        }
        return -64 + ((uia) this).h(255);
    }

    private final void a(long param0, int param1) {
        int fieldTemp$0 = ((uia) this).field_h;
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[fieldTemp$0] = (byte)(int)(param0 >> 48);
        int fieldTemp$1 = ((uia) this).field_h;
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[fieldTemp$1] = (byte)(int)(param0 >> 40);
        int fieldTemp$2 = ((uia) this).field_h;
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[fieldTemp$2] = (byte)(int)(param0 >> 32);
        int fieldTemp$3 = ((uia) this).field_h;
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[fieldTemp$3] = (byte)(int)(param0 >> 24);
        int fieldTemp$4 = ((uia) this).field_h;
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[fieldTemp$4] = (byte)(int)(param0 >> 16);
        if (param1 > -37) {
            field_f = null;
        }
        int fieldTemp$5 = ((uia) this).field_h;
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[fieldTemp$5] = (byte)(int)(param0 >> 8);
        int fieldTemp$6 = ((uia) this).field_h;
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[fieldTemp$6] = (byte)(int)param0;
    }

    final void a(boolean param0, long param1) {
        int fieldTemp$0 = ((uia) this).field_h;
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[fieldTemp$0] = (byte)(int)(param1 >> 32);
        int fieldTemp$1 = ((uia) this).field_h;
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[fieldTemp$1] = (byte)(int)(param1 >> 24);
        int fieldTemp$2 = ((uia) this).field_h;
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[fieldTemp$2] = (byte)(int)(param1 >> 16);
        if (!param0) {
            return;
        }
        int fieldTemp$3 = ((uia) this).field_h;
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[fieldTemp$3] = (byte)(int)(param1 >> 8);
        int fieldTemp$4 = ((uia) this).field_h;
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[fieldTemp$4] = (byte)(int)param1;
    }

    final void a(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
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
                var4 = (CharSequence) (Object) param0;
                ((uia) this).field_h = ((uia) this).field_h + laa.a(((uia) this).field_h, param0.length(), ((uia) this).field_g, 0, var4, (byte) -4);
                int fieldTemp$2 = ((uia) this).field_h;
                ((uia) this).field_h = ((uia) this).field_h + 1;
                ((uia) this).field_g[fieldTemp$2] = (byte) 0;
                if (!param1) {
                  break L1;
                } else {
                  ((uia) this).field_g = null;
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
            stackOut_5_1 = new StringBuilder().append("uia.GB(");
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
          throw tba.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
    }

    final int g(int param0) {
        if (param0 != -48) {
            return 3;
        }
        if (((uia) this).field_g[((uia) this).field_h] < 0) {
            return ((uia) this).e(-16) & 2147483647;
        }
        return ((uia) this).d(param0 ^ -82);
    }

    final void i(int param0, int param1) {
        int fieldTemp$0 = ((uia) this).field_h;
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[fieldTemp$0] = (byte)param0;
        if (param1 != 0) {
            Object var4 = null;
            ((uia) this).a(13, (byte[]) null, 70, -102);
        }
    }

    final int e(int param0) {
        ((uia) this).field_h = ((uia) this).field_h + 4;
        int var2 = -60 / ((param0 - 44) / 50);
        return ((255 & ((uia) this).field_g[-2 + ((uia) this).field_h]) << 8) + ((-16777216 & ((uia) this).field_g[((uia) this).field_h - 4] << 24) - -((255 & ((uia) this).field_g[-3 + ((uia) this).field_h]) << 16) + (255 & ((uia) this).field_g[((uia) this).field_h - 1]));
    }

    final int g(int param0, int param1) {
        int var3 = aia.a(((uia) this).field_g, ((uia) this).field_h, 80, param0);
        ((uia) this).a(var3, (byte) -60);
        if (param1 != 64) {
            field_f = null;
        }
        return var3;
    }

    final void f(int param0, int param1) {
        int fieldTemp$0 = ((uia) this).field_h;
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[fieldTemp$0] = (byte)(param1 >> 8);
        int fieldTemp$1 = ((uia) this).field_h;
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[fieldTemp$1] = (byte)param1;
        if (param0 != -1477662136) {
            String discarded$2 = ((uia) this).f(64);
        }
    }

    final boolean a(byte param0) {
        ((uia) this).field_h = ((uia) this).field_h - 4;
        int var2 = aia.a(((uia) this).field_g, ((uia) this).field_h, param0 ^ -27, 0);
        int var3 = ((uia) this).e(-56);
        if (param0 != 114) {
            String discarded$0 = ((uia) this).c(20);
        }
        if (var2 == var3) {
            return true;
        }
        return false;
    }

    final void a(String param0, byte param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        try {
            var3_int = param0.indexOf(' ');
            if (!(var3_int < 0)) {
                throw new IllegalArgumentException("");
            }
            int fieldTemp$0 = ((uia) this).field_h;
            ((uia) this).field_h = ((uia) this).field_h + 1;
            ((uia) this).field_g[fieldTemp$0] = (byte)param1;
            var4 = (CharSequence) (Object) param0;
            ((uia) this).field_h = ((uia) this).field_h + laa.a(((uia) this).field_h, param0.length(), ((uia) this).field_g, 0, var4, (byte) -4);
            int fieldTemp$1 = ((uia) this).field_h;
            ((uia) this).field_h = ((uia) this).field_h + 1;
            ((uia) this).field_g[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "uia.V(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final int h(int param0) {
        if (param0 != 255) {
            field_f = null;
        }
        int fieldTemp$0 = ((uia) this).field_h;
        ((uia) this).field_h = ((uia) this).field_h + 1;
        return 255 & ((uia) this).field_g[fieldTemp$0];
    }

    final String c(int param0) {
        if (param0 != -28690) {
            return null;
        }
        if (((uia) this).field_g[((uia) this).field_h] == 0) {
            ((uia) this).field_h = ((uia) this).field_h + 1;
            return null;
        }
        return ((uia) this).e((byte) -76);
    }

    final void c(int param0, int param1) {
        int var3 = -74 % ((78 - param1) / 41);
        if (!((param0 & -128) == 0)) {
            if (0 != (param0 & -16384)) {
                if (!((-2097152 & param0) == 0)) {
                    if ((-268435456 & param0) != 0) {
                        ((uia) this).i(param0 >>> 28 | 128, 0);
                    }
                    ((uia) this).i(param0 >>> 21 | 128, 0);
                }
                ((uia) this).i(param0 >>> 14 | 128, 0);
            }
            ((uia) this).i(128 | param0 >>> 7, 0);
        }
        ((uia) this).i(param0 & 127, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Open";
    }
}
