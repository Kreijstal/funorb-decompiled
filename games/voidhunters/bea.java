/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bea implements ntb {
    static float[] field_f;
    int[] field_c;
    private dmb[] field_b;
    private static String[] field_a;
    int field_d;
    static int field_e;

    private final int a(rsb param0, int param1, int param2, Random param3) {
        int var7 = 0;
        int stackIn_13_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        tfa var7_ref_tfa = null;
        tfa var8 = null;
        int var9 = 0;
        int var5_intLifetime1;
        int var6Lifetime1;
        var9 = VoidHunters.field_G;
        try {
          var5_int = 0;
          if (param2 != 13145) {
            this.a(false, -19, -17, false, (pe) null, false, (Random) null);
          }
          for (var6 = 0; param0.field_c.length > var6; var6++) {
            var7_ref_tfa = param0.a(var6, (byte) 59);
            if ((var7_ref_tfa.field_a ||
              foa.field_p == 1) && var7_ref_tfa.field_h == param1) {
              var5_int++;
            }
          }
          if (var5_int <= 0) {
            stackIn_13_0 = -1;
            return stackIn_13_0;
          }
          var6Lifetime1 = hob.a(param3, var5_int, 118);
          var5_intLifetime1 = 0;
          for (var7 = 0; param0.field_c.length > var7; var7++) {
            var8 = param0.a(var7, (byte) 59);
            if ((var8.field_a ||
              foa.field_p == 1) && param1 == var8.field_h) {
              if (var5_intLifetime1 == var6Lifetime1) {
                stackIn_26_0 = var7;
                return stackIn_26_0;
              }
              var5_intLifetime1++;
            }
          }
          stackIn_30_0 = -1;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_33_0 = var5;
          stackIn_33_1 = new StringBuilder().append("bea.KA(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    private final int[][] a(int param0, int param1, int param2, boolean param3) {
        int[][] var5 = null;
        if (param0 != 0) {
          field_e = 13;
        }
        if (!param3) {
          var5 = new int[][]{new int[]{-param1, -param2, param1, -param2, param1, param2, -param1, param2}};
        } else {
          var5 = new int[][]{new int[]{-param1, -param2, param1, -param2, param1, param2}};
        }
        return var5;
    }

    private final int[] a(int param0, Random param1, byte param2, int[][] param3) {
        int var14 = 0;
        int[] stackIn_11_0 = null;
        int[] stackIn_31_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int var9Lifetime1;
        int var12Lifetime1;
        var16 = VoidHunters.field_G;
        try {
          var17 = new int[]{ku.field_c, wj.field_o, apb.field_a, ltb.field_p};
          var5 = var17;
          var6 = cg.field_r;
          if (this.field_c[18] > 0) {
            var17[1] = var17[1] + var6;
          }
          if (this.field_c[19] > 0) {
            var17[0] = var17[0] + var6;
          }
          var7 = pla.a(param0, -4) ? 1 : 0;
          if (var7 != 0) {
            var17[2] = 0;
          }
          var8 = 0;
          if (param2 <= 41) {
            stackIn_11_0 = (int[]) null;
            return stackIn_11_0;
          }
          for (var9 = 20; var9 <= 28; var9++) {
            var8 = var8 + this.field_c[var9];
          }
          var5[2] = var5[2] + Math.min(var8, 5);
          var9Lifetime1 = this.a(var5, 262144);
          var10 = this.a(param1, param3, var5, var9Lifetime1, 101);
          var11 = 0;
          for (var12 = 0; var10.length > var12; var12++) {
            if (var10[var12] == 2) {
              var11++;
            }
          }
          var12Lifetime1 = 2;
          if (13 == param0) {
            var12Lifetime1 = 8;
          }
          if (var12Lifetime1 > var11 && (var7 == 0 ||
            var8 != 0)) {
            var13 = var12Lifetime1 - var11;
            for (var14 = 0; var14 < var13; var14++) {
              var15 = hob.a(param1, param3.length, 120);
              var10[var15] = 2;
            }
          }
          stackIn_31_0 = var10;
          return stackIn_31_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_34_0 = var5_ref;
          stackIn_34_1 = new StringBuilder().append("bea.NA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    private final void a(pe param0, int param1, int param2, int param3) {
        bba var8 = null;
        bba var9 = null;
        cqb var10 = null;
        bba var11 = null;
        cqb var12 = null;
        bba var13 = null;
        vp var14 = null;
        uoa var15 = null;
        bba var16 = null;
        vp var17 = null;
        uoa var18 = null;
        nbb var19 = null;
        int var5_int = 0;
        int var6 = 1;
        int var7 = 15000;
        if (param1 != 5985) {
          return;
        }
        try {
          var8 = new bba();
          var8.a((byte) -105, (wm) (new dab(0)));
          var8.a(new pob(var5_int, var7), true);
          var8.a(new cf(var5_int, 1), true);
          var8.a(new pob(var6, var7), true);
          var8.a(new cf(var6, 2), true);
          param0.a(var8, param1 - 6023);
          var9 = new bba();
          var10 = new cqb(var6, 1);
          ((wm) ((Object) var10)).field_a = true;
          var9.a((byte) -125, (wm) (var10));
          var9.a(new ika(0), true);
          param0.a(var9, -38);
          var11 = new bba();
          var12 = new cqb(var5_int, 1);
          ((wm) ((Object) var12)).field_a = true;
          var11.a((byte) -111, (wm) (var12));
          var11.a(new ika(1), true);
          param0.a(var11, -38);
          var13 = new bba();
          var14 = new vp(0, 47);
          var15 = new uoa(var6, -1);
          var13.a((byte) -102, (wm) (var14));
          var13.a(var15, true);
          param0.a(var13, -38);
          var16 = new bba();
          var17 = new vp(1, 47);
          var18 = new uoa(var5_int, -1);
          var16.a((byte) -122, (wm) (var17));
          var16.a(var18, true);
          param0.a(var16, -38);
          var19 = new nbb(new ml(47), false);
          var19.a(0, 0, (byte) 89);
          param0.a(var19, (byte) 100);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "bea.Q(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, Random param1, rsb param2, byte param3, int param4) {
        pe var12 = null;
        sg var7 = null;
        int var8 = 0;
        int var9 = 0;
        bba var11 = null;
        try {
          var12 = param2.field_g;
          var7 = t.a(4, (byte) 101);
          var7.a(param0, param4, (byte) -68);
          var8 = 1;
          var7.h(17704, var8);
          var9 = this.a(param2, var8, 13145, param1);
          var7.g(var9, 98);
          if (var9 == -1) {
            var7.a(new aoa(), 4);
          }
          int var10 = -13 % ((22 - param3) / 62);
          var7.a(4096, -17);
          var12.a(var7, (byte) 115);
          var11 = new bba();
          var11.a((byte) -108, (wm) (new cc(var7.c(false))));
          var11.a(new ika(0), true);
          var12.a(var11, -38);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "bea.DA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final int a(int[] param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = VoidHunters.field_G;
        try {
          var3_int = 0;
          var4 = 0;
          if (param1 != 262144) {
            bea.a(73);
          }
          while (var4 < param0.length) {
            var3_int = var3_int + param0[var4];
            var4++;
          }
          stackIn_6_0 = var3_int;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("bea.MA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static asb a(int param0, int param1) {
        if (param0 != 1) {
          return (asb) null;
        }
        return mla.a(true, false, -61, false, param1, 1);
    }

    private final void a(Random param0, int param1, pe param2) {
        int var9 = 0;
        int var15 = 0;
        int var16 = 0;
        int var18 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        sg var17 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var13Lifetime1;
        var24 = VoidHunters.field_G;
        try {
          if (param1 <= 58) {
            this.a((rsb) null, (Random) null, (pe) null, 72);
          }
          var4_int = param2.g((byte) -122) / 2;
          var5 = param2.m(1) / 2;
          var6 = hob.a(param0, 2, 118);
          var7 = this.field_c[29];
          var8 = this.field_c[30];
          if (var7 > 0) {
            var6 = var6 + var7;
          }
          if (var8 > 0) {
            var6 = var6 - var8;
          }
          if (var6 > 4) {
            var6 = 4;
          }
          if (0 > var6) {
            var6 = 0;
          }
          for (var9 = 0; var9 < var6; var9++) {
            var10 = 0;
            var11 = 0;
            var12 = 262144;
            for (var13 = 0; 1000 > var13; var13++) {
              var10 = hob.a(param0, var4_int, 118) - var4_int / 2;
              var11 = -(var5 / 2) + hob.a(param0, var5, 122);
              if (param2.a(var12 + cab.field_p, var11, false, var10)) {
                continue;
              }
              break;
            }
            var13Lifetime1 = vob.a(param0, (byte) 72);
            var14 = 1 + hob.a(param0, 3, 127);
            for (var15 = 0; var15 < 2; var15++) {
              for (var16 = 0; var16 < var14; var16++) {
                var17 = t.a(var13Lifetime1, (byte) 101);
                var17.h(17704, 2);
                var17.a(new aoa(), 4);
                for (var18 = 0; var18 < 1000; var18++) {
                  var19 = hob.a(param0, 8192, 117);
                  var20 = hob.a(param0, var12, 127) >> 8;
                  var21 = var20 * (fc.a(var19, (byte) 81) >> 8) + var10;
                  if (var21 < -var4_int) {
                    var21 = -var4_int;
                  }
                  var22 = var11 + var20 * (eu.a(var19, 56) >> 8);
                  if (var21 > var4_int) {
                    var21 = var4_int;
                  }
                  if (-var5 > var22) {
                    var22 = -var5;
                  }
                  if (var5 < var22) {
                    var22 = var5;
                  }
                  var17.a(var21, var22, (byte) -55);
                  var23 = hob.a(param0, 8192, 124);
                  var17.a(var23, -21);
                  var17.i(0);
                  if (param2.a(-11924, var17)) {
                    continue;
                  }
                  break;
                }
                param2.a(var17, (byte) 79);
              }
              var10 = -var10;
              var11 = -var11;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_43_0 = var4;
          stackIn_43_1 = new StringBuilder().append("bea.EB(");
          if (param0 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          stackIn_46_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(')').toString());
        }
    }

    private final int[] a(int param0, int param1, int[] param2) {
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int[] var5 = null;
        int[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new int[2 * param0];
          var4 = var5;
          cua.a(param2, 0, var5, 0, param2.length);
          param2 = var5;
          if (param1 >= -83) {
            this.field_c = (int[]) null;
          }
          stackIn_3_0 = (int[]) (param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("bea.FB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    private final void a(int param0, Random param1, rsb param2) {
        int var6_int = 0;
        int var13_int = 0;
        int var14 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        sg[] var5 = null;
        ij var6 = null;
        rdb var7 = null;
        bba[] var8 = null;
        int var8_int = 0;
        int var9 = 0;
        bba var10 = null;
        wm[] var11 = null;
        rna[] var12 = null;
        rna[] var13 = null;
        wm var14_ref_wm = null;
        rna var15 = null;
        Object var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        pe var20 = null;
        sg var21 = null;
        una var22 = null;
        wm[] var23 = null;
        cf var24 = null;
        int var9Lifetime1;
        var16 = null;
        var19 = VoidHunters.field_G;
        try {
          var20 = param2.field_g;
          var5 = var20.d(1000);
          for (var6_int = 0; var5.length > var6_int; var6_int++) {
            var21 = var5[var6_int];
            if (var21 != null) {
              var8_int = mjb.b(21957, var21.q((byte) 91));
              var21.h(param0 + 17705, var8_int);
              if (var21.o((byte) -117) >= 0) {
                var9 = this.a(param2, var8_int, 13145, param1);
                var21.g(var9, 98);
                if (-1 == var9) {
                  var21.a(new aoa(), param0 ^ -5);
                }
              }
            }
          }
          var6 = var20.f((byte) 24);
          var7 = (rdb) (var6.d(0));
          while (var7 != null) {
            var7.a(mjb.b(param0 + 21958, var7.d(121)), (byte) -96);
            var7 = (rdb) (var6.a((byte) 66));
          }
          if (param0 != -1) {
            this.field_c = (int[]) null;
          }
          var22 = var20.e(0);
          if (var22 != null) {
            var8 = var22.b(1);
            if (var8 == null) {
              return;
            }
            for (var9Lifetime1 = 0; var9Lifetime1 < var8.length; var9Lifetime1++) {
              var10 = var8[var9Lifetime1];
              var11 = var10.a((byte) -128);
              if (var11 != null) {
                var23 = var11;
                for (var13_int = 0; var23.length > var13_int; var13_int++) {
                  var14_ref_wm = var23[var13_int];
                  if (var14_ref_wm instanceof om) {
                    this.a(var14_ref_wm, var20, 0, param0 ^ -14277);
                  } else {
                    if (var14_ref_wm instanceof jsb) {
                      this.a(var14_ref_wm, var20, 0, 14276);
                    } else {
                      if (!(var14_ref_wm instanceof vp)) {
                        if (var14_ref_wm instanceof ih) {
                          this.a(var14_ref_wm, var20, 1, param0 ^ -14277);
                        }
                      } else {
                        this.a(var14_ref_wm, var20, 0, param0 ^ -14277);
                      }
                    }
                  }
                }
              }
              var12 = var10.c((byte) -42);
              if (var12 != null) {
                var13 = var12;
                for (var14 = 0; var14 < var13.length; var14++) {
                  var15 = var13[var14];
                  if (!(var15 instanceof ika)) {
                    if (var15 instanceof cf) {
                      var24 = (cf) (var15);
                      var17 = var24.a(1, -106);
                      var18 = fq.field_o[var17];
                      if (var18 == 0) {
                        var17++;
                      } else {
                        if (var18 == 1) {
                          var17--;
                        }
                      }
                      var24.a(var20, false, 1, var17);
                    }
                  } else {
                    this.a(var15, 17333, var20, 0);
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_52_0 = var4;
          stackIn_52_1 = new StringBuilder().append("bea.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          stackIn_55_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',');
          if (param2 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(')').toString());
        }
    }

    private final int a(byte param0, Random param1, int[][] param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var6Lifetime1;
        var9 = VoidHunters.field_G;
        try {
          var4_int = -2147483648;
          var5 = -1;
          if (param0 != 52) {
            stackIn_3_0 = 21;
            return stackIn_3_0;
          }
          for (var6 = 0; var6 < param2.length; var6++) {
            var7 = param2[var6];
            var8 = tf.a(14, -127, var7);
            if (var4_int < var8) {
              var5 = var6;
              var4_int = var8;
            }
          }
          var6Lifetime1 = var5;
          if (var6Lifetime1 == -1) {
            var6Lifetime1 = hob.a(param1, param2.length, 125);
          }
          stackIn_14_0 = var6Lifetime1;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("bea.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static void a(byte param0, Object param1, int param2) {
        try {
          wqb.field_e.put(param1, new Integer(param2));
          int var3_int = -38 / ((param0 - 80) / 33);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "bea.BA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final int a(int param0, int param1, anb[] param2, anb[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = VoidHunters.field_G;
        try {
          if (param3 != null) {
            for (var5_int = 0; param3.length > var5_int; var5_int++) {
              if (~param0 == ~param3[var5_int].c(false)) {
                stackIn_8_0 = param2[var5_int].c(false);
                return stackIn_8_0;
              }
            }
          }
          if (param1 != 0) {
            stackIn_12_0 = -55;
            stackIn_12_1 = -57;
            bea.a(stackIn_12_0, stackIn_12_1, (mm) null, -12, 46, false, 71, -25);
          }
          stackIn_14_0 = param0;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("bea.IB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    private final void a(rsb param0, Random param1, pe param2, int param3) {
        int var5_int = param0.field_e.d(6472);
        int var6 = qta.a(var5_int, 9) ? 1 : 0;
        this.a(var5_int, false, param2);
        this.a(true, var5_int, param3 ^ 31938, true, param2, var6 != 0, param1);
        param0.field_g.a(0, this);
        if (param3 != 4581) {
          return;
        }
        try {
          this.a(var5_int, var6 != 0, param1, param0, 95);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "bea.JA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final anb[] a(rsb param0, anb[] param1, byte param2, Random param3) {
        Object stackIn_17_0 = null;
        Object stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        int var6 = 0;
        anb var7 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        sg var12 = null;
        nbb var13 = null;
        int var6Lifetime1;
        var11 = VoidHunters.field_G;
        try {
          var5 = null;
          if (param1 != null) {
            for (var6 = 0; param1.length > var6; var6++) {
              var7 = param1[var6];
              if (!(var7 instanceof sg)) {
                if (var7 instanceof nbb) {
                  var13 = new nbb();
                  var7.b((byte) 67, var13);
                  var13.a(rrb.a(22433, var13.e(0) + 4096), -93);
                  var13.a(-var13.field_d, -var13.field_e, (byte) -112);
                  param0.field_g.a(var13, (byte) 53);
                  var5 = (anb[]) (ija.a(var13, (Object[]) (var5), 0, ebb.field_a));
                }
              } else {
                var12 = new sg();
                var7.b((byte) 66, var12);
                var12.field_k.g(0);
                var12.a(rrb.a(22433, 4096 + var12.e(0)), -29);
                var12.a(-var12.field_d, -var12.field_e, (byte) 45);
                var9 = mjb.b(21957, var12.q((byte) 64));
                var12.h(17704, var9);
                if (var12.o((byte) -117) >= 0) {
                  var10 = this.a(param0, var9, 13145, param3);
                  var12.g(var10, -97);
                  if (-1 == var10) {
                    var12.a(new aoa(), 4);
                  }
                }
                param0.field_g.a(var12, (byte) 85);
                var5 = (anb[]) (ija.a(var12, (Object[]) (var5), 0, ebb.field_a));
              }
            }
          }
          var6Lifetime1 = -113 / ((-46 - param2) / 44);
          stackIn_17_0 = var5;
          return (anb[]) (stackIn_17_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("bea.TA(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw rta.a((Throwable) (stackIn_20_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    private final anb[] a(int param0, int param1, pe param2, byte param3) {
        int var20 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        bba var8 = null;
        bba var9 = null;
        bba var10 = null;
        bba var11 = null;
        bba var12 = null;
        cqb var13 = null;
        int var14 = 0;
        bba var15 = null;
        cqb var16 = null;
        int var17 = 0;
        int var18 = 0;
        Object var19 = null;
        sg var21 = null;
        int var22 = 0;
        int var23 = 0;
        Object stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var23 = VoidHunters.field_G;
        try {
          var5_int = 0;
          var6 = 1;
          var7 = 100;
          var8 = new bba();
          var8.a((byte) -119, (wm) (new dab(0)));
          var8.a(new pob(var5_int, 0), true);
          var8.a(new cf(var5_int, 6), true);
          var8.a(new pob(var6, 0), true);
          var8.a(new cf(var6, 7), true);
          param2.a(var8, -38);
          var9 = new bba();
          var9.a(new pob(var5_int, 0), true);
          var9.a(new pob(var6, 0), true);
          param2.a(var9, -38);
          var10 = new bba();
          var10.a((byte) -109, (wm) (new ih(-1, 0)));
          var10.a(new tt(var5_int, 0), true);
          param2.a(var10, -38);
          var11 = new bba();
          var11.a((byte) -99, (wm) (new ih(-1, 1)));
          var11.a(new tt(var6, 0), true);
          param2.a(var11, -38);
          var12 = new bba();
          var13 = new cqb(var5_int, var7);
          var12.a((byte) -107, (wm) (var13));
          var14 = -47 % ((10 - param3) / 50);
          var12.a(new ika(0), true);
          param2.a(var12, -38);
          var15 = new bba();
          var16 = new cqb(var6, var7);
          var15.a((byte) -122, (wm) (var16));
          var15.a(new ika(1), true);
          param2.a(var15, -38);
          var17 = 4;
          var18 = ar.a(param1 / 4, (byte) 115, param0 / 4) >> 8;
          var19 = null;
          for (var20 = 0; var17 > var20; var20++) {
            var21 = rpa.a(2, 1, true);
            var22 = 2048 * var20 / (var17 - 1) + 2048;
            var21.a(param1 + var18 * (fc.a(var22, (byte) 127) >> 8), (eu.a(var22, 50) >> 8) * var18 + param0, (byte) -95);
            var21.a(new aoa(), 4);
            var21.h(17704, 1);
            param2.a(var21, (byte) 81);
            var19 = (anb[]) (ija.a(var21, (Object[]) (var19), 0, ebb.field_a));
          }
          stackIn_5_0 = var19;
          return (anb[]) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("bea.HB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(int param0, bba[] param1, cq[] param2, cq[] param3, pe param4, anb[] param5, byte param6, anb[] param7) {
        int var9_int = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        bba var10 = null;
        bba var11 = null;
        wm[] var12 = null;
        rna[] var13 = null;
        int var14 = 0;
        wm var15 = null;
        rna var15_ref = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        Object var21 = null;
        Object var22 = null;
        Object var23 = null;
        cc var24 = null;
        iia var25 = null;
        ika var26 = null;
        int var14Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        var21 = null;
        var22 = null;
        var23 = null;
        var19 = VoidHunters.field_G;
        try {
          if (param6 != 54) {
            return;
          }
          for (var9_int = param0; var9_int < param1.length; var9_int++) {
            var10 = param1[var9_int];
            var11 = new bba();
            var10.b((byte) 64, var11);
            var12 = var11.a((byte) -128);
            var13 = var11.c((byte) -42);
            if (var12 != null) {
              for (var14 = 0; var14 < var12.length; var14++) {
                var15 = var12[var14];
                if (!(var15 instanceof cc)) {
                  if (var15 instanceof iia) {
                    var25 = (iia) (var15);
                    var17 = this.a(var25.a((byte) -103, 0), 0, param5, param7);
                    var25.a(param4, -2, 0, var17);
                    var18 = this.a(var25.a((byte) -110, 1), -2950, param3, param4, param2);
                    var25.a(param4, -2, 1, var18);
                  }
                } else {
                  var24 = (cc) (var15);
                  var17 = this.a(var24.a((byte) -117, 0), 0, param5, param7);
                  var24.a(param4, param6 - 56, 0, var17);
                }
              }
            }
            if (var13 != null) {
              var20 = 0;
              var14Lifetime1 = var20;
              while (var13.length > var20) {
                var15_ref = var13[var20];
                if (var15_ref instanceof ika) {
                  var26 = (ika) (var15_ref);
                  var17Lifetime1 = var26.a(0, -118);
                  var18Lifetime1 = mjb.b(21957, var17Lifetime1);
                  var26.a(param4, false, 0, var18Lifetime1);
                }
                var20++;
              }
            }
            param4.a(var11, param6 - 92);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_27_0 = var9;
          stackIn_27_1 = new StringBuilder().append("bea.CB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param3 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param4 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',');
          if (param5 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(')').toString());
        }
    }

    private final anb[] a(int param0, int param1, pe param2, int param3) {
        int var11 = 0;
        int var18 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        bba var9 = null;
        int var10 = 0;
        cqb var11_ref_cqb = null;
        ih var12_ref_ih = null;
        int var12 = 0;
        int var13 = 0;
        jsb var14_ref_jsb = null;
        int var14 = 0;
        tt var15_ref_tt = null;
        int var15 = 0;
        int var16 = 0;
        Object var17 = null;
        int var17_int = 0;
        pob var18_ref_pob = null;
        sg var19 = null;
        int var20 = 0;
        int var21 = 0;
        bba var22 = null;
        bba var23 = null;
        bba var24 = null;
        bba var25 = null;
        bba var26 = null;
        bba var27 = null;
        rba var28 = null;
        bba var29 = null;
        bba var30 = null;
        bba var31 = null;
        bba var32 = null;
        Object stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        cqb var11_ref_cqbLifetime1;
        ih var12_ref_ihLifetime1;
        jsb var14_ref_jsbLifetime1;
        tt var15_ref_ttLifetime1;
        Object var17Lifetime1;
        Object var17Lifetime2;
        pob var18_ref_pobLifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        var21 = VoidHunters.field_G;
        try {
          var5_int = 0;
          var6 = 1;
          var7 = 2;
          if (param0 <= 107) {
            this.b((byte) 3, (tv) null);
          }
          var8 = 500;
          var9 = new bba();
          var9.a((byte) -107, (wm) (new dab(0)));
          var9.a(new pob(var5_int, var8), true);
          var9.a(new cf(var5_int, 8), true);
          var9.a(new pob(var6, var8), true);
          var9.a(new cf(var6, 9), true);
          var9.a(new pob(var7, 0), true);
          param2.a(var9, -38);
          var22 = new bba();
          var11_ref_cqb = new cqb(var6, 1);
          ((wm) ((Object) var11_ref_cqb)).field_a = true;
          var22.a((byte) -127, (wm) (var11_ref_cqb));
          var12_ref_ih = new ih(-1, 1);
          ((wm) ((Object) var12_ref_ih)).field_a = true;
          var22.a((byte) -112, (wm) (var12_ref_ih));
          var22.a(new ika(0), true);
          param2.a(var22, -38);
          var23 = new bba();
          var14_ref_jsb = new jsb(0);
          var23.a((byte) -110, (wm) (var14_ref_jsb));
          var15_ref_tt = new tt(var5_int, 1);
          var23.a(var15_ref_tt, true);
          param2.a(var23, -38);
          var24 = new bba();
          var17 = new cqb(var5_int, 0);
          ((wm) (var17)).field_a = true;
          var24.a((byte) -128, (wm) (var17));
          var18_ref_pob = new pob(var5_int, 0);
          var24.a(var18_ref_pob, true);
          param2.a(var24, -38);
          var25 = new bba();
          var11_ref_cqbLifetime1 = new cqb(var5_int, 1);
          ((wm) ((Object) var11_ref_cqbLifetime1)).field_a = true;
          var25.a((byte) -101, (wm) (var11_ref_cqbLifetime1));
          var12_ref_ihLifetime1 = new ih(-1, 0);
          ((wm) ((Object) var12_ref_ihLifetime1)).field_a = true;
          var25.a((byte) -125, (wm) (var12_ref_ihLifetime1));
          var25.a(new ika(1), true);
          param2.a(var25, -38);
          var26 = new bba();
          var14_ref_jsbLifetime1 = new jsb(1);
          var26.a((byte) -103, (wm) (var14_ref_jsbLifetime1));
          var15_ref_ttLifetime1 = new tt(var6, 1);
          var26.a(var15_ref_ttLifetime1, true);
          param2.a(var26, -38);
          var27 = new bba();
          var17Lifetime1 = new cqb(var6, 0);
          ((wm) (var17Lifetime1)).field_a = true;
          var27.a((byte) -119, (wm) (var17Lifetime1));
          var18_ref_pobLifetime1 = new pob(var6, 0);
          var27.a(var18_ref_pobLifetime1, true);
          param2.a(var27, -38);
          var10 = 3;
          for (var11 = 0; var10 > var11; var11++) {
            var12 = param2.g((byte) -122);
            var13 = var12 / var10;
            var14 = param2.m(1);
            var15 = var14 / var10;
            var16 = var13 * var11 + -var12 / 2 + var13 / 2;
            var17_int = -var14 / 2 + var11 * var15 + var15 / 2;
            var28 = new rba(var16, var17_int);
            param2.a(var28, (byte) -123);
          }
          var29 = new bba();
          var29.a(new uoa(var7, 1), true);
          param2.a(var29, -38);
          var30 = new bba();
          var30.a((byte) -123, (wm) (new cqb(var7, oq.field_v)));
          var30.a((byte) -107, (wm) (new om(1)));
          var30.a(new jpa(var5_int, 1), true);
          param2.a(var30, -38);
          var31 = new bba();
          var31.a((byte) -116, (wm) (new cqb(var7, oq.field_v)));
          var31.a((byte) -125, (wm) (new om(0)));
          var31.a(new jpa(var6, 1), true);
          param2.a(var31, -38);
          var32 = new bba();
          var32.a((byte) -107, (wm) (new cqb(var7, oq.field_v)));
          var32.a(new pob(var7, 0), true);
          param2.a(var32, -38);
          var15Lifetime1 = 2;
          var16Lifetime1 = ar.a(param1 / 4, (byte) 116, param3 / 4) >> 8;
          var17Lifetime2 = null;
          for (var18 = 0; var15Lifetime1 > var18; var18++) {
            var19 = rpa.a(2, 2, true);
            var20 = var18 * 2048 / (-1 + var15Lifetime1) + 2048;
            var19.a(param1 + (fc.a(var20, (byte) -107) >> 8) * var16Lifetime1, (eu.a(var20, 59) >> 8) * var16Lifetime1 + param3, (byte) -127);
            var19.a(new aoa(), 4);
            var19.h(17704, 1);
            param2.a(var19, (byte) 92);
            var17Lifetime2 = (anb[]) (ija.a(var19, (Object[]) (var17Lifetime2), 0, ebb.field_a));
          }
          stackIn_10_0 = var17Lifetime2;
          return (anb[]) (stackIn_10_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("bea.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(faa param0, boolean param1) {
        Class[] var3 = null;
        dja[] var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          this.field_d = param0.i(0, 32);
          this.field_c = wkb.a((byte) 37, this.field_c, param0, 8);
          var3 = new Class[]{rgb.class, ptb.class};
          var4 = new dja[]{rma.field_d, kn.field_q};
          this.field_b = (dmb[]) (iq.a(var4, this.field_b, var3, ra.field_o, 8, param0, 1, -25));
          if (param1) {
            this.field_b = (dmb[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("bea.H(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, int param1, una param2) {
        int var4_int = 0;
        bba var7 = null;
        bba var8 = null;
        bba var9 = null;
        cqb var6 = null;
        try {
          var4_int = 10;
          var7 = new bba();
          var7.a((byte) -119, (wm) (new dab(0)));
          var7.a(new pob(var4_int, de.field_p * oq.field_l), true);
          var7.a(new cf(var4_int, param1 + 4), true);
          int var6_int = -51 / ((-71 - param0) / 48);
          param2.a(0, var7);
          var8 = new bba();
          var8.a((byte) -99, (wm) (new cqb(var4_int, 1)));
          var8.a(new uoa(var4_int, -1), true);
          param2.a(0, var8);
          var9 = new bba();
          var6 = new cqb(var4_int, 1);
          ((wm) ((Object) var6)).field_a = true;
          var9.a((byte) -122, (wm) (var6));
          var9.a(new ika(param1), true);
          param2.a(0, var9);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "bea.J(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final cq[] a(bba[] param0, pe param1, int param2, boolean param3) {
        int var6 = 0;
        Object var5 = null;
        bba var7 = null;
        int var8 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = VoidHunters.field_G;
        try {
          var5 = null;
          for (var6 = param2; param0.length > var6; var6++) {
            var7 = param0[var6];
            var5 = this.a(var7.a((byte) -123), (cq[]) (var5), -95, param1);
          }
          if (!param3) {
            this.a(true, (dmb) null);
          }
          stackIn_7_0 = var5;
          return (cq[]) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("bea.V(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rta.a((Throwable) (stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(pe param0, int param1, int param2) {
        int var4_int = 0;
        bba var5 = null;
        bba var9 = null;
        bba var10 = null;
        cqb var7 = null;
        via var8 = null;
        try {
          var4_int = 10;
          var5 = new bba();
          var5.a((byte) -117, (wm) (new dab(0)));
          var5.a(new pob(var4_int, 300 * oq.field_l), true);
          var5.a(new cf(var4_int, param1), true);
          param0.a(var5, param1 ^ -39);
          var9 = new bba();
          var9.a((byte) -128, (wm) (new cqb(var4_int, 1)));
          var9.a(new uoa(var4_int, -1), true);
          param0.a(var9, -38);
          var10 = new bba();
          var7 = new cqb(var4_int, 1);
          ((wm) ((Object) var7)).field_a = true;
          var10.a((byte) -106, (wm) (var7));
          var8 = new via();
          var10.a(var8, true);
          param0.a(var10, -38);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "bea.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final anb[] b(int param0, int param1, pe param2, int param3) {
        sg var5 = null;
        RuntimeException var5_ref = null;
        bba var6 = null;
        int var7 = 0;
        Object stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = t.a(1, (byte) 47);
          var5.a(param3, param1, (byte) 95);
          var5.a(new aoa(), 4);
          var5.h(17704, 1);
          var7 = 7 % ((23 - param0) / 36);
          param2.a(var5, (byte) 99);
          var6 = new bba();
          var6.a((byte) -112, (wm) (new cc(var5.c(false))));
          var6.a(new ika(0), true);
          param2.a(var6, -38);
          stackIn_1_0 = null;
          return (anb[]) (stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_4_0 = var5_ref;
          stackIn_4_1 = new StringBuilder().append("bea.S(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(boolean param0, int param1, int param2, boolean param3, pe param4, boolean param5, Random param6) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int[][] var10 = null;
        int[] var11 = null;
        int var12 = 0;
        int[][] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[][] var10Lifetime1;
        int[][] var10Lifetime2;
        try {
          var8_int = param4.g((byte) -122) >> 1;
          if (param5) {
          }
          var9 = param4.m(1) >> 1;
          var10 = (int[][]) null;
          var13 = this.a(0, var8_int, var9, param5);
          var10Lifetime1 = var13;
          var10Lifetime2 = this.a(param2 ^ -27942, 50, param6, var13);
          if (param2 != 27943) {
            return;
          }
          var14 = this.a(param6, var10Lifetime2, (byte) 65, param1, var8_int);
          var11 = var14;
          if (param5) {
            var12 = var10Lifetime2.length;
            var15 = this.a(var12, -88, var14);
            var11 = var15;
            var10Lifetime2 = this.a(var10Lifetime2, var15, var12, (byte) 115);
          }
          this.a(param6, var10Lifetime2, var11, param4, param0, 4);
          if (param3) {
            this.a(param6, param4, var10Lifetime2, param2 - 27942, var11);
          }
          pd.field_g = var10Lifetime2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_13_0 = var8;
          stackIn_13_1 = new StringBuilder().append("bea.R(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final int[] a(Random param0, int[][] param1, int[] param2, int param3, int param4) {
        int[][] discarded$1 = null;
        int var7 = 0;
        int[] var6 = null;
        RuntimeException var6_ref = null;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = VoidHunters.field_G;
        try {
          if (param4 < 78) {
            discarded$1 = this.a((int[][]) null, (int[]) null, 31, (byte) 87);
          }
          var10 = new int[param1.length];
          var6 = var10;
          for (var7 = 0; var7 < param1.length; var7++) {
            var8 = this.a(param3, param0, param2, (byte) 63);
            var10[var7] = var8;
          }
          stackIn_7_0 = var6;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_10_0 = var6_ref;
          stackIn_10_1 = new StringBuilder().append("bea.JB(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void a(wm param0, pe param1, int param2, int param3) {
        int var5_int = 0;
        try {
          var5_int = param0.a((byte) -118, param2);
          if (param3 != 14276) {
            this.field_b = (dmb[]) null;
          }
          param0.a(param1, -2, param2, mjb.b(21957, var5_int));
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "bea.GA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, rsb param1) {
        Random var3 = null;
        pe var4 = null;
        try {
          if (this.field_c == null) {
            this.field_c = new int[31];
          }
          var3 = new Random((long)this.field_d);
          var4 = param1.field_g;
          var4.g(11184895);
          int var5 = -67 / ((param0 + 45) / 36);
          this.a(param1, var3, var4, 4581);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "bea.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final int[][] a(int[][] param0, int[] param1, int param2, byte param3) {
        int var5_int = 0;
        int var8_int = 0;
        int[][] stackIn_3_0 = null;
        int[][] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[][] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var9Lifetime1;
        var11 = VoidHunters.field_G;
        try {
          if (param3 != 115) {
            stackIn_3_0 = (int[][]) null;
            return stackIn_3_0;
          }
          for (var5_int = 0; var5_int < param2; var5_int++) {
            var6 = param0[var5_int];
            var7 = new int[var6.length];
            for (var8_int = 0; var6.length > var8_int; var8_int += 2) {
              var9 = var6[var8_int];
              var10 = var6[1 + var8_int];
              var7[var8_int] = -var9;
              var7[var8_int + 1] = -var10;
            }
            param1[param0.length] = param1[var5_int];
            var8 = new int[1 + param0.length][];
            var12 = 0;
            var9Lifetime1 = var12;
            while (var12 < param0.length) {
              var8[var12] = param0[var12];
              var12++;
            }
            var8[param0.length] = var7;
            param0 = var8;
          }
          stackIn_14_0 = (int[][]) (param0);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("bea.DB(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean a(int param0, int param1, int[] param2, int param3, byte param4, int param5) {
        int discarded$0 = 0;
        int var12 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        var19 = VoidHunters.field_G;
        try {
          var7_int = 1;
          var8 = param1 - param0;
          var9 = param3 - param5;
          var10 = ecb.a(var9, (byte) -77, var8);
          if (param4 <= 43) {
            discarded$0 = this.a((byte) 47, (Random) null, (int[][]) null);
          }
          var11 = (eu.a(var10 * 4, 103) + 65536) / 2;
          for (var12 = 0; var12 < param2.length; var12 += 2) {
            var13 = param2[var12];
            var14 = param2[1 + var12];
            var15 = param2[(2 + var12) % param2.length];
            var16 = param2[(3 + var12) % param2.length];
            var17 = lv.a(var11, var14, var16, param1, var13, 8, var15, param3, 87);
            if (var17 == -1) {
              stackIn_11_0 = (257 == var17) ? 1 : 0;
            } else {
              stackIn_11_0 = 1;
            }
            var18 = stackIn_11_0;
            if (var18 == 0) {
              continue;
            }
            var7_int = 0;
            break;
          }
          stackIn_15_0 = var7_int;
          return stackIn_15_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_18_0 = var7;
          stackIn_18_1 = new StringBuilder().append("bea.FA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final anb[] a(byte param0, pe param1, wm[] param2, anb[] param3) {
        int var5_int = 0;
        wm var6 = null;
        int var9 = 0;
        anb[] stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        iia var10 = null;
        cc var11 = null;
        anb var12 = null;
        anb var13 = null;
        var9 = VoidHunters.field_G;
        try {
          if (param0 < 33) {
            field_f = (float[]) null;
          }
          if (param2 != null) {
            for (var5_int = 0; param2.length > var5_int; var5_int++) {
              var6 = param2[var5_int];
              if (var6 instanceof cc) {
                var11 = (cc) (var6);
                var13 = param1.d((byte) -27, var11.a((byte) -110, 0));
                if (var13 != null) {
                  param3 = (anb[]) (kn.a(param3, var13, true, ebb.field_a, -90));
                }
              } else {
                if (var6 instanceof iia) {
                  var10 = (iia) (var6);
                  var12 = param1.d((byte) -27, var10.a((byte) -116, 0));
                  if (var12 != null) {
                    param3 = (anb[]) (kn.a(param3, var12, true, ebb.field_a, -104));
                  }
                }
              }
            }
          }
          stackIn_20_0 = (anb[]) (param3);
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("bea.OA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param3 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    public final boolean a(byte param0, tv param1) {
        bea var3 = null;
        int var4 = 0;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = (bea) (param1);
          var4 = 3 / ((22 - param0) / 59);
          stackIn_6_0 = (var3.field_d != this.field_d) || (wpb.a(var3.field_c, this.field_c, (byte) 28)) || (dn.a(var3.field_b, true, 1, this.field_b, 126));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("bea.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, int param3, Random param4, pe param5, int param6) {
        int var21 = 0;
        int var25_int = 0;
        RuntimeException runtimeException = null;
        int var8_int = 0;
        cq var9 = null;
        cq var10 = null;
        int var11 = 0;
        int var12 = 0;
        bba var13 = null;
        bba var14 = null;
        cqb var15 = null;
        bba var16 = null;
        cqb var17 = null;
        int var18 = 0;
        int var19 = 0;
        bba var20 = null;
        sg var22 = null;
        int var23 = 0;
        int var24 = 0;
        bba var25 = null;
        bba var26 = null;
        int var27 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var27 = VoidHunters.field_G;
        try {
          var8_int = 524288;
          var9 = new cq(-(var8_int / 2) + param6, -(var8_int / 2) + param2);
          var9.field_d = var8_int;
          var9.field_e = var8_int;
          param5.a(5706, var9);
          var10 = new cq(param1 - var8_int / 2, -(var8_int / 2) + param0);
          var10.field_e = var8_int;
          var10.field_d = var8_int;
          param5.a(5706, var10);
          var11 = 0;
          var12 = 1;
          var13 = new bba();
          var13.a((byte) -118, (wm) (new dab(0)));
          var13.a(new pob(var11, oq.field_l * 600), true);
          var13.a(new cf(var11, 1), true);
          var13.a(new pob(var12, oq.field_l * 600), true);
          var13.a(new cf(var12, 2), true);
          param5.a(var13, -38);
          var14 = new bba();
          var15 = new cqb(var12, 1);
          ((wm) ((Object) var15)).field_a = true;
          var14.a((byte) -106, (wm) (var15));
          var14.a(new ika(0), true);
          param5.a(var14, -38);
          var16 = new bba();
          var17 = new cqb(var11, 1);
          ((wm) ((Object) var17)).field_a = true;
          var16.a((byte) -98, (wm) (var17));
          var16.a(new ika(1), true);
          param5.a(var16, -38);
          var18 = 5;
          if (param3 > -115) {
            return;
          }
          var19 = Math.min(param5.g((byte) -122), param5.m(1)) / 16;
          var20 = new bba();
          for (var21 = 0; var18 > var21; var21++) {
            var22 = rpa.a(2, -1, true);
            var22.h(17704, 2);
            var23 = hob.a(param4, 8192, 122);
            var24 = hob.a(param4, var19, 126) >> 8;
            for (var25_int = 0; 1000 > var25_int; var25_int++) {
              var22.a((fc.a(var23, (byte) -108) >> 8) * var24, (eu.a(var23, 127) >> 8) * var24, (byte) -112);
              var22.i(0);
              if (param5.a(-11924, var22)) {
                continue;
              }
              break;
            }
            param5.a(var22, (byte) 90);
            var20.a((byte) -112, (wm) (new cc(var22.c(false))));
            var25 = new bba();
            var25.a((byte) -123, (wm) (new iia(var22.c(false), -2 + param5.e(true))));
            var25.a(new uoa(var12, -1), true);
            param5.a(var25, -38);
            var26 = new bba();
            var26.a((byte) -120, (wm) (new iia(var22.c(false), -1 + param5.e(true))));
            var26.a(new uoa(var11, -1), true);
            param5.a(var26, -38);
          }
          var20.a(new ika(-1), true);
          param5.a(var20, -38);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_14_0 = runtimeException;
          stackIn_14_1 = new StringBuilder().append("bea.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param5 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param6).append(')').toString());
        }
    }

    private final int a(una param0, byte param1) {
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean[] var3 = null;
        RuntimeException var3_ref = null;
        bba[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        bba var6_ref_bba = null;
        int var7 = 0;
        rna[] var7_ref_rna__ = null;
        rna var9 = null;
        ika var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var5Lifetime1;
        var12 = VoidHunters.field_G;
        try {
          var3 = new boolean[2];
          var4 = param0.b(1);
          if (var4 == null) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          for (var5 = 0; var4.length > var5; var5++) {
            var6_ref_bba = var4[var5];
            var7_ref_rna__ = var6_ref_bba.c((byte) -42);
            if (var7_ref_rna__ != null) {
              for (var8 = 0; var7_ref_rna__.length > var8; var8++) {
                var9 = var7_ref_rna__[var8];
                if (var9 instanceof ika) {
                  var10 = (ika) (var9);
                  var11 = var10.a(0, -103);
                  if (var11 >= 0 &&
                    var3.length > var11) {
                    var3[var11] = true;
                  }
                }
              }
            }
          }
          var5Lifetime1 = -1;
          var6 = 0;
          if (param1 != -66) {
            field_a = (String[]) null;
          }
          while (var6 < var3.length) {
            var7 = var3[var6] ? 1 : 0;
            if (var7 == 0) {
              var5Lifetime1 = (-1 != var5Lifetime1) ? -2 : var6;
            }
            var6++;
          }
          stackIn_30_0 = var5Lifetime1;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_33_0 = var3_ref;
          stackIn_33_1 = new StringBuilder().append("bea.VA(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, mm param2, int param3, int param4, boolean param5, int param6, int param7) {
        cna[][] stackIn_38_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_59_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_83_0 = 0;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_106_2 = null;
        RuntimeException decompiledCaughtException = null;
        cna[] var8 = null;
        int var8_int = 0;
        RuntimeException var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int[] var10_ref_int__ = null;
        int var11 = 0;
        int var12 = 0;
        cna var13 = null;
        int var13_int = 0;
        int var14 = 0;
        int var15 = 0;
        cna[] var16 = null;
        int var10Lifetime1;
        int var13_intLifetime1;
        int var10Lifetime2;
        var15 = VoidHunters.field_G;
        try {
          boolean decompiledFrameCompleted2 = true;
          boolean decompiledFrameCompleted1 = true;
          if (param3 >= param0) {
            var8_int = 1;
            var9 = 0;
            while (true) {
              if (ncb.field_a.length <= var9) {
                if (var8_int == 0) {
                  decompiledFrameCompleted2 = false;
                  break;
                }
                hrb.field_b = true;
                decompiledFrameCompleted1 = false;
                break;
              }
              var10_ref_int__ = ncb.field_a[var9];
              var11 = 0;
              var12 = 0;
              L18: while (true) {
                if (var10_ref_int__.length <= var12) {
                  if (var11 == 0 &&
                    param3 != ocb.field_l) {
                    break L18;
                  }
                  for (var12 = 0; var10_ref_int__.length > var12; var12 += 2) {
                    var13_int = var10_ref_int__[var12];
                    if (var13_int == -1) {
                      nr.field_p = true;
                    } else {
                      if (param3 > var13_int) {
                        mia.field_a[var13_int] = true;
                      }
                    }
                  }
                  var8_int = 0;
                  break L18;
                }
                var13_intLifetime1 = var10_ref_int__[var12];
                var14 = var10_ref_int__[1 + var12];
                if (var13_intLifetime1 != -1) {
                  if (var13_intLifetime1 == param3 &&
                    param1 == var14) {
                    var11 = 1;
                  } else {
                    if (param3 <= var13_intLifetime1) {
                      break L18;
                    }
                    if ((255 & tib.field_i[var13_intLifetime1]) != var14) {
                      break L18;
                    }
                  }
                } else {
                  if (var14 != ieb.field_o[param7]) {
                    break L18;
                  }
                }
                var12 += 2;
                continue;

              }
              var9++;
            }
          }
          if ((decompiledFrameCompleted2) &&
            (decompiledFrameCompleted1)) {
            stackIn_38_0 = inb.field_q;
            if (param3 == -1) {
              stackIn_39_1 = 1;
            } else {
              stackIn_39_1 = 4 + param3;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            var16 = stackIn_38_0[stackIn_39_1];
            var8 = var16;
            var9 = 1;
            if (param5) {
              if (-1 == param3) {
                for (var10 = 0; var10 < ieb.field_o.length; var10++) {
                  if ((ce.field_o[var10 / 8] & 1 << (var10 & 7)) != 0) {
                    var9 = 0;
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
                decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
              }
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameCompleted0)) {
                for (var10Lifetime2 = 0; -1 + var16.length > var10Lifetime2; var10Lifetime2++) {
                  if ((nkb.field_p[(param6 + var10Lifetime2) / 8] & 1 << (param6 + var10Lifetime2 & 7)) == 0) {
                    continue;
                  }
                  var9 = 0;
                  break;
                }
                param6 = param6 + (vu.field_zb[param3] & 255);
              }
            }
            var10Lifetime1 = 0;
            var11 = 0;
            while (true) {
              if (param3 != -1) {
                stackIn_59_0 = -1 + var8.length;
              } else {
                stackIn_59_0 = ieb.field_o.length;
              }
              if (stackIn_59_0 <= var11) {
                if (var10Lifetime1 != 0) {
                  break;
                }
                for (var11 = 0; var11 < var8.length - 1; var11++) {
                  if (-1 == param3) {
                    param7 = var11;
                  } else {
                    tib.field_i[param3] = (byte)var11;
                  }
                  bea.a(param0, param1, param2, 1 + param3, 110, param5, param6, param7);
                  if (hrb.field_b) {
                    return;
                  }
                }
                break;
              }
              if (-1 == param3) {
                param7 = var11;
              } else {
                tib.field_i[param3] = (byte)var11;
              }
              if (param3 == -1 &&
                ieb.field_o.length == 1) {
                var12 = 1;
              } else {
                var13 = var8[var11 + 1];
                if (param5) {
                  if (!var13.field_J) {
                    if (var9 != 0) {
                      stackIn_83_0 = (var13.field_y) ? 1 : 0;
                    } else {
                      stackIn_83_0 = 0;
                    }
                  } else {
                    stackIn_83_0 = 1;
                  }
                  var12 = stackIn_83_0;
                } else {
                  if (-1 != param3) {
                    stackIn_74_0 = (var11 != (255 & lqa.field_o.field_Pb[param3])) ? 0 : 1;
                  } else {
                    stackIn_74_0 = (ieb.field_o[var11] != lqa.field_o.field_Fb) ? 0 : 1;
                  }
                  var12 = stackIn_74_0;
                }
              }
              if (var12 != 0) {
                bea.a(param0, param1, param2, param3 + 1, 91, param5, param6, param7);
                var10Lifetime1 = 1;
              }
              if (hrb.field_b) {
                return;
              }
              var11++;
            }
          }
          if (param4 <= 90) {
            field_a = (String[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_105_0 = var8_ref;
          stackIn_105_1 = new StringBuilder().append("bea.MB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_106_2 = "null";
          } else {
            stackIn_106_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_105_0), ((StringBuilder) (Object) stackIn_105_1).append(stackIn_106_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public final void b(byte param0, tv param1) {
        bea var3 = null;
        anb[] discarded$0 = null;
        Class[] var4 = null;
        dja[] var5 = null;
        try {
          var3 = (bea) (param1);
          var3.field_d = this.field_d;
          var3.field_c = dob.a(var3.field_c, (byte) -117, this.field_c);
          if (param0 <= 54) {
            discarded$0 = this.a(87, -72, (pe) null, 18);
          }
          var4 = new Class[]{rgb.class, ptb.class};
          var5 = new dja[]{rma.field_d, kn.field_q};
          var3.field_b = (dmb[]) (hla.a(var4, this.field_b, var5, -115, var3.field_b, 1, ra.field_o));
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "bea.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final int a(int param0, Random param1, int[] param2, byte param3) {
        int var8 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = VoidHunters.field_G;
        try {
          var6 = -78 / ((-30 - param3) / 39);
          var5_int = 0;
          var7 = hob.a(param1, param0, 124);
          for (var8 = 0; param2.length > var8; var8++) {
            var9 = param2[var8];
            if (var9 <= var7) {
              var7 = var7 - var9;
              continue;
            }
            var5_int = var8;
            break;
          }
          stackIn_8_0 = var5_int;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("bea.RA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(boolean param0, dmb param1) {
        try {
          this.field_b = (dmb[]) (ija.a(param1, this.field_b, 0, ra.field_o));
          if (!param0) {
            field_f = (float[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "bea.UA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final int[] a(Random param0, int[][] param1, byte param2, int param3, int param4) {
        int var8 = 0;
        int var10 = 0;
        int[] stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int[] var9 = null;
        int[] var11 = null;
        int var12 = 0;
        var12 = VoidHunters.field_G;
        try {
          var6 = this.a(param3, param0, (byte) 94, param1);
          if (param3 == 8 &&
            param1 != null) {
            var7 = param4 / 4;
            for (var8 = 0; var8 < param1.length; var8++) {
              if (var6[var8] == 2) {
                var9 = param1[var8];
                if (!this.a(var9, 30506, var7)) {
                  var6[var8] = 3;
                  for (var10 = 0; var10 < param1.length; var10++) {
                    var11 = param1[var8];
                    if (var6[var10] != 2 &&
                      this.a(var11, 30506, var7)) {
                      var6[var10] = 2;
                      break;
                    }
                  }
                }
              }
            }
          }
          if (param2 != 65) {
            this.a(-89, (rsb) null);
          }
          stackIn_21_0 = var6;
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_24_0 = var6_ref;
          stackIn_24_1 = new StringBuilder().append("bea.E(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void a(int param0, boolean param1, Random param2, rsb param3, int param4) {
        boolean discarded$1 = false;
        pe var7 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          var7 = param3.field_g;
          var7.b(param0, (byte) 23);
          var7.b((byte) 80);
          this.a(0, param1, param0, param2, param3);
          this.a(param1, param2, var7, 0);
          if (qab.a(33, param0)) {
            this.a(ksb.b(-100, param0), false, var7);
          }
          if (param4 < 34) {
            discarded$1 = this.a(42, 83, (int[]) null, 99, (byte) -48, -83);
          }
          var7.a(0);
          if (gj.a(param0, 22681)) {
            this.a(param2, 90, var7);
          }
          if (snb.a(param3, (byte) -24)) {
            this.a(-1, param2, param3);
            var7.a(48, true);
          } else {
            var7.a(48, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("bea.KB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param4).append(')').toString());
        }
    }

    final void a(pe param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        Random var5 = null;
        dmb[] var6 = null;
        int var7 = 0;
        dmb var8 = null;
        int var9 = VoidHunters.field_G;
        try {
          var3_int = param0.d(false);
          var4 = qta.a(var3_int, 9) ? 1 : 0;
          var5 = new Random((long)this.field_d);
          if (param1 != 0) {
            bea.a((byte) 80, (Object) null, -58);
          }
          this.a(false, var3_int, 27943, false, param0, var4 != 0, var5);
          if (null != this.field_b) {
            var6 = this.field_b;
            for (var7 = 0; var6.length > var7; var7++) {
              var8 = var6[var7];
              var8.a(param0, true);
            }
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "bea.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(boolean param0, boolean param1, pe param2) {
        anb[] discarded$0 = null;
        int var9 = 0;
        int var20 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
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
        rdb var21 = null;
        int var22 = 0;
        int var18Lifetime1;
        int var19Lifetime1;
        var22 = VoidHunters.field_G;
        try {
          if (param1) {
            discarded$0 = this.a(-44, 117, (pe) null, 24);
          }
          var4_int = param2.g((byte) -122);
          var5 = param2.m(1);
          var6 = 51200;
          var7 = 4;
          var8 = 2;
          for (var9 = 0; var9 < 2; var9++) {
            var10 = 0;
            var11 = 0;
            var12 = 2 * var9 - 1;
            var13 = 2 * var4_int / 3 * var9;
            var14 = var12 * (var6 * 2) + (var13 + -var4_int / 3);
            var15 = var5 / 3 - var5 * 2 / 3 * var9;
            if (param0 &&
              var9 == 1) {
              var14 = 2 * (var12 * var6);
              var15 = 0;
            }
            var16 = 2;
            if (param0) {
              var16 = 4;
            }
            var17 = 1 + var16;
            var18 = var6 * var17 + -var4_int / 2 - var14;
            if (var18 > 0) {
              var14 = var14 + var18;
            }
            var18Lifetime1 = var14 + var17 * var6 - var4_int / 2;
            if (0 < var18Lifetime1) {
              var14 = var14 - var18Lifetime1;
            }
            var19 = -var15 + (var17 * var6 + -var5 / 2);
            if (var19 > 0) {
              var15 = var15 + var19;
            }
            var19Lifetime1 = -(var5 / 2) - (-(var17 * var6) - var15);
            if (0 < var19Lifetime1) {
              var15 = var15 - var19Lifetime1;
            }
            for (var20 = 0; var20 < var7; var20++) {
              var21 = new rdb(var10 + var14, var15 + var11, var9);
              param2.a((byte) -90, var21);
              var10 = var10 + 51200 * var16 * var12;
              if (~(var8 - 1) == ~(var20 % var8)) {
                var10 = 0;
                var11 = var11 + -var12 * 51200 * var16;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_31_0 = var4;
          stackIn_31_1 = new StringBuilder().append("bea.AB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    private final anb[] a(int param0, Random param1, int param2, int param3, pe param4) {
        RuntimeException var6 = null;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ml var12_ref_ml = null;
        int var12 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        sg var18 = null;
        nbb var19 = null;
        cq var20 = null;
        bba var21 = null;
        bba var22 = null;
        Object stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var17 = VoidHunters.field_G;
        try {
          var18 = rpa.a(1, 1, true);
          var18.a(param2, param3, (byte) -108);
          var18.a(new aoa(), param0 ^ 4);
          var18.h(17704, param0);
          param4.a(var18, (byte) 107);
          var7 = null;
          var8 = param4.f(24797);
          for (var9 = 0; var8 > var9; var9++) {
            var10 = 8192 * var9 / var8;
            var11 = 2 * var18.g(-123);
            var12_ref_ml = new ml(26);
            var19 = new nbb(var12_ref_ml, false);
            var14 = (var11 >> 8) * (fc.a(var10, (byte) 115) >> 8);
            var15 = (eu.a(var10, 119) >> 8) * (var11 >> 8);
            var19.a(var14 + param2, param3 + var15, (byte) -61);
            var16 = hob.a(param1, 8192, 126);
            var19.a(var16, -107);
            param4.a(var19, (byte) 99);
            var7 = (anb[]) (ija.a(var19, (Object[]) (var7), param0 ^ 0, ebb.field_a));
          }
          var9Lifetime1 = -param4.g((byte) -122) / 2;
          var10Lifetime1 = param4.g((byte) -122) / 2;
          var11Lifetime1 = 262144;
          var12 = -var11Lifetime1 + var10Lifetime1;
          if (Math.abs(-param2 + var9Lifetime1) > Math.abs(var10Lifetime1 - param3)) {
            var12 = var9Lifetime1;
          }
          var20 = new cq(var12, param3 - var11Lifetime1 / 2);
          var20.field_e = var11Lifetime1;
          var20.field_d = var11Lifetime1;
          param4.a(5706, var20);
          var21 = new bba();
          var21.a((byte) -112, (wm) (new cc(var18.c(false))));
          var21.a(new ika(1), true);
          param4.a(var21, -38);
          var22 = new bba();
          var22.a((byte) -107, (wm) (new iia(var18.c(false), param4.e(true) - 1)));
          var22.a(new ika(0), true);
          param4.a(var22, param0 - 38);
          stackIn_8_0 = var7;
          return (anb[]) (stackIn_8_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("bea.LB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    private final int[][] a(int param0, int param1, Random param2, int[][] param3) {
        int[][] stackIn_33_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int[] var7 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        long var15 = 0L;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int[] var25 = null;
        int var27 = 0;
        int var28_int = 0;
        Object var28 = null;
        int var29_int = 0;
        Object var29 = null;
        int var30_int = 0;
        int[][] var30 = null;
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
        int[] var47 = null;
        int[] var48 = null;
        int[] var49 = null;
        int[] var50 = null;
        int[] var51 = null;
        int[] var52 = null;
        int var27Lifetime1;
        int var30_intLifetime1;
        int var31Lifetime1;
        int var32Lifetime1;
        int var31Lifetime1Lifetime1;
        var38 = VoidHunters.field_G;
        try {
          if (param0 != -3) {
            this.field_d = -113;
          }
          var5_int = 0;
          while (true) {
            if (var5_int >= param1) {
              stackIn_33_0 = (int[][]) (param3);
              return stackIn_33_0;
            }
            var6 = this.a((byte) 52, param2, param3);
            var7 = param3[var6];
            var47 = ela.a((byte) -118, var7);
            var9 = var47[0];
            var10 = var47[1];
            var11 = var47[2];
            var12 = var47[3];
            var13 = -var9 + var10;
            var14 = var12 - var11;
            var15 = (long)ar.a(var13, (byte) 118, var14);
            var17 = var9 + hob.a(param2, var13, 116);
            var18 = var11 + hob.a(param2, var14, 126);
            var19 = hob.a(param2, 8192, 118);
            var20 = (int)((long)(fc.a(var19, (byte) -84) >> 8) * (var15 >> 8));
            var21 = (int)((var15 >> 8) * (long)(eu.a(var19, 62) >> 8));
            var17 = var17 - var20;
            var18 = var18 - var21;
            var22 = var20 * 2 + var17;
            var23 = 2 * var21 + var18;
            var24 = 0;
            var25 = new int[2];
            var48 = new int[2];
            var27 = 0;
            L3: while (true) {
              if (var27 < var7.length) {
                var28_int = var7[var27];
                var29_int = var7[var27 + 1];
                var30_int = var7[(var27 + 2) % var7.length];
                var31 = var7[(3 + var27) % var7.length];
                var32 = ng.a(8, var29_int, (byte) 113, var28_int, var22, var30_int, var18, var17, var23, var31);
                if (-1 != var32) {
                  if (var24 == 2) {
                    var24++;
                    break L3;
                  }
                  var25[var24] = var27 >> 1;
                  var48[var24] = var32;
                  var24++;
                }
                var27 += 2;
                continue;
              }
              break;
            }
            if (var24 == 2) {
              var39 = 0;
              var27Lifetime1 = var39;
              var28 = null;
              var29 = null;
              var40 = 0;
              var30_intLifetime1 = var40;
              while (var7.length > var40) {
                var31Lifetime1 = var7[var40];
                var32Lifetime1 = var7[var40 + 1];
                var33 = var7[(2 + var40) % var7.length];
                var34 = var7[(var40 + 3) % var7.length];
                var35 = var40 >> 1;
                if (var39 == 1) {
                  var50 = kdb.a((int[]) (var29), var31Lifetime1, (byte) -96);
                  var29 = kdb.a(var50, var32Lifetime1, (byte) -114);
                } else {
                  var49 = kdb.a((int[]) (var28), var31Lifetime1, (byte) -102);
                  var28 = kdb.a(var49, var32Lifetime1, (byte) -118);
                }
                if (var39 < 2 &&
                  var35 == var25[var39]) {
                  var36 = ((-var31Lifetime1 + var33) * var48[var39] >> 8) + var31Lifetime1;
                  var37 = (var48[var39] * (-var32Lifetime1 + var34) >> 8) + var32Lifetime1;
                  var51 = kdb.a((int[]) (var28), var36, (byte) -113);
                  var28 = kdb.a(var51, var37, (byte) -104);
                  var52 = kdb.a((int[]) (var29), var36, (byte) -113);
                  var29 = kdb.a(var52, var37, (byte) -126);
                  var39++;
                }
                var40 += 2;
              }
              param3[var6] = (int[]) (var28);
              var30 = new int[1 + param3.length][];
              for (var31Lifetime1Lifetime1 = 0; var31Lifetime1Lifetime1 < param3.length; var31Lifetime1Lifetime1++) {
                var30[var31Lifetime1Lifetime1] = param3[var31Lifetime1Lifetime1];
              }
              var30[param3.length] = (int[]) (var29);
              param3 = var30;
            } else {
              param1++;
            }
            var5_int++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_36_0 = var5;
          stackIn_36_1 = new StringBuilder().append("bea.L(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',');
          if (param3 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(')').toString());
        }
    }

    private final cq[] a(int param0, pe param1, cq[] param2) {
        int var5 = 0;
        Object var4 = null;
        cq var6 = null;
        cq var7 = null;
        int var8 = 0;
        cq[] stackIn_3_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = VoidHunters.field_G;
        try {
          var4 = null;
          if (param0 != -7665) {
            stackIn_3_0 = (cq[]) null;
            return stackIn_3_0;
          }
          if (param2 != null) {
            for (var5 = 0; var5 < param2.length; var5++) {
              var6 = param2[var5];
              var7 = new cq(0, 0);
              var6.b((byte) 107, var7);
              var7.field_f = -var7.field_e - var7.field_f;
              var7.field_g = -var7.field_g - var7.field_d;
              param1.a(5706, var7);
              var4 = (cq[]) (ija.a(var7, (Object[]) (var4), 0, wsb.field_e));
            }
          }
          stackIn_9_0 = var4;
          return (cq[]) (stackIn_9_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("bea.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rta.a((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final void a(int param0, boolean param1, int param2, Random param3, rsb param4) {
        anb[] discarded$0 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        una var11 = null;
        int var12 = 0;
        Object var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16_int = 0;
        bba[] var16 = null;
        cq[] var18 = null;
        anb[] var19 = null;
        cq[] var20 = null;
        int var21 = 0;
        pe var22 = null;
        bha var23 = null;
        anb[] var24 = null;
        int var16_intLifetime1;
        var21 = VoidHunters.field_G;
        try {
          var22 = param4.field_g;
          var7 = var22.g((byte) -122) / 3;
          var8 = -var22.m(1) / 3;
          var9 = -var7;
          var10 = -var8;
          var11 = var22.e(param0);
          if (var11 != null &&
            null != var11.b(1)) {
            stackIn_5_0 = var22.e(0).b(1).length;
          } else {
            stackIn_5_0 = 0;
          }
          var12 = stackIn_5_0;
          var13 = null;
          var14 = 1;
          var15 = 0;
          for (var16_int = 0; param4.field_c.length > var16_int; var16_int++) {
            var23 = param4.field_c[var16_int];
            if (var23.field_a ||
              1 == foa.field_p) {
              var15++;
            }
          }
          var16_intLifetime1 = param2;
          if (var16_intLifetime1 != 0 &&
            4 != var16_intLifetime1) {
            if (1 != var16_intLifetime1 &&
              var16_intLifetime1 != 5) {
              if (var16_intLifetime1 != 2 &&
                var16_intLifetime1 != 6) {
                if (var16_intLifetime1 == 3) {
                  this.a(var15, var22, var7, var8, param3, 2097152);
                } else if (var16_intLifetime1 == 7) {
                  var14 = 0;
                  this.a(var8, var7, var10, -118, param3, var22, var9);
                } else if (var16_intLifetime1 == 8) {
                  var14 = 0;
                  var13 = this.a(var8, var7, var22, (byte) -85);
                } else if (var16_intLifetime1 == 9) {
                  var13 = this.a(109, var7, var22, var8);
                  var14 = 0;
                } else if (var16_intLifetime1 == 10) {
                  this.a(var22, 5985, var8, var7);
                  var14 = 0;
                } else if (var16_intLifetime1 == 12) {
                  var14 = 0;
                  this.a(var22, var8, -1, lga.a((byte) -2, param2), 2, var15, var7);
                } else if (var16_intLifetime1 == 11) {
                  this.a(var22, param0 + 3, var15);
                  var14 = 0;
                }
              } else {
                this.a(var7, param3, param4, (byte) 97, var8);
              }
            } else {
              var13 = this.a(0, param3, var9, var10, var22);
            }
          } else {
            var13 = this.b(122, var8, var22, var7);
          }
          if (param1) {
            discarded$0 = this.a(param4, (anb[]) (var13), (byte) 95, param3);
          }
          if (param1 &&
            var14 != 0 &&
            var22.e(0) != null &&
            var22.e(0).b(param0 + 1) != null) {
            var16 = var22.e(0).b(1);
            var24 = this.a(var12, param0 ^ -18656, var22, var16);
            var18 = this.a(var16, var22, var12, true);
            var19 = this.a(param4, var24, (byte) 61, param3);
            var20 = this.a(-7665, var22, var18);
            this.a(var12, var16, var18, var20, var22, var19, (byte) 54, var24);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_52_0 = var6;
          stackIn_52_1 = new StringBuilder().append("bea.SA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          stackIn_55_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',');
          if (param4 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(')').toString());
        }
    }

    private final cq[] a(wm[] param0, cq[] param1, int param2, pe param3) {
        int var5_int = 0;
        wm var6 = null;
        int var9 = 0;
        cq[] stackIn_3_0 = null;
        cq[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        iia var7 = null;
        cq var8 = null;
        var9 = VoidHunters.field_G;
        try {
          if (param2 >= -49) {
            stackIn_3_0 = (cq[]) null;
            return stackIn_3_0;
          }
          if (param0 != null) {
            for (var5_int = 0; var5_int < param0.length; var5_int++) {
              var6 = param0[var5_int];
              if (var6 instanceof iia) {
                var7 = (iia) (var6);
                var8 = param3.e((byte) -61, var7.a((byte) -123, 1));
                if (var8 != null) {
                  param1 = (cq[]) (kn.a(param1, var8, true, wsb.field_e, -102));
                }
              }
            }
          }
          stackIn_16_0 = (cq[]) (param1);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("bea.BB(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    private final void a(Random param0, pe param1, int[][] param2, int param3, int[] param4) {
        int var6_int = 0;
        int var18_int = 0;
        int[] stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_25_2 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int[] var7 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        crb var21_ref_crb = null;
        int var22 = 0;
        crb[] var22_ref_crb__ = null;
        int var23 = 0;
        int var24 = 0;
        crb[] var24_ref_crb__ = null;
        int var25 = 0;
        nbb var27 = null;
        int var27_int = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        crb var32 = null;
        ml var33 = null;
        int[] var34 = null;
        var30 = VoidHunters.field_G;
        try {
          for (var6_int = 0; param2.length > var6_int; var6_int++) {
            var7 = param2[var6_int];
            var34 = ela.a((byte) -101, var7);
            var9 = var34[0];
            var10 = var34[1];
            var11 = var34[2];
            var12 = var34[3];
            var13 = Math.min(tf.a(14, param3 - 120, var7), 1000);
            var14 = var10 - var9;
            var15 = -var11 + var12;
            var16 = param4[var6_int];
            if (var16 == 1) {
              var17 = var13 / 16;
              for (var18_int = 0; var18_int < var17; var18_int++) {
                var19 = hob.a(param0, var14, 123) + var9;
                var20 = var11 + hob.a(param0, var15, 118);
                if (fra.a(var7, var20, 2, var19)) {
                  var21_ref_crb = new crb(new ml(gnb.a(param0, (byte) 97)));
                  var21_ref_crb.a(var19, var20, (byte) -97);
                  var21_ref_crb.a(hob.a(param0, 8192, 116), -64);
                  var22_ref_crb__ = param1.a(true);
                  var23 = 0;
                  var24_ref_crb__ = var22_ref_crb__;
                  var25 = 0;
                  while (true) {
                    boolean decompiledFrameRemainder0 = true;
                    if (var25 < var24_ref_crb__.length) {
                      var32 = var24_ref_crb__[var25];
                      if (var32 != null) {
                        var27_int = var21_ref_crb.d(false) - var32.d(false);
                        var28 = var21_ref_crb.g((byte) 118) - var32.g((byte) -124);
                        var29 = ar.a(var27_int, (byte) 112, var28);
                        if (var29 < var21_ref_crb.field_k.i((byte) -112).field_l + var32.field_k.i((byte) -112).field_l) {
                          var23 = 1;
                          decompiledFrameRemainder0 = false;
                        }
                      }
                      if (decompiledFrameRemainder0) {
                        var25++;
                        continue;
                      }
                    }
                    if (var23 != 0) {
                      break;
                    }
                    param1.a((byte) 126, var21_ref_crb);
                    break;
                  }
                }
              }
            } else {
              if (var16 == 2) {
                var17 = var13 / 8;
                var18 = new int[56];
                for (var19 = 0; var18.length > var19; var19++) {
                  stackIn_24_0 = var18;
                  stackIn_24_1 = var19;
                  if (fbb.b(var19, 15923)) {
                    stackIn_25_2 = qqb.field_b;
                  } else {
                    stackIn_25_2 = 0;
                  }
                  stackIn_24_0[stackIn_24_1] = stackIn_25_2;
                }
                for (var19 = 0; var19 < 56; var19++) {
                  if (tr.a(param3 - 127, var19)) {
                    var18[var19] = 0;
                  }
                }
                var18[12] = 0;
                var18[28] = 0;
                var18[19] = 0;
                var18[20] = 0;
                var18[14] = 0;
                var18[17] = 0;
                var18[47] = 0;
                var19 = opb.field_o;
                var18[22] = var18[22] + this.field_c[25] * var19;
                if (0 < this.field_c[23]) {
                  var20 = var19 * this.field_c[23] / 4;
                  var18[35] = var18[35] + var20;
                  var18[37] = var18[37] + var20;
                  var18[51] = var18[51] + var20;
                  var18[36] = var18[36] + var20;
                }
                var18[42] = var18[42] + var19 * this.field_c[21];
                var18[45] = var18[45] + var19 * this.field_c[20];
                if (this.field_c[24] > 0) {
                  var20 = var19 * this.field_c[24] / 10;
                  var18[32] = var18[32] + var20;
                  var18[31] = var18[31] + var20;
                  var18[38] = var18[38] + var20;
                  var18[33] = var18[33] + var20;
                  var18[40] = var18[40] + var20;
                  var18[34] = var18[34] + var20;
                  var18[30] = var18[30] + var20;
                  var18[41] = var18[41] + var20;
                  var18[39] = var18[39] + var20;
                  var18[29] = var18[29] + var20;
                }
                if (this.field_c[22] > 0) {
                  var20 = this.field_c[22] * var19 / 2;
                  var18[43] = var18[43] + var20;
                  var18[44] = var18[44] + var20;
                }
                if (this.field_c[26] > 0) {
                  var20 = this.field_c[26] * var19 / 3;
                  var18[26] = var18[26] + var20;
                  var18[18] = var18[18] + var20;
                  var18[27] = var18[27] + var20;
                }
                var18[13] = var18[13] + this.field_c[27] * var19;
                if (0 < this.field_c[28]) {
                  var20 = var19 * this.field_c[28] / 5;
                  var18[15] = var18[15] + var20;
                  var18[16] = var18[16] + var20;
                  var18[25] = var18[25] + var20;
                  var18[24] = var18[24] + var20;
                  var18[23] = var18[23] + var20;
                }
                var20 = this.a(var18, param3 + 262143);
                var21 = -1;
                var22 = 0;
                while (var22 < var17) {
                  var23 = hob.a(param0, var14, 117) + var9;
                  var24 = var11 + hob.a(param0, var15, 119);
                  if (fra.a(var7, var24, 2, var23)) {
                    var25 = var21;
                    if (-1 != var25) {
                      var21 = -1;
                    } else {
                      var25 = this.a(var20, param0, var18, (byte) -75);
                      if (1 == qjb.field_d) {
                        var21 = var25;
                        if (38 != var25) {
                          if (var25 == 39) {
                            var21 = 38;
                          }
                        } else {
                          var21 = 39;
                        }
                        if (var25 == 36) {
                          var21 = 51;
                        } else {
                          if (var25 == 51) {
                            var21 = 36;
                          }
                        }
                      }
                    }
                    var33 = new ml(var25);
                    var27 = new nbb(var33, false);
                    var27.a(var23, var24, (byte) 85);
                    var27.a(hob.a(param0, 8192, param3 ^ 119), -47);
                    param1.a(var27, (byte) 104);
                  }
                  if (var17 - 1 <= var22 &&
                    var21 >= 0) {
                    var22--;
                  }
                  var22++;
                }
              }
            }
          }
          if (param3 != 1) {
            this.b((byte) 84, (tv) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_71_0 = var6;
          stackIn_71_1 = new StringBuilder().append("bea.HA(");
          if (param0 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',');
          if (param1 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          stackIn_77_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',');
          if (param2 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          stackIn_80_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(')').toString());
        }
    }

    private final void a(pe param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        bba var11 = null;
        int var12 = 0;
        int var13 = 0;
        bba var22 = null;
        bba var23 = null;
        cqb var14 = null;
        ih var15 = null;
        bba var24 = null;
        jsb var17 = null;
        tt var18 = null;
        bba var25 = null;
        cqb var20 = null;
        pob var21 = null;
        bba var26 = null;
        bba var27 = null;
        bba var28 = null;
        cqb var14Lifetime1;
        ih var15Lifetime1;
        jsb var17Lifetime1;
        tt var18Lifetime1;
        cqb var20Lifetime1;
        pob var21Lifetime1;
        try {
          var8_int = 0;
          var9 = 1;
          var10 = (param5 + 1) / 2;
          if (var10 <= 0) {
            var10 = 1;
          }
          var11 = new bba();
          var11.a((byte) -106, (wm) (new dab(0)));
          var11.a(new pob(var8_int, var10), true);
          var11.a(new cf(var8_int, 8), true);
          var11.a(new pob(var9, var10), true);
          var11.a(new cf(var9, 9), true);
          var12 = param4;
          if (param2 == -1) {
            var13 = param3;
            var11.a(new pob(var12, var13), true);
            var11.a(new cf(var12, 3), true);
          }
          param0.a(var11, -38);
          if (param2 == -1) {
            var22 = new bba();
            var22.a((byte) -124, (wm) (new cqb(var12, 1)));
            var22.a(new uoa(var12, -1), true);
            param0.a(var22, -38);
          }
          var23 = new bba();
          var14 = new cqb(var9, 1);
          ((wm) ((Object) var14)).field_a = true;
          var23.a((byte) -124, (wm) (var14));
          var15 = new ih(-1, 1);
          ((wm) ((Object) var15)).field_a = true;
          var23.a((byte) -113, (wm) (var15));
          var23.a(new ika(0), true);
          param0.a(var23, -38);
          var24 = new bba();
          var17 = new jsb(0);
          var24.a((byte) -110, (wm) (var17));
          var18 = new tt(var8_int, 3);
          var24.a(var18, true);
          param0.a(var24, param4 - 40);
          var25 = new bba();
          var20 = new cqb(var8_int, 0);
          ((wm) ((Object) var20)).field_a = true;
          var25.a((byte) -127, (wm) (var20));
          var21 = new pob(var8_int, 0);
          var25.a(var21, true);
          param0.a(var25, param4 - 40);
          var26 = new bba();
          var14Lifetime1 = new cqb(var8_int, 1);
          ((wm) ((Object) var14Lifetime1)).field_a = true;
          var26.a((byte) -128, (wm) (var14Lifetime1));
          var15Lifetime1 = new ih(-1, 0);
          ((wm) ((Object) var15Lifetime1)).field_a = true;
          var26.a((byte) -104, (wm) (var15Lifetime1));
          var26.a(new ika(1), true);
          param0.a(var26, param4 ^ -40);
          var27 = new bba();
          var17Lifetime1 = new jsb(1);
          var27.a((byte) -121, (wm) (var17Lifetime1));
          var18Lifetime1 = new tt(var9, 3);
          var27.a(var18Lifetime1, true);
          param0.a(var27, -38);
          var28 = new bba();
          var20Lifetime1 = new cqb(var9, 0);
          ((wm) ((Object) var20Lifetime1)).field_a = true;
          var28.a((byte) -118, (wm) (var20Lifetime1));
          var21Lifetime1 = new pob(var9, 0);
          var28.a(var21Lifetime1, true);
          param0.a(var28, -38);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "bea.CA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 1) {
          field_a = (String[]) null;
        }
        field_f = null;
        field_a = null;
    }

    private final void a(rna param0, int param1, pe param2, int param3) {
        int var5_int = 0;
        if (param1 != 17333) {
          return;
        }
        try {
          var5_int = param0.a(param3, -113);
          param0.a(param2, false, param3, mjb.b(21957, var5_int));
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "bea.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public final void b(faa param0, int param1) {
        Class[] var3 = null;
        try {
          param0.a(-632, this.field_d, 32);
          if (param1 >= -109) {
            field_f = (float[]) null;
          }
          pgb.a(8, this.field_c != null ? this.field_c.length : 0, 21, param0, this.field_c);
          var3 = new Class[]{rgb.class, ptb.class};
          pjb.a(param0, this.field_b, 8, 1, var3, 126);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "bea.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final boolean a(int[] param0, int param1, int param2) {
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = ela.a((byte) -102, param0);
          var4 = var8;
          var5 = (var8[1] + var8[0]) / 2;
          var6 = (var8[3] + var8[2]) / 2;
          if (param1 != 30506) {
            this.field_d = 72;
          }
          var7 = ar.a(var5, (byte) 111, var6);
          return !(param2 <= var7);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_8_0 = var4_ref;
          stackIn_8_1 = new StringBuilder().append("bea.QA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public final void a(tv param0, int param1) {
        int var4 = 0;
        bea var5 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var5 = (bea) (param0);
          tja.a(var5.field_b, 1, this.field_b, true, 5547);
          var4 = 0;
          if (var5.field_d != this.field_d) {
            System.out.println("int seed has changed. before=" + var5.field_d + ", now=" + this.field_d);
            var4 = 1;
          }
          if (param1 >= -19) {
            field_a = (String[]) null;
          }
          if (ikb.a(this.field_c, var5.field_c, false)) {
            var4 = 1;
            System.out.println("int[] option_totals has changed. ");
          }
          if (dn.a(var5.field_b, true, 1, this.field_b, -12)) {
            var4 = 1;
            System.out.println("MapClearanceArea[] clearance_areas has changed. ");
          }
          if (var4 != 0) {
            System.out.println("This instance of MissionBuilder has changed");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("bea.F(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(boolean param0, Random param1, pe param2, int param3) {
        una var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          if (param0) {
            return;
          }
          var5 = param2.e(param3);
          if (var5 == null) {
            return;
          }
          var6 = this.a(var5, (byte) -66);
          if (var6 >= 0) {
            this.a(-125, var6, var5);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_12_0 = var5_ref;
          stackIn_12_1 = new StringBuilder().append("bea.LA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    private final anb[] a(int param0, int param1, pe param2, bba[] param3) {
        int[] discarded$1 = null;
        int var6 = 0;
        Object var5 = null;
        bba var7 = null;
        int var8 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = VoidHunters.field_G;
        try {
          var5 = null;
          if (param1 != -18656) {
            discarded$1 = this.a((Random) null, (int[][]) null, (int[]) null, 44, -95);
          }
          for (var6 = param0; param3.length > var6; var6++) {
            var7 = param3[var6];
            var5 = this.a((byte) 127, param2, var7.a((byte) -120), (anb[]) (var5));
          }
          stackIn_7_0 = var5;
          return (anb[]) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("bea.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rta.a((Throwable) (stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final void a(int param0, boolean param1, pe param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 524288;
          var5 = 4194304;
          if (12 == param0 ||
            11 == param0) {
            var5 = var5 / 2;
          }
          var6 = -this.field_c[15] + this.field_c[14];
          if (param1) {
            field_a = (String[]) null;
          }
          var5 = var5 + var4_int * var6;
          if (var5 < var4_int) {
            var5 = var4_int;
          }
          if ((1 == param0 ||
            param0 == 5) &&
            var5 < 2097152) {
            var5 = 2097152;
          }
          param2.a(var5, (byte) 36);
          var7 = 2097152;
          var8 = this.field_c[16] - this.field_c[17];
          var7 = var7 + var4_int * var8;
          if (var7 < var4_int) {
            var7 = var4_int;
          }
          param2.e(var7, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_20_0 = runtimeException;
          stackIn_20_1 = new StringBuilder().append("bea.IA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    private final void a(int param0, pe param1, int param2, int param3, Random param4, int param5) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        Throwable decompiledCaughtException = null;
        int var7_int = 0;
        Exception var7 = null;
        RuntimeException var7_ref = null;
        String var8 = null;
        sg var10 = null;
        bba var11 = null;
        int[] var13 = null;
        try {
          this.a(param1, param3, 1, lga.a((byte) -2, 3), param5 - 2097150, param0, param2);
          try {
            var7_int = hob.a(param4, field_a.length, 127);
            var8 = field_a[var7_int];
            var13 = hta.a(var8, true, true);
            var10 = ae.a(var13, (byte) 65);
            var10.a(0, 0, (byte) 30);
            var10.a(new aoa(), param5 - 2097148);
            var10.h(param5 - 2079448, 1);
            param1.a(var10, (byte) 100);
            if (param5 != 2097152) {
              this.field_d = 0;
            }
            var11 = new bba();
            var11.a((byte) -98, (wm) (new cc(var10.c(false))));
            var11.a(new ika(0), true);
            param1.a(var11, -38);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var7 = (Exception) (Object) decompiledCaughtException;
            var7.printStackTrace();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var7_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_9_0 = var7_ref;
          stackIn_9_1 = new StringBuilder().append("bea.EA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(')').toString());
        }
    }

    private final int a(int param0, int param1, cq[] param2, pe param3, cq[] param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = VoidHunters.field_G;
        try {
          if (param4 != null) {
            for (var6_int = 0; var6_int < param4.length; var6_int++) {
              if (param0 == param3.a(param4[var6_int], param1 + 2958)) {
                stackIn_8_0 = param3.a(param2[var6_int], 87);
                return stackIn_8_0;
              }
            }
          }
          if (param1 != -2950) {
            this.a(54, false, -51, (Random) null, (rsb) null);
          }
          stackIn_13_0 = param0;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("bea.GB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    private final void a(Random param0, int[][] param1, int[] param2, pe param3, boolean param4, int param5) {
        int var7_int = 0;
        int var21 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int[] var8 = null;
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
        int var22 = 0;
        int var23 = 0;
        qob var25 = null;
        int var26 = 0;
        int[] var28 = null;
        var26 = VoidHunters.field_G;
        try {
          for (var7_int = 0; var7_int < param1.length; var7_int++) {
            var8 = param1[var7_int];
            var28 = ela.a((byte) -94, var8);
            var10 = var28[0];
            var11 = var28[1];
            var12 = var28[2];
            var13 = var28[3];
            var14 = Math.min(tf.a(14, -85, var8), 1000);
            var15 = var11 - var10;
            var16 = var13 - var12;
            var17 = param2[var7_int];
            if (0 == var17) {
              var18 = 2 * var14;
              var19 = (var28[0] + var28[1]) / 2;
              var20 = (var28[2] + var28[3]) / 2;
              for (var21 = 0; var21 < var18; var21++) {
                var22 = hob.a(param0, var15, 116) + var10;
                var23 = hob.a(param0, var16, 120) + var12;
                if (fra.a(var8, var23, 2, var22) &&
                  this.a(var19, var22, var8, var23, (byte) 105, var20)) {
                  var25 = new qob(var22, var23);
                  param3.a(param4, var25, (byte) -71);
                }
              }
            }
          }
          if (param5 != 4) {
            this.a(15, (Random) null, (rsb) null, (byte) -65, 46);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_21_0 = var7;
          stackIn_21_1 = new StringBuilder().append("bea.WA(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param3 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_f = new float[2];
        field_a = new String[]{"AAEAKQEoAyABHv8CDwMPBA--BSX-AigDIAEiAg8DDwQrBSv-AhkDGQQZBSIAKwEPAg8GK---AygBJQMgAg8DDwQPBR7-----ASkBKAMgAR7-Ag8DDwQP-wUl-wIoAyABIgIPAw8EKwUr-wIZAxkEGQUiACsBDwIPBiv--wMoASUDIAIPAw8EDwUe-----wIpASgDIAEe-wIPAw8ED-8FJf8CKAMgASICDwMPBCsFK-8CGQMZBBkFIgArAQ8CDwYr--8DKAElAyACDwMPBA8FHv----8DKQEoAyABHv8CDwMPBA--BSX-AigDIAEiAg8DDwQrBSv-AhkDGQQZBSIAKwEPAg8GK---AygBJQMgAg8DDwQPBR7---8", "AAEAKQEoABsDIAAkAR7-Ag8DDwQP--8CKAItAx0AIAEiAg8DDwQrBSv-AhkDGQQZBSIAKwEPAg8GK---BC3-AygDIAIPAw8EDwUeACT--wYb-wEpASgAGwMgACQBHv8CDwMPBA---wIoAi0DHQAgASICDwMPBCsFK-8CGQMZBBkFIgArAQ8CDwYr--8ELf8DKAMgAg8DDwQPBR4AJP--Bhv-AikBKAAbAyAAJAEe-wIPAw8ED---AigCLQMdACABIgIPAw8EKwUr-wIZAxkEGQUiACsBDwIPBiv--wQt-wMoAyACDwMPBA8FHgAk--8GG-8DKQEoABsDIAAkAR7-Ag8DDwQP--8CKAItAx0AIAEiAg8DDwQrBSv-AhkDGQQZBSIAKwEPAg8GK---BC3-AygDIAIPAw8EDwUeACT--wYb"};
    }
}
