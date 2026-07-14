/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class jj extends db implements m {
    private dg field_eb;
    private oh field_gb;
    private boolean field_jb;
    private boolean field_kb;
    static int[] field_fb;
    private boolean field_ib;
    private boolean field_hb;

    final void a(int param0, String param1, int param2) {
        int var5 = 0;
        lc var6 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        lc stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        lc stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        lc stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        String stackIn_14_2 = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        lc stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        lc stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        String stackOut_13_2 = null;
        lc stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        String stackOut_12_2 = null;
        var5 = TrackController.field_F ? 1 : 0;
        if (((jj) this).field_ib) {
          return;
        } else {
          L0: {
            stackOut_3_0 = this;
            stackIn_5_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (param0 != 256) {
              stackOut_5_0 = this;
              stackOut_5_1 = 0;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              break L0;
            } else {
              stackOut_4_0 = this;
              stackOut_4_1 = 1;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              break L0;
            }
          }
          ((jj) this).field_jb = stackIn_6_1 != 0;
          ((jj) this).field_ib = true;
          if (param2 == -10) {
            ((jj) this).field_eb.a(4210752, 8405024, (byte) -33);
            var6 = new lc((jj) this, ((jj) this).field_gb, param1);
            if (-6 == (param0 ^ -1)) {
              var6.a(param2 + -17030, dh.field_r, 11);
              var6.a(-17040, cg.field_b, 17);
              if (3 != param0) {
                if (-5 != (param0 ^ -1)) {
                  if ((param0 ^ -1) == -7) {
                    var6.a(-17040, md.field_c, 9);
                    ((jj) this).b((al) (Object) var6, -101);
                    return;
                  } else {
                    if ((param0 ^ -1) == -10) {
                      rh discarded$3 = var6.a(param2 + -4, (tg) this, fh.field_d);
                      ((jj) this).b((al) (Object) var6, -101);
                      return;
                    } else {
                      ((jj) this).b((al) (Object) var6, -101);
                      return;
                    }
                  }
                } else {
                  var6.a(-17040, wg.field_h, 8);
                  ((jj) this).b((al) (Object) var6, -101);
                  return;
                }
              } else {
                var6.a(-17040, ea.field_y, 7);
                ((jj) this).b((al) (Object) var6, -101);
                return;
              }
            } else {
              L1: {
                if ((param0 ^ -1) != -257) {
                  L2: {
                    stackOut_11_0 = (lc) var6;
                    stackOut_11_1 = param2 + -17030;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    if (!((jj) this).field_hb) {
                      stackOut_13_0 = (lc) (Object) stackIn_13_0;
                      stackOut_13_1 = stackIn_13_1;
                      stackOut_13_2 = ea.field_p;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      stackIn_14_2 = stackOut_13_2;
                      break L2;
                    } else {
                      stackOut_12_0 = (lc) (Object) stackIn_12_0;
                      stackOut_12_1 = stackIn_12_1;
                      stackOut_12_2 = ib.field_c;
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_14_1 = stackOut_12_1;
                      stackIn_14_2 = stackOut_12_2;
                      break L2;
                    }
                  }
                  ((lc) (Object) stackIn_14_0).a(stackIn_14_1, stackIn_14_2, -1);
                  break L1;
                } else {
                  rh discarded$4 = var6.a(param2 ^ 4, (tg) this, ib.field_c);
                  break L1;
                }
              }
              if (3 != param0) {
                if (-5 != (param0 ^ -1)) {
                  if ((param0 ^ -1) == -7) {
                    var6.a(-17040, md.field_c, 9);
                    ((jj) this).b((al) (Object) var6, -101);
                    return;
                  } else {
                    if ((param0 ^ -1) == -10) {
                      rh discarded$5 = var6.a(param2 + -4, (tg) this, fh.field_d);
                      ((jj) this).b((al) (Object) var6, -101);
                      return;
                    } else {
                      ((jj) this).b((al) (Object) var6, -101);
                      return;
                    }
                  }
                } else {
                  var6.a(-17040, wg.field_h, 8);
                  ((jj) this).b((al) (Object) var6, -101);
                  return;
                }
              } else {
                var6.a(-17040, ea.field_y, 7);
                ((jj) this).b((al) (Object) var6, -101);
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    public void a(rh param0, int param1, int param2, int param3, int param4) {
        if (!((jj) this).field_jb) {
          gk.a("tochangedisplayname.ws", gd.b((byte) 77), -110);
          if (param4 == -27322) {
            return;
          } else {
            ((jj) this).field_hb = true;
            return;
          }
        } else {
          qc.b(3, (byte) -42);
          ((jj) this).t(20252);
          if (param4 == -27322) {
            return;
          } else {
            ((jj) this).field_hb = true;
            return;
          }
        }
    }

    jj(vl param0, oh param1, String param2, boolean param3, boolean param4) {
        super(param0, (al) (Object) new lc((jj) null, param1, param2), 77, 10, 10);
        ((jj) this).field_jb = false;
        ((jj) this).field_ib = false;
        ((jj) this).field_kb = param4 ? true : false;
        ((jj) this).field_gb = param1;
        ((jj) this).field_hb = param3 ? true : false;
        ((jj) this).field_eb = new dg(13, 50, 274, 30, 15, 2113632, 4210752);
        ((jj) this).field_eb.field_C = true;
        ((jj) this).a(false, (al) (Object) ((jj) this).field_eb);
    }

    final void t(int param0) {
        if (((jj) this).field_E) {
          if (param0 == 20252) {
            ((jj) this).field_E = false;
            if (!((jj) this).field_hb) {
              if (!((jj) this).field_kb) {
                return;
              } else {
                ja.c(1);
                return;
              }
            } else {
              hh.a((byte) 111);
              return;
            }
          } else {
            ((jj) this).field_eb = null;
            ((jj) this).field_E = false;
            if (!((jj) this).field_hb) {
              if (!((jj) this).field_kb) {
                return;
              } else {
                ja.c(1);
                return;
              }
            } else {
              hh.a((byte) 111);
              return;
            }
          }
        } else {
          return;
        }
    }

    final static boolean s(int param0) {
        if (param0 <= 22) {
            field_fb = null;
            return ge.field_D;
        }
        return ge.field_D;
    }

    final void r(int param0) {
        ((jj) this).field_eb.a(4210752, 2121792, (byte) -33);
        int var3 = -36 % ((-22 - param0) / 60);
        lc var2 = new lc((jj) this, ((jj) this).field_gb, gf.field_a);
        var2.a(-17040, sg.field_e, 15);
        ((jj) this).b((al) (Object) var2, -78);
    }

    final boolean a(byte param0, char param1, al param2, int param3) {
        if (!(-14 != (param3 ^ -1))) {
            ((jj) this).t(20252);
            return true;
        }
        int var5 = -113 / ((param0 - 17) / 51);
        return super.a((byte) -104, param1, param2, param3);
    }

    public static void e(byte param0) {
        field_fb = null;
        if (param0 < 98) {
            jj.e((byte) 9);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_fb = null;
    }
}
