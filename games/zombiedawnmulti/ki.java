/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki {
    int field_q;
    static ja field_k;
    static ic field_a;
    int field_c;
    int field_g;
    ja field_b;
    static String[][] field_o;
    static String field_n;
    static ul field_m;
    static String field_f;
    static String field_p;
    static String field_i;
    static ej field_h;
    static String field_j;
    static int[] field_d;
    static no field_e;
    static String field_l;

    public static void b(int param0) {
        field_h = null;
        field_e = null;
        field_a = null;
        field_l = null;
        field_k = null;
        field_i = null;
        field_j = null;
        field_o = null;
        field_d = null;
        field_p = null;
        field_n = null;
        field_f = null;
        field_m = null;
        if (param0 != -23636) {
            field_e = null;
        }
    }

    final static String a(byte param0) {
        int var1 = -112 / ((-77 - param0) / 37);
        if (null == ta.field_lb) {
            return "";
        }
        return ta.field_lb;
    }

    final boolean b(byte param0) {
        if (param0 <= 3) {
          ki.b(-41);
          return ((ki) this).field_b.b(((ki) this).field_q, ((ki) this).field_g, bd.field_g, bo.field_d);
        } else {
          return ((ki) this).field_b.b(((ki) this).field_q, ((ki) this).field_g, bd.field_g, bo.field_d);
        }
    }

    final void a(boolean param0) {
        ((ki) this).field_b.c(((ki) this).field_q, ((ki) this).field_g);
        if (!param0) {
            ki.a(-85);
        }
    }

    final static void a(int param0) {
        if ((t.field_e ^ -1) >= -1) {
          if (param0 == 26) {
            if (km.field_cb != dl.field_h.field_f) {
              L0: {
                vj.field_t = vj.field_t + (-km.field_cb + dl.field_h.field_f);
                km.field_cb = dl.field_h.field_f;
                if (-1 > t.field_e) {
                  lk.g((byte) 63);
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            } else {
              L1: {
                if (-1 < t.field_e) {
                  lk.g((byte) 63);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            }
          } else {
            field_h = null;
            if (km.field_cb != dl.field_h.field_f) {
              L2: {
                vj.field_t = vj.field_t + (-km.field_cb + dl.field_h.field_f);
                km.field_cb = dl.field_h.field_f;
                if (-1 > t.field_e) {
                  lk.g((byte) 63);
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            } else {
              L3: {
                if (-1 < t.field_e) {
                  lk.g((byte) 63);
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            }
          }
        } else {
          t.field_e = t.field_e - 1;
          if (param0 != 26) {
            field_h = null;
            if (km.field_cb == dl.field_h.field_f) {
              L4: {
                if (-1 < t.field_e) {
                  lk.g((byte) 63);
                  break L4;
                } else {
                  break L4;
                }
              }
              return;
            } else {
              L5: {
                vj.field_t = vj.field_t + (-km.field_cb + dl.field_h.field_f);
                km.field_cb = dl.field_h.field_f;
                if (-1 > t.field_e) {
                  lk.g((byte) 63);
                  break L5;
                } else {
                  break L5;
                }
              }
              return;
            }
          } else {
            if (km.field_cb != dl.field_h.field_f) {
              L6: {
                vj.field_t = vj.field_t + (-km.field_cb + dl.field_h.field_f);
                km.field_cb = dl.field_h.field_f;
                if (-1 > t.field_e) {
                  lk.g((byte) 63);
                  break L6;
                } else {
                  break L6;
                }
              }
              return;
            } else {
              L7: {
                if (-1 < t.field_e) {
                  lk.g((byte) 63);
                  break L7;
                } else {
                  break L7;
                }
              }
              return;
            }
          }
        }
    }

    final static String a(String param0, String param1, ul param2, byte param3, String param4) {
        if (!(param2.a((byte) -116))) {
            return param0;
        }
        if (param3 != 76) {
            Object var6 = null;
            String discarded$0 = ki.a((String) null, (String) null, (ul) null, (byte) 113, (String) null);
        }
        return param4 + " - " + param2.a(0, param1) + "%";
    }

    ki(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        ja var7_ref = null;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        String var10_ref = null;
        ((ki) this).field_b = new ja(137, 49);
        ((ki) this).field_c = param0;
        ((ki) this).field_g = param2;
        ((ki) this).field_q = param1;
        g.c(((ki) this).field_b);
        var7 = null;
        if (0 <= param0) {
          if (-20 < param0) {
            L0: {
              if (!ll.field_k.c(127, param0)) {
                break L0;
              } else {
                var7_ref = wa.field_b[param0];
                break L0;
              }
            }
            var4 = 6575425;
            var5 = 3420451;
            var6 = 5524287;
            var8 = fh.field_g;
            var9 = ll.field_k.field_t[param0];
            if (!ll.field_k.d(param0, 53)) {
              L1: {
                if (var9 == 0) {
                  break L1;
                } else {
                  var8 = vl.a(fh.field_d, new String[2], 2);
                  break L1;
                }
              }
              L2: {
                var9 = var9 * 131 / cr.a(param0, -110);
                oo.a(1, 1, 135, 47, var4, var5);
                oo.f(2, 2, 133, 30, 16777215, 32);
                oo.f(3, 3, 101, 28, 65793, 128);
                oo.f(106, 3, 28, 28, 65793, 128);
                oo.e(2, 33, 133, 14, 65793);
                oo.e(3, 34, var9, 12, var6);
                if (var7_ref == null) {
                  break L2;
                } else {
                  var7_ref.g(108, 5);
                  break L2;
                }
              }
              L3: {
                if (ll.field_k.c(127, param0)) {
                  var10_ref = gh.field_f[param0];
                  break L3;
                } else {
                  var10 = ro.field_N;
                  break L3;
                }
              }
              int discarded$8 = qp.field_w.a(var10_ref, 6, 4, 95, 26, 16777215, -1, 0, 0, 0);
              qp.field_w.b(var8, 68, 45, 16777215, -1);
              g.d();
            } else {
              L4: {
                var8 = vo.field_n;
                var9 = cr.a(param0, -117);
                var9 = var9 * 131 / cr.a(param0, -110);
                oo.a(1, 1, 135, 47, var4, var5);
                oo.f(2, 2, 133, 30, 16777215, 32);
                oo.f(3, 3, 101, 28, 65793, 128);
                oo.f(106, 3, 28, 28, 65793, 128);
                oo.e(2, 33, 133, 14, 65793);
                oo.e(3, 34, var9, 12, var6);
                if (var7_ref == null) {
                  break L4;
                } else {
                  var7_ref.g(108, 5);
                  break L4;
                }
              }
              L5: {
                if (ll.field_k.c(127, param0)) {
                  var10_ref = gh.field_f[param0];
                  break L5;
                } else {
                  var10 = ro.field_N;
                  break L5;
                }
              }
              int discarded$9 = qp.field_w.a(var10_ref, 6, 4, 95, 26, 16777215, -1, 0, 0, 0);
              qp.field_w.b(var8, 68, 45, 16777215, -1);
              g.d();
            }
          } else {
            L6: {
              if (32 > param0) {
                break L6;
              } else {
                if (-39 >= param0) {
                  L7: {
                    if (!ll.field_k.c(127, param0)) {
                      break L7;
                    } else {
                      var7_ref = wa.field_b[-13 + param0];
                      break L7;
                    }
                  }
                  var6 = 8783880;
                  var5 = 5053184;
                  var4 = 8135424;
                  var8 = fh.field_g;
                  var9 = ll.field_k.field_t[param0];
                  if (!ll.field_k.d(param0, 53)) {
                    L8: {
                      if (var9 == 0) {
                        break L8;
                      } else {
                        var8 = vl.a(fh.field_d, new String[2], 2);
                        break L8;
                      }
                    }
                    L9: {
                      var9 = var9 * 131 / cr.a(param0, -110);
                      oo.a(1, 1, 135, 47, var4, var5);
                      oo.f(2, 2, 133, 30, 16777215, 32);
                      oo.f(3, 3, 101, 28, 65793, 128);
                      oo.f(106, 3, 28, 28, 65793, 128);
                      oo.e(2, 33, 133, 14, 65793);
                      oo.e(3, 34, var9, 12, var6);
                      if (var7_ref == null) {
                        break L9;
                      } else {
                        var7_ref.g(108, 5);
                        break L9;
                      }
                    }
                    L10: {
                      if (ll.field_k.c(127, param0)) {
                        var10_ref = gh.field_f[param0];
                        break L10;
                      } else {
                        var10 = ro.field_N;
                        break L10;
                      }
                    }
                    int discarded$10 = qp.field_w.a(var10_ref, 6, 4, 95, 26, 16777215, -1, 0, 0, 0);
                    qp.field_w.b(var8, 68, 45, 16777215, -1);
                    g.d();
                  } else {
                    L11: {
                      var8 = vo.field_n;
                      var10 = var8;
                      var8 = var10;
                      var9 = cr.a(param0, -117);
                      var9 = var9 * 131 / cr.a(param0, -110);
                      oo.a(1, 1, 135, 47, var4, var5);
                      oo.f(2, 2, 133, 30, 16777215, 32);
                      oo.f(3, 3, 101, 28, 65793, 128);
                      oo.f(106, 3, 28, 28, 65793, 128);
                      oo.e(2, 33, 133, 14, 65793);
                      oo.e(3, 34, var9, 12, var6);
                      if (var7_ref == null) {
                        break L11;
                      } else {
                        var7_ref.g(108, 5);
                        break L11;
                      }
                    }
                    L12: {
                      if (ll.field_k.c(127, param0)) {
                        var10_ref = gh.field_f[param0];
                        var8 = var10_ref;
                        var8 = var10_ref;
                        break L12;
                      } else {
                        var10 = ro.field_N;
                        break L12;
                      }
                    }
                    int discarded$11 = qp.field_w.a(var10_ref, 6, 4, 95, 26, 16777215, -1, 0, 0, 0);
                    qp.field_w.b(var8, 68, 45, 16777215, -1);
                    g.d();
                  }
                } else {
                  break L6;
                }
              }
            }
            L13: {
              var6 = 1993752;
              if (!ll.field_k.c(127, param0)) {
                break L13;
              } else {
                var7_ref = wa.field_b[-44 + (param0 + 26)];
                break L13;
              }
            }
            L14: {
              var4 = 280577;
              var5 = 2306851;
              var8 = fh.field_g;
              var9 = ll.field_k.field_t[param0];
              if (!ll.field_k.d(param0, 53)) {
                if (var9 == 0) {
                  break L14;
                } else {
                  var8 = vl.a(fh.field_d, new String[2], 2);
                  break L14;
                }
              } else {
                var8 = vo.field_n;
                var9 = cr.a(param0, -117);
                break L14;
              }
            }
            L15: {
              var9 = var9 * 131 / cr.a(param0, -110);
              oo.a(1, 1, 135, 47, var4, var5);
              oo.f(2, 2, 133, 30, 16777215, 32);
              oo.f(3, 3, 101, 28, 65793, 128);
              oo.f(106, 3, 28, 28, 65793, 128);
              oo.e(2, 33, 133, 14, 65793);
              oo.e(3, 34, var9, 12, var6);
              if (var7_ref == null) {
                break L15;
              } else {
                var7_ref.g(108, 5);
                break L15;
              }
            }
            L16: {
              if (ll.field_k.c(127, param0)) {
                var10_ref = gh.field_f[param0];
                break L16;
              } else {
                var10 = ro.field_N;
                break L16;
              }
            }
            int discarded$12 = qp.field_w.a(var10_ref, 6, 4, 95, 26, 16777215, -1, 0, 0, 0);
            qp.field_w.b(var8, 68, 45, 16777215, -1);
            g.d();
          }
        } else {
          L17: {
            if (32 > param0) {
              break L17;
            } else {
              if (-39 <= (param0 ^ -1)) {
                L18: {
                  if (!ll.field_k.c(127, param0)) {
                    break L18;
                  } else {
                    var7_ref = wa.field_b[-13 + param0];
                    break L18;
                  }
                }
                var6 = 8783880;
                var5 = 5053184;
                var4 = 8135424;
                var8 = fh.field_g;
                var9 = ll.field_k.field_t[param0];
                if (!ll.field_k.d(param0, 53)) {
                  L19: {
                    if (var9 == 0) {
                      break L19;
                    } else {
                      var8 = vl.a(fh.field_d, new String[2], 2);
                      var10 = var8;
                      var8 = var10;
                      break L19;
                    }
                  }
                  L20: {
                    var9 = var9 * 131 / cr.a(param0, -110);
                    oo.a(1, 1, 135, 47, var4, var5);
                    oo.f(2, 2, 133, 30, 16777215, 32);
                    oo.f(3, 3, 101, 28, 65793, 128);
                    oo.f(106, 3, 28, 28, 65793, 128);
                    oo.e(2, 33, 133, 14, 65793);
                    oo.e(3, 34, var9, 12, var6);
                    if (var7_ref == null) {
                      break L20;
                    } else {
                      var7_ref.g(108, 5);
                      break L20;
                    }
                  }
                  L21: {
                    if (ll.field_k.c(127, param0)) {
                      var10_ref = gh.field_f[param0];
                      var8 = var10_ref;
                      var8 = var10_ref;
                      break L21;
                    } else {
                      var10 = ro.field_N;
                      break L21;
                    }
                  }
                  int discarded$13 = qp.field_w.a(var10_ref, 6, 4, 95, 26, 16777215, -1, 0, 0, 0);
                  qp.field_w.b(var8, 68, 45, 16777215, -1);
                  g.d();
                } else {
                  L22: {
                    var8 = vo.field_n;
                    var10 = var8;
                    var8 = var10;
                    var9 = cr.a(param0, -117);
                    var9 = var9 * 131 / cr.a(param0, -110);
                    oo.a(1, 1, 135, 47, var4, var5);
                    oo.f(2, 2, 133, 30, 16777215, 32);
                    oo.f(3, 3, 101, 28, 65793, 128);
                    oo.f(106, 3, 28, 28, 65793, 128);
                    oo.e(2, 33, 133, 14, 65793);
                    oo.e(3, 34, var9, 12, var6);
                    if (var7_ref == null) {
                      break L22;
                    } else {
                      var7_ref.g(108, 5);
                      break L22;
                    }
                  }
                  L23: {
                    if (ll.field_k.c(127, param0)) {
                      var10_ref = gh.field_f[param0];
                      var8 = var10_ref;
                      break L23;
                    } else {
                      var10 = ro.field_N;
                      break L23;
                    }
                  }
                  int discarded$14 = qp.field_w.a(var10_ref, 6, 4, 95, 26, 16777215, -1, 0, 0, 0);
                  qp.field_w.b(var8, 68, 45, 16777215, -1);
                  g.d();
                }
              } else {
                break L17;
              }
            }
          }
          L24: {
            var6 = 1993752;
            if (!ll.field_k.c(127, param0)) {
              break L24;
            } else {
              var7_ref = wa.field_b[-44 + (param0 + 26)];
              break L24;
            }
          }
          L25: {
            var4 = 280577;
            var5 = 2306851;
            var8 = fh.field_g;
            var9 = ll.field_k.field_t[param0];
            if (!ll.field_k.d(param0, 53)) {
              if (var9 == 0) {
                break L25;
              } else {
                var8 = vl.a(fh.field_d, new String[2], 2);
                break L25;
              }
            } else {
              var8 = vo.field_n;
              var9 = cr.a(param0, -117);
              break L25;
            }
          }
          L26: {
            var9 = var9 * 131 / cr.a(param0, -110);
            oo.a(1, 1, 135, 47, var4, var5);
            oo.f(2, 2, 133, 30, 16777215, 32);
            oo.f(3, 3, 101, 28, 65793, 128);
            oo.f(106, 3, 28, 28, 65793, 128);
            oo.e(2, 33, 133, 14, 65793);
            oo.e(3, 34, var9, 12, var6);
            if (var7_ref == null) {
              break L26;
            } else {
              var7_ref.g(108, 5);
              break L26;
            }
          }
          L27: {
            if (ll.field_k.c(127, param0)) {
              var10_ref = gh.field_f[param0];
              break L27;
            } else {
              var10 = ro.field_N;
              break L27;
            }
          }
          int discarded$15 = qp.field_w.a(var10_ref, 6, 4, 95, 26, 16777215, -1, 0, 0, 0);
          qp.field_w.b(var8, 68, 45, 16777215, -1);
          g.d();
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = null;
        field_k = new ja(1280, 960);
        field_f = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_p = "Security";
        field_i = "<%0> is not on your friend list.";
        field_j = "Message lobby";
        field_n = "Checking";
        field_d = new int[4];
        field_l = "<%0> has entered another game.";
    }
}
