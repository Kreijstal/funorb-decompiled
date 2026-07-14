/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad extends bw {
    boolean field_l;
    static boolean field_i;
    static sna field_q;
    int field_o;
    static pia field_h;
    aga field_s;
    static int field_g;
    eaa field_n;
    int field_k;
    int field_j;
    static int[] field_m;
    eaa field_t;
    int field_p;
    int field_r;
    lna field_f;

    final float e(byte param0) {
        int var3 = BachelorFridge.field_y;
        gca var2 = (gca) (Object) ((ad) this).field_n.b((byte) 90);
        if (param0 != -121) {
            Object var4 = null;
            nv discarded$0 = ad.a((sna) null, (jc) null, (sna) null, (sna) null, false);
        }
        while (var2 != null) {
            if (!(!(var2 instanceof c))) {
                return ((c) (Object) var2).field_j;
            }
            var2 = (gca) (Object) ((ad) this).field_n.c(0);
        }
        return 0.0f;
    }

    final void b(int param0, int param1) {
        ((ad) this).field_f.a((byte) 28, ((ad) this).field_s.field_o.field_b, param1);
        if (param0 != -1) {
            ((ad) this).c((byte) 96);
        }
    }

    final void a(int param0, int param1, String param2) {
        if (param1 < 7) {
            Object var5 = null;
            ((ad) this).a(-38, 92, (String) null);
        }
        ((ad) this).field_t.a((bw) (Object) new vca((po) (Object) taa.field_u, param2, param0, 4096, 20, 30, 50, (-8 + taa.field_u.field_F) * (-1 + ((ad) this).field_t.g(0)) + 8), true);
    }

    public static void c(boolean param0) {
        field_m = null;
        field_h = null;
        if (param0) {
            ad.c(false);
        }
        field_q = null;
    }

    final static boolean a(int param0, int param1) {
        if (!(param1 >= 0)) {
            return 0 == (param1 + 1) % 4 ? true : false;
        }
        if (-1583 < (param1 ^ -1)) {
            return param1 % 4 == -1 ? true : false;
        }
        if (!(-1 == param1 % 4)) {
            return false;
        }
        if (-1 != (param1 % 100 ^ -1)) {
            return true;
        }
        if (param0 != 30) {
            field_m = null;
        }
        if (param1 % 400 == 0) {
            return true;
        }
        return false;
    }

    final static nv a(sna param0, jc param1, sna param2, sna param3, boolean param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        nv[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        jc var13_ref = null;
        int var14 = 0;
        int var15 = 0;
        pda var16 = null;
        int var17 = 0;
        int[] var18 = null;
        char[] var19 = null;
        int[] var20 = null;
        char[] var21 = null;
        int[] var22 = null;
        char[] var23 = null;
        int[] var24 = null;
        char[] var25 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var17 = BachelorFridge.field_y;
        if (param1 != null) {
          L0: {
            if (null == param1.field_u) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = param1.field_u.length;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var5 = stackIn_5_0;
            if (null != param1.field_q) {
              stackOut_7_0 = param1.field_q.length;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            } else {
              stackOut_6_0 = 0;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
          }
          L2: {
            var6 = stackIn_8_0;
            var7 = var5 - -var6;
            var8 = new String[var7];
            var25 = new char[var7];
            var23 = var25;
            var21 = var23;
            var19 = var21;
            var9 = var19;
            if (!param4) {
              break L2;
            } else {
              field_g = -56;
              break L2;
            }
          }
          L3: {
            var24 = new int[var7];
            var22 = var24;
            var20 = var22;
            var18 = var20;
            var10 = var18;
            var11 = new nv[var7];
            if (param1.field_u == null) {
              break L3;
            } else {
              var12 = 0;
              L4: while (true) {
                if (var12 >= param1.field_u.length) {
                  break L3;
                } else {
                  var13_ref = bga.field_l.a((byte) 105, param1.field_u[var12]);
                  var8[var12] = var13_ref.field_s;
                  var9[var12] = param1.field_p[var12];
                  var11[var12] = ad.a(param0, var13_ref, param2, param3, false);
                  var12++;
                  continue L4;
                }
              }
            }
          }
          L5: {
            if (null != param1.field_q) {
              var12 = var5;
              var13 = 49;
              var14 = 0;
              L6: while (true) {
                if (param1.field_q.length <= var14) {
                  break L5;
                } else {
                  var15 = param1.field_q[var14];
                  if (0 != (var15 ^ -1)) {
                    L7: {
                      var16 = cea.field_h.a(-22834, var15);
                      var8[var14 + var12] = var16.d((byte) 74);
                      var9[var14 + var12] = param1.field_o[var14];
                      if (var9[var12 - -var14] > 0) {
                        break L7;
                      } else {
                        var13 = (char)(var13 + 1);
                        var9[var14 + var12] = (char)var13;
                        break L7;
                      }
                    }
                    var10[var14 + var12] = param1.field_q[var14];
                    var14++;
                    continue L6;
                  } else {
                    var8[var12 - -var14] = ci.field_p;
                    var9[var14 + var12] = param1.field_o[var14];
                    var10[var12 - -var14] = param1.field_q[var14];
                    var14++;
                    continue L6;
                  }
                }
              }
            } else {
              break L5;
            }
          }
          return new nv(0L, param3, param0, param2, var11, var24, var8, var25);
        } else {
          return null;
        }
    }

    final static boolean d(byte param0) {
        if (param0 < 7) {
            boolean discarded$0 = ad.a(54, -103);
        }
        return (ur.field_d ^ -1) < -251 ? true : false;
    }

    final void c(byte param0) {
        ((ad) this).field_f = ((ad) this).field_s.e((byte) -78);
        ((ad) this).field_f.field_b = ((ad) this).field_s.field_o.field_k.field_b;
        ((ad) this).field_t = new eaa();
        ((ad) this).field_n = new eaa();
        ((ad) this).field_j = ((ad) this).field_s.field_I;
        if (param0 >= -53) {
            ((ad) this).a(124);
        }
        ((ad) this).b(false);
    }

    final void b(boolean param0) {
        lna stackIn_1_0 = null;
        lna stackIn_2_0 = null;
        lna stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        lna stackOut_0_0 = null;
        lna stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        lna stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = ((ad) this).field_f;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param0) {
            stackOut_2_0 = (lna) (Object) stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (lna) (Object) stackIn_1_0;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ((lna) (Object) stackIn_3_0).field_v = stackIn_3_1 != 0;
          ((ad) this).field_f.field_i = false;
          if (((ad) this).field_s.field_y == 29) {
            break L1;
          } else {
            if (-45 != (((ad) this).field_s.field_y ^ -1)) {
              L2: {
                if (35 == ((ad) this).field_s.field_y) {
                  ((ad) this).field_f.field_i = true;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (((ad) this).field_s.field_y != 42) {
                  break L3;
                } else {
                  ((ad) this).field_f.field_v = true;
                  break L3;
                }
              }
              if ((((ad) this).field_s.field_I ^ -1) < -1) {
                ((ad) this).field_f.a((byte) 90, ((ad) this).field_s.field_o.field_b, 0);
                return;
              } else {
                ((ad) this).field_f.a((byte) 125, ((ad) this).field_s.field_o.field_b, 6);
                ((ad) this).field_f.field_u.a((byte) -69);
                return;
              }
            } else {
              break L1;
            }
          }
        }
        ((ad) this).field_f.a((byte) 92, ((ad) this).field_s.field_o.field_b, 18);
    }

    final void a(int param0) {
        int var3 = 0;
        gca var4 = null;
        gca var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        vca var8 = null;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        var7 = BachelorFridge.field_y;
        var8 = (vca) (Object) ((ad) this).field_t.b((byte) 90);
        L0: while (true) {
          L1: {
            if (var8 == null) {
              break L1;
            } else {
              L2: {
                if (var8.b(false)) {
                  var8.a(false);
                  break L2;
                } else {
                  if (var8.c((byte) 127)) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var8 = (vca) (Object) ((ad) this).field_t.c(0);
              continue L0;
            }
          }
          L3: {
            if (((ad) this).field_s.field_I < ((ad) this).field_j) {
              ((ad) this).field_j = ((ad) this).field_j - 1;
              break L3;
            } else {
              if (((ad) this).field_s.field_I > ((ad) this).field_j) {
                ((ad) this).field_j = ((ad) this).field_j + 1;
                break L3;
              } else {
                break L3;
              }
            }
          }
          L4: {
            if (param0 >= 101) {
              break L4;
            } else {
              ad.c(true);
              break L4;
            }
          }
          var3 = 0;
          var4 = (gca) (Object) ((ad) this).field_n.b((byte) 90);
          L5: while (true) {
            if (var4 == null) {
              L6: {
                if (var3 != 0) {
                  break L6;
                } else {
                  if (((ad) this).field_s.field_y != 0) {
                    var4_ref = nba.a(((ad) this).field_s.field_y, false);
                    if (var4_ref == null) {
                      break L6;
                    } else {
                      ((ad) this).field_n.a((bw) (Object) var4_ref, true);
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
              }
              return;
            } else {
              L7: {
                if (((ad) this).field_s.field_y != var4.field_h) {
                  stackOut_18_0 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  break L7;
                } else {
                  stackOut_17_0 = 1;
                  stackIn_19_0 = stackOut_17_0;
                  break L7;
                }
              }
              L8: {
                var5 = stackIn_19_0;
                var6 = var4.a(false, var5 != 0) ? 1 : 0;
                if (var5 != 0) {
                  break L8;
                } else {
                  if (var6 == 0) {
                    var4.a(false);
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
              var4 = (gca) (Object) ((ad) this).field_n.c(0);
              var3 = var3 | var5;
              continue L5;
            }
          }
        }
    }

    ad(aga param0) {
        ((ad) this).field_s = param0;
        ((ad) this).c((byte) -126);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = false;
        field_m = new int[]{23, 23, 24, 26, 30};
    }
}
