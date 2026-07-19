/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ni extends lh {
    int field_i;
    static int field_j;
    byte[] field_k;

    final void a(int param0, int param1) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        if (param0 != -11) {
          this.c((byte) -92, 81);
          fieldTemp$4 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_k[fieldTemp$4] = (byte)param1;
          return;
        } else {
          fieldTemp$5 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_k[fieldTemp$5] = (byte)param1;
          return;
        }
    }

    final String h(int param0) {
        int fieldTemp$2 = 0;
        int var2 = 0;
        int var3 = 0;
        var2 = this.field_i;
        L0: while (true) {
          fieldTemp$2 = this.field_i;
          this.field_i = this.field_i + 1;
          if (0 == this.field_k[fieldTemp$2]) {
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
        int fieldTemp$7 = 0;
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var6 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var5_int = param1;
            if (param2 < -56) {
              L1: while (true) {
                if (var5_int >= param3 + param1) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  fieldTemp$7 = this.field_i;
                  this.field_i = this.field_i + 1;
                  param0[var5_int] = this.field_k[fieldTemp$7];
                  var5_int++;
                  if (var6 == 0) {
                    continue L1;
                  } else {
                    return;
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
          L2: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var5);
            stackOut_9_1 = new StringBuilder().append("ni.U(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean g(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
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
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static dj a(int param0, int param1, rh param2, rh param3, int param4) {
        RuntimeException var5 = null;
        dj stackIn_6_0 = null;
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
        dj stackOut_5_0 = null;
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
            if (ha.a(param3, -32180, param4, param0)) {
              L1: {
                if (param1 == -2974) {
                  break L1;
                } else {
                  field_j = 12;
                  break L1;
                }
              }
              stackOut_5_0 = bk.a(-26395, param2.a(param4, (byte) 121, param0));
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("ni.MA(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param4 + ')');
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
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
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
        int discarded$2 = 0;
        long var2 = 0L;
        long var4 = 0L;
        var2 = (long)this.c((byte) 123) & 4294967295L;
        var4 = (long)this.c((byte) -113) & 4294967295L;
        if (param0 >= -58) {
          discarded$2 = this.e(false);
          return (var2 << -1248594656) + var4;
        } else {
          return (var2 << -1248594656) + var4;
        }
    }

    final static String d(boolean param0) {
        String var1 = null;
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
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int fieldTemp$3 = this.field_i;
        this.field_i = this.field_i + 1;
        var2 = this.field_k[fieldTemp$3];
        if (-1 != (var2 ^ -1)) {
          throw new IllegalStateException("");
        } else {
          if (param0 <= -51) {
            var3 = this.field_i;
            L0: while (true) {
              fieldTemp$4 = this.field_i;
              this.field_i = this.field_i + 1;
              if (this.field_k[fieldTemp$4] == 0) {
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
              fieldTemp$5 = this.field_i;
              this.field_i = this.field_i + 1;
              if (this.field_k[fieldTemp$5] == 0) {
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
        int discarded$2 = 0;
        if (param0 > -27) {
          discarded$2 = this.d(-55);
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
            stackOut_25_0 = (RuntimeException) (var3);
            stackOut_25_1 = new StringBuilder().append("ni.M(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L12;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L12;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ')');
        }
    }

    final int a(int param0) {
        int var2 = 0;
        var2 = param0 & this.field_k[this.field_i];
        if ((var2 ^ -1) <= -129) {
          return -49152 + this.d((byte) 82);
        } else {
          return this.e(false) - 64;
        }
    }

    final void a(long param0, byte param1) {
        int discarded$11 = 0;
        int fieldTemp$12 = 0;
        int fieldTemp$13 = 0;
        int fieldTemp$14 = 0;
        int fieldTemp$15 = 0;
        int fieldTemp$16 = 0;
        int fieldTemp$17 = 0;
        int fieldTemp$18 = 0;
        int fieldTemp$19 = 0;
        int fieldTemp$10 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_k[fieldTemp$10] = (byte)(int)(param0 >> 2029197152);
        if (param1 != -39) {
          discarded$11 = this.d((byte) 35);
          fieldTemp$12 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_k[fieldTemp$12] = (byte)(int)(param0 >> 1800209432);
          fieldTemp$13 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_k[fieldTemp$13] = (byte)(int)(param0 >> 149571280);
          fieldTemp$14 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_k[fieldTemp$14] = (byte)(int)(param0 >> -1752013304);
          fieldTemp$15 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_k[fieldTemp$15] = (byte)(int)param0;
          return;
        } else {
          fieldTemp$16 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_k[fieldTemp$16] = (byte)(int)(param0 >> 1800209432);
          fieldTemp$17 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_k[fieldTemp$17] = (byte)(int)(param0 >> 149571280);
          fieldTemp$18 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_k[fieldTemp$18] = (byte)(int)(param0 >> -1752013304);
          fieldTemp$19 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_k[fieldTemp$19] = (byte)(int)param0;
          return;
        }
    }

    final void a(byte[] param0, int param1, int param2, int param3) {
        int fieldTemp$7 = 0;
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (param3 == 0) {
              var5_int = param2;
              L1: while (true) {
                if (param2 + param1 <= var5_int) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  fieldTemp$7 = this.field_i;
                  this.field_i = this.field_i + 1;
                  this.field_k[fieldTemp$7] = param0[var5_int];
                  var5_int++;
                  if (var6 == 0) {
                    continue L1;
                  } else {
                    return;
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
          L2: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var5);
            stackOut_10_1 = new StringBuilder().append("ni.FA(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        byte stackIn_6_0 = 0;
        byte stackIn_7_0 = 0;
        byte stackOut_5_0 = 0;
        L0: {
          var4 = fleas.field_A ? 1 : 0;
          fieldTemp$4 = this.field_i;
          this.field_i = this.field_i + 1;
          var2 = this.field_k[fieldTemp$4];
          if (param0) {
            break L0;
          } else {
            this.b(108, true);
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          if (var2 < 0) {
            var3 = (127 & var2 | var3) << -44597113;
            fieldTemp$5 = this.field_i;
            this.field_i = this.field_i + 1;
            stackOut_5_0 = this.field_k[fieldTemp$5];
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (var4 == 0) {
              var2 = stackIn_7_0;
              continue L1;
            } else {
              return stackIn_6_0;
            }
          } else {
            return var2 | var3;
          }
        }
    }

    final int d(int param0) {
        int var2 = 0;
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
        int incrementValue$1 = 0;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var10 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var3_int = this.field_i / 8;
            this.field_i = param0;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var3_int) {
                break L0;
              } else {
                var5 = this.c((byte) 123);
                var6 = this.c((byte) 124);
                var7 = 0;
                var8 = -1640531527;
                if (var10 == 0) {
                  var9 = 32;
                  L2: while (true) {
                    L3: {
                      incrementValue$1 = var9;
                      var9--;
                      if (0 >= incrementValue$1) {
                        this.field_i = this.field_i - 8;
                        this.a(var5, (byte) -54);
                        this.a(var6, (byte) -22);
                        var4++;
                        break L3;
                      } else {
                        var5 = var5 + ((var6 >>> -443663835 ^ var6 << 582537380) - -var6 ^ param1[var7 & 3] + var7);
                        var7 = var7 + var8;
                        var6 = var6 + (var7 - -param1[var7 >>> 1755109867 & 759169027] ^ (var5 << 2022354500 ^ var5 >>> 1329480101) + var5);
                        if (var10 != 0) {
                          break L3;
                        } else {
                          continue L2;
                        }
                      }
                    }
                    continue L1;
                  }
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("ni.SA(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    final void d(int param0, int param1) {
        int fieldTemp$6 = 0;
        int var4 = 0;
        var4 = fleas.field_A ? 1 : 0;
        L0: while (true) {
          if (param0 <= this.field_i) {
            if (param1 != 0) {
              this.field_k = (byte[]) null;
              return;
            } else {
              return;
            }
          } else {
            fieldTemp$6 = this.field_i;
            this.field_i = this.field_i + 1;
            this.field_k[fieldTemp$6] = (byte) 0;
            if (var4 == 0) {
              continue L0;
            } else {
              return;
            }
          }
        }
    }

    final void a(boolean param0, int param1) {
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        int fieldTemp$8 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_k[fieldTemp$8] = (byte)(param1 >> 324905904);
        int fieldTemp$9 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_k[fieldTemp$9] = (byte)(param1 >> -1235385400);
        if (param0) {
          this.field_k = (byte[]) null;
          fieldTemp$10 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_k[fieldTemp$10] = (byte)param1;
          return;
        } else {
          fieldTemp$11 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_k[fieldTemp$11] = (byte)param1;
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
        int incrementValue$2 = 0;
        String discarded$3 = null;
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
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var13 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var5_int = this.field_i;
            this.field_i = param1;
            var6 = (-param1 + param3) / 8;
            var7 = 0;
            L1: while (true) {
              L2: {
                if (var7 >= var6) {
                  stackOut_11_0 = param2;
                  stackIn_12_0 = stackOut_11_0;
                  break L2;
                } else {
                  var8 = this.c((byte) -35);
                  var9 = this.c((byte) 22);
                  var10 = -957401312;
                  var11 = -1640531527;
                  stackOut_3_0 = 32;
                  stackIn_12_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var13 != 0) {
                    break L2;
                  } else {
                    var12 = stackIn_4_0;
                    L3: while (true) {
                      L4: {
                        L5: {
                          incrementValue$2 = var12;
                          var12--;
                          if (incrementValue$2 <= 0) {
                            break L5;
                          } else {
                            var9 = var9 - (var10 - -param0[var10 >>> -506339797 & -1547698173] ^ (var8 << -1010107164 ^ var8 >>> 1478286181) + var8);
                            var10 = var10 - var11;
                            var8 = var8 - (param0[3 & var10] + var10 ^ var9 + (var9 << -279675868 ^ var9 >>> -602404251));
                            if (var13 != 0) {
                              break L4;
                            } else {
                              if (var13 == 0) {
                                continue L3;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        this.field_i = this.field_i - 8;
                        this.a(var8, (byte) -118);
                        this.a(var9, (byte) -108);
                        var7++;
                        break L4;
                      }
                      continue L1;
                    }
                  }
                }
              }
              L6: {
                if (stackIn_12_0 == -1) {
                  break L6;
                } else {
                  discarded$3 = this.h(-4);
                  break L6;
                }
              }
              this.field_i = var5_int;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var5);
            stackOut_16_1 = new StringBuilder().append("ni.RA(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
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
        int var3 = 0;
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
