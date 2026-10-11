/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd extends rqa {
    static tu field_o;
    static String field_p;

    public static void a(int param0) {
        int var1 = -101 % ((61 - param0) / 61);
        field_p = null;
        field_o = null;
    }

    jd(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static String a(String param0, String param1, int param2, String param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = VoidHunters.field_G;
        try {
          var4_int = param0.length();
          var5 = param1.length();
          var6 = param3.length();
          if (var5 == 0) {
            throw new IllegalArgumentException("Key cannot have zero length");
          }
          var7 = var4_int;
          var8 = -var5 + var6;
          if (var8 != 0) {
            var9_int = 0;
            while (true) {
              var9_int = param0.indexOf(param1, var9_int);
              if (0 > var9_int) {
                break;
              }
              var9_int = var9_int + var5;
              var7 = var7 + var8;
            }
          }
          var9 = new StringBuilder(var7);
          var10 = param2;
          while (true) {
            var11 = param0.indexOf(param1, var10);
            if (var11 < 0) {
              discarded$2 = var9.append(param0.substring(var10));
              stackIn_13_0 = var9.toString();
              return stackIn_13_0;
            }
            discarded$0 = var9.append(param0.substring(var10, var11));
            discarded$1 = var9.append(param3);
            var10 = var11 + var5;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("jd.B(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          wbb.a(-108, param0[0].a(72), param0[1].a(116));
          if (param1 > -119) {
            jd.a(98);
          }
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("jd.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_o = new tu();
    }
}
