/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce extends rd {
    static int[] field_q;
    private int field_s;
    static wj field_n;
    private uh field_p;
    static int field_r;
    static int field_m;
    private uh field_o;

    final static float a(int param0, wc[] param1) {
        int var4 = HoldTheLine.field_D;
        float var2 = 0.0f;
        int var3 = 0;
        if (param0 != -1) {
            return 0.04640667513012886f;
        }
        while (param1.length > var3) {
            var2 = var2 + param1[var3].f(50);
            var3++;
        }
        return var2;
    }

    final void a(int[] param0, int param1, byte param2, int[] param3) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        var11 = HoldTheLine.field_D;
        var12 = new int[param3.length + param0.length];
        var16 = var12;
        var15 = var16;
        var14 = var15;
        var13 = var14;
        var5 = var13;
        var6 = 0;
        L0: while (true) {
          if (var6 >= param0.length) {
            var6 = 0;
            L1: while (true) {
              if (param3.length / 2 <= var6) {
                ((ce) this).field_p.a(param0, 0);
                ((ce) this).field_o.a(param3, 0);
                gf.a(var16, 12566463);
                if (param2 <= -49) {
                  L2: {
                    if (param1 != ((ce) this).field_s) {
                      L3: {
                        if (((ce) this).field_p.b(-127) <= 0) {
                          break L3;
                        } else {
                          if (((ce) this).field_o.b(-115) > 0) {
                            var7 = ((ce) this).field_p.a((byte) 127, 0);
                            var8 = ((ce) this).field_p.a((byte) 105, 1);
                            var6 = 0;
                            L4: while (true) {
                              if (var6 >= ((ce) this).field_p.b(-117)) {
                                var9 = ((ce) this).field_o.a((byte) 81, -2 + ((ce) this).field_o.b(-111));
                                var10 = ((ce) this).field_o.a((byte) 46, ((ce) this).field_o.b(-119) + -1);
                                tc.d(var7, var8, var9, var10, 4144959);
                                var8 = var10;
                                var7 = var9;
                                var6 = -2 + ((ce) this).field_o.b(-115);
                                L5: while (true) {
                                  if (var6 < 0) {
                                    var9 = ((ce) this).field_p.a((byte) 28, 0);
                                    var10 = ((ce) this).field_p.a((byte) 118, 1);
                                    tc.d(var7, var8, var9, var10, 4144959);
                                    var7 = var9;
                                    var8 = var10;
                                    ((ce) this).field_p = o.a((byte) 103);
                                    ((ce) this).field_o = o.a((byte) -115);
                                    break L3;
                                  } else {
                                    var9 = ((ce) this).field_o.a((byte) 19, var6);
                                    var10 = ((ce) this).field_o.a((byte) 107, var6 - -1);
                                    tc.d(var7, var8, var9, var10, 4144959);
                                    var7 = var9;
                                    var8 = var10;
                                    var6 -= 2;
                                    continue L5;
                                  }
                                }
                              } else {
                                var9 = ((ce) this).field_p.a((byte) 110, var6);
                                var10 = ((ce) this).field_p.a((byte) 13, 1 + var6);
                                tc.d(var7, var8, var9, var10, 4144959);
                                var7 = var9;
                                var8 = var10;
                                var6 += 2;
                                continue L4;
                              }
                            }
                          } else {
                            break L3;
                          }
                        }
                      }
                      ((ce) this).field_s = param1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  return;
                } else {
                  return;
                }
              } else {
                var5[2 * var6 + param0.length] = param3[-(2 * var6) + (-2 + param3.length)];
                var5[var6 * 2 + param0.length - -1] = param3[-(var6 * 2) + -1 + param3.length];
                var6++;
                continue L1;
              }
            }
          } else {
            var12[var6] = param0[var6];
            var6++;
            continue L0;
          }
        }
    }

    final static ql a(int param0, byte[] param1, bm[] param2, int param3, int param4, int param5) {
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        byte[][] var11 = null;
        int var13 = 0;
        int var14 = 0;
        int var16_int = 0;
        ql var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        byte[][] var33 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[] var45 = null;
        int[] var46 = null;
        byte[][] var47 = null;
        int[] var49 = null;
        int[] var50 = null;
        int[] var51 = null;
        int[] var52 = null;
        int[] var53 = null;
        byte[][] var54 = null;
        int[] var55 = null;
        var27 = HoldTheLine.field_D;
        if (param2.length == 256) {
          var52 = new int[256];
          var45 = var52;
          var38 = var45;
          var31 = var38;
          var6 = var31;
          var53 = new int[256];
          var46 = var53;
          var39 = var46;
          var32 = var39;
          var7 = var32;
          var51 = new int[256];
          var44 = var51;
          var37 = var44;
          var30 = var37;
          var8 = var30;
          var50 = new int[256];
          var43 = var50;
          var36 = var43;
          var29 = var36;
          var9 = var29;
          var10 = new int[]{0, param4, param0};
          var54 = new byte[256][];
          var47 = var54;
          var40 = var47;
          var33 = var40;
          var11 = var33;
          var55 = tc.field_b;
          var13 = tc.field_j;
          if (param5 == 8) {
            var14 = tc.field_c;
            var49 = new int[4];
            tc.b(var49);
            var16_int = 0;
            L0: while (true) {
              if (var16_int >= 256) {
                var16 = new ql(param1, var52, var53, var51, var50, var10, var54);
                var16.field_I = var16.field_I - param3;
                var16.field_s = var16.field_s - param3;
                var16.field_G = var16.field_G - param3;
                tc.a(var55, var13, var14);
                tc.a(var49);
                return var16;
              } else {
                var6[var16_int] = param2[var16_int].field_k + -param3;
                var7[var16_int] = -param3 + param2[var16_int].field_d;
                var8[var16_int] = (param3 << 1538034049) + param2[var16_int].field_i;
                var9[var16_int] = (param3 << -814627903) + param2[var16_int].field_l;
                var11[var16_int] = new byte[var50[var16_int] * var51[var16_int]];
                var17 = new byte[var50[var16_int] * var51[var16_int]];
                var18 = param2[var16_int].field_m;
                var19 = param2[var16_int].field_i;
                var20 = param2[var16_int].field_l;
                var21 = var51[var16_int];
                tc.a(new int[var50[var16_int] * var51[var16_int]], var51[var16_int], var50[var16_int]);
                var22 = -var19 + var21;
                var23 = 0;
                var24 = 0;
                L1: while (true) {
                  if (var24 >= var20) {
                    var24 = 0;
                    L2: while (true) {
                      if (var17.length <= var24) {
                        var23 = 0;
                        var24 = (1 + var51[var16_int]) * param3;
                        var25 = 0;
                        L3: while (true) {
                          if (var20 <= var25) {
                            var16_int++;
                            continue L0;
                          } else {
                            var26 = 0;
                            L4: while (true) {
                              if (var19 <= var26) {
                                var24 = var24 + var22;
                                var25++;
                                continue L3;
                              } else {
                                var23++;
                                if (var18[var23] != 0) {
                                  var24++;
                                  var17[var24] = (byte) 1;
                                  var26++;
                                  continue L4;
                                } else {
                                  var24++;
                                  var26++;
                                  continue L4;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        var17[var24] = (byte)tc.field_b[var24];
                        var24++;
                        continue L2;
                      }
                    }
                  } else {
                    var25 = 0;
                    L5: while (true) {
                      if (var25 >= var19) {
                        var24++;
                        continue L1;
                      } else {
                        var23++;
                        if (var18[var23] != 0) {
                          tc.d(var25 - -param3, var24 + param3, param3, 2);
                          var25++;
                          continue L5;
                        } else {
                          var25++;
                          continue L5;
                        }
                      }
                    }
                  }
                }
              }
            }
          } else {
            return null;
          }
        } else {
          throw new IllegalArgumentException();
        }
    }

    public static void c(int param0) {
        field_q = null;
        field_n = null;
        if (param0 != -10162) {
            field_q = null;
        }
    }

    final static hj[] a(String param0, int param1, String param2, gn param3) {
        if (param1 != 17870) {
            return null;
        }
        int var4 = param3.c(param2, 3);
        int var5 = param3.a(var4, param0, false);
        return jc.a(-1, var5, param3, var4);
    }

    final static int a(int param0, vk param1) {
        int var2 = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = HoldTheLine.field_D;
        if (param0 == -14646) {
          var2 = kg.a((byte) 26, param1);
          var3 = go.field_g[param1.field_p];
          var4 = 0;
          L0: while (true) {
            if (var3.length <= var4) {
              L1: {
                if (!mc.field_a[9].field_c) {
                  break L1;
                } else {
                  var2 += 8;
                  break L1;
                }
              }
              L2: {
                if (mc.field_a[11].field_c) {
                  var2 += 8;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (!nn.a(-64)) {
                  var2 += 88;
                  break L3;
                } else {
                  break L3;
                }
              }
              return 2 * var2 / 3;
            } else {
              L4: {
                if (ge.field_c[var3[var4]].field_b.b((byte) 58)) {
                  var2 += 8;
                  break L4;
                } else {
                  break L4;
                }
              }
              if (ge.field_c[var3[var4]].field_z.b((byte) 58)) {
                var2 += 8;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return -59;
        }
    }

    ce(int param0, float param1) {
        ((ce) this).field_c = 0;
        ((ce) this).field_i = 1;
        ((ce) this).field_h = param0;
        ((ce) this).field_k = param1;
        ((ce) this).field_p = o.a((byte) 50);
        ((ce) this).field_o = o.a((byte) 96);
        ((ce) this).field_s = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new int[4];
    }
}
