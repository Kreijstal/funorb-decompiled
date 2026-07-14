/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl {
    static String field_c;
    static float field_a;
    int field_d;
    static String field_b;

    final static int a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = TombRacer.field_G ? 1 : 0;
        if (param0 == 64) {
          if (cm.field_a == null) {
            return -1;
          } else {
            var1 = 0;
            L0: while (true) {
              if (cm.field_a.length > var1) {
                if (!cm.field_a[var1].a((byte) -47)) {
                  var1++;
                  continue L0;
                } else {
                  return var1;
                }
              } else {
                return -1;
              }
            }
          }
        } else {
          pl.a(-48);
          if (cm.field_a == null) {
            return -1;
          } else {
            var1 = 0;
            L1: while (true) {
              if (cm.field_a.length > var1) {
                if (!cm.field_a[var1].a((byte) -47)) {
                  var1++;
                  continue L1;
                } else {
                  return var1;
                }
              } else {
                return -1;
              }
            }
          }
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    pl(int param0) {
        ((pl) this).field_d = param0;
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        if (param0 != 0) {
            field_a = 0.024353690445423126f;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Suggest muting this player";
        field_b = "Instructions";
    }
}
