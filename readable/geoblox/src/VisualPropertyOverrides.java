/*
 * Decompiled by CFR-JS 0.4.0.
 */
class VisualPropertyOverrides extends VisualPropertyNode {
    private int field_v;
    private int field_t;
    private int field_bb;
    private boolean field_q;
    private int field_A;
    private String textOverride;
    private Sprite[] field_fb;
    private Sprite[] field_H;
    private boolean field_P;
    static String invalidUserOrPasswordText;
    private Sprite field_p;
    private int field_T;
    private boolean field_S;
    private int field_cb;
    static int clientBootstrapStage;
    private Sprite[] field_eb;
    private boolean field_L;
    static Sprite[] sparkleFrames;
    private int field_J;
    private Sprite[] field_D;
    private String field_Y;
    private int field_K;
    private int field_r;
    private int field_O;
    private int field_V;
    private Sprite field_F;
    private BitmapFont fontOverride;
    private Sprite[] field_s;
    private int field_db;
    private int field_x;
    private Sprite field_Z;
    private int field_z;
    private boolean field_N;
    static boolean field_I;
    private int field_ab;
    static String connectionLostWithReasonText;
    static String field_y;
    private Sprite field_u;
    private int field_G;
    private int field_U;
    private Sprite field_M;
    private boolean field_W;
    private int field_w;

    private final void mergeDefinedProperties(int methodGuard, VisualPropertyOverrides overrides) {
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_101_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (overrides != null) {
            if (overrides.field_K != -2147483648) {
              this.field_K = overrides.field_K;
            }
            if (overrides.field_x != 0) {
              this.field_x = overrides.field_x;
            }
            if (null != overrides.field_F) {
              this.field_F = overrides.field_F;
            }
            if (overrides.field_A != 0) {
              this.field_A = overrides.field_A;
            }
            if (-2147483648 != overrides.field_J) {
              this.field_J = overrides.field_J;
            }
            if (overrides.field_M != null) {
              this.field_M = overrides.field_M;
            }
            if (0 != overrides.field_z) {
              this.field_z = overrides.field_z;
            }
            if (overrides.field_Z != null) {
              this.field_Z = overrides.field_Z;
            }
            if (null != overrides.field_Y) {
              this.field_Y = overrides.field_Y;
            }
            if (overrides.field_r != -2147483648) {
              this.field_r = overrides.field_r;
            }
            if (overrides.field_H != null) {
              this.field_H = overrides.field_H;
            }
            if (-2147483648 != overrides.field_T) {
              this.field_T = overrides.field_T;
            }
            if (overrides.field_w != -2147483648) {
              this.field_w = overrides.field_w;
            }
            if (overrides.field_N) {
              this.field_N = overrides.field_N;
            }
            if (overrides.field_p != null) {
              this.field_p = overrides.field_p;
            }
            if (overrides.field_t != 256) {
              this.field_t = overrides.field_t;
            }
            if (overrides.field_cb >= 0) {
              this.field_cb = overrides.field_cb;
            }
            if (!overrides.field_S) {
              this.field_S = overrides.field_S;
            }
            if (0 != overrides.field_V) {
              this.field_V = overrides.field_V;
            }
            if (null != overrides.field_s) {
              this.field_s = overrides.field_s;
            }
            if (null != overrides.textOverride) {
              this.textOverride = overrides.textOverride;
            }
            if (overrides.field_U != 0) {
              this.field_U = overrides.field_U;
            }
            if (overrides.field_fb != null) {
              this.field_fb = overrides.field_fb;
            }
            if (0 <= overrides.field_bb) {
              this.field_bb = overrides.field_bb;
            }
            if (0 != overrides.field_v) {
              this.field_v = overrides.field_v;
            }
            if (null != overrides.field_u) {
              this.field_u = overrides.field_u;
            }
            if (overrides.field_eb != null) {
              this.field_eb = overrides.field_eb;
            }
            if (overrides.field_G >= 0) {
              this.field_G = overrides.field_G;
            }
            if (overrides.field_L) {
              this.field_L = overrides.field_L;
            }
            if (overrides.field_db != -2147483648) {
              this.field_db = overrides.field_db;
            }
            if (overrides.field_P) {
              this.field_P = overrides.field_P;
            }
            if (null != overrides.field_D) {
              this.field_D = overrides.field_D;
            }
            if (overrides.fontOverride != null) {
              this.fontOverride = overrides.fontOverride;
            }
            if (0 != overrides.field_O) {
              this.field_O = overrides.field_O;
            }
            if (overrides.field_q) {
              this.field_q = overrides.field_q;
            }
            if (0 <= overrides.field_ab) {
              this.field_ab = overrides.field_ab;
            }
            if (overrides.field_W) {
              this.field_W = overrides.field_W;
            }
          }
          if (methodGuard != -2147483648) {
            sparkleFrames = (Sprite[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_100_0 = var3;
          stackIn_100_1 = new StringBuilder().append("mi.B(").append(methodGuard).append(',');
          if (overrides == null) {
            stackIn_101_2 = "null";
          } else {
            stackIn_101_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_100_0), ((StringBuilder) (Object) stackIn_100_1).append(stackIn_101_2).append(')').toString());
        }
    }

    VisualPropertyOverrides(long nodeKey, VisualPropertyOverrides inheritedProperties) {
        this(nodeKey, inheritedProperties, 0, 0, 0, 0, (String) null);
    }

    public static void b(boolean param0) {
        connectionLostWithReasonText = null;
        if (param0) {
            return;
        }
        invalidUserOrPasswordText = null;
        field_y = null;
        sparkleFrames = null;
    }

    private VisualPropertyOverrides(long nodeKey, VisualPropertyOverrides inheritedProperties, int unusedFirstOption, int unusedSecondOption, int unusedThirdOption, int unusedFourthOption, String textOverride) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_bb = -1;
        this.field_t = 256;
        this.field_T = -2147483648;
        this.field_S = true;
        this.field_K = -2147483648;
        this.field_J = -2147483648;
        this.field_ab = -1;
        this.field_cb = -1;
        this.field_G = -1;
        this.field_db = -2147483648;
        this.field_q = false;
        this.field_r = -2147483648;
        this.field_w = -2147483648;
        try {
          this.field_a = nodeKey;
          this.mergeDefinedProperties(-2147483648, inheritedProperties);
          if (textOverride != null) {
            this.textOverride = textOverride;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("mi.<init>(").append(nodeKey).append(',');
          if (inheritedProperties == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(unusedFirstOption).append(',').append(unusedSecondOption).append(',').append(unusedThirdOption).append(',').append(unusedFourthOption).append(',');
          if (textOverride == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        invalidUserOrPasswordText = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_y = "Continue";
        field_I = false;
        connectionLostWithReasonText = "Connection lost. <%0>";
    }
}
