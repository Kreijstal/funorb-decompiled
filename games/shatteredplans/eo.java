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
        int var3_int = 0;
        try {
            ((eo) this).field_gb = param1;
            if (((eo) this).field_gb != null) {
                var3_int = sl.field_p.c(((eo) this).field_gb, 260, sl.field_p.field_J);
                ((eo) this).b(150 + var3_int, 300, (byte) -122);
            }
            ((eo) this).field_bb = new md(13, 50, 274, 30, 15, 2113632, 4210752);
            ((eo) this).field_bb.field_L = true;
            ((eo) this).field_db = false;
            ((eo) this).field_jb = false;
            ((eo) this).b((byte) -73, (vg) (Object) ((eo) this).field_bb);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "eo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, int param1) {
        return param0 == (-param0 & param0);
    }

    final static void a(boolean param0, int param1, int param2, byte param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        double var7_double = 0.0;
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
        double stackIn_26_0 = 0.0;
        RuntimeException decompiledCaughtException = null;
        double stackOut_25_0 = 0.0;
        double stackOut_24_0 = 0.0;
        var58 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_double = Math.sqrt((double)((param5 - param6) * (param5 - param6) - -((param2 - param1) * (param2 - param1))));
              var9 = (double)(param5 + -param6) / var7_double;
              var11 = (double)(-param1 + param2) / var7_double;
              if (param5 > param6) {
                var13 = param6;
                var14 = param5;
                break L1;
              } else {
                var14 = param6;
                var13 = param5;
                break L1;
              }
            }
            L2: {
              if (~param2 >= ~param1) {
                var16 = param1;
                var15 = param2;
                break L2;
              } else {
                var16 = param2;
                var15 = param1;
                break L2;
              }
            }
            L3: {
              if (0.0 >= var9) {
                var16 += 4;
                var15 = (int)((double)var15 + (var7_double * var9 / 10.0 - 5.0));
                break L3;
              } else {
                var15 -= 4;
                var16 = (int)((double)var16 + (4.0 + var9 * var7_double / 10.0));
                break L3;
              }
            }
            L4: {
              if (var11 <= 0.0) {
                var14 = (int)((double)var14 - (-5.0 + var7_double * var11 / 10.0));
                var13 -= 4;
                break L4;
              } else {
                var14 += 4;
                var13 = (int)((double)var13 - (5.0 + var7_double * var11 / 10.0));
                break L4;
              }
            }
            L5: {
              if (var13 >= 0) {
                break L5;
              } else {
                var13 = 0;
                break L5;
              }
            }
            L6: {
              if (0 > var15) {
                var15 = 0;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (var14 > 639) {
                var14 = 639;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (var16 <= 479) {
                break L8;
              } else {
                var16 = 479;
                break L8;
              }
            }
            L9: {
              var37 = 1.0 / var7_double;
              var39 = var7_double / 2.0;
              var41 = 1.0 / var39;
              if (var11 == 0.0) {
                stackOut_25_0 = 0.0;
                stackIn_26_0 = stackOut_25_0;
                break L9;
              } else {
                stackOut_24_0 = 1.0 / var11;
                stackIn_26_0 = stackOut_24_0;
                break L9;
              }
            }
            L10: {
              var43 = stackIn_26_0;
              var45 = var7_double / 10.0;
              var47 = (double)(param1 - param2);
              var49 = (double)(-param5 + param6);
              var51 = Math.sqrt(var47 * var47 + var49 * var49);
              var49 = var49 / var51;
              var47 = var47 / var51;
              var55 = -110 % ((param3 - 18) / 50);
              var53 = (var45 + 4.0) / Math.cos(Math.atan(var9 / var11));
              if (0.0 <= var53) {
                break L10;
              } else {
                var53 = -var53;
                break L10;
              }
            }
            var56 = 0;
            L11: while (true) {
              if (~var56 <= ~(var16 + (1 - var15))) {
                break L0;
              } else {
                L12: {
                  var34 = var15 + (var56 + -param1);
                  var26 = (double)var34 * var43;
                  var28 = (double)param6 + var9 * var26;
                  if (var11 < 0.0) {
                    var36 = (int)(var28 + var53) - -1 + -var13;
                    var35 = (int)((double)(-var13) + (var28 - 8.0));
                    if (~(-var13 + (var14 + 1)) > ~var36) {
                      var36 = 1 + (var14 - var13);
                      break L12;
                    } else {
                      break L12;
                    }
                  } else {
                    if (var11 != 0.0) {
                      var36 = (int)((double)(-var13) + (8.0 + var28));
                      var35 = -var13 + (int)(var28 - var53);
                      if (var35 >= 0) {
                        break L12;
                      } else {
                        var35 = 0;
                        break L12;
                      }
                    } else {
                      var36 = 1 - -var14 + -var13;
                      var35 = 0;
                      break L12;
                    }
                  }
                }
                var57 = var35;
                L13: while (true) {
                  if (~var36 >= ~var57) {
                    var56++;
                    continue L11;
                  } else {
                    L14: {
                      var32 = -var28 + (double)(var57 + var13);
                      var20 = -(var32 * var49) + var26;
                      if (0.0 <= var20) {
                        if (var20 <= var7_double * (double)param4 / 200.0) {
                          L15: {
                            if (var7_double / 4.0 > var20) {
                              var18 = 1.0 + var37 * (4.0 * var20 * 3.0);
                              break L15;
                            } else {
                              var18 = 4.0;
                              break L15;
                            }
                          }
                          L16: {
                            if (var11 != 0.0) {
                              var24 = var32 * var47;
                              break L16;
                            } else {
                              var24 = var9 * (double)var34;
                              break L16;
                            }
                          }
                          L17: {
                            var22 = var45 - (-var39 + var20) * (var20 - var39) * var41 * 0.2;
                            var30 = -var22 + var24;
                            if (var30 < 0.0) {
                              var30 = -var30;
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          if (var30 > var18) {
                            break L14;
                          } else {
                            L18: {
                              if (var20 > var7_double) {
                                var30 = Math.sqrt((double)((var13 - -var57 - param5) * (-param5 + var13 + var57) - -((var15 - (-var56 + param2)) * (-param2 + var56 + var15))));
                                if (var30 <= var18) {
                                  break L18;
                                } else {
                                  break L14;
                                }
                              } else {
                                break L18;
                              }
                            }
                            var17 = (int)(160.0 * (var18 - var30) / var18);
                            if (!param0) {
                              gf.c(var13 + var57, var56 + var15, 16777215, var17);
                              break L14;
                            } else {
                              gf.a(var57, var56, var17 << 24 | 16777215);
                              break L14;
                            }
                          }
                        } else {
                          break L14;
                        }
                      } else {
                        break L14;
                      }
                    }
                    var57++;
                    continue L13;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var7, "eo.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        super.a(param0, param1, param2);
        sl.field_p.c(((eo) this).field_eb, (((eo) this).field_x >> 1) + param0, param1 + param2, 16777215, -1);
        if (!(null == ((eo) this).field_gb)) {
            gf.f(20 + param0, param2 + 113, 260, 8421504);
            int discarded$0 = sl.field_p.a(((eo) this).field_gb, param0 - -20, 8 + (param2 - -120), 260, 100, 16777215, -1, 1, 0, sl.field_p.field_J);
        }
    }

    final static void a(nc param0, boolean param1, int param2, nc param3) {
        RuntimeException var4 = null;
        float var4_float = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        int var7_int = 0;
        float var8 = 0.0f;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var4_float = -param0.field_h + param3.field_h;
            var5 = param3.field_l - param0.field_l;
            var6 = param3.field_s * param0.field_i - param0.field_s * param3.field_i;
            if (var6 == 0.0f) {
              if (param1) {
                L1: {
                  if (param0.field_i <= 0.0f) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    break L1;
                  } else {
                    stackOut_8_0 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    break L1;
                  }
                }
                L2: {
                  var7_int = stackIn_10_0;
                  if (0.0f >= param0.field_s) {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    break L2;
                  } else {
                    stackOut_11_0 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    break L2;
                  }
                }
                L3: {
                  var8_int = stackIn_13_0;
                  if (0.0f >= param3.field_i) {
                    stackOut_15_0 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    break L3;
                  } else {
                    stackOut_14_0 = 1;
                    stackIn_16_0 = stackOut_14_0;
                    break L3;
                  }
                }
                L4: {
                  var9 = stackIn_16_0;
                  if (0.0f >= param3.field_s) {
                    stackOut_18_0 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    break L4;
                  } else {
                    stackOut_17_0 = 1;
                    stackIn_19_0 = stackOut_17_0;
                    break L4;
                  }
                }
                L5: {
                  var10 = stackIn_19_0;
                  if (var7_int != 0) {
                    stackOut_21_0 = 0;
                    stackIn_22_0 = stackOut_21_0;
                    break L5;
                  } else {
                    stackOut_20_0 = 1;
                    stackIn_22_0 = stackOut_20_0;
                    break L5;
                  }
                }
                L6: {
                  stackOut_22_0 = stackIn_22_0;
                  stackIn_24_0 = stackOut_22_0;
                  stackIn_23_0 = stackOut_22_0;
                  if (var9 != 0) {
                    stackOut_24_0 = stackIn_24_0;
                    stackOut_24_1 = 0;
                    stackIn_25_0 = stackOut_24_0;
                    stackIn_25_1 = stackOut_24_1;
                    break L6;
                  } else {
                    stackOut_23_0 = stackIn_23_0;
                    stackOut_23_1 = 1;
                    stackIn_25_0 = stackOut_23_0;
                    stackIn_25_1 = stackOut_23_1;
                    break L6;
                  }
                }
                L7: {
                  if (stackIn_25_0 != stackIn_25_1) {
                    break L7;
                  } else {
                    if (var10 != var8_int) {
                      break L7;
                    } else {
                      if (param3.field_i * param3.field_i + param3.field_s * param3.field_s < param0.field_s * param0.field_s + param0.field_i * param0.field_i) {
                        param0.field_o = -10000.0f;
                        param0.field_j = 10000.0f;
                        break L7;
                      } else {
                        param3.field_j = 10000.0f;
                        param3.field_o = -10000.0f;
                        break L7;
                      }
                    }
                  }
                }
                return;
              } else {
                return;
              }
            } else {
              L8: {
                var7 = (-(param3.field_i * var5) + var4_float * param3.field_s) / var6;
                var8 = (var4_float * param0.field_s - var5 * param0.field_i) / var6;
                if (0.0f > var6) {
                  L9: {
                    if (var7 >= param0.field_o) {
                      break L9;
                    } else {
                      param0.field_k = param3;
                      param0.field_o = var7;
                      break L9;
                    }
                  }
                  if (var8 > param3.field_j) {
                    param3.field_r = param0;
                    param3.field_j = var8;
                    break L8;
                  } else {
                    break L8;
                  }
                } else {
                  L10: {
                    if (param3.field_o > var8) {
                      param3.field_k = param0;
                      param3.field_o = var8;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  if (var7 > param0.field_j) {
                    param0.field_r = param3;
                    param0.field_j = var7;
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_44_0 = (RuntimeException) var4;
            stackOut_44_1 = new StringBuilder().append("eo.WA(");
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param0 == null) {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L11;
            } else {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L11;
            }
          }
          L12: {
            stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
            stackOut_47_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(',').append(param1).append(',').append(-10000).append(',');
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param3 == null) {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L12;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L12;
            }
          }
          throw r.a((Throwable) (Object) stackIn_50_0, stackIn_50_2 + ')');
        }
    }

    final void a(boolean param0, String param1, int param2, float param3) {
        RuntimeException var5 = null;
        boolean stackIn_1_0 = false;
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        int stackIn_3_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        boolean stackOut_1_0 = false;
        int stackOut_1_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              stackOut_0_0 = ((eo) this).field_jb;
              stackIn_2_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if (param0) {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = 0;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                break L1;
              } else {
                stackOut_1_0 = stackIn_1_0;
                stackOut_1_1 = 1;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                break L1;
              }
            }
            L2: {
              if ((stackIn_3_0 ? 1 : 0) == stackIn_3_1) {
                L3: {
                  stackOut_5_0 = this;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (!param0) {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    break L3;
                  } else {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    break L3;
                  }
                }
                L4: {
                  ((eo) this).field_jb = stackIn_8_1 != 0;
                  if (((eo) this).field_jb) {
                    ((eo) this).field_bb.a(4210752, 8405024, -27855);
                    ((eo) this).field_bb.field_L = true;
                    break L4;
                  } else {
                    ((eo) this).field_bb.a(4210752, 2113632, -27855);
                    if (!((eo) this).field_db) {
                      break L4;
                    } else {
                      ((eo) this).field_bb.field_L = false;
                      break L4;
                    }
                  }
                }
                ((eo) this).field_eb = param1;
                ((eo) this).field_bb.field_y = (int)(param3 / 100.0f * (float)param2);
                break L2;
              } else {
                ((eo) this).field_eb = param1;
                ((eo) this).field_bb.field_y = (int)(param3 / 100.0f * (float)param2);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("eo.K(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw r.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void h() {
        field_kb = null;
        int var1 = 5;
        field_X = null;
        field_fb = null;
        field_cb = null;
        field_hb = null;
        field_ib = null;
        field_ab = null;
        field_Z = null;
    }

    final static void a(int[] param0, int[] param1, int param2, boolean param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 > param4) {
                L2: {
                  var5_int = (param4 - -param2) / 2;
                  var6 = param4;
                  var7 = param1[var5_int];
                  param1[var5_int] = param1[param2];
                  param1[param2] = var7;
                  var8 = param0[var5_int];
                  param0[var5_int] = param0[param2];
                  param0[param2] = var8;
                  if (var7 != 2147483647) {
                    stackOut_5_0 = 1;
                    stackIn_6_0 = stackOut_5_0;
                    break L2;
                  } else {
                    stackOut_4_0 = 0;
                    stackIn_6_0 = stackOut_4_0;
                    break L2;
                  }
                }
                var9 = stackIn_6_0;
                var10 = param4;
                L3: while (true) {
                  if (var10 >= param2) {
                    param1[param2] = param1[var6];
                    param1[var6] = var7;
                    param0[param2] = param0[var6];
                    param0[var6] = var8;
                    eo.a(param0, param1, -1 + var6, true, param4);
                    eo.a(param0, param1, param2, true, var6 + 1);
                    break L1;
                  } else {
                    L4: {
                      if (param1[var10] < var7 - -(var9 & var10)) {
                        var11 = param1[var10];
                        param1[var10] = param1[var6];
                        param1[var6] = var11;
                        var12 = param0[var10];
                        param0[var10] = param0[var6];
                        int incrementValue$1 = var6;
                        var6++;
                        param0[incrementValue$1] = var12;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var10++;
                    continue L3;
                  }
                }
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5;
            stackOut_16_1 = new StringBuilder().append("eo.J(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          L6: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw r.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param2 + ',' + true + ',' + param4 + ')');
        }
    }

    final static void f() {
        if (dp.field_t) {
            jp.g((byte) 118);
        }
        field_kb = null;
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
