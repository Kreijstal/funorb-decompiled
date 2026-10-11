/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of {
    static int field_b;
    private int field_j;
    private int field_e;
    static long field_c;
    private tc[] field_l;
    static byte[][] field_d;
    static boolean field_i;
    static String field_g;
    static dd[] field_h;
    String field_f;
    private int field_a;
    float field_k;

    private final void a(tc param0, int param1, boolean param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_float = (float)param1 / 100.0f + (float)(this.field_j + 1);
          if (0 != param1) {
            this.field_f = param0.field_d + " - " + param1 + "%";
          } else {
            this.field_f = param0.field_i;
          }
          this.field_k = (float)this.field_a * var4_float / (float)(1 + this.field_e);
          if (!param2) {
            return;
          }
          this.c(-38);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("of.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final boolean c(int param0) {
        tc var2;
        int var3;
        tc var4;
        var3 = fleas.field_A ? 1 : 0;
        while (this.field_e > this.field_j) {
          var4 = this.field_l[this.field_j];
          var2 = var4;
          if (!var4.field_a.b((byte) -110)) {
            this.a(var4, 0, false);
            return false;
          }
          if (var4.field_f >= 0 &&
            !var4.field_a.c(var4.field_f, 14969)) {
            this.a(var2, var4.field_a.b(var4.field_f, -2), false);
            return false;
          }
          if (null != var4.field_c &&
            !var4.field_a.a(var4.field_c, -95)) {
            this.a(var2, var4.field_a.a(-84, var4.field_c), false);
            return false;
          }
          if (0 > var4.field_f &&
            null == var4.field_c &&
            null != var4.field_d &&
            !var4.field_a.a(param0 ^ -58)) {
            this.a(var2, var4.field_a.a((byte) -77), false);
            return false;
          }
          this.field_j = this.field_j + 1;
        }
        if (param0 != 0) {
          return false;
        }
        return true;
    }

    final static jg a(int param0) {
        try {
          Throwable var1 = null;
          jg stackIn_3_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param0 != -21814) {
              of.b(125);
            }
            stackIn_3_0 = (jg) (Class.forName("oi").newInstance());
            return stackIn_3_0;
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = decompiledCaughtException;
            return null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        field_h = null;
        field_g = null;
        field_d = (byte[][]) null;
        int var1 = 30 % ((param0 + 47) / 39);
    }

    final static dd[] a(String param0, String param1, rh param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        rh var6 = null;
        dd[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 <= 58) {
            var6 = (rh) null;
            of.a((String) null, (String) null, (rh) null, 93);
          }
          var4_int = param2.a(param1, (byte) -100);
          var5 = param2.a(param0, (byte) -15, var4_int);
          stackIn_3_0 = oc.a(param2, var5, var4_int, (byte) -109);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("of.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    private of() throws Throwable {
        throw new Error();
    }

    static {
        field_g = "<%0>Teleporter:<%1> Come in pairs; teleports fleas from one to the other.";
        field_i = false;
    }
}
