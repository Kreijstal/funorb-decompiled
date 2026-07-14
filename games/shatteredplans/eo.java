/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eo extends jl {
    static String field_ib;
    private String field_gb;
    static String field_X;
    private boolean field_jb;
    static ih field_Z;
    private String field_eb;
    private boolean field_db;
    private md field_bb;
    static String field_hb;
    static String field_kb;
    static ob field_cb;
    static pf field_ab;
    static int field_Y;
    static int[] field_fb;

    final void p(int param0) {
        ((eo) this).field_db = true;
        if (param0 != 8305) {
            field_X = null;
        }
        ((eo) this).field_bb.field_L = false;
    }

    eo(tc param0, String param1) {
        super(param0, 300, 120);
        int var3 = 0;
        ((eo) this).field_gb = param1;
        if (((eo) this).field_gb != null) {
            var3 = sl.field_p.c(((eo) this).field_gb, 260, sl.field_p.field_J);
            ((eo) this).b(150 + var3, 300, (byte) -122);
        }
        ((eo) this).field_bb = new md(13, 50, 274, 30, 15, 2113632, 4210752);
        ((eo) this).field_bb.field_L = true;
        ((eo) this).field_db = false;
        ((eo) this).field_jb = false;
        ((eo) this).b((byte) -73, (vg) (Object) ((eo) this).field_bb);
    }

    final static boolean a(int param0, int param1) {
        if (param1 != 7433) {
            field_Z = null;
        }
        return param0 == (-param0 & param0) ? true : false;
    }

    final static void a(boolean param0, int param1, int param2, byte param3, int param4, int param5, int param6) {
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        double var18 = 0.0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        double var26 = 0.0;
        double var28 = 0.0;
        double var30 = 0.0;
        double var32 = 0.0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        double var37 = 0.0;
        double var39 = 0.0;
        double var41 = 0.0;
        double var43 = 0.0;
        double var45 = 0.0;
        double var47 = 0.0;
        double var49 = 0.0;
        double var51 = 0.0;
        double var53 = 0.0;
        int var55 = 0;
        int var56 = 0;
        int var57 = 0;
        int var58 = 0;
        double stackIn_25_0 = 0.0;
        double stackOut_24_0 = 0.0;
        double stackOut_23_0 = 0.0;
        L0: {
          var58 = ShatteredPlansClient.field_F ? 1 : 0;
          var7 = Math.sqrt((double)((param5 - param6) * (param5 - param6) - -((param2 - param1) * (param2 - param1))));
          var9 = (double)(param5 + -param6) / var7;
          var11 = (double)(-param1 + param2) / var7;
          if (param5 > param6) {
            var13 = param6;
            var14 = param5;
            break L0;
          } else {
            var14 = param6;
            var13 = param5;
            break L0;
          }
        }
        L1: {
          if (param2 <= param1) {
            var16 = param1;
            var15 = param2;
            break L1;
          } else {
            var16 = param2;
            var15 = param1;
            break L1;
          }
        }
        L2: {
          if (0.0 >= var9) {
            var16 += 4;
            var15 = (int)((double)var15 + (var7 * var9 / 10.0 - 5.0));
            break L2;
          } else {
            var15 -= 4;
            var16 = (int)((double)var16 + (4.0 + var9 * var7 / 10.0));
            break L2;
          }
        }
        L3: {
          if (var11 <= 0.0) {
            var14 = (int)((double)var14 - (-5.0 + var7 * var11 / 10.0));
            var13 -= 4;
            break L3;
          } else {
            var14 += 4;
            var13 = (int)((double)var13 - (5.0 + var7 * var11 / 10.0));
            break L3;
          }
        }
        L4: {
          if (-1 >= var13) {
            break L4;
          } else {
            var13 = 0;
            break L4;
          }
        }
        L5: {
          if (0 > var15) {
            var15 = 0;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (var14 > 639) {
            var14 = 639;
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          if (-480 >= var16) {
            break L7;
          } else {
            var16 = 479;
            break L7;
          }
        }
        L8: {
          var37 = 1.0 / var7;
          var39 = var7 / 2.0;
          var41 = 1.0 / var39;
          if (var11 == 0.0) {
            stackOut_24_0 = 0.0;
            stackIn_25_0 = stackOut_24_0;
            break L8;
          } else {
            stackOut_23_0 = 1.0 / var11;
            stackIn_25_0 = stackOut_23_0;
            break L8;
          }
        }
        L9: {
          var43 = stackIn_25_0;
          var45 = var7 / 10.0;
          var47 = (double)(param1 - param2);
          var49 = (double)(-param5 + param6);
          var51 = Math.sqrt(var47 * var47 + var49 * var49);
          var49 = var49 / var51;
          var47 = var47 / var51;
          var55 = -110 % ((param3 - 18) / 50);
          var53 = (var45 + 4.0) / Math.cos(Math.atan(var9 / var11));
          if (0.0 <= var53) {
            break L9;
          } else {
            var53 = -var53;
            break L9;
          }
        }
        var56 = 0;
        L10: while (true) {
          if (var56 >= var16 + (1 - var15)) {
            return;
          } else {
            L11: {
              var34 = var15 + (var56 + -param1);
              var26 = (double)var34 * var43;
              var28 = (double)param6 + var9 * var26;
              if (var11 < 0.0) {
                var36 = (int)(var28 + var53) - -1 + -var13;
                var35 = (int)((double)(-var13) + (var28 - 8.0));
                if (-var13 + (var14 + 1) < var36) {
                  var36 = 1 + (var14 - var13);
                  break L11;
                } else {
                  break L11;
                }
              } else {
                if (var11 != 0.0) {
                  var36 = (int)((double)(-var13) + (8.0 + var28));
                  var35 = -var13 + (int)(var28 - var53);
                  if ((var35 ^ -1) <= -1) {
                    break L11;
                  } else {
                    var35 = 0;
                    break L11;
                  }
                } else {
                  var36 = 1 - -var14 + -var13;
                  var35 = 0;
                  break L11;
                }
              }
            }
            var57 = var35;
            L12: while (true) {
              if (var36 <= var57) {
                var56++;
                continue L10;
              } else {
                var32 = -var28 + (double)(var57 + var13);
                var20 = -(var32 * var49) + var26;
                if (0.0 <= var20) {
                  if (var20 <= var7 * (double)param4 / 200.0) {
                    L13: {
                      if (var7 / 4.0 > var20) {
                        var18 = 1.0 + var37 * (4.0 * var20 * 3.0);
                        break L13;
                      } else {
                        var18 = 4.0;
                        break L13;
                      }
                    }
                    L14: {
                      if (var11 != 0.0) {
                        var24 = var32 * var47;
                        break L14;
                      } else {
                        var24 = var9 * (double)var34;
                        break L14;
                      }
                    }
                    L15: {
                      var22 = var45 - (-var39 + var20) * (var20 - var39) * var41 * 0.2;
                      var30 = -var22 + var24;
                      if (var30 < 0.0) {
                        var30 = -var30;
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    if (var30 <= var18) {
                      L16: {
                        if (var20 > var7) {
                          var30 = Math.sqrt((double)((var13 - -var57 - param5) * (-param5 + var13 + var57) - -((var15 - (-var56 + param2)) * (-param2 + var56 + var15))));
                          if (var30 <= var18) {
                            break L16;
                          } else {
                            var57++;
                            continue L12;
                          }
                        } else {
                          break L16;
                        }
                      }
                      var17 = (int)(160.0 * (var18 - var30) / var18);
                      if (!param0) {
                        gf.c(var13 + var57, var56 + var15, 16777215, var17);
                        var57++;
                        continue L12;
                      } else {
                        gf.a(var57, var56, var17 << 154789976 | 16777215);
                        var57++;
                        continue L12;
                      }
                    } else {
                      var57++;
                      continue L12;
                    }
                  } else {
                    var57++;
                    continue L12;
                  }
                } else {
                  var57++;
                  continue L12;
                }
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        super.a(param0, param1 + 0, param2);
        sl.field_p.c(((eo) this).field_eb, (((eo) this).field_x >> -710143807) + param0, param1 + param2, 16777215, -1);
        if (!(null == ((eo) this).field_gb)) {
            gf.f(20 + param0, param2 + 113, 260, 8421504);
            int discarded$0 = sl.field_p.a(((eo) this).field_gb, param0 - -20, 8 + (param2 - -120), 260, 100, 16777215, -1, 1, 0, sl.field_p.field_J);
        }
    }

    final static void a(nc param0, boolean param1, int param2, nc param3) {
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        int var7_int = 0;
        float var8 = 0.0f;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        var4 = -param0.field_h + param3.field_h;
        var5 = param3.field_l - param0.field_l;
        if (param2 == -10000) {
          var6 = param3.field_s * param0.field_i - param0.field_s * param3.field_i;
          if (var6 == 0.0f) {
            if (param1) {
              L0: {
                if (param0.field_i <= 0.0f) {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  break L0;
                } else {
                  stackOut_7_0 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  break L0;
                }
              }
              L1: {
                var7_int = stackIn_9_0;
                if (0.0f >= param0.field_s) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L1;
                } else {
                  stackOut_10_0 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  break L1;
                }
              }
              L2: {
                var8_int = stackIn_12_0;
                if (0.0f >= param3.field_i) {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L2;
                } else {
                  stackOut_13_0 = 1;
                  stackIn_15_0 = stackOut_13_0;
                  break L2;
                }
              }
              L3: {
                var9 = stackIn_15_0;
                if (0.0f >= param3.field_s) {
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  break L3;
                } else {
                  stackOut_16_0 = 1;
                  stackIn_18_0 = stackOut_16_0;
                  break L3;
                }
              }
              L4: {
                var10 = stackIn_18_0;
                if (var7_int != 0) {
                  stackOut_20_0 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  break L4;
                } else {
                  stackOut_19_0 = 1;
                  stackIn_21_0 = stackOut_19_0;
                  break L4;
                }
              }
              L5: {
                stackOut_21_0 = stackIn_21_0;
                stackIn_23_0 = stackOut_21_0;
                stackIn_22_0 = stackOut_21_0;
                if (var9 != 0) {
                  stackOut_23_0 = stackIn_23_0;
                  stackOut_23_1 = 0;
                  stackIn_24_0 = stackOut_23_0;
                  stackIn_24_1 = stackOut_23_1;
                  break L5;
                } else {
                  stackOut_22_0 = stackIn_22_0;
                  stackOut_22_1 = 1;
                  stackIn_24_0 = stackOut_22_0;
                  stackIn_24_1 = stackOut_22_1;
                  break L5;
                }
              }
              L6: {
                if (stackIn_24_0 != stackIn_24_1) {
                  break L6;
                } else {
                  if (var10 != var8_int) {
                    break L6;
                  } else {
                    if (param3.field_i * param3.field_i + param3.field_s * param3.field_s < param0.field_s * param0.field_s + param0.field_i * param0.field_i) {
                      param0.field_o = -10000.0f;
                      param0.field_j = 10000.0f;
                      break L6;
                    } else {
                      param3.field_j = 10000.0f;
                      param3.field_o = -10000.0f;
                      break L6;
                    }
                  }
                }
              }
              return;
            } else {
              return;
            }
          } else {
            L7: {
              var7 = (-(param3.field_i * var5) + var4 * param3.field_s) / var6;
              var8 = (var4 * param0.field_s - var5 * param0.field_i) / var6;
              if (0.0f > var6) {
                L8: {
                  if (var7 >= param0.field_o) {
                    break L8;
                  } else {
                    param0.field_k = param3;
                    param0.field_o = var7;
                    break L8;
                  }
                }
                if (var8 > param3.field_j) {
                  param3.field_r = param0;
                  param3.field_j = var8;
                  break L7;
                } else {
                  break L7;
                }
              } else {
                L9: {
                  if (param3.field_o > var8) {
                    param3.field_k = param0;
                    param3.field_o = var8;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                if (var7 > param0.field_j) {
                  param0.field_r = param3;
                  param0.field_j = var7;
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final void a(boolean param0, String param1, int param2, float param3) {
        if ((((eo) this).field_jb ? 1 : 0) != (!param0 ? 1 : 0)) {
            ((eo) this).field_eb = param1;
            ((eo) this).field_bb.field_y = (int)(param3 / 100.0f * (float)param2);
        } else {
            ((eo) this).field_jb = param0 ? true : false;
            if (!((eo) this).field_jb) {
                ((eo) this).field_bb.a(4210752, 2113632, -27855);
                // ifeq L117
                ((eo) this).field_bb.field_L = false;
            } else {
                ((eo) this).field_bb.a(4210752, 8405024, -27855);
                ((eo) this).field_bb.field_L = true;
            }
            ((eo) this).field_eb = param1;
            ((eo) this).field_bb.field_y = (int)(param3 / 100.0f * (float)param2);
        }
    }

    public static void h(byte param0) {
        field_kb = null;
        int var1 = 16 / ((47 - param0) / 37);
        field_X = null;
        field_fb = null;
        field_cb = null;
        field_hb = null;
        field_ib = null;
        field_ab = null;
        field_Z = null;
    }

    final static void a(int[] param0, int[] param1, int param2, boolean param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          var13 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param2 > param4) {
            L1: {
              var5 = (param4 - -param2) / 2;
              var6 = param4;
              var7 = param1[var5];
              param1[var5] = param1[param2];
              param1[param2] = var7;
              var8 = param0[var5];
              param0[var5] = param0[param2];
              param0[param2] = var8;
              if (var7 != 2147483647) {
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 0;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            var9 = stackIn_5_0;
            var10 = param4;
            L2: while (true) {
              if (var10 >= param2) {
                param1[param2] = param1[var6];
                param1[var6] = var7;
                param0[param2] = param0[var6];
                param0[var6] = var8;
                eo.a(param0, param1, -1 + var6, true, param4);
                eo.a(param0, param1, param2, true, var6 + 1);
                break L0;
              } else {
                if (param1[var10] < var7 - -(var9 & var10)) {
                  var11 = param1[var10];
                  param1[var10] = param1[var6];
                  param1[var6] = var11;
                  var12 = param0[var10];
                  param0[var10] = param0[var6];
                  var6++;
                  param0[var6] = var12;
                  var10++;
                  continue L2;
                } else {
                  var10++;
                  continue L2;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L3: {
          if (param3) {
            break L3;
          } else {
            field_kb = null;
            break L3;
          }
        }
    }

    final static void f(boolean param0) {
        if (dp.field_t) {
            jp.g((byte) 118);
        }
        if (param0) {
            field_kb = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_X = "Drawn";
        field_hb = "Turn: <%0>";
        field_ib = "Please try again in a few minutes.";
        field_kb = "Pending fleet order";
        field_Z = new ih();
        field_cb = new ob(256);
        field_ab = new pf();
        field_Y = 4;
    }
}
