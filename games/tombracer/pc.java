/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    int field_c;
    int field_d;
    pc field_h;
    boolean field_l;
    int field_e;
    int field_i;
    int field_b;
    static String field_g;
    int field_a;
    int field_j;
    int field_k;
    int field_f;

    final static void a(int param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        if (param0 != 5) {
          pc.a(-47);
        }
        if (wna.field_n != null) {
          var1 = wna.field_n;
          synchronized (var1) {
            wna.field_n = null;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        this.field_k = param2;
        this.field_c = param1;
        this.field_e = param1;
        this.field_a = param3;
        if (param4 != 44) {
          return;
        }
        this.field_f = param3;
        this.field_d = param0;
    }

    public static void a(boolean param0) {
        if (!param0) {
          return;
        }
        field_g = null;
    }

    final void a(int param0, byte param1) {
        int var3 = this.field_e - this.field_d;
        int var4 = this.field_a - this.field_k;
        this.field_e = this.field_d + gqa.a(param0, (byte) 24, var3);
        if (param1 != 47) {
          bb var5 = (bb) null;
          pc.a(false, -126, (bb) null);
        }
        this.field_a = this.field_k + gqa.a(param0, (byte) 24, var4);
    }

    final static void a(boolean param0, int param1, bb param2) {
        kh var3 = null;
        try {
          var3 = ql.field_k;
          if (param0) {
            field_g = (String) null;
          }
          var3.k(param1, -2988);
          var3.i(5, 0);
          var3.i(0, 0);
          var3.f(-1477662136, param2.field_n);
          var3.i(param2.field_j, 0);
          var3.i(param2.field_i, 0);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "pc.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static bfa a(ela[] param0, int param1, String param2, bfa[] param3) throws rv {
        int var6 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$0 = null;
        bfa stackIn_5_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var7 = 0;
        StringBuilder var8 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          var4_int = 0;
          while (var4_int < param0.length) {
            if (!param0[var4_int].a(-120, param2, param3)) {
              var4_int++;
              continue;
            }
            stackIn_5_0 = param0[var4_int].a(param3, 0);
            return stackIn_5_0;
          }
          var8 = new StringBuilder("The method " + param2 + "(");
          var5 = 33 % ((param1 + 53) / 54);
          for (var6 = 0; var6 < param3.length; var6++) {
            if (param3[var6].field_a) {
              discarded$1 = var8.append(jd.a(param3[var6].field_d, 0).toString());
            } else {
              discarded$2 = var8.append(rva.a(param3[var6].field_d.getClass(), (byte) -88));
            }
            if (-1 + param3.length > var6) {
              discarded$3 = var8.append(',');
            }
          }
          discarded$0 = var8.append(") is undefined.");
          throw new rv(var8.toString());
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("pc.C(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    static {
        field_g = "Cancel draw";
    }
}
