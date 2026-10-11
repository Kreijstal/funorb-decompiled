/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj extends rg {
    private wl field_P;
    int field_Q;
    int field_S;
    static ji field_T;
    private int field_R;

    final static jb a(boolean param0, boolean param1, byte param2) {
        jb var7 = new jb(3);
        jb var8 = var7;
        var8.a((byte) -128, new bd(20, lh.field_a, pn.field_a));
        var8.a((byte) -125, new bd(14, !param1 ? fl.field_b : qc.field_i, pn.field_a));
        var8.a((byte) -118, new bd(21, na.field_U, pn.field_a));
        var7.field_h[1].field_f = pn.field_a.c(var7.field_h[1].field_a) + 100;
        bd var4 = var7.field_h[0];
        var7.field_h[2].field_f = 150;
        var4.field_f = 150;
        var7.field_h[1].field_j = -(var7.field_h[1].field_f / 2) + 320;
        var7.field_h[0].field_j = 32;
        if (param2 != -119) {
          nj.a(false, false, (byte) 58);
        }
        var7.field_h[2].field_j = -32 - var7.field_h[2].field_f + 640;
        bd var5 = var7.field_h[0];
        bd var6 = var7.field_h[1];
        var7.field_h[2].field_b = 340;
        var6.field_b = 340;
        var8.field_b = 284;
        var8.field_k = 520;
        var8.field_c = 46;
        var5.field_b = 340;
        var8.field_s = 60;
        var8.a(param0, 26206, 1);
        return var8;
    }

    final boolean a(int param0, int param1, byte param2, int param3, fj param4, int param5, int param6) {
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
        var14 = Confined.field_J ? 1 : 0;
        try {
          if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          var8_int = -param0 + (param1 - this.field_S);
          var9 = this.field_F - 2 * this.field_S;
          if (var8_int > var9) {
            var8_int = var9;
          }
          if (var8_int < 0) {
            var8_int = 0;
          }
          var8_int = this.field_R * var8_int / var9;
          if (param6 != 1) {
            if (2 != param6) {
              return true;
            }
            var10 = 2147483647;
            var11 = -1;
            for (var12 = 0; var12 < this.field_P.a((byte) 127); var12++) {
              var13 = -var8_int + this.field_P.a(var12, 27656);
              var13 = var13 * var13;
              if (var13 < var10) {
                var10 = var13;
                var11 = var12;
              }
            }
            if (0 <= var11) {
              this.field_P.a(var11, (byte) -111);
            }
          } else {
            this.field_P.a((byte) -116, var8_int);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_26_0 = var8;
          stackIn_26_1 = new StringBuilder().append("nj.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final int h(byte param0) {
        if (param0 <= 97) {
          field_T = (ji) null;
        }
        return this.field_P.a((byte) 111);
    }

    final int a(byte param0, int param1) {
        if (param1 < 0 ||
          param1 >= this.field_P.a((byte) 111)) {
          return -1;
        }
        if (param0 < 14) {
          nj.a((byte) 123);
        }
        return this.field_P.a(param1, 27656);
    }

    public static void a(byte param0) {
        if (param0 != -93) {
          return;
        }
        field_T = null;
    }

    private nj() throws Throwable {
        throw new Error();
    }

    final int i(byte param0) {
        if (param0 != -96) {
          nj.a((byte) -113);
        }
        return this.field_R;
    }

    static {
    }
}
