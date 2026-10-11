/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg extends fg {
    static String[] field_w;
    static ki field_x;
    static int field_v;

    final static boolean a(se param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 26678) {
            stackIn_6_0 = (param0.h(1, 8) == 1);
            return stackIn_6_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("eg.JA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean c(byte param0) {
        if (param0 != -126) {
          field_w = (String[]) null;
          if (vh.field_n < 20) {
            return true;
          }
          if (!fe.c((byte) -121)) {
            return true;
          }
          if (0 >= cb.field_j) {
            return false;
          }
          if (!ld.a((byte) 85)) {
            return true;
          }
          return false;
        }
        if (vh.field_n < 20) {
          return true;
        }
        if (!fe.c((byte) -121)) {
          return true;
        }
        if (0 >= cb.field_j) {
          return false;
        }
        if (!ld.a((byte) 85)) {
          return true;
        }
        return false;
    }

    public static void a(int param0) {
        field_x = null;
        int var1 = -71 / ((param0 + 53) / 62);
        field_w = null;
    }

    private eg(kc param0, int param1) {
        super(param0, param1);
    }

    final static e b(int param0, String param1) {
        int var3 = 0;
        int var2_int = 0;
        int var4 = 0;
        int var5 = 0;
        e stackIn_4_0 = null;
        e stackIn_8_0 = null;
        e stackIn_17_0 = null;
        e stackIn_20_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          var2_int = param1.length();
          if (var2_int == 0) {
            stackIn_4_0 = oc.field_M;
            return stackIn_4_0;
          }
          if (var2_int > 63) {
            stackIn_8_0 = vj.field_c;
            return stackIn_8_0;
          }
          for (var3 = param0; var2_int > var3; var3++) {
            var4 = param1.charAt(var3);
            if (var4 == 45) {
              if (var3 == 0 ||
                -1 + var2_int == var3) {
                stackIn_17_0 = ba.field_a;
                return stackIn_17_0;
              }
            } else {
              if (-1 == vi.field_H.indexOf(var4)) {
                stackIn_20_0 = ba.field_a;
                return stackIn_20_0;
              }
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("eg.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final String a(byte param0, pj param1) {
        RuntimeException var3 = null;
        se var4 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -95) {
            var4 = (se) null;
            eg.a((se) null, -102);
          }
          stackIn_3_0 = im.a('*', param1.field_l.length(), 77);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("eg.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static int a(byte[] param0, int param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 0) {
            stackIn_4_0 = sd.a(0, param0, param2, 0);
            return stackIn_4_0;
          }
          stackIn_2_0 = -35;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("eg.GA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    eg(int param0) {
        this(lm.field_f, param0);
    }

    static {
        field_w = new String[]{"All scores", "My scores", "Best each"};
    }
}
