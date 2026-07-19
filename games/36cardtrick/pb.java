/*
 * Decompiled by CFR-JS 0.4.0.
 */
class pb extends qb {
    byte[] field_g;
    static kc field_k;
    static int field_j;
    int field_i;
    static boolean field_h;

    final void f(int param0, int param1) {
        this.field_g[-1 + (this.field_i - param0)] = (byte)param0;
        if (param1 == 8049) {
            return;
        }
        this.field_g = (byte[]) null;
    }

    final int e(boolean param0) {
        if (!param0) {
            this.f(35, -38);
            this.field_i = this.field_i + 3;
            return ((255 & this.field_g[-2 + this.field_i]) << 1801365000) + ((this.field_g[-3 + this.field_i] << -735951856 & 16711680) - -(255 & this.field_g[this.field_i - 1]));
        }
        this.field_i = this.field_i + 3;
        return ((255 & this.field_g[-2 + this.field_i]) << 1801365000) + ((this.field_g[-3 + this.field_i] << -735951856 & 16711680) - -(255 & this.field_g[this.field_i - 1]));
    }

    final byte a(boolean param0) {
        int fieldTemp$0 = 0;
        if (!param0) {
            this.b(-119, -24);
            fieldTemp$0 = this.field_i;
            this.field_i = this.field_i + 1;
            return this.field_g[fieldTemp$0];
        }
        int fieldTemp$1 = this.field_i;
        this.field_i = this.field_i + 1;
        return this.field_g[fieldTemp$1];
    }

    private final void b(long param0, int param1) {
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$0] = (byte)(int)(param0 >> 695453232);
        int fieldTemp$1 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$1] = (byte)(int)(param0 >> 347751848);
        int fieldTemp$2 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$2] = (byte)(int)(param0 >> 977465504);
        int var4 = -33 / ((param1 - -31) / 52);
        int fieldTemp$3 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$3] = (byte)(int)(param0 >> -542704936);
        int fieldTemp$4 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$4] = (byte)(int)(param0 >> 284882704);
        int fieldTemp$5 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$5] = (byte)(int)(param0 >> 744825352);
        int fieldTemp$6 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$6] = (byte)(int)param0;
    }

    final void a(int param0, int param1, int param2, int[] param3) {
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
        int[] var14 = null;
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
        var13 = Main.field_T;
        try {
          L0: {
            L1: {
              var5_int = this.field_i;
              this.field_i = param0;
              if (param2 <= -107) {
                break L1;
              } else {
                var14 = (int[]) null;
                this.a((int[]) null, 32);
                break L1;
              }
            }
            var6 = (-param0 + param1) / 8;
            var7 = 0;
            L2: while (true) {
              if (var6 <= var7) {
                this.field_i = var5_int;
                break L0;
              } else {
                var8 = this.e((byte) 126);
                var9 = this.e((byte) 126);
                var10 = -957401312;
                var11 = -1640531527;
                var12 = 32;
                L3: while (true) {
                  incrementValue$1 = var12;
                  var12--;
                  if ((incrementValue$1 ^ -1) >= -1) {
                    this.field_i = this.field_i - 8;
                    this.a(-246, var8);
                    this.a(-246, var9);
                    var7++;
                    continue L2;
                  } else {
                    var9 = var9 - (var10 - -param3[343932931 & var10 >>> -1580755125] ^ (var8 << 1027333892 ^ var8 >>> 477734629) + var8);
                    var10 = var10 - var11;
                    var8 = var8 - (param3[var10 & 3] + var10 ^ (var9 << 757193668 ^ var9 >>> 849299813) - -var9);
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
            stackOut_11_1 = new StringBuilder().append("pb.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
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
          throw ma.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    final void a(long param0, byte param1) {
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$0] = (byte)(int)(param0 >> -1755117768);
        if (param1 != 98) {
            return;
        }
        int fieldTemp$1 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$1] = (byte)(int)(param0 >> -51094032);
        int fieldTemp$2 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$2] = (byte)(int)(param0 >> -539624792);
        int fieldTemp$3 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$3] = (byte)(int)(param0 >> 623477024);
        int fieldTemp$4 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$4] = (byte)(int)(param0 >> 1743942488);
        int fieldTemp$5 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$5] = (byte)(int)(param0 >> 1135300880);
        int fieldTemp$6 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$6] = (byte)(int)(param0 >> -1230903288);
        int fieldTemp$7 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$7] = (byte)(int)param0;
    }

    final void a(java.math.BigInteger param0, java.math.BigInteger param1, int param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
            var4_int = this.field_i;
            this.field_i = 0;
            var5 = new byte[var4_int];
            this.a(param2 + 15893, var5, 0, var4_int);
            var6 = new java.math.BigInteger(var5);
            var7 = var6.modPow(param1, param0);
            var8 = var7.toByteArray();
            this.field_i = 0;
            this.e(var8.length, 26040);
            if (param2 != -15792) {
                field_k = (kc) null;
            }
            this.a(var8.length, 0, var8, (byte) -113);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "pb.HA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        h.a(param0, (byte) 52, "");
        if (param1 < 4) {
            return;
        }
        try {
            wh.a(param0, 63);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "pb.EA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String d(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        int var2 = this.field_g[fieldTemp$0];
        int var3 = 10 / ((33 - param0) / 53);
        if (!(var2 == 0)) {
            throw new IllegalStateException("");
        }
        int var4 = this.field_i;
        while (true) {
            fieldTemp$1 = this.field_i;
            this.field_i = this.field_i + 1;
            if (this.field_g[fieldTemp$1] == 0) {
                break;
            }
        }
        int var5 = -var4 + this.field_i - 1;
        if (var5 == 0) {
            return "";
        }
        return bd.a(255, var4, this.field_g, var5);
    }

    final void d(int param0, int param1) {
        this.field_g[-param0 + (this.field_i - 2)] = (byte)(param0 >> 1077277896);
        this.field_g[-1 + -param0 + this.field_i] = (byte)param0;
        if (param1 == -27308) {
            return;
        }
        String var4 = (String) null;
        this.a(-105, (String) null);
    }

    final int b(int param0, byte param1) {
        int var3 = ml.a(this.field_g, param0, this.field_i, param1 ^ 12014);
        this.a(-246, var3);
        if (param1 != 5) {
            field_k = (kc) null;
            return var3;
        }
        return var3;
    }

    final void a(int param0, String param1) {
        String discarded$0 = null;
        int var3_int = 0;
        int fieldTemp$1 = 0;
        CharSequence var4 = null;
        int fieldTemp$2 = 0;
        try {
            if (param0 != 744825352) {
                discarded$0 = this.d(80);
            }
            var3_int = param1.indexOf(' ');
            if ((var3_int ^ -1) <= -1) {
                throw new IllegalArgumentException("");
            }
            fieldTemp$1 = this.field_i;
            this.field_i = this.field_i + 1;
            this.field_g[fieldTemp$1] = (byte) 0;
            var4 = (CharSequence) ((Object) param1);
            this.field_i = this.field_i + hi.a(param1.length(), 0, this.field_g, var4, this.field_i, false);
            fieldTemp$2 = this.field_i;
            this.field_i = this.field_i + 1;
            this.field_g[fieldTemp$2] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "pb.W(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(li param0, int param1) {
        try {
            if (param1 != 13427) {
                java.applet.Applet var3 = (java.applet.Applet) null;
                pb.a((java.applet.Applet) null, (byte) -39);
            }
            bg.field_tb.a(param0);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "pb.GA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, byte param1) {
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$0] = (byte)(param0 >> 729225616);
        int fieldTemp$1 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$1] = (byte)(param0 >> -1412304632);
        int fieldTemp$2 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$2] = (byte)param0;
        if (param1 == 60) {
            return;
        }
        field_k = (kc) null;
    }

    final int b(boolean param0) {
        if (param0) {
            return 99;
        }
        if (0 <= this.field_g[this.field_i]) {
            return this.d((byte) 72);
        }
        return 2147483647 & this.e((byte) 126);
    }

    final void b(String param0, int param1) {
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
        var10 = Main.field_T;
        try {
          L0: {
            L1: {
              var3_long = 0L;
              if (param1 == 15045) {
                break L1;
              } else {
                field_h = false;
                break L1;
              }
            }
            var5 = 0L;
            var7 = param0.length();
            var8 = 19;
            L2: while (true) {
              if (0 > var8) {
                this.b(var3_long, 87);
                this.b(var5, -127);
                break L0;
              } else {
                L3: {
                  var3_long = var3_long * 38L;
                  if (var7 <= var8) {
                    break L3;
                  } else {
                    L4: {
                      var9 = param0.charAt(var8);
                      if (65 > var9) {
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
                      if (var9 < 97) {
                        break L5;
                      } else {
                        if (var9 > 122) {
                          break L5;
                        } else {
                          var3_long = var3_long + (long)(-97 + (var9 + 2));
                          break L3;
                        }
                      }
                    }
                    L6: {
                      if (var9 < 48) {
                        break L6;
                      } else {
                        if (var9 > 57) {
                          break L6;
                        } else {
                          var3_long = var3_long + (long)(28 - -var9 - 48);
                          break L3;
                        }
                      }
                    }
                    var3_long = var3_long + 1L;
                    break L3;
                  }
                }
                L7: {
                  if (-11 != (var8 ^ -1)) {
                    break L7;
                  } else {
                    var5 = var3_long;
                    var3_long = 0L;
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
            stackOut_21_0 = (RuntimeException) (var3);
            stackOut_21_1 = new StringBuilder().append("pb.I(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
    }

    final int d(byte param0) {
        this.field_i = this.field_i + 2;
        if (param0 != 72) {
            field_k = (kc) null;
            return ((this.field_g[-2 + this.field_i] & 255) << 1491421416) - -(this.field_g[-1 + this.field_i] & 255);
        }
        return ((this.field_g[-2 + this.field_i] & 255) << 1491421416) - -(this.field_g[-1 + this.field_i] & 255);
    }

    final int f(int param0) {
        int var2 = -93 / ((-40 - param0) / 54);
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        return this.field_g[fieldTemp$0] & 255;
    }

    final long d(boolean param0) {
        long var2 = 0L;
        long var4 = 0L;
        if (!param0) {
            int[] var6 = (int[]) null;
            this.a((int[]) null, -115);
            var2 = (long)this.e((byte) 125) & 4294967295L;
            var4 = (long)this.e((byte) 125) & 4294967295L;
            return var4 + (var2 << -464188256);
        }
        var2 = (long)this.e((byte) 125) & 4294967295L;
        var4 = (long)this.e((byte) 125) & 4294967295L;
        return var4 + (var2 << -464188256);
    }

    final void a(int param0, byte[] param1, int param2, int param3) {
        String discarded$10 = null;
        int fieldTemp$11 = 0;
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
        var6 = Main.field_T;
        try {
          L0: {
            L1: {
              if (param0 > 1) {
                break L1;
              } else {
                discarded$10 = this.f((byte) 15);
                break L1;
              }
            }
            var5_int = param2;
            L2: while (true) {
              if (param2 - -param3 <= var5_int) {
                break L0;
              } else {
                fieldTemp$11 = this.field_i;
                this.field_i = this.field_i + 1;
                param1[var5_int] = this.field_g[fieldTemp$11];
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
            stackOut_7_1 = new StringBuilder().append("pb.AA(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
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
          throw ma.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(long param0, int param1) {
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$0] = (byte)(int)(param0 >> -472318688);
        int fieldTemp$1 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$1] = (byte)(int)(param0 >> -1406222120);
        int fieldTemp$2 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$2] = (byte)(int)(param0 >> 1442653008);
        int fieldTemp$3 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$3] = (byte)(int)(param0 >> 1636194440);
        int fieldTemp$4 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$4] = (byte)(int)param0;
        if (param1 > 94) {
            return;
        }
        String discarded$5 = this.f((byte) 48);
    }

    final boolean e(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (param0 != -1) {
            field_h = false;
            this.field_i = this.field_i - 4;
            var2 = ml.a(this.field_g, 0, this.field_i, 12011);
            var3 = this.e((byte) 124);
            if (var2 == var3) {
                return true;
            }
            return false;
        }
        this.field_i = this.field_i - 4;
        var2 = ml.a(this.field_g, 0, this.field_i, 12011);
        var3 = this.e((byte) 124);
        if (var2 == var3) {
            return true;
        }
        return false;
    }

    final int a(int param0) {
        String discarded$4 = null;
        int var2 = 255 & this.field_g[this.field_i];
        if (param0 != 0) {
            discarded$4 = this.c(false);
            if (var2 >= 128) {
                return this.d((byte) 72) + -32768;
            }
            return this.f(-107);
        }
        if (var2 >= 128) {
            return this.d((byte) 72) + -32768;
        }
        return this.f(-107);
    }

    final void a(String param0, int param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        int fieldTemp$0 = 0;
        try {
            if (param1 != 19235) {
                this.a(-127L, -81);
            }
            var3_int = param0.indexOf(' ');
            if (var3_int >= 0) {
                throw new IllegalArgumentException("");
            }
            var4 = (CharSequence) ((Object) param0);
            this.field_i = this.field_i + hi.a(param0.length(), 0, this.field_g, var4, this.field_i, false);
            fieldTemp$0 = this.field_i;
            this.field_i = this.field_i + 1;
            this.field_g[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "pb.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, byte[] param2, byte param3) {
        int fieldTemp$7 = 0;
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
        var6 = Main.field_T;
        try {
          L0: {
            L1: {
              var5_int = param1;
              if (param3 <= -73) {
                break L1;
              } else {
                this.b(51L, -75);
                break L1;
              }
            }
            L2: while (true) {
              if (var5_int >= param0 + param1) {
                break L0;
              } else {
                fieldTemp$7 = this.field_i;
                this.field_i = this.field_i + 1;
                this.field_g[fieldTemp$7] = param2[var5_int];
                var5_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var5);
            stackOut_6_1 = new StringBuilder().append("pb.M(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
    }

    public static void c(byte param0) {
        if (param0 < 56) {
            field_h = true;
            field_k = null;
            return;
        }
        field_k = null;
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      if (param0 == -124) {
                        break L2;
                      } else {
                        field_h = false;
                        break L2;
                      }
                    }
                    var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
                    param1.getAppletContext().showDocument(fh.a(param1, var2, -1), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var2_ref2);
                stackOut_6_1 = new StringBuilder().append("pb.U(").append(param0).append(',');
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L4;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L4;
                }
              }
              throw ma.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final String f(byte param0) {
        if (!(-1 != (this.field_g[this.field_i] ^ -1))) {
            this.field_i = this.field_i + 1;
            return null;
        }
        if (param0 != 29) {
            return (String) null;
        }
        return this.c(false);
    }

    final void b(int param0, int param1) {
        int fieldTemp$0 = 0;
        if (param0 != -9469) {
            field_h = true;
            fieldTemp$0 = this.field_i;
            this.field_i = this.field_i + 1;
            this.field_g[fieldTemp$0] = (byte)param1;
            return;
        }
        int fieldTemp$1 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$1] = (byte)param1;
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
        var10 = Main.field_T;
        try {
          L0: {
            var3_int = this.field_i / param1;
            this.field_i = 0;
            var4 = 0;
            L1: while (true) {
              if (var3_int <= var4) {
                break L0;
              } else {
                var5 = this.e((byte) 124);
                var6 = this.e((byte) 126);
                var7 = 0;
                var8 = -1640531527;
                var9 = 32;
                L2: while (true) {
                  incrementValue$5 = var9;
                  var9--;
                  if (0 >= incrementValue$5) {
                    this.field_i = this.field_i - 8;
                    this.a(param1 ^ -254, var5);
                    this.a(param1 + -254, var6);
                    var4++;
                    continue L1;
                  } else {
                    var5 = var5 + ((var6 >>> -282819131 ^ var6 << 1125987300) - -var6 ^ var7 + param0[3 & var7]);
                    var7 = var7 + var8;
                    var6 = var6 + ((var5 >>> 617532645 ^ var5 << -253904124) - -var5 ^ param0[(var7 & 7068) >>> 1761805483] + var7);
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
            stackOut_8_1 = new StringBuilder().append("pb.CA(");
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
          throw ma.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    final String c(boolean param0) {
        int fieldTemp$0 = 0;
        int var2 = this.field_i;
        while (true) {
            fieldTemp$0 = this.field_i;
            this.field_i = this.field_i + 1;
            if (this.field_g[fieldTemp$0] == 0) {
                break;
            }
        }
        int var3 = -1 + (this.field_i - var2);
        if (0 == var3) {
            return "";
        }
        if (param0) {
            String var4 = (String) null;
            this.a((String) null, 84);
            return bd.a(255, var2, this.field_g, var3);
        }
        return bd.a(255, var2, this.field_g, var3);
    }

    final int b(byte param0) {
        int discarded$4 = 0;
        int var2 = this.field_g[this.field_i] & 255;
        if (param0 != 59) {
            discarded$4 = this.b((byte) 40);
            if (128 <= var2) {
                return this.d((byte) 72) + -49152;
            }
            return -64 + this.f(80);
        }
        if (128 <= var2) {
            return this.d((byte) 72) + -49152;
        }
        return -64 + this.f(80);
    }

    final void e(int param0, int param1) {
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$0] = (byte)(param0 >> 580824904);
        int fieldTemp$1 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$1] = (byte)param0;
        if (param1 == 26040) {
            return;
        }
        String var4 = (String) null;
        this.b((String) null, 9);
    }

    final int e(byte param0) {
        if (param0 <= 123) {
            return 14;
        }
        this.field_i = this.field_i + 4;
        return (16711680 & this.field_g[this.field_i - 3] << 1945416336) + (((this.field_g[this.field_i - 4] & 255) << -379994504) - -((255 & this.field_g[this.field_i + -2]) << 1179247784)) + (255 & this.field_g[this.field_i - 1]);
    }

    final void a(int param0, int param1) {
        int fieldTemp$3 = 0;
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$0] = (byte)(param1 >> -1276144488);
        int fieldTemp$1 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$1] = (byte)(param1 >> -815763536);
        int fieldTemp$2 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$2] = (byte)(param1 >> -484888248);
        if (param0 != -246) {
            field_k = (kc) null;
            fieldTemp$3 = this.field_i;
            this.field_i = this.field_i + 1;
            this.field_g[fieldTemp$3] = (byte)param1;
            return;
        }
        int fieldTemp$4 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$4] = (byte)param1;
    }

    pb(int param0) {
        this.field_g = nh.a(-61, param0);
        this.field_i = 0;
    }

    pb(byte[] param0) {
        try {
            this.field_i = 0;
            this.field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "pb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(int param0, int param1) {
        int discarded$7 = 0;
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int var4 = 0;
        var4 = Main.field_T;
        if (param0 != 1442653008) {
          discarded$7 = this.b(false);
          L0: while (true) {
            if (this.field_i < param1) {
              fieldTemp$8 = this.field_i;
              this.field_i = this.field_i + 1;
              this.field_g[fieldTemp$8] = (byte) 0;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          L1: while (true) {
            if (this.field_i < param1) {
              fieldTemp$9 = this.field_i;
              this.field_i = this.field_i + 1;
              this.field_g[fieldTemp$9] = (byte) 0;
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    static {
        field_h = false;
    }
}
