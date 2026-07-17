/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class up extends um {
    static jp[] field_A;
    static tq field_v;
    private be field_B;
    private be[] field_y;
    static String field_x;
    static jp field_w;
    static int field_z;

    final void a(boolean param0, int param1, jp[] param2) {
        int var4_int = 0;
        if (!param0) {
            return;
        }
        try {
            var4_int = param1;
            if (!(null != ((up) this).field_y[var4_int])) {
                ((up) this).field_y[var4_int] = new be();
            }
            ((up) this).field_y[param1].field_f = param2;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "up.FA(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    private final void a(boolean param0, up param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        be var5 = null;
        be var6 = null;
        int var7 = 0;
        be stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        be stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        be stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        be stackIn_9_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        be stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        be stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        be stackOut_8_2 = null;
        be stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        be stackOut_7_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              super.a(-35, (um) (Object) param1);
              if (!param2) {
                pm.a((Object[]) (Object) ((up) this).field_y, 0, (Object[]) (Object) param1.field_y, 0, 6);
                break L1;
              } else {
                var4_int = 0;
                L2: while (true) {
                  if (var4_int >= 6) {
                    break L1;
                  } else {
                    L3: {
                      var5 = ((up) this).field_y[var4_int];
                      var6 = var5;
                      var6 = var5;
                      if (var5 != null) {
                        L4: {
                          var6 = param1.field_y[var4_int];
                          stackOut_6_0 = (be) var5;
                          stackOut_6_1 = 0;
                          stackIn_8_0 = stackOut_6_0;
                          stackIn_8_1 = stackOut_6_1;
                          stackIn_7_0 = stackOut_6_0;
                          stackIn_7_1 = stackOut_6_1;
                          if (var6 != null) {
                            stackOut_8_0 = (be) (Object) stackIn_8_0;
                            stackOut_8_1 = stackIn_8_1;
                            stackOut_8_2 = (be) var6;
                            stackIn_9_0 = stackOut_8_0;
                            stackIn_9_1 = stackOut_8_1;
                            stackIn_9_2 = stackOut_8_2;
                            break L4;
                          } else {
                            be dupTemp$13 = new be();
                            param1.field_y[var4_int] = dupTemp$13;
                            stackOut_7_0 = (be) (Object) stackIn_7_0;
                            stackOut_7_1 = stackIn_7_1;
                            stackOut_7_2 = (be) dupTemp$13;
                            stackIn_9_0 = stackOut_7_0;
                            stackIn_9_1 = stackOut_7_1;
                            stackIn_9_2 = stackOut_7_2;
                            break L4;
                          }
                        }
                        ((be) (Object) stackIn_9_0).a(stackIn_9_1 != 0, stackIn_9_2);
                        break L3;
                      } else {
                        param1.field_y[var4_int] = null;
                        break L3;
                      }
                    }
                    var4_int++;
                    continue L2;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("up.HA(").append(1).append(44);
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
          throw qb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param2 + 41);
        }
    }

    final void a(jp[] param0, boolean param1) {
        be[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        be var5 = null;
        int var6 = 0;
        be[] var7 = null;
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
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                field_x = null;
                break L1;
              }
            }
            var7 = ((up) this).field_y;
            var3 = var7;
            var4 = 0;
            L2: while (true) {
              if (var4 >= var7.length) {
                break L0;
              } else {
                L3: {
                  var5 = var7[var4];
                  if (var5 != null) {
                    var5.field_f = param0;
                    break L3;
                  } else {
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
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("up.GA(");
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
          throw qb.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 41);
        }
    }

    public final void a(boolean param0, int param1, int param2, oc param3, int param4) {
        RuntimeException var6 = null;
        be var7 = null;
        be var9 = null;
        d var10 = null;
        be var11 = null;
        be var12 = null;
        be var13 = null;
        be var14 = null;
        oc stackIn_5_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        oc stackOut_3_0 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -20618) {
                break L1;
              } else {
                up.b(62);
                break L1;
              }
            }
            L2: {
              if (!(param3 instanceof d)) {
                stackOut_4_0 = null;
                stackIn_5_0 = (oc) (Object) stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = (oc) param3;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var10 = (d) (Object) stackIn_5_0;
              vi.a((byte) 106, param3.field_t + param3.field_o + param2, param2 - -param3.field_o, param4 + param3.field_w, param4 + param3.field_w - -param3.field_s);
              if (var10 == null) {
                break L3;
              } else {
                param0 = param0 & var10.field_J;
                break L3;
              }
            }
            L4: {
              var7 = ((up) this).field_y[0];
              ((up) this).field_B.a(-2147483648);
              var7.a(((up) this).field_B, 2147483647, (up) this, param3, param2, param4);
              if (var10 != null) {
                L5: {
                  if (!var10.field_F) {
                    break L5;
                  } else {
                    var11 = ((up) this).field_y[1];
                    if (var11 != null) {
                      var11.a(((up) this).field_B, 2147483647, (up) this, param3, param2, param4);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                if (var10.field_q) {
                  L6: {
                    var12 = ((up) this).field_y[3];
                    if (var10.field_n == 0) {
                      break L6;
                    } else {
                      if (var12 != null) {
                        var12.a(((up) this).field_B, 2147483647, (up) this, param3, param2, param4);
                        break L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var9 = ((up) this).field_y[2];
                  if (var9 == null) {
                    break L4;
                  } else {
                    var9.a(((up) this).field_B, 2147483647, (up) this, param3, param2, param4);
                    break L4;
                  }
                } else {
                  break L4;
                }
              } else {
                break L4;
              }
            }
            L7: {
              if (!param3.f(-76)) {
                break L7;
              } else {
                var13 = ((up) this).field_y[5];
                if (var13 != null) {
                  var13.a(((up) this).field_B, 2147483647, (up) this, param3, param2, param4);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            L8: {
              if (param0) {
                break L8;
              } else {
                var14 = ((up) this).field_y[4];
                if (var14 == null) {
                  break L8;
                } else {
                  var14.a(((up) this).field_B, 2147483647, (up) this, param3, param2, param4);
                  break L8;
                }
              }
            }
            ((up) this).field_B.a(param4, (up) this, param3, (byte) -109, param2);
            sc.b(param1 ^ 20704);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var6;
            stackOut_30_1 = new StringBuilder().append("up.AA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param3 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L9;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L9;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 44 + param4 + 41);
        }
    }

    up(up param0, boolean param1) {
        this();
        try {
            param0.a(true, (up) this, param1);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "up.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public static void b(int param0) {
        field_w = null;
        if (param0 != 3) {
            up.b(20);
        }
        field_x = null;
        field_v = null;
        field_A = null;
    }

    final be b(int param0, int param1) {
        if (param1 <= 102) {
            return null;
        }
        be dupTemp$0 = new be();
        ((up) this).field_y[param0] = dupTemp$0;
        return dupTemp$0;
    }

    public up() {
        ((up) this).field_y = new be[6];
        ((up) this).field_B = new be();
        be dupTemp$0 = new be();
        ((up) this).field_y[0] = dupTemp$0;
        be var1 = dupTemp$0;
        var1.a(-2147483648);
    }

    final void a(int param0, jp param1) {
        be[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        be var5 = null;
        int var6 = 0;
        be[] var7 = null;
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
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -1553) {
                break L1;
              } else {
                field_v = null;
                break L1;
              }
            }
            var7 = ((up) this).field_y;
            var3 = var7;
            var4 = 0;
            L2: while (true) {
              if (var4 >= var7.length) {
                break L0;
              } else {
                L3: {
                  var5 = var7[var4];
                  if (var5 == null) {
                    break L3;
                  } else {
                    var5.field_k = param1;
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
            stackOut_9_1 = new StringBuilder().append("up.CA(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
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
          throw qb.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_v = new tq();
    }
}
