/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vn extends bj implements mj {
    static jc field_vb;
    static String field_Eb;
    static int[] field_sb;
    private boolean field_zb;
    static String[] field_ub;
    static km field_rb;
    static km field_xb;
    static int[] field_Ab;
    private lh field_Fb;
    private boolean field_Cb;
    private rm field_wb;
    static km field_Bb;
    private boolean field_yb;
    static int field_Db;
    private boolean field_tb;

    final static void l(int param0) {
        mi.field_t = new String[re.field_j];
        mi.field_t[5] = sa.field_f;
        mi.field_t[11] = ii.field_N;
        mi.field_t[17] = fl.field_s;
        mi.field_t[6] = kn.field_E;
        mi.field_t[20] = mn.field_j;
        mi.field_t[9] = sj.field_f;
        mi.field_t[4] = ri.field_h;
        mi.field_t[19] = kn.field_K;
        mi.field_t[15] = va.field_e;
        if (param0 != 6) {
          field_Eb = null;
          mi.field_t[21] = le.field_b;
          mi.field_t[7] = hc.field_e;
          mi.field_t[18] = kn.field_J;
          mi.field_t[16] = fb.field_G;
          mi.field_t[13] = oa.field_c;
          return;
        } else {
          mi.field_t[21] = le.field_b;
          mi.field_t[7] = hc.field_e;
          mi.field_t[18] = kn.field_J;
          mi.field_t[16] = fb.field_G;
          mi.field_t[13] = oa.field_c;
          return;
        }
    }

    vn(fm param0, lh param1, String param2, boolean param3, boolean param4) {
        super(param0, (mf) (Object) new e((vn) null, param1, param2), 77, 10, 10);
        ((vn) this).field_yb = false;
        ((vn) this).field_zb = param3 ? true : false;
        ((vn) this).field_Fb = param1;
        ((vn) this).field_Cb = param4 ? true : false;
        ((vn) this).field_tb = false;
        ((vn) this).field_wb = new rm(13, 50, 274, 30, 15, 2113632, 4210752);
        ((vn) this).field_wb.field_W = true;
        ((vn) this).b((mf) (Object) ((vn) this).field_wb, 95);
    }

    final void k(byte param0) {
        int var2 = 0;
        if (((vn) this).field_P) {
          ((vn) this).field_P = false;
          if (!((vn) this).field_zb) {
            if (!((vn) this).field_Cb) {
              var2 = -90 % ((param0 - -67) / 41);
              return;
            } else {
              ci.j(-73);
              var2 = -90 % ((param0 - -67) / 41);
              return;
            }
          } else {
            vn.m(10);
            var2 = -90 % ((param0 - -67) / 41);
            return;
          }
        } else {
          return;
        }
    }

    final boolean a(char param0, int param1, int param2, mf param3) {
        if (param2 != -1) {
            ((vn) this).field_zb = true;
            if (!(13 != param1)) {
                ((vn) this).k((byte) -115);
                return true;
            }
            return super.a(param0, param1, -1, param3);
        }
        if (!(13 != param1)) {
            ((vn) this).k((byte) -115);
            return true;
        }
        return super.a(param0, param1, -1, param3);
    }

    final void n(int param0) {
        e var2 = null;
        ((vn) this).field_wb.b(2121792, 15016, 4210752);
        var2 = new e((vn) this, ((vn) this).field_Fb, gg.field_q);
        var2.a(15, 87, tc.field_y);
        if (param0 != 24528) {
          field_sb = null;
          ((vn) this).c((mf) (Object) var2, 127);
          return;
        } else {
          ((vn) this).c((mf) (Object) var2, 127);
          return;
        }
    }

    final void a(int param0, String param1, byte param2) {
        int var5 = 0;
        e var6 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        e stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        e stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        e stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        String stackIn_14_3 = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        e stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        e stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        String stackOut_13_3 = null;
        e stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        String stackOut_12_3 = null;
        var5 = Chess.field_G;
        if (((vn) this).field_yb) {
          return;
        } else {
          L0: {
            stackOut_3_0 = this;
            stackIn_5_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if ((param0 ^ -1) != -257) {
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
          ((vn) this).field_tb = stackIn_6_1 != 0;
          ((vn) this).field_yb = true;
          ((vn) this).field_wb.b(8405024, 15016, 4210752);
          if (param2 > 20) {
            var6 = new e((vn) this, ((vn) this).field_Fb, param1);
            if (param0 == 5) {
              var6.a(11, 29, vi.field_a);
              var6.a(17, 62, sn.field_b);
              if (-4 != param0) {
                if (-5 != param0) {
                  if (param0 != 6) {
                    if (param0 == 9) {
                      fb discarded$3 = var6.a((byte) -114, (rg) this, rn.field_c);
                      ((vn) this).c((mf) (Object) var6, 70);
                      return;
                    } else {
                      ((vn) this).c((mf) (Object) var6, 70);
                      return;
                    }
                  } else {
                    var6.a(9, 31, gg.field_e);
                    ((vn) this).c((mf) (Object) var6, 70);
                    return;
                  }
                } else {
                  var6.a(8, 101, gd.field_f);
                  ((vn) this).c((mf) (Object) var6, 70);
                  return;
                }
              } else {
                var6.a(7, 81, ki.field_Q);
                ((vn) this).c((mf) (Object) var6, 70);
                return;
              }
            } else {
              L1: {
                if (256 != param0) {
                  L2: {
                    stackOut_11_0 = (e) var6;
                    stackOut_11_1 = -1;
                    stackOut_11_2 = 113;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    stackIn_13_2 = stackOut_11_2;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    if (((vn) this).field_zb) {
                      stackOut_13_0 = (e) (Object) stackIn_13_0;
                      stackOut_13_1 = stackIn_13_1;
                      stackOut_13_2 = stackIn_13_2;
                      stackOut_13_3 = hl.field_f;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      stackIn_14_2 = stackOut_13_2;
                      stackIn_14_3 = stackOut_13_3;
                      break L2;
                    } else {
                      stackOut_12_0 = (e) (Object) stackIn_12_0;
                      stackOut_12_1 = stackIn_12_1;
                      stackOut_12_2 = stackIn_12_2;
                      stackOut_12_3 = fa.field_k;
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_14_1 = stackOut_12_1;
                      stackIn_14_2 = stackOut_12_2;
                      stackIn_14_3 = stackOut_12_3;
                      break L2;
                    }
                  }
                  ((e) (Object) stackIn_14_0).a(stackIn_14_1, stackIn_14_2, (String) (Object) stackIn_14_3);
                  break L1;
                } else {
                  fb discarded$4 = var6.a((byte) -114, (rg) this, hl.field_f);
                  break L1;
                }
              }
              if (-4 != param0) {
                if (-5 != param0) {
                  if (param0 != 6) {
                    if (param0 == 9) {
                      fb discarded$5 = var6.a((byte) -114, (rg) this, rn.field_c);
                      ((vn) this).c((mf) (Object) var6, 70);
                      return;
                    } else {
                      ((vn) this).c((mf) (Object) var6, 70);
                      return;
                    }
                  } else {
                    var6.a(9, 31, gg.field_e);
                    ((vn) this).c((mf) (Object) var6, 70);
                    return;
                  }
                } else {
                  var6.a(8, 101, gd.field_f);
                  ((vn) this).c((mf) (Object) var6, 70);
                  return;
                }
              } else {
                var6.a(7, 81, ki.field_Q);
                ((vn) this).c((mf) (Object) var6, 70);
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    private final static void m(int param0) {
        String var2 = null;
        String var3 = null;
        String var4 = null;
        String var5 = null;
        if (!dk.field_g) {
          throw new IllegalStateException();
        } else {
          if (param0 == 10) {
            if (null != ua.field_d) {
              ua.field_d.k((byte) -113);
              var4 = ec.e((byte) -64);
              um.field_b = new wf(var4, (String) null, true, false, false);
              jh.field_e.b((mf) (Object) nj.field_w, (byte) -46);
              nj.field_w.c((mf) (Object) um.field_b, 88);
              nj.field_w.i((byte) -126);
              return;
            } else {
              var5 = ec.e((byte) -64);
              um.field_b = new wf(var5, (String) null, true, false, false);
              jh.field_e.b((mf) (Object) nj.field_w, (byte) -46);
              nj.field_w.c((mf) (Object) um.field_b, 88);
              nj.field_w.i((byte) -126);
              return;
            }
          } else {
            vn.m(-26);
            if (null == ua.field_d) {
              var2 = ec.e((byte) -64);
              um.field_b = new wf(var2, (String) null, true, false, false);
              jh.field_e.b((mf) (Object) nj.field_w, (byte) -46);
              nj.field_w.c((mf) (Object) um.field_b, 88);
              nj.field_w.i((byte) -126);
              return;
            } else {
              ua.field_d.k((byte) -113);
              var3 = ec.e((byte) -64);
              um.field_b = new wf(var3, (String) null, true, false, false);
              jh.field_e.b((mf) (Object) nj.field_w, (byte) -46);
              nj.field_w.c((mf) (Object) um.field_b, 88);
              nj.field_w.i((byte) -126);
              return;
            }
          }
        }
    }

    public void a(fb param0, int param1, int param2, int param3, int param4) {
        if (((vn) this).field_tb) {
          uk.a(false, 3);
          ((vn) this).k((byte) -121);
          if (param4 == -24221) {
            return;
          } else {
            ((vn) this).n(-96);
            return;
          }
        } else {
          sg.a(bh.i(param4 ^ -24270), (byte) 120, "tochangedisplayname.ws");
          if (param4 == -24221) {
            return;
          } else {
            ((vn) this).n(-96);
            return;
          }
        }
    }

    public static void j(byte param0) {
        field_sb = null;
        field_Ab = null;
        field_xb = null;
        if (param0 != 5) {
          vn.j((byte) 123);
          field_rb = null;
          field_ub = null;
          field_Bb = null;
          field_vb = null;
          field_Eb = null;
          return;
        } else {
          field_rb = null;
          field_ub = null;
          field_Bb = null;
          field_vb = null;
          field_Eb = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ub = new String[]{"Click on one of the highlighted pieces to select it", "Click on one of the highlighted squares to move your selected piece"};
        field_Eb = "This game option has not yet been unlocked for use.";
        field_sb = new int[]{682, 910};
        field_Db = -1;
        field_vb = new jc();
    }
}
