/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad extends kf {
    static int[] field_D;
    private String field_A;
    static int field_y;
    private qe field_F;
    private boolean field_E;
    private int field_B;
    static hl[] field_z;
    static ta field_C;
    private int field_w;
    private int field_x;

    ad(int param0, int param1, int param2, int param3, uj param4, boolean param5, int param6, int param7, qe param8, int param9, String param10) {
        super(param0, param1, param2, param3, (de) null, (qg) null);
        RuntimeException var12 = null;
        int var12_int = 0;
        int var13 = 0;
        int var14 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param5) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((ad) this).field_E = stackIn_4_1 != 0;
              ((ad) this).field_w = param6;
              ((ad) this).field_x = param9;
              ((ad) this).field_A = param10;
              ((ad) this).field_B = param7;
              ((ad) this).field_F = param8;
              ((ad) this).field_t = param4;
              var12_int = ((ad) this).field_w + -((ad) this).field_B;
              var13 = ((ad) this).field_F.a(param10, var12_int, ((ad) this).field_F.field_p) - -(((ad) this).field_B * 2);
              if (var13 <= param3) {
                var13 = param3;
                break L2;
              } else {
                ((ad) this).a(param0, param2, (byte) 119, var13, param1);
                break L2;
              }
            }
            L3: {
              if (((ad) this).field_E) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = ((ad) this).field_B * 2 + ((ad) this).field_w;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            var14 = stackIn_10_0;
            ((ad) this).field_t.a(var14, param2 - (((ad) this).field_w - -(((ad) this).field_B * 3)), (byte) 116, -(2 * ((ad) this).field_B) + param3, (-param3 + var13 >> 1) + ((ad) this).field_B);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var12;
            stackOut_12_1 = new StringBuilder().append("ad.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param8 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param9).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param10 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
    }

    public static void f(byte param0) {
        field_D = null;
        field_C = null;
        field_z = null;
    }

    final static boolean e(byte param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        var1 = (Object) (Object) hj.field_c;
        synchronized (var1) {
          L0: {
            if (wg.field_b == hc.field_b) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              var2 = -107 % ((11 - param0) / 48);
              lb.field_B = pe.field_e[wg.field_b];
              StarCannon.field_E = ik.field_s[wg.field_b];
              wg.field_b = 127 & wg.field_b + 1;
              stackOut_5_0 = 1;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            }
          }
        }
        return stackIn_6_0 != 0;
    }

    final static boolean a(int param0, int param1) {
        return param0 == (-param0 & param0);
    }

    final String d(int param0) {
        int var2 = ((ad) this).field_t.field_h ? 1 : 0;
        ((ad) this).field_t.field_h = ((ad) this).field_h;
        String var3 = ((ad) this).field_t.d(param0);
        ((ad) this).field_t.field_h = var2 != 0 ? true : false;
        return var3;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = param1 + ((ad) this).field_s;
        int var6 = ((ad) this).field_j + param3;
        super.a(param0, param1, param2, param3);
        if (!(param0 == 0)) {
            return;
        }
        int var7 = ((ad) this).field_E ? -((ad) this).field_w + ((ad) this).field_i - ((ad) this).field_B * 2 : 0;
        int discarded$0 = ((ad) this).field_F.a(((ad) this).field_A, var7 + (var5 - -((ad) this).field_B), var6 - -((ad) this).field_B, -((ad) this).field_B + ((ad) this).field_w, -(2 * ((ad) this).field_B) + ((ad) this).field_f, ((ad) this).field_x, -1, ((ad) this).field_E ? 0 : 2, 1, ((ad) this).field_F.field_p);
    }

    final static void a(int param0, int[] param1, boolean param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        lk var4 = null;
        int[] var5_ref_int__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        var10 = StarCannon.field_A;
        try {
          L0: {
            jh.field_c[param0] = param1;
            var3_int = 0;
            var4 = a.field_b;
            var5_ref_int__ = param1;
            var6 = 0;
            L1: while (true) {
              if (var6 >= var5_ref_int__.length) {
                L2: {
                  L3: {
                    var5 = var3_int - -20 >> 1;
                    bj.field_c[param0] = -var5 + 320;
                    bi.field_c[param0] = 320 - -var5;
                    qi.field_a[param0] = -(param1.length * 15) + 272;
                    b.field_c[param0] = 30;
                    if (4 == param0) {
                      break L3;
                    } else {
                      if (param0 == 5) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                  qi.field_a[param0] = 400;
                  bj.field_c[param0] = 100;
                  break L2;
                }
                L4: {
                  if (param0 != 3) {
                    break L4;
                  } else {
                    qi.field_a[param0] = 400;
                    break L4;
                  }
                }
                L5: {
                  if (param0 != 2) {
                    break L5;
                  } else {
                    if (!wk.a(54)) {
                      var6 = bj.field_c[param0];
                      bj.field_c[param0] = 120;
                      bi.field_c[param0] = bi.field_c[param0] + (bj.field_c[param0] - var6);
                      qi.field_a[param0] = 350;
                      b.field_c[param0] = b.field_c[param0] + 10;
                      break L5;
                    } else {
                      qi.field_a[param0] = 360 - -b.field_c[param0];
                      bj.field_c[param0] = 120;
                      break L5;
                    }
                  }
                }
                break L0;
              } else {
                var7 = var5_ref_int__[var6];
                var8 = mj.field_c[var7];
                if (19 != var7) {
                  L6: {
                    if (var7 != 20) {
                      L7: {
                        if (var8 == null) {
                          var8 = "ERROR: missing text";
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      L8: {
                        if (var7 == 12) {
                          break L8;
                        } else {
                          if (var7 != 13) {
                            L9: {
                              var9 = var4.a(var8);
                              if (var9 <= var3_int) {
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            var6++;
                            continue L1;
                          } else {
                            break L8;
                          }
                        }
                      }
                      var9 = ak.field_e + 73;
                      if (var3_int < var9) {
                        var3_int = var9;
                        break L6;
                      } else {
                        break L6;
                      }
                    } else {
                      L10: {
                        var9 = var4.a(ec.field_d);
                        if (var3_int < var9) {
                          var3_int = var9;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        var9 = var4.a(fd.field_d);
                        if (var3_int < var9) {
                          var3_int = var9;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      var9 = var4.a(gh.field_A);
                      if (var3_int < var9) {
                        var3_int = var9;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var6++;
                  continue L1;
                } else {
                  L12: {
                    var9 = var4.a(cf.field_k);
                    if (var9 > var3_int) {
                      var3_int = var9;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    var9 = var4.a(fl.field_g);
                    if (var3_int >= var9) {
                      break L13;
                    } else {
                      var3_int = var9;
                      break L13;
                    }
                  }
                  L14: {
                    var9 = var4.a(hg.field_D);
                    if (var9 <= var3_int) {
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  var6++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var3 = decompiledCaughtException;
            stackOut_46_0 = (RuntimeException) var3;
            stackOut_46_1 = new StringBuilder().append("ad.E(").append(param0).append(',');
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param1 == null) {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L15;
            } else {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "{...}";
              stackIn_49_0 = stackOut_47_0;
              stackIn_49_1 = stackOut_47_1;
              stackIn_49_2 = stackOut_47_2;
              break L15;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_49_0, stackIn_49_2 + ',' + true + ')');
        }
    }

    final static sk a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        sk stackIn_4_0 = null;
        sk stackIn_8_0 = null;
        sk stackIn_17_0 = null;
        sk stackIn_20_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        sk stackOut_3_0 = null;
        sk stackOut_7_0 = null;
        sk stackOut_19_0 = null;
        sk stackOut_16_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var5 = StarCannon.field_A;
        try {
          var2_int = param1.length();
          if (var2_int == 0) {
            stackOut_3_0 = qb.field_b;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          } else {
            if (var2_int > 63) {
              stackOut_7_0 = ai.field_a;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            } else {
              var3 = 0;
              L0: while (true) {
                if (~var3 > ~var2_int) {
                  L1: {
                    var4 = param1.charAt(var3);
                    if (45 != var4) {
                      if (sg.field_o.indexOf(var4) != -1) {
                        break L1;
                      } else {
                        stackOut_19_0 = ra.field_t;
                        stackIn_20_0 = stackOut_19_0;
                        return stackIn_20_0;
                      }
                    } else {
                      L2: {
                        if (var3 == 0) {
                          break L2;
                        } else {
                          if (~(-1 + var2_int) == ~var3) {
                            break L2;
                          } else {
                            break L1;
                          }
                        }
                      }
                      stackOut_16_0 = ra.field_t;
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0;
                    }
                  }
                  var3++;
                  continue L0;
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var2;
            stackOut_23_1 = new StringBuilder().append("ad.D(").append(-127).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L3;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = new int[8192];
    }
}
