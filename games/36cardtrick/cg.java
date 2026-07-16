/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class cg extends k implements pi {
    static lh field_e;
    static int field_h;
    static kc field_i;
    private hf field_g;
    static boolean field_f;

    final static boolean a(int param0, char param1) {
        char[] var10 = null;
        char[] var7 = null;
        char[] var6 = null;
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        char[] var11 = null;
        char[] var8 = null;
        char[] var12 = null;
        char[] var9 = null;
        int var5 = Main.field_T;
        if (param1 > 0) {
            if (param1 < 128) {
                return true;
            }
            if (param1 < 160) {
                if (0 != param1) {
                    var10 = se.field_K;
                    var7 = var10;
                    var6 = var7;
                    var2 = var6;
                    for (var3 = 0; var10.length > var3; var3++) {
                        var4 = var10[var3];
                        if (param1 == var4) {
                            return true;
                        }
                    }
                }
                if (param0 >= 94) {
                    return false;
                }
                field_f = true;
                return false;
            }
            if (param1 > 255) {
                if (0 != param1) {
                    var11 = se.field_K;
                    var8 = var11;
                    var6 = var8;
                    var2 = var6;
                    for (var3 = 0; var11.length > var3; var3++) {
                        var4 = var11[var3];
                        if (param1 == var4) {
                            return true;
                        }
                    }
                }
                if (param0 < 94) {
                    field_f = true;
                    return false;
                }
                return false;
            }
            return true;
        }
        if (param1 >= 160) {
            if (param1 <= 255) {
                return true;
            }
        }
        if (0 != param1) {
            var12 = se.field_K;
            var9 = var12;
            var6 = var9;
            var2 = var6;
            for (var3 = 0; var12.length > var3; var3++) {
                var4 = var12[var3];
                if (param1 == var4) {
                    return true;
                }
            }
        }
        if (param0 < 94) {
            field_f = true;
            return false;
        }
        return false;
    }

    public static void f(int param0) {
        field_e = null;
        if (param0 != 1) {
            return;
        }
        field_i = null;
    }

    public final boolean a(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 <= -1) {
          if (null != ((cg) this).field_g.field_r) {
            if (((cg) this).field_g.field_r.length() == 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          ((cg) this).field_g = null;
          if (null == ((cg) this).field_g.field_r) {
            return true;
          } else {
            L0: {
              if (((cg) this).field_g.field_r.length() != 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final sg e(int param0) {
        if (param0 != 14) {
          field_i = null;
          return ((cg) this).a(((cg) this).field_g.field_r, -103);
        } else {
          return ((cg) this).a(((cg) this).field_g.field_r, -103);
        }
    }

    abstract sg a(String param0, int param1);

    final static aj b(boolean param0) {
        L0: {
          if (aj.field_a == null) {
            aj.field_a = new aj();
            aj.field_a.a(-1, j.field_C);
            aj.field_a.field_d = 2763306;
            aj.field_a.field_e = 0;
            aj.field_a.field_l = 6;
            aj.field_a.field_o = me.field_c;
            aj.field_a.field_g = 7697781;
            aj.field_a.field_f = 4;
            aj.field_a.field_j = 5;
            aj.field_a.field_c = 14;
            break L0;
          } else {
            break L0;
          }
        }
        if (!param0) {
          return null;
        } else {
          return aj.field_a;
        }
    }

    public final void a(hf param0, int param1) {
        ((cg) this).a(-98);
        if (param1 != 12891) {
            field_f = true;
        }
    }

    public final void a(int param0, hf param1) {
        if (param0 != -1) {
            boolean discarded$0 = ((cg) this).a((byte) -37);
        }
    }

    final String d(int param0) {
        if (param0 != -5777) {
            return null;
        }
        return ((cg) this).a(((cg) this).field_g.field_r, false);
    }

    abstract String a(String param0, boolean param1);

    cg(hf param0) {
        ((cg) this).field_g = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new lh(1);
    }
}
