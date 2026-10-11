/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tk extends gb {
    boolean field_q;
    volatile boolean field_w;
    static gf field_u;
    static ud field_t;
    static String field_s;
    boolean field_v;
    static String field_r;
    static char[] field_o;
    static mg[] field_p;

    abstract byte[] g(int param0);

    public static void f(int param0) {
        field_t = null;
        if (param0 > 13) {
          field_o = null;
          field_u = null;
          field_r = null;
          field_p = null;
          field_s = null;
          return;
        }
        tk.f(103);
        field_o = null;
        field_u = null;
        field_r = null;
        field_p = null;
        field_s = null;
    }

    abstract int a(byte param0);

    final static void a(int param0, int param1, int param2) {
        if (null == ti.field_j ||
          !(ti.field_j.length >= param0)) {
          ti.field_j = new int[param0 * 2];
        }
        if (g.field_u == null) {
          g.field_u = new int[2 * param0];
          if (ii.field_q == null ||
            !(ii.field_q.length >= param0)) {
            ii.field_q = new int[2 * param0];
          }
          if (null == qf.field_a ||
            !(qf.field_a.length >= param0)) {
            qf.field_a = new int[param0 * 2];
          }
          if (qi.field_b == null ||
            !(param0 <= qi.field_b.length)) {
            qi.field_b = new int[param0 * 2];
          }
          if (null == va.field_e ||
            !(va.field_e.length >= param0)) {
            va.field_e = new int[2 * param0];
          }
          if (null == lf.field_Y ||
            !(lf.field_Y.length >= param0 + param2)) {
            lf.field_Y = new int[2 * (param2 + param0)];
          }
          if (param1 == -14032) {
            if (dc.field_r == null ||
              !(dc.field_r.length >= param0)) {
              dc.field_r = new boolean[param0 * 2];
            }
          } else {
            field_p = (mg[]) null;
            if (dc.field_r == null ||
              !(dc.field_r.length >= param0)) {
              dc.field_r = new boolean[param0 * 2];
            }
          }
        } else {
          if (g.field_u.length < param0) {
            g.field_u = new int[2 * param0];
            if (ii.field_q == null ||
              !(ii.field_q.length >= param0)) {
              ii.field_q = new int[2 * param0];
            }
            if (null == qf.field_a ||
              !(qf.field_a.length >= param0)) {
              qf.field_a = new int[param0 * 2];
            }
            if (qi.field_b == null ||
              !(param0 <= qi.field_b.length)) {
              qi.field_b = new int[param0 * 2];
            }
            if (null == va.field_e ||
              !(va.field_e.length >= param0)) {
              va.field_e = new int[2 * param0];
            }
            if (null == lf.field_Y) {
              lf.field_Y = new int[2 * (param2 + param0)];
              if (param1 != -14032) {
                field_p = (mg[]) null;
              }
              if (dc.field_r == null ||
                !(dc.field_r.length >= param0)) {
                dc.field_r = new boolean[param0 * 2];
              }
            } else {
              if (lf.field_Y.length < param0 + param2) {
                lf.field_Y = new int[2 * (param2 + param0)];
                if (param1 != -14032) {
                  field_p = (mg[]) null;
                }
                if (dc.field_r == null ||
                  !(dc.field_r.length >= param0)) {
                  dc.field_r = new boolean[param0 * 2];
                }
              } else {
                if (param1 == -14032) {
                  if (dc.field_r == null ||
                    !(dc.field_r.length >= param0)) {
                    dc.field_r = new boolean[param0 * 2];
                  }
                } else {
                  field_p = (mg[]) null;
                  if (dc.field_r == null ||
                    !(dc.field_r.length >= param0)) {
                    dc.field_r = new boolean[param0 * 2];
                  }
                }
              }
            }
          } else {
            if (ii.field_q == null ||
              !(ii.field_q.length >= param0)) {
              ii.field_q = new int[2 * param0];
            }
            if (null == qf.field_a) {
              qf.field_a = new int[param0 * 2];
              if (qi.field_b == null ||
                !(param0 <= qi.field_b.length)) {
                qi.field_b = new int[param0 * 2];
              }
              if (null == va.field_e ||
                !(va.field_e.length >= param0)) {
                va.field_e = new int[2 * param0];
              }
              if (null == lf.field_Y ||
                !(lf.field_Y.length >= param0 + param2)) {
                lf.field_Y = new int[2 * (param2 + param0)];
              }
              if (param1 != -14032) {
                field_p = (mg[]) null;
              }
              if (dc.field_r == null ||
                !(dc.field_r.length >= param0)) {
                dc.field_r = new boolean[param0 * 2];
              }
            } else {
              if (qf.field_a.length >= param0) {
                if (qi.field_b == null ||
                  !(param0 <= qi.field_b.length)) {
                  qi.field_b = new int[param0 * 2];
                }
                if (null == va.field_e ||
                  !(va.field_e.length >= param0)) {
                  va.field_e = new int[2 * param0];
                }
                if (null == lf.field_Y ||
                  !(lf.field_Y.length >= param0 + param2)) {
                  lf.field_Y = new int[2 * (param2 + param0)];
                }
                if (param1 != -14032) {
                  field_p = (mg[]) null;
                }
                if (dc.field_r == null ||
                  !(dc.field_r.length >= param0)) {
                  dc.field_r = new boolean[param0 * 2];
                }
              } else {
                qf.field_a = new int[param0 * 2];
                if (qi.field_b == null ||
                  !(param0 <= qi.field_b.length)) {
                  qi.field_b = new int[param0 * 2];
                }
                if (null == va.field_e ||
                  !(va.field_e.length >= param0)) {
                  va.field_e = new int[2 * param0];
                }
                if (null == lf.field_Y ||
                  !(lf.field_Y.length >= param0 + param2)) {
                  lf.field_Y = new int[2 * (param2 + param0)];
                }
                if (param1 != -14032) {
                  field_p = (mg[]) null;
                }
                if (dc.field_r == null ||
                  !(dc.field_r.length >= param0)) {
                  dc.field_r = new boolean[param0 * 2];
                }
              }
            }
          }
        }
        vi.field_d = -2147483648;
        oe.field_c = 0;
        fj.field_U = 2147483647;
        sd.field_b = -2147483648;
        mj.field_d = 2147483647;
    }

    tk() {
        this.field_w = true;
    }

    static {
        field_u = null;
        field_s = "Account created successfully!";
        field_t = new ud();
        field_o = new char[128];
        field_r = null;
        field_p = new mg[17];
    }
}
