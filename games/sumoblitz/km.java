/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km extends ms {
    int field_l;
    static lh field_o;
    int field_n;
    static long field_k;
    static String field_m;

    public static void a(int param0) {
        field_o = null;
        field_m = null;
    }

    final static void a(byte param0, int param1, id param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        pl var8 = null;
        pl var9 = null;
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
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var8 = as.field_v;
            var9 = var8;
            var9.g(3, 8);
            var9.field_p = var9.field_p + 1;
            var4 = var9.field_p;
            var9.b((byte) 55, 1);
            var5 = 104 / ((30 - param0) / 34);
            var9.b(-77, param2.field_r);
            var9.b(-92, param2.field_l);
            var9.b(123, param2.field_t);
            var9.e(48, param2.field_n);
            var9.e(48, param2.field_o);
            var9.e(48, param2.field_p);
            var9.e(48, param2.field_k);
            var9.b((byte) 119, param2.field_q.length);
            var6 = 0;
            L1: while (true) {
              if (param2.field_q.length <= var6) {
                int discarded$1 = var9.a(var4, false);
                var9.c(var9.field_p + -var4, -13745);
                break L0;
              } else {
                var8.e(48, param2.field_q[var6]);
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("km.C(").append(param0).append(44).append(3).append(44);
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
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    final static void a() {
        RuntimeException var1 = null;
        int var1_int = 0;
        ah var2 = null;
        ah var3 = null;
        int var4 = 0;
        int var5 = 0;
        ah var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null == aa.field_a) {
                break L1;
              } else {
                var1_int = 0;
                L2: while (true) {
                  if (var1_int >= db.field_l) {
                    break L1;
                  } else {
                    L3: {
                      var2 = aa.field_a[var1_int];
                      var3 = var2;
                      var6 = var3;
                      var3 = var2;
                      if (var2 != null) {
                        if (var1_int != 0) {
                          if (var2.h(-1)) {
                            break L3;
                          } else {
                            var3 = aa.field_a[0];
                            var6 = var3;
                            var6 = var3;
                            if (var3 == null) {
                              break L3;
                            } else {
                              var4 = var2.field_a;
                              if (!gt.field_bb) {
                                if (!wn.a(var3.field_z, var4, -115, var2.field_C, var3.field_C, var2.field_z)) {
                                  break L3;
                                } else {
                                  if (!var3.f((byte) -63)) {
                                    break L3;
                                  } else {
                                    if (!var3.i((byte) 125)) {
                                      break L3;
                                    } else {
                                      var2.a(false, var3.field_z, var3.field_C);
                                      break L3;
                                    }
                                  }
                                }
                              } else {
                                L4: {
                                  if (!wn.a(var3.field_z, var4, -114, var2.field_C, var3.field_C, var2.field_z)) {
                                    break L4;
                                  } else {
                                    if (!var3.f((byte) -63)) {
                                      break L4;
                                    } else {
                                      if (!var3.i((byte) 125)) {
                                        break L4;
                                      } else {
                                        var2.a(false, var3.field_z, var3.field_C);
                                        break L3;
                                      }
                                    }
                                  }
                                }
                                var5 = 0;
                                L5: while (true) {
                                  if (db.field_l <= var5) {
                                    break L3;
                                  } else {
                                    L6: {
                                      var6 = aa.field_a[var5];
                                      if (var5 == var1_int) {
                                        break L6;
                                      } else {
                                        if (var6 == null) {
                                          break L6;
                                        } else {
                                          if (!var6.i((byte) 125)) {
                                            break L6;
                                          } else {
                                            if (!wn.a(var6.field_z, var4, -114, var2.field_C, var6.field_C, var2.field_z)) {
                                              break L6;
                                            } else {
                                              if (!var6.f((byte) -63)) {
                                                break L6;
                                              } else {
                                                var2.a(false, var3.field_z, var3.field_C);
                                                break L3;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var5++;
                                    continue L5;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                    var1_int++;
                    continue L2;
                  }
                }
              }
            }
            var1_int = 120;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var1, "km.D(" + 32 + 41);
        }
    }

    final static java.awt.Container c() {
        if (ck.field_c != null) {
            return (java.awt.Container) (Object) ck.field_c;
        }
        return (java.awt.Container) (Object) ra.c(2);
    }

    private km() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = null;
        field_m = "Accept";
    }
}
