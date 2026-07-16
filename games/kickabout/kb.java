/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb extends tm {
    static boolean field_C;
    static ut[] field_E;
    static String field_D;
    static eg[] field_B;

    public static void g(int param0) {
        field_D = null;
        field_B = null;
        field_E = null;
        if (param0 != 1) {
            field_B = null;
        }
    }

    kb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final li a(byte param0, li[] param1) {
        if (param0 != 84) {
            return null;
        }
        return new li((Object) (Object) wi.a(-31182, (int[]) param1[0].field_d));
    }

    final static int a(int param0, boolean param1) {
        int var2 = 0;
        if (!param1) {
          if (-1 == (param0 ^ -1)) {
            return 0;
          } else {
            if ((param0 ^ -1) < -1) {
              L0: {
                var2 = 1;
                if (65535 < param0) {
                  var2 += 16;
                  param0 = param0 >> 16;
                  break L0;
                } else {
                  break L0;
                }
              }
              L1: {
                if (-256 > (param0 ^ -1)) {
                  var2 += 8;
                  param0 = param0 >> 8;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (param0 <= 15) {
                  break L2;
                } else {
                  var2 += 4;
                  param0 = param0 >> 4;
                  break L2;
                }
              }
              L3: {
                if (-4 > (param0 ^ -1)) {
                  var2 += 2;
                  param0 = param0 >> 2;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (1 < param0) {
                  var2++;
                  param0 = param0 >> 1;
                  break L4;
                } else {
                  break L4;
                }
              }
              return var2;
            } else {
              L5: {
                var2 = 2;
                if (65535 >= (param0 ^ -1)) {
                  break L5;
                } else {
                  param0 = param0 >> 16;
                  var2 += 16;
                  break L5;
                }
              }
              L6: {
                if (255 >= (param0 ^ -1)) {
                  break L6;
                } else {
                  var2 += 8;
                  param0 = param0 >> 8;
                  break L6;
                }
              }
              L7: {
                if (param0 < -16) {
                  param0 = param0 >> 4;
                  var2 += 4;
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (param0 < -4) {
                  var2 += 2;
                  param0 = param0 >> 2;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if ((param0 ^ -1) <= 1) {
                  break L9;
                } else {
                  param0 = param0 >> 1;
                  var2++;
                  break L9;
                }
              }
              return var2;
            }
          }
        } else {
          kb.h(-15);
          if (-1 == (param0 ^ -1)) {
            return 0;
          } else {
            if ((param0 ^ -1) < -1) {
              L10: {
                var2 = 1;
                if (65535 < param0) {
                  var2 += 16;
                  param0 = param0 >> 16;
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (-256 > (param0 ^ -1)) {
                  var2 += 8;
                  param0 = param0 >> 8;
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (param0 <= 15) {
                  break L12;
                } else {
                  var2 += 4;
                  param0 = param0 >> 4;
                  break L12;
                }
              }
              L13: {
                if (-4 > (param0 ^ -1)) {
                  var2 += 2;
                  param0 = param0 >> 2;
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                if (1 < param0) {
                  var2++;
                  param0 = param0 >> 1;
                  break L14;
                } else {
                  break L14;
                }
              }
              return var2;
            } else {
              L15: {
                var2 = 2;
                if (65535 >= (param0 ^ -1)) {
                  break L15;
                } else {
                  param0 = param0 >> 16;
                  var2 += 16;
                  break L15;
                }
              }
              L16: {
                if (255 >= (param0 ^ -1)) {
                  break L16;
                } else {
                  var2 += 8;
                  param0 = param0 >> 8;
                  break L16;
                }
              }
              L17: {
                if (param0 < -16) {
                  param0 = param0 >> 4;
                  var2 += 4;
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if (param0 < -4) {
                  var2 += 2;
                  param0 = param0 >> 2;
                  break L18;
                } else {
                  break L18;
                }
              }
              L19: {
                if ((param0 ^ -1) <= 1) {
                  break L19;
                } else {
                  param0 = param0 >> 1;
                  var2++;
                  break L19;
                }
              }
              return var2;
            }
          }
        }
    }

    final static void h(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        ut[][] var4 = null;
        ut var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Kickabout.field_G;
        if (ae.field_C == null) {
          return;
        } else {
          var1 = cq.field_g;
          if (param0 >= -49) {
            return;
          } else {
            var2 = 0;
            L0: while (true) {
              if (2 <= var2) {
                return;
              } else {
                var3 = 102 * var2 + 20;
                on.a(var1, var3, 160, 92, 12, 65793, 128);
                un.field_d.d(ao.field_f[var2].toLowerCase(), 80 + var1, var3 - -20, 16777215, -1);
                var4 = ae.field_C[var2];
                var4[0][1].b(14 + var1, 49 + var3, 20, 20);
                var4[1][1].b(var1 + 14 - -38, var3 + 49, 20, 20);
                var4[2][1].b(19 + (14 + var1), 1 + (var3 + 49 + -20), 20, 20);
                var4[3][1].b(20 + (var1 - -13), 49 + var3, 20, 20);
                pb.field_C.d(tj.field_g, 14 + (var1 - -20) - -10, 20 + var3 + 65, 16777215, -1);
                if ((ks.field_e ^ -1) < -2) {
                  pb.field_C.d(nr.field_k, 115 + var1, 20 + (var3 + 49 + 16), 16777215, -1);
                  var5 = kd.field_y[var2][1];
                  var6 = 180 * var5.field_o >> 1893558664;
                  var7 = 180 * var5.field_v >> -805391320;
                  var5.b(-(var6 >> 2054888321) + (160 + cq.field_g - 46), var3 + 50, var6, var7);
                  var2++;
                  var2++;
                  continue L0;
                } else {
                  var2++;
                  var2++;
                  continue L0;
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "Please select an option in the '<%0>' row.";
        field_B = new eg[5];
    }
}
