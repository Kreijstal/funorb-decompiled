/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dp extends df {
    static int field_u;
    private int[] field_w;
    private String[] field_y;
    static bi field_s;
    int[] field_o;
    private int[][] field_q;
    static int field_v;
    static String[] field_x;
    static boolean field_t;
    static String field_p;
    static int field_r;

    final static void e(int param0) {
        cq.a(-50);
        if (param0 != -23771) {
          byte[] var2 = (byte[]) null;
          dp.a((byte[]) null, -8, -126, -100);
        }
    }

    final static byte[] a(byte[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        er var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param2 != -26131) {
            dp.f((byte) 115);
          }
          if (param3 > 0) {
            var8 = new byte[param1];
            var4 = var8;
            for (var5_int = 0; var5_int < param1; var5_int++) {
              var8[var5_int] = param0[var5_int + param3];
            }
          } else {
            var4 = param0;
          }
          var5 = new er();
          var5.b(param2 ^ 169946828);
          var5.a((byte) 36, (long)(param1 * 8), var4);
          var6 = new byte[64];
          var5.a(0, (byte) 111, var6);
          stackIn_9_0 = var6;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_12_0 = var4_ref;
          stackIn_12_1 = new StringBuilder().append("dp.I(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void e(byte param0) {
        int var2 = 0;
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        if (null != this.field_o) {
          for (var2 = 0; var2 < this.field_o.length; var2++) {
            this.field_o[var2] = ee.a(this.field_o[var2], 32768);
          }
        }
        if (param0 >= -60) {
          this.field_w = (int[]) null;
        }
    }

    final void a(ob param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param1 != 0) {
            return;
          }
          while (true) {
            var3_int = param0.j(-126);
            if (0 == var3_int) {
              return;
            }
            this.a(1, var3_int, param0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("dp.H(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, int param1, ob param2) {
        int[] array$0 = null;
        int var8 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        gq var7 = null;
        int var9 = 0;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0 == param1) {
            this.field_y = so.a(param2.e(-1), '<', 51);
          } else {
            if (param1 == 2) {
              var4_int = param2.j(-70);
              this.field_o = new int[var4_int];
              for (var5 = 0; var5 < var4_int; var5++) {
                this.field_o[var5] = param2.f(param0 - 20977);
              }
            } else {
              if (param1 == 3) {
                var4_int = param2.j(-74);
                this.field_w = new int[var4_int];
                this.field_q = new int[var4_int][];
                for (var5 = 0; var4_int > var5; var5++) {
                  var6 = param2.f(-20976);
                  var7 = aq.a(var6, 0);
                  if (var7 != null) {
                    this.field_w[var5] = var6;
                    array$0 = new int[var7.field_e];
                    this.field_q[var5] = array$0;
                    for (var8 = 0; var7.field_e > var8; var8++) {
                      this.field_q[var5][var8] = param2.f(-20976);
                    }
                  }
                }
              } else {
                if (4 == param1) {
                  return;
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("dp.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    public static void f(byte param0) {
        field_p = null;
        field_x = null;
        field_s = null;
        if (param0 != -50) {
          dp.a(-94, -30, 68);
        }
    }

    final String f(int param0) {
        int var3 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        StringBuilder var5 = new StringBuilder(param0);
        StringBuilder var2 = var5;
        if (null == this.field_y) {
          return "";
        }
        StringBuilder discarded$0 = var5.append(this.field_y[0]);
        for (var3 = 1; this.field_y.length > var3; var3++) {
          discarded$1 = var2.append("...");
          discarded$2 = var5.append(this.field_y[var3]);
        }
        return var2.toString();
    }

    dp() {
    }

    final static boolean a(int param0, int param1, int param2) {
        boolean stackIn_11_0 = false;
        if (param0 >= -84) {
          dp.e(2);
        }
        if (13 == oq.field_j) {
          eo.f(false);
          return true;
        }
        if (oq.field_j == 102) {
          mr.field_h.h(0);
          return true;
        }
        stackIn_11_0 = (null != mr.field_h) && (mr.field_h.a(param1, false, param2));
        return stackIn_11_0;
    }

    final static void a(int param0, int[] param1, int param2, int param3, int param4) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param2 != -1) {
            field_r = -13;
          }
          while (true) {
            param4--;
            if (param4 < 0) {
              return;
            }
            var9 = param1;
            var5 = var9;
            var6 = param0;
            var7 = param3;
            var9[var6] = var7 + (we.a(var9[var6], 16711422) >> 1);
            param0++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_8_0 = var5_ref;
          stackIn_8_1 = new StringBuilder().append("dp.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_u = 200;
        field_x = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_p = "Invalid password.";
        field_t = false;
    }
}
