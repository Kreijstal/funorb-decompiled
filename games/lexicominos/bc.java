/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bc extends kf {
    private String[] field_G;
    private wl field_I;
    static String field_J;
    static String[] field_E;
    private ng field_K;
    static fi field_H;
    static String[] field_L;
    static dg field_F;

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int var5 = -this.field_t + param3;
        int var6 = param1 - this.field_o;
        wl var7 = this.a(var6, false, var5);
        if (var7 == null) {
          return;
        }
        if (this.field_r == null) {
          return;
        }
        ((ue) ((Object) this.field_r)).a(123, this, var7.field_o, param2);
    }

    final void f(boolean param0) {
        wl discarded$0 = null;
        int var11 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int var2;
        ub var3;
        ve var4;
        int var5;
        String var6;
        int var7;
        int var8;
        int var9;
        Object var10;
        rj var12;
        int var13;
        int var14;
        wl var15;
        int var16;
        int var7Lifetime1;
        var16 = Lexicominos.field_L ? 1 : 0;
        this.field_K = new ng();
        var2 = 0;
        var3 = (ub) ((Object) this.field_i);
        var4 = var3.a((w) (this), (byte) -111);
        while (true) {
          var5 = this.field_u.indexOf("<hotspot=", var2);
          if (var5 == -1) {
            if (param0) {
              return;
            }
            discarded$0 = this.a(68, true, 35);
            return;
          }
          var7 = this.field_u.indexOf(">", var5);
          var6 = this.field_u.substring(9 + var5, var7);
          var7Lifetime1 = Integer.parseInt(var6);
          var2 = this.field_u.indexOf("</hotspot>", var5);
          var8 = var4.a(28276, var5);
          var9 = var4.a(28276, var2);
          var10 = null;
          for (var11 = var8; var9 >= var11; var11++) {
            var12 = var4.field_c[var11];
            if (~var11 != ~var8) {
              stackIn_8_0 = var12.field_a[0];
            } else {
              stackIn_8_0 = var4.a((byte) -113, var5);
            }
            var13 = stackIn_8_0;
            if (var11 != var9) {
              if (var12 == null) {
                stackIn_13_0 = 0;
              } else {
                stackIn_13_0 = var12.field_a[var12.field_a.length - 1];
              }
            } else {
              stackIn_13_0 = var4.a((byte) -127, var2);
            }
            var14 = stackIn_13_0;
            var15 = new wl(var7Lifetime1, var13, var12.field_d, -var13 + var14, Math.max(var3.a(2), var12.field_c - var12.field_d));
            if (var10 != null) {
              ((wl) (var10)).field_p = var15;
            }
            this.field_K.b(114, var15);
            var10 = var15;
          }
        }
    }

    void a(byte param0, w param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        try {
          super.a(param0, param1, param2, param3);
          this.field_I = null;
          if (this.field_m) {
            var5_int = -this.field_t - param3 + bk.field_b;
            var6 = -this.field_o + sh.field_e - param2;
            this.field_I = this.a(var6, false, var5_int);
          }
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "bc.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(String param0, int param1, int param2) {
        wl discarded$0 = null;
        String[] var7 = null;
        String[] var8 = null;
        int var5 = 0;
        int var6 = Lexicominos.field_L ? 1 : 0;
        try {
          if (param2 != -27371) {
            discarded$0 = this.a(-40, false, -28);
          }
          if (this.field_G == null ||
            param1 >= this.field_G.length) {
            var7 = new String[1 + param1];
            var8 = var7;
            String[] var4 = var8;
            if (null != this.field_G) {
              for (var5 = 0; this.field_G.length > var5; var5++) {
                var7[var5] = this.field_G[var5];
              }
            }
            this.field_G = var8;
          }
          this.field_G[param1] = param0;
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "bc.S(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final wl a(int param0, boolean param1, int param2) {
        wl var4;
        wl var5;
        int var6;
        var6 = Lexicominos.field_L ? 1 : 0;
        var4 = (wl) (this.field_K.a(true));
        if (param1) {
          return (wl) null;
        }
        while (var4 != null) {
          var5 = var4;
          while (var5 != null) {
            if (var5.field_j <= param2 &&
              var5.field_k <= param0 &&
              var5.field_l + var5.field_j > param2 &&
              var5.field_k + var5.field_h >= param0) {
              return var4;
            }
            var5 = var5.field_p;
          }
          var4 = (wl) (this.field_K.f(2));
        }
        return null;
    }

    public static void e(boolean param0) {
        field_L = null;
        if (!param0) {
          field_H = null;
          field_E = null;
          field_J = null;
          field_F = null;
          return;
        }
        bc.e(true);
        field_H = null;
        field_E = null;
        field_J = null;
        field_F = null;
    }

    String b(int param0) {
        if (null == this.field_I) {
          return null;
        }
        if (this.field_G == null) {
          return null;
        }
        if (param0 < 121) {
          return (String) null;
        }
        if (this.field_G.length > this.field_I.field_o) {
          return this.field_G[this.field_I.field_o];
        }
        return null;
    }

    final static boolean a(boolean param0, CharSequence param1) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        boolean stackIn_5_1 = false;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            bc.e(true);
          }
          stackIn_4_0 = 10;
          stackIn_5_1 = !(param0);
          stackIn_6_0 = rk.a(stackIn_4_0, stackIn_5_1, param1, true);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("bc.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    boolean a(byte param0, w param1) {
        RuntimeException var3 = null;
        CharSequence var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 44) {
            return false;
          }
          var4 = (CharSequence) null;
          bc.a(false, (CharSequence) null);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("bc.LA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (param2 == -2) {
          this.a(((ub) ((Object) this.field_i)).a(-13293, (w) (this)), param3, true, param1, param0);
          return;
        }
        this.b(35);
        this.a(((ub) ((Object) this.field_i)).a(-13293, (w) (this)), param3, true, param1, param0);
    }

    void a(byte param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (param3 != 0) {
          return;
        }
        ub var9 = (ub) ((Object) this.field_i);
        wl var6 = this.field_I;
        if (var6 != null) {
          var7 = var9.b((w) (this), 102, param2);
          var8 = var9.a((w) (this), 20340, param1);
          do {
            pk.a(var6.field_h + 2, -2 + (var8 + var6.field_k), var7 + var6.field_j - 2, param0 ^ -116, var6.field_l + 2);
            var6 = var6.field_p;
          } while (var6 != null);
          return;
        }
    }

    bc(String param0, rd param1) {
        super(param0, (vd) null);
        this.field_I = null;
        try {
          this.field_i = param1;
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "bc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4) {
        super.a(param0, param1, true, param3, param4);
        this.f(param2);
    }

    static {
        field_J = "More suggestions";
        field_E = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_H = new fi(1);
        field_L = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_F = new dg();
    }
}
