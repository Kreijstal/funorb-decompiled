/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sl {
    int field_a;
    static java.awt.Color field_i;
    int field_g;
    int field_m;
    int field_d;
    int field_f;
    static bd field_b;
    static int field_c;
    static int field_k;
    static String field_j;
    int field_h;
    static int field_l;
    static String field_e;

    abstract void a(int param0, int param1, int param2);

    abstract void a(int param0, int param1);

    public static void a(boolean param0) {
        if (!param0) {
          field_j = null;
          field_b = null;
          field_e = null;
          field_i = null;
          return;
        }
        field_e = (String) null;
        field_j = null;
        field_b = null;
        field_e = null;
        field_i = null;
    }

    final static ak a(int param0) {
        if (param0 != 1) {
          field_k = 60;
          return la.b((byte) -110);
        }
        return la.b((byte) -110);
    }

    final static el a(String param0, byte param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        el stackIn_3_0 = null;
        el stackIn_6_0 = null;
        el stackIn_15_0 = null;
        el stackIn_18_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_3_0 = pd.field_Kb;
            return stackIn_3_0;
          }
          if (var2_int > 63) {
            stackIn_6_0 = mk.field_a;
            return stackIn_6_0;
          }
          var3 = 0;
          var4 = -104 / ((param1 + 26) / 43);
          while (var2_int > var3) {
            var5 = param0.charAt(var3);
            if (45 == var5) {
              if (var3 == 0 ||
                var3 == var2_int - 1) {
                stackIn_15_0 = gm.field_f;
                return stackIn_15_0;
              }
            } else {
              if (-1 == oa.field_h.indexOf(var5)) {
                stackIn_18_0 = gm.field_f;
                return stackIn_18_0;
              }
            }
            var3++;
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("sl.B(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_i = new java.awt.Color(10040319);
        field_c = 480;
        field_j = "Report <%0> for abuse";
        field_b = new bd();
        field_e = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
