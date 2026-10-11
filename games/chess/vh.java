/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vh {
    static String field_f;
    static String[] field_b;
    static int field_g;
    static boolean field_e;
    static String field_h;
    static String field_d;
    static String field_a;
    static int field_c;

    final static boolean a(int param0, int param1, int param2) {
        if (vg.field_a == 13) {
          kf.a(-87);
          return true;
        }
        if (102 == vg.field_a) {
          tl.field_Fb.n(-70);
          return true;
        }
        if (param0 < 1) {
          vh.a(-29, -66, -74);
          if (null == tl.field_Fb) {
            return false;
          }
          if (tl.field_Fb.b((byte) -63, param2, param1)) {
            return true;
          }
          return false;
        }
        if (null == tl.field_Fb) {
          return false;
        }
        if (tl.field_Fb.b((byte) -63, param2, param1)) {
          return true;
        }
        return false;
    }

    public static void a(int param0) {
        field_d = null;
        field_h = null;
        field_f = null;
        field_b = null;
        if (param0 == 102) {
          field_a = null;
          return;
        }
        String var2 = (String) null;
        vh.a((byte) 46, (String) null);
        field_a = null;
    }

    final static void a(int param0, byte param1) {
        try {
          IOException iOException = null;
          int var2 = 0;
          Throwable decompiledCaughtException = null;
          var2 = 94 / ((16 - param1) / 37);
          if (lj.field_a != null && (param0 < 0 ||
            tb.field_f == ik.field_e)) {
            if (qn.field_U.field_l == 0 &&
              (10000L + ta.field_t) < ud.a(2)) {
              qn.field_U.f(param0, -105);
            }
            if (qn.field_U.field_l > 0) {
              try {
                lj.field_a.a(0, qn.field_U.field_l, (byte) -92, qn.field_U.field_o);
                ta.field_t = ud.a(2);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
                si.d(65280);
              }
              qn.field_U.field_l = 0;
            }
            return;
          }
          qn.field_U.field_l = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static byte[] a(byte param0, String param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 41) {
            field_d = (String) null;
          }
          stackIn_3_0 = jj.field_e.a("", 30045, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("vh.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_f = "2D MODE";
        field_h = "Set up new game";
        field_a = "You have been removed from <%0>'s game.";
        field_d = "Options";
        field_b = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
