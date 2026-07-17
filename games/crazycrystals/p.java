/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class p extends uc {
    static nd field_i;
    static dl field_f;
    private int field_g;
    private jh field_e;
    static dl field_k;
    static String field_h;
    static int field_j;

    public static void b(int param0) {
        field_k = null;
        field_i = null;
        field_f = null;
        field_h = null;
        if (param0 != -1) {
            p.b(105);
        }
    }

    final void a(boolean param0) {
        if (!param0) {
            return;
        }
        ((p) this).field_e.a(157, gj.field_n, 26, (byte) 76, 325);
        boolean discarded$0 = this.c((byte) 69);
    }

    private final void a(int param0, int param1, int param2, boolean param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        uj stackIn_18_0 = null;
        uj stackIn_19_0 = null;
        uj stackIn_20_0 = null;
        String stackIn_20_1 = null;
        uj stackOut_17_0 = null;
        uj stackOut_19_0 = null;
        String stackOut_19_1 = null;
        uj stackOut_18_0 = null;
        String stackOut_18_1 = null;
        var14 = CrazyCrystals.field_B;
        var5 = 12640511;
        var6 = 157;
        var7 = 168;
        if (param0 == -17) {
          L0: {
            var8 = 26;
            il.a(var8, false, param1, var6, var7, false);
            var9 = 0;
            if (param2 != 0) {
              if (1 != param2) {
                if (param2 != 2) {
                  if (param2 == 3) {
                    gj.field_m.b(cc.field_b, ((p) this).field_g, param1 - -17, var9, -1);
                    ak.a((byte) 61, ((p) this).field_g, param1, qd.field_r, var5);
                    break L0;
                  } else {
                    if (qh.field_k != param2) {
                      if (param2 == rk.field_g) {
                        L1: {
                          var10 = gj.field_m.a(q.field_d);
                          var11 = gj.field_m.a(fk.field_t);
                          var12 = gj.field_m.a(vk.field_D);
                          if (var12 <= var11) {
                            break L1;
                          } else {
                            var11 = var12;
                            break L1;
                          }
                        }
                        L2: {
                          var13 = 240 + (var10 + -var11) / 2;
                          gj.field_m.b(q.field_d, var13, 17 + param1, var9, -1);
                          stackOut_17_0 = gj.field_m;
                          stackIn_19_0 = stackOut_17_0;
                          stackIn_18_0 = stackOut_17_0;
                          if (jm.field_j) {
                            stackOut_19_0 = (uj) (Object) stackIn_19_0;
                            stackOut_19_1 = fk.field_t;
                            stackIn_20_0 = stackOut_19_0;
                            stackIn_20_1 = stackOut_19_1;
                            break L2;
                          } else {
                            stackOut_18_0 = (uj) (Object) stackIn_18_0;
                            stackOut_18_1 = vk.field_D;
                            stackIn_20_0 = stackOut_18_0;
                            stackIn_20_1 = stackOut_18_1;
                            break L2;
                          }
                        }
                        ((uj) (Object) stackIn_20_0).a(stackIn_20_1, var13, param1 + 17, var9, -1);
                        break L0;
                      } else {
                        if (sj.field_c == param2) {
                          gj.field_m.c(nd.field_k, 240, 17 + param1, var9, -1);
                          break L0;
                        } else {
                          break L0;
                        }
                      }
                    } else {
                      gj.field_m.c(vl.field_e, 240, param1 - -17, var9, -1);
                      break L0;
                    }
                  }
                } else {
                  gj.field_m.b(fa.field_m, ((p) this).field_g, param1 - -17, var9, -1);
                  ak.a((byte) 61, ((p) this).field_g, param1, gi.field_m, var5);
                  break L0;
                }
              } else {
                gj.field_m.c(jd.field_J, 240, 17 + param1, var9, -1);
                break L0;
              }
            } else {
              gj.field_m.c(nc.field_k, 240, 17 + param1, var9, -1);
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final boolean c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_70_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_68_0 = 0;
        L0: {
          var3 = CrazyCrystals.field_B;
          if (((p) this).field_e.field_c != 0) {
            break L0;
          } else {
            if (!((p) this).field_e.a(true)) {
              break L0;
            } else {
              uh.field_p = null;
              return true;
            }
          }
        }
        L1: {
          if (((p) this).field_e.field_c != 1) {
            break L1;
          } else {
            if (!((p) this).field_e.a(true)) {
              break L1;
            } else {
              hc.a(true, false);
              uh.field_p = null;
              return true;
            }
          }
        }
        L2: {
          if (((p) this).field_e.field_c != 2) {
            break L2;
          } else {
            L3: {
              if (!((p) this).field_e.d(96)) {
                break L3;
              } else {
                if (gi.field_m <= 0) {
                  break L3;
                } else {
                  L4: {
                    gi.field_m = gi.field_m - 8;
                    if (gi.field_m < 0) {
                      gi.field_m = 0;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  tb.field_d.a(fk.field_x[0], 100, 96 * gi.field_m, 8192);
                  break L3;
                }
              }
            }
            L5: {
              if (!((p) this).field_e.b(125)) {
                break L5;
              } else {
                if (gi.field_m < 64) {
                  L6: {
                    gi.field_m = gi.field_m + 8;
                    if (64 >= gi.field_m) {
                      break L6;
                    } else {
                      gi.field_m = 64;
                      break L6;
                    }
                  }
                  tb.field_d.a(fk.field_x[0], 100, gi.field_m * 96, 8192);
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if (!((p) this).field_e.b(true)) {
                break L7;
              } else {
                if (gi.field_m > 0) {
                  gi.field_m = 0;
                  tb.field_d.a(fk.field_x[0], 100, 96 * gi.field_m, 8192);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            L8: {
              if (!((p) this).field_e.e(-19741)) {
                break L8;
              } else {
                if (gi.field_m >= 64) {
                  break L8;
                } else {
                  gi.field_m = 64;
                  tb.field_d.a(fk.field_x[0], 100, 96 * gi.field_m, 8192);
                  break L8;
                }
              }
            }
            if (((p) this).field_e.g(-1)) {
              L9: {
                var2 = -6 + -((p) this).field_g + qh.field_i;
                if (var2 >= 0) {
                  if (var2 > 64) {
                    var2 = 64;
                    break L9;
                  } else {
                    break L9;
                  }
                } else {
                  var2 = 0;
                  break L9;
                }
              }
              L10: {
                if (((p) this).field_e.a(true)) {
                  break L10;
                } else {
                  if (~var2 == ~gi.field_m) {
                    break L2;
                  } else {
                    break L10;
                  }
                }
              }
              gi.field_m = var2;
              tb.field_d.a(fk.field_x[0], 100, 96 * gi.field_m, 8192);
              break L2;
            } else {
              if (!((p) this).field_e.a(true)) {
                break L2;
              } else {
                tb.field_d.a(fk.field_x[0], 100, 96 * gi.field_m, 8192);
                break L2;
              }
            }
          }
        }
        L11: {
          if (3 == ((p) this).field_e.field_c) {
            L12: {
              if (!((p) this).field_e.d(96)) {
                break L12;
              } else {
                if (qd.field_r > 0) {
                  ia.a(-658435066, -8 + qd.field_r);
                  break L12;
                } else {
                  break L12;
                }
              }
            }
            L13: {
              if (!((p) this).field_e.b(107)) {
                break L13;
              } else {
                if (qd.field_r < 64) {
                  ia.a(-658435066, 8 + qd.field_r);
                  break L13;
                } else {
                  break L13;
                }
              }
            }
            L14: {
              if (!((p) this).field_e.b(true)) {
                break L14;
              } else {
                if (0 < qd.field_r) {
                  ia.a(-658435066, 0);
                  break L14;
                } else {
                  break L14;
                }
              }
            }
            L15: {
              if (!((p) this).field_e.e(-19741)) {
                break L15;
              } else {
                if (qd.field_r >= 64) {
                  break L15;
                } else {
                  ia.a(-658435066, 64);
                  break L15;
                }
              }
            }
            if (!((p) this).field_e.g(-1)) {
              break L11;
            } else {
              L16: {
                var2 = qh.field_i + (-6 + -((p) this).field_g);
                if (var2 >= 0) {
                  if (var2 <= 64) {
                    break L16;
                  } else {
                    var2 = 64;
                    break L16;
                  }
                } else {
                  var2 = 0;
                  break L16;
                }
              }
              if (qd.field_r == var2) {
                break L11;
              } else {
                ia.a(-658435066, var2);
                break L11;
              }
            }
          } else {
            break L11;
          }
        }
        L17: {
          if (qh.field_k != ((p) this).field_e.field_c) {
            break L17;
          } else {
            if (!((p) this).field_e.a(true)) {
              break L17;
            } else {
              qc.a(((p) this).field_e.field_i, 0);
              ((p) this).field_e.a(-1, true, -1);
              return true;
            }
          }
        }
        L18: {
          if (~rk.field_g != ~((p) this).field_e.field_c) {
            break L18;
          } else {
            if (!((p) this).field_e.a(true)) {
              break L18;
            } else {
              L19: {
                if (jm.field_j) {
                  stackOut_69_0 = 0;
                  stackIn_70_0 = stackOut_69_0;
                  break L19;
                } else {
                  stackOut_68_0 = 1;
                  stackIn_70_0 = stackOut_68_0;
                  break L19;
                }
              }
              jm.field_j = stackIn_70_0 != 0;
              break L18;
            }
          }
        }
        if (sj.field_c != ((p) this).field_e.field_c) {
          return false;
        } else {
          if (((p) this).field_e.a(true)) {
            uh.field_n = true;
            uh.field_p = null;
            return true;
          } else {
            return false;
          }
        }
    }

    final boolean b(byte param0) {
        if (param0 <= 29) {
            return true;
        }
        if (pj.field_q != 13) {
            ((p) this).field_e.f(0);
            return this.c((byte) 69);
        }
        uh.field_p = null;
        return true;
    }

    p(boolean param0) {
        jn.field_p = 4;
        if (0 >= mo.field_l) {
            qh.field_k = -2;
        } else {
            int fieldTemp$0 = jn.field_p;
            jn.field_p = jn.field_p + 1;
            qh.field_k = fieldTemp$0;
        }
        int fieldTemp$1 = jn.field_p;
        jn.field_p = jn.field_p + 1;
        rk.field_g = fieldTemp$1;
        int fieldTemp$2 = jn.field_p;
        jn.field_p = jn.field_p + 1;
        sj.field_c = fieldTemp$2;
        gj.field_n = -(jn.field_p * 26 / 2) + 241;
        ((p) this).field_e = new jh(jn.field_p);
        ((p) this).field_e.a(-1, param0, ((p) this).field_e.a((byte) -24, 26, qh.field_i, 325, gj.field_n, 157, bm.field_h));
        int var2 = go.field_l.a(fa.field_m);
        int var3 = go.field_l.a(cc.field_b);
        if (var3 > var2) {
            var2 = var3;
        }
        ((p) this).field_g = (-79 + var2 + 480) / 2;
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = CrazyCrystals.field_B;
        go.a(jn.field_p + 2, 8, false);
        for (var2 = 0; var2 < jn.field_p; var2++) {
            this.a(-17, gj.field_n + 26 * var2, var2, var2 == ((p) this).field_e.field_c ? true : false);
        }
        if (param0 < 71) {
            p.b(53);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "This is you.";
        field_j = 0;
    }
}
