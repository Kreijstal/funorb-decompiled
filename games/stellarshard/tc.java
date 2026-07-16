/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc extends id {
    private db[] field_x;
    static int field_r;
    static int field_p;
    static int field_v;
    static int field_w;
    static java.applet.Applet field_u;
    private db field_t;
    static int[] field_s;
    static String field_q;

    final static String c(int param0) {
        if (!(dj.field_a != o.field_l)) {
            return lc.field_p;
        }
        if (!(dj.field_a != el.field_E)) {
            return gk.field_c;
        }
        if (param0 != -5) {
            field_p = -104;
        }
        if (!(al.field_f.a(true))) {
            return gk.field_c;
        }
        return va.field_a;
    }

    final db a(byte param0, int param1) {
        int var3 = -43 % ((param0 - 73) / 41);
        db dupTemp$0 = new db();
        ((tc) this).field_x[param1] = dupTemp$0;
        return dupTemp$0;
    }

    final static void a(kl param0, int param1, boolean param2) {
        nl.field_e.b(-104, (gg) (Object) param0);
        if (param2) {
            field_u = null;
        }
        ca.a(param1, param0, (byte) 71);
    }

    tc(tc param0, boolean param1) {
        this();
        param0.a(param1, -59, (tc) this);
    }

    public static void e(int param0) {
        if (param0 > -52) {
            return;
        }
        field_s = null;
        field_u = null;
        field_q = null;
    }

    final void a(int param0, pb[] param1) {
        db[] var3 = null;
        int var4 = 0;
        db var5 = null;
        int var6 = 0;
        db[] var7 = null;
        L0: {
          var6 = stellarshard.field_B;
          var7 = ((tc) this).field_x;
          var3 = var7;
          if (param0 < -64) {
            break L0;
          } else {
            ((tc) this).field_t = null;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var7.length <= var4) {
            return;
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_d = param1;
              var4++;
              continue L1;
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final static void d(int param0) {
        if (param0 != 1) {
            field_p = 121;
        }
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = stellarshard.field_B;
          if (param1 >= 124) {
            break L0;
          } else {
            field_q = null;
            break L0;
          }
        }
        L1: {
          kc.field_b = 0;
          k.field_b = null;
          dl.field_A = null;
          var2 = ll.field_b;
          ll.field_b = l.field_b;
          od.field_v.field_i = od.field_v.field_i + 1;
          if ((param0 ^ -1) == -52) {
            od.field_v.field_g = 2;
            break L1;
          } else {
            if (-51 != (param0 ^ -1)) {
              od.field_v.field_g = 1;
              break L1;
            } else {
              od.field_v.field_g = 5;
              break L1;
            }
          }
        }
        L2: {
          l.field_b = var2;
          if (-3 < (od.field_v.field_i ^ -1)) {
            break L2;
          } else {
            if (51 != param0) {
              break L2;
            } else {
              return 2;
            }
          }
        }
        L3: {
          if (2 > od.field_v.field_i) {
            break L3;
          } else {
            if (param0 == 50) {
              return 5;
            } else {
              break L3;
            }
          }
        }
        if ((od.field_v.field_i ^ -1) <= -5) {
          return 1;
        } else {
          return -1;
        }
    }

    public tc() {
        ((tc) this).field_x = new db[6];
        ((tc) this).field_t = new db();
        db dupTemp$0 = new db();
        ((tc) this).field_x[0] = dupTemp$0;
        db var1 = dupTemp$0;
        var1.a((byte) 62);
    }

    final void a(int param0, int param1, pb[] param2) {
        int var4 = param0;
        if (((tc) this).field_x[var4] == null) {
            ((tc) this).field_x[var4] = new db();
        }
        ((tc) this).field_x[param0].field_d = param2;
        var4 = -105 % ((param1 - 56) / 32);
    }

    final void a(boolean param0, pb param1) {
        db[] var3 = null;
        int var4 = 0;
        db var5 = null;
        int var6 = 0;
        db[] var7 = null;
        var6 = stellarshard.field_B;
        var7 = ((tc) this).field_x;
        var3 = var7;
        if (param0) {
          var4 = 0;
          L0: while (true) {
            if (var4 >= var7.length) {
              return;
            } else {
              var5 = var7[var4];
              if (var5 != null) {
                var5.field_b = param1;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    public final void a(boolean param0, int param1, int param2, rj param3, int param4) {
        db var7 = null;
        db var9 = null;
        ig var10 = null;
        db var11 = null;
        db var12 = null;
        db var13 = null;
        db var14 = null;
        rj stackIn_3_0 = null;
        rj stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param3 instanceof ig) {
            stackOut_2_0 = (rj) param3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (rj) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var10 = (ig) (Object) stackIn_3_0;
          if (param4 == 4549) {
            break L1;
          } else {
            String discarded$1 = tc.c(22);
            break L1;
          }
        }
        L2: {
          gg.a(126, param3.field_p + (param1 + param3.field_w), param3.field_k + param2, param2 - -param3.field_k - -param3.field_t, param1 - -param3.field_w);
          if (var10 == null) {
            break L2;
          } else {
            param0 = param0 & var10.field_E;
            break L2;
          }
        }
        L3: {
          var7 = ((tc) this).field_x[0];
          ((tc) this).field_t.a((byte) 76);
          var7.a((tc) this, ((tc) this).field_t, param4 ^ 4584, param2, param3, param1);
          if (var10 != null) {
            L4: {
              if (!var10.field_z) {
                break L4;
              } else {
                var11 = ((tc) this).field_x[1];
                if (var11 != null) {
                  var11.a((tc) this, ((tc) this).field_t, 94, param2, param3, param1);
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            if (!var10.field_q) {
              break L3;
            } else {
              L5: {
                var12 = ((tc) this).field_x[3];
                if (-1 == (var10.field_o ^ -1)) {
                  break L5;
                } else {
                  if (var12 != null) {
                    var12.a((tc) this, ((tc) this).field_t, 126, param2, param3, param1);
                    break L3;
                  } else {
                    break L5;
                  }
                }
              }
              var9 = ((tc) this).field_x[2];
              if (var9 == null) {
                break L3;
              } else {
                var9.a((tc) this, ((tc) this).field_t, param4 ^ -4525, param2, param3, param1);
                break L3;
              }
            }
          } else {
            break L3;
          }
        }
        L6: {
          if (param3.e(0)) {
            var13 = ((tc) this).field_x[5];
            if (var13 != null) {
              var13.a((tc) this, ((tc) this).field_t, 99, param2, param3, param1);
              break L6;
            } else {
              break L6;
            }
          } else {
            break L6;
          }
        }
        L7: {
          if (param0) {
            break L7;
          } else {
            var14 = ((tc) this).field_x[4];
            if (var14 != null) {
              var14.a((tc) this, ((tc) this).field_t, -122, param2, param3, param1);
              break L7;
            } else {
              break L7;
            }
          }
        }
        ((tc) this).field_t.a(param2, (tc) this, param3, param4 + -4547, param1);
        id.b((byte) -58);
    }

    private final void a(boolean param0, int param1, tc param2) {
        int var4 = 0;
        int var5 = 0;
        db var6 = null;
        db var7 = null;
        int var8 = 0;
        db stackIn_6_0 = null;
        db stackIn_7_0 = null;
        db stackIn_8_0 = null;
        db stackIn_8_1 = null;
        db stackOut_5_0 = null;
        db stackOut_7_0 = null;
        db stackOut_7_1 = null;
        db stackOut_6_0 = null;
        db stackOut_6_1 = null;
        L0: {
          var8 = stellarshard.field_B;
          var4 = -94 % ((6 - param1) / 63);
          super.a((id) (Object) param2, (byte) -34);
          if (!param0) {
            ri.a((Object[]) (Object) ((tc) this).field_x, 0, (Object[]) (Object) param2.field_x, 0, 6);
            break L0;
          } else {
            var5 = 0;
            L1: while (true) {
              if ((var5 ^ -1) <= -7) {
                break L0;
              } else {
                var6 = ((tc) this).field_x[var5];
                if (var6 != null) {
                  L2: {
                    var7 = param2.field_x[var5];
                    stackOut_5_0 = (db) var6;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var7 == null) {
                      db dupTemp$1 = new db();
                      param2.field_x[var5] = dupTemp$1;
                      stackOut_7_0 = (db) (Object) stackIn_7_0;
                      stackOut_7_1 = (db) dupTemp$1;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      break L2;
                    } else {
                      stackOut_6_0 = (db) (Object) stackIn_6_0;
                      stackOut_6_1 = (db) var7;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      break L2;
                    }
                  }
                  ((db) (Object) stackIn_8_0).a(stackIn_8_1, true);
                  var5++;
                  continue L1;
                } else {
                  param2.field_x[var5] = null;
                  var5++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = 0;
        field_q = "Continue";
    }
}
