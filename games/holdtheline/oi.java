/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi {
    static hj field_a;
    static int field_b;
    static float[] field_c;
    static boolean field_f;
    static w field_e;
    static byte[] field_d;

    final static int a(byte param0) {
        if (param0 <= 6) {
          oi.a(46, 49);
          return u.field_V;
        }
        return u.field_V;
    }

    final static void a(int param0, int param1) {
        int var2;
        int var3;
        int var3Lifetime1;
        int var3Lifetime2;
        if (param1 != ik.field_i) {
          return;
        }
        var2 = hh.a(91);
        if (var2 == -1) {
          qj.field_I = -1;
          return;
        }
        if (qj.field_I != -1) {
          var3 = var2 >>> 16;
          if (param0 != 1) {
            return;
          }
          var2 = var2 & 65535;
          if (mc.field_b == null) {
            qj.field_I = -1;
          } else {
            if (mc.field_b[var3].length <= var2) {
              qj.field_I = -1;
            } else {
              if (null == mc.field_b[var3][var2]) {
                qj.field_I = -1;
              } else {
                lm.a((byte) -107, mc.field_b[var3][var2]);
              }
            }
          }
          return;
        }
        qj.field_I = 0;
        if (320 > nc.field_g) {
          qj.field_I = qj.field_I | 2;
        }
        if (rf.field_X >= 240) {
          var3Lifetime1 = var2 >>> 16;
          if (param0 != 1) {
            return;
          }
          var2 = var2 & 65535;
          if (mc.field_b == null) {
            qj.field_I = -1;
          } else {
            if (mc.field_b[var3Lifetime1].length <= var2) {
              qj.field_I = -1;
            } else {
              if (null == mc.field_b[var3Lifetime1][var2]) {
                qj.field_I = -1;
              } else {
                lm.a((byte) -107, mc.field_b[var3Lifetime1][var2]);
              }
            }
          }
          return;
        }
        qj.field_I = qj.field_I | 1;
        var3Lifetime2 = var2 >>> 16;
        if (param0 != 1) {
          return;
        }
        var2 = var2 & 65535;
        if (mc.field_b == null) {
          qj.field_I = -1;
        } else {
          if (mc.field_b[var3Lifetime2].length <= var2) {
            qj.field_I = -1;
          } else {
            if (null == mc.field_b[var3Lifetime2][var2]) {
              qj.field_I = -1;
            } else {
              lm.a((byte) -107, mc.field_b[var3Lifetime2][var2]);
            }
          }
        }
        return;
    }

    public static void b(byte param0) {
        if (param0 != 114) {
          return;
        }
        field_e = null;
        field_a = null;
        field_d = null;
        field_c = null;
    }

    static {
        field_c = new float[]{1.0f, 1.100000023841858f, 1.2000000476837158f, 1.5f};
        field_f = false;
        field_d = new byte[520];
    }
}
