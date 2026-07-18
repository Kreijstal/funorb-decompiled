/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf extends gd {
    static String field_Db;
    static boolean field_Gb;
    static gh field_Ab;
    static String field_Bb;
    static int field_Fb;
    static gk[] field_Cb;
    static String field_zb;
    static String field_Eb;

    bf(ka param0, lh param1) {
        super(param0, param1, 33, 20, 30);
    }

    public static void m() {
        field_zb = null;
        field_Ab = null;
        field_Bb = null;
        field_Eb = null;
        field_Db = null;
        field_Cb = null;
    }

    final static kf a(byte param0, int param1, int param2, int param3, int param4) {
        int var7 = SteelSentinels.field_G;
        kf var5 = (kf) (Object) je.field_w.e(13058);
        int var6 = -56 % ((-3 - param0) / 44);
        while (var5 != null) {
            if (var5.field_C == 1) {
                return var5;
            }
            var5 = (kf) (Object) je.field_w.a((byte) -28);
        }
        var5 = new kf();
        var5.field_u = 10;
        var5.field_w = 1;
        var5.field_C = 1;
        je.field_w.a(3, (ck) (Object) var5);
        int discarded$0 = -2864;
        ma.a(3, var5);
        return var5;
    }

    final static void a(byte param0, boolean param1) {
        gh stackIn_5_0 = null;
        gh stackIn_6_0 = null;
        gh stackIn_7_0 = null;
        gh stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        gh stackIn_9_0 = null;
        gh stackIn_10_0 = null;
        gh stackIn_11_0 = null;
        gh stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        gh stackIn_19_0 = null;
        gh stackIn_20_0 = null;
        gh stackIn_21_0 = null;
        gh stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        gh stackIn_23_0 = null;
        gh stackIn_24_0 = null;
        gh stackIn_25_0 = null;
        gh stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        gh stackOut_4_0 = null;
        gh stackOut_5_0 = null;
        gh stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        gh stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        gh stackOut_8_0 = null;
        gh stackOut_9_0 = null;
        gh stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        gh stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        gh stackOut_18_0 = null;
        gh stackOut_19_0 = null;
        gh stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        gh stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        gh stackOut_22_0 = null;
        gh stackOut_23_0 = null;
        gh stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        gh stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        L0: {
          fe.a(-640 + pb.field_c >> 1, 0, -102, 640 + pb.field_c >> 1, pb.field_j);
          if (je.field_t > 0) {
            L1: {
              if (null == ta.field_e) {
                break L1;
              } else {
                ta.field_e.f(mg.field_Ub.field_Y, 0);
                break L1;
              }
            }
            L2: {
              L3: {
                stackOut_4_0 = mg.field_Ub;
                stackIn_7_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (!param1) {
                  break L3;
                } else {
                  stackOut_5_0 = (gh) (Object) stackIn_5_0;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (im.field_b) {
                    break L3;
                  } else {
                    stackOut_6_0 = (gh) (Object) stackIn_6_0;
                    stackOut_6_1 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    break L2;
                  }
                }
              }
              stackOut_7_0 = (gh) (Object) stackIn_7_0;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L2;
            }
            L4: {
              L5: {
                ((gh) (Object) stackIn_8_0).a(stackIn_8_1 != 0, (byte) 126);
                stackOut_8_0 = pc.field_q;
                stackIn_11_0 = stackOut_8_0;
                stackIn_9_0 = stackOut_8_0;
                if (!param1) {
                  break L5;
                } else {
                  stackOut_9_0 = (gh) (Object) stackIn_9_0;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_10_0 = stackOut_9_0;
                  if (im.field_b) {
                    break L5;
                  } else {
                    stackOut_10_0 = (gh) (Object) stackIn_10_0;
                    stackOut_10_1 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    break L4;
                  }
                }
              }
              stackOut_11_0 = (gh) (Object) stackIn_11_0;
              stackOut_11_1 = 0;
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              break L4;
            }
            ((gh) (Object) stackIn_12_0).a(stackIn_12_1 != 0, (byte) 127);
            break L0;
          } else {
            break L0;
          }
        }
        L6: {
          L7: {
            if (bd.field_c > 0) {
              break L7;
            } else {
              if (fj.field_f > 0) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          L8: {
            if (null == ta.field_e) {
              break L8;
            } else {
              ta.field_e.f(ql.field_ec.field_Y, 0);
              break L8;
            }
          }
          L9: {
            L10: {
              stackOut_18_0 = ql.field_ec;
              stackIn_21_0 = stackOut_18_0;
              stackIn_19_0 = stackOut_18_0;
              if (!param1) {
                break L10;
              } else {
                stackOut_19_0 = (gh) (Object) stackIn_19_0;
                stackIn_21_0 = stackOut_19_0;
                stackIn_20_0 = stackOut_19_0;
                if (vb.field_c) {
                  break L10;
                } else {
                  stackOut_20_0 = (gh) (Object) stackIn_20_0;
                  stackOut_20_1 = 1;
                  stackIn_22_0 = stackOut_20_0;
                  stackIn_22_1 = stackOut_20_1;
                  break L9;
                }
              }
            }
            stackOut_21_0 = (gh) (Object) stackIn_21_0;
            stackOut_21_1 = 0;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            break L9;
          }
          L11: {
            L12: {
              ((gh) (Object) stackIn_22_0).a(stackIn_22_1 != 0, (byte) 127);
              stackOut_22_0 = gl.field_y;
              stackIn_25_0 = stackOut_22_0;
              stackIn_23_0 = stackOut_22_0;
              if (!param1) {
                break L12;
              } else {
                stackOut_23_0 = (gh) (Object) stackIn_23_0;
                stackIn_25_0 = stackOut_23_0;
                stackIn_24_0 = stackOut_23_0;
                if (vb.field_c) {
                  break L12;
                } else {
                  stackOut_24_0 = (gh) (Object) stackIn_24_0;
                  stackOut_24_1 = 1;
                  stackIn_26_0 = stackOut_24_0;
                  stackIn_26_1 = stackOut_24_1;
                  break L11;
                }
              }
            }
            stackOut_25_0 = (gh) (Object) stackIn_25_0;
            stackOut_25_1 = 0;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            break L11;
          }
          ((gh) (Object) stackIn_26_0).a(stackIn_26_1 != 0, (byte) 126);
          break L6;
        }
        tk.f((byte) 98);
    }

    final static void a(int param0, int param1, int param2, cc param3, kg param4, int param5, int param6) {
        dd var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            kk.a((gh) (Object) param3, -1, -1, (int[]) null, param3.field_mc, param3.field_Vb, 1073741824, param3.field_ec, param4);
            an.field_i.a(true, (byte) -126);
            an.field_i.a((int[]) null, -2, 0);
            an.field_i.c(-121);
            var7 = an.field_i;
            var8 = param1;
            var9 = param6;
            var10 = 0;
            var11 = 0;
            var7.field_j.a(var11, var10, var9, (byte) -101, var8);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var7_ref;
            stackOut_2_1 = new StringBuilder().append("bf.JB(").append(0).append(',').append(param1).append(',').append(4).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param3 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param4 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + 0 + ',' + param6 + ')');
        }
    }

    final static void a(byte param0, boolean param1, String param2) {
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
              nm.field_p = param1;
              kc.field_A = true;
              ch.field_O = new k(ag.field_p, gf.field_d, param2, de.field_d, nm.field_p);
              ag.field_p.a((lh) (Object) ch.field_O, -118);
              if (param0 <= -63) {
                break L1;
              } else {
                bf.m(57);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("bf.MB(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final static void m(int param0) {
        ea.field_l = new gh(0L, (gh) null);
        if (param0 != 854) {
            field_zb = null;
        }
        if (!(!rm.field_p)) {
            ea.field_l.a(jb.field_C, 126);
        }
        ea.field_l.a(fl.field_c, 122);
        sn.field_f = new uf(kh.field_p, ea.field_l);
        mg.field_Ub = new gh(0L, (gh) null);
        mg.field_Ub.a((gh) (Object) sn.field_f.field_d, param0 + -734);
        mg.field_Ub.a(sg.field_i, 120);
        int discarded$0 = 0;
        vl.d();
    }

    final void c(lh param0, int param1) {
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
              super.c(param0, param1);
              if (param1 == -22908735) {
                break L1;
              } else {
                field_Bb = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("bf.NB(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static String a(int param0, int param1, byte param2, CharSequence[] param3) {
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_3_0 = null;
        String stackIn_9_0 = null;
        String stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_8_0 = null;
        String stackOut_22_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var9 = SteelSentinels.field_G;
        try {
          L0: {
            if (0 != param0) {
              if (param0 == 1) {
                var10 = param3[0];
                var4 = var10;
                if (var4 == null) {
                  stackOut_8_0 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                } else {
                  return ((Object) (Object) var10).toString();
                }
              } else {
                var4_int = param0;
                var5 = 0;
                var6_int = 0;
                L1: while (true) {
                  if (var6_int >= var4_int) {
                    var6 = new StringBuilder(var5);
                    var7 = 0;
                    L2: while (true) {
                      if (var7 >= var4_int) {
                        stackOut_22_0 = var6.toString();
                        stackIn_23_0 = stackOut_22_0;
                        break L0;
                      } else {
                        L3: {
                          var8 = param3[var7];
                          if (var8 != null) {
                            StringBuilder discarded$5 = var6.append(var8);
                            break L3;
                          } else {
                            StringBuilder discarded$6 = var6.append("null");
                            break L3;
                          }
                        }
                        var7++;
                        continue L2;
                      }
                    }
                  } else {
                    L4: {
                      var7_ref_CharSequence = param3[var6_int];
                      if (var7_ref_CharSequence != null) {
                        var5 = var5 + var7_ref_CharSequence.length();
                        break L4;
                      } else {
                        var5 += 4;
                        break L4;
                      }
                    }
                    var6_int++;
                    continue L1;
                  }
                }
              }
            } else {
              stackOut_2_0 = "";
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var4_ref;
            stackOut_24_1 = new StringBuilder().append("bf.KB(").append(param0).append(',').append(0).append(',').append(50).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param3 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L5;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L5;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ')');
        }
        return stackIn_23_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Gb = false;
        field_Db = "Return to Campaign";
        field_Bb = "Elapsed time";
        field_zb = "TECH VALUE: <%0> (<%1>)";
        field_Eb = "Mission Failed";
    }
}
