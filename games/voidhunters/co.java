/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class co {
    Runnable field_c;
    boolean field_f;
    private sob field_d;
    private int[] field_b;
    daa field_e;
    float[] field_a;

    final void a(Runnable param0, int param1) {
        if (param1 != 0) {
            ((co) this).field_b = null;
            ((co) this).field_c = param0;
            return;
        }
        ((co) this).field_c = param0;
    }

    final void a(byte param0) {
        ((co) this).field_e = new daa(((co) this).field_d, (co) this);
        if (param0 != 3) {
            ((co) this).field_f = false;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, float[] param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        float[] var12 = null;
        float[] var13 = null;
        float[] var14 = null;
        float var15 = 0.0f;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int stackIn_9_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        var23 = VoidHunters.field_G;
        if (-1 <= (param2 ^ -1)) {
          if (param4 <= 0) {
            L0: {
              var7 = pu.a((byte) -104, param0);
              var8 = 0;
              if (param2 >= param4) {
                stackOut_50_0 = param4;
                stackIn_51_0 = stackOut_50_0;
                break L0;
              } else {
                stackOut_49_0 = param2;
                stackIn_51_0 = stackOut_49_0;
                break L0;
              }
            }
            var9 = stackIn_51_0;
            var10 = param2 >> -302567871;
            var11 = param4 >> -122656863;
            if (param6 == -29702) {
              var12 = param5;
              var13 = new float[var7 * var10 * var11];
              L1: while (true) {
                jaggl.OpenGL.glTexImage2Df(param3, var8, param1, param2, param4, 0, param0, 5126, var12, 0);
                if ((var9 ^ -1) >= -2) {
                  return;
                } else {
                  var16 = param2 * var7;
                  var17 = 0;
                  L2: while (true) {
                    if (var7 <= var17) {
                      var14 = var13;
                      var13 = var12;
                      var12 = var14;
                      param4 = var11;
                      param2 = var10;
                      var11 = var11 >> 1;
                      var8++;
                      var10 = var10 >> 1;
                      var9 = var9 >> 1;
                      continue L1;
                    } else {
                      var18 = var17;
                      var19 = var17;
                      var20 = var19 - -var16;
                      var21 = 0;
                      L3: while (true) {
                        if (var11 <= var21) {
                          var17++;
                          continue L2;
                        } else {
                          var22 = 0;
                          L4: while (true) {
                            if (var10 <= var22) {
                              var19 = var19 + var16;
                              var20 = var20 + var16;
                              var21++;
                              continue L3;
                            } else {
                              var15 = param5[var19];
                              var19 = var19 + var7;
                              var15 = var15 + param5[var19];
                              var15 = var15 + param5[var20];
                              var19 = var19 + var7;
                              var20 = var20 + var7;
                              var15 = var15 + param5[var20];
                              var13[var18] = 0.25f * var15;
                              var20 = var20 + var7;
                              var18 = var18 + var7;
                              var22++;
                              continue L4;
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
          } else {
            if (!bd.a(param4, (byte) -95)) {
              throw new IllegalArgumentException("");
            } else {
              L5: {
                var7 = pu.a((byte) -104, param0);
                var8 = 0;
                if (param2 >= param4) {
                  stackOut_30_0 = param4;
                  stackIn_31_0 = stackOut_30_0;
                  break L5;
                } else {
                  stackOut_29_0 = param2;
                  stackIn_31_0 = stackOut_29_0;
                  break L5;
                }
              }
              var9 = stackIn_31_0;
              var10 = param2 >> -302567871;
              var11 = param4 >> -122656863;
              if (param6 == -29702) {
                var12 = param5;
                var13 = new float[var7 * var10 * var11];
                L6: while (true) {
                  jaggl.OpenGL.glTexImage2Df(param3, var8, param1, param2, param4, 0, param0, 5126, var12, 0);
                  if ((var9 ^ -1) < -2) {
                    var16 = param2 * var7;
                    var17 = 0;
                    L7: while (true) {
                      if (var7 <= var17) {
                        var14 = var13;
                        var13 = var12;
                        var12 = var14;
                        param4 = var11;
                        param2 = var10;
                        var11 = var11 >> 1;
                        var8++;
                        var10 = var10 >> 1;
                        var9 = var9 >> 1;
                        continue L6;
                      } else {
                        var18 = var17;
                        var19 = var17;
                        var20 = var19 - -var16;
                        var21 = 0;
                        L8: while (true) {
                          if (var11 <= var21) {
                            var17++;
                            continue L7;
                          } else {
                            var22 = 0;
                            L9: while (true) {
                              if (var10 <= var22) {
                                var19 = var19 + var16;
                                var20 = var20 + var16;
                                var21++;
                                continue L8;
                              } else {
                                var15 = param5[var19];
                                var19 = var19 + var7;
                                var15 = var15 + param5[var19];
                                var15 = var15 + param5[var20];
                                var19 = var19 + var7;
                                var20 = var20 + var7;
                                var15 = var15 + param5[var20];
                                var13[var18] = 0.25f * var15;
                                var20 = var20 + var7;
                                var18 = var18 + var7;
                                var22++;
                                continue L9;
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
              } else {
                return;
              }
            }
          }
        } else {
          if (!bd.a(param2, (byte) -95)) {
            throw new IllegalArgumentException("");
          } else {
            L10: {
              if (param4 <= 0) {
                break L10;
              } else {
                if (!bd.a(param4, (byte) -95)) {
                  throw new IllegalArgumentException("");
                } else {
                  break L10;
                }
              }
            }
            L11: {
              var7 = pu.a((byte) -104, param0);
              var8 = 0;
              if (param2 >= param4) {
                stackOut_8_0 = param4;
                stackIn_9_0 = stackOut_8_0;
                break L11;
              } else {
                stackOut_7_0 = param2;
                stackIn_9_0 = stackOut_7_0;
                break L11;
              }
            }
            var9 = stackIn_9_0;
            var10 = param2 >> -302567871;
            var11 = param4 >> -122656863;
            if (param6 == -29702) {
              var12 = param5;
              var13 = new float[var7 * var10 * var11];
              L12: while (true) {
                jaggl.OpenGL.glTexImage2Df(param3, var8, param1, param2, param4, 0, param0, 5126, var12, 0);
                if ((var9 ^ -1) < -2) {
                  var16 = param2 * var7;
                  var17 = 0;
                  L13: while (true) {
                    if (var7 <= var17) {
                      var14 = var13;
                      var13 = var12;
                      var12 = var14;
                      param4 = var11;
                      param2 = var10;
                      var11 = var11 >> 1;
                      var8++;
                      var10 = var10 >> 1;
                      var9 = var9 >> 1;
                      continue L12;
                    } else {
                      var18 = var17;
                      var19 = var17;
                      var20 = var19 - -var16;
                      var21 = 0;
                      L14: while (true) {
                        if (var11 <= var21) {
                          var17++;
                          continue L13;
                        } else {
                          var22 = 0;
                          L15: while (true) {
                            if (var10 <= var22) {
                              var19 = var19 + var16;
                              var20 = var20 + var16;
                              var21++;
                              continue L14;
                            } else {
                              var15 = param5[var19];
                              var19 = var19 + var7;
                              var15 = var15 + param5[var19];
                              var15 = var15 + param5[var20];
                              var19 = var19 + var7;
                              var20 = var20 + var7;
                              var15 = var15 + param5[var20];
                              var13[var18] = 0.25f * var15;
                              var20 = var20 + var7;
                              var18 = var18 + var7;
                              var22++;
                              continue L15;
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
            } else {
              return;
            }
          }
        }
    }

    co(sob param0) {
        int var2 = 0;
        ((co) this).field_f = true;
        lia discarded$0 = new lia();
        ((co) this).field_a = new float[2];
        ((co) this).field_d = param0;
        ((co) this).field_e = new daa(param0, (co) this);
        b discarded$1 = new b(((co) this).field_d);
        b discarded$2 = new b(((co) this).field_d);
        b discarded$3 = new b(((co) this).field_d);
        b discarded$4 = new b(((co) this).field_d);
        b discarded$5 = new b(((co) this).field_d);
        b discarded$6 = new b(((co) this).field_d);
        b discarded$7 = new b(((co) this).field_d);
        b discarded$8 = new b(((co) this).field_d);
        b discarded$9 = new b(((co) this).field_d);
        b discarded$10 = new b(((co) this).field_d);
        ((co) this).field_b = new int[b.field_v];
        for (var2 = 0; var2 < b.field_v; var2++) {
            ((co) this).field_b[var2] = -1;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        pv discarded$0 = new pv();
    }
}
