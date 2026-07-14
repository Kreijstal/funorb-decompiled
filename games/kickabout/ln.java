/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ln extends ct {
    static int[] field_B;

    private ln(int param0, int param1, int param2, int param3, gj param4, jv param5, fd param6) {
        super(param0, param1, param2, param3, param4, param5);
        ((ln) this).field_z = param6;
    }

    final void a(int param0, int param1, int param2, fd param3, int param4, int param5) {
        jg var7 = null;
        super.a(param0, param1, param2, param3, param4, param5);
        var7 = mp.field_g;
        if (var7 != null) {
          if (((ln) this).a((byte) -81, param5, param0, param2, param1)) {
            if (!(((ln) this).field_k instanceof co)) {
              if (var7.field_k instanceof co) {
                ((co) (Object) var7.field_k).a(var7, (ln) this, 14578);
                mp.field_g = null;
                return;
              } else {
                return;
              }
            } else {
              ((co) (Object) ((ln) this).field_k).a(var7, (ln) this, param4 + 14579);
              mp.field_g = null;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0, hd param1, hd param2) {
        if (null != param1.field_jb) {
          L0: {
            if (param2.field_jb == null) {
              param2.field_jb = new tf();
              break L0;
            } else {
              break L0;
            }
          }
          if (param0 == 64) {
            if (null == kw.field_b) {
              L1: {
                kw.field_b = new em(64);
                if (null == ni.field_m) {
                  ni.field_m = new em(64);
                  break L1;
                } else {
                  break L1;
                }
              }
              ne.field_I = param1.field_jb;
              qn.field_b = param2.field_jb;
              qg.a(0);
              return;
            } else {
              L2: {
                if (null == ni.field_m) {
                  ni.field_m = new em(64);
                  break L2;
                } else {
                  break L2;
                }
              }
              ne.field_I = param1.field_jb;
              qn.field_b = param2.field_jb;
              qg.a(0);
              return;
            }
          } else {
            return;
          }
        } else {
          L3: {
            param1.field_jb = new tf();
            if (param2.field_jb == null) {
              param2.field_jb = new tf();
              break L3;
            } else {
              break L3;
            }
          }
          if (param0 == 64) {
            if (null != kw.field_b) {
              L4: {
                if (null == ni.field_m) {
                  ni.field_m = new em(64);
                  break L4;
                } else {
                  break L4;
                }
              }
              ne.field_I = param1.field_jb;
              qn.field_b = param2.field_jb;
              qg.a(0);
              return;
            } else {
              L5: {
                kw.field_b = new em(64);
                if (null == ni.field_m) {
                  ni.field_m = new em(64);
                  break L5;
                } else {
                  break L5;
                }
              }
              ne.field_I = param1.field_jb;
              qn.field_b = param2.field_jb;
              qg.a(0);
              return;
            }
          } else {
            return;
          }
        }
    }

    final static java.awt.Canvas l(int param0) {
        if (param0 != 64) {
            field_B = null;
            return (java.awt.Canvas) (e.field_m == null ? ic.field_d : e.field_m);
        }
        return (java.awt.Canvas) (e.field_m == null ? ic.field_d : e.field_m);
    }

    public static void k(int param0) {
        if (param0 != 31235) {
            ln.k(110);
            field_B = null;
            return;
        }
        field_B = null;
    }

    static {
    }
}
