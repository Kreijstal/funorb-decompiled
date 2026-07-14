/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qo {
    static jd field_e;
    static int field_c;
    static int field_d;
    static eg field_a;
    static hc field_b;

    public static void c(byte param0) {
        field_e = null;
        int var1 = -27 % ((param0 - -24) / 37);
        field_b = null;
        field_a = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static String a(String param0, String param1, gk param2, int param3, String param4) {
        if (!(param2.b((byte) -105))) {
            return param0;
        }
        if (param3 != 13525) {
            return (String) null;
        }
        return param4 + " - " + param2.a(param1, (byte) -79) + "%";
    }

    final static void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        oh var4_ref_oh = null;
        int var4 = 0;
        uk var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        dl var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        var8 = AceOfSkies.field_G ? 1 : 0;
        var10 = nm.field_c;
        if (param0 == -26) {
          L0: {
            var2 = var10.g(104);
            var3 = var10.g(-75);
            if (0 != var2) {
              if (1 == var2) {
                var4 = var10.f((byte) 127);
                var5 = (uk) v.field_b.d(268435455);
                L1: while (true) {
                  L2: {
                    if (var5 == null) {
                      break L2;
                    } else {
                      L3: {
                        if (var3 != ((uk) var5).field_i) {
                          break L3;
                        } else {
                          if (((uk) var5).field_m == var4) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var5 = (uk) v.field_b.b((byte) 103);
                      continue L1;
                    }
                  }
                  if (var5 != null) {
                    var5.c(-125);
                    break L0;
                  } else {
                    te.b(true);
                    return;
                  }
                }
              } else {
                v.a("LR1: " + dl.k((byte) 65), (byte) -52, (Throwable) null);
                te.b(true);
                break L0;
              }
            } else {
              var4_ref_oh = (oh) fg.field_r.d(268435455);
              if (var4_ref_oh != null) {
                L4: {
                  var5_int = ag.field_s + -((dl) var10).field_g;
                  var14 = ((oh) var4_ref_oh).field_f;
                  var13 = var14;
                  var12 = var13;
                  var11 = var12;
                  var6 = var11;
                  if (var5_int <= var14.length << -2061567038) {
                    break L4;
                  } else {
                    var5_int = var14.length << -381357150;
                    break L4;
                  }
                }
                var7 = 0;
                L5: while (true) {
                  if (var7 >= var5_int) {
                    var4_ref_oh.c(-124);
                    break L0;
                  } else {
                    var6[var7 >> -1283038238] = var6[var7 >> -1283038238] + (var10.g(-100) << pg.a(var7 << 920191848, 768));
                    var7++;
                    continue L5;
                  }
                }
              } else {
                te.b(true);
                return;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final boolean b(byte param0) {
        if (param0 != -92) {
            field_c = 87;
        }
        return (((Object) (Object) aj.field_v == this ? 1 : 0) | (this == (Object) (Object) nj.field_f ? 1 : 0)) != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new jd();
        field_a = new eg();
    }
}
