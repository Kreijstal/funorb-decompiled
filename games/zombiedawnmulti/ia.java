/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia extends un {
    static cj field_t;
    static ja field_y;
    private pm field_q;
    static String field_u;
    static String field_w;
    static boolean field_r;
    static String field_v;
    private pm field_z;
    static int field_s;
    static hn[] field_x;

    final static void a(int param0, int param1, boolean param2, int param3) {
        jl.a(jk.field_f, (byte) -97, jo.field_f, param2, param1, param0, nj.field_h);
        if (param3 != 0) {
            Object var5 = null;
            boolean discarded$0 = ia.a(-113, (String) null, (String) null);
        }
    }

    final String a(String param0, int param1) {
        String var4 = null;
        String var5 = null;
        String var6 = null;
        var6 = ((ia) this).field_z.field_j.toLowerCase();
        var4 = param0.toLowerCase();
        if (var4.length() != 0) {
          var5 = var4;
          if (!gn.b((byte) 62, var5)) {
            if (ol.a(var5, false)) {
              return bi.field_c;
            } else {
              if (!qa.a((byte) -125, var5)) {
                if (param1 == -1276425040) {
                  if (!this.b(param0, -1)) {
                    if ((var6.length() ^ -1) < -1) {
                      if (!cr.a(var6, var5, param1 + 1276425039)) {
                        if (a.a(var5, var6, (byte) -86)) {
                          return tq.field_Hb;
                        } else {
                          if (ia.a(101, var6, var5)) {
                            return kc.field_b;
                          } else {
                            return jb.field_k;
                          }
                        }
                      } else {
                        return kc.field_b;
                      }
                    } else {
                      return eb.field_y;
                    }
                  } else {
                    return oq.field_z;
                  }
                } else {
                  return null;
                }
              } else {
                return gi.field_g;
              }
            }
          } else {
            return jb.field_k;
          }
        } else {
          return null;
        }
    }

    ia(pm param0, pm param1, pm param2) {
        super(param0);
        ((ia) this).field_q = param2;
        ((ia) this).field_z = param1;
    }

    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 > 91) {
          param1 = ee.a('_', "", param1, -40);
          var3 = qc.b((byte) -32, param1);
          if (param2.indexOf(param1) == 0) {
            if (0 != param2.indexOf(var3)) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            return stackIn_5_0 != 0;
          }
        } else {
          return false;
        }
    }

    private final boolean b(String param0, int param1) {
        String var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        var3 = ((ia) this).field_q.field_j.toLowerCase();
        var4 = param0.toLowerCase();
        if (var3.length() < param1) {
          if (-1 < var4.length()) {
            var5 = var3.lastIndexOf("@");
            if (0 <= var5) {
              if (var3.length() + -1 > var5) {
                var6 = var3.substring(0, var5);
                var7 = var3.substring(1 + var5);
                if (-1 >= (var4.indexOf(var6) ^ -1)) {
                  return true;
                } else {
                  if (0 > var4.indexOf(var7)) {
                    return false;
                  } else {
                    return true;
                  }
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    public static void h(int param0) {
        field_w = null;
        field_v = null;
        field_y = null;
        if (param0 != 0) {
          field_v = null;
          field_u = null;
          field_x = null;
          field_t = null;
          return;
        } else {
          field_u = null;
          field_x = null;
          field_t = null;
          return;
        }
    }

    final re a(boolean param0, String param1) {
        String var3 = null;
        String var4 = null;
        if (param0) {
            field_w = null;
            var3 = ((ia) this).field_z.field_j.toLowerCase();
            var4 = param1.toLowerCase();
            if (!(var4.length() != 0)) {
                return jq.field_b;
            }
            if (!(lb.a(var3, var4, (byte) -10))) {
                return jq.field_b;
            }
            if (!(!this.b(param1, -1))) {
                return jq.field_b;
            }
            return db.field_b;
        }
        var3 = ((ia) this).field_z.field_j.toLowerCase();
        var4 = param1.toLowerCase();
        if (!(var4.length() != 0)) {
            return jq.field_b;
        }
        if (!(lb.a(var3, var4, (byte) -10))) {
            return jq.field_b;
        }
        if (!(!this.b(param1, -1))) {
            return jq.field_b;
        }
        return db.field_b;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "";
        field_w = "Player Name: ";
        field_v = "Please enter a year between <%0> and <%1>";
        field_x = new hn[]{};
    }
}
