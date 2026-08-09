/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg extends pj {
    static o field_J;
    static o field_I;
    static String field_K;

    public static void a(int param0) {
        field_K = null;
        field_I = null;
        if (param0 != 22722) {
            return;
        }
        field_J = null;
    }

    final static String a(boolean param0, int param1, CharSequence param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_13_0 = null;
        Object stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var3 = uc.a(param0, param2, 0);
            if (param1 <= -95) {
              if (var3 != null) {
                stackIn_7_0 = (String) (var3);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var4 = 0;
                L1: while (true) {
                  if (var4 < param2.length()) {
                    if (wg.a(param2.charAt(var4), (byte) -127)) {
                      var4++;
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        stackIn_16_0 = null;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    } else {
                      stackIn_13_0 = ah.field_b;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              stackIn_3_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("tg.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L2;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              return (String) ((Object) stackIn_16_0);
            }
          }
        }
    }

    final static ce a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        ce stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!td.field_h.a(false)) {
                break L1;
              } else {
                if (param0.equals(td.field_h.b(28903))) {
                  break L1;
                } else {
                  td.field_h = hh.a(param0, false);
                  break L1;
                }
              }
            }
            var2_int = -48 / ((44 - param1) / 48);
            stackIn_4_0 = td.field_h;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("tg.D(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        this.field_F = !this.field_F ? true : false;
        super.a(param0, param1, param2, param3);
    }

    tg(String param0, dg param1, boolean param2) {
        this(param0, param1);
        try {
            this.field_F = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "tg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private tg(String param0, dg param1) {
        this(param0, ph.field_f.field_i, param1);
        try {
            this.field_w = ph.field_f.field_r;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "tg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private tg(String param0, j param1, dg param2) {
        super(param0, param1, param2);
        try {
            this.field_w = ph.field_f.field_r;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "tg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_J = new o(540, 140);
        field_I = new o(270, 70);
        field_K = "Unfortunately your configuration doesn't support fullscreen mode.";
    }
}
