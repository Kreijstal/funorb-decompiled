/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg extends am {
    static String field_v;
    static String field_y;
    static sj field_s;
    private pf field_t;
    static int field_x;
    static String field_w;
    private pf[] field_u;
    static String field_r;

    private final void a(boolean param0, lg param1, byte param2) {
        int var4 = 0;
        pf var5 = null;
        pf var6 = null;
        int var7 = 0;
        pf stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        pf stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        pf stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        pf stackIn_10_2 = null;
        pf stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        pf stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        pf stackOut_9_2 = null;
        pf stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        pf stackOut_8_2 = null;
        var7 = Pool.field_O;
        super.a(-1177150015, (am) (Object) param1);
        if (param2 >= 59) {
          L0: {
            if (param0) {
              var4 = 0;
              L1: while (true) {
                if ((var4 ^ -1) <= -7) {
                  break L0;
                } else {
                  var5 = ((lg) this).field_u[var4];
                  if (var5 == null) {
                    param1.field_u[var4] = null;
                    var4++;
                    continue L1;
                  } else {
                    L2: {
                      var6 = param1.field_u[var4];
                      stackOut_7_0 = (pf) var5;
                      stackOut_7_1 = 288;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_9_1 = stackOut_7_1;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      if (var6 == null) {
                        param1.field_u[var4] = new pf();
                        stackOut_9_0 = (pf) (Object) stackIn_9_0;
                        stackOut_9_1 = stackIn_9_1;
                        stackOut_9_2 = new pf();
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        stackIn_10_2 = stackOut_9_2;
                        break L2;
                      } else {
                        stackOut_8_0 = (pf) (Object) stackIn_8_0;
                        stackOut_8_1 = stackIn_8_1;
                        stackOut_8_2 = (pf) var6;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        stackIn_10_2 = stackOut_8_2;
                        break L2;
                      }
                    }
                    ((pf) (Object) stackIn_10_0).a(stackIn_10_1, stackIn_10_2);
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              qn.a((Object[]) (Object) ((lg) this).field_u, 0, (Object[]) (Object) param1.field_u, 0, 6);
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    public lg() {
        ((lg) this).field_u = new pf[6];
        ((lg) this).field_t = new pf();
        ((lg) this).field_u[0] = new pf();
        pf var1 = new pf();
        var1.a(-51);
    }

    final void a(dd param0, int param1) {
        pf[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        pf var6 = null;
        int var7 = 0;
        pf[] var8 = null;
        var7 = Pool.field_O;
        var8 = ((lg) this).field_u;
        var3 = var8;
        var5 = 78 / ((29 - param1) / 36);
        var4 = 0;
        L0: while (true) {
          if (var4 >= var8.length) {
            return;
          } else {
            var6 = var8[var4];
            if (var6 != null) {
              var6.field_b = param0;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    final void a(byte param0, int param1, dd[] param2) {
        int var4 = param1;
        if (((lg) this).field_u[var4] == null) {
            ((lg) this).field_u[var4] = new pf();
        }
        if (param0 != -79) {
            ke discarded$0 = lg.c(-45);
        }
        ((lg) this).field_u[param1].field_j = param2;
    }

    final pf b(int param0, int param1) {
        if (param1 != 0) {
            Object var4 = null;
            ((lg) this).a((dd) null, -125);
        }
        ((lg) this).field_u[param0] = new pf();
        return new pf();
    }

    public static void a(boolean param0) {
        field_v = null;
        if (!param0) {
            field_w = null;
        }
        field_w = null;
        field_r = null;
        field_y = null;
        field_s = null;
    }

    final void a(dd[] param0, int param1) {
        pf[] var3 = null;
        int var4 = 0;
        pf var5 = null;
        int var6 = 0;
        pf[] var7 = null;
        var6 = Pool.field_O;
        var7 = ((lg) this).field_u;
        var3 = var7;
        if (param1 == 6) {
          var4 = 0;
          L0: while (true) {
            if (var7.length <= var4) {
              return;
            } else {
              var5 = var7[var4];
              if (var5 != null) {
                var5.field_j = param0;
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

    public final void a(boolean param0, int param1, byte param2, int param3, ei param4) {
        pf var7 = null;
        int var8 = 0;
        pf var10 = null;
        fe var11 = null;
        pf var12 = null;
        pf var13 = null;
        pf var14 = null;
        pf var15 = null;
        ei stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        ei stackOut_1_0 = null;
        L0: {
          if (!(param4 instanceof fe)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (ei) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (ei) param4;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var11 = (fe) (Object) stackIn_3_0;
          wh.a(param1 + param4.field_C, param4.field_D + param3, param4.field_l + (param4.field_C + param1), (byte) 85, param4.field_y + (param4.field_D + param3));
          if (var11 != null) {
            param0 = param0 & var11.field_I;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var8 = -10 / ((param2 - 2) / 41);
          var7 = ((lg) this).field_u[0];
          ((lg) this).field_t.a(-107);
          var7.a((lg) this, param3, ((lg) this).field_t, -116, param4, param1);
          if (var11 == null) {
            break L2;
          } else {
            L3: {
              if (var11.field_G) {
                var12 = ((lg) this).field_u[1];
                if (var12 != null) {
                  var12.a((lg) this, param3, ((lg) this).field_t, -103, param4, param1);
                  break L3;
                } else {
                  break L3;
                }
              } else {
                break L3;
              }
            }
            if (!var11.field_s) {
              break L2;
            } else {
              L4: {
                var13 = ((lg) this).field_u[3];
                if (-1 == (var11.field_n ^ -1)) {
                  break L4;
                } else {
                  if (var13 == null) {
                    break L4;
                  } else {
                    var13.a((lg) this, param3, ((lg) this).field_t, -113, param4, param1);
                    break L2;
                  }
                }
              }
              var10 = ((lg) this).field_u[2];
              if (var10 == null) {
                break L2;
              } else {
                var10.a((lg) this, param3, ((lg) this).field_t, -108, param4, param1);
                break L2;
              }
            }
          }
        }
        L5: {
          if (param4.d(66)) {
            var14 = ((lg) this).field_u[5];
            if (var14 == null) {
              break L5;
            } else {
              var14.a((lg) this, param3, ((lg) this).field_t, -128, param4, param1);
              break L5;
            }
          } else {
            break L5;
          }
        }
        L6: {
          if (param0) {
            break L6;
          } else {
            var15 = ((lg) this).field_u[4];
            if (var15 == null) {
              break L6;
            } else {
              var15.a((lg) this, param3, ((lg) this).field_t, -112, param4, param1);
              break L6;
            }
          }
        }
        ((lg) this).field_t.a(param3, param1, param4, (lg) this, 110);
        oc.a(121);
    }

    lg(lg param0, boolean param1) {
        this();
        param0.a(param1, (lg) this, (byte) 89);
    }

    final static ke c(int param0) {
        if (param0 != 5) {
            ke discarded$0 = lg.c(-37);
        }
        return new ke(gd.a(true), mn.a(true));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "Change display name";
        field_v = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_w = "Play free version";
        field_r = "Names cannot start or end with space or underscore";
    }
}
