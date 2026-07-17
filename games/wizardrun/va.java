/*
 * Decompiled by CFR-JS 0.4.0.
 */
class va extends wl {
    static rc field_l;
    static ok field_o;
    byte[] field_k;
    int field_m;
    static vd field_i;
    static kl field_n;
    static ji field_j;

    final void a(int param0, boolean param1) {
        int fieldTemp$0 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$0] = (byte)(param0 >> 16);
        int fieldTemp$1 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$1] = (byte)(param0 >> 8);
        if (param1) {
            field_l = null;
        }
        int fieldTemp$2 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$2] = (byte)param0;
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
        var10 = wizardrun.field_H;
        try {
          L0: {
            var3_long = 0L;
            var5 = 0L;
            if (param1 == -66) {
              var7 = param0.length();
              var8 = 19;
              L1: while (true) {
                if (0 > var8) {
                  this.a(param1 + -17663, var3_long);
                  this.a(-17729, var5);
                  break L0;
                } else {
                  L2: {
                    var3_long = var3_long * 38L;
                    if (var7 <= var8) {
                      break L2;
                    } else {
                      L3: {
                        var9 = param0.charAt(var8);
                        if (var9 < 65) {
                          break L3;
                        } else {
                          if (var9 <= 90) {
                            var3_long = var3_long + (long)(2 + (var9 - 65));
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
                            var3_long = var3_long + (long)(2 + var9 - 97);
                            break L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (48 > var9) {
                          break L5;
                        } else {
                          if (57 >= var9) {
                            var3_long = var3_long + (long)(var9 + -20);
                            break L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var3_long = var3_long + 1L;
                      break L2;
                    }
                  }
                  L6: {
                    if (var8 != 10) {
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  var8--;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var3;
            stackOut_24_1 = new StringBuilder().append("va.N(");
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
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param1 + 41);
        }
    }

    final void a(byte[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
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
        var7 = wizardrun.field_H;
        try {
          L0: {
            var5_int = -119 % ((-47 - param3) / 41);
            var6 = param1;
            L1: while (true) {
              if (param2 + param1 <= var6) {
                break L0;
              } else {
                int fieldTemp$7 = ((va) this).field_m;
                ((va) this).field_m = ((va) this).field_m + 1;
                ((va) this).field_k[fieldTemp$7] = param0[var6];
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("va.TA(");
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
          throw bd.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final String d(int param0) {
        if (param0 != 0) {
            ((va) this).c(44, -40);
        }
        int var2 = ((va) this).field_m;
        while (true) {
            int fieldTemp$0 = ((va) this).field_m;
            ((va) this).field_m = ((va) this).field_m + 1;
            if (((va) this).field_k[fieldTemp$0] == 0) {
                break;
            }
        }
        int var3 = ((va) this).field_m + -var2 - 1;
        if (!(var3 != 0)) {
            return "";
        }
        return bi.a(var2, var3, ((va) this).field_k, false);
    }

    final void b(byte param0, int param1) {
        int fieldTemp$0 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$0] = (byte)param1;
        if (param0 != 11) {
            field_i = null;
        }
    }

    final void b(int param0, long param1) {
        Object var5 = null;
        L0: {
          int fieldTemp$8 = ((va) this).field_m;
          ((va) this).field_m = ((va) this).field_m + 1;
          ((va) this).field_k[fieldTemp$8] = (byte)(int)(param1 >> 56);
          if (param0 == 1290648728) {
            break L0;
          } else {
            var5 = null;
            ((va) this).a(true, -58, (byte[]) null, 44);
            break L0;
          }
        }
        int fieldTemp$9 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$9] = (byte)(int)(param1 >> 48);
        int fieldTemp$10 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$10] = (byte)(int)(param1 >> 40);
        int fieldTemp$11 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$11] = (byte)(int)(param1 >> 32);
        int fieldTemp$12 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$12] = (byte)(int)(param1 >> 24);
        int fieldTemp$13 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$13] = (byte)(int)(param1 >> 16);
        int fieldTemp$14 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$14] = (byte)(int)(param1 >> 8);
        int fieldTemp$15 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$15] = (byte)(int)param1;
    }

    final void a(boolean param0, int[] param1, int param2, int param3) {
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
        var13 = wizardrun.field_H;
        try {
          L0: {
            var5_int = ((va) this).field_m;
            ((va) this).field_m = param2;
            if (!param0) {
              var6 = (-param2 + param3) / 8;
              var7 = 0;
              L1: while (true) {
                if (var7 >= var6) {
                  ((va) this).field_m = var5_int;
                  break L0;
                } else {
                  var8 = ((va) this).i(255);
                  var9 = ((va) this).i(255);
                  var10 = -957401312;
                  var11 = -1640531527;
                  var12 = 32;
                  L2: while (true) {
                    int incrementValue$1 = var12;
                    var12--;
                    if (0 >= incrementValue$1) {
                      ((va) this).field_m = ((va) this).field_m - 8;
                      ((va) this).f(var8, 613003928);
                      ((va) this).f(var9, 613003928);
                      var7++;
                      continue L1;
                    } else {
                      var9 = var9 - (param1[1470103555 & var10 >>> 11] + var10 ^ (var8 << 4 ^ var8 >>> 5) - -var8);
                      var10 = var10 - var11;
                      var8 = var8 - (var10 - -param1[3 & var10] ^ var9 + (var9 >>> 5 ^ var9 << 4));
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
            stackOut_11_1 = new StringBuilder().append("va.M(").append(param0).append(44);
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
          throw bd.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void d(int param0, int param1) {
        if (param1 < 64) {
            if (!(param1 < -64)) {
                ((va) this).b((byte) 11, 64 + param1);
                return;
            }
        }
        if (param1 < 16384) {
            if (!(param1 < -16384)) {
                ((va) this).b(-1947079288, 49152 + param1);
                return;
            }
        }
        if (param0 != 1710370149) {
            return;
        }
        throw new IllegalArgumentException();
    }

    final void a(byte param0, int param1) {
        if (!(-1 == (param1 & -128))) {
            if (!((param1 & -16384) == 0)) {
                if (!(0 == (param1 & -2097152))) {
                    if (-1 != (param1 & -268435456)) {
                        ((va) this).b((byte) 11, 128 | param1 >>> 28);
                    }
                    ((va) this).b((byte) 11, 128 | param1 >>> 21);
                }
                ((va) this).b((byte) 11, (param1 | 2107542) >>> 14);
            }
            ((va) this).b((byte) 11, (16440 | param1) >>> 7);
        }
        if (param0 != -117) {
            ((va) this).field_k = null;
        }
        ((va) this).b((byte) 11, param1 & 127);
    }

    final long e(byte param0) {
        if (param0 != 0) {
            return 72L;
        }
        long var2 = (long)((va) this).i(255) & 4294967295L;
        long var4 = 4294967295L & (long)((va) this).i(255);
        return (var2 << 32) + var4;
    }

    final int a(int param0) {
        int var2 = 255 & ((va) this).field_k[((va) this).field_m];
        if (param0 != 20479) {
            return -111;
        }
        if (128 <= var2) {
            return -49152 + ((va) this).j(-14477);
        }
        return ((va) this).f(255) + -64;
    }

    final String c(int param0) {
        if (param0 == ~((va) this).field_k[((va) this).field_m]) {
            ((va) this).field_m = ((va) this).field_m + 1;
            return null;
        }
        return ((va) this).d(0);
    }

    final int d(byte param0) {
        if (param0 <= 73) {
            return 26;
        }
        ((va) this).field_m = ((va) this).field_m + 3;
        return ((255 & ((va) this).field_k[-3 + ((va) this).field_m]) << 16) + (((va) this).field_k[-2 + ((va) this).field_m] << 8 & 65280) - -(255 & ((va) this).field_k[((va) this).field_m + -1]);
    }

    final void b(int param0, int param1) {
        int fieldTemp$0 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$0] = (byte)(param1 >> 8);
        int fieldTemp$1 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$1] = (byte)param1;
        if (param0 != -1947079288) {
            field_j = null;
        }
    }

    final int f(int param0) {
        if (param0 != 255) {
            field_l = null;
        }
        int fieldTemp$0 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        return 255 & ((va) this).field_k[fieldTemp$0];
    }

    final void a(boolean param0, int param1, byte[] param2, int param3) {
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
        var6 = wizardrun.field_H;
        try {
          L0: {
            if (param0) {
              var5_int = param3;
              L1: while (true) {
                if (var5_int >= param3 - -param1) {
                  break L0;
                } else {
                  int fieldTemp$8 = ((va) this).field_m;
                  ((va) this).field_m = ((va) this).field_m + 1;
                  param2[var5_int] = ((va) this).field_k[fieldTemp$8];
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
            stackOut_7_1 = new StringBuilder().append("va.IA(").append(param0).append(44).append(param1).append(44);
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
          throw bd.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param3 + 41);
        }
    }

    final void a(String param0, boolean param1) {
        int var3_int = param0.indexOf(' ');
        if (var3_int >= 0) {
            throw new IllegalArgumentException("");
        }
        CharSequence var4 = (CharSequence) (Object) param0;
        ((va) this).field_m = ((va) this).field_m + pg.a(8220, ((va) this).field_k, 0, var4, ((va) this).field_m, param0.length());
        if (param1) {
            return;
        }
        try {
            int fieldTemp$0 = ((va) this).field_m;
            ((va) this).field_m = ((va) this).field_m + 1;
            ((va) this).field_k[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "va.QA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final String h(int param0) {
        int fieldTemp$0 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        int var2 = ((va) this).field_k[fieldTemp$0];
        if (param0 != 727059944) {
            return null;
        }
        if (var2 != 0) {
            throw new IllegalStateException("");
        }
        int var3 = ((va) this).field_m;
        while (true) {
            int fieldTemp$1 = ((va) this).field_m;
            ((va) this).field_m = ((va) this).field_m + 1;
            if (((va) this).field_k[fieldTemp$1] == 0) {
                break;
            }
        }
        int var4 = -1 + -var3 + ((va) this).field_m;
        if (!(0 != var4)) {
            return "";
        }
        return bi.a(var3, var4, ((va) this).field_k, false);
    }

    final static void a(int param0, String param1) {
        if (param0 != -2) {
            return;
        }
        try {
            sf.field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "va.OA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, int param1) {
        ((va) this).field_k[((va) this).field_m - (param0 - -1)] = (byte)param0;
        if (param1 >= -43) {
            int discarded$0 = ((va) this).e(108, -51);
        }
    }

    public static void g() {
        field_o = null;
        field_n = null;
        field_l = null;
        int var1 = 0;
        field_i = null;
        field_j = null;
    }

    final int g(int param0) {
        if (param0 != 11681) {
            field_j = null;
        }
        int var2 = ((va) this).field_k[((va) this).field_m] & 255;
        if (var2 >= 128) {
            return -32768 + ((va) this).j(param0 ^ -5422);
        }
        return ((va) this).f(255);
    }

    va(int param0) {
        ((va) this).field_m = 0;
        int discarded$0 = 1;
        ((va) this).field_k = ej.a(param0);
    }

    final void c(int param0, int param1) {
        int var4 = wizardrun.field_H;
        if (param1 <= 122) {
            String discarded$0 = ((va) this).d(-54);
        }
        while (((va) this).field_m < param0) {
            int fieldTemp$1 = ((va) this).field_m;
            ((va) this).field_m = ((va) this).field_m + 1;
            ((va) this).field_k[fieldTemp$1] = (byte) 0;
        }
    }

    final int i(int param0) {
        ((va) this).field_m = ((va) this).field_m + 4;
        if (param0 != 255) {
            ((va) this).field_k = null;
        }
        return (((va) this).field_k[-1 + ((va) this).field_m] & 255) + (((((va) this).field_k[((va) this).field_m - 3] & 255) << 16) + (-16777216 & ((va) this).field_k[((va) this).field_m + -4] << 24) + ((255 & ((va) this).field_k[((va) this).field_m + -2]) << 8));
    }

    final void b(int param0, String param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        try {
            var3_int = param1.indexOf(' ');
            if (!(param0 > var3_int)) {
                throw new IllegalArgumentException("");
            }
            int fieldTemp$0 = ((va) this).field_m;
            ((va) this).field_m = ((va) this).field_m + 1;
            ((va) this).field_k[fieldTemp$0] = (byte) 0;
            var4 = (CharSequence) (Object) param1;
            ((va) this).field_m = ((va) this).field_m + pg.a(8220, ((va) this).field_k, 0, var4, ((va) this).field_m, param1.length());
            int fieldTemp$1 = ((va) this).field_m;
            ((va) this).field_m = ((va) this).field_m + 1;
            ((va) this).field_k[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "va.BB(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void f(int param0, int param1) {
        int fieldTemp$0 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$0] = (byte)(param0 >> 24);
        int fieldTemp$1 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$1] = (byte)(param0 >> 16);
        int fieldTemp$2 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$2] = (byte)(param0 >> 8);
        if (param1 != 613003928) {
            return;
        }
        int fieldTemp$3 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$3] = (byte)param0;
    }

    final void a(boolean param0, int[] param1) {
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
        var10 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                break L1;
              }
            }
            var3_int = ((va) this).field_m / 8;
            ((va) this).field_m = 0;
            var4 = 0;
            L2: while (true) {
              if (var4 >= var3_int) {
                break L0;
              } else {
                var5 = ((va) this).i(255);
                var6 = ((va) this).i(255);
                var7 = 0;
                var8 = -1640531527;
                var9 = 32;
                L3: while (true) {
                  int incrementValue$5 = var9;
                  var9--;
                  if (incrementValue$5 <= 0) {
                    ((va) this).field_m = ((va) this).field_m - 8;
                    ((va) this).f(var5, 613003928);
                    ((va) this).f(var6, 613003928);
                    var4++;
                    continue L2;
                  } else {
                    var5 = var5 + (var7 - -param1[var7 & 3] ^ (var6 << 4 ^ var6 >>> 5) + var6);
                    var7 = var7 + var8;
                    var6 = var6 + (param1[(7920 & var7) >>> 11] + var7 ^ var5 + (var5 << 4 ^ var5 >>> 5));
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
            stackOut_10_1 = new StringBuilder().append("va.WA(").append(param0).append(44);
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
          throw bd.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    final int a(byte param0) {
        if (param0 != -88) {
            return -55;
        }
        if (((va) this).field_k[((va) this).field_m] >= 0) {
            return ((va) this).j(-14477);
        }
        return 2147483647 & ((va) this).i(255);
    }

    final void b(int param0, byte param1) {
        ((va) this).field_k[-4 + (((va) this).field_m - param0)] = (byte)(param0 >> 24);
        ((va) this).field_k[-3 + (((va) this).field_m + -param0)] = (byte)(param0 >> 16);
        ((va) this).field_k[-param0 + (((va) this).field_m + -2)] = (byte)(param0 >> 8);
        if (param1 > -20) {
            Object var4 = null;
            va.a(27, (String) null);
        }
        ((va) this).field_k[-1 + (-param0 + ((va) this).field_m)] = (byte)param0;
    }

    final void a(long param0, byte param1) {
        int fieldTemp$0 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$0] = (byte)(int)(param0 >> 32);
        int fieldTemp$1 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$1] = (byte)(int)(param0 >> 24);
        int fieldTemp$2 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$2] = (byte)(int)(param0 >> 16);
        int fieldTemp$3 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$3] = (byte)(int)(param0 >> 8);
        int fieldTemp$4 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$4] = (byte)(int)param0;
        if (param1 <= 101) {
            field_j = null;
        }
    }

    final byte k(int param0) {
        if (param0 != 0) {
            ((va) this).field_m = 10;
        }
        int fieldTemp$0 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        return ((va) this).field_k[fieldTemp$0];
    }

    final int j(int param0) {
        if (param0 != -14477) {
            return -34;
        }
        ((va) this).field_m = ((va) this).field_m + 2;
        return (255 & ((va) this).field_k[-1 + ((va) this).field_m]) + (((va) this).field_k[-2 + ((va) this).field_m] << 8 & 65280);
    }

    final int e(int param0, int param1) {
        if (param1 != -1182887024) {
            String discarded$0 = ((va) this).d(-77);
        }
        int var3 = gh.a(((va) this).field_k, 107, param0, ((va) this).field_m);
        ((va) this).f(var3, 613003928);
        return var3;
    }

    final void a(int param0, byte param1) {
        ((va) this).field_k[-2 + -param0 + ((va) this).field_m] = (byte)(param0 >> 8);
        ((va) this).field_k[-1 + (((va) this).field_m - param0)] = (byte)param0;
        if (param1 != -67) {
            String discarded$0 = ((va) this).d(73);
        }
    }

    private final void a(int param0, long param1) {
        if (param0 != -17729) {
            return;
        }
        int fieldTemp$0 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$0] = (byte)(int)(param1 >> 48);
        int fieldTemp$1 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$1] = (byte)(int)(param1 >> 40);
        int fieldTemp$2 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$2] = (byte)(int)(param1 >> 32);
        int fieldTemp$3 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$3] = (byte)(int)(param1 >> 24);
        int fieldTemp$4 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$4] = (byte)(int)(param1 >> 16);
        int fieldTemp$5 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$5] = (byte)(int)(param1 >> 8);
        int fieldTemp$6 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$6] = (byte)(int)param1;
    }

    final void a(java.math.BigInteger param0, int param1, java.math.BigInteger param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
            var4_int = ((va) this).field_m;
            ((va) this).field_m = 0;
            var5 = new byte[var4_int];
            ((va) this).a(true, var4_int, var5, 0);
            var6 = new java.math.BigInteger(var5);
            if (param1 <= 17) {
                ((va) this).d(5, -27);
            }
            var7 = var6.modPow(param2, param0);
            var8 = var7.toByteArray();
            ((va) this).field_m = 0;
            ((va) this).b(-1947079288, var8.length);
            ((va) this).a(var8, 0, var8.length, -3);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "va.R(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final int f(byte param0) {
        int var4 = wizardrun.field_H;
        int fieldTemp$0 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        int var2 = ((va) this).field_k[fieldTemp$0];
        if (param0 != -90) {
            field_l = null;
        }
        int var3 = 0;
        while (var2 < 0) {
            var3 = (var2 & 127 | var3) << 7;
            int fieldTemp$1 = ((va) this).field_m;
            ((va) this).field_m = ((va) this).field_m + 1;
            var2 = ((va) this).field_k[fieldTemp$1];
        }
        return var3 | var2;
    }

    final boolean e(int param0) {
        if (param0 != -6142) {
            Object var4 = null;
            ((va) this).a((byte[]) null, 113, 122, -33);
        }
        ((va) this).field_m = ((va) this).field_m - 4;
        int var2 = gh.a(((va) this).field_k, 116, 0, ((va) this).field_m);
        int var3 = ((va) this).i(255);
        if (var3 == var2) {
            return true;
        }
        return false;
    }

    va(byte[] param0) {
        try {
            ((va) this).field_k = param0;
            ((va) this).field_m = 0;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "va.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new rc();
        field_o = new ok();
    }
}
