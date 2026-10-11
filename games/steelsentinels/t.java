/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t {
    private dc field_a;
    static int field_h;
    static int field_k;
    static String[] field_b;
    static int[] field_d;
    static String[] field_e;
    static String field_j;
    static RgbSprite[] field_i;
    static String field_g;
    static dk field_c;
    private km[] field_f;
    static int field_l;

    final static boolean a(int[] param0, int param1, int param2) {
        RuntimeException var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -20370) {
            field_g = (String) null;
          }
          stackIn_5_0 = ((param0[param1 >> 5] & 1 << (param1 & 31)) != 0);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("t.D(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_j = null;
        field_i = null;
        field_c = null;
        field_g = null;
        field_e = null;
        field_b = null;
        field_d = null;
        if (param0 != -13375) {
          int[] var2 = (int[]) null;
          t.a((int[]) null, 115, -8);
        }
    }

    final static void a(byte param0, int param1, boolean param2, int param3) {
        if (param0 > 121) {
          ad.a(param2, (byte) -76);
          rh.a(param3, param2, param1, 635);
          return;
        }
        field_i = (RgbSprite[]) null;
        ad.a(param2, (byte) -76);
        rh.a(param3, param2, param1, 635);
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          java.applet.Applet var3 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              if (!param0) {
                var3 = (java.applet.Applet) null;
                t.a(true, (java.applet.Applet) null);
              }
              var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
              param1.getAppletContext().showDocument(ge.a(0, var2, param1), "_top");
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("t.E(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw ci.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, byte param1, int param2, String param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 >= 0 &&
            this.field_f.length > param2) {
            if (param0 >= 0 &&
              this.field_a.field_e.length > param0) {
              this.field_f[param2].field_b[param0] = param3;
              if (param1 <= 119) {
                field_b = (String[]) null;
              }
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_12_0 = runtimeException;
          stackIn_12_1 = new StringBuilder().append("t.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private t() throws Throwable {
        throw new Error();
    }

    static {
        field_h = -1;
        field_e = new String[]{"Golem chassis", "Visor head", "Articulated arm", "Shoulder pack", null, null, null, null, null, null, null, null, null, null, null, null, null, "Flak repeater", "Minigun", "Fire bomb launcher", "Gauss gun", "Pulse laser", "Plasma spray", "Rapier missile", "Piercer rocket", "EMP rocket", "Airburst rocket", "Electron cannon", "Flak cannon", "Heavy gun", "Heavy cannon", "Mortar", "Rifled sniper cannon", "Rail repeater", "Laser beam", "Plasma cannon", "Multirocket", "Heavy rocket", "Lightning cannon", null, null, null, "Air mine rocket", "Ultra gun", "Doomsday cannon", "Howitzer", "Rail cannon", "Solaris laser", "Fusion cannon", "DEATH nuke", "Destructor rocket", "Air death missile", "EMP cannon", "Shield head", "Heavy mounting", "Slave chassis", "Armoured arm", "Aquila chassis", "Razor arm", "Gravity nullifier", "Scout head", "Tactical maw", "Turtle chassis", null, "Oracle head", "Commando chassis", "Thunder-blade arm", "Light shoulder pack", "Reticulan head", "Hurricane chassis", "Multipack arm", "Turret mounting", "Scorpion chassis", "Expanded pack", "Croc head", "Crusher chassis", "Stormhammer arm", "Jump jet", "Minotaur head", "Bertha chassis", "Titanic rocket pod", "Heavy shoulder pack", "Samurai head", "Dual mounting", "Orbital chassis", "Orion arm", "Atmospheric wing", "Sinistar head", "Valhalla chassis", "Fusion blade arm", "Ordnance mounting", "Predator head", "Babel chassis", "Arm of Gilgamesh", null, "Doom's visage"};
        field_g = "Chat view has been scrolled up. Scroll down to chat.";
        field_j = "Invite <%0> to this game";
        field_l = -1;
        field_d = new int[]{1, 0, 5, 6, 7, 9, 11, 13, 14, 15, 10, 1, 0, 2, 4, 3, 6, 7, 9, 16, 17, 10, 20, 20, 20, 20, 0, 2, 4, 6, 8, 9, 19, 18, 12, 8};
    }
}
