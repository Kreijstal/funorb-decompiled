/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh extends sd {
    private String field_h;
    static int field_g;
    static int[] field_d;
    private String field_f;
    static int field_e;

    public static void b(byte param0) {
        if (param0 < 7) {
            field_e = 84;
            field_d = null;
            return;
        }
        field_d = null;
    }

    final kb a(boolean param0) {
        if (!param0) {
            return null;
        }
        return sb.field_d;
    }

    final void a(int param0, th param1) {
        param1.a(29336, ((fh) this).field_f);
        param1.b(param0, ((fh) this).field_h);
    }

    final static void a(int param0, int param1, int param2, hj param3, int param4, int param5, int param6, int param7) {
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        hj var21 = null;
        int[] var22 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        hj var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        hj var32 = null;
        int[] var33 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        int[] var40 = null;
        var19 = HoldTheLine.field_D;
        if (param7 == -24983) {
          L0: {
            if (tc.field_d <= param5) {
              break L0;
            } else {
              param2 = param2 - (-param5 + tc.field_d);
              param5 = tc.field_d;
              break L0;
            }
          }
          L1: {
            if (param4 < tc.field_a) {
              param1 = param1 - (tc.field_a - param4);
              param4 = tc.field_a;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (param5 + param2 > tc.field_e) {
              param2 = -param5 + tc.field_e;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (param1 + param4 <= tc.field_i) {
              break L3;
            } else {
              param1 = -param4 + tc.field_i;
              break L3;
            }
          }
          if (param2 > 0) {
            if ((param1 ^ -1) >= -1) {
              return;
            } else {
              var32 = param3.e();
              var40 = tc.field_b;
              var10 = tc.field_j;
              var11 = tc.field_c;
              var38 = new int[4];
              tc.b(var38);
              param3.f();
              tc.e(var38[0], var38[1], var38[2], var38[3]);
              var13 = param3.field_s * param4 + param5;
              var14 = -param2 + param3.field_s;
              var39 = var32.field_z;
              var33 = var39;
              var25 = var33;
              var22 = var25;
              var15 = var22;
              var16 = param4;
              L4: while (true) {
                if (param4 + param1 <= var16) {
                  var32.a(-param3.field_u, -param3.field_x);
                  tc.a(var40, var10, var11);
                  tc.a(var38);
                  return;
                } else {
                  var17 = param5;
                  L5: while (true) {
                    if (param2 + param5 <= var17) {
                      var13 = var13 + var14;
                      var16++;
                      continue L4;
                    } else {
                      var18 = var39[var13];
                      if (var18 != -1) {
                        L6: {
                          L7: {
                            if (-1 >= var17) {
                              break L7;
                            } else {
                              if (var15[var13 + -1] == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            if (0 >= var16) {
                              break L8;
                            } else {
                              if (-1 == var15[-param3.field_s + var13]) {
                                break L6;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L9: {
                            if (var17 >= -1 + param3.field_s) {
                              break L9;
                            } else {
                              if (-1 == var15[1 + var13]) {
                                break L6;
                              } else {
                                break L9;
                              }
                            }
                          }
                          if (-1 + param3.field_y > var16) {
                            if (var15[param3.field_s + var13] == 0) {
                              break L6;
                            } else {
                              var13++;
                              var17++;
                              continue L5;
                            }
                          } else {
                            var13++;
                            var17++;
                            continue L5;
                          }
                        }
                        tc.d(var17, var16, param0, param6);
                        var13++;
                        var17++;
                        continue L5;
                      } else {
                        var13++;
                        var17++;
                        continue L5;
                      }
                    }
                  }
                }
              }
            }
          } else {
            return;
          }
        } else {
          L10: {
            field_d = null;
            if (tc.field_d <= param5) {
              break L10;
            } else {
              param2 = param2 - (-param5 + tc.field_d);
              param5 = tc.field_d;
              break L10;
            }
          }
          L11: {
            if (param4 < tc.field_a) {
              param1 = param1 - (tc.field_a - param4);
              param4 = tc.field_a;
              break L11;
            } else {
              break L11;
            }
          }
          L12: {
            if (param5 + param2 > tc.field_e) {
              param2 = -param5 + tc.field_e;
              break L12;
            } else {
              break L12;
            }
          }
          L13: {
            if (param1 + param4 <= tc.field_i) {
              break L13;
            } else {
              param1 = -param4 + tc.field_i;
              break L13;
            }
          }
          if (param2 > 0) {
            if ((param1 ^ -1) < -1) {
              var28 = param3.e();
              var21 = var28;
              var37 = tc.field_b;
              var30 = var37;
              var26 = var30;
              var10 = tc.field_j;
              var11 = tc.field_c;
              var35 = new int[4];
              var27 = var35;
              var24 = var27;
              tc.b(var35);
              param3.f();
              tc.e(var35[0], var35[1], var35[2], var35[3]);
              var13 = param3.field_s * param4 + param5;
              var14 = -param2 + param3.field_s;
              var36 = var28.field_z;
              var29 = var36;
              var25 = var29;
              var22 = var25;
              var15 = var22;
              var16 = param4;
              L14: while (true) {
                if (param4 + param1 <= var16) {
                  var28.a(-param3.field_u, -param3.field_x);
                  tc.a(var37, var10, var11);
                  tc.a(var35);
                  return;
                } else {
                  var17 = param5;
                  L15: while (true) {
                    if (param2 + param5 <= var17) {
                      var13 = var13 + var14;
                      var16++;
                      continue L14;
                    } else {
                      var18 = var36[var13];
                      if (var18 != -1) {
                        L16: {
                          L17: {
                            if (-1 >= var17) {
                              break L17;
                            } else {
                              if (var15[var13 + -1] == 0) {
                                break L16;
                              } else {
                                break L17;
                              }
                            }
                          }
                          L18: {
                            if (0 >= var16) {
                              break L18;
                            } else {
                              if (-1 == var15[-param3.field_s + var13]) {
                                break L16;
                              } else {
                                break L18;
                              }
                            }
                          }
                          L19: {
                            if (var17 >= -1 + param3.field_s) {
                              break L19;
                            } else {
                              if (-1 == var15[1 + var13]) {
                                break L16;
                              } else {
                                break L19;
                              }
                            }
                          }
                          if (-1 + param3.field_y > var16) {
                            if (var15[param3.field_s + var13] == 0) {
                              break L16;
                            } else {
                              var13++;
                              var17++;
                              continue L15;
                            }
                          } else {
                            var13++;
                            var17++;
                            continue L15;
                          }
                        }
                        tc.d(var17, var16, param0, param6);
                        var13++;
                        var17++;
                        continue L15;
                      } else {
                        var13++;
                        var17++;
                        continue L15;
                      }
                    }
                  }
                }
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    fh(String param0, String param1) {
        ((fh) this).field_h = param1;
        ((fh) this).field_f = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = fc.a(-29, 25, 2);
    }
}
