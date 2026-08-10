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
        int fieldTemp$1 = 0;
        int var4 = Transmogrify.field_A ? 1 : 0;
        if (param0 != 17783) {
            return 60;
        }
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        int var2 = this.field_g[fieldTemp$0];
        int var3 = 0;
        while (0 > var2) {
            var3 = (var3 | 127 & var2) << 167517607;
            fieldTemp$1 = this.field_h;
            this.field_h = this.field_h + 1;
            var2 = this.field_g[fieldTemp$1];
        }
        return var3 | var2;
    }

    final void a(byte param0, byte[] param1, int param2, int param3) {
        int fieldTemp$2 = 0;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 < -3) {
                break L1;
              } else {
                field_k = (qj) null;
                break L1;
              }
            }
            var5_int = param3;
            L2: while (true) {
              if (param2 + param3 <= var5_int) {
                break L0;
              } else {
                fieldTemp$2 = this.field_h;
                this.field_h = this.field_h + 1;
                this.field_g[fieldTemp$2] = param1[var5_int];
                var5_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("oa.V(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(long param0, boolean param1) {
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$0] = (byte)(int)(param0 >> 961312032);
        int fieldTemp$1 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$1] = (byte)(int)(param0 >> 1904920);
        int fieldTemp$2 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$2] = (byte)(int)(param0 >> 440426320);
        int fieldTemp$3 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$3] = (byte)(int)(param0 >> 140584136);
        int fieldTemp$4 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$4] = (byte)(int)param0;
        if (!param1) {
            this.c((byte) 104);
        }
    }

    final void a(byte param0, int param1) {
        this.field_g[this.field_h - (param1 - -1)] = (byte)param1;
        if (param0 != -42) {
            this.b(-65, 48L);
        }
    }

    final long e(byte param0) {
        long var2 = 4294967295L & (long)this.c((byte) -128);
        int var6 = -53 % ((param0 - 16) / 55);
        long var4 = (long)this.c((byte) -104) & 4294967295L;
        return (var2 << -1329379616) + var4;
    }

    final void h(int param0, int param1) {
        int fieldTemp$0 = 0;
        int var4 = Transmogrify.field_A ? 1 : 0;
        while (param1 > this.field_h) {
            fieldTemp$0 = this.field_h;
            this.field_h = this.field_h + 1;
            this.field_g[fieldTemp$0] = (byte) 0;
        }
        if (param0 != -30190) {
            this.field_h = -28;
        }
    }

    final static boolean f(byte param0) {
        int var1 = -82 % ((param0 - -57) / 51);
        return vh.a(ha.b(81), 0);
    }

    final void g(int param0, int param1) {
        if ((param1 ^ -1) > -65) {
            if (!(63 < (param1 ^ -1))) {
                this.f(6389, 64 + param1);
                return;
            }
        }
        if (param0 != -21770) {
            this.h(64);
        }
        if (-16385 < (param1 ^ -1) && -16384 <= param1) {
            this.c(param1 + 49152, -159688920);
            return;
        }
        throw new IllegalArgumentException();
    }

    final static mi a(int param0, ci param1, ci param2, int param3, int param4) {
        RuntimeException var5 = null;
        mi stackIn_2_0 = null;
        mi stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -123) {
              if (rl.a(param4, 0, param3, param2)) {
                stackIn_7_0 = ea.a(param1.a((byte) -93, param4, param3), 0);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = (mi) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("oa.DA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) {
        int fieldTemp$2 = 0;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 2) {
                break L1;
              } else {
                this.d(97, 26);
                break L1;
              }
            }
            var5_int = param3;
            L2: while (true) {
              if (param3 - -param0 <= var5_int) {
                break L0;
              } else {
                fieldTemp$2 = this.field_h;
                this.field_h = this.field_h + 1;
                param2[var5_int] = this.field_g[fieldTemp$2];
                var5_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("oa.T(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ')');
        }
    }

    final int h(int param0) {
        if (param0 != -16777216) {
            oa.f((byte) -10);
        }
        if (this.field_g[this.field_h] >= 0) {
            return this.a((byte) -111);
        }
        return 2147483647 & this.c((byte) -104);
    }

    final String e(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        int var2 = this.field_g[fieldTemp$0];
        if (!(var2 == 0)) {
            throw new IllegalStateException("");
        }
        if (param0 < 25) {
            this.g(-108, 29);
        }
        int var3 = this.field_h;
        while (true) {
            fieldTemp$1 = this.field_h;
            this.field_h = this.field_h + 1;
            if (this.field_g[fieldTemp$1] == 0) {
                break;
            }
        }
        int var4 = -var3 + this.field_h - 1;
        if (var4 == 0) {
            return "";
        }
        return cc.a(var3, 15923, var4, this.field_g);
    }

    final void a(String param0, int param1) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        try {
            var3_int = param0.indexOf(' ');
            if (!(var3_int < 0)) {
                throw new IllegalArgumentException("");
            }
            if (param1 < 122) {
                this.c(18, 97);
            }
            fieldTemp$0 = this.field_h;
            this.field_h = this.field_h + 1;
            this.field_g[fieldTemp$0] = (byte) 0;
            var4 = (CharSequence) ((Object) param0);
            this.field_h = this.field_h + rb.a(this.field_h, var4, this.field_g, param0.length(), (byte) -116, 0);
            fieldTemp$1 = this.field_h;
            this.field_h = this.field_h + 1;
            this.field_g[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "oa.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(java.math.BigInteger param0, int param1, java.math.BigInteger param2) {
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        int var4_int = this.field_h;
        this.field_h = 0;
        if (param1 > -115) {
            return;
        }
        try {
            var5 = new byte[var4_int];
            this.a(var4_int, 2, var5, 0);
            var6 = new java.math.BigInteger(var5);
            var7 = var6.modPow(param0, param2);
            var8 = var7.toByteArray();
            this.field_h = 0;
            this.c(var8.length, -159688920);
            this.a((byte) -11, var8, var8.length, 0);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "oa.EA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, String param1) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
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
                          var3_long = var3_long + (long)(var9 + 2 + -65);
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
                if (var8 == 10) {
                  var5 = var3_long;
                  var3_long = 0L;
                  var8--;
                  continue L1;
                } else {
                  var8--;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var3);

            stackIn_25_1 = new StringBuilder().append("oa.CA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L7;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L7;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
    }

    final void a(int param0, String param1) {
        int var4 = 0;
        CharSequence var5 = null;
        int fieldTemp$0 = 0;
        try {
            int var3_int = 64 / ((param0 - -47) / 60);
            var4 = param1.indexOf(' ');
            if ((var4 ^ -1) <= -1) {
                throw new IllegalArgumentException("");
            }
            var5 = (CharSequence) ((Object) param1);
            this.field_h = this.field_h + rb.a(this.field_h, var5, this.field_g, param1.length(), (byte) -116, 0);
            fieldTemp$0 = this.field_h;
            this.field_h = this.field_h + 1;
            this.field_g[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "oa.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int k(int param0) {
        int var2 = 255 & this.field_g[this.field_h];
        if (param0 > var2) {
            return -64 + this.d((byte) 47);
        }
        return this.a((byte) -93) - 49152;
    }

    final int g(byte param0) {
        if (param0 != 124) {
            java.math.BigInteger var3 = (java.math.BigInteger) null;
            this.a((java.math.BigInteger) null, -98, (java.math.BigInteger) null);
        }
        this.field_h = this.field_h + 3;
        return (this.field_g[-2 + this.field_h] << 101173128 & 65280) + ((this.field_g[-3 + this.field_h] << 1579972176 & 16711680) - -(this.field_g[-1 + this.field_h] & 255));
    }

    final void a(int[] param0, int param1) {
        int incrementValue$2 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var10 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var3_int = this.field_h / 8;
            this.field_h = 0;
            if (param1 > 98) {
              var4 = 0;
              L1: while (true) {
                if (var3_int <= var4) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var5 = this.c((byte) -123);
                  var6 = this.c((byte) -116);
                  var7 = 0;
                  var8 = -1640531527;
                  var9 = 32;
                  L2: while (true) {
                    incrementValue$2 = var9;
                    var9--;
                    if (-1 <= (incrementValue$2 ^ -1)) {
                      this.field_h = this.field_h - 8;
                      this.a(-126, var5);
                      this.a(-105, var6);
                      var4++;
                      continue L1;
                    } else {
                      var5 = var5 + ((var6 >>> -394158011 ^ var6 << 2137441572) + var6 ^ param0[3 & var7] + var7);
                      var7 = var7 + var8;
                      var6 = var6 + (var7 - -param0[(7221 & var7) >>> 2077766123] ^ (var5 << -1025387036 ^ var5 >>> 2099239589) + var5);
                      continue L2;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("oa.FA(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final byte b(boolean param0) {
        if (!param0) {
            this.c(125, -50);
        }
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        return this.field_g[fieldTemp$0];
    }

    final String g(int param0) {
        int fieldTemp$0 = 0;
        if (param0 != 12248) {
            this.field_g = (byte[]) null;
        }
        int var2 = this.field_h;
        while (true) {
            fieldTemp$0 = this.field_h;
            this.field_h = this.field_h + 1;
            if (this.field_g[fieldTemp$0] == 0) {
                break;
            }
        }
        int var3 = -var2 + this.field_h - 1;
        if (var3 == 0) {
            return "";
        }
        return cc.a(var2, 15923, var3, this.field_g);
    }

    final int f(int param0) {
        int var2 = 255 & this.field_g[this.field_h];
        if (param0 >= -24) {
            this.f(75);
        }
        if ((var2 ^ -1) > -129) {
            return this.d((byte) 115);
        }
        return -32768 + this.a((byte) -99);
    }

    final void i(int param0, int param1) {
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$0] = (byte)(param0 >> -88933744);
        if (param1 <= 43) {
            int[] var4 = (int[]) null;
            this.a((int[]) null, false, -55, 109);
        }
        int fieldTemp$1 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$1] = (byte)(param0 >> -148624184);
        int fieldTemp$2 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$2] = (byte)param0;
    }

    final void j(int param0, int param1) {
        this.field_g[-param1 + this.field_h + -4] = (byte)(param1 >> 428612344);
        this.field_g[-3 + (-param1 + this.field_h)] = (byte)(param1 >> -1049755824);
        this.field_g[-2 + -param1 + this.field_h] = (byte)(param1 >> 422772360);
        this.field_g[this.field_h + -param1 - 1] = (byte)param1;
        if (param0 != 567) {
            field_i = (String) null;
        }
    }

    final int a(byte param0) {
        this.field_h = this.field_h + 2;
        if (param0 >= -84) {
            this.b(-26, -89L);
        }
        return ((this.field_g[-2 + this.field_h] & 255) << -1066071352) - -(255 & this.field_g[this.field_h - 1]);
    }

    final boolean d(int param0) {
        if (param0 != 5432) {
            byte[] var4 = (byte[]) null;
            this.a((byte) -26, (byte[]) null, -22, -93);
        }
        this.field_h = this.field_h - 4;
        int var2 = sg.a(0, (byte) -22, this.field_h, this.field_g);
        int var3 = this.c((byte) -106);
        if (var2 == var3) {
            return true;
        }
        return false;
    }

    final int d(byte param0) {
        if (param0 < 21) {
            return 90;
        }
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        return 255 & this.field_g[fieldTemp$0];
    }

    final void f(int param0, int param1) {
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$0] = (byte)param1;
        if (param0 != 6389) {
            this.field_h = 49;
        }
    }

    final void e(int param0, int param1) {
        if (!(0 == (-128 & param0))) {
            if (!((-16384 & param0) == 0)) {
                if ((-2097152 & param0) != 0) {
                    if (!((param0 & -268435456) == 0)) {
                        this.f(param1 ^ -268429067, param0 >>> -137343620 | 128);
                    }
                    this.f(param1 ^ -268429067, (269616035 | param0) >>> -1128531339);
                }
                this.f(6389, (2098829 | param0) >>> 1232303982);
            }
            this.f(param1 + 268441845, (16481 | param0) >>> -1088123385);
        }
        if (param1 != -268435456) {
            field_j = -120;
        }
        this.f(6389, 127 & param0);
    }

    final int c(byte param0) {
        if (param0 >= -103) {
            return 54;
        }
        this.field_h = this.field_h + 4;
        return (65280 & this.field_g[this.field_h + -2] << -1323322296) + (this.field_g[this.field_h - 4] << -917446472 & -16777216) + ((this.field_g[this.field_h + -3] << -948108528 & 16711680) - -(this.field_g[-1 + this.field_h] & 255));
    }

    oa(int param0) {
        this.field_g = vk.a(param0, -86);
        this.field_h = 0;
    }

    final void c(int param0, int param1) {
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$0] = (byte)(param0 >> -159688920);
        if (param1 != -159688920) {
            field_l = (tf) null;
        }
        int fieldTemp$1 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$1] = (byte)param0;
    }

    final void a(int param0, int param1) {
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$0] = (byte)(param1 >> 58604728);
        if (param0 >= -94) {
            field_k = (qj) null;
        }
        int fieldTemp$1 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$1] = (byte)(param1 >> 430958640);
        int fieldTemp$2 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$2] = (byte)(param1 >> -1189075352);
        int fieldTemp$3 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$3] = (byte)param1;
    }

    final int d(int param0, int param1) {
        if (param1 != -1323322296) {
            int[] var4 = (int[]) null;
            this.a((int[]) null, 127);
        }
        int var3 = sg.a(param0, (byte) -103, this.field_h, this.field_g);
        this.a(-127, var3);
        return var3;
    }

    final String j(int param0) {
        if (param0 != -1640531527) {
            field_j = 89;
        }
        if (!(0 != this.field_g[this.field_h])) {
            this.field_h = this.field_h + 1;
            return null;
        }
        return this.g(12248);
    }

    final void b(int param0, int param1) {
        this.field_g[-2 + this.field_h + -param1] = (byte)(param1 >> 1811228936);
        this.field_g[this.field_h + (-param1 + -1)] = (byte)param1;
        if (param0 >= -108) {
            byte[] var4 = (byte[]) null;
            this.a(15, 46, (byte[]) null, -117);
        }
    }

    final void a(int[] param0, boolean param1, int param2, int param3) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                field_k = (qj) null;
                break L1;
              }
            }
            var5_int = this.field_h;
            this.field_h = param2;
            var6 = (-param2 + param3) / 8;
            var7 = 0;
            L2: while (true) {
              if (var7 >= var6) {
                this.field_h = var5_int;
                break L0;
              } else {
                var8 = this.c((byte) -127);
                var9 = this.c((byte) -113);
                var10 = -957401312;
                var11 = -1640531527;
                var12 = 32;
                L3: while (true) {
                  incrementValue$0 = var12;
                  var12--;
                  if ((incrementValue$0 ^ -1) >= -1) {
                    this.field_h = this.field_h - 8;
                    this.a(-118, var8);
                    this.a(-121, var9);
                    var7++;
                    continue L2;
                  } else {
                    var9 = var9 - (var8 + (var8 >>> -295479739 ^ var8 << 292611812) ^ var10 + param0[(6389 & var10) >>> 504546795]);
                    var10 = var10 - var11;
                    var8 = var8 - ((var9 >>> -1683859387 ^ var9 << 52167588) - -var9 ^ param0[3 & var10] + var10);
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
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("oa.N(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    oa(byte[] param0) {
        try {
            this.field_h = 0;
            this.field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "oa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, long param1) {
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$0] = (byte)(int)(param1 >> 971457584);
        int fieldTemp$1 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$1] = (byte)(int)(param1 >> -1871182616);
        int fieldTemp$2 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$2] = (byte)(int)(param1 >> 1543687520);
        if (param0 != 1543687520) {
            this.a((byte) -86, -99);
        }
        int fieldTemp$3 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$3] = (byte)(int)(param1 >> 760543192);
        int fieldTemp$4 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$4] = (byte)(int)(param1 >> -1702723440);
        int fieldTemp$5 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$5] = (byte)(int)(param1 >> -2013778296);
        int fieldTemp$6 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$6] = (byte)(int)param1;
    }

    final void b(int param0, long param1) {
        if (param0 != 1908720528) {
            field_i = (String) null;
        }
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$0] = (byte)(int)(param1 >> 1487112184);
        int fieldTemp$1 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$1] = (byte)(int)(param1 >> -1963141968);
        int fieldTemp$2 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$2] = (byte)(int)(param1 >> -397010456);
        int fieldTemp$3 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$3] = (byte)(int)(param1 >> -1103030560);
        int fieldTemp$4 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$4] = (byte)(int)(param1 >> 683328856);
        int fieldTemp$5 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$5] = (byte)(int)(param1 >> 1908720528);
        int fieldTemp$6 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$6] = (byte)(int)(param1 >> 398182344);
        int fieldTemp$7 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$7] = (byte)(int)param1;
    }

    public static void b(byte param0) {
        field_k = null;
        field_m = null;
        field_l = null;
        int var1 = -75 % ((6 - param0) / 40);
        field_i = null;
    }

    static {
        field_i = "Account created successfully!";
        field_j = 0;
        field_l = new tf(2, 4, 4, 0);
    }
}
