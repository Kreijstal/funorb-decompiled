/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class rg extends jk implements sh {
    static boolean[] field_ub;
    private we field_vb;
    private boolean field_ob;
    static ea[] field_tb;
    private boolean field_rb;
    static int field_wb;
    private oi field_pb;
    private boolean field_qb;
    static int field_sb;
    private boolean field_nb;

    final static gj a(String param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = MinerDisturbance.field_ab;
        var2 = param0.length();
        if (var2 == 0) {
          return dh.field_d;
        } else {
          if (-64 <= (var2 ^ -1)) {
            var3 = 0;
            L0: while (true) {
              if (var3 >= var2) {
                if (!param1) {
                  field_sb = 18;
                  return null;
                } else {
                  return null;
                }
              } else {
                var4 = param0.charAt(var3);
                if (var4 == 45) {
                  L1: {
                    if (-1 == (var3 ^ -1)) {
                      break L1;
                    } else {
                      if (var2 + -1 == var3) {
                        break L1;
                      } else {
                        var3++;
                        continue L0;
                      }
                    }
                  }
                  return vh.field_f;
                } else {
                  if (wd.field_d.indexOf(var4) == -1) {
                    return vh.field_f;
                  } else {
                    var3++;
                    continue L0;
                  }
                }
              }
            }
          } else {
            return ec.field_d;
          }
        }
    }

    rg(hm param0, we param1, String param2, boolean param3, boolean param4) {
        super(param0, (fe) (Object) new fm((rg) null, param1, param2), 77, 10, 10);
        ((rg) this).field_qb = false;
        ((rg) this).field_vb = param1;
        ((rg) this).field_rb = param4 ? true : false;
        ((rg) this).field_ob = false;
        ((rg) this).field_nb = param3 ? true : false;
        ((rg) this).field_pb = new oi(13, 50, 274, 30, 15, 2113632, 4210752);
        ((rg) this).field_pb.field_O = true;
        ((rg) this).a(-1, (fe) (Object) ((rg) this).field_pb);
    }

    final void i(byte param0) {
        ((rg) this).field_pb.a(4210752, 2121792, (byte) -112);
        if (param0 != -97) {
            return;
        }
        fm var2 = new fm((rg) this, ((rg) this).field_vb, pn.field_f);
        var2.a(15, ee.field_K, param0 ^ 54);
        ((rg) this).a((byte) -56, (fe) (Object) var2);
    }

    public void a(int param0, byte param1, hc param2, int param3, int param4) {
        if (!((rg) this).field_qb) {
            jk.a(bm.c(-121), 78, "tochangedisplayname.ws");
        } else {
            oj.a(3, 3);
            ((rg) this).s(2121792);
        }
        if (param1 != 6) {
            Object var7 = null;
            ((rg) this).a((String) null, 94, (byte) -118);
        }
    }

    final void a(String param0, int param1, byte param2) {
        fm var4 = null;
        int var5 = 0;
        fm var6 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        fm stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        fm stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        fm stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        String stackIn_15_2 = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        fm stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        fm stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        String stackOut_14_2 = null;
        fm stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        String stackOut_13_2 = null;
        var5 = MinerDisturbance.field_ab;
        if (((rg) this).field_ob) {
          return;
        } else {
          L0: {
            stackOut_3_0 = this;
            stackIn_5_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (256 != param1) {
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
          L1: {
            ((rg) this).field_qb = stackIn_6_1 != 0;
            ((rg) this).field_ob = true;
            ((rg) this).field_pb.a(4210752, 8405024, (byte) -128);
            if (param2 <= -43) {
              break L1;
            } else {
              ((rg) this).field_rb = false;
              break L1;
            }
          }
          L2: {
            var6 = new fm((rg) this, ((rg) this).field_vb, param0);
            var4 = var6;
            if (5 != param1) {
              if (-257 != (param1 ^ -1)) {
                L3: {
                  stackOut_12_0 = (fm) var6;
                  stackOut_12_1 = -1;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  if (((rg) this).field_nb) {
                    stackOut_14_0 = (fm) (Object) stackIn_14_0;
                    stackOut_14_1 = stackIn_14_1;
                    stackOut_14_2 = af.field_s;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    stackIn_15_2 = stackOut_14_2;
                    break L3;
                  } else {
                    stackOut_13_0 = (fm) (Object) stackIn_13_0;
                    stackOut_13_1 = stackIn_13_1;
                    stackOut_13_2 = hk.field_d;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    stackIn_15_2 = stackOut_13_2;
                    break L3;
                  }
                }
                ((fm) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_15_2, -89);
                break L2;
              } else {
                hc discarded$24 = var6.a(af.field_s, 95, (rm) this);
                break L2;
              }
            } else {
              var6.a(11, pc.field_i, -89);
              var6.a(17, o.field_b, -68);
              break L2;
            }
          }
          L4: {
            if ((param1 ^ -1) == -4) {
              var6.a(7, wb.field_q, -82);
              break L4;
            } else {
              if (4 == param1) {
                var6.a(8, kd.field_e, -116);
                break L4;
              } else {
                if (-7 != (param1 ^ -1)) {
                  if (param1 != 9) {
                    break L4;
                  } else {
                    hc discarded$25 = var6.a(bm.field_k, 66, (rm) this);
                    break L4;
                  }
                } else {
                  var6.a(9, gj.field_b, -98);
                  break L4;
                }
              }
            }
          }
          ((rg) this).a((byte) -62, (fe) (Object) var6);
          return;
        }
    }

    final boolean a(char param0, fe param1, byte param2, int param3) {
        if (param2 != -79) {
            Object var6 = null;
            ((rg) this).a(3, (byte) 82, (hc) null, -71, 108);
        }
        if (!(param3 != 13)) {
            ((rg) this).s(2121792);
            return true;
        }
        return super.a(param0, param1, (byte) -79, param3);
    }

    final void s(int param0) {
        if (((rg) this).field_K) {
          L0: {
            if (param0 == 2121792) {
              break L0;
            } else {
              field_wb = -29;
              break L0;
            }
          }
          L1: {
            ((rg) this).field_K = false;
            if (((rg) this).field_nb) {
              fd.a(true);
              break L1;
            } else {
              if (!((rg) this).field_rb) {
                break L1;
              } else {
                r.a((byte) -127);
                break L1;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void r(int param0) {
        field_ub = null;
        field_tb = null;
        if (param0 != 28776) {
            field_sb = -1;
        }
    }

    static {
    }
}
