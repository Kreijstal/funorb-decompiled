/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf extends lp implements en {
    private boolean field_Db;
    private dk field_Eb;
    static int field_Cb;
    private boolean field_Fb;

    final static void a(int param0, pb param1, int param2, jp param3, int param4, boolean param5) {
        if (param5) {
          field_Cb = -58;
          fc.a(-77, param1.field_p);
          lb.g(0, 0, param1.field_i, param1.field_q, rm.field_d[param0], 22953);
          param3.b((-param3.field_x + param1.field_i) / 2 - 80 / param2, -param3.field_z + (param1.field_q + param4 - 201 / param2), 41, 110);
          sc.b(-107);
          return;
        } else {
          fc.a(-77, param1.field_p);
          lb.g(0, 0, param1.field_i, param1.field_q, rm.field_d[param0], 22953);
          param3.b((-param3.field_x + param1.field_i) / 2 - 80 / param2, -param3.field_z + (param1.field_q + param4 - 201 / param2), 41, 110);
          sc.b(-107);
          return;
        }
    }

    final boolean h(int param0) {
        oh var2 = null;
        if (param0 == 0) {
          if (((qf) this).field_N) {
            if (!((qf) this).field_Db) {
              var2 = l.a(106);
              if (var2 == null) {
                return super.h(0);
              } else {
                this.a(-7, var2, false);
                return super.h(0);
              }
            } else {
              return super.h(0);
            }
          } else {
            return super.h(0);
          }
        } else {
          return true;
        }
    }

    final static int p(int param0) {
        if (param0 != 248) {
          field_Cb = 19;
          return to.field_a + ((md.field_v << -1211210622) + (md.field_r << -2046869340));
        } else {
          return to.field_a + ((md.field_v << -1211210622) + (md.field_r << -2046869340));
        }
    }

    qf(cp param0, dk param1) {
        super(param0, wm.field_a, ie.field_o, false, false);
        ((qf) this).field_Eb = param1;
    }

    final void c(boolean param0) {
        this.a(-7, i.a(248, -85, no.field_q), param0);
    }

    public final void a(int param0, int param1, byte param2, int param3, d param4) {
        if (((qf) this).field_Fb) {
            ag.a((byte) -16, true, false);
            return;
        }
        if (param2 >= -22) {
            return;
        }
        ek.l(64);
        ((qf) this).m(17);
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    private final void a(int param0, oh param1, boolean param2) {
        String var4 = null;
        ec var5 = null;
        int var6 = 0;
        String var7 = null;
        ec var8 = null;
        ec var9 = null;
        L0: {
          var6 = BrickABrac.field_J ? 1 : 0;
          ((qf) this).field_Db = true;
          if (param1.field_c) {
            var4 = lh.field_r;
            break L0;
          } else {
            if (null != param1.field_e) {
              var4 = ng.field_f;
              if (null == ((qf) this).field_Eb) {
                break L0;
              } else {
                ((qf) this).field_Eb.a((byte) 124);
                break L0;
              }
            } else {
              var7 = param1.field_g;
              if (param1.field_d == 248) {
                L1: {
                  if (!param2) {
                    jq.e(-77);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ((qf) this).field_Fb = true;
                var4 = no.field_q;
                break L0;
              } else {
                var8 = new ec((lp) this, wm.field_a, var7);
                if (param1.field_c) {
                  if (!param1.field_a) {
                    d discarded$4 = var8.a((byte) 126, ri.field_L, (uh) this);
                    ((qf) this).b((byte) 106, (oc) (Object) var8);
                    if (param0 != -7) {
                      ((qf) this).field_Eb = null;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    ((qf) this).b((byte) 118, (oc) (Object) new ig((qf) this));
                    return;
                  }
                } else {
                  if (!((qf) this).field_Fb) {
                    if (param1.field_d == 5) {
                      L2: {
                        var8.a(false, ec.field_L, 11);
                        var8.a(false, wc.field_a, 17);
                        if (3 == param1.field_d) {
                          var8.a(false, vn.field_H, 7);
                          break L2;
                        } else {
                          if ((param1.field_d ^ -1) != -7) {
                            break L2;
                          } else {
                            var8.a(false, cb.field_p, 9);
                            break L2;
                          }
                        }
                      }
                      L3: {
                        ((qf) this).b((byte) 106, (oc) (Object) var8);
                        if (param0 == -7) {
                          break L3;
                        } else {
                          ((qf) this).field_Eb = null;
                          break L3;
                        }
                      }
                      return;
                    } else {
                      L4: {
                        var8.a(false, dp.field_s, -1);
                        if (3 == param1.field_d) {
                          var8.a(false, vn.field_H, 7);
                          break L4;
                        } else {
                          if ((param1.field_d ^ -1) != -7) {
                            break L4;
                          } else {
                            var8.a(false, cb.field_p, 9);
                            break L4;
                          }
                        }
                      }
                      L5: {
                        ((qf) this).b((byte) 106, (oc) (Object) var8);
                        if (param0 == -7) {
                          break L5;
                        } else {
                          ((qf) this).field_Eb = null;
                          break L5;
                        }
                      }
                      return;
                    }
                  } else {
                    L6: {
                      d discarded$5 = var8.a((byte) -37, ri.field_L, (uh) this);
                      if (3 == param1.field_d) {
                        var8.a(false, vn.field_H, 7);
                        break L6;
                      } else {
                        if ((param1.field_d ^ -1) != -7) {
                          break L6;
                        } else {
                          var8.a(false, cb.field_p, 9);
                          break L6;
                        }
                      }
                    }
                    L7: {
                      ((qf) this).b((byte) 106, (oc) (Object) var8);
                      if (param0 == -7) {
                        break L7;
                      } else {
                        ((qf) this).field_Eb = null;
                        break L7;
                      }
                    }
                    return;
                  }
                }
              }
            }
          }
        }
        var9 = new ec((lp) this, wm.field_a, var4);
        var5 = var9;
        if (param1.field_c) {
          if (!param1.field_a) {
            d discarded$6 = var9.a((byte) 126, ri.field_L, (uh) this);
            ((qf) this).b((byte) 106, (oc) (Object) var9);
            if (param0 == -7) {
              return;
            } else {
              ((qf) this).field_Eb = null;
              return;
            }
          } else {
            ((qf) this).b((byte) 118, (oc) (Object) new ig((qf) this));
            return;
          }
        } else {
          if (((qf) this).field_Fb) {
            d discarded$7 = var9.a((byte) -37, ri.field_L, (uh) this);
            if (3 != param1.field_d) {
              if ((param1.field_d ^ -1) != -7) {
                ((qf) this).b((byte) 106, (oc) (Object) var9);
                if (param0 == -7) {
                  return;
                } else {
                  ((qf) this).field_Eb = null;
                  return;
                }
              } else {
                L8: {
                  var9.a(false, cb.field_p, 9);
                  ((qf) this).b((byte) 106, (oc) (Object) var9);
                  if (param0 == -7) {
                    break L8;
                  } else {
                    ((qf) this).field_Eb = null;
                    break L8;
                  }
                }
                return;
              }
            } else {
              L9: {
                var9.a(false, vn.field_H, 7);
                ((qf) this).b((byte) 106, (oc) (Object) var9);
                if (param0 == -7) {
                  break L9;
                } else {
                  ((qf) this).field_Eb = null;
                  break L9;
                }
              }
              return;
            }
          } else {
            if (param1.field_d != 5) {
              var9.a(false, dp.field_s, -1);
              if (3 != param1.field_d) {
                if ((param1.field_d ^ -1) == -7) {
                  var9.a(false, cb.field_p, 9);
                  ((qf) this).b((byte) 106, (oc) (Object) var9);
                  if (param0 != -7) {
                    ((qf) this).field_Eb = null;
                    return;
                  } else {
                    return;
                  }
                } else {
                  ((qf) this).b((byte) 106, (oc) (Object) var9);
                  if (param0 != -7) {
                    ((qf) this).field_Eb = null;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                L10: {
                  var9.a(false, vn.field_H, 7);
                  ((qf) this).b((byte) 106, (oc) (Object) var9);
                  if (param0 == -7) {
                    break L10;
                  } else {
                    ((qf) this).field_Eb = null;
                    break L10;
                  }
                }
                return;
              }
            } else {
              var9.a(false, ec.field_L, 11);
              var9.a(false, wc.field_a, 17);
              if (3 != param1.field_d) {
                if ((param1.field_d ^ -1) != -7) {
                  L11: {
                    ((qf) this).b((byte) 106, (oc) (Object) var9);
                    if (param0 == -7) {
                      break L11;
                    } else {
                      ((qf) this).field_Eb = null;
                      break L11;
                    }
                  }
                  return;
                } else {
                  var9.a(false, cb.field_p, 9);
                  L12: {
                    ((qf) this).b((byte) 106, (oc) (Object) var9);
                    if (param0 == -7) {
                      break L12;
                    } else {
                      ((qf) this).field_Eb = null;
                      break L12;
                    }
                  }
                  return;
                }
              } else {
                var9.a(false, vn.field_H, 7);
                L13: {
                  ((qf) this).b((byte) 106, (oc) (Object) var9);
                  if (param0 == -7) {
                    break L13;
                  } else {
                    ((qf) this).field_Eb = null;
                    break L13;
                  }
                }
                return;
              }
            }
          }
        }
    }

    static {
    }
}
