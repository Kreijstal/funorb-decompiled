/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh extends af {
    static String field_r;
    private int field_q;
    private int field_s;
    private o[] field_t;
    private int field_p;

    public static void d(int param0) {
        if (param0 != -1) {
          gh.a(9, 116);
          field_r = null;
          return;
        }
        field_r = null;
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param4 != 16777215) {
          return true;
        }
        if (param6 > param2) {
          return false;
        }
        if (param2 >= param3 + param6) {
          return false;
        }
        if (param0 > param5) {
          return false;
        }
        if (param0 + param1 > param5) {
          return true;
        }
        return false;
    }

    public final void a(byte param0, int param1, boolean param2, int param3, rc param4) {
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          if (!param4.field_v) {
            stackIn_6_0 = (param4.b(true)) ? 1 : 0;
          } else {
            stackIn_6_0 = 1;
          }
          var6_int = stackIn_6_0;
          if (param4 instanceof pj) {
            param2 = param2 & ((pj) (param4)).field_B;
          }
          if (param2) {
            if (var6_int != 0) {
              stackIn_14_0 = this.field_q;
            } else {
              stackIn_14_0 = this.field_s;
            }
          } else {
            stackIn_14_0 = this.field_p;
          }
          var7 = stackIn_14_0;
          stackIn_17_0 = (!param2) ? 7105644 : 16777215;
          var8 = stackIn_17_0;
          if (param0 < 113) {
            return;
          }
          fg.a(param1 + (param4.field_j + (-this.field_t[0].field_r + param4.field_x >> 1)), param4.field_m + param3, param4.field_t, var7, this.field_t, (byte) 104);
          this.field_l.a(param4.field_i, param3 + param4.field_m, param4.field_j + param1 - 2, param4.field_t, param4.field_x, var8, -1, 1, 1, this.field_l.field_F);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("gh.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        m var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = SolKnight.field_L ? 1 : 0;
        try {
          var4 = (m) (gg.field_b.a((byte) 51));
          while (var4 != null) {
            l.a(param0, param1 ^ -9489, var4);
            var4 = (m) (gg.field_b.b(-121));
          }
          if (param1 == 9543) {
            return;
          }
          gh.a('i', (byte) 57);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var2), "gh.CA(" + param0 + ',' + param1 + ')');
        }
    }

    final static String a(int param0, CharSequence param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -31433) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          var2 = ub.a(-88, ti.a(param1, (byte) 44));
          if (var2 == null) {
            var2 = "";
          }
          stackIn_7_0 = var2;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_10_0 = var2_ref;
          stackIn_10_1 = new StringBuilder().append("gh.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static boolean a(char param0, byte param1) {
        if (param1 != -124) {
          gh.a('￾', (byte) -29);
          if (param0 < 48) {
            return false;
          }
          if (57 >= param0) {
            return true;
          }
          return false;
        }
        if (param0 < 48) {
          return false;
        }
        if (57 >= param0) {
          return true;
        }
        return false;
    }

    private gh(int param0, int param1, int param2) {
        this.field_t = vk.field_i;
        this.field_l = uc.field_g;
        this.field_q = param1;
        this.field_p = param2;
        this.field_s = param0;
    }

    public gh() {
        this(2188450, 2591221, 9543);
    }

    static {
        field_r = "Change display name";
    }
}
