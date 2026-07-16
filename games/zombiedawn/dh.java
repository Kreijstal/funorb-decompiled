/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dh {
    static long field_b;
    int[] field_c;
    java.awt.Image field_f;
    int field_a;
    static de field_e;
    static String field_g;
    int field_d;

    abstract void a(java.awt.Graphics param0, int param1, int param2, byte param3);

    final void b(int param0) {
        int var2 = -12 % ((param0 - -53) / 62);
        bi.a(((dh) this).field_c, ((dh) this).field_d, ((dh) this).field_a);
    }

    abstract void a(int param0, int param1, java.awt.Component param2, int param3);

    final static void c(int param0) {
        int var2 = 0;
        var2 = ZombieDawn.field_J;
        if (param0 != 256) {
          field_e = null;
          if (rc.field_p != f.field_k) {
            if (rc.field_p == bg.field_k) {
              if (!po.w(13296)) {
                if (null == sc.field_c) {
                  sl.a((byte) 47);
                  if (hp.field_C) {
                    hp.field_C = false;
                    cn.a(false, false);
                    rc.field_p = bb.field_f;
                    return;
                  } else {
                    rc.field_p = bb.field_f;
                    return;
                  }
                } else {
                  gm.a(sc.field_c, (byte) 110, 3);
                  sl.a((byte) 47);
                  if (!hp.field_C) {
                    rc.field_p = bb.field_f;
                    return;
                  } else {
                    hp.field_C = false;
                    cn.a(false, false);
                    rc.field_p = bb.field_f;
                    return;
                  }
                }
              } else {
                rc.field_p = bb.field_f;
                return;
              }
            } else {
              if (bb.field_f == rc.field_p) {
                int fieldTemp$4 = ln.field_b;
                ln.field_b = ln.field_b - 1;
                if (0 < fieldTemp$4) {
                  return;
                } else {
                  rc.field_p = rc.field_x;
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            int fieldTemp$5 = ln.field_b;
            ln.field_b = ln.field_b + 1;
            if (fieldTemp$5 >= 16) {
              if (sc.field_a) {
                td.a(112);
                rc.field_p = bg.field_k;
                return;
              } else {
                cc.d(0);
                rc.field_p = bg.field_k;
                return;
              }
            } else {
              return;
            }
          }
        } else {
          if (rc.field_p != f.field_k) {
            if (rc.field_p == bg.field_k) {
              if (!po.w(13296)) {
                if (null == sc.field_c) {
                  sl.a((byte) 47);
                  if (hp.field_C) {
                    hp.field_C = false;
                    cn.a(false, false);
                    rc.field_p = bb.field_f;
                    return;
                  } else {
                    rc.field_p = bb.field_f;
                    return;
                  }
                } else {
                  gm.a(sc.field_c, (byte) 110, 3);
                  sl.a((byte) 47);
                  if (!hp.field_C) {
                    rc.field_p = bb.field_f;
                    return;
                  } else {
                    hp.field_C = false;
                    cn.a(false, false);
                    rc.field_p = bb.field_f;
                    return;
                  }
                }
              } else {
                rc.field_p = bb.field_f;
                return;
              }
            } else {
              if (bb.field_f == rc.field_p) {
                int fieldTemp$6 = ln.field_b;
                ln.field_b = ln.field_b - 1;
                if (0 < fieldTemp$6) {
                  return;
                } else {
                  rc.field_p = rc.field_x;
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            int fieldTemp$7 = ln.field_b;
            ln.field_b = ln.field_b + 1;
            if (fieldTemp$7 >= 16) {
              if (sc.field_a) {
                td.a(112);
                rc.field_p = bg.field_k;
                return;
              } else {
                cc.d(0);
                rc.field_p = bg.field_k;
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 != 16) {
            dh.c(-103);
            field_g = null;
            return;
        }
        field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new de(256);
        field_g = "Unpacking graphics";
    }
}
