/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class vc {
    static ci field_e;
    static jj field_d;
    static jj field_g;
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
          if (mk.field_j.field_k >= param1) {
            return true;
          }
          if (null == ig.field_e) {
            return false;
          }
          try {
            var2_int = ig.field_e.a(0);
            if (var2_int > 0) {
              if (param1 - mk.field_j.field_k < var2_int) {
                var2_int = param1 - mk.field_j.field_k;
              }
              ig.field_e.a(mk.field_j.field_i, var2_int, mk.field_j.field_k, (byte) 114);
              dm.field_c = ll.a(1000);
              mk.field_j.field_k = mk.field_j.field_k + var2_int;
              if (param1 > mk.field_j.field_k) {
                return false;
              }
              mk.field_j.field_k = 0;
              return true;
            }
            if (0 > var2_int) {
              gb.g(-17464);
            } else {
              if (30000L >= ce.b(1)) {
                return false;
              }
              gb.g(-17464);
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            gb.g(-17464);
          }
          return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0) {
        ci var2 = null;
        int var3 = 0;
        int var4 = Terraphoenix.field_V;
        ci var1 = new ci(540, 140);
        il.a(1, var1);
        ob.b();
        l.a();
        if (!param0) {
          return;
        }
        try {
          kf.field_f = 0;
          af.d(-2766);
          var2 = var1.d();
          for (var3 = 0; var3 < 15; var3++) {
            var2.b(-2, -2, 16777215);
            l.e(4, 4, 0, 0, 540, 140);
          }
          s.field_a.a();
          var1.f(0, 0);
          ij.a(!param0 ? true : false);
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "vc.M(" + param0 + ')');
        }
    }

    static {
        field_d = new jj();
        field_b = "L-TAW";
        field_g = new jj();
    }
}
