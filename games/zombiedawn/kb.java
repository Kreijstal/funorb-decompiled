/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb extends pm {
    static String field_h;
    static sm field_f;
    static String[] field_g;
    static String[] field_j;
    static vn[] field_i;

    final String a(String param0, byte param1) {
        if (param1 <= -94) {
          if (((kb) this).a(param0, 2) != uc.field_b) {
            return null;
          } else {
            return sa.field_Z;
          }
        } else {
          field_i = null;
          if (((kb) this).a(param0, 2) != uc.field_b) {
            return null;
          } else {
            return sa.field_Z;
          }
        }
    }

    kb(tb param0) {
        super(param0);
    }

    final rh a(String param0, int param1) {
        int var3 = 0;
        Object var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        if (param1 == 2) {
          var7 = (CharSequence) (Object) param0;
          if (sj.a((byte) -101, var7)) {
            var8 = (CharSequence) (Object) param0;
            var3 = ra.a(var8, 121);
            if ((var3 ^ -1) < -1) {
              if (130 < var3) {
                return uc.field_b;
              } else {
                return mc.field_g;
              }
            } else {
              return uc.field_b;
            }
          } else {
            return uc.field_b;
          }
        } else {
          var4 = null;
          String discarded$2 = ((kb) this).a((String) null, (byte) 5);
          var5 = (CharSequence) (Object) param0;
          if (sj.a((byte) -101, var5)) {
            var6 = (CharSequence) (Object) param0;
            var3 = ra.a(var6, 121);
            if ((var3 ^ -1) < -1) {
              if (130 < var3) {
                return uc.field_b;
              } else {
                return mc.field_g;
              }
            } else {
              return uc.field_b;
            }
          } else {
            return uc.field_b;
          }
        }
    }

    public static void d(int param0) {
        field_f = null;
        field_g = null;
        field_i = null;
        if (param0 <= 60) {
            return;
        }
        field_j = null;
        field_h = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "This password contains your Player Name, and would be easy to guess";
        field_g = new String[]{"Catch as many as you can before the time runs out!", "Get across the road!", "Swarm the entrance to the White House!", "", "Catch as many as you can before the time runs out!", "Herd the humans into the barn!", "Get across the laser maze as fast as you can!", ""};
        field_f = new sm();
    }
}
