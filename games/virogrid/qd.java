/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd {
    int field_j;
    int field_h;
    byte[] field_k;
    int field_a;
    byte[] field_e;
    int field_b;
    int field_n;
    int field_d;
    static ai[] field_m;
    int field_l;
    static km field_f;
    static String field_g;
    static ml field_i;
    static int field_c;

    final static String a(String param0, byte param1, String param2, String param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Virogrid.field_F ? 1 : 0;
        try {
          var4_int = param0.length();
          var5 = param3.length();
          var6 = param2.length();
          if (0 == var5) {
            throw new IllegalArgumentException("Key cannot have zero length");
          }
          var7 = var4_int;
          var8 = var6 - var5;
          if (var8 != 0) {
            var9_int = 0;
            while (true) {
              var9_int = param0.indexOf(param3, var9_int);
              if (var9_int < 0) {
                break;
              }
              var7 = var7 + var8;
              var9_int = var9_int + var5;
            }
          }
          if (param1 >= -37) {
            field_i = (ml) null;
          }
          var9 = new StringBuilder(var7);
          var10 = 0;
          while (true) {
            var11 = param0.indexOf(param3, var10);
            if (var11 < 0) {
              discarded$0 = var9.append(param0.substring(var10));
              stackIn_16_0 = var9.toString();
              return stackIn_16_0;
            }
            discarded$1 = var9.append(param0.substring(var10, var11));
            var10 = var5 + var11;
            discarded$2 = var9.append(param2);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("qd.G(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final static void a(int param0, byte param1, int param2, int param3) {
        jl.field_E = param0;
        en.field_Kb = param2;
        ti.field_b = param3;
        if (param1 <= 6) {
          field_c = 49;
        }
    }

    final static void a(int param0) {
        mc.field_a = -1;
        ei.field_a = false;
        wa.field_F = 0;
        int var1 = 103 / ((param0 - 14) / 55);
        od.field_l = null;
        ge.field_b = -1;
    }

    final static eh a(boolean param0, int param1, boolean param2, int param3, byte param4) {
        if (param4 >= 40) {
          return va.a(param1, false, param3, -116, param2, param0);
        }
        qd.a((byte) -115, -62);
        return va.a(param1, false, param3, -116, param2, param0);
    }

    public static void a(boolean param0) {
        field_g = null;
        field_i = null;
        field_f = null;
        field_m = null;
        if (!param0) {
          field_f = (km) null;
        }
    }

    final static int a(int param0, cj param1) {
        int var2_int = 0;
        int var3 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var2_intLifetime1;
        var3 = Virogrid.field_F ? 1 : 0;
        try {
          if (param0 != 16903) {
            field_i = (ml) null;
          }
          var2_int = tm.field_n;
          if (param1.field_n != 2) {
            if (param1.field_n == 4) {
              var2_intLifetime1 = dm.field_w[param1.field_n];
            } else {
              if (hh.field_d == param1.field_p) {
                var2_intLifetime1 = mk.field_eb[param1.field_n];
              } else {
                var2_intLifetime1 = dm.field_w[param1.field_n];
              }
            }
          } else {
            if (param1.field_j) {
              var2_intLifetime1 = tm.field_n;
            } else {
              if (param1.field_m == 0 &&
                param1.field_a == 0) {
                var2_intLifetime1 = mk.field_eb[param1.field_n];
              } else {
                var2_intLifetime1 = dm.field_w[param1.field_n];
              }
            }
          }
          stackIn_16_0 = var2_intLifetime1;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_19_0 = var2;
          stackIn_19_1 = new StringBuilder().append("qd.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static he a(byte param0, int param1) {
        int var2 = -66 % ((param0 - 65) / 53);
        return ma.field_c == null ? null : (he) (ma.field_c.a((long)param1, (byte) 93));
    }

    static {
        int var0 = 0;
        field_m = new ai[255];
        for (var0 = 0; field_m.length > var0; var0++) {
          field_m[var0] = new ai();
        }
        field_g = "You have withdrawn your request to join.";
        field_c = 0;
    }
}
