/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cv extends bca {
    final static void a(int param0, String param1, Throwable param2) {
        try {
          ht stackIn_13_0;
          java.net.URL stackIn_13_1;
          java.net.URL stackIn_13_2;
          java.net.URL stackIn_13_3;
          StringBuilder stackIn_13_4;
          java.net.URL stackIn_14_1;
          java.net.URL stackIn_14_2;
          String stackIn_14_5;
          Throwable decompiledCaughtException = null;
          String var3 = null;
          Exception var3_ref = null;
          eh var4 = null;
          DataInputStream var5 = null;
          int var6 = 0;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var10 = null;
          var6 = BachelorFridge.field_y;
          try {
            var3 = "";
            if (param2 != null) {
              var3 = sma.a(96, param2);
            }
            if (param1 != null) {
              if (param2 != null) {
                var3 = var3 + " | ";
              }
              var3 = var3 + param1;
            }
            sl.a((byte) -86, var3);
            var7 = ig.a(param0 - 19385, var3, ":", "%3a");
            var8 = ig.a(-19384, var7, "@", "%40");
            var9 = ig.a(param0 - 19385, var8, "&", "%26");
            var10 = ig.a(-19384, var9, "#", "%23");
            if (jia.field_m == null) {
              return;
            }
            stackIn_13_0 = v.field_d;
            stackIn_13_1 = null;
            stackIn_13_2 = null;
            stackIn_13_3 = jia.field_m.getCodeBase();
            stackIn_13_4 = new StringBuilder().append("clienterror.ws?c=").append(ej.field_p).append("&u=");
            if (null == da.field_b) {
              stackIn_14_1 = null;
              stackIn_14_2 = null;
              stackIn_14_5 = "" + om.field_v;
            } else {
              stackIn_14_1 = null;
              stackIn_14_2 = null;
              stackIn_14_5 = da.field_b;
            }
            var4 = ((ht) (Object) stackIn_13_0).a(new java.net.URL(stackIn_13_3, ((StringBuilder) (Object) stackIn_13_4).append(stackIn_14_5).append("&v1=").append(ht.field_g).append("&v2=").append(ht.field_c).append("&e=").append(var10).toString()), param0 + 23);
            while (var4.field_f == 0) {
              gda.a(false, 1L);
            }
            if (param0 == var4.field_f) {
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

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int var6_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int[] var7 = null;
        int var8 = 0;
        Throwable var9 = null;
        var8 = BachelorFridge.field_y;
        try {
          if (param1 != 28850) {
            var9 = (Throwable) null;
            cv.a(70, (String) null, (Throwable) null);
          }
          incrementValue$0 = param5;
          param5++;
          hba.a(param0, param3, tj.field_b[incrementValue$0], param1 ^ 28853, param4);
          incrementValue$1 = param2;
          param2--;
          hba.a(param0, param3, tj.field_b[incrementValue$1], param1 - 28843, param4);
          for (var6_int = param5; param2 >= var6_int; var6_int++) {
            var7 = tj.field_b[var6_int];
            var7[param4] = param0;
            var7[param3] = param0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var6), "cv.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        at stackIn_2_0 = null;
        bk stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 5) {
            stackIn_4_0 = new bk(param1, this);
            return (at) ((Object) stackIn_4_0);
          }
          stackIn_2_0 = (at) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("cv.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void a(op param0, int param1) {
        try {
          this.a(param0, (byte) -2);
          int var3_int = -4 / ((param1 - 12) / 35);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "cv.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void d(int param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = BachelorFridge.field_y;
        try {
          if (!rs.b(true)) {
            if (kga.field_c != null &&
              kga.field_c.field_f) {
              lga.c((byte) 112);
              pja.field_e.a((wj) (new em(pja.field_e, r.field_m)), (byte) 93);
            }
            return;
          }
          pja.field_e.a(true, kh.field_q, ef.field_k, param0 + 6382);
          if (param0 != -1) {
            return;
          }
          pja.field_e.i(0);
          while (kaa.b(127)) {
            pja.field_e.a(dla.field_j, (byte) 7, gf.field_k);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1), "cv.C(" + param0 + ')');
        }
    }

    cv(int param0, nq param1) {
        super(param0, param1);
    }

    cv(lu param0) {
        super(param0);
        int var2_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.field_k = param0.e((byte) 74);
          this.field_o = new eaa();
          var2_int = param0.b(16711935);
          while (true) {
            var2_int--;
            if (var2_int < 0) {
              return;
            }
            this.field_o.a(dca.a((byte) 102, param0), true);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("cv.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
    }
}
