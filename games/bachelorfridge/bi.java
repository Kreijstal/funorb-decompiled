/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bi extends jla {
    static long field_j;
    static be[] field_i;
    static int field_g;
    static sna field_h;

    final static void a(int param0, boolean param1, int param2, oha param3, int param4, int param5, int param6, boolean param7, double param8) {
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_24_1 = 0;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        String var11 = null;
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
        String var23 = null;
        String var24 = null;
        String var25 = null;
        int var26 = 0;
        String var27 = null;
        var26 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var27 = param3.a((byte) 37);
              var11 = param3.field_k;
              if (-2 != (param3.field_a ^ -1)) {
                stackIn_4_0 = 0;
                break L1;
              } else {
                stackIn_4_0 = 1;
                break L1;
              }
            }
            L2: {
              var12 = stackIn_4_0;
              var13 = 0;
              if (var12 != 0) {
                if (-1 > (param3.field_g ^ -1)) {
                  stackIn_10_0 = 1;
                  break L2;
                } else {
                  stackIn_10_0 = 0;
                  break L2;
                }
              } else {
                stackIn_10_0 = 0;
                break L2;
              }
            }
            L3: {
              var14 = stackIn_10_0;
              if (var12 != 0) {
                if (-1 != (((t) ((Object) param3)).field_u ^ -1)) {
                  stackIn_16_0 = 1;
                  break L3;
                } else {
                  stackIn_16_0 = 0;
                  break L3;
                }
              } else {
                stackIn_16_0 = 0;
                break L3;
              }
            }
            L4: {
              var15 = stackIn_16_0;
              var16 = 10 + ad.field_h.c(var11, 200);
              if (var14 == 0) {
                stackIn_19_0 = 0;
                break L4;
              } else {
                stackIn_19_0 = 10;
                break L4;
              }
            }
            L5: {


              stackIn_21_1 = ad.field_h.a(var11, 200, var13);

              stackIn_21_2 = ad.field_h.field_F;

              if (var12 != 0) {

                stackIn_22_1 = stackIn_21_1;
                stackIn_22_2 = stackIn_21_2;
                stackIn_22_3 = 2;
                break L5;
              } else {

                stackIn_22_1 = stackIn_21_1;
                stackIn_22_2 = stackIn_21_2;
                stackIn_22_3 = 1;
                break L5;
              }
            }
            L6: {


              stackIn_24_1 = stackIn_22_1 + (stackIn_22_2 << stackIn_22_3);

              if (var15 != 0) {

                stackIn_25_1 = stackIn_24_1;
                stackIn_25_2 = ad.field_h.field_F;
                break L6;
              } else {

                stackIn_25_1 = stackIn_24_1;
                stackIn_25_2 = 0;
                break L6;
              }
            }
            L7: {
              L8: {
                var17 = stackIn_19_0 + (stackIn_25_1 + stackIn_25_2);
                if (param7) {
                  break L8;
                } else {
                  if (!param1) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              var17 = var17 + ad.field_h.field_F;
              break L7;
            }
            L9: {
              if (param5 < param2 + var16 + param4) {
                param4 = param4 + (param5 - 20 - (param4 + var16));
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if (param6 - -var17 > param0) {
                param6 = param6 + (param0 + (-param6 - var17));
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              dg.a(param4 - -13, param6, 6 + var16, var17, 10, 65793, 192);
              ad.field_h.c(var27, 20 + param4, 16 + param6, 0, -1);
              ad.field_h.a(var11, param4 - -20, param6 - -24, 200, 200, 0, -1, 0, 0, var13);
              var18 = ad.field_h.a(var11, 200, 0);
              if (var12 != 0) {
                L12: {
                  var19 = ((t) ((Object) param3)).field_q;
                  var20 = ((t) ((Object) param3)).field_u;
                  if (-1 < (var19 ^ -1)) {
                    break L12;
                  } else {
                    var19 = (int)((double)var19 * param8);
                    break L12;
                  }
                }
                L13: {
                  var21 = param3.field_g;
                  var22 = 40 + (param6 + var18);
                  var23 = lga.a(true, new String[]{String.valueOf(var19)}, qea.field_a);
                  var24 = lga.a(true, new String[]{kna.field_g[var20]}, vf.field_D);
                  var25 = lga.a(true, new String[]{Integer.toString(var21 + -1)}, ona.field_xb);
                  ad.field_h.c(var23, param4 - -20, var22, 0, -1);
                  if (var20 != 0) {
                    var22 = var22 + ad.field_h.field_F;
                    ad.field_h.c(var24, param4 + 20, var22, 0, -1);
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (var21 > 0) {
                    ad.field_h.c(var25, 20 + param4, ad.field_h.field_F + var22, 0, -1);
                    break L14;
                  } else {
                    break L14;
                  }
                }
                if (!param7) {
                  if (!param1) {
                    break L11;
                  } else {
                    ad.field_h.c(wfa.field_r, 20 + param4, ad.field_h.field_F + var22, 2, -1);
                    break L11;
                  }
                } else {
                  ad.field_h.c(gea.field_n, 20 + param4, ad.field_h.field_F * 2 + var22, 2, -1);
                  break L11;
                }
              } else {
                if (param7) {
                  ad.field_h.c(gea.field_n, 20 + param4, var18 + ad.field_h.field_F + ((ad.field_h.field_F << 666517377) + (-4 + param6)), 2, -1);
                  break L11;
                } else {
                  if (param1) {
                    ad.field_h.c(wfa.field_r, param4 + 20, var18 + ad.field_h.field_F + param6 + (-4 + (ad.field_h.field_F << 286541473)), 2, -1);
                    break L11;
                  } else {
                    break L11;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var10 = decompiledCaughtException;
            stackIn_56_0 = (RuntimeException) (var10);

            stackIn_56_1 = new StringBuilder().append("bi.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_57_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_57_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackIn_57_2 = "null";
              break L15;
            } else {
              stackIn_57_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_57_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackIn_57_2 = "{...}";
              break L15;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_57_0), stackIn_57_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    public static void d(byte param0) {
        field_h = null;
        if (param0 != -97) {
            bi.a(8, true, 97, (oha) null, -49, 70, 87, true, 1.3991795379432221);
        }
        field_i = null;
    }

    final static void o(int param0) {
        if (param0 != 2) {
            bi.a(49, true, -128, (oha) null, 0, 127, 48, false, -0.8479634019263611);
        }
        gja.field_m.f((byte) -66);
        if (null == hp.field_d) {
            hp.field_d = new hga(gja.field_m, at.field_i);
        }
        gja.field_m.a((wj) (hp.field_d), (byte) 111);
    }

    void b(boolean param0, int param1, int param2) {
        int var5;
        String var6;
        pia var7;
        int var8;
        int var9;
        int var10;
        kv var11;
        int stackIn_5_0 = 0;
        L0: {
          var11 = this.b(param1, (byte) 74);
          var5 = this.d(param1, param2 + 26891) ? 1 : 0;
          var6 = this.d(false, pj.field_b[this.field_b][param1]);
          var7 = fn.field_n;
          if (var5 == 0) {
            stackIn_5_0 = 8;
            break L0;
          } else {
            if (param0) {
              stackIn_5_0 = 10;
              break L0;
            } else {
              stackIn_5_0 = 9;
              break L0;
            }
          }
        }
        var8 = stackIn_5_0;
        var9 = this.a(param1, true) - -this.b(param1, 40) >> -1267397919;
        if (param2 != 0) {
          return;
        } else {
          L1: {
            var10 = this.a(param1, (byte) -81) - -(this.a(-26, param1) >> -8780767);
            if (var5 == 0) {
              var11.b(-(var11.field_n >> -1464321663) + var9, -22 + var10, 128);
              break L1;
            } else {
              var11.e(-(var11.field_n >> -428642303) + var9, -22 + var10);
              break L1;
            }
          }
          ((po) ((Object) var7)).a(var6, var9, var10 + 6, var8, -1);
          return;
        }
    }

    final void i(int param0) {
        super.i(param0);
        dg.f(0, 0, 640, 480, 0, 128);
        nu.field_e.e(-5, 0);
    }

    bi(int param0) {
        super(param0);
    }

    abstract kv b(int param0, byte param1);

    static {
        field_i = new be[2];
    }
}
