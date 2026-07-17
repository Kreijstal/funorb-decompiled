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
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var4 = DungeonAssault.field_K;
        try {
          L0: {
            if (kn.field_g) {
              L1: {
                if (param2 == 6) {
                  L2: {
                    if (!la.field_f) {
                      if (lk.field_S <= 0) {
                        break L2;
                      } else {
                        param2 = 7;
                        break L2;
                      }
                    } else {
                      la.field_f = false;
                      param2 = 4;
                      o.field_n.a(6, -64);
                      break L2;
                    }
                  }
                  lk.field_S = lk.field_S + 1;
                  break L1;
                } else {
                  if (param2 != 8) {
                    if (param2 == 11) {
                      if (o.field_n.a(11, (byte) 127)) {
                        ba.a(param1, (byte) 52, 12);
                        return;
                      } else {
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  } else {
                    if (la.field_f) {
                      la.field_f = false;
                      param2 = 5;
                      o.field_n.a(8, -69);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L3: {
                if (param0 == -13716) {
                  break L3;
                } else {
                  qh.b((byte) -92);
                  break L3;
                }
              }
              L4: {
                if (!o.field_n.a(param2, (byte) 71)) {
                  o.field_n.a(param2, param0 ^ 13772);
                  ba.a(param1, (byte) 90, param2);
                  break L4;
                } else {
                  break L4;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var3;
            stackOut_25_1 = new StringBuilder().append("qh.B(").append(param0).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L5;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L5;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 44 + param2 + 41);
        }
    }

    private final void b(int param0) {
        ((qh) this).field_f = false;
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        Object var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        cn var6 = null;
        cn var7 = null;
        cn var8 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = DungeonAssault.field_K;
        try {
          L0: {
            gf.e(243, 197, 369, 143, 16777215);
            gf.b(244, 198, 367, 141, 0);
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
                  var7 = of.field_q[ai.field_n];
                  if (var7 != null) {
                    var2_int = wf.field_x * (var7.field_E - -60) / am.field_g;
                    var3 = -30 + var2_int;
                    if (!oo.field_a) {
                      lg.a((var7.field_E + -var3) * 256 / 30, 65280, var3 * -256 / 30, 199, 245, var7);
                      break L2;
                    } else {
                      lg.a(-256 * var3 / 30, 65280, (-var3 + var7.field_E) * 256 / 30, 199, 245, var7);
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
                      L5: {
                        var8 = of.field_q[var5];
                        if (var8 != null) {
                          if (365 != var8.field_E) {
                            if (var2 == null) {
                              var2 = (Object) (Object) Integer.toString(var5);
                              break L5;
                            } else {
                              var2 = (Object) (Object) (var2 + ", " + var5);
                              break L5;
                            }
                          } else {
                            L6: {
                              if (var8.field_G == 139) {
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            var5++;
                            continue L4;
                          }
                        } else {
                          break L5;
                        }
                      }
                      var5++;
                      continue L4;
                    }
                  }
                }
              }
              break L0;
            } else {
              L7: {
                if (null == tg.field_l) {
                  break L7;
                } else {
                  int discarded$5 = tg.field_l.a(bg.field_t, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                  break L7;
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var1, "qh.I(" + 245 + 41);
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
        RuntimeException var3 = null;
        Object var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_E = null;
                break L1;
              }
            }
            var4 = null;
            stackOut_2_0 = op.a(param1, 0, 0, param2, (String) null, -115, false);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("qh.D(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_3_0;
    }

    final static int a(int param0, byte[] param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 16777215) {
                break L1;
              } else {
                boolean discarded$2 = qh.a(-67, 5);
                break L1;
              }
            }
            stackOut_2_0 = fm.a(param2, 101, 0, param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("qh.G(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param2 + 41);
        }
        return stackIn_3_0;
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
