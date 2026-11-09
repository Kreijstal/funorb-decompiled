/*
 * Decompiled by CFR-JS 0.4.0.
 */
class dq extends dp {
    private Sprite[] field_D;
    private Sprite field_G;
    static int[] field_s;
    private int field_cb;
    private boolean field_z;
    private int field_M;
    private boolean field_x;
    private int field_O;
    private int field_N;
    private LegacyBitmapFont field_C;
    private Sprite field_A;
    static SpriteData[] field_v;
    private boolean field_R;
    private int field_ab;
    private int field_E;
    private int field_S;
    private Sprite[] field_u;
    private int field_V;
    private int field_H;
    private Sprite field_W;
    private boolean field_J;
    static ResourceArchive field_Z;
    private int field_U;
    private int field_Q;
    private int field_bb;
    private int field_L;
    private Sprite field_db;
    private int field_fb;
    private int field_B;
    private int field_I;
    private Sprite[] field_eb;
    private String field_t;
    private Sprite[] field_T;
    private boolean field_Y;
    private int field_w;
    private int field_K;
    private boolean field_y;
    private Sprite[] field_X;
    private Sprite field_r;
    private String field_F;

    final static void a(byte param0, int param1) {
        int var3 = 0;
        pd var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param0 != 115) {
            dq.a((byte) 19, -85);
          }
          var4 = (pd) (PerlinNoiseSliceGenerator.field_g.first(-87));
          while (var4 != null) {
            k.a(var4, param1, (byte) 117);
            var4 = (pd) (PerlinNoiseSliceGenerator.field_g.next((byte) 18));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2), "dq.C(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(dq param0, byte param1) {
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_102_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != null) {
            if (0 != param0.field_w) {
              this.field_w = param0.field_w;
            }
            if (param0.field_cb != -2147483648) {
              this.field_cb = param0.field_cb;
            }
            if (param0.field_V != -2147483648) {
              this.field_V = param0.field_V;
            }
            if (param0.field_U != -2147483648) {
              this.field_U = param0.field_U;
            }
            if (param0.field_x) {
              this.field_x = param0.field_x;
            }
            if (param0.field_I != 0) {
              this.field_I = param0.field_I;
            }
            if (null != param0.field_G) {
              this.field_G = param0.field_G;
            }
            if (param0.field_Y) {
              this.field_Y = param0.field_Y;
            }
            if (param0.field_r != null) {
              this.field_r = param0.field_r;
            }
            if (param0.field_N != 0) {
              this.field_N = param0.field_N;
            }
            if (param0.field_X != null) {
              this.field_X = param0.field_X;
            }
            if (param0.field_S >= 0) {
              this.field_S = param0.field_S;
            }
            if (param0.field_E != -2147483648) {
              this.field_E = param0.field_E;
            }
            if (param0.field_C != null) {
              this.field_C = param0.field_C;
            }
            if (!param0.field_J) {
              this.field_J = param0.field_J;
            }
            if (param0.field_W != null) {
              this.field_W = param0.field_W;
            }
            if (param0.field_t != null) {
              this.field_t = param0.field_t;
            }
            if (param0.field_z) {
              this.field_z = param0.field_z;
            }
            if (null != param0.field_u) {
              this.field_u = param0.field_u;
            }
            if (null != param0.field_db) {
              this.field_db = param0.field_db;
            }
            if (param0.field_R) {
              this.field_R = param0.field_R;
            }
            if (param0.field_H != 0) {
              this.field_H = param0.field_H;
            }
            if (null != param0.field_A) {
              this.field_A = param0.field_A;
            }
            if (param0.field_y) {
              this.field_y = param0.field_y;
            }
            if (param0.field_fb != -2147483648) {
              this.field_fb = param0.field_fb;
            }
            if (null != param0.field_eb) {
              this.field_eb = param0.field_eb;
            }
            if (param0.field_L != 0) {
              this.field_L = param0.field_L;
            }
            if (null != param0.field_T) {
              this.field_T = param0.field_T;
            }
            if (param0.field_B != 256) {
              this.field_B = param0.field_B;
            }
            if (0 <= param0.field_M) {
              this.field_M = param0.field_M;
            }
            if (null != param0.field_D) {
              this.field_D = param0.field_D;
            }
            if (param0.field_bb != 0) {
              this.field_bb = param0.field_bb;
            }
            if (0 <= param0.field_ab) {
              this.field_ab = param0.field_ab;
            }
            if (param0.field_K != -2147483648) {
              this.field_K = param0.field_K;
            }
            if (param0.field_F != null) {
              this.field_F = param0.field_F;
            }
            if (param0.field_Q != 0) {
              this.field_Q = param0.field_Q;
            }
            if (param0.field_O >= 0) {
              this.field_O = param0.field_O;
            }
          }
          if (param1 > -68) {
            this.field_fb = -47;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_101_0 = var3;
          stackIn_101_1 = new StringBuilder().append("dq.D(");
          if (param0 == null) {
            stackIn_102_2 = "null";
          } else {
            stackIn_102_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_101_0), ((StringBuilder) (Object) stackIn_101_1).append(stackIn_102_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_v = null;
        field_s = null;
        field_Z = null;
        if (param0 != -1) {
          dq.releaseStatics(109);
        }
    }

    dq(long param0, dq param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    private dq(long param0, dq param1, int param2, int param3, int param4, int param5, String param6) {
        this.field_O = -1;
        this.field_M = -1;
        this.field_E = -2147483648;
        this.field_U = -2147483648;
        this.field_V = -2147483648;
        this.field_J = true;
        this.field_S = -1;
        this.field_cb = -2147483648;
        this.field_ab = -1;
        this.field_B = 256;
        this.field_K = -2147483648;
        this.field_fb = -2147483648;
        this.field_y = false;
        try {
          this.key = param0;
          this.a(param1, (byte) -128);
          if (param6 != null) {
            this.field_F = param6;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "dq.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_s = new int[1];
    }
}
