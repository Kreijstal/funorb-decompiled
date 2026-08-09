/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi implements vc {
    int field_a;
    private od field_e;
    static jn field_f;
    int[] field_c;
    int field_d;
    static int field_h;
    static ri[] field_b;
    static String field_g;

    public static void a(int param0) {
        field_g = null;
        field_b = null;
        field_f = null;
        if (param0 != 5423) {
            hi.a(-118, -104, 102, (byte) -57, 11, -58, -86, -66, -88, -10, 127, 84, -31, 35, 34, 22);
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var16;
        int var17;
        var17 = Sumoblitz.field_L ? 1 : 0;
        if (param12 < param8) {
          if (param2 <= param8) {
            if (param12 < param2) {
              ph.a(param5, param13, param10, param6, lk.field_a, param11, param4, param1, param7, param0, param15, param14, param8, param12, (byte) -48, param9, param2);
              var16 = 70 % ((68 - param3) / 35);
              return;
            } else {
              ph.a(param0, param13, param10, param6, lk.field_a, param4, param11, param9, param14, param5, param15, param7, param8, param2, (byte) -48, param1, param12);
              var16 = 70 % ((68 - param3) / 35);
              return;
            }
          } else {
            ph.a(param5, param11, param7, param1, lk.field_a, param13, param4, param6, param10, param15, param0, param14, param2, param12, (byte) -48, param9, param8);
            var16 = 70 % ((68 - param3) / 35);
            return;
          }
        } else {
          if (param12 >= param2) {
            if (param2 <= param8) {
              ph.a(param0, param4, param14, param9, lk.field_a, param13, param11, param6, param10, param15, param5, param7, param12, param2, (byte) -48, param1, param8);
              var16 = 70 % ((68 - param3) / 35);
              return;
            } else {
              ph.a(param15, param4, param14, param9, lk.field_a, param11, param13, param1, param7, param0, param5, param10, param12, param8, (byte) -48, param6, param2);
              var16 = 70 % ((68 - param3) / 35);
              return;
            }
          } else {
            ph.a(param15, param11, param7, param1, lk.field_a, param4, param13, param9, param14, param5, param0, param10, param2, param8, (byte) -48, param6, param12);
            var16 = 70 % ((68 - param3) / 35);
            return;
          }
        }
    }

    hi(qa param0, hr param1, od param2) {
        RuntimeException var4 = null;
        gl var5 = null;
        mj var6 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 instanceof mj) {
              var6 = (mj) ((Object) param1);
              this.field_d = var6.field_z;
              this.field_a = var6.field_q;
              this.field_c = var6.field_E;
              break L0;
            } else {
              if (param1 instanceof gl) {
                var5 = (gl) ((Object) param1);
                this.field_d = var5.field_z;
                this.field_c = var5.field_E;
                this.field_a = var5.field_q;
                break L0;
              } else {
                throw new RuntimeException();
              }
            }
          }
          if (param2 != null) {
            L1: {
              this.field_e = param2;
              if (this.field_d != this.field_e.field_b) {
                break L1;
              } else {
                if (this.field_a != this.field_e.field_a) {
                  break L1;
                } else {
                  return;
                }
              }
            }
            throw new RuntimeException();
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("hi.<init>(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_15_0), stackIn_21_2 + ')');
        }
    }

    static {
        field_f = new jn();
        field_g = "Checking";
    }
}
