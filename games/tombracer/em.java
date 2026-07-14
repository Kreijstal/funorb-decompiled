/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em extends vw {
    static nh[] field_h;
    private boolean field_g;
    private na[] field_e;
    static String field_f;
    private boolean field_d;

    final void a(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        if (!((em) this).field_g) {
            ((em) this).field_c.a(0, false, ej.field_c);
        } else {
            ((em) this).field_c.e(1, false);
            ((em) this).field_c.a(true, (iva) null);
            ((em) this).field_c.a(kga.field_o, (byte) 0);
            ((em) this).field_c.p((byte) 127);
            if (!((em) this).field_d) {
                ((em) this).field_c.a(iw.field_c, (byte) -110, iw.field_c);
                ((em) this).field_c.a(ej.field_c, 0, -90);
                ((em) this).field_c.e(2, false);
                ((em) this).field_c.a(iw.field_c, (byte) -110, iw.field_c);
                ((em) this).field_c.a(ej.field_c, 0, -108);
                ((em) this).field_c.a(lja.field_j, 1, -15);
                ((em) this).field_c.a(0, false, ej.field_c);
                ((em) this).field_c.a(true, (iva) null);
            } else {
                ((em) this).field_c.a(iw.field_c, (byte) -110, iw.field_c);
                ((em) this).field_c.a(ej.field_c, 0, -94);
                ((em) this).field_c.a(0, false, ej.field_c);
            }
            ((em) this).field_c.e(0, false);
            ((em) this).field_g = false;
        }
        ((em) this).field_c.a(iw.field_c, (byte) -110, iw.field_c);
        if (param0 > -4) {
            ((em) this).a((byte) 55, -114, 112);
        }
    }

    public static void d(int param0) {
        if (param0 != 0) {
            em.d(-65);
        }
        field_h = null;
        field_f = null;
    }

    em(eo param0) {
        super(param0);
        int var2 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[][] var27 = null;
        int[][] var28 = null;
        int[][] var29 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_7_0 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          ((em) this).field_g = false;
          if (!param0.field_Ob) {
            break L0;
          } else {
            L1: {
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (3 <= param0.field_Vb) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((em) this).field_d = stackIn_4_1 != 0;
              if (((em) this).field_d) {
                stackOut_6_0 = 48;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = 127;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            var2 = stackIn_7_0;
            var29 = new int[6][4096];
            var27 = new int[6][4096];
            var28 = new int[6][4096];
            var9 = 0;
            var14 = 0;
            L3: while (true) {
              if (var14 >= 64) {
                ((em) this).field_e = new na[3];
                ((em) this).field_e[0] = ((em) this).field_c.a((byte) 37, var27, false, 64);
                ((em) this).field_e[1] = ((em) this).field_c.a((byte) 112, var28, false, 64);
                ((em) this).field_e[2] = ((em) this).field_c.a((byte) 64, var29, false, 64);
                break L0;
              } else {
                var15 = 0;
                L4: while (true) {
                  if (-65 >= (var15 ^ -1)) {
                    var14++;
                    continue L3;
                  } else {
                    var12 = -1.0f + (float)var14 * 2.0f / 64.0f;
                    var11 = -1.0f + (float)var15 * 2.0f / 64.0f;
                    var13 = (float)(1.0 / Math.sqrt((double)(1.0f + var11 * var11 + var12 * var12)));
                    var12 = var12 * var13;
                    var11 = var11 * var13;
                    var16 = 0;
                    L5: while (true) {
                      if (-7 >= var16) {
                        var9++;
                        var15++;
                        continue L4;
                      } else {
                        L6: {
                          if (-1 != var16) {
                            if (-2 != var16) {
                              if (-3 == var16) {
                                var10 = var12;
                                break L6;
                              } else {
                                if (var16 == 3) {
                                  var10 = -var12;
                                  break L6;
                                } else {
                                  if ((var16 ^ -1) == -5) {
                                    var10 = var13;
                                    break L6;
                                  } else {
                                    var10 = -var13;
                                    break L6;
                                  }
                                }
                              }
                            } else {
                              var10 = var11;
                              break L6;
                            }
                          } else {
                            var10 = -var11;
                            break L6;
                          }
                        }
                        L7: {
                          if (0.0f >= var10) {
                            var8 = 0;
                            var7 = 0;
                            var6 = 0;
                            break L7;
                          } else {
                            var6 = (int)(Math.pow((double)var10, 96.0) * (double)var2);
                            var7 = (int)(Math.pow((double)var10, 36.0) * (double)var2);
                            var8 = (int)((double)var2 * Math.pow((double)var10, 12.0));
                            break L7;
                          }
                        }
                        var27[var16][var9] = var6 << 1184956632;
                        var28[var16][var9] = var7 << -1055406184;
                        var29[var16][var9] = var8 << -1123278760;
                        var16++;
                        continue L5;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final void a(byte param0, int param1, int param2) {
        if (!(!((em) this).field_g)) {
            ((em) this).field_c.e(1, false);
            ((em) this).field_c.a(true, (iva) (Object) ((em) this).field_e[-1 + param1]);
            ((em) this).field_c.e(0, false);
        }
        if (param0 != 55) {
            ((em) this).a(-91);
        }
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        asa var4 = null;
        int var5 = 0;
        L0: {
          L1: {
            var5 = TombRacer.field_G ? 1 : 0;
            var3 = -121 / ((param0 - 41) / 62);
            if (null == ((em) this).field_e) {
              break L1;
            } else {
              if (param1) {
                L2: {
                  ((em) this).field_c.e(1, false);
                  ((em) this).field_c.a(gd.field_H, (byte) 0);
                  var4 = ((em) this).field_c.C(0);
                  var4.b(-94, 1024);
                  ((em) this).field_c.a(cva.field_b, false);
                  if (!((em) this).field_d) {
                    ((em) this).field_c.a(iw.field_c, (byte) -110, ln.field_F);
                    ((em) this).field_c.a(lja.field_j, 0, -34);
                    ((em) this).field_c.e(2, false);
                    ((em) this).field_c.a(ln.field_F, (byte) -110, jv.field_m);
                    ((em) this).field_c.a(lja.field_j, 0, -47);
                    ((em) this).field_c.a(lja.field_j, 1, -6219, true, false);
                    ((em) this).field_c.a(0, false, tla.field_c);
                    ((em) this).field_c.a(true, ((em) this).field_c.field_Jb);
                    break L2;
                  } else {
                    ((em) this).field_c.a(ln.field_F, (byte) -110, jv.field_m);
                    ((em) this).field_c.a(ej.field_c, 0, -6219, true, false);
                    ((em) this).field_c.a(0, false, tla.field_c);
                    break L2;
                  }
                }
                ((em) this).field_c.e(0, false);
                ((em) this).field_g = true;
                break L0;
              } else {
                break L1;
              }
            }
          }
          ((em) this).field_c.a(0, false, tla.field_c);
          break L0;
        }
    }

    final void a(boolean param0, int param1) {
        if (param1 != 5744) {
            return;
        }
        ((em) this).field_c.a(ln.field_F, (byte) -110, iw.field_c);
    }

    final boolean c(int param0) {
        if (param0 != 1185) {
            ((em) this).field_e = null;
            return true;
        }
        return true;
    }

    final void a(int param0, iva param1, int param2) {
        ((em) this).field_c.a(true, param1);
        if (param2 != 24595) {
            return;
        }
        ((em) this).field_c.a((byte) 108, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Email (Login):";
    }
}
