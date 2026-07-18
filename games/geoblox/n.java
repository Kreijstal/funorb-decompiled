/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class n extends q {
    private dj field_i;
    static vd[] field_k;
    static tf field_l;
    static int field_j;

    n(dj param0, dj param1) {
        super(param0);
        try {
            ((n) this).field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "n.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void g(int param0) {
        field_l = null;
        field_k = null;
        if (param0 != 0) {
            n.c((byte) 89);
        }
    }

    final static dm[] a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        int var9 = 0;
        dm[] var10 = null;
        dm[] var11_ref_dm__ = null;
        int var11 = 0;
        int var12 = 0;
        dm var13 = null;
        int var14 = 0;
        int var15 = 0;
        var15 = Geoblox.field_C;
        var9 = 3;
        var10 = new dm[]{new dm(var9, var9), new dm(3, var9), new dm(var9, var9), new dm(var9, 3), new dm(64, 64), new dm(var9, 3), new dm(var9, var9), new dm(3, var9), new dm(var9, var9)};
        var11_ref_dm__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var12 >= var11_ref_dm__.length) {
            var11 = 0;
            L1: while (true) {
              if (var11 >= 1) {
                var11 = 0;
                L2: while (true) {
                  if (var11 >= 1) {
                    var11 = 0;
                    L3: while (true) {
                      if (var11 >= 3) {
                        var11 = 0;
                        L4: while (true) {
                          if (var11 >= 1) {
                            return var10;
                          } else {
                            var12 = 0;
                            L5: while (true) {
                              if (var12 >= 1) {
                                var11++;
                                continue L4;
                              } else {
                                var10[1].field_v[3 * (-1 + (-var12 + var9)) - -var11] = param0;
                                var10[3].field_v[-1 - -var9 + (-var12 + var9 * var11)] = param0;
                                var10[7].field_v[var11 + 3 * var12] = param0;
                                var10[5].field_v[var9 * var11 - -var12] = param0;
                                var12++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = 0;
                        L6: while (true) {
                          if (1 <= var12) {
                            var11++;
                            continue L3;
                          } else {
                            var10[7].field_v[3 * (var9 - var12 - 1) + var11] = param6;
                            var10[5].field_v[-1 + (var9 - var12 + var11 * var9)] = param6;
                            var10[1].field_v[3 * var12 - -var11] = param2;
                            var10[3].field_v[var12 + var9 * var11] = param2;
                            var12++;
                            continue L6;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L7: while (true) {
                      if (~var9 >= ~var12) {
                        var11++;
                        continue L2;
                      } else {
                        L8: {
                          var10[0].field_v[var12 - -(var11 * var9)] = param2;
                          var10[0].field_v[var11 + var12 * var9] = param2;
                          if (~(-var11 + var9) >= ~var12) {
                            break L8;
                          } else {
                            var10[2].field_v[var9 * var11 + var12] = param2;
                            var10[6].field_v[var11 + var12 * var9] = param2;
                            break L8;
                          }
                        }
                        var12++;
                        continue L7;
                      }
                    }
                  }
                }
              } else {
                var12 = 0;
                L9: while (true) {
                  if (var9 <= var12) {
                    var11++;
                    continue L1;
                  } else {
                    var10[6].field_v[var12 + (var9 - var11 + -1) * var9] = param6;
                    var10[8].field_v[var12 + (-1 + -var11 + var9) * var9] = param6;
                    var10[2].field_v[var12 * var9 + -var11 + var9 + -1] = param6;
                    var10[8].field_v[-var11 - 1 - (-var9 - var9 * var12)] = param6;
                    var12++;
                    continue L9;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_dm__[var12];
            var14 = 0;
            L10: while (true) {
              if (~var13.field_v.length >= ~var14) {
                var12++;
                continue L0;
              } else {
                var13.field_v[var14] = param5;
                var14++;
                continue L10;
              }
            }
          }
        }
    }

    final static void c(byte param0) {
        if (!(Geoblox.field_y == null)) {
            Geoblox.field_y.h((byte) -104);
        }
        vk.field_d = new hi();
        int var1 = 32 / ((param0 - 43) / 47);
        hk.field_C.b((el) (Object) vk.field_d, -106);
    }

    final lh a(int param0, String param1) {
        dg var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        lh stackIn_9_0 = null;
        lh stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        lh stackOut_8_0 = null;
        lh stackOut_12_0 = null;
        lh stackOut_11_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (param0 == -257) {
              L1: {
                if (((n) this).field_i instanceof nl) {
                  var3 = ((nl) (Object) ((n) this).field_i).a((byte) -106);
                  if (var3 == null) {
                    break L1;
                  } else {
                    if (var3.a((byte) -105) != kk.field_w) {
                      stackOut_8_0 = si.field_m;
                      stackIn_9_0 = stackOut_8_0;
                      return stackIn_9_0;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (!param1.equals((Object) (Object) ((n) this).field_i.field_s)) {
                  stackOut_12_0 = si.field_m;
                  stackIn_13_0 = stackOut_12_0;
                  break L2;
                } else {
                  stackOut_11_0 = kk.field_w;
                  stackIn_13_0 = stackOut_11_0;
                  break L2;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (lh) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("n.D(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_13_0;
    }

    final String b(int param0, String param1) {
        dg var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        String stackOut_9_0 = null;
        String stackOut_13_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 422) {
                break L1;
              } else {
                field_l = null;
                break L1;
              }
            }
            L2: {
              if (!(((n) this).field_i instanceof nl)) {
                break L2;
              } else {
                var3 = ((nl) (Object) ((n) this).field_i).a((byte) -118);
                if (var3 == null) {
                  break L2;
                } else {
                  L3: {
                    if (var3.a((byte) -105) != kk.field_w) {
                      break L3;
                    } else {
                      if (!param1.equals((Object) (Object) ((n) this).field_i.field_s)) {
                        stackOut_7_0 = sj.field_b;
                        stackIn_8_0 = stackOut_7_0;
                        return stackIn_8_0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackOut_9_0 = var3.c(-21666);
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              }
            }
            if (!param1.equals((Object) (Object) ((n) this).field_i.field_s)) {
              stackOut_13_0 = sj.field_b;
              stackIn_14_0 = stackOut_13_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3_ref;
            stackOut_16_1 = new StringBuilder().append("n.A(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
        return stackIn_14_0;
    }

    final static sl d() {
        if (!(uf.field_l != kd.field_b)) {
            throw new IllegalStateException();
        }
        int var1 = 1;
        if (va.field_e != kd.field_b) {
            return null;
        }
        kd.field_b = uf.field_l;
        return dl.field_a;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new tf();
    }
}
