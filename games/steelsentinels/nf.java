/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf {
    static hk field_b;
    static String field_d;
    static sg field_c;
    static kg field_a;

    final static int a(int[] param0, int param1, byte param2) {
        int stackIn_9_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var11 = null;
        int var5Lifetime1;
        var7 = SteelSentinels.obfuscationControl;
        try {
          if (param0[0] != 0) {
            if (param0[0] != 55) {
              stackIn_9_0 = (param0[0] == 57) ? 1 : 0;
            } else {
              stackIn_9_0 = 1;
            }
          } else {
            stackIn_9_0 = 1;
          }
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted0 = true;
          var3_int = stackIn_9_0;
          if (var3_int != 0) {
            var11 = nl.a(param0[0], (byte) 124);
            if (var11.length == param0.length) {
              var5 = 0;
              boolean decompiledNaturalLoopExit0 = false;
              while (!(decompiledNaturalLoopExit0 = (var5 >= param0.length))) {
                if (param0[var5] == var11[var5]) {
                  var5++;
                  continue;
                }
                break;
              }
              if (decompiledNaturalLoopExit0) {
                decompiledFrameCompleted0 = false;
              }
              if (decompiledFrameCompleted0) {
                var3_int = 0;
                decompiledFrameRemainder0 = false;
              }
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0)) {
              var3_int = 0;
            }
          }
          var4 = nn.a(param0, (byte) 78);
          if (param2 != 44) {
            field_a = (kg) null;
          }
          stackIn_22_0 = (var4 > 6100) ? 0 : 1;
          var5Lifetime1 = stackIn_22_0;
          var6 = 4;
          if (var3_int != 0) {
            var6 = var6 | 1;
          }
          if (var5Lifetime1 != 0) {
            var6 = var6 | 2;
          }
          stackIn_28_0 = var6;
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("nf.C(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        field_d = null;
        if (param0 != 55) {
          nf.a(-99);
        }
    }

    final static void a(boolean param0, PacketBuffer param1, java.math.BigInteger param2, int param3, int param4, java.math.BigInteger param5, byte[] param6) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        byte[] var11 = null;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int var9Lifetime1;
        var10 = SteelSentinels.obfuscationControl;
        try {
          var7_int = me.a(param4, -97);
          if (null == hb.field_c) {
            hb.field_c = new java.security.SecureRandom();
          }
          var14 = new int[4];
          var13 = var14;
          var8 = var13;
          for (var9 = 0; var9 < 4; var9++) {
            var8[var9] = hb.field_c.nextInt();
          }
          if (hj.field_H == null ||
            !(hj.field_H.payload.length >= var7_int)) {
            hj.field_H = new PacketBuffer(var7_int);
          }
          hj.field_H.position = 0;
          hj.field_H.a(param4, (byte) -122, param3, param6);
          hj.field_H.b(-2, var7_int);
          hj.field_H.a(var14, -108);
          if (sj.field_u == null ||
            !(sj.field_u.payload.length >= 100)) {
            sj.field_u = new PacketBuffer(100);
          }
          sj.field_u.position = 0;
          sj.field_u.a((byte) 122, 10);
          var12 = 0;
          var9Lifetime1 = var12;
          if (param0) {
            var11 = (byte[]) null;
            nf.a(true, (PacketBuffer) null, (java.math.BigInteger) null, -45, 111, (java.math.BigInteger) null, (byte[]) null);
          }
          while (var12 < 4) {
            sj.field_u.b(true, var14[var12]);
            var12++;
          }
          sj.field_u.d(param4, 17);
          sj.field_u.a(param2, param5, -10048);
          param1.a(sj.field_u.position, (byte) -122, 0, sj.field_u.payload);
          param1.a(hj.field_H.position, (byte) -122, 0, hj.field_H.payload);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_23_0 = var7;
          stackIn_23_1 = new StringBuilder().append("nf.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param6 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    static {
        field_d = "Solicitation";
    }
}
