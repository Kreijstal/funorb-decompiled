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

    public static void c(byte param0) {
        if (param0 != -44) {
            bg.a(-106, 54, false, -127);
        }
        field_o = null;
        field_i = null;
        field_n = null;
        field_l = null;
    }

    bg(long param0, int param1, byte[] param2) {
        try {
            this.field_h = param0;
            this.field_m = param2;
            this.field_j = param1;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "bg.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, int param1, boolean param2, int param3) {
        int var4 = -43 % ((-39 - param0) / 61);
        return qo.b((byte) -123);
    }

    final static boolean a(int param0) {
        if (param0 != 2) {
            field_k = -82;
        }
        return (rc.field_x ^ -1) != (rc.field_p ^ -1) ? true : false;
    }

    final static int a(int param0, int param1, ji param2, String param3, ji param4, int param5, boolean param6) {
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        de stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        de stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        String stackIn_21_2 = null;
        de stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        de stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        String stackIn_24_2 = null;
        int stackIn_34_0 = 0;
        int stackIn_49_0 = 0;
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
        String var14 = null;
        CharSequence var15 = null;
        var13 = ZombieDawn.field_J;
        try {
          L0: {
            var14 = param2.a(-1);
            var11_ref_String = var14;
            var11_ref_String = var14;
            var8 = param4.a(param0 ^ -106);
            var11_ref_String = var8;
            var11_ref_String = var8;
            if (param0 == 105) {
              L1: {
                if (sn.field_c != null) {
                  break L1;
                } else {
                  if (!i.a(false, true)) {
                    stackIn_8_0 = -1;
                    decompiledRegionSelector0 = 1;
                    break L0;
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
                        stackIn_20_0 = dh.field_e;

                        stackIn_20_1 = -88;

                        if (!param2.b(32)) {
                          stackIn_21_0 = (de) ((Object) stackIn_20_0);
                          stackIn_21_1 = stackIn_20_1;
                          stackIn_21_2 = "";
                          break L4;
                        } else {
                          stackIn_21_0 = (de) ((Object) stackIn_20_0);
                          stackIn_21_1 = stackIn_20_1;
                          stackIn_21_2 = (String) (var14);
                          break L4;
                        }
                      }
                      L5: {
                        ((de) (Object) stackIn_21_0).a((byte) stackIn_21_1, stackIn_21_2);
                        stackIn_23_0 = dh.field_e;

                        stackIn_23_1 = -88;

                        if (!param4.b(param0 ^ 73)) {
                          stackIn_24_0 = (de) ((Object) stackIn_23_0);
                          stackIn_24_1 = stackIn_23_1;
                          stackIn_24_2 = "";
                          break L5;
                        } else {
                          stackIn_24_0 = (de) ((Object) stackIn_23_0);
                          stackIn_24_1 = stackIn_23_1;
                          stackIn_24_2 = (String) (var8);
                          break L5;
                        }
                      }
                      ((de) (Object) stackIn_24_0).a((byte) stackIn_24_1, stackIn_24_2);
                      dp.field_e.i(16, 64);
                      dp.field_e.field_j = dp.field_e.field_j + 1;
                      var9 = dp.field_e.field_j;
                      ab.a(dh.field_e, pm.field_c, (byte) 108, dp.field_e, pj.field_p);
                      dp.field_e.d(param0 + -211, -var9 + dp.field_e.field_j);
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
                        var15 = (CharSequence) ((Object) param3);
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
                      dp.field_e.a(param0 + 23, var11_ref_String);
                      ab.a(dh.field_e, pm.field_c, (byte) -109, dp.field_e, pj.field_p);
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
                      if ((var9 ^ -1) > -101) {
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
                        ck.a((byte) -103, lo.a(false));
                        ba.field_g = new Boolean(uh.a((byte) -36, fj.field_g));
                        fj.field_g.field_j = 0;
                        break L8;
                      }
                    } else {
                      jc.a((byte) 34, hc.a(0));
                      sc.field_d = wk.field_z;
                      p.a(param0 + -104);
                      nm.field_d = false;
                      stackIn_34_0 = var9;
                      decompiledRegionSelector0 = 2;
                      break L0;
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
                    var10 = fj.field_g.f(param0 ^ 107);
                    fj.field_g.field_j = 0;
                    if (ck.a((byte) -100, var10)) {
                      var11 = ho.field_a.length;
                      var12 = 0;
                      L11: while (true) {
                        if (var12 >= var11) {
                          p.a(1);
                          nm.field_d = false;
                          stackIn_49_0 = 100 + var11;
                          decompiledRegionSelector0 = 3;
                          break L0;
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
                  if (!nn.a(-2887)) {
                    break L12;
                  } else {
                    L13: {
                      if ((l.field_d ^ -1) != -256) {
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
                    stackIn_57_0 = l.field_d;
                    decompiledRegionSelector0 = 4;
                    break L0;
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
                    stackIn_65_0 = 249;
                    decompiledRegionSelector0 = 5;
                    break L0;
                  } else {
                    var9 = ci.field_c;
                    ci.field_c = cn.field_j;
                    nm.field_d = true;
                    cn.field_j = var9;
                    break L14;
                  }
                }
              }
              stackIn_67_0 = -1;
              decompiledRegionSelector0 = 6;
              break L0;
            } else {
              stackIn_3_0 = 44;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var7 = decompiledCaughtException;
            stackIn_70_0 = (RuntimeException) (var7);

            stackIn_70_1 = new StringBuilder().append("bg.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "null";
              break L16;
            } else {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "{...}";
              break L16;
            }
          }
          L17: {


            stackIn_73_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',');

            if (param3 == null) {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "null";
              break L17;
            } else {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "{...}";
              break L17;
            }
          }
          L18: {


            stackIn_76_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(',');

            if (param4 == null) {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackIn_77_2 = "null";
              break L18;
            } else {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackIn_77_2 = "{...}";
              break L18;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_71_0), stackIn_77_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_34_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_49_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_57_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_65_0;
                  } else {
                    return stackIn_67_0;
                  }
                }
              }
            }
          }
        }
    }

    static {
        field_n = "Quit";
        field_i = new vo();
        field_k = 2;
        field_l = new vk();
    }
}
