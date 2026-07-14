/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug {
    private oj field_e;
    static String[] field_c;
    static String field_b;
    static pb field_f;
    private gg field_a;
    static String field_d;

    final gg b(int param0, gg param1) {
        gg var3 = null;
        if (param1 != null) {
            var3 = param1;
        } else {
            var3 = ((ug) this).field_e.field_d.field_g;
        }
        if (param0 != 4993) {
            gg discarded$9 = ((ug) this).b((byte) -10);
            if (!(((ug) this).field_e.field_d != var3)) {
                ((ug) this).field_a = null;
                return null;
            }
            ((ug) this).field_a = var3.field_g;
            return var3;
        }
        if (!(((ug) this).field_e.field_d != var3)) {
            ((ug) this).field_a = null;
            return null;
        }
        ((ug) this).field_a = var3.field_g;
        return var3;
    }

    final gg a(int param0) {
        int var2 = 0;
        gg var3 = null;
        var2 = 26 % ((4 - param0) / 50);
        var3 = ((ug) this).field_a;
        if (var3 == ((ug) this).field_e.field_d) {
          ((ug) this).field_a = null;
          return null;
        } else {
          ((ug) this).field_a = var3.field_c;
          return var3;
        }
    }

    final gg a(boolean param0) {
        gg var2 = null;
        if (!param0) {
            ((ug) this).field_a = null;
            var2 = ((ug) this).field_a;
            if (!(var2 != ((ug) this).field_e.field_d)) {
                ((ug) this).field_a = null;
                return null;
            }
            ((ug) this).field_a = var2.field_g;
            return var2;
        }
        var2 = ((ug) this).field_a;
        if (!(var2 != ((ug) this).field_e.field_d)) {
            ((ug) this).field_a = null;
            return null;
        }
        ((ug) this).field_a = var2.field_g;
        return var2;
    }

    final gg a(int param0, gg param1) {
        gg var3 = null;
        L0: {
          if (param1 == null) {
            var3 = ((ug) this).field_e.field_d.field_c;
            break L0;
          } else {
            var3 = param1;
            break L0;
          }
        }
        if (param0 == -25888) {
          if (var3 == ((ug) this).field_e.field_d) {
            ((ug) this).field_a = null;
            return null;
          } else {
            ((ug) this).field_a = var3.field_c;
            return var3;
          }
        } else {
          field_d = null;
          if (var3 == ((ug) this).field_e.field_d) {
            ((ug) this).field_a = null;
            return null;
          } else {
            ((ug) this).field_a = var3.field_c;
            return var3;
          }
        }
    }

    final static int b(int param0) {
        if (param0 != 1) {
            field_f = null;
            return 1;
        }
        return 1;
    }

    final gg a(byte param0) {
        gg var2 = null;
        var2 = ((ug) this).field_e.field_d.field_c;
        if (var2 == ((ug) this).field_e.field_d) {
          ((ug) this).field_a = null;
          return null;
        } else {
          if (param0 >= -25) {
            field_c = null;
            ((ug) this).field_a = var2.field_c;
            return var2;
          } else {
            ((ug) this).field_a = var2.field_c;
            return var2;
          }
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        var2 = 0;
        if (param0 >= 0) {
          if (param0 >= 65536) {
            L0: {
              param0 = param0 >>> 16;
              var2 += 16;
              if (256 > param0) {
                break L0;
              } else {
                param0 = param0 >>> 8;
                var2 += 8;
                break L0;
              }
            }
            L1: {
              if (-17 >= (param0 ^ -1)) {
                var2 += 4;
                param0 = param0 >>> 4;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 <= param0) {
                var2 += 2;
                param0 = param0 >>> 2;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (-2 < (param0 ^ -1)) {
                break L3;
              } else {
                param0 = param0 >>> 1;
                var2++;
                break L3;
              }
            }
            return param0 + var2;
          } else {
            L4: {
              if (256 > param0) {
                break L4;
              } else {
                param0 = param0 >>> 8;
                var2 += 8;
                break L4;
              }
            }
            L5: {
              if (-17 >= (param0 ^ -1)) {
                var2 += 4;
                param0 = param0 >>> 4;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (param1 <= param0) {
                var2 += 2;
                param0 = param0 >>> 2;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (-2 < (param0 ^ -1)) {
                break L7;
              } else {
                param0 = param0 >>> 1;
                var2++;
                break L7;
              }
            }
            return param0 + var2;
          }
        } else {
          L8: {
            param0 = param0 >>> 16;
            var2 += 16;
            if (256 > param0) {
              break L8;
            } else {
              param0 = param0 >>> 8;
              var2 += 8;
              break L8;
            }
          }
          L9: {
            if (-17 >= (param0 ^ -1)) {
              var2 += 4;
              param0 = param0 >>> 4;
              break L9;
            } else {
              break L9;
            }
          }
          L10: {
            if (param1 <= param0) {
              var2 += 2;
              param0 = param0 >>> 2;
              break L10;
            } else {
              break L10;
            }
          }
          L11: {
            if (-2 < (param0 ^ -1)) {
              break L11;
            } else {
              param0 = param0 >>> 1;
              var2++;
              break L11;
            }
          }
          return param0 + var2;
        }
    }

    public static void c(int param0) {
        field_b = null;
        field_f = null;
        if (param0 <= 23) {
          field_c = null;
          field_c = null;
          field_d = null;
          return;
        } else {
          field_c = null;
          field_d = null;
          return;
        }
    }

    ug(oj param0) {
        ((ug) this).field_e = param0;
    }

    final gg b(byte param0) {
        gg var2 = null;
        if (param0 > 114) {
          var2 = ((ug) this).field_e.field_d.field_g;
          if (((ug) this).field_e.field_d == var2) {
            ((ug) this).field_a = null;
            return null;
          } else {
            ((ug) this).field_a = var2.field_g;
            return var2;
          }
        } else {
          field_f = null;
          var2 = ((ug) this).field_e.field_d.field_g;
          if (((ug) this).field_e.field_d == var2) {
            ((ug) this).field_a = null;
            return null;
          } else {
            ((ug) this).field_a = var2.field_g;
            return var2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{"By rating", "By win percentage"};
    }
}
