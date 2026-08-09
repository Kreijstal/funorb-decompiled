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
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        try {
          L0: {
            L1: {
              this.field_H = param6;
              this.field_M = param7;
              stackIn_3_0 = this;

              if (!param5) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((na) (this)).field_J = stackIn_4_1 != 0;
              this.field_C = param4;
              this.field_D = param10;
              this.field_F = param9;
              this.field_L = param8;
              var12_int = this.field_H + -this.field_M;
              var13 = this.field_L.a(param10, var12_int, this.field_L.field_x) + this.field_M * 2;
              if (param3 >= var13) {
                var13 = param3;
                break L2;
              } else {
                this.a((byte) 127, param0, param1, var13, param2);
                break L2;
              }
            }
            L3: {
              if (!this.field_J) {
                stackIn_10_0 = this.field_H + this.field_M * 2;
                break L3;
              } else {
                stackIn_10_0 = 0;
                break L3;
              }
            }
            var14 = stackIn_10_0;
            this.field_C.a((byte) 123, var14, (-param3 + var13 >> -1792318271) + this.field_M, param3 + -(this.field_M * 2), -(this.field_M * 3) + (-this.field_H + param2));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var12);

            stackIn_14_1 = new StringBuilder().append("na.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param9).append(',');

            if (param10 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_15_0), stackIn_21_2 + ')');
        }
    }

    final static int a(da param0, String param1, int param2, da param3, int param4, boolean param5, int param6) {
        int stackIn_5_0 = 0;
        fj stackIn_11_0 = null;
        fj stackIn_12_0 = null;
        String stackIn_12_1 = null;
        fj stackIn_14_0 = null;
        fj stackIn_15_0 = null;
        String stackIn_15_1 = null;
        int stackIn_36_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_67_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        StringBuilder stackIn_76_1 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        da var14 = null;
        String var15 = null;
        Object var16 = null;
        CharSequence var17 = null;
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
                  stackIn_5_0 = -1;
                  decompiledRegionSelector0 = 0;
                  break L0;
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
                      var17 = (CharSequence) ((Object) param1);
                      jb.field_c.a(lp.a(var17, 109), (byte) -72);
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
                    ok.a(jb.field_c, ua.field_a, wa.field_d, gk.field_b, -4);
                    wa.field_d.c(-var10 + wa.field_d.field_n, param2 + 400395746);
                    break L3;
                  } else {
                    L6: {
                      jb.field_c.field_n = 0;
                      jb.field_c.b((byte) 60, sa.field_d.nextInt());
                      jb.field_c.b((byte) 60, sa.field_d.nextInt());
                      stackIn_11_0 = jb.field_c;

                      if (!param3.a((byte) 104)) {
                        stackIn_12_0 = (fj) ((Object) stackIn_11_0);
                        stackIn_12_1 = "";
                        break L6;
                      } else {
                        stackIn_12_0 = (fj) ((Object) stackIn_11_0);
                        stackIn_12_1 = (String) (var15);
                        break L6;
                      }
                    }
                    L7: {
                      ((fj) (Object) stackIn_12_0).a(stackIn_12_1, (byte) -72);
                      stackIn_14_0 = jb.field_c;

                      if (param0.a((byte) -113)) {
                        stackIn_15_0 = (fj) ((Object) stackIn_14_0);
                        stackIn_15_1 = (String) (var8);
                        break L7;
                      } else {
                        stackIn_15_0 = (fj) ((Object) stackIn_14_0);
                        stackIn_15_1 = "";
                        break L7;
                      }
                    }
                    ((fj) (Object) stackIn_15_0).a(stackIn_15_1, (byte) -72);
                    wa.field_d.b(90, 16);
                    wa.field_d.field_n = wa.field_d.field_n + 1;
                    var9 = wa.field_d.field_n;
                    ok.a(jb.field_c, ua.field_a, wa.field_d, gk.field_b, -4);
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
                var14 = (da) null;
                na.a((da) null, (String) null, 121, (da) null, -99, true, 19);
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
                    ih.b(true);
                    lh.field_J = false;
                    stackIn_36_0 = var9;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if ((var9 ^ -1) == -100) {
                      no.a(ol.b(-92), param2 ^ -25978);
                      jl.field_T = new Boolean(ac.a(kj.field_d, 28066));
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
                        ih.b(true);
                        lh.field_J = false;
                        stackIn_47_0 = 100 - -var11;
                        decompiledRegionSelector0 = 2;
                        break L0;
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
                    if (-256 != (fa.field_e ^ -1)) {
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
                  ih.b(true);
                  lh.field_J = false;
                  stackIn_57_0 = fa.field_e;
                  decompiledRegionSelector0 = 3;
                  break L0;
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
                    if (lc.h((byte) -76) > 30000L) {
                      pl.field_u = eb.field_h;
                      break L16;
                    } else {
                      pl.field_u = hq.field_e;
                      break L16;
                    }
                  }
                  lh.field_J = false;
                  stackIn_65_0 = 249;
                  decompiledRegionSelector0 = 4;
                  break L0;
                } else {
                  var9 = ea.field_t;
                  ea.field_t = sf.field_a;
                  lh.field_J = true;
                  sf.field_a = var9;
                  break L15;
                }
              }
            }
            stackIn_67_0 = -1;
            decompiledRegionSelector0 = 5;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var7 = decompiledCaughtException;
            stackIn_70_0 = (RuntimeException) (var7);

            stackIn_70_1 = new StringBuilder().append("na.J(");

            if (param0 == null) {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "null";
              break L17;
            } else {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "{...}";
              break L17;
            }
          }
          L18: {


            stackIn_73_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',');

            if (param1 == null) {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "null";
              break L18;
            } else {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "{...}";
              break L18;
            }
          }
          L19: {


            stackIn_76_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackIn_77_2 = "null";
              break L19;
            } else {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackIn_77_2 = "{...}";
              break L19;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_71_0), stackIn_77_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_36_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_47_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_57_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_65_0;
                } else {
                  return stackIn_67_0;
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            field_I = (String[]) null;
        }
        field_I = null;
        field_G = null;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = this.field_w - -param3;
        if (param1 >= -7) {
            this.b(85);
        }
        int var6 = param2 + this.field_k;
        super.a(param0, (byte) -91, param2, param3);
        if (-1 != (param0 ^ -1)) {
            return;
        }
        int var7 = !this.field_J ? 0 : -this.field_H + (this.field_p + -(2 * this.field_M));
        this.field_L.a(this.field_D, var5 - (-var7 + -this.field_M), var6 - -this.field_M, -this.field_M + this.field_H, this.field_o - 2 * this.field_M, this.field_F, -1, !this.field_J ? 2 : 0, 1, this.field_L.field_x);
    }

    final String b(int param0) {
        int var2 = this.field_C.field_s ? 1 : 0;
        this.field_C.field_s = this.field_s;
        String var3 = this.field_C.b(param0);
        this.field_C.field_s = var2 != 0 ? true : false;
        return var3;
    }

    static {
        field_I = new String[]{"By rating", "By win percentage"};
    }
}
