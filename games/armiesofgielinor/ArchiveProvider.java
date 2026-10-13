/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ArchiveProvider {
    static String field_b;
    static MapRepository mapRepository;
    static int[] field_a;
    static ClientUiComponent field_d;
    static String field_c;

    final static nj a(byte param0, RgbSprite param1) {
        int var9 = 0;
        int var19 = 0;
        nj stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        nj var7 = null;
        int[] var8 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var20 = 0;
        String var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int var13Lifetime1;
        int var18Lifetime1;
        var20 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var2_int = param1.pixelWidth;
          var3 = param1.pixelHeight;
          var4 = param1.pixels;
          var5 = var2_int >> 2;
          var6 = var3 >> 2;
          if (param0 != 107) {
            var21 = (String) null;
            ArchiveProvider.a((String) null, (byte) 84);
          }
          var7 = new nj(var5, var6);
          var23 = var7.pixels;
          var22 = var23;
          var8 = var22;
          for (var9 = 0; var3 > var9; var9 += 4) {
            var10 = var9 * var2_int;
            var11 = var5 * (var9 >> 2);
            var12 = 0;
            while (var2_int > var12) {
              var13 = 0;
              var14 = 0;
              var15 = 0;
              var16 = 0;
              var17 = 0;
              for (var18 = 0; var18 < 4; var18++) {
                for (var19 = 0; var19 < 4; var19++) {
                  var13Lifetime1 = var4[var19 + var2_int * var18 + var10];
                  if (var13Lifetime1 != 0) {
                    var17++;
                    var15 = var15 + (var13Lifetime1 & 255);
                    var16 = var16 + (65280 & var13Lifetime1);
                    var14 = var14 + (16711680 & var13Lifetime1);
                  }
                }
              }
              var18Lifetime1 = var17 << 4;
              if (var18Lifetime1 > 255) {
                var18Lifetime1 = 255;
              }
              if (var17 == 0) {
                var23[var11] = 0;
              } else {
                var8[var11] = oe.bitwiseOr(oe.bitwiseOr(rn.bitwiseAnd(var14 / var17, 16711680), oe.bitwiseOr(var18Lifetime1 << 24, rn.bitwiseAnd(255, var15 / var17))), rn.bitwiseAnd(var16 / var17, 65280));
              }
              var11++;
              var12 += 4;
              var10 += 4;
            }
          }
          stackIn_24_0 = var7;
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("ew.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    abstract ArchiveIndex getIndex(int obfuscationGuard);

    public static void a(boolean param0) {
        field_c = null;
        field_b = null;
        field_a = null;
        if (param0) {
          RgbSprite var2 = (RgbSprite) null;
          ArchiveProvider.a((byte) 24, (RgbSprite) null);
        }
        mapRepository = null;
        field_d = null;
    }

    final static rn a(String param0, byte param1) {
        int var6 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        String[] var4 = null;
        String[] var5 = null;
        String var7 = null;
        rn var8 = null;
        int var9 = 0;
        rn stackIn_3_0 = null;
        rn stackIn_7_0 = null;
        rn stackIn_11_0 = null;
        rn stackIn_17_0 = null;
        rn stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_3_0 = HotspotTextWidget.field_N;
            return stackIn_3_0;
          }
          if (var2_int > 255) {
            stackIn_7_0 = el.field_e;
            return stackIn_7_0;
          }
          var3 = 82 / ((param1 - 50) / 49);
          var4 = dj.splitText(32, '.', param0);
          if (var4.length < 2) {
            stackIn_11_0 = HotspotTextWidget.field_N;
            return stackIn_11_0;
          }
          var5 = var4;
          for (var6 = 0; var5.length > var6; var6++) {
            var7 = var5[var6];
            var8 = sb.a(var7, (byte) -107);
            if (var8 != null) {
              stackIn_17_0 = var8;
              return stackIn_17_0;
            }
          }
          stackIn_20_0 = SummonEvent.a(var4[-1 + var4.length], -19);
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("ew.E(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    abstract int getGroupProgress(int obfuscationGuard, int groupId);

    abstract byte[] getEncodedGroup(int groupId, int obfuscationGuard);

    static {
        field_b = "Start Game";
        field_a = new int[8192];
        field_c = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
