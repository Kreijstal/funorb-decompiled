/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg extends le {
    byte[] field_m;
    static vo field_i;
    int field_j;
    static String field_n;
    long field_h;
    static int field_k;
    static vk field_l;
    static vn[] field_o;

    public static void c() {
        field_o = null;
        field_i = null;
        field_n = null;
        field_l = null;
    }

    bg(long param0, int param1, byte[] param2) {
        try {
            ((bg) this).field_h = param0;
            ((bg) this).field_m = param2;
            ((bg) this).field_j = param1;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "bg.<init>(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static int a(int param0, int param1, boolean param2, int param3) {
        int var4 = -1;
        return qo.b((byte) -123);
    }

    final static boolean a() {
        return ~rc.field_x != ~rc.field_p;
    }

    final static int a(int param0, int param1, ji param2, String param3, ji param4, int param5, boolean param6) {
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
        int stackIn_7_0 = 0;
        de stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        de stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        de stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        String stackIn_20_2 = null;
        de stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        de stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        de stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        String stackIn_23_2 = null;
        int stackIn_33_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        de stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        de stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        String stackOut_19_2 = null;
        de stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        String stackOut_18_2 = null;
        de stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        de stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        String stackOut_22_2 = null;
        de stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        String stackOut_21_2 = null;
        int stackOut_32_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_65_0 = 0;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        var13 = ZombieDawn.field_J;
        try {
          L0: {
            var14 = param2.a(-1);
            var11_ref_String = var14;
            var11_ref_String = var14;
            var8 = param4.a(-1);
            var11_ref_String = var8;
            var11_ref_String = var8;
            L1: {
              if (sn.field_c != null) {
                break L1;
              } else {
                if (!i.a(false, true)) {
                  stackOut_6_0 = -1;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (ui.field_g == ic.field_T) {
                L3: {
                  dp.field_e.field_j = 0;
                  ba.field_g = null;
                  if (param3 == null) {
                    L4: {
                      dh.field_e.field_j = 0;
                      dh.field_e.h(-127, p.field_b.nextInt());
                      dh.field_e.h(-119, p.field_b.nextInt());
                      stackOut_17_0 = dh.field_e;
                      stackOut_17_1 = -88;
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_19_1 = stackOut_17_1;
                      stackIn_18_0 = stackOut_17_0;
                      stackIn_18_1 = stackOut_17_1;
                      if (!param2.b(32)) {
                        stackOut_19_0 = (de) (Object) stackIn_19_0;
                        stackOut_19_1 = stackIn_19_1;
                        stackOut_19_2 = "";
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        stackIn_20_2 = stackOut_19_2;
                        break L4;
                      } else {
                        stackOut_18_0 = (de) (Object) stackIn_18_0;
                        stackOut_18_1 = stackIn_18_1;
                        stackOut_18_2 = (String) var14;
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_20_1 = stackOut_18_1;
                        stackIn_20_2 = stackOut_18_2;
                        break L4;
                      }
                    }
                    L5: {
                      ((de) (Object) stackIn_20_0).a((byte) stackIn_20_1, stackIn_20_2);
                      stackOut_20_0 = dh.field_e;
                      stackOut_20_1 = -88;
                      stackIn_22_0 = stackOut_20_0;
                      stackIn_22_1 = stackOut_20_1;
                      stackIn_21_0 = stackOut_20_0;
                      stackIn_21_1 = stackOut_20_1;
                      if (!param4.b(32)) {
                        stackOut_22_0 = (de) (Object) stackIn_22_0;
                        stackOut_22_1 = stackIn_22_1;
                        stackOut_22_2 = "";
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        stackIn_23_2 = stackOut_22_2;
                        break L5;
                      } else {
                        stackOut_21_0 = (de) (Object) stackIn_21_0;
                        stackOut_21_1 = stackIn_21_1;
                        stackOut_21_2 = (String) var8;
                        stackIn_23_0 = stackOut_21_0;
                        stackIn_23_1 = stackOut_21_1;
                        stackIn_23_2 = stackOut_21_2;
                        break L5;
                      }
                    }
                    ((de) (Object) stackIn_23_0).a((byte) stackIn_23_1, stackIn_23_2);
                    dp.field_e.i(16, 64);
                    dp.field_e.field_j = dp.field_e.field_j + 1;
                    var9 = dp.field_e.field_j;
                    ab.a(dh.field_e, pm.field_c, (byte) 108, (de) (Object) dp.field_e, pj.field_p);
                    dp.field_e.d(-106, -var9 + dp.field_e.field_j);
                    break L3;
                  } else {
                    L6: {
                      var9 = 0;
                      dh.field_e.field_j = 0;
                      if (param6) {
                        var9 = var9 | 1;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      dh.field_e.h(23, p.field_b.nextInt());
                      dh.field_e.h(-117, p.field_b.nextInt());
                      dh.field_e.a((byte) -88, var14);
                      dh.field_e.a((byte) -88, var8);
                      var15 = (CharSequence) (Object) param3;
                      dh.field_e.a((byte) -88, qb.a(-122, var15));
                      dh.field_e.a(param5, (byte) 105);
                      dh.field_e.i(param1, 53);
                      dh.field_e.i(var9, 66);
                      dp.field_e.i(18, 125);
                      dp.field_e.field_j = dp.field_e.field_j + 2;
                      var10 = dp.field_e.field_j;
                      var11_ref_String = ff.a(hc.a(0), (byte) -128);
                      if (var11_ref_String != null) {
                        break L7;
                      } else {
                        var11_ref_String = "";
                        break L7;
                      }
                    }
                    dp.field_e.a(128, var11_ref_String);
                    ab.a(dh.field_e, pm.field_c, (byte) -109, (de) (Object) dp.field_e, pj.field_p);
                    dp.field_e.g(57, -var10 + dp.field_e.field_j);
                    break L3;
                  }
                }
                vl.a((byte) -46, -1);
                ic.field_T = oe.field_a;
                break L2;
              } else {
                break L2;
              }
            }
            L8: {
              if (oe.field_a != ic.field_T) {
                break L8;
              } else {
                if (ck.a((byte) -125, 1)) {
                  L9: {
                    var9 = fj.field_g.d((byte) -119);
                    fj.field_g.field_j = 0;
                    if (var9 < 100) {
                      break L9;
                    } else {
                      if (var9 <= 105) {
                        ic.field_T = og.field_B;
                        ho.field_a = new String[-100 + var9];
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  if (var9 != 248) {
                    if (99 != var9) {
                      ic.field_T = qo.field_w;
                      jd.field_b = -1;
                      l.field_d = var9;
                      break L8;
                    } else {
                      int discarded$3 = 0;
                      boolean discarded$4 = ck.a((byte) -103, lo.a());
                      ba.field_g = new Boolean(uh.a((byte) -36, (de) (Object) fj.field_g));
                      fj.field_g.field_j = 0;
                      break L8;
                    }
                  } else {
                    jc.a((byte) 34, hc.a(0));
                    sc.field_d = wk.field_z;
                    p.a(1);
                    nm.field_d = false;
                    stackOut_32_0 = var9;
                    stackIn_33_0 = stackOut_32_0;
                    return stackIn_33_0;
                  }
                } else {
                  break L8;
                }
              }
            }
            L10: {
              if (og.field_B == ic.field_T) {
                var9 = 2;
                if (ck.a((byte) -128, var9)) {
                  var10 = fj.field_g.f(2);
                  fj.field_g.field_j = 0;
                  if (ck.a((byte) -100, var10)) {
                    var11 = ho.field_a.length;
                    var12 = 0;
                    L11: while (true) {
                      if (var12 >= var11) {
                        p.a(1);
                        nm.field_d = false;
                        stackOut_47_0 = 100 + var11;
                        stackIn_48_0 = stackOut_47_0;
                        return stackIn_48_0;
                      } else {
                        ho.field_a[var12] = fj.field_g.d(19988);
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
              } else {
                break L10;
              }
            }
            L12: {
              if (qo.field_w != ic.field_T) {
                break L12;
              } else {
                int discarded$5 = -2887;
                if (!nn.a()) {
                  break L12;
                } else {
                  L13: {
                    if (l.field_d != 255) {
                      sc.field_d = fj.field_g.a(true);
                      break L13;
                    } else {
                      var9_ref_String = fj.field_g.h(-1);
                      if (var9_ref_String == null) {
                        break L13;
                      } else {
                        qg.a(165, hc.a(0), var9_ref_String);
                        break L13;
                      }
                    }
                  }
                  p.a(1);
                  nm.field_d = false;
                  stackOut_55_0 = l.field_d;
                  stackIn_56_0 = stackOut_55_0;
                  return stackIn_56_0;
                }
              }
            }
            L14: {
              if (null != sn.field_c) {
                break L14;
              } else {
                if (nm.field_d) {
                  L15: {
                    if (30000L >= gd.a(-127)) {
                      sc.field_d = rl.field_a;
                      break L15;
                    } else {
                      sc.field_d = dl.field_b;
                      break L15;
                    }
                  }
                  nm.field_d = false;
                  stackOut_63_0 = 249;
                  stackIn_64_0 = stackOut_63_0;
                  return stackIn_64_0;
                } else {
                  var9 = ci.field_c;
                  ci.field_c = cn.field_j;
                  nm.field_d = true;
                  cn.field_j = var9;
                  break L14;
                }
              }
            }
            stackOut_65_0 = -1;
            stackIn_66_0 = stackOut_65_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var7 = decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) var7;
            stackOut_67_1 = new StringBuilder().append("bg.B(").append(105).append(44).append(param1).append(44);
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param2 == null) {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L16;
            } else {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L16;
            }
          }
          L17: {
            stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
            stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(44);
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param3 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L17;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L17;
            }
          }
          L18: {
            stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
            stackOut_73_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(44);
            stackIn_75_0 = stackOut_73_0;
            stackIn_75_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param4 == null) {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L18;
            } else {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "{...}";
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_76_2 = stackOut_74_2;
              break L18;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_76_0, stackIn_76_2 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_66_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Quit";
        field_i = new vo();
        field_k = 2;
        field_l = new vk();
    }
}
