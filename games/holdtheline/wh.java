/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh extends vd {
    private int field_g;
    private int field_h;
    private int field_f;

    final static void a(byte param0) {
        if (!ci.field_o) {
          throw new IllegalStateException();
        }
        int var1 = 102 / ((24 - param0) / 33);
        if (null != sb.field_c) {
          sb.field_c.h((byte) -93);
        }
        String var2 = ch.a(false);
        lh.field_a = new vg(var2, (String) null, true, false, false);
        ka.field_b.a(sm.field_c, false);
        sm.field_c.a((n) (lh.field_a), (byte) 13);
        sm.field_c.b(false);
    }

    final void a(float param0, int[] param1, int param2, int[] param3, byte param4) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int var7Lifetime1;
        int var7Lifetime2;
        var12 = HoldTheLine.field_D;
        try {
          var13 = new int[param1.length + param3.length];
          var15 = var13;
          var14 = var15;
          var6 = var14;
          for (var7 = 0; var7 < param3.length; var7++) {
            var13[var7] = param3[var7];
          }
          for (var7Lifetime1 = 0; var7Lifetime1 < param1.length / 2; var7Lifetime1++) {
            var6[param3.length + var7Lifetime1 * 2] = param1[-(var7Lifetime1 * 2) + (-2 + param1.length)];
            var6[2 * var7Lifetime1 + (param3.length + 1)] = param1[-1 + (param1.length - 2 * var7Lifetime1)];
          }
          if (this.field_h != 256) {
            dl.a(var15, (byte) -127, this.field_h, this.field_g);
          } else {
            gf.a(var15, this.field_g);
          }
          if (param4 != 49) {
            this.field_f = -37;
          }
          var8 = var6[-2 + var15.length];
          var9 = var6[-1 + var15.length];
          for (var7Lifetime2 = 0; var7Lifetime2 < var15.length; var7Lifetime2 += 2) {
            var10 = var15[var7Lifetime2];
            var11 = var6[var7Lifetime2 + 1];
            tc.d(var8, var9, var10, var11, this.field_f);
            var8 = var10;
            var9 = var11;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_18_0 = var6_ref;
          stackIn_18_1 = new StringBuilder().append("wh.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param4).append(')').toString());
        }
    }

    wh(int param0, int param1, int param2) {
        this.field_h = param2;
        this.field_f = param1;
        this.field_g = param0;
    }

    static {
    }
}
