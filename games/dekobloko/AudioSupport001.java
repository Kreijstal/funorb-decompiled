/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AudioSupport001 {
    private static float floatState0003;
    private int[][][] integerArrayArrayArrayState0001;
    private int[] integerArrayState0056;
    private int[][][] integerArrayArrayArrayState0002;
    static int integerState0279;
    int[] integerArrayState0057;
    private static float[][] floatArrayArrayState0001;
    static int[][] integerArrayArrayState0009;

    private final float computeFloat0715(int integerArgument1, int integerArgument2, float floatArgument3) {
        float floatLocal1 = (float)this.integerArrayArrayArrayState0001[integerArgument1][0][integerArgument2] + floatArgument3 * (float)(this.integerArrayArrayArrayState0001[integerArgument1][1][integerArgument2] - this.integerArrayArrayArrayState0001[integerArgument1][0][integerArgument2]);
        floatLocal1 = floatLocal1 * 0.00152587890625f;
        return 1.0f - (float)Math.pow(10.0, (double)(-floatLocal1 / 20.0f));
    }

    final void performAction0714(PacketBuffer packetBufferArgument1, MixedSupport119 mixedSupport119Argument2) {
        int integerLocal1;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        int[] integerArrayLocal6;
        int integerLocal7;
        int integerLocal8;
        integerLocal1 = packetBufferArgument1.computeInteger2085((byte) -53);
        this.integerArrayState0057[0] = integerLocal1 >> 4;
        this.integerArrayState0057[1] = integerLocal1 & 15;
        if (integerLocal1 != 0) {
          this.integerArrayState0056[0] = packetBufferArgument1.computeInteger2089(3);
          this.integerArrayState0056[1] = packetBufferArgument1.computeInteger2089(3);
          integerLocal2 = packetBufferArgument1.computeInteger2085((byte) -21);
          for (integerLocal3 = 0; integerLocal3 < 2; integerLocal3++) {
            for (integerLocal4 = 0; integerLocal4 < this.integerArrayState0057[integerLocal3]; integerLocal4++) {
              this.integerArrayArrayArrayState0002[integerLocal3][0][integerLocal4] = packetBufferArgument1.computeInteger2089(3);
              this.integerArrayArrayArrayState0001[integerLocal3][0][integerLocal4] = packetBufferArgument1.computeInteger2089(3);
            }
          }
          for (integerLocal7 = 0; integerLocal7 < 2; integerLocal7++) {
            integerLocal5 = 0;
            integerLocal8 = integerLocal5;
            while (integerLocal5 < this.integerArrayState0057[integerLocal7]) {
              if ((integerLocal2 & 1 << integerLocal7 * 4 << integerLocal5) == 0) {
                this.integerArrayArrayArrayState0002[integerLocal7][1][integerLocal5] = this.integerArrayArrayArrayState0002[integerLocal7][0][integerLocal5];
                this.integerArrayArrayArrayState0001[integerLocal7][1][integerLocal5] = this.integerArrayArrayArrayState0001[integerLocal7][0][integerLocal5];
              } else {
                this.integerArrayArrayArrayState0002[integerLocal7][1][integerLocal5] = packetBufferArgument1.computeInteger2089(3);
                this.integerArrayArrayArrayState0001[integerLocal7][1][integerLocal5] = packetBufferArgument1.computeInteger2089(3);
              }
              integerLocal5++;
            }
          }
          if (integerLocal2 != 0 ||
            this.integerArrayState0056[1] != this.integerArrayState0056[0]) {
            mixedSupport119Argument2.performAction1685(packetBufferArgument1);
          }
        } else {
          integerArrayLocal6 = this.integerArrayState0056;
          this.integerArrayState0056[1] = 0;
          integerArrayLocal6[0] = 0;
        }
    }

    final int computeInteger0712(int integerArgument1, float floatArgument2) {
        float floatLocal1 = 0.0f;
        float floatLocal2 = 0.0f;
        int integerLocal3 = 0;
        float[] cachedFloatArrayLocal4 = null;
        float[] cachedFloatArrayLocal5 = null;
        float[] cachedFloatArrayLocal6 = null;
        float[] cachedFloatArrayLocal7 = null;
        float floatLocal8 = 0.0f;
        int integerLocal9 = 0;
        float floatLocal10;
        float floatLocal11;
        int integerLocal12;
        int integerLocal13;
        if (integerArgument1 == 0) {
          floatLocal8 = (float)this.integerArrayState0056[0] + (float)(this.integerArrayState0056[1] - this.integerArrayState0056[0]) * floatArgument2;
          floatLocal8 = floatLocal8 * 0.0030517578125f;
          floatState0003 = (float)Math.pow(0.1, (double)(floatLocal8 / 20.0f));
          integerState0279 = (int)(floatState0003 * 65536.0f);
        }
        if (this.integerArrayState0057[integerArgument1] == 0) {
          return 0;
        }
        floatLocal10 = this.computeFloat0715(integerArgument1, 0, floatArgument2);
        floatArrayArrayState0001[integerArgument1][0] = -2.0f * floatLocal10 * (float)Math.cos((double)this.computeFloat0713(integerArgument1, 0, floatArgument2));
        floatArrayArrayState0001[integerArgument1][1] = floatLocal10 * floatLocal10;
        for (integerLocal9 = 1; integerLocal9 < this.integerArrayState0057[integerArgument1]; integerLocal9++) {
          floatLocal11 = this.computeFloat0715(integerArgument1, integerLocal9, floatArgument2);
          floatLocal1 = -2.0f * floatLocal11 * (float)Math.cos((double)this.computeFloat0713(integerArgument1, integerLocal9, floatArgument2));
          floatLocal2 = floatLocal11 * floatLocal11;
          floatArrayArrayState0001[integerArgument1][integerLocal9 * 2 + 1] = floatArrayArrayState0001[integerArgument1][integerLocal9 * 2 - 1] * floatLocal2;
          floatArrayArrayState0001[integerArgument1][integerLocal9 * 2] = floatArrayArrayState0001[integerArgument1][integerLocal9 * 2 - 1] * floatLocal1 + floatArrayArrayState0001[integerArgument1][integerLocal9 * 2 - 2] * floatLocal2;
          for (integerLocal3 = integerLocal9 * 2 - 1; integerLocal3 >= 2; integerLocal3--) {
            cachedFloatArrayLocal4 = floatArrayArrayState0001[integerArgument1];
            cachedFloatArrayLocal4[integerLocal3] = cachedFloatArrayLocal4[integerLocal3] + (floatArrayArrayState0001[integerArgument1][integerLocal3 - 1] * floatLocal1 + floatArrayArrayState0001[integerArgument1][integerLocal3 - 2] * floatLocal2);
          }
          cachedFloatArrayLocal5 = floatArrayArrayState0001[integerArgument1];
          cachedFloatArrayLocal5[1] = cachedFloatArrayLocal5[1] + (floatArrayArrayState0001[integerArgument1][0] * floatLocal1 + floatLocal2);
          cachedFloatArrayLocal6 = floatArrayArrayState0001[integerArgument1];
          cachedFloatArrayLocal6[0] = cachedFloatArrayLocal6[0] + floatLocal1;
        }
        if (integerArgument1 == 0) {
          for (integerLocal12 = 0; integerLocal12 < this.integerArrayState0057[0] * 2; integerLocal12++) {
            cachedFloatArrayLocal7 = floatArrayArrayState0001[0];
            cachedFloatArrayLocal7[integerLocal12] = cachedFloatArrayLocal7[integerLocal12] * floatState0003;
          }
        }
        for (integerLocal13 = 0; integerLocal13 < this.integerArrayState0057[integerArgument1] * 2; integerLocal13++) {
          integerArrayArrayState0009[integerArgument1][integerLocal13] = (int)(floatArrayArrayState0001[integerArgument1][integerLocal13] * 65536.0f);
        }
        return this.integerArrayState0057[integerArgument1] * 2;
    }

    private final static float computeFloat0711(float floatArgument1) {
        float floatLocal1 = 32.70319747924805f * (float)Math.pow(2.0, (double)floatArgument1);
        return floatLocal1 * 3.1415927410125732f / 11025.0f;
    }

    public static void performAction0710() {
        floatArrayArrayState0001 = (float[][]) null;
        integerArrayArrayState0009 = (int[][]) null;
    }

    private final float computeFloat0713(int integerArgument1, int integerArgument2, float floatArgument3) {
        float floatLocal1 = (float)this.integerArrayArrayArrayState0002[integerArgument1][0][integerArgument2] + floatArgument3 * (float)(this.integerArrayArrayArrayState0002[integerArgument1][1][integerArgument2] - this.integerArrayArrayArrayState0002[integerArgument1][0][integerArgument2]);
        floatLocal1 = floatLocal1 * 0.0001220703125f;
        return AudioSupport001.computeFloat0711(floatLocal1);
    }

    AudioSupport001() {
        this.integerArrayArrayArrayState0001 = new int[2][2][4];
        this.integerArrayState0056 = new int[2];
        this.integerArrayArrayArrayState0002 = new int[2][2][4];
        this.integerArrayState0057 = new int[2];
    }

    static {
        floatArrayArrayState0001 = new float[2][8];
        integerArrayArrayState0009 = new int[2][8];
    }
}
