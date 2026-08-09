/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ni extends lh {
    int field_i;
    static int field_j;
    byte[] field_k;

    final void a(int param0, int param1) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        if (param0 != -11) {
          this.c((byte) -92, 81);
          fieldTemp$2 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_k[fieldTemp$2] = (byte)param1;
          return;
        } else {
          fieldTemp$3 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_k[fieldTemp$3] = (byte)param1;
          return;
        }
    }

    final String h(int param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        var2 = this.field_i;
        L0: while (true) {
          fieldTemp$1 = this.field_i;
          this.field_i = this.field_i + 1;
          if (0 == this.field_k[fieldTemp$1]) {
            var3 = -1 + (this.field_i - var2);
            if (var3 == param0) {
              return "";
            } else {
              return pg.a(var3, var2, this.field_k, 0);
            }
          } else {
            continue L0;
          }
        }
    }

    final void b(byte[] param0, int param1, int param2, int param3) {
        int fieldTemp$1 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = param1;
                        if (param2 < -56) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        if (var5_int >= param3 + param1) {
                            statePc = 13;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        fieldTemp$1 = this.field_i;
                        this.field_i = this.field_i + 1;
                        param0[var5_int] = this.field_k[fieldTemp$1];
                        var5_int++;
                        if (var6 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        return;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var6 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        return;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_11_0 = (RuntimeException) (var5);
                    stackIn_10_0 = stackIn_11_0;
                    stackIn_11_1 = new StringBuilder().append("ni.U(");
                    stackIn_10_1 = stackIn_11_1;
                    if (param0 == null) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_12_0 = (RuntimeException) ((Object) stackIn_10_0);
                    stackIn_12_1 = (StringBuilder) ((Object) stackIn_10_1);
                    stackIn_12_2 = "{...}";
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                    stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                    stackIn_12_2 = "null";
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    throw pf.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean g(int param0) {
        int var2;
        int var3;
        int stackIn_4_0 = 0;
        if (param0 > -110) {
          this.field_i = 56;
          this.field_i = this.field_i - 4;
          var2 = uj.a(false, 0, this.field_i, this.field_k);
          var3 = this.c((byte) 122);
          if (var3 != var2) {
            return false;
          } else {
            return true;
          }
        } else {
          L0: {
            this.field_i = this.field_i - 4;
            var2 = uj.a(false, 0, this.field_i, this.field_k);
            var3 = this.c((byte) 122);
            if (var3 == var2) {
              stackIn_4_0 = 1;
              break L0;
            } else {
              stackIn_4_0 = 0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static dj a(int param0, int param1, rh param2, rh param3, int param4) {
        RuntimeException var5 = null;
        dj stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (ha.a(param3, -32180, param4, param0)) {
              L1: {
                if (param1 == -2974) {
                  break L1;
                } else {
                  field_j = 12;
                  break L1;
                }
              }
              stackIn_6_0 = bk.a(-26395, param2.a(param4, (byte) 121, param0));
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("ni.MA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param4 + ')');
        }
        return stackIn_6_0;
    }

    final void b(int param0, boolean param1) {
        this.field_k[-4 + this.field_i - param0] = (byte)(param0 >> 1580462456);
        this.field_k[-3 + -param0 + this.field_i] = (byte)(param0 >> -186901392);
        this.field_k[-param0 + (this.field_i + -2)] = (byte)(param0 >> 1996023848);
        this.field_k[-1 + (this.field_i + -param0)] = (byte)param0;
        if (!param1) {
          return;
        } else {
          this.field_k = (byte[]) null;
          return;
        }
    }

    final void b(byte param0, int param1) {
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_k[fieldTemp$0] = (byte)(param1 >> 501947880);
        int var3 = -47 / ((18 - param0) / 57);
        int fieldTemp$1 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_k[fieldTemp$1] = (byte)param1;
    }

    final static String a(int param0, char param1, byte param2) {
        char[] var3;
        int var4;
        int var5;
        char[] var6;
        var5 = fleas.field_A ? 1 : 0;
        var6 = new char[param0];
        var3 = var6;
        if (param2 <= 24) {
          field_j = -49;
          var4 = 0;
          L0: while (true) {
            L1: {
              if (param0 <= var4) {
                break L1;
              } else {
                var6[var4] = param1;
                var4++;
                if (var5 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            return new String(var6);
          }
        } else {
          var4 = 0;
          L2: while (true) {
            L3: {
              if (param0 <= var4) {
                break L3;
              } else {
                var6[var4] = param1;
                var4++;
                if (var5 == 0) {
                  continue L2;
                } else {
                  break L3;
                }
              }
            }
            return new String(var6);
          }
        }
    }

    final long f(int param0) {
        long var2;
        long var4;
        var2 = (long)this.c((byte) 123) & 4294967295L;
        var4 = (long)this.c((byte) -113) & 4294967295L;
        if (param0 >= -58) {
          this.e(false);
          return (var2 << -1248594656) + var4;
        } else {
          return (var2 << -1248594656) + var4;
        }
    }

    final static String d(boolean param0) {
        String var1;
        L0: {
          var1 = "";
          if (null == lg.field_b) {
            break L0;
          } else {
            var1 = lg.field_b.j(-1);
            break L0;
          }
        }
        if (!param0) {
          L1: {
            field_j = -77;
            if (var1.length() != 0) {
              break L1;
            } else {
              var1 = em.c(10158);
              break L1;
            }
          }
          L2: {
            if (var1.length() != 0) {
              break L2;
            } else {
              var1 = gg.field_a;
              break L2;
            }
          }
          return var1;
        } else {
          L3: {
            if (var1.length() != 0) {
              break L3;
            } else {
              var1 = em.c(10158);
              break L3;
            }
          }
          L4: {
            if (var1.length() != 0) {
              break L4;
            } else {
              var1 = gg.field_a;
              break L4;
            }
          }
          return var1;
        }
    }

    final int d(byte param0) {
        this.field_i = this.field_i + 2;
        int var2 = 85 / ((5 - param0) / 53);
        return (this.field_k[this.field_i - 1] & 255) + (this.field_k[this.field_i - 2] << -1876261560 & 65280);
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
            this.b(var5, 0, -57, var4_int);
            var6 = new java.math.BigInteger(var5);
            var7 = var6.modPow(param0, param1);
            var8 = var7.toByteArray();
            int var9 = -100 / ((param2 - 32) / 33);
            this.field_i = 0;
            this.b((byte) 103, var8.length);
            this.a(var8, var8.length, 0, 0);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "ni.LA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final String e(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int var2;
        int var3;
        int var4;
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        var2 = this.field_k[fieldTemp$0];
        if (-1 != (var2 ^ -1)) {
          throw new IllegalStateException("");
        } else {
          if (param0 <= -51) {
            var3 = this.field_i;
            L0: while (true) {
              fieldTemp$1 = this.field_i;
              this.field_i = this.field_i + 1;
              if (this.field_k[fieldTemp$1] == 0) {
                var4 = -1 + this.field_i + -var3;
                if (var4 == 0) {
                  return "";
                } else {
                  return pg.a(var4, var3, this.field_k, 0);
                }
              } else {
                continue L0;
              }
            }
          } else {
            field_j = 127;
            var3 = this.field_i;
            L1: while (true) {
              fieldTemp$2 = this.field_i;
              this.field_i = this.field_i + 1;
              if (this.field_k[fieldTemp$2] == 0) {
                var4 = -1 + this.field_i + -var3;
                if (var4 == 0) {
                  return "";
                } else {
                  return pg.a(var4, var3, this.field_k, 0);
                }
              } else {
                continue L1;
              }
            }
          }
        }
    }

    final int e(byte param0) {
        if (param0 > 53) {
          if ((this.field_k[this.field_i] ^ -1) > -1) {
            return 2147483647 & this.c((byte) -62);
          } else {
            return this.d((byte) -53);
          }
        } else {
          return 78;
        }
    }

    final void c(byte param0, int param1) {
        if (param0 > -27) {
          this.d(-55);
          this.field_k[-1 + (-param1 + this.field_i)] = (byte)param1;
          return;
        } else {
          this.field_k[-1 + (-param1 + this.field_i)] = (byte)param1;
          return;
        }
    }

    private final void a(boolean param0, long param1) {
        int fieldTemp$14 = 0;
        int fieldTemp$15 = 0;
        int fieldTemp$16 = 0;
        int fieldTemp$17 = 0;
        int fieldTemp$18 = 0;
        int fieldTemp$19 = 0;
        int fieldTemp$10 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_k[fieldTemp$10] = (byte)(int)(param1 >> -2080671632);
        int fieldTemp$11 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_k[fieldTemp$11] = (byte)(int)(param1 >> 1749812712);
        int fieldTemp$12 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_k[fieldTemp$12] = (byte)(int)(param1 >> -1490598816);
        int fieldTemp$13 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_k[fieldTemp$13] = (byte)(int)(param1 >> 645549592);
        if (!param0) {
          this.field_i = 96;
          fieldTemp$14 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_k[fieldTemp$14] = (byte)(int)(param1 >> -380949872);
          fieldTemp$15 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_k[fieldTemp$15] = (byte)(int)(param1 >> -220296632);
          fieldTemp$16 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_k[fieldTemp$16] = (byte)(int)param1;
          return;
        } else {
          fieldTemp$17 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_k[fieldTemp$17] = (byte)(int)(param1 >> -380949872);
          fieldTemp$18 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_k[fieldTemp$18] = (byte)(int)(param1 >> -220296632);
          fieldTemp$19 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_k[fieldTemp$19] = (byte)(int)param1;
          return;
        }
    }

    final void a(int param0, boolean param1) {
        L0: {
          if (0 == (-128 & param0)) {
            break L0;
          } else {
            L1: {
              if (-1 == (param0 & -16384 ^ -1)) {
                break L1;
              } else {
                if (-1 == (param0 & -2097152 ^ -1)) {
                  this.a(-11, 128 | param0 >>> -1726251186);
                  break L1;
                } else {
                  if (0 == (-268435456 & param0)) {
                    this.a(-11, param0 >>> 2083022485 | 128);
                    this.a(-11, 128 | param0 >>> -1726251186);
                    this.a(-11, param0 >>> -1520551641 | 128);
                    if (!param1) {
                      return;
                    } else {
                      this.a(-11, param0 & 127);
                      return;
                    }
                  } else {
                    this.a(-11, 128 | param0 >>> 1156873116);
                    this.a(-11, param0 >>> 2083022485 | 128);
                    this.a(-11, 128 | param0 >>> -1726251186);
                    this.a(-11, param0 >>> -1520551641 | 128);
                    if (!param1) {
                      return;
                    } else {
                      this.a(-11, param0 & 127);
                      return;
                    }
                  }
                }
              }
            }
            this.a(-11, param0 >>> -1520551641 | 128);
            break L0;
          }
        }
        if (!param1) {
          return;
        } else {
          this.a(-11, param0 & 127);
          return;
        }
    }

    final void a(int param0, String param1) {
        int var3_int = 0;
        CharSequence var5 = null;
        int fieldTemp$0 = 0;
        try {
            var3_int = param1.indexOf(' ');
            if (!(-1 < (var3_int ^ -1))) {
                throw new IllegalArgumentException("");
            }
            var5 = (CharSequence) ((Object) param1);
            this.field_i = this.field_i + af.a(0, this.field_k, param1.length(), var5, -109, this.field_i);
            fieldTemp$0 = this.field_i;
            this.field_i = this.field_i + 1;
            this.field_k[fieldTemp$0] = (byte) 0;
            int var4 = -75 / ((57 - param0) / 54);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "ni.DA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, int param1) {
        if (param0 < 117) {
          this.f(99);
          this.field_k[-2 + this.field_i + -param1] = (byte)(param1 >> -1735249880);
          this.field_k[-param1 + (this.field_i - 1)] = (byte)param1;
          return;
        } else {
          this.field_k[-2 + this.field_i + -param1] = (byte)(param1 >> -1735249880);
          this.field_k[-param1 + (this.field_i - 1)] = (byte)param1;
          return;
        }
    }

    final void a(int param0, byte param1) {
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        int fieldTemp$12 = 0;
        int fieldTemp$13 = 0;
        int fieldTemp$14 = 0;
        int fieldTemp$15 = 0;
        if (param1 > -14) {
          this.a(99, -17);
          fieldTemp$8 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_k[fieldTemp$8] = (byte)(param0 >> 1625970392);
          fieldTemp$9 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_k[fieldTemp$9] = (byte)(param0 >> 496704496);
          fieldTemp$10 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_k[fieldTemp$10] = (byte)(param0 >> -628797432);
          fieldTemp$11 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_k[fieldTemp$11] = (byte)param0;
          return;
        } else {
          fieldTemp$12 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_k[fieldTemp$12] = (byte)(param0 >> 1625970392);
          fieldTemp$13 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_k[fieldTemp$13] = (byte)(param0 >> 496704496);
          fieldTemp$14 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_k[fieldTemp$14] = (byte)(param0 >> -628797432);
          fieldTemp$15 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_k[fieldTemp$15] = (byte)param0;
          return;
        }
    }

    final int c(boolean param0) {
        this.field_i = this.field_i + 3;
        if (!param0) {
          return -121;
        } else {
          return (16711680 & this.field_k[this.field_i + -3] << -1127998448) - (-(65280 & this.field_k[this.field_i + -2] << 1794166824) + -(255 & this.field_k[-1 + this.field_i]));
        }
    }

    final int e(boolean param0) {
        if (param0) {
            return 3;
        }
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        return this.field_k[fieldTemp$0] & 255;
    }

    final void b(String param0, byte param1) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 94) {
                break L1;
              } else {
                this.field_i = 64;
                break L1;
              }
            }
            var3_long = 0L;
            var5 = 0L;
            var7 = param0.length();
            var8 = 19;
            L2: while (true) {
              L3: {
                L4: {
                  if ((var8 ^ -1) > -1) {
                    break L4;
                  } else {
                    var3_long = var3_long * 38L;
                    if (var10 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (var7 > var8) {
                          L6: {
                            var9 = param0.charAt(var8);
                            if (var9 < 65) {
                              break L6;
                            } else {
                              if (var9 > 90) {
                                break L6;
                              } else {
                                var3_long = var3_long + (long)(2 - -var9 - 65);
                                if (var10 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          L7: {
                            L8: {
                              if (var9 < 97) {
                                break L8;
                              } else {
                                if (var9 <= 122) {
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            L9: {
                              L10: {
                                if (var9 < 48) {
                                  break L10;
                                } else {
                                  if (var9 <= 57) {
                                    break L9;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              var3_long = var3_long + 1L;
                              if (var10 == 0) {
                                break L5;
                              } else {
                                break L9;
                              }
                            }
                            var3_long = var3_long + (long)(28 + (var9 - 48));
                            if (var10 == 0) {
                              break L5;
                            } else {
                              break L7;
                            }
                          }
                          var3_long = var3_long + (long)(-97 + (var9 + 2));
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L11: {
                        if ((var8 ^ -1) != -11) {
                          break L11;
                        } else {
                          var5 = var3_long;
                          var3_long = 0L;
                          break L11;
                        }
                      }
                      var8--;
                      if (var10 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                this.a(true, var3_long);
                this.a(true, var5);
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var3 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var3);

            stackIn_27_1 = new StringBuilder().append("ni.M(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L12;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L12;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ')');
        }
    }

    final int a(int param0) {
        int var2;
        var2 = param0 & this.field_k[this.field_i];
        if ((var2 ^ -1) <= -129) {
          return -49152 + this.d((byte) 82);
        } else {
          return this.e(false) - 64;
        }
    }

    final void a(long param0, byte param1) {
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        int fieldTemp$12 = 0;
        int fieldTemp$13 = 0;
        int fieldTemp$14 = 0;
        int fieldTemp$15 = 0;
        int fieldTemp$16 = 0;
        int fieldTemp$17 = 0;
        int fieldTemp$9 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_k[fieldTemp$9] = (byte)(int)(param0 >> 2029197152);
        if (param1 != -39) {
          this.d((byte) 35);
          fieldTemp$10 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_k[fieldTemp$10] = (byte)(int)(param0 >> 1800209432);
          fieldTemp$11 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_k[fieldTemp$11] = (byte)(int)(param0 >> 149571280);
          fieldTemp$12 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_k[fieldTemp$12] = (byte)(int)(param0 >> -1752013304);
          fieldTemp$13 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_k[fieldTemp$13] = (byte)(int)param0;
          return;
        } else {
          fieldTemp$14 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_k[fieldTemp$14] = (byte)(int)(param0 >> 1800209432);
          fieldTemp$15 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_k[fieldTemp$15] = (byte)(int)(param0 >> 149571280);
          fieldTemp$16 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_k[fieldTemp$16] = (byte)(int)(param0 >> -1752013304);
          fieldTemp$17 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_k[fieldTemp$17] = (byte)(int)param0;
          return;
        }
    }

    final void a(byte[] param0, int param1, int param2, int param3) {
        int fieldTemp$1 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param3 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var5_int = param2;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param2 + param1 <= var5_int) {
                            statePc = 14;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        fieldTemp$1 = this.field_i;
                        this.field_i = this.field_i + 1;
                        this.field_k[fieldTemp$1] = param0[var5_int];
                        var5_int++;
                        if (var6 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        return;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var6 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        return;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_12_0 = (RuntimeException) (var5);
                    stackIn_11_0 = stackIn_12_0;
                    stackIn_12_1 = new StringBuilder().append("ni.FA(");
                    stackIn_11_1 = stackIn_12_1;
                    if (param0 == null) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    stackIn_13_0 = (RuntimeException) ((Object) stackIn_11_0);
                    stackIn_13_1 = (StringBuilder) ((Object) stackIn_11_1);
                    stackIn_13_2 = "{...}";
                    statePc = 13;
                    continue stateLoop;
                }
                case 12: {
                    stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
                    stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                    stackIn_13_2 = "null";
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    throw pf.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(String param0, byte param1) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var5 = null;
        int fieldTemp$1 = 0;
        try {
            var3_int = param0.indexOf(' ');
            if (!(-1 < (var3_int ^ -1))) {
                throw new IllegalArgumentException("");
            }
            fieldTemp$0 = this.field_i;
            this.field_i = this.field_i + 1;
            this.field_k[fieldTemp$0] = (byte) 0;
            int var4 = -40 % ((-3 - param1) / 39);
            var5 = (CharSequence) ((Object) param0);
            this.field_i = this.field_i + af.a(0, this.field_k, param0.length(), var5, -111, this.field_i);
            fieldTemp$1 = this.field_i;
            this.field_i = this.field_i + 1;
            this.field_k[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "ni.S(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int b(boolean param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        byte stackIn_6_0 = 0;
        byte stackIn_7_0 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = fleas.field_A ? 1 : 0;
                    fieldTemp$2 = this.field_i;
                    this.field_i = this.field_i + 1;
                    var2 = this.field_k[fieldTemp$2];
                    if (param0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.b(108, true);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var3 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var2 < 0) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return var2 | var3;
                }
                case 5: {
                    var3 = (127 & var2 | var3) << -44597113;
                    fieldTemp$3 = this.field_i;
                    this.field_i = this.field_i + 1;
                    stackIn_7_0 = this.field_k[fieldTemp$3];
                    stackIn_6_0 = stackIn_7_0;
                    if (var4 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    return stackIn_6_0;
                }
                case 7: {
                    var2 = stackIn_7_0;
                    if (var4 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    return var2 | var3;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int d(int param0) {
        int var2;
        if (param0 == -13583) {
          var2 = 255 & this.field_k[this.field_i];
          if (var2 >= 128) {
            return this.d((byte) -53) - 32768;
          } else {
            return this.e(false);
          }
        } else {
          field_j = 28;
          var2 = 255 & this.field_k[this.field_i];
          if (var2 >= 128) {
            return this.d((byte) -53) - 32768;
          } else {
            return this.e(false);
          }
        }
    }

    final void a(int param0, int[] param1) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = this.field_i / 8;
                        this.field_i = param0;
                        var4 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var4 >= var3_int) {
                            statePc = 17;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var5 = this.c((byte) 123);
                        var6 = this.c((byte) 124);
                        var7 = 0;
                        var8 = -1640531527;
                        if (var10 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        return;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var9 = 32;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        incrementValue$0 = var9;
                        var9--;
                        if (0 >= incrementValue$0) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var5 = var5 + ((var6 >>> -443663835 ^ var6 << 582537380) - -var6 ^ param1[var7 & 3] + var7);
                        var7 = var7 + var8;
                        var6 = var6 + (var7 - -param1[var7 >>> 1755109867 & 759169027] ^ (var5 << 2022354500 ^ var5 >>> 1329480101) + var5);
                        if (var10 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var10 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        this.field_i = this.field_i - 8;
                        this.a(var5, (byte) -54);
                        this.a(var6, (byte) -22);
                        var4++;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var10 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_15_0 = (RuntimeException) (var3);
                    stackIn_14_0 = stackIn_15_0;
                    stackIn_15_1 = new StringBuilder().append("ni.SA(").append(param0).append(',');
                    stackIn_14_1 = stackIn_15_1;
                    if (param1 == null) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_14_1);
                    stackIn_16_2 = "{...}";
                    statePc = 16;
                    continue stateLoop;
                }
                case 15: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                    stackIn_16_2 = "null";
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    throw pf.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void d(int param0, int param1) {
        int fieldTemp$1 = 0;
        int var4 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (param0 <= this.field_i) {
                        statePc = 9;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    fieldTemp$1 = this.field_i;
                    this.field_i = this.field_i + 1;
                    this.field_k[fieldTemp$1] = (byte) 0;
                    if (var4 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    if (var4 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (param1 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    this.field_k = (byte[]) null;
                    return;
                }
                case 7: {
                    return;
                }
                case 9: {
                    if (param1 != 0) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    return;
                }
                case 11: {
                    this.field_k = (byte[]) null;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(boolean param0, int param1) {
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int fieldTemp$4 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_k[fieldTemp$4] = (byte)(param1 >> 324905904);
        int fieldTemp$5 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_k[fieldTemp$5] = (byte)(param1 >> -1235385400);
        if (param0) {
          this.field_k = (byte[]) null;
          fieldTemp$6 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_k[fieldTemp$6] = (byte)param1;
          return;
        } else {
          fieldTemp$7 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_k[fieldTemp$7] = (byte)param1;
          return;
        }
    }

    final String a(byte param0) {
        if (param0 == -115) {
          if (-1 == (this.field_k[this.field_i] ^ -1)) {
            this.field_i = this.field_i + 1;
            return null;
          } else {
            return this.h(param0 ^ -115);
          }
        } else {
          this.field_i = 77;
          if (-1 == (this.field_k[this.field_i] ^ -1)) {
            this.field_i = this.field_i + 1;
            return null;
          } else {
            return this.h(param0 ^ -115);
          }
        }
    }

    final void b(int param0, int param1) {
        if (64 > param1) {
          if (-64 > param1) {
            if (param0 == -24213) {
              if ((param1 ^ -1) > -16385) {
                if (-16384 <= param1) {
                  this.b((byte) 107, 49152 + param1);
                  return;
                } else {
                  throw new IllegalArgumentException();
                }
              } else {
                throw new IllegalArgumentException();
              }
            } else {
              this.a(true, -123L);
              if ((param1 ^ -1) > -16385) {
                if (-16384 > param1) {
                  throw new IllegalArgumentException();
                } else {
                  this.b((byte) 107, 49152 + param1);
                  return;
                }
              } else {
                throw new IllegalArgumentException();
              }
            }
          } else {
            this.a(param0 + 24202, 64 + param1);
            return;
          }
        } else {
          if (param0 == -24213) {
            if ((param1 ^ -1) > -16385) {
              if (-16384 > param1) {
                throw new IllegalArgumentException();
              } else {
                this.b((byte) 107, 49152 + param1);
                return;
              }
            } else {
              throw new IllegalArgumentException();
            }
          } else {
            this.a(true, -123L);
            if ((param1 ^ -1) > -16385) {
              if (-16384 > param1) {
                throw new IllegalArgumentException();
              } else {
                this.b((byte) 107, 49152 + param1);
                return;
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        }
    }

    final void a(int[] param0, int param1, int param2, int param3) {
        int incrementValue$0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = this.field_i;
                        this.field_i = param1;
                        var6 = (-param1 + param3) / 8;
                        var7 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var7 >= var6) {
                            statePc = 11;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var8 = this.c((byte) -35);
                        var9 = this.c((byte) 22);
                        var10 = -957401312;
                        var11 = -1640531527;
                        stackIn_12_0 = 32;
                        stackIn_4_0 = stackIn_12_0;
                        if (var13 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var12 = stackIn_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        incrementValue$0 = var12;
                        var12--;
                        if (incrementValue$0 <= 0) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var9 = var9 - (var10 - -param0[var10 >>> -506339797 & -1547698173] ^ (var8 << -1010107164 ^ var8 >>> 1478286181) + var8);
                        var10 = var10 - var11;
                        var8 = var8 - (param0[3 & var10] + var10 ^ var9 + (var9 << -279675868 ^ var9 >>> -602404251));
                        if (var13 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var13 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        this.field_i = this.field_i - 8;
                        this.a(var8, (byte) -118);
                        this.a(var9, (byte) -108);
                        var7++;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var13 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_12_0 = param2;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (stackIn_12_0 == -1) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        this.h(-4);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        this.field_i = var5_int;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_18_0 = (RuntimeException) (var5);
                    stackIn_17_0 = stackIn_18_0;
                    stackIn_18_1 = new StringBuilder().append("ni.RA(");
                    stackIn_17_1 = stackIn_18_1;
                    if (param0 == null) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_19_2 = "{...}";
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                    stackIn_19_2 = "null";
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    throw pf.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
                }
                case 20: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final byte i(int param0) {
        if (param0 > -17) {
            return (byte) 18;
        }
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        return this.field_k[fieldTemp$0];
    }

    final int c(int param0, int param1) {
        int var3;
        var3 = uj.a(false, param0, this.field_i, this.field_k);
        if (param1 != -30532) {
          this.field_i = -52;
          this.a(var3, (byte) -73);
          return var3;
        } else {
          this.a(var3, (byte) -73);
          return var3;
        }
    }

    final int c(byte param0) {
        this.field_i = this.field_i + 4;
        int var2 = 41 / ((86 - param0) / 36);
        return ((this.field_k[this.field_i + -2] & 255) << -1415225912) + (((this.field_k[this.field_i + -3] & 255) << 938777584) + (-16777216 & this.field_k[-4 + this.field_i] << 168008472) + (this.field_k[-1 + this.field_i] & 255));
    }

    final void a(int param0, long param1) {
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_k[fieldTemp$0] = (byte)(int)(param1 >> 146717176);
        int fieldTemp$1 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_k[fieldTemp$1] = (byte)(int)(param1 >> -1454568528);
        int fieldTemp$2 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_k[fieldTemp$2] = (byte)(int)(param1 >> -664677208);
        int fieldTemp$3 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_k[fieldTemp$3] = (byte)(int)(param1 >> -1967045920);
        int var4 = 94 / ((param0 - 37) / 35);
        int fieldTemp$4 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_k[fieldTemp$4] = (byte)(int)(param1 >> -1061343400);
        int fieldTemp$5 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_k[fieldTemp$5] = (byte)(int)(param1 >> -261377968);
        int fieldTemp$6 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_k[fieldTemp$6] = (byte)(int)(param1 >> 889205576);
        int fieldTemp$7 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_k[fieldTemp$7] = (byte)(int)param1;
    }

    ni(int param0) {
        this.field_k = gf.a(-101, param0);
        this.field_i = 0;
    }

    ni(byte[] param0) {
        try {
            this.field_i = 0;
            this.field_k = param0;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "ni.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_j = 0;
    }
}
