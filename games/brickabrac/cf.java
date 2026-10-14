/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf {
    static byte[][] field_b;
    static int decodedCanvasWidth;
    static int checksumMismatchCount;
    static int[] rankingSourceIndices;

    final static PauseMenuScreen createPauseMenu(int screenId, int obfuscationGuard) {
        Object var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var10 = null;
        int[] var9 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int var4 = 0;
        Object var5 = null;
        int var4Lifetime1;
        if (obfuscationGuard != -2635) {
          cf.a(-1);
          var6 = null;
          var4 = screenId;
          if (var4 == 1) {
            var7 = new int[]{2, 20, 21, 36, 5, 9};
            var8 = new int[]{2, 20, 21, 36, 6, 5, 9};
            return new PauseMenuScreen(screenId, var7, var8);
          }
          if (var4 != 17) {
            if (var4 == 2) {
              var11 = new int[]{2, 20, 21, 11, 13};
              var12 = new int[]{2, 20, 21, 6, 11, 13};
              return new PauseMenuScreen(screenId, var11, var12);
            }
            if (var4 == 3) {
              var13 = new int[]{2, 20, 21, 12, 13};
              var14 = new int[]{2, 20, 21, 6, 12, 13};
              return new PauseMenuScreen(screenId, var13, var14);
            }
            if (var4 == 4) {
              var15 = new int[]{2, 20, 21, 13};
              var16 = new int[]{2, 20, 21, 6, 13};
              return new PauseMenuScreen(screenId, var15, var16);
            }
            return new PauseMenuScreen(screenId, (int[]) (var5), (int[]) (var6));
          }
          var10 = new int[]{2, 20, 21, 6, 5, 9};
          var9 = new int[]{2, 20, 21, 5, 9};
          return new PauseMenuScreen(screenId, var9, var10);
        }
        Object var17 = null;
        var4Lifetime1 = screenId;
        if (var4Lifetime1 == 1) {
          var18 = new int[]{2, 20, 21, 36, 5, 9};
          var19 = new int[]{2, 20, 21, 36, 6, 5, 9};
          return new PauseMenuScreen(screenId, var18, var19);
        }
        if (var4Lifetime1 != 17) {
          if (var4Lifetime1 == 2) {
            var22 = new int[]{2, 20, 21, 11, 13};
            var23 = new int[]{2, 20, 21, 6, 11, 13};
            return new PauseMenuScreen(screenId, var22, var23);
          }
          if (var4Lifetime1 == 3) {
            var24 = new int[]{2, 20, 21, 12, 13};
            var25 = new int[]{2, 20, 21, 6, 12, 13};
            return new PauseMenuScreen(screenId, var24, var25);
          }
          if (var4Lifetime1 == 4) {
            var26 = new int[]{2, 20, 21, 13};
            var27 = new int[]{2, 20, 21, 6, 13};
            return new PauseMenuScreen(screenId, var26, var27);
          }
          return new PauseMenuScreen(screenId, (int[]) (var5), (int[]) (var17));
        }
        int[] var21 = new int[]{2, 20, 21, 6, 5, 9};
        int[] var20 = new int[]{2, 20, 21, 5, 9};
        return new PauseMenuScreen(screenId, var20, var21);
    }

    final static boolean a(byte param0) {
        if (param0 == 62) {
          return 2 <= QuickChatHelpDialog.field_Yb ? true : false;
        }
        cf.a((byte) 59);
        return 2 <= QuickChatHelpDialog.field_Yb ? true : false;
    }

    public static void a(int param0) {
        field_b = (byte[][]) null;
        if (param0 != -12251) {
          cf.a((byte) -13);
          rankingSourceIndices = null;
          return;
        }
        rankingSourceIndices = null;
    }

    static {
        field_b = new byte[1000][];
    }
}
