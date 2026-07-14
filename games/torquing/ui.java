/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui extends q {
    int field_m;
    int field_j;
    static int field_k;
    static long[] field_l;

    final static boolean a(int param0, char param1) {
        int var2 = 0;
        var2 = 97 / ((param0 - -11) / 33);
        if (param1 >= 48) {
          if (param1 > 57) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    public static void a(int param0) {
        if (param0 != -22677) {
            Object var2 = null;
            byte[] discarded$0 = ui.a(false, (Object) null, (byte) -121);
            field_l = null;
            return;
        }
        field_l = null;
    }

    final static byte[] a(boolean param0, Object param1, byte param2) {
        byte[] var3 = null;
        dp var4 = null;
        if (param1 != null) {
          if (!(param1 instanceof byte[])) {
            if (param2 == 37) {
              if (param1 instanceof dp) {
                var4 = (dp) param1;
                return var4.a(-21056);
              } else {
                throw new IllegalArgumentException();
              }
            } else {
              return null;
            }
          } else {
            var3 = (byte[]) param1;
            if (!param0) {
              return var3;
            } else {
              return ch.a(var3, (byte) 115);
            }
          }
        } else {
          return null;
        }
    }

    ui(int param0, int param1) {
        ((ui) this).field_j = param1;
        ((ui) this).field_m = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new long[32];
        field_k = 0;
    }
}
