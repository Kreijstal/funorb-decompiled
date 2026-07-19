/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jb extends RuntimeException {
    Throwable field_e;
    static vg[] field_g;
    static tb field_j;
    static int field_d;
    static w field_f;
    String field_i;
    static String field_h;
    static boolean field_a;
    static byte[] field_b;
    static int field_c;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, String param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              k.field_a.field_Y = param7;
              if (2 != pk.field_r) {
                bf.field_v.field_Y = km.field_B;
                break L1;
              } else {
                bf.field_v.field_Y = of.field_b;
                if (!client.field_A) {
                  break L1;
                } else {
                  bf.field_v.field_Y = km.field_B;
                  break L1;
                }
              }
            }
            var9_int = 495;
            var11 = -66 % ((14 - param2) / 34);
            var10 = 5;
            hm.field_b.a(var9_int + -10, 0, var10, param6, 5);
            wj.field_Mb.a(hm.field_b.field_mb - field_f.field_mb, 0, 0, param6, 0);
            var10 = var10 + (param6 + param8);
            field_f.a(field_f.field_mb, 0, 0, param6, wj.field_Mb.field_mb);
            ve.field_vc.a(ve.field_vc.a(true), 0, var10, param5, 5);
            var12 = bf.field_v.a(true);
            bf.field_v.a(var12, 0, var10, param5, -5 + (var9_int - var12));
            k.field_a.a(var9_int, 0, 0, param0, 0);
            var13 = 5 + (param5 + var10);
            ib.field_mb.a(var9_int, 0, param0, var13, 0);
            ib.field_mb.field_lb = ea.a(2105376, -20982, 3, ib.field_mb.field_N, 8421504, 11579568);
            var13 = var13 + param0;
            tf.field_gb.a(var9_int, 0, -(var13 / 2) + param1, var13, -(var9_int / 2) + param4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var9 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var9);
            stackOut_7_1 = new StringBuilder().append("jb.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param7 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param8 + ')');
        }
    }

    final static void a(String param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 45) {
                break L1;
              } else {
                jb.a((byte) 96);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("jb.F(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, String param1) {
        int var2_int = 0;
        int var3 = 0;
        int var5 = 0;
        int var6 = 0;
        try {
            ve.field_Qb = true;
            f.field_n.field_Y = param1;
            var2_int = le.field_m.field_g;
            int var4 = 66 / ((param0 - 29) / 46);
            var3 = le.field_m.field_i;
            var5 = f.field_n.field_J.b(param1, 272, f.field_n.field_Db);
            var6 = 7 + var3 / 2 + (-110 - var5 / 2);
            tc.field_Ob.a(320, 0, var6, -(var6 * 2) + -120 + var3, (var2_int + -320) / 2);
            tc.field_Ob.field_lb = ea.a(2105376, -20982, 3, tc.field_Ob.field_N, 8421504, 11579568);
            f.field_n.a(tc.field_Ob.field_mb - 24 + -24, 0, 16, tc.field_Ob.field_N - 20 - 24, 24);
            ce.field_A.a(80, 0, -44 + tc.field_Ob.field_N, 24, 120);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "jb.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static char a(byte param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        var2 = param0 & 255;
        if (0 == var2) {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        } else {
          if ((var2 ^ -1) <= -129) {
            if (160 <= var2) {
              var3 = -109 / ((param1 - 41) / 35);
              return (char)var2;
            } else {
              L0: {
                var3 = nh.field_l[var2 - 128];
                if (var3 == 0) {
                  var3 = 63;
                  break L0;
                } else {
                  break L0;
                }
              }
              var2 = var3;
              var3 = -109 / ((param1 - 41) / 35);
              return (char)var2;
            }
          } else {
            var3 = -109 / ((param1 - 41) / 35);
            return (char)var2;
          }
        }
    }

    final static ij a(java.applet.Applet param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        ij[] var3 = null;
        int var4 = 0;
        ij var5 = null;
        int var6 = 0;
        ij stackIn_3_0 = null;
        ij stackIn_9_0 = null;
        ij stackIn_12_0 = null;
        ij stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ij stackOut_8_0 = null;
        ij stackOut_11_0 = null;
        ij stackOut_14_0 = null;
        ij stackOut_2_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            var2 = wd.a(param0, (byte) -1, "jagex-last-login-method");
            if (var2 != null) {
              L1: {
                var3 = oc.a((byte) 27);
                if (param1 == -10314) {
                  break L1;
                } else {
                  field_d = -54;
                  break L1;
                }
              }
              var4 = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (var4 >= var3.length) {
                      break L4;
                    } else {
                      var5 = var3[var4];
                      stackOut_8_0 = (ij) (var5);
                      stackIn_15_0 = stackOut_8_0;
                      stackIn_9_0 = stackOut_8_0;
                      if (var6 != 0) {
                        break L3;
                      } else {
                        if (((ij) (Object) stackIn_9_0).a(var2, -39)) {
                          stackOut_11_0 = (ij) (var5);
                          stackIn_12_0 = stackOut_11_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          var4++;
                          if (var6 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  stackOut_14_0 = hn.field_c;
                  stackIn_15_0 = stackOut_14_0;
                  break L3;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = hn.field_c;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var2_ref);
            stackOut_16_1 = new StringBuilder().append("jb.G(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    public static void a(byte param0) {
        field_h = null;
        field_g = null;
        field_j = null;
        if (param0 != -9) {
          field_a = false;
          field_f = null;
          field_b = null;
          return;
        } else {
          field_f = null;
          field_b = null;
          return;
        }
    }

    final static void a(w param0, w param1, w param2, int param3, w param4) {
        RuntimeException var5 = null;
        String var5_ref = null;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (null != kf.field_Q) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                L2: {
                  jg.field_i = false;
                  if (wc.field_n) {
                    break L2;
                  } else {
                    L3: {
                      if (wl.field_p) {
                        break L3;
                      } else {
                        var5_ref = df.field_S;
                        if (var6 == 0) {
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var5_ref = ln.field_e;
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var5_ref = vg.field_s;
                break L1;
              }
              L4: {
                var7 = (String) null;
                cl.a((String) null, 0, ij.field_c, var5_ref, -24503);
                wj.field_Mb.field_rb = ((fj.field_g.field_rb & 16711422) >> 1584730369) + -(8355711 & ij.field_c >> 22503841) + ij.field_c;
                wj.field_Mb.field_fb = ij.field_c + (-(8355711 & ij.field_c >> -1451362751) + ((16711423 & fj.field_g.field_fb) >> 1099046881));
                kf.field_Q = wj.field_Mb;
                wj.field_Mb.field_Bb = ij.field_c - (((ij.field_c & 16711423) >> 729335969) - (8355711 & fj.field_g.field_Bb >> -1665413055));
                jf.field_e = field_f;
                tf.field_gb = new w(0L, param4);
                k.field_a = new w(0L, param0);
                ib.field_mb = new w(0L, (w) null);
                hm.field_b = new w(0L, param2);
                wj.field_Mb = new w(0L, param1);
                wj.field_Mb.field_J = ff.field_o;
                hm.field_b.a(wj.field_Mb, -16834);
                field_f = new w(0L, jf.field_e);
                hm.field_b.a(field_f, -16834);
                ve.field_vc = new w(0L, fj.field_g, pg.field_g);
                bf.field_v = new w(0L, fj.field_g);
                tf.field_gb.a(k.field_a, -16834);
                if (param3 < -32) {
                  break L4;
                } else {
                  field_j = (tb) null;
                  break L4;
                }
              }
              tf.field_gb.a(ib.field_mb, -16834);
              ib.field_mb.a(hm.field_b, -16834);
              ib.field_mb.a(ve.field_vc, -16834);
              ib.field_mb.a(bf.field_v, -16834);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var5);
            stackOut_13_1 = new StringBuilder().append("jb.E(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          L7: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          L8: {
            stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param3).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param4 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    jb(Throwable param0, String param1) {
        this.field_e = param0;
        this.field_i = param1;
    }

    static {
        field_d = 500;
        field_j = new tb();
        field_h = "Previous";
        field_b = new byte[520];
    }
}
