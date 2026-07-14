/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class jg {
    static String field_c;
    String field_e;
    static int field_a;
    static int field_g;
    static int[][] field_f;
    static int[][] field_h;
    int field_b;
    static String field_d;

    final java.net.Socket a(int param0) throws IOException {
        if (param0 != 1) {
            return null;
        }
        return new java.net.Socket(((jg) this).field_e, ((jg) this).field_b);
    }

    abstract java.net.Socket b(int param0) throws IOException;

    final static boolean d(int param0) {
        if (param0 != 7) {
            return true;
        }
        return !ih.field_c.a(-95) ? true : false;
    }

    final static j a(byte param0, String param1) {
        String var2 = null;
        j var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        var5 = Geoblox.field_C;
        if (nh.field_a != null) {
          if (param1 != null) {
            if (param1.length() != 0) {
              if (param0 == -62) {
                var6 = (CharSequence) (Object) param1;
                var2 = oe.a(var6, 12);
                if (var2 != null) {
                  var3 = (j) (Object) nh.field_a.a((long)var2.hashCode(), -1);
                  L0: while (true) {
                    if (var3 != null) {
                      var7 = (CharSequence) (Object) var3.field_hb;
                      var4 = oe.a(var7, 12);
                      if (var4.equals((Object) (Object) var2)) {
                        return var3;
                      } else {
                        var3 = (j) (Object) nh.field_a.a(-29925);
                        continue L0;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static na a(rh param0, int param1, String param2, String param3) {
        int var4 = param0.a((byte) 127, param2);
        if (param1 != 1) {
            field_a = 100;
        }
        int var5 = param0.a(param3, -110, var4);
        return vh.a(var5, param0, var4, true);
    }

    public static void c(int param0) {
        field_d = null;
        field_c = null;
        if (param0 != 16712207) {
            boolean discarded$0 = jg.d(56);
        }
        field_f = null;
        field_h = null;
    }

    final static void a(rh param0, byte param1, rh param2, rh param3, rh param4) {
        int var5 = 0;
        gd var6 = null;
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = Geoblox.field_C;
          kf.field_c = param3;
          sl.field_l = param4;
          p.field_i = new ue(22050, qk.field_j);
          ll.field_d = rf.a(kf.field_c, "", "title_music_loop");
          pi.field_S = rf.a(kf.field_c, "", "game_over");
          hf.field_d = rf.a(kf.field_c, "", "sun");
          qf.field_bb = rf.a(kf.field_c, "", "bonus_bubble_jingle");
          te.field_c = new ci(param0, param2);
          boolean discarded$5 = uh.field_y.a(te.field_c, 0, -1, hf.field_d, sl.field_l);
          ag.field_j[1] = true;
          boolean discarded$6 = uh.field_y.a(te.field_c, 0, -1, qf.field_bb, sl.field_l);
          boolean discarded$7 = uh.field_y.a(te.field_c, 0, -1, pi.field_S, sl.field_l);
          boolean discarded$8 = uh.field_y.a(te.field_c, 0, -1, ll.field_d, sl.field_l);
          var5 = 0;
          if (param1 >= 69) {
            break L0;
          } else {
            var8 = null;
            j discarded$9 = jg.a((byte) 74, (String) null);
            break L0;
          }
        }
        L1: while (true) {
          if (-34 >= var5) {
            return;
          } else {
            L2: {
              if (-1 >= ck.field_c[var5]) {
                break L2;
              } else {
                if (ck.field_c[var5] == -2) {
                  break L2;
                } else {
                  var5++;
                  continue L1;
                }
              }
            }
            L3: {
              L4: {
                if (-11 > var5) {
                  break L4;
                } else {
                  if (26 >= var5) {
                    var6 = te.field_c.c(-1879044097, w.field_b[var5]);
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              var6 = te.field_c.b(1, w.field_b[var5]);
              break L3;
            }
            fl.field_c[var5] = var6.a(p.field_i);
            vg.field_j[var5] = true;
            var5++;
            continue L1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0_int = 0;
        int[] var0 = null;
        int var1 = 0;
        int var2 = 0;
        float var3_float = 0.0f;
        int var3 = 0;
        float var4_float = 0.0f;
        int var4 = 0;
        float var5_float = 0.0f;
        int var5 = 0;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var8 = 0.0f;
        int var9 = 0;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        field_a = 9;
        field_c = "This game has been updated! Please reload this page.";
        field_g = 35;
        field_h = new int[7][7];
        field_f = new int[][]{new int[7], new int[7], new int[7], new int[7], new int[7], new int[7], new int[7]};
        var0_int = 0;
        L0: while (true) {
          if (var0_int >= 7) {
            var20 = new int[7];
            var19 = var20;
            var18 = var19;
            var17 = var18;
            var0 = var17;
            var1 = 0;
            L1: while (true) {
              if (var1 >= 7) {
              } else {
                var2 = 0;
                L2: while (true) {
                  if (7 <= var2) {
                    var2 = 1;
                    L3: while (true) {
                      if (7 <= var2) {
                        var1++;
                        continue L1;
                      } else {
                        var3 = -1 + var2;
                        var4 = var20[var2];
                        var5 = field_h[var1][var2];
                        L4: while (true) {
                          L5: {
                            if (var3 < 0) {
                              break L5;
                            } else {
                              if (var20[var3] <= var4) {
                                break L5;
                              } else {
                                var0[var3 + 1] = var20[var3];
                                field_h[var1][1 + var3] = field_h[var1][var3];
                                var3--;
                                continue L4;
                              }
                            }
                          }
                          var0[var3 + 1] = var4;
                          field_h[var1][var3 - -1] = var5;
                          var2++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    L6: {
                      L7: {
                        var3_float = (float)((field_f[var1][var2] & 16776188) >> -1813215184) / 255.0f;
                        var4_float = (float)((field_f[var1][var2] & 65454) >> 358527304) / 255.0f;
                        var5_float = (float)(255 & field_f[var1][var2]) / 255.0f;
                        var9 = 0;
                        if (var3_float <= var4_float) {
                          break L7;
                        } else {
                          if (var3_float > var5_float) {
                            var7 = var3_float;
                            if (var4_float <= var5_float) {
                              var6 = var4_float;
                              break L6;
                            } else {
                              var6 = var5_float;
                              break L6;
                            }
                          } else {
                            break L7;
                          }
                        }
                      }
                      L8: {
                        if (var4_float <= var3_float) {
                          break L8;
                        } else {
                          if (var4_float <= var5_float) {
                            break L8;
                          } else {
                            L9: {
                              if (var3_float <= var5_float) {
                                var6 = var3_float;
                                break L9;
                              } else {
                                var6 = var5_float;
                                break L9;
                              }
                            }
                            var9 = 1;
                            var7 = var4_float;
                            break L6;
                          }
                        }
                      }
                      var7 = var5_float;
                      var9 = 2;
                      if (var4_float >= var3_float) {
                        var6 = var3_float;
                        break L6;
                      } else {
                        var6 = var4_float;
                        break L6;
                      }
                    }
                    L10: {
                      var8 = var7 - var6;
                      var10 = (var7 + var6) / 2.0f;
                      if (var10 >= 0.5f) {
                        var11 = var8 / (-var6 + (-var7 + 2.0f));
                        break L10;
                      } else {
                        var11 = var8 / (var7 + var6);
                        break L10;
                      }
                    }
                    L11: {
                      var13 = 0.1666666716337204f;
                      var14 = ((-var3_float + var7) * var13 + 0.5f * var8) / var8;
                      var15 = ((-var4_float + var7) * var13 + 0.5f * var8) / var8;
                      var16 = (var13 * (var7 - var5_float) + var8 * 0.5f) / var8;
                      if (var9 == 0) {
                        var12 = -var15 + var16;
                        break L11;
                      } else {
                        if ((var9 ^ -1) == -2) {
                          var12 = -var16 + (0.3333333432674408f + var14);
                          break L11;
                        } else {
                          var12 = -var14 + (0.6666666865348816f + var15);
                          break L11;
                        }
                      }
                    }
                    L12: {
                      if (var12 >= 0.0f) {
                        if (var12 <= 1.0f) {
                          break L12;
                        } else {
                          var12 = var12 - 1.0f;
                          break L12;
                        }
                      } else {
                        var12 = var12 + 1.0f;
                        break L12;
                      }
                    }
                    var0[var2] = (int)(var12 * 255.0f) << (int)(var11 * 255.0f) + 16 << 8 + (int)(255.0f * var10);
                    var2++;
                    continue L2;
                  }
                }
              }
            }
          } else {
            sf.a(field_f[var0_int], 0, field_h[var0_int], 0, 7);
            var0_int++;
            continue L0;
          }
        }
    }
}
