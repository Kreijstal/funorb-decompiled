/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig extends da {
    private tl field_h;
    private boolean field_g;
    private bf field_f;
    private qi field_e;

    final void a(char param0, int param1, int param2, int param3, boolean param4, aa param5, int param6, int param7) {
    }

    ig(bf param0, vs param1, vd[] param2, boolean param3) {
        super(param0, param1);
        int incrementValue$0 = 0;
        byte dupTemp$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        byte[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        byte[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        int var5;
        int var6;
        int[] var7_ref_int__;
        byte[] var7_ref_byte__;
        int var7;
        int var8;
        int[] var8_ref_int__;
        int var9;
        int[] var10_ref_int__;
        int var10_int;
        float var10;
        byte[] var11_ref_byte__;
        int var11_int;
        float var11;
        byte[] var12_ref_byte__;
        int var12;
        int var13_int;
        vd var13;
        int var14;
        int var15;
        int var16;
        byte[] var16_ref_byte__;
        int var17;
        int var18_int;
        float var18;
        int var19_int;
        float var19;
        int var20_int;
        float var20;
        int var21_int;
        float var21;
        float var22;
        float var23;
        int var24;
        vd var25;
        vd var26;
        byte[] var27;
        int[] var28;
        vd var29;
        byte[] var30;
        byte[] var31;
        int[] var32;
        jaclib.memory.Buffer var33;
        jaclib.memory.Stream var34;
        byte[] var35;
        int[] var36;
        byte[] var37;
        byte[] var38;
        int[] var39;
        this.field_f = param0;
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
                    this.field_e = param0.a(var39, var6, 0, false, var6);
                    this.field_g = false;
                    break L1;
                  } else {
                    var29 = param2[var8];
                    var10_ref_int__ = var29.field_f;
                    var37 = var29.field_e;
                    var30 = var37;
                    var11_ref_byte__ = var30;
                    var38 = var29.field_d;
                    var31 = var38;
                    var12_ref_byte__ = var31;
                    var13_int = var29.field_c;
                    var14 = var29.field_h;
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
                              incrementValue$0 = var18_int;
                              var18_int++;
                              dupTemp$1 = var12_ref_byte__[incrementValue$0];
                              var21_int = dupTemp$1;
                              if (dupTemp$1 == 0) {
                                var17++;
                                var20_int++;
                                continue L4;
                              } else {
                                incrementValue$2 = var17;
                                var17++;
                                var7_ref_int__[incrementValue$2] = -16777216 | var10_ref_int__[var21_int & 255];
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
                              incrementValue$3 = var17;
                              var17++;
                              var7_ref_int__[incrementValue$3] = var37[var18_int] << 24 | var10_ref_int__[var38[var18_int] & 255];
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
                var35 = new byte[var6 * var6];
                var27 = var35;
                var7_ref_byte__ = var27;
                var8 = 0;
                L7: while (true) {
                  if (var8 >= 256) {
                    L8: {
                      if (param0.a(la.field_h, 0, ro.field_o)) {
                        this.field_e = param0.a(var35, var6, true, var6, ro.field_o, false);
                        break L8;
                      } else {
                        var36 = new int[var35.length];
                        var28 = var36;
                        var8_ref_int__ = var28;
                        var9 = 0;
                        L9: while (true) {
                          if (var9 >= var35.length) {
                            this.field_e = param0.a(var36, var6, 0, false, var6);
                            break L8;
                          } else {
                            var8_ref_int__[var9] = var35[var9] << 24;
                            var9++;
                            continue L9;
                          }
                        }
                      }
                    }
                    this.field_g = true;
                    break L1;
                  } else {
                    var26 = param2[var8];
                    var10_int = var26.field_c;
                    var11_int = var26.field_h;
                    var12 = var8 % 16 * var5;
                    var13_int = var8 / 16 * var5;
                    var14 = var13_int * var6 + var12;
                    var15 = 0;
                    if (var26.field_e != null) {
                      var16_ref_byte__ = var26.field_e;
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
                              incrementValue$4 = var14;
                              var14++;
                              incrementValue$5 = var15;
                              var15++;
                              var7_ref_byte__[incrementValue$4] = var16_ref_byte__[incrementValue$5];
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
                      var16_ref_byte__ = var26.field_d;
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
                                incrementValue$6 = var14;
                                var14++;
                                incrementValue$7 = var15;
                                var15++;
                                stackIn_18_0 = (byte[]) (var7_ref_byte__);

                                stackIn_18_1 = incrementValue$6;

                                if (var16_ref_byte__[incrementValue$7] != 0) {
                                  stackIn_19_0 = (byte[]) ((Object) stackIn_18_0);
                                  stackIn_19_1 = stackIn_18_1;
                                  stackIn_19_2 = -1;
                                  break L14;
                                } else {
                                  stackIn_19_0 = (byte[]) ((Object) stackIn_18_0);
                                  stackIn_19_1 = stackIn_18_1;
                                  stackIn_19_2 = 0;
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
            this.field_e.a(jp.field_a, -31662);
            this.field_h = param0.a(false, (byte) 126);
            this.field_h.a(20, -121, 20480);
            var7 = 0;
            L15: while (true) {
              L16: {
                if (var7 >= 4) {
                  break L16;
                } else {
                  var33 = this.field_h.a(true, (byte) -126);
                  if (var33 != null) {
                    var34 = this.field_f.a(112, var33);
                    var10 = this.field_e.a(118, (float)var6) / (float)var6;
                    var11 = this.field_e.a((float)var6, (byte) -32) / (float)var6;
                    var24 = 0;
                    var12 = var24;
                    L17: while (true) {
                      if (var24 >= 256) {
                        var34.a();
                        if (this.field_h.a((byte) -60)) {
                          break L16;
                        } else {
                          var7++;
                          continue L15;
                        }
                      } else {
                        var13 = param2[var24];
                        var14 = var13.field_c;
                        var15 = var13.field_h;
                        var16 = var13.field_i;
                        var17 = var13.field_a;
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
              return;
            }
          } else {
            L18: {
              var25 = param2[var6];
              if (var25.field_c <= var5) {
                break L18;
              } else {
                var5 = var25.field_c;
                break L18;
              }
            }
            if (var25.field_h > var5) {
              var5 = var25.field_h;
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
        ec var6;
        L0: {
          L1: {
            this.field_f.x(-23608);
            this.field_f.a(this.field_e, -9135);
            if (this.field_g) {
              break L1;
            } else {
              if (!param4) {
                this.field_f.a(bd.field_C, true, bd.field_C);
                break L0;
              } else {
                break L1;
              }
            }
          }
          this.field_f.a(bd.field_C, true, ru.field_a);
          this.field_f.a((byte) 122, 0, bs.field_a);
          this.field_f.a((byte) -74, param3);
          break L0;
        }
        L2: {
          L3: {
            var6 = this.field_f.y(-108);
            var6.a(0, (byte) 106, param1, param2);
            this.field_f.q((byte) 57);
            this.field_f.a(1, this.field_h, 0);
            this.field_f.a(this.field_f.field_Eb, (byte) 75);
            this.field_f.a(true, qp.field_j, 2, param0 * 4);
            if (this.field_g) {
              break L3;
            } else {
              if (!param4) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          this.field_f.a((byte) 118, 0, dl.field_p);
          break L2;
        }
    }
}
