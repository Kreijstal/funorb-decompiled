/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc {
    private String field_d;
    int field_l;
    int field_f;
    private static int[] field_c;
    String field_h;
    private long field_k;
    private int field_m;
    private boolean field_g;
    int field_j;
    int[] field_i;
    static int field_b;
    static int field_a;
    static rj field_n;
    static String[] field_e;

    public static void a(byte param0) {
        if (param0 != -117) {
            return;
        }
        try {
            field_c = null;
            field_n = null;
            field_e = null;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "dc.C(" + param0 + ')');
        }
    }

    final static short[] a(int param0, short[] param1, int param2, uc param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_29_0 = null;
        short[] stackIn_31_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_28_0 = null;
        short[] stackOut_30_0 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var8 = Terraphoenix.field_V;
        try {
          L0: {
            var4_int = param3.a(false, param2);
            if (var4_int == 0) {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (short[]) (Object) stackIn_5_0;
            } else {
              L1: {
                L2: {
                  if (null == param1) {
                    break L2;
                  } else {
                    if (~var4_int != ~param1.length) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                param1 = new short[var4_int];
                break L1;
              }
              L3: {
                L4: {
                  L5: {
                    var5 = param3.a(false, 4);
                    var6 = (short)param3.a(false, 16);
                    if (var5 <= 0) {
                      break L5;
                    } else {
                      var7 = 0;
                      L6: while (true) {
                        L7: {
                          if (~var4_int >= ~var7) {
                            break L7;
                          } else {
                            param1[var7] = (short)(var6 + param3.a(false, var5));
                            var7++;
                            if (var8 != 0) {
                              break L4;
                            } else {
                              if (var8 == 0) {
                                continue L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        if (var8 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  var7 = 0;
                  L8: while (true) {
                    if (var4_int <= var7) {
                      break L4;
                    } else {
                      param1[var7] = (short) var6;
                      var7++;
                      if (var8 != 0) {
                        break L3;
                      } else {
                        if (var8 == 0) {
                          continue L8;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                if (param0 == -25076) {
                  break L3;
                } else {
                  stackOut_28_0 = null;
                  stackIn_29_0 = stackOut_28_0;
                  return (short[]) (Object) stackIn_29_0;
                }
              }
              stackOut_30_0 = (short[]) param1;
              stackIn_31_0 = stackOut_30_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var4;
            stackOut_32_1 = new StringBuilder().append("dc.D(").append(param0).append(',');
            stackIn_35_0 = stackOut_32_0;
            stackIn_35_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param1 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L9;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_36_0 = stackOut_33_0;
              stackIn_36_1 = stackOut_33_1;
              stackIn_36_2 = stackOut_33_2;
              break L9;
            }
          }
          L10: {
            stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
            stackOut_36_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',').append(param2).append(',');
            stackIn_39_0 = stackOut_36_0;
            stackIn_39_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param3 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L10;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_40_0 = stackOut_37_0;
              stackIn_40_1 = stackOut_37_1;
              stackIn_40_2 = stackOut_37_2;
              break L10;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + ')');
        }
        return stackIn_31_0;
    }

    final int a(int param0) {
        RuntimeException var2 = null;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              if (((dc) this).field_g) {
                break L1;
              } else {
                L2: {
                  if (((dc) this).field_l != 2) {
                    break L2;
                  } else {
                    if (((dc) this).field_m > 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (~((dc) this).field_k == ~fb.field_i) {
                  stackOut_14_0 = 1;
                  stackIn_15_0 = stackOut_14_0;
                  return stackIn_15_0;
                } else {
                  if (param0 == 2) {
                    L3: {
                      if (jg.field_gb != 2) {
                        break L3;
                      } else {
                        if (!b.a(true, ((dc) this).field_d)) {
                          break L3;
                        } else {
                          stackOut_23_0 = 1;
                          stackIn_24_0 = stackOut_23_0;
                          return stackIn_24_0;
                        }
                      }
                    }
                    stackOut_25_0 = 0;
                    stackIn_26_0 = stackOut_25_0;
                    break L0;
                  } else {
                    stackOut_17_0 = 57;
                    stackIn_18_0 = stackOut_17_0;
                    return stackIn_18_0;
                  }
                }
              }
            }
            stackOut_9_0 = 2;
            stackIn_10_0 = stackOut_9_0;
            return stackIn_10_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var2, "dc.A(" + param0 + ')');
        }
        return stackIn_26_0;
    }

    final static int b(byte param0) {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 30) {
                break L1;
              } else {
                field_a = 20;
                break L1;
              }
            }
            stackOut_3_0 = 1;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var1, "dc.B(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    dc(boolean param0) {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                ((dc) this).field_f = wb.field_c;
                ((dc) this).field_h = ea.field_n;
                ((dc) this).field_k = pl.field_Q;
                ((dc) this).field_d = wh.field_a;
                ((dc) this).field_j = ji.field_k;
                if (param0) {
                  break L2;
                } else {
                  ((dc) this).field_i = null;
                  if (Terraphoenix.field_V == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((dc) this).field_i = ui.field_e;
              break L1;
            }
            ((dc) this).field_g = ng.field_s;
            ((dc) this).field_m = da.field_d;
            ((dc) this).field_l = im.field_c;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qk.a((Throwable) (Object) runtimeException, "dc.<init>(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        long var6 = 0L;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        field_c = new int[98304];
        var0 = 92682;
        L0: while (true) {
          if (var0 < 46341) {
            field_e = new String[]{"Unite your forces", "Capture Objectives", "Destroy the enemy", "Research powerful weaponary", "Liberate the cities", "Defend humanity"};
            field_n = new rj();
            return;
          } else {
            L1: {
              var6 = (long)(1 + (var0 << 1709666625));
              var4 = (long)(-1 + (var0 << 1589543457));
              var3 = (int)((var6 * var6 >> -1747006638) + -32768L);
              var2 = (int)(-32768L + (var4 * var4 >> -960922862));
              if (~field_c.length < ~var3) {
                break L1;
              } else {
                var3 = -1 + field_c.length;
                break L1;
              }
            }
            L2: {
              if (0 <= var2) {
                stackOut_7_0 = var2;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_5_0 = 0;
                stackIn_8_0 = stackOut_5_0;
                break L2;
              }
            }
            var1 = stackIn_8_0;
            L3: while (true) {
              if (~var1 < ~var3) {
                var0--;
                continue L0;
              } else {
                field_c[var1] = var0;
                var1++;
                continue L3;
              }
            }
          }
        }
    }
}
