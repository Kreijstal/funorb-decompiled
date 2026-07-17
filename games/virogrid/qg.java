/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg extends l {
    static String field_s;
    int[] field_p;
    int field_q;
    static wg field_l;
    int field_k;
    int field_v;
    static String field_m;
    int field_t;
    static ul field_r;
    int field_i;
    static mg[] field_j;
    int field_o;
    static int field_n;
    static mg field_u;
    static il field_h;
    static int field_w;
    static int field_g;

    final static void a(int param0, boolean param1) {
        int var3 = 0;
        String var4 = null;
        Object var5 = null;
        Object var6 = null;
        CharSequence var7 = null;
        if (he.field_Xb != null) {
          var3 = he.field_Xb.b(param1, -28624);
          if (0 != var3) {
            if (var3 != 2) {
              he.field_Xb = null;
              ge.field_d = -1;
              return;
            } else {
              if (he.field_Xb.field_V == null) {
                he.field_Xb = null;
                ge.field_d = -1;
                return;
              } else {
                if (!he.field_Xb.field_V.equals((Object) (Object) "")) {
                  L0: {
                    if (he.field_Xb.field_V.charAt(0) != 91) {
                      var7 = (CharSequence) (Object) he.field_Xb.field_V;
                      var4 = c.a(var7, true);
                      break L0;
                    } else {
                      var4 = he.field_Xb.field_V;
                      break L0;
                    }
                  }
                  L1: {
                    var5 = null;
                    if (0 == ge.field_d) {
                      var5 = (Object) (Object) ab.a((byte) 73, var4, 13);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (ge.field_d == 1) {
                      var5 = (Object) (Object) og.a(var4, true, 13);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (ge.field_d == 2) {
                      var5 = (Object) (Object) g.a(var4, -128, 13);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (ge.field_d != 3) {
                      break L4;
                    } else {
                      var5 = (Object) (Object) og.a(var4, 13, (byte) 60, var4);
                      break L4;
                    }
                  }
                  if (var5 == null) {
                    he.field_Xb = null;
                    ge.field_d = -1;
                    return;
                  } else {
                    var6 = null;
                    gf.a(var4, 0, false, (String) var5, 2, (String) null);
                    he.field_Xb = null;
                    ge.field_d = -1;
                    return;
                  }
                } else {
                  he.field_Xb = null;
                  ge.field_d = -1;
                  return;
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void a() {
        field_h = null;
        field_u = null;
        field_s = null;
        field_l = null;
        field_j = null;
        field_m = null;
        field_r = null;
    }

    qg() {
    }

    final void a(int[] param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7) {
        try {
            ((qg) this).field_q = param4;
            ((qg) this).field_p = param0;
            ((qg) this).field_v = param5;
            ((qg) this).field_o = param1;
            ((qg) this).field_i = param2;
            ((qg) this).field_t = param7;
            if (param3 != -45) {
                ((qg) this).field_k = 79;
            }
            ((qg) this).field_k = param6;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "qg.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Orb points: ";
        field_s = "No players";
        field_r = new ul(3);
    }
}
