/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n {
    static q field_e;
    static cn field_b;
    static int[] field_f;
    static se field_c;
    static int field_d;
    static String field_a;
    static int[] field_g;

    final static boolean a(byte param0) {
        int var1 = 6 / ((param0 - 54) / 57);
        return qc.field_t;
    }

    public static void a(int param0) {
        if (param0 == 3554) {
          field_b = null;
          field_e = null;
          field_c = null;
          field_f = null;
          field_a = null;
          field_g = null;
          return;
        }
        field_b = (cn) null;
        field_b = null;
        field_e = null;
        field_c = null;
        field_f = null;
        field_a = null;
        field_g = null;
    }

    final static byte[] a(CharSequence param0, int param1) {
        int var4 = 0;
        byte[] stackIn_70_0 = null;
        byte[] stackIn_72_0 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = DungeonAssault.field_K;
        try {
          var2_int = param0.length();
          var3 = new byte[var2_int];
          for (var4 = 0; var2_int > var4; var4++) {
            {
              var5 = param0.charAt(var4);
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
          if (param1 == -14553) {
            stackIn_72_0 = var3;
            return stackIn_72_0;
          }
          stackIn_70_0 = (byte[]) null;
          return stackIn_70_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_75_0 = var2;
          stackIn_75_1 = new StringBuilder().append("n.C(");
          if (param0 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_75_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_f = new int[4];
        field_a = "<%0> <img=0><img=0><img=0>";
    }
}
