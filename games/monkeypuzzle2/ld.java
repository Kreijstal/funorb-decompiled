/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld {
    static long field_a;
    static String field_b;

    final static void a(String param0, byte param1) {
        try {
            df.field_o = param0;
            if (param1 != -13) {
                String var3 = (String) null;
                ld.a((String) null, (byte) -41);
            }
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "ld.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0) {
        hk var1 = null;
        int var2 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
            vh.field_B.c();
            fc.field_k.c();
            vg.field_J = vg.field_J - 1;
            if (param0) {
                ld.a(126);
            }
            if (-1 == (vg.field_J ^ -1)) {
                vg.field_J = 200;
                var1 = (hk) ((Object) bd.field_c.a((byte) -117));
                while (var1 != null) {
                    if (!var1.field_h.d(-3548)) {
                        var1.c(-19822);
                    }
                    var1 = (hk) ((Object) bd.field_c.d((byte) 63));
                }
            }
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "ld.B(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 > -66) {
            ld.a(73);
        }
    }

    final static boolean a(rb param0, int param1, rb param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = param2.field_gb - param0.field_gb;
            if (param1 == -24612) {
              L1: {
                if (cm.field_G == param2.field_bb) {
                  var3_int -= 200;
                  break L1;
                } else {
                  if (null != param2.field_bb) {
                    break L1;
                  } else {
                    var3_int += 200;
                    break L1;
                  }
                }
              }
              L2: {
                if (cm.field_G != param0.field_bb) {
                  if (null == param0.field_bb) {
                    var3_int -= 200;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  var3_int += 200;
                  break L2;
                }
              }
              L3: {
                if ((var3_int ^ -1) >= -1) {
                  stackIn_16_0 = 0;
                  break L3;
                } else {
                  stackIn_16_0 = 1;
                  break L3;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3);

            stackIn_19_1 = new StringBuilder().append("ld.D(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_16_0 != 0;
        }
    }

    final static boolean b(boolean param0) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        if (param0) {
          if (10 <= k.field_g) {
            if (ha.field_db) {
              return false;
            } else {
              L0: {
                if (cb.a(false)) {
                  stackIn_16_0 = 0;
                  break L0;
                } else {
                  stackIn_16_0 = 1;
                  break L0;
                }
              }
              return stackIn_16_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          field_a = 113L;
          if (10 <= k.field_g) {
            if (ha.field_db) {
              return false;
            } else {
              L1: {
                if (cb.a(false)) {
                  stackIn_7_0 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = 1;
                  break L1;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    static {
        field_b = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
