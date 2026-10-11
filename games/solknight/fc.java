/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc extends gg {
    static int field_o;
    static boolean field_m;
    byte[] field_h;
    static int[] field_n;
    g[] field_i;
    private int[] field_k;
    byte[] field_r;
    byte[] field_p;
    sh[] field_q;
    static gl field_l;
    int field_j;
    short[] field_s;

    final static int a(String param0, int param1, boolean param2, boolean param3, String param4, int param5) {
        try {
          int stackIn_6_0 = 0;
          int stackIn_31_0 = 0;
          boolean stackIn_44_0 = false;
          boolean stackIn_47_0 = false;
          int stackIn_74_0 = 0;
          int stackIn_85_0 = 0;
          int stackIn_87_0 = 0;
          int stackIn_98_0 = 0;
          int stackIn_100_0 = 0;
          RuntimeException stackIn_103_0 = null;
          StringBuilder stackIn_103_1 = null;
          String stackIn_104_2 = null;
          StringBuilder stackIn_106_1 = null;
          String stackIn_107_2 = null;
          Throwable decompiledCaughtException = null;
          int var6_int = 0;
          RuntimeException var6 = null;
          int var7 = 0;
          int var8 = 0;
          Throwable var8_ref_Throwable = null;
          int var9 = 0;
          String var10 = null;
          String var11 = null;
          String var12 = null;
          CharSequence var13 = null;
          int var6_intLifetime1;
          int var6_intLifetime2;
          int var8Lifetime1;
          var9 = SolKnight.field_L ? 1 : 0;
          try {
            if (null == lf.field_d &&
              !ai.a(param2, (byte) -37)) {
              stackIn_6_0 = -1;
              return stackIn_6_0;
            }
            if (qc.field_i == ef.field_e) {
              if (param2) {
                var11 = (String) null;
                lf.field_a = pb.a(false, param4, kc.field_P, 0, (String) null);
              } else {
                lf.field_a = rj.a(param0, (byte) 102, param4, false);
              }
              id.field_c.field_m = 0;
              id.field_c.c(param5 ^ -121, 14);
              id.field_c.c(-127, lf.field_a.a(77).field_e);
              qf.a(param5 + 0, -1);
              ef.field_e = gl.field_s;
            }
            if (ef.field_e == gl.field_s &&
              bf.c(81, 1)) {
              var6_int = te.field_N.j(255);
              te.field_N.field_m = 0;
              if (0 != var6_int) {
                ef.field_e = ik.field_e;
                ob.field_h = var6_int;
                te.field_O = -1;
              } else {
                ef.field_e = pl.field_b;
              }
            }
            if (ef.field_e == pl.field_b &&
              bf.c(54, 8)) {
              i.field_H = te.field_N.a(10526);
              te.field_N.field_m = 0;
              ci.a(-25776, param2, param1, lf.field_a, param3);
              ef.field_e = rc.field_o;
            }
            boolean decompiledFrameRemainder0 = true;
            if (ef.field_e == rc.field_o &&
              bf.c(53, 1)) {
              var6_intLifetime1 = te.field_N.j(255);
              ob.field_h = var6_intLifetime1;
              te.field_N.field_m = 0;
              ri.field_a = null;
              if (0 != var6_intLifetime1 &&
                var6_intLifetime1 != 1) {
                if (var6_intLifetime1 != 8) {
                  ef.field_e = ik.field_e;
                  te.field_O = -1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  je.a(false);
                  je.field_c = false;
                  stackIn_31_0 = var6_intLifetime1;
                  return stackIn_31_0;
                }
              }
              if (decompiledFrameRemainder0) {
                ef.field_e = dk.field_h;
                te.field_O = -1;
              }
            }
            if (dk.field_h == ef.field_e &&
              qd.b((byte) 127)) {
              kc.field_P = te.field_N.a(10526);
              lh.field_s = te.field_N.j(255);
              te.field_N.j(param5 + 255);
              ob.field_l = te.field_N.i(param5 - 103);
              var12 = te.field_N.g(87);
              var7 = te.field_N.j(255);
              if (0 != (var7 & 1)) {
                uf.d(31911);
              }
              if (!param2) {
                stackIn_44_0 = ((4 & var7) != 0);
                lc.field_u = stackIn_44_0;
                stackIn_47_0 = (0 != (8 & var7));
                fb.field_a = stackIn_47_0;
                if (!fb.field_a) {
                }
              }
              if (b.field_b) {
                te.field_N.j(255);
                te.field_N.j(255);
                te.field_N.e(true);
                me.field_d = te.field_N.i(param5 - 105);
                dk.field_l = new byte[me.field_d];
                for (var8 = 0; var8 < me.field_d; var8++) {
                  dk.field_l[var8] = te.field_N.a((byte) -14);
                }
              }
              ne.field_g = te.field_N.h(16);
              var13 = (CharSequence) ((Object) ne.field_g);
              kf.field_D = jg.a(var13, -2);
              c.field_H = te.field_N.j(255);
              ef.field_e = jj.field_Y;
              if (lf.field_a.a(123) != dc.field_k) {
                if (lf.field_a.a(param5 + 70) == qb.field_L) {
                  bb.field_I.a((byte) 104, ia.g(-78));
                }
              } else {
                sk.field_p.a((byte) 82, ia.g(-55));
              }
              je.field_c = false;
              if (var12 != null) {
                kl.a(ia.g(90), var12, 13536);
              }
              if (ob.field_l <= 0 &&
                !lc.field_u) {
                try {
                  fd.a(ia.g(param5 + 110), "unzap", (byte) 101);
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  fd.a(param5 - 4476, ia.g(-63), "zap", new Object[]{ub.a(-62, kc.field_P)});
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (0 < ob.field_l) {
                cl.field_m = true;
              }
              id.field_c.a(-1, ed.field_a);
              for (var8Lifetime1 = 0; var8Lifetime1 < 4; var8Lifetime1++) {
                ed.field_a[var8Lifetime1] = ed.field_a[var8Lifetime1] + 50;
              }
              te.field_N.a(-1, ed.field_a);
              stackIn_74_0 = ob.field_h;
              return stackIn_74_0;
            }
            if (ik.field_e == ef.field_e &&
              qd.b((byte) 125)) {
              je.a(false);
              if (ob.field_h == 7 &&
                !je.field_c) {
                je.field_c = true;
                stackIn_87_0 = -1;
                return stackIn_87_0;
              }
              if (ob.field_h == 7) {
                ob.field_h = 3;
              }
              md.field_v = te.field_N.h(param5 + 121);
              je.field_c = false;
              stackIn_85_0 = ob.field_h;
              return stackIn_85_0;
            }
            if (param5 != 0) {
              var10 = (String) null;
              fc.a((Throwable) null, (String) null);
            }
            if (null == lf.field_d) {
              if (je.field_c) {
                if (dh.b(-1) > 30000L) {
                  md.field_v = il.field_d;
                } else {
                  md.field_v = cl.field_j;
                }
                je.field_c = false;
                stackIn_98_0 = 3;
                return stackIn_98_0;
              }
              var6_intLifetime2 = ia.field_kb;
              ia.field_kb = ki.field_C;
              ki.field_C = var6_intLifetime2;
              je.field_c = true;
            }
            stackIn_100_0 = -1;
            return stackIn_100_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_103_0 = var6;
            stackIn_103_1 = new StringBuilder().append("fc.D(");
            if (param0 == null) {
              stackIn_104_2 = "null";
            } else {
              stackIn_104_2 = "{...}";
            }
            stackIn_106_1 = ((StringBuilder) (Object) stackIn_103_1).append(stackIn_104_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_107_2 = "null";
            } else {
              stackIn_107_2 = "{...}";
            }
            throw fc.a((Throwable) ((Object) stackIn_103_0), ((StringBuilder) (Object) stackIn_106_1).append(stackIn_107_2).append(',').append(param5).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0) {
        this.field_k = null;
        if (param0 != 6890) {
          fc.a((byte) 62);
        }
    }

    public static void a(byte param0) {
        field_n = null;
        field_l = null;
        if (param0 != 124) {
          String var2 = (String) null;
          fc.a((Throwable) null, (String) null);
        }
    }

    final boolean a(me param0, int[] param1, byte[] param2, int param3) {
        int var9 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = SolKnight.field_L ? 1 : 0;
        try {
          var6 = 89 % ((-82 - param3) / 36);
          var5_int = 1;
          var7 = 0;
          var8 = null;
          for (var9 = 0; var9 < 128; var9++) {
            if (param2 == null ||
              param2[var9] != 0) {
              var10 = this.field_k[var9];
              if (0 != var10) {
                if (var7 != var10) {
                  var7 = var10;
                  var10--;
                  if (0 == (var10 & 1)) {
                    var8 = param0.a(0, var10 >> 2, param1);
                  } else {
                    var8 = param0.a(param1, -2, var10 >> 2);
                  }
                  if (var8 == null) {
                    var5_int = 0;
                  }
                }
                if (var8 != null) {
                  this.field_q[var9] = (sh) (var8);
                  this.field_k[var9] = 0;
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
          stackIn_23_1 = new StringBuilder().append("fc.C(");
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
          throw fc.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param3).append(')').toString());
        }
    }

    final static ve a(Throwable param0, String param1) {
        ve var2 = null;
        if (param0 instanceof ve) {
          var2 = (ve) ((Object) param0);
          var2.field_d = var2.field_d + ' ' + param1;
        } else {
          var2 = new ve(param0, param1);
        }
        return var2;
    }

    fc(byte[] param0) {
        int var11_int = 0;
        int incrementValue$0 = 0;
        g dupTemp$8 = null;
        int incrementValue$6 = 0;
        int var25_int = 0;
        int incrementValue$3 = 0;
        byte[] stackIn_39_0 = null;
        byte[] stackIn_42_0 = null;
        RuntimeException stackIn_206_0 = null;
        StringBuilder stackIn_206_1 = null;
        String stackIn_207_2 = null;
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
        g[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        byte[] var15 = null;
        g var15_ref = null;
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
        int var28_int = 0;
        g var28 = null;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var37 = 0;
        gb var38 = null;
        byte[] var39 = null;
        g var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        g var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        g var48 = null;
        g var49 = null;
        g var50 = null;
        g var51 = null;
        g var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        byte[] var57 = null;
        byte[] var58 = null;
        g var28Lifetime1;
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
        int var28_intLifetime1;
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
          this.field_r = new byte[128];
          this.field_p = new byte[128];
          this.field_h = new byte[128];
          this.field_i = new g[128];
          this.field_q = new sh[128];
          this.field_s = new short[128];
          this.field_k = new int[128];
          var38 = new gb(param0);
          for (var3 = 0; 0 != var38.field_l[var3 + var38.field_m]; var3++) {
          }
          var55 = new byte[var3];
          var42 = var55;
          var4 = var42;
          for (var5 = 0; var3 > var5; var5++) {
            var4[var5] = var38.a((byte) -14);
          }
          var3++;
          var38.field_m = var38.field_m + 1;
          var5Lifetime1 = var38.field_m;
          var38.field_m = var38.field_m + var3;
          for (var6 = 0; var38.field_l[var38.field_m + var6] != 0; var6++) {
          }
          var56 = new byte[var6];
          var43 = var56;
          var7 = var43;
          for (var8 = 0; var6 > var8; var8++) {
            var7[var8] = var38.a((byte) -14);
          }
          var6++;
          var38.field_m = var38.field_m + 1;
          var8Lifetime1 = var38.field_m;
          var38.field_m = var38.field_m + var6;
          for (var9 = 0; var38.field_l[var9 + var38.field_m] != 0; var9++) {
          }
          var57 = new byte[var9];
          var44 = var57;
          var10 = var44;
          for (var11_int = 0; var9 > var11_int; var11_int++) {
            var10[var11_int] = var38.a((byte) -14);
          }
          var9++;
          var38.field_m = var38.field_m + 1;
          var53 = new byte[var9];
          var39 = var53;
          var11 = var39;
          if (var9 > 1) {
            var53[1] = (byte) 1;
            var13_int = 1;
            var12 = 2;
            for (var14 = 2; var9 > var14; var14++) {
              var15_int = var38.j(255);
              if (var15_int != 0) {
                if (var13_int >= var15_int) {
                  var15_int--;
                }
                var13_int = var15_int;
              } else {
                incrementValue$0 = var12;
                var12++;
                var13_int = incrementValue$0;
              }
              var11[var14] = (byte)var13_int;
            }
          } else {
            var12 = var9;
          }
          var13 = new g[var12];
          for (var14Lifetime1 = 0; var14Lifetime1 < var13.length; var14Lifetime1++) {
            dupTemp$8 = new g();
            var13[var14Lifetime1] = dupTemp$8;
            var40 = dupTemp$8;
            var15_ref = var40;
            var16_int = var38.j(255);
            if (var16_int > 0) {
              var15_ref.field_j = new byte[2 * var16_int];
            }
            var16_intLifetime1 = var38.j(255);
            if (var16_intLifetime1 > 0) {
              var15_ref.field_i = new byte[2 + 2 * var16_intLifetime1];
              var40.field_i[1] = (byte)64;
            }
          }
          var14Lifetime2 = var38.j(255);
          if (var14Lifetime2 > 0) {
            stackIn_39_0 = new byte[2 * var14Lifetime2];
          } else {
            stackIn_39_0 = null;
          }
          var58 = stackIn_39_0;
          var46 = var58;
          var15 = var46;
          var14Lifetime3 = var38.j(255);
          if (var14Lifetime3 <= 0) {
            stackIn_42_0 = null;
          } else {
            stackIn_42_0 = new byte[var14Lifetime3 * 2];
          }
          var47 = stackIn_42_0;
          var16 = var47;
          for (var17 = 0; var38.field_l[var38.field_m + var17] != 0; var17++) {
          }
          var54 = new byte[var17];
          var41 = var54;
          var18 = var41;
          for (var19 = 0; var17 > var19; var19++) {
            var18[var19] = var38.a((byte) -14);
          }
          var38.field_m = var38.field_m + 1;
          var17++;
          var19Lifetime1 = 0;
          for (var20 = 0; var20 < 128; var20++) {
            var19Lifetime1 = var19Lifetime1 + var38.j(255);
            this.field_s[var20] = (short)var19Lifetime1;
          }
          var19Lifetime2 = 0;
          for (var20Lifetime1 = 0; var20Lifetime1 < 128; var20Lifetime1++) {
            var19Lifetime2 = var19Lifetime2 + var38.j(255);
            this.field_s[var20Lifetime1] = (short)(this.field_s[var20Lifetime1] + (var19Lifetime2 << 8));
          }
          var20Lifetime2 = 0;
          var21 = 0;
          var22 = 0;
          for (var23 = 0; 128 > var23; var23++) {
            if (var20Lifetime2 == 0) {
              if (var21 < var54.length) {
                var20Lifetime2 = var18[var21++];
              } else {
                var20Lifetime2 = -1;
              }
              var22 = var38.c((byte) 120);
            }
            this.field_s[var23] = (short)(this.field_s[var23] + (fi.a(-1 + var22, 2) << 14));
            var20Lifetime2--;
            this.field_k[var23] = var22;
          }
          var21Lifetime1 = 0;
          var20Lifetime3 = 0;
          var23Lifetime1 = 0;
          for (var24 = 0; var24 < 128; var24++) {
            if (this.field_k[var24] != 0) {
              if (0 == var20Lifetime3) {
                if (var21Lifetime1 >= var55.length) {
                  var20Lifetime3 = -1;
                } else {
                  var20Lifetime3 = var4[var21Lifetime1++];
                }
                incrementValue$6 = var5Lifetime1;
                var5Lifetime1++;
                var23Lifetime1 = -1 + var38.field_l[incrementValue$6];
              }
              this.field_h[var24] = (byte)var23Lifetime1;
              var20Lifetime3--;
            }
          }
          var21Lifetime2 = 0;
          var20Lifetime4 = 0;
          var24Lifetime1 = 0;
          for (var25_int = 0; var25_int < 128; var25_int++) {
            if (this.field_k[var25_int] != 0) {
              if (var20Lifetime4 == 0) {
                incrementValue$3 = var8Lifetime1;
                var8Lifetime1++;
                var24Lifetime1 = 16 + var38.field_l[incrementValue$3] << 2;
                if (var56.length <= var21Lifetime2) {
                  var20Lifetime4 = -1;
                } else {
                  var20Lifetime4 = var7[var21Lifetime2++];
                }
              }
              this.field_r[var25_int] = (byte)var24Lifetime1;
              var20Lifetime4--;
            }
          }
          var21Lifetime3 = 0;
          var20Lifetime5 = 0;
          var25 = null;
          for (var26 = 0; var26 < 128; var26++) {
            if (this.field_k[var26] != 0) {
              if (var20Lifetime5 == 0) {
                var25 = var13[var53[var21Lifetime3]];
                if (var21Lifetime3 < var57.length) {
                  var20Lifetime5 = var10[var21Lifetime3++];
                } else {
                  var20Lifetime5 = -1;
                }
              }
              var20Lifetime5--;
              this.field_i[var26] = (g) (var25);
            }
          }
          var20Lifetime6 = 0;
          var21Lifetime4 = 0;
          var26Lifetime1 = 0;
          for (var27 = 0; 128 > var27; var27++) {
            if (var20Lifetime6 == 0) {
              if (var54.length > var21Lifetime4) {
                var20Lifetime6 = var18[var21Lifetime4++];
              } else {
                var20Lifetime6 = -1;
              }
              if (0 < this.field_k[var27]) {
                var26Lifetime1 = 1 + var38.j(255);
              }
            }
            var20Lifetime6--;
            this.field_p[var27] = (byte)var26Lifetime1;
          }
          this.field_j = var38.j(255) + 1;
          for (var27Lifetime1 = 0; var27Lifetime1 < var12; var27Lifetime1++) {
            var45 = var13[var27Lifetime1];
            if (null != var45.field_j) {
              for (var29 = 1; var29 < var45.field_j.length; var29 += 2) {
                var45.field_j[var29] = var38.a((byte) -14);
              }
            }
            if (null != var45.field_i) {
              for (var29Lifetime5 = 3; -2 + var45.field_i.length > var29Lifetime5; var29Lifetime5 += 2) {
                var45.field_i[var29Lifetime5] = var38.a((byte) -14);
              }
            }
          }
          if (var15 != null) {
            for (var27Lifetime2 = 1; var58.length > var27Lifetime2; var27Lifetime2 += 2) {
              var15[var27Lifetime2] = var38.a((byte) -14);
            }
          }
          if (null != var16) {
            for (var27Lifetime3 = 1; var27Lifetime3 < var47.length; var27Lifetime3 += 2) {
              var16[var27Lifetime3] = var38.a((byte) -14);
            }
          }
          for (var27Lifetime4 = 0; var12 > var27Lifetime4; var27Lifetime4++) {
            var48 = var13[var27Lifetime4];
            var28 = var48;
            if (null != var48.field_i) {
              var19Lifetime3 = 0;
              for (var29Lifetime1 = 2; var48.field_i.length > var29Lifetime1; var29Lifetime1 += 2) {
                var19Lifetime3 = 1 + (var19Lifetime3 + var38.j(255));
                var48.field_i[var29Lifetime1] = (byte)var19Lifetime3;
              }
            }
          }
          for (var27Lifetime5 = 0; var27Lifetime5 < var12; var27Lifetime5++) {
            var49 = var13[var27Lifetime5];
            if (var49.field_j != null) {
              var19Lifetime4 = 0;
              for (var29Lifetime2 = 2; var29Lifetime2 < var49.field_j.length; var29Lifetime2 += 2) {
                var19Lifetime4 = var38.j(255) + var19Lifetime4 + 1;
                var49.field_j[var29Lifetime2] = (byte)var19Lifetime4;
              }
            }
          }
          if (var15 != null) {
            var19Lifetime5 = var38.j(255);
            var15[0] = (byte)var19Lifetime5;
            for (var27Lifetime6 = 2; var27Lifetime6 < var58.length; var27Lifetime6 += 2) {
              var19Lifetime5 = 1 + (var19Lifetime5 + var38.j(255));
              var15[var27Lifetime6] = (byte)var19Lifetime5;
            }
            var27Lifetime6Lifetime1 = var58[0];
            var28_int = var58[1];
            for (var29Lifetime3 = 0; var29Lifetime3 < var27Lifetime6Lifetime1; var29Lifetime3++) {
              this.field_p[var29Lifetime3] = (byte)(this.field_p[var29Lifetime3] * var28_int + 32 >> 6);
            }
            var29Lifetime3Lifetime1 = 2;
            while (var58.length > var29Lifetime3Lifetime1) {
              var30 = var58[var29Lifetime3Lifetime1];
              var31 = var15[1 + var29Lifetime3Lifetime1];
              var32 = (var30 - var27Lifetime6Lifetime1) * var28_int + (-var27Lifetime6Lifetime1 + var30) / 2;
              for (var33 = var27Lifetime6Lifetime1; var33 < var30; var33++) {
                var34 = ke.b(var32, -1697860097, var30 - var27Lifetime6Lifetime1);
                var32 = var32 + (var31 - var28_int);
                this.field_p[var33] = (byte)(32 + var34 * this.field_p[var33] >> 6);
              }
              var28_int = var31;
              var29Lifetime3Lifetime1 += 2;
              var27Lifetime6Lifetime1 = var30;
            }
            for (var30Lifetime2 = var27Lifetime6Lifetime1; var30Lifetime2 < 128; var30Lifetime2++) {
              this.field_p[var30Lifetime2] = (byte)(32 + this.field_p[var30Lifetime2] * var28_int >> 6);
            }
            var15 = null;
          }
          if (var16 != null) {
            var19Lifetime6 = var38.j(255);
            var16[0] = (byte)var19Lifetime6;
            for (var27Lifetime7 = 2; var47.length > var27Lifetime7; var27Lifetime7 += 2) {
              var19Lifetime6 = var19Lifetime6 + (1 + var38.j(255));
              var16[var27Lifetime7] = (byte)var19Lifetime6;
            }
            var27Lifetime7Lifetime1 = var47[0];
            var28_intLifetime1 = var47[1] << 1;
            for (var29Lifetime4 = 0; var27Lifetime7Lifetime1 > var29Lifetime4; var29Lifetime4++) {
              var30Lifetime1 = var28_intLifetime1 + (this.field_r[var29Lifetime4] & 255);
              if (0 > var30Lifetime1) {
                var30Lifetime1 = 0;
              }
              if (var30Lifetime1 > 128) {
                var30Lifetime1 = 128;
              }
              this.field_r[var29Lifetime4] = (byte)var30Lifetime1;
            }
            var29Lifetime4Lifetime1 = 2;
            while (var29Lifetime4Lifetime1 < var47.length) {
              var30Lifetime1Lifetime1 = var47[var29Lifetime4Lifetime1];
              var31Lifetime1 = var16[var29Lifetime4Lifetime1 + 1] << 1;
              var32Lifetime1 = (var30Lifetime1Lifetime1 - var27Lifetime7Lifetime1) * var28_intLifetime1 + (var30Lifetime1Lifetime1 - var27Lifetime7Lifetime1) / 2;
              var37 = var27Lifetime7Lifetime1;
              var33Lifetime1 = var37;
              while (var30Lifetime1Lifetime1 > var37) {
                var34Lifetime1 = ke.b(var32Lifetime1, -1697860097, -var27Lifetime7Lifetime1 + var30Lifetime1Lifetime1);
                var35 = var34Lifetime1 + (255 & this.field_r[var37]);
                if (var35 < 0) {
                  var35 = 0;
                }
                if (var35 > 128) {
                  var35 = 128;
                }
                var32Lifetime1 = var32Lifetime1 + (-var28_intLifetime1 + var31Lifetime1);
                this.field_r[var37] = (byte)var35;
                var37++;
              }
              var29Lifetime4Lifetime1 += 2;
              var28_intLifetime1 = var31Lifetime1;
              var27Lifetime7Lifetime1 = var30Lifetime1Lifetime1;
            }
            for (var30Lifetime1Lifetime2 = var27Lifetime7Lifetime1; var30Lifetime1Lifetime2 < 128; var30Lifetime1Lifetime2++) {
              var31Lifetime1Lifetime1 = (255 & this.field_r[var30Lifetime1Lifetime2]) + var28_intLifetime1;
              if (var31Lifetime1Lifetime1 < 0) {
                var31Lifetime1Lifetime1 = 0;
              }
              if (var31Lifetime1Lifetime1 > 128) {
                var31Lifetime1Lifetime1 = 128;
              }
              this.field_r[var30Lifetime1Lifetime2] = (byte)var31Lifetime1Lifetime1;
            }
            var16 = null;
          }
          for (var27Lifetime8 = 0; var27Lifetime8 < var12; var27Lifetime8++) {
            var13[var27Lifetime8].field_c = var38.j(255);
          }
          for (var27Lifetime9 = 0; var27Lifetime9 < var12; var27Lifetime9++) {
            var50 = var13[var27Lifetime9];
            var28Lifetime1 = var50;
            if (null != var50.field_j) {
              var28Lifetime1.field_b = var38.j(255);
            }
            if (var28Lifetime1.field_i != null) {
              var28Lifetime1.field_h = var38.j(255);
            }
            if (var28Lifetime1.field_c > 0) {
              var28Lifetime1.field_g = var38.j(255);
            }
          }
          for (var27Lifetime10 = 0; var12 > var27Lifetime10; var27Lifetime10++) {
            var13[var27Lifetime10].field_m = var38.j(255);
          }
          for (var27Lifetime11 = 0; var27Lifetime11 < var12; var27Lifetime11++) {
            var51 = var13[var27Lifetime11];
            if (var51.field_m > 0) {
              var51.field_d = var38.j(255);
            }
          }
          for (var27Lifetime12 = 0; var27Lifetime12 < var12; var27Lifetime12++) {
            var52 = var13[var27Lifetime12];
            if (var52.field_d > 0) {
              var52.field_f = var38.j(255);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_206_0 = var2;
          stackIn_206_1 = new StringBuilder().append("fc.<init>(");
          if (param0 == null) {
            stackIn_207_2 = "null";
          } else {
            stackIn_207_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_206_0), ((StringBuilder) (Object) stackIn_206_1).append(stackIn_207_2).append(')').toString());
        }
    }

    static {
        field_o = 0;
        field_n = new int[]{1, 1, 2, 3, 5, 1, 2, 3, 5, 1, 2, 5, 2, 3, 10, 2};
        field_m = false;
        field_l = null;
    }
}
