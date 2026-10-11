/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl extends ch implements vo {
    private jl field_O;
    static ak field_J;
    private qm[] field_S;
    private vk field_M;
    private String field_N;
    private int[] field_I;
    static jl field_Q;
    static String field_R;
    private int field_P;
    static ak field_L;

    public static void a(int param0) {
        field_R = null;
        if (param0 != 0) {
          field_J = (ak) null;
        }
        field_Q = null;
        field_L = null;
        field_J = null;
    }

    final void a(int param0, int param1, int param2, byte param3) {
        super.a(param0, param1, param2, (byte) -24);
        this.field_O.a(this.field_N, 14 + (this.field_z + param2), this.field_p + param0 + 10, this.field_E - 28, this.field_C, 16777215, -1, 0, 0, this.field_O.field_w);
        int var5 = -57 / ((param3 - 70) / 49);
    }

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var6 = Pixelate.field_H ? 1 : 0;
        if (param1 <= this.field_P) {
          return;
        }
        qm[] var7 = new qm[param1];
        qm[] var3 = var7;
        int[] var4 = new int[param1];
        for (var5 = 0; var5 < this.field_P; var5++) {
          var7[var5] = this.field_S[var5];
          var4[var5] = this.field_I[var5];
        }
        this.field_I = var4;
        this.field_S = var3;
        this.field_P = param1;
        if (param0 > -57) {
          vl.b(94, 86, 20);
        }
    }

    vl(vk param0, jl param1, String param2) {
        super(0, 0, 288, 0, (eb) null);
        int var4_int = 0;
        this.field_P = 0;
        try {
          this.field_M = param0;
          this.field_O = param1;
          this.field_N = param2;
          var4_int = this.field_N == null ? 0 : this.field_O.a(this.field_N, 260, this.field_O.field_w);
          this.a(288, (byte) 55, 0, 0, 22 + var4_int);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "vl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(qm param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          if (param2 != 11) {
            field_R = (String) null;
          }
          for (var6_int = 0; var6_int < this.field_P; var6_int++) {
            if (this.field_S[var6_int] != param0) {
              continue;
            }
            var7 = this.field_I[var6_int];
            if (var7 != -1) {
              te.a(this.field_I[var6_int], -2671);
            } else {
              this.field_M.p(-121);
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("vl.Q(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, int param1, String param2) {
        int var4_int = 0;
        try {
          var4_int = this.field_P;
          this.a(param1 ^ 114, var4_int - param1);
          this.field_S[var4_int] = this.a(1707, (fn) (this), param2);
          this.field_I[var4_int] = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "vl.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final qm a(int param0, fn param1, String param2) {
        qm var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        qm stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new qm(param2, param1);
          var4.field_y = (eb) ((Object) new ad());
          if (param0 != 1707) {
            this.field_P = 66;
          }
          var5 = -2 + this.field_C;
          this.a(this.field_E, (byte) 63, 0, 0, this.field_C + 34);
          var4.a(-14 + this.field_E, (byte) 81, var5, 7, 30);
          this.b(var4, 80);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("vl.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static boolean b(int param0, int param1, int param2) {
        boolean stackIn_9_0 = false;
        if (ke.field_a == 13) {
          po.a(true);
          return true;
        }
        if (param0 == ke.field_a) {
          bo.field_h.l(17872);
          return true;
        }
        stackIn_9_0 = (null != bo.field_h) && (bo.field_h.a(param2, 0, param1));
        return stackIn_9_0;
    }

    static {
        field_R = "<%0> is not on your friend list.";
    }
}
