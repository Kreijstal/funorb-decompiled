/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc extends bh {
    static int field_g;
    static int field_j;
    private java.nio.ByteBuffer field_f;
    static int[] field_h;
    static int field_i;

    final static vc a(byte param0, String param1) {
        RuntimeException var2 = null;
        vc stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ib.field_f.a(false) &&
            !param1.equals(ib.field_f.a((byte) -58))) {
            ib.field_f = ug.a(param1, 0);
          }
          if (param0 != 45) {
            jc.c((byte) -81);
          }
          stackIn_7_0 = ib.field_f;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("jc.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        RuntimeException runtimeException = null;
        String var2 = null;
        int var3 = 0;
        CharSequence var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = param1.getParameter("username");
          if (var2 != null) {
            var4 = (CharSequence) ((Object) var2);
            if (ub.a(50, var4) != 0L) {
              var3 = 28 / ((-30 - param0) / 57);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("jc.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void a(byte[] param0, byte param1) {
        try {
          this.field_f = java.nio.ByteBuffer.allocateDirect(param0.length);
          this.field_f.position(0);
          if (param1 >= -124) {
            String var4 = (String) null;
            jc.a((byte) -95, (String) null);
          }
          this.field_f.put(param0);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "jc.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final byte[] c(int param0) {
        byte[] var3 = new byte[this.field_f.capacity()];
        byte[] var2 = var3;
        this.field_f.position(0);
        if (param0 != 19707) {
          return (byte[]) null;
        }
        this.field_f.get(var3);
        return var3;
    }

    final static void a(int param0, bg param1, int param2) {
        lh var7 = null;
        lh var8 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var7 = nj.field_p;
          var8 = var7;
          var8.d(param0, -18392);
          var8.field_j = var8.field_j + 1;
          var4 = var8.field_j;
          var8.c(1, (byte) -93);
          var8.c(param1.field_i, -17402);
          var8.c(param1.field_u, -17402);
          var8.c(param1.field_m, -17402);
          var8.a(param1.field_o, (byte) 126);
          var8.a(param1.field_s, (byte) 107);
          if (param2 >= -93) {
            jc.c((byte) -14);
          }
          var8.a(param1.field_j, (byte) -112);
          var8.a(param1.field_h, (byte) -16);
          var8.c(param1.field_l.length, (byte) -111);
          for (var5 = 0; var5 < param1.field_l.length; var5++) {
            var7.a(param1.field_l[var5], (byte) 109);
          }
          var8.d(var4, (byte) 123);
          var8.b(-var4 + var8.field_j, (byte) 87);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "jc.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    jc() {
    }

    final static void a(nh param0, int param1, int param2, byte param3, int param4, int param5) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        var20 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var6_int = (param1 - param2 << 8) / param0.field_z;
          var7 = param0.field_D * var6_int + (param2 << 8);
          param4 = param4 + param0.field_v;
          param5 = param5 + param0.field_D;
          var8 = wj.field_k * param4 + param5;
          var9 = 0;
          var10 = param0.field_w;
          var11 = param0.field_y;
          if (param3 < 28) {
            jc.c((byte) -103);
          }
          var12 = wj.field_k - var11;
          var13 = 0;
          if (wj.field_e > param4) {
            var14 = wj.field_e - param4;
            var8 = var8 + wj.field_k * var14;
            param4 = wj.field_e;
            var9 = var9 + var14 * var11;
            var10 = var10 - var14;
          }
          if (var10 + param4 > wj.field_j) {
            var10 = var10 - (-wj.field_j + param4 + var10);
          }
          if (wj.field_g > param5) {
            var14Lifetime1 = wj.field_g - param5;
            var12 = var12 + var14Lifetime1;
            var11 = var11 - var14Lifetime1;
            param5 = wj.field_g;
            var13 = var13 + var14Lifetime1;
            var7 = var7 + var6_int * var14Lifetime1;
            var8 = var8 + var14Lifetime1;
            var9 = var9 + var14Lifetime1;
          }
          if (wj.field_b < var11 + param5) {
            var14Lifetime2 = var11 + param5 - wj.field_b;
            var13 = var13 + var14Lifetime2;
            var11 = var11 - var14Lifetime2;
            var12 = var12 + var14Lifetime2;
          }
          if (var11 > 0 &&
            var10 > 0) {
            for (param4 = -var10; 0 > param4; param4++) {
              var14Lifetime3 = var7;
              for (param5 = -var11; param5 < 0; param5++) {
                var15 = var14Lifetime3 >> 8;
                var14Lifetime3 = var14Lifetime3 + var6_int;
                var16 = 256 - var15;
                if (var15 >= 0) {
                  incrementValue$0 = var9;
                  var9++;
                  var17 = param0.field_B[incrementValue$0];
                  if (var17 != 0) {
                    if (var15 > 255) {
                      wj.field_l[var8] = var17;
                    } else {
                      var18 = wj.field_l[var8];
                      var19 = var16 * (16711935 & var18) + var15 * (var17 & 16711935) >> 8 & 16711935;
                      wj.field_l[var8] = (rk.a(rk.a(65280, var18) * var16 + var15 * rk.a(65280, var17), 16711720) >> 8) + var19;
                    }
                  }
                  var8++;
                } else {
                  var9++;
                  var8++;
                }
              }
              var8 = var8 + var12;
              var9 = var9 + var13;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_34_0 = var6;
          stackIn_34_1 = new StringBuilder().append("jc.D(");
          if (param0 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void c(byte param0) {
        field_h = null;
        if (param0 <= 24) {
          field_i = -53;
        }
    }

    static {
        field_j = 0;
        field_h = new int[8192];
    }
}
