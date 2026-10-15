/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class PacketReceiveHelpers {
    static int[] viewFacePointThreeX;
    static String field_d;
    static boolean field_e;
    static BirthDateEntryPanel field_a;
    static int field_c;
    static ArchiveFetchClient field_f;

    final static boolean ensureGamePacketBytes(int obfuscationGuard, int length) {
        try {
          int availableBytes = 0;
          IOException readFailure = null;
          Throwable caughtFailure = null;
          if (obfuscationGuard != 20) {
            PacketReceiveHelpers.a(-79);
          }
          if (length <= jl.incomingPackets.position) {
            return true;
          }
          if (null == WhirlpoolHasher.gameTransport) {
            return false;
          }
          try {
            availableBytes = WhirlpoolHasher.gameTransport.available(10434);
            if (0 >= availableBytes) {
              if (availableBytes < 0) {
                hn.closeGameTransport((byte) 123);
                return false;
              }
              if (MembershipBenefitsScreen.getMillisSinceGameRead(obfuscationGuard - 6812) <= 30000L) {
                return false;
              }
              hn.closeGameTransport((byte) 123);
              return false;
            }
            if (availableBytes > length - jl.incomingPackets.position) {
              availableBytes = -jl.incomingPackets.position + length;
            }
            WhirlpoolHasher.gameTransport.readFully(obfuscationGuard + 25806, jl.incomingPackets.data, availableBytes, jl.incomingPackets.position);
            RichTextLayout.lastGameReadMillis = MonotonicTime.nowMillis(false);
            jl.incomingPackets.position = jl.incomingPackets.position + availableBytes;
            if (length > jl.incomingPackets.position) {
              return false;
            }
            jl.incomingPackets.position = 0;
            return true;
          } catch (java.io.IOException caughtReadFailure) {
            caughtFailure = caughtReadFailure;
            readFailure = (IOException) (Object) caughtFailure;
            hn.closeGameTransport((byte) 111);
            return false;
          }
        } catch (RuntimeException | Error uncheckedFailure) {
          throw uncheckedFailure;
        } catch (Throwable checkedFailure) {
          throw new RuntimeException(checkedFailure);
        }
    }

    final static void a(int param0) {
        ScrollPane.h(-29448);
        if (param0 >= -126) {
          field_a = (BirthDateEntryPanel) null;
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        field_a = null;
        if (!param0) {
          return;
        }
        viewFacePointThreeX = null;
        field_d = null;
    }

    static {
        field_e = true;
        field_c = 20;
        viewFacePointThreeX = new int[8192];
    }
}
