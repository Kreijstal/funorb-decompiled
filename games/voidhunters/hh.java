/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hh extends rqa {
    static int field_o;

    final nc a(nc[] param0, int param1) {
        si.a(174, 62, param0[0].a(33));
        if (param1 > -119) {
          field_o = -38;
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    final static void a(Throwable param0, boolean param1, String param2) {
        if (!ssa.b(2)) {
          if (!param1) {
            field_o = 34;
            return;
          } else {
            return;
          }
        } else {
          System.out.println(param2);
          param0.printStackTrace(System.out);
          if (param1) {
            return;
          } else {
            field_o = 34;
            return;
          }
        }
    }

    hh(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
