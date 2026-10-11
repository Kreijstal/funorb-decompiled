/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi {
    private String[] field_b;
    static tf[] field_g;
    static we field_d;
    int field_f;
    private int field_c;
    private String field_a;
    private int field_e;

    final void a(boolean param0) {
        int var2;
        int var3;
        int var4;
        int var3Lifetime1;
        var4 = Pixelate.field_H ? 1 : 0;
        t.a(this.field_f, this.field_e, 250, this.field_c, 12, 0, 180);
        t.e(this.field_f, this.field_e, 250, this.field_c, 12, 0);
        var2 = 4 + this.field_e + 8;
        if (!param0) {
          if (null != this.field_a) {
            hk.field_d.b(this.field_a, this.field_f + 125, var2 + pe.field_c, 16776960, 0);
            var2 = var2 + (8 + pe.field_c);
          }
          for (var3 = 0; var3 < this.field_b.length; var3++) {
            var2 = var2 + pe.field_c * hk.field_d.a(this.field_b[var3], 8 + this.field_f, var2, 234, this.field_c, 16777215, 0, 0, 0, pe.field_c);
            var2 += 8;
          }
          return;
        }
        bi.a(1);
        if (null != this.field_a) {
          hk.field_d.b(this.field_a, this.field_f + 125, var2 + pe.field_c, 16776960, 0);
          var2 = var2 + (8 + pe.field_c);
        }
        for (var3Lifetime1 = 0; var3Lifetime1 < this.field_b.length; var3Lifetime1++) {
          var2 = var2 + pe.field_c * hk.field_d.a(this.field_b[var3Lifetime1], 8 + this.field_f, var2, 234, this.field_c, 16777215, 0, 0, 0, pe.field_c);
          var2 += 8;
        }
    }

    final static tf a(String param0, String param1, fm param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        tf stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param2.a(127, param0);
          if (param3 >= -19) {
            bi.b(25);
          }
          var5 = param2.a((byte) -105, param1, var4_int);
          stackIn_3_0 = dk.a(var5, param2, var4_int, -1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("bi.A(");
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
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != -8) {
          field_g = (tf[]) null;
          field_d = null;
          return;
        }
        field_d = null;
    }

    final static tg b(int param0) {
        if (param0 != 4) {
          bi.a(-128);
          if (null == ll.field_c) {
            ll.field_c = new tg();
            ll.field_c.a(4, he.field_d);
            ll.field_c.field_p = 5;
            ll.field_c.field_d = 7697781;
            ll.field_c.field_q = 14;
            ll.field_c.field_e = 2763306;
            ll.field_c.field_o = 0;
            ll.field_c.field_g = 4;
            ll.field_c.field_n = 6;
            ll.field_c.field_m = ep.field_b;
          }
          return ll.field_c;
        }
        if (null == ll.field_c) {
          ll.field_c = new tg();
          ll.field_c.a(4, he.field_d);
          ll.field_c.field_p = 5;
          ll.field_c.field_d = 7697781;
          ll.field_c.field_q = 14;
          ll.field_c.field_e = 2763306;
          ll.field_c.field_o = 0;
          ll.field_c.field_g = 4;
          ll.field_c.field_n = 6;
          ll.field_c.field_m = ep.field_b;
        }
        return ll.field_c;
    }

    bi(String param0, String[] param1, boolean param2) {
        int var4_int = 0;
        RuntimeException runtimeException = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_a = param0;
          this.field_c = 16;
          this.field_b = param1;
          if (null != this.field_a) {
            this.field_c = this.field_c + (pe.field_c + 8);
          }
          for (var4_int = 0; this.field_b.length > var4_int; var4_int++) {
            this.field_c = this.field_c + pe.field_c * hk.field_d.b(this.field_b[var4_int], 234);
            this.field_c = this.field_c + 8;
          }
          this.field_e = 20;
          this.field_f = -250;
          if (param2) {
            this.field_e = this.field_e + 50;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_11_0 = runtimeException;
          stackIn_11_1 = new StringBuilder().append("bi.<init>(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
    }
}
