/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wa extends vh {
    static String field_q;
    static int field_s;
    static volatile int field_p;
    static String field_t;
    static bg[] field_r;

    public static void c(int param0) {
        field_t = null;
        field_q = null;
        field_r = null;
        if (param0 != 21834) {
            field_q = null;
        }
    }

    final static void a(ci param0, byte param1, String param2) {
        fa.field_d = param0;
        if (param1 < 19) {
            wa.c(-64);
        }
        jh.field_p = param2;
    }

    final static void a(ci param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        ci var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var28 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        L0: {
          var19 = Terraphoenix.field_V;
          if (l.field_b <= param1) {
            break L0;
          } else {
            param7 = param7 - (l.field_b + -param1);
            param1 = l.field_b;
            break L0;
          }
        }
        L1: {
          if (l.field_d > param5) {
            param2 = param2 - (l.field_d + -param5);
            param5 = l.field_d;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (param1 + param7 <= l.field_f) {
            break L2;
          } else {
            param7 = -param1 + l.field_f;
            break L2;
          }
        }
        L3: {
          if (param5 - -param2 <= l.field_c) {
            break L3;
          } else {
            param2 = -param5 + l.field_c;
            break L3;
          }
        }
        L4: {
          if ((param7 ^ -1) >= -1) {
            break L4;
          } else {
            if ((param2 ^ -1) >= -1) {
              break L4;
            } else {
              var21 = param0.d();
              var32 = l.field_i;
              var10 = l.field_k;
              var11 = l.field_j;
              var30 = new int[4];
              l.b(var30);
              param0.a();
              l.i(var30[0], var30[1], var30[2], var30[3]);
              var13 = param1 + param0.field_r * param5;
              var14 = -param7 + param0.field_r;
              var31 = var21.field_z;
              var28 = var31;
              var25 = var28;
              var22 = var25;
              var15 = var22;
              var16 = param5;
              L5: while (true) {
                if (param5 + param2 <= var16) {
                  var16 = 60 / ((param3 - 1) / 51);
                  var21.b(-param0.field_p, -param0.field_v);
                  l.a(var32, var10, var11);
                  l.a(var30);
                  return;
                } else {
                  var17 = param1;
                  L6: while (true) {
                    if (param1 - -param7 <= var17) {
                      var13 = var13 + var14;
                      var16++;
                      continue L5;
                    } else {
                      var18 = var31[var13];
                      if (0 != var18) {
                        L7: {
                          L8: {
                            if ((var17 ^ -1) >= -1) {
                              break L8;
                            } else {
                              if (0 == var15[-1 + var13]) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L9: {
                            if (var16 <= 0) {
                              break L9;
                            } else {
                              if (-1 == (var15[var13 - param0.field_r] ^ -1)) {
                                break L7;
                              } else {
                                break L9;
                              }
                            }
                          }
                          L10: {
                            if (var17 >= -1 + param0.field_r) {
                              break L10;
                            } else {
                              if (var15[1 + var13] == 0) {
                                break L7;
                              } else {
                                break L10;
                              }
                            }
                          }
                          if (param0.field_t - 1 > var16) {
                            if (0 == var15[var13 - -param0.field_r]) {
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
                        l.e(var17, var16, param6, param4);
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
            }
          }
        }
    }

    final static String a(byte param0, String param1) {
        int var4 = 0;
        int var5 = Terraphoenix.field_V;
        int var2 = param1.length();
        char[] var3 = new char[var2];
        if (param0 != -117) {
            Object var6 = null;
            wa.a((ci) null, (byte) 117, (String) null);
        }
        for (var4 = 0; var4 < var2; var4++) {
            var3[-1 + (var2 + -var4)] = param1.charAt(var4);
        }
        return new String(var3);
    }

    wa() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "OM-4 FG";
        field_s = 65280;
        field_p = 0;
    }
}
