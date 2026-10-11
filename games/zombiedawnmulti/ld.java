/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld extends cj {
    private char[] field_Pb;
    private int[] field_Qb;
    private int field_Hb;
    private int field_Nb;
    private int field_Ob;
    private int field_Sb;
    private int field_Tb;
    private ld field_Ib;
    private int field_Mb;
    static lf field_Rb;
    private mo[] field_Gb;
    private int field_Vb;
    private ld[] field_Fb;
    private int field_Jb;
    static ja[] field_Ub;
    static String field_Lb;
    static long field_Kb;

    final int i(int param0) {
        if (param0 != -29804) {
          this.field_Hb = 69;
        }
        return this.field_Sb + (this.field_Ib != null ? this.field_Ib.i(-29804) : 0);
    }

    private final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var6 = ZombieDawnMulti.field_E ? 1 : 0;
        this.field_Hb = param0;
        int var5 = 0;
        if (param1 != 11183) {
          return;
        }
        while (var5 < this.field_Ob) {
          var3 = this.field_Jb * var5;
          var4 = this.field_Hb * this.field_Hb;
          this.field_Gb[var5].field_Q = (var4 * (this.field_Mb - this.field_qb) + (144 - var4) * var3) / 144;
          var5++;
        }
    }

    final static void a(jh param0, boolean param1, int param2, int param3) {
        mo dupTemp$0 = null;
        int var17_int = 0;
        int var24 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        mo stackIn_22_0 = null;
        boolean stackIn_23_1 = false;
        mo stackIn_29_0 = null;
        boolean stackIn_30_1 = false;
        int stackIn_43_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_59_0 = 0;
        mo stackIn_76_0 = null;
        boolean stackIn_76_1 = false;
        boolean stackIn_77_2 = false;
        mo stackIn_80_0 = null;
        boolean stackIn_81_1 = false;
        mo stackIn_84_0 = null;
        boolean stackIn_85_1 = false;
        mo stackIn_89_0 = null;
        boolean stackIn_90_1 = false;
        int stackIn_94_0 = 0;
        mo stackIn_108_0 = null;
        boolean stackIn_109_1 = false;
        mo stackIn_113_0 = null;
        boolean stackIn_114_1 = false;
        mo stackIn_117_0 = null;
        boolean stackIn_118_1 = false;
        mo stackIn_121_0 = null;
        boolean stackIn_122_1 = false;
        String stackIn_139_0 = null;
        mo stackIn_144_0 = null;
        boolean stackIn_145_1 = false;
        mo stackIn_147_0 = null;
        boolean stackIn_148_1 = false;
        int stackIn_154_0 = 0;
        int stackIn_200_0 = 0;
        int stackIn_212_0 = 0;
        mo stackIn_313_0 = null;
        boolean stackIn_313_1 = false;
        boolean stackIn_314_2 = false;
        mo stackIn_317_0 = null;
        boolean stackIn_318_1 = false;
        int stackIn_321_1 = 0;
        byte stackIn_321_2 = 0;
        int stackIn_321_3 = 0;
        mo stackIn_323_0 = null;
        boolean stackIn_324_1 = false;
        mo stackIn_328_0 = null;
        boolean stackIn_329_1 = false;
        RuntimeException stackIn_338_0 = null;
        StringBuilder stackIn_338_1 = null;
        String stackIn_339_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String var8 = null;
        mo[] var8_array = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        mo var17 = null;
        int var18 = 0;
        Object var18_ref = null;
        Object var19 = null;
        Object var20 = null;
        Object var21 = null;
        int var22_int = 0;
        Object var22 = null;
        int var23 = 0;
        Object var25 = null;
        String var25_ref = null;
        int var26 = 0;
        int var27 = 0;
        mo var28 = null;
        mo var29 = null;
        mo[] var30 = null;
        String var31 = null;
        String var32 = null;
        Object var25Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        int var8_intLifetime1;
        int var16Lifetime1;
        int var18Lifetime1;
        int var16Lifetime2;
        var26 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param1) {
            stackIn_12_0 = (la.field_k) ? 0 : 1;
            var4_int = stackIn_12_0;
          } else {
            if (hl.b(0)) {
              stackIn_8_0 = (!param0.field_Fb) ? 1 : 0;
            } else {
              stackIn_8_0 = 0;
            }
            var4_int = stackIn_8_0;
          }
          var5 = 0;
          if (!param1) {
            for (var6 = 0; var6 < 5; var6++) {
              if (var4_int != 0 &&
                ma.field_b[0][1 + var6].field_T != 0 &&
                var6 != param0.field_Pb) {
                var5 = 1;
                param0.field_Pb = var6;
              }
              stackIn_22_0 = ma.field_b[0][var6 + 1];
              stackIn_23_1 = (var4_int != 0);
              stackIn_22_0.field_Z = stackIn_23_1;
              if (!tb.field_u &&
                var6 == 3) {
                ma.field_b[0][1 + var6].field_Z = false;
              }
              stackIn_29_0 = ma.field_b[0][1 + var6];
              stackIn_30_1 = (param0.field_Pb == var6);
              stackIn_29_0.field_Ab = stackIn_30_1;
            }
            if (ma.field_b[0][2].field_pb) {
              if (hl.b(0)) {
                ui.field_j = pd.field_f;
              } else {
                ui.field_j = vl.a(vc.field_e, new String[]{mh.field_c.field_Nb}, 2);
              }
            }
          }
          if (qo.field_r.length >= 2) {
            if (param1) {
              stackIn_43_0 = (tj.field_c != -1) ? 1 : 0;
            } else {
              stackIn_43_0 = 0;
            }
            var6Lifetime1 = stackIn_43_0;
            if (var6Lifetime1 != 0) {
              var7 = tj.field_c;
              for (var8_int = 0; var8_int < fg.field_k.length; var8_int++) {
                fg.field_k[var8_int] = (byte) 0;
              }
              fg.field_k[var7 / 8] = (byte)cr.b((int) fg.field_k[var7 / 8], 1 << var7 % 8);
            }
            stackIn_51_0 = (!param1) ? 0 : -1;
            for (var7 = stackIn_51_0; qo.field_r.length > var7; var7++) {
              if (var6Lifetime1 != 0) {
                stackIn_59_0 = (tj.field_c != var7) ? 1 : 0;
              } else {
                stackIn_59_0 = 0;
              }
              var8_intLifetime1 = stackIn_59_0;
              if (var4_int != 0 &&
                ma.field_b[1][var7 + 1].field_T != 0) {
                if (param1) {
                  if (var6Lifetime1 == 0) {
                    if (var7 == -1) {
                      for (var9 = 0; var9 < fg.field_k.length; var9++) {
                        fg.field_k[var9] = (byte) 0;
                      }
                    } else {
                      fg.field_k[var7 / 8] = (byte)vg.a((int) fg.field_k[var7 / 8], 1 << tq.b(var7, 7));
                    }
                  }
                } else {
                  var9 = qo.field_r[var7];
                  if (var9 != param0.field_mc) {
                    param0.field_mc = var9;
                    var5 = 1;
                  }
                }
              }
              if (!param1) {
                var9 = qo.field_r[var7];
                stackIn_84_0 = ma.field_b[1][1 + var7];
                stackIn_85_1 = (param0.field_mc == var9);
                stackIn_84_0.field_Ab = stackIn_85_1;
              } else {
                if (var7 == -1) {
                  ma.field_b[1][var7 + 1].field_Ab = true;
                  for (var9 = 0; qo.field_r.length > var9; var9++) {
                    dupTemp$0 = ma.field_b[1][var7 + 1];
                    stackIn_76_0 = dupTemp$0;
                    stackIn_76_1 = dupTemp$0.field_Ab;
                    stackIn_77_2 = ((fg.field_k[var9 / 8] & 1 << (var9 & 7)) == 0);
                    stackIn_76_0.field_Ab = stackIn_76_1 & stackIn_77_2;
                  }
                } else {
                  stackIn_80_0 = ma.field_b[1][var7 + 1];
                  stackIn_81_1 = ((fg.field_k[var7 / 8] & 1 << (7 & var7)) != 0);
                  stackIn_80_0.field_Ab = stackIn_81_1;
                }
              }
              stackIn_89_0 = ma.field_b[1][var7 + 1];
              stackIn_90_1 = (var4_int != 0) && (var8_intLifetime1 == 0);
              stackIn_89_0.field_Z = stackIn_90_1;
            }
          }
          stackIn_94_0 = (param1) ? 0 : 1;
          var6Lifetime2 = stackIn_94_0;
          if (param3 != 1) {
            field_Kb = -74L;
          }
          while (var6Lifetime2 < 3) {
            var28 = ma.field_b[2][var6Lifetime2];
            if (var4_int != 0 &&
              var28.field_T != 0) {
              if (!param1) {
                if (var6Lifetime2 != param0.field_fc) {
                  var5 = 1;
                  param0.field_fc = var6Lifetime2;
                }
              } else {
                if (var6Lifetime2 == 0) {
                  sc.field_f = 0;
                } else {
                  sc.field_f = sc.field_f ^ var6Lifetime2;
                }
              }
            }
            stackIn_108_0 = var28;
            stackIn_109_1 = (var4_int != 0);
            stackIn_108_0.field_Z = stackIn_109_1;
            if (!param1) {
              stackIn_121_0 = var28;
              stackIn_122_1 = ((var6Lifetime2 & param0.field_fc) != 0);
              stackIn_121_0.field_Ab = stackIn_122_1;
            } else {
              if (var6Lifetime2 == 0) {
                stackIn_117_0 = var28;
                stackIn_118_1 = (sc.field_f == 0);
                stackIn_117_0.field_Ab = stackIn_118_1;
              } else {
                stackIn_113_0 = var28;
                stackIn_114_1 = ((var6Lifetime2 & sc.field_f) != 0);
                stackIn_113_0.field_Ab = stackIn_114_1;
              }
            }
            var6Lifetime2++;
          }
          if (param1 &&
            r.field_f > 1) {
            for (var6Lifetime3 = 0; r.field_f + 1 > var6Lifetime3; var6Lifetime3++) {
              var29 = ma.field_b[3][var6Lifetime3];
              if (var4_int != 0 &&
                var29.field_T != 0) {
                pb.field_h = var6Lifetime3;
              }
              if (var29.field_pb &&
                0 < var6Lifetime3) {
                if (null != qp.field_s) {
                  stackIn_139_0 = qp.field_s[-1 + var6Lifetime3];
                } else {
                  stackIn_139_0 = null;
                }
                var8 = stackIn_139_0;
                if (var8 != null) {
                  ui.field_j = var8;
                }
              }
              stackIn_144_0 = var29;
              stackIn_145_1 = (var4_int != 0);
              stackIn_144_0.field_Z = stackIn_145_1;
              stackIn_147_0 = var29;
              stackIn_148_1 = (pb.field_h == var6Lifetime3);
              stackIn_147_0.field_Ab = stackIn_148_1;
            }
          }
          var6Lifetime4 = 0;
          for (var7 = 0; var7 < kj.field_h; var7++) {
            var30 = ma.field_b[4 + var7];
            var8_array = var30;
            stackIn_154_0 = (!param1) ? 0 : -1;
            for (var9 = stackIn_154_0; var9 < var30.length - 1; var9++) {
              var10 = 0;
              var11 = 0;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              if (var4_int != 0 &&
                0 <= var9) {
                if (na.field_J != null &&
                  null != na.field_J[var7] &&
                  (~ql.field_c & na.field_J[var7][var9]) > 0) {
                  var14 = 1;
                  var15 = vl.a(~ql.field_c & na.field_J[var7][var9], (byte) -103);
                }
                if (null != ch.field_g &&
                  ch.field_g[var7] != null &&
                  0 >= vl.field_h &&
                  ch.field_g[var7][var9]) {
                  var10 = 1;
                }
                if (null != sd.field_G &&
                  null != sd.field_G[var7]) {
                  var16 = sd.field_G[var7][var9];
                  if (0 != var16 &&
                    !bo.field_e &&
                    vl.field_h <= 0) {
                    var10 = 1;
                  }
                  if (var16 > 0 &&
                    bc.field_e < var16) {
                    var12 = 1;
                  }
                }
                if (null != r.field_c &&
                  r.field_c[var7] != null) {
                  var16Lifetime2 = r.field_c[var7][var9];
                  if (var16Lifetime2 != 0 &&
                    !bo.field_e &&
                    vl.field_h <= 0) {
                    var10 = 1;
                  }
                  if (var16Lifetime2 > 0 &&
                    dm.field_Zb < var16Lifetime2) {
                    var11 = 1;
                  }
                }
                if (param1) {
                  if (mb.field_k != null) {
                    if (null != mb.field_k[var7]) {
                      stackIn_200_0 = (!mb.field_k[var7][var9]) ? 0 : 1;
                    } else {
                      stackIn_200_0 = 0;
                    }
                  } else {
                    stackIn_200_0 = 0;
                  }
                } else {
                  stackIn_200_0 = 0;
                }
                var13 = stackIn_200_0;
              }
              if (kj.field_q >= 2 &&
                lc.field_m[12]) {
                var13 = 0;
                var10 = 0;
                var14 = 0;
                var11 = 0;
                var12 = 0;
              }
              dj.field_l = true;
              if (var10 == 0 &&
                var11 == 0 &&
                var12 == 0 &&
                var13 == 0) {
                if (var14 == 0) {
                  stackIn_212_0 = 0;
                } else {
                  stackIn_212_0 = 1;
                }
              } else {
                stackIn_212_0 = 1;
              }
              var16Lifetime1 = stackIn_212_0;
              if (var16Lifetime1 == 0 &&
                0 <= var9 &&
                null != iq.field_b && (!param1 ||
                !la.field_k)) {
                lp.field_p = false;
                if (null == rl.field_v) {
                  rl.field_v = new byte[kj.field_h];
                  ll.field_c = new boolean[kj.field_h];
                }
                dj.field_l = false;
                for (var17_int = 0; var17_int < var7; var17_int++) {
                  ll.field_c[var17_int] = false;
                }
                bh.a(-1712, var9, 0, param0, param1, var7, -1, -1);
                if (kj.field_q >= 2 &&
                  lc.field_m[12]) {
                  dj.field_l = true;
                }
                if (!dj.field_l) {
                  var16Lifetime1 = 1;
                }
              }
              var17 = var8_array[var9 + 1];
              if (var4_int != 0 &&
                0 != var17.field_T) {
                if (param1) {
                  if (-1 == var9) {
                    for (var18 = var6Lifetime4; var18 < var30.length + var6Lifetime4 - 1; var18++) {
                      tg.field_a[var18 / 8] = (byte)tq.b((int) tg.field_a[var18 / 8], ~(1 << tq.b(var18, 7)));
                    }
                  } else {
                    tg.field_a[(var6Lifetime4 + var9) / 8] = (byte)vg.a((int) tg.field_a[(var6Lifetime4 + var9) / 8], 1 << tq.b(var6Lifetime4 + var9, 7));
                  }
                } else {
                  if (var16Lifetime1 == 0 &&
                    param0.field_Zb[var7] != (byte)var9) {
                    var5 = 1;
                    param0.field_Zb[var7] = (byte)var9;
                  }
                }
              }
              if (param1 &&
                var16Lifetime1 != 0) {
                tg.field_a[(var9 + var6Lifetime4) / 8] = (byte)tq.b((int) tg.field_a[(var9 + var6Lifetime4) / 8], ~(1 << tq.b(var9 + var6Lifetime4, 7)));
              }
              if (var9 >= 0 &&
                var17.field_pb) {
                if (ul.field_m == null) {
                  var18_ref = null;
                } else {
                  if (null == ul.field_m[var7]) {
                    var18_ref = null;
                  } else {
                    var18_ref = ul.field_m[var7][var9];
                  }
                }
                if (kp.field_n != null) {
                  if (kp.field_n[var7] != null) {
                    var19 = kp.field_n[var7][var9];
                  } else {
                    var19 = null;
                  }
                } else {
                  var19 = null;
                }
                var20 = null;
                if (var19 != null &&
                  !((String) (var19)).equals(var18_ref)) {
                  var20 = var19;
                }
                var21 = null;
                if (var13 == 0) {
                  if (var10 == 0) {
                    if (var11 != 0) {
                      var22_int = r.field_c[var7][var9] - dm.field_Zb;
                      if (var22_int != 1) {
                        var21 = vl.a(sc.field_c, new String[]{Integer.toString(var22_int)}, 2);
                      } else {
                        var21 = uq.field_a;
                      }
                    }
                    if (var12 != 0) {
                      var31 = vl.a(dm.field_Rb, new String[]{Integer.toString(bc.field_e), Integer.toString(sd.field_G[var7][var9])}, 2);
                      var21 = var31;
                      var21 = var31;
                      if (var21 == null) {
                        var21 = var31;
                      } else {
                        var21 = (String) (var21) + "<br>" + var31;
                      }
                    }
                    if (var14 != 0) {
                      var22 = eb.field_L;
                      if (var15 > 0 &&
                        null != ki.field_o &&
                        var15 <= ki.field_o.length &&
                        null != ki.field_o[-1 + var15]) {
                        var22 = ki.field_o[-1 + var15][0];
                      }
                      if (var21 == null) {
                        var21 = var22;
                      } else {
                        var21 = (String) (var21) + "<br>" + (String) (var22);
                      }
                    }
                  } else {
                    var21 = fa.field_Ub;
                  }
                } else {
                  var21 = oj.field_H;
                }
                if (var4_int != 0 &&
                  !dj.field_l) {
                  var22 = null;
                  if (lp.field_p) {
                    var22 = "</col>" + gi.field_n + "<col=A00000>";
                    var25 = var22;
                    var22 = var25;
                    var25Lifetime1 = var22;
                    var22 = var25Lifetime1;
                    var21 = var22;
                  }
                  var23 = 0;
                  for (var24 = 0; var7 > var24; var24++) {
                    if (ll.field_c[var24]) {
                      var25_ref = "</col>" + cf.field_f[var24] + "<col=A00000>";
                      var22 = var25_ref;
                      var21 = var22;
                      var22 = var25_ref;
                      if (var22 != null) {
                        var22 = (String) (var22) + ", " + var25_ref;
                        var21 = var22;
                        var21 = var22;
                        var23 = 1;
                      } else {
                        var22 = var25_ref;
                      }
                    }
                  }
                  if (var23 != 0) {
                    var21 = kb.field_q + (String) (var22);
                  } else {
                    var21 = vl.a(io.field_a, new String[]{(String) (var22)}, 2);
                  }
                }
                if (var21 != null) {
                  var21 = "<col=A00000>" + (String) (var21);
                  var32 = sa.a((String) (var21), param3 + 123, "<br>", "<br><col=A00000>");
                  if (var20 == null) {
                    var20 = var32;
                  } else {
                    var20 = (String) (var20) + "<br>" + var32;
                  }
                }
                if (var20 != null) {
                  ui.field_j = (String) (var20);
                }
              }
              if (!param1) {
                boolean decompiledFrameRemainder0 = true;
                stackIn_323_0 = var17;
                if (dj.field_l) {
                  stackIn_321_1 = ~param0.field_Zb[var7];
                  stackIn_321_2 = (byte)var9;
                  stackIn_321_3 = -1;
                  if (stackIn_321_1 == (stackIn_321_2 ^ stackIn_321_3)) {
                    stackIn_324_1 = true;
                    decompiledFrameRemainder0 = false;
                  }
                }
                if (decompiledFrameRemainder0) {
                  stackIn_324_1 = false;
                }
                stackIn_323_0.field_Ab = stackIn_324_1;
              } else {
                if (var9 == -1) {
                  var17.field_Ab = true;
                  var27 = var6Lifetime4;
                  var18Lifetime1 = var27;
                  while (-1 + (var30.length + var6Lifetime4) > var27) {
                    stackIn_313_0 = var17;
                    stackIn_313_1 = var17.field_Ab;
                    stackIn_314_2 = ((tg.field_a[var27 / 8] & 1 << (7 & var27)) == 0);
                    stackIn_313_0.field_Ab = stackIn_313_1 & stackIn_314_2;
                    var27++;
                  }
                } else {
                  stackIn_317_0 = var17;
                  stackIn_318_1 = (0 != (tg.field_a[(var9 + var6Lifetime4) / 8] & 1 << (var6Lifetime4 + var9 & 7)));
                  stackIn_317_0.field_Ab = stackIn_318_1;
                }
              }
              stackIn_328_0 = var17;
              stackIn_329_1 = (var4_int != 0) && (var16Lifetime1 == 0);
              stackIn_328_0.field_Z = stackIn_329_1;
            }
            var6Lifetime4 = var6Lifetime4 + (od.field_Gb[var7] & 255);
          }
          if (var5 != 0) {
            if (param1) {
              return;
            }
            og.b(param2, 115);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_338_0 = var4;
          stackIn_338_1 = new StringBuilder().append("ld.KA(");
          if (param0 == null) {
            stackIn_339_2 = "null";
          } else {
            stackIn_339_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_338_0), ((StringBuilder) (Object) stackIn_338_1).append(stackIn_339_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    ld(long param0, cj param1, cj param2, cj param3, ld[] param4, int[] param5, String[] param6, char[] param7) {
        super(param0, param1);
        int var13 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        String var11 = null;
        String var12 = null;
        Object var14 = null;
        int var15 = 0;
        fm var17 = null;
        fm var18 = null;
        this.field_Tb = -1;
        try {
          this.field_Qb = param5;
          this.field_Pb = param7;
          this.field_Fb = param4;
          this.field_Ob = this.field_Qb.length;
          var17 = param3.field_yb;
          var18 = var17;
          this.field_Jb = var18.field_r + (var18.field_C + 2);
          this.field_Nb = this.field_Ob * this.field_Jb;
          this.field_Vb = 0;
          this.field_Gb = new mo[this.field_Ob];
          var11 = "<col=999999>";
          var12 = "</col>";
          for (var13 = 0; this.field_Ob > var13; var13++) {
            if (this.field_Pb[var13] > 0) {
              param6[var13] = var11 + hm.a(-81, this.field_Pb[var13]).toUpperCase() + ": " + var12 + param6[var13];
            }
            var14 = null;
            if (null != this.field_Fb[var13] ||
              -1 == this.field_Qb[var13]) {
              var14 = tb.field_v;
            }
            this.field_Gb[var13] = new mo(0L, param2, (cj) null, param3, (ja) (var14), param6[var13]);
            this.a((byte) 50, this.field_Gb[var13]);
            var15 = var17.a(param6[var13]);
            if (this.field_Vb < var15) {
              this.field_Vb = var15;
            }
          }
          this.field_Vb = this.field_Vb + (tb.field_v.field_z + 10);
          this.b(12, 11183);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_15_0 = var10;
          stackIn_15_1 = new StringBuilder().append("ld.<init>(").append(param0).append(',');
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
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param4 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param5 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param6 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param7 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final void b(int param0, int param1, int param2) {
        int var4_int = 0;
        mo var5;
        int var6;
        mo stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        ld var4;
        ld var7;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        for (var4_int = 0; this.field_Gb.length > var4_int; var4_int++) {
          var5 = this.field_Gb[var4_int];
          if (var5.field_T == 1) {
            this.a(-115, var4_int, param0, param2);
            stackIn_7_0 = var5;
            stackIn_8_1 = (var4_int == this.field_Tb);
            stackIn_7_0.field_Ab = stackIn_8_1;
          }
        }
        if (param1 != 255) {
          this.field_Ib = (ld) null;
        }
        if (this.field_Tb != -1) {
          var7 = this.field_Fb[this.field_Tb];
          var4 = var7;
          if (var4 != null) {
            var7.b(param0, 255, param2);
          }
        }
        if (this.field_Hb > 0) {
          this.b(this.field_Hb - 1, 11183);
        }
    }

    final static String a(byte param0, CharSequence param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        jh var3 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            var3 = (jh) null;
            ld.a((jh) null, false, 60, 111);
          }
          var2 = mc.a(cq.a(0, param1), (byte) 26);
          if (var2 == null) {
            var2 = "";
          }
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("ld.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7;
        int var8;
        int var9;
        int var7Lifetime1;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        this.field_Sb = param4 * 2 + this.field_Vb;
        this.a(this.field_Nb, param1 - this.field_Nb, this.field_Sb, param0, -3344);
        if (param2 >= -16) {
          field_Kb = -29L;
        }
        if (param5 != this.field_Mb) {
          this.field_Mb = param5;
          this.b(this.field_Hb, 11183);
        }
        for (var7 = 0; this.field_Ob > var7; var7++) {
          this.field_Gb[var7].a(param3, 2, this.field_Jb, this.field_Sb, 0, this.field_Gb[var7].field_Q, param4);
        }
        if (-1 != this.field_Tb &&
          this.field_Fb[this.field_Tb] != null) {
          var7Lifetime1 = this.field_Fb[this.field_Tb].field_Ob;
          for (var8 = this.field_Q + this.field_Jb * (var7Lifetime1 + this.field_Tb); param1 < var8; var8 = var8 - this.field_Jb) {
          }
          this.field_Fb[this.field_Tb].a(param0 + this.field_Sb, var8, -87, param3, param4, this.field_Gb[this.field_Tb].field_qb);
        }
    }

    final void c(byte param0) {
        int var3 = 0;
        mo var4 = null;
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        mo[] var6 = this.field_Gb;
        mo[] var2 = var6;
        if (param0 < 107) {
          this.a(31, 97, 11, 57);
        }
        for (var3 = 0; var6.length > var3; var3++) {
          var4 = var6[var3];
          var4.field_T = 0;
          var4.field_Ab = false;
        }
        if (this.field_Ib != null) {
          this.field_Ib.c((byte) 108);
          this.field_Ib.a(true);
        }
        this.field_Ib = null;
        this.field_Tb = -1;
        this.b(12, 11183);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7, int param8) {
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
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
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var17Lifetime2;
        var19 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param1 >= 0 &&
            param5 < ep.field_h) {
            if (param4 < 0 &&
              param6 < 0 &&
              0 > param3) {
              return;
            }
            if (ep.field_i <= param4 &&
              param6 >= ep.field_i &&
              ep.field_i <= param3) {
              return;
            }
            if (param0 != -12628) {
              return;
            }
            var14 = param1 - param5;
            if (param5 == param2) {
              if (param1 == param5) {
                var11 = 0;
                var10 = param6 << 16;
                var12 = 0;
                var9_int = param4 << 16;
              } else {
                var15 = -param2 + param1;
                if (param6 > param4) {
                  var10 = param6 << 16;
                  var12 = (param3 - param6 << 16) / var15;
                  var11 = (param3 - param4 << 16) / var14;
                  var9_int = param4 << 16;
                } else {
                  var10 = param4 << 16;
                  var11 = (-param6 + param3 << 16) / var15;
                  var12 = (-param4 + param3 << 16) / var14;
                  var9_int = param6 << 16;
                }
              }
              var13 = 0;
              if (0 > param5) {
                param5 = Math.min(-param5, -param5 + param2);
                var10 = var10 + var12 * param5;
                var9_int = var9_int + var11 * param5;
                param5 = 0;
              }
            } else {
              var10 = param4 << 16;
              var9_int = param4 << 16;
              var15 = -param5 + param2;
              var11 = (param6 - param4 << 16) / var15;
              var12 = (-param4 + param3 << 16) / var14;
              if (var11 >= var12) {
                var16 = var11;
                var11 = var12;
                var12 = var16;
                var13 = 1;
              } else {
                var13 = 0;
              }
              boolean decompiledFrameRemainder0 = true;
              if (0 > param5) {
                if (param2 < 0) {
                  param5 = param2 - param5;
                  var9_int = var9_int + param5 * var11;
                  var10 = var10 + var12 * param5;
                  param5 = param2;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param5 = -param5;
                  var9_int = var9_int + var11 * param5;
                  var10 = var10 + var12 * param5;
                  param5 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var16Lifetime2 = ep.field_a[param5];
                while (param5 < param2) {
                  var17 = var9_int >> 16;
                  if (var17 < ep.field_i) {
                    var18 = -(var9_int >> 16) + (var10 >> 16);
                    if (var18 != 0) {
                      if (ep.field_i <= var18 + var17) {
                        var18 = -1 - var17 + ep.field_i;
                      }
                      if (var17 < 0) {
                        so.a(param7, true, var16Lifetime2, var18 + var17, param8);
                      } else {
                        so.a(param7, true, var17 + var16Lifetime2, var18, param8);
                      }
                    } else {
                      if (0 <= var17 &&
                        ep.field_i > var17) {
                        so.a(param7, true, var16Lifetime2 + var17, var18, param8);
                      }
                    }
                  }
                  param5++;
                  if (param5 >= ep.field_h) {
                    return;
                  }
                  var9_int = var9_int + var11;
                  var16Lifetime2 = var16Lifetime2 + oo.field_b;
                  var10 = var10 + var12;
                }
              }
              var16Lifetime3 = param1 - param2;
              if (var16Lifetime3 != 0) {
                var17Lifetime2 = param3 << 16;
                if (var13 != 0) {
                  var10 = param6 << 16;
                } else {
                  var9_int = param6 << 16;
                }
                var11 = (var17Lifetime2 - var9_int) / var16Lifetime3;
                var12 = (-var10 + var17Lifetime2) / var16Lifetime3;
              } else {
                var12 = 0;
                var11 = 0;
              }
            }
            if (param5 < 0) {
              param5 = -param5;
              var10 = var10 + var12 * param5;
              var9_int = var9_int + param5 * var11;
              param5 = 0;
            }
            var15Lifetime1 = ep.field_a[param5];
            while (param1 > param5) {
              var16Lifetime1 = var9_int >> 16;
              if (var16Lifetime1 < ep.field_i) {
                var17Lifetime1 = (var10 >> 16) - (var9_int >> 16);
                if (0 != var17Lifetime1) {
                  if (var16Lifetime1 + var17Lifetime1 >= ep.field_i) {
                    var17Lifetime1 = -1 - var16Lifetime1 + ep.field_i;
                  }
                  if (var16Lifetime1 >= 0) {
                    so.a(param7, true, var15Lifetime1 + var16Lifetime1, var17Lifetime1, param8);
                  } else {
                    so.a(param7, true, var15Lifetime1, var17Lifetime1 + var16Lifetime1, param8);
                  }
                } else {
                  if (var16Lifetime1 >= 0 &&
                    var16Lifetime1 < ep.field_i) {
                    so.a(param7, true, var16Lifetime1 + var15Lifetime1, var17Lifetime1, param8);
                  }
                }
              }
              param5++;
              if (ep.field_h <= param5) {
                return;
              }
              var9_int = var9_int + var11;
              var15Lifetime1 = var15Lifetime1 + oo.field_b;
              var10 = var10 + var12;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_80_0 = var9;
          stackIn_80_1 = new StringBuilder().append("ld.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param8).append(')').toString());
        }
    }

    final boolean k(int param0) {
        int var4 = 0;
        mo var5 = null;
        int var6 = ZombieDawnMulti.field_E ? 1 : 0;
        int var2 = 0;
        if (param0 != -26899) {
          return false;
        }
        mo[] var3 = this.field_Gb;
        for (var4 = 0; var3.length > var4; var4++) {
          var5 = var3[var4];
          var2 = var2 | (0 != var5.field_T ? 1 : 0);
        }
        if (var2 == 0 &&
          this.field_Tb != -1 &&
          null != this.field_Fb[this.field_Tb]) {
          var2 = this.field_Fb[this.field_Tb].k(param0 + 0) ? 1 : 0;
        }
        return var2 != 0;
    }

    public static void h(int param0) {
        field_Lb = null;
        field_Rb = null;
        if (param0 >= -104) {
          jh var2 = (jh) null;
          ld.a((jh) null, false, 77, -3);
        }
        field_Ub = null;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        String var8;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 > -93) {
          this.field_Fb = (ld[]) null;
        }
        if (param1 == this.field_Tb) {
          this.c((byte) 127);
          this.b(0, 11183);
        } else {
          if (this.field_Fb[param1] != null) {
            this.c((byte) 119);
            this.b(0, 11183);
            this.field_Tb = param1;
            this.field_Ib = this.field_Fb[this.field_Tb];
            an.a((byte) 75, this.field_Ib);
            this.field_Ib.b(12, 11183);
          } else {
            if (this.field_Qb[param1] == -1) {
              qd.c(4024);
              fh.b(31706);
            } else {
              var5 = 32768 | this.field_Qb[param1];
              var6 = va.field_a;
              if (var6 == 0 &&
                mh.field_c != null) {
                var6 = 1;
              }
              if (ga.a(var6, true) == 2) {
                kp.a(var6, param3, 1, true);
              }
              var8 = (String) null;
              kb.a(var5, qf.field_g, param2, (String) null, va.field_a, 29602);
              ii.a(va.field_a, (byte) -128, var5, qf.field_g, jj.field_M);
              fh.b(31706);
              lh.a(true);
            }
          }
        }
    }

    final boolean a(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int stackIn_3_0 = 0;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        stackIn_3_0 = (sj.field_p != 85) ? 0 : 1;
        var4 = stackIn_3_0;
        if (this.field_Ib != null) {
          if (var4 != 0 &&
            -1 == this.field_Ib.field_Tb) {
            this.c((byte) 110);
            this.b(0, 11183);
            return true;
          }
          return this.field_Ib.a(-119, param1, param2);
        }
        if (null == this.field_Ib &&
          mj.field_Ib == this &&
          var4 != 0) {
          fh.b(31706);
          return true;
        }
        var5 = pn.field_d;
        var6 = -52 / ((param0 - 38) / 52);
        if (var5 > 0) {
          if (wc.field_I == var5) {
            var5 = 63;
          }
          var7 = 0;
          while (var7 < this.field_Pb.length) {
            if (this.field_Pb[var7] != var5) {
              var7++;
              continue;
            }
            this.a(-105, var7, param1, param2);
            return true;
          }
        }
        return false;
    }

    final static void j(int param0) {
        q.b(72);
        if (param0 != 1481707568) {
          field_Kb = -107L;
        }
        bc.b(10);
        bk.field_i = null;
        fh.b(param0 - 1481675862);
    }

    static {
        field_Rb = new lf();
        field_Lb = "Buying or selling an account";
    }
}
