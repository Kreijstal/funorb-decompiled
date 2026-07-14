/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rg {
    int field_f;
    int[] field_i;
    static wk[] field_h;
    static int[] field_m;
    int field_e;
    String field_k;
    rg field_j;
    String field_g;
    static ue field_b;
    rg[] field_a;
    static String field_l;
    static String field_d;
    wk field_c;

    final int a(int param0, int param1, int param2, int param3, ci param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        wk stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        int stackIn_55_2 = 0;
        wk stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        int stackIn_56_2 = 0;
        wk stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        int stackIn_57_2 = 0;
        int stackIn_57_3 = 0;
        wk stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        int stackIn_58_2 = 0;
        wk stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        int stackIn_59_2 = 0;
        wk stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        int stackIn_60_2 = 0;
        int stackIn_60_3 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        wk stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        int stackOut_54_2 = 0;
        wk stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        int stackOut_56_2 = 0;
        int stackOut_56_3 = 0;
        wk stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        int stackOut_55_2 = 0;
        int stackOut_55_3 = 0;
        wk stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        int stackOut_57_2 = 0;
        wk stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        int stackOut_59_2 = 0;
        int stackOut_59_3 = 0;
        wk stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        int stackOut_58_2 = 0;
        int stackOut_58_3 = 0;
        L0: {
          var16 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param3 == 40) {
            break L0;
          } else {
            rg.a(-65);
            break L0;
          }
        }
        L1: {
          var8 = param0;
          if (((rg) this).field_a == null) {
            if (null != ((rg) this).field_i) {
              var8 = var8 * ((rg) this).field_i.length;
              break L1;
            } else {
              break L1;
            }
          } else {
            var8 = var8 * ((rg) this).field_a.length;
            break L1;
          }
        }
        L2: {
          var9 = param5;
          if (0 >= param0) {
            stackOut_9_0 = 0;
            stackIn_10_0 = stackOut_9_0;
            break L2;
          } else {
            stackOut_8_0 = 150 * param0 >> 1895594824;
            stackIn_10_0 = stackOut_8_0;
            break L2;
          }
        }
        L3: {
          var10 = stackIn_10_0;
          if (param0 <= -1) {
            stackOut_12_0 = 256;
            stackIn_13_0 = stackOut_12_0;
            break L3;
          } else {
            stackOut_11_0 = param0 + 256;
            stackIn_13_0 = stackOut_11_0;
            break L3;
          }
        }
        L4: {
          var11 = stackIn_13_0;
          if (-1 < param0) {
            break L4;
          } else {
            if (((rg) this).field_j == null) {
              break L4;
            } else {
              L5: {
                go.field_e.f(130 - -param2, 177, var11);
                if (param0 != 0) {
                  break L5;
                } else {
                  if (ml.a(212, 165, 20, false)) {
                    vi.field_f = fo.a(4800, rr.field_a, new String[1]);
                    var9 = 40;
                    go.field_e.f(db.a(true, 130 + param2), u.a(177, (byte) 94), 128);
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
              ((rg) this).field_c.e(db.a(true, param2 + 145), u.a(192, (byte) 94), var11);
              km.field_h[1].e(db.a(true, 142 - -param2), u.a(189, (byte) 94), var11);
              break L4;
            }
          }
        }
        L6: {
          if (null != ((rg) this).field_a) {
            var12 = ((rg) this).field_a.length;
            var17 = 0;
            var13 = var17;
            L7: while (true) {
              if (var12 <= var17) {
                break L6;
              } else {
                L8: {
                  if ((param0 ^ -1) <= -1) {
                    var14 = param2 + 165 + (int)(Math.sin(((double)var8 + 256.0 * ((double)var17 * 6.283185307179586)) / (double)(256 * var12)) * (double)(90 + var10));
                    var15 = -(int)((double)(var10 + 90) * Math.cos(((double)var8 + 256.0 * (6.283185307179586 * (double)var17)) / (double)(256 * var12))) + 212;
                    break L8;
                  } else {
                    if (param6 == var17) {
                      var14 = param2 + 165 + (int)((double)((90 * param0 >> 1793171368) + 90) * Math.sin(256.0 * ((double)var17 * 6.283185307179586) / (double)(var12 * 256)));
                      var15 = 212 + -(int)(Math.cos(256.0 * (6.283185307179586 * (double)var17) / (double)(var12 * 256)) * (double)((90 * param0 >> 578855784) + 90));
                      break L8;
                    } else {
                      var14 = 165 + ((int)(Math.sin(256.0 * ((double)var17 * 6.283185307179586) / (double)(256 * var12)) * (double)(90 - -var10)) + param2);
                      var15 = -(int)(Math.cos(256.0 * (6.283185307179586 * (double)var17) / (double)(256 * var12)) * (double)(var10 + 90)) + 212;
                      break L8;
                    }
                  }
                }
                L9: {
                  if (param0 != 0) {
                    break L9;
                  } else {
                    if (ml.a(var15, var14, 20, false)) {
                      vi.field_f = ((rg) this).field_a[var17].field_k;
                      var9 = 50 + var17;
                      go.field_e.f(db.a(true, var14 - 35), u.a(var15 - 35, (byte) 94), 128);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
                L10: {
                  if (param0 >= 0) {
                    break L10;
                  } else {
                    if (param6 == var17) {
                      go.field_e.f(db.a(true, var14 - 35), u.a(var15 - 35, (byte) 94), -param0);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                }
                L11: {
                  stackOut_54_0 = ((rg) this).field_a[var17].field_c;
                  stackOut_54_1 = db.a(true, -20 + var14);
                  stackOut_54_2 = u.a(var15 - 20, (byte) 94);
                  stackIn_56_0 = stackOut_54_0;
                  stackIn_56_1 = stackOut_54_1;
                  stackIn_56_2 = stackOut_54_2;
                  stackIn_55_0 = stackOut_54_0;
                  stackIn_55_1 = stackOut_54_1;
                  stackIn_55_2 = stackOut_54_2;
                  if (var17 != param6) {
                    stackOut_56_0 = (wk) (Object) stackIn_56_0;
                    stackOut_56_1 = stackIn_56_1;
                    stackOut_56_2 = stackIn_56_2;
                    stackOut_56_3 = var11;
                    stackIn_57_0 = stackOut_56_0;
                    stackIn_57_1 = stackOut_56_1;
                    stackIn_57_2 = stackOut_56_2;
                    stackIn_57_3 = stackOut_56_3;
                    break L11;
                  } else {
                    stackOut_55_0 = (wk) (Object) stackIn_55_0;
                    stackOut_55_1 = stackIn_55_1;
                    stackOut_55_2 = stackIn_55_2;
                    stackOut_55_3 = 256;
                    stackIn_57_0 = stackOut_55_0;
                    stackIn_57_1 = stackOut_55_1;
                    stackIn_57_2 = stackOut_55_2;
                    stackIn_57_3 = stackOut_55_3;
                    break L11;
                  }
                }
                L12: {
                  ((wk) (Object) stackIn_57_0).e(stackIn_57_1, stackIn_57_2, stackIn_57_3);
                  stackOut_57_0 = km.field_h[1];
                  stackOut_57_1 = db.a(true, var14 - 23);
                  stackOut_57_2 = u.a(-23 + var15, (byte) 94);
                  stackIn_59_0 = stackOut_57_0;
                  stackIn_59_1 = stackOut_57_1;
                  stackIn_59_2 = stackOut_57_2;
                  stackIn_58_0 = stackOut_57_0;
                  stackIn_58_1 = stackOut_57_1;
                  stackIn_58_2 = stackOut_57_2;
                  if (var17 == param6) {
                    stackOut_59_0 = (wk) (Object) stackIn_59_0;
                    stackOut_59_1 = stackIn_59_1;
                    stackOut_59_2 = stackIn_59_2;
                    stackOut_59_3 = 256;
                    stackIn_60_0 = stackOut_59_0;
                    stackIn_60_1 = stackOut_59_1;
                    stackIn_60_2 = stackOut_59_2;
                    stackIn_60_3 = stackOut_59_3;
                    break L12;
                  } else {
                    stackOut_58_0 = (wk) (Object) stackIn_58_0;
                    stackOut_58_1 = stackIn_58_1;
                    stackOut_58_2 = stackIn_58_2;
                    stackOut_58_3 = var11;
                    stackIn_60_0 = stackOut_58_0;
                    stackIn_60_1 = stackOut_58_1;
                    stackIn_60_2 = stackOut_58_2;
                    stackIn_60_3 = stackOut_58_3;
                    break L12;
                  }
                }
                ((wk) (Object) stackIn_60_0).e(stackIn_60_1, stackIn_60_2, stackIn_60_3);
                var17++;
                continue L7;
              }
            }
          } else {
            if (((rg) this).field_i == null) {
              break L6;
            } else {
              var12 = ((rg) this).field_i.length;
              var13 = 0;
              L13: while (true) {
                if (var12 <= var13) {
                  break L6;
                } else {
                  L14: {
                    var14 = 165 - -(int)(Math.sin((256.0 * (6.283185307179586 * (double)var13) + (double)var8) / (double)(var12 * 256)) * (double)(var10 + 90)) - -param2;
                    var15 = -(int)((double)(90 + var10) * Math.cos(((double)var8 + 6.283185307179586 * (double)var13 * 256.0) / (double)(256 * var12))) + 212;
                    if (0 != param0) {
                      break L14;
                    } else {
                      if (ml.a(var15, var14, 20, false)) {
                        vi.field_f = fq.field_f[((rg) this).field_i[var13]];
                        var9 = 50 + var13;
                        go.field_e.f(db.a(true, -35 + var14), u.a(-35 + var15, (byte) 94), 128);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                  }
                  L15: {
                    if (ev.field_d == ((rg) this).field_i[var13]) {
                      go.field_e.f(db.a(true, -35 + var14), u.a(var15 - 35, (byte) 94), param1);
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if (((rg) this).field_i[var13] != ab.field_a) {
                      break L16;
                    } else {
                      go.field_e.f(db.a(true, var14 + -35), u.a(var15 + -35, (byte) 94), 256 - param1);
                      break L16;
                    }
                  }
                  L17: {
                    lf.field_h[uc.field_d[((rg) this).field_i[var13]][2]].g(db.a(true, var14 - 20), u.a(-20 + var15, (byte) 94));
                    if (ev.field_d != ((rg) this).field_i[var13]) {
                      break L17;
                    } else {
                      lf.field_h[uc.field_d[((rg) this).field_i[var13]][2]].f(db.a(true, -20 + var14), u.a(var15 - 20, (byte) 94), param1);
                      break L17;
                    }
                  }
                  L18: {
                    if (((rg) this).field_i[var13] == ab.field_a) {
                      lf.field_h[uc.field_d[((rg) this).field_i[var13]][2]].f(db.a(true, var14 + -20), u.a(var15 - 20, (byte) 94), 256 - param1);
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  km.field_h[0].g(db.a(true, -23 + var14), u.a(var15 + -23, (byte) 94));
                  var13++;
                  continue L13;
                }
              }
            }
          }
        }
        return var9;
    }

    public static void a(int param0) {
        field_m = null;
        field_l = null;
        field_h = null;
        field_d = null;
        field_b = null;
        if (param0 > -57) {
            field_b = null;
        }
    }

    rg(int param0, String param1, String param2, int[] param3) {
        int var5 = 0;
        ((rg) this).field_j = null;
        ((rg) this).field_f = param0;
        ((rg) this).field_c = lf.field_h[param0];
        ((rg) this).field_k = param1;
        ((rg) this).field_i = param3;
        ((rg) this).field_g = param2;
        for (var5 = 0; ((rg) this).field_i.length > var5; var5++) {
            ct.field_o[((rg) this).field_i[var5]] = (rg) this;
        }
    }

    rg(int param0, String param1, String param2, rg[] param3) {
        int var5 = 0;
        ((rg) this).field_j = null;
        ((rg) this).field_f = param0;
        ((rg) this).field_c = lf.field_h[param0];
        ((rg) this).field_k = param1;
        ((rg) this).field_a = param3;
        ((rg) this).field_g = param2;
        for (var5 = 0; ((rg) this).field_a.length > var5; var5++) {
            ((rg) this).field_a[var5].field_j = (rg) this;
            ((rg) this).field_a[var5].field_e = var5;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "To play a multiplayer game, please log in or create a free account.";
        field_d = "Elixirs";
    }
}
