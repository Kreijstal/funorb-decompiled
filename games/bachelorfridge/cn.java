/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cn extends pp {
    static sna field_j;
    static String field_k;
    static String field_i;
    int field_m;
    int field_l;

    final void a(aga param0, op param1, int param2) {
        aga var4 = null;
        var4 = ((cn) this).field_h.a(52, param1);
        if (param2 != 12) {
          return;
        } else {
          var4.field_J = ((cn) this).field_m;
          var4.field_x = ((cn) this).field_l;
          param1.field_a[((cn) this).field_l][((cn) this).field_m].field_l = var4;
          var4.f(32);
          return;
        }
    }

    final void a(lu param0, byte param1) {
        this.a(param0, (byte) 100);
        er.a(((cn) this).field_h, 109, param0);
        param0.d(((cn) this).field_l, 0);
        int var3 = -63 % ((param1 - 34) / 58);
        param0.d(((cn) this).field_m, 0);
    }

    final static boolean d(byte param0) {
        if (param0 <= 9) {
            return false;
        }
        return !sea.field_j ? true : false;
    }

    final static void a(byte param0, int param1, kv param2, int[] param3, int param4, int param5, kv param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        L0: {
          var14 = BachelorFridge.field_y;
          param5 -= 3;
          if (param6.field_q >= param1) {
            break L0;
          } else {
            param1 = param6.field_q;
            break L0;
          }
        }
        var7 = 1 + param6.field_q;
        if (param0 < -60) {
          var8 = 1;
          L1: while (true) {
            L2: {
              if (-1 + param6.field_p <= var8) {
                break L2;
              } else {
                var9 = 1;
                L3: while (true) {
                  L4: {
                    if (param1 <= var9) {
                      break L4;
                    } else {
                      L5: {
                        var10 = 255 & param6.field_v[var7];
                        if ((param6.field_v[param6.field_q + var7] & 255 ^ -1) >= (var10 ^ -1)) {
                          break L5;
                        } else {
                          var10 = param6.field_v[var7 + param6.field_q] & 255;
                          break L5;
                        }
                      }
                      L6: {
                        if ((255 & param6.field_v[-param6.field_q + var7]) <= var10) {
                          break L6;
                        } else {
                          var10 = 255 & param6.field_v[-param6.field_q + var7];
                          break L6;
                        }
                      }
                      L7: {
                        if (var10 >= (param6.field_v[param6.field_q + var7 + 1] & 255)) {
                          break L7;
                        } else {
                          var10 = 255 & param6.field_v[1 + param6.field_q + var7];
                          break L7;
                        }
                      }
                      L8: {
                        if ((255 & param6.field_v[-1 + (-param6.field_q + var7)]) > var10) {
                          var10 = param6.field_v[-param6.field_q + var7 - 1] & 255;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      L9: {
                        if ((param6.field_v[param6.field_q + (var7 - 1)] & 255) <= var10) {
                          break L9;
                        } else {
                          var10 = 255 & param6.field_v[-1 + var7 + param6.field_q];
                          break L9;
                        }
                      }
                      L10: {
                        if (var10 >= (param6.field_v[1 + -param6.field_q + var7] & 255)) {
                          break L10;
                        } else {
                          var10 = 255 & param6.field_v[1 + (-param6.field_q + var7)];
                          break L10;
                        }
                      }
                      L11: {
                        if (var10 < (255 & param6.field_v[var7 + 1])) {
                          var10 = param6.field_v[var7 + 1] & 255;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      L12: {
                        if (var10 >= (param6.field_v[var7 - 1] & 255)) {
                          break L12;
                        } else {
                          var10 = 255 & param6.field_v[var7 + -1];
                          break L12;
                        }
                      }
                      var7++;
                      param2.field_v[var7] = var10;
                      var9++;
                      if (0 == 0) {
                        continue L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var7 = var7 + (param6.field_q + -param1 - -1);
                  var8++;
                  if (0 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
            var7 = 0;
            var8 = 0;
            L13: while (true) {
              L14: {
                if (param6.field_p <= var8) {
                  break L14;
                } else {
                  var9 = param3[param3.length * var8 / param6.field_p];
                  var10 = 0;
                  L15: while (true) {
                    L16: {
                      if (param1 <= var10) {
                        break L16;
                      } else {
                        L17: {
                          var11 = 255 & param6.field_v[var7];
                          var12 = 255 & param2.field_v[var7];
                          var13 = 0;
                          var13 = var13 | (65280 & (var9 >> -2031227632) * var11) << -263543448;
                          var13 = var13 | 65280 & ((65280 & var9) >> 1893831592) * var11;
                          var13 = var13 | (65280 & var11 * (255 & var9)) >> -1617086424;
                          if ((param6.field_v[var7] ^ -1) > -1) {
                            break L17;
                          } else {
                            tla.a(param4 + var10, -1898743704, var13, var8 + param5, var12);
                            break L17;
                          }
                        }
                        var7++;
                        var10++;
                        if (0 == 0) {
                          continue L15;
                        } else {
                          break L16;
                        }
                      }
                    }
                    var7 = var7 + (param6.field_q + -param1);
                    var8++;
                    if (0 == 0) {
                      continue L13;
                    } else {
                      break L14;
                    }
                  }
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    final static kka a(byte param0, int param1) {
        kka var2 = new kka();
        gs.field_l.a((bw) (Object) var2, true);
        ah.a(4, param1);
        int var3 = 89 % ((66 - param0) / 56);
        return var2;
    }

    public static void e(byte param0) {
        field_i = null;
        field_j = null;
        field_k = null;
        if (param0 <= 84) {
            field_i = null;
        }
    }

    cn(nq param0, int param1, int param2) {
        ((cn) this).field_l = param1;
        ((cn) this).field_h = param0;
        ((cn) this).field_m = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_i = "Off";
    }
}
