/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb {
    String field_d;
    boolean field_c;
    String field_a;
    static String field_b;

    final static void a(boolean param0, byte param1) {
        int var2;
        int var3;
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
              l.a(mg.field_k, -80);
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
        L3: {
          if (param1 <= -119) {
            break L3;
          } else {
            hb.a(108);
            break L3;
          }
        }
    }

    final static void b(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        fb var4 = null;
        int var4_int = 0;
        int var5 = 0;
        qf var5_ref_qf = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        se var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var9 = cd.field_t;
              if (param0 == 554553416) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            L2: {
              var2 = var9.b((byte) 90);
              var3 = var9.b((byte) 90);
              if (var2 == 0) {
                var4 = (fb) ((Object) mg.field_l.b((byte) -41));
                if (var4 == null) {
                  th.a(113);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    var5 = tf.field_c - var9.field_i;
                    var11 = var4.field_g;
                    var10 = var11;
                    var6 = var10;
                    if (var11.length << -1845973534 < var5) {
                      var5 = var11.length << 791664770;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var7 = 0;
                  L4: while (true) {
                    if (var7 >= var5) {
                      var4.b(57);
                      break L2;
                    } else {
                      var6[var7 >> -1453597886] = var6[var7 >> -1453597886] + (var9.b((byte) 90) << (vi.a(3, var7) << 554553416));
                      var7++;
                      continue L4;
                    }
                  }
                }
              } else {
                if (1 != var2) {
                  pe.a((byte) -13, (Throwable) null, "LR1: " + sj.b(true));
                  th.a(106);
                  break L2;
                } else {
                  var4_int = var9.c(true);
                  var5_ref_qf = (qf) ((Object) vb.field_h.b((byte) -124));
                  L5: while (true) {
                    L6: {
                      if (var5_ref_qf == null) {
                        break L6;
                      } else {
                        L7: {
                          if (var5_ref_qf.field_j != var3) {
                            break L7;
                          } else {
                            if (var4_int != var5_ref_qf.field_i) {
                              break L7;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var5_ref_qf = (qf) ((Object) vb.field_h.d(853));
                        continue L5;
                      }
                    }
                    if (var5_ref_qf == null) {
                      th.a(param0 ^ 554553381);
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var5_ref_qf.b(param0 ^ 554553457);
                      break L2;
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1), "hb.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, hj param8) {
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        try {
            var9_int = -param0 + (param5 + param8.field_p + param1);
            var10 = param1 + (param8.field_p - (-param5 + -param6));
            var11 = param8.field_u - (-param7 - (param8.field_k >> -536031135));
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
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "hb.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ')');
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
            field_b = (String) null;
        }
        field_b = null;
    }

    static {
        field_b = "Loading sound effects";
    }
}
