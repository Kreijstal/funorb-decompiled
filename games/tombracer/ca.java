/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca extends da {
    private eo field_g;
    private gf field_f;
    private qm field_d;
    private boolean field_e;

    ca(eo param0, qla param1, jpa[] param2, boolean param3) {
        super(param0, param1);
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        boolean discarded$15 = false;
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
        jpa var13 = null;
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
        jpa var25 = null;
        jpa var26 = null;
        byte[] var27 = null;
        int[] var28 = null;
        jpa var29 = null;
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
        byte[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        byte[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        byte[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        byte[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        byte[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        byte[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        this.field_g = param0;
        var5 = 0;
        var6 = 0;
        L0: while (true) {
          if (var6 >= 256) {
            L1: {
              var6 = var5 * 16;
              if (!param3) {
                var39 = new int[var6 * var6];
                var32 = var39;
                var7_ref_int__ = var32;
                var8 = 0;
                L2: while (true) {
                  if (var8 >= 256) {
                    this.field_f = param0.a(true, var6, false, var6, var39);
                    this.field_e = false;
                    break L1;
                  } else {
                    L3: {
                      var29 = param2[var8];
                      var10_ref_int__ = var29.field_g;
                      var37 = var29.field_h;
                      var30 = var37;
                      var11_ref_byte__ = var30;
                      var38 = var29.field_f;
                      var31 = var38;
                      var12_ref_byte__ = var31;
                      var13_int = var29.field_a;
                      var14 = var29.field_i;
                      var15 = var8 % 16 * var5;
                      var16 = var8 / 16 * var5;
                      var17 = var16 * var6 + var15;
                      var18_int = 0;
                      if (var11_ref_byte__ == null) {
                        var19_int = 0;
                        L4: while (true) {
                          if (var19_int >= var13_int) {
                            break L3;
                          } else {
                            var20_int = 0;
                            L5: while (true) {
                              if (var20_int >= var14) {
                                var17 = var17 + (var6 - var14);
                                var19_int++;
                                continue L4;
                              } else {
                                L6: {
                                  incrementValue$8 = var18_int;
                                  var18_int++;
                                  var21_int = var12_ref_byte__[incrementValue$8];
                                  if (var12_ref_byte__[incrementValue$8] == 0) {
                                    var17++;
                                    break L6;
                                  } else {
                                    incrementValue$9 = var17;
                                    var17++;
                                    var7_ref_int__[incrementValue$9] = -16777216 | var10_ref_int__[var21_int & 255];
                                    break L6;
                                  }
                                }
                                var20_int++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        var19_int = 0;
                        L7: while (true) {
                          if (var19_int >= var13_int) {
                            break L3;
                          } else {
                            var20_int = 0;
                            L8: while (true) {
                              if (var20_int >= var14) {
                                var17 = var17 + (var6 - var14);
                                var19_int++;
                                continue L7;
                              } else {
                                incrementValue$10 = var17;
                                var17++;
                                var7_ref_int__[incrementValue$10] = var37[var18_int] << 24 | var10_ref_int__[var38[var18_int] & 255];
                                var18_int++;
                                var20_int++;
                                continue L8;
                              }
                            }
                          }
                        }
                      }
                    }
                    var8++;
                    continue L2;
                  }
                }
              } else {
                var35 = new byte[var6 * var6];
                var27 = var35;
                var7_ref_byte__ = var27;
                var8 = 0;
                L9: while (true) {
                  if (var8 >= 256) {
                    L10: {
                      if (param0.a(false, una.field_g, rp.field_g)) {
                        this.field_f = param0.a(var6, var35, false, rp.field_g, -128, var6);
                        break L10;
                      } else {
                        var36 = new int[var35.length];
                        var28 = var36;
                        var8_ref_int__ = var28;
                        var9 = 0;
                        L11: while (true) {
                          if (var9 >= var35.length) {
                            this.field_f = param0.a(true, var6, false, var6, var36);
                            break L10;
                          } else {
                            var8_ref_int__[var9] = var35[var9] << 24;
                            var9++;
                            continue L11;
                          }
                        }
                      }
                    }
                    this.field_e = true;
                    break L1;
                  } else {
                    L12: {
                      var26 = param2[var8];
                      var10_int = var26.field_a;
                      var11_int = var26.field_i;
                      var12 = var8 % 16 * var5;
                      var13_int = var8 / 16 * var5;
                      var14 = var13_int * var6 + var12;
                      var15 = 0;
                      if (var26.field_h != null) {
                        var16_ref_byte__ = var26.field_h;
                        var17 = 0;
                        L13: while (true) {
                          if (var17 >= var10_int) {
                            break L12;
                          } else {
                            var18_int = 0;
                            L14: while (true) {
                              if (var18_int >= var11_int) {
                                var14 = var14 + (var6 - var11_int);
                                var17++;
                                continue L13;
                              } else {
                                incrementValue$11 = var14;
                                var14++;
                                incrementValue$12 = var15;
                                var15++;
                                var7_ref_byte__[incrementValue$11] = var16_ref_byte__[incrementValue$12];
                                var18_int++;
                                continue L14;
                              }
                            }
                          }
                        }
                      } else {
                        var16_ref_byte__ = var26.field_f;
                        var17 = 0;
                        L15: while (true) {
                          if (var17 >= var10_int) {
                            break L12;
                          } else {
                            var18_int = 0;
                            L16: while (true) {
                              if (var18_int >= var11_int) {
                                var14 = var14 + (var6 - var11_int);
                                var17++;
                                continue L15;
                              } else {
                                L17: {
                                  incrementValue$13 = var14;
                                  var14++;
                                  incrementValue$14 = var15;
                                  var15++;
                                  stackOut_15_0 = (byte[]) (var7_ref_byte__);
                                  stackOut_15_1 = incrementValue$13;
                                  stackIn_17_0 = stackOut_15_0;
                                  stackIn_17_1 = stackOut_15_1;
                                  stackIn_16_0 = stackOut_15_0;
                                  stackIn_16_1 = stackOut_15_1;
                                  if (var16_ref_byte__[incrementValue$14] != 0) {
                                    stackOut_17_0 = (byte[]) ((Object) stackIn_17_0);
                                    stackOut_17_1 = stackIn_17_1;
                                    stackOut_17_2 = -1;
                                    stackIn_18_0 = stackOut_17_0;
                                    stackIn_18_1 = stackOut_17_1;
                                    stackIn_18_2 = stackOut_17_2;
                                    break L17;
                                  } else {
                                    stackOut_16_0 = (byte[]) ((Object) stackIn_16_0);
                                    stackOut_16_1 = stackIn_16_1;
                                    stackOut_16_2 = 0;
                                    stackIn_18_0 = stackOut_16_0;
                                    stackIn_18_1 = stackOut_16_1;
                                    stackIn_18_2 = stackOut_16_2;
                                    break L17;
                                  }
                                }
                                stackIn_18_0[stackIn_18_1] = (byte)stackIn_18_2;
                                var18_int++;
                                continue L16;
                              }
                            }
                          }
                        }
                      }
                    }
                    var8++;
                    continue L9;
                  }
                }
              }
            }
            this.field_f.a(7672, ue.field_v);
            this.field_d = param0.c(6, false);
            discarded$15 = this.field_d.a(20480, 20, true);
            var7 = 0;
            L18: while (true) {
              L19: {
                if (var7 >= 4) {
                  break L19;
                } else {
                  L20: {
                    var33 = this.field_d.a(-15730, true);
                    if (var33 == null) {
                      break L20;
                    } else {
                      var34 = this.field_g.a(var33, 127);
                      var10 = this.field_f.a((float)var6, (byte) -33) / (float)var6;
                      var11 = this.field_f.a(105, (float)var6) / (float)var6;
                      var24 = 0;
                      var12 = var24;
                      L21: while (true) {
                        if (var24 >= 256) {
                          var34.a();
                          if (this.field_d.a(true)) {
                            break L19;
                          } else {
                            break L20;
                          }
                        } else {
                          L22: {
                            var13 = param2[var24];
                            var14 = var13.field_a;
                            var15 = var13.field_i;
                            var16 = var13.field_c;
                            var17 = var13.field_d;
                            var18 = (float)(var24 % 16 * var5);
                            var19 = (float)(var24 / 16 * var5);
                            var20 = var18 * var10;
                            var21 = var19 * var11;
                            var22 = (var18 + (float)var15) * var10;
                            var23 = (var19 + (float)var14) * var11;
                            if (!jaclib.memory.Stream.b()) {
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
                              break L22;
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
                              break L22;
                            }
                          }
                          var24++;
                          continue L21;
                        }
                      }
                    }
                  }
                  var7++;
                  continue L18;
                }
              }
              return;
            }
          } else {
            L23: {
              var25 = param2[var6];
              if (var25.field_a <= var5) {
                break L23;
              } else {
                var5 = var25.field_a;
                break L23;
              }
            }
            L24: {
              if (var25.field_i <= var5) {
                break L24;
              } else {
                var5 = var25.field_i;
                break L24;
              }
            }
            var6++;
            continue L0;
          }
        }
    }

    final void a(char param0, int param1, int param2, int param3, boolean param4, aa param5, int param6, int param7) {
    }

    final void fa(char param0, int param1, int param2, int param3, boolean param4) {
        asa var6 = null;
        L0: {
          L1: {
            this.field_g.H(-122);
            this.field_g.a(true, this.field_f);
            if (this.field_e) {
              break L1;
            } else {
              if (!param4) {
                this.field_g.a(ln.field_F, (byte) -110, ln.field_F);
                break L0;
              } else {
                break L1;
              }
            }
          }
          this.field_g.a(iw.field_c, (byte) -110, ln.field_F);
          this.field_g.a(pea.field_c, 0, -121);
          this.field_g.g(3625, param3);
          break L0;
        }
        L2: {
          L3: {
            var6 = this.field_g.y((byte) -77);
            var6.a(false, param1, param2, 0);
            this.field_g.F(-1662);
            this.field_g.a(-128, 0, this.field_d);
            this.field_g.a(this.field_g.field_Db, -32);
            this.field_g.a(2, vs.field_T, param0 * 4, 0);
            if (this.field_e) {
              break L3;
            } else {
              if (!param4) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          this.field_g.a(ej.field_c, 0, -32);
          break L2;
        }
    }
}
