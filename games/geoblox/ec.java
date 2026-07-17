/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec {
    static int field_b;
    static String field_a;
    static dm field_c;
    static String[] field_e;
    static int field_d;

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        ai var5 = null;
        mg var6 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Geoblox.field_C;
        try {
          L0: {
            var3 = 57 % ((param0 - 57) / 46);
            var5 = (ai) (Object) nf.field_j.g(0);
            L1: while (true) {
              if (var5 == null) {
                var6 = (mg) (Object) rh.field_d.g(0);
                L2: while (true) {
                  if (var6 == null) {
                    break L0;
                  } else {
                    ib.a(3, 5, var6);
                    var6 = (mg) (Object) rh.field_d.d(1);
                    continue L2;
                  }
                }
              } else {
                int discarded$4 = -127;
                int discarded$5 = 3;
                bm.a(var5);
                var5 = (ai) (Object) nf.field_j.d(1);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2, "ec.C(" + param0 + 44 + 3 + 41);
        }
    }

    final static boolean b(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        ja var5 = null;
        ja var6 = null;
        ja var7 = null;
        ja var8_ref_ja = null;
        int var8 = 0;
        ja var9_ref_ja = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_11_0 = 0;
        var11 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              if (0 != h.field_a) {
                break L1;
              } else {
                if (0 < wb.field_b) {
                  if (!w.field_f) {
                    L2: {
                      gf.field_f = 0;
                      if (el.field_o.field_T != 463) {
                        break L2;
                      } else {
                        el.field_o.field_y = 1;
                        el.field_o.c(false);
                        break L2;
                      }
                    }
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0 != 0;
                  } else {
                    return false;
                  }
                } else {
                  break L1;
                }
              }
            }
            if (h.field_a != 0) {
              L3: {
                if (gf.field_f >= 5) {
                  ra.a(jf.field_g ^ 255, -99, jf.field_g);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (gf.field_f >= 6) {
                  ra.a(qg.field_d ^ 255, -57, qg.field_d);
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (gf.field_f >= 7) {
                  ra.a(255 ^ tf.field_f, -97, tf.field_f);
                  break L5;
                } else {
                  break L5;
                }
              }
              var1_int = 1;
              L6: while (true) {
                if (var1_int >= h.field_a) {
                  L7: {
                    if (param0 == -18913) {
                      break L7;
                    } else {
                      boolean discarded$1 = ec.b(-33);
                      break L7;
                    }
                  }
                  var12 = 0;
                  var1_int = var12;
                  L8: while (true) {
                    if (var12 >= h.field_a) {
                      h.field_a = 0;
                      stackOut_48_0 = 1;
                      stackIn_49_0 = stackOut_48_0;
                      break L0;
                    } else {
                      L9: {
                        L10: {
                          if (~(-1 + h.field_a) >= ~var12) {
                            break L10;
                          } else {
                            if (nk.field_f[var12] != nk.field_f[var12 - -1]) {
                              break L10;
                            } else {
                              nk.field_f[var12] = 0;
                              break L9;
                            }
                          }
                        }
                        L11: {
                          var2 = (nk.field_f[var12] & 1072693248) >> 20;
                          var3 = nk.field_f[var12] >> 10 & 1023;
                          var4 = 1023 & nk.field_f[var12];
                          var5 = tl.field_g[var2];
                          var6 = tl.field_g[var3];
                          var7 = tl.field_g[var4];
                          if (var5.field_E > 0) {
                            break L11;
                          } else {
                            if (var6.field_E > 0) {
                              break L11;
                            } else {
                              if (var7.field_E <= 0) {
                                L12: {
                                  td.a(-348, fl.field_c[31]);
                                  gf.field_f = gf.field_f + 1;
                                  if (gf.field_f <= 1) {
                                    break L12;
                                  } else {
                                    el.field_o.field_y = -1;
                                    break L12;
                                  }
                                }
                                L13: {
                                  if (-1073741824 == (-1073741824 & nk.field_f[var12])) {
                                    var8 = 90 * gf.field_f;
                                    ra.a(fa.field_e ^ 255, -100, fa.field_e);
                                    break L13;
                                  } else {
                                    var8 = 30 * gf.field_f;
                                    break L13;
                                  }
                                }
                                var9 = 0;
                                var9 = (int)var5.field_o;
                                var10 = 0;
                                var10 = (int)var5.field_v;
                                ug.a(var8, true, var10, gf.field_f, var9);
                                nk.field_f[var12] = 0;
                                break L9;
                              } else {
                                break L11;
                              }
                            }
                          }
                        }
                        var8_ref_ja = var5;
                        var9_ref_ja = var6;
                        var7.field_K = null;
                        var9_ref_ja.field_K = null;
                        var8_ref_ja.field_K = null;
                        nk.field_f[var12] = 0;
                        break L9;
                      }
                      var12++;
                      continue L8;
                    }
                  }
                } else {
                  var2 = var1_int + -1;
                  var3 = nk.field_f[var1_int];
                  L14: while (true) {
                    L15: {
                      if (var2 < 0) {
                        break L15;
                      } else {
                        if (~nk.field_f[var2] >= ~var3) {
                          break L15;
                        } else {
                          nk.field_f[1 + var2] = nk.field_f[var2];
                          var2--;
                          continue L14;
                        }
                      }
                    }
                    nk.field_f[1 + var2] = var3;
                    var1_int++;
                    continue L6;
                  }
                }
              }
            } else {
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              return stackIn_12_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "ec.A(" + param0 + 41);
        }
        return stackIn_49_0 != 0;
    }

    final static void a() {
        ph var1 = (ph) (Object) el.field_p.g(0);
        if (!(var1 != null)) {
            jl.a((byte) -122);
            return;
        }
        pk var2 = eh.field_d;
        int discarded$0 = var2.a((byte) -102);
        int discarded$1 = var2.a((byte) -108);
        int discarded$2 = var2.a((byte) -71);
        int discarded$3 = var2.a((byte) -83);
        var1.a(false);
    }

    public static void a(boolean param0) {
        field_c = null;
        field_a = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_a = "OK";
        field_e = new String[]{"At any point in the game, you can press the <img=4> key on the top-left of your keyboard to pause the game and bring up the menu from which you can access these instructions.<br><br><br><br>Press the <img=0> and <img=1> arrow keys to rotate the game area anticlockwise and clockwise. You can reverse the directions by pressing <img=7> at any point during the game. If you want to make the next geoblox fall faster, press and hold the <img=6> arrow key.", "Connect falling geoblox into threes, by colour, shape, or colour and shape to score points. Geoblox are considered to be connected when there is no black line between them. If there is a black line, your geoblox are not close enough.<br><br>The geoblox plummet towards your avatar from the outside of the play area. They will stick to the first thing they hit. By getting three of a kind, by colour, shape, or colour and shape, they will disappear and earn you points. Special geoblox, which behave differently, appear later in the game.<br>Once the stacked geoblox reach the edge of the play area, you lose.", "The sequence bonus is awarded for clearing more than one set of geoblox in a row. For clearing two sets of geoblox in a row, the points awarded will be doubled; for clearing three sets in a row, the points awarded will be tripled, and so on. The bonus only applies to an uninterrupted sequence.<br><br>There's a bonus for clearing the avatar of geoblox. Once you reach the end of a stage (the countdown is in the bottom-right of the screen), a bonus bubble will appear. It shrinks from the outer edge of the game area until it touches a geoblox. The longer it takes to reach a geoblox, the higher your reward!", "Special geoblox only crop up in the latter parts of the game, so don't worry about them early on.<br><br><shad=AAAAAA>The amorphous geoblox:</shad> This blob in a jar has a fixed colour, but will assume the shape of the first geoblox it hits. These will only disappear when you connect them to two others of the same colour.<br><br><shad=AAAAAA>The chromatic geoblox:</shad> This has a shape, but no colour. It will assume the colour of the first normal geoblox it hits. These will only disappear when you connect them to two others of the same shape.", "<shad=AAAAAA>The black orb:</shad> Malignant and lazy, this geoblox does nothing but get in your way. Destroy them by using a silver star for a whopping 100 points each! There are no points for stacking them, as they will not react.<br><br><shad=AAAAAA>The silver star:</shad> This star reacts if it comes into contact with your avatar. It unleashes an electric shock that destroys all geoblox touching the avatar, including black orbs. Until then, it's a bit useless! Don't try stacking them as they will just sit there."};
    }
}
