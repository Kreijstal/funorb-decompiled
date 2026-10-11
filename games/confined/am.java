/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class am extends fj implements hi {
    fj field_H;
    static int[] field_I;

    private final boolean a(fj param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -42) {
            this.field_H = (fj) null;
          }
          stackIn_7_0 = (this.field_H != null) && (!this.field_H.e((byte) 107)) && (this.field_H.a(param0, 418));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("am.IA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, fj param3, int param4, int param5) {
        fj var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (this.field_H != null) {
            this.field_H.a(-61, this.field_m + param1, param2, param3, param4, param5 + this.field_q);
          }
          if (param0 > -18) {
            var8 = (fj) null;
            this.a(-77, -117, (byte) 21, (fj) null, 34, -52, -69);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("am.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    StringBuilder a(StringBuilder param0, int param1, Hashtable param2, boolean param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3) {
            this.f(-102);
          }
          if (this.a((byte) -13, param1, param2, param0)) {
            this.a(param0, param2, (byte) -63, param1);
            this.a(param2, 3803, param0, param1);
          }
          stackIn_6_0 = (StringBuilder) (param0);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("am.O(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    void f(int param0) {
        if (param0 > -49) {
          CharSequence var3 = (CharSequence) null;
          am.a(-97, (CharSequence) null);
        }
        if (this.field_H != null) {
          this.field_H.d(60);
        }
    }

    final void a(Hashtable param0, int param1, StringBuilder param2, int param3) {
        StringBuilder discarded$22 = null;
        int var5_int = 0;
        StringBuilder discarded$24 = null;
        StringBuilder discarded$23 = null;
        int var6 = 0;
        fj var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = Confined.field_J ? 1 : 0;
        try {
          discarded$22 = param2.append('\n');
          if (param1 != 3803) {
            var7 = (fj) null;
            this.a((fj) null, 9);
          }
          for (var5_int = 0; var5_int <= param3; var5_int++) {
            discarded$24 = param2.append(' ');
          }
          if (null == this.field_H) {
            discarded$23 = param2.append("null");
          } else {
            this.field_H.a(param2, param3 + 1, param0, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("am.BA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    fj a(byte param0) {
        if (param0 != -110) {
          this.field_H = (fj) null;
        }
        fj var2 = this.field_H;
        if (var2 == null) {
          return null;
        }
        if (var2.e((byte) 63)) {
          return var2;
        }
        return null;
    }

    String f(byte param0) {
        String var3 = null;
        if (param0 >= -82) {
          this.a(-89, 75, (byte) -88, -37);
        }
        String var2 = super.f((byte) -117);
        if (null != this.field_H) {
          var3 = this.field_H.f((byte) -87);
          if (var3 != null) {
            return var3;
          }
        }
        return var2;
    }

    final boolean a(int param0, int param1, byte param2, fj param3, int param4, int param5, int param6) {
        boolean discarded$1 = false;
        RuntimeException var8 = null;
        fj var9 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 36) {
            var9 = (fj) null;
            discarded$1 = this.b((fj) null, 115);
          }
          stackIn_7_0 = (null != this.field_H) && (this.field_H.e((byte) -128)) && (this.field_H.a(param0, param1, (byte) 36, param3, param4, param5, param6));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("am.W(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    boolean a(int param0, int param1, byte param2, int param3, fj param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 91) {
            this.field_H = (fj) null;
          }
          stackIn_6_0 = (this.field_H != null) && (this.field_H.a(this.field_q + param0, param1, (byte) 91, this.field_m + param3, param4, param5, param6));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("am.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean a(fj param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 418) {
            this.field_H = (fj) null;
          }
          stackIn_6_0 = (null != this.field_H) && (this.field_H.a(param0, param1 ^ 0));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("am.I(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final void b(int param0) {
        if (this.field_H != null) {
          this.field_H.b(84);
        }
        if (param0 != 84) {
          fj var3 = (fj) null;
          this.a((fj) null, -62);
        }
    }

    void a(int param0, int param1, byte param2, int param3) {
        if (param2 <= 36) {
          return;
        }
        if (param1 == 0 &&
          null != this.field_n) {
          this.field_n.a((byte) -125, param3, true, (fj) (this), param0);
        }
        if (null != this.field_H) {
          this.field_H.a(param0 + this.field_m, param1, (byte) 100, this.field_q + param3);
        }
    }

    final boolean a(fj param0, byte param1, int param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = -29 / ((47 - param1) / 43);
          if (this.field_H != null &&
            this.field_H.e((byte) -123) &&
            this.field_H.a(param0, (byte) -59, param2, param3)) {
            return true;
          }
          var6 = param2;
          if (80 != var6) {
            return false;
          }
          if (!mc.field_e[81]) {
            stackIn_10_0 = this.a(param0, (byte) -42);
          } else {
            stackIn_10_0 = this.b(param0, -7244);
          }
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("am.Q(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void g(int param0) {
        int var1_int = 0;
        int var2 = Confined.field_J ? 1 : 0;
        int var1_intLifetime1;
        try {
          kh.field_gb.a((byte) 31);
          if (param0 != -4258) {
            CharSequence var3 = (CharSequence) null;
            am.a(-36, (CharSequence) null);
          }
          for (var1_int = 0; var1_int < 32; var1_int++) {
            wg.field_d[var1_int] = 0L;
          }
          for (var1_intLifetime1 = 0; var1_intLifetime1 < 32; var1_intLifetime1++) {
            of.field_c[var1_intLifetime1] = 0L;
          }
          Confined.field_D = 0;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "am.HA(" + param0 + ')');
        }
    }

    public static void b(boolean param0) {
        if (!param0) {
          return;
        }
        field_I = null;
    }

    final static String a(int param0, CharSequence param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = hd.a(ra.a(param1, 119), (byte) 112);
          if (var2 == null) {
            var2 = "";
          }
          if (param0 > 47) {
            stackIn_6_0 = var2;
            return stackIn_6_0;
          }
          stackIn_4_0 = (String) null;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("am.GA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final boolean e(byte param0) {
        int var2 = -79 % ((-74 - param0) / 49);
        return this.a((byte) -110) != null ? true : false;
    }

    am(int param0, int param1, int param2, int param3, fe param4, uk param5) {
        super(param0, param1, param2, param3, param4, param5);
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
          java.net.URL var4 = null;
          try {
            try {
              var4 = param1.getCodeBase();
              var3 = pn.a(var4, (byte) -33, param1).getFile();
              kf.a((byte) 53, "updatelinks", param1, new Object[]{"home", var3 + "home.ws"});
              kf.a((byte) 53, "updatelinks", param1, new Object[]{"gamelist", var3 + "togamelist.ws"});
              kf.a((byte) 53, "updatelinks", param1, new Object[]{"serverlist", var3 + "toserverlist.ws"});
              kf.a((byte) 53, "updatelinks", param1, new Object[]{"options", var3 + "options.ws"});
              kf.a((byte) 53, "updatelinks", param1, new Object[]{"terms", var3 + "terms.ws"});
              if (param0 < 16) {
                field_I = (int[]) null;
              }
              kf.a((byte) 53, "updatelinks", param1, new Object[]{"privacy", var3 + "privacy.ws"});
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref;
            stackIn_8_1 = new StringBuilder().append("am.KA(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw sd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int c(int param0) {
        if (param0 <= 65) {
          am.b(true);
        }
        return this.field_H != null ? this.field_H.c(94) : 0;
    }

    final static void a(int param0, byte param1, int param2, int param3) {
        sd.field_b = param3;
        cg.field_a = param0;
        ln.field_c = param2;
        int var4 = 25 % ((77 - param1) / 33);
    }

    private final boolean b(fj param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -7244) {
            this.a(87, -104, -99, 35, 47);
          }
          stackIn_7_0 = (this.field_H != null) && (!this.field_H.e((byte) 62)) && (this.field_H.a(param0, 418));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("am.JA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(-128, param1, param2, param3, param4);
        if (param0 > -109) {
          field_I = (int[]) null;
        }
        this.f(-94);
    }

    void a(fj param0, int param1, int param2, int param3) {
        super.a(param0, param1 ^ 0, param2, param3);
        if (param1 != 11579568) {
          return;
        }
        try {
          if (this.field_H != null) {
            this.field_H.a(param0, param1 + 0, this.field_q + param2, param3 + this.field_m);
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "am.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
    }
}
