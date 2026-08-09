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
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3_long = 0L;
            var5 = 0L;
            var7 = param1.length();
            if (param0 <= -26) {
              var8 = 19;
              L1: while (true) {
                if (0 > var8) {
                  this.a((byte) 96, var3_long);
                  this.a((byte) 112, var5);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var3_long = var3_long * 38L;
                    if (var8 >= var7) {
                      break L2;
                    } else {
                      L3: {
                        var9 = param1.charAt(var8);
                        if (var9 < 65) {
                          break L3;
                        } else {
                          if (var9 > 90) {
                            break L3;
                          } else {
                            var3_long = var3_long + (long)(-63 - -var9);
                            break L2;
                          }
                        }
                      }
                      L4: {
                        if (var9 < 97) {
                          break L4;
                        } else {
                          if (var9 <= 122) {
                            var3_long = var3_long + (long)(2 + (var9 + -97));
                            break L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (var9 < 48) {
                          break L5;
                        } else {
                          if (var9 <= 57) {
                            var3_long = var3_long + (long)(-20 - -var9);
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
                  if (10 == var8) {
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
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var3);

            stackIn_25_1 = new StringBuilder().append("vh.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L6;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0, long param1) {
        int fieldTemp$0 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$0] = (byte)(int)(param1 >> -523357984);
        int fieldTemp$1 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$1] = (byte)(int)(param1 >> 1100567256);
        int fieldTemp$2 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$2] = (byte)(int)(param1 >> 93485648);
        if (!param0) {
            field_n = -23;
        }
        int fieldTemp$3 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$3] = (byte)(int)(param1 >> 2037631368);
        int fieldTemp$4 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$4] = (byte)(int)param1;
    }

    final void a(long param0, int param1) {
        int fieldTemp$0 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$0] = (byte)(int)(param0 >> 2092323896);
        int fieldTemp$1 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$1] = (byte)(int)(param0 >> 840699056);
        int fieldTemp$2 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$2] = (byte)(int)(param0 >> 82828648);
        int fieldTemp$3 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$3] = (byte)(int)(param0 >> 130209376);
        int fieldTemp$4 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$4] = (byte)(int)(param0 >> 695052824);
        int fieldTemp$5 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$5] = (byte)(int)(param0 >> 38359632);
        int fieldTemp$6 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$6] = (byte)(int)(param0 >> 1967119432);
        int fieldTemp$7 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$7] = (byte)(int)param0;
        if (param1 != 38359632) {
            int[] var5 = (int[]) null;
            this.a((int[]) null, -11, -67, -35);
        }
    }

    final void d(int param0, int param1) {
        this.field_o[-param1 + this.field_q - 4] = (byte)(param1 >> 311195448);
        this.field_o[this.field_q - (param1 + 3)] = (byte)(param1 >> 975187440);
        this.field_o[-param1 + this.field_q + -2] = (byte)(param1 >> -420245976);
        this.field_o[param0 + -param1 + this.field_q] = (byte)param1;
    }

    final void a(byte[] param0, int param1, int param2, int param3) {
        int fieldTemp$2 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var5_int = 122 % ((param3 - 32) / 47);
            var6 = param1;
            L1: while (true) {
              if (param2 + param1 <= var6) {
                break L0;
              } else {
                fieldTemp$2 = this.field_q;
                this.field_q = this.field_q + 1;
                this.field_o[fieldTemp$2] = param0[var6];
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("vh.OA(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void b(int param0, int param1) {
        if (param0 != 1) {
            field_r = (String) null;
        }
        int fieldTemp$0 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$0] = (byte)param1;
    }

    final int i(int param0) {
        if (param0 != 1) {
            return -27;
        }
        this.field_q = this.field_q + 4;
        return (this.field_o[this.field_q - 1] & 255) + ((255 & this.field_o[this.field_q - 2]) << -1589908920) + ((-16777216 & this.field_o[-4 + this.field_q] << 1895138040) + (this.field_o[-3 + this.field_q] << 1467172912 & 16711680));
    }

    final String g(int param0) {
        int fieldTemp$0 = 0;
        if (param0 != 1) {
            this.e(28);
        }
        int var2 = this.field_q;
        while (true) {
            fieldTemp$0 = this.field_q;
            this.field_q = this.field_q + 1;
            if (0 == this.field_o[fieldTemp$0]) {
                break;
            }
        }
        int var3 = -1 + (this.field_q + -var2);
        if (var3 == 0) {
            return "";
        }
        return co.a(var2, var3, -101, this.field_o);
    }

    final String c(byte param0) {
        if (param0 >= -73) {
            return (String) null;
        }
        if (this.field_o[this.field_q] == 0) {
            this.field_q = this.field_q + 1;
            return null;
        }
        return this.g(1);
    }

    final void a(byte param0, int[] param1) {
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
                  var9 = 32;
                  L2: while (true) {
                    incrementValue$2 = var9;
                    var9--;
                    if ((incrementValue$2 ^ -1) >= -1) {
                      this.field_q = this.field_q - 8;
                      this.a((byte) -105, var5);
                      this.a((byte) -58, var6);
                      var4++;
                      continue L1;
                    } else {
                      var5 = var5 + (var6 + (var6 << -88535644 ^ var6 >>> -394982139) ^ param1[3 & var7] + var7);
                      var7 = var7 + var8;
                      var6 = var6 + (var7 + param1[(var7 & 8001) >>> -372635349] ^ var5 + (var5 >>> 1217987141 ^ var5 << 1000709252));
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

            stackIn_12_1 = new StringBuilder().append("vh.IA(").append(param0).append(',');

            if (param1 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int a(int param0) {
        if (param0 <= 44) {
            field_n = -101;
        }
        int var2 = this.field_o[this.field_q] & 255;
        if ((var2 ^ -1) <= -129) {
            return -49152 + this.e((byte) -104);
        }
        return this.k(0) + -64;
    }

    final int e(byte param0) {
        if (param0 != -104) {
            return 93;
        }
        this.field_q = this.field_q + 2;
        return ((255 & this.field_o[this.field_q - 2]) << 749089384) - -(this.field_o[this.field_q - 1] & 255);
    }

    final void a(boolean param0, int param1) {
        if (!param0) {
            return;
        }
        if (-1 >= (param1 ^ -1) && 128 > param1) {
            this.b(1, param1);
            return;
        }
        if (0 <= param1) {
            if (!(-32769 >= (param1 ^ -1))) {
                this.b(true, 32768 - -param1);
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    final void l(int param0) {
        if (!(null == this.field_o)) {
            od.a(-30001, this.field_o);
        }
        this.field_o = null;
        if (param0 <= 99) {
            field_k = (byte[][][]) null;
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5, boolean param6) {
        int incrementValue$0 = 0;
        int stackIn_24_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
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
                        if (param4 <= var11) {
                          vh.a(param0, param1, false, var9, var8, param5, param6);
                          vh.a(var8, var10, param2, param3, param4, param5, param6);
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          L3: {
                            var12 = vt.field_m[var11];
                            if (!param6) {
                              stackIn_24_0 = tb.field_h[var12];
                              break L3;
                            } else {
                              stackIn_24_0 = no.field_U[var12];
                              break L3;
                            }
                          }
                          L4: {
                            var13 = stackIn_24_0;
                            if (var13 <= var7_int) {
                              if (var10 < var13) {
                                var10 = var13;
                                break L4;
                              } else {
                                break L4;
                              }
                            } else {
                              vt.field_m[var11] = vt.field_m[var8];
                              incrementValue$0 = var8;
                              var8++;
                              vt.field_m[incrementValue$0] = var12;
                              if (var9 > var13) {
                                var9 = var13;
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                          }
                          var11++;
                          continue L2;
                        }
                      }
                    }
                  }
                }
                var7_int = -1 + param4;
                L5: while (true) {
                  if (var7_int <= param0) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var8 = param0;
                    L6: while (true) {
                      if (var8 >= var7_int) {
                        var7_int--;
                        continue L5;
                      } else {
                        L7: {
                          var9 = vt.field_m[var8];
                          var10 = vt.field_m[1 + var8];
                          if (co.a(param6, var10, var9, -27)) {
                            vt.field_m[var8] = var10;
                            vt.field_m[var8 + 1] = var9;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        var8++;
                        continue L6;
                      }
                    }
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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (kp.a(false, param1, param2, param3)) {
              if (param0 == -1) {
                stackIn_7_0 = bj.e(12722);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = (wk) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("vh.UA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
        }
        this.field_o[-param1 + this.field_q + -2] = (byte)(param1 >> -1480020600);
        this.field_o[-1 + (-param1 + this.field_q)] = (byte)param1;
    }

    final long j(byte param0) {
        long var2 = 4294967295L & (long)this.i(1);
        long var4 = 4294967295L & (long)this.i(1);
        if (param0 != -2) {
            return 69L;
        }
        return (var2 << 1879274144) + var4;
    }

    final void a(int[] param0, int param1, int param2, int param3) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
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
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var5_int = this.field_q;
            this.field_q = param2;
            var6 = (param1 + -param2) / 8;
            var7 = 0;
            L1: while (true) {
              if (var6 <= var7) {
                L2: {
                  this.field_q = var5_int;
                  if (param3 == -12366) {
                    break L2;
                  } else {
                    this.field_o = (byte[]) null;
                    break L2;
                  }
                }
                break L0;
              } else {
                var8 = this.i(param3 ^ -12365);
                var9 = this.i(param3 + 12367);
                var10 = -957401312;
                var11 = -1640531527;
                var12 = 32;
                L3: while (true) {
                  incrementValue$0 = var12;
                  var12--;
                  if ((incrementValue$0 ^ -1) >= -1) {
                    this.field_q = this.field_q - 8;
                    this.a((byte) -118, var8);
                    this.a((byte) -119, var9);
                    var7++;
                    continue L1;
                  } else {
                    var9 = var9 - (var10 - -param0[-1948254205 & var10 >>> -697495413] ^ (var8 << 744227044 ^ var8 >>> -1829671579) - -var8);
                    var10 = var10 - var11;
                    var8 = var8 - ((var9 >>> -1280449659 ^ var9 << 1732176036) + var9 ^ var10 + param0[var10 & 3]);
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
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("vh.S(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void c(int param0, int param1) {
        if (param0 != -49) {
            return;
        }
        if (!((-128 & param1) == 0)) {
            if (!((param1 & -16384) == 0)) {
                if (!(0 == (-2097152 & param1))) {
                    if (!(-1 == (param1 & -268435456 ^ -1))) {
                        this.b(1, param1 >>> -2099379460 | 128);
                    }
                    this.b(1, (param1 | 268669197) >>> 1452178005);
                }
                this.b(1, (2106399 | param1) >>> -1521176178);
            }
            this.b(1, (param1 | 16422) >>> 1717998503);
        }
        this.b(1, 127 & param1);
    }

    final int b(byte param0, int param1) {
        int var3 = im.a(this.field_q, this.field_o, param1, -8779);
        this.a((byte) -87, var3);
        if (param0 != -39) {
            this.c((byte) -110, 112);
        }
        return var3;
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
        int fieldTemp$1 = 0;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var3 = 106 % ((param0 - 50) / 41);
        int fieldTemp$0 = this.field_q;
        this.field_q = this.field_q + 1;
        int var2 = this.field_o[fieldTemp$0];
        int var4 = 0;
        while ((var2 ^ -1) > -1) {
            var4 = (var2 & 127 | var4) << 1186131527;
            fieldTemp$1 = this.field_q;
            this.field_q = this.field_q + 1;
            var2 = this.field_o[fieldTemp$1];
        }
        return var2 | var4;
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
        if (param0 != 4215) {
            field_k = (byte[][][]) null;
        }
        this.field_q = this.field_q - 4;
        int var2 = im.a(this.field_q, this.field_o, 0, -8779);
        int var3 = this.i(1);
        if (var3 == var2) {
            return true;
        }
        return false;
    }

    final void c(byte param0, int param1) {
        if (param0 != 60) {
            this.a(false, 84);
        }
        if ((param1 ^ -1) > -65) {
            if (!(param1 < -64)) {
                this.b(1, param1 - -64);
                return;
            }
        }
        if (-16385 < (param1 ^ -1)) {
            if (!(-16384 > param1)) {
                this.b(true, param1 - -49152);
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    final int d(byte param0) {
        if (param0 != -13) {
            this.field_q = -28;
        }
        this.field_q = this.field_q + 3;
        return (this.field_o[-3 + this.field_q] << -56600336 & 16711680) + ((this.field_o[-2 + this.field_q] << 1711696520 & 65280) - -(this.field_o[-1 + this.field_q] & 255));
    }

    final String h(byte param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = this.field_q;
        this.field_q = this.field_q + 1;
        int var2 = this.field_o[fieldTemp$0];
        if (!(-1 == (var2 ^ -1))) {
            throw new IllegalStateException("");
        }
        int var3 = this.field_q;
        if (param0 != 121) {
            return (String) null;
        }
        while (true) {
            fieldTemp$1 = this.field_q;
            this.field_q = this.field_q + 1;
            if (0 == this.field_o[fieldTemp$1]) {
                break;
            }
        }
        int var4 = -1 + this.field_q - var3;
        if (var4 == 0) {
            return "";
        }
        return co.a(var3, var4, param0 + -231, this.field_o);
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
        if (param0 < 91) {
            return -51;
        }
        if (this.field_o[this.field_q] >= 0) {
            return this.e((byte) -104);
        }
        return 2147483647 & this.i(1);
    }

    final byte[] g(byte param0) {
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        byte[] var2 = new byte[this.field_q];
        int var3 = 0;
        if (param0 >= -27) {
            this.a(97);
        }
        while (var3 < this.field_q) {
            var2[var3] = this.field_o[var3];
            var3++;
        }
        return var2;
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
                fieldTemp$2 = this.field_q;
                this.field_q = this.field_q + 1;
                param3[var5_int] = this.field_o[fieldTemp$2];
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

            stackIn_9_1 = new StringBuilder().append("vh.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final void a(byte param0, int param1) {
        int fieldTemp$0 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$0] = (byte)(param1 >> 1431843352);
        int fieldTemp$1 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$1] = (byte)(param1 >> 361386320);
        int fieldTemp$2 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$2] = (byte)(param1 >> -1720563512);
        if (param0 >= -46) {
            return;
        }
        int fieldTemp$3 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$3] = (byte)param1;
    }

    final void b(boolean param0, int param1) {
        if (!param0) {
            return;
        }
        int fieldTemp$0 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$0] = (byte)(param1 >> 1523985896);
        int fieldTemp$1 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$1] = (byte)param1;
    }

    final int e(int param0) {
        int var2 = this.field_o[this.field_q] & 255;
        if (param0 != -23470) {
            return 108;
        }
        if (-129 >= (var2 ^ -1)) {
            return this.e((byte) -104) + -32768;
        }
        return this.k(0);
    }

    final void a(int param0, byte param1) {
        int fieldTemp$0 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$0] = (byte)(param0 >> -314377488);
        int fieldTemp$1 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$1] = (byte)(param0 >> 1950420008);
        if (param1 != 58) {
            return;
        }
        int fieldTemp$2 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_o[fieldTemp$2] = (byte)param0;
    }

    public static void f(int param0) {
        field_k = (byte[][][]) null;
        if (param0 <= 49) {
            field_m = (String) null;
        }
        field_l = null;
        field_r = null;
        field_s = null;
        field_p = null;
        field_m = null;
    }

    final void b(int param0, byte param1) {
        int fieldTemp$0 = 0;
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        while (param0 > this.field_q) {
            fieldTemp$0 = this.field_q;
            this.field_q = this.field_q + 1;
            this.field_o[fieldTemp$0] = (byte) 0;
        }
        int var3 = 34 / ((19 - param1) / 60);
    }

    static {
        field_l = new me(4, 1, 1, 1);
        field_r = "Restart Mission";
        field_m = "Waiting for music";
        field_p = "Quicksaving...";
    }
}
