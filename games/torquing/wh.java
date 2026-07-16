/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh extends am {
    static int field_x;
    static sm[] field_t;
    static String[] field_z;
    static int field_s;
    static int field_w;
    private boolean field_A;
    static String field_u;
    private int field_v;
    static int[] field_y;

    final static String a(int param0, byte param1) {
        int var6 = Torquing.field_u;
        if (!(param0 >= 0)) {
            param0 = 0;
        }
        int var2 = (999 + param0) / 1000;
        int var3 = var2 / 60;
        var2 = var2 % 60;
        int var4 = 16 / ((-66 - param1) / 52);
        StringBuilder var5 = new StringBuilder(5);
        StringBuilder discarded$0 = var5.append((char)(48 - -(var2 % 10)));
        StringBuilder discarded$1 = var5.append((char)(48 + var2 / 10));
        StringBuilder discarded$2 = var5.append(58);
        do {
            StringBuilder discarded$3 = var5.append((char)(48 + var3 % 10));
            var3 = var3 / 10;
        } while (var3 > 0);
        return db.a(var5.toString(), 31108);
    }

    final void a(fj param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        L0: {
          var5 = Torquing.field_u;
          var4 = param2;
          if (-1 == (var4 ^ -1)) {
            ((wh) this).field_v = param0.i(param1 ^ 7059);
            break L0;
          } else {
            if (-2 != (var4 ^ -1)) {
              break L0;
            } else {
              L1: {
                stackOut_4_0 = this;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (-2 != (param0.i((byte) -101) ^ -1)) {
                  stackOut_6_0 = this;
                  stackOut_6_1 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L1;
                } else {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L1;
                }
              }
              ((wh) this).field_A = stackIn_7_1 != 0;
              break L0;
            }
          }
        }
        L2: {
          if (param1 == 35) {
            break L2;
          } else {
            int[][] discarded$1 = ((wh) this).a(-19, 115);
            break L2;
          }
        }
    }

    public static void g(byte param0) {
        if (param0 < 86) {
            wh.b(104);
        }
        field_t = null;
        field_u = null;
        field_y = null;
        field_z = null;
    }

    final int[][] a(int param0, int param1) {
        int[][] var3 = null;
        int[] var5 = null;
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
        int[][] var22 = null;
        int[][] var23 = null;
        int[][] var29 = null;
        int[][] var35 = null;
        int[][] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[] var45 = null;
        int[] var46 = null;
        L0: {
          var21 = Torquing.field_u;
          if (param0 == -29116) {
            break L0;
          } else {
            field_t = null;
            break L0;
          }
        }
        L1: {
          var41 = ((wh) this).field_r.a(15142, param1);
          var35 = var41;
          var29 = var35;
          var23 = var29;
          var22 = var23;
          var3 = var22;
          if (((wh) this).field_r.field_b) {
            var42 = ((wh) this).b(param0 + 29116, 0, vp.field_I & param1 - 1);
            var5 = ((wh) this).b(0, 0, param1);
            var43 = ((wh) this).b(0, 0, vp.field_I & param1 - -1);
            var44 = var41[0];
            var45 = var41[1];
            var46 = var41[2];
            var10 = 0;
            L2: while (true) {
              if (var10 >= ci.field_c) {
                break L1;
              } else {
                L3: {
                  var14 = ((wh) this).field_v * (-var42[var10] + var43[var10]);
                  var15 = (var5[jh.field_A & var10 + 1] - var5[var10 + -1 & jh.field_A]) * ((wh) this).field_v;
                  var16 = var15 >> -819595412;
                  var17 = var14 >> 957691148;
                  var18 = var16 * var16 >> 332158284;
                  var19 = var17 * var17 >> -1797864884;
                  var20 = (int)(Math.sqrt((double)((float)(var19 + var18 + 4096) / 4096.0f)) * 4096.0);
                  if (-1 == (var20 ^ -1)) {
                    var13 = 0;
                    var11 = 0;
                    var12 = 0;
                    break L3;
                  } else {
                    var11 = var15 / var20;
                    var12 = var14 / var20;
                    var13 = 16777216 / var20;
                    break L3;
                  }
                }
                L4: {
                  if (((wh) this).field_A) {
                    var12 = 2048 - -(var12 >> -1814227007);
                    var13 = 2048 - -(var13 >> 836068001);
                    var11 = 2048 - -(var11 >> -762267295);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var44[var10] = var11;
                var45[var10] = var12;
                var46[var10] = var13;
                var10++;
                continue L2;
              }
            }
          } else {
            break L1;
          }
        }
        return var22;
    }

    final static void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        h var4_ref_h = null;
        int var4 = 0;
        qk var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        df var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        L0: {
          var8 = Torquing.field_u;
          if (param0 >= 85) {
            break L0;
          } else {
            wh.a(0, -125, 67, -97, -50, -52);
            break L0;
          }
        }
        L1: {
          var10 = kj.field_d;
          var2 = var10.i((byte) -101);
          var3 = var10.i((byte) -101);
          if (-1 != (var2 ^ -1)) {
            if (var2 == 1) {
              var4 = var10.g((byte) -126);
              var5 = (qk) (Object) kc.field_z.b(0);
              L2: while (true) {
                L3: {
                  if (var5 == null) {
                    break L3;
                  } else {
                    L4: {
                      if (var5.field_k != var3) {
                        break L4;
                      } else {
                        if (var5.field_o != var4) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var5 = (qk) (Object) kc.field_z.f(-24059);
                    continue L2;
                  }
                }
                if (var5 != null) {
                  var5.f(0);
                  break L1;
                } else {
                  ih.b(true);
                  return;
                }
              }
            } else {
              nn.a("LR1: " + me.a(-1), (Throwable) null, -9958);
              ih.b(true);
              break L1;
            }
          } else {
            var4_ref_h = (h) (Object) to.field_s.b(0);
            if (var4_ref_h != null) {
              L5: {
                var5_int = -var10.field_n + oo.field_a;
                var14 = var4_ref_h.field_k;
                var13 = var14;
                var12 = var13;
                var11 = var12;
                var6 = var11;
                if (var5_int > var14.length << -1592443038) {
                  var5_int = var14.length << 1596787554;
                  break L5;
                } else {
                  break L5;
                }
              }
              var7 = 0;
              L6: while (true) {
                if (var7 >= var5_int) {
                  var4_ref_h.field_n = true;
                  var4_ref_h.f(0);
                  break L1;
                } else {
                  var6[var7 >> -1098411454] = var6[var7 >> -1098411454] + (var10.i((byte) -101) << ie.a(768, var7 << -718339416));
                  var7++;
                  continue L6;
                }
              }
            } else {
              ih.b(true);
              return;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
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
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        var25 = Torquing.field_u;
        var6 = 0;
        var7 = param4;
        var8 = param2 * param2;
        var9 = param4 * param4;
        var10 = var9 << 2134152833;
        var11 = var8 << 1360761473;
        var12 = param4 << 1581020257;
        var13 = var10 + var8 * (-var12 + 1);
        var14 = -((-1 + var12) * var11) + var9;
        var15 = var8 << -1111137022;
        var16 = var9 << -1051049182;
        var17 = (3 + (var6 << 990224545)) * var10;
        var18 = ((var7 << -49778943) - 3) * var11;
        var19 = (1 + var6) * var16;
        if (param1 == -1817) {
          di.a(param3 + -param2, (byte) 108, param0, qd.field_a[param5], param3 + param2);
          var20 = (-1 + var7) * var15;
          L0: while (true) {
            if (0 >= var7) {
              return;
            } else {
              L1: {
                if (0 <= var13) {
                  break L1;
                } else {
                  L2: while (true) {
                    if ((var13 ^ -1) <= -1) {
                      break L1;
                    } else {
                      var14 = var14 + var19;
                      var13 = var13 + var17;
                      var6++;
                      var19 = var19 + var16;
                      var17 = var17 + var16;
                      continue L2;
                    }
                  }
                }
              }
              L3: {
                if (var14 >= 0) {
                  break L3;
                } else {
                  var14 = var14 + var19;
                  var13 = var13 + var17;
                  var6++;
                  var17 = var17 + var16;
                  var19 = var19 + var16;
                  break L3;
                }
              }
              var14 = var14 + -var18;
              var13 = var13 + -var20;
              var20 = var20 - var15;
              var18 = var18 - var15;
              var7--;
              var21 = param5 + -var7;
              var22 = param5 - -var7;
              var23 = param3 + var6;
              var24 = -var6 + param3;
              di.a(var24, (byte) 114, param0, qd.field_a[var21], var23);
              di.a(var24, (byte) 37, param0, qd.field_a[var22], var23);
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    public wh() {
        super(1, false);
        ((wh) this).field_v = 4096;
        ((wh) this).field_A = true;
    }

    final static void a(int param0, int param1, byte[] param2, int param3, int param4, int param5, int[] param6, byte param7, int param8, int param9, int param10, int[] param11) {
        int var14 = 0;
        int var15 = 0;
        int var16 = Torquing.field_u;
        int var12 = 256 + -param4;
        int var13 = -param3;
        if (param7 != 29) {
            wh.g((byte) -10);
        }
        while ((var13 ^ -1) > -1) {
            for (var14 = -param10; -1 < (var14 ^ -1); var14++) {
                int incrementValue$0 = param1;
                param1++;
                param0 = param2[incrementValue$0];
                if ((param0 ^ -1) != -1) {
                    var15 = param6[param9];
                    int incrementValue$1 = param9;
                    param9++;
                    param6[incrementValue$1] = ie.a(16711680, var12 * ie.a(var15, 65280)) + ie.a(ie.a(16711935, var15) * var12, -16711936) >> -1611374008;
                } else {
                    param9++;
                }
            }
            param1 = param1 + param8;
            param9 = param9 + param5;
            var13++;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = 0;
        field_x = 0;
    }
}
