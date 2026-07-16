/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fr extends ma {
    static nl field_o;
    static String field_m;
    static int field_n;
    long field_p;
    byte[] field_l;
    static int field_s;
    static String field_q;
    int field_r;
    static int field_u;
    static int field_t;

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (-1 != (param1 ^ -1)) {
          if (0 < param1) {
            L0: {
              var2 = 1;
              if (-65536 <= (param1 ^ -1)) {
                break L0;
              } else {
                param1 = param1 >> 16;
                var2 += 16;
                break L0;
              }
            }
            L1: {
              if (param1 <= 255) {
                break L1;
              } else {
                var2 += 8;
                param1 = param1 >> 8;
                break L1;
              }
            }
            L2: {
              if ((param1 ^ -1) >= -16) {
                break L2;
              } else {
                param1 = param1 >> 4;
                var2 += 4;
                break L2;
              }
            }
            L3: {
              if (param1 <= 3) {
                break L3;
              } else {
                var2 += 2;
                param1 = param1 >> 2;
                break L3;
              }
            }
            L4: {
              if (param1 > 1) {
                var2++;
                param1 = param1 >> 1;
                break L4;
              } else {
                break L4;
              }
            }
            return var2;
          } else {
            L5: {
              var2 = 2;
              if (-65536 <= param1) {
                break L5;
              } else {
                var2 += 16;
                param1 = param1 >> 16;
                break L5;
              }
            }
            if (param0 == 16) {
              L6: {
                if (-256 <= param1) {
                  break L6;
                } else {
                  param1 = param1 >> 8;
                  var2 += 8;
                  break L6;
                }
              }
              L7: {
                if ((param1 ^ -1) <= 15) {
                  break L7;
                } else {
                  param1 = param1 >> 4;
                  var2 += 4;
                  break L7;
                }
              }
              L8: {
                if (param1 >= -4) {
                  break L8;
                } else {
                  var2 += 2;
                  param1 = param1 >> 2;
                  break L8;
                }
              }
              L9: {
                if ((param1 ^ -1) <= 1) {
                  break L9;
                } else {
                  var2++;
                  param1 = param1 >> 1;
                  break L9;
                }
              }
              return var2;
            } else {
              L10: {
                fr.c((byte) -52);
                if (-256 <= param1) {
                  break L10;
                } else {
                  param1 = param1 >> 8;
                  var2 += 8;
                  break L10;
                }
              }
              L11: {
                if ((param1 ^ -1) <= 15) {
                  break L11;
                } else {
                  param1 = param1 >> 4;
                  var2 += 4;
                  break L11;
                }
              }
              L12: {
                if (param1 >= -4) {
                  break L12;
                } else {
                  var2 += 2;
                  param1 = param1 >> 2;
                  break L12;
                }
              }
              L13: {
                if ((param1 ^ -1) <= 1) {
                  break L13;
                } else {
                  var2++;
                  param1 = param1 >> 1;
                  break L13;
                }
              }
              return var2;
            }
          }
        } else {
          return 0;
        }
    }

    final static void a(int param0, kg param1, int param2) {
        oq var3 = null;
        int var4 = 0;
        int var5 = 0;
        oq var6 = null;
        var6 = ej.field_j;
        var3 = var6;
        var6.b(false, param2);
        var6.field_v = var6.field_v + 1;
        var4 = var6.field_v;
        var6.a(1, false);
        if (null != param1.field_p) {
          var6.a(param1.field_p.length, false);
          var6.a(param1.field_p, (byte) 0, 0, param1.field_p.length);
          var5 = 48 / ((param0 - 52) / 40);
          int discarded$4 = var6.d(-1, var4);
          var6.field_v = var6.field_v - 4;
          param1.field_o = var6.b(true);
          var6.b(-var4 + var6.field_v, true);
          return;
        } else {
          var6.a(0, false);
          var5 = 48 / ((param0 - 52) / 40);
          int discarded$5 = var6.d(-1, var4);
          var6.field_v = var6.field_v - 4;
          param1.field_o = var6.b(true);
          var6.b(-var4 + var6.field_v, true);
          return;
        }
    }

    final static void a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var2 = (-640 + field_s) / 2;
        if (param0 > -21) {
          field_s = -62;
          var3 = ir.field_h * ir.field_h;
          var4 = var3 - param1 * param1;
          so.field_k.b(90, 2147483647, var2 + -(199 * var4 / var3), 199, -90 + (-4 + (-120 + qh.field_f)));
          uq.field_f.b(0, 2147483647, 202 + (var2 - -(438 * var4 / var3)), 438, -120 + qh.field_f - 4);
          return;
        } else {
          var3 = ir.field_h * ir.field_h;
          var4 = var3 - param1 * param1;
          so.field_k.b(90, 2147483647, var2 + -(199 * var4 / var3), 199, -90 + (-4 + (-120 + qh.field_f)));
          uq.field_f.b(0, 2147483647, 202 + (var2 - -(438 * var4 / var3)), 438, -120 + qh.field_f - 4);
          return;
        }
    }

    public static void c(byte param0) {
        field_m = null;
        field_q = null;
        field_o = null;
        if (param0 < 39) {
            int discarded$0 = fr.a(-16, 120);
        }
    }

    fr(long param0, int param1, byte[] param2) {
        ((fr) this).field_p = param0;
        ((fr) this).field_l = param2;
        ((fr) this).field_r = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Please check if address is correct";
        field_o = new nl();
        field_q = "Who can join";
    }
}
