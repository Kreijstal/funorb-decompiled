/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd {
    static String field_b;
    static String field_d;
    static int field_c;
    static int field_a;

    public static void a(byte param0) {
        field_d = null;
        field_b = null;
        if (param0 >= -96) {
          field_c = 109;
        }
    }

    final static void a(java.awt.Canvas param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          r.a((java.awt.Component) ((Object) param0), 20);
          ph.a((java.awt.Component) ((Object) param0), 123);
          if (null != rk.field_c) {
            rk.field_c.a(3, (java.awt.Component) ((Object) param0));
          }
          if (param1 == 160) {
            return;
          }
          field_d = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("jd.C(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(boolean param0, boolean param1, int param2) {
        String var4 = null;
        String var4Lifetime1;
        if (param2 == 37) {
          var4 = (String) null;
          rb.a((String) null, param1, param0, 14635);
          return;
        }
        jd.a((byte) 55);
        var4Lifetime1 = (String) null;
        rb.a((String) null, param1, param0, 14635);
    }

    final static java.awt.Container a(int param0) {
        int var1 = 68 / ((-25 - param0) / 41);
        if (ck.field_d != null) {
          return (java.awt.Container) ((Object) ck.field_d);
        }
        return (java.awt.Container) ((Object) kk.c(-14047));
    }

    final static boolean a(byte param0, char param1) {
        boolean stackIn_27_0 = false;
        if (param0 != -16) {
          return false;
        }
        if (param1 < 48) {
          if (param1 < 65) {
            if (97 <= param1 &&
              122 >= param1) {
              return true;
            }
            return false;
          }
          if (param1 <= 90) {
            return true;
          }
          stackIn_27_0 = (97 <= param1) && (122 >= param1);
          return stackIn_27_0;
        }
        if (param1 <= 57) {
          return true;
        }
        if (param1 >= 65 &&
          param1 <= 90) {
          return true;
        }
        if (97 > param1) {
          return false;
        }
        if (122 < param1) {
          return false;
        }
        return true;
    }

    final static String a(long param0, int param1) {
        int var3 = 0;
        long var4 = 0L;
        StringBuilder var6 = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        StringBuilder discarded$0 = null;
        int var11 = Lexicominos.field_L ? 1 : 0;
        if (param0 <= 0L) {
          return null;
        }
        if (param0 >= 6582952005840035281L) {
          return null;
        }
        if (param0 % (long)param1 != 0L) {
          var3 = 0;
          var4 = param0;
          while (var4 != 0L) {
            var3++;
            var4 = var4 / 37L;
          }
          var6 = new StringBuilder(var3);
          while (param0 != 0L) {
            var7 = param0;
            param0 = param0 / 37L;
            var9 = jj.field_b[(int)(-(37L * param0) + var7)];
            if (95 == var9) {
              var10 = -1 + var6.length();
              var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
              var9 = 160;
            }
            discarded$0 = var6.append((char) var9);
          }
          var6.reverse();
          var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
          return var6.toString();
        }
        return null;
    }

    static {
        field_a = 0;
        field_d = "Quit to website";
        field_b = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
    }
}
