/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hb {
    static String field_a;
    static java.awt.Image field_i;
    static int field_f;
    private int field_g;
    private int field_b;
    private ga field_e;
    private rj field_h;
    static String field_c;
    static String field_d;

    final static void a(Throwable param0, int param1, String param2) {
        try {
          uf stackIn_14_0;
          boolean stackIn_14_1;
          java.net.URL stackIn_14_2;
          java.net.URL stackIn_14_3;
          java.net.URL stackIn_14_4;
          StringBuilder stackIn_14_5;
          java.net.URL stackIn_15_2;
          java.net.URL stackIn_15_3;
          String stackIn_15_6;
          Throwable decompiledCaughtException = null;
          String var3 = null;
          Exception var3_ref = null;
          ce var4 = null;
          DataInputStream var5 = null;
          int var6 = 0;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var10 = null;
          var6 = TrackController.field_F ? 1 : 0;
          try {
            var3 = "";
            if (param0 != null) {
              var3 = j.a(false, param0);
            }
            if (param2 != null) {
              if (param0 != null) {
                var3 = var3 + " | ";
              }
              var3 = var3 + param2;
            }
            re.a((byte) 53, var3);
            var7 = bb.a(var3, (byte) -82, "%3a", ":");
            var8 = bb.a(var7, (byte) -82, "%40", "@");
            var9 = bb.a(var8, (byte) -82, "%26", "&");
            var10 = bb.a(var9, (byte) -82, "%23", "#");
            if (param1 != 0) {
              return;
            }
            if (null == qf.field_b) {
              return;
            }
            stackIn_14_0 = re.field_f;
            stackIn_14_1 = false;
            stackIn_14_2 = null;
            stackIn_14_3 = null;
            stackIn_14_4 = qf.field_b.getCodeBase();
            stackIn_14_5 = new StringBuilder().append("clienterror.ws?c=").append(lj.field_a).append("&u=");
            if (null != ac.field_b) {
              stackIn_15_2 = null;
              stackIn_15_3 = null;
              stackIn_15_6 = ac.field_b;
            } else {
              stackIn_15_2 = null;
              stackIn_15_3 = null;
              stackIn_15_6 = "" + fi.field_p;
            }
            var4 = ((uf) (Object) stackIn_14_0).a(stackIn_14_1, new java.net.URL(stackIn_14_4, ((StringBuilder) (Object) stackIn_14_5).append(stackIn_15_6).append("&v1=").append(uf.field_e).append("&v2=").append(uf.field_g).append("&e=").append(var10).toString()));
            while (0 == var4.field_f) {
              wl.a(1L, false);
            }
            if (var4.field_f == 1) {
              var5 = (DataInputStream) (var4.field_e);
              var5.read();
              var5.close();
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

    final static cg[] a(int param0, la param1) {
        int var5 = 0;
        cg[] stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        cg[] var4 = null;
        cg var6 = null;
        int var6_int = 0;
        int var7 = 0;
        var7 = TrackController.field_F ? 1 : 0;
        try {
          var2_int = param1.d(param0 ^ 12, 8);
          if (var2_int > 0) {
            return null;
          }
          var3 = param1.d(0, param0);
          var4 = new cg[var3];
          for (var5 = 0; var3 > var5; var5++) {
            if (lf.a((byte) -68, param1)) {
              var6 = new cg();
              param1.d(0, 24);
              param1.d(0, 24);
              var6.field_a = param1.d(param0 ^ 12, 24);
              param1.d(0, 9);
              param1.d(0, 12);
              param1.d(param0 - 12, 12);
              param1.d(0, 12);
              var4[var5] = var6;
            } else {
              var6_int = param1.d(0, be.d((byte) -98, -1 + var5));
              var4[var5] = var4[var6_int];
            }
          }
          stackIn_12_0 = var4;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("hb.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final Object a(long param0, byte param1) {
        ad var7 = null;
        vh var8 = (vh) (this.field_e.a(param0, 20));
        int var5 = 79 / ((param1 + 50) / 50);
        if (var8 == null) {
          return null;
        }
        Object var6 = var8.a((byte) 52);
        if (var6 != null) {
          if (!var8.f(-19429)) {
            this.field_h.a(var8, 8466);
            var8.field_m = 0L;
          } else {
            var7 = new ad(var6, var8.field_o);
            this.field_e.a(var7, var8.field_b, -1);
            this.field_h.a(var7, 8466);
            ((vh) ((Object) var7)).field_m = 0L;
            var8.a(-57);
            var8.e(0);
          }
          return var6;
        }
        var8.a(-110);
        var8.e(0);
        this.field_g = this.field_g + var8.field_o;
        return null;
    }

    private final void a(byte param0, vh param1) {
        RuntimeException var3 = null;
        String var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -92) {
            var4 = (String) null;
            hb.a((Throwable) null, 126, (String) null);
          }
          if (param1 == null) {
            return;
          }
          param1.a(-113);
          param1.e(0);
          this.field_g = this.field_g + param1.field_o;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("hb.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final void a(long param0, int param1) {
        vh var4 = (vh) (this.field_e.a(param0, 20));
        if (param1 < -68) {
          this.a((byte) -108, var4);
          return;
        }
        field_c = (String) null;
        this.a((byte) -108, var4);
    }

    private final void a(int param0, int param1, long param2, Object param3) {
        vh var8 = null;
        ad var6 = null;
        int var7 = TrackController.field_F ? 1 : 0;
        if (this.field_b < param0) {
          throw new IllegalStateException();
        }
        this.a(param2, -89);
        this.field_g = this.field_g - param0;
        while (this.field_g < 0) {
          var8 = (vh) (this.field_h.a(65));
          this.a((byte) -103, var8);
        }
        if (param1 >= -53) {
          return;
        }
        try {
          var6 = new ad(param3, param0);
          this.field_e.a(var6, param2, -1);
          this.field_h.a(var6, 8466);
          ((vh) ((Object) var6)).field_m = 0L;
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "hb.D(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private hb() throws Throwable {
        throw new Error();
    }

    public static void a(boolean param0) {
        field_c = null;
        field_d = null;
        field_i = null;
        if (param0) {
          field_i = (java.awt.Image) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final void a(int param0, Object param1, long param2) {
        try {
          this.a(1, -84, param2, param1);
          if (param0 >= -26) {
            this.a(-15L, (byte) -124);
          }
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "hb.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_a = "OK";
        field_d = "Type your password again to make sure it's correct";
        field_c = "Time bonus: ";
        field_f = 0;
    }
}
