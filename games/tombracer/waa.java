/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class waa {
    private bua field_d;
    static String field_b;
    private int field_c;
    private int field_a;
    static String field_e;

    final static int a(ft param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 1383) {
            field_e = (String) null;
          }
          if (param0 == it.field_b) {
            stackIn_20_0 = 6407;
            return stackIn_20_0;
          }
          if (gpa.field_a == param0) {
            stackIn_5_0 = 6408;
            return stackIn_5_0;
          }
          if (rp.field_g == param0) {
            stackIn_8_0 = 6406;
            return stackIn_8_0;
          }
          if (param0 == qr.field_w) {
            stackIn_18_0 = 6409;
            return stackIn_18_0;
          }
          if (wo.field_i == param0) {
            stackIn_12_0 = 6410;
            return stackIn_12_0;
          }
          if (param0 != js.field_g) {
            throw new IllegalStateException();
          }
          stackIn_16_0 = 6145;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("waa.B(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 4974) {
          field_e = (String) null;
          field_b = null;
          field_e = null;
          return;
        }
        field_b = null;
        field_e = null;
    }

    final void a(int param0, int param1, int param2) {
        if (param1 == 6) {
          ura.a(param1 ^ -10991);
          hp.a(1024, 4095 & this.field_a * this.field_c, 1996, this.field_d.b((byte) 74), -1918106173, param2 + this.field_c, this.field_a + param0);
          se.f((byte) -6);
          return;
        }
        this.field_c = -128;
        ura.a(param1 ^ -10991);
        hp.a(1024, 4095 & this.field_a * this.field_c, 1996, this.field_d.b((byte) 74), -1918106173, param2 + this.field_c, this.field_a + param0);
        se.f((byte) -6);
    }

    final void b(int param0) {
        if (param0 == -9310) {
          this.field_d.a(0);
          return;
        }
        ft var3 = (ft) null;
        waa.a((ft) null, 19);
        this.field_d.a(0);
    }

    waa(int param0, int param1) {
        this.field_d = new bua(6, 4, 1);
        this.field_d.a(1, true, (byte) -94, 6);
        this.field_a = (int)((double)param0 * Math.random());
        this.field_c = (int)(Math.random() * (double)param1);
        if (this.field_a < 20) {
          this.field_a = 20;
        }
        if (20 > this.field_c) {
          this.field_c = 20;
        }
        if (param0 - 20 < this.field_a) {
          this.field_a = param0 - 20;
        }
        if (this.field_c > -20 + param1) {
          this.field_c = param1 - 20;
        }
    }

    static {
        field_b = "Keys";
        field_e = "This password contains your email address, and would be easy to guess";
    }
}
