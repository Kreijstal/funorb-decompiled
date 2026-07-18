/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi extends mc {
    private int field_m;
    private long field_u;
    private long[] field_w;
    static la[] field_t;
    private int field_r;
    private long field_v;
    private long field_p;
    static int[] field_q;
    static String field_o;
    static boolean field_n;
    static int field_s;

    final static boolean c(int param0) {
        RuntimeException var1 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              if (param0 == 2915) {
                break L1;
              } else {
                vi.c((byte) 16);
                break L1;
              }
            }
            stackOut_3_0 = tf.field_f;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "vi.F(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final static kk a(byte param0, ml param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        kk var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        Object stackIn_35_0 = null;
        kk stackIn_37_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        kk stackOut_36_0 = null;
        Object stackOut_34_0 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            var2_int = param1.l(8, 59);
            if (var2_int > 0) {
              throw new IllegalStateException("" + var2_int);
            } else {
              L1: {
                var3 = mu.a(param1, (byte) -39) ? 1 : 0;
                var4 = mu.a(param1, (byte) -39) ? 1 : 0;
                var5 = new kk();
                var5.field_b = (short)param1.l(16, 59);
                var5.field_f = nq.a(var5.field_f, param1, 16, -72);
                var5.field_r = nq.a(var5.field_r, param1, 16, -61);
                var5.field_P = nq.a(var5.field_P, param1, 16, -92);
                var5.field_g = (short)param1.l(16, 59);
                var5.field_n = nq.a(var5.field_n, param1, 16, 105);
                var5.field_z = nq.a(var5.field_z, param1, 16, 48);
                var5.field_T = nq.a(var5.field_T, param1, 16, 109);
                if (var3 != 0) {
                  var5.field_k = (short)param1.l(16, 59);
                  var5.field_F = nq.a(var5.field_F, param1, 16, -66);
                  var5.field_I = nq.a(var5.field_I, param1, 16, 109);
                  var5.field_v = nq.a(var5.field_v, param1, 16, -79);
                  var5.field_M = nq.a(var5.field_M, param1, 16, 116);
                  var5.field_U = nq.a(var5.field_U, param1, 16, -73);
                  var5.field_l = nq.a(var5.field_l, param1, 16, -106);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var4 != 0) {
                  int discarded$1 = param1.l(16, 59);
                  var5.field_p = nq.a(var5.field_p, param1, 16, 116);
                  var5.field_E = nq.a(var5.field_E, param1, 16, -104);
                  var5.field_N = nq.a(var5.field_N, param1, 16, -76);
                  var5.field_i = nq.a(var5.field_i, param1, 16, -65);
                  var5.field_K = nq.a(var5.field_K, param1, 16, -87);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (mu.a(param1, (byte) -39)) {
                  var5.field_o = nq.a(var5.field_o, param1, 16, 106);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (!mu.a(param1, (byte) -39)) {
                  break L4;
                } else {
                  var5.field_G = bp.a(2280703, param1, var5.field_G, 16);
                  var6 = 0;
                  var7 = 0;
                  L5: while (true) {
                    L6: {
                      L7: {
                        if (~var5.field_G.length >= ~var7) {
                          break L7;
                        } else {
                          stackOut_20_0 = ~var6;
                          stackOut_20_1 = ~(var5.field_G[var7] & 255);
                          stackIn_27_0 = stackOut_20_0;
                          stackIn_27_1 = stackOut_20_1;
                          stackIn_21_0 = stackOut_20_0;
                          stackIn_21_1 = stackOut_20_1;
                          if (var8 != 0) {
                            break L6;
                          } else {
                            L8: {
                              if (stackIn_21_0 <= stackIn_21_1) {
                                break L8;
                              } else {
                                var6 = 255 & var5.field_G[var7];
                                break L8;
                              }
                            }
                            var7++;
                            if (var8 == 0) {
                              continue L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      stackOut_26_0 = -1;
                      stackOut_26_1 = ~var6;
                      stackIn_27_0 = stackOut_26_0;
                      stackIn_27_1 = stackOut_26_1;
                      break L6;
                    }
                    L9: {
                      if (stackIn_27_0 != stackIn_27_1) {
                        break L9;
                      } else {
                        var5.field_G = null;
                        if (var8 == 0) {
                          break L4;
                        } else {
                          break L9;
                        }
                      }
                    }
                    var5.field_u = (byte)(1 + var6);
                    break L4;
                  }
                }
              }
              if (param0 > 54) {
                stackOut_36_0 = (kk) var5;
                stackIn_37_0 = stackOut_36_0;
                break L0;
              } else {
                stackOut_34_0 = null;
                stackIn_35_0 = stackOut_34_0;
                return (kk) (Object) stackIn_35_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var2;
            stackOut_38_1 = new StringBuilder().append("vi.I(").append(param0).append(',');
            stackIn_41_0 = stackOut_38_0;
            stackIn_41_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param1 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L10;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_42_0 = stackOut_39_0;
              stackIn_42_1 = stackOut_39_1;
              stackIn_42_2 = stackOut_39_2;
              break L10;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + ')');
        }
        return stackIn_37_0;
    }

    final static boolean a(int param0, int param1, int[][] param2, byte[] param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_31_0 = 0;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var9 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param1 >= 123) {
                break L1;
              } else {
                vi.c((byte) 59);
                break L1;
              }
            }
            L2: {
              L3: {
                if (param2 != null) {
                  var4_int = 0;
                  L4: while (true) {
                    if (~var4_int <= ~param2.length) {
                      break L3;
                    } else {
                      var5 = param2[var4_int];
                      stackOut_9_0 = 0;
                      stackIn_32_0 = stackOut_9_0;
                      stackIn_10_0 = stackOut_9_0;
                      if (var9 != 0) {
                        break L2;
                      } else {
                        var6 = stackIn_10_0;
                        L5: while (true) {
                          L6: {
                            L7: {
                              if (var6 >= var5.length) {
                                break L7;
                              } else {
                                var7 = var5[var6];
                                var8 = var5[1 + var6];
                                stackOut_12_0 = 0;
                                stackIn_29_0 = stackOut_12_0;
                                stackIn_13_0 = stackOut_12_0;
                                if (var9 != 0) {
                                  break L6;
                                } else {
                                  L8: {
                                    L9: {
                                      if (stackIn_13_0 == ~var7) {
                                        if (var8 == param0) {
                                          break L8;
                                        } else {
                                          if (var9 == 0) {
                                            break L9;
                                          } else {
                                            break L8;
                                          }
                                        }
                                      } else {
                                        if (~var8 != ~(255 & param3[var7])) {
                                          break L9;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                    var4_int++;
                                    if (var9 == 0) {
                                      continue L4;
                                    } else {
                                      break L3;
                                    }
                                  }
                                  var6 += 2;
                                  if (var9 == 0) {
                                    continue L5;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            stackOut_28_0 = 1;
                            stackIn_29_0 = stackOut_28_0;
                            break L6;
                          }
                          return stackIn_29_0 != 0;
                        }
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
              stackOut_31_0 = 0;
              stackIn_32_0 = stackOut_31_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var4;
            stackOut_33_1 = new StringBuilder().append("vi.H(").append(param0).append(',').append(param1).append(',');
            stackIn_36_0 = stackOut_33_0;
            stackIn_36_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param2 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L10;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_37_0 = stackOut_34_0;
              stackIn_37_1 = stackOut_34_1;
              stackIn_37_2 = stackOut_34_2;
              break L10;
            }
          }
          L11: {
            stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
            stackOut_37_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',');
            stackIn_40_0 = stackOut_37_0;
            stackIn_40_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param3 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L11;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_41_0 = stackOut_38_0;
              stackIn_41_1 = stackOut_38_1;
              stackIn_41_2 = stackOut_38_2;
              break L11;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + ')');
        }
        return stackIn_32_0 != 0;
    }

    final static void c(byte param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var1_int = -1;
              if (param0 == -59) {
                break L1;
              } else {
                field_t = null;
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  if (null == um.field_e) {
                    break L4;
                  } else {
                    if (um.field_e.field_A) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                if (null == sr.field_l) {
                  break L2;
                } else {
                  var1_int = sr.field_l.f(123);
                  if (Kickabout.field_G == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var1_int = um.field_e.field_B;
              break L2;
            }
            if (-1 != var1_int) {
              or.field_d.b(88, (byte) -46);
              or.field_d.a(127, var1_int);
              an.field_d = true;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw nb.a((Throwable) (Object) runtimeException, "vi.B(" + param0 + ')');
        }
    }

    final long b(byte param0) {
        RuntimeException var2 = null;
        long stackIn_7_0 = 0L;
        long stackIn_9_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        long stackOut_6_0 = 0L;
        long stackOut_8_0 = 0L;
        try {
          L0: {
            L1: {
              ((vi) this).field_p = ((vi) this).field_p + this.a(false);
              if (param0 == -36) {
                break L1;
              } else {
                field_n = true;
                break L1;
              }
            }
            if (~((vi) this).field_p > ~((vi) this).field_v) {
              stackOut_6_0 = (-((vi) this).field_p + ((vi) this).field_v) / 1000000L;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              stackOut_8_0 = 0L;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "vi.E(" + param0 + ')');
        }
        return stackIn_9_0;
    }

    final void b(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((vi) this).field_u = 0L;
              if (param0 == -1) {
                break L1;
              } else {
                field_s = -62;
                break L1;
              }
            }
            L2: {
              if (~((vi) this).field_v >= ~((vi) this).field_p) {
                break L2;
              } else {
                ((vi) this).field_p = ((vi) this).field_p + (-((vi) this).field_p + ((vi) this).field_v);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "vi.A(" + param0 + ')');
        }
    }

    private final long a(boolean param0) {
        long var2_long = 0L;
        RuntimeException var2 = null;
        long var4 = 0L;
        long var6 = 0L;
        int var8 = 0;
        int var9 = 0;
        long stackIn_12_0 = 0L;
        long stackIn_16_0 = 0L;
        long stackIn_18_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        long stackOut_15_0 = 0L;
        long stackOut_17_0 = 0L;
        long stackOut_11_0 = 0L;
        var9 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var2_long = System.nanoTime();
              var4 = -((vi) this).field_u + var2_long;
              ((vi) this).field_u = var2_long;
              if (var4 <= -5000000000L) {
                break L1;
              } else {
                if (5000000000L <= var4) {
                  break L1;
                } else {
                  ((vi) this).field_w[((vi) this).field_m] = var4;
                  ((vi) this).field_m = (((vi) this).field_m + 1) % 10;
                  if (((vi) this).field_r >= 1) {
                    break L1;
                  } else {
                    ((vi) this).field_r = ((vi) this).field_r + 1;
                    break L1;
                  }
                }
              }
            }
            var6 = 0L;
            if (!param0) {
              var8 = 1;
              L2: while (true) {
                L3: {
                  L4: {
                    if (((vi) this).field_r < var8) {
                      break L4;
                    } else {
                      stackOut_15_0 = var6 + ((vi) this).field_w[(10 + ((vi) this).field_m + -var8) % 10];
                      stackIn_18_0 = stackOut_15_0;
                      stackIn_16_0 = stackOut_15_0;
                      if (var9 != 0) {
                        break L3;
                      } else {
                        var6 = stackIn_16_0;
                        var8++;
                        if (var9 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  stackOut_17_0 = var6 / (long)((vi) this).field_r;
                  stackIn_18_0 = stackOut_17_0;
                  break L3;
                }
                break L0;
              }
            } else {
              stackOut_11_0 = -97L;
              stackIn_12_0 = stackOut_11_0;
              return stackIn_12_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "vi.D(" + param0 + ')');
        }
        return stackIn_18_0;
    }

    public static void d(int param0) {
        if (param0 < 4) {
            return;
        }
        try {
            field_t = null;
            field_q = null;
            field_o = null;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "vi.G(" + param0 + ')');
        }
    }

    final int a(int param0, long param1) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        var6 = Kickabout.field_G;
        try {
          L0: {
            var4_int = 78 % ((param0 - 45) / 63);
            if (((vi) this).field_p < ((vi) this).field_v) {
              ((vi) this).field_u = ((vi) this).field_u + (((vi) this).field_v - ((vi) this).field_p);
              ((vi) this).field_p = ((vi) this).field_p + (-((vi) this).field_p + ((vi) this).field_v);
              ((vi) this).field_v = ((vi) this).field_v + param1;
              stackOut_12_0 = 1;
              stackIn_13_0 = stackOut_12_0;
              break L0;
            } else {
              var5 = 0;
              L1: while (true) {
                ((vi) this).field_v = ((vi) this).field_v + param1;
                var5++;
                stackOut_3_0 = -11;
                stackIn_4_0 = stackOut_3_0;
                L2: while (true) {
                  L3: {
                    if (stackIn_4_0 >= ~var5) {
                      break L3;
                    } else {
                      if (~((vi) this).field_v > ~((vi) this).field_p) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackOut_6_0 = (~((vi) this).field_p < ~((vi) this).field_v ? -1 : (~((vi) this).field_p == ~((vi) this).field_v ? 0 : 1));
                  stackIn_4_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (var6 != 0) {
                    continue L2;
                  } else {
                    L4: {
                      if (stackIn_7_0 >= 0) {
                        break L4;
                      } else {
                        ((vi) this).field_v = ((vi) this).field_p;
                        break L4;
                      }
                    }
                    stackOut_10_0 = var5;
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var4, "vi.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_13_0;
    }

    vi() {
        ((vi) this).field_u = 0L;
        ((vi) this).field_m = 0;
        ((vi) this).field_r = 1;
        ((vi) this).field_p = 0L;
        ((vi) this).field_v = 0L;
        ((vi) this).field_w = new long[10];
        try {
            ((vi) this).field_p = System.nanoTime();
            ((vi) this).field_v = System.nanoTime();
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "vi.<init>()");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new int[4];
        field_t = new la[]{new la(0, 0, 896, 1344), new la(370, -45, 525, 1389, 0, 45)};
        field_n = false;
        field_o = "<%0>: Unread Chat";
    }
}
