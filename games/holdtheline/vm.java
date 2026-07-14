/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vm extends ab implements pi {
    private boolean field_wb;
    static String field_zb;
    private a field_sb;
    private boolean field_yb;
    static hj[] field_Ab;
    static String field_ub;
    static String field_xb;
    static int field_Bb;
    static String field_tb;
    static hj field_vb;

    final boolean g(byte param0) {
        nd var2 = null;
        if (((vm) this).field_F) {
          if (!((vm) this).field_wb) {
            var2 = th.c((byte) -67);
            if (var2 != null) {
              this.a((byte) 100, false, var2);
              if (param0 != 39) {
                return false;
              } else {
                return super.g((byte) 39);
              }
            } else {
              if (param0 != 39) {
                return false;
              } else {
                return super.g((byte) 39);
              }
            }
          } else {
            if (param0 != 39) {
              return false;
            } else {
              return super.g((byte) 39);
            }
          }
        } else {
          if (param0 != 39) {
            return false;
          } else {
            return super.g((byte) 39);
          }
        }
    }

    private final void a(byte param0, boolean param1, nd param2) {
        nh var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        nh var9 = null;
        String var10 = null;
        nh var11 = null;
        String var12 = null;
        nh var13 = null;
        String var14 = null;
        nh var15 = null;
        nh var16 = null;
        var7 = HoldTheLine.field_D;
        ((vm) this).field_wb = true;
        var6 = 74 / ((7 - param0) / 34);
        if (!param2.field_f) {
          if (null != param2.field_j) {
            var14 = ud.field_j;
            if (((vm) this).field_sb != null) {
              ((vm) this).field_sb.a((byte) 125);
              var16 = new nh((ab) this, de.field_I, var14);
              var5 = var16;
              if (param2.field_f) {
                if (param2.field_i) {
                  ((vm) this).a((n) (Object) new bj((vm) this), (byte) 126);
                  return;
                } else {
                  rm discarded$10 = var16.a(112, (tb) this, sf.field_j);
                  ((vm) this).a((n) (Object) var16, (byte) 127);
                  return;
                }
              } else {
                if (((vm) this).field_yb) {
                  rm discarded$11 = var16.a(81, (tb) this, sf.field_j);
                  if (-4 == (param2.field_b ^ -1)) {
                    var16.a(7, ek.field_u, (byte) 61);
                    ((vm) this).a((n) (Object) var16, (byte) 127);
                    return;
                  } else {
                    if ((param2.field_b ^ -1) != -7) {
                      ((vm) this).a((n) (Object) var16, (byte) 127);
                      return;
                    } else {
                      var16.a(9, gb.field_d, (byte) 77);
                      ((vm) this).a((n) (Object) var16, (byte) 127);
                      return;
                    }
                  }
                } else {
                  if (-6 == param2.field_b) {
                    var16.a(11, vn.field_b, (byte) 66);
                    var16.a(17, dl.field_n, (byte) 120);
                    if (-4 == (param2.field_b ^ -1)) {
                      var16.a(7, ek.field_u, (byte) 61);
                      ((vm) this).a((n) (Object) var16, (byte) 127);
                      return;
                    } else {
                      if ((param2.field_b ^ -1) != -7) {
                        ((vm) this).a((n) (Object) var16, (byte) 127);
                        return;
                      } else {
                        var16.a(9, gb.field_d, (byte) 77);
                        ((vm) this).a((n) (Object) var16, (byte) 127);
                        return;
                      }
                    }
                  } else {
                    var16.a(-1, kn.field_i, (byte) 108);
                    if (-4 == param2.field_b) {
                      var16.a(7, ek.field_u, (byte) 61);
                      ((vm) this).a((n) (Object) var16, (byte) 127);
                      return;
                    } else {
                      if ((param2.field_b ^ -1) != -7) {
                        ((vm) this).a((n) (Object) var16, (byte) 127);
                        return;
                      } else {
                        var16.a(9, gb.field_d, (byte) 77);
                        ((vm) this).a((n) (Object) var16, (byte) 127);
                        return;
                      }
                    }
                  }
                }
              }
            } else {
              var15 = new nh((ab) this, de.field_I, var14);
              var5 = var15;
              if (param2.field_f) {
                if (param2.field_i) {
                  ((vm) this).a((n) (Object) new bj((vm) this), (byte) 126);
                  return;
                } else {
                  rm discarded$12 = var15.a(112, (tb) this, sf.field_j);
                  ((vm) this).a((n) (Object) var15, (byte) 127);
                  return;
                }
              } else {
                if (((vm) this).field_yb) {
                  rm discarded$13 = var15.a(81, (tb) this, sf.field_j);
                  if (-4 == (param2.field_b ^ -1)) {
                    var15.a(7, ek.field_u, (byte) 61);
                    ((vm) this).a((n) (Object) var15, (byte) 127);
                    return;
                  } else {
                    if ((param2.field_b ^ -1) != -7) {
                      ((vm) this).a((n) (Object) var15, (byte) 127);
                      return;
                    } else {
                      var15.a(9, gb.field_d, (byte) 77);
                      ((vm) this).a((n) (Object) var15, (byte) 127);
                      return;
                    }
                  }
                } else {
                  if (-6 == param2.field_b) {
                    var15.a(11, vn.field_b, (byte) 66);
                    var15.a(17, dl.field_n, (byte) 120);
                    if (-4 == (param2.field_b ^ -1)) {
                      var15.a(7, ek.field_u, (byte) 61);
                      ((vm) this).a((n) (Object) var15, (byte) 127);
                      return;
                    } else {
                      if ((param2.field_b ^ -1) != -7) {
                        ((vm) this).a((n) (Object) var15, (byte) 127);
                        return;
                      } else {
                        var15.a(9, gb.field_d, (byte) 77);
                        ((vm) this).a((n) (Object) var15, (byte) 127);
                        return;
                      }
                    }
                  } else {
                    var15.a(-1, kn.field_i, (byte) 108);
                    if (-4 == param2.field_b) {
                      var15.a(7, ek.field_u, (byte) 61);
                      ((vm) this).a((n) (Object) var15, (byte) 127);
                      return;
                    } else {
                      if ((param2.field_b ^ -1) != -7) {
                        ((vm) this).a((n) (Object) var15, (byte) 127);
                        return;
                      } else {
                        var15.a(9, gb.field_d, (byte) 77);
                        ((vm) this).a((n) (Object) var15, (byte) 127);
                        return;
                      }
                    }
                  }
                }
              }
            }
          } else {
            var10 = param2.field_d;
            if (-249 == (param2.field_b ^ -1)) {
              L0: {
                if (!param1) {
                  qf.a(true);
                  break L0;
                } else {
                  break L0;
                }
              }
              var12 = vn.field_e;
              ((vm) this).field_yb = true;
              var13 = new nh((ab) this, de.field_I, var12);
              if (param2.field_f) {
                if (param2.field_i) {
                  ((vm) this).a((n) (Object) new bj((vm) this), (byte) 126);
                  return;
                } else {
                  rm discarded$14 = var13.a(112, (tb) this, sf.field_j);
                  ((vm) this).a((n) (Object) var13, (byte) 127);
                  return;
                }
              } else {
                L1: {
                  if (((vm) this).field_yb) {
                    rm discarded$15 = var13.a(81, (tb) this, sf.field_j);
                    break L1;
                  } else {
                    if (-6 == (param2.field_b ^ -1)) {
                      var13.a(11, vn.field_b, (byte) 66);
                      var13.a(17, dl.field_n, (byte) 120);
                      break L1;
                    } else {
                      var13.a(-1, kn.field_i, (byte) 108);
                      break L1;
                    }
                  }
                }
                if (-4 == (param2.field_b ^ -1)) {
                  var13.a(7, ek.field_u, (byte) 61);
                  ((vm) this).a((n) (Object) var13, (byte) 127);
                  return;
                } else {
                  if ((param2.field_b ^ -1) == -7) {
                    var13.a(9, gb.field_d, (byte) 77);
                    ((vm) this).a((n) (Object) var13, (byte) 127);
                    return;
                  } else {
                    ((vm) this).a((n) (Object) var13, (byte) 127);
                    return;
                  }
                }
              }
            } else {
              var11 = new nh((ab) this, de.field_I, var10);
              var5 = var11;
              if (param2.field_f) {
                if (param2.field_i) {
                  ((vm) this).a((n) (Object) new bj((vm) this), (byte) 126);
                  return;
                } else {
                  rm discarded$16 = var11.a(112, (tb) this, sf.field_j);
                  ((vm) this).a((n) (Object) var11, (byte) 127);
                  return;
                }
              } else {
                if (((vm) this).field_yb) {
                  rm discarded$17 = var11.a(81, (tb) this, sf.field_j);
                  if (-4 == (param2.field_b ^ -1)) {
                    var11.a(7, ek.field_u, (byte) 61);
                    ((vm) this).a((n) (Object) var11, (byte) 127);
                    return;
                  } else {
                    if ((param2.field_b ^ -1) != -7) {
                      ((vm) this).a((n) (Object) var11, (byte) 127);
                      return;
                    } else {
                      var11.a(9, gb.field_d, (byte) 77);
                      ((vm) this).a((n) (Object) var11, (byte) 127);
                      return;
                    }
                  }
                } else {
                  if (-6 == param2.field_b) {
                    var11.a(11, vn.field_b, (byte) 66);
                    var11.a(17, dl.field_n, (byte) 120);
                    if (-4 == (param2.field_b ^ -1)) {
                      var11.a(7, ek.field_u, (byte) 61);
                      ((vm) this).a((n) (Object) var11, (byte) 127);
                      return;
                    } else {
                      if ((param2.field_b ^ -1) != -7) {
                        ((vm) this).a((n) (Object) var11, (byte) 127);
                        return;
                      } else {
                        var11.a(9, gb.field_d, (byte) 77);
                        ((vm) this).a((n) (Object) var11, (byte) 127);
                        return;
                      }
                    }
                  } else {
                    var11.a(-1, kn.field_i, (byte) 108);
                    if (-4 == param2.field_b) {
                      var11.a(7, ek.field_u, (byte) 61);
                      ((vm) this).a((n) (Object) var11, (byte) 127);
                      return;
                    } else {
                      if ((param2.field_b ^ -1) != -7) {
                        ((vm) this).a((n) (Object) var11, (byte) 127);
                        return;
                      } else {
                        var11.a(9, gb.field_d, (byte) 77);
                        ((vm) this).a((n) (Object) var11, (byte) 127);
                        return;
                      }
                    }
                  }
                }
              }
            }
          }
        } else {
          var8 = nh.field_H;
          var9 = new nh((ab) this, de.field_I, var8);
          if (param2.field_f) {
            if (param2.field_i) {
              ((vm) this).a((n) (Object) new bj((vm) this), (byte) 126);
              return;
            } else {
              rm discarded$18 = var9.a(112, (tb) this, sf.field_j);
              ((vm) this).a((n) (Object) var9, (byte) 127);
              return;
            }
          } else {
            L2: {
              if (((vm) this).field_yb) {
                rm discarded$19 = var9.a(81, (tb) this, sf.field_j);
                break L2;
              } else {
                if (-6 == (param2.field_b ^ -1)) {
                  var9.a(11, vn.field_b, (byte) 66);
                  var9.a(17, dl.field_n, (byte) 120);
                  break L2;
                } else {
                  var9.a(-1, kn.field_i, (byte) 108);
                  break L2;
                }
              }
            }
            if (-4 == (param2.field_b ^ -1)) {
              var9.a(7, ek.field_u, (byte) 61);
              ((vm) this).a((n) (Object) var9, (byte) 127);
              return;
            } else {
              if ((param2.field_b ^ -1) == -7) {
                var9.a(9, gb.field_d, (byte) 77);
                ((vm) this).a((n) (Object) var9, (byte) 127);
                return;
              } else {
                ((vm) this).a((n) (Object) var9, (byte) 127);
                return;
              }
            }
          }
        }
    }

    public static void p(int param0) {
        field_Ab = null;
        if (param0 != -7) {
          field_ub = null;
          field_xb = null;
          field_ub = null;
          field_tb = null;
          field_zb = null;
          field_vb = null;
          return;
        } else {
          field_xb = null;
          field_ub = null;
          field_tb = null;
          field_zb = null;
          field_vb = null;
          return;
        }
    }

    public final void a(int param0, rm param1, int param2, int param3, int param4) {
        Object var7 = null;
        if (!((vm) this).field_yb) {
          hk.a(true);
          if (param2 != -4) {
            var7 = null;
            this.a((byte) 98, true, (nd) null);
            ((vm) this).h((byte) -72);
            return;
          } else {
            ((vm) this).h((byte) -72);
            return;
          }
        } else {
          cg.a((byte) -93, true, false);
          return;
        }
    }

    final void q(int param0) {
        if (param0 > -113) {
            return;
        }
        this.a((byte) -39, true, ij.a(vn.field_e, 256, 248));
    }

    vm(qj param0, a param1) {
        super(param0, de.field_I, na.field_o, false, false);
        ((vm) this).field_sb = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_zb = "<br>Lap: ";
        field_ub = "Unable to connect to the data server. Please check any firewall you are using.";
        field_Bb = 0;
        field_tb = "<col=2>Not complete</col>";
        field_xb = "<img=0>, <img=7>";
    }
}
