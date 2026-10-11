/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k extends ud {
    static ec[] field_O;
    static int[][] field_N;

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, ei param5) {
        wj var7 = null;
        super.a(param0, param1, param2, param3, (byte) 67, param5);
        if (param4 < 62) {
          return;
        }
        try {
          var7 = uh.field_u;
          if (var7 != null) {
            if (!this.a(param0, param2, param1, -1, param3)) {
              return;
            }
            if (this.field_t instanceof jm) {
              ((jm) (this.field_t)).a(-110, this, var7);
              uh.field_u = null;
              return;
            }
            if (!(var7.field_t instanceof jm)) {
              return;
            }
            ((jm) (var7.field_t)).a(-74, this, var7);
            uh.field_u = null;
          }
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "k.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, byte param1, long param2) {
        oq var4 = ej.field_j;
        var4.b(false, param0);
        var4.field_v = var4.field_v + 1;
        int var6 = 84 / ((-74 - param1) / 37);
        int var5 = var4.field_v;
        var4.a(6, false);
        var4.a(param2, (byte) -126);
        var4.b(var4.field_v - var5, true);
    }

    final static void g(byte param0) {
        if (param0 != 96) {
          field_O = (ec[]) null;
          if (!bj.c(1)) {
            return;
          }
          kk.a(false, 4, 4);
          return;
        }
        if (!bj.c(1)) {
          return;
        }
        kk.a(false, 4, 4);
    }

    final static String a(long param0, int param1, boolean param2, int param3) {
        if (param2) {
          return di.a(param0, param3, false, -109, param1, 10);
        }
        k.h(83);
        return di.a(param0, param3, false, -109, param1, 10);
    }

    private k(int param0, int param1, int param2, int param3, fp param4, cc param5, ei param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
          this.field_L = param6;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "k.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int[] param0, byte param1, int[] param2) {
        try {
          kf.a(param2.length, (byte) -104, param2, param0, 0);
          if (param1 != -121) {
            field_O = (ec[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "k.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void h(int param0) {
        field_O = null;
        field_N = (int[][]) null;
        if (param0 != 120) {
          field_N = (int[][]) null;
        }
    }

    final static boolean a(di param0, di param1, di param2, boolean param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0.d(85)) {
            return false;
          }
          if (!param0.a("commonui", 0)) {
            return false;
          }
          if (param1.d(71) &&
            param1.a("commonui", 0)) {
            if (param2.d(122) &&
              param2.a("button.gif", 0)) {
              if (param3) {
                return true;
              }
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("k.H(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_N = new int[120][2];
    }
}
