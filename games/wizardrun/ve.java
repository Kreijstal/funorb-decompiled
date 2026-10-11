/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve {
    static char[] field_a;
    static String field_b;
    static volatile int field_d;
    static o[] field_c;

    final static void a(String param0, String[] param1, byte param2, int param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_12_0 = 0;
        boolean stackIn_13_1 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = wizardrun.field_H;
        try {
          fi.field_y = mi.field_z;
          if (param2 >= -96) {
            field_d = -13;
          }
          if (255 != param3) {
            if (param3 < 100) {
              ki.field_F = hf.a(-105, param0, param3);
              return;
            }
            if (105 >= param3) {
              ki.field_F = rc.a(param1, (byte) -77);
              return;
            }
            ki.field_F = hf.a(-105, param0, param3);
            return;
          }
          stackIn_12_0 = -29309;
          stackIn_13_1 = !(ac.field_t >= 13);
          ki.field_F = ii.a(stackIn_12_0, stackIn_13_1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("ve.C(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, String param1) {
        System.out.println("Error: " + md.a("%0a", param1, 28834, "\n"));
        if (param0 < 74) {
          field_c = (o[]) null;
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        if (!param0) {
          field_d = -120;
          field_a = null;
          field_c = null;
          return;
        }
        field_a = null;
        field_c = null;
    }

    final static boolean a(byte param0, int param1) {
        if (param0 <= 12) {
          ve.a((byte) -115, 46);
          if (param1 == -1) {
            return true;
          }
          return (1 << param1 & uh.field_a) != 0 ? true : false;
        }
        if (param1 == -1) {
          return true;
        }
        return (1 << param1 & uh.field_a) != 0 ? true : false;
    }

    static {
        field_a = new char[128];
        field_d = 0;
        field_b = "Confirm Email:";
    }
}
