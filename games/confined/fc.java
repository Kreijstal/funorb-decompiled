/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc {
    private int field_c;
    static mn field_a;
    private int[] field_e;
    private int field_i;
    private int field_g;
    private int[] field_b;
    static od field_d;
    static volatile boolean field_f;
    private int field_h;

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Confined.field_J ? 1 : 0;
        var4 = 46 / ((param0 - -56) / 40);
        int fieldTemp$3 = ((fc) this).field_c + 1;
        ((fc) this).field_c = ((fc) this).field_c + 1;
        ((fc) this).field_h = ((fc) this).field_h + fieldTemp$3;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 256) {
            return;
          } else {
            L1: {
              var3 = ((fc) this).field_e[var2];
              if ((var2 & 2) != 0) {
                if (0 == (var2 & 1)) {
                  ((fc) this).field_i = ((fc) this).field_i ^ ((fc) this).field_i << 2;
                  break L1;
                } else {
                  ((fc) this).field_i = ((fc) this).field_i ^ ((fc) this).field_i >>> 16;
                  break L1;
                }
              } else {
                if ((1 & var2) != 0) {
                  ((fc) this).field_i = ((fc) this).field_i ^ ((fc) this).field_i >>> 6;
                  break L1;
                } else {
                  ((fc) this).field_i = ((fc) this).field_i ^ ((fc) this).field_i << 13;
                  break L1;
                }
              }
            }
            ((fc) this).field_i = ((fc) this).field_i + ((fc) this).field_e[255 & 128 + var2];
            int dupTemp$4 = ((fc) this).field_e[va.a(255, var3 >> 2)] - (-((fc) this).field_i + -((fc) this).field_h);
            var5 = dupTemp$4;
            ((fc) this).field_e[var2] = dupTemp$4;
            int dupTemp$5 = ((fc) this).field_e[va.a(var5 >> 8 >> 2, 255)] + var3;
            ((fc) this).field_h = dupTemp$5;
            ((fc) this).field_b[var2] = dupTemp$5;
            var2++;
            continue L0;
          }
        }
    }

    final static void a(boolean param0, mn param1) {
        RuntimeException var2 = null;
        oi var2_ref = null;
        oi var3 = null;
        int var4 = 0;
        int var5 = 0;
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
        var5 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              var2_ref = (oi) (Object) param1.a(false);
              if (var2_ref != null) {
                var3 = (oi) (Object) param1.a((byte) -124);
                var4 = 1;
                L2: while (true) {
                  if (var3 == null) {
                    if (var4 != 0) {
                      return;
                    } else {
                      var3 = (oi) (Object) param1.a(-113);
                      var2_ref = (oi) (Object) param1.d(2123);
                      var4 = 1;
                      L3: while (true) {
                        if (var2_ref == null) {
                          if (var4 != 0) {
                            break L0;
                          } else {
                            continue L1;
                          }
                        } else {
                          L4: {
                            if (var2_ref.field_n + var2_ref.field_p > var3.field_n + var3.field_p) {
                              var4 = 0;
                              ri.a((rk) (Object) var3, 0, (rk) (Object) var2_ref);
                              break L4;
                            } else {
                              var3 = var2_ref;
                              break L4;
                            }
                          }
                          var2_ref = (oi) (Object) param1.d(2123);
                          continue L3;
                        }
                      }
                    }
                  } else {
                    L5: {
                      if (var3.field_p + var3.field_n < var2_ref.field_n + var2_ref.field_p) {
                        var4 = 0;
                        ri.a((rk) (Object) var3, 0, (rk) (Object) var2_ref);
                        break L5;
                      } else {
                        var2_ref = var3;
                        break L5;
                      }
                    }
                    var3 = (oi) (Object) param1.a((byte) -127);
                    continue L2;
                  }
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var2;
            stackOut_24_1 = new StringBuilder().append("fc.F(").append(1).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L6;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L6;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
        }
    }

    final static void a(int param0, int param1, int[] param2, int param3, byte[] param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            L1: while (true) {
              if (var5_int >= vb.field_e.length) {
                break L0;
              } else {
                param3 = vb.field_e[var5_int];
                var6 = var5_int << 4;
                L2: while (true) {
                  int incrementValue$12 = param3;
                  param3--;
                  if (incrementValue$12 == 0) {
                    var5_int++;
                    continue L1;
                  } else {
                    int incrementValue$13 = var6;
                    var6++;
                    param1 = tl.field_i[incrementValue$13];
                    param2[param4[param1]] = param2[param4[param1]] + 1;
                    tl.field_i[param2[param4[param1]]] = param1;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("fc.H(").append(-1257536924).append(44).append(param1).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
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
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(param3).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    final static String a(CharSequence[] param0, int param1, int param2, int param3) {
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        String stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_22_0 = null;
        String stackOut_8_0 = null;
        String stackOut_6_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var9 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (param3 != 0) {
              if (param3 != 1) {
                var4_int = param3;
                var5 = 0;
                var6_int = 0;
                L1: while (true) {
                  if (~var4_int >= ~var6_int) {
                    var6 = new StringBuilder(var5);
                    var7 = 0;
                    L2: while (true) {
                      if (var4_int <= var7) {
                        stackOut_22_0 = var6.toString();
                        stackIn_23_0 = stackOut_22_0;
                        break L0;
                      } else {
                        L3: {
                          var8 = param0[var7];
                          if (var8 != null) {
                            StringBuilder discarded$5 = var6.append(var8);
                            break L3;
                          } else {
                            StringBuilder discarded$6 = var6.append("null");
                            break L3;
                          }
                        }
                        var7++;
                        continue L2;
                      }
                    }
                  } else {
                    L4: {
                      var7_ref_CharSequence = param0[var6_int];
                      if (var7_ref_CharSequence == null) {
                        var5 += 4;
                        break L4;
                      } else {
                        var5 = var5 + var7_ref_CharSequence.length();
                        break L4;
                      }
                    }
                    var6_int++;
                    continue L1;
                  }
                }
              } else {
                var10 = param0[0];
                var4 = var10;
                if (var4 != null) {
                  stackOut_8_0 = ((Object) (Object) var10).toString();
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                } else {
                  stackOut_6_0 = "null";
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                }
              }
            } else {
              stackOut_2_0 = "";
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var4_ref;
            stackOut_24_1 = new StringBuilder().append("fc.B(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L5;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L5;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + -2 + 44 + 0 + 44 + param3 + 41);
        }
        return stackIn_23_0;
    }

    private final void b() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Confined.field_J ? 1 : 0;
        var3 = -1640531527;
        var10 = -1640531527;
        var4 = -1640531527;
        var8 = -1640531527;
        var5 = -1640531527;
        var7 = -1640531527;
        var9 = -1640531527;
        var6 = -1640531527;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 4) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= 256) {
                var2 = 0;
                L2: while (true) {
                  if (var2 >= 256) {
                    this.a((byte) -118);
                    ((fc) this).field_g = 256;
                    return;
                  } else {
                    var4 = var4 + ((fc) this).field_e[var2 - -1];
                    var3 = var3 + ((fc) this).field_e[var2];
                    var7 = var7 + ((fc) this).field_e[4 + var2];
                    var6 = var6 + ((fc) this).field_e[3 + var2];
                    var10 = var10 + ((fc) this).field_e[var2 + 7];
                    var5 = var5 + ((fc) this).field_e[var2 + 2];
                    var9 = var9 + ((fc) this).field_e[6 + var2];
                    var8 = var8 + ((fc) this).field_e[var2 - -5];
                    var3 = var3 ^ var4 << 11;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> 2;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
                    var5 = var5 ^ var6 << 8;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> 16;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << 10;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> 4;
                    var3 = var3 + var8;
                    var9 = var9 + var10;
                    var9 = var9 ^ var10 << 8;
                    var10 = var10 + var3;
                    var4 = var4 + var9;
                    var10 = var10 ^ var3 >>> 9;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    ((fc) this).field_e[var2] = var3;
                    ((fc) this).field_e[1 + var2] = var4;
                    ((fc) this).field_e[var2 - -2] = var5;
                    ((fc) this).field_e[3 + var2] = var6;
                    ((fc) this).field_e[var2 - -4] = var7;
                    ((fc) this).field_e[var2 + 5] = var8;
                    ((fc) this).field_e[var2 - -6] = var9;
                    ((fc) this).field_e[var2 - -7] = var10;
                    var2 += 8;
                    continue L2;
                  }
                }
              } else {
                var8 = var8 + ((fc) this).field_b[var2 + 5];
                var3 = var3 + ((fc) this).field_b[var2];
                var5 = var5 + ((fc) this).field_b[var2 + 2];
                var4 = var4 + ((fc) this).field_b[1 + var2];
                var7 = var7 + ((fc) this).field_b[var2 + 4];
                var10 = var10 + ((fc) this).field_b[var2 - -7];
                var6 = var6 + ((fc) this).field_b[3 + var2];
                var9 = var9 + ((fc) this).field_b[var2 + 6];
                var3 = var3 ^ var4 << 11;
                var6 = var6 + var3;
                var4 = var4 + var5;
                var4 = var4 ^ var5 >>> 2;
                var7 = var7 + var4;
                var5 = var5 + var6;
                var5 = var5 ^ var6 << 8;
                var8 = var8 + var5;
                var6 = var6 + var7;
                var6 = var6 ^ var7 >>> 16;
                var7 = var7 + var8;
                var9 = var9 + var6;
                var7 = var7 ^ var8 << 10;
                var10 = var10 + var7;
                var8 = var8 + var9;
                var8 = var8 ^ var9 >>> 4;
                var3 = var3 + var8;
                var9 = var9 + var10;
                var9 = var9 ^ var10 << 8;
                var4 = var4 + var9;
                var10 = var10 + var3;
                var10 = var10 ^ var3 >>> 9;
                var3 = var3 + var4;
                var5 = var5 + var10;
                ((fc) this).field_e[var2] = var3;
                ((fc) this).field_e[var2 + 1] = var4;
                ((fc) this).field_e[var2 + 2] = var5;
                ((fc) this).field_e[var2 - -3] = var6;
                ((fc) this).field_e[var2 + 4] = var7;
                ((fc) this).field_e[var2 - -5] = var8;
                ((fc) this).field_e[6 + var2] = var9;
                ((fc) this).field_e[7 + var2] = var10;
                var2 += 8;
                continue L1;
              }
            }
          } else {
            var3 = var3 ^ var4 << 11;
            var4 = var4 + var5;
            var6 = var6 + var3;
            var4 = var4 ^ var5 >>> 2;
            var7 = var7 + var4;
            var5 = var5 + var6;
            var5 = var5 ^ var6 << 8;
            var6 = var6 + var7;
            var8 = var8 + var5;
            var6 = var6 ^ var7 >>> 16;
            var7 = var7 + var8;
            var9 = var9 + var6;
            var7 = var7 ^ var8 << 10;
            var10 = var10 + var7;
            var8 = var8 + var9;
            var8 = var8 ^ var9 >>> 4;
            var9 = var9 + var10;
            var3 = var3 + var8;
            var9 = var9 ^ var10 << 8;
            var10 = var10 + var3;
            var4 = var4 + var9;
            var10 = var10 ^ var3 >>> 9;
            var5 = var5 + var10;
            var3 = var3 + var4;
            var2++;
            continue L0;
          }
        }
    }

    final static void a(mn param0) {
        RuntimeException var2 = null;
        oi var2_ref = null;
        oi var3 = null;
        int var4 = 0;
        int var5 = 0;
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
        var5 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              var2_ref = (oi) (Object) param0.a(false);
              if (var2_ref == null) {
                return;
              } else {
                var3 = (oi) (Object) param0.a((byte) -30);
                var4 = 1;
                L2: while (true) {
                  if (var3 == null) {
                    if (var4 == 0) {
                      var3 = (oi) (Object) param0.a(59);
                      var2_ref = (oi) (Object) param0.d(2123);
                      var4 = 1;
                      L3: while (true) {
                        if (var2_ref == null) {
                          if (var4 == 0) {
                            continue L1;
                          } else {
                            break L0;
                          }
                        } else {
                          L4: {
                            if (var3.field_p - var3.field_n >= -var2_ref.field_n + var2_ref.field_p) {
                              var3 = var2_ref;
                              break L4;
                            } else {
                              var4 = 0;
                              ri.a((rk) (Object) var3, 0, (rk) (Object) var2_ref);
                              break L4;
                            }
                          }
                          var2_ref = (oi) (Object) param0.d(2123);
                          continue L3;
                        }
                      }
                    } else {
                      return;
                    }
                  } else {
                    L5: {
                      if (var3.field_p - var3.field_n >= -var2_ref.field_n + var2_ref.field_p) {
                        var2_ref = var3;
                        break L5;
                      } else {
                        ri.a((rk) (Object) var3, 0, (rk) (Object) var2_ref);
                        var4 = 0;
                        break L5;
                      }
                    }
                    var3 = (oi) (Object) param0.a((byte) -96);
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var2;
            stackOut_23_1 = new StringBuilder().append("fc.A(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L6;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + 87 + 41);
        }
    }

    public static void a() {
        field_a = null;
        field_d = null;
    }

    final int c(int param0) {
        if (param0 != 256) {
            return 2;
        }
        if (!(((fc) this).field_g != 0)) {
            this.a((byte) -105);
            ((fc) this).field_g = 256;
        }
        int fieldTemp$0 = ((fc) this).field_g - 1;
        ((fc) this).field_g = ((fc) this).field_g - 1;
        return ((fc) this).field_b[fieldTemp$0];
    }

    final static void a(int param0, String[] param1) {
        RuntimeException var2 = null;
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
        try {
          L0: {
            L1: {
              if (null != ki.field_b) {
                ki.field_b.field_O.a((byte) -127, param1);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (null != hb.field_u) {
                hb.field_u.field_H.a((byte) -127, param1);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2;
            stackOut_7_1 = new StringBuilder().append("fc.E(").append(-7212).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
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
          throw sd.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    fc(int[] param0) {
        int var2_int = 0;
        try {
            ((fc) this).field_b = new int[256];
            ((fc) this).field_e = new int[256];
            for (var2_int = 0; param0.length > var2_int; var2_int++) {
                ((fc) this).field_b[var2_int] = param0[var2_int];
            }
            int discarded$0 = -4;
            this.b();
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "fc.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new mn();
        field_f = true;
    }
}
