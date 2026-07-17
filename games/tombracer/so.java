/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class so extends tra implements mk {
    static String field_J;
    private nua field_N;
    private int field_M;
    static int field_K;
    static String field_L;

    public static void m(int param0) {
        if (param0 != 200) {
            boolean discarded$0 = so.a(-98, (byte) 40, -89);
            field_J = null;
            field_L = null;
            return;
        }
        field_J = null;
        field_L = null;
    }

    final void a(int param0, int param1, ae param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            ((so) this).field_M = -param0 + jba.field_j + -((so) this).field_i;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "so.A(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    final void a(int param0, nua param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((so) this).field_N = param1;
              if (param0 == -13861) {
                break L1;
              } else {
                field_K = -19;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("so.BB(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final static void n(int param0) {
        vb var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              ipa.field_P.c();
              if (param0 == -16310) {
                break L1;
              } else {
                so.n(117);
                break L1;
              }
            }
            L2: {
              gg.field_b.c();
              bga.field_b = bga.field_b - 1;
              if (0 != bga.field_b) {
                break L2;
              } else {
                bga.field_b = 200;
                var1 = (vb) (Object) tna.field_e.f(-80);
                L3: while (true) {
                  if (var1 == null) {
                    if (db.field_f != null) {
                      var1 = (vb) (Object) db.field_f.f(param0 ^ 16378);
                      L4: while (true) {
                        if (var1 == null) {
                          break L2;
                        } else {
                          L5: {
                            if (var1.field_h.l((byte) -91)) {
                              break L5;
                            } else {
                              var1.p(param0 + 16389);
                              break L5;
                            }
                          }
                          var1 = (vb) (Object) db.field_f.e(118);
                          continue L4;
                        }
                      }
                    } else {
                      break L2;
                    }
                  } else {
                    L6: {
                      if (var1.field_h.l((byte) -101)) {
                        break L6;
                      } else {
                        var1.p(21);
                        break L6;
                      }
                    }
                    var1 = (vb) (Object) tna.field_e.e(110);
                    continue L3;
                  }
                }
              }
            }
            L7: {
              if (null == fq.field_e) {
                break L7;
              } else {
                if (fq.field_e.a((byte) -114)) {
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1_ref, "so.VA(" + param0 + 41);
        }
    }

    public final nua a(byte param0) {
        if (param0 < 44) {
            return null;
        }
        return ((so) this).field_N;
    }

    final void i(int param0) {
        super.i(param0);
        if (null != ((so) this).field_N) {
            ((so) this).field_N.c(-74);
        }
    }

    so(String param0, qc param1, int param2) {
        super(param0, param1, param2);
    }

    final static boolean a(int param0, byte param1, int param2) {
        int var3 = 118 / ((-39 - param1) / 53);
        return (jj.a(param2, param0, -32842) | mg.a((byte) -53, param2, param0) | gha.a(param2, param0, 86)) & hha.a(param2, 0, param0);
    }

    final String d(byte param0) {
        int var2 = 0;
        if (((so) this).field_f) {
          if (((so) this).field_q == null) {
            return null;
          } else {
            var2 = -81 % ((param0 - -58) / 60);
            gca.a(2533, jba.field_j - (((so) this).field_M + -((so) this).field_m), sta.field_B);
            return ((so) this).field_q;
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "+5 Coins";
        field_L = "Error";
    }
}
