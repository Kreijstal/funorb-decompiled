/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fq extends qq implements tb {
    static boolean field_Gb;
    static String field_Db;
    static String field_Bb;
    private boolean field_Fb;
    private boolean field_Eb;
    static int[] field_Hb;
    private nf field_Cb;

    final static boolean m(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        boolean stackOut_6_0 = false;
        int stackOut_3_0 = 0;
        boolean stackOut_2_0 = false;
        if (param0 != 0) {
          L0: {
            boolean discarded$8 = fq.m(71);
            if (null != ne.field_u) {
              stackOut_7_0 = 1;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = um.field_e;
              stackIn_8_0 = stackOut_6_0 ? 1 : 0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (null != ne.field_u) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = um.field_e;
              stackIn_4_0 = stackOut_2_0 ? 1 : 0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void l(int param0) {
        field_Bb = null;
        field_Db = null;
        if (param0 != 5) {
            return;
        }
        field_Hb = null;
    }

    private final void a(wc param0, int param1, boolean param2) {
        String var4 = null;
        wk var5 = null;
        int var6 = 0;
        String var7 = null;
        wk var8 = null;
        String var9 = null;
        wk var10 = null;
        String var11 = null;
        wk var12 = null;
        wk var13 = null;
        L0: {
          var6 = Pool.field_O;
          ((fq) this).field_Fb = true;
          if (param1 == 5) {
            break L0;
          } else {
            field_Gb = true;
            break L0;
          }
        }
        L1: {
          if (!param0.field_f) {
            if (null == param0.field_c) {
              var7 = param0.field_b;
              if ((param0.field_g ^ -1) == -249) {
                if (param2) {
                  var9 = hb.field_b;
                  ((fq) this).field_Eb = true;
                  var10 = new wk((qq) this, bi.field_e, var9);
                  var5 = var10;
                  if (param0.field_f) {
                    if (param0.field_e) {
                      ((fq) this).d((ei) (Object) new sd((fq) this), 30);
                      return;
                    } else {
                      fe discarded$8 = var10.a(fg.field_c, param1 + -88, (cc) this);
                      ((fq) this).d((ei) (Object) var10, 30);
                      return;
                    }
                  } else {
                    if (((fq) this).field_Eb) {
                      fe discarded$9 = var10.a(fg.field_c, -123, (cc) this);
                      if (3 == param0.field_g) {
                        var10.a(7, o.field_w, param1 ^ 4);
                        ((fq) this).d((ei) (Object) var10, 30);
                        return;
                      } else {
                        if (param0.field_g == 6) {
                          var10.a(9, e.field_f, 1);
                          ((fq) this).d((ei) (Object) var10, 30);
                          return;
                        } else {
                          ((fq) this).d((ei) (Object) var10, 30);
                          return;
                        }
                      }
                    } else {
                      if (param0.field_g == 5) {
                        var10.a(11, hb.field_c, param1 ^ 4);
                        var10.a(17, dj.field_e, 1);
                        if (3 == param0.field_g) {
                          var10.a(7, o.field_w, param1 ^ 4);
                          ((fq) this).d((ei) (Object) var10, 30);
                          return;
                        } else {
                          if (param0.field_g == 6) {
                            var10.a(9, e.field_f, 1);
                            ((fq) this).d((ei) (Object) var10, 30);
                            return;
                          } else {
                            ((fq) this).d((ei) (Object) var10, 30);
                            return;
                          }
                        }
                      } else {
                        var10.a(-1, jk.field_a, param1 ^ 4);
                        if (3 == param0.field_g) {
                          var10.a(7, o.field_w, param1 ^ 4);
                          ((fq) this).d((ei) (Object) var10, 30);
                          return;
                        } else {
                          if (param0.field_g == 6) {
                            var10.a(9, e.field_f, 1);
                            ((fq) this).d((ei) (Object) var10, 30);
                            return;
                          } else {
                            ((fq) this).d((ei) (Object) var10, 30);
                            return;
                          }
                        }
                      }
                    }
                  }
                } else {
                  uf.r((byte) -80);
                  var11 = hb.field_b;
                  var4 = var11;
                  ((fq) this).field_Eb = true;
                  var12 = new wk((qq) this, bi.field_e, var11);
                  var5 = var12;
                  if (param0.field_f) {
                    if (param0.field_e) {
                      ((fq) this).d((ei) (Object) new sd((fq) this), 30);
                      return;
                    } else {
                      fe discarded$10 = var12.a(fg.field_c, param1 + -88, (cc) this);
                      ((fq) this).d((ei) (Object) var12, 30);
                      return;
                    }
                  } else {
                    if (((fq) this).field_Eb) {
                      fe discarded$11 = var12.a(fg.field_c, -123, (cc) this);
                      if (3 == param0.field_g) {
                        var12.a(7, o.field_w, param1 ^ 4);
                        ((fq) this).d((ei) (Object) var12, 30);
                        return;
                      } else {
                        if (param0.field_g == 6) {
                          var12.a(9, e.field_f, 1);
                          ((fq) this).d((ei) (Object) var12, 30);
                          return;
                        } else {
                          ((fq) this).d((ei) (Object) var12, 30);
                          return;
                        }
                      }
                    } else {
                      if (param0.field_g == 5) {
                        var12.a(11, hb.field_c, param1 ^ 4);
                        var12.a(17, dj.field_e, 1);
                        if (3 == param0.field_g) {
                          var12.a(7, o.field_w, param1 ^ 4);
                          ((fq) this).d((ei) (Object) var12, 30);
                          return;
                        } else {
                          if (param0.field_g == 6) {
                            var12.a(9, e.field_f, 1);
                            ((fq) this).d((ei) (Object) var12, 30);
                            return;
                          } else {
                            ((fq) this).d((ei) (Object) var12, 30);
                            return;
                          }
                        }
                      } else {
                        var12.a(-1, jk.field_a, param1 ^ 4);
                        if (3 == param0.field_g) {
                          var12.a(7, o.field_w, param1 ^ 4);
                          ((fq) this).d((ei) (Object) var12, 30);
                          return;
                        } else {
                          if (param0.field_g == 6) {
                            var12.a(9, e.field_f, 1);
                            ((fq) this).d((ei) (Object) var12, 30);
                            return;
                          } else {
                            ((fq) this).d((ei) (Object) var12, 30);
                            return;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                var8 = new wk((qq) this, bi.field_e, var7);
                if (param0.field_f) {
                  if (!param0.field_e) {
                    fe discarded$12 = var8.a(fg.field_c, param1 + -88, (cc) this);
                    ((fq) this).d((ei) (Object) var8, 30);
                    return;
                  } else {
                    ((fq) this).d((ei) (Object) new sd((fq) this), 30);
                    return;
                  }
                } else {
                  L2: {
                    if (((fq) this).field_Eb) {
                      fe discarded$13 = var8.a(fg.field_c, -123, (cc) this);
                      break L2;
                    } else {
                      if (param0.field_g == 5) {
                        var8.a(11, hb.field_c, param1 ^ 4);
                        var8.a(17, dj.field_e, 1);
                        break L2;
                      } else {
                        var8.a(-1, jk.field_a, param1 ^ 4);
                        break L2;
                      }
                    }
                  }
                  if (3 == param0.field_g) {
                    var8.a(7, o.field_w, param1 ^ 4);
                    ((fq) this).d((ei) (Object) var8, 30);
                    return;
                  } else {
                    if (param0.field_g == 6) {
                      var8.a(9, e.field_f, 1);
                      ((fq) this).d((ei) (Object) var8, 30);
                      return;
                    } else {
                      ((fq) this).d((ei) (Object) var8, 30);
                      return;
                    }
                  }
                }
              }
            } else {
              var4 = gi.field_n;
              if (null == ((fq) this).field_Cb) {
                break L1;
              } else {
                ((fq) this).field_Cb.a(param1 ^ 16777210);
                break L1;
              }
            }
          } else {
            var4 = ud.field_H;
            break L1;
          }
        }
        var13 = new wk((qq) this, bi.field_e, var4);
        var5 = var13;
        if (param0.field_f) {
          if (param0.field_e) {
            ((fq) this).d((ei) (Object) new sd((fq) this), 30);
            return;
          } else {
            fe discarded$14 = var13.a(fg.field_c, param1 + -88, (cc) this);
            ((fq) this).d((ei) (Object) var13, 30);
            return;
          }
        } else {
          if (((fq) this).field_Eb) {
            fe discarded$15 = var13.a(fg.field_c, -123, (cc) this);
            if (3 == param0.field_g) {
              var13.a(7, o.field_w, param1 ^ 4);
              ((fq) this).d((ei) (Object) var13, 30);
              return;
            } else {
              if (param0.field_g == 6) {
                var13.a(9, e.field_f, 1);
                ((fq) this).d((ei) (Object) var13, 30);
                return;
              } else {
                ((fq) this).d((ei) (Object) var13, 30);
                return;
              }
            }
          } else {
            if (param0.field_g == 5) {
              var13.a(11, hb.field_c, param1 ^ 4);
              var13.a(17, dj.field_e, 1);
              if (3 == param0.field_g) {
                var13.a(7, o.field_w, param1 ^ 4);
                ((fq) this).d((ei) (Object) var13, 30);
                return;
              } else {
                if (param0.field_g == 6) {
                  var13.a(9, e.field_f, 1);
                  ((fq) this).d((ei) (Object) var13, 30);
                  return;
                } else {
                  ((fq) this).d((ei) (Object) var13, 30);
                  return;
                }
              }
            } else {
              var13.a(-1, jk.field_a, param1 ^ 4);
              if (3 == param0.field_g) {
                var13.a(7, o.field_w, param1 ^ 4);
                ((fq) this).d((ei) (Object) var13, 30);
                return;
              } else {
                if (param0.field_g == 6) {
                  var13.a(9, e.field_f, 1);
                  ((fq) this).d((ei) (Object) var13, 30);
                  return;
                } else {
                  ((fq) this).d((ei) (Object) var13, 30);
                  return;
                }
              }
            }
          }
        }
    }

    public final void a(boolean param0, int param1, int param2, fe param3, int param4) {
        if (((fq) this).field_Eb) {
          t.a(115, false, true);
          return;
        } else {
          nm.a((byte) 41);
          if (!param0) {
            return;
          } else {
            ((fq) this).k(17);
            return;
          }
        }
    }

    final boolean g(byte param0) {
        wc var2 = null;
        if (param0 == -20) {
          if (((fq) this).field_R) {
            if (!((fq) this).field_Fb) {
              var2 = hi.a(true);
              if (var2 == null) {
                return super.g((byte) -20);
              } else {
                this.a(var2, param0 + 25, false);
                return super.g((byte) -20);
              }
            } else {
              return super.g((byte) -20);
            }
          } else {
            return super.g((byte) -20);
          }
        } else {
          field_Bb = null;
          if (((fq) this).field_R) {
            if (!((fq) this).field_Fb) {
              var2 = hi.a(true);
              if (var2 == null) {
                return super.g((byte) -20);
              } else {
                this.a(var2, param0 + 25, false);
                return super.g((byte) -20);
              }
            } else {
              return super.g((byte) -20);
            }
          } else {
            return super.g((byte) -20);
          }
        }
    }

    fq(lq param0, nf param1) {
        super(param0, bi.field_e, tk.field_j, false, false);
        ((fq) this).field_Cb = param1;
    }

    final void p(byte param0) {
        this.a(gg.a(248, true, hb.field_b), 5, true);
        if (param0 > -44) {
            field_Gb = true;
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        int var4 = 0;
        le discarded$10 = lg.field_s.a(true, (byte) 106, (java.awt.Component) (Object) vj.a((byte) -37));
        sg.field_P = 0;
        sq.field_b = param1;
        if (param0 == -3405) {
          L0: {
            ga.m(param0 ^ 22150);
            if (dn.a(true, sq.field_b)) {
              L1: {
                s.field_c[sq.field_b].field_w = param2;
                var4 = 0;
                if ((sq.field_b ^ -1) == -22) {
                  var4 = -1;
                  break L1;
                } else {
                  break L1;
                }
              }
              s.field_c[sq.field_b].a(0, var4, param3);
              if ((sq.field_b ^ -1) == -22) {
                id.a(-83, param3);
                break L0;
              } else {
                break L0;
              }
            } else {
              break L0;
            }
          }
          if (-1 >= (sq.field_b ^ -1)) {
            if (s.field_c[sq.field_b].field_n) {
              L2: {
                ac.a(256, false, true, ul.field_m);
                if (sq.field_b == -2) {
                  break L2;
                } else {
                  if (sq.field_b == -4) {
                    break L2;
                  } else {
                    kf discarded$11 = vj.a((byte) -27, il.field_c[3]);
                    return;
                  }
                }
              }
              return;
            } else {
              if (-2 == sq.field_b) {
                L3: {
                  ac.a(256, false, true, ul.field_m);
                  if (sq.field_b == -2) {
                    break L3;
                  } else {
                    if (sq.field_b == -4) {
                      break L3;
                    } else {
                      kf discarded$12 = vj.a((byte) -27, il.field_c[3]);
                      return;
                    }
                  }
                }
                return;
              } else {
                if (4 == (sq.field_b ^ -1)) {
                  L4: {
                    ac.a(256, false, true, ul.field_m);
                    if (sq.field_b == -2) {
                      break L4;
                    } else {
                      if (sq.field_b == -4) {
                        break L4;
                      } else {
                        kf discarded$13 = vj.a((byte) -27, il.field_c[3]);
                        return;
                      }
                    }
                  }
                  return;
                } else {
                  if (sq.field_b == -4) {
                    L5: {
                      ac.a(256, false, true, ul.field_m);
                      if (sq.field_b == -2) {
                        break L5;
                      } else {
                        if (sq.field_b == -4) {
                          break L5;
                        } else {
                          kf discarded$14 = vj.a((byte) -27, il.field_c[3]);
                          return;
                        }
                      }
                    }
                    return;
                  } else {
                    if (sq.field_b != -2) {
                      if (sq.field_b == -4) {
                        return;
                      } else {
                        kf discarded$15 = vj.a((byte) -27, il.field_c[3]);
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          } else {
            if (-2 == sq.field_b) {
              L6: {
                ac.a(256, false, true, ul.field_m);
                if (sq.field_b == -2) {
                  break L6;
                } else {
                  if (sq.field_b == -4) {
                    break L6;
                  } else {
                    kf discarded$16 = vj.a((byte) -27, il.field_c[3]);
                    break L6;
                  }
                }
              }
              return;
            } else {
              if (4 == (sq.field_b ^ -1)) {
                L7: {
                  ac.a(256, false, true, ul.field_m);
                  if (sq.field_b == -2) {
                    break L7;
                  } else {
                    if (sq.field_b == -4) {
                      break L7;
                    } else {
                      kf discarded$17 = vj.a((byte) -27, il.field_c[3]);
                      return;
                    }
                  }
                }
                return;
              } else {
                if (sq.field_b == -4) {
                  ac.a(256, false, true, ul.field_m);
                  if (sq.field_b != -2) {
                    if (sq.field_b != -4) {
                      kf discarded$18 = vj.a((byte) -27, il.field_c[3]);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  if (sq.field_b != -2) {
                    if (sq.field_b != -4) {
                      kf discarded$19 = vj.a((byte) -27, il.field_c[3]);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Db = "On";
        field_Bb = "Set up new game";
        field_Hb = new int[]{2, 20, 21, 49, 6, 5, 12, 13};
    }
}
