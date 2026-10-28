/*
 * Decompiled by CFR-JS 0.4.0.
 */
class LegacyWidgetStyle extends LegacyStyleNode {
    private int field_eb;
    static AccountRegistrationPanel field_E;
    private Sprite field_Z;
    private int field_H;
    private int field_gb;
    private Sprite[] field_w;
    static String field_K;
    private int field_C;
    private Sprite[] field_A;
    private int field_R;
    static HighscoreQuery[] field_N;
    private Sprite field_x;
    private int field_bb;
    private boolean field_ib;
    private int field_G;
    private int field_T;
    private int field_F;
    private int field_D;
    private Sprite[] field_jb;
    private Sprite[] field_V;
    private String field_cb;
    private int field_M;
    private boolean field_B;
    private String field_S;
    private int field_P;
    private boolean field_y;
    private Sprite field_O;
    private Sprite field_z;
    private Sprite[] field_fb;
    private int field_U;
    private int field_Y;
    private boolean field_W;
    private BitmapFont field_Q;
    private int field_X;
    private int field_kb;
    static int[] field_ab;
    private int field_L;
    private Sprite field_db;
    private boolean field_I;
    private boolean field_J;
    private int field_hb;

    final static byte[][] loadCampaignLevels(int guard, ResourceArchive archive, int[] key, int mode, ResourceArchive memberArchive) {
        String stackIn_12_2 = null;
        String stackIn_15_2 = null;
        String stackIn_18_2 = null;
        int var10 = EscapeVector.obfuscationControl;
        try {
          int var5_int = SpriteFactorySupport.levelCount(false, mode);
          if (0 >= var5_int) {
            byte[][] stackIn_3_0 = (byte[][]) null;
            return stackIn_3_0;
          }
          byte[][] var6 = new byte[var5_int][];
          int var7 = 0;
          int var8 = 103 / ((75 - guard) / 49);
          while (var5_int > var7) {
            byte[] var9 = LoginStage.loadLevelBytes(archive, key, var7, mode, memberArchive, (byte) 97);
            var6[var7] = var9;
            var7++;
          }
          byte[][] stackIn_8_0 = var6;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_11_0 = var5;
          StringBuilder stackIn_11_1 = new StringBuilder().append("ol.C(").append(guard).append(',');
          if (archive == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          StringBuilder stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (key == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          StringBuilder stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(mode).append(',');
          if (memberArchive == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    LegacyWidgetStyle(long param0, LegacyWidgetStyle param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    public static void releaseStatics(int guard) {
        field_E = null;
        field_ab = null;
        if (guard != 4095) {
          return;
        }
        field_N = null;
        field_K = null;
    }

    final static boolean isOutsidePasswordLength(byte guard, String password) {
        String stackIn_13_2 = null;
        try {
          if (guard != -7) {
            field_N = (HighscoreQuery[]) null;
          }
          if (password != null &&
            password.length() >= ArchiveRequest.field_v) {
            if (password.length() > p.field_a) {
              return true;
            }
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var2;
          StringBuilder stackIn_12_1 = new StringBuilder().append("ol.F(").append(guard).append(',');
          if (password == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final void inheritOverrides(int guard, LegacyWidgetStyle template) {
        String stackIn_101_2 = null;
        try {
          if (guard != -1680) {
            LegacyWidgetStyle.releaseStatics(-110);
          }
          if (template != null) {
            if (!template.field_W) {
              this.field_W = template.field_W;
            }
            if (null != template.field_V) {
              this.field_V = template.field_V;
            }
            if (-2147483648 != template.field_C) {
              this.field_C = template.field_C;
            }
            if (template.field_gb != 256) {
              this.field_gb = template.field_gb;
            }
            if (template.field_J) {
              this.field_J = template.field_J;
            }
            if (null != template.field_A) {
              this.field_A = template.field_A;
            }
            if (null != template.field_x) {
              this.field_x = template.field_x;
            }
            if (template.field_X != 0) {
              this.field_X = template.field_X;
            }
            if (template.field_R != 0) {
              this.field_R = template.field_R;
            }
            if (-2147483648 != template.field_U) {
              this.field_U = template.field_U;
            }
            if (template.field_O != null) {
              this.field_O = template.field_O;
            }
            if (template.field_G != 0) {
              this.field_G = template.field_G;
            }
            if (template.field_D != 0) {
              this.field_D = template.field_D;
            }
            if (null != template.field_Q) {
              this.field_Q = template.field_Q;
            }
            if (template.field_kb >= 0) {
              this.field_kb = template.field_kb;
            }
            if (template.field_S != null) {
              this.field_S = template.field_S;
            }
            if (-2147483648 != template.field_H) {
              this.field_H = template.field_H;
            }
            if (0 != template.field_L) {
              this.field_L = template.field_L;
            }
            if (template.field_P != -2147483648) {
              this.field_P = template.field_P;
            }
            if (null != template.field_w) {
              this.field_w = template.field_w;
            }
            if (template.field_B) {
              this.field_B = template.field_B;
            }
            if (template.field_eb >= 0) {
              this.field_eb = template.field_eb;
            }
            if (template.field_ib) {
              this.field_ib = template.field_ib;
            }
            if (template.field_Y >= 0) {
              this.field_Y = template.field_Y;
            }
            if (template.field_y) {
              this.field_y = template.field_y;
            }
            if (null != template.field_db) {
              this.field_db = template.field_db;
            }
            if (template.field_I) {
              this.field_I = template.field_I;
            }
            if (template.field_T != -2147483648) {
              this.field_T = template.field_T;
            }
            if (template.field_Z != null) {
              this.field_Z = template.field_Z;
            }
            if (template.field_F != 0) {
              this.field_F = template.field_F;
            }
            if (null != template.field_fb) {
              this.field_fb = template.field_fb;
            }
            if (template.field_jb != null) {
              this.field_jb = template.field_jb;
            }
            if (0 != template.field_bb) {
              this.field_bb = template.field_bb;
            }
            if (null != template.field_z) {
              this.field_z = template.field_z;
            }
            if (0 <= template.field_hb) {
              this.field_hb = template.field_hb;
            }
            if (null != template.field_cb) {
              this.field_cb = template.field_cb;
            }
            if (template.field_M == -2147483648) {
              return;
            }
            this.field_M = template.field_M;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_100_0 = var3;
          StringBuilder stackIn_100_1 = new StringBuilder().append("ol.D(").append(guard).append(',');
          if (template == null) {
            stackIn_101_2 = "null";
          } else {
            stackIn_101_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_100_0), ((StringBuilder) (Object) stackIn_100_1).append(stackIn_101_2).append(')').toString());
        }
    }

    private LegacyWidgetStyle(long param0, LegacyWidgetStyle param1, int param2, int param3, int param4, int param5, String param6) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        this.field_H = -2147483648;
        this.field_eb = -1;
        this.field_gb = 256;
        this.field_T = -2147483648;
        this.field_P = -2147483648;
        this.field_M = -2147483648;
        this.field_Y = -1;
        this.field_C = -2147483648;
        this.field_kb = -1;
        this.field_W = true;
        this.field_I = false;
        this.field_U = -2147483648;
        this.field_hb = -1;
        try {
          this.key = param0;
          this.inheritOverrides(-1680, param1);
          if (param6 != null) {
            this.field_S = param6;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_6_0 = runtimeException;
          StringBuilder stackIn_6_1 = new StringBuilder().append("ol.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_K = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_ab = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
