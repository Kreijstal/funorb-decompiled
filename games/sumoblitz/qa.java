/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa extends ha {
    private int field_s;
    private ce field_n;
    private java.awt.Canvas field_l;
    private int field_z;
    private te field_K;
    private boolean field_J;
    private boolean field_p;
    private int field_A;
    private int field_q;
    private int field_M;
    int field_k;
    private int field_y;
    private int field_x;
    int field_v;
    int[] field_o;
    private int field_G;
    private int field_r;
    int field_D;
    private sd field_u;
    private int field_m;
    private int field_j;
    private hi field_t;
    int field_H;
    private int field_w;
    int field_C;
    private int field_F;
    private int field_B;
    private int field_L;
    private rp[] field_i;
    private sd field_E;
    private static String field_I;

    final void f(int param0) {
        le var4 = null;
        int var5 = 0;
        wm var6 = null;
        int var2 = param0 - ((qa) this).field_A;
        Object var3 = ((qa) this).field_u.b(0);
        while (var3 != null) {
            var4 = (le) var3;
            if (var4.field_p) {
                var4.field_m = var4.field_m + var2;
                var5 = var4.field_m / 20;
                if (var5 > 0) {
                    var6 = ((qa) this).field_h.a(-29193, var4.field_o);
                    var4.a(var6.field_c * var2 * 50 / 1000, var6.field_u * var2 * 50 / 1000);
                    var4.field_m = var4.field_m - var5 * 20;
                }
                var4.field_p = false;
            }
            var3 = ((qa) this).field_u.a((byte) -92);
        }
        ((qa) this).field_A = param0;
        ((qa) this).field_E.a(5, 22663);
        ((qa) this).field_u.a(5, 22663);
    }

    final int XA() {
        return ((qa) this).field_L;
    }

    final int i() {
        return ((qa) this).field_M;
    }

    final void GA(int param0) {
        ((qa) this).aa(0, 0, ((qa) this).field_k, ((qa) this).field_B, param0, 0);
    }

    final void T(int param0, int param1, int param2, int param3) {
        if (((qa) this).field_v < param0) {
            ((qa) this).field_v = param0;
        }
        if (((qa) this).field_H < param1) {
            ((qa) this).field_H = param1;
        }
        if (((qa) this).field_D > param2) {
            ((qa) this).field_D = param2;
        }
        if (((qa) this).field_C > param3) {
            ((qa) this).field_C = param3;
        }
        this.j();
    }

    final boolean a() {
        return false;
    }

    final hr a(ri param0, boolean param1) {
        int[] var3 = null;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        mj var7 = null;
        int[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        byte[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        byte[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        byte[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        byte[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        byte[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int[] stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int[] stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        int[] stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int[] stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        int[] stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        L0: {
          L1: {
            var28 = param0.field_g;
            var24 = var28;
            var20 = var24;
            var16 = var20;
            var3 = var16;
            var4 = param0.field_e;
            var5 = param0.field_h;
            var6 = param0.field_i;
            if (!param1) {
              break L1;
            } else {
              if (param0.field_a != null) {
                break L1;
              } else {
                var30 = new int[var28.length];
                var26 = var30;
                var22 = var26;
                var18 = var22;
                var8 = var18;
                var29 = new byte[var5 * var6];
                var25 = var29;
                var21 = var25;
                var17 = var21;
                var14 = var17;
                var9 = var14;
                var10 = 0;
                L2: while (true) {
                  if (var10 >= var6) {
                    var10 = 0;
                    L3: while (true) {
                      if (var10 >= var28.length) {
                        var7 = (mj) (Object) new uh((qa) this, var29, var30, var5, var6);
                        break L0;
                      } else {
                        var8[var10] = var28[var10];
                        var10++;
                        continue L3;
                      }
                    }
                  } else {
                    var11 = var10 * var5;
                    var12 = 0;
                    L4: while (true) {
                      if (var12 >= var5) {
                        var10++;
                        continue L2;
                      } else {
                        var14[var11 + var12] = var4[var11 + var12];
                        var12++;
                        continue L4;
                      }
                    }
                  }
                }
              }
            }
          }
          var31 = new int[var5 * var6];
          var27 = var31;
          var23 = var27;
          var19 = var23;
          var15 = var19;
          var9 = param0.field_a;
          if (var9 == null) {
            var10 = 0;
            L5: while (true) {
              if (var10 >= var6) {
                var7 = new mj((qa) this, var31, var5, var6);
                break L0;
              } else {
                var11 = var10 * var5;
                var12 = 0;
                L6: while (true) {
                  if (var12 >= var5) {
                    var10++;
                    continue L5;
                  } else {
                    L7: {
                      var13 = var3[var4[var11 + var12] & 255];
                      stackOut_24_0 = (int[]) var15;
                      stackOut_24_1 = var11 + var12;
                      stackIn_26_0 = stackOut_24_0;
                      stackIn_26_1 = stackOut_24_1;
                      stackIn_25_0 = stackOut_24_0;
                      stackIn_25_1 = stackOut_24_1;
                      if (var13 == 0) {
                        stackOut_26_0 = (int[]) (Object) stackIn_26_0;
                        stackOut_26_1 = stackIn_26_1;
                        stackOut_26_2 = 0;
                        stackIn_27_0 = stackOut_26_0;
                        stackIn_27_1 = stackOut_26_1;
                        stackIn_27_2 = stackOut_26_2;
                        break L7;
                      } else {
                        stackOut_25_0 = (int[]) (Object) stackIn_25_0;
                        stackOut_25_1 = stackIn_25_1;
                        stackOut_25_2 = -16777216 | var13;
                        stackIn_27_0 = stackOut_25_0;
                        stackIn_27_1 = stackOut_25_1;
                        stackIn_27_2 = stackOut_25_2;
                        break L7;
                      }
                    }
                    stackIn_27_0[stackIn_27_1] = stackIn_27_2;
                    var12++;
                    continue L6;
                  }
                }
              }
            }
          } else {
            var10 = 0;
            L8: while (true) {
              if (var10 >= var6) {
                var7 = (mj) (Object) new gl((qa) this, var31, var5, var6);
                break L0;
              } else {
                var11 = var10 * var5;
                var12 = 0;
                L9: while (true) {
                  if (var12 >= var5) {
                    var10++;
                    continue L8;
                  } else {
                    var15[var11 + var12] = var3[var4[var11 + var12] & 255] | var9[var11 + var12] << 24;
                    var12++;
                    continue L9;
                  }
                }
              }
            }
          }
        }
        ((hr) (Object) var7).a(param0.field_c, param0.field_d, param0.field_b, param0.field_f);
        return (hr) (Object) var7;
    }

    private qa(d param0) {
        super(param0);
        ((qa) this).field_p = false;
        ((qa) this).field_J = false;
        ((qa) this).field_K = new te(4);
        ((qa) this).field_y = 512;
        ((qa) this).field_D = 0;
        ((qa) this).field_M = 50;
        ((qa) this).field_C = 0;
        ((qa) this).field_G = 512;
        ((qa) this).field_v = 0;
        ((qa) this).field_H = 0;
        ((qa) this).field_L = 3500;
        ((qa) this).field_E = new sd(16);
        try {
            ((qa) this).field_u = new sd(256);
            kn discarded$0 = new kn();
            this.g(1);
            this.d(0);
            kr.a(true, -52, true);
            ((qa) this).field_J = true;
            ((qa) this).field_A = (int)wq.a(-48);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            ((qa) this).a((byte) -34);
            throw new RuntimeException("");
        }
    }

    final void s(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
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
        if (param2 != 0) {
          L0: {
            if (param2 >= 0) {
              break L0;
            } else {
              param2 = -param2;
              break L0;
            }
          }
          L1: {
            if (((qa) this).field_D <= ((qa) this).field_v) {
              break L1;
            } else {
              if (((qa) this).field_C > ((qa) this).field_H) {
                if (param0 + param2 < ((qa) this).field_v) {
                  break L1;
                } else {
                  L2: {
                    if (param0 - param2 >= ((qa) this).field_D) {
                      break L2;
                    } else {
                      if (param1 + param2 < ((qa) this).field_H) {
                        break L2;
                      } else {
                        if (param1 - param2 < ((qa) this).field_C) {
                          L3: {
                            L4: {
                              var6 = param0 + param1 * ((qa) this).field_k;
                              var7 = var6;
                              var8 = var6 - param2 * ((qa) this).field_k;
                              var9 = var6 + param2 * ((qa) this).field_k;
                              var10 = param2;
                              var11 = 0;
                              param2 = param2 * param2;
                              var12 = param2 - var10;
                              var13 = param3 >>> 24;
                              if (param4 == 0) {
                                break L4;
                              } else {
                                L5: {
                                  if (param4 != 1) {
                                    break L5;
                                  } else {
                                    if (var13 != 255) {
                                      break L5;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                                if (param4 != 1) {
                                  if (param4 != 2) {
                                    return;
                                  } else {
                                    L6: {
                                      if (param0 - var10 < ((qa) this).field_v) {
                                        break L6;
                                      } else {
                                        if (param0 + var10 >= ((qa) this).field_D) {
                                          break L6;
                                        } else {
                                          if (param1 - var10 < ((qa) this).field_H) {
                                            break L6;
                                          } else {
                                            if (param1 + var10 < ((qa) this).field_C) {
                                              var14 = var6 - var10;
                                              var15 = param3;
                                              var16 = ((qa) this).field_o[var14];
                                              var17 = var15 + var16;
                                              var18 = (var15 & 16711935) + (var16 & 16711935);
                                              var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                              ((qa) this).field_o[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                              var14 = var6 + var10;
                                              var15 = param3;
                                              var16 = ((qa) this).field_o[var14];
                                              var17 = var15 + var16;
                                              var18 = (var15 & 16711935) + (var16 & 16711935);
                                              var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                              ((qa) this).field_o[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                              var14 = var8;
                                              var15 = param3;
                                              var16 = ((qa) this).field_o[var14];
                                              var17 = var15 + var16;
                                              var18 = (var15 & 16711935) + (var16 & 16711935);
                                              var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                              ((qa) this).field_o[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                              var14 = var9;
                                              var15 = param3;
                                              var16 = ((qa) this).field_o[var14];
                                              var17 = var15 + var16;
                                              var18 = (var15 & 16711935) + (var16 & 16711935);
                                              var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                              ((qa) this).field_o[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                              L7: while (true) {
                                                L8: {
                                                  var11++;
                                                  var12 = var12 + (var11 + var11);
                                                  var6 = var6 - ((qa) this).field_k;
                                                  var7 = var7 + ((qa) this).field_k;
                                                  if (var12 <= param2) {
                                                    break L8;
                                                  } else {
                                                    var10--;
                                                    var12 = var12 - (var10 + var10);
                                                    var8 = var8 + ((qa) this).field_k;
                                                    var9 = var9 - ((qa) this).field_k;
                                                    break L8;
                                                  }
                                                }
                                                if (var10 >= var11) {
                                                  var14 = var8 - var11;
                                                  var15 = param3;
                                                  var16 = ((qa) this).field_o[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  ((qa) this).field_o[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  var14 = var8 + var11;
                                                  var15 = param3;
                                                  var16 = ((qa) this).field_o[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  ((qa) this).field_o[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  var14 = var6 - var10;
                                                  var15 = param3;
                                                  var16 = ((qa) this).field_o[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  ((qa) this).field_o[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  var14 = var6 + var10;
                                                  var15 = param3;
                                                  var16 = ((qa) this).field_o[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  ((qa) this).field_o[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  var14 = var7 - var10;
                                                  var15 = param3;
                                                  var16 = ((qa) this).field_o[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  ((qa) this).field_o[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  var14 = var7 + var10;
                                                  var15 = param3;
                                                  var16 = ((qa) this).field_o[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  ((qa) this).field_o[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  var14 = var9 - var11;
                                                  var15 = param3;
                                                  var16 = ((qa) this).field_o[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  ((qa) this).field_o[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  var14 = var9 + var11;
                                                  var15 = param3;
                                                  var16 = ((qa) this).field_o[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  ((qa) this).field_o[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  continue L7;
                                                } else {
                                                  break L3;
                                                }
                                              }
                                            } else {
                                              break L6;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L9: {
                                      if (param0 - var10 < ((qa) this).field_v) {
                                        break L9;
                                      } else {
                                        if (param1 < ((qa) this).field_H) {
                                          break L9;
                                        } else {
                                          if (param1 >= ((qa) this).field_C) {
                                            break L9;
                                          } else {
                                            var14 = var6 - var10;
                                            var15 = param3;
                                            var16 = ((qa) this).field_o[var14];
                                            var17 = var15 + var16;
                                            var18 = (var15 & 16711935) + (var16 & 16711935);
                                            var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                            ((qa) this).field_o[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                            break L9;
                                          }
                                        }
                                      }
                                    }
                                    L10: {
                                      if (param0 + var10 >= ((qa) this).field_D) {
                                        break L10;
                                      } else {
                                        if (param1 < ((qa) this).field_H) {
                                          break L10;
                                        } else {
                                          if (param1 >= ((qa) this).field_C) {
                                            break L10;
                                          } else {
                                            var14 = var6 + var10;
                                            var15 = param3;
                                            var16 = ((qa) this).field_o[var14];
                                            var17 = var15 + var16;
                                            var18 = (var15 & 16711935) + (var16 & 16711935);
                                            var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                            ((qa) this).field_o[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                            break L10;
                                          }
                                        }
                                      }
                                    }
                                    L11: {
                                      if (param1 - var10 < ((qa) this).field_H) {
                                        break L11;
                                      } else {
                                        if (param0 < ((qa) this).field_v) {
                                          break L11;
                                        } else {
                                          if (param0 >= ((qa) this).field_D) {
                                            break L11;
                                          } else {
                                            var14 = var8;
                                            var15 = param3;
                                            var16 = ((qa) this).field_o[var14];
                                            var17 = var15 + var16;
                                            var18 = (var15 & 16711935) + (var16 & 16711935);
                                            var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                            ((qa) this).field_o[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                            break L11;
                                          }
                                        }
                                      }
                                    }
                                    L12: {
                                      if (param1 + var10 >= ((qa) this).field_C) {
                                        break L12;
                                      } else {
                                        if (param0 < ((qa) this).field_v) {
                                          break L12;
                                        } else {
                                          if (param0 >= ((qa) this).field_D) {
                                            break L12;
                                          } else {
                                            var14 = var9;
                                            var15 = param3;
                                            var16 = ((qa) this).field_o[var14];
                                            var17 = var15 + var16;
                                            var18 = (var15 & 16711935) + (var16 & 16711935);
                                            var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                            ((qa) this).field_o[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                            break L12;
                                          }
                                        }
                                      }
                                    }
                                    L13: while (true) {
                                      L14: {
                                        var11++;
                                        var12 = var12 + (var11 + var11);
                                        var6 = var6 - ((qa) this).field_k;
                                        var7 = var7 + ((qa) this).field_k;
                                        if (var12 <= param2) {
                                          break L14;
                                        } else {
                                          var10--;
                                          var12 = var12 - (var10 + var10);
                                          var8 = var8 + ((qa) this).field_k;
                                          var9 = var9 - ((qa) this).field_k;
                                          break L14;
                                        }
                                      }
                                      if (var10 >= var11) {
                                        L15: {
                                          if (param1 - var10 < ((qa) this).field_H) {
                                            break L15;
                                          } else {
                                            if (param1 - var10 >= ((qa) this).field_C) {
                                              break L15;
                                            } else {
                                              L16: {
                                                if (param0 - var11 < ((qa) this).field_v) {
                                                  break L16;
                                                } else {
                                                  if (param0 - var11 >= ((qa) this).field_D) {
                                                    break L16;
                                                  } else {
                                                    var14 = var8 - var11;
                                                    var15 = param3;
                                                    var16 = ((qa) this).field_o[var14];
                                                    var17 = var15 + var16;
                                                    var18 = (var15 & 16711935) + (var16 & 16711935);
                                                    var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                    ((qa) this).field_o[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                    break L16;
                                                  }
                                                }
                                              }
                                              if (param0 + var11 < ((qa) this).field_v) {
                                                break L15;
                                              } else {
                                                if (param0 + var11 >= ((qa) this).field_D) {
                                                  break L15;
                                                } else {
                                                  var14 = var8 + var11;
                                                  var15 = param3;
                                                  var16 = ((qa) this).field_o[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  ((qa) this).field_o[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  break L15;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        L17: {
                                          if (param1 - var11 < ((qa) this).field_H) {
                                            break L17;
                                          } else {
                                            if (param1 - var11 >= ((qa) this).field_C) {
                                              break L17;
                                            } else {
                                              L18: {
                                                if (param0 - var10 < ((qa) this).field_v) {
                                                  break L18;
                                                } else {
                                                  if (param0 - var10 >= ((qa) this).field_D) {
                                                    break L18;
                                                  } else {
                                                    var14 = var6 - var10;
                                                    var15 = param3;
                                                    var16 = ((qa) this).field_o[var14];
                                                    var17 = var15 + var16;
                                                    var18 = (var15 & 16711935) + (var16 & 16711935);
                                                    var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                    ((qa) this).field_o[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                    break L18;
                                                  }
                                                }
                                              }
                                              if (param0 + var10 < ((qa) this).field_v) {
                                                break L17;
                                              } else {
                                                if (param0 + var10 >= ((qa) this).field_D) {
                                                  break L17;
                                                } else {
                                                  var14 = var6 + var10;
                                                  var15 = param3;
                                                  var16 = ((qa) this).field_o[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  ((qa) this).field_o[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  break L17;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        L19: {
                                          if (param1 + var11 < ((qa) this).field_H) {
                                            break L19;
                                          } else {
                                            if (param1 + var11 >= ((qa) this).field_C) {
                                              break L19;
                                            } else {
                                              L20: {
                                                if (param0 - var10 < ((qa) this).field_v) {
                                                  break L20;
                                                } else {
                                                  if (param0 - var10 >= ((qa) this).field_D) {
                                                    break L20;
                                                  } else {
                                                    var14 = var7 - var10;
                                                    var15 = param3;
                                                    var16 = ((qa) this).field_o[var14];
                                                    var17 = var15 + var16;
                                                    var18 = (var15 & 16711935) + (var16 & 16711935);
                                                    var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                    ((qa) this).field_o[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                    break L20;
                                                  }
                                                }
                                              }
                                              if (param0 + var10 < ((qa) this).field_v) {
                                                break L19;
                                              } else {
                                                if (param0 + var10 >= ((qa) this).field_D) {
                                                  break L19;
                                                } else {
                                                  var14 = var7 + var10;
                                                  var15 = param3;
                                                  var16 = ((qa) this).field_o[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  ((qa) this).field_o[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  break L19;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        if (param1 + var10 < ((qa) this).field_H) {
                                          continue L13;
                                        } else {
                                          if (param1 + var10 >= ((qa) this).field_C) {
                                            continue L13;
                                          } else {
                                            L21: {
                                              if (param0 - var11 < ((qa) this).field_v) {
                                                break L21;
                                              } else {
                                                if (param0 - var11 >= ((qa) this).field_D) {
                                                  break L21;
                                                } else {
                                                  var14 = var9 - var11;
                                                  var15 = param3;
                                                  var16 = ((qa) this).field_o[var14];
                                                  var17 = var15 + var16;
                                                  var18 = (var15 & 16711935) + (var16 & 16711935);
                                                  var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                  ((qa) this).field_o[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                  break L21;
                                                }
                                              }
                                            }
                                            if (param0 + var11 < ((qa) this).field_v) {
                                              continue L13;
                                            } else {
                                              if (param0 + var11 >= ((qa) this).field_D) {
                                                continue L13;
                                              } else {
                                                var14 = var9 + var11;
                                                var15 = param3;
                                                var16 = ((qa) this).field_o[var14];
                                                var17 = var15 + var16;
                                                var18 = (var15 & 16711935) + (var16 & 16711935);
                                                var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                                ((qa) this).field_o[var14] = var17 - var16 | var16 - (var16 >>> 8);
                                                continue L13;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        break L3;
                                      }
                                    }
                                  }
                                } else {
                                  L22: {
                                    if (param0 - var10 < ((qa) this).field_v) {
                                      break L22;
                                    } else {
                                      if (param0 + var10 >= ((qa) this).field_D) {
                                        break L22;
                                      } else {
                                        if (param1 - var10 < ((qa) this).field_H) {
                                          break L22;
                                        } else {
                                          if (param1 + var10 < ((qa) this).field_C) {
                                            var14 = var6 - var10;
                                            var15 = param3;
                                            var16 = var13;
                                            var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                            var17 = 256 - var16;
                                            var18 = ((qa) this).field_o[var14];
                                            var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                            ((qa) this).field_o[var14] = var15 + var18;
                                            var14 = var6 + var10;
                                            var15 = param3;
                                            var16 = var13;
                                            var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                            var17 = 256 - var16;
                                            var18 = ((qa) this).field_o[var14];
                                            var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                            ((qa) this).field_o[var14] = var15 + var18;
                                            var14 = var8;
                                            var15 = param3;
                                            var16 = var13;
                                            var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                            var17 = 256 - var16;
                                            var18 = ((qa) this).field_o[var14];
                                            var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                            ((qa) this).field_o[var14] = var15 + var18;
                                            var14 = var9;
                                            var15 = param3;
                                            var16 = var13;
                                            var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                            var17 = 256 - var16;
                                            var18 = ((qa) this).field_o[var14];
                                            var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                            ((qa) this).field_o[var14] = var15 + var18;
                                            L23: while (true) {
                                              L24: {
                                                var11++;
                                                var12 = var12 + (var11 + var11);
                                                var6 = var6 - ((qa) this).field_k;
                                                var7 = var7 + ((qa) this).field_k;
                                                if (var12 <= param2) {
                                                  break L24;
                                                } else {
                                                  var10--;
                                                  var12 = var12 - (var10 + var10);
                                                  var8 = var8 + ((qa) this).field_k;
                                                  var9 = var9 - ((qa) this).field_k;
                                                  break L24;
                                                }
                                              }
                                              if (var10 >= var11) {
                                                var14 = var8 - var11;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = ((qa) this).field_o[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                ((qa) this).field_o[var14] = var15 + var18;
                                                var14 = var8 + var11;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = ((qa) this).field_o[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                ((qa) this).field_o[var14] = var15 + var18;
                                                var14 = var6 - var10;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = ((qa) this).field_o[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                ((qa) this).field_o[var14] = var15 + var18;
                                                var14 = var6 + var10;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = ((qa) this).field_o[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                ((qa) this).field_o[var14] = var15 + var18;
                                                var14 = var7 - var10;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = ((qa) this).field_o[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                ((qa) this).field_o[var14] = var15 + var18;
                                                var14 = var7 + var10;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = ((qa) this).field_o[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                ((qa) this).field_o[var14] = var15 + var18;
                                                var14 = var9 - var11;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = ((qa) this).field_o[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                ((qa) this).field_o[var14] = var15 + var18;
                                                var14 = var9 + var11;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = ((qa) this).field_o[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                ((qa) this).field_o[var14] = var15 + var18;
                                                continue L23;
                                              } else {
                                                break L3;
                                              }
                                            }
                                          } else {
                                            break L22;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L25: {
                                    if (param0 - var10 < ((qa) this).field_v) {
                                      break L25;
                                    } else {
                                      if (param1 < ((qa) this).field_H) {
                                        break L25;
                                      } else {
                                        if (param1 >= ((qa) this).field_C) {
                                          break L25;
                                        } else {
                                          var14 = var6 - var10;
                                          var15 = param3;
                                          var16 = var13;
                                          var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                          var17 = 256 - var16;
                                          var18 = ((qa) this).field_o[var14];
                                          var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                          ((qa) this).field_o[var14] = var15 + var18;
                                          break L25;
                                        }
                                      }
                                    }
                                  }
                                  L26: {
                                    if (param0 + var10 >= ((qa) this).field_D) {
                                      break L26;
                                    } else {
                                      if (param1 < ((qa) this).field_H) {
                                        break L26;
                                      } else {
                                        if (param1 >= ((qa) this).field_C) {
                                          break L26;
                                        } else {
                                          var14 = var6 + var10;
                                          var15 = param3;
                                          var16 = var13;
                                          var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                          var17 = 256 - var16;
                                          var18 = ((qa) this).field_o[var14];
                                          var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                          ((qa) this).field_o[var14] = var15 + var18;
                                          break L26;
                                        }
                                      }
                                    }
                                  }
                                  L27: {
                                    if (param1 - var10 < ((qa) this).field_H) {
                                      break L27;
                                    } else {
                                      if (param0 < ((qa) this).field_v) {
                                        break L27;
                                      } else {
                                        if (param0 >= ((qa) this).field_D) {
                                          break L27;
                                        } else {
                                          var14 = var8;
                                          var15 = param3;
                                          var16 = var13;
                                          var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                          var17 = 256 - var16;
                                          var18 = ((qa) this).field_o[var14];
                                          var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                          ((qa) this).field_o[var14] = var15 + var18;
                                          break L27;
                                        }
                                      }
                                    }
                                  }
                                  L28: {
                                    if (param1 + var10 >= ((qa) this).field_C) {
                                      break L28;
                                    } else {
                                      if (param0 < ((qa) this).field_v) {
                                        break L28;
                                      } else {
                                        if (param0 >= ((qa) this).field_D) {
                                          break L28;
                                        } else {
                                          var14 = var9;
                                          var15 = param3;
                                          var16 = var13;
                                          var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                          var17 = 256 - var16;
                                          var18 = ((qa) this).field_o[var14];
                                          var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                          ((qa) this).field_o[var14] = var15 + var18;
                                          break L28;
                                        }
                                      }
                                    }
                                  }
                                  L29: while (true) {
                                    L30: {
                                      var11++;
                                      var12 = var12 + (var11 + var11);
                                      var6 = var6 - ((qa) this).field_k;
                                      var7 = var7 + ((qa) this).field_k;
                                      if (var12 <= param2) {
                                        break L30;
                                      } else {
                                        var10--;
                                        var12 = var12 - (var10 + var10);
                                        var8 = var8 + ((qa) this).field_k;
                                        var9 = var9 - ((qa) this).field_k;
                                        break L30;
                                      }
                                    }
                                    if (var10 >= var11) {
                                      L31: {
                                        if (param1 - var10 < ((qa) this).field_H) {
                                          break L31;
                                        } else {
                                          if (param1 - var10 >= ((qa) this).field_C) {
                                            break L31;
                                          } else {
                                            L32: {
                                              if (param0 - var11 < ((qa) this).field_v) {
                                                break L32;
                                              } else {
                                                if (param0 - var11 >= ((qa) this).field_D) {
                                                  break L32;
                                                } else {
                                                  var14 = var8 - var11;
                                                  var15 = param3;
                                                  var16 = var13;
                                                  var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                  var17 = 256 - var16;
                                                  var18 = ((qa) this).field_o[var14];
                                                  var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                  ((qa) this).field_o[var14] = var15 + var18;
                                                  break L32;
                                                }
                                              }
                                            }
                                            if (param0 + var11 < ((qa) this).field_v) {
                                              break L31;
                                            } else {
                                              if (param0 + var11 >= ((qa) this).field_D) {
                                                break L31;
                                              } else {
                                                var14 = var8 + var11;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = ((qa) this).field_o[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                ((qa) this).field_o[var14] = var15 + var18;
                                                break L31;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      L33: {
                                        if (param1 - var11 < ((qa) this).field_H) {
                                          break L33;
                                        } else {
                                          if (param1 - var11 >= ((qa) this).field_C) {
                                            break L33;
                                          } else {
                                            L34: {
                                              if (param0 - var10 < ((qa) this).field_v) {
                                                break L34;
                                              } else {
                                                if (param0 - var10 >= ((qa) this).field_D) {
                                                  break L34;
                                                } else {
                                                  var14 = var6 - var10;
                                                  var15 = param3;
                                                  var16 = var13;
                                                  var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                  var17 = 256 - var16;
                                                  var18 = ((qa) this).field_o[var14];
                                                  var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                  ((qa) this).field_o[var14] = var15 + var18;
                                                  break L34;
                                                }
                                              }
                                            }
                                            if (param0 + var10 < ((qa) this).field_v) {
                                              break L33;
                                            } else {
                                              if (param0 + var10 >= ((qa) this).field_D) {
                                                break L33;
                                              } else {
                                                var14 = var6 + var10;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = ((qa) this).field_o[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                ((qa) this).field_o[var14] = var15 + var18;
                                                break L33;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      L35: {
                                        if (param1 + var11 < ((qa) this).field_H) {
                                          break L35;
                                        } else {
                                          if (param1 + var11 >= ((qa) this).field_C) {
                                            break L35;
                                          } else {
                                            L36: {
                                              if (param0 - var10 < ((qa) this).field_v) {
                                                break L36;
                                              } else {
                                                if (param0 - var10 >= ((qa) this).field_D) {
                                                  break L36;
                                                } else {
                                                  var14 = var7 - var10;
                                                  var15 = param3;
                                                  var16 = var13;
                                                  var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                  var17 = 256 - var16;
                                                  var18 = ((qa) this).field_o[var14];
                                                  var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                  ((qa) this).field_o[var14] = var15 + var18;
                                                  break L36;
                                                }
                                              }
                                            }
                                            if (param0 + var10 < ((qa) this).field_v) {
                                              break L35;
                                            } else {
                                              if (param0 + var10 >= ((qa) this).field_D) {
                                                break L35;
                                              } else {
                                                var14 = var7 + var10;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = ((qa) this).field_o[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                ((qa) this).field_o[var14] = var15 + var18;
                                                break L35;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      if (param1 + var10 < ((qa) this).field_H) {
                                        continue L29;
                                      } else {
                                        if (param1 + var10 >= ((qa) this).field_C) {
                                          continue L29;
                                        } else {
                                          L37: {
                                            if (param0 - var11 < ((qa) this).field_v) {
                                              break L37;
                                            } else {
                                              if (param0 - var11 >= ((qa) this).field_D) {
                                                break L37;
                                              } else {
                                                var14 = var9 - var11;
                                                var15 = param3;
                                                var16 = var13;
                                                var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                                var17 = 256 - var16;
                                                var18 = ((qa) this).field_o[var14];
                                                var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                                ((qa) this).field_o[var14] = var15 + var18;
                                                break L37;
                                              }
                                            }
                                          }
                                          if (param0 + var11 < ((qa) this).field_v) {
                                            continue L29;
                                          } else {
                                            if (param0 + var11 >= ((qa) this).field_D) {
                                              continue L29;
                                            } else {
                                              var14 = var9 + var11;
                                              var15 = param3;
                                              var16 = var13;
                                              var15 = ((var15 & 16711935) * var16 >> 8 & 16711935) + ((var15 & 65280) * var16 >> 8 & 65280) + (var16 << 24);
                                              var17 = 256 - var16;
                                              var18 = ((qa) this).field_o[var14];
                                              var18 = ((var18 & 16711935) * var17 >> 8 & 16711935) + ((var18 & 65280) * var17 >> 8 & 65280);
                                              ((qa) this).field_o[var14] = var15 + var18;
                                              continue L29;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      break L3;
                                    }
                                  }
                                }
                              }
                            }
                            L38: {
                              if (param0 - var10 >= ((qa) this).field_v) {
                                if (param0 - var10 >= ((qa) this).field_v) {
                                  if (param1 < ((qa) this).field_H) {
                                    break L38;
                                  } else {
                                    if (param1 >= ((qa) this).field_C) {
                                      break L38;
                                    } else {
                                      ((qa) this).field_o[var6 - var10] = param3;
                                      break L38;
                                    }
                                  }
                                } else {
                                  if (param0 - var10 < ((qa) this).field_v) {
                                    break L38;
                                  } else {
                                    if (param1 < ((qa) this).field_H) {
                                      break L38;
                                    } else {
                                      if (param1 >= ((qa) this).field_C) {
                                        break L38;
                                      } else {
                                        ((qa) this).field_o[var6 - var10] = param3;
                                        break L38;
                                      }
                                    }
                                  }
                                }
                              } else {
                                if (param0 - var10 >= ((qa) this).field_v) {
                                  if (param1 < ((qa) this).field_H) {
                                    break L38;
                                  } else {
                                    if (param1 >= ((qa) this).field_C) {
                                      break L38;
                                    } else {
                                      ((qa) this).field_o[var6 - var10] = param3;
                                      break L38;
                                    }
                                  }
                                } else {
                                  if (param0 - var10 < ((qa) this).field_v) {
                                    break L38;
                                  } else {
                                    if (param1 < ((qa) this).field_H) {
                                      break L38;
                                    } else {
                                      if (param1 >= ((qa) this).field_C) {
                                        break L38;
                                      } else {
                                        ((qa) this).field_o[var6 - var10] = param3;
                                        break L38;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            L39: {
                              if (param0 + var10 < ((qa) this).field_D) {
                                if (param1 >= ((qa) this).field_H) {
                                  if (param1 < ((qa) this).field_C) {
                                    ((qa) this).field_o[var6 + var10] = param3;
                                    if (param1 - var10 < ((qa) this).field_H) {
                                      break L39;
                                    } else {
                                      if (param0 < ((qa) this).field_v) {
                                        break L39;
                                      } else {
                                        if (param0 >= ((qa) this).field_D) {
                                          break L39;
                                        } else {
                                          ((qa) this).field_o[var8] = param3;
                                          break L39;
                                        }
                                      }
                                    }
                                  } else {
                                    if (param1 - var10 < ((qa) this).field_H) {
                                      break L39;
                                    } else {
                                      if (param0 < ((qa) this).field_v) {
                                        break L39;
                                      } else {
                                        if (param0 >= ((qa) this).field_D) {
                                          break L39;
                                        } else {
                                          ((qa) this).field_o[var8] = param3;
                                          break L39;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  if (param1 - var10 < ((qa) this).field_H) {
                                    break L39;
                                  } else {
                                    if (param0 < ((qa) this).field_v) {
                                      break L39;
                                    } else {
                                      if (param0 >= ((qa) this).field_D) {
                                        break L39;
                                      } else {
                                        ((qa) this).field_o[var8] = param3;
                                        break L39;
                                      }
                                    }
                                  }
                                }
                              } else {
                                if (param1 - var10 < ((qa) this).field_H) {
                                  break L39;
                                } else {
                                  if (param0 < ((qa) this).field_v) {
                                    break L39;
                                  } else {
                                    if (param0 >= ((qa) this).field_D) {
                                      break L39;
                                    } else {
                                      ((qa) this).field_o[var8] = param3;
                                      break L39;
                                    }
                                  }
                                }
                              }
                            }
                            L40: {
                              if (param1 + var10 >= ((qa) this).field_C) {
                                break L40;
                              } else {
                                if (param0 < ((qa) this).field_v) {
                                  break L40;
                                } else {
                                  if (param0 >= ((qa) this).field_D) {
                                    break L40;
                                  } else {
                                    ((qa) this).field_o[var9] = param3;
                                    break L40;
                                  }
                                }
                              }
                            }
                            L41: while (true) {
                              L42: {
                                var11++;
                                var12 = var12 + (var11 + var11);
                                var6 = var6 - ((qa) this).field_k;
                                var7 = var7 + ((qa) this).field_k;
                                if (var12 <= param2) {
                                  break L42;
                                } else {
                                  var10--;
                                  var12 = var12 - (var10 + var10);
                                  var8 = var8 + ((qa) this).field_k;
                                  var9 = var9 - ((qa) this).field_k;
                                  break L42;
                                }
                              }
                              if (var10 >= var11) {
                                L43: {
                                  if (param1 - var10 < ((qa) this).field_H) {
                                    break L43;
                                  } else {
                                    if (param1 - var10 >= ((qa) this).field_C) {
                                      break L43;
                                    } else {
                                      if (param0 - var11 < ((qa) this).field_v) {
                                        if (param0 + var11 >= ((qa) this).field_v) {
                                          if (param0 + var11 >= ((qa) this).field_D) {
                                            break L43;
                                          } else {
                                            ((qa) this).field_o[var8 + var11] = param3;
                                            break L43;
                                          }
                                        } else {
                                          if (param0 + var11 < ((qa) this).field_v) {
                                            break L43;
                                          } else {
                                            if (param0 + var11 >= ((qa) this).field_D) {
                                              break L43;
                                            } else {
                                              ((qa) this).field_o[var8 + var11] = param3;
                                              break L43;
                                            }
                                          }
                                        }
                                      } else {
                                        if (param0 + var11 < ((qa) this).field_v) {
                                          break L43;
                                        } else {
                                          if (param0 + var11 >= ((qa) this).field_D) {
                                            break L43;
                                          } else {
                                            ((qa) this).field_o[var8 + var11] = param3;
                                            break L43;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                L44: {
                                  if (param1 - var11 < ((qa) this).field_H) {
                                    break L44;
                                  } else {
                                    if (param1 - var11 >= ((qa) this).field_C) {
                                      break L44;
                                    } else {
                                      L45: {
                                        if (param0 - var10 < ((qa) this).field_v) {
                                          break L45;
                                        } else {
                                          if (param0 - var10 >= ((qa) this).field_D) {
                                            break L45;
                                          } else {
                                            ((qa) this).field_o[var6 - var10] = param3;
                                            break L45;
                                          }
                                        }
                                      }
                                      if (param0 + var10 < ((qa) this).field_v) {
                                        break L44;
                                      } else {
                                        if (param0 + var10 >= ((qa) this).field_D) {
                                          break L44;
                                        } else {
                                          ((qa) this).field_o[var6 + var10] = param3;
                                          break L44;
                                        }
                                      }
                                    }
                                  }
                                }
                                L46: {
                                  if (param1 + var11 < ((qa) this).field_H) {
                                    break L46;
                                  } else {
                                    if (param1 + var11 >= ((qa) this).field_C) {
                                      break L46;
                                    } else {
                                      L47: {
                                        if (param0 - var10 < ((qa) this).field_v) {
                                          break L47;
                                        } else {
                                          if (param0 - var10 >= ((qa) this).field_D) {
                                            break L47;
                                          } else {
                                            ((qa) this).field_o[var7 - var10] = param3;
                                            break L47;
                                          }
                                        }
                                      }
                                      if (param0 + var10 < ((qa) this).field_v) {
                                        break L46;
                                      } else {
                                        if (param0 + var10 >= ((qa) this).field_D) {
                                          break L46;
                                        } else {
                                          ((qa) this).field_o[var7 + var10] = param3;
                                          break L46;
                                        }
                                      }
                                    }
                                  }
                                }
                                if (param1 + var10 < ((qa) this).field_H) {
                                  continue L41;
                                } else {
                                  if (param1 + var10 >= ((qa) this).field_C) {
                                    continue L41;
                                  } else {
                                    L48: {
                                      if (param0 - var11 < ((qa) this).field_v) {
                                        break L48;
                                      } else {
                                        if (param0 - var11 >= ((qa) this).field_D) {
                                          break L48;
                                        } else {
                                          ((qa) this).field_o[var9 - var11] = param3;
                                          break L48;
                                        }
                                      }
                                    }
                                    if (param0 + var11 < ((qa) this).field_v) {
                                      continue L41;
                                    } else {
                                      if (param0 + var11 >= ((qa) this).field_D) {
                                        continue L41;
                                      } else {
                                        ((qa) this).field_o[var9 + var11] = param3;
                                        continue L41;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          return;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                return;
              }
            }
          }
          return;
        } else {
          L49: {
            if (param0 < ((qa) this).field_v) {
              break L49;
            } else {
              L50: {
                if (param1 < ((qa) this).field_H) {
                  break L50;
                } else {
                  if (param0 >= ((qa) this).field_D) {
                    break L50;
                  } else {
                    if (param1 < ((qa) this).field_C) {
                      L51: {
                        L52: {
                          var6 = param3 >>> 24;
                          var7 = param0 + param1 * ((qa) this).field_k;
                          if (param4 == 0) {
                            break L52;
                          } else {
                            L53: {
                              if (param4 != 1) {
                                break L53;
                              } else {
                                if (var6 != 255) {
                                  break L53;
                                } else {
                                  break L52;
                                }
                              }
                            }
                            if (param4 != 1) {
                              if (param4 != 2) {
                                break L49;
                              } else {
                                var8 = var7;
                                var9 = param3;
                                var10 = ((qa) this).field_o[var8];
                                var11 = var9 + var10;
                                var12 = (var9 & 16711935) + (var10 & 16711935);
                                var10 = (var12 & 16777472) + (var11 - var12 & 65536);
                                ((qa) this).field_o[var8] = var11 - var10 | var10 - (var10 >>> 8);
                                break L51;
                              }
                            } else {
                              var8 = var7;
                              var9 = param3;
                              var10 = var6;
                              var9 = ((var9 & 16711935) * var10 >> 8 & 16711935) + ((var9 & 65280) * var10 >> 8 & 65280) + (var10 << 24);
                              var11 = 256 - var10;
                              var12 = ((qa) this).field_o[var8];
                              var12 = ((var12 & 16711935) * var11 >> 8 & 16711935) + ((var12 & 65280) * var11 >> 8 & 65280);
                              ((qa) this).field_o[var8] = var9 + var12;
                              break L51;
                            }
                          }
                        }
                        ((qa) this).field_o[var7] = param3;
                        break L51;
                      }
                      return;
                    } else {
                      break L50;
                    }
                  }
                }
              }
              return;
            }
          }
          return;
        }
    }

    private final rp a(Runnable param0) {
        int var2 = 0;
        var2 = 0;
        L0: while (true) {
          if (var2 < ((qa) this).field_r) {
            if (((qa) this).field_i[var2].field_e != param0) {
              var2++;
              continue L0;
            } else {
              return ((qa) this).field_i[var2];
            }
          } else {
            return null;
          }
        }
    }

    final void K(int[] param0) {
        param0[0] = ((qa) this).field_v;
        param0[1] = ((qa) this).field_H;
        param0[2] = ((qa) this).field_D;
        param0[3] = ((qa) this).field_C;
    }

    private final void j() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        for (var1 = 0; var1 < ((qa) this).field_r; var1++) {
        }
        var1 = ((qa) this).field_H * ((qa) this).field_k + ((qa) this).field_v;
        for (var2 = ((qa) this).field_H; var2 < ((qa) this).field_C; var2++) {
            for (var3 = 0; var3 < ((qa) this).field_r; var3++) {
                ((qa) this).field_i[var3].field_c.field_a[var2 - ((qa) this).field_H] = var1;
            }
            var1 = var1 + ((qa) this).field_k;
        }
    }

    final boolean c() {
        return false;
    }

    final void a(vc param0) {
        hi var2 = (hi) (Object) param0;
        ((qa) this).field_k = var2.field_d;
        ((qa) this).field_B = var2.field_a;
        ((qa) this).field_o = var2.field_c;
        ((qa) this).field_t = var2;
        ((qa) this).field_x = var2.field_d;
        ((qa) this).field_m = var2.field_a;
        this.h();
    }

    private final void g() {
        ((qa) this).field_v = 0;
        ((qa) this).field_H = 0;
        ((qa) this).field_D = ((qa) this).field_k;
        ((qa) this).field_C = ((qa) this).field_B;
        this.j();
    }

    final za c(int param0) {
        return null;
    }

    final hr a(int[] param0, int param1, int param2, int param3, int param4, boolean param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var7 = 0;
        var8 = param1;
        var9 = 0;
        L0: while (true) {
          L1: {
            if (var9 >= param4) {
              break L1;
            } else {
              var10 = 0;
              L2: while (true) {
                if (var10 >= param3) {
                  var9++;
                  continue L0;
                } else {
                  var8++;
                  var11 = param0[var8] >>> 24;
                  if (var11 != 0) {
                    if (var11 != 255) {
                      var7 = 1;
                      break L1;
                    } else {
                      var10++;
                      continue L2;
                    }
                  } else {
                    var10++;
                    continue L2;
                  }
                }
              }
            }
          }
          if (var7 == 0) {
            return (hr) (Object) new mj((qa) this, param0, param1, param2, param3, param4, param5);
          } else {
            return (hr) (Object) new gl((qa) this, param0, param1, param2, param3, param4, param5);
          }
        }
    }

    private final void b(java.awt.Canvas param0, int param1, int param2) {
        ce var4_ref = null;
        ce var4 = (ce) (Object) ((qa) this).field_K.a(106, (long)((Object) (Object) param0).hashCode());
        if (var4 == null) {
            var4_ref = id.a(param1, param2, param0, -101);
            ((qa) this).field_K.a((ms) (Object) var4_ref, -1, (long)((Object) (Object) param0).hashCode());
        } else {
            if (var4_ref.field_n == param1) {
                // if_icmpeq L90
            }
            this.a(param0, param1, param2);
        }
        return;
    }

    private final void a(java.awt.Canvas param0) {
        java.awt.Dimension var3 = null;
        ce var2 = null;
        if (param0 != null) {
            var2 = (ce) (Object) ((qa) this).field_K.a(127, (long)((Object) (Object) param0).hashCode());
            // ifnull L213
            ((qa) this).field_l = param0;
            var3 = param0.getSize();
            ((qa) this).field_z = var3.width;
            ((qa) this).field_s = var3.height;
            ((qa) this).field_n = var2;
            // ifnonnull L213
            ((qa) this).field_o = var2.field_m;
            ((qa) this).field_k = var2.field_n;
            ((qa) this).field_B = var2.field_k;
            if (((qa) this).field_k == ((qa) this).field_x) {
                // if_icmpeq L157
            }
            ((qa) this).field_x = ((qa) this).field_k;
            ((qa) this).field_F = ((qa) this).field_k;
            ((qa) this).field_m = ((qa) this).field_B;
            ((qa) this).field_w = ((qa) this).field_B;
            this.h();
        } else {
            ((qa) this).field_l = null;
            ((qa) this).field_n = null;
            if (((qa) this).field_t == null) {
                ((qa) this).field_o = null;
                ((qa) this).field_B = 1;
                ((qa) this).field_k = 1;
                ((qa) this).field_m = 1;
                ((qa) this).field_x = 1;
                this.h();
            }
        }
    }

    final void aa(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        L0: {
          if (param0 >= ((qa) this).field_v) {
            break L0;
          } else {
            param2 = param2 - (((qa) this).field_v - param0);
            param0 = ((qa) this).field_v;
            break L0;
          }
        }
        L1: {
          if (param1 >= ((qa) this).field_H) {
            break L1;
          } else {
            param3 = param3 - (((qa) this).field_H - param1);
            param1 = ((qa) this).field_H;
            break L1;
          }
        }
        L2: {
          if (param0 + param2 <= ((qa) this).field_D) {
            break L2;
          } else {
            param2 = ((qa) this).field_D - param0;
            break L2;
          }
        }
        L3: {
          if (param1 + param3 <= ((qa) this).field_C) {
            break L3;
          } else {
            param3 = ((qa) this).field_C - param1;
            break L3;
          }
        }
        L4: {
          if (param2 <= 0) {
            break L4;
          } else {
            L5: {
              if (param3 <= 0) {
                break L5;
              } else {
                if (param0 > ((qa) this).field_D) {
                  break L5;
                } else {
                  if (param1 <= ((qa) this).field_C) {
                    L6: {
                      var7 = ((qa) this).field_k - param2;
                      var8 = param0 + param1 * ((qa) this).field_k;
                      var9 = param4 >>> 24;
                      if (param5 == 0) {
                        break L6;
                      } else {
                        L7: {
                          if (param5 != 1) {
                            break L7;
                          } else {
                            if (var9 != 255) {
                              break L7;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L8: {
                          if (param5 != 1) {
                            if (param5 != 2) {
                              throw new IllegalArgumentException();
                            } else {
                              var10 = 0;
                              L9: while (true) {
                                if (var10 >= param3) {
                                  break L8;
                                } else {
                                  var11 = -param2;
                                  L10: while (true) {
                                    if (var11 >= 0) {
                                      var8 = var8 + var7;
                                      var10++;
                                      continue L9;
                                    } else {
                                      var12 = ((qa) this).field_o[var8];
                                      var13 = param4 + var12;
                                      var14 = (param4 & 16711935) + (var12 & 16711935);
                                      var12 = (var14 & 16777472) + (var13 - var14 & 65536);
                                      var8++;
                                      ((qa) this).field_o[var8] = var13 - var12 | var12 - (var12 >>> 8);
                                      var11++;
                                      continue L10;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            param4 = ((param4 & 16711935) * var9 >> 8 & 16711935) + (((param4 & -16711936) >>> 8) * var9 & -16711936);
                            var10 = 256 - var9;
                            var11 = 0;
                            L11: while (true) {
                              if (var11 >= param3) {
                                break L8;
                              } else {
                                var12 = -param2;
                                L12: while (true) {
                                  if (var12 >= 0) {
                                    var8 = var8 + var7;
                                    var11++;
                                    continue L11;
                                  } else {
                                    var13 = ((qa) this).field_o[var8];
                                    var13 = ((var13 & 16711935) * var10 >> 8 & 16711935) + (((var13 & -16711936) >>> 8) * var10 & -16711936);
                                    var8++;
                                    ((qa) this).field_o[var8] = param4 + var13;
                                    var12++;
                                    continue L12;
                                  }
                                }
                              }
                            }
                          }
                        }
                        return;
                      }
                    }
                    var10 = param2 >> 3;
                    var11 = param2 & 7;
                    param2 = var8 - 1;
                    var12 = -param3;
                    L13: while (true) {
                      if (var12 >= 0) {
                        break L4;
                      } else {
                        L14: {
                          if (var10 <= 0) {
                            break L14;
                          } else {
                            param0 = var10;
                            L15: while (true) {
                              param2++;
                              ((qa) this).field_o[param2] = param4;
                              param2++;
                              ((qa) this).field_o[param2] = param4;
                              param2++;
                              ((qa) this).field_o[param2] = param4;
                              param2++;
                              ((qa) this).field_o[param2] = param4;
                              param2++;
                              ((qa) this).field_o[param2] = param4;
                              param2++;
                              ((qa) this).field_o[param2] = param4;
                              param2++;
                              ((qa) this).field_o[param2] = param4;
                              param2++;
                              ((qa) this).field_o[param2] = param4;
                              param0--;
                              if (param0 > 0) {
                                continue L15;
                              } else {
                                break L14;
                              }
                            }
                          }
                        }
                        L16: {
                          if (var11 <= 0) {
                            break L16;
                          } else {
                            param0 = var11;
                            L17: while (true) {
                              param2++;
                              ((qa) this).field_o[param2] = param4;
                              param0--;
                              if (param0 > 0) {
                                continue L17;
                              } else {
                                break L16;
                              }
                            }
                          }
                        }
                        param2 = param2 + var7;
                        var12++;
                        continue L13;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
              }
            }
            return;
          }
        }
    }

    final boolean f() {
        return ((qa) this).field_p;
    }

    private final void d(int param0) {
        ((qa) this).field_i[param0].a((Runnable) (Object) Thread.currentThread(), true);
    }

    private final void h() {
        int var1 = 0;
        for (var1 = 0; var1 < ((qa) this).field_r; var1++) {
            ((qa) this).field_i[var1].a(126);
        }
        this.g();
    }

    final da a(ta param0, ri[] param1, boolean param2) {
        int[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        var4 = new int[param1.length];
        var5 = new int[param1.length];
        var6 = 0;
        var7 = 0;
        L0: while (true) {
          if (var7 >= param1.length) {
            if (!param2) {
              if (var6 == 0) {
                return (da) (Object) new je((qa) this, param0, param1, var4, var5);
              } else {
                throw new IllegalArgumentException("");
              }
            } else {
              if (var6 == 0) {
                return (da) (Object) new at((qa) this, param0, param1, var4, var5);
              } else {
                return (da) (Object) new it((qa) this, param0, param1, var4, var5);
              }
            }
          } else {
            var4[var7] = param1[var7].field_h;
            var5[var7] = param1[var7].field_i;
            if (param1[var7].field_a != null) {
              var6 = 1;
              var7++;
              continue L0;
            } else {
              var7++;
              continue L0;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        param2 = param2 - param0;
        param3 = param3 - param1;
        if (param3 != 0) {
          if (param2 != 0) {
            L0: {
              if (param2 + param3 >= 0) {
                break L0;
              } else {
                param0 = param0 + param2;
                param2 = -param2;
                param1 = param1 + param3;
                param3 = -param3;
                break L0;
              }
            }
            L1: {
              if (param2 <= param3) {
                L2: {
                  param0 = param0 << 16;
                  param0 = param0 + 32768;
                  param2 = param2 << 16;
                  var7 = (int)Math.floor((double)param2 / (double)param3 + 0.5);
                  param3 = param3 + param1;
                  if (param1 >= ((qa) this).field_H) {
                    break L2;
                  } else {
                    param0 = param0 + var7 * (((qa) this).field_H - param1);
                    param1 = ((qa) this).field_H;
                    break L2;
                  }
                }
                L3: {
                  if (param3 < ((qa) this).field_C) {
                    break L3;
                  } else {
                    param3 = ((qa) this).field_C - 1;
                    break L3;
                  }
                }
                L4: {
                  var8 = param4 >>> 24;
                  if (param5 == 0) {
                    break L4;
                  } else {
                    L5: {
                      if (param5 != 1) {
                        break L5;
                      } else {
                        if (var8 != 255) {
                          break L5;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (param5 != 1) {
                      if (param5 != 2) {
                        throw new IllegalArgumentException();
                      } else {
                        L6: while (true) {
                          if (param1 > param3) {
                            break L1;
                          } else {
                            L7: {
                              var9 = param0 >> 16;
                              if (var9 < ((qa) this).field_v) {
                                break L7;
                              } else {
                                if (var9 >= ((qa) this).field_D) {
                                  break L7;
                                } else {
                                  var10 = var9 + param1 * ((qa) this).field_k;
                                  var11 = ((qa) this).field_o[var10];
                                  var12 = param4 + var11;
                                  var13 = (param4 & 16711935) + (var11 & 16711935);
                                  var11 = (var13 & 16777472) + (var12 - var13 & 65536);
                                  ((qa) this).field_o[var10] = var12 - var11 | var11 - (var11 >>> 8);
                                  break L7;
                                }
                              }
                            }
                            param0 = param0 + var7;
                            param1++;
                            continue L6;
                          }
                        }
                      }
                    } else {
                      param4 = ((param4 & 16711935) * var8 >> 8 & 16711935) + ((param4 & 65280) * var8 >> 8 & 65280) + (var8 << 24);
                      var9 = 256 - var8;
                      L8: while (true) {
                        if (param1 > param3) {
                          break L1;
                        } else {
                          L9: {
                            var10 = param0 >> 16;
                            if (var10 < ((qa) this).field_v) {
                              break L9;
                            } else {
                              if (var10 >= ((qa) this).field_D) {
                                break L9;
                              } else {
                                var11 = var10 + param1 * ((qa) this).field_k;
                                var12 = ((qa) this).field_o[var11];
                                var12 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                                ((qa) this).field_o[var10 + param1 * ((qa) this).field_k] = param4 + var12;
                                break L9;
                              }
                            }
                          }
                          param0 = param0 + var7;
                          param1++;
                          continue L8;
                        }
                      }
                    }
                  }
                }
                L10: while (true) {
                  if (param1 > param3) {
                    break L1;
                  } else {
                    L11: {
                      var9 = param0 >> 16;
                      if (var9 < ((qa) this).field_v) {
                        break L11;
                      } else {
                        if (var9 >= ((qa) this).field_D) {
                          break L11;
                        } else {
                          ((qa) this).field_o[var9 + param1 * ((qa) this).field_k] = param4;
                          break L11;
                        }
                      }
                    }
                    param0 = param0 + var7;
                    param1++;
                    continue L10;
                  }
                }
              } else {
                L12: {
                  param1 = param1 << 16;
                  param1 = param1 + 32768;
                  param3 = param3 << 16;
                  var7 = (int)Math.floor((double)param3 / (double)param2 + 0.5);
                  param2 = param2 + param0;
                  if (param0 >= ((qa) this).field_v) {
                    break L12;
                  } else {
                    param1 = param1 + var7 * (((qa) this).field_v - param0);
                    param0 = ((qa) this).field_v;
                    break L12;
                  }
                }
                L13: {
                  if (param2 < ((qa) this).field_D) {
                    break L13;
                  } else {
                    param2 = ((qa) this).field_D - 1;
                    break L13;
                  }
                }
                L14: {
                  var8 = param4 >>> 24;
                  if (param5 == 0) {
                    break L14;
                  } else {
                    L15: {
                      if (param5 != 1) {
                        break L15;
                      } else {
                        if (var8 != 255) {
                          break L15;
                        } else {
                          break L14;
                        }
                      }
                    }
                    if (param5 != 1) {
                      if (param5 != 2) {
                        throw new IllegalArgumentException();
                      } else {
                        L16: while (true) {
                          if (param0 > param2) {
                            break L1;
                          } else {
                            L17: {
                              var9 = param1 >> 16;
                              if (var9 < ((qa) this).field_H) {
                                break L17;
                              } else {
                                if (var9 >= ((qa) this).field_C) {
                                  break L17;
                                } else {
                                  var10 = param0 + var9 * ((qa) this).field_k;
                                  var11 = ((qa) this).field_o[var10];
                                  var12 = param4 + var11;
                                  var13 = (param4 & 16711935) + (var11 & 16711935);
                                  var11 = (var13 & 16777472) + (var12 - var13 & 65536);
                                  ((qa) this).field_o[var10] = var12 - var11 | var11 - (var11 >>> 8);
                                  break L17;
                                }
                              }
                            }
                            param1 = param1 + var7;
                            param0++;
                            continue L16;
                          }
                        }
                      }
                    } else {
                      param4 = ((param4 & 16711935) * var8 >> 8 & 16711935) + ((param4 & 65280) * var8 >> 8 & 65280) + (var8 << 24);
                      var9 = 256 - var8;
                      L18: while (true) {
                        if (param0 > param2) {
                          break L1;
                        } else {
                          L19: {
                            var10 = param1 >> 16;
                            if (var10 < ((qa) this).field_H) {
                              break L19;
                            } else {
                              if (var10 >= ((qa) this).field_C) {
                                break L19;
                              } else {
                                var11 = param0 + var10 * ((qa) this).field_k;
                                var12 = ((qa) this).field_o[var11];
                                var12 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                                ((qa) this).field_o[var11] = param4 + var12;
                                break L19;
                              }
                            }
                          }
                          param1 = param1 + var7;
                          param0++;
                          continue L18;
                        }
                      }
                    }
                  }
                }
                L20: while (true) {
                  if (param0 > param2) {
                    break L1;
                  } else {
                    L21: {
                      var9 = param1 >> 16;
                      if (var9 < ((qa) this).field_H) {
                        break L21;
                      } else {
                        if (var9 >= ((qa) this).field_C) {
                          break L21;
                        } else {
                          ((qa) this).field_o[param0 + var9 * ((qa) this).field_k] = param4;
                          break L21;
                        }
                      }
                    }
                    param1 = param1 + var7;
                    param0++;
                    continue L20;
                  }
                }
              }
            }
            return;
          } else {
            L22: {
              if (param3 < 0) {
                this.b(param0, param1 + param3, -param3 + 1, param4, param5);
                break L22;
              } else {
                this.b(param0, param1, param3 + 1, param4, param5);
                break L22;
              }
            }
            return;
          }
        } else {
          L23: {
            if (param2 < 0) {
              ((qa) this).U(param0 + param2, param1, -param2 + 1, param4, param5);
              break L23;
            } else {
              ((qa) this).U(param0, param1, param2 + 1, param4, param5);
              break L23;
            }
          }
          return;
        }
    }

    qa(java.awt.Canvas param0, d param1, int param2, int param3) {
        this(param1);
        try {
            this.b(param0, param2, param3);
            this.a(param0);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            ((qa) this).a((byte) -21);
            throw new RuntimeException("");
        }
    }

    final void U(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          if (param1 < ((qa) this).field_H) {
            break L0;
          } else {
            if (param1 < ((qa) this).field_C) {
              L1: {
                if (param0 >= ((qa) this).field_v) {
                  break L1;
                } else {
                  param2 = param2 - (((qa) this).field_v - param0);
                  param0 = ((qa) this).field_v;
                  break L1;
                }
              }
              L2: {
                if (param0 + param2 <= ((qa) this).field_D) {
                  break L2;
                } else {
                  param2 = ((qa) this).field_D - param0;
                  break L2;
                }
              }
              L3: {
                var6 = param0 + param1 * ((qa) this).field_k;
                var7 = param3 >>> 24;
                if (param4 == 0) {
                  break L3;
                } else {
                  L4: {
                    if (param4 != 1) {
                      break L4;
                    } else {
                      if (var7 != 255) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L5: {
                    if (param4 != 1) {
                      if (param4 != 2) {
                        throw new IllegalArgumentException();
                      } else {
                        var8 = 0;
                        L6: while (true) {
                          if (var8 >= param2) {
                            break L5;
                          } else {
                            var9 = ((qa) this).field_o[var6 + var8];
                            var10 = param3 + var9;
                            var11 = (param3 & 16711935) + (var9 & 16711935);
                            var9 = (var11 & 16777472) + (var10 - var11 & 65536);
                            ((qa) this).field_o[var6 + var8] = var10 - var9 | var9 - (var9 >>> 8);
                            var8++;
                            continue L6;
                          }
                        }
                      }
                    } else {
                      param3 = ((param3 & 16711935) * var7 >> 8 & 16711935) + ((param3 & 65280) * var7 >> 8 & 65280) + (var7 << 24);
                      var8 = 256 - var7;
                      var9 = 0;
                      L7: while (true) {
                        if (var9 >= param2) {
                          break L5;
                        } else {
                          var10 = ((qa) this).field_o[var6 + var9];
                          var10 = ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & 65280) * var8 >> 8 & 65280);
                          ((qa) this).field_o[var6 + var9] = param3 + var10;
                          var9++;
                          continue L7;
                        }
                      }
                    }
                  }
                  return;
                }
              }
              var8 = 0;
              L8: while (true) {
                if (var8 >= param2) {
                  break L0;
                } else {
                  ((qa) this).field_o[var6 + var8] = param3;
                  var8++;
                  continue L8;
                }
              }
            } else {
              return;
            }
          }
        }
    }

    final void a(za param0) {
    }

    final void KA(int param0, int param1, int param2, int param3) {
        if (param0 < 0) {
            param0 = 0;
        }
        if (param1 < 0) {
            param1 = 0;
        }
        if (param2 > ((qa) this).field_k) {
            param2 = ((qa) this).field_k;
        }
        if (param3 > ((qa) this).field_B) {
            param3 = ((qa) this).field_B;
        }
        ((qa) this).field_v = param0;
        ((qa) this).field_D = param2;
        ((qa) this).field_H = param1;
        ((qa) this).field_C = param3;
        this.j();
    }

    final void f(int param0, int param1) {
        rp discarded$0 = this.a((Runnable) (Object) Thread.currentThread());
        ((qa) this).field_M = param0;
        ((qa) this).field_L = param1;
    }

    final void DA(int param0, int param1, int param2, int param3) {
        ((qa) this).field_q = param0;
        ((qa) this).field_j = param1;
        ((qa) this).field_G = param2;
        ((qa) this).field_y = param3;
        this.j();
    }

    final void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        param6 = param6 - param2;
        for (var8 = 0; var8 < param3; var8++) {
            var9 = (param1 + var8) * ((qa) this).field_k + param0;
            for (var10 = 0; var10 < param2; var10++) {
                param5++;
                ((qa) this).field_o[var9 + var10] = param4[param5];
            }
            param5 = param5 + param6;
        }
    }

    private final void g(int param0) {
        int var2 = 0;
        ((qa) this).field_r = param0;
        ((qa) this).field_i = new rp[((qa) this).field_r];
        for (var2 = 0; var2 < ((qa) this).field_r; var2++) {
            ((qa) this).field_i[var2] = new rp((qa) this);
        }
    }

    final void d() {
        if (((qa) this).field_J) {
            pt.a(true, false, -1);
            ((qa) this).field_J = false;
        }
        ((qa) this).field_n = null;
        ((qa) this).field_l = null;
        ((qa) this).field_z = 0;
        ((qa) this).field_s = 0;
        ((qa) this).field_K = null;
        ((qa) this).field_p = true;
    }

    private final void a(java.awt.Canvas param0, int param1, int param2) {
        ce var4_ref = null;
        java.awt.Dimension var5 = null;
        ce var4 = (ce) (Object) ((qa) this).field_K.a(122, (long)((Object) (Object) param0).hashCode());
        if (var4 != null) {
            var4.b(false);
            var4_ref = id.a(param1, param2, param0, -91);
            ((qa) this).field_K.a((ms) (Object) var4_ref, -1, (long)((Object) (Object) param0).hashCode());
            if (((qa) this).field_l == param0) {
                if (((qa) this).field_t == null) {
                    var5 = param0.getSize();
                    ((qa) this).field_z = var5.width;
                    ((qa) this).field_s = var5.height;
                    ((qa) this).field_n = var4_ref;
                    ((qa) this).field_o = var4_ref.field_m;
                    ((qa) this).field_k = var4_ref.field_n;
                    ((qa) this).field_B = var4_ref.field_k;
                    if (((qa) this).field_k == ((qa) this).field_x) {
                        // if_icmpeq L196
                    }
                    ((qa) this).field_x = ((qa) this).field_k;
                    ((qa) this).field_F = ((qa) this).field_k;
                    ((qa) this).field_m = ((qa) this).field_B;
                    ((qa) this).field_w = ((qa) this).field_B;
                    this.h();
                }
            }
            return;
        }
    }

    private final void b(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          if (param0 < ((qa) this).field_v) {
            break L0;
          } else {
            if (param0 < ((qa) this).field_D) {
              L1: {
                if (param1 >= ((qa) this).field_H) {
                  break L1;
                } else {
                  param2 = param2 - (((qa) this).field_H - param1);
                  param1 = ((qa) this).field_H;
                  break L1;
                }
              }
              L2: {
                if (param1 + param2 <= ((qa) this).field_C) {
                  break L2;
                } else {
                  param2 = ((qa) this).field_C - param1;
                  break L2;
                }
              }
              L3: {
                var6 = param0 + param1 * ((qa) this).field_k;
                var7 = param3 >>> 24;
                if (param4 == 0) {
                  break L3;
                } else {
                  L4: {
                    if (param4 != 1) {
                      break L4;
                    } else {
                      if (var7 != 255) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L5: {
                    if (param4 != 1) {
                      if (param4 != 2) {
                        throw new IllegalArgumentException();
                      } else {
                        var8 = 0;
                        L6: while (true) {
                          if (var8 >= param2) {
                            break L5;
                          } else {
                            var9 = var6 + var8 * ((qa) this).field_k;
                            var10 = ((qa) this).field_o[var9];
                            var11 = param3 + var10;
                            var12 = (param3 & 16711935) + (var10 & 16711935);
                            var10 = (var12 & 16777472) + (var11 - var12 & 65536);
                            ((qa) this).field_o[var9] = var11 - var10 | var10 - (var10 >>> 8);
                            var8++;
                            continue L6;
                          }
                        }
                      }
                    } else {
                      param3 = ((param3 & 16711935) * var7 >> 8 & 16711935) + ((param3 & 65280) * var7 >> 8 & 65280) + (var7 << 24);
                      var8 = 256 - var7;
                      var9 = 0;
                      L7: while (true) {
                        if (var9 >= param2) {
                          break L5;
                        } else {
                          var10 = var6 + var9 * ((qa) this).field_k;
                          var11 = ((qa) this).field_o[var10];
                          var11 = ((var11 & 16711935) * var8 >> 8 & 16711935) + ((var11 & 65280) * var8 >> 8 & 65280);
                          ((qa) this).field_o[var10] = param3 + var11;
                          var9++;
                          continue L7;
                        }
                      }
                    }
                  }
                  return;
                }
              }
              var8 = 0;
              L8: while (true) {
                if (var8 >= param2) {
                  break L0;
                } else {
                  ((qa) this).field_o[var6 + var8 * ((qa) this).field_k] = param3;
                  var8++;
                  continue L8;
                }
              }
            } else {
              return;
            }
          }
        }
    }

    final void b(int param0, int param1) throws rf {
        Exception exception = null;
        java.awt.Graphics var3 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (((qa) this).field_l == null) {
            break L0;
          } else {
            if (((qa) this).field_n != null) {
              try {
                var3 = ((qa) this).field_l.getGraphics();
                ((qa) this).field_n.a(var3, 0, param1, ((qa) this).field_z, param0, ((qa) this).field_s, 0, (byte) -106);
              } catch (java.lang.Exception decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
              }
              exception = (Exception) (Object) decompiledCaughtException;
              ((qa) this).field_l.repaint();
            } else {
              break L0;
            }
          }
        }
        throw new IllegalStateException(field_I);
    }

    final vc a(bu param0, nr param1) {
        return (vc) (Object) new hi((qa) this, (hr) (Object) param0, (od) (Object) param1);
    }

    final int[] Y() {
        return new int[]{((qa) this).field_q, ((qa) this).field_j, ((qa) this).field_G, ((qa) this).field_y};
    }

    final nr a(int param0, int param1) {
        return (nr) (Object) new od(param0, param1);
    }

    final void b() {
        if (((qa) this).field_l != null) {
            ((qa) this).field_o = ((qa) this).field_n.field_m;
            ((qa) this).field_k = ((qa) this).field_n.field_n;
            ((qa) this).field_B = ((qa) this).field_n.field_k;
            ((qa) this).field_x = ((qa) this).field_F;
            ((qa) this).field_m = ((qa) this).field_w;
        } else {
            ((qa) this).field_k = 1;
            ((qa) this).field_B = 1;
            ((qa) this).field_o = null;
            ((qa) this).field_x = 1;
            ((qa) this).field_m = 1;
        }
        ((qa) this).field_t = null;
        this.h();
    }

    final void e() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = "off";
    }
}
