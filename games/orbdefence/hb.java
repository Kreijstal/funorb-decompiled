/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb {
    String field_d;
    boolean field_c;
    String field_a;
    static String field_b;

    final static void a(boolean param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = OrbDefence.field_D ? 1 : 0;
          if (0 >= tc.field_b) {
            if (n.b((byte) 127)) {
              var2 = 0;
              break L0;
            } else {
              var2 = 1;
              break L0;
            }
          } else {
            L1: {
              if (null != ne.field_b) {
                mg.field_k = ne.field_b.c(126);
                fh.a(17489, 2);
                break L1;
              } else {
                mg.field_k = wd.a(480, (byte) 109, 0, 0, wc.field_c, 640);
                break L1;
              }
            }
            if (mg.field_k != null) {
              var2 = 2;
              l.a((java.awt.Canvas) (Object) mg.field_k, -80);
              break L0;
            } else {
              var2 = 3;
              break L0;
            }
          }
        }
        L2: {
          if (null != ne.field_b) {
            break L2;
          } else {
            if (fh.field_c) {
              gb.a(true, var2, param0);
              break L2;
            } else {
              break L2;
            }
          }
        }
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        fb var4 = null;
        int var4_int = 0;
        qf var5_ref_qf = null;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        se var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var9 = cd.field_t;
              var2 = var9.b((byte) 90);
              var3 = var9.b((byte) 90);
              if (var2 == 0) {
                var4 = (fb) (Object) mg.field_l.b((byte) -41);
                if (var4 == null) {
                  th.a(113);
                  return;
                } else {
                  L2: {
                    var5 = tf.field_c - var9.field_i;
                    var13 = var4.field_g;
                    var12 = var13;
                    var11 = var12;
                    var10 = var11;
                    var6 = var10;
                    if (var13.length << 2 < var5) {
                      var5 = var13.length << 2;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var7 = 0;
                  L3: while (true) {
                    if (var7 >= var5) {
                      var4.b(57);
                      break L1;
                    } else {
                      var6[var7 >> 2] = var6[var7 >> 2] + (var9.b((byte) 90) << (vi.a(3, var7) << 8));
                      var7++;
                      continue L3;
                    }
                  }
                }
              } else {
                if (1 != var2) {
                  pe.a((byte) -13, (Throwable) null, "LR1: " + sj.b(true));
                  th.a(106);
                  break L1;
                } else {
                  var4_int = var9.c(true);
                  var5_ref_qf = (qf) (Object) vb.field_h.b((byte) -124);
                  L4: while (true) {
                    L5: {
                      if (var5_ref_qf == null) {
                        break L5;
                      } else {
                        L6: {
                          if (var5_ref_qf.field_j != var3) {
                            break L6;
                          } else {
                            if (var4_int != var5_ref_qf.field_i) {
                              break L6;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var5_ref_qf = (qf) (Object) vb.field_h.d(853);
                        continue L4;
                      }
                    }
                    if (var5_ref_qf == null) {
                      th.a(109);
                      return;
                    } else {
                      var5_ref_qf.b(57);
                      break L1;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var1, "hb.C(" + 554553416 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, hj param8) {
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var9_int = -param0 + (param5 + param8.field_p + param1);
            var10 = param1 + (param8.field_p - (-param5 + -param6));
            var11 = param8.field_u - (-param7 - (param8.field_k >> 1));
            ul.i(var9_int, 0, var10, param2 + var11);
            param8.e(param5 + param4, param7 + -1, param3);
            param8.e(-1 + param5, param7 - -1, param3);
            ul.b(rh.field_e);
            ul.i(1 + var9_int, 0, var10 + 1, param2 + var11);
            param8.e(param5 - -1, -1 + param7, param3);
            param8.e(param5 - -1, 1 + param7, param3);
            ul.b(rh.field_e);
            var9_int = -param6 + param8.field_o + param8.field_p + (param5 + -param1);
            var10 = -param0 + (-param1 + (param5 + param8.field_o + param8.field_p));
            ul.i(var9_int, var11 + -param2, var10, 480);
            param8.e(-1 + param5, -1 + param7, param3);
            param8.e(-1 + param5, param7 - -1, param3);
            ul.b(rh.field_e);
            ul.i(var9_int + 1, var11 + -param2, var10 - -1, 480);
            param8.e(1 + param5, param7 - 1, param3);
            param8.e(1 + param5, param7 + 1, param3);
            ul.b(rh.field_e);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var9;
            stackOut_2_1 = new StringBuilder().append("hb.E(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param8 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
    }

    final static void a(long param0, int param1) {
        if (param0 <= 0L) {
            return;
        }
        if (param1 < 93) {
            return;
        }
        if (0L == param0 % 10L) {
            km.a(param0 + -1L, -25680);
            km.a(1L, -25680);
        } else {
            km.a(param0, -25680);
        }
    }

    public static void a(int param0) {
        if (param0 < 98) {
            field_b = null;
        }
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Loading sound effects";
    }
}
