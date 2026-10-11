/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ki extends rc implements oh {
    static int field_C;
    static String field_A;
    nc field_B;

    private final void c(boolean param0) {
        int var4 = SolKnight.field_L ? 1 : 0;
        ck var2 = new ck(this.field_B);
        if (!param0) {
          ki.d(false);
        }
        rc var3 = (rc) (var2.a((byte) 114));
        while (var3 != null) {
          var3.d(1);
          var3 = (rc) (var2.c(124));
        }
    }

    final int f(int param0) {
        int var6 = 0;
        int var7 = SolKnight.field_L ? 1 : 0;
        int var2 = 0;
        ck var3 = new ck(this.field_B);
        rc var4 = (rc) (var3.a((byte) -59));
        int var5 = 21 / ((param0 - 17) / 43);
        while (var4 != null) {
          var6 = var4.f(74);
          if (var2 < var6) {
            var2 = var6;
          }
          var4 = (rc) (var3.c(116));
        }
        return var2;
    }

    ki(int param0, int param1, int param2, int param3, j param4) {
        super(param0, param1, param2, param3, param4, (dg) null);
        this.field_B = new nc();
    }

    final void a(rc param0, int param1) {
        try {
          if (param1 != 5411) {
            Hashtable var4 = (Hashtable) null;
            this.a(24, 112, (StringBuilder) null, (Hashtable) null);
          }
          this.field_B.a(param0, -7044);
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "ki.KA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
          java.net.URL var2 = null;
          if (param1 != -1) {
            field_A = (String) null;
          }
          try {
            var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
            param0.getAppletContext().showDocument(kk.a(param1 ^ -89, var2, param0), "_top");
          } catch (Exception exception) {
            exception.printStackTrace();
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static od[] a(int param0, da param1, int param2, int param3) {
        RuntimeException var4 = null;
        java.applet.Applet var5 = null;
        od[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!l.a(87, param2, param3, param1)) {
            return null;
          }
          if (param0 != 10) {
            var5 = (java.applet.Applet) null;
            ki.a((java.applet.Applet) null, 57);
          }
          stackIn_6_0 = bl.b(false);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("ki.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(int param0, int param1, StringBuilder param2, Hashtable param3) {
        StringBuilder discarded$3 = null;
        int var8 = 0;
        StringBuilder discarded$4 = null;
        ck var5 = null;
        int var6 = 0;
        rc var7 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var9 = SolKnight.field_L ? 1 : 0;
        try {
          var6 = 26 / ((param1 - 39) / 59);
          var5 = new ck(this.field_B);
          var7 = (rc) (var5.a((byte) -99));
          while (var7 != null) {
            discarded$3 = param2.append('\n');
            for (var8 = 0; var8 <= param0; var8++) {
              discarded$4 = param2.append(' ');
            }
            var7.a(-81, param3, param2, param0 + 1);
            var7 = (rc) (var5.c(115));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_10_0 = var5_ref;
          stackIn_10_1 = new StringBuilder().append("ki.V(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = SolKnight.field_L ? 1 : 0;
        if (param1 == 0 &&
          this.field_w != null) {
          this.field_w.a((byte) 116, param0, true, param2, (rc) (this));
        }
        if (param3 != 0) {
          return;
        }
        ck var5 = new ck(this.field_B);
        rc var6 = (rc) (var5.a(-25119));
        while (var6 != null) {
          var6.a(this.field_j + param0, param1, param2 + this.field_m, 0);
          var6 = (rc) (var5.b(640));
        }
    }

    final boolean a(int param0, int param1, boolean param2, int param3, int param4, int param5, rc param6) {
        RuntimeException var8 = null;
        rc var9 = null;
        int var10 = 0;
        ck var11 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = SolKnight.field_L ? 1 : 0;
        try {
          var11 = new ck(this.field_B);
          var9 = (rc) (var11.a((byte) 125));
          while (var9 != null) {
            if (var9.a(false)) {
              if (!var9.a(param0, param1 + this.field_m, false, param3, param4, param5 + this.field_j, param6)) {
                var9 = (rc) (var11.c(122));
                continue;
              }
              return true;
            }
            break;
          }
          if (!param2) {
            return false;
          }
          this.d((byte) 97);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_14_0 = var8;
          stackIn_14_1 = new StringBuilder().append("ki.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final boolean b(boolean param0) {
        if (!param0) {
          return true;
        }
        return null != this.d((byte) -48) ? true : false;
    }

    public static void d(boolean param0) {
        field_A = null;
        if (param0) {
          field_C = 53;
        }
    }

    final boolean b(int param0, rc param1) {
        RuntimeException var3 = null;
        rc var4 = null;
        ck var5 = null;
        rc var6 = null;
        int var7 = 0;
        ck var8 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          if (this.field_B.c(-1)) {
            return false;
          }
          if (param0 <= 89) {
            this.field_B = (nc) null;
          }
          var8 = new ck(this.field_B);
          var4 = (rc) (var8.a((byte) 112));
          while (var4 != null) {
            if (var4.b(true)) {
              var5 = new ck(this.field_B);
              var5.a(26229, var4);
              var6 = (rc) (var5.c(121));
              while (var6 != null) {
                if (!var6.a(-1463, param1)) {
                  var6 = (rc) (var5.c(125));
                  continue;
                }
                return true;
              }
            }
            var4 = (rc) (var8.c(115));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("ki.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    boolean a(char param0, byte param1, int param2, rc param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        rc var8 = null;
        ck var9 = null;
        boolean stackIn_15_0 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          var9 = new ck(this.field_B);
          var8 = (rc) (var9.a((byte) 77));
          while (var8 != null) {
            if (var8.a(false)) {
              if (var8.b(true) &&
                var8.a(param0, (byte) 88, param2, param3)) {
                return true;
              }
              var8 = (rc) (var9.c(115));
              continue;
            }
            break;
          }
          var6 = param2;
          if (80 != var6) {
            var6 = 9 / ((param1 - 31) / 56);
            return false;
          }
          if (fh.field_d[81]) {
            stackIn_15_0 = this.a((byte) -105, param3);
          } else {
            stackIn_15_0 = this.b(112, param3);
          }
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("ki.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        rc var6 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param2, -1, param1, param3)) {
            this.b(param2, -111, param1, param3);
            this.a(param3, -31, param2, param1);
          }
          if (param0 > -41) {
            var6 = (rc) null;
            this.a('￯', (byte) 103, -3, (rc) null);
          }
          stackIn_6_0 = (StringBuilder) (param2);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ki.GA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, rc param2, int param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        ck var7 = null;
        rc var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = SolKnight.field_L ? 1 : 0;
        try {
          var7 = new ck(this.field_B);
          if (param1 != 0) {
            field_A = (String) null;
          }
          var8 = (rc) (var7.a((byte) 93));
          while (var8 != null) {
            if (var8.a(false)) {
              var8.a(param0, param1 + 0, param2, this.field_j + param3, param4, this.field_m + param5);
              var8 = (rc) (var7.c(param1 ^ 127));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("ki.O(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final boolean a(int param0, rc param1, int param2, int param3, int param4, int param5, byte param6) {
        ck var8 = null;
        RuntimeException var8_ref = null;
        rc var9 = null;
        int var10 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = SolKnight.field_L ? 1 : 0;
        try {
          var8 = new ck(this.field_B);
          var9 = (rc) (var8.a((byte) 98));
          while (var9 != null) {
            if (var9.a(false)) {
              if (var9.b(true) &&
                var9.a(param0, param1, param2, param3, param4, param5, (byte) 50)) {
                return true;
              }
              var9 = (rc) (var8.c(118));
              continue;
            }
            break;
          }
          if (param6 > 33) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_16_0 = var8_ref;
          stackIn_16_1 = new StringBuilder().append("ki.LA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final String c(byte param0) {
        ck var2;
        rc var3;
        String var4;
        int var5;
        var5 = SolKnight.field_L ? 1 : 0;
        var2 = new ck(this.field_B);
        if (param0 < 14) {
          this.c((byte) 48);
        }
        var3 = (rc) (var2.a((byte) -122));
        while (var3 != null) {
          var4 = var3.c((byte) 106);
          if (var4 != null) {
            return var4;
          }
          var3 = (rc) (var2.c(117));
        }
        return null;
    }

    final void g(int param0) {
        int var4 = SolKnight.field_L ? 1 : 0;
        if (param0 != 0) {
          rc var5 = (rc) null;
          this.a((byte) 3, (rc) null);
        }
        ck var2 = new ck(this.field_B);
        rc var3 = (rc) (var2.a((byte) 81));
        while (var3 != null) {
          var3.g(0);
          var3 = (rc) (var2.c(115));
        }
    }

    final boolean a(int param0, rc param1) {
        ck var3 = null;
        RuntimeException var3_ref = null;
        rc var4 = null;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          var3 = new ck(this.field_B);
          var4 = (rc) (var3.a((byte) 92));
          while (true) {
            if (var4 == null) {
              if (param0 == -1463) {
                return false;
              }
              this.field_B = (nc) null;
              return false;
            }
            if (!var4.a(-1463, param1)) {
              var4 = (rc) (var3.c(121));
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("ki.MA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static int a(int param0, byte[] param1, int param2, int param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = SolKnight.field_L ? 1 : 0;
        try {
          var4_int = -1;
          if (param0 != -27129) {
            stackIn_3_0 = 75;
            return stackIn_3_0;
          }
          for (var5 = param3; param2 > var5; var5++) {
            var4_int = var4_int >>> 8 ^ og.field_g[255 & (param1[var5] ^ var4_int)];
          }
          var4_int = ~var4_int;
          stackIn_8_0 = var4_int;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("ki.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0) {
        ne.field_g = te.field_N.h(92);
        if (param0 > -100) {
          return;
        }
        CharSequence var2 = (CharSequence) ((Object) ne.field_g);
        kf.field_D = jg.a(var2, -2);
    }

    void a(int param0, int param1, int param2, rc param3) {
        RuntimeException runtimeException = null;
        ck var5 = null;
        rc var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          super.a(param0, param1, param2, param3);
          var5 = new ck(this.field_B);
          var6 = (rc) (var5.a((byte) 117));
          while (var6 != null) {
            if (var6.a(false)) {
              var6.a(param0 + this.field_m, 18874, param2 + this.field_j, param3);
              var6 = (rc) (var5.c(param1 ^ 18880));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("ki.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final boolean a(byte param0, rc param1) {
        ck var3 = null;
        RuntimeException var3_ref = null;
        rc var4 = null;
        ck var5 = null;
        rc var6 = null;
        int var7 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          if (this.field_B.c(-1)) {
            return false;
          }
          var3 = new ck(this.field_B);
          if (param0 >= -104) {
            return false;
          }
          var4 = (rc) (var3.a(-25119));
          while (var4 != null) {
            if (var4.b(true)) {
              var5 = new ck(this.field_B);
              var5.a(var4, 118);
              var6 = (rc) (var5.b(640));
              while (var6 != null) {
                if (var6.a(-1463, param1)) {
                  return true;
                }
                var6 = (rc) (var5.b(640));
              }
            }
            var4 = (rc) (var3.b(640));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_22_0 = var3_ref;
          stackIn_22_1 = new StringBuilder().append("ki.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        this.c(true);
    }

    rc d(byte param0) {
        ck var2;
        rc var3;
        int var4;
        var4 = SolKnight.field_L ? 1 : 0;
        if (param0 != -48) {
          this.field_B = (nc) null;
        }
        var2 = new ck(this.field_B);
        var3 = (rc) (var2.a((byte) -119));
        while (var3 != null) {
          if (var3.b(true)) {
            return var3;
          }
          var3 = (rc) (var2.c(121));
        }
        return null;
    }

    static {
        field_A = "members-only content";
    }
}
