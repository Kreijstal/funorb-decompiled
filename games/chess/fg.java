/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fg {
    static String field_a;
    static jc field_c;
    static boolean field_b;
    static ok field_d;

    public static void a(boolean param0) {
        field_c = null;
        if (!param0) {
          fg.a(false);
          field_a = null;
          field_d = null;
          return;
        }
        field_a = null;
        field_d = null;
    }

    final static void a(Throwable param0, byte param1, String param2) {
        try {
          jk stackIn_14_0;
          int stackIn_14_1;
          java.net.URL stackIn_14_2;
          java.net.URL stackIn_14_3;
          java.net.URL stackIn_14_4;
          StringBuilder stackIn_14_5;
          java.net.URL stackIn_15_2 = null;
          java.net.URL stackIn_15_3 = null;
          String stackIn_15_6 = null;
          Throwable decompiledCaughtException = null;
          String var3 = null;
          Exception var3_ref = null;
          nl var4 = null;
          DataInputStream var5 = null;
          int var6 = 0;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var10 = null;
          var6 = Chess.field_G;
          try {
            var3 = "";
            if (param0 != null) {
              var3 = qm.a((byte) -89, param0);
            }
            if (param2 != null) {
              if (param0 != null) {
                var3 = var3 + " | ";
              }
              var3 = var3 + param2;
            }
            ol.a(var3, 26613);
            var7 = kb.a(var3, 0, "%3a", ":");
            var8 = kb.a(var7, param1 + 77, "%40", "@");
            var9 = kb.a(var8, 0, "%26", "&");
            var10 = kb.a(var9, param1 ^ -77, "%23", "#");
            if (null == ba.field_L) {
              return;
            }
            stackIn_14_0 = um.field_g;
            stackIn_14_1 = -49;
            stackIn_14_2 = null;
            stackIn_14_3 = null;
            stackIn_14_4 = ba.field_L.getCodeBase();
            stackIn_14_5 = new StringBuilder().append("clienterror.ws?c=").append(cg.field_a).append("&u=");
            if (null == fj.field_h) {
              stackIn_15_2 = null;
              stackIn_15_3 = null;
              stackIn_15_6 = "" + gi.field_e;
            } else {
              stackIn_15_2 = null;
              stackIn_15_3 = null;
              stackIn_15_6 = fj.field_h;
            }
            var4 = ((jk) (Object) stackIn_14_0).a((byte) stackIn_14_1, new java.net.URL(stackIn_14_4, ((StringBuilder) (Object) stackIn_14_5).append(stackIn_15_6).append("&v1=").append(jk.field_o).append("&v2=").append(jk.field_i).append("&e=").append(var10).toString()));
            if (param1 != -77) {
              field_a = (String) null;
            }
            while (var4.field_f == 0) {
              bc.a(1L, (byte) -92);
            }
            if (var4.field_f == 1) {
              var5 = (DataInputStream) (var4.field_b);
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

    static {
        field_a = "Show all private chat";
        field_c = new jc();
    }
}
