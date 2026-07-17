/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class kla extends ana {
    static String[] field_y;
    static int field_x;
    private ju field_v;
    static pia field_w;

    final static kv[] a(kv[] param0, int param1) {
        kv[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        kv[] stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        kv[] stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            var2 = new kv[param0.length];
            var4 = 76 / ((-25 - param1) / 32);
            var3 = 0;
            L1: while (true) {
              if (var3 >= param0.length) {
                hga.field_U.a((byte) 119);
                stackOut_7_0 = (kv[]) var2;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                L2: {
                  if (null != param0[var3]) {
                    var2[var3] = new kv(param0[var3].field_n, param0[var3].field_o);
                    var2[var3].b();
                    da.a(0, 0, -110, param0[var3]);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2_ref;
            stackOut_9_1 = new StringBuilder().append("kla.I(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
        }
        return stackIn_8_0;
    }

    private final void e() {
        oha discarded$0 = al.a(109, ((kla) this).field_v.field_k);
        aga var2 = ((kla) this).field_v.field_l.a(36, ((kla) this).field_q.field_h);
        int[][] discarded$1 = ((kla) this).field_v.d((byte) 27);
        gv var3 = new gv(((kla) this).field_q, var2.field_x, var2.field_J);
        ((kj) (Object) var3).a(0);
    }

    final static int a(int param0, Random param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            if (param0 <= 0) {
              throw new IllegalArgumentException();
            } else {
              if (!ona.c(param0, 34)) {
                var3_int = -(int)(4294967296L % (long)param0) + param2;
                L1: while (true) {
                  var4 = param1.nextInt();
                  if (var3_int <= var4) {
                    continue L1;
                  } else {
                    stackOut_9_0 = sg.a(param0, 1816304479, var4);
                    stackIn_10_0 = stackOut_9_0;
                    break L0;
                  }
                }
              } else {
                stackOut_5_0 = (int)((long)param0 * ((long)param1.nextInt() & 4294967295L) >> 32);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("kla.C(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 41);
        }
        return stackIn_10_0;
    }

    final static hh e(int param0) {
        int discarded$0 = 1;
        String var1 = waa.a();
        if (var1 != null) {
            if (!(var1.indexOf('@') < 0)) {
                var1 = "";
            }
        }
        int discarded$1 = 1;
        return new hh(waa.a(), hha.e(1071140296));
    }

    final static void b() {
        L0: {
          if (!o.d((byte) 54)) {
            if (bf.field_h[wca.field_n] != null) {
              bf.field_h[wca.field_n].a((byte) 106);
              if (null == mn.field_l) {
                break L0;
              } else {
                if (!ua.field_b) {
                  break L0;
                } else {
                  mn.field_l.a((byte) 19);
                  break L0;
                }
              }
            } else {
              if (null == mn.field_l) {
                break L0;
              } else {
                if (!ua.field_b) {
                  break L0;
                } else {
                  mn.field_l.a((byte) 19);
                  break L0;
                }
              }
            }
          } else {
            if (null == mn.field_l) {
              break L0;
            } else {
              if (!ua.field_b) {
                break L0;
              } else {
                mn.field_l.a((byte) 19);
                break L0;
              }
            }
          }
        }
        L1: {
          if (o.d((byte) 81)) {
            break L1;
          } else {
            L2: {
              if (bf.field_h[wca.field_n].field_i) {
                break L2;
              } else {
                uka.field_h.a((byte) 19);
                break L2;
              }
            }
            if (bf.field_h[wca.field_n] == null) {
              break L1;
            } else {
              bf.field_h[wca.field_n].a((byte) 113);
              break L1;
            }
          }
        }
    }

    private final void g() {
    }

    public static void d(int param0) {
        field_w = null;
        field_y = null;
    }

    final static String f(int param0) {
        if (!(lk.field_r >= 2)) {
            return dc.field_m;
        }
        if (null != lh.field_s) {
            if (!lh.field_s.a(0)) {
                return gq.field_G;
            }
            return rj.field_q;
        }
        if (!(bv.field_B.a(param0 ^ param0))) {
            return kj.field_a;
        }
        if (!(bv.field_B.a("commonui", 20637))) {
            return iea.field_b + " - " + bv.field_B.a(0, "commonui") + "%";
        }
        if (!(fi.field_n.a(param0 + 10284))) {
            return is.field_d;
        }
        if (!(fi.field_n.a("commonui", 20637))) {
            return jh.field_m + " - " + fi.field_n.a(0, "commonui") + "%";
        }
        if (!em.field_T.a(0)) {
            return kea.field_p;
        }
        if (!(em.field_T.b((byte) 110))) {
            return rla.field_i + " - " + em.field_T.a(true) + "%";
        }
        return fo.field_b;
    }

    final boolean c(byte param0) {
        if (100 == ((kla) this).field_l) {
            jja.a(256, -1, 11);
            ((kla) this).field_l = ((kla) this).field_l - 1;
        }
        int var2 = -109 / ((param0 - 71) / 47);
        if (!(!((kla) this).field_m.a((byte) -106))) {
            return false;
        }
        int fieldTemp$0 = ((kla) this).field_l - 1;
        ((kla) this).field_l = ((kla) this).field_l - 1;
        if (fieldTemp$0 >= 0) {
            if (!(((kla) this).field_l != 25)) {
                int discarded$1 = -60;
                this.e();
                int discarded$2 = 118;
                this.f();
            }
            if (!(((kla) this).field_l != 15)) {
                jja.a(128, -1, 12);
            }
            if (15 <= ((kla) this).field_l) {
                return false;
            }
            ((kla) this).field_q.field_s.a(-1907, 10 + ((kla) this).field_l);
            return false;
        }
        int discarded$3 = 23;
        this.g();
        return true;
    }

    kla(gj param0, ju param1) {
        super(param0, (bca) (Object) param1);
        try {
            ((kla) this).field_v = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "kla.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private final void f() {
        ad var4 = null;
        int var5 = BachelorFridge.field_y;
        aga var2 = ((kla) this).field_v.field_l.a(53, ((kla) this).field_q.field_h);
        if (!(!var2.i(127))) {
            return;
        }
        iv var3 = (iv) (Object) ((kla) this).field_v.field_o.b((byte) 90);
        oha discarded$6 = al.a(89, ((kla) this).field_v.field_k);
        while (var3 != null) {
            var4 = var3.field_h.a(-27449, ((kla) this).field_q);
            var4.b(-1, 6);
            var3.a(var2, ((kla) this).field_q.field_h, 12);
            ((kla) this).a(27799, (at) (Object) new ek(((kla) this).field_q, var4, 40));
            var3 = (iv) (Object) ((kla) this).field_v.field_o.c(0);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = new String[]{"Create one creature of every base food type", "Fill all of your ice tray slots", "Win a game with only bakery-based creatures", "Win a game in 10 turns or less", "Win a game with only meat-based creatures", "Win a game with only dairy-based creatures", "Win a game with only fruit and vegetable-based creatures", "Win a game with only non-food based creatures", "Fill your basket up in one shopping trip", "Win a game with only ready meal-based creatures", "Win a game with only drinks-based creatures", "Win a game with only fish-based creatures", "Chain-feed a creature four food items, without it getting interrupted or another creature stealing any food", "Have a Colonel Chuck, a Rashermon, a Fartilator, a Porcinator and The Grey Earl all wandering around your fridge at the same time", "Get healed by a creature on another team", "Win any game on the Dessert board", "Win any game on the Pizza board", "Lose your entire team to the Curry board's random explosions", "Kill three or more creatures in one action", "Win any game on the Curry board", "Win by killing everybody else's creatures in a 3 or 4-player match", "Win with only one creature left alive", "Win a Capture the Fly match", "Win an Annihilation match", "Win a Take the Grub match", "Win a Capture the Fly match without ever having your fly taken", "Win an Annihilation match without losing a single creature", "Win a Take the Grub match by taking every single control point", "Win on every single board type", "Win on every single game type", "Do 10,000 points of damage", "Do 5,000 points of damage", "Do 1,000 points of damage", "Heal 1,000 points of damage", "Heal 500 points of damage", "Use 40 different special moves", "Use every creature type in battle", "Have every food type eaten at least once", "Shove 200 creatures into pits", "Use any special move a total of 100 times", "Collect 500 flies", "Collect 1000 flies", "Take 500 capture points", "Take 1,000 capture points", "Levitate a Rashermon or a Porcinator", "Split three times in one game", "Inflict 100 status changes", "Inflict 20 different status changes", "Kill a Vindaloony with a Yeastiboi", "Beat a JMod, or a player who has beaten a JMod"};
    }
}
