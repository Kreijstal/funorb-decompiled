/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cn {
    static bd field_a;
    static ko field_b;

    final static int a(String param0, int param1, int param2, boolean param3, sc param4, int param5, sc param6) {
        int var12 = 0;
        int stackIn_5_0 = 0;
        we stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        String stackIn_14_2 = null;
        we stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        String stackIn_17_2 = null;
        int stackIn_33_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        String var11_ref_StringLifetime1;
        String var11_ref_StringLifetime2;
        int var10Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        var13 = Pixelate.field_H ? 1 : 0;
        try {
          var14 = param6.a(-30491);
          var11_ref_String = var14;
          var8 = param4.a(-30491);
          var11_ref_StringLifetime1 = var8;
          if (null == sh.field_e &&
            !wb.a(0, false)) {
            stackIn_5_0 = -1;
            return stackIn_5_0;
          }
          if (param2 >= -121) {
            field_a = (bd) null;
          }
          if (uk.field_s == ij.field_o) {
            aa.field_f.field_m = 0;
            kj.field_j = null;
            if (param0 != null) {
              var9 = 0;
              uk.field_v.field_m = 0;
              if (param3) {
                var9 = var9 | 1;
              }
              uk.field_v.d(ai.field_d.nextInt(), -49);
              uk.field_v.d(ai.field_d.nextInt(), -62);
              uk.field_v.a((byte) -66, var14);
              uk.field_v.a((byte) -66, var8);
              var15 = (CharSequence) ((Object) param0);
              uk.field_v.a((byte) -66, la.a((byte) 10, var15));
              uk.field_v.b(1276387944, param1);
              uk.field_v.e(160, param5);
              uk.field_v.e(160, var9);
              aa.field_f.e(160, 18);
              aa.field_f.field_m = aa.field_f.field_m + 2;
              var10 = aa.field_f.field_m;
              var11_ref_StringLifetime2 = ln.a(ao.a(13867), (byte) -85);
              if (var11_ref_StringLifetime2 == null) {
                var11_ref_StringLifetime2 = "";
              }
              aa.field_f.b((byte) -41, var11_ref_StringLifetime2);
              wh.a(ag.field_m, aa.field_f, tp.field_t, uk.field_v, 12556);
              aa.field_f.c(7519, aa.field_f.field_m - var10);
            } else {
              uk.field_v.field_m = 0;
              uk.field_v.d(ai.field_d.nextInt(), -90);
              uk.field_v.d(ai.field_d.nextInt(), -68);
              stackIn_13_0 = uk.field_v;
              stackIn_13_1 = -66;
              if (!param6.b((byte) -25)) {
                stackIn_14_2 = "";
              } else {
                stackIn_14_2 = var14;
              }
              ((we) (Object) stackIn_13_0).a((byte) stackIn_13_1, stackIn_14_2);
              stackIn_16_0 = uk.field_v;
              stackIn_16_1 = -66;
              if (param4.b((byte) 127)) {
                stackIn_17_2 = var8;
              } else {
                stackIn_17_2 = "";
              }
              ((we) (Object) stackIn_16_0).a((byte) stackIn_16_1, stackIn_17_2);
              aa.field_f.e(160, 16);
              aa.field_f.field_m = aa.field_f.field_m + 1;
              var9 = aa.field_f.field_m;
              wh.a(ag.field_m, aa.field_f, tp.field_t, uk.field_v, 12556);
              aa.field_f.f(aa.field_f.field_m - var9, -1);
            }
            vg.b(-1, 10000);
            uk.field_s = mn.field_c;
          }
          if (mn.field_c == uk.field_s &&
            rd.a(1, false)) {
            var9Lifetime1 = vi.field_o.f(255);
            vi.field_o.field_m = 0;
            if (var9Lifetime1 >= 100 &&
              var9Lifetime1 <= 105) {
              ii.field_y = new String[-100 + var9Lifetime1];
              uk.field_s = c.field_Z;
            } else {
              if (248 == var9Lifetime1) {
                ql.a(ao.a(13867), -7624);
                gi.field_b = ph.field_m;
                na.a(true);
                qj.field_b = false;
                stackIn_33_0 = var9Lifetime1;
                return stackIn_33_0;
              }
              if (var9Lifetime1 != 99) {
                mn.field_e = var9Lifetime1;
                uk.field_s = bg.field_l;
                jj.field_b = -1;
              } else {
                rd.a(wl.a(23062), false);
                kj.field_j = new Boolean(rn.a((byte) 107, vi.field_o));
                vi.field_o.field_m = 0;
              }
            }
          }
          if (uk.field_s == c.field_Z) {
            var9Lifetime2 = 2;
            if (rd.a(var9Lifetime2, false)) {
              var10Lifetime1 = vi.field_o.a((byte) 82);
              vi.field_o.field_m = 0;
              if (rd.a(var10Lifetime1, false)) {
                var11 = ii.field_y.length;
                for (var12 = 0; var12 < var11; var12++) {
                  ii.field_y[var12] = vi.field_o.e(122);
                }
                na.a(true);
                qj.field_b = false;
                stackIn_45_0 = 100 + var11;
                return stackIn_45_0;
              }
            }
          }
          if (uk.field_s == bg.field_l &&
            in.e(-18481)) {
            if (mn.field_e == 255) {
              var9_ref_String = vi.field_o.e((byte) 40);
              if (var9_ref_String != null) {
                rd.a(var9_ref_String, 126, ao.a(13867));
              }
            } else {
              gi.field_b = vi.field_o.h(5);
            }
            na.a(true);
            qj.field_b = false;
            stackIn_56_0 = mn.field_e;
            return stackIn_56_0;
          }
          if (sh.field_e == null) {
            if (qj.field_b) {
              if (no.d(8) > 30000L) {
                gi.field_b = vc.field_N;
              } else {
                gi.field_b = ho.field_b;
              }
              qj.field_b = false;
              stackIn_64_0 = 249;
              return stackIn_64_0;
            }
            var9Lifetime3 = gd.field_g;
            gd.field_g = cd.field_b;
            cd.field_b = var9Lifetime3;
            qj.field_b = true;
          }
          stackIn_66_0 = -1;
          return stackIn_66_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_69_0 = var7;
          stackIn_69_1 = new StringBuilder().append("cn.D(");
          if (param0 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          stackIn_72_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_75_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 > -42) {
          field_a = (bd) null;
        }
        field_b = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int[] param5, boolean param6, int param7, int param8) {
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
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
        var19 = Pixelate.field_H ? 1 : 0;
        try {
          if (param2 >= 0 &&
            ja.field_e > param8) {
            if (0 > param7 &&
              param0 < 0 &&
              0 > param4) {
              return;
            }
            if (ja.field_d <= param7 &&
              ja.field_d <= param0 &&
              ja.field_d <= param4) {
              return;
            }
            if (param6) {
              field_a = (bd) null;
            }
            var14 = param2 - param8;
            if (param1 != param8) {
              var10 = param7 << 16;
              var9_int = param7 << 16;
              var15 = param1 - param8;
              var12 = (param4 - param7 << 16) / var14;
              var11 = (-param7 + param0 << 16) / var15;
              if (var11 >= var12) {
                var16 = var11;
                var11 = var12;
                var12 = var16;
                var13 = 1;
              } else {
                var13 = 0;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param8 < 0) {
                if (param1 < 0) {
                  param8 = -param8 + param1;
                  var9_int = var9_int + var11 * param8;
                  var10 = var10 + param8 * var12;
                  param8 = param1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param8 = -param8;
                  var9_int = var9_int + var11 * param8;
                  var10 = var10 + var12 * param8;
                  param8 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var16Lifetime2 = ja.field_g[param8];
                while (param8 < param1) {
                  var17 = var9_int >> 16;
                  if (var17 < ja.field_d) {
                    var18 = (var10 >> 16) - (var9_int >> 16);
                    if (0 == var18) {
                      if (var17 >= 0 &&
                        var17 < ja.field_d) {
                        eg.a(var18, 1022226145, var17 + var16Lifetime2, param5, param3);
                      }
                    } else {
                      if (var17 + var18 >= ja.field_d) {
                        var18 = -1 + (-var17 + ja.field_d);
                      }
                      if (0 <= var17) {
                        eg.a(var18, 1022226145, var16Lifetime2 + var17, param5, param3);
                      } else {
                        eg.a(var17 + var18, 1022226145, var16Lifetime2, param5, param3);
                      }
                    }
                  }
                  param8++;
                  if (ja.field_e <= param8) {
                    return;
                  }
                  var16Lifetime2 = var16Lifetime2 + t.field_j;
                  var10 = var10 + var12;
                  var9_int = var9_int + var11;
                }
              }
              var16Lifetime3 = -param1 + param2;
              if (var16Lifetime3 == 0) {
                var12 = 0;
                var11 = 0;
              } else {
                var17Lifetime2 = param4 << 16;
                if (var13 != 0) {
                  var10 = param0 << 16;
                } else {
                  var9_int = param0 << 16;
                }
                var12 = (-var10 + var17Lifetime2) / var16Lifetime3;
                var11 = (-var9_int + var17Lifetime2) / var16Lifetime3;
              }
            } else {
              if (param2 == param8) {
                var9_int = param7 << 16;
                var10 = param0 << 16;
                var12 = 0;
                var11 = 0;
              } else {
                var15 = param2 - param1;
                if (param0 <= param7) {
                  var9_int = param0 << 16;
                  var12 = (-param7 + param4 << 16) / var14;
                  var11 = (param4 - param0 << 16) / var15;
                  var10 = param7 << 16;
                } else {
                  var10 = param0 << 16;
                  var11 = (param4 - param7 << 16) / var14;
                  var12 = (param4 - param0 << 16) / var15;
                  var9_int = param7 << 16;
                }
              }
              var13 = 0;
              if (param8 < 0) {
                param8 = Math.min(-param8, -param8 + param1);
                var10 = var10 + var12 * param8;
                var9_int = var9_int + param8 * var11;
                param8 = 0;
              }
            }
            if (param8 < 0) {
              param8 = -param8;
              var9_int = var9_int + param8 * var11;
              var10 = var10 + var12 * param8;
              param8 = 0;
            }
            var15Lifetime1 = ja.field_g[param8];
            while (param2 > param8) {
              var16Lifetime1 = var9_int >> 16;
              if (var16Lifetime1 < ja.field_d) {
                var17Lifetime1 = (var10 >> 16) - (var9_int >> 16);
                if (0 != var17Lifetime1) {
                  if (var17Lifetime1 + var16Lifetime1 >= ja.field_d) {
                    var17Lifetime1 = ja.field_d - var16Lifetime1 - 1;
                  }
                  if (var16Lifetime1 >= 0) {
                    eg.a(var17Lifetime1, 1022226145, var15Lifetime1 + var16Lifetime1, param5, param3);
                  } else {
                    eg.a(var17Lifetime1 + var16Lifetime1, 1022226145, var15Lifetime1, param5, param3);
                  }
                } else {
                  if (var16Lifetime1 >= 0 &&
                    ja.field_d > var16Lifetime1) {
                    eg.a(var17Lifetime1, 1022226145, var15Lifetime1 + var16Lifetime1, param5, param3);
                  }
                }
              }
              param8++;
              if (ja.field_e <= param8) {
                return;
              }
              var10 = var10 + var12;
              var15Lifetime1 = var15Lifetime1 + t.field_j;
              var9_int = var9_int + var11;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_76_0 = var9;
          stackIn_76_1 = new StringBuilder().append("cn.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_76_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    final static lc a(int param0, int param1, int param2, int param3) {
        int var5 = Pixelate.field_H ? 1 : 0;
        lc var4 = (lc) (rg.field_c.c(1504642273));
        while (var4 != null) {
          if (~param0 == ~var4.field_k) {
            return var4;
          }
          var4 = (lc) (rg.field_c.f(1504642273));
        }
        var4 = new lc();
        if (param3 > -16) {
          cn.a(59, -14, -85, -23);
        }
        var4.field_k = param0;
        var4.field_s = param2;
        rg.field_c.a(22125, var4);
        em.a((byte) -7, var4, param1);
        return var4;
    }

    static {
        field_a = new bd();
    }
}
