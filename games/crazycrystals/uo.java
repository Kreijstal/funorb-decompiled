/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uo extends el {
    static int[] field_k;
    static wh field_n;
    private int field_j;
    static int[] field_l;
    static int field_o;
    static int field_m;
    private boolean field_p;
    static dc field_i;

    final void a(boolean param0, int param1, int param2, byte param3, boolean param4, int param5, int param6) {
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
        var17 = CrazyCrystals.field_B;
        var8 = kh.field_c;
        var9 = kh.field_b;
        var10 = kh.field_g;
        var11 = kh.field_j;
        if (param4) {
          if (param4) {
            if (param3 <= -59) {
              var12 = 0;
              L0: while (true) {
                if (-9 >= (var12 ^ -1)) {
                  var12 = param1 * (16 - -((uo) this).field_j) >> -461073084;
                  var13 = -var12 + (param1 + param5);
                  var14 = param2 + param6 - (var12 * (((uo) this).field_j - -16) >> 1489868387);
                  if (0 >= 3 * var12 + var14) {
                    kh.d(var8, var9, var10, var11);
                    return;
                  } else {
                    if (param4) {
                      ((uo) this).field_a.h(-30).b(var13, var14, var12 * 2, var12 * 3, ek.field_f[((uo) this).field_a.field_u]);
                      kh.d(var8, var9, var10, var11);
                      return;
                    } else {
                      ((uo) this).field_p = false;
                      ((uo) this).field_a.h(-30).b(var13, var14, var12 * 2, var12 * 3, ek.field_f[((uo) this).field_a.field_u]);
                      kh.d(var8, var9, var10, var11);
                      return;
                    }
                  }
                } else {
                  var13 = -var12 + (-1 + (((uo) this).field_j >> 1196954369)) << 308704545;
                  if (-1 >= (var13 ^ -1)) {
                    L1: {
                      var14 = (var13 + 16) * param1 >> 521682852;
                      var15 = param1 + (param5 - (var14 >> -1530299902));
                      var16 = -(var14 * (-2 + var13 - -16) >> 1008753315) + (param2 + param6);
                      if (-1 > (var16 - -(var14 * 3 >> -593657662) ^ -1)) {
                        L2: {
                          if (param4) {
                            break L2;
                          } else {
                            ((uo) this).field_p = false;
                            break L2;
                          }
                        }
                        bd.field_n[var12].a(var15, var16, var14 >> -702978623, var14 * 3 >> 1427565250, 256);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    var12++;
                    continue L0;
                  } else {
                    L3: {
                      var12 = param1 * (16 - -((uo) this).field_j) >> -461073084;
                      var13 = -var12 + (param1 + param5);
                      var14 = param2 + param6 - (var12 * (((uo) this).field_j - -16) >> 1489868387);
                      if (0 >= 3 * var12 + var14) {
                        break L3;
                      } else {
                        if (param4) {
                          ((uo) this).field_a.h(-30).b(var13, var14, var12 * 2, var12 * 3, ek.field_f[((uo) this).field_a.field_u]);
                          break L3;
                        } else {
                          ((uo) this).field_p = false;
                          ((uo) this).field_a.h(-30).b(var13, var14, var12 * 2, var12 * 3, ek.field_f[((uo) this).field_a.field_u]);
                          break L3;
                        }
                      }
                    }
                    kh.d(var8, var9, var10, var11);
                    return;
                  }
                }
              }
            } else {
              ((uo) this).a(true, -118, 73, (byte) -80, true, 50, -86);
              var12 = 0;
              if (-9 < (var12 ^ -1)) {
                L4: {
                  var13 = -var12 + (-1 + (((uo) this).field_j >> 1196954369)) << 308704545;
                  if (-1 >= (var13 ^ -1)) {
                    L5: {
                      var14 = (var13 + 16) * param1 >> 521682852;
                      var15 = param1 + (param5 - (var14 >> -1530299902));
                      var16 = -(var14 * (-2 + var13 - -16) >> 1008753315) + (param2 + param6);
                      if (-1 > (var16 - -(var14 * 3 >> -593657662) ^ -1)) {
                        L6: {
                          if (param4) {
                            break L6;
                          } else {
                            ((uo) this).field_p = false;
                            break L6;
                          }
                        }
                        bd.field_n[var12].a(var15, var16, var14 >> -702978623, var14 * 3 >> 1427565250, 256);
                        break L5;
                      } else {
                        var12++;
                        break L5;
                      }
                    }
                    var12++;
                    var12++;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var12 = param1 * (16 - -((uo) this).field_j) >> -461073084;
                var13 = -var12 + (param1 + param5);
                var14 = param2 + param6 - (var12 * (((uo) this).field_j - -16) >> 1489868387);
                if (0 < 3 * var12 + var14) {
                  if (param4) {
                    ((uo) this).field_a.h(-30).b(var13, var14, var12 * 2, var12 * 3, ek.field_f[((uo) this).field_a.field_u]);
                    kh.d(var8, var9, var10, var11);
                    return;
                  } else {
                    ((uo) this).field_p = false;
                    ((uo) this).field_a.h(-30).b(var13, var14, var12 * 2, var12 * 3, ek.field_f[((uo) this).field_a.field_u]);
                    kh.d(var8, var9, var10, var11);
                    return;
                  }
                } else {
                  kh.d(var8, var9, var10, var11);
                  return;
                }
              } else {
                L7: {
                  var12 = param1 * (16 - -((uo) this).field_j) >> -461073084;
                  var13 = -var12 + (param1 + param5);
                  var14 = param2 + param6 - (var12 * (((uo) this).field_j - -16) >> 1489868387);
                  if (0 >= 3 * var12 + var14) {
                    break L7;
                  } else {
                    if (param4) {
                      ((uo) this).field_a.h(-30).b(var13, var14, var12 * 2, var12 * 3, ek.field_f[((uo) this).field_a.field_u]);
                      break L7;
                    } else {
                      ((uo) this).field_p = false;
                      ((uo) this).field_a.h(-30).b(var13, var14, var12 * 2, var12 * 3, ek.field_f[((uo) this).field_a.field_u]);
                      break L7;
                    }
                  }
                }
                kh.d(var8, var9, var10, var11);
                return;
              }
            }
          } else {
            L8: {
              ((uo) this).field_p = true;
              if (param3 <= -59) {
                break L8;
              } else {
                ((uo) this).a(true, -118, 73, (byte) -80, true, 50, -86);
                break L8;
              }
            }
            L9: {
              var12 = 0;
              if (-9 >= (var12 ^ -1)) {
                break L9;
              } else {
                var13 = -var12 + (-1 + (((uo) this).field_j >> 1196954369)) << 308704545;
                if (-1 >= (var13 ^ -1)) {
                  L10: {
                    var14 = (var13 + 16) * param1 >> 521682852;
                    var15 = param1 + (param5 - (var14 >> -1530299902));
                    var16 = -(var14 * (-2 + var13 - -16) >> 1008753315) + (param2 + param6);
                    if (-1 > (var16 - -(var14 * 3 >> -593657662) ^ -1)) {
                      L11: {
                        if (param4) {
                          break L11;
                        } else {
                          ((uo) this).field_p = false;
                          break L11;
                        }
                      }
                      bd.field_n[var12].a(var15, var16, var14 >> -702978623, var14 * 3 >> 1427565250, 256);
                      break L10;
                    } else {
                      var12++;
                      break L10;
                    }
                  }
                  var12++;
                  var12++;
                  var12++;
                  break L9;
                } else {
                  break L9;
                }
              }
            }
            L12: {
              var12 = param1 * (16 - -((uo) this).field_j) >> -461073084;
              var13 = -var12 + (param1 + param5);
              var14 = param2 + param6 - (var12 * (((uo) this).field_j - -16) >> 1489868387);
              if (0 >= 3 * var12 + var14) {
                break L12;
              } else {
                if (param4) {
                  ((uo) this).field_a.h(-30).b(var13, var14, var12 * 2, var12 * 3, ek.field_f[((uo) this).field_a.field_u]);
                  break L12;
                } else {
                  ((uo) this).field_p = false;
                  ((uo) this).field_a.h(-30).b(var13, var14, var12 * 2, var12 * 3, ek.field_f[((uo) this).field_a.field_u]);
                  break L12;
                }
              }
            }
            kh.d(var8, var9, var10, var11);
            return;
          }
        } else {
          L13: {
            kh.d(0, 0, 480, 480);
            if (param4) {
              break L13;
            } else {
              ((uo) this).field_p = true;
              break L13;
            }
          }
          L14: {
            if (param3 <= -59) {
              break L14;
            } else {
              ((uo) this).a(true, -118, 73, (byte) -80, true, 50, -86);
              break L14;
            }
          }
          L15: {
            var12 = 0;
            if (-9 >= (var12 ^ -1)) {
              break L15;
            } else {
              var13 = -var12 + (-1 + (((uo) this).field_j >> 1196954369)) << 308704545;
              if (-1 >= (var13 ^ -1)) {
                L16: {
                  var14 = (var13 + 16) * param1 >> 521682852;
                  var15 = param1 + (param5 - (var14 >> -1530299902));
                  var16 = -(var14 * (-2 + var13 - -16) >> 1008753315) + (param2 + param6);
                  if (-1 > (var16 - -(var14 * 3 >> -593657662) ^ -1)) {
                    L17: {
                      if (param4) {
                        break L17;
                      } else {
                        ((uo) this).field_p = false;
                        break L17;
                      }
                    }
                    bd.field_n[var12].a(var15, var16, var14 >> -702978623, var14 * 3 >> 1427565250, 256);
                    break L16;
                  } else {
                    var12++;
                    break L16;
                  }
                }
                var12++;
                var12++;
                var12++;
                break L15;
              } else {
                break L15;
              }
            }
          }
          L18: {
            var12 = param1 * (16 - -((uo) this).field_j) >> -461073084;
            var13 = -var12 + (param1 + param5);
            var14 = param2 + param6 - (var12 * (((uo) this).field_j - -16) >> 1489868387);
            if (0 >= 3 * var12 + var14) {
              break L18;
            } else {
              if (param4) {
                ((uo) this).field_a.h(-30).b(var13, var14, var12 * 2, var12 * 3, ek.field_f[((uo) this).field_a.field_u]);
                break L18;
              } else {
                ((uo) this).field_p = false;
                ((uo) this).field_a.h(-30).b(var13, var14, var12 * 2, var12 * 3, ek.field_f[((uo) this).field_a.field_u]);
                break L18;
              }
            }
          }
          kh.d(var8, var9, var10, var11);
          return;
        }
    }

    final fb a(int param0) {
        int var2 = 0;
        var2 = -48 / ((36 - param0) / 62);
        fb discarded$2 = super.a(99);
        ((uo) this).field_j = ((uo) this).field_j + 1;
        if (((uo) this).field_p) {
          return null;
        } else {
          return (fb) this;
        }
    }

    uo(fq param0) {
        super(param0, 21);
        ((uo) this).field_j = 0;
        ((uo) this).field_p = false;
    }

    public static void c(int param0) {
        field_n = null;
        field_l = null;
        int var1 = 69 / ((20 - param0) / 58);
        field_k = null;
        field_i = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new wh(2);
    }
}
