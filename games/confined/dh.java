/*
 * Decompiled by CFR-JS 0.4.0.
 */
class dh extends sj implements el {
    static ja field_vb;
    private boolean field_zb;
    static double field_sb;
    private boolean field_tb;
    static int field_Ab;
    private boolean field_yb;
    private boolean field_ub;
    private ib field_wb;
    private ok field_xb;

    final static nf a(boolean param0, String param1, String param2, mi param3) {
        int var4 = 0;
        int var5 = 0;
        if (param0) {
          return null;
        } else {
          var4 = param3.a(-37, param2);
          var5 = param3.a(var4, param1, -127);
          return ci.a(var4, param3, var5, param0);
        }
    }

    final void i(byte param0) {
        jn var2 = null;
        ((dh) this).field_wb.a(2121792, false, 4210752);
        var2 = new jn((dh) this, ((dh) this).field_xb, ne.field_d);
        if (param0 < 73) {
          return;
        } else {
          var2.a(0, tn.field_C, 15);
          ((dh) this).a((fj) (Object) var2, (byte) -72);
          return;
        }
    }

    final boolean a(fj param0, byte param1, int param2, char param3) {
        int var5 = 0;
        if (-14 == (param2 ^ -1)) {
          ((dh) this).n(10);
          return true;
        } else {
          var5 = -48 % ((param1 - 47) / 43);
          return super.a(param0, (byte) -2, param2, param3);
        }
    }

    final static void a(int param0, qn param1, int param2) {
        hb var3 = null;
        var3 = vh.field_a;
        var3.b(true, param0);
        var3.f(118, 5);
        var3.f(115, 0);
        var3.c(param1.field_w, 8);
        var3.f(param2 ^ 21840, param1.field_o);
        if (param2 != 21821) {
          return;
        } else {
          var3.f(120, param1.field_s);
          return;
        }
    }

    dh(sh param0, ok param1, String param2, boolean param3, boolean param4) {
        super(param0, (fj) (Object) new jn((dh) null, param1, param2), 77, 10, 10);
        ((dh) this).field_xb = param1;
        ((dh) this).field_yb = false;
        ((dh) this).field_zb = param3 ? true : false;
        ((dh) this).field_tb = false;
        ((dh) this).field_ub = param4 ? true : false;
        ((dh) this).field_wb = new ib(13, 50, 274, 30, 15, 2113632, 4210752);
        ((dh) this).field_wb.field_N = true;
        ((dh) this).b((fj) (Object) ((dh) this).field_wb, 10);
    }

    final void a(String param0, int param1, boolean param2) {
        jn var4 = null;
        int var5 = 0;
        jn var6 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        jn stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        jn stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        jn stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        String stackIn_11_2 = null;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        jn stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        jn stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        String stackOut_10_2 = null;
        jn stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        String stackOut_9_2 = null;
        var5 = Confined.field_J ? 1 : 0;
        if (!((dh) this).field_tb) {
          L0: {
            ((dh) this).field_tb = true;
            stackOut_2_0 = this;
            stackIn_4_0 = stackOut_2_0;
            stackIn_3_0 = stackOut_2_0;
            if (256 != param1) {
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
          ((dh) this).field_yb = stackIn_5_1 != 0;
          ((dh) this).field_wb.a(8405024, param2, 4210752);
          var6 = new jn((dh) this, ((dh) this).field_xb, param0);
          var4 = var6;
          if (5 != param1) {
            if (256 == param1) {
              rg discarded$4 = var6.a(aa.field_a, (uk) this, false);
              if (3 != param1) {
                if (param1 != -5) {
                  if (-7 != param1) {
                    if (param1 != 9) {
                      ((dh) this).a((fj) (Object) var6, (byte) -72);
                      return;
                    } else {
                      rg discarded$5 = var6.a(ai.field_g, (uk) this, param2);
                      ((dh) this).a((fj) (Object) var6, (byte) -72);
                      return;
                    }
                  } else {
                    var6.a(0, tn.field_y, 9);
                    ((dh) this).a((fj) (Object) var6, (byte) -72);
                    return;
                  }
                } else {
                  var6.a(0, mm.field_hb, 8);
                  ((dh) this).a((fj) (Object) var6, (byte) -72);
                  return;
                }
              } else {
                var6.a(0, ui.field_d, 7);
                ((dh) this).a((fj) (Object) var6, (byte) -72);
                return;
              }
            } else {
              L1: {
                stackOut_8_0 = (jn) var6;
                stackOut_8_1 = 0;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                if (((dh) this).field_zb) {
                  stackOut_10_0 = (jn) (Object) stackIn_10_0;
                  stackOut_10_1 = stackIn_10_1;
                  stackOut_10_2 = aa.field_a;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  break L1;
                } else {
                  stackOut_9_0 = (jn) (Object) stackIn_9_0;
                  stackOut_9_1 = stackIn_9_1;
                  stackOut_9_2 = te.field_i;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  stackIn_11_2 = stackOut_9_2;
                  break L1;
                }
              }
              ((jn) (Object) stackIn_11_0).a(stackIn_11_1, stackIn_11_2, -1);
              if (3 != param1) {
                if (param1 != -5) {
                  if (-7 != param1) {
                    if (param1 != 9) {
                      ((dh) this).a((fj) (Object) var6, (byte) -72);
                      return;
                    } else {
                      rg discarded$6 = var6.a(ai.field_g, (uk) this, param2);
                      ((dh) this).a((fj) (Object) var6, (byte) -72);
                      return;
                    }
                  } else {
                    var6.a(0, tn.field_y, 9);
                    ((dh) this).a((fj) (Object) var6, (byte) -72);
                    return;
                  }
                } else {
                  var6.a(0, mm.field_hb, 8);
                  ((dh) this).a((fj) (Object) var6, (byte) -72);
                  return;
                }
              } else {
                var6.a(0, ui.field_d, 7);
                ((dh) this).a((fj) (Object) var6, (byte) -72);
                return;
              }
            }
          } else {
            var6.a(0, ei.field_nb, 11);
            var6.a(0, al.field_c, 17);
            if (3 != param1) {
              if (param1 != -5) {
                if (-7 != param1) {
                  if (param1 != 9) {
                    ((dh) this).a((fj) (Object) var6, (byte) -72);
                    return;
                  } else {
                    rg discarded$7 = var6.a(ai.field_g, (uk) this, param2);
                    ((dh) this).a((fj) (Object) var6, (byte) -72);
                    return;
                  }
                } else {
                  var6.a(0, tn.field_y, 9);
                  ((dh) this).a((fj) (Object) var6, (byte) -72);
                  return;
                }
              } else {
                var6.a(0, mm.field_hb, 8);
                ((dh) this).a((fj) (Object) var6, (byte) -72);
                return;
              }
            } else {
              var6.a(0, ui.field_d, 7);
              ((dh) this).a((fj) (Object) var6, (byte) -72);
              return;
            }
          }
        } else {
          return;
        }
    }

    final void n(int param0) {
        if (!((dh) this).field_H) {
          return;
        } else {
          if (param0 == 10) {
            ((dh) this).field_H = false;
            if (!((dh) this).field_zb) {
              if (((dh) this).field_ub) {
                un.c(-18997);
                return;
              } else {
                return;
              }
            } else {
              bh.b(2);
              return;
            }
          } else {
            return;
          }
        }
    }

    public void a(int param0, int param1, int param2, rg param3, int param4) {
        if (param0 > 68) {
          if (!((dh) this).field_yb) {
            li.a(ii.b(false), 109, "tochangedisplayname.ws");
            return;
          } else {
            vf.a((byte) -119, 3);
            ((dh) this).n(10);
            return;
          }
        } else {
          return;
        }
    }

    public static void c(boolean param0) {
        if (param0) {
            Object var2 = null;
            dh.a(-49, (qn) null, 59);
            field_vb = null;
            return;
        }
        field_vb = null;
    }

    static {
    }
}
