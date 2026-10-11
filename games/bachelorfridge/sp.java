/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sp extends pu {
    static int field_l;

    final static int a(int param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = BachelorFridge.field_y;
        try {
          var3_int = 1;
          while (1 < param1) {
            if ((1 & param1) != 0) {
              var3_int = var3_int * param0;
            }
            param1 = param1 >> 1;
            param0 = param0 * param0;
          }
          if (1 == param1) {
            stackIn_8_0 = var3_int * param0;
            return stackIn_8_0;
          }
          var4 = 50 / ((-46 - param2) / 52);
          stackIn_10_0 = var3_int;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var3), "sp.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static int a(hh param0, boolean param1, hh param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            sp.b(-122);
          }
          var4 = (String) null;
          stackIn_3_0 = iv.a(-15, 0, 0, param0, (String) null, false, param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("sp.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void b(int param0) {
        if (param0 != 1) {
          field_l = -10;
        }
        if (!gfa.field_i) {
          throw new IllegalStateException();
        }
        if (oq.field_b != null) {
          oq.field_b.p(-96);
        }
        String var1 = kaa.c(97);
        ola.field_e = new ph(var1, (String) null, true, false, false);
        gja.field_m.a((wj) (kka.field_l), (byte) 82);
        kka.field_l.e(ola.field_e, 33);
        kka.field_l.m(param0 ^ 17311);
    }

    final static void a(byte[] param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        hh var5 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = BachelorFridge.field_y;
        try {
          lka.field_E = qs.a(false, new lu(param0));
          w.field_h = new int[50][13];
          for (var2_int = 1; var2_int < lka.field_E.length; var2_int++) {
            for (var3 = 2; 15 > var3; var3++) {
              if (var3 != 3 &&
                var3 != 6 &&
                var3 != 9 &&
                var3 != 12) {
                w.field_h[-1 + var2_int][-2 + var3] = kka.a(var2_int, 63, var3);
              }
            }
          }
          if (param1 != -7) {
            var5 = (hh) null;
            sp.a((hh) null, false, (hh) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("sp.D(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_l = -1;
    }
}
