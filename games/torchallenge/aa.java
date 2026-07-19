/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa {
    static volatile int field_a;
    private int field_d;
    private w[] field_i;
    private long field_e;
    static ka[] field_k;
    static String field_c;
    static int field_f;
    static String[][] field_h;
    private w field_j;
    static String field_b;
    static int field_g;

    final w a(boolean param0, long param1) {
        w var4 = null;
        w var5 = null;
        int var6 = 0;
        var6 = TorChallenge.field_F ? 1 : 0;
        this.field_e = param1;
        var4 = this.field_i[(int)((long)(this.field_d - 1) & param1)];
        this.field_j = var4.field_k;
        L0: while (true) {
          if (this.field_j == var4) {
            this.field_j = null;
            if (param0) {
              return null;
            } else {
              aa.a(-111);
              return null;
            }
          } else {
            if (param1 != this.field_j.field_l) {
              this.field_j = this.field_j.field_k;
              continue L0;
            } else {
              var5 = this.field_j;
              this.field_j = this.field_j.field_k;
              return var5;
            }
          }
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_h = (String[][]) null;
        field_b = null;
        field_k = null;
        if (param0 != 2432) {
            aa.a(-83, -115, 30, -114, -9, 120, 10, -28);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        var9 = TorChallenge.field_F ? 1 : 0;
        if (param5 != 0) {
          field_a = 117;
          if (param7 <= param6) {
            if (param6 >= param4) {
              if (param4 <= param7) {
                ni.a(param4, (byte) -83, param6, param3, param0, param7, qg.field_i, param2, param1);
                return;
              } else {
                ni.a(param7, (byte) 91, param6, param3, param2, param4, qg.field_i, param0, param1);
                return;
              }
            } else {
              ni.a(param7, (byte) 111, param4, param3, param1, param6, qg.field_i, param0, param2);
              return;
            }
          } else {
            if (param7 >= param4) {
              if (param6 >= param4) {
                ni.a(param4, (byte) -126, param7, param3, param1, param6, qg.field_i, param2, param0);
                return;
              } else {
                ni.a(param6, (byte) -75, param7, param3, param2, param4, qg.field_i, param1, param0);
                return;
              }
            } else {
              ni.a(param6, (byte) -55, param4, param3, param0, param7, qg.field_i, param1, param2);
              return;
            }
          }
        } else {
          if (param7 <= param6) {
            if (param6 >= param4) {
              if (param4 <= param7) {
                ni.a(param4, (byte) -83, param6, param3, param0, param7, qg.field_i, param2, param1);
                return;
              } else {
                ni.a(param7, (byte) 91, param6, param3, param2, param4, qg.field_i, param0, param1);
                return;
              }
            } else {
              ni.a(param7, (byte) 111, param4, param3, param1, param6, qg.field_i, param0, param2);
              return;
            }
          } else {
            if (param7 >= param4) {
              if (param6 >= param4) {
                ni.a(param4, (byte) -126, param7, param3, param1, param6, qg.field_i, param2, param0);
                return;
              } else {
                ni.a(param6, (byte) -75, param7, param3, param2, param4, qg.field_i, param1, param0);
                return;
              }
            } else {
              ni.a(param6, (byte) -55, param4, param3, param0, param7, qg.field_i, param1, param2);
              return;
            }
          }
        }
    }

    final w a(byte param0) {
        w var2 = null;
        w var3 = null;
        int var4 = 0;
        var4 = TorChallenge.field_F ? 1 : 0;
        if (null != this.field_j) {
          if (param0 > 122) {
            var2 = this.field_i[(int)((long)(this.field_d - 1) & this.field_e)];
            L0: while (true) {
              if (this.field_j != var2) {
                if ((this.field_e ^ -1L) != (this.field_j.field_l ^ -1L)) {
                  this.field_j = this.field_j.field_k;
                  continue L0;
                } else {
                  var3 = this.field_j;
                  this.field_j = this.field_j.field_k;
                  return var3;
                }
              } else {
                this.field_j = null;
                return null;
              }
            }
          } else {
            this.field_e = 17L;
            var2 = this.field_i[(int)((long)(this.field_d - 1) & this.field_e)];
            L1: while (true) {
              if (this.field_j != var2) {
                if ((this.field_e ^ -1L) != (this.field_j.field_l ^ -1L)) {
                  this.field_j = this.field_j.field_k;
                  continue L1;
                } else {
                  var3 = this.field_j;
                  this.field_j = this.field_j.field_k;
                  return var3;
                }
              } else {
                this.field_j = null;
                return null;
              }
            }
          }
        } else {
          return null;
        }
    }

    aa(int param0) {
        int var2 = 0;
        w dupTemp$0 = null;
        w var3 = null;
        this.field_i = new w[param0];
        this.field_d = param0;
        for (var2 = 0; param0 > var2; var2++) {
            dupTemp$0 = new w();
            var3 = dupTemp$0;
            this.field_i[var2] = dupTemp$0;
            var3.field_i = var3;
            var3.field_k = var3;
        }
    }

    final void a(long param0, w param1, int param2) {
        w var5 = null;
        try {
            if (param1.field_i != null) {
                param1.a(12695);
            }
            var5 = this.field_i[(int)(param0 & (long)(this.field_d + -1))];
            param1.field_k = var5;
            param1.field_i = var5.field_i;
            param1.field_i.field_k = param1;
            param1.field_l = param0;
            param1.field_k.field_i = param1;
            int var6 = 87 / ((35 - param2) / 63);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "aa.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_a = 0;
        field_c = "Use this alternative as your account name";
        field_h = new String[][]{new String[]{"Welcome to Tor Challenge! Use the <img=1> and <img=0> arrow keys to move to the next sign.", "You can press <img=3>, <img=5> or <img=4> to jump. Jump up to the next sign.", "Try jumping while holding the <img=0> arrow key to make it across this gap. Don't worry if you fall, just jump back to this sign and try again.", "Down these steps is a monster. Hold the <img=6> key to attack.", "This potion will restore one orb of health. You will only be able to pick this up when it is needed.", "Give your new skills a try by battling up these steps. Watch out for monsters and remember to press <img=6> to attack them.", "Watch out for holes! They usually lead to danger or earlier parts of the tower. Jump over this one by pressing <img=3>, <img=5> or <img=4>.", "This is a power seal. Your aim on each tower is to collect them all. If you die, you will start at the last seal you collected and regain your health.", "Jump over the hole by pressing <img=3>, <img=5> or <img=4>.", "Battle your way up this tower. You can attack while in the air by pressing <img=6>.", "Here is a second seal. Only three more to go.", "Watch out for the spitter above. It will shoot every few seconds. You can deflect its shots with an attack, but it is usually better to hit these from behind.", "At many stages in your quest you will have a choice on where to go.  Remember that exploration can be very rewarding!", "Do you see the large glowing door above you? This is the exit - it will take you to the next tower. The exit opens up when you've collected three seals on the tower.", "Don't forget to jump over the holes. Otherwise, you will have to repeat parts of the tower.", "Make a giant leap to the seal. You can jump quite far with a run up, so go for it!", "Well done for reaching the top of the tower! On collecting this seal you should have seen that you now have an extra health orb. You get an extra orb for every 5 seals you collect, so it's worth collecting them all.", "Just walk into the exit and press <img=2> to proceed to the next tower. Good luck on your quest."}, new String[]{"Fight your way around the tower to the seal on your left. Remember to press <img=6> to attack and <img=5> to jump.", "It is possible to jump from this platform up to the silver coin on the left.", "Collecting this super crystal will give you ten seconds to collect 10 bonus crystals. Getting them all will give you a score multiplier and an extra life!", "Don't fall down here, you will be back at the start of the tower! Jump up to the left.", "Time your fall carefully to dodge the runners below.", "Be careful when attacking the thudder above. It will deal two points of damage if it hits you!", "Most towers have many hidden shortcuts. You could have got here from the platform down to the left.", "If you're not doing so well you can run back to the previous seal to get your health back.", "This tower's exit is up and to the right, but leaving now means you will not have collected all five of the seals.", "Wait here and a platform will come to take you across the gap. Try not to fall off.", "Did you spot the seal back to the right? Don't forget to collect it.", "Watch out when fighting near moving platforms as they can be destroyed. If you destroy one by mistake, it will reappear if you leave then come back."}, new String[]{"Watch out: slimer!", "Watch out: more slimers!", "The next seal is up to the right - try to find a route to it.", "This wall is too high to jump over from here, but you should be able to reach the seal in a different way.", "Watch your step!", "A good tactic for slimers is to jump up and knock them off the ceiling.", "To reach the exit, go left."}, new String[]{"Choose your route carefully and stay aware at all times.", "Test of agility.", "Test of combat.", "Watch out on the platform above.", "This door leads to the other side of the tower. Press <img=2> to enter it.", "Beware of the powerful thudders above. They can throw rocks down at you.", "Slimer alert!", "Through this door lies the other side of the tower. Press <img=2> to enter it.", "Don't forget that moving platforms can be destroyed.", "Be very careful on the platforms above. Some enemies will respawn quickly after being killed.", "Well done for making it through. The seal is just above, to the left.", "Look for uncollected coins to work out where you haven't been yet.", "Beware: extreme danger beyond!", "Beware: extreme danger above!"}, new String[]{"Don't stand here reading this for too long. Those rocketeers will get you!", "Getting jade coins is hard without the right tools. Maybe you should come back later...", "Time your jumps well.", "Don't fall!", "Keep going, you can make it.", "He who hesitates is lost.", "Well done!", "This door leads to the exit.", "Look out above."}, new String[]{""}};
        field_b = "Discard";
    }
}
