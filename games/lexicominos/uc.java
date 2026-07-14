/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class uc extends re implements jk {
    private le field_jb;
    static volatile int field_eb;
    private boolean field_ob;
    private md field_gb;
    static db[] field_hb;
    static String field_nb;
    static int field_fb;
    private boolean field_lb;
    private boolean field_db;
    private boolean field_ib;
    static String field_mb;
    static ik field_kb;

    final boolean a(char param0, int param1, w param2, byte param3) {
        if (!(13 != param1)) {
            ((uc) this).g(true);
            return true;
        }
        int var5 = 23 % ((param3 - -13) / 55);
        return super.a(param0, param1, param2, (byte) 114);
    }

    final void a(int param0, int param1, String param2) {
        int var4 = 0;
        vc var5 = null;
        int var6 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        vc stackIn_8_0 = null;
        vc stackIn_9_0 = null;
        vc stackIn_10_0 = null;
        String stackIn_10_1 = null;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        vc stackOut_7_0 = null;
        vc stackOut_9_0 = null;
        String stackOut_9_1 = null;
        vc stackOut_8_0 = null;
        String stackOut_8_1 = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        if (!((uc) this).field_lb) {
          L0: {
            ((uc) this).field_lb = true;
            var4 = -97 / ((param0 - 31) / 49);
            stackOut_2_0 = this;
            stackIn_4_0 = stackOut_2_0;
            stackIn_3_0 = stackOut_2_0;
            if (-257 != (param1 ^ -1)) {
              stackOut_4_0 = this;
              stackOut_4_1 = 0;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              break L0;
            } else {
              stackOut_3_0 = this;
              stackOut_3_1 = 1;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              break L0;
            }
          }
          ((uc) this).field_ob = stackIn_5_1 != 0;
          ((uc) this).field_gb.b(4210752, 8405024, 124);
          var5 = new vc((uc) this, ((uc) this).field_jb, param2);
          if (-6 == (param1 ^ -1)) {
            var5.a(md.field_B, 11, 122);
            var5.a(jd.field_d, 17, -62);
            if ((param1 ^ -1) == -4) {
              var5.a(pa.field_b, 7, 112);
              ((uc) this).b(118, (w) (Object) var5);
              return;
            } else {
              if (4 != param1) {
                if (6 != param1) {
                  if (9 == param1) {
                    kf discarded$4 = var5.a(-1, qj.field_eb, (vd) this);
                    ((uc) this).b(118, (w) (Object) var5);
                    return;
                  } else {
                    ((uc) this).b(118, (w) (Object) var5);
                    return;
                  }
                } else {
                  var5.a(lb.field_b, 9, 105);
                  ((uc) this).b(118, (w) (Object) var5);
                  return;
                }
              } else {
                var5.a(dj.field_a, 8, 111);
                ((uc) this).b(118, (w) (Object) var5);
                return;
              }
            }
          } else {
            if ((param1 ^ -1) == -257) {
              kf discarded$5 = var5.a(-1, og.field_j, (vd) this);
              if ((param1 ^ -1) == -4) {
                var5.a(pa.field_b, 7, 112);
                ((uc) this).b(118, (w) (Object) var5);
                return;
              } else {
                if (4 != param1) {
                  if (6 != param1) {
                    if (9 == param1) {
                      kf discarded$6 = var5.a(-1, qj.field_eb, (vd) this);
                      ((uc) this).b(118, (w) (Object) var5);
                      return;
                    } else {
                      ((uc) this).b(118, (w) (Object) var5);
                      return;
                    }
                  } else {
                    var5.a(lb.field_b, 9, 105);
                    ((uc) this).b(118, (w) (Object) var5);
                    return;
                  }
                } else {
                  var5.a(dj.field_a, 8, 111);
                  ((uc) this).b(118, (w) (Object) var5);
                  return;
                }
              }
            } else {
              L1: {
                stackOut_7_0 = (vc) var5;
                stackIn_9_0 = stackOut_7_0;
                stackIn_8_0 = stackOut_7_0;
                if (!((uc) this).field_ib) {
                  stackOut_9_0 = (vc) (Object) stackIn_9_0;
                  stackOut_9_1 = a.field_e;
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  break L1;
                } else {
                  stackOut_8_0 = (vc) (Object) stackIn_8_0;
                  stackOut_8_1 = og.field_j;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  break L1;
                }
              }
              ((vc) (Object) stackIn_10_0).a(stackIn_10_1, -1, 111);
              if ((param1 ^ -1) == -4) {
                var5.a(pa.field_b, 7, 112);
                ((uc) this).b(118, (w) (Object) var5);
                return;
              } else {
                if (4 != param1) {
                  if (6 != param1) {
                    if (9 == param1) {
                      kf discarded$7 = var5.a(-1, qj.field_eb, (vd) this);
                      ((uc) this).b(118, (w) (Object) var5);
                      return;
                    } else {
                      ((uc) this).b(118, (w) (Object) var5);
                      return;
                    }
                  } else {
                    var5.a(lb.field_b, 9, 105);
                    ((uc) this).b(118, (w) (Object) var5);
                    return;
                  }
                } else {
                  var5.a(dj.field_a, 8, 111);
                  ((uc) this).b(118, (w) (Object) var5);
                  return;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final void g(boolean param0) {
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (!((uc) this).field_D) {
          return;
        } else {
          ((uc) this).field_D = false;
          if (param0) {
            if (!((uc) this).field_ib) {
              if (((uc) this).field_db) {
                tj.c(0);
                return;
              } else {
                return;
              }
            } else {
              L0: {
                if (param0) {
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
                } else {
                  stackOut_15_0 = 1;
                  stackIn_17_0 = stackOut_15_0;
                  break L0;
                }
              }
              u.h(stackIn_17_0 != 0);
              return;
            }
          } else {
            field_hb = null;
            if (!((uc) this).field_ib) {
              if (((uc) this).field_db) {
                tj.c(0);
                return;
              } else {
                return;
              }
            } else {
              L1: {
                if (param0) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L1;
                }
              }
              u.h(stackIn_8_0 != 0);
              return;
            }
          }
        }
    }

    public void a(int param0, int param1, int param2, int param3, kf param4) {
        if (!((uc) this).field_ob) {
          pd.a("tochangedisplayname.ws", -109, kk.c(-14047));
          if (param2 == 215535458) {
            return;
          } else {
            ((uc) this).g(true);
            return;
          }
        } else {
          ni.a(56, 3);
          ((uc) this).g(true);
          if (param2 == 215535458) {
            return;
          } else {
            ((uc) this).g(true);
            return;
          }
        }
    }

    public static void h(int param0) {
        field_hb = null;
        if (param0 != 11331) {
            return;
        }
        field_mb = null;
        field_nb = null;
        field_kb = null;
    }

    final void i(int param0) {
        ((uc) this).field_gb.b(4210752, 2121792, 120);
        vc var2 = new vc((uc) this, ((uc) this).field_jb, la.field_a);
        var2.a(e.field_e, param0, 124);
        ((uc) this).b(117, (w) (Object) var2);
    }

    uc(eg param0, le param1, String param2, boolean param3, boolean param4) {
        super(param0, (w) (Object) new vc((uc) null, param1, param2), 77, 10, 10);
        ((uc) this).field_ob = false;
        ((uc) this).field_lb = false;
        ((uc) this).field_ib = param3 ? true : false;
        ((uc) this).field_db = param4 ? true : false;
        ((uc) this).field_jb = param1;
        ((uc) this).field_gb = new md(13, 50, 274, 30, 15, 2113632, 4210752);
        ((uc) this).field_gb.field_G = true;
        ((uc) this).b((byte) -65, (w) (Object) ((uc) this).field_gb);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_nb = "Passwords must be between 5 and 20 letters and numbers";
        field_eb = 0;
        field_mb = "Not yet achieved";
    }
}
