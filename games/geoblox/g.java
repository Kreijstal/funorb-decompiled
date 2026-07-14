/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g extends q {
    static int field_j;
    static String field_m;
    private dj field_k;
    static String field_l;
    static dm field_i;
    private dj field_n;

    g(dj param0, dj param1, dj param2) {
        super(param0);
        ((g) this).field_n = param2;
        ((g) this).field_k = param1;
    }

    final String b(int param0, String param1) {
        String var6 = ((g) this).field_k.field_s.toLowerCase();
        String var4 = param1.toLowerCase();
        if (var4.length() == 0) {
            return null;
        }
        String var5 = var4;
        if (!(!em.a(var5, param0 + -344))) {
            return ji.field_d;
        }
        if (!(!ak.a(var5, (byte) -120))) {
            return ai.field_h;
        }
        if (ra.a(param0 + 18303, var5)) {
            return gg.field_a;
        }
        if (param0 != 422) {
            g.g(119);
            if (!(!this.a(param1, -29267))) {
                return uf.field_i;
            }
            if (0 >= var6.length()) {
                return ii.field_j;
            }
            if (!(!ak.a(var5, var6, -98))) {
                return gf.field_e;
            }
            if (!(!uk.a(8, var6, var5))) {
                return gg.field_c;
            }
            if (!(!wc.a(var5, var6, (byte) -96))) {
                return gf.field_e;
            }
            return ji.field_d;
        }
        if (!(!this.a(param1, -29267))) {
            return uf.field_i;
        }
        if (0 >= var6.length()) {
            return ii.field_j;
        }
        if (!(!ak.a(var5, var6, -98))) {
            return gf.field_e;
        }
        if (!(!uk.a(8, var6, var5))) {
            return gg.field_c;
        }
        if (!(!wc.a(var5, var6, (byte) -96))) {
            return gf.field_e;
        }
        return ji.field_d;
    }

    private final boolean a(String param0, int param1) {
        String var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        var3 = ((g) this).field_n.field_s.toLowerCase();
        var4 = param0.toLowerCase();
        if (0 < var3.length()) {
          if (-1 > (var4.length() ^ -1)) {
            var5 = var3.lastIndexOf("@");
            if (0 <= var5) {
              if (var3.length() + -1 > var5) {
                var6 = var3.substring(0, var5);
                var7 = var3.substring(var5 + 1);
                if (-1 < var4.indexOf(var6)) {
                  if (-1 > var4.indexOf(var7)) {
                    if (param1 != -29267) {
                      field_l = null;
                      return false;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                if (param1 != -29267) {
                  field_l = null;
                  return false;
                } else {
                  return false;
                }
              }
            } else {
              if (param1 != -29267) {
                field_l = null;
                return false;
              } else {
                return false;
              }
            }
          } else {
            if (param1 != -29267) {
              field_l = null;
              return false;
            } else {
              return false;
            }
          }
        } else {
          if (param1 != -29267) {
            field_l = null;
            return false;
          } else {
            return false;
          }
        }
    }

    final lh a(int param0, String param1) {
        String var3 = null;
        String var4 = null;
        if (param0 == -257) {
          var3 = ((g) this).field_k.field_s.toLowerCase();
          var4 = param1.toLowerCase();
          if (var4.length() == 0) {
            return si.field_m;
          } else {
            if (dd.a(var4, var3, -25321)) {
              if (this.a(param1, -29267)) {
                return si.field_m;
              } else {
                return kk.field_w;
              }
            } else {
              return si.field_m;
            }
          }
        } else {
          ((g) this).field_k = null;
          var3 = ((g) this).field_k.field_s.toLowerCase();
          var4 = param1.toLowerCase();
          if (var4.length() == 0) {
            return si.field_m;
          } else {
            if (dd.a(var4, var3, -25321)) {
              if (this.a(param1, -29267)) {
                return si.field_m;
              } else {
                return kk.field_w;
              }
            } else {
              return si.field_m;
            }
          }
        }
    }

    public static void g(int param0) {
        if (param0 >= -90) {
            return;
        }
        field_i = null;
        field_m = null;
        field_l = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Email address is unavailable";
        field_l = "Service unavailable";
        field_j = 0;
    }
}
