/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bd extends IOException {
    static int field_a;
    static ck field_c;
    static String field_b;

    final static void a(int param0) {
        RuntimeException var1 = null;
        me var1_ref = null;
        String var2 = null;
        int var3 = 0;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Geoblox.field_C;
        try {
          L0: {
            sh.field_y.a(255);
            var1_ref = (me) ((Object) md.field_a.g(0));
            if (param0 <= -112) {
              L1: while (true) {
                if (var1_ref == null) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    if (var1_ref.field_h != 1) {
                      var2 = "X" + var1_ref.field_h + " - " + var1_ref.field_m;
                      var3 = dd.field_G.field_K[0][wf.field_p];
                      dd.field_G.field_K[0][wf.field_p] = 15488514;
                      dd.field_G.b(var2, (int)(var1_ref.field_k * ((float)(80 + el.field_o.field_T) - var1_ref.field_n) + var1_ref.field_n), (int)(var1_ref.field_k * (34.0f - var1_ref.field_i) + var1_ref.field_i), 0, -1);
                      dd.field_G.field_K[0][wf.field_p] = var3;
                      break L2;
                    } else {
                      dd.field_G.b(var1_ref.field_m, (int)(var1_ref.field_k * (-var1_ref.field_n + 144.0f) + var1_ref.field_n), (int)((-var1_ref.field_i + 34.0f) * var1_ref.field_k + var1_ref.field_i), 0, -1);
                      break L2;
                    }
                  }
                  var1_ref = (me) ((Object) md.field_a.d(1));
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "bd.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
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
        field_c = new ck(13, 0, 1, 0);
        field_b = "Click 'Discard Results' to lose all progress, Achievements and your score.";
    }
}
