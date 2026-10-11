/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tr {
    static long field_g;
    static String field_e;
    private cn field_h;
    static String field_d;
    static int field_f;
    static String field_c;
    private dd field_b;
    private cn field_a;

    public static void a(byte param0) {
        field_c = null;
        field_d = null;
        if (param0 >= -119) {
          field_d = (String) null;
          field_e = null;
          return;
        }
        field_e = null;
    }

    final wua a(boolean param0, int param1) {
        wua var3;
        byte[] var4;
        wua var3Lifetime1;
        var3 = (wua) (this.field_b.a((byte) 74, (long)param1));
        if (var3 != null) {
          return var3;
        }
        if (32768 > param1) {
          var4 = this.field_a.a(param0, 1, param1);
        } else {
          var4 = this.field_h.a(false, 1, param1 & 32767);
        }
        if (param0) {
          return (wua) null;
        }
        var3Lifetime1 = new wua();
        if (var4 != null) {
          var3Lifetime1.a(new uia(var4), (byte) 113);
        }
        if (32768 <= param1) {
          var3Lifetime1.a(100);
        }
        this.field_b.a(29166, var3Lifetime1, (long)param1);
        return var3Lifetime1;
    }

    tr(int param0, cn param1, cn param2, pp param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_b = new dd(64);
        try {
          this.field_a = param1;
          this.field_h = param2;
          if (null != this.field_a) {
            this.field_a.a((byte) 106, 1);
          }
          if (null == this.field_h) {
            return;
          }
          this.field_h.a((byte) 118, 1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("tr.<init>(").append(param0).append(',');
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
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_d = "The previous occupant's idea of DIY public transport, moving platforms can transport you swiftly to your destination.";
        field_f = 3;
        field_e = "Wilbur";
        field_c = "Enter name of friend to add to list";
    }
}
