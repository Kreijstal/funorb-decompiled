/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lh {
    static fa field_b;
    lh field_a;
    static String field_d;
    static sk field_g;
    long field_c;
    static int[][] field_e;
    static int field_f;
    lh field_h;

    final boolean b(byte param0) {
        if (null != ((lh) this).field_a) {
          if (param0 != -54) {
            boolean discarded$2 = lh.a(-118, -117, -87, false, -11, -87, -1);
            return true;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static void a(boolean param0) {
        if (rh.field_p != null) {
          lh.a((byte) -97, (java.awt.Canvas) (Object) rh.field_p);
          rh.field_p.a(fg.field_q, 20401);
          rh.field_p = null;
          if (aa.field_r == null) {
            ol.field_e.requestFocus();
            if (param0) {
              field_e = null;
              return;
            } else {
              return;
            }
          } else {
            aa.field_r.a(-115);
            ol.field_e.requestFocus();
            if (!param0) {
              return;
            } else {
              field_e = null;
              return;
            }
          }
        } else {
          return;
        }
    }

    final void c(int param0) {
        if (((lh) this).field_a == null) {
          return;
        } else {
          if (param0 != -1) {
            return;
          } else {
            ((lh) this).field_a.field_h = ((lh) this).field_h;
            ((lh) this).field_h.field_a = ((lh) this).field_a;
            ((lh) this).field_h = null;
            ((lh) this).field_a = null;
            return;
          }
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_e = null;
        field_g = null;
        field_d = null;
        if (param0 != 1) {
            field_b = null;
        }
    }

    final static dd[] a(int param0, int param1, byte param2, int param3) {
        int var4 = 22 % ((-22 - param2) / 59);
        return cb.a(1, param0, 0, param3, param1);
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        ca.a((java.awt.Component) (Object) param1, (byte) 83);
        ui.a((java.awt.Component) (Object) param1, 122);
        if (param0 < -4) {
          if (ui.field_pb != null) {
            ui.field_pb.a((byte) 103, (java.awt.Component) (Object) param1);
            return;
          } else {
            return;
          }
        } else {
          field_f = 38;
          if (ui.field_pb == null) {
            return;
          } else {
            ui.field_pb.a((byte) 103, (java.awt.Component) (Object) param1);
            return;
          }
        }
    }

    final static boolean a(String param0, String param1, int param2) {
        if (!fm.a(true, param0)) {
          if (hg.a(param0, 1)) {
            return false;
          } else {
            if (o.a(false, param0)) {
              return false;
            } else {
              if ((param1.length() ^ -1) == param2) {
                return true;
              } else {
                if (!hj.a(param0, param1, 0)) {
                  if (!hf.a((byte) 98, param0, param1)) {
                    if (!gl.a(param1, -1, param0)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              }
            }
          }
        } else {
          return false;
        }
    }

    final static boolean a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        if (param3) {
          if (param5 >= param4) {
            if (param5 < param4 + param2) {
              if (param6 >= param0) {
                if (param6 >= param1 + param0) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          boolean discarded$11 = lh.a(-73, 30, -70, true, -43, 84, 103);
          if (param5 >= param4) {
            if (param5 < param4 + param2) {
              if (param6 >= param0) {
                if (param6 >= param1 + param0) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[160][100];
        field_d = "Use this alternative as your account name";
    }
}
