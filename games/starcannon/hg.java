/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg extends vk implements qk, ga {
    private dk field_C;
    kd field_z;
    private dk field_E;
    private ng field_A;
    static String field_D;
    static tk field_y;

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_D = null;
        field_y = null;
    }

    private final void h(byte param0) {
        if (param0 <= 116) {
            return;
        }
        if (!this.g((byte) -126)) {
            return;
        }
        bf.a((byte) 79, ((hg) this).field_A.field_k);
    }

    final void a(int param0, int param1, uj param2, int param3) {
        super.a(116, param1, param2, param3);
        ((hg) this).field_E.field_u = this.g((byte) -110);
        if (param0 <= 27) {
            boolean discarded$0 = this.g((byte) 3);
        }
    }

    private final int a(int param0, int param1, int param2, int param3, uj param4, String param5, String param6) {
        pa var9 = null;
        ad var10 = null;
        if (param0 != 0) {
          boolean discarded$1 = this.g((byte) -31);
          var10 = new ad(20, param1, param2 + 120, 25, param4, false, 120, 3, nb.field_c, 16777215, param6);
          ((hg) this).a(true, (uj) (Object) var10);
          var9 = new pa(((ub) (Object) param4).a(false), param5, 126, var10.field_f + param1, param2 + 25, param3);
          var9.field_g = (qg) this;
          ((hg) this).a(true, (uj) (Object) var9);
          return var9.field_f + var10.field_f;
        } else {
          var10 = new ad(20, param1, param2 + 120, 25, param4, false, 120, 3, nb.field_c, 16777215, param6);
          ((hg) this).a(true, (uj) (Object) var10);
          var9 = new pa(((ub) (Object) param4).a(false), param5, 126, var10.field_f + param1, param2 + 25, param3);
          var9.field_g = (qg) this;
          ((hg) this).a(true, (uj) (Object) var9);
          return var9.field_f + var10.field_f;
        }
    }

    final static vc b(int param0, int param1, int param2, int param3, int param4) {
        vc var5 = null;
        vc var5_ref = null;
        int var6 = 0;
        var6 = StarCannon.field_A;
        var5 = (vc) (Object) ne.field_c.c(-3905);
        L0: while (true) {
          if (var5 == null) {
            var5_ref = new vc();
            var5_ref.field_i = param1;
            var5_ref.field_l = param2;
            var5_ref.field_h = param4;
            ne.field_c.b(117, (rf) (Object) var5_ref);
            if (param3 >= -68) {
              field_D = null;
              ea.a((byte) 70, var5_ref, param0);
              return var5_ref;
            } else {
              ea.a((byte) 70, var5_ref, param0);
              return var5_ref;
            }
          } else {
            if (var5.field_i == param1) {
              return var5;
            } else {
              var5 = (vc) (Object) ne.field_c.a(-16913);
              continue L0;
            }
          }
        }
    }

    final static ld a(int param0, String param1) {
        Object var3 = null;
        ld var3_ref = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        CharSequence var10 = null;
        CharSequence var11 = null;
        CharSequence var12 = null;
        CharSequence var13 = null;
        var3 = null;
        var5 = StarCannon.field_A;
        if (m.field_d != null) {
          if (param1 != null) {
            if (param1.length() != 0) {
              if (param0 == 120) {
                var12 = (CharSequence) (Object) param1;
                var8 = ni.a(param0 ^ 21, var12);
                if (var8 != null) {
                  var3_ref = (ld) (Object) m.field_d.a((long)var8.hashCode(), 26);
                  L0: while (true) {
                    if (var3_ref != null) {
                      var13 = (CharSequence) (Object) var3_ref.field_kb;
                      var9 = ni.a(108, var13);
                      if (var9.equals((Object) (Object) var8)) {
                        return var3_ref;
                      } else {
                        var3_ref = (ld) (Object) m.field_d.b(param0 ^ 121);
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
                hg.a(false);
                var10 = (CharSequence) (Object) param1;
                var6 = ni.a(param0 ^ 21, var10);
                if (var6 != null) {
                  var3_ref = (ld) (Object) m.field_d.a((long)var6.hashCode(), 26);
                  L1: while (true) {
                    if (var3_ref != null) {
                      var11 = (CharSequence) (Object) var3_ref.field_kb;
                      var7 = ni.a(108, var11);
                      if (var7.equals((Object) (Object) var6)) {
                        return var3_ref;
                      } else {
                        var3_ref = (ld) (Object) m.field_d.b(param0 ^ 121);
                        continue L1;
                      }
                    } else {
                      return null;
                    }
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
    }

    private final boolean a(byte param0, ub param1) {
        he var3 = null;
        p var4 = null;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        var3 = param1.a(false);
        if (var3 == null) {
          return true;
        } else {
          if (param0 != 79) {
            L0: {
              ((hg) this).a(12);
              var4 = var3.b((byte) -123);
              if (var4 != bf.field_x) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                stackOut_9_0 = 1;
                stackIn_11_0 = stackOut_9_0;
                break L0;
              }
            }
            return stackIn_11_0 != 0;
          } else {
            L1: {
              var4 = var3.b((byte) -123);
              if (var4 != bf.field_x) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L1;
              }
            }
            return stackIn_7_0 != 0;
          }
        }
    }

    public final void a(String param0, byte param1) {
        if (param1 > -120) {
            return;
        }
        ng var3 = ((hg) this).field_A;
        String var4 = param0;
        ((fe) (Object) var3).a((byte) -91, false, var4);
    }

    private final boolean g(byte param0) {
        if (param0 <= -79) {
          if (!this.a((byte) 79, (ub) (Object) ((hg) this).field_A)) {
            return false;
          } else {
            return true;
          }
        } else {
          ((hg) this).a(113);
          if (!this.a((byte) 79, (ub) (Object) ((hg) this).field_A)) {
            return false;
          } else {
            return true;
          }
        }
    }

    public hg() {
        super(0, 0, 496, 0, (de) null);
        ((hg) this).field_A = new ng("", (qg) null, 12);
        hd var1 = new hd(nb.field_b, 0, 0, 0, 0, 16777215, -1, 3, 0, nb.field_c.field_p, -1, 2147483647, true);
        uj var2 = new uj(ih.field_f, (de) (Object) var1, (qg) null);
        ((hg) this).field_E = new dk(rc.field_b, (qg) null);
        ((hg) this).field_C = new dk(ta.field_d, (qg) null);
        ((hg) this).field_A.field_p = ld.field_jb;
        ((hg) this).field_A.a((he) (Object) new nd((fe) (Object) ((hg) this).field_A), 0);
        ((hg) this).field_E.field_u = false;
        ((hg) this).field_E.field_o = (de) (Object) new gb();
        ((hg) this).field_C.field_o = (de) (Object) new wa();
        ((hg) this).field_A.field_o = (de) (Object) new fh(10000536);
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(20, 270, (byte) 121, 50, var3);
        ((hg) this).a(true, var2);
        var3 += 50;
        var3 = var3 + (5 + this.a(var3, (byte) 27, (uj) (Object) ((hg) this).field_A, d.field_c, 170, tg.field_w));
        ((hg) this).field_E.a(496 - var5 >> 1475324961, var5, (byte) 127, 40, var3);
        ((hg) this).field_C.a(var4 - -3, 60, (byte) 119, 40, var3 + 15);
        ((hg) this).field_C.field_g = (qg) this;
        ((hg) this).field_E.field_g = (qg) this;
        ((hg) this).a(true, (uj) (Object) ((hg) this).field_E);
        ((hg) this).a(true, (uj) (Object) ((hg) this).field_C);
        ((hg) this).field_z = new kd((qk) this);
        ((hg) this).field_z.a(((hg) this).field_A.field_i + (((hg) this).field_A.field_s - -60), -((hg) this).field_A.field_i + -((hg) this).field_A.field_s + (((hg) this).field_i + -60), (byte) 122, 150, 20);
        ((hg) this).a(true, (uj) (Object) ((hg) this).field_z);
        ((hg) this).a(0, 496, (byte) 116, var4 + var3 + 55, 0);
    }

    public final void a(int param0) {
        Object var3 = null;
        if (param0 != -12920) {
          var3 = null;
          int discarded$2 = this.a(-86, (byte) 31, (uj) null, (String) null, 79, (String) null);
          ((nd) (Object) ((hg) this).field_A.a(false)).f(param0 ^ 31293);
          return;
        } else {
          ((nd) (Object) ((hg) this).field_A.a(false)).f(param0 ^ 31293);
          return;
        }
    }

    final boolean a(uj param0, char param1, byte param2, int param3) {
        if (super.a(param0, param1, param2, param3)) {
          return true;
        } else {
          if ((param3 ^ -1) != -99) {
            if (99 != param3) {
              return false;
            } else {
              return ((hg) this).a((byte) -103, param0);
            }
          } else {
            return ((hg) this).b(param2 ^ 44, param0);
          }
        }
    }

    private final int a(int param0, byte param1, uj param2, String param3, int param4, String param5) {
        if (param1 != 27) {
          ((hg) this).field_z = null;
          return this.a(0, param0, param4, 35, param2, param5, param3);
        } else {
          return this.a(0, param0, param4, 35, param2, param5, param3);
        }
    }

    public final void a(dk param0, int param1, boolean param2, int param3, int param4) {
        if (!param2) {
          if (param0 != ((hg) this).field_C) {
            if (((hg) this).field_E != param0) {
              return;
            } else {
              this.h((byte) 118);
              return;
            }
          } else {
            ag.k(-1108);
            return;
          }
        } else {
          field_y = null;
          if (param0 != ((hg) this).field_C) {
            if (((hg) this).field_E != param0) {
              return;
            } else {
              this.h((byte) 118);
              return;
            }
          } else {
            ag.k(-1108);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "Difficulty - HARD";
    }
}
