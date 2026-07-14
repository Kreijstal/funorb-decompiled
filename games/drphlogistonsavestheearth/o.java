/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class o extends em {
    private boolean field_p;
    private int field_m;
    private int field_i;
    static vj field_l;
    static String field_n;
    private int field_q;
    private int field_g;
    static String field_f;
    private String field_j;
    static int[] field_k;
    private rf field_o;
    private int field_h;

    final static void a(boolean param0, int param1, java.awt.Canvas param2) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (-11 < (hj.field_f ^ -1)) {
            L1: {
              var3 = 0;
              if (eh.field_a) {
                var3 = 1;
                eh.field_a = false;
                break L1;
              } else {
                break L1;
              }
            }
            t.a(var3 != 0, mg.a(true), tb.b((byte) -81), 2, qe.field_g);
            break L0;
          } else {
            if (!s.a((byte) -81)) {
              wj.c();
              ik.a(param1 + 11435, 320, 240);
              DrPhlogistonSavesTheEarth.a(0, param1 + -423, param2, 0);
              break L0;
            } else {
              if (af.field_b != 0) {
                dh.a(107, param2);
                break L0;
              } else {
                kf.a(param0, false, (byte) -125);
                DrPhlogistonSavesTheEarth.a(0, -120, param2, 0);
                break L0;
              }
            }
          }
        }
        L2: {
          if (param1 == 320) {
            break L2;
          } else {
            field_l = null;
            break L2;
          }
        }
    }

    public static void a(byte param0) {
        if (param0 != 99) {
            o.a((byte) 0);
        }
        field_f = null;
        field_l = null;
        field_n = null;
        field_k = null;
    }

    final void a(rf param0, int param1, int param2, int param3, int param4, String param5, int param6, int param7) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        mi var15 = null;
        int var16 = 0;
        String[] var17 = null;
        String[] var18 = null;
        mi stackIn_34_0 = null;
        mi stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        mi stackIn_35_0 = null;
        mi stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        mi stackIn_36_0 = null;
        mi stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        int stackIn_36_4 = 0;
        int stackIn_39_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        mi stackOut_33_0 = null;
        mi stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        mi stackOut_35_0 = null;
        mi stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        int stackOut_35_4 = 0;
        mi stackOut_34_0 = null;
        mi stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        int stackOut_34_4 = 0;
        int stackOut_38_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        L0: {
          var16 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (-1 == (param4 ^ -1)) {
            param4 = param0.field_E;
            break L0;
          } else {
            break L0;
          }
        }
        if (param5 == null) {
          ((o) this).field_a = null;
          return;
        } else {
          L1: {
            if (((o) this).field_o != param0) {
              break L1;
            } else {
              if (((o) this).field_p) {
                break L1;
              } else {
                if (((o) this).field_h != param2) {
                  break L1;
                } else {
                  if (param6 != ((o) this).field_q) {
                    break L1;
                  } else {
                    if (param4 != ((o) this).field_i) {
                      break L1;
                    } else {
                      if (((o) this).field_g != param7) {
                        break L1;
                      } else {
                        if (param1 != ((o) this).field_m) {
                          break L1;
                        } else {
                          if (null == ((o) this).field_j) {
                            break L1;
                          } else {
                            if (((o) this).field_j.equals((Object) (Object) param5)) {
                              return;
                            } else {
                              break L1;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          L2: {
            ((o) this).field_o = param0;
            ((o) this).field_j = param5;
            ((o) this).field_h = param2;
            ((o) this).field_i = param4;
            ((o) this).field_g = param7;
            ((o) this).field_q = param6;
            ((o) this).field_m = param1;
            ((o) this).field_p = false;
            var17 = new String[param0.a(param5, param1) - -1];
            var18 = var17;
            var11 = -79 % ((-53 - param3) / 42);
            var10 = Math.max(1, param0.a(param5, new int[1], var18));
            if (-4 != ((o) this).field_q) {
              break L2;
            } else {
              if (-2 == var10) {
                ((o) this).field_q = 1;
                break L2;
              } else {
                break L2;
              }
            }
          }
          L3: {
            ((o) this).field_a = new mi[var10];
            if (((o) this).field_q != -1) {
              if (-2 == ((o) this).field_q) {
                var12 = (-(((o) this).field_i * var10) + ((o) this).field_g >> -1702148447) + param0.field_x;
                break L3;
              } else {
                if ((((o) this).field_q ^ -1) != -3) {
                  L4: {
                    var13 = (-(var10 * ((o) this).field_i) + ((o) this).field_g) / (1 + var10);
                    if ((var13 ^ -1) > -1) {
                      var13 = 0;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  ((o) this).field_i = ((o) this).field_i + var13;
                  var12 = param0.field_x - -var13;
                  break L3;
                } else {
                  var12 = ((o) this).field_g + (-param0.field_S + -(((o) this).field_i * var10));
                  break L3;
                }
              }
            } else {
              var12 = param0.field_x;
              break L3;
            }
          }
          var13 = 0;
          L5: while (true) {
            if (var13 >= var10) {
              return;
            } else {
              L6: {
                var14 = var17[var13];
                stackOut_33_0 = null;
                stackOut_33_1 = null;
                stackOut_33_2 = var12 + -param0.field_x;
                stackOut_33_3 = var12 + param0.field_S;
                stackIn_35_0 = stackOut_33_0;
                stackIn_35_1 = stackOut_33_1;
                stackIn_35_2 = stackOut_33_2;
                stackIn_35_3 = stackOut_33_3;
                stackIn_34_0 = stackOut_33_0;
                stackIn_34_1 = stackOut_33_1;
                stackIn_34_2 = stackOut_33_2;
                stackIn_34_3 = stackOut_33_3;
                if (var14 == null) {
                  stackOut_35_0 = null;
                  stackOut_35_1 = null;
                  stackOut_35_2 = stackIn_35_2;
                  stackOut_35_3 = stackIn_35_3;
                  stackOut_35_4 = 0;
                  stackIn_36_0 = stackOut_35_0;
                  stackIn_36_1 = stackOut_35_1;
                  stackIn_36_2 = stackOut_35_2;
                  stackIn_36_3 = stackOut_35_3;
                  stackIn_36_4 = stackOut_35_4;
                  break L6;
                } else {
                  stackOut_34_0 = null;
                  stackOut_34_1 = null;
                  stackOut_34_2 = stackIn_34_2;
                  stackOut_34_3 = stackIn_34_3;
                  stackOut_34_4 = var14.length();
                  stackIn_36_0 = stackOut_34_0;
                  stackIn_36_1 = stackOut_34_1;
                  stackIn_36_2 = stackOut_34_2;
                  stackIn_36_3 = stackOut_34_3;
                  stackIn_36_4 = stackOut_34_4;
                  break L6;
                }
              }
              L7: {
                new mi(stackIn_36_2, stackIn_36_3, stackIn_36_4);
                var15 = stackIn_36_0;
                var15.field_a[0] = 0;
                if (var14 != null) {
                  L8: {
                    var15.field_a[var14.length()] = param0.b(var14);
                    stackOut_38_0 = 0;
                    stackIn_40_0 = stackOut_38_0;
                    stackIn_39_0 = stackOut_38_0;
                    if ((param2 ^ -1) != -4) {
                      stackOut_40_0 = stackIn_40_0;
                      stackOut_40_1 = 0;
                      stackIn_41_0 = stackOut_40_0;
                      stackIn_41_1 = stackOut_40_1;
                      break L8;
                    } else {
                      stackOut_39_0 = stackIn_39_0;
                      stackOut_39_1 = ((o) this).a(param1, var14, param0.b(var14), 0);
                      stackIn_41_0 = stackOut_39_0;
                      stackIn_41_1 = stackOut_39_1;
                      break L8;
                    }
                  }
                  dc.a(stackIn_41_0 != 0, stackIn_41_1, var14, param0, var15);
                  break L7;
                } else {
                  break L7;
                }
              }
              ((o) this).field_a[var13] = var15;
              var12 = var12 + param4;
              var13++;
              continue L5;
            }
          }
        }
    }

    final void a(rf param0, String param1, int param2, int param3, int param4) {
        if (!(param1 != null)) {
            ((o) this).field_a = null;
            return;
        }
        if (((o) this).field_o == param0) {
            if (((o) this).field_p) {
                if (((o) this).field_h == 0) {
                    if (((o) this).field_j != null) {
                        if (((o) this).field_j.equals((Object) (Object) param1)) {
                            return;
                        }
                    }
                }
            }
        }
        ((o) this).field_h = param4;
        ((o) this).field_p = true;
        ((o) this).field_o = param0;
        ((o) this).field_j = param1;
        mi var7 = this.a(param0, (byte) 76, param3, param1);
        mi var8 = var7;
        var7.field_a[0] = param2;
        var8.field_a[param1.length()] = param0.b(param1) + param2;
        dc.a(false, 0, param1, param0, var8);
    }

    final void a(rf param0, int param1, int param2, String param3, boolean param4) {
        if (param3 == null) {
            ((o) this).field_a = null;
            return;
        }
        if (param0 == ((o) this).field_o) {
            if (((o) this).field_p) {
                if (-2 == (((o) this).field_h ^ -1)) {
                    if (((o) this).field_j != null) {
                        if (!(!((o) this).field_j.equals((Object) (Object) param3))) {
                            return;
                        }
                    }
                }
            }
        }
        ((o) this).field_h = 1;
        ((o) this).field_p = true;
        ((o) this).field_o = param0;
        if (param4) {
            ((o) this).field_i = 109;
        }
        mi var8 = this.a(param0, (byte) 76, param2, param3);
        int var7 = param0.b(param3);
        var8.field_a[0] = -(var7 >> -917468959) + param1;
        var8.field_a[param3.length()] = (var7 >> 1339919489) + param1;
        dc.a(param4, 0, param3, param0, var8);
    }

    final void a(rf param0, int param1, boolean param2, int param3, String param4) {
        if (!(param4 != null)) {
            ((o) this).field_a = null;
            return;
        }
        if (((o) this).field_o == param0) {
            if (((o) this).field_p) {
                if (2 == ((o) this).field_h) {
                    if (null != ((o) this).field_j) {
                        if (((o) this).field_j.equals((Object) (Object) param4)) {
                            return;
                        }
                    }
                }
            }
        }
        ((o) this).field_j = param4;
        ((o) this).field_o = param0;
        ((o) this).field_h = 2;
        ((o) this).field_p = true;
        mi var8 = this.a(param0, (byte) 76, param3, param4);
        mi var9 = var8;
        var9.field_a[0] = -param0.b(param4) + param1;
        var9.field_a[param4.length()] = param1;
        dc.a(param2, 0, param4, param0, var9);
    }

    private final mi a(rf param0, byte param1, int param2, String param3) {
        if (param1 != 76) {
            Object var6 = null;
            ((o) this).a((rf) null, -123, false, -9, (String) null);
        }
        mi var7 = new mi(param2 + -param0.field_x, param0.field_S + param2, param3.length());
        mi var5 = var7;
        ((o) this).field_a = new mi[]{var7};
        return var5;
    }

    public o() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Previous";
        field_k = new int[]{10, 3, 5, 2, 3, 6, 1, 1, 7, 8, 9, 6, 3, 1, 5, 1, 5, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 3, 1, 3, 5, 2, 10, 3, 1, 3, 3, 3, 5, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        field_f = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}
