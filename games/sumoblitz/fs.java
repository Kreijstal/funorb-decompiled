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
        int discarded$1 = 0;
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
                discarded$1 = this.f(118);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if (var8 < 0) {
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
                                var3_long = var3_long + (long)(-65 + var9 + 2);
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
                              if (97 > var9) {
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
                            var3_long = var3_long + (long)(var9 + -20);
                            if (var10 == 0) {
                              break L5;
                            } else {
                              break L7;
                            }
                          }
                          var3_long = var3_long + (long)(var9 + 2 + -97);
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
                this.a(var3_long, 116);
                this.a(var5, 122);
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var3 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var3);
            stackOut_24_1 = new StringBuilder().append("fs.K(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
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
          throw qo.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
    }

    final void a(byte[] param0, byte param1, int param2, int param3) {
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -123) {
                break L1;
              } else {
                this.field_p = 98;
                break L1;
              }
            }
            var5_int = param3;
            L2: while (true) {
              if (param2 + param3 <= var5_int) {
                break L0;
              } else {
                fieldTemp$7 = this.field_p;
                this.field_p = this.field_p + 1;
                this.field_n[fieldTemp$7] = param0[var5_int];
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
            stackOut_10_1 = new StringBuilder().append("fs.GA(");
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
          throw qo.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static float a(byte param0, float param1) {
        if (param0 != 124) {
          field_l = 20;
          return param1 * (param1 * param1) * (param1 * (-15.0f + 6.0f * param1) + 10.0f);
        } else {
          return param1 * (param1 * param1) * (param1 * (-15.0f + 6.0f * param1) + 10.0f);
        }
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
            jk.field_b = (gd) ((Object) new t());
            in.field_D = new ti(param0);
            wt.field_i = new rj(jk.field_b, in.field_D);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "fs.BB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void a(String param0, byte param1) {
        int var3_int = 0;
        CharSequence var5 = null;
        int fieldTemp$0 = 0;
        try {
            var3_int = param0.indexOf(' ');
            if ((var3_int ^ -1) <= -1) {
                throw new IllegalArgumentException("");
            }
            var5 = (CharSequence) ((Object) param0);
            this.field_p = this.field_p + mq.a(0, this.field_n, (byte) -110, var5, param0.length(), this.field_p);
            fieldTemp$0 = this.field_p;
            this.field_p = this.field_p + 1;
            this.field_n[fieldTemp$0] = (byte) 0;
            int var4 = 123 / ((param1 - -7) / 60);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "fs.KA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int e(int param0) {
        String discarded$6 = null;
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        if (param0 != -31302) {
          discarded$6 = this.d(-78);
          fieldTemp$7 = this.field_p;
          this.field_p = this.field_p + 1;
          return this.field_n[fieldTemp$7] & 255;
        } else {
          fieldTemp$8 = this.field_p;
          this.field_p = this.field_p + 1;
          return this.field_n[fieldTemp$8] & 255;
        }
    }

    final String g(int param0) {
        int fieldTemp$5 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int fieldTemp$4 = this.field_p;
        this.field_p = this.field_p + 1;
        var2 = this.field_n[fieldTemp$4];
        if (var2 != 0) {
          throw new IllegalStateException("");
        } else {
          var3 = this.field_p;
          L0: while (true) {
            fieldTemp$5 = this.field_p;
            this.field_p = this.field_p + 1;
            if (0 == this.field_n[fieldTemp$5]) {
              var5 = 83 / ((param0 - 0) / 48);
              var4 = -1 + this.field_p + -var3;
              if (var4 == 0) {
                return "";
              } else {
                return sd.a(this.field_n, var3, var4, 26564);
              }
            } else {
              continue L0;
            }
          }
        }
    }

    final int c(boolean param0) {
        this.field_p = this.field_p + 4;
        if (!param0) {
          this.field_n = (byte[]) null;
          return (this.field_n[this.field_p + -1] & 255) + (((this.field_n[this.field_p - 3] & 255) << -121229168) + ((this.field_n[-4 + this.field_p] & 255) << 1006481240)) + (65280 & this.field_n[-2 + this.field_p] << -1761252728);
        } else {
          return (this.field_n[this.field_p + -1] & 255) + (((this.field_n[this.field_p - 3] & 255) << -121229168) + ((this.field_n[-4 + this.field_p] & 255) << 1006481240)) + (65280 & this.field_n[-2 + this.field_p] << -1761252728);
        }
    }

    final int a(int param0, boolean param1) {
        int var3 = 0;
        if (param1) {
          this.field_n = (byte[]) null;
          var3 = rd.a(this.field_n, param0, this.field_p, 1001);
          this.e(48, var3);
          return var3;
        } else {
          var3 = rd.a(this.field_n, param0, this.field_p, 1001);
          this.e(48, var3);
          return var3;
        }
    }

    final void b(long param0, int param1) {
        int fieldTemp$10 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_n[fieldTemp$10] = (byte)(int)(param0 >> -1329360032);
        int fieldTemp$11 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_n[fieldTemp$11] = (byte)(int)(param0 >> -516434920);
        int fieldTemp$12 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_n[fieldTemp$12] = (byte)(int)(param0 >> -1516334000);
        int fieldTemp$13 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_n[fieldTemp$13] = (byte)(int)(param0 >> 1105594440);
        int fieldTemp$14 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_n[fieldTemp$14] = (byte)(int)param0;
        if (param1 == 1105594440) {
          return;
        } else {
          field_k = (qn) null;
          return;
        }
    }

    final void c(int param0, int param1) {
        this.field_n[this.field_p - (param0 - -1)] = (byte)param0;
        if (param1 == -13745) {
          return;
        } else {
          field_m = (char[]) null;
          return;
        }
    }

    final void a(int param0, byte param1, int param2, int[] param3) {
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var13 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var5_int = this.field_p;
            this.field_p = param2;
            var6 = (-param2 + param0) / 8;
            if (param1 == 127) {
              var7 = 0;
              L1: while (true) {
                L2: {
                  if (var6 <= var7) {
                    this.field_p = var5_int;
                    break L2;
                  } else {
                    var8 = this.c(true);
                    var9 = this.c(true);
                    var10 = -957401312;
                    var11 = -1640531527;
                    if (var13 != 0) {
                      break L2;
                    } else {
                      var12 = 32;
                      L3: while (true) {
                        L4: {
                          L5: {
                            incrementValue$1 = var12;
                            var12--;
                            if ((incrementValue$1 ^ -1) >= -1) {
                              break L5;
                            } else {
                              var9 = var9 - ((var8 >>> -1638534267 ^ var8 << -54904796) + var8 ^ var10 - -param3[-178257917 & var10 >>> -353426165]);
                              var10 = var10 - var11;
                              var8 = var8 - ((var9 >>> 161003397 ^ var9 << 1174773284) + var9 ^ var10 + param3[3 & var10]);
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
                          this.field_p = this.field_p - 8;
                          this.e(48, var8);
                          this.e(48, var9);
                          var7++;
                          break L4;
                        }
                        continue L1;
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var5);
            stackOut_15_1 = new StringBuilder().append("fs.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void f(int param0, int param1) {
        L0: {
          if (-1 == (-128 & param0 ^ -1)) {
            break L0;
          } else {
            L1: {
              if ((param0 & -16384) == 0) {
                break L1;
              } else {
                L2: {
                  if (-1 == (param0 & -2097152 ^ -1)) {
                    break L2;
                  } else {
                    L3: {
                      if ((param0 & -268435456) != 0) {
                        this.b((byte) 115, param0 >>> 1581630204 | 128);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    this.b((byte) 90, (268682394 | param0) >>> 426344597);
                    break L2;
                  }
                }
                this.b((byte) 64, (2099807 | param0) >>> 364586638);
                break L1;
              }
            }
            this.b((byte) 120, (param0 | 16498) >>> -1834984441);
            break L0;
          }
        }
        this.b((byte) 17, 127 & param0);
        if (param1 < -4) {
          return;
        } else {
          field_l = -52;
          return;
        }
    }

    final void d(int param0, int param1) {
        int fieldTemp$0 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_n[fieldTemp$0] = (byte)(param0 >> 1068365648);
        int fieldTemp$1 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_n[fieldTemp$1] = (byte)(param0 >> 1900252968);
        int fieldTemp$2 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_n[fieldTemp$2] = (byte)param0;
        int var3 = -16 / ((param1 - 43) / 34);
    }

    final boolean e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
        this.field_p = this.field_p - 4;
        var2 = rd.a(this.field_n, 0, this.field_p, param0 + 1010);
        if (param0 == -9) {
          var3 = this.c(true);
          if (var2 == var3) {
            return true;
          } else {
            return false;
          }
        } else {
          var4 = (String) null;
          fs.a((wi) null, -93, 108, (String) null, (byte) 18, 23, 21, 60, 76);
          var3 = this.c(true);
          if (var2 == var3) {
            return true;
          } else {
            return false;
          }
        }
    }

    final byte[] d(byte param0) {
        byte[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        byte[] stackIn_6_0 = null;
        byte[] stackIn_7_0 = null;
        byte[] stackOut_5_0 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (param0 == 120) {
          var5 = new byte[this.field_p];
          var2 = var5;
          var3 = 0;
          L0: while (true) {
            if (var3 < this.field_p) {
              stackOut_5_0 = (byte[]) (var5);
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (var4 == 0) {
                stackIn_7_0[var3] = this.field_n[var3];
                var3++;
                continue L0;
              } else {
                return stackIn_6_0;
              }
            } else {
              return var5;
            }
          }
        } else {
          return (byte[]) null;
        }
    }

    final void a(byte param0, java.math.BigInteger param1, java.math.BigInteger param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
            var4_int = this.field_p;
            this.field_p = 0;
            var5 = new byte[var4_int];
            this.a(var5, var4_int, 0, (byte) -59);
            if (param0 <= 115) {
                field_l = 79;
            }
            var6 = new java.math.BigInteger(var5);
            var7 = var6.modPow(param2, param1);
            var8 = var7.toByteArray();
            this.field_p = 0;
            this.b(-123, var8.length);
            this.a(var8, (byte) -123, var8.length, 0);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "fs.AA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(long param0, int param1) {
        int fieldTemp$14 = 0;
        int fieldTemp$15 = 0;
        int fieldTemp$16 = 0;
        int fieldTemp$17 = 0;
        int fieldTemp$18 = 0;
        int fieldTemp$19 = 0;
        int fieldTemp$20 = 0;
        int fieldTemp$21 = 0;
        int fieldTemp$11 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_n[fieldTemp$11] = (byte)(int)(param0 >> -1656359376);
        int fieldTemp$12 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_n[fieldTemp$12] = (byte)(int)(param0 >> 2000968488);
        int fieldTemp$13 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_n[fieldTemp$13] = (byte)(int)(param0 >> -1461460704);
        if (param1 <= 104) {
          this.e(25, -112);
          fieldTemp$14 = this.field_p;
          this.field_p = this.field_p + 1;
          this.field_n[fieldTemp$14] = (byte)(int)(param0 >> -1587203304);
          fieldTemp$15 = this.field_p;
          this.field_p = this.field_p + 1;
          this.field_n[fieldTemp$15] = (byte)(int)(param0 >> -1252075632);
          fieldTemp$16 = this.field_p;
          this.field_p = this.field_p + 1;
          this.field_n[fieldTemp$16] = (byte)(int)(param0 >> -1431716408);
          fieldTemp$17 = this.field_p;
          this.field_p = this.field_p + 1;
          this.field_n[fieldTemp$17] = (byte)(int)param0;
          return;
        } else {
          fieldTemp$18 = this.field_p;
          this.field_p = this.field_p + 1;
          this.field_n[fieldTemp$18] = (byte)(int)(param0 >> -1587203304);
          fieldTemp$19 = this.field_p;
          this.field_p = this.field_p + 1;
          this.field_n[fieldTemp$19] = (byte)(int)(param0 >> -1252075632);
          fieldTemp$20 = this.field_p;
          this.field_p = this.field_p + 1;
          this.field_n[fieldTemp$20] = (byte)(int)(param0 >> -1431716408);
          fieldTemp$21 = this.field_p;
          this.field_p = this.field_p + 1;
          this.field_n[fieldTemp$21] = (byte)(int)param0;
          return;
        }
    }

    final int c(byte param0) {
        if (param0 <= 120) {
          return -109;
        } else {
          this.field_p = this.field_p + 3;
          return ((255 & this.field_n[-2 + this.field_p]) << -1993305560) + ((16711680 & this.field_n[this.field_p + -3] << -728698704) + (255 & this.field_n[-1 + this.field_p]));
        }
    }

    final long a(byte param0) {
        long var2 = 0L;
        long var4 = 0L;
        if (param0 < 100) {
          return 61L;
        } else {
          var2 = 4294967295L & (long)this.c(true);
          var4 = 4294967295L & (long)this.c(true);
          return var4 + (var2 << 483278688);
        }
    }

    final void a(boolean param0, int param1) {
        byte discarded$1 = 0;
        this.field_n[-4 + this.field_p - param1] = (byte)(param1 >> -1921694440);
        if (!param0) {
          discarded$1 = this.d(true);
          this.field_n[-3 + (-param1 + this.field_p)] = (byte)(param1 >> -642426768);
          this.field_n[-param1 + this.field_p - 2] = (byte)(param1 >> -304626872);
          this.field_n[-1 + (this.field_p - param1)] = (byte)param1;
          return;
        } else {
          this.field_n[-3 + (-param1 + this.field_p)] = (byte)(param1 >> -642426768);
          this.field_n[-param1 + this.field_p - 2] = (byte)(param1 >> -304626872);
          this.field_n[-1 + (this.field_p - param1)] = (byte)param1;
          return;
        }
    }

    final void b(String param0, byte param1) {
        int var4 = 0;
        int fieldTemp$0 = 0;
        CharSequence var5 = null;
        int fieldTemp$1 = 0;
        try {
            int var3_int = -25 % ((param1 - -46) / 53);
            var4 = param0.indexOf(' ');
            if (!(0 > var4)) {
                throw new IllegalArgumentException("");
            }
            fieldTemp$0 = this.field_p;
            this.field_p = this.field_p + 1;
            this.field_n[fieldTemp$0] = (byte) 0;
            var5 = (CharSequence) ((Object) param0);
            this.field_p = this.field_p + mq.a(0, this.field_n, (byte) -124, var5, param0.length(), this.field_p);
            fieldTemp$1 = this.field_p;
            this.field_p = this.field_p + 1;
            this.field_n[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "fs.RA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, long param1) {
        int fieldTemp$8 = 0;
        L0: {
          fieldTemp$8 = this.field_p;
          this.field_p = this.field_p + 1;
          this.field_n[fieldTemp$8] = (byte)(int)(param1 >> 1305057336);
          if (!param0) {
            break L0;
          } else {
            this.a(true, 72L);
            break L0;
          }
        }
        int fieldTemp$9 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_n[fieldTemp$9] = (byte)(int)(param1 >> 781921648);
        int fieldTemp$10 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_n[fieldTemp$10] = (byte)(int)(param1 >> -1087986200);
        int fieldTemp$11 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_n[fieldTemp$11] = (byte)(int)(param1 >> -1820080224);
        int fieldTemp$12 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_n[fieldTemp$12] = (byte)(int)(param1 >> -253207400);
        int fieldTemp$13 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_n[fieldTemp$13] = (byte)(int)(param1 >> 1179645712);
        int fieldTemp$14 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_n[fieldTemp$14] = (byte)(int)(param1 >> -67873336);
        int fieldTemp$15 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_n[fieldTemp$15] = (byte)(int)param1;
    }

    final int a(int param0) {
        this.field_p = this.field_p + 2;
        if (param0 != 255) {
          this.a(124L, -47);
          return (this.field_n[this.field_p + -2] << -2526008 & 65280) - -(255 & this.field_n[this.field_p + -1]);
        } else {
          return (this.field_n[this.field_p + -2] << -2526008 & 65280) - -(255 & this.field_n[this.field_p + -1]);
        }
    }

    final void b(int param0, int param1) {
        int fieldTemp$0 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_n[fieldTemp$0] = (byte)(param1 >> 1173917960);
        int fieldTemp$1 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_n[fieldTemp$1] = (byte)param1;
        int var3 = -45 / ((param0 - 57) / 59);
    }

    public static void c(int param0) {
        field_o = null;
        field_m = null;
        if (param0 > -10) {
            field_l = 23;
            field_k = null;
            return;
        }
        field_k = null;
    }

    final void a(byte param0, int param1) {
        int fieldTemp$6 = 0;
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        L0: while (true) {
          if (this.field_p >= param1) {
            if (param0 != -3) {
              field_o = (boolean[]) null;
              return;
            } else {
              return;
            }
          } else {
            fieldTemp$6 = this.field_p;
            this.field_p = this.field_p + 1;
            this.field_n[fieldTemp$6] = (byte) 0;
            if (var4 == 0) {
              continue L0;
            } else {
              return;
            }
          }
        }
    }

    final String d(int param0) {
        int fieldTemp$2 = 0;
        int var2 = 0;
        int var3 = 0;
        var2 = this.field_p;
        L0: while (true) {
          fieldTemp$2 = this.field_p;
          this.field_p = this.field_p + 1;
          if (0 == this.field_n[fieldTemp$2]) {
            var3 = this.field_p + -var2 + param0;
            if (-1 == (var3 ^ -1)) {
              return "";
            } else {
              return sd.a(this.field_n, var2, var3, 26564);
            }
          } else {
            continue L0;
          }
        }
    }

    final void a(int param0, int param1) {
        if (param0 != 0) {
          field_m = (char[]) null;
          this.field_n[-2 + (this.field_p + -param1)] = (byte)(param1 >> -1178836792);
          this.field_n[-1 + this.field_p + -param1] = (byte)param1;
          return;
        } else {
          this.field_n[-2 + (this.field_p + -param1)] = (byte)(param1 >> -1178836792);
          this.field_n[-1 + this.field_p + -param1] = (byte)param1;
          return;
        }
    }

    final byte d(boolean param0) {
        if (!param0) {
            return (byte) -80;
        }
        int fieldTemp$0 = this.field_p;
        this.field_p = this.field_p + 1;
        return this.field_n[fieldTemp$0];
    }

    fs(int param0) {
        this.field_p = 0;
        this.field_n = jo.a(-44, param0);
    }

    final void a(int param0, byte param1) {
        if (param0 >= 64) {
          if (-16385 < (param0 ^ -1)) {
            if (-16384 > param0) {
              if (param1 >= 0) {
                this.b(58L, -106);
                throw new IllegalArgumentException();
              } else {
                throw new IllegalArgumentException();
              }
            } else {
              this.b(120, 49152 + param0);
              return;
            }
          } else {
            if (param1 >= 0) {
              this.b(58L, -106);
              throw new IllegalArgumentException();
            } else {
              throw new IllegalArgumentException();
            }
          }
        } else {
          if (63 < (param0 ^ -1)) {
            if (-16385 < (param0 ^ -1)) {
              if (-16384 > param0) {
                if (param1 >= 0) {
                  this.b(58L, -106);
                  throw new IllegalArgumentException();
                } else {
                  throw new IllegalArgumentException();
                }
              } else {
                this.b(120, 49152 + param0);
                return;
              }
            } else {
              if (param1 >= 0) {
                this.b(58L, -106);
                throw new IllegalArgumentException();
              } else {
                throw new IllegalArgumentException();
              }
            }
          } else {
            this.b((byte) 108, param0 - -64);
            return;
          }
        }
    }

    final int f(byte param0) {
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        byte stackIn_7_0 = 0;
        byte stackIn_8_0 = 0;
        byte stackOut_6_0 = 0;
        L0: {
          var4 = Sumoblitz.field_L ? 1 : 0;
          if (param0 >= 75) {
            fieldTemp$6 = this.field_p;
            this.field_p = this.field_p + 1;
            var2 = this.field_n[fieldTemp$6];
            var3 = 0;
            break L0;
          } else {
            this.field_p = -23;
            fieldTemp$7 = this.field_p;
            this.field_p = this.field_p + 1;
            var2 = this.field_n[fieldTemp$7];
            var3 = 0;
            break L0;
          }
        }
        L1: while (true) {
          if ((var2 ^ -1) > -1) {
            var3 = (var3 | var2 & 127) << 500669255;
            fieldTemp$8 = this.field_p;
            this.field_p = this.field_p + 1;
            stackOut_6_0 = this.field_n[fieldTemp$8];
            stackIn_8_0 = stackOut_6_0;
            stackIn_7_0 = stackOut_6_0;
            if (var4 == 0) {
              var2 = stackIn_8_0;
              continue L1;
            } else {
              return stackIn_7_0;
            }
          } else {
            return var2 | var3;
          }
        }
    }

    final int f(int param0) {
        if (param0 == 0) {
          if (-1 >= (this.field_n[this.field_p] ^ -1)) {
            return this.a(255);
          } else {
            return this.c(true) & 2147483647;
          }
        } else {
          return 40;
        }
    }

    final void b(byte param0, int param1) {
        byte discarded$6 = 0;
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        if (param0 < 14) {
          discarded$6 = this.d(false);
          fieldTemp$7 = this.field_p;
          this.field_p = this.field_p + 1;
          this.field_n[fieldTemp$7] = (byte)param1;
          return;
        } else {
          fieldTemp$8 = this.field_p;
          this.field_p = this.field_p + 1;
          this.field_n[fieldTemp$8] = (byte)param1;
          return;
        }
    }

    final void e(int param0, int param1) {
        int fieldTemp$8 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_n[fieldTemp$8] = (byte)(param1 >> 1041662200);
        int fieldTemp$9 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_n[fieldTemp$9] = (byte)(param1 >> 355100016);
        int fieldTemp$10 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_n[fieldTemp$10] = (byte)(param1 >> 691986376);
        int fieldTemp$11 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_n[fieldTemp$11] = (byte)param1;
        if (param0 == 48) {
          return;
        } else {
          field_o = (boolean[]) null;
          return;
        }
    }

    fs(byte[] param0) {
        try {
            this.field_n = param0;
            this.field_p = 0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "fs.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final String g(byte param0) {
        int var2 = 0;
        var2 = -125 % ((param0 - -56) / 44);
        if (-1 == (this.field_n[this.field_p] ^ -1)) {
          this.field_p = this.field_p + 1;
          return null;
        } else {
          return this.d(-1);
        }
    }

    final int h(int param0) {
        int var2 = 0;
        if (param0 == -2858) {
          var2 = 255 & this.field_n[this.field_p];
          if ((var2 ^ -1) > -129) {
            return this.e(param0 ^ 29036) - 64;
          } else {
            return -49152 + this.a(param0 + 3113);
          }
        } else {
          field_m = (char[]) null;
          var2 = 255 & this.field_n[this.field_p];
          if ((var2 ^ -1) > -129) {
            return this.e(param0 ^ 29036) - 64;
          } else {
            return -49152 + this.a(param0 + 3113);
          }
        }
    }

    final void a(byte[] param0, int param1, int param2, byte param3) {
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
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param3 <= -5) {
              var5_int = param2;
              L1: while (true) {
                if (var5_int >= param2 - -param1) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  fieldTemp$8 = this.field_p;
                  this.field_p = this.field_p + 1;
                  param0[var5_int] = this.field_n[fieldTemp$8];
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
            stackOut_10_1 = new StringBuilder().append("fs.JA(");
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
          throw qo.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int[] param0, int param1) {
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
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var3_int = this.field_p / 8;
            this.field_p = 0;
            var4 = 0;
            if (param1 >= 82) {
              L1: while (true) {
                if (var3_int <= var4) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var5 = this.c(true);
                  var6 = this.c(true);
                  var7 = 0;
                  var8 = -1640531527;
                  if (var10 == 0) {
                    var9 = 32;
                    L2: while (true) {
                      L3: {
                        incrementValue$1 = var9;
                        var9--;
                        if ((incrementValue$1 ^ -1) >= -1) {
                          this.field_p = this.field_p - 8;
                          this.e(48, var5);
                          this.e(48, var6);
                          var4++;
                          break L3;
                        } else {
                          var5 = var5 + (var7 - -param0[3 & var7] ^ var6 + (var6 << -1532228316 ^ var6 >>> 864681221));
                          var7 = var7 + var8;
                          var6 = var6 + (param0[-513802237 & var7 >>> -1788286709] + var7 ^ var5 + (var5 >>> -1446861083 ^ var5 << -1345413148));
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
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("fs.CA(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int e(boolean param0) {
        int var2 = 0;
        if (!param0) {
          var2 = this.field_n[this.field_p] & 255;
          if (var2 < 128) {
            return this.e(-31302);
          } else {
            return -32768 + this.a(255);
          }
        } else {
          return -85;
        }
    }

    static {
        field_o = new boolean[8];
        field_m = new char[]{(char)91, (char)93, (char)35};
        field_l = 0;
    }
}
