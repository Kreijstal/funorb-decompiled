/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ha {
    int field_b;
    static bk field_d;
    private static cc field_a;
    static String field_c;

    final static String a(CharSequence param0, int param1, boolean param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        String stackIn_3_0 = null;
        String stackIn_11_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_10_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var5 = Main.field_T;
        try {
          var3 = jl.a(false, param0, false);
          if (var3 == null) {
            L0: {
              if (param1 == -30773) {
                break L0;
              } else {
                var6 = null;
                String discarded$2 = ha.a((CharSequence) null, 19, false);
                break L0;
              }
            }
            var4 = 0;
            L1: while (true) {
              if (var4 < param0.length()) {
                if (fd.a(true, param0.charAt(var4))) {
                  var4++;
                  continue L1;
                } else {
                  stackOut_10_0 = nf.field_a;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              } else {
                return null;
              }
            }
          } else {
            stackOut_2_0 = (String) var3;
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("ha.C(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ',' + false + ')');
        }
    }

    final static int a(boolean param0, String param1, int param2, boolean param3, int param4, String param5) {
        try {
            RuntimeException var6 = null;
            int var6_int = 0;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            Object var10 = null;
            String var11 = null;
            CharSequence var12 = null;
            int stackIn_6_0 = 0;
            int stackIn_29_0 = 0;
            int stackIn_43_0 = 0;
            int stackIn_46_0 = 0;
            int stackIn_73_0 = 0;
            int stackIn_79_0 = 0;
            int stackIn_84_0 = 0;
            int stackIn_95_0 = 0;
            int stackIn_97_0 = 0;
            RuntimeException stackIn_99_0 = null;
            StringBuilder stackIn_99_1 = null;
            RuntimeException stackIn_100_0 = null;
            StringBuilder stackIn_100_1 = null;
            RuntimeException stackIn_101_0 = null;
            StringBuilder stackIn_101_1 = null;
            String stackIn_101_2 = null;
            RuntimeException stackIn_102_0 = null;
            StringBuilder stackIn_102_1 = null;
            RuntimeException stackIn_103_0 = null;
            StringBuilder stackIn_103_1 = null;
            RuntimeException stackIn_104_0 = null;
            StringBuilder stackIn_104_1 = null;
            String stackIn_104_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_5_0 = 0;
            int stackOut_28_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_45_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_72_0 = 0;
            int stackOut_78_0 = 0;
            int stackOut_83_0 = 0;
            int stackOut_94_0 = 0;
            int stackOut_96_0 = 0;
            RuntimeException stackOut_98_0 = null;
            StringBuilder stackOut_98_1 = null;
            RuntimeException stackOut_100_0 = null;
            StringBuilder stackOut_100_1 = null;
            String stackOut_100_2 = null;
            RuntimeException stackOut_99_0 = null;
            StringBuilder stackOut_99_1 = null;
            String stackOut_99_2 = null;
            RuntimeException stackOut_101_0 = null;
            StringBuilder stackOut_101_1 = null;
            RuntimeException stackOut_103_0 = null;
            StringBuilder stackOut_103_1 = null;
            String stackOut_103_2 = null;
            RuntimeException stackOut_102_0 = null;
            StringBuilder stackOut_102_1 = null;
            String stackOut_102_2 = null;
            var9 = Main.field_T;
            try {
              L0: {
                L1: {
                  if (null == cb.field_j) {
                    if (!md.a(113, param3)) {
                      stackOut_5_0 = -1;
                      stackIn_6_0 = stackOut_5_0;
                      return stackIn_6_0;
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (vf.field_a != ra.field_b) {
                    break L2;
                  } else {
                    L3: {
                      if (param3) {
                        var10 = null;
                        sh.field_k = nk.a(-108, false, cd.field_a, (String) null, param1);
                        break L3;
                      } else {
                        sh.field_k = tb.a(param1, param5, (byte) -18, false);
                        break L3;
                      }
                    }
                    na.field_r.field_i = 0;
                    na.field_r.b(-9469, 14);
                    na.field_r.b(-9469, sh.field_k.a((byte) -24).field_b);
                    fe.a((byte) -118, -1);
                    ra.field_b = vd.field_q;
                    break L2;
                  }
                }
                L4: {
                  if (ra.field_b != vd.field_q) {
                    break L4;
                  } else {
                    if (!r.a(1, (byte) 122)) {
                      break L4;
                    } else {
                      L5: {
                        var6_int = rd.field_j.f(94);
                        if (var6_int == 0) {
                          ra.field_b = ab.field_w;
                          break L5;
                        } else {
                          ra.field_b = field_a;
                          al.field_a = -1;
                          pd.field_l = var6_int;
                          break L5;
                        }
                      }
                      rd.field_j.field_i = 0;
                      break L4;
                    }
                  }
                }
                L6: {
                  if (ab.field_w != ra.field_b) {
                    break L6;
                  } else {
                    if (r.a(8, (byte) 127)) {
                      hb.field_b = rd.field_j.d(true);
                      rd.field_j.field_i = 0;
                      jc.a(param4, (byte) -111, param3, sh.field_k, param0);
                      ra.field_b = rk.field_eb;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (rk.field_eb != ra.field_b) {
                    break L7;
                  } else {
                    if (r.a(1, (byte) 121)) {
                      L8: {
                        var6_int = rd.field_j.f(34);
                        pd.field_l = var6_int;
                        ia.field_b = null;
                        rd.field_j.field_i = 0;
                        if (0 == var6_int) {
                          break L8;
                        } else {
                          if (1 == var6_int) {
                            break L8;
                          } else {
                            if (var6_int != 8) {
                              al.field_a = -1;
                              ra.field_b = field_a;
                              break L7;
                            } else {
                              mc.a((byte) -126);
                              lk.field_w = false;
                              stackOut_28_0 = var6_int;
                              stackIn_29_0 = stackOut_28_0;
                              return stackIn_29_0;
                            }
                          }
                        }
                      }
                      al.field_a = -1;
                      ra.field_b = vg.field_a;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                L9: {
                  if (ra.field_b == vg.field_a) {
                    if (gl.a(false)) {
                      L10: {
                        cd.field_a = rd.field_j.d(true);
                        ec.field_f = rd.field_j.f(-109);
                        int discarded$6 = rd.field_j.f(-103);
                        d.field_c = rd.field_j.d((byte) 72);
                        var11 = rd.field_j.f((byte) 29);
                        var7 = rd.field_j.f(113);
                        if (0 == (var7 & 1)) {
                          break L10;
                        } else {
                          bd.d((byte) -86);
                          break L10;
                        }
                      }
                      L11: {
                        if (!param3) {
                          L12: {
                            if ((var7 & 4) == 0) {
                              stackOut_42_0 = 0;
                              stackIn_43_0 = stackOut_42_0;
                              break L12;
                            } else {
                              stackOut_41_0 = 1;
                              stackIn_43_0 = stackOut_41_0;
                              break L12;
                            }
                          }
                          L13: {
                            bi.field_c = stackIn_43_0 != 0;
                            if ((8 & var7) == 0) {
                              stackOut_45_0 = 0;
                              stackIn_46_0 = stackOut_45_0;
                              break L13;
                            } else {
                              stackOut_44_0 = 1;
                              stackIn_46_0 = stackOut_44_0;
                              break L13;
                            }
                          }
                          da.field_b = stackIn_46_0 != 0;
                          if (da.field_b) {
                            break L11;
                          } else {
                            break L11;
                          }
                        } else {
                          break L11;
                        }
                      }
                      L14: {
                        if (!bj.field_m) {
                          break L14;
                        } else {
                          int discarded$7 = rd.field_j.f(124);
                          int discarded$8 = rd.field_j.f(101);
                          int discarded$9 = rd.field_j.e((byte) 125);
                          pb.field_j = rd.field_j.d((byte) 72);
                          fb.field_d = new byte[pb.field_j];
                          var8 = 0;
                          L15: while (true) {
                            if (~var8 <= ~pb.field_j) {
                              break L14;
                            } else {
                              fb.field_d[var8] = rd.field_j.a(true);
                              var8++;
                              continue L15;
                            }
                          }
                        }
                      }
                      L16: {
                        ri.field_c = rd.field_j.c(false);
                        var12 = (CharSequence) (Object) ri.field_c;
                        aa.field_fb = ff.a((byte) 116, var12);
                        qb.field_b = rd.field_j.f(-117);
                        ra.field_b = ad.field_q;
                        if (sh.field_k.a((byte) -24) != tf.field_o) {
                          if (sh.field_k.a((byte) -24) == hc.field_h) {
                            oj.field_e.a(mk.g(-120), 0);
                            break L16;
                          } else {
                            break L16;
                          }
                        } else {
                          ke.field_c.a(mk.g(-125), 0);
                          break L16;
                        }
                      }
                      L17: {
                        lk.field_w = false;
                        if (var11 == null) {
                          break L17;
                        } else {
                          lk.a(mk.g(-128), 0, var11);
                          break L17;
                        }
                      }
                      L18: {
                        L19: {
                          if (d.field_c > 0) {
                            break L19;
                          } else {
                            if (bi.field_c) {
                              break L19;
                            } else {
                              try {
                                L20: {
                                  Object discarded$10 = vh.a("unzap", -12151, mk.g(-125));
                                  break L20;
                                }
                              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                                decompiledCaughtException = decompiledCaughtParameter0;
                                L21: {
                                  var8_ref_Throwable = decompiledCaughtException;
                                  break L21;
                                }
                              }
                              break L18;
                            }
                          }
                        }
                        try {
                          L22: {
                            Object discarded$11 = vh.a(new Object[1], "zap", (byte) 111, mk.g(-125));
                            break L22;
                          }
                        } catch (java.lang.Throwable decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L23: {
                            var8_ref_Throwable = decompiledCaughtException;
                            break L23;
                          }
                        }
                        break L18;
                      }
                      L24: {
                        if (d.field_c <= 0) {
                          break L24;
                        } else {
                          dg.field_F = true;
                          break L24;
                        }
                      }
                      na.field_r.b(kb.field_e, 8);
                      var8 = 0;
                      L25: while (true) {
                        if (var8 >= 4) {
                          rd.field_j.b(kb.field_e, 8);
                          stackOut_72_0 = pd.field_l;
                          stackIn_73_0 = stackOut_72_0;
                          return stackIn_73_0;
                        } else {
                          kb.field_e[var8] = kb.field_e[var8] + 50;
                          var8++;
                          continue L25;
                        }
                      }
                    } else {
                      break L9;
                    }
                  } else {
                    break L9;
                  }
                }
                L26: {
                  if (field_a != ra.field_b) {
                    break L26;
                  } else {
                    if (!gl.a(false)) {
                      break L26;
                    } else {
                      L27: {
                        mc.a((byte) -125);
                        if (7 != pd.field_l) {
                          break L27;
                        } else {
                          if (lk.field_w) {
                            break L27;
                          } else {
                            lk.field_w = true;
                            stackOut_78_0 = -1;
                            stackIn_79_0 = stackOut_78_0;
                            return stackIn_79_0;
                          }
                        }
                      }
                      L28: {
                        if (pd.field_l == 7) {
                          pd.field_l = 3;
                          break L28;
                        } else {
                          break L28;
                        }
                      }
                      e.field_a = rd.field_j.c(false);
                      lk.field_w = false;
                      stackOut_83_0 = pd.field_l;
                      stackIn_84_0 = stackOut_83_0;
                      return stackIn_84_0;
                    }
                  }
                }
                L29: {
                  if (param2 >= 7) {
                    break L29;
                  } else {
                    ha.a(-3);
                    break L29;
                  }
                }
                L30: {
                  if (cb.field_j == null) {
                    if (lk.field_w) {
                      L31: {
                        if (we.a((byte) 79) > 30000L) {
                          e.field_a = jf.field_k;
                          break L31;
                        } else {
                          e.field_a = e.field_f;
                          break L31;
                        }
                      }
                      lk.field_w = false;
                      stackOut_94_0 = 3;
                      stackIn_95_0 = stackOut_94_0;
                      return stackIn_95_0;
                    } else {
                      var6_int = ag.field_e;
                      ag.field_e = hj.field_l;
                      lk.field_w = true;
                      hj.field_l = var6_int;
                      break L30;
                    }
                  } else {
                    break L30;
                  }
                }
                stackOut_96_0 = -1;
                stackIn_97_0 = stackOut_96_0;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L32: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_98_0 = (RuntimeException) var6;
                stackOut_98_1 = new StringBuilder().append("ha.B(").append(param0).append(',');
                stackIn_100_0 = stackOut_98_0;
                stackIn_100_1 = stackOut_98_1;
                stackIn_99_0 = stackOut_98_0;
                stackIn_99_1 = stackOut_98_1;
                if (param1 == null) {
                  stackOut_100_0 = (RuntimeException) (Object) stackIn_100_0;
                  stackOut_100_1 = (StringBuilder) (Object) stackIn_100_1;
                  stackOut_100_2 = "null";
                  stackIn_101_0 = stackOut_100_0;
                  stackIn_101_1 = stackOut_100_1;
                  stackIn_101_2 = stackOut_100_2;
                  break L32;
                } else {
                  stackOut_99_0 = (RuntimeException) (Object) stackIn_99_0;
                  stackOut_99_1 = (StringBuilder) (Object) stackIn_99_1;
                  stackOut_99_2 = "{...}";
                  stackIn_101_0 = stackOut_99_0;
                  stackIn_101_1 = stackOut_99_1;
                  stackIn_101_2 = stackOut_99_2;
                  break L32;
                }
              }
              L33: {
                stackOut_101_0 = (RuntimeException) (Object) stackIn_101_0;
                stackOut_101_1 = ((StringBuilder) (Object) stackIn_101_1).append(stackIn_101_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
                stackIn_103_0 = stackOut_101_0;
                stackIn_103_1 = stackOut_101_1;
                stackIn_102_0 = stackOut_101_0;
                stackIn_102_1 = stackOut_101_1;
                if (param5 == null) {
                  stackOut_103_0 = (RuntimeException) (Object) stackIn_103_0;
                  stackOut_103_1 = (StringBuilder) (Object) stackIn_103_1;
                  stackOut_103_2 = "null";
                  stackIn_104_0 = stackOut_103_0;
                  stackIn_104_1 = stackOut_103_1;
                  stackIn_104_2 = stackOut_103_2;
                  break L33;
                } else {
                  stackOut_102_0 = (RuntimeException) (Object) stackIn_102_0;
                  stackOut_102_1 = (StringBuilder) (Object) stackIn_102_1;
                  stackOut_102_2 = "{...}";
                  stackIn_104_0 = stackOut_102_0;
                  stackIn_104_1 = stackOut_102_1;
                  stackIn_104_2 = stackOut_102_2;
                  break L33;
                }
              }
              throw ma.a((Throwable) (Object) stackIn_104_0, stackIn_104_2 + ')');
            }
            return stackIn_97_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        if (param0 >= -98) {
            field_c = null;
        }
        field_a = null;
        field_d = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new bk();
        field_a = new cc();
        field_c = "Please check if address is correct";
    }
}
