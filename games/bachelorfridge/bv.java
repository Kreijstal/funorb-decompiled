/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bv {
    int field_w;
    static String field_j;
    byte[] field_u;
    static int[] field_G;
    int field_C;
    boolean[] field_f;
    int field_E;
    int field_r;
    byte[] field_D;
    int field_H;
    static String field_d;
    byte[] field_p;
    int[] field_s;
    int[] field_a;
    int field_J;
    int field_z;
    byte field_o;
    int field_v;
    int field_g;
    int[][] field_i;
    int[] field_t;
    int field_q;
    static vr field_B;
    int field_y;
    int[] field_m;
    int[][] field_x;
    boolean[] field_k;
    byte[] field_I;
    byte[][] field_e;
    byte[] field_F;
    int field_c;
    int field_h;
    int field_b;
    byte[] field_n;
    int field_l;
    int[][] field_A;

    final static int a(byte param0) {
        if (param0 >= -6) {
          return 31;
        }
        return qk.field_l;
    }

    final static void b(int param0) {
        int var1 = 0;
        if (bs.field_k < 224) {
          var1 = bs.field_k % 32;
          gka.a(param0 ^ -16922, 32 + bs.field_k - var1);
        } else {
          gka.a(param0 - 17025, 256);
        }
        if (param0 != 16964) {
          CharSequence var2 = (CharSequence) null;
          bv.a(-13, (CharSequence) null);
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_G = null;
        field_j = null;
        field_B = null;
        int var1 = -93 / ((24 - param0) / 49);
    }

    final static byte[] a(int param0, CharSequence param1) {
        int var4 = 0;
        byte[] stackIn_69_0 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = BachelorFridge.field_y;
        try {
          var2_int = param1.length();
          if (param0 != 18019) {
            bv.b(-42);
          }
          var3 = new byte[var2_int];
          for (var4 = 0; var4 < var2_int; var4++) {
            {
              var5 = param1.charAt(var4);
              if ((var5 <= 0 ||
                128 <= var5) && (var5 < 160 ||
                255 < var5)) {
                switch (var5) {
                  case 8364:
                    var3[var4] = (byte)-128;
                    break;
                  case 8218:
                    var3[var4] = (byte)-126;
                    break;
                  case 402:
                    var3[var4] = (byte)-125;
                    break;
                  case 8222:
                    var3[var4] = (byte)-124;
                    break;
                  case 8230:
                    var3[var4] = (byte)-123;
                    break;
                  case 8224:
                    var3[var4] = (byte)-122;
                    break;
                  case 8225:
                    var3[var4] = (byte)-121;
                    break;
                  case 710:
                    var3[var4] = (byte)-120;
                    break;
                  case 8240:
                    var3[var4] = (byte)-119;
                    break;
                  case 352:
                    var3[var4] = (byte)-118;
                    break;
                  case 8249:
                    var3[var4] = (byte)-117;
                    break;
                  case 338:
                    var3[var4] = (byte)-116;
                    break;
                  case 381:
                    var3[var4] = (byte)-114;
                    break;
                  case 8216:
                    var3[var4] = (byte)-111;
                    break;
                  case 8217:
                    var3[var4] = (byte)-110;
                    break;
                  case 8220:
                    var3[var4] = (byte)-109;
                    break;
                  case 8221:
                    var3[var4] = (byte)-108;
                    break;
                  case 8226:
                    var3[var4] = (byte)-107;
                    break;
                  case 8211:
                    var3[var4] = (byte)-106;
                    break;
                  case 8212:
                    var3[var4] = (byte)-105;
                    break;
                  case 732:
                    var3[var4] = (byte)-104;
                    break;
                  case 8482:
                    var3[var4] = (byte)-103;
                    break;
                  case 353:
                    var3[var4] = (byte)-102;
                    break;
                  case 8250:
                    var3[var4] = (byte)-101;
                    break;
                  case 339:
                    var3[var4] = (byte)-100;
                    break;
                  case 382:
                    var3[var4] = (byte)-98;
                    break;
                  default:
                    var3[var4] = (byte)63;
                    break;
                  case 376:
                    var3[var4] = (byte)-97;
                    break;
                }
              } else {
                var3[var4] = (byte)var5;
              }
            }
          }
          stackIn_69_0 = var3;
          return stackIn_69_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_72_0 = var2;
          stackIn_72_1 = new StringBuilder().append("bv.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(')').toString());
        }
    }

    bv() {
        this.field_u = new byte[18002];
        this.field_E = 0;
        this.field_H = 0;
        this.field_s = new int[257];
        this.field_D = new byte[256];
        this.field_m = new int[6];
        this.field_e = new byte[6][258];
        this.field_i = new int[6][258];
        this.field_x = new int[6][258];
        this.field_f = new boolean[256];
        this.field_a = new int[16];
        this.field_I = new byte[4096];
        this.field_t = new int[256];
        this.field_k = new boolean[16];
        this.field_n = new byte[18002];
        this.field_A = new int[6][258];
    }

    static {
        field_d = "Type your email address again to make sure it's correct";
        field_j = "Email is valid";
        field_G = new int[8192];
    }
}
