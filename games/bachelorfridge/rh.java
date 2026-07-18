/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh {
    static String field_a;

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param1 <= -122) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            var3_int = 0;
            var4 = vka.field_q;
            L2: while (true) {
              if (pt.field_a.length <= var3_int) {
                stackOut_13_0 = -1;
                stackIn_14_0 = stackOut_13_0;
                break L0;
              } else {
                L3: {
                  var5 = gn.field_l[var3_int];
                  if (var5 < 0) {
                    var4 = var4 + un.field_i;
                    break L3;
                  } else {
                    var6 = hka.a(true, true, pt.field_a[var3_int]);
                    var4 = var4 + raa.field_J;
                    var7 = sd.field_a - (var6 >> 1);
                    if (hha.a(jo.field_t - -(pba.field_r << 1), param2, var6 + (hna.field_k << 1), 1, var7 - hna.field_k, var4, param0)) {
                      stackOut_8_0 = var5;
                      stackIn_9_0 = stackOut_8_0;
                      return stackIn_9_0;
                    } else {
                      var4 = var4 + (raa.field_J + (pba.field_r << 1) + jo.field_t);
                      break L3;
                    }
                  }
                }
                var3_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3, "rh.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_14_0;
    }

    final static void a(int param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              var2 = param1.getParameter("username");
              if (var2 == null) {
                break L1;
              } else {
                var3 = (CharSequence) (Object) var2;
                if (0L != mp.a(var3, true)) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2_ref;
            stackOut_6_1 = new StringBuilder().append("rh.D(").append(19007).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_a = null;
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        sna var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        gs var9 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (saa.field_b <= eb.field_t) {
                break L1;
              } else {
                eb.field_t = eb.field_t + 1;
                break L1;
              }
            }
            L2: {
              if (hga.field_U.field_f == pda.field_p) {
                break L2;
              } else {
                fs.field_f = fs.field_f + (hga.field_U.field_f - pda.field_p);
                pda.field_p = hga.field_U.field_f;
                break L2;
              }
            }
            if (eb.field_t > 0) {
              L3: {
                iv.b(false);
                i.field_a.a(19842, param2);
                if (ao.field_d == null) {
                  break L3;
                } else {
                  if (hl.field_I) {
                    boolean discarded$1 = ao.field_d.a(param2, i.field_a.field_D, i.field_a.field_M, 6381);
                    break L3;
                  } else {
                    ao.field_d = null;
                    break L3;
                  }
                }
              }
              var4_int = 0;
              L4: while (true) {
                if (var4_int >= 5) {
                  L5: {
                    if (kg.field_a.field_R != 0) {
                      wt.field_n = new uq(kg.field_a.field_D, kg.field_a.field_M, kg.field_a.field_sb, kg.field_a.field_p, 0, qaa.field_d, mda.field_c, sm.field_s, qs.field_m, nr.field_v, dla.field_k, (String) null, 0L);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    var9 = iu.a(param0, (byte) 114, gba.field_Bb, rg.field_h);
                    if (var9 != null) {
                      om.a(var9, (byte) -111);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    var8 = gr.a(2);
                    if (var8 != null) {
                      jja.field_m = var8;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  break L0;
                } else {
                  L8: {
                    var5 = r.field_l[var4_int];
                    if (var5 != null) {
                      L9: {
                        if (0 == var5.field_R) {
                          break L9;
                        } else {
                          qca.a(var4_int, var5, (byte) 124);
                          break L9;
                        }
                      }
                      var6 = af.a(var4_int, 26291);
                      wg.field_i[var4_int].field_v = gi.field_b[var6];
                      bda.field_m[var4_int].field_Z = qo.field_a[var6];
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  var4_int++;
                  continue L4;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var4, "rh.C(" + param0 + ',' + 67 + ',' + param2 + ',' + 0 + ')');
        }
    }

    final static void a(boolean param0, eaa param1) {
        int var2_int = 0;
        int var3 = 0;
        kha var4 = null;
        int var5 = 0;
        int var6 = BachelorFridge.field_y;
        try {
            if (bp.e(-29919)) {
                throw new IllegalStateException();
            }
            sja.field_fb.c(80, (byte) 107);
            if (param0) {
                field_a = null;
            }
            sja.field_fb.field_g = sja.field_fb.field_g + 2;
            var2_int = sja.field_fb.field_g;
            sja.field_fb.field_g = sja.field_fb.field_g + 1;
            var3 = 0;
            var4 = (kha) (Object) param1.b((byte) 90);
            while (var4 != null) {
                sja.field_fb.d(var4.field_h, 0);
                var3++;
                sja.field_fb.d(var4.field_g, 0);
                var4 = (kha) (Object) param1.c(0);
            }
            var5 = sja.field_fb.field_g;
            sja.field_fb.field_g = var2_int;
            sja.field_fb.d(var3, 0);
            sja.field_fb.field_g = var5;
            sja.field_fb.a((byte) -88, -var2_int + sja.field_fb.field_g);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "rh.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "<%0> ready!";
    }
}
