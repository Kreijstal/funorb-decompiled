/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hh {
    static int field_a;
    static vi field_d;
    static hl[] field_b;
    static int field_c;

    abstract s b(byte param0);

    abstract void a(byte param0, rb param1);

    final static oe a(int param0, int param1, String param2) {
        if (param0 <= 80) {
            field_a = 32;
        }
        fl var3 = new fl();
        ((oe) (Object) var3).field_d = param1;
        ((oe) (Object) var3).field_c = param2;
        return (oe) (Object) var3;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, hl param6, int param7) {
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        hl var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var28 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        L0: {
          var19 = StarCannon.field_A;
          if (ki.field_l > param0) {
            param7 = param7 - (ki.field_l - param0);
            param0 = ki.field_l;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (ki.field_e > param1) {
            param3 = param3 - (ki.field_e + -param1);
            param1 = ki.field_e;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (param7 + param0 > ki.field_g) {
            param7 = ki.field_g - param0;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (ki.field_i >= param3 + param1) {
            break L3;
          } else {
            param3 = -param1 + ki.field_i;
            break L3;
          }
        }
        L4: {
          if ((param7 ^ -1) >= -1) {
            break L4;
          } else {
            if (param3 > 0) {
              var21 = param6.c();
              var32 = ki.field_a;
              var10 = ki.field_j;
              var11 = ki.field_f;
              var30 = new int[4];
              ki.a(var30);
              param6.e();
              ki.c(var30[0], var30[1], var30[2], var30[3]);
              var13 = param6.field_u * param1 + param0;
              var14 = param6.field_u - param7;
              var31 = var21.field_B;
              var28 = var31;
              var25 = var28;
              var22 = var25;
              var15 = var22;
              var16 = param1;
              L5: while (true) {
                if (var16 >= param1 + param3) {
                  L6: {
                    var21.e(-param6.field_w, -param6.field_y);
                    ki.a(var32, var10, var11);
                    ki.b(var30);
                    if (!param4) {
                      break L6;
                    } else {
                      field_a = 19;
                      break L6;
                    }
                  }
                  return;
                } else {
                  var17 = param0;
                  L7: while (true) {
                    if (var17 >= param7 + param0) {
                      var13 = var13 + var14;
                      var16++;
                      continue L5;
                    } else {
                      var18 = var31[var13];
                      if (0 != var18) {
                        L8: {
                          L9: {
                            if (0 >= var17) {
                              break L9;
                            } else {
                              if (0 == var15[var13 - 1]) {
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                          L10: {
                            if (var16 >= -1) {
                              break L10;
                            } else {
                              if (-1 == var15[var13 - param6.field_u]) {
                                break L8;
                              } else {
                                break L10;
                              }
                            }
                          }
                          L11: {
                            if (var17 >= param6.field_u + -1) {
                              break L11;
                            } else {
                              if (var15[1 + var13] == 0) {
                                break L8;
                              } else {
                                break L11;
                              }
                            }
                          }
                          if (var16 < param6.field_v + -1) {
                            if (var15[var13 - -param6.field_u] == 0) {
                              break L8;
                            } else {
                              var13++;
                              var17++;
                              continue L7;
                            }
                          } else {
                            var13++;
                            var17++;
                            continue L7;
                          }
                        }
                        ki.e(var17, var16, param2, param5);
                        var13++;
                        var17++;
                        continue L7;
                      } else {
                        var13++;
                        var17++;
                        continue L7;
                      }
                    }
                  }
                }
              }
            } else {
              break L4;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        if (param0 != -22) {
            Object var2 = null;
            hh.a(-84, 78, -115, 23, true, 78, (hl) null, -53);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = -1;
    }
}
