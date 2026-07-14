/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg extends ck implements oi {
    private boolean field_lb;
    private mj field_nb;
    static String field_ob;
    static int field_pb;
    private boolean field_mb;

    final void p(int param0) {
        this.a(fb.a(248, true, ki.field_r), -8895, true);
        if (param0 < 77) {
            ((jg) this).field_nb = null;
        }
    }

    jg(ei param0, mj param1) {
        super(param0, s.field_c, vj.field_b, false, false);
        ((jg) this).field_nb = param1;
    }

    final static void a(pf param0, pf param1, byte param2) {
        vf.field_E = param0;
        if (param2 != 118) {
            field_ob = null;
            nh.field_g = param1;
            return;
        }
        nh.field_g = param1;
    }

    public final void a(int param0, int param1, ig param2, boolean param3, int param4) {
        if (!(!((jg) this).field_lb)) {
            th.a(false, true, 4);
            return;
        }
        if (param3) {
            return;
        }
        ai.a((byte) 98);
        ((jg) this).o(3);
    }

    private final void a(ml param0, int param1, boolean param2) {
        String var4 = null;
        vf var5 = null;
        int var6 = 0;
        String var7 = null;
        vf var8 = null;
        vf var9 = null;
        String var16 = null;
        vf var17 = null;
        vf var18 = null;
        var6 = stellarshard.field_B;
        if (param1 == -8895) {
          L0: {
            ((jg) this).field_mb = true;
            if (!param0.field_f) {
              if (null == param0.field_d) {
                var16 = param0.field_e;
                if (248 == param0.field_g) {
                  L1: {
                    if (!param2) {
                      di.a(1);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  ((jg) this).field_lb = true;
                  var4 = ki.field_r;
                  break L0;
                } else {
                  var17 = new vf((ck) this, s.field_c, var16);
                  var5 = var17;
                  if (!param0.field_f) {
                    if (!((jg) this).field_lb) {
                      if (5 == param0.field_g) {
                        var17.a(param1 + -22910, 11, gj.field_s);
                        var17.a(-31805, 17, wc.field_z);
                        if (param0.field_g == 3) {
                          var17.a(-31805, 7, gh.field_a);
                          ((jg) this).b((rj) (Object) var17, 23143);
                          return;
                        } else {
                          if (6 != param0.field_g) {
                            ((jg) this).b((rj) (Object) var17, 23143);
                            return;
                          } else {
                            var17.a(-31805, 9, a.field_d);
                            ((jg) this).b((rj) (Object) var17, 23143);
                            return;
                          }
                        }
                      } else {
                        var17.a(-31805, -1, bk.field_e);
                        if (param0.field_g == 3) {
                          var17.a(-31805, 7, gh.field_a);
                          ((jg) this).b((rj) (Object) var17, 23143);
                          return;
                        } else {
                          if (6 != param0.field_g) {
                            ((jg) this).b((rj) (Object) var17, 23143);
                            return;
                          } else {
                            var17.a(-31805, 9, a.field_d);
                            ((jg) this).b((rj) (Object) var17, 23143);
                            return;
                          }
                        }
                      }
                    } else {
                      ig discarded$8 = var17.a((lf) this, tc.field_q, (byte) 118);
                      if (param0.field_g == 3) {
                        var17.a(-31805, 7, gh.field_a);
                        ((jg) this).b((rj) (Object) var17, 23143);
                        return;
                      } else {
                        if (6 != param0.field_g) {
                          ((jg) this).b((rj) (Object) var17, 23143);
                          return;
                        } else {
                          var17.a(-31805, 9, a.field_d);
                          ((jg) this).b((rj) (Object) var17, 23143);
                          return;
                        }
                      }
                    }
                  } else {
                    if (!param0.field_a) {
                      ig discarded$9 = var17.a((lf) this, tc.field_q, (byte) -125);
                      ((jg) this).b((rj) (Object) var17, 23143);
                      return;
                    } else {
                      ((jg) this).b((rj) (Object) new sj((jg) this), param1 ^ -30938);
                      return;
                    }
                  }
                }
              } else {
                var7 = jb.field_p;
                if (((jg) this).field_nb != null) {
                  ((jg) this).field_nb.a(param1 ^ 8915);
                  var9 = new vf((ck) this, s.field_c, var7);
                  var5 = var9;
                  if (!param0.field_f) {
                    if (!((jg) this).field_lb) {
                      if (5 == param0.field_g) {
                        var9.a(param1 + -22910, 11, gj.field_s);
                        var9.a(-31805, 17, wc.field_z);
                        if (param0.field_g == 3) {
                          var9.a(-31805, 7, gh.field_a);
                          ((jg) this).b((rj) (Object) var5, 23143);
                          return;
                        } else {
                          if (6 != param0.field_g) {
                            ((jg) this).b((rj) (Object) var5, 23143);
                            return;
                          } else {
                            var9.a(-31805, 9, a.field_d);
                            ((jg) this).b((rj) (Object) var5, 23143);
                            return;
                          }
                        }
                      } else {
                        var9.a(-31805, -1, bk.field_e);
                        if (param0.field_g == 3) {
                          var9.a(-31805, 7, gh.field_a);
                          ((jg) this).b((rj) (Object) var5, 23143);
                          return;
                        } else {
                          if (6 != param0.field_g) {
                            ((jg) this).b((rj) (Object) var5, 23143);
                            return;
                          } else {
                            var9.a(-31805, 9, a.field_d);
                            ((jg) this).b((rj) (Object) var5, 23143);
                            return;
                          }
                        }
                      }
                    } else {
                      ig discarded$10 = var9.a((lf) this, tc.field_q, (byte) 118);
                      if (param0.field_g == 3) {
                        var9.a(-31805, 7, gh.field_a);
                        ((jg) this).b((rj) (Object) var9, 23143);
                        return;
                      } else {
                        if (6 != param0.field_g) {
                          ((jg) this).b((rj) (Object) var9, 23143);
                          return;
                        } else {
                          var9.a(-31805, 9, a.field_d);
                          ((jg) this).b((rj) (Object) var9, 23143);
                          return;
                        }
                      }
                    }
                  } else {
                    if (!param0.field_a) {
                      ig discarded$11 = var9.a((lf) this, tc.field_q, (byte) -125);
                      ((jg) this).b((rj) (Object) var5, 23143);
                      return;
                    } else {
                      ((jg) this).b((rj) (Object) new sj((jg) this), param1 ^ -30938);
                      return;
                    }
                  }
                } else {
                  var8 = new vf((ck) this, s.field_c, var7);
                  if (!param0.field_f) {
                    L2: {
                      if (!((jg) this).field_lb) {
                        if (5 == param0.field_g) {
                          var8.a(param1 + -22910, 11, gj.field_s);
                          var8.a(-31805, 17, wc.field_z);
                          break L2;
                        } else {
                          var8.a(-31805, -1, bk.field_e);
                          break L2;
                        }
                      } else {
                        ig discarded$12 = var8.a((lf) this, tc.field_q, (byte) 118);
                        break L2;
                      }
                    }
                    if (param0.field_g == 3) {
                      var8.a(-31805, 7, gh.field_a);
                      ((jg) this).b((rj) (Object) var8, 23143);
                      return;
                    } else {
                      if (6 == param0.field_g) {
                        var8.a(-31805, 9, a.field_d);
                        ((jg) this).b((rj) (Object) var8, 23143);
                        return;
                      } else {
                        ((jg) this).b((rj) (Object) var8, 23143);
                        return;
                      }
                    }
                  } else {
                    if (!param0.field_a) {
                      ig discarded$13 = var8.a((lf) this, tc.field_q, (byte) -125);
                      ((jg) this).b((rj) (Object) var8, 23143);
                      return;
                    } else {
                      ((jg) this).b((rj) (Object) new sj((jg) this), param1 ^ -30938);
                      return;
                    }
                  }
                }
              }
            } else {
              var4 = mb.field_a;
              break L0;
            }
          }
          var18 = new vf((ck) this, s.field_c, var4);
          if (!param0.field_f) {
            if (!((jg) this).field_lb) {
              if (5 == param0.field_g) {
                var18.a(param1 + -22910, 11, gj.field_s);
                var18.a(-31805, 17, wc.field_z);
                if (param0.field_g == 3) {
                  var18.a(-31805, 7, gh.field_a);
                  ((jg) this).b((rj) (Object) var18, 23143);
                  return;
                } else {
                  if (6 != param0.field_g) {
                    ((jg) this).b((rj) (Object) var18, 23143);
                    return;
                  } else {
                    var18.a(-31805, 9, a.field_d);
                    ((jg) this).b((rj) (Object) var18, 23143);
                    return;
                  }
                }
              } else {
                var18.a(-31805, -1, bk.field_e);
                if (param0.field_g == 3) {
                  var18.a(-31805, 7, gh.field_a);
                  ((jg) this).b((rj) (Object) var18, 23143);
                  return;
                } else {
                  if (6 != param0.field_g) {
                    ((jg) this).b((rj) (Object) var18, 23143);
                    return;
                  } else {
                    var18.a(-31805, 9, a.field_d);
                    ((jg) this).b((rj) (Object) var18, 23143);
                    return;
                  }
                }
              }
            } else {
              ig discarded$14 = var18.a((lf) this, tc.field_q, (byte) 118);
              if (param0.field_g == 3) {
                var18.a(-31805, 7, gh.field_a);
                ((jg) this).b((rj) (Object) var18, 23143);
                return;
              } else {
                if (6 != param0.field_g) {
                  ((jg) this).b((rj) (Object) var18, 23143);
                  return;
                } else {
                  var18.a(-31805, 9, a.field_d);
                  ((jg) this).b((rj) (Object) var18, 23143);
                  return;
                }
              }
            }
          } else {
            if (!param0.field_a) {
              ig discarded$15 = var18.a((lf) this, tc.field_q, (byte) -125);
              ((jg) this).b((rj) (Object) var18, 23143);
              return;
            } else {
              ((jg) this).b((rj) (Object) new sj((jg) this), param1 ^ -30938);
              return;
            }
          }
        } else {
          return;
        }
    }

    final boolean d(boolean param0) {
        ml var2 = null;
        if (((jg) this).field_G) {
          if (!((jg) this).field_mb) {
            var2 = mj.i(0);
            if (var2 == null) {
              if (!param0) {
                int discarded$4 = jg.i((byte) -113);
                return super.d(true);
              } else {
                return super.d(true);
              }
            } else {
              this.a(var2, -8895, false);
              if (!param0) {
                int discarded$5 = jg.i((byte) -113);
                return super.d(true);
              } else {
                return super.d(true);
              }
            }
          } else {
            if (!param0) {
              int discarded$6 = jg.i((byte) -113);
              return super.d(true);
            } else {
              return super.d(true);
            }
          }
        } else {
          if (!param0) {
            int discarded$7 = jg.i((byte) -113);
            return super.d(true);
          } else {
            return super.d(true);
          }
        }
    }

    public static void e(boolean param0) {
        if (!param0) {
            return;
        }
        field_ob = null;
    }

    final static int i(byte param0) {
        if (param0 != 113) {
            jg.e(true);
            return u.field_k;
        }
        return u.field_k;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ob = "Achieved";
    }
}
