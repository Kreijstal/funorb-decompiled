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
        mc var6 = null;
        m var6_ref = null;
        int var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
            if (1 > ((ol) this).field_b) {
                throw new IllegalStateException();
            }
            this.a(false, param0);
            ((ol) this).field_k = ((ol) this).field_k - 1;
            while (((ol) this).field_k < 0) {
                var6 = (mc) (Object) ((ol) this).field_c.a((byte) -20);
                int discarded$0 = -88;
                this.a(var6);
            }
            var6_ref = new m(param3, 1);
            ((ol) this).field_h.a((oh) (Object) var6_ref, true, param0);
            ((ol) this).field_c.a((df) (Object) var6_ref, 6);
            ((mc) (Object) var6_ref).field_l = 0L;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "ol.A(" + param0 + ',' + 1 + ',' + 0 + ',' + (param3 != null ? "{...}" : "null") + ')');
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
            int discarded$10 = -124;
            if (!ih.b()) {
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
            int discarded$11 = -124;
            if (!ih.b()) {
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

    final static os a() {
        go.field_E = new os(5, 5, 500, 45);
        ad var1 = new ad();
        go.field_E.field_v = (jk) (Object) var1;
        ff var2 = new ff(15, 10, 36, 36, (bi) null);
        go.field_E.a((vd) (Object) var2, 8);
        var1.field_e = var2;
        bd var3 = new bd(15, 5 - (-(go.field_E.field_i / 2) - -(rs.field_Cb.field_J / 2)), 450, rs.field_Cb.field_J, (String) null, 0);
        bd var4 = new bd(15, go.field_E.field_i - rs.field_Cb.field_J, 450, rs.field_Cb.field_J, (String) null, 2);
        var1.field_f = var3;
        go.field_E.a((vd) (Object) var3, 8);
        go.field_E.a((vd) (Object) var4, 8);
        return go.field_E;
    }

    private final void a(mc param0) {
        RuntimeException var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            if (param0 != null) {
              param0.b((byte) -126);
              param0.a(16);
              ((ol) this).field_k = ((ol) this).field_k + param0.field_p;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ol.E(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw r.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + -88 + ')');
        }
    }

    private final void a(boolean param0, long param1) {
        mc var4 = (mc) (Object) ((ol) this).field_h.a(-99, param1);
        int discarded$0 = -88;
        this.a(var4);
    }

    ol(int param0) {
        this(param0, param0);
    }

    final void a(long param0, Object param1, byte param2) {
        if (param2 != -108) {
            return;
        }
        try {
            this.a(param0, 1, 0, param1);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "ol.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
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
              return;
            }
          } else {
            ((ol) this).field_h = new rm(var3);
            return;
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
