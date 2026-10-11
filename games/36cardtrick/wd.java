/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd {
    static gd field_e;
    static java.math.BigInteger field_c;
    static vg field_b;
    static String field_a;
    static int[] field_d;

    public static void a(boolean param0) {
        field_d = null;
        field_b = null;
        field_c = null;
        if (param0) {
          field_a = null;
          field_e = null;
          return;
        }
        field_b = (vg) null;
        field_a = null;
        field_e = null;
    }

    final static String b(int param0) {
        int var1 = 45 / ((0 - param0) / 42);
        return pk.field_a;
    }

    final static void a(byte param0, int param1, int param2) {
        if (null == ah.field_c ||
          !(param2 <= ah.field_c.length)) {
          ah.field_c = new int[2 * param2];
        }
        if (param0 <= 3) {
          field_e = (gd) null;
        }
        if (null == p.field_n ||
          !(p.field_n.length >= param2)) {
          p.field_n = new int[param2 * 2];
        }
        if (q.field_h == null) {
          q.field_h = new int[2 * param2];
          if (mj.field_b == null ||
            !(mj.field_b.length >= param2)) {
            mj.field_b = new int[param2 * 2];
          }
          if (null == ij.field_c ||
            !(ij.field_c.length >= param2)) {
            ij.field_c = new int[2 * param2];
          }
          if (null == db.field_l ||
            !(param2 <= db.field_l.length)) {
            db.field_l = new int[2 * param2];
          }
          if (re.field_c == null) {
            re.field_c = new int[(param2 + param1) * 2];
            if (null == ma.field_a ||
              !(param2 <= ma.field_a.length)) {
              ma.field_a = new boolean[2 * param2];
            }
          } else {
            if (re.field_c.length >= param2 + param1) {
              if (null == ma.field_a ||
                !(param2 <= ma.field_a.length)) {
                ma.field_a = new boolean[2 * param2];
              }
            } else {
              re.field_c = new int[(param2 + param1) * 2];
              if (null == ma.field_a ||
                !(param2 <= ma.field_a.length)) {
                ma.field_a = new boolean[2 * param2];
              }
            }
          }
        } else {
          if (q.field_h.length < param2) {
            q.field_h = new int[2 * param2];
            if (mj.field_b == null) {
              mj.field_b = new int[param2 * 2];
              if (null == ij.field_c ||
                !(ij.field_c.length >= param2)) {
                ij.field_c = new int[2 * param2];
              }
              if (null == db.field_l ||
                !(param2 <= db.field_l.length)) {
                db.field_l = new int[2 * param2];
              }
              if (re.field_c == null ||
                !(re.field_c.length >= param2 + param1)) {
                re.field_c = new int[(param2 + param1) * 2];
              }
              if (null == ma.field_a ||
                !(param2 <= ma.field_a.length)) {
                ma.field_a = new boolean[2 * param2];
              }
            } else {
              if (mj.field_b.length >= param2) {
                if (null == ij.field_c ||
                  !(ij.field_c.length >= param2)) {
                  ij.field_c = new int[2 * param2];
                }
                if (null == db.field_l ||
                  !(param2 <= db.field_l.length)) {
                  db.field_l = new int[2 * param2];
                }
                if (re.field_c == null ||
                  !(re.field_c.length >= param2 + param1)) {
                  re.field_c = new int[(param2 + param1) * 2];
                }
                if (null == ma.field_a ||
                  !(param2 <= ma.field_a.length)) {
                  ma.field_a = new boolean[2 * param2];
                }
              } else {
                mj.field_b = new int[param2 * 2];
                if (null == ij.field_c ||
                  !(ij.field_c.length >= param2)) {
                  ij.field_c = new int[2 * param2];
                }
                if (null == db.field_l ||
                  !(param2 <= db.field_l.length)) {
                  db.field_l = new int[2 * param2];
                }
                if (re.field_c == null ||
                  !(re.field_c.length >= param2 + param1)) {
                  re.field_c = new int[(param2 + param1) * 2];
                }
                if (null == ma.field_a ||
                  !(param2 <= ma.field_a.length)) {
                  ma.field_a = new boolean[2 * param2];
                }
              }
            }
          } else {
            if (mj.field_b == null) {
              mj.field_b = new int[param2 * 2];
              if (null == ij.field_c ||
                !(ij.field_c.length >= param2)) {
                ij.field_c = new int[2 * param2];
              }
              if (null == db.field_l ||
                !(param2 <= db.field_l.length)) {
                db.field_l = new int[2 * param2];
              }
              if (re.field_c == null) {
                re.field_c = new int[(param2 + param1) * 2];
                if (null == ma.field_a ||
                  !(param2 <= ma.field_a.length)) {
                  ma.field_a = new boolean[2 * param2];
                }
              } else {
                if (re.field_c.length >= param2 + param1) {
                  if (null == ma.field_a ||
                    !(param2 <= ma.field_a.length)) {
                    ma.field_a = new boolean[2 * param2];
                  }
                } else {
                  re.field_c = new int[(param2 + param1) * 2];
                  if (null == ma.field_a ||
                    !(param2 <= ma.field_a.length)) {
                    ma.field_a = new boolean[2 * param2];
                  }
                }
              }
            } else {
              if (mj.field_b.length >= param2) {
                if (null == ij.field_c ||
                  !(ij.field_c.length >= param2)) {
                  ij.field_c = new int[2 * param2];
                }
                if (null == db.field_l ||
                  !(param2 <= db.field_l.length)) {
                  db.field_l = new int[2 * param2];
                }
                if (re.field_c == null) {
                  re.field_c = new int[(param2 + param1) * 2];
                  if (null == ma.field_a ||
                    !(param2 <= ma.field_a.length)) {
                    ma.field_a = new boolean[2 * param2];
                  }
                } else {
                  if (re.field_c.length >= param2 + param1) {
                    if (null == ma.field_a ||
                      !(param2 <= ma.field_a.length)) {
                      ma.field_a = new boolean[2 * param2];
                    }
                  } else {
                    re.field_c = new int[(param2 + param1) * 2];
                    if (null == ma.field_a ||
                      !(param2 <= ma.field_a.length)) {
                      ma.field_a = new boolean[2 * param2];
                    }
                  }
                }
              } else {
                mj.field_b = new int[param2 * 2];
                if (null == ij.field_c ||
                  !(ij.field_c.length >= param2)) {
                  ij.field_c = new int[2 * param2];
                }
                if (null == db.field_l ||
                  !(param2 <= db.field_l.length)) {
                  db.field_l = new int[2 * param2];
                }
                if (re.field_c == null) {
                  re.field_c = new int[(param2 + param1) * 2];
                  if (null == ma.field_a ||
                    !(param2 <= ma.field_a.length)) {
                    ma.field_a = new boolean[2 * param2];
                  }
                } else {
                  if (re.field_c.length >= param2 + param1) {
                    if (null == ma.field_a ||
                      !(param2 <= ma.field_a.length)) {
                      ma.field_a = new boolean[2 * param2];
                    }
                  } else {
                    re.field_c = new int[(param2 + param1) * 2];
                    if (null == ma.field_a ||
                      !(param2 <= ma.field_a.length)) {
                      ma.field_a = new boolean[2 * param2];
                    }
                  }
                }
              }
            }
          }
        }
        fk.field_h = 2147483647;
        mf.field_g = 2147483647;
        ei.field_f = 0;
        ah.field_d = -2147483648;
        bd.field_F = -2147483648;
    }

    final static void a(int param0) {
        if (param0 != 31668) {
          field_e = (gd) null;
          if (cd.field_e == 10) {
            k.c(-128);
            cd.field_e = 11;
            sg.field_b = true;
            return;
          }
          if (!c.b(true)) {
            k.c(-128);
            cd.field_e = 11;
            sg.field_b = true;
            return;
          }
          sg.field_b = true;
          return;
        }
        if (cd.field_e == 10) {
          k.c(-128);
          cd.field_e = 11;
          sg.field_b = true;
          return;
        }
        if (!c.b(true)) {
          k.c(-128);
          cd.field_e = 11;
          sg.field_b = true;
          return;
        }
        sg.field_b = true;
    }

    static {
        field_c = new java.math.BigInteger("65537");
        field_a = "Loading sound effects";
    }
}
