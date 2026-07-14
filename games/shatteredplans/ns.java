/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class ns extends il implements bp {
    static boolean field_pb;
    static np field_nb;
    private boolean field_vb;
    private md field_yb;
    static String field_qb;
    private boolean field_tb;
    private boolean field_sb;
    static boolean field_ob;
    private nq field_ub;
    static String field_xb;
    private boolean field_wb;
    static vk field_rb;

    final void p(int param0) {
        cf var2 = null;
        if (param0 != -7011) {
          ((ns) this).field_tb = false;
          ((ns) this).field_yb.a(4210752, 2121792, -27855);
          var2 = new cf((ns) this, ((ns) this).field_ub, pr.field_f);
          var2.a(t.field_a, (byte) 112, 15);
          ((ns) this).b((vg) (Object) var2, param0 + 6907);
          return;
        } else {
          ((ns) this).field_yb.a(4210752, 2121792, -27855);
          var2 = new cf((ns) this, ((ns) this).field_ub, pr.field_f);
          var2.a(t.field_a, (byte) 112, 15);
          ((ns) this).b((vg) (Object) var2, param0 + 6907);
          return;
        }
    }

    public static void j(byte param0) {
        field_nb = null;
        field_rb = null;
        field_qb = null;
        field_xb = null;
        if (param0 > -71) {
            field_pb = false;
        }
    }

    final void i(byte param0) {
        if (!((ns) this).field_E) {
          return;
        } else {
          ((ns) this).field_E = false;
          if (((ns) this).field_tb) {
            nb.a(126);
            if (param0 != -104) {
              ((ns) this).i((byte) -32);
              return;
            } else {
              return;
            }
          } else {
            if (((ns) this).field_vb) {
              ur.j(0);
              if (param0 == -104) {
                return;
              } else {
                ((ns) this).i((byte) -32);
                return;
              }
            } else {
              if (param0 == -104) {
                return;
              } else {
                ((ns) this).i((byte) -32);
                return;
              }
            }
          }
        }
    }

    public void a(kg param0, int param1, int param2, int param3, int param4) {
        if (param1 == 6) {
          if (((ns) this).field_sb) {
            qj.a((byte) -127, 3);
            ((ns) this).i((byte) -104);
            return;
          } else {
            sl.a("tochangedisplayname.ws", kq.f((byte) 126), (byte) 63);
            return;
          }
        } else {
          ((ns) this).field_sb = false;
          if (((ns) this).field_sb) {
            qj.a((byte) -127, 3);
            ((ns) this).i((byte) -104);
            return;
          } else {
            sl.a("tochangedisplayname.ws", kq.f((byte) 126), (byte) 63);
            return;
          }
        }
    }

    ns(tc param0, nq param1, String param2, boolean param3, boolean param4) {
        super(param0, (vg) (Object) new cf((ns) null, param1, param2), 77, 10, 10);
        ((ns) this).field_sb = false;
        ((ns) this).field_tb = param3 ? true : false;
        ((ns) this).field_vb = param4 ? true : false;
        ((ns) this).field_wb = false;
        ((ns) this).field_ub = param1;
        ((ns) this).field_yb = new md(13, 50, 274, 30, 15, 2113632, 4210752);
        ((ns) this).field_yb.field_L = true;
        ((ns) this).b((byte) -43, (vg) (Object) ((ns) this).field_yb);
    }

    final boolean a(int param0, char param1, int param2, vg param3) {
        if (!(param0 != param2)) {
            ((ns) this).i((byte) -104);
            return true;
        }
        return super.a(param0, param1, param2 + 0, param3);
    }

    final void a(String param0, int param1, int param2) {
        cf var4 = null;
        int var5 = 0;
        cf var6 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        cf stackIn_8_0 = null;
        cf stackIn_9_0 = null;
        cf stackIn_10_0 = null;
        String stackIn_10_1 = null;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        cf stackOut_7_0 = null;
        cf stackOut_9_0 = null;
        String stackOut_9_1 = null;
        cf stackOut_8_0 = null;
        String stackOut_8_1 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!((ns) this).field_wb) {
          L0: {
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
          ((ns) this).field_sb = stackIn_5_1 != 0;
          ((ns) this).field_wb = true;
          ((ns) this).field_yb.a(4210752, 8405024, -27855);
          var6 = new cf((ns) this, ((ns) this).field_ub, param0);
          var4 = var6;
          if (5 == param1) {
            var6.a(gg.field_b, (byte) 125, 11);
            var6.a(em.field_g, (byte) 120, 17);
            if (param2 <= -41) {
              if (3 == param1) {
                var6.a(rs.field_yb, (byte) 100, 7);
                ((ns) this).b((vg) (Object) var6, 110);
                return;
              } else {
                if (-5 != param1) {
                  if (-7 == param1) {
                    var6.a(bf.field_d, (byte) 107, 9);
                    ((ns) this).b((vg) (Object) var6, 110);
                    return;
                  } else {
                    if (param1 == 9) {
                      kg discarded$4 = var6.a((ko) this, 126, ib.field_d);
                      ((ns) this).b((vg) (Object) var6, 110);
                      return;
                    } else {
                      ((ns) this).b((vg) (Object) var6, 110);
                      return;
                    }
                  }
                } else {
                  var6.a(pf.field_f, (byte) 122, 8);
                  ((ns) this).b((vg) (Object) var6, 110);
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            if ((param1 ^ -1) == -257) {
              kg discarded$5 = var6.a((ko) this, 121, ts.field_E);
              if (param2 <= -41) {
                if (3 == param1) {
                  var6.a(rs.field_yb, (byte) 100, 7);
                  ((ns) this).b((vg) (Object) var6, 110);
                  return;
                } else {
                  if (-5 != param1) {
                    if (-7 == param1) {
                      var6.a(bf.field_d, (byte) 107, 9);
                      ((ns) this).b((vg) (Object) var6, 110);
                      return;
                    } else {
                      if (param1 == 9) {
                        kg discarded$6 = var6.a((ko) this, 126, ib.field_d);
                        ((ns) this).b((vg) (Object) var6, 110);
                        return;
                      } else {
                        ((ns) this).b((vg) (Object) var6, 110);
                        return;
                      }
                    }
                  } else {
                    var6.a(pf.field_f, (byte) 122, 8);
                    ((ns) this).b((vg) (Object) var6, 110);
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              L1: {
                stackOut_7_0 = (cf) var6;
                stackIn_9_0 = stackOut_7_0;
                stackIn_8_0 = stackOut_7_0;
                if (!((ns) this).field_tb) {
                  stackOut_9_0 = (cf) (Object) stackIn_9_0;
                  stackOut_9_1 = ss.field_e;
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  break L1;
                } else {
                  stackOut_8_0 = (cf) (Object) stackIn_8_0;
                  stackOut_8_1 = ts.field_E;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  break L1;
                }
              }
              ((cf) (Object) stackIn_10_0).a(stackIn_10_1, (byte) 119, -1);
              if (param2 <= -41) {
                if (3 == param1) {
                  var6.a(rs.field_yb, (byte) 100, 7);
                  ((ns) this).b((vg) (Object) var6, 110);
                  return;
                } else {
                  if (-5 != param1) {
                    if (-7 == param1) {
                      var6.a(bf.field_d, (byte) 107, 9);
                      ((ns) this).b((vg) (Object) var6, 110);
                      return;
                    } else {
                      if (param1 == 9) {
                        kg discarded$7 = var6.a((ko) this, 126, ib.field_d);
                        ((ns) this).b((vg) (Object) var6, 110);
                        return;
                      } else {
                        ((ns) this).b((vg) (Object) var6, 110);
                        return;
                      }
                    }
                  } else {
                    var6.a(pf.field_f, (byte) 122, 8);
                    ((ns) this).b((vg) (Object) var6, 110);
                    return;
                  }
                }
              } else {
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_qb = "You can join this game";
        field_pb = true;
        field_nb = new np(1);
    }
}
