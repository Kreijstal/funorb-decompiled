/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg {
    static String field_c;
    static boolean field_d;
    static cc field_a;
    private kc[] field_b;

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        uk.a(((vg) this).field_b, (byte) -104, param2, param1, param4, param3);
        if (param0 > -69) {
            Object var7 = null;
            vg.a((vk) null, 11);
        }
    }

    vg(kc[] param0) {
        try {
            ((vg) this).field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "vg.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
    }

    final static void a(vk param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        vk var3 = null;
        int var4 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var4 = Main.field_T;
        try {
          L0: {
            if (null == param0.field_i) {
              return;
            } else {
              L1: {
                L2: {
                  if (~param0.field_c != param1) {
                    break L2;
                  } else {
                    if (param0.field_h == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var2_int = 0;
                L3: while (true) {
                  if (jh.field_c <= var2_int) {
                    break L1;
                  } else {
                    L4: {
                      var3 = me.field_b[var2_int];
                      if (var3.field_k != 2) {
                        break L4;
                      } else {
                        if (param0.field_c != var3.field_c) {
                          break L4;
                        } else {
                          if (var3.field_h == param0.field_h) {
                            return;
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
                if (null != param0.field_a) {
                  break L5;
                } else {
                  break L5;
                }
              }
              lh.a(7743, param0);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var2;
            stackOut_18_1 = new StringBuilder().append("vg.B(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = true;
        field_c = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_a = new cc();
    }
}
