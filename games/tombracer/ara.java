/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ara extends jea {
    static jea field_ub;
    static int field_xb;
    static boolean field_wb;
    static String field_yb;
    private jea field_tb;
    static jpa field_vb;

    final boolean a(boolean param0, int param1) {
        int stackIn_9_0 = 0;
        L0: {
          if (param1 >= 7) {
            break L0;
          } else {
            field_yb = (String) null;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              this.c(42, true);
              if (-1 == (hf.field_b ^ -1)) {
                break L3;
              } else {
                if (0 == this.field_y) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if (this.field_tb.field_y == 0) {
              stackIn_9_0 = 0;
              break L1;
            } else {
              break L2;
            }
          }
          stackIn_9_0 = 1;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int stackIn_18_0 = 0;
        int stackIn_29_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var15 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var6_int = param5 + -param4;
            var7 = -param2 + param3;
            if (var7 != 0) {
              if (var6_int == 0) {
                uea.a(param3, param1, param4, param2, false);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if ((var6_int ^ -1) <= -1) {
                    break L1;
                  } else {
                    var6_int = -var6_int;
                    break L1;
                  }
                }
                L2: {
                  if ((var7 ^ -1) > -1) {
                    var7 = -var7;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (var7 >= var6_int) {
                    stackIn_18_0 = 0;
                    break L3;
                  } else {
                    stackIn_18_0 = 1;
                    break L3;
                  }
                }
                L4: {
                  var8 = stackIn_18_0;
                  if (var8 != 0) {
                    var9 = param2;
                    var10 = param3;
                    param2 = param4;
                    param3 = param5;
                    param4 = var9;
                    param5 = var10;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (param0 == 0) {
                    break L5;
                  } else {
                    field_xb = 36;
                    break L5;
                  }
                }
                L6: {
                  if (param3 < param2) {
                    var9 = param2;
                    param2 = param3;
                    var10 = param4;
                    param3 = var9;
                    param4 = param5;
                    param5 = var10;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  var9 = param4;
                  var10 = param3 + -param2;
                  var11 = param5 + -param4;
                  var12 = -(var10 >> -108411583);
                  if (param4 < param5) {
                    stackIn_29_0 = 1;
                    break L7;
                  } else {
                    stackIn_29_0 = -1;
                    break L7;
                  }
                }
                L8: {
                  var13 = stackIn_29_0;
                  if (-1 < (var11 ^ -1)) {
                    var11 = -var11;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (var8 == 0) {
                    var16 = param2;
                    var14 = var16;
                    L10: while (true) {
                      if (param3 < var16) {
                        break L9;
                      } else {
                        L11: {
                          var12 = var12 + var11;
                          vaa.field_a[var9][var16] = param1;
                          if (-1 > (var12 ^ -1)) {
                            var12 = var12 - var10;
                            var9 = var9 + var13;
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        var16++;
                        continue L10;
                      }
                    }
                  } else {
                    var14 = param2;
                    L12: while (true) {
                      if (var14 > param3) {
                        break L9;
                      } else {
                        vaa.field_a[var14][var9] = param1;
                        var12 = var12 + var11;
                        if ((var12 ^ -1) < -1) {
                          var12 = var12 - var10;
                          var9 = var9 + var13;
                          var14++;
                          continue L12;
                        } else {
                          var14++;
                          continue L12;
                        }
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              L13: {
                if (0 != var6_int) {
                  dfa.a(param2, param5, param4, param1, param0 + 0);
                  break L13;
                } else {
                  break L13;
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var6), "ara.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    ara(jea param0, jea param1, jea param2, jea param3, jea param4, jea param5) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        jea var8 = null;
        jea var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        jea var13 = null;
        jea var14 = null;
        int var15 = 0;
        jea var17 = null;
        try {
          L0: {
            var17 = new jea(0L, param1, iw.field_a.toUpperCase());
            var17.field_z = 1;
            this.field_tb = new jea(0L, param2);
            var8 = new jea(0L, param3);
            var9 = new jea(0L, param3, kpa.field_b);
            var9.field_z = 1;
            var10 = 50;
            var11 = 0;
            var12 = 0;
            L1: while (true) {
              if (ufa.field_q.length <= var12) {
                var17.a(20 + var11 - -90, 24, -23776, 0, 0);
                var10 += 15;
                this.a(var17.field_G, var17.field_t + var10, -23776, 100, 100);
                this.field_tb.a(15, 15, -23776, 5, -20 + var17.field_G);
                var8.a(this.field_G, this.field_t + -var17.field_t, -23776, var17.field_t, 0);
                var9.a(this.field_G, 15, -23776, 20, 0);
                var8.field_w = hca.c(var8.field_t, 2105376, 3, 11579568, -125, 8421504);
                var17.b(-125, this.field_tb);
                var8.b(-128, var9);
                this.b(-123, var17);
                this.b(-128, var8);
                var10 = -(this.field_t >> 9238561) + 240;
                this.field_qb = -(this.field_G >> 48600193) + 320;
                break L0;
              } else {
                L2: {
                  var13 = new jea(0L, param3, s.field_b[var12]);
                  var14 = new jea(0L, param3, ufa.field_q[var12]);
                  var15 = param3.field_H.b(ufa.field_q[var12]);
                  if ((var11 ^ -1) <= (var15 ^ -1)) {
                    break L2;
                  } else {
                    var11 = var15;
                    break L2;
                  }
                }
                var13.a(65, 15, -23776, var10, 20);
                var14.a(640, 15, -23776, var10, 90);
                var8.b(-127, var13);
                var10 += 30;
                var8.b(-126, var14);
                var12++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var7);

            stackIn_10_1 = new StringBuilder().append("ara.<init>(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param4 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param5 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_26_2 + ')');
        }
    }

    public static void a(boolean param0) {
        field_yb = null;
        field_ub = null;
        field_vb = null;
        if (param0) {
            ara.a(true);
        }
    }

    static {
        field_yb = "<%0> finished";
    }
}
