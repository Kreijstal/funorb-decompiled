/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class v {
    static IntrusiveDeque field_b;
    static boolean field_a;

    final static void a(String param0, byte param1, Throwable param2) {
        try {
          rk stackIn_16_0;
          int stackIn_16_1;
          java.net.URL stackIn_16_2;
          java.net.URL stackIn_16_3;
          java.net.URL stackIn_16_4;
          StringBuilder stackIn_16_5;
          java.net.URL stackIn_17_2;
          java.net.URL stackIn_17_3;
          String stackIn_17_6;
          Throwable decompiledCaughtException = null;
          String var3 = null;
          Exception var3_ref = null;
          en var4 = null;
          DataInputStream var5 = null;
          int var6 = 0;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var10 = null;
          var6 = AceOfSkies.obfuscationControl ? 1 : 0;
          try {
            var3 = "";
            if (param2 != null) {
              var3 = br.a(param2, (byte) -29);
            }
            if (param0 != null) {
              if (param2 != null) {
                var3 = var3 + " | ";
              }
              var3 = var3 + param0;
            }
            jb.a(var3, 20164);
            var7 = eh.a(":", param1 + 165, "%3a", var3);
            var8 = eh.a("@", -77, "%40", var7);
            var9 = eh.a("&", param1 ^ -67, "%26", var8);
            if (param1 != -52) {
              return;
            }
            var10 = eh.a("#", 118, "%23", var9);
            if (null == fb.field_c) {
              return;
            }
            stackIn_16_0 = mj.field_a;
            stackIn_16_1 = 70;
            stackIn_16_2 = null;
            stackIn_16_3 = null;
            stackIn_16_4 = fb.field_c.getCodeBase();
            stackIn_16_5 = new StringBuilder().append("clienterror.ws?c=").append(bs.field_c).append("&u=");
            if (co.field_g == null) {
              stackIn_17_2 = null;
              stackIn_17_3 = null;
              stackIn_17_6 = "" + CipherPacketBuffer.field_o;
            } else {
              stackIn_17_2 = null;
              stackIn_17_3 = null;
              stackIn_17_6 = co.field_g;
            }
            var4 = ((rk) (Object) stackIn_16_0).a((byte) stackIn_16_1, new java.net.URL(stackIn_16_4, ((StringBuilder) (Object) stackIn_16_5).append(stackIn_17_6).append("&v1=").append(rk.field_o).append("&v2=").append(rk.field_l).append("&e=").append(var10).toString()));
            while (var4.field_a == 0) {
              IntrusiveNode.a(1L, false);
            }
            if (var4.field_a == 1) {
              var5 = (DataInputStream) (var4.field_f);
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

    public static void a(int param0) {
        if (param0 != 32342) {
          return;
        }
        field_b = null;
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
          RuntimeException stackIn_7_0 = null;
          StringBuilder stackIn_7_1 = null;
          String stackIn_8_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          String var3 = null;
          java.net.URL var4 = null;
          try {
            try {
              var4 = param1.getCodeBase();
              var3 = jf.a(param1, var4, 70).getFile();
              fe.a("updatelinks", -15201, new Object[]{"home", var3 + "home.ws"}, param1);
              fe.a("updatelinks", -15201, new Object[]{"gamelist", var3 + "togamelist.ws"}, param1);
              fe.a("updatelinks", -15201, new Object[]{"serverlist", var3 + "toserverlist.ws"}, param1);
              fe.a("updatelinks", -15201, new Object[]{"options", var3 + "options.ws"}, param1);
              fe.a("updatelinks", -15201, new Object[]{"terms", var3 + "terms.ws"}, param1);
              fe.a("updatelinks", -15201, new Object[]{"privacy", var3 + "privacy.ws"}, param1);
              if (param0) {
                return;
              }
              field_a = true;
              return;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_7_0 = var2_ref;
            stackIn_7_1 = new StringBuilder().append("v.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_8_2 = "null";
            } else {
              stackIn_8_2 = "{...}";
            }
            throw pn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = new IntrusiveDeque();
    }
}
