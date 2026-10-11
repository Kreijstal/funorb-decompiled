/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb implements Runnable {
    static ml field_j;
    static String field_g;
    static String field_e;
    static int[][] field_h;
    static int field_l;
    static String field_d;
    private ra field_i;
    static String field_a;
    private boolean field_b;
    int field_f;
    static int[] field_c;
    private Thread field_k;

    private final void a(byte param0, df param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        Object var3 = null;
        RuntimeException var3_ref = null;
        try {
          var3 = this.field_i;
          synchronized (var3) {
            this.field_i.a((byte) 47, param1);
            if (param0 >= -52) {
              field_g = (String) null;
            }
            this.field_f = this.field_f + 1;
            this.field_i.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("cb.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final df a(int param0, int param1, rc param2) {
        df var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        df var6 = null;
        int var8 = 0;
        df stackIn_9_0 = null;
        df stackIn_17_0 = null;
        df stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = SteelSentinels.field_G;
        try {
          var4 = new df();
          var4.field_H = 1;
          var5 = this.field_i;
          synchronized (var5) {
            var6 = (df) (this.field_i.b(22));
            while (var6 != null) {
              if (~var6.field_w == ~(long)param1 &&
                var6.field_G == param2 &&
                var6.field_H == 2) {
                var4.field_z = false;
                var4.field_L = var6.field_L;
                stackIn_9_0 = var4;
                return stackIn_9_0;
              }
              var6 = (df) (this.field_i.a(false));
            }
          }
          var4.field_L = param2.b(param1, false);
          if (param0 != 21598) {
            stackIn_17_0 = (df) null;
            return stackIn_17_0;
          }
          var4.field_B = true;
          var4.field_z = false;
          stackIn_19_0 = var4;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_22_0 = var4_ref;
          stackIn_22_1 = new StringBuilder().append("cb.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final void a(int param0) {
        try {
          this.field_b = true;
          synchronized (this.field_i) {
            this.field_i.notifyAll();
          }
          if (param0 != 0) {
            field_j = (ml) null;
          }
          try {
            this.field_k.join();
          } catch (InterruptedException interruptedException) {
          }
          this.field_k = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(hk param0, byte param1, int param2, boolean param3) {
        qh dupTemp$0 = null;
        int var17_int = 0;
        int var24 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_22_0 = 0;
        qh stackIn_35_0 = null;
        boolean stackIn_36_1 = false;
        qh stackIn_42_0 = null;
        boolean stackIn_43_1 = false;
        int stackIn_57_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_73_0 = 0;
        qh stackIn_89_0 = null;
        boolean stackIn_90_1 = false;
        qh stackIn_96_0 = null;
        boolean stackIn_96_1 = false;
        boolean stackIn_97_2 = false;
        qh stackIn_99_0 = null;
        byte stackIn_99_1 = 0;
        int stackIn_99_2 = 0;
        int stackIn_99_3 = 0;
        boolean stackIn_102_1 = false;
        qh stackIn_106_0 = null;
        boolean stackIn_107_1 = false;
        int stackIn_111_0 = 0;
        qh stackIn_125_0 = null;
        boolean stackIn_126_1 = false;
        qh stackIn_129_0 = null;
        boolean stackIn_130_1 = false;
        qh stackIn_133_0 = null;
        boolean stackIn_134_1 = false;
        qh stackIn_137_0 = null;
        boolean stackIn_138_1 = false;
        String stackIn_152_0 = null;
        qh stackIn_156_0 = null;
        boolean stackIn_157_1 = false;
        qh stackIn_159_0 = null;
        boolean stackIn_160_1 = false;
        int stackIn_168_0 = 0;
        int stackIn_204_0 = 0;
        int stackIn_226_0 = 0;
        qh stackIn_325_0 = null;
        boolean stackIn_326_1 = false;
        qh stackIn_332_0 = null;
        boolean stackIn_332_1 = false;
        boolean stackIn_333_2 = false;
        qh stackIn_335_0 = null;
        int stackIn_335_1 = 0;
        int stackIn_335_2 = 0;
        int stackIn_335_3 = 0;
        boolean stackIn_338_1 = false;
        qh stackIn_342_0 = null;
        boolean stackIn_343_1 = false;
        RuntimeException stackIn_352_0 = null;
        StringBuilder stackIn_352_1 = null;
        String stackIn_353_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String var8 = null;
        qh[] var8_array = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        qh var17 = null;
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
        int var27 = 0;
        qh var28 = null;
        qh var29 = null;
        qh[] var30 = null;
        String var31 = null;
        String var32 = null;
        String var33 = null;
        Object var25Lifetime1;
        String var25_refLifetime1;
        Object var25Lifetime1Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var8_intLifetime1;
        int var16Lifetime1;
        int var18Lifetime1;
        int var16Lifetime2;
        var26 = SteelSentinels.field_G;
        try {
          if (param3) {
            stackIn_12_0 = (ad.field_f) ? 0 : 1;
            var4_int = stackIn_12_0;
          } else {
            if (kk.a(-28548)) {
              stackIn_8_0 = (!param0.field_rc) ? 1 : 0;
            } else {
              stackIn_8_0 = 0;
            }
            var4_int = stackIn_8_0;
          }
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          var5 = 0;
          if (param3) {
            decompiledFrameRemainder1 = !(jg.field_l.length < 2);
            if (decompiledFrameRemainder1) {
              if (param3) {
                stackIn_22_0 = (-1 != qm.field_h) ? 1 : 0;
              } else {
                stackIn_22_0 = 0;
              }
              var6 = stackIn_22_0;
              decompiledFrameRemainder0 = (var6 != 0);
              if (decompiledFrameRemainder0) {
                var7 = qm.field_h;
                for (var8_int = 0; var8_int < rb.field_i.length; var8_int++) {
                  rb.field_i[var8_int] = (byte) 0;
                }
              }
            }
          } else {
            for (var6 = 0; 5 > var6; var6++) {
              if (var4_int != 0 &&
                un.field_h[0][var6 + 1].field_Eb != 0 &&
                var6 != param0.field_Nc) {
                param0.field_Nc = var6;
                var5 = 1;
              }
              stackIn_35_0 = un.field_h[0][var6 + 1];
              stackIn_36_1 = (var4_int != 0);
              stackIn_35_0.field_T = stackIn_36_1;
              if (!rm.field_p &&
                var6 == 3) {
                un.field_h[0][var6 + 1].field_T = false;
              }
              stackIn_42_0 = un.field_h[0][var6 + 1];
              stackIn_43_1 = (var6 == param0.field_Nc);
              stackIn_42_0.field_G = stackIn_43_1;
            }
            if (un.field_h[0][2].field_K) {
              if (kk.a(-28548)) {
                ll.field_i = da.field_c;
              } else {
                ll.field_i = db.a(fk.field_a, -75, new String[]{nf.field_b.field_Xb});
              }
            }
            decompiledFrameRemainder1 = !(jg.field_l.length < 2);
            if (decompiledFrameRemainder1) {
              if (param3) {
                stackIn_57_0 = (-1 != qm.field_h) ? 1 : 0;
              } else {
                stackIn_57_0 = 0;
              }
              var6 = stackIn_57_0;
              decompiledFrameRemainder0 = (var6 != 0);
              if (decompiledFrameRemainder0) {
                var7 = qm.field_h;
                for (var8_int = 0; var8_int < rb.field_i.length; var8_int++) {
                  rb.field_i[var8_int] = (byte) 0;
                }
              }
            }
          }
          if ((decompiledFrameRemainder1) &&
            (decompiledFrameRemainder0)) {
            rb.field_i[var7 / 8] = (byte)vn.a((int) rb.field_i[var7 / 8], 1 << var7 % 8);
          }
          if (decompiledFrameRemainder1) {
            stackIn_65_0 = (!param3) ? 0 : -1;
            for (var7 = stackIn_65_0; jg.field_l.length > var7; var7++) {
              if (var6 != 0) {
                stackIn_73_0 = (var7 != qm.field_h) ? 1 : 0;
              } else {
                stackIn_73_0 = 0;
              }
              var8_intLifetime1 = stackIn_73_0;
              if (var4_int != 0 &&
                un.field_h[1][var7 + 1].field_Eb != 0) {
                if (!param3) {
                  var9 = jg.field_l[var7];
                  if (var9 != param0.field_Ub) {
                    param0.field_Ub = var9;
                    var5 = 1;
                  }
                } else {
                  if (var6 == 0) {
                    if (var7 == -1) {
                      for (var9 = 0; rb.field_i.length > var9; var9++) {
                        rb.field_i[var9] = (byte) 0;
                      }
                    } else {
                      rb.field_i[var7 / 8] = (byte)bi.a((int) rb.field_i[var7 / 8], 1 << ec.a(7, var7));
                    }
                  }
                }
              }
              if (param3) {
                if (var7 == -1) {
                  un.field_h[1][1 + var7].field_G = true;
                  for (var9 = 0; jg.field_l.length > var9; var9++) {
                    dupTemp$0 = un.field_h[1][var7 + 1];
                    stackIn_96_0 = dupTemp$0;
                    stackIn_96_1 = dupTemp$0.field_G;
                    stackIn_97_2 = ((rb.field_i[var9 / 8] & 1 << (var9 & 7)) == 0);
                    stackIn_96_0.field_G = stackIn_96_1 & stackIn_97_2;
                  }
                } else {
                  stackIn_99_0 = un.field_h[1][var7 + 1];
                  stackIn_99_1 = rb.field_i[var7 / 8];
                  stackIn_99_2 = 1;
                  stackIn_99_3 = var7 & 7;
                  stackIn_102_1 = ((stackIn_99_1 & stackIn_99_2 << stackIn_99_3) != 0);
                  stackIn_99_0.field_G = stackIn_102_1;
                }
              } else {
                var9 = jg.field_l[var7];
                stackIn_89_0 = un.field_h[1][1 + var7];
                stackIn_90_1 = (var9 == param0.field_Ub);
                stackIn_89_0.field_G = stackIn_90_1;
              }
              stackIn_106_0 = un.field_h[1][var7 + 1];
              stackIn_107_1 = (var4_int != 0) && (var8_intLifetime1 == 0);
              stackIn_106_0.field_T = stackIn_107_1;
            }
          }
          stackIn_111_0 = (param3) ? 0 : 1;
          for (var6Lifetime1 = stackIn_111_0; var6Lifetime1 < 3; var6Lifetime1++) {
            var28 = un.field_h[2][var6Lifetime1];
            if (var4_int != 0 &&
              var28.field_Eb != 0) {
              if (param3) {
                if (var6Lifetime1 != 0) {
                  nb.field_L = nb.field_L ^ var6Lifetime1;
                } else {
                  nb.field_L = 0;
                }
              } else {
                if (var6Lifetime1 != param0.field_sc) {
                  param0.field_sc = var6Lifetime1;
                  var5 = 1;
                }
              }
            }
            if (!param3) {
              stackIn_133_0 = var28;
              stackIn_134_1 = ((param0.field_sc & var6Lifetime1) != 0);
              stackIn_133_0.field_G = stackIn_134_1;
            } else {
              if (var6Lifetime1 != 0) {
                stackIn_129_0 = var28;
                stackIn_130_1 = ((var6Lifetime1 & nb.field_L) != 0);
                stackIn_129_0.field_G = stackIn_130_1;
              } else {
                stackIn_125_0 = var28;
                stackIn_126_1 = (nb.field_L == 0);
                stackIn_125_0.field_G = stackIn_126_1;
              }
            }
            stackIn_137_0 = var28;
            stackIn_138_1 = (var4_int != 0);
            stackIn_137_0.field_T = stackIn_138_1;
          }
          if (param3 &&
            1 < tc.field_z) {
            for (var6Lifetime2 = 0; tc.field_z + 1 > var6Lifetime2; var6Lifetime2++) {
              var29 = un.field_h[3][var6Lifetime2];
              if (var4_int != 0 &&
                0 != var29.field_Eb) {
                fi.field_l = var6Lifetime2;
              }
              if (var29.field_K &&
                var6Lifetime2 > 0) {
                if (e.field_g != null) {
                  stackIn_152_0 = e.field_g[-1 + var6Lifetime2];
                } else {
                  stackIn_152_0 = null;
                }
                var8 = stackIn_152_0;
                if (var8 != null) {
                  ll.field_i = var8;
                }
              }
              stackIn_156_0 = var29;
              stackIn_157_1 = (fi.field_l == var6Lifetime2);
              stackIn_156_0.field_G = stackIn_157_1;
              stackIn_159_0 = var29;
              stackIn_160_1 = (var4_int != 0);
              stackIn_159_0.field_T = stackIn_160_1;
            }
          }
          if (param1 > -114) {
            return;
          }
          var6Lifetime3 = 0;
          for (var7 = 0; var7 < be.field_a; var7++) {
            var30 = un.field_h[4 + var7];
            var8_array = var30;
            stackIn_168_0 = (param3) ? -1 : 0;
            for (var9 = stackIn_168_0; var30.length - 1 > var9; var9++) {
              var10 = 0;
              var11 = 0;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              if (var4_int != 0 &&
                0 <= var9) {
                if (fc.field_b != null &&
                  null != fc.field_b[var7] &&
                  (~jj.field_i & fc.field_b[var7][var9]) > 0) {
                  var14 = 1;
                  var15 = ok.a(~jj.field_i & fc.field_b[var7][var9], (byte) 51);
                }
                if (null != ad.field_d &&
                  ad.field_d[var7] != null &&
                  rd.field_b <= 0 &&
                  ad.field_d[var7][var9]) {
                  var10 = 1;
                }
                if (null != ja.field_b &&
                  null != ja.field_b[var7]) {
                  var16 = ja.field_b[var7][var9];
                  if (0 < var16 &&
                    ba.field_b < var16) {
                    var12 = 1;
                  }
                  if (var16 != 0 &&
                    !vg.field_a &&
                    rd.field_b <= 0) {
                    var10 = 1;
                  }
                }
                if (param3) {
                  if (gl.field_x != null) {
                    if (null != gl.field_x[var7]) {
                      stackIn_204_0 = (gl.field_x[var7][var9]) ? 1 : 0;
                    } else {
                      stackIn_204_0 = 0;
                    }
                  } else {
                    stackIn_204_0 = 0;
                  }
                } else {
                  stackIn_204_0 = 0;
                }
                var13 = stackIn_204_0;
                if (null != ol.field_cc &&
                  null != ol.field_cc[var7]) {
                  var16Lifetime2 = ol.field_cc[var7][var9];
                  if (var16Lifetime2 != 0 &&
                    !vg.field_a &&
                    rd.field_b <= 0) {
                    var10 = 1;
                  }
                  if (var16Lifetime2 > 0 &&
                    ud.field_D < var16Lifetime2) {
                    var11 = 1;
                  }
                }
              }
              if (ul.field_d >= 2 &&
                fc.field_e[12]) {
                var11 = 0;
                var14 = 0;
                var10 = 0;
                var13 = 0;
                var12 = 0;
              }
              if (var10 == 0 &&
                var11 == 0 &&
                var12 == 0 &&
                var13 == 0 &&
                var14 == 0) {
                stackIn_226_0 = 0;
              } else {
                stackIn_226_0 = 1;
              }
              var16Lifetime1 = stackIn_226_0;
              ng.field_k = true;
              if (var16Lifetime1 == 0 &&
                var9 >= 0 &&
                null != m.field_b && (!param3 ||
                !ad.field_f)) {
                gi.field_u = false;
                ng.field_k = false;
                if (null == dl.field_O) {
                  m.field_h = new boolean[be.field_a];
                  dl.field_O = new byte[be.field_a];
                }
                for (var17_int = 0; var17_int < var7; var17_int++) {
                  m.field_h[var17_int] = false;
                }
                lc.a(var9, -1, param0, var7, -1, -89, 0, param3);
                if (ul.field_d >= 2 &&
                  fc.field_e[12]) {
                  ng.field_k = true;
                }
                if (!ng.field_k) {
                  var16Lifetime1 = 1;
                }
              }
              var17 = var8_array[var9 + 1];
              if (var4_int != 0 &&
                var17.field_Eb != 0) {
                if (!param3) {
                  if (var16Lifetime1 == 0 &&
                    (byte)var9 != param0.field_Sb[var7]) {
                    var5 = 1;
                    param0.field_Sb[var7] = (byte)var9;
                  }
                } else {
                  if (var9 == -1) {
                    for (var18 = var6Lifetime3; var18 < var6Lifetime3 + var30.length - 1; var18++) {
                      ti.field_s[var18 / 8] = (byte)ec.a((int) ti.field_s[var18 / 8], ~(1 << ec.a(var18, 7)));
                    }
                  } else {
                    ti.field_s[(var9 + var6Lifetime3) / 8] = (byte)bi.a((int) ti.field_s[(var9 + var6Lifetime3) / 8], 1 << ec.a(7, var9 + var6Lifetime3));
                  }
                }
              }
              if (param3 &&
                var16Lifetime1 != 0) {
                ti.field_s[(var9 + var6Lifetime3) / 8] = (byte)ec.a((int) ti.field_s[(var9 + var6Lifetime3) / 8], ~(1 << ec.a(var6Lifetime3 + var9, 7)));
              }
              if (var9 >= 0 &&
                var17.field_K) {
                if (bl.field_h == null) {
                  var18_ref = null;
                } else {
                  if (null == bl.field_h[var7]) {
                    var18_ref = null;
                  } else {
                    var18_ref = bl.field_h[var7][var9];
                  }
                }
                if (fj.field_b == null) {
                  var19 = null;
                } else {
                  if (null != fj.field_b[var7]) {
                    var19 = fj.field_b[var7][var9];
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
                  var21 = vi.field_X;
                  var22 = var21;
                  var25 = var22;
                  var22 = var25;
                  var21 = var22;
                  var25 = var21;
                  var22 = var25;
                  var25 = var22;
                  var22 = var25;
                  var21 = var22;
                  var22 = var25;
                } else {
                  if (var10 != 0) {
                    var21 = in.field_c;
                  } else {
                    if (var11 != 0) {
                      var22_int = ol.field_cc[var7][var9] - ud.field_D;
                      if (var22_int != 1) {
                        var21 = db.a(hd.field_d, -34, new String[]{Integer.toString(var22_int)});
                      } else {
                        var21 = wb.field_e;
                      }
                    }
                    if (var12 != 0) {
                      var31 = db.a(bj.field_c, -74, new String[]{Integer.toString(ba.field_b), Integer.toString(ja.field_b[var7][var9])});
                      var22 = var31;
                      var25 = var22;
                      var22 = var25;
                      var21 = var22;
                      var25_ref = var31;
                      var22 = var25_ref;
                      if (var21 == null) {
                        var21 = var31;
                      } else {
                        var21 = (String) (var21) + "<br>" + var31;
                      }
                    }
                    if (var14 != 0) {
                      var22 = si.field_u;
                      if (var15 > 0 &&
                        null != in.field_b &&
                        in.field_b.length >= var15 &&
                        in.field_b[var15 - 1] != null) {
                        var22 = in.field_b[-1 + var15][0];
                      }
                      if (var21 != null) {
                        var21 = (String) (var21) + "<br>" + (String) (var22);
                      } else {
                        var21 = var22;
                      }
                    }
                  }
                }
                if (var4_int != 0 &&
                  !ng.field_k) {
                  var22 = null;
                  if (gi.field_u) {
                    var22 = "</col>" + rb.field_d + "<col=A00000>";
                    var25Lifetime1 = var22;
                    var22 = var25Lifetime1;
                    var25Lifetime1Lifetime1 = var22;
                    var22 = var25Lifetime1Lifetime1;
                    var21 = var22;
                  }
                  var23 = 0;
                  for (var24 = 0; var7 > var24; var24++) {
                    if (m.field_h[var24]) {
                      var25_refLifetime1 = "</col>" + al.field_a[var24] + "<col=A00000>";
                      var22 = var25_refLifetime1;
                      var21 = var22;
                      var22 = var25_refLifetime1;
                      if (var22 != null) {
                        var23 = 1;
                        var22 = (String) (var22) + ", " + var25_refLifetime1;
                        var21 = var22;
                        var21 = var22;
                      } else {
                        var22 = var25_refLifetime1;
                      }
                    }
                  }
                  if (var23 != 0) {
                    var21 = mb.field_Ob + (String) (var22);
                  } else {
                    var21 = db.a(be.field_g, -84, new String[]{(String) (var22)});
                  }
                }
                if (var21 != null) {
                  var32 = "<col=A00000>" + (String) (var21);
                  var33 = ln.a("<br>", (byte) 11, "<br><col=A00000>", var32);
                  if (var20 == null) {
                    var20 = var33;
                  } else {
                    var20 = (String) (var20) + "<br>" + var33;
                  }
                }
                if (var20 != null) {
                  ll.field_i = (String) (var20);
                }
              }
              if (param3) {
                if (var9 == -1) {
                  var17.field_G = true;
                  var27 = var6Lifetime3;
                  var18Lifetime1 = var27;
                  while (-1 + (var6Lifetime3 + var30.length) > var27) {
                    stackIn_332_0 = var17;
                    stackIn_332_1 = var17.field_G;
                    stackIn_333_2 = ((ti.field_s[var27 / 8] & 1 << (var27 & 7)) == 0);
                    stackIn_332_0.field_G = stackIn_332_1 & stackIn_333_2;
                    var27++;
                  }
                } else {
                  stackIn_335_0 = var17;
                  stackIn_335_1 = -1;
                  stackIn_335_2 = ti.field_s[(var9 + var6Lifetime3) / 8] & 1 << (var6Lifetime3 + var9 & 7);
                  stackIn_335_3 = -1;
                  stackIn_338_1 = (stackIn_335_1 != (stackIn_335_2 ^ stackIn_335_3));
                  stackIn_335_0.field_G = stackIn_338_1;
                }
              } else {
                stackIn_325_0 = var17;
                stackIn_326_1 = (ng.field_k) && ((byte)var9 == param0.field_Sb[var7]);
                stackIn_325_0.field_G = stackIn_326_1;
              }
              stackIn_342_0 = var17;
              stackIn_343_1 = (var4_int != 0) && (var16Lifetime1 == 0);
              stackIn_342_0.field_T = stackIn_343_1;
            }
            var6Lifetime3 = var6Lifetime3 + (255 & wb.field_j[var7]);
          }
          if (var5 != 0) {
            if (param3) {
              return;
            }
            ad.a(0, param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_352_0 = var4;
          stackIn_352_1 = new StringBuilder().append("cb.G(");
          if (param0 == null) {
            stackIn_353_2 = "null";
          } else {
            stackIn_353_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_352_0), ((StringBuilder) (Object) stackIn_352_1).append(stackIn_353_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final void run() {
        try {
          InterruptedException interruptedException = null;
          int var5 = 0;
          df var7 = null;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          Exception var2_ref = null;
          String var6 = null;
          var5 = SteelSentinels.field_G;
          while (!this.field_b) {
            var2 = this.field_i;
            synchronized (var2) {
              var7 = (df) (this.field_i.c(-104));
              if (var7 != null) {
                this.field_f = this.field_f - 1;
                decompiledRegionSelector0 = 1;
              } else {
                try {
                  this.field_i.wait();
                } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                }
                decompiledRegionSelector0 = 0;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              continue;
            }
            try {
              if (var7.field_H == 2) {
                var7.field_G.a(79, var7.field_L.length, (int)var7.field_w, var7.field_L);
              } else {
                if (var7.field_H == 3) {
                  var7.field_L = var7.field_G.b((int)var7.field_w, false);
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              sj.a((String) null, -36, (Throwable) ((Object) var2_ref));
            }
            var7.field_z = false;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final df a(byte param0, rc param1, int param2, byte[] param3) {
        df var5 = null;
        RuntimeException var5_ref = null;
        df stackIn_2_0 = null;
        df stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new df();
          if (param0 < 33) {
            stackIn_2_0 = (df) null;
            return stackIn_2_0;
          }
          var5.field_B = false;
          var5.field_H = 2;
          var5.field_w = (long)param2;
          var5.field_G = param1;
          var5.field_L = param3;
          this.a((byte) -92, var5);
          stackIn_4_0 = var5;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("cb.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_h = (int[][]) null;
        field_a = null;
        field_e = null;
        field_j = null;
        field_c = null;
        if (param0 != -1) {
          field_l = -46;
        }
        field_g = null;
        field_d = null;
    }

    final df a(rc param0, int param1, int param2) {
        df var4 = null;
        RuntimeException var4_ref = null;
        df stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new df();
          var4.field_w = (long)param1;
          var4.field_H = param2;
          var4.field_G = param0;
          var4.field_B = false;
          this.a((byte) -109, var4);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("cb.C(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    cb(pn param0) {
        wj var2 = null;
        this.field_i = new ra();
        this.field_b = false;
        this.field_f = 0;
        try {
          var2 = param0.a(2, 5, (Runnable) (this));
          while (var2.field_a == 0) {
            a.a((byte) 121, 10L);
          }
          if (var2.field_a == 2) {
            throw new RuntimeException();
          }
          this.field_k = (Thread) (var2.field_c);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "cb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = "Don't mind";
        field_l = 0;
        field_h = new int[][]{null, null, null};
        field_a = "DEFAULT SET";
        field_g = "Accept";
        field_d = "Remove friend";
    }
}
