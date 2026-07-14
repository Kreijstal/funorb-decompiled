/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hi extends bj implements cd {
    static java.security.SecureRandom field_k;
    private ig field_l;
    static String field_m;
    static int[] field_n;

    final static void a(boolean param0, byte param1) {
        if (param1 <= 55) {
            field_k = null;
        }
        cf.a(true, param0, (byte) 111);
    }

    abstract String a(byte param0, String param1);

    abstract bm a(String param0, byte param1);

    public final void a(ig param0, byte param1) {
        ((hi) this).a(true);
        int var3 = 31 % ((-76 - param1) / 41);
    }

    final bm d(int param0) {
        if (param0 != 11269) {
            return null;
        }
        return ((hi) this).a(((hi) this).field_l.field_n, (byte) 120);
    }

    final static void b(boolean param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        p var6 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = HostileSpawn.field_I ? 1 : 0;
        if (!param0) {
          var4 = uj.field_p.field_e + 24;
          var5 = uj.field_p.field_g;
          var1 = 0;
          L0: while (true) {
            if (var1 >= ib.field_c) {
              return;
            } else {
              L1: {
                L2: {
                  var6 = jn.field_F[var1];
                  var3 = -var5 + (int)(((double)var6.field_j.field_g + var6.field_l.field_a) * 24.0);
                  var2 = (int)(24.0 * ((double)var6.field_j.field_e + var6.field_l.field_f)) + -var4;
                  if (var2 < -96) {
                    break L2;
                  } else {
                    if (-96 > var3) {
                      break L2;
                    } else {
                      if (var2 > 736) {
                        break L2;
                      } else {
                        if (-577 > var3) {
                          break L2;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
                if (-6 == var6.field_i) {
                  break L1;
                } else {
                  if (-25 == var6.field_i) {
                    break L1;
                  } else {
                    var1++;
                    continue L0;
                  }
                }
              }
              var7 = var6.field_i;
              if (-37 == var7) {
                fg.a(var2, var3, 25, var6);
                var1++;
                continue L0;
              } else {
                var1++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    hi(ig param0) {
        ((hi) this).field_l = param0;
    }

    public final boolean a(byte param0) {
        int var2 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var2 = 67 % ((param0 - -4) / 59);
            if (null == ((hi) this).field_l.field_n) {
              break L1;
            } else {
              if (0 != ((hi) this).field_l.field_n.length()) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackOut_3_0 = 1;
          stackIn_5_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_5_0 != 0;
    }

    public final void a(ig param0, int param1) {
        int var3 = 12 / ((param1 - 0) / 41);
    }

    public static void e(int param0) {
        field_m = null;
        field_n = null;
        if (param0 != 24) {
            Object var2 = null;
            int discarded$0 = hi.a(27, (CharSequence) null);
        }
        field_k = null;
    }

    final static int a(int param0, CharSequence param1) {
        int var2 = -110 / ((27 - param0) / 54);
        return ik.a(10, true, -6514, param1);
    }

    final String b(byte param0) {
        int var2 = -73 % ((param0 - -51) / 49);
        return ((hi) this).a((byte) 31, ((hi) this).field_l.field_n);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Damn! The rest of my weaponry and ammo are in the wreck. I'll have to make do with my trusty auto gun instead.";
    }
}
