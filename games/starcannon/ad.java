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
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        try {
          L0: {
            L1: {
              stackIn_3_0 = this;

              if (!param5) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
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
                stackIn_10_0 = 0;
                break L3;
              } else {
                stackIn_10_0 = this.field_B * 2 + this.field_w;
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
            stackIn_14_0 = (RuntimeException) (var12);

            stackIn_14_1 = new StringBuilder().append("ad.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param9).append(',');

            if (param10 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_15_0), stackIn_21_2 + ')');
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
        var1 = hj.field_c;
        synchronized (var1) {
          L0: {
            if (wg.field_b == hc.field_b) {
              stackIn_4_0 = 0;
              return stackIn_4_0 != 0;
            } else {
              var2 = -107 % ((11 - param0) / 48);
              lb.field_B = pe.field_e[wg.field_b];
              StarCannon.field_E = ik.field_s[wg.field_b];
              wg.field_b = 127 & wg.field_b + 1;
              stackIn_6_0 = 1;
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
        this.field_F.a(this.field_A, var7 + (var5 - -this.field_B), var6 - -this.field_B, -this.field_B + this.field_w, -(2 * this.field_B) + this.field_f, this.field_x, -1, this.field_E ? 0 : 2, 1, this.field_F.field_p);
    }

    final static void a(int param0, int[] param1, boolean param2) {
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        lk var4 = null;
        int[] var5_ref_int__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
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
                  L7: {
                    if (-3 != (param0 ^ -1)) {
                      break L7;
                    } else {
                      if (!wk.a(54)) {
                        var6 = bj.field_c[param0];
                        bj.field_c[param0] = 120;
                        bi.field_c[param0] = bi.field_c[param0] + (bj.field_c[param0] - var6);
                        qi.field_a[param0] = 350;
                        b.field_c[param0] = b.field_c[param0] + 10;
                        break L7;
                      } else {
                        qi.field_a[param0] = 360 - -b.field_c[param0];
                        bj.field_c[param0] = 120;
                        break L6;
                      }
                    }
                  }
                  break L6;
                }
                break L0;
              } else {
                L8: {
                  var7 = var5_ref_int__[var6];
                  var8 = mj.field_c[var7];
                  if (19 != var7) {
                    if (var7 != 20) {
                      L9: {
                        if (var8 == null) {
                          var8 = "ERROR: missing text";
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        if (-13 == (var7 ^ -1)) {
                          break L10;
                        } else {
                          if ((var7 ^ -1) != -14) {
                            var9 = var4.a(var8);
                            if (var9 > var3_int) {
                              var3_int = var9;
                              break L8;
                            } else {
                              var6++;
                              continue L1;
                            }
                          } else {
                            break L10;
                          }
                        }
                      }
                      var9 = ak.field_e - -64 + 9;
                      if (var3_int < var9) {
                        var3_int = var9;
                        break L8;
                      } else {
                        break L8;
                      }
                    } else {
                      L11: {
                        var9 = var4.a(ec.field_d);
                        if (var3_int < var9) {
                          var3_int = var9;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      L12: {
                        var9 = var4.a(fd.field_d);
                        if (var3_int < var9) {
                          var3_int = var9;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      var9 = var4.a(gh.field_A);
                      if (var3_int < var9) {
                        var3_int = var9;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  } else {
                    L13: {
                      var9 = var4.a(cf.field_k);
                      if (var9 > var3_int) {
                        var3_int = var9;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    L14: {
                      var9 = var4.a(fl.field_g);
                      if (var3_int >= var9) {
                        break L14;
                      } else {
                        var3_int = var9;
                        break L14;
                      }
                    }
                    var9 = var4.a(hg.field_D);
                    if (var9 > var3_int) {
                      var3_int = var9;
                      break L8;
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
          L15: {
            var3 = decompiledCaughtException;
            stackIn_50_0 = (RuntimeException) (var3);

            stackIn_50_1 = new StringBuilder().append("ad.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "null";
              break L15;
            } else {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "{...}";
              break L15;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_51_0), stackIn_51_2 + ',' + param2 + ')');
        }
    }

    final static sk a(int param0, String param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        sk stackIn_4_0 = null;
        sk stackIn_8_0 = null;
        sk stackIn_19_0 = null;
        sk stackIn_22_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = StarCannon.field_A;
        try {
          L0: {
            var2_int = param1.length();
            if (var2_int == 0) {
              stackIn_4_0 = qb.field_b;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((var2_int ^ -1) < -64) {
                stackIn_8_0 = ai.field_a;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param0 < -67) {
                    break L1;
                  } else {
                    ad.e((byte) 85);
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
                          stackIn_22_0 = ra.field_t;
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
                        stackIn_19_0 = ra.field_t;
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
            stackIn_27_0 = (RuntimeException) (var2);

            stackIn_27_1 = new StringBuilder().append("ad.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L5;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
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
