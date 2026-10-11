/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm extends rqa {
    static String field_o;

    hm(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static String e(int param0) {
        int var2 = 0;
        String var1;
        int var3;
        int var4;
        int var5;
        String var6;
        String var7;
        String var8;
        var5 = VoidHunters.field_G;
        var6 = "(" + iq.field_a + " " + foa.field_o + " " + fd.field_r + ") " + ow.field_a;
        var1 = var6;
        if (param0 != -13514) {
          hm.e(-111);
        }
        if (0 < vja.field_a) {
          var1 = var6 + ":";
          for (var2 = 0; var2 < vja.field_a; var2++) {
            var7 = var1 + ' ';
            var3 = qga.field_b.field_h[var2] & 255;
            var4 = var3 >> 4;
            var3 = var3 & 15;
            if (var4 >= 10) {
              var4 += 55;
            } else {
              var4 += 48;
            }
            if (var3 >= 10) {
              var3 += 55;
            } else {
              var3 += 48;
            }
            var8 = var7 + (char)var4;
            var1 = var8 + (char)var3;
          }
        }
        return var1;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          si.a(220, 62, param0[0].a(104));
          if (param1 >= -119) {
            hm.a(-107);
          }
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("hm.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 >= -120) {
          hm.a(67);
        }
    }

    static {
        field_o = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
