/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class up extends um {
    static jp[] field_A;
    static tq field_v;
    private be field_B;
    private be[] field_y;
    static String field_x;
    static jp field_w;
    static int field_z;

    final void a(boolean param0, int param1, jp[] param2) {
        if (!param0) {
            return;
        }
        int var4 = param1;
        if (!(null != ((up) this).field_y[var4])) {
            ((up) this).field_y[var4] = new be();
        }
        ((up) this).field_y[param1].field_f = param2;
    }

    private final void a(boolean param0, up param1, boolean param2) {
        int var4 = 0;
        be var5 = null;
        be var6 = null;
        be var6_ref = null;
        int var7 = 0;
        Object var8 = null;
        be stackIn_8_0 = null;
        be stackIn_9_0 = null;
        be stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        be stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        be stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        be stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        be stackIn_13_2 = null;
        be stackOut_7_0;
        be stackOut_9_0;
        int stackOut_9_1;
        be stackOut_8_0;
        int stackOut_8_1;
        be stackOut_10_0;
        int stackOut_10_1;
        be stackOut_12_0;
        int stackOut_12_1;
        be stackOut_12_2;
        be stackOut_11_0;
        int stackOut_11_1;
        be stackOut_11_2;
        L0: {
          var7 = BrickABrac.field_J ? 1 : 0;
          super.a(-35, (um) (Object) param1);
          if (param0) {
            break L0;
          } else {
            var8 = null;
            ((up) this).a(54, (jp) null);
            break L0;
          }
        }
        L1: {
          if (!param2) {
            pm.a((Object[]) (Object) ((up) this).field_y, 0, (Object[]) (Object) param1.field_y, 0, 6);
            break L1;
          } else {
            var4 = 0;
            L2: while (true) {
              if (var4 >= 6) {
                break L1;
              } else {
                var5 = ((up) this).field_y[var4];
                var6 = var5;
                var6 = var5;
                if (var5 != null) {
                  L3: {
                    var6_ref = param1.field_y[var4];
                    stackOut_7_0 = (be) var5;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_8_0 = stackOut_7_0;
                    if (param0) {
                      stackOut_9_0 = (be) (Object) stackIn_9_0;
                      stackOut_9_1 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      break L3;
                    } else {
                      stackOut_8_0 = (be) (Object) stackIn_8_0;
                      stackOut_8_1 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      break L3;
                    }
                  }
                  L4: {
                    stackOut_10_0 = (be) (Object) stackIn_10_0;
                    stackOut_10_1 = stackIn_10_1;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    if (var6_ref != null) {
                      stackOut_12_0 = (be) (Object) stackIn_12_0;
                      stackOut_12_1 = stackIn_12_1;
                      stackOut_12_2 = (be) var6_ref;
                      stackIn_13_0 = stackOut_12_0;
                      stackIn_13_1 = stackOut_12_1;
                      stackIn_13_2 = stackOut_12_2;
                      break L4;
                    } else {
                      param1.field_y[var4] = new be();
                      stackOut_11_0 = (be) (Object) stackIn_11_0;
                      stackOut_11_1 = stackIn_11_1;
                      stackOut_11_2 = new be();
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_13_1 = stackOut_11_1;
                      stackIn_13_2 = stackOut_11_2;
                      break L4;
                    }
                  }
                  ((be) (Object) stackIn_13_0).a(stackIn_13_1 != 0, (be) (Object) stackIn_13_2);
                  var4++;
                  continue L2;
                } else {
                  param1.field_y[var4] = null;
                  var4++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final void a(jp[] param0, boolean param1) {
        be[] var3 = null;
        int var4 = 0;
        be var5 = null;
        int var6 = 0;
        be[] var7 = null;
        L0: {
          var6 = BrickABrac.field_J ? 1 : 0;
          if (!param1) {
            break L0;
          } else {
            field_x = null;
            break L0;
          }
        }
        var7 = ((up) this).field_y;
        var3 = var7;
        var4 = 0;
        L1: while (true) {
          if (var4 >= var7.length) {
            return;
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_f = param0;
              var4++;
              continue L1;
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    public final void a(boolean param0, int param1, int param2, oc param3, int param4) {
        be var7 = null;
        be var9 = null;
        d var10 = null;
        be var11 = null;
        be var12 = null;
        be var13 = null;
        be var14 = null;
        oc stackIn_5_0 = null;
        Object stackOut_4_0;
        oc stackOut_3_0;
        L0: {
          if (param1 == -20618) {
            break L0;
          } else {
            up.b(62);
            break L0;
          }
        }
        L1: {
          if (!(param3 instanceof d)) {
            stackOut_4_0 = null;
            stackIn_5_0 = (oc) (Object) stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = (oc) param3;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        L2: {
          var10 = (d) (Object) stackIn_5_0;
          vi.a((byte) 106, param3.field_t + param3.field_o + param2, param2 - -param3.field_o, param4 + param3.field_w, param4 + param3.field_w - -param3.field_s);
          if (var10 == null) {
            break L2;
          } else {
            param0 = param0 & var10.field_J;
            break L2;
          }
        }
        L3: {
          var7 = ((up) this).field_y[0];
          ((up) this).field_B.a(-2147483648);
          var7.a(((up) this).field_B, 2147483647, (up) this, param3, param2, param4);
          if (var10 != null) {
            L4: {
              if (!var10.field_F) {
                break L4;
              } else {
                var11 = ((up) this).field_y[1];
                if (var11 != null) {
                  var11.a(((up) this).field_B, 2147483647, (up) this, param3, param2, param4);
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            if (var10.field_q) {
              L5: {
                var12 = ((up) this).field_y[3];
                if (var10.field_n == 0) {
                  break L5;
                } else {
                  if (var12 != null) {
                    var12.a(((up) this).field_B, 2147483647, (up) this, param3, param2, param4);
                    break L3;
                  } else {
                    break L5;
                  }
                }
              }
              var9 = ((up) this).field_y[2];
              if (var9 == null) {
                break L3;
              } else {
                var9.a(((up) this).field_B, 2147483647, (up) this, param3, param2, param4);
                break L3;
              }
            } else {
              break L3;
            }
          } else {
            break L3;
          }
        }
        L6: {
          if (!param3.f(-76)) {
            break L6;
          } else {
            var13 = ((up) this).field_y[5];
            if (var13 != null) {
              var13.a(((up) this).field_B, 2147483647, (up) this, param3, param2, param4);
              break L6;
            } else {
              break L6;
            }
          }
        }
        L7: {
          if (param0) {
            break L7;
          } else {
            var14 = ((up) this).field_y[4];
            if (var14 == null) {
              break L7;
            } else {
              var14.a(((up) this).field_B, 2147483647, (up) this, param3, param2, param4);
              break L7;
            }
          }
        }
        ((up) this).field_B.a(param4, (up) this, param3, (byte) -109, param2);
        sc.b(param1 ^ 20704);
    }

    up(up param0, boolean param1) {
        this();
        param0.a(true, (up) this, param1);
    }

    public static void b(int param0) {
        field_w = null;
        if (param0 != 3) {
            up.b(20);
        }
        field_x = null;
        field_v = null;
        field_A = null;
    }

    final be b(int param0, int param1) {
        if (param1 <= 102) {
            return null;
        }
        ((up) this).field_y[param0] = new be();
        return new be();
    }

    public up() {
        ((up) this).field_y = new be[6];
        ((up) this).field_B = new be();
        ((up) this).field_y[0] = new be();
        be var1 = new be();
        var1.a(-2147483648);
    }

    final void a(int param0, jp param1) {
        be[] var3 = null;
        int var4 = 0;
        be var5 = null;
        int var6 = 0;
        be[] var7 = null;
        L0: {
          var6 = BrickABrac.field_J ? 1 : 0;
          if (param0 == -1553) {
            break L0;
          } else {
            field_v = null;
            break L0;
          }
        }
        var7 = ((up) this).field_y;
        var3 = var7;
        var4 = 0;
        L1: while (true) {
          if (var4 >= var7.length) {
            return;
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_k = param1;
              var4++;
              continue L1;
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_v = new tq();
    }
}
