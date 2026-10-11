/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dla extends bf {
    static char field_j;
    nq field_n;
    static char[] field_i;
    static sna field_k;
    static String field_m;
    static hn field_l;

    final void a(int param0, lu param1) {
        try {
          er.a(this.field_n, 122, param1);
          int var3_int = 126 % ((param0 + 53) / 50);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "dla.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(op param0, int param1) {
        try {
          if (param1 != -26281) {
            lu var4 = (lu) null;
            this.a(-110, (lu) null);
          }
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "dla.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void b(int param0) {
        if (param0 != 0) {
          return;
        }
        rt.a(sc.field_n, (String) null, param0 + 9);
    }

    public static void a(int param0) {
        field_i = null;
        field_l = null;
        if (param0 != 1097) {
          return;
        }
        field_m = null;
        field_k = null;
    }

    final static void a(int param0, int[] param1, int param2, byte[] param3, int param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        byte dupTemp$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var6Lifetime1;
        var7 = BachelorFridge.field_y;
        try {
          var5_int = 0;
          while (true) {
            if (wa.field_m.length <= var5_int) {
              var6 = -20 / ((8 - param2) / 33);
              return;
            }
            param4 = wa.field_m[var5_int];
            var6Lifetime1 = var5_int << 4;
            while (true) {
              incrementValue$0 = param4;
              param4--;
              if (incrementValue$0 == 0) {
                var5_int++;
                break;
              }
              incrementValue$1 = var6Lifetime1;
              var6Lifetime1++;
              param0 = ci.field_q[incrementValue$1];
              dupTemp$2 = param3[param0];
              dupTemp$3 = param1[dupTemp$2];
              param1[dupTemp$2] = dupTemp$3 + 1;
              ci.field_q[dupTemp$3] = param0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("dla.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param4).append(')').toString());
        }
    }

    dla(nq param0) {
        try {
          this.field_n = param0;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "dla.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    dla(lu param0) {
        try {
          this.field_n = qi.a(param0, (byte) 81);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "dla.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = new char[128];
        field_m = "Account created successfully!";
    }
}
