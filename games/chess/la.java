/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la {
    static String[][] field_b;
    static ci field_c;
    static String field_a;

    final static int a(byte param0) {
        int var1 = -116 % ((param0 - 50) / 52);
        ge.field_fb.a(32130);
        if (!qh.field_c.b(-31259)) {
          return sh.b(32288);
        }
        return 0;
    }

    final static void b(int param0) {
        mh.field_d.b();
        if (param0 != -49) {
          field_b = (String[][]) null;
          kn.field_F.b();
          return;
        }
        kn.field_F.b();
    }

    final static mh a(boolean param0, String param1) {
        RuntimeException var2 = null;
        mh stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            la.a(119, (byte) 66, 35);
          }
          stackIn_3_0 = new mh(param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("la.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        field_b = (String[][]) null;
        int var1 = 48 / ((-6 - param0) / 36);
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final static void a(int param0, byte param1, int param2) {
        nk var3 = qn.field_U;
        var3.f(param0, -103);
        var3.c(3, (byte) 47);
        int var4 = 11 % ((75 - param1) / 50);
        var3.c(10, (byte) -112);
        var3.b(param2, 87);
    }

    final static boolean a(int param0, char param1) {
        boolean stackIn_28_0 = false;
        boolean stackIn_50_0 = false;
        boolean stackIn_64_0 = false;
        if (param0 != 0) {
          la.a((byte) -24);
          if (param1 < 48) {
            if (param1 >= 65 &&
              param1 <= 90) {
              return true;
            }
            if (param1 < 97) {
              return false;
            }
            if (param1 > 122) {
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
            if (param1 <= 122) {
              return true;
            }
            return false;
          }
          if (param1 <= 90) {
            return true;
          }
          stackIn_28_0 = (param1 >= 97) && (param1 <= 122);
          return stackIn_28_0;
        }
        if (param1 < 48) {
          if (param1 < 65) {
            if (param1 < 97) {
              return false;
            }
            if (param1 > 122) {
              return false;
            }
            return true;
          }
          if (param1 <= 90) {
            return true;
          }
          stackIn_64_0 = (param1 >= 97) && (param1 <= 122);
          return stackIn_64_0;
        }
        if (param1 <= 57) {
          return true;
        }
        if (param1 < 65) {
          if (param1 < 97) {
            return false;
          }
          if (param1 > 122) {
            return false;
          }
          return true;
        }
        if (param1 <= 90) {
          return true;
        }
        stackIn_50_0 = (param1 >= 97) && (param1 <= 122);
        return stackIn_50_0;
    }

    static {
        field_a = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
