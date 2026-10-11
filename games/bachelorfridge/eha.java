/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class eha extends td {
    static String field_r;
    static int[] field_s;
    static String field_p;
    static int[] field_q;

    final static void c(int param0) {
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        rg var5 = null;
        int var5_int = 0;
        int var6 = 0;
        gea var6_ref_gea = null;
        int[] var7 = null;
        int var9 = 0;
        pf var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        var9 = BachelorFridge.field_y;
        try {
          var11 = ig.field_m;
          var2 = var11.b(16711935);
          var3 = -49 / ((param0 + 10) / 41);
          var4 = var11.b(16711935);
          if (var2 == 0) {
            var5 = (rg) (rp.field_C.b((byte) 90));
            if (var5 == null) {
              vc.a((byte) -124);
              return;
            }
            var6 = dw.field_f - var11.field_g;
            var13 = var5.field_g;
            var12 = var13;
            var7 = var12;
            if (var13.length << 2 < var6) {
              var6 = var13.length << 2;
            }
            for (var8 = 0; var6 > var8; var8++) {
              var7[var8 >> 2] = var7[var8 >> 2] + (var11.b(16711935) << (dda.a(var8, 3) << 8));
            }
            var5.a(false);
            return;
          }
          if (var2 == 1) {
            var5_int = var11.e(-4095);
            var6_ref_gea = (gea) (wd.field_t.b((byte) 90));
            while (var6_ref_gea != null) {
              if (var6_ref_gea.field_i != var4 ||
                var5_int != var6_ref_gea.field_m) {
                var6_ref_gea = (gea) (wd.field_t.c(0));
                continue;
              }
              break;
            }
            if (var6_ref_gea == null) {
              vc.a((byte) -109);
              return;
            }
            var6_ref_gea.a(false);
            return;
          }
          cv.a(1, "LR1: " + nia.d((byte) -116), (Throwable) null);
          vc.a((byte) -71);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1), "eha.B(" + param0 + ')');
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          String var3 = null;
          java.applet.Applet var4 = null;
          java.net.URL var5 = null;
          try {
            try {
              var5 = param1.getCodeBase();
              var3 = ow.a(var5, (byte) -105, param1).getFile();
              ac.a(param1, "updatelinks", new Object[]{"home", var3 + "home.ws"}, (byte) 73);
              if (param0 > -102) {
                var4 = (java.applet.Applet) null;
                eha.a(4, (java.applet.Applet) null);
              }
              ac.a(param1, "updatelinks", new Object[]{"gamelist", var3 + "togamelist.ws"}, (byte) 73);
              ac.a(param1, "updatelinks", new Object[]{"serverlist", var3 + "toserverlist.ws"}, (byte) 73);
              ac.a(param1, "updatelinks", new Object[]{"options", var3 + "options.ws"}, (byte) 73);
              ac.a(param1, "updatelinks", new Object[]{"terms", var3 + "terms.ws"}, (byte) 73);
              ac.a(param1, "updatelinks", new Object[]{"privacy", var3 + "privacy.ws"}, (byte) 73);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref;
            stackIn_8_1 = new StringBuilder().append("eha.E(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw pe.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    eha(int param0, aga param1, int param2, int param3) {
        super(param0, param1);
        try {
          this.field_n = param3;
          this.field_k = param2;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "eha.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        java.applet.Applet var3 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null &&
            param1.length() >= bp.field_z &&
            param1.length() <= ko.field_e) {
            if (param0 != 15) {
              var3 = (java.applet.Applet) null;
              eha.a(13, (java.applet.Applet) null);
            }
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("eha.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_s = null;
        field_q = null;
        if (param0 != -1452) {
          eha.c(-28);
        }
        field_p = null;
        field_r = null;
    }

    final ii a(op param0, int param1) {
        int var11 = 0;
        ii stackIn_3_0 = null;
        j stackIn_32_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        j var4 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        wia var14 = null;
        aga var15 = null;
        iv var16 = null;
        int var17 = 0;
        aga var18 = null;
        int[][] var22 = null;
        int var10Lifetime1;
        var17 = BachelorFridge.field_y;
        try {
          var18 = this.field_h.a(59, param0);
          var4 = new j(this.field_g, new nq(var18));
          var4.field_s = this.field_n;
          var4.field_r = this.field_k;
          var22 = var4.a(0, -77, param0, var18);
          var6 = 17;
          var7 = 17;
          var8 = -1 + var6 >> 1;
          var9 = var7 - 1 >> 1;
          if (param1 != 3) {
            stackIn_3_0 = (ii) null;
            return stackIn_3_0;
          }
          for (var10 = 0; var10 < var6; var10++) {
            for (var11 = 0; var11 < var7; var11++) {
              if (var22[var10][var11] == 1) {
                var12 = this.field_k + var10 - var8;
                var13 = this.field_n - var9 + var11;
                if (var12 >= 0 &&
                  param0.field_z > var12 &&
                  var13 >= 0 &&
                  param0.field_B > var13) {
                  var14 = param0.field_a[var12][var13];
                  var15 = var14.field_l;
                  if (var15 != null) {
                    var16 = new iv(new nq(var15), false, 1, 30, 15);
                    var4.field_o.a(var16, true);
                  }
                }
              }
            }
          }
          var4.field_q = new int[var4.field_o.g(param1 - 3)];
          for (var10Lifetime1 = 0; var10Lifetime1 < var4.field_q.length; var10Lifetime1++) {
            var4.field_q[var10Lifetime1] = 1 + kla.a(4, param0.field_w, -2147483648);
          }
          stackIn_32_0 = var4;
          return (ii) ((Object) stackIn_32_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_35_0 = var3;
          stackIn_35_1 = new StringBuilder().append("eha.A(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void c(boolean param0) {
        gfa.field_i = false;
        eea.field_b = param0 ? true : false;
        ep.a(-1, 8192);
        ola.field_p = tn.field_a;
        dka.field_G = tn.field_a;
    }

    static {
        field_p = "Select creatures for battle";
        field_q = new int[4];
        field_r = "To report a player, right-click on their name and select the option to report abuse.";
    }
}
