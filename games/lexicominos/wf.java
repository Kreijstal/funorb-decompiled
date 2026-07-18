/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wf extends kd {
    int field_h;
    static int field_i;
    byte[] field_j;

    final void d(int param0, int param1) {
        int var3 = -42 / ((param1 - -24) / 58);
        int fieldTemp$0 = ((wf) this).field_h;
        ((wf) this).field_h = ((wf) this).field_h + 1;
        ((wf) this).field_j[fieldTemp$0] = (byte)(param0 >> 16);
        int fieldTemp$1 = ((wf) this).field_h;
        ((wf) this).field_h = ((wf) this).field_h + 1;
        ((wf) this).field_j[fieldTemp$1] = (byte)(param0 >> 8);
        int fieldTemp$2 = ((wf) this).field_h;
        ((wf) this).field_h = ((wf) this).field_h + 1;
        ((wf) this).field_j[fieldTemp$2] = (byte)param0;
    }

    final void a(int param0, java.math.BigInteger param1, java.math.BigInteger param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
            var4_int = ((wf) this).field_h;
            ((wf) this).field_h = 0;
            var5 = new byte[var4_int];
            if (param0 > -92) {
                ((wf) this).f(22, 54);
            }
            ((wf) this).a(123, var4_int, 0, var5);
            var6 = new java.math.BigInteger(var5);
            var7 = var6.modPow(param2, param1);
            var8 = var7.toByteArray();
            ((wf) this).field_h = 0;
            ((wf) this).e(92, var8.length);
            ((wf) this).a(0, var8, 255, var8.length);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "wf.W(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, String param1) {
        RuntimeException var3 = null;
        long var3_long = 0L;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var10 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var3_long = 0L;
            var5 = (long)param0;
            var7 = param1.length();
            var8 = 19;
            L1: while (true) {
              if (var8 < 0) {
                this.a(-17131, var3_long);
                this.a(param0 + -17131, var5);
                break L0;
              } else {
                var3_long = var3_long * 38L;
                if (~var7 < ~var8) {
                  L2: {
                    L3: {
                      var9 = param1.charAt(var8);
                      if (var9 < 65) {
                        break L3;
                      } else {
                        if (var9 <= 90) {
                          var3_long = var3_long + (long)(-63 - -var9);
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
                        if (var9 <= 122) {
                          var3_long = var3_long + (long)(-97 + var9 + 2);
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (var9 < 48) {
                        break L5;
                      } else {
                        if (var9 <= 57) {
                          var3_long = var3_long + (long)(-48 + (28 + var9));
                          break L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var3_long = var3_long + 1L;
                    break L2;
                  }
                  L6: {
                    if (var8 != 10) {
                      break L6;
                    } else {
                      var5 = var3_long;
                      var3_long = 0L;
                      break L6;
                    }
                  }
                  var8--;
                  continue L1;
                } else {
                  L7: {
                    if (var8 != 10) {
                      break L7;
                    } else {
                      var5 = var3_long;
                      var3_long = 0L;
                      break L7;
                    }
                  }
                  var8--;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var3;
            stackOut_25_1 = new StringBuilder().append("wf.DA(").append(param0).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ')');
        }
    }

    final byte e(boolean param0) {
        if (!param0) {
            field_i = 88;
        }
        int fieldTemp$0 = ((wf) this).field_h;
        ((wf) this).field_h = ((wf) this).field_h + 1;
        return ((wf) this).field_j[fieldTemp$0];
    }

    final int h(byte param0) {
        if (param0 > -33) {
            return 40;
        }
        int var2 = ((wf) this).field_j[((wf) this).field_h] & 255;
        if (var2 < 128) {
            return ((wf) this).d(true);
        }
        return -32768 + ((wf) this).b(-1698573656);
    }

    final int d(byte param0) {
        ((wf) this).field_h = ((wf) this).field_h + 4;
        if (param0 != 19) {
            ((wf) this).e(-33, 27);
        }
        return (((wf) this).field_j[((wf) this).field_h - 1] & 255) + ((((wf) this).field_j[((wf) this).field_h - 2] & 255) << 8) + ((16711680 & ((wf) this).field_j[-3 + ((wf) this).field_h] << 16) + (-16777216 & ((wf) this).field_j[-4 + ((wf) this).field_h] << 24));
    }

    final long f(byte param0) {
        int var2 = 70 / ((-39 - param0) / 40);
        long var3 = 4294967295L & (long)((wf) this).d((byte) 19);
        long var5 = 4294967295L & (long)((wf) this).d((byte) 19);
        return (var3 << 32) - -var5;
    }

    final void a(int param0, int param1, int param2, int[] param3) {
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
        var13 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = ((wf) this).field_h;
              if (param0 == 4) {
                break L1;
              } else {
                ((wf) this).field_h = 48;
                break L1;
              }
            }
            ((wf) this).field_h = param2;
            var6 = (-param2 + param1) / 8;
            var7 = 0;
            L2: while (true) {
              if (var7 >= var6) {
                ((wf) this).field_h = var5_int;
                break L0;
              } else {
                var8 = ((wf) this).d((byte) 19);
                var9 = ((wf) this).d((byte) 19);
                var10 = -957401312;
                var11 = -1640531527;
                var12 = 32;
                L3: while (true) {
                  int incrementValue$1 = var12;
                  var12--;
                  if (incrementValue$1 <= 0) {
                    ((wf) this).field_h = ((wf) this).field_h - 8;
                    ((wf) this).f(var8, -32287);
                    ((wf) this).f(var9, -32287);
                    var7++;
                    continue L2;
                  } else {
                    var9 = var9 - ((var8 << 4 ^ var8 >>> 5) - -var8 ^ var10 + param3[var10 >>> 11 & -85983229]);
                    var10 = var10 - var11;
                    var8 = var8 - ((var9 >>> 5 ^ var9 << 4) + var9 ^ var10 - -param3[3 & var10]);
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
            stackOut_11_1 = new StringBuilder().append("wf.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
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
          throw ld.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    final int a(byte param0) {
        if (param0 != 50) {
            return -3;
        }
        if (((wf) this).field_j[((wf) this).field_h] < 0) {
            return 2147483647 & ((wf) this).d((byte) 19);
        }
        return ((wf) this).b(-1698573656);
    }

    final void b(int param0, byte param1) {
        ((wf) this).field_j[-param0 + ((wf) this).field_h - 2] = (byte)(param0 >> 8);
        if (param1 != 26) {
            ((wf) this).field_h = 29;
        }
        ((wf) this).field_j[((wf) this).field_h + -param0 + -1] = (byte)param0;
    }

    final void a(byte param0, String param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        try {
            var3_int = param1.indexOf(' ');
            if (var3_int >= 0) {
                throw new IllegalArgumentException("");
            }
            int fieldTemp$0 = ((wf) this).field_h;
            ((wf) this).field_h = ((wf) this).field_h + 1;
            ((wf) this).field_j[fieldTemp$0] = (byte) 0;
            if (param0 != -38) {
                field_i = 51;
            }
            var4 = (CharSequence) (Object) param1;
            ((wf) this).field_h = ((wf) this).field_h + nl.a(param1.length(), 0, (byte) -80, ((wf) this).field_j, var4, ((wf) this).field_h);
            int fieldTemp$1 = ((wf) this).field_h;
            ((wf) this).field_h = ((wf) this).field_h + 1;
            ((wf) this).field_j[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "wf.KA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String e(byte param0) {
        if (0 == ((wf) this).field_j[((wf) this).field_h]) {
            ((wf) this).field_h = ((wf) this).field_h + 1;
            return null;
        }
        if (param0 > -46) {
            ((wf) this).field_h = -125;
        }
        return ((wf) this).c(false);
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
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 >= 77) {
                break L1;
              } else {
                ((wf) this).field_h = -24;
                break L1;
              }
            }
            var5_int = param2;
            L2: while (true) {
              if (param2 - -param1 <= var5_int) {
                break L0;
              } else {
                int fieldTemp$8 = ((wf) this).field_h;
                ((wf) this).field_h = ((wf) this).field_h + 1;
                param3[var5_int] = ((wf) this).field_j[fieldTemp$8];
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
            stackOut_7_1 = new StringBuilder().append("wf.TA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
          throw ld.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    final void b(int param0, int param1) {
        if (param1 != -14820) {
            ((wf) this).a(-40L, -80);
        }
        ((wf) this).field_j[-4 + -param0 + ((wf) this).field_h] = (byte)(param0 >> 24);
        ((wf) this).field_j[((wf) this).field_h - param0 - 3] = (byte)(param0 >> 16);
        ((wf) this).field_j[-param0 + ((wf) this).field_h + -2] = (byte)(param0 >> 8);
        ((wf) this).field_j[((wf) this).field_h - (param0 + 1)] = (byte)param0;
    }

    final void a(int param0, byte[] param1, int param2, int param3) {
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
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == 255) {
                break L1;
              } else {
                var7 = null;
                ((wf) this).a(50, -31, -30, (int[]) null);
                break L1;
              }
            }
            var5_int = param0;
            L2: while (true) {
              if (var5_int >= param0 + param3) {
                break L0;
              } else {
                int fieldTemp$7 = ((wf) this).field_h;
                ((wf) this).field_h = ((wf) this).field_h + 1;
                ((wf) this).field_j[fieldTemp$7] = param1[var5_int];
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
            stackOut_7_1 = new StringBuilder().append("wf.L(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
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
          throw ld.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void e(int param0, byte param1) {
        int var4 = Lexicominos.field_L ? 1 : 0;
        if (param1 != 82) {
            return;
        }
        while (param0 > ((wf) this).field_h) {
            int fieldTemp$0 = ((wf) this).field_h;
            ((wf) this).field_h = ((wf) this).field_h + 1;
            ((wf) this).field_j[fieldTemp$0] = (byte) 0;
        }
    }

    final int c(byte param0) {
        int var2 = 255 & ((wf) this).field_j[((wf) this).field_h];
        if (param0 != -10) {
            ((wf) this).field_h = 56;
        }
        if (128 <= var2) {
            return -49152 + ((wf) this).b(-1698573656);
        }
        return ((wf) this).d(true) + -64;
    }

    final void a(long param0, int param1) {
        int fieldTemp$0 = ((wf) this).field_h;
        ((wf) this).field_h = ((wf) this).field_h + 1;
        ((wf) this).field_j[fieldTemp$0] = (byte)(int)(param0 >> 32);
        int fieldTemp$1 = ((wf) this).field_h;
        ((wf) this).field_h = ((wf) this).field_h + 1;
        ((wf) this).field_j[fieldTemp$1] = (byte)(int)(param0 >> 24);
        if (param1 != 687419600) {
            boolean discarded$2 = ((wf) this).c(-56);
        }
        int fieldTemp$3 = ((wf) this).field_h;
        ((wf) this).field_h = ((wf) this).field_h + 1;
        ((wf) this).field_j[fieldTemp$3] = (byte)(int)(param0 >> 16);
        int fieldTemp$4 = ((wf) this).field_h;
        ((wf) this).field_h = ((wf) this).field_h + 1;
        ((wf) this).field_j[fieldTemp$4] = (byte)(int)(param0 >> 8);
        int fieldTemp$5 = ((wf) this).field_h;
        ((wf) this).field_h = ((wf) this).field_h + 1;
        ((wf) this).field_j[fieldTemp$5] = (byte)(int)param0;
    }

    final void c(int param0, byte param1) {
        if (!((-128 & param0) == 0)) {
            if ((-16384 & param0) != 0) {
                if (!((param0 & -2097152) == -1)) {
                    if (!(-1 == (param0 & -268435456))) {
                        ((wf) this).c(param0 >>> 28 | 128, -1);
                    }
                    ((wf) this).c(param0 >>> 21 | 128, -1);
                }
                ((wf) this).c(param0 >>> 14 | 128, -1);
            }
            ((wf) this).c((param0 | 16409) >>> 7, -1);
        }
        ((wf) this).c(127 & param0, -1);
        int var3 = -83 / ((param1 - -37) / 45);
    }

    final void c(int param0, int param1) {
        int fieldTemp$0 = ((wf) this).field_h;
        ((wf) this).field_h = ((wf) this).field_h + 1;
        ((wf) this).field_j[fieldTemp$0] = (byte)param0;
        if (param1 != -1) {
            ((wf) this).field_j = null;
        }
    }

    final int a(int param0) {
        if (param0 < 59) {
            return 108;
        }
        ((wf) this).field_h = ((wf) this).field_h + 3;
        return (((wf) this).field_j[-1 + ((wf) this).field_h] & 255) + ((255 & ((wf) this).field_j[-2 + ((wf) this).field_h]) << 8) + (16711680 & ((wf) this).field_j[((wf) this).field_h + -3] << 16);
    }

    final void a(String param0, byte param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        try {
            var3_int = param0.indexOf(' ');
            if (var3_int >= 0) {
                throw new IllegalArgumentException("");
            }
            var4 = (CharSequence) (Object) param0;
            ((wf) this).field_h = ((wf) this).field_h + nl.a(param0.length(), 0, (byte) -107, ((wf) this).field_j, var4, ((wf) this).field_h);
            int fieldTemp$0 = ((wf) this).field_h;
            ((wf) this).field_h = ((wf) this).field_h + 1;
            ((wf) this).field_j[fieldTemp$0] = (byte)param1;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "wf.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(int param0, long param1) {
        int fieldTemp$0 = ((wf) this).field_h;
        ((wf) this).field_h = ((wf) this).field_h + 1;
        ((wf) this).field_j[fieldTemp$0] = (byte)(int)(param1 >> 48);
        int fieldTemp$1 = ((wf) this).field_h;
        ((wf) this).field_h = ((wf) this).field_h + 1;
        ((wf) this).field_j[fieldTemp$1] = (byte)(int)(param1 >> 40);
        int fieldTemp$2 = ((wf) this).field_h;
        ((wf) this).field_h = ((wf) this).field_h + 1;
        ((wf) this).field_j[fieldTemp$2] = (byte)(int)(param1 >> 32);
        int fieldTemp$3 = ((wf) this).field_h;
        ((wf) this).field_h = ((wf) this).field_h + 1;
        ((wf) this).field_j[fieldTemp$3] = (byte)(int)(param1 >> 24);
        int fieldTemp$4 = ((wf) this).field_h;
        ((wf) this).field_h = ((wf) this).field_h + 1;
        ((wf) this).field_j[fieldTemp$4] = (byte)(int)(param1 >> 16);
        if (param0 != -17131) {
            Object var5 = null;
            jb[] discarded$5 = wf.a((sh) null, (String) null, true, (String) null);
        }
        int fieldTemp$6 = ((wf) this).field_h;
        ((wf) this).field_h = ((wf) this).field_h + 1;
        ((wf) this).field_j[fieldTemp$6] = (byte)(int)(param1 >> 8);
        int fieldTemp$7 = ((wf) this).field_h;
        ((wf) this).field_h = ((wf) this).field_h + 1;
        ((wf) this).field_j[fieldTemp$7] = (byte)(int)param1;
    }

    final void e(int param0, int param1) {
        if (param0 <= 49) {
            return;
        }
        int fieldTemp$0 = ((wf) this).field_h;
        ((wf) this).field_h = ((wf) this).field_h + 1;
        ((wf) this).field_j[fieldTemp$0] = (byte)(param1 >> 8);
        int fieldTemp$1 = ((wf) this).field_h;
        ((wf) this).field_h = ((wf) this).field_h + 1;
        ((wf) this).field_j[fieldTemp$1] = (byte)param1;
    }

    final boolean c(int param0) {
        ((wf) this).field_h = ((wf) this).field_h - param0;
        int var2 = oh.a(0, ((wf) this).field_j, false, ((wf) this).field_h);
        int var3 = ((wf) this).d((byte) 19);
        if (var2 != var3) {
            return false;
        }
        return true;
    }

    final void a(int param0, int param1) {
        if (param1 < 64) {
            if (param1 >= -64) {
                ((wf) this).c(param1 - -64, -1);
                return;
            }
        }
        if (param1 < 16384) {
            if (!(param1 < -16384)) {
                ((wf) this).e(80, 49152 + param1);
                return;
            }
        }
        if (param0 < 100) {
            field_i = -41;
        }
        throw new IllegalArgumentException();
    }

    final void a(int param0, int[] param1) {
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
        var10 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = ((wf) this).field_h / 8;
              ((wf) this).field_h = 0;
              if (param0 == -661454965) {
                break L1;
              } else {
                ((wf) this).field_j = null;
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var4 >= var3_int) {
                break L0;
              } else {
                var5 = ((wf) this).d((byte) 19);
                var6 = ((wf) this).d((byte) 19);
                var7 = 0;
                var8 = -1640531527;
                var9 = 32;
                L3: while (true) {
                  int incrementValue$1 = var9;
                  var9--;
                  if (incrementValue$1 <= 0) {
                    ((wf) this).field_h = ((wf) this).field_h - 8;
                    ((wf) this).f(var5, -32287);
                    ((wf) this).f(var6, param0 + 661422678);
                    var4++;
                    continue L2;
                  } else {
                    var5 = var5 + (var6 + (var6 >>> 5 ^ var6 << 4) ^ var7 + param1[var7 & 3]);
                    var7 = var7 + var8;
                    var6 = var6 + ((var5 << 4 ^ var5 >>> 5) + var5 ^ var7 + param1[(var7 & 6359) >>> 11]);
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
            stackOut_10_1 = new StringBuilder().append("wf.FA(").append(param0).append(',');
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
          throw ld.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    final int g(byte param0) {
        int var4 = Lexicominos.field_L ? 1 : 0;
        int fieldTemp$0 = ((wf) this).field_h;
        ((wf) this).field_h = ((wf) this).field_h + 1;
        int var2 = ((wf) this).field_j[fieldTemp$0];
        if (param0 > -72) {
            field_i = -94;
        }
        int var3 = 0;
        while (0 > var2) {
            var3 = (var3 | 127 & var2) << 7;
            int fieldTemp$1 = ((wf) this).field_h;
            ((wf) this).field_h = ((wf) this).field_h + 1;
            var2 = ((wf) this).field_j[fieldTemp$1];
        }
        return var2 | var3;
    }

    final void a(long param0, byte param1) {
        int fieldTemp$0 = ((wf) this).field_h;
        ((wf) this).field_h = ((wf) this).field_h + 1;
        ((wf) this).field_j[fieldTemp$0] = (byte)(int)(param0 >> 56);
        int fieldTemp$1 = ((wf) this).field_h;
        ((wf) this).field_h = ((wf) this).field_h + 1;
        ((wf) this).field_j[fieldTemp$1] = (byte)(int)(param0 >> 48);
        int fieldTemp$2 = ((wf) this).field_h;
        ((wf) this).field_h = ((wf) this).field_h + 1;
        ((wf) this).field_j[fieldTemp$2] = (byte)(int)(param0 >> 40);
        int fieldTemp$3 = ((wf) this).field_h;
        ((wf) this).field_h = ((wf) this).field_h + 1;
        ((wf) this).field_j[fieldTemp$3] = (byte)(int)(param0 >> 32);
        int fieldTemp$4 = ((wf) this).field_h;
        ((wf) this).field_h = ((wf) this).field_h + 1;
        ((wf) this).field_j[fieldTemp$4] = (byte)(int)(param0 >> 24);
        int fieldTemp$5 = ((wf) this).field_h;
        ((wf) this).field_h = ((wf) this).field_h + 1;
        ((wf) this).field_j[fieldTemp$5] = (byte)(int)(param0 >> 16);
        int fieldTemp$6 = ((wf) this).field_h;
        ((wf) this).field_h = ((wf) this).field_h + 1;
        ((wf) this).field_j[fieldTemp$6] = (byte)(int)(param0 >> 8);
        int fieldTemp$7 = ((wf) this).field_h;
        ((wf) this).field_h = ((wf) this).field_h + 1;
        ((wf) this).field_j[fieldTemp$7] = (byte)(int)param0;
        if (param1 != 37) {
            ((wf) this).field_j = null;
        }
    }

    final void f(int param0, int param1) {
        int fieldTemp$0 = ((wf) this).field_h;
        ((wf) this).field_h = ((wf) this).field_h + 1;
        ((wf) this).field_j[fieldTemp$0] = (byte)(param0 >> 24);
        int fieldTemp$1 = ((wf) this).field_h;
        ((wf) this).field_h = ((wf) this).field_h + 1;
        ((wf) this).field_j[fieldTemp$1] = (byte)(param0 >> 16);
        int fieldTemp$2 = ((wf) this).field_h;
        ((wf) this).field_h = ((wf) this).field_h + 1;
        ((wf) this).field_j[fieldTemp$2] = (byte)(param0 >> 8);
        if (param1 != -32287) {
            return;
        }
        int fieldTemp$3 = ((wf) this).field_h;
        ((wf) this).field_h = ((wf) this).field_h + 1;
        ((wf) this).field_j[fieldTemp$3] = (byte)param0;
    }

    final int a(int param0, byte param1) {
        int var3 = oh.a(param0, ((wf) this).field_j, false, ((wf) this).field_h);
        if (param1 < 11) {
            ((wf) this).field_h = -95;
        }
        ((wf) this).f(var3, -32287);
        return var3;
    }

    final String c(boolean param0) {
        int var2 = ((wf) this).field_h;
        while (true) {
            int fieldTemp$0 = ((wf) this).field_h;
            ((wf) this).field_h = ((wf) this).field_h + 1;
            if (((wf) this).field_j[fieldTemp$0] == 0) {
                break;
            }
        }
        if (param0) {
            return null;
        }
        int var3 = -1 + (((wf) this).field_h + -var2);
        if (!(var3 != 0)) {
            return "";
        }
        return dc.a(var3, ((wf) this).field_j, (byte) 16, var2);
    }

    final static jb[] a(sh param0, String param1, boolean param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        jb[] stackIn_3_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        jb[] stackOut_2_0 = null;
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
        try {
          L0: {
            var4_int = param0.c(param1, (byte) -89);
            var5 = param0.a(param3, -27964, var4_int);
            stackOut_2_0 = oc.a(param0, var5, var4_int, 20);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("wf.IA(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
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
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(true).append(',');
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
          throw ld.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    final void d(int param0, byte param1) {
        if (param1 >= -117) {
            ((wf) this).field_h = 73;
        }
        ((wf) this).field_j[((wf) this).field_h + -param0 + -1] = (byte)param0;
    }

    final String d(int param0) {
        int fieldTemp$0 = ((wf) this).field_h;
        ((wf) this).field_h = ((wf) this).field_h + 1;
        int var2 = ((wf) this).field_j[fieldTemp$0];
        if (!(param0 == var2)) {
            throw new IllegalStateException("");
        }
        int var3 = ((wf) this).field_h;
        while (true) {
            int fieldTemp$1 = ((wf) this).field_h;
            ((wf) this).field_h = ((wf) this).field_h + 1;
            if (((wf) this).field_j[fieldTemp$1] == 0) {
                break;
            }
        }
        int var4 = ((wf) this).field_h + (-var3 + -1);
        if (var4 == 0) {
            return "";
        }
        return dc.a(var4, ((wf) this).field_j, (byte) 16, var3);
    }

    final int b(int param0) {
        ((wf) this).field_h = ((wf) this).field_h + 2;
        if (param0 != -1698573656) {
            field_i = -127;
        }
        return (((wf) this).field_j[-1 + ((wf) this).field_h] & 255) + ((((wf) this).field_j[-2 + ((wf) this).field_h] & 255) << 8);
    }

    final int d(boolean param0) {
        if (!param0) {
            ((wf) this).a(-39, 20);
        }
        int fieldTemp$0 = ((wf) this).field_h;
        ((wf) this).field_h = ((wf) this).field_h + 1;
        return ((wf) this).field_j[fieldTemp$0] & 255;
    }

    wf(int param0) {
        ((wf) this).field_j = ph.a(-126, param0);
        ((wf) this).field_h = 0;
    }

    wf(byte[] param0) {
        try {
            ((wf) this).field_j = param0;
            ((wf) this).field_h = 0;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "wf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
