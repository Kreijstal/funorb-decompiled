/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rp extends da {
    private mkb field_e;
    private boolean field_c;
    private eb field_d;
    private pf field_f;

    final void a(char param0, int param1, int param2, int param3, boolean param4, aa param5, int param6, int param7) {
    }

    rp(pf param0, sw param1, ima[] param2, boolean param3) {
        super((ha) (Object) param0, param1);
        int var5 = 0;
        int var6 = 0;
        int[] var7_ref_int__ = null;
        byte[] var7_ref_byte__ = null;
        int var7 = 0;
        int var8 = 0;
        int[] var8_ref_int__ = null;
        int var9 = 0;
        int[] var10_ref_int__ = null;
        int var10_int = 0;
        float var10 = 0.0f;
        byte[] var11_ref_byte__ = null;
        int var11_int = 0;
        float var11 = 0.0f;
        byte[] var12_ref_byte__ = null;
        int var12 = 0;
        int var13_int = 0;
        ima var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        byte[] var16_ref_byte__ = null;
        int var17 = 0;
        int var18_int = 0;
        float var18 = 0.0f;
        int var19_int = 0;
        float var19 = 0.0f;
        int var20_int = 0;
        float var20 = 0.0f;
        int var21_int = 0;
        float var21 = 0.0f;
        float var22 = 0.0f;
        float var23 = 0.0f;
        int var24 = 0;
        ima var25 = null;
        ima var26 = null;
        byte[] var27 = null;
        int[] var28 = null;
        ima var29 = null;
        byte[] var30 = null;
        byte[] var31 = null;
        int[] var32 = null;
        jaclib.memory.Buffer var33 = null;
        jaclib.memory.Stream var34 = null;
        byte[] var35 = null;
        int[] var36 = null;
        byte[] var37 = null;
        byte[] var38 = null;
        int[] var39 = null;
        byte[] var40 = null;
        int[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        int[] var44 = null;
        byte[] var45 = null;
        int[] var46 = null;
        byte[] var47 = null;
        byte[] var48 = null;
        int[] var49 = null;
        byte[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        byte[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        byte[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        byte[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        byte[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        byte[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        ((rp) this).field_f = param0;
        var5 = 0;
        var6 = 0;
        L0: while (true) {
          if (var6 >= 256) {
            L1: {
              var6 = var5 * 16;
              if (!param3) {
                var49 = new int[var6 * var6];
                var44 = var49;
                var39 = var44;
                var32 = var39;
                var7_ref_int__ = var32;
                var8 = 0;
                L2: while (true) {
                  if (var8 >= 256) {
                    ((rp) this).field_d = param0.a(var6, false, var6, (byte) 123, var49);
                    ((rp) this).field_c = false;
                    break L1;
                  } else {
                    var29 = param2[var8];
                    var10_ref_int__ = var29.field_b;
                    var47 = var29.field_a;
                    var42 = var47;
                    var37 = var42;
                    var30 = var37;
                    var11_ref_byte__ = var30;
                    var48 = var29.field_h;
                    var43 = var48;
                    var38 = var43;
                    var31 = var38;
                    var12_ref_byte__ = var31;
                    var13_int = var29.field_e;
                    var14 = var29.field_f;
                    var15 = var8 % 16 * var5;
                    var16 = var8 / 16 * var5;
                    var17 = var16 * var6 + var15;
                    var18_int = 0;
                    if (var11_ref_byte__ == null) {
                      var19_int = 0;
                      L3: while (true) {
                        if (var19_int < var13_int) {
                          var20_int = 0;
                          L4: while (true) {
                            if (var20_int >= var14) {
                              var17 = var17 + (var6 - var14);
                              var19_int++;
                              continue L3;
                            } else {
                              var18_int++;
                              var21_int = var12_ref_byte__[var18_int];
                              if (var12_ref_byte__[var18_int] == 0) {
                                var17++;
                                var20_int++;
                                continue L4;
                              } else {
                                var17++;
                                var7_ref_int__[var17] = -16777216 | var10_ref_int__[var21_int & 255];
                                var20_int++;
                                continue L4;
                              }
                            }
                          }
                        } else {
                          var8++;
                          continue L2;
                        }
                      }
                    } else {
                      var19_int = 0;
                      L5: while (true) {
                        if (var19_int < var13_int) {
                          var20_int = 0;
                          L6: while (true) {
                            if (var20_int >= var14) {
                              var17 = var17 + (var6 - var14);
                              var19_int++;
                              continue L5;
                            } else {
                              var17++;
                              var7_ref_int__[var17] = var47[var18_int] << 24 | var10_ref_int__[var48[var18_int] & 255];
                              var18_int++;
                              var20_int++;
                              continue L6;
                            }
                          }
                        } else {
                          var8++;
                          continue L2;
                        }
                      }
                    }
                  }
                }
              } else {
                var45 = new byte[var6 * var6];
                var40 = var45;
                var35 = var40;
                var27 = var35;
                var7_ref_byte__ = var27;
                var8 = 0;
                L7: while (true) {
                  if (var8 >= 256) {
                    L8: {
                      if (param0.a(-26, nw.field_p, mj.field_f)) {
                        ((rp) this).field_d = param0.a(var6, nw.field_p, 0, var6, false, var45);
                        break L8;
                      } else {
                        var46 = new int[var45.length];
                        var41 = var46;
                        var36 = var41;
                        var28 = var36;
                        var8_ref_int__ = var28;
                        var9 = 0;
                        L9: while (true) {
                          if (var9 >= var45.length) {
                            ((rp) this).field_d = param0.a(var6, false, var6, (byte) -37, var46);
                            break L8;
                          } else {
                            var8_ref_int__[var9] = var45[var9] << 24;
                            var9++;
                            continue L9;
                          }
                        }
                      }
                    }
                    ((rp) this).field_c = true;
                    break L1;
                  } else {
                    var26 = param2[var8];
                    var10_int = var26.field_e;
                    var11_int = var26.field_f;
                    var12 = var8 % 16 * var5;
                    var13_int = var8 / 16 * var5;
                    var14 = var13_int * var6 + var12;
                    var15 = 0;
                    if (var26.field_a != null) {
                      var16_ref_byte__ = var26.field_a;
                      var17 = 0;
                      L10: while (true) {
                        if (var17 < var10_int) {
                          var18_int = 0;
                          L11: while (true) {
                            if (var18_int >= var11_int) {
                              var14 = var14 + (var6 - var11_int);
                              var17++;
                              continue L10;
                            } else {
                              var14++;
                              var15++;
                              var7_ref_byte__[var14] = var16_ref_byte__[var15];
                              var18_int++;
                              continue L11;
                            }
                          }
                        } else {
                          var8++;
                          continue L7;
                        }
                      }
                    } else {
                      var16_ref_byte__ = var26.field_h;
                      var17 = 0;
                      L12: while (true) {
                        if (var17 < var10_int) {
                          var18_int = 0;
                          L13: while (true) {
                            if (var18_int >= var11_int) {
                              var14 = var14 + (var6 - var11_int);
                              var17++;
                              continue L12;
                            } else {
                              L14: {
                                var14++;
                                var15++;
                                stackOut_16_0 = (byte[]) var7_ref_byte__;
                                stackOut_16_1 = var14;
                                stackIn_18_0 = stackOut_16_0;
                                stackIn_18_1 = stackOut_16_1;
                                stackIn_17_0 = stackOut_16_0;
                                stackIn_17_1 = stackOut_16_1;
                                if (var16_ref_byte__[var15] != 0) {
                                  stackOut_18_0 = (byte[]) (Object) stackIn_18_0;
                                  stackOut_18_1 = stackIn_18_1;
                                  stackOut_18_2 = -1;
                                  stackIn_19_0 = stackOut_18_0;
                                  stackIn_19_1 = stackOut_18_1;
                                  stackIn_19_2 = stackOut_18_2;
                                  break L14;
                                } else {
                                  stackOut_17_0 = (byte[]) (Object) stackIn_17_0;
                                  stackOut_17_1 = stackIn_17_1;
                                  stackOut_17_2 = 0;
                                  stackIn_19_0 = stackOut_17_0;
                                  stackIn_19_1 = stackOut_17_1;
                                  stackIn_19_2 = stackOut_17_2;
                                  break L14;
                                }
                              }
                              stackIn_19_0[stackIn_19_1] = (byte)stackIn_19_2;
                              var18_int++;
                              continue L13;
                            }
                          }
                        } else {
                          var8++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
              }
            }
            ((rp) this).field_d.a(jd.field_o, -28798);
            ((rp) this).field_e = param0.a(false, 3);
            boolean discarded$1 = ((rp) this).field_e.a(20, 20480, 96);
            var7 = 0;
            L15: while (true) {
              L16: {
                if (var7 >= 4) {
                  break L16;
                } else {
                  var33 = ((rp) this).field_e.a(true, (byte) 106);
                  if (var33 != null) {
                    var34 = ((rp) this).field_f.a(var33, false);
                    var10 = ((rp) this).field_d.a((float)var6, -1080) / (float)var6;
                    var11 = ((rp) this).field_d.b((float)var6, 105) / (float)var6;
                    var24 = 0;
                    var12 = var24;
                    L17: while (true) {
                      if (var24 >= 256) {
                        var34.b();
                        if (((rp) this).field_e.b(-20836)) {
                          break L16;
                        } else {
                          var7++;
                          continue L15;
                        }
                      } else {
                        var13 = param2[var24];
                        var14 = var13.field_e;
                        var15 = var13.field_f;
                        var16 = var13.field_g;
                        var17 = var13.field_c;
                        var18 = (float)(var24 % 16 * var5);
                        var19 = (float)(var24 / 16 * var5);
                        var20 = var18 * var10;
                        var21 = var19 * var11;
                        var22 = (var18 + (float)var15) * var10;
                        var23 = (var19 + (float)var14) * var11;
                        if (!jaclib.memory.Stream.a()) {
                          var34.a((float)var17);
                          var34.a((float)var16);
                          var34.a(0.0f);
                          var34.a(var20);
                          var34.a(var21);
                          var34.a((float)var17);
                          var34.a((float)(var16 + var14));
                          var34.a(0.0f);
                          var34.a(var20);
                          var34.a(var23);
                          var34.a((float)(var17 + var15));
                          var34.a((float)(var16 + var14));
                          var34.a(0.0f);
                          var34.a(var22);
                          var34.a(var23);
                          var34.a((float)(var17 + var15));
                          var34.a((float)var16);
                          var34.a(0.0f);
                          var34.a(var22);
                          var34.a(var21);
                          var24++;
                          continue L17;
                        } else {
                          var34.b((float)var17);
                          var34.b((float)var16);
                          var34.b(0.0f);
                          var34.b(var20);
                          var34.b(var21);
                          var34.b((float)var17);
                          var34.b((float)(var16 + var14));
                          var34.b(0.0f);
                          var34.b(var20);
                          var34.b(var23);
                          var34.b((float)(var17 + var15));
                          var34.b((float)(var16 + var14));
                          var34.b(0.0f);
                          var34.b(var22);
                          var34.b(var23);
                          var34.b((float)(var17 + var15));
                          var34.b((float)var16);
                          var34.b(0.0f);
                          var34.b(var22);
                          var34.b(var21);
                          var24++;
                          continue L17;
                        }
                      }
                    }
                  } else {
                    var7++;
                    continue L15;
                  }
                }
              }
            }
          } else {
            L18: {
              var25 = param2[var6];
              if (var25.field_e <= var5) {
                break L18;
              } else {
                var5 = var25.field_e;
                break L18;
              }
            }
            if (var25.field_f > var5) {
              var5 = var25.field_f;
              var6++;
              continue L0;
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    final void fa(char param0, int param1, int param2, int param3, boolean param4) {
        oj var6 = null;
        L0: {
          L1: {
            ((rp) this).field_f.c((byte) 95);
            ((rp) this).field_f.a((ura) (Object) ((rp) this).field_d, -121);
            if (((rp) this).field_c) {
              break L1;
            } else {
              if (!param4) {
                ((rp) this).field_f.a(et.field_c, true, et.field_c);
                break L0;
              } else {
                break L1;
              }
            }
          }
          ((rp) this).field_f.a(asa.field_a, true, et.field_c);
          ((rp) this).field_f.a(0, pea.field_d, 7);
          ((rp) this).field_f.e(-122, param3);
          break L0;
        }
        L2: {
          L3: {
            var6 = ((rp) this).field_f.A(11);
            var6.a(param1, param2, (byte) -54, 0);
            ((rp) this).field_f.h(20837);
            ((rp) this).field_f.a((byte) -6, ((rp) this).field_e, 0);
            ((rp) this).field_f.a(106, ((rp) this).field_f.field_Vb);
            ((rp) this).field_f.a(bk.field_v, param0 * 4, 2, 56);
            if (((rp) this).field_c) {
              break L3;
            } else {
              if (!param4) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          ((rp) this).field_f.a(0, qcb.field_q, 7);
          break L2;
        }
    }
}
