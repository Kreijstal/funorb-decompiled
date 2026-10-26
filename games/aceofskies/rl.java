/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl {
    private la field_h;
    private int field_d;
    static rl field_b;
    int field_l;
    int field_f;
    static rl field_m;
    static rl field_c;
    static rl field_k;
    static rl field_j;
    static rl field_g;
    static rl field_n;
    static int field_e;
    static boolean field_p;
    static String field_i;
    static int[] field_a;
    static st field_o;

    final static rl a(int param0, byte param1) {
        int var2;
        int var3;
        int var4;
        var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        var2 = 49 / ((-9 - param1) / 45);
        var3 = param0;
        if (var3 == 0) {
          return field_b;
        }
        if (var3 == 1) {
          return field_m;
        }
        if (2 == var3) {
          return field_c;
        }
        if (var3 == 3) {
          return field_k;
        }
        if (4 == var3) {
          return field_j;
        }
        if (var3 == 5) {
          return field_g;
        }
        if (var3 != 6) {
          return null;
        }
        return field_n;
    }

    public static void a(int param0) {
        field_b = null;
        field_k = null;
        if (param0 == -12785) {
          field_o = null;
          field_j = null;
          field_a = null;
          field_g = null;
          field_m = null;
          field_i = null;
          field_n = null;
          field_c = null;
          return;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static int a(int param0, int param1) {
        if (param0 != 4) {
          field_k = (rl) null;
          if (param1 == 6406) {
            return 1;
          }
          if (6409 == param1) {
            return 1;
          }
          if (param1 == 32841) {
            return 1;
          }
          if (param1 == 6410) {
            return 2;
          }
          if (param1 == 6407) {
            return 3;
          }
          if (param1 == 6408) {
            return 4;
          }
          throw new IllegalArgumentException("");
        }
        if (param1 == 6406) {
          return 1;
        }
        if (6409 == param1) {
          return 1;
        }
        if (param1 == 32841) {
          return 1;
        }
        if (param1 == 6410) {
          return 2;
        }
        if (param1 == 6407) {
          return 3;
        }
        if (param1 == 6408) {
          return 4;
        }
        throw new IllegalArgumentException("");
    }

    final static boolean a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param0 != -21) {
          rl.a(122, (byte) -53);
          if (param1 < param5) {
            return false;
          }
          if (param1 >= param5 + param3) {
            return false;
          }
          if (param6 > param2) {
            return false;
          }
          if (param6 + param4 > param2) {
            return true;
          }
          return false;
        }
        if (param1 < param5) {
          return false;
        }
        if (param1 >= param5 + param3) {
          return false;
        }
        if (param6 > param2) {
          return false;
        }
        if (param6 + param4 > param2) {
          return true;
        }
        return false;
    }

    final static void a(byte param0) {
        gg.b((byte) -98);
        IntKeyLookup.field_a = true;
        if (param0 == 0) {
          nf.field_a = true;
          vn.field_f.e((byte) 89);
          ua.a(wo.field_e, false, (byte) 104);
          return;
        }
        rl.a(-83, (byte) 35);
        nf.field_a = true;
        vn.field_f.e((byte) 89);
        ua.a(wo.field_e, false, (byte) 104);
    }

    private rl(int param0, int param1, la param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_h = param2;
          this.field_f = param0;
          this.field_d = param1;
          this.field_l = this.field_h.field_c * this.field_d;
          if (this.field_f < 16) {
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_5_0 = var4;
          stackIn_5_1 = new StringBuilder().append("rl.<init>(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    static {
        field_b = new rl(0, 3, la.field_i);
        field_m = new rl(1, 3, la.field_i);
        field_c = new rl(2, 4, la.field_h);
        field_k = new rl(3, 1, la.field_i);
        field_j = new rl(4, 2, la.field_i);
        field_g = new rl(5, 3, la.field_i);
        field_n = new rl(6, 4, la.field_i);
        field_e = ek.a((byte) 108, 16);
        field_p = false;
        field_i = "Unfortunately you are not eligible to create an account.";
        field_a = new int[4];
        field_o = new st();
    }
}
