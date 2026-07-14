/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd extends cj {
    private ia field_U;
    static int field_S;
    private int field_N;
    static gn field_Q;
    static int[] field_R;
    private hj field_T;
    static int[] field_V;
    private String field_P;
    static int field_W;

    final boolean a(n param0, int param1) {
        if (param1 != -25823) {
            field_V = null;
            return false;
        }
        return false;
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = HoldTheLine.field_D;
        oc.field_c = null;
        lc.field_g = 0;
        tl.field_y = null;
        if (param1 == 8077) {
          var2 = lg.field_e;
          lg.field_e = fh.field_g;
          fh.field_g = var2;
          if (param0 == -52) {
            L0: {
              ce.field_n.field_f = 2;
              ce.field_n.field_c = ce.field_n.field_c + 1;
              if (-3 < ce.field_n.field_c) {
                break L0;
              } else {
                if (51 != param0) {
                  break L0;
                } else {
                  return 2;
                }
              }
            }
            if (-3 > ce.field_n.field_c) {
              if (4 > ce.field_n.field_c) {
                return -1;
              } else {
                return 1;
              }
            } else {
              if ((param0 ^ -1) == -51) {
                return 5;
              } else {
                if (4 > ce.field_n.field_c) {
                  return -1;
                } else {
                  return 1;
                }
              }
            }
          } else {
            if (-51 != param0) {
              L1: {
                ce.field_n.field_f = 1;
                ce.field_n.field_c = ce.field_n.field_c + 1;
                if (-3 < ce.field_n.field_c) {
                  break L1;
                } else {
                  if (51 != param0) {
                    break L1;
                  } else {
                    return 2;
                  }
                }
              }
              if (-3 > ce.field_n.field_c) {
                if (4 > ce.field_n.field_c) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                if ((param0 ^ -1) == -51) {
                  return 5;
                } else {
                  if (4 > ce.field_n.field_c) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            } else {
              L2: {
                ce.field_n.field_f = 5;
                ce.field_n.field_c = ce.field_n.field_c + 1;
                if (-3 < ce.field_n.field_c) {
                  break L2;
                } else {
                  if (51 != param0) {
                    break L2;
                  } else {
                    return 2;
                  }
                }
              }
              if (-3 > ce.field_n.field_c) {
                if (4 > ce.field_n.field_c) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                if ((param0 ^ -1) == -51) {
                  return 5;
                } else {
                  if (4 > ce.field_n.field_c) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            }
          }
        } else {
          field_Q = null;
          var2 = lg.field_e;
          lg.field_e = fh.field_g;
          fh.field_g = var2;
          if (param0 == -52) {
            ce.field_n.field_f = 2;
            ce.field_n.field_c = ce.field_n.field_c + 1;
            if (-3 >= ce.field_n.field_c) {
              if (51 != param0) {
                L3: {
                  if (-3 < (ce.field_n.field_c ^ -1)) {
                    break L3;
                  } else {
                    if ((param0 ^ -1) == -51) {
                      return 5;
                    } else {
                      break L3;
                    }
                  }
                }
                if (4 > ce.field_n.field_c) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                return 2;
              }
            } else {
              L4: {
                if (-3 > ce.field_n.field_c) {
                  break L4;
                } else {
                  if ((param0 ^ -1) == -51) {
                    return 5;
                  } else {
                    break L4;
                  }
                }
              }
              if (4 <= ce.field_n.field_c) {
                return 1;
              } else {
                return -1;
              }
            }
          } else {
            if (-51 != param0) {
              ce.field_n.field_f = 1;
              ce.field_n.field_c = ce.field_n.field_c + 1;
              if (-3 >= ce.field_n.field_c) {
                if (51 != param0) {
                  L5: {
                    if (-3 < (ce.field_n.field_c ^ -1)) {
                      break L5;
                    } else {
                      if ((param0 ^ -1) == -51) {
                        return 5;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (4 <= ce.field_n.field_c) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  return 2;
                }
              } else {
                L6: {
                  if (-3 > ce.field_n.field_c) {
                    break L6;
                  } else {
                    if ((param0 ^ -1) == -51) {
                      return 5;
                    } else {
                      break L6;
                    }
                  }
                }
                if (4 <= ce.field_n.field_c) {
                  return 1;
                } else {
                  return -1;
                }
              }
            } else {
              ce.field_n.field_f = 5;
              ce.field_n.field_c = ce.field_n.field_c + 1;
              if (-3 >= ce.field_n.field_c) {
                if (51 != param0) {
                  L7: {
                    if (-3 < (ce.field_n.field_c ^ -1)) {
                      break L7;
                    } else {
                      if ((param0 ^ -1) == -51) {
                        return 5;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (4 <= ce.field_n.field_c) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  return 2;
                }
              } else {
                L8: {
                  if (-3 > ce.field_n.field_c) {
                    break L8;
                  } else {
                    if ((param0 ^ -1) == -51) {
                      return 5;
                    } else {
                      break L8;
                    }
                  }
                }
                if (4 <= ce.field_n.field_c) {
                  return 1;
                } else {
                  return -1;
                }
              }
            }
          }
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          int discarded$2 = bd.a(77, -61);
          field_V = null;
          field_Q = null;
          field_R = null;
          return;
        } else {
          field_V = null;
          field_Q = null;
          field_R = null;
          return;
        }
    }

    final String f(int param0) {
        if (param0 == 0) {
            return null;
        }
        field_S = -9;
        return null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        String var5 = null;
        fd var6 = null;
        vc var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        hj var15 = null;
        hj var16 = null;
        hj var17 = null;
        hj var18 = null;
        L0: {
          L1: {
            L2: {
              var13 = HoldTheLine.field_D;
              var6 = ((bd) this).field_U.b(-7447);
              if (hh.field_d == var6) {
                break L2;
              } else {
                if (um.field_a == var6) {
                  break L2;
                } else {
                  var5 = ((bd) this).field_U.b((byte) -59);
                  if (var5 == null) {
                    var5 = ((bd) this).field_P;
                    break L1;
                  } else {
                    if (var5.equals((Object) (Object) ((bd) this).field_q)) {
                      break L0;
                    } else {
                      ((bd) this).field_q = var5;
                      ((bd) this).j(0);
                      break L0;
                    }
                  }
                }
              }
            }
            var5 = hg.field_N;
            break L1;
          }
          if (var5.equals((Object) (Object) ((bd) this).field_q)) {
            break L0;
          } else {
            ((bd) this).field_q = var5;
            ((bd) this).j(0);
            break L0;
          }
        }
        super.a(param0, param1, param2, param3);
        var6 = ((bd) this).field_U.b(-7447);
        var8 = (vc) (Object) ((bd) this).field_l;
        var9 = ((bd) this).field_k + param2;
        var10 = var8.a(-1337403295, (n) this, param1) + (var8.a((byte) 20, (n) this).a(-93) >> -1538885919);
        if (hh.field_d == var6) {
          var18 = ef.field_i[0];
          var11 = var18.field_o << 1548729569;
          var12 = var18.field_v << 8149921;
          if (null != ((bd) this).field_T) {
            if (var11 <= ((bd) this).field_T.field_s) {
              if (((bd) this).field_T.field_y < var12) {
                ((bd) this).field_T = new hj(var11, var12);
                hf.a(((bd) this).field_T, -1);
                var18.b(112, 144, var18.field_o << -1276764156, var18.field_v << 984784676, -((bd) this).field_N << 156687434, 4096);
                dm.b((byte) -10);
                ((bd) this).field_T.b(-(var18.field_o >> 1172819553) + var9, -var18.field_v + var10, 256);
                return;
              } else {
                hf.a(((bd) this).field_T, -1);
                tc.c();
                var18.b(112, 144, var18.field_o << -1276764156, var18.field_v << 984784676, -((bd) this).field_N << 156687434, 4096);
                dm.b((byte) -10);
                ((bd) this).field_T.b(-(var18.field_o >> 1172819553) + var9, -var18.field_v + var10, 256);
                return;
              }
            } else {
              ((bd) this).field_T = new hj(var11, var12);
              hf.a(((bd) this).field_T, -1);
              var18.b(112, 144, var18.field_o << -1276764156, var18.field_v << 984784676, -((bd) this).field_N << 156687434, 4096);
              dm.b((byte) -10);
              ((bd) this).field_T.b(-(var18.field_o >> 1172819553) + var9, -var18.field_v + var10, 256);
              return;
            }
          } else {
            ((bd) this).field_T = new hj(var11, var12);
            hf.a(((bd) this).field_T, -1);
            var18.b(112, 144, var18.field_o << -1276764156, var18.field_v << 984784676, -((bd) this).field_N << 156687434, 4096);
            dm.b((byte) -10);
            ((bd) this).field_T.b(-(var18.field_o >> 1172819553) + var9, -var18.field_v + var10, 256);
            return;
          }
        } else {
          if (var6 != um.field_a) {
            if (g.field_k == var6) {
              var15 = ef.field_i[2];
              var15.b(var9, var10 - (var15.field_y >> 1302600929), 256);
              return;
            } else {
              L3: {
                if (tg.field_d != var6) {
                  break L3;
                } else {
                  var16 = ef.field_i[1];
                  var16.b(var9, var10 + -(var16.field_y >> 332629249), 256);
                  break L3;
                }
              }
              return;
            }
          } else {
            var17 = ef.field_i[0];
            var11 = var17.field_o << 1548729569;
            var12 = var17.field_v << 8149921;
            if (null != ((bd) this).field_T) {
              if (var11 <= ((bd) this).field_T.field_s) {
                if (((bd) this).field_T.field_y < var12) {
                  ((bd) this).field_T = new hj(var11, var12);
                  hf.a(((bd) this).field_T, -1);
                  var17.b(112, 144, var17.field_o << -1276764156, var17.field_v << 984784676, -((bd) this).field_N << 156687434, 4096);
                  dm.b((byte) -10);
                  ((bd) this).field_T.b(-(var17.field_o >> 1172819553) + var9, -var17.field_v + var10, 256);
                  return;
                } else {
                  hf.a(((bd) this).field_T, -1);
                  tc.c();
                  var17.b(112, 144, var17.field_o << -1276764156, var17.field_v << 984784676, -((bd) this).field_N << 156687434, 4096);
                  dm.b((byte) -10);
                  ((bd) this).field_T.b(-(var17.field_o >> 1172819553) + var9, -var17.field_v + var10, 256);
                  return;
                }
              } else {
                ((bd) this).field_T = new hj(var11, var12);
                hf.a(((bd) this).field_T, -1);
                var17.b(112, 144, var17.field_o << -1276764156, var17.field_v << 984784676, -((bd) this).field_N << 156687434, 4096);
                dm.b((byte) -10);
                ((bd) this).field_T.b(-(var17.field_o >> 1172819553) + var9, -var17.field_v + var10, 256);
                return;
              }
            } else {
              ((bd) this).field_T = new hj(var11, var12);
              hf.a(((bd) this).field_T, -1);
              var17.b(112, 144, var17.field_o << -1276764156, var17.field_v << 984784676, -((bd) this).field_N << 156687434, 4096);
              dm.b((byte) -10);
              ((bd) this).field_T.b(-(var17.field_o >> 1172819553) + var9, -var17.field_v + var10, 256);
              return;
            }
          }
        }
    }

    bd(ia param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (dh) (Object) cj.k(105));
        ((bd) this).field_P = param1;
        ((bd) this).field_U = param0;
        ((bd) this).a(param2, (byte) 122, param3, param5, param4);
    }

    final static kk a(byte param0, ee param1, el param2, int param3) {
        kk var4 = null;
        var4 = mo.a(param3, 2931, param1, param2);
        if (param0 <= 2) {
          field_W = 35;
          rl.field_J.a((byte) -73, (hl) (Object) var4);
          return var4;
        } else {
          rl.field_J.a((byte) -73, (hl) (Object) var4);
          return var4;
        }
    }

    final static ui a(int param0, int param1, int param2, el param3) {
        if (param0 != 17405) {
          int discarded$2 = bd.a(34, 10);
          return lg.a(db.a(param3, 100, param1, param2), (byte) -68);
        } else {
          return lg.a(db.a(param3, 100, param1, param2), (byte) -68);
        }
    }

    final void a(int param0, n param1, int param2, byte param3) {
        ((bd) this).field_N = ((bd) this).field_N + 1;
        super.a(param0, param1, param2, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_R = new int[4];
        field_S = -20;
        field_V = new int[4];
    }
}
