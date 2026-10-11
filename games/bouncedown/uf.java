/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class uf {
    static java.util.zip.CRC32 field_b;
    static int field_a;
    static int[] field_c;

    public static void a(int param0) {
        if (param0 != 32578) {
          uf.a((byte) -121);
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
        if (fh.field_B == qg.field_g) {
          return je.field_a;
        }
        if (param0 > -107) {
          uf.a(-94);
          if (qg.field_g == vc.field_F) {
            return t.field_t;
          }
          if (!pb.field_k.a(1000)) {
            return t.field_t;
          }
          return gi.field_b;
        }
        if (qg.field_g == vc.field_F) {
          return t.field_t;
        }
        if (!pb.field_k.a(1000)) {
          return t.field_t;
        }
        return gi.field_b;
    }

    final boolean b(int param0) {
        if (param0 > -15) {
          field_a = 89;
          if (ae.field_g == this) {
            return true;
          }
          if (dg.field_e != this) {
            return b.field_b == this ? true : false;
          }
          return true;
        }
        if (ae.field_g == this) {
          return true;
        }
        if (dg.field_e == this) {
          return true;
        }
        if (b.field_b != this) {
          return false;
        }
        return true;
    }

    static {
        field_b = new java.util.zip.CRC32();
    }
}
