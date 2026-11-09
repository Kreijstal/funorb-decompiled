/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Base37NameAlphabet {
    static char[] alphabet;
    static AccountRequestState nameAvailabilityState;
    static ToolkitSprite[] field_a;

    final static int ticksPerSecond(int guard) {
        if (guard > -30) {
          Base37NameAlphabet.ticksPerSecond(-16);
          return (int)(1000000000L / DualLinkNode.field_p);
        }
        return (int)(1000000000L / DualLinkNode.field_p);
    }

    public static void releaseStatics(byte param0) {
        nameAvailabilityState = null;
        if (param0 < 101) {
          alphabet = (char[]) null;
          alphabet = null;
          field_a = null;
          return;
        }
        alphabet = null;
        field_a = null;
    }

    static {
        alphabet = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
    }
}
