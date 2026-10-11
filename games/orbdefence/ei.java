/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei {
    static String field_b;
    static String field_a;

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 139) {
          ei.a(102);
        }
    }

    final static qg[] a(byte param0, int param1, int param2, ki param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        qg[] stackIn_5_0 = null;
        qg[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!pk.a(101, param2, param3, param1)) {
            stackIn_2_0 = null;
            return (qg[]) (stackIn_2_0);
          }
          if (param0 == 97) {
            stackIn_7_0 = ba.a(17867);
            return stackIn_7_0;
          }
          stackIn_5_0 = (qg[]) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ei.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2_int = 0;
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        ki var5 = null;
        int var6 = 0;
        hj var7 = null;
        hj var8 = null;
        hj var9 = null;
        int var3Lifetime1;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          ul.d(243, 197, 369, 143, 16777215);
          ul.h(244, 198, 367, 141, 0);
          if (dm.field_b == null) {
            if (rc.field_a != null) {
              rc.field_a.a(cj.field_c, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
            }
            return;
          }
          if (param0 != -463) {
            var5 = (ki) null;
            ei.a((byte) 4, -62, 74, (ki) null);
          }
          var7 = dm.field_b[kb.field_m];
          if (var7 != null) {
            var7.c(245, 199);
          } else {
            if (rc.field_a != null) {
              rc.field_a.a(cj.field_c, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
            }
          }
          if (og.field_b > h.field_A) {
            var8 = dm.field_b[lj.field_u];
            if (var8 != null) {
              var2_int = h.field_A * (var8.field_s + 60) / og.field_b;
              var3 = -30 + var2_int;
              if (bh.field_b) {
                jf.a((byte) -20, var3 * -256 / 30, var8, 256 * (var8.field_s - var3) / 30, 199, 245);
              } else {
                jf.a((byte) -20, 256 * (-var3 + var8.field_s) / 30, var8, -256 * var3 / 30, 199, 245);
              }
            }
          }
          if (rc.field_a != null) {
            var2 = null;
            var6 = 0;
            var3Lifetime1 = var6;
            while (dm.field_b.length > var6) {
              var9 = dm.field_b[var6];
              if (var9 != null && (var9.field_s != 365 ||
                var9.field_t != 139)) {
                if (var2 == null) {
                  var2 = Integer.toString(var6);
                } else {
                  var2 = (String) (var2) + ", " + var6;
                }
              }
              var6++;
            }
            if (var2 == null) {
              return;
            }
            rc.field_a.a("Screenshot(s) " + (String) (var2) + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1), "ei.B(" + param0 + ')');
        }
    }

    static {
        field_a = "Names should contain a maximum of 12 characters";
        field_b = "Area";
    }
}
