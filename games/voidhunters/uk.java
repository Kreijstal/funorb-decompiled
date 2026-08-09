/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk implements dja {
    static String field_a;

    public final tv a(byte param0) {
        int var2 = -55 / ((-64 - param0) / 50);
        return (tv) ((Object) new vp());
    }

    final static boolean a(int param0, fm param1, fm param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2.field_c < param1.field_c) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1.field_c != param2.field_c) {
                  break L1;
                } else {
                  if (param2.field_a < param1.field_a) {
                    stackIn_8_0 = 1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              if (param0 == -27544) {
                stackIn_12_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                field_a = (String) null;
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("uk.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    public static void c(byte param0) {
        field_a = null;
        if (param0 < 27) {
            uk.c((byte) -7);
        }
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            this.a((byte) 15);
            return (tv[]) ((Object) new vp[param1]);
        }
        return (tv[]) ((Object) new vp[param1]);
    }

    final static void b(byte param0) {
        int var1;
        int var2;
        var2 = VoidHunters.field_G;
        rg.field_b = false;
        hab.field_j = null;
        if (!tla.field_c) {
          var1 = jl.field_p;
          if (var1 > 0) {
            if ((var1 ^ -1) == -2) {
              hab.field_j = nnb.field_d;
              hab.field_j = geb.a(0, new CharSequence[]{(CharSequence) ((Object) hab.field_j), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) vo.field_o)});
              hwa.field_o.l((byte) -106);
              gib.a((byte) -89);
              if (param0 <= 30) {
                uk.c((byte) 6);
                return;
              } else {
                return;
              }
            } else {
              hab.field_j = isa.a(bva.field_g, new String[]{Integer.toString(var1)}, 119);
              hab.field_j = geb.a(0, new CharSequence[]{(CharSequence) ((Object) hab.field_j), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) vo.field_o)});
              hwa.field_o.l((byte) -106);
              gib.a((byte) -89);
              if (param0 > 30) {
                return;
              } else {
                uk.c((byte) 6);
                return;
              }
            }
          } else {
            hwa.field_o.l((byte) -106);
            gib.a((byte) -89);
            if (param0 > 30) {
              return;
            } else {
              uk.c((byte) 6);
              return;
            }
          }
        } else {
          hwa.field_o.g(-123);
          if (param0 <= 30) {
            uk.c((byte) 6);
            return;
          } else {
            return;
          }
        }
    }

    static {
        field_a = "<%0> wants to join";
    }
}
