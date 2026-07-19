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
        java.awt.Container discarded$0 = null;
        if (param0 != -11807) {
            discarded$0 = km.c(false);
            field_o = null;
            field_m = null;
            return;
        }
        field_o = null;
        field_m = null;
    }

    final static void a(byte param0, int param1, id param2) {
        int discarded$1 = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        pl var8 = null;
        pl var9 = null;
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
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var8 = as.field_v;
            var9 = var8;
            var9.g(param1, 8);
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
              L2: {
                L3: {
                  if (param2.field_q.length <= var6) {
                    break L3;
                  } else {
                    var8.e(48, param2.field_q[var6]);
                    var6++;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      if (var7 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                discarded$1 = var9.a(var4, false);
                var9.c(var9.field_p + -var4, -13745);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("km.C(").append(param0).append(',').append(param1).append(',');
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
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        ah var2 = null;
        ah var3 = null;
        int var4 = 0;
        int var5 = 0;
        ah var6 = null;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (null == aa.field_a) {
                  break L2;
                } else {
                  var1_int = 0;
                  L3: while (true) {
                    stackOut_3_0 = var1_int;
                    stackOut_3_1 = db.field_l;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    L4: while (true) {
                      if (stackIn_4_0 >= stackIn_4_1) {
                        break L2;
                      } else {
                        var2 = aa.field_a[var1_int];
                        var3 = var2;
                        var6 = var3;
                        var3 = var2;
                        if (var7 != 0) {
                          break L1;
                        } else {
                          L5: {
                            if (var2 != null) {
                              if (-1 != (var1_int ^ -1)) {
                                if (var2.h(-1)) {
                                  break L5;
                                } else {
                                  var3 = aa.field_a[0];
                                  var6 = var3;
                                  var6 = var3;
                                  if (var3 == null) {
                                    break L5;
                                  } else {
                                    L6: {
                                      var4 = var2.field_a;
                                      if (!gt.field_bb) {
                                        break L6;
                                      } else {
                                        L7: {
                                          if (!wn.a(var3.field_z, var4, -114, var2.field_C, var3.field_C, var2.field_z)) {
                                            break L7;
                                          } else {
                                            if (!var3.f((byte) -63)) {
                                              break L7;
                                            } else {
                                              if (!var3.i((byte) 125)) {
                                                break L7;
                                              } else {
                                                var2.a(false, var3.field_z, var3.field_C);
                                                if (var7 == 0) {
                                                  break L5;
                                                } else {
                                                  break L7;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        var5 = 0;
                                        L8: while (true) {
                                          L9: {
                                            if (db.field_l <= var5) {
                                              break L9;
                                            } else {
                                              var6 = aa.field_a[var5];
                                              stackOut_20_0 = var5 ^ -1;
                                              stackOut_20_1 = var1_int ^ -1;
                                              stackIn_4_0 = stackOut_20_0;
                                              stackIn_4_1 = stackOut_20_1;
                                              stackIn_21_0 = stackOut_20_0;
                                              stackIn_21_1 = stackOut_20_1;
                                              if (var7 != 0) {
                                                continue L4;
                                              } else {
                                                L10: {
                                                  if (stackIn_21_0 == stackIn_21_1) {
                                                    break L10;
                                                  } else {
                                                    if (var6 == null) {
                                                      break L10;
                                                    } else {
                                                      if (!var6.i((byte) 125)) {
                                                        break L10;
                                                      } else {
                                                        if (!wn.a(var6.field_z, var4, -114, var2.field_C, var6.field_C, var2.field_z)) {
                                                          break L10;
                                                        } else {
                                                          if (!var6.f((byte) -63)) {
                                                            break L10;
                                                          } else {
                                                            var2.a(false, var3.field_z, var3.field_C);
                                                            if (var7 == 0) {
                                                              break L5;
                                                            } else {
                                                              break L10;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                var5++;
                                                if (var7 == 0) {
                                                  continue L8;
                                                } else {
                                                  break L9;
                                                }
                                              }
                                            }
                                          }
                                          if (var7 == 0) {
                                            break L5;
                                          } else {
                                            break L6;
                                          }
                                        }
                                      }
                                    }
                                    if (!wn.a(var3.field_z, var4, -115, var2.field_C, var3.field_C, var2.field_z)) {
                                      break L5;
                                    } else {
                                      if (!var3.f((byte) -63)) {
                                        break L5;
                                      } else {
                                        if (!var3.i((byte) 125)) {
                                          break L5;
                                        } else {
                                          var2.a(false, var3.field_z, var3.field_C);
                                          break L5;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L5;
                              }
                            } else {
                              break L5;
                            }
                          }
                          var1_int++;
                          if (var7 == 0) {
                            continue L3;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
              }
              var1_int = -120 / ((-61 - param0) / 63);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1), "km.D(" + param0 + ')');
        }
    }

    final static java.awt.Container c(boolean param0) {
        if (!param0) {
          if (ck.field_c != null) {
            return (java.awt.Container) ((Object) ck.field_c);
          } else {
            return (java.awt.Container) ((Object) ra.c(2));
          }
        } else {
          field_o = (lh) null;
          if (ck.field_c != null) {
            return (java.awt.Container) ((Object) ck.field_c);
          } else {
            return (java.awt.Container) ((Object) ra.c(2));
          }
        }
    }

    private km() throws Throwable {
        throw new Error();
    }

    static {
        field_o = null;
        field_m = "Accept";
    }
}
