/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ov extends nv implements mra {
    private pc field_s;
    private up field_r;
    private mg field_n;
    private int field_u;
    private boolean field_q;
    private int field_w;
    private boolean field_v;
    private boolean field_t;
    private int field_o;
    static int field_p;

    public final boolean b(int param0) {
        int var2 = -21 % ((37 - param0) / 45);
        return ((ov) this).field_t;
    }

    final void a(up param0, boolean param1) {
        ((ov) this).field_r = param0;
        if (!param1) {
            ((ov) this).field_u = -49;
        }
    }

    final void k(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        la var9 = null;
        int var10 = 0;
        pc var11 = null;
        int var12 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackOut_9_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        L0: {
          var12 = TombRacer.field_G ? 1 : 0;
          if (!((ov) this).field_q) {
            break L0;
          } else {
            if (((ov) this).m((byte) 19).u(-25561)) {
              ((ov) this).field_t = false;
              return;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (!((ov) this).i(12340).g(108)) {
            if (null != ((ov) this).field_n) {
              ((ov) this).field_n.d(0);
              if (!((ov) this).field_n.c(0)) {
                break L1;
              } else {
                L2: {
                  stackOut_9_0 = this;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_10_0 = stackOut_9_0;
                  if (((ov) this).field_v) {
                    stackOut_11_0 = this;
                    stackOut_11_1 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    break L2;
                  } else {
                    stackOut_10_0 = this;
                    stackOut_10_1 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    break L2;
                  }
                }
                ((ov) this).field_v = stackIn_12_1 != 0;
                ((ov) this).field_o = 0;
                break L1;
              }
            } else {
              break L1;
            }
          } else {
            break L1;
          }
        }
        ((ov) this).field_t = ((ov) this).field_v;
        if (!((ov) this).field_v) {
          return;
        } else {
          L3: {
            var2 = ((ov) this).field_w;
            if (0 != var2) {
              break L3;
            } else {
              var2 = 268435456;
              break L3;
            }
          }
          L4: {
            if (0 >= ((ov) this).field_u) {
              ((ov) this).field_o = var2;
              break L4;
            } else {
              ((ov) this).field_o = ((ov) this).field_o + ((ov) this).field_u;
              if (((ov) this).field_o <= var2) {
                break L4;
              } else {
                ((ov) this).field_o = var2;
                break L4;
              }
            }
          }
          L5: {
            var3 = ((ov) this).field_g.g(-25787) >> -655995902;
            var4 = hua.a((byte) 111, var3);
            var5 = bua.a(0, var3);
            var6 = 131072 + iia.d(((ov) this).field_g.c(param0 + -5467), ((ov) this).field_g.a((byte) 55), param0 ^ 5416) / 2;
            var7 = ((ov) this).field_g.d(3) + gqa.a(var4, (byte) 24, var6);
            var8 = ((ov) this).field_g.e(9648) + gqa.a(var5, (byte) 24, var6);
            ((ov) this).field_s.a(var7, gqa.a(var4, (byte) 24, ((ov) this).field_o) + var7, var8, gqa.a(var5, (byte) 24, ((ov) this).field_o) + var8, 44);
            ((ov) this).field_s.field_b = ((ov) this).field_o;
            ((ov) this).field_s.field_i = ((ov) this).field_g.P(param0 ^ param0) << -569600144;
            var9_int = ((ov) this).field_r.field_j;
            if (3 == var9_int) {
              ((ov) this).field_s.field_j = 6;
              break L5;
            } else {
              if (-3 == (var9_int ^ -1)) {
                ((ov) this).field_s.field_j = 7;
                break L5;
              } else {
                ((ov) this).field_s.field_j = 5;
                break L5;
              }
            }
          }
          L6: {
            var9 = ((ov) this).b(true);
            var10 = var9.a(1, (gma) (Object) ((ov) this).field_g, -66, ((ov) this).field_s, (gma) (Object) ((ov) this).e(6), ((ov) this).field_r) ? 1 : 0;
            var9.b(false).a((byte) 120, ((ov) this).field_s, ((ov) this).field_r);
            if (var10 == 0) {
              break L6;
            } else {
              var11 = ((ov) this).field_s;
              L7: while (true) {
                if (var11 == null) {
                  break L6;
                } else {
                  if (!var11.field_l) {
                    break L6;
                  } else {
                    L8: {
                      if (null != var11.field_h) {
                        break L8;
                      } else {
                        var9.b(false).a(var11, (gma) (Object) ((ov) this).field_g, (byte) -123);
                        int discarded$1 = var9.a(param0 ^ 5463, var11.field_a, ((ov) this).field_r, 524288, 524288, var11.field_e);
                        break L8;
                      }
                    }
                    var11 = var11.field_h;
                    continue L7;
                  }
                }
              }
            }
          }
          return;
        }
    }

    final pc c(int param0) {
        if (param0 < 99) {
            return null;
        }
        return ((ov) this).field_s;
    }

    final static boolean a(int param0, char param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = TombRacer.field_G ? 1 : 0;
        if (Character.isISOControl(param1)) {
            return false;
        }
        if (q.a(param1, 11955)) {
            return true;
        }
        char[] var6 = aba.field_c;
        char[] var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
            var4 = var6[var3];
            if (var4 == param1) {
                return true;
            }
        }
        if (param0 <= 1) {
            field_p = -59;
        }
        char[] var7 = hb.field_x;
        var2 = var7;
        int var8 = 0;
        var3 = var8;
        while (var8 < var7.length) {
            var4 = var7[var8];
            if (!(var4 != param1)) {
                return true;
            }
            var8++;
        }
        return false;
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
        if (param0) {
            ((ov) this).field_u = -117;
        }
        ((ov) this).field_n.a(15637, param1);
        param1.a((byte) -23, ((ov) this).field_w >> 1482967088, 10);
        ((ov) this).field_r.a(param1, (byte) 125);
        param1.a((byte) 85, !((ov) this).field_q ? 0 : 1, 1);
        param1.a((byte) 45, ((ov) this).field_u >> 554970192, 8);
    }

    final int a(boolean param0) {
        if (param0) {
            ((ov) this).field_q = false;
        }
        return 4;
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var23 = 0;
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        int stackIn_40_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        L0: {
          var23 = TombRacer.field_G ? 1 : 0;
          ufa.a(-57, param1);
          var7 = 0;
          var8 = -param0 + param1;
          if (0 > var8) {
            var8 = 0;
            break L0;
          } else {
            break L0;
          }
        }
        var9 = param1;
        var10 = -param1;
        var11 = var8;
        var12 = -var8;
        var13 = -1;
        if (!param3) {
          L1: {
            if (param2 < gca.field_d) {
              break L1;
            } else {
              if (param2 <= hc.field_h) {
                var39 = vaa.field_a[param2];
                var16 = rp.a(ss.field_c, -16226, pka.field_b, param6 - param1);
                var17 = rp.a(ss.field_c, -16226, pka.field_b, param6 - -param1);
                var18 = rp.a(ss.field_c, -16226, pka.field_b, param6 + -var8);
                var19 = rp.a(ss.field_c, -16226, pka.field_b, param6 - -var8);
                nra.a((byte) -55, param4, var18, var39, var16);
                nra.a((byte) -55, param5, var19, var39, var18);
                nra.a((byte) -55, param4, var17, var39, var19);
                break L1;
              } else {
                break L1;
              }
            }
          }
          var14 = -1;
          L2: while (true) {
            if (var9 <= var7) {
              return;
            } else {
              L3: {
                var14 += 2;
                var13 += 2;
                var10 = var10 + var13;
                var12 = var12 + var14;
                if (0 > var12) {
                  break L3;
                } else {
                  if (var11 >= 1) {
                    var11--;
                    var12 = var12 - (var11 << -765234271);
                    pqa.field_m[var11] = var7;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                var7++;
                if (0 <= var10) {
                  var9--;
                  var10 = var10 - (var9 << -900984191);
                  var15 = param2 - var9;
                  var16 = param2 + var9;
                  if (var16 < gca.field_d) {
                    break L4;
                  } else {
                    if (hc.field_h >= var15) {
                      if (var8 <= var9) {
                        L5: {
                          var17 = rp.a(ss.field_c, -16226, pka.field_b, param6 - -var7);
                          var18 = rp.a(ss.field_c, -16226, pka.field_b, -var7 + param6);
                          if (var16 > hc.field_h) {
                            break L5;
                          } else {
                            nra.a((byte) -55, param4, var17, vaa.field_a[var16], var18);
                            break L5;
                          }
                        }
                        if (gca.field_d <= var15) {
                          nra.a((byte) -55, param4, var17, vaa.field_a[var15], var18);
                          break L4;
                        } else {
                          break L4;
                        }
                      } else {
                        L6: {
                          var17 = pqa.field_m[var9];
                          var18 = rp.a(ss.field_c, -16226, pka.field_b, param6 - -var7);
                          var19 = rp.a(ss.field_c, -16226, pka.field_b, -var7 + param6);
                          var20 = rp.a(ss.field_c, -16226, pka.field_b, var17 + param6);
                          var21 = rp.a(ss.field_c, -16226, pka.field_b, -var17 + param6);
                          if (var16 <= hc.field_h) {
                            var40 = vaa.field_a[var16];
                            nra.a((byte) -55, param4, var21, var40, var19);
                            nra.a((byte) -55, param5, var20, var40, var21);
                            nra.a((byte) -55, param4, var18, var40, var20);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        if (var15 >= gca.field_d) {
                          var41 = vaa.field_a[var15];
                          nra.a((byte) -55, param4, var21, var41, var19);
                          nra.a((byte) -55, param5, var20, var41, var21);
                          nra.a((byte) -55, param4, var18, var41, var20);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                } else {
                  break L4;
                }
              }
              var15 = param2 + -var7;
              var16 = param2 - -var7;
              if (var16 < gca.field_d) {
                continue L2;
              } else {
                if (hc.field_h < var15) {
                  continue L2;
                } else {
                  var17 = var9 + param6;
                  var18 = param6 + -var9;
                  if (var17 < pka.field_b) {
                    continue L2;
                  } else {
                    if (var18 > ss.field_c) {
                      continue L2;
                    } else {
                      var17 = rp.a(ss.field_c, -16226, pka.field_b, var17);
                      var18 = rp.a(ss.field_c, -16226, pka.field_b, var18);
                      if (var8 <= var7) {
                        L7: {
                          if (hc.field_h >= var16) {
                            nra.a((byte) -55, param4, var17, vaa.field_a[var16], var18);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        if (gca.field_d <= var15) {
                          nra.a((byte) -55, param4, var17, vaa.field_a[var15], var18);
                          continue L2;
                        } else {
                          continue L2;
                        }
                      } else {
                        L8: {
                          if (var11 < var7) {
                            stackOut_39_0 = pqa.field_m[var7];
                            stackIn_40_0 = stackOut_39_0;
                            break L8;
                          } else {
                            stackOut_38_0 = var11;
                            stackIn_40_0 = stackOut_38_0;
                            break L8;
                          }
                        }
                        L9: {
                          var19 = stackIn_40_0;
                          var20 = rp.a(ss.field_c, -16226, pka.field_b, param6 + var19);
                          var21 = rp.a(ss.field_c, -16226, pka.field_b, -var19 + param6);
                          if (var16 <= hc.field_h) {
                            var42 = vaa.field_a[var16];
                            nra.a((byte) -55, param4, var21, var42, var18);
                            nra.a((byte) -55, param5, var20, var42, var21);
                            nra.a((byte) -55, param4, var17, var42, var20);
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        if (var15 < gca.field_d) {
                          continue L2;
                        } else {
                          var43 = vaa.field_a[var15];
                          nra.a((byte) -55, param4, var21, var43, var18);
                          nra.a((byte) -55, param5, var20, var43, var21);
                          nra.a((byte) -55, param4, var17, var43, var20);
                          continue L2;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    ov(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        ((ov) this).field_s = new pc();
        ((ov) this).field_o = 0;
        ((ov) this).field_n = new mg(param0.field_E, param1);
        ((ov) this).field_w = param1.b((byte) 44, 10) << 1993083792;
        ((ov) this).field_r = ad.a((byte) 87, param1);
        if (8 <= param0.field_E) {
            ((ov) this).field_q = param1.b((byte) 44, 1) == -2 ? true : false;
        }
        if (-12 <= param0.field_E) {
            ((ov) this).field_u = param1.b((byte) 44, 8) << 2075528272;
        }
    }

    final static boolean a(byte param0, int param1, int param2) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 <= -58) {
          L0: {
            L1: {
              if (uk.a(param2, (byte) 2, param1)) {
                break L1;
              } else {
                if (!pr.a(param1, -23611, param2)) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 1;
            stackIn_7_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return true;
        }
    }

    final static boolean b(int param0, int param1) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var2 = -1 % ((param0 - 63) / 46);
            if (hb.field_t == null) {
              break L1;
            } else {
              if (hb.field_t.field_c != param1) {
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_4_0 != 0;
    }

    final int a(int param0, int param1) {
        param0 = upa.a(((ov) this).field_v, param0, (byte) -106);
        param0 = fs.a((byte) 127, param0, ((ov) this).field_o);
        if (param1 >= -48) {
            return 84;
        }
        return param0;
    }

    public final void m(int param0) {
        int var2 = 12 % ((param0 - 28) / 49);
        if (!(!((ov) this).field_k)) {
            return;
        }
        super.m(78);
        if (!(((ov) this).field_f)) {
            ((ov) this).field_t = false;
        }
    }

    public final void a(int param0, mg param1) {
        ((ov) this).field_n = param1;
        if (param0 < 81) {
            boolean discarded$0 = ((ov) this).p((byte) -109);
        }
    }

    final void a(boolean param0, fsa param1) {
        super.a(param0, param1);
        ((ov) this).field_r.a((gma) (Object) ((ov) this).e(6), 2348);
        if (!param0) {
            ((ov) this).field_q = true;
        }
    }

    final boolean p(byte param0) {
        if (param0 != 120) {
            Object var3 = null;
            ((ov) this).a(true, (fsa) null);
        }
        return false;
    }

    ov(la param0, boolean param1) {
        super(param0, param1);
        ((ov) this).field_s = new pc();
        ((ov) this).field_o = 0;
        ((ov) this).field_n = new mg();
        ((ov) this).field_r = new up(1, 10);
        ((ov) this).field_r.b(1, 13);
        ((ov) this).field_w = 0;
        ((ov) this).field_u = 0;
    }

    final void b(int param0, iq param1) {
        super.b(117, param1);
        if (param0 < 112) {
            int discarded$0 = ((ov) this).a(true);
        }
    }

    static {
    }
}
