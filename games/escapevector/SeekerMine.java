/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SeekerMine extends IntrusiveNode {
    int xQ16;
    int soundPlaybackRate;
    int homeXQ16;
    static int[] field_n;
    int velocityYQ16;
    tl proximitySound;
    int yQ16;
    static String[] field_k;
    int homeYQ16;
    hl flightSound;
    int velocityXQ16;

    final static int a(String param0, int param1, ih param2) {
        String stackIn_8_2 = null;
        String stackIn_11_2 = null;
        try {
          int var3_int = hn.a(param2, param1 - 16777215);
          int var4 = 4 * var3_int + param2.b(param0);
          if (param1 == 16777215) {
            int stackIn_4_0 = var4;
            return stackIn_4_0;
          }
          int stackIn_2_0 = 56;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var3;
          StringBuilder stackIn_7_1 = new StringBuilder().append("ic.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          StringBuilder stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(byte param0, boolean param1) {
        if (param0 > -97) {
          SeekerMine.a((byte) 51, false);
          ve.a(-58, param1, false);
          return;
        }
        ve.a(-58, param1, false);
    }

    public static void a(boolean param0) {
        field_k = null;
        if (param0) {
          SeekerMine.a(false, 19, -31, -11, -87);
          field_n = null;
          return;
        }
        field_n = null;
    }

    final static void a(int param0, int param1) {
        if (param0 > -97) {
          return;
        }
        GameplaySession.c((byte) -14);
        hi.field_q = param1;
    }

    final static boolean a(String param0, byte param1) {
        String stackIn_7_2 = null;
        try {
          if (param1 <= 108) {
            SeekerMine.a(true);
          }
          CharSequence var3 = (CharSequence) ((Object) param0);
          boolean stackIn_3_0 = cc.field_k.equals(sf.a(-67, var3));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var2;
          StringBuilder stackIn_6_1 = new StringBuilder().append("ic.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int var13 = EscapeVector.obfuscationControl;
        try {
          int var5_int = param1 + param2;
          int var6 = param4 + param3;
          if (param2 <= SoftwareRasterizer.clipLeft) {
            stackIn_4_0 = SoftwareRasterizer.clipLeft;
          } else {
            stackIn_4_0 = param2;
          }
          int var7 = stackIn_4_0;
          if (SoftwareRasterizer.clipTop >= param4) {
            stackIn_7_0 = SoftwareRasterizer.clipTop;
          } else {
            stackIn_7_0 = param4;
          }
          int var8 = stackIn_7_0;
          if (param0) {
            field_k = (String[]) null;
          }
          if (SoftwareRasterizer.clipRight > var5_int) {
            stackIn_12_0 = var5_int;
          } else {
            stackIn_12_0 = SoftwareRasterizer.clipRight;
          }
          int var9 = stackIn_12_0;
          if (var6 >= SoftwareRasterizer.clipBottom) {
            stackIn_15_0 = SoftwareRasterizer.clipBottom;
          } else {
            stackIn_15_0 = var6;
          }
          int var10 = stackIn_15_0;
          if (param2 >= SoftwareRasterizer.clipLeft &&
            param2 < SoftwareRasterizer.clipRight) {
            int var11 = param2 + SoftwareRasterizer.width * var8;
            int var12 = -var8 + (1 + var10) >> 1;
            while (true) {
              var12--;
              if (var12 < 0) {
                break;
              }
              SoftwareRasterizer.pixels[var11] = 16777215;
              var11 = var11 + SoftwareRasterizer.width * 2;
            }
          }
          if (param4 >= SoftwareRasterizer.clipTop &&
            var6 < SoftwareRasterizer.clipBottom) {
            int var11Lifetime1 = var7 + SoftwareRasterizer.width * param4;
            int var12Lifetime1 = -var7 + var9 + 1 >> 1;
            while (true) {
              var12Lifetime1--;
              if (0 > var12Lifetime1) {
                break;
              }
              SoftwareRasterizer.pixels[var11Lifetime1] = 16777215;
              var11Lifetime1 += 2;
            }
          }
          if (SoftwareRasterizer.clipLeft <= var5_int &&
            var5_int < SoftwareRasterizer.clipRight) {
            int var11Lifetime2 = SoftwareRasterizer.width * (var8 + (1 & var5_int - param2)) + var5_int;
            int var12Lifetime2 = 1 - (-var10 + var8) >> 1;
            while (true) {
              var12Lifetime2--;
              if (var12Lifetime2 < 0) {
                break;
              }
              SoftwareRasterizer.pixels[var11Lifetime2] = 16777215;
              var11Lifetime2 = var11Lifetime2 + 2 * SoftwareRasterizer.width;
            }
          }
          if (SoftwareRasterizer.clipTop <= param4 &&
            var6 < SoftwareRasterizer.clipBottom) {
            int var11Lifetime3 = var7 + var6 * SoftwareRasterizer.width + (1 & -param4 + var6);
            int var12Lifetime3 = -var7 + (var9 + 1) >> 1;
            while (true) {
              var12Lifetime3--;
              if (var12Lifetime3 < 0) {
                return;
              }
              SoftwareRasterizer.pixels[var11Lifetime3] = 16777215;
              var11Lifetime3 += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var5), "ic.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    SeekerMine() {
    }

    static {
        field_n = new int[]{23, 1, 2, 3, 4, 24, 6, 7, 9, 10};
        field_k = new String[]{"Welcome to the mothership's practice area.", "Press the 'UP' arrow to blast off. Easy does it.", "", "Now land again.", "Keep tapping the 'UP' arrow to limit your speed and land softly.", "", "Blast off and use the 'LEFT' and 'RIGHT' arrow keys to rotate your ship. Try thrusting in different directions.", "Your ship has momentum. To stop moving, thrust against the direction of movement.", "When you are comfortable and confident, proceed upwards.", "Use the 'LEFT' and 'RIGHT' arrow keys to rotate your ship. Try thrusting in different directions.", "Your ship has momentum. To stop moving, thrust against the direction of movement.", "When you are comfortable and confident, proceed upwards.", "Press 'SPACE' or 'SHIFT' to activate your shield. The mothership will power your shield for you.", "Warning: after you leave the mothership, you only have three seconds' worth of shield per level!", "", "Land next to the container to attach your tether.", "", "", "Now blast off, and keep the container away from any walls!", "Practise managing the container's momentum as well as your own in the auto-shield area.", "When you are ready to start the first mission, fly up and out into space.", "Shoot the barrier to open the exit.", "Press 'CTRL' to shoot.", "", "If you are ready to start the first mission, fly up and out into space.", "", "", "Practise managing the container's momentum as well as your own in the auto-shield area.", "When you are ready to start the first mission, fly up and out into space.", ""};
    }
}
