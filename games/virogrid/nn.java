/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn {
    static km field_b;
    static int field_a;

    final static void a(mg[][] param0, mg[][] param1, int param2, byte[] param3, byte[] param4, eh param5, eh param6, boolean param7, int param8, String[][] param9, String[][] param10, String[] param11, int[] param12, int param13, eh param14) {
        if (param8 != -27871) {
            field_a = 80;
        }
        Object var17 = null;
        Object var16 = null;
        pb.a(param4, param6, param11, param2, param7, param13, param3, (rm[]) null, param14, param12, param9, (int[]) null, param10, false, param5, param1, param0);
    }

    final static void a(int param0, int param1, byte param2) {
        hg var3 = null;
        var3 = gk.field_g;
        var3.g(param1, 8);
        var3.a(3, -118);
        if (param2 >= -112) {
          return;
        } else {
          var3.a(9, 66);
          var3.a((byte) -63, param0);
          return;
        }
    }

    final static void a(boolean param0, int param1) {
        ca.field_D = (param1 & 53) >> -1625191100;
        qe.field_m = (param1 & 15) >> -715356830;
        if (ca.field_D <= 2) {
          el.field_t = param1 & 3;
          if (param0) {
            L0: {
              if (qe.field_m > 2) {
                qe.field_m = 2;
                break L0;
              } else {
                break L0;
              }
            }
            if (el.field_t > 2) {
              el.field_t = 2;
              return;
            } else {
              return;
            }
          } else {
            L1: {
              nn.a(true, -24);
              if (qe.field_m > 2) {
                qe.field_m = 2;
                break L1;
              } else {
                break L1;
              }
            }
            if (el.field_t > 2) {
              el.field_t = 2;
              return;
            } else {
              return;
            }
          }
        } else {
          ca.field_D = 2;
          el.field_t = param1 & 3;
          if (!param0) {
            L2: {
              nn.a(true, -24);
              if (qe.field_m > 2) {
                qe.field_m = 2;
                break L2;
              } else {
                break L2;
              }
            }
            if (el.field_t <= 2) {
              return;
            } else {
              el.field_t = 2;
              return;
            }
          } else {
            L3: {
              if (qe.field_m > 2) {
                qe.field_m = 2;
                break L3;
              } else {
                break L3;
              }
            }
            if (el.field_t > 2) {
              el.field_t = 2;
              return;
            } else {
              return;
            }
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 53) {
            field_b = null;
        }
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        Object var3 = null;
        uh.a((java.awt.Component) (Object) param0, (byte) 97);
        if (param1 < -40) {
          ga.a((java.awt.Component) (Object) param0, false);
          if (sb.field_d != null) {
            sb.field_d.a(31131, (java.awt.Component) (Object) param0);
            return;
          } else {
            return;
          }
        } else {
          var3 = null;
          nn.a((mg[][]) null, (mg[][]) null, -23, (byte[]) null, (byte[]) null, (eh) null, (eh) null, false, -93, (String[][]) null, (String[][]) null, (String[]) null, (int[]) null, 76, (eh) null);
          ga.a((java.awt.Component) (Object) param0, false);
          if (sb.field_d == null) {
            return;
          } else {
            sb.field_d.a(31131, (java.awt.Component) (Object) param0);
            return;
          }
        }
    }

    final static void a(int param0, boolean param1) {
        if (param0 < 64) {
            return;
        }
        if (ij.field_j == null) {
            return;
        }
        if (ij.field_j.a(true, param1)) {
            ij.field_j = null;
            return;
        }
    }

    static {
    }
}
