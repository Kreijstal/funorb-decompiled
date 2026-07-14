/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hk extends fb {
    private int field_I;
    static vo field_F;
    static vn field_H;
    private int field_O;
    private boolean field_D;
    private int field_E;
    private boolean field_K;
    private boolean field_M;
    private int field_N;
    private int field_G;
    static String field_P;
    static String[] field_J;

    final void g(int param0) {
        le var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        L0: {
          var5 = ZombieDawn.field_J;
          if (param0 >= 95) {
            break L0;
          } else {
            var6 = null;
            ((hk) this).a((byte) -28, (wk) null);
            break L0;
          }
        }
        L1: {
          ((hk) this).field_N = ((hk) this).field_N - 1;
          if ((((hk) this).field_N ^ -1) <= -1) {
            break L1;
          } else {
            if (((hk) this).field_D) {
              break L1;
            } else {
              ((hk) this).field_D = true;
              if (!((hk) this).field_K) {
                fn discarded$2 = kh.a(7, false);
                break L1;
              } else {
                fn discarded$3 = kh.a(6, false);
                break L1;
              }
            }
          }
        }
        L2: {
          ((hk) this).field_O = ((hk) this).field_O + ((hk) this).field_I;
          if (fp.field_H >= ((hk) this).field_O) {
            if (ac.field_t <= ((hk) this).field_O) {
              var2 = dj.field_e.field_R.b((byte) 26);
              L3: while (true) {
                if (!(var2 instanceof fb)) {
                  break L2;
                } else {
                  L4: {
                    if (!(var2 instanceof kd)) {
                      break L4;
                    } else {
                      var3 = ((kd) (Object) var2).a(true);
                      var4 = ((kd) (Object) var2).f(237239984);
                      if (5 + ((hk) this).field_E <= var4) {
                        break L4;
                      } else {
                        if (-50 + ((hk) this).field_E >= var4) {
                          break L4;
                        } else {
                          L5: {
                            L6: {
                              if (!((hk) this).field_M) {
                                break L6;
                              } else {
                                if (var3 <= ((hk) this).field_O) {
                                  break L6;
                                } else {
                                  if (120 + ((hk) this).field_O > var3) {
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            if (((hk) this).field_M) {
                              break L4;
                            } else {
                              if (((hk) this).field_O <= var3) {
                                break L4;
                              } else {
                                if (-120 + ((hk) this).field_O >= var3) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                          ((kd) (Object) var2).z(0);
                          ((kd) (Object) var2).q((byte) -108);
                          ((kd) (Object) var2).field_Gb = ((hk) this).field_I * 7 >> -669176062;
                          break L4;
                        }
                      }
                    }
                  }
                  var2 = var2.field_b;
                  continue L3;
                }
              }
            } else {
              ((hk) this).b(-27598);
              break L2;
            }
          } else {
            ((hk) this).b(-27598);
            break L2;
          }
        }
    }

    hk() {
        super(0, 0, 0);
        int var1 = 0;
        int stackIn_3_0 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_9_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_27_0 = null;
        Object stackOut_28_0 = null;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        L0: {
          if (pb.a(so.field_a, 2, 1) != 1) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var1 = stackIn_3_0;
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (-2 != (pb.a(so.field_a, 2, 1) ^ -1)) {
            stackOut_5_0 = this;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          ((hk) this).field_M = stackIn_6_1 != 0;
          if ((pb.a(so.field_a, 15, 1) ^ -1) == -2) {
            ((hk) this).field_G = 7 + pb.a(so.field_a, 2, 1);
            break L2;
          } else {
            ((hk) this).field_G = pb.a(so.field_a, 7, 1);
            break L2;
          }
        }
        L3: {
          stackOut_9_0 = this;
          stackIn_11_0 = stackOut_9_0;
          stackIn_10_0 = stackOut_9_0;
          if (var1 == 0) {
            stackOut_11_0 = this;
            stackOut_11_1 = 6;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            break L3;
          } else {
            stackOut_10_0 = this;
            stackOut_10_1 = 10;
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            break L3;
          }
        }
        L4: {
          ((hk) this).field_I = stackIn_12_1;
          if (((hk) this).field_M) {
            ((hk) this).field_I = -((hk) this).field_I;
            ((hk) this).field_O = fp.field_H;
            break L4;
          } else {
            ((hk) this).field_O = ac.field_t;
            break L4;
          }
        }
        L5: {
          ((hk) this).field_E = 0;
          if (var1 != 0) {
            break L5;
          } else {
            if (!((hk) this).field_M) {
              break L5;
            } else {
              ((hk) this).field_E = 0;
              break L5;
            }
          }
        }
        L6: {
          if (var1 == 0) {
            break L6;
          } else {
            if (!((hk) this).field_M) {
              break L6;
            } else {
              ((hk) this).field_E = 1;
              break L6;
            }
          }
        }
        L7: {
          if (var1 == 0) {
            break L7;
          } else {
            if (((hk) this).field_M) {
              break L7;
            } else {
              ((hk) this).field_E = 2;
              break L7;
            }
          }
        }
        L8: {
          if (var1 != 0) {
            break L8;
          } else {
            if (((hk) this).field_M) {
              break L8;
            } else {
              ((hk) this).field_E = 3;
              break L8;
            }
          }
        }
        L9: {
          L10: {
            ((hk) this).field_E = ((hk) this).field_E * 72;
            ((hk) this).field_E = ((hk) this).field_E + 254;
            ((hk) this).field_y = ((hk) this).field_O << 1893752144;
            ((hk) this).field_t = ((hk) this).field_G;
            ((hk) this).field_x = ((hk) this).field_E << -279527504;
            stackOut_27_0 = this;
            stackIn_29_0 = stackOut_27_0;
            stackIn_28_0 = stackOut_27_0;
            if (((hk) this).field_G == 7) {
              break L10;
            } else {
              stackOut_28_0 = this;
              stackIn_30_0 = stackOut_28_0;
              stackIn_29_0 = stackOut_28_0;
              if (-2 != (((hk) this).field_G ^ -1)) {
                stackOut_30_0 = this;
                stackOut_30_1 = 0;
                stackIn_31_0 = stackOut_30_0;
                stackIn_31_1 = stackOut_30_1;
                break L9;
              } else {
                break L10;
              }
            }
          }
          stackOut_29_0 = this;
          stackOut_29_1 = 1;
          stackIn_31_0 = stackOut_29_0;
          stackIn_31_1 = stackOut_29_1;
          break L9;
        }
        L11: {
          ((hk) this).field_K = stackIn_31_1 != 0;
          if (var1 == 0) {
            if (((hk) this).field_K) {
              fn discarded$4 = kh.a(5, false);
              break L11;
            } else {
              fn discarded$5 = kh.a(4, false);
              break L11;
            }
          } else {
            if (!((hk) this).field_K) {
              fn discarded$6 = kh.a(1, false);
              break L11;
            } else {
              fn discarded$7 = kh.a(3, false);
              break L11;
            }
          }
        }
        L12: {
          ((hk) this).field_D = false;
          if (-1 != (pb.a(so.field_a, 5, 1) ^ -1)) {
            ((hk) this).field_N = 2147483647;
            break L12;
          } else {
            ((hk) this).field_N = pb.a(so.field_a, 100, 1);
            break L12;
          }
        }
    }

    final void a(byte param0, wk param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var12 = ZombieDawn.field_J;
          var3 = param1.a(((hk) this).field_O, (byte) -75);
          var4 = param1.a(((hk) this).field_E, 0);
          if (param0 <= -76) {
            break L0;
          } else {
            field_J = null;
            break L0;
          }
        }
        L1: {
          var5 = -12 + tm.field_l[((hk) this).field_G] * 24;
          var6 = 24 * tm.field_i[((hk) this).field_G];
          if (((hk) this).field_M) {
            jc.field_t[0].b(var3 + -280, -60 + (-tm.field_k[((hk) this).field_G] + var4), 128);
            jc.field_t[1].b(-280 + var3, var4 - tm.field_k[((hk) this).field_G], 128);
            var7 = 0;
            L2: while (true) {
              if (tm.field_i[((hk) this).field_G] <= var7) {
                break L1;
              } else {
                var13 = 0;
                var8 = var13;
                L3: while (true) {
                  if (tm.field_l[((hk) this).field_G] <= var13) {
                    var7++;
                    continue L2;
                  } else {
                    tm.field_h[8 * var13 + (tm.field_n[((hk) this).field_G] - -var7)].b(var3 - -(var7 * 24), var13 * 24 + var4 - var5);
                    var13++;
                    continue L3;
                  }
                }
              }
            }
          } else {
            jc.field_t[2].b(var3 - 20, -60 + (-tm.field_k[((hk) this).field_G] + var4), 128);
            jc.field_t[3].b(var3 + -20, -tm.field_k[((hk) this).field_G] + var4, 128);
            var7 = 0;
            L4: while (true) {
              if (var7 >= tm.field_i[((hk) this).field_G]) {
                break L1;
              } else {
                var8 = 0;
                L5: while (true) {
                  if (var8 >= tm.field_l[((hk) this).field_G]) {
                    var7++;
                    continue L4;
                  } else {
                    var9 = tm.field_n[((hk) this).field_G];
                    var10 = tm.field_i[((hk) this).field_G];
                    var11 = 8 * var8 + -var7 + (var10 + (var9 - 1));
                    tm.field_h[var11].c(-var6 + (var3 - -(24 * var7)), var4 - (var5 + -(24 * var8)));
                    var8++;
                    continue L5;
                  }
                }
              }
            }
          }
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var9 = ZombieDawn.field_J;
        va[] var10 = new va[pa.field_x.length - -1];
        va[] var7 = var10;
        for (var8 = 0; pa.field_x.length > var8; var8++) {
            var10[var8] = pa.field_x[var8];
        }
        if (param1 != -23) {
            hk.b(false);
        }
        var7[var7.length + -1] = new va(param6, param0, param4, param2, param3, param5);
        pa.field_x = var7;
    }

    public static void b(boolean param0) {
        if (!param0) {
            field_P = null;
        }
        field_P = null;
        field_J = null;
        field_H = null;
        field_F = null;
    }

    final static void i(int param0) {
        uf var1_ref = null;
        uf var1 = (uf) (Object) ad.field_h.a(param0 + -1584);
        if (!(var1 != null)) {
            var1_ref = new uf();
        }
        var1_ref.a(bi.field_l, (byte) -29, bi.field_f, bi.field_b, bi.field_d, bi.field_c, bi.field_g, bi.field_a);
        rm.field_d.a(param0 ^ param0, (le) (Object) var1_ref);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = new vo();
        field_J = new String[]{"Legless", "Mostly Armless", "Braaaains", "American Consumer", "Undead End", "Re-Animator", "Bullet Catcher", "Soul Collector", "Plague Spreader", "Generation Z", "Assault on Precinct 15", "The Stench of Corruption", "Pumpkin Eater", "No Heart, No Foul", "There and Back Again", "My Feet are Killing Me", "Stamp Collecting", "The Blanks of Their Eyes", "Into the Barn", "I Know a Shortcut", "Fat Alien", "Alien Revenge", "Running Zombie", "Insider Information", "Long Live the Queen", "Zombie Plane", "Zombie Pigs", "Zombie Helix", "Zombie Throne", "London Calling", "In Through the Back Door", "They're Hiding Under the Stairs"};
        field_P = "Create a free Account";
    }
}
