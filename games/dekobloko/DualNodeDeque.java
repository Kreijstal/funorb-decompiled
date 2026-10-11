/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class DualNodeDeque {
    static String stringState0006;
    static int integerState0015;
    static java.util.zip.CRC32 cRC32State0001;
    private DualNode dualNodeState0001;
    static int integerState0016;
    private DualNode dualNodeState0002;
    static String stringState0007;

    final static int computeInteger0038(int integerArgument1) {
        int integerLocal1 = 0;
        if (!(UiComponentPart017.integerState0437 <= integerLocal1)) {
          integerLocal1 = UiComponentPart017.integerState0437;
        }
        if (integerLocal1 < RenderingSupport001.integerState0064) {
          integerLocal1 = RenderingSupport001.integerState0064;
        }
        if (integerArgument1 != -28199) {
          integerState0015 = -18;
        }
        if (!(MixedSupport127.integerState0778 <= integerLocal1)) {
          integerLocal1 = MixedSupport127.integerState0778;
        }
        return integerLocal1;
    }

    final DualNode computeDualNode0033(byte byteArgument1) {
        DualNode dualNodeLocal1 = this.dualNodeState0002;
        if (dualNodeLocal1 == this.dualNodeState0001) {
          this.dualNodeState0002 = null;
          return null;
        }
        if (byteArgument1 != 20) {
          return (DualNode) null;
        }
        this.dualNodeState0002 = dualNodeLocal1.dualNodeState0003;
        return dualNodeLocal1;
    }

    final void performAction0032(DualNode dualNodeArgument1, int integerArgument2) {
        DualNode dualNodeLocal1 = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        RuntimeException runtimeExceptionLocal6 = null;
        try {
          if (dualNodeArgument1.dualNodeState0004 != null) {
            dualNodeArgument1.performAction0145((byte) 101);
          }
          dualNodeArgument1.dualNodeState0003 = this.dualNodeState0001;
          dualNodeArgument1.dualNodeState0004 = this.dualNodeState0001.dualNodeState0004;
          dualNodeArgument1.dualNodeState0004.dualNodeState0003 = dualNodeArgument1;
          dualNodeArgument1.dualNodeState0003.dualNodeState0004 = dualNodeArgument1;
          if (integerArgument2 != -7267) {
            dualNodeLocal1 = (DualNode) null;
            this.performAction0032((DualNode) null, 54);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal5 = caughtParameterLocal7;
          runtimeExceptionLocal6 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal6;
          stackStringBuilderLocal3 = new StringBuilder().append("ab.F(");
          if (dualNodeArgument1 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',').append(integerArgument2).append(')').toString());
        }
    }

    final DualNode computeDualNode0029(byte byteArgument1) {
        DualNode dualNodeLocal1 = this.dualNodeState0001.dualNodeState0003;
        if (this.dualNodeState0001 == dualNodeLocal1) {
          return null;
        }
        dualNodeLocal1.performAction0145((byte) 94);
        int integerLocal2 = 27 / ((1 - byteArgument1) / 39);
        return dualNodeLocal1;
    }

    final DualNode computeDualNode0034(int integerArgument1) {
        if (integerArgument1 != -2198) {
          this.computeDualNode0034(61);
        }
        DualNode dualNodeLocal1 = this.dualNodeState0001.dualNodeState0003;
        if (this.dualNodeState0001 == dualNodeLocal1) {
          this.dualNodeState0002 = null;
          return null;
        }
        this.dualNodeState0002 = dualNodeLocal1.dualNodeState0003;
        return dualNodeLocal1;
    }

    final static long computeLong0031(int integerArgument1, CharSequence charSequenceArgument2) {
        int integerLocal1 = 0;
        long stackLongLocal2 = 0L;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        long longLocal7 = 0L;
        RuntimeException runtimeExceptionLocal8 = null;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        integerLocal11 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          longLocal7 = 0L;
          integerLocal9 = charSequenceArgument2.length();
          for (integerLocal1 = 0; integerLocal1 < integerLocal9; integerLocal1++) {
            longLocal7 = longLocal7 * 37L;
            integerLocal10 = charSequenceArgument2.charAt(integerLocal1);
            if (integerLocal10 >= 65 &&
              integerLocal10 <= 90) {
              longLocal7 = longLocal7 + (long)(-65 + integerLocal10 + 1);
            } else if (97 <= integerLocal10 &&
              integerLocal10 <= 122) {
              longLocal7 = longLocal7 + (long)(-97 + (integerLocal10 + 1));
            } else {
              if (integerLocal10 >= 48 &&
                57 >= integerLocal10) {
                longLocal7 = longLocal7 + (long)(integerLocal10 + 27 - 48);
              }
            }
            if (longLocal7 < 177917621779460413L) {
              continue;
            }
            break;
          }
          if (integerArgument1 <= 95) {
            integerState0016 = -6;
          }
          while (0L == longLocal7 % 37L) {
            if (longLocal7 != 0L) {
              longLocal7 = longLocal7 / 37L;
              continue;
            }
            break;
          }
          stackLongLocal2 = longLocal7;
          return stackLongLocal2;
        } catch (java.lang.RuntimeException caughtParameterLocal12) {
          caughtExceptionLocal6 = caughtParameterLocal12;
          runtimeExceptionLocal8 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal8;
          stackStringBuilderLocal4 = new StringBuilder().append("ab.E(").append(integerArgument1).append(',');
          if (charSequenceArgument2 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(')').toString());
        }
    }

    final static boolean computeBoolean0035(byte byteArgument1) {
        int integerLocal1 = 0;
        Object objectLocal2 = null;
        Object objectLocal3 = null;
        Throwable throwableLocal4 = null;
        boolean stackBooleanLocal5 = false;
        Throwable caughtExceptionLocal6 = null;
        integerLocal1 = 108 % ((-69 - byteArgument1) / 50);
        objectLocal3 = MixedSupport033.inputAdapter004State0001;
        synchronized (objectLocal3) {
          if (RichTextLayout.integerState0160 == MixedSupport120.integerState0746) {
            return false;
          }
          MixedSupport153.integerState0931 = MixedSupport104.integerArrayState0182[MixedSupport120.integerState0746];
          ArchiveRequestManager.characterState0002 = UiComponentPart003.characterArrayState0003[MixedSupport120.integerState0746];
          MixedSupport120.integerState0746 = 1 + MixedSupport120.integerState0746 & 127;
          stackBooleanLocal5 = true;
        }
        return stackBooleanLocal5;
    }

    public static void performAction0037(int integerArgument1) {
        cRC32State0001 = null;
        stringState0006 = null;
        if (integerArgument1 != 1) {
          DualNodeDeque.computeInteger0038(-99);
        }
        stringState0007 = null;
    }

    final int computeInteger0030(int integerArgument1) {
        int integerLocal1 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        int integerLocal2 = integerArgument1;
        DualNode dualNodeLocal3 = this.dualNodeState0001.dualNodeState0003;
        while (dualNodeLocal3 != this.dualNodeState0001) {
          integerLocal2++;
          dualNodeLocal3 = dualNodeLocal3.dualNodeState0003;
        }
        return integerLocal2;
    }

    final static boolean computeBoolean0036(int integerArgument1) {
        boolean stackBooleanLocal1 = false;
        if (integerArgument1 != 48) {
          DualNodeDeque.computeBoolean0028(45);
        }
        stackBooleanLocal1 = (null != MixedSupport071.sceneWidgetPart001State0001) || (GameDomainSupport004.booleanState0087);
        return stackBooleanLocal1;
    }

    public DualNodeDeque() {
        this.dualNodeState0001 = new DualNode();
        this.dualNodeState0001.dualNodeState0004 = this.dualNodeState0001;
        this.dualNodeState0001.dualNodeState0003 = this.dualNodeState0001;
    }

    static {
        stringState0006 = "Resign";
        integerState0015 = 64;
        cRC32State0001 = new java.util.zip.CRC32();
        stringState0007 = "Unfortunately you are not eligible to create an account.";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static boolean computeBoolean0028(int integerArgument1) {
        int integerLocal1 = 0;
        Object objectLocal2 = null;
        Object objectLocal3 = null;
        Throwable throwableLocal4 = null;
        boolean stackBooleanLocal5 = false;
        Throwable caughtExceptionLocal6 = null;
        integerLocal1 = 108 % ((-69 - integerArgument1) / 50);
        objectLocal3 = MixedSupport033.inputAdapter004State0001;
        synchronized (objectLocal3) {
          if (RichTextLayout.integerState0160 == MixedSupport120.integerState0746) {
            return false;
          }
          MixedSupport153.integerState0931 = MixedSupport104.integerArrayState0182[MixedSupport120.integerState0746];
          ArchiveRequestManager.characterState0002 = UiComponentPart003.characterArrayState0003[MixedSupport120.integerState0746];
          MixedSupport120.integerState0746 = 1 + MixedSupport120.integerState0746 & 127;
          stackBooleanLocal5 = true;
        }
        return stackBooleanLocal5;
    }
}
