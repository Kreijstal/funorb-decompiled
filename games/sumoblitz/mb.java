/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb {
    static String[] field_c;
    static int field_b;
    static int[] field_h;
    static gf field_f;
    static hv field_k;
    static String[] field_g;
    static String[] field_d;
    static String[][] field_e;
    static String[] field_j;
    static String[] field_a;
    static String[] field_i;

    public static void a(boolean param0) {
        field_a = null;
        field_f = null;
        field_j = null;
        field_c = null;
        field_h = null;
        field_k = null;
        field_i = null;
        field_e = (String[][]) null;
        if (!param0) {
          field_g = null;
          field_d = null;
          return;
        }
    }

    final static byte[] a(CharSequence param0, byte param1) {
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
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          var2_int = param0.length();
          if (param1 != 32) {
            field_g = (String[]) null;
          }
          var3 = new byte[var2_int];
          for (var4 = 0; var2_int > var4; var4++) {
            {
              var5 = param0.charAt(var4);
              if ((var5 <= 0 ||
                128 <= var5) && (var5 < 160 ||
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
          stackIn_69_0 = var3;
          return stackIn_69_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_72_0 = var2;
          stackIn_72_1 = new StringBuilder().append("mb.A(");
          if (param0 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(boolean param0, int param1, int param2) {
        if (!param0) {
          return false;
        }
        return (param2 & 65536) != 0 ? true : false;
    }

    static {
        field_c = new String[16];
        field_b = -1;
        field_h = new int[1];
        field_f = new gf();
        field_k = new hv();
        field_g = new String[]{"<b>Upgrades", "At the end of each level, GyojiBot will reward you with Powerup Points. Assign points to Speed, Traction and Bounce to upgrade your Sumo Drone.", "Soup-up your speed for superior swiftness.", "Top up your traction for terrific tenacity.", "Boost your bounce to better bump baddies.", "Occasionally, GyojiBot will drop temporary upgrades into the arena. He hopes you will accept his generous gifts."};
        field_d = new String[]{"<b>Drones", "HyoujunBot", "He's eager to fight, but he has only normal eyesight. It is possible to hide from him.", "SuiminBot", "Wake him up with a bump. He's slower than HyoujunBot, but he has better traction.", "KosokuBot", "He's lighter than HyoujunBot, but faster, with very little traction."};
        field_j = new String[]{"<b>Drones", "BunkatBot", "On death, he splits into smaller versions of himself.", "SosakuBot", "With high traction and a very long sight range, he'll hunt you down from far away."};
        field_i = new String[]{"<b>Objective", "Force enemy Sumo Drones into the energy barrier surrounding the arena. Use obstacles to your advantage.", "GyojiBot bestows points multipliers upon those who destroy multiple drones quickly - but what GyojiBot giveth, GyojiBot also taketh away."};
        field_a = new String[]{"<b>Controls", "MOUSE CONTROLS: ", "Use your left mouse button to direct your drone.", "KEYBOARD CONTROLS: ", "Use the WASD keys to direct your drone. Use Space to deploy an Energy Blast when the red Recharge Meter is full.", "Do not bore GyojiBot by remaining in one place for too long. For this, he will destroy your drone.", "GyojiBot wants you to know that this hurts him more than it hurts you."};
        field_e = new String[5][];
    }
}
