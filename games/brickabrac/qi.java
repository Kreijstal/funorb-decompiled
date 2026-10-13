/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi extends d {
    private int field_P;
    static String field_N;
    int field_M;
    private c field_O;
    static jp[] field_K;
    int field_L;

    final static me a(java.applet.Applet param0, int param1) {
        int var4 = 0;
        String var2 = null;
        RuntimeException var2_ref = null;
        me[] var3 = null;
        me var5 = null;
        int var6 = 0;
        me stackIn_4_0 = null;
        me stackIn_10_0 = null;
        me stackIn_14_0 = null;
        me stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          var2 = ki.a(param0, 104, "jagex-last-login-method");
          if (var2 == null) {
            stackIn_4_0 = bb.field_c;
            return stackIn_4_0;
          }
          var3 = bo.b(140);
          for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            if (var5.b(var2, param1 + 28554)) {
              stackIn_10_0 = var5;
              return stackIn_10_0;
            }
          }
          if (param1 == -28432) {
            stackIn_16_0 = bb.field_c;
            return stackIn_16_0;
          }
          stackIn_14_0 = (me) null;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_19_0 = var2_ref;
          stackIn_19_1 = new StringBuilder().append("qi.I(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    final int c(boolean param0) {
        if (param0) {
          field_N = (String) null;
          return this.field_O.b(true);
        }
        return this.field_O.b(true);
    }

    public static void j(int param0) {
        field_K = null;
        field_N = null;
        if (param0 != 18724) {
          java.applet.Applet var2 = (java.applet.Applet) null;
          qi.a((java.applet.Applet) null, 5);
        }
    }

    final static void a(byte param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          var5 = ke.field_m;
          var1 = var5;
          var2 = 0;
          if (param0 != 109) {
            return;
          }
          var3 = var5.length;
          while (var3 > var2) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var1_ref), "qi.F(" + param0 + ')');
        }
    }

    final int a(int param0, boolean param1) {
        if (0 > param0) {
          return -1;
        }
        if (this.field_O.b(!param1 ? true : false) <= param0) {
          return -1;
        }
        if (!param1) {
          return this.field_O.a(param0, (byte) 64);
        }
        this.field_O = (c) null;
        return this.field_O.a(param0, (byte) 64);
    }

    final int h(int param0) {
        if (param0 >= -81) {
          this.field_M = -5;
          return this.field_P;
        }
        return this.field_P;
    }

    final static void a(int param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        BitPacketBuffer var5 = null;
        int var6 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var11 = null;
        e var12 = null;
        al var13 = null;
        BitPacketBuffer var14 = null;
        al var15 = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          var14 = jl.field_e;
          var2 = var14.readUnsignedByte(255);
          if (param0 == ~var2) {
            var11 = Ball.d(8);
            var3 = var11;
            var10 = var11;
            var4 = var10;
            var5 = var14;
            var6 = ((PacketBuffer) ((Object) var5)).readUnsignedByte(255);
            for (var7 = 0; var6 > var7; var7++) {
              var10[var7] = ((PacketBuffer) ((Object) var5)).readInt(pn.a(param0, -256));
            }
            var13 = (al) (ej.field_F.first(param0 - 84));
            if (var13 == null) {
              hn.a((byte) 102);
              return;
            }
            var13.field_i = true;
            var13.field_k = var3;
            var13.unlink((byte) 111);
            return;
          }
          if (1 == var2) {
            var12 = (e) (na.field_Q.first(param0 ^ 86));
            if (var12 == null) {
              hn.a((byte) 103);
              return;
            }
            var12.unlink((byte) 111);
            return;
          }
          if (var2 != 2) {
            rk.a("A1: " + eq.c((byte) -92), (Throwable) null, 88);
            hn.a((byte) 52);
            return;
          }
          var15 = (al) (ej.field_F.first(-42));
          if (var15 == null) {
            hn.a((byte) 119);
            return;
          }
          var15.field_k = Ball.d(8);
          var15.field_i = true;
          var15.unlink((byte) 111);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var1), "qi.A(" + param0 + ')');
        }
    }

    final boolean a(oc param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var12 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = BrickABrac.field_J ? 1 : 0;
        try {
          if (!super.a(param0, param1, param2, param3, param4, param5, param6 + param6)) {
            return false;
          }
          var8_int = -this.field_L + (-param2 + param1);
          var9 = -(this.field_L * 2) + this.field_t;
          if (var9 < var8_int) {
            var8_int = var9;
          }
          if (var8_int < 0) {
            var8_int = 0;
          }
          var8_int = this.field_P * var8_int / var9;
          if (param4 == 1) {
            this.field_O.a(false, var8_int);
          } else {
            if (param4 == 2) {
              var10 = 2147483647;
              var11 = -1;
              for (var12 = 0; this.field_O.b(true) > var12; var12++) {
                var13 = -var8_int + this.field_O.a(var12, (byte) 64);
                var13 = var13 * var13;
                if (var10 > var13) {
                  var10 = var13;
                  var11 = var12;
                }
              }
              if (var11 < 0) {
                return true;
              }
              this.field_O.a((byte) 46, var11);
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_24_0 = var8;
          stackIn_24_1 = new StringBuilder().append("qi.MA(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static int i(int param0) {
        if (param0 != -29946) {
          return -15;
        }
        return ScorePopup.field_p;
    }

    private qi() throws Throwable {
        throw new Error();
    }

    static {
        field_N = "Cool!";
    }
}
