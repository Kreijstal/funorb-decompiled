/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek implements ui {
    static int field_g;
    static int[] field_c;
    private kg field_f;
    private int field_b;
    static rc field_a;
    static int field_e;
    private int field_d;

    final static Class a(int param0, String param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_2_0 = null;
        Class stackIn_5_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_13_0 = null;
        Class stackIn_16_0 = null;
        Class stackIn_19_0 = null;
        Class stackIn_23_0 = null;
        Class stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.equals("B")) {
            stackIn_2_0 = Byte.TYPE;
            return stackIn_2_0;
          }
          if (param1.equals("I")) {
            stackIn_5_0 = Integer.TYPE;
            return stackIn_5_0;
          }
          if (param0 != 3249872) {
            ek.a(-89);
          }
          if (param1.equals("S")) {
            stackIn_10_0 = Short.TYPE;
            return stackIn_10_0;
          }
          if (param1.equals("J")) {
            stackIn_13_0 = Long.TYPE;
            return stackIn_13_0;
          }
          if (param1.equals("Z")) {
            stackIn_16_0 = Boolean.TYPE;
            return stackIn_16_0;
          }
          if (param1.equals("F")) {
            stackIn_19_0 = Float.TYPE;
            return stackIn_19_0;
          }
          if (param1.equals("D")) {
            stackIn_23_0 = Double.TYPE;
            return stackIn_23_0;
          }
          if (!param1.equals("C")) {
            return Class.forName(param1);
          }
          stackIn_27_0 = Character.TYPE;
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_30_0 = var2;
          stackIn_30_1 = new StringBuilder().append("ek.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 != -38) {
          field_c = (int[]) null;
        }
        field_c = null;
        field_a = null;
    }

    final static void a(int param0) {
        ck.field_z = wf.field_d.a(de.field_c[12]);
        int var1 = wf.field_d.a(de.field_c[13]);
        if (ck.field_z < var1) {
          ck.field_z = var1;
        }
        int var2 = wf.field_d.field_t + wf.field_d.field_D + 4;
        if (param0 < 88) {
          return;
        }
        fd.field_a[5] = var2 + (wf.field_d.field_t + 130 + wf.field_d.field_y) + 4;
        fd.field_b[5] = 2 * var2 + jk.field_x.a(true);
    }

    final static String a(int param0, CharSequence[] param1, int param2, int param3) {
        int var6_int = 0;
        int var7 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_11_0 = null;
        String stackIn_20_0 = null;
        String stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = Transmogrify.field_A ? 1 : 0;
        try {
          if (param3 == 0) {
            stackIn_4_0 = "";
            return stackIn_4_0;
          }
          if (param3 == 1) {
            var10 = param1[param2];
            var4 = var10;
            if (var4 != null) {
              stackIn_11_0 = var10.toString();
              return stackIn_11_0;
            }
            stackIn_9_0 = "null";
            return stackIn_9_0;
          }
          var4_int = param3 + param2;
          var5 = 0;
          for (var6_int = param2; var6_int < var4_int; var6_int++) {
            var7_ref_CharSequence = param1[var6_int];
            if (var7_ref_CharSequence != null) {
              var5 = var5 + var7_ref_CharSequence.length();
            } else {
              var5 += 4;
            }
          }
          var6 = new StringBuilder(var5);
          if (param0 >= -26) {
            stackIn_20_0 = (String) null;
            return stackIn_20_0;
          }
          for (var7 = param2; var4_int > var7; var7++) {
            var8 = param1[var7];
            if (var8 != null) {
              discarded$0 = var6.append(var8);
            } else {
              discarded$1 = var6.append("null");
            }
          }
          stackIn_28_0 = var6.toString();
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_31_0 = var4_ref;
          stackIn_31_1 = new StringBuilder().append("ek.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(int param0, int param1, boolean param2, byte param3, qg param4) {
        int stackIn_5_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Transmogrify.field_A ? 1 : 0;
        try {
          if (!param4.field_g &&
            !param4.b((byte) -119)) {
            stackIn_5_0 = 2188450;
          } else {
            stackIn_5_0 = 3249872;
          }
          var6_int = stackIn_5_0;
          var7 = -107 / ((51 - param3) / 47);
          this.field_f.a("<u=" + Integer.toString(var6_int, 16) + ">" + param4.field_k + "</u>", param0 + param4.field_p, param4.field_n + param1, param4.field_l, param4.field_h, var6_int, -1, this.field_b, this.field_d, this.field_f.field_y + this.field_f.field_t);
          if (param4.b((byte) 50)) {
            var8 = this.field_f.a(param4.field_k);
            var9 = this.field_f.field_t + this.field_f.field_y;
            var10 = param0 + param4.field_p;
            var11 = param1 + param4.field_n;
            if (this.field_b != 2) {
              if (1 == this.field_b) {
                var10 = var10 + (-var8 + param4.field_l >> 1);
              }
            } else {
              var10 = var10 + (param4.field_l - var8);
            }
            if (this.field_d == 2) {
              var11 = var11 + (-var9 + param4.field_h);
            } else {
              if (1 == this.field_d) {
                var11 = var11 + (-var9 + param4.field_h >> 1);
              }
            }
            ri.a(var8 + 4, -2 + var10, 2 + var11, (byte) -107, var9);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_20_0 = var6;
          stackIn_20_1 = new StringBuilder().append("ek.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    public ek() {
        this.field_b = 1;
        this.field_d = 1;
        this.field_f = vd.field_h;
    }

    ek(kg param0, int param1, int param2) {
        try {
          this.field_d = param2;
          this.field_b = param1;
          this.field_f = param0;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "ek.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_g = 250;
        field_c = new int[256];
        field_a = new rc();
    }
}
