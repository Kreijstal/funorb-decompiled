/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ld extends km {
    static int[] field_w;
    static String field_r;
    static boolean field_u;
    static int field_t;
    static boolean field_s;
    static int[][] field_v;

    abstract int f(int param0);

    final void b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        q var8 = null;
        int var9 = 0;
        var9 = BrickABrac.field_J ? 1 : 0;
        if (sj.field_c == null) {
          return;
        } else {
          L0: {
            var2 = 1;
            var3 = nn.field_g.c(ag.field_D[((ld) this).field_m[0].field_f]);
            if (((ld) this).a((byte) 110, 1)) {
              var2++;
              var4 = 0;
              L1: while (true) {
                if (var4 >= sj.field_c.length) {
                  break L0;
                } else {
                  var5 = nn.field_g.c(sj.field_c[var4]);
                  if (var5 > var3) {
                    var3 = var5;
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              break L0;
            }
          }
          L2: {
            var3 += 20;
            if (param0) {
              break L2;
            } else {
              ld.g(102);
              break L2;
            }
          }
          var4 = 5 * var2 - (5 - var2 * var3);
          var5 = (-var4 + 640) / 2;
          var6 = this.h(6175);
          var7 = 0;
          L3: while (true) {
            if (var7 >= ((ld) this).field_m.length) {
              return;
            } else {
              L4: {
                var8 = ((ld) this).field_m[var7];
                var8.field_c = var7 * var3 + var5 + 5 * var7;
                var8.field_a = var6;
                if (0 != var7) {
                  break L4;
                } else {
                  var8.field_c = var8.field_c - 5;
                  break L4;
                }
              }
              var8.field_j = var3;
              var8.field_d = ((ld) this).b((byte) 115, var7);
              var7++;
              continue L3;
            }
          }
        }
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        tp var5_ref_tp = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        jp var10 = null;
        int var11 = 0;
        jp var12 = null;
        jp[] stackIn_26_0 = null;
        jp[] stackOut_25_0 = null;
        jp[] stackOut_24_0 = null;
        L0: {
          var11 = BrickABrac.field_J ? 1 : 0;
          if (null == ec.field_Q) {
            break L0;
          } else {
            ec.field_Q.a(true, 0, 0, 0, 0);
            break L0;
          }
        }
        L1: {
          lb.b(0, 0, 640, 480);
          gh.a(120, true);
          if (!wk.field_p) {
            break L1;
          } else {
            var12 = qh.field_e;
            var12.c((640 + -var12.field_x) / 2, 20);
            break L1;
          }
        }
        var2 = -qp.field_e[0].field_h + 480;
        var3 = ((ld) this).f(-6);
        var4 = 0;
        L2: while (true) {
          if (var4 >= 3) {
            L3: {
              if (param0 <= -14) {
                break L3;
              } else {
                field_s = false;
                break L3;
              }
            }
            var2 = var2 - (-var3 + 480) / 2;
            var4 = qp.field_e[0].field_f;
            var5 = 0;
            var6 = 0;
            L4: while (true) {
              L5: {
                if (pi.field_o.length <= var6) {
                  break L5;
                } else {
                  var7 = pi.field_o[var6];
                  if (0 <= var7) {
                    L6: {
                      var8 = 320;
                      var9 = var2;
                      if (sk.field_I != 2) {
                        if (var5 == 0) {
                          var9 += 14;
                          break L6;
                        } else {
                          if (var5 == 1) {
                            var9 += 38;
                            var8 = var8 - (-10 + var4 / 3);
                            break L6;
                          } else {
                            if (var5 != 2) {
                              break L6;
                            } else {
                              var8 = var8 + (var4 / 3 + -10);
                              var9 += 50;
                              break L6;
                            }
                          }
                        }
                      } else {
                        if (var5 != 0) {
                          var9 += 35;
                          var8 = var8 - (var4 / 4 + -5);
                          break L6;
                        } else {
                          var9 += 14;
                          var8 = var8 + (-6 + var4 / 4);
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (var5 != 0) {
                        stackOut_25_0 = e.field_q;
                        stackIn_26_0 = stackOut_25_0;
                        break L7;
                      } else {
                        stackOut_24_0 = cl.field_r;
                        stackIn_26_0 = stackOut_24_0;
                        break L7;
                      }
                    }
                    var10 = stackIn_26_0[da.field_C[var7]];
                    var10.c(var8 - var10.field_x / 2, var9 + -var10.field_z);
                    ce.field_e.b(fh.field_h[var7], var8, var2 - -85, 0, -1);
                    var5++;
                    if (var5 == 3) {
                      break L5;
                    } else {
                      var6++;
                      continue L4;
                    }
                  } else {
                    var6++;
                    continue L4;
                  }
                }
              }
              ((ld) this).a(0);
              pg.d(0);
              return;
            }
          } else {
            var5_ref_tp = qp.field_e[var4];
            var5_ref_tp.a((640 + -var5_ref_tp.field_f) / 2, -((-var3 + 480) / ((1 - -var4) * 2)) + var2);
            var4++;
            continue L2;
          }
        }
    }

    ld(int param0, int[] param1) {
        super(param0, 180, 460, 150, 35, param1);
    }

    final void a(boolean param0, int param1, int param2) {
        if (param2 < 96) {
            int discarded$0 = ((ld) this).f(66);
        }
        super.a(param0, param1, 100);
        ((ld) this).b(true);
    }

    void a(int param0, int param1, char param2) {
        if (param0 != -120) {
            field_w = null;
        }
        ((ld) this).field_h.a(0, -1);
    }

    private final int h(int param0) {
        return (284 + ((ld) this).f(-6)) / 2;
    }

    final void a(boolean param0, boolean param1, int param2) {
        int var5 = 0;
        int var6 = BrickABrac.field_J ? 1 : 0;
        if (param2 > -52) {
            ((ld) this).a(false, false, -123);
        }
        super.a(param0, param1, -121);
        int var4 = this.h(6175);
        for (var5 = 0; var5 < ((ld) this).field_m.length; var5++) {
            ((ld) this).field_m[var5].field_a = var4;
        }
    }

    public static void g(int param0) {
        if (param0 != -25617) {
            return;
        }
        field_r = null;
        field_w = null;
        field_v = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Hotseat multiplayer game";
        field_s = true;
    }
}
