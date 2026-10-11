/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class r extends ek {
    static volatile int field_s;
    static boolean field_p;
    static boolean field_q;
    static String field_r;

    final static char a(int param0, char param1) {
        int var2;
        int var3;
        var3 = Main.field_T;
        if (param0 != -219) {
          return 'a';
        }
        var2 = param1;
        if (var2 == 32) {
          return '_';
        }
        if (var2 == 160) {
          return '_';
        }
        if (var2 == 95) {
          return '_';
        }
        if (var2 == 45) {
          return '_';
        }
        if (var2 == 91) {
          return param1;
        }
        if (var2 == 93) {
          return param1;
        }
        if (var2 == 35) {
          return param1;
        }
        if (var2 == 224) {
          return 'a';
        }
        if (var2 == 225) {
          return 'a';
        }
        if (var2 == 226) {
          return 'a';
        }
        if (var2 == 228) {
          return 'a';
        }
        if (var2 == 227) {
          return 'a';
        }
        if (var2 == 192) {
          return 'a';
        }
        if (193 == var2) {
          return 'a';
        }
        if (var2 == 194) {
          return 'a';
        }
        if (var2 == 196) {
          return 'a';
        }
        if (var2 == 195) {
          return 'a';
        }
        if (var2 == 232) {
          return 'e';
        }
        if (233 == var2) {
          return 'e';
        }
        if (var2 == 234) {
          return 'e';
        }
        if (var2 == 235) {
          return 'e';
        }
        if (var2 == 200) {
          return 'e';
        }
        if (201 == var2) {
          return 'e';
        }
        if (var2 == 202) {
          return 'e';
        }
        if (var2 == 203) {
          return 'e';
        }
        if (var2 == 237) {
          return 'i';
        }
        if (var2 == 238) {
          return 'i';
        }
        if (239 == var2) {
          return 'i';
        }
        if (var2 == 205) {
          return 'i';
        }
        if (var2 == 206) {
          return 'i';
        }
        if (var2 == 207) {
          return 'i';
        }
        if (var2 == 242) {
          return 'o';
        }
        if (243 == var2) {
          return 'o';
        }
        if (var2 == 244) {
          return 'o';
        }
        if (var2 == 246) {
          return 'o';
        }
        if (245 == var2) {
          return 'o';
        }
        if (210 == var2) {
          return 'o';
        }
        if (211 == var2) {
          return 'o';
        }
        if (var2 == 212) {
          return 'o';
        }
        if (var2 == 214) {
          return 'o';
        }
        if (var2 == 213) {
          return 'o';
        }
        if (var2 == 249) {
          return 'u';
        }
        if (var2 == 250) {
          return 'u';
        }
        if (251 == var2) {
          return 'u';
        }
        if (252 == var2) {
          return 'u';
        }
        if (var2 == 217) {
          return 'u';
        }
        if (var2 == 218) {
          return 'u';
        }
        if (var2 == 219) {
          return 'u';
        }
        if (var2 == 220) {
          return 'u';
        }
        if (231 == var2) {
          return 'c';
        }
        if (var2 == 199) {
          return 'c';
        }
        if (var2 == 255) {
          return 'y';
        }
        if (376 == var2) {
          return 'y';
        }
        if (var2 == 241) {
          return 'n';
        }
        if (var2 == 209) {
          return 'n';
        }
        if (var2 != 223) {
          return Character.toLowerCase(param1);
        }
        return 'b';
    }

    r(ee param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_s, -1, 2147483647, false);
    }

    final static void b(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (param0 != 123) {
          return;
        }
        if (sj.field_d == null) {
          return;
        }
        var1 = sj.field_d;
        synchronized (var1) {
          sj.field_d = null;
        }
    }

    r(int param0) {
        this(j.field_C, param0);
    }

    final static boolean a(int param0, byte param1) {
        try {
          if (!(param0 > rd.field_j.field_i)) {
            return true;
          }
          if (null == cb.field_j) {
            return false;
          }
          if (param1 < 118) {
            field_s = 4;
          }
          int var2_int = cb.field_j.b(126);
          if (var2_int > 0) {
            if (!(param0 - rd.field_j.field_i >= var2_int)) {
              var2_int = param0 - rd.field_j.field_i;
            }
            cb.field_j.a((byte) 66, rd.field_j.field_g, var2_int, rd.field_j.field_i);
            uk.field_a = id.a(71);
            rd.field_j.field_i = rd.field_j.field_i + var2_int;
            if (param0 > rd.field_j.field_i) {
              return false;
            }
            rd.field_j.field_i = 0;
            return true;
          }
          try {
            if (false) throw (IOException) null;
            if (var2_int >= 0 &&
              we.a((byte) 79) <= 30000L) {
              return false;
            }
            mc.a((byte) -126);
          } catch (IOException iOException) {
            mc.a((byte) -127);
          }
          return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        field_r = null;
        if (param0 != 19017) {
          r.b((byte) -25);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, kc[] param5, int param6, ee param7, int param8, kc[] param9, int param10) {
        try {
          wd.a(31668);
          if (param2 != -250) {
            r.b(-3);
          }
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "r.N(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ',' + (param9 != null ? "{...}" : "null") + ',' + param10 + ')');
        }
    }

    public final void a(int param0, lk param1, int param2, int param3, boolean param4) {
        try {
          if (param4) {
            kl.b(param1.field_q, param3 + param1.field_i, param0 + param1.field_o, 48, param1.field_h);
          }
          super.a(param0, param1, param2, param3, param4);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "r.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_s = -1;
        field_p = false;
        field_r = "This entry doesn't match";
    }
}
