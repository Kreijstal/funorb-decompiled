/*
 * Decompiled by CFR-JS 0.4.0.
 */
class pn extends d {
    private nj field_P;
    static String[] field_Q;
    private pk field_I;
    static int field_R;
    static int[] field_K;
    static int field_L;
    static int field_O;
    private String[] field_M;
    static cr field_N;
    static String field_H;

    void a(boolean param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (param1 != 0) {
          return;
        }
        qa var5 = (qa) ((Object) this.field_B);
        pk var6 = this.field_I;
        if (var6 != null) {
          var7 = var5.b((iq) (this), param2, -14323);
          var8 = var5.a((iq) (this), 1, param3);
          do {
            mr.a(var6.field_t + 2, -2 + var6.field_p + var8, var6.field_q + 2, 0, var7 + var6.field_s - 2);
            var6 = var6.field_n;
          } while (var6 != null);
        }
    }

    boolean a(byte param0, iq param1) {
        RuntimeException var3 = null;
        qn var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 116) {
            var4 = (qn) null;
            pn.a(-65, (byte) 81, (qn) null);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("pn.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void b(int param0, int param1, byte param2, int param3) {
        this.a(false, param0, param1, ((qa) ((Object) this.field_B)).a((iq) (this), param2 - 120), param3);
        if (param2 != 119) {
          field_O = -24;
        }
    }

    pn(String param0, ur param1) {
        super(param0, (uf) null);
        this.field_I = null;
        try {
          this.field_B = param1;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "pn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    void a(byte param0, int param1, int param2, iq param3) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.a((byte) 115, param1, param2, param3);
          this.field_I = null;
          if (param0 <= 6) {
            return;
          }
          if (this.field_p) {
            var5_int = -param1 + (ed.field_n - this.field_o);
            var6 = gb.field_d - (param2 + this.field_t);
            this.field_I = this.b(var6, var5_int, 498);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("pn.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, String param2) {
        int var5 = 0;
        String[] var4 = null;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          if (this.field_M == null ||
            this.field_M.length <= param0) {
            var7 = new String[param0 + 1];
            var8 = var7;
            var4 = var8;
            if (this.field_M != null) {
              for (var5 = 0; var5 < this.field_M.length; var5++) {
                var7[var5] = this.field_M[var5];
              }
            }
            this.field_M = var8;
          }
          this.field_M[param0] = param2;
          if (param1 != 0) {
            field_L = -80;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_14_0 = var4_ref;
          stackIn_14_1 = new StringBuilder().append("pn.T(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    String a(boolean param0) {
        if (param0) {
          field_O = -114;
        }
        if (this.field_I == null) {
          return null;
        }
        if (null == this.field_M) {
          return null;
        }
        if (this.field_I.field_u >= this.field_M.length) {
          return null;
        }
        return this.field_M[this.field_I.field_u];
    }

    final void e(byte param0) {
        int var11 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int var2;
        qa var3;
        ro var4;
        int var5;
        String var6;
        int var7;
        int var8;
        int var9;
        Object var10;
        lq var12;
        int var13;
        int var14;
        pk var15;
        int var16;
        String var17;
        int var7Lifetime1;
        var16 = Vertigo2.field_L ? 1 : 0;
        this.field_P = new nj();
        var2 = 0;
        var3 = (qa) ((Object) this.field_B);
        if (param0 > -90) {
          var17 = (String) null;
          this.a(54, -39, (String) null);
        }
        var4 = var3.b((iq) (this), 46);
        while (true) {
          var5 = this.field_w.indexOf("<hotspot=", var2);
          if (-1 == var5) {
            return;
          }
          var7 = this.field_w.indexOf(">", var5);
          var6 = this.field_w.substring(9 + var5, var7);
          var7Lifetime1 = Integer.parseInt(var6);
          var2 = this.field_w.indexOf("</hotspot>", var5);
          var8 = var4.a(var5, 22413);
          var9 = var4.a(var2, 22413);
          var10 = null;
          for (var11 = var8; var9 >= var11; var11++) {
            var12 = var4.field_c[var11];
            if (var8 != var11) {
              stackIn_10_0 = var12.field_c[0];
            } else {
              stackIn_10_0 = var4.b(var5, 127);
            }
            var13 = stackIn_10_0;
            if (var9 == var11) {
              stackIn_15_0 = var4.b(var2, -90);
            } else {
              if (var12 == null) {
                stackIn_15_0 = 0;
              } else {
                stackIn_15_0 = var12.field_c[-1 + var12.field_c.length];
              }
            }
            var14 = stackIn_15_0;
            var15 = new pk(var7Lifetime1, var13, var12.field_f, var14 - var13, Math.max(var3.a((byte) -91), -var12.field_f + var12.field_d));
            if (var10 != null) {
              ((pk) (var10)).field_n = var15;
            }
            this.field_P.a(var15, false);
            var10 = var15;
          }
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        pk discarded$0 = null;
        super.a(param0, param1, param2, param3, param4);
        if (param0) {
          discarded$0 = this.b(22, 68, 111);
        }
        this.e((byte) -127);
    }

    final static void a(int param0, byte param1, qn param2) {
        mi var3 = null;
        try {
          var3 = uh.field_Wb;
          var3.j(param0, 125);
          int var4 = -75 % ((param1 + 70) / 44);
          var3.f(param2.field_n, 125);
          var3.d(param2.field_x, -1783);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "pn.BA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_H = null;
        field_K = null;
        if (param0 != -53) {
          ei var2 = (ei) null;
          pn.a((byte) 22, (ei) null);
        }
        field_Q = null;
        field_N = null;
    }

    private final pk b(int param0, int param1, int param2) {
        pk var4;
        pk var5;
        int var6;
        var6 = Vertigo2.field_L ? 1 : 0;
        if (param2 != 498) {
          field_K = (int[]) null;
        }
        var4 = (pk) (this.field_P.a((byte) 100));
        while (var4 != null) {
          var5 = var4;
          while (var5 != null) {
            if (param1 >= var5.field_s &&
              var5.field_p <= param0 &&
              var5.field_s + var5.field_t > param1 &&
              param0 <= var5.field_p + var5.field_q) {
              return var4;
            }
            var5 = var5.field_n;
          }
          var4 = (pk) (this.field_P.b(param2 - 439));
        }
        return null;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        super.a(param0, param1, (byte) 127, param3);
        if (param2 < 111) {
          iq var8 = (iq) null;
          this.a((byte) -49, -96, 6, (iq) null);
        }
        int var5 = param0 - this.field_o;
        int var6 = param3 - this.field_t;
        pk var7 = this.b(var6, var5, 498);
        if (var7 != null &&
          null != this.field_v) {
          ((cm) ((Object) this.field_v)).a(this, var7.field_u, param1, (byte) 70);
        }
    }

    final static void a(byte param0, ei param1) {
        try {
          if (param0 <= 51) {
            field_H = (String) null;
          }
          jm.field_B = param1;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "pn.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_K = new int[]{303, 375, 440, 498, 560};
        field_Q = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_H = "Sound: ";
        field_O = 98;
    }
}
