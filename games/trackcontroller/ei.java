/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ei extends fc {
    static ja field_m;
    int field_n;
    static int field_o;
    static String field_k;
    static kk field_i;
    byte[] field_l;
    static String field_j;

    final static void a(byte param0, java.awt.Component param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param0 < -119) {
                break L1;
              } else {
                ei.a((qj) null, -127);
                break L1;
              }
            }
            param1.addMouseListener((java.awt.event.MouseListener) (Object) hd.field_p);
            param1.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) hd.field_p);
            param1.addFocusListener((java.awt.event.FocusListener) (Object) hd.field_p);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("ei.C(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    final static ng a(int param0, ng param1, int[] param2) {
        ng var3 = null;
        RuntimeException var3_ref = null;
        ng stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        ng stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            var3 = new ng(0, param0, 0);
            var3.field_c = param1.field_c;
            var3.field_a = param1.field_a;
            var3.field_j = param1.field_j;
            var3.field_l = param2;
            var3.field_g = param1.field_g;
            var3.field_k = param1.field_k;
            var3.field_b = param1.field_b;
            var3.field_m = param1.field_m;
            stackOut_0_0 = (ng) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("ei.B(").append(param0).append(',');
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L2;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_1_0;
    }

    public static void e(int param0) {
        try {
            field_m = null;
            field_j = null;
            field_i = null;
            field_k = null;
            int var1_int = -82 % ((param0 - 20) / 52);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "ei.D(" + param0 + ')');
        }
    }

    final static String a(byte param0) {
        RuntimeException var1 = null;
        String stackIn_4_0 = null;
        String stackIn_10_0 = null;
        String stackIn_12_0 = null;
        String stackIn_15_0 = null;
        String stackIn_18_0 = null;
        String stackIn_23_0 = null;
        String stackIn_26_0 = null;
        String stackIn_31_0 = null;
        Object stackIn_34_0 = null;
        String stackIn_39_0 = null;
        String stackIn_41_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_22_0 = null;
        String stackOut_30_0 = null;
        String stackOut_38_0 = null;
        String stackOut_40_0 = null;
        Object stackOut_33_0 = null;
        String stackOut_25_0 = null;
        String stackOut_17_0 = null;
        String stackOut_14_0 = null;
        String stackOut_11_0 = null;
        String stackOut_9_0 = null;
        try {
          L0: {
            if (gl.field_I < 2) {
              stackOut_3_0 = ee.field_f;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (null == ff.field_b) {
                if (field_i.c(-97)) {
                  if (field_i.b("commonui", (byte) -3)) {
                    if (!ha.field_x.c(-50)) {
                      stackOut_22_0 = fd.field_f;
                      stackIn_23_0 = stackOut_22_0;
                      return stackIn_23_0;
                    } else {
                      if (ha.field_x.b("commonui", (byte) -3)) {
                        if (!ok.field_G.c(117)) {
                          stackOut_30_0 = ra.field_w;
                          stackIn_31_0 = stackOut_30_0;
                          return stackIn_31_0;
                        } else {
                          if (param0 > 96) {
                            if (!ok.field_G.a((byte) 48)) {
                              stackOut_38_0 = ug.field_t + " - " + ok.field_G.a(true) + "%";
                              stackIn_39_0 = stackOut_38_0;
                              return stackIn_39_0;
                            } else {
                              stackOut_40_0 = f.field_d;
                              stackIn_41_0 = stackOut_40_0;
                              break L0;
                            }
                          } else {
                            stackOut_33_0 = null;
                            stackIn_34_0 = stackOut_33_0;
                            return (String) (Object) stackIn_34_0;
                          }
                        }
                      } else {
                        stackOut_25_0 = v.field_c + " - " + ha.field_x.a("commonui", 0) + "%";
                        stackIn_26_0 = stackOut_25_0;
                        return stackIn_26_0;
                      }
                    }
                  } else {
                    stackOut_17_0 = gj.field_e + " - " + field_i.a("commonui", 0) + "%";
                    stackIn_18_0 = stackOut_17_0;
                    return stackIn_18_0;
                  }
                } else {
                  stackOut_14_0 = sa.field_K;
                  stackIn_15_0 = stackOut_14_0;
                  return stackIn_15_0;
                }
              } else {
                if (ff.field_b.c(96)) {
                  stackOut_11_0 = jb.field_c;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                } else {
                  stackOut_9_0 = pc.field_t;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var1, "ei.A(" + param0 + ')');
        }
        return stackIn_41_0;
    }

    final static void a(qj param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var8 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (~(3 & (param0.field_q | param0.field_t)) != param1) {
                var2_int = 4 - (3 & param0.field_t);
                var3 = -(3 & param0.field_q) + 4;
                var4 = param0.field_t + var2_int;
                var5 = new int[(param0.field_t + var2_int) * (var3 + param0.field_q)];
                var6 = 0;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (var6 >= param0.field_q) {
                        break L4;
                      } else {
                        if (var8 != 0) {
                          break L3;
                        } else {
                          var7 = 0;
                          L5: while (true) {
                            L6: {
                              L7: {
                                if (param0.field_t <= var7) {
                                  break L7;
                                } else {
                                  var5[(var3 + var6) * var4 - (-var2_int + -var7)] = param0.field_z[var7 + param0.field_t * var6];
                                  var7++;
                                  if (var8 != 0) {
                                    break L6;
                                  } else {
                                    if (var8 == 0) {
                                      continue L5;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              var6++;
                              break L6;
                            }
                            if (var8 == 0) {
                              continue L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    param0.field_z = var5;
                    param0.field_t = param0.field_t + var2_int;
                    param0.field_r = param0.field_r - var2_int;
                    param0.field_o = param0.field_o - var3;
                    break L3;
                  }
                  param0.field_q = param0.field_q + var3;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var2;
            stackOut_18_1 = new StringBuilder().append("ei.E(");
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L8;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param1 + ')');
        }
    }

    final static void d(int param0) {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              oj.a(-108);
              if (null == ki.field_f) {
                break L1;
              } else {
                r.a(param0 + -14051, ki.field_f);
                break L1;
              }
            }
            L2: {
              ui.g(95);
              ij.a(13809);
              mi.k(10228);
              if (!wf.a(-28510)) {
                break L2;
              } else {
                ra.field_C.c(1, 7);
                me.a(param0 + 18600, 0);
                break L2;
              }
            }
            if (param0 == -18601) {
              lj.a((byte) 117);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw sl.a((Throwable) (Object) runtimeException, "ei.F(" + param0 + ')');
        }
    }

    private ei() throws Throwable {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          throw new Error();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var1, "ei.<init>()");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new ja();
        field_k = "Loading levels";
        field_j = "Names should contain a maximum of 12 characters";
    }
}
