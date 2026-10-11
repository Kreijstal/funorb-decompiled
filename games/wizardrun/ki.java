/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki extends pe implements qd {
    static int field_M;
    private pl field_H;
    private pl field_J;
    static wd field_F;
    static int field_I;
    static ui field_E;
    static String field_L;
    private pl field_K;
    static char[] field_G;

    final boolean a(char param0, int param1, byte param2, ub param3) {
        RuntimeException var5 = null;
        boolean stackIn_9_0 = false;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, (byte) -105, param3)) {
            return true;
          }
          if (param2 >= -96) {
            this.field_J = (pl) null;
          }
          if (param1 == 98) {
            stackIn_9_0 = this.a((byte) -117, param3);
            return stackIn_9_0;
          }
          if (99 != param1) {
            return false;
          }
          stackIn_13_0 = this.b(param3, 1);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("ki.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public ki() {
        super(0, 0, 476, 225, (bf) null);
        this.field_K = new pl(qk.field_h, (ce) null);
        this.field_H = new pl(v.field_c, (ce) null);
        this.field_J = new pl(th.field_b, (ce) null);
        jl var1 = new jl();
        this.field_K.field_w = (bf) ((Object) var1);
        this.field_H.field_w = (bf) ((Object) var1);
        this.field_J.field_w = (bf) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> 1;
        this.field_H.a(120, -48 + (this.field_n - var2), 30, var4, this.field_r - var3 >> 1);
        this.field_J.a(117, -48 + this.field_n - var2, 30, var4, (-var3 + this.field_r >> 1) - (-var4 - var2));
        this.field_K.a(120, this.field_n - (78 + 2 * var2), 30, var3, -var3 + this.field_r >> 1);
        this.field_H.field_s = (ce) (this);
        this.field_K.field_s = (ce) (this);
        this.field_J.field_s = (ce) (this);
        this.field_K.field_p = hb.field_i;
        this.field_J.field_p = hf.field_a;
        this.a((ub) (this.field_H), (byte) 101);
        this.a((ub) (this.field_K), (byte) 47);
        this.a((ub) (this.field_J), (byte) 46);
    }

    public static void g(byte param0) {
        field_E = null;
        int var1 = 31 % ((param0 + 23) / 41);
        field_G = null;
        field_F = null;
        field_L = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = this.field_o + param0;
        int var6 = this.field_l + param3;
        gh.field_b.a(ci.field_c, var5 + 20, 20 + var6, this.field_r - 40, this.field_n - 50, 16777215, -1, 1, 0, gh.field_b.field_M);
        super.a(param0, param1, param2, param3);
    }

    final static void h(byte param0) {
        wi.field_J = false;
        cf.field_i = false;
        jc.a((byte) 79, -1);
        fi.field_y = ej.field_b;
        if (param0 > 64) {
          wc.field_j = ej.field_b;
          return;
        }
        ki.g((byte) -56);
        wc.field_j = ej.field_b;
    }

    public final void a(int param0, pl param1, int param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = wizardrun.field_H;
        try {
          if (this.field_H == param1) {
            pc.a(-1);
          } else {
            if (param1 == this.field_K) {
              w.b(-1);
            } else {
              if (param1 == this.field_J) {
                jf.a(55);
              }
            }
          }
          if (param0 == -18905) {
            return;
          }
          ki.g((byte) 6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("ki.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_L = "This game has been updated! Please reload this page.";
        field_G = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}
