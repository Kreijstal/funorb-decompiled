/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class fj extends rl implements ij {
    static int[] field_lb;
    private boolean field_jb;
    private boolean field_kb;
    private boolean field_gb;
    private we field_fb;
    private cc field_mb;
    static String field_hb;
    private boolean field_ib;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        var14 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (param5 >= param2) {
              return;
            } else {
              if (param0 > 1 + param5) {
                L1: {
                  if (param0 <= param5 - -5) {
                    break L1;
                  } else {
                    if (param4 != param3) {
                      var7_int = (param4 >> 1) + (param3 >> 1) + (param3 & param4 & 1);
                      var8 = param5;
                      var9 = param4;
                      var10 = param3;
                      var11 = param5;
                      L2: while (true) {
                        if (var11 >= param0) {
                          fj.a(var8, param1, param2, var9, param4, param5, param6);
                          fj.a(param0, param1, param2, param3, var10, var8, param6);
                          break L0;
                        } else {
                          L3: {
                            var12 = ac.field_I[var11];
                            if (param6) {
                              stackOut_23_0 = on.field_e[var12];
                              stackIn_24_0 = stackOut_23_0;
                              break L3;
                            } else {
                              stackOut_22_0 = hm.field_A[var12];
                              stackIn_24_0 = stackOut_22_0;
                              break L3;
                            }
                          }
                          var13 = stackIn_24_0;
                          if (var7_int < var13) {
                            L4: {
                              ac.field_I[var11] = ac.field_I[var8];
                              int incrementValue$1 = var8;
                              var8++;
                              ac.field_I[incrementValue$1] = var12;
                              if (var9 > var13) {
                                var9 = var13;
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            var11++;
                            continue L2;
                          } else {
                            L5: {
                              if (var10 >= var13) {
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            var11++;
                            continue L2;
                          }
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                var7_int = param0 - 1;
                L6: while (true) {
                  if (param5 >= var7_int) {
                    return;
                  } else {
                    var8 = param5;
                    L7: while (true) {
                      if (var8 >= var7_int) {
                        var7_int--;
                        continue L6;
                      } else {
                        L8: {
                          var9 = ac.field_I[var8];
                          var10 = ac.field_I[1 + var8];
                          if (eg.a(param6, var9, (byte) 98, var10)) {
                            ac.field_I[var8] = var10;
                            ac.field_I[1 + var8] = var9;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var8++;
                        continue L7;
                      }
                    }
                  }
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var7, "fj.RA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    fj(sd param0, cc param1, String param2, boolean param3, boolean param4) {
        super(param0, (iq) (Object) new rh((fj) null, param1, param2), 77, 10, 10);
        try {
            ((fj) this).field_kb = false;
            ((fj) this).field_jb = param4 ? true : false;
            ((fj) this).field_mb = param1;
            ((fj) this).field_gb = false;
            ((fj) this).field_ib = param3 ? true : false;
            ((fj) this).field_fb = new we(13, 50, 274, 30, 15, 2113632, 4210752);
            ((fj) this).field_fb.field_F = true;
            ((fj) this).c((byte) -14, (iq) (Object) ((fj) this).field_fb);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "fj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(char param0, int param1, int param2, iq param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param2 != param1) {
              stackOut_3_0 = super.a(param0, 13, param2, param3);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              ((fj) this).h((byte) 85);
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("fj.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    final static aa a(cr param0, cr param1, ud param2, int param3, cr param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        aa[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        ud var13_ref_ud = null;
        int var14 = 0;
        int var15 = 0;
        q var16 = null;
        int var17 = 0;
        int[] var18 = null;
        char[] var19 = null;
        int[] var20 = null;
        char[] var21 = null;
        int[] var22 = null;
        char[] var23 = null;
        int[] var24 = null;
        char[] var25 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        aa stackIn_25_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        aa stackOut_24_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var17 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (param2 != null) {
              L1: {
                if (param2.field_C == null) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = param2.field_C.length;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              L2: {
                var5_int = stackIn_7_0;
                if (null != param2.field_z) {
                  stackOut_9_0 = param2.field_z.length;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = 0;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              L3: {
                var6 = stackIn_10_0;
                var7 = var6 + var5_int;
                var8 = new String[var7];
                var25 = new char[var7];
                var23 = var25;
                var21 = var23;
                var19 = var21;
                var9 = var19;
                var24 = new int[var7];
                var22 = var24;
                var20 = var22;
                var18 = var20;
                var10 = var18;
                var11 = new aa[var7];
                if (null == param2.field_C) {
                  break L3;
                } else {
                  var12 = 0;
                  L4: while (true) {
                    if (var12 >= param2.field_C.length) {
                      break L3;
                    } else {
                      var13_ref_ud = ni.field_d.a(param2.field_C[var12], true);
                      var8[var12] = var13_ref_ud.field_D;
                      var9[var12] = param2.field_v[var12];
                      var11[var12] = fj.a(param0, param1, var13_ref_ud, 10, param4);
                      var12++;
                      continue L4;
                    }
                  }
                }
              }
              L5: {
                if (null == param2.field_z) {
                  break L5;
                } else {
                  var12 = var5_int;
                  var13 = 49;
                  var14 = 0;
                  L6: while (true) {
                    if (param2.field_z.length <= var14) {
                      break L5;
                    } else {
                      L7: {
                        var15 = param2.field_z[var14];
                        if (var15 == -1) {
                          var8[var14 + var12] = br.field_W;
                          var9[var12 + var14] = param2.field_u[var14];
                          var10[var12 + var14] = param2.field_z[var14];
                          break L7;
                        } else {
                          L8: {
                            var16 = wm.field_k.a(1, var15);
                            var8[var14 + var12] = var16.h(tk.a(10, 43));
                            var9[var12 - -var14] = param2.field_u[var14];
                            if (var9[var12 - -var14] <= 0) {
                              var13 = (char)(var13 + 1);
                              var9[var14 + var12] = (char)var13;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          var10[var14 + var12] = param2.field_z[var14];
                          break L7;
                        }
                      }
                      var14++;
                      continue L6;
                    }
                  }
                }
              }
              stackOut_24_0 = new aa(0L, param0, param4, param1, var11, var24, var8, var25);
              stackIn_25_0 = stackOut_24_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var5;
            stackOut_26_1 = new StringBuilder().append("fj.TA(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L9;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L9;
            }
          }
          L10: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L10;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L10;
            }
          }
          L11: {
            stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param2 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L11;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L11;
            }
          }
          L12: {
            stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
            stackOut_35_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',').append(10).append(',');
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param4 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L12;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L12;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + ')');
        }
        return stackIn_25_0;
    }

    final void h(byte param0) {
        if (param0 < 55) {
            fj.g((byte) 127);
        }
        if (!(((fj) this).field_I)) {
            return;
        }
        ((fj) this).field_I = false;
        if (((fj) this).field_ib) {
            sm.k(-14284);
        } else {
            if (((fj) this).field_jb) {
                sg.a(3);
            }
        }
    }

    final void m(int param0) {
        ((fj) this).field_fb.b(param0, -113, 4210752);
        rh var2 = new rh((fj) this, ((fj) this).field_mb, qk.field_H);
        var2.a(gb.field_a, 15, -102);
        ((fj) this).a(false, (iq) (Object) var2);
    }

    public void a(int param0, d param1, byte param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              var6_int = 0 % ((param2 - -63) / 51);
              if (!((fj) this).field_kb) {
                gg.a("tochangedisplayname.ws", true, ob.e((byte) 77));
                break L1;
              } else {
                rh.b(-14, 3);
                ((fj) this).h((byte) 93);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var6;
            stackOut_4_1 = new StringBuilder().append("fj.C(").append(param0).append(',');
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
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void n() {
        int var1 = -106;
        field_lb = null;
        field_hb = null;
    }

    final void a(int param0, boolean param1, String param2) {
        RuntimeException var4 = null;
        rh var4_ref = null;
        int var5 = 0;
        rh var6 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        rh stackIn_14_0 = null;
        rh stackIn_15_0 = null;
        rh stackIn_16_0 = null;
        String stackIn_16_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        rh stackOut_13_0 = null;
        rh stackOut_15_0 = null;
        String stackOut_15_1 = null;
        rh stackOut_14_0 = null;
        String stackOut_14_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (!((fj) this).field_gb) {
              L1: {
                stackOut_3_0 = this;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (!param1) {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L1;
                } else {
                  stackOut_4_0 = this;
                  stackOut_4_1 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  break L1;
                }
              }
              L2: {
                ((fj) this).field_gb = stackIn_6_1 != 0;
                stackOut_6_0 = this;
                stackIn_8_0 = stackOut_6_0;
                stackIn_7_0 = stackOut_6_0;
                if (param0 != 256) {
                  stackOut_8_0 = this;
                  stackOut_8_1 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  break L2;
                } else {
                  stackOut_7_0 = this;
                  stackOut_7_1 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  break L2;
                }
              }
              L3: {
                ((fj) this).field_kb = stackIn_9_1 != 0;
                ((fj) this).field_fb.b(8405024, -117, 4210752);
                var6 = new rh((fj) this, ((fj) this).field_mb, param2);
                var4_ref = var6;
                if (5 != param0) {
                  if (256 != param0) {
                    L4: {
                      stackOut_13_0 = (rh) var6;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_14_0 = stackOut_13_0;
                      if (((fj) this).field_ib) {
                        stackOut_15_0 = (rh) (Object) stackIn_15_0;
                        stackOut_15_1 = bk.field_d;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        break L4;
                      } else {
                        stackOut_14_0 = (rh) (Object) stackIn_14_0;
                        stackOut_14_1 = ap.field_f;
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        break L4;
                      }
                    }
                    ((rh) (Object) stackIn_16_0).a(stackIn_16_1, -1, -60);
                    break L3;
                  } else {
                    d discarded$2 = var6.a(bk.field_d, (uf) this, -109);
                    break L3;
                  }
                } else {
                  var6.a(jb.field_A, 11, -66);
                  var6.a(jd.field_b, 17, -60);
                  break L3;
                }
              }
              L5: {
                if (3 != param0) {
                  if (param0 != 4) {
                    if (6 == param0) {
                      var6.a(hm.field_H, 9, -90);
                      break L5;
                    } else {
                      if (param0 != 9) {
                        break L5;
                      } else {
                        d discarded$3 = var6.a(s.field_v, (uf) this, -126);
                        break L5;
                      }
                    }
                  } else {
                    var6.a(so.field_z, 8, -58);
                    break L5;
                  }
                } else {
                  var6.a(hb.field_o, 7, -82);
                  break L5;
                }
              }
              ((fj) this).a(false, (iq) (Object) var6);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var4;
            stackOut_27_1 = new StringBuilder().append("fj.A(").append(param0).append(',').append(param1).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L6;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L6;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ')');
        }
    }

    final static void g(byte param0) {
        km.a(af.field_H, true, true, mk.field_S);
        int var1 = 68 % ((-79 - param0) / 44);
        bf.field_a = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_hb = "Mouse over an icon for details";
    }
}
