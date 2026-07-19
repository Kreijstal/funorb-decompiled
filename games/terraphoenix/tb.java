/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb extends uj {
    static String field_x;
    static String field_i;
    private il field_q;
    private int field_f;
    private rf field_h;
    private int field_A;
    private km field_j;
    private byte[] field_y;
    static String field_l;
    private int field_p;
    static double field_u;
    private wh field_s;
    private byte[] field_n;
    private ua field_m;
    private h field_r;
    private ua field_t;
    private boolean field_o;
    private int field_z;
    private boolean field_w;
    private jj field_v;
    private jj field_k;
    private boolean field_B;
    private long field_g;

    final byte[] a(int param0, int param1) {
        if (param1 >= -62) {
            return (byte[]) null;
        }
        rf var3 = this.a(0, param0, (byte) -97);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.b(true);
        var3.b((byte) 12);
        return var4;
    }

    final static void a(int param0, int param1, int param2) {
        nd.field_r = param0;
        ma.field_E = param2;
        if (param1 != 21361) {
            field_u = 0.05953700668806378;
        }
    }

    final static String a(int param0, String param1, java.applet.Applet param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            RuntimeException var3_ref2 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String stackIn_7_0 = null;
            Object stackIn_12_0 = null;
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
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            String stackOut_6_0 = null;
            Object stackOut_11_0 = null;
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
            var8 = Terraphoenix.field_V;
            try {
              L0: {
                try {
                  L1: {
                    var3 = (String) (cd.a((byte) -128, "getcookies", param2));
                    var4 = nc.a(14352, var3, ';');
                    var5 = 47 % ((param0 - -47) / 32);
                    var6 = 0;
                    L2: while (true) {
                      if (var6 >= var4.length) {
                        decompiledRegionSelector0 = 0;
                        break L1;
                      } else {
                        L3: {
                          var7 = var4[var6].indexOf('=');
                          if ((var7 ^ -1) > -1) {
                            break L3;
                          } else {
                            if (var4[var6].substring(0, var7).trim().equals(param1)) {
                              stackOut_6_0 = var4[var6].substring(1 + var7).trim();
                              stackIn_7_0 = stackOut_6_0;
                              decompiledRegionSelector0 = 1;
                              break L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                        var6++;
                        continue L2;
                      }
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var3_ref = decompiledCaughtException;
                    decompiledRegionSelector0 = 0;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  stackOut_11_0 = null;
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_13_0 = (RuntimeException) (var3_ref2);
                stackOut_13_1 = new StringBuilder().append("tb.G(").append(param0).append(',');
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                if (param1 == null) {
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
                if (param2 == null) {
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
              throw qk.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return (String) ((Object) stackIn_12_0);
            } else {
              return stackIn_7_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(String param0, gd param1, gd param2, boolean param3, int param4, byte param5, int param6) {
        boolean discarded$1 = false;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        int stackIn_8_0 = 0;
        dh stackIn_20_0 = null;
        dh stackIn_21_0 = null;
        dh stackIn_22_0 = null;
        String stackIn_22_1 = null;
        dh stackIn_23_0 = null;
        dh stackIn_24_0 = null;
        dh stackIn_25_0 = null;
        String stackIn_25_1 = null;
        int stackIn_36_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_70_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        dh stackOut_19_0 = null;
        dh stackOut_21_0 = null;
        String stackOut_21_1 = null;
        dh stackOut_20_0 = null;
        String stackOut_20_1 = null;
        dh stackOut_22_0 = null;
        dh stackOut_24_0 = null;
        String stackOut_24_1 = null;
        dh stackOut_23_0 = null;
        String stackOut_23_1 = null;
        int stackOut_35_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_69_0 = 0;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        var13 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (param5 == 96) {
                break L1;
              } else {
                field_u = 0.5936452060822851;
                break L1;
              }
            }
            L2: {
              var14 = param2.a(119);
              var8 = param1.a(param5 ^ 25);
              if (null == ig.field_e) {
                if (!le.a(false, (byte) 109)) {
                  stackOut_7_0 = -1;
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
            L3: {
              if (va.field_e == mh.field_a) {
                L4: {
                  ge.field_d = null;
                  di.field_l.field_k = 0;
                  if (param0 == null) {
                    L5: {
                      nc.field_c.field_k = 0;
                      nc.field_c.e(j.field_H.nextInt(), param5 + 8863);
                      nc.field_c.e(j.field_H.nextInt(), 8959);
                      stackOut_19_0 = nc.field_c;
                      stackIn_21_0 = stackOut_19_0;
                      stackIn_20_0 = stackOut_19_0;
                      if (!param2.c(1)) {
                        stackOut_21_0 = (dh) ((Object) stackIn_21_0);
                        stackOut_21_1 = "";
                        stackIn_22_0 = stackOut_21_0;
                        stackIn_22_1 = stackOut_21_1;
                        break L5;
                      } else {
                        stackOut_20_0 = (dh) ((Object) stackIn_20_0);
                        stackOut_20_1 = (String) (var14);
                        stackIn_22_0 = stackOut_20_0;
                        stackIn_22_1 = stackOut_20_1;
                        break L5;
                      }
                    }
                    L6: {
                      ((dh) (Object) stackIn_22_0).b(stackIn_22_1, -86);
                      stackOut_22_0 = nc.field_c;
                      stackIn_24_0 = stackOut_22_0;
                      stackIn_23_0 = stackOut_22_0;
                      if (param1.c(param5 ^ 97)) {
                        stackOut_24_0 = (dh) ((Object) stackIn_24_0);
                        stackOut_24_1 = (String) (var8);
                        stackIn_25_0 = stackOut_24_0;
                        stackIn_25_1 = stackOut_24_1;
                        break L6;
                      } else {
                        stackOut_23_0 = (dh) ((Object) stackIn_23_0);
                        stackOut_23_1 = "";
                        stackIn_25_0 = stackOut_23_0;
                        stackIn_25_1 = stackOut_23_1;
                        break L6;
                      }
                    }
                    ((dh) (Object) stackIn_25_0).b(stackIn_25_1, -105);
                    di.field_l.i(16, 59);
                    di.field_l.field_k = di.field_l.field_k + 1;
                    var9 = di.field_l.field_k;
                    ea.a(ga.field_o, nc.field_c, 0, dj.field_c, di.field_l);
                    di.field_l.j(di.field_l.field_k - var9, param5 + -215);
                    break L4;
                  } else {
                    L7: {
                      var9 = 0;
                      if (param3) {
                        var9 = var9 | 1;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      nc.field_c.field_k = 0;
                      nc.field_c.e(j.field_H.nextInt(), 8959);
                      nc.field_c.e(j.field_H.nextInt(), param5 + 8863);
                      nc.field_c.b(var14, -33);
                      nc.field_c.b(var8, -101);
                      var15 = (CharSequence) ((Object) param0);
                      nc.field_c.b(nh.a(-31621, var15), -34);
                      nc.field_c.h(-1564407352, param4);
                      nc.field_c.i(param6, -115);
                      nc.field_c.i(var9, -90);
                      di.field_l.i(18, param5 ^ 21);
                      di.field_l.field_k = di.field_l.field_k + 2;
                      var10 = di.field_l.field_k;
                      var11_ref_String = kf.a(param5 ^ -120, dg.a(false));
                      if (var11_ref_String == null) {
                        var11_ref_String = "";
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    di.field_l.a(var11_ref_String, 2295);
                    ea.a(ga.field_o, nc.field_c, param5 + -96, dj.field_c, di.field_l);
                    di.field_l.g(-var10 + di.field_l.field_k, -20125);
                    break L4;
                  }
                }
                bc.a(-1, param5 + -96);
                mh.field_a = ha.field_n;
                break L3;
              } else {
                break L3;
              }
            }
            L9: {
              if (mh.field_a == ha.field_n) {
                if (vc.a(param5 + -213, 1)) {
                  L10: {
                    var9 = mk.field_j.a(-16384);
                    mk.field_j.field_k = 0;
                    if (-101 < (var9 ^ -1)) {
                      break L10;
                    } else {
                      if ((var9 ^ -1) >= -106) {
                        te.field_a = new String[-100 + var9];
                        mh.field_a = tc.field_f;
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  if (var9 != 248) {
                    if (var9 != 99) {
                      mh.field_a = tf.field_d;
                      qh.field_d = -1;
                      qk.field_b = var9;
                      break L9;
                    } else {
                      discarded$1 = vc.a(-111, dc.b((byte) 30));
                      ge.field_d = new Boolean(cb.a(mk.field_j, 102));
                      mk.field_j.field_k = 0;
                      break L9;
                    }
                  } else {
                    ke.a(dg.a(false), (byte) 95);
                    bh.field_d = kj.field_e;
                    gb.g(-17464);
                    vj.field_Q = false;
                    stackOut_35_0 = var9;
                    stackIn_36_0 = stackOut_35_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L9;
                }
              } else {
                break L9;
              }
            }
            L11: {
              if (mh.field_a == tc.field_f) {
                var9 = 2;
                if (vc.a(-99, var9)) {
                  var10 = mk.field_j.i(-25578);
                  mk.field_j.field_k = 0;
                  if (vc.a(param5 ^ -32, var10)) {
                    var11 = te.field_a.length;
                    var12 = 0;
                    L12: while (true) {
                      if (var12 >= var11) {
                        gb.g(-17464);
                        vj.field_Q = false;
                        stackOut_50_0 = 100 + var11;
                        stackIn_51_0 = stackOut_50_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        te.field_a[var12] = mk.field_j.c((byte) 46);
                        var12++;
                        continue L12;
                      }
                    }
                  } else {
                    break L11;
                  }
                } else {
                  break L11;
                }
              } else {
                break L11;
              }
            }
            L13: {
              if (tf.field_d != mh.field_a) {
                break L13;
              } else {
                if (!cm.b((byte) -98)) {
                  break L13;
                } else {
                  L14: {
                    if ((qk.field_b ^ -1) != -256) {
                      bh.field_d = mk.field_j.e(-1);
                      break L14;
                    } else {
                      var9_ref_String = mk.field_j.j(-1915115064);
                      if (var9_ref_String != null) {
                        hk.a(var9_ref_String, (byte) 3, dg.a(false));
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                  }
                  gb.g(param5 ^ -17496);
                  vj.field_Q = false;
                  stackOut_59_0 = qk.field_b;
                  stackIn_60_0 = stackOut_59_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            }
            L15: {
              if (ig.field_e != null) {
                break L15;
              } else {
                if (vj.field_Q) {
                  L16: {
                    if (30000L < ce.b(1)) {
                      bh.field_d = qk.field_f;
                      break L16;
                    } else {
                      bh.field_d = cl.field_I;
                      break L16;
                    }
                  }
                  vj.field_Q = false;
                  stackOut_67_0 = 249;
                  stackIn_68_0 = stackOut_67_0;
                  decompiledRegionSelector0 = 4;
                  break L0;
                } else {
                  var9 = sb.field_i;
                  sb.field_i = pg.field_f;
                  pg.field_f = var9;
                  vj.field_Q = true;
                  break L15;
                }
              }
            }
            stackOut_69_0 = -1;
            stackIn_70_0 = stackOut_69_0;
            decompiledRegionSelector0 = 5;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var7 = decompiledCaughtException;
            stackOut_71_0 = (RuntimeException) (var7);
            stackOut_71_1 = new StringBuilder().append("tb.K(");
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param0 == null) {
              stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackOut_73_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L17;
            } else {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L17;
            }
          }
          L18: {
            stackOut_74_0 = (RuntimeException) ((Object) stackIn_74_0);
            stackOut_74_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(',');
            stackIn_76_0 = stackOut_74_0;
            stackIn_76_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param1 == null) {
              stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackOut_76_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L18;
            } else {
              stackOut_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackOut_75_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackOut_75_2 = "{...}";
              stackIn_77_0 = stackOut_75_0;
              stackIn_77_1 = stackOut_75_1;
              stackIn_77_2 = stackOut_75_2;
              break L18;
            }
          }
          L19: {
            stackOut_77_0 = (RuntimeException) ((Object) stackIn_77_0);
            stackOut_77_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_77_2).append(',');
            stackIn_79_0 = stackOut_77_0;
            stackIn_79_1 = stackOut_77_1;
            stackIn_78_0 = stackOut_77_0;
            stackIn_78_1 = stackOut_77_1;
            if (param2 == null) {
              stackOut_79_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackOut_79_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackOut_79_2 = "null";
              stackIn_80_0 = stackOut_79_0;
              stackIn_80_1 = stackOut_79_1;
              stackIn_80_2 = stackOut_79_2;
              break L19;
            } else {
              stackOut_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackOut_78_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackOut_78_2 = "{...}";
              stackIn_80_0 = stackOut_78_0;
              stackIn_80_1 = stackOut_78_1;
              stackIn_80_2 = stackOut_78_2;
              break L19;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_80_0), stackIn_80_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_36_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_51_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_60_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_68_0;
                } else {
                  return stackIn_70_0;
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_x = null;
        if (param0 != -18440) {
            return;
        }
        field_i = null;
        field_l = null;
    }

    final void e(byte param0) {
        rf discarded$4 = null;
        rf discarded$5 = null;
        rf discarded$6 = null;
        rf discarded$7 = null;
        int var2_int = 0;
        rf var2 = null;
        uf var3 = null;
        int var4 = 0;
        int var5 = 0;
        uf var6 = null;
        uf var7 = null;
        var5 = Terraphoenix.field_V;
        if (param0 == -51) {
          L0: {
            if (this.field_k != null) {
              if (this.a((byte) 105) == null) {
                return;
              } else {
                if (!this.field_w) {
                  if (!this.field_o) {
                    this.field_k = null;
                    break L0;
                  } else {
                    var2_int = 1;
                    var3 = this.field_k.d(9272);
                    L1: while (true) {
                      if (var3 == null) {
                        L2: while (true) {
                          L3: {
                            if (this.field_z >= this.field_j.field_d.length) {
                              break L3;
                            } else {
                              L4: {
                                if (-1 == (this.field_j.field_d[this.field_z] ^ -1)) {
                                  break L4;
                                } else {
                                  if (this.field_r.b(true)) {
                                    var2_int = 0;
                                    break L3;
                                  } else {
                                    L5: {
                                      if (-2 == (this.field_n[this.field_z] ^ -1)) {
                                        break L5;
                                      } else {
                                        discarded$4 = this.a(2, this.field_z, (byte) -97);
                                        break L5;
                                      }
                                    }
                                    if (1 == this.field_n[this.field_z]) {
                                      break L4;
                                    } else {
                                      var7 = new uf();
                                      var7.field_g = (long)this.field_z;
                                      this.field_k.a(var7, -16611);
                                      var2_int = 0;
                                      break L4;
                                    }
                                  }
                                }
                              }
                              this.field_z = this.field_z + 1;
                              continue L2;
                            }
                          }
                          if (var2_int == 0) {
                            break L0;
                          } else {
                            this.field_z = 0;
                            this.field_o = false;
                            break L0;
                          }
                        }
                      } else {
                        L6: {
                          var4 = (int)var3.field_g;
                          if (-2 != (this.field_n[var4] ^ -1)) {
                            discarded$5 = this.a(2, var4, (byte) -97);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        L7: {
                          if (-2 == (this.field_n[var4] ^ -1)) {
                            var3.b((byte) 12);
                            break L7;
                          } else {
                            var2_int = 0;
                            break L7;
                          }
                        }
                        var3 = this.field_k.e((byte) -119);
                        continue L1;
                      }
                    }
                  }
                } else {
                  var2_int = 1;
                  var3 = this.field_k.d(9272);
                  L8: while (true) {
                    if (var3 == null) {
                      L9: while (true) {
                        L10: {
                          if (this.field_z >= this.field_j.field_d.length) {
                            break L10;
                          } else {
                            if (0 != this.field_j.field_d[this.field_z]) {
                              if ((this.field_s.field_b ^ -1) <= -251) {
                                var2_int = 0;
                                break L10;
                              } else {
                                L11: {
                                  if (0 == this.field_n[this.field_z]) {
                                    discarded$6 = this.a(1, this.field_z, (byte) -97);
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                                L12: {
                                  if (0 != this.field_n[this.field_z]) {
                                    break L12;
                                  } else {
                                    var6 = new uf();
                                    var6.field_g = (long)this.field_z;
                                    var2_int = 0;
                                    this.field_k.a(var6, -16611);
                                    break L12;
                                  }
                                }
                                this.field_z = this.field_z + 1;
                                continue L9;
                              }
                            } else {
                              this.field_z = this.field_z + 1;
                              continue L9;
                            }
                          }
                        }
                        if (var2_int == 0) {
                          break L0;
                        } else {
                          this.field_z = 0;
                          this.field_w = false;
                          break L0;
                        }
                      }
                    } else {
                      L13: {
                        var4 = (int)var3.field_g;
                        if (0 == this.field_n[var4]) {
                          discarded$7 = this.a(1, var4, (byte) -97);
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      L14: {
                        if (this.field_n[var4] == 0) {
                          var2_int = 0;
                          break L14;
                        } else {
                          var3.b((byte) 12);
                          break L14;
                        }
                      }
                      var3 = this.field_k.e((byte) -119);
                      continue L8;
                    }
                  }
                }
              }
            } else {
              break L0;
            }
          }
          L15: {
            if (!this.field_B) {
              break L15;
            } else {
              if (ll.a(1000) < this.field_g) {
                break L15;
              } else {
                var2 = (rf) ((Object) this.field_q.a((byte) 117));
                L16: while (true) {
                  if (var2 == null) {
                    this.field_g = ll.a(1000) - -1000L;
                    break L15;
                  } else {
                    L17: {
                      if (!var2.field_A) {
                        if (var2.field_C) {
                          if (!var2.field_x) {
                            throw new RuntimeException();
                          } else {
                            var2.b((byte) 12);
                            break L17;
                          }
                        } else {
                          var2.field_C = true;
                          break L17;
                        }
                      } else {
                        break L17;
                      }
                    }
                    var2 = (rf) ((Object) this.field_q.a(true));
                    continue L16;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void c(byte param0) {
        if (param0 != 2) {
            this.field_m = (ua) null;
        }
        if (null == this.field_m) {
            return;
        }
        this.field_o = true;
        if (!(null != this.field_k)) {
            this.field_k = new jj();
        }
    }

    private final rf a(int param0, int param1, byte param2) {
        ma discarded$1 = null;
        Object var4 = null;
        byte[] var5 = null;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var6_int = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        rf var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        Object stackIn_60_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_59_0 = null;
        L0: {
          var10 = Terraphoenix.field_V;
          var12 = (rf) ((Object) this.field_q.a((byte) 46, (long)param1));
          var4 = var12;
          if (var12 == null) {
            break L0;
          } else {
            if (0 != param0) {
              break L0;
            } else {
              if (var12.field_x) {
                break L0;
              } else {
                if (!var12.field_A) {
                  break L0;
                } else {
                  var12.b((byte) 12);
                  var4 = null;
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (param2 == -97) {
            break L1;
          } else {
            tb.a(97);
            break L1;
          }
        }
        L2: {
          if (var4 == null) {
            L3: {
              if (0 == param0) {
                L4: {
                  if (this.field_m == null) {
                    break L4;
                  } else {
                    if (0 == (this.field_n[param1] ^ -1)) {
                      break L4;
                    } else {
                      var4 = this.field_s.a(this.field_m, param1, 2);
                      break L3;
                    }
                  }
                }
                if (!this.field_r.d(-21)) {
                  var4 = this.field_r.a(param1, true, this.field_f, (byte) 110, (byte) 2);
                  break L3;
                } else {
                  return null;
                }
              } else {
                if (1 == param0) {
                  if (this.field_m != null) {
                    var4 = this.field_s.a(41, param1, this.field_m);
                    break L3;
                  } else {
                    throw new RuntimeException();
                  }
                } else {
                  if ((param0 ^ -1) != -3) {
                    throw new RuntimeException();
                  } else {
                    if (this.field_m == null) {
                      throw new RuntimeException();
                    } else {
                      if (0 != (this.field_n[param1] ^ -1)) {
                        throw new RuntimeException();
                      } else {
                        if (!this.field_r.b(true)) {
                          var4 = this.field_r.a(param1, false, this.field_f, (byte) 115, (byte) 2);
                          break L3;
                        } else {
                          return null;
                        }
                      }
                    }
                  }
                }
              }
            }
            this.field_q.a((uf) (var4), (long)param1, (byte) -71);
            break L2;
          } else {
            break L2;
          }
        }
        if (!((rf) (var4)).field_A) {
          var18 = ((rf) (var4)).b(true);
          var13 = var18;
          var5 = var13;
          if (!(var4 instanceof ma)) {
            try {
              L5: {
                L6: {
                  if (var5 == null) {
                    break L6;
                  } else {
                    if (var18.length <= 2) {
                      break L6;
                    } else {
                      qc.field_d.reset();
                      qc.field_d.update(var5, 0, -2 + var18.length);
                      var6_int = (int)qc.field_d.getValue();
                      if (this.field_j.field_h[param1] != var6_int) {
                        throw new RuntimeException();
                      } else {
                        L7: {
                          if (null == this.field_j.field_p) {
                            break L7;
                          } else {
                            if (this.field_j.field_p[param1] == null) {
                              break L7;
                            } else {
                              var30 = this.field_j.field_p[param1];
                              var29 = tg.a(var5, var18.length + -2, 0, 8);
                              var11 = 0;
                              var9 = var11;
                              L8: while (true) {
                                if (-65 >= (var11 ^ -1)) {
                                  break L7;
                                } else {
                                  if (var29[var11] != var30[var11]) {
                                    throw new RuntimeException();
                                  } else {
                                    var11++;
                                    continue L8;
                                  }
                                }
                              }
                            }
                          }
                        }
                        this.field_r.field_i = 0;
                        this.field_r.field_l = 0;
                        break L5;
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6_ref = (RuntimeException) (Object) decompiledCaughtException;
              this.field_r.b(-12948);
              ((rf) (var4)).b((byte) 12);
              if (((rf) (var4)).field_x) {
                if (!this.field_r.d(-21)) {
                  var4 = this.field_r.a(param1, true, this.field_f, (byte) 77, (byte) 2);
                  this.field_q.a((uf) (var4), (long)param1, (byte) -100);
                  return null;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
            L9: {
              var5[var18.length + -2] = (byte)(this.field_j.field_o[param1] >>> -471979064);
              var5[var18.length + -1] = (byte)this.field_j.field_o[param1];
              if (null != this.field_m) {
                discarded$1 = this.field_s.a(var18, param1, param2 ^ -4723, this.field_m);
                if (this.field_n[param1] != 1) {
                  this.field_n[param1] = (byte) 1;
                  break L9;
                } else {
                  break L9;
                }
              } else {
                break L9;
              }
            }
            L10: {
              if (!((rf) (var4)).field_x) {
                ((rf) (var4)).b((byte) 12);
                break L10;
              } else {
                break L10;
              }
            }
            return (rf) (var4);
          } else {
            try {
              L11: {
                L12: {
                  if (var5 == null) {
                    break L12;
                  } else {
                    if (var18.length <= 2) {
                      break L12;
                    } else {
                      qc.field_d.reset();
                      qc.field_d.update(var5, 0, -2 + var18.length);
                      var6_int = (int)qc.field_d.getValue();
                      if (var6_int == this.field_j.field_h[param1]) {
                        L13: {
                          if (null == this.field_j.field_p) {
                            break L13;
                          } else {
                            if (null != this.field_j.field_p[param1]) {
                              var27 = this.field_j.field_p[param1];
                              var28 = tg.a(var5, var18.length + -2, 0, 8);
                              var9 = 0;
                              L14: while (true) {
                                if ((var9 ^ -1) <= -65) {
                                  break L13;
                                } else {
                                  if (var27[var9] == var28[var9]) {
                                    var9++;
                                    continue L14;
                                  } else {
                                    throw new RuntimeException();
                                  }
                                }
                              }
                            } else {
                              break L13;
                            }
                          }
                        }
                        var7 = (255 & var5[-1 + var18.length]) + ((255 & var5[var18.length - 2]) << 1366633416);
                        if (var7 != (65535 & this.field_j.field_o[param1])) {
                          throw new RuntimeException();
                        } else {
                          L15: {
                            if (-2 == (this.field_n[param1] ^ -1)) {
                              break L15;
                            } else {
                              L16: {
                                if (0 != this.field_n[param1]) {
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                              this.field_n[param1] = (byte) 1;
                              break L15;
                            }
                          }
                          L17: {
                            if (!((rf) (var4)).field_x) {
                              ((rf) (var4)).b((byte) 12);
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          stackOut_59_0 = var4;
                          stackIn_60_0 = stackOut_59_0;
                          break L11;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L18: {
                var6 = (Exception) (Object) decompiledCaughtException;
                this.field_n[param1] = (byte)-1;
                ((rf) (var4)).b((byte) 12);
                if (((rf) (var4)).field_x) {
                  if (!this.field_r.d(-21)) {
                    var4 = this.field_r.a(param1, true, this.field_f, (byte) 91, (byte) 2);
                    this.field_q.a((uf) (var4), (long)param1, (byte) -101);
                    break L18;
                  } else {
                    break L18;
                  }
                } else {
                  break L18;
                }
              }
              return null;
            }
            return (rf) ((Object) stackIn_60_0);
          }
        } else {
          return null;
        }
    }

    final int b(int param0, int param1) {
        rf var3 = (rf) ((Object) this.field_q.a((byte) 46, (long)param1));
        if (param0 != 0) {
            return -22;
        }
        if (var3 == null) {
            return 0;
        }
        return var3.c(0);
    }

    final km a(byte param0) {
        ma discarded$1 = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Terraphoenix.field_V;
        if (this.field_j == null) {
          L0: {
            if (this.field_h != null) {
              break L0;
            } else {
              if (!this.field_r.d(-21)) {
                this.field_h = (rf) ((Object) this.field_r.a(this.field_f, true, 255, (byte) 105, (byte) 0));
                break L0;
              } else {
                return null;
              }
            }
          }
          if (!this.field_h.field_A) {
            L1: {
              var7 = this.field_h.b(true);
              var6 = var7;
              var5 = var6;
              var2 = var5;
              if (this.field_h instanceof ma) {
                try {
                  L2: {
                    if (var5 != null) {
                      this.field_j = new km(var7, this.field_A, this.field_y);
                      if (this.field_j.field_t != this.field_p) {
                        throw new RuntimeException();
                      } else {
                        break L2;
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var3 = decompiledCaughtException;
                    this.field_j = null;
                    if (this.field_r.d(-21)) {
                      this.field_h = null;
                      break L3;
                    } else {
                      this.field_h = (rf) ((Object) this.field_r.a(this.field_f, true, 255, (byte) 61, (byte) 0));
                      break L3;
                    }
                  }
                  return null;
                }
                break L1;
              } else {
                try {
                  L4: {
                    if (var5 == null) {
                      throw new RuntimeException();
                    } else {
                      this.field_j = new km(var7, this.field_A, this.field_y);
                      break L4;
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L5: {
                    var3 = decompiledCaughtException;
                    this.field_r.b(-12948);
                    this.field_j = null;
                    if (this.field_r.d(-21)) {
                      this.field_h = null;
                      break L5;
                    } else {
                      this.field_h = (rf) ((Object) this.field_r.a(this.field_f, true, 255, (byte) 93, (byte) 0));
                      break L5;
                    }
                  }
                  return null;
                }
                if (null != this.field_t) {
                  discarded$1 = this.field_s.a(var7, this.field_f, 4626, this.field_t);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L6: {
              if (param0 >= 50) {
                break L6;
              } else {
                this.field_z = 32;
                break L6;
              }
            }
            L7: {
              if (null == this.field_m) {
                break L7;
              } else {
                this.field_n = new byte[this.field_j.field_j];
                break L7;
              }
            }
            this.field_h = null;
            return this.field_j;
          } else {
            return null;
          }
        } else {
          return this.field_j;
        }
    }

    final void d(byte param0) {
        String discarded$4 = null;
        rf discarded$5 = null;
        rf discarded$6 = null;
        uf var2 = null;
        int var3 = 0;
        int var4 = 0;
        java.applet.Applet var5 = null;
        var4 = Terraphoenix.field_V;
        if (null == this.field_k) {
          return;
        } else {
          if (null == this.a((byte) 127)) {
            return;
          } else {
            L0: {
              if (param0 == -21) {
                break L0;
              } else {
                var5 = (java.applet.Applet) null;
                discarded$4 = tb.a(-41, (String) null, (java.applet.Applet) null);
                break L0;
              }
            }
            var2 = this.field_v.d(9272);
            L1: while (true) {
              if (var2 == null) {
                return;
              } else {
                L2: {
                  var3 = (int)var2.field_g;
                  if (-1 < (var3 ^ -1)) {
                    break L2;
                  } else {
                    if (var3 >= this.field_j.field_j) {
                      break L2;
                    } else {
                      if (this.field_j.field_d[var3] == 0) {
                        break L2;
                      } else {
                        L3: {
                          if (this.field_n[var3] == 0) {
                            discarded$5 = this.a(1, var3, (byte) -97);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        L4: {
                          if (0 == (this.field_n[var3] ^ -1)) {
                            discarded$6 = this.a(2, var3, (byte) -97);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          if ((this.field_n[var3] ^ -1) == -2) {
                            var2.b((byte) 12);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var2 = this.field_v.e((byte) -119);
                        continue L1;
                      }
                    }
                  }
                }
                var2.b((byte) 12);
                var2 = this.field_v.e((byte) -119);
                continue L1;
              }
            }
          }
        }
    }

    tb(int param0, ua param1, ua param2, h param3, wh param4, int param5, byte[] param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
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
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
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
        this.field_q = new il(16);
        this.field_z = 0;
        this.field_v = new jj();
        this.field_g = 0L;
        try {
          L0: {
            L1: {
              this.field_m = param1;
              this.field_f = param0;
              if (this.field_m != null) {
                this.field_w = true;
                this.field_k = new jj();
                break L1;
              } else {
                this.field_w = false;
                break L1;
              }
            }
            L2: {
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param8) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              ((tb) (this)).field_B = stackIn_7_1 != 0;
              this.field_s = param4;
              this.field_A = param5;
              this.field_r = param3;
              this.field_y = param6;
              this.field_p = param7;
              this.field_t = param2;
              if (this.field_t == null) {
                break L3;
              } else {
                this.field_h = (rf) ((Object) this.field_s.a(this.field_t, this.field_f, 2));
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var10);
            stackOut_10_1 = new StringBuilder().append("tb.<init>(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
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
            if (param3 == null) {
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
            if (param4 == null) {
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
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param5).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param6 == null) {
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
          throw qk.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_l = "Suggested names: ";
        field_u = 0.0;
        field_i = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_x = "Zombie";
    }
}
