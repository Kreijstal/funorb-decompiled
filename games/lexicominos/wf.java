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
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
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
            stackIn_26_0 = (RuntimeException) (var3);

            stackIn_26_1 = new StringBuilder().append("wf.DA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L12;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L12;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
    }

    final byte e(boolean param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        if (!param0) {
          field_i = 88;
          fieldTemp$2 = this.field_h;
          this.field_h = this.field_h + 1;
          return this.field_j[fieldTemp$2];
        } else {
          fieldTemp$3 = this.field_h;
          this.field_h = this.field_h + 1;
          return this.field_j[fieldTemp$3];
        }
    }

    final int h(byte param0) {
        int var2;
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
        int incrementValue$0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
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
                    var13 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = this.field_h;
                        if (param0 == 4) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.field_h = 48;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        this.field_h = param2;
                        var6 = (-param2 + param1) / 8;
                        var7 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var7 >= var6) {
                            statePc = 13;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var8 = this.d((byte) 19);
                        var9 = this.d((byte) 19);
                        var10 = -957401312;
                        var11 = -1640531527;
                        if (var13 != 0) {
                            statePc = 19;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var12 = 32;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        incrementValue$0 = var12;
                        var12--;
                        if ((incrementValue$0 ^ -1) >= -1) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var9 = var9 - ((var8 << 609736164 ^ var8 >>> -106841115) - -var8 ^ var10 + param3[var10 >>> -848993749 & -85983229]);
                        var10 = var10 - var11;
                        var8 = var8 - ((var9 >>> -495940603 ^ var9 << 1634474564) + var9 ^ var10 - -param3[3 & var10]);
                        if (var13 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var13 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        this.field_h = this.field_h - 8;
                        this.f(var8, -32287);
                        this.f(var9, -32287);
                        var7++;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var13 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        this.field_h = var5_int;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_17_0 = (RuntimeException) (var5);
                    stackIn_16_0 = stackIn_17_0;
                    stackIn_17_1 = new StringBuilder().append("wf.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_16_1 = stackIn_17_1;
                    if (param3 == null) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_16_1);
                    stackIn_18_2 = "{...}";
                    statePc = 18;
                    continue stateLoop;
                }
                case 17: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_18_2 = "null";
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    throw ld.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
                }
                case 19: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 >= 77) {
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
                    try {
                        this.field_h = -24;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
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
                        if (param2 - -param1 <= var5_int) {
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
                        fieldTemp$1 = this.field_h;
                        this.field_h = this.field_h + 1;
                        param3[var5_int] = this.field_j[fieldTemp$1];
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
                    stackIn_12_1 = new StringBuilder().append("wf.TA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_11_1 = stackIn_12_1;
                    if (param3 == null) {
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
                    throw ld.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
        int fieldTemp$1 = 0;
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
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2 == 255) {
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
                    try {
                        var7 = (int[]) null;
                        this.a(50, -31, -30, (int[]) null);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var5_int = param0;
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
                        if (var5_int >= param0 + param3) {
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
                        fieldTemp$1 = this.field_h;
                        this.field_h = this.field_h + 1;
                        this.field_j[fieldTemp$1] = param1[var5_int];
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
                    stackIn_12_1 = new StringBuilder().append("wf.L(").append(param0).append(',');
                    stackIn_11_1 = stackIn_12_1;
                    if (param1 == null) {
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
                    throw ld.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ')');
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void e(int param0, byte param1) {
        int fieldTemp$1 = 0;
        int var4 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Lexicominos.field_L ? 1 : 0;
                    if (param1 == 82) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    if (param0 > this.field_h) {
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
                    fieldTemp$1 = this.field_h;
                    this.field_h = this.field_h + 1;
                    this.field_j[fieldTemp$1] = (byte) 0;
                    if (var4 == 0) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    return;
                }
                case 6: {
                    if (var4 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int c(byte param0) {
        int var2;
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
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        int fieldTemp$12 = 0;
        int fieldTemp$13 = 0;
        int fieldTemp$14 = 0;
        int fieldTemp$15 = 0;
        int fieldTemp$8 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$8] = (byte)(int)(param0 >> 22158112);
        int fieldTemp$9 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$9] = (byte)(int)(param0 >> 1524948504);
        if (param1 != 687419600) {
          this.c(-56);
          fieldTemp$10 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_j[fieldTemp$10] = (byte)(int)(param0 >> 687419600);
          fieldTemp$11 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_j[fieldTemp$11] = (byte)(int)(param0 >> 299876424);
          fieldTemp$12 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_j[fieldTemp$12] = (byte)(int)param0;
          return;
        } else {
          fieldTemp$13 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_j[fieldTemp$13] = (byte)(int)(param0 >> 687419600);
          fieldTemp$14 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_j[fieldTemp$14] = (byte)(int)(param0 >> 299876424);
          fieldTemp$15 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_j[fieldTemp$15] = (byte)(int)param0;
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
        int fieldTemp$1 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$1] = (byte)param0;
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
        int fieldTemp$14 = 0;
        int fieldTemp$15 = 0;
        int fieldTemp$16 = 0;
        int fieldTemp$17 = 0;
        String var5;
        int fieldTemp$9 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$9] = (byte)(int)(param1 >> -1534411920);
        int fieldTemp$10 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$10] = (byte)(int)(param1 >> 1970050088);
        int fieldTemp$11 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$11] = (byte)(int)(param1 >> -142904992);
        int fieldTemp$12 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$12] = (byte)(int)(param1 >> -1178156968);
        int fieldTemp$13 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$13] = (byte)(int)(param1 >> -572062960);
        if (param0 != -17131) {
          var5 = (String) null;
          wf.a((sh) null, (String) null, true, (String) null);
          fieldTemp$14 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_j[fieldTemp$14] = (byte)(int)(param1 >> 696182856);
          fieldTemp$15 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_j[fieldTemp$15] = (byte)(int)param1;
          return;
        } else {
          fieldTemp$16 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_j[fieldTemp$16] = (byte)(int)(param1 >> 696182856);
          fieldTemp$17 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_j[fieldTemp$17] = (byte)(int)param1;
          return;
        }
    }

    final void e(int param0, int param1) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        if (param0 <= 49) {
          return;
        } else {
          fieldTemp$2 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_j[fieldTemp$2] = (byte)(param1 >> 1264493704);
          fieldTemp$3 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_j[fieldTemp$3] = (byte)param1;
          return;
        }
    }

    final boolean c(int param0) {
        int var2;
        int var3;
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
        int incrementValue$0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
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
                    var10 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = this.field_h / 8;
                        this.field_h = 0;
                        if (param0 == -661454965) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.field_j = (byte[]) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var4 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var4 >= var3_int) {
                            statePc = 19;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var5 = this.d((byte) 19);
                        var6 = this.d((byte) 19);
                        var7 = 0;
                        var8 = -1640531527;
                        if (var10 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        return;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var9 = 32;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        incrementValue$0 = var9;
                        var9--;
                        if (-1 <= (incrementValue$0 ^ -1)) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var5 = var5 + (var6 + (var6 >>> -63345851 ^ var6 << -392170972) ^ var7 + param1[var7 & 3]);
                        var7 = var7 + var8;
                        var6 = var6 + ((var5 << 1416012676 ^ var5 >>> -1748887995) + var5 ^ var7 + param1[(var7 & 6359) >>> -661454965]);
                        if (var10 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var10 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        this.field_h = this.field_h - 8;
                        this.f(var5, -32287);
                        this.f(var6, param0 + 661422678);
                        var4++;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var10 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_17_0 = (RuntimeException) (var3);
                    stackIn_16_0 = stackIn_17_0;
                    stackIn_17_1 = new StringBuilder().append("wf.FA(").append(param0).append(',');
                    stackIn_16_1 = stackIn_17_1;
                    if (param1 == null) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_16_1);
                    stackIn_18_2 = "{...}";
                    statePc = 18;
                    continue stateLoop;
                }
                case 17: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_18_2 = "null";
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    throw ld.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
                }
                case 19: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int g(byte param0) {
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
                    var4 = Lexicominos.field_L ? 1 : 0;
                    fieldTemp$2 = this.field_h;
                    this.field_h = this.field_h + 1;
                    var2 = this.field_j[fieldTemp$2];
                    if (param0 <= -72) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_i = -94;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var3 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (0 > var2) {
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
                    var3 = (var3 | 127 & var2) << -1077562329;
                    fieldTemp$3 = this.field_h;
                    this.field_h = this.field_h + 1;
                    stackIn_7_0 = this.field_j[fieldTemp$3];
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
        int fieldTemp$7 = 0;
        int fieldTemp$4 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$4] = (byte)(param0 >> -1685155080);
        int fieldTemp$5 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$5] = (byte)(param0 >> 1111871920);
        int fieldTemp$6 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$6] = (byte)(param0 >> -868341880);
        if (param1 != -32287) {
          return;
        } else {
          fieldTemp$7 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_j[fieldTemp$7] = (byte)param0;
          return;
        }
    }

    final int a(int param0, byte param1) {
        int var3;
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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2) {
              var4_int = param0.c(param1, (byte) -89);
              var5 = param0.a(param3, -27964, var4_int);
              stackIn_4_0 = oc.a(param0, var5, var4_int, 20);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (jb[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("wf.IA(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ')');
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
        int fieldTemp$3 = 0;
        int var2;
        int var3;
        int var4;
        int fieldTemp$2 = this.field_h;
        this.field_h = this.field_h + 1;
        var2 = this.field_j[fieldTemp$2];
        if (param0 != var2) {
          throw new IllegalStateException("");
        } else {
          var3 = this.field_h;
          L0: while (true) {
            fieldTemp$3 = this.field_h;
            this.field_h = this.field_h + 1;
            if (this.field_j[fieldTemp$3] == 0) {
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
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        if (!param0) {
          this.a(-39, 20);
          fieldTemp$2 = this.field_h;
          this.field_h = this.field_h + 1;
          return this.field_j[fieldTemp$2] & 255;
        } else {
          fieldTemp$3 = this.field_h;
          this.field_h = this.field_h + 1;
          return this.field_j[fieldTemp$3] & 255;
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
