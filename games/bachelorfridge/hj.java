/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj extends td {
    static sna field_p;

    final static cj a(byte param0, lu param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        lc stackIn_1_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -55 % ((-47 - param0) / 55);
          stackIn_1_0 = new lc(param1);
          return (cj) ((Object) stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_5_0 = var2;
          stackIn_5_1 = new StringBuilder().append("hj.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final static nea b(int param0, int param1, boolean param2) {
        nea stackIn_3_0 = null;
        sga stackIn_7_0;
        int stackIn_7_1;
        int stackIn_7_2;
        int stackIn_7_3;
        boolean stackIn_8_4 = false;
        nea stackIn_12_0 = null;
        sna stackIn_35_0 = null;
        String stackIn_36_1 = null;
        sna stackIn_39_0 = null;
        String stackIn_40_1 = null;
        int stackIn_44_0 = 0;
        Object stackIn_91_0 = null;
        Object stackIn_104_0 = null;
        RuntimeException decompiledCaughtException = null;
        nea stackOut_11_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        eaa var4 = null;
        Object var5 = null;
        Object var6 = null;
        nea var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        ik var17 = null;
        String var18 = null;
        int var19 = 0;
        ik var17Lifetime1;
        String var18Lifetime1;
        var19 = BachelorFridge.field_y;
        try {
          if (param0 != 0) {
            stackIn_3_0 = (nea) null;
            return stackIn_3_0;
          }
          stackIn_7_0 = rba.field_a.field_xb;
          stackIn_7_1 = rg.field_h + 2;
          stackIn_7_2 = 2;
          stackIn_7_3 = (rg.field_h * 3 + 6) * param1;
          stackIn_8_4 = (bga.field_m == rba.field_a.field_xb);
          boolean decompiledFrameRemainder0 = true;
          var3_int = ((sga) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_7_2, stackIn_7_3, stackIn_8_4, param2, true) ? 1 : 0;
          var4 = rba.field_a.field_wb.field_z;
          var5 = null;
          if (um.field_c == 2) {
            ov.field_d.field_u = true;
            kg.field_d.field_Z = lga.a(true, new String[]{sja.field_gb}, qg.field_c);
            rba.field_a.field_xb.field_wb.field_Z = null;
            var6 = null;
            var7 = (nea) (var4.b((byte) 90));
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (null == var7))) {
              var8 = 0;
              stackOut_11_0 = var7;
              stackIn_91_0 = stackOut_11_0;
              stackIn_12_0 = stackOut_11_0;
              if (var19 == 0) {
                if (stackIn_12_0.field_z == null) {
                  var7.field_Db = new sna(0L, gi.field_c);
                  var7.a(~param0, var7.field_Db);
                  var7.field_Eb = new sna(0L, wv.field_l);
                  var7.a(-1, var7.field_Eb);
                  var7.field_zb = new sna(0L, gi.field_c);
                  var7.a(-1, var7.field_zb);
                  var7.field_Eb.field_N = 2;
                  var8 = 1;
                  var7.d((byte) 121);
                }
                var7.field_sb = rba.field_a.field_wb.field_sb;
                var9 = 0;
                if (var7.field_vb != null) {
                  if (var7.field_vb == sja.field_gb) {
                    var10 = 52224;
                    var11 = 6750054;
                  } else {
                    var10 = 13421568;
                    var11 = 16777062;
                  }
                } else {
                  var10 = 13369344;
                  var11 = 16737894;
                }
                var12 = 0;
                if (var7.field_Ab != null &&
                  !var7.field_Ab.equals("")) {
                  var7.field_zb.field_ab = var11;
                  var7.field_zb.field_v = ln.field_x;
                  var12 = 1;
                  var7.field_zb.a(rg.field_h, 31407, 3 + ln.field_x.field_n, 0, var9);
                }
                var7.field_Eb.field_gb = var10;
                var7.field_Db.field_gb = var10;
                var7.field_Eb.field_w = var11;
                var7.field_Db.field_w = var11;
                var7.field_Eb.field_G = var11;
                var7.field_Db.field_G = var11;
                var7.field_Eb.field_ab = var11;
                var7.field_Db.field_ab = var11;
                var13 = 0;
                var14 = -82 + var7.field_sb;
                if (var12 != 0) {
                  var13 = ln.field_x.field_n + 3;
                  var14 = var14 - var13;
                }
                stackIn_35_0 = var7.field_Db;
                if (var14 > 0) {
                  stackIn_36_1 = po.a(var7.field_Db.field_jb, var7.field_xb, var14);
                } else {
                  stackIn_36_1 = var7.field_xb;
                }
                stackIn_35_0.field_Z = stackIn_36_1;
                var7.field_Db.a(rg.field_h, param0 + 31407, var14, var13, var9);
                stackIn_39_0 = var7.field_Eb;
                if (null != var7.field_vb) {
                  stackIn_40_1 = var7.field_vb;
                } else {
                  stackIn_40_1 = aka.field_y;
                }
                stackIn_39_0.field_Z = stackIn_40_1;
                var7.field_Eb.a(rg.field_h, 31407, 80, var7.field_sb - 80, var9);
                stackIn_44_0 = (var7.field_Db.field_Z.equals(var7.field_xb)) ? 0 : 1;
                var15 = stackIn_44_0;
                var9 = var9 + rg.field_h;
                if (var3_int == 0) {
                  var7.field_hb = var9 - var7.field_p;
                }
                if (var8 != 0) {
                  rba.field_a.field_wb.a(false, var7, (sna) (var6), 2);
                }
                var6 = var7;
                if (null != var7.field_zb &&
                  var7.field_zb.field_T) {
                  jja.field_m = var7.field_Ab;
                } else if (0 == var7.field_R) {
                  if (var7.field_Db.field_T &&
                    var15 != 0) {
                    jja.field_m = var7.field_xb;
                  }
                } else {
                  var16 = var7.field_xb;
                  mna.a(-1, (int[]) null, 0L, (String) null, var16, -1, -123, rba.field_a.field_xb, var7);
                  if (var7.field_vb != null &&
                    !sha.a((byte) -24, ms.field_u.field_j) &&
                    !hl.field_I) {
                    if (!sea.field_j) {
                      var17 = ms.field_u;
                      var18 = lga.a(true, new String[]{var16}, jv.field_m);
                      var17.field_a.a(var18, true, 8);
                    }
                    var17Lifetime1 = ms.field_u;
                    var18Lifetime1 = lga.a(true, new String[]{var16}, lga.field_i);
                    var17Lifetime1.field_a.a(var18Lifetime1, true, 18);
                  }
                  var5 = var7;
                }
                var7 = (nea) (var4.c(0));
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              if (rba.field_a.field_Ab.field_R != 0) {
                wh.field_p = new oa(rba.field_a.field_Ab.field_D, rba.field_a.field_Ab.field_M, rba.field_a.field_Ab.field_sb, rba.field_a.field_Ab.field_p, uea.field_g, kha.field_i, qs.field_m, qs.field_m);
                vaa.field_f = 0;
              }
              stackIn_91_0 = rba.field_a.field_yb;
            }
            if (((sna) (stackIn_91_0)).field_R != 0) {
              wh.field_p = new oa(rba.field_a.field_yb.field_D, rba.field_a.field_yb.field_M, rba.field_a.field_yb.field_sb, rba.field_a.field_yb.field_p, vc.field_f, kha.field_i, qs.field_m, qs.field_m);
              vaa.field_f = 1;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            kg.field_d.field_Z = fo.field_b;
            ov.field_d.field_u = false;
            if (um.field_c == 1) {
              rba.field_a.field_xb.field_wb.field_Z = ek.field_m;
              if (var19 != 0) {
                rba.field_a.field_xb.field_wb.field_Z = ema.field_Ab;
              }
            } else {
              rba.field_a.field_xb.field_wb.field_Z = ema.field_Ab;
            }
            nn.a((byte) -126, rba.field_a.field_wb);
          }
          stackIn_104_0 = var5;
          return (nea) (stackIn_104_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var3), "hj.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    hj(int param0, aga param1) {
        super(param0, param1);
    }

    final ii a(op param0, int param1) {
        aga var3 = null;
        RuntimeException var3_ref = null;
        l var4 = null;
        l stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 3) {
            field_p = (sna) null;
          }
          var3 = this.field_h.a(15, param0);
          var4 = new l(this.field_g, new nq(var3));
          stackIn_4_0 = var4;
          return (ii) ((Object) stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("hj.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void c(byte param0) {
        try {
          field_p = null;
          if (param0 >= -80) {
            field_p = (sna) null;
          }
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "hj.D(" + param0 + ')');
        }
    }

    static {
    }
}
