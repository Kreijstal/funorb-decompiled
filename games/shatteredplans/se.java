/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se {
    boolean[][] field_j;
    int[] field_f;
    static boolean field_k;
    static String field_a;
    static boolean field_g;
    int[] field_b;
    int[] field_l;
    static String field_e;
    int[] field_h;
    static ur field_m;
    boolean[][] field_d;
    static qr field_i;
    static String field_c;

    final static void a(hb param0, int param1, hb param2, hb param3, sl param4) {
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        qm var7 = null;
        qa var8 = null;
        int var11 = 0;
        mg var12 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var5_int = param0.b((byte) -61);
          var6 = param3.b((byte) -61);
          var7 = (qm) (param2.a((byte) 124));
          if (param1 != -256) {
            se.a((byte) -9);
          }
          while (var7 != null) {
            param4.c(var7.field_o + 251, (byte) -125);
            im.a(var7.field_p, param4, 9555);
            di.a(var7.field_q, false, param4);
            if (var7.field_o == 3) {
              di.a(var7.field_r, false, param4);
            }
            var7 = (qm) (param2.a(false));
          }
          var8 = (qa) (param0.a((byte) 111));
          while (var5_int >= 59) {
            param4.c(250, (byte) -61);
            for (var9 = 0; var9 < 59; var9++) {
              hm.a(var8, param4, true);
              var8 = (qa) (param0.a(false));
            }
            var5_int -= 59;
          }
          if (var5_int > 0) {
            param4.c(192 + var5_int - 1, (byte) -86);
            while (var8 != null) {
              hm.a(var8, param4, true);
              var8 = (qa) (param0.a(false));
            }
          }
          var12 = (mg) (param3.a((byte) 110));
          while (var6 >= 192) {
            param4.c(191, (byte) -104);
            for (var10 = 0; var10 < 192; var10++) {
              lp.a(var12, (byte) -106, param4);
              var12 = (mg) (param3.a(false));
            }
            var6 -= 192;
          }
          if (var6 > 0) {
            param4.c(var6 - 1, (byte) -103);
            while (var12 != null) {
              lp.a(var12, (byte) -88, param4);
              var12 = (mg) (param3.a(false));
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_32_0 = var5;
          stackIn_32_1 = new StringBuilder().append("se.A(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          stackIn_38_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',');
          if (param3 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          stackIn_41_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',');
          if (param4 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1) {
        int var3 = 0;
        gr var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (!param1) {
            return;
          }
          var4 = (gr) (qa.field_r.d(0));
          while (var4 != null) {
            uf.a(var4, param0, false);
            var4 = (gr) (qa.field_r.a((byte) -71));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "se.B(" + param0 + ',' + param1 + ')');
        }
    }

    final static byte[] a(byte param0, CharSequence param1) {
        int var4 = 0;
        byte[] stackIn_3_0 = null;
        byte[] stackIn_70_0 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var2_int = param1.length();
          var3 = new byte[var2_int];
          if (param0 <= 79) {
            stackIn_3_0 = (byte[]) null;
            return stackIn_3_0;
          }
          for (var4 = 0; var4 < var2_int; var4++) {
            {
              var5 = param1.charAt(var4);
              if ((var5 <= 0 ||
                var5 >= 128) && (var5 < 160 ||
                var5 > 255)) {
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
                  case 376:
                    var3[var4] = (byte)-97;
                    break;
                  default:
                    var3[var4] = (byte)63;
                    break;
                }
              } else {
                var3[var4] = (byte)var5;
              }
            }
          }
          stackIn_70_0 = var3;
          return stackIn_70_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_73_0 = var2;
          stackIn_73_1 = new StringBuilder().append("se.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(')').toString());
        }
    }

    private se() throws Throwable {
        throw new Error();
    }

    public static void a(byte param0) {
        if (param0 != -37) {
          se.a((byte) 121);
        }
        field_m = null;
        field_a = null;
        field_e = null;
        field_i = null;
        field_c = null;
    }

    static {
        field_a = "Please log in to access this feature.";
        field_e = "Send private Quick Chat to <%0>";
        field_c = "You have signed a Non-Aggression Pact with <%0>.";
    }
}
