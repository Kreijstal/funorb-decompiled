/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l extends nm {
    static wp field_m;
    int field_i;
    kl field_j;
    static volatile int field_l;
    static String field_k;
    nm field_n;

    final static void a(int param0, int param1, pb param2, int param3, int param4, jp param5) {
        fc.a(-89, param2.field_p);
        la.a(param5, (-param5.field_x + param2.field_i) / 2, -param5.field_z + (param0 - -param2.field_q), ab.field_C[param3]);
        sc.b(-95);
        if (param1 != 26746) {
            Object var7 = null;
            l.a(-125, 69, (pb) null, 30, 70, (jp) null);
        }
    }

    final static oh a(int param0) {
        if (ik.field_g == ej.field_P) {
          throw new IllegalStateException();
        } else {
          if (ik.field_g != up.field_v) {
            if (param0 > 17) {
              return null;
            } else {
              return null;
            }
          } else {
            ik.field_g = ej.field_P;
            return ni.field_Rb;
          }
        }
    }

    public static void a(byte param0) {
        field_m = null;
        if (param0 <= 22) {
            field_m = null;
            field_k = null;
            return;
        }
        field_k = null;
    }

    final static String a(byte param0, String param1, int param2) {
        if (1 != param2) {
          if (-3 != (param2 ^ -1)) {
            if (param2 == -4) {
              return rd.a(ug.field_K, new String[1], (byte) 103);
            } else {
              if (-5 == param2) {
                return rd.a(fi.field_v, new String[1], (byte) 103);
              } else {
                if (5 == param2) {
                  return rd.a(on.field_z, new String[1], (byte) 103);
                } else {
                  if ((param2 ^ -1) != -7) {
                    if (param2 != 7) {
                      if (8 == param2) {
                        return rd.a(of.field_h, new String[1], (byte) 103);
                      } else {
                        if (param0 == -110) {
                          if (-12 == param2) {
                            return rd.a(rd.field_c, new String[1], (byte) 103);
                          } else {
                            if (-13 != param2) {
                              if (param2 == 13) {
                                return rd.a(gr.field_b, new String[1], (byte) 103);
                              } else {
                                return null;
                              }
                            } else {
                              return rd.a(nc.field_f, new String[1], (byte) 103);
                            }
                          }
                        } else {
                          field_k = null;
                          if (-12 == param2) {
                            return rd.a(rd.field_c, new String[1], (byte) 103);
                          } else {
                            if (-13 != param2) {
                              if (param2 == 13) {
                                return rd.a(gr.field_b, new String[1], (byte) 103);
                              } else {
                                return null;
                              }
                            } else {
                              return rd.a(nc.field_f, new String[1], (byte) 103);
                            }
                          }
                        }
                      }
                    } else {
                      return rd.a(bm.field_e, new String[1], (byte) 103);
                    }
                  } else {
                    return rd.a(mn.field_B, new String[1], (byte) 103);
                  }
                }
              }
            }
          } else {
            return rd.a(md.field_w, new String[1], (byte) 103);
          }
        } else {
          return rd.a(lm.field_d, new String[1], (byte) 103);
        }
    }

    l(kl param0, nm param1) {
        ((l) this).field_j = param0;
        ((l) this).field_i = param0.g();
        ((l) this).field_n = param1;
        ((l) this).field_j.e(128 + ((l) this).field_i * ki.field_d >> 1795432296);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = 0;
        field_k = "Password is valid";
    }
}
