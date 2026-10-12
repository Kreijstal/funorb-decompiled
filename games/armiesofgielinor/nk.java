/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk {
    int field_f;
    static String field_t;
    int[][] field_r;
    byte[] field_v;
    byte[] field_n;
    byte[][] field_c;
    int[] field_B;
    byte[] field_e;
    int field_I;
    boolean[] field_l;
    byte[] field_d;
    int[] field_y;
    static byte[] field_C;
    int field_i;
    int field_j;
    static int field_m;
    byte[] field_o;
    int field_b;
    int field_q;
    int field_L;
    int[] field_u;
    int field_g;
    int field_z;
    int field_E;
    int field_a;
    int[] field_h;
    byte field_K;
    int field_x;
    byte[] field_s;
    int[][] field_k;
    int[][] field_H;
    int field_w;
    int field_J;
    int field_F;
    boolean[] field_p;

    public static void b(byte param0) {
        field_t = null;
        if (param0 != 75) {
          return;
        }
        field_C = null;
    }

    final static void a(byte param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var3 = 0;
        int var4 = 0;
        int var1_intLifetime1;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          cq.field_u = new int[vs.field_e.length];
          for (var1_int = 0; var1_int < vs.field_e.length; var1_int++) {
            cq.field_u[var1_int] = va.field_G[vs.field_e[var1_int].terrainType];
          }
          if (param0 <= 79) {
            nk.a((byte) 84);
          }
          for (var1_intLifetime1 = 0; var1_intLifetime1 < ef.field_c; var1_intLifetime1++) {
            for (var2 = 0; ks.field_y > var2; var2++) {
              var3 = cq.field_u[var1_intLifetime1 * ks.field_y + var2];
              if (1 == var3) {
                var3 = 7;
                if (ta.field_L) {
                  var3 = 4;
                }
                if (0 == var2 ||
                  cq.field_u[-1 + (var2 + var1_intLifetime1 * ks.field_y)] == 1) {
                  var3 = 1;
                }
                if (-1 + ks.field_y == var2 ||
                  1 == cq.field_u[1 + var2 + var1_intLifetime1 * ks.field_y]) {
                  var3 = 1;
                }
                if (var1_intLifetime1 == 0 ||
                  cq.field_u[var2 + ks.field_y * (var1_intLifetime1 - 1)] == 1) {
                  var3 = 1;
                }
                if (-1 + ef.field_c == var1_intLifetime1 ||
                  cq.field_u[(var1_intLifetime1 + 1) * ks.field_y + var2] == 1) {
                  var3 = 1;
                }
                cq.field_u[var1_intLifetime1 * ks.field_y + var2] = var3;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.addExceptionContext((Throwable) ((Object) var1), "nk.C(" + param0 + ')');
        }
    }

    final static String a(boolean param0, CharSequence param1, byte param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_6_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var3 = SummonAction.a(-127, param1, param0);
          if (param2 > -34) {
            nk.b((byte) -25);
          }
          if (var3 != null) {
            stackIn_6_0 = var3;
            return stackIn_6_0;
          }
          var4 = 0;
          while (true) {
            if (var4 >= param1.length()) {
              return null;
            }
            if (wg.a(param1.charAt(var4), -3904)) {
              var4++;
              continue;
            }
            break;
          }
          stackIn_12_0 = od.field_h;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("nk.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    final static RgbSprite[] a(int param0, byte param1, int param2, kl param3) {
        RuntimeException var4 = null;
        RgbSprite[] stackIn_5_0 = null;
        RgbSprite[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!kp.a(false, param0, param3, param2)) {
            return null;
          }
          if (param1 == 28) {
            stackIn_7_0 = se.a((byte) 32);
            return stackIn_7_0;
          }
          stackIn_5_0 = (RgbSprite[]) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("nk.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    nk() {
        this.field_l = new boolean[16];
        this.field_c = new byte[6][258];
        this.field_o = new byte[4096];
        this.field_y = new int[6];
        this.field_u = new int[256];
        this.field_i = 0;
        this.field_n = new byte[256];
        this.field_H = new int[6][258];
        this.field_d = new byte[18002];
        this.field_s = new byte[18002];
        this.field_r = new int[6][258];
        this.field_B = new int[257];
        this.field_h = new int[16];
        this.field_q = 0;
        this.field_k = new int[6][258];
        this.field_p = new boolean[256];
    }

    static {
        field_t = "TAB - hide chat temporarily";
    }
}
