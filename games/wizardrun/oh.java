/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh {
    static ca[] field_a;
    static kl field_b;

    public static void a(int param0) {
        field_a = null;
        if (param0 != 21100) {
            oh.a(-19);
        }
        field_b = null;
    }

    final static void a(int param0, o param1, int param2, int param3, int param4, byte param5, int param6, int param7) {
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        o var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var28 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        L0: {
          var19 = wizardrun.field_H;
          if (param2 < ed.field_c) {
            param3 = param3 - (-param2 + ed.field_c);
            param2 = ed.field_c;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (ed.field_i > param6) {
            param0 = param0 - (ed.field_i - param6);
            param6 = ed.field_i;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (ed.field_l < param3 + param2) {
            param3 = ed.field_l - param2;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (param0 + param6 > ed.field_b) {
            param0 = -param6 + ed.field_b;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if ((param3 ^ -1) >= -1) {
            break L4;
          } else {
            if (0 < param0) {
              L5: {
                if (param5 >= 11) {
                  break L5;
                } else {
                  field_b = null;
                  break L5;
                }
              }
              var21 = param1.e();
              var32 = ed.field_k;
              var10 = ed.field_h;
              var11 = ed.field_d;
              var30 = new int[4];
              ed.b(var30);
              param1.b();
              ed.b(var30[0], var30[1], var30[2], var30[3]);
              var13 = param2 - -(param6 * param1.field_z);
              var14 = param1.field_z + -param3;
              var31 = var21.field_B;
              var28 = var31;
              var25 = var28;
              var22 = var25;
              var15 = var22;
              var16 = param6;
              L6: while (true) {
                if (var16 >= param0 + param6) {
                  var21.e(-param1.field_u, -param1.field_v);
                  ed.a(var32, var10, var11);
                  ed.a(var30);
                  return;
                } else {
                  var17 = param2;
                  L7: while (true) {
                    if (var17 >= param2 - -param3) {
                      var13 = var13 + var14;
                      var16++;
                      continue L6;
                    } else {
                      var18 = var31[var13];
                      if (0 != var18) {
                        L8: {
                          L9: {
                            if (-1 <= (var17 ^ -1)) {
                              break L9;
                            } else {
                              if (var15[var13 - 1] == -1) {
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                          L10: {
                            if (-1 >= var16) {
                              break L10;
                            } else {
                              if (var15[-param1.field_z + var13] == 0) {
                                break L8;
                              } else {
                                break L10;
                              }
                            }
                          }
                          L11: {
                            if (var17 >= param1.field_z - 1) {
                              break L11;
                            } else {
                              if (-1 == (var15[var13 + 1] ^ -1)) {
                                break L8;
                              } else {
                                break L11;
                              }
                            }
                          }
                          if (var16 < param1.field_p + -1) {
                            if (var15[param1.field_z + var13] == 0) {
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
                        ed.a(var17, var16, param4, param7);
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

    final static void a(byte param0) {
        if (param0 > -104) {
            oh.a(-109);
        }
        ii.field_f.field_k = 0;
        ii.field_f.field_n = 0;
    }

    final static String a(String param0, String param1, kl param2, int param3, String param4) {
        if (!param2.b(17820)) {
            return param0;
        }
        int var5 = -16 % ((-55 - param3) / 42);
        return param1 + " - " + param2.a(0, param4) + "%";
    }

    static {
    }
}
