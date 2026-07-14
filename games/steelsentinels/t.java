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
    static wk[] field_i;
    static String field_g;
    static dk field_c;
    private km[] field_f;
    static int field_l;

    final static boolean a(int[] param0, int param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param2 != -20370) {
          L0: {
            field_g = null;
            if ((param0[param1 >> -1208907195] & 1 << (param1 & 31)) == 0) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((param0[param1 >> -1208907195] & 1 << (param1 & 31)) == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
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
            Object var2 = null;
            boolean discarded$0 = t.a((int[]) null, 115, -8);
        }
    }

    final static void a(byte param0, int param1, boolean param2, int param3) {
        if (param0 <= 121) {
          field_i = null;
          ad.a(param2, (byte) -76);
          rh.a(param3, param2, param1, 635);
          return;
        } else {
          ad.a(param2, (byte) -76);
          rh.a(param3, param2, param1, 635);
          return;
        }
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            try {
                if (!param0) {
                    Object var3 = null;
                    t.a(true, (java.applet.Applet) null);
                }
                var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
                param1.getAppletContext().showDocument(ge.a(0, var2, param1), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, byte param1, int param2, String param3) {
        if ((param2 ^ -1) <= -1) {
          if (((t) this).field_f.length > param2) {
            if (param0 >= 0) {
              if (((t) this).field_a.field_e.length <= param0) {
                return;
              } else {
                L0: {
                  ((t) this).field_f[param2].field_b[param0] = param3;
                  if (param1 > 119) {
                    break L0;
                  } else {
                    field_b = null;
                    break L0;
                  }
                }
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private t() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = -1;
        field_e = new String[]{"Golem chassis", "Visor head", "Articulated arm", "Shoulder pack", null, null, null, null, null, null, null, null, null, null, null, null, null, "Flak repeater", "Minigun", "Fire bomb launcher", "Gauss gun", "Pulse laser", "Plasma spray", "Rapier missile", "Piercer rocket", "EMP rocket", "Airburst rocket", "Electron cannon", "Flak cannon", "Heavy gun", "Heavy cannon", "Mortar", "Rifled sniper cannon", "Rail repeater", "Laser beam", "Plasma cannon", "Multirocket", "Heavy rocket", "Lightning cannon", null, null, null, "Air mine rocket", "Ultra gun", "Doomsday cannon", "Howitzer", "Rail cannon", "Solaris laser", "Fusion cannon", "DEATH nuke", "Destructor rocket", "Air death missile", "EMP cannon", "Shield head", "Heavy mounting", "Slave chassis", "Armoured arm", "Aquila chassis", "Razor arm", "Gravity nullifier", "Scout head", "Tactical maw", "Turtle chassis", null, "Oracle head", "Commando chassis", "Thunder-blade arm", "Light shoulder pack", "Reticulan head", "Hurricane chassis", "Multipack arm", "Turret mounting", "Scorpion chassis", "Expanded pack", "Croc head", "Crusher chassis", "Stormhammer arm", "Jump jet", "Minotaur head", "Bertha chassis", "Titanic rocket pod", "Heavy shoulder pack", "Samurai head", "Dual mounting", "Orbital chassis", "Orion arm", "Atmospheric wing", "Sinistar head", "Valhalla chassis", "Fusion blade arm", "Ordnance mounting", "Predator head", "Babel chassis", "Arm of Gilgamesh", null, "Doom's visage"};
        field_g = "Chat view has been scrolled up. Scroll down to chat.";
        field_j = "Invite <%0> to this game";
        field_l = -1;
        field_d = new int[]{1, 0, 5, 6, 7, 9, 11, 13, 14, 15, 10, 1, 0, 2, 4, 3, 6, 7, 9, 16, 17, 10, 20, 20, 20, 20, 0, 2, 4, 6, 8, 9, 19, 18, 12, 8};
    }
}
