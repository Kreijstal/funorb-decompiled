/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tn extends bh {
    static String field_Y;
    static String field_U;
    private String field_Z;
    private cn field_V;
    static cn field_W;
    private dp field_T;
    static cn field_I;
    private int field_X;

    final String c(byte param0) {
        if (param0 >= 3) {
            return null;
        }
        Object var3 = null;
        boolean discarded$0 = ((tn) this).a(25, (lm) null);
        return null;
    }

    final boolean a(int param0, lm param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param0 == 34) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              field_U = null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("tn.H(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0 != 0;
    }

    final static String a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (param0 < -18) {
                break L1;
              } else {
                field_W = null;
                break L1;
              }
            }
            var2_int = param1.length();
            var3 = new char[var2_int];
            var4 = 0;
            L2: while (true) {
              if (var4 >= var2_int) {
                stackOut_9_0 = new String(var3);
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                L3: {
                  var5 = param1.charAt(var4);
                  if (var4 == 0) {
                    var5 = lb.a((char) var5, 80);
                    break L3;
                  } else {
                    var5 = Character.toLowerCase((char) var5);
                    break L3;
                  }
                }
                var3[var4] = (char)var5;
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("tn.C(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
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
          throw vk.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0;
    }

    final void a(int param0, int param1, lm param2, boolean param3) {
        try {
            ((tn) this).field_X = ((tn) this).field_X + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "tn.B(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    final static void a(int param0) {
        cd.field_b = false;
        qc.field_t = false;
        sn.a(49, -1);
        wd.field_d = sp.field_e;
        ol.field_i = sp.field_e;
    }

    final static pp a(int param0, int param1, se param2, cn param3, int param4, String param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        cn var8 = null;
        cn var9 = null;
        int var10_int = 0;
        cn var10 = null;
        int var11 = 0;
        int var12 = 0;
        cn var13 = null;
        cn var14 = null;
        cn var15 = null;
        cn var16 = null;
        int var17 = 0;
        Object var18 = null;
        pp stackIn_10_0 = null;
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
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        pp stackOut_9_0 = null;
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
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var17 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              jh.c();
              var6_int = param2.b(param5);
              var7 = param2.field_E + param2.field_H;
              var8 = new cn(var6_int, var7);
              var8.e();
              param2.b(param5, 0, param2.field_H, 16760960, -1);
              if (param4 <= -36) {
                break L1;
              } else {
                var18 = null;
                pp discarded$1 = tn.a(9, 109, (se) null, (cn) null, 59, (String) null);
                break L1;
              }
            }
            var9 = te.a(var6_int, var7, ag.field_c, 32, 32, 0.125);
            var10_int = 0;
            L2: while (true) {
              if (var9.field_B.length <= var10_int) {
                var10 = rb.a(16, var8, 16776960, (byte) 100);
                var11 = -var8.field_y + param3.field_y >> 1;
                var12 = param3.field_v - var8.field_v >> 1;
                var13 = dd.a((byte) -112, 4, var9);
                var14 = param3.d();
                var14.e();
                bp.a(var12, var13, var11, (byte) 99);
                var9.h(var11, var12);
                var14.h();
                var15 = var14.d();
                var15.e();
                gf.b(0, 0, param3.field_y, param3.field_v, 0, 160);
                var15.h();
                var16 = param3.d();
                var16.e();
                rb.a(8, var8, 12690143, (byte) -59).b(var11, var12, 32);
                var8.h(var11, var12);
                var10.field_w = var10.field_w + var11;
                var10.field_A = var10.field_A + var12;
                jh.b();
                stackOut_9_0 = new pp(var14, var15, var16, var10, param0, param1);
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                L3: {
                  if (0 == var8.field_B[var10_int]) {
                    var9.field_B[var10_int] = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var10_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("tn.G(").append(param0).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
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
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
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
          L6: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44).append(param4).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param5 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
        return stackIn_10_0;
    }

    tn(dp param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (ca) (Object) ri.a((byte) 56));
        try {
            ((tn) this).field_Z = param1;
            ((tn) this).field_T = param0;
            ((tn) this).b(0, param4, param3, param2, param5);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "tn.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    public static void h(byte param0) {
        field_Y = null;
        field_W = null;
        field_U = null;
        field_I = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        String var5 = null;
        od var6 = null;
        th var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        cn var14 = null;
        cn var15 = null;
        cn var16 = null;
        L0: {
          L1: {
            L2: {
              L3: {
                var13 = DungeonAssault.field_K;
                var6 = ((tn) this).field_T.a((byte) -116);
                if (ub.field_s == var6) {
                  break L3;
                } else {
                  if (var6 != oc.field_A) {
                    var5 = ((tn) this).field_T.a(true);
                    if (var5 == null) {
                      var5 = ((tn) this).field_Z;
                      break L2;
                    } else {
                      if (!var5.equals((Object) (Object) ((tn) this).field_w)) {
                        break L1;
                      } else {
                        break L0;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
              }
              var5 = kj.field_k;
              break L2;
            }
            if (!var5.equals((Object) (Object) ((tn) this).field_w)) {
              break L1;
            } else {
              break L0;
            }
          }
          ((tn) this).field_w = var5;
          ((tn) this).g((byte) 112);
          break L0;
        }
        L4: {
          L5: {
            super.a(param0, param1, param2, param3);
            var6 = ((tn) this).field_T.a((byte) -110);
            var8 = (th) (Object) ((tn) this).field_o;
            var9 = ((tn) this).field_q + param1;
            var10 = var8.a((byte) 64, param3, (lm) this) - -(var8.b(-2, (lm) this).b(263) >> 1);
            if (ub.field_s == var6) {
              break L5;
            } else {
              if (oc.field_A != var6) {
                if (var6 != pd.field_J) {
                  if (var6 == c.field_d) {
                    var16 = sl.field_c[1];
                    var16.b(var9, var10 + -(var16.field_v >> 1), 256);
                    break L4;
                  } else {
                    break L4;
                  }
                } else {
                  var15 = sl.field_c[2];
                  var15.b(var9, var10 - (var15.field_v >> 1), 256);
                  break L4;
                }
              } else {
                break L5;
              }
            }
          }
          L6: {
            L7: {
              var14 = sl.field_c[0];
              var11 = var14.field_E << 1;
              var12 = var14.field_G << 1;
              if (((tn) this).field_V == null) {
                break L7;
              } else {
                if (var11 > ((tn) this).field_V.field_y) {
                  break L7;
                } else {
                  if (var12 > ((tn) this).field_V.field_v) {
                    break L7;
                  } else {
                    lm.a(((tn) this).field_V, (byte) 38);
                    gf.a();
                    break L6;
                  }
                }
              }
            }
            ((tn) this).field_V = new cn(var11, var12);
            lm.a(((tn) this).field_V, (byte) -79);
            break L6;
          }
          var14.b(112, 144, var14.field_E << 4, var14.field_G << 4, -((tn) this).field_X << 10, 4096);
          ti.c(true);
          ((tn) this).field_V.b(var9 + -(var14.field_E >> 1), -var14.field_G + var10, 256);
          break L4;
        }
    }

    final static void a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        ec var16 = null;
        ec var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_47_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        var15 = DungeonAssault.field_K;
        try {
          L0: {
            var16 = new ec(param1);
            var17 = var16;
            var17.field_o = -2 + param1.length;
            dk.field_d = var17.k(0);
            jn.field_k = new int[dk.field_d];
            ub.field_q = new byte[dk.field_d][];
            gk.field_Q = new boolean[dk.field_d];
            hg.field_t = new int[dk.field_d];
            if (param0 > 59) {
              rf.field_P = new byte[dk.field_d][];
              jc.field_f = new int[dk.field_d];
              fe.field_g = new int[dk.field_d];
              var17.field_o = -7 + (param1.length - dk.field_d * 8);
              ce.field_x = var17.k(0);
              tb.field_i = var17.k(0);
              var3 = 1 + (255 & var17.c(true));
              var4 = 0;
              L1: while (true) {
                if (dk.field_d <= var4) {
                  var4 = 0;
                  L2: while (true) {
                    if (dk.field_d <= var4) {
                      var4 = 0;
                      L3: while (true) {
                        if (dk.field_d <= var4) {
                          var4 = 0;
                          L4: while (true) {
                            if (var4 >= dk.field_d) {
                              var17.field_o = -(3 * var3) + (-4 + param1.length + -(8 * dk.field_d));
                              uo.field_b = new int[var3];
                              var4 = 1;
                              L5: while (true) {
                                if (var4 >= var3) {
                                  var17.field_o = 0;
                                  var4 = 0;
                                  L6: while (true) {
                                    if (dk.field_d <= var4) {
                                      break L0;
                                    } else {
                                      L7: {
                                        var5 = jc.field_f[var4];
                                        var6 = jn.field_k[var4];
                                        var7 = var5 * var6;
                                        var24 = new byte[var7];
                                        var22 = var24;
                                        var20 = var22;
                                        var18 = var20;
                                        var8 = var18;
                                        ub.field_q[var4] = var24;
                                        var25 = new byte[var7];
                                        var23 = var25;
                                        var21 = var23;
                                        var19 = var21;
                                        var9 = var19;
                                        rf.field_P[var4] = var25;
                                        var10 = 0;
                                        var11 = var17.c(true);
                                        if (0 == (1 & var11)) {
                                          var12 = 0;
                                          L8: while (true) {
                                            if (var7 <= var12) {
                                              if ((var11 & 2) == 0) {
                                                break L7;
                                              } else {
                                                var12 = 0;
                                                L9: while (true) {
                                                  if (var12 >= var7) {
                                                    break L7;
                                                  } else {
                                                    L10: {
                                                      byte dupTemp$2 = var17.a((byte) 2);
                                                      var9[var12] = dupTemp$2;
                                                      var13 = dupTemp$2;
                                                      stackOut_47_0 = var10;
                                                      stackIn_49_0 = stackOut_47_0;
                                                      stackIn_48_0 = stackOut_47_0;
                                                      if (var13 == -1) {
                                                        stackOut_49_0 = stackIn_49_0;
                                                        stackOut_49_1 = 0;
                                                        stackIn_50_0 = stackOut_49_0;
                                                        stackIn_50_1 = stackOut_49_1;
                                                        break L10;
                                                      } else {
                                                        stackOut_48_0 = stackIn_48_0;
                                                        stackOut_48_1 = 1;
                                                        stackIn_50_0 = stackOut_48_0;
                                                        stackIn_50_1 = stackOut_48_1;
                                                        break L10;
                                                      }
                                                    }
                                                    var10 = stackIn_50_0 | stackIn_50_1;
                                                    var12++;
                                                    continue L9;
                                                  }
                                                }
                                              }
                                            } else {
                                              var8[var12] = var17.a((byte) 2);
                                              var12++;
                                              continue L8;
                                            }
                                          }
                                        } else {
                                          var12 = 0;
                                          L11: while (true) {
                                            if (var5 <= var12) {
                                              if ((var11 & 2) != 0) {
                                                var12 = 0;
                                                L12: while (true) {
                                                  if (var12 >= var5) {
                                                    break L7;
                                                  } else {
                                                    var13 = 0;
                                                    L13: while (true) {
                                                      if (var13 >= var6) {
                                                        var12++;
                                                        continue L12;
                                                      } else {
                                                        L14: {
                                                          byte dupTemp$3 = var17.a((byte) 2);
                                                          var9[var5 * var13 + var12] = dupTemp$3;
                                                          var14 = dupTemp$3;
                                                          stackOut_36_0 = var10;
                                                          stackIn_38_0 = stackOut_36_0;
                                                          stackIn_37_0 = stackOut_36_0;
                                                          if (var14 == -1) {
                                                            stackOut_38_0 = stackIn_38_0;
                                                            stackOut_38_1 = 0;
                                                            stackIn_39_0 = stackOut_38_0;
                                                            stackIn_39_1 = stackOut_38_1;
                                                            break L14;
                                                          } else {
                                                            stackOut_37_0 = stackIn_37_0;
                                                            stackOut_37_1 = 1;
                                                            stackIn_39_0 = stackOut_37_0;
                                                            stackIn_39_1 = stackOut_37_1;
                                                            break L14;
                                                          }
                                                        }
                                                        var10 = stackIn_39_0 | stackIn_39_1;
                                                        var13++;
                                                        continue L13;
                                                      }
                                                    }
                                                  }
                                                }
                                              } else {
                                                break L7;
                                              }
                                            } else {
                                              var13 = 0;
                                              L15: while (true) {
                                                if (var6 <= var13) {
                                                  var12++;
                                                  continue L11;
                                                } else {
                                                  var8[var12 - -(var5 * var13)] = var17.a((byte) 2);
                                                  var13++;
                                                  continue L15;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      gk.field_Q[var4] = var10 != 0;
                                      var4++;
                                      continue L6;
                                    }
                                  }
                                } else {
                                  L16: {
                                    uo.field_b[var4] = var17.f(-114);
                                    if (uo.field_b[var4] == 0) {
                                      uo.field_b[var4] = 1;
                                      break L16;
                                    } else {
                                      break L16;
                                    }
                                  }
                                  var4++;
                                  continue L5;
                                }
                              }
                            } else {
                              jn.field_k[var4] = var17.k(0);
                              var4++;
                              continue L4;
                            }
                          }
                        } else {
                          jc.field_f[var4] = var17.k(0);
                          var4++;
                          continue L3;
                        }
                      }
                    } else {
                      fe.field_g[var4] = var17.k(0);
                      var4++;
                      continue L2;
                    }
                  }
                } else {
                  hg.field_t[var4] = var16.k(0);
                  var4++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var2 = decompiledCaughtException;
            stackOut_53_0 = (RuntimeException) var2;
            stackOut_53_1 = new StringBuilder().append("tn.E(").append(param0).append(44);
            stackIn_55_0 = stackOut_53_0;
            stackIn_55_1 = stackOut_53_1;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            if (param1 == null) {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "null";
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              stackIn_56_2 = stackOut_55_2;
              break L17;
            } else {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "{...}";
              stackIn_56_0 = stackOut_54_0;
              stackIn_56_1 = stackOut_54_1;
              stackIn_56_2 = stackOut_54_2;
              break L17;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_56_0, stackIn_56_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_U = "Cost";
        field_Y = "The reanimated corpses of previous failed raids; these four skeletons are well armed.<br><br>This monster will rise again when the party leaves the room, even if defeated.";
    }
}
