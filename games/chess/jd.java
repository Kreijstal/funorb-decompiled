/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jd {
    static String field_d;
    static String field_a;
    private String field_f;
    static String field_g;
    static String field_e;
    static ci field_b;
    static String field_h;
    static int[] field_i;
    static rk[] field_c;

    final void a(int param0, java.applet.Applet param1) {
        try {
          vm.a(this.field_f, 11440, param1, 31536000L, "jagex-last-login-method");
          if (param0 != 25799) {
            field_e = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "jd.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_b = null;
        field_a = null;
        if (!param0) {
          field_g = null;
          field_e = null;
          field_h = null;
          field_c = null;
          field_i = null;
          return;
        }
        field_i = (int[]) null;
        field_g = null;
        field_e = null;
        field_h = null;
        field_c = null;
        field_i = null;
    }

    final static void a(byte param0) {
        try {
          int var1_int = 0;
          Throwable decompiledCaughtException = null;
          IOException var1 = null;
          RuntimeException var1_ref = null;
          IOException var2 = null;
          int var3 = 0;
          var3 = Chess.field_G;
          try {
            if (qh.field_c != null) {
              qh.field_c.a((byte) -103);
            }
            if (null != ba.field_O) {
              ba.field_O.a(3);
            }
            if (param0 != -91) {
              field_e = (String) null;
            }
            if (kj.field_a != null) {
              try {
                kj.field_a.a((byte) -87);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
              }
            }
            if (null != hj.field_n) {
              for (var1_int = 0; hj.field_n.length > var1_int; var1_int++) {
                if (hj.field_n[var1_int] != null) {
                  try {
                    hj.field_n[var1_int].a((byte) -87);
                  } catch (java.io.IOException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    var2 = (IOException) (Object) decompiledCaughtException;
                  }
                }
              }
              return;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw fk.a((Throwable) ((Object) var1_ref), "jd.A(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static String b(boolean param0) {
        if (il.field_a < 2) {
          return ob.field_z;
        }
        if (qa.field_c != null) {
          if (qa.field_c.c((byte) 122)) {
            return e.field_T;
          }
          return uk.field_a;
        }
        if (!fl.field_m.c((byte) 121)) {
          return gb.field_o;
        }
        if (!fl.field_m.b("commonui", 100)) {
          return k.field_V + " - " + fl.field_m.c("commonui", 0) + "%";
        }
        if (!Chess.field_B.c((byte) 119)) {
          return sn.field_d;
        }
        if (!Chess.field_B.b("commonui", 100)) {
          return nc.field_P + " - " + Chess.field_B.c("commonui", 0) + "%";
        }
        if (!bi.field_a.c((byte) 120)) {
          return ld.field_a;
        }
        if (!bi.field_a.b((byte) -40)) {
          return wn.field_g + " - " + bi.field_a.a((byte) -91) + "%";
        }
        if (!param0) {
          return m.field_c;
        }
        return (String) null;
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
          String var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          int var3 = 0;
          String var4 = null;
          java.net.URL var5 = null;
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var2 = param1.getDocumentBase().getFile();
              if (param0 != -117) {
                return;
              }
              var3 = var2.indexOf('?');
              var4 = "reload.ws";
              if (var3 >= 0) {
                var4 = var4 + var2.substring(var3);
              }
              var5 = new java.net.URL(param1.getCodeBase(), var4);
              param1.getAppletContext().showDocument(rh.a(var5, param1, (byte) -87), "_self");
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var2_ref2;
            stackIn_11_1 = new StringBuilder().append("jd.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            throw fk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(byte param0, String param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > 42) {
            stackIn_4_0 = this.field_f.equals(param1);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("jd.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    jd(String param0) {
        try {
          this.field_f = param0;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "jd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean b(byte param0) {
        if (param0 == 75) {
          return kn.a(ec.field_f, re.field_p, param0 ^ 29787);
        }
        field_a = (String) null;
        return kn.a(ec.field_f, re.field_p, param0 ^ 29787);
    }

    static {
        field_e = "This is <%0>'s RuneScape clan if they have one.";
        field_g = "Just play";
        field_h = "Unrated game";
        field_a = "Suggest muting this player";
        field_i = new int[8192];
    }
}
