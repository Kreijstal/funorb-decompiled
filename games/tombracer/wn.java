/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wn extends nv {
    static String field_n;
    private int field_o;

    wn(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        try {
            this.field_o = param1.b((byte) 44, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "wn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int a(int param0, int param1) {
        if (param1 > -48) {
            field_n = (String) null;
        }
        return param0;
    }

    public final void m(int param0) {
        int var2;
        int var3;
        int var4;
        fsa stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        fsa stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          super.m(115);
          var2 = 81 % ((28 - param0) / 49);
          var3 = this.field_o;
          if (var3 == 0) {
            this.field_g.v((byte) 109);
            break L0;
          } else {
            if ((var3 ^ -1) != -2) {
              break L0;
            } else {
              L1: {
                stackIn_6_0 = this.field_g;

                stackIn_6_1 = 17;

                if (this.field_g.z((byte) 90)) {
                  stackIn_7_0 = (fsa) ((Object) stackIn_6_0);
                  stackIn_7_1 = stackIn_6_1;
                  stackIn_7_2 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = (fsa) ((Object) stackIn_6_0);
                  stackIn_7_1 = stackIn_6_1;
                  stackIn_7_2 = 1;
                  break L1;
                }
              }
              ((fsa) (Object) stackIn_7_0).b((byte) stackIn_7_1, stackIn_7_2 != 0);
              break L0;
            }
          }
        }
    }

    final int a(boolean param0) {
        if (param0) {
            return -85;
        }
        return 14;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            param1.a((byte) -125, this.field_o, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "wn.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, fsa param1) {
        try {
            if (!param0) {
                fsa var4 = (fsa) null;
                this.a(true, (fsa) null);
            }
            super.a(param0, param1);
            this.field_f = false;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "wn.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        if (param0 < 120) {
            return;
        }
        field_n = null;
    }

    final static hra a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6_ref_String = null;
        int var6 = 0;
        hra var7 = null;
        int var8 = 0;
        hra stackIn_4_0 = null;
        hra stackIn_8_0 = null;
        hra stackIn_12_0 = null;
        hra stackIn_17_0 = null;
        hra stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            if (var2_int == 0) {
              stackIn_4_0 = is.field_wb;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (255 < var2_int) {
                stackIn_8_0 = rg.field_A;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3 = rga.a(32287, param1, '.');
                if ((var3.length ^ -1) > -3) {
                  stackIn_12_0 = is.field_wb;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var4 = var3;
                  var5 = 0;
                  L1: while (true) {
                    if (var5 >= var4.length) {
                      var6 = -62 / ((param0 - -53) / 56);
                      stackIn_20_0 = qh.a(-58, var3[var3.length + -1]);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      var6_ref_String = var4[var5];
                      var7 = kua.a(var6_ref_String, -6962);
                      if (var7 == null) {
                        var5++;
                        continue L1;
                      } else {
                        stackIn_17_0 = (hra) (var7);
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var2);

            stackIn_23_1 = new StringBuilder().append("wn.L(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L2;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0;
              } else {
                return stackIn_20_0;
              }
            }
          }
        }
    }

    final void k(int param0) {
        if (param0 != 5418) {
            String var3 = (String) null;
            wn.a(-40, (String) null);
        }
    }

    static {
        field_n = "Press TAB to chat or F10 to open Quick Chat.";
    }
}
