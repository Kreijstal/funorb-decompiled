/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj extends kf implements vn {
    private String field_Z;
    private gk field_W;
    static StringBuilder field_ab;
    private ek[] field_V;
    static int[][] field_T;
    private int field_U;
    private mm field_X;
    static nh field_cb;
    private int[] field_S;
    static ck field_eb;
    static int field_Y;
    static String field_db;
    static String field_bb;

    dj(gk param0, mm param1, String param2) {
        super(0, 0, 288, 0, (gl) null);
        int var4_int = 0;
        this.field_U = 0;
        try {
          this.field_X = param1;
          this.field_Z = param2;
          this.field_W = param0;
          var4_int = null == this.field_Z ? 0 : this.field_X.b(this.field_Z, 260, this.field_X.field_R);
          this.b(var4_int + 22, 288, 0, 0, -16555);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "dj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0) {
        if (param0 < 106) {
          dj.b(false);
        }
        return ig.field_dc;
    }

    public static void b(boolean param0) {
        field_ab = null;
        if (!param0) {
          return;
        }
        field_eb = null;
        field_T = (int[][]) null;
        field_bb = null;
        field_db = null;
        field_cb = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, -104, param2, param3);
        this.field_X.a(this.field_Z, param0 - (-this.field_u - 14), this.field_D + (param3 + 10), this.field_t - 28, this.field_y, 16777215, -1, 0, 0, this.field_X.field_R);
        if (param1 > -103) {
          this.a(67, 1, 70, -22);
        }
    }

    private final void b(int param0, int param1) {
        int var5 = 0;
        int var6 = client.field_A ? 1 : 0;
        int var5Lifetime1;
        if (this.field_U >= param0) {
          return;
        }
        ek[] var7 = new ek[param0];
        ek[] var3 = var7;
        int[] var4 = new int[param0];
        for (var5 = 0; var5 < this.field_U; var5++) {
          var7[var5] = this.field_V[var5];
          var4[var5] = this.field_S[var5];
        }
        this.field_U = param0;
        var5Lifetime1 = -117 % ((50 - param1) / 51);
        this.field_S = var4;
        this.field_V = var3;
    }

    final ek a(int param0, String param1, kg param2) {
        ek var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        ek stackIn_2_0 = null;
        ek stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new ek(param1, param2);
          var4.field_p = (gl) ((Object) new fk());
          var5 = -2 + this.field_y;
          if (param0 <= 95) {
            stackIn_2_0 = (ek) null;
            return stackIn_2_0;
          }
          this.b(this.field_y + 34, this.field_t, 0, 0, -16555);
          var4.b(30, -14 + this.field_t, 7, var5, -16555);
          this.b(var4, (byte) -55);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("dj.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void a(String param0, int param1, int param2) {
        int var4_int = 0;
        try {
          if (param2 != 14) {
            this.field_Z = (String) null;
          }
          var4_int = this.field_U;
          this.b(1 + var4_int, -104);
          this.field_V[var4_int] = this.a(103, param0, (kg) (this));
          this.field_S[var4_int] = param1;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "dj.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(ud param0, int param1) {
        try {
          ai.a(98, 0, param0, 128, 128);
          if (param1 != 22) {
            ud var3 = (ud) null;
            dj.a((ud) null, 24);
          }
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "dj.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(byte param0, int param1, ek param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var8 = client.field_A ? 1 : 0;
        try {
          if (param0 != 67) {
            field_db = (String) null;
          }
          for (var6_int = 0; var6_int < this.field_U; var6_int++) {
            if (this.field_V[var6_int] != param2) {
              continue;
            }
            var7 = this.field_S[var6_int];
            if (var7 != -1) {
              hm.a(this.field_S[var6_int], (byte) -109);
            } else {
              this.field_W.n(-123);
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("dj.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_T = (int[][]) null;
        field_ab = new StringBuilder(80);
        field_bb = "Show lobby chat from my friends";
        field_db = "Show all game chat";
    }
}
