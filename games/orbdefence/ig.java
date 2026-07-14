/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig extends dh implements ai {
    private boolean field_lb;
    private boolean field_kb;
    private rf field_jb;
    static int field_fb;
    static ki field_hb;
    static String field_gb;
    static pk field_ib;

    final boolean d(boolean param0) {
        qj var2 = null;
        if (!param0) {
          if (((ig) this).field_A) {
            if (!((ig) this).field_lb) {
              var2 = l.a((byte) -20);
              if (var2 == null) {
                return super.d(false);
              } else {
                this.a(false, (byte) 126, var2);
                return super.d(false);
              }
            } else {
              return super.d(false);
            }
          } else {
            return super.d(false);
          }
        } else {
          field_ib = null;
          if (((ig) this).field_A) {
            if (!((ig) this).field_lb) {
              var2 = l.a((byte) -20);
              if (var2 == null) {
                return super.d(false);
              } else {
                this.a(false, (byte) 126, var2);
                return super.d(false);
              }
            } else {
              return super.d(false);
            }
          } else {
            return super.d(false);
          }
        }
    }

    public final void a(byte param0, int param1, int param2, s param3, int param4) {
        if (!(!((ig) this).field_kb)) {
            wj.a(-108, false, true);
            return;
        }
        int var6 = -48 % ((-3 - param0) / 62);
        mh.b((byte) -57);
        ((ig) this).q(4210752);
    }

    public static void r(int param0) {
        field_ib = null;
        field_gb = null;
        field_hb = null;
        if (param0 != 11285) {
            ig.r(29);
        }
    }

    private final void a(boolean param0, byte param1, qj param2) {
        String var4 = null;
        ec var5 = null;
        int var6 = 0;
        String var7 = null;
        ec var8 = null;
        String var9 = null;
        ec var10 = null;
        String var11 = null;
        ec var12 = null;
        ec var13 = null;
        ec var14 = null;
        L0: {
          var6 = OrbDefence.field_D ? 1 : 0;
          ((ig) this).field_lb = true;
          if (param2.field_f) {
            var4 = bd.field_m;
            break L0;
          } else {
            if (param2.field_c != null) {
              var11 = j.field_c;
              if (null != ((ig) this).field_jb) {
                ((ig) this).field_jb.a((byte) -8);
                if (param1 >= 115) {
                  var13 = new ec((dh) this, qc.field_b, var11);
                  var5 = var13;
                  if (param2.field_f) {
                    if (param2.field_d) {
                      ((ig) this).a(false, (pj) (Object) new ob((ig) this));
                      return;
                    } else {
                      s discarded$10 = var13.a(sk.field_C, -34, (ag) this);
                      ((ig) this).a(false, (pj) (Object) var13);
                      return;
                    }
                  } else {
                    if (((ig) this).field_kb) {
                      s discarded$11 = var13.a(sk.field_C, -34, (ag) this);
                      if (3 != param2.field_b) {
                        if (6 == param2.field_b) {
                          var13.a(qf.field_k, 9, -15858);
                          ((ig) this).a(false, (pj) (Object) var13);
                          return;
                        } else {
                          ((ig) this).a(false, (pj) (Object) var13);
                          return;
                        }
                      } else {
                        var13.a(vk.field_y, 7, -15858);
                        ((ig) this).a(false, (pj) (Object) var13);
                        return;
                      }
                    } else {
                      if ((param2.field_b ^ -1) == -6) {
                        var13.a(vc.field_n, 11, -15858);
                        var13.a(ld.field_d, 17, -15858);
                        if (3 != param2.field_b) {
                          if (6 == param2.field_b) {
                            var13.a(qf.field_k, 9, -15858);
                            ((ig) this).a(false, (pj) (Object) var13);
                            return;
                          } else {
                            ((ig) this).a(false, (pj) (Object) var13);
                            return;
                          }
                        } else {
                          var13.a(vk.field_y, 7, -15858);
                          ((ig) this).a(false, (pj) (Object) var13);
                          return;
                        }
                      } else {
                        var13.a(vc.field_i, -1, -15858);
                        if (3 != param2.field_b) {
                          if (6 == param2.field_b) {
                            var13.a(qf.field_k, 9, -15858);
                            ((ig) this).a(false, (pj) (Object) var13);
                            return;
                          } else {
                            ((ig) this).a(false, (pj) (Object) var13);
                            return;
                          }
                        } else {
                          var13.a(vk.field_y, 7, -15858);
                          ((ig) this).a(false, (pj) (Object) var13);
                          return;
                        }
                      }
                    }
                  }
                } else {
                  return;
                }
              } else {
                if (param1 >= 115) {
                  var12 = new ec((dh) this, qc.field_b, var11);
                  var5 = var12;
                  if (param2.field_f) {
                    if (param2.field_d) {
                      ((ig) this).a(false, (pj) (Object) new ob((ig) this));
                      return;
                    } else {
                      s discarded$12 = var12.a(sk.field_C, -34, (ag) this);
                      ((ig) this).a(false, (pj) (Object) var12);
                      return;
                    }
                  } else {
                    if (((ig) this).field_kb) {
                      s discarded$13 = var12.a(sk.field_C, -34, (ag) this);
                      if (3 != param2.field_b) {
                        if (6 == param2.field_b) {
                          var12.a(qf.field_k, 9, -15858);
                          ((ig) this).a(false, (pj) (Object) var12);
                          return;
                        } else {
                          ((ig) this).a(false, (pj) (Object) var12);
                          return;
                        }
                      } else {
                        var12.a(vk.field_y, 7, -15858);
                        ((ig) this).a(false, (pj) (Object) var12);
                        return;
                      }
                    } else {
                      if ((param2.field_b ^ -1) == -6) {
                        var12.a(vc.field_n, 11, -15858);
                        var12.a(ld.field_d, 17, -15858);
                        if (3 != param2.field_b) {
                          if (6 == param2.field_b) {
                            var12.a(qf.field_k, 9, -15858);
                            ((ig) this).a(false, (pj) (Object) var12);
                            return;
                          } else {
                            ((ig) this).a(false, (pj) (Object) var12);
                            return;
                          }
                        } else {
                          var12.a(vk.field_y, 7, -15858);
                          ((ig) this).a(false, (pj) (Object) var12);
                          return;
                        }
                      } else {
                        var12.a(vc.field_i, -1, -15858);
                        if (3 != param2.field_b) {
                          if (6 == param2.field_b) {
                            var12.a(qf.field_k, 9, -15858);
                            ((ig) this).a(false, (pj) (Object) var12);
                            return;
                          } else {
                            ((ig) this).a(false, (pj) (Object) var12);
                            return;
                          }
                        } else {
                          var12.a(vk.field_y, 7, -15858);
                          ((ig) this).a(false, (pj) (Object) var12);
                          return;
                        }
                      }
                    }
                  }
                } else {
                  return;
                }
              }
            } else {
              var7 = param2.field_e;
              if ((param2.field_b ^ -1) == -249) {
                if (param0) {
                  var4 = tb.field_a;
                  ((ig) this).field_kb = true;
                  break L0;
                } else {
                  km.a(16711935);
                  var9 = tb.field_a;
                  ((ig) this).field_kb = true;
                  if (param1 >= 115) {
                    var10 = new ec((dh) this, qc.field_b, var9);
                    if (param2.field_f) {
                      if (param2.field_d) {
                        ((ig) this).a(false, (pj) (Object) new ob((ig) this));
                        return;
                      } else {
                        s discarded$14 = var10.a(sk.field_C, -34, (ag) this);
                        ((ig) this).a(false, (pj) (Object) var10);
                        return;
                      }
                    } else {
                      L1: {
                        if (((ig) this).field_kb) {
                          s discarded$15 = var10.a(sk.field_C, -34, (ag) this);
                          break L1;
                        } else {
                          if ((param2.field_b ^ -1) == -6) {
                            var10.a(vc.field_n, 11, -15858);
                            var10.a(ld.field_d, 17, -15858);
                            break L1;
                          } else {
                            var10.a(vc.field_i, -1, -15858);
                            break L1;
                          }
                        }
                      }
                      if (3 != param2.field_b) {
                        if (6 == param2.field_b) {
                          var10.a(qf.field_k, 9, -15858);
                          ((ig) this).a(false, (pj) (Object) var10);
                          return;
                        } else {
                          ((ig) this).a(false, (pj) (Object) var10);
                          return;
                        }
                      } else {
                        var10.a(vk.field_y, 7, -15858);
                        ((ig) this).a(false, (pj) (Object) var10);
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                }
              } else {
                if (param1 >= 115) {
                  var8 = new ec((dh) this, qc.field_b, var7);
                  var5 = var8;
                  if (param2.field_f) {
                    if (param2.field_d) {
                      ((ig) this).a(false, (pj) (Object) new ob((ig) this));
                      return;
                    } else {
                      s discarded$16 = var8.a(sk.field_C, -34, (ag) this);
                      ((ig) this).a(false, (pj) (Object) var8);
                      return;
                    }
                  } else {
                    if (((ig) this).field_kb) {
                      s discarded$17 = var8.a(sk.field_C, -34, (ag) this);
                      if (3 != param2.field_b) {
                        if (6 == param2.field_b) {
                          var8.a(qf.field_k, 9, -15858);
                          ((ig) this).a(false, (pj) (Object) var8);
                          return;
                        } else {
                          ((ig) this).a(false, (pj) (Object) var8);
                          return;
                        }
                      } else {
                        var8.a(vk.field_y, 7, -15858);
                        ((ig) this).a(false, (pj) (Object) var8);
                        return;
                      }
                    } else {
                      if ((param2.field_b ^ -1) == -6) {
                        var8.a(vc.field_n, 11, -15858);
                        var8.a(ld.field_d, 17, -15858);
                        if (3 != param2.field_b) {
                          if (6 == param2.field_b) {
                            var8.a(qf.field_k, 9, -15858);
                            ((ig) this).a(false, (pj) (Object) var8);
                            return;
                          } else {
                            ((ig) this).a(false, (pj) (Object) var8);
                            return;
                          }
                        } else {
                          var8.a(vk.field_y, 7, -15858);
                          ((ig) this).a(false, (pj) (Object) var8);
                          return;
                        }
                      } else {
                        var8.a(vc.field_i, -1, -15858);
                        if (3 != param2.field_b) {
                          if (6 == param2.field_b) {
                            var8.a(qf.field_k, 9, -15858);
                            ((ig) this).a(false, (pj) (Object) var8);
                            return;
                          } else {
                            ((ig) this).a(false, (pj) (Object) var8);
                            return;
                          }
                        } else {
                          var8.a(vk.field_y, 7, -15858);
                          ((ig) this).a(false, (pj) (Object) var8);
                          return;
                        }
                      }
                    }
                  }
                } else {
                  return;
                }
              }
            }
          }
        }
        if (param1 >= 115) {
          var14 = new ec((dh) this, qc.field_b, var4);
          var5 = var14;
          if (param2.field_f) {
            if (param2.field_d) {
              ((ig) this).a(false, (pj) (Object) new ob((ig) this));
              return;
            } else {
              s discarded$18 = var14.a(sk.field_C, -34, (ag) this);
              ((ig) this).a(false, (pj) (Object) var14);
              return;
            }
          } else {
            if (((ig) this).field_kb) {
              s discarded$19 = var14.a(sk.field_C, -34, (ag) this);
              if (3 != param2.field_b) {
                if (6 == param2.field_b) {
                  var14.a(qf.field_k, 9, -15858);
                  ((ig) this).a(false, (pj) (Object) var14);
                  return;
                } else {
                  ((ig) this).a(false, (pj) (Object) var14);
                  return;
                }
              } else {
                var14.a(vk.field_y, 7, -15858);
                ((ig) this).a(false, (pj) (Object) var14);
                return;
              }
            } else {
              if ((param2.field_b ^ -1) == -6) {
                var14.a(vc.field_n, 11, -15858);
                var14.a(ld.field_d, 17, -15858);
                if (3 != param2.field_b) {
                  if (6 == param2.field_b) {
                    var14.a(qf.field_k, 9, -15858);
                    ((ig) this).a(false, (pj) (Object) var14);
                    return;
                  } else {
                    ((ig) this).a(false, (pj) (Object) var14);
                    return;
                  }
                } else {
                  var14.a(vk.field_y, 7, -15858);
                  ((ig) this).a(false, (pj) (Object) var14);
                  return;
                }
              } else {
                var14.a(vc.field_i, -1, -15858);
                if (3 != param2.field_b) {
                  if (6 == param2.field_b) {
                    var14.a(qf.field_k, 9, -15858);
                    ((ig) this).a(false, (pj) (Object) var14);
                    return;
                  } else {
                    ((ig) this).a(false, (pj) (Object) var14);
                    return;
                  }
                } else {
                  var14.a(vk.field_y, 7, -15858);
                  ((ig) this).a(false, (pj) (Object) var14);
                  return;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    ig(sk param0, rf param1) {
        super(param0, qc.field_b, bh.field_f, false, false);
        ((ig) this).field_jb = param1;
    }

    final void f(byte param0) {
        int var2 = -19 % ((-21 - param0) / 42);
        this.a(true, (byte) 122, oe.a(248, tb.field_a, -3));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_gb = "NORMO";
        field_fb = 0;
    }
}
