/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf extends ks {
    static sa field_D;
    byte field_B;
    vh field_E;
    int field_F;
    static ic field_C;
    static String field_G;

    public static void h(int param0) {
        if (param0 != -29390) {
            return;
        }
        field_G = null;
        field_D = null;
        field_C = null;
    }

    final int g(int param0) {
        if (param0 != 0) {
            jf.b(-42, -14);
            if (!(null != this.field_E)) {
                return 0;
            }
            return this.field_E.field_q * 100 / (-this.field_B + this.field_E.field_o.length);
        }
        if (!(null != this.field_E)) {
            return 0;
        }
        return this.field_E.field_q * 100 / (-this.field_B + this.field_E.field_o.length);
    }

    final byte[] d(byte param0) {
        int var2;
        if (!this.field_x) {
          if (this.field_E.field_q < this.field_E.field_o.length + -this.field_B) {
            throw new RuntimeException();
          } else {
            var2 = -74 / ((-35 - param0) / 45);
            return this.field_E.field_o;
          }
        } else {
          throw new RuntimeException();
        }
    }

    final static void b(int param0, int param1) {
        te.field_n = param0;
        if (param1 < 83) {
          L0: {
            field_C = (ic) null;
            if (null != au.field_Kb) {
              au.field_Kb.f(-122, param0);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (null != lk.field_e) {
              lk.field_e.b(param0, 6);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          L2: {
            if (null != au.field_Kb) {
              au.field_Kb.f(-122, param0);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (null != lk.field_e) {
              lk.field_e.b(param0, 6);
              break L3;
            } else {
              break L3;
            }
          }
          return;
        }
    }

    jf() {
    }

    final static String a(String[][] param0, int param1, String param2, int param3, byte param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        String var6_ref_String = null;
        int var6 = 0;
        String var7 = null;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (kq.a(param2, false)) {
              L1: {
                var5_int = dq.a((byte) -105, param1);
                if (param1 == var5_int) {
                  break L1;
                } else {
                  var6_ref_String = pe.a(var5_int, false, param0);
                  if (var6_ref_String != null) {
                    var7 = ua.a(var5_int, (byte) 83, var6_ref_String);
                    stackIn_7_0 = (String) (var7);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              var6 = 68 / ((param4 - -77) / 49);
              stackIn_9_0 = (String) (param2);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_2_0 = (String) (param2);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("jf.D(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_9_0;
          }
        }
    }

    static {
        field_D = new sa();
        field_G = "New Game";
    }
}
