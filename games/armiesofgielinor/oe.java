/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe extends ro implements he {
    private boolean field_Ab;
    private kd field_xb;
    static at field_Bb;
    private boolean field_yb;
    static je field_Cb;
    static String field_zb;

    final boolean a(byte param0) {
        wd var2 = null;
        Object var3 = null;
        if (param0 == -1) {
          if (((oe) this).field_L) {
            if (!((oe) this).field_Ab) {
              var2 = ki.a(-61440);
              if (var2 == null) {
                return this.a((byte) -1);
              } else {
                this.a(false, (byte) -53, var2);
                return this.a((byte) -1);
              }
            } else {
              return this.a((byte) -1);
            }
          } else {
            return this.a((byte) -1);
          }
        } else {
          var3 = null;
          this.a(true, (byte) 54, (wd) null);
          if (((oe) this).field_L) {
            if (((oe) this).field_Ab) {
              return this.a((byte) -1);
            } else {
              L0: {
                var2 = ki.a(-61440);
                if (var2 != null) {
                  this.a(false, (byte) -53, var2);
                  break L0;
                } else {
                  break L0;
                }
              }
              return this.a((byte) -1);
            }
          } else {
            return this.a((byte) -1);
          }
        }
    }

    public static void j(byte param0) {
        field_Cb = null;
        field_Bb = null;
        field_zb = null;
        int var1 = 18 / ((-35 - param0) / 35);
    }

    final void k(byte param0) {
        this.a(true, (byte) -103, il.a(-1, 248, bp.field_m));
        if (param0 >= -81) {
            ((oe) this).field_Ab = false;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 == -6) {
          if (param6 < param4) {
            if (param2 <= param4) {
              if (param6 < param2) {
                vp.a(param2, param6, param3, param4, param7, param5, qn.field_d, param1, (byte) 20);
                return;
              } else {
                vp.a(param6, param2, param3, param4, param1, param5, qn.field_d, param7, (byte) 20);
                return;
              }
            } else {
              vp.a(param4, param6, param7, param2, param3, param5, qn.field_d, param1, (byte) 20);
              return;
            }
          } else {
            if (param2 <= param6) {
              if (param4 < param2) {
                vp.a(param2, param4, param1, param6, param7, param5, qn.field_d, param3, (byte) 20);
                return;
              } else {
                vp.a(param4, param2, param1, param6, param3, param5, qn.field_d, param7, (byte) 20);
                return;
              }
            } else {
              vp.a(param6, param4, param7, param2, param1, param5, qn.field_d, param3, (byte) 20);
              return;
            }
          }
        } else {
          return;
        }
    }

    public final void a(int param0, int param1, int param2, int param3, fw param4) {
        if (((oe) this).field_yb) {
            td.a(false, true, 21);
            return;
        }
        bt.b(param1 ^ param1);
        ((oe) this).b(true);
    }

    private final void a(boolean param0, byte param1, wd param2) {
        String var4 = null;
        ad var5 = null;
        int var6 = 0;
        String var7 = null;
        ad var8 = null;
        ad var9 = null;
        ad var10 = null;
        String var11 = null;
        ad var12 = null;
        ad var13 = null;
        ad var14 = null;
        L0: {
          var6 = ArmiesOfGielinor.field_M ? 1 : 0;
          ((oe) this).field_Ab = true;
          if (!param2.field_a) {
            if (null == param2.field_c) {
              var11 = param2.field_i;
              if (param2.field_d == 248) {
                L1: {
                  if (!param0) {
                    no.b(false);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var4 = bp.field_m;
                ((oe) this).field_yb = true;
                break L0;
              } else {
                L2: {
                  if (param1 < -2) {
                    break L2;
                  } else {
                    ((oe) this).field_xb = null;
                    break L2;
                  }
                }
                var12 = new ad((ro) this, bv.field_t, var11);
                var5 = var12;
                if (param2.field_a) {
                  if (param2.field_h) {
                    ((oe) this).a((kb) (Object) new qd((oe) this), (byte) -81);
                    return;
                  } else {
                    fw discarded$12 = var12.a(ro.field_kb, (qo) this, (byte) -61);
                    ((oe) this).a((kb) (Object) var12, (byte) -110);
                    return;
                  }
                } else {
                  if (!((oe) this).field_yb) {
                    if ((param2.field_d ^ -1) != -6) {
                      var12.a(fj.field_a, -1, 1);
                      if (param2.field_d == 3) {
                        var12.a(te.field_m, 7, 1);
                        ((oe) this).a((kb) (Object) var12, (byte) -110);
                        return;
                      } else {
                        if (6 != param2.field_d) {
                          ((oe) this).a((kb) (Object) var12, (byte) -110);
                          return;
                        } else {
                          var12.a(ag.field_O, 9, 1);
                          ((oe) this).a((kb) (Object) var12, (byte) -110);
                          return;
                        }
                      }
                    } else {
                      var12.a(me.field_d, 11, 1);
                      var12.a(dt.field_c, 17, 1);
                      if (param2.field_d == 3) {
                        var12.a(te.field_m, 7, 1);
                        ((oe) this).a((kb) (Object) var12, (byte) -110);
                        return;
                      } else {
                        if (6 != param2.field_d) {
                          ((oe) this).a((kb) (Object) var12, (byte) -110);
                          return;
                        } else {
                          var12.a(ag.field_O, 9, 1);
                          ((oe) this).a((kb) (Object) var12, (byte) -110);
                          return;
                        }
                      }
                    }
                  } else {
                    fw discarded$13 = var12.a(ro.field_kb, (qo) this, (byte) 110);
                    if (param2.field_d == 3) {
                      var12.a(te.field_m, 7, 1);
                      ((oe) this).a((kb) (Object) var12, (byte) -110);
                      return;
                    } else {
                      if (6 != param2.field_d) {
                        ((oe) this).a((kb) (Object) var12, (byte) -110);
                        return;
                      } else {
                        var12.a(ag.field_O, 9, 1);
                        ((oe) this).a((kb) (Object) var12, (byte) -110);
                        return;
                      }
                    }
                  }
                }
              }
            } else {
              var7 = oc.field_Ob;
              if (null != ((oe) this).field_xb) {
                L3: {
                  ((oe) this).field_xb.a((byte) -116);
                  if (param1 < -2) {
                    break L3;
                  } else {
                    ((oe) this).field_xb = null;
                    break L3;
                  }
                }
                var10 = new ad((ro) this, bv.field_t, var7);
                if (param2.field_a) {
                  if (param2.field_h) {
                    ((oe) this).a((kb) (Object) new qd((oe) this), (byte) -81);
                    return;
                  } else {
                    fw discarded$14 = var10.a(ro.field_kb, (qo) this, (byte) -61);
                    ((oe) this).a((kb) (Object) var10, (byte) -110);
                    return;
                  }
                } else {
                  L4: {
                    if (!((oe) this).field_yb) {
                      if ((param2.field_d ^ -1) != -6) {
                        var10.a(fj.field_a, -1, 1);
                        break L4;
                      } else {
                        var10.a(me.field_d, 11, 1);
                        var10.a(dt.field_c, 17, 1);
                        break L4;
                      }
                    } else {
                      fw discarded$15 = var10.a(ro.field_kb, (qo) this, (byte) 110);
                      break L4;
                    }
                  }
                  if (param2.field_d == 3) {
                    var10.a(te.field_m, 7, 1);
                    ((oe) this).a((kb) (Object) var10, (byte) -110);
                    return;
                  } else {
                    if (6 == param2.field_d) {
                      var10.a(ag.field_O, 9, 1);
                      ((oe) this).a((kb) (Object) var10, (byte) -110);
                      return;
                    } else {
                      ((oe) this).a((kb) (Object) var10, (byte) -110);
                      return;
                    }
                  }
                }
              } else {
                if (param1 < -2) {
                  var9 = new ad((ro) this, bv.field_t, var7);
                  var5 = var9;
                  if (param2.field_a) {
                    if (param2.field_h) {
                      ((oe) this).a((kb) (Object) new qd((oe) this), (byte) -81);
                      return;
                    } else {
                      fw discarded$16 = var9.a(ro.field_kb, (qo) this, (byte) -61);
                      ((oe) this).a((kb) (Object) var9, (byte) -110);
                      return;
                    }
                  } else {
                    if (!((oe) this).field_yb) {
                      if ((param2.field_d ^ -1) != -6) {
                        var9.a(fj.field_a, -1, 1);
                        if (param2.field_d == 3) {
                          var9.a(te.field_m, 7, 1);
                          ((oe) this).a((kb) (Object) var9, (byte) -110);
                          return;
                        } else {
                          if (6 != param2.field_d) {
                            ((oe) this).a((kb) (Object) var9, (byte) -110);
                            return;
                          } else {
                            var9.a(ag.field_O, 9, 1);
                            ((oe) this).a((kb) (Object) var9, (byte) -110);
                            return;
                          }
                        }
                      } else {
                        var9.a(me.field_d, 11, 1);
                        var9.a(dt.field_c, 17, 1);
                        if (param2.field_d == 3) {
                          var9.a(te.field_m, 7, 1);
                          ((oe) this).a((kb) (Object) var9, (byte) -110);
                          return;
                        } else {
                          if (6 != param2.field_d) {
                            ((oe) this).a((kb) (Object) var9, (byte) -110);
                            return;
                          } else {
                            var9.a(ag.field_O, 9, 1);
                            ((oe) this).a((kb) (Object) var9, (byte) -110);
                            return;
                          }
                        }
                      }
                    } else {
                      fw discarded$17 = var9.a(ro.field_kb, (qo) this, (byte) 110);
                      if (param2.field_d == 3) {
                        var9.a(te.field_m, 7, 1);
                        ((oe) this).a((kb) (Object) var9, (byte) -110);
                        return;
                      } else {
                        if (6 != param2.field_d) {
                          ((oe) this).a((kb) (Object) var9, (byte) -110);
                          return;
                        } else {
                          var9.a(ag.field_O, 9, 1);
                          ((oe) this).a((kb) (Object) var9, (byte) -110);
                          return;
                        }
                      }
                    }
                  }
                } else {
                  ((oe) this).field_xb = null;
                  var8 = new ad((ro) this, bv.field_t, var7);
                  if (param2.field_a) {
                    if (param2.field_h) {
                      ((oe) this).a((kb) (Object) new qd((oe) this), (byte) -81);
                      return;
                    } else {
                      fw discarded$18 = var8.a(ro.field_kb, (qo) this, (byte) -61);
                      ((oe) this).a((kb) (Object) var8, (byte) -110);
                      return;
                    }
                  } else {
                    L5: {
                      if (!((oe) this).field_yb) {
                        if ((param2.field_d ^ -1) != -6) {
                          var8.a(fj.field_a, -1, 1);
                          break L5;
                        } else {
                          var8.a(me.field_d, 11, 1);
                          var8.a(dt.field_c, 17, 1);
                          break L5;
                        }
                      } else {
                        fw discarded$19 = var8.a(ro.field_kb, (qo) this, (byte) 110);
                        break L5;
                      }
                    }
                    if (param2.field_d == 3) {
                      var8.a(te.field_m, 7, 1);
                      ((oe) this).a((kb) (Object) var8, (byte) -110);
                      return;
                    } else {
                      if (6 == param2.field_d) {
                        var8.a(ag.field_O, 9, 1);
                        ((oe) this).a((kb) (Object) var8, (byte) -110);
                        return;
                      } else {
                        ((oe) this).a((kb) (Object) var8, (byte) -110);
                        return;
                      }
                    }
                  }
                }
              }
            }
          } else {
            var4 = eq.field_i;
            break L0;
          }
        }
        if (param1 < -2) {
          var14 = new ad((ro) this, bv.field_t, var4);
          var5 = var14;
          if (param2.field_a) {
            if (param2.field_h) {
              ((oe) this).a((kb) (Object) new qd((oe) this), (byte) -81);
              return;
            } else {
              fw discarded$20 = var14.a(ro.field_kb, (qo) this, (byte) -61);
              ((oe) this).a((kb) (Object) var14, (byte) -110);
              return;
            }
          } else {
            if (!((oe) this).field_yb) {
              if ((param2.field_d ^ -1) != -6) {
                var14.a(fj.field_a, -1, 1);
                if (param2.field_d == 3) {
                  var14.a(te.field_m, 7, 1);
                  ((oe) this).a((kb) (Object) var14, (byte) -110);
                  return;
                } else {
                  if (6 != param2.field_d) {
                    ((oe) this).a((kb) (Object) var14, (byte) -110);
                    return;
                  } else {
                    var14.a(ag.field_O, 9, 1);
                    ((oe) this).a((kb) (Object) var14, (byte) -110);
                    return;
                  }
                }
              } else {
                var14.a(me.field_d, 11, 1);
                var14.a(dt.field_c, 17, 1);
                if (param2.field_d == 3) {
                  var14.a(te.field_m, 7, 1);
                  ((oe) this).a((kb) (Object) var14, (byte) -110);
                  return;
                } else {
                  if (6 != param2.field_d) {
                    ((oe) this).a((kb) (Object) var14, (byte) -110);
                    return;
                  } else {
                    var14.a(ag.field_O, 9, 1);
                    ((oe) this).a((kb) (Object) var14, (byte) -110);
                    return;
                  }
                }
              }
            } else {
              fw discarded$21 = var14.a(ro.field_kb, (qo) this, (byte) 110);
              if (param2.field_d == 3) {
                var14.a(te.field_m, 7, 1);
                ((oe) this).a((kb) (Object) var14, (byte) -110);
                return;
              } else {
                if (6 != param2.field_d) {
                  ((oe) this).a((kb) (Object) var14, (byte) -110);
                  return;
                } else {
                  var14.a(ag.field_O, 9, 1);
                  ((oe) this).a((kb) (Object) var14, (byte) -110);
                  return;
                }
              }
            }
          }
        } else {
          ((oe) this).field_xb = null;
          var13 = new ad((ro) this, bv.field_t, var4);
          var5 = var13;
          if (param2.field_a) {
            if (param2.field_h) {
              ((oe) this).a((kb) (Object) new qd((oe) this), (byte) -81);
              return;
            } else {
              fw discarded$22 = var13.a(ro.field_kb, (qo) this, (byte) -61);
              ((oe) this).a((kb) (Object) var13, (byte) -110);
              return;
            }
          } else {
            if (!((oe) this).field_yb) {
              if ((param2.field_d ^ -1) != -6) {
                var13.a(fj.field_a, -1, 1);
                if (param2.field_d == 3) {
                  var13.a(te.field_m, 7, 1);
                  ((oe) this).a((kb) (Object) var13, (byte) -110);
                  return;
                } else {
                  if (6 != param2.field_d) {
                    ((oe) this).a((kb) (Object) var13, (byte) -110);
                    return;
                  } else {
                    var13.a(ag.field_O, 9, 1);
                    ((oe) this).a((kb) (Object) var13, (byte) -110);
                    return;
                  }
                }
              } else {
                var13.a(me.field_d, 11, 1);
                var13.a(dt.field_c, 17, 1);
                if (param2.field_d == 3) {
                  var13.a(te.field_m, 7, 1);
                  ((oe) this).a((kb) (Object) var13, (byte) -110);
                  return;
                } else {
                  if (6 != param2.field_d) {
                    ((oe) this).a((kb) (Object) var13, (byte) -110);
                    return;
                  } else {
                    var13.a(ag.field_O, 9, 1);
                    ((oe) this).a((kb) (Object) var13, (byte) -110);
                    return;
                  }
                }
              }
            } else {
              fw discarded$23 = var13.a(ro.field_kb, (qo) this, (byte) 110);
              if (param2.field_d == 3) {
                var13.a(te.field_m, 7, 1);
                ((oe) this).a((kb) (Object) var13, (byte) -110);
                return;
              } else {
                if (6 != param2.field_d) {
                  ((oe) this).a((kb) (Object) var13, (byte) -110);
                  return;
                } else {
                  var13.a(ag.field_O, 9, 1);
                  ((oe) this).a((kb) (Object) var13, (byte) -110);
                  return;
                }
              }
            }
          }
        }
    }

    oe(gk param0, kd param1) {
        super(param0, bv.field_t, wm.field_d, false, false);
        ((oe) this).field_xb = param1;
    }

    static int c(int param0, int param1) {
        return param0 | param1;
    }

    final static void a(byte[] param0, int param1) {
        if (!(param1 <= param0[0])) {
            return;
        }
        wp.field_E = param0[1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Bb = new at();
        field_zb = "Withdraw invitation to <%0> to join this game";
    }
}
