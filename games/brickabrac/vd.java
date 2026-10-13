/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vd {
    static int[] field_b;
    static String field_d;
    static boolean field_e;
    static mo field_a;
    static int field_c;
    static ArchiveFetchClient field_f;

    final static boolean ensureGamePacketBytes(int obfuscationGuard, int length) {
        try {
          int availableBytes = 0;
          IOException var2 = null;
          Throwable decompiledCaughtException = null;
          if (obfuscationGuard != 20) {
            vd.a(-79);
          }
          if (length <= jl.incomingPackets.position) {
            return true;
          }
          if (null == eq.gameTransport) {
            return false;
          }
          try {
            availableBytes = eq.gameTransport.available(10434);
            if (0 >= availableBytes) {
              if (availableBytes < 0) {
                hn.a((byte) 123);
                return false;
              }
              if (MembershipBenefitsScreen.f(obfuscationGuard - 6812) <= 30000L) {
                return false;
              }
              hn.a((byte) 123);
              return false;
            }
            if (availableBytes > length - jl.incomingPackets.position) {
              availableBytes = -jl.incomingPackets.position + length;
            }
            eq.gameTransport.readFully(obfuscationGuard + 25806, jl.incomingPackets.data, availableBytes, jl.incomingPackets.position);
            oj.lastGameReadMillis = MonotonicTime.nowMillis(false);
            jl.incomingPackets.position = jl.incomingPackets.position + availableBytes;
            if (length > jl.incomingPackets.position) {
              return false;
            }
            jl.incomingPackets.position = 0;
            return true;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            hn.a((byte) 111);
            return false;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        mm.h(-29448);
        if (param0 >= -126) {
          field_a = (mo) null;
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        field_a = null;
        if (!param0) {
          return;
        }
        field_b = null;
        field_d = null;
    }

    static {
        field_e = true;
        field_c = 20;
        field_b = new int[8192];
    }
}
