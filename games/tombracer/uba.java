/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uba extends kma implements cd, eaa {
    static int field_f;
    paa field_i;
    static String[] field_g;
    static String field_h;

    final String e(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        String stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              var2_int = ((uba) this).field_i.a(param0 + -1780);
              var3 = ((uba) this).field_i.d(param0 + 20939);
              var4 = ((uba) this).field_i.j((byte) 110);
              var5 = cn.a((byte) 60);
              if (var4 < param0) {
                break L1;
              } else {
                if (-3 + var5 >= var4) {
                  if (!fa.a(var3, var2_int, true, var4)) {
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    stackOut_6_0 = null;
                    stackIn_7_0 = stackOut_6_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            stackOut_3_0 = gl.a((byte) 91, era.field_b, new String[2]);
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = (NumberFormatException) (Object) decompiledCaughtException;
            decompiledRegionSelector0 = 0;
            break L2;
          }
        }
        if (decompiledRegionSelector0 == 0) {
          return nia.field_m;
        } else {
          return (String) (Object) stackIn_7_0;
        }
    }

    public final boolean a(boolean param0) {
        if (!param0) {
            ((uba) this).field_i = null;
            return ((uba) this).field_i.i((byte) 64);
        }
        return ((uba) this).field_i.i((byte) 64);
    }

    public static void b(byte param0) {
        field_g = null;
        field_h = null;
        if (param0 != -128) {
            uba.b((byte) -33);
        }
    }

    public final void a(tra param0, int param1) {
        RuntimeException runtimeException = null;
        Object var4 = null;
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
              ((uba) this).c(-65);
              if (param1 == -10) {
                break L1;
              } else {
                var4 = null;
                ((uba) this).a((tra) null, -90);
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
            stackOut_3_1 = new StringBuilder().append("uba.U(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    final it d(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        it stackIn_3_0 = null;
        it stackIn_6_0 = null;
        it stackIn_10_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        it stackOut_2_0 = null;
        it stackOut_9_0 = null;
        it stackOut_5_0 = null;
        try {
          L0: {
            var2_int = ((uba) this).field_i.a(111);
            var3 = ((uba) this).field_i.d(22829);
            var4 = ((uba) this).field_i.j((byte) 110);
            var5 = cn.a((byte) 125);
            if (~var4 > param0) {
              stackOut_2_0 = fp.field_c;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (var4 <= -3 + var5) {
                if (!fa.a(var3, var2_int, true, var4)) {
                  stackOut_9_0 = fp.field_c;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                stackOut_5_0 = fp.field_c;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return fp.field_c;
        }
        if (decompiledRegionSelector0 == 0) {
          return uh.field_k;
        } else {
          return stackIn_10_0;
        }
    }

    public final void a(int param0, rla param1) {
        if (param0 != -3) {
            return;
        }
        try {
            ((uba) this).c(-81);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "uba.AA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public uba() {
    }

    public final void a(int param0, tra param1) {
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
              if (param0 == -6038) {
                break L1;
              } else {
                field_f = -61;
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
            stackOut_3_1 = new StringBuilder().append("uba.KA(").append(param0).append(44);
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new String[]{"Building tombs", "Setting traps", "Scattering bones", "Poking snakes", "Carving statues", "Drawing maps", "Lighting torches", "Inviting archaeologists", "Rolling boulders", "Looking for Tom Bracer...", "Twiddling Thumbs"};
        field_h = "You are on <%0>";
    }
}
