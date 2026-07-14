/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql extends af {
    static String[] field_s;
    private bf field_w;
    static int[] field_q;
    static o field_p;
    private bf[] field_t;
    static gj field_r;
    static String field_u;
    static int field_v;

    final void a(byte param0, o param1) {
        bf[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        bf var6 = null;
        int var7 = 0;
        bf[] var8 = null;
        var7 = SolKnight.field_L ? 1 : 0;
        var4 = 12 / ((param0 - 14) / 55);
        var8 = ((ql) this).field_t;
        var3 = var8;
        var5 = 0;
        L0: while (true) {
          if (var8.length <= var5) {
            return;
          } else {
            var6 = var8[var5];
            if (var6 != null) {
              var6.field_k = param1;
              var5++;
              continue L0;
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    public final void a(byte param0, int param1, boolean param2, int param3, rc param4) {
        bf var7 = null;
        bf var9 = null;
        pj var10 = null;
        bf var11 = null;
        bf var12 = null;
        bf var13 = null;
        bf var14 = null;
        rc stackIn_5_0 = null;
        rc stackOut_4_0 = null;
        Object stackOut_3_0 = null;
        if (param0 >= 113) {
          L0: {
            if (param4 instanceof pj) {
              stackOut_4_0 = (rc) param4;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_5_0 = (rc) (Object) stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var10 = (pj) (Object) stackIn_5_0;
            kf.a((byte) 97, param3 + param4.field_m, param1 - -param4.field_j, param3 - -param4.field_m - -param4.field_t, param4.field_x + (param4.field_j + param1));
            if (var10 == null) {
              break L1;
            } else {
              param2 = param2 & var10.field_B;
              break L1;
            }
          }
          L2: {
            var7 = ((ql) this).field_t[0];
            ((ql) this).field_w.a(36);
            var7.a(((ql) this).field_w, param3, param4, -2147483648, param1, (ql) this);
            if (var10 == null) {
              break L2;
            } else {
              L3: {
                if (!var10.field_F) {
                  break L3;
                } else {
                  var11 = ((ql) this).field_t[1];
                  if (var11 == null) {
                    break L3;
                  } else {
                    var11.a(((ql) this).field_w, param3, param4, -2147483648, param1, (ql) this);
                    break L3;
                  }
                }
              }
              if (var10.field_v) {
                L4: {
                  var12 = ((ql) this).field_t[3];
                  if (var10.field_u == 0) {
                    break L4;
                  } else {
                    if (var12 == null) {
                      break L4;
                    } else {
                      var12.a(((ql) this).field_w, param3, param4, -2147483648, param1, (ql) this);
                      break L2;
                    }
                  }
                }
                var9 = ((ql) this).field_t[2];
                if (var9 == null) {
                  break L2;
                } else {
                  var9.a(((ql) this).field_w, param3, param4, -2147483648, param1, (ql) this);
                  break L2;
                }
              } else {
                break L2;
              }
            }
          }
          L5: {
            if (param4.b(true)) {
              var13 = ((ql) this).field_t[5];
              if (var13 != null) {
                var13.a(((ql) this).field_w, param3, param4, -2147483648, param1, (ql) this);
                break L5;
              } else {
                break L5;
              }
            } else {
              break L5;
            }
          }
          L6: {
            if (!param2) {
              var14 = ((ql) this).field_t[4];
              if (var14 != null) {
                var14.a(((ql) this).field_w, param3, param4, -2147483648, param1, (ql) this);
                break L6;
              } else {
                break L6;
              }
            } else {
              break L6;
            }
          }
          ((ql) this).field_w.a(108, param1, param3, (ql) this, param4);
          mf.e(4096);
          return;
        } else {
          return;
        }
    }

    final bf a(byte param0, int param1) {
        if (param0 > -37) {
            return null;
        }
        ((ql) this).field_t[param1] = new bf();
        return new bf();
    }

    private final void a(ql param0, boolean param1, int param2) {
        int var4 = 0;
        bf var5 = null;
        bf var6 = null;
        int var7 = 0;
        Object var8 = null;
        bf stackIn_6_0 = null;
        bf stackIn_7_0 = null;
        bf stackIn_8_0 = null;
        bf stackIn_8_1 = null;
        bf stackOut_5_0 = null;
        bf stackOut_7_0 = null;
        bf stackOut_7_1 = null;
        bf stackOut_6_0 = null;
        bf stackOut_6_1 = null;
        L0: {
          var7 = SolKnight.field_L ? 1 : 0;
          super.a((af) (Object) param0, 6935);
          if (param1) {
            var4 = 0;
            L1: while (true) {
              if ((var4 ^ -1) <= -7) {
                break L0;
              } else {
                var5 = ((ql) this).field_t[var4];
                if (var5 == null) {
                  param0.field_t[var4] = null;
                  var4++;
                  continue L1;
                } else {
                  L2: {
                    var6 = param0.field_t[var4];
                    stackOut_5_0 = (bf) var5;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var6 == null) {
                      param0.field_t[var4] = new bf();
                      stackOut_7_0 = (bf) (Object) stackIn_7_0;
                      stackOut_7_1 = new bf();
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      break L2;
                    } else {
                      stackOut_6_0 = (bf) (Object) stackIn_6_0;
                      stackOut_6_1 = (bf) var6;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      break L2;
                    }
                  }
                  ((bf) (Object) stackIn_8_0).a(stackIn_8_1, 2);
                  var4++;
                  continue L1;
                }
              }
            }
          } else {
            fk.a((Object[]) (Object) ((ql) this).field_t, 0, (Object[]) (Object) param0.field_t, 0, 6);
            break L0;
          }
        }
        L3: {
          if (param2 == 30089) {
            break L3;
          } else {
            var8 = null;
            ((ql) this).a((byte) 62, (o[]) null);
            break L3;
          }
        }
    }

    final void a(byte param0, o[] param1) {
        bf[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        bf var6 = null;
        int var7 = 0;
        bf[] var8 = null;
        var7 = SolKnight.field_L ? 1 : 0;
        var8 = ((ql) this).field_t;
        var3 = var8;
        var4 = -51 % ((param0 - -26) / 48);
        var5 = 0;
        L0: while (true) {
          if (var8.length <= var5) {
            return;
          } else {
            var6 = var8[var5];
            if (var6 != null) {
              var6.field_j = param1;
              var5++;
              continue L0;
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    public static void e(int param0) {
        field_r = null;
        field_q = null;
        field_p = null;
        if (param0 != 1) {
            return;
        }
        field_s = null;
        field_u = null;
    }

    public ql() {
        ((ql) this).field_t = new bf[6];
        ((ql) this).field_w = new bf();
        ((ql) this).field_t[0] = new bf();
        bf var1 = new bf();
        var1.a(36);
    }

    final static void d(int param0) {
        u.field_b.j(1);
        if (!(pc.field_b != null)) {
            pc.field_b = new lb(u.field_b, v.field_a);
        }
        u.field_b.b((rc) (Object) pc.field_b, -120);
        if (param0 != 18962) {
            field_p = null;
        }
    }

    final void a(byte param0, int param1, o[] param2) {
        if (param0 != -60) {
            return;
        }
        int var4 = param1;
        if (!(null != ((ql) this).field_t[var4])) {
            ((ql) this).field_t[var4] = new bf();
        }
        ((ql) this).field_t[param1].field_j = param2;
    }

    ql(ql param0, boolean param1) {
        this();
        param0.a((ql) this, param1, 30089);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = new String[]{"Exciting new weapons", "Fullscreen mode", "No adverts"};
        field_q = new int[4];
        field_u = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_v = -1;
    }
}
