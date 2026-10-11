/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wf {
    static int field_e;
    private int field_c;
    static int field_d;
    static phb field_a;
    private ae field_b;

    private final void b(int param0, byte param1) {
        int var9 = VoidHunters.field_G;
        int var3 = 20;
        if (0 == this.field_c) {
          var3 += 60;
        } else {
          if (this.field_c == 1 ||
            2 == this.field_c ||
            this.field_c == 3 ||
            this.field_c == 4 ||
            this.field_c == 9) {
            var3 = 200;
          }
        }
        int var4 = 36;
        int var5 = (-dma.field_g + ip.field_p.width) / 2;
        var3 = var3 + var5;
        int var6 = (ip.field_p.height - dma.field_j) / 2;
        var4 = var4 + var6;
        int var7 = pob.field_b;
        if (param1 != -61) {
          this.field_b = (ae) null;
        }
        int var8 = 0;
        if (var7 >= 16) {
          var8 = -(mg.f(255) * 4) + 1020;
        } else {
          if (var7 > 0) {
            var8 = 4 * mg.f(param1 ^ -196);
          }
        }
        ga.a(param0, false, var3 + var8, var4, -(2 * var4) + ip.field_p.height, ip.field_p.width - var3 * 2, 0);
    }

    private final String a(String param0, byte param1, String param2, int param3) {
        RuntimeException var5 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 34) {
            this.a(true, 114, 76);
          }
          stackIn_3_0 = jd.a(param2, param0, 0, "<col=ffaa00>" + bpb.field_q[param3] + "</col>");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("wf.M(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final void b(byte param0) {
        if (param0 != 49) {
          field_e = 99;
        }
    }

    public static void a(int param0) {
        if (param0 != 3) {
          return;
        }
        field_a = null;
    }

    private final void c(int param0) {
        int var2;
        int var3;
        int var4;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        var4 = VoidHunters.field_G;
        if (param0 != 132) {
          this.field_c = 86;
        }
        stackIn_5_0 = (this.a(0, 115)) ? 0 : 1;
        var2 = stackIn_5_0;
        stackIn_8_0 = (!this.a(2, 120)) ? 1 : 2;
        var3 = stackIn_8_0;
        if (!this.field_b.b((byte) 123)) {
          if (pma.field_o == 96) {
            if (this.field_b.field_j > var2) {
              this.field_b.a((byte) -17, -1 + this.field_b.field_j);
            } else {
              this.field_b.a((byte) -17, var3);
            }
          }
          if (pma.field_o == 97) {
            if (this.field_b.field_j >= 0 &&
              var3 > this.field_b.field_j) {
              this.field_b.a((byte) -17, 1 + this.field_b.field_j);
              this.field_b.c(-19255);
            } else {
              this.field_b.a((byte) -17, var2);
              this.field_b.c(-19255);
            }
          } else {
            this.field_b.c(-19255);
          }
        } else {
          this.field_b.a((byte) -17, var2);
        }
    }

    private final int c(int param0, int param1) {
        int var4 = 0;
        int var3 = (ip.field_p.height - dma.field_j) / 2;
        if (param1 != 17915) {
          this.a(false, -15, 108);
        }
        if (0 != this.field_c) {
        } else {
          if (param0 >= 2) {
            param0 -= 2;
          } else {
            var4 = ct.a(param1 ^ 3900, 128);
            return var3 + vba.field_s[this.field_c] + (5 + var4) * param0;
          }
        }
        if (5 == this.field_c) {
          return vba.field_s[this.field_c] + var3;
        }
        return vba.field_s[this.field_c] + var3 + param0 * vba.field_o[this.field_c];
    }

    private final void a(int param0, boolean param1, int param2) {
        int stackIn_64_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_91_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        String var8;
        String var9_ref_String;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        float var15_float;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var27;
        String var28;
        String var29;
        String var9_ref_StringLifetime1;
        String var9_ref_StringLifetime2;
        String var9_ref_StringLifetime3;
        String var9_ref_StringLifetime1Lifetime1;
        String var9_ref_StringLifetime1Lifetime2;
        String var9_ref_StringLifetime1Lifetime3;
        String var9_ref_StringLifetime1Lifetime4;
        boolean decompiledFrameRemainder0 = true;
        var27 = VoidHunters.field_G;
        var4 = pob.field_b;
        var5 = 2;
        var6 = vba.field_p[this.field_c][param0];
        var7 = vba.field_p[this.field_c].length;
        var8 = ifa.field_g[var6];
        if (var6 == 6) {
          if (he.field_o != 0 &&
            wgb.field_f != 0 &&
            7 != he.field_o &&
            wgb.field_f != 7) {
            if (he.field_o != 1 &&
              wgb.field_f != 1) {
              if ((he.field_o == 2 ||
                wgb.field_f == 2 ||
                he.field_o == 3 ||
                wgb.field_f == 3 ||
                he.field_o == 4 ||
                4 == wgb.field_f)) {
                var8 = aj.field_p.toUpperCase();
              }
            } else {
              var8 = nd.field_q.toUpperCase();
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            var8 = ifa.field_g[5];
            var9_ref_String = var8;
            var9_ref_StringLifetime3 = var8;
          }
        }
        if (19 == var6) {
          if (2 != jha.field_p) {
            if (jha.field_p == 1) {
              var9_ref_StringLifetime1 = jhb.field_o;
            } else {
              var9_ref_StringLifetime1 = wva.field_a;
            }
          } else {
            var9_ref_StringLifetime1 = dv.field_d;
          }
          var28 = var9_ref_StringLifetime1.toUpperCase();
          var9_ref_StringLifetime1Lifetime1 = var28;
          var8 = var9_ref_StringLifetime1Lifetime1;
          var9_ref_StringLifetime1Lifetime2 = var28;
          var8 = var8 + var28;
          var9_ref_StringLifetime1Lifetime3 = var8;
          var8 = var9_ref_StringLifetime1Lifetime3;
          var9_ref_StringLifetime1Lifetime4 = var8;
        }
        if (24 == var6) {
          if (3 != eaa.field_q) {
            if (eaa.field_q != 1) {
              if (0 != eaa.field_q) {
                var9_ref_StringLifetime2 = vk.field_o;
                var8 = var9_ref_StringLifetime2;
                var8 = var9_ref_StringLifetime2;
              } else {
                var9_ref_StringLifetime2 = kja.field_C;
              }
            } else {
              var9_ref_StringLifetime2 = ot.field_a;
            }
          } else {
            var9_ref_StringLifetime2 = msa.field_p;
          }
          var29 = var9_ref_StringLifetime2.toUpperCase();
          var8 = var29;
          var8 = var29;
          var8 = var8 + var29;
        }
        if (var6 == 22 &&
          ji.b(true)) {
          var8 = tqa.field_o.toUpperCase();
        }
        var9 = 0;
        var11 = -10 / ((param2 - 55) / 34);
        if (var6 == 23) {
          if (fwa.field_g.field_a &&
            !ssa.b(2)) {
            if (param1) {
              kwa.a(fla.field_o, -33);
            }
            var9 = 1;
          }
          if (wh.field_n > 0) {
            var9 = 1;
            var8 = pu.field_b.toUpperCase();
          } else {
            var8 = gmb.field_b.toUpperCase();
            if (bm.field_o == null ||
              null == vqa.field_g ||
              null == vqa.field_g.field_m.b(1).field_g.d(vqa.field_g.field_L, 107)) {
              var9 = 1;
            }
          }
        }
        var10 = tea.a(var5, var8, 13879);
        var12 = this.b(31488, param0);
        var13 = this.a((byte) -60, param0);
        var14 = 0;
        if (var4 < 16) {
          if (0 < var4) {
            var15_float = (float)(var7 * 2 - param0) * 0.800000011920929f;
            var14 = (int)(var15_float * (float)mg.f(255));
          }
        } else {
          var15_float = (float)(param0 + var7) * 0.800000011920929f;
          var14 = (int)(var15_float * (float)(-mg.f(255) + 255));
        }
        var13 = var13 + var14;
        var12 = var12 + var14;
        var15 = this.c(param0, 17915);
        if (var6 != 13) {
          stackIn_64_0 = (var6 == 14) ? 1 : 0;
        } else {
          stackIn_64_0 = 1;
        }
        var16 = stackIn_64_0;
        if (var16 != 0) {
          var10 = wrb.a(100, 132);
        }
        var17 = -var10 + var12 + var13 >> 1;
        var18 = this.a(param0, (byte) 70);
        var19 = var13 - var12;
        var20 = this.a(param0, (byte) 70);
        var21 = 0;
        if (param1) {
          var21 = 1;
        }
        var22 = 125;
        if (this.field_c == 5) {
          var22 = 129;
        }
        if (var6 != 0 &&
          var6 != 1) {
          if (var6 == 13) {
            var22 = 135;
          } else if (14 == var6) {
            var22 = 133;
          }
        } else {
          var22 = 127;
        }
        if (var21 == 1) {
          var22++;
        }
        var23 = wrb.a(100, var22);
        var24 = ct.a(19143, var22);
        if (var16 != 0) {
          var25 = var15 + var18 / 2 - 1;
          bn.a(131, var17, (byte) 93, var25);
          if (var6 != 13) {
            stackIn_91_0 = var10 * hlb.field_p / 256;
          } else {
            stackIn_91_0 = var10 * kt.field_l / 256;
          }
          var26 = stackIn_91_0;
          if (var21 == 1) {
            fpa.a(var25, ct.a(19143, 131) + var25, true, var17 + var26, var17);
            bn.a(132, var17, (byte) 122, var25);
            tm.a(126);
          }
          bn.a(var22, -1 + var17 - (-var26 + var23 / 2), (byte) 92, var25 + (ct.a(19143, 132) - var24) / 2);
        } else {
          bn.a(var22, var19 / 2 + (var12 - var23 / 2), (byte) 108, var15 + var20 / 2 - var24 / 2);
          uoa.a(var22, 250, -(var24 / 2) + (var20 / 2 + var15), 0, -(var23 / 2) + var12 + var19 / 2);
          stackIn_85_0 = (param1) ? 15658751 : 13421772;
          var25 = stackIn_85_0;
          if (var9 != 0) {
            var25 = 7829367;
          }
          pm.a(var17, -1, -12 + var18 / 2 + var15 + tib.a(true, var5), var8, var5, var25, (byte) -88);
        }
    }

    final void a(boolean param0, int param1, int param2) {
        if (param1 != 320) {
          field_a = (phb) null;
        }
        if (this.field_b.field_j != -1 &&
          this.a(this.field_b.field_j, 117)) {
          param2 = this.field_b.field_j;
        }
        this.field_b.a(param0, -1, param2, this.a(uia.field_b, kc.field_b, param1 ^ 7060));
        mba.field_b = kdb.field_o;
    }

    final int a(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        var6 = VoidHunters.field_G;
        var4 = 0;
        if (param2 != 6868) {
          field_d = 97;
        }
        while (vba.field_p[this.field_c].length > var4) {
          var5 = this.c(var4, 17915);
          if (this.a(var4, 116) &&
            this.b(31488, var4) <= param1 &&
            param1 < this.a((byte) -9, var4) &&
            param0 >= var5 &&
            var5 + this.a(var4, (byte) 70) > param0) {
            return var4;
          }
          var4++;
        }
        return -1;
    }

    private final void d(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var19;
        String var20;
        String var21;
        var19 = VoidHunters.field_G;
        var2 = 4;
        var3 = pob.field_b;
        var4 = 0;
        if (var3 >= 16) {
          var4 = (-mg.f(255) + 255) * 4;
        } else {
          if (0 < var3) {
            var4 = mg.f(255) * 4;
          }
        }
        var5 = var4 + (ip.field_p.width - dma.field_g) / 2;
        var6 = (-dma.field_j + ip.field_p.height) / 2;
        var7 = 20;
        var8 = 20;
        var10 = -32 % ((param0 - 3) / 51);
        af.a((byte) -115, 200, var8 * 2 + ko.field_e[6].field_n + (ko.field_e[0].field_n + 180 + 55), 80 + var5 + (-ko.field_e[0].field_m - var7), -var8 + (160 + var6 - ko.field_e[0].field_n) - 55, 2 * var7 + (480 + ko.field_e[0].field_m) + ko.field_e[2].field_m);
        var9 = 16;
        var11 = 50;
        var12 = var11 + (-55 - ko.field_e[0].field_n) + (var6 + 160) - var8;
        var13 = 2 * var8 + 180 + ko.field_e[0].field_n + (ko.field_e[6].field_n - 10);
        ga.a(150, false, -var7 + var5 + 80 - (ko.field_e[0].field_m - var9), var12, var13, -(var9 * 2) + ko.field_e[0].field_m + 480 - (-ko.field_e[2].field_m - 2 * var7), 1);
        var14 = 50;
        var15 = -var7 + (-ko.field_e[0].field_m + (var5 + 80 + var9)) + var14;
        var16 = 2 * var7 + (ko.field_e[0].field_m + 480 - var14 * 2) + (ko.field_e[2].field_m - var9 * 2);
        var17 = 13421772;
        if (op.field_o == 0) {
          var12 += 50;
          nua.a(-1, var13, var15, pqa.a(false, var2), 0, mb.field_k[op.field_o], var17, var16, -55, var12, 0, var2);
          nua.a(-1, var13, 140 + var15, pqa.a(false, var2), 0, lu.field_a, 16755200, var16, -51, var12, 0, var2);
        } else {
          var12 -= 10;
          var20 = this.a("<savekey>", (byte) 119, mb.field_k[op.field_o], ve.field_p);
          var21 = this.a("<loadkey>", (byte) 63, var20, gg.field_j);
          nua.a(-1, var13, var15, pqa.a(false, var2), 1, var21, var17, var16, -42, var12, 0, var2);
        }
        pm.a(80 + var5, -1, -50 + var6 + 160, pt.a(op.field_o, -98), 1, 16738305, (byte) -96);
    }

    private final void b(int param0, boolean param1, int param2) {
        int stackIn_40_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_156_0 = 0;
        int stackIn_161_0 = 0;
        int stackIn_166_0 = 0;
        int stackIn_193_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10_int;
        sg var10;
        int var11;
        String var12;
        int var12_int;
        String var13;
        java.awt.datatransfer.StringSelection var13_ref;
        String var14;
        int var15;
        int[] var16;
        String var18;
        String var19;
        String var20;
        int[] var23;
        String var13Lifetime1;
        String var13Lifetime2;
        String var13Lifetime3;
        String var13Lifetime4;
        String var13Lifetime5;
        String var13Lifetime6;
        String var13Lifetime7;
        String var14Lifetime1;
        String var14Lifetime2;
        String var14Lifetime3;
        String var14Lifetime4;
        var15 = VoidHunters.field_G;
        var4 = 1;
        var5 = vba.field_p[this.field_c][param2];
        var10_int = var5;
        if (var10_int != 0) {
          if (var10_int == 1) {
            if (this.field_b.e((byte) -126)) {
              if (fda.e((byte) 85)) {
                iba.a(dsb.field_p, 2, (byte) -115, 320, ck.field_o, param1, wc.field_d, 0, 8, true, dsb.field_p.field_o, dra.field_v, 240, 8, dsb.field_p.field_A + dsb.field_p.field_o);
              } else {
                var10_int = param1 ? 1 : 0;
                lha.a(wgb.field_f, var10_int != 0, (byte) -85, -4);
              }
            }
          } else {
            if (var10_int != 2) {
              if (5 != var10_int) {
                if (16 == var10_int) {
                  if (this.field_b.e((byte) -78)) {
                    var10_int = param1 ? 1 : 0;
                    lha.a(wgb.field_f, var10_int != 0, (byte) -85, 7);
                    fhb.field_p = true;
                  }
                } else {
                  if (var10_int == 3) {
                    if (this.field_b.e((byte) -86)) {
                      op.field_o = 0;
                      var10_int = param1 ? 1 : 0;
                      lha.a(wgb.field_f, var10_int != 0, (byte) -85, 5);
                    }
                  } else {
                    if (var10_int != 6) {
                      if (20 == var10_int) {
                        if (this.field_b.e((byte) -95)) {
                          var10_int = param1 ? 1 : 0;
                          lha.a(wgb.field_f, var10_int != 0, (byte) -85, 8);
                        }
                      } else {
                        if (var10_int != 21) {
                          if (var10_int != 13) {
                            if (var10_int != 14) {
                              if (4 == var10_int) {
                                if (this.field_b.e((byte) -87)) {
                                  apb.a((byte) 125);
                                }
                              } else {
                                if (19 == var10_int) {
                                  var8 = 0;
                                  if (this.field_b.c((byte) -45)) {
                                    jha.field_p = jha.field_p + 1;
                                    var8 = 1;
                                  }
                                  if (this.field_b.a(42)) {
                                    jha.field_p = jha.field_p - 1;
                                    var8 = 1;
                                  }
                                  if (3 <= jha.field_p) {
                                    jha.field_p = 0;
                                  }
                                  if (jha.field_p < 0) {
                                    jha.field_p = 2;
                                  }
                                  if (var8 != 0) {
                                    aw.a(false);
                                    if (ef.field_E) {
                                      bea.a((byte) 114, "graphics_quality", jha.field_p);
                                      qra.a(-96);
                                    }
                                  }
                                } else {
                                  if (var10_int != 24) {
                                    if (var10_int == 7) {
                                      if (this.field_b.e((byte) -126)) {
                                        if (null != vqa.field_g) {
                                          vqa.field_g.a(param1, -10510);
                                        }
                                        aeb.field_a = true;
                                        bg.field_o = false;
                                        if (wh.g(-118) &&
                                          jkb.field_a) {
                                          dpa.field_p.h(param0 ^ 24343, 10);
                                          jkb.field_a = false;
                                          nwa.field_d = false;
                                        }
                                      }
                                    } else {
                                      if (var10_int != 8) {
                                        if (var10_int == 9) {
                                          if (this.field_b.e((byte) -94)) {
                                            vqa.field_g.i(60);
                                            var10_int = param1 ? 1 : 0;
                                            stackIn_161_0 = (!bqa.a(false)) ? 0 : 7;
                                            lha.a(stackIn_161_0, var10_int != 0, (byte) -85, -1);
                                          }
                                        } else {
                                          if (var10_int == 10) {
                                            if (this.field_b.e((byte) -96)) {
                                              vqa.field_g.b(true);
                                              var10_int = param1 ? 1 : 0;
                                              stackIn_166_0 = (bqa.a(false)) ? 7 : 0;
                                              lha.a(stackIn_166_0, var10_int != 0, (byte) -85, -1);
                                            }
                                          } else {
                                            if (var10_int == 11) {
                                              if (this.field_b.e((byte) -98)) {
                                                if (idb.field_o) {
                                                  var10_int = param1 ? 1 : 0;
                                                  lha.a(wgb.field_f, var10_int != 0, (byte) -85, -5);
                                                }
                                                if (nhb.field_p) {
                                                  jua.a(0, 11, 20694);
                                                }
                                              }
                                            } else {
                                              if (var10_int != 17) {
                                                if (var10_int == 18) {
                                                  if (this.field_b.e((byte) -115) &&
                                                    this.a(param2, param0 ^ 96)) {
                                                    op.field_o = op.field_o + 1;
                                                  }
                                                  if (!this.a(param2, 125) &&
                                                    !param1) {
                                                    this.field_b.field_j = this.field_b.field_j - 1;
                                                  }
                                                } else {
                                                  if (var10_int == 12) {
                                                    if (this.field_b.e((byte) -82)) {
                                                      VoidHunters.a(vpa.b((byte) -123), param0 - 20);
                                                    }
                                                  } else {
                                                    if (var10_int == 22) {
                                                      if (this.field_b.e((byte) -119)) {
                                                        stackIn_193_0 = (!ji.b(true)) ? 0 : 1;
                                                        var10_int = stackIn_193_0;
                                                        qqa.a(var10_int != 0, (byte) -90);
                                                      }
                                                    } else {
                                                      if (23 == var10_int &&
                                                        this.field_b.e((byte) -84)) {
                                                        var4 = 0;
                                                        if (vqa.field_g != null &&
                                                          wh.field_n <= 0 && (!fwa.field_g.field_a ||
                                                          ssa.b(2))) {
                                                          var10 = vqa.field_g.field_m.b(1).field_g.d(vqa.field_g.field_L, 93);
                                                          if (var10 != null) {
                                                            if (bm.field_o == null) {
                                                              return;
                                                            }
                                                            var23 = rsa.a(var10.field_k, param0 ^ -98);
                                                            var18 = rob.a(65535, var23);
                                                            var14 = var18;
                                                            var13 = var14;
                                                            var13Lifetime1 = var18;
                                                            if (var18 == null) {
                                                              return;
                                                            }
                                                            if (var18.length() == 0) {
                                                              return;
                                                            }
                                                            var12 = "ship_view.ws?ship=" + var18;
                                                            var14Lifetime1 = var12;
                                                            var13Lifetime2 = var14Lifetime1;
                                                            var13Lifetime3 = var12;
                                                            var13Lifetime4 = "games.jagex.com";
                                                            var19 = mab.field_a.getParameter("environment");
                                                            var14Lifetime2 = var19;
                                                            var13Lifetime5 = var14Lifetime2;
                                                            var13Lifetime6 = var19;
                                                            var14Lifetime3 = var13Lifetime6;
                                                            var13Lifetime7 = var14Lifetime3;
                                                            if (var19 != null) {
                                                              var14Lifetime4 = var19.toLowerCase();
                                                              var13Lifetime7 = var14Lifetime4;
                                                              var13Lifetime7 = var14Lifetime4;
                                                              if (var14Lifetime4.equals("wtwip")) {
                                                                var13Lifetime7 = "games-wtwip.jagex.com";
                                                              } else {
                                                                if (!var14Lifetime4.equals("wtqa")) {
                                                                  if (var14Lifetime4.equals("wtrc")) {
                                                                    var13Lifetime7 = "games-wtrc.jagex.com";
                                                                  } else {
                                                                    if (var14Lifetime4.equals("wti")) {
                                                                      var13Lifetime7 = "games-wti.jagex.com";
                                                                    }
                                                                  }
                                                                } else {
                                                                  var13Lifetime7 = "games-wtqa.jagex.com";
                                                                }
                                                              }
                                                            }
                                                            var20 = "http://" + var13Lifetime7 + "/g=voidhunters/autochoose.ws?dest=" + msa.a((CharSequence) ((Object) var12), 32);
                                                            var13_ref = new java.awt.datatransfer.StringSelection(var20);
                                                            bm.field_o.a((byte) -45, (java.awt.datatransfer.Transferable) ((Object) var13_ref));
                                                            wh.field_n = 100;
                                                            var4 = 1;
                                                            qp.a(true, 0, vpa.b((byte) -92), var20);
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              } else {
                                                if (this.field_b.e((byte) -81) &&
                                                  this.a(param2, 115)) {
                                                  op.field_o = op.field_o - 1;
                                                }
                                                if (!this.a(param2, 113) &&
                                                  !param1) {
                                                  this.field_b.field_j = this.field_b.field_j + 1;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        if (this.field_b.e((byte) -89)) {
                                          vqa.field_g.e(true);
                                          var10_int = param1 ? 1 : 0;
                                          stackIn_156_0 = (bqa.a(false)) ? 7 : 0;
                                          lha.a(stackIn_156_0, var10_int != 0, (byte) -85, -1);
                                        }
                                      }
                                    }
                                  } else {
                                    var9 = 0;
                                    if (this.field_b.c((byte) -45)) {
                                      var9 = 1;
                                    }
                                    if (this.field_b.a(52)) {
                                      var9 = -1;
                                    }
                                    if (var9 != 0) {
                                      var10_int = 0;
                                      while (!(var10_int >= ub.field_f.length)) {
                                        var11 = lwa.a(eaa.field_q, -1);
                                        var11 = (var9 + ub.field_f.length + var11) % ub.field_f.length;
                                        var12_int = ub.field_f[var11];
                                        if (!wea.a(-25915, var12_int)) {
                                          var10_int++;
                                          continue;
                                        }
                                        var16 = new int[]{var12_int};
                                        vq.field_x.a(false, fja.a(var16, 2));
                                        break;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              var7 = hlb.field_p;
                              if (this.field_b.a(true)) {
                                re.a(0, (byte) -109);
                              }
                              if (this.field_b.d(param0 + 12441)) {
                                re.a(256, (byte) -104);
                              }
                              if (this.field_b.b((byte) 111)) {
                                var10_int = this.b(31488, param2) + (this.a((byte) -76, param2) - wrb.a(100, 131)) >> 1;
                                var11 = kc.field_b - var10_int;
                                var12_int = 256 * var11 / wrb.a(100, 131);
                                if (var12_int > 0) {
                                  if (var12_int < 256) {
                                    re.a(var12_int, (byte) -111);
                                  } else {
                                    re.a(256, (byte) -112);
                                  }
                                } else {
                                  re.a(0, (byte) -127);
                                }
                              }
                              if (this.field_b.d((byte) -7)) {
                                mi.e((byte) -81);
                              }
                              if (this.field_b.b(-80)) {
                                vcb.f(32);
                              }
                              if (hlb.field_p != var7 &&
                                ef.field_E) {
                                bea.a((byte) -22, "music_volume", hlb.field_p);
                                qra.a(-122);
                              }
                            }
                          } else {
                            var6 = 0;
                            if (this.field_b.a(true) &&
                              kt.field_l > 0) {
                              nl.a(0, -13205);
                              var6 = 1;
                            }
                            if (this.field_b.d(12465) &&
                              256 > kt.field_l) {
                              var6 = 1;
                              nl.a(256, -13205);
                            }
                            if (this.field_b.b((byte) 126)) {
                              var10_int = this.b(31488, param2) - (-this.a((byte) -79, param2) + wrb.a(100, 131)) >> 1;
                              var11 = kc.field_b - var10_int;
                              var12_int = 256 * var11 / wrb.a(param0 + 76, 131);
                              var6 = 1;
                              if (var12_int <= 0) {
                                nl.a(0, -13205);
                              } else {
                                if (256 > var12_int) {
                                  nl.a(var12_int, -13205);
                                } else {
                                  nl.a(256, -13205);
                                }
                              }
                            }
                            if (this.field_b.d((byte) -7) &&
                              kt.field_l > 0) {
                              var6 = 1;
                              spa.b((byte) 64);
                            }
                            if (this.field_b.b(-86) &&
                              kt.field_l < 256) {
                              ft.b(18941);
                              var6 = 1;
                            }
                            if (var6 != 0) {
                              if (!this.field_b.b((byte) 119) ||
                                !(mba.field_b >= kdb.field_o)) {
                                lha.a(-124, fa.field_d[1]);
                                mba.field_b = 20 + kdb.field_o;
                              }
                              if (ef.field_E) {
                                bea.a((byte) 3, "fx_volume", kt.field_l);
                                qra.a(-108);
                              }
                            }
                          }
                        } else {
                          if (this.field_b.e((byte) -107)) {
                            var10_int = param1 ? 1 : 0;
                            lha.a(wgb.field_f, var10_int != 0, (byte) -85, 9);
                          }
                        }
                      }
                    } else {
                      if (this.field_b.e((byte) -105)) {
                        var10_int = he.field_o;
                        var11 = param1 ? 1 : 0;
                        lha.a(wgb.field_f, var11 != 0, (byte) -85, var10_int);
                      }
                    }
                  }
                }
              } else {
                if (this.field_b.e((byte) -83)) {
                  var10_int = param1 ? 1 : 0;
                  lha.a(wgb.field_f, var10_int != 0, (byte) -85, 0);
                }
              }
            } else {
              if (this.field_b.e((byte) -97)) {
                var10_int = param1 ? 1 : 0;
                stackIn_51_0 = (bqa.a(false)) ? 7 : 0;
                lha.a(stackIn_51_0, var10_int != 0, (byte) -85, -1);
              }
            }
          }
        } else {
          if (this.field_b.e((byte) -78)) {
            var10_int = param1 ? 1 : 0;
            stackIn_40_0 = (bqa.a(false)) ? 7 : 0;
            lha.a(stackIn_40_0, var10_int != 0, (byte) -85, -3);
          }
        }
        if (param0 != 24) {
          this.c((byte) 37);
        }
        if (var4 != 0 &&
          this.field_b.e((byte) -102)) {
          lha.a(param0 ^ -106, fa.field_d[7]);
        }
    }

    final void c(byte param0) {
        String discarded$0 = null;
        int stackIn_13_1 = 0;
        boolean stackIn_14_2 = false;
        int var2;
        int var3;
        int var4;
        int var5_int;
        String var5;
        int var6;
        int var7;
        String var8;
        int var2Lifetime1;
        int var2Lifetime2;
        int var3Lifetime1;
        int var4Lifetime1;
        int var6Lifetime1;
        var7 = VoidHunters.field_G;
        this.b(150, (byte) -61);
        if (this.field_c == 7) {
          return;
        }
        if (this.field_c == 8) {
          nb.e((byte) 102);
        }
        if (param0 != 65) {
          var8 = (String) null;
          discarded$0 = this.a((String) null, (byte) -83, (String) null, -38);
        }
        for (var2 = 0; var2 < this.field_b.field_c; var2++) {
          if (this.a(var2, 126)) {
            stackIn_13_1 = var2;
            stackIn_14_2 = (this.field_b.field_j == var2);
            this.a(stackIn_13_1, stackIn_14_2, param0 ^ 40);
          }
        }
        if (5 == this.field_c) {
          this.d((byte) -48);
        } else {
          if (this.field_c == 6) {
            var2Lifetime1 = 3;
            var3 = aib.a((byte) -37, iia.field_c, pqa.a(false, var2Lifetime1), var2Lifetime1, 480);
            var4 = 16;
            var5_int = (ip.field_p.width - dma.field_g) / 2;
            var6 = (-dma.field_j + ip.field_p.height) / 2;
            var3 = var3 + var4 * 2;
            af.a((byte) -115, 255, var3, var5_int + (80 - var4), -var4 + (var6 + 160), var4 * 2 + 480);
            nua.a(-1, 1000, 80 + var5_int, pqa.a(false, var2Lifetime1), 0, iia.field_c, 8555923, 480, -32, 160 + var6, 0, var2Lifetime1);
          }
        }
        var2Lifetime2 = pob.field_b;
        var3Lifetime1 = 0;
        if (var2Lifetime2 < 16) {
          if (var2Lifetime2 > 0) {
            var3Lifetime1 = mg.f(255) * 4;
          }
        } else {
          var3Lifetime1 = 4 * (-mg.f(param0 ^ 190) + 255);
        }
        var4Lifetime1 = (ip.field_p.height - dma.field_j) / 2;
        if (this.field_c != 0) {
          if (this.field_c < ocb.field_m.length &&
            ocb.field_m[this.field_c] != null) {
            var5 = ocb.field_m[this.field_c];
            var6Lifetime1 = 1;
            pm.a(ip.field_p.width / 2 - (tea.a(var6Lifetime1, var5, 13879) / 2 - var3Lifetime1), 1, var4Lifetime1 + 110, var5, 1, 16777215, (byte) -120);
          }
        } else {
          bn.a(137, var3Lifetime1 + ip.field_p.width / 2 - wrb.a(param0 ^ 37, 137) / 2, (byte) 103, 20 + var4Lifetime1);
        }
        return;
    }

    private final int b(int param0, int param1) {
        int discarded$0 = 0;
        int var4 = 0;
        if (param0 != 31488) {
          discarded$0 = this.a((byte) -10, -10);
        }
        int var3 = (ip.field_p.width - dma.field_g) / 2;
        if (this.field_c == 5) {
          return 190 * param1 + var3 + vba.field_r[this.field_c];
        }
        if (0 == this.field_c) {
          if (param1 < 2) {
            var4 = -25 + (ip.field_p.width / 2 - wrb.a(100, 128));
            return var4;
          }
          return 25 + var3 + vba.field_r[this.field_c];
        }
        return vba.field_r[this.field_c] + var3;
    }

    private final boolean a(int param0, int param1) {
        if (param1 <= 112) {
          field_d = -28;
        }
        if (this.field_c != 5) {
          return true;
        }
        if (param0 == 0 &&
          op.field_o == 0) {
          return false;
        }
        if (param0 == 2 &&
          op.field_o == mb.field_k.length - 1) {
          return false;
        }
        return true;
    }

    private final void a(byte param0) {
        int var3 = 0;
        int var6;
        int var2;
        int var4;
        int var5;
        var6 = VoidHunters.field_G;
        if (si.field_o[13]) {
          var2 = vba.field_p[this.field_c].length;
          for (var3 = 0; var2 > var3; var3++) {
            var4 = vba.field_p[this.field_c][var3];
            if (var4 == 6) {
              var5 = he.field_o;
              lha.a(wgb.field_f, false, (byte) -85, var5);
            }
          }
        } else {
          if (5 != oab.field_o) {
            this.field_b.a((byte) -63);
          } else {
            this.c(param0 + 183);
          }
        }
        if (param0 != -51) {
          this.b(-56, (byte) 28);
        }
    }

    private final int a(byte param0, int param1) {
        int var3 = (-dma.field_g + ip.field_p.width) / 2;
        if (this.field_c == 5) {
          return this.b(31488, param1) + 140;
        }
        if (param0 > -1) {
          return -98;
        }
        if (this.field_c == 0 &&
          param1 < 2) {
          return ip.field_p.width / 2;
        }
        return vba.field_q[this.field_c] + var3;
    }

    final void b(int param0) {
        boolean stackIn_10_0 = false;
        int stackIn_41_0 = 0;
        int var2;
        int var3;
        int var2Lifetime1;
        int var2Lifetime1Lifetime1;
        var3 = VoidHunters.field_G;
        if (vba.f((byte) -72)) {
          return;
        }
        if (param0 != 0) {
          this.field_c = 40;
        }
        if (8 == this.field_c) {
          fia.a(false);
        }
        if (this.field_c == 7) {
          stackIn_10_0 = !(ee.a(-75));
          var2 = ll.a(stackIn_10_0, (byte) 40);
          if (3 == var2) {
            if (null != psb.field_b) {
              cqb.b((byte) -42);
            }
            mra.a(vpa.b((byte) -105), 0);
          }
          if (var2 == 1) {
            lha.a(wgb.field_f, false, (byte) -85, 0);
          }
          if (var2 == 2) {
            lha.a(wgb.field_f, true, (byte) -85, 0);
          }
          return;
        }
        if (!lu.field_d &&
          !dua.field_o) {
          while (ata.e(127)) {
            if (qmb.a(-22029)) {
              continue;
            }
            if (pma.field_o == 13) {
              if (1 != this.field_c &&
                2 != this.field_c &&
                this.field_c != 3 &&
                this.field_c != 4) {
                continue;
              }
              stackIn_41_0 = (!bqa.a(false)) ? 0 : 7;
              lha.a(stackIn_41_0, false, (byte) -85, -1);
              continue;
            }
            var2Lifetime1 = this.field_b.field_j;
            this.a((byte) -51);
            if (0 <= this.field_b.field_j &&
              var2Lifetime1 != this.field_b.field_j) {
              lha.a(-110, fa.field_d[0]);
            }
            if (this.field_b.field_j == -1) {
              continue;
            }
            this.b(24, false, this.field_b.field_j);
          }
          var2Lifetime1Lifetime1 = this.field_b.field_j;
          this.field_b.a(this.a(qs.field_a, oq.field_H, 6868), 5620, this.a(uia.field_b, kc.field_b, param0 ^ 6868));
          if (this.field_b.field_j >= 0 &&
            var2Lifetime1Lifetime1 != this.field_b.field_j) {
            lha.a(-124, fa.field_d[0]);
          }
          if (this.field_b.field_j != -1) {
            this.b(24, true, this.field_b.field_j);
          }
        }
    }

    private final int a(int param0, byte param1) {
        int discarded$0 = 0;
        if (this.field_c == 0 &&
          param0 < 2) {
          return vba.field_o[this.field_c] + 30;
        }
        if (param1 != 70) {
          discarded$0 = this.c(-81, -122);
        }
        return 30;
    }

    wf(int param0) {
        this.field_c = param0;
        this.field_b = new ae(vba.field_p[this.field_c].length);
    }

    static {
        field_e = 12;
    }
}
