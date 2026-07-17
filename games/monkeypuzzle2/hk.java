/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk extends ug {
    li field_g;
    int field_j;
    ug field_h;
    static byte[][] field_f;
    static int field_l;
    static ad field_k;
    static java.awt.Frame field_e;
    static le[] field_i;

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
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
          var42 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (0 > param4) {
            break L0;
          } else {
            if (ig.field_a <= param12) {
              break L0;
            } else {
              L1: {
                if (param10 >= 0) {
                  break L1;
                } else {
                  if (0 <= param11) {
                    break L1;
                  } else {
                    if (0 <= param8) {
                      break L1;
                    } else {
                      return;
                    }
                  }
                }
              }
              L2: {
                if (ig.field_c > param10) {
                  break L2;
                } else {
                  if (param11 < ig.field_c) {
                    break L2;
                  } else {
                    if (param8 >= ig.field_c) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                if (param16 == -972948528) {
                  break L3;
                } else {
                  field_l = -2;
                  break L3;
                }
              }
              L4: {
                var34 = param4 - param12;
                if (param13 != param12) {
                  L5: {
                    var26 = param3 << 16;
                    var25 = param3 << 16;
                    var22 = param15 << 16;
                    var21 = param15 << 16;
                    var30 = param9 << 16;
                    var29 = param9 << 16;
                    var18 = param10 << 16;
                    var17_int = param10 << 16;
                    var35 = -param12 + param13;
                    var20 = (param8 - param10 << 16) / var34;
                    var19 = (param11 - param10 << 16) / var35;
                    if (var20 <= var19) {
                      var28 = (param0 + -param3 << 16) / var35;
                      var27 = (-param3 + param1 << 16) / var34;
                      var36 = var19;
                      var19 = var20;
                      var20 = var36;
                      var31 = (-param9 + param6 << 16) / var34;
                      var23 = (-param15 + param14 << 16) / var34;
                      var32 = (-param9 + param5 << 16) / var35;
                      var24 = (param7 - param15 << 16) / var35;
                      var33 = 1;
                      break L5;
                    } else {
                      var23 = (param7 + -param15 << 16) / var35;
                      var24 = (param14 - param15 << 16) / var34;
                      var31 = (-param9 + param5 << 16) / var35;
                      var27 = (-param3 + param0 << 16) / var35;
                      var33 = 0;
                      var32 = (param6 - param9 << 16) / var34;
                      var28 = (param1 - param3 << 16) / var34;
                      break L5;
                    }
                  }
                  L6: {
                    L7: {
                      if (param12 >= 0) {
                        break L7;
                      } else {
                        if (0 <= param13) {
                          param12 = -param12;
                          var30 = var30 + param12 * var32;
                          var26 = var26 + param12 * var28;
                          var21 = var21 + var23 * param12;
                          var17_int = var17_int + var19 * param12;
                          var22 = var22 + param12 * var24;
                          var29 = var29 + param12 * var31;
                          var25 = var25 + param12 * var27;
                          var18 = var18 + param12 * var20;
                          param12 = 0;
                          break L7;
                        } else {
                          param12 = -param12 + param13;
                          var18 = var18 + var20 * param12;
                          var25 = var25 + param12 * var27;
                          var30 = var30 + var32 * param12;
                          var26 = var26 + param12 * var28;
                          var22 = var22 + var24 * param12;
                          var29 = var29 + param12 * var31;
                          var21 = var21 + param12 * var23;
                          var17_int = var17_int + var19 * param12;
                          param12 = param13;
                          break L6;
                        }
                      }
                    }
                    var36 = ig.field_i[param12];
                    L8: while (true) {
                      if (param12 >= param13) {
                        break L6;
                      } else {
                        L9: {
                          var37 = var17_int >> 16;
                          if (ig.field_c <= var37) {
                            break L9;
                          } else {
                            var38 = (var18 >> 16) - (var17_int >> 16);
                            if (0 != var38) {
                              L10: {
                                var39 = (var22 - var21) / var38;
                                var40 = (-var25 + var26) / var38;
                                var41 = (var30 + -var29) / var38;
                                if (var37 + var38 < ig.field_c) {
                                  break L10;
                                } else {
                                  var38 = -1 + ig.field_c - var37;
                                  break L10;
                                }
                              }
                              if (var37 < 0) {
                                nd.a(var36, var38 + var37, var41, param2, var39, -23487, var29 - var41 * var37, var40, -(var40 * var37) + var25, -(var39 * var37) + var21);
                                break L9;
                              } else {
                                nd.a(var37 - -var36, var38, var41, param2, var39, -23487, var29, var40, var25, var21);
                                break L9;
                              }
                            } else {
                              if (0 > var37) {
                                break L9;
                              } else {
                                if (var37 >= ig.field_c) {
                                  break L9;
                                } else {
                                  nd.a(var37 + var36, var38, 0, param2, 0, -23487, var29, 0, var25, var21);
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                        param12++;
                        if (param12 < ig.field_a) {
                          var26 = var26 + var28;
                          var17_int = var17_int + var19;
                          var21 = var21 + var23;
                          var30 = var30 + var32;
                          var25 = var25 + var27;
                          var22 = var22 + var24;
                          var18 = var18 + var20;
                          var36 = var36 + ge.field_h;
                          var29 = var29 + var31;
                          continue L8;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  var36 = param4 - param13;
                  if (var36 != 0) {
                    L11: {
                      var37 = param8 << 16;
                      var38 = param14 << 16;
                      var39 = param1 << 16;
                      if (var33 == 0) {
                        var25 = param0 << 16;
                        var21 = param7 << 16;
                        var29 = param5 << 16;
                        var17_int = param11 << 16;
                        break L11;
                      } else {
                        var26 = param0 << 16;
                        var18 = param11 << 16;
                        var22 = param7 << 16;
                        var30 = param5 << 16;
                        break L11;
                      }
                    }
                    var40 = param6 << 16;
                    var19 = (var37 + -var17_int) / var36;
                    var20 = (-var18 + var37) / var36;
                    var27 = (var39 + -var25) / var36;
                    var31 = (var40 - var29) / var36;
                    var23 = (var38 + -var21) / var36;
                    var28 = (var39 - var26) / var36;
                    var32 = (-var30 + var40) / var36;
                    var24 = (-var22 + var38) / var36;
                    break L4;
                  } else {
                    var31 = 0;
                    var23 = 0;
                    var24 = 0;
                    var27 = 0;
                    var28 = 0;
                    var32 = 0;
                    var19 = 0;
                    var20 = 0;
                    break L4;
                  }
                } else {
                  L12: {
                    if (param12 == param4) {
                      var31 = 0;
                      var25 = param3;
                      var17_int = param10 << 16;
                      var19 = 0;
                      var18 = param11 << 16;
                      var27 = 0;
                      var28 = 0;
                      var20 = 0;
                      var24 = 0;
                      var26 = param0;
                      var22 = param7;
                      var21 = param15;
                      var30 = param5;
                      var29 = param9;
                      var23 = 0;
                      var32 = 0;
                      break L12;
                    } else {
                      var35 = param4 - param13;
                      if (param11 > param10) {
                        var31 = (-param9 + param6 << 16) / var34;
                        var17_int = param10 << 16;
                        var29 = param9 << 16;
                        var21 = param15 << 16;
                        var18 = param11 << 16;
                        var28 = (-param0 + param1 << 16) / var35;
                        var25 = param3 << 16;
                        var30 = param5 << 16;
                        var32 = (-param5 + param6 << 16) / var35;
                        var27 = (param1 + -param3 << 16) / var34;
                        var24 = (param14 + -param7 << 16) / var35;
                        var19 = (-param10 + param8 << 16) / var34;
                        var23 = (-param15 + param14 << 16) / var34;
                        var20 = (param8 + -param11 << 16) / var35;
                        var26 = param0 << 16;
                        var22 = param7 << 16;
                        break L12;
                      } else {
                        var23 = (-param7 + param14 << 16) / var35;
                        var31 = (param6 + -param5 << 16) / var35;
                        var17_int = param11 << 16;
                        var27 = (-param0 + param1 << 16) / var35;
                        var28 = (-param3 + param1 << 16) / var34;
                        var18 = param10 << 16;
                        var26 = param3 << 16;
                        var19 = (param8 - param11 << 16) / var35;
                        var20 = (param8 + -param10 << 16) / var34;
                        var22 = param15 << 16;
                        var21 = param7 << 16;
                        var24 = (param14 + -param15 << 16) / var34;
                        var30 = param9 << 16;
                        var29 = param5 << 16;
                        var25 = param0 << 16;
                        var32 = (param6 - param9 << 16) / var34;
                        break L12;
                      }
                    }
                  }
                  var33 = 0;
                  if (param12 >= 0) {
                    break L4;
                  } else {
                    param12 = Math.min(-param12, -param12 + param13);
                    var18 = var18 + param12 * var20;
                    var22 = var22 + var24 * param12;
                    var26 = var26 + param12 * var28;
                    var17_int = var17_int + param12 * var19;
                    var29 = var29 + var31 * param12;
                    var30 = var30 + var32 * param12;
                    var25 = var25 + param12 * var27;
                    var21 = var21 + param12 * var23;
                    param12 = 0;
                    break L4;
                  }
                }
              }
              L13: {
                if (param12 >= 0) {
                  break L13;
                } else {
                  param12 = -param12;
                  var25 = var25 + param12 * var27;
                  var26 = var26 + var28 * param12;
                  var22 = var22 + var24 * param12;
                  var21 = var21 + var23 * param12;
                  var29 = var29 + param12 * var31;
                  var30 = var30 + var32 * param12;
                  var18 = var18 + var20 * param12;
                  var17_int = var17_int + param12 * var19;
                  param12 = 0;
                  break L13;
                }
              }
              var35 = ig.field_i[param12];
              L14: while (true) {
                if (param4 <= param12) {
                  return;
                } else {
                  L15: {
                    var36 = var17_int >> 16;
                    if (ig.field_c <= var36) {
                      break L15;
                    } else {
                      var37 = (var18 >> 16) + -(var17_int >> 16);
                      if (var37 == 0) {
                        if (var36 < 0) {
                          break L15;
                        } else {
                          if (var36 < ig.field_c) {
                            nd.a(var35 + var36, var37, 0, param2, 0, -23487, var29, 0, var25, var21);
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                      } else {
                        L16: {
                          var38 = (-var21 + var22) / var37;
                          var39 = (-var25 + var26) / var37;
                          var40 = (-var29 + var30) / var37;
                          if (ig.field_c <= var37 + var36) {
                            var37 = -1 + (ig.field_c - var36);
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                        if (var36 < 0) {
                          nd.a(var35, var37 - -var36, var40, param2, var38, param16 ^ 972971921, var29 + -(var36 * var40), var39, -(var39 * var36) + var25, var21 + -(var38 * var36));
                          break L15;
                        } else {
                          nd.a(var35 + var36, var37, var40, param2, var38, -23487, var29, var39, var25, var21);
                          break L15;
                        }
                      }
                    }
                  }
                  param12++;
                  if (ig.field_a > param12) {
                    var29 = var29 + var31;
                    var35 = var35 + ge.field_h;
                    var26 = var26 + var28;
                    var25 = var25 + var27;
                    var21 = var21 + var23;
                    var22 = var22 + var24;
                    var18 = var18 + var20;
                    var30 = var30 + var32;
                    var17_int = var17_int + var19;
                    continue L14;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
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
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        var13 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param3 + param0;
              var6 = param1 + param4;
              if (ge.field_a < param0) {
                stackOut_3_0 = param0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = ge.field_a;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0;
              if (ge.field_f >= param1) {
                stackOut_6_0 = ge.field_f;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = param1;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0;
              if (ge.field_j > var5_int) {
                stackOut_9_0 = var5_int;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = ge.field_j;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            L4: {
              var9 = stackIn_10_0;
              if (var6 >= ge.field_k) {
                stackOut_12_0 = ge.field_k;
                stackIn_13_0 = stackOut_12_0;
                break L4;
              } else {
                stackOut_11_0 = var6;
                stackIn_13_0 = stackOut_11_0;
                break L4;
              }
            }
            L5: {
              var10 = stackIn_13_0;
              if (ge.field_a > param0) {
                break L5;
              } else {
                if (param0 < ge.field_j) {
                  var11 = ge.field_h * var8 - -param0;
                  var12 = 1 - (-var10 - -var8) >> 1;
                  L6: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L5;
                    } else {
                      ge.field_i[var11] = 16777215;
                      var11 = var11 + ge.field_h * 2;
                      continue L6;
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            if (param2 >= 1) {
              L7: {
                if (ge.field_f > param1) {
                  break L7;
                } else {
                  if (ge.field_k > var6) {
                    var11 = ge.field_h * param1 - -var7;
                    var12 = 1 + var9 + -var7 >> 1;
                    L8: while (true) {
                      var12--;
                      if (var12 < 0) {
                        break L7;
                      } else {
                        ge.field_i[var11] = 16777215;
                        var11 += 2;
                        continue L8;
                      }
                    }
                  } else {
                    break L7;
                  }
                }
              }
              L9: {
                if (var5_int < ge.field_a) {
                  break L9;
                } else {
                  if (var5_int >= ge.field_j) {
                    break L9;
                  } else {
                    var11 = ((1 & var5_int + -param0) + var8) * ge.field_h - -var5_int;
                    var12 = -var8 + (1 - -var10) >> 1;
                    L10: while (true) {
                      var12--;
                      if (var12 < 0) {
                        break L9;
                      } else {
                        ge.field_i[var11] = 16777215;
                        var11 = var11 + ge.field_h * 2;
                        continue L10;
                      }
                    }
                  }
                }
              }
              L11: {
                if (param1 < ge.field_f) {
                  break L11;
                } else {
                  if (ge.field_k <= var6) {
                    break L11;
                  } else {
                    var11 = var7 + (var6 * ge.field_h - -(1 & -param1 + var6));
                    var12 = 1 - -var9 - var7 >> 1;
                    L12: while (true) {
                      var12--;
                      if (var12 < 0) {
                        break L11;
                      } else {
                        ge.field_i[var11] = 16777215;
                        var11 += 2;
                        continue L12;
                      }
                    }
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var5, "hk.A(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static ai[] a(byte param0) {
        int var2 = 0;
        int var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        ai[] var1 = new ai[eg.field_c];
        for (var2 = 0; eg.field_c > var2; var2++) {
            var1[var2] = new ai(nj.field_d, qk.field_a, qc.field_P[var2], mb.field_b[var2], da.field_c[var2], ra.field_ab[var2], cb.field_b[var2], fk.field_d);
        }
        gb.a(-119);
        return var1;
    }

    public static void b(byte param0) {
        field_k = null;
        field_i = null;
        field_f = null;
        field_e = null;
    }

    final static void a(gk param0, md param1, int param2, int param3) {
        try {
            RuntimeException var4 = null;
            int var5 = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            int var6_int = 0;
            String var7 = null;
            String var8 = null;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            int var12_int = 0;
            Class[] var12 = null;
            int var13 = 0;
            int var14 = 0;
            String var15 = null;
            String var16 = null;
            int var17 = 0;
            Object var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            String var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            byte[][] var24 = null;
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            RuntimeException stackIn_38_0 = null;
            StringBuilder stackIn_38_1 = null;
            RuntimeException stackIn_39_0 = null;
            StringBuilder stackIn_39_1 = null;
            String stackIn_39_2 = null;
            RuntimeException stackIn_40_0 = null;
            StringBuilder stackIn_40_1 = null;
            RuntimeException stackIn_41_0 = null;
            StringBuilder stackIn_41_1 = null;
            RuntimeException stackIn_42_0 = null;
            StringBuilder stackIn_42_1 = null;
            String stackIn_42_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_36_0 = null;
            StringBuilder stackOut_36_1 = null;
            RuntimeException stackOut_38_0 = null;
            StringBuilder stackOut_38_1 = null;
            String stackOut_38_2 = null;
            RuntimeException stackOut_37_0 = null;
            StringBuilder stackOut_37_1 = null;
            String stackOut_37_2 = null;
            RuntimeException stackOut_39_0 = null;
            StringBuilder stackOut_39_1 = null;
            RuntimeException stackOut_41_0 = null;
            StringBuilder stackOut_41_1 = null;
            String stackOut_41_2 = null;
            RuntimeException stackOut_40_0 = null;
            StringBuilder stackOut_40_1 = null;
            String stackOut_40_2 = null;
            var14 = MonkeyPuzzle2.field_F ? 1 : 0;
            try {
              L0: {
                L1: {
                  var18 = (Object) (Object) new i();
                  ((i) var18).field_e = param0.a((byte) 114);
                  ((i) var18).field_l = param0.e(param2 ^ 80);
                  ((i) var18).field_g = new int[((i) var18).field_e];
                  ((i) var18).field_k = new ic[((i) var18).field_e];
                  ((i) var18).field_f = new byte[((i) var18).field_e][][];
                  if (param2 == -1) {
                    break L1;
                  } else {
                    hk.a(-56, 123, -43, -34, -46);
                    break L1;
                  }
                }
                ((i) var18).field_o = new int[((i) var18).field_e];
                ((i) var18).field_q = new int[((i) var18).field_e];
                ((i) var18).field_s = new ic[((i) var18).field_e];
                var5 = 0;
                L2: while (true) {
                  if (~var5 <= ~((i) var18).field_e) {
                    ua.field_v.a(-8212, (ug) var18);
                    break L0;
                  } else {
                    try {
                      L3: {
                        L4: {
                          L5: {
                            var6_int = param0.a((byte) 114);
                            if (var6_int == 0) {
                              break L5;
                            } else {
                              if (var6_int == 1) {
                                break L5;
                              } else {
                                if (2 != var6_int) {
                                  L6: {
                                    L7: {
                                      if (var6_int == 3) {
                                        break L7;
                                      } else {
                                        if (var6_int != 4) {
                                          break L6;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    var20 = param0.f(param2);
                                    var21 = param0.f(-1);
                                    var9 = param0.a((byte) 114);
                                    var10 = new String[var9];
                                    var11_int = 0;
                                    L8: while (true) {
                                      if (~var11_int <= ~var9) {
                                        L9: {
                                          var24 = new byte[var9][];
                                          var23 = var24;
                                          var22 = var23;
                                          var19 = var22;
                                          var11 = var19;
                                          if (var6_int == 3) {
                                            var12_int = 0;
                                            L10: while (true) {
                                              if (~var9 >= ~var12_int) {
                                                break L9;
                                              } else {
                                                var13 = param0.e(126);
                                                var11[var12_int] = new byte[var13];
                                                param0.a(var24[var12_int], var13, -127, 0);
                                                var12_int++;
                                                continue L10;
                                              }
                                            }
                                          } else {
                                            break L9;
                                          }
                                        }
                                        ((i) var18).field_q[var5] = var6_int;
                                        var12 = new Class[var9];
                                        var17 = 0;
                                        var13 = var17;
                                        L11: while (true) {
                                          if (var9 <= var17) {
                                            ((i) var18).field_s[var5] = param1.a(102, var12, di.a(var20, -63), var21);
                                            ((i) var18).field_f[var5] = var24;
                                            break L6;
                                          } else {
                                            var12[var17] = di.a(var10[var17], -112);
                                            var17++;
                                            continue L11;
                                          }
                                        }
                                      } else {
                                        var10[var11_int] = param0.f(-1);
                                        var11_int++;
                                        continue L8;
                                      }
                                    }
                                  }
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                          L12: {
                            var15 = param0.f(param2);
                            var7 = var15;
                            var16 = param0.f(param2);
                            var8 = var16;
                            var9 = 0;
                            if (var6_int != 1) {
                              break L12;
                            } else {
                              var9 = param0.e(param2 ^ -127);
                              break L12;
                            }
                          }
                          ((i) var18).field_q[var5] = var6_int;
                          ((i) var18).field_g[var5] = var9;
                          ((i) var18).field_k[var5] = param1.a(false, di.a(var15, param2 + -64), var16);
                          break L4;
                        }
                        break L3;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L13: {
                        var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        ((i) var18).field_o[var5] = -1;
                        break L13;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L16: {
                        var6_ref3 = (Exception) (Object) decompiledCaughtException;
                        ((i) var18).field_o[var5] = -4;
                        break L16;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L17: {
                        var6_ref4 = decompiledCaughtException;
                        ((i) var18).field_o[var5] = -5;
                        break L17;
                      }
                    }
                    var5++;
                    continue L2;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L18: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_36_0 = (RuntimeException) var4;
                stackOut_36_1 = new StringBuilder().append("hk.C(");
                stackIn_38_0 = stackOut_36_0;
                stackIn_38_1 = stackOut_36_1;
                stackIn_37_0 = stackOut_36_0;
                stackIn_37_1 = stackOut_36_1;
                if (param0 == null) {
                  stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
                  stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
                  stackOut_38_2 = "null";
                  stackIn_39_0 = stackOut_38_0;
                  stackIn_39_1 = stackOut_38_1;
                  stackIn_39_2 = stackOut_38_2;
                  break L18;
                } else {
                  stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
                  stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
                  stackOut_37_2 = "{...}";
                  stackIn_39_0 = stackOut_37_0;
                  stackIn_39_1 = stackOut_37_1;
                  stackIn_39_2 = stackOut_37_2;
                  break L18;
                }
              }
              L19: {
                stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
                stackOut_39_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(44);
                stackIn_41_0 = stackOut_39_0;
                stackIn_41_1 = stackOut_39_1;
                stackIn_40_0 = stackOut_39_0;
                stackIn_40_1 = stackOut_39_1;
                if (param1 == null) {
                  stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
                  stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
                  stackOut_41_2 = "null";
                  stackIn_42_0 = stackOut_41_0;
                  stackIn_42_1 = stackOut_41_1;
                  stackIn_42_2 = stackOut_41_2;
                  break L19;
                } else {
                  stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
                  stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
                  stackOut_40_2 = "{...}";
                  stackIn_42_0 = stackOut_40_0;
                  stackIn_42_1 = stackOut_40_1;
                  stackIn_42_2 = stackOut_40_2;
                  break L19;
                }
              }
              throw la.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + 44 + param2 + 44 + param3 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    hk(li param0, ug param1) {
        try {
            ((hk) this).field_g = param0;
            ((hk) this).field_j = param0.f();
            ((hk) this).field_h = param1;
            ((hk) this).field_g.g(re.field_e * ((hk) this).field_j / 256);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "hk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = -1;
        field_f = new byte[250][];
    }
}
