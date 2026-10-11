/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wr extends mo {
    static ff field_h;
    static int field_j;
    int[] field_k;
    boolean[] field_i;
    static int field_f;
    static String field_g;
    static int field_l;

    final void a(int param0, int param1, int param2) {
        if (this.field_i[param0]) {
          return;
        }
        if (param2 == 0 &&
          this.field_k[param0] > 0) {
          this.field_k[param0] = this.field_k[param0] - 1;
        }
        if (param2 == 1 &&
          -1 + ws.field_b.length > this.field_k[param0]) {
          this.field_k[param0] = this.field_k[param0] + 1;
        }
        if (param1 != 1) {
          return;
        }
        if (param2 == 2) {
          this.field_i[param0] = true;
        }
    }

    public static void a(boolean param0) {
        field_h = null;
        if (!param0) {
          return;
        }
        field_g = null;
    }

    final static int a(int param0, ml param1, int param2, int param3, int param4, int param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6_int = param1.l(param5, 59);
          if (var6_int != 0) {
            if (var6_int != 1) {
              throw new IllegalStateException();
            }
            stackIn_8_0 = param2 + param1.l(param0, 59);
            return stackIn_8_0;
          }
          if (param3 > 0) {
            stackIn_4_0 = param1.l(param3, 59);
          } else {
            stackIn_4_0 = 0;
          }
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("wr.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void c(ml param0, int param1) {
        try {
          this.field_k[0] = param0.l(3, 59);
          if (param1 != 2) {
            java.awt.Canvas var4 = (java.awt.Canvas) null;
            wr.a((java.awt.Canvas) null, 103);
          }
          this.field_k[1] = param0.l(3, 59);
          this.field_i[0] = mu.a(param0, (byte) -39);
          this.field_i[1] = mu.a(param0, (byte) -39);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "wr.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static String[] a(String param0, int param1, char param2) {
        int var7 = 0;
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        CharSequence var9 = null;
        String[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = (CharSequence) ((Object) param0);
          var3_int = wn.a(param2, param1 - 2, var9);
          if (param1 != 2) {
            field_f = 25;
          }
          var4 = new String[1 + var3_int];
          var5 = 0;
          var6 = 0;
          for (var7 = 0; var7 < var3_int; var7++) {
            for (var8 = var6; param2 != param0.charAt(var8); var8++) {
            }
            incrementValue$1 = var5;
            var5++;
            var4[incrementValue$1] = param0.substring(var6, var8);
            var6 = 1 + var8;
          }
          var4[var3_int] = param0.substring(var6);
          stackIn_9_0 = var4;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("wr.C(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final boolean a(byte param0) {
        int var2;
        boolean stackIn_4_0 = false;
        var2 = 76 / ((param0 - 57) / 37);
        stackIn_4_0 = (this.field_i[0]) && (this.field_i[1]);
        return stackIn_4_0;
    }

    public final String toString() {
        return "AgentFormation\tteam0=" + this.field_k[0] + "/" + this.field_i[0] + "\tteam1=" + this.field_k[1] + "/" + this.field_i[1];
    }

    final static void a(java.awt.Canvas param0, int param1) {
        String var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (vj.field_c == 11) {
            dn.a(-127);
          }
          ik.a(hw.field_j, ts.field_b, m.field_h, (byte) 84);
          su.a(param1 ^ -23390, 0, 0, param0);
          if (param1 != -14142) {
            var3 = (String) null;
            wr.a((String) null, -39, 'ￜ');
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("wr.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte param0, mo param1) {
        int var4 = 0;
        wr var3 = null;
        int var5 = 0;
        wr var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = Kickabout.field_G;
        try {
          var6 = (wr) (param1);
          var3 = var6;
          for (var4 = 0; var4 < 2; var4++) {
            this.field_k[var4] = var6.field_k[var4];
            this.field_i[var4] = var6.field_i[var4];
          }
          if (param0 > -52) {
            wr.a(false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("wr.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public wr() {
        this.field_k = new int[2];
        this.field_i = new boolean[2];
    }

    static {
        field_j = 1;
        field_f = 0;
        field_h = new ff(6, 0, 4, 2);
        field_l = -1;
        field_g = "in the Semi-Finals";
    }
}
