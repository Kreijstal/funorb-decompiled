/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport030 {
    static SceneWidget sceneWidgetState0023;
    private int[] integerArrayState0036;
    static MusicTrack[] musicTrackArrayState0001;
    private int integerState0183;
    static RawSound rawSoundState0006;
    private int integerState0184;
    private int integerState0185;
    private int integerState0186;
    static int[] integerArrayState0037;
    private int[] integerArrayState0038;

    public static void performAction0451(byte byteArgument1) {
        integerArrayState0037 = null;
        rawSoundState0006 = null;
        musicTrackArrayState0001 = null;
        sceneWidgetState0023 = null;
        if (byteArgument1 != -78) {
          musicTrackArrayState0001 = (MusicTrack[]) null;
        }
    }

    final int computeInteger0455(boolean booleanArgument1) {
        if (0 == this.integerState0185) {
          this.performAction0456(-1);
          this.integerState0185 = 256;
        }
        if (booleanArgument1) {
          return 55;
        }
        int integerLocal1 = this.integerState0185 - 1;
        this.integerState0185 = this.integerState0185 - 1;
        return this.integerArrayState0038[integerLocal1];
    }

    private final void performAction0456(int integerArgument1) {
        int integerLocal1 = 0;
        int cachedIntegerLocal2 = 0;
        int cachedIntegerLocal3 = 0;
        int integerLocal4;
        int integerLocal5;
        int integerLocal6;
        integerLocal6 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (integerArgument1 != -1) {
          this.integerArrayState0036 = (int[]) null;
        }
        int integerLocal7 = this.integerState0186 + 1;
        this.integerState0186 = this.integerState0186 + 1;
        this.integerState0184 = this.integerState0184 + integerLocal7;
        for (integerLocal1 = 0; 256 > integerLocal1; integerLocal1++) {
          integerLocal4 = this.integerArrayState0036[integerLocal1];
          if (0 == (integerLocal1 & 2)) {
            if ((integerLocal1 & 1) != 0) {
              this.integerState0183 = this.integerState0183 ^ this.integerState0183 >>> 6;
            } else {
              this.integerState0183 = this.integerState0183 ^ this.integerState0183 << 13;
            }
          } else {
            if ((integerLocal1 & 1) == 0) {
              this.integerState0183 = this.integerState0183 ^ this.integerState0183 << 2;
            } else {
              this.integerState0183 = this.integerState0183 ^ this.integerState0183 >>> 16;
            }
          }
          this.integerState0183 = this.integerState0183 + this.integerArrayState0036[128 + integerLocal1 & 255];
          cachedIntegerLocal2 = this.integerState0184 + this.integerState0183 + this.integerArrayState0036[MixedSupport079.computeInteger1051(1020, integerLocal4) >> 2];
          integerLocal5 = cachedIntegerLocal2;
          this.integerArrayState0036[integerLocal1] = cachedIntegerLocal2;
          cachedIntegerLocal3 = integerLocal4 + this.integerArrayState0036[MixedSupport079.computeInteger1051(255, integerLocal5 >> 8 >> 2)];
          this.integerState0184 = cachedIntegerLocal3;
          this.integerArrayState0038[integerLocal1] = cachedIntegerLocal3;
        }
    }

    final int computeInteger0454(int integerArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        if (0 >= integerArgument2) {
          throw new IllegalArgumentException();
        }
        int integerLocal2 = -(int)(4294967296L % (long)integerArgument2) + 2147483647;
        if (integerArgument1 < 71) {
          musicTrackArrayState0001 = (MusicTrack[]) null;
        }
        while (true) {
          integerLocal1 = this.computeInteger0455(false);
          if (integerLocal1 <= integerLocal2) {
            break;
          }
        }
        return ReturnedShapeCache.computeInteger1349(integerArgument2, 83, integerLocal1);
    }

    private final void performAction0453(int integerArgument1) {
        int integerLocal1 = 0;
        int integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        int integerLocal3 = -1640531527;
        int integerLocal4 = -1640531527;
        int integerLocal5 = -1640531527;
        int integerLocal6 = -1640531527;
        int integerLocal7;
        int integerLocal8;
        if (integerArgument1 != 8388607) {
          this.integerState0184 = -27;
        }
        int integerLocal9 = -1640531527;
        int integerLocal10 = -1640531527;
        int integerLocal11 = -1640531527;
        int integerLocal12 = -1640531527;
        for (integerLocal1 = 0; 4 > integerLocal1; integerLocal1++) {
          integerLocal10 = integerLocal10 ^ integerLocal5 << 11;
          integerLocal5 = integerLocal5 + integerLocal6;
          integerLocal3 = integerLocal3 + integerLocal10;
          integerLocal5 = integerLocal5 ^ integerLocal6 >>> 2;
          integerLocal4 = integerLocal4 + integerLocal5;
          integerLocal6 = integerLocal6 + integerLocal3;
          integerLocal6 = integerLocal6 ^ integerLocal3 << 8;
          integerLocal11 = integerLocal11 + integerLocal6;
          integerLocal3 = integerLocal3 + integerLocal4;
          integerLocal3 = integerLocal3 ^ integerLocal4 >>> 16;
          integerLocal12 = integerLocal12 + integerLocal3;
          integerLocal4 = integerLocal4 + integerLocal11;
          integerLocal4 = integerLocal4 ^ integerLocal11 << 10;
          integerLocal9 = integerLocal9 + integerLocal4;
          integerLocal11 = integerLocal11 + integerLocal12;
          integerLocal11 = integerLocal11 ^ integerLocal12 >>> 4;
          integerLocal10 = integerLocal10 + integerLocal11;
          integerLocal12 = integerLocal12 + integerLocal9;
          integerLocal12 = integerLocal12 ^ integerLocal9 << 8;
          integerLocal5 = integerLocal5 + integerLocal12;
          integerLocal9 = integerLocal9 + integerLocal10;
          integerLocal9 = integerLocal9 ^ integerLocal10 >>> 9;
          integerLocal6 = integerLocal6 + integerLocal9;
          integerLocal10 = integerLocal10 + integerLocal5;
        }
        for (integerLocal7 = 0; integerLocal7 < 256; integerLocal7 += 8) {
          integerLocal9 = integerLocal9 + this.integerArrayState0038[7 + integerLocal7];
          integerLocal3 = integerLocal3 + this.integerArrayState0038[3 + integerLocal7];
          integerLocal12 = integerLocal12 + this.integerArrayState0038[6 + integerLocal7];
          integerLocal4 = integerLocal4 + this.integerArrayState0038[4 + integerLocal7];
          integerLocal5 = integerLocal5 + this.integerArrayState0038[integerLocal7 + 1];
          integerLocal11 = integerLocal11 + this.integerArrayState0038[5 + integerLocal7];
          integerLocal10 = integerLocal10 + this.integerArrayState0038[integerLocal7];
          integerLocal6 = integerLocal6 + this.integerArrayState0038[2 + integerLocal7];
          integerLocal10 = integerLocal10 ^ integerLocal5 << 11;
          integerLocal3 = integerLocal3 + integerLocal10;
          integerLocal5 = integerLocal5 + integerLocal6;
          integerLocal5 = integerLocal5 ^ integerLocal6 >>> 2;
          integerLocal4 = integerLocal4 + integerLocal5;
          integerLocal6 = integerLocal6 + integerLocal3;
          integerLocal6 = integerLocal6 ^ integerLocal3 << 8;
          integerLocal3 = integerLocal3 + integerLocal4;
          integerLocal11 = integerLocal11 + integerLocal6;
          integerLocal3 = integerLocal3 ^ integerLocal4 >>> 16;
          integerLocal12 = integerLocal12 + integerLocal3;
          integerLocal4 = integerLocal4 + integerLocal11;
          integerLocal4 = integerLocal4 ^ integerLocal11 << 10;
          integerLocal9 = integerLocal9 + integerLocal4;
          integerLocal11 = integerLocal11 + integerLocal12;
          integerLocal11 = integerLocal11 ^ integerLocal12 >>> 4;
          integerLocal10 = integerLocal10 + integerLocal11;
          integerLocal12 = integerLocal12 + integerLocal9;
          integerLocal12 = integerLocal12 ^ integerLocal9 << 8;
          integerLocal5 = integerLocal5 + integerLocal12;
          integerLocal9 = integerLocal9 + integerLocal10;
          integerLocal9 = integerLocal9 ^ integerLocal10 >>> 9;
          integerLocal10 = integerLocal10 + integerLocal5;
          integerLocal6 = integerLocal6 + integerLocal9;
          this.integerArrayState0036[integerLocal7] = integerLocal10;
          this.integerArrayState0036[integerLocal7 + 1] = integerLocal5;
          this.integerArrayState0036[integerLocal7 + 2] = integerLocal6;
          this.integerArrayState0036[3 + integerLocal7] = integerLocal3;
          this.integerArrayState0036[4 + integerLocal7] = integerLocal4;
          this.integerArrayState0036[5 + integerLocal7] = integerLocal11;
          this.integerArrayState0036[integerLocal7 + 6] = integerLocal12;
          this.integerArrayState0036[integerLocal7 + 7] = integerLocal9;
        }
        for (integerLocal8 = 0; integerLocal8 < 256; integerLocal8 += 8) {
          integerLocal9 = integerLocal9 + this.integerArrayState0036[integerLocal8 + 7];
          integerLocal3 = integerLocal3 + this.integerArrayState0036[3 + integerLocal8];
          integerLocal5 = integerLocal5 + this.integerArrayState0036[1 + integerLocal8];
          integerLocal10 = integerLocal10 + this.integerArrayState0036[integerLocal8];
          integerLocal11 = integerLocal11 + this.integerArrayState0036[5 + integerLocal8];
          integerLocal6 = integerLocal6 + this.integerArrayState0036[integerLocal8 + 2];
          integerLocal12 = integerLocal12 + this.integerArrayState0036[6 + integerLocal8];
          integerLocal4 = integerLocal4 + this.integerArrayState0036[4 + integerLocal8];
          integerLocal10 = integerLocal10 ^ integerLocal5 << 11;
          integerLocal3 = integerLocal3 + integerLocal10;
          integerLocal5 = integerLocal5 + integerLocal6;
          integerLocal5 = integerLocal5 ^ integerLocal6 >>> 2;
          integerLocal4 = integerLocal4 + integerLocal5;
          integerLocal6 = integerLocal6 + integerLocal3;
          integerLocal6 = integerLocal6 ^ integerLocal3 << 8;
          integerLocal3 = integerLocal3 + integerLocal4;
          integerLocal11 = integerLocal11 + integerLocal6;
          integerLocal3 = integerLocal3 ^ integerLocal4 >>> 16;
          integerLocal4 = integerLocal4 + integerLocal11;
          integerLocal12 = integerLocal12 + integerLocal3;
          integerLocal4 = integerLocal4 ^ integerLocal11 << 10;
          integerLocal9 = integerLocal9 + integerLocal4;
          integerLocal11 = integerLocal11 + integerLocal12;
          integerLocal11 = integerLocal11 ^ integerLocal12 >>> 4;
          integerLocal12 = integerLocal12 + integerLocal9;
          integerLocal10 = integerLocal10 + integerLocal11;
          integerLocal12 = integerLocal12 ^ integerLocal9 << 8;
          integerLocal9 = integerLocal9 + integerLocal10;
          integerLocal5 = integerLocal5 + integerLocal12;
          integerLocal9 = integerLocal9 ^ integerLocal10 >>> 9;
          integerLocal10 = integerLocal10 + integerLocal5;
          integerLocal6 = integerLocal6 + integerLocal9;
          this.integerArrayState0036[integerLocal8] = integerLocal10;
          this.integerArrayState0036[1 + integerLocal8] = integerLocal5;
          this.integerArrayState0036[integerLocal8 + 2] = integerLocal6;
          this.integerArrayState0036[3 + integerLocal8] = integerLocal3;
          this.integerArrayState0036[integerLocal8 + 4] = integerLocal4;
          this.integerArrayState0036[5 + integerLocal8] = integerLocal11;
          this.integerArrayState0036[6 + integerLocal8] = integerLocal12;
          this.integerArrayState0036[7 + integerLocal8] = integerLocal9;
        }
        this.performAction0456(-1);
        this.integerState0185 = 256;
    }

    final static boolean computeBoolean0452(byte byteArgument1, boolean booleanArgument2, int integerArgument3, int integerArgument4) {
        int integerLocal1;
        int integerLocal2;
        if (booleanArgument2) {
          if (ResourceSupport001.integerArrayState0012[integerArgument4] < ResourceSupport001.integerArrayState0012[integerArgument3]) {
            return true;
          }
          if (ResourceSupport001.integerArrayState0012[integerArgument3] < ResourceSupport001.integerArrayState0012[integerArgument4]) {
            return false;
          }
          if (MixedSupport015.integerArrayState0020[integerArgument4] < MixedSupport015.integerArrayState0020[integerArgument3]) {
            return true;
          }
          if (MixedSupport015.integerArrayState0020[integerArgument4] > MixedSupport015.integerArrayState0020[integerArgument3]) {
            return false;
          }
        } else {
          if (MixedSupport015.integerArrayState0020[integerArgument4] < MixedSupport015.integerArrayState0020[integerArgument3]) {
            return true;
          }
          if (MixedSupport015.integerArrayState0020[integerArgument4] > MixedSupport015.integerArrayState0020[integerArgument3]) {
            return false;
          }
          if (ResourceSupport001.integerArrayState0012[integerArgument4] < ResourceSupport001.integerArrayState0012[integerArgument3]) {
            return true;
          }
          if (ResourceSupport001.integerArrayState0012[integerArgument4] > ResourceSupport001.integerArrayState0012[integerArgument3]) {
            return false;
          }
        }
        integerLocal1 = MixedSupport084.integerArrayState0150[integerArgument4] + (MixedSupport094.integerArrayState0173[integerArgument4] + MixedSupport086.integerArrayState0157[integerArgument4]);
        integerLocal2 = MixedSupport086.integerArrayState0157[integerArgument3] + MixedSupport084.integerArrayState0150[integerArgument3] + MixedSupport094.integerArrayState0173[integerArgument3];
        if (integerLocal2 > integerLocal1) {
          return true;
        }
        if (integerLocal1 > integerLocal2) {
          return false;
        }
        if (byteArgument1 <= 97) {
          return false;
        }
        return !(integerArgument4 >= integerArgument3);
    }

    MixedSupport030(int[] integerArrayArgument1) {
        int integerLocal1 = 0;
        try {
          this.integerArrayState0036 = new int[256];
          this.integerArrayState0038 = new int[256];
          for (integerLocal1 = 0; integerLocal1 < integerArrayArgument1.length; integerLocal1++) {
            this.integerArrayState0038[integerLocal1] = integerArrayArgument1[integerLocal1];
          }
          this.performAction0453(8388607);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "ee.<init>(" + (integerArrayArgument1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        musicTrackArrayState0001 = new MusicTrack[4];
        integerArrayState0037 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
