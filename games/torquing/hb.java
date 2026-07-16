/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb extends am {
    static String[] field_u;
    private int field_w;
    static int field_y;
    private int field_t;
    static int field_s;
    private int field_z;
    static qc field_x;
    private int field_v;

    final static da a(boolean param0) {
        if (param0) {
            hb.b(48);
        }
        String var1 = ki.i(20);
        if (var1 != null) {
            if (0 <= var1.indexOf('@')) {
                var1 = "";
            }
        }
        return new da(ki.i(20), dc.b(true));
    }

    final static void a(int param0, boolean param1, t param2, int param3, int param4, int param5, int param6, int param7) {
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        t var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var28 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        L0: {
          var19 = Torquing.field_u;
          if (ph.field_k <= param0) {
            break L0;
          } else {
            param4 = param4 - (ph.field_k - param0);
            param0 = ph.field_k;
            break L0;
          }
        }
        L1: {
          if ((param0 + param4 ^ -1) >= (ph.field_a ^ -1)) {
            break L1;
          } else {
            param4 = ph.field_a + -param0;
            break L1;
          }
        }
        L2: {
          if ((param6 ^ -1) <= (ph.field_c ^ -1)) {
            break L2;
          } else {
            param3 = param3 - (-param6 + ph.field_c);
            param6 = ph.field_c;
            break L2;
          }
        }
        L3: {
          if ((ph.field_h ^ -1) > (param3 + param6 ^ -1)) {
            param3 = -param6 + ph.field_h;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (param4 <= 0) {
            break L4;
          } else {
            if ((param3 ^ -1) >= -1) {
              break L4;
            } else {
              L5: {
                var21 = param2.c();
                var32 = ph.field_e;
                var10 = ph.field_j;
                var11 = ph.field_d;
                var30 = new int[4];
                ph.b(var30);
                param2.e();
                if (!param1) {
                  break L5;
                } else {
                  hb.b(-75);
                  break L5;
                }
              }
              ph.f(var30[0], var30[1], var30[2], var30[3]);
              var13 = param2.field_s * param6 + param0;
              var14 = param2.field_s - param4;
              var31 = var21.field_y;
              var28 = var31;
              var25 = var28;
              var22 = var25;
              var15 = var22;
              var16 = param6;
              L6: while (true) {
                if ((var16 ^ -1) <= (param6 + param3 ^ -1)) {
                  var21.d(-param2.field_v, -param2.field_r);
                  ph.a(var32, var10, var11);
                  ph.a(var30);
                  return;
                } else {
                  var17 = param0;
                  L7: while (true) {
                    if (param0 + param4 <= var17) {
                      var13 = var13 + var14;
                      var16++;
                      continue L6;
                    } else {
                      L8: {
                        var18 = var31[var13];
                        if (-1 != (var18 ^ -1)) {
                          L9: {
                            L10: {
                              if (var17 <= 0) {
                                break L10;
                              } else {
                                if (-1 == (var15[-1 + var13] ^ -1)) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            L11: {
                              if (-1 <= (var16 ^ -1)) {
                                break L11;
                              } else {
                                if ((var15[-param2.field_s + var13] ^ -1) == -1) {
                                  break L9;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            L12: {
                              if (var17 >= -1 + param2.field_s) {
                                break L12;
                              } else {
                                if ((var15[1 + var13] ^ -1) == -1) {
                                  break L9;
                                } else {
                                  break L12;
                                }
                              }
                            }
                            if (-1 + param2.field_t <= var16) {
                              break L8;
                            } else {
                              if (0 == var15[var13 - -param2.field_s]) {
                                break L9;
                              } else {
                                break L8;
                              }
                            }
                          }
                          ph.d(var17, var16, param7, param5);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      var13++;
                      var17++;
                      continue L7;
                    }
                  }
                }
              }
            }
          }
        }
    }

    public hb() {
        super(0, true);
        ((hb) this).field_t = 0;
        ((hb) this).field_w = 20;
        ((hb) this).field_z = 1365;
        ((hb) this).field_v = 0;
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        uk.field_a[vg.field_o] = param5;
        lp.field_g[vg.field_o] = vg.field_o;
        il.field_o[vg.field_o] = param0;
        if (param0 > mc.field_l) {
            qd.field_g = param0;
        }
        if (param0 < ga.field_c) {
            lj.field_d = param0;
        }
        wh.field_y[vg.field_o] = param1;
        vo.field_d[vg.field_o] = param4;
        vp.field_F[vg.field_o] = param3;
        int var6 = param1 + param4 + param3;
        int var7 = var6 != 0 ? 1000 * param1 / var6 : 0;
        ji.field_a[vg.field_o] = var7;
        if (param2) {
            field_s = 26;
        }
        if (!(var7 <= qd.field_g)) {
            qd.field_g = var7;
        }
        if (var7 < lj.field_d) {
            lj.field_d = var7;
        }
        vg.field_o = vg.field_o + 1;
    }

    public static void b(int param0) {
        if (param0 != -799778388) {
            return;
        }
        field_x = null;
        field_u = null;
    }

    final int[] a(byte param0, int param1) {
        int[] var3 = null;
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
        int var14 = 0;
        int[] var15 = null;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        L0: {
          var14 = Torquing.field_u;
          var15 = ((hb) this).field_l.a(param1, 25657);
          var3 = var15;
          if (param0 > 86) {
            break L0;
          } else {
            field_s = 59;
            break L0;
          }
        }
        L1: {
          if (!((hb) this).field_l.field_b) {
            break L1;
          } else {
            var4 = 0;
            L2: while (true) {
              if (ci.field_c <= var4) {
                break L1;
              } else {
                var5 = (q.field_b[var4] << -2140445844) / ((hb) this).field_z + ((hb) this).field_v;
                var6 = (dp.field_a[param1] << 860028396) / ((hb) this).field_z - -((hb) this).field_t;
                var7 = var5;
                var8 = var6;
                var9 = var5;
                var10 = var6;
                var11 = var5 * var5 >> -771939956;
                var12 = var6 * var6 >> -242533716;
                var13 = 0;
                L3: while (true) {
                  L4: {
                    if ((var11 - -var12 ^ -1) <= -16385) {
                      break L4;
                    } else {
                      if (((hb) this).field_w <= var13) {
                        break L4;
                      } else {
                        var10 = var8 + 2 * (var9 * var10 >> 456370988);
                        var9 = var11 + -var12 - -var7;
                        var12 = var10 * var10 >> 650470956;
                        var11 = var9 * var9 >> -799778388;
                        var13++;
                        continue L3;
                      }
                    }
                  }
                  L5: {
                    stackOut_9_0 = (int[]) var15;
                    stackOut_9_1 = var4;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    if (-1 + ((hb) this).field_w > var13) {
                      stackOut_11_0 = (int[]) (Object) stackIn_11_0;
                      stackOut_11_1 = stackIn_11_1;
                      stackOut_11_2 = (var13 << 1574092108) / ((hb) this).field_w;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      stackIn_12_2 = stackOut_11_2;
                      break L5;
                    } else {
                      stackOut_10_0 = (int[]) (Object) stackIn_10_0;
                      stackOut_10_1 = stackIn_10_1;
                      stackOut_10_2 = 0;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      stackIn_12_2 = stackOut_10_2;
                      break L5;
                    }
                  }
                  stackIn_12_0[stackIn_12_1] = stackIn_12_2;
                  var4++;
                  continue L2;
                }
              }
            }
          }
        }
        return var15;
    }

    final void a(fj param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Torquing.field_u;
          if (param1 == 35) {
            break L0;
          } else {
            field_x = null;
            break L0;
          }
        }
        L1: {
          var4 = param2;
          if (0 == var4) {
            ((hb) this).field_z = param0.i(7088);
            break L1;
          } else {
            if ((var4 ^ -1) == -2) {
              ((hb) this).field_w = param0.i(param1 ^ 7059);
              break L1;
            } else {
              if (-3 != (var4 ^ -1)) {
                if (var4 != 3) {
                  break L1;
                } else {
                  ((hb) this).field_t = param0.i(7088);
                  break L1;
                }
              } else {
                ((hb) this).field_v = param0.i(7088);
                break L1;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new String[25];
        field_y = 0;
    }
}
