/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r extends vt {
    private ng field_z;
    private boolean field_p;
    static String field_G;
    static int field_B;
    private boolean field_F;
    private wk[] field_H;
    private boolean field_r;
    static boolean field_s;
    private int field_L;
    private wk[] field_D;
    private int field_K;
    private int field_A;
    private int[] field_q;
    static String[] field_E;
    static String field_J;
    private int field_o;
    private boolean field_x;
    private int field_t;
    private boolean field_y;
    static int field_u;
    static String field_I;
    static je field_v;
    private tu field_C;
    static String field_w;

    private final wk k(int param0) {
        int var2 = 0;
        if (((r) this).field_p) {
            var2 = 1;
        }
        if (((r) this).field_r) {
            var2 = 2;
        }
        wk var3 = ((r) this).field_H[var2];
        if (param0 != 3) {
            int discarded$0 = ((r) this).n(-61);
        }
        return var3;
    }

    final boolean g(byte param0) {
        if (param0 != 97) {
            return false;
        }
        return ((r) this).field_z.d(false);
    }

    final boolean b(int param0, int param1, int param2) {
        int var4 = 0;
        int stackIn_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          if (param1 == 2) {
            break L0;
          } else {
            ((r) this).field_A = 9;
            break L0;
          }
        }
        if (!((r) this).field_z.d(false)) {
          return ((r) this).a(param0, param1 ^ 84, param2);
        } else {
          L1: {
            var4 = 0;
            if (!((r) this).c(param2, 0, param0)) {
              if (((r) this).field_z.b(31127, param0, param2)) {
                stackOut_7_0 = 1;
                stackIn_9_0 = stackOut_7_0;
                break L1;
              } else {
                stackOut_6_0 = 0;
                stackIn_9_0 = stackOut_6_0;
                break L1;
              }
            } else {
              stackOut_4_0 = 1;
              stackIn_9_0 = stackOut_4_0;
              break L1;
            }
          }
          var4 = stackIn_9_0;
          return var4 != 0;
        }
    }

    final void e(int param0, int param1, int param2) {
        ((r) this).field_A = param1;
        int var4 = 79 % ((param0 - 15) / 32);
        ((r) this).field_K = param2;
        ((r) this).field_z.a(param1, 112, param2);
    }

    final int e(boolean param0) {
        if (!param0) {
            field_J = null;
        }
        return ((r) this).field_o;
    }

    final boolean g(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 260) {
          L0: {
            L1: {
              if (((r) this).field_F) {
                break L1;
              } else {
                if (!((r) this).field_z.D(85)) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 1;
            stackIn_7_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return true;
        }
    }

    final void e(int param0) {
        ((r) this).field_F = false;
        if (param0 != 32) {
            return;
        }
        ((r) this).field_z.e(true);
    }

    final static boolean c(int param0, int param1) {
        if (param1 != 2) {
            return true;
        }
        return 2 <= param0 ? true : false;
    }

    final void f(byte param0) {
        this.b(false);
        this.f(4);
        int var2 = -124 % ((75 - param0) / 49);
    }

    final void b(int param0, int param1) {
        if (param0 != 0) {
            ((r) this).field_F = true;
        }
        ((r) this).field_L = param1;
    }

    final boolean a(byte param0) {
        if (param0 <= 72) {
            field_w = null;
        }
        return ((r) this).field_x;
    }

    private final void a(int param0, boolean param1) {
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var3 = 114 / ((44 - param0) / 34);
        ((r) this).field_x = false;
        if (((r) this).field_F) {
            if (!param1) {
            } else {
                if (((r) this).field_z.r(-37)) {
                    ((r) this).field_L = ((r) this).field_z.b(78);
                    ((r) this).field_r = false;
                    ((r) this).field_z.l(0);
                    this.m(10009);
                    ((r) this).field_x = true;
                } else {
                    if (!((r) this).field_p) {
                    } else {
                        ((r) this).field_r = !((r) this).field_r ? true : false;
                        if (((r) this).field_r) {
                            ((r) this).field_z.c(56);
                        } else {
                            ((r) this).field_z.l(0);
                        }
                        if (!((r) this).field_r) {
                            ((r) this).field_z.a(0, (byte) 39);
                        }
                        ((r) this).field_x = true;
                    }
                }
            }
        }
        if (!((r) this).field_F) {
            if (((r) this).field_z.d(false)) {
                if (!(!param1)) {
                    ((r) this).field_z.l(0);
                    ((r) this).field_x = true;
                    ((r) this).field_r = false;
                }
            }
            return;
        }
    }

    private final void f(int param0) {
        if (!((r) this).field_r) {
            return;
        }
        ((r) this).field_z.e(6815);
        if (param0 != 4) {
            this.e((byte) -72);
            return;
        }
    }

    private final void h(byte param0) {
        ((r) this).field_y = true;
        this.i(0);
        this.d(false);
        if (param0 != -120) {
            ((r) this).field_K = 118;
            return;
        }
    }

    final boolean c(int param0, int param1, int param2) {
        if (param1 != 0) {
            this.h((byte) -118);
        }
        return ((r) this).field_z.a(param0, (byte) 113, param2) >= 0 ? true : false;
    }

    final void a(String[] param0, int param1) {
        if (param1 != -29799) {
            return;
        }
        ((r) this).field_z.a((byte) 126, param0);
        this.i(0);
        this.d(false);
    }

    private final void e(byte param0) {
        int var2 = ((r) this).field_D[3].field_A;
        int var3 = ((r) this).field_C.a(' ');
        int var4 = ((r) this).field_A - (-var2 - var3);
        int var5 = ((r) this).field_D[1].field_x;
        if (param0 != 108) {
            ((r) this).field_L = -29;
        }
        int var6 = 2;
        int var7 = ((r) this).field_C.field_H;
        int var8 = var5 + (((r) this).field_K - (-var6 + -var7));
        int var9 = ((r) this).field_q[0];
        if (!(!((r) this).field_r)) {
            var9 = ((r) this).field_q[2];
        }
        if (((r) this).field_p) {
            var9 = ((r) this).field_q[1];
        }
        String var10 = ((r) this).field_z.a((byte) -96, ((r) this).field_L);
        ((r) this).field_C.b(var10, var4, var8, var9, -1);
    }

    final int h(int param0) {
        if (param0 != 5) {
            field_v = null;
        }
        return ((r) this).field_L;
    }

    final static void c(boolean param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = ArmiesOfGielinor.field_M ? 1 : 0;
                    var1 = (Object) (Object) va.field_w;
                    // monitorenter va.field_w
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        be.field_E = rd.field_d;
                        if (param0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        r.d((byte) 47);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        fc.field_b = fc.field_b + 1;
                        if ((us.field_c ^ -1) <= -1) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var2 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var2 >= 112) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        br.field_f[var2] = false;
                        var2++;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        us.field_c = cc.field_a;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (cc.field_a == us.field_c) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var2 = ee.field_x[cc.field_a];
                        cc.field_a = 127 & 1 + cc.field_a;
                        if (0 > var2) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        br.field_f[var2] = true;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        br.field_f[var2 ^ -1] = false;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        rd.field_d = cr.field_Z;
                        // monitorexit var1
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var3 = caughtException;
                        // monitorexit var1
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 15: {
                    throw (RuntimeException) (Object) var3;
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void d(byte param0) {
        field_E = null;
        if (param0 != -11) {
            return;
        }
        field_J = null;
        field_I = null;
        field_w = null;
        field_G = null;
        field_v = null;
    }

    final boolean a(int param0, int param1, int param2) {
        int var4 = -56 % ((17 - param1) / 60);
        return mo.a(param2, ((r) this).field_A, ((r) this).field_K, param0, ((r) this).field_t, (byte) -99, ((r) this).field_o);
    }

    final void j(int param0) {
        if (param0 != 0) {
            return;
        }
        ((r) this).field_F = true;
        ((r) this).field_z.g(83);
    }

    final int n(int param0) {
        if (param0 != -18332) {
            ((r) this).field_A = -93;
        }
        return ((r) this).field_t;
    }

    private final void d(boolean param0) {
        this.m(10009);
        if (param0) {
            return;
        }
    }

    private final void c(byte param0) {
        wk var2 = this.k(3);
        int var3 = ((r) this).field_D[5].field_A;
        int var4 = var2.field_A;
        int var5 = -var3 + ((r) this).field_A - (-((r) this).field_t - -var4);
        int var6 = ((r) this).field_D[1].field_x;
        if (param0 != -36) {
            return;
        }
        int var7 = var6 + ((r) this).field_K;
        var2.g(var5, var7);
    }

    private final void d(int param0, int param1, int param2) {
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_6_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        L0: {
          ((r) this).field_p = false;
          if (param2 == 4) {
            break L0;
          } else {
            int discarded$2 = ((r) this).e(false);
            break L0;
          }
        }
        if (!((r) this).field_F) {
          return;
        } else {
          L1: {
            L2: {
              stackOut_5_0 = this;
              stackIn_8_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (!((r) this).a(param1, param2 ^ -82, param0)) {
                break L2;
              } else {
                stackOut_6_0 = this;
                stackIn_8_0 = stackOut_6_0;
                stackIn_7_0 = stackOut_6_0;
                if (((r) this).g((byte) 97)) {
                  break L2;
                } else {
                  stackOut_7_0 = this;
                  stackOut_7_1 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  break L1;
                }
              }
            }
            stackOut_8_0 = this;
            stackOut_8_1 = 0;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            break L1;
          }
          ((r) this).field_p = stackIn_9_1 != 0;
          return;
        }
    }

    private final void b(boolean param0) {
        qn.f(((r) this).field_A, ((r) this).field_K, ((r) this).field_t, ((r) this).field_o, 7829367);
        i.a(((r) this).field_D, ((r) this).field_o, ((r) this).field_A, (byte) -47, ((r) this).field_K, ((r) this).field_t);
        if (param0) {
            ((r) this).field_q = null;
        }
        this.e((byte) 108);
        this.c((byte) -36);
    }

    final void a(boolean param0, int param1, int param2, int param3, boolean param4, int param5) {
        if (!(((r) this).field_y)) {
            this.i(param1 ^ -18596);
            return;
        }
        this.d(param2, param3, 4);
        ((r) this).field_z.a(param2, param4, param0, 0, param3, param5);
        this.a(-34, param0);
        if (param1 != -18596) {
            ((r) this).field_K = -86;
            return;
        }
    }

    private final void i(int param0) {
        ((r) this).field_L = 0;
        ((r) this).field_z.a(param0, (byte) 46);
        ((r) this).field_p = false;
        ((r) this).field_r = false;
    }

    final static Boolean l(int param0) {
        if (param0 != -11506) {
            field_G = null;
        }
        Boolean var1 = cv.field_s;
        cv.field_s = null;
        return var1;
    }

    r(wk[] param0, wk[] param1, tu param2, int[] param3, String[] param4, int param5, int param6) {
        ((r) this).field_D = param0;
        ((r) this).field_H = param1;
        ((r) this).field_q = param3;
        ((r) this).field_C = param2;
        ((r) this).field_z = new ng(param0, param1, param2, param3, param4, param5, param6);
        ((r) this).e(-20, param5, param6);
        this.h((byte) -120);
        ((r) this).e(32);
        ((r) this).field_x = false;
    }

    private final void m(int param0) {
        int var3 = 0;
        String var4_ref = null;
        int var5_int = 0;
        int var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var2 = 0;
        for (var3 = 0; ((r) this).field_z.u(117) > var3; var3++) {
            var4_ref = ((r) this).field_z.a((byte) -126, var3);
            var5_int = ((r) this).field_C.a(var4_ref);
            var2 = var2 < var5_int ? var5_int : var2;
        }
        var3 = ((r) this).field_C.a(' ') << 1720058209;
        if (param0 != 10009) {
            return;
        }
        int var4 = ((r) this).field_D[3].field_A - -((r) this).field_D[5].field_A;
        wk var5 = this.k(3);
        int var6 = var5.field_A;
        ((r) this).field_t = var6 + var4 + var2 - -var3;
        int var7 = ((r) this).field_C.field_L + ((r) this).field_C.field_H;
        int var8 = 4;
        int var9 = var5.field_x;
        ((r) this).field_o = var8 + var7;
        if (!(var9 <= ((r) this).field_o)) {
            ((r) this).field_o = var9;
        }
        int var10 = ((r) this).field_D[7].field_x + ((r) this).field_D[1].field_x;
        ((r) this).field_o = var10 + ((r) this).field_o;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "It's a Draw!";
        field_G = "To configure your coat of arms, please log in or create a free account.";
        field_E = new String[]{"Ah, there you are. After your success at Eastbridge, I thought you could use some training in specialist equipment. Rest assured that the items used in this tutorial or in hotseat mode will not be taken from your stock.", "If you click on the equipment icon beside the game statistics it will open up the equipment menu.", "Please pick your gods before we begin the tutorial.", "So, your first bit of kit is called <%0>. <%1> <%2>", "Next on the roster you have <%0>. <%1> <%2>", "In the middle there you see the icon for <%0>. <%1> <%2>", "Okay, here we have <%0>. <%1> <%2>", "And last but not least, you've got <%0>. <%1> <%2>", "Now that you have selected this item, click on the enemy unit you wish to use it on. If you wish to cancel, simply click the right mouse button.", "Now that you have selected this item, click on the allied unit you wish to use it on. If you wish to cancel, simply click the right mouse button.", "Now that you have selected this item, click on a village you've captured. If you wish to cancel, simply click the right mouse button.", "Now that you have selected this item, click on an enemy-occupied tower or village. Don't click on a portal, though - it's hard to cause civil unrest in a random explosion of magical particles. If you wish to cancel for now, simply click the right mouse button.", "Now that you have selected this item, click on the tile you wish to use it on. If you wish to cancel for now, simply click the right mouse button.", "Now that you have selected this item, click on the area you wish to use it on. If you wish to cancel for now, simply click the right mouse button.", "Now that you have selected this item, click where you want to build a bridge. This should be a tile of water with shore on only one side, so the bridge knows which way to unfurl. If you wish to cancel for now, simply click the right mouse button.", "Now that you have selected this item, click on an area containing bones. These bones will become your army of the undead. If you wish to cancel for now, simply click the right mouse button.", "Now that you have selected this item, click on the flying unit you wish to use it on. If you wish to cancel for now, simply click the right mouse button.", "Now that you have selected this item, click on a cyclops. If you don't have one, I'll wait for you to teleport one in. If you wish to cancel for now, simply click the right mouse button.", "Now that you have selected this item, click on a Kalphite Queen. If you don't have one, I'll wait for you to teleport one in. If you wish to cancel for now, simply click the right mouse button.", "Now that you have selected this item, click on a goblin priest. If you don't have one, I'll wait for you to teleport one in. If you wish to cancel for now, simply click the right mouse button.", "Now that you have selected this item, click on an ogre shaman. If you don't have one, I'll wait for you to teleport one in. If you wish to cancel for now, simply click the right mouse button.", "Now that you have selected this item, click on an elf songstress. If you don't have one, I'll wait for you to teleport one in. If you wish to cancel for now, simply click the right mouse button.", "You can use this item right now. Just click the icon for <%0> and you'll see.", "You seem to have brought a shrine spell into battle for a god you aren't actually worshipping. Let's move swiftly on, shall we?", "You seem to have left some empty space in your equipment setup. You don't have to purchase equipment to be trained in it, simply equip it and you can try it here for free. Let's move swiftly on, shall we?", "This item can only be used on a unit that follows a god you have not selected. Let's move on to the next item, shall we?", "To activate this, you must first click on the <%0> icon.", "<%0> In a real battle you can only use each of these items once, but for training purposes I've provided an unlimited supply.", "There you go. Feel free to experiment with this item before moving on.", "As you can see, your unit now has a new movement area highlighted. When you order this unit to move within this area, the item will be used.", "Well, that's your equipment training complete. You're always welcome to return here with different equipment for another lesson.", "Ah, I see you brought more than one <%0>. I've already instructed you in how to use it, so we'll move on when you're ready.", "Oops, you seem to have clicked a different piece of equipment. Let's try again. <%0>", "Oops, you seem to have deselected this equipment. Let's try again. <%0>"};
        field_I = "Biggest bully";
        field_B = 2;
        field_w = "Magic robes";
    }
}
