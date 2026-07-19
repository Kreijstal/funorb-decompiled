/*
 * Decompiled by CFR-JS 0.4.0.
 */
class uia extends vg {
    int field_h;
    byte[] field_g;
    static String field_f;

    final void a(byte param0, int[] param1) {
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
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
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
            var3_int = this.field_h / 8;
            this.field_h = 0;
            var4 = 0;
            L2: while (true) {
              if (var4 >= var3_int) {
                break L0;
              } else {
                var5 = this.e(-51);
                var6 = this.e(param0 ^ 120);
                var7 = 0;
                var8 = -1640531527;
                if (var10 == 0) {
                  var9 = 32;
                  L3: while (true) {
                    L4: {
                      incrementValue$1 = var9;
                      var9--;
                      if (0 >= incrementValue$1) {
                        this.field_h = this.field_h - 8;
                        this.a(var5, (byte) 0);
                        this.a(var6, (byte) -98);
                        var4++;
                        break L4;
                      } else {
                        var5 = var5 + (var6 + (var6 << 6495012 ^ var6 >>> 667175365) ^ param1[3 & var7] + var7);
                        var7 = var7 + var8;
                        var6 = var6 + (var5 + (var5 << -1078122204 ^ var5 >>> 1857023237) ^ var7 + param1[var7 >>> -2039820597 & -866123773]);
                        if (var10 != 0) {
                          break L4;
                        } else {
                          continue L3;
                        }
                      }
                    }
                    continue L2;
                  }
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3);
            stackOut_15_1 = new StringBuilder().append("uia.KA(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
    }

    final int b(boolean param0) {
        int var2 = 0;
        L0: {
          this.field_h = this.field_h + 2;
          var2 = (this.field_g[this.field_h + -1] & 255) + (65280 & this.field_g[-2 + this.field_h] << 1060535304);
          if (-32768 > (var2 ^ -1)) {
            var2 = var2 - 65536;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0) {
          return 56;
        } else {
          return var2;
        }
    }

    final void a(int param0, byte param1) {
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$0] = (byte)(param0 >> -1710571272);
        int fieldTemp$1 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$1] = (byte)(param0 >> 290159088);
        int fieldTemp$2 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$2] = (byte)(param0 >> -30232408);
        int fieldTemp$3 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$3] = (byte)param0;
        int var3 = 125 % ((43 - param1) / 33);
    }

    final void a(byte[] param0, int param1, int param2, int param3) {
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
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var5_int = param1;
            if (param2 < -79) {
              L1: while (true) {
                if (param1 + param3 <= var5_int) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  fieldTemp$7 = this.field_h;
                  this.field_h = this.field_h + 1;
                  param0[var5_int] = this.field_g[fieldTemp$7];
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
            stackOut_9_1 = new StringBuilder().append("uia.BA(");
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
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final byte c(byte param0) {
        if (param0 < 27) {
            return (byte) -82;
        }
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        return this.field_g[fieldTemp$0];
    }

    final int b(byte param0) {
        int fieldTemp$5 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte stackIn_4_0 = 0;
        byte stackIn_5_0 = 0;
        byte stackOut_3_0 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        var2 = -48 % ((-58 - param0) / 58);
        int fieldTemp$4 = this.field_h;
        this.field_h = this.field_h + 1;
        var3 = this.field_g[fieldTemp$4];
        var4 = 0;
        L0: while (true) {
          if (0 > var3) {
            var4 = (var4 | var3 & 127) << 556823879;
            fieldTemp$5 = this.field_h;
            this.field_h = this.field_h + 1;
            stackOut_3_0 = this.field_g[fieldTemp$5];
            stackIn_5_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (var5 == 0) {
              var3 = stackIn_5_0;
              continue L0;
            } else {
              return stackIn_4_0;
            }
          } else {
            return var3 | var4;
          }
        }
    }

    final void a(byte param0, int param1) {
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        int fieldTemp$8 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$8] = (byte)param1;
        int fieldTemp$9 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$9] = (byte)(param1 >> 211588552);
        if (param0 != -35) {
          return;
        } else {
          fieldTemp$10 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$10] = (byte)(param1 >> 1907167760);
          fieldTemp$11 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$11] = (byte)(param1 >> 1252846936);
          return;
        }
    }

    final String e(byte param0) {
        byte discarded$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int var2 = 0;
        int var3 = 0;
        var2 = this.field_h;
        if (param0 != -76) {
          discarded$3 = this.c((byte) -16);
          L0: while (true) {
            fieldTemp$4 = this.field_h;
            this.field_h = this.field_h + 1;
            if (-1 == (this.field_g[fieldTemp$4] ^ -1)) {
              var3 = this.field_h - (var2 + 1);
              if (var3 == 0) {
                return "";
              } else {
                return nia.a(this.field_g, var2, var3, 255);
              }
            } else {
              continue L0;
            }
          }
        } else {
          L1: while (true) {
            fieldTemp$5 = this.field_h;
            this.field_h = this.field_h + 1;
            if (-1 == (this.field_g[fieldTemp$5] ^ -1)) {
              var3 = this.field_h - (var2 + 1);
              if (var3 == 0) {
                return "";
              } else {
                return nia.a(this.field_g, var2, var3, 255);
              }
            } else {
              continue L1;
            }
          }
        }
    }

    final void a(int param0, java.math.BigInteger param1, java.math.BigInteger param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        int discarded$0 = 0;
        try {
            var4_int = this.field_h;
            this.field_h = 0;
            var5 = new byte[var4_int];
            this.a(var5, 0, -102, var4_int);
            var6 = new java.math.BigInteger(var5);
            var7 = var6.modPow(param1, param2);
            var8 = var7.toByteArray();
            this.field_h = 0;
            this.f(-1477662136, var8.length);
            if (param0 <= 87) {
                discarded$0 = this.b(false);
            }
            this.a(0, var8, var8.length, 107);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "uia.CB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1) {
        int[] var4 = null;
        this.field_g[this.field_h - param0 - 4] = (byte)(param0 >> -1707865544);
        this.field_g[-3 + (-param0 + this.field_h)] = (byte)(param0 >> 37118480);
        if (param1 != 22726) {
          var4 = (int[]) null;
          this.a((byte) 83, (int[]) null);
          this.field_g[-2 + (-param0 + this.field_h)] = (byte)(param0 >> 1309099624);
          this.field_g[this.field_h + -param0 - 1] = (byte)param0;
          return;
        } else {
          this.field_g[-2 + (-param0 + this.field_h)] = (byte)(param0 >> 1309099624);
          this.field_g[this.field_h + -param0 - 1] = (byte)param0;
          return;
        }
    }

    final int a(int param0) {
        this.field_h = this.field_h + 3;
        if (param0 != -32768) {
          return 55;
        } else {
          return ((this.field_g[-2 + this.field_h] & 255) << -1050845912) + (this.field_g[-3 + this.field_h] << 82551280 & 16711680) + (255 & this.field_g[this.field_h + -1]);
        }
    }

    final void a(int param0, long param1) {
        int fieldTemp$16 = 0;
        int fieldTemp$17 = 0;
        int fieldTemp$18 = 0;
        int fieldTemp$19 = 0;
        int fieldTemp$20 = 0;
        int fieldTemp$21 = 0;
        int fieldTemp$11 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$11] = (byte)(int)(param1 >> -3295240);
        int fieldTemp$12 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$12] = (byte)(int)(param1 >> 2030501872);
        int fieldTemp$13 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$13] = (byte)(int)(param1 >> 824278056);
        int fieldTemp$14 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$14] = (byte)(int)(param1 >> 1571217440);
        int fieldTemp$15 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$15] = (byte)(int)(param1 >> -827831080);
        if (param0 != 1736565456) {
          this.field_g = (byte[]) null;
          fieldTemp$16 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$16] = (byte)(int)(param1 >> -747943600);
          fieldTemp$17 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$17] = (byte)(int)(param1 >> 1038839112);
          fieldTemp$18 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$18] = (byte)(int)param1;
          return;
        } else {
          fieldTemp$19 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$19] = (byte)(int)(param1 >> -747943600);
          fieldTemp$20 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$20] = (byte)(int)(param1 >> 1038839112);
          fieldTemp$21 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$21] = (byte)(int)param1;
          return;
        }
    }

    final void c(int param0, byte param1) {
        int var3 = 0;
        if (0 > param0) {
          var3 = -126 % ((param1 - -18) / 58);
          if ((param0 ^ -1) <= -1) {
            if (32768 <= param0) {
              throw new IllegalArgumentException();
            } else {
              this.f(-1477662136, 32768 + param0);
              return;
            }
          } else {
            throw new IllegalArgumentException();
          }
        } else {
          if (128 <= param0) {
            var3 = -126 % ((param1 - -18) / 58);
            if ((param0 ^ -1) <= -1) {
              if (32768 > param0) {
                this.f(-1477662136, 32768 + param0);
                return;
              } else {
                throw new IllegalArgumentException();
              }
            } else {
              throw new IllegalArgumentException();
            }
          } else {
            this.i(param0, 0);
            return;
          }
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        if (param0) {
            return;
        }
        field_f = (String) null;
    }

    final void b(int param0, byte param1) {
        this.field_g[-2 + (this.field_h - param0)] = (byte)(param0 >> -1816306392);
        this.field_g[-param0 + (this.field_h - 1)] = (byte)param0;
        int var3 = -48 % ((param1 - 56) / 42);
    }

    final void a(int param0, int param1, int[] param2, int param3) {
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
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -84984444) {
                break L1;
              } else {
                this.i(54, 87);
                break L1;
              }
            }
            var5_int = this.field_h;
            this.field_h = param3;
            var6 = (-param3 + param0) / 8;
            var7 = 0;
            L2: while (true) {
              L3: {
                if (var6 <= var7) {
                  this.field_h = var5_int;
                  break L3;
                } else {
                  var8 = this.e(-88);
                  var9 = this.e(-102);
                  var10 = -957401312;
                  var11 = -1640531527;
                  if (var13 != 0) {
                    break L3;
                  } else {
                    var12 = 32;
                    L4: while (true) {
                      L5: {
                        L6: {
                          incrementValue$1 = var12;
                          var12--;
                          if (incrementValue$1 <= 0) {
                            break L6;
                          } else {
                            var9 = var9 - (param2[(7261 & var10) >>> -466648565] + var10 ^ (var8 << -345170716 ^ var8 >>> 1107703013) - -var8);
                            var10 = var10 - var11;
                            var8 = var8 - (var9 + (var9 << -84984444 ^ var9 >>> -462897083) ^ param2[var10 & 3] + var10);
                            if (var13 != 0) {
                              break L5;
                            } else {
                              if (var13 == 0) {
                                continue L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        this.field_h = this.field_h - 8;
                        this.a(var8, (byte) -9);
                        this.a(var9, (byte) 95);
                        var7++;
                        break L5;
                      }
                      continue L2;
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var5);
            stackOut_15_1 = new StringBuilder().append("uia.N(").append(param0).append(',').append(param1).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L7;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param3 + ')');
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
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3_long = 0L;
            var5 = 0L;
            var7 = param0.length();
            var8 = 19;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (-1 < (var8 ^ -1)) {
                      break L4;
                    } else {
                      var3_long = var3_long * 38L;
                      var12 = var8;
                      var11 = var7;
                      if (var10 != 0) {
                        if (var11 < var12) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        L5: {
                          if (var11 <= var12) {
                            break L5;
                          } else {
                            L6: {
                              L7: {
                                var9 = param0.charAt(var8);
                                if (var9 < 65) {
                                  break L7;
                                } else {
                                  if (var9 <= 90) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              L8: {
                                if (var9 < 97) {
                                  break L8;
                                } else {
                                  if (122 < var9) {
                                    break L8;
                                  } else {
                                    var3_long = var3_long + (long)(-95 - -var9);
                                    if (var10 == 0) {
                                      break L5;
                                    } else {
                                      break L8;
                                    }
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
                              var3_long = var3_long + (long)(-48 + (28 - -var9));
                              if (var10 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                            var3_long = var3_long + (long)(var9 + -63);
                            break L5;
                          }
                        }
                        L11: {
                          if (-11 == (var8 ^ -1)) {
                            var5 = var3_long;
                            var3_long = 0L;
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        var8--;
                        if (var10 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  this.a(var3_long, -106);
                  if (param1 < -122) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                this.field_g = (byte[]) null;
                break L2;
              }
              this.a(var5, -120);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var3 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var3);
            stackOut_28_1 = new StringBuilder().append("uia.JA(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L12;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L12;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param1 + ')');
        }
    }

    uia(int param0) {
        this.field_h = 0;
        this.field_g = fba.a(param0, 0);
    }

    final void b(int param0, int param1) {
        int fieldTemp$2 = 0;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        if (param0 == 716148936) {
          L0: while (true) {
            if (this.field_h < param1) {
              fieldTemp$2 = this.field_h;
              this.field_h = this.field_h + 1;
              this.field_g[fieldTemp$2] = (byte) 0;
              if (var4 == 0) {
                continue L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final void e(int param0, int param1) {
        if (param0 == -5338) {
          if (param1 < 64) {
            if (63 < (param1 ^ -1)) {
              if ((param1 ^ -1) > -16385) {
                if (param1 < -16384) {
                  throw new IllegalArgumentException();
                } else {
                  this.f(-1477662136, 49152 + param1);
                  return;
                }
              } else {
                throw new IllegalArgumentException();
              }
            } else {
              this.i(64 + param1, 0);
              return;
            }
          } else {
            if ((param1 ^ -1) > -16385) {
              if (param1 < -16384) {
                throw new IllegalArgumentException();
              } else {
                this.f(-1477662136, 49152 + param1);
                return;
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        } else {
          return;
        }
    }

    final int d(byte param0) {
        int var2 = 0;
        if (param0 == -46) {
          var2 = this.field_g[this.field_h] & 255;
          if (-129 >= (var2 ^ -1)) {
            return -32768 + this.d(param0 + 168);
          } else {
            return this.h(255);
          }
        } else {
          return -59;
        }
    }

    final void a(int param0, byte[] param1, int param2, int param3) {
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param0;
              if (param3 >= 52) {
                break L1;
              } else {
                this.field_h = -97;
                break L1;
              }
            }
            L2: while (true) {
              if (var5_int >= param2 + param0) {
                break L0;
              } else {
                fieldTemp$7 = this.field_h;
                this.field_h = this.field_h + 1;
                this.field_g[fieldTemp$7] = param1[var5_int];
                var5_int++;
                if (var6 == 0) {
                  continue L2;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var5);
            stackOut_9_1 = new StringBuilder().append("uia.W(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int d(int param0) {
        if (param0 <= 120) {
          field_f = (String) null;
          this.field_h = this.field_h + 2;
          return (this.field_g[-2 + this.field_h] << 716148936 & 65280) - -(this.field_g[-1 + this.field_h] & 255);
        } else {
          this.field_h = this.field_h + 2;
          return (this.field_g[-2 + this.field_h] << 716148936 & 65280) - -(this.field_g[-1 + this.field_h] & 255);
        }
    }

    final void d(int param0, byte param1) {
        this.field_g[-1 + -param0 + this.field_h] = (byte)param0;
        int var3 = -105 % ((-62 - param1) / 33);
    }

    final void h(int param0, int param1) {
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$0] = (byte)(param1 >> -5086288);
        int fieldTemp$1 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$1] = (byte)(param1 >> 863439720);
        int var3 = 1 % ((param0 - -36) / 40);
        int fieldTemp$2 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$2] = (byte)param1;
    }

    final String f(int param0) {
        int fieldTemp$5 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int fieldTemp$4 = this.field_h;
        this.field_h = this.field_h + 1;
        var2 = this.field_g[fieldTemp$4];
        if (var2 != 0) {
          throw new IllegalStateException("");
        } else {
          var3 = this.field_h;
          L0: while (true) {
            fieldTemp$5 = this.field_h;
            this.field_h = this.field_h + 1;
            if (-1 == (this.field_g[fieldTemp$5] ^ -1)) {
              if (param0 > 113) {
                var4 = this.field_h - (var3 + 1);
                if (var4 == 0) {
                  return "";
                } else {
                  return nia.a(this.field_g, var3, var4, 255);
                }
              } else {
                field_f = (String) null;
                var4 = this.field_h - (var3 + 1);
                if (var4 == 0) {
                  return "";
                } else {
                  return nia.a(this.field_g, var3, var4, 255);
                }
              }
            } else {
              continue L0;
            }
          }
        }
    }

    uia(byte[] param0) {
        try {
            this.field_h = 0;
            this.field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "uia.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void d(int param0, int param1) {
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$0] = (byte)param0;
        int var3 = -23 / ((73 - param1) / 46);
        int fieldTemp$1 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$1] = (byte)(param0 >> 1205899464);
    }

    final long b(int param0) {
        long var2 = 0L;
        long var4 = 0L;
        if (param0 != 290646880) {
          return 127L;
        } else {
          var2 = (long)this.e(-81) & 4294967295L;
          var4 = 4294967295L & (long)this.e(111);
          return var4 + (var2 << 290646880);
        }
    }

    final int f(byte param0) {
        int var2 = 0;
        if (param0 < -127) {
          var2 = this.field_g[this.field_h] & 255;
          if (-129 >= (var2 ^ -1)) {
            return -49152 + this.d(127);
          } else {
            return -64 + this.h(255);
          }
        } else {
          return 93;
        }
    }

    private final void a(long param0, int param1) {
        int fieldTemp$14 = 0;
        int fieldTemp$15 = 0;
        int fieldTemp$16 = 0;
        int fieldTemp$17 = 0;
        int fieldTemp$9 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$9] = (byte)(int)(param0 >> -1751904208);
        int fieldTemp$10 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$10] = (byte)(int)(param0 >> -1815801560);
        int fieldTemp$11 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$11] = (byte)(int)(param0 >> 1497053856);
        int fieldTemp$12 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$12] = (byte)(int)(param0 >> -1743780008);
        int fieldTemp$13 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$13] = (byte)(int)(param0 >> -62340976);
        if (param1 > -37) {
          field_f = (String) null;
          fieldTemp$14 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$14] = (byte)(int)(param0 >> 1744286280);
          fieldTemp$15 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$15] = (byte)(int)param0;
          return;
        } else {
          fieldTemp$16 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$16] = (byte)(int)(param0 >> 1744286280);
          fieldTemp$17 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$17] = (byte)(int)param0;
          return;
        }
    }

    final void a(boolean param0, long param1) {
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int fieldTemp$5 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$5] = (byte)(int)(param1 >> -450899168);
        int fieldTemp$6 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$6] = (byte)(int)(param1 >> 389604056);
        int fieldTemp$7 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$7] = (byte)(int)(param1 >> 1736565456);
        if (!param0) {
          return;
        } else {
          fieldTemp$8 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$8] = (byte)(int)(param1 >> 439472968);
          fieldTemp$9 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$9] = (byte)(int)param1;
          return;
        }
    }

    final void a(String param0, boolean param1) {
        int fieldTemp$2 = 0;
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
            if (-1 < (var3_int ^ -1)) {
              var4 = (CharSequence) ((Object) param0);
              this.field_h = this.field_h + laa.a(this.field_h, param0.length(), this.field_g, 0, var4, (byte) -4);
              fieldTemp$2 = this.field_h;
              this.field_h = this.field_h + 1;
              this.field_g[fieldTemp$2] = (byte) 0;
              if (!param1) {
                break L0;
              } else {
                this.field_g = (byte[]) null;
                return;
              }
            } else {
              throw new IllegalArgumentException("");
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("uia.GB(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
    }

    final int g(int param0) {
        if (param0 == -48) {
          if (-1 < (this.field_g[this.field_h] ^ -1)) {
            return this.e(-16) & 2147483647;
          } else {
            return this.d(param0 ^ -82);
          }
        } else {
          return 3;
        }
    }

    final void i(int param0, int param1) {
        byte[] var4 = null;
        int fieldTemp$2 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$2] = (byte)param0;
        if (param1 == 0) {
          return;
        } else {
          var4 = (byte[]) null;
          this.a(13, (byte[]) null, 70, -102);
          return;
        }
    }

    final int e(int param0) {
        this.field_h = this.field_h + 4;
        int var2 = -60 / ((param0 - 44) / 50);
        return ((255 & this.field_g[-2 + this.field_h]) << -521640376) + ((-16777216 & this.field_g[this.field_h - 4] << 925247704) - -((255 & this.field_g[-3 + this.field_h]) << 1980335824) + (255 & this.field_g[this.field_h - 1]));
    }

    final int g(int param0, int param1) {
        int var3 = 0;
        var3 = aia.a(this.field_g, this.field_h, 80, param0);
        this.a(var3, (byte) -60);
        if (param1 != 64) {
          field_f = (String) null;
          return var3;
        } else {
          return var3;
        }
    }

    final void f(int param0, int param1) {
        String discarded$8 = null;
        int fieldTemp$6 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$6] = (byte)(param1 >> -1477662136);
        int fieldTemp$7 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$7] = (byte)param1;
        if (param0 == -1477662136) {
          return;
        } else {
          discarded$8 = this.f(64);
          return;
        }
    }

    final boolean a(byte param0) {
        String discarded$8 = null;
        int var2 = 0;
        int var3 = 0;
        this.field_h = this.field_h - 4;
        var2 = aia.a(this.field_g, this.field_h, param0 ^ -27, 0);
        var3 = this.e(-56);
        if (param0 == 114) {
          if (var2 == var3) {
            return true;
          } else {
            return false;
          }
        } else {
          discarded$8 = this.c(20);
          if (var2 == var3) {
            return true;
          } else {
            return false;
          }
        }
    }

    final void a(String param0, byte param1) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        try {
            var3_int = param0.indexOf(' ');
            if (!(-1 < (var3_int ^ -1))) {
                throw new IllegalArgumentException("");
            }
            fieldTemp$0 = this.field_h;
            this.field_h = this.field_h + 1;
            this.field_g[fieldTemp$0] = (byte)param1;
            var4 = (CharSequence) ((Object) param0);
            this.field_h = this.field_h + laa.a(this.field_h, param0.length(), this.field_g, 0, var4, (byte) -4);
            fieldTemp$1 = this.field_h;
            this.field_h = this.field_h + 1;
            this.field_g[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "uia.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int h(int param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        if (param0 != 255) {
          field_f = (String) null;
          fieldTemp$4 = this.field_h;
          this.field_h = this.field_h + 1;
          return 255 & this.field_g[fieldTemp$4];
        } else {
          fieldTemp$5 = this.field_h;
          this.field_h = this.field_h + 1;
          return 255 & this.field_g[fieldTemp$5];
        }
    }

    final String c(int param0) {
        if (param0 == -28690) {
          if (this.field_g[this.field_h] == 0) {
            this.field_h = this.field_h + 1;
            return null;
          } else {
            return this.e((byte) -76);
          }
        } else {
          return (String) null;
        }
    }

    final void c(int param0, int param1) {
        int var3 = 0;
        var3 = -74 % ((78 - param1) / 41);
        if ((param0 & -128) != 0) {
          if (0 != (param0 & -16384)) {
            if ((-2097152 & param0) != 0) {
              if ((-268435456 & param0) == 0) {
                this.i(param0 >>> -986885067 | 128, 0);
                this.i(param0 >>> 1559526094 | 128, 0);
                this.i(128 | param0 >>> -645660505, 0);
                this.i(param0 & 127, 0);
                return;
              } else {
                this.i(param0 >>> -1622567204 | 128, 0);
                this.i(param0 >>> -986885067 | 128, 0);
                this.i(param0 >>> 1559526094 | 128, 0);
                this.i(128 | param0 >>> -645660505, 0);
                this.i(param0 & 127, 0);
                return;
              }
            } else {
              this.i(param0 >>> 1559526094 | 128, 0);
              this.i(128 | param0 >>> -645660505, 0);
              this.i(param0 & 127, 0);
              return;
            }
          } else {
            this.i(128 | param0 >>> -645660505, 0);
            this.i(param0 & 127, 0);
            return;
          }
        } else {
          this.i(param0 & 127, 0);
          return;
        }
    }

    static {
        field_f = "Open";
    }
}
