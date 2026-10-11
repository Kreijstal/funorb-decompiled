/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh {
    int field_I;
    byte[] field_g;
    int[][] field_K;
    byte[] field_x;
    int field_e;
    int[] field_B;
    int[][] field_q;
    int field_t;
    int field_j;
    static String field_n;
    int[] field_w;
    int[][] field_h;
    static String field_A;
    int field_b;
    byte[] field_i;
    int[] field_z;
    int field_r;
    boolean[] field_E;
    byte field_N;
    int field_v;
    int field_y;
    int field_M;
    int field_G;
    int field_L;
    int field_a;
    static vd field_J;
    int[] field_D;
    byte[] field_C;
    int field_m;
    int field_l;
    byte[] field_s;
    int field_c;
    byte[][] field_p;
    boolean[] field_H;
    static double field_f;
    byte[] field_k;
    static java.lang.reflect.Method field_u;
    static String field_F;
    static fh field_d;
    static String[] field_o;

    public static void a(int param0) {
        field_u = null;
        field_n = null;
        if (param0 < -73) {
          field_d = null;
          field_o = null;
          field_F = null;
          field_J = null;
          field_A = null;
          return;
        }
    }

    final static void a(boolean param0, Sentinel param1) {
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = SteelSentinels.obfuscationControl;
        try {
          var2_int = param1.activeModuleType;
          switch (var2_int) {
            case 10:
              param1.field_Q = param1.field_Q - 100;
              break;
            case 12:
              param1.field_Q = param1.field_Q - 300;
              break;
            case 14:
              param1.field_Q = param1.field_Q - 500;
              break;
            case 0:
              param1.field_wb = param1.field_wb - 1;
              break;
            case 1:
              param1.field_wb = param1.field_wb - 2;
              break;
            case 20:
              param1.field_wb = param1.field_wb - 10;
              break;
            case 9:
            case 29:
            case 28:
            default:
              if (5 != var2_int &&
                var2_int != 6 &&
                var2_int != 7 &&
                var2_int != 8) {
                if (var2_int == 9) {
                  param1.maximumCharge = param1.maximumCharge - ag.a(48, param1.activeModuleType);
                  break;
                }
                if (var2_int == 29) {
                  param1.field_cb = param1.field_cb / 2;
                  break;
                }
                if (28 != var2_int) {
                  break;
                }
                param1.field_Fb = param1.field_Fb / 2;
                break;
              }
              param1.maximumCharge = param1.maximumCharge - ag.a(48, param1.activeModuleType);
              break;
            case 4:
              param1.field_wb = param1.field_wb - 5;
              break;
            case 3:
              param1.field_wb = param1.field_wb - 4;
              break;
            case 2:
              param1.field_wb = param1.field_wb - 3;
              break;
            case 13:
              param1.field_Q = param1.field_Q - 400;
              break;
            case 11:
              param1.field_Q = param1.field_Q - 200;
              break;
          }
          if (!param0) {
            field_F = (String) null;
          }
          if (param1.field_S > param1.field_Q) {
            param1.field_S = param1.field_Q;
          }
          if (param1.charge > param1.maximumCharge) {
            param1.refillCharge(5);
          }
          param1.activeModuleType = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_53_0 = var2;
          stackIn_53_1 = new StringBuilder().append("nh.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(')').toString());
        }
    }

    final static void a(byte param0, SceneWidget param1, SceneWidget param2) {
        try {
          if (null == param1.field_M) {
            param1.field_M = new NodeDeque();
          }
          if (param2.field_M == null) {
            param2.field_M = new NodeDeque();
          }
          if (null == pi.field_a) {
            pi.field_a = new dk(64);
          }
          if (null == db.field_h) {
            db.field_h = new dk(64);
          }
          Sprite.field_c = param1.field_M;
          if (param0 > -97) {
            field_o = (String[]) null;
          }
          am.field_c = param2.field_M;
          ub.a(true);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "nh.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    nh() {
        this.field_g = new byte[18002];
        this.field_h = new int[6][258];
        this.field_x = new byte[256];
        this.field_K = new int[6][258];
        this.field_q = new int[6][258];
        this.field_i = new byte[4096];
        this.field_E = new boolean[256];
        this.field_B = new int[16];
        this.field_D = new int[6];
        this.field_p = new byte[6][258];
        this.field_H = new boolean[16];
        this.field_s = new byte[18002];
        this.field_w = new int[257];
        this.field_a = 0;
        this.field_z = new int[256];
        this.field_I = 0;
    }

    static {
        field_A = "SUDDEN DEATH!";
        field_n = "You have entered another game.";
        field_J = new vd();
        field_f = 0.0;
        field_o = new String[]{"", "<br>You have ten minutes before the battle in orbit reaches the surface.", "<br>Capture the MGFN technology to win the score-gaining power.", "<br>Stay within the crashed ship's energy shield to gain score.", "<br>Reach the enemy ship and return to help your team win the battle."};
        field_F = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
    }
}
