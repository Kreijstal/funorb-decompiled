/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih {
    static String field_b;
    static vh field_e;
    static String[] field_f;
    static int[] field_d;
    static ir field_a;
    static String[] field_c;

    public static void a(int param0) {
        field_f = null;
        field_d = null;
        field_b = null;
        field_e = null;
        if (param0 <= 98) {
            return;
        }
        field_a = null;
        field_c = null;
    }

    final static int a(String param0, byte param1, int param2, boolean param3, ke param4, ke param5, int param6) {
        int stackIn_4_0 = 0;
        ge stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        ge stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        String stackIn_18_2 = null;
        ge stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        ge stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        String stackIn_21_2 = null;
        int stackIn_33_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        StringBuilder stackIn_71_1 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
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
        String var13 = null;
        CharSequence var14 = null;
        try {
          L0: {
            L1: {
              var13 = param4.a((byte) 104);
              var8 = param5.a((byte) 104);
              if (null == jd.field_c) {
                if (sa.a((byte) 65, false)) {
                  break L1;
                } else {
                  stackIn_4_0 = -1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (no.field_h == tl.field_J) {
                L3: {
                  ej.field_j.field_v = 0;
                  bq.field_q = null;
                  if (param0 == null) {
                    L4: {
                      bc.field_b.field_v = 0;
                      bc.field_b.a(true, lc.field_P.nextInt());
                      bc.field_b.a(true, lc.field_P.nextInt());
                      stackIn_17_0 = bc.field_b;

                      stackIn_17_1 = 0;

                      if (param4.b(true)) {
                        stackIn_18_0 = (ge) ((Object) stackIn_17_0);
                        stackIn_18_1 = stackIn_17_1;
                        stackIn_18_2 = (String) (var13);
                        break L4;
                      } else {
                        stackIn_18_0 = (ge) ((Object) stackIn_17_0);
                        stackIn_18_1 = stackIn_17_1;
                        stackIn_18_2 = "";
                        break L4;
                      }
                    }
                    L5: {
                      ((ge) (Object) stackIn_18_0).a(stackIn_18_1 != 0, stackIn_18_2);
                      stackIn_20_0 = bc.field_b;

                      stackIn_20_1 = 0;

                      if (!param5.b(true)) {
                        stackIn_21_0 = (ge) ((Object) stackIn_20_0);
                        stackIn_21_1 = stackIn_20_1;
                        stackIn_21_2 = "";
                        break L5;
                      } else {
                        stackIn_21_0 = (ge) ((Object) stackIn_20_0);
                        stackIn_21_1 = stackIn_20_1;
                        stackIn_21_2 = (String) (var8);
                        break L5;
                      }
                    }
                    ((ge) (Object) stackIn_21_0).a(stackIn_21_1 != 0, stackIn_21_2);
                    ej.field_j.a(16, false);
                    ej.field_j.field_v = ej.field_j.field_v + 1;
                    var9 = ej.field_j.field_v;
                    ad.a((byte) 93, rb.field_l, bc.field_b, ei.field_q, ej.field_j);
                    ej.field_j.b(-var9 + ej.field_j.field_v, true);
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
                      bc.field_b.field_v = 0;
                      bc.field_b.a(true, lc.field_P.nextInt());
                      bc.field_b.a(true, lc.field_P.nextInt());
                      bc.field_b.a(false, var13);
                      bc.field_b.a(false, var8);
                      var14 = (CharSequence) ((Object) param0);
                      bc.field_b.a(false, cn.a(-28, var14));
                      bc.field_b.a((byte) -81, param2);
                      bc.field_b.a(param6, false);
                      bc.field_b.a(var9, false);
                      ej.field_j.a(18, false);
                      ej.field_j.field_v = ej.field_j.field_v + 2;
                      var10 = ej.field_j.field_v;
                      var11_ref_String = eq.a(hk.d(79), (byte) 112);
                      if (var11_ref_String == null) {
                        var11_ref_String = "";
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    ej.field_j.a(-9946, var11_ref_String);
                    ad.a((byte) 93, rb.field_l, bc.field_b, ei.field_q, ej.field_j);
                    ej.field_j.c(-var10 + ej.field_j.field_v, (byte) -92);
                    break L3;
                  }
                }
                de.a(-1, 0);
                tl.field_J = dr.field_a;
                break L2;
              } else {
                break L2;
              }
            }
            L8: {
              if (tl.field_J != dr.field_a) {
                break L8;
              } else {
                if (!lq.b((byte) 118, 1)) {
                  break L8;
                } else {
                  L9: {
                    var9 = kn.field_e.g(-80);
                    kn.field_e.field_v = 0;
                    if (-101 < (var9 ^ -1)) {
                      break L9;
                    } else {
                      if (105 < var9) {
                        break L9;
                      } else {
                        bi.field_b = new String[-100 + var9];
                        tl.field_J = og.field_L;
                        break L8;
                      }
                    }
                  }
                  if ((var9 ^ -1) == -249) {
                    cr.a(16, hk.d(71));
                    ke.field_g = oe.field_N;
                    dn.c(-70);
                    we.field_e = false;
                    stackIn_33_0 = var9;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if (99 == var9) {
                      lq.b((byte) 63, ld.a(0));
                      bq.field_q = new Boolean(de.a((byte) 104, kn.field_e));
                      kn.field_e.field_v = 0;
                      break L8;
                    } else {
                      tl.field_J = eh.field_l;
                      uq.field_c = var9;
                      of.field_Pb = -1;
                      break L8;
                    }
                  }
                }
              }
            }
            L10: {
              if (tl.field_J != og.field_L) {
                break L10;
              } else {
                var9 = 2;
                if (lq.b((byte) 44, var9)) {
                  var10 = kn.field_e.d(-1034);
                  kn.field_e.field_v = 0;
                  if (lq.b((byte) 49, var10)) {
                    var11 = bi.field_b.length;
                    var12 = 0;
                    L11: while (true) {
                      if (var11 <= var12) {
                        dn.c(53);
                        we.field_e = false;
                        stackIn_43_0 = var11 + 100;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        bi.field_b[var12] = kn.field_e.a(10762);
                        var12++;
                        continue L11;
                      }
                    }
                  } else {
                    break L10;
                  }
                } else {
                  break L10;
                }
              }
            }
            L12: {
              if (tl.field_J != eh.field_l) {
                break L12;
              } else {
                if (wf.a((byte) 39)) {
                  L13: {
                    if (uq.field_c != 255) {
                      ke.field_g = kn.field_e.j(-122);
                      break L13;
                    } else {
                      var9_ref_String = kn.field_e.m(110);
                      if (var9_ref_String != null) {
                        fg.a(hk.d(86), -128, var9_ref_String);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                  dn.c(55);
                  we.field_e = false;
                  stackIn_53_0 = uq.field_c;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  break L12;
                }
              }
            }
            L14: {
              if (param1 > 38) {
                break L14;
              } else {
                ih.a(-57);
                break L14;
              }
            }
            L15: {
              if (null != jd.field_c) {
                break L15;
              } else {
                if (!we.field_e) {
                  var9 = vj.field_d;
                  vj.field_d = cq.field_a;
                  we.field_e = true;
                  cq.field_a = var9;
                  break L15;
                } else {
                  L16: {
                    if (bf.d((byte) 123) <= 30000L) {
                      ke.field_g = er.field_Q;
                      break L16;
                    } else {
                      ke.field_g = wd.field_Rb;
                      break L16;
                    }
                  }
                  we.field_e = false;
                  stackIn_62_0 = 249;
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              }
            }
            stackIn_65_0 = -1;
            decompiledRegionSelector0 = 5;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var7 = decompiledCaughtException;
            stackIn_68_0 = (RuntimeException) (var7);

            stackIn_68_1 = new StringBuilder().append("ih.B(");

            if (param0 == null) {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "null";
              break L17;
            } else {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "{...}";
              break L17;
            }
          }
          L18: {


            stackIn_71_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_69_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "null";
              break L18;
            } else {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "{...}";
              break L18;
            }
          }
          L19: {


            stackIn_74_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(',');

            if (param5 == null) {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "null";
              break L19;
            } else {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "{...}";
              break L19;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_69_0), stackIn_75_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_33_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_43_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_53_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_62_0;
                } else {
                  return stackIn_65_0;
                }
              }
            }
          }
        }
    }

    final static void a(byte param0) {
        hm var1 = new hm();
        var1.a(86, 0, 0, 65536, 64);
        if (param0 != 46) {
            ke var2 = (ke) null;
            ih.a((String) null, (byte) -72, 28, true, (ke) null, (ke) null, 104);
        }
        var1.b(true);
        jc.field_e.a(param0 ^ 45, var1);
    }

    static {
        field_b = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_f = new String[]{"All scores", "My scores", "Best each"};
        field_c = new String[16];
    }
}
