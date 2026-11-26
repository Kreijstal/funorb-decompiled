/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class NetworkArchiveRequest extends ArchiveRequest {
    byte field_N;
    static Random field_M;
    int field_O;
    PacketBuffer field_K;
    static RgbSprite[] field_R;
    static he[] field_Q;
    static sa field_P;
    static String field_I;
    static he[] field_L;
    static volatile boolean field_J;
    static char[] field_S;
    static double field_G;

    final int getProgressPercent(int param0) {
        if (this.field_K == null) {
          return 0;
        }
        if (param0 <= -38) {
          return this.field_K.position * 100 / (-this.field_N + this.field_K.payload.length);
        }
        return 97;
    }

    NetworkArchiveRequest() {
    }

    public static void clearStaticReferences(byte param0) {
        if (param0 == -113) {
          field_S = null;
          field_M = null;
          field_R = null;
          field_L = null;
          field_Q = null;
          field_P = null;
          field_I = null;
          return;
        }
        NetworkArchiveRequest.clearStaticReferences((byte) 56);
        field_S = null;
        field_M = null;
        field_R = null;
        field_L = null;
        field_Q = null;
        field_P = null;
        field_I = null;
    }

    final byte[] getData(int param0) {
        if (param0 != 13095) {
          field_S = (char[]) null;
          if (this.field_u) {
            throw new RuntimeException();
          }
          if (this.field_K.payload.length - this.field_N <= this.field_K.position) {
            return this.field_K.payload;
          }
          throw new RuntimeException();
        }
        if (this.field_u) {
          throw new RuntimeException();
        }
        if (this.field_K.payload.length - this.field_N <= this.field_K.position) {
          return this.field_K.payload;
        }
        throw new RuntimeException();
    }

    static {
        field_M = new Random();
        field_P = new sa(12, 0, 1, 0);
        field_J = true;
        field_S = new char[]{(char)91, (char)93, (char)35};
        field_G = 0.0;
    }
}
