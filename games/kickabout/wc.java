/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc {
    int field_j;
    private boolean field_r;
    gj field_h;
    gj field_c;
    static int[] field_e;
    int field_f;
    int field_d;
    gj field_l;
    hu field_a;
    static String field_q;
    int field_i;
    static sn field_k;
    int field_m;
    gj field_o;
    private int field_b;
    gj field_n;
    int field_p;
    static int[] field_g;
    int field_t;
    private static int[] field_s;

    private final void a(int param0, int param1, byte param2, String param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            var5_int = this.field_a.a(param3);
            var6 = this.field_a.field_L - -this.field_a.field_p;
            var7 = param0;
            if (var7 - -var5_int - -6 > on.field_g) {
                var7 = -6 + -var5_int + on.field_g;
            }
            var8 = -this.field_a.field_L + param1 + 32;
            if (!(var6 + var8 - -6 <= on.field_f)) {
                var8 = -6 + (on.field_f - var6);
            }
            on.e(var7, var8, 6 + var5_int, 6 + var6, this.field_b);
            int var9 = -76 / ((param2 - 58) / 54);
            on.a(1 + var7, 1 + var8, 4 + var5_int, var6 + 4, this.field_t);
            this.field_a.a(param3, var7 + 3, 3 + var8 - -this.field_a.field_L, this.field_b, -1);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "wc.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        on.b(param2, param3, param4, param1, param0);
        if (!param5) {
            this.a(-95, 103, -98, -54, -82, true);
        }
    }

    final void a(int param0, byte param1, int param2, String param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            if (param1 == 115) {
              L1: {
                if (this.field_r) {
                  this.a(param0, param3, param1 + -243, param2);
                  break L1;
                } else {
                  this.a(param0, param2, (byte) 121, param3);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("wc.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6) {
        if (param6 != -2) {
            return;
        }
        on.a(param0, param4, param3, param1, param2, param5);
    }

    final void a(hu param0, int param1) {
        int var7_int = 0;
        id var6 = null;
        id var7 = null;
        ei discarded$0 = null;
        du discarded$1 = null;
        id var8 = null;
        ut[] var9 = null;
        ut[] var10 = null;
        ut dupTemp$2 = null;
        id var11 = null;
        id var12 = null;
        ut var13 = null;
        id var14 = null;
        id var19 = null;
        int var15 = Kickabout.field_G;
        qv var17 = new qv(param0, 2, 2, 2236962, 1, 1, 1, 2 + (param0.field_p + param0.field_G));
        var17.field_b = 16777215;
        this.field_c = (gj) ((Object) var17);
        id var4 = new id();
        var17.a(var4, (byte) -92);
        this.field_t = 5592405;
        var4.field_i = 15658734;
        this.field_a = param0;
        this.field_i = 3;
        var4.field_c = 11711154;
        this.field_p = 3;
        this.field_d = 3;
        this.field_m = 3;
        this.field_b = 15658734;
        this.field_j = 15658734;
        this.field_f = -1;
        var4.a(0, param1 ^ -8811).b(-2, 15658734).a(true, ba.a(7829367, 10066329, 8947848, (byte) -88));
        var4.a(1, -12085).a(true, ba.a(13421772, 10066329, 11184810, (byte) 46));
        var4.a(3, -12085).a(true, ba.a(10066329, 7829367, 8947848, (byte) 46)).a((byte) -90, 1).b((byte) 111, 1);
        ut[] var5 = new ut[9];
        ot var16 = new ot(32, 32);
        ot var18 = var16;
        for (var7_int = 0; var18.field_y.length > var7_int; var7_int++) {
            var16.field_y[var7_int] = 1077952576;
        }
        if (param1 != 3422) {
            return;
        }
        try {
            var5[4] = (ut) ((Object) var18);
            var4.a(4, -12085).a(true, (byte) 113).a(true, var5);
            var4.a(5, -12085).a(true, gl.a(65793, (byte) 115, 0, 0, 0)).a(true, (byte) -90).b(param1 + -3424, -1);
            this.field_l = (gj) ((Object) var4);
            var6 = new id(var4, true);
            var6.field_e = 0;
            var7 = new id(var4, true);
            var7.field_e = 0;
            var7.a(sp.a((byte) 26, 8947848), -23952);
            var7.a(1, -12085).a(true, sp.a((byte) 26, 11184810)).b(-2, 2236962);
            this.field_o = (gj) ((Object) new re(param0, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
            discarded$0 = new ei(param0, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
            discarded$1 = new du(param0, 16777215, -1, 125269879, 4473924, 3, 268435455);
            var8 = new id();
            var17.a(var8, (byte) -87);
            var8.a(0, param1 ^ -8811).a(true, ba.a(10066329, 7829367, 15658734, (byte) -118)).b(-2, 1118481).a(-1, true);
            var8.a(4, param1 ^ -8811).a(true, (byte) -58).a(true, var5);
            this.field_h = (gj) ((Object) var8);
            var9 = new ut[9];
            var10 = new ut[9];
            var9[4] = new ut(2, 1);
            var10[4] = new ut(1, 2);
            dupTemp$2 = var9[4];
            dupTemp$2.field_y = new int[]{6710886, 7829367};
            var10[4].field_y = new int[]{6710886, 7829367};
            var11 = new id();
            var12 = new id();
            var11.a(0, var9, 79);
            var12.a(0, var10, -77);
            var13 = new ut(7, 4);
            var13.field_y = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
            var14 = new id(var4, true);
            var14.a(var13.b(), (byte) -95);
            var13.d();
            var14 = new id(var4, true);
            var14.a(var13.b(), (byte) -114);
            var13.d();
            var14 = new id(var4, true);
            var14.a(var13.b(), (byte) -101);
            var13.d();
            var19 = new id(var4, true);
            var19.a(var13, (byte) -90);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "wc.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        try {
            lb.field_F = true;
            var2 = "tuhstatbut";
            if (param0 > -37) {
                wc.a(48);
            }
            var3 = "rvnadlm";
            var4 = -1L;
            tj.a(var3, param1, (byte) -5, var4, var2);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "wc.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_e = null;
        field_q = null;
        if (param0 != 10) {
            return;
        }
        field_s = null;
        field_k = null;
    }

    public wc() {
        this.field_r = true;
    }

    private final void a(int param0, String param1, int param2, int param3) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
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
        var15 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param2 < -98) {
                break L1;
              } else {
                this.a(-74, -63, -60, 76, -4, 127, (byte) 103);
                break L1;
              }
            }
            L2: {
              var5_int = this.field_d + this.field_i;
              var6 = this.field_p + this.field_m;
              var7 = this.field_f;
              if (-1 != var7) {
                break L2;
              } else {
                var7 = this.field_a.field_p + this.field_a.field_G;
                break L2;
              }
            }
            L3: {
              L4: {
                var8 = on.field_g >> 250040386;
                var9 = this.field_a.a(param1);
                var10 = this.field_a.field_G - -this.field_a.field_p;
                var11 = 1;
                if (var8 < var9) {
                  break L4;
                } else {
                  if (-1 != param1.indexOf("<br>")) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              L5: {
                if (var8 >= var9) {
                  var12 = var8;
                  break L5;
                } else {
                  var13 = var9 / var8;
                  var12 = 2 * ((var13 + var9 % var8 + -1) / var13) + var8;
                  break L5;
                }
              }
              L6: {
                if (null != tl.field_a) {
                  break L6;
                } else {
                  tl.field_a = new String[16];
                  break L6;
                }
              }
              var11 = this.field_a.a(param1, new int[]{var12}, tl.field_a);
              var10 = var10 + (-1 + var11) * var7;
              var9 = 0;
              var13 = 0;
              L7: while (true) {
                if (var11 <= var13) {
                  break L3;
                } else {
                  L8: {
                    var14 = this.field_a.a(tl.field_a[var13]);
                    if (var9 < var14) {
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
              if (var5_int + (var12 + var9) > on.field_g) {
                var12 = on.field_g + (-var9 - var5_int);
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              var13 = 32 + -this.field_a.field_L + param3;
              if (on.field_f >= var6 + (var13 + var10)) {
                break L10;
              } else {
                var13 = -var10 + (param3 - var6);
                break L10;
              }
            }
            on.e(var12, var13, var9 - -var5_int, var10 - -var6, this.field_j);
            on.a(1 + var12, 1 + var13, -2 + var9 - -var5_int, -2 + (var6 + var10), this.field_t);
            this.field_a.a(param1, var12 - -this.field_i, this.field_m + var13, var9, var10, this.field_b, -1, 0, 0, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var5 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var5);

            stackIn_28_1 = new StringBuilder().append("wc.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L11;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L11;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        int var0 = 0;
        field_g = new int[73];
        field_e = new int[]{-290, -280, -280, -190, -310};
        field_q = "<%0> is offering a draw.";
        field_s = new int[73];
        field_s[15] = 3;
        field_s[44] = 1;
        field_s[62] = 3;
        field_s[51] = 3;
        field_s[63] = 5;
        field_s[64] = 3;
        field_s[30] = 4;
        field_s[5] = 4;
        field_s[25] = 3;
        field_s[16] = 5;
        field_s[60] = 2;
        field_s[24] = 3;
        field_s[0] = 10;
        field_s[6] = 10;
        field_s[27] = 1;
        field_s[72] = 3;
        field_s[18] = 3;
        field_s[13] = 3;
        field_s[69] = 2;
        field_s[20] = 4;
        field_s[29] = 5;
        field_s[61] = 5;
        field_s[71] = 5;
        field_s[56] = 3;
        field_s[55] = 3;
        field_s[37] = 1;
        field_s[70] = 3;
        field_s[2] = 1;
        field_s[53] = 3;
        field_s[68] = 2;
        field_s[41] = 3;
        field_s[35] = 5;
        field_s[36] = 5;
        field_s[38] = 2;
        field_s[65] = 5;
        field_s[49] = 5;
        field_s[21] = 3;
        field_s[26] = 3;
        field_s[67] = 2;
        field_s[52] = 3;
        field_s[54] = 5;
        field_s[3] = 1;
        field_s[47] = 2;
        field_s[9] = 3;
        field_s[23] = 10;
        field_s[31] = 4;
        field_s[45] = 2;
        field_s[43] = 2;
        field_s[7] = 1;
        field_s[28] = 5;
        field_s[58] = 2;
        field_s[59] = 2;
        field_s[50] = 3;
        field_s[57] = 3;
        field_s[34] = 5;
        field_s[46] = 3;
        field_s[42] = 5;
        field_s[19] = 3;
        field_s[33] = 2;
        field_s[8] = 4;
        field_s[12] = 5;
        field_s[10] = 3;
        field_s[11] = 3;
        field_s[4] = 2;
        field_s[48] = 3;
        field_s[14] = 4;
        field_s[17] = 4;
        field_s[22] = 3;
        field_s[39] = 3;
        field_s[66] = 10;
        field_s[1] = 1;
        field_s[32] = 3;
        field_s[40] = 2;
        for (var0 = 0; var0 < field_s.length; var0++) {
            field_g[var0] = field_s[var0] * 100;
        }
    }
}
