/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class VorbisSample extends HashNode {
    private static int[] integerArrayState0235;
    private static int integerState0823;
    private static float[] floatArrayState0003;
    private int integerState0824;
    private static float[] floatArrayState0004;
    private static int integerState0825;
    private static float[] floatArrayState0005;
    private static int integerState0826;
    private boolean booleanState0195;
    private int integerState0827;
    private int integerState0828;
    private byte[][] byteArrayArrayState0010;
    private static float[] floatArrayState0006;
    private static MixedSupport060[] mixedSupport060ArrayState0001;
    private static MixedSupport012[] mixedSupport012ArrayState0001;
    private static boolean[] booleanArrayState0011;
    static MixedSupport065[] mixedSupport065ArrayState0001;
    private int integerState0829;
    private static float[] floatArrayState0007;
    private byte[] byteArrayState0030;
    private static int[] integerArrayState0236;
    private static MixedSupport107[] mixedSupport107ArrayState0001;
    private static boolean booleanState0196;
    private static byte[] byteArrayState0031;
    private static float[] floatArrayState0008;
    private float[] floatArrayState0009;
    private static float[] floatArrayState0010;
    private int integerState0830;
    private int integerState0831;
    private int integerState0832;
    private int integerState0833;
    private static int integerState0834;
    private static int[] integerArrayState0237;
    private boolean booleanState0197;

    final static float computeFloat1913(int integerArgument1) {
        int integerLocal1 = integerArgument1 & 2097151;
        int integerLocal2 = integerArgument1 & -2147483648;
        int integerLocal3 = (integerArgument1 & 2145386496) >> 21;
        if (integerLocal2 != 0) {
          integerLocal1 = -integerLocal1;
        }
        return (float)((double)integerLocal1 * Math.pow(2.0, (double)(integerLocal3 - 788)));
    }

    final static void performAction1921(byte[] byteArrayArgument1) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        int stackIntegerLocal6 = 0;
        boolean[] stackBooleanArrayLocal7 = null;
        int stackIntegerLocal8 = 0;
        boolean stackBooleanLocal9 = false;
        int integerLocal10;
        int integerLocal11;
        int integerLocal12;
        int integerLocal13;
        int integerLocal14;
        float[] floatArrayLocal15;
        float[] floatArrayLocal16;
        float[] floatArrayLocal17;
        int[] integerArrayLocal18;
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
        VorbisSample.performAction1918(byteArrayArgument1, 0);
        integerState0823 = 1 << VorbisSample.computeInteger1923(4);
        integerState0834 = 1 << VorbisSample.computeInteger1923(4);
        floatArrayState0010 = new float[integerState0834];
        for (integerLocal10 = 0; integerLocal10 < 2; integerLocal10++) {
          if (integerLocal10 == 0) {
            stackIntegerLocal6 = integerState0823;
          } else {
            stackIntegerLocal6 = integerState0834;
          }
          integerLocal11 = stackIntegerLocal6;
          integerLocal12 = integerLocal11 >> 1;
          integerLocal13 = integerLocal11 >> 2;
          integerLocal14 = integerLocal11 >> 3;
          floatArrayLocal15 = new float[integerLocal12];
          for (integerLocal1 = 0; integerLocal1 < integerLocal13; integerLocal1++) {
            floatArrayLocal15[2 * integerLocal1] = (float)Math.cos((double)(4 * integerLocal1) * 3.141592653589793 / (double)integerLocal11);
            floatArrayLocal15[2 * integerLocal1 + 1] = -(float)Math.sin((double)(4 * integerLocal1) * 3.141592653589793 / (double)integerLocal11);
          }
          floatArrayLocal16 = new float[integerLocal12];
          for (integerLocal2 = 0; integerLocal2 < integerLocal13; integerLocal2++) {
            floatArrayLocal16[2 * integerLocal2] = (float)Math.cos((double)(2 * integerLocal2 + 1) * 3.141592653589793 / (double)(2 * integerLocal11));
            floatArrayLocal16[2 * integerLocal2 + 1] = (float)Math.sin((double)(2 * integerLocal2 + 1) * 3.141592653589793 / (double)(2 * integerLocal11));
          }
          floatArrayLocal17 = new float[integerLocal13];
          for (integerLocal3 = 0; integerLocal3 < integerLocal14; integerLocal3++) {
            floatArrayLocal17[2 * integerLocal3] = (float)Math.cos((double)(4 * integerLocal3 + 2) * 3.141592653589793 / (double)integerLocal11);
            floatArrayLocal17[2 * integerLocal3 + 1] = -(float)Math.sin((double)(4 * integerLocal3 + 2) * 3.141592653589793 / (double)integerLocal11);
          }
          integerArrayLocal18 = new int[integerLocal14];
          integerLocal19 = SceneWidgetPart010.computeInteger1667((byte) -57, integerLocal14 - 1);
          for (integerLocal4 = 0; integerLocal4 < integerLocal14; integerLocal4++) {
            integerArrayLocal18[integerLocal4] = MixedSupport113.computeInteger1604((byte) 16, integerLocal19, integerLocal4);
          }
          if (integerLocal10 == 0) {
            floatArrayState0006 = floatArrayLocal15;
            floatArrayState0007 = floatArrayLocal16;
            floatArrayState0003 = floatArrayLocal17;
            integerArrayState0237 = integerArrayLocal18;
          } else {
            floatArrayState0005 = floatArrayLocal15;
            floatArrayState0008 = floatArrayLocal16;
            floatArrayState0004 = floatArrayLocal17;
            integerArrayState0236 = integerArrayLocal18;
          }
        }
        integerLocal20 = VorbisSample.computeInteger1923(8) + 1;
        mixedSupport065ArrayState0001 = new MixedSupport065[integerLocal20];
        for (integerLocal21 = 0; integerLocal21 < integerLocal20; integerLocal21++) {
          mixedSupport065ArrayState0001[integerLocal21] = new MixedSupport065();
        }
        integerLocal22 = VorbisSample.computeInteger1923(6) + 1;
        for (integerLocal24 = 0; integerLocal24 < integerLocal22; integerLocal24++) {
          VorbisSample.computeInteger1923(16);
        }
        integerLocal23 = VorbisSample.computeInteger1923(6) + 1;
        mixedSupport060ArrayState0001 = new MixedSupport060[integerLocal23];
        for (integerLocal25 = 0; integerLocal25 < integerLocal23; integerLocal25++) {
          mixedSupport060ArrayState0001[integerLocal25] = new MixedSupport060();
        }
        integerLocal26 = VorbisSample.computeInteger1923(6) + 1;
        mixedSupport012ArrayState0001 = new MixedSupport012[integerLocal26];
        for (integerLocal27 = 0; integerLocal27 < integerLocal26; integerLocal27++) {
          mixedSupport012ArrayState0001[integerLocal27] = new MixedSupport012();
        }
        integerLocal28 = VorbisSample.computeInteger1923(6) + 1;
        mixedSupport107ArrayState0001 = new MixedSupport107[integerLocal28];
        for (integerLocal29 = 0; integerLocal29 < integerLocal28; integerLocal29++) {
          mixedSupport107ArrayState0001[integerLocal29] = new MixedSupport107();
        }
        integerLocal30 = VorbisSample.computeInteger1923(6) + 1;
        booleanArrayState0011 = new boolean[integerLocal30];
        integerArrayState0235 = new int[integerLocal30];
        for (integerLocal5 = 0; integerLocal5 < integerLocal30; integerLocal5++) {
          stackBooleanArrayLocal7 = (boolean[]) (booleanArrayState0011);
          stackIntegerLocal8 = integerLocal5;
          stackBooleanLocal9 = (VorbisSample.computeInteger1920() != 0);
          stackBooleanArrayLocal7[stackIntegerLocal8] = stackBooleanLocal9;
          VorbisSample.computeInteger1923(16);
          VorbisSample.computeInteger1923(16);
          integerArrayState0235[integerLocal5] = VorbisSample.computeInteger1923(8);
        }
        booleanState0196 = true;
    }

    final static int computeInteger1920() {
        int integerLocal1 = byteArrayState0031[integerState0826] >> integerState0825 & 1;
        integerState0825 = integerState0825 + 1;
        integerState0826 = integerState0826 + (integerState0825 >> 3);
        integerState0825 = integerState0825 & 7;
        return integerLocal1;
    }

    private final void performAction1917(byte[] byteArrayArgument1) throws IOException {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        byte[] byteArrayLocal4 = null;
        PacketBuffer packetBufferLocal5 = new PacketBuffer(byteArrayArgument1);
        this.integerState0831 = packetBufferLocal5.computeInteger2096(7553);
        this.integerState0833 = packetBufferLocal5.computeInteger2096(7553);
        this.integerState0827 = packetBufferLocal5.computeInteger2096(7553);
        this.integerState0832 = packetBufferLocal5.computeInteger2096(7553);
        if (this.integerState0832 < 0) {
          this.integerState0832 = ~this.integerState0832;
          this.booleanState0197 = true;
        }
        int integerLocal6 = packetBufferLocal5.computeInteger2096(7553);
        if (integerLocal6 < 0) {
          throw new IOException();
        }
        this.byteArrayArrayState0010 = new byte[integerLocal6][];
        for (integerLocal1 = 0; integerLocal1 < integerLocal6; integerLocal1++) {
          integerLocal2 = 0;
          do {
            integerLocal3 = packetBufferLocal5.computeInteger2085((byte) -64);
            integerLocal2 = integerLocal2 + integerLocal3;
          } while (integerLocal3 >= 255);
          byteArrayLocal4 = new byte[integerLocal2];
          packetBufferLocal5.performAction2075(byteArrayLocal4, 0, (byte) 125, integerLocal2);
          this.byteArrayArrayState0010[integerLocal1] = byteArrayLocal4;
        }
    }

    final RawSound computeRawSound1919(int[] integerArrayArgument1) {
        int integerLocal1 = 0;
        int previousIntegerLocal2 = 0;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        float[] floatArrayLocal6;
        byte[] byteArrayLocal7;
        if (integerArrayArgument1 != null &&
          integerArrayArgument1[0] <= 0) {
          return null;
        }
        if (this.byteArrayState0030 == null) {
          this.integerState0830 = 0;
          this.floatArrayState0009 = new float[integerState0834];
          this.byteArrayState0030 = new byte[this.integerState0833];
          this.integerState0828 = 0;
          this.integerState0829 = 0;
        }
        while (this.integerState0829 < this.byteArrayArrayState0010.length) {
          if (integerArrayArgument1 != null &&
            integerArrayArgument1[0] <= 0) {
            return null;
          }
          floatArrayLocal6 = this.computeFloatArray1924(this.integerState0829);
          if (floatArrayLocal6 != null) {
            integerLocal3 = this.integerState0828;
            integerLocal4 = floatArrayLocal6.length;
            if (integerLocal4 > this.integerState0833 - integerLocal3) {
              integerLocal4 = this.integerState0833 - integerLocal3;
            }
            for (integerLocal1 = 0; integerLocal1 < integerLocal4; integerLocal1++) {
              integerLocal5 = (int)(128.0f + floatArrayLocal6[integerLocal1] * 128.0f);
              if ((integerLocal5 & -256) != 0) {
                integerLocal5 = ~integerLocal5 >> 31;
              }
              previousIntegerLocal2 = integerLocal3;
              integerLocal3++;
              this.byteArrayState0030[previousIntegerLocal2] = (byte)(integerLocal5 - 128);
            }
            if (integerArrayArgument1 != null) {
              integerArrayArgument1[0] = integerArrayArgument1[0] - (integerLocal3 - this.integerState0828);
            }
            this.integerState0828 = integerLocal3;
          }
          this.integerState0829 = this.integerState0829 + 1;
        }
        this.floatArrayState0009 = null;
        byteArrayLocal7 = this.byteArrayState0030;
        this.byteArrayState0030 = null;
        return new RawSound(this.integerState0831, byteArrayLocal7, this.integerState0827, this.integerState0832, this.booleanState0197);
    }

    final RawSound computeRawSound1912() {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int previousIntegerLocal3 = 0;
        byte[] byteArrayLocal4;
        int integerLocal5;
        float[] floatArrayLocal6;
        int integerLocal7;
        int integerLocal8;
        this.integerState0830 = 0;
        this.floatArrayState0009 = new float[integerState0834];
        byteArrayLocal4 = new byte[this.integerState0833];
        integerLocal5 = 0;
        for (integerLocal1 = 0; integerLocal1 < this.byteArrayArrayState0010.length; integerLocal1++) {
          floatArrayLocal6 = this.computeFloatArray1924(integerLocal1);
          if (floatArrayLocal6 != null) {
            integerLocal7 = floatArrayLocal6.length;
            if (integerLocal7 > this.integerState0833 - integerLocal5) {
              integerLocal7 = this.integerState0833 - integerLocal5;
            }
            for (integerLocal2 = 0; integerLocal2 < integerLocal7; integerLocal2++) {
              integerLocal8 = (int)(128.0f + floatArrayLocal6[integerLocal2] * 128.0f);
              if ((integerLocal8 & -256) != 0) {
                integerLocal8 = ~integerLocal8 >> 31;
              }
              previousIntegerLocal3 = integerLocal5;
              integerLocal5++;
              byteArrayLocal4[previousIntegerLocal3] = (byte)(integerLocal8 - 128);
            }
          }
        }
        this.floatArrayState0009 = null;
        return new RawSound(this.integerState0831, byteArrayLocal4, this.integerState0827, this.integerState0832, this.booleanState0197);
    }

    private final float[] computeFloatArray1924(int integerArgument1) {
        int integerLocal1 = 0;
        int stackIntegerLocal2 = 0;
        int stackIntegerLocal3 = 0;
        int stackIntegerLocal4 = 0;
        int stackIntegerLocal5 = 0;
        float[] stackFloatArrayLocal6 = null;
        float[] stackFloatArrayLocal7 = null;
        float[] stackFloatArrayLocal8 = null;
        int[] stackIntegerArrayLocal9 = null;
        boolean stackBooleanLocal10 = false;
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
        MixedSupport107 mixedSupport107Local23;
        int integerLocal24;
        int integerLocal25;
        int integerLocal26;
        Object objectLocal27;
        int integerLocal28;
        float[] floatArrayLocal29;
        int integerLocal30;
        float[] floatArrayLocal31;
        int integerLocal32;
        int integerLocal33;
        float[] floatArrayLocal34;
        float[] floatArrayLocal35;
        float[] floatArrayLocal36;
        int[] integerArrayLocal37;
        int integerLocal38;
        int integerLocal39;
        float floatLocal40;
        float floatLocal41;
        int integerLocal42;
        float floatLocal43;
        int integerLocal44;
        float floatLocal45;
        int integerLocal46;
        float floatLocal47;
        int integerLocal48;
        float floatLocal49;
        int integerLocal50;
        float floatLocal51;
        float floatLocal52;
        int integerLocal53;
        float floatLocal54;
        float floatLocal55;
        float floatLocal56;
        float floatLocal57;
        float floatLocal58;
        float floatLocal59;
        float[] floatArrayLocal60;
        int integerLocal61;
        MixedSupport012 mixedSupport012Local62;
        int[] integerArrayLocal63;
        float[] floatArrayLocal64;
        float[] floatArrayLocal65;
        int[] integerArrayLocal66;
        float[] floatArrayLocal67;
        float[] floatArrayLocal68;
        float[] floatArrayLocal69;
        int integerLocal70;
        int integerLocal71;
        int integerLocal72;
        int integerLocal73;
        int integerLocal74;
        int integerLocal75;
        int integerLocal76;
        int integerLocal77;
        int integerLocal78;
        int integerLocal79;
        int integerLocal80;
        int integerLocal81;
        int integerLocal82;
        int integerLocal83;
        int integerLocal84;
        int integerLocal85;
        int integerLocal86;
        int integerLocal87;
        int integerLocal88;
        int integerLocal89;
        float floatLocal90;
        float floatLocal91;
        float floatLocal92;
        float floatLocal93;
        float floatLocal94;
        int integerLocal95;
        float floatLocal96;
        float floatLocal97;
        int integerLocal98;
        float floatLocal99;
        float floatLocal100;
        int integerLocal101;
        float floatLocal102;
        float floatLocal103;
        float floatLocal104;
        float floatLocal105;
        int integerLocal106;
        float floatLocal107;
        float floatLocal108;
        float floatLocal109;
        int integerLocal110;
        int integerLocal111;
        VorbisSample.performAction1918(this.byteArrayArrayState0010[integerArgument1], 0);
        VorbisSample.computeInteger1920();
        integerLocal11 = VorbisSample.computeInteger1923(SceneWidgetPart010.computeInteger1667((byte) -26, integerArrayState0235.length - 1));
        integerLocal12 = booleanArrayState0011[integerLocal11] ? 1 : 0;
        if (integerLocal12 == 0) {
          stackIntegerLocal2 = integerState0823;
        } else {
          stackIntegerLocal2 = integerState0834;
        }
        integerLocal13 = stackIntegerLocal2;
        integerLocal14 = 0;
        integerLocal15 = 0;
        if (integerLocal12 != 0) {
          stackIntegerLocal3 = (VorbisSample.computeInteger1920() == 0) ? 0 : 1;
          integerLocal14 = stackIntegerLocal3;
          stackIntegerLocal4 = (VorbisSample.computeInteger1920() == 0) ? 0 : 1;
          integerLocal15 = stackIntegerLocal4;
        }
        integerLocal16 = integerLocal13 >> 1;
        if (integerLocal12 != 0 &&
          integerLocal14 == 0) {
          integerLocal17 = (integerLocal13 >> 2) - (integerState0823 >> 2);
          integerLocal18 = (integerLocal13 >> 2) + (integerState0823 >> 2);
          integerLocal19 = integerState0823 >> 1;
        } else {
          integerLocal17 = 0;
          integerLocal18 = integerLocal16;
          integerLocal19 = integerLocal13 >> 1;
        }
        if (integerLocal12 != 0 &&
          integerLocal15 == 0) {
          integerLocal20 = integerLocal13 - (integerLocal13 >> 2) - (integerState0823 >> 2);
          integerLocal21 = integerLocal13 - (integerLocal13 >> 2) + (integerState0823 >> 2);
          integerLocal22 = integerState0823 >> 1;
        } else {
          integerLocal20 = integerLocal16;
          integerLocal21 = integerLocal13;
          integerLocal22 = integerLocal13 >> 1;
        }
        mixedSupport107Local23 = mixedSupport107ArrayState0001[integerArrayState0235[integerLocal11]];
        integerLocal25 = mixedSupport107Local23.integerState0593;
        integerLocal26 = mixedSupport107Local23.integerArrayState0185[integerLocal25];
        stackIntegerLocal5 = (mixedSupport060ArrayState0001[integerLocal26].computeBoolean0808()) ? 0 : 1;
        integerLocal24 = stackIntegerLocal5;
        integerLocal70 = integerLocal24;
        for (integerLocal71 = 0; integerLocal71 < mixedSupport107Local23.integerState0594; integerLocal71++) {
          mixedSupport012Local62 = mixedSupport012ArrayState0001[mixedSupport107Local23.integerArrayState0186[integerLocal71]];
          floatArrayLocal69 = floatArrayState0010;
          mixedSupport012Local62.performAction0184(floatArrayLocal69, integerLocal13 >> 1, integerLocal70 != 0);
        }
        if (integerLocal24 == 0) {
          integerLocal72 = mixedSupport107Local23.integerState0593;
          integerLocal28 = mixedSupport107Local23.integerArrayState0185[integerLocal72];
          mixedSupport060ArrayState0001[integerLocal28].performAction0812(floatArrayState0010, integerLocal13 >> 1);
        }
        if (integerLocal24 != 0) {
          for (integerLocal73 = integerLocal13 >> 1; integerLocal73 < integerLocal13; integerLocal73++) {
            floatArrayState0010[integerLocal73] = 0.0f;
          }
        } else {
          integerLocal73 = integerLocal13 >> 1;
          integerLocal110 = integerLocal13 >> 2;
          integerLocal30 = integerLocal13 >> 3;
          floatArrayLocal67 = floatArrayState0010;
          floatArrayLocal64 = floatArrayLocal67;
          floatArrayLocal31 = floatArrayLocal64;
          for (integerLocal33 = 0; integerLocal33 < integerLocal73; integerLocal33++) {
            floatArrayLocal31[integerLocal33] = floatArrayLocal31[integerLocal33] * 0.5f;
          }
          integerLocal61 = integerLocal73;
          integerLocal76 = integerLocal61;
          while (integerLocal61 < integerLocal13) {
            floatArrayLocal31[integerLocal61] = -floatArrayLocal31[integerLocal13 - integerLocal61 - 1];
            integerLocal61++;
          }
          if (integerLocal12 == 0) {
            stackFloatArrayLocal6 = (float[]) (floatArrayState0006);
          } else {
            stackFloatArrayLocal6 = (float[]) (floatArrayState0005);
          }
          floatArrayLocal34 = stackFloatArrayLocal6;
          if (integerLocal12 == 0) {
            stackFloatArrayLocal7 = (float[]) (floatArrayState0007);
          } else {
            stackFloatArrayLocal7 = (float[]) (floatArrayState0008);
          }
          floatArrayLocal35 = stackFloatArrayLocal7;
          if (integerLocal12 == 0) {
            stackFloatArrayLocal8 = (float[]) (floatArrayState0003);
          } else {
            stackFloatArrayLocal8 = (float[]) (floatArrayState0004);
          }
          floatArrayLocal36 = stackFloatArrayLocal8;
          if (integerLocal12 == 0) {
            stackIntegerArrayLocal9 = (int[]) (integerArrayState0237);
          } else {
            stackIntegerArrayLocal9 = (int[]) (integerArrayState0236);
          }
          integerArrayLocal66 = stackIntegerArrayLocal9;
          integerArrayLocal63 = integerArrayLocal66;
          integerArrayLocal37 = integerArrayLocal63;
          for (integerLocal38 = 0; integerLocal38 < integerLocal110; integerLocal38++) {
            floatLocal40 = floatArrayLocal31[4 * integerLocal38] - floatArrayLocal31[integerLocal13 - 4 * integerLocal38 - 1];
            floatLocal41 = floatArrayLocal31[4 * integerLocal38 + 2] - floatArrayLocal31[integerLocal13 - 4 * integerLocal38 - 3];
            floatLocal43 = floatArrayLocal34[2 * integerLocal38];
            floatLocal45 = floatArrayLocal34[2 * integerLocal38 + 1];
            floatArrayLocal31[integerLocal13 - 4 * integerLocal38 - 1] = floatLocal40 * floatLocal43 - floatLocal41 * floatLocal45;
            floatArrayLocal31[integerLocal13 - 4 * integerLocal38 - 3] = floatLocal40 * floatLocal45 + floatLocal41 * floatLocal43;
          }
          for (integerLocal77 = 0; integerLocal77 < integerLocal30; integerLocal77++) {
            floatLocal90 = floatArrayLocal31[integerLocal73 + 3 + 4 * integerLocal77];
            floatLocal91 = floatArrayLocal31[integerLocal73 + 1 + 4 * integerLocal77];
            floatLocal96 = floatArrayLocal31[4 * integerLocal77 + 3];
            floatLocal99 = floatArrayLocal31[4 * integerLocal77 + 1];
            floatArrayLocal31[integerLocal73 + 3 + 4 * integerLocal77] = floatLocal90 + floatLocal96;
            floatArrayLocal31[integerLocal73 + 1 + 4 * integerLocal77] = floatLocal91 + floatLocal99;
            floatLocal47 = floatArrayLocal34[integerLocal73 - 4 - 4 * integerLocal77];
            floatLocal49 = floatArrayLocal34[integerLocal73 - 3 - 4 * integerLocal77];
            floatArrayLocal31[4 * integerLocal77 + 3] = (floatLocal90 - floatLocal96) * floatLocal47 - (floatLocal91 - floatLocal99) * floatLocal49;
            floatArrayLocal31[4 * integerLocal77 + 1] = (floatLocal91 - floatLocal99) * floatLocal47 + (floatLocal90 - floatLocal96) * floatLocal49;
          }
          integerLocal78 = SceneWidgetPart010.computeInteger1667((byte) -63, integerLocal13 - 1);
          for (integerLocal39 = 0; integerLocal39 < integerLocal78 - 3; integerLocal39++) {
            integerLocal42 = integerLocal13 >> integerLocal39 + 2;
            integerLocal44 = 8 << integerLocal39;
            for (integerLocal46 = 0; integerLocal46 < 2 << integerLocal39; integerLocal46++) {
              integerLocal48 = integerLocal13 - integerLocal42 * 2 * integerLocal46;
              integerLocal50 = integerLocal13 - integerLocal42 * (2 * integerLocal46 + 1);
              for (integerLocal1 = 0; integerLocal1 < integerLocal13 >> integerLocal39 + 4; integerLocal1++) {
                integerLocal53 = 4 * integerLocal1;
                floatLocal54 = floatArrayLocal31[integerLocal48 - 1 - integerLocal53];
                floatLocal55 = floatArrayLocal31[integerLocal48 - 3 - integerLocal53];
                floatLocal56 = floatArrayLocal31[integerLocal50 - 1 - integerLocal53];
                floatLocal57 = floatArrayLocal31[integerLocal50 - 3 - integerLocal53];
                floatArrayLocal31[integerLocal48 - 1 - integerLocal53] = floatLocal54 + floatLocal56;
                floatArrayLocal31[integerLocal48 - 3 - integerLocal53] = floatLocal55 + floatLocal57;
                floatLocal58 = floatArrayLocal34[integerLocal1 * integerLocal44];
                floatLocal59 = floatArrayLocal34[integerLocal1 * integerLocal44 + 1];
                floatArrayLocal31[integerLocal50 - 1 - integerLocal53] = (floatLocal54 - floatLocal56) * floatLocal58 - (floatLocal55 - floatLocal57) * floatLocal59;
                floatArrayLocal31[integerLocal50 - 3 - integerLocal53] = (floatLocal55 - floatLocal57) * floatLocal58 + (floatLocal54 - floatLocal56) * floatLocal59;
              }
            }
          }
          for (integerLocal79 = 1; integerLocal79 < integerLocal30 - 1; integerLocal79++) {
            integerLocal95 = integerArrayLocal66[integerLocal79];
            if (integerLocal79 < integerLocal95) {
              integerLocal98 = 8 * integerLocal79;
              integerLocal101 = 8 * integerLocal95;
              floatLocal102 = floatArrayLocal31[integerLocal98 + 1];
              floatArrayLocal31[integerLocal98 + 1] = floatArrayLocal31[integerLocal101 + 1];
              floatArrayLocal31[integerLocal101 + 1] = floatLocal102;
              floatLocal107 = floatArrayLocal31[integerLocal98 + 3];
              floatArrayLocal31[integerLocal98 + 3] = floatArrayLocal31[integerLocal101 + 3];
              floatArrayLocal31[integerLocal101 + 3] = floatLocal107;
              floatLocal108 = floatArrayLocal31[integerLocal98 + 5];
              floatArrayLocal31[integerLocal98 + 5] = floatArrayLocal31[integerLocal101 + 5];
              floatArrayLocal31[integerLocal101 + 5] = floatLocal108;
              floatLocal109 = floatArrayLocal31[integerLocal98 + 7];
              floatArrayLocal31[integerLocal98 + 7] = floatArrayLocal31[integerLocal101 + 7];
              floatArrayLocal31[integerLocal101 + 7] = floatLocal109;
            }
          }
          for (integerLocal80 = 0; integerLocal80 < integerLocal73; integerLocal80++) {
            floatArrayLocal31[integerLocal80] = floatArrayLocal31[2 * integerLocal80 + 1];
          }
          for (integerLocal81 = 0; integerLocal81 < integerLocal30; integerLocal81++) {
            floatArrayLocal31[integerLocal13 - 1 - 2 * integerLocal81] = floatArrayLocal31[4 * integerLocal81];
            floatArrayLocal31[integerLocal13 - 2 - 2 * integerLocal81] = floatArrayLocal31[4 * integerLocal81 + 1];
            floatArrayLocal31[integerLocal13 - integerLocal110 - 1 - 2 * integerLocal81] = floatArrayLocal31[4 * integerLocal81 + 2];
            floatArrayLocal31[integerLocal13 - integerLocal110 - 2 - 2 * integerLocal81] = floatArrayLocal31[4 * integerLocal81 + 3];
          }
          for (integerLocal82 = 0; integerLocal82 < integerLocal30; integerLocal82++) {
            floatLocal92 = floatArrayLocal36[2 * integerLocal82];
            floatLocal97 = floatArrayLocal36[2 * integerLocal82 + 1];
            floatLocal100 = floatArrayLocal31[integerLocal73 + 2 * integerLocal82];
            floatLocal103 = floatArrayLocal31[integerLocal73 + 2 * integerLocal82 + 1];
            floatLocal104 = floatArrayLocal31[integerLocal13 - 2 - 2 * integerLocal82];
            floatLocal51 = floatArrayLocal31[integerLocal13 - 1 - 2 * integerLocal82];
            floatLocal52 = floatLocal97 * (floatLocal100 - floatLocal104) + floatLocal92 * (floatLocal103 + floatLocal51);
            floatArrayLocal31[integerLocal73 + 2 * integerLocal82] = (floatLocal100 + floatLocal104 + floatLocal52) * 0.5f;
            floatArrayLocal31[integerLocal13 - 2 - 2 * integerLocal82] = (floatLocal100 + floatLocal104 - floatLocal52) * 0.5f;
            floatLocal105 = floatLocal97 * (floatLocal103 + floatLocal51) - floatLocal92 * (floatLocal100 - floatLocal104);
            floatArrayLocal31[integerLocal73 + 2 * integerLocal82 + 1] = (floatLocal103 - floatLocal51 + floatLocal105) * 0.5f;
            floatArrayLocal31[integerLocal13 - 1 - 2 * integerLocal82] = (-floatLocal103 + floatLocal51 + floatLocal105) * 0.5f;
          }
          for (integerLocal83 = 0; integerLocal83 < integerLocal110; integerLocal83++) {
            floatArrayLocal31[integerLocal83] = floatArrayLocal31[2 * integerLocal83 + integerLocal73] * floatArrayLocal35[2 * integerLocal83] + floatArrayLocal31[2 * integerLocal83 + 1 + integerLocal73] * floatArrayLocal35[2 * integerLocal83 + 1];
            floatArrayLocal31[integerLocal73 - 1 - integerLocal83] = floatArrayLocal31[2 * integerLocal83 + integerLocal73] * floatArrayLocal35[2 * integerLocal83 + 1] - floatArrayLocal31[2 * integerLocal83 + 1 + integerLocal73] * floatArrayLocal35[2 * integerLocal83];
          }
          for (integerLocal84 = 0; integerLocal84 < integerLocal110; integerLocal84++) {
            floatArrayLocal31[integerLocal13 - integerLocal110 + integerLocal84] = -floatArrayLocal67[integerLocal84];
          }
          for (integerLocal85 = 0; integerLocal85 < integerLocal110; integerLocal85++) {
            floatArrayLocal31[integerLocal85] = floatArrayLocal31[integerLocal110 + integerLocal85];
          }
          for (integerLocal86 = 0; integerLocal86 < integerLocal110; integerLocal86++) {
            floatArrayLocal31[integerLocal110 + integerLocal86] = -floatArrayLocal31[integerLocal110 - integerLocal86 - 1];
          }
          for (integerLocal87 = 0; integerLocal87 < integerLocal110; integerLocal87++) {
            floatArrayLocal31[integerLocal73 + integerLocal87] = floatArrayLocal31[integerLocal13 - integerLocal87 - 1];
          }
          for (integerLocal88 = integerLocal17; integerLocal88 < integerLocal18; integerLocal88++) {
            floatLocal93 = (float)Math.sin(((double)(integerLocal88 - integerLocal17) + 0.5) / (double)integerLocal19 * 0.5 * 3.141592653589793);
            floatArrayState0010[integerLocal88] = floatArrayState0010[integerLocal88] * (float)Math.sin(1.5707963267948966 * (double)floatLocal93 * (double)floatLocal93);
          }
          for (integerLocal89 = integerLocal20; integerLocal89 < integerLocal21; integerLocal89++) {
            floatLocal94 = (float)Math.sin(((double)(integerLocal89 - integerLocal20) + 0.5) / (double)integerLocal22 * 0.5 * 3.141592653589793 + 1.5707963267948966);
            floatArrayState0010[integerLocal89] = floatArrayState0010[integerLocal89] * (float)Math.sin(1.5707963267948966 * (double)floatLocal94 * (double)floatLocal94);
          }
        }
        objectLocal27 = null;
        if (this.integerState0830 > 0) {
          integerLocal111 = this.integerState0830 + integerLocal13 >> 2;
          floatArrayLocal68 = new float[integerLocal111];
          floatArrayLocal65 = floatArrayLocal68;
          floatArrayLocal60 = floatArrayLocal65;
          objectLocal27 = floatArrayLocal60;
          if (!this.booleanState0195) {
            for (integerLocal74 = 0; integerLocal74 < this.integerState0824; integerLocal74++) {
              integerLocal32 = (this.integerState0830 >> 1) + integerLocal74;
              floatArrayLocal60[integerLocal74] = floatArrayLocal60[integerLocal74] + this.floatArrayState0009[integerLocal32];
            }
          }
          if (integerLocal24 == 0) {
            for (integerLocal106 = integerLocal17; integerLocal106 < integerLocal13 >> 1; integerLocal106++) {
              integerLocal75 = floatArrayLocal68.length - (integerLocal13 >> 1) + integerLocal106;
              floatArrayLocal60[integerLocal75] = floatArrayLocal60[integerLocal75] + floatArrayState0010[integerLocal106];
            }
          }
        }
        floatArrayLocal29 = this.floatArrayState0009;
        this.floatArrayState0009 = floatArrayState0010;
        floatArrayState0010 = floatArrayLocal29;
        this.integerState0830 = integerLocal13;
        this.integerState0824 = integerLocal21 - (integerLocal13 >> 1);
        stackBooleanLocal10 = (integerLocal24 != 0);
        this.booleanState0195 = stackBooleanLocal10;
        return (float[]) (objectLocal27);
    }

    final static int computeInteger1923(int integerArgument1) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int integerLocal5;
        while (integerArgument1 >= 8 - integerState0825) {
          integerLocal2 = 8 - integerState0825;
          integerLocal1 = (1 << integerLocal2) - 1;
          integerLocal3 = integerLocal3 + ((byteArrayState0031[integerState0826] >> integerState0825 & integerLocal1) << integerLocal4);
          integerState0825 = 0;
          integerState0826 = integerState0826 + 1;
          integerLocal4 = integerLocal4 + integerLocal2;
          integerArgument1 = integerArgument1 - integerLocal2;
        }
        if (integerArgument1 > 0) {
          integerLocal5 = (1 << integerArgument1) - 1;
          integerLocal3 = integerLocal3 + ((byteArrayState0031[integerState0826] >> integerState0825 & integerLocal5) << integerLocal4);
          integerState0825 = integerState0825 + integerArgument1;
        }
        return integerLocal3;
    }

    final static VorbisSample computeVorbisSample1915(ResourceArchive resourceArchiveArgument1, int integerArgument2, int integerArgument3) {
        try {
          VorbisSample vorbisSampleLocal1 = null;
          if (!VorbisSample.computeBoolean1914(resourceArchiveArgument1)) {
            resourceArchiveArgument1.computeBoolean0906((byte) -83, integerArgument3, integerArgument2);
            return null;
          }
          byte[] byteArrayLocal2 = resourceArchiveArgument1.computeByteArray0912(integerArgument3, -124, integerArgument2);
          if (byteArrayLocal2 == null) {
            return null;
          }
          Object objectLocal3 = null;
          try {
            vorbisSampleLocal1 = new VorbisSample(byteArrayLocal2);
          } catch (IOException iOException) {
            iOException.printStackTrace();
          }
          return vorbisSampleLocal1;
        } catch (RuntimeException | Error uncheckedExceptionLocal5) {
          throw uncheckedExceptionLocal5;
        } catch (Throwable checkedExceptionLocal6) {
          throw new RuntimeException(checkedExceptionLocal6);
        }
    }

    private final static boolean computeBoolean1914(ResourceArchive resourceArchiveArgument1) {
        byte[] byteArrayLocal1 = null;
        if (!booleanState0196) {
          byteArrayLocal1 = resourceArchiveArgument1.computeByteArray0912(0, -121, 0);
          if (byteArrayLocal1 == null) {
            return false;
          }
          VorbisSample.performAction1921(byteArrayLocal1);
        }
        return true;
    }

    public static void performAction1922() {
        byteArrayState0031 = null;
        mixedSupport065ArrayState0001 = null;
        mixedSupport060ArrayState0001 = null;
        mixedSupport012ArrayState0001 = null;
        mixedSupport107ArrayState0001 = null;
        booleanArrayState0011 = null;
        integerArrayState0235 = null;
        floatArrayState0010 = null;
        floatArrayState0006 = null;
        floatArrayState0007 = null;
        floatArrayState0003 = null;
        floatArrayState0005 = null;
        floatArrayState0008 = null;
        floatArrayState0004 = null;
        integerArrayState0237 = null;
        integerArrayState0236 = null;
    }

    private final static void performAction1918(byte[] byteArrayArgument1, int integerArgument2) {
        byteArrayState0031 = byteArrayArgument1;
        integerState0826 = integerArgument2;
        integerState0825 = 0;
    }

    final static VorbisSample computeVorbisSample1916(ResourceArchive resourceArchiveArgument1, String stringArgument2, String stringArgument3) {
        try {
          VorbisSample vorbisSampleLocal1 = null;
          if (!VorbisSample.computeBoolean1914(resourceArchiveArgument1)) {
            resourceArchiveArgument1.computeBoolean0920(stringArgument3, true, stringArgument2);
            return null;
          }
          byte[] byteArrayLocal2 = resourceArchiveArgument1.computeByteArray0916(0, stringArgument3, stringArgument2);
          if (byteArrayLocal2 == null) {
            return null;
          }
          Object objectLocal3 = null;
          try {
            vorbisSampleLocal1 = new VorbisSample(byteArrayLocal2);
          } catch (IOException iOException) {
            iOException.printStackTrace();
          }
          return vorbisSampleLocal1;
        } catch (RuntimeException | Error uncheckedExceptionLocal5) {
          throw uncheckedExceptionLocal5;
        } catch (Throwable checkedExceptionLocal6) {
          throw new RuntimeException(checkedExceptionLocal6);
        }
    }

    private VorbisSample(byte[] byteArrayArgument1) throws IOException {
        this.performAction1917(byteArrayArgument1);
    }

    static {
        booleanState0196 = false;
    }
}
