/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk extends ci implements ka {
    private boolean field_tb;
    private rf field_vb;
    private boolean field_wb;
    static da field_ub;

    jk(i param0, rf param1) {
        super(param0, uc.field_g, rc.field_p, false, false);
        ((jk) this).field_vb = param1;
    }

    public static void n(int param0) {
        field_ub = null;
        if (param0 != 6) {
            field_ub = null;
        }
    }

    public final void a(int param0, int param1, int param2, pj param3, boolean param4) {
        if (((jk) this).field_wb) {
            hl.a(true, 24574, false);
            return;
        }
        ua.a((byte) -110);
        ((jk) this).f(param4);
    }

    private final void a(boolean param0, byte param1, wg param2) {
        String var4 = null;
        lj var5 = null;
        int var6 = 0;
        L0: {
          var6 = SolKnight.field_L ? 1 : 0;
          ((jk) this).field_tb = true;
          if (param2.field_c) {
            var4 = lk.field_d;
            break L0;
          } else {
            if (null == param2.field_a) {
              var4 = param2.field_d;
              if (-249 == (param2.field_b ^ -1)) {
                L1: {
                  if (!param0) {
                    pk.i(918092705);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ((jk) this).field_wb = true;
                var4 = ce.field_a;
                var5 = new lj((ci) this, uc.field_g, var4);
                if (!param2.field_c) {
                  if (((jk) this).field_wb) {
                    pj discarded$6 = var5.a(0, dd.field_a, (dg) this);
                    if (3 != param2.field_b) {
                      if (6 == param2.field_b) {
                        var5.a(9, ik.field_d, 1);
                        ((jk) this).c(-3399, (rc) (Object) var5);
                        if (param1 > 19) {
                          return;
                        } else {
                          ((jk) this).field_tb = false;
                          return;
                        }
                      } else {
                        ((jk) this).c(-3399, (rc) (Object) var5);
                        if (param1 > 19) {
                          return;
                        } else {
                          ((jk) this).field_tb = false;
                          return;
                        }
                      }
                    } else {
                      var5.a(7, qd.field_a, 1);
                      ((jk) this).c(-3399, (rc) (Object) var5);
                      if (param1 > 19) {
                        return;
                      } else {
                        ((jk) this).field_tb = false;
                        return;
                      }
                    }
                  } else {
                    if (-6 == (param2.field_b ^ -1)) {
                      L2: {
                        var5.a(11, cl.field_k, 1);
                        var5.a(17, ph.field_e, 1);
                        if (3 != param2.field_b) {
                          if (6 == param2.field_b) {
                            var5.a(9, ik.field_d, 1);
                            break L2;
                          } else {
                            break L2;
                          }
                        } else {
                          var5.a(7, qd.field_a, 1);
                          break L2;
                        }
                      }
                      ((jk) this).c(-3399, (rc) (Object) var5);
                      if (param1 > 19) {
                        return;
                      } else {
                        ((jk) this).field_tb = false;
                        return;
                      }
                    } else {
                      L3: {
                        var5.a(-1, u.field_e, 1);
                        if (3 != param2.field_b) {
                          if (6 == param2.field_b) {
                            var5.a(9, ik.field_d, 1);
                            break L3;
                          } else {
                            break L3;
                          }
                        } else {
                          var5.a(7, qd.field_a, 1);
                          break L3;
                        }
                      }
                      ((jk) this).c(-3399, (rc) (Object) var5);
                      if (param1 > 19) {
                        return;
                      } else {
                        ((jk) this).field_tb = false;
                        return;
                      }
                    }
                  }
                } else {
                  if (!param2.field_f) {
                    pj discarded$7 = var5.a(0, dd.field_a, (dg) this);
                    ((jk) this).c(-3399, (rc) (Object) var5);
                    if (param1 > 19) {
                      return;
                    } else {
                      ((jk) this).field_tb = false;
                      return;
                    }
                  } else {
                    ((jk) this).c(-3399, (rc) (Object) new qe((jk) this));
                    return;
                  }
                }
              } else {
                var5 = new lj((ci) this, uc.field_g, var4);
                if (!param2.field_c) {
                  if (((jk) this).field_wb) {
                    pj discarded$8 = var5.a(0, dd.field_a, (dg) this);
                    if (3 != param2.field_b) {
                      if (6 == param2.field_b) {
                        var5.a(9, ik.field_d, 1);
                        ((jk) this).c(-3399, (rc) (Object) var5);
                        if (param1 <= 19) {
                          ((jk) this).field_tb = false;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        ((jk) this).c(-3399, (rc) (Object) var5);
                        if (param1 <= 19) {
                          ((jk) this).field_tb = false;
                          return;
                        } else {
                          return;
                        }
                      }
                    } else {
                      var5.a(7, qd.field_a, 1);
                      ((jk) this).c(-3399, (rc) (Object) var5);
                      if (param1 <= 19) {
                        ((jk) this).field_tb = false;
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    if (-6 == (param2.field_b ^ -1)) {
                      L4: {
                        var5.a(11, cl.field_k, 1);
                        var5.a(17, ph.field_e, 1);
                        if (3 != param2.field_b) {
                          if (6 == param2.field_b) {
                            var5.a(9, ik.field_d, 1);
                            break L4;
                          } else {
                            break L4;
                          }
                        } else {
                          var5.a(7, qd.field_a, 1);
                          break L4;
                        }
                      }
                      ((jk) this).c(-3399, (rc) (Object) var5);
                      if (param1 > 19) {
                        return;
                      } else {
                        ((jk) this).field_tb = false;
                        return;
                      }
                    } else {
                      L5: {
                        var5.a(-1, u.field_e, 1);
                        if (3 != param2.field_b) {
                          if (6 == param2.field_b) {
                            var5.a(9, ik.field_d, 1);
                            break L5;
                          } else {
                            break L5;
                          }
                        } else {
                          var5.a(7, qd.field_a, 1);
                          break L5;
                        }
                      }
                      ((jk) this).c(-3399, (rc) (Object) var5);
                      if (param1 > 19) {
                        return;
                      } else {
                        ((jk) this).field_tb = false;
                        return;
                      }
                    }
                  }
                } else {
                  if (!param2.field_f) {
                    pj discarded$9 = var5.a(0, dd.field_a, (dg) this);
                    ((jk) this).c(-3399, (rc) (Object) var5);
                    if (param1 <= 19) {
                      ((jk) this).field_tb = false;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    ((jk) this).c(-3399, (rc) (Object) new qe((jk) this));
                    return;
                  }
                }
              }
            } else {
              var4 = pc.field_d;
              if (null == ((jk) this).field_vb) {
                break L0;
              } else {
                ((jk) this).field_vb.a((byte) 22);
                break L0;
              }
            }
          }
        }
        var5 = new lj((ci) this, uc.field_g, var4);
        if (!param2.field_c) {
          if (((jk) this).field_wb) {
            pj discarded$10 = var5.a(0, dd.field_a, (dg) this);
            if (3 != param2.field_b) {
              if (6 == param2.field_b) {
                var5.a(9, ik.field_d, 1);
                ((jk) this).c(-3399, (rc) (Object) var5);
                if (param1 > 19) {
                  return;
                } else {
                  ((jk) this).field_tb = false;
                  return;
                }
              } else {
                ((jk) this).c(-3399, (rc) (Object) var5);
                if (param1 > 19) {
                  return;
                } else {
                  ((jk) this).field_tb = false;
                  return;
                }
              }
            } else {
              var5.a(7, qd.field_a, 1);
              ((jk) this).c(-3399, (rc) (Object) var5);
              if (param1 > 19) {
                return;
              } else {
                ((jk) this).field_tb = false;
                return;
              }
            }
          } else {
            if (-6 == (param2.field_b ^ -1)) {
              var5.a(11, cl.field_k, 1);
              var5.a(17, ph.field_e, 1);
              if (3 != param2.field_b) {
                if (6 == param2.field_b) {
                  var5.a(9, ik.field_d, 1);
                  ((jk) this).c(-3399, (rc) (Object) var5);
                  if (param1 <= 19) {
                    ((jk) this).field_tb = false;
                    return;
                  } else {
                    return;
                  }
                } else {
                  ((jk) this).c(-3399, (rc) (Object) var5);
                  if (param1 <= 19) {
                    ((jk) this).field_tb = false;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                var5.a(7, qd.field_a, 1);
                ((jk) this).c(-3399, (rc) (Object) var5);
                if (param1 <= 19) {
                  ((jk) this).field_tb = false;
                  return;
                } else {
                  return;
                }
              }
            } else {
              var5.a(-1, u.field_e, 1);
              if (3 != param2.field_b) {
                if (6 == param2.field_b) {
                  var5.a(9, ik.field_d, 1);
                  ((jk) this).c(-3399, (rc) (Object) var5);
                  if (param1 <= 19) {
                    ((jk) this).field_tb = false;
                    return;
                  } else {
                    return;
                  }
                } else {
                  ((jk) this).c(-3399, (rc) (Object) var5);
                  if (param1 <= 19) {
                    ((jk) this).field_tb = false;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                var5.a(7, qd.field_a, 1);
                ((jk) this).c(-3399, (rc) (Object) var5);
                if (param1 <= 19) {
                  ((jk) this).field_tb = false;
                  return;
                } else {
                  return;
                }
              }
            }
          }
        } else {
          if (!param2.field_f) {
            pj discarded$11 = var5.a(0, dd.field_a, (dg) this);
            ((jk) this).c(-3399, (rc) (Object) var5);
            if (param1 > 19) {
              return;
            } else {
              ((jk) this).field_tb = false;
              return;
            }
          } else {
            ((jk) this).c(-3399, (rc) (Object) new qe((jk) this));
            return;
          }
        }
    }

    final void h(byte param0) {
        this.a(true, (byte) 58, mh.a(248, true, ce.field_a));
        if (param0 != -63) {
            ((jk) this).field_wb = false;
        }
    }

    final boolean h(int param0) {
        wg var2 = null;
        if (param0 == 1784) {
          if (((jk) this).field_J) {
            if (!((jk) this).field_tb) {
              var2 = r.b(83);
              if (var2 == null) {
                return super.h(1784);
              } else {
                this.a(false, (byte) 97, var2);
                return super.h(1784);
              }
            } else {
              return super.h(1784);
            }
          } else {
            return super.h(1784);
          }
        } else {
          ((jk) this).field_vb = null;
          if (((jk) this).field_J) {
            if (!((jk) this).field_tb) {
              var2 = r.b(83);
              if (var2 == null) {
                return super.h(1784);
              } else {
                this.a(false, (byte) 97, var2);
                return super.h(1784);
              }
            } else {
              return super.h(1784);
            }
          } else {
            return super.h(1784);
          }
        }
    }

    final static int i(byte param0) {
        if (param0 < 112) {
            field_ub = null;
            return ak.field_a;
        }
        return ak.field_a;
    }

    static {
    }
}
