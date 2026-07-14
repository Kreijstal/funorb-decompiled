/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf extends ne implements in {
    static ja[] field_Hb;
    private boolean field_Ib;
    static int field_Eb;
    static int field_Db;
    static String field_Cb;
    private fe field_Gb;
    private boolean field_Fb;

    public final void a(int param0, int param1, gn param2, int param3, int param4) {
        if (param3 >= -83) {
            return;
        }
        if (((tf) this).field_Ib) {
            io.a(-21113, true, false);
            return;
        }
        va.a((byte) 62);
        ((tf) this).m(-7435);
    }

    final boolean i(int param0) {
        gh var2 = null;
        Object var3 = null;
        if (param0 == -27388) {
          if (((tf) this).field_R) {
            if (!((tf) this).field_Fb) {
              var2 = of.d(param0 ^ -27388);
              if (var2 == null) {
                return super.i(-27388);
              } else {
                this.a(-6, false, var2);
                return super.i(-27388);
              }
            } else {
              return super.i(-27388);
            }
          } else {
            return super.i(-27388);
          }
        } else {
          var3 = null;
          we discarded$5 = tf.a((uj) null, (byte) -100);
          if (((tf) this).field_R) {
            if (!((tf) this).field_Fb) {
              var2 = of.d(param0 ^ -27388);
              if (var2 == null) {
                return super.i(-27388);
              } else {
                this.a(-6, false, var2);
                return super.i(-27388);
              }
            } else {
              return super.i(-27388);
            }
          } else {
            return super.i(-27388);
          }
        }
    }

    private final void a(int param0, boolean param1, gh param2) {
        String var4 = null;
        wd var5 = null;
        int var6 = 0;
        String var7 = null;
        wd var8 = null;
        String var9 = null;
        wd var10 = null;
        String var11 = null;
        wd var12 = null;
        wd var13 = null;
        L0: {
          var6 = ZombieDawnMulti.field_E ? 1 : 0;
          ((tf) this).field_Fb = true;
          if (param0 == -6) {
            break L0;
          } else {
            field_Eb = 69;
            break L0;
          }
        }
        if (!param2.field_d) {
          L1: {
            if (param2.field_b != null) {
              var11 = wg.field_d;
              var4 = var11;
              if (((tf) this).field_Gb != null) {
                ((tf) this).field_Gb.a(496);
                break L1;
              } else {
                var12 = new wd((ne) this, ci.field_d, var11);
                var5 = var12;
                if (!param2.field_d) {
                  if (!((tf) this).field_Ib) {
                    if (-6 != (param2.field_c ^ -1)) {
                      var12.a(sn.field_Zb, -1, true);
                      if (param2.field_c == 3) {
                        var12.a(od.field_zb, 7, true);
                        ((tf) this).a((cf) (Object) var12, (byte) 125);
                        return;
                      } else {
                        if ((param2.field_c ^ -1) != -7) {
                          ((tf) this).a((cf) (Object) var12, (byte) 125);
                          return;
                        } else {
                          var12.a(wm.field_S, 9, true);
                          ((tf) this).a((cf) (Object) var12, (byte) 125);
                          return;
                        }
                      }
                    } else {
                      var12.a(lc.field_g, 11, true);
                      var12.a(oe.field_b, 17, true);
                      if (param2.field_c == 3) {
                        var12.a(od.field_zb, 7, true);
                        ((tf) this).a((cf) (Object) var12, (byte) 125);
                        return;
                      } else {
                        if ((param2.field_c ^ -1) != -7) {
                          ((tf) this).a((cf) (Object) var12, (byte) 125);
                          return;
                        } else {
                          var12.a(wm.field_S, 9, true);
                          ((tf) this).a((cf) (Object) var12, (byte) 125);
                          return;
                        }
                      }
                    }
                  } else {
                    gn discarded$8 = var12.a(ub.field_xb, param0 ^ 58, (bj) this);
                    if (param2.field_c == 3) {
                      var12.a(od.field_zb, 7, true);
                      ((tf) this).a((cf) (Object) var12, (byte) 125);
                      return;
                    } else {
                      if ((param2.field_c ^ -1) != -7) {
                        ((tf) this).a((cf) (Object) var12, (byte) 125);
                        return;
                      } else {
                        var12.a(wm.field_S, 9, true);
                        ((tf) this).a((cf) (Object) var12, (byte) 125);
                        return;
                      }
                    }
                  }
                } else {
                  if (param2.field_e) {
                    ((tf) this).a((cf) (Object) new pj((tf) this), (byte) 122);
                    return;
                  } else {
                    gn discarded$9 = var12.a(ub.field_xb, -112, (bj) this);
                    ((tf) this).a((cf) (Object) var12, (byte) 125);
                    return;
                  }
                }
              }
            } else {
              var4 = param2.field_h;
              if ((param2.field_c ^ -1) != -249) {
                break L1;
              } else {
                L2: {
                  if (!param1) {
                    nq.f(-42);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var9 = ba.field_p;
                ((tf) this).field_Ib = true;
                var10 = new wd((ne) this, ci.field_d, var9);
                var5 = var10;
                if (!param2.field_d) {
                  if (!((tf) this).field_Ib) {
                    if (-6 != (param2.field_c ^ -1)) {
                      var10.a(sn.field_Zb, -1, true);
                      if (param2.field_c == 3) {
                        var10.a(od.field_zb, 7, true);
                        ((tf) this).a((cf) (Object) var10, (byte) 125);
                        return;
                      } else {
                        if ((param2.field_c ^ -1) != -7) {
                          ((tf) this).a((cf) (Object) var10, (byte) 125);
                          return;
                        } else {
                          var10.a(wm.field_S, 9, true);
                          ((tf) this).a((cf) (Object) var10, (byte) 125);
                          return;
                        }
                      }
                    } else {
                      var10.a(lc.field_g, 11, true);
                      var10.a(oe.field_b, 17, true);
                      if (param2.field_c == 3) {
                        var10.a(od.field_zb, 7, true);
                        ((tf) this).a((cf) (Object) var10, (byte) 125);
                        return;
                      } else {
                        if ((param2.field_c ^ -1) != -7) {
                          ((tf) this).a((cf) (Object) var10, (byte) 125);
                          return;
                        } else {
                          var10.a(wm.field_S, 9, true);
                          ((tf) this).a((cf) (Object) var10, (byte) 125);
                          return;
                        }
                      }
                    }
                  } else {
                    gn discarded$10 = var10.a(ub.field_xb, param0 ^ 58, (bj) this);
                    if (param2.field_c == 3) {
                      var10.a(od.field_zb, 7, true);
                      ((tf) this).a((cf) (Object) var10, (byte) 125);
                      return;
                    } else {
                      if ((param2.field_c ^ -1) != -7) {
                        ((tf) this).a((cf) (Object) var10, (byte) 125);
                        return;
                      } else {
                        var10.a(wm.field_S, 9, true);
                        ((tf) this).a((cf) (Object) var10, (byte) 125);
                        return;
                      }
                    }
                  }
                } else {
                  if (param2.field_e) {
                    ((tf) this).a((cf) (Object) new pj((tf) this), (byte) 122);
                    return;
                  } else {
                    gn discarded$11 = var10.a(ub.field_xb, -112, (bj) this);
                    ((tf) this).a((cf) (Object) var10, (byte) 125);
                    return;
                  }
                }
              }
            }
          }
          var13 = new wd((ne) this, ci.field_d, var4);
          if (!param2.field_d) {
            if (!((tf) this).field_Ib) {
              if (-6 != (param2.field_c ^ -1)) {
                var13.a(sn.field_Zb, -1, true);
                if (param2.field_c == 3) {
                  var13.a(od.field_zb, 7, true);
                  ((tf) this).a((cf) (Object) var13, (byte) 125);
                  return;
                } else {
                  if ((param2.field_c ^ -1) != -7) {
                    ((tf) this).a((cf) (Object) var13, (byte) 125);
                    return;
                  } else {
                    var13.a(wm.field_S, 9, true);
                    ((tf) this).a((cf) (Object) var13, (byte) 125);
                    return;
                  }
                }
              } else {
                var13.a(lc.field_g, 11, true);
                var13.a(oe.field_b, 17, true);
                if (param2.field_c == 3) {
                  var13.a(od.field_zb, 7, true);
                  ((tf) this).a((cf) (Object) var13, (byte) 125);
                  return;
                } else {
                  if ((param2.field_c ^ -1) != -7) {
                    ((tf) this).a((cf) (Object) var13, (byte) 125);
                    return;
                  } else {
                    var13.a(wm.field_S, 9, true);
                    ((tf) this).a((cf) (Object) var13, (byte) 125);
                    return;
                  }
                }
              }
            } else {
              gn discarded$12 = var13.a(ub.field_xb, param0 ^ 58, (bj) this);
              if (param2.field_c == 3) {
                var13.a(od.field_zb, 7, true);
                ((tf) this).a((cf) (Object) var13, (byte) 125);
                return;
              } else {
                if ((param2.field_c ^ -1) != -7) {
                  ((tf) this).a((cf) (Object) var13, (byte) 125);
                  return;
                } else {
                  var13.a(wm.field_S, 9, true);
                  ((tf) this).a((cf) (Object) var13, (byte) 125);
                  return;
                }
              }
            }
          } else {
            if (param2.field_e) {
              ((tf) this).a((cf) (Object) new pj((tf) this), (byte) 122);
              return;
            } else {
              gn discarded$13 = var13.a(ub.field_xb, -112, (bj) this);
              ((tf) this).a((cf) (Object) var13, (byte) 125);
              return;
            }
          }
        } else {
          var7 = qa.field_g;
          var8 = new wd((ne) this, ci.field_d, var7);
          if (!param2.field_d) {
            L3: {
              if (!((tf) this).field_Ib) {
                if (-6 != (param2.field_c ^ -1)) {
                  var8.a(sn.field_Zb, -1, true);
                  break L3;
                } else {
                  var8.a(lc.field_g, 11, true);
                  var8.a(oe.field_b, 17, true);
                  break L3;
                }
              } else {
                gn discarded$14 = var8.a(ub.field_xb, param0 ^ 58, (bj) this);
                break L3;
              }
            }
            if (param2.field_c == 3) {
              var8.a(od.field_zb, 7, true);
              ((tf) this).a((cf) (Object) var8, (byte) 125);
              return;
            } else {
              if ((param2.field_c ^ -1) == -7) {
                var8.a(wm.field_S, 9, true);
                ((tf) this).a((cf) (Object) var8, (byte) 125);
                return;
              } else {
                ((tf) this).a((cf) (Object) var8, (byte) 125);
                return;
              }
            }
          } else {
            if (param2.field_e) {
              ((tf) this).a((cf) (Object) new pj((tf) this), (byte) 122);
              return;
            } else {
              gn discarded$15 = var8.a(ub.field_xb, -112, (bj) this);
              ((tf) this).a((cf) (Object) var8, (byte) 125);
              return;
            }
          }
        }
    }

    final static we a(uj param0, byte param1) {
        we var2 = null;
        Object var3 = null;
        if (param1 > -62) {
          var3 = null;
          we discarded$2 = tf.a((uj) null, (byte) 86);
          var2 = new we(param0, (br) (Object) param0);
          gb.field_e.a((br) (Object) var2, false);
          bh.field_a.b((gq) (Object) param0);
          return var2;
        } else {
          var2 = new we(param0, (br) (Object) param0);
          gb.field_e.a((br) (Object) var2, false);
          bh.field_a.b((gq) (Object) param0);
          return var2;
        }
    }

    tf(vk param0, fe param1) {
        super(param0, ci.field_d, og.field_M, false, false);
        ((tf) this).field_Gb = param1;
    }

    final void p(int param0) {
        this.a(-6, true, p.a(-97, ba.field_p, param0));
    }

    public static void o(int param0) {
        field_Cb = null;
        field_Hb = null;
        int var1 = -24 / ((10 - param0) / 37);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Db = -1;
        field_Eb = 0;
        field_Cb = "Members' Benefits";
    }
}
