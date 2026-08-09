/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa {
    private boolean field_m;
    int field_o;
    int field_f;
    int field_l;
    int field_d;
    private int field_a;
    ir field_g;
    int field_e;
    int field_j;
    ir field_n;
    hc field_b;
    ir field_c;
    ir field_k;
    int field_i;
    static int[] field_h;
    ir field_p;

    final void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        if (param5 != -54) {
            String var9 = (String) null;
            this.a((String) null, 110, -89, 29);
        }
        vp.b(param3, param1, param0, param6, param2, param4);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        vp.f(param3, param1, param2, param5, param0);
        if (param4 != 13053) {
            this.field_m = true;
        }
    }

    private final void a(String param0, int param1, int param2, int param3) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          L0: {
            L1: {
              var5_int = this.field_b.a(param0);
              var6 = this.field_b.field_C + this.field_b.field_D;
              var7 = param3;
              if (vp.field_i >= 6 + (var7 - -var5_int)) {
                break L1;
              } else {
                var7 = vp.field_i - var5_int - 6;
                break L1;
              }
            }
            L2: {
              var8 = param2 - (this.field_b.field_C - 32);
              if (vp.field_c < 6 + var6 + var8) {
                var8 = -6 + (-var6 + vp.field_c);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param1 == -22550) {
                break L3;
              } else {
                this.field_f = -47;
                break L3;
              }
            }
            vp.e(var7, var8, 6 + var5_int, 6 + var6, this.field_a);
            vp.b(1 + var7, 1 + var8, 4 + var5_int, 4 + var6, this.field_j);
            this.field_b.b(param0, 3 + var7, 3 + var8 - -this.field_b.field_C, this.field_a, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("sa.C(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void a(int param0) {
        int var1 = 63 % ((-74 - param0) / 49);
        field_h = null;
    }

    private final void b(int param0, String param1, int param2, int param3) {
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
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
        var15 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = this.field_f + this.field_e;
              var6 = this.field_o - -this.field_l;
              var7 = this.field_i;
              if (0 != (var7 ^ -1)) {
                break L1;
              } else {
                var7 = this.field_b.field_D + this.field_b.field_I;
                break L1;
              }
            }
            L2: {
              var8 = vp.field_i >> -925601566;
              var9 = this.field_b.a(param1);
              if (param3 == 27201) {
                break L2;
              } else {
                sa.a(51);
                break L2;
              }
            }
            L3: {
              L4: {
                var10 = this.field_b.field_D + this.field_b.field_I;
                var11 = 1;
                if (var8 < var9) {
                  break L4;
                } else {
                  if (param1.indexOf("<br>") == -1) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (var9 <= var8) {
                  var12 = var8;
                  break L5;
                } else {
                  var13 = var9 / var8;
                  var12 = 2 * ((-1 + var13 + var9 % var8) / var13) + var8;
                  break L5;
                }
              }
              L6: {
                if (or.field_b != null) {
                  break L6;
                } else {
                  or.field_b = new String[16];
                  break L6;
                }
              }
              var11 = this.field_b.a(param1, new int[]{var12}, or.field_b);
              var9 = 0;
              var10 = var10 + var7 * (var11 - 1);
              var13 = 0;
              L7: while (true) {
                if (var11 <= var13) {
                  break L3;
                } else {
                  L8: {
                    var14 = this.field_b.a(or.field_b[var13]);
                    if ((var14 ^ -1) < (var9 ^ -1)) {
                      var9 = var14;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  var13++;
                  continue L7;
                }
              }
            }
            L9: {
              var12 = param0;
              if (var9 + var12 + var5_int > vp.field_i) {
                var12 = vp.field_i - (var9 + var5_int);
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              var13 = 32 + (param2 - this.field_b.field_C);
              if (var13 + (var10 + var6) > vp.field_c) {
                var13 = -var6 + -var10 + param2;
                break L10;
              } else {
                break L10;
              }
            }
            vp.e(var12, var13, var9 + var5_int, var6 + var10, this.field_d);
            vp.b(1 + var12, 1 + var13, var9 - -var5_int + -2, var6 + var10 - 2, this.field_j);
            this.field_b.a(param1, var12 - -this.field_f, var13 + this.field_o, var9, var10, this.field_a, -1, 0, 0, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var5 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var5);

            stackIn_30_1 = new StringBuilder().append("sa.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L11;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L11;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(hc param0, int param1) {
        qm var17 = null;
        vi var4 = null;
        ll[] var5 = null;
        rd var16 = null;
        rd var18 = null;
        int var7_int = 0;
        vi var6 = null;
        vi var7 = null;
        de discarded$0 = null;
        us discarded$1 = null;
        vi var8 = null;
        ll[] var9 = null;
        ll[] var10 = null;
        ll dupTemp$2 = null;
        vi var11 = null;
        vi var12 = null;
        ll var13 = null;
        vi var14 = null;
        vi var19 = null;
        int var15 = AceOfSkies.field_G ? 1 : 0;
        try {
            var17 = new qm(param0, 2, 2, 2236962, 1, 1, 1, 2 + (param0.field_D + param0.field_I));
            var17.field_m = 16777215;
            this.field_k = (ir) ((Object) var17);
            var4 = new vi();
            var17.a(var4, 27529);
            this.field_a = 15658734;
            this.field_e = 3;
            this.field_f = 3;
            this.field_d = 15658734;
            this.field_o = 3;
            this.field_b = param0;
            var4.field_d = 15658734;
            var4.field_j = 11711154;
            this.field_l = 3;
            this.field_i = -1;
            this.field_j = 5592405;
            var4.a(-115, 0).a(15658734, param1 ^ -3).a(nl.a(-125, 7829367, 10066329, 8947848), false);
            var4.a(-78, 1).a(nl.a(param1 ^ 1, 13421772, 10066329, 11184810), false);
            var4.a(-42, 3).a(nl.a(-106, 10066329, 7829367, 8947848), false).a(1, (byte) 81).b(1, (byte) -125);
            var5 = new ll[9];
            var16 = new rd(32, 32);
            var18 = var16;
            for (var7_int = 0; var7_int < var18.field_x.length; var7_int++) {
                var16.field_x[var7_int] = 1077952576;
            }
            var5[4] = (ll) ((Object) var18);
            var4.a(param1 ^ -63, 4).a((byte) -50, true).a(var5, false);
            var4.a(-99, 5).a(ce.b(0, 65793, -29003, 0, 0), false).a((byte) -50, true).a(-1, param1 + -5);
            this.field_c = (ir) ((Object) var4);
            var6 = new vi(var4, true);
            var6.field_e = 0;
            var7 = new vi(var4, true);
            var7.field_e = 0;
            var7.a(-117, bs.a(8947848, false));
            var7.a(-105, 1).a(bs.a(11184810, false), false).a(2236962, -2);
            this.field_g = (ir) ((Object) new lj(param0, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
            discarded$0 = new de(param0, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
            discarded$1 = new us(param0, 16777215, -1, 125269879, 4473924, param1, 268435455);
            var8 = new vi();
            var17.a(var8, 27529);
            var8.a(param1 + -58, 0).a(nl.a(-80, 10066329, 7829367, 15658734), false).a(1118481, -2).c(-1, (byte) -79);
            var8.a(-63, 4).a((byte) -50, true).a(var5, false);
            this.field_n = (ir) ((Object) var8);
            var9 = new ll[9];
            var9[4] = new ll(2, 1);
            var10 = new ll[9];
            var10[4] = new ll(1, 2);
            dupTemp$2 = var9[4];
            dupTemp$2.field_x = new int[]{6710886, 7829367};
            var10[4].field_x = new int[]{6710886, 7829367};
            var11 = new vi();
            var12 = new vi();
            var11.a(0, 0, var9);
            var12.a(0, 0, var10);
            var13 = new ll(7, 4);
            var13.field_x = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
            var14 = new vi(var4, true);
            var14.a((byte) -90, var13.d());
            var13.c();
            var14 = new vi(var4, true);
            var14.a((byte) -90, var13.d());
            var13.c();
            var14 = new vi(var4, true);
            var14.a((byte) -90, var13.d());
            var13.c();
            var19 = new vi(var4, true);
            var19.a((byte) -90, var13);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "sa.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, String param1, int param2, int param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              if (!this.field_m) {
                this.a(param1, param0 ^ -10076557, param2, param3);
                break L1;
              } else {
                this.b(param3, param1, param2, 27201);
                break L1;
              }
            }
            L2: {
              if (param0 == 10066329) {
                break L2;
              } else {
                this.a(1, -66, 80, 107, 71, -12);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("sa.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static boolean a(boolean param0) {
        bb var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        bb var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var4 = (bb) ((Object) av.field_c.d(268435455));
            var1 = var4;
            if (var1 != null) {
              L1: {
                if (param0) {
                  break L1;
                } else {
                  field_h = (int[]) null;
                  break L1;
                }
              }
              var2 = 0;
              L2: while (true) {
                if (var1.field_g <= var2) {
                  stackIn_21_0 = 1;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  L3: {
                    if (null != var4.field_f[var2]) {
                      if (var4.field_f[var2].field_a != 0) {
                        break L3;
                      } else {
                        stackIn_12_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (null != var4.field_h[var2]) {
                      if (var4.field_h[var2].field_a == 0) {
                        stackIn_18_0 = 0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  var2++;
                  continue L2;
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1_ref), "sa.I(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_18_0 != 0;
            } else {
              return stackIn_21_0 != 0;
            }
          }
        }
    }

    final static String b(int param0) {
        if (param0 != -25752) {
            field_h = (int[]) null;
        }
        if (!(jq.field_fb != ht.field_k)) {
            return nh.field_b;
        }
        return dp.field_i;
    }

    public sa() {
        this.field_m = true;
    }

    static {
    }
}
