/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveFactory {
    static ResourceArchive field_b;
    static String serviceunavailable;

    public static void releaseStatics(byte param0) {
        field_b = null;
        if (param0 != 62) {
          ArchiveFactory.createResourceArchive(-19, (byte) -76);
          serviceunavailable = null;
          return;
        }
        serviceunavailable = null;
    }

    final static ResourceArchive createResourceArchive(int param0, byte param1) {
        if (param1 == 103) {
          return ParticleTrail.a(1, true, (byte) -56, param0, false, false);
        }
        ArchiveFactory.releaseStatics((byte) 116);
        return ParticleTrail.a(1, true, (byte) -56, param0, false, false);
    }

    static {
        serviceunavailable = "Service unavailable";
    }
}
