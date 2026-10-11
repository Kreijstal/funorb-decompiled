/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ac implements hc {
    static Random field_d;
    private static int field_c;
    static hd field_b;
    static boolean field_f;
    static String field_e;
    static byte[][] field_a;

    public final boolean a(byte param0) {
        if (param0 < 63) {
          ac.b((byte) 14);
          return false;
        }
        return false;
    }

    public final void a(int param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (field_c != -1) {
          var2 = -wf.field_A + 20;
          on.f(-1 + var2, 19, 2 + sh.field_d, 50, 10, 16777215);
          on.a(var2, 20, sh.field_d, 48, 10, 65793, 160);
          if (qe.field_i != null) {
            qe.field_i[iw.field_e[field_c]].g(var2, 28);
          }
          un.field_d.a(kw.field_c[field_c], var2 + 16 + 32, 49, 16777215, -1);
        }
        var2Lifetime1 = 1 / ((50 - param0) / 45);
    }

    public final boolean a(int param0, int param1, char param2) {
        if (param0 != 11516) {
          field_f = false;
          return false;
        }
        return false;
    }

    public static void b(byte param0) {
        field_e = null;
        if (param0 == 16) {
          field_d = null;
          field_a = (byte[][]) null;
          field_b = null;
          return;
        }
        ac.b((byte) -17);
        field_d = null;
        field_a = (byte[][]) null;
        field_b = null;
    }

    public final void a(int param0, boolean param1) {
        int var3;
        int var4;
        oi var5;
        var4 = Kickabout.field_G;
        if (0 != lj.field_f) {
          lj.field_f = lj.field_f - 1;
          if (lj.field_f < 16) {
            var3 = 16 - lj.field_f;
            wf.field_A = var3 * (sh.field_d + 20) * var3 >> 8;
          } else {
            if (!(319 >= lj.field_f)) {
              var3 = -319 + lj.field_f;
              wf.field_A = var3 * ((sh.field_d + 20) * var3) >> 8;
            }
          }
        } else {
          if (-1 != field_c) {
            field_c = -1;
          }
          var5 = (oi) (ec.field_f.b((byte) -36));
          if (var5 != null) {
            field_c = var5.field_j;
            lj.field_f = 335;
            sh.field_d = un.field_d.a(kw.field_c[field_c]) + 56;
            wf.field_A = 20 + sh.field_d;
            if (param0 == -25) {
              return;
            }
            field_d = (Random) null;
            return;
          }
        }
        if (param0 == -25) {
          return;
        }
        field_d = (Random) null;
    }

    static {
        field_c = -1;
        field_d = new Random();
        field_e = "Loading extra data (2/2)";
    }
}
