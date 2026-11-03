/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TriangleMesh {
    static boolean field_m;
    int field_w;
    static UiLayoutNode field_R;
    short[] field_z;
    byte field_u;
    short[] field_l;
    short[] field_o;
    short[] field_E;
    int[] field_d;
    short[] field_I;
    static UiLayoutNode field_j;
    int field_t;
    short[] field_p;
    int[] field_a;
    short[] field_v;
    short field_b;
    short[] field_N;
    int[] field_O;
    int field_s;
    int field_x;
    int field_y;
    int[] field_D;
    int field_h;
    short[] field_n;
    static int[] field_B;
    short[] field_F;
    short[] field_i;
    short field_g;
    short[] field_U;
    short[] field_f;
    byte[] field_G;
    int[] field_C;
    int[] field_H;
    int[] field_S;
    private boolean field_q;
    private static long[] field_c;
    short[] field_K;
    short[] field_M;
    int[] field_J;
    short[] field_T;
    static String field_L;
    short[] field_r;
    static IndexedSprite[] field_Q;
    int[] field_e;
    short field_k;
    short[] field_P;
    static String field_A;

    final static void a(byte param0, boolean param1, boolean param2, String param3) {
        try {
          ou.a(param0 + 101);
          wd.field_l.k(param0 + 225);
          if (param0 != -101) {
            field_R = (UiLayoutNode) null;
          }
          IsSixCommand.field_E = new LoginForm(ep.field_b, (String) null, AuctionBidDialog.field_G, param2, param1);
          we.field_a = new vo(wd.field_l, IsSixCommand.field_E);
          wd.field_l.a(we.field_a, false);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "kk.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void computeBounds(boolean param0) {
        int var8 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var9;
        int var10;
        int var11;
        int var12;
        var12 = Kickabout.field_G;
        if (this.field_q) {
          return;
        }
        this.field_q = true;
        var2 = 32767;
        var3 = 32767;
        var4 = 32767;
        if (param0) {
          this.computeBounds(true);
        }
        var5 = -32768;
        var6 = -32768;
        var7 = -32768;
        for (var8 = 0; this.field_b > var8; var8++) {
          var9 = this.field_f[var8];
          var10 = this.field_r[var8];
          if (var10 > var6) {
            var6 = var10;
          }
          if (var9 < var2) {
            var2 = var9;
          }
          var11 = this.field_P[var8];
          if (var9 > var5) {
            var5 = var9;
          }
          if (var10 < var3) {
            var3 = var10;
          }
          if (var11 > var7) {
            var7 = var11;
          }
          if (var11 < var4) {
            var4 = var11;
          }
        }
        this.field_s = var3;
        this.field_w = var7;
        this.field_t = var4;
        this.field_h = var5;
        this.field_y = var2;
        this.field_x = var6;
    }

    final void scale(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = Kickabout.field_G;
        for (var6 = 0; this.field_b > var6; var6++) {
          this.field_f[var6] = (short)(param1 * this.field_f[var6] / param3);
          this.field_r[var6] = (short)(this.field_r[var6] * param0 / param3);
          this.field_P[var6] = (short)(this.field_P[var6] * param4 / param3);
        }
        if (param2 != 256) {
          this.field_y = -57;
        }
        this.a(param2 - 311);
    }

    final void translate(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = Kickabout.field_G;
        for (var5 = param2; this.field_b > var5; var5++) {
          this.field_f[var5] = (short)(this.field_f[var5] + param1);
          this.field_r[var5] = (short)(this.field_r[var5] + param3);
          this.field_P[var5] = (short)(this.field_P[var5] + param0);
        }
        this.a(param2 - 68);
    }

    public static void a(byte param0) {
        field_c = null;
        field_R = null;
        if (param0 < 66) {
          TriangleMesh.a((byte) -61);
        }
        field_L = null;
        field_A = null;
        field_B = null;
        field_Q = null;
        field_j = null;
    }

    private final void a(int param0) {
        int var2 = -26 / ((58 - param0) / 62);
        this.field_q = false;
    }

    final static boolean a(int param0, IntrusiveDeque param1) {
        IntrusiveNode var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        IntrusiveDeque var4 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Kickabout.field_G;
        try {
          var2 = param1.g(24009);
          if (param0 != -27054) {
            var4 = (IntrusiveDeque) null;
            TriangleMesh.a(-43, (IntrusiveDeque) null);
          }
          while (var2 instanceof ak) {
            if (var2.field_d instanceof ak) {
              if (((ak) (var2)).a((byte) 126) <= ((ak) (var2.field_d)).a((byte) 112)) {
                var2 = var2.field_d;
                continue;
              }
              return false;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_13_0 = var2_ref;
          stackIn_13_1 = new StringBuilder().append("kk.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static ArgbSprite a(PlayerStats param0, int param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        ClubState var6 = null;
        ArgbSprite stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -1;
          var4 = 0;
          var5 = param1;
          if (!param0.field_c) {
            var6 = GameLoopApplet.field_E;
            var3_int = var6.field_w;
            var5 = var6.field_R;
            var4 = var6.field_k;
          }
          stackIn_4_0 = kj.a(var3_int, 0, param0, var5, var4, param2);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("kk.G(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static CoverageBitmapFont a(int param0, ResourceArchive param1, int param2, int param3, ResourceArchive param4) {
        RuntimeException var5 = null;
        Object stackIn_4_0 = null;
        CoverageBitmapFont stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 >= -43) {
            field_B = (int[]) null;
          }
          if (cu.a(param3, param1, param0, 112)) {
            stackIn_6_0 = nv.a(-109, param4.b(param0, -32669, param3));
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (CoverageBitmapFont) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("kk.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    TriangleMesh() {
        this.field_u = (byte) 0;
        this.field_q = false;
    }

    static {
        int var2 = 0;
        int var3 = 0;
        long var0;
        field_m = false;
        field_B = new int[2];
        field_c = new long[256];
        field_L = "Creating your account";
        field_A = "Choose whether to play home or away, then click the Ready button.";
        for (var2 = 0; var2 < 256; var2++) {
          var0 = (long)var2;
          for (var3 = 0; var3 < 8; var3++) {
            if (1L != (var0 & 1L)) {
              var0 = var0 >>> 1;
            } else {
              var0 = -3932672073523589310L ^ var0 >>> 1;
            }
          }
          field_c[var2] = var0;
        }
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$842e35442ba4(int param0, boolean param1, boolean param2, String param3) {
        try {
          ou.a(param0 + 101);
          wd.field_l.k(param0 + 225);
          if (param0 != -101) {
            field_R = (UiLayoutNode) null;
          }
          IsSixCommand.field_E = new LoginForm(ep.field_b, (String) null, AuctionBidDialog.field_G, param2, param1);
          we.field_a = new vo(wd.field_l, IsSixCommand.field_E);
          wd.field_l.a(we.field_a, false);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "kk.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }
}
