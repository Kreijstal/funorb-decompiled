/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class dg {
    final static String a(boolean param0) {
        if (param0) {
            String discarded$0 = dg.a(false);
        }
        if (bk.field_c == ca.field_i) {
            return ce.field_d;
        }
        if (!(ee.field_c != ca.field_i)) {
            return ef.field_b;
        }
        if (!(qa.field_c.b(12))) {
            return ef.field_b;
        }
        return dd.field_d;
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(boolean param0, boolean param1) {
        // if_icmpeq L7
        return true;
    }

    final static void a(int param0) {
        int var3 = 0;
        int var4 = Lexicominos.field_L ? 1 : 0;
        db var1 = new db(540, 140);
        de.a(var1, 6);
        k.b();
        lf.a();
        mc.field_k = 0;
        rg.b(0);
        db var2 = var1.c();
        for (var3 = 0; var3 < 15; var3++) {
            var2.c(-2, -2, 16777215);
            lf.d(4, 4, 0, 0, 540, 140);
        }
        t.field_a.b();
        var1.f(0, 0);
        if (param0 != 19681) {
            return;
        }
        pd.a(-22949);
    }

    final boolean b(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == -2) {
          L0: {
            L1: {
              if ((Object) (Object) he.field_h == this) {
                break L1;
              } else {
                if (this == (Object) (Object) ug.field_q) {
                  break L1;
                } else {
                  if ((Object) (Object) gg.field_b != this) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            stackOut_6_0 = 1;
            stackIn_8_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return false;
        }
    }

    static {
    }
}
