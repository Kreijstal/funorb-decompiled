/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jb {
    private static boolean field_q;
    static int field_m;
    static int field_i;
    static int field_g;
    static b field_b;
    private static float field_l;
    static int field_d;
    private static boolean field_h;
    static int[] field_a;
    static int[] field_k;
    static int[] field_e;
    static int[] field_j;
    private static boolean field_f;
    static int field_c;
    static boolean field_n;
    static int[] field_p;
    private static int[] field_o;

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int incrementValue$24 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (!field_n) {
                        statePc = 5;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (param5 <= field_i) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    param5 = field_i;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (param4 >= 0) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    param4 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (param4 < param5) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    return;
                }
                case 7: {
                    param1 = param1 + param4;
                    param6 = param6 + param7 * param4;
                    if (!field_h) {
                        statePc = 21;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    param3 = param5 - param4 >> 2;
                    param7 = param7 << 2;
                    if (field_d != 0) {
                        statePc = 15;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (param3 <= 0) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    param2 = field_p[param6 >> 8];
                    param6 = param6 + param7;
                    incrementValue$13 = param1;
                    param1++;
                    param0[incrementValue$13] = param2;
                    incrementValue$14 = param1;
                    param1++;
                    param0[incrementValue$14] = param2;
                    incrementValue$15 = param1;
                    param1++;
                    param0[incrementValue$15] = param2;
                    incrementValue$16 = param1;
                    param1++;
                    param0[incrementValue$16] = param2;
                    param3--;
                    if (param3 > 0) {
                        statePc = 10;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    param3 = param5 - param4 & 3;
                    if (param3 <= 0) {
                        statePc = 27;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    param2 = field_p[param6 >> 8];
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    incrementValue$17 = param1;
                    param1++;
                    param0[incrementValue$17] = param2;
                    param3--;
                    if (param3 > 0) {
                        statePc = 13;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var8 = field_d;
                    var9 = 256 - field_d;
                    if (param3 <= 0) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    param2 = field_p[param6 >> 8];
                    param6 = param6 + param7;
                    param2 = ((param2 & 16711935) * var9 >> 8 & 16711935) + ((param2 & 65280) * var9 >> 8 & 65280);
                    var10 = param0[param1];
                    incrementValue$18 = param1;
                    param1++;
                    param0[incrementValue$18] = param2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & 65280) * var8 >> 8 & 65280);
                    var10 = param0[param1];
                    incrementValue$19 = param1;
                    param1++;
                    param0[incrementValue$19] = param2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & 65280) * var8 >> 8 & 65280);
                    var10 = param0[param1];
                    incrementValue$20 = param1;
                    param1++;
                    param0[incrementValue$20] = param2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & 65280) * var8 >> 8 & 65280);
                    var10 = param0[param1];
                    incrementValue$21 = param1;
                    param1++;
                    param0[incrementValue$21] = param2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & 65280) * var8 >> 8 & 65280);
                    param3--;
                    if (param3 > 0) {
                        statePc = 16;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    param3 = param5 - param4 & 3;
                    if (param3 <= 0) {
                        statePc = 20;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    param2 = field_p[param6 >> 8];
                    param2 = ((param2 & 16711935) * var9 >> 8 & 16711935) + ((param2 & 65280) * var9 >> 8 & 65280);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    var10 = param0[param1];
                    incrementValue$22 = param1;
                    param1++;
                    param0[incrementValue$22] = param2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & 65280) * var8 >> 8 & 65280);
                    param3--;
                    if (param3 > 0) {
                        statePc = 19;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    return;
                }
                case 21: {
                    param3 = param5 - param4;
                    if (field_d != 0) {
                        statePc = 24;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    incrementValue$23 = param1;
                    param1++;
                    param0[incrementValue$23] = field_p[param6 >> 8];
                    param6 = param6 + param7;
                    param3--;
                    if (param3 > 0) {
                        statePc = 22;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var8 = field_d;
                    var9 = 256 - field_d;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    param2 = field_p[param6 >> 8];
                    param6 = param6 + param7;
                    param2 = ((param2 & 16711935) * var9 >> 8 & 16711935) + ((param2 & 65280) * var9 >> 8 & 65280);
                    var10 = param0[param1];
                    incrementValue$24 = param1;
                    param1++;
                    param0[incrementValue$24] = param2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & 65280) * var8 >> 8 & 65280);
                    param3--;
                    if (param3 > 0) {
                        statePc = 25;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    return;
                }
                case 27: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final static void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        field_i = param2 - param0;
        field_c = param3 - param1;
        jb.a();
        if (field_e.length < field_c) {
            field_e = new int[cb.a((byte) -85, field_c)];
        }
        int var4 = param1 * vj.field_l + param0;
        for (var5 = 0; var5 < field_c; var5++) {
            field_e[var5] = var4;
            var4 = var4 + vj.field_l;
        }
    }

    private final static void a(float param0) {
        field_l = param0;
        field_l = (float)((double)field_l + (Math.random() * 0.03 - 0.015));
    }

    private final static void a() {
        field_m = field_i / 2;
        field_g = field_c / 2;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17, int param18) {
        int[] var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var27;
        int var28;
        int var29;
        int var30;
        int var31;
        int var32;
        int var33;
        int var34;
        int var35;
        int var36;
        int var37;
        int var38;
        int var39;
        int var40;
        int var41;
        int[] var42;
        int[] var43;
        int stackIn_6_0 = 0;
        L0: {
          var43 = field_b.a(param18, (byte) 50, field_l);
          var42 = var43;
          var19 = var42;
          if (var19 == null) {
            break L0;
          } else {
            if (field_d <= 10) {
              L1: {
                field_f = field_b.d(102, param18);
                if (field_b.c(param18, -107) != 0) {
                  stackIn_6_0 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L1;
                }
              }
              L2: {
                field_q = stackIn_6_0 != 0;
                var20 = param4 - param3;
                var21 = param1 - param0;
                var22 = param5 - param3;
                var23 = param2 - param0;
                var24 = param7 - param6;
                var25 = param8 - param6;
                var26 = 0;
                if (param1 == param0) {
                  break L2;
                } else {
                  var26 = (param4 - param3 << 16) / (param1 - param0);
                  break L2;
                }
              }
              L3: {
                var27 = 0;
                if (param2 == param1) {
                  break L3;
                } else {
                  var27 = (param5 - param4 << 16) / (param2 - param1);
                  break L3;
                }
              }
              L4: {
                var28 = 0;
                if (param2 == param0) {
                  break L4;
                } else {
                  var28 = (param3 - param5 << 16) / (param0 - param2);
                  break L4;
                }
              }
              var29 = var20 * var23 - var22 * var21;
              if (var29 != 0) {
                L5: {
                  var30 = (var24 * var23 - var25 * var21 << 9) / var29;
                  var31 = (var25 * var20 - var24 * var22 << 9) / var29;
                  param10 = param9 - param10;
                  param13 = param12 - param13;
                  param16 = param15 - param16;
                  param11 = param11 - param9;
                  param14 = param14 - param12;
                  param17 = param17 - param15;
                  var32 = param11 * param12 - param14 * param9 << 14;
                  var33 = param14 * param15 - param17 * param12 << 8;
                  var34 = param17 * param9 - param11 * param15 << 5;
                  var35 = param10 * param12 - param13 * param9 << 14;
                  var36 = param13 * param15 - param16 * param12 << 8;
                  var37 = param16 * param9 - param10 * param15 << 5;
                  var38 = param13 * param11 - param10 * param14 << 14;
                  var39 = param16 * param14 - param13 * param17 << 8;
                  var40 = param10 * param17 - param16 * param11 << 5;
                  if (param0 > param1) {
                    break L5;
                  } else {
                    if (param0 > param2) {
                      break L5;
                    } else {
                      if (param0 < field_c) {
                        L6: {
                          if (param1 <= field_c) {
                            break L6;
                          } else {
                            param1 = field_c;
                            break L6;
                          }
                        }
                        L7: {
                          if (param2 <= field_c) {
                            break L7;
                          } else {
                            param2 = field_c;
                            break L7;
                          }
                        }
                        param6 = (param6 << 9) - var30 * param3 + var30;
                        if (param1 >= param2) {
                          L8: {
                            param3 = param3 << 16;
                            param4 = param3 << 16;
                            if (param0 >= 0) {
                              break L8;
                            } else {
                              param4 = param4 - var28 * param0;
                              param3 = param3 - var26 * param0;
                              param6 = param6 - var31 * param0;
                              param0 = 0;
                              break L8;
                            }
                          }
                          L9: {
                            param5 = param5 << 16;
                            if (param2 >= 0) {
                              break L9;
                            } else {
                              param5 = param5 - var27 * param2;
                              param2 = 0;
                              break L9;
                            }
                          }
                          L10: {
                            L11: {
                              var41 = param0 - field_g;
                              var32 = var32 + var34 * var41;
                              var35 = var35 + var37 * var41;
                              var38 = var38 + var40 * var41;
                              if (param0 == param2) {
                                break L11;
                              } else {
                                if (var28 < var26) {
                                  break L10;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            L12: {
                              if (param0 != param2) {
                                break L12;
                              } else {
                                if (var27 <= var26) {
                                  break L12;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            param1 = param1 - param2;
                            param2 = param2 - param0;
                            param0 = field_e[param0];
                            L13: while (true) {
                              param2--;
                              if (param2 < 0) {
                                param1--;
                                L14: while (true) {
                                  if (param1 < 0) {
                                    return;
                                  } else {
                                    jb.a(vj.field_j, var43, 0, 0, param0, param3 >> 16, param5 >> 16, param6, var30, var32, var35, var38, var33, var36, var39);
                                    param5 = param5 + var27;
                                    param3 = param3 + var26;
                                    param6 = param6 + var31;
                                    param0 = param0 + vj.field_l;
                                    var32 = var32 + var34;
                                    var35 = var35 + var37;
                                    var38 = var38 + var40;
                                    param1--;
                                    continue L14;
                                  }
                                }
                              } else {
                                jb.a(vj.field_j, var43, 0, 0, param0, param3 >> 16, param4 >> 16, param6, var30, var32, var35, var38, var33, var36, var39);
                                param4 = param4 + var28;
                                param3 = param3 + var26;
                                param6 = param6 + var31;
                                param0 = param0 + vj.field_l;
                                var32 = var32 + var34;
                                var35 = var35 + var37;
                                var38 = var38 + var40;
                                continue L13;
                              }
                            }
                          }
                          param1 = param1 - param2;
                          param2 = param2 - param0;
                          param0 = field_e[param0];
                          L15: while (true) {
                            param2--;
                            if (param2 < 0) {
                              param1--;
                              L16: while (true) {
                                if (param1 < 0) {
                                  return;
                                } else {
                                  jb.a(vj.field_j, var43, 0, 0, param0, param5 >> 16, param3 >> 16, param6, var30, var32, var35, var38, var33, var36, var39);
                                  param5 = param5 + var27;
                                  param3 = param3 + var26;
                                  param6 = param6 + var31;
                                  param0 = param0 + vj.field_l;
                                  var32 = var32 + var34;
                                  var35 = var35 + var37;
                                  var38 = var38 + var40;
                                  param1--;
                                  continue L16;
                                }
                              }
                            } else {
                              jb.a(vj.field_j, var43, 0, 0, param0, param4 >> 16, param3 >> 16, param6, var30, var32, var35, var38, var33, var36, var39);
                              param4 = param4 + var28;
                              param3 = param3 + var26;
                              param6 = param6 + var31;
                              param0 = param0 + vj.field_l;
                              var32 = var32 + var34;
                              var35 = var35 + var37;
                              var38 = var38 + var40;
                              continue L15;
                            }
                          }
                        } else {
                          L17: {
                            param3 = param3 << 16;
                            param5 = param3 << 16;
                            if (param0 >= 0) {
                              break L17;
                            } else {
                              param5 = param5 - var28 * param0;
                              param3 = param3 - var26 * param0;
                              param6 = param6 - var31 * param0;
                              param0 = 0;
                              break L17;
                            }
                          }
                          L18: {
                            param4 = param4 << 16;
                            if (param1 >= 0) {
                              break L18;
                            } else {
                              param4 = param4 - var27 * param1;
                              param1 = 0;
                              break L18;
                            }
                          }
                          L19: {
                            L20: {
                              var41 = param0 - field_g;
                              var32 = var32 + var34 * var41;
                              var35 = var35 + var37 * var41;
                              var38 = var38 + var40 * var41;
                              if (param0 == param1) {
                                break L20;
                              } else {
                                if (var28 < var26) {
                                  break L19;
                                } else {
                                  break L20;
                                }
                              }
                            }
                            L21: {
                              if (param0 != param1) {
                                break L21;
                              } else {
                                if (var28 <= var27) {
                                  break L21;
                                } else {
                                  break L19;
                                }
                              }
                            }
                            param2 = param2 - param1;
                            param1 = param1 - param0;
                            param0 = field_e[param0];
                            L22: while (true) {
                              param1--;
                              if (param1 < 0) {
                                param2--;
                                L23: while (true) {
                                  if (param2 < 0) {
                                    return;
                                  } else {
                                    jb.a(vj.field_j, var43, 0, 0, param0, param4 >> 16, param5 >> 16, param6, var30, var32, var35, var38, var33, var36, var39);
                                    param5 = param5 + var28;
                                    param4 = param4 + var27;
                                    param6 = param6 + var31;
                                    param0 = param0 + vj.field_l;
                                    var32 = var32 + var34;
                                    var35 = var35 + var37;
                                    var38 = var38 + var40;
                                    param2--;
                                    continue L23;
                                  }
                                }
                              } else {
                                jb.a(vj.field_j, var43, 0, 0, param0, param3 >> 16, param5 >> 16, param6, var30, var32, var35, var38, var33, var36, var39);
                                param5 = param5 + var28;
                                param3 = param3 + var26;
                                param6 = param6 + var31;
                                param0 = param0 + vj.field_l;
                                var32 = var32 + var34;
                                var35 = var35 + var37;
                                var38 = var38 + var40;
                                continue L22;
                              }
                            }
                          }
                          param2 = param2 - param1;
                          param1 = param1 - param0;
                          param0 = field_e[param0];
                          L24: while (true) {
                            param1--;
                            if (param1 < 0) {
                              param2--;
                              L25: while (true) {
                                if (param2 < 0) {
                                  return;
                                } else {
                                  jb.a(vj.field_j, var43, 0, 0, param0, param5 >> 16, param4 >> 16, param6, var30, var32, var35, var38, var33, var36, var39);
                                  param5 = param5 + var28;
                                  param4 = param4 + var27;
                                  param6 = param6 + var31;
                                  param0 = param0 + vj.field_l;
                                  var32 = var32 + var34;
                                  var35 = var35 + var37;
                                  var38 = var38 + var40;
                                  param2--;
                                  continue L25;
                                }
                              }
                            } else {
                              jb.a(vj.field_j, var43, 0, 0, param0, param5 >> 16, param3 >> 16, param6, var30, var32, var35, var38, var33, var36, var39);
                              param5 = param5 + var28;
                              param3 = param3 + var26;
                              param6 = param6 + var31;
                              param0 = param0 + vj.field_l;
                              var32 = var32 + var34;
                              var35 = var35 + var37;
                              var38 = var38 + var40;
                              continue L24;
                            }
                          }
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
                if (param1 > param2) {
                  if (param2 < field_c) {
                    L26: {
                      if (param0 <= field_c) {
                        break L26;
                      } else {
                        param0 = field_c;
                        break L26;
                      }
                    }
                    L27: {
                      if (param1 <= field_c) {
                        break L27;
                      } else {
                        param1 = field_c;
                        break L27;
                      }
                    }
                    param8 = (param8 << 9) - var30 * param5 + var30;
                    if (param0 >= param1) {
                      L28: {
                        param5 = param5 << 16;
                        param3 = param5 << 16;
                        if (param2 >= 0) {
                          break L28;
                        } else {
                          param3 = param3 - var27 * param2;
                          param5 = param5 - var28 * param2;
                          param8 = param8 - var31 * param2;
                          param2 = 0;
                          break L28;
                        }
                      }
                      L29: {
                        param4 = param4 << 16;
                        if (param1 >= 0) {
                          break L29;
                        } else {
                          param4 = param4 - var26 * param1;
                          param1 = 0;
                          break L29;
                        }
                      }
                      var41 = param2 - field_g;
                      var32 = var32 + var34 * var41;
                      var35 = var35 + var37 * var41;
                      var38 = var38 + var40 * var41;
                      if (var27 >= var28) {
                        param0 = param0 - param1;
                        param1 = param1 - param2;
                        param2 = field_e[param2];
                        L30: while (true) {
                          param1--;
                          if (param1 < 0) {
                            param0--;
                            L31: while (true) {
                              if (param0 < 0) {
                                return;
                              } else {
                                jb.a(vj.field_j, var43, 0, 0, param2, param5 >> 16, param4 >> 16, param8, var30, var32, var35, var38, var33, var36, var39);
                                param4 = param4 + var26;
                                param5 = param5 + var28;
                                param8 = param8 + var31;
                                param2 = param2 + vj.field_l;
                                var32 = var32 + var34;
                                var35 = var35 + var37;
                                var38 = var38 + var40;
                                param0--;
                                continue L31;
                              }
                            }
                          } else {
                            jb.a(vj.field_j, var43, 0, 0, param2, param5 >> 16, param3 >> 16, param8, var30, var32, var35, var38, var33, var36, var39);
                            param3 = param3 + var27;
                            param5 = param5 + var28;
                            param8 = param8 + var31;
                            param2 = param2 + vj.field_l;
                            var32 = var32 + var34;
                            var35 = var35 + var37;
                            var38 = var38 + var40;
                            continue L30;
                          }
                        }
                      } else {
                        param0 = param0 - param1;
                        param1 = param1 - param2;
                        param2 = field_e[param2];
                        L32: while (true) {
                          param1--;
                          if (param1 < 0) {
                            param0--;
                            L33: while (true) {
                              if (param0 < 0) {
                                return;
                              } else {
                                jb.a(vj.field_j, var43, 0, 0, param2, param4 >> 16, param5 >> 16, param8, var30, var32, var35, var38, var33, var36, var39);
                                param4 = param4 + var26;
                                param5 = param5 + var28;
                                param8 = param8 + var31;
                                param2 = param2 + vj.field_l;
                                var32 = var32 + var34;
                                var35 = var35 + var37;
                                var38 = var38 + var40;
                                param0--;
                                continue L33;
                              }
                            }
                          } else {
                            jb.a(vj.field_j, var43, 0, 0, param2, param3 >> 16, param5 >> 16, param8, var30, var32, var35, var38, var33, var36, var39);
                            param3 = param3 + var27;
                            param5 = param5 + var28;
                            param8 = param8 + var31;
                            param2 = param2 + vj.field_l;
                            var32 = var32 + var34;
                            var35 = var35 + var37;
                            var38 = var38 + var40;
                            continue L32;
                          }
                        }
                      }
                    } else {
                      L34: {
                        param5 = param5 << 16;
                        param4 = param5 << 16;
                        if (param2 >= 0) {
                          break L34;
                        } else {
                          param4 = param4 - var27 * param2;
                          param5 = param5 - var28 * param2;
                          param8 = param8 - var31 * param2;
                          param2 = 0;
                          break L34;
                        }
                      }
                      L35: {
                        param3 = param3 << 16;
                        if (param0 >= 0) {
                          break L35;
                        } else {
                          param3 = param3 - var26 * param0;
                          param0 = 0;
                          break L35;
                        }
                      }
                      var41 = param2 - field_g;
                      var32 = var32 + var34 * var41;
                      var35 = var35 + var37 * var41;
                      var38 = var38 + var40 * var41;
                      if (var27 >= var28) {
                        param1 = param1 - param0;
                        param0 = param0 - param2;
                        param2 = field_e[param2];
                        L36: while (true) {
                          param0--;
                          if (param0 < 0) {
                            param1--;
                            L37: while (true) {
                              if (param1 < 0) {
                                return;
                              } else {
                                jb.a(vj.field_j, var43, 0, 0, param2, param3 >> 16, param4 >> 16, param8, var30, var32, var35, var38, var33, var36, var39);
                                param4 = param4 + var27;
                                param3 = param3 + var26;
                                param8 = param8 + var31;
                                param2 = param2 + vj.field_l;
                                var32 = var32 + var34;
                                var35 = var35 + var37;
                                var38 = var38 + var40;
                                param1--;
                                continue L37;
                              }
                            }
                          } else {
                            jb.a(vj.field_j, var43, 0, 0, param2, param5 >> 16, param4 >> 16, param8, var30, var32, var35, var38, var33, var36, var39);
                            param4 = param4 + var27;
                            param5 = param5 + var28;
                            param8 = param8 + var31;
                            param2 = param2 + vj.field_l;
                            var32 = var32 + var34;
                            var35 = var35 + var37;
                            var38 = var38 + var40;
                            continue L36;
                          }
                        }
                      } else {
                        param1 = param1 - param0;
                        param0 = param0 - param2;
                        param2 = field_e[param2];
                        L38: while (true) {
                          param0--;
                          if (param0 < 0) {
                            param1--;
                            L39: while (true) {
                              if (param1 < 0) {
                                return;
                              } else {
                                jb.a(vj.field_j, var43, 0, 0, param2, param4 >> 16, param3 >> 16, param8, var30, var32, var35, var38, var33, var36, var39);
                                param4 = param4 + var27;
                                param3 = param3 + var26;
                                param8 = param8 + var31;
                                param2 = param2 + vj.field_l;
                                var32 = var32 + var34;
                                var35 = var35 + var37;
                                var38 = var38 + var40;
                                param1--;
                                continue L39;
                              }
                            }
                          } else {
                            jb.a(vj.field_j, var43, 0, 0, param2, param4 >> 16, param5 >> 16, param8, var30, var32, var35, var38, var33, var36, var39);
                            param4 = param4 + var27;
                            param5 = param5 + var28;
                            param8 = param8 + var31;
                            param2 = param2 + vj.field_l;
                            var32 = var32 + var34;
                            var35 = var35 + var37;
                            var38 = var38 + var40;
                            continue L38;
                          }
                        }
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  if (param1 < field_c) {
                    L40: {
                      if (param2 <= field_c) {
                        break L40;
                      } else {
                        param2 = field_c;
                        break L40;
                      }
                    }
                    L41: {
                      if (param0 <= field_c) {
                        break L41;
                      } else {
                        param0 = field_c;
                        break L41;
                      }
                    }
                    param7 = (param7 << 9) - var30 * param4 + var30;
                    if (param2 >= param0) {
                      L42: {
                        param4 = param4 << 16;
                        param5 = param4 << 16;
                        if (param1 >= 0) {
                          break L42;
                        } else {
                          param5 = param5 - var26 * param1;
                          param4 = param4 - var27 * param1;
                          param7 = param7 - var31 * param1;
                          param1 = 0;
                          break L42;
                        }
                      }
                      L43: {
                        param3 = param3 << 16;
                        if (param0 >= 0) {
                          break L43;
                        } else {
                          param3 = param3 - var28 * param0;
                          param0 = 0;
                          break L43;
                        }
                      }
                      var41 = param1 - field_g;
                      var32 = var32 + var34 * var41;
                      var35 = var35 + var37 * var41;
                      var38 = var38 + var40 * var41;
                      if (var26 >= var27) {
                        param2 = param2 - param0;
                        param0 = param0 - param1;
                        param1 = field_e[param1];
                        L44: while (true) {
                          param0--;
                          if (param0 < 0) {
                            param2--;
                            L45: while (true) {
                              if (param2 < 0) {
                                return;
                              } else {
                                jb.a(vj.field_j, var43, 0, 0, param1, param4 >> 16, param3 >> 16, param7, var30, var32, var35, var38, var33, var36, var39);
                                param3 = param3 + var28;
                                param4 = param4 + var27;
                                param7 = param7 + var31;
                                param1 = param1 + vj.field_l;
                                var32 = var32 + var34;
                                var35 = var35 + var37;
                                var38 = var38 + var40;
                                param2--;
                                continue L45;
                              }
                            }
                          } else {
                            jb.a(vj.field_j, var43, 0, 0, param1, param4 >> 16, param5 >> 16, param7, var30, var32, var35, var38, var33, var36, var39);
                            param5 = param5 + var26;
                            param4 = param4 + var27;
                            param7 = param7 + var31;
                            param1 = param1 + vj.field_l;
                            var32 = var32 + var34;
                            var35 = var35 + var37;
                            var38 = var38 + var40;
                            continue L44;
                          }
                        }
                      } else {
                        param2 = param2 - param0;
                        param0 = param0 - param1;
                        param1 = field_e[param1];
                        L46: while (true) {
                          param0--;
                          if (param0 < 0) {
                            param2--;
                            L47: while (true) {
                              if (param2 < 0) {
                                return;
                              } else {
                                jb.a(vj.field_j, var43, 0, 0, param1, param3 >> 16, param4 >> 16, param7, var30, var32, var35, var38, var33, var36, var39);
                                param3 = param3 + var28;
                                param4 = param4 + var27;
                                param7 = param7 + var31;
                                param1 = param1 + vj.field_l;
                                var32 = var32 + var34;
                                var35 = var35 + var37;
                                var38 = var38 + var40;
                                param2--;
                                continue L47;
                              }
                            }
                          } else {
                            jb.a(vj.field_j, var43, 0, 0, param1, param5 >> 16, param4 >> 16, param7, var30, var32, var35, var38, var33, var36, var39);
                            param5 = param5 + var26;
                            param4 = param4 + var27;
                            param7 = param7 + var31;
                            param1 = param1 + vj.field_l;
                            var32 = var32 + var34;
                            var35 = var35 + var37;
                            var38 = var38 + var40;
                            continue L46;
                          }
                        }
                      }
                    } else {
                      L48: {
                        param4 = param4 << 16;
                        param3 = param4 << 16;
                        if (param1 >= 0) {
                          break L48;
                        } else {
                          param3 = param3 - var26 * param1;
                          param4 = param4 - var27 * param1;
                          param7 = param7 - var31 * param1;
                          param1 = 0;
                          break L48;
                        }
                      }
                      L49: {
                        param5 = param5 << 16;
                        if (param2 >= 0) {
                          break L49;
                        } else {
                          param5 = param5 - var28 * param2;
                          param2 = 0;
                          break L49;
                        }
                      }
                      L50: {
                        L51: {
                          var41 = param1 - field_g;
                          var32 = var32 + var34 * var41;
                          var35 = var35 + var37 * var41;
                          var38 = var38 + var40 * var41;
                          if (param1 == param2) {
                            break L51;
                          } else {
                            if (var26 < var27) {
                              break L50;
                            } else {
                              break L51;
                            }
                          }
                        }
                        L52: {
                          if (param1 != param2) {
                            break L52;
                          } else {
                            if (var26 <= var28) {
                              break L52;
                            } else {
                              break L50;
                            }
                          }
                        }
                        param0 = param0 - param2;
                        param2 = param2 - param1;
                        param1 = field_e[param1];
                        L53: while (true) {
                          param2--;
                          if (param2 < 0) {
                            param0--;
                            L54: while (true) {
                              if (param0 < 0) {
                                return;
                              } else {
                                jb.a(vj.field_j, var43, 0, 0, param1, param5 >> 16, param3 >> 16, param7, var30, var32, var35, var38, var33, var36, var39);
                                param3 = param3 + var26;
                                param5 = param5 + var28;
                                param7 = param7 + var31;
                                param1 = param1 + vj.field_l;
                                var32 = var32 + var34;
                                var35 = var35 + var37;
                                var38 = var38 + var40;
                                param0--;
                                continue L54;
                              }
                            }
                          } else {
                            jb.a(vj.field_j, var43, 0, 0, param1, param4 >> 16, param3 >> 16, param7, var30, var32, var35, var38, var33, var36, var39);
                            param3 = param3 + var26;
                            param4 = param4 + var27;
                            param7 = param7 + var31;
                            param1 = param1 + vj.field_l;
                            var32 = var32 + var34;
                            var35 = var35 + var37;
                            var38 = var38 + var40;
                            continue L53;
                          }
                        }
                      }
                      param0 = param0 - param2;
                      param2 = param2 - param1;
                      param1 = field_e[param1];
                      L55: while (true) {
                        param2--;
                        if (param2 < 0) {
                          param0--;
                          L56: while (true) {
                            if (param0 < 0) {
                              return;
                            } else {
                              jb.a(vj.field_j, var43, 0, 0, param1, param3 >> 16, param5 >> 16, param7, var30, var32, var35, var38, var33, var36, var39);
                              param3 = param3 + var26;
                              param5 = param5 + var28;
                              param7 = param7 + var31;
                              param1 = param1 + vj.field_l;
                              var32 = var32 + var34;
                              var35 = var35 + var37;
                              var38 = var38 + var40;
                              param0--;
                              continue L56;
                            }
                          }
                        } else {
                          jb.a(vj.field_j, var43, 0, 0, param1, param3 >> 16, param4 >> 16, param7, var30, var32, var35, var38, var33, var36, var39);
                          param3 = param3 + var26;
                          param4 = param4 + var27;
                          param7 = param7 + var31;
                          param1 = param1 + vj.field_l;
                          var32 = var32 + var34;
                          var35 = var35 + var37;
                          var38 = var38 + var40;
                          continue L55;
                        }
                      }
                    }
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              break L0;
            }
          }
        }
        var20 = field_b.b(-76, param18);
        jb.a(param0, param1, param2, param3, param4, param5, jb.b(var20, param6), jb.b(var20, param7), jb.b(var20, param8));
    }

    public static void c() {
        field_e = null;
        field_p = null;
        field_b = null;
        field_o = null;
        field_a = null;
        field_j = null;
        field_k = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        L0: {
          var9 = param4 - param3;
          var10 = param1 - param0;
          var11 = param5 - param3;
          var12 = param2 - param0;
          var13 = param7 - param6;
          var14 = param8 - param6;
          if (param2 == param1) {
            var15 = 0;
            break L0;
          } else {
            var15 = (param5 - param4 << 16) / (param2 - param1);
            break L0;
          }
        }
        L1: {
          if (param1 == param0) {
            var16 = 0;
            break L1;
          } else {
            var16 = (var9 << 16) / var10;
            break L1;
          }
        }
        L2: {
          if (param2 == param0) {
            var17 = 0;
            break L2;
          } else {
            var17 = (var11 << 16) / var12;
            break L2;
          }
        }
        var18 = var9 * var12 - var11 * var10;
        if (var18 != 0) {
          L3: {
            var19 = (var13 * var12 - var14 * var10 << 8) / var18;
            var20 = (var14 * var9 - var13 * var11 << 8) / var18;
            if (param0 > param1) {
              break L3;
            } else {
              if (param0 > param2) {
                break L3;
              } else {
                if (param0 < field_c) {
                  L4: {
                    if (param1 <= field_c) {
                      break L4;
                    } else {
                      param1 = field_c;
                      break L4;
                    }
                  }
                  L5: {
                    if (param2 <= field_c) {
                      break L5;
                    } else {
                      param2 = field_c;
                      break L5;
                    }
                  }
                  param6 = (param6 << 8) - var19 * param3 + var19;
                  if (param1 >= param2) {
                    L6: {
                      param3 = param3 << 16;
                      param4 = param3 << 16;
                      if (param0 >= 0) {
                        break L6;
                      } else {
                        param4 = param4 - var17 * param0;
                        param3 = param3 - var16 * param0;
                        param6 = param6 - var20 * param0;
                        param0 = 0;
                        break L6;
                      }
                    }
                    L7: {
                      param5 = param5 << 16;
                      if (param2 >= 0) {
                        break L7;
                      } else {
                        param5 = param5 - var15 * param2;
                        param2 = 0;
                        break L7;
                      }
                    }
                    L8: {
                      L9: {
                        if (param0 == param2) {
                          break L9;
                        } else {
                          if (var17 < var16) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                      L10: {
                        if (param0 != param2) {
                          break L10;
                        } else {
                          if (var15 <= var16) {
                            break L10;
                          } else {
                            break L8;
                          }
                        }
                      }
                      param1 = param1 - param2;
                      param2 = param2 - param0;
                      param0 = field_e[param0];
                      L11: while (true) {
                        param2--;
                        if (param2 < 0) {
                          param1--;
                          L12: while (true) {
                            if (param1 < 0) {
                              return;
                            } else {
                              jb.a(vj.field_j, param0, 0, 0, param3 >> 16, param5 >> 16, param6, var19);
                              param5 = param5 + var15;
                              param3 = param3 + var16;
                              param6 = param6 + var20;
                              param0 = param0 + vj.field_l;
                              param1--;
                              continue L12;
                            }
                          }
                        } else {
                          jb.a(vj.field_j, param0, 0, 0, param3 >> 16, param4 >> 16, param6, var19);
                          param4 = param4 + var17;
                          param3 = param3 + var16;
                          param6 = param6 + var20;
                          param0 = param0 + vj.field_l;
                          continue L11;
                        }
                      }
                    }
                    param1 = param1 - param2;
                    param2 = param2 - param0;
                    param0 = field_e[param0];
                    L13: while (true) {
                      param2--;
                      if (param2 < 0) {
                        param1--;
                        L14: while (true) {
                          if (param1 < 0) {
                            return;
                          } else {
                            jb.a(vj.field_j, param0, 0, 0, param5 >> 16, param3 >> 16, param6, var19);
                            param5 = param5 + var15;
                            param3 = param3 + var16;
                            param6 = param6 + var20;
                            param0 = param0 + vj.field_l;
                            param1--;
                            continue L14;
                          }
                        }
                      } else {
                        jb.a(vj.field_j, param0, 0, 0, param4 >> 16, param3 >> 16, param6, var19);
                        param4 = param4 + var17;
                        param3 = param3 + var16;
                        param6 = param6 + var20;
                        param0 = param0 + vj.field_l;
                        continue L13;
                      }
                    }
                  } else {
                    L15: {
                      param3 = param3 << 16;
                      param5 = param3 << 16;
                      if (param0 >= 0) {
                        break L15;
                      } else {
                        param5 = param5 - var17 * param0;
                        param3 = param3 - var16 * param0;
                        param6 = param6 - var20 * param0;
                        param0 = 0;
                        break L15;
                      }
                    }
                    L16: {
                      param4 = param4 << 16;
                      if (param1 >= 0) {
                        break L16;
                      } else {
                        param4 = param4 - var15 * param1;
                        param1 = 0;
                        break L16;
                      }
                    }
                    L17: {
                      L18: {
                        if (param0 == param1) {
                          break L18;
                        } else {
                          if (var17 < var16) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                      L19: {
                        if (param0 != param1) {
                          break L19;
                        } else {
                          if (var17 <= var15) {
                            break L19;
                          } else {
                            break L17;
                          }
                        }
                      }
                      param2 = param2 - param1;
                      param1 = param1 - param0;
                      param0 = field_e[param0];
                      L20: while (true) {
                        param1--;
                        if (param1 < 0) {
                          param2--;
                          L21: while (true) {
                            if (param2 < 0) {
                              return;
                            } else {
                              jb.a(vj.field_j, param0, 0, 0, param4 >> 16, param5 >> 16, param6, var19);
                              param5 = param5 + var17;
                              param4 = param4 + var15;
                              param6 = param6 + var20;
                              param0 = param0 + vj.field_l;
                              param2--;
                              continue L21;
                            }
                          }
                        } else {
                          jb.a(vj.field_j, param0, 0, 0, param3 >> 16, param5 >> 16, param6, var19);
                          param5 = param5 + var17;
                          param3 = param3 + var16;
                          param6 = param6 + var20;
                          param0 = param0 + vj.field_l;
                          continue L20;
                        }
                      }
                    }
                    param2 = param2 - param1;
                    param1 = param1 - param0;
                    param0 = field_e[param0];
                    L22: while (true) {
                      param1--;
                      if (param1 < 0) {
                        param2--;
                        L23: while (true) {
                          if (param2 < 0) {
                            return;
                          } else {
                            jb.a(vj.field_j, param0, 0, 0, param5 >> 16, param4 >> 16, param6, var19);
                            param5 = param5 + var17;
                            param4 = param4 + var15;
                            param6 = param6 + var20;
                            param0 = param0 + vj.field_l;
                            param2--;
                            continue L23;
                          }
                        }
                      } else {
                        jb.a(vj.field_j, param0, 0, 0, param5 >> 16, param3 >> 16, param6, var19);
                        param5 = param5 + var17;
                        param3 = param3 + var16;
                        param6 = param6 + var20;
                        param0 = param0 + vj.field_l;
                        continue L22;
                      }
                    }
                  }
                } else {
                  return;
                }
              }
            }
          }
          if (param1 > param2) {
            if (param2 < field_c) {
              L24: {
                if (param0 <= field_c) {
                  break L24;
                } else {
                  param0 = field_c;
                  break L24;
                }
              }
              L25: {
                if (param1 <= field_c) {
                  break L25;
                } else {
                  param1 = field_c;
                  break L25;
                }
              }
              param8 = (param8 << 8) - var19 * param5 + var19;
              if (param0 >= param1) {
                L26: {
                  param5 = param5 << 16;
                  param3 = param5 << 16;
                  if (param2 >= 0) {
                    break L26;
                  } else {
                    param3 = param3 - var15 * param2;
                    param5 = param5 - var17 * param2;
                    param8 = param8 - var20 * param2;
                    param2 = 0;
                    break L26;
                  }
                }
                L27: {
                  param4 = param4 << 16;
                  if (param1 >= 0) {
                    break L27;
                  } else {
                    param4 = param4 - var16 * param1;
                    param1 = 0;
                    break L27;
                  }
                }
                if (var15 >= var17) {
                  param0 = param0 - param1;
                  param1 = param1 - param2;
                  param2 = field_e[param2];
                  L28: while (true) {
                    param1--;
                    if (param1 < 0) {
                      param0--;
                      L29: while (true) {
                        if (param0 < 0) {
                          return;
                        } else {
                          jb.a(vj.field_j, param2, 0, 0, param5 >> 16, param4 >> 16, param8, var19);
                          param4 = param4 + var16;
                          param5 = param5 + var17;
                          param8 = param8 + var20;
                          param2 = param2 + vj.field_l;
                          param0--;
                          continue L29;
                        }
                      }
                    } else {
                      jb.a(vj.field_j, param2, 0, 0, param5 >> 16, param3 >> 16, param8, var19);
                      param3 = param3 + var15;
                      param5 = param5 + var17;
                      param8 = param8 + var20;
                      param2 = param2 + vj.field_l;
                      continue L28;
                    }
                  }
                } else {
                  param0 = param0 - param1;
                  param1 = param1 - param2;
                  param2 = field_e[param2];
                  L30: while (true) {
                    param1--;
                    if (param1 < 0) {
                      param0--;
                      L31: while (true) {
                        if (param0 < 0) {
                          return;
                        } else {
                          jb.a(vj.field_j, param2, 0, 0, param4 >> 16, param5 >> 16, param8, var19);
                          param4 = param4 + var16;
                          param5 = param5 + var17;
                          param8 = param8 + var20;
                          param2 = param2 + vj.field_l;
                          param0--;
                          continue L31;
                        }
                      }
                    } else {
                      jb.a(vj.field_j, param2, 0, 0, param3 >> 16, param5 >> 16, param8, var19);
                      param3 = param3 + var15;
                      param5 = param5 + var17;
                      param8 = param8 + var20;
                      param2 = param2 + vj.field_l;
                      continue L30;
                    }
                  }
                }
              } else {
                L32: {
                  param5 = param5 << 16;
                  param4 = param5 << 16;
                  if (param2 >= 0) {
                    break L32;
                  } else {
                    param4 = param4 - var15 * param2;
                    param5 = param5 - var17 * param2;
                    param8 = param8 - var20 * param2;
                    param2 = 0;
                    break L32;
                  }
                }
                L33: {
                  param3 = param3 << 16;
                  if (param0 >= 0) {
                    break L33;
                  } else {
                    param3 = param3 - var16 * param0;
                    param0 = 0;
                    break L33;
                  }
                }
                if (var15 >= var17) {
                  param1 = param1 - param0;
                  param0 = param0 - param2;
                  param2 = field_e[param2];
                  L34: while (true) {
                    param0--;
                    if (param0 < 0) {
                      param1--;
                      L35: while (true) {
                        if (param1 < 0) {
                          return;
                        } else {
                          jb.a(vj.field_j, param2, 0, 0, param3 >> 16, param4 >> 16, param8, var19);
                          param4 = param4 + var15;
                          param3 = param3 + var16;
                          param8 = param8 + var20;
                          param2 = param2 + vj.field_l;
                          param1--;
                          continue L35;
                        }
                      }
                    } else {
                      jb.a(vj.field_j, param2, 0, 0, param5 >> 16, param4 >> 16, param8, var19);
                      param4 = param4 + var15;
                      param5 = param5 + var17;
                      param8 = param8 + var20;
                      param2 = param2 + vj.field_l;
                      continue L34;
                    }
                  }
                } else {
                  param1 = param1 - param0;
                  param0 = param0 - param2;
                  param2 = field_e[param2];
                  L36: while (true) {
                    param0--;
                    if (param0 < 0) {
                      param1--;
                      L37: while (true) {
                        if (param1 < 0) {
                          return;
                        } else {
                          jb.a(vj.field_j, param2, 0, 0, param4 >> 16, param3 >> 16, param8, var19);
                          param4 = param4 + var15;
                          param3 = param3 + var16;
                          param8 = param8 + var20;
                          param2 = param2 + vj.field_l;
                          param1--;
                          continue L37;
                        }
                      }
                    } else {
                      jb.a(vj.field_j, param2, 0, 0, param4 >> 16, param5 >> 16, param8, var19);
                      param4 = param4 + var15;
                      param5 = param5 + var17;
                      param8 = param8 + var20;
                      param2 = param2 + vj.field_l;
                      continue L36;
                    }
                  }
                }
              }
            } else {
              return;
            }
          } else {
            if (param1 < field_c) {
              L38: {
                if (param2 <= field_c) {
                  break L38;
                } else {
                  param2 = field_c;
                  break L38;
                }
              }
              L39: {
                if (param0 <= field_c) {
                  break L39;
                } else {
                  param0 = field_c;
                  break L39;
                }
              }
              param7 = (param7 << 8) - var19 * param4 + var19;
              if (param2 >= param0) {
                L40: {
                  param4 = param4 << 16;
                  param5 = param4 << 16;
                  if (param1 >= 0) {
                    break L40;
                  } else {
                    param5 = param5 - var16 * param1;
                    param4 = param4 - var15 * param1;
                    param7 = param7 - var20 * param1;
                    param1 = 0;
                    break L40;
                  }
                }
                L41: {
                  param3 = param3 << 16;
                  if (param0 >= 0) {
                    break L41;
                  } else {
                    param3 = param3 - var17 * param0;
                    param0 = 0;
                    break L41;
                  }
                }
                if (var16 >= var15) {
                  param2 = param2 - param0;
                  param0 = param0 - param1;
                  param1 = field_e[param1];
                  L42: while (true) {
                    param0--;
                    if (param0 < 0) {
                      param2--;
                      L43: while (true) {
                        if (param2 < 0) {
                          return;
                        } else {
                          jb.a(vj.field_j, param1, 0, 0, param4 >> 16, param3 >> 16, param7, var19);
                          param3 = param3 + var17;
                          param4 = param4 + var15;
                          param7 = param7 + var20;
                          param1 = param1 + vj.field_l;
                          param2--;
                          continue L43;
                        }
                      }
                    } else {
                      jb.a(vj.field_j, param1, 0, 0, param4 >> 16, param5 >> 16, param7, var19);
                      param5 = param5 + var16;
                      param4 = param4 + var15;
                      param7 = param7 + var20;
                      param1 = param1 + vj.field_l;
                      continue L42;
                    }
                  }
                } else {
                  param2 = param2 - param0;
                  param0 = param0 - param1;
                  param1 = field_e[param1];
                  L44: while (true) {
                    param0--;
                    if (param0 < 0) {
                      param2--;
                      L45: while (true) {
                        if (param2 < 0) {
                          return;
                        } else {
                          jb.a(vj.field_j, param1, 0, 0, param3 >> 16, param4 >> 16, param7, var19);
                          param3 = param3 + var17;
                          param4 = param4 + var15;
                          param7 = param7 + var20;
                          param1 = param1 + vj.field_l;
                          param2--;
                          continue L45;
                        }
                      }
                    } else {
                      jb.a(vj.field_j, param1, 0, 0, param5 >> 16, param4 >> 16, param7, var19);
                      param5 = param5 + var16;
                      param4 = param4 + var15;
                      param7 = param7 + var20;
                      param1 = param1 + vj.field_l;
                      continue L44;
                    }
                  }
                }
              } else {
                L46: {
                  param4 = param4 << 16;
                  param3 = param4 << 16;
                  if (param1 >= 0) {
                    break L46;
                  } else {
                    param3 = param3 - var16 * param1;
                    param4 = param4 - var15 * param1;
                    param7 = param7 - var20 * param1;
                    param1 = 0;
                    break L46;
                  }
                }
                L47: {
                  param5 = param5 << 16;
                  if (param2 >= 0) {
                    break L47;
                  } else {
                    param5 = param5 - var17 * param2;
                    param2 = 0;
                    break L47;
                  }
                }
                L48: {
                  L49: {
                    if (param1 == param2) {
                      break L49;
                    } else {
                      if (var16 < var15) {
                        break L48;
                      } else {
                        break L49;
                      }
                    }
                  }
                  L50: {
                    if (param1 != param2) {
                      break L50;
                    } else {
                      if (var16 <= var17) {
                        break L50;
                      } else {
                        break L48;
                      }
                    }
                  }
                  param0 = param0 - param2;
                  param2 = param2 - param1;
                  param1 = field_e[param1];
                  L51: while (true) {
                    param2--;
                    if (param2 < 0) {
                      param0--;
                      L52: while (true) {
                        if (param0 < 0) {
                          return;
                        } else {
                          jb.a(vj.field_j, param1, 0, 0, param5 >> 16, param3 >> 16, param7, var19);
                          param3 = param3 + var16;
                          param5 = param5 + var17;
                          param7 = param7 + var20;
                          param1 = param1 + vj.field_l;
                          param0--;
                          continue L52;
                        }
                      }
                    } else {
                      jb.a(vj.field_j, param1, 0, 0, param4 >> 16, param3 >> 16, param7, var19);
                      param3 = param3 + var16;
                      param4 = param4 + var15;
                      param7 = param7 + var20;
                      param1 = param1 + vj.field_l;
                      continue L51;
                    }
                  }
                }
                param0 = param0 - param2;
                param2 = param2 - param1;
                param1 = field_e[param1];
                L53: while (true) {
                  param2--;
                  if (param2 < 0) {
                    param0--;
                    L54: while (true) {
                      if (param0 < 0) {
                        return;
                      } else {
                        jb.a(vj.field_j, param1, 0, 0, param3 >> 16, param5 >> 16, param7, var19);
                        param3 = param3 + var16;
                        param5 = param5 + var17;
                        param7 = param7 + var20;
                        param1 = param1 + vj.field_l;
                        param0--;
                        continue L54;
                      }
                    }
                  } else {
                    jb.a(vj.field_j, param1, 0, 0, param3 >> 16, param4 >> 16, param7, var19);
                    param3 = param3 + var16;
                    param4 = param4 + var15;
                    param7 = param7 + var20;
                    param1 = param1 + vj.field_l;
                    continue L53;
                  }
                }
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int var6;
        int var7;
        int var8;
        L0: {
          if (!field_n) {
            break L0;
          } else {
            L1: {
              if (param5 <= field_i) {
                break L1;
              } else {
                param5 = field_i;
                break L1;
              }
            }
            if (param4 >= 0) {
              break L0;
            } else {
              param4 = 0;
              break L0;
            }
          }
        }
        if (param4 < param5) {
          param1 = param1 + param4;
          param3 = param5 - param4 >> 2;
          if (field_d != 0) {
            L2: {
              if (field_d != 254) {
                var6 = field_d;
                var7 = 256 - field_d;
                param2 = ((param2 & 16711935) * var7 >> 8 & 16711935) + ((param2 & 65280) * var7 >> 8 & 65280);
                L3: while (true) {
                  param3--;
                  if (param3 < 0) {
                    param3 = param5 - param4 & 3;
                    L4: while (true) {
                      param3--;
                      if (param3 < 0) {
                        break L2;
                      } else {
                        var8 = param0[param1];
                        incrementValue$0 = param1;
                        param1++;
                        param0[incrementValue$0] = param2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & 65280) * var6 >> 8 & 65280);
                        continue L4;
                      }
                    }
                  } else {
                    var8 = param0[param1];
                    incrementValue$1 = param1;
                    param1++;
                    param0[incrementValue$1] = param2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & 65280) * var6 >> 8 & 65280);
                    var8 = param0[param1];
                    incrementValue$2 = param1;
                    param1++;
                    param0[incrementValue$2] = param2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & 65280) * var6 >> 8 & 65280);
                    var8 = param0[param1];
                    incrementValue$3 = param1;
                    param1++;
                    param0[incrementValue$3] = param2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & 65280) * var6 >> 8 & 65280);
                    var8 = param0[param1];
                    incrementValue$4 = param1;
                    param1++;
                    param0[incrementValue$4] = param2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & 65280) * var6 >> 8 & 65280);
                    continue L3;
                  }
                }
              } else {
                L5: while (true) {
                  param3--;
                  if (param3 < 0) {
                    param3 = param5 - param4 & 3;
                    L6: while (true) {
                      param3--;
                      if (param3 < 0) {
                        break L2;
                      } else {
                        incrementValue$5 = param1;
                        param1++;
                        param0[incrementValue$5] = param0[param1];
                        continue L6;
                      }
                    }
                  } else {
                    incrementValue$6 = param1;
                    param1++;
                    param0[incrementValue$6] = param0[param1];
                    incrementValue$7 = param1;
                    param1++;
                    param0[incrementValue$7] = param0[param1];
                    incrementValue$8 = param1;
                    param1++;
                    param0[incrementValue$8] = param0[param1];
                    incrementValue$9 = param1;
                    param1++;
                    param0[incrementValue$9] = param0[param1];
                    continue L5;
                  }
                }
              }
            }
            return;
          } else {
            L7: while (true) {
              param3--;
              if (param3 < 0) {
                param3 = param5 - param4 & 3;
                L8: while (true) {
                  param3--;
                  if (param3 < 0) {
                    return;
                  } else {
                    incrementValue$10 = param1;
                    param1++;
                    param0[incrementValue$10] = param2;
                    continue L8;
                  }
                }
              } else {
                incrementValue$11 = param1;
                param1++;
                param0[incrementValue$11] = param2;
                incrementValue$12 = param1;
                param1++;
                param0[incrementValue$12] = param2;
                incrementValue$13 = param1;
                param1++;
                param0[incrementValue$13] = param2;
                incrementValue$14 = param1;
                param1++;
                param0[incrementValue$14] = param2;
                continue L7;
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(b param0) {
        field_b = param0;
    }

    private final static void a(int param0, int param1) {
        int incrementValue$0 = 0;
        int var2;
        int var3;
        double var4;
        double var6;
        int var8;
        double var9;
        double var11;
        double var13;
        double var15;
        double var17_double;
        int var17;
        int var18;
        double var19_double;
        int var19;
        int var20;
        double var21;
        double var23;
        double var25;
        var2 = param0 * 128;
        var3 = param0;
        L0: while (true) {
          if (var3 >= param1) {
            return;
          } else {
            var4 = (double)(var3 >> 3) / 64.0 + 0.0078125;
            var6 = (double)(var3 & 7) / 8.0 + 0.0625;
            var8 = 0;
            L1: while (true) {
              if (var8 >= 128) {
                var3++;
                continue L0;
              } else {
                L2: {
                  var9 = (double)var8 / 128.0;
                  var11 = var9;
                  var13 = var9;
                  var15 = var9;
                  if (var6 == 0.0) {
                    break L2;
                  } else {
                    L3: {
                      if (var9 >= 0.5) {
                        var17_double = var9 + var6 - var9 * var6;
                        break L3;
                      } else {
                        var17_double = var9 * (1.0 + var6);
                        break L3;
                      }
                    }
                    L4: {
                      var19_double = 2.0 * var9 - var17_double;
                      var21 = var4 + 0.3333333333333333;
                      if (var21 <= 1.0) {
                        break L4;
                      } else {
                        var21 = var21 - 1.0;
                        break L4;
                      }
                    }
                    L5: {
                      var23 = var4;
                      var25 = var4 - 0.3333333333333333;
                      if (var25 >= 0.0) {
                        break L5;
                      } else {
                        var25 = var25 + 1.0;
                        break L5;
                      }
                    }
                    L6: {
                      if (6.0 * var21 >= 1.0) {
                        if (2.0 * var21 >= 1.0) {
                          if (3.0 * var21 >= 2.0) {
                            var11 = var19_double;
                            break L6;
                          } else {
                            var11 = var19_double + (var17_double - var19_double) * (0.6666666666666666 - var21) * 6.0;
                            break L6;
                          }
                        } else {
                          var11 = var17_double;
                          break L6;
                        }
                      } else {
                        var11 = var19_double + (var17_double - var19_double) * 6.0 * var21;
                        break L6;
                      }
                    }
                    L7: {
                      if (6.0 * var23 >= 1.0) {
                        if (2.0 * var23 >= 1.0) {
                          if (3.0 * var23 >= 2.0) {
                            var13 = var19_double;
                            break L7;
                          } else {
                            var13 = var19_double + (var17_double - var19_double) * (0.6666666666666666 - var23) * 6.0;
                            break L7;
                          }
                        } else {
                          var13 = var17_double;
                          break L7;
                        }
                      } else {
                        var13 = var19_double + (var17_double - var19_double) * 6.0 * var23;
                        break L7;
                      }
                    }
                    if (6.0 * var25 >= 1.0) {
                      if (2.0 * var25 >= 1.0) {
                        if (3.0 * var25 >= 2.0) {
                          var15 = var19_double;
                          break L2;
                        } else {
                          var15 = var19_double + (var17_double - var19_double) * (0.6666666666666666 - var25) * 6.0;
                          break L2;
                        }
                      } else {
                        var15 = var17_double;
                        break L2;
                      }
                    } else {
                      var15 = var19_double + (var17_double - var19_double) * 6.0 * var25;
                      break L2;
                    }
                  }
                }
                L8: {
                  var11 = Math.pow(var11, (double)field_l);
                  var13 = Math.pow(var13, (double)field_l);
                  var15 = Math.pow(var15, (double)field_l);
                  var17 = (int)(var11 * 256.0);
                  var18 = (int)(var13 * 256.0);
                  var19 = (int)(var15 * 256.0);
                  var20 = (var17 << 16) + (var18 << 8) + var19;
                  if (var20 != 0) {
                    break L8;
                  } else {
                    var20 = 1;
                    break L8;
                  }
                }
                incrementValue$0 = var2;
                var2++;
                field_p[incrementValue$0] = var20;
                var8++;
                continue L1;
              }
            }
          }
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14) {
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int incrementValue$24 = 0;
        int incrementValue$25 = 0;
        int incrementValue$26 = 0;
        int dupTemp$27 = 0;
        int dupTemp$28 = 0;
        int dupTemp$29 = 0;
        int dupTemp$30 = 0;
        int dupTemp$31 = 0;
        int dupTemp$32 = 0;
        int dupTemp$33 = 0;
        int dupTemp$34 = 0;
        int dupTemp$35 = 0;
        int incrementValue$36 = 0;
        int incrementValue$37 = 0;
        int incrementValue$38 = 0;
        int incrementValue$39 = 0;
        int incrementValue$40 = 0;
        int incrementValue$41 = 0;
        int incrementValue$42 = 0;
        int incrementValue$43 = 0;
        int incrementValue$44 = 0;
        int dupTemp$45 = 0;
        int dupTemp$46 = 0;
        int dupTemp$47 = 0;
        int dupTemp$48 = 0;
        int dupTemp$49 = 0;
        int dupTemp$50 = 0;
        int dupTemp$51 = 0;
        int dupTemp$52 = 0;
        int dupTemp$53 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (!field_n) {
                        statePc = 5;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (param6 <= field_i) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    param6 = field_i;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (param5 >= 0) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    param5 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (param5 < param6) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    return;
                }
                case 7: {
                    param4 = param4 + param5;
                    param7 = param7 + param8 * param5;
                    var17 = param6 - param5;
                    if (!field_f) {
                        statePc = 49;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var23 = param5 - field_m;
                    param9 = param9 + (param12 >> 3) * var23;
                    param10 = param10 + (param13 >> 3) * var23;
                    param11 = param11 + (param14 >> 3) * var23;
                    var22 = param11 >> 12;
                    if (var22 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var18 = param9 / var22;
                    var19 = param10 / var22;
                    statePc = 11;
                    continue stateLoop;
                }
                case 10: {
                    var18 = 0;
                    var19 = 0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    param9 = param9 + param12;
                    param10 = param10 + param13;
                    param11 = param11 + param14;
                    var22 = param11 >> 12;
                    if (var22 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var20 = param9 / var22;
                    var21 = param10 / var22;
                    statePc = 14;
                    continue stateLoop;
                }
                case 13: {
                    var20 = 0;
                    var21 = 0;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    param2 = (var18 << 20) + var19;
                    var16 = (var20 - var18 >> 3 << 20) + (var21 - var19 >> 3);
                    var17 = var17 >> 3;
                    param8 = param8 << 3;
                    var15 = param7 >> 8;
                    if (!field_q) {
                        statePc = 23;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (var17 <= 0) {
                        statePc = 20;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    param3 = param1[(param2 & 4032) + (param2 >>> 26)];
                    incrementValue$18 = param4;
                    param4++;
                    param0[incrementValue$18] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                    param2 = param2 + var16;
                    param3 = param1[(param2 & 4032) + (param2 >>> 26)];
                    incrementValue$19 = param4;
                    param4++;
                    param0[incrementValue$19] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                    param2 = param2 + var16;
                    param3 = param1[(param2 & 4032) + (param2 >>> 26)];
                    incrementValue$20 = param4;
                    param4++;
                    param0[incrementValue$20] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                    param2 = param2 + var16;
                    param3 = param1[(param2 & 4032) + (param2 >>> 26)];
                    incrementValue$21 = param4;
                    param4++;
                    param0[incrementValue$21] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                    param2 = param2 + var16;
                    param3 = param1[(param2 & 4032) + (param2 >>> 26)];
                    incrementValue$22 = param4;
                    param4++;
                    param0[incrementValue$22] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                    param2 = param2 + var16;
                    param3 = param1[(param2 & 4032) + (param2 >>> 26)];
                    incrementValue$23 = param4;
                    param4++;
                    param0[incrementValue$23] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                    param2 = param2 + var16;
                    param3 = param1[(param2 & 4032) + (param2 >>> 26)];
                    incrementValue$24 = param4;
                    param4++;
                    param0[incrementValue$24] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                    param2 = param2 + var16;
                    param3 = param1[(param2 & 4032) + (param2 >>> 26)];
                    incrementValue$25 = param4;
                    param4++;
                    param0[incrementValue$25] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                    param2 = param2 + var16;
                    var18 = var20;
                    var19 = var21;
                    param9 = param9 + param12;
                    param10 = param10 + param13;
                    param11 = param11 + param14;
                    var22 = param11 >> 12;
                    if (var22 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var20 = param9 / var22;
                    var21 = param10 / var22;
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    var20 = 0;
                    var21 = 0;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    param2 = (var18 << 20) + var19;
                    var16 = (var20 - var18 >> 3 << 20) + (var21 - var19 >> 3);
                    param7 = param7 + param8;
                    var15 = param7 >> 8;
                    var17--;
                    if (var17 > 0) {
                        statePc = 16;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var17 = param6 - param5 & 7;
                    if (var17 <= 0) {
                        statePc = 89;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    param3 = param1[(param2 & 4032) + (param2 >>> 26)];
                    incrementValue$26 = param4;
                    param4++;
                    param0[incrementValue$26] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                    param2 = param2 + var16;
                    var17--;
                    if (var17 > 0) {
                        statePc = 21;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (var17 <= 0) {
                        statePc = 44;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    dupTemp$27 = param1[(param2 & 4032) + (param2 >>> 26)];
                    param3 = dupTemp$27;
                    if (dupTemp$27 == 0) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    param4++;
                    param2 = param2 + var16;
                    dupTemp$28 = param1[(param2 & 4032) + (param2 >>> 26)];
                    param3 = dupTemp$28;
                    if (dupTemp$28 == 0) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    param4++;
                    param2 = param2 + var16;
                    dupTemp$29 = param1[(param2 & 4032) + (param2 >>> 26)];
                    param3 = dupTemp$29;
                    if (dupTemp$29 == 0) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    param4++;
                    param2 = param2 + var16;
                    dupTemp$30 = param1[(param2 & 4032) + (param2 >>> 26)];
                    param3 = dupTemp$30;
                    if (dupTemp$30 == 0) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    param4++;
                    param2 = param2 + var16;
                    dupTemp$31 = param1[(param2 & 4032) + (param2 >>> 26)];
                    param3 = dupTemp$31;
                    if (dupTemp$31 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    param4++;
                    param2 = param2 + var16;
                    dupTemp$32 = param1[(param2 & 4032) + (param2 >>> 26)];
                    param3 = dupTemp$32;
                    if (dupTemp$32 == 0) {
                        statePc = 36;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    param4++;
                    param2 = param2 + var16;
                    dupTemp$33 = param1[(param2 & 4032) + (param2 >>> 26)];
                    param3 = dupTemp$33;
                    if (dupTemp$33 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    param4++;
                    param2 = param2 + var16;
                    dupTemp$34 = param1[(param2 & 4032) + (param2 >>> 26)];
                    param3 = dupTemp$34;
                    if (dupTemp$34 == 0) {
                        statePc = 40;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    param4++;
                    param2 = param2 + var16;
                    var18 = var20;
                    var19 = var21;
                    param9 = param9 + param12;
                    param10 = param10 + param13;
                    param11 = param11 + param14;
                    var22 = param11 >> 12;
                    if (var22 == 0) {
                        statePc = 42;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var20 = param9 / var22;
                    var21 = param10 / var22;
                    statePc = 43;
                    continue stateLoop;
                }
                case 42: {
                    var20 = 0;
                    var21 = 0;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    param2 = (var18 << 20) + var19;
                    var16 = (var20 - var18 >> 3 << 20) + (var21 - var19 >> 3);
                    param7 = param7 + param8;
                    var15 = param7 >> 8;
                    var17--;
                    if (var17 > 0) {
                        statePc = 24;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    var17 = param6 - param5 & 7;
                    if (var17 <= 0) {
                        statePc = 89;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    dupTemp$35 = param1[(param2 & 4032) + (param2 >>> 26)];
                    param3 = dupTemp$35;
                    if (dupTemp$35 == 0) {
                        statePc = 47;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    param4++;
                    param2 = param2 + var16;
                    var17--;
                    if (var17 > 0) {
                        statePc = 45;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 49: {
                    var23 = param5 - field_m;
                    param9 = param9 + (param12 >> 3) * var23;
                    param10 = param10 + (param13 >> 3) * var23;
                    param11 = param11 + (param14 >> 3) * var23;
                    var22 = param11 >> 14;
                    if (var22 == 0) {
                        statePc = 51;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var18 = param9 / var22;
                    var19 = param10 / var22;
                    statePc = 52;
                    continue stateLoop;
                }
                case 51: {
                    var18 = 0;
                    var19 = 0;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    param9 = param9 + param12;
                    param10 = param10 + param13;
                    param11 = param11 + param14;
                    var22 = param11 >> 14;
                    if (var22 == 0) {
                        statePc = 54;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    var20 = param9 / var22;
                    var21 = param10 / var22;
                    statePc = 55;
                    continue stateLoop;
                }
                case 54: {
                    var20 = 0;
                    var21 = 0;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    param2 = (var18 << 18) + var19;
                    var16 = (var20 - var18 >> 3 << 18) + (var21 - var19 >> 3);
                    var17 = var17 >> 3;
                    param8 = param8 << 3;
                    var15 = param7 >> 8;
                    if (!field_q) {
                        statePc = 64;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    if (var17 <= 0) {
                        statePc = 61;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    param3 = param1[(param2 & 16256) + (param2 >>> 25)];
                    incrementValue$36 = param4;
                    param4++;
                    param0[incrementValue$36] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                    param2 = param2 + var16;
                    param3 = param1[(param2 & 16256) + (param2 >>> 25)];
                    incrementValue$37 = param4;
                    param4++;
                    param0[incrementValue$37] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                    param2 = param2 + var16;
                    param3 = param1[(param2 & 16256) + (param2 >>> 25)];
                    incrementValue$38 = param4;
                    param4++;
                    param0[incrementValue$38] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                    param2 = param2 + var16;
                    param3 = param1[(param2 & 16256) + (param2 >>> 25)];
                    incrementValue$39 = param4;
                    param4++;
                    param0[incrementValue$39] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                    param2 = param2 + var16;
                    param3 = param1[(param2 & 16256) + (param2 >>> 25)];
                    incrementValue$40 = param4;
                    param4++;
                    param0[incrementValue$40] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                    param2 = param2 + var16;
                    param3 = param1[(param2 & 16256) + (param2 >>> 25)];
                    incrementValue$41 = param4;
                    param4++;
                    param0[incrementValue$41] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                    param2 = param2 + var16;
                    param3 = param1[(param2 & 16256) + (param2 >>> 25)];
                    incrementValue$42 = param4;
                    param4++;
                    param0[incrementValue$42] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                    param2 = param2 + var16;
                    param3 = param1[(param2 & 16256) + (param2 >>> 25)];
                    incrementValue$43 = param4;
                    param4++;
                    param0[incrementValue$43] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                    param2 = param2 + var16;
                    var18 = var20;
                    var19 = var21;
                    param9 = param9 + param12;
                    param10 = param10 + param13;
                    param11 = param11 + param14;
                    var22 = param11 >> 14;
                    if (var22 == 0) {
                        statePc = 59;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    var20 = param9 / var22;
                    var21 = param10 / var22;
                    statePc = 60;
                    continue stateLoop;
                }
                case 59: {
                    var20 = 0;
                    var21 = 0;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    param2 = (var18 << 18) + var19;
                    var16 = (var20 - var18 >> 3 << 18) + (var21 - var19 >> 3);
                    param7 = param7 + param8;
                    var15 = param7 >> 8;
                    var17--;
                    if (var17 > 0) {
                        statePc = 57;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    var17 = param6 - param5 & 7;
                    if (var17 <= 0) {
                        statePc = 89;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    param3 = param1[(param2 & 16256) + (param2 >>> 25)];
                    incrementValue$44 = param4;
                    param4++;
                    param0[incrementValue$44] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                    param2 = param2 + var16;
                    var17--;
                    if (var17 > 0) {
                        statePc = 62;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 64: {
                    if (var17 <= 0) {
                        statePc = 85;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    dupTemp$45 = param1[(param2 & 16256) + (param2 >>> 25)];
                    param3 = dupTemp$45;
                    if (dupTemp$45 == 0) {
                        statePc = 67;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    param4++;
                    param2 = param2 + var16;
                    dupTemp$46 = param1[(param2 & 16256) + (param2 >>> 25)];
                    param3 = dupTemp$46;
                    if (dupTemp$46 == 0) {
                        statePc = 69;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    param4++;
                    param2 = param2 + var16;
                    dupTemp$47 = param1[(param2 & 16256) + (param2 >>> 25)];
                    param3 = dupTemp$47;
                    if (dupTemp$47 == 0) {
                        statePc = 71;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    param4++;
                    param2 = param2 + var16;
                    dupTemp$48 = param1[(param2 & 16256) + (param2 >>> 25)];
                    param3 = dupTemp$48;
                    if (dupTemp$48 == 0) {
                        statePc = 73;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    param4++;
                    param2 = param2 + var16;
                    dupTemp$49 = param1[(param2 & 16256) + (param2 >>> 25)];
                    param3 = dupTemp$49;
                    if (dupTemp$49 == 0) {
                        statePc = 75;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    param4++;
                    param2 = param2 + var16;
                    dupTemp$50 = param1[(param2 & 16256) + (param2 >>> 25)];
                    param3 = dupTemp$50;
                    if (dupTemp$50 == 0) {
                        statePc = 77;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    param4++;
                    param2 = param2 + var16;
                    dupTemp$51 = param1[(param2 & 16256) + (param2 >>> 25)];
                    param3 = dupTemp$51;
                    if (dupTemp$51 == 0) {
                        statePc = 79;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    param4++;
                    param2 = param2 + var16;
                    dupTemp$52 = param1[(param2 & 16256) + (param2 >>> 25)];
                    param3 = dupTemp$52;
                    if (dupTemp$52 == 0) {
                        statePc = 81;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    param4++;
                    param2 = param2 + var16;
                    var18 = var20;
                    var19 = var21;
                    param9 = param9 + param12;
                    param10 = param10 + param13;
                    param11 = param11 + param14;
                    var22 = param11 >> 14;
                    if (var22 == 0) {
                        statePc = 83;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    var20 = param9 / var22;
                    var21 = param10 / var22;
                    statePc = 84;
                    continue stateLoop;
                }
                case 83: {
                    var20 = 0;
                    var21 = 0;
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    param2 = (var18 << 18) + var19;
                    var16 = (var20 - var18 >> 3 << 18) + (var21 - var19 >> 3);
                    param7 = param7 + param8;
                    var15 = param7 >> 8;
                    var17--;
                    if (var17 > 0) {
                        statePc = 65;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    var17 = param6 - param5 & 7;
                    if (var17 <= 0) {
                        statePc = 89;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    dupTemp$53 = param1[(param2 & 16256) + (param2 >>> 25)];
                    param3 = dupTemp$53;
                    if (dupTemp$53 == 0) {
                        statePc = 88;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    param4++;
                    param2 = param2 + var16;
                    var17--;
                    if (var17 > 0) {
                        statePc = 86;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final static int b(int param0, int param1) {
        param1 = param1 * (param0 & 127) >> 7;
        if (param1 < 2) {
            param1 = 2;
        } else {
            if (param1 > 126) {
                param1 = 126;
            }
        }
        return (param0 & 65408) + param1;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7;
        int var8;
        int var9;
        L0: {
          var7 = 0;
          if (param1 == param0) {
            break L0;
          } else {
            var7 = (param4 - param3 << 16) / (param1 - param0);
            break L0;
          }
        }
        L1: {
          var8 = 0;
          if (param2 == param1) {
            break L1;
          } else {
            var8 = (param5 - param4 << 16) / (param2 - param1);
            break L1;
          }
        }
        L2: {
          var9 = 0;
          if (param2 == param0) {
            break L2;
          } else {
            var9 = (param3 - param5 << 16) / (param0 - param2);
            break L2;
          }
        }
        L3: {
          if (param0 > param1) {
            break L3;
          } else {
            if (param0 > param2) {
              break L3;
            } else {
              if (param0 < field_c) {
                L4: {
                  if (param1 <= field_c) {
                    break L4;
                  } else {
                    param1 = field_c;
                    break L4;
                  }
                }
                L5: {
                  if (param2 <= field_c) {
                    break L5;
                  } else {
                    param2 = field_c;
                    break L5;
                  }
                }
                if (param1 >= param2) {
                  L6: {
                    param3 = param3 << 16;
                    param4 = param3 << 16;
                    if (param0 >= 0) {
                      break L6;
                    } else {
                      param4 = param4 - var9 * param0;
                      param3 = param3 - var7 * param0;
                      param0 = 0;
                      break L6;
                    }
                  }
                  L7: {
                    param5 = param5 << 16;
                    if (param2 >= 0) {
                      break L7;
                    } else {
                      param5 = param5 - var8 * param2;
                      param2 = 0;
                      break L7;
                    }
                  }
                  L8: {
                    L9: {
                      if (param0 == param2) {
                        break L9;
                      } else {
                        if (var9 < var7) {
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (param0 != param2) {
                        break L10;
                      } else {
                        if (var8 <= var7) {
                          break L10;
                        } else {
                          break L8;
                        }
                      }
                    }
                    param1 = param1 - param2;
                    param2 = param2 - param0;
                    param0 = field_e[param0];
                    L11: while (true) {
                      param2--;
                      if (param2 < 0) {
                        param1--;
                        L12: while (true) {
                          if (param1 < 0) {
                            return;
                          } else {
                            jb.a(vj.field_j, param0, param6, 0, param3 >> 16, param5 >> 16);
                            param5 = param5 + var8;
                            param3 = param3 + var7;
                            param0 = param0 + vj.field_l;
                            param1--;
                            continue L12;
                          }
                        }
                      } else {
                        jb.a(vj.field_j, param0, param6, 0, param3 >> 16, param4 >> 16);
                        param4 = param4 + var9;
                        param3 = param3 + var7;
                        param0 = param0 + vj.field_l;
                        continue L11;
                      }
                    }
                  }
                  param1 = param1 - param2;
                  param2 = param2 - param0;
                  param0 = field_e[param0];
                  L13: while (true) {
                    param2--;
                    if (param2 < 0) {
                      param1--;
                      L14: while (true) {
                        if (param1 < 0) {
                          return;
                        } else {
                          jb.a(vj.field_j, param0, param6, 0, param5 >> 16, param3 >> 16);
                          param5 = param5 + var8;
                          param3 = param3 + var7;
                          param0 = param0 + vj.field_l;
                          param1--;
                          continue L14;
                        }
                      }
                    } else {
                      jb.a(vj.field_j, param0, param6, 0, param4 >> 16, param3 >> 16);
                      param4 = param4 + var9;
                      param3 = param3 + var7;
                      param0 = param0 + vj.field_l;
                      continue L13;
                    }
                  }
                } else {
                  L15: {
                    param3 = param3 << 16;
                    param5 = param3 << 16;
                    if (param0 >= 0) {
                      break L15;
                    } else {
                      param5 = param5 - var9 * param0;
                      param3 = param3 - var7 * param0;
                      param0 = 0;
                      break L15;
                    }
                  }
                  L16: {
                    param4 = param4 << 16;
                    if (param1 >= 0) {
                      break L16;
                    } else {
                      param4 = param4 - var8 * param1;
                      param1 = 0;
                      break L16;
                    }
                  }
                  L17: {
                    L18: {
                      if (param0 == param1) {
                        break L18;
                      } else {
                        if (var9 < var7) {
                          break L17;
                        } else {
                          break L18;
                        }
                      }
                    }
                    L19: {
                      if (param0 != param1) {
                        break L19;
                      } else {
                        if (var9 <= var8) {
                          break L19;
                        } else {
                          break L17;
                        }
                      }
                    }
                    param2 = param2 - param1;
                    param1 = param1 - param0;
                    param0 = field_e[param0];
                    L20: while (true) {
                      param1--;
                      if (param1 < 0) {
                        param2--;
                        L21: while (true) {
                          if (param2 < 0) {
                            return;
                          } else {
                            jb.a(vj.field_j, param0, param6, 0, param4 >> 16, param5 >> 16);
                            param5 = param5 + var9;
                            param4 = param4 + var8;
                            param0 = param0 + vj.field_l;
                            param2--;
                            continue L21;
                          }
                        }
                      } else {
                        jb.a(vj.field_j, param0, param6, 0, param3 >> 16, param5 >> 16);
                        param5 = param5 + var9;
                        param3 = param3 + var7;
                        param0 = param0 + vj.field_l;
                        continue L20;
                      }
                    }
                  }
                  param2 = param2 - param1;
                  param1 = param1 - param0;
                  param0 = field_e[param0];
                  L22: while (true) {
                    param1--;
                    if (param1 < 0) {
                      param2--;
                      L23: while (true) {
                        if (param2 < 0) {
                          return;
                        } else {
                          jb.a(vj.field_j, param0, param6, 0, param5 >> 16, param4 >> 16);
                          param5 = param5 + var9;
                          param4 = param4 + var8;
                          param0 = param0 + vj.field_l;
                          param2--;
                          continue L23;
                        }
                      }
                    } else {
                      jb.a(vj.field_j, param0, param6, 0, param5 >> 16, param3 >> 16);
                      param5 = param5 + var9;
                      param3 = param3 + var7;
                      param0 = param0 + vj.field_l;
                      continue L22;
                    }
                  }
                }
              } else {
                return;
              }
            }
          }
        }
        if (param1 > param2) {
          if (param2 < field_c) {
            L24: {
              if (param0 <= field_c) {
                break L24;
              } else {
                param0 = field_c;
                break L24;
              }
            }
            L25: {
              if (param1 <= field_c) {
                break L25;
              } else {
                param1 = field_c;
                break L25;
              }
            }
            if (param0 >= param1) {
              L26: {
                param5 = param5 << 16;
                param3 = param5 << 16;
                if (param2 >= 0) {
                  break L26;
                } else {
                  param3 = param3 - var8 * param2;
                  param5 = param5 - var9 * param2;
                  param2 = 0;
                  break L26;
                }
              }
              L27: {
                param4 = param4 << 16;
                if (param1 >= 0) {
                  break L27;
                } else {
                  param4 = param4 - var7 * param1;
                  param1 = 0;
                  break L27;
                }
              }
              if (var8 >= var9) {
                param0 = param0 - param1;
                param1 = param1 - param2;
                param2 = field_e[param2];
                L28: while (true) {
                  param1--;
                  if (param1 < 0) {
                    param0--;
                    L29: while (true) {
                      if (param0 < 0) {
                        return;
                      } else {
                        jb.a(vj.field_j, param2, param6, 0, param5 >> 16, param4 >> 16);
                        param4 = param4 + var7;
                        param5 = param5 + var9;
                        param2 = param2 + vj.field_l;
                        param0--;
                        continue L29;
                      }
                    }
                  } else {
                    jb.a(vj.field_j, param2, param6, 0, param5 >> 16, param3 >> 16);
                    param3 = param3 + var8;
                    param5 = param5 + var9;
                    param2 = param2 + vj.field_l;
                    continue L28;
                  }
                }
              } else {
                param0 = param0 - param1;
                param1 = param1 - param2;
                param2 = field_e[param2];
                L30: while (true) {
                  param1--;
                  if (param1 < 0) {
                    param0--;
                    L31: while (true) {
                      if (param0 < 0) {
                        return;
                      } else {
                        jb.a(vj.field_j, param2, param6, 0, param4 >> 16, param5 >> 16);
                        param4 = param4 + var7;
                        param5 = param5 + var9;
                        param2 = param2 + vj.field_l;
                        param0--;
                        continue L31;
                      }
                    }
                  } else {
                    jb.a(vj.field_j, param2, param6, 0, param3 >> 16, param5 >> 16);
                    param3 = param3 + var8;
                    param5 = param5 + var9;
                    param2 = param2 + vj.field_l;
                    continue L30;
                  }
                }
              }
            } else {
              L32: {
                param5 = param5 << 16;
                param4 = param5 << 16;
                if (param2 >= 0) {
                  break L32;
                } else {
                  param4 = param4 - var8 * param2;
                  param5 = param5 - var9 * param2;
                  param2 = 0;
                  break L32;
                }
              }
              L33: {
                param3 = param3 << 16;
                if (param0 >= 0) {
                  break L33;
                } else {
                  param3 = param3 - var7 * param0;
                  param0 = 0;
                  break L33;
                }
              }
              if (var8 >= var9) {
                param1 = param1 - param0;
                param0 = param0 - param2;
                param2 = field_e[param2];
                L34: while (true) {
                  param0--;
                  if (param0 < 0) {
                    param1--;
                    L35: while (true) {
                      if (param1 < 0) {
                        return;
                      } else {
                        jb.a(vj.field_j, param2, param6, 0, param3 >> 16, param4 >> 16);
                        param4 = param4 + var8;
                        param3 = param3 + var7;
                        param2 = param2 + vj.field_l;
                        param1--;
                        continue L35;
                      }
                    }
                  } else {
                    jb.a(vj.field_j, param2, param6, 0, param5 >> 16, param4 >> 16);
                    param4 = param4 + var8;
                    param5 = param5 + var9;
                    param2 = param2 + vj.field_l;
                    continue L34;
                  }
                }
              } else {
                param1 = param1 - param0;
                param0 = param0 - param2;
                param2 = field_e[param2];
                L36: while (true) {
                  param0--;
                  if (param0 < 0) {
                    param1--;
                    L37: while (true) {
                      if (param1 < 0) {
                        return;
                      } else {
                        jb.a(vj.field_j, param2, param6, 0, param4 >> 16, param3 >> 16);
                        param4 = param4 + var8;
                        param3 = param3 + var7;
                        param2 = param2 + vj.field_l;
                        param1--;
                        continue L37;
                      }
                    }
                  } else {
                    jb.a(vj.field_j, param2, param6, 0, param4 >> 16, param5 >> 16);
                    param4 = param4 + var8;
                    param5 = param5 + var9;
                    param2 = param2 + vj.field_l;
                    continue L36;
                  }
                }
              }
            }
          } else {
            return;
          }
        } else {
          if (param1 < field_c) {
            L38: {
              if (param2 <= field_c) {
                break L38;
              } else {
                param2 = field_c;
                break L38;
              }
            }
            L39: {
              if (param0 <= field_c) {
                break L39;
              } else {
                param0 = field_c;
                break L39;
              }
            }
            if (param2 >= param0) {
              L40: {
                param4 = param4 << 16;
                param5 = param4 << 16;
                if (param1 >= 0) {
                  break L40;
                } else {
                  param5 = param5 - var7 * param1;
                  param4 = param4 - var8 * param1;
                  param1 = 0;
                  break L40;
                }
              }
              L41: {
                param3 = param3 << 16;
                if (param0 >= 0) {
                  break L41;
                } else {
                  param3 = param3 - var9 * param0;
                  param0 = 0;
                  break L41;
                }
              }
              if (var7 >= var8) {
                param2 = param2 - param0;
                param0 = param0 - param1;
                param1 = field_e[param1];
                L42: while (true) {
                  param0--;
                  if (param0 < 0) {
                    param2--;
                    L43: while (true) {
                      if (param2 < 0) {
                        return;
                      } else {
                        jb.a(vj.field_j, param1, param6, 0, param4 >> 16, param3 >> 16);
                        param3 = param3 + var9;
                        param4 = param4 + var8;
                        param1 = param1 + vj.field_l;
                        param2--;
                        continue L43;
                      }
                    }
                  } else {
                    jb.a(vj.field_j, param1, param6, 0, param4 >> 16, param5 >> 16);
                    param5 = param5 + var7;
                    param4 = param4 + var8;
                    param1 = param1 + vj.field_l;
                    continue L42;
                  }
                }
              } else {
                param2 = param2 - param0;
                param0 = param0 - param1;
                param1 = field_e[param1];
                L44: while (true) {
                  param0--;
                  if (param0 < 0) {
                    param2--;
                    L45: while (true) {
                      if (param2 < 0) {
                        return;
                      } else {
                        jb.a(vj.field_j, param1, param6, 0, param3 >> 16, param4 >> 16);
                        param3 = param3 + var9;
                        param4 = param4 + var8;
                        param1 = param1 + vj.field_l;
                        param2--;
                        continue L45;
                      }
                    }
                  } else {
                    jb.a(vj.field_j, param1, param6, 0, param5 >> 16, param4 >> 16);
                    param5 = param5 + var7;
                    param4 = param4 + var8;
                    param1 = param1 + vj.field_l;
                    continue L44;
                  }
                }
              }
            } else {
              L46: {
                param4 = param4 << 16;
                param3 = param4 << 16;
                if (param1 >= 0) {
                  break L46;
                } else {
                  param3 = param3 - var7 * param1;
                  param4 = param4 - var8 * param1;
                  param1 = 0;
                  break L46;
                }
              }
              L47: {
                param5 = param5 << 16;
                if (param2 >= 0) {
                  break L47;
                } else {
                  param5 = param5 - var9 * param2;
                  param2 = 0;
                  break L47;
                }
              }
              L48: {
                L49: {
                  if (param1 == param2) {
                    break L49;
                  } else {
                    if (var7 < var8) {
                      break L48;
                    } else {
                      break L49;
                    }
                  }
                }
                L50: {
                  if (param1 != param2) {
                    break L50;
                  } else {
                    if (var7 <= var9) {
                      break L50;
                    } else {
                      break L48;
                    }
                  }
                }
                param0 = param0 - param2;
                param2 = param2 - param1;
                param1 = field_e[param1];
                L51: while (true) {
                  param2--;
                  if (param2 < 0) {
                    param0--;
                    L52: while (true) {
                      if (param0 < 0) {
                        return;
                      } else {
                        jb.a(vj.field_j, param1, param6, 0, param5 >> 16, param3 >> 16);
                        param3 = param3 + var7;
                        param5 = param5 + var9;
                        param1 = param1 + vj.field_l;
                        param0--;
                        continue L52;
                      }
                    }
                  } else {
                    jb.a(vj.field_j, param1, param6, 0, param4 >> 16, param3 >> 16);
                    param3 = param3 + var7;
                    param4 = param4 + var8;
                    param1 = param1 + vj.field_l;
                    continue L51;
                  }
                }
              }
              param0 = param0 - param2;
              param2 = param2 - param1;
              param1 = field_e[param1];
              L53: while (true) {
                param2--;
                if (param2 < 0) {
                  param0--;
                  L54: while (true) {
                    if (param0 < 0) {
                      return;
                    } else {
                      jb.a(vj.field_j, param1, param6, 0, param3 >> 16, param5 >> 16);
                      param3 = param3 + var7;
                      param5 = param5 + var9;
                      param1 = param1 + vj.field_l;
                      param0--;
                      continue L54;
                    }
                  }
                } else {
                  jb.a(vj.field_j, param1, param6, 0, param3 >> 16, param4 >> 16);
                  param3 = param3 + var7;
                  param4 = param4 + var8;
                  param1 = param1 + vj.field_l;
                  continue L53;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    final static void b(float param0) {
        jb.a(param0);
        jb.a(0, 512);
    }

    final static void b() {
        jb.a(vj.field_f, vj.field_h, vj.field_a, vj.field_b);
    }

    static {
        int var0 = 0;
        field_l = 1.0f;
        field_q = false;
        field_e = new int[1024];
        field_d = 0;
        field_f = false;
        field_a = new int[2048];
        field_h = true;
        field_j = new int[2048];
        field_n = false;
        field_p = new int[65536];
        field_k = new int[2048];
        field_o = new int[512];
        for (var0 = 1; var0 < 512; var0++) {
            field_o[var0] = 32768 / var0;
        }
        for (var0 = 1; var0 < 2048; var0++) {
            field_a[var0] = 65536 / var0;
        }
        for (var0 = 0; var0 < 2048; var0++) {
            field_j[var0] = (int)(65536.0 * Math.sin((double)var0 * 0.0030679615));
            field_k[var0] = (int)(65536.0 * Math.cos((double)var0 * 0.0030679615));
        }
    }
}
