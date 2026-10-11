/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class AudioSupport003 {
    private AudioSupport001 audioSupport001State0001;
    int integerState0388;
    private MixedSupport119 mixedSupport119State0001;
    private MixedSupport119 mixedSupport119State0002;
    private MixedSupport119 mixedSupport119State0003;
    private static int[] integerArrayState0124;
    private MixedSupport119 mixedSupport119State0004;
    private MixedSupport119 mixedSupport119State0005;
    private static int[] integerArrayState0125;
    private int[] integerArrayState0126;
    private MixedSupport119 mixedSupport119State0006;
    private MixedSupport119 mixedSupport119State0007;
    private MixedSupport119 mixedSupport119State0008;
    int integerState0389;
    private int[] integerArrayState0127;
    private int integerState0390;
    private static int[] integerArrayState0128;
    private int[] integerArrayState0129;
    private MixedSupport119 mixedSupport119State0009;
    private static int[] integerArrayState0130;
    private int integerState0391;
    private static int[] integerArrayState0131;
    private static int[] integerArrayState0132;
    private static int[] integerArrayState0133;
    private static int[] integerArrayState0134;

    public static void performAction1026() {
        integerArrayState0124 = null;
        integerArrayState0128 = null;
        integerArrayState0125 = null;
        integerArrayState0130 = null;
        integerArrayState0131 = null;
        integerArrayState0133 = null;
        integerArrayState0132 = null;
        integerArrayState0134 = null;
    }

    final int[] computeIntegerArray1027(int integerArgument1, int integerArgument2) {
        int stackIntegerLocal1 = 0;
        double doubleLocal2;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        int integerLocal6;
        int integerLocal7;
        int integerLocal8;
        int integerLocal9;
        int integerLocal10;
        int integerLocal11;
        int integerLocal12;
        int integerLocal13;
        int integerLocal14;
        int integerLocal15;
        int integerLocal16;
        int integerLocal17;
        int integerLocal18;
        int integerLocal19;
        int integerLocal20;
        int integerLocal21;
        int integerLocal22;
        int integerLocal23;
        int integerLocal24;
        int integerLocal25;
        int integerLocal26;
        int integerLocal27;
        int integerLocal28;
        int integerLocal29;
        int integerLocal30;
        int integerLocal31;
        int integerLocal32;
        int integerLocal33;
        int integerLocal34;
        int integerLocal35;
        int integerLocal36;
        int integerLocal37;
        int integerLocal38;
        int integerLocal39;
        int integerLocal40;
        int integerLocal41;
        int integerLocal42;
        int integerLocal43;
        MixedSupport008.performAction0083(integerArrayState0124, 0, integerArgument1);
        if (integerArgument2 < 10) {
          return integerArrayState0124;
        }
        doubleLocal2 = (double)integerArgument1 / ((double)integerArgument2 + 0.0);
        this.mixedSupport119State0001.performAction1683();
        this.mixedSupport119State0007.performAction1683();
        integerLocal3 = 0;
        integerLocal4 = 0;
        integerLocal5 = 0;
        if (this.mixedSupport119State0002 != null) {
          this.mixedSupport119State0002.performAction1683();
          this.mixedSupport119State0003.performAction1683();
          integerLocal3 = (int)((double)(this.mixedSupport119State0002.integerState0741 - this.mixedSupport119State0002.integerState0737) * 32.768 / doubleLocal2);
          integerLocal4 = (int)((double)this.mixedSupport119State0002.integerState0737 * 32.768 / doubleLocal2);
        }
        integerLocal6 = 0;
        integerLocal7 = 0;
        integerLocal8 = 0;
        if (this.mixedSupport119State0005 != null) {
          this.mixedSupport119State0005.performAction1683();
          this.mixedSupport119State0006.performAction1683();
          integerLocal6 = (int)((double)(this.mixedSupport119State0005.integerState0741 - this.mixedSupport119State0005.integerState0737) * 32.768 / doubleLocal2);
          integerLocal7 = (int)((double)this.mixedSupport119State0005.integerState0737 * 32.768 / doubleLocal2);
        }
        for (integerLocal9 = 0; integerLocal9 < 5; integerLocal9++) {
          if (this.integerArrayState0126[integerLocal9] != 0) {
            integerArrayState0130[integerLocal9] = 0;
            integerArrayState0131[integerLocal9] = (int)((double)this.integerArrayState0127[integerLocal9] * doubleLocal2);
            integerArrayState0133[integerLocal9] = (this.integerArrayState0126[integerLocal9] << 14) / 100;
            integerArrayState0132[integerLocal9] = (int)((double)(this.mixedSupport119State0001.integerState0741 - this.mixedSupport119State0001.integerState0737) * 32.768 * Math.pow(1.0057929410678534, (double)this.integerArrayState0129[integerLocal9]) / doubleLocal2);
            integerArrayState0134[integerLocal9] = (int)((double)this.mixedSupport119State0001.integerState0737 * 32.768 / doubleLocal2);
          }
        }
        for (integerLocal16 = 0; integerLocal16 < integerArgument1; integerLocal16++) {
          integerLocal10 = this.mixedSupport119State0001.computeInteger1684(integerArgument1);
          integerLocal11 = this.mixedSupport119State0007.computeInteger1684(integerArgument1);
          if (this.mixedSupport119State0002 != null) {
            integerLocal12 = this.mixedSupport119State0002.computeInteger1684(integerArgument1);
            integerLocal13 = this.mixedSupport119State0003.computeInteger1684(integerArgument1);
            integerLocal10 = integerLocal10 + (this.computeInteger1028(integerLocal5, integerLocal13, this.mixedSupport119State0002.integerState0739) >> 1);
            integerLocal5 = integerLocal5 + ((integerLocal12 * integerLocal3 >> 16) + integerLocal4);
          }
          if (this.mixedSupport119State0005 != null) {
            integerLocal31 = this.mixedSupport119State0005.computeInteger1684(integerArgument1);
            integerLocal33 = this.mixedSupport119State0006.computeInteger1684(integerArgument1);
            integerLocal11 = integerLocal11 * ((this.computeInteger1028(integerLocal8, integerLocal33, this.mixedSupport119State0005.integerState0739) >> 1) + 32768) >> 15;
            integerLocal8 = integerLocal8 + ((integerLocal31 * integerLocal6 >> 16) + integerLocal7);
          }
          for (integerLocal32 = 0; integerLocal32 < 5; integerLocal32++) {
            if (this.integerArrayState0126[integerLocal32] != 0) {
              integerLocal34 = integerLocal16 + integerArrayState0131[integerLocal32];
              if (integerLocal34 < integerArgument1) {
                integerArrayState0124[integerLocal34] = integerArrayState0124[integerLocal34] + this.computeInteger1028(integerArrayState0130[integerLocal32], integerLocal11 * integerArrayState0133[integerLocal32] >> 15, this.mixedSupport119State0001.integerState0739);
                integerArrayState0130[integerLocal32] = integerArrayState0130[integerLocal32] + ((integerLocal10 * integerArrayState0132[integerLocal32] >> 16) + integerArrayState0134[integerLocal32]);
              }
            }
          }
        }
        if (this.mixedSupport119State0004 != null) {
          this.mixedSupport119State0004.performAction1683();
          this.mixedSupport119State0008.performAction1683();
          integerLocal17 = 0;
          integerLocal21 = 0;
          integerLocal24 = 1;
          for (integerLocal26 = 0; integerLocal26 < integerArgument1; integerLocal26++) {
            integerLocal28 = this.mixedSupport119State0004.computeInteger1684(integerArgument1);
            integerLocal14 = this.mixedSupport119State0008.computeInteger1684(integerArgument1);
            if (integerLocal24 == 0) {
              integerLocal37 = this.mixedSupport119State0004.integerState0737 + ((this.mixedSupport119State0004.integerState0741 - this.mixedSupport119State0004.integerState0737) * integerLocal14 >> 8);
            } else {
              integerLocal37 = this.mixedSupport119State0004.integerState0737 + ((this.mixedSupport119State0004.integerState0741 - this.mixedSupport119State0004.integerState0737) * integerLocal28 >> 8);
            }
            integerLocal17 += 256;
            if (integerLocal17 >= integerLocal37) {
              integerLocal17 = 0;
              stackIntegerLocal1 = (integerLocal24 != 0) ? 0 : 1;
              integerLocal24 = stackIntegerLocal1;
            }
            if (integerLocal24 != 0) {
              integerArrayState0124[integerLocal26] = 0;
            }
          }
        }
        if (this.integerState0390 > 0 &&
          this.integerState0391 > 0) {
          integerLocal18 = (int)((double)this.integerState0390 * doubleLocal2);
          for (integerLocal22 = integerLocal18; integerLocal22 < integerArgument1; integerLocal22++) {
            integerArrayState0124[integerLocal22] = integerArrayState0124[integerLocal22] + integerArrayState0124[integerLocal22 - integerLocal18] * this.integerState0391 / 100;
          }
        }
        if (!(this.audioSupport001State0001.integerArrayState0057[0] <= 0) ||
          !(this.audioSupport001State0001.integerArrayState0057[1] <= 0)) {
          this.mixedSupport119State0009.performAction1683();
          integerLocal19 = this.mixedSupport119State0009.computeInteger1684(integerArgument1 + 1);
          integerLocal23 = this.audioSupport001State0001.computeInteger0712(0, (float)integerLocal19 / 65536.0f);
          integerLocal25 = this.audioSupport001State0001.computeInteger0712(1, (float)integerLocal19 / 65536.0f);
          if (integerArgument1 >= integerLocal23 + integerLocal25) {
            integerLocal27 = 0;
            integerLocal29 = integerLocal25;
            if (integerLocal29 > integerArgument1 - integerLocal23) {
              integerLocal29 = integerArgument1 - integerLocal23;
            }
            while (integerLocal27 < integerLocal29) {
              integerLocal30 = (int)((long)integerArrayState0124[integerLocal27 + integerLocal23] * (long)AudioSupport001.integerState0279 >> 16);
              for (integerLocal15 = 0; integerLocal15 < integerLocal23; integerLocal15++) {
                integerLocal30 = integerLocal30 + (int)((long)integerArrayState0124[integerLocal27 + integerLocal23 - 1 - integerLocal15] * (long)AudioSupport001.integerArrayArrayState0009[0][integerLocal15] >> 16);
              }
              for (integerLocal41 = 0; integerLocal41 < integerLocal27; integerLocal41++) {
                integerLocal30 = integerLocal30 - (int)((long)integerArrayState0124[integerLocal27 - 1 - integerLocal41] * (long)AudioSupport001.integerArrayArrayState0009[1][integerLocal41] >> 16);
              }
              integerArrayState0124[integerLocal27] = integerLocal30;
              integerLocal19 = this.mixedSupport119State0009.computeInteger1684(integerArgument1 + 1);
              integerLocal27++;
            }
            integerLocal38 = 128;
            while (true) {
              if (integerLocal38 > integerArgument1 - integerLocal23) {
                integerLocal38 = integerArgument1 - integerLocal23;
              }
              while (integerLocal27 < integerLocal38) {
                integerLocal39 = (int)((long)integerArrayState0124[integerLocal27 + integerLocal23] * (long)AudioSupport001.integerState0279 >> 16);
                for (integerLocal35 = 0; integerLocal35 < integerLocal23; integerLocal35++) {
                  integerLocal39 = integerLocal39 + (int)((long)integerArrayState0124[integerLocal27 + integerLocal23 - 1 - integerLocal35] * (long)AudioSupport001.integerArrayArrayState0009[0][integerLocal35] >> 16);
                }
                for (integerLocal42 = 0; integerLocal42 < integerLocal25; integerLocal42++) {
                  integerLocal39 = integerLocal39 - (int)((long)integerArrayState0124[integerLocal27 - 1 - integerLocal42] * (long)AudioSupport001.integerArrayArrayState0009[1][integerLocal42] >> 16);
                }
                integerArrayState0124[integerLocal27] = integerLocal39;
                integerLocal19 = this.mixedSupport119State0009.computeInteger1684(integerArgument1 + 1);
                integerLocal27++;
              }
              if (integerLocal27 < integerArgument1 - integerLocal23) {
                integerLocal23 = this.audioSupport001State0001.computeInteger0712(0, (float)integerLocal19 / 65536.0f);
                integerLocal25 = this.audioSupport001State0001.computeInteger0712(1, (float)integerLocal19 / 65536.0f);
                integerLocal38 += 128;
                continue;
              }
              break;
            }
            while (integerLocal27 < integerArgument1) {
              integerLocal40 = 0;
              for (integerLocal36 = integerLocal27 + integerLocal23 - integerArgument1; integerLocal36 < integerLocal23; integerLocal36++) {
                integerLocal40 = integerLocal40 + (int)((long)integerArrayState0124[integerLocal27 + integerLocal23 - 1 - integerLocal36] * (long)AudioSupport001.integerArrayArrayState0009[0][integerLocal36] >> 16);
              }
              for (integerLocal43 = 0; integerLocal43 < integerLocal25; integerLocal43++) {
                integerLocal40 = integerLocal40 - (int)((long)integerArrayState0124[integerLocal27 - 1 - integerLocal43] * (long)AudioSupport001.integerArrayArrayState0009[1][integerLocal43] >> 16);
              }
              integerArrayState0124[integerLocal27] = integerLocal40;
              integerLocal19 = this.mixedSupport119State0009.computeInteger1684(integerArgument1 + 1);
              integerLocal27++;
            }
          }
        }
        for (integerLocal20 = 0; integerLocal20 < integerArgument1; integerLocal20++) {
          if (integerArrayState0124[integerLocal20] < -32768) {
            integerArrayState0124[integerLocal20] = -32768;
          }
          if (integerArrayState0124[integerLocal20] > 32767) {
            integerArrayState0124[integerLocal20] = 32767;
          }
        }
        return integerArrayState0124;
    }

    private final int computeInteger1028(int integerArgument1, int integerArgument2, int integerArgument3) {
        if (integerArgument3 == 1) {
          if ((integerArgument1 & 32767) < 16384) {
            return integerArgument2;
          }
          return -integerArgument2;
        }
        if (integerArgument3 == 2) {
          return integerArrayState0125[integerArgument1 & 32767] * integerArgument2 >> 14;
        }
        if (integerArgument3 == 3) {
          return ((integerArgument1 & 32767) * integerArgument2 >> 14) - integerArgument2;
        }
        if (integerArgument3 == 4) {
          return integerArrayState0128[integerArgument1 / 2607 & 32767] * integerArgument2;
        }
        return 0;
    }

    final void performAction1029(PacketBuffer packetBufferArgument1) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        this.mixedSupport119State0001 = new MixedSupport119();
        this.mixedSupport119State0001.performAction1686(packetBufferArgument1);
        this.mixedSupport119State0007 = new MixedSupport119();
        this.mixedSupport119State0007.performAction1686(packetBufferArgument1);
        int integerLocal3 = packetBufferArgument1.computeInteger2085((byte) -127);
        if (integerLocal3 != 0) {
          packetBufferArgument1.position = packetBufferArgument1.position - 1;
          this.mixedSupport119State0002 = new MixedSupport119();
          this.mixedSupport119State0002.performAction1686(packetBufferArgument1);
          this.mixedSupport119State0003 = new MixedSupport119();
          this.mixedSupport119State0003.performAction1686(packetBufferArgument1);
        }
        integerLocal3 = packetBufferArgument1.computeInteger2085((byte) -31);
        if (integerLocal3 != 0) {
          packetBufferArgument1.position = packetBufferArgument1.position - 1;
          this.mixedSupport119State0005 = new MixedSupport119();
          this.mixedSupport119State0005.performAction1686(packetBufferArgument1);
          this.mixedSupport119State0006 = new MixedSupport119();
          this.mixedSupport119State0006.performAction1686(packetBufferArgument1);
        }
        integerLocal3 = packetBufferArgument1.computeInteger2085((byte) -89);
        if (integerLocal3 != 0) {
          packetBufferArgument1.position = packetBufferArgument1.position - 1;
          this.mixedSupport119State0004 = new MixedSupport119();
          this.mixedSupport119State0004.performAction1686(packetBufferArgument1);
          this.mixedSupport119State0008 = new MixedSupport119();
          this.mixedSupport119State0008.performAction1686(packetBufferArgument1);
        }
        for (integerLocal1 = 0; integerLocal1 < 10; integerLocal1++) {
          integerLocal2 = packetBufferArgument1.computeInteger2072(false);
          if (integerLocal2 == 0) {
            break;
          }
          this.integerArrayState0126[integerLocal1] = integerLocal2;
          this.integerArrayState0129[integerLocal1] = packetBufferArgument1.computeInteger2088((byte) 126);
          this.integerArrayState0127[integerLocal1] = packetBufferArgument1.computeInteger2072(false);
        }
        this.integerState0390 = packetBufferArgument1.computeInteger2072(false);
        this.integerState0391 = packetBufferArgument1.computeInteger2072(false);
        this.integerState0388 = packetBufferArgument1.computeInteger2089(3);
        this.integerState0389 = packetBufferArgument1.computeInteger2089(3);
        this.audioSupport001State0001 = new AudioSupport001();
        this.mixedSupport119State0009 = new MixedSupport119();
        this.audioSupport001State0001.performAction0714(packetBufferArgument1, this.mixedSupport119State0009);
    }

    AudioSupport003() {
        this.integerState0388 = 500;
        this.integerArrayState0126 = new int[]{0, 0, 0, 0, 0};
        this.integerState0389 = 0;
        this.integerArrayState0127 = new int[]{0, 0, 0, 0, 0};
        this.integerArrayState0129 = new int[]{0, 0, 0, 0, 0};
        this.integerState0391 = 100;
        this.integerState0390 = 0;
    }

    static {
        int integerLocal1 = 0;
        int integerLocal2;
        integerArrayState0128 = new int[32768];
        Random randomLocal3 = new Random(0L);
        for (integerLocal1 = 0; integerLocal1 < 32768; integerLocal1++) {
          integerArrayState0128[integerLocal1] = (randomLocal3.nextInt() & 2) - 1;
        }
        integerArrayState0125 = new int[32768];
        for (integerLocal2 = 0; integerLocal2 < 32768; integerLocal2++) {
          integerArrayState0125[integerLocal2] = (int)(Math.sin((double)integerLocal2 / 5215.1903) * 16384.0);
        }
        integerArrayState0124 = new int[220500];
        integerArrayState0130 = new int[5];
        integerArrayState0131 = new int[5];
        integerArrayState0132 = new int[5];
        integerArrayState0133 = new int[5];
        integerArrayState0134 = new int[5];
    }
}
