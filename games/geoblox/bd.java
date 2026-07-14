/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bd extends IOException {
    static int field_a;
    static ck field_c;
    static String field_b;

    final static void a(int param0) {
        me var1 = null;
        String var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = Geoblox.field_C;
        sh.field_y.a(255);
        var1 = (me) (Object) md.field_a.g(0);
        if (param0 <= -112) {
          L0: while (true) {
            if (var1 != null) {
              L1: {
                if (var1.field_h != 1) {
                  var2 = "X" + var1.field_h + " - " + var1.field_m;
                  var3 = dd.field_G.field_K[0][wf.field_p];
                  dd.field_G.field_K[0][wf.field_p] = 15488514;
                  dd.field_G.b(var2, (int)(var1.field_k * ((float)(80 + el.field_o.field_T) - var1.field_n) + var1.field_n), (int)(var1.field_k * (34.0f - var1.field_i) + var1.field_i), 0, -1);
                  dd.field_G.field_K[0][wf.field_p] = var3;
                  break L1;
                } else {
                  dd.field_G.b(var1.field_m, (int)(var1.field_k * (-var1.field_n + 144.0f) + var1.field_n), (int)((-var1.field_i + 34.0f) * var1.field_k + var1.field_i), 0, -1);
                  break L1;
                }
              }
              var1 = (me) (Object) md.field_a.d(1);
              continue L0;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_c = null;
        if (param0 == -20152) {
            return;
        }
        field_a = 79;
    }

    bd(String param0) {
        super(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new ck(13, 0, 1, 0);
        field_b = "Click 'Discard Results' to lose all progress, Achievements and your score.";
    }
}
