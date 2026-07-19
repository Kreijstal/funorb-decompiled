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
              ((ad) (this)).field_E = stackIn_4_1 != 0;
              this.field_w = param6;
              this.field_x = param9;
              this.field_A = param10;
              this.field_B = param7;
              this.field_F = param8;
              this.field_t = param4;
              var12_int = this.field_w + -this.field_B;
              var13 = this.field_F.a(param10, var12_int, this.field_F.field_p) - -(this.field_B * 2);
              if (var13 <= param3) {
                var13 = param3;
                break L2;
              } else {
                this.a(param0, param2, (byte) 119, var13, param1);
                break L2;
              }
            }
            L3: {
              if (this.field_E) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = this.field_B * 2 + this.field_w;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            var14 = stackIn_10_0;
            this.field_t.a(var14, param2 - (this.field_w - -(this.field_B * 3)), (byte) 116, -(2 * this.field_B) + param3, (-param3 + var13 >> -102011359) + this.field_B);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var12);
            stackOut_12_1 = new StringBuilder().append("ad.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param8 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param9).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param10 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
    }

    public static void f(byte param0) {
        field_D = null;
        if (param0 > -88) {
            field_C = (ta) null;
        }
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
        var1 = hj.field_c;
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
        if (param1 < 10) {
            field_y = -37;
        }
        return param0 == (-param0 & param0) ? true : false;
    }

    final String d(int param0) {
        int var2 = this.field_t.field_h ? 1 : 0;
        this.field_t.field_h = this.field_h;
        String var3 = this.field_t.d(param0);
        this.field_t.field_h = var2 != 0 ? true : false;
        return var3;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = param1 + this.field_s;
        int var6 = this.field_j + param3;
        super.a(param0, param1, param2, param3);
        if (!(param0 == 0)) {
            return;
        }
        int var7 = this.field_E ? -this.field_w + this.field_i - this.field_B * 2 : 0;
        int discarded$0 = this.field_F.a(this.field_A, var7 + (var5 - -this.field_B), var6 - -this.field_B, -this.field_B + this.field_w, -(2 * this.field_B) + this.field_f, this.field_x, -1, this.field_E ? 0 : 2, 1, this.field_F.field_p);
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
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
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
                    var5 = var3_int - -20 >> -1993116383;
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
                  if (param2) {
                    break L4;
                  } else {
                    field_y = 17;
                    break L4;
                  }
                }
                L5: {
                  if (param0 != 3) {
                    break L5;
                  } else {
                    qi.field_a[param0] = 400;
                    break L5;
                  }
                }
                L6: {
                  if (-3 != (param0 ^ -1)) {
                    break L6;
                  } else {
                    if (!wk.a(54)) {
                      var6 = bj.field_c[param0];
                      bj.field_c[param0] = 120;
                      bi.field_c[param0] = bi.field_c[param0] + (bj.field_c[param0] - var6);
                      qi.field_a[param0] = 350;
                      b.field_c[param0] = b.field_c[param0] + 10;
                      break L6;
                    } else {
                      qi.field_a[param0] = 360 - -b.field_c[param0];
                      bj.field_c[param0] = 120;
                      break L6;
                    }
                  }
                }
                break L0;
              } else {
                L7: {
                  var7 = var5_ref_int__[var6];
                  var8 = mj.field_c[var7];
                  if (19 != var7) {
                    if (var7 != 20) {
                      L8: {
                        if (var8 == null) {
                          var8 = "ERROR: missing text";
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      L9: {
                        if (-13 == (var7 ^ -1)) {
                          break L9;
                        } else {
                          if ((var7 ^ -1) != -14) {
                            var9 = var4.a(var8);
                            if (var9 > var3_int) {
                              var3_int = var9;
                              break L7;
                            } else {
                              var6++;
                              continue L1;
                            }
                          } else {
                            break L9;
                          }
                        }
                      }
                      var9 = ak.field_e - -64 + 9;
                      if (var3_int < var9) {
                        var3_int = var9;
                        break L7;
                      } else {
                        break L7;
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
                        break L7;
                      } else {
                        break L7;
                      }
                    }
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
                    var9 = var4.a(hg.field_D);
                    if (var9 > var3_int) {
                      var3_int = var9;
                      break L7;
                    } else {
                      var6++;
                      continue L1;
                    }
                  }
                }
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var3 = decompiledCaughtException;
            stackOut_48_0 = (RuntimeException) (var3);
            stackOut_48_1 = new StringBuilder().append("ad.E(").append(param0).append(',');
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param1 == null) {
              stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L14;
            } else {
              stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackOut_49_2 = "{...}";
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              break L14;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_51_0), stackIn_51_2 + ',' + param2 + ')');
        }
    }

    final static sk a(int param0, String param1) {
        boolean discarded$2 = false;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        sk stackIn_4_0 = null;
        sk stackIn_8_0 = null;
        sk stackIn_19_0 = null;
        sk stackIn_22_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        sk stackOut_3_0 = null;
        sk stackOut_7_0 = null;
        sk stackOut_21_0 = null;
        sk stackOut_18_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var5 = StarCannon.field_A;
        try {
          L0: {
            var2_int = param1.length();
            if (var2_int == 0) {
              stackOut_3_0 = qb.field_b;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((var2_int ^ -1) < -64) {
                stackOut_7_0 = ai.field_a;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param0 < -67) {
                    break L1;
                  } else {
                    discarded$2 = ad.e((byte) 85);
                    break L1;
                  }
                }
                var3 = 0;
                L2: while (true) {
                  if (var3 < var2_int) {
                    L3: {
                      var4 = param1.charAt(var3);
                      if (45 != var4) {
                        if (0 != (sg.field_o.indexOf(var4) ^ -1)) {
                          break L3;
                        } else {
                          stackOut_21_0 = ra.field_t;
                          stackIn_22_0 = stackOut_21_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      } else {
                        L4: {
                          if (var3 == 0) {
                            break L4;
                          } else {
                            if (-1 + var2_int == var3) {
                              break L4;
                            } else {
                              break L3;
                            }
                          }
                        }
                        stackOut_18_0 = ra.field_t;
                        stackIn_19_0 = stackOut_18_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                    var3++;
                    continue L2;
                  } else {
                    return null;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var2);
            stackOut_25_1 = new StringBuilder().append("ad.D(").append(param0).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L5;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L5;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_19_0;
            } else {
              return stackIn_22_0;
            }
          }
        }
    }

    static {
        field_D = new int[8192];
    }
}
