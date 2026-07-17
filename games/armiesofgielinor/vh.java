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
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
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
                  L6: {
                    if (10 != var8) {
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  var8--;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var3;
            stackOut_23_1 = new StringBuilder().append("vh.P(").append(param0).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
    }

    final void a(boolean param0, long param1) {
        int fieldTemp$0 = ((vh) this).field_q;
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[fieldTemp$0] = (byte)(int)(param1 >> 32);
        int fieldTemp$1 = ((vh) this).field_q;
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[fieldTemp$1] = (byte)(int)(param1 >> 24);
        int fieldTemp$2 = ((vh) this).field_q;
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[fieldTemp$2] = (byte)(int)(param1 >> 16);
        if (!param0) {
            field_n = -23;
        }
        int fieldTemp$3 = ((vh) this).field_q;
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[fieldTemp$3] = (byte)(int)(param1 >> 8);
        int fieldTemp$4 = ((vh) this).field_q;
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[fieldTemp$4] = (byte)(int)param1;
    }

    final void a(long param0, int param1) {
        Object var5 = null;
        L0: {
          int fieldTemp$8 = ((vh) this).field_q;
          ((vh) this).field_q = ((vh) this).field_q + 1;
          ((vh) this).field_o[fieldTemp$8] = (byte)(int)(param0 >> 56);
          int fieldTemp$9 = ((vh) this).field_q;
          ((vh) this).field_q = ((vh) this).field_q + 1;
          ((vh) this).field_o[fieldTemp$9] = (byte)(int)(param0 >> 48);
          int fieldTemp$10 = ((vh) this).field_q;
          ((vh) this).field_q = ((vh) this).field_q + 1;
          ((vh) this).field_o[fieldTemp$10] = (byte)(int)(param0 >> 40);
          int fieldTemp$11 = ((vh) this).field_q;
          ((vh) this).field_q = ((vh) this).field_q + 1;
          ((vh) this).field_o[fieldTemp$11] = (byte)(int)(param0 >> 32);
          int fieldTemp$12 = ((vh) this).field_q;
          ((vh) this).field_q = ((vh) this).field_q + 1;
          ((vh) this).field_o[fieldTemp$12] = (byte)(int)(param0 >> 24);
          int fieldTemp$13 = ((vh) this).field_q;
          ((vh) this).field_q = ((vh) this).field_q + 1;
          ((vh) this).field_o[fieldTemp$13] = (byte)(int)(param0 >> 16);
          int fieldTemp$14 = ((vh) this).field_q;
          ((vh) this).field_q = ((vh) this).field_q + 1;
          ((vh) this).field_o[fieldTemp$14] = (byte)(int)(param0 >> 8);
          int fieldTemp$15 = ((vh) this).field_q;
          ((vh) this).field_q = ((vh) this).field_q + 1;
          ((vh) this).field_o[fieldTemp$15] = (byte)(int)param0;
          if (param1 == 38359632) {
            break L0;
          } else {
            var5 = null;
            ((vh) this).a((int[]) null, -11, -67, -35);
            break L0;
          }
        }
    }

    final void d(int param0, int param1) {
        ((vh) this).field_o[-param1 + ((vh) this).field_q - 4] = (byte)(param1 >> 24);
        ((vh) this).field_o[((vh) this).field_q - (param1 + 3)] = (byte)(param1 >> 16);
        ((vh) this).field_o[-param1 + ((vh) this).field_q + -2] = (byte)(param1 >> 8);
        ((vh) this).field_o[param0 + -param1 + ((vh) this).field_q] = (byte)param1;
    }

    final void a(byte[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
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
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var5_int = 122 % ((param3 - 32) / 47);
            var6 = param1;
            L1: while (true) {
              if (param2 + param1 <= var6) {
                break L0;
              } else {
                int fieldTemp$7 = ((vh) this).field_q;
                ((vh) this).field_q = ((vh) this).field_q + 1;
                ((vh) this).field_o[fieldTemp$7] = param0[var6];
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("vh.OA(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void b(int param0, int param1) {
        if (param0 != 1) {
            field_r = null;
        }
        int fieldTemp$0 = ((vh) this).field_q;
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[fieldTemp$0] = (byte)param1;
    }

    final int i(int param0) {
        if (param0 != 1) {
            return -27;
        }
        ((vh) this).field_q = ((vh) this).field_q + 4;
        return (((vh) this).field_o[((vh) this).field_q - 1] & 255) + ((255 & ((vh) this).field_o[((vh) this).field_q - 2]) << 8) + ((-16777216 & ((vh) this).field_o[-4 + ((vh) this).field_q] << 24) + (((vh) this).field_o[-3 + ((vh) this).field_q] << 16 & 16711680));
    }

    final String g(int param0) {
        if (param0 != 1) {
            int discarded$0 = ((vh) this).e(28);
        }
        int var2 = ((vh) this).field_q;
        while (true) {
            int fieldTemp$1 = ((vh) this).field_q;
            ((vh) this).field_q = ((vh) this).field_q + 1;
            if (0 == ((vh) this).field_o[fieldTemp$1]) {
                break;
            }
        }
        int var3 = -1 + (((vh) this).field_q + -var2);
        if (var3 == 0) {
            return "";
        }
        return co.a(var2, var3, -101, ((vh) this).field_o);
    }

    final String c(byte param0) {
        if (param0 >= -73) {
            return null;
        }
        if (((vh) this).field_o[((vh) this).field_q] == 0) {
            ((vh) this).field_q = ((vh) this).field_q + 1;
            return null;
        }
        return ((vh) this).g(1);
    }

    final void a(byte param0, int[] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
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
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3_int = ((vh) this).field_q / 8;
            ((vh) this).field_q = 0;
            if (param0 == 31) {
              var4 = 0;
              L1: while (true) {
                if (var3_int <= var4) {
                  break L0;
                } else {
                  var5 = ((vh) this).i(1);
                  var6 = ((vh) this).i(1);
                  var7 = 0;
                  var8 = -1640531527;
                  var9 = 32;
                  L2: while (true) {
                    int incrementValue$5 = var9;
                    var9--;
                    if (incrementValue$5 <= 0) {
                      ((vh) this).field_q = ((vh) this).field_q - 8;
                      ((vh) this).a((byte) -105, var5);
                      ((vh) this).a((byte) -58, var6);
                      var4++;
                      continue L1;
                    } else {
                      var5 = var5 + (var6 + (var6 << 4 ^ var6 >>> 5) ^ param1[3 & var7] + var7);
                      var7 = var7 + var8;
                      var6 = var6 + (var7 + param1[(var7 & 8001) >>> 11] ^ var5 + (var5 >>> 5 ^ var5 << 4));
                      continue L2;
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("vh.IA(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    final int a(int param0) {
        if (param0 <= 44) {
            field_n = -101;
        }
        int var2 = ((vh) this).field_o[((vh) this).field_q] & 255;
        if (var2 >= 128) {
            return -49152 + ((vh) this).e((byte) -104);
        }
        return ((vh) this).k(0) + -64;
    }

    final int e(byte param0) {
        if (param0 != -104) {
            return 93;
        }
        ((vh) this).field_q = ((vh) this).field_q + 2;
        return ((255 & ((vh) this).field_o[((vh) this).field_q - 2]) << 8) - -(((vh) this).field_o[((vh) this).field_q - 1] & 255);
    }

    final void a(boolean param0, int param1) {
        if (!param0) {
            return;
        }
        if (param1 >= 0) {
            if (128 > param1) {
                ((vh) this).b(1, param1);
                return;
            }
        }
        if (0 <= param1) {
            if (!(param1 >= 32768)) {
                ((vh) this).b(true, 32768 - -param1);
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    final void l(int param0) {
        if (!(null == ((vh) this).field_o)) {
            od.a(-30001, ((vh) this).field_o);
        }
        ((vh) this).field_o = null;
        if (param0 <= 99) {
            field_k = null;
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5, boolean param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        var14 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param0 >= param5) {
              return;
            } else {
              if (param4 > 1 + param0) {
                L1: {
                  if (param0 - -5 >= param4) {
                    break L1;
                  } else {
                    if (param1 == param3) {
                      break L1;
                    } else {
                      var7_int = (param1 >> 1) + (param3 >> 1) + (param3 & param1 & 1);
                      var8 = param0;
                      var9 = param1;
                      var10 = param3;
                      var11 = param0;
                      L2: while (true) {
                        if (param4 <= var11) {
                          vh.a(param0, param1, false, var9, var8, param5, param6);
                          vh.a(var8, var10, param2, param3, param4, param5, param6);
                          break L0;
                        } else {
                          L3: {
                            var12 = vt.field_m[var11];
                            if (!param6) {
                              stackOut_23_0 = tb.field_h[var12];
                              stackIn_24_0 = stackOut_23_0;
                              break L3;
                            } else {
                              stackOut_22_0 = no.field_U[var12];
                              stackIn_24_0 = stackOut_22_0;
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
                              int incrementValue$2 = var8;
                              var8++;
                              vt.field_m[incrementValue$2] = var12;
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
                    return;
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
                          int discarded$3 = -27;
                          if (co.a(param6, var10, var9)) {
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
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var7, "vh.CA(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    final static void i(byte param0) {
        int discarded$0 = 76;
        ot.g();
        int discarded$1 = -1;
        dh.d();
        ik.field_b = null;
        int var1 = -111 % ((-16 - param0) / 46);
        e.a((byte) -117);
    }

    final byte a(byte param0) {
        int var2 = 120 % ((53 - param0) / 44);
        int fieldTemp$0 = ((vh) this).field_q;
        ((vh) this).field_q = ((vh) this).field_q + 1;
        return ((vh) this).field_o[fieldTemp$0];
    }

    final static wk a(int param0, int param1, kl param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        wk stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        wk stackOut_4_0 = null;
        Object stackOut_1_0 = null;
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
            if (kp.a(false, param1, param2, param3)) {
              int discarded$2 = 12722;
              stackOut_4_0 = bj.e();
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (wk) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("vh.UA(").append(-1).append(44).append(param1).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param3 + 41);
        }
        return stackIn_5_0;
    }

    final void f(int param0, int param1) {
        if (param0 != 0) {
            return;
        }
        ((vh) this).field_o[-param1 + ((vh) this).field_q + -2] = (byte)(param1 >> 8);
        ((vh) this).field_o[-1 + (-param1 + ((vh) this).field_q)] = (byte)param1;
    }

    final long j(byte param0) {
        long var2 = 4294967295L & (long)((vh) this).i(1);
        long var4 = 4294967295L & (long)((vh) this).i(1);
        if (param0 != -2) {
            return 69L;
        }
        return (var2 << 32) + var4;
    }

    final void a(int[] param0, int param1, int param2, int param3) {
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
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var5_int = ((vh) this).field_q;
            ((vh) this).field_q = param2;
            var6 = (param1 + -param2) / 8;
            var7 = 0;
            L1: while (true) {
              if (var6 <= var7) {
                L2: {
                  ((vh) this).field_q = var5_int;
                  if (param3 == -12366) {
                    break L2;
                  } else {
                    ((vh) this).field_o = null;
                    break L2;
                  }
                }
                break L0;
              } else {
                var8 = ((vh) this).i(param3 ^ -12365);
                var9 = ((vh) this).i(param3 + 12367);
                var10 = -957401312;
                var11 = -1640531527;
                var12 = 32;
                L3: while (true) {
                  int incrementValue$1 = var12;
                  var12--;
                  if (incrementValue$1 <= 0) {
                    ((vh) this).field_q = ((vh) this).field_q - 8;
                    ((vh) this).a((byte) -118, var8);
                    ((vh) this).a((byte) -119, var9);
                    var7++;
                    continue L1;
                  } else {
                    var9 = var9 - (var10 - -param0[-1948254205 & var10 >>> 11] ^ (var8 << 4 ^ var8 >>> 5) - -var8);
                    var10 = var10 - var11;
                    var8 = var8 - ((var9 >>> 5 ^ var9 << 4) + var9 ^ var10 + param0[var10 & 3]);
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
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("vh.S(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void c(int param0, int param1) {
        if (param0 != -49) {
            return;
        }
        if (!((-128 & param1) == 0)) {
            if (!((param1 & -16384) == -1)) {
                if (!(0 == (-2097152 & param1))) {
                    if (!(-1 == (param1 & -268435456))) {
                        ((vh) this).b(1, param1 >>> 28 | 128);
                    }
                    ((vh) this).b(1, (param1 | 268669197) >>> 21);
                }
                ((vh) this).b(1, (2106399 | param1) >>> 14);
            }
            ((vh) this).b(1, (param1 | 16422) >>> 7);
        }
        ((vh) this).b(1, 127 & param1);
    }

    final int b(byte param0, int param1) {
        int discarded$0 = -8779;
        int var3 = im.a(((vh) this).field_q, ((vh) this).field_o, param1);
        ((vh) this).a((byte) -87, var3);
        if (param0 != -39) {
            ((vh) this).c((byte) -110, 112);
        }
        return var3;
    }

    final void b(String param0, int param1) {
        int var3_int = 0;
        CharSequence var5 = null;
        try {
            var3_int = param0.indexOf(' ');
            if (!(var3_int < 0)) {
                throw new IllegalArgumentException("");
            }
            if (param1 != 13851) {
                Object var4 = null;
                ((vh) this).a((byte[]) null, -81, 60, -69);
            }
            var5 = (CharSequence) (Object) param0;
            ((vh) this).field_q = ((vh) this).field_q + ic.a(((vh) this).field_o, 0, var5, param0.length(), ((vh) this).field_q, (byte) 114);
            int fieldTemp$0 = ((vh) this).field_q;
            ((vh) this).field_q = ((vh) this).field_q + 1;
            ((vh) this).field_o[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "vh.DA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final int h(int param0) {
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var3 = 106 % ((param0 - 50) / 41);
        int fieldTemp$0 = ((vh) this).field_q;
        ((vh) this).field_q = ((vh) this).field_q + 1;
        int var2 = ((vh) this).field_o[fieldTemp$0];
        int var4 = 0;
        while (var2 < 0) {
            var4 = (var2 & 127 | var4) << 7;
            int fieldTemp$1 = ((vh) this).field_q;
            ((vh) this).field_q = ((vh) this).field_q + 1;
            var2 = ((vh) this).field_o[fieldTemp$1];
        }
        return var2 | var4;
    }

    final int k(int param0) {
        if (param0 != 0) {
            return -34;
        }
        int fieldTemp$0 = ((vh) this).field_q;
        ((vh) this).field_q = ((vh) this).field_q + 1;
        return ((vh) this).field_o[fieldTemp$0] & 255;
    }

    final void e(int param0, int param1) {
        if (param1 != 5930) {
            return;
        }
        ((vh) this).field_o[((vh) this).field_q - (param0 - -1)] = (byte)param0;
    }

    final void a(String param0, int param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        try {
            var3_int = param0.indexOf(' ');
            if (!(var3_int < 0)) {
                throw new IllegalArgumentException("");
            }
            int fieldTemp$0 = ((vh) this).field_q;
            ((vh) this).field_q = ((vh) this).field_q + 1;
            ((vh) this).field_o[fieldTemp$0] = (byte) 0;
            if (param1 != 413740432) {
                field_m = null;
            }
            var4 = (CharSequence) (Object) param0;
            ((vh) this).field_q = ((vh) this).field_q + ic.a(((vh) this).field_o, 0, var4, param0.length(), ((vh) this).field_q, (byte) 113);
            int fieldTemp$1 = ((vh) this).field_q;
            ((vh) this).field_q = ((vh) this).field_q + 1;
            ((vh) this).field_o[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "vh.HA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final boolean j(int param0) {
        if (param0 != 4215) {
            field_k = null;
        }
        ((vh) this).field_q = ((vh) this).field_q - 4;
        int discarded$0 = -8779;
        int var2 = im.a(((vh) this).field_q, ((vh) this).field_o, 0);
        int var3 = ((vh) this).i(1);
        if (var3 == var2) {
            return true;
        }
        return false;
    }

    final void c(byte param0, int param1) {
        if (param0 != 60) {
            ((vh) this).a(false, 84);
        }
        if (param1 < 64) {
            if (!(param1 < -64)) {
                ((vh) this).b(1, param1 - -64);
                return;
            }
        }
        if (param1 < 16384) {
            if (!(-16384 > param1)) {
                ((vh) this).b(true, param1 - -49152);
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    final int d(byte param0) {
        if (param0 != -13) {
            ((vh) this).field_q = -28;
        }
        ((vh) this).field_q = ((vh) this).field_q + 3;
        return (((vh) this).field_o[-3 + ((vh) this).field_q] << 16 & 16711680) + ((((vh) this).field_o[-2 + ((vh) this).field_q] << 8 & 65280) - -(((vh) this).field_o[-1 + ((vh) this).field_q] & 255));
    }

    final String h(byte param0) {
        int fieldTemp$0 = ((vh) this).field_q;
        ((vh) this).field_q = ((vh) this).field_q + 1;
        int var2 = ((vh) this).field_o[fieldTemp$0];
        if (!(var2 == 0)) {
            throw new IllegalStateException("");
        }
        int var3 = ((vh) this).field_q;
        if (param0 != 121) {
            return null;
        }
        while (true) {
            int fieldTemp$1 = ((vh) this).field_q;
            ((vh) this).field_q = ((vh) this).field_q + 1;
            if (0 == ((vh) this).field_o[fieldTemp$1]) {
                break;
            }
        }
        int var4 = -1 + ((vh) this).field_q - var3;
        if (var4 == 0) {
            return "";
        }
        return co.a(var3, var4, param0 + -231, ((vh) this).field_o);
    }

    final void a(int param0, java.math.BigInteger param1, java.math.BigInteger param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
            if (param0 != -5247) {
                Object var9 = null;
                ((vh) this).a(-2, (String) null);
            }
            var4_int = ((vh) this).field_q;
            ((vh) this).field_q = 0;
            var5 = new byte[var4_int];
            ((vh) this).a(0, var4_int, 0, var5);
            var6 = new java.math.BigInteger(var5);
            var7 = var6.modPow(param1, param2);
            var8 = var7.toByteArray();
            ((vh) this).field_q = 0;
            ((vh) this).b(true, var8.length);
            ((vh) this).a(var8, 0, var8.length, 115);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "vh.TA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    private final void a(byte param0, long param1) {
        int fieldTemp$0 = ((vh) this).field_q;
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[fieldTemp$0] = (byte)(int)(param1 >> 48);
        int var4 = 65 / ((47 - param0) / 43);
        int fieldTemp$1 = ((vh) this).field_q;
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[fieldTemp$1] = (byte)(int)(param1 >> 40);
        int fieldTemp$2 = ((vh) this).field_q;
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[fieldTemp$2] = (byte)(int)(param1 >> 32);
        int fieldTemp$3 = ((vh) this).field_q;
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[fieldTemp$3] = (byte)(int)(param1 >> 24);
        int fieldTemp$4 = ((vh) this).field_q;
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[fieldTemp$4] = (byte)(int)(param1 >> 16);
        int fieldTemp$5 = ((vh) this).field_q;
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[fieldTemp$5] = (byte)(int)(param1 >> 8);
        int fieldTemp$6 = ((vh) this).field_q;
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[fieldTemp$6] = (byte)(int)param1;
    }

    final int f(byte param0) {
        if (param0 < 91) {
            return -51;
        }
        if (((vh) this).field_o[((vh) this).field_q] >= 0) {
            return ((vh) this).e((byte) -104);
        }
        return 2147483647 & ((vh) this).i(1);
    }

    final byte[] g(byte param0) {
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        byte[] var2 = new byte[((vh) this).field_q];
        int var3 = 0;
        if (param0 >= -27) {
            int discarded$0 = ((vh) this).a(97);
        }
        while (var3 < ((vh) this).field_q) {
            var2[var3] = ((vh) this).field_o[var3];
            var3++;
        }
        return var2;
    }

    vh(int param0) {
        ((vh) this).field_q = 0;
        ((vh) this).field_o = od.a(param0, 50);
    }

    vh(byte[] param0) {
        try {
            ((vh) this).field_q = 0;
            ((vh) this).field_o = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "vh.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) {
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
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                ((vh) this).d(74, 42);
                break L1;
              }
            }
            var5_int = param2;
            L2: while (true) {
              if (var5_int >= param2 + param1) {
                break L0;
              } else {
                int fieldTemp$7 = ((vh) this).field_q;
                ((vh) this).field_q = ((vh) this).field_q + 1;
                param3[var5_int] = ((vh) this).field_o[fieldTemp$7];
                var5_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("vh.EA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    final void a(byte param0, int param1) {
        int fieldTemp$0 = ((vh) this).field_q;
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[fieldTemp$0] = (byte)(param1 >> 24);
        int fieldTemp$1 = ((vh) this).field_q;
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[fieldTemp$1] = (byte)(param1 >> 16);
        int fieldTemp$2 = ((vh) this).field_q;
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[fieldTemp$2] = (byte)(param1 >> 8);
        if (param0 >= -46) {
            return;
        }
        int fieldTemp$3 = ((vh) this).field_q;
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[fieldTemp$3] = (byte)param1;
    }

    final void b(boolean param0, int param1) {
        if (!param0) {
            return;
        }
        int fieldTemp$0 = ((vh) this).field_q;
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[fieldTemp$0] = (byte)(param1 >> 8);
        int fieldTemp$1 = ((vh) this).field_q;
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[fieldTemp$1] = (byte)param1;
    }

    final int e(int param0) {
        int var2 = ((vh) this).field_o[((vh) this).field_q] & 255;
        if (param0 != -23470) {
            return 108;
        }
        if (var2 >= 128) {
            return ((vh) this).e((byte) -104) + -32768;
        }
        return ((vh) this).k(0);
    }

    final void a(int param0, byte param1) {
        int fieldTemp$0 = ((vh) this).field_q;
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[fieldTemp$0] = (byte)(param0 >> 16);
        int fieldTemp$1 = ((vh) this).field_q;
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[fieldTemp$1] = (byte)(param0 >> 8);
        if (param1 != 58) {
            return;
        }
        int fieldTemp$2 = ((vh) this).field_q;
        ((vh) this).field_q = ((vh) this).field_q + 1;
        ((vh) this).field_o[fieldTemp$2] = (byte)param0;
    }

    public static void f() {
        field_k = null;
        field_l = null;
        field_r = null;
        field_s = null;
        field_p = null;
        field_m = null;
    }

    final void b(int param0, byte param1) {
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        while (param0 > ((vh) this).field_q) {
            int fieldTemp$0 = ((vh) this).field_q;
            ((vh) this).field_q = ((vh) this).field_q + 1;
            ((vh) this).field_o[fieldTemp$0] = (byte) 0;
        }
        int var3 = 34 / ((19 - param1) / 60);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new me(4, 1, 1, 1);
        field_r = "Restart Mission";
        field_m = "Waiting for music";
        field_p = "Quicksaving...";
    }
}
