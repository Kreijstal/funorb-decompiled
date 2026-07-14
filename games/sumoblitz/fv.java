/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fv extends rw {
    static float[] field_v;
    static mi field_y;
    int field_x;
    fs field_w;
    byte field_z;

    public static void d(byte param0) {
        field_y = null;
        field_v = null;
        if (param0 != 62) {
            Object var2 = null;
            fv.a(-52, (ki) null, (ki) null);
        }
    }

    final int a(int param0) {
        if (!(((fv) this).field_w != null)) {
            return 0;
        }
        if (param0 != -1) {
            return 50;
        }
        return 100 * ((fv) this).field_w.field_p / (-((fv) this).field_z + ((fv) this).field_w.field_n.length);
    }

    final static void a(int param0, ki param1, ki param2) {
        if (param0 != 7966) {
            fv.d((byte) 80);
        }
    }

    final static void e(byte param0) {
        int var1 = 0;
        dj var2 = null;
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        wd.field_f.b();
        var1 = -111 % ((param0 - -34) / 35);
        iv.field_a.b();
        vf.field_b = vf.field_b - 1;
        if ((vf.field_b ^ -1) == -1) {
          vf.field_b = 200;
          var2 = (dj) (Object) jf.field_c.b(107);
          L0: while (true) {
            if (var2 == null) {
              L1: {
                if (s.field_u == null) {
                  break L1;
                } else {
                  var2 = (dj) (Object) s.field_u.b(-105);
                  L2: while (true) {
                    if (var2 == null) {
                      break L1;
                    } else {
                      if (var2.field_k.a(false)) {
                        var2 = (dj) (Object) s.field_u.d((byte) 18);
                        continue L2;
                      } else {
                        var2.b(false);
                        var2 = (dj) (Object) s.field_u.d((byte) 18);
                        continue L2;
                      }
                    }
                  }
                }
              }
              L3: {
                if (qc.field_e == null) {
                  break L3;
                } else {
                  if (qc.field_e.c(-8192)) {
                    break L3;
                  } else {
                    nd.field_B = null;
                    return;
                  }
                }
              }
              return;
            } else {
              if (var2.field_k.a(false)) {
                var2 = (dj) (Object) jf.field_c.d((byte) 18);
                continue L0;
              } else {
                var2.b(false);
                var2 = (dj) (Object) jf.field_c.d((byte) 18);
                continue L0;
              }
            }
          }
        } else {
          if (qc.field_e != null) {
            if (!qc.field_e.c(-8192)) {
              nd.field_B = null;
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final byte[] d(boolean param0) {
        if (!param0) {
          if (((fv) this).field_u) {
            throw new RuntimeException();
          } else {
            if (-((fv) this).field_z + ((fv) this).field_w.field_n.length <= ((fv) this).field_w.field_p) {
              return ((fv) this).field_w.field_n;
            } else {
              throw new RuntimeException();
            }
          }
        } else {
          return null;
        }
    }

    fv() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = new float[4];
        field_y = new mi();
        nn.b(50, -120);
    }
}
