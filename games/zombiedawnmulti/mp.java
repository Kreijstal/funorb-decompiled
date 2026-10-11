/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mp {
    static ak field_b;
    static String field_a;
    static String field_c;
    td[] field_e;
    static String field_d;

    final int a(int param0, int param1) {
        td[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        td var5 = null;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var3 = this.field_e;
          if (param0 != 52224) {
            stackIn_3_0 = -3;
            return stackIn_3_0;
          }
          var4 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var4 >= var3.length))) {
            var5 = var3[var4];
            stackIn_14_0 = ~param1;
            if (var6 == 0) {
              if (stackIn_14_0 > ~var5.field_e.length) {
                stackIn_11_0 = var5.field_e[param1];
                return stackIn_11_0;
              }
              param1 = param1 - (var5.field_e.length - 1);
              var4++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_14_0 = 0;
          }
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3_ref), "mp.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int fieldTemp$0 = 0;
        int var4_int = 0;
        try {
          pm.field_R.field_j = param0;
          pm.field_R.a(param0 ^ -108, 12);
          pm.field_R.b(-114, c.field_c.nextInt());
          pm.field_R.b(-118, c.field_c.nextInt());
          pm.field_R.a(123, param2);
          pm.field_R.a(-67, param1);
          pm.field_R.a(param3, (byte) -128);
          pm.field_R.a(tp.field_v, -2628, gn.field_L);
          ma.field_a.b((byte) -35, 18);
          fieldTemp$0 = ma.field_a.field_j + 1;
          ma.field_a.field_j = ma.field_a.field_j + 1;
          var4_int = fieldTemp$0;
          ma.field_a.a(pm.field_R.field_m, pm.field_R.field_j, 0, 126);
          ma.field_a.e(72, -var4_int + ma.field_a.field_j);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "mp.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int a(byte param0) {
        RuntimeException var2 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -111) {
            mp.a(68);
          }
          if (this.field_e != null &&
            this.field_e.length > 0) {
            stackIn_10_0 = this.field_e[this.field_e.length - 1].field_h - this.field_e[0].field_d;
          } else {
            stackIn_10_0 = 0;
          }
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "mp.A(" + param0 + ')');
        }
    }

    final static ml a(int param0, boolean param1, byte param2) {
        tq stackIn_4_0;
        int stackIn_4_1;
        boolean stackIn_4_2;
        int stackIn_4_3;
        boolean stackIn_5_4 = false;
        cj stackIn_34_0 = null;
        String stackIn_35_1 = null;
        cj stackIn_38_0 = null;
        String stackIn_39_1 = null;
        int stackIn_43_0 = 0;
        Object stackIn_101_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        th var4 = null;
        Object var5 = null;
        Object var6 = null;
        ml var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        jb var17 = null;
        String var18 = null;
        int var19 = 0;
        jb var17Lifetime1;
        String var18Lifetime1;
        var19 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          stackIn_4_0 = eg.field_B.field_Jb;
          stackIn_4_1 = 2;
          stackIn_4_2 = param1;
          stackIn_4_3 = 2 + jk.field_f;
          stackIn_5_4 = (eg.field_B.field_Jb == vc.field_d);
          boolean decompiledFrameRemainder0 = true;
          var3_int = ((tq) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_5_4, (jk.field_f * 3 + 6) * param0, -106) ? 1 : 0;
          var4 = eg.field_B.field_Ib.field_Cb;
          var5 = null;
          if (2 == ge.field_zb) {
            pa.field_O.field_Z = true;
            dp.field_b.field_wb = vl.a(kg.field_m, new String[]{ta.field_ob}, 2);
            eg.field_B.field_Jb.field_Jb.field_wb = null;
            var6 = null;
            var7 = (ml) (var4.c(42));
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (var7 == null))) {
              var8 = 0;
              if (var19 == 0) {
                if (null == var7.field_Cb) {
                  var7.field_Ib = new cj(0L, m.field_x);
                  var7.a((byte) 50, var7.field_Ib);
                  var7.field_Fb = new cj(0L, wc.field_H);
                  var7.a((byte) 50, var7.field_Fb);
                  var7.field_Gb = new cj(0L, m.field_x);
                  var7.a((byte) 50, var7.field_Gb);
                  var7.field_Fb.field_R = 2;
                  var7.f(-128);
                  var8 = 1;
                }
                var7.field_zb = eg.field_B.field_Ib.field_zb;
                var9 = 0;
                if (var7.field_Nb == null) {
                  var10 = 13369344;
                  var11 = 16737894;
                } else if (var7.field_Nb == ta.field_ob) {
                  var11 = 6750054;
                  var10 = 52224;
                } else {
                  var10 = 13421568;
                  var11 = 16777062;
                }
                var12 = 0;
                if (var7.field_Kb != null &&
                  !var7.field_Kb.equals("")) {
                  var7.field_Gb.field_rb = pa.field_T;
                  var7.field_Gb.field_ob = var11;
                  var7.field_Gb.a(jk.field_f, var9, 3 + pa.field_T.field_z, 0, -3344);
                  var12 = 1;
                }
                var7.field_Fb.field_ob = var11;
                var7.field_Ib.field_ob = var11;
                var7.field_Fb.field_M = var10;
                var7.field_Ib.field_M = var10;
                var7.field_Fb.field_Db = var11;
                var7.field_Ib.field_Db = var11;
                var7.field_Fb.field_xb = var11;
                var7.field_Ib.field_xb = var11;
                var13 = 0;
                var14 = -80 + (var7.field_zb - 2);
                if (var12 != 0) {
                  var13 = 3 + pa.field_T.field_z;
                  var14 = var14 - var13;
                }
                stackIn_34_0 = var7.field_Ib;
                if (0 >= var14) {
                  stackIn_35_1 = var7.field_Hb;
                } else {
                  stackIn_35_1 = fm.a(var7.field_Ib.field_yb, var7.field_Hb, var14);
                }
                stackIn_34_0.field_wb = stackIn_35_1;
                var7.field_Ib.a(jk.field_f, var9, var14, var13, -3344);
                stackIn_38_0 = var7.field_Fb;
                if (var7.field_Nb != null) {
                  stackIn_39_1 = var7.field_Nb;
                } else {
                  stackIn_39_1 = pi.field_c;
                }
                stackIn_38_0.field_wb = stackIn_39_1;
                var7.field_Fb.a(jk.field_f, var9, 80, -80 + var7.field_zb, -3344);
                stackIn_43_0 = (var7.field_Ib.field_wb.equals(var7.field_Hb)) ? 0 : 1;
                var15 = stackIn_43_0;
                var9 = var9 + jk.field_f;
                if (var3_int == 0) {
                  var7.field_I = var9 - var7.field_z;
                }
                if (var8 != 0) {
                  eg.field_B.field_Ib.a(2, var7, 1300, (cj) (var6));
                }
                if (var7.field_Gb == null ||
                  !var7.field_Gb.field_L) {
                  if (var7.field_T == 0) {
                    if (var7.field_Ib.field_L &&
                      var15 != 0) {
                      ui.field_j = var7.field_Hb;
                    }
                  } else {
                    var16 = var7.field_Hb;
                    ve.a(0L, param2 + 315, (String) null, eg.field_B.field_Jb, var16, var7, -1, (int[]) null, -1);
                    if (var7.field_Nb != null &&
                      !cq.a(pk.field_b.field_f, -124) &&
                      !nh.field_m) {
                      if (!sh.field_L) {
                        var17 = pk.field_b;
                        var18 = vl.a(jk.field_i, new String[]{var16}, 2);
                        var17.field_j.a((byte) -118, var18, 8);
                      }
                      var17Lifetime1 = pk.field_b;
                      var18Lifetime1 = vl.a(field_c, new String[]{var16}, param2 ^ -117);
                      var17Lifetime1.field_j.a((byte) -118, var18Lifetime1, 18);
                    }
                    var5 = var7;
                  }
                } else {
                  ui.field_j = var7.field_Kb;
                }
                var6 = var7;
                var7 = (ml) (var4.b(6));
                continue;
              }
              break;
            }
            if ((decompiledNaturalLoopExit0) &&
              (eg.field_B.field_Gb.field_T != 0)) {
              gi.field_i = new dk(eg.field_B.field_Gb.field_w, eg.field_B.field_Gb.field_qb, eg.field_B.field_Gb.field_zb, eg.field_B.field_Gb.field_z, ud.field_Z, kd.field_a, vo.field_m, vo.field_m);
              ic.field_e = 0;
            }
            if (eg.field_B.field_Hb.field_T != 0) {
              gi.field_i = new dk(eg.field_B.field_Hb.field_w, eg.field_B.field_Hb.field_qb, eg.field_B.field_Hb.field_zb, eg.field_B.field_Hb.field_z, fe.field_Q, kd.field_a, vo.field_m, vo.field_m);
              ic.field_e = 1;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            pa.field_O.field_Z = false;
            dp.field_b.field_wb = op.field_l;
            if (1 == ge.field_zb) {
              eg.field_B.field_Jb.field_Jb.field_wb = rg.field_D;
              if (var19 != 0) {
                eg.field_B.field_Jb.field_Jb.field_wb = hj.field_e;
              }
            } else {
              eg.field_B.field_Jb.field_Jb.field_wb = hj.field_e;
            }
            ob.a(eg.field_B.field_Ib, 41);
          }
          if (param2 != -119) {
            mp.a(81, true, (byte) -50);
          }
          stackIn_101_0 = var5;
          return (ml) (stackIn_101_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "mp.G(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int a(String param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var5_int = param1;
          var6 = 0;
          var7 = param0.length();
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var8 >= var7))) {
            var9 = param0.charAt(var8);
            stackIn_22_0 = 60;
            stackIn_22_1 = var9;
            if (var10 == 0) {
              if (stackIn_22_0 == stackIn_22_1) {
                var6 = 1;
              } else if (var9 == 62) {
                var6 = 0;
              } else {
                if (var6 == 0 &&
                  32 == var9) {
                  var5_int++;
                }
              }
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_22_0 = -1;
            stackIn_22_1 = ~var5_int;
          }
          if (stackIn_22_0 > stackIn_22_1) {
            stackIn_25_0 = (param3 - param2 << 8) / var5_int;
            return stackIn_25_0;
          }
          stackIn_27_0 = 0;
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_31_0 = var5;
          stackIn_31_1 = new StringBuilder().append("mp.F(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int a(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        td var4 = null;
        int var5 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param0 != -126) {
            this.b(-6);
          }
          var3_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (this.field_e.length <= var3_int))) {
            var4 = this.field_e[var3_int];
            stackIn_16_0 = ~param1;
            if (var5 == 0) {
              if (stackIn_16_0 > ~var4.field_e.length) {
                stackIn_13_0 = var3_int;
                return stackIn_13_0;
              }
              param1 = param1 - (var4.field_e.length - 1);
              var3_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_16_0 = this.field_e.length;
          }
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "mp.E(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        if (param0 != 12) {
          return;
        }
        try {
          field_b = null;
          field_d = null;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "mp.H(" + param0 + ')');
        }
    }

    final int b(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var7 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        td[] var3 = null;
        int var4 = 0;
        td var5 = null;
        int var6 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var2_int = -1;
          if (param0 < 20) {
            this.field_e = (td[]) null;
          }
          if (null != this.field_e) {
            var3 = this.field_e;
            var4 = 0;
            while (var3.length > var4) {
              var5 = var3[var4];
              if (null != var5) {
                var6 = var5.a(-27328);
                if (var6 > var2_int) {
                  var2_int = var6;
                }
              }
              var4++;
              if (var7 == 0) {
                continue;
              }
              break;
            }
          }
          stackIn_16_0 = var2_int;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "mp.B(" + param0 + ')');
        }
    }

    final int a(int param0, byte param1, int param2) {
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        td var6 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (null != this.field_e &&
            this.field_e.length != 0 &&
            param2 >= this.field_e[0].field_d) {
            if (param1 > 0) {
              stackIn_12_0 = -76;
              return stackIn_12_0;
            }
            if (this.field_e[this.field_e.length - 1].field_h < param2) {
              stackIn_15_0 = -1;
              return stackIn_15_0;
            }
            if (1 == this.field_e.length) {
              stackIn_20_0 = this.field_e[0].a(false, param0);
              return stackIn_20_0;
            }
            var4_int = 0;
            var5 = 0;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (var5 >= this.field_e.length))) {
              var6 = this.field_e[var5];
              stackIn_39_0 = param2;
              if (var8 == 0) {
                if (stackIn_39_0 >= var6.field_d &&
                  param2 <= var6.field_h) {
                  var7 = var6.a(false, param0);
                  if (-1 == var7) {
                    stackIn_34_0 = -1;
                    return stackIn_34_0;
                  }
                  stackIn_36_0 = var4_int + var7;
                  return stackIn_36_0;
                }
                var4_int = var4_int + (-1 + var6.field_e.length);
                var5++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              stackIn_39_0 = -1;
            }
            return stackIn_39_0;
          }
          stackIn_9_0 = -1;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "mp.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_a = "Waiting for <%0> to start the game...";
        field_c = "Send private Quick Chat to <%0>";
        field_b = new ak();
        field_d = "Open in popup window";
    }
}
