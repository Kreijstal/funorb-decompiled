/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk extends sh {
    static String field_v;
    static int field_t;
    private Object field_u;

    final Object e(byte param0) {
        if (param0 != 97) {
          vk.g(24);
        }
        return this.field_u;
    }

    public static void g(int param0) {
        int var1 = 93 % ((param0 + 35) / 38);
        field_v = null;
    }

    final static char a(byte param0, int param1, ih param2, int param3) {
        String stackIn_15_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          int var4_int = 119;
          int var5 = param2.a((char) var4_int);
          int var6 = param1;
          if (param0 > -47) {
            vk.g(-66);
          }
          while (param3 >= var6) {
            if (ml.a((char)var6, 21654)) {
              int var7 = param2.a((char)var6);
              if (var5 < var7) {
                var4_int = (char)var6;
                var5 = var7;
              }
            }
            var6++;
          }
          int stackIn_11_0 = var4_int;
          return (char) stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_14_0 = var4;
          StringBuilder stackIn_14_1 = new StringBuilder().append("vk.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    vk(Object param0, int param1) {
        super(param1);
        try {
          this.field_u = param0;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "vk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static tk a(String param0, int param1) {
        String stackIn_28_2 = null;
        int var5 = EscapeVector.obfuscationControl;
        try {
          int var2_int = param0.length();
          if (var2_int == 0) {
            tk stackIn_4_0 = ResourceArchive.field_d;
            return stackIn_4_0;
          }
          if (var2_int > 63) {
            tk stackIn_7_0 = d.field_c;
            return stackIn_7_0;
          }
          if (param1 >= -8) {
            tk stackIn_10_0 = (tk) null;
            return stackIn_10_0;
          }
          for (int var3 = 0; var3 < var2_int; var3++) {
            int var4 = param0.charAt(var3);
            if (45 == var4) {
              if (0 == var3 ||
                var3 == -1 + var2_int) {
                tk stackIn_19_0 = wh.field_p;
                return stackIn_19_0;
              }
            } else if (jd.field_b.indexOf(var4) == -1) {
              tk stackIn_22_0 = wh.field_p;
              return stackIn_22_0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_27_0 = var2;
          StringBuilder stackIn_27_1 = new StringBuilder().append("vk.G(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean d(byte param0) {
        if (param0 != 120) {
          field_v = (String) null;
          return false;
        }
        return false;
    }

    static {
    }
}
