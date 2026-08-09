/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class l implements Iterator {
    static String field_a;
    static String field_f;
    static tg field_i;
    private ck field_h;
    static ql field_e;
    static int field_g;
    private q field_d;
    private int field_b;
    private ck field_c;

    final static void a(em param0, byte param1) {
        try {
            int var2_int = -112 % ((-14 - param1) / 32);
            ll.field_e.a(param0);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "l.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(gk[] param0, cm param1, String[] param2, int[] param3, int param4, String[] param5, String[][] param6, int param7, cm param8, byte param9, String[][] param10, wk[][] param11, cm param12, byte[] param13, wk[][] param14, boolean param15, int[] param16, int param17, String[] param18, byte[] param19) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_42_1 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        StringBuilder stackIn_45_1 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_48_1 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var20 = null;
        byte[] var21 = null;
        try {
          L0: {
            L1: {
              oh.a(param3, false, param8, param0, param12);
              lb.a((byte) 109, param8);
              if (param9 == 94) {
                break L1;
              } else {
                var21 = (byte[]) null;
                l.a((gk[]) null, (cm) null, (String[]) null, (int[]) null, 58, (String[]) null, (String[][]) null, -8, (cm) null, (byte) -10, (String[][]) null, (wk[][]) null, (cm) null, (byte[]) null, (wk[][]) null, true, (int[]) null, 95, (String[]) null, (byte[]) null);
                break L1;
              }
            }
            oh.a(param7, param16, param5, param10, param2, param9 ^ 94, param6, param4, param11, param14, param17, param18, param13, param19, param8);
            vl.a(param8, param1, param15, -119);
            rm.b((byte) -115);
            bf.m(854);
            sb.a(false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var20 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var20);

            stackIn_6_1 = new StringBuilder().append("l.C(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param6 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param9).append(',');

            if (param10 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L9;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');

            if (param11 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L10;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param12 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L11;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_36_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',');

            if (param13 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L12;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_39_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',');

            if (param14 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L13;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L13;
            }
          }
          L14: {


            stackIn_42_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_40_2).append(',').append(param15).append(',');

            if (param16 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L14;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L14;
            }
          }
          L15: {


            stackIn_45_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(',').append(param17).append(',');

            if (param18 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L15;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
              break L15;
            }
          }
          L16: {


            stackIn_48_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(',');

            if (param19 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "null";
              break L16;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "{...}";
              break L16;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), stackIn_49_2 + ')');
        }
    }

    public final boolean hasNext() {
        int fieldTemp$1 = 0;
        int var2;
        var2 = SteelSentinels.field_G;
        if (this.field_d.field_j[this.field_b - 1] == this.field_c) {
          L0: while (true) {
            if (this.field_d.field_e > this.field_b) {
              fieldTemp$1 = this.field_b;
              this.field_b = this.field_b + 1;
              if (this.field_d.field_j[fieldTemp$1].field_k != this.field_d.field_j[-1 + this.field_b]) {
                this.field_c = this.field_d.field_j[this.field_b - 1].field_k;
                return true;
              } else {
                this.field_c = this.field_d.field_j[-1 + this.field_b];
                continue L0;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    public final void remove() {
        if (this.field_h == null) {
            throw new IllegalStateException();
        }
        this.field_h.b(4);
        this.field_h = null;
    }

    public final Object next() {
        int fieldTemp$1 = 0;
        int var2;
        Object var3;
        ck var3_ref;
        ck var4;
        var2 = SteelSentinels.field_G;
        if (this.field_d.field_j[this.field_b + -1] == this.field_c) {
          L0: while (true) {
            if (this.field_d.field_e > this.field_b) {
              fieldTemp$1 = this.field_b;
              this.field_b = this.field_b + 1;
              var3_ref = this.field_d.field_j[fieldTemp$1].field_k;
              if (var3_ref == this.field_d.field_j[this.field_b - 1]) {
                continue L0;
              } else {
                this.field_h = var3_ref;
                this.field_c = var3_ref.field_k;
                return var3_ref;
              }
            } else {
              return null;
            }
          }
        } else {
          var4 = this.field_c;
          this.field_c = var4.field_k;
          this.field_h = var4;
          return var4;
        }
    }

    private final void a(int param0) {
        this.field_b = 1;
        if (param0 != 29329) {
          field_i = (tg) null;
          this.field_h = null;
          this.field_c = this.field_d.field_j[0].field_k;
          return;
        } else {
          this.field_h = null;
          this.field_c = this.field_d.field_j[0].field_k;
          return;
        }
    }

    public static void a(byte param0) {
        byte[] var2;
        if (param0 != 22) {
          var2 = (byte[]) null;
          l.a((gk[]) null, (cm) null, (String[]) null, (int[]) null, 96, (String[]) null, (String[][]) null, -31, (cm) null, (byte) 116, (String[][]) null, (wk[][]) null, (cm) null, (byte[]) null, (wk[][]) null, true, (int[]) null, -127, (String[]) null, (byte[]) null);
          field_i = null;
          field_f = null;
          field_e = null;
          field_a = null;
          return;
        } else {
          field_i = null;
          field_f = null;
          field_e = null;
          field_a = null;
          return;
        }
    }

    l(q param0) {
        this.field_h = null;
        try {
            this.field_d = param0;
            this.a(29329);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "l.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "<%0> got careless";
        field_f = "Jump:";
        field_g = -1;
    }
}
