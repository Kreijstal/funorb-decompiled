/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd {
    private String field_a;

    final void a(boolean param0, java.applet.Applet param1) {
        try {
            if (param0) {
                this.field_a = (String) null;
            }
            wg.a("jagex-last-login-method", param1, this.field_a, -26372, 31536000L);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "cd.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    cd(String param0) {
        try {
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "cd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(String param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -1) {
                break L1;
              } else {
                cd.a(51);
                break L1;
              }
            }
            stackIn_3_0 = this.field_a.equals(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("cd.C(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static void b(int param0) {
        int var1_int = 0;
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (!vh.c((byte) -93)) {
              L1: {
                if (null == ba.field_f) {
                  break L1;
                } else {
                  if (ba.field_f.field_d) {
                    wl.e((byte) 120);
                    si.field_o.b((byte) -56, new s(si.field_o, cg.field_c));
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var1_int = 63 / ((59 - param0) / 47);
              si.field_o.a(mb.field_a, mb.field_d, true, true);
              si.field_o.l(-43);
              L2: while (true) {
                if (!ba.a(-1)) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  si.field_o.a(oa.field_H, 121, rd.field_p);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "cd.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0) {
        fk.field_a = false;
        ah.field_h = false;
        qh.a(param0, true);
        ed.field_c = di.field_a;
        ch.field_d = di.field_a;
    }

    final static void a(hl param0, byte param1) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        hl var3 = null;
        int var4 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (param0.field_c != null) {
              L1: {
                L2: {
                  if (-1 != (param0.field_g ^ -1)) {
                    break L2;
                  } else {
                    if (-1 != (param0.field_k ^ -1)) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                var2_int = 0;
                L3: while (true) {
                  if (var2_int >= ea.field_c) {
                    break L1;
                  } else {
                    L4: {
                      var3 = pg.field_e[var2_int];
                      if (-3 != (var3.field_i ^ -1)) {
                        break L4;
                      } else {
                        if (var3.field_g != param0.field_g) {
                          break L4;
                        } else {
                          if (var3.field_k == param0.field_k) {
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L3;
                  }
                }
              }
              L5: {
                if (param0.field_l == null) {
                  break L5;
                } else {
                  break L5;
                }
              }
              if (param1 == 20) {
                qh.a(param0, 6191);
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (runtimeException);

            stackIn_23_1 = new StringBuilder().append("cd.B(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L6;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L6;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
    }
}
