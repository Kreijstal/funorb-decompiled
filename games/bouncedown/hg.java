/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg extends al {
    static int field_l;
    static kf field_k;
    static eh field_j;

    final static void a(String param0, int param1, float param2) {
        q.field_I = param2;
        if (param1 >= -6) {
            field_k = null;
            ea.field_c = param0;
            return;
        }
        ea.field_c = param0;
    }

    final vf b(String param0, byte param1) {
        int var3 = 0;
        CharSequence var4 = null;
        CharSequence var5 = null;
        var4 = (CharSequence) (Object) param0;
        if (qi.a(var4, 10)) {
          var5 = (CharSequence) (Object) param0;
          var3 = gf.a(param1 + -44, var5);
          if (param1 == 54) {
            if (-1 > (var3 ^ -1)) {
              if (130 < var3) {
                return a.field_e;
              } else {
                return mc.field_a;
              }
            } else {
              return a.field_e;
            }
          } else {
            return null;
          }
        } else {
          return a.field_e;
        }
    }

    final static void h(byte param0) {
        ja.field_b = jc.field_g.b(true);
        int var1 = 89 % ((-14 - param0) / 56);
        CharSequence var2 = (CharSequence) (Object) ja.field_b;
        qe.field_e = ce.a(var2, 0);
    }

    final static byte[] a(byte param0, String param1) {
        if (param0 < 84) {
            return null;
        }
        return la.field_D.b("", param1, -11);
    }

    public static void d(int param0) {
        Object var2 = null;
        if (param0 != -1) {
          var2 = null;
          hg.a((String) null, -125, 0.2765498757362366f);
          field_j = null;
          field_k = null;
          return;
        } else {
          field_j = null;
          field_k = null;
          return;
        }
    }

    final String a(String param0, byte param1) {
        if (((hg) this).b(param0, (byte) 54) == a.field_e) {
            return kc.field_b;
        }
        if (param1 == -114) {
            return null;
        }
        field_l = -56;
        return null;
    }

    final static String a(String param0, gk param1, int param2, String param3) {
        if (param2 == 130) {
          if (!param1.c(77)) {
            return param0;
          } else {
            return param3 + " - " + param1.a(100) + "%";
          }
        } else {
          field_j = null;
          if (!param1.c(77)) {
            return param0;
          } else {
            return param3 + " - " + param1.a(100) + "%";
          }
        }
    }

    hg(ba param0) {
        super(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = 0;
        field_j = new eh(12, 0, 1, 0);
    }
}
