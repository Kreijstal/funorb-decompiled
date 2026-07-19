/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb {
    static String field_h;
    static je field_d;
    boolean field_i;
    int field_k;
    private int[][] field_a;
    int field_b;
    int[] field_l;
    static bh field_j;
    int[] field_f;
    static boolean field_e;
    private int[] field_c;
    static char field_m;
    static boolean field_g;

    final static void a(boolean param0, String param1, long param2) {
        CharSequence var5 = null;
        try {
            ka.field_m = param1;
            sf.field_d = 2;
            var5 = (CharSequence) ((Object) param1);
            qj.field_a = cc.a(var5, (byte) 114);
            vj.field_o = param2;
            if (param0) {
                field_h = (String) null;
            }
            cl.field_e = true;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "tb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void a(boolean param0, bh param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        bh var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var4 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                var5 = (bh) null;
                this.a(-64, (byte) 59, (bh) null);
                break L1;
              }
            }
            L2: while (true) {
              var3_int = param1.d((byte) -99);
              if (0 == var3_int) {
                break L0;
              } else {
                this.a(var3_int, (byte) -5, param1);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var3);
            stackOut_6_1 = new StringBuilder().append("tb.E(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    tb(ah param0, String param1, String param2) {
        this(param0, param0.a(-1, param1), param2);
    }

    final static void a(int param0, int param1) {
        bc var2 = nd.field_Lb;
        var2.f(param0, (byte) -92);
        var2.a(1, false);
        if (param1 != -15289) {
            field_j = (bh) null;
        }
        var2.a(1, false);
    }

    private tb(ah param0, int param1, String param2) {
        this(param0, param1, param0.a(param1, false, param2));
    }

    public static void a(byte param0) {
        field_d = null;
        field_j = null;
        field_h = null;
        if (param0 >= -112) {
            field_d = (je) null;
        }
    }

    private final void a(int param0, byte param1, bh param2) {
        int discarded$9 = 0;
        int discarded$10 = 0;
        int[] array$11 = null;
        int discarded$12 = 0;
        int discarded$13 = 0;
        int discarded$14 = 0;
        int discarded$15 = 0;
        int discarded$16 = 0;
        int discarded$17 = 0;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        var8 = TetraLink.field_J;
        try {
          L0: {
            if (param1 == -5) {
              L1: {
                if ((param0 ^ -1) == -2) {
                  var4_int = param2.e(param1 + 132);
                  this.field_l = new int[var4_int];
                  var5 = 0;
                  L2: while (true) {
                    if (var5 >= var4_int) {
                      this.field_f = new int[var4_int];
                      var5 = 0;
                      L3: while (true) {
                        if (var5 >= var4_int) {
                          var5 = 0;
                          L4: while (true) {
                            if (var5 >= var4_int) {
                              break L1;
                            } else {
                              this.field_f[var5] = (param2.e(127) << -1383875824) + this.field_f[var5];
                              var5++;
                              continue L4;
                            }
                          }
                        } else {
                          this.field_f[var5] = param2.e(127);
                          var5++;
                          continue L3;
                        }
                      }
                    } else {
                      this.field_l[var5] = param2.e(127);
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  if (-3 == (param0 ^ -1)) {
                    this.field_k = param2.e(127);
                    break L1;
                  } else {
                    if ((param0 ^ -1) == -4) {
                      var4_int = param2.d((byte) -99);
                      this.field_c = new int[var4_int + 1];
                      var5 = 0;
                      L5: while (true) {
                        if (var4_int <= var5) {
                          this.field_c[var4_int] = 9999999;
                          break L1;
                        } else {
                          this.field_c[var5] = param2.d((byte) -99);
                          var5++;
                          continue L5;
                        }
                      }
                    } else {
                      if ((param0 ^ -1) == -6) {
                        discarded$9 = param2.d((byte) -99);
                        break L1;
                      } else {
                        if ((param0 ^ -1) != -7) {
                          if (param0 != 7) {
                            if (8 != param0) {
                              if ((param0 ^ -1) == -10) {
                                discarded$10 = param2.d((byte) -99);
                                break L1;
                              } else {
                                if (param0 != 10) {
                                  if (-12 != (param0 ^ -1)) {
                                    if (12 != param0) {
                                      if (13 == param0) {
                                        var4_int = param2.e(127);
                                        this.field_a = new int[var4_int][];
                                        var5 = 0;
                                        L6: while (true) {
                                          if (var4_int <= var5) {
                                            break L1;
                                          } else {
                                            L7: {
                                              var6 = param2.d((byte) -99);
                                              if (var6 > 0) {
                                                array$11 = new int[var6];
                                                this.field_a[var5] = array$11;
                                                this.field_a[var5][0] = param2.d(-1);
                                                var7 = 1;
                                                L8: while (true) {
                                                  if (var6 <= var7) {
                                                    break L7;
                                                  } else {
                                                    this.field_a[var5][var7] = param2.e(127);
                                                    var7++;
                                                    continue L8;
                                                  }
                                                }
                                              } else {
                                                break L7;
                                              }
                                            }
                                            var5++;
                                            continue L6;
                                          }
                                        }
                                      } else {
                                        if (param0 == 14) {
                                          break L1;
                                        } else {
                                          if (-16 != (param0 ^ -1)) {
                                            if (16 == param0) {
                                              break L1;
                                            } else {
                                              if ((param0 ^ -1) == -19) {
                                                break L1;
                                              } else {
                                                break L1;
                                              }
                                            }
                                          } else {
                                            break L1;
                                          }
                                        }
                                      }
                                    } else {
                                      var4_int = param2.d((byte) -99);
                                      var5 = 0;
                                      L9: while (true) {
                                        if (var5 >= var4_int) {
                                          var5 = 0;
                                          L10: while (true) {
                                            if (var5 >= var4_int) {
                                              break L1;
                                            } else {
                                              discarded$12 = param2.e(param1 ^ -124);
                                              var5++;
                                              continue L10;
                                            }
                                          }
                                        } else {
                                          discarded$13 = param2.e(127);
                                          var5++;
                                          continue L9;
                                        }
                                      }
                                    }
                                  } else {
                                    discarded$14 = param2.d((byte) -99);
                                    break L1;
                                  }
                                } else {
                                  discarded$15 = param2.d((byte) -99);
                                  break L1;
                                }
                              }
                            } else {
                              this.field_b = param2.d((byte) -99);
                              this.field_i = false;
                              break L1;
                            }
                          } else {
                            discarded$16 = param2.e(127);
                            break L1;
                          }
                        } else {
                          discarded$17 = param2.e(127);
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) (var4);
            stackOut_57_1 = new StringBuilder().append("tb.C(").append(param0).append(',').append(param1).append(',');
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param2 == null) {
              stackOut_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackOut_59_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L11;
            } else {
              stackOut_58_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackOut_58_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackOut_58_2 = "{...}";
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              break L11;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_60_0), stackIn_60_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(boolean param0, long param1) {
        if (!(param1 > 0L)) {
            return;
        }
        if (param0) {
            tb.a(false, (String) null, -3L);
        }
        if (-1L != (param1 % 10L ^ -1L)) {
            uj.a(param1, -568127903);
        } else {
            uj.a(-1L + param1, -568127903);
            uj.a(1L, -568127903);
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            var7 = -92 / ((-53 - param6) / 49);
            if (param3 < param1) {
              break L1;
            } else {
              if (param3 >= param1 + param4) {
                break L1;
              } else {
                if (param0 < param2) {
                  break L1;
                } else {
                  if (param0 >= param5 + param2) {
                    break L1;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L0;
                  }
                }
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_6_0 != 0;
    }

    private tb(ah param0, int param1, int param2) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        this.field_k = -1;
        this.field_b = 0;
        try {
          L0: {
            L1: {
              this.field_i = true;
              var11 = param0.a(3, param2, param1);
              var10 = var11;
              var9 = var10;
              var4 = var9;
              if (var9 == null) {
                break L1;
              } else {
                this.a(true, new bh(var11));
                break L1;
              }
            }
            var5 = 0;
            var6 = 0;
            L2: while (true) {
              if (this.field_f.length <= var6) {
                var6 = 0;
                var7 = 0;
                L3: while (true) {
                  if (this.field_l.length <= var7) {
                    break L0;
                  } else {
                    L4: {
                      if (var6 >= this.field_l[var7]) {
                        break L4;
                      } else {
                        var6 = this.field_l[var7];
                        break L4;
                      }
                    }
                    var7++;
                    continue L3;
                  }
                }
              } else {
                L5: {
                  if (this.field_f[var6] <= var5) {
                    break L5;
                  } else {
                    var5 = this.field_f[var6];
                    break L5;
                  }
                }
                var6++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var4_ref);
            stackOut_14_1 = new StringBuilder().append("tb.<init>(");
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
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_h = "Email is valid";
        field_d = new je();
        field_j = new bh(256);
        field_e = true;
    }
}
