/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh extends ik {
    private n[] field_v;
    static int field_u;
    static boolean field_w;
    private n field_t;

    public final void a(int param0, int param1, boolean param2, w param3, int param4) {
        n var7 = null;
        n var9 = null;
        kf var10 = null;
        n var11 = null;
        n var12 = null;
        n var13 = null;
        n var14 = null;
        w stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        w stackOut_1_0 = null;
        L0: {
          if (!(param3 instanceof kf)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (w) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (w) param3;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var10 = (kf) (Object) stackIn_3_0;
          ca.a(param3.field_t + (param1 + param3.field_j), param3.field_o + param0, param3.field_t + param1, param3.field_v + (param3.field_o + param0), false);
          if (var10 == null) {
            break L1;
          } else {
            param2 = param2 & var10.field_D;
            break L1;
          }
        }
        L2: {
          var7 = ((lh) this).field_v[0];
          ((lh) this).field_t.a(param4 + 3389);
          var7.a(param1, ((lh) this).field_t, (byte) 76, param0, (lh) this, param3);
          if (var10 == null) {
            break L2;
          } else {
            L3: {
              if (var10.field_C) {
                var11 = ((lh) this).field_v[1];
                if (var11 != null) {
                  var11.a(param1, ((lh) this).field_t, (byte) 76, param0, (lh) this, param3);
                  break L3;
                } else {
                  break L3;
                }
              } else {
                break L3;
              }
            }
            if (var10.field_m) {
              L4: {
                var12 = ((lh) this).field_v[3];
                if (0 == var10.field_h) {
                  break L4;
                } else {
                  if (var12 == null) {
                    break L4;
                  } else {
                    var12.a(param1, ((lh) this).field_t, (byte) 76, param0, (lh) this, param3);
                    break L2;
                  }
                }
              }
              var9 = ((lh) this).field_v[2];
              if (var9 != null) {
                var9.a(param1, ((lh) this).field_t, (byte) 76, param0, (lh) this, param3);
                break L2;
              } else {
                break L2;
              }
            } else {
              break L2;
            }
          }
        }
        L5: {
          if (param3.a(18337)) {
            var13 = ((lh) this).field_v[5];
            if (var13 == null) {
              break L5;
            } else {
              var13.a(param1, ((lh) this).field_t, (byte) 76, param0, (lh) this, param3);
              break L5;
            }
          } else {
            break L5;
          }
        }
        L6: {
          if (!param2) {
            var14 = ((lh) this).field_v[4];
            if (var14 == null) {
              break L6;
            } else {
              var14.a(param1, ((lh) this).field_t, (byte) 76, param0, (lh) this, param3);
              break L6;
            }
          } else {
            break L6;
          }
        }
        L7: {
          if (param4 == -3284) {
            break L7;
          } else {
            ((lh) this).field_v = null;
            break L7;
          }
        }
        ((lh) this).field_t.a((lh) this, param3, param1, param4 ^ 3254, param0);
        pd.a(param4 + -19665);
    }

    public lh() {
        ((lh) this).field_v = new n[6];
        ((lh) this).field_t = new n();
        ((lh) this).field_v[0] = new n();
        n var1 = new n();
        var1.a(109);
    }

    private final void a(boolean param0, lh param1, int param2) {
        int var4 = 0;
        n var5 = null;
        n var6 = null;
        int var7 = 0;
        n stackIn_6_0 = null;
        n stackIn_7_0 = null;
        n stackIn_8_0 = null;
        n stackIn_8_1 = null;
        n stackOut_5_0 = null;
        n stackOut_7_0 = null;
        n stackOut_7_1 = null;
        n stackOut_6_0 = null;
        n stackOut_6_1 = null;
        L0: {
          var7 = Lexicominos.field_L ? 1 : 0;
          super.a((ik) (Object) param1, false);
          if (!param0) {
            o.a((Object[]) (Object) ((lh) this).field_v, 0, (Object[]) (Object) param1.field_v, 0, 6);
            break L0;
          } else {
            var4 = 0;
            L1: while (true) {
              if (-7 >= (var4 ^ -1)) {
                break L0;
              } else {
                var5 = ((lh) this).field_v[var4];
                if (var5 != null) {
                  L2: {
                    var6 = param1.field_v[var4];
                    stackOut_5_0 = (n) var5;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var6 != null) {
                      stackOut_7_0 = (n) (Object) stackIn_7_0;
                      stackOut_7_1 = (n) var6;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      break L2;
                    } else {
                      param1.field_v[var4] = new n();
                      stackOut_6_0 = (n) (Object) stackIn_6_0;
                      stackOut_6_1 = new n();
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      break L2;
                    }
                  }
                  ((n) (Object) stackIn_8_0).a(stackIn_8_1, param2 ^ -25688);
                  var4++;
                  continue L1;
                } else {
                  param1.field_v[var4] = null;
                  var4++;
                  continue L1;
                }
              }
            }
          }
        }
        L3: {
          if (param2 == 6) {
            break L3;
          } else {
            field_u = 31;
            break L3;
          }
        }
    }

    final void a(db[] param0, byte param1) {
        n[] var3 = null;
        int var4 = 0;
        n var5 = null;
        int var6 = 0;
        n[] var7 = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        if (param1 == -112) {
          var7 = ((lh) this).field_v;
          var3 = var7;
          var4 = 0;
          L0: while (true) {
            if (var7.length <= var4) {
              return;
            } else {
              var5 = var7[var4];
              if (var5 != null) {
                var5.field_f = param0;
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

    lh(lh param0, boolean param1) {
        this();
        param0.a(param1, (lh) this, 6);
    }

    final static boolean b(int param0) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 == -24921) {
            break L0;
          } else {
            field_w = false;
            break L0;
          }
        }
        L1: {
          L2: {
            if (wf.field_i < 20) {
              break L2;
            } else {
              if (!ha.a(126)) {
                break L2;
              } else {
                L3: {
                  if (-1 <= (be.field_l ^ -1)) {
                    break L3;
                  } else {
                    if (ca.d(true)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L1;
              }
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    final void a(int param0, db param1) {
        n[] var3_ref_n__ = null;
        int var3 = 0;
        int var4 = 0;
        n var5 = null;
        int var6 = 0;
        n[] var7 = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        var7 = ((lh) this).field_v;
        var3_ref_n__ = var7;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var7.length) {
            var3 = 45 / ((param0 - -58) / 39);
            return;
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_j = param1;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    final n a(boolean param0, int param1) {
        if (param0) {
            return null;
        }
        ((lh) this).field_v[param1] = new n();
        return new n();
    }

    final void a(db[] param0, boolean param1, int param2) {
        int var4 = param2;
        if (((lh) this).field_v[var4] == null) {
            ((lh) this).field_v[var4] = new n();
        }
        if (param1) {
            ((lh) this).field_v = null;
        }
        ((lh) this).field_v[param2].field_f = param0;
    }

    final static void a(wf param0, int param1) {
        ki.field_g = param0.b(-1698573656) << 2051500101;
        int var2 = param0.d(true);
        ki.field_g = ki.field_g + (var2 >> -88380445);
        sg.field_a = 1835008 & var2 << 606181778;
        sg.field_a = sg.field_a + (param0.b(-1698573656) << 1599213154);
        var2 = param0.d(true);
        hh.field_I = (63 & var2) << 14035983;
        sg.field_a = sg.field_a + (var2 >> -723920378);
        hh.field_I = hh.field_I + (param0.d(true) << -953531545);
        if (param1 != -95) {
            Object var3 = null;
            lh.a((wf) null, 6);
        }
        var2 = param0.d(true);
        hh.field_I = hh.field_I + (var2 >> 436105121);
        th.field_s = var2 << 15324528 & 65536;
        th.field_s = th.field_s + param0.b(-1698573656);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = 0;
        field_w = false;
    }
}
