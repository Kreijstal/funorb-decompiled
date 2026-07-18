/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pu extends hd implements lv {
    private ot field_Cb;
    private String field_Hb;
    static em field_Eb;
    private String field_Gb;
    fn field_Bb;
    static int[] field_zb;
    private String field_yb;
    static String field_Ab;
    static String field_Fb;
    static int[] field_Db;

    final void h(byte param0) {
        if (!(!((pu) this).field_gb)) {
            je.a((byte) 100, (pu) this);
        }
        if (param0 != 30) {
            ((pu) this).h((byte) 44);
        }
    }

    public final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var4 = ((pu) this).b(0);
          var5 = ((pu) this).a(param1 ^ 24);
          var6 = -(var4 >> 1) + param2;
          var7 = -(var5 >> 1) + param0;
          on.a(var6, var7, var4, var5, 52479, 60);
          if (((pu) this).field_Bb.field_h != 0) {
            on.a(var6, var7, var4, 50, 16777215, 60);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          on.e(var6, var7, var4, var5, 65793);
          q.field_d.c(((pu) this).field_yb, -10 + (var6 + var4), 22 + var7, 16777215, 65793);
          q.field_d.c(((pu) this).field_Hb, -10 + (var6 + var4), var7 - -36, 16777215, 65793);
          if (param1 == 23) {
            break L1;
          } else {
            ((pu) this).field_Hb = null;
            break L1;
          }
        }
        L2: {
          ((pu) this).field_Cb.c(var6 - -8, 9 + var7);
          if (0 != ((pu) this).field_Bb.field_h) {
            on.f(var6, var7 - -50, var4, 65793);
            int discarded$1 = q.field_d.a(((pu) this).field_Gb, 5 + var6, var7 - -50, var4 + -10, var5 - 52, 16777215, 65793, 0, 1, 12);
            break L2;
          } else {
            break L2;
          }
        }
    }

    final static vn a(boolean param0, int param1, boolean[][] param2, byte param3, boolean[][] param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var8_int = 0;
        vn var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        vn var12 = null;
        int var13 = 0;
        int var14 = 0;
        short[] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        vn var24 = null;
        int var25 = 0;
        vn var26 = null;
        short[] var30 = null;
        vn stackIn_6_0 = null;
        vn stackIn_6_1 = null;
        vn[] stackIn_6_2 = null;
        vn[] stackIn_6_3 = null;
        int stackIn_6_4 = 0;
        vn stackIn_7_0 = null;
        vn stackIn_7_1 = null;
        vn[] stackIn_7_2 = null;
        vn[] stackIn_7_3 = null;
        int stackIn_7_4 = 0;
        vn stackIn_8_0 = null;
        vn stackIn_8_1 = null;
        vn[] stackIn_8_2 = null;
        vn[] stackIn_8_3 = null;
        int stackIn_8_4 = 0;
        vn stackIn_8_5 = null;
        vn stackIn_12_0 = null;
        int stackIn_29_0 = 0;
        int stackIn_45_0 = 0;
        vn stackIn_53_0 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        vn stackOut_5_0 = null;
        vn stackOut_5_1 = null;
        vn[] stackOut_5_2 = null;
        vn[] stackOut_5_3 = null;
        int stackOut_5_4 = 0;
        vn stackOut_7_0 = null;
        vn stackOut_7_1 = null;
        vn[] stackOut_7_2 = null;
        vn[] stackOut_7_3 = null;
        int stackOut_7_4 = 0;
        vn stackOut_7_5 = null;
        vn stackOut_6_0 = null;
        vn stackOut_6_1 = null;
        vn[] stackOut_6_2 = null;
        vn[] stackOut_6_3 = null;
        int stackOut_6_4 = 0;
        vn stackOut_6_5 = null;
        vn stackOut_11_0 = null;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        vn stackOut_52_0 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        var23 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var24 = new vn(new vn[1], 1);
              var26 = var24;
              if (!param0) {
                break L1;
              } else {
                var8_int = wc.field_e[param1];
                var9 = 0;
                L2: while (true) {
                  if (var9 >= var26.field_H.length) {
                    break L1;
                  } else {
                    var24.field_H[var9] = var24.field_H[var9] * 3;
                    var26.field_l[var9] = var8_int + (-var8_int + var24.field_l[var9]) * 3;
                    var9++;
                    continue L2;
                  }
                }
              }
            }
            L3: {
              stackOut_5_0 = null;
              stackOut_5_1 = null;
              stackOut_5_2 = new vn[2];
              stackOut_5_3 = new vn[2];
              stackOut_5_4 = 1;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              stackIn_7_3 = stackOut_5_3;
              stackIn_7_4 = stackOut_5_4;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              stackIn_6_3 = stackOut_5_3;
              stackIn_6_4 = stackOut_5_4;
              if (param1 == 4) {
                stackOut_7_0 = null;
                stackOut_7_1 = null;
                stackOut_7_2 = (vn[]) (Object) stackIn_7_2;
                stackOut_7_3 = (vn[]) (Object) stackIn_7_3;
                stackOut_7_4 = stackIn_7_4;
                stackOut_7_5 = es.field_k;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                stackIn_8_2 = stackOut_7_2;
                stackIn_8_3 = stackOut_7_3;
                stackIn_8_4 = stackOut_7_4;
                stackIn_8_5 = stackOut_7_5;
                break L3;
              } else {
                stackOut_6_0 = null;
                stackOut_6_1 = null;
                stackOut_6_2 = (vn[]) (Object) stackIn_6_2;
                stackOut_6_3 = (vn[]) (Object) stackIn_6_3;
                stackOut_6_4 = stackIn_6_4;
                stackOut_6_5 = iw.field_m[param1];
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_8_2 = stackOut_6_2;
                stackIn_8_3 = stackOut_6_3;
                stackIn_8_4 = stackOut_6_4;
                stackIn_8_5 = stackOut_6_5;
                break L3;
              }
            }
            L4: {
              stackIn_8_3[stackIn_8_4] = stackIn_8_5;
              var8 = new vn(stackIn_8_2, 2);
              var10 = 0;
              var9 = (short)param5;
              var11 = (short)param6;
              var12 = new vn(var8, true, false, true, true);
              if (param2 != null) {
                break L4;
              } else {
                if (param4 == null) {
                  stackOut_11_0 = (vn) var12;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              var30 = var8.field_p;
              var16 = var12.field_p;
              if (param1 != 4) {
                var13 = -9284;
                var17 = 0;
                L6: while (true) {
                  if (var30.length <= var17) {
                    break L5;
                  } else {
                    L7: {
                      if (var30[var17] == var13) {
                        var16[var17] = (short)hk.field_K[param1][0];
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var17++;
                    continue L6;
                  }
                }
              } else {
                break L5;
              }
            }
            L8: {
              if (param2 == null) {
                break L8;
              } else {
                var17 = 0;
                var18 = 0;
                L9: while (true) {
                  if (var18 >= param2.length) {
                    break L8;
                  } else {
                    var19 = 20;
                    var20 = 0;
                    L10: while (true) {
                      if (var20 >= param2[0].length) {
                        var17 += 3;
                        var18++;
                        continue L9;
                      } else {
                        L11: {
                          var21 = var20;
                          if (param2[-var18 + 12][var21]) {
                            stackOut_28_0 = var11;
                            stackIn_29_0 = stackOut_28_0;
                            break L11;
                          } else {
                            stackOut_27_0 = var9;
                            stackIn_29_0 = stackOut_27_0;
                            break L11;
                          }
                        }
                        var14 = stackIn_29_0;
                        var13 = ks.a(var19, var17, -67, 7);
                        var19 += 5;
                        var22 = 0;
                        L12: while (true) {
                          if (var30.length <= var22) {
                            var20++;
                            continue L10;
                          } else {
                            L13: {
                              if (var30[var22] == var13) {
                                var16[var22] = (short)var14;
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                            var22++;
                            continue L12;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            L14: {
              if (param4 == null) {
                break L14;
              } else {
                var17 = 0;
                var18 = 0;
                L15: while (true) {
                  if (param4.length <= var18) {
                    break L14;
                  } else {
                    var19 = 20;
                    var20 = 0;
                    L16: while (true) {
                      if (var20 >= param4[0].length) {
                        var17 += 3;
                        var18++;
                        continue L15;
                      } else {
                        L17: {
                          var21 = 9 + -var20;
                          if (param4[12 + -var18][var21]) {
                            stackOut_44_0 = var11;
                            stackIn_45_0 = stackOut_44_0;
                            break L17;
                          } else {
                            stackOut_43_0 = var9;
                            stackIn_45_0 = stackOut_43_0;
                            break L17;
                          }
                        }
                        var14 = stackIn_45_0;
                        var13 = ks.a(var19, var17, -45, 6);
                        var19 += 5;
                        var25 = 0;
                        var22 = var25;
                        L18: while (true) {
                          if (var30.length <= var25) {
                            var20++;
                            continue L16;
                          } else {
                            L19: {
                              if (var30[var25] != var13) {
                                break L19;
                              } else {
                                var16[var25] = (short)var14;
                                break L19;
                              }
                            }
                            var25++;
                            continue L18;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            stackOut_52_0 = (vn) var12;
            stackIn_53_0 = stackOut_52_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var7 = decompiledCaughtException;
            stackOut_54_0 = (RuntimeException) var7;
            stackOut_54_1 = new StringBuilder().append("pu.E(").append(param0).append(',').append(param1).append(',');
            stackIn_56_0 = stackOut_54_0;
            stackIn_56_1 = stackOut_54_1;
            stackIn_55_0 = stackOut_54_0;
            stackIn_55_1 = stackOut_54_1;
            if (param2 == null) {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "null";
              stackIn_57_0 = stackOut_56_0;
              stackIn_57_1 = stackOut_56_1;
              stackIn_57_2 = stackOut_56_2;
              break L20;
            } else {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "{...}";
              stackIn_57_0 = stackOut_55_0;
              stackIn_57_1 = stackOut_55_1;
              stackIn_57_2 = stackOut_55_2;
              break L20;
            }
          }
          L21: {
            stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
            stackOut_57_1 = ((StringBuilder) (Object) stackIn_57_1).append(stackIn_57_2).append(',').append(-103).append(',');
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param4 == null) {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L21;
            } else {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "{...}";
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              break L21;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_60_0, stackIn_60_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_53_0;
    }

    public final int b(int param0) {
        if (param0 != 0) {
            return -18;
        }
        return 150;
    }

    final static void a(byte param0, int param1, int param2, int param3) {
        gl.field_a.field_n = 0;
        gl.field_a.a(122, 12);
        gl.field_a.b(-43, ac.field_d.nextInt());
        gl.field_a.b(-111, ac.field_d.nextInt());
        gl.field_a.a(102, param3);
        gl.field_a.a(112, param2);
        gl.field_a.g(-1207444472, param1);
        gl.field_a.a(bb.field_Nb, hn.field_h, 38);
        or.field_d.b(18, (byte) -83);
        int fieldTemp$0 = or.field_d.field_n + 1;
        or.field_d.field_n = or.field_d.field_n + 1;
        int var4 = fieldTemp$0;
        or.field_d.a(0, gl.field_a.field_n, 1991220144, gl.field_a.field_f);
        or.field_d.c(62, -var4 + or.field_d.field_n);
        int var5 = 2;
    }

    public final int a(int param0) {
        int var2 = 50;
        if (param0 != 15) {
            return -84;
        }
        if (((pu) this).field_Bb.field_h != 0) {
            var2 = var2 + (20 + q.field_d.c(us.field_h[((pu) this).field_Bb.field_h], ((pu) this).b(param0 ^ 15) - 10, 12));
        }
        return var2;
    }

    public static void i() {
        field_Ab = null;
        field_Fb = null;
        field_Db = null;
        int var1 = -40;
        field_zb = null;
        field_Eb = null;
    }

    pu(fn param0, boolean param1) {
        try {
            ((pu) this).field_mb = 32;
            ((pu) this).field_q = 32;
            ((pu) this).field_Bb = param0;
            ((pu) this).field_Cb = param0.d(false);
            ((pu) this).field_N = (ut) (Object) ((pu) this).field_Cb;
            if (param1) {
                ((pu) this).field_q = ((pu) this).field_q >> 1;
                ((pu) this).field_mb = ((pu) this).field_mb >> 1;
                ((pu) this).field_N = (ut) (Object) nh.b(((pu) this).field_Cb);
            }
            ((pu) this).field_yb = rv.field_b[((pu) this).field_Bb.field_h].toUpperCase();
            ((pu) this).field_Hb = vo.a((byte) -18, kd.field_u, new String[1]).toLowerCase();
            if (0 == ((pu) this).field_Bb.field_h) {
                ((pu) this).field_yb = '(' + ((pu) this).field_yb + ')';
            } else {
                ((pu) this).field_yb = '"' + ((pu) this).field_yb + '"';
            }
            ((pu) this).field_Gb = us.field_h[((pu) this).field_Bb.field_h];
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "pu.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Ab = "Unable to add name - system busy";
        field_zb = new int[2];
        field_Db = new int[7];
        field_Fb = "Some players haven't unlocked the currently selected game options.<br>Please view the '<%0>' tab on the left for details.";
    }
}
