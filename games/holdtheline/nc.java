/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class nc implements Iterator {
    static vn field_c;
    private int field_i;
    private hl field_k;
    static int[] field_j;
    static int field_g;
    static hj field_h;
    static String field_b;
    static byte[] field_e;
    private hl field_d;
    static String field_a;
    private im field_f;

    public static void b(byte param0) {
        field_a = null;
        field_c = null;
        field_e = null;
        field_b = null;
        field_h = null;
        field_j = null;
        if (param0 == 86) {
          return;
        } else {
          field_e = (byte[]) null;
          return;
        }
    }

    final static int a(int param0) {
        if (param0 != 855) {
            return -27;
        }
        return (int)(1000000000L / tm.field_c);
    }

    public final Object next() {
        int fieldTemp$2 = 0;
        hl var1 = null;
        int var2 = 0;
        var2 = HoldTheLine.field_D;
        if (this.field_f.field_j[this.field_i - 1] == this.field_k) {
          L0: while (true) {
            if (this.field_f.field_g > this.field_i) {
              fieldTemp$2 = this.field_i;
              this.field_i = this.field_i + 1;
              var1 = this.field_f.field_j[fieldTemp$2].field_h;
              if (this.field_f.field_j[this.field_i - 1] != var1) {
                this.field_d = var1;
                this.field_k = var1.field_h;
                return var1;
              } else {
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          var1 = this.field_k;
          this.field_k = var1.field_h;
          this.field_d = var1;
          return var1;
        }
    }

    public final boolean hasNext() {
        int fieldTemp$1 = 0;
        int var2 = 0;
        var2 = HoldTheLine.field_D;
        if (this.field_k == this.field_f.field_j[-1 + this.field_i]) {
          L0: while (true) {
            if (this.field_f.field_g > this.field_i) {
              fieldTemp$1 = this.field_i;
              this.field_i = this.field_i + 1;
              if (this.field_f.field_j[fieldTemp$1].field_h != this.field_f.field_j[-1 + this.field_i]) {
                this.field_k = this.field_f.field_j[this.field_i + -1].field_h;
                return true;
              } else {
                this.field_k = this.field_f.field_j[this.field_i + -1];
                continue L0;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    private final void a(byte param0) {
        this.field_d = null;
        int var2 = -67 / ((param0 - 79) / 46);
        this.field_k = this.field_f.field_j[0].field_h;
        this.field_i = 1;
    }

    public final void remove() {
        if (null == this.field_d) {
            throw new IllegalStateException();
        }
        this.field_d.d(0);
        this.field_d = null;
    }

    nc(im param0) {
        this.field_d = null;
        try {
            this.field_f = param0;
            this.a((byte) 127);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "nc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Just Play";
        field_g = 0;
        field_j = new int[]{16711680, 65280, 16776960, 8421631};
        field_e = new byte[]{(byte)50, (byte)97};
        field_a = "Select Course";
    }
}
