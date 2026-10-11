/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kw {
    static int field_i;
    static ut field_f;
    static int field_h;
    private String field_d;
    static String field_a;
    static String field_g;
    static String[] field_c;
    static em field_b;
    private boolean field_j;
    private boolean field_e;

    final boolean b(byte param0) {
        if (param0 != -90) {
          return false;
        }
        return this.field_e;
    }

    final static int c(byte param0) {
        if (ju.field_T) {
          return -1;
        }
        if (!bo.field_Cb.a(false, "stadium")) {
          return bo.field_Cb.a("stadium", -16248);
        }
        eb.field_i = new ot[4];
        ju.field_T = true;
        eb.field_i[0] = (ot) (bg.a("stadium", bo.field_Cb, (byte) 74, "top_left_seats"));
        eb.field_i[1] = (ot) (bg.a("stadium", bo.field_Cb, (byte) 86, "top_right_seats"));
        eb.field_i[2] = (ot) (bg.a("stadium", bo.field_Cb, (byte) 46, "bot_left_seats"));
        eb.field_i[3] = (ot) (bg.a("stadium", bo.field_Cb, (byte) 115, "bot_right_seats"));
        ph.field_e = new kg[4][3];
        ph.field_e[0][0] = fw.a(bo.field_Cb, "stadium", true, "left_seats_1");
        ph.field_e[0][1] = fw.a(bo.field_Cb, "stadium", true, "left_seats_2");
        ph.field_e[0][2] = fw.a(bo.field_Cb, "stadium", true, "left_seats_3");
        ge.field_k = bg.a("stadium", bo.field_Cb, (byte) 68, "ad_top");
        da.field_m = bg.a("stadium", bo.field_Cb, (byte) 83, "ad_right");
        hn.field_f = bg.a("stadium", bo.field_Cb, (byte) 108, "ad_left");
        ph.field_e[1][0] = fw.a(bo.field_Cb, "stadium", true, "top_seats_1");
        ph.field_e[1][1] = fw.a(bo.field_Cb, "stadium", true, "top_seats_2");
        ph.field_e[1][2] = fw.a(bo.field_Cb, "stadium", true, "top_seats_3");
        ph.field_e[3][0] = fw.a(bo.field_Cb, "stadium", true, "bot_seats_1");
        if (param0 != 28) {
          return -11;
        }
        ph.field_e[3][1] = fw.a(bo.field_Cb, "stadium", true, "bot_seats_2");
        ph.field_e[3][2] = fw.a(bo.field_Cb, "stadium", true, "bot_seats_3");
        ph.field_e[2][0] = fw.a(bo.field_Cb, "stadium", true, "right_seats_1");
        ph.field_e[2][1] = fw.a(bo.field_Cb, "stadium", true, "right_seats_2");
        ph.field_e[2][2] = fw.a(bo.field_Cb, "stadium", true, "right_seats_3");
        bf.field_s = new kg[3][];
        bf.field_s[0] = jo.a(bo.field_Cb, ek.b((int) param0, 17349), "stadium", "top_seats_1_mask");
        bf.field_s[1] = jo.a(bo.field_Cb, 17369, "stadium", "top_seats_2_mask");
        bf.field_s[2] = jo.a(bo.field_Cb, 17369, "stadium", "top_seats_3_mask");
        ps.field_c = new kg[3][];
        ps.field_c[0] = jo.a(bo.field_Cb, 17369, "stadium", "bot_seats_1_mask");
        ps.field_c[1] = jo.a(bo.field_Cb, 17369, "stadium", "bot_seats_2_mask");
        ps.field_c[2] = jo.a(bo.field_Cb, 17369, "stadium", "bot_seats_3_mask");
        return -1;
    }

    final void a(boolean param0, byte param1) {
        this.field_j = true;
        int var3 = -109 % ((param1 - 48) / 55);
        this.field_e = param0 ? true : false;
    }

    final static void b(int param0) {
        if (!nb.field_f) {
          throw new IllegalStateException();
        }
        aw.field_H = true;
        hm.a(true, -91);
        vj.field_c = param0;
    }

    final boolean a(byte param0) {
        if (param0 != -80) {
          kw.c((byte) -18);
          return this.field_j;
        }
        return this.field_j;
    }

    final static void a(int param0, int param1) {
        hn var2 = null;
        int var3 = Kickabout.field_G;
        hn var2Lifetime1;
        try {
          var2 = (hn) (da.field_h.g(24009));
          if (param0 < 104) {
            field_i = -30;
          }
          while (var2 != null) {
            if (5 == var2.field_i) {
              var2.c((byte) -109);
            }
            var2 = (hn) (da.field_h.c(33));
          }
          var2Lifetime1 = new hn(5, new int[]{param1});
          ii.a(var2Lifetime1, 118);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "kw.B(" + param0 + ',' + param1 + ')');
        }
    }

    public static void d(byte param0) {
        field_b = null;
        field_a = null;
        field_g = null;
        field_f = null;
        if (param0 != -122) {
          field_a = (String) null;
          field_c = null;
          return;
        }
        field_c = null;
    }

    final String a(int param0) {
        if (param0 != 3) {
          this.field_j = true;
          return this.field_d;
        }
        return this.field_d;
    }

    final static void b(boolean param0, byte param1) {
        int stackIn_10_0 = 0;
        Object stackIn_20_0 = null;
        int stackIn_26_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_59_0 = 0;
        Object stackIn_69_0 = null;
        int stackIn_75_0 = 0;
        int stackIn_88_0 = 0;
        Object stackIn_104_0 = null;
        int stackIn_112_0 = 0;
        Object stackIn_126_0 = null;
        int stackIn_134_0 = 0;
        Object stackIn_146_0 = null;
        int stackIn_152_0 = 0;
        Object stackIn_163_0 = null;
        int stackIn_169_0 = 0;
        int stackIn_182_0 = 0;
        int stackIn_195_0 = 0;
        Object var2_ref;
        int var2;
        int var3;
        var3 = Kickabout.field_G;
        if (!qo.c((byte) -42)) {
          if (!dr.field_a) {
            wt.field_x = el.field_A;
            us.field_j = n.field_m;
            if (param1 >= -99) {
              kw.d((byte) -40);
            }
            vd.field_c = nl.field_p;
            dn.field_yb = sm.field_q;
            ip.field_a = wj.field_A;
            kf.field_Eb = vc.field_y;
            if (dr.field_a &&
              1 == vd.field_c) {
              stackIn_39_0 = 1;
            } else {
              stackIn_39_0 = 0;
            }
            var2 = stackIn_39_0;
          } else {
            if (320 == el.field_A &&
              n.field_m == 240) {
              if (param1 >= -99) {
                kw.d((byte) -40);
              }
              vd.field_c = nl.field_p;
              dn.field_yb = sm.field_q;
              ip.field_a = wj.field_A;
              kf.field_Eb = vc.field_y;
              if (dr.field_a &&
                1 == vd.field_c) {
                stackIn_10_0 = 1;
              } else {
                stackIn_10_0 = 0;
              }
              var2 = stackIn_10_0;
            } else {
              wt.field_x = wt.field_x + (el.field_A - 320);
              us.field_j = us.field_j + (-240 + n.field_m);
              wt.field_x = Math.max(0, Math.min(639, wt.field_x));
              us.field_j = Math.max(0, Math.min(479, us.field_j));
              if (e.field_m == null) {
                stackIn_20_0 = ic.field_d;
              } else {
                stackIn_20_0 = e.field_m;
              }
              var2_ref = stackIn_20_0;
              oo.field_c.a((byte) 68, 240, 320, (java.awt.Component) (var2_ref));
              if (param1 >= -99) {
                kw.d((byte) -40);
              }
              vd.field_c = nl.field_p;
              dn.field_yb = sm.field_q;
              ip.field_a = wj.field_A;
              kf.field_Eb = vc.field_y;
              if (dr.field_a &&
                1 == vd.field_c) {
                stackIn_26_0 = 1;
              } else {
                stackIn_26_0 = 0;
              }
              var2 = stackIn_26_0;
            }
          }
        } else {
          if (param0 &&
            !dr.field_a) {
            rm.a(false);
            if (!dr.field_a) {
              wt.field_x = el.field_A;
              us.field_j = n.field_m;
            } else {
              if (320 != el.field_A ||
                n.field_m != 240) {
                wt.field_x = wt.field_x + (el.field_A - 320);
                us.field_j = us.field_j + (-240 + n.field_m);
                wt.field_x = Math.max(0, Math.min(639, wt.field_x));
                us.field_j = Math.max(0, Math.min(479, us.field_j));
                if (e.field_m == null) {
                  stackIn_126_0 = ic.field_d;
                } else {
                  stackIn_126_0 = e.field_m;
                }
                var2_ref = stackIn_126_0;
                oo.field_c.a((byte) 68, 240, 320, (java.awt.Component) (var2_ref));
              }
            }
            if (param1 >= -99) {
              kw.d((byte) -40);
            }
            vd.field_c = nl.field_p;
            dn.field_yb = sm.field_q;
            ip.field_a = wj.field_A;
            kf.field_Eb = vc.field_y;
            if (dr.field_a &&
              1 == vd.field_c) {
              stackIn_134_0 = 1;
            } else {
              stackIn_134_0 = 0;
            }
            var2 = stackIn_134_0;
            if (var2 != 0 &&
              us.field_k < 6) {
              us.field_k = us.field_k + 2;
            }
            if (var2 == 0 &&
              us.field_k > 0) {
              us.field_k = us.field_k - 2;
            }
            return;
          }
          if (param0) {
            if (!dr.field_a) {
              wt.field_x = el.field_A;
              us.field_j = n.field_m;
              if (param1 >= -99) {
                kw.d((byte) -40);
              }
              vd.field_c = nl.field_p;
              dn.field_yb = sm.field_q;
              ip.field_a = wj.field_A;
              kf.field_Eb = vc.field_y;
              if (dr.field_a &&
                1 == vd.field_c) {
                stackIn_88_0 = 1;
              } else {
                stackIn_88_0 = 0;
              }
              var2 = stackIn_88_0;
            } else {
              if (320 == el.field_A &&
                n.field_m == 240) {
                if (param1 >= -99) {
                  kw.d((byte) -40);
                }
                vd.field_c = nl.field_p;
                dn.field_yb = sm.field_q;
                ip.field_a = wj.field_A;
                kf.field_Eb = vc.field_y;
                if (dr.field_a &&
                  1 == vd.field_c) {
                  stackIn_59_0 = 1;
                } else {
                  stackIn_59_0 = 0;
                }
                var2 = stackIn_59_0;
              } else {
                wt.field_x = wt.field_x + (el.field_A - 320);
                us.field_j = us.field_j + (-240 + n.field_m);
                wt.field_x = Math.max(0, Math.min(639, wt.field_x));
                us.field_j = Math.max(0, Math.min(479, us.field_j));
                if (e.field_m == null) {
                  stackIn_69_0 = ic.field_d;
                } else {
                  stackIn_69_0 = e.field_m;
                }
                var2_ref = stackIn_69_0;
                oo.field_c.a((byte) 68, 240, 320, (java.awt.Component) (var2_ref));
                if (param1 >= -99) {
                  kw.d((byte) -40);
                }
                vd.field_c = nl.field_p;
                dn.field_yb = sm.field_q;
                ip.field_a = wj.field_A;
                kf.field_Eb = vc.field_y;
                if (dr.field_a &&
                  1 == vd.field_c) {
                  stackIn_75_0 = 1;
                } else {
                  stackIn_75_0 = 0;
                }
                var2 = stackIn_75_0;
              }
            }
          } else {
            if (dr.field_a) {
              im.h(634588072);
              if (!dr.field_a) {
                wt.field_x = el.field_A;
                us.field_j = n.field_m;
              } else {
                if (320 != el.field_A ||
                  n.field_m != 240) {
                  wt.field_x = wt.field_x + (el.field_A - 320);
                  us.field_j = us.field_j + (-240 + n.field_m);
                  wt.field_x = Math.max(0, Math.min(639, wt.field_x));
                  us.field_j = Math.max(0, Math.min(479, us.field_j));
                  if (e.field_m == null) {
                    stackIn_104_0 = ic.field_d;
                  } else {
                    stackIn_104_0 = e.field_m;
                  }
                  var2_ref = stackIn_104_0;
                  oo.field_c.a((byte) 68, 240, 320, (java.awt.Component) (var2_ref));
                }
              }
              if (param1 >= -99) {
                kw.d((byte) -40);
              }
              vd.field_c = nl.field_p;
              dn.field_yb = sm.field_q;
              ip.field_a = wj.field_A;
              kf.field_Eb = vc.field_y;
              if (dr.field_a &&
                1 == vd.field_c) {
                stackIn_112_0 = 1;
              } else {
                stackIn_112_0 = 0;
              }
              var2 = stackIn_112_0;
            } else {
              if (!dr.field_a) {
                wt.field_x = el.field_A;
                us.field_j = n.field_m;
                if (param1 >= -99) {
                  kw.d((byte) -40);
                }
                vd.field_c = nl.field_p;
                dn.field_yb = sm.field_q;
                ip.field_a = wj.field_A;
                kf.field_Eb = vc.field_y;
                if (dr.field_a &&
                  1 == vd.field_c) {
                  stackIn_195_0 = 1;
                } else {
                  stackIn_195_0 = 0;
                }
                var2 = stackIn_195_0;
                if (var2 != 0 &&
                  us.field_k < 6) {
                  us.field_k = us.field_k + 2;
                }
                if (var2 == 0 &&
                  us.field_k > 0) {
                  us.field_k = us.field_k - 2;
                  return;
                }
                return;
              }
              if (320 != el.field_A) {
                wt.field_x = wt.field_x + (el.field_A - 320);
                us.field_j = us.field_j + (-240 + n.field_m);
                wt.field_x = Math.max(0, Math.min(639, wt.field_x));
                us.field_j = Math.max(0, Math.min(479, us.field_j));
                if (e.field_m == null) {
                  stackIn_146_0 = ic.field_d;
                } else {
                  stackIn_146_0 = e.field_m;
                }
                var2_ref = stackIn_146_0;
                oo.field_c.a((byte) 68, 240, 320, (java.awt.Component) (var2_ref));
                if (param1 >= -99) {
                  kw.d((byte) -40);
                }
                vd.field_c = nl.field_p;
                dn.field_yb = sm.field_q;
                ip.field_a = wj.field_A;
                kf.field_Eb = vc.field_y;
                if (dr.field_a &&
                  1 == vd.field_c) {
                  stackIn_152_0 = 1;
                } else {
                  stackIn_152_0 = 0;
                }
                var2 = stackIn_152_0;
              } else {
                if (n.field_m == 240) {
                  if (param1 >= -99) {
                    kw.d((byte) -40);
                  }
                  vd.field_c = nl.field_p;
                  dn.field_yb = sm.field_q;
                  ip.field_a = wj.field_A;
                  kf.field_Eb = vc.field_y;
                  if (dr.field_a &&
                    1 == vd.field_c) {
                    stackIn_182_0 = 1;
                  } else {
                    stackIn_182_0 = 0;
                  }
                  var2 = stackIn_182_0;
                } else {
                  wt.field_x = wt.field_x + (el.field_A - 320);
                  us.field_j = us.field_j + (-240 + n.field_m);
                  wt.field_x = Math.max(0, Math.min(639, wt.field_x));
                  us.field_j = Math.max(0, Math.min(479, us.field_j));
                  if (e.field_m == null) {
                    stackIn_163_0 = ic.field_d;
                  } else {
                    stackIn_163_0 = e.field_m;
                  }
                  var2_ref = stackIn_163_0;
                  oo.field_c.a((byte) 68, 240, 320, (java.awt.Component) (var2_ref));
                  if (param1 >= -99) {
                    kw.d((byte) -40);
                  }
                  vd.field_c = nl.field_p;
                  dn.field_yb = sm.field_q;
                  ip.field_a = wj.field_A;
                  kf.field_Eb = vc.field_y;
                  if (dr.field_a &&
                    1 == vd.field_c) {
                    stackIn_169_0 = 1;
                  } else {
                    stackIn_169_0 = 0;
                  }
                  var2 = stackIn_169_0;
                }
              }
            }
          }
        }
        if (var2 != 0 &&
          us.field_k < 6) {
          us.field_k = us.field_k + 2;
        }
        if (var2 == 0 &&
          us.field_k > 0) {
          us.field_k = us.field_k - 2;
        }
    }

    kw(String param0) {
        this.field_e = false;
        this.field_j = false;
        try {
          this.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "kw.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = new String[]{"The Ultimate", "Grass Roots", "Muddying Your Knees", "In the Big Leagues", "Hot on the Heels", "Rising Star", "League of Their Own", "We are the Champions", "Notching up the Goals", "Team Player", "All Kitted Out", "World in Motion", "Aggregate Win", "A Decent Margin", "They Think It's All Over", "Globetrotter", "Beat Your Maker", "The Head of God", "The Untouchables", "Cinq Without a Trace", "A-Team", "Coach's Playbook", "Goldenballs", "Team Goldenballs", "Pinpoint Accuracy", "Blink and You'll Miss It", "Comeback Kid", "All Four One", "Pass and Move", "Don't Stop Me Now", "Save the Day", "Route-One", "Hallowe'en", "One for the Cabinet", "There can be Only One", "Undisputed", "Impenetrable", "I Got a Touch!", "Owned", "Pwned", "Slipping Away", "Holding On", "Never Gonna Give You Up", "Mod Off!", "Trapped", "Trampled", "Stomped", "Grounded", "Flattened", "Splatted", "On a Roll", "Hot Potato", "Brutal Contender", "Slow and Steady Wins the Race", "Diamonds Aren't Forever", "Blitzkrieg!", "Queen's Park", "Topper Harley", "Pacifist", "Slow Coach", "Tactically Superior", "Frontier", "The Wall", "By the Skin of Their Teeth", "It's a Funny Old Game", "Flair for Finishing", "The Veterans", "Slip 'n' Slide", "Keepy-uppy", "Longshot", "Wonder Goal", "Man of the Match", "Up, Under, and In"};
        field_a = "Accept";
        field_g = "Loading extra data (1/2)";
        field_f = new ut(256, 256);
    }
}
