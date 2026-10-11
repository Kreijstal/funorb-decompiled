/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class td extends ms {
    byte[] field_q;
    static String field_l;
    qp[] field_o;
    byte[] field_t;
    mq[] field_n;
    private int[] field_p;
    static boolean field_m;
    static int field_u;
    byte[] field_r;
    short[] field_k;
    int field_s;

    final boolean a(byte[] param0, int[] param1, og param2, int param3) {
        int var8 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var9 = 0;
        int var10 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          var5_int = 1;
          if (param3 != 1255750754) {
            return false;
          }
          var6 = 0;
          var7 = null;
          for (var8 = 0; var8 < 128; var8++) {
            if (param0 == null ||
              param0[var8] != 0) {
              var9 = this.field_p[var8];
              if (var9 != 0) {
                if (var6 != var9) {
                  var6 = var9;
                  var9--;
                  if ((1 & var9) != 0) {
                    var7 = param2.b(-94, param1, var9 >> 2);
                  } else {
                    var7 = param2.a(var9 >> 2, param1, 10709);
                  }
                  if (var7 == null) {
                    var5_int = 0;
                  }
                }
                if (var7 != null) {
                  this.field_o[var8] = (qp) (var7);
                  this.field_p[var8] = 0;
                }
              }
            }
          }
          stackIn_20_0 = var5_int;
          return stackIn_20_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("td.D(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_l = null;
        if (param0 <= 62) {
          td.a(86, -115L);
        }
    }

    final static java.net.URL a(byte param0, java.applet.Applet param1, java.net.URL param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_10_0 = null;
        java.net.URL stackIn_12_0 = null;
        Object stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = null;
          var4 = null;
          if (bf.field_d != null &&
            !bf.field_d.equals(param1.getParameter("settings"))) {
            var3 = bf.field_d;
            var4 = var3;
            var4 = var3;
          }
          if (js.field_J != null &&
            !js.field_J.equals(param1.getParameter("session"))) {
            var4 = js.field_J;
          }
          if (param0 >= 120) {
            stackIn_12_0 = ej.a(param2, (String) (var4), -1, (String) (var3), -1);
            return stackIn_12_0;
          }
          stackIn_10_0 = (java.net.URL) null;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("td.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw qo.a((Throwable) (stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final void d(byte param0) {
        this.field_p = null;
        int var2 = -58 % ((param0 - 73) / 51);
    }

    final static byte[] a(int param0, int param1) {
        gg var2;
        byte[] var3_ref_byte__;
        int var3;
        Random var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        byte[] var10;
        byte[] var11;
        int var5Lifetime1;
        var9 = Sumoblitz.field_L ? 1 : 0;
        var2 = (gg) (pi.field_a.a((byte) -88, (long)param0));
        if (var2 == null) {
          var11 = new byte[512];
          var10 = var11;
          var3_ref_byte__ = var10;
          var4 = new Random((long)param0);
          for (var5 = 0; var5 < 255; var5++) {
            var3_ref_byte__[var5] = (byte)var5;
          }
          for (var5Lifetime1 = 0; 255 > var5Lifetime1; var5Lifetime1++) {
            var6 = 255 - var5Lifetime1;
            var7 = fi.a(var6, var4, (byte) -96);
            var8 = var11[var7];
            var3_ref_byte__[var7] = var11[var6];
            var3_ref_byte__[-var5Lifetime1 + 511] = (byte) var8;
            var3_ref_byte__[var6] = (byte) var8;
          }
          var2 = new gg(var11);
          pi.field_a.a((long)param0, var2, -128);
        }
        var3 = -104 / ((60 - param1) / 58);
        return var2.field_s;
    }

    final static String a(int param0, long param1) {
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        StringBuilder discarded$0 = null;
        int var11 = Sumoblitz.field_L ? 1 : 0;
        if (param1 <= 0L) {
          return null;
        }
        if (6582952005840035281L <= param1) {
          return null;
        }
        if (param1 % 37L == 0L) {
          return null;
        }
        if (param0 != -29275) {
          field_u = 98;
        }
        int var3 = 0;
        long var4 = param1;
        while (var4 != 0L) {
          var3++;
          var4 = var4 / 37L;
        }
        StringBuilder var6 = new StringBuilder(var3);
        while (param1 != 0L) {
          var7 = param1;
          param1 = param1 / 37L;
          var9 = vm.field_b[(int)(-(37L * param1) + var7)];
          if (var9 == 95) {
            var10 = var6.length() - 1;
            var9 = 160;
            var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
          }
          discarded$0 = var6.append((char) var9);
        }
        var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    final static void c(byte param0) {
        int var1_int = 0;
        ah var2 = null;
        int var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param0 != 77) {
            field_u = -102;
          }
          if (aa.field_a != null) {
            for (var1_int = 0; var1_int < db.field_l; var1_int++) {
              var2 = aa.field_a[var1_int];
              if (var2 != null) {
                var2.d(-76);
              }
            }
          }
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "td.B(" + param0 + ')');
        }
    }

    td(byte[] param0) {
        int var11_int = 0;
        int incrementValue$0 = 0;
        mq dupTemp$8 = null;
        int incrementValue$6 = 0;
        int var25_int = 0;
        int incrementValue$3 = 0;
        byte[] stackIn_39_0 = null;
        byte[] stackIn_42_0 = null;
        RuntimeException stackIn_205_0 = null;
        StringBuilder stackIn_205_1 = null;
        String stackIn_206_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        byte[] var10 = null;
        byte[] var11 = null;
        int var12 = 0;
        int var13_int = 0;
        mq[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        byte[] var15 = null;
        mq var15_ref = null;
        byte[] var16 = null;
        int var16_int = 0;
        int var17 = 0;
        byte[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        Object var25 = null;
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
        int var37 = 0;
        fs var38 = null;
        byte[] var39 = null;
        mq var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        mq var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        mq var48 = null;
        mq var49 = null;
        mq var50 = null;
        mq var51 = null;
        mq var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        byte[] var57 = null;
        byte[] var58 = null;
        int var5Lifetime1;
        int var8Lifetime1;
        int var19Lifetime1;
        int var19Lifetime2;
        int var19Lifetime3;
        int var19Lifetime4;
        int var19Lifetime5;
        int var19Lifetime6;
        int var20Lifetime1;
        int var20Lifetime2;
        int var20Lifetime3;
        int var20Lifetime4;
        int var20Lifetime5;
        int var20Lifetime6;
        int var21Lifetime1;
        int var21Lifetime2;
        int var21Lifetime3;
        int var21Lifetime4;
        int var23Lifetime1;
        int var24Lifetime1;
        int var26Lifetime1;
        int var27Lifetime1;
        int var27Lifetime2;
        int var27Lifetime3;
        int var27Lifetime4;
        int var27Lifetime5;
        int var27Lifetime6;
        int var27Lifetime7;
        int var27Lifetime8;
        int var27Lifetime9;
        int var27Lifetime10;
        int var27Lifetime11;
        int var27Lifetime12;
        int var28Lifetime1;
        int var29Lifetime1;
        int var29Lifetime2;
        int var29Lifetime3;
        int var29Lifetime4;
        int var30Lifetime1;
        int var31Lifetime1;
        int var32Lifetime1;
        int var33Lifetime1;
        int var34Lifetime1;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        int var16_intLifetime1;
        int var29Lifetime5;
        int var30Lifetime2;
        int var27Lifetime6Lifetime1;
        int var27Lifetime7Lifetime1;
        int var29Lifetime3Lifetime1;
        int var29Lifetime4Lifetime1;
        int var30Lifetime1Lifetime1;
        int var30Lifetime1Lifetime2;
        int var31Lifetime1Lifetime1;
        try {
          this.field_k = new short[128];
          this.field_n = new mq[128];
          this.field_q = new byte[128];
          this.field_o = new qp[128];
          this.field_p = new int[128];
          this.field_t = new byte[128];
          this.field_r = new byte[128];
          var38 = new fs(param0);
          for (var3 = 0; var38.field_n[var38.field_p + var3] != 0; var3++) {
          }
          var55 = new byte[var3];
          var42 = var55;
          var4 = var42;
          for (var5 = 0; var3 > var5; var5++) {
            var4[var5] = var38.d(true);
          }
          var3++;
          var38.field_p = var38.field_p + 1;
          var5Lifetime1 = var38.field_p;
          var38.field_p = var38.field_p + var3;
          for (var6 = 0; 0 != var38.field_n[var6 + var38.field_p]; var6++) {
          }
          var56 = new byte[var6];
          var43 = var56;
          var7 = var43;
          for (var8 = 0; var6 > var8; var8++) {
            var7[var8] = var38.d(true);
          }
          var6++;
          var38.field_p = var38.field_p + 1;
          var8Lifetime1 = var38.field_p;
          var38.field_p = var38.field_p + var6;
          for (var9 = 0; var38.field_n[var9 + var38.field_p] != 0; var9++) {
          }
          var57 = new byte[var9];
          var44 = var57;
          var10 = var44;
          for (var11_int = 0; var9 > var11_int; var11_int++) {
            var10[var11_int] = var38.d(true);
          }
          var9++;
          var38.field_p = var38.field_p + 1;
          var53 = new byte[var9];
          var39 = var53;
          var11 = var39;
          if (var9 > 1) {
            var53[1] = (byte) 1;
            var12 = 2;
            var13_int = 1;
            for (var14 = 2; var9 > var14; var14++) {
              var15_int = var38.e(-31302);
              if (var15_int == 0) {
                incrementValue$0 = var12;
                var12++;
                var13_int = incrementValue$0;
              } else {
                if (var13_int >= var15_int) {
                  var15_int--;
                }
                var13_int = var15_int;
              }
              var11[var14] = (byte)var13_int;
            }
          } else {
            var12 = var9;
          }
          var13 = new mq[var12];
          for (var14Lifetime1 = 0; var14Lifetime1 < var13.length; var14Lifetime1++) {
            dupTemp$8 = new mq();
            var13[var14Lifetime1] = dupTemp$8;
            var40 = dupTemp$8;
            var15_ref = var40;
            var16_int = var38.e(-31302);
            if (var16_int > 0) {
              var15_ref.field_g = new byte[var16_int * 2];
            }
            var16_intLifetime1 = var38.e(-31302);
            if (var16_intLifetime1 > 0) {
              var15_ref.field_h = new byte[2 + 2 * var16_intLifetime1];
              var40.field_h[1] = (byte)64;
            }
          }
          var14Lifetime2 = var38.e(-31302);
          if (0 < var14Lifetime2) {
            stackIn_39_0 = new byte[2 * var14Lifetime2];
          } else {
            stackIn_39_0 = null;
          }
          var58 = stackIn_39_0;
          var46 = var58;
          var15 = var46;
          var14Lifetime3 = var38.e(-31302);
          if (0 >= var14Lifetime3) {
            stackIn_42_0 = null;
          } else {
            stackIn_42_0 = new byte[2 * var14Lifetime3];
          }
          var47 = stackIn_42_0;
          var16 = var47;
          for (var17 = 0; var38.field_n[var38.field_p + var17] != 0; var17++) {
          }
          var54 = new byte[var17];
          var41 = var54;
          var18 = var41;
          for (var19 = 0; var19 < var17; var19++) {
            var18[var19] = var38.d(true);
          }
          var38.field_p = var38.field_p + 1;
          var17++;
          var19Lifetime1 = 0;
          for (var20 = 0; var20 < 128; var20++) {
            var19Lifetime1 = var19Lifetime1 + var38.e(-31302);
            this.field_k[var20] = (short)var19Lifetime1;
          }
          var19Lifetime2 = 0;
          for (var20Lifetime1 = 0; var20Lifetime1 < 128; var20Lifetime1++) {
            var19Lifetime2 = var19Lifetime2 + var38.e(-31302);
            this.field_k[var20Lifetime1] = (short)(this.field_k[var20Lifetime1] + (var19Lifetime2 << 8));
          }
          var20Lifetime2 = 0;
          var21 = 0;
          var22 = 0;
          for (var23 = 0; var23 < 128; var23++) {
            if (0 == var20Lifetime2) {
              if (var21 >= var54.length) {
                var20Lifetime2 = -1;
              } else {
                var20Lifetime2 = var18[var21++];
              }
              var22 = var38.f((byte) 93);
            }
            this.field_k[var23] = (short)(this.field_k[var23] + (eb.a(-1 + var22, 2) << 14));
            this.field_p[var23] = var22;
            var20Lifetime2--;
          }
          var20Lifetime3 = 0;
          var21Lifetime1 = 0;
          var23Lifetime1 = 0;
          for (var24 = 0; var24 < 128; var24++) {
            if (0 != this.field_p[var24]) {
              if (var20Lifetime3 == 0) {
                if (var55.length <= var21Lifetime1) {
                  var20Lifetime3 = -1;
                } else {
                  var20Lifetime3 = var4[var21Lifetime1++];
                }
                incrementValue$6 = var5Lifetime1;
                var5Lifetime1++;
                var23Lifetime1 = -1 + var38.field_n[incrementValue$6];
              }
              this.field_r[var24] = (byte)var23Lifetime1;
              var20Lifetime3--;
            }
          }
          var21Lifetime2 = 0;
          var20Lifetime4 = 0;
          var24Lifetime1 = 0;
          for (var25_int = 0; var25_int < 128; var25_int++) {
            if (this.field_p[var25_int] != 0) {
              if (var20Lifetime4 == 0) {
                incrementValue$3 = var8Lifetime1;
                var8Lifetime1++;
                var24Lifetime1 = 16 + var38.field_n[incrementValue$3] << 2;
                if (var56.length > var21Lifetime2) {
                  var20Lifetime4 = var7[var21Lifetime2++];
                } else {
                  var20Lifetime4 = -1;
                }
              }
              var20Lifetime4--;
              this.field_t[var25_int] = (byte)var24Lifetime1;
            }
          }
          var21Lifetime3 = 0;
          var20Lifetime5 = 0;
          var25 = null;
          for (var26 = 0; var26 < 128; var26++) {
            if (this.field_p[var26] != 0) {
              if (var20Lifetime5 == 0) {
                var25 = var13[var53[var21Lifetime3]];
                if (var57.length <= var21Lifetime3) {
                  var20Lifetime5 = -1;
                } else {
                  var20Lifetime5 = var10[var21Lifetime3++];
                }
              }
              this.field_n[var26] = (mq) (var25);
              var20Lifetime5--;
            }
          }
          var20Lifetime6 = 0;
          var21Lifetime4 = 0;
          var26Lifetime1 = 0;
          for (var27 = 0; 128 > var27; var27++) {
            if (var20Lifetime6 == 0) {
              if (var54.length <= var21Lifetime4) {
                var20Lifetime6 = -1;
              } else {
                var20Lifetime6 = var18[var21Lifetime4++];
              }
              if (this.field_p[var27] > 0) {
                var26Lifetime1 = var38.e(-31302) + 1;
              }
            }
            var20Lifetime6--;
            this.field_q[var27] = (byte)var26Lifetime1;
          }
          this.field_s = 1 + var38.e(-31302);
          for (var27Lifetime1 = 0; var12 > var27Lifetime1; var27Lifetime1++) {
            var45 = var13[var27Lifetime1];
            if (var45.field_g != null) {
              for (var29 = 1; var45.field_g.length > var29; var29 += 2) {
                var45.field_g[var29] = var38.d(true);
              }
            }
            if (var45.field_h != null) {
              for (var29Lifetime5 = 3; var29Lifetime5 < -2 + var45.field_h.length; var29Lifetime5 += 2) {
                var45.field_h[var29Lifetime5] = var38.d(true);
              }
            }
          }
          if (var15 != null) {
            for (var27Lifetime2 = 1; var27Lifetime2 < var58.length; var27Lifetime2 += 2) {
              var15[var27Lifetime2] = var38.d(true);
            }
          }
          if (var16 != null) {
            for (var27Lifetime3 = 1; var27Lifetime3 < var47.length; var27Lifetime3 += 2) {
              var16[var27Lifetime3] = var38.d(true);
            }
          }
          for (var27Lifetime4 = 0; var27Lifetime4 < var12; var27Lifetime4++) {
            var48 = var13[var27Lifetime4];
            if (var48.field_h != null) {
              var19Lifetime3 = 0;
              for (var29Lifetime1 = 2; var29Lifetime1 < var48.field_h.length; var29Lifetime1 += 2) {
                var19Lifetime3 = var38.e(-31302) + (var19Lifetime3 + 1);
                var48.field_h[var29Lifetime1] = (byte)var19Lifetime3;
              }
            }
          }
          for (var27Lifetime5 = 0; var12 > var27Lifetime5; var27Lifetime5++) {
            var49 = var13[var27Lifetime5];
            if (var49.field_g != null) {
              var19Lifetime4 = 0;
              for (var29Lifetime2 = 2; var49.field_g.length > var29Lifetime2; var29Lifetime2 += 2) {
                var19Lifetime4 = var38.e(-31302) + (var19Lifetime4 + 1);
                var49.field_g[var29Lifetime2] = (byte)var19Lifetime4;
              }
            }
          }
          if (var15 != null) {
            var19Lifetime5 = var38.e(-31302);
            var15[0] = (byte)var19Lifetime5;
            for (var27Lifetime6 = 2; var27Lifetime6 < var58.length; var27Lifetime6 += 2) {
              var19Lifetime5 = 1 + var19Lifetime5 + var38.e(-31302);
              var15[var27Lifetime6] = (byte)var19Lifetime5;
            }
            var27Lifetime6Lifetime1 = var58[0];
            var28 = var58[1];
            for (var29Lifetime3 = 0; var29Lifetime3 < var27Lifetime6Lifetime1; var29Lifetime3++) {
              this.field_q[var29Lifetime3] = (byte)(32 + this.field_q[var29Lifetime3] * var28 >> 6);
            }
            var29Lifetime3Lifetime1 = 2;
            while (var58.length > var29Lifetime3Lifetime1) {
              var30 = var58[var29Lifetime3Lifetime1];
              var31 = var15[var29Lifetime3Lifetime1 + 1];
              var32 = (-var27Lifetime6Lifetime1 + var30) * var28 + (-var27Lifetime6Lifetime1 + var30) / 2;
              for (var33 = var27Lifetime6Lifetime1; var30 > var33; var33++) {
                var34 = dh.b(var32, var30 - var27Lifetime6Lifetime1, false);
                var32 = var32 + (var31 - var28);
                this.field_q[var33] = (byte)(32 + this.field_q[var33] * var34 >> 6);
              }
              var28 = var31;
              var29Lifetime3Lifetime1 += 2;
              var27Lifetime6Lifetime1 = var30;
            }
            var15 = null;
            for (var30Lifetime2 = var27Lifetime6Lifetime1; var30Lifetime2 < 128; var30Lifetime2++) {
              this.field_q[var30Lifetime2] = (byte)(this.field_q[var30Lifetime2] * var28 + 32 >> 6);
            }
          }
          if (var16 != null) {
            var19Lifetime6 = var38.e(-31302);
            var16[0] = (byte)var19Lifetime6;
            for (var27Lifetime7 = 2; var27Lifetime7 < var47.length; var27Lifetime7 += 2) {
              var19Lifetime6 = 1 + var19Lifetime6 + var38.e(-31302);
              var16[var27Lifetime7] = (byte)var19Lifetime6;
            }
            var27Lifetime7Lifetime1 = var47[0];
            var28Lifetime1 = var47[1] << 1;
            for (var29Lifetime4 = 0; var29Lifetime4 < var27Lifetime7Lifetime1; var29Lifetime4++) {
              var30Lifetime1 = (this.field_t[var29Lifetime4] & 255) + var28Lifetime1;
              if (var30Lifetime1 < 0) {
                var30Lifetime1 = 0;
              }
              if (var30Lifetime1 > 128) {
                var30Lifetime1 = 128;
              }
              this.field_t[var29Lifetime4] = (byte)var30Lifetime1;
            }
            var29Lifetime4Lifetime1 = 2;
            while (var47.length > var29Lifetime4Lifetime1) {
              var30Lifetime1Lifetime1 = var47[var29Lifetime4Lifetime1];
              var31Lifetime1 = var16[var29Lifetime4Lifetime1 + 1] << 1;
              var32Lifetime1 = (var30Lifetime1Lifetime1 - var27Lifetime7Lifetime1) / 2 + (-var27Lifetime7Lifetime1 + var30Lifetime1Lifetime1) * var28Lifetime1;
              var37 = var27Lifetime7Lifetime1;
              var33Lifetime1 = var37;
              while (var37 < var30Lifetime1Lifetime1) {
                var34Lifetime1 = dh.b(var32Lifetime1, var30Lifetime1Lifetime1 - var27Lifetime7Lifetime1, false);
                var35 = (this.field_t[var37] & 255) + var34Lifetime1;
                if (0 > var35) {
                  var35 = 0;
                }
                if (128 < var35) {
                  var35 = 128;
                }
                var32Lifetime1 = var32Lifetime1 + (-var28Lifetime1 + var31Lifetime1);
                this.field_t[var37] = (byte)var35;
                var37++;
              }
              var29Lifetime4Lifetime1 += 2;
              var28Lifetime1 = var31Lifetime1;
              var27Lifetime7Lifetime1 = var30Lifetime1Lifetime1;
            }
            for (var30Lifetime1Lifetime2 = var27Lifetime7Lifetime1; var30Lifetime1Lifetime2 < 128; var30Lifetime1Lifetime2++) {
              var31Lifetime1Lifetime1 = var28Lifetime1 + (255 & this.field_t[var30Lifetime1Lifetime2]);
              if (var31Lifetime1Lifetime1 < 0) {
                var31Lifetime1Lifetime1 = 0;
              }
              if (var31Lifetime1Lifetime1 > 128) {
                var31Lifetime1Lifetime1 = 128;
              }
              this.field_t[var30Lifetime1Lifetime2] = (byte)var31Lifetime1Lifetime1;
            }
            var16 = null;
          }
          for (var27Lifetime8 = 0; var27Lifetime8 < var12; var27Lifetime8++) {
            var13[var27Lifetime8].field_i = var38.e(-31302);
          }
          for (var27Lifetime9 = 0; var27Lifetime9 < var12; var27Lifetime9++) {
            var50 = var13[var27Lifetime9];
            if (null != var50.field_g) {
              var50.field_f = var38.e(-31302);
            }
            if (null != var50.field_h) {
              var50.field_c = var38.e(-31302);
            }
            if (var50.field_i > 0) {
              var50.field_d = var38.e(-31302);
            }
          }
          for (var27Lifetime10 = 0; var12 > var27Lifetime10; var27Lifetime10++) {
            var13[var27Lifetime10].field_j = var38.e(-31302);
          }
          for (var27Lifetime11 = 0; var12 > var27Lifetime11; var27Lifetime11++) {
            var51 = var13[var27Lifetime11];
            if (var51.field_j > 0) {
              var51.field_b = var38.e(-31302);
            }
          }
          for (var27Lifetime12 = 0; var27Lifetime12 < var12; var27Lifetime12++) {
            var52 = var13[var27Lifetime12];
            if (0 < var52.field_b) {
              var52.field_e = var38.e(-31302);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_205_0 = var2;
          stackIn_205_1 = new StringBuilder().append("td.<init>(");
          if (param0 == null) {
            stackIn_206_2 = "null";
          } else {
            stackIn_206_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_205_0), ((StringBuilder) (Object) stackIn_205_1).append(stackIn_206_2).append(')').toString());
        }
    }

    static {
        field_l = "editor";
        field_m = true;
    }
}
