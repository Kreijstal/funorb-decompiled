/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class uf {
    static java.util.zip.CRC32 field_b;
    static int field_a;
    static int[] field_c;

    public static void a(int param0) {
        String discarded$0 = null;
        if (param0 != 32578) {
            discarded$0 = uf.a((byte) -121);
            field_c = null;
            field_b = null;
            return;
        }
        field_c = null;
        field_b = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static String a(byte param0) {
        if (!(fh.field_B != qg.field_g)) {
            return je.field_a;
        }
        if (param0 > -107) {
            uf.a(-94);
            if (!(qg.field_g != vc.field_F)) {
                return t.field_t;
            }
            if (!(pb.field_k.a(1000))) {
                return t.field_t;
            }
            return gi.field_b;
        }
        if (!(qg.field_g != vc.field_F)) {
            return t.field_t;
        }
        if (!(pb.field_k.a(1000))) {
            return t.field_t;
        }
        return gi.field_b;
    }

    final boolean b(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 <= -15) {
          if (ae.field_g != this) {
            if (dg.field_e != this) {
              if (b.field_b == this) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          field_a = 89;
          if (ae.field_g != this) {
            if (dg.field_e == this) {
              return true;
            } else {
              L0: {
                if (b.field_b != this) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L0;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        }
    }

    static {
        field_b = new java.util.zip.CRC32();
    }
}
