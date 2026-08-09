/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al implements hf {
    static gl field_f;
    int field_g;
    private woa field_c;
    float[] field_b;
    static String field_a;
    int[] field_e;
    int field_d;

    final static void a(int param0) {
        CharSequence var2;
        CharSequence var3;
        if (param0 >= -84) {
          field_a = (String) null;
          kca.field_a = qga.field_b.a(-1);
          var2 = (CharSequence) ((Object) kca.field_a);
          ffb.field_e = jwa.a(false, var2);
          return;
        } else {
          kca.field_a = qga.field_b.a(-1);
          var3 = (CharSequence) ((Object) kca.field_a);
          ffb.field_e = jwa.a(false, var3);
          return;
        }
    }

    final static void a(ksa param0, ksa param1, int param2) {
        try {
            if (!(param0.field_a == null)) {
                param0.b(-3846);
            }
            param0.field_a = param1.field_a;
            param0.field_c = param1;
            param0.field_a.field_c = param0;
            if (param2 != 2) {
                ksa var4 = (ksa) null;
                al.a((ksa) null, (ksa) null, 44);
            }
            param0.field_c.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "al.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    al(sob param0, aja param1, woa param2) {
        RuntimeException runtimeException = null;
        sda var5 = null;
        wfa var6 = null;
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
            L1: {
              if (!(param1 instanceof sda)) {
                if (param1 instanceof wfa) {
                  var6 = (wfa) ((Object) param1);
                  this.field_e = var6.field_F;
                  this.field_g = var6.field_q;
                  this.field_d = var6.field_e;
                  break L1;
                } else {
                  throw new RuntimeException();
                }
              } else {
                var5 = (sda) ((Object) param1);
                this.field_d = var5.field_e;
                this.field_g = var5.field_q;
                this.field_e = var5.field_F;
                break L1;
              }
            }
            L2: {
              if (param2 == null) {
                break L2;
              } else {
                L3: {
                  this.field_c = param2;
                  if (this.field_d != this.field_c.field_a) {
                    break L3;
                  } else {
                    if (this.field_g == this.field_c.field_c) {
                      this.field_b = this.field_c.field_d;
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                throw new RuntimeException();
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (runtimeException);

            stackIn_14_1 = new StringBuilder().append("al.<init>(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), stackIn_21_2 + ')');
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            al.a(-57);
            field_f = null;
            field_a = null;
            return;
        }
        field_f = null;
        field_a = null;
    }

    static {
        field_f = new gl(2);
    }
}
