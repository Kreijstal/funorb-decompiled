/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md extends me {
    static String field_j;
    static int field_k;

    final String b(int param0, String param1) {
        if (param0 == -1) {
          if (((md) this).a(95, param1) != ec.field_d) {
            return null;
          } else {
            return tj.field_A;
          }
        } else {
          field_k = 66;
          if (((md) this).a(95, param1) != ec.field_d) {
            return null;
          } else {
            return tj.field_A;
          }
        }
    }

    final rc a(int param0, String param1) {
        int var3 = 0;
        Object var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        if (param0 == 95) {
          var7 = (CharSequence) (Object) param1;
          if (qj.a(var7, 100)) {
            var8 = (CharSequence) (Object) param1;
            var3 = aa.a(97, var8);
            if ((var3 ^ -1) < -1) {
              if (var3 > 130) {
                return ec.field_d;
              } else {
                return hi.field_b;
              }
            } else {
              return ec.field_d;
            }
          } else {
            return ec.field_d;
          }
        } else {
          var4 = null;
          rc discarded$2 = ((md) this).a(81, (String) null);
          var5 = (CharSequence) (Object) param1;
          if (qj.a(var5, 100)) {
            var6 = (CharSequence) (Object) param1;
            var3 = aa.a(97, var6);
            if ((var3 ^ -1) < -1) {
              if (var3 > 130) {
                return ec.field_d;
              } else {
                return hi.field_b;
              }
            } else {
              return ec.field_d;
            }
          } else {
            return ec.field_d;
          }
        }
    }

    md(rg param0) {
        super(param0);
    }

    public static void b(boolean param0) {
        if (!param0) {
            field_j = null;
            field_j = null;
            return;
        }
        field_j = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = -1;
    }
}
