/*
 * Decompiled by CFR-JS 0.4.0.
 */
class oa extends wf {
    static String field_i;
    int field_h;
    static tf field_l;
    static int field_j;
    byte[] field_g;
    static qj field_k;
    static we[] field_m;

    final int i(int param0) {
        int var4 = Transmogrify.field_A ? 1 : 0;
        if (param0 != 17783) {
            return 60;
        }
        int fieldTemp$0 = ((oa) this).field_h;
        ((oa) this).field_h = ((oa) this).field_h + 1;
        int var2 = ((oa) this).field_g[fieldTemp$0];
        int var3 = 0;
        while (0 > var2) {
            var3 = (var3 | 127 & var2) << 7;
            int fieldTemp$1 = ((oa) this).field_h;
            ((oa) this).field_h = ((oa) this).field_h + 1;
            var2 = ((oa) this).field_g[fieldTemp$1];
        }
        return var3 | var2;
    }

    final void a(byte param0, byte[] param1, int param2, int param3) {
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
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 < -3) {
                break L1;
              } else {
                field_k = null;
                break L1;
              }
            }
            var5_int = param3;
            L2: while (true) {
              if (param2 + param3 <= var5_int) {
                break L0;
              } else {
                int fieldTemp$7 = ((oa) this).field_h;
                ((oa) this).field_h = ((oa) this).field_h + 1;
                ((oa) this).field_g[fieldTemp$7] = param1[var5_int];
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
            stackOut_7_1 = new StringBuilder().append("oa.V(").append(param0).append(',');
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
          throw ch.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(long param0, boolean param1) {
        int fieldTemp$0 = ((oa) this).field_h;
        ((oa) this).field_h = ((oa) this).field_h + 1;
        ((oa) this).field_g[fieldTemp$0] = (byte)(int)(param0 >> 32);
        int fieldTemp$1 = ((oa) this).field_h;
        ((oa) this).field_h = ((oa) this).field_h + 1;
        ((oa) this).field_g[fieldTemp$1] = (byte)(int)(param0 >> 24);
        int fieldTemp$2 = ((oa) this).field_h;
        ((oa) this).field_h = ((oa) this).field_h + 1;
        ((oa) this).field_g[fieldTemp$2] = (byte)(int)(param0 >> 16);
        int fieldTemp$3 = ((oa) this).field_h;
        ((oa) this).field_h = ((oa) this).field_h + 1;
        ((oa) this).field_g[fieldTemp$3] = (byte)(int)(param0 >> 8);
        int fieldTemp$4 = ((oa) this).field_h;
        ((oa) this).field_h = ((oa) this).field_h + 1;
        ((oa) this).field_g[fieldTemp$4] = (byte)(int)param0;
        if (!param1) {
            int discarded$5 = ((oa) this).c((byte) 104);
        }
    }

    final void a(byte param0, int param1) {
        ((oa) this).field_g[((oa) this).field_h - (param1 - -1)] = (byte)param1;
        if (param0 != -42) {
            ((oa) this).b(-65, 48L);
        }
    }

    final long e(byte param0) {
        long var2 = 4294967295L & (long)((oa) this).c((byte) -128);
        int var6 = -53 % ((param0 - 16) / 55);
        long var4 = (long)((oa) this).c((byte) -104) & 4294967295L;
        return (var2 << 32) + var4;
    }

    final void h(int param0, int param1) {
        int var4 = Transmogrify.field_A ? 1 : 0;
        while (param1 > ((oa) this).field_h) {
            int fieldTemp$0 = ((oa) this).field_h;
            ((oa) this).field_h = ((oa) this).field_h + 1;
            ((oa) this).field_g[fieldTemp$0] = (byte) 0;
        }
        if (param0 != -30190) {
            ((oa) this).field_h = -28;
        }
    }

    final static boolean f(byte param0) {
        int var1 = -82 % ((param0 - -57) / 51);
        return vh.a(ha.b(81), 0);
    }

    final void g(int param0, int param1) {
        if (param1 < 64) {
            if (!(param1 < -64)) {
                ((oa) this).f(6389, 64 + param1);
                return;
            }
        }
        if (param0 != -21770) {
            int discarded$0 = ((oa) this).h(64);
        }
        if (param1 < 16384) {
            if (-16384 <= param1) {
                ((oa) this).c(param1 + 49152, -159688920);
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    final static mi a(int param0, ci param1, ci param2, int param3, int param4) {
        RuntimeException var5 = null;
        mi stackIn_6_0 = null;
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
        mi stackOut_5_0 = null;
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
            if (rl.a(param4, 0, param3, param2)) {
              stackOut_5_0 = ea.a(param1.a((byte) -93, param4, param3), 0);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("oa.DA(").append(-123).append(',');
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
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          L2: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_6_0;
    }

    final void a(int param0, int param1, byte[] param2, int param3) {
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
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 2) {
                break L1;
              } else {
                int discarded$10 = ((oa) this).d(97, 26);
                break L1;
              }
            }
            var5_int = param3;
            L2: while (true) {
              if (param3 - -param0 <= var5_int) {
                break L0;
              } else {
                int fieldTemp$11 = ((oa) this).field_h;
                ((oa) this).field_h = ((oa) this).field_h + 1;
                param2[var5_int] = ((oa) this).field_g[fieldTemp$11];
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
            stackOut_7_1 = new StringBuilder().append("oa.T(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
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
          throw ch.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param3 + ')');
        }
    }

    final int h(int param0) {
        if (param0 != -16777216) {
            boolean discarded$0 = oa.f((byte) -10);
        }
        if (((oa) this).field_g[((oa) this).field_h] >= 0) {
            return ((oa) this).a((byte) -111);
        }
        return 2147483647 & ((oa) this).c((byte) -104);
    }

    final String e(int param0) {
        int fieldTemp$0 = ((oa) this).field_h;
        ((oa) this).field_h = ((oa) this).field_h + 1;
        int var2 = ((oa) this).field_g[fieldTemp$0];
        if (!(var2 == 0)) {
            throw new IllegalStateException("");
        }
        if (param0 < 25) {
            ((oa) this).g(-108, 29);
        }
        int var3 = ((oa) this).field_h;
        while (true) {
            int fieldTemp$1 = ((oa) this).field_h;
            ((oa) this).field_h = ((oa) this).field_h + 1;
            if (((oa) this).field_g[fieldTemp$1] == 0) {
                break;
            }
        }
        int var4 = -var3 + ((oa) this).field_h - 1;
        if (var4 == 0) {
            return "";
        }
        return cc.a(var3, 15923, var4, ((oa) this).field_g);
    }

    final void a(String param0, int param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        try {
            var3_int = param0.indexOf(' ');
            if (!(var3_int < 0)) {
                throw new IllegalArgumentException("");
            }
            if (param1 < 122) {
                ((oa) this).c(18, 97);
            }
            int fieldTemp$0 = ((oa) this).field_h;
            ((oa) this).field_h = ((oa) this).field_h + 1;
            ((oa) this).field_g[fieldTemp$0] = (byte) 0;
            var4 = (CharSequence) (Object) param0;
            ((oa) this).field_h = ((oa) this).field_h + rb.a(((oa) this).field_h, var4, ((oa) this).field_g, param0.length(), (byte) -116, 0);
            int fieldTemp$1 = ((oa) this).field_h;
            ((oa) this).field_h = ((oa) this).field_h + 1;
            ((oa) this).field_g[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "oa.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(java.math.BigInteger param0, int param1, java.math.BigInteger param2) {
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        int var4_int = ((oa) this).field_h;
        ((oa) this).field_h = 0;
        if (param1 > -115) {
            return;
        }
        try {
            var5 = new byte[var4_int];
            ((oa) this).a(var4_int, 2, var5, 0);
            var6 = new java.math.BigInteger(var5);
            var7 = var6.modPow(param0, param2);
            var8 = var7.toByteArray();
            ((oa) this).field_h = 0;
            ((oa) this).c(var8.length, -159688920);
            ((oa) this).a((byte) -11, var8, var8.length, 0);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "oa.EA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, String param1) {
        RuntimeException var3 = null;
        long var3_long = 0L;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var10 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var3_long = 0L;
            var5 = 0L;
            var7 = param1.length();
            var8 = 19;
            L1: while (true) {
              if (0 > var8) {
                L2: {
                  this.a(1543687520, var3_long);
                  this.a(1543687520, var5);
                  if (param0 > 105) {
                    break L2;
                  } else {
                    field_j = -123;
                    break L2;
                  }
                }
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
                        if (var9 > 90) {
                          break L4;
                        } else {
                          var3_long = var3_long + (long)(var9 - 63);
                          break L3;
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
                          var3_long = var3_long + (long)(-97 + (2 - -var9));
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
                  if (var8 != 10) {
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
            stackOut_21_0 = (RuntimeException) var3;
            stackOut_21_1 = new StringBuilder().append("oa.CA(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
    }

    final void a(int param0, String param1) {
        int var4 = 0;
        CharSequence var5 = null;
        try {
            int var3_int = 64 / ((param0 - -47) / 60);
            var4 = param1.indexOf(' ');
            if (var4 >= 0) {
                throw new IllegalArgumentException("");
            }
            var5 = (CharSequence) (Object) param1;
            ((oa) this).field_h = ((oa) this).field_h + rb.a(((oa) this).field_h, var5, ((oa) this).field_g, param1.length(), (byte) -116, 0);
            int fieldTemp$0 = ((oa) this).field_h;
            ((oa) this).field_h = ((oa) this).field_h + 1;
            ((oa) this).field_g[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "oa.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int k(int param0) {
        int var2 = 255 & ((oa) this).field_g[((oa) this).field_h];
        if (param0 > var2) {
            return -64 + ((oa) this).d((byte) 47);
        }
        return ((oa) this).a((byte) -93) - 49152;
    }

    final int g(byte param0) {
        if (param0 != 124) {
            Object var3 = null;
            ((oa) this).a((java.math.BigInteger) null, -98, (java.math.BigInteger) null);
        }
        ((oa) this).field_h = ((oa) this).field_h + 3;
        return (((oa) this).field_g[-2 + ((oa) this).field_h] << 8 & 65280) + ((((oa) this).field_g[-3 + ((oa) this).field_h] << 16 & 16711680) - -(((oa) this).field_g[-1 + ((oa) this).field_h] & 255));
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
        var10 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var3_int = ((oa) this).field_h / 8;
            ((oa) this).field_h = 0;
            if (param1 > 98) {
              var4 = 0;
              L1: while (true) {
                if (var3_int <= var4) {
                  break L0;
                } else {
                  var5 = ((oa) this).c((byte) -123);
                  var6 = ((oa) this).c((byte) -116);
                  var7 = 0;
                  var8 = -1640531527;
                  var9 = 32;
                  L2: while (true) {
                    int incrementValue$5 = var9;
                    var9--;
                    if (incrementValue$5 <= 0) {
                      ((oa) this).field_h = ((oa) this).field_h - 8;
                      ((oa) this).a(-126, var5);
                      ((oa) this).a(-105, var6);
                      var4++;
                      continue L1;
                    } else {
                      var5 = var5 + ((var6 >>> 5 ^ var6 << 4) + var6 ^ param0[3 & var7] + var7);
                      var7 = var7 + var8;
                      var6 = var6 + (var7 - -param0[(7221 & var7) >>> 11] ^ (var5 << 4 ^ var5 >>> 5) + var5);
                      continue L2;
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("oa.FA(");
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
          throw ch.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ')');
        }
    }

    final byte b(boolean param0) {
        if (!param0) {
            ((oa) this).c(125, -50);
        }
        int fieldTemp$0 = ((oa) this).field_h;
        ((oa) this).field_h = ((oa) this).field_h + 1;
        return ((oa) this).field_g[fieldTemp$0];
    }

    final String g(int param0) {
        if (param0 != 12248) {
            ((oa) this).field_g = null;
        }
        int var2 = ((oa) this).field_h;
        while (true) {
            int fieldTemp$0 = ((oa) this).field_h;
            ((oa) this).field_h = ((oa) this).field_h + 1;
            if (((oa) this).field_g[fieldTemp$0] == 0) {
                break;
            }
        }
        int var3 = -var2 + ((oa) this).field_h - 1;
        if (var3 == 0) {
            return "";
        }
        return cc.a(var2, 15923, var3, ((oa) this).field_g);
    }

    final int f(int param0) {
        int var2 = 255 & ((oa) this).field_g[((oa) this).field_h];
        if (param0 >= -24) {
            int discarded$0 = ((oa) this).f(75);
        }
        if (var2 < 128) {
            return ((oa) this).d((byte) 115);
        }
        return -32768 + ((oa) this).a((byte) -99);
    }

    final void i(int param0, int param1) {
        int fieldTemp$0 = ((oa) this).field_h;
        ((oa) this).field_h = ((oa) this).field_h + 1;
        ((oa) this).field_g[fieldTemp$0] = (byte)(param0 >> 16);
        if (param1 <= 43) {
            Object var4 = null;
            ((oa) this).a((int[]) null, false, -55, 109);
        }
        int fieldTemp$1 = ((oa) this).field_h;
        ((oa) this).field_h = ((oa) this).field_h + 1;
        ((oa) this).field_g[fieldTemp$1] = (byte)(param0 >> 8);
        int fieldTemp$2 = ((oa) this).field_h;
        ((oa) this).field_h = ((oa) this).field_h + 1;
        ((oa) this).field_g[fieldTemp$2] = (byte)param0;
    }

    final void j(int param0, int param1) {
        ((oa) this).field_g[-param1 + ((oa) this).field_h + -4] = (byte)(param1 >> 24);
        ((oa) this).field_g[-3 + (-param1 + ((oa) this).field_h)] = (byte)(param1 >> 16);
        ((oa) this).field_g[-2 + -param1 + ((oa) this).field_h] = (byte)(param1 >> 8);
        ((oa) this).field_g[((oa) this).field_h + -param1 - 1] = (byte)param1;
        if (param0 != 567) {
            field_i = null;
        }
    }

    final int a(byte param0) {
        ((oa) this).field_h = ((oa) this).field_h + 2;
        if (param0 >= -84) {
            ((oa) this).b(-26, -89L);
        }
        return ((((oa) this).field_g[-2 + ((oa) this).field_h] & 255) << 8) - -(255 & ((oa) this).field_g[((oa) this).field_h - 1]);
    }

    final boolean d(int param0) {
        if (param0 != 5432) {
            Object var4 = null;
            ((oa) this).a((byte) -26, (byte[]) null, -22, -93);
        }
        ((oa) this).field_h = ((oa) this).field_h - 4;
        int var2 = sg.a(0, (byte) -22, ((oa) this).field_h, ((oa) this).field_g);
        int var3 = ((oa) this).c((byte) -106);
        if (var2 == var3) {
            return true;
        }
        return false;
    }

    final int d(byte param0) {
        if (param0 < 21) {
            return 90;
        }
        int fieldTemp$0 = ((oa) this).field_h;
        ((oa) this).field_h = ((oa) this).field_h + 1;
        return 255 & ((oa) this).field_g[fieldTemp$0];
    }

    final void f(int param0, int param1) {
        int fieldTemp$0 = ((oa) this).field_h;
        ((oa) this).field_h = ((oa) this).field_h + 1;
        ((oa) this).field_g[fieldTemp$0] = (byte)param1;
        if (param0 != 6389) {
            ((oa) this).field_h = 49;
        }
    }

    final void e(int param0, int param1) {
        if (!(0 == (-128 & param0))) {
            if (!((-16384 & param0) == 0)) {
                if ((-2097152 & param0) != 0) {
                    if (!((param0 & -268435456) == 0)) {
                        ((oa) this).f(param1 ^ -268429067, param0 >>> 28 | 128);
                    }
                    ((oa) this).f(param1 ^ -268429067, (269616035 | param0) >>> 21);
                }
                ((oa) this).f(6389, (2098829 | param0) >>> 14);
            }
            ((oa) this).f(param1 + 268441845, (16481 | param0) >>> 7);
        }
        if (param1 != -268435456) {
            field_j = -120;
        }
        ((oa) this).f(6389, 127 & param0);
    }

    final int c(byte param0) {
        if (param0 >= -103) {
            return 54;
        }
        ((oa) this).field_h = ((oa) this).field_h + 4;
        return (65280 & ((oa) this).field_g[((oa) this).field_h + -2] << 8) + (((oa) this).field_g[((oa) this).field_h - 4] << 24 & -16777216) + ((((oa) this).field_g[((oa) this).field_h + -3] << 16 & 16711680) - -(((oa) this).field_g[-1 + ((oa) this).field_h] & 255));
    }

    oa(int param0) {
        ((oa) this).field_g = vk.a(param0, -86);
        ((oa) this).field_h = 0;
    }

    final void c(int param0, int param1) {
        int fieldTemp$0 = ((oa) this).field_h;
        ((oa) this).field_h = ((oa) this).field_h + 1;
        ((oa) this).field_g[fieldTemp$0] = (byte)(param0 >> 8);
        if (param1 != -159688920) {
            field_l = null;
        }
        int fieldTemp$1 = ((oa) this).field_h;
        ((oa) this).field_h = ((oa) this).field_h + 1;
        ((oa) this).field_g[fieldTemp$1] = (byte)param0;
    }

    final void a(int param0, int param1) {
        int fieldTemp$0 = ((oa) this).field_h;
        ((oa) this).field_h = ((oa) this).field_h + 1;
        ((oa) this).field_g[fieldTemp$0] = (byte)(param1 >> 24);
        if (param0 >= -94) {
            field_k = null;
        }
        int fieldTemp$1 = ((oa) this).field_h;
        ((oa) this).field_h = ((oa) this).field_h + 1;
        ((oa) this).field_g[fieldTemp$1] = (byte)(param1 >> 16);
        int fieldTemp$2 = ((oa) this).field_h;
        ((oa) this).field_h = ((oa) this).field_h + 1;
        ((oa) this).field_g[fieldTemp$2] = (byte)(param1 >> 8);
        int fieldTemp$3 = ((oa) this).field_h;
        ((oa) this).field_h = ((oa) this).field_h + 1;
        ((oa) this).field_g[fieldTemp$3] = (byte)param1;
    }

    final int d(int param0, int param1) {
        if (param1 != -1323322296) {
            Object var4 = null;
            ((oa) this).a((int[]) null, 127);
        }
        int var3 = sg.a(param0, (byte) -103, ((oa) this).field_h, ((oa) this).field_g);
        ((oa) this).a(-127, var3);
        return var3;
    }

    final String j(int param0) {
        if (param0 != -1640531527) {
            field_j = 89;
        }
        if (!(0 != ((oa) this).field_g[((oa) this).field_h])) {
            ((oa) this).field_h = ((oa) this).field_h + 1;
            return null;
        }
        return ((oa) this).g(12248);
    }

    final void b(int param0, int param1) {
        ((oa) this).field_g[-2 + ((oa) this).field_h + -param1] = (byte)(param1 >> 8);
        ((oa) this).field_g[((oa) this).field_h + (-param1 + -1)] = (byte)param1;
        if (param0 >= -108) {
            Object var4 = null;
            ((oa) this).a(15, 46, (byte[]) null, -117);
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
        var13 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                field_k = null;
                break L1;
              }
            }
            var5_int = ((oa) this).field_h;
            ((oa) this).field_h = param2;
            var6 = (-param2 + param3) / 8;
            var7 = 0;
            L2: while (true) {
              if (var7 >= var6) {
                ((oa) this).field_h = var5_int;
                break L0;
              } else {
                var8 = ((oa) this).c((byte) -127);
                var9 = ((oa) this).c((byte) -113);
                var10 = -957401312;
                var11 = -1640531527;
                var12 = 32;
                L3: while (true) {
                  int incrementValue$1 = var12;
                  var12--;
                  if (incrementValue$1 <= 0) {
                    ((oa) this).field_h = ((oa) this).field_h - 8;
                    ((oa) this).a(-118, var8);
                    ((oa) this).a(-121, var9);
                    var7++;
                    continue L2;
                  } else {
                    var9 = var9 - (var8 + (var8 >>> 5 ^ var8 << 4) ^ var10 + param0[(6389 & var10) >>> 11]);
                    var10 = var10 - var11;
                    var8 = var8 - ((var9 >>> 5 ^ var9 << 4) - -var9 ^ param0[3 & var10] + var10);
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
            stackOut_11_1 = new StringBuilder().append("oa.N(");
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
          throw ch.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    oa(byte[] param0) {
        try {
            ((oa) this).field_h = 0;
            ((oa) this).field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "oa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, long param1) {
        int fieldTemp$0 = ((oa) this).field_h;
        ((oa) this).field_h = ((oa) this).field_h + 1;
        ((oa) this).field_g[fieldTemp$0] = (byte)(int)(param1 >> 48);
        int fieldTemp$1 = ((oa) this).field_h;
        ((oa) this).field_h = ((oa) this).field_h + 1;
        ((oa) this).field_g[fieldTemp$1] = (byte)(int)(param1 >> 40);
        int fieldTemp$2 = ((oa) this).field_h;
        ((oa) this).field_h = ((oa) this).field_h + 1;
        ((oa) this).field_g[fieldTemp$2] = (byte)(int)(param1 >> 32);
        int fieldTemp$3 = ((oa) this).field_h;
        ((oa) this).field_h = ((oa) this).field_h + 1;
        ((oa) this).field_g[fieldTemp$3] = (byte)(int)(param1 >> 24);
        int fieldTemp$4 = ((oa) this).field_h;
        ((oa) this).field_h = ((oa) this).field_h + 1;
        ((oa) this).field_g[fieldTemp$4] = (byte)(int)(param1 >> 16);
        int fieldTemp$5 = ((oa) this).field_h;
        ((oa) this).field_h = ((oa) this).field_h + 1;
        ((oa) this).field_g[fieldTemp$5] = (byte)(int)(param1 >> 8);
        int fieldTemp$6 = ((oa) this).field_h;
        ((oa) this).field_h = ((oa) this).field_h + 1;
        ((oa) this).field_g[fieldTemp$6] = (byte)(int)param1;
    }

    final void b(int param0, long param1) {
        if (param0 != 1908720528) {
            field_i = null;
        }
        int fieldTemp$0 = ((oa) this).field_h;
        ((oa) this).field_h = ((oa) this).field_h + 1;
        ((oa) this).field_g[fieldTemp$0] = (byte)(int)(param1 >> 56);
        int fieldTemp$1 = ((oa) this).field_h;
        ((oa) this).field_h = ((oa) this).field_h + 1;
        ((oa) this).field_g[fieldTemp$1] = (byte)(int)(param1 >> 48);
        int fieldTemp$2 = ((oa) this).field_h;
        ((oa) this).field_h = ((oa) this).field_h + 1;
        ((oa) this).field_g[fieldTemp$2] = (byte)(int)(param1 >> 40);
        int fieldTemp$3 = ((oa) this).field_h;
        ((oa) this).field_h = ((oa) this).field_h + 1;
        ((oa) this).field_g[fieldTemp$3] = (byte)(int)(param1 >> 32);
        int fieldTemp$4 = ((oa) this).field_h;
        ((oa) this).field_h = ((oa) this).field_h + 1;
        ((oa) this).field_g[fieldTemp$4] = (byte)(int)(param1 >> 24);
        int fieldTemp$5 = ((oa) this).field_h;
        ((oa) this).field_h = ((oa) this).field_h + 1;
        ((oa) this).field_g[fieldTemp$5] = (byte)(int)(param1 >> 16);
        int fieldTemp$6 = ((oa) this).field_h;
        ((oa) this).field_h = ((oa) this).field_h + 1;
        ((oa) this).field_g[fieldTemp$6] = (byte)(int)(param1 >> 8);
        int fieldTemp$7 = ((oa) this).field_h;
        ((oa) this).field_h = ((oa) this).field_h + 1;
        ((oa) this).field_g[fieldTemp$7] = (byte)(int)param1;
    }

    public static void b(byte param0) {
        field_k = null;
        field_m = null;
        field_l = null;
        int var1 = -1;
        field_i = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Account created successfully!";
        field_j = 0;
        field_l = new tf(2, 4, 4, 0);
    }
}
