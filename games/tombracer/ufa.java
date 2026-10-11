/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ufa {
    boolean field_a;
    static int[] field_e;
    int field_h;
    static int[] field_d;
    int field_g;
    private static int[] field_p;
    private static int[] field_f;
    static String field_u;
    boolean field_l;
    private vna field_i;
    private BitSet field_s;
    int field_k;
    static int[] field_t;
    private static int[] field_b;
    int[] field_n;
    private static int[] field_j;
    BitSet field_o;
    private BitSet field_m;
    static int field_c;
    static String[] field_q;
    static nh[] field_r;

    final static void a(boolean param0) {
        if (!param0) {
          ufa.b(-1);
        }
        vc.field_n.setLength(0);
        bta.field_q = 0;
    }

    public final String toString() {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        String var1 = "Profile - ";
        var1 = var1 + "RoomsComplete[" + this.field_o + "]";
        var1 = var1 + "CharUnlocked[" + this.field_s.toString() + "]";
        var1 = var1 + "CourUnlocked[" + this.field_m.toString() + "]";
        var1 = var1 + "WorldMedals[";
        for (var2 = 0; this.field_n.length > var2; var2++) {
          var1 = var1 + this.field_n[var2] + " ,";
        }
        var1 = var1 + "]";
        return var1;
    }

    public static void b(int param0) {
        field_f = null;
        field_e = null;
        field_p = null;
        int var1 = 76 / ((-14 - param0) / 48);
        field_u = null;
        field_t = null;
        field_d = null;
        field_b = null;
        field_r = null;
        field_j = null;
        field_q = null;
    }

    final boolean a(byte param0, int param1) {
        if (param0 >= -22) {
          return true;
        }
        return this.field_m.get(param1);
    }

    final void a(kh param0, byte param1) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          var3_int = param0.h(255);
          if (var3_int < 16) {
            return;
          }
          param0.h((byte) -11);
          this.field_l = uha.a(5907, param0);
          var4 = param0.b((byte) 44, 8);
          for (var5 = 0; var4 > var5; var5++) {
            if (uha.a(5907, param0)) {
              this.field_o.set(var5);
            }
          }
          var6 = -25 % ((69 - param1) / 53);
          for (var5Lifetime1 = 0; var5Lifetime1 < 13; var5Lifetime1++) {
            if (uha.a(5907, param0)) {
              this.field_s.set(var5Lifetime1);
            }
          }
          for (var5Lifetime2 = 0; var5Lifetime2 < 9; var5Lifetime2++) {
            if (uha.a(5907, param0)) {
              this.field_m.set(var5Lifetime2);
            }
          }
          for (var5Lifetime3 = 0; this.field_n.length > var5Lifetime3; var5Lifetime3++) {
            this.field_n[var5Lifetime3] = param0.b((byte) 44, 2);
          }
          this.field_g = param0.b((byte) 44, 4);
          this.field_h = param0.b((byte) 44, 8);
          this.field_k = param0.b((byte) 44, 8);
          param0.i((byte) 98);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("ufa.C(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean b(byte param0, int param1) {
        if (param0 != 4) {
          this.field_l = false;
        }
        return this.field_s.get(param1);
    }

    final taa c(int param0) {
        if (param0 < 29) {
          ufa.b(90);
        }
        return (taa) (this.field_i.c(59));
    }

    final int a(int param0) {
        int var2 = -45 / ((-54 - param0) / 34);
        return this.field_i.a((byte) -16);
    }

    final static void a(int param0, int param1) {
        if (null == pqa.field_m ||
          param1 > pqa.field_m.length) {
          pqa.field_m = new int[param1];
        }
        if (param0 >= -29) {
          field_b = (int[]) null;
        }
    }

    final void a(int param0, kh param1) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          param1.i(16, 0);
          param1.i(8);
          wfa.a(this.field_l, 126, param1);
          var3_int = -1 + this.field_o.size();
          param1.a((byte) -4, var3_int, 8);
          for (var4 = 0; var4 < var3_int; var4++) {
            wfa.a(this.field_o.get(var4), -52, param1);
          }
          for (var4Lifetime1 = 0; var4Lifetime1 < 13; var4Lifetime1++) {
            wfa.a(this.field_s.get(var4Lifetime1), param0 + 2016803960, param1);
          }
          for (var4Lifetime2 = 0; var4Lifetime2 < 9; var4Lifetime2++) {
            wfa.a(this.field_m.get(var4Lifetime2), param0 ^ -2016803978, param1);
          }
          if (param0 != -2016804080) {
            field_e = (int[]) null;
          }
          for (var4Lifetime3 = 0; this.field_n.length > var4Lifetime3; var4Lifetime3++) {
            param1.a((byte) -125, this.field_n[var4Lifetime3], 2);
          }
          param1.a((byte) 93, this.field_g, 4);
          param1.a((byte) -128, this.field_h, 8);
          param1.a((byte) -26, this.field_k, 8);
          param1.k(-1826190686);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("ufa.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    public ufa() {
        this.field_l = false;
        this.field_a = false;
        this.field_o = new BitSet(255);
        this.field_i = new vna();
        this.field_n = new int[9];
        this.field_s = new BitSet(13);
        this.field_m = new BitSet(9);
        this.field_s.set(0);
        this.field_s.set(6);
        this.field_m.set(0);
        this.field_g = 0;
        this.field_h = 255;
        this.field_k = 255;
    }

    final void a(int param0, taa param1) {
        try {
          if (param0 != 8) {
            ufa.a(true);
          }
          this.field_i.b((byte) -48, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ufa.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int var0;
        int var0Lifetime1;
        int var0Lifetime2;
        int var0Lifetime3;
        int var0Lifetime4;
        int var0Lifetime5;
        int var0Lifetime6;
        field_u = "Won";
        field_p = new int[256];
        for (var0 = 0; 256 > var0; var0++) {
          field_p[var0] = fh.a(var0 >> 3, fh.a(var0 << 16, sea.c(1342178300, var0) << 6));
        }
        field_b = new int[256];
        for (var0Lifetime1 = 0; var0Lifetime1 < 256; var0Lifetime1++) {
          field_b[var0Lifetime1] = fh.a(fh.a(sea.c(65308, var0Lifetime1 << 6), sea.c(var0Lifetime1, 762841080) << 13), var0Lifetime1);
        }
        field_j = new int[256];
        for (var0Lifetime2 = 0; var0Lifetime2 < 256; var0Lifetime2++) {
          field_j[var0Lifetime2] = fh.a(fh.a(sea.c(65306, var0Lifetime2 << 7), sea.c(-861666308, var0Lifetime2) << 14), var0Lifetime2);
        }
        field_f = new int[256];
        for (var0Lifetime3 = 0; var0Lifetime3 < 256; var0Lifetime3++) {
          field_f[var0Lifetime3] = fh.a(var0Lifetime3 >> 5, fh.a(var0Lifetime3 << 16, sea.c(-1207958532, var0Lifetime3) << 6));
        }
        field_d = new int[256];
        for (var0Lifetime4 = 0; 256 > var0Lifetime4; var0Lifetime4++) {
          field_d[var0Lifetime4] = fh.a(var0Lifetime4, fh.a(var0Lifetime4 << 16, sea.c(var0Lifetime4, 1795162367) << 8));
        }
        field_e = new int[8];
        for (var0Lifetime5 = 0; var0Lifetime5 < 8; var0Lifetime5++) {
          field_e[var0Lifetime5] = fh.a(var0Lifetime5, fh.a(var0Lifetime5 << 21, sea.c(var0Lifetime5, -480247777) << 11));
        }
        field_t = new int[8];
        for (var0Lifetime6 = 0; 8 > var0Lifetime6; var0Lifetime6++) {
          field_t[var0Lifetime6] = fh.a(var0Lifetime6, fh.a(var0Lifetime6 << 16, sea.c(-127926241, var0Lifetime6) << 11));
        }
        field_q = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_c = -1;
    }
}
