/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf extends pg {
    static so field_g;
    byte[] field_t;
    static ed field_k;
    static ec field_s;
    static kc field_i;
    static int field_m;
    static String field_p;
    static int field_o;
    static int field_q;
    static int field_r;
    static int[] field_n;
    static kc field_u;
    static int field_l;
    static int[] field_v;
    static String field_h;
    static String field_j;

    final static String a(int param0, String param1, int param2) {
        if (-4 == param2) {
          return fm.field_a;
        } else {
          if (6 != param2) {
            if (-8 == param2) {
              return mm.field_v;
            } else {
              if (param2 == 8) {
                return mf.field_f;
              } else {
                if (param0 < -5) {
                  if ((param2 ^ -1) != -10) {
                    if (10 == param2) {
                      return oj.field_c;
                    } else {
                      if (11 == param2) {
                        return wd.field_f;
                      } else {
                        if ((param2 ^ -1) != -15) {
                          return null;
                        } else {
                          return tj.a(-17, new String[1], ji.field_k);
                        }
                      }
                    }
                  } else {
                    return v.field_n;
                  }
                } else {
                  field_o = -110;
                  if ((param2 ^ -1) != -10) {
                    if (10 == param2) {
                      return oj.field_c;
                    } else {
                      if (11 == param2) {
                        return wd.field_f;
                      } else {
                        if ((param2 ^ -1) != -15) {
                          return null;
                        } else {
                          return tj.a(-17, new String[1], ji.field_k);
                        }
                      }
                    }
                  } else {
                    return v.field_n;
                  }
                }
              }
            }
          } else {
            return rf.field_k;
          }
        }
    }

    final static cg a(long param0, int param1) {
        if (param1 != 8192) {
            field_h = null;
            return (cg) (Object) kn.field_qb.a(param0, (byte) -121);
        }
        return (cg) (Object) kn.field_qb.a(param0, (byte) -121);
    }

    public static void a(int param0) {
        field_i = null;
        field_h = null;
        field_p = null;
        field_u = null;
        field_n = null;
        field_s = null;
        field_j = null;
        field_g = null;
        if (param0 != 27494) {
          cg discarded$2 = vf.a(-96L, -109);
          field_v = null;
          field_k = null;
          return;
        } else {
          field_v = null;
          field_k = null;
          return;
        }
    }

    vf(byte[] param0) {
        ((vf) this).field_t = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new so(1);
        field_p = "Press '<col=ffffff><%0></col>' or '<col=ffffff><%1></col>' to cycle through your minions or to centre on your Arcanist.<br>  Use the '<col=ffffff>Arrow keys</col>' to scroll around the map.";
        km.a(100, 50);
        field_v = new int[8192];
        field_h = "Spellbook not acquired";
    }
}
