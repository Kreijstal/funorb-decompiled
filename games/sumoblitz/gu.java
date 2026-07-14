/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gu extends ka {
    private lm field_g;
    private int field_e;
    static String field_h;
    static int field_d;
    private int field_c;
    static int field_j;
    private lr field_i;
    private lr field_k;
    private lr field_f;
    private lr field_l;

    final void b(byte param0) {
        int var2 = 0;
        L0: {
          if (null != ((gu) this).field_i) {
            ((gu) this).field_i.b(16711680);
            break L0;
          } else {
            break L0;
          }
        }
        if (((gu) this).field_k == null) {
          if (((gu) this).field_l == null) {
            var2 = -105 % ((-65 - param0) / 56);
            if (((gu) this).field_f == null) {
              if (((gu) this).field_g != null) {
                ((gu) this).field_g.a(-1);
                return;
              } else {
                return;
              }
            } else {
              ((gu) this).field_f.b(16711680);
              if (((gu) this).field_g != null) {
                ((gu) this).field_g.a(-1);
                return;
              } else {
                return;
              }
            }
          } else {
            ((gu) this).field_l.b(16711680);
            var2 = -105 % ((-65 - param0) / 56);
            if (((gu) this).field_f == null) {
              if (((gu) this).field_g != null) {
                ((gu) this).field_g.a(-1);
                return;
              } else {
                return;
              }
            } else {
              ((gu) this).field_f.b(16711680);
              if (((gu) this).field_g != null) {
                ((gu) this).field_g.a(-1);
                return;
              } else {
                return;
              }
            }
          }
        } else {
          ((gu) this).field_k.b(16711680);
          if (((gu) this).field_l != null) {
            ((gu) this).field_l.b(16711680);
            var2 = -105 % ((-65 - param0) / 56);
            if (((gu) this).field_f != null) {
              ((gu) this).field_f.b(16711680);
              if (((gu) this).field_g != null) {
                ((gu) this).field_g.a(-1);
                return;
              } else {
                return;
              }
            } else {
              if (((gu) this).field_g == null) {
                return;
              } else {
                ((gu) this).field_g.a(-1);
                return;
              }
            }
          } else {
            var2 = -105 % ((-65 - param0) / 56);
            if (((gu) this).field_f == null) {
              if (((gu) this).field_g != null) {
                ((gu) this).field_g.a(-1);
                return;
              } else {
                return;
              }
            } else {
              ((gu) this).field_f.b(16711680);
              if (((gu) this).field_g == null) {
                return;
              } else {
                ((gu) this).field_g.a(-1);
                return;
              }
            }
          }
        }
    }

    gu(aw param0, int param1, int param2, boolean param3, boolean param4) {
        ((gu) this).field_c = param2;
        ((gu) this).field_e = param1;
        if (!param3) {
            // ifeq L58
        }
        ((gu) this).field_i = new lr(te.a(false, ((gu) this).field_e, ((gu) this).field_c));
        if (!param3) {
            // ifeq L103
        }
        ((gu) this).field_k = new lr(om.a(((gu) this).field_c, ((gu) this).field_e, (byte) -50));
        if (!param3) {
            // ifeq L149
        }
        ((gu) this).field_l = new lr(se.a(31, ((gu) this).field_e, ((gu) this).field_c));
        if (!param3) {
            // ifeq L195
        }
        ((gu) this).field_f = new lr(mo.a(((gu) this).field_c, ((gu) this).field_e, 30643));
        if (!param3) {
            // ifeq L241
        }
        ((gu) this).field_g = new lm(qq.b(((gu) this).field_e, ((gu) this).field_c, -126));
    }

    public static void a(boolean param0) {
        field_h = null;
        if (!param0) {
            gu.a(true);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Music: ";
    }
}
