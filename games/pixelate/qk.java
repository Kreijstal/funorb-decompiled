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
          if ((((qk) this).field_f ^ -1) > -13) {
            var2 = 120 - ((qk) this).field_f * 10;
            vk.field_tb[((qk) this).field_b].a(42 * ((qk) this).field_h + 148, 42 * (-1 + ((qk) this).field_a) + -126, var2);
            break L0;
          } else {
            break L0;
          }
        }
        vk.field_tb[((qk) this).field_b].a(148 - -(((qk) this).field_h * 42), -126 - -(42 * ((qk) this).field_a), 160);
        if (param0 < 43) {
          ((qk) this).b(105);
          return;
        } else {
          return;
        }
    }

    final void c(int param0) {
        L0: {
          ((qk) this).field_f = ((qk) this).field_f + 1;
          if (((qk) this).field_f > 30) {
            ((qk) this).field_f = 0;
            ((qk) this).field_a = ((qk) this).field_a + 1;
            break L0;
          } else {
            break L0;
          }
        }
        if (((qk) this).field_a <= 14) {
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
        Object var2 = null;
        if (param0 != 6) {
          var2 = null;
          String discarded$2 = qk.a((String) null, (String) null, (String) null, -71);
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
        ((qk) this).field_f = 0;
        if (param0 != -16289) {
          return;
        } else {
          ((qk) this).field_h = ok.a(ea.field_b, -104, 6);
          ((qk) this).field_a = 0;
          ((qk) this).field_b = ok.a(ea.field_b, -120, 6);
          return;
        }
    }

    qk(int param0) {
        this.d(-16289);
        ((qk) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
        field_g = new dj();
        field_c = new int[4];
    }
}
