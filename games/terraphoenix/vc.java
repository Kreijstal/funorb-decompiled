/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class vc {
    static Sprite field_e;
    static IntrusiveDeque field_d;
    static IntrusiveDeque field_g;
    static String field_b;
    static fh field_c;
    static ud field_f;
    static ec field_a;

    abstract void b(int param0);

    final int a(long param0, int param1) {
        if (param1 >= -45) {
          field_a = (ec) null;
        }
        long var4 = this.a(120);
        if (var4 > 0L) {
          gi.a((byte) -93, var4);
        }
        return this.a(0, param0);
    }

    abstract long a(int param0);

    abstract int a(int param0, long param1);

    public static void c(int param0) {
        field_d = null;
        field_c = null;
        field_f = null;
        if (param0 != 0) {
          vc.a(83, 26);
        }
        field_e = null;
        field_b = null;
        field_g = null;
        field_a = null;
    }

    final static boolean a(int param0, int param1) {
        try {
          int var2_int = 0;
          Throwable decompiledCaughtException = null;
          IOException var2 = null;
          if (param0 > -97) {
            field_b = (String) null;
          }
          if (LevelEditor.field_j.position >= param1) {
            return true;
          }
          if (null == ig.field_e) {
            return false;
          }
          try {
            var2_int = ig.field_e.a(0);
            if (var2_int > 0) {
              if (param1 - LevelEditor.field_j.position < var2_int) {
                var2_int = param1 - LevelEditor.field_j.position;
              }
              ig.field_e.a(LevelEditor.field_j.payload, var2_int, LevelEditor.field_j.position, (byte) 114);
              dm.field_c = ll.a(1000);
              LevelEditor.field_j.position = LevelEditor.field_j.position + var2_int;
              if (param1 > LevelEditor.field_j.position) {
                return false;
              }
              LevelEditor.field_j.position = 0;
              return true;
            }
            if (0 > var2_int) {
              WidgetContainer.g(-17464);
            } else {
              if (30000L >= IterableNodeHashTable.b(1)) {
                return false;
              }
              WidgetContainer.g(-17464);
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            WidgetContainer.g(-17464);
          }
          return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0) {
        Sprite var2 = null;
        int var3 = 0;
        int var4 = Terraphoenix.field_V;
        Sprite var1 = new Sprite(540, 140);
        il.a(1, var1);
        ob.b();
        SoftwareRasterizer.a();
        if (!param0) {
          return;
        }
        try {
          kf.field_f = 0;
          af.d(-2766);
          var2 = var1.d();
          for (var3 = 0; var3 < 15; var3++) {
            var2.b(-2, -2, 16777215);
            SoftwareRasterizer.e(4, 4, 0, 0, 540, 140);
          }
          s.field_a.a();
          var1.f(0, 0);
          ij.a(!param0 ? true : false);
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "vc.M(" + param0 + ')');
        }
    }

    static {
        field_d = new IntrusiveDeque();
        field_b = "L-TAW";
        field_g = new IntrusiveDeque();
    }
}
