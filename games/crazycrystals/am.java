/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am {
    static String field_f;
    static String field_a;
    static tj field_e;
    static int field_g;
    private kg field_d;
    private boolean field_h;
    private double field_b;
    private double field_i;
    private int field_c;

    final void b(byte param0) {
        if (!(!((am) this).field_h)) {
            tb.field_d.a((od) (Object) ((am) this).field_d);
            ((am) this).field_h = false;
        }
        int var2 = -40 % ((param0 - 4) / 56);
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        double var11 = 0.0;
        int var13_int = 0;
        double var13 = 0.0;
        int var15 = 0;
        double stackIn_26_0 = 0.0;
        double stackIn_27_0 = 0.0;
        double stackIn_28_0 = 0.0;
        int stackIn_28_1 = 0;
        double stackOut_25_0 = 0.0;
        double stackOut_27_0 = 0.0;
        int stackOut_27_1 = 0;
        double stackOut_26_0 = 0.0;
        int stackOut_26_1 = 0;
        L0: {
          var15 = CrazyCrystals.field_B;
          if (param0 != 60) {
            break L0;
          } else {
            param0 = 72;
            break L0;
          }
        }
        L1: {
          if (param0 != 60) {
            break L1;
          } else {
            param0 = 72;
            break L1;
          }
        }
        L2: {
          var8 = param1 - param2;
          var9 = param4 - param6;
          var10 = (int)Math.sqrt((double)(var9 * var9 + var8 * var8));
          var11 = (double)(param3 * param3);
          if (var10 <= 12) {
            break L2;
          } else {
            L3: {
              L4: {
                var11 = 12.0 * var11 / (double)var10;
                if (var9 >= var8) {
                  break L4;
                } else {
                  if (-var9 >= var8) {
                    break L4;
                  } else {
                    var13_int = var8;
                    break L3;
                  }
                }
              }
              L5: {
                if (~var8 <= ~var9) {
                  break L5;
                } else {
                  if (~var8 > ~-var9) {
                    var13_int = -var8;
                    break L3;
                  } else {
                    break L5;
                  }
                }
              }
              if (var9 > 0) {
                var13_int = var9;
                break L3;
              } else {
                var13_int = -var9;
                break L3;
              }
            }
            if (var13_int < 60) {
              break L2;
            } else {
              if (param0 == 0) {
                L6: {
                  if (var13_int <= 72) {
                    break L6;
                  } else {
                    var13_int = 72;
                    break L6;
                  }
                }
                var11 = (double)(76 - var13_int) * var11 / 16.0;
                break L2;
              } else {
                if (var13_int < 72) {
                  var11 = var11 * (double)(72 - var13_int) / 12.0;
                  break L2;
                } else {
                  return;
                }
              }
            }
          }
        }
        L7: {
          ((am) this).field_b = ((am) this).field_b + var11;
          if (param5 < -123) {
            break L7;
          } else {
            ((am) this).field_c = 33;
            break L7;
          }
        }
        L8: {
          stackOut_25_0 = (double)var8;
          stackIn_27_0 = stackOut_25_0;
          stackIn_26_0 = stackOut_25_0;
          if (var10 >= 48) {
            stackOut_27_0 = stackIn_27_0;
            stackOut_27_1 = var10;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            break L8;
          } else {
            stackOut_26_0 = stackIn_26_0;
            stackOut_26_1 = 48;
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            break L8;
          }
        }
        var13 = stackIn_28_0 / (double)stackIn_28_1;
        ((am) this).field_i = ((am) this).field_i + var11 * (1.0 + var13) * 0.5;
    }

    final void a(byte param0) {
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        var6 = CrazyCrystals.field_B;
        if (param0 < -13) {
          L0: {
            var2 = Math.sqrt(((am) this).field_b) * 64.0;
            if ((double)(64 * ((am) this).field_c) <= var2) {
              stackOut_4_0 = 64 * ((am) this).field_c;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = (int)var2;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var4 = stackIn_5_0;
            if (var4 <= 0) {
              if (!((am) this).field_h) {
                break L1;
              } else {
                tb.field_d.a((od) (Object) ((am) this).field_d);
                ((am) this).field_h = false;
                break L1;
              }
            } else {
              L2: {
                var5 = (int)(0.5 + 16384.0 * ((am) this).field_i / ((am) this).field_b);
                if (var5 < 0) {
                  var5 = 0;
                  break L2;
                } else {
                  if (var5 > 16384) {
                    var5 = 16384;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              ((am) this).field_d.c(var4 * gi.field_m >> 6, var5);
              if (((am) this).field_h) {
                break L1;
              } else {
                ((am) this).field_h = true;
                tb.field_d.b((od) (Object) ((am) this).field_d);
                break L1;
              }
            }
          }
          ((am) this).field_c = 0;
          ((am) this).field_i = 0.0;
          ((am) this).field_b = 0.0;
          return;
        } else {
          return;
        }
    }

    final static boolean a(char param0, byte param1) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param1 >= 18) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (param0 == 160) {
              break L2;
            } else {
              if (param0 == 32) {
                break L2;
              } else {
                if (param0 == 95) {
                  break L2;
                } else {
                  if (param0 != 45) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    final static void a(db param0, db param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5_int = 0;
        ng var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] stackIn_29_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_27_0 = null;
        int[] stackOut_28_0 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var8 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              ge.field_d = wl.a("menuback", param0, 10, "");
              ee.field_m = wl.a("menulogo", param0, 10, "");
              me.field_b = ee.field_m.field_n / 2 - ee.field_m.field_v;
              kf.field_c = ee.field_m.field_n / 2 - ee.field_m.field_v;
              var3_int = -30 + ee.field_m.field_o;
              var4 = ee.field_m.field_o;
              if (ul.field_g != 0) {
                if (o.field_h.equals((Object) (Object) "top")) {
                  var3_int = 0;
                  var4 = 30;
                  break L1;
                } else {
                  if (!o.field_h.equals((Object) (Object) "bottom")) {
                    throw new IllegalStateException();
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            var5_int = var3_int;
            L2: while (true) {
              if (var5_int >= var4) {
                kf.field_c = kf.field_c + ee.field_m.field_v;
                me.field_b = me.field_b + ee.field_m.field_v;
                var5 = new ng(param1.b(0, 0, 0));
                mi.field_A = new int[480];
                var6 = 0;
                var7 = 0;
                stackOut_27_0 = mi.field_A;
                stackIn_29_0 = stackOut_27_0;
                L3: while (true) {
                  if (stackIn_29_0.length <= var7) {
                    break L0;
                  } else {
                    var6 = var6 + var5.f(0);
                    mi.field_A[var7] = var6;
                    var7++;
                    stackOut_28_0 = mi.field_A;
                    stackIn_29_0 = stackOut_28_0;
                    continue L3;
                  }
                }
              } else {
                L4: {
                  if (ee.field_m.field_t > var5_int) {
                    break L4;
                  } else {
                    if (ee.field_m.field_u + ee.field_m.field_t <= var5_int) {
                      break L4;
                    } else {
                      var6 = ee.field_m.field_l * (-ee.field_m.field_t + var5_int);
                      var7 = 0;
                      L5: while (true) {
                        L6: {
                          if (kf.field_c <= var7) {
                            break L6;
                          } else {
                            if (ee.field_m.field_w[var7 + var6] != 0) {
                              kf.field_c = var7;
                              break L6;
                            } else {
                              var7++;
                              continue L5;
                            }
                          }
                        }
                        var7 = -1 + ee.field_m.field_l;
                        L7: while (true) {
                          if (var7 <= me.field_b) {
                            break L4;
                          } else {
                            if (0 != ee.field_m.field_w[var7 + var6]) {
                              me.field_b = var7;
                              break L4;
                            } else {
                              var7--;
                              continue L7;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                var5_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var3;
            stackOut_32_1 = new StringBuilder().append("am.E(");
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
              break L8;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L8;
            }
          }
          L9: {
            stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
            stackOut_35_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(44);
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param1 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L9;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L9;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + 44 + -88 + 41);
        }
    }

    final static void a(tj param0, int param1, db param2, int param3) {
        try {
            lc.field_a = param3 * sm.d((byte) -104) / 1000;
            int discarded$0 = 640;
            nl.a(param2);
            int discarded$1 = 65;
            lk.a(param2);
            de.a((byte) -67, param2);
            fh.a(true);
            int discarded$2 = -85;
            on.a();
            sn.field_c = 0 - lc.field_a;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "am.B(" + (param0 != null ? "{...}" : "null") + 44 + 0 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    public static void a() {
        field_a = null;
        field_f = null;
        field_e = null;
    }

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        double var6 = 0.0;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        fq var9_ref_fq = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var12 = CrazyCrystals.field_B;
          if (param0 > ((am) this).field_c) {
            ((am) this).field_c = param0;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (nj.field_k > 0) {
            var6 = (double)(param0 * param0) * 0.03125;
            ((am) this).field_i = ((am) this).field_i + 0.08333333333333333 / (double)nj.field_k * ((double)(6 + param1) * var6);
            ((am) this).field_b = ((am) this).field_b + var6;
            break L1;
          } else {
            var6_int = 0;
            var7 = 0;
            L2: while (true) {
              if (var7 >= 3) {
                var7 = qh.field_o.size();
                var8 = 0;
                L3: while (true) {
                  if (var7 <= var8) {
                    if (var6_int != 0) {
                      break L1;
                    } else {
                      var8 = (int)(bq.field_i[0] / bq.field_i[2] * 6.0 - 5.5);
                      var9 = (int)(6.0 * (bq.field_i[1] / bq.field_i[2]) - 5.5);
                      this.a(param3, param1, var8, param0, param2, -125, var9);
                      break L1;
                    }
                  } else {
                    var9_ref_fq = (fq) qh.field_o.elementAt(var8);
                    var10 = 12 * var9_ref_fq.field_A + var9_ref_fq.field_o * var9_ref_fq.field_m;
                    var11 = var9_ref_fq.field_m * var9_ref_fq.field_s + 12 * var9_ref_fq.field_t;
                    this.a(param3, param1, var10, param0, param2, param4 ^ 17, var11);
                    var6_int = 1;
                    var8++;
                    continue L3;
                  }
                }
              } else {
                if (oe.field_a[var7] != null) {
                  var8 = 12 * oe.field_a[var7].field_A + oe.field_a[var7].field_o * oe.field_a[var7].field_m;
                  var9 = oe.field_a[var7].field_t * 12 + oe.field_a[var7].field_s * oe.field_a[var7].field_m;
                  this.a(param3, param1, var8, param0, param2, -128, var9);
                  var6_int = 1;
                  var7++;
                  continue L2;
                } else {
                  var7++;
                  continue L2;
                }
              }
            }
          }
        }
        L4: {
          if (param4 == -111) {
            break L4;
          } else {
            ((am) this).field_h = true;
            break L4;
          }
        }
    }

    am(kg param0) {
        ((am) this).field_b = 0.0;
        ((am) this).field_h = false;
        ((am) this).field_i = 0.0;
        ((am) this).field_c = 0;
        try {
            ((am) this).field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "am.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Press M to have a look at the map. Which wall is this ball following? Think how to negotiate this section before you enter.";
        field_a = "Connection lost. <%0>";
    }
}
