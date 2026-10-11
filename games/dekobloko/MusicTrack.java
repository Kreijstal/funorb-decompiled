/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicTrack {
    int integerState0803;
    int[] integerArrayState0212;
    int[] integerArrayState0213;
    int[][] integerArrayArrayState0021;
    static SceneWidget sceneWidgetState0127;
    int[] integerArrayState0214;
    static MixedSupport048 mixedSupport048State0003;
    int[] integerArrayState0215;
    int[] integerArrayState0216;
    int[][] integerArrayArrayState0022;
    int integerState0804;
    int[] integerArrayState0217;
    private int integerState0805;
    int[] integerArrayState0218;
    int[] integerArrayState0219;
    int[] integerArrayState0220;
    int[][] integerArrayArrayState0023;
    private int[] integerArrayState0221;
    int[] integerArrayState0222;
    int[] integerArrayState0223;
    private int[] integerArrayState0224;
    int[] integerArrayState0225;
    static SceneWidget[] sceneWidgetArrayState0007;
    int[] integerArrayState0226;
    private int integerState0806;
    int[] integerArrayState0227;
    int[][] integerArrayArrayState0024;
    int[] integerArrayState0228;
    static String stringState0560;
    byte[][] byteArrayArrayState0009;
    int integerState0807;
    int[] integerArrayState0229;
    int integerState0808;
    int[][] integerArrayArrayState0025;
    int[] integerArrayState0230;
    int[] integerArrayState0231;
    int[] integerArrayState0232;
    int integerState0809;
    RawSound[] rawSoundArrayState0003;
    private NetworkSupport011 networkSupport011State0002;
    static String stringState0561;

    final static MixedSupport124 computeMixedSupport1241883(int integerArgument1, String stringArgument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        MixedSupport124 stackMixedSupport124Local2 = null;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        try {
          if (integerArgument1 != 0) {
            sceneWidgetArrayState0007 = (SceneWidget[]) null;
          }
          stackMixedSupport124Local2 = new MixedSupport124(stringArgument2);
          return stackMixedSupport124Local2;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal6 = caughtParameterLocal7;
          runtimeExceptionLocal1 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal1;
          stackStringBuilderLocal4 = new StringBuilder().append("ui.C(").append(integerArgument1).append(',');
          if (stringArgument2 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(')').toString());
        }
    }

    final static String computeString1882(int integerArgument1) {
        if (integerArgument1 != -12040) {
          return (String) null;
        }
        return UiComponentPart006.cipherPacketBufferState0001.computeString2082((byte) -38);
    }

    public static void performAction1884(int integerArgument1) {
        stringState0560 = null;
        mixedSupport048State0003 = null;
        stringState0561 = null;
        sceneWidgetState0127 = null;
        sceneWidgetArrayState0007 = null;
        if (integerArgument1 != 31158) {
          sceneWidgetState0127 = (SceneWidget) null;
        }
    }

    private final void performAction1881(byte byteArgument1) {
        int integerLocal1 = 0;
        int integerLocal2;
        int integerLocal3;
        RawSound rawSoundLocal4;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (this.networkSupport011State0002 == null) {
          return;
        }
        integerLocal2 = 1;
        if (byteArgument1 != 103) {
          MusicTrack.computeString1882(-5);
        }
        for (integerLocal1 = 0; integerLocal1 < this.rawSoundArrayState0003.length; integerLocal1++) {
          if (this.rawSoundArrayState0003[integerLocal1] == null) {
            if (this.integerArrayState0213[integerLocal1] >> 4 == 0) {
              rawSoundLocal4 = this.networkSupport011State0002.computeRawSound1438(-62, this.integerArrayState0224[integerLocal1], this.integerArrayState0221[integerLocal1]);
            } else {
              rawSoundLocal4 = this.networkSupport011State0002.computeRawSound1446(this.integerArrayState0224[integerLocal1], this.integerArrayState0221[integerLocal1], -1);
            }
            if (rawSoundLocal4 != null) {
              this.integerArrayState0213[integerLocal1] = MixedSupport079.computeInteger1051(this.integerArrayState0213[integerLocal1], 15);
              this.rawSoundArrayState0003[integerLocal1] = rawSoundLocal4;
            } else {
              integerLocal2 = 0;
            }
          }
        }
        if (integerLocal2 != 0) {
          this.networkSupport011State0002 = null;
          this.integerArrayState0221 = null;
          this.integerArrayState0224 = null;
        }
    }

    MusicTrack(PacketBuffer packetBufferArgument1, NetworkSupport011 networkSupport011Argument2) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int cachedIntegerLocal3 = 0;
        byte[] byteArrayLocal4 = null;
        int integerLocal5 = 0;
        int cachedIntegerLocal6 = 0;
        int integerLocal7 = 0;
        int[] integerArrayLocal8 = null;
        int integerLocal9 = 0;
        int cachedIntegerLocal10 = 0;
        int localTemp$4 = 0;
        int[] integerArrayLocal12 = null;
        int cachedIntegerLocal13 = 0;
        int[] integerArrayLocal14 = null;
        int cachedIntegerLocal15 = 0;
        int localTemp$9 = 0;
        int[] integerArrayLocal17 = null;
        int cachedIntegerLocal18 = 0;
        int integerLocal19 = 0;
        int integerLocal20 = 0;
        int integerLocal21 = 0;
        int integerLocal22 = 0;
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
        try {
          this.networkSupport011State0002 = networkSupport011Argument2;
          this.integerState0809 = 1 + packetBufferArgument1.computeInteger2085((byte) -58);
          packetBufferArgument1.computeInteger2085((byte) -61);
          this.integerState0807 = 1 + packetBufferArgument1.computeInteger2085((byte) -112);
          this.integerState0806 = 1 + packetBufferArgument1.computeInteger2085((byte) -84);
          this.integerState0805 = packetBufferArgument1.computeInteger2085((byte) -122) + 1;
          integerLocal1 = packetBufferArgument1.computeInteger2085((byte) -98);
          this.integerState0803 = 1 & integerLocal1;
          this.integerState0808 = packetBufferArgument1.computeInteger2085((byte) -27);
          this.integerState0804 = packetBufferArgument1.computeInteger2085((byte) -30);
          this.integerArrayState0220 = new int[this.integerState0809];
          integerLocal2 = 0;
          for (integerLocal19 = 0; integerLocal19 < this.integerState0809; integerLocal19++) {
            cachedIntegerLocal3 = integerLocal2 + packetBufferArgument1.computeInteger2085((byte) -126);
            integerLocal2 = cachedIntegerLocal3;
            this.integerArrayState0220[integerLocal19] = MixedSupport079.computeInteger1051(255, cachedIntegerLocal3);
          }
          this.byteArrayArrayState0009 = new byte[256][];
          this.integerArrayState0212 = new int[256];
          MixedSupport008.performAction0084(this.integerArrayState0212, 0, 256, 64);
          for (integerLocal29 = 0; integerLocal29 < 256; integerLocal29++) {
            this.byteArrayArrayState0009[integerLocal29] = DekoBlokoClient.byteArrayState0004;
          }
          for (integerLocal30 = 0; integerLocal30 < this.integerState0806; integerLocal30++) {
            this.integerArrayState0212[integerLocal30] = 1 + packetBufferArgument1.computeInteger2085((byte) -103);
            integerLocal20 = packetBufferArgument1.computeInteger2089(3);
            byteArrayLocal4 = new byte[integerLocal20];
            if (0 < integerLocal20) {
              packetBufferArgument1.performAction2075(byteArrayLocal4, 0, (byte) 127, integerLocal20);
              this.byteArrayArrayState0009[integerLocal30] = byteArrayLocal4;
            }
          }
          this.integerArrayState0226 = new int[this.integerState0805];
          this.integerArrayState0232 = new int[this.integerState0805];
          this.integerArrayState0218 = new int[this.integerState0805];
          this.integerArrayArrayState0023 = new int[this.integerState0805][];
          this.integerArrayState0228 = new int[this.integerState0805];
          this.integerArrayArrayState0025 = new int[this.integerState0805][96];
          this.integerArrayState0217 = new int[this.integerState0805];
          this.integerArrayArrayState0022 = new int[this.integerState0805][];
          this.integerArrayState0230 = new int[this.integerState0805];
          this.integerArrayState0215 = new int[this.integerState0805];
          this.integerArrayArrayState0024 = new int[this.integerState0805][];
          this.integerArrayState0222 = new int[this.integerState0805];
          this.integerArrayState0231 = new int[this.integerState0805];
          this.integerArrayArrayState0021 = new int[this.integerState0805][];
          integerLocal31 = packetBufferArgument1.computeInteger2089(3);
          this.integerArrayState0213 = new int[integerLocal31];
          this.integerArrayState0221 = new int[integerLocal31];
          this.integerArrayState0223 = new int[integerLocal31];
          this.integerArrayState0225 = new int[integerLocal31];
          this.integerArrayState0227 = new int[integerLocal31];
          this.integerArrayState0224 = new int[integerLocal31];
          this.integerArrayState0216 = new int[integerLocal31];
          this.integerArrayState0229 = new int[integerLocal31];
          this.integerArrayState0219 = new int[integerLocal31];
          this.rawSoundArrayState0003 = new RawSound[integerLocal31];
          this.integerArrayState0214 = new int[integerLocal31];
          integerLocal32 = 0;
          for (integerLocal33 = 0; this.integerState0805 > integerLocal33; integerLocal33++) {
            integerLocal5 = packetBufferArgument1.computeInteger2085((byte) -33);
            if (integerLocal5 > 0) {
              integerLocal23 = 0;
              for (integerLocal21 = 0; 96 > integerLocal21; integerLocal21++) {
                cachedIntegerLocal6 = integerLocal23 + packetBufferArgument1.computeInteger2085((byte) -79);
                integerLocal23 = cachedIntegerLocal6;
                this.integerArrayArrayState0025[integerLocal33][integerLocal21] = integerLocal32 + MixedSupport079.computeInteger1051(cachedIntegerLocal6, 255);
              }
              this.integerArrayState0226[integerLocal33] = packetBufferArgument1.computeInteger2085((byte) -64);
              integerLocal34 = packetBufferArgument1.computeInteger2085((byte) -99);
              this.integerArrayState0231[integerLocal33] = packetBufferArgument1.computeInteger2085((byte) -19);
              this.integerArrayState0217[integerLocal33] = packetBufferArgument1.computeInteger2085((byte) -110);
              this.integerArrayState0228[integerLocal33] = this.integerArrayState0217[integerLocal33] + packetBufferArgument1.computeInteger2085((byte) -66);
              this.integerArrayState0222[integerLocal33] = packetBufferArgument1.computeInteger2085((byte) -110);
              integerLocal7 = packetBufferArgument1.computeInteger2085((byte) -78);
              this.integerArrayState0218[integerLocal33] = packetBufferArgument1.computeInteger2085((byte) -64);
              this.integerArrayState0230[integerLocal33] = packetBufferArgument1.computeInteger2085((byte) -46);
              this.integerArrayState0215[integerLocal33] = this.integerArrayState0230[integerLocal33] + packetBufferArgument1.computeInteger2085((byte) -58);
              integerArrayLocal8 = new int[integerLocal34];
              this.integerArrayArrayState0021[integerLocal33] = integerArrayLocal8;
              integerLocal35 = 0;
              integerLocal9 = 0;
              for (integerLocal22 = 0; integerLocal34 > integerLocal22; integerLocal22++) {
                cachedIntegerLocal10 = integerLocal9 + packetBufferArgument1.computeInteger2088((byte) 126);
                integerLocal9 = cachedIntegerLocal10;
                localTemp$4 = integerLocal35 + cachedIntegerLocal10;
                integerLocal35 = localTemp$4;
                this.integerArrayArrayState0021[integerLocal33][integerLocal22] = localTemp$4;
              }
              integerLocal36 = 0;
              integerArrayLocal12 = new int[integerLocal34];
              this.integerArrayArrayState0023[integerLocal33] = integerArrayLocal12;
              for (integerLocal25 = 0; integerLocal25 < integerLocal34; integerLocal25++) {
                cachedIntegerLocal13 = integerLocal36 + packetBufferArgument1.computeInteger2085((byte) -27);
                integerLocal36 = cachedIntegerLocal13;
                this.integerArrayArrayState0023[integerLocal33][integerLocal25] = MixedSupport079.computeInteger1051(255, cachedIntegerLocal13);
              }
              integerLocal24 = 0;
              integerArrayLocal14 = new int[integerLocal7];
              this.integerArrayArrayState0024[integerLocal33] = integerArrayLocal14;
              integerLocal37 = 0;
              for (integerLocal26 = 0; integerLocal7 > integerLocal26; integerLocal26++) {
                cachedIntegerLocal15 = integerLocal24 + packetBufferArgument1.computeInteger2088((byte) -2);
                integerLocal24 = cachedIntegerLocal15;
                localTemp$9 = integerLocal37 + cachedIntegerLocal15;
                integerLocal37 = localTemp$9;
                this.integerArrayArrayState0024[integerLocal33][integerLocal26] = localTemp$9;
              }
              integerLocal38 = 0;
              integerArrayLocal17 = new int[integerLocal7];
              this.integerArrayArrayState0022[integerLocal33] = integerArrayLocal17;
              for (integerLocal27 = 0; integerLocal7 > integerLocal27; integerLocal27++) {
                cachedIntegerLocal18 = integerLocal38 + packetBufferArgument1.computeInteger2085((byte) -110);
                integerLocal38 = cachedIntegerLocal18;
                this.integerArrayArrayState0022[integerLocal33][integerLocal27] = MixedSupport079.computeInteger1051(255, cachedIntegerLocal18);
              }
              this.integerArrayState0232[integerLocal33] = packetBufferArgument1.computeInteger2089(3);
              for (integerLocal28 = 0; integerLocal5 > integerLocal28; integerLocal28++) {
                this.integerArrayState0214[integerLocal32] = packetBufferArgument1.computeInteger2095(65280);
                this.integerArrayState0227[integerLocal32] = packetBufferArgument1.computeInteger2095(65280);
                this.integerArrayState0223[integerLocal32] = this.integerArrayState0227[integerLocal32] + packetBufferArgument1.computeInteger2095(65280);
                this.integerArrayState0216[integerLocal32] = packetBufferArgument1.computeInteger2085((byte) -112);
                this.integerArrayState0219[integerLocal32] = packetBufferArgument1.computeByte2093((byte) -104);
                this.integerArrayState0213[integerLocal32] = packetBufferArgument1.computeInteger2085((byte) -65);
                this.integerArrayState0229[integerLocal32] = packetBufferArgument1.computeInteger2085((byte) -54);
                this.integerArrayState0225[integerLocal32] = -1 + packetBufferArgument1.computeByte2093((byte) -108);
                this.integerArrayState0221[integerLocal32] = packetBufferArgument1.computeInteger2089(3);
                this.integerArrayState0224[integerLocal32] = packetBufferArgument1.computeInteger2089(3);
                integerLocal32++;
              }
            }
          }
          this.performAction1881((byte) 103);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "ui.<init>(" + (packetBufferArgument1 != null ? "{...}" : "null") + ',' + (networkSupport011Argument2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        stringState0560 = "Steady...";
        mixedSupport048State0003 = new MixedSupport048(2);
        stringState0561 = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
    }
}
