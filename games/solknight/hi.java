/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hi {
    private o[] field_a;

    final static boolean a(char param0, byte param1) {
        char[] var2 = null;
        int var2_int = 0;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          if (param0 > 0 &&
            param0 < 128) {
            return true;
          }
          if (param0 >= 160 &&
            param0 <= 255) {
            return true;
          }
          if (param0 != 0) {
            var6 = vk.field_e;
            var2 = var6;
            var3 = 0;
            while (var3 < var6.length) {
              var4 = var6[var3];
              if (~param0 != ~var4) {
                var3++;
                continue;
              }
              return true;
            }
          }
          var2_int = -14 / ((param1 + 14) / 57);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var2_ref), "hi.A(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(Throwable param0, String param1, int param2) {
        try {
          dl stackIn_13_0;
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
          nj var4 = null;
          DataInputStream var5 = null;
          int var6 = 0;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var10 = null;
          var6 = SolKnight.field_L ? 1 : 0;
          try {
            var3 = "";
            if (param0 != null) {
              var3 = kj.a((byte) 105, param0);
            }
            if (param1 != null) {
              if (param0 != null) {
                var3 = var3 + " | ";
              }
              var3 = var3 + param1;
            }
            we.a(var3, param2 ^ -2);
            var7 = hl.a(var3, "%3a", ":", true);
            var8 = hl.a(var7, "%40", "@", true);
            var9 = hl.a(var8, "%26", "&", true);
            var10 = hl.a(var9, "%23", "#", true);
            if (ik.field_c == null) {
              return;
            }
            stackIn_13_0 = lg.field_l;
            stackIn_13_1 = null;
            stackIn_13_2 = null;
            stackIn_13_3 = ik.field_c.getCodeBase();
            stackIn_13_4 = new StringBuilder().append("clienterror.ws?c=").append(ke.field_J).append("&u=");
            if (lb.field_W != null) {
              stackIn_14_1 = null;
              stackIn_14_2 = null;
              stackIn_14_5 = lb.field_W;
            } else {
              stackIn_14_1 = null;
              stackIn_14_2 = null;
              stackIn_14_5 = "" + d.field_c;
            }
            var4 = ((dl) (Object) stackIn_13_0).a(new java.net.URL(stackIn_13_3, ((StringBuilder) (Object) stackIn_13_4).append(stackIn_14_5).append("&v1=").append(dl.field_a).append("&v2=").append(dl.field_x).append("&e=").append(var10).toString()), (byte) 68);
            while (var4.field_c == 0) {
              i.a((byte) 27, 1L);
            }
            if (var4.field_c == param2) {
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

    final static void a(int param0, int param1) {
        gg var2 = null;
        int var3 = 0;
        bl var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = SolKnight.field_L ? 1 : 0;
        try {
          var4 = (bl) (m.field_h.a((byte) 51));
          while (var4 != null) {
            la.a(0, param0, var4);
            var4 = (bl) (m.field_h.b(param1 ^ 5819));
          }
          if (param1 != -5887) {
            return;
          }
          var2 = kh.field_a.a((byte) 51);
          while (var2 != null) {
            v.a(param1 ^ -5885, param0);
            var2 = kh.field_a.b(-57);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var2_ref), "hi.D(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        if (param0) {
          return;
        }
        uj.a(param1, param3, param4, this.field_a, param2, 2);
    }

    hi(o[] param0) {
        try {
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "hi.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
