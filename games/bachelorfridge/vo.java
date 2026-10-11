/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vo {
    int field_e;
    static eq field_d;
    int field_f;
    int field_a;
    static sna field_b;
    static String field_c;

    abstract void a(int param0, int param1, int param2);

    abstract void a(byte param0, int param1, int param2);

    public static void a(byte param0) {
        field_d = null;
        field_b = null;
        if (param0 <= -121) {
          field_c = null;
          return;
        }
        lu var2 = (lu) null;
        vo.a(-98, (lu) null);
        field_c = null;
    }

    final static pp a(int param0, lu param1) {
        nq var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        lia stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = qi.a(param1, (byte) 96);
          var3 = param1.c((byte) -85);
          if (param0 > -37) {
            vo.a((byte) 104);
          }
          var4 = param1.b(true);
          stackIn_3_0 = new lia(var2, var3, var4);
          return (pp) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("vo.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    vo(int param0, int param1, int param2) {
        this.field_e = param2;
        this.field_f = param1;
        this.field_a = param0;
    }

    abstract void b(int param0, int param1, int param2);

    static {
        field_c = "Please enter a year between <%0> and <%1>";
    }
}
