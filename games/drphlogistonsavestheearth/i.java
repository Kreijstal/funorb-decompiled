/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i {
    static bb field_b;
    static int field_a;
    static int[] field_c;

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        if (param0 < -54) {
            return;
        }
        field_b = null;
    }

    final static void a(od param0, od param1, java.math.BigInteger param2, java.math.BigInteger param3, int param4) {
        hb.a(param1.field_h, param3, param2, (byte) -41, param1.field_j, param4, param0);
    }

    final static void a(int param0, int param1) {
        gi var2 = null;
        int var3 = 0;
        je var4 = null;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var4 = (je) (Object) aa.field_e.h(-11151);
        if (param1 != 0) {
          field_c = null;
          L0: while (true) {
            if (var4 == null) {
              var2 = ql.field_i.h(-11151);
              L1: while (true) {
                if (var2 != null) {
                  bj.a(param1 ^ 2591, param0);
                  var2 = ql.field_i.e(0);
                  continue L1;
                } else {
                  return;
                }
              }
            } else {
              hl.a(var4, 122, param0);
              var4 = (je) (Object) aa.field_e.e(param1 ^ 0);
              continue L0;
            }
          }
        } else {
          L2: while (true) {
            if (var4 == null) {
              var2 = ql.field_i.h(-11151);
              L3: while (true) {
                if (var2 != null) {
                  bj.a(param1 ^ 2591, param0);
                  var2 = ql.field_i.e(0);
                  continue L3;
                } else {
                  return;
                }
              }
            } else {
              hl.a(var4, 122, param0);
              var4 = (je) (Object) aa.field_e.e(param1 ^ 0);
              continue L2;
            }
          }
        }
    }

    final static Class a(int param0, String param1) throws ClassNotFoundException {
        if (!(!param1.equals((Object) (Object) "B"))) {
            return Byte.TYPE;
        }
        if (param1.equals((Object) (Object) "I")) {
            return Integer.TYPE;
        }
        if (param1.equals((Object) (Object) "S")) {
            return Short.TYPE;
        }
        if (!(!param1.equals((Object) (Object) "J"))) {
            return Long.TYPE;
        }
        if (param1.equals((Object) (Object) "Z")) {
            return Boolean.TYPE;
        }
        if (param0 != -32512) {
            Object var3 = null;
            i.a((od) null, (od) null, (java.math.BigInteger) null, (java.math.BigInteger) null, -76);
            if (!(!param1.equals((Object) (Object) "F"))) {
                return Float.TYPE;
            }
            if (param1.equals((Object) (Object) "D")) {
                return Double.TYPE;
            }
            if (param1.equals((Object) (Object) "C")) {
                return Character.TYPE;
            }
            return Class.forName(param1);
        }
        if (!(!param1.equals((Object) (Object) "F"))) {
            return Float.TYPE;
        }
        if (param1.equals((Object) (Object) "D")) {
            return Double.TYPE;
        }
        if (param1.equals((Object) (Object) "C")) {
            return Character.TYPE;
        }
        return Class.forName(param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_b = new bb();
        field_c = new int[64];
    }
}
