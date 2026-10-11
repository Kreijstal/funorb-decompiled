/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ol {
    static int[] field_d;
    static String field_c;
    int field_f;
    static int field_b;
    int field_a;
    int[] field_g;
    static String field_e;

    final static void a(int param0, int param1, int param2, long param3, fe param4, int param5, int param6, boolean param7, int param8, String param9, boolean param10, int param11, int param12, int param13) {
        try {
          RuntimeException stackIn_12_0 = null;
          StringBuilder stackIn_12_1 = null;
          String stackIn_13_2 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          Throwable decompiledCaughtException = null;
          IOException var15 = null;
          RuntimeException var15_ref = null;
          try {
            nf.field_l = new hj(param1);
            ff.field_D = new hj(param6);
            dh.field_x = param12;
            ua.field_c = param8;
            kc.field_D = param10;
            cl.field_w = param5;
            ai.field_d = param9;
            if (param11 != 64) {
              return;
            }
            wd.field_g = param7;
            pi.field_h = param2;
            lf.field_c = param13;
            l.field_b = param4;
            kf.field_p = param0;
            qb.field_k = param3;
            if (null == l.field_b.field_v) {
              return;
            }
            try {
              ah.field_b = new we(l.field_b.field_v, 64, 0);
              return;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var15 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(var15.toString());
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var15_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_12_0 = var15_ref;
            stackIn_12_1 = new StringBuilder().append("ol.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_13_2 = "null";
            } else {
              stackIn_13_2 = "{...}";
            }
            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
            if (param9 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw ch.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(int param0) {
        if (param0 > -26) {
          ol.a(false);
          if (null != this.field_g) {
            return this.field_g.length == 0 ? 0 : this.field_g[-1 + this.field_g.length];
          }
          return 0;
        }
        if (null == this.field_g) {
          return 0;
        }
        if (this.field_g.length != 0) {
          return this.field_g[-1 + this.field_g.length];
        }
        return 0;
    }

    public static void a(boolean param0) {
        field_c = null;
        field_d = null;
        if (param0) {
          field_d = (int[]) null;
          field_e = null;
          return;
        }
        field_e = null;
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
          String var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          int var3 = 0;
          String var4 = null;
          java.net.URL var5 = null;
          java.applet.Applet var6 = null;
          RuntimeException stackIn_10_0 = null;
          StringBuilder stackIn_10_1 = null;
          String stackIn_11_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var2 = param0.getDocumentBase().getFile();
              var3 = var2.indexOf('?');
              var4 = "reload.ws";
              if (var3 >= 0) {
                var4 = var4 + var2.substring(var3);
              }
              var5 = new java.net.URL(param0.getCodeBase(), var4);
              param0.getAppletContext().showDocument(dh.a(param0, (byte) 117, var5), "_self");
              if (param1 == 30194) {
                return;
              }
              var6 = (java.applet.Applet) null;
              ol.a((java.applet.Applet) null, 39);
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
            stackIn_10_0 = var2_ref2;
            stackIn_10_1 = new StringBuilder().append("ol.B(");
            if (param0 == null) {
              stackIn_11_2 = "null";
            } else {
              stackIn_11_2 = "{...}";
            }
            throw ch.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int b(int param0, int param1) {
        int var3 = 0;
        int var4;
        var4 = Transmogrify.field_A ? 1 : 0;
        if (this.field_g != null &&
          this.field_g.length != 0) {
          for (var3 = 1; this.field_g.length > var3; var3++) {
            if (this.field_g[var3] + this.field_g[-1 + var3] >> 1 > param1) {
              return -1 + var3;
            }
          }
          if (param0 == 29791) {
            return -1 + this.field_g.length;
          }
          this.field_g = (int[]) null;
          return -1 + this.field_g.length;
        }
        return 0;
    }

    ol(int param0, int param1, int param2) {
        this.field_g = new int[param2 + 1];
        this.field_a = param0;
        this.field_f = param1;
    }

    final static int a(int param0, int param1) {
        int var2;
        int var2Lifetime1;
        if (param1 == 0) {
          return 0;
        }
        if (param1 > 0) {
          var2 = 1;
          if (param1 > 65535) {
            var2 += 16;
            param1 = param1 >> 16;
          }
          if (param1 > 255) {
            param1 = param1 >> 8;
            var2 += 8;
          }
          if (param1 > 15) {
            var2 += 4;
            param1 = param1 >> 4;
          }
          if (param1 > 3) {
            var2 += 2;
            param1 = param1 >> 2;
          }
          if (param1 > 1) {
            param1 = param1 >> 1;
            var2++;
          }
          return var2;
        }
        var2Lifetime1 = 2;
        if (-65536 > param1) {
          param1 = param1 >> 16;
          var2Lifetime1 += 16;
        }
        if (param1 < -256) {
          var2Lifetime1 += 8;
          param1 = param1 >> 8;
        }
        if (param0 != -23755) {
          return 48;
        }
        if (-16 > param1) {
          param1 = param1 >> 4;
          var2Lifetime1 += 4;
        }
        if (param1 < -4) {
          var2Lifetime1 += 2;
          param1 = param1 >> 2;
        }
        if (param1 < -2) {
          var2Lifetime1++;
          param1 = param1 >> 1;
        }
        return var2Lifetime1;
    }

    static {
        field_b = 0;
        field_c = "All";
        field_e = "Connection lost. <%0>";
    }
}
