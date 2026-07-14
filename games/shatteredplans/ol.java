/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol {
    static String field_i;
    private int field_k;
    private rm field_h;
    static String field_j;
    static String field_f;
    static int field_e;
    static int[] field_a;
    static sq field_g;
    static String field_l;
    private up field_c;
    private int field_b;
    static String field_d;

    private final void a(long param0, int param1, int param2, Object param3) {
        m var6 = null;
        mc var6_ref = null;
        int var7 = 0;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param1 > ((ol) this).field_b) {
          throw new IllegalStateException();
        } else {
          this.a(false, param0);
          ((ol) this).field_k = ((ol) this).field_k - param1;
          L0: while (true) {
            if ((((ol) this).field_k ^ -1) <= -1) {
              var6 = new m(param3, param1);
              ((ol) this).field_h.a((oh) (Object) var6, true, param0);
              ((ol) this).field_c.a((df) (Object) var6, 6);
              ((mc) (Object) var6).field_l = (long)param2;
              return;
            } else {
              var6_ref = (mc) (Object) ((ol) this).field_c.a((byte) -20);
              this.a(var6_ref, (byte) -88);
              continue L0;
            }
          }
        }
    }

    final Object a(long param0, int param1) {
        Object var5 = null;
        m var6 = null;
        mc var7 = null;
        Object var8 = null;
        Object var9 = null;
        var7 = (mc) (Object) ((ol) this).field_h.a(-78, param0);
        if (param1 == 0) {
          if (var7 != null) {
            var9 = var7.e((byte) -111);
            if (var9 == null) {
              var7.b((byte) -123);
              var7.a(param1 + 16);
              ((ol) this).field_k = ((ol) this).field_k + var7.field_p;
              return null;
            } else {
              if (var7.e(false)) {
                var6 = new m(var9, var7.field_p);
                ((ol) this).field_h.a((oh) (Object) var6, true, var7.field_b);
                ((ol) this).field_c.a((df) (Object) var6, 6);
                ((mc) (Object) var6).field_l = 0L;
                var7.b((byte) -96);
                var7.a(16);
                return var9;
              } else {
                ((ol) this).field_c.a((df) (Object) var7, 6);
                var7.field_l = 0L;
                return var9;
              }
            }
          } else {
            return null;
          }
        } else {
          ol.a(true);
          if (var7 != null) {
            var8 = var7.e((byte) -111);
            var5 = var8;
            if (var8 == null) {
              var7.b((byte) -123);
              var7.a(param1 + 16);
              ((ol) this).field_k = ((ol) this).field_k + var7.field_p;
              return null;
            } else {
              if (var7.e(false)) {
                var6 = new m(var8, var7.field_p);
                ((ol) this).field_h.a((oh) (Object) var6, true, var7.field_b);
                ((ol) this).field_c.a((df) (Object) var6, 6);
                ((mc) (Object) var6).field_l = 0L;
                var7.b((byte) -96);
                var7.a(16);
                return var8;
              } else {
                ((ol) this).field_c.a((df) (Object) var7, 6);
                var7.field_l = 0L;
                return var8;
              }
            }
          } else {
            return null;
          }
        }
    }

    final static boolean a(int param0) {
        int stackIn_8_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 < -79) {
          if (null == hp.field_m) {
            if (!ih.b(-124)) {
              if (tc.field_G == null) {
                if (ep.a(640)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_18_0 = 1;
                stackIn_20_0 = stackOut_18_0;
                return stackIn_20_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          ol.a(true);
          if (null == hp.field_m) {
            if (!ih.b(-124)) {
              if (tc.field_G == null) {
                if (ep.a(640)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                return stackIn_8_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final static void b(byte param0) {
        ae.field_f.b((vg) (Object) new cq(), 127);
        if (param0 >= -76) {
            ol.a(false);
        }
    }

    final static os a(byte param0) {
        ad var1 = null;
        ff var2 = null;
        bd var3 = null;
        bd var4 = null;
        go.field_E = new os(5, 5, 500, 45);
        var1 = new ad();
        go.field_E.field_v = (jk) (Object) var1;
        if (param0 != 69) {
          return null;
        } else {
          var2 = new ff(15, 10, 36, 36, (bi) null);
          go.field_E.a((vd) (Object) var2, 8);
          var1.field_e = var2;
          var3 = new bd(15, 5 - (-(go.field_E.field_i / 2) - -(rs.field_Cb.field_J / 2)), 450, rs.field_Cb.field_J, (String) null, 0);
          var4 = new bd(15, go.field_E.field_i - rs.field_Cb.field_J, 450, rs.field_Cb.field_J, (String) null, 2);
          var1.field_f = var3;
          go.field_E.a((vd) (Object) var3, 8);
          go.field_E.a((vd) (Object) var4, param0 ^ 77);
          return go.field_E;
        }
    }

    private final void a(mc param0, byte param1) {
        if (param1 != -88) {
          L0: {
            Object discarded$12 = ((ol) this).a(89L, -55);
            if (param0 != null) {
              param0.b((byte) -126);
              param0.a(16);
              ((ol) this).field_k = ((ol) this).field_k + param0.field_p;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (param0 != null) {
              param0.b((byte) -126);
              param0.a(16);
              ((ol) this).field_k = ((ol) this).field_k + param0.field_p;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    private final void a(boolean param0, long param1) {
        mc var4 = (mc) (Object) ((ol) this).field_h.a(-99, param1);
        this.a(var4, (byte) -88);
        if (param0) {
            field_l = null;
            return;
        }
    }

    ol(int param0) {
        this(param0, param0);
    }

    final void a(long param0, Object param1, byte param2) {
        if (param2 != -108) {
            return;
        }
        this.a(param0, 1, 0, param1);
    }

    public static void a(boolean param0) {
        field_j = null;
        field_a = null;
        field_d = null;
        field_f = null;
        if (param0) {
          ol.b((byte) -77);
          field_i = null;
          field_l = null;
          field_g = null;
          return;
        } else {
          field_i = null;
          field_l = null;
          field_g = null;
          return;
        }
    }

    private ol(int param0, int param1) {
        int var3 = 0;
        ((ol) this).field_c = new up();
        ((ol) this).field_k = param0;
        ((ol) this).field_b = param0;
        var3 = 1;
        L0: while (true) {
          if (param0 > var3 + var3) {
            if (param1 > var3) {
              var3 = var3 + var3;
              continue L0;
            } else {
              ((ol) this).field_h = new rm(var3);
            }
          } else {
            ((ol) this).field_h = new rm(var3);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_f = "Invite <%0> to this game";
        field_j = "Warning";
        field_l = "Select a friendly system to construct a defense grid, or right click to cancel this project.";
        field_d = "Passwords can only contain letters and numbers";
    }
}
