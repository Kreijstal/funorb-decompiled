/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class me extends vg {
    boolean field_h;
    qh field_i;
    static String field_f;
    ff field_g;

    abstract boolean a(int param0, char param1, byte param2);

    abstract void a(byte param0);

    abstract boolean a(boolean param0);

    final boolean c(byte param0) {
        if (param0 > -109) {
            me.a(109);
        }
        return this.field_h;
    }

    public static void a(int param0) {
        if (param0 != 17355) {
            field_f = (String) null;
        }
        field_f = null;
    }

    void b(int param0) {
        if (param0 != -10968) {
            this.c((byte) -2);
        }
        this.field_h = true;
    }

    abstract void b(byte param0);

    me(qh param0) {
        try {
            this.field_i = param0;
            this.field_g = param0.field_k;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "me.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static short[] a(byte param0, int param1, kh param2, short[] param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        short[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var4_int = param2.b((byte) 44, param1);
            if (-1 != (var4_int ^ -1)) {
              L1: {
                L2: {
                  if (param3 == null) {
                    break L2;
                  } else {
                    if (param3.length == var4_int) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                param3 = new short[var4_int];
                break L1;
              }
              L3: {
                var5 = param2.b((byte) 44, 4);
                var6 = (short)param2.b((byte) 44, 16);
                if (-1 > (var5 ^ -1)) {
                  var7 = 0;
                  L4: while (true) {
                    if (var4_int <= var7) {
                      break L3;
                    } else {
                      param3[var7] = (short)(param2.b((byte) 44, var5) + var6);
                      var7++;
                      continue L4;
                    }
                  }
                } else {
                  var7 = 0;
                  L5: while (true) {
                    if (var7 >= var4_int) {
                      break L3;
                    } else {
                      param3[var7] = (short)var6;
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
              L6: {
                if (param0 > 64) {
                  break L6;
                } else {
                  field_f = (String) null;
                  break L6;
                }
              }
              stackIn_18_0 = (short[]) (param3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("me.N(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (short[]) ((Object) stackIn_3_0);
        } else {
          return stackIn_18_0;
        }
    }

    static {
        field_f = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
