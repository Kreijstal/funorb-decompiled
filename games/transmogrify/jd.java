/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jd extends IOException {
    static int field_a;
    static int field_b;

    final static mi a(byte[] param0, int param1, ii[] param2) {
        RuntimeException var3 = null;
        int[] var3_array = null;
        int[] var4 = null;
        int var5 = 0;
        int[] var6 = null;
        int[] var7 = null;
        byte[][] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        byte[][] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        byte[][] var21 = null;
        mi stackIn_7_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        mi stackOut_6_0 = null;
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
        var10 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (256 == param2.length) {
              var17 = new int[256];
              var12 = var17;
              var11 = var12;
              var3_array = var11;
              var5 = -98 / ((-28 - param1) / 54);
              var18 = new int[256];
              var13 = var18;
              var4 = var13;
              var19 = new int[256];
              var14 = var19;
              var6 = var14;
              var20 = new int[256];
              var15 = var20;
              var7 = var15;
              var21 = new byte[256][];
              var16 = var21;
              var8 = var16;
              var9 = 0;
              L1: while (true) {
                L2: {
                  if (var9 >= 256) {
                    break L2;
                  } else {
                    var11[var9] = param2[var9].field_c;
                    var4[var9] = param2[var9].field_b;
                    var6[var9] = param2[var9].field_f;
                    var7[var9] = param2[var9].field_g;
                    var8[var9] = param2[var9].field_i;
                    var9++;
                    if (var10 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_6_0 = new mi(param0, var17, var18, var19, var20, var21);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("jd.D(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        return stackIn_7_0;
    }

    final static void a(byte param0) {
        int var1 = -128 / ((-25 - param0) / 47);
    }

    jd(String param0) {
        super(param0);
    }

    final static void a(int param0, int param1, ti[] param2, int param3, int param4, int param5, kg param6, int param7, int param8, ti[] param9, boolean param10) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              je.a(-11);
              if (!param10) {
                break L1;
              } else {
                field_a = -111;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("jd.A(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param6 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param7).append(',').append(param8).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param9 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param10 + ')');
        }
    }

    final static int a(int param0, hg param1, byte param2, String param3, int param4, boolean param5, hg param6) {
        boolean discarded$1 = false;
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
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        oa stackIn_12_0 = null;
        oa stackIn_13_0 = null;
        oa stackIn_14_0 = null;
        String stackIn_14_1 = null;
        oa stackIn_15_0 = null;
        oa stackIn_16_0 = null;
        oa stackIn_17_0 = null;
        String stackIn_17_1 = null;
        int stackIn_34_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_72_0 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        oa stackOut_11_0 = null;
        oa stackOut_13_0 = null;
        String stackOut_13_1 = null;
        oa stackOut_12_0 = null;
        String stackOut_12_1 = null;
        oa stackOut_14_0 = null;
        oa stackOut_16_0 = null;
        String stackOut_16_1 = null;
        oa stackOut_15_0 = null;
        String stackOut_15_1 = null;
        int stackOut_33_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        var13 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var14 = param6.a(false);
            var8 = param1.a(false);
            if (param2 == -9) {
              L1: {
                if (null != nk.field_b) {
                  break L1;
                } else {
                  if (gk.a(false, 127)) {
                    break L1;
                  } else {
                    stackOut_6_0 = -1;
                    stackIn_7_0 = stackOut_6_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              L2: {
                if (lj.field_z == jk.field_y) {
                  L3: {
                    L4: {
                      ch.field_f = null;
                      ff.field_D.field_h = 0;
                      if (param3 != null) {
                        break L4;
                      } else {
                        L5: {
                          d.field_d.field_h = 0;
                          d.field_d.a(param2 + -96, d.field_c.nextInt());
                          d.field_d.a(-103, d.field_c.nextInt());
                          stackOut_11_0 = d.field_d;
                          stackIn_13_0 = stackOut_11_0;
                          stackIn_12_0 = stackOut_11_0;
                          if (param6.a((byte) -121)) {
                            stackOut_13_0 = (oa) ((Object) stackIn_13_0);
                            stackOut_13_1 = (String) (var14);
                            stackIn_14_0 = stackOut_13_0;
                            stackIn_14_1 = stackOut_13_1;
                            break L5;
                          } else {
                            stackOut_12_0 = (oa) ((Object) stackIn_12_0);
                            stackOut_12_1 = "";
                            stackIn_14_0 = stackOut_12_0;
                            stackIn_14_1 = stackOut_12_1;
                            break L5;
                          }
                        }
                        L6: {
                          ((oa) (Object) stackIn_14_0).a(stackIn_14_1, 126);
                          stackOut_14_0 = d.field_d;
                          stackIn_16_0 = stackOut_14_0;
                          stackIn_15_0 = stackOut_14_0;
                          if (param1.a((byte) -121)) {
                            stackOut_16_0 = (oa) ((Object) stackIn_16_0);
                            stackOut_16_1 = (String) (var8);
                            stackIn_17_0 = stackOut_16_0;
                            stackIn_17_1 = stackOut_16_1;
                            break L6;
                          } else {
                            stackOut_15_0 = (oa) ((Object) stackIn_15_0);
                            stackOut_15_1 = "";
                            stackIn_17_0 = stackOut_15_0;
                            stackIn_17_1 = stackOut_15_1;
                            break L6;
                          }
                        }
                        ((oa) (Object) stackIn_17_0).a(stackIn_17_1, param2 ^ -117);
                        ff.field_D.f(6389, 16);
                        ff.field_D.field_h = ff.field_D.field_h + 1;
                        var9 = ff.field_D.field_h;
                        bj.a(kb.field_p, q.field_f, ff.field_D, (byte) -108, d.field_d);
                        ff.field_D.a((byte) -42, -var9 + ff.field_D.field_h);
                        if (var13 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L7: {
                      var9 = 0;
                      if (param5) {
                        var9 = var9 | 1;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      d.field_d.field_h = 0;
                      d.field_d.a(param2 + -94, d.field_c.nextInt());
                      d.field_d.a(param2 ^ 110, d.field_c.nextInt());
                      d.field_d.a(var14, 123);
                      d.field_d.a(var8, 125);
                      var15 = (CharSequence) ((Object) param3);
                      d.field_d.a(ob.a((byte) 107, var15), param2 ^ -120);
                      d.field_d.c(param4, -159688920);
                      d.field_d.f(6389, param0);
                      d.field_d.f(6389, var9);
                      ff.field_D.f(6389, 18);
                      ff.field_D.field_h = ff.field_D.field_h + 2;
                      var10 = ff.field_D.field_h;
                      var11_ref_String = wk.a(ha.b(116), (byte) -45);
                      if (var11_ref_String == null) {
                        var11_ref_String = "";
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    ff.field_D.a(92, var11_ref_String);
                    bj.a(kb.field_p, q.field_f, ff.field_D, (byte) -123, d.field_d);
                    ff.field_D.b(-109, ff.field_D.field_h - var10);
                    break L3;
                  }
                  rb.a(-1, -377);
                  lj.field_z = vf.field_b;
                  break L2;
                } else {
                  break L2;
                }
              }
              L9: {
                if (vf.field_b != lj.field_z) {
                  break L9;
                } else {
                  if (!ue.a(1, 0)) {
                    break L9;
                  } else {
                    L10: {
                      var9 = nf.field_l.d((byte) 97);
                      nf.field_l.field_h = 0;
                      if (-101 < (var9 ^ -1)) {
                        break L10;
                      } else {
                        if (-106 > (var9 ^ -1)) {
                          break L10;
                        } else {
                          lj.field_z = aa.field_b;
                          wh.field_F = new String[var9 + -100];
                          if (var13 == 0) {
                            break L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    if (-249 != (var9 ^ -1)) {
                      L11: {
                        if (99 != var9) {
                          break L11;
                        } else {
                          discarded$1 = ue.a(jk.a((byte) -114), 0);
                          ch.field_f = new Boolean(oh.a((byte) -87, nf.field_l));
                          nf.field_l.field_h = 0;
                          if (var13 == 0) {
                            break L9;
                          } else {
                            break L11;
                          }
                        }
                      }
                      lj.field_z = gg.field_f;
                      tg.field_a = -1;
                      ca.field_e = var9;
                      break L9;
                    } else {
                      tb.a(ha.b(param2 ^ -66), true);
                      Transmogrify.field_B = nj.field_j;
                      pc.a(1);
                      ej.field_k = false;
                      stackOut_33_0 = var9;
                      stackIn_34_0 = stackOut_33_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              }
              L12: {
                if (aa.field_b != lj.field_z) {
                  break L12;
                } else {
                  var9 = 2;
                  if (ue.a(var9, 0)) {
                    var10 = nf.field_l.a((byte) -102);
                    nf.field_l.field_h = 0;
                    if (!ue.a(var10, 0)) {
                      break L12;
                    } else {
                      var11 = wh.field_F.length;
                      var12 = 0;
                      L13: while (true) {
                        L14: {
                          if (var11 <= var12) {
                            pc.a(1);
                            ej.field_k = false;
                            break L14;
                          } else {
                            wh.field_F[var12] = nf.field_l.e(26);
                            var12++;
                            if (var13 != 0) {
                              break L14;
                            } else {
                              continue L13;
                            }
                          }
                        }
                        stackOut_49_0 = var11 + 100;
                        stackIn_50_0 = stackOut_49_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  } else {
                    break L12;
                  }
                }
              }
              L15: {
                if (gg.field_f == lj.field_z) {
                  if (ce.a(0)) {
                    L16: {
                      L17: {
                        if (-256 == (ca.field_e ^ -1)) {
                          break L17;
                        } else {
                          Transmogrify.field_B = nf.field_l.g(param2 + 12257);
                          if (var13 == 0) {
                            break L16;
                          } else {
                            break L17;
                          }
                        }
                      }
                      var9_ref_String = nf.field_l.j(-1640531527);
                      if (var9_ref_String == null) {
                        break L16;
                      } else {
                        v.a(0, var9_ref_String, ha.b(114));
                        break L16;
                      }
                    }
                    pc.a(1);
                    ej.field_k = false;
                    stackOut_60_0 = ca.field_e;
                    stackIn_61_0 = stackOut_60_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    break L15;
                  }
                } else {
                  break L15;
                }
              }
              L18: {
                if (null != nk.field_b) {
                  break L18;
                } else {
                  L19: {
                    if (ej.field_k) {
                      break L19;
                    } else {
                      var9 = lf.field_c;
                      lf.field_c = kf.field_p;
                      kf.field_p = var9;
                      ej.field_k = true;
                      if (var13 == 0) {
                        break L18;
                      } else {
                        break L19;
                      }
                    }
                  }
                  L20: {
                    L21: {
                      if ((mc.b(true) ^ -1L) >= -30001L) {
                        break L21;
                      } else {
                        Transmogrify.field_B = ng.field_h;
                        if (var13 == 0) {
                          break L20;
                        } else {
                          break L21;
                        }
                      }
                    }
                    Transmogrify.field_B = bd.field_s;
                    break L20;
                  }
                  ej.field_k = false;
                  stackOut_69_0 = 249;
                  stackIn_70_0 = stackOut_69_0;
                  decompiledRegionSelector0 = 5;
                  break L0;
                }
              }
              stackOut_71_0 = -1;
              stackIn_72_0 = stackOut_71_0;
              decompiledRegionSelector0 = 6;
              break L0;
            } else {
              stackOut_2_0 = -40;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var7 = decompiledCaughtException;
            stackOut_73_0 = (RuntimeException) (var7);
            stackOut_73_1 = new StringBuilder().append("jd.C(").append(param0).append(',');
            stackIn_75_0 = stackOut_73_0;
            stackIn_75_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param1 == null) {
              stackOut_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackOut_75_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L22;
            } else {
              stackOut_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackOut_74_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackOut_74_2 = "{...}";
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_76_2 = stackOut_74_2;
              break L22;
            }
          }
          L23: {
            stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
            stackOut_76_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_76_2).append(',').append(param2).append(',');
            stackIn_78_0 = stackOut_76_0;
            stackIn_78_1 = stackOut_76_1;
            stackIn_77_0 = stackOut_76_0;
            stackIn_77_1 = stackOut_76_1;
            if (param3 == null) {
              stackOut_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackOut_78_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackOut_78_2 = "null";
              stackIn_79_0 = stackOut_78_0;
              stackIn_79_1 = stackOut_78_1;
              stackIn_79_2 = stackOut_78_2;
              break L23;
            } else {
              stackOut_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackOut_77_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackOut_77_2 = "{...}";
              stackIn_79_0 = stackOut_77_0;
              stackIn_79_1 = stackOut_77_1;
              stackIn_79_2 = stackOut_77_2;
              break L23;
            }
          }
          L24: {
            stackOut_79_0 = (RuntimeException) ((Object) stackIn_79_0);
            stackOut_79_1 = ((StringBuilder) (Object) stackIn_79_1).append(stackIn_79_2).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_81_0 = stackOut_79_0;
            stackIn_81_1 = stackOut_79_1;
            stackIn_80_0 = stackOut_79_0;
            stackIn_80_1 = stackOut_79_1;
            if (param6 == null) {
              stackOut_81_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackOut_81_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackOut_81_2 = "null";
              stackIn_82_0 = stackOut_81_0;
              stackIn_82_1 = stackOut_81_1;
              stackIn_82_2 = stackOut_81_2;
              break L24;
            } else {
              stackOut_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackOut_80_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackOut_80_2 = "{...}";
              stackIn_82_0 = stackOut_80_0;
              stackIn_82_1 = stackOut_80_1;
              stackIn_82_2 = stackOut_80_2;
              break L24;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_82_0), stackIn_82_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_34_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_50_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_61_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_70_0;
                  } else {
                    return stackIn_72_0;
                  }
                }
              }
            }
          }
        }
    }

    static {
    }
}
