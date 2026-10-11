/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc extends eo {
    static String field_n;
    boolean field_w;
    String field_s;
    static int field_t;
    int[] field_q;
    static int field_r;
    static int field_v;
    int[] field_u;
    char[] field_p;
    char[] field_o;

    private final void a(lu param0, int param1, int param2) {
        char[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_14_2 = 0;
        char[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_20_2 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = BachelorFridge.field_y;
        try {
          if (param2 != -3) {
            return;
          }
          if (param1 == 1) {
            this.field_s = param0.g(49);
          } else {
            if (param1 == 2) {
              var4_int = param0.b(16711935);
              this.field_u = new int[var4_int];
              this.field_p = new char[var4_int];
              for (var5 = 0; var4_int > var5; var5++) {
                this.field_u[var5] = param0.e((byte) 114);
                var6 = param0.b(true);
                stackIn_19_0 = this.field_p;
                stackIn_19_1 = var5;
                if (var6 != 0) {
                  stackIn_20_2 = vja.a((byte) var6, (byte) -93);
                } else {
                  stackIn_20_2 = 0;
                }
                stackIn_19_0[stackIn_19_1] = (char) stackIn_20_2;
              }
            } else {
              if (param1 != 3) {
                if (param1 != 4) {
                  return;
                }
                this.field_w = true;
                return;
              }
              var4_int = param0.b(16711935);
              this.field_q = new int[var4_int];
              this.field_o = new char[var4_int];
              for (var5 = 0; var5 < var4_int; var5++) {
                this.field_q[var5] = param0.e((byte) 92);
                var6 = param0.b(true);
                stackIn_13_0 = this.field_o;
                stackIn_13_1 = var5;
                if (var6 != 0) {
                  stackIn_14_2 = vja.a((byte) var6, (byte) -46);
                } else {
                  stackIn_14_2 = 0;
                }
                stackIn_13_0[stackIn_13_1] = (char) stackIn_14_2;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_25_0 = var4;
          stackIn_25_1 = new StringBuilder().append("jc.M(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(lu param0, boolean param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = BachelorFridge.field_y;
        try {
          while (true) {
            var3_int = param0.b(16711935);
            if (var3_int != 0) {
              this.a(param0, var3_int, -3);
              continue;
            }
            break;
          }
          if (param1) {
            jc.e(91);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("jc.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static fea a(vr param0, int param1, boolean param2, vr param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        fea stackIn_5_0 = null;
        fea stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!g.a(param4, param1, -30744, param3)) {
            stackIn_2_0 = null;
            return (fea) (stackIn_2_0);
          }
          if (!param2) {
            stackIn_7_0 = kea.a((byte) -3, param0.b(-26, param4, param1));
            return stackIn_7_0;
          }
          stackIn_5_0 = (fea) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("jc.D(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param4).append(')').toString());
        }
    }

    final static boolean f(int param0) {
        if (param0 != -24457) {
          field_n = (String) null;
        }
        return pma.field_k;
    }

    final void d(byte param0) {
        int var4 = 0;
        int var2 = 0;
        int var3 = BachelorFridge.field_y;
        int var2Lifetime1;
        if (this.field_q != null) {
          for (var2 = 0; var2 < this.field_q.length; var2++) {
            this.field_q[var2] = mp.a(this.field_q[var2], 32768);
          }
        }
        if (null != this.field_u) {
          var4 = 0;
          var2Lifetime1 = var4;
          while (this.field_u.length > var4) {
            this.field_u[var4] = mp.a(this.field_u[var4], 32768);
            var4++;
          }
        }
        if (param0 != -25) {
          field_v = -40;
        }
    }

    public static void e(int param0) {
        if (param0 < 91) {
          jc.e(5);
        }
        field_n = null;
    }

    jc() {
        this.field_w = false;
    }

    static {
        field_r = 0;
        field_v = 500;
    }
}
