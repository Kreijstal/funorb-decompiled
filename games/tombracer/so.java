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
            so.a(-98, (byte) 40, -89);
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
            this.field_M = -param0 + jba.field_j + -this.field_i;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "so.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(int param0, nua param1) {
        try {
            this.field_N = param1;
            if (param0 != -13861) {
                field_K = -19;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "so.BB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void n(int param0) {
        vb var1 = null;
        int var2 = 0;
        boolean stackIn_20_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
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
                var1 = (vb) ((Object) tna.field_e.f(-80));
                L3: while (true) {
                  if (var1 == null) {
                    if (db.field_f != null) {
                      var1 = (vb) ((Object) db.field_f.f(param0 ^ 16378));
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
                          var1 = (vb) ((Object) db.field_f.e(118));
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
                    var1 = (vb) ((Object) tna.field_e.e(110));
                    continue L3;
                  }
                }
              }
            }
            L7: {
              if (null == fq.field_e) {
                break L7;
              } else {
                stackIn_20_0 = fq.field_e.a((byte) -114);
                if (stackIn_20_0) {
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
          throw tba.a((Throwable) ((Object) var1_ref), "so.VA(" + param0 + ')');
        }
    }

    public final nua a(byte param0) {
        if (param0 < 44) {
            return (nua) null;
        }
        return this.field_N;
    }

    final void i(int param0) {
        super.i(param0);
        if (null != this.field_N) {
            this.field_N.c(-74);
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
        int var2;
        if (this.field_f) {
          if (this.field_q == null) {
            return null;
          } else {
            var2 = -81 % ((param0 - -58) / 60);
            gca.a(2533, jba.field_j - (this.field_M + -this.field_m), sta.field_B);
            return this.field_q;
          }
        } else {
          return null;
        }
    }

    static {
        field_J = "+5 Coins";
        field_L = "Error";
    }
}
