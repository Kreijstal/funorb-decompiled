/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh {
    int field_M;
    static cn field_q;
    int[] field_k;
    int[] field_O;
    int[] field_g;
    int[] field_l;
    short[] field_v;
    private boolean field_f;
    int[] field_m;
    short[] field_e;
    byte[] field_y;
    short[] field_t;
    static String field_D;
    int field_p;
    short[] field_F;
    short field_B;
    short[] field_N;
    static String[] field_J;
    short[] field_n;
    int field_H;
    short[] field_s;
    short[] field_o;
    short[] field_A;
    short[] field_x;
    int[] field_u;
    short[] field_Q;
    static String[] field_R;
    short[] field_P;
    short[] field_d;
    short[] field_I;
    short field_h;
    static String[] field_E;
    int field_i;
    int field_b;
    int[] field_K;
    short[] field_C;
    static ja field_G;
    int field_a;
    static String field_j;
    short[] field_z;
    byte field_w;
    short[] field_S;
    int[] field_r;
    short[] field_L;
    int[] field_T;
    short field_c;

    final void a(int param0, boolean param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = DungeonAssault.field_K;
        for (var6 = 0; ((qh) this).field_B > var6; var6++) {
            ((qh) this).field_L[var6] = (short)(((qh) this).field_L[var6] * param4 / param0);
            ((qh) this).field_S[var6] = (short)(((qh) this).field_S[var6] * param2 / param0);
            ((qh) this).field_z[var6] = (short)(param3 * ((qh) this).field_z[var6] / param0);
        }
        if (param1) {
            return;
        }
        this.b(32767);
    }

    final static void a(int param0, rj param1, int param2) {
        int var4 = 0;
        var4 = DungeonAssault.field_K;
        if (kn.field_g) {
          L0: {
            if (-7 == param2) {
              L1: {
                if (!la.field_f) {
                  if ((lk.field_S ^ -1) >= -1) {
                    break L1;
                  } else {
                    param2 = 7;
                    break L1;
                  }
                } else {
                  la.field_f = false;
                  param2 = 4;
                  o.field_n.a(6, -64);
                  break L1;
                }
              }
              lk.field_S = lk.field_S + 1;
              break L0;
            } else {
              if (-9 != param2) {
                if ((param2 ^ -1) == -12) {
                  if (o.field_n.a(11, (byte) 127)) {
                    ba.a(param1, (byte) 52, 12);
                    return;
                  } else {
                    break L0;
                  }
                } else {
                  break L0;
                }
              } else {
                if (la.field_f) {
                  la.field_f = false;
                  param2 = 5;
                  o.field_n.a(8, -69);
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
          L2: {
            if (param0 == -13716) {
              break L2;
            } else {
              qh.b((byte) -92);
              break L2;
            }
          }
          L3: {
            if (!o.field_n.a(param2, (byte) 71)) {
              o.field_n.a(param2, param0 ^ 13772);
              ba.a(param1, (byte) 90, param2);
              break L3;
            } else {
              break L3;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void b(int param0) {
        if (param0 != 32767) {
            ((qh) this).field_Q = null;
        }
        ((qh) this).field_f = false;
    }

    final static void a(int param0) {
        String var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        cn var6 = null;
        cn var7 = null;
        cn var7_ref = null;
        cn var8 = null;
        L0: {
          var4 = DungeonAssault.field_K;
          gf.e(243, 197, 369, 143, 16777215);
          gf.b(244, 198, 367, 141, 0);
          if (param0 == 245) {
            break L0;
          } else {
            field_R = null;
            break L0;
          }
        }
        if (null != of.field_q) {
          L1: {
            var6 = of.field_q[me.field_f];
            var7 = var6;
            var7 = var6;
            if (var6 == null) {
              if (tg.field_l != null) {
                int discarded$3 = tg.field_l.a(bg.field_t, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                break L1;
              } else {
                break L1;
              }
            } else {
              var6.h(245, 199);
              break L1;
            }
          }
          L2: {
            if (wf.field_x >= am.field_g) {
              break L2;
            } else {
              var7_ref = of.field_q[ai.field_n];
              if (var7_ref != null) {
                var2_int = wf.field_x * (var7_ref.field_E - -60) / am.field_g;
                var3 = -30 + var2_int;
                if (!oo.field_a) {
                  lg.a((var7_ref.field_E + -var3) * 256 / 30, 65280, var3 * -256 / 30, 199, 245, var7_ref);
                  break L2;
                } else {
                  lg.a(-256 * var3 / 30, param0 + 65035, (-var3 + var7_ref.field_E) * 256 / 30, 199, 245, var7_ref);
                  break L2;
                }
              } else {
                break L2;
              }
            }
          }
          L3: {
            if (tg.field_l == null) {
              break L3;
            } else {
              var2 = null;
              var5 = 0;
              var3 = var5;
              L4: while (true) {
                if (var5 >= of.field_q.length) {
                  if (var2 != null) {
                    int discarded$4 = tg.field_l.a("Screenshot(s) " + var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  var8 = of.field_q[var5];
                  if (var8 != null) {
                    L5: {
                      if (365 != var8.field_E) {
                        break L5;
                      } else {
                        if ((var8.field_G ^ -1) != -140) {
                          break L5;
                        } else {
                          var5++;
                          continue L4;
                        }
                      }
                    }
                    if (var2 == null) {
                      var2 = Integer.toString(var5);
                      var5++;
                      continue L4;
                    } else {
                      var2 = var2 + ", " + var5;
                      var5++;
                      continue L4;
                    }
                  } else {
                    var5++;
                    continue L4;
                  }
                }
              }
            }
          }
          return;
        } else {
          L6: {
            if (null == tg.field_l) {
              break L6;
            } else {
              int discarded$5 = tg.field_l.a(bg.field_t, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
              break L6;
            }
          }
          return;
        }
    }

    final static boolean a(int param0, int param1) {
        if (param1 != 245) {
            return false;
        }
        return param0 == (param0 & -param0) ? true : false;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = DungeonAssault.field_K;
        for (var5 = param0; ((qh) this).field_B > var5; var5++) {
            ((qh) this).field_L[var5] = (short)(((qh) this).field_L[var5] + param1);
            ((qh) this).field_S[var5] = (short)(((qh) this).field_S[var5] + param3);
            ((qh) this).field_z[var5] = (short)(((qh) this).field_z[var5] + param2);
        }
        this.b(32767);
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = DungeonAssault.field_K;
        if (((qh) this).field_f) {
          return;
        } else {
          ((qh) this).field_f = true;
          var2 = 32767;
          var3 = 32767;
          var4 = 32767;
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          var8 = 0;
          L0: while (true) {
            if (((qh) this).field_B <= var8) {
              L1: {
                if (param0 <= -116) {
                  break L1;
                } else {
                  ((qh) this).a(-99, true, -5, 127, 16);
                  break L1;
                }
              }
              ((qh) this).field_M = var6;
              ((qh) this).field_b = var7;
              ((qh) this).field_H = var2;
              ((qh) this).field_i = var5;
              ((qh) this).field_p = var3;
              ((qh) this).field_a = var4;
              return;
            } else {
              L2: {
                var9 = ((qh) this).field_L[var8];
                var10 = ((qh) this).field_S[var8];
                var11 = ((qh) this).field_z[var8];
                if (var10 <= var6) {
                  break L2;
                } else {
                  var6 = var10;
                  break L2;
                }
              }
              L3: {
                if (var9 <= var5) {
                  break L3;
                } else {
                  var5 = var9;
                  break L3;
                }
              }
              L4: {
                if (var10 >= var3) {
                  break L4;
                } else {
                  var3 = var10;
                  break L4;
                }
              }
              L5: {
                if (var2 > var9) {
                  var2 = var9;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (var4 > var11) {
                  var4 = var11;
                  break L6;
                } else {
                  break L6;
                }
              }
              if (var7 < var11) {
                var7 = var11;
                var8++;
                continue L0;
              } else {
                var8++;
                continue L0;
              }
            }
          }
        }
    }

    final static int a(boolean param0, cd param1, cd param2) {
        if (param0) {
            field_E = null;
        }
        Object var4 = null;
        return op.a(param1, 0, 0, param2, (String) null, -115, false);
    }

    final static int a(int param0, byte[] param1, int param2) {
        if (param0 != 16777215) {
            boolean discarded$0 = qh.a(-67, 5);
        }
        return fm.a(param2, 101, 0, param1);
    }

    public static void b(byte param0) {
        if (param0 != 75) {
            return;
        }
        field_E = null;
        field_D = null;
        field_j = null;
        field_q = null;
        field_G = null;
        field_J = null;
        field_R = null;
    }

    qh() {
        ((qh) this).field_f = false;
        ((qh) this).field_w = (byte) 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "The brass construction in this room is humanoid in design, but has razor-sharp blades in place of arms.<br><br>Defeated raiders permanently lose 2 <%defence>. (If <%defence> reduced to 0, the raider dies)";
        field_R = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_J = new String[]{"The land of Dungaria, home of the dragon.", "Once it was a battlefield, where dragons did wage war upon each other for pride and dominance.", "The world itself was in danger of destruction.", "Now the ancient dragons sleep in their subterranean lairs...", "...but still they battle, still they fight.", "Through the life and death of others, they seek gold and renown!", "Take upon yourself the mantle of dragonhood.", "Defend your hoard. Send forth your raiders. Battle your rivals...", "Become the Dragon King!"};
        field_E = new String[]{"Construction", "To prevent other players stealing your Treasure (and diminishing your Renown), you can place additional <%traps> and <%monsters> in your dungeon. Placing new dungeon rooms requires you to spend <%highlight>Treasure</highlight>. The total amount of <%highlight>Treasure</col> you have to spend is located at the <%highlight>bottom-right of this screen</col>."};
        field_j = "<col=FF0000>limit reached</col>";
    }
}
