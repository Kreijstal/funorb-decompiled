/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class aa {
    static int field_c;
    static String field_b;
    static nh field_d;
    static String field_a;

    final static byte[] a(se param0, byte[] param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = OrbDefence.field_D ? 1 : 0;
        var4 = param0.h(param2, 8);
        if (-1 != (var4 ^ -1)) {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length != var4) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            param1 = new byte[var4];
            break L0;
          }
          L2: {
            if (param3 == 20783) {
              break L2;
            } else {
              field_b = null;
              break L2;
            }
          }
          L3: {
            var5 = param0.h(3, 8);
            var6 = (byte)param0.h(8, param3 ^ 20775);
            if (var5 <= 0) {
              var7 = 0;
              L4: while (true) {
                if (var4 <= var7) {
                  break L3;
                } else {
                  param1[var7] = (byte)var6;
                  var7++;
                  continue L4;
                }
              }
            } else {
              var7 = 0;
              L5: while (true) {
                if (var7 >= var4) {
                  break L3;
                } else {
                  param1[var7] = (byte)(param0.h(var5, 8) + var6);
                  var7++;
                  continue L5;
                }
              }
            }
          }
          return param1;
        } else {
          return null;
        }
    }

    abstract void b(int param0);

    abstract int a(int param0, long param1);

    abstract long a(int param0);

    public static void a(byte param0) {
        field_d = null;
        field_a = null;
        if (param0 > -13) {
            aa.a((byte) 34);
        }
        field_b = null;
    }

    final int b(int param0, long param1) {
        long var4 = ((aa) this).a(17990);
        if (!((var4 ^ -1L) >= -1L)) {
            hb.a(var4, param0 + 108);
        }
        if (param0 != 0) {
            field_b = null;
        }
        return ((aa) this).a(param0 ^ -21342, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Members' Benefits";
        field_a = "You must build in an empty gridded area";
    }
}
