/*
 * Decompiled by CFR-JS 0.4.0.
 */
class fs extends ms {
    static char[] field_m;
    static int field_l;
    static boolean[] field_o;
    byte[] field_n;
    int field_p;
    static qn field_k;

    final void a(String param0, int param1) {
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
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_long = 0L;
              var5 = 0L;
              var7 = param0.length();
              var8 = 19;
              if (param1 >= 19) {
                break L1;
              } else {
                int discarded$1 = ((fs) this).f(118);
                break L1;
              }
            }
            L2: while (true) {
              if (var8 < 0) {
                this.a(var3_long, 116);
                this.a(var5, 122);
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
                          var3_long = var3_long + (long)(-65 + var9 + 2);
                          break L3;
                        }
                      }
                    }
                    L5: {
                      if (97 > var9) {
                        break L5;
                      } else {
                        if (var9 <= 122) {
                          var3_long = var3_long + (long)(var9 - 95);
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
            stackOut_25_0 = (RuntimeException) var3;
            stackOut_25_1 = new StringBuilder().append("fs.K(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + param1 + ')');
        }
    }

    final void a(byte[] param0, byte param1, int param2, int param3) {
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
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -123) {
                break L1;
              } else {
                ((fs) this).field_p = 98;
                break L1;
              }
            }
            var5_int = param3;
            L2: while (true) {
              if (param2 + param3 <= var5_int) {
                break L0;
              } else {
                int fieldTemp$7 = ((fs) this).field_p;
                ((fs) this).field_p = ((fs) this).field_p + 1;
                ((fs) this).field_n[fieldTemp$7] = param0[var5_int];
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
            stackOut_7_1 = new StringBuilder().append("fs.GA(");
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
          throw qo.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static float a(byte param0, float param1) {
        return param1 * (param1 * param1) * (param1 * (-15.0f + 6.0f * param1) + 10.0f);
    }

    final static void a(wi param0, int param1, int param2, String param3, byte param4, int param5, int param6, int param7, int param8) {
        rl.field_q = param2;
        if (param4 != -56) {
            return;
        }
        try {
            gd.field_a = param3;
            rd.field_l = param7;
            ie.field_x = param1;
            gk.field_u = param0;
            qq.field_P = param5;
            ow.field_e = param8;
            bt.field_d = param6;
            jk.field_b = (gd) (Object) new t();
            in.field_D = new ti(param0);
            wt.field_i = new rj(jk.field_b, in.field_D);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "fs.BB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void a(String param0, byte param1) {
        int var3_int = 0;
        CharSequence var5 = null;
        try {
            var3_int = param0.indexOf(' ');
            if (var3_int >= 0) {
                throw new IllegalArgumentException("");
            }
            var5 = (CharSequence) (Object) param0;
            ((fs) this).field_p = ((fs) this).field_p + mq.a(0, ((fs) this).field_n, (byte) -110, var5, param0.length(), ((fs) this).field_p);
            int fieldTemp$0 = ((fs) this).field_p;
            ((fs) this).field_p = ((fs) this).field_p + 1;
            ((fs) this).field_n[fieldTemp$0] = (byte) 0;
            int var4 = 123 / ((param1 - -7) / 60);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "fs.KA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int e(int param0) {
        if (param0 != -31302) {
            String discarded$0 = ((fs) this).d(-78);
        }
        int fieldTemp$1 = ((fs) this).field_p;
        ((fs) this).field_p = ((fs) this).field_p + 1;
        return ((fs) this).field_n[fieldTemp$1] & 255;
    }

    final String g(int param0) {
        int fieldTemp$0 = ((fs) this).field_p;
        ((fs) this).field_p = ((fs) this).field_p + 1;
        int var2 = ((fs) this).field_n[fieldTemp$0];
        if (!(var2 == 0)) {
            throw new IllegalStateException("");
        }
        int var3 = ((fs) this).field_p;
        while (true) {
            int fieldTemp$1 = ((fs) this).field_p;
            ((fs) this).field_p = ((fs) this).field_p + 1;
            if (0 == ((fs) this).field_n[fieldTemp$1]) {
                break;
            }
        }
        int var5 = 83 / (param0 / 48);
        int var4 = -1 + ((fs) this).field_p + -var3;
        if (var4 == 0) {
            return "";
        }
        return sd.a(((fs) this).field_n, var3, var4, 26564);
    }

    final int c(boolean param0) {
        ((fs) this).field_p = ((fs) this).field_p + 4;
        if (!param0) {
            ((fs) this).field_n = null;
        }
        return (((fs) this).field_n[((fs) this).field_p + -1] & 255) + (((((fs) this).field_n[((fs) this).field_p - 3] & 255) << 16) + ((((fs) this).field_n[-4 + ((fs) this).field_p] & 255) << 24)) + (65280 & ((fs) this).field_n[-2 + ((fs) this).field_p] << 8);
    }

    final int a(int param0, boolean param1) {
        if (param1) {
            ((fs) this).field_n = null;
        }
        int var3 = rd.a(((fs) this).field_n, param0, ((fs) this).field_p, 1001);
        ((fs) this).e(48, var3);
        return var3;
    }

    final void b(long param0, int param1) {
        int fieldTemp$0 = ((fs) this).field_p;
        ((fs) this).field_p = ((fs) this).field_p + 1;
        ((fs) this).field_n[fieldTemp$0] = (byte)(int)(param0 >> 32);
        int fieldTemp$1 = ((fs) this).field_p;
        ((fs) this).field_p = ((fs) this).field_p + 1;
        ((fs) this).field_n[fieldTemp$1] = (byte)(int)(param0 >> 24);
        int fieldTemp$2 = ((fs) this).field_p;
        ((fs) this).field_p = ((fs) this).field_p + 1;
        ((fs) this).field_n[fieldTemp$2] = (byte)(int)(param0 >> 16);
        int fieldTemp$3 = ((fs) this).field_p;
        ((fs) this).field_p = ((fs) this).field_p + 1;
        ((fs) this).field_n[fieldTemp$3] = (byte)(int)(param0 >> 8);
        int fieldTemp$4 = ((fs) this).field_p;
        ((fs) this).field_p = ((fs) this).field_p + 1;
        ((fs) this).field_n[fieldTemp$4] = (byte)(int)param0;
        if (param1 != 1105594440) {
            field_k = null;
        }
    }

    final void c(int param0, int param1) {
        ((fs) this).field_n[((fs) this).field_p - (param0 - -1)] = (byte)param0;
        if (param1 != -13745) {
            field_m = null;
        }
    }

    final void a(int param0, byte param1, int param2, int[] param3) {
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
        var13 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var5_int = ((fs) this).field_p;
            ((fs) this).field_p = param2;
            var6 = (-param2 + param0) / 8;
            if (param1 == 127) {
              var7 = 0;
              L1: while (true) {
                if (var6 <= var7) {
                  ((fs) this).field_p = var5_int;
                  break L0;
                } else {
                  var8 = ((fs) this).c(true);
                  var9 = ((fs) this).c(true);
                  var10 = -957401312;
                  var11 = -1640531527;
                  var12 = 32;
                  L2: while (true) {
                    int incrementValue$1 = var12;
                    var12--;
                    if (incrementValue$1 <= 0) {
                      ((fs) this).field_p = ((fs) this).field_p - 8;
                      ((fs) this).e(48, var8);
                      ((fs) this).e(48, var9);
                      var7++;
                      continue L1;
                    } else {
                      var9 = var9 - ((var8 >>> 5 ^ var8 << 4) + var8 ^ var10 - -param3[-178257917 & var10 >>> 11]);
                      var10 = var10 - var11;
                      var8 = var8 - ((var9 >>> 5 ^ var9 << 4) + var9 ^ var10 + param3[3 & var10]);
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
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("fs.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    final void f(int param0, int param1) {
        if (-1 != (-128 & param0)) {
            if ((param0 & -16384) != 0) {
                if (-1 != (param0 & -2097152)) {
                    if (!((param0 & -268435456) == 0)) {
                        ((fs) this).b((byte) 115, param0 >>> 28 | 128);
                    }
                    ((fs) this).b((byte) 90, (268682394 | param0) >>> 21);
                }
                ((fs) this).b((byte) 64, (2099807 | param0) >>> 14);
            }
            ((fs) this).b((byte) 120, (param0 | 16498) >>> 7);
        }
        ((fs) this).b((byte) 17, 127 & param0);
        if (param1 >= -4) {
            field_l = -52;
        }
    }

    final void d(int param0, int param1) {
        int fieldTemp$0 = ((fs) this).field_p;
        ((fs) this).field_p = ((fs) this).field_p + 1;
        ((fs) this).field_n[fieldTemp$0] = (byte)(param0 >> 16);
        int fieldTemp$1 = ((fs) this).field_p;
        ((fs) this).field_p = ((fs) this).field_p + 1;
        ((fs) this).field_n[fieldTemp$1] = (byte)(param0 >> 8);
        int fieldTemp$2 = ((fs) this).field_p;
        ((fs) this).field_p = ((fs) this).field_p + 1;
        ((fs) this).field_n[fieldTemp$2] = (byte)param0;
        int var3 = -16 / ((param1 - 43) / 34);
    }

    final boolean e(byte param0) {
        ((fs) this).field_p = ((fs) this).field_p - 4;
        int var2 = rd.a(((fs) this).field_n, 0, ((fs) this).field_p, param0 + 1010);
        if (param0 != -9) {
            Object var4 = null;
            fs.a((wi) null, -93, 108, (String) null, (byte) 18, 23, 21, 60, 76);
        }
        int var3 = ((fs) this).c(true);
        if (var2 == var3) {
            return true;
        }
        return false;
    }

    final byte[] d(byte param0) {
        int var3 = 0;
        int var4 = Sumoblitz.field_L ? 1 : 0;
        if (param0 != 120) {
            return null;
        }
        byte[] var5 = new byte[((fs) this).field_p];
        byte[] var2 = var5;
        for (var3 = 0; var3 < ((fs) this).field_p; var3++) {
            var5[var3] = ((fs) this).field_n[var3];
        }
        return var2;
    }

    final void a(byte param0, java.math.BigInteger param1, java.math.BigInteger param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
            var4_int = ((fs) this).field_p;
            ((fs) this).field_p = 0;
            var5 = new byte[var4_int];
            ((fs) this).a(var5, var4_int, 0, (byte) -59);
            if (param0 <= 115) {
                field_l = 79;
            }
            var6 = new java.math.BigInteger(var5);
            var7 = var6.modPow(param2, param1);
            var8 = var7.toByteArray();
            ((fs) this).field_p = 0;
            ((fs) this).b(-123, var8.length);
            ((fs) this).a(var8, (byte) -123, var8.length, 0);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "fs.AA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(long param0, int param1) {
        int fieldTemp$0 = ((fs) this).field_p;
        ((fs) this).field_p = ((fs) this).field_p + 1;
        ((fs) this).field_n[fieldTemp$0] = (byte)(int)(param0 >> 48);
        int fieldTemp$1 = ((fs) this).field_p;
        ((fs) this).field_p = ((fs) this).field_p + 1;
        ((fs) this).field_n[fieldTemp$1] = (byte)(int)(param0 >> 40);
        int fieldTemp$2 = ((fs) this).field_p;
        ((fs) this).field_p = ((fs) this).field_p + 1;
        ((fs) this).field_n[fieldTemp$2] = (byte)(int)(param0 >> 32);
        if (param1 <= 104) {
            ((fs) this).e(25, -112);
        }
        int fieldTemp$3 = ((fs) this).field_p;
        ((fs) this).field_p = ((fs) this).field_p + 1;
        ((fs) this).field_n[fieldTemp$3] = (byte)(int)(param0 >> 24);
        int fieldTemp$4 = ((fs) this).field_p;
        ((fs) this).field_p = ((fs) this).field_p + 1;
        ((fs) this).field_n[fieldTemp$4] = (byte)(int)(param0 >> 16);
        int fieldTemp$5 = ((fs) this).field_p;
        ((fs) this).field_p = ((fs) this).field_p + 1;
        ((fs) this).field_n[fieldTemp$5] = (byte)(int)(param0 >> 8);
        int fieldTemp$6 = ((fs) this).field_p;
        ((fs) this).field_p = ((fs) this).field_p + 1;
        ((fs) this).field_n[fieldTemp$6] = (byte)(int)param0;
    }

    final int c(byte param0) {
        if (param0 <= 120) {
            return -109;
        }
        ((fs) this).field_p = ((fs) this).field_p + 3;
        return ((255 & ((fs) this).field_n[-2 + ((fs) this).field_p]) << 8) + ((16711680 & ((fs) this).field_n[((fs) this).field_p + -3] << 16) + (255 & ((fs) this).field_n[-1 + ((fs) this).field_p]));
    }

    final long a(byte param0) {
        if (param0 < 100) {
            return 61L;
        }
        long var2 = 4294967295L & (long)((fs) this).c(true);
        long var4 = 4294967295L & (long)((fs) this).c(true);
        return var4 + (var2 << 32);
    }

    final void a(boolean param0, int param1) {
        ((fs) this).field_n[-4 + ((fs) this).field_p - param1] = (byte)(param1 >> 24);
        if (!param0) {
            byte discarded$0 = ((fs) this).d(true);
        }
        ((fs) this).field_n[-3 + (-param1 + ((fs) this).field_p)] = (byte)(param1 >> 16);
        ((fs) this).field_n[-param1 + ((fs) this).field_p - 2] = (byte)(param1 >> 8);
        ((fs) this).field_n[-1 + (((fs) this).field_p - param1)] = (byte)param1;
    }

    final void b(String param0, byte param1) {
        int var4 = 0;
        CharSequence var5 = null;
        try {
            int var3_int = -25 % ((param1 - -46) / 53);
            var4 = param0.indexOf(' ');
            if (!(0 > var4)) {
                throw new IllegalArgumentException("");
            }
            int fieldTemp$0 = ((fs) this).field_p;
            ((fs) this).field_p = ((fs) this).field_p + 1;
            ((fs) this).field_n[fieldTemp$0] = (byte) 0;
            var5 = (CharSequence) (Object) param0;
            ((fs) this).field_p = ((fs) this).field_p + mq.a(0, ((fs) this).field_n, (byte) -124, var5, param0.length(), ((fs) this).field_p);
            int fieldTemp$1 = ((fs) this).field_p;
            ((fs) this).field_p = ((fs) this).field_p + 1;
            ((fs) this).field_n[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "fs.RA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, long param1) {
        int fieldTemp$0 = ((fs) this).field_p;
        ((fs) this).field_p = ((fs) this).field_p + 1;
        ((fs) this).field_n[fieldTemp$0] = (byte)(int)(param1 >> 56);
        if (param0) {
            ((fs) this).a(true, 72L);
        }
        int fieldTemp$1 = ((fs) this).field_p;
        ((fs) this).field_p = ((fs) this).field_p + 1;
        ((fs) this).field_n[fieldTemp$1] = (byte)(int)(param1 >> 48);
        int fieldTemp$2 = ((fs) this).field_p;
        ((fs) this).field_p = ((fs) this).field_p + 1;
        ((fs) this).field_n[fieldTemp$2] = (byte)(int)(param1 >> 40);
        int fieldTemp$3 = ((fs) this).field_p;
        ((fs) this).field_p = ((fs) this).field_p + 1;
        ((fs) this).field_n[fieldTemp$3] = (byte)(int)(param1 >> 32);
        int fieldTemp$4 = ((fs) this).field_p;
        ((fs) this).field_p = ((fs) this).field_p + 1;
        ((fs) this).field_n[fieldTemp$4] = (byte)(int)(param1 >> 24);
        int fieldTemp$5 = ((fs) this).field_p;
        ((fs) this).field_p = ((fs) this).field_p + 1;
        ((fs) this).field_n[fieldTemp$5] = (byte)(int)(param1 >> 16);
        int fieldTemp$6 = ((fs) this).field_p;
        ((fs) this).field_p = ((fs) this).field_p + 1;
        ((fs) this).field_n[fieldTemp$6] = (byte)(int)(param1 >> 8);
        int fieldTemp$7 = ((fs) this).field_p;
        ((fs) this).field_p = ((fs) this).field_p + 1;
        ((fs) this).field_n[fieldTemp$7] = (byte)(int)param1;
    }

    final int a(int param0) {
        ((fs) this).field_p = ((fs) this).field_p + 2;
        if (param0 != 255) {
            this.a(124L, -47);
        }
        return (((fs) this).field_n[((fs) this).field_p + -2] << 8 & 65280) - -(255 & ((fs) this).field_n[((fs) this).field_p + -1]);
    }

    final void b(int param0, int param1) {
        int fieldTemp$0 = ((fs) this).field_p;
        ((fs) this).field_p = ((fs) this).field_p + 1;
        ((fs) this).field_n[fieldTemp$0] = (byte)(param1 >> 8);
        int fieldTemp$1 = ((fs) this).field_p;
        ((fs) this).field_p = ((fs) this).field_p + 1;
        ((fs) this).field_n[fieldTemp$1] = (byte)param1;
        int var3 = -45 / ((param0 - 57) / 59);
    }

    public static void c() {
        field_o = null;
        field_m = null;
        field_k = null;
    }

    final void a(byte param0, int param1) {
        int var4 = Sumoblitz.field_L ? 1 : 0;
        while (((fs) this).field_p < param1) {
            int fieldTemp$0 = ((fs) this).field_p;
            ((fs) this).field_p = ((fs) this).field_p + 1;
            ((fs) this).field_n[fieldTemp$0] = (byte) 0;
        }
        if (param0 != -3) {
            field_o = null;
        }
    }

    final String d(int param0) {
        int var2 = ((fs) this).field_p;
        while (true) {
            int fieldTemp$0 = ((fs) this).field_p;
            ((fs) this).field_p = ((fs) this).field_p + 1;
            if (0 == ((fs) this).field_n[fieldTemp$0]) {
                break;
            }
        }
        int var3 = ((fs) this).field_p + -var2 + param0;
        if (var3 == 0) {
            return "";
        }
        return sd.a(((fs) this).field_n, var2, var3, 26564);
    }

    final void a(int param0, int param1) {
        if (param0 != 0) {
            field_m = null;
        }
        ((fs) this).field_n[-2 + (((fs) this).field_p + -param1)] = (byte)(param1 >> 8);
        ((fs) this).field_n[-1 + ((fs) this).field_p + -param1] = (byte)param1;
    }

    final byte d(boolean param0) {
        if (!param0) {
            return (byte) -80;
        }
        int fieldTemp$0 = ((fs) this).field_p;
        ((fs) this).field_p = ((fs) this).field_p + 1;
        return ((fs) this).field_n[fieldTemp$0];
    }

    fs(int param0) {
        ((fs) this).field_p = 0;
        ((fs) this).field_n = jo.a(-44, param0);
    }

    final void a(int param0, byte param1) {
        if (param0 < 64) {
            if (!(param0 < -64)) {
                ((fs) this).b((byte) 108, param0 - -64);
                return;
            }
        }
        if (param0 < 16384) {
            if (-16384 <= param0) {
                ((fs) this).b(120, 49152 + param0);
                return;
            }
        }
        if (param1 >= 0) {
            ((fs) this).b(58L, -106);
        }
        throw new IllegalArgumentException();
    }

    final int f(byte param0) {
        int var4 = Sumoblitz.field_L ? 1 : 0;
        if (param0 < 75) {
            ((fs) this).field_p = -23;
        }
        int fieldTemp$0 = ((fs) this).field_p;
        ((fs) this).field_p = ((fs) this).field_p + 1;
        int var2 = ((fs) this).field_n[fieldTemp$0];
        int var3 = 0;
        while (var2 < 0) {
            var3 = (var3 | var2 & 127) << 7;
            int fieldTemp$1 = ((fs) this).field_p;
            ((fs) this).field_p = ((fs) this).field_p + 1;
            var2 = ((fs) this).field_n[fieldTemp$1];
        }
        return var2 | var3;
    }

    final int f(int param0) {
        if (param0 != 0) {
            return 40;
        }
        if (((fs) this).field_n[((fs) this).field_p] >= 0) {
            return ((fs) this).a(255);
        }
        return ((fs) this).c(true) & 2147483647;
    }

    final void b(byte param0, int param1) {
        if (param0 < 14) {
            byte discarded$0 = ((fs) this).d(false);
        }
        int fieldTemp$1 = ((fs) this).field_p;
        ((fs) this).field_p = ((fs) this).field_p + 1;
        ((fs) this).field_n[fieldTemp$1] = (byte)param1;
    }

    final void e(int param0, int param1) {
        int fieldTemp$0 = ((fs) this).field_p;
        ((fs) this).field_p = ((fs) this).field_p + 1;
        ((fs) this).field_n[fieldTemp$0] = (byte)(param1 >> 24);
        int fieldTemp$1 = ((fs) this).field_p;
        ((fs) this).field_p = ((fs) this).field_p + 1;
        ((fs) this).field_n[fieldTemp$1] = (byte)(param1 >> 16);
        int fieldTemp$2 = ((fs) this).field_p;
        ((fs) this).field_p = ((fs) this).field_p + 1;
        ((fs) this).field_n[fieldTemp$2] = (byte)(param1 >> 8);
        int fieldTemp$3 = ((fs) this).field_p;
        ((fs) this).field_p = ((fs) this).field_p + 1;
        ((fs) this).field_n[fieldTemp$3] = (byte)param1;
        if (param0 != 48) {
            field_o = null;
        }
    }

    fs(byte[] param0) {
        try {
            ((fs) this).field_n = param0;
            ((fs) this).field_p = 0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "fs.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final String g(byte param0) {
        int var2 = -125 % ((param0 - -56) / 44);
        if (((fs) this).field_n[((fs) this).field_p] == 0) {
            ((fs) this).field_p = ((fs) this).field_p + 1;
            return null;
        }
        return ((fs) this).d(-1);
    }

    final int h(int param0) {
        if (param0 != -2858) {
            field_m = null;
        }
        int var2 = 255 & ((fs) this).field_n[((fs) this).field_p];
        if (var2 < 128) {
            return ((fs) this).e(param0 ^ 29036) - 64;
        }
        return -49152 + ((fs) this).a(param0 + 3113);
    }

    final void a(byte[] param0, int param1, int param2, byte param3) {
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
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param3 <= -5) {
              var5_int = param2;
              L1: while (true) {
                if (var5_int >= param2 - -param1) {
                  break L0;
                } else {
                  int fieldTemp$8 = ((fs) this).field_p;
                  ((fs) this).field_p = ((fs) this).field_p + 1;
                  param0[var5_int] = ((fs) this).field_n[fieldTemp$8];
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
            stackOut_7_1 = new StringBuilder().append("fs.JA(");
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
          throw qo.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
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
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var3_int = ((fs) this).field_p / 8;
            ((fs) this).field_p = 0;
            var4 = 0;
            if (param1 >= 82) {
              L1: while (true) {
                if (var3_int <= var4) {
                  break L0;
                } else {
                  var5 = ((fs) this).c(true);
                  var6 = ((fs) this).c(true);
                  var7 = 0;
                  var8 = -1640531527;
                  var9 = 32;
                  L2: while (true) {
                    int incrementValue$5 = var9;
                    var9--;
                    if (incrementValue$5 <= 0) {
                      ((fs) this).field_p = ((fs) this).field_p - 8;
                      ((fs) this).e(48, var5);
                      ((fs) this).e(48, var6);
                      var4++;
                      continue L1;
                    } else {
                      var5 = var5 + (var7 - -param0[3 & var7] ^ var6 + (var6 << 4 ^ var6 >>> 5));
                      var7 = var7 + var8;
                      var6 = var6 + (param0[-513802237 & var7 >>> 11] + var7 ^ var5 + (var5 >>> 5 ^ var5 << 4));
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
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("fs.CA(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
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
          throw qo.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
    }

    final int e(boolean param0) {
        if (param0) {
            return -85;
        }
        int var2 = ((fs) this).field_n[((fs) this).field_p] & 255;
        if (var2 < 128) {
            return ((fs) this).e(-31302);
        }
        return -32768 + ((fs) this).a(255);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new boolean[8];
        field_m = new char[]{'[', ']', '#'};
        field_l = 0;
    }
}
