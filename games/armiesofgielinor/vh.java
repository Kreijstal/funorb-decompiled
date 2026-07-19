/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vh extends tc {
    byte[] field_o;
    int field_q;
    static me field_l;
    static String field_r;
    static hd field_s;
    static String field_m;
    static String field_p;
    static byte[][][] field_k;
    static int field_n;

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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3_long = 0L;
            var5 = 0L;
            var7 = param1.length();
            if (param0 <= -26) {
              var8 = 19;
              L1: while (true) {
                L2: {
                  L3: {
                    if (0 > var8) {
                      break L3;
                    } else {
                      var3_long = var3_long * 38L;
                      if (var10 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (var8 >= var7) {
                            break L4;
                          } else {
                            L5: {
                              var9 = param1.charAt(var8);
                              if (var9 < 65) {
                                break L5;
                              } else {
                                if (var9 > 90) {
                                  break L5;
                                } else {
                                  var3_long = var3_long + (long)(-63 - -var9);
                                  if (var10 == 0) {
                                    break L4;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                            L6: {
                              L7: {
                                if (var9 < 97) {
                                  break L7;
                                } else {
                                  if (var9 <= 122) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              L8: {
                                L9: {
                                  if (var9 < 48) {
                                    break L9;
                                  } else {
                                    if (var9 <= 57) {
                                      break L8;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                var3_long = var3_long + 1L;
                                if (var10 == 0) {
                                  break L4;
                                } else {
                                  break L8;
                                }
                              }
                              var3_long = var3_long + (long)(-20 - -var9);
                              if (var10 == 0) {
                                break L4;
                              } else {
                                break L6;
                              }
                            }
                            var3_long = var3_long + (long)(2 + (var9 + -97));
                            break L4;
                          }
                        }
                        L10: {
                          if (10 != var8) {
                            break L10;
                          } else {
                            var5 = var3_long;
                            var3_long = 0L;
                            break L10;
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
                  this.a((byte) 96, var3_long);
                  this.a((byte) 112, var5);
                  break L2;
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
          L11: {
            var3 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var3);
            stackOut_24_1 = new StringBuilder().append("vh.P(").append(param0).append(',');
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
              break L11;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L11;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0, long param1) {
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        int fieldTemp$12 = 0;
        int fieldTemp$13 = 0;
        int fieldTemp$7 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$7] = (byte)(int)(param1 >> -523357984);
        int fieldTemp$8 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$8] = (byte)(int)(param1 >> 1100567256);
        int fieldTemp$9 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$9] = (byte)(int)(param1 >> 93485648);
        if (!param0) {
          field_n = -23;
          fieldTemp$10 = this.field_q;
          this.field_q = this.field_q + 1;
          this.field_o[fieldTemp$10] = (byte)(int)(param1 >> 2037631368);
          fieldTemp$11 = this.field_q;
          this.field_q = this.field_q + 1;
          this.field_o[fieldTemp$11] = (byte)(int)param1;
          return;
        } else {
          fieldTemp$12 = this.field_q;
          this.field_q = this.field_q + 1;
          this.field_o[fieldTemp$12] = (byte)(int)(param1 >> 2037631368);
          fieldTemp$13 = this.field_q;
          this.field_q = this.field_q + 1;
          this.field_o[fieldTemp$13] = (byte)(int)param1;
          return;
        }
    }

    final void a(long param0, int param1) {
        int[] var5 = null;
        int fieldTemp$8 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$8] = (byte)(int)(param0 >> 2092323896);
        int fieldTemp$9 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$9] = (byte)(int)(param0 >> 840699056);
        int fieldTemp$10 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$10] = (byte)(int)(param0 >> 82828648);
        int fieldTemp$11 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$11] = (byte)(int)(param0 >> 130209376);
        int fieldTemp$12 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$12] = (byte)(int)(param0 >> 695052824);
        int fieldTemp$13 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$13] = (byte)(int)(param0 >> 38359632);
        int fieldTemp$14 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$14] = (byte)(int)(param0 >> 1967119432);
        int fieldTemp$15 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$15] = (byte)(int)param0;
        if (param1 == 38359632) {
          return;
        } else {
          var5 = (int[]) null;
          this.a((int[]) null, -11, -67, -35);
          return;
        }
    }

    final void d(int param0, int param1) {
        this.field_o[-param1 + this.field_q - 4] = (byte)(param1 >> 311195448);
        this.field_o[this.field_q - (param1 + 3)] = (byte)(param1 >> 975187440);
        this.field_o[-param1 + this.field_q + -2] = (byte)(param1 >> -420245976);
        this.field_o[param0 + -param1 + this.field_q] = (byte)param1;
    }

    final void a(byte[] param0, int param1, int param2, int param3) {
        int fieldTemp$7 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
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
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var5_int = 122 % ((param3 - 32) / 47);
            var6 = param1;
            L1: while (true) {
              if (param2 + param1 <= var6) {
                break L0;
              } else {
                fieldTemp$7 = this.field_q;
                this.field_q = this.field_q + 1;
                this.field_o[fieldTemp$7] = param0[var6];
                var6++;
                if (var7 == 0) {
                  continue L1;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var5);
            stackOut_8_1 = new StringBuilder().append("vh.OA(");
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
          throw ig.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void b(int param0, int param1) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        if (param0 != 1) {
          field_r = (String) null;
          fieldTemp$4 = this.field_q;
          this.field_q = this.field_q + 1;
          this.field_o[fieldTemp$4] = (byte)param1;
          return;
        } else {
          fieldTemp$5 = this.field_q;
          this.field_q = this.field_q + 1;
          this.field_o[fieldTemp$5] = (byte)param1;
          return;
        }
    }

    final int i(int param0) {
        if (param0 != 1) {
          return -27;
        } else {
          this.field_q = this.field_q + 4;
          return (this.field_o[this.field_q - 1] & 255) + ((255 & this.field_o[this.field_q - 2]) << -1589908920) + ((-16777216 & this.field_o[-4 + this.field_q] << 1895138040) + (this.field_o[-3 + this.field_q] << 1467172912 & 16711680));
        }
    }

    final String g(int param0) {
        int fieldTemp$6 = 0;
        int discarded$7 = 0;
        int fieldTemp$8 = 0;
        int var2 = 0;
        int var3 = 0;
        if (param0 == 1) {
          var2 = this.field_q;
          L0: while (true) {
            fieldTemp$6 = this.field_q;
            this.field_q = this.field_q + 1;
            if (0 == this.field_o[fieldTemp$6]) {
              var3 = -1 + (this.field_q + -var2);
              if (var3 == 0) {
                return "";
              } else {
                return co.a(var2, var3, -101, this.field_o);
              }
            } else {
              continue L0;
            }
          }
        } else {
          discarded$7 = this.e(28);
          var2 = this.field_q;
          L1: while (true) {
            fieldTemp$8 = this.field_q;
            this.field_q = this.field_q + 1;
            if (0 == this.field_o[fieldTemp$8]) {
              var3 = -1 + (this.field_q + -var2);
              if (var3 == 0) {
                return "";
              } else {
                return co.a(var2, var3, -101, this.field_o);
              }
            } else {
              continue L1;
            }
          }
        }
    }

    final String c(byte param0) {
        if (param0 < -73) {
          if (this.field_o[this.field_q] == 0) {
            this.field_q = this.field_q + 1;
            return null;
          } else {
            return this.g(1);
          }
        } else {
          return (String) null;
        }
    }

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
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3_int = this.field_q / 8;
            this.field_q = 0;
            if (param0 == 31) {
              var4 = 0;
              L1: while (true) {
                if (var3_int <= var4) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var5 = this.i(1);
                  var6 = this.i(1);
                  var7 = 0;
                  var8 = -1640531527;
                  if (var10 == 0) {
                    var9 = 32;
                    L2: while (true) {
                      L3: {
                        incrementValue$1 = var9;
                        var9--;
                        if ((incrementValue$1 ^ -1) >= -1) {
                          this.field_q = this.field_q - 8;
                          this.a((byte) -105, var5);
                          this.a((byte) -58, var6);
                          var4++;
                          break L3;
                        } else {
                          var5 = var5 + (var6 + (var6 << -88535644 ^ var6 >>> -394982139) ^ param1[3 & var7] + var7);
                          var7 = var7 + var8;
                          var6 = var6 + (var7 + param1[(var7 & 8001) >>> -372635349] ^ var5 + (var5 >>> 1217987141 ^ var5 << 1000709252));
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
            stackOut_15_0 = (RuntimeException) (var3);
            stackOut_15_1 = new StringBuilder().append("vh.IA(").append(param0).append(',');
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
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int a(int param0) {
        int var2 = 0;
        if (param0 > 44) {
          var2 = this.field_o[this.field_q] & 255;
          if ((var2 ^ -1) <= -129) {
            return -49152 + this.e((byte) -104);
          } else {
            return this.k(0) + -64;
          }
        } else {
          field_n = -101;
          var2 = this.field_o[this.field_q] & 255;
          if ((var2 ^ -1) <= -129) {
            return -49152 + this.e((byte) -104);
          } else {
            return this.k(0) + -64;
          }
        }
    }

    final int e(byte param0) {
        if (param0 != -104) {
          return 93;
        } else {
          this.field_q = this.field_q + 2;
          return ((255 & this.field_o[this.field_q - 2]) << 749089384) - -(this.field_o[this.field_q - 1] & 255);
        }
    }

    final void a(boolean param0, int param1) {
        if (param0) {
          if (-1 >= (param1 ^ -1)) {
            if (128 <= param1) {
              if (0 <= param1) {
                if (-32769 >= (param1 ^ -1)) {
                  throw new IllegalArgumentException();
                } else {
                  this.b(true, 32768 - -param1);
                  return;
                }
              } else {
                throw new IllegalArgumentException();
              }
            } else {
              this.b(1, param1);
              return;
            }
          } else {
            if (0 <= param1) {
              if (-32769 >= (param1 ^ -1)) {
                throw new IllegalArgumentException();
              } else {
                this.b(true, 32768 - -param1);
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

    final void l(int param0) {
        L0: {
          if (null != this.field_o) {
            od.a(-30001, this.field_o);
            break L0;
          } else {
            break L0;
          }
        }
        this.field_o = null;
        if (param0 > 99) {
          return;
        } else {
          field_k = (byte[][][]) null;
          return;
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5, boolean param6) {
        int incrementValue$1 = 0;
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_15_0 = false;
        boolean stackIn_24_0 = false;
        int stackIn_27_0 = 0;
        int stackIn_36_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_35_0 = 0;
        boolean stackOut_23_0 = false;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_10_0 = 0;
        boolean stackOut_14_0 = false;
        var14 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param0 >= param5) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param4 > 1 + param0) {
                L1: {
                  if (param0 - -5 >= param4) {
                    break L1;
                  } else {
                    if (param1 == param3) {
                      break L1;
                    } else {
                      var7_int = (param1 >> 800932225) + (param3 >> 1006511361) + (param3 & param1 & 1);
                      var8 = param0;
                      var9 = param1;
                      var10 = param3;
                      var11 = param0;
                      L2: while (true) {
                        L3: {
                          if (param4 <= var11) {
                            vh.a(param0, param1, false, var9, var8, param5, param6);
                            stackOut_35_0 = var8;
                            stackIn_36_0 = stackOut_35_0;
                            break L3;
                          } else {
                            var12 = vt.field_m[var11];
                            stackOut_23_0 = param6;
                            stackIn_36_0 = stackOut_23_0 ? 1 : 0;
                            stackIn_24_0 = stackOut_23_0;
                            if (var14 != 0) {
                              break L3;
                            } else {
                              L4: {
                                if (!stackIn_24_0) {
                                  stackOut_26_0 = tb.field_h[var12];
                                  stackIn_27_0 = stackOut_26_0;
                                  break L4;
                                } else {
                                  stackOut_25_0 = no.field_U[var12];
                                  stackIn_27_0 = stackOut_25_0;
                                  break L4;
                                }
                              }
                              L5: {
                                L6: {
                                  var13 = stackIn_27_0;
                                  if (var13 <= var7_int) {
                                    break L6;
                                  } else {
                                    vt.field_m[var11] = vt.field_m[var8];
                                    incrementValue$1 = var8;
                                    var8++;
                                    vt.field_m[incrementValue$1] = var12;
                                    if (var9 > var13) {
                                      var9 = var13;
                                      if (var14 == 0) {
                                        break L5;
                                      } else {
                                        break L6;
                                      }
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                                if (var10 < var13) {
                                  var10 = var13;
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                              var11++;
                              continue L2;
                            }
                          }
                        }
                        vh.a(stackIn_36_0, var10, param2, param3, param4, param5, param6);
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  }
                }
                var7_int = -1 + param4;
                L7: while (true) {
                  stackOut_10_0 = var7_int ^ -1;
                  stackIn_11_0 = stackOut_10_0;
                  L8: while (true) {
                    L9: {
                      if (stackIn_11_0 >= (param0 ^ -1)) {
                        break L9;
                      } else {
                        var8 = param0;
                        L10: while (true) {
                          L11: {
                            if (var8 >= var7_int) {
                              break L11;
                            } else {
                              var9 = vt.field_m[var8];
                              var10 = vt.field_m[1 + var8];
                              stackOut_14_0 = co.a(param6, var10, var9, -27);
                              stackIn_11_0 = stackOut_14_0 ? 1 : 0;
                              stackIn_15_0 = stackOut_14_0;
                              if (var14 != 0) {
                                continue L8;
                              } else {
                                L12: {
                                  if (stackIn_15_0) {
                                    vt.field_m[var8] = var10;
                                    vt.field_m[var8 + 1] = var9;
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                                var8++;
                                if (var14 == 0) {
                                  continue L10;
                                } else {
                                  break L11;
                                }
                              }
                            }
                          }
                          var7_int--;
                          if (var14 == 0) {
                            continue L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var7), "vh.CA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final static void i(byte param0) {
        ot.g(76);
        dh.d(-1);
        ik.field_b = null;
        int var1 = -111 % ((-16 - param0) / 46);
        e.a((byte) -117);
    }

    final byte a(byte param0) {
        int var2 = 120 % ((53 - param0) / 44);
        int fieldTemp$0 = this.field_q;
        this.field_q = this.field_q + 1;
        return this.field_o[fieldTemp$0];
    }

    final static wk a(int param0, int param1, kl param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        wk stackIn_5_0 = null;
        wk stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        wk stackOut_6_0 = null;
        wk stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (kp.a(false, param1, param2, param3)) {
              if (param0 == -1) {
                stackOut_6_0 = bj.e(12722);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_4_0 = (wk) null;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4);
            stackOut_8_1 = new StringBuilder().append("vh.UA(").append(param0).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (wk) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final void f(int param0, int param1) {
        if (param0 != 0) {
          return;
        } else {
          this.field_o[-param1 + this.field_q + -2] = (byte)(param1 >> -1480020600);
          this.field_o[-1 + (-param1 + this.field_q)] = (byte)param1;
          return;
        }
    }

    final long j(byte param0) {
        long var2 = 0L;
        long var4 = 0L;
        var2 = 4294967295L & (long)this.i(1);
        var4 = 4294967295L & (long)this.i(1);
        if (param0 != -2) {
          return 69L;
        } else {
          return (var2 << 1879274144) + var4;
        }
    }

    final void a(int[] param0, int param1, int param2, int param3) {
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
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var5_int = this.field_q;
            this.field_q = param2;
            var6 = (param1 + -param2) / 8;
            var7 = 0;
            L1: while (true) {
              L2: {
                if (var6 <= var7) {
                  this.field_q = var5_int;
                  stackOut_11_0 = param3;
                  stackIn_12_0 = stackOut_11_0;
                  break L2;
                } else {
                  var8 = this.i(param3 ^ -12365);
                  var9 = this.i(param3 + 12367);
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
                          incrementValue$1 = var12;
                          var12--;
                          if ((incrementValue$1 ^ -1) >= -1) {
                            break L5;
                          } else {
                            var9 = var9 - (var10 - -param0[-1948254205 & var10 >>> -697495413] ^ (var8 << 744227044 ^ var8 >>> -1829671579) - -var8);
                            var10 = var10 - var11;
                            var8 = var8 - ((var9 >>> -1280449659 ^ var9 << 1732176036) + var9 ^ var10 + param0[var10 & 3]);
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
                        this.field_q = this.field_q - 8;
                        this.a((byte) -118, var8);
                        this.a((byte) -119, var9);
                        var7++;
                        break L4;
                      }
                      continue L1;
                    }
                  }
                }
              }
              if (stackIn_12_0 == -12366) {
                break L0;
              } else {
                this.field_o = (byte[]) null;
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var5);
            stackOut_15_1 = new StringBuilder().append("vh.S(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void c(int param0, int param1) {
        if (param0 != -49) {
          return;
        } else {
          L0: {
            if ((-128 & param1) != 0) {
              L1: {
                if ((param1 & -16384) != 0) {
                  L2: {
                    if (0 != (-2097152 & param1)) {
                      L3: {
                        if (-1 != (param1 & -268435456 ^ -1)) {
                          this.b(1, param1 >>> -2099379460 | 128);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      this.b(1, (param1 | 268669197) >>> 1452178005);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  this.b(1, (2106399 | param1) >>> -1521176178);
                  break L1;
                } else {
                  break L1;
                }
              }
              this.b(1, (param1 | 16422) >>> 1717998503);
              break L0;
            } else {
              break L0;
            }
          }
          this.b(1, 127 & param1);
          return;
        }
    }

    final int b(byte param0, int param1) {
        int var3 = 0;
        var3 = im.a(this.field_q, this.field_o, param1, -8779);
        this.a((byte) -87, var3);
        if (param0 != -39) {
          this.c((byte) -110, 112);
          return var3;
        } else {
          return var3;
        }
    }

    final void b(String param0, int param1) {
        int var3_int = 0;
        CharSequence var5 = null;
        int fieldTemp$0 = 0;
        try {
            var3_int = param0.indexOf(' ');
            if (!((var3_int ^ -1) > -1)) {
                throw new IllegalArgumentException("");
            }
            if (param1 != 13851) {
                byte[] var4 = (byte[]) null;
                this.a((byte[]) null, -81, 60, -69);
            }
            var5 = (CharSequence) ((Object) param0);
            this.field_q = this.field_q + ic.a(this.field_o, 0, var5, param0.length(), this.field_q, (byte) 114);
            fieldTemp$0 = this.field_q;
            this.field_q = this.field_q + 1;
            this.field_o[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "vh.DA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int h(int param0) {
        int fieldTemp$5 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte stackIn_4_0 = 0;
        byte stackIn_5_0 = 0;
        byte stackOut_3_0 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = 106 % ((param0 - 50) / 41);
        int fieldTemp$4 = this.field_q;
        this.field_q = this.field_q + 1;
        var2 = this.field_o[fieldTemp$4];
        var4 = 0;
        L0: while (true) {
          if ((var2 ^ -1) > -1) {
            var4 = (var2 & 127 | var4) << 1186131527;
            fieldTemp$5 = this.field_q;
            this.field_q = this.field_q + 1;
            stackOut_3_0 = this.field_o[fieldTemp$5];
            stackIn_5_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (var5 == 0) {
              var2 = stackIn_5_0;
              continue L0;
            } else {
              return stackIn_4_0;
            }
          } else {
            return var2 | var4;
          }
        }
    }

    final int k(int param0) {
        if (param0 != 0) {
            return -34;
        }
        int fieldTemp$0 = this.field_q;
        this.field_q = this.field_q + 1;
        return this.field_o[fieldTemp$0] & 255;
    }

    final void e(int param0, int param1) {
        if (param1 != 5930) {
            return;
        }
        this.field_o[this.field_q - (param0 - -1)] = (byte)param0;
    }

    final void a(String param0, int param1) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        try {
            var3_int = param0.indexOf(' ');
            if (!((var3_int ^ -1) > -1)) {
                throw new IllegalArgumentException("");
            }
            fieldTemp$0 = this.field_q;
            this.field_q = this.field_q + 1;
            this.field_o[fieldTemp$0] = (byte) 0;
            if (param1 != 413740432) {
                field_m = (String) null;
            }
            var4 = (CharSequence) ((Object) param0);
            this.field_q = this.field_q + ic.a(this.field_o, 0, var4, param0.length(), this.field_q, (byte) 113);
            fieldTemp$1 = this.field_q;
            this.field_q = this.field_q + 1;
            this.field_o[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "vh.HA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean j(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (param0 == 4215) {
          this.field_q = this.field_q - 4;
          var2 = im.a(this.field_q, this.field_o, 0, -8779);
          var3 = this.i(1);
          if (var3 == var2) {
            return true;
          } else {
            return false;
          }
        } else {
          field_k = (byte[][][]) null;
          this.field_q = this.field_q - 4;
          var2 = im.a(this.field_q, this.field_o, 0, -8779);
          var3 = this.i(1);
          if (var3 == var2) {
            return true;
          } else {
            return false;
          }
        }
    }

    final void c(byte param0, int param1) {
        if (param0 == 60) {
          if ((param1 ^ -1) <= -65) {
            if (-16385 < (param1 ^ -1)) {
              if (-16384 > param1) {
                throw new IllegalArgumentException();
              } else {
                this.b(true, param1 - -49152);
                return;
              }
            } else {
              throw new IllegalArgumentException();
            }
          } else {
            if (param1 < -64) {
              if (-16385 < (param1 ^ -1)) {
                if (-16384 > param1) {
                  throw new IllegalArgumentException();
                } else {
                  this.b(true, param1 - -49152);
                  return;
                }
              } else {
                throw new IllegalArgumentException();
              }
            } else {
              this.b(1, param1 - -64);
              return;
            }
          }
        } else {
          this.a(false, 84);
          if ((param1 ^ -1) > -65) {
            if (param1 >= -64) {
              this.b(1, param1 - -64);
              return;
            } else {
              if (-16385 < (param1 ^ -1)) {
                if (-16384 <= param1) {
                  this.b(true, param1 - -49152);
                  return;
                } else {
                  throw new IllegalArgumentException();
                }
              } else {
                throw new IllegalArgumentException();
              }
            }
          } else {
            if (-16385 < (param1 ^ -1)) {
              if (-16384 > param1) {
                throw new IllegalArgumentException();
              } else {
                this.b(true, param1 - -49152);
                return;
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        }
    }

    final int d(byte param0) {
        if (param0 != -13) {
          this.field_q = -28;
          this.field_q = this.field_q + 3;
          return (this.field_o[-3 + this.field_q] << -56600336 & 16711680) + ((this.field_o[-2 + this.field_q] << 1711696520 & 65280) - -(this.field_o[-1 + this.field_q] & 255));
        } else {
          this.field_q = this.field_q + 3;
          return (this.field_o[-3 + this.field_q] << -56600336 & 16711680) + ((this.field_o[-2 + this.field_q] << 1711696520 & 65280) - -(this.field_o[-1 + this.field_q] & 255));
        }
    }

    final String h(byte param0) {
        int fieldTemp$3 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int fieldTemp$2 = this.field_q;
        this.field_q = this.field_q + 1;
        var2 = this.field_o[fieldTemp$2];
        if (-1 != (var2 ^ -1)) {
          throw new IllegalStateException("");
        } else {
          var3 = this.field_q;
          if (param0 == 121) {
            L0: while (true) {
              fieldTemp$3 = this.field_q;
              this.field_q = this.field_q + 1;
              if (0 == this.field_o[fieldTemp$3]) {
                var4 = -1 + this.field_q - var3;
                if (var4 == 0) {
                  return "";
                } else {
                  return co.a(var3, var4, param0 + -231, this.field_o);
                }
              } else {
                continue L0;
              }
            }
          } else {
            return (String) null;
          }
        }
    }

    final void a(int param0, java.math.BigInteger param1, java.math.BigInteger param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
            if (param0 != -5247) {
                String var9 = (String) null;
                this.a(-2, (String) null);
            }
            var4_int = this.field_q;
            this.field_q = 0;
            var5 = new byte[var4_int];
            this.a(0, var4_int, 0, var5);
            var6 = new java.math.BigInteger(var5);
            var7 = var6.modPow(param1, param2);
            var8 = var7.toByteArray();
            this.field_q = 0;
            this.b(true, var8.length);
            this.a(var8, 0, var8.length, 115);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "vh.TA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(byte param0, long param1) {
        int fieldTemp$0 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$0] = (byte)(int)(param1 >> -412704592);
        int var4 = 65 / ((47 - param0) / 43);
        int fieldTemp$1 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$1] = (byte)(int)(param1 >> -954935896);
        int fieldTemp$2 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$2] = (byte)(int)(param1 >> 672688160);
        int fieldTemp$3 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$3] = (byte)(int)(param1 >> -1611260648);
        int fieldTemp$4 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$4] = (byte)(int)(param1 >> 413740432);
        int fieldTemp$5 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$5] = (byte)(int)(param1 >> -100866744);
        int fieldTemp$6 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$6] = (byte)(int)param1;
    }

    final int f(byte param0) {
        if (param0 >= 91) {
          if (this.field_o[this.field_q] >= 0) {
            return this.e((byte) -104);
          } else {
            return 2147483647 & this.i(1);
          }
        } else {
          return -51;
        }
    }

    final byte[] g(byte param0) {
        int discarded$2 = 0;
        byte[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] stackIn_5_0 = null;
        byte[] stackIn_6_0 = null;
        byte[] stackOut_4_0 = null;
        L0: {
          var4 = ArmiesOfGielinor.field_M ? 1 : 0;
          var2 = new byte[this.field_q];
          var3 = 0;
          if (param0 < -27) {
            break L0;
          } else {
            discarded$2 = this.a(97);
            break L0;
          }
        }
        L1: while (true) {
          if (var3 < this.field_q) {
            stackOut_4_0 = (byte[]) (var2);
            stackIn_6_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if (var4 == 0) {
              stackIn_6_0[var3] = this.field_o[var3];
              var3++;
              continue L1;
            } else {
              return stackIn_5_0;
            }
          } else {
            return var2;
          }
        }
    }

    vh(int param0) {
        this.field_q = 0;
        this.field_o = od.a(param0, 50);
    }

    vh(byte[] param0) {
        try {
            this.field_q = 0;
            this.field_o = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "vh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) {
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
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                this.d(74, 42);
                break L1;
              }
            }
            var5_int = param2;
            L2: while (true) {
              if (var5_int >= param2 + param1) {
                break L0;
              } else {
                fieldTemp$7 = this.field_q;
                this.field_q = this.field_q + 1;
                param3[var5_int] = this.field_o[fieldTemp$7];
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
            stackOut_10_1 = new StringBuilder().append("vh.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    final void a(byte param0, int param1) {
        int fieldTemp$11 = 0;
        int fieldTemp$8 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$8] = (byte)(param1 >> 1431843352);
        int fieldTemp$9 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$9] = (byte)(param1 >> 361386320);
        int fieldTemp$10 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$10] = (byte)(param1 >> -1720563512);
        if (param0 >= -46) {
          return;
        } else {
          fieldTemp$11 = this.field_q;
          this.field_q = this.field_q + 1;
          this.field_o[fieldTemp$11] = (byte)param1;
          return;
        }
    }

    final void b(boolean param0, int param1) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        if (!param0) {
          return;
        } else {
          fieldTemp$4 = this.field_q;
          this.field_q = this.field_q + 1;
          this.field_o[fieldTemp$4] = (byte)(param1 >> 1523985896);
          fieldTemp$5 = this.field_q;
          this.field_q = this.field_q + 1;
          this.field_o[fieldTemp$5] = (byte)param1;
          return;
        }
    }

    final int e(int param0) {
        int var2 = 0;
        var2 = this.field_o[this.field_q] & 255;
        if (param0 == -23470) {
          if (-129 >= (var2 ^ -1)) {
            return this.e((byte) -104) + -32768;
          } else {
            return this.k(0);
          }
        } else {
          return 108;
        }
    }

    final void a(int param0, byte param1) {
        int fieldTemp$8 = 0;
        int fieldTemp$6 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$6] = (byte)(param0 >> -314377488);
        int fieldTemp$7 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$7] = (byte)(param0 >> 1950420008);
        if (param1 != 58) {
          return;
        } else {
          fieldTemp$8 = this.field_q;
          this.field_q = this.field_q + 1;
          this.field_o[fieldTemp$8] = (byte)param0;
          return;
        }
    }

    public static void f(int param0) {
        field_k = (byte[][][]) null;
        if (param0 <= 49) {
          field_m = (String) null;
          field_l = null;
          field_r = null;
          field_s = null;
          field_p = null;
          field_m = null;
          return;
        } else {
          field_l = null;
          field_r = null;
          field_s = null;
          field_p = null;
          field_m = null;
          return;
        }
    }

    final void b(int param0, byte param1) {
        int fieldTemp$2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        L0: while (true) {
          L1: {
            if (param0 <= this.field_q) {
              break L1;
            } else {
              fieldTemp$2 = this.field_q;
              this.field_q = this.field_q + 1;
              this.field_o[fieldTemp$2] = (byte) 0;
              if (var4 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          var3 = 34 / ((19 - param1) / 60);
          return;
        }
    }

    static {
        field_l = new me(4, 1, 1, 1);
        field_r = "Restart Mission";
        field_m = "Waiting for music";
        field_p = "Quicksaving...";
    }
}
