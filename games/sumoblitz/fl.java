/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl extends gm {
    private sm field_t;
    static String field_s;
    static int field_p;
    static int field_n;
    static byte[][] field_o;
    private sm[] field_q;
    static ri[] field_r;

    public static void b(int param0) {
        field_r = null;
        field_o = null;
        field_s = null;
    }

    final static String a(boolean param0, boolean param1, boolean param2, byte param3) {
        int var4 = 0;
        if (!(!param2)) {
            var4 += 4;
        }
        if (!(!param1)) {
            var4 += 2;
        }
        if (!(!param0)) {
            var4++;
        }
        return pl.field_r[var4];
    }

    fl(fl param0, boolean param1) {
        this();
        try {
            param0.a((fl) this, param1, -26407);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "fl.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public final void a(pk param0, int param1, int param2, boolean param3, int param4) {
        RuntimeException var6 = null;
        sm var7 = null;
        sm var9 = null;
        Object var10 = null;
        wp var11 = null;
        sm var12 = null;
        sm var13 = null;
        sm var14 = null;
        sm var15 = null;
        pk stackIn_3_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        pk stackOut_1_0 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        try {
          L0: {
            L1: {
              if (!(param0 instanceof wp)) {
                stackOut_2_0 = null;
                stackIn_3_0 = (pk) (Object) stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = (pk) param0;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var11 = (wp) (Object) stackIn_3_0;
              kw.a(param1 - -param0.field_v + param0.field_p, param1 - -param0.field_v, 1, param4 - -param0.field_r, param0.field_r + (param4 - -param0.field_q));
              if (var11 != null) {
                param3 = param3 & var11.field_x;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = ((fl) this).field_q[0];
              ((fl) this).field_t.a(true);
              var7.a(param4, param0, -28, (fl) this, param1, ((fl) this).field_t);
              if (var11 != null) {
                L4: {
                  if (!var11.field_C) {
                    break L4;
                  } else {
                    var12 = ((fl) this).field_q[1];
                    if (var12 != null) {
                      var12.a(param4, param0, -75, (fl) this, param1, ((fl) this).field_t);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                if (!var11.field_k) {
                  break L3;
                } else {
                  L5: {
                    var13 = ((fl) this).field_q[3];
                    if (var11.field_l == 0) {
                      break L5;
                    } else {
                      if (var13 == null) {
                        break L5;
                      } else {
                        var13.a(param4, param0, param2 ^ -5592346, (fl) this, param1, ((fl) this).field_t);
                        break L3;
                      }
                    }
                  }
                  var9 = ((fl) this).field_q[2];
                  if (var9 != null) {
                    var9.a(param4, param0, -97, (fl) this, param1, ((fl) this).field_t);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              } else {
                break L3;
              }
            }
            L6: {
              if (param2 == 5592405) {
                break L6;
              } else {
                var10 = null;
                ((fl) this).a((wb[]) null, -110);
                break L6;
              }
            }
            L7: {
              if (param0.d(-1)) {
                var14 = ((fl) this).field_q[5];
                if (var14 == null) {
                  break L7;
                } else {
                  var14.a(param4, param0, param2 ^ -5592417, (fl) this, param1, ((fl) this).field_t);
                  break L7;
                }
              } else {
                break L7;
              }
            }
            L8: {
              if (!param3) {
                var15 = ((fl) this).field_q[4];
                if (var15 != null) {
                  var15.a(param4, param0, -66, (fl) this, param1, ((fl) this).field_t);
                  break L8;
                } else {
                  break L8;
                }
              } else {
                break L8;
              }
            }
            ((fl) this).field_t.a(param1, (fl) this, param4, -66, param0);
            su.a((byte) -70);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var6;
            stackOut_32_1 = new StringBuilder().append("fl.A(");
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param0 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L9;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L9;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    private final void a(fl param0, boolean param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        sm var5 = null;
        sm var6 = null;
        int var7 = 0;
        sm stackIn_7_0 = null;
        sm stackIn_8_0 = null;
        sm stackIn_9_0 = null;
        sm stackIn_9_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        sm stackOut_6_0 = null;
        sm stackOut_8_0 = null;
        sm stackOut_8_1 = null;
        sm stackOut_7_0 = null;
        sm stackOut_7_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              super.a((gm) (Object) param0, -123);
              if (param1) {
                var4_int = 0;
                L2: while (true) {
                  if (var4_int >= 6) {
                    break L1;
                  } else {
                    L3: {
                      var5 = ((fl) this).field_q[var4_int];
                      if (var5 == null) {
                        param0.field_q[var4_int] = null;
                        break L3;
                      } else {
                        L4: {
                          var6 = param0.field_q[var4_int];
                          stackOut_6_0 = (sm) var5;
                          stackIn_8_0 = stackOut_6_0;
                          stackIn_7_0 = stackOut_6_0;
                          if (var6 == null) {
                            sm dupTemp$25 = new sm();
                            param0.field_q[var4_int] = dupTemp$25;
                            stackOut_8_0 = (sm) (Object) stackIn_8_0;
                            stackOut_8_1 = (sm) dupTemp$25;
                            stackIn_9_0 = stackOut_8_0;
                            stackIn_9_1 = stackOut_8_1;
                            break L4;
                          } else {
                            stackOut_7_0 = (sm) (Object) stackIn_7_0;
                            stackOut_7_1 = (sm) var6;
                            stackIn_9_0 = stackOut_7_0;
                            stackIn_9_1 = stackOut_7_1;
                            break L4;
                          }
                        }
                        ((sm) (Object) stackIn_9_0).a(stackIn_9_1, (byte) 94);
                        break L3;
                      }
                    }
                    var4_int++;
                    continue L2;
                  }
                }
              } else {
                la.a((Object[]) (Object) ((fl) this).field_q, 0, (Object[]) (Object) param0.field_q, 0, 6);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("fl.C(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 44 + -26407 + 41);
        }
    }

    public fl() {
        ((fl) this).field_q = new sm[6];
        ((fl) this).field_t = new sm();
        sm dupTemp$0 = new sm();
        ((fl) this).field_q[0] = dupTemp$0;
        sm var1 = dupTemp$0;
        var1.a(true);
    }

    final void a(wb[] param0, int param1) {
        sm[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        sm var5 = null;
        int var6 = 0;
        sm[] var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var7 = ((fl) this).field_q;
              var3 = var7;
              if (param1 == 28715) {
                break L1;
              } else {
                sm discarded$2 = ((fl) this).a(false, 37);
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var7.length <= var4) {
                break L0;
              } else {
                L3: {
                  var5 = var7[var4];
                  if (var5 == null) {
                    break L3;
                  } else {
                    var5.field_j = param0;
                    break L3;
                  }
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("fl.F(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
        }
    }

    final void a(int param0, wb param1) {
        sm[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        sm var6 = null;
        int var7 = 0;
        sm[] var8 = null;
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
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var8 = ((fl) this).field_q;
            var3 = var8;
            var4 = -50 % ((param0 - 68) / 36);
            var5 = 0;
            L1: while (true) {
              if (var5 >= var8.length) {
                break L0;
              } else {
                L2: {
                  var6 = var8[var5];
                  if (var6 == null) {
                    break L2;
                  } else {
                    var6.field_i = param1;
                    break L2;
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3_ref;
            stackOut_7_1 = new StringBuilder().append("fl.D(").append(param0).append(44);
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
          throw qo.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    final sm a(boolean param0, int param1) {
        if (param0) {
            Object var4 = null;
            ((fl) this).a((byte) -126, (wb[]) null, -97);
        }
        sm dupTemp$0 = new sm();
        ((fl) this).field_q[param1] = dupTemp$0;
        return dupTemp$0;
    }

    final void a(byte param0, wb[] param1, int param2) {
        int var4_int = 0;
        try {
            var4_int = param2;
            if (!(null != ((fl) this).field_q[var4_int])) {
                ((fl) this).field_q[var4_int] = new sm();
            }
            ((fl) this).field_q[param2].field_j = param1;
            var4_int = -9 % ((param0 - 57) / 52);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "fl.G(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Waiting for extra data";
        field_n = 0;
        field_p = -1;
    }
}
