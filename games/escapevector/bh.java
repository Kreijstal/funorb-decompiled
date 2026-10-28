/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bh extends vj {
    private String field_f;
    private String field_g;
    static String field_e;

    final static void a(boolean param0, int param1) {
        if (param1 != -19503) {
          return;
        }
        di.field_g.complete((byte) -128, param0);
    }

    final static void c(int param0) {
        int var1 = -59 / ((-15 - param0) / 40);
        if (bk.field_r != null) {
          bk.field_r.a((byte) 87);
        }
    }

    final void a(PacketBuffer param0, byte param1) {
        try {
          if (param1 >= -15) {
            bh.a(29, -33L);
          }
          param0.writeCircumfixedString((byte) 100, this.field_g);
          param0.writeBase38Password(this.field_f, (byte) 111);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "bh.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(int guard) {
        if (guard != 11) {
          return;
        }
        field_e = null;
    }

    final fk a(byte param0) {
        if (param0 != 32) {
          bh.a(true, 70);
          return AlphaContainer.field_E;
        }
        return AlphaContainer.field_E;
    }

    final static String a(int param0, long param1) {
        if (param0 < -73) {
          StatefulTextPainter.field_s.setTime(new Date(param1));
          int var3 = StatefulTextPainter.field_s.get(7);
          int var4 = StatefulTextPainter.field_s.get(5);
          int var5 = StatefulTextPainter.field_s.get(2);
          int var6 = StatefulTextPainter.field_s.get(1);
          int var7 = StatefulTextPainter.field_s.get(11);
          int var8 = StatefulTextPainter.field_s.get(12);
          int var9 = StatefulTextPainter.field_s.get(13);
          return SingleChildContainer.field_A[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + bg.field_g[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
        return (String) null;
    }

    bh(String param0, String param1) {
        try {
          this.field_f = param1;
          this.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "bh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = "Auto-shield deactivated";
    }
}
