/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class CollectionSupport001 implements Iterator {
    private int integerState0121;
    private HashNode hashNodeState0003;
    private HashNode hashNodeState0004;
    private NodeHashTable nodeHashTableState0001;
    static int[] integerArrayState0025;
    static int[] integerArrayState0026;
    static int[] integerArrayState0027;
    static int[] integerArrayState0028;
    static String stringState0098;
    static String stringState0099;
    static MixedSupport059 mixedSupport059State0001;

    public final Object next() {
        int integerLocal1 = 0;
        HashNode hashNodeLocal2;
        int integerLocal3;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (this.hashNodeState0003 != this.nodeHashTableState0001.hashNodeArrayState0002[this.integerState0121 - 1]) {
          hashNodeLocal2 = this.hashNodeState0003;
          this.hashNodeState0003 = hashNodeLocal2.previous;
          this.hashNodeState0004 = hashNodeLocal2;
          return hashNodeLocal2;
        }
        do {
          if (this.nodeHashTableState0001.integerState0748 <= this.integerState0121) {
            return null;
          }
          integerLocal1 = this.integerState0121;
          this.integerState0121 = this.integerState0121 + 1;
          hashNodeLocal2 = this.nodeHashTableState0001.hashNodeArrayState0002[integerLocal1].previous;
        } while (hashNodeLocal2 == this.nodeHashTableState0001.hashNodeArrayState0002[-1 + this.integerState0121]);
        this.hashNodeState0003 = hashNodeLocal2.previous;
        this.hashNodeState0004 = hashNodeLocal2;
        return hashNodeLocal2;
    }

    final static void performAction0337(byte byteArgument1) {
        int integerLocal1 = 0;
        RuntimeException caughtExceptionLocal2 = null;
        RuntimeException runtimeExceptionLocal3 = null;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        int integerLocal6 = 0;
        MixedSupport118 mixedSupport118Local7 = null;
        MixedSupport038 mixedSupport038Local8 = null;
        int integerLocal9 = 0;
        int[] integerArrayLocal10 = null;
        int integerLocal11 = 0;
        CipherPacketBuffer cipherPacketBufferLocal12 = null;
        int[] integerArrayLocal13 = null;
        int[] integerArrayLocal14 = null;
        integerLocal11 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          cipherPacketBufferLocal12 = UiComponentPart006.cipherPacketBufferState0001;
          if (byteArgument1 != 53) {
            CollectionSupport001.performAction0339(20);
          }
          integerLocal4 = cipherPacketBufferLocal12.computeInteger2085((byte) -44);
          integerLocal5 = cipherPacketBufferLocal12.computeInteger2085((byte) -117);
          if (integerLocal4 == 0) {
            mixedSupport118Local7 = (MixedSupport118) (UiComponentPart010.nodeDequeState0008.computeHashNode1970((byte) -68));
            if (mixedSupport118Local7 == null) {
              NodeHashTable.performAction1703(78);
              return;
            }
            integerLocal9 = NetworkSupport012.integerState0759 - cipherPacketBufferLocal12.position;
            integerArrayLocal14 = mixedSupport118Local7.integerArrayState0202;
            integerArrayLocal13 = integerArrayLocal14;
            integerArrayLocal10 = integerArrayLocal13;
            if (integerArrayLocal14.length << 2 < integerLocal9) {
              integerLocal9 = integerArrayLocal14.length << 2;
            }
            for (integerLocal1 = 0; integerLocal1 < integerLocal9; integerLocal1++) {
              integerArrayLocal10[integerLocal1 >> 2] = integerArrayLocal10[integerLocal1 >> 2] + (cipherPacketBufferLocal12.computeInteger2085((byte) -108) << (MixedSupport079.computeInteger1051(3, integerLocal1) << 8));
            }
            mixedSupport118Local7.booleanState0168 = true;
            mixedSupport118Local7.performAction0161((byte) 118);
            return;
          }
          if (integerLocal4 == 1) {
            integerLocal6 = cipherPacketBufferLocal12.computeInteger2088((byte) -2);
            mixedSupport038Local8 = (MixedSupport038) (MixedSupport016.nodeDequeState0003.computeHashNode1970((byte) -124));
            while (mixedSupport038Local8 != null) {
              if (integerLocal5 != mixedSupport038Local8.integerState0230 ||
                integerLocal6 != mixedSupport038Local8.integerState0227) {
                mixedSupport038Local8 = (MixedSupport038) (MixedSupport016.nodeDequeState0003.computeHashNode1974(true));
                continue;
              }
              break;
            }
            if (mixedSupport038Local8 == null) {
              NodeHashTable.performAction1703(71);
              return;
            }
            mixedSupport038Local8.performAction0161((byte) 124);
            return;
          }
          NetworkArchiveRequestManager.performAction1468((Throwable) null, 16408, "LR1: " + BufferedSocket.computeString1563((byte) 74));
          NodeHashTable.performAction1703(100);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal15) {
          caughtExceptionLocal2 = caughtParameterLocal15;
          runtimeExceptionLocal3 = caughtExceptionLocal2;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal3), "cm.A(" + byteArgument1 + ')');
        }
    }

    private final void performAction0340(byte byteArgument1) {
        int integerLocal1 = 4 / ((-61 - byteArgument1) / 36);
        this.integerState0121 = 1;
        this.hashNodeState0004 = null;
        this.hashNodeState0003 = this.nodeHashTableState0001.hashNodeArrayState0002[0].previous;
    }

    public final boolean hasNext() {
        int integerLocal1 = 0;
        int integerLocal2;
        integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (this.hashNodeState0003 != this.nodeHashTableState0001.hashNodeArrayState0002[-1 + this.integerState0121]) {
          return true;
        }
        while (true) {
          if (this.integerState0121 >= this.nodeHashTableState0001.integerState0748) {
            return false;
          }
          integerLocal1 = this.integerState0121;
          this.integerState0121 = this.integerState0121 + 1;
          if (this.nodeHashTableState0001.hashNodeArrayState0002[integerLocal1].previous == this.nodeHashTableState0001.hashNodeArrayState0002[this.integerState0121 - 1]) {
            this.hashNodeState0003 = this.nodeHashTableState0001.hashNodeArrayState0002[this.integerState0121 - 1];
            continue;
          }
          break;
        }
        this.hashNodeState0003 = this.nodeHashTableState0001.hashNodeArrayState0002[-1 + this.integerState0121].previous;
        return true;
    }

    public static void performAction0339(int integerArgument1) {
        integerArrayState0026 = null;
        mixedSupport059State0001 = null;
        integerArrayState0028 = null;
        integerArrayState0027 = null;
        integerArrayState0025 = null;
        stringState0098 = null;
        stringState0099 = null;
        if (integerArgument1 != 1714134600) {
          integerArrayState0025 = (int[]) null;
        }
    }

    public final void remove() {
        if (this.hashNodeState0004 == null) {
          throw new IllegalStateException();
        }
        this.hashNodeState0004.performAction0161((byte) 112);
        this.hashNodeState0004 = null;
    }

    final static String computeString0338(byte byteArgument1, String stringArgument2, String[] stringArrayArgument3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackStringLocal4 = null;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        RuntimeException caughtExceptionLocal10 = null;
        int integerLocal11 = 0;
        RuntimeException runtimeExceptionLocal12 = null;
        int integerLocal13 = 0;
        int integerLocal14 = 0;
        int integerLocal15 = 0;
        StringBuilder stringBuilderLocal16 = null;
        String stringLocal17 = null;
        int integerLocal18 = 0;
        int integerLocal19 = 0;
        String stringLocal20 = null;
        int integerLocal21 = 0;
        int integerLocal22 = 0;
        int integerLocal23;
        int integerLocal24;
        integerLocal22 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal11 = stringArgument2.length();
          integerLocal13 = integerLocal11;
          integerLocal14 = 0;
          while (true) {
            integerLocal15 = stringArgument2.indexOf("<%", integerLocal14);
            if (integerLocal15 >= 0) {
              for (integerLocal14 = 2 + integerLocal15; integerLocal14 < integerLocal11; integerLocal14++) {
                if (MixedSupport042.computeBoolean0591(stringArgument2.charAt(integerLocal14), (byte) 23)) {
                  continue;
                }
                break;
              }
              stringLocal17 = stringArgument2.substring(2 + integerLocal15, integerLocal14);
              if (!DualNode.computeBoolean0139((byte) 98, (CharSequence) ((Object) stringLocal17))) {
                continue;
              }
              if (integerLocal11 <= integerLocal14) {
                continue;
              }
              if (stringArgument2.charAt(integerLocal14) != 62) {
                continue;
              }
              integerLocal14++;
              integerLocal19 = MixedSupport014.computeInteger0207((byte) -72, (CharSequence) ((Object) stringLocal17));
              integerLocal13 = integerLocal13 + (integerLocal15 - (integerLocal14 - stringArrayArgument3[integerLocal19].length()));
              continue;
            }
            break;
          }
          stringBuilderLocal16 = new StringBuilder(integerLocal13);
          integerLocal23 = 0;
          if (byteArgument1 <= 80) {
            CollectionSupport001.performAction0337((byte) -121);
          }
          integerLocal18 = 0;
          while (true) {
            integerLocal24 = stringArgument2.indexOf("<%", integerLocal23);
            if (integerLocal24 < 0) {
              discarded$2 = stringBuilderLocal16.append(stringArgument2.substring(integerLocal18));
              stackStringLocal4 = stringBuilderLocal16.toString();
              return stackStringLocal4;
            }
            for (integerLocal23 = integerLocal24 + 2; integerLocal11 > integerLocal23; integerLocal23++) {
              if (MixedSupport042.computeBoolean0591(stringArgument2.charAt(integerLocal23), (byte) 23)) {
                continue;
              }
              break;
            }
            stringLocal20 = stringArgument2.substring(2 + integerLocal24, integerLocal23);
            if (!DualNode.computeBoolean0139((byte) 98, (CharSequence) ((Object) stringLocal20))) {
              continue;
            }
            if (integerLocal23 >= integerLocal11) {
              continue;
            }
            if (stringArgument2.charAt(integerLocal23) != 62) {
              continue;
            }
            integerLocal23++;
            integerLocal21 = MixedSupport014.computeInteger0207((byte) 100, (CharSequence) ((Object) stringLocal20));
            discarded$0 = stringBuilderLocal16.append(stringArgument2.substring(integerLocal18, integerLocal24));
            integerLocal18 = integerLocal23;
            discarded$1 = stringBuilderLocal16.append(stringArrayArgument3[integerLocal21]);
          }
        } catch (java.lang.RuntimeException caughtParameterLocal25) {
          caughtExceptionLocal10 = caughtParameterLocal25;
          runtimeExceptionLocal12 = caughtExceptionLocal10;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal12;
          stackStringBuilderLocal6 = new StringBuilder().append("cm.D(").append(byteArgument1).append(',');
          if (stringArgument2 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          stackStringBuilderLocal8 = ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',');
          if (stringArrayArgument3 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(')').toString());
        }
    }

    CollectionSupport001(NodeHashTable nodeHashTableArgument1) {
        this.hashNodeState0004 = null;
        try {
          this.nodeHashTableState0001 = nodeHashTableArgument1;
          this.performAction0340((byte) -117);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "cm.<init>(" + (nodeHashTableArgument1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int integerLocal1 = 0;
        int[] integerArrayLocal2 = null;
        int integerLocal3 = 0;
        int[] integerArrayLocal4;
        int integerLocal5;
        int integerLocal6;
        integerArrayState0025 = UiComponentPart002.computeIntegerArray0091(-126);
        integerArrayState0026 = UiComponentPart002.computeIntegerArray0091(80);
        integerArrayState0027 = UiComponentPart002.computeIntegerArray0091(-125);
        integerArrayState0028 = UiComponentPart002.computeIntegerArray0091(86);
        for (integerLocal1 = 0; integerLocal1 < 15; integerLocal1++) {
          integerArrayLocal2 = integerArrayState0025;
          integerLocal3 = integerLocal1;
          integerArrayLocal2[integerLocal3 >> 5] = UiComponentPart006.computeInteger0388(integerArrayLocal2[integerLocal3 >> 5], 1 << MixedSupport079.computeInteger1051(integerLocal3, 31));
        }
        for (integerLocal5 = 15; 31 > integerLocal5; integerLocal5++) {
          integerArrayLocal4 = integerArrayState0026;
          integerLocal6 = integerLocal5;
          integerArrayLocal4[integerLocal6 >> 5] = UiComponentPart006.computeInteger0388(integerArrayLocal4[integerLocal6 >> 5], 1 << MixedSupport079.computeInteger1051(31, integerLocal6));
        }
        int[] integerArrayLocal7 = integerArrayState0027;
        integerArrayLocal7[0] = UiComponentPart006.computeInteger0388(integerArrayLocal7[0], 8);
        int[] integerArrayLocal8 = integerArrayState0027;
        integerArrayLocal8[0] = UiComponentPart006.computeInteger0388(integerArrayLocal8[0], 128);
        int[] integerArrayLocal9 = integerArrayState0027;
        integerArrayLocal9[0] = UiComponentPart006.computeInteger0388(integerArrayLocal9[0], 4194304);
        int[] integerArrayLocal10 = integerArrayState0028;
        integerArrayLocal10[0] = UiComponentPart006.computeInteger0388(integerArrayLocal10[0], 1);
        int[] integerArrayLocal11 = integerArrayState0028;
        integerArrayLocal11[0] = UiComponentPart006.computeInteger0388(integerArrayLocal11[0], 2048);
        stringState0098 = "Creating your account";
        stringState0099 = "Connection lost. <%0>";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static String computeString0336(int integerArgument1, String stringArgument2, String[] stringArrayArgument3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackStringLocal4 = null;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        RuntimeException caughtExceptionLocal10 = null;
        int integerLocal11 = 0;
        RuntimeException runtimeExceptionLocal12 = null;
        int integerLocal13 = 0;
        int integerLocal14 = 0;
        int integerLocal15 = 0;
        StringBuilder stringBuilderLocal16 = null;
        String stringLocal17 = null;
        int integerLocal18 = 0;
        int integerLocal19 = 0;
        String stringLocal20 = null;
        int integerLocal21 = 0;
        int integerLocal22 = 0;
        int integerLocal23;
        int integerLocal24;
        integerLocal22 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal11 = stringArgument2.length();
          integerLocal13 = integerLocal11;
          integerLocal14 = 0;
          while (true) {
            integerLocal15 = stringArgument2.indexOf("<%", integerLocal14);
            if (integerLocal15 >= 0) {
              for (integerLocal14 = 2 + integerLocal15; integerLocal14 < integerLocal11; integerLocal14++) {
                if (MixedSupport042.computeBoolean0591(stringArgument2.charAt(integerLocal14), (byte) 23)) {
                  continue;
                }
                break;
              }
              stringLocal17 = stringArgument2.substring(2 + integerLocal15, integerLocal14);
              if (!DualNode.computeBoolean0139((byte) 98, (CharSequence) ((Object) stringLocal17))) {
                continue;
              }
              if (integerLocal11 <= integerLocal14) {
                continue;
              }
              if (stringArgument2.charAt(integerLocal14) != 62) {
                continue;
              }
              integerLocal14++;
              integerLocal19 = MixedSupport014.computeInteger0207((byte) -72, (CharSequence) ((Object) stringLocal17));
              integerLocal13 = integerLocal13 + (integerLocal15 - (integerLocal14 - stringArrayArgument3[integerLocal19].length()));
              continue;
            }
            break;
          }
          stringBuilderLocal16 = new StringBuilder(integerLocal13);
          integerLocal23 = 0;
          if (integerArgument1 <= 80) {
            CollectionSupport001.performAction0337((byte) -121);
          }
          integerLocal18 = 0;
          while (true) {
            integerLocal24 = stringArgument2.indexOf("<%", integerLocal23);
            if (integerLocal24 < 0) {
              discarded$2 = stringBuilderLocal16.append(stringArgument2.substring(integerLocal18));
              stackStringLocal4 = stringBuilderLocal16.toString();
              return stackStringLocal4;
            }
            for (integerLocal23 = integerLocal24 + 2; integerLocal11 > integerLocal23; integerLocal23++) {
              if (MixedSupport042.computeBoolean0591(stringArgument2.charAt(integerLocal23), (byte) 23)) {
                continue;
              }
              break;
            }
            stringLocal20 = stringArgument2.substring(2 + integerLocal24, integerLocal23);
            if (!DualNode.computeBoolean0139((byte) 98, (CharSequence) ((Object) stringLocal20))) {
              continue;
            }
            if (integerLocal23 >= integerLocal11) {
              continue;
            }
            if (stringArgument2.charAt(integerLocal23) != 62) {
              continue;
            }
            integerLocal23++;
            integerLocal21 = MixedSupport014.computeInteger0207((byte) 100, (CharSequence) ((Object) stringLocal20));
            discarded$0 = stringBuilderLocal16.append(stringArgument2.substring(integerLocal18, integerLocal24));
            integerLocal18 = integerLocal23;
            discarded$1 = stringBuilderLocal16.append(stringArrayArgument3[integerLocal21]);
          }
        } catch (java.lang.RuntimeException caughtParameterLocal25) {
          caughtExceptionLocal10 = caughtParameterLocal25;
          runtimeExceptionLocal12 = caughtExceptionLocal10;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal12;
          stackStringBuilderLocal6 = new StringBuilder().append("cm.D(").append(integerArgument1).append(',');
          if (stringArgument2 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          stackStringBuilderLocal8 = ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',');
          if (stringArrayArgument3 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(')').toString());
        }
    }
}
