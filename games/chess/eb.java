/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb extends pk {
    static String field_t;
    int field_w;
    static int field_y;
    boolean field_C;
    int field_M;
    int field_H;
    private int field_u;
    private int field_v;
    static String field_G;
    private int field_A;
    private int field_L;
    int field_I;
    int field_r;
    private int field_z;
    private int field_E;
    private int field_m;
    String field_q;
    private int field_x;
    private int field_p;
    private int[] field_n;
    int field_B;
    lh field_J;
    private int field_s;
    private int field_F;
    private int field_o;
    int field_K;
    int field_N;
    private int field_O;
    private int field_D;

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        wb.a(this.field_i, this.field_k, this.field_l, this.field_c, -1 + (this.field_c >> 1), param8, param5);
        int var11 = this.field_c - (this.field_K << 1);
        wb.a(this.field_K + this.field_i, this.field_k + this.field_K, this.field_l - (this.field_K << 1), var11, (var11 >> 1) - 1, param4, param3);
        wb.b(this.field_n);
        if (param6 == 12054) {
          wb.b(this.field_i, this.field_k, this.field_i + this.field_l, this.field_k + this.field_c);
          this.field_J.a(this.field_q, param0 + this.field_i, this.field_k + param1, this.field_l, this.field_c, param9, param7, param2, this.field_m, this.field_L, this.field_x);
          wb.a(this.field_n);
          return;
        }
    }

    public static void a(int param0) {
        field_G = null;
        if (param0 != -29115) {
          return;
        }
        field_t = null;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var5;
        var5 = Chess.field_G;
        if (param3 != 3) {
          field_y = 58;
        }
        if (0 != param0) {
          ib.field_a = bc.field_b;
          rf.b(80, bc.field_b / 3);
          mf.a(gl.field_b, 0);
        } else {
          if (param1 != 0) {
            wf.a(um.field_l[8], 114);
          } else {
            if (param1 == 1) {
              wf.a(um.field_l[3], -65);
            } else {
              if (param1 == 6) {
                wf.a(um.field_l[1], 44);
              } else {
                if (param1 == 5) {
                  wf.a(um.field_l[1], 44);
                } else {
                  wf.a(um.field_l[2], param3 ^ 107);
                }
              }
            }
          }
        }
    }

    final void c(byte param0) {
        boolean stackIn_10_1 = false;
        boolean stackIn_13_1 = false;
        boolean stackIn_23_1 = false;
        boolean stackIn_26_1 = false;
        if (param0 == -95) {
          if (!this.field_e) {
            this.field_f = false;
            this.field_d = false;
            return;
          }
          if (!this.field_C) {
            this.field_f = false;
            this.field_d = false;
            return;
          }
          stackIn_23_1 = (this.a((byte) -9)) && (wh.field_f == 0) && (this.field_f);
          this.field_d = stackIn_23_1;
          stackIn_26_1 = (wh.field_f != 0);
          this.field_f = stackIn_26_1;
          return;
        }
        eb.a(8);
        if (!this.field_e) {
          this.field_f = false;
          this.field_d = false;
          return;
        }
        if (!this.field_C) {
          this.field_f = false;
          this.field_d = false;
          return;
        }
        stackIn_10_1 = (this.a((byte) -9)) && (wh.field_f == 0) && (this.field_f);
        this.field_d = stackIn_10_1;
        stackIn_13_1 = (wh.field_f != 0);
        this.field_f = stackIn_13_1;
    }

    final void d(byte param0) {
        int var5 = 0;
        int var3 = 0;
        int var4 = 0;
        int var2 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = Chess.field_G;
        int var5Lifetime1;
        int var5Lifetime2;
        int var3Lifetime1;
        int var3Lifetime2;
        int var4Lifetime1;
        int var4Lifetime2;
        int var2Lifetime1;
        int var2Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        if (!this.field_C) {
          return;
        }
        if (this.field_J == null) {
          return;
        }
        if (null == this.field_q) {
          return;
        }
        int var9 = 56 % ((-64 - param0) / 58);
        if (!this.a((byte) -9)) {
          var5 = this.field_z & bk.field_k;
          var3 = this.field_B >>> uc.field_d;
          var4 = this.field_M;
          var2 = bk.field_k & this.field_B;
          var6 = this.field_z >>> uc.field_d;
          var7 = bk.field_k & this.field_H;
          var8 = this.field_H >>> uc.field_d;
          var10 = this.field_F;
          var11 = this.field_r;
          this.a(var10, var11, var3, var6, var5, var8, 12054, var4, var7, var2);
          return;
        }
        if (wh.field_f == 0) {
          var5Lifetime1 = this.field_o & bk.field_k;
          var2Lifetime1 = bk.field_k & this.field_D;
          var4Lifetime1 = this.field_O;
          var3Lifetime1 = this.field_D >>> uc.field_d;
          var6Lifetime1 = this.field_o >>> uc.field_d;
          var7Lifetime1 = bk.field_k & this.field_s;
          var11Lifetime1 = this.field_I;
          var10Lifetime1 = this.field_A;
          var8Lifetime1 = this.field_s >>> uc.field_d;
          this.a(var10Lifetime1, var11Lifetime1, var3Lifetime1, var6Lifetime1, var5Lifetime1, var8Lifetime1, 12054, var4Lifetime1, var7Lifetime1, var2Lifetime1);
          return;
        }
        var5Lifetime2 = bk.field_k & this.field_u;
        var2Lifetime2 = this.field_p & bk.field_k;
        var4Lifetime2 = this.field_E;
        var3Lifetime2 = this.field_p >>> uc.field_d;
        var7Lifetime2 = bk.field_k & this.field_N;
        var6Lifetime2 = this.field_u >>> uc.field_d;
        var10Lifetime2 = this.field_v;
        var11Lifetime2 = this.field_w;
        var8Lifetime2 = this.field_N >>> uc.field_d;
        this.a(var10Lifetime2, var11Lifetime2, var3Lifetime2, var6Lifetime2, var5Lifetime2, var8Lifetime2, 12054, var4Lifetime2, var7Lifetime2, var2Lifetime2);
    }

    final static boolean a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -1) {
            stackIn_4_0 = fh.a(param0, 5, false);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("eb.H(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    eb(int param0, int param1, int param2, int param3, String param4) {
        this.field_v = 0;
        this.field_z = -2147483647;
        this.field_x = 0;
        this.field_E = -1;
        this.field_H = -1;
        this.field_p = -1;
        this.field_C = true;
        this.field_u = -16777215;
        this.field_r = 0;
        this.field_M = -1;
        this.field_B = -1;
        this.field_s = -2130706433;
        this.field_w = 0;
        this.field_L = 1;
        this.field_F = 0;
        this.field_I = 0;
        this.field_N = -2130706433;
        this.field_n = new int[4];
        this.field_m = 1;
        this.field_A = 0;
        this.field_o = -2147483647;
        this.field_D = -1;
        this.field_O = -1;
        this.field_K = 2;
        try {
          this.field_c = param3;
          this.field_l = param2;
          this.field_q = param4;
          this.field_k = param1;
          this.field_i = param0;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "eb.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_t = "Searching for an opponent";
        field_G = "This option cannot be combined with the current settings for:  ";
    }
}
