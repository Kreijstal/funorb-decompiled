/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf extends mf {
    static vh field_m;
    static int field_l;
    static String field_k;

    final String a(String param0, int param1) {
        if (!(((qf) this).a(param1, param0) != hg.field_c)) {
            return di.field_a;
        }
        return null;
    }

    final ok a(int param0, String param1) {
        int var3 = 0;
        CharSequence var4 = null;
        CharSequence var5 = null;
        var4 = (CharSequence) (Object) param1;
        if (!af.a(var4, (byte) 78)) {
          return hg.field_c;
        } else {
          var5 = (CharSequence) (Object) param1;
          var3 = ph.a(1124, var5);
          if (param0 > (var3 ^ -1)) {
            if (130 < var3) {
              return hg.field_c;
            } else {
              return gf.field_V;
            }
          } else {
            return hg.field_c;
          }
        }
    }

    public static void c(boolean param0) {
        field_k = null;
        if (!param0) {
            return;
        }
        field_m = null;
    }

    final static String c(byte param0) {
        String var1 = null;
        L0: {
          var1 = "";
          if (r.field_b != null) {
            var1 = r.field_b.d(false);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (0 == var1.length()) {
            var1 = vk.d((byte) -110);
            break L1;
          } else {
            break L1;
          }
        }
        if (param0 != 77) {
          return null;
        } else {
          L2: {
            if (0 != var1.length()) {
              break L2;
            } else {
              var1 = ei.field_i;
              break L2;
            }
          }
          return var1;
        }
    }

    qf(og param0) {
        super(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Achievements";
    }
}
