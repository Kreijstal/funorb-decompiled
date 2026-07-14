/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc {
    private boolean field_b;
    static int[] field_i;
    static ak field_g;
    private String field_f;
    static byte[][] field_e;
    static ob field_h;
    static mo field_d;
    static String field_a;
    static String field_c;

    final String a(int param0) {
        if (param0 != -30491) {
            field_c = null;
            return ((sc) this).field_f;
        }
        return ((sc) this).field_f;
    }

    final static boolean b(int param0) {
        if (param0 != -10093) {
            boolean discarded$6 = sc.b(-27);
            return he.field_f != null ? true : false;
        }
        return he.field_f != null ? true : false;
    }

    final static String c(int param0) {
        if ((hf.field_q ^ -1) > -3) {
          return td.field_d;
        } else {
          if (null != hn.field_e) {
            if (!hn.field_e.b(param0 ^ -16421)) {
              return hm.field_a;
            } else {
              return wa.field_a;
            }
          } else {
            if (!wk.field_j.b(-3)) {
              return im.field_Mb;
            } else {
              if (wk.field_j.a("commonui", -1)) {
                if (!io.field_g.b(param0 ^ -16421)) {
                  return ha.field_f;
                } else {
                  if (!io.field_g.a("commonui", -1)) {
                    return pc.field_x + " - " + io.field_g.c(param0 ^ 16463, "commonui") + "%";
                  } else {
                    if (!qo.field_u.b(-3)) {
                      return jd.field_p;
                    } else {
                      if (param0 == 16422) {
                        if (!qo.field_u.a((byte) 92)) {
                          return em.field_a + " - " + qo.field_u.c(0) + "%";
                        } else {
                          return wd.field_b;
                        }
                      } else {
                        boolean discarded$1 = sc.b(34);
                        if (!qo.field_u.a((byte) 92)) {
                          return em.field_a + " - " + qo.field_u.c(0) + "%";
                        } else {
                          return wd.field_b;
                        }
                      }
                    }
                  }
                }
              } else {
                return g.field_q + " - " + wk.field_j.c(119, "commonui") + "%";
              }
            }
          }
        }
    }

    sc(String param0) {
        this(param0, false);
    }

    sc(String param0, boolean param1) {
        ((sc) this).field_f = param0;
        if (null == ((sc) this).field_f) {
            ((sc) this).field_f = "";
        }
        ((sc) this).field_b = param1 ? true : false;
        if (((sc) this).field_f.length() == 0) {
            ((sc) this).field_b = false;
        }
    }

    final boolean b(byte param0) {
        int var2 = -65 / ((59 - param0) / 43);
        return ((sc) this).field_b;
    }

    public static void a(byte param0) {
        field_a = null;
        field_h = null;
        field_c = null;
        field_g = null;
        field_i = null;
        if (param0 >= -14) {
          field_g = null;
          field_e = null;
          field_d = null;
          return;
        } else {
          field_e = null;
          field_d = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new byte[1000][];
        field_i = new int[128];
        field_c = "Accept rematch";
    }
}
