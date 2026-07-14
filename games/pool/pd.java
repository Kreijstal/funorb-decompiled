/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd implements fp {
    private int field_h;
    static int[] field_a;
    static int[] field_f;
    static char[] field_d;
    static boolean field_g;
    static long field_i;
    private int field_c;
    private lr field_b;
    static String field_e;

    final static void a(int param0) {
        int var1 = 0;
        if (nk.field_h <= 32) {
          ap.a(0, param0 + 3815994);
          if (param0 == 0) {
            return;
          } else {
            pd.a(false);
            return;
          }
        } else {
          L0: {
            var1 = nk.field_h % 32;
            if (0 == var1) {
              var1 = 32;
              break L0;
            } else {
              break L0;
            }
          }
          ap.a(nk.field_h + -var1, 3815994);
          if (param0 == 0) {
            return;
          } else {
            pd.a(false);
            return;
          }
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        field_d = null;
        if (!param0) {
          field_g = false;
          field_e = null;
          field_a = null;
          return;
        } else {
          field_e = null;
          field_a = null;
          return;
        }
    }

    public final void a(boolean param0, int param1, byte param2, int param3, ei param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_27_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_26_0 = 0;
        L0: {
          var11 = Pool.field_O;
          if (param4.field_s) {
            stackOut_25_0 = 3249872;
            stackIn_27_0 = stackOut_25_0;
            break L0;
          } else {
            if (!param4.d(-60)) {
              stackOut_26_0 = 2188450;
              stackIn_27_0 = stackOut_26_0;
              break L0;
            } else {
              var6 = 3249872;
              int discarded$2 = ((pd) this).field_b.a("<u=" + Integer.toString(var6, 16) + ">" + param4.field_m + "</u>", param1 - -param4.field_C, param3 - -param4.field_D, param4.field_l, param4.field_y, var6, -1, ((pd) this).field_h, ((pd) this).field_c, ((pd) this).field_b.field_w + ((pd) this).field_b.field_C);
              if (param4.d(-52)) {
                var7 = ((pd) this).field_b.b(param4.field_m);
                var8 = ((pd) this).field_b.field_C + ((pd) this).field_b.field_w;
                var9 = param4.field_C + param1;
                var10 = param3 + param4.field_D;
                if (((pd) this).field_h == 2) {
                  var9 = var9 + (-var7 + param4.field_l);
                  if (2 != ((pd) this).field_c) {
                    if ((((pd) this).field_c ^ -1) != -2) {
                      bj.a(var10 - -2, var8, var7 + 4, -2 + var9, 2187);
                      var7 = 88 / ((param2 - 2) / 41);
                      return;
                    } else {
                      var10 = var10 + (param4.field_y - var8 >> 314356097);
                      bj.a(var10 - -2, var8, var7 + 4, -2 + var9, 2187);
                      var7 = 88 / ((param2 - 2) / 41);
                      return;
                    }
                  } else {
                    var10 = var10 + (-var8 + param4.field_y);
                    bj.a(var10 - -2, var8, var7 + 4, -2 + var9, 2187);
                    var7 = 88 / ((param2 - 2) / 41);
                    return;
                  }
                } else {
                  if (1 == ((pd) this).field_h) {
                    var9 = var9 + (param4.field_l + -var7 >> 177227489);
                    if (2 != ((pd) this).field_c) {
                      if ((((pd) this).field_c ^ -1) != -2) {
                        bj.a(var10 - -2, var8, var7 + 4, -2 + var9, 2187);
                        var7 = 88 / ((param2 - 2) / 41);
                        return;
                      } else {
                        var10 = var10 + (param4.field_y - var8 >> 314356097);
                        bj.a(var10 - -2, var8, var7 + 4, -2 + var9, 2187);
                        var7 = 88 / ((param2 - 2) / 41);
                        return;
                      }
                    } else {
                      var10 = var10 + (-var8 + param4.field_y);
                      bj.a(var10 - -2, var8, var7 + 4, -2 + var9, 2187);
                      var7 = 88 / ((param2 - 2) / 41);
                      return;
                    }
                  } else {
                    if (2 != ((pd) this).field_c) {
                      if ((((pd) this).field_c ^ -1) != -2) {
                        bj.a(var10 - -2, var8, var7 + 4, -2 + var9, 2187);
                        var7 = 88 / ((param2 - 2) / 41);
                        return;
                      } else {
                        var10 = var10 + (param4.field_y - var8 >> 314356097);
                        bj.a(var10 - -2, var8, var7 + 4, -2 + var9, 2187);
                        var7 = 88 / ((param2 - 2) / 41);
                        return;
                      }
                    } else {
                      var10 = var10 + (-var8 + param4.field_y);
                      bj.a(var10 - -2, var8, var7 + 4, -2 + var9, 2187);
                      var7 = 88 / ((param2 - 2) / 41);
                      return;
                    }
                  }
                }
              } else {
                var7 = 88 / ((param2 - 2) / 41);
                return;
              }
            }
          }
        }
        L1: {
          var6 = stackIn_27_0;
          int discarded$3 = ((pd) this).field_b.a("<u=" + Integer.toString(var6, 16) + ">" + param4.field_m + "</u>", param1 - -param4.field_C, param3 - -param4.field_D, param4.field_l, param4.field_y, var6, -1, ((pd) this).field_h, ((pd) this).field_c, ((pd) this).field_b.field_w + ((pd) this).field_b.field_C);
          if (param4.d(-52)) {
            var7 = ((pd) this).field_b.b(param4.field_m);
            var8 = ((pd) this).field_b.field_C + ((pd) this).field_b.field_w;
            var9 = param4.field_C + param1;
            var10 = param3 + param4.field_D;
            if (((pd) this).field_h == 2) {
              var9 = var9 + (-var7 + param4.field_l);
              if (2 != ((pd) this).field_c) {
                if ((((pd) this).field_c ^ -1) == -2) {
                  var10 = var10 + (param4.field_y - var8 >> 314356097);
                  bj.a(var10 - -2, var8, var7 + 4, -2 + var9, 2187);
                  break L1;
                } else {
                  bj.a(var10 - -2, var8, var7 + 4, -2 + var9, 2187);
                  var7 = 88 / ((param2 - 2) / 41);
                  return;
                }
              } else {
                var10 = var10 + (-var8 + param4.field_y);
                bj.a(var10 - -2, var8, var7 + 4, -2 + var9, 2187);
                var7 = 88 / ((param2 - 2) / 41);
                return;
              }
            } else {
              if (1 == ((pd) this).field_h) {
                var9 = var9 + (param4.field_l + -var7 >> 177227489);
                if (2 != ((pd) this).field_c) {
                  if ((((pd) this).field_c ^ -1) == -2) {
                    var10 = var10 + (param4.field_y - var8 >> 314356097);
                    bj.a(var10 - -2, var8, var7 + 4, -2 + var9, 2187);
                    var7 = 88 / ((param2 - 2) / 41);
                    return;
                  } else {
                    bj.a(var10 - -2, var8, var7 + 4, -2 + var9, 2187);
                    var7 = 88 / ((param2 - 2) / 41);
                    return;
                  }
                } else {
                  var10 = var10 + (-var8 + param4.field_y);
                  bj.a(var10 - -2, var8, var7 + 4, -2 + var9, 2187);
                  var7 = 88 / ((param2 - 2) / 41);
                  return;
                }
              } else {
                if (2 != ((pd) this).field_c) {
                  if ((((pd) this).field_c ^ -1) != -2) {
                    bj.a(var10 - -2, var8, var7 + 4, -2 + var9, 2187);
                    var7 = 88 / ((param2 - 2) / 41);
                    return;
                  } else {
                    var10 = var10 + (param4.field_y - var8 >> 314356097);
                    bj.a(var10 - -2, var8, var7 + 4, -2 + var9, 2187);
                    var7 = 88 / ((param2 - 2) / 41);
                    return;
                  }
                } else {
                  var10 = var10 + (-var8 + param4.field_y);
                  bj.a(var10 - -2, var8, var7 + 4, -2 + var9, 2187);
                  var7 = 88 / ((param2 - 2) / 41);
                  return;
                }
              }
            }
          } else {
            break L1;
          }
        }
        var7 = 88 / ((param2 - 2) / 41);
    }

    public pd() {
        ((pd) this).field_h = 1;
        ((pd) this).field_c = 1;
        ((pd) this).field_b = lc.field_O;
    }

    pd(lr param0, int param1, int param2) {
        ((pd) this).field_h = param1;
        ((pd) this).field_b = param0;
        ((pd) this).field_c = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
        field_g = false;
        field_i = 0L;
    }
}
