/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg {
    static ro field_a;
    static qr field_b;
    static int[] field_c;

    final boolean a(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 > 14) {
          L0: {
            L1: {
              if (this == (Object) (Object) ti.field_d) {
                break L1;
              } else {
                if ((Object) (Object) sh.field_c == this) {
                  break L1;
                } else {
                  if (this != (Object) (Object) ih.field_f) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            stackOut_6_0 = 1;
            stackIn_8_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return true;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static ro a(String param0, byte param1) {
        int var5 = 0;
        String var6_ref_String = null;
        ro var7 = null;
        int var8 = ShatteredPlansClient.field_F ? 1 : 0;
        int var2 = param0.length();
        if (!(-1 != (var2 ^ -1))) {
            return field_a;
        }
        if ((var2 ^ -1) < -256) {
            return cm.field_e;
        }
        String[] var3 = so.a(param0, '.', -92);
        if (!((var3.length ^ -1) <= -3)) {
            return field_a;
        }
        String[] var4 = var3;
        for (var5 = 0; var5 < var4.length; var5++) {
            var6_ref_String = var4[var5];
            var7 = w.a((byte) -94, var6_ref_String);
            if (!(var7 == null)) {
                return var7;
            }
        }
        int var6 = 15 / ((55 - param1) / 53);
        return oq.a(var3[var3.length - 1], false);
    }

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0 < 123) {
            field_b = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ro();
    }
}
