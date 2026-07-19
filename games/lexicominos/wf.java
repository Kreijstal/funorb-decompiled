/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wf extends kd {
    int field_h;
    static int field_i;
    byte[] field_j;

    final void d(int param0, int param1) {
        int var3 = -42 / ((param1 - -24) / 58);
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$0] = (byte)(param0 >> -910221456);
        int fieldTemp$1 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$1] = (byte)(param0 >> -1776051608);
        int fieldTemp$2 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$2] = (byte)param0;
    }

    final void a(int param0, java.math.BigInteger param1, java.math.BigInteger param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
            var4_int = this.field_h;
            this.field_h = 0;
            var5 = new byte[var4_int];
            if (param0 > -92) {
                this.f(22, 54);
            }
            this.a(123, var4_int, 0, var5);
            var6 = new java.math.BigInteger(var5);
            var7 = var6.modPow(param2, param1);
            var8 = var7.toByteArray();
            this.field_h = 0;
            this.e(92, var8.length);
            this.a(0, var8, 255, var8.length);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "wf.W(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
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
        var10 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var3_long = 0L;
            var5 = (long)param0;
            var7 = param1.length();
            var8 = 19;
            L1: while (true) {
              L2: {
                L3: {
                  if ((var8 ^ -1) > -1) {
                    break L3;
                  } else {
                    var3_long = var3_long * 38L;
                    if (var10 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (var7 > var8) {
                          L5: {
                            L6: {
                              var9 = param1.charAt(var8);
                              if (var9 < 65) {
                                break L6;
                              } else {
                                if (var9 <= 90) {
                                  break L5;
                                } else {
                                  break L6;
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
                                  break L4;
                                } else {
                                  break L9;
                                }
                              }
                              var3_long = var3_long + (long)(-48 + (28 + var9));
                              if (var10 == 0) {
                                break L4;
                              } else {
                                break L7;
                              }
                            }
                            var3_long = var3_long + (long)(-97 + var9 + 2);
                            if (var10 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                          var3_long = var3_long + (long)(-63 - -var9);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L11: {
                        if (-11 != (var8 ^ -1)) {
                          break L11;
                        } else {
                          var5 = var3_long;
                          var3_long = 0L;
                          break L11;
                        }
                      }
                      var8--;
                      if (var10 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.a(-17131, var3_long);
                this.a(param0 + -17131, var5);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var3 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var3);
            stackOut_24_1 = new StringBuilder().append("wf.DA(").append(param0).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L12;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L12;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
    }

    final byte e(boolean param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        if (!param0) {
          field_i = 88;
          fieldTemp$4 = this.field_h;
          this.field_h = this.field_h + 1;
          return this.field_j[fieldTemp$4];
        } else {
          fieldTemp$5 = this.field_h;
          this.field_h = this.field_h + 1;
          return this.field_j[fieldTemp$5];
        }
    }

    final int h(byte param0) {
        int var2 = 0;
        if (param0 <= -33) {
          var2 = this.field_j[this.field_h] & 255;
          if (var2 < 128) {
            return this.d(true);
          } else {
            return -32768 + this.b(-1698573656);
          }
        } else {
          return 40;
        }
    }

    final int d(byte param0) {
        this.field_h = this.field_h + 4;
        if (param0 != 19) {
          this.e(-33, 27);
          return (this.field_j[this.field_h - 1] & 255) + ((this.field_j[this.field_h - 2] & 255) << 491726248) + ((16711680 & this.field_j[-3 + this.field_h] << 2007643120) + (-16777216 & this.field_j[-4 + this.field_h] << -486920968));
        } else {
          return (this.field_j[this.field_h - 1] & 255) + ((this.field_j[this.field_h - 2] & 255) << 491726248) + ((16711680 & this.field_j[-3 + this.field_h] << 2007643120) + (-16777216 & this.field_j[-4 + this.field_h] << -486920968));
        }
    }

    final long f(byte param0) {
        int var2 = 70 / ((-39 - param0) / 40);
        long var3 = 4294967295L & (long)this.d((byte) 19);
        long var5 = 4294967295L & (long)this.d((byte) 19);
        return (var3 << -744919200) - -var5;
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
        var13 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = this.field_h;
              if (param0 == 4) {
                break L1;
              } else {
                this.field_h = 48;
                break L1;
              }
            }
            this.field_h = param2;
            var6 = (-param2 + param1) / 8;
            var7 = 0;
            L2: while (true) {
              L3: {
                if (var7 >= var6) {
                  this.field_h = var5_int;
                  break L3;
                } else {
                  var8 = this.d((byte) 19);
                  var9 = this.d((byte) 19);
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
                          if ((incrementValue$1 ^ -1) >= -1) {
                            break L6;
                          } else {
                            var9 = var9 - ((var8 << 609736164 ^ var8 >>> -106841115) - -var8 ^ var10 + param3[var10 >>> -848993749 & -85983229]);
                            var10 = var10 - var11;
                            var8 = var8 - ((var9 >>> -495940603 ^ var9 << 1634474564) + var9 ^ var10 - -param3[3 & var10]);
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
                        this.f(var8, -32287);
                        this.f(var9, -32287);
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
            stackOut_15_1 = new StringBuilder().append("wf.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
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
          throw ld.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
    }

    final int a(byte param0) {
        if (param0 == 50) {
          if ((this.field_j[this.field_h] ^ -1) > -1) {
            return 2147483647 & this.d((byte) 19);
          } else {
            return this.b(-1698573656);
          }
        } else {
          return -3;
        }
    }

    final void b(int param0, byte param1) {
        this.field_j[-param0 + this.field_h - 2] = (byte)(param0 >> 877567976);
        if (param1 != 26) {
          this.field_h = 29;
          this.field_j[this.field_h + -param0 + -1] = (byte)param0;
          return;
        } else {
          this.field_j[this.field_h + -param0 + -1] = (byte)param0;
          return;
        }
    }

    final void a(byte param0, String param1) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        try {
            var3_int = param1.indexOf(' ');
            if ((var3_int ^ -1) <= -1) {
                throw new IllegalArgumentException("");
            }
            fieldTemp$0 = this.field_h;
            this.field_h = this.field_h + 1;
            this.field_j[fieldTemp$0] = (byte) 0;
            if (param0 != -38) {
                field_i = 51;
            }
            var4 = (CharSequence) ((Object) param1);
            this.field_h = this.field_h + nl.a(param1.length(), 0, (byte) -80, this.field_j, var4, this.field_h);
            fieldTemp$1 = this.field_h;
            this.field_h = this.field_h + 1;
            this.field_j[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "wf.KA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String e(byte param0) {
        if (0 != this.field_j[this.field_h]) {
          if (param0 > -46) {
            this.field_h = -125;
            return this.c(false);
          } else {
            return this.c(false);
          }
        } else {
          this.field_h = this.field_h + 1;
          return null;
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) {
        int fieldTemp$8 = 0;
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 >= 77) {
                break L1;
              } else {
                this.field_h = -24;
                break L1;
              }
            }
            var5_int = param2;
            L2: while (true) {
              if (param2 - -param1 <= var5_int) {
                break L0;
              } else {
                fieldTemp$8 = this.field_h;
                this.field_h = this.field_h + 1;
                param3[var5_int] = this.field_j[fieldTemp$8];
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
            stackOut_10_0 = (RuntimeException) (var5);
            stackOut_10_1 = new StringBuilder().append("wf.TA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
          throw ld.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    final void b(int param0, int param1) {
        if (param1 != -14820) {
          this.a(-40L, -80);
          this.field_j[-4 + -param0 + this.field_h] = (byte)(param0 >> 2037734040);
          this.field_j[this.field_h - param0 - 3] = (byte)(param0 >> -1723616240);
          this.field_j[-param0 + this.field_h + -2] = (byte)(param0 >> -1027286552);
          this.field_j[this.field_h - (param0 + 1)] = (byte)param0;
          return;
        } else {
          this.field_j[-4 + -param0 + this.field_h] = (byte)(param0 >> 2037734040);
          this.field_j[this.field_h - param0 - 3] = (byte)(param0 >> -1723616240);
          this.field_j[-param0 + this.field_h + -2] = (byte)(param0 >> -1027286552);
          this.field_j[this.field_h - (param0 + 1)] = (byte)param0;
          return;
        }
    }

    final void a(int param0, byte[] param1, int param2, int param3) {
        int fieldTemp$7 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int[] var7 = null;
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
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == 255) {
                break L1;
              } else {
                var7 = (int[]) null;
                this.a(50, -31, -30, (int[]) null);
                break L1;
              }
            }
            var5_int = param0;
            L2: while (true) {
              if (var5_int >= param0 + param3) {
                break L0;
              } else {
                fieldTemp$7 = this.field_h;
                this.field_h = this.field_h + 1;
                this.field_j[fieldTemp$7] = param1[var5_int];
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
            stackOut_10_0 = (RuntimeException) (var5);
            stackOut_10_1 = new StringBuilder().append("wf.L(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
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
          throw ld.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void e(int param0, byte param1) {
        int fieldTemp$2 = 0;
        int var4 = 0;
        var4 = Lexicominos.field_L ? 1 : 0;
        if (param1 == 82) {
          L0: while (true) {
            if (param0 > this.field_h) {
              fieldTemp$2 = this.field_h;
              this.field_h = this.field_h + 1;
              this.field_j[fieldTemp$2] = (byte) 0;
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

    final int c(byte param0) {
        int var2 = 0;
        var2 = 255 & this.field_j[this.field_h];
        if (param0 == -10) {
          if (128 <= var2) {
            return -49152 + this.b(-1698573656);
          } else {
            return this.d(true) + -64;
          }
        } else {
          this.field_h = 56;
          if (128 <= var2) {
            return -49152 + this.b(-1698573656);
          } else {
            return this.d(true) + -64;
          }
        }
    }

    final void a(long param0, int param1) {
        boolean discarded$11 = false;
        int fieldTemp$12 = 0;
        int fieldTemp$13 = 0;
        int fieldTemp$14 = 0;
        int fieldTemp$15 = 0;
        int fieldTemp$16 = 0;
        int fieldTemp$17 = 0;
        int fieldTemp$9 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$9] = (byte)(int)(param0 >> 22158112);
        int fieldTemp$10 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$10] = (byte)(int)(param0 >> 1524948504);
        if (param1 != 687419600) {
          discarded$11 = this.c(-56);
          fieldTemp$12 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_j[fieldTemp$12] = (byte)(int)(param0 >> 687419600);
          fieldTemp$13 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_j[fieldTemp$13] = (byte)(int)(param0 >> 299876424);
          fieldTemp$14 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_j[fieldTemp$14] = (byte)(int)param0;
          return;
        } else {
          fieldTemp$15 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_j[fieldTemp$15] = (byte)(int)(param0 >> 687419600);
          fieldTemp$16 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_j[fieldTemp$16] = (byte)(int)(param0 >> 299876424);
          fieldTemp$17 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_j[fieldTemp$17] = (byte)(int)param0;
          return;
        }
    }

    final void c(int param0, byte param1) {
        if (!(-1 == (-128 & param0 ^ -1))) {
            if ((-16384 & param0) != 0) {
                if (!((param0 & -2097152) == 0)) {
                    if (!(-1 == (param0 & -268435456 ^ -1))) {
                        this.c(param0 >>> -460468420 | 128, -1);
                    }
                    this.c(param0 >>> -941114539 | 128, -1);
                }
                this.c(param0 >>> 1956052238 | 128, -1);
            }
            this.c((param0 | 16409) >>> 1818803719, -1);
        }
        this.c(127 & param0, -1);
        int var3 = -83 / ((param1 - -37) / 45);
    }

    final void c(int param0, int param1) {
        int fieldTemp$2 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$2] = (byte)param0;
        if (param1 == -1) {
          return;
        } else {
          this.field_j = (byte[]) null;
          return;
        }
    }

    final int a(int param0) {
        if (param0 < 59) {
          return 108;
        } else {
          this.field_h = this.field_h + 3;
          return (this.field_j[-1 + this.field_h] & 255) + ((255 & this.field_j[-2 + this.field_h]) << -803792984) + (16711680 & this.field_j[this.field_h + -3] << 50712464);
        }
    }

    final void a(String param0, byte param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        int fieldTemp$0 = 0;
        try {
            var3_int = param0.indexOf(' ');
            if ((var3_int ^ -1) <= -1) {
                throw new IllegalArgumentException("");
            }
            var4 = (CharSequence) ((Object) param0);
            this.field_h = this.field_h + nl.a(param0.length(), 0, (byte) -107, this.field_j, var4, this.field_h);
            fieldTemp$0 = this.field_h;
            this.field_h = this.field_h + 1;
            this.field_j[fieldTemp$0] = (byte)param1;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "wf.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(int param0, long param1) {
        jb[] discarded$15 = null;
        int fieldTemp$16 = 0;
        int fieldTemp$17 = 0;
        int fieldTemp$18 = 0;
        int fieldTemp$19 = 0;
        String var5 = null;
        int fieldTemp$10 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$10] = (byte)(int)(param1 >> -1534411920);
        int fieldTemp$11 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$11] = (byte)(int)(param1 >> 1970050088);
        int fieldTemp$12 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$12] = (byte)(int)(param1 >> -142904992);
        int fieldTemp$13 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$13] = (byte)(int)(param1 >> -1178156968);
        int fieldTemp$14 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$14] = (byte)(int)(param1 >> -572062960);
        if (param0 != -17131) {
          var5 = (String) null;
          discarded$15 = wf.a((sh) null, (String) null, true, (String) null);
          fieldTemp$16 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_j[fieldTemp$16] = (byte)(int)(param1 >> 696182856);
          fieldTemp$17 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_j[fieldTemp$17] = (byte)(int)param1;
          return;
        } else {
          fieldTemp$18 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_j[fieldTemp$18] = (byte)(int)(param1 >> 696182856);
          fieldTemp$19 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_j[fieldTemp$19] = (byte)(int)param1;
          return;
        }
    }

    final void e(int param0, int param1) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        if (param0 <= 49) {
          return;
        } else {
          fieldTemp$4 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_j[fieldTemp$4] = (byte)(param1 >> 1264493704);
          fieldTemp$5 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_j[fieldTemp$5] = (byte)param1;
          return;
        }
    }

    final boolean c(int param0) {
        int var2 = 0;
        int var3 = 0;
        this.field_h = this.field_h - param0;
        var2 = oh.a(0, this.field_j, false, this.field_h);
        var3 = this.d((byte) 19);
        if (var2 != var3) {
          return false;
        } else {
          return true;
        }
    }

    final void a(int param0, int param1) {
        if (param1 < 64) {
          if ((param1 ^ -1) > 63) {
            if ((param1 ^ -1) <= -16385) {
              if (param0 < 100) {
                field_i = -41;
                throw new IllegalArgumentException();
              } else {
                throw new IllegalArgumentException();
              }
            } else {
              if (16383 < (param1 ^ -1)) {
                if (param0 < 100) {
                  field_i = -41;
                  throw new IllegalArgumentException();
                } else {
                  throw new IllegalArgumentException();
                }
              } else {
                this.e(80, 49152 + param1);
                return;
              }
            }
          } else {
            this.c(param1 - -64, -1);
            return;
          }
        } else {
          if ((param1 ^ -1) <= -16385) {
            if (param0 < 100) {
              field_i = -41;
              throw new IllegalArgumentException();
            } else {
              throw new IllegalArgumentException();
            }
          } else {
            if (16383 < (param1 ^ -1)) {
              if (param0 < 100) {
                field_i = -41;
                throw new IllegalArgumentException();
              } else {
                throw new IllegalArgumentException();
              }
            } else {
              this.e(80, 49152 + param1);
              return;
            }
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
        var10 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = this.field_h / 8;
              this.field_h = 0;
              if (param0 == -661454965) {
                break L1;
              } else {
                this.field_j = (byte[]) null;
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var4 >= var3_int) {
                break L0;
              } else {
                var5 = this.d((byte) 19);
                var6 = this.d((byte) 19);
                var7 = 0;
                var8 = -1640531527;
                if (var10 == 0) {
                  var9 = 32;
                  L3: while (true) {
                    L4: {
                      incrementValue$1 = var9;
                      var9--;
                      if (-1 <= (incrementValue$1 ^ -1)) {
                        this.field_h = this.field_h - 8;
                        this.f(var5, -32287);
                        this.f(var6, param0 + 661422678);
                        var4++;
                        break L4;
                      } else {
                        var5 = var5 + (var6 + (var6 >>> -63345851 ^ var6 << -392170972) ^ var7 + param1[var7 & 3]);
                        var7 = var7 + var8;
                        var6 = var6 + ((var5 << 1416012676 ^ var5 >>> -1748887995) + var5 ^ var7 + param1[(var7 & 6359) >>> -661454965]);
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
            stackOut_15_1 = new StringBuilder().append("wf.FA(").append(param0).append(',');
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
          throw ld.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
    }

    final int g(byte param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        byte stackIn_6_0 = 0;
        byte stackIn_7_0 = 0;
        byte stackOut_5_0 = 0;
        L0: {
          var4 = Lexicominos.field_L ? 1 : 0;
          fieldTemp$4 = this.field_h;
          this.field_h = this.field_h + 1;
          var2 = this.field_j[fieldTemp$4];
          if (param0 <= -72) {
            break L0;
          } else {
            field_i = -94;
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          if (0 > var2) {
            var3 = (var3 | 127 & var2) << -1077562329;
            fieldTemp$5 = this.field_h;
            this.field_h = this.field_h + 1;
            stackOut_5_0 = this.field_j[fieldTemp$5];
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

    final void a(long param0, byte param1) {
        int fieldTemp$8 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$8] = (byte)(int)(param0 >> -1885522504);
        int fieldTemp$9 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$9] = (byte)(int)(param0 >> 1206104944);
        int fieldTemp$10 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$10] = (byte)(int)(param0 >> 93694440);
        int fieldTemp$11 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$11] = (byte)(int)(param0 >> -2045018208);
        int fieldTemp$12 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$12] = (byte)(int)(param0 >> -460339816);
        int fieldTemp$13 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$13] = (byte)(int)(param0 >> 584098256);
        int fieldTemp$14 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$14] = (byte)(int)(param0 >> -579393528);
        int fieldTemp$15 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$15] = (byte)(int)param0;
        if (param1 == 37) {
          return;
        } else {
          this.field_j = (byte[]) null;
          return;
        }
    }

    final void f(int param0, int param1) {
        int fieldTemp$11 = 0;
        int fieldTemp$8 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$8] = (byte)(param0 >> -1685155080);
        int fieldTemp$9 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$9] = (byte)(param0 >> 1111871920);
        int fieldTemp$10 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$10] = (byte)(param0 >> -868341880);
        if (param1 != -32287) {
          return;
        } else {
          fieldTemp$11 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_j[fieldTemp$11] = (byte)param0;
          return;
        }
    }

    final int a(int param0, byte param1) {
        int var3 = 0;
        var3 = oh.a(param0, this.field_j, false, this.field_h);
        if (param1 < 11) {
          this.field_h = -95;
          this.f(var3, -32287);
          return var3;
        } else {
          this.f(var3, -32287);
          return var3;
        }
    }

    final String c(boolean param0) {
        int fieldTemp$0 = 0;
        int var2 = this.field_h;
        while (true) {
            fieldTemp$0 = this.field_h;
            this.field_h = this.field_h + 1;
            if (-1 == (this.field_j[fieldTemp$0] ^ -1)) {
                break;
            }
        }
        if (param0) {
            return (String) null;
        }
        int var3 = -1 + (this.field_h + -var2);
        if (!(var3 != 0)) {
            return "";
        }
        return dc.a(var3, this.field_j, (byte) 16, var2);
    }

    final static jb[] a(sh param0, String param1, boolean param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        jb[] stackIn_2_0 = null;
        jb[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        jb[] stackOut_3_0 = null;
        jb[] stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (param2) {
              var4_int = param0.c(param1, (byte) -89);
              var5 = param0.a(param3, -27964, var4_int);
              stackOut_3_0 = oc.a(param0, var5, var4_int, 20);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (jb[]) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var4);
            stackOut_5_1 = new StringBuilder().append("wf.IA(");
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
          L2: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',');
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
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void d(int param0, byte param1) {
        if (param1 >= -117) {
          this.field_h = 73;
          this.field_j[this.field_h + -param0 + -1] = (byte)param0;
          return;
        } else {
          this.field_j[this.field_h + -param0 + -1] = (byte)param0;
          return;
        }
    }

    final String d(int param0) {
        int fieldTemp$5 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int fieldTemp$4 = this.field_h;
        this.field_h = this.field_h + 1;
        var2 = this.field_j[fieldTemp$4];
        if (param0 != var2) {
          throw new IllegalStateException("");
        } else {
          var3 = this.field_h;
          L0: while (true) {
            fieldTemp$5 = this.field_h;
            this.field_h = this.field_h + 1;
            if (this.field_j[fieldTemp$5] == 0) {
              var4 = this.field_h + (-var3 + -1);
              if (var4 == 0) {
                return "";
              } else {
                return dc.a(var4, this.field_j, (byte) 16, var3);
              }
            } else {
              continue L0;
            }
          }
        }
    }

    final int b(int param0) {
        this.field_h = this.field_h + 2;
        if (param0 != -1698573656) {
          field_i = -127;
          return (this.field_j[-1 + this.field_h] & 255) + ((this.field_j[-2 + this.field_h] & 255) << -1698573656);
        } else {
          return (this.field_j[-1 + this.field_h] & 255) + ((this.field_j[-2 + this.field_h] & 255) << -1698573656);
        }
    }

    final int d(boolean param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        if (!param0) {
          this.a(-39, 20);
          fieldTemp$4 = this.field_h;
          this.field_h = this.field_h + 1;
          return this.field_j[fieldTemp$4] & 255;
        } else {
          fieldTemp$5 = this.field_h;
          this.field_h = this.field_h + 1;
          return this.field_j[fieldTemp$5] & 255;
        }
    }

    wf(int param0) {
        this.field_j = ph.a(-126, param0);
        this.field_h = 0;
    }

    wf(byte[] param0) {
        try {
            this.field_j = param0;
            this.field_h = 0;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "wf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
