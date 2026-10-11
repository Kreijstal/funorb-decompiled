/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class MixedSupport028 {
    int integerState0165;
    String[] stringArrayState0009;
    static ResourceArchive resourceArchiveState0004;
    int integerState0166;
    BucketBoard[] bucketBoardArrayState0001;
    int integerState0167;
    int integerState0168;
    boolean booleanState0031;
    static String stringState0137;
    int[] integerArrayState0034;
    int integerState0169;
    int integerState0170;
    static String stringState0138;
    int integerState0171;
    static String stringState0139;
    int integerState0172;
    static String stringState0140;
    int integerState0173;

    final int computeInteger0442(int integerArgument1) {
        if (integerArgument1 != 6) {
          this.bucketBoardArrayState0001 = (BucketBoard[]) null;
        }
        int integerLocal1 = 2;
        if (3 <= this.integerState0172) {
          integerLocal1 = 4;
        }
        if (this.integerState0172 >= 4) {
          integerLocal1 = 6;
        }
        return UiComponentPart016.computeInteger0944((byte) 81, integerLocal1, UiComponentPart031.randomState0003) + 24;
    }

    public static void performAction0440(int integerArgument1) {
        stringState0138 = null;
        stringState0137 = null;
        if (integerArgument1 != 92) {
          stringState0137 = (String) null;
        }
        stringState0139 = null;
        stringState0140 = null;
        resourceArchiveState0004 = null;
    }

    final static void performAction0441(int integerArgument1) {
        DualNode.integerArrayState0018[93] = 43;
        DualNode.integerArrayState0018[59] = 57;
        DualNode.integerArrayState0018[45] = 26;
        DualNode.integerArrayState0018[46] = 72;
        DualNode.integerArrayState0018[61] = 27;
        DualNode.integerArrayState0018[92] = 74;
        int integerLocal1 = 118 % ((integerArgument1 - 62) / 56);
        DualNode.integerArrayState0018[520] = 59;
        DualNode.integerArrayState0018[192] = 28;
        DualNode.integerArrayState0018[222] = 58;
        DualNode.integerArrayState0018[47] = 73;
        DualNode.integerArrayState0018[91] = 42;
        DualNode.integerArrayState0018[44] = 71;
    }

    final void performAction0439(int integerArgument1, byte byteArgument2) {
        int integerLocal1 = 0;
        BucketBoard bucketBoardLocal2;
        int integerLocal3;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (byteArgument2 > -49) {
          this.integerState0171 = 43;
        }
        this.integerState0165 = integerArgument1;
        this.booleanState0031 = true;
        for (integerLocal1 = 0; integerLocal1 < this.integerState0173; integerLocal1++) {
          bucketBoardLocal2 = this.bucketBoardArrayState0001[integerLocal1];
          if (bucketBoardLocal2 != null) {
            bucketBoardLocal2.performAction1115(-9897);
          }
        }
    }

    final static void performAction0438(int integerArgument1) {
        MixedSupport064.performAction0849(8225);
        if (integerArgument1 != 58) {
          MixedSupport028.performAction0440(-112);
        }
    }

    MixedSupport028(int integerArgument1, boolean booleanArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, String[] stringArrayArgument7) {
        int integerLocal1 = 0;
        try {
          this.integerState0166 = integerArgument1;
          this.integerState0172 = integerArgument6;
          this.integerState0173 = stringArrayArgument7 != null ? stringArrayArgument7.length : 1;
          this.integerArrayState0034 = new int[this.integerState0173];
          this.integerState0167 = 0;
          this.stringArrayState0009 = stringArrayArgument7;
          this.bucketBoardArrayState0001 = new BucketBoard[this.integerState0173];
          for (integerLocal1 = 0; this.integerState0173 > integerLocal1; integerLocal1++) {
            this.bucketBoardArrayState0001[integerLocal1] = new BucketBoard(booleanArgument2, integerArgument3, integerArgument4, integerArgument5, this.integerState0172);
            this.bucketBoardArrayState0001[integerLocal1].integerState0453 = integerLocal1;
            this.integerArrayState0034[integerLocal1] = -1;
          }
          this.integerState0168 = this.integerState0173;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "eb.<init>(" + integerArgument1 + ',' + booleanArgument2 + ',' + integerArgument3 + ',' + integerArgument4 + ',' + integerArgument5 + ',' + integerArgument6 + ',' + (stringArrayArgument7 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        stringState0138 = "You need to play <%0> more rated games to unlock this option.";
        stringState0139 = "Quick Chat game";
        stringState0140 = "SPEED UP!";
    }
}
