/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class me {
    static bi field_h;
    static boolean field_a;
    static String field_c;
    fs[] field_i;
    static qr field_d;
    fs[] field_g;
    static String field_f;
    static boolean field_j;
    static int field_e;
    private boolean[] field_b;

    abstract int b(boolean param0);

    abstract void a(ob param0, byte param1);

    final static boolean a(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 >= 19) {
            break L0;
          } else {
            field_e = 28;
            break L0;
          }
        }
        L1: {
          L2: {
            int discarded$7 = 29443;
            if (!qh.f()) {
              break L2;
            } else {
              if (0 != (8 & cl.field_n)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    abstract fs[] b(int param0);

    public static void a() {
        field_d = null;
        field_f = null;
        field_h = null;
        field_c = null;
    }

    boolean a(dc param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        Object var4 = null;
        fs[] var5_ref_fs__ = null;
        int var5 = 0;
        int var6 = 0;
        fs var7_ref_fs = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_37_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_28_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var4 = null;
            var5_ref_fs__ = ((me) this).field_i;
            if (param1 >= 23) {
              var6 = 0;
              L1: while (true) {
                if (var5_ref_fs__.length <= var6) {
                  if (var3_int != 0) {
                    if (var3_int == 1) {
                      ((me) this).field_g = new fs[]{(fs) var4};
                      stackOut_28_0 = 1;
                      stackIn_29_0 = stackOut_28_0;
                      return stackIn_29_0 != 0;
                    } else {
                      var9 = 0;
                      var5 = var9;
                      L2: while (true) {
                        if (((me) this).field_i.length <= var9) {
                          stackOut_36_0 = 0;
                          stackIn_37_0 = stackOut_36_0;
                          break L0;
                        } else {
                          L3: {
                            if (!((me) this).field_i[var9].field_i.g(88)) {
                              ((me) this).field_b[var9] = true;
                              break L3;
                            } else {
                              ((me) this).field_b[var9] = false;
                              break L3;
                            }
                          }
                          var9++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    var5 = 0;
                    var6 = 0;
                    L4: while (true) {
                      if (var6 >= ((me) this).field_i.length) {
                        if (0 < var5) {
                          ((me) this).field_g = new fs[var5];
                          var6 = 0;
                          var7 = 0;
                          L5: while (true) {
                            if (var7 >= ((me) this).field_i.length) {
                              stackOut_24_0 = 1;
                              stackIn_25_0 = stackOut_24_0;
                              return stackIn_25_0 != 0;
                            } else {
                              L6: {
                                if (!((me) this).field_b[var7]) {
                                  break L6;
                                } else {
                                  break L6;
                                }
                              }
                              var7++;
                              continue L5;
                            }
                          }
                        } else {
                          return true;
                        }
                      } else {
                        L7: {
                          if (!((me) this).field_b[var6]) {
                            break L7;
                          } else {
                            if ((param0.field_f & 1 << var6) != 0) {
                              break L7;
                            } else {
                              var5++;
                              break L7;
                            }
                          }
                        }
                        var6++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  L8: {
                    var7_ref_fs = var5_ref_fs__[var6];
                    if (var7_ref_fs.field_i.g(-96)) {
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  var6++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var3;
            stackOut_38_1 = new StringBuilder().append("me.F(");
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param0 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L9;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L9;
            }
          }
          throw r.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + 44 + param1 + 41);
        }
        return stackIn_37_0 != 0;
    }

    final boolean a(byte param0, fs param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        fs[] var4 = null;
        int var5 = 0;
        fs var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (((me) this).field_g != null) {
              var3_int = 75 / ((9 - param0) / 56);
              var4 = ((me) this).field_g;
              var5 = 0;
              L1: while (true) {
                if (var5 >= var4.length) {
                  stackOut_11_0 = 1;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  var6 = var4[var5];
                  if (param1 == var6) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0 != 0;
                  } else {
                    var5++;
                    continue L1;
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("me.M(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_12_0 != 0;
    }

    abstract void a(int param0, ob param1);

    final fs[] a(byte param0) {
        if (param0 != -23) {
            Object var3 = null;
            int discarded$0 = me.a(-73, (byte[]) null, -98);
        }
        return ((me) this).field_g;
    }

    abstract void a(byte param0, dc param1, kq param2);

    final static int a(int param0, byte[] param1, int param2) {
        RuntimeException var3 = null;
        Object var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 >= 50) {
                break L1;
              } else {
                var4 = null;
                int discarded$2 = me.a(-118, (byte[]) null, -21);
                break L1;
              }
            }
            stackOut_2_0 = bs.a(param2, param1, (byte) -53, 0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("me.O(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param2 + 41);
        }
        return stackIn_3_0;
    }

    me(fs[] param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
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
        try {
          L0: {
            ((me) this).field_i = param0;
            ((me) this).field_b = new boolean[param0.length];
            var2_int = 0;
            L1: while (true) {
              if (((me) this).field_b.length <= var2_int) {
                break L0;
              } else {
                ((me) this).field_b[var2_int] = true;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("me.<init>(");
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
          throw r.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = false;
        field_c = "No Achievement";
        field_f = "Amount of wasted research data.";
    }
}
