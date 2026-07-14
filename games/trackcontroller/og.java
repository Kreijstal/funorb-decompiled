/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og extends jj implements m {
    static int field_pb;
    static ih field_rb;
    static String field_qb;
    private vd field_mb;
    private boolean field_lb;
    static String field_nb;
    private boolean field_ob;

    og(vl param0, vd param1) {
        super(param0, p.field_a, sa.field_J, false, false);
        ((og) this).field_mb = param1;
    }

    final boolean j(int param0) {
        nj var2 = null;
        if (param0 < -18) {
          if (((og) this).field_E) {
            if (!((og) this).field_ob) {
              var2 = dd.d((byte) 91);
              if (var2 == null) {
                return super.j(-56);
              } else {
                this.a(false, var2, 7);
                return super.j(-56);
              }
            } else {
              return super.j(-56);
            }
          } else {
            return super.j(-56);
          }
        } else {
          return false;
        }
    }

    final static void f(byte param0) {
        fi.field_o = false;
        if (param0 != -83) {
            return;
        }
        int discarded$0 = ne.field_a.h(16383);
    }

    final void u(int param0) {
        this.a(true, wg.a((byte) -123, 248, pi.field_h), 7);
        int var2 = 58 % ((param0 - -61) / 57);
    }

    private final void a(boolean param0, nj param1, int param2) {
        String var4 = null;
        lc var5 = null;
        int var6 = 0;
        String var7 = null;
        lc var8 = null;
        lc var9 = null;
        L0: {
          var6 = TrackController.field_F ? 1 : 0;
          ((og) this).field_ob = true;
          if (param1.field_e) {
            var4 = tk.field_s;
            break L0;
          } else {
            if (null == param1.field_a) {
              var7 = param1.field_c;
              if (248 == param1.field_b) {
                L1: {
                  if (!param0) {
                    db.b(true);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var4 = pi.field_h;
                ((og) this).field_lb = true;
                break L0;
              } else {
                var8 = new lc((jj) this, p.field_a, var7);
                var5 = var8;
                if (param1.field_e) {
                  if (param1.field_f) {
                    ((og) this).b((al) (Object) new ge((og) this), param2 ^ -118);
                    return;
                  } else {
                    rh discarded$4 = var8.a(param2 + -21, (tg) this, hd.field_m);
                    if (param2 != 7) {
                      return;
                    } else {
                      ((og) this).b((al) (Object) var8, param2 + -109);
                      return;
                    }
                  }
                } else {
                  if (((og) this).field_lb) {
                    L2: {
                      rh discarded$5 = var8.a(-14, (tg) this, hd.field_m);
                      if (-4 != param1.field_b) {
                        if (-7 == param1.field_b) {
                          var8.a(-17040, md.field_c, 9);
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        var8.a(-17040, ea.field_y, 7);
                        break L2;
                      }
                    }
                    if (param2 != 7) {
                      return;
                    } else {
                      ((og) this).b((al) (Object) var8, param2 + -109);
                      return;
                    }
                  } else {
                    if (param1.field_b == 5) {
                      L3: {
                        var8.a(-17040, dh.field_r, 11);
                        var8.a(-17040, cg.field_b, 17);
                        if (-4 != param1.field_b) {
                          if (-7 == param1.field_b) {
                            var8.a(-17040, md.field_c, 9);
                            break L3;
                          } else {
                            break L3;
                          }
                        } else {
                          var8.a(-17040, ea.field_y, 7);
                          break L3;
                        }
                      }
                      if (param2 != 7) {
                        return;
                      } else {
                        ((og) this).b((al) (Object) var8, param2 + -109);
                        return;
                      }
                    } else {
                      L4: {
                        var8.a(param2 ^ -17033, ea.field_p, -1);
                        if (-4 != param1.field_b) {
                          if (-7 == param1.field_b) {
                            var8.a(-17040, md.field_c, 9);
                            break L4;
                          } else {
                            break L4;
                          }
                        } else {
                          var8.a(-17040, ea.field_y, 7);
                          break L4;
                        }
                      }
                      if (param2 != 7) {
                        return;
                      } else {
                        ((og) this).b((al) (Object) var8, param2 + -109);
                        return;
                      }
                    }
                  }
                }
              }
            } else {
              var4 = ga.field_f;
              if (((og) this).field_mb != null) {
                ((og) this).field_mb.a((byte) 121);
                break L0;
              } else {
                break L0;
              }
            }
          }
        }
        var9 = new lc((jj) this, p.field_a, var4);
        var5 = var9;
        if (param1.field_e) {
          if (param1.field_f) {
            ((og) this).b((al) (Object) new ge((og) this), param2 ^ -118);
            return;
          } else {
            rh discarded$6 = var9.a(param2 + -21, (tg) this, hd.field_m);
            if (param2 == 7) {
              ((og) this).b((al) (Object) var9, param2 + -109);
              return;
            } else {
              return;
            }
          }
        } else {
          if (((og) this).field_lb) {
            rh discarded$7 = var9.a(-14, (tg) this, hd.field_m);
            if (-4 != (param1.field_b ^ -1)) {
              if (-7 == (param1.field_b ^ -1)) {
                var9.a(-17040, md.field_c, 9);
                if (param2 == 7) {
                  ((og) this).b((al) (Object) var9, param2 + -109);
                  return;
                } else {
                  return;
                }
              } else {
                if (param2 == 7) {
                  ((og) this).b((al) (Object) var9, param2 + -109);
                  return;
                } else {
                  return;
                }
              }
            } else {
              var9.a(-17040, ea.field_y, 7);
              if (param2 == 7) {
                ((og) this).b((al) (Object) var9, param2 + -109);
                return;
              } else {
                return;
              }
            }
          } else {
            if (param1.field_b == 5) {
              var9.a(-17040, dh.field_r, 11);
              var9.a(-17040, cg.field_b, 17);
              if (-4 != (param1.field_b ^ -1)) {
                if (-7 == (param1.field_b ^ -1)) {
                  var9.a(-17040, md.field_c, 9);
                  if (param2 != 7) {
                    return;
                  } else {
                    ((og) this).b((al) (Object) var9, param2 + -109);
                    return;
                  }
                } else {
                  if (param2 != 7) {
                    return;
                  } else {
                    ((og) this).b((al) (Object) var9, param2 + -109);
                    return;
                  }
                }
              } else {
                var9.a(-17040, ea.field_y, 7);
                if (param2 != 7) {
                  return;
                } else {
                  ((og) this).b((al) (Object) var9, param2 + -109);
                  return;
                }
              }
            } else {
              L5: {
                var9.a(param2 ^ -17033, ea.field_p, -1);
                if (-4 != param1.field_b) {
                  if (-7 == param1.field_b) {
                    var9.a(-17040, md.field_c, 9);
                    break L5;
                  } else {
                    break L5;
                  }
                } else {
                  var9.a(-17040, ea.field_y, 7);
                  break L5;
                }
              }
              if (param2 != 7) {
                return;
              } else {
                ((og) this).b((al) (Object) var9, param2 + -109);
                return;
              }
            }
          }
        }
    }

    public final void a(rh param0, int param1, int param2, int param3, int param4) {
        if (!(!((og) this).field_lb)) {
            nk.a(true, -126, false);
            return;
        }
        nh.a((byte) 122);
        ((og) this).t(20252);
        if (param4 != -27322) {
            ((og) this).field_ob = true;
        }
    }

    public static void v(int param0) {
        int var1 = -66 / ((21 - param0) / 62);
        field_rb = null;
        field_nb = null;
        field_qb = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_qb = "Mine";
        field_nb = "Your email address is used to identify this account";
    }
}
