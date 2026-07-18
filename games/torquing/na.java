/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na extends jh {
    private uc field_L;
    private boolean field_J;
    private int field_M;
    private int field_F;
    static int[] field_G;
    static int field_E;
    private int field_H;
    private String field_D;
    static String[] field_I;

    na(int param0, int param1, int param2, int param3, gm param4, boolean param5, int param6, int param7, uc param8, int param9, String param10) {
        super(param0, param1, param2, param3, (el) null, (ca) null);
        RuntimeException var12 = null;
        int var12_int = 0;
        int var13 = 0;
        int var14 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              ((na) this).field_H = param6;
              ((na) this).field_M = param7;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param5) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((na) this).field_J = stackIn_4_1 != 0;
              ((na) this).field_C = param4;
              ((na) this).field_D = param10;
              ((na) this).field_F = param9;
              ((na) this).field_L = param8;
              var12_int = ((na) this).field_H + -((na) this).field_M;
              var13 = ((na) this).field_L.a(param10, var12_int, ((na) this).field_L.field_x) + ((na) this).field_M * 2;
              if (param3 >= var13) {
                var13 = param3;
                break L2;
              } else {
                ((na) this).a((byte) 127, param0, param1, var13, param2);
                break L2;
              }
            }
            L3: {
              if (!((na) this).field_J) {
                stackOut_9_0 = ((na) this).field_H + ((na) this).field_M * 2;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = 0;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            var14 = stackIn_10_0;
            ((na) this).field_C.a((byte) 123, var14, (-param3 + var13 >> 1) + ((na) this).field_M, param3 + -(((na) this).field_M * 2), -(((na) this).field_M * 3) + (-((na) this).field_H + param2));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var12;
            stackOut_12_1 = new StringBuilder().append("na.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param8 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param9).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param10 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
    }

    final static int a(da param0, String param1, int param2, da param3, int param4, boolean param5, int param6) {
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        String var15 = null;
        Object var16 = null;
        CharSequence var17 = null;
        int stackIn_5_0 = 0;
        fj stackIn_10_0 = null;
        fj stackIn_11_0 = null;
        fj stackIn_12_0 = null;
        String stackIn_12_1 = null;
        fj stackIn_13_0 = null;
        fj stackIn_14_0 = null;
        fj stackIn_15_0 = null;
        String stackIn_15_1 = null;
        int stackIn_36_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_67_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        fj stackOut_9_0 = null;
        fj stackOut_11_0 = null;
        String stackOut_11_1 = null;
        fj stackOut_10_0 = null;
        String stackOut_10_1 = null;
        fj stackOut_12_0 = null;
        fj stackOut_14_0 = null;
        String stackOut_14_1 = null;
        fj stackOut_13_0 = null;
        String stackOut_13_1 = null;
        int stackOut_35_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_66_0 = 0;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
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
        var16 = null;
        var13 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var15 = param3.b((byte) -38);
              var8 = param0.b((byte) -107);
              if (null == vk.field_E) {
                if (mo.a(269, false)) {
                  break L1;
                } else {
                  stackOut_4_0 = -1;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (ef.field_a == tb.field_o) {
                L3: {
                  jl.field_T = null;
                  wa.field_d.field_n = 0;
                  if (param1 != null) {
                    L4: {
                      var9 = 0;
                      jb.field_c.field_n = 0;
                      if (!param5) {
                        break L4;
                      } else {
                        var9 = var9 | 1;
                        break L4;
                      }
                    }
                    L5: {
                      jb.field_c.b((byte) 60, sa.field_d.nextInt());
                      jb.field_c.b((byte) 60, sa.field_d.nextInt());
                      jb.field_c.a(var15, (byte) -72);
                      jb.field_c.a(var8, (byte) -72);
                      var17 = (CharSequence) (Object) param1;
                      int discarded$10 = 109;
                      jb.field_c.a(lp.a(var17), (byte) -72);
                      jb.field_c.a(param6, 109);
                      jb.field_c.b(90, param4);
                      jb.field_c.b(90, var9);
                      wa.field_d.b(90, 18);
                      wa.field_d.field_n = wa.field_d.field_n + 2;
                      var10 = wa.field_d.field_n;
                      var11_ref_String = rb.a(-108, ip.a(9));
                      if (var11_ref_String == null) {
                        var11_ref_String = "";
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    wa.field_d.b((byte) 4, var11_ref_String);
                    int discarded$11 = -4;
                    ok.a(jb.field_c, ua.field_a, (fj) (Object) wa.field_d, gk.field_b);
                    wa.field_d.c(-var10 + wa.field_d.field_n, param2 + 400395746);
                    break L3;
                  } else {
                    L6: {
                      jb.field_c.field_n = 0;
                      jb.field_c.b((byte) 60, sa.field_d.nextInt());
                      jb.field_c.b((byte) 60, sa.field_d.nextInt());
                      stackOut_9_0 = jb.field_c;
                      stackIn_11_0 = stackOut_9_0;
                      stackIn_10_0 = stackOut_9_0;
                      if (!param3.a((byte) 104)) {
                        stackOut_11_0 = (fj) (Object) stackIn_11_0;
                        stackOut_11_1 = "";
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        break L6;
                      } else {
                        stackOut_10_0 = (fj) (Object) stackIn_10_0;
                        stackOut_10_1 = (String) var15;
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_12_1 = stackOut_10_1;
                        break L6;
                      }
                    }
                    L7: {
                      ((fj) (Object) stackIn_12_0).a(stackIn_12_1, (byte) -72);
                      stackOut_12_0 = jb.field_c;
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_13_0 = stackOut_12_0;
                      if (param0.a((byte) -113)) {
                        stackOut_14_0 = (fj) (Object) stackIn_14_0;
                        stackOut_14_1 = (String) var8;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        break L7;
                      } else {
                        stackOut_13_0 = (fj) (Object) stackIn_13_0;
                        stackOut_13_1 = "";
                        stackIn_15_0 = stackOut_13_0;
                        stackIn_15_1 = stackOut_13_1;
                        break L7;
                      }
                    }
                    ((fj) (Object) stackIn_15_0).a(stackIn_15_1, (byte) -72);
                    wa.field_d.b(90, 16);
                    wa.field_d.field_n = wa.field_d.field_n + 1;
                    var9 = wa.field_d.field_n;
                    int discarded$12 = -4;
                    ok.a(jb.field_c, ua.field_a, (fj) (Object) wa.field_d, gk.field_b);
                    wa.field_d.c((byte) 48, -var9 + wa.field_d.field_n);
                    break L3;
                  }
                }
                jd.a((byte) -118, -1);
                ef.field_a = q.field_c;
                break L2;
              } else {
                break L2;
              }
            }
            L8: {
              if (param2 == -25978) {
                break L8;
              } else {
                var14 = null;
                int discarded$13 = na.a((da) null, (String) null, 121, (da) null, -99, true, 19);
                break L8;
              }
            }
            L9: {
              if (q.field_c == ef.field_a) {
                if (!no.a(1, param2 + 25978)) {
                  break L9;
                } else {
                  L10: {
                    var9 = kj.field_d.i((byte) -101);
                    kj.field_d.field_n = 0;
                    if (100 > var9) {
                      break L10;
                    } else {
                      if (var9 <= 105) {
                        kh.field_n = new String[var9 - 100];
                        ef.field_a = pl.field_s;
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  if (248 == var9) {
                    ae.a(ip.a(9), (byte) 25);
                    pl.field_u = od.field_u;
                    int discarded$14 = 1;
                    ih.b();
                    lh.field_J = false;
                    stackOut_35_0 = var9;
                    stackIn_36_0 = stackOut_35_0;
                    return stackIn_36_0;
                  } else {
                    if (var9 == 99) {
                      int discarded$15 = -92;
                      boolean discarded$16 = no.a(ol.b(), param2 ^ -25978);
                      jl.field_T = new Boolean(ac.a((fj) (Object) kj.field_d, 28066));
                      kj.field_d.field_n = 0;
                      break L9;
                    } else {
                      fa.field_e = var9;
                      ef.field_a = ah.field_b;
                      oo.field_a = -1;
                      break L9;
                    }
                  }
                }
              } else {
                break L9;
              }
            }
            L11: {
              if (pl.field_s == ef.field_a) {
                var9 = 2;
                if (no.a(var9, 0)) {
                  var10 = kj.field_d.i(7088);
                  kj.field_d.field_n = 0;
                  if (!no.a(var10, 0)) {
                    break L11;
                  } else {
                    var11 = kh.field_n.length;
                    var12 = 0;
                    L12: while (true) {
                      if (var12 >= var11) {
                        int discarded$17 = 1;
                        ih.b();
                        lh.field_J = false;
                        stackOut_46_0 = 100 - -var11;
                        stackIn_47_0 = stackOut_46_0;
                        return stackIn_47_0;
                      } else {
                        kh.field_n[var12] = kj.field_d.d(-7519);
                        var12++;
                        continue L12;
                      }
                    }
                  }
                } else {
                  break L11;
                }
              } else {
                break L11;
              }
            }
            L13: {
              if (ef.field_a == ah.field_b) {
                if (ah.a(param2 + 25980)) {
                  L14: {
                    if (fa.field_e != 255) {
                      pl.field_u = kj.field_d.h((byte) 124);
                      break L14;
                    } else {
                      var9_ref_String = kj.field_d.a(19);
                      if (var9_ref_String == null) {
                        break L14;
                      } else {
                        om.a((byte) 73, var9_ref_String, ip.a(9));
                        break L14;
                      }
                    }
                  }
                  int discarded$18 = 1;
                  ih.b();
                  lh.field_J = false;
                  stackOut_56_0 = fa.field_e;
                  stackIn_57_0 = stackOut_56_0;
                  return stackIn_57_0;
                } else {
                  break L13;
                }
              } else {
                break L13;
              }
            }
            L15: {
              if (vk.field_E != null) {
                break L15;
              } else {
                if (lh.field_J) {
                  L16: {
                    int discarded$19 = -76;
                    if (lc.h() > 30000L) {
                      pl.field_u = eb.field_h;
                      break L16;
                    } else {
                      pl.field_u = hq.field_e;
                      break L16;
                    }
                  }
                  lh.field_J = false;
                  stackOut_64_0 = 249;
                  stackIn_65_0 = stackOut_64_0;
                  return stackIn_65_0;
                } else {
                  var9 = ea.field_t;
                  ea.field_t = sf.field_a;
                  lh.field_J = true;
                  sf.field_a = var9;
                  break L15;
                }
              }
            }
            stackOut_66_0 = -1;
            stackIn_67_0 = stackOut_66_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var7 = decompiledCaughtException;
            stackOut_68_0 = (RuntimeException) var7;
            stackOut_68_1 = new StringBuilder().append("na.J(");
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param0 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L17;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L17;
            }
          }
          L18: {
            stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',');
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param1 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L18;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L18;
            }
          }
          L19: {
            stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
            stackOut_74_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(',').append(param2).append(',');
            stackIn_76_0 = stackOut_74_0;
            stackIn_76_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param3 == null) {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L19;
            } else {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "{...}";
              stackIn_77_0 = stackOut_75_0;
              stackIn_77_1 = stackOut_75_1;
              stackIn_77_2 = stackOut_75_2;
              break L19;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_77_0, stackIn_77_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_67_0;
    }

    public static void a() {
        field_I = null;
        field_G = null;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = ((na) this).field_w - -param3;
        if (param1 >= -7) {
            String discarded$0 = ((na) this).b(85);
        }
        int var6 = param2 + ((na) this).field_k;
        super.a(param0, (byte) -91, param2, param3);
        if (param0 != 0) {
            return;
        }
        int var7 = !((na) this).field_J ? 0 : -((na) this).field_H + (((na) this).field_p + -(2 * ((na) this).field_M));
        int discarded$1 = ((na) this).field_L.a(((na) this).field_D, var5 - (-var7 + -((na) this).field_M), var6 - -((na) this).field_M, -((na) this).field_M + ((na) this).field_H, ((na) this).field_o - 2 * ((na) this).field_M, ((na) this).field_F, -1, !((na) this).field_J ? 2 : 0, 1, ((na) this).field_L.field_x);
    }

    final String b(int param0) {
        int var2 = ((na) this).field_C.field_s ? 1 : 0;
        ((na) this).field_C.field_s = ((na) this).field_s;
        String var3 = ((na) this).field_C.b(param0);
        ((na) this).field_C.field_s = var2 != 0 ? true : false;
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = new String[]{"By rating", "By win percentage"};
    }
}
