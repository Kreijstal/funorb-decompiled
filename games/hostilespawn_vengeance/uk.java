/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class uk {
    static int[] field_c;
    static ji field_d;
    static bl field_a;
    static int field_e;
    static String field_b;

    abstract int b(int param0, int param1);

    abstract wc c(int param0);

    abstract byte[] a(byte param0, int param1);

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param4 <= 47) {
          field_b = (String) null;
          if (param5 < param0) {
            return false;
          }
          if (param0 + param2 <= param5) {
            return false;
          }
          if (param1 < param3) {
            return false;
          }
          if (param1 < param3 + param6) {
            return true;
          }
          return false;
        }
        if (param5 < param0) {
          return false;
        }
        if (param0 + param2 <= param5) {
          return false;
        }
        if (param1 < param3) {
          return false;
        }
        if (param1 < param3 + param6) {
          return true;
        }
        return false;
    }

    public static void b(int param0) {
        if (param0 < -12) {
          field_b = null;
          field_a = null;
          field_c = null;
          field_d = null;
          return;
        }
        field_c = (int[]) null;
        field_b = null;
        field_a = null;
        field_c = null;
        field_d = null;
    }

    final static boolean a(int param0) {
        if (param0 == 27301) {
          return tk.field_e > 250 ? true : false;
        }
        field_a = (bl) null;
        return tk.field_e > 250 ? true : false;
    }

    final static bd[] a(int param0, int param1, byte param2, int param3, int param4) {
        if (param2 >= 126) {
          return od.a(3, 105, 1, param0, 1, param4, param3, 1, param1);
        }
        uk.a(-106);
        return od.a(3, 105, 1, param0, 1, param4, param3, 1, param1);
    }

    final static boolean a(int[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = HostileSpawn.field_I ? 1 : 0;
        try {
          for (var2_int = param1; 8 > var2_int; var2_int++) {
            if (param0[var2_int] != 0) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("uk.A(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(int param0, int param1) {
        if (param1 == 9) {
          return "levelf1.dat";
        }
        if (param0 != 9394) {
          uk.a(43, -82, (byte) -21, -101, 0);
        }
        if (param1 == 10) {
          return "levelf2.dat";
        }
        if (11 == param1) {
          return "levelf3.dat";
        }
        if (param1 == 1) {
          return "level01.dat";
        }
        if (param1 == 2) {
          return "level02.dat";
        }
        if (param1 == 3) {
          return "level03.dat";
        }
        if (param1 == 4) {
          return "level04.dat";
        }
        if (param1 == 5) {
          return "level05.dat";
        }
        if (6 == param1) {
          return "level06.dat";
        }
        if (param1 == 7) {
          return "level07.dat";
        }
        return "level00.dat";
    }

    static {
        field_c = nf.a(false);
        field_a = new bl(3);
        field_e = 0;
        field_b = "Use this alternative as your account name";
    }
}
