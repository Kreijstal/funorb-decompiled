/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class dg extends me implements qk {
    private ba field_ob;
    private boolean field_jb;
    static String field_sb;
    static String field_qb;
    private vm field_lb;
    static String field_rb;
    private boolean field_kb;
    private boolean field_mb;
    static String field_nb;
    static ji field_tb;
    private boolean field_pb;

    final void g(byte param0) {
        int var2 = 0;
        var2 = -74 % ((param0 - -80) / 36);
        if (((dg) this).field_F) {
          ((dg) this).field_F = false;
          if (!((dg) this).field_kb) {
            if (((dg) this).field_pb) {
              pe.b(true);
              return;
            } else {
              return;
            }
          } else {
            ed.b(0);
            return;
          }
        } else {
          return;
        }
    }

    public static void q(int param0) {
        field_tb = null;
        field_rb = null;
        field_sb = null;
        if (param0 != -257) {
            return;
        }
        field_nb = null;
        field_qb = null;
    }

    public void a(int param0, int param1, int param2, ph param3, byte param4) {
        int var6 = 0;
        var6 = 60 / ((-63 - param4) / 52);
        if (!((dg) this).field_mb) {
          ta.a(-320, "tochangedisplayname.ws", bn.c(-1));
          return;
        } else {
          g.a((byte) 62, 3);
          ((dg) this).g((byte) -122);
          return;
        }
    }

    dg(gg param0, vm param1, String param2, boolean param3, boolean param4) {
        super(param0, (ag) (Object) new qi((dg) null, param1, param2), 77, 10, 10);
        ((dg) this).field_mb = false;
        ((dg) this).field_jb = false;
        ((dg) this).field_pb = param4 ? true : false;
        ((dg) this).field_kb = param3 ? true : false;
        ((dg) this).field_lb = param1;
        ((dg) this).field_ob = new ba(13, 50, 274, 30, 15, 2113632, 4210752);
        ((dg) this).field_ob.field_E = true;
        ((dg) this).a(51448, (ag) (Object) ((dg) this).field_ob);
    }

    final void p(int param0) {
        qi var2 = null;
        Object var3 = null;
        ((dg) this).field_ob.a(2121792, 4210752, -1);
        var2 = new qi((dg) this, ((dg) this).field_lb, id.field_l);
        if (param0 >= -33) {
          var3 = null;
          ((dg) this).a(117, -124, (String) null);
          var2.a(22770, 15, ui.field_h);
          ((dg) this).b((ag) (Object) var2, (byte) 110);
          return;
        } else {
          var2.a(22770, 15, ui.field_h);
          ((dg) this).b((ag) (Object) var2, (byte) 110);
          return;
        }
    }

    final boolean a(int param0, ag param1, int param2, char param3) {
        if (param0 == 274) {
          if (param2 == 13) {
            ((dg) this).g((byte) -116);
            return true;
          } else {
            return super.a(274, param1, param2, param3);
          }
        } else {
          ((dg) this).g((byte) 92);
          if (param2 == 13) {
            ((dg) this).g((byte) -116);
            return true;
          } else {
            return super.a(274, param1, param2, param3);
          }
        }
    }

    final void a(int param0, int param1, String param2) {
        int var5 = 0;
        qi var6 = null;
        qi var7 = null;
        qi var8 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        qi stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        qi stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        qi stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        String stackIn_25_3 = null;
        qi stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        int stackIn_54_2 = 0;
        qi stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        int stackIn_55_2 = 0;
        qi stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        int stackIn_56_2 = 0;
        String stackIn_56_3 = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        qi stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        int stackOut_53_2 = 0;
        qi stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        int stackOut_55_2 = 0;
        String stackOut_55_3 = null;
        qi stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        int stackOut_54_2 = 0;
        String stackOut_54_3 = null;
        qi stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        qi stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        String stackOut_24_3 = null;
        qi stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        String stackOut_23_3 = null;
        var5 = HostileSpawn.field_I ? 1 : 0;
        if (((dg) this).field_jb) {
          return;
        } else {
          L0: {
            ((dg) this).field_jb = true;
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
          ((dg) this).field_mb = stackIn_6_1 != 0;
          ((dg) this).field_ob.a(8405024, 4210752, -1);
          if (param1 != 17) {
            ((dg) this).field_kb = false;
            var8 = new qi((dg) this, ((dg) this).field_lb, param2);
            var6 = var8;
            if (param0 == 5) {
              var8.a(param1 + 22753, 11, im.field_b);
              var8.a(22770, 17, sc.field_k);
              if (param0 != -4) {
                if (-5 != param0) {
                  if (param0 == 6) {
                    var8.a(param1 + 22753, 9, wc.field_k);
                    ((dg) this).b((ag) (Object) var8, (byte) 110);
                    return;
                  } else {
                    if ((param0 ^ -1) == -10) {
                      ph discarded$8 = var8.a((mh) this, md.field_j, 30);
                      ((dg) this).b((ag) (Object) var8, (byte) 110);
                      return;
                    } else {
                      ((dg) this).b((ag) (Object) var8, (byte) 110);
                      return;
                    }
                  }
                } else {
                  var8.a(param1 + 22753, 8, pe.field_gb);
                  ((dg) this).b((ag) (Object) var8, (byte) 110);
                  return;
                }
              } else {
                var8.a(22770, 7, pf.field_N);
                ((dg) this).b((ag) (Object) var8, (byte) 110);
                return;
              }
            } else {
              if (-257 == (param0 ^ -1)) {
                ph discarded$9 = var8.a((mh) this, hf.field_f, 30);
                if (param0 != -4) {
                  if (-5 != param0) {
                    if (param0 == 6) {
                      var8.a(param1 + 22753, 9, wc.field_k);
                      ((dg) this).b((ag) (Object) var8, (byte) 110);
                      return;
                    } else {
                      if ((param0 ^ -1) == -10) {
                        ph discarded$10 = var8.a((mh) this, md.field_j, 30);
                        ((dg) this).b((ag) (Object) var8, (byte) 110);
                        return;
                      } else {
                        ((dg) this).b((ag) (Object) var8, (byte) 110);
                        return;
                      }
                    }
                  } else {
                    var8.a(param1 + 22753, 8, pe.field_gb);
                    ((dg) this).b((ag) (Object) var8, (byte) 110);
                    return;
                  }
                } else {
                  var8.a(22770, 7, pf.field_N);
                  ((dg) this).b((ag) (Object) var8, (byte) 110);
                  return;
                }
              } else {
                L1: {
                  stackOut_53_0 = (qi) var8;
                  stackOut_53_1 = param1 + 22753;
                  stackOut_53_2 = -1;
                  stackIn_55_0 = stackOut_53_0;
                  stackIn_55_1 = stackOut_53_1;
                  stackIn_55_2 = stackOut_53_2;
                  stackIn_54_0 = stackOut_53_0;
                  stackIn_54_1 = stackOut_53_1;
                  stackIn_54_2 = stackOut_53_2;
                  if (!((dg) this).field_kb) {
                    stackOut_55_0 = (qi) (Object) stackIn_55_0;
                    stackOut_55_1 = stackIn_55_1;
                    stackOut_55_2 = stackIn_55_2;
                    stackOut_55_3 = hg.field_d;
                    stackIn_56_0 = stackOut_55_0;
                    stackIn_56_1 = stackOut_55_1;
                    stackIn_56_2 = stackOut_55_2;
                    stackIn_56_3 = stackOut_55_3;
                    break L1;
                  } else {
                    stackOut_54_0 = (qi) (Object) stackIn_54_0;
                    stackOut_54_1 = stackIn_54_1;
                    stackOut_54_2 = stackIn_54_2;
                    stackOut_54_3 = hf.field_f;
                    stackIn_56_0 = stackOut_54_0;
                    stackIn_56_1 = stackOut_54_1;
                    stackIn_56_2 = stackOut_54_2;
                    stackIn_56_3 = stackOut_54_3;
                    break L1;
                  }
                }
                ((qi) (Object) stackIn_56_0).a(stackIn_56_1, stackIn_56_2, stackIn_56_3);
                if (param0 != -4) {
                  if (-5 != param0) {
                    if (param0 == 6) {
                      var8.a(param1 + 22753, 9, wc.field_k);
                      ((dg) this).b((ag) (Object) var8, (byte) 110);
                      return;
                    } else {
                      if ((param0 ^ -1) == -10) {
                        ph discarded$11 = var8.a((mh) this, md.field_j, 30);
                        ((dg) this).b((ag) (Object) var8, (byte) 110);
                        return;
                      } else {
                        ((dg) this).b((ag) (Object) var8, (byte) 110);
                        return;
                      }
                    }
                  } else {
                    var8.a(param1 + 22753, 8, pe.field_gb);
                    ((dg) this).b((ag) (Object) var8, (byte) 110);
                    return;
                  }
                } else {
                  var8.a(22770, 7, pf.field_N);
                  ((dg) this).b((ag) (Object) var8, (byte) 110);
                  return;
                }
              }
            }
          } else {
            var7 = new qi((dg) this, ((dg) this).field_lb, param2);
            var6 = var7;
            if (param0 != 5) {
              if (-257 == (param0 ^ -1)) {
                ph discarded$12 = var7.a((mh) this, hf.field_f, 30);
                if (param0 != -4) {
                  if (-5 != param0) {
                    if (param0 == 6) {
                      var7.a(param1 + 22753, 9, wc.field_k);
                      ((dg) this).b((ag) (Object) var7, (byte) 110);
                      return;
                    } else {
                      if ((param0 ^ -1) == -10) {
                        ph discarded$13 = var7.a((mh) this, md.field_j, 30);
                        ((dg) this).b((ag) (Object) var7, (byte) 110);
                        return;
                      } else {
                        ((dg) this).b((ag) (Object) var7, (byte) 110);
                        return;
                      }
                    }
                  } else {
                    var7.a(param1 + 22753, 8, pe.field_gb);
                    ((dg) this).b((ag) (Object) var7, (byte) 110);
                    return;
                  }
                } else {
                  var7.a(22770, 7, pf.field_N);
                  ((dg) this).b((ag) (Object) var7, (byte) 110);
                  return;
                }
              } else {
                L2: {
                  stackOut_22_0 = (qi) var7;
                  stackOut_22_1 = param1 + 22753;
                  stackOut_22_2 = -1;
                  stackIn_24_0 = stackOut_22_0;
                  stackIn_24_1 = stackOut_22_1;
                  stackIn_24_2 = stackOut_22_2;
                  stackIn_23_0 = stackOut_22_0;
                  stackIn_23_1 = stackOut_22_1;
                  stackIn_23_2 = stackOut_22_2;
                  if (!((dg) this).field_kb) {
                    stackOut_24_0 = (qi) (Object) stackIn_24_0;
                    stackOut_24_1 = stackIn_24_1;
                    stackOut_24_2 = stackIn_24_2;
                    stackOut_24_3 = hg.field_d;
                    stackIn_25_0 = stackOut_24_0;
                    stackIn_25_1 = stackOut_24_1;
                    stackIn_25_2 = stackOut_24_2;
                    stackIn_25_3 = stackOut_24_3;
                    break L2;
                  } else {
                    stackOut_23_0 = (qi) (Object) stackIn_23_0;
                    stackOut_23_1 = stackIn_23_1;
                    stackOut_23_2 = stackIn_23_2;
                    stackOut_23_3 = hf.field_f;
                    stackIn_25_0 = stackOut_23_0;
                    stackIn_25_1 = stackOut_23_1;
                    stackIn_25_2 = stackOut_23_2;
                    stackIn_25_3 = stackOut_23_3;
                    break L2;
                  }
                }
                ((qi) (Object) stackIn_25_0).a(stackIn_25_1, stackIn_25_2, stackIn_25_3);
                if (param0 != -4) {
                  if (-5 != param0) {
                    if (param0 == 6) {
                      var7.a(param1 + 22753, 9, wc.field_k);
                      ((dg) this).b((ag) (Object) var7, (byte) 110);
                      return;
                    } else {
                      if ((param0 ^ -1) == -10) {
                        ph discarded$14 = var7.a((mh) this, md.field_j, 30);
                        ((dg) this).b((ag) (Object) var7, (byte) 110);
                        return;
                      } else {
                        ((dg) this).b((ag) (Object) var7, (byte) 110);
                        return;
                      }
                    }
                  } else {
                    var7.a(param1 + 22753, 8, pe.field_gb);
                    ((dg) this).b((ag) (Object) var7, (byte) 110);
                    return;
                  }
                } else {
                  var7.a(22770, 7, pf.field_N);
                  ((dg) this).b((ag) (Object) var7, (byte) 110);
                  return;
                }
              }
            } else {
              var7.a(param1 + 22753, 11, im.field_b);
              var7.a(22770, 17, sc.field_k);
              if (param0 != -4) {
                if (-5 != param0) {
                  if (param0 == 6) {
                    var7.a(param1 + 22753, 9, wc.field_k);
                    ((dg) this).b((ag) (Object) var7, (byte) 110);
                    return;
                  } else {
                    if ((param0 ^ -1) == -10) {
                      ph discarded$15 = var7.a((mh) this, md.field_j, 30);
                      ((dg) this).b((ag) (Object) var7, (byte) 110);
                      return;
                    } else {
                      ((dg) this).b((ag) (Object) var7, (byte) 110);
                      return;
                    }
                  }
                } else {
                  var7.a(param1 + 22753, 8, pe.field_gb);
                  ((dg) this).b((ag) (Object) var7, (byte) 110);
                  return;
                }
              } else {
                var7.a(22770, 7, pf.field_N);
                ((dg) this).b((ag) (Object) var7, (byte) 110);
                return;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_qb = "Waiting for extra data";
        field_nb = "Username: ";
        field_rb = "Waiting for levels";
        field_sb = "Unfortunately you are not eligible to create an account.";
    }
}
