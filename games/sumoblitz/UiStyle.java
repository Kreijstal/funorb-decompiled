/*
 * Decompiled by CFR-JS 0.4.0.
 */
class UiStyle extends UiStyleNode {
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

    final static void resendFourIntReadRequests(byte guard, int opcode) {
        int var3 = 0;
        FourIntReadRequest var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (guard != 115) {
            UiStyle.resendFourIntReadRequests((byte) 19, -85);
          }
          var4 = (FourIntReadRequest) (PerlinNoiseSliceGenerator.field_g.first(-87));
          while (var4 != null) {
            SpriteSheetSupport.sendFourIntReadRequest(var4, opcode, (byte) 117);
            var4 = (FourIntReadRequest) (PerlinNoiseSliceGenerator.field_g.next((byte) 18));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2), "dq.C(" + guard + ',' + opcode + ')');
        }
    }

    private final void mergeStyleFrom(UiStyle parent, byte guard) {
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_102_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (parent != null) {
            if (0 != parent.field_w) {
              this.field_w = parent.field_w;
            }
            if (parent.field_cb != -2147483648) {
              this.field_cb = parent.field_cb;
            }
            if (parent.field_V != -2147483648) {
              this.field_V = parent.field_V;
            }
            if (parent.field_U != -2147483648) {
              this.field_U = parent.field_U;
            }
            if (parent.field_x) {
              this.field_x = parent.field_x;
            }
            if (parent.field_I != 0) {
              this.field_I = parent.field_I;
            }
            if (null != parent.field_G) {
              this.field_G = parent.field_G;
            }
            if (parent.field_Y) {
              this.field_Y = parent.field_Y;
            }
            if (parent.field_r != null) {
              this.field_r = parent.field_r;
            }
            if (parent.field_N != 0) {
              this.field_N = parent.field_N;
            }
            if (parent.field_X != null) {
              this.field_X = parent.field_X;
            }
            if (parent.field_S >= 0) {
              this.field_S = parent.field_S;
            }
            if (parent.field_E != -2147483648) {
              this.field_E = parent.field_E;
            }
            if (parent.field_C != null) {
              this.field_C = parent.field_C;
            }
            if (!parent.field_J) {
              this.field_J = parent.field_J;
            }
            if (parent.field_W != null) {
              this.field_W = parent.field_W;
            }
            if (parent.field_t != null) {
              this.field_t = parent.field_t;
            }
            if (parent.field_z) {
              this.field_z = parent.field_z;
            }
            if (null != parent.field_u) {
              this.field_u = parent.field_u;
            }
            if (null != parent.field_db) {
              this.field_db = parent.field_db;
            }
            if (parent.field_R) {
              this.field_R = parent.field_R;
            }
            if (parent.field_H != 0) {
              this.field_H = parent.field_H;
            }
            if (null != parent.field_A) {
              this.field_A = parent.field_A;
            }
            if (parent.field_y) {
              this.field_y = parent.field_y;
            }
            if (parent.field_fb != -2147483648) {
              this.field_fb = parent.field_fb;
            }
            if (null != parent.field_eb) {
              this.field_eb = parent.field_eb;
            }
            if (parent.field_L != 0) {
              this.field_L = parent.field_L;
            }
            if (null != parent.field_T) {
              this.field_T = parent.field_T;
            }
            if (parent.field_B != 256) {
              this.field_B = parent.field_B;
            }
            if (0 <= parent.field_M) {
              this.field_M = parent.field_M;
            }
            if (null != parent.field_D) {
              this.field_D = parent.field_D;
            }
            if (parent.field_bb != 0) {
              this.field_bb = parent.field_bb;
            }
            if (0 <= parent.field_ab) {
              this.field_ab = parent.field_ab;
            }
            if (parent.field_K != -2147483648) {
              this.field_K = parent.field_K;
            }
            if (parent.field_F != null) {
              this.field_F = parent.field_F;
            }
            if (parent.field_Q != 0) {
              this.field_Q = parent.field_Q;
            }
            if (parent.field_O >= 0) {
              this.field_O = parent.field_O;
            }
          }
          if (guard > -68) {
            this.field_fb = -47;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_101_0 = var3;
          stackIn_101_1 = new StringBuilder().append("dq.D(");
          if (parent == null) {
            stackIn_102_2 = "null";
          } else {
            stackIn_102_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_101_0), ((StringBuilder) (Object) stackIn_101_1).append(stackIn_102_2).append(',').append(guard).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_v = null;
        field_s = null;
        field_Z = null;
        if (param0 != -1) {
          UiStyle.releaseStatics(109);
        }
    }

    UiStyle(long styleKey, UiStyle parent) {
        this(styleKey, parent, 0, 0, 0, 0, (String) null);
    }

    private UiStyle(long styleKey, UiStyle parent, int unusedX, int unusedY, int unusedWidth, int unusedHeight, String text) {
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
          this.key = styleKey;
          this.mergeStyleFrom(parent, (byte) -128);
          if (text != null) {
            this.field_F = text;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "dq.<init>(" + styleKey + ',' + (parent != null ? "{...}" : "null") + ',' + unusedX + ',' + unusedY + ',' + unusedWidth + ',' + unusedHeight + ',' + (text != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_s = new int[1];
    }
}
