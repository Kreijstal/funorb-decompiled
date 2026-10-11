/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    ui field_d;
    private int field_k;
    ui field_q;
    int field_c;
    int field_l;
    int field_e;
    int field_g;
    ui field_o;
    ui field_f;
    kg field_m;
    ui field_b;
    static volatile int field_a;
    int field_i;
    int field_j;
    int field_n;
    private boolean field_p;
    static kg field_h;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, e param6, int param7) {
        int stackIn_16_0 = 0;
        int[] stackIn_18_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        oe stackIn_39_0 = null;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var8 = null;
        RuntimeException var8_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        oe var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        e var44 = null;
        int[] var49 = null;
        int[] var54 = null;
        byte[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var14Lifetime2;
        int var15Lifetime2;
        var40 = Transmogrify.field_A ? 1 : 0;
        try {
          if (param4 > -58) {
            field_a = 15;
          }
          var44 = param6;
          if (var44.field_y != null &&
            var44.field_w > 1) {
            var60 = var44.field_y;
            vj.a(ca.field_c, var60, (byte) -69, 0, 0);
          } else {
            qa.c(1702);
          }
          var54 = new int[param6.field_l];
          var49 = var54;
          var41 = var49;
          var8 = var41;
          var64 = new int[param6.field_l];
          var62 = mk.field_w;
          var63 = nh.field_j;
          var61 = d.field_b;
          for (var13 = 0; var13 < param6.field_l; var13++) {
            var14 = var61[var13] * param7 + (param2 * var62[var13] + param3 * var63[var13]) >> 8;
            if (var14 < 0) {
              var14 = -var14;
            }
            if (0 <= var14) {
              if (var14 < 128) {
                stackIn_16_0 = 128 + var14;
              } else {
                stackIn_16_0 = 256;
              }
            } else {
              stackIn_16_0 = 128;
            }
            var14Lifetime2 = stackIn_16_0;
            var15 = param1 * var61[var13] + (var63[var13] * param5 + var62[var13] * param0) >> 8;
            stackIn_18_0 = ug.field_c;
            if (var15 < 0) {
              stackIn_19_1 = -var15;
            } else {
              stackIn_19_1 = var15;
            }
            var15Lifetime2 = stackIn_18_0[stackIn_19_1];
            var14Lifetime2 = var14Lifetime2 * (-var15Lifetime2 + 256) >>> 8;
            var54[var13] = var14Lifetime2;
            var64[var13] = var15Lifetime2;
          }
          for (var13Lifetime1 = 0; var13Lifetime1 < ug.field_h; var13Lifetime1++) {
            var14Lifetime1 = i.field_b[var13Lifetime1];
            var15Lifetime1 = param6.field_o[var14Lifetime1];
            var16 = param6.field_s[var14Lifetime1];
            var17 = param6.field_G[var14Lifetime1];
            if (mk.field_w.length <= param6.field_b[var14Lifetime1]) {
              stackIn_25_0 = -1;
            } else {
              stackIn_25_0 = param6.field_b[var14Lifetime1];
            }
            var18 = stackIn_25_0;
            if (mk.field_w.length > param6.field_n[var14Lifetime1]) {
              stackIn_28_0 = param6.field_n[var14Lifetime1];
            } else {
              stackIn_28_0 = -1;
            }
            var19 = stackIn_28_0;
            if (param6.field_J[var14Lifetime1] < mk.field_w.length) {
              stackIn_31_0 = param6.field_J[var14Lifetime1];
            } else {
              stackIn_31_0 = -1;
            }
            var20 = stackIn_31_0;
            if (rg.field_L != null &&
              param6.field_f != null &&
              var14Lifetime1 < param6.field_f.length &&
              -1 != param6.field_f[var14Lifetime1] &&
              rg.field_L.length > param6.field_f[var14Lifetime1]) {
              stackIn_39_0 = rg.field_L[param6.field_f[var14Lifetime1]];
            } else {
              stackIn_39_0 = null;
            }
            var21 = stackIn_39_0;
            var22 = sg.field_a[var15Lifetime1];
            var23 = d.field_a[var15Lifetime1];
            var24 = sg.field_a[var16];
            var25 = d.field_a[var16];
            var26 = sg.field_a[var17];
            var27 = d.field_a[var17];
            if (var18 == var19 &&
              var20 == var19) {
              var28 = var54[var18];
              var29 = var64[var18];
              if (var21 == null) {
                stackIn_44_0 = 8355711;
              } else {
                stackIn_44_0 = var21.field_b;
              }
              var30 = stackIn_44_0;
              var31 = 16711935 & var30;
              var32 = var30 & 65280;
              var33 = (16711908 & var32 * var28) >>> 8 | (-16711885 & var28 * var31) >>> 8;
              var33 = var33 + var29 * 65793;
              ri.a(var22, (var33 & 16711422) >> 1, var26, var27, (byte) -127, var23, var25, var24);
            } else {
              var28 = var54[var18];
              var29 = var54[var19];
              var30 = var54[var20];
              var31 = var64[var18];
              var32 = var64[var19];
              var33 = var64[var20];
              if (var21 != null) {
                stackIn_48_0 = var21.field_b;
              } else {
                stackIn_48_0 = 8355711;
              }
              var34 = stackIn_48_0;
              var35 = 16711935 & var34;
              var36 = 65280 & var34;
              var37 = (var35 * var28 & -16711934) >>> 8 | (16711865 & var36 * var28) >>> 8;
              var38 = (var29 * var36 & 16711799) >>> 8 | (var29 * var35 & -16711820) >>> 8;
              var38 = var38 + var32 * 65793;
              var39 = (16711897 & var30 * var36) >>> 8 | (-16711842 & var30 * var35) >>> 8;
              var37 = var37 + 65793 * var31;
              var39 = var39 + var33 * 65793;
              kl.a(var38 >> 16, var23, (var39 & 65521) >> 8, var27, var24, var25, var39 & 255, var37 >> 16, (65468 & var37) >> 8, (byte) 44, var26, var38 & 255, 255 & var38 >> 8, var22, var39 >> 16, 255 & var37);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_53_0 = var8_ref;
          stackIn_53_1 = new StringBuilder().append("vd.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',').append(param7).append(')').toString());
        }
    }

    final static int a(String[] args, int param1, String param2, kg param3, byte param4) {
        int var10 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var6Lifetime1;
        var14 = Transmogrify.field_A ? 1 : 0;
        try {
          var5_int = param3.a(param2);
          if (param1 >= var5_int &&
            -1 == param2.indexOf("<br>")) {
            args[0] = param2;
            stackIn_5_0 = 1;
            return stackIn_5_0;
          }
          var6 = (-1 + (var5_int + param1)) / param1;
          param1 = var5_int / var6;
          var6Lifetime1 = 0;
          var8 = 22 % ((5 - param4) / 58);
          var7 = 0;
          var9 = param2.length();
          for (var10 = 0; var10 < var9; var10++) {
            var11 = param2.charAt(var10);
            if (var11 == 32 ||
              var11 == 45) {
              var12 = param2.substring(var7, 1 + var10).trim();
              var13 = param3.a(var12);
              if (param1 <= var13) {
                incrementValue$1 = var6Lifetime1;
                var6Lifetime1++;
                args[incrementValue$1] = var12;
                var7 = var10 + 1;
              }
            }
            if (62 == var11 &&
              param2.regionMatches(-3 + var10, "<br>", 0, 4)) {
              incrementValue$2 = var6Lifetime1;
              var6Lifetime1++;
              args[incrementValue$2] = param2.substring(var7, -3 + var10).trim();
              var7 = 1 + var10;
            }
          }
          if (var7 < var9) {
            incrementValue$0 = var6Lifetime1;
            var6Lifetime1++;
            args[incrementValue$0] = param2.substring(var7, var9).trim();
          }
          stackIn_25_0 = var6Lifetime1;
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_28_0 = var5;
          stackIn_28_1 = new StringBuilder().append("vd.D(");
          if (args == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param3 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0) {
        int var8_int = 0;
        String[][] dupTemp$0 = null;
        long[][] dupTemp$1 = null;
        int[][] dupTemp$2 = null;
        int var19 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        o var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        int var6 = 0;
        am var6_ref_am = null;
        int var7 = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        kg var27 = null;
        hj var28 = null;
        int var25Lifetime1;
        int var25Lifetime2;
        var26 = Transmogrify.field_A ? 1 : 0;
        try {
          var28 = nf.field_l;
          var2 = var28.d((byte) 114);
          if (var2 == 0) {
            var3 = var28.a((byte) -97);
            var4 = (o) (mh.field_a.a((byte) -95));
            while (var4 != null) {
              if (~var3 != ~var4.field_j) {
                var4 = (o) (mh.field_a.a(true));
                continue;
              }
              break;
            }
            if (var4 == null) {
              pc.a(param0 ^ 17);
              return;
            }
            var5 = var28.d((byte) 53);
            if (0 != var5) {
              var6 = var4.field_h;
              od.field_l[0].field_a = null;
              od.field_l[0].field_e = w.field_a;
              od.field_l[0].field_c = false;
              var7 = var4.field_n;
              for (var8_int = 1; var5 > var8_int; var8_int++) {
                od.field_l[var8_int].field_e = var28.g(12248);
                od.field_l[var8_int].field_c = false;
                if (var28.d((byte) 72) == 1) {
                  od.field_l[var8_int].field_a = var28.g(12248);
                } else {
                  od.field_l[var8_int].field_a = null;
                }
              }
              dupTemp$0 = new String[3][var6];
              var4.field_m = dupTemp$0;
              var8 = dupTemp$0;
              var9 = new String[3][var6];
              dupTemp$1 = new long[3][var6];
              var4.field_g = dupTemp$1;
              var10 = dupTemp$1;
              dupTemp$2 = new int[3][var6 * var7];
              var4.field_l = dupTemp$2;
              var11 = dupTemp$2;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              var16 = 0;
              var17 = 0;
              var18 = var28.d((byte) 41);
              if (var18 > 0) {
                for (var19 = 0; var19 < var18; var19++) {
                  var20 = var28.d((byte) 102);
                  var21 = od.field_l[var20].field_e;
                  var22 = var28.e((byte) 115);
                  var24 = var28.field_h;
                  if (var6 > var19) {
                    var8[0][var12] = var21;
                    var9[0][var12] = od.field_l[var20].field_a;
                    var10[0][var12] = var22;
                    var12++;
                    for (var25 = 0; var7 > var25; var25++) {
                      incrementValue$3 = var15;
                      var15++;
                      var11[0][incrementValue$3] = var28.c((byte) -126);
                    }
                  }
                  if (var21 != null &&
                    qg.a(var21, (byte) 78)) {
                    var8[1][var13] = w.field_a;
                    var9[1][var13] = null;
                    var10[1][var13] = var22;
                    var13++;
                    var28.field_h = var24;
                    for (var25Lifetime1 = 0; var25Lifetime1 < var7; var25Lifetime1++) {
                      incrementValue$4 = var16;
                      var16++;
                      var11[1][incrementValue$4] = var28.c((byte) -115);
                    }
                  }
                  if (var6 > var14 &&
                    !od.field_l[var20].field_c) {
                    od.field_l[var20].field_c = true;
                    var8[2][var14] = var21;
                    var9[2][var14] = od.field_l[var20].field_a;
                    var10[2][var14] = var22;
                    var14++;
                    var28.field_h = var24;
                    for (var25Lifetime2 = 0; var25Lifetime2 < var7; var25Lifetime2++) {
                      incrementValue$5 = var17;
                      var17++;
                      var11[2][incrementValue$5] = var28.c((byte) -110);
                    }
                  }
                }
              }
            }
            var4.field_k = true;
            var4.c(5);
          } else if (var2 == 1) {
            var3 = var28.a((byte) -96);
            var4_long = var28.e((byte) 110);
            var6_ref_am = (am) (ec.field_b.a((byte) -95));
            while (var6_ref_am != null) {
              if (~var3 != ~var6_ref_am.field_p) {
                var6_ref_am = (am) (ec.field_b.a(true));
                continue;
              }
              break;
            }
            if (var6_ref_am == null) {
              pc.a(1);
              return;
            }
            var6_ref_am.field_o = var4_long;
            var6_ref_am.c(param0 - 11);
          } else {
            d.a((Throwable) null, 94, "HS1: " + ik.q(48));
            pc.a(1);
          }
          if (param0 != 16) {
            var27 = (kg) null;
            vd.a((String[]) null, 74, (String) null, (kg) null, (byte) 117);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1), "vd.J(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 >= -111) {
          field_h = (kg) null;
        }
        field_h = null;
    }

    final void a(int param0, kg param1) {
        jf var16 = null;
        jf var18 = null;
        int var7_int = 0;
        ki var6 = null;
        ki var7 = null;
        pa discarded$0 = null;
        ij discarded$1 = null;
        ki var8 = null;
        ti[] var9 = null;
        ti[] var10 = null;
        ti dupTemp$2 = null;
        ki var11 = null;
        ki var12 = null;
        ti var13 = null;
        ki var14 = null;
        ki var19 = null;
        int var15 = Transmogrify.field_A ? 1 : 0;
        h var17 = new h(param1, 2, 2, 2236962, 1, 1, 1, 2 + (param1.field_t + param1.field_y));
        ki var14Lifetime1;
        ki var14Lifetime2;
        this.field_q = (ui) ((Object) var17);
        var17.field_f = 16777215;
        ki var4 = new ki();
        var17.a((byte) -106, var4);
        this.field_g = 15658734;
        var4.field_n = 15658734;
        this.field_l = 3;
        this.field_j = -1;
        this.field_c = 3;
        this.field_e = 3;
        this.field_n = 5592405;
        this.field_k = 15658734;
        var4.field_g = 11711154;
        this.field_m = param1;
        this.field_i = 3;
        var4.a((byte) -21, 0).a(-108, 15658734).a(we.a(8947848, 124, 7829367, 10066329), (byte) 32);
        var4.a((byte) -21, 1).a(we.a(11184810, 117, 13421772, 10066329), (byte) 32);
        var4.a((byte) -21, 3).a(we.a(8947848, 112, 10066329, 7829367), (byte) 32).a(1, (byte) 112).a(1, false);
        ti[] var5 = new ti[9];
        if (param0 >= -12) {
          return;
        }
        try {
          var16 = new jf(32, 32);
          var18 = var16;
          for (var7_int = 0; var18.field_w.length > var7_int; var7_int++) {
            var16.field_w[var7_int] = 1077952576;
          }
          var5[4] = (ti) ((Object) var18);
          var4.a((byte) -21, 4).a(true, 256).a(var5, (byte) 32);
          var4.a((byte) -21, 5).a(bh.a(65793, -118, 0, 0, 0), (byte) 32).a(true, 256).a(-116, -1);
          this.field_d = (ui) ((Object) var4);
          var6 = new ki(var4, true);
          var6.field_b = 0;
          var7 = new ki(var4, true);
          var7.field_b = 0;
          var7.a(qa.a(68, 8947848), -114);
          var7.a((byte) -21, 1).a(qa.a(64, 11184810), (byte) 32).a(-81, 2236962);
          this.field_b = (ui) ((Object) new wi(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
          discarded$0 = new pa(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
          discarded$1 = new ij(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
          var8 = new ki();
          var17.a((byte) -106, var8);
          var8.a((byte) -21, 0).a(we.a(15658734, 116, 10066329, 7829367), (byte) 32).a(-62, 1118481).b(-1, (byte) -102);
          var8.a((byte) -21, 4).a(true, 256).a(var5, (byte) 32);
          this.field_f = (ui) ((Object) var8);
          var9 = new ti[9];
          var10 = new ti[9];
          var9[4] = new ti(2, 1);
          var10[4] = new ti(1, 2);
          dupTemp$2 = var9[4];
          dupTemp$2.field_w = new int[]{6710886, 7829367};
          var10[4].field_w = new int[]{6710886, 7829367};
          var11 = new ki();
          var12 = new ki();
          var11.a(0, -19106, var9);
          var12.a(0, -19106, var10);
          var13 = new ti(7, 4);
          var13.field_w = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
          var14 = new ki(var4, true);
          var14.a(var13.a(), 1);
          var13.f();
          var14Lifetime1 = new ki(var4, true);
          var14Lifetime1.a(var13.a(), 1);
          var13.f();
          var14Lifetime2 = new ki(var4, true);
          var14Lifetime2.a(var13.a(), 1);
          var13.f();
          var19 = new ki(var4, true);
          var19.a(var13, 1);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "vd.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, String param2, int param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (!this.field_p) {
            this.a((byte) 89, param3, param2, param0);
          } else {
            this.a(param0, (byte) 125, param3, param2);
          }
          if (param1 < 6) {
            this.field_f = (ui) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("vd.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(int param0, byte param1, int param2, String param3) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
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
        int var11Lifetime1;
        int var13Lifetime1;
        int var13Lifetime2;
        var15 = Transmogrify.field_A ? 1 : 0;
        try {
          var5_int = this.field_c + this.field_i;
          var6 = this.field_e + this.field_l;
          var7 = this.field_j;
          if (var7 == -1) {
            var7 = this.field_m.field_t + this.field_m.field_y;
          }
          if (param1 <= 119) {
            vd.a(-109);
          }
          var8 = sb.field_c >> 2;
          var9 = this.field_m.a(param3);
          var10 = this.field_m.field_t + this.field_m.field_y;
          var11 = 1;
          if (var9 > var8 ||
            param3.indexOf("<br>") != -1) {
            if (oi.field_l == null) {
              oi.field_l = new String[16];
            }
            if (var8 >= var9) {
              var12 = var8;
            } else {
              var13 = var9 / var8;
              var12 = 2 * ((var9 % var8 + var13 - 1) / var13) + var8;
            }
            var11Lifetime1 = this.field_m.a(param3, new int[]{var12}, oi.field_l);
            var10 = var10 + (-1 + var11Lifetime1) * var7;
            var9 = 0;
            for (var13Lifetime2 = 0; var11Lifetime1 > var13Lifetime2; var13Lifetime2++) {
              var14 = this.field_m.a(oi.field_l[var13Lifetime2]);
              if (var9 < var14) {
                var9 = var14;
              }
            }
          }
          var12 = param2;
          if (var5_int + var12 + var9 > sb.field_c) {
            var12 = sb.field_c - var9 - var5_int;
          }
          var13Lifetime1 = 32 + (-this.field_m.field_D + param0);
          if (var13Lifetime1 + var10 + var6 > sb.field_g) {
            var13Lifetime1 = param0 - var10 - var6;
          }
          sb.d(var12, var13Lifetime1, var9 + var5_int, var6 + var10, this.field_g);
          sb.a(1 + var12, var13Lifetime1 + 1, var9 - (-var5_int + 2), var10 + var6 - 2, this.field_n);
          this.field_m.a(param3, var12 + this.field_c, this.field_l + var13Lifetime1, var9, var10, this.field_k, -1, 0, 0, var7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_31_0 = var5;
          stackIn_31_1 = new StringBuilder().append("vd.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    private final void a(byte param0, int param1, String param2, int param3) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          var5_int = this.field_m.a(param2);
          var6 = this.field_m.field_D + this.field_m.field_t;
          var7 = param1;
          if (var5_int + (var7 + 6) > sb.field_c) {
            var7 = sb.field_c - var5_int - 6;
          }
          var8 = 32 - this.field_m.field_D + param3;
          if (var8 - (-var6 - 6) > sb.field_g) {
            var8 = -6 - var6 + sb.field_g;
          }
          sb.d(var7, var8, var5_int + 6, var6 + 6, this.field_k);
          sb.a(1 + var7, var8 + 1, 4 + var5_int, 4 + var6, this.field_n);
          if (param0 != 89) {
            vd.a((byte) -12);
          }
          this.field_m.b(param2, var7 + 3, this.field_m.field_D + 3 + var8, this.field_k, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("vd.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, byte param5) {
        if (param5 != 119) {
          this.field_l = -85;
        }
        sb.e(param0, param3, param4, param2, param1);
    }

    public vd() {
        this.field_p = true;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param6 != 4) {
          this.field_g = 23;
        }
        sb.c(param3, param1, param2, param5, param4, param0);
    }

    static {
        field_a = 0;
    }
}
