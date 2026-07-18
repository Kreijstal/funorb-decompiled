/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj extends nm {
    static int[] field_n;
    int field_m;
    int field_o;
    static jp field_q;
    static byte[] field_p;
    static int[] field_l;
    static dm field_j;
    static mh field_k;
    static dh field_r;
    static int field_i;

    final static hg[] a(boolean param0, tg param1) {
        RuntimeException var2 = null;
        ql var2_ref = null;
        int[] var3 = null;
        hg[] var4 = null;
        int var5 = 0;
        hg var6 = null;
        int var7 = 0;
        hg[] stackIn_5_0 = null;
        hg[] stackIn_14_0 = null;
        Object stackIn_17_0 = null;
        hg[] stackIn_21_0 = null;
        hg[] stackIn_25_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        hg[] stackOut_4_0 = null;
        hg[] stackOut_13_0 = null;
        hg[] stackOut_20_0 = null;
        hg[] stackOut_24_0 = null;
        Object stackOut_16_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (!param1.b(-125)) {
              stackOut_4_0 = new hg[]{};
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              var2_ref = param1.a(0);
              L1: while (true) {
                L2: {
                  L3: {
                    if (var2_ref.field_f != 0) {
                      break L3;
                    } else {
                      wj.a(-128, 10L);
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
                  if (var2_ref.field_f != 2) {
                    break L2;
                  } else {
                    stackOut_13_0 = new hg[]{};
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  }
                }
                if (param0) {
                  var3 = (int[]) var2_ref.field_e;
                  var4 = new hg[var3.length >> 1391905634];
                  var5 = 0;
                  L4: while (true) {
                    L5: {
                      L6: {
                        if (var4.length <= var5) {
                          break L6;
                        } else {
                          var6 = new hg();
                          stackOut_20_0 = (hg[]) var4;
                          stackIn_25_0 = stackOut_20_0;
                          stackIn_21_0 = stackOut_20_0;
                          if (var7 != 0) {
                            break L5;
                          } else {
                            stackIn_21_0[var5] = var6;
                            var6.field_d = var3[var5 << -1325759230];
                            var6.field_c = var3[1 + (var5 << 1625668418)];
                            var6.field_h = var3[2 + (var5 << -241429566)];
                            var6.field_f = var3[3 + (var5 << 157162242)];
                            var5++;
                            if (var7 == 0) {
                              continue L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      stackOut_24_0 = (hg[]) var4;
                      stackIn_25_0 = stackOut_24_0;
                      break L5;
                    }
                    break L0;
                  }
                } else {
                  stackOut_16_0 = null;
                  stackIn_17_0 = stackOut_16_0;
                  return (hg[]) (Object) stackIn_17_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var2;
            stackOut_26_1 = new StringBuilder().append("lj.F(").append(param0).append(',');
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L7;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L7;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ')');
        }
        return stackIn_25_0;
    }

    public static void b(boolean param0) {
        if (param0) {
            return;
        }
        try {
            field_j = null;
            field_l = null;
            field_r = null;
            field_n = null;
            field_k = null;
            field_p = null;
            field_q = null;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "lj.D(" + param0 + ')');
        }
    }

    final static void a(int param0) {
        RuntimeException runtimeException = null;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var1 = fi.field_w;
            var2 = param0;
            var3 = var1.length;
            L1: while (true) {
              L2: {
                L3: {
                  if (var3 <= var2) {
                    break L3;
                  } else {
                    int incrementValue$16 = var2;
                    var2++;
                    var1[incrementValue$16] = 0;
                    int incrementValue$17 = var2;
                    var2++;
                    var1[incrementValue$17] = 0;
                    int incrementValue$18 = var2;
                    var2++;
                    var1[incrementValue$18] = 0;
                    int incrementValue$19 = var2;
                    var2++;
                    var1[incrementValue$19] = 0;
                    int incrementValue$20 = var2;
                    var2++;
                    var1[incrementValue$20] = 0;
                    int incrementValue$21 = var2;
                    var2++;
                    var1[incrementValue$21] = 0;
                    int incrementValue$22 = var2;
                    var2++;
                    var1[incrementValue$22] = 0;
                    int incrementValue$23 = var2;
                    var2++;
                    var1[incrementValue$23] = 0;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qb.a((Throwable) (Object) runtimeException, "lj.C(" + param0 + ')');
        }
    }

    final static void a(gb param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        gb var3 = null;
        int var4 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (null != param0.field_j) {
              L1: {
                L2: {
                  L3: {
                    if (param0.field_f != 0) {
                      break L3;
                    } else {
                      if (0 == param0.field_d) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2_int = 0;
                  L4: while (true) {
                    if (mm.field_Sb <= var2_int) {
                      break L2;
                    } else {
                      var3 = jk.field_s[var2_int];
                      stackOut_9_0 = -3;
                      stackOut_9_1 = ~var3.field_c;
                      stackIn_28_0 = stackOut_9_0;
                      stackIn_28_1 = stackOut_9_1;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      if (var4 != 0) {
                        break L1;
                      } else {
                        L5: {
                          if (stackIn_10_0 != stackIn_10_1) {
                            break L5;
                          } else {
                            if (var3.field_f != param0.field_f) {
                              break L5;
                            } else {
                              if (~var3.field_d == ~param0.field_d) {
                                return;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        var2_int++;
                        if (var4 == 0) {
                          continue L4;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                L6: {
                  if (null != param0.field_g) {
                    ig.field_K = param0.field_m;
                    kb.field_Zb = param0.field_k;
                    r.field_x = param0.field_c;
                    hb.field_z = param0.field_g;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                n.a(0, param0);
                stackOut_27_0 = 85;
                stackOut_27_1 = (param1 - -11) / 50;
                stackIn_28_0 = stackOut_27_0;
                stackIn_28_1 = stackOut_27_1;
                break L1;
              }
              var2_int = stackIn_28_0 / stackIn_28_1;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var2;
            stackOut_30_1 = new StringBuilder().append("lj.E(");
            stackIn_33_0 = stackOut_30_0;
            stackIn_33_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L7;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_34_0 = stackOut_31_0;
              stackIn_34_1 = stackOut_31_1;
              stackIn_34_2 = stackOut_31_2;
              break L7;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              gp.field_b = param4;
              wh.field_m = param2;
              nq.field_i = param0;
              if (param3 == 0) {
                break L1;
              } else {
                hg[] discarded$2 = lj.a(true, (tg) null);
                break L1;
              }
            }
            field_i = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var5, "lj.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, j param1, ak param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            var5_int = -82 % ((param3 - 81) / 41);
            km.a(param2, param1, param4, param0, true, 5, 1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("lj.A(").append(param0).append(',');
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    lj(int param0) {
        this(param0, true);
    }

    lj(int param0, boolean param1) {
        try {
            ((lj) this).field_m = 0;
            ((lj) this).field_o = param0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "lj.<init>(" + param0 + ',' + param1 + ')');
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
        int var4 = 0;
        field_n = new int[256];
        var0 = 64;
        var1 = 128;
        var2 = 255;
        var3 = 0;
        L0: while (true) {
          if (var3 >= 256) {
            field_l = new int[]{0, 4096, 5793, 7094, 8192, 9159, 10033, 10837, 11585, 12288, 12953, 13585, 14189, 14768, 15326, 15864, 16384, 16888, 17378, 17854, 18318, 18770, 19212, 19644, 20066, 20480, 20886, 21283, 21674, 22058, 22435, 22806, 23170, 23530, 23884, 24232, 24576, 24915, 25249, 25580, 25905, 26227, 26545, 26859, 27170, 27477, 27780, 28081, 28378, 28672, 28963, 29251, 29537, 29819, 30099, 30377, 30652, 30924, 31194, 31462, 31727, 31991, 32252, 32511, 32768, 33023, 33276, 33527, 33776, 34024, 34270, 34514, 34756, 34996, 35235, 35472, 35708, 35942, 36175, 36406, 36636, 36864, 37091, 37316, 37540, 37763, 37985, 38205, 38424, 38642, 38858, 39073, 39287, 39500, 39712, 39923, 40132, 40341, 40548, 40755, 40960, 41164, 41368, 41570, 41771, 41972, 42171, 42369, 42567, 42763, 42959, 43154, 43348, 43541, 43733, 43925, 44115, 44305, 44494, 44682, 44869, 45056, 45242, 45427, 45611, 45795, 45977, 46160, 46341, 46522, 46702, 46881, 47059, 47237, 47415, 47591, 47767, 47942, 48117, 48291, 48465, 48637, 48809, 48981, 49152, 49322, 49492, 49661, 49830, 49998, 50166, 50332, 50499, 50665, 50830, 50995, 51159, 51323, 51486, 51649, 51811, 51972, 52134, 52294, 52454, 52614, 52773, 52932, 53090, 53248, 53405, 53562, 53719, 53874, 54030, 54185, 54340, 54494, 54647, 54801, 54954, 55106, 55258, 55410, 55561, 55712, 55862, 56012, 56162, 56311, 56459, 56608, 56756, 56903, 57051, 57198, 57344, 57490, 57636, 57781, 57926, 58071, 58215, 58359, 58503, 58646, 58789, 58931, 59073, 59215, 59357, 59498, 59639, 59779, 59919, 60059, 60199, 60338, 60477, 60615, 60753, 60891, 61029, 61166, 61303, 61440, 61576, 61712, 61848, 61984, 62119, 62254, 62388, 62523, 62657, 62790, 62924, 63057, 63190, 63323, 63455, 63587, 63719, 63850, 63982, 64113, 64243, 64374, 64504, 64634, 64763, 64893, 65022, 65151, 65279, 65408};
            field_j = new dm();
            return;
          } else {
            var4 = (int)(Math.pow((double)var3, 1.5) / 16.0);
            field_n[var3] = ud.d(ud.d(var4 * var1 >> -751257912 << -1546493688, var0 * var4 >> 1807909128 << -1467638800), var2 * var4 >> -1088854584);
            var3++;
            continue L0;
          }
        }
    }
}
