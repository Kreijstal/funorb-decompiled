/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vk {
    static int field_a;
    static qi field_b;
    static dm[] field_e;
    static hi field_d;
    static int[] field_c;

    abstract void a(java.awt.Component param0, byte param1);

    abstract void a(int param0, java.awt.Component param1);

    abstract int a(boolean param0);

    final static byte[] a(byte[] param0, pk param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Geoblox.field_C;
        var4 = param1.e((byte) -17, param2);
        if (var4 != 0) {
          if (param0 == null) {
            param0 = new byte[var4];
            var5 = param1.e((byte) -17, 3);
            var6 = (byte)param1.e((byte) -17, param3);
            if (0 >= var5) {
              var7 = 0;
              L0: while (true) {
                if (var4 > var7) {
                  param0[var7] = (byte)var6;
                  var7++;
                  continue L0;
                } else {
                  return param0;
                }
              }
            } else {
              var7 = 0;
              L1: while (true) {
                if (var4 > var7) {
                  param0[var7] = (byte)(param1.e((byte) -17, var5) + var6);
                  var7++;
                  continue L1;
                } else {
                  return param0;
                }
              }
            }
          } else {
            if (param0.length == var4) {
              var5 = param1.e((byte) -17, 3);
              var6 = (byte)param1.e((byte) -17, param3);
              if (0 >= var5) {
                var7 = 0;
                L2: while (true) {
                  if (var4 > var7) {
                    param0[var7] = (byte)var6;
                    var7++;
                    continue L2;
                  } else {
                    return param0;
                  }
                }
              } else {
                var7 = 0;
                L3: while (true) {
                  if (var4 > var7) {
                    param0[var7] = (byte)(param1.e((byte) -17, var5) + var6);
                    var7++;
                    continue L3;
                  } else {
                    return param0;
                  }
                }
              }
            } else {
              param0 = new byte[var4];
              var5 = param1.e((byte) -17, 3);
              var6 = (byte)param1.e((byte) -17, param3);
              if (0 >= var5) {
                var7 = 0;
                L4: while (true) {
                  if (var4 > var7) {
                    param0[var7] = (byte)var6;
                    var7++;
                    continue L4;
                  } else {
                    return param0;
                  }
                }
              } else {
                var7 = 0;
                L5: while (true) {
                  if (var4 > var7) {
                    param0[var7] = (byte)(param1.e((byte) -17, var5) + var6);
                    var7++;
                    continue L5;
                  } else {
                    return param0;
                  }
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_e = null;
        field_b = null;
        if (param0 >= -9) {
            return;
        }
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[8192];
    }
}
