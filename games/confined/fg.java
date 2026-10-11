/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg extends eh {
    static String field_nb;
    static bi field_mb;
    String field_ob;
    int field_lb;
    String field_kb;
    static String field_pb;

    public static void f(int param0) {
        field_pb = null;
        if (param0 != 11148) {
          field_nb = (String) null;
          field_nb = null;
          field_mb = null;
          return;
        }
        field_nb = null;
        field_mb = null;
    }

    final static void a(int param0, int param1, byte param2) {
        int var3;
        if (null == ci.field_a ||
          !(ci.field_a.length >= param1)) {
          ci.field_a = new int[param1 * 2];
        }
        if (null == an.field_n) {
          an.field_n = new int[2 * param1];
          if (am.field_I == null ||
            !(am.field_I.length >= param1)) {
            am.field_I = new int[param1 * 2];
          }
          var3 = -12 % ((param2 - 28) / 35);
          if (null == em.field_b ||
            !(em.field_b.length >= param1)) {
            em.field_b = new int[2 * param1];
          }
          if (oc.field_m == null ||
            !(oc.field_m.length >= param1)) {
            oc.field_m = new int[2 * param1];
          }
          if (null == ik.field_cb ||
            !(ik.field_cb.length >= param1)) {
            ik.field_cb = new int[param1 * 2];
          }
          if (sj.field_rb == null ||
            !(param0 + param1 <= sj.field_rb.length)) {
            sj.field_rb = new int[2 * (param1 + param0)];
          }
          if (null == ua.field_a ||
            !(param1 <= ua.field_a.length)) {
            ua.field_a = new boolean[2 * param1];
          }
        } else {
          if (param1 > an.field_n.length) {
            an.field_n = new int[2 * param1];
            if (am.field_I == null ||
              !(am.field_I.length >= param1)) {
              am.field_I = new int[param1 * 2];
            }
            var3 = -12 % ((param2 - 28) / 35);
            if (null == em.field_b ||
              !(em.field_b.length >= param1)) {
              em.field_b = new int[2 * param1];
            }
            if (oc.field_m == null) {
              oc.field_m = new int[2 * param1];
              if (null == ik.field_cb ||
                !(ik.field_cb.length >= param1)) {
                ik.field_cb = new int[param1 * 2];
              }
              if (sj.field_rb == null ||
                !(param0 + param1 <= sj.field_rb.length)) {
                sj.field_rb = new int[2 * (param1 + param0)];
              }
              if (null == ua.field_a ||
                !(param1 <= ua.field_a.length)) {
                ua.field_a = new boolean[2 * param1];
              }
            } else {
              if (oc.field_m.length >= param1) {
                if (null == ik.field_cb ||
                  !(ik.field_cb.length >= param1)) {
                  ik.field_cb = new int[param1 * 2];
                }
                if (sj.field_rb == null ||
                  !(param0 + param1 <= sj.field_rb.length)) {
                  sj.field_rb = new int[2 * (param1 + param0)];
                }
                if (null == ua.field_a ||
                  !(param1 <= ua.field_a.length)) {
                  ua.field_a = new boolean[2 * param1];
                }
              } else {
                oc.field_m = new int[2 * param1];
                if (null == ik.field_cb ||
                  !(ik.field_cb.length >= param1)) {
                  ik.field_cb = new int[param1 * 2];
                }
                if (sj.field_rb == null ||
                  !(param0 + param1 <= sj.field_rb.length)) {
                  sj.field_rb = new int[2 * (param1 + param0)];
                }
                if (null == ua.field_a ||
                  !(param1 <= ua.field_a.length)) {
                  ua.field_a = new boolean[2 * param1];
                }
              }
            }
          } else {
            if (am.field_I == null) {
              am.field_I = new int[param1 * 2];
              var3 = -12 % ((param2 - 28) / 35);
              if (null == em.field_b ||
                !(em.field_b.length >= param1)) {
                em.field_b = new int[2 * param1];
              }
              if (oc.field_m == null) {
                oc.field_m = new int[2 * param1];
                if (null == ik.field_cb ||
                  !(ik.field_cb.length >= param1)) {
                  ik.field_cb = new int[param1 * 2];
                }
                if (sj.field_rb == null ||
                  !(param0 + param1 <= sj.field_rb.length)) {
                  sj.field_rb = new int[2 * (param1 + param0)];
                }
                if (null == ua.field_a ||
                  !(param1 <= ua.field_a.length)) {
                  ua.field_a = new boolean[2 * param1];
                }
              } else {
                if (oc.field_m.length >= param1) {
                  if (null == ik.field_cb ||
                    !(ik.field_cb.length >= param1)) {
                    ik.field_cb = new int[param1 * 2];
                  }
                  if (sj.field_rb == null ||
                    !(param0 + param1 <= sj.field_rb.length)) {
                    sj.field_rb = new int[2 * (param1 + param0)];
                  }
                  if (null == ua.field_a ||
                    !(param1 <= ua.field_a.length)) {
                    ua.field_a = new boolean[2 * param1];
                  }
                } else {
                  oc.field_m = new int[2 * param1];
                  if (null == ik.field_cb ||
                    !(ik.field_cb.length >= param1)) {
                    ik.field_cb = new int[param1 * 2];
                  }
                  if (sj.field_rb == null ||
                    !(param0 + param1 <= sj.field_rb.length)) {
                    sj.field_rb = new int[2 * (param1 + param0)];
                  }
                  if (null == ua.field_a ||
                    !(param1 <= ua.field_a.length)) {
                    ua.field_a = new boolean[2 * param1];
                  }
                }
              }
            } else {
              if (am.field_I.length >= param1) {
                var3 = -12 % ((param2 - 28) / 35);
                if (null == em.field_b ||
                  !(em.field_b.length >= param1)) {
                  em.field_b = new int[2 * param1];
                }
                if (oc.field_m == null) {
                  oc.field_m = new int[2 * param1];
                  if (null == ik.field_cb ||
                    !(ik.field_cb.length >= param1)) {
                    ik.field_cb = new int[param1 * 2];
                  }
                  if (sj.field_rb == null ||
                    !(param0 + param1 <= sj.field_rb.length)) {
                    sj.field_rb = new int[2 * (param1 + param0)];
                  }
                  if (null == ua.field_a ||
                    !(param1 <= ua.field_a.length)) {
                    ua.field_a = new boolean[2 * param1];
                  }
                } else {
                  if (oc.field_m.length >= param1) {
                    if (null == ik.field_cb ||
                      !(ik.field_cb.length >= param1)) {
                      ik.field_cb = new int[param1 * 2];
                    }
                    if (sj.field_rb == null ||
                      !(param0 + param1 <= sj.field_rb.length)) {
                      sj.field_rb = new int[2 * (param1 + param0)];
                    }
                    if (null == ua.field_a ||
                      !(param1 <= ua.field_a.length)) {
                      ua.field_a = new boolean[2 * param1];
                    }
                  } else {
                    oc.field_m = new int[2 * param1];
                    if (null == ik.field_cb ||
                      !(ik.field_cb.length >= param1)) {
                      ik.field_cb = new int[param1 * 2];
                    }
                    if (sj.field_rb == null ||
                      !(param0 + param1 <= sj.field_rb.length)) {
                      sj.field_rb = new int[2 * (param1 + param0)];
                    }
                    if (null == ua.field_a ||
                      !(param1 <= ua.field_a.length)) {
                      ua.field_a = new boolean[2 * param1];
                    }
                  }
                }
              } else {
                am.field_I = new int[param1 * 2];
                var3 = -12 % ((param2 - 28) / 35);
                if (null == em.field_b ||
                  !(em.field_b.length >= param1)) {
                  em.field_b = new int[2 * param1];
                }
                if (oc.field_m == null) {
                  oc.field_m = new int[2 * param1];
                  if (null == ik.field_cb ||
                    !(ik.field_cb.length >= param1)) {
                    ik.field_cb = new int[param1 * 2];
                  }
                  if (sj.field_rb == null ||
                    !(param0 + param1 <= sj.field_rb.length)) {
                    sj.field_rb = new int[2 * (param1 + param0)];
                  }
                  if (null == ua.field_a ||
                    !(param1 <= ua.field_a.length)) {
                    ua.field_a = new boolean[2 * param1];
                  }
                } else {
                  if (oc.field_m.length >= param1) {
                    if (null == ik.field_cb ||
                      !(ik.field_cb.length >= param1)) {
                      ik.field_cb = new int[param1 * 2];
                    }
                    if (sj.field_rb == null ||
                      !(param0 + param1 <= sj.field_rb.length)) {
                      sj.field_rb = new int[2 * (param1 + param0)];
                    }
                    if (null == ua.field_a ||
                      !(param1 <= ua.field_a.length)) {
                      ua.field_a = new boolean[2 * param1];
                    }
                  } else {
                    oc.field_m = new int[2 * param1];
                    if (null == ik.field_cb ||
                      !(ik.field_cb.length >= param1)) {
                      ik.field_cb = new int[param1 * 2];
                    }
                    if (sj.field_rb == null ||
                      !(param0 + param1 <= sj.field_rb.length)) {
                      sj.field_rb = new int[2 * (param1 + param0)];
                    }
                    if (null == ua.field_a ||
                      !(param1 <= ua.field_a.length)) {
                      ua.field_a = new boolean[2 * param1];
                    }
                  }
                }
              }
            }
          }
        }
        hj.field_j = -2147483648;
        ka.field_P = -2147483648;
        cg.field_f = 2147483647;
        mi.field_f = 2147483647;
        mc.field_c = 0;
    }

    fg() {
        super(0L, (eh) null);
    }

    static {
        field_nb = "SHIELD LOST";
        field_pb = "This password contains your Player Name, and would be easy to guess";
    }
}
