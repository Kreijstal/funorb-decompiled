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
        int var2 = 0;
        int var3 = 0;
        if (param1 != ik.field_i) {
          return;
        } else {
          var2 = hh.a(91);
          if (0 != (var2 ^ -1)) {
            if (0 == (qj.field_I ^ -1)) {
              L0: {
                qj.field_I = 0;
                if (320 > nc.field_g) {
                  qj.field_I = qj.field_I | 2;
                  break L0;
                } else {
                  break L0;
                }
              }
              if (-241 < (rf.field_X ^ -1)) {
                qj.field_I = qj.field_I | 1;
                var3 = var2 >>> 1665360816;
                if (param0 == 1) {
                  var2 = var2 & 65535;
                  if (mc.field_b != null) {
                    if (mc.field_b[var3].length > var2) {
                      if (null == mc.field_b[var3][var2]) {
                        qj.field_I = -1;
                        return;
                      } else {
                        lm.a((byte) -107, mc.field_b[var3][var2]);
                        return;
                      }
                    } else {
                      qj.field_I = -1;
                      return;
                    }
                  } else {
                    qj.field_I = -1;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                var3 = var2 >>> 1665360816;
                if (param0 == 1) {
                  var2 = var2 & 65535;
                  if (mc.field_b != null) {
                    if (mc.field_b[var3].length > var2) {
                      if (null == mc.field_b[var3][var2]) {
                        qj.field_I = -1;
                        return;
                      } else {
                        lm.a((byte) -107, mc.field_b[var3][var2]);
                        return;
                      }
                    } else {
                      qj.field_I = -1;
                      return;
                    }
                  } else {
                    qj.field_I = -1;
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              var3 = var2 >>> 1665360816;
              if (param0 == 1) {
                var2 = var2 & 65535;
                if (mc.field_b != null) {
                  if (mc.field_b[var3].length > var2) {
                    if (null == mc.field_b[var3][var2]) {
                      qj.field_I = -1;
                      return;
                    } else {
                      lm.a((byte) -107, mc.field_b[var3][var2]);
                      return;
                    }
                  } else {
                    qj.field_I = -1;
                    return;
                  }
                } else {
                  qj.field_I = -1;
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            qj.field_I = -1;
            return;
          }
        }
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
