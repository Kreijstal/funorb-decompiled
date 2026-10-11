/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ic extends am {
    String[][] field_p;
    long[][] field_i;
    static String field_o;
    int field_q;
    int field_h;
    static bd field_k;
    boolean field_m;
    int[][] field_l;
    static int field_n;
    int field_j;

    final static void a(int param0, int param1, p param2, byte param3) {
        try {
          pe.field_fb[4].a(true, 128, (int)param2.field_c, param0 + 8, 8 + param1);
          if (param3 != 107) {
            field_n = -58;
          }
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "ic.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(byte param0, String param1, Throwable param2) {
        try {
          fd stackIn_12_0;
          int stackIn_12_1;
          java.net.URL stackIn_12_2;
          java.net.URL stackIn_12_3;
          java.net.URL stackIn_12_4;
          StringBuilder stackIn_12_5;
          java.net.URL stackIn_13_2;
          java.net.URL stackIn_13_3;
          String stackIn_13_6;
          Throwable decompiledCaughtException = null;
          String var3 = null;
          Exception var3_ref = null;
          kk var4 = null;
          DataInputStream var5 = null;
          int var6 = 0;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var10 = null;
          var6 = HostileSpawn.field_I ? 1 : 0;
          try {
            var3 = "";
            if (param2 != null) {
              var3 = od.a((byte) -77, param2);
            }
            if (param1 != null) {
              if (param2 != null) {
                var3 = var3 + " | ";
              }
              var3 = var3 + param1;
            }
            jf.a(var3, (byte) 19);
            var7 = re.a(var3, ":", "%3a", -125);
            var8 = re.a(var7, "@", "%40", -124);
            var9 = re.a(var8, "&", "%26", -113);
            var10 = re.a(var9, "#", "%23", -113);
            if (HostileSpawn.field_B == null) {
              return;
            }
            stackIn_12_0 = lj.field_t;
            stackIn_12_1 = 30085;
            stackIn_12_2 = null;
            stackIn_12_3 = null;
            stackIn_12_4 = HostileSpawn.field_B.getCodeBase();
            stackIn_12_5 = new StringBuilder().append("clienterror.ws?c=").append(ql.field_a).append("&u=");
            if (kj.field_e != null) {
              stackIn_13_2 = null;
              stackIn_13_3 = null;
              stackIn_13_6 = kj.field_e;
            } else {
              stackIn_13_2 = null;
              stackIn_13_3 = null;
              stackIn_13_6 = "" + wg.field_yb;
            }
            var4 = ((fd) (Object) stackIn_12_0).a(stackIn_12_1, new java.net.URL(stackIn_12_4, ((StringBuilder) (Object) stackIn_12_5).append(stackIn_13_6).append("&v1=").append(fd.field_u).append("&v2=").append(fd.field_h).append("&e=").append(var10).toString()));
            while (var4.field_f == 0) {
              vj.a(1L, (byte) -49);
            }
            if (param0 >= -114) {
              return;
            }
            if (1 == var4.field_f) {
              var5 = (DataInputStream) (var4.field_c);
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

    final static ll b(String param0, byte param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        String var6 = null;
        ll var7 = null;
        int var8 = 0;
        ll stackIn_4_0 = null;
        ll stackIn_7_0 = null;
        ll stackIn_10_0 = null;
        ll stackIn_18_0 = null;
        ll stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_4_0 = gf.field_f;
            return stackIn_4_0;
          }
          if (var2_int > 255) {
            stackIn_7_0 = hb.field_v;
            return stackIn_7_0;
          }
          var3 = cj.a(param0, -57, '.');
          if (var3.length < 2) {
            stackIn_10_0 = gf.field_f;
            return stackIn_10_0;
          }
          var4 = var3;
          if (param1 != -36) {
            ic.c(29);
          }
          for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            var7 = cb.a(var6, 99);
            if (var7 != null) {
              stackIn_18_0 = var7;
              return stackIn_18_0;
            }
          }
          stackIn_21_0 = gn.a(var3[-1 + var3.length], false);
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("ic.A(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void c(int param0) {
        if (param0 != 128) {
          p var2 = (p) null;
          ic.a(43, 18, (p) null, (byte) -98);
        }
        field_o = null;
        field_k = null;
    }

    ic() {
    }

    static {
        field_o = "Email (Login):";
    }
}
