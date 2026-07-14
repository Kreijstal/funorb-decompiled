/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb {
    static f field_a;
    static fa field_c;
    static sf field_f;
    static int field_g;
    static int[] field_d;
    static int field_i;
    static int field_b;
    static String field_e;
    static int field_h;

    final static void a(boolean param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = fleas.field_A ? 1 : 0;
          if (!param0) {
            break L0;
          } else {
            nb.a((byte) -101);
            break L0;
          }
        }
        L1: {
          if (!qh.c((byte) 65)) {
            L2: {
              if (vc.field_b) {
                break L2;
              } else {
                L3: {
                  if (fg.field_x != null) {
                    break L3;
                  } else {
                    fg.field_x = ed.a(16777215, 4);
                    break L3;
                  }
                }
                if (!fg.field_x.field_n) {
                  break L2;
                } else {
                  fleas.field_L = fleas.field_L & (fg.field_x.field_k ^ -1);
                  kh.field_b = kh.field_b | fg.field_x.field_k;
                  vc.field_b = true;
                  fg.field_x = null;
                  break L2;
                }
              }
            }
            if (mf.field_a != null) {
              var1 = 0;
              var2 = 0;
              L4: while (true) {
                if ((var2 ^ -1) <= -3) {
                  if (var1 != 2) {
                    break L1;
                  } else {
                    mf.field_a = null;
                    break L1;
                  }
                } else {
                  L5: {
                    if (mf.field_a[var2] != null) {
                      break L5;
                    } else {
                      mf.field_a[var2] = pi.a(var2, 1, 5, 124);
                      break L5;
                    }
                  }
                  if (mf.field_a[var2] != null) {
                    if (mf.field_a[var2].field_p) {
                      if (mf.field_a[var2].field_m[0] > hj.field_a[var2]) {
                        hj.field_a[var2] = mf.field_a[var2].field_m[0];
                        var1++;
                        var2++;
                        continue L4;
                      } else {
                        var1++;
                        var2++;
                        continue L4;
                      }
                    } else {
                      var2++;
                      continue L4;
                    }
                  } else {
                    var2++;
                    continue L4;
                  }
                }
              }
            } else {
              break L1;
            }
          } else {
            break L1;
          }
        }
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 <= 33) {
            return;
        }
        field_d = null;
        field_f = null;
        field_e = null;
        field_a = null;
    }

    final static double a(double param0, int param1) {
        int var3 = 70 / ((-56 - param1) / 63);
        return tg.field_c[65535 & (int)(32768.0 * param0 / 3.141592653589793)];
    }

    final static int a(String param0, int param1, fa param2, String[] param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = fleas.field_A ? 1 : 0;
          var5 = param2.b(param0);
          if (var5 > param1) {
            break L0;
          } else {
            if ((param0.indexOf("<br>") ^ -1) != 0) {
              break L0;
            } else {
              param3[0] = (String) (Object) param3;
              return 1;
            }
          }
        }
        var6 = (var5 + (param1 - param4)) / param1;
        param1 = var5 / var6;
        var6 = 0;
        var7 = 0;
        var8 = param0.length();
        var9 = 0;
        L1: while (true) {
          if (var9 >= var8) {
            L2: {
              if (var8 <= var7) {
                break L2;
              } else {
                var6++;
                param3[var6] = param0.substring(var7, var8).trim();
                break L2;
              }
            }
            return var6;
          } else {
            L3: {
              L4: {
                var10 = param0.charAt(var9);
                if (var10 == 32) {
                  break L4;
                } else {
                  if (45 != var10) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              var11 = param0.substring(var7, 1 + var9).trim();
              var12 = param2.b(var11);
              if (param1 <= var12) {
                var6++;
                param3[var6] = var11;
                var7 = var9 - -1;
                break L3;
              } else {
                break L3;
              }
            }
            if (var10 == 62) {
              if (param0.regionMatches(-3 + var9, "<br>", 0, 4)) {
                var6++;
                param3[var6] = param0.substring(var7, -3 + var9).trim();
                var7 = var9 + 1;
                var9++;
                continue L1;
              } else {
                var9++;
                continue L1;
              }
            } else {
              var9++;
              continue L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[8192];
        field_b = 40;
        field_e = "Members only";
    }
}
