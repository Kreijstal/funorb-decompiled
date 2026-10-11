/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ee implements Iterator {
    static int field_c;
    private ga field_a;
    static String field_f;
    private int field_b;
    private fc field_d;
    private fc field_g;
    static int field_e;

    public final boolean hasNext() {
        int fieldTemp$0 = 0;
        int var2;
        var2 = TrackController.field_F ? 1 : 0;
        if (this.field_g != this.field_a.field_c[this.field_b - 1]) {
          return true;
        }
        while (true) {
          if (this.field_a.field_a <= this.field_b) {
            return false;
          }
          fieldTemp$0 = this.field_b;
          this.field_b = this.field_b + 1;
          if (this.field_a.field_c[fieldTemp$0].field_h == this.field_a.field_c[-1 + this.field_b]) {
            this.field_g = this.field_a.field_c[this.field_b - 1];
            continue;
          }
          break;
        }
        this.field_g = this.field_a.field_c[-1 + this.field_b].field_h;
        return true;
    }

    public final void remove() {
        if (null == this.field_d) {
          throw new IllegalStateException();
        }
        this.field_d.a(-98);
        this.field_d = null;
    }

    final static void a(java.math.BigInteger param0, be param1, java.math.BigInteger param2, int param3, be param4) {
        try {
          ha.a(param2, param0, param4.field_k, param4.field_j, param3, (byte) 77, param1);
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "ee.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(byte param0) {
        this.field_g = this.field_a.field_c[0].field_h;
        this.field_b = 1;
        this.field_d = null;
        int var2 = 80 / ((param0 - 7) / 59);
    }

    public final Object next() {
        int fieldTemp$0 = 0;
        int var2;
        fc var3;
        fc var4;
        var2 = TrackController.field_F ? 1 : 0;
        if (this.field_g != this.field_a.field_c[-1 + this.field_b]) {
          var4 = this.field_g;
          this.field_g = var4.field_h;
          this.field_d = var4;
          return var4;
        }
        do {
          if (this.field_b >= this.field_a.field_a) {
            return null;
          }
          fieldTemp$0 = this.field_b;
          this.field_b = this.field_b + 1;
          var3 = this.field_a.field_c[fieldTemp$0].field_h;
        } while (var3 == this.field_a.field_c[-1 + this.field_b]);
        this.field_g = var3.field_h;
        this.field_d = var3;
        return var3;
    }

    final static qj a(int param0, int param1, byte param2) {
        int var6 = TrackController.field_F ? 1 : 0;
        qj var7 = new qj(param1, param1);
        qj var3 = var7;
        int var4 = 0;
        int var5 = -14 / ((param2 - 55) / 41);
        while (var3.field_z.length > var4) {
          var7.field_z[var4] = param0;
          var4++;
        }
        return var3;
    }

    ee(ga param0) {
        this.field_d = null;
        try {
          this.field_a = param0;
          this.a((byte) 73);
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "ee.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        if (param0 == 31399) {
          field_f = null;
          return;
        }
        be var2 = (be) null;
        ee.a((java.math.BigInteger) null, (be) null, (java.math.BigInteger) null, -9, (be) null);
        field_f = null;
    }

    static {
        field_e = 0;
    }
}
