/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni extends pv {
    static ss field_l;
    static String field_k;
    static kv field_j;

    ni(jfa param0) {
        try {
          this.field_f = param0;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "ni.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static ai[] a(byte param0, pf param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        ai[] var4 = null;
        ai var6_ref_ai = null;
        int var6 = 0;
        int var7 = 0;
        ai[] stackIn_6_0 = null;
        ai[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = BachelorFridge.field_y;
        try {
          var2_int = param1.d(8, (byte) -65);
          if (var2_int > 0) {
            return null;
          }
          var3 = param1.d(12, (byte) 45);
          if (param0 != 41) {
            stackIn_6_0 = (ai[]) null;
            return stackIn_6_0;
          }
          var4 = new ai[var3];
          for (var5 = 0; var5 < var3; var5++) {
            if (!fa.a((byte) -75, param1)) {
              var6 = param1.d(nia.a(-1 + var5, false), (byte) 64);
              var4[var5] = var4[var6];
            } else {
              var6_ref_ai = new ai();
              param1.d(24, (byte) -105);
              param1.d(24, (byte) 50);
              var6_ref_ai.field_b = param1.d(24, (byte) -123);
              param1.d(9, (byte) 69);
              param1.d(12, (byte) -64);
              param1.d(12, (byte) 58);
              param1.d(12, (byte) -116);
              var4[var5] = var6_ref_ai;
            }
          }
          stackIn_14_0 = var4;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("ni.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    private final int c(boolean param0) {
        if (!param0) {
          this.b(true);
        }
        return 50;
    }

    final boolean b(boolean param0) {
        int fieldTemp$0 = this.field_g + 1;
        this.field_g = this.field_g + 1;
        if (!(fieldTemp$0 <= this.c(param0))) {
          this.field_f.field_p = 2048;
          this.field_f.field_k = this.field_f.b(true);
          return true;
        }
        if (this.field_g == 1) {
          this.field_f.field_v.a((byte) 66, this.field_f.field_g.field_o.field_b, 0);
        }
        if (this.field_g >= 40) {
        }
        return false;
    }

    public static void b(int param0) {
        field_k = null;
        field_j = null;
        field_l = null;
        if (param0 >= -48) {
          ni.b(113);
        }
    }

    static {
        field_k = "to over <%0> great games";
    }
}
