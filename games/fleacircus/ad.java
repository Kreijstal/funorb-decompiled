/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad {
    private String field_a;
    private boolean field_c;
    static dd[] field_b;

    final static byte[] a(String param0, int param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            ad.a((byte) -106);
          }
          stackIn_3_0 = wh.field_e.a(0, param0, "");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ad.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    ad(String param0) {
        this(param0, false);
    }

    public static void a(byte param0) {
        if (param0 != 42) {
          return;
        }
        field_b = null;
    }

    final boolean a(int param0) {
        if (param0 < 8) {
          field_b = (dd[]) null;
          return this.field_c;
        }
        return this.field_c;
    }

    ad(String param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_a = param0;
          stackIn_4_1 = (param1);
          this.field_c = stackIn_4_1;
          if (null == this.field_a) {
            this.field_a = "";
          }
          if (this.field_a.length() != 0) {
            return;
          }
          this.field_c = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ad.<init>(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final String b(int param0) {
        if (param0 >= -97) {
          String var3 = (String) null;
          ad.a((String) null, 2);
          return this.field_a;
        }
        return this.field_a;
    }

    static {
    }
}
