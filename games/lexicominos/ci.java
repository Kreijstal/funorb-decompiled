/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci {
    private ca field_d;
    private ca field_c;
    static ng field_f;
    static int[] field_b;
    static sh field_e;
    static sh field_a;

    public static void b(byte param0) {
        field_e = null;
        field_a = null;
        field_b = null;
        field_f = null;
        if (param0 != -127) {
          ci.b((byte) -96);
        }
    }

    final static String a(String param0, byte param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var5 = 0;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Lexicominos.field_L ? 1 : 0;
        try {
          var2_int = param0.length();
          var3 = new char[var2_int];
          if (param1 != -79) {
            field_f = (ng) null;
          }
          for (var4 = 0; var2_int > var4; var4++) {
            var3[-1 + (var2_int - var4)] = param0.charAt(var4);
          }
          stackIn_7_0 = new String(var3);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("ci.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final ca a(byte param0) {
        ca var2 = this.field_d.field_l;
        if (this.field_d == var2) {
          return null;
        }
        if (param0 == 100) {
          var2.b(12);
          return var2;
        }
        return (ca) null;
    }

    final void a(int param0, ca param1) {
        try {
          int var3_int = 110 / ((0 - param0) / 61);
          if (param1.field_m != null) {
            param1.b(12);
          }
          param1.field_l = this.field_d;
          param1.field_m = this.field_d.field_m;
          param1.field_m.field_l = param1;
          param1.field_l.field_m = param1;
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "ci.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final ca a(boolean param0) {
        if (!param0) {
          return (ca) null;
        }
        ca var2 = this.field_d.field_l;
        if (var2 != this.field_d) {
          this.field_c = var2.field_l;
          return var2;
        }
        this.field_c = null;
        return null;
    }

    final int b(int param0) {
        int var4 = Lexicominos.field_L ? 1 : 0;
        int var2 = 0;
        ca var3 = this.field_d.field_l;
        while (this.field_d != var3) {
          var3 = var3.field_l;
          var2++;
        }
        if (param0 >= 22) {
          return var2;
        }
        field_a = (sh) null;
        return var2;
    }

    final static boolean a(boolean param0, char param1) {
        if (param0) {
          if (param1 >= 32 &&
            param1 <= 126) {
            return true;
          }
          if (param1 >= 160 &&
            param1 <= 255) {
            return true;
          }
          if (param1 != 8364 &&
            param1 != 338 &&
            param1 != 8212 &&
            param1 != 339 &&
            param1 != 376) {
            return false;
          }
          return true;
        }
        field_f = (ng) null;
        if (param1 >= 32) {
          if (param1 <= 126) {
            return true;
          }
          if (param1 >= 160 &&
            param1 <= 255) {
            return true;
          }
          if (param1 != 8364 &&
            param1 != 338 &&
            param1 != 8212 &&
            param1 != 339 &&
            param1 != 376) {
            return false;
          }
          return true;
        }
        if (param1 < 160) {
          if (param1 != 8364 &&
            param1 != 338 &&
            param1 != 8212 &&
            param1 != 339 &&
            param1 != 376) {
            return false;
          }
          return true;
        }
        if (param1 <= 255) {
          return true;
        }
        if (param1 == 8364) {
          return true;
        }
        if (param1 == 338) {
          return true;
        }
        if (param1 == 8212) {
          return true;
        }
        if (param1 == 339) {
          return true;
        }
        if (param1 != 376) {
          return false;
        }
        return true;
    }

    public ci() {
        this.field_d = new ca();
        this.field_d.field_m = this.field_d;
        this.field_d.field_l = this.field_d;
    }

    final ca a(int param0) {
        ca var2 = null;
        ca var2Lifetime1;
        if (param0 != -256) {
          this.field_d = (ca) null;
          var2 = this.field_c;
          if (this.field_d != var2) {
            this.field_c = var2.field_l;
            return var2;
          }
          this.field_c = null;
          return null;
        }
        var2Lifetime1 = this.field_c;
        if (this.field_d != var2Lifetime1) {
          this.field_c = var2Lifetime1.field_l;
          return var2Lifetime1;
        }
        this.field_c = null;
        return null;
    }

    static {
        field_f = new ng();
    }
}
