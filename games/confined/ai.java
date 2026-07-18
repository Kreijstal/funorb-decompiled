/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ai extends em {
    private String field_j;
    private long field_h;
    static String field_g;
    static int field_i;

    final void a(kg param0, byte param1) {
        try {
            param0.a(((ai) this).field_h, (byte) -96);
            if (param1 < 47) {
                ((ai) this).field_h = -58L;
            }
            param0.a(11404, ((ai) this).field_j);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ai.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ai(long param0, String param1) {
        try {
            ((ai) this).field_h = param0;
            ((ai) this).field_j = param1;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ai.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    si b(byte param0) {
        int var2 = -9 % ((51 - param0) / 57);
        return vf.field_e;
    }

    final static int a(int param0, String param1, bn param2, boolean param3, int param4, int param5, bn param6) {
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
        int stackIn_5_0 = 0;
        kg stackIn_15_0 = null;
        kg stackIn_16_0 = null;
        kg stackIn_17_0 = null;
        String stackIn_17_1 = null;
        kg stackIn_18_0 = null;
        kg stackIn_19_0 = null;
        kg stackIn_20_0 = null;
        String stackIn_20_1 = null;
        int stackIn_29_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        kg stackOut_14_0 = null;
        kg stackOut_16_0 = null;
        String stackOut_16_1 = null;
        kg stackOut_15_0 = null;
        String stackOut_15_1 = null;
        kg stackOut_17_0 = null;
        kg stackOut_19_0 = null;
        String stackOut_19_1 = null;
        kg stackOut_18_0 = null;
        String stackOut_18_1 = null;
        int stackOut_28_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_54_0 = 0;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        var13 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var14 = param6.a(-120);
              var11_ref_String = var14;
              var11_ref_String = var14;
              var8 = param2.a(-75);
              var11_ref_String = var8;
              var11_ref_String = var8;
              if (null != kl.field_G) {
                break L1;
              } else {
                if (!mb.a(false, (byte) 17)) {
                  stackOut_4_0 = -1;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (lk.field_d != si.field_g) {
                break L2;
              } else {
                L3: {
                  vh.field_a.field_n = 0;
                  ca.field_o = null;
                  if (param1 == null) {
                    L4: {
                      qf.field_c.field_n = 0;
                      qf.field_c.d(-106, hj.field_h.nextInt());
                      qf.field_c.d(-103, hj.field_h.nextInt());
                      stackOut_14_0 = qf.field_c;
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_15_0 = stackOut_14_0;
                      if (!param6.b(0)) {
                        stackOut_16_0 = (kg) (Object) stackIn_16_0;
                        stackOut_16_1 = "";
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        break L4;
                      } else {
                        stackOut_15_0 = (kg) (Object) stackIn_15_0;
                        stackOut_15_1 = (String) var14;
                        stackIn_17_0 = stackOut_15_0;
                        stackIn_17_1 = stackOut_15_1;
                        break L4;
                      }
                    }
                    L5: {
                      ((kg) (Object) stackIn_17_0).a(stackIn_17_1, (byte) 112);
                      stackOut_17_0 = qf.field_c;
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_18_0 = stackOut_17_0;
                      if (!param2.b(0)) {
                        stackOut_19_0 = (kg) (Object) stackIn_19_0;
                        stackOut_19_1 = "";
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        break L5;
                      } else {
                        stackOut_18_0 = (kg) (Object) stackIn_18_0;
                        stackOut_18_1 = (String) var8;
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_20_1 = stackOut_18_1;
                        break L5;
                      }
                    }
                    ((kg) (Object) stackIn_20_0).a(stackIn_20_1, (byte) 28);
                    vh.field_a.f(110, 16);
                    vh.field_a.field_n = vh.field_a.field_n + 1;
                    var9 = vh.field_a.field_n;
                    jf.a(qf.field_c, hk.field_a, (kg) (Object) vh.field_a, 0, an.field_r);
                    vh.field_a.a(25859, vh.field_a.field_n - var9);
                    break L3;
                  } else {
                    L6: {
                      var9 = 0;
                      if (param3) {
                        var9 = var9 | 1;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      qf.field_c.field_n = 0;
                      qf.field_c.d(-98, hj.field_h.nextInt());
                      qf.field_c.d(-114, hj.field_h.nextInt());
                      qf.field_c.a(var14, (byte) 45);
                      qf.field_c.a(var8, (byte) 105);
                      var15 = (CharSequence) (Object) param1;
                      int discarded$5 = 23617;
                      qf.field_c.a(ka.a(var15), (byte) 75);
                      qf.field_c.c(param0, 8);
                      qf.field_c.f(114, param4);
                      qf.field_c.f(117, var9);
                      vh.field_a.f(101, 18);
                      vh.field_a.field_n = vh.field_a.field_n + 2;
                      var10 = vh.field_a.field_n;
                      int discarded$6 = 59;
                      var11_ref_String = pa.a(ii.b(false));
                      if (var11_ref_String != null) {
                        break L7;
                      } else {
                        var11_ref_String = "";
                        break L7;
                      }
                    }
                    vh.field_a.a(var11_ref_String, 123);
                    jf.a(qf.field_c, hk.field_a, (kg) (Object) vh.field_a, 0, an.field_r);
                    vh.field_a.b(-var10 + vh.field_a.field_n, -109);
                    break L3;
                  }
                }
                tb.a(-1, 123);
                lk.field_d = dg.field_p;
                break L2;
              }
            }
            L8: {
              if (dg.field_p != lk.field_d) {
                break L8;
              } else {
                if (!jj.a(1, (byte) -119)) {
                  break L8;
                } else {
                  L9: {
                    var9 = e.field_c.c(32);
                    e.field_c.field_n = 0;
                    if (var9 < 100) {
                      break L9;
                    } else {
                      if (var9 <= 105) {
                        lk.field_d = la.field_M;
                        sc.field_g = new String[var9 + -100];
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  if (248 != var9) {
                    if (99 == var9) {
                      int discarded$7 = -30316;
                      boolean discarded$8 = jj.a(lb.c(), (byte) 16);
                      ca.field_o = new Boolean(qe.a((byte) -73, (kg) (Object) e.field_c));
                      e.field_c.field_n = 0;
                      break L8;
                    } else {
                      Confined.field_F = var9;
                      field_i = -1;
                      lk.field_d = rf.field_c;
                      break L8;
                    }
                  } else {
                    gb.a((byte) -94, ii.b(false));
                    gl.field_k = oj.field_y;
                    dc.d(115);
                    sg.field_y = false;
                    stackOut_28_0 = var9;
                    stackIn_29_0 = stackOut_28_0;
                    return stackIn_29_0;
                  }
                }
              }
            }
            L10: {
              if (lk.field_d == la.field_M) {
                var9 = 2;
                if (!jj.a(var9, (byte) -126)) {
                  break L10;
                } else {
                  var10 = e.field_c.a((byte) 25);
                  e.field_c.field_n = 0;
                  if (!jj.a(var10, (byte) 49)) {
                    break L10;
                  } else {
                    var11 = sc.field_g.length;
                    var12 = 0;
                    L11: while (true) {
                      if (var11 <= var12) {
                        dc.d(103);
                        sg.field_y = false;
                        stackOut_41_0 = var11 + 100;
                        stackIn_42_0 = stackOut_41_0;
                        return stackIn_42_0;
                      } else {
                        sc.field_g[var12] = e.field_c.g((byte) 31);
                        var12++;
                        continue L11;
                      }
                    }
                  }
                }
              } else {
                break L10;
              }
            }
            L12: {
              if (lk.field_d == rf.field_c) {
                if (!jc.a(-77)) {
                  break L12;
                } else {
                  L13: {
                    if (Confined.field_F == 255) {
                      var9_ref_String = e.field_c.e((byte) 102);
                      if (var9_ref_String != null) {
                        int discarded$9 = -1;
                        qc.a(var9_ref_String, ii.b(false));
                        break L13;
                      } else {
                        break L13;
                      }
                    } else {
                      gl.field_k = e.field_c.d(true);
                      break L13;
                    }
                  }
                  dc.d(106);
                  sg.field_y = false;
                  stackOut_51_0 = Confined.field_F;
                  stackIn_52_0 = stackOut_51_0;
                  return stackIn_52_0;
                }
              } else {
                break L12;
              }
            }
            if (param5 >= 121) {
              L14: {
                if (kl.field_G != null) {
                  break L14;
                } else {
                  if (sg.field_y) {
                    L15: {
                      if (la.h(112) <= 30000L) {
                        gl.field_k = ka.field_G;
                        break L15;
                      } else {
                        gl.field_k = hf.field_S;
                        break L15;
                      }
                    }
                    sg.field_y = false;
                    stackOut_62_0 = 249;
                    stackIn_63_0 = stackOut_62_0;
                    return stackIn_63_0;
                  } else {
                    var9 = nd.field_s;
                    nd.field_s = ac.field_b;
                    sg.field_y = true;
                    ac.field_b = var9;
                    break L14;
                  }
                }
              }
              stackOut_64_0 = -1;
              stackIn_65_0 = stackOut_64_0;
              break L0;
            } else {
              stackOut_54_0 = 33;
              stackIn_55_0 = stackOut_54_0;
              return stackIn_55_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var7 = decompiledCaughtException;
            stackOut_66_0 = (RuntimeException) var7;
            stackOut_66_1 = new StringBuilder().append("ai.C(").append(param0).append(',');
            stackIn_68_0 = stackOut_66_0;
            stackIn_68_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param1 == null) {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L16;
            } else {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "{...}";
              stackIn_69_0 = stackOut_67_0;
              stackIn_69_1 = stackOut_67_1;
              stackIn_69_2 = stackOut_67_2;
              break L16;
            }
          }
          L17: {
            stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
            stackOut_69_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_69_2).append(',');
            stackIn_71_0 = stackOut_69_0;
            stackIn_71_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param2 == null) {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L17;
            } else {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "{...}";
              stackIn_72_0 = stackOut_70_0;
              stackIn_72_1 = stackOut_70_1;
              stackIn_72_2 = stackOut_70_2;
              break L17;
            }
          }
          L18: {
            stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
            stackOut_72_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_74_0 = stackOut_72_0;
            stackIn_74_1 = stackOut_72_1;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            if (param6 == null) {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L18;
            } else {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "{...}";
              stackIn_75_0 = stackOut_73_0;
              stackIn_75_1 = stackOut_73_1;
              stackIn_75_2 = stackOut_73_2;
              break L18;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_75_0, stackIn_75_2 + ')');
        }
        return stackIn_65_0;
    }

    final static void a(ok param0, ji param1, int param2, int param3, int param4, int param5, int param6, int param7, ji param8, int param9, int param10, int param11, int param12, ji param13, int param14, int param15, int param16, ok param17) {
        int var21_int = 0;
        RuntimeException var21 = null;
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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
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
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            int discarded$6 = 2;
            nl.a(param0, 480, param17);
            int discarded$7 = 243;
            ue.a(20, 20, 16, 16);
            ud.a(320, (byte) -12, 240);
            var21_int = 0;
            pb.a(param13, (byte) -71, param8, 5, 50, 0);
            kc.a(13421772, 30, param1, 20);
            int discarded$8 = 4243584;
            int discarded$9 = 9805732;
            int discarded$10 = -18;
            int discarded$11 = 16777215;
            am.a();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var21 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var21;
            stackOut_2_1 = new StringBuilder().append("ai.E(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
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
            if (param1 == null) {
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
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(16).append(',').append(30).append(',').append(4243584).append(',').append(20).append(',').append(9805732).append(',').append(480).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param8 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(16).append(',').append(50).append(',').append(20).append(',').append(-78).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param13 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(0).append(',').append(320).append(',').append(5).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param17 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + 240 + ',' + 16777215 + ',' + 20 + ')');
        }
    }

    public static void a() {
        field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Change display name";
    }
}
