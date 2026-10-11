/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class asb {
    boolean field_e;
    private Object[][] field_c;
    static String field_b;
    int field_h;
    private fnb field_d;
    private qp field_g;
    static int field_f;
    static llb field_a;
    private Object[] field_i;

    final synchronized byte[] c(byte param0, int param1) {
        if (!this.b((byte) -59)) {
          return null;
        }
        if (param0 != 9) {
          String var4 = (String) null;
          this.a((String) null, 14);
        }
        if (this.field_g.field_m.length == 1) {
          return this.a(0, param1, (byte) 13);
        }
        if (!this.b((byte) 125, param1)) {
          return null;
        }
        if (this.field_g.field_m[param1] == 1) {
          return this.a(param1, 0, (byte) 13);
        }
        throw new RuntimeException();
    }

    final int c(byte param0) {
        if (!this.b((byte) 88)) {
          return -1;
        }
        if (param0 < 37) {
          this.a(86, -10);
        }
        return this.field_g.field_m.length;
    }

    final int a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b((byte) 106)) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          if (param1 != -2118) {
            stackIn_5_0 = 1;
            return stackIn_5_0;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_g.field_a.a(param1 ^ 123456123, vla.a((byte) 120, var4));
          stackIn_7_0 = this.a(var3_int, 1045);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("asb.S(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final int b(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b((byte) -117)) {
            stackIn_2_0 = -1;
            return stackIn_2_0;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_g.field_a.a(-123454015, vla.a((byte) 109, var4));
          if (!this.b((byte) -72, var3_int)) {
            stackIn_6_0 = -1;
            return stackIn_6_0;
          }
          if (param1 > -69) {
            this.c(((int[]) (this.field_i[12]))[7], ((int[]) (((Object[]) (this.field_i[2]))[2]))[7]);
          }
          stackIn_10_0 = var3_int;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("asb.D(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized int a(int param0, int param1) {
        if (!this.b((byte) -121, param0)) {
          return 0;
        }
        if (this.field_i[param0] != null) {
          return 100;
        }
        if (param1 != 1045) {
          return -57;
        }
        return this.field_d.a(param0, false);
    }

    final static void a(int param0, mm param1, boolean param2, byte param3) {
        cna dupTemp$0 = null;
        int var17_int = 0;
        int var24 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_22_0 = 0;
        cna stackIn_34_0 = null;
        boolean stackIn_35_1 = false;
        cna stackIn_41_0 = null;
        boolean stackIn_42_1 = false;
        int stackIn_56_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_72_0 = 0;
        cna stackIn_89_0 = null;
        boolean stackIn_90_1 = false;
        cna stackIn_96_0 = null;
        boolean stackIn_96_1 = false;
        boolean stackIn_97_2 = false;
        cna stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        int stackIn_99_2 = 0;
        int stackIn_99_3 = 0;
        boolean stackIn_102_1 = false;
        cna stackIn_106_0 = null;
        boolean stackIn_107_1 = false;
        int stackIn_111_0 = 0;
        cna stackIn_123_0 = null;
        boolean stackIn_124_1 = false;
        cna stackIn_128_0 = null;
        boolean stackIn_129_1 = false;
        cna stackIn_132_0 = null;
        boolean stackIn_133_1 = false;
        cna stackIn_136_0 = null;
        boolean stackIn_137_1 = false;
        String stackIn_153_0 = null;
        cna stackIn_158_0 = null;
        boolean stackIn_159_1 = false;
        cna stackIn_161_0 = null;
        boolean stackIn_162_1 = false;
        int stackIn_168_0 = 0;
        int stackIn_202_0 = 0;
        int stackIn_223_0 = 0;
        cna stackIn_320_0 = null;
        boolean stackIn_321_1 = false;
        cna stackIn_326_0 = null;
        boolean stackIn_326_1 = false;
        boolean stackIn_327_2 = false;
        int stackIn_330_1 = 0;
        byte stackIn_330_2 = 0;
        int stackIn_330_3 = 0;
        cna stackIn_332_0 = null;
        boolean stackIn_333_1 = false;
        cna stackIn_337_0 = null;
        boolean stackIn_338_1 = false;
        RuntimeException stackIn_347_0 = null;
        StringBuilder stackIn_347_1 = null;
        String stackIn_348_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String var8 = null;
        cna[] var8_array = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        cna var17 = null;
        int var18 = 0;
        Object var18_ref = null;
        Object var19 = null;
        Object var20 = null;
        Object var21 = null;
        Object var22 = null;
        int var22_int = 0;
        int var23 = 0;
        Object var25 = null;
        String var25_ref = null;
        int var26 = 0;
        mm var27 = null;
        int var28 = 0;
        cna var29 = null;
        cna var30 = null;
        cna[] var31 = null;
        Object var32 = null;
        String var32_ref = null;
        String var33 = null;
        Object var25Lifetime1;
        Object var32Lifetime1;
        Object var25Lifetime1Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var8_intLifetime1;
        int var16Lifetime1;
        int var18Lifetime1;
        int var16Lifetime2;
        var26 = VoidHunters.field_G;
        try {
          if (param2) {
            stackIn_12_0 = (ii.field_h) ? 0 : 1;
            var4_int = stackIn_12_0;
          } else {
            if (nmb.b(param3 + 164)) {
              stackIn_8_0 = (!param1.field_fc) ? 1 : 0;
            } else {
              stackIn_8_0 = 0;
            }
            var4_int = stackIn_8_0;
          }
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          var5 = 0;
          if (param2) {
            decompiledFrameRemainder1 = !(ieb.field_o.length < 2);
            if (decompiledFrameRemainder1) {
              if (param2) {
                stackIn_22_0 = (-1 != tsa.field_h) ? 1 : 0;
              } else {
                stackIn_22_0 = 0;
              }
              var6 = stackIn_22_0;
              decompiledFrameRemainder0 = (var6 != 0);
              if (decompiledFrameRemainder0) {
                var7 = tsa.field_h;
                for (var8_int = 0; var8_int < ce.field_o.length; var8_int++) {
                  ce.field_o[var8_int] = (byte) 0;
                }
              }
            }
          } else {
            for (var6 = 0; var6 < 5; var6++) {
              if (var4_int != 0 &&
                0 != inb.field_q[0][var6 + 1].field_o &&
                param1.field_Cb != var6) {
                var5 = 1;
                param1.field_Cb = var6;
              }
              stackIn_34_0 = inb.field_q[0][var6 + 1];
              stackIn_35_1 = (var4_int != 0);
              stackIn_34_0.field_y = stackIn_35_1;
              if (!ll.field_o &&
                var6 == 3) {
                inb.field_q[0][var6 + 1].field_y = false;
              }
              stackIn_41_0 = inb.field_q[0][1 + var6];
              stackIn_42_1 = (var6 == param1.field_Cb);
              stackIn_41_0.field_J = stackIn_42_1;
            }
            if (inb.field_q[0][2].field_Q) {
              if (nmb.b(97)) {
                lob.field_a = mla.field_r;
              } else {
                lob.field_a = isa.a(oba.field_p, new String[]{lqa.field_o.field_Vb}, 124);
              }
            }
            decompiledFrameRemainder1 = !(ieb.field_o.length < 2);
            if (decompiledFrameRemainder1) {
              if (param2) {
                stackIn_56_0 = (-1 != tsa.field_h) ? 1 : 0;
              } else {
                stackIn_56_0 = 0;
              }
              var6 = stackIn_56_0;
              decompiledFrameRemainder0 = (var6 != 0);
              if (decompiledFrameRemainder0) {
                var7 = tsa.field_h;
                for (var8_int = 0; var8_int < ce.field_o.length; var8_int++) {
                  ce.field_o[var8_int] = (byte) 0;
                }
              }
            }
          }
          if ((decompiledFrameRemainder1) &&
            (decompiledFrameRemainder0)) {
            ce.field_o[var7 / 8] = (byte)knb.a((int) ce.field_o[var7 / 8], 1 << var7 % 8);
          }
          if (decompiledFrameRemainder1) {
            stackIn_64_0 = (!param2) ? 0 : -1;
            for (var7 = stackIn_64_0; var7 < ieb.field_o.length; var7++) {
              if (var6 != 0) {
                stackIn_72_0 = (tsa.field_h != var7) ? 1 : 0;
              } else {
                stackIn_72_0 = 0;
              }
              var8_intLifetime1 = stackIn_72_0;
              if (var4_int != 0 &&
                0 != inb.field_q[1][var7 + 1].field_o) {
                if (!param2) {
                  var9 = ieb.field_o[var7];
                  if (param1.field_Fb != var9) {
                    var5 = 1;
                    param1.field_Fb = var9;
                  }
                } else {
                  if (var6 == 0) {
                    if (var7 == -1) {
                      for (var9 = 0; ce.field_o.length > var9; var9++) {
                        ce.field_o[var9] = (byte) 0;
                      }
                    } else {
                      ce.field_o[var7 / 8] = (byte)mgb.a((int) ce.field_o[var7 / 8], 1 << dla.a(7, var7));
                    }
                  }
                }
              }
              if (param2) {
                if (var7 == -1) {
                  inb.field_q[1][var7 + 1].field_J = true;
                  for (var9 = 0; var9 < ieb.field_o.length; var9++) {
                    dupTemp$0 = inb.field_q[1][var7 + 1];
                    stackIn_96_0 = dupTemp$0;
                    stackIn_96_1 = dupTemp$0.field_J;
                    stackIn_97_2 = ((ce.field_o[var9 / 8] & 1 << (7 & var9)) == 0);
                    stackIn_96_0.field_J = stackIn_96_1 & stackIn_97_2;
                  }
                } else {
                  stackIn_99_0 = inb.field_q[1][1 + var7];
                  stackIn_99_1 = -1;
                  stackIn_99_2 = ce.field_o[var7 / 8] & 1 << (7 & var7);
                  stackIn_99_3 = -1;
                  stackIn_102_1 = (stackIn_99_1 != (stackIn_99_2 ^ stackIn_99_3));
                  stackIn_99_0.field_J = stackIn_102_1;
                }
              } else {
                var9 = ieb.field_o[var7];
                stackIn_89_0 = inb.field_q[1][1 + var7];
                stackIn_90_1 = (param1.field_Fb == var9);
                stackIn_89_0.field_J = stackIn_90_1;
              }
              stackIn_106_0 = inb.field_q[1][1 + var7];
              stackIn_107_1 = (var4_int != 0) && (var8_intLifetime1 == 0);
              stackIn_106_0.field_y = stackIn_107_1;
            }
          }
          stackIn_111_0 = (!param2) ? 1 : 0;
          for (var6Lifetime1 = stackIn_111_0; var6Lifetime1 < 3; var6Lifetime1++) {
            var29 = inb.field_q[2][var6Lifetime1];
            if (var4_int != 0 &&
              var29.field_o != 0) {
              if (!param2) {
                if (param1.field_Bb != var6Lifetime1) {
                  var5 = 1;
                  param1.field_Bb = var6Lifetime1;
                }
              } else {
                if (0 != var6Lifetime1) {
                  qd.field_d = qd.field_d ^ var6Lifetime1;
                } else {
                  qd.field_d = 0;
                }
              }
            }
            stackIn_123_0 = var29;
            stackIn_124_1 = (var4_int != 0);
            stackIn_123_0.field_y = stackIn_124_1;
            if (!param2) {
              stackIn_136_0 = var29;
              stackIn_137_1 = (0 != (var6Lifetime1 & param1.field_Bb));
              stackIn_136_0.field_J = stackIn_137_1;
            } else {
              if (var6Lifetime1 != 0) {
                stackIn_132_0 = var29;
                stackIn_133_1 = ((qd.field_d & var6Lifetime1) != 0);
                stackIn_132_0.field_J = stackIn_133_1;
              } else {
                stackIn_128_0 = var29;
                stackIn_129_1 = (0 == qd.field_d);
                stackIn_128_0.field_J = stackIn_129_1;
              }
            }
          }
          if (param3 != -67) {
            var27 = (mm) null;
            asb.a(-90, (mm) null, true, (byte) -109);
          }
          if (param2 &&
            nkb.field_r > 1) {
            for (var6Lifetime2 = 0; var6Lifetime2 < nkb.field_r + 1; var6Lifetime2++) {
              var30 = inb.field_q[3][var6Lifetime2];
              if (var4_int != 0 &&
                0 != var30.field_o) {
                imb.field_a = var6Lifetime2;
              }
              if (var30.field_Q &&
                var6Lifetime2 > 0) {
                if (ea.field_k == null) {
                  stackIn_153_0 = null;
                } else {
                  stackIn_153_0 = ea.field_k[-1 + var6Lifetime2];
                }
                var8 = stackIn_153_0;
                if (var8 != null) {
                  lob.field_a = var8;
                }
              }
              stackIn_158_0 = var30;
              stackIn_159_1 = (var6Lifetime2 == imb.field_a);
              stackIn_158_0.field_J = stackIn_159_1;
              stackIn_161_0 = var30;
              stackIn_162_1 = (var4_int != 0);
              stackIn_161_0.field_y = stackIn_162_1;
            }
          }
          var6Lifetime3 = 0;
          for (var7 = 0; var7 < ocb.field_l; var7++) {
            var31 = inb.field_q[4 + var7];
            var8_array = var31;
            stackIn_168_0 = (!param2) ? 0 : -1;
            for (var9 = stackIn_168_0; var9 < -1 + var31.length; var9++) {
              var10 = 0;
              var11 = 0;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              if (var4_int != 0 &&
                var9 >= 0) {
                if (hia.field_o != null &&
                  hia.field_o[var7] != null &&
                  0 < (~kbb.field_p & hia.field_o[var7][var9])) {
                  var14 = 1;
                  var15 = wsb.a(hia.field_o[var7][var9] & ~kbb.field_p, 1302374146);
                }
                if (null != qcb.field_o &&
                  qcb.field_o[var7] != null &&
                  0 >= hcb.field_o &&
                  qcb.field_o[var7][var9]) {
                  var10 = 1;
                }
                if (null != crb.field_w &&
                  null != crb.field_w[var7]) {
                  var16 = crb.field_w[var7][var9];
                  if (var16 > 0 &&
                    tg.field_q < var16) {
                    var12 = 1;
                  }
                  if (var16 != 0 &&
                    !ufa.field_o &&
                    hcb.field_o <= 0) {
                    var10 = 1;
                  }
                }
                if (param2) {
                  if (nqa.field_b != null) {
                    if (nqa.field_b[var7] != null) {
                      stackIn_202_0 = (nqa.field_b[var7][var9]) ? 1 : 0;
                    } else {
                      stackIn_202_0 = 0;
                    }
                  } else {
                    stackIn_202_0 = 0;
                  }
                } else {
                  stackIn_202_0 = 0;
                }
                var13 = stackIn_202_0;
                if (tab.field_p != null &&
                  tab.field_p[var7] != null) {
                  var16Lifetime2 = tab.field_p[var7][var9];
                  if (var16Lifetime2 > 0 &&
                    var16Lifetime2 > cla.field_b) {
                    var11 = 1;
                  }
                  if (0 != var16Lifetime2 &&
                    !ufa.field_o &&
                    0 >= hcb.field_o) {
                    var10 = 1;
                  }
                }
              }
              if (go.field_p >= 2 &&
                si.field_o[12]) {
                var12 = 0;
                var10 = 0;
                var14 = 0;
                var11 = 0;
                var13 = 0;
              }
              if (var10 == 0 &&
                var11 == 0 &&
                var12 == 0 &&
                var13 == 0 &&
                var14 == 0) {
                stackIn_223_0 = 0;
              } else {
                stackIn_223_0 = 1;
              }
              var16Lifetime1 = stackIn_223_0;
              hrb.field_b = true;
              if (var16Lifetime1 == 0 &&
                var9 >= 0 &&
                null != ncb.field_a && (!param2 ||
                !ii.field_h)) {
                nr.field_p = false;
                hrb.field_b = false;
                if (tib.field_i == null) {
                  tib.field_i = new byte[ocb.field_l];
                  mia.field_a = new boolean[ocb.field_l];
                }
                for (var17_int = 0; var7 > var17_int; var17_int++) {
                  mia.field_a[var17_int] = false;
                }
                bea.a(var7, var9, param1, -1, 93, param2, 0, -1);
                if (2 <= go.field_p &&
                  si.field_o[12]) {
                  hrb.field_b = true;
                }
                if (!hrb.field_b) {
                  var16Lifetime1 = 1;
                }
              }
              var17 = var8_array[var9 + 1];
              if (var4_int != 0 &&
                0 != var17.field_o) {
                if (!param2) {
                  if (var16Lifetime1 == 0 &&
                    (byte)var9 != param1.field_Pb[var7]) {
                    param1.field_Pb[var7] = (byte)var9;
                    var5 = 1;
                  }
                } else {
                  if (var9 == -1) {
                    for (var18 = var6Lifetime3; var6Lifetime3 - (-var31.length + 1) > var18; var18++) {
                      nkb.field_p[var18 / 8] = (byte)dla.a((int) nkb.field_p[var18 / 8], ~(1 << dla.a(7, var18)));
                    }
                  } else {
                    nkb.field_p[(var9 + var6Lifetime3) / 8] = (byte)mgb.a((int) nkb.field_p[(var9 + var6Lifetime3) / 8], 1 << dla.a(var6Lifetime3 + var9, 7));
                  }
                }
              }
              if (param2 &&
                var16Lifetime1 != 0) {
                nkb.field_p[(var6Lifetime3 + var9) / 8] = (byte)dla.a((int) nkb.field_p[(var6Lifetime3 + var9) / 8], ~(1 << dla.a(var9 + var6Lifetime3, 7)));
              }
              if (var9 >= 0 &&
                var17.field_Q) {
                if (hqb.field_k == null) {
                  var18_ref = null;
                } else {
                  if (null == hqb.field_k[var7]) {
                    var18_ref = null;
                  } else {
                    var18_ref = hqb.field_k[var7][var9];
                  }
                }
                if (awa.field_o == null) {
                  var19 = null;
                } else {
                  if (null != awa.field_o[var7]) {
                    var19 = awa.field_o[var7][var9];
                  } else {
                    var19 = null;
                  }
                }
                var20 = null;
                if (var19 != null &&
                  !((String) (var19)).equals(var18_ref)) {
                  var20 = var19;
                }
                var21 = null;
                if (var13 != 0) {
                  var21 = k.field_q;
                  var22 = var21;
                  var25 = var22;
                  var22 = var25;
                  var21 = var22;
                  var22 = var21;
                } else {
                  if (var10 != 0) {
                    var21 = bpa.field_d;
                  } else {
                    if (var11 != 0) {
                      var22_int = tab.field_p[var7][var9] - cla.field_b;
                      if (var22_int == 1) {
                        var21 = wia.field_b;
                        var32 = var21;
                        var21 = var32;
                        var32Lifetime1 = var21;
                        var21 = var32Lifetime1;
                      } else {
                        var21 = isa.a(nra.field_a, new String[]{Integer.toString(var22_int)}, 105);
                      }
                    }
                    if (var12 != 0) {
                      var32_ref = isa.a(gh.field_p, new String[]{Integer.toString(tg.field_q), Integer.toString(crb.field_w[var7][var9])}, 110);
                      var21 = var32_ref;
                      var21 = var32_ref;
                      if (var21 == null) {
                        var21 = var32_ref;
                      } else {
                        var21 = (String) (var21) + "<br>" + var32_ref;
                      }
                    }
                    if (var14 != 0) {
                      var22 = lp.field_a;
                      if (var15 > 0 &&
                        mta.field_a != null &&
                        mta.field_a.length >= var15 &&
                        null != mta.field_a[var15 - 1]) {
                        var22 = mta.field_a[var15 - 1][0];
                      }
                      if (var21 == null) {
                        var21 = var22;
                      } else {
                        var21 = (String) (var21) + "<br>" + (String) (var22);
                      }
                    }
                  }
                }
                if (var4_int != 0 &&
                  !hrb.field_b) {
                  var22 = null;
                  var23 = 0;
                  if (nr.field_p) {
                    var22 = "</col>" + uda.field_a + "<col=A00000>";
                    var25Lifetime1 = var22;
                    var22 = var25Lifetime1;
                    var25Lifetime1Lifetime1 = var22;
                    var22 = var25Lifetime1Lifetime1;
                    var21 = var22;
                  }
                  for (var24 = 0; var7 > var24; var24++) {
                    if (mia.field_a[var24]) {
                      var25_ref = "</col>" + hva.field_c[var24] + "<col=A00000>";
                      var22 = var25_ref;
                      var21 = var22;
                      var22 = var25_ref;
                      if (var22 == null) {
                        var22 = var25_ref;
                        var21 = var22;
                        var21 = var22;
                      } else {
                        var23 = 1;
                        var22 = (String) (var22) + ", " + var25_ref;
                      }
                    }
                  }
                  if (var23 == 0) {
                    var21 = isa.a(fra.field_c, new String[]{(String) (var22)}, 78);
                  } else {
                    var21 = nna.field_F + (String) (var22);
                  }
                }
                if (var21 != null) {
                  var21 = "<col=A00000>" + (String) (var21);
                  var33 = jd.a((String) (var21), "<br>", 0, "<br><col=A00000>");
                  if (var20 != null) {
                    var20 = (String) (var20) + "<br>" + var33;
                  } else {
                    var20 = var33;
                  }
                }
                if (var20 != null) {
                  lob.field_a = (String) (var20);
                }
              }
              if (!param2) {
                boolean decompiledFrameRemainder2 = true;
                stackIn_332_0 = var17;
                if (hrb.field_b) {
                  stackIn_330_1 = ~(byte)var9;
                  stackIn_330_2 = param1.field_Pb[var7];
                  stackIn_330_3 = -1;
                  if (stackIn_330_1 == (stackIn_330_2 ^ stackIn_330_3)) {
                    stackIn_333_1 = true;
                    decompiledFrameRemainder2 = false;
                  }
                }
                if (decompiledFrameRemainder2) {
                  stackIn_333_1 = false;
                }
                stackIn_332_0.field_J = stackIn_333_1;
              } else {
                if (var9 == -1) {
                  var17.field_J = true;
                  var28 = var6Lifetime3;
                  var18Lifetime1 = var28;
                  while (var28 < var6Lifetime3 - (-var31.length + 1)) {
                    stackIn_326_0 = var17;
                    stackIn_326_1 = var17.field_J;
                    stackIn_327_2 = (0 == (nkb.field_p[var28 / 8] & 1 << (var28 & 7)));
                    stackIn_326_0.field_J = stackIn_326_1 & stackIn_327_2;
                    var28++;
                  }
                } else {
                  stackIn_320_0 = var17;
                  stackIn_321_1 = ((nkb.field_p[(var6Lifetime3 + var9) / 8] & 1 << (var9 + var6Lifetime3 & 7)) != 0);
                  stackIn_320_0.field_J = stackIn_321_1;
                }
              }
              stackIn_337_0 = var17;
              stackIn_338_1 = (var4_int != 0) && (var16Lifetime1 == 0);
              stackIn_337_0.field_y = stackIn_338_1;
            }
            var6Lifetime3 = var6Lifetime3 + (255 & vu.field_zb[var7]);
          }
          if (var5 != 0) {
            if (param2) {
              return;
            }
            bh.a(param0, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_347_0 = var4;
          stackIn_347_1 = new StringBuilder().append("asb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_348_2 = "null";
          } else {
            stackIn_348_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_347_0), ((StringBuilder) (Object) stackIn_347_1).append(stackIn_348_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int a(boolean param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b((byte) 127, param1)) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          param2 = param2.toLowerCase();
          var5 = (CharSequence) ((Object) param2);
          var4_int = this.field_g.field_p[param1].a(-123454015, vla.a((byte) 122, var5));
          if (!param0) {
            stackIn_6_0 = 78;
            return stackIn_6_0;
          }
          if (this.a(var4_int, param1, 0)) {
            return var4_int;
          }
          stackIn_10_0 = -1;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("asb.T(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final synchronized boolean b(byte param0, int param1) {
        int var3 = -101 % ((85 - param0) / 33);
        if (!this.b((byte) 103)) {
          return false;
        }
        if (param1 >= 0 &&
          this.field_g.field_m.length > param1 &&
          0 != this.field_g.field_m[param1]) {
          return true;
        }
        if (sl.field_b) {
          throw new IllegalArgumentException(Integer.toString(param1));
        }
        return false;
    }

    final synchronized byte[] a(String param0, boolean param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            this.field_e = ((boolean[]) (((Object[]) (this.field_i[30]))[11]))[9];
          }
          if (!this.b((byte) -77)) {
            stackIn_4_0 = null;
            return (byte[]) (stackIn_4_0);
          }
          param2 = param2.toLowerCase();
          param0 = param0.toLowerCase();
          var6 = (CharSequence) ((Object) param2);
          var4_int = this.field_g.field_a.a(-123454015, vla.a((byte) 114, var6));
          if (!this.b((byte) -28, var4_int)) {
            stackIn_7_0 = null;
            return (byte[]) (stackIn_7_0);
          }
          var7 = (CharSequence) ((Object) param0);
          var5 = this.field_g.field_p[var4_int].a(-123454015, vla.a((byte) 116, var7));
          stackIn_9_0 = this.a(var4_int, var5, (byte) 13);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("asb.U(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final boolean a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        CharSequence var5 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b((byte) 116)) {
            return false;
          }
          param1 = param1.toLowerCase();
          var5 = (CharSequence) ((Object) param1);
          var3_int = this.field_g.field_a.a(param0 - 123486186, vla.a((byte) 127, var5));
          if (param0 != 32171) {
            var4 = (String) null;
            this.a(-117, (String) null);
          }
          stackIn_6_0 = this.c(121, var3_int);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("asb.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final synchronized boolean c(int param0, int param1) {
        if (!this.b((byte) -40, param1)) {
          return false;
        }
        if (this.field_i[param1] != null) {
          return true;
        }
        this.a((byte) -92, param1);
        if (param0 <= 46) {
          this.b(((int[]) (this.field_i[8]))[0]);
        }
        if (this.field_i[param1] != null) {
          return true;
        }
        return false;
    }

    final boolean a(boolean param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b((byte) 77)) {
            return false;
          }
          if (!param0) {
            stackIn_5_0 = ((boolean[]) (((Object[]) (this.field_i[13]))[2]))[12];
            return stackIn_5_0;
          }
          param1 = param1.toLowerCase();
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_g.field_a.a(-123454015, vla.a((byte) 108, var4));
          if (var3_int >= 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("asb.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final synchronized boolean b(byte param0) {
        if (null == this.field_g) {
          this.field_g = this.field_d.a((byte) 9);
          if (this.field_g == null) {
            return false;
          }
          this.field_c = new Object[this.field_g.field_l][];
          this.field_i = new Object[this.field_g.field_l];
        }
        int var2 = -12 / ((param0 - 21) / 56);
        return true;
    }

    final synchronized boolean a(int param0) {
        int var3 = 0;
        int var2;
        int var4;
        int var5;
        var5 = VoidHunters.field_G;
        if (!this.b((byte) 84)) {
          return false;
        }
        var2 = 1;
        for (var3 = 0; this.field_g.field_i.length > var3; var3++) {
          var4 = this.field_g.field_i[var3];
          if (null == this.field_i[var4]) {
            this.a((byte) -122, var4);
            if (this.field_i[var4] == null) {
              var2 = 0;
            }
          }
        }
        if (param0 < 1) {
          this.field_g = (qp) null;
        }
        return var2 != 0;
    }

    final static void a(int param0, String param1, byte[] param2, int param3, String param4) {
        try {
          File var5 = null;
          if (param3 >= -68) {
            String var7 = (String) null;
            asb.a(-105, (String) null, (byte[]) null, 12, (String) null);
          }
          var5 = new File("//contentfs/mgcontent_v4/WIP/voidhunters/src/freelevels/" + param4 + param1);
          try {
            oj.a(var5, 3, param2, param0);
          } catch (IOException iOException) {
            iOException.printStackTrace();
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final synchronized byte[] a(int param0, int param1, int[] param2, int param3) {
        Object stackIn_2_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        Object var6 = null;
        byte[] var8 = null;
        try {
          var5_int = -73 % ((param1 - 20) / 48);
          if (!this.a(param3, param0, 0)) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          var6 = null;
          if ((null == this.field_c[param0] ||
            null == this.field_c[param0][param3]) && !this.a(param3, 0, param0, param2)) {
            this.a((byte) -78, param0);
            if (!this.a(param3, 0, param0, param2)) {
              stackIn_10_0 = null;
              return (byte[]) (stackIn_10_0);
            }
          }
          if (null == this.field_c[param0]) {
            throw new RuntimeException("");
          }
          if (this.field_c[param0][param3] != null) {
            var8 = ffb.a(false, this.field_c[param0][param3], true);
            var6 = var8;
            if (var8 == null) {
              throw new RuntimeException("");
            }
          }
          if (var6 != null) {
            if (this.field_h == 1) {
              this.field_c[param0][param3] = null;
              if (this.field_g.field_m[param0] == 1) {
                this.field_c[param0] = null;
              }
            } else {
              if (2 == this.field_h) {
                this.field_c[param0] = null;
              }
            }
          }
          stackIn_25_0 = var6;
          return (byte[]) (stackIn_25_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_28_0 = var5;
          stackIn_28_1 = new StringBuilder().append("asb.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_b = null;
        int var1 = -114 % ((param0 - 25) / 54);
        field_a = null;
    }

    private final synchronized void a(byte param0, int param1) {
        if (!this.field_e) {
          this.field_i[param1] = gfb.a(false, this.field_d.a(127, param1), -12445);
        } else {
          this.field_i[param1] = this.field_d.a(118, param1);
        }
        if (param0 >= -67) {
          ((long[]) (this.field_i[9]))[11] = -71L;
        }
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        if (!this.b((byte) 83)) {
          return false;
        }
        if (param1 < 0 ||
          0 > param0 ||
          param1 >= this.field_g.field_m.length ||
          param0 >= this.field_g.field_m[param1]) {
          if (!sl.field_b) {
            return false;
          }
          throw new IllegalArgumentException(param1 + " " + param0);
        }
        if (param2 != 0) {
          String var5 = (String) null;
          this.a(((int[]) (this.field_i[0]))[0], (String) null);
          return true;
        }
        return true;
    }

    final boolean a(byte param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b((byte) -106)) {
            return false;
          }
          param2 = param2.toLowerCase();
          if (param0 != -107) {
            this.field_c = (Object[][]) (((Object[]) (((Object[]) (this.field_i[6]))[6]))[0]);
          }
          param1 = param1.toLowerCase();
          var6 = (CharSequence) ((Object) param2);
          var4_int = this.field_g.field_a.a(-123454015, vla.a((byte) 127, var6));
          if (var4_int < 0) {
            return false;
          }
          var7 = (CharSequence) ((Object) param1);
          var5 = this.field_g.field_p[var4_int].a(-123454015, vla.a((byte) 123, var7));
          if (var5 >= 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("asb.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final byte[] a(int param0, int param1, byte param2) {
        if (param2 != 13) {
          return (byte[]) (this.field_i[0]);
        }
        return this.a(param0, -83, (int[]) null, param1);
    }

    final boolean a(boolean param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b((byte) 82)) {
            return false;
          }
          param2 = param2.toLowerCase();
          param1 = param1.toLowerCase();
          if (param0) {
            this.field_c = (Object[][]) null;
          }
          var6 = (CharSequence) ((Object) param2);
          var4_int = this.field_g.field_a.a(-123454015, vla.a((byte) 120, var6));
          if (!this.b((byte) 125, var4_int)) {
            return false;
          }
          var7 = (CharSequence) ((Object) param1);
          var5 = this.field_g.field_p[var4_int].a(-123454015, vla.a((byte) 108, var7));
          stackIn_11_0 = this.a((byte) 84, var5, var4_int);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("asb.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final synchronized boolean a(int param0, boolean param1) {
        if (!this.b((byte) 81)) {
          return false;
        }
        if (this.field_g.field_m.length == 1) {
          return this.a((byte) 95, param0, 0);
        }
        if (!this.b((byte) 121, param0)) {
          return false;
        }
        if (!param1) {
          this.field_i[1] = (Object) null;
        }
        if (this.field_g.field_m[param0] == 1) {
          return this.a((byte) 97, 0, param0);
        }
        throw new RuntimeException();
    }

    final synchronized int b(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = VoidHunters.field_G;
        if (!this.b((byte) 109)) {
          return 0;
        }
        var2 = 0;
        var3 = 0;
        for (var4 = 0; var4 < this.field_i.length; var4++) {
          if (this.field_g.field_j[var4] > 0) {
            var3 = var3 + this.a(var4, 1045);
            var2 += 100;
          }
        }
        if (0 == var2) {
          return 100;
        }
        if (param0 > -101) {
          this.field_h = 103;
        }
        var4Lifetime1 = var3 * 100 / var2;
        return var4Lifetime1;
    }

    final int b(int param0, int param1) {
        if (param1 != -6942) {
          this.field_i[2] = ((Object[]) (this.field_i[3]))[1];
        }
        if (!this.b((byte) -33, param0)) {
          return 0;
        }
        return this.field_g.field_m[param0];
    }

    final synchronized boolean a(byte param0, int param1, int param2) {
        if (!this.a(param1, param2, 0)) {
          return false;
        }
        if (this.field_c[param2] != null &&
          null != this.field_c[param2][param1]) {
          return true;
        }
        if (param0 <= 56) {
          return ((boolean[]) (this.field_i[7]))[0];
        }
        if (null != this.field_i[param2]) {
          return true;
        }
        this.a((byte) -116, param2);
        if (this.field_i[param2] == null) {
          return false;
        }
        return true;
    }

    private final synchronized boolean a(int param0, int param1, int param2, int[] param3) {
        Object[] array$0 = null;
        int var9_int = 0;
        int var20 = 0;
        byte[] array$1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        boolean stackIn_37_2 = false;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_106_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        byte[] var9 = null;
        int var10 = 0;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int[] var14_ref_int__ = null;
        int var15 = 0;
        byte[][] var15_ref_byte____ = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var21 = 0;
        int var22 = 0;
        byte[] var23 = null;
        int[] var24 = null;
        byte[] var25 = null;
        ds var26 = null;
        byte[] var27 = null;
        ds var29 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        ds var32 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var38 = null;
        byte[][] var39 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        int var14Lifetime1;
        var22 = VoidHunters.field_G;
        try {
          if (!this.b((byte) 120, param2)) {
            return false;
          }
          if (null == this.field_i[param2]) {
            return false;
          }
          var5_int = this.field_g.field_j[param2];
          var34 = this.field_g.field_g[param2];
          var24 = var34;
          var6 = var24;
          if (null == this.field_c[param2]) {
            array$0 = new Object[this.field_g.field_m[param2]];
            this.field_c[param2] = array$0;
          }
          var7 = this.field_c[param2];
          var8 = 1;
          for (var9_int = 0; var9_int < var5_int; var9_int++) {
            if (var6 == null) {
              var10 = var9_int;
            } else {
              var10 = var34[var9_int];
            }
            if (var7[var10] != null) {
              continue;
            }
            var8 = 0;
            break;
          }
          if (var8 != 0) {
            return true;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param3 != null && (param3[0] != 0 ||
            param3[1] != 0 ||
            param3[2] != 0 ||
            0 != param3[3])) {
            var35 = ffb.a(true, this.field_i[param2], true);
            var25 = var35;
            var9 = var25;
            var26 = new ds(var35);
            var26.a(5, param3, var26.field_h.length, false);
            decompiledFrameRemainder0 = false;
          }
          else {
            var9 = ffb.a(false, this.field_i[param2], true);
          }
          try {
            var36 = rob.a(param1, var9);
            var27 = var36;
            var23 = var27;
            var43 = var23;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var11_ref_RuntimeException = decompiledCaughtException;
            stackIn_36_0 = var11_ref_RuntimeException;
            stackIn_36_1 = new StringBuilder();
            stackIn_37_2 = (param3 != null);
            throw rta.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(" ").append(param2).append(" ").append(var9.length).append(" ").append(psb.a(var9, var9.length, 0)).append(" ").append(psb.a(var9, -2 + var9.length, 0)).append(" ").append(this.field_g.field_d[param2]).append(" ").append(this.field_g.field_k).toString());
          }
          if (this.field_e) {
            this.field_i[param2] = null;
          }
          if (1 < var5_int) {
            if (this.field_h == 2) {
              var11 = var36.length;
              var11--;
              var12 = 255 & var23[var11];
              var11 = var11 - var12 * var5_int * 4;
              var32 = new ds(var43);
              var14 = 0;
              var15 = 0;
              var32.field_e = var11;
              for (var16 = 0; var12 > var16; var16++) {
                var17 = 0;
                for (var18 = 0; var18 < var5_int; var18++) {
                  var17 = var17 + var32.h(param1 + 37);
                  if (var6 == null) {
                    var19 = var18;
                  } else {
                    var19 = var34[var18];
                  }
                  if (param0 == var19) {
                    var15 = var19;
                    var14 = var14 + var17;
                  }
                }
              }
              if (var14 == 0) {
                return true;
              }
              var44 = new byte[var14];
              var32.field_e = var11;
              var14Lifetime1 = 0;
              var17 = 0;
              for (var18 = 0; var12 > var18; var18++) {
                var19 = 0;
                for (var20 = 0; var5_int > var20; var20++) {
                  var19 = var19 + var32.h(46);
                  if (var6 == null) {
                    var21 = var20;
                  } else {
                    var21 = var34[var20];
                  }
                  if (param0 == var21) {
                    cua.a(var43, var17, var44, var14Lifetime1, var19);
                    var14Lifetime1 = var14Lifetime1 + var19;
                  }
                  var17 = var17 + var19;
                }
              }
              var7[var15] = var44;
            } else {
              var11 = var36.length;
              var11--;
              var12 = var23[var11] & 255;
              var11 = var11 - 4 * (var12 * var5_int);
              var29 = new ds(var43);
              var29.field_e = var11;
              var38 = new int[var5_int];
              var30 = var38;
              var14_ref_int__ = var30;
              for (var15 = 0; var15 < var12; var15++) {
                var16 = 0;
                for (var17 = 0; var17 < var5_int; var17++) {
                  var16 = var16 + var29.h(68);
                  var14_ref_int__[var17] = var14_ref_int__[var17] + var16;
                }
              }
              var39 = new byte[var5_int][];
              var31 = var39;
              var15_ref_byte____ = var31;
              for (var16 = 0; var16 < var5_int; var16++) {
                array$1 = new byte[var38[var16]];
                var15_ref_byte____[var16] = array$1;
                var38[var16] = 0;
              }
              var29.field_e = var11;
              var16 = 0;
              for (var17 = 0; var17 < var12; var17++) {
                var18 = 0;
                for (var19 = 0; var19 < var5_int; var19++) {
                  var18 = var18 + var29.h(param1 ^ 19);
                  cua.a(var43, var16, var39[var19], var38[var19], var18);
                  var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                  var16 = var16 + var18;
                }
              }
              for (var17 = 0; var5_int > var17; var17++) {
                if (var6 == null) {
                  var18 = var17;
                } else {
                  var18 = var34[var17];
                }
                if (0 == this.field_h) {
                  var7[var18] = gfb.a(false, var39[var17], -12445);
                } else {
                  var7[var18] = var39[var17];
                }
              }
            }
          } else {
            if (var6 == null) {
              var11 = 0;
            } else {
              var11 = var34[0];
            }
            if (this.field_h == 0) {
              var7[var11] = gfb.a(false, var36, -12445);
              return true;
            }
            var7[var11] = var43;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = decompiledCaughtException;
          stackIn_105_0 = var5;
          stackIn_105_1 = new StringBuilder().append("asb.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_106_2 = "null";
          } else {
            stackIn_106_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_105_0), ((StringBuilder) (Object) stackIn_105_1).append(stackIn_106_2).append(')').toString());
        }
    }

    asb(fnb param0, boolean param1, int param2) {
        this.field_g = null;
        try {
          if (param2 < 0 ||
            param2 > 2) {
            throw new IllegalArgumentException("");
          }
          this.field_e = param1 ? true : false;
          this.field_h = param2;
          this.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "asb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_b = "Teams have been balanced";
        field_f = 1;
    }
}
