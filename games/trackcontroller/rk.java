/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk extends wd {
    static int[] field_T;
    static String field_Z;
    private String field_db;
    private dg field_S;
    private boolean field_W;
    static int field_Y;
    static le field_X;
    private String field_cb;
    private boolean field_U;
    static int field_ab;
    static long field_eb;
    static aj field_bb;

    final void a(String param0, byte param1, boolean param2, float param3) {
        int var5 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        if (param2 != ((rk) this).field_W) {
          L0: {
            stackOut_2_0 = this;
            stackIn_4_0 = stackOut_2_0;
            stackIn_3_0 = stackOut_2_0;
            if (!param2) {
              stackOut_4_0 = this;
              stackOut_4_1 = 0;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              break L0;
            } else {
              stackOut_3_0 = this;
              stackOut_3_1 = 1;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              break L0;
            }
          }
          ((rk) this).field_W = stackIn_5_1 != 0;
          if (!((rk) this).field_W) {
            ((rk) this).field_S.a(4210752, 2113632, (byte) -33);
            if (!((rk) this).field_U) {
              var5 = 16 / ((param1 - 14) / 60);
              ((rk) this).field_cb = param0;
              ((rk) this).field_S.field_J = (int)(param3 / 100.0f * 65536.0f);
              return;
            } else {
              ((rk) this).field_S.field_C = false;
              var5 = 16 / ((param1 - 14) / 60);
              ((rk) this).field_cb = param0;
              ((rk) this).field_S.field_J = (int)(param3 / 100.0f * 65536.0f);
              return;
            }
          } else {
            ((rk) this).field_S.a(4210752, 8405024, (byte) -33);
            ((rk) this).field_S.field_C = true;
            var5 = 16 / ((param1 - 14) / 60);
            ((rk) this).field_cb = param0;
            ((rk) this).field_S.field_J = (int)(param3 / 100.0f * 65536.0f);
            return;
          }
        } else {
          var5 = 16 / ((param1 - 14) / 60);
          ((rk) this).field_cb = param0;
          ((rk) this).field_S.field_J = (int)(param3 / 100.0f * 65536.0f);
          return;
        }
    }

    final static void r(int param0) {
        ra[] var2 = null;
        int var3 = 0;
        ra var4 = null;
        int var5 = 0;
        ea var6 = null;
        ea var7 = null;
        ea var8 = null;
        var5 = TrackController.field_F ? 1 : 0;
        var6 = new ea(-1, "*gn0810a10110b101101908101101101b011090ho0p80980e80110160710a10110920890202q0r607607d01101101a0d10980620220202208990090090090008d0190h50i2022020270p280000000010002809202g0970620202804680000000010002g06q06207908602027059800000000100022086g02g070510f0280l680000000010002704101301902j020270598000000001000D10k9g02g020220202804680000000010008104v09701602202022079800000000100028062028019022020q40928000000001000270140560860gf020220769009009009000280150490710620202701101101101o01106g097067011092020280110110a101r01a01607i08101106h0f07d0110110c101101d0110110r101101d06000000000000000000000000000000000000000000000000mainMenu 0/0");
        ra dupTemp$6 = new ra(var6, 21, 48);
        he.field_f[1] = dupTemp$6;
        he.field_f[0] = dupTemp$6;
        var7 = new ea(-1, vl.field_E);
        ra dupTemp$7 = new ra(var7, 16, 48);
        he.field_f[param0] = dupTemp$7;
        he.field_f[12] = dupTemp$7;
        var8 = new ea(-1, "*gn08o01o01101101101101o01101101a011090qt0oe80000000000000200000080g0b90202q03p80000000000000200000080h0me020qs0rf80000000000000200000080207l0p02g0b6800000000000002000000807016020220h98000000000000020000008080980f0gl0nf80000000000000200000080207e020gk0mf80000000000000200000080208f020he0228000000000000020000008070670e0220228000000000000020000008080980p02g0c68000000000000020000008070tu060q501O8000000000000020000008080sv0907r01101101101101101r01101101r06706000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000pauseMenu 0/0");
        ra dupTemp$8 = new ra(var8, 21, 48);
        he.field_f[11] = dupTemp$8;
        he.field_f[10] = dupTemp$8;
        var2 = he.field_f;
        var3 = 0;
        L0: while (true) {
          if (var2.length <= var3) {
            return;
          } else {
            var4 = var2[var3];
            if (var4 != null) {
              var4.c((byte) 93);
              var3++;
              continue L0;
            } else {
              var3++;
              var3++;
              continue L0;
            }
          }
        }
    }

    final static boolean a(int param0, byte param1, int param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_21_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_59_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        if (param3) {
          if (g.field_u[param2] > g.field_u[param0]) {
            return true;
          } else {
            if (g.field_u[param0] > g.field_u[param2]) {
              return false;
            } else {
              if (va.field_e[param2] <= va.field_e[param0]) {
                if (va.field_e[param0] <= va.field_e[param2]) {
                  if (param1 > 60) {
                    var4 = qi.field_b[param0] + (ii.field_q[param0] + qf.field_a[param0]);
                    var5 = qi.field_b[param2] + (qf.field_a[param2] + ii.field_q[param2]);
                    if (var4 >= var5) {
                      if (var4 > var5) {
                        return false;
                      } else {
                        L0: {
                          if (param2 <= param0) {
                            stackOut_58_0 = 0;
                            stackIn_59_0 = stackOut_58_0;
                            break L0;
                          } else {
                            stackOut_57_0 = 1;
                            stackIn_59_0 = stackOut_57_0;
                            break L0;
                          }
                        }
                        return stackIn_59_0 != 0;
                      }
                    } else {
                      return true;
                    }
                  } else {
                    int discarded$2 = rk.s(-40);
                    var4 = qi.field_b[param0] + (ii.field_q[param0] + qf.field_a[param0]);
                    var5 = qi.field_b[param2] + (qf.field_a[param2] + ii.field_q[param2]);
                    if (var4 >= var5) {
                      if (var4 > var5) {
                        return false;
                      } else {
                        L1: {
                          if (param2 <= param0) {
                            stackOut_49_0 = 0;
                            stackIn_50_0 = stackOut_49_0;
                            break L1;
                          } else {
                            stackOut_48_0 = 1;
                            stackIn_50_0 = stackOut_48_0;
                            break L1;
                          }
                        }
                        return stackIn_50_0 != 0;
                      }
                    } else {
                      return true;
                    }
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          }
        } else {
          if (va.field_e[param0] >= va.field_e[param2]) {
            if (va.field_e[param2] < va.field_e[param0]) {
              return false;
            } else {
              if (g.field_u[param0] < g.field_u[param2]) {
                return true;
              } else {
                if (g.field_u[param2] >= g.field_u[param0]) {
                  if (param1 <= 60) {
                    int discarded$3 = rk.s(-40);
                    var4 = qi.field_b[param0] + (ii.field_q[param0] + qf.field_a[param0]);
                    var5 = qi.field_b[param2] + (qf.field_a[param2] + ii.field_q[param2]);
                    if (var4 >= var5) {
                      if (var4 > var5) {
                        return false;
                      } else {
                        if (param2 <= param0) {
                          return false;
                        } else {
                          return true;
                        }
                      }
                    } else {
                      return true;
                    }
                  } else {
                    var4 = qi.field_b[param0] + (ii.field_q[param0] + qf.field_a[param0]);
                    var5 = qi.field_b[param2] + (qf.field_a[param2] + ii.field_q[param2]);
                    if (var4 >= var5) {
                      if (var4 > var5) {
                        return false;
                      } else {
                        L2: {
                          if (param2 <= param0) {
                            stackOut_20_0 = 0;
                            stackIn_21_0 = stackOut_20_0;
                            break L2;
                          } else {
                            stackOut_19_0 = 1;
                            stackIn_21_0 = stackOut_19_0;
                            break L2;
                          }
                        }
                        return stackIn_21_0 != 0;
                      }
                    } else {
                      return true;
                    }
                  }
                } else {
                  return false;
                }
              }
            }
          } else {
            return true;
          }
        }
    }

    public static void t(int param0) {
        if (param0 != 4210752) {
            return;
        }
        field_bb = null;
        field_Z = null;
        field_T = null;
        field_X = null;
    }

    rk(vl param0, String param1) {
        super(param0, 300, 120);
        int var3 = 0;
        ((rk) this).field_db = param1;
        if (((rk) this).field_db != null) {
            var3 = p.field_a.a(((rk) this).field_db, 260, p.field_a.field_G);
            ((rk) this).a(300, (byte) -115, var3 + 150);
        }
        ((rk) this).field_S = new dg(13, 50, 274, 30, 15, 2113632, 4210752);
        ((rk) this).field_S.field_C = true;
        ((rk) this).field_U = false;
        ((rk) this).field_W = false;
        ((rk) this).a(false, (al) (Object) ((rk) this).field_S);
    }

    final void b(int param0, int param1, int param2) {
        super.b(param0, param1, param2);
        p.field_a.b(((rk) this).field_cb, (((rk) this).field_x >> 751656065) + param0, 103 + param2, 16777215, -1);
        if (!(null == ((rk) this).field_db)) {
            ll.a(param0 + 20, 120 + (param2 + -7), 260, 8421504);
            int discarded$0 = p.field_a.a(((rk) this).field_db, 20 + param0, 120 + (param2 - -8), 260, 100, 16777215, -1, 1, 0, p.field_a.field_G);
        }
    }

    final static int s(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = TrackController.field_F ? 1 : 0;
        var1 = 0;
        var2 = 0;
        L0: while (true) {
          if (!mh.e(param0 + 128)) {
            L1: {
              vi.field_f.a(-123, mg.b(fg.field_a, param0 ^ param0, kf.field_b), mg.b(wg.field_e, 0, db.field_X));
              if (vi.field_f.d(0)) {
                var1 = 1;
                break L1;
              } else {
                break L1;
              }
            }
            var3 = 0;
            if (var1 != 0) {
              if ((vi.field_f.field_e ^ -1) <= -1) {
                var3 = ac.field_c[vi.field_f.field_e];
                if ((var3 ^ -1) == -3) {
                  L2: {
                    vh.h(-2532);
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if ((di.field_h ^ -1) == -3) {
                        var4 = qg.a(false) + -fe.field_N;
                        var6 = (int)((10999L - var4) / 1000L);
                        if (var6 <= 0) {
                          var3 = 2;
                          ij.a((byte) 70, 5, true);
                          break L2;
                        } else {
                          return var3;
                        }
                      } else {
                        return var3;
                      }
                    }
                  }
                  return var3;
                } else {
                  if ((var3 ^ -1) == -6) {
                    L3: {
                      vh.h(-2532);
                      if (var3 != 0) {
                        break L3;
                      } else {
                        if ((di.field_h ^ -1) == -3) {
                          var4 = qg.a(false) + -fe.field_N;
                          var6 = (int)((10999L - var4) / 1000L);
                          if (var6 <= 0) {
                            var3 = 2;
                            ij.a((byte) 70, 5, true);
                            break L3;
                          } else {
                            return var3;
                          }
                        } else {
                          return var3;
                        }
                      }
                    }
                    return var3;
                  } else {
                    if (var3 == 0) {
                      if ((di.field_h ^ -1) == -3) {
                        var4 = qg.a(false) + -fe.field_N;
                        var6 = (int)((10999L - var4) / 1000L);
                        if (var6 > 0) {
                          return var3;
                        } else {
                          var3 = 2;
                          ij.a((byte) 70, 5, true);
                          return var3;
                        }
                      } else {
                        return var3;
                      }
                    } else {
                      return var3;
                    }
                  }
                }
              } else {
                if (var2 != 0) {
                  if (2 != di.field_h) {
                    vh.h(-2532);
                    if (var3 == 0) {
                      if ((di.field_h ^ -1) == -3) {
                        var4 = qg.a(false) + -fe.field_N;
                        var6 = (int)((10999L - var4) / 1000L);
                        if (var6 <= 0) {
                          var3 = 2;
                          ij.a((byte) 70, 5, true);
                          return var3;
                        } else {
                          return var3;
                        }
                      } else {
                        return var3;
                      }
                    } else {
                      return var3;
                    }
                  } else {
                    if (var3 == 0) {
                      if ((di.field_h ^ -1) == -3) {
                        var4 = qg.a(false) + -fe.field_N;
                        var6 = (int)((10999L - var4) / 1000L);
                        if (var6 <= 0) {
                          var3 = 2;
                          ij.a((byte) 70, 5, true);
                          return var3;
                        } else {
                          return var3;
                        }
                      } else {
                        return var3;
                      }
                    } else {
                      return var3;
                    }
                  }
                } else {
                  if (var3 == 0) {
                    if ((di.field_h ^ -1) == -3) {
                      var4 = qg.a(false) + -fe.field_N;
                      var6 = (int)((10999L - var4) / 1000L);
                      if (var6 > 0) {
                        return var3;
                      } else {
                        var3 = 2;
                        ij.a((byte) 70, 5, true);
                        return var3;
                      }
                    } else {
                      return var3;
                    }
                  } else {
                    return var3;
                  }
                }
              }
            } else {
              if (var2 != 0) {
                if (2 != di.field_h) {
                  vh.h(-2532);
                  if (var3 == 0) {
                    if ((di.field_h ^ -1) == -3) {
                      var4 = qg.a(false) + -fe.field_N;
                      var6 = (int)((10999L - var4) / 1000L);
                      if (var6 > 0) {
                        return var3;
                      } else {
                        var3 = 2;
                        ij.a((byte) 70, 5, true);
                        return var3;
                      }
                    } else {
                      return var3;
                    }
                  } else {
                    return var3;
                  }
                } else {
                  if (var3 == 0) {
                    if ((di.field_h ^ -1) == -3) {
                      var4 = qg.a(false) + -fe.field_N;
                      var6 = (int)((10999L - var4) / 1000L);
                      if (var6 > 0) {
                        return var3;
                      } else {
                        var3 = 2;
                        ij.a((byte) 70, 5, true);
                        return var3;
                      }
                    } else {
                      return var3;
                    }
                  } else {
                    return var3;
                  }
                }
              } else {
                if (var3 == 0) {
                  if ((di.field_h ^ -1) == -3) {
                    var4 = qg.a(false) + -fe.field_N;
                    var6 = (int)((10999L - var4) / 1000L);
                    if (var6 > 0) {
                      return var3;
                    } else {
                      var3 = 2;
                      ij.a((byte) 70, 5, true);
                      return var3;
                    }
                  } else {
                    return var3;
                  }
                } else {
                  return var3;
                }
              }
            }
          } else {
            L4: {
              vi.field_f.b((byte) -84);
              if (!vi.field_f.d(0)) {
                break L4;
              } else {
                var1 = 1;
                break L4;
              }
            }
            if (-14 != (kg.field_d ^ -1)) {
              continue L0;
            } else {
              var2 = 1;
              continue L0;
            }
          }
        }
    }

    final void e(byte param0) {
        ((rk) this).field_U = true;
        ((rk) this).field_S.field_C = false;
        if (param0 <= 21) {
            ((rk) this).b(12, 86, 30);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Y = 50;
        field_Z = "Logging in...";
        field_bb = null;
    }
}
