/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb extends jb {
    static String field_i;
    static tj field_l;
    static id field_h;
    static boolean field_g;
    static ko field_k;
    int field_j;
    int field_f;

    final static void a(int param0, int param1, int param2, int param3, dl param4, int param5, int param6, int param7) {
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        dl var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var28 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        L0: {
          var19 = CrazyCrystals.field_B;
          if (kh.field_c <= param7) {
            break L0;
          } else {
            param3 = param3 - (-param7 + kh.field_c);
            param7 = kh.field_c;
            break L0;
          }
        }
        L1: {
          if (param3 + param7 > kh.field_g) {
            param3 = -param7 + kh.field_g;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (kh.field_b > param2) {
            param1 = param1 - (-param2 + kh.field_b);
            param2 = kh.field_b;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (kh.field_j >= param2 + param1) {
            break L3;
          } else {
            param1 = -param2 + kh.field_j;
            break L3;
          }
        }
        L4: {
          if (param3 >= -1) {
            break L4;
          } else {
            if (-1 >= param1) {
              break L4;
            } else {
              var21 = param4.d();
              if (param5 <= -11) {
                var32 = kh.field_i;
                var10 = kh.field_l;
                var11 = kh.field_d;
                var30 = new int[4];
                kh.b(var30);
                param4.a();
                kh.a(var30[0], var30[1], var30[2], var30[3]);
                var13 = param4.field_l * param2 + param7;
                var14 = -param3 + param4.field_l;
                var31 = var21.field_w;
                var28 = var31;
                var25 = var28;
                var22 = var25;
                var15 = var22;
                var16 = param2;
                L5: while (true) {
                  if (var16 >= param2 + param1) {
                    var21.a(-param4.field_v, -param4.field_t);
                    kh.a(var32, var10, var11);
                    kh.a(var30);
                    return;
                  } else {
                    var17 = param7;
                    L6: while (true) {
                      if (param3 + param7 <= var17) {
                        var13 = var13 + var14;
                        var16++;
                        continue L5;
                      } else {
                        var18 = var31[var13];
                        if (-1 != (var18 ^ -1)) {
                          L7: {
                            L8: {
                              if (var17 <= 0) {
                                break L8;
                              } else {
                                if (var15[var13 + -1] == 0) {
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            L9: {
                              if ((var16 ^ -1) >= -1) {
                                break L9;
                              } else {
                                if (0 == var15[-param4.field_l + var13]) {
                                  break L7;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            L10: {
                              if (var17 >= param4.field_l - 1) {
                                break L10;
                              } else {
                                if (-1 == (var15[1 + var13] ^ -1)) {
                                  break L7;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            if (-1 + param4.field_u > var16) {
                              if (var15[var13 - -param4.field_l] == 0) {
                                break L7;
                              } else {
                                var13++;
                                var17++;
                                continue L6;
                              }
                            } else {
                              var13++;
                              var17++;
                              continue L6;
                            }
                          }
                          kh.b(var17, var16, param0, param6);
                          var13++;
                          var17++;
                          continue L6;
                        } else {
                          var13++;
                          var17++;
                          continue L6;
                        }
                      }
                    }
                  }
                }
              } else {
                return;
              }
            }
          }
        }
    }

    public static void b(boolean param0) {
        field_h = null;
        field_l = null;
        field_k = null;
        field_i = null;
        if (!param0) {
            field_i = null;
        }
    }

    private hb() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "OK";
    }
}
