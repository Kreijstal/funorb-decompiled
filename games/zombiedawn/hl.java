/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hl implements Iterator {
    private le field_e;
    static String field_f;
    static cg field_d;
    private wm field_a;
    private le field_c;
    static String field_h;
    static cg field_g;
    private int field_i;
    static String[] field_b;

    public final void remove() {
        if (this.field_c == null) {
          throw new IllegalStateException();
        }
        this.field_c.b(-27598);
        this.field_c = null;
    }

    public final Object next() {
        int fieldTemp$0 = 0;
        le var1;
        int var2;
        var2 = ZombieDawn.field_J;
        if (this.field_a.field_c[-1 + this.field_i] != this.field_e) {
          var1 = this.field_e;
          this.field_e = var1.field_b;
          this.field_c = var1;
          return var1;
        }
        do {
          if (this.field_i >= this.field_a.field_f) {
            return null;
          }
          fieldTemp$0 = this.field_i;
          this.field_i = this.field_i + 1;
          var1 = this.field_a.field_c[fieldTemp$0].field_b;
        } while (this.field_a.field_c[-1 + this.field_i] == var1);
        this.field_e = var1.field_b;
        this.field_c = var1;
        return var1;
    }

    private final void a(int param0) {
        this.field_c = null;
        if (param0 == 11936) {
          this.field_e = this.field_a.field_c[0].field_b;
          this.field_i = 1;
          return;
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          String var3 = null;
          java.net.URL var4 = null;
          try {
            try {
              var4 = param0.getCodeBase();
              var3 = rc.a(-1, param0, var4).getFile();
              qe.a(new Object[]{"home", var3 + "home.ws"}, "updatelinks", 29674, param0);
              qe.a(new Object[]{"gamelist", var3 + "togamelist.ws"}, "updatelinks", param1 ^ 29675, param0);
              qe.a(new Object[]{"serverlist", var3 + "toserverlist.ws"}, "updatelinks", 29674, param0);
              qe.a(new Object[]{"options", var3 + "options.ws"}, "updatelinks", 29674, param0);
              if (param1 != 1) {
                field_h = (String) null;
              }
              qe.a(new Object[]{"terms", var3 + "terms.ws"}, "updatelinks", 29674, param0);
              qe.a(new Object[]{"privacy", var3 + "privacy.ws"}, "updatelinks", 29674, param0);
              return;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref;
            stackIn_8_1 = new StringBuilder().append("hl.D(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw sh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(int param0, java.applet.Applet param1) {
        try {
          int var5 = 0;
          String var2 = null;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          boolean stackIn_19_0 = false;
          RuntimeException stackIn_22_0 = null;
          StringBuilder stackIn_22_1 = null;
          String stackIn_23_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2_ref = null;
          RuntimeException var2_ref2 = null;
          var7 = ZombieDawn.field_J;
          try {
            if (nm.field_a) {
              return true;
            }
            try {
              var2 = "tuhstatbut";
              var3 = (String) (qe.a(param1, "getcookies", -109));
              if (param0 >= -111) {
                field_g = (cg) null;
              }
              var4 = de.a(';', var3, -125);
              for (var5 = 0; var4.length > var5; var5++) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(var2)) {
                  return true;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = decompiledCaughtException;
            }
            stackIn_19_0 = (null != param1.getParameter("tuhstatbut"));
            return stackIn_19_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_22_0 = var2_ref2;
            stackIn_22_1 = new StringBuilder().append("hl.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_23_2 = "null";
            } else {
              stackIn_23_2 = "{...}";
            }
            throw sh.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final boolean hasNext() {
        int fieldTemp$0 = 0;
        int var2;
        var2 = ZombieDawn.field_J;
        if (this.field_e != this.field_a.field_c[this.field_i - 1]) {
          return true;
        }
        while (true) {
          if (this.field_a.field_f <= this.field_i) {
            return false;
          }
          fieldTemp$0 = this.field_i;
          this.field_i = this.field_i + 1;
          if (this.field_a.field_c[fieldTemp$0].field_b == this.field_a.field_c[-1 + this.field_i]) {
            this.field_e = this.field_a.field_c[this.field_i - 1];
            continue;
          }
          break;
        }
        this.field_e = this.field_a.field_c[-1 + this.field_i].field_b;
        return true;
    }

    public static void a(byte param0) {
        field_d = null;
        field_g = null;
        field_f = null;
        field_h = null;
        if (param0 <= 105) {
          return;
        }
        field_b = null;
    }

    hl(wm param0) {
        this.field_c = null;
        try {
          this.field_a = param0;
          this.a(11936);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "hl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = "Names cannot contain consecutive spaces";
        field_h = "Just play";
        field_d = new cg(1, 2, 2, 0);
        field_g = new cg(4, 1, 1, 1);
    }
}
