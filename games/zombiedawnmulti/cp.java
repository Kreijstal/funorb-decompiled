/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class cp extends se implements jn, in {
    static String field_L;
    static fm field_H;
    private gn field_M;
    gl field_V;
    static ul field_P;
    static Calendar field_U;
    private gn field_W;
    private on field_G;
    static ja[] field_X;
    static th field_T;
    static String[][] field_J;
    static int field_O;
    static boolean field_K;
    static String[] field_I;
    static String[][] field_S;
    static String[] field_Q;
    static String[] field_R;
    static String[][] field_N;

    final boolean a(int param0, char param1, cf param2, int param3) {
        if (!super.a(param0, param1, param2, param3)) {
          if ((param0 ^ -1) == -99) {
            return ((cp) this).a((byte) -1, param2);
          } else {
            if (param0 != 99) {
              return false;
            } else {
              return ((cp) this).a(param3 + 6241, param2);
            }
          }
        } else {
          return true;
        }
    }

    private final void i(int param0) {
        if (!(this.h(param0 + -16777195))) {
            return;
        }
        ai.a(((cp) this).field_G.field_j, (byte) 126);
        if (param0 != 16777215) {
            boolean discarded$0 = this.h(-58);
        }
    }

    public final void a(int param0) {
        if (param0 != 496) {
            return;
        }
        ((tp) (Object) ((cp) this).field_G.a((byte) -67)).i(-22837);
    }

    public final void a(int param0, int param1, gn param2, int param3, int param4) {
        if (param2 != ((cp) this).field_W) {
          if (param2 == ((cp) this).field_M) {
            this.i(16777215);
            if (param3 >= -83) {
              field_N = null;
              return;
            } else {
              return;
            }
          } else {
            if (param3 < -83) {
              return;
            } else {
              field_N = null;
              return;
            }
          }
        } else {
          qe.c((byte) 125);
          if (param3 < -83) {
            return;
          } else {
            field_N = null;
            return;
          }
        }
    }

    private final boolean a(kh param0, int param1) {
        j var3 = null;
        int var4 = 0;
        re var5 = null;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var4 = 75 / ((param1 - -51) / 54);
        var3 = param0.a((byte) -119);
        if (var3 == null) {
          return true;
        } else {
          L0: {
            var5 = var3.d(55);
            if (var5 != db.field_b) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public cp() {
        super(0, 0, 496, 0, (nl) null);
        ((cp) this).field_G = new on("", (bj) null, 12);
        hq var1 = new hq(field_H, 0, 0, 0, 0, 16777215, -1, 3, 0, ke.field_h.field_C, -1, 2147483647, true);
        cf var2 = new cf(la.field_e, (nl) (Object) var1, (bj) null);
        ((cp) this).field_M = new gn(ji.field_e, (bj) null);
        ((cp) this).field_W = new gn(gk.field_a, (bj) null);
        ((cp) this).field_G.field_x = bi.field_d;
        ((cp) this).field_G.a((byte) -27, (j) (Object) new tp((pm) (Object) ((cp) this).field_G));
        ((cp) this).field_M.field_F = false;
        ((cp) this).field_M.field_h = (nl) (Object) new oq();
        ((cp) this).field_W.field_h = (nl) (Object) new he();
        ((cp) this).field_G.field_h = (nl) (Object) new tb(10000536);
        int var3 = 20;
        int var4 = 4;
        var2.b(20, var3, 28972, 270, 50);
        int var5 = 200;
        var3 += 50;
        ((cp) this).b((byte) 101, var2);
        var3 = var3 + (this.a(var3, ia.field_w, 170, (cf) (Object) ((cp) this).field_G, -43, r.field_e) + 5);
        ((cp) this).field_M.b(-var5 + 496 >> -1771215743, var3, 28972, var5, 40);
        ((cp) this).field_W.b(3 + var4, var3 + 15, 28972, 60, 40);
        ((cp) this).field_W.field_A = (bj) this;
        ((cp) this).field_M.field_A = (bj) this;
        ((cp) this).b((byte) 61, (cf) (Object) ((cp) this).field_M);
        ((cp) this).b((byte) 81, (cf) (Object) ((cp) this).field_W);
        ((cp) this).field_V = new gl((jn) this);
        ((cp) this).field_V.b(60 + ((cp) this).field_G.field_n + ((cp) this).field_G.field_y, 20, 28972, -60 + (((cp) this).field_n + -((cp) this).field_G.field_y - ((cp) this).field_G.field_n), 150);
        ((cp) this).b((byte) 120, (cf) (Object) ((cp) this).field_V);
        ((cp) this).b(0, 0, 28972, 496, var4 + 55 + var3);
    }

    public static void c(boolean param0) {
        field_S = null;
        if (!param0) {
          field_I = null;
          field_J = null;
          field_P = null;
          field_L = null;
          field_N = null;
          field_I = null;
          field_Q = null;
          field_H = null;
          field_R = null;
          field_T = null;
          field_X = null;
          field_U = null;
          return;
        } else {
          field_J = null;
          field_P = null;
          field_L = null;
          field_N = null;
          field_I = null;
          field_Q = null;
          field_H = null;
          field_R = null;
          field_T = null;
          field_X = null;
          field_U = null;
          return;
        }
    }

    final void a(int param0, cf param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        ((cp) this).field_M.field_F = this.h(param0 + 5427);
    }

    private final int a(int param0, String param1, int param2, cf param3, int param4, String param5) {
        Object var8 = null;
        if (param4 >= -9) {
          var8 = null;
          int discarded$2 = this.a(82, (String) null, 77, (cf) null, 115, (String) null);
          return this.a(param0, param3, param5, 35, param1, 12352, param2);
        } else {
          return this.a(param0, param3, param5, 35, param1, 12352, param2);
        }
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    public final void a(String param0, int param1) {
        if (param1 != 1) {
            return;
        }
        on var3 = ((cp) this).field_G;
        String var4 = param0;
        ((pm) (Object) var3).a(false, var4, (byte) 117);
    }

    private final int a(int param0, cf param1, String param2, int param3, String param4, int param5, int param6) {
        km var9 = null;
        el var10 = null;
        if (param5 != 12352) {
          field_U = null;
          var10 = new el(20, param0, 120 + param6, 25, param1, false, 120, 3, ke.field_h, 16777215, param4);
          ((cp) this).b((byte) 115, (cf) (Object) var10);
          var9 = new km(((kh) (Object) param1).a((byte) -61), param2, 126, var10.field_w + param0, 25 + param6, param3);
          var9.field_A = (bj) this;
          ((cp) this).b((byte) 91, (cf) (Object) var9);
          return var9.field_w + var10.field_w;
        } else {
          var10 = new el(20, param0, 120 + param6, 25, param1, false, 120, 3, ke.field_h, 16777215, param4);
          ((cp) this).b((byte) 115, (cf) (Object) var10);
          var9 = new km(((kh) (Object) param1).a((byte) -61), param2, 126, var10.field_w + param0, 25 + param6, param3);
          var9.field_A = (bj) this;
          ((cp) this).b((byte) 91, (cf) (Object) var9);
          return var9.field_w + var10.field_w;
        }
    }

    private final boolean h(int param0) {
        Object var3 = null;
        if (this.a((kh) (Object) ((cp) this).field_G, param0 + 104)) {
          if (param0 != 20) {
            var3 = null;
            ((cp) this).a(-4, (cf) null, -95, 88);
            return true;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = "Charm";
        field_U = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_T = new th();
        field_I = new String[]{"<col=FF0000>Disguise</col>: don a costume to blend in seamlessly with the environment. Your zombie won't lunge at survivors from a distance but, if it gets close, it won't resist the urge to bite.", "<col=FF0000>Speed</col>: go hyperactive and gain super-speed! Your zombie will move twice as fast to catch those fleshy humans.", "<col=FF0000>Meltdown</col>: dissolve into a puddle of sticky goo! Humans run very slowly through it, but zombies will be unaffected.", "<col=FF0000>Hammer</col>: stun any human or zombie in your field of influence!", "<col=E4F26A>More powerups can be researched by playing Rated games</col>!"};
        field_N = new String[4][6];
        field_J = new String[][]{new String[2], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1]};
        field_S = new String[][]{new String[2], new String[5], new String[4], new String[1], new String[1], new String[1]};
        field_Q = new String[]{"Traits affect all of your zombies, all of the time. You can have up to three different traits equipped at one time.", "<col=FF0000>Hungry</col>: your zombies hunger for human flesh and will lunge faster and from further away.", "<col=FF0000>Nimble Fingers</col>: your powerups recharge faster than normal.", "<col=FF0000>Expert</col>: powerups with a fixed duration last longer.", "<col=FF0000>Zombie-lover</col>: increases the number of Research Points you get from zombies.", "<col=E4F26A>More traits can be researched by playing Rated games</col>!"};
        field_R = new String[]{"1983: The undead apocalypse conquered humanity.", "The remaining humans are nothing more than fodder...", "...but there aren't enough brains to go around.", "The overlords have started fighting each other over the few remaining humans", "You rule one shamble of zombies", "Now, try to rule the world!"};
        field_N = new String[][]{new String[6], new String[6], new String[6], new String[6]};
    }
}
