/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk extends ae {
    private vd field_Q;
    static String field_R;
    int field_W;
    static String field_P;
    static int[] field_T;
    static long field_U;
    int field_V;
    static cl[] field_X;
    private int field_S;

    public static void h(int param0) {
        field_X = null;
        field_P = null;
        if (param0 != 2147483647) {
          field_X = (cl[]) null;
        }
        field_T = null;
        field_R = null;
    }

    final int a(int param0) {
        if (param0 != 23329) {
          kk.a(113, 9, -96, 50, (byte) -124);
        }
        return this.field_S;
    }

    final static oh[] a(int param0, int param1, int param2, int param3, byte param4) {
        if (param4 >= -9) {
          field_R = (String) null;
        }
        return lf.a(1, param2, param0, param3, 1, 1, 3, (byte) -112, param1);
    }

    final int a(int param0, byte param1) {
        if (param1 <= 110) {
          this.field_W = -87;
        }
        if (0 <= param0 &&
          param0 < this.field_Q.a(false)) {
          return this.field_Q.a(param0, (byte) 11);
        }
        return -1;
    }

    final static void g(int param0) {
        if (param0 != -1) {
          return;
        }
        if (hi.field_a) {
          ra.e(ra.field_j, ra.field_i, ra.field_l - ra.field_j, -ra.field_i + ra.field_g);
          ck.field_bb.a(false, param0 + 257);
        }
    }

    final boolean a(na param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var12 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = TetraLink.field_J;
        try {
          if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          var8_int = -this.field_W + param6 - param1;
          var9 = -(this.field_W * 2) + this.field_F;
          if (var8_int > var9) {
            var8_int = var9;
          }
          if (0 > var8_int) {
            var8_int = 0;
          }
          var8_int = this.field_S * var8_int / var9;
          if (param2 != 1) {
            if (param2 == 2) {
              var10 = 2147483647;
              var11 = -1;
              for (var12 = 0; var12 < this.field_Q.a(false); var12++) {
                var13 = this.field_Q.a(var12, (byte) 11) - var8_int;
                var13 = var13 * var13;
                if (var13 < var10) {
                  var10 = var13;
                  var11 = var12;
                }
              }
              if (var11 >= 0) {
                this.field_Q.a(0, var11);
              }
            }
          } else {
            this.field_Q.a((byte) 91, var8_int);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_26_0 = var8;
          stackIn_26_1 = new StringBuilder().append("kk.PA(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static int i(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = TetraLink.field_J;
        try {
          var1_int = 0;
          if (param0 > -47) {
            stackIn_3_0 = -48;
            return stackIn_3_0;
          }
          while (nj.b((byte) 28)) {
            hb.field_a.a(120);
            if (!hb.field_a.b(83)) {
              continue;
            }
            var1_int = 1;
          }
          hb.field_a.a(ai.a(aa.field_Nb, a.field_a, 121), ai.a(ci.field_B, li.field_o, -28), (byte) 93);
          if (hb.field_a.b(83)) {
            var1_int = 1;
          }
          var2 = 0;
          if (var1_int != 0 &&
            hb.field_a.field_b >= 0) {
            var2 = j.field_x[hb.field_a.field_b];
            if (var2 == 2) {
              ld.i(-21719);
            }
          }
          stackIn_14_0 = var2;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1), "kk.A(" + param0 + ')');
        }
    }

    final int e(byte param0) {
        if (param0 > -97) {
          this.field_S = 71;
        }
        return this.field_Q.a(false);
    }

    private kk() throws Throwable {
        throw new Error();
    }

    static {
        field_P = "Remove name";
        field_T = new int[8192];
        field_R = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
        field_X = new cl[11];
    }
}
