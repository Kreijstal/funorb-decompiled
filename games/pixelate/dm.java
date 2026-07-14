/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dm extends vk implements vo {
    private boolean field_yb;
    private boolean field_xb;
    static int[] field_zb;
    private pl field_Ab;
    static int field_Cb;
    static int field_Bb;

    final static void i(byte param0) {
        L0: {
          if (null != to.field_r) {
            to.field_r.p(-108);
            break L0;
          } else {
            break L0;
          }
        }
        aa.field_c = new fh();
        ph.field_l.c((ng) (Object) aa.field_c, -125);
        if (param0 != -51) {
          field_zb = null;
          return;
        } else {
          return;
        }
    }

    dm(kn param0, pl param1) {
        super(param0, ba.field_d, hm.field_e, false, false);
        ((dm) this).field_Ab = param1;
    }

    final static boolean q(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 22452) {
          L0: {
            dm.r(-8);
            if (ga.field_f <= 250) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (ga.field_f <= 250) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final boolean c(boolean param0) {
        id var2 = null;
        if (!param0) {
          if (((dm) this).field_N) {
            if (!((dm) this).field_xb) {
              var2 = gg.d((byte) 52);
              if (var2 == null) {
                return super.c(false);
              } else {
                this.a(var2, -127, false);
                return super.c(false);
              }
            } else {
              return super.c(false);
            }
          } else {
            return super.c(false);
          }
        } else {
          ((dm) this).h((byte) -120);
          if (((dm) this).field_N) {
            if (!((dm) this).field_xb) {
              var2 = gg.d((byte) 52);
              if (var2 == null) {
                return super.c(false);
              } else {
                this.a(var2, -127, false);
                return super.c(false);
              }
            } else {
              return super.c(false);
            }
          } else {
            return super.c(false);
          }
        }
    }

    public static void r(int param0) {
        field_zb = null;
        if (param0 > -19) {
            field_zb = null;
        }
    }

    private final void a(id param0, int param1, boolean param2) {
        String var4 = null;
        vl var5 = null;
        int var6 = 0;
        String var7 = null;
        vl var8 = null;
        String var9 = null;
        vl var10 = null;
        String var11 = null;
        vl var12 = null;
        vl var13 = null;
        L0: {
          var6 = Pixelate.field_H ? 1 : 0;
          ((dm) this).field_xb = true;
          if (param1 < -121) {
            break L0;
          } else {
            ((dm) this).field_yb = true;
            break L0;
          }
        }
        L1: {
          if (!param0.field_g) {
            if (null == param0.field_f) {
              var7 = param0.field_c;
              if ((param0.field_a ^ -1) == -249) {
                if (param2) {
                  ((dm) this).field_yb = true;
                  var9 = ao.field_b;
                  var10 = new vl((vk) this, ba.field_d, var9);
                  var5 = var10;
                  if (!param0.field_g) {
                    if (!((dm) this).field_yb) {
                      if (-6 != (param0.field_a ^ -1)) {
                        var10.a(-1, -1, bo.field_f);
                        if (3 != param0.field_a) {
                          if (-7 == (param0.field_a ^ -1)) {
                            var10.a(9, -1, ho.field_d);
                            ((dm) this).c((ng) (Object) var10, -115);
                            return;
                          } else {
                            ((dm) this).c((ng) (Object) var10, -115);
                            return;
                          }
                        } else {
                          var10.a(7, -1, gd.field_d);
                          ((dm) this).c((ng) (Object) var10, -115);
                          return;
                        }
                      } else {
                        var10.a(11, -1, jj.field_c);
                        var10.a(17, -1, mk.field_e);
                        if (3 != param0.field_a) {
                          if (-7 == (param0.field_a ^ -1)) {
                            var10.a(9, -1, ho.field_d);
                            ((dm) this).c((ng) (Object) var10, -115);
                            return;
                          } else {
                            ((dm) this).c((ng) (Object) var10, -115);
                            return;
                          }
                        } else {
                          var10.a(7, -1, gd.field_d);
                          ((dm) this).c((ng) (Object) var10, -115);
                          return;
                        }
                      }
                    } else {
                      qm discarded$8 = var10.a(1707, (fn) this, vi.field_J);
                      if (3 != param0.field_a) {
                        if (-7 == (param0.field_a ^ -1)) {
                          var10.a(9, -1, ho.field_d);
                          ((dm) this).c((ng) (Object) var10, -115);
                          return;
                        } else {
                          ((dm) this).c((ng) (Object) var10, -115);
                          return;
                        }
                      } else {
                        var10.a(7, -1, gd.field_d);
                        ((dm) this).c((ng) (Object) var10, -115);
                        return;
                      }
                    }
                  } else {
                    if (param0.field_e) {
                      ((dm) this).c((ng) (Object) new hc((dm) this), -113);
                      return;
                    } else {
                      qm discarded$9 = var10.a(1707, (fn) this, vi.field_J);
                      ((dm) this).c((ng) (Object) var10, -115);
                      return;
                    }
                  }
                } else {
                  fq.g((byte) -73);
                  ((dm) this).field_yb = true;
                  var11 = ao.field_b;
                  var4 = var11;
                  var12 = new vl((vk) this, ba.field_d, var11);
                  var5 = var12;
                  if (!param0.field_g) {
                    if (!((dm) this).field_yb) {
                      if (-6 != (param0.field_a ^ -1)) {
                        var12.a(-1, -1, bo.field_f);
                        if (3 != param0.field_a) {
                          if (-7 == (param0.field_a ^ -1)) {
                            var12.a(9, -1, ho.field_d);
                            ((dm) this).c((ng) (Object) var12, -115);
                            return;
                          } else {
                            ((dm) this).c((ng) (Object) var12, -115);
                            return;
                          }
                        } else {
                          var12.a(7, -1, gd.field_d);
                          ((dm) this).c((ng) (Object) var12, -115);
                          return;
                        }
                      } else {
                        var12.a(11, -1, jj.field_c);
                        var12.a(17, -1, mk.field_e);
                        if (3 != param0.field_a) {
                          if (-7 == (param0.field_a ^ -1)) {
                            var12.a(9, -1, ho.field_d);
                            ((dm) this).c((ng) (Object) var12, -115);
                            return;
                          } else {
                            ((dm) this).c((ng) (Object) var12, -115);
                            return;
                          }
                        } else {
                          var12.a(7, -1, gd.field_d);
                          ((dm) this).c((ng) (Object) var12, -115);
                          return;
                        }
                      }
                    } else {
                      qm discarded$10 = var12.a(1707, (fn) this, vi.field_J);
                      if (3 != param0.field_a) {
                        if (-7 == (param0.field_a ^ -1)) {
                          var12.a(9, -1, ho.field_d);
                          ((dm) this).c((ng) (Object) var12, -115);
                          return;
                        } else {
                          ((dm) this).c((ng) (Object) var12, -115);
                          return;
                        }
                      } else {
                        var12.a(7, -1, gd.field_d);
                        ((dm) this).c((ng) (Object) var12, -115);
                        return;
                      }
                    }
                  } else {
                    if (param0.field_e) {
                      ((dm) this).c((ng) (Object) new hc((dm) this), -113);
                      return;
                    } else {
                      qm discarded$11 = var12.a(1707, (fn) this, vi.field_J);
                      ((dm) this).c((ng) (Object) var12, -115);
                      return;
                    }
                  }
                }
              } else {
                var8 = new vl((vk) this, ba.field_d, var7);
                if (!param0.field_g) {
                  L2: {
                    if (!((dm) this).field_yb) {
                      if (-6 != (param0.field_a ^ -1)) {
                        var8.a(-1, -1, bo.field_f);
                        break L2;
                      } else {
                        var8.a(11, -1, jj.field_c);
                        var8.a(17, -1, mk.field_e);
                        break L2;
                      }
                    } else {
                      qm discarded$12 = var8.a(1707, (fn) this, vi.field_J);
                      break L2;
                    }
                  }
                  if (3 != param0.field_a) {
                    if (-7 == (param0.field_a ^ -1)) {
                      var8.a(9, -1, ho.field_d);
                      ((dm) this).c((ng) (Object) var8, -115);
                      return;
                    } else {
                      ((dm) this).c((ng) (Object) var8, -115);
                      return;
                    }
                  } else {
                    var8.a(7, -1, gd.field_d);
                    ((dm) this).c((ng) (Object) var8, -115);
                    return;
                  }
                } else {
                  if (param0.field_e) {
                    ((dm) this).c((ng) (Object) new hc((dm) this), -113);
                    return;
                  } else {
                    qm discarded$13 = var8.a(1707, (fn) this, vi.field_J);
                    ((dm) this).c((ng) (Object) var8, -115);
                    return;
                  }
                }
              }
            } else {
              var4 = ek.field_e;
              if (((dm) this).field_Ab != null) {
                ((dm) this).field_Ab.a((byte) 103);
                break L1;
              } else {
                break L1;
              }
            }
          } else {
            var4 = gk.field_jb;
            break L1;
          }
        }
        var13 = new vl((vk) this, ba.field_d, var4);
        if (!param0.field_g) {
          if (!((dm) this).field_yb) {
            if (-6 != (param0.field_a ^ -1)) {
              var13.a(-1, -1, bo.field_f);
              if (3 != param0.field_a) {
                if (-7 == (param0.field_a ^ -1)) {
                  var13.a(9, -1, ho.field_d);
                  ((dm) this).c((ng) (Object) var13, -115);
                  return;
                } else {
                  ((dm) this).c((ng) (Object) var13, -115);
                  return;
                }
              } else {
                var13.a(7, -1, gd.field_d);
                ((dm) this).c((ng) (Object) var13, -115);
                return;
              }
            } else {
              var13.a(11, -1, jj.field_c);
              var13.a(17, -1, mk.field_e);
              if (3 != param0.field_a) {
                if (-7 == (param0.field_a ^ -1)) {
                  var13.a(9, -1, ho.field_d);
                  ((dm) this).c((ng) (Object) var13, -115);
                  return;
                } else {
                  ((dm) this).c((ng) (Object) var13, -115);
                  return;
                }
              } else {
                var13.a(7, -1, gd.field_d);
                ((dm) this).c((ng) (Object) var13, -115);
                return;
              }
            }
          } else {
            qm discarded$14 = var13.a(1707, (fn) this, vi.field_J);
            if (3 != param0.field_a) {
              if (-7 == (param0.field_a ^ -1)) {
                var13.a(9, -1, ho.field_d);
                ((dm) this).c((ng) (Object) var13, -115);
                return;
              } else {
                ((dm) this).c((ng) (Object) var13, -115);
                return;
              }
            } else {
              var13.a(7, -1, gd.field_d);
              ((dm) this).c((ng) (Object) var13, -115);
              return;
            }
          }
        } else {
          if (param0.field_e) {
            ((dm) this).c((ng) (Object) new hc((dm) this), -113);
            return;
          } else {
            qm discarded$15 = var13.a(1707, (fn) this, vi.field_J);
            ((dm) this).c((ng) (Object) var13, -115);
            return;
          }
        }
    }

    final static void a(boolean param0, boolean param1, int param2) {
        if (param0) {
          t.a(0, 0, t.field_j, t.field_d, 0, 192);
          if (param2 == 0) {
            rj.a(param2 ^ 91, param0);
            return;
          } else {
            dm.a(true, false, -123);
            rj.a(param2 ^ 91, param0);
            return;
          }
        } else {
          t.d();
          if (param2 == 0) {
            rj.a(param2 ^ 91, param0);
            return;
          } else {
            dm.a(true, false, -123);
            rj.a(param2 ^ 91, param0);
            return;
          }
        }
    }

    public final void a(qm param0, int param1, int param2, int param3, int param4) {
        if (!((dm) this).field_yb) {
          th.a(param2 ^ 8180);
          if (param2 != 11) {
            return;
          } else {
            ((dm) this).p(-119);
            return;
          }
        } else {
          rd.a(false, -17130, true);
          return;
        }
    }

    final void h(byte param0) {
        if (param0 > -96) {
          dm.a(true, false, -97);
          this.a(pa.a(248, ao.field_b, (byte) -121), -127, true);
          return;
        } else {
          this.a(pa.a(248, ao.field_b, (byte) -121), -127, true);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_zb = new int[256];
        var1 = 0;
        L0: while (true) {
          if (256 <= var1) {
            field_Cb = 300;
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if (-9 >= var2) {
                field_zb[var1] = var0;
                var1++;
                continue L0;
              } else {
                if (-2 == (1 & var0)) {
                  var0 = -306674912 ^ var0 >>> -1602097567;
                  var2++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1;
                  var2++;
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
