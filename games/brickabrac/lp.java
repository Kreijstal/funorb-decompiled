/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lp extends fe implements en {
    static vl field_wb;
    private boolean field_Bb;
    private boolean field_vb;
    private boolean field_tb;
    private cr field_qb;
    private boolean field_zb;
    static jp[] field_yb;
    static mh field_Ab;
    static qh field_xb;
    private dh field_sb;
    static gf field_rb;
    static tg field_ub;

    final boolean a(int param0, byte param1, oc param2, char param3) {
        if (13 == param0) {
          ((lp) this).m(param1 ^ 127);
          return true;
        } else {
          if (param1 != 110) {
            field_rb = null;
            return super.a(param0, (byte) 110, param2, param3);
          } else {
            return super.a(param0, (byte) 110, param2, param3);
          }
        }
    }

    final static boolean n(int param0) {
        if (param0 == -5) {
          if (mj.a((byte) -80)) {
            if (0 != (de.field_x & 8)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_yb = null;
          if (mj.a((byte) -80)) {
            if (0 != (de.field_x & 8)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final void i(byte param0) {
        ec var2 = null;
        ((lp) this).field_qb.b(2121792, 4210752, 2);
        var2 = new ec((lp) this, ((lp) this).field_sb, qb.field_t);
        if (param0 >= -11) {
          return;
        } else {
          var2.a(false, pj.field_e, 15);
          ((lp) this).b((byte) 110, (oc) (Object) var2);
          return;
        }
    }

    public void a(int param0, int param1, byte param2, int param3, d param4) {
        if (!((lp) this).field_Bb) {
          kf.a("tochangedisplayname.ws", (byte) -113, uc.e((byte) -103));
          if (param2 < -22) {
            return;
          } else {
            lp.o(-11);
            return;
          }
        } else {
          bd.a(3, true);
          ((lp) this).m(17);
          if (param2 < -22) {
            return;
          } else {
            lp.o(-11);
            return;
          }
        }
    }

    final void a(int param0, boolean param1, String param2) {
        ec var4 = null;
        int var5 = 0;
        ec var6 = null;
        ec var7 = null;
        ec var8 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        ec stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        ec stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        ec stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        String stackIn_27_2 = null;
        ec stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        ec stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        ec stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        String stackIn_62_2 = null;
        Object stackOut_3_0;
        Object stackOut_5_0;
        int stackOut_5_1;
        Object stackOut_4_0;
        int stackOut_4_1;
        ec stackOut_59_0;
        int stackOut_59_1;
        ec stackOut_61_0;
        int stackOut_61_1;
        String stackOut_61_2;
        ec stackOut_60_0;
        int stackOut_60_1;
        String stackOut_60_2;
        ec stackOut_24_0;
        int stackOut_24_1;
        ec stackOut_26_0;
        int stackOut_26_1;
        String stackOut_26_2;
        ec stackOut_25_0;
        int stackOut_25_1;
        String stackOut_25_2;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (((lp) this).field_zb) {
          return;
        } else {
          L0: {
            stackOut_3_0 = this;
            stackIn_5_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (256 != param0) {
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
          ((lp) this).field_Bb = stackIn_6_1 != 0;
          ((lp) this).field_zb = true;
          ((lp) this).field_qb.b(8405024, 4210752, 2);
          if (param1) {
            ((lp) this).m(6);
            var8 = new ec((lp) this, ((lp) this).field_sb, param2);
            var6 = var8;
            var4 = var8;
            if (param0 == 5) {
              var8.a(param1, ec.field_L, 11);
              var8.a(false, wc.field_a, 17);
              if (param0 != 3) {
                if ((param0 ^ -1) != -5) {
                  if ((param0 ^ -1) == -7) {
                    var8.a(false, cb.field_p, 9);
                    ((lp) this).b((byte) 125, (oc) (Object) var8);
                    return;
                  } else {
                    if (9 == param0) {
                      d discarded$8 = var8.a((byte) 126, BrickABrac.field_G, (uh) this);
                      ((lp) this).b((byte) 125, (oc) (Object) var8);
                      return;
                    } else {
                      ((lp) this).b((byte) 125, (oc) (Object) var8);
                      return;
                    }
                  }
                } else {
                  var8.a(param1, ue.field_f, 8);
                  ((lp) this).b((byte) 125, (oc) (Object) var8);
                  return;
                }
              } else {
                var8.a(false, vn.field_H, 7);
                ((lp) this).b((byte) 125, (oc) (Object) var8);
                return;
              }
            } else {
              if (param0 == 256) {
                d discarded$9 = var8.a((byte) -78, oa.field_Tb, (uh) this);
                if (param0 != 3) {
                  if ((param0 ^ -1) != -5) {
                    if ((param0 ^ -1) == -7) {
                      var8.a(false, cb.field_p, 9);
                      ((lp) this).b((byte) 125, (oc) (Object) var8);
                      return;
                    } else {
                      if (9 == param0) {
                        d discarded$10 = var8.a((byte) 126, BrickABrac.field_G, (uh) this);
                        ((lp) this).b((byte) 125, (oc) (Object) var8);
                        return;
                      } else {
                        ((lp) this).b((byte) 125, (oc) (Object) var8);
                        return;
                      }
                    }
                  } else {
                    var8.a(param1, ue.field_f, 8);
                    ((lp) this).b((byte) 125, (oc) (Object) var8);
                    return;
                  }
                } else {
                  var8.a(false, vn.field_H, 7);
                  ((lp) this).b((byte) 125, (oc) (Object) var8);
                  return;
                }
              } else {
                L1: {
                  stackOut_59_0 = (ec) var8;
                  stackOut_59_1 = 0;
                  stackIn_61_0 = stackOut_59_0;
                  stackIn_61_1 = stackOut_59_1;
                  stackIn_60_0 = stackOut_59_0;
                  stackIn_60_1 = stackOut_59_1;
                  if (((lp) this).field_vb) {
                    stackOut_61_0 = (ec) (Object) stackIn_61_0;
                    stackOut_61_1 = stackIn_61_1;
                    stackOut_61_2 = oa.field_Tb;
                    stackIn_62_0 = stackOut_61_0;
                    stackIn_62_1 = stackOut_61_1;
                    stackIn_62_2 = stackOut_61_2;
                    break L1;
                  } else {
                    stackOut_60_0 = (ec) (Object) stackIn_60_0;
                    stackOut_60_1 = stackIn_60_1;
                    stackOut_60_2 = dp.field_s;
                    stackIn_62_0 = stackOut_60_0;
                    stackIn_62_1 = stackOut_60_1;
                    stackIn_62_2 = stackOut_60_2;
                    break L1;
                  }
                }
                ((ec) (Object) stackIn_62_0).a(stackIn_62_1 != 0, (String) (Object) stackIn_62_2, -1);
                if (param0 != 3) {
                  if ((param0 ^ -1) != -5) {
                    if ((param0 ^ -1) == -7) {
                      var8.a(false, cb.field_p, 9);
                      ((lp) this).b((byte) 125, (oc) (Object) var8);
                      return;
                    } else {
                      if (9 == param0) {
                        d discarded$11 = var8.a((byte) 126, BrickABrac.field_G, (uh) this);
                        ((lp) this).b((byte) 125, (oc) (Object) var8);
                        return;
                      } else {
                        ((lp) this).b((byte) 125, (oc) (Object) var8);
                        return;
                      }
                    }
                  } else {
                    var8.a(param1, ue.field_f, 8);
                    ((lp) this).b((byte) 125, (oc) (Object) var8);
                    return;
                  }
                } else {
                  var8.a(false, vn.field_H, 7);
                  ((lp) this).b((byte) 125, (oc) (Object) var8);
                  return;
                }
              }
            }
          } else {
            var7 = new ec((lp) this, ((lp) this).field_sb, param2);
            var6 = var7;
            var4 = var7;
            if (param0 != 5) {
              if (param0 == 256) {
                d discarded$12 = var7.a((byte) -78, oa.field_Tb, (uh) this);
                if (param0 != 3) {
                  if ((param0 ^ -1) != -5) {
                    if ((param0 ^ -1) == -7) {
                      var7.a(false, cb.field_p, 9);
                      ((lp) this).b((byte) 125, (oc) (Object) var7);
                      return;
                    } else {
                      if (9 == param0) {
                        d discarded$13 = var7.a((byte) 126, BrickABrac.field_G, (uh) this);
                        ((lp) this).b((byte) 125, (oc) (Object) var7);
                        return;
                      } else {
                        ((lp) this).b((byte) 125, (oc) (Object) var7);
                        return;
                      }
                    }
                  } else {
                    var7.a(param1, ue.field_f, 8);
                    ((lp) this).b((byte) 125, (oc) (Object) var7);
                    return;
                  }
                } else {
                  var7.a(false, vn.field_H, 7);
                  ((lp) this).b((byte) 125, (oc) (Object) var7);
                  return;
                }
              } else {
                L2: {
                  stackOut_24_0 = (ec) var7;
                  stackOut_24_1 = 0;
                  stackIn_26_0 = stackOut_24_0;
                  stackIn_26_1 = stackOut_24_1;
                  stackIn_25_0 = stackOut_24_0;
                  stackIn_25_1 = stackOut_24_1;
                  if (((lp) this).field_vb) {
                    stackOut_26_0 = (ec) (Object) stackIn_26_0;
                    stackOut_26_1 = stackIn_26_1;
                    stackOut_26_2 = oa.field_Tb;
                    stackIn_27_0 = stackOut_26_0;
                    stackIn_27_1 = stackOut_26_1;
                    stackIn_27_2 = stackOut_26_2;
                    break L2;
                  } else {
                    stackOut_25_0 = (ec) (Object) stackIn_25_0;
                    stackOut_25_1 = stackIn_25_1;
                    stackOut_25_2 = dp.field_s;
                    stackIn_27_0 = stackOut_25_0;
                    stackIn_27_1 = stackOut_25_1;
                    stackIn_27_2 = stackOut_25_2;
                    break L2;
                  }
                }
                ((ec) (Object) stackIn_27_0).a(stackIn_27_1 != 0, (String) (Object) stackIn_27_2, -1);
                if (param0 != 3) {
                  if ((param0 ^ -1) != -5) {
                    if ((param0 ^ -1) == -7) {
                      var7.a(false, cb.field_p, 9);
                      ((lp) this).b((byte) 125, (oc) (Object) var7);
                      return;
                    } else {
                      if (9 == param0) {
                        d discarded$14 = var7.a((byte) 126, BrickABrac.field_G, (uh) this);
                        ((lp) this).b((byte) 125, (oc) (Object) var7);
                        return;
                      } else {
                        ((lp) this).b((byte) 125, (oc) (Object) var7);
                        return;
                      }
                    }
                  } else {
                    var7.a(param1, ue.field_f, 8);
                    ((lp) this).b((byte) 125, (oc) (Object) var7);
                    return;
                  }
                } else {
                  var7.a(false, vn.field_H, 7);
                  ((lp) this).b((byte) 125, (oc) (Object) var7);
                  return;
                }
              }
            } else {
              var7.a(param1, ec.field_L, 11);
              var7.a(false, wc.field_a, 17);
              if (param0 != 3) {
                if ((param0 ^ -1) != -5) {
                  if ((param0 ^ -1) == -7) {
                    var7.a(false, cb.field_p, 9);
                    ((lp) this).b((byte) 125, (oc) (Object) var7);
                    return;
                  } else {
                    if (9 == param0) {
                      d discarded$15 = var7.a((byte) 126, BrickABrac.field_G, (uh) this);
                      ((lp) this).b((byte) 125, (oc) (Object) var7);
                      return;
                    } else {
                      ((lp) this).b((byte) 125, (oc) (Object) var7);
                      return;
                    }
                  }
                } else {
                  var7.a(param1, ue.field_f, 8);
                  ((lp) this).b((byte) 125, (oc) (Object) var7);
                  return;
                }
              } else {
                var7.a(false, vn.field_H, 7);
                ((lp) this).b((byte) 125, (oc) (Object) var7);
                return;
              }
            }
          }
        }
    }

    lp(cp param0, dh param1, String param2, boolean param3, boolean param4) {
        super(param0, (oc) (Object) new ec((lp) null, param1, param2), 77, 10, 10);
        ((lp) this).field_tb = param4 ? true : false;
        ((lp) this).field_vb = param3 ? true : false;
        ((lp) this).field_zb = false;
        ((lp) this).field_Bb = false;
        ((lp) this).field_sb = param1;
        ((lp) this).field_qb = new cr(13, 50, 274, 30, 15, 2113632, 4210752);
        ((lp) this).field_qb.field_J = true;
        ((lp) this).a((oc) (Object) ((lp) this).field_qb, true);
    }

    final void m(int param0) {
        if (param0 == 17) {
          if (!((lp) this).field_N) {
            return;
          } else {
            ((lp) this).field_N = false;
            if (!((lp) this).field_vb) {
              if (!((lp) this).field_tb) {
                return;
              } else {
                s.a((byte) -30);
                return;
              }
            } else {
              cb.e((byte) -46);
              return;
            }
          }
        } else {
          ((lp) this).field_vb = false;
          if (!((lp) this).field_N) {
            return;
          } else {
            ((lp) this).field_N = false;
            if (!((lp) this).field_vb) {
              if (!((lp) this).field_tb) {
                return;
              } else {
                s.a((byte) -30);
                return;
              }
            } else {
              cb.e((byte) -46);
              return;
            }
          }
        }
    }

    public static void o(int param0) {
        field_wb = null;
        field_ub = null;
        field_rb = null;
        field_Ab = null;
        if (param0 != 50) {
          lp.o(29);
          field_xb = null;
          field_yb = null;
          return;
        } else {
          field_xb = null;
          field_yb = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_wb = new vl();
        field_xb = new qh();
    }
}
