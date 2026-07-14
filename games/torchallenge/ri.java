/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri extends na {
    static int field_i;
    static ka field_j;
    static String field_k;

    public static void g(int param0) {
        field_k = null;
        field_j = null;
        if (param0 != 12) {
            field_k = null;
        }
    }

    final static qk a(int param0, String param1) {
        String var2 = null;
        qk var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        var5 = TorChallenge.field_F ? 1 : 0;
        if (gl.field_e != null) {
          if (param1 != null) {
            if (param1.length() != 0) {
              var6 = (CharSequence) (Object) param1;
              var2 = il.a(var6, (byte) 21);
              if (param0 == 0) {
                if (var2 != null) {
                  var3 = (qk) (Object) gl.field_e.a(true, (long)var2.hashCode());
                  L0: while (true) {
                    if (var3 != null) {
                      var7 = (CharSequence) (Object) var3.field_F;
                      var4 = il.a(var7, (byte) 21);
                      if (!var4.equals((Object) (Object) var2)) {
                        var3 = (qk) (Object) gl.field_e.a((byte) 125);
                        continue L0;
                      } else {
                        return var3;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final am a(boolean param0) {
        if (!param0) {
            ri.g(-27);
            return dh.field_V;
        }
        return dh.field_V;
    }

    final static void f(int param0) {
        fe var1 = null;
        int var2 = 0;
        L0: {
          if (pg.field_p != null) {
            je.a((byte) 15, pg.field_p);
            break L0;
          } else {
            break L0;
          }
        }
        pg.field_p = null;
        ok.field_a = null;
        var1 = cj.field_h[10];
        if (param0 < 122) {
          field_j = null;
          var2 = ab.field_g[10];
          e discarded$4 = ol.a(-118, var1, var2);
          return;
        } else {
          var2 = ab.field_g[10];
          e discarded$5 = ol.a(-118, var1, var2);
          return;
        }
    }

    final static void a(String param0, byte param1) {
        kg.field_P = param0;
        fk.a(true, 12);
        int var2 = -108 / ((param1 - -3) / 57);
    }

    ri(long param0, String param1) {
        super(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = -1;
        field_k = "Confirm Password: ";
    }
}
