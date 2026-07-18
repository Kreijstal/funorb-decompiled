/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ds extends ksa {
    static int field_g;
    int field_e;
    static int field_d;
    byte[] field_h;
    static String field_f;

    final int f(int param0) {
        if (param0 < 28) {
            return -68;
        }
        int var2 = ((ds) this).field_h[((ds) this).field_e] & 255;
        if (var2 >= 128) {
            return ((ds) this).e(1869) - 32768;
        }
        return ((ds) this).e((byte) -110);
    }

    final int n(int param0) {
        if (param0 != -24099) {
            field_f = null;
        }
        if (((ds) this).field_h[((ds) this).field_e] < 0) {
            return ((ds) this).h(112) & 2147483647;
        }
        return ((ds) this).e(param0 ^ -22896);
    }

    final void a(byte param0, String param1) {
        long var3_long = 0L;
        RuntimeException var3 = null;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
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
        var10 = VoidHunters.field_G;
        try {
          L0: {
            var3_long = 0L;
            var5 = 0L;
            var7 = param1.length();
            var8 = 19;
            L1: while (true) {
              if (0 > var8) {
                if (param0 == -53) {
                  this.a(var3_long, false);
                  this.a(var5, false);
                  break L0;
                } else {
                  return;
                }
              } else {
                L2: {
                  var3_long = var3_long * 38L;
                  if (var7 <= var8) {
                    break L2;
                  } else {
                    L3: {
                      var9 = param1.charAt(var8);
                      if (var9 < 65) {
                        break L3;
                      } else {
                        if (var9 > 90) {
                          break L3;
                        } else {
                          var3_long = var3_long + (long)(-65 + var9 + 2);
                          break L2;
                        }
                      }
                    }
                    L4: {
                      if (var9 < 97) {
                        break L4;
                      } else {
                        if (var9 <= 122) {
                          var3_long = var3_long + (long)(2 + (var9 + -97));
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
                        if (var9 > 57) {
                          break L5;
                        } else {
                          var3_long = var3_long + (long)(-48 + (28 - -var9));
                          break L2;
                        }
                      }
                    }
                    var3_long = var3_long + 1L;
                    break L2;
                  }
                }
                L6: {
                  if (10 == var8) {
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
            stackOut_23_0 = (RuntimeException) var3;
            stackOut_23_1 = new StringBuilder().append("ds.RA(").append(param0).append(',');
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
          throw rta.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
    }

    final int d(int param0) {
        if (param0 != 0) {
            int discarded$0 = ((ds) this).g(101, -115);
        }
        int var2 = 255 & ((ds) this).field_h[((ds) this).field_e];
        if (var2 < 128) {
            return -64 + ((ds) this).e((byte) -89);
        }
        return ((ds) this).e(1869) - 49152;
    }

    final void b(int param0, int param1) {
        if (param1 < 115) {
            int discarded$0 = ((ds) this).e((byte) -63);
        }
        if (param0 < 64) {
            if (!(param0 < -64)) {
                ((ds) this).c(0, param0 + 64);
                return;
            }
        }
        if (param0 < 16384) {
            if (!(param0 < -16384)) {
                ((ds) this).a(param0 + 49152, true);
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    final int l(int param0) {
        int var4 = VoidHunters.field_G;
        if (param0 != 11436) {
            ((ds) this).field_e = -36;
        }
        int fieldTemp$0 = ((ds) this).field_e;
        ((ds) this).field_e = ((ds) this).field_e + 1;
        int var2 = ((ds) this).field_h[fieldTemp$0];
        int var3 = 0;
        while (var2 < 0) {
            var3 = (var3 | var2 & 127) << 7;
            int fieldTemp$1 = ((ds) this).field_e;
            ((ds) this).field_e = ((ds) this).field_e + 1;
            var2 = ((ds) this).field_h[fieldTemp$1];
        }
        return var3 | var2;
    }

    final void a(int param0, int[] param1, int param2, boolean param3) {
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
        var13 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var5_int = ((ds) this).field_e;
              ((ds) this).field_e = param0;
              var6 = (param2 - param0) / 8;
              if (!param3) {
                break L1;
              } else {
                ((ds) this).field_h = null;
                break L1;
              }
            }
            var7 = 0;
            L2: while (true) {
              if (var7 >= var6) {
                ((ds) this).field_e = var5_int;
                break L0;
              } else {
                var8 = ((ds) this).h(82);
                var9 = ((ds) this).h(17);
                var10 = -957401312;
                var11 = -1640531527;
                var12 = 32;
                L3: while (true) {
                  int incrementValue$1 = var12;
                  var12--;
                  if (incrementValue$1 <= 0) {
                    ((ds) this).field_e = ((ds) this).field_e - 8;
                    ((ds) this).d(var8, 332614536);
                    ((ds) this).d(var9, 332614536);
                    var7++;
                    continue L2;
                  } else {
                    var9 = var9 - ((var8 << 4 ^ var8 >>> 5) + var8 ^ var10 + param1[(var10 & 7618) >>> 11]);
                    var10 = var10 - var11;
                    var8 = var8 - (var9 + (var9 >>> 5 ^ var9 << 4) ^ var10 + param1[var10 & 3]);
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
            stackOut_11_1 = new StringBuilder().append("ds.CA(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void c(int param0, int param1) {
        if (param0 != 0) {
            ((ds) this).a(false, 53);
        }
        int fieldTemp$0 = ((ds) this).field_e;
        ((ds) this).field_e = ((ds) this).field_e + 1;
        ((ds) this).field_h[fieldTemp$0] = (byte)param1;
    }

    final int i(int param0) {
        ((ds) this).field_e = ((ds) this).field_e + 4;
        if (param0 != 11468) {
            return 54;
        }
        return (((ds) this).field_h[((ds) this).field_e + -4] & 255) + (16711680 & ((ds) this).field_h[((ds) this).field_e - 2] << 16) + (-16777216 & ((ds) this).field_h[((ds) this).field_e - 1] << 24) + (65280 & ((ds) this).field_h[-3 + ((ds) this).field_e] << 8);
    }

    final void a(boolean param0, String param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        try {
            var3_int = param1.indexOf(' ');
            if (0 <= var3_int) {
                throw new IllegalArgumentException("");
            }
            var4 = (CharSequence) (Object) param1;
            ((ds) this).field_e = ((ds) this).field_e + ac.a(0, param0, param1.length(), var4, ((ds) this).field_h, ((ds) this).field_e);
            int fieldTemp$0 = ((ds) this).field_e;
            ((ds) this).field_e = ((ds) this).field_e + 1;
            ((ds) this).field_h[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "ds.HA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, byte param1) {
        int var4 = VoidHunters.field_G;
        if (param1 != 66) {
            field_f = null;
        }
        while (param0 > ((ds) this).field_e) {
            int fieldTemp$0 = ((ds) this).field_e;
            ((ds) this).field_e = ((ds) this).field_e + 1;
            ((ds) this).field_h[fieldTemp$0] = (byte) 0;
        }
    }

    final void e(int param0, int param1) {
        ((ds) this).field_h[-1 + (-param0 + ((ds) this).field_e)] = (byte)param0;
        if (param1 != -129) {
            byte discarded$0 = ((ds) this).d((byte) -76);
        }
    }

    final byte d(byte param0) {
        if (param0 != -114) {
            ((ds) this).a(1, (byte) -81);
        }
        int fieldTemp$0 = ((ds) this).field_e;
        ((ds) this).field_e = ((ds) this).field_e + 1;
        return ((ds) this).field_h[fieldTemp$0];
    }

    final void a(long param0, int param1) {
        int fieldTemp$0 = ((ds) this).field_e;
        ((ds) this).field_e = ((ds) this).field_e + 1;
        ((ds) this).field_h[fieldTemp$0] = (byte)(int)(param0 >> 56);
        if (param1 <= 88) {
            return;
        }
        int fieldTemp$1 = ((ds) this).field_e;
        ((ds) this).field_e = ((ds) this).field_e + 1;
        ((ds) this).field_h[fieldTemp$1] = (byte)(int)(param0 >> 48);
        int fieldTemp$2 = ((ds) this).field_e;
        ((ds) this).field_e = ((ds) this).field_e + 1;
        ((ds) this).field_h[fieldTemp$2] = (byte)(int)(param0 >> 40);
        int fieldTemp$3 = ((ds) this).field_e;
        ((ds) this).field_e = ((ds) this).field_e + 1;
        ((ds) this).field_h[fieldTemp$3] = (byte)(int)(param0 >> 32);
        int fieldTemp$4 = ((ds) this).field_e;
        ((ds) this).field_e = ((ds) this).field_e + 1;
        ((ds) this).field_h[fieldTemp$4] = (byte)(int)(param0 >> 24);
        int fieldTemp$5 = ((ds) this).field_e;
        ((ds) this).field_e = ((ds) this).field_e + 1;
        ((ds) this).field_h[fieldTemp$5] = (byte)(int)(param0 >> 16);
        int fieldTemp$6 = ((ds) this).field_e;
        ((ds) this).field_e = ((ds) this).field_e + 1;
        ((ds) this).field_h[fieldTemp$6] = (byte)(int)(param0 >> 8);
        int fieldTemp$7 = ((ds) this).field_e;
        ((ds) this).field_e = ((ds) this).field_e + 1;
        ((ds) this).field_h[fieldTemp$7] = (byte)(int)param0;
    }

    final int g(int param0, int param1) {
        int var3 = k.a((byte) -69, ((ds) this).field_e, ((ds) this).field_h, param1);
        ((ds) this).d(var3, 332614536);
        if (param0 != 1595) {
            boolean discarded$0 = ((ds) this).c(-60);
        }
        return var3;
    }

    final void b(byte param0, String param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        try {
            var3_int = param1.indexOf(' ');
            if (!(var3_int < 0)) {
                throw new IllegalArgumentException("");
            }
            int fieldTemp$0 = ((ds) this).field_e;
            ((ds) this).field_e = ((ds) this).field_e + 1;
            ((ds) this).field_h[fieldTemp$0] = (byte) 0;
            var4 = (CharSequence) (Object) param1;
            ((ds) this).field_e = ((ds) this).field_e + ac.a(0, true, param1.length(), var4, ((ds) this).field_h, ((ds) this).field_e);
            int fieldTemp$1 = ((ds) this).field_e;
            ((ds) this).field_e = ((ds) this).field_e + 1;
            ((ds) this).field_h[fieldTemp$1] = (byte)param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "ds.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final long k(int param0) {
        if (param0 != 255) {
            field_g = 3;
        }
        long var2 = 4294967295L & (long)((ds) this).h(21);
        long var4 = (long)((ds) this).h(41) & 4294967295L;
        return (var2 << 32) - -var4;
    }

    final void a(int param0, byte param1) {
        if (param1 != 125) {
            ((ds) this).field_e = 30;
        }
        int fieldTemp$0 = ((ds) this).field_e;
        ((ds) this).field_e = ((ds) this).field_e + 1;
        ((ds) this).field_h[fieldTemp$0] = (byte)(param0 >> 16);
        int fieldTemp$1 = ((ds) this).field_e;
        ((ds) this).field_e = ((ds) this).field_e + 1;
        ((ds) this).field_h[fieldTemp$1] = (byte)(param0 >> 8);
        int fieldTemp$2 = ((ds) this).field_e;
        ((ds) this).field_e = ((ds) this).field_e + 1;
        ((ds) this).field_h[fieldTemp$2] = (byte)param0;
    }

    private final void a(long param0, boolean param1) {
        int fieldTemp$0 = ((ds) this).field_e;
        ((ds) this).field_e = ((ds) this).field_e + 1;
        ((ds) this).field_h[fieldTemp$0] = (byte)(int)(param0 >> 48);
        int fieldTemp$1 = ((ds) this).field_e;
        ((ds) this).field_e = ((ds) this).field_e + 1;
        ((ds) this).field_h[fieldTemp$1] = (byte)(int)(param0 >> 40);
        if (param1) {
            return;
        }
        int fieldTemp$2 = ((ds) this).field_e;
        ((ds) this).field_e = ((ds) this).field_e + 1;
        ((ds) this).field_h[fieldTemp$2] = (byte)(int)(param0 >> 32);
        int fieldTemp$3 = ((ds) this).field_e;
        ((ds) this).field_e = ((ds) this).field_e + 1;
        ((ds) this).field_h[fieldTemp$3] = (byte)(int)(param0 >> 24);
        int fieldTemp$4 = ((ds) this).field_e;
        ((ds) this).field_e = ((ds) this).field_e + 1;
        ((ds) this).field_h[fieldTemp$4] = (byte)(int)(param0 >> 16);
        int fieldTemp$5 = ((ds) this).field_e;
        ((ds) this).field_e = ((ds) this).field_e + 1;
        ((ds) this).field_h[fieldTemp$5] = (byte)(int)(param0 >> 8);
        int fieldTemp$6 = ((ds) this).field_e;
        ((ds) this).field_e = ((ds) this).field_e + 1;
        ((ds) this).field_h[fieldTemp$6] = (byte)(int)param0;
    }

    final void a(int param0, byte[] param1, byte param2, int param3) {
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
        var6 = VoidHunters.field_G;
        try {
          L0: {
            var5_int = param0;
            L1: while (true) {
              if (var5_int >= param3 + param0) {
                L2: {
                  if (param2 == -59) {
                    break L2;
                  } else {
                    ((ds) this).b(-9, (byte) 15);
                    break L2;
                  }
                }
                break L0;
              } else {
                int fieldTemp$2 = ((ds) this).field_e;
                ((ds) this).field_e = ((ds) this).field_e + 1;
                param1[var5_int] = ((ds) this).field_h[fieldTemp$2];
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
            stackOut_7_1 = new StringBuilder().append("ds.AA(").append(param0).append(',');
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
          throw rta.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int[] param0, byte param1) {
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
        var10 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param1 >= 126) {
                break L1;
              } else {
                field_d = 30;
                break L1;
              }
            }
            var3_int = ((ds) this).field_e / 8;
            ((ds) this).field_e = 0;
            var4 = 0;
            L2: while (true) {
              if (var4 >= var3_int) {
                break L0;
              } else {
                var5 = ((ds) this).h(70);
                var6 = ((ds) this).h(103);
                var7 = 0;
                var8 = -1640531527;
                var9 = 32;
                L3: while (true) {
                  int incrementValue$5 = var9;
                  var9--;
                  if (0 >= incrementValue$5) {
                    ((ds) this).field_e = ((ds) this).field_e - 8;
                    ((ds) this).d(var5, 332614536);
                    ((ds) this).d(var6, 332614536);
                    var4++;
                    continue L2;
                  } else {
                    var5 = var5 + (var6 + (var6 >>> 5 ^ var6 << 4) ^ var7 + param0[3 & var7]);
                    var7 = var7 + var8;
                    var6 = var6 + (var7 - -param0[1140850691 & var7 >>> 11] ^ (var5 << 4 ^ var5 >>> 5) + var5);
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
            stackOut_10_1 = new StringBuilder().append("ds.NA(");
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
          throw rta.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1) {
        int var3 = -47 % ((-77 - param1) / 46);
        ((ds) this).field_h[-2 + ((ds) this).field_e + -param0] = (byte)(param0 >> 8);
        ((ds) this).field_h[-1 + -param0 + ((ds) this).field_e] = (byte)param0;
    }

    final int e(byte param0) {
        if (param0 >= -86) {
            return 118;
        }
        int fieldTemp$0 = ((ds) this).field_e;
        ((ds) this).field_e = ((ds) this).field_e + 1;
        return ((ds) this).field_h[fieldTemp$0] & 255;
    }

    final void a(int param0, boolean param1) {
        if (!param1) {
            Object var4 = null;
            ((ds) this).a(90, (byte[]) null, (byte) 40, -7);
        }
        int fieldTemp$0 = ((ds) this).field_e;
        ((ds) this).field_e = ((ds) this).field_e + 1;
        ((ds) this).field_h[fieldTemp$0] = (byte)(param0 >> 8);
        int fieldTemp$1 = ((ds) this).field_e;
        ((ds) this).field_e = ((ds) this).field_e + 1;
        ((ds) this).field_h[fieldTemp$1] = (byte)param0;
    }

    final void a(int param0, long param1) {
        if (param0 < 78) {
            this.a(32L, true);
        }
        int fieldTemp$0 = ((ds) this).field_e;
        ((ds) this).field_e = ((ds) this).field_e + 1;
        ((ds) this).field_h[fieldTemp$0] = (byte)(int)(param1 >> 32);
        int fieldTemp$1 = ((ds) this).field_e;
        ((ds) this).field_e = ((ds) this).field_e + 1;
        ((ds) this).field_h[fieldTemp$1] = (byte)(int)(param1 >> 24);
        int fieldTemp$2 = ((ds) this).field_e;
        ((ds) this).field_e = ((ds) this).field_e + 1;
        ((ds) this).field_h[fieldTemp$2] = (byte)(int)(param1 >> 16);
        int fieldTemp$3 = ((ds) this).field_e;
        ((ds) this).field_e = ((ds) this).field_e + 1;
        ((ds) this).field_h[fieldTemp$3] = (byte)(int)(param1 >> 8);
        int fieldTemp$4 = ((ds) this).field_e;
        ((ds) this).field_e = ((ds) this).field_e + 1;
        ((ds) this).field_h[fieldTemp$4] = (byte)(int)param1;
    }

    ds(int param0) {
        ((ds) this).field_e = 0;
        ((ds) this).field_h = fia.a(110, param0);
    }

    final void f(int param0, int param1) {
        if (param0 != -16384) {
            ((ds) this).field_e = -11;
        }
        if (!((-128 & param1) == 0)) {
            if (!((-16384 & param1) == 0)) {
                if ((-2097152 & param1) != -1) {
                    if (-1 != (param1 & -268435456)) {
                        ((ds) this).c(0, 128 | param1 >>> 28);
                    }
                    ((ds) this).c(param0 + 16384, (270522806 | param1) >>> 21);
                }
                ((ds) this).c(0, 128 | param1 >>> 14);
            }
            ((ds) this).c(0, (param1 | 16466) >>> 7);
        }
        ((ds) this).c(0, 127 & param1);
    }

    final void a(boolean param0, int param1) {
        ((ds) this).field_h[((ds) this).field_e - param1 + -4] = (byte)(param1 >> 24);
        if (param0) {
            return;
        }
        ((ds) this).field_h[-3 + (((ds) this).field_e + -param1)] = (byte)(param1 >> 16);
        ((ds) this).field_h[((ds) this).field_e + -param1 - 2] = (byte)(param1 >> 8);
        ((ds) this).field_h[-1 + (-param1 + ((ds) this).field_e)] = (byte)param1;
    }

    final String g(int param0) {
        int fieldTemp$0 = ((ds) this).field_e;
        ((ds) this).field_e = ((ds) this).field_e + 1;
        int var2 = ((ds) this).field_h[fieldTemp$0];
        if (!(0 == var2)) {
            throw new IllegalStateException("");
        }
        int var3 = ((ds) this).field_e;
        if (param0 != -1609246200) {
            Object var5 = null;
            ((ds) this).a(-12, (byte[]) null, -30, 85);
        }
        while (true) {
            int fieldTemp$1 = ((ds) this).field_e;
            ((ds) this).field_e = ((ds) this).field_e + 1;
            if (0 == ((ds) this).field_h[fieldTemp$1]) {
                break;
            }
        }
        int var4 = -1 + ((ds) this).field_e - var3;
        if (var4 == 0) {
            return "";
        }
        return tja.a(var3, 0, var4, ((ds) this).field_h);
    }

    final void a(byte param0, int param1) {
        int fieldTemp$0 = ((ds) this).field_e;
        ((ds) this).field_e = ((ds) this).field_e + 1;
        ((ds) this).field_h[fieldTemp$0] = (byte)param1;
        int fieldTemp$1 = ((ds) this).field_e;
        ((ds) this).field_e = ((ds) this).field_e + 1;
        ((ds) this).field_h[fieldTemp$1] = (byte)(param1 >> 8);
        int fieldTemp$2 = ((ds) this).field_e;
        ((ds) this).field_e = ((ds) this).field_e + 1;
        ((ds) this).field_h[fieldTemp$2] = (byte)(param1 >> 16);
        int fieldTemp$3 = ((ds) this).field_e;
        ((ds) this).field_e = ((ds) this).field_e + 1;
        ((ds) this).field_h[fieldTemp$3] = (byte)(param1 >> 24);
        if (param0 < 81) {
            ((ds) this).field_h = null;
        }
    }

    final boolean c(int param0) {
        ((ds) this).field_e = ((ds) this).field_e - 4;
        if (param0 != -2780) {
            return false;
        }
        int var2 = k.a((byte) -69, ((ds) this).field_e, ((ds) this).field_h, 0);
        int var3 = ((ds) this).h(26);
        if (var3 != var2) {
            return false;
        }
        return true;
    }

    final int e(int param0) {
        if (param0 != 1869) {
            Object var3 = null;
            ((ds) this).a((java.math.BigInteger) null, (java.math.BigInteger) null, 34);
        }
        ((ds) this).field_e = ((ds) this).field_e + 2;
        return (255 & ((ds) this).field_h[((ds) this).field_e + -1]) + ((((ds) this).field_h[((ds) this).field_e - 2] & 255) << 8);
    }

    public static void j(int param0) {
        field_f = null;
        int var1 = 1;
    }

    final void a(java.math.BigInteger param0, java.math.BigInteger param1, int param2) {
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        int var4_int = ((ds) this).field_e;
        if (param2 != 16711680) {
            return;
        }
        try {
            ((ds) this).field_e = 0;
            var5 = new byte[var4_int];
            ((ds) this).a(0, var5, (byte) -59, var4_int);
            var6 = new java.math.BigInteger(var5);
            var7 = var6.modPow(param1, param0);
            var8 = var7.toByteArray();
            ((ds) this).field_e = 0;
            ((ds) this).a(var8.length, true);
            ((ds) this).a(0, var8, -1, var8.length);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "ds.S(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
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
        var6 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var5_int = param0;
              if (param2 == -1) {
                break L1;
              } else {
                ((ds) this).a(-8, -51L);
                break L1;
              }
            }
            L2: while (true) {
              if (param3 + param0 <= var5_int) {
                break L0;
              } else {
                int fieldTemp$7 = ((ds) this).field_e;
                ((ds) this).field_e = ((ds) this).field_e + 1;
                ((ds) this).field_h[fieldTemp$7] = param1[var5_int];
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
            stackOut_6_1 = new StringBuilder().append("ds.WA(").append(param0).append(',');
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
          throw rta.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int h(int param0) {
        ((ds) this).field_e = ((ds) this).field_e + 4;
        if (param0 <= 15) {
            boolean discarded$0 = ((ds) this).c(-31);
        }
        return (((ds) this).field_h[-3 + ((ds) this).field_e] << 16 & 16711680) + ((255 & ((ds) this).field_h[-4 + ((ds) this).field_e]) << 24) - -(65280 & ((ds) this).field_h[((ds) this).field_e - 2] << 8) - -(((ds) this).field_h[((ds) this).field_e + -1] & 255);
    }

    ds(byte[] param0) {
        try {
            ((ds) this).field_e = 0;
            ((ds) this).field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "ds.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final String m(int param0) {
        if (((ds) this).field_h[((ds) this).field_e] == 0) {
            ((ds) this).field_e = ((ds) this).field_e + 1;
            return null;
        }
        if (param0 != 0) {
            int discarded$0 = ((ds) this).g(35, 57);
        }
        return ((ds) this).a(-1);
    }

    final void d(int param0, int param1) {
        int fieldTemp$0 = ((ds) this).field_e;
        ((ds) this).field_e = ((ds) this).field_e + 1;
        ((ds) this).field_h[fieldTemp$0] = (byte)(param0 >> 24);
        int fieldTemp$1 = ((ds) this).field_e;
        ((ds) this).field_e = ((ds) this).field_e + 1;
        ((ds) this).field_h[fieldTemp$1] = (byte)(param0 >> 16);
        int fieldTemp$2 = ((ds) this).field_e;
        ((ds) this).field_e = ((ds) this).field_e + 1;
        ((ds) this).field_h[fieldTemp$2] = (byte)(param0 >> 8);
        if (param1 != 332614536) {
            this.a(-48L, false);
        }
        int fieldTemp$3 = ((ds) this).field_e;
        ((ds) this).field_e = ((ds) this).field_e + 1;
        ((ds) this).field_h[fieldTemp$3] = (byte)param0;
    }

    final String a(int param0) {
        int var2 = ((ds) this).field_e;
        while (true) {
            int fieldTemp$0 = ((ds) this).field_e;
            ((ds) this).field_e = ((ds) this).field_e + 1;
            if (((ds) this).field_h[fieldTemp$0] == 0) {
                break;
            }
        }
        int var3 = param0 + (((ds) this).field_e + -var2);
        if (!(var3 != 0)) {
            return "";
        }
        return tja.a(var2, param0 + 1, var3, ((ds) this).field_h);
    }

    final int a(boolean param0) {
        if (!param0) {
            return 78;
        }
        ((ds) this).field_e = ((ds) this).field_e + 2;
        int var2 = ((255 & ((ds) this).field_h[((ds) this).field_e + -2]) << 8) + (((ds) this).field_h[-1 + ((ds) this).field_e] & 255);
        if (var2 > 32767) {
            var2 = var2 - 65536;
        }
        return var2;
    }

    final int c(byte param0) {
        ((ds) this).field_e = ((ds) this).field_e + 3;
        if (param0 >= -24) {
            return 122;
        }
        return (255 & ((ds) this).field_h[((ds) this).field_e + -1]) + ((255 & ((ds) this).field_h[-2 + ((ds) this).field_e]) << 8) + (((ds) this).field_h[-3 + ((ds) this).field_e] << 16 & 16711680);
    }

    final void b(byte param0, int param1) {
        if (param1 >= 0) {
            if (!(128 <= param1)) {
                ((ds) this).c(0, param1);
                return;
            }
        }
        if (param1 >= 0) {
            if (param1 < 32768) {
                ((ds) this).a(param1 + 32768, true);
                return;
            }
        }
        if (param0 <= 99) {
            ((ds) this).a(-18, -103L);
        }
        throw new IllegalArgumentException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 0;
        field_d = 4000;
        field_f = "Offer draw";
    }
}
