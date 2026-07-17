/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md extends o {
    int field_j;
    static int field_o;
    int field_y;
    int field_q;
    boolean field_p;
    boolean field_l;
    jd field_u;
    rh field_h;
    int field_m;
    int field_i;
    private int field_w;
    static String field_s;
    int field_k;
    md field_g;
    gb field_r;
    md field_n;
    int field_x;
    int field_t;
    int field_v;

    final static void a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, byte param16) {
        int var17_int = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        L0: {
          var42 = AceOfSkies.field_G ? 1 : 0;
          if (param0 < 0) {
            break L0;
          } else {
            if (~re.field_f >= ~param15) {
              break L0;
            } else {
              L1: {
                if (0 <= param4) {
                  break L1;
                } else {
                  if (param8 >= 0) {
                    break L1;
                  } else {
                    if (param10 >= 0) {
                      break L1;
                    } else {
                      return;
                    }
                  }
                }
              }
              L2: {
                if (param4 < re.field_b) {
                  break L2;
                } else {
                  if (~param8 > ~re.field_b) {
                    break L2;
                  } else {
                    if (re.field_b <= param10) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                var34 = -param15 + param0;
                if (param15 != param14) {
                  L4: {
                    var18 = param4 << 16;
                    var17_int = param4 << 16;
                    var22 = param12 << 16;
                    var21 = param12 << 16;
                    var30 = param7 << 16;
                    var29 = param7 << 16;
                    var26 = param2 << 16;
                    var25 = param2 << 16;
                    var35 = -param15 + param14;
                    var19 = (-param4 + param8 << 16) / var35;
                    var20 = (-param4 + param10 << 16) / var34;
                    if (var19 >= var20) {
                      var36 = var19;
                      var19 = var20;
                      var20 = var36;
                      var32 = (param6 + -param7 << 16) / var35;
                      var24 = (param3 + -param12 << 16) / var35;
                      var31 = (param1 + -param7 << 16) / var34;
                      var33 = 1;
                      var27 = (-param2 + param9 << 16) / var34;
                      var28 = (param11 - param2 << 16) / var35;
                      var23 = (param13 + -param12 << 16) / var34;
                      break L4;
                    } else {
                      var23 = (-param12 + param3 << 16) / var35;
                      var27 = (param11 - param2 << 16) / var35;
                      var28 = (param9 + -param2 << 16) / var34;
                      var31 = (-param7 + param6 << 16) / var35;
                      var32 = (-param7 + param1 << 16) / var34;
                      var33 = 0;
                      var24 = (param13 + -param12 << 16) / var34;
                      break L4;
                    }
                  }
                  L5: {
                    L6: {
                      if (param15 >= 0) {
                        break L6;
                      } else {
                        if (param14 >= 0) {
                          param15 = -param15;
                          var18 = var18 + var20 * param15;
                          var22 = var22 + param15 * var24;
                          var30 = var30 + var32 * param15;
                          var26 = var26 + param15 * var28;
                          var29 = var29 + param15 * var31;
                          var21 = var21 + param15 * var23;
                          var25 = var25 + param15 * var27;
                          var17_int = var17_int + var19 * param15;
                          param15 = 0;
                          break L6;
                        } else {
                          param15 = param14 - param15;
                          var21 = var21 + var23 * param15;
                          var29 = var29 + param15 * var31;
                          var26 = var26 + var28 * param15;
                          var30 = var30 + param15 * var32;
                          var22 = var22 + var24 * param15;
                          var18 = var18 + var20 * param15;
                          var17_int = var17_int + var19 * param15;
                          var25 = var25 + var27 * param15;
                          param15 = param14;
                          break L5;
                        }
                      }
                    }
                    var36 = re.field_i[param15];
                    L7: while (true) {
                      if (param14 <= param15) {
                        break L5;
                      } else {
                        L8: {
                          var37 = var17_int >> 16;
                          if (~var37 > ~re.field_b) {
                            var38 = -(var17_int >> 16) + (var18 >> 16);
                            if (var38 == 0) {
                              if (var37 < 0) {
                                break L8;
                              } else {
                                if (re.field_b > var37) {
                                  s.a((byte) 118, var21, var29, param5, 0, 0, var38, var37 + var36, 0, var25);
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                            } else {
                              L9: {
                                var39 = (var22 + -var21) / var38;
                                var40 = (-var25 + var26) / var38;
                                var41 = (-var29 + var30) / var38;
                                if (~re.field_b >= ~(var38 + var37)) {
                                  var38 = -var37 + re.field_b + -1;
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              if (0 > var37) {
                                s.a((byte) 118, var21 - var37 * var39, -(var41 * var37) + var29, param5, var41, var40, var37 + var38, var36, var39, var25 - var40 * var37);
                                break L8;
                              } else {
                                s.a((byte) 118, var21, var29, param5, var41, var40, var38, var37 + var36, var39, var25);
                                break L8;
                              }
                            }
                          } else {
                            break L8;
                          }
                        }
                        param15++;
                        if (re.field_f > param15) {
                          var25 = var25 + var27;
                          var26 = var26 + var28;
                          var22 = var22 + var24;
                          var21 = var21 + var23;
                          var36 = var36 + vp.field_i;
                          var30 = var30 + var32;
                          var18 = var18 + var20;
                          var17_int = var17_int + var19;
                          var29 = var29 + var31;
                          continue L7;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  var36 = param0 + -param14;
                  if (0 == var36) {
                    var27 = 0;
                    var23 = 0;
                    var31 = 0;
                    var32 = 0;
                    var20 = 0;
                    var28 = 0;
                    var19 = 0;
                    var24 = 0;
                    break L3;
                  } else {
                    L10: {
                      var37 = param10 << 16;
                      var38 = param13 << 16;
                      var39 = param9 << 16;
                      if (var33 == 0) {
                        var25 = param11 << 16;
                        var29 = param6 << 16;
                        var21 = param3 << 16;
                        var17_int = param8 << 16;
                        break L10;
                      } else {
                        var26 = param11 << 16;
                        var30 = param6 << 16;
                        var18 = param8 << 16;
                        var22 = param3 << 16;
                        break L10;
                      }
                    }
                    var40 = param1 << 16;
                    var24 = (-var22 + var38) / var36;
                    var31 = (var40 + -var29) / var36;
                    var28 = (var39 + -var26) / var36;
                    var27 = (-var25 + var39) / var36;
                    var19 = (-var17_int + var37) / var36;
                    var20 = (-var18 + var37) / var36;
                    var23 = (-var21 + var38) / var36;
                    var32 = (var40 - var30) / var36;
                    break L3;
                  }
                } else {
                  L11: {
                    if (~param15 != ~param0) {
                      var35 = param0 - param14;
                      if (~param8 >= ~param4) {
                        var31 = (-param6 + param1 << 16) / var35;
                        var17_int = param8 << 16;
                        var29 = param6 << 16;
                        var22 = param12 << 16;
                        var30 = param7 << 16;
                        var25 = param11 << 16;
                        var20 = (-param4 + param10 << 16) / var34;
                        var23 = (-param3 + param13 << 16) / var35;
                        var18 = param4 << 16;
                        var26 = param2 << 16;
                        var19 = (-param8 + param10 << 16) / var35;
                        var28 = (-param2 + param9 << 16) / var34;
                        var27 = (param9 + -param11 << 16) / var35;
                        var21 = param3 << 16;
                        var32 = (param1 + -param7 << 16) / var34;
                        var24 = (param13 - param12 << 16) / var34;
                        break L11;
                      } else {
                        var28 = (-param11 + param9 << 16) / var35;
                        var21 = param12 << 16;
                        var24 = (-param3 + param13 << 16) / var35;
                        var26 = param11 << 16;
                        var29 = param7 << 16;
                        var22 = param3 << 16;
                        var32 = (param1 + -param6 << 16) / var35;
                        var31 = (param1 + -param7 << 16) / var34;
                        var19 = (-param4 + param10 << 16) / var34;
                        var25 = param2 << 16;
                        var23 = (-param12 + param13 << 16) / var34;
                        var17_int = param4 << 16;
                        var20 = (param10 - param8 << 16) / var35;
                        var18 = param8 << 16;
                        var30 = param6 << 16;
                        var27 = (param9 - param2 << 16) / var34;
                        break L11;
                      }
                    } else {
                      var28 = 0;
                      var20 = 0;
                      var21 = param12;
                      var18 = param8 << 16;
                      var22 = param3;
                      var31 = 0;
                      var25 = param2;
                      var24 = 0;
                      var19 = 0;
                      var23 = 0;
                      var17_int = param4 << 16;
                      var29 = param7;
                      var32 = 0;
                      var26 = param11;
                      var27 = 0;
                      var30 = param6;
                      break L11;
                    }
                  }
                  var33 = 0;
                  if (param15 < 0) {
                    param15 = Math.min(-param15, param14 + -param15);
                    var26 = var26 + var28 * param15;
                    var21 = var21 + var23 * param15;
                    var18 = var18 + var20 * param15;
                    var30 = var30 + param15 * var32;
                    var22 = var22 + var24 * param15;
                    var25 = var25 + var27 * param15;
                    var29 = var29 + param15 * var31;
                    var17_int = var17_int + param15 * var19;
                    param15 = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L12: {
                if (param16 <= -8) {
                  break L12;
                } else {
                  field_o = 50;
                  break L12;
                }
              }
              L13: {
                if (param15 < 0) {
                  param15 = -param15;
                  var21 = var21 + var23 * param15;
                  var18 = var18 + var20 * param15;
                  var25 = var25 + param15 * var27;
                  var29 = var29 + var31 * param15;
                  var30 = var30 + var32 * param15;
                  var26 = var26 + var28 * param15;
                  var22 = var22 + param15 * var24;
                  var17_int = var17_int + param15 * var19;
                  param15 = 0;
                  break L13;
                } else {
                  break L13;
                }
              }
              var35 = re.field_i[param15];
              L14: while (true) {
                if (param15 >= param0) {
                  return;
                } else {
                  L15: {
                    var36 = var17_int >> 16;
                    if (re.field_b <= var36) {
                      break L15;
                    } else {
                      var37 = -(var17_int >> 16) + (var18 >> 16);
                      if (0 != var37) {
                        L16: {
                          var38 = (var22 - var21) / var37;
                          var39 = (-var25 + var26) / var37;
                          var40 = (var30 + -var29) / var37;
                          if (re.field_b <= var36 - -var37) {
                            var37 = -1 + -var36 + re.field_b;
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                        if (var36 < 0) {
                          s.a((byte) 118, -(var38 * var36) + var21, var29 + -(var40 * var36), param5, var40, var39, var36 + var37, var35, var38, var25 - var36 * var39);
                          break L15;
                        } else {
                          s.a((byte) 118, var21, var29, param5, var40, var39, var37, var36 + var35, var38, var25);
                          break L15;
                        }
                      } else {
                        if (var36 < 0) {
                          break L15;
                        } else {
                          if (var36 < re.field_b) {
                            s.a((byte) 118, var21, var29, param5, 0, 0, var37, var36 - -var35, 0, var25);
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                      }
                    }
                  }
                  param15++;
                  if (~re.field_f >= ~param15) {
                    return;
                  } else {
                    var21 = var21 + var23;
                    var18 = var18 + var20;
                    var22 = var22 + var24;
                    var17_int = var17_int + var19;
                    var25 = var25 + var27;
                    var30 = var30 + var32;
                    var35 = var35 + vp.field_i;
                    var29 = var29 + var31;
                    var26 = var26 + var28;
                    continue L14;
                  }
                }
              }
            }
          }
        }
    }

    private final void a(byte param0, kc param1, gb param2) {
        try {
            ((md) this).field_d.a(param1, true);
            ((md) this).field_r = param2;
            ((md) this).field_j = 0;
            ((md) this).field_y = ((md) this).field_r.field_d;
            ((md) this).field_k = ((md) this).field_r.field_e;
            ((md) this).field_l = false;
            ((md) this).field_t = 92;
            ((md) this).field_u = qo.field_e;
            ((md) this).field_b = ((md) this).field_r.field_i;
            ((md) this).field_e = (double)qq.a(20, 256);
            ((md) this).field_g = null;
            ((md) this).field_q = 0;
            ((md) this).field_i = 0;
            ((md) this).field_n = null;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "md.I(" + 86 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    md(kc param0, gb param1) {
        super(param0);
        ((md) this).field_p = false;
        ((md) this).field_g = null;
        ((md) this).field_n = null;
        ((md) this).field_m = 0;
        ((md) this).field_v = -1;
        ((md) this).field_x = 0;
        try {
            this.a((byte) 86, param0, param1);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "md.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(int param0, int param1, hc param2, int param3, mg param4, int param5, int param6, int param7, int param8, hc param9, byte param10, mg param11, int param12, int param13, int param14, int param15, int param16, mg param17, int param18, int param19, int param20) {
        int var21_int = 0;
        RuntimeException var21 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
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
            sn.a(param9, param7, 24097, param2);
            hh.a(param6, param18, -92, param20, param5);
            mb.a(param8, param15, (byte) 121);
            var21_int = 4;
            ef.a(119, param17, param4, param16, param13, param0);
            uc.a(param11, 25345, param3, param19);
            ql.a(param12, 2048, param14, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var21 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var21;
            stackOut_2_1 = new StringBuilder().append("md.L(").append(param0).append(44).append(param1).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44).append(param3).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param4 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44).append(param8).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param9 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44).append(106).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param11 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44).append(param12).append(44).append(param13).append(44).append(param14).append(44).append(param15).append(44).append(param16).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param17 == null) {
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
          throw pn.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param18 + 44 + param19 + 44 + param20 + 41);
        }
    }

    final void a(int param0, byte param1, md param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        int var13 = 0;
        int var14_int = 0;
        double var14 = 0.0;
        int var16 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        jd stackIn_16_1 = null;
        int stackIn_25_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_13_0 = null;
        Object stackOut_15_0 = null;
        jd stackOut_15_1 = null;
        Object stackOut_14_0 = null;
        jd stackOut_14_1 = null;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        var16 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (qo.field_e == ((md) this).field_u) {
                break L1;
              } else {
                if (param2 == null) {
                  break L1;
                } else {
                  L2: {
                    if (param2.field_b * 4.0 >= (double)param0) {
                      break L2;
                    } else {
                      param0 = 4 * (int)param2.field_b;
                      break L2;
                    }
                  }
                  L3: {
                    if (((md) this).field_r != ro.field_u) {
                      L4: {
                        stackOut_13_0 = this;
                        stackIn_15_0 = stackOut_13_0;
                        stackIn_14_0 = stackOut_13_0;
                        if (((md) this).field_j < 150) {
                          stackOut_15_0 = this;
                          stackOut_15_1 = ht.field_i;
                          stackIn_16_0 = stackOut_15_0;
                          stackIn_16_1 = stackOut_15_1;
                          break L4;
                        } else {
                          stackOut_14_0 = this;
                          stackOut_14_1 = pd.field_a;
                          stackIn_16_0 = stackOut_14_0;
                          stackIn_16_1 = stackOut_14_1;
                          break L4;
                        }
                      }
                      ((md) this).field_u = stackIn_16_1;
                      break L3;
                    } else {
                      if (pd.field_a != ((md) this).field_u) {
                        ((md) this).field_u = ht.field_i;
                        break L3;
                      } else {
                        int fieldTemp$2 = ((md) this).field_w + 1;
                        ((md) this).field_w = ((md) this).field_w + 1;
                        if (0 <= fieldTemp$2) {
                          ((md) this).field_u = ht.field_i;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L5: {
                    var4_int = 15 * param0 + -128;
                    if (((md) this).field_r == ro.field_u) {
                      var4_int = 0;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    param2.b((double)var4_int, 128);
                    ((md) this).b(20.0, param1 ^ 203);
                    var5 = lc.a(((md) this).field_d, false, param2.field_d);
                    ((md) this).b(-20.0, 128);
                    ((md) this).a(-10.0, (byte) 25);
                    ((md) this).b(20.0, 128);
                    var7 = lc.a(((md) this).field_d, false, param2.field_d);
                    ((md) this).b(-20.0, param1 ^ 203);
                    ((md) this).a(20.0, (byte) 25);
                    ((md) this).b(20.0, param1 + 53);
                    var9 = lc.a(((md) this).field_d, false, param2.field_d);
                    ((md) this).b(-20.0, param1 + 53);
                    ((md) this).a(-10.0, (byte) 25);
                    var11 = ((md) this).field_r.field_g;
                    var13 = 0;
                    if (pd.field_a == ((md) this).field_u) {
                      if (var7 > var9) {
                        L7: {
                          if (var7 <= var5) {
                            stackOut_37_0 = 0;
                            stackIn_38_0 = stackOut_37_0;
                            break L7;
                          } else {
                            stackOut_36_0 = -1;
                            stackIn_38_0 = stackOut_36_0;
                            break L7;
                          }
                        }
                        var13 = stackIn_38_0;
                        break L6;
                      } else {
                        L8: {
                          if (var5 >= var9) {
                            stackOut_33_0 = 0;
                            stackIn_34_0 = stackOut_33_0;
                            break L8;
                          } else {
                            stackOut_32_0 = 1;
                            stackIn_34_0 = stackOut_32_0;
                            break L8;
                          }
                        }
                        var13 = stackIn_34_0;
                        break L6;
                      }
                    } else {
                      if (var9 > var7) {
                        L9: {
                          if (var7 >= var5) {
                            stackOut_28_0 = 0;
                            stackIn_29_0 = stackOut_28_0;
                            break L9;
                          } else {
                            stackOut_27_0 = -1;
                            stackIn_29_0 = stackOut_27_0;
                            break L9;
                          }
                        }
                        var13 = stackIn_29_0;
                        break L6;
                      } else {
                        L10: {
                          if (var9 >= var5) {
                            stackOut_24_0 = 0;
                            stackIn_25_0 = stackOut_24_0;
                            break L10;
                          } else {
                            stackOut_23_0 = 1;
                            stackIn_25_0 = stackOut_23_0;
                            break L10;
                          }
                        }
                        var13 = stackIn_25_0;
                        break L6;
                      }
                    }
                  }
                  ((md) this).a((double)var13 * var11, (byte) 25);
                  if (param1 == 75) {
                    L11: {
                      if (((md) this).field_r != ro.field_u) {
                        var14_int = var13;
                        if (var14_int != 1) {
                          if (var14_int != -1) {
                            break L11;
                          } else {
                            ((md) this).field_i = ((md) this).field_i - 2;
                            if (-16 <= ((md) this).field_i) {
                              break L11;
                            } else {
                              ((md) this).field_i = -16;
                              break L11;
                            }
                          }
                        } else {
                          ((md) this).field_i = ((md) this).field_i + 2;
                          if (((md) this).field_i <= 16) {
                            break L11;
                          } else {
                            ((md) this).field_i = 16;
                            break L11;
                          }
                        }
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      L13: {
                        param2.b((double)(-var4_int), 128);
                        if (!uh.a(param1 + 30, param2.field_d, 500.0, ((md) this).field_d)) {
                          break L13;
                        } else {
                          if (100 > ((md) this).field_j) {
                            if (ro.field_u != ((md) this).field_r) {
                              if (0 == var13) {
                                ((md) this).field_l = true;
                                break L13;
                              } else {
                                break L12;
                              }
                            } else {
                              kp.field_a.a(10.0, (double)((md) this).field_f + ((md) this).field_e, 121);
                              rc.field_d.a(((md) this).field_d, true);
                              rc.field_d.a(param2.field_d, param1 ^ -30562);
                              var14 = kp.field_a.a(rc.field_d, (byte) -118) / rc.field_d.a((byte) -74);
                              if (9.5 < var14) {
                                ((md) this).field_l = true;
                                ((md) this).field_w = 0;
                                if (pd.field_a != ((md) this).field_u) {
                                  break L12;
                                } else {
                                  ((md) this).field_u = ht.field_i;
                                  break L12;
                                }
                              } else {
                                int fieldTemp$3 = ((md) this).field_w + 1;
                                ((md) this).field_w = ((md) this).field_w + 1;
                                if (fieldTemp$3 >= 150) {
                                  ((md) this).field_u = pd.field_a;
                                  ((md) this).field_w = 150;
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                            }
                          } else {
                            break L12;
                          }
                        }
                      }
                      break L12;
                    }
                    break L0;
                  } else {
                    return;
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var4 = decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) var4;
            stackOut_65_1 = new StringBuilder().append("md.K(").append(param0).append(44).append(param1).append(44);
            stackIn_67_0 = stackOut_65_0;
            stackIn_67_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param2 == null) {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L14;
            } else {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "{...}";
              stackIn_68_0 = stackOut_66_0;
              stackIn_68_1 = stackOut_66_1;
              stackIn_68_2 = stackOut_66_2;
              break L14;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_68_0, stackIn_68_2 + 41);
        }
    }

    public static void b() {
        field_s = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Go Back";
    }
}
