/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    static df field_c;
    static jb field_d;
    static String field_a;
    static String field_b;

    final static boolean a(int param0) {
        if (param0 != -13613) {
            field_d = null;
        }
        return rk.field_f;
    }

    final static String a(int param0, CharSequence param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Confined.field_J ? 1 : 0;
        if (param1 != null) {
          var2 = param0;
          var3 = param1.length();
          L0: while (true) {
            L1: {
              if (var3 <= var2) {
                break L1;
              } else {
                if (!bg.a(175, param1.charAt(var2))) {
                  break L1;
                } else {
                  var2++;
                  continue L0;
                }
              }
            }
            L2: while (true) {
              L3: {
                if (var3 <= var2) {
                  break L3;
                } else {
                  if (!bg.a(param0 + 175, param1.charAt(-1 + var3))) {
                    break L3;
                  } else {
                    var3--;
                    continue L2;
                  }
                }
              }
              var4 = -var2 + var3;
              if (var4 >= 1) {
                if (-13 <= (var4 ^ -1)) {
                  var5 = new StringBuilder(var4);
                  var6 = var2;
                  L4: while (true) {
                    if (var6 >= var3) {
                      if (var5.length() != 0) {
                        return var5.toString();
                      } else {
                        return null;
                      }
                    } else {
                      var7 = param1.charAt(var6);
                      if (vb.a((byte) -37, (char) var7)) {
                        var8 = i.a((char) var7, (byte) -98);
                        if (var8 != 0) {
                          StringBuilder discarded$1 = var5.append(var8);
                          var6++;
                          continue L4;
                        } else {
                          var6++;
                          continue L4;
                        }
                      } else {
                        var6++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          return null;
        }
    }

    final static void a(oc param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Confined.field_J ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if ((var2 ^ -1) <= -4) {
            var2 = 0;
            L1: while (true) {
              if (en.field_a <= var2) {
                jj.field_lb[param0.a(80)] = jj.field_lb[param0.a(80)] + 1;
                var3 = -16 / ((4 - param1) / 48);
                var2 = 0;
                var4 = 0;
                L2: while (true) {
                  if (var4 >= en.field_a) {
                    en.field_a = var2;
                    en.field_a = en.field_a + 1;
                    kl.field_R[en.field_a] = param0;
                    return;
                  } else {
                    L3: {
                      if (param0.field_a == kl.field_R[var4].field_a) {
                        var5 = kl.field_R[var4].a(-97);
                        if (um.field_b < jj.field_lb[var5]) {
                          jj.field_lb[var5] = jj.field_lb[var5] - 1;
                          var4++;
                          continue L2;
                        } else {
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                    var2++;
                    kl.field_R[var2] = kl.field_R[var4];
                    var4++;
                    continue L2;
                  }
                }
              } else {
                if (param0.field_a == kl.field_R[var2].field_a) {
                  jj.field_lb[kl.field_R[var2].a(-79)] = jj.field_lb[kl.field_R[var2].a(-79)] + 1;
                  var2++;
                  continue L1;
                } else {
                  var2++;
                  continue L1;
                }
              }
            }
          } else {
            jj.field_lb[var2] = 0;
            var2++;
            continue L0;
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        field_d = null;
        if (param0 > -77) {
            field_d = null;
        }
    }

    final static tl[] a(df param0, int param1) {
        int var5 = 0;
        tl var6 = null;
        int var7 = Confined.field_J ? 1 : 0;
        if (!(param0.c(-123))) {
            return new tl[]{};
        }
        if (param1 <= 65) {
            hh.a((byte) -108);
        }
        bc var8 = param0.a(5);
        while (-1 == (var8.field_g ^ -1)) {
            jd.a(1, 10L);
        }
        if (!(var8.field_g != 2)) {
            return new tl[]{};
        }
        int[] var12 = (int[]) var8.field_f;
        int[] var11 = var12;
        int[] var10 = var11;
        int[] var9 = var10;
        int[] var3 = var9;
        tl[] var4 = new tl[var12.length >> 619893154];
        for (var5 = 0; var4.length > var5; var5++) {
            var6 = new tl();
            var4[var5] = var6;
            var6.field_j = var3[var5 << -1970432862];
            var6.field_c = var3[1 + (var5 << -1843892222)];
            var6.field_h = var3[(var5 << 1991853282) - -2];
            var6.field_k = var3[(var5 << 2106683330) - -3];
        }
        return var4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Orb points: ";
        field_b = "Achievements";
    }
}
