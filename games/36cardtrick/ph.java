/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    private he[] field_e;
    private long field_d;
    private int field_c;
    private he field_b;
    static String field_a;

    public static void b(int param0) {
        int var1 = 110 % ((-13 - param0) / 60);
        field_a = null;
    }

    final he a(int param0, long param1) {
        he var4 = null;
        he var5 = null;
        int var6 = 0;
        he var7 = null;
        he var8 = null;
        var6 = Main.field_T;
        ((ph) this).field_d = param1;
        if (param0 <= -26) {
          var7 = ((ph) this).field_e[(int)(param1 & (long)(-1 + ((ph) this).field_c))];
          var4 = var7;
          ((ph) this).field_b = var7.field_h;
          L0: while (true) {
            if (var4 != ((ph) this).field_b) {
              if (~param1 == ~((ph) this).field_b.field_j) {
                var5 = ((ph) this).field_b;
                ((ph) this).field_b = ((ph) this).field_b.field_h;
                return var5;
              } else {
                ((ph) this).field_b = ((ph) this).field_b.field_h;
                continue L0;
              }
            } else {
              ((ph) this).field_b = null;
              return null;
            }
          }
        } else {
          int discarded$1 = ph.a(22, 12);
          var8 = ((ph) this).field_e[(int)(param1 & (long)(-1 + ((ph) this).field_c))];
          var4 = var8;
          ((ph) this).field_b = var8.field_h;
          L1: while (true) {
            if (var4 != ((ph) this).field_b) {
              if (~param1 == ~((ph) this).field_b.field_j) {
                var5 = ((ph) this).field_b;
                ((ph) this).field_b = ((ph) this).field_b.field_h;
                return var5;
              } else {
                ((ph) this).field_b = ((ph) this).field_b.field_h;
                continue L1;
              }
            } else {
              ((ph) this).field_b = null;
              return null;
            }
          }
        }
    }

    final static void c() {
        ga.a(true);
        if (tb.field_c == null) {
          int discarded$100 = 123;
          r.b();
          int discarded$101 = 0;
          kf.d();
          int discarded$102 = -122;
          ui.d();
          int discarded$103 = -112;
          if (wk.b()) {
            na.field_r.h(1, 0);
            fe.a((byte) -38, 0);
            mc.a((byte) -126);
            return;
          } else {
            mc.a((byte) -126);
            return;
          }
        } else {
          bg.a(tb.field_c, (byte) -76);
          int discarded$104 = 123;
          r.b();
          int discarded$105 = 0;
          kf.d();
          int discarded$106 = -122;
          ui.d();
          int discarded$107 = -112;
          if (!wk.b()) {
            mc.a((byte) -126);
            return;
          } else {
            na.field_r.h(1, 0);
            fe.a((byte) -38, 0);
            mc.a((byte) -126);
            return;
          }
        }
    }

    final he a(int param0) {
        he var2 = null;
        he var3 = null;
        int var4 = 0;
        var4 = Main.field_T;
        if (param0 == 26847) {
          if (((ph) this).field_b != null) {
            var2 = ((ph) this).field_e[(int)((long)(-1 + ((ph) this).field_c) & ((ph) this).field_d)];
            L0: while (true) {
              if (((ph) this).field_b != var2) {
                if (((ph) this).field_b.field_j != ((ph) this).field_d) {
                  ((ph) this).field_b = ((ph) this).field_b.field_h;
                  continue L0;
                } else {
                  var3 = ((ph) this).field_b;
                  ((ph) this).field_b = ((ph) this).field_b.field_h;
                  return var3;
                }
              } else {
                ((ph) this).field_b = null;
                return null;
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    ph(int param0) {
        int var2 = 0;
        he var3 = null;
        ((ph) this).field_c = param0;
        ((ph) this).field_e = new he[param0];
        for (var2 = 0; param0 > var2; var2++) {
            he dupTemp$0 = new he();
            var3 = dupTemp$0;
            ((ph) this).field_e[var2] = dupTemp$0;
            var3.field_h = var3;
            var3.field_i = var3;
        }
    }

    final static boolean a(char param0) {
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_24_0 = 0;
        if (param0 < 48) {
          if (65 > param0) {
            L0: {
              if (param0 < 97) {
                break L0;
              } else {
                if (param0 > 122) {
                  break L0;
                } else {
                  return true;
                }
              }
            }
            return false;
          } else {
            if (param0 <= 90) {
              stackOut_26_0 = 1;
              stackIn_28_0 = stackOut_26_0;
              return stackIn_28_0 != 0;
            } else {
              L1: {
                L2: {
                  if (param0 < 97) {
                    break L2;
                  } else {
                    if (param0 > 122) {
                      break L2;
                    } else {
                      stackOut_23_0 = 1;
                      stackIn_25_0 = stackOut_23_0;
                      break L1;
                    }
                  }
                }
                stackOut_24_0 = 0;
                stackIn_25_0 = stackOut_24_0;
                break L1;
              }
              return stackIn_25_0 != 0;
            }
          }
        } else {
          if (param0 > 57) {
            if (65 <= param0) {
              if (param0 > 90) {
                if (param0 >= 97) {
                  if (param0 > 122) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            } else {
              if (param0 >= 97) {
                if (param0 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            }
          } else {
            return true;
          }
        }
    }

    final void a(he param0, long param1, int param2) {
        he var5 = null;
        try {
            if (!(param0.field_i == null)) {
                param0.d(12);
            }
            var5 = ((ph) this).field_e[(int)(param1 & (long)(((ph) this).field_c - 1))];
            param0.field_h = var5;
            param0.field_i = var5.field_i;
            param0.field_i.field_h = param0;
            if (param2 != 6144) {
                field_a = null;
            }
            param0.field_j = param1;
            param0.field_h.field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "ph.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var2 = 35 / ((40 - param0) / 45);
        param1 = param1 & 8191;
        if (4096 <= param1) {
          L0: {
            if (param1 < 6144) {
              stackOut_7_0 = -ad.field_g[param1 + -4096];
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = -ad.field_g[8192 - param1];
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (param1 >= 2048) {
              stackOut_3_0 = ad.field_g[-param1 + 4096];
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = ad.field_g[param1];
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Please try again in a few minutes.";
    }
}
