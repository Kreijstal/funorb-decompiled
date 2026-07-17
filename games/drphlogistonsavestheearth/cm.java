/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class cm extends lb {
    byte field_N;
    static Random field_M;
    int field_O;
    od field_K;
    static nh[] field_R;
    static he[] field_Q;
    static sa field_P;
    static String field_I;
    static he[] field_L;
    static volatile boolean field_J;
    static char[] field_S;
    static double field_G;

    final int g(int param0) {
        if (((cm) this).field_K != null) {
          if (param0 > -38) {
            return 97;
          } else {
            return ((cm) this).field_K.field_j * 100 / (-((cm) this).field_N + ((cm) this).field_K.field_h.length);
          }
        } else {
          return 0;
        }
    }

    cm() {
    }

    public static void a(byte param0) {
        if (param0 != -113) {
          cm.a((byte) 56);
          field_S = null;
          field_M = null;
          field_R = null;
          field_L = null;
          field_Q = null;
          field_P = null;
          field_I = null;
          return;
        } else {
          field_S = null;
          field_M = null;
          field_R = null;
          field_L = null;
          field_Q = null;
          field_P = null;
          field_I = null;
          return;
        }
    }

    final byte[] i(int param0) {
        if (param0 == 13095) {
          if (!((cm) this).field_u) {
            if (((cm) this).field_K.field_h.length - ((cm) this).field_N > ((cm) this).field_K.field_j) {
              throw new RuntimeException();
            } else {
              return ((cm) this).field_K.field_h;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          field_S = null;
          if (!((cm) this).field_u) {
            if (((cm) this).field_K.field_h.length - ((cm) this).field_N > ((cm) this).field_K.field_j) {
              throw new RuntimeException();
            } else {
              return ((cm) this).field_K.field_h;
            }
          } else {
            throw new RuntimeException();
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = new Random();
        field_P = new sa(12, 0, 1, 0);
        field_J = true;
        field_S = new char[]{'[', ']', '#'};
        field_G = 0.0;
    }
}
