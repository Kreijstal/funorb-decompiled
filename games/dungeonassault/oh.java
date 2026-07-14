/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh implements ca {
    static String field_a;
    static md field_j;
    private se field_m;
    private int field_g;
    static int field_s;
    private int field_p;
    private int field_f;
    private int field_c;
    private int field_k;
    private int field_d;
    private int field_e;
    static String field_o;
    private int field_h;
    private int field_l;
    static String field_q;
    private int field_i;
    static String field_b;
    private int field_r;
    static int field_t;
    static String field_n;

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = DungeonAssault.field_K;
          al.field_o.a(1);
          al.field_o.a(24, -92);
          jb.field_Sb[24] = -1;
          if (param1 == 7) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        hf.field_ob.b(-4);
        hf.field_ob.a((ne) (Object) new a(24), false);
        L1: while (true) {
          if (hf.field_ob.a((byte) -88)) {
            return;
          } else {
            var2 = ((a) (Object) hf.field_ob.b((byte) -124)).field_j;
            if (me.field_g[var2].field_h.field_g != param0) {
              L2: {
                if (var2 % 7 <= 0) {
                  break L2;
                } else {
                  me.a(var2, -1 + var2, (byte) 69, var2 + -1 - var2 / 7);
                  break L2;
                }
              }
              L3: {
                if (var2 % 7 >= 6) {
                  break L3;
                } else {
                  me.a(var2, var2 - -1, (byte) 114, -(var2 / 7) + var2);
                  break L3;
                }
              }
              L4: {
                if ((var2 ^ -1) >= -7) {
                  break L4;
                } else {
                  me.a(var2, -7 + var2, (byte) 71, var2 + -7 - -42);
                  break L4;
                }
              }
              if (42 <= var2) {
                continue L1;
              } else {
                me.a(var2, 7 + var2, (byte) 115, var2 + 42);
                continue L1;
              }
            } else {
              al.field_o.b(var2, param1 + 24);
              continue L1;
            }
          }
        }
    }

    public static void a(int param0) {
        field_j = null;
        field_a = null;
        if (param0 < 0) {
            return;
        }
        field_q = null;
        field_b = null;
        field_n = null;
        field_o = null;
    }

    final static me a(String param0, int param1) {
        if (param1 != -8) {
            return null;
        }
        return new me(param0);
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        if (null != m.field_e) {
            if (20 <= gn.field_h) {
                if (m.field_e != un.field_e) {
                    of.field_f = m.field_e.b((byte) -114);
                    if (of.field_f != null) {
                        uo.field_a = dd.a((byte) -112, 8, of.field_f);
                    }
                }
                if (null != of.field_f) {
                    var1 = of.field_f.field_y;
                    var2 = of.field_f.field_v;
                    var3 = hj.field_S;
                    if (!((var1 + var3 ^ -1) >= -641)) {
                        var3 = var3 - var1;
                    }
                    var4 = eh.field_h + -var2;
                    if (!(0 <= var4)) {
                        var4 = var4 + (30 + var2);
                    }
                    gf.b(-8 + var3, -8 + var4, of.field_f.field_y + 16, of.field_f.field_v - -16, 16777215, 16);
                    gf.b(var3 + -4, -4 + var4, 8 + of.field_f.field_y, of.field_f.field_v + 8, 0, 64);
                    bp.a(var4, uo.field_a, var3, (byte) 99);
                    of.field_f.h(var3, var4);
                }
            }
        }
        if (param0 <= 1) {
            field_j = null;
        }
    }

    public final void a(byte param0, lm param1, int param2, int param3, boolean param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        rb var11 = null;
        lm stackIn_3_0 = null;
        lm stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param1 instanceof rb) {
            stackOut_2_0 = (lm) param1;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (lm) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var11 = (rb) (Object) stackIn_3_0;
          if (var11 != null) {
            param4 = param4 & var11.field_B;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var7 = 5592405;
          if (param4) {
            var7 = 16777215;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          gf.b(param1.field_q + param2, param1.field_v + param3, param1.field_x, param1.field_s, ((oh) this).field_g);
          if (param0 == 34) {
            break L3;
          } else {
            boolean discarded$2 = oh.a(32, '￴');
            break L3;
          }
        }
        L4: {
          var8 = param2 - -param1.field_q + ((oh) this).field_d;
          var9 = param3 + (param1.field_v + ((oh) this).field_h);
          gf.a(var8, var9, ((oh) this).field_l, ((oh) this).field_e, 5592405);
          gf.b(var8, var9, ((oh) this).field_l, ((oh) this).field_e, var7);
          if (!var11.field_E) {
            break L4;
          } else {
            gf.c(var8, var9, ((oh) this).field_l + var8, ((oh) this).field_e + var9, 1);
            gf.c(var8 - -((oh) this).field_l, var9, var8, var9 - -((oh) this).field_e, 1);
            break L4;
          }
        }
        L5: {
          if (null != ((oh) this).field_m) {
            var10 = ((oh) this).field_k + ((oh) this).field_l - -((oh) this).field_d;
            int discarded$3 = ((oh) this).field_m.a(param1.field_w, param1.field_q + param2 - -var10, ((oh) this).field_f + (param1.field_v + param3), -var10 - (((oh) this).field_k - param1.field_x), -(((oh) this).field_k << -1427549887) + param1.field_s, ((oh) this).field_p, ((oh) this).field_i, ((oh) this).field_c, ((oh) this).field_r, 0);
            break L5;
          } else {
            break L5;
          }
        }
    }

    final static cn a(nh param0, String param1, int param2, String param3) {
        if (param2 != 11091) {
            Object var6 = null;
            me discarded$0 = oh.a((String) null, -24);
        }
        int var4 = param0.a(param1, 1000);
        int var5 = param0.a(0, param3, var4);
        return jf.a(var5, param0, var4, (byte) 41);
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        L0: {
          L1: {
            var5 = DungeonAssault.field_K;
            if (param1 <= 0) {
              break L1;
            } else {
              if (param1 < 128) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (param1 < 160) {
              if (0 != param1) {
                var6 = mh.field_d;
                var2 = var6;
                var3 = 0;
                L3: while (true) {
                  if (var3 >= var6.length) {
                    break L2;
                  } else {
                    var4 = var6[var3];
                    if (param1 == var4) {
                      return true;
                    } else {
                      var3++;
                      continue L3;
                    }
                  }
                }
              } else {
                break L2;
              }
            } else {
              if (255 >= param1) {
                break L0;
              } else {
                if (0 != param1) {
                  var6 = mh.field_d;
                  var2 = var6;
                  var3 = 0;
                  L4: while (true) {
                    if (var3 >= var6.length) {
                      break L2;
                    } else {
                      var4 = var6[var3];
                      if (param1 == var4) {
                        return true;
                      } else {
                        var3++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
            }
          }
          if (param0 == -161) {
            return false;
          } else {
            return true;
          }
        }
        return true;
    }

    oh(se param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((oh) this).field_c = 1;
        ((oh) this).field_r = 1;
        ((oh) this).field_k = param1;
        ((oh) this).field_h = param6;
        ((oh) this).field_p = param3;
        ((oh) this).field_g = param9;
        ((oh) this).field_e = param7;
        ((oh) this).field_d = param5;
        ((oh) this).field_i = param4;
        ((oh) this).field_f = param2;
        ((oh) this).field_m = param0;
        ((oh) this).field_l = param8;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_o = "Recently raided by: ";
        field_q = "Hidden Pit";
        field_b = "Reload game";
        field_j = new md();
        field_n = "Play the game without logging in just yet";
    }
}
