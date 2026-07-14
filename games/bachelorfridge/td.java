/*
 * Decompiled by CFR-JS 0.4.0.
 */
class td extends sfa {
    private boolean field_m;
    static String field_l;
    static pna field_o;
    nq field_j;
    int field_k;
    int field_i;
    int field_n;

    public static void b(boolean param0) {
        field_l = null;
        field_o = null;
        if (param0) {
            Object var2 = null;
            byte[] discarded$0 = td.a(-123, (byte[]) null);
        }
    }

    final void a(int param0, lu param1) {
        if (this.a(-4)) {
            er.a(((td) this).field_j, 111, param1);
        } else {
            param1.d(((td) this).field_k, 0);
            param1.d(((td) this).field_n, 0);
        }
        param1.d(((td) this).field_i, 0);
        param1.d(!((td) this).field_m ? 0 : 1, 0);
        int var3 = 71 % ((61 - param0) / 53);
    }

    td(int param0, aga param1) {
        super(4, param0, new nq(param1));
    }

    final static byte[] a(int param0, byte[] param1) {
        int var3 = 0;
        int var4 = 0;
        byte[] var5_ref_byte__ = null;
        int var5 = 0;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        lu var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0 < -46) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return null;
                }
                case 2: {
                    var9 = new lu(param1);
                    var3 = var9.b(16711935);
                    var4 = var9.f(-52);
                    if ((var4 ^ -1) > -1) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (0 == kq.field_k) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var4 > kq.field_k) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 6: {
                    throw new RuntimeException();
                }
                case 7: {
                    if (var3 != 0) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var16 = new byte[var4];
                    var14 = var16;
                    var12 = var14;
                    var10 = var12;
                    var5_ref_byte__ = var10;
                    var9.a(var16, var4, 128, 0);
                    return var5_ref_byte__;
                }
                case 9: {
                    var5 = var9.f(-128);
                    if (-1 < (var5 ^ -1)) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (0 == kq.field_k) {
                        statePc = 14;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (kq.field_k < var5) {
                        statePc = 13;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 13: {
                    throw new RuntimeException();
                }
                case 14: {
                    var17 = new byte[var5];
                    var15 = var17;
                    var13 = var15;
                    var11 = var13;
                    var6 = var11;
                    if (1 == var3) {
                        statePc = 20;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var7 = (Object) (Object) kca.field_b;
                    // monitorenter kca.field_b
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    try {
                        kca.field_b.a(var9, var17, -10);
                        // monitorexit var7
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var8 = caughtException;
                        // monitorexit var7
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 19: {
                    throw (RuntimeException) (Object) var8;
                }
                case 20: {
                    int discarded$1 = pca.a(var17, var5, param1, var4, 9);
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    return var6;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final boolean a(int param0) {
        if (param0 != -4) {
            Object var3 = null;
            ii discarded$0 = ((td) this).a((op) null, 56);
        }
        hd var2 = (hd) (Object) ur.field_e[((td) this).field_g];
        return -4 == (var2.c(0) ^ -1) ? true : false;
    }

    td(int param0, aga param1, boolean param2) {
        super(4, param0, new nq(param1));
        ((td) this).field_m = param2 ? true : false;
    }

    ii a(op param0, int param1) {
        tg var3 = null;
        int var4_int = 0;
        ii var4 = null;
        int var5 = 0;
        L0: {
          var5 = BachelorFridge.field_y;
          var3 = null;
          var4_int = ((td) this).field_g;
          if (88 != var4_int) {
            if (89 == var4_int) {
              var3 = new tg(((td) this).field_g, ((td) this).field_h.a(param1 ^ 63, param0));
              break L0;
            } else {
              if (90 == var4_int) {
                var3 = (tg) (Object) new sw(((td) this).field_g, ((td) this).field_h.a(8, param0), ((td) this).field_i);
                break L0;
              } else {
                if (91 == var4_int) {
                  var3 = (tg) (Object) new fla(((td) this).field_g, ((td) this).field_h.a(38, param0));
                  break L0;
                } else {
                  if (92 != var4_int) {
                    if (-94 == var4_int) {
                      var3 = (tg) (Object) new io(((td) this).field_g, ((td) this).field_h.a(param1 + 36, param0), ((td) this).field_j);
                      break L0;
                    } else {
                      if (-95 == var4_int) {
                        var3 = (tg) (Object) new ifa(((td) this).field_g, ((td) this).field_h.a(62, param0));
                        break L0;
                      } else {
                        if ((var4_int ^ -1) == -96) {
                          var3 = (tg) (Object) new s(((td) this).field_g, ((td) this).field_h.a(param1 ^ 50, param0));
                          break L0;
                        } else {
                          if (var4_int != 96) {
                            if (var4_int == 97) {
                              var3 = (tg) (Object) new h(((td) this).field_g, ((td) this).field_h.a(103, param0));
                              break L0;
                            } else {
                              if (var4_int == 98) {
                                var3 = (tg) (Object) new tha(((td) this).field_g, ((td) this).field_h.a(20, param0));
                                break L0;
                              } else {
                                if (var4_int == 99) {
                                  var3 = (tg) (Object) new of(((td) this).field_g, ((td) this).field_h.a(40, param0));
                                  break L0;
                                } else {
                                  if (var4_int == 100) {
                                    var3 = (tg) (Object) new eha(((td) this).field_g, ((td) this).field_h.a(85, param0), ((td) this).field_k, ((td) this).field_n);
                                    break L0;
                                  } else {
                                    if (var4_int == 101) {
                                      var3 = (tg) (Object) new nh(((td) this).field_g, ((td) this).field_h.a(27, param0));
                                      break L0;
                                    } else {
                                      if (var4_int != 102) {
                                        if (var4_int != 103) {
                                          if (var4_int != -105) {
                                            if (-106 == var4_int) {
                                              var3 = (tg) (Object) new ui(((td) this).field_g, ((td) this).field_h.a(param1 + 65, param0));
                                              break L0;
                                            } else {
                                              if (-107 != var4_int) {
                                                if (107 == var4_int) {
                                                  var3 = (tg) (Object) new vfa(((td) this).field_g, ((td) this).field_h.a(21, param0), ((td) this).field_k, ((td) this).field_n);
                                                  break L0;
                                                } else {
                                                  if (-109 != var4_int) {
                                                    if (109 == var4_int) {
                                                      var3 = (tg) (Object) new eb(((td) this).field_g, ((td) this).field_h.a(112, param0), ((td) this).field_k, ((td) this).field_n);
                                                      break L0;
                                                    } else {
                                                      if (-111 == var4_int) {
                                                        var3 = (tg) (Object) new mp(((td) this).field_g, ((td) this).field_h.a(53, param0));
                                                        break L0;
                                                      } else {
                                                        if (-112 != var4_int) {
                                                          if ((var4_int ^ -1) != -113) {
                                                            if (var4_int != 113) {
                                                              if (var4_int != -115) {
                                                                if (-116 == var4_int) {
                                                                  var3 = (tg) (Object) new ab(((td) this).field_g, ((td) this).field_h.a(112, param0), ((td) this).field_j);
                                                                  break L0;
                                                                } else {
                                                                  if (116 != var4_int) {
                                                                    if ((var4_int ^ -1) != -118) {
                                                                      if (var4_int != -119) {
                                                                        if (-120 != var4_int) {
                                                                          if (var4_int != 120) {
                                                                            if (var4_int == -122) {
                                                                              var3 = (tg) (Object) new gh(((td) this).field_g, ((td) this).field_h.a(51, param0));
                                                                              break L0;
                                                                            } else {
                                                                              if (122 != var4_int) {
                                                                                if (-124 == var4_int) {
                                                                                  var3 = (tg) (Object) new hj(((td) this).field_g, ((td) this).field_h.a(param1 + 25, param0));
                                                                                  break L0;
                                                                                } else {
                                                                                  if (124 != var4_int) {
                                                                                    if (var4_int != 125) {
                                                                                      if ((var4_int ^ -1) != -127) {
                                                                                        if (var4_int == -128) {
                                                                                          var3 = (tg) (Object) new ch(((td) this).field_g, ((td) this).field_h.a(param1 ^ 127, param0));
                                                                                          break L0;
                                                                                        } else {
                                                                                          if (-129 == var4_int) {
                                                                                            var3 = (tg) (Object) new ja(((td) this).field_g, ((td) this).field_h.a(param1 + 60, param0));
                                                                                            break L0;
                                                                                          } else {
                                                                                            if (var4_int != -130) {
                                                                                              if (-131 == var4_int) {
                                                                                                var3 = (tg) (Object) new uba(((td) this).field_g, ((td) this).field_h.a(107, param0), ((td) this).field_k, ((td) this).field_n);
                                                                                                break L0;
                                                                                              } else {
                                                                                                if (var4_int == 131) {
                                                                                                  var3 = (tg) (Object) new kea(((td) this).field_g, ((td) this).field_h.a(param1 ^ 123, param0), ((td) this).field_k, ((td) this).field_n);
                                                                                                  break L0;
                                                                                                } else {
                                                                                                  if (-133 != var4_int) {
                                                                                                    if (133 != var4_int) {
                                                                                                      if (-135 == var4_int) {
                                                                                                        var3 = (tg) (Object) new wh(((td) this).field_g, ((td) this).field_h.a(58, param0));
                                                                                                        break L0;
                                                                                                      } else {
                                                                                                        if (135 != var4_int) {
                                                                                                          if ((var4_int ^ -1) == -137) {
                                                                                                            var3 = (tg) (Object) new vka(((td) this).field_g, ((td) this).field_h.a(109, param0), ((td) this).field_k, ((td) this).field_n);
                                                                                                            break L0;
                                                                                                          } else {
                                                                                                            if (var4_int == 137) {
                                                                                                              var3 = (tg) (Object) new qga(((td) this).field_g, ((td) this).field_h.a(52, param0), ((td) this).field_j);
                                                                                                              break L0;
                                                                                                            } else {
                                                                                                              throw new IllegalArgumentException("Special not found");
                                                                                                            }
                                                                                                          }
                                                                                                        } else {
                                                                                                          var3 = (tg) (Object) new bla(((td) this).field_g, ((td) this).field_h.a(96, param0), ((td) this).field_j);
                                                                                                          break L0;
                                                                                                        }
                                                                                                      }
                                                                                                    } else {
                                                                                                      var3 = (tg) (Object) new fc(((td) this).field_g, ((td) this).field_h.a(17, param0), ((td) this).field_k, ((td) this).field_n);
                                                                                                      break L0;
                                                                                                    }
                                                                                                  } else {
                                                                                                    var3 = (tg) (Object) new ci(((td) this).field_g, ((td) this).field_h.a(param1 ^ 78, param0), ((td) this).field_k, ((td) this).field_n);
                                                                                                    break L0;
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            } else {
                                                                                              var3 = (tg) (Object) new no(((td) this).field_g, ((td) this).field_h.a(94, param0));
                                                                                              break L0;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        var3 = (tg) (Object) new wc(((td) this).field_g, ((td) this).field_h.a(24, param0), ((td) this).field_k, ((td) this).field_n);
                                                                                        break L0;
                                                                                      }
                                                                                    } else {
                                                                                      var3 = (tg) (Object) new rl(((td) this).field_g, ((td) this).field_h.a(param1 + 83, param0), ((td) this).field_k, ((td) this).field_n);
                                                                                      break L0;
                                                                                    }
                                                                                  } else {
                                                                                    var3 = (tg) (Object) new ija(((td) this).field_g, ((td) this).field_h.a(116, param0), ((td) this).field_j);
                                                                                    break L0;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                var3 = (tg) (Object) new ud(((td) this).field_g, ((td) this).field_h.a(37, param0), ((td) this).field_k, ((td) this).field_n);
                                                                                break L0;
                                                                              }
                                                                            }
                                                                          } else {
                                                                            var3 = (tg) (Object) new mt(((td) this).field_g, ((td) this).field_h.a(113, param0));
                                                                            break L0;
                                                                          }
                                                                        } else {
                                                                          break L0;
                                                                        }
                                                                      } else {
                                                                        var3 = (tg) (Object) new mja(((td) this).field_g, ((td) this).field_h.a(32, param0), ((td) this).field_i);
                                                                        break L0;
                                                                      }
                                                                    } else {
                                                                      var3 = (tg) (Object) new hea(((td) this).field_g, ((td) this).field_h.a(107, param0), ((td) this).field_i);
                                                                      break L0;
                                                                    }
                                                                  } else {
                                                                    var3 = (tg) (Object) new fq(((td) this).field_g, ((td) this).field_h.a(param1 + 44, param0), ((td) this).field_k, ((td) this).field_n);
                                                                    break L0;
                                                                  }
                                                                }
                                                              } else {
                                                                var3 = (tg) (Object) new efa(((td) this).field_g, ((td) this).field_h.a(81, param0), ((td) this).field_k, ((td) this).field_n);
                                                                break L0;
                                                              }
                                                            } else {
                                                              var3 = (tg) (Object) new kl(((td) this).field_g, ((td) this).field_h.a(19, param0), ((td) this).field_k, ((td) this).field_n);
                                                              break L0;
                                                            }
                                                          } else {
                                                            var3 = (tg) (Object) new nw(((td) this).field_g, ((td) this).field_h.a(13, param0), ((td) this).field_k, ((td) this).field_n);
                                                            break L0;
                                                          }
                                                        } else {
                                                          var3 = (tg) (Object) new sg(((td) this).field_g, ((td) this).field_h.a(25, param0));
                                                          break L0;
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    var3 = (tg) (Object) new ts(((td) this).field_g, ((td) this).field_h.a(87, param0), ((td) this).field_j);
                                                    break L0;
                                                  }
                                                }
                                              } else {
                                                var3 = (tg) (Object) new dr(((td) this).field_g, ((td) this).field_h.a(113, param0));
                                                break L0;
                                              }
                                            }
                                          } else {
                                            var3 = (tg) (Object) new eg(((td) this).field_g, ((td) this).field_h.a(param1 ^ 105, param0), ((td) this).field_j);
                                            break L0;
                                          }
                                        } else {
                                          var3 = (tg) (Object) new ww(((td) this).field_g, ((td) this).field_h.a(param1 + 53, param0));
                                          break L0;
                                        }
                                      } else {
                                        var3 = (tg) (Object) new fb(((td) this).field_g, ((td) this).field_h.a(126, param0));
                                        break L0;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            var3 = (tg) (Object) new dk(((td) this).field_g, ((td) this).field_h.a(109, param0), ((td) this).field_k, ((td) this).field_n);
                            break L0;
                          }
                        }
                      }
                    }
                  } else {
                    var3 = (tg) (Object) new ql(((td) this).field_g, ((td) this).field_h.a(30, param0), ((td) this).field_k, ((td) this).field_n);
                    break L0;
                  }
                }
              }
            }
          } else {
            var3 = (tg) (Object) new rd(((td) this).field_g, ((td) this).field_h.a(104, param0), ((td) this).field_k, ((td) this).field_n);
            break L0;
          }
        }
        L1: {
          param0.field_T.field_v[((td) this).field_h.field_g] = param0.field_T.field_v[((td) this).field_h.field_g] + 1;
          param0.field_T.field_r[((td) this).field_h.field_g] = sr.a(param0.field_T.field_r[((td) this).field_h.field_g], 1L << ((td) this).field_g - 88);
          param0.field_T.field_m[((td) this).field_h.field_g][((td) this).field_g + -88] = param0.field_T.field_m[((td) this).field_h.field_g][((td) this).field_g + -88] + 1;
          if (!((td) this).field_m) {
            break L1;
          } else {
            param0.field_T.field_m[((td) this).field_h.field_g][31] = param0.field_T.field_m[((td) this).field_h.field_g][31] + 1;
            break L1;
          }
        }
        var4 = ((td) (Object) var3).a(param0, param1);
        if (var3 != null) {
          return var4;
        } else {
          throw new IllegalArgumentException("Special not found");
        }
    }

    static {
    }
}
