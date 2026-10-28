/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ol extends cd {
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
    static ij[] field_N;
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

    final static byte[][] a(int param0, ResourceArchive param1, int[] param2, int param3, ResourceArchive param4) {
        String stackIn_12_2 = null;
        String stackIn_15_2 = null;
        String stackIn_18_2 = null;
        int var10 = EscapeVector.obfuscationControl;
        try {
          int var5_int = je.a(false, param3);
          if (0 >= var5_int) {
            byte[][] stackIn_3_0 = (byte[][]) null;
            return stackIn_3_0;
          }
          byte[][] var6 = new byte[var5_int][];
          int var7 = 0;
          int var8 = 103 / ((75 - param0) / 49);
          while (var5_int > var7) {
            byte[] var9 = hf.a(param1, param2, var7, param3, param4, (byte) 97);
            var6[var7] = var9;
            var7++;
          }
          byte[][] stackIn_8_0 = var6;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_11_0 = var5;
          StringBuilder stackIn_11_1 = new StringBuilder().append("ol.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          StringBuilder stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          StringBuilder stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    ol(long param0, ol param1) {
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

    final static boolean a(byte param0, String param1) {
        String stackIn_13_2 = null;
        try {
          if (param0 != -7) {
            field_N = (ij[]) null;
          }
          if (param1 != null &&
            param1.length() >= ArchiveRequest.field_v) {
            if (param1.length() > p.field_a) {
              return true;
            }
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var2;
          StringBuilder stackIn_12_1 = new StringBuilder().append("ol.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final void a(int param0, ol param1) {
        String stackIn_101_2 = null;
        try {
          if (param0 != -1680) {
            ol.releaseStatics(-110);
          }
          if (param1 != null) {
            if (!param1.field_W) {
              this.field_W = param1.field_W;
            }
            if (null != param1.field_V) {
              this.field_V = param1.field_V;
            }
            if (-2147483648 != param1.field_C) {
              this.field_C = param1.field_C;
            }
            if (param1.field_gb != 256) {
              this.field_gb = param1.field_gb;
            }
            if (param1.field_J) {
              this.field_J = param1.field_J;
            }
            if (null != param1.field_A) {
              this.field_A = param1.field_A;
            }
            if (null != param1.field_x) {
              this.field_x = param1.field_x;
            }
            if (param1.field_X != 0) {
              this.field_X = param1.field_X;
            }
            if (param1.field_R != 0) {
              this.field_R = param1.field_R;
            }
            if (-2147483648 != param1.field_U) {
              this.field_U = param1.field_U;
            }
            if (param1.field_O != null) {
              this.field_O = param1.field_O;
            }
            if (param1.field_G != 0) {
              this.field_G = param1.field_G;
            }
            if (param1.field_D != 0) {
              this.field_D = param1.field_D;
            }
            if (null != param1.field_Q) {
              this.field_Q = param1.field_Q;
            }
            if (param1.field_kb >= 0) {
              this.field_kb = param1.field_kb;
            }
            if (param1.field_S != null) {
              this.field_S = param1.field_S;
            }
            if (-2147483648 != param1.field_H) {
              this.field_H = param1.field_H;
            }
            if (0 != param1.field_L) {
              this.field_L = param1.field_L;
            }
            if (param1.field_P != -2147483648) {
              this.field_P = param1.field_P;
            }
            if (null != param1.field_w) {
              this.field_w = param1.field_w;
            }
            if (param1.field_B) {
              this.field_B = param1.field_B;
            }
            if (param1.field_eb >= 0) {
              this.field_eb = param1.field_eb;
            }
            if (param1.field_ib) {
              this.field_ib = param1.field_ib;
            }
            if (param1.field_Y >= 0) {
              this.field_Y = param1.field_Y;
            }
            if (param1.field_y) {
              this.field_y = param1.field_y;
            }
            if (null != param1.field_db) {
              this.field_db = param1.field_db;
            }
            if (param1.field_I) {
              this.field_I = param1.field_I;
            }
            if (param1.field_T != -2147483648) {
              this.field_T = param1.field_T;
            }
            if (param1.field_Z != null) {
              this.field_Z = param1.field_Z;
            }
            if (param1.field_F != 0) {
              this.field_F = param1.field_F;
            }
            if (null != param1.field_fb) {
              this.field_fb = param1.field_fb;
            }
            if (param1.field_jb != null) {
              this.field_jb = param1.field_jb;
            }
            if (0 != param1.field_bb) {
              this.field_bb = param1.field_bb;
            }
            if (null != param1.field_z) {
              this.field_z = param1.field_z;
            }
            if (0 <= param1.field_hb) {
              this.field_hb = param1.field_hb;
            }
            if (null != param1.field_cb) {
              this.field_cb = param1.field_cb;
            }
            if (param1.field_M == -2147483648) {
              return;
            }
            this.field_M = param1.field_M;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_100_0 = var3;
          StringBuilder stackIn_100_1 = new StringBuilder().append("ol.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_101_2 = "null";
          } else {
            stackIn_101_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_100_0), ((StringBuilder) (Object) stackIn_100_1).append(stackIn_101_2).append(')').toString());
        }
    }

    private ol(long param0, ol param1, int param2, int param3, int param4, int param5, String param6) {
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
          this.a(-1680, param1);
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
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_K = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_ab = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
