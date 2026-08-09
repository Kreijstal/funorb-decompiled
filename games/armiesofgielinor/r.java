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
        if (this.field_p) {
            var2 = 1;
        }
        if (this.field_r) {
            var2 = 2;
        }
        wk var3 = this.field_H[var2];
        if (param0 != 3) {
            this.n(-61);
        }
        return var3;
    }

    final boolean g(byte param0) {
        if (param0 != 97) {
            return false;
        }
        return this.field_z.d(false);
    }

    final boolean b(int param0, int param1, int param2) {
        int var4;
        int stackIn_9_0 = 0;
        L0: {
          if (param1 == 2) {
            break L0;
          } else {
            this.field_A = 9;
            break L0;
          }
        }
        if (!this.field_z.d(false)) {
          return this.a(param0, param1 ^ 84, param2);
        } else {
          L1: {
            var4 = 0;
            if (!this.c(param2, 0, param0)) {
              if (this.field_z.b(31127, param0, param2)) {
                stackIn_9_0 = 1;
                break L1;
              } else {
                stackIn_9_0 = 0;
                break L1;
              }
            } else {
              stackIn_9_0 = 1;
              break L1;
            }
          }
          var4 = stackIn_9_0;
          return var4 != 0;
        }
    }

    final void e(int param0, int param1, int param2) {
        this.field_A = param1;
        int var4 = 79 % ((param0 - 15) / 32);
        this.field_K = param2;
        this.field_z.a(param1, 112, param2);
    }

    final int e(boolean param0) {
        if (!param0) {
            field_J = (String) null;
        }
        return this.field_o;
    }

    final boolean g(int param0) {
        int stackIn_7_0 = 0;
        if (param0 == 260) {
          L0: {
            L1: {
              if (this.field_F) {
                break L1;
              } else {
                if (!this.field_z.D(85)) {
                  stackIn_7_0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackIn_7_0 = 1;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return true;
        }
    }

    final void e(int param0) {
        this.field_F = false;
        if (param0 != 32) {
            return;
        }
        this.field_z.e(true);
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
            this.field_F = true;
        }
        this.field_L = param1;
    }

    final boolean a(byte param0) {
        if (param0 <= 72) {
            field_w = (String) null;
        }
        return this.field_x;
    }

    private final void a(int param0, boolean param1) {
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var3 = 114 / ((44 - param0) / 34);
        this.field_x = false;
        if (this.field_F) {
            if (!param1) {
            } else {
                if (this.field_z.r(-37)) {
                    this.field_L = this.field_z.b(78);
                    this.field_r = false;
                    this.field_z.l(0);
                    this.m(10009);
                    this.field_x = true;
                } else {
                    if (!this.field_p) {
                    } else {
                        this.field_r = !this.field_r ? true : false;
                        if (this.field_r) {
                            this.field_z.c(56);
                        } else {
                            this.field_z.l(0);
                        }
                        if (!this.field_r) {
                            this.field_z.a(0, (byte) 39);
                        }
                        this.field_x = true;
                    }
                }
            }
        }
        if (!this.field_F) {
            if (this.field_z.d(false)) {
                if (!(!param1)) {
                    this.field_z.l(0);
                    this.field_x = true;
                    this.field_r = false;
                }
            }
            return;
        }
    }

    private final void f(int param0) {
        if (!this.field_r) {
            return;
        }
        this.field_z.e(6815);
        if (param0 != 4) {
            this.e((byte) -72);
            return;
        }
    }

    private final void h(byte param0) {
        this.field_y = true;
        this.i(0);
        this.d(false);
        if (param0 != -120) {
            this.field_K = 118;
            return;
        }
    }

    final boolean c(int param0, int param1, int param2) {
        if (param1 != 0) {
            this.h((byte) -118);
        }
        return this.field_z.a(param0, (byte) 113, param2) >= 0 ? true : false;
    }

    final void a(String[] param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -29799) {
              this.field_z.a((byte) 126, param0);
              this.i(0);
              this.d(false);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("r.V(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void e(byte param0) {
        int var2 = this.field_D[3].field_A;
        int var3 = this.field_C.a(' ');
        int var4 = this.field_A - (-var2 - var3);
        int var5 = this.field_D[1].field_x;
        if (param0 != 108) {
            this.field_L = -29;
        }
        int var6 = 2;
        int var7 = this.field_C.field_H;
        int var8 = var5 + (this.field_K - (-var6 + -var7));
        int var9 = this.field_q[0];
        if (!(!this.field_r)) {
            var9 = this.field_q[2];
        }
        if (this.field_p) {
            var9 = this.field_q[1];
        }
        String var10 = this.field_z.a((byte) -96, this.field_L);
        this.field_C.b(var10, var4, var8, var9, -1);
    }

    final int h(int param0) {
        if (param0 != 5) {
            field_v = (je) null;
        }
        return this.field_L;
    }

    final static void c(boolean param0) {
        Object var1 = null;
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var1 = va.field_w;
            synchronized (var1) {
              L1: {
                L2: {
                  be.field_E = rd.field_d;
                  if (param0) {
                    break L2;
                  } else {
                    r.d((byte) 47);
                    break L2;
                  }
                }
                L3: {
                  fc.field_b = fc.field_b + 1;
                  if ((us.field_c ^ -1) <= -1) {
                    L4: while (true) {
                      if (cc.field_a == us.field_c) {
                        break L3;
                      } else {
                        var2 = ee.field_x[cc.field_a];
                        cc.field_a = 127 & 1 + cc.field_a;
                        if (0 > var2) {
                          br.field_f[var2 ^ -1] = false;
                          continue L4;
                        } else {
                          br.field_f[var2] = true;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    var2 = 0;
                    L5: while (true) {
                      if (var2 >= 112) {
                        us.field_c = cc.field_a;
                        break L3;
                      } else {
                        br.field_f[var2] = false;
                        var2++;
                        continue L5;
                      }
                    }
                  }
                }
                rd.field_d = cr.field_Z;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1_ref), "r.G(" + param0 + ')');
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
        return mo.a(param2, this.field_A, this.field_K, param0, this.field_t, (byte) -99, this.field_o);
    }

    final void j(int param0) {
        if (param0 != 0) {
            return;
        }
        this.field_F = true;
        this.field_z.g(83);
    }

    final int n(int param0) {
        if (param0 != -18332) {
            this.field_A = -93;
        }
        return this.field_t;
    }

    private final void d(boolean param0) {
        this.m(10009);
        if (param0) {
            return;
        }
    }

    private final void c(byte param0) {
        wk var2 = this.k(3);
        int var3 = this.field_D[5].field_A;
        int var4 = var2.field_A;
        int var5 = -var3 + this.field_A - (-this.field_t - -var4);
        int var6 = this.field_D[1].field_x;
        if (param0 != -36) {
            return;
        }
        int var7 = var6 + this.field_K;
        var2.g(var5, var7);
    }

    private final void d(int param0, int param1, int param2) {
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        L0: {
          this.field_p = false;
          if (param2 == 4) {
            break L0;
          } else {
            this.e(false);
            break L0;
          }
        }
        if (!this.field_F) {
          return;
        } else {
          L1: {
            L2: {
              stackIn_8_0 = this;

              if (!this.a(param1, param2 ^ -82, param0)) {
                break L2;
              } else {
                stackIn_8_0 = this;

                if (this.g((byte) 97)) {
                  break L2;
                } else {
                  stackIn_9_0 = this;
                  stackIn_9_1 = 1;
                  break L1;
                }
              }
            }
            stackIn_9_0 = this;
            stackIn_9_1 = 0;
            break L1;
          }
          ((r) (this)).field_p = stackIn_9_1 != 0;
          return;
        }
    }

    private final void b(boolean param0) {
        qn.f(this.field_A, this.field_K, this.field_t, this.field_o, 7829367);
        i.a(this.field_D, this.field_o, this.field_A, (byte) -47, this.field_K, this.field_t);
        if (param0) {
            this.field_q = (int[]) null;
        }
        this.e((byte) 108);
        this.c((byte) -36);
    }

    final void a(boolean param0, int param1, int param2, int param3, boolean param4, int param5) {
        if (!(this.field_y)) {
            this.i(param1 ^ -18596);
            return;
        }
        this.d(param2, param3, 4);
        this.field_z.a(param2, param4, param0, 0, param3, param5);
        this.a(-34, param0);
        if (param1 != -18596) {
            this.field_K = -86;
            return;
        }
    }

    private final void i(int param0) {
        this.field_L = 0;
        this.field_z.a(param0, (byte) 46);
        this.field_p = false;
        this.field_r = false;
    }

    final static Boolean l(int param0) {
        if (param0 != -11506) {
            field_G = (String) null;
        }
        Boolean var1 = cv.field_s;
        cv.field_s = null;
        return var1;
    }

    r(wk[] param0, wk[] param1, tu param2, int[] param3, String[] param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_D = param0;
            this.field_H = param1;
            this.field_q = param3;
            this.field_C = param2;
            this.field_z = new ng(param0, param1, param2, param3, param4, param5, param6);
            this.e(-20, param5, param6);
            this.h((byte) -120);
            this.e(32);
            this.field_x = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var8);

            stackIn_5_1 = new StringBuilder().append("r.<init>(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param4 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), stackIn_18_2 + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final void m(int param0) {
        int stackIn_7_0 = 0;
        int var2;
        int var3;
        int var4;
        String var4_ref_String;
        wk var5;
        int var5_int;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (this.field_z.u(117) <= var3) {
            var3 = this.field_C.a(' ') << 1720058209;
            if (param0 == 10009) {
              L1: {
                var4 = this.field_D[3].field_A - -this.field_D[5].field_A;
                var5 = this.k(3);
                var6 = var5.field_A;
                this.field_t = var6 + var4 + var2 - -var3;
                var7 = this.field_C.field_L + this.field_C.field_H;
                var8 = 4;
                var9 = var5.field_x;
                this.field_o = var8 + var7;
                if (var9 > this.field_o) {
                  this.field_o = var9;
                  break L1;
                } else {
                  break L1;
                }
              }
              var10 = this.field_D[7].field_x + this.field_D[1].field_x;
              this.field_o = var10 + this.field_o;
              return;
            } else {
              return;
            }
          } else {
            L2: {
              var4_ref_String = this.field_z.a((byte) -126, var3);
              var5_int = this.field_C.a(var4_ref_String);
              if ((var2 ^ -1) <= (var5_int ^ -1)) {
                stackIn_7_0 = var2;
                break L2;
              } else {
                stackIn_7_0 = var5_int;
                break L2;
              }
            }
            var2 = stackIn_7_0;
            var3++;
            continue L0;
          }
        }
    }

    static {
        field_J = "It's a Draw!";
        field_G = "To configure your coat of arms, please log in or create a free account.";
        field_E = new String[]{"Ah, there you are. After your success at Eastbridge, I thought you could use some training in specialist equipment. Rest assured that the items used in this tutorial or in hotseat mode will not be taken from your stock.", "If you click on the equipment icon beside the game statistics it will open up the equipment menu.", "Please pick your gods before we begin the tutorial.", "So, your first bit of kit is called <%0>. <%1> <%2>", "Next on the roster you have <%0>. <%1> <%2>", "In the middle there you see the icon for <%0>. <%1> <%2>", "Okay, here we have <%0>. <%1> <%2>", "And last but not least, you've got <%0>. <%1> <%2>", "Now that you have selected this item, click on the enemy unit you wish to use it on. If you wish to cancel, simply click the right mouse button.", "Now that you have selected this item, click on the allied unit you wish to use it on. If you wish to cancel, simply click the right mouse button.", "Now that you have selected this item, click on a village you've captured. If you wish to cancel, simply click the right mouse button.", "Now that you have selected this item, click on an enemy-occupied tower or village. Don't click on a portal, though - it's hard to cause civil unrest in a random explosion of magical particles. If you wish to cancel for now, simply click the right mouse button.", "Now that you have selected this item, click on the tile you wish to use it on. If you wish to cancel for now, simply click the right mouse button.", "Now that you have selected this item, click on the area you wish to use it on. If you wish to cancel for now, simply click the right mouse button.", "Now that you have selected this item, click where you want to build a bridge. This should be a tile of water with shore on only one side, so the bridge knows which way to unfurl. If you wish to cancel for now, simply click the right mouse button.", "Now that you have selected this item, click on an area containing bones. These bones will become your army of the undead. If you wish to cancel for now, simply click the right mouse button.", "Now that you have selected this item, click on the flying unit you wish to use it on. If you wish to cancel for now, simply click the right mouse button.", "Now that you have selected this item, click on a cyclops. If you don't have one, I'll wait for you to teleport one in. If you wish to cancel for now, simply click the right mouse button.", "Now that you have selected this item, click on a Kalphite Queen. If you don't have one, I'll wait for you to teleport one in. If you wish to cancel for now, simply click the right mouse button.", "Now that you have selected this item, click on a goblin priest. If you don't have one, I'll wait for you to teleport one in. If you wish to cancel for now, simply click the right mouse button.", "Now that you have selected this item, click on an ogre shaman. If you don't have one, I'll wait for you to teleport one in. If you wish to cancel for now, simply click the right mouse button.", "Now that you have selected this item, click on an elf songstress. If you don't have one, I'll wait for you to teleport one in. If you wish to cancel for now, simply click the right mouse button.", "You can use this item right now. Just click the icon for <%0> and you'll see.", "You seem to have brought a shrine spell into battle for a god you aren't actually worshipping. Let's move swiftly on, shall we?", "You seem to have left some empty space in your equipment setup. You don't have to purchase equipment to be trained in it, simply equip it and you can try it here for free. Let's move swiftly on, shall we?", "This item can only be used on a unit that follows a god you have not selected. Let's move on to the next item, shall we?", "To activate this, you must first click on the <%0> icon.", "<%0> In a real battle you can only use each of these items once, but for training purposes I've provided an unlimited supply.", "There you go. Feel free to experiment with this item before moving on.", "As you can see, your unit now has a new movement area highlighted. When you order this unit to move within this area, the item will be used.", "Well, that's your equipment training complete. You're always welcome to return here with different equipment for another lesson.", "Ah, I see you brought more than one <%0>. I've already instructed you in how to use it, so we'll move on when you're ready.", "Oops, you seem to have clicked a different piece of equipment. Let's try again. <%0>", "Oops, you seem to have deselected this equipment. Let's try again. <%0>"};
        field_I = "Biggest bully";
        field_B = 2;
        field_w = "Magic robes";
    }
}
