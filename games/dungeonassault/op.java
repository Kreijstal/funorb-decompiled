/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class op {
    static nn field_d;
    static String field_a;
    static String field_b;
    static int[] field_c;

    final static void a(int param0, int param1) {
        try {
            Throwable decompiledCaughtException = null;
            L0: {
              if (null == sp.field_c) {
                break L0;
              } else {
                L1: {
                  if (param1 < 0) {
                    break L1;
                  } else {
                    if (pd.field_A == qa.field_c) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
                L2: {
                  if (param0 != ac.field_B.field_o) {
                    break L2;
                  } else {
                    if (kd.c(-2456) > 10000L + wh.field_e) {
                      ac.field_B.d((byte) -91, param1);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (0 >= ac.field_B.field_o) {
                    break L3;
                  } else {
                    {
                      L4: {
                        sp.field_c.b(ac.field_B.field_m, false, 0, ac.field_B.field_o);
                        wh.field_e = kd.c(-2456);
                        break L4;
                      }
                    }
                    ac.field_B.field_o = 0;
                    break L3;
                  }
                }
                return;
              }
            }
            ac.field_B.field_o = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(cd param0, int param1, int param2, cd param3, String param4, int param5, boolean param6) {
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
        ec stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        ec stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        ec stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        String stackIn_13_2 = null;
        ec stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        ec stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        ec stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        String stackIn_16_2 = null;
        int stackIn_34_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_64_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        ec stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        ec stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        String stackOut_12_2 = null;
        ec stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        String stackOut_11_2 = null;
        ec stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        ec stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        String stackOut_15_2 = null;
        ec stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        String stackOut_14_2 = null;
        int stackOut_33_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_63_0 = 0;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
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
        var13 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (param5 <= -47) {
                break L1;
              } else {
                op.a(3, -113);
                break L1;
              }
            }
            L2: {
              var14 = param0.b(-1);
              var11_ref_String = var14;
              var11_ref_String = var14;
              var8 = param3.b(-1);
              var11_ref_String = var8;
              var11_ref_String = var8;
              if (null != sp.field_c) {
                break L2;
              } else {
                if (!rj.a((byte) 83, false)) {
                  stackOut_6_0 = -1;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (no.field_c != pd.field_A) {
                break L3;
              } else {
                L4: {
                  fj.field_e = null;
                  ac.field_B.field_o = 0;
                  if (param4 != null) {
                    L5: {
                      var9 = 0;
                      if (!param6) {
                        break L5;
                      } else {
                        var9 = var9 | 1;
                        break L5;
                      }
                    }
                    L6: {
                      ta.field_c.field_o = 0;
                      ta.field_c.a((byte) 63, bl.field_i.nextInt());
                      ta.field_c.a((byte) 63, bl.field_i.nextInt());
                      ta.field_c.a(2, var14);
                      ta.field_c.a(2, var8);
                      var15 = (CharSequence) (Object) param4;
                      int discarded$3 = -1;
                      ta.field_c.a(2, qf.a(var15));
                      ta.field_c.i(param1, -86);
                      ta.field_c.a(6, param2);
                      ta.field_c.a(6, var9);
                      ac.field_B.a(6, 18);
                      ac.field_B.field_o = ac.field_B.field_o + 2;
                      var10 = ac.field_B.field_o;
                      var11_ref_String = oj.a(m.c(true), (byte) -21);
                      if (var11_ref_String != null) {
                        break L6;
                      } else {
                        var11_ref_String = "";
                        break L6;
                      }
                    }
                    ac.field_B.b(var11_ref_String, (byte) -20);
                    of.a((ec) (Object) ac.field_B, kd.field_d, om.field_c, (byte) -120, ta.field_c);
                    ac.field_B.b(-var10 + ac.field_B.field_o, 1);
                    break L4;
                  } else {
                    L7: {
                      ta.field_c.field_o = 0;
                      ta.field_c.a((byte) 63, bl.field_i.nextInt());
                      ta.field_c.a((byte) 63, bl.field_i.nextInt());
                      stackOut_10_0 = ta.field_c;
                      stackOut_10_1 = 2;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      if (!param0.a((byte) -102)) {
                        stackOut_12_0 = (ec) (Object) stackIn_12_0;
                        stackOut_12_1 = stackIn_12_1;
                        stackOut_12_2 = "";
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        stackIn_13_2 = stackOut_12_2;
                        break L7;
                      } else {
                        stackOut_11_0 = (ec) (Object) stackIn_11_0;
                        stackOut_11_1 = stackIn_11_1;
                        stackOut_11_2 = (String) var14;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        stackIn_13_2 = stackOut_11_2;
                        break L7;
                      }
                    }
                    L8: {
                      ((ec) (Object) stackIn_13_0).a(stackIn_13_1, stackIn_13_2);
                      stackOut_13_0 = ta.field_c;
                      stackOut_13_1 = 2;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      if (param3.a((byte) 123)) {
                        stackOut_15_0 = (ec) (Object) stackIn_15_0;
                        stackOut_15_1 = stackIn_15_1;
                        stackOut_15_2 = (String) var8;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        stackIn_16_2 = stackOut_15_2;
                        break L8;
                      } else {
                        stackOut_14_0 = (ec) (Object) stackIn_14_0;
                        stackOut_14_1 = stackIn_14_1;
                        stackOut_14_2 = "";
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        stackIn_16_2 = stackOut_14_2;
                        break L8;
                      }
                    }
                    ((ec) (Object) stackIn_16_0).a(stackIn_16_1, stackIn_16_2);
                    ac.field_B.a(6, 16);
                    ac.field_B.field_o = ac.field_B.field_o + 1;
                    var9 = ac.field_B.field_o;
                    of.a((ec) (Object) ac.field_B, kd.field_d, om.field_c, (byte) -116, ta.field_c);
                    ac.field_B.c(ac.field_B.field_o + -var9, -1);
                    break L4;
                  }
                }
                op.a(0, -1);
                pd.field_A = kp.field_b;
                break L3;
              }
            }
            L9: {
              if (pd.field_A == kp.field_b) {
                if (!oi.a(-12929, 1)) {
                  break L9;
                } else {
                  L10: {
                    var9 = ra.field_c.c(true);
                    ra.field_c.field_o = 0;
                    if (var9 < 100) {
                      break L10;
                    } else {
                      if (105 < var9) {
                        break L10;
                      } else {
                        pd.field_A = jg.field_a;
                        mf.field_c = new String[-100 + var9];
                        break L9;
                      }
                    }
                  }
                  if (248 == var9) {
                    np.a((byte) -126, m.c(true));
                    tp.field_v = m.field_f;
                    tl.a(-84);
                    nh.field_e = false;
                    stackOut_33_0 = var9;
                    stackIn_34_0 = stackOut_33_0;
                    return stackIn_34_0;
                  } else {
                    if (99 == var9) {
                      boolean discarded$4 = oi.a(-12929, la.a(23940));
                      int discarded$5 = -127;
                      fj.field_e = new Boolean(fm.a((ec) (Object) ra.field_c));
                      ra.field_c.field_o = 0;
                      break L9;
                    } else {
                      nj.field_b = -1;
                      hc.field_c = var9;
                      pd.field_A = sd.field_G;
                      break L9;
                    }
                  }
                }
              } else {
                break L9;
              }
            }
            L11: {
              if (pd.field_A == jg.field_a) {
                var9 = 2;
                if (oi.a(-12929, var9)) {
                  var10 = ra.field_c.k(0);
                  ra.field_c.field_o = 0;
                  if (oi.a(-12929, var10)) {
                    var11 = mf.field_c.length;
                    var12 = 0;
                    L12: while (true) {
                      if (var11 <= var12) {
                        tl.a(-60);
                        nh.field_e = false;
                        stackOut_44_0 = var11 + 100;
                        stackIn_45_0 = stackOut_44_0;
                        return stackIn_45_0;
                      } else {
                        mf.field_c[var12] = ra.field_c.a(-21030);
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
              if (pd.field_A == sd.field_G) {
                if (!kh.d((byte) -75)) {
                  break L13;
                } else {
                  L14: {
                    if (hc.field_c != 255) {
                      tp.field_v = ra.field_c.d(-101);
                      break L14;
                    } else {
                      var9_ref_String = ra.field_c.b(true);
                      if (var9_ref_String == null) {
                        break L14;
                      } else {
                        jb.a(true, var9_ref_String, m.c(true));
                        break L14;
                      }
                    }
                  }
                  tl.a(-59);
                  nh.field_e = false;
                  stackOut_53_0 = hc.field_c;
                  stackIn_54_0 = stackOut_53_0;
                  return stackIn_54_0;
                }
              } else {
                break L13;
              }
            }
            L15: {
              if (null != sp.field_c) {
                break L15;
              } else {
                if (!nh.field_e) {
                  var9 = an.field_E;
                  an.field_E = l.field_b;
                  nh.field_e = true;
                  l.field_b = var9;
                  break L15;
                } else {
                  L16: {
                    if (30000L >= b.a(119)) {
                      tp.field_v = fc.field_l;
                      break L16;
                    } else {
                      tp.field_v = lh.field_r;
                      break L16;
                    }
                  }
                  nh.field_e = false;
                  stackOut_60_0 = 249;
                  stackIn_61_0 = stackOut_60_0;
                  return stackIn_61_0;
                }
              }
            }
            stackOut_63_0 = -1;
            stackIn_64_0 = stackOut_63_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var7 = decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) var7;
            stackOut_65_1 = new StringBuilder().append("op.A(");
            stackIn_67_0 = stackOut_65_0;
            stackIn_67_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param0 == null) {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L17;
            } else {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "{...}";
              stackIn_68_0 = stackOut_66_0;
              stackIn_68_1 = stackOut_66_1;
              stackIn_68_2 = stackOut_66_2;
              break L17;
            }
          }
          L18: {
            stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
            stackOut_68_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param3 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L18;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L18;
            }
          }
          L19: {
            stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(44);
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param4 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L19;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L19;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_74_0, stackIn_74_2 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_64_0;
    }

    public static void a(byte param0) {
        field_d = null;
        field_c = null;
        if (param0 > -8) {
            op.a((byte) -85);
        }
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Dark Elf Assassin";
        field_a = "Orb points: ";
    }
}
