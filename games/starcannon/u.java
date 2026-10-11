/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u {
    static int field_d;
    static String field_a;
    static int field_b;
    static gi field_c;

    final static boolean a(int param0, char param1) {
        boolean stackIn_28_0 = false;
        boolean stackIn_50_0 = false;
        boolean stackIn_64_0 = false;
        ag var3;
        if (param0 != 9476) {
          var3 = (ag) null;
          u.a((ag) null, false, (byte) -98);
          if (param1 < 48) {
            if (param1 >= 65 &&
              param1 <= 90) {
              return true;
            }
            if (param1 < 97) {
              return false;
            }
            if (122 < param1) {
              return false;
            }
            return true;
          }
          if (param1 <= 57) {
            return true;
          }
          if (param1 < 65) {
            if (param1 < 97) {
              return false;
            }
            if (122 >= param1) {
              return true;
            }
            return false;
          }
          if (param1 <= 90) {
            return true;
          }
          stackIn_28_0 = (param1 >= 97) && (122 >= param1);
          return stackIn_28_0;
        }
        if (param1 < 48) {
          if (param1 < 65) {
            if (param1 < 97) {
              return false;
            }
            if (122 < param1) {
              return false;
            }
            return true;
          }
          if (param1 <= 90) {
            return true;
          }
          stackIn_64_0 = (param1 >= 97) && (122 >= param1);
          return stackIn_64_0;
        }
        if (param1 <= 57) {
          return true;
        }
        if (param1 < 65) {
          if (param1 < 97) {
            return false;
          }
          if (122 < param1) {
            return false;
          }
          return true;
        }
        if (param1 <= 90) {
          return true;
        }
        stackIn_50_0 = (param1 >= 97) && (122 >= param1);
        return stackIn_50_0;
    }

    final static void a(int param0, int param1) {
        ia var2 = d.field_b;
        var2.d((byte) 61, param0);
        var2.a(param1, -109);
        var2.a(2, -120);
    }

    final static int a(ag param0, boolean param1, byte param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 < 58) {
            u.a(120, '#');
          }
          stackIn_3_0 = param0.b(17, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("u.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        if (param0 != 2) {
          field_d = 43;
        }
    }

    final static void a(boolean param0) {
        if (!param0) {
          return;
        }
        mi.a(1048576, ll.b(108));
    }

    static {
        field_a = "From only <%0>/month";
    }
}
