/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wk extends fm {
    static String field_k;
    static String field_n;
    static String field_j;
    static String field_g;
    static ji field_q;
    private String field_h;
    static boolean field_i;
    private long field_m;
    static String field_p;
    static ck field_l;
    static String field_o;

    final static void a(byte param0, tj param1) {
        tj var2 = null;
        int var3 = 0;
        tj var4 = null;
        var3 = client.field_A ? 1 : 0;
        param1.b((byte) 111);
        var4 = (tj) (Object) i.field_b.c((byte) -61);
        var2 = (tj) (Object) i.field_b.c((byte) -61);
        L0: while (true) {
          if (var4 != null) {
            if (var4.a(-985, param1)) {
              var2 = (tj) (Object) i.field_b.d(true);
              continue L0;
            } else {
              if (param0 > 3) {
                if (var2 == null) {
                  i.field_b.a((bh) (Object) param1, 2777);
                  return;
                } else {
                  fm.a((byte) 114, (bh) (Object) param1, (bh) (Object) var2);
                  return;
                }
              } else {
                L1: {
                  wk.c(31);
                  if (var2 != null) {
                    fm.a((byte) 114, (bh) (Object) param1, (bh) (Object) var2);
                    break L1;
                  } else {
                    i.field_b.a((bh) (Object) param1, 2777);
                    break L1;
                  }
                }
                return;
              }
            }
          } else {
            if (param0 > 3) {
              if (var2 == null) {
                i.field_b.a((bh) (Object) param1, 2777);
                return;
              } else {
                fm.a((byte) 114, (bh) (Object) param1, (bh) (Object) var2);
                return;
              }
            } else {
              L2: {
                wk.c(31);
                if (var2 != null) {
                  fm.a((byte) 114, (bh) (Object) param1, (bh) (Object) var2);
                  break L2;
                } else {
                  i.field_b.a((bh) (Object) param1, 2777);
                  break L2;
                }
              }
              return;
            }
          }
        }
    }

    final static int b(int param0) {
        if (param0 != 3) {
            field_k = null;
            return -ad.field_a + fb.field_f;
        }
        return -ad.field_a + fb.field_f;
    }

    gh a(int param0) {
        if (param0 != 18) {
            Object var3 = null;
            wk.a(124, -86, (ff) null);
            return ui.field_t;
        }
        return ui.field_t;
    }

    final static void a(int param0, int param1, ff param2) {
        if (param0 != 3) {
          field_i = false;
          cd.field_c.a((bh) (Object) param2, 2777);
          mc.a(true, param2, param1);
          return;
        } else {
          cd.field_c.a((bh) (Object) param2, 2777);
          mc.a(true, param2, param1);
          return;
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = client.field_A ? 1 : 0;
        var3 = -84 / ((param0 - 5) / 54);
        var4 = param1;
        if (0 != var4) {
          if (var4 != 1) {
            if (var4 != 2) {
              if (3 != var4) {
                return;
              } else {
                uf.g(param2, -2093);
                return;
              }
            } else {
              bl.b(param2, 12618);
              return;
            }
          } else {
            h.a(param2, false);
            return;
          }
        } else {
          da.a(param2, true);
          return;
        }
    }

    final void a(wl param0, byte param1) {
        param0.a(((wk) this).field_m, (byte) 0);
        if (param1 < 34) {
            return;
        }
        param0.a(((wk) this).field_h, true);
    }

    public static void c(int param0) {
        Object var2 = null;
        field_o = null;
        field_g = null;
        if (param0 != 7751) {
          var2 = null;
          wk.a(12, -125, (ff) null);
          field_q = null;
          field_p = null;
          field_j = null;
          field_k = null;
          field_l = null;
          field_n = null;
          return;
        } else {
          field_q = null;
          field_p = null;
          field_j = null;
          field_k = null;
          field_l = null;
          field_n = null;
          return;
        }
    }

    wk(long param0, String param1) {
        ((wk) this).field_m = param0;
        ((wk) this).field_h = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "<%0> has entered a game.";
        field_n = "Send private message";
        field_o = "Remove name";
        field_k = "Offensive account name";
        field_j = "Searching for an opponent";
        field_p = "Message lobby";
    }
}
