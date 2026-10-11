/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se extends g implements oi {
    private ig field_D;
    private ig field_I;
    static String[] field_E;
    static int[] field_B;
    static int[] field_C;
    private ig field_F;
    static int field_H;

    final static String a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            field_B = (int[]) null;
          }
          stackIn_3_0 = kk.a(param1.length, (byte) -75, 0, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("se.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public se() {
        super(0, 0, 476, 225, (uk) null);
        this.field_D = new ig(gk.field_g, (lf) null);
        this.field_F = new ig(bc.field_h, (lf) null);
        this.field_I = new ig(o.field_c, (lf) null);
        b var1 = new b();
        this.field_D.field_u = (uk) ((Object) var1);
        this.field_F.field_u = (uk) ((Object) var1);
        this.field_I.field_u = (uk) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> 1;
        this.field_F.b(var4, -var3 + this.field_p >> 1, -var2 + this.field_t - 48, 30, 23987);
        this.field_I.b(var4, var4 + ((this.field_p - var3 >> 1) + var2), -48 + (this.field_t - var2), 30, 23987);
        this.field_D.b(var3, this.field_p - var3 >> 1, -(var2 * 2) - 78 + this.field_t, 30, 23987);
        this.field_F.field_v = (lf) (this);
        this.field_D.field_v = (lf) (this);
        this.field_I.field_v = (lf) (this);
        this.field_D.field_x = hi.field_c;
        this.field_I.field_x = ua.field_f;
        this.b(4, this.field_F);
        this.b(4, this.field_D);
        this.b(4, this.field_I);
    }

    public static void e(byte param0) {
        field_C = null;
        if (param0 != 9) {
          se.e((byte) -6);
          field_E = null;
          field_B = null;
          return;
        }
        field_E = null;
        field_B = null;
    }

    final static void a(int param0, int param1) {
        gg var2 = null;
        int var3 = 0;
        kl var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = stellarshard.field_B;
        try {
          if (param1 >= -67) {
            field_E = (String[]) null;
          }
          var4 = (kl) (nl.field_e.b(-103));
          while (var4 != null) {
            ca.a(param0, var4, (byte) 93);
            var4 = (kl) (nl.field_e.b((byte) 117));
          }
          var2 = pl.field_W.b(-79);
          while (var2 != null) {
            bf.a(param0, (byte) -106);
            var2 = pl.field_W.b((byte) -124);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2_ref), "se.A(" + param0 + ',' + param1 + ')');
        }
    }

    public final void a(int param0, int param1, ig param2, boolean param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = stellarshard.field_B;
        try {
          if (param3) {
            this.field_I = (ig) null;
          }
          if (param2 == this.field_F) {
            ll.c(32270);
            return;
          }
          if (param2 == this.field_D) {
            ta.a((byte) 91);
            return;
          }
          if (this.field_I != param2) {
            return;
          }
          qh.a(!param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("se.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, char param2, rj param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_6_0 = this.a(param3, param0 - 38323);
            return stackIn_6_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_10_0 = this.a(param3, (byte) -118);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("se.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = param3 + this.field_w;
        int var6 = param2 + this.field_k;
        si.field_V.a(e.field_b, 20 + var5, 20 + var6, -40 + this.field_p, this.field_t - 50, 16777215, -1, 1, 0, si.field_V.field_N);
        super.a(param0, param1, param2, param3);
    }

    static {
        field_E = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_C = new int[8192];
        field_H = 0;
    }
}
