/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qk {
    static int field_e;
    private int field_b;
    private int field_h;
    static dj field_g;
    private int field_f;
    private int field_a;
    static int field_i;
    static int[] field_c;
    static ak field_d;

    final void b(int param0) {
        int var2 = 0;
        L0: {
          if ((this.field_f ^ -1) > -13) {
            var2 = 120 - this.field_f * 10;
            vk.field_tb[this.field_b].a(42 * this.field_h + 148, 42 * (-1 + this.field_a) + -126, var2);
            break L0;
          } else {
            break L0;
          }
        }
        vk.field_tb[this.field_b].a(148 - -(this.field_h * 42), -126 - -(42 * this.field_a), 160);
        if (param0 < 43) {
          this.b(105);
          return;
        } else {
          return;
        }
    }

    final void c(int param0) {
        int fieldTemp$2 = 0;
        L0: {
          fieldTemp$2 = this.field_f;
          this.field_f = this.field_f + 1;
          if (fieldTemp$2 > 30) {
            this.field_f = 0;
            this.field_a = this.field_a + 1;
            break L0;
          } else {
            break L0;
          }
        }
        if (this.field_a <= 14) {
          if (param0 != 148) {
            this.d(6);
            return;
          } else {
            return;
          }
        } else {
          this.d(-16289);
          if (param0 == 148) {
            return;
          } else {
            this.d(6);
            return;
          }
        }
    }

    public static void a(int param0) {
        String discarded$2 = null;
        String var2 = null;
        if (param0 != 6) {
          var2 = (String) null;
          discarded$2 = qk.a((String) null, (String) null, (String) null, -71);
          field_d = null;
          field_c = null;
          field_g = null;
          return;
        } else {
          field_d = null;
          field_c = null;
          field_g = null;
          return;
        }
    }

    final static String a(String param0, String param1, String param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        var5 = Pixelate.field_H ? 1 : 0;
        var4 = param0.indexOf(param1);
        L0: while (true) {
          if (var4 == -1) {
            if (param3 >= -122) {
              qk.a(-3);
              return param0;
            } else {
              return param0;
            }
          } else {
            param0 = param0.substring(0, var4) + param2 + param0.substring(param1.length() + var4);
            var4 = param0.indexOf(param1, param2.length() + var4);
            continue L0;
          }
        }
    }

    private final void d(int param0) {
        this.field_f = 0;
        if (param0 != -16289) {
          return;
        } else {
          this.field_h = ok.a(ea.field_b, -104, 6);
          this.field_a = 0;
          this.field_b = ok.a(ea.field_b, -120, 6);
          return;
        }
    }

    qk(int param0) {
        this.d(-16289);
        this.field_a = param0;
    }

    static {
        field_e = 0;
        field_g = new dj();
        field_c = new int[4];
    }
}
