/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua extends mo {
    static long field_g;
    int field_n;
    static String field_h;
    int[] field_j;
    static String field_i;
    static hd field_k;
    static String field_f;
    int field_m;
    static int field_l;

    final void a(ml param0, byte param1) {
        if (!mu.a(param0, (byte) -39)) {
          return;
        }
        try {
          this.field_j[0] = hq.a(22531, 7, param0, 0);
          this.field_j[1] = hq.a(22531, 7, param0, 0);
          this.field_m = hq.a(22531, 10, param0, 0);
          int var3_int = -57 % ((25 - param1) / 63);
          this.field_n = -1 + param0.l(2, 59);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "ua.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(tj param0, int param1) {
        RuntimeException runtimeException = null;
        int var4 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          if (param1 > -116) {
            return;
          }
          if (this.field_m > 0) {
            this.field_m = this.field_m + 1;
            return;
          }
          if (param0.field_m == -1 &&
            param0.a(true) >= 370) {
            if (param0.a(true) > 525) {
              return;
            }
            if (param0.field_p < 0) {
              this.field_m = 1;
              this.field_n = 0;
              return;
            }
            if (param0.field_p <= 88080384) {
              return;
            }
            this.field_m = 1;
            this.field_n = 1;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_17_0 = runtimeException;
          stackIn_17_1 = new StringBuilder().append("ua.E(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_h = null;
        field_i = null;
        if (param0 == -30) {
          field_k = null;
          field_f = null;
          return;
        }
        ua.a((byte) 106);
        field_k = null;
        field_f = null;
    }

    public final String toString() {
        return "AgentGoalState\tscore=[" + this.field_j[0] + "," + this.field_j[1] + "]\tgoal_count=" + this.field_m + "\tgoal_scorer=" + this.field_n;
    }

    final static kg[] a(int param0, int param1, sj param2, boolean param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        kg[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!cu.a(param1, param2, param0, 114)) {
            stackIn_2_0 = null;
            return (kg[]) (stackIn_2_0);
          }
          if (param3) {
            field_h = (String) null;
          }
          stackIn_6_0 = fb.i((byte) 83);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("ua.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(byte param0, mo param1) {
        ua var4 = null;
        ua var3 = null;
        if (param0 >= -52) {
          return;
        }
        try {
          var4 = (ua) (param1);
          var3 = var4;
          this.field_m = var3.field_m;
          this.field_j[0] = var4.field_j[0];
          this.field_n = var3.field_n;
          this.field_j[1] = var4.field_j[1];
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "ua.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int c(int param0) {
        int var2 = 0;
        var2 = fj.a(-40, this.field_j[param0] ^ var2);
        var2 = fj.a(-40, this.field_j[1] ^ var2);
        var2 = fj.a(-40, var2 ^ this.field_m);
        var2 = fj.a(-40, var2 ^ this.field_n);
        return var2;
    }

    public ua() {
        this.field_j = new int[2];
        this.field_m = 0;
    }

    static {
        field_h = "Passwords can only contain letters and numbers";
        field_i = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_f = "Player Name: ";
    }
}
