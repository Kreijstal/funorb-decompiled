/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qr extends uda {
    private boolean field_e;
    static int field_g;
    private boolean field_h;
    private hdb[] field_f;

    final void a(int param0, int param1, int param2) {
        if (param2 != 5) {
            return;
        }
        if (!(!((qr) this).field_e)) {
            ((qr) this).field_d.g(1, param2 ^ -112);
            ((qr) this).field_d.a((ura) (Object) ((qr) this).field_f[-1 + param1], -116);
            ((qr) this).field_d.g(0, -109);
        }
    }

    qr(pf param0) {
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
          ((qr) this).field_e = false;
          if (!param0.field_vb) {
            break L0;
          } else {
            L1: {
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (-4 >= (param0.field_L ^ -1)) {
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
              ((qr) this).field_h = stackIn_4_1 != 0;
              if (!((qr) this).field_h) {
                stackOut_6_0 = 127;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = 48;
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
              if (var14 <= -65) {
                ((qr) this).field_f = new hdb[3];
                ((qr) this).field_f[0] = ((qr) this).field_d.a(false, -5210, var27, 64);
                ((qr) this).field_f[1] = ((qr) this).field_d.a(false, -5210, var28, 64);
                ((qr) this).field_f[2] = ((qr) this).field_d.a(false, -5210, var29, 64);
                break L0;
              } else {
                var15 = 0;
                L4: while (true) {
                  if (-65 <= var15) {
                    var14++;
                    continue L3;
                  } else {
                    var12 = -1.0f + 2.0f * (float)var14 / 64.0f;
                    var11 = -1.0f + 2.0f * (float)var15 / 64.0f;
                    var13 = (float)(1.0 / Math.sqrt((double)(var11 * var11 + 1.0f + var12 * var12)));
                    var12 = var12 * var13;
                    var11 = var11 * var13;
                    var16 = 0;
                    L5: while (true) {
                      if (var16 <= -7) {
                        var9++;
                        var15++;
                        continue L4;
                      } else {
                        L6: {
                          if (0 != var16) {
                            if (-2 != var16) {
                              if (-3 == (var16 ^ -1)) {
                                var10 = var12;
                                break L6;
                              } else {
                                if (3 != var16) {
                                  if (4 == var16) {
                                    var10 = var13;
                                    break L6;
                                  } else {
                                    var10 = -var13;
                                    break L6;
                                  }
                                } else {
                                  var10 = -var12;
                                  break L6;
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
                          if (var10 <= 0.0f) {
                            var7 = 0;
                            var8 = 0;
                            var6 = 0;
                            break L7;
                          } else {
                            var6 = (int)(Math.pow((double)var10, 96.0) * (double)var2);
                            var7 = (int)(Math.pow((double)var10, 36.0) * (double)var2);
                            var8 = (int)((double)var2 * Math.pow((double)var10, 12.0));
                            break L7;
                          }
                        }
                        var27[var16][var9] = var6 << 1456193976;
                        var28[var16][var9] = var7 << -2029569480;
                        var29[var16][var9] = var8 << 750705752;
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

    final void b(int param0, boolean param1) {
        if (param0 != 5) {
            Object var4 = null;
            ((qr) this).a((byte) -108, 75, (ura) null);
        }
        ((qr) this).field_d.a(et.field_c, true, asa.field_a);
    }

    final void a(int param0, boolean param1) {
        int var4 = 0;
        oj var5 = null;
        var4 = VoidHunters.field_G;
        if (param0 == 5) {
          L0: {
            if (null == ((qr) this).field_f) {
              ((qr) this).field_d.a(0, (byte) -113, tma.field_q);
              break L0;
            } else {
              if (!param1) {
                ((qr) this).field_d.a(0, (byte) -113, tma.field_q);
                break L0;
              } else {
                ((qr) this).field_d.g(1, -51);
                ((qr) this).field_d.a((byte) -111, tea.field_d);
                var5 = ((qr) this).field_d.H((byte) 8);
                var5.a((byte) -80, 1024);
                ((qr) this).field_d.a(wda.field_o, true);
                if (!((qr) this).field_h) {
                  ((qr) this).field_d.a(asa.field_a, true, et.field_c);
                  ((qr) this).field_d.a(0, pja.field_l, 7);
                  ((qr) this).field_d.g(2, -51);
                  ((qr) this).field_d.a(et.field_c, true, je.field_c);
                  ((qr) this).field_d.a(0, pja.field_l, param0 ^ 2);
                  ((qr) this).field_d.a(true, param0 ^ -21120, false, pja.field_l, 1);
                  ((qr) this).field_d.a(0, (byte) -86, tma.field_q);
                  ((qr) this).field_d.a(((qr) this).field_d.field_Q, param0 + -119);
                  ((qr) this).field_d.g(0, -100);
                  ((qr) this).field_e = true;
                  break L0;
                } else {
                  ((qr) this).field_d.a(et.field_c, true, je.field_c);
                  ((qr) this).field_d.a(true, param0 + -21120, false, qcb.field_q, 0);
                  ((qr) this).field_d.a(0, (byte) -96, tma.field_q);
                  ((qr) this).field_d.g(0, -100);
                  ((qr) this).field_e = true;
                  break L0;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, int param1, ura param2) {
        if (param0 <= 42) {
            return;
        }
        ((qr) this).field_d.a(param2, -113);
        ((qr) this).field_d.h(-124, param1);
    }

    final void a(int param0) {
        int var3 = 0;
        L0: {
          var3 = VoidHunters.field_G;
          if (!((qr) this).field_e) {
            ((qr) this).field_d.a(0, (byte) -99, qcb.field_q);
            break L0;
          } else {
            ((qr) this).field_d.g(1, -114);
            ((qr) this).field_d.a((ura) null, -123);
            ((qr) this).field_d.a((byte) -111, meb.field_d);
            ((qr) this).field_d.F((byte) 108);
            if (((qr) this).field_h) {
              ((qr) this).field_d.a(asa.field_a, true, asa.field_a);
              ((qr) this).field_d.a(0, qcb.field_q, 7);
              ((qr) this).field_d.a(0, (byte) -92, qcb.field_q);
              ((qr) this).field_d.g(0, -110);
              ((qr) this).field_e = false;
              break L0;
            } else {
              ((qr) this).field_d.a(asa.field_a, true, asa.field_a);
              ((qr) this).field_d.a(0, qcb.field_q, 7);
              ((qr) this).field_d.g(2, -90);
              ((qr) this).field_d.a(asa.field_a, true, asa.field_a);
              ((qr) this).field_d.a(0, qcb.field_q, param0 + -2536);
              ((qr) this).field_d.a(1, pja.field_l, 7);
              ((qr) this).field_d.a(0, (byte) -105, qcb.field_q);
              ((qr) this).field_d.a((ura) null, -128);
              ((qr) this).field_d.g(0, -110);
              ((qr) this).field_e = false;
              break L0;
            }
          }
        }
        if (param0 == 2543) {
          ((qr) this).field_d.a(asa.field_a, true, asa.field_a);
          return;
        } else {
          return;
        }
    }

    final boolean a(byte param0) {
        int var2 = -3 / ((34 - param0) / 63);
        return true;
    }

    static {
    }
}
