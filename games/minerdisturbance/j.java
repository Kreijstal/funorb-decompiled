/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j implements Runnable {
    volatile fj[] field_g;
    vf field_c;
    static m field_h;
    static long field_f;
    static String field_e;
    volatile boolean field_b;
    static String field_a;
    static ma field_d;
    volatile boolean field_i;

    final static int a(int param0, int param1, boolean param2, int param3, pf param4, String param5, pf param6) {
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
        int stackIn_6_0 = 0;
        sb stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        sb stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        sb stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        String stackIn_13_2 = null;
        sb stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        sb stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        sb stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        String stackIn_16_2 = null;
        int stackIn_35_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_53_0 = 0;
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
        int stackOut_5_0 = 0;
        sb stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        sb stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        String stackOut_12_2 = null;
        sb stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        String stackOut_11_2 = null;
        sb stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        sb stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        String stackOut_15_2 = null;
        sb stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        String stackOut_14_2 = null;
        int stackOut_34_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_52_0 = 0;
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
        var13 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              var14 = param6.a((byte) 69);
              if (param1 <= -34) {
                break L1;
              } else {
                field_e = null;
                break L1;
              }
            }
            L2: {
              var8 = param4.a((byte) 80);
              if (null != ci.field_i) {
                break L2;
              } else {
                if (ed.a(false, (byte) 38)) {
                  break L2;
                } else {
                  stackOut_5_0 = -1;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0;
                }
              }
            }
            L3: {
              if (qd.field_Q == cm.field_p) {
                L4: {
                  mf.field_a = null;
                  sn.field_c.field_o = 0;
                  if (param5 != null) {
                    L5: {
                      var9 = 0;
                      rf.field_c.field_o = 0;
                      if (!param2) {
                        break L5;
                      } else {
                        var9 = var9 | 1;
                        break L5;
                      }
                    }
                    L6: {
                      rf.field_c.a((byte) 106, dk.field_a.nextInt());
                      rf.field_c.a((byte) 96, dk.field_a.nextInt());
                      rf.field_c.a(8, var14);
                      rf.field_c.a(8, var8);
                      var15 = (CharSequence) (Object) param5;
                      rf.field_c.a(8, tk.a(732, var15));
                      rf.field_c.b((byte) 123, param3);
                      rf.field_c.c(param0, 25564);
                      rf.field_c.c(var9, 25564);
                      sn.field_c.c(18, 25564);
                      sn.field_c.field_o = sn.field_c.field_o + 2;
                      var10 = sn.field_c.field_o;
                      var11_ref_String = ag.a(bm.c(-104), true);
                      if (var11_ref_String == null) {
                        var11_ref_String = "";
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    sn.field_c.b(23446, var11_ref_String);
                    jg.a(kc.field_b, -121, rf.field_c, ph.field_g, (sb) (Object) sn.field_c);
                    sn.field_c.b(-var10 + sn.field_c.field_o, -506270856);
                    break L4;
                  } else {
                    L7: {
                      rf.field_c.field_o = 0;
                      rf.field_c.a((byte) 124, dk.field_a.nextInt());
                      rf.field_c.a((byte) 127, dk.field_a.nextInt());
                      stackOut_10_0 = rf.field_c;
                      stackOut_10_1 = 8;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      if (!param6.b((byte) 112)) {
                        stackOut_12_0 = (sb) (Object) stackIn_12_0;
                        stackOut_12_1 = stackIn_12_1;
                        stackOut_12_2 = "";
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        stackIn_13_2 = stackOut_12_2;
                        break L7;
                      } else {
                        stackOut_11_0 = (sb) (Object) stackIn_11_0;
                        stackOut_11_1 = stackIn_11_1;
                        stackOut_11_2 = (String) var14;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        stackIn_13_2 = stackOut_11_2;
                        break L7;
                      }
                    }
                    L8: {
                      ((sb) (Object) stackIn_13_0).a(stackIn_13_1, stackIn_13_2);
                      stackOut_13_0 = rf.field_c;
                      stackOut_13_1 = 8;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      if (param4.b((byte) 88)) {
                        stackOut_15_0 = (sb) (Object) stackIn_15_0;
                        stackOut_15_1 = stackIn_15_1;
                        stackOut_15_2 = (String) var8;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        stackIn_16_2 = stackOut_15_2;
                        break L8;
                      } else {
                        stackOut_14_0 = (sb) (Object) stackIn_14_0;
                        stackOut_14_1 = stackIn_14_1;
                        stackOut_14_2 = "";
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        stackIn_16_2 = stackOut_14_2;
                        break L8;
                      }
                    }
                    ((sb) (Object) stackIn_16_0).a(stackIn_16_1, stackIn_16_2);
                    sn.field_c.c(16, 25564);
                    sn.field_c.field_o = sn.field_c.field_o + 1;
                    var9 = sn.field_c.field_o;
                    jg.a(kc.field_b, -127, rf.field_c, ph.field_g, (sb) (Object) sn.field_c);
                    sn.field_c.g(-1, sn.field_c.field_o - var9);
                    break L4;
                  }
                }
                bk.a((byte) -114, -1);
                qd.field_Q = jn.field_r;
                break L3;
              } else {
                break L3;
              }
            }
            L9: {
              if (qd.field_Q != jn.field_r) {
                break L9;
              } else {
                if (ta.a(0, 1)) {
                  L10: {
                    var9 = kj.field_a.d((byte) -54);
                    kj.field_a.field_o = 0;
                    if (var9 < 100) {
                      break L10;
                    } else {
                      if (105 >= var9) {
                        qd.field_Q = lm.field_M;
                        vh.field_i = new String[var9 - 100];
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  if (248 == var9) {
                    ri.a((byte) -125, bm.c(-99));
                    nf.field_g = d.field_a;
                    si.a(-98);
                    ek.field_c = false;
                    stackOut_34_0 = var9;
                    stackIn_35_0 = stackOut_34_0;
                    return stackIn_35_0;
                  } else {
                    if (var9 != 99) {
                      rj.field_d = -1;
                      oj.field_K = var9;
                      qd.field_Q = aa.field_l;
                      break L9;
                    } else {
                      boolean discarded$1 = ta.a(0, hl.a(-92));
                      mf.field_a = new Boolean(bh.a((sb) (Object) kj.field_a, -29320));
                      kj.field_a.field_o = 0;
                      break L9;
                    }
                  }
                } else {
                  break L9;
                }
              }
            }
            L11: {
              if (lm.field_M != qd.field_Q) {
                break L11;
              } else {
                var9 = 2;
                if (!ta.a(0, var9)) {
                  break L11;
                } else {
                  var10 = kj.field_a.e(-25);
                  kj.field_a.field_o = 0;
                  if (!ta.a(0, var10)) {
                    break L11;
                  } else {
                    var11 = vh.field_i.length;
                    var12 = 0;
                    L12: while (true) {
                      if (var12 >= var11) {
                        si.a(-34);
                        ek.field_c = false;
                        stackOut_43_0 = var11 + 100;
                        stackIn_44_0 = stackOut_43_0;
                        return stackIn_44_0;
                      } else {
                        vh.field_i[var12] = kj.field_a.g(-1);
                        var12++;
                        continue L12;
                      }
                    }
                  }
                }
              }
            }
            L13: {
              if (qd.field_Q == aa.field_l) {
                if (!kj.b(-9319)) {
                  break L13;
                } else {
                  L14: {
                    if (oj.field_K != 255) {
                      nf.field_g = kj.field_a.a(false);
                      break L14;
                    } else {
                      var9_ref_String = kj.field_a.j(81);
                      if (var9_ref_String == null) {
                        break L14;
                      } else {
                        nc.a(bm.c(-76), var9_ref_String, (byte) 115);
                        break L14;
                      }
                    }
                  }
                  si.a(-82);
                  ek.field_c = false;
                  stackOut_52_0 = oj.field_K;
                  stackIn_53_0 = stackOut_52_0;
                  return stackIn_53_0;
                }
              } else {
                break L13;
              }
            }
            L15: {
              if (ci.field_i == null) {
                if (!ek.field_c) {
                  var9 = jc.field_E;
                  jc.field_E = ic.field_h;
                  ek.field_c = true;
                  ic.field_h = var9;
                  break L15;
                } else {
                  L16: {
                    if (qa.a(-112) > 30000L) {
                      nf.field_g = oi.field_K;
                      break L16;
                    } else {
                      nf.field_g = l.field_a;
                      break L16;
                    }
                  }
                  ek.field_c = false;
                  stackOut_60_0 = 249;
                  stackIn_61_0 = stackOut_60_0;
                  return stackIn_61_0;
                }
              } else {
                break L15;
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
            stackOut_65_1 = new StringBuilder().append("j.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_67_0 = stackOut_65_0;
            stackIn_67_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param4 == null) {
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
            stackOut_68_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(',');
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param5 == null) {
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
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',');
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param6 == null) {
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
          throw lj.a((Throwable) (Object) stackIn_74_0, stackIn_74_2 + ')');
        }
        return stackIn_64_0;
    }

    public static void a(int param0) {
        field_e = null;
        field_a = null;
        field_d = null;
    }

    public final void run() {
        int var1_int = 0;
        fj var2 = null;
        int var4 = MinerDisturbance.field_ab;
        ((j) this).field_i = true;
        try {
            while (!((j) this).field_b) {
                for (var1_int = 0; var1_int < 2; var1_int++) {
                    var2 = ((j) this).field_g[var1_int];
                    if (var2 != null) {
                        var2.e();
                    }
                }
                gf.a(10L, -10309);
                Object var5 = null;
                jk.a(-23765, ((j) this).field_c, (Object) null);
            }
        } catch (Exception exception) {
            Object var6 = null;
            di.a((Throwable) (Object) exception, 1, (String) null);
        } finally {
            ((j) this).field_i = false;
        }
    }

    final static int a(int param0, int param1) {
        int var2 = -13 % ((param1 - 7) / 38);
        param0 = param0 & 8191;
        if (param0 < 4096) {
            return 2048 > param0 ? ta.field_g[2048 - param0] : -ta.field_g[-2048 + param0];
        }
        return param0 >= 6144 ? ta.field_g[param0 - 6144] : -ta.field_g[6144 - param0];
    }

    final static boolean a(byte param0) {
        return ci.field_e == bd.field_h;
    }

    j() {
        ((j) this).field_g = new fj[2];
        ((j) this).field_b = false;
        ((j) this).field_i = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = null;
        field_e = "Mining map: Displays the map of the volcano.";
        field_a = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
    }
}
