/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class k implements ba {
    static double field_a;
    static int field_c;
    static boolean field_b;
    private long field_d;

    abstract String d(int param0);

    final static void c(int param0) {
        j.j(-23687);
        if (param0 >= -107) {
          return;
        }
        cg.field_f = true;
        ei.field_e = true;
        sd.field_c.k(117);
        ca.a(ni.field_e, false, 16777215);
    }

    public final sg a(boolean param0) {
        if (this.a((byte) -31)) {
          return il.field_e;
        }
        if (!param0) {
          this.field_d = 73L;
          if (!(id.a(43) >= this.field_d + 350L)) {
            return tb.field_b;
          }
          return this.e(14);
        }
        if (!(id.a(43) >= this.field_d + 350L)) {
          return tb.field_b;
        }
        return this.e(14);
    }

    final static void a(Throwable param0, byte param1, String param2) {
        try {
          le stackIn_11_0;
          java.net.URL stackIn_11_1;
          java.net.URL stackIn_11_2;
          java.net.URL stackIn_11_3;
          StringBuilder stackIn_11_4;
          java.net.URL stackIn_12_1;
          java.net.URL stackIn_12_2;
          String stackIn_12_5;
          Throwable decompiledCaughtException = null;
          String var3 = null;
          Exception var3_ref = null;
          int var4 = 0;
          vi var5 = null;
          DataInputStream var6 = null;
          int var7 = 0;
          String var8 = null;
          String var9 = null;
          String var10 = null;
          String var11 = null;
          var7 = Main.field_T;
          try {
            var3 = "";
            if (param0 != null) {
              var3 = mf.a(param0, (byte) -3);
            }
            if (param2 != null) {
              if (param0 != null) {
                var3 = var3 + " | ";
              }
              var3 = var3 + param2;
            }
            n.a(var3, (byte) 120);
            var4 = 71 % ((param1 + 20) / 48);
            var8 = sb.a(var3, ":", "%3a", 96);
            var9 = sb.a(var8, "@", "%40", 118);
            var10 = sb.a(var9, "&", "%26", 109);
            var11 = sb.a(var10, "#", "%23", 90);
            if (tk.field_o == null) {
              return;
            }
            stackIn_11_0 = Main.field_W;
            stackIn_11_1 = null;
            stackIn_11_2 = null;
            stackIn_11_3 = tk.field_o.getCodeBase();
            stackIn_11_4 = new StringBuilder().append("clienterror.ws?c=").append(ca.field_d).append("&u=");
            if (fk.field_o == null) {
              stackIn_12_1 = null;
              stackIn_12_2 = null;
              stackIn_12_5 = "" + kb.field_f;
            } else {
              stackIn_12_1 = null;
              stackIn_12_2 = null;
              stackIn_12_5 = fk.field_o;
            }
            var5 = ((le) (Object) stackIn_11_0).a(new java.net.URL(stackIn_11_3, ((StringBuilder) (Object) stackIn_11_4).append(stackIn_12_5).append("&v1=").append(le.field_v).append("&v2=").append(le.field_w).append("&e=").append(var11).toString()), true);
            while (var5.field_a == 0) {
              wk.a((byte) -97, 1L);
            }
            if (1 == var5.field_a) {
              var6 = (DataInputStream) (var5.field_e);
              var6.read();
              var6.close();
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void a(int param0) {
        if (param0 >= -96) {
          k.c(58);
          this.field_d = id.a(111);
          return;
        }
        this.field_d = id.a(111);
    }

    abstract sg e(int param0);

    public final String b(int param0) {
        if (this.a((byte) -60)) {
          return null;
        }
        if (param0 != 26766) {
          this.field_d = 5L;
          if (id.a(46) >= (350L + this.field_d)) {
            return this.d(-5777);
          }
          return null;
        }
        if (id.a(46) >= (350L + this.field_d)) {
          return this.d(-5777);
        }
        return null;
    }

    static {
        field_a = 0.0;
        field_b = false;
        field_c = 0;
    }
}
