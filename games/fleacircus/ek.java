/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek {
    static fh field_a;
    static dd field_c;
    static int[] field_d;
    static int[] field_b;

    public static void b(byte param0) {
        field_c = null;
        field_d = null;
        if (param0 != -42) {
          field_d = null;
          field_a = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_b = null;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_68_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        var13 = fleas.field_A ? 1 : 0;
        var5 = param4 + param1;
        if (param3 == 1) {
          L0: {
            var6 = param2 + param0;
            if (gb.field_l >= param1) {
              stackOut_58_0 = gb.field_l;
              stackIn_59_0 = stackOut_58_0;
              break L0;
            } else {
              stackOut_57_0 = param1;
              stackIn_59_0 = stackOut_57_0;
              break L0;
            }
          }
          L1: {
            var7 = stackIn_59_0;
            if (param2 > gb.field_b) {
              stackOut_61_0 = param2;
              stackIn_62_0 = stackOut_61_0;
              break L1;
            } else {
              stackOut_60_0 = gb.field_b;
              stackIn_62_0 = stackOut_60_0;
              break L1;
            }
          }
          L2: {
            var8 = stackIn_62_0;
            if (gb.field_h > var5) {
              stackOut_64_0 = var5;
              stackIn_65_0 = stackOut_64_0;
              break L2;
            } else {
              stackOut_63_0 = gb.field_h;
              stackIn_65_0 = stackOut_63_0;
              break L2;
            }
          }
          L3: {
            var9 = stackIn_65_0;
            if (gb.field_i <= var6) {
              stackOut_67_0 = gb.field_i;
              stackIn_68_0 = stackOut_67_0;
              break L3;
            } else {
              stackOut_66_0 = var6;
              stackIn_68_0 = stackOut_66_0;
              break L3;
            }
          }
          L4: {
            var10 = stackIn_68_0;
            if (gb.field_l > param1) {
              break L4;
            } else {
              if (param1 < gb.field_h) {
                var11 = param1 + gb.field_d * var8;
                var12 = -var8 + var10 + 1 >> -428364607;
                L5: while (true) {
                  var12--;
                  if ((var12 ^ -1) > -1) {
                    break L4;
                  } else {
                    gb.field_a[var11] = 16777215;
                    var11 = var11 + gb.field_d * 2;
                    continue L5;
                  }
                }
              } else {
                L6: {
                  if (gb.field_b > param2) {
                    break L6;
                  } else {
                    if (var6 >= gb.field_i) {
                      break L6;
                    } else {
                      var11 = param2 * gb.field_d + var7;
                      var12 = var9 + (1 - var7) >> -384811807;
                      L7: while (true) {
                        var12--;
                        if (-1 < (var12 ^ -1)) {
                          break L6;
                        } else {
                          gb.field_a[var11] = 16777215;
                          var11 += 2;
                          continue L7;
                        }
                      }
                    }
                  }
                }
                L8: {
                  if (gb.field_l > var5) {
                    break L8;
                  } else {
                    if (var5 >= gb.field_h) {
                      break L8;
                    } else {
                      var11 = var5 + ((var5 + -param1 & 1) + var8) * gb.field_d;
                      var12 = var10 + 1 - var8 >> -738592351;
                      L9: while (true) {
                        var12--;
                        if (0 > var12) {
                          break L8;
                        } else {
                          gb.field_a[var11] = 16777215;
                          var11 = var11 + 2 * gb.field_d;
                          continue L9;
                        }
                      }
                    }
                  }
                }
                if (gb.field_b <= param2) {
                  if (gb.field_i <= var6) {
                    return;
                  } else {
                    var11 = var7 + var6 * gb.field_d - -(1 & -param2 + var6);
                    var12 = -var7 + (var9 + 1) >> -725892063;
                    L10: while (true) {
                      var12--;
                      if (0 > var12) {
                        return;
                      } else {
                        gb.field_a[var11] = 16777215;
                        var11 += 2;
                        continue L10;
                      }
                    }
                  }
                } else {
                  return;
                }
              }
            }
          }
          L11: {
            if (gb.field_b > param2) {
              break L11;
            } else {
              if (var6 >= gb.field_i) {
                break L11;
              } else {
                var11 = param2 * gb.field_d + var7;
                var12 = var9 + (1 - var7) >> -384811807;
                L12: while (true) {
                  var12--;
                  if (-1 < (var12 ^ -1)) {
                    break L11;
                  } else {
                    gb.field_a[var11] = 16777215;
                    var11 += 2;
                    continue L12;
                  }
                }
              }
            }
          }
          L13: {
            if (gb.field_l > var5) {
              break L13;
            } else {
              if (var5 >= gb.field_h) {
                break L13;
              } else {
                var11 = var5 + ((var5 + -param1 & 1) + var8) * gb.field_d;
                var12 = var10 + 1 - var8 >> -738592351;
                L14: while (true) {
                  var12--;
                  if (0 > var12) {
                    break L13;
                  } else {
                    gb.field_a[var11] = 16777215;
                    var11 = var11 + 2 * gb.field_d;
                    continue L14;
                  }
                }
              }
            }
          }
          L15: {
            if (gb.field_b > param2) {
              break L15;
            } else {
              if (gb.field_i > var6) {
                var11 = var7 + var6 * gb.field_d - -(1 & -param2 + var6);
                var12 = -var7 + (var9 + 1) >> -725892063;
                L16: while (true) {
                  var12--;
                  if (0 > var12) {
                    break L15;
                  } else {
                    gb.field_a[var11] = 16777215;
                    var11 += 2;
                    continue L16;
                  }
                }
              } else {
                return;
              }
            }
          }
          return;
        } else {
          L17: {
            field_c = null;
            var6 = param2 + param0;
            if (gb.field_l >= param1) {
              stackOut_3_0 = gb.field_l;
              stackIn_4_0 = stackOut_3_0;
              break L17;
            } else {
              stackOut_2_0 = param1;
              stackIn_4_0 = stackOut_2_0;
              break L17;
            }
          }
          L18: {
            var7 = stackIn_4_0;
            if (param2 > gb.field_b) {
              stackOut_6_0 = param2;
              stackIn_7_0 = stackOut_6_0;
              break L18;
            } else {
              stackOut_5_0 = gb.field_b;
              stackIn_7_0 = stackOut_5_0;
              break L18;
            }
          }
          L19: {
            var8 = stackIn_7_0;
            if (gb.field_h > var5) {
              stackOut_9_0 = var5;
              stackIn_10_0 = stackOut_9_0;
              break L19;
            } else {
              stackOut_8_0 = gb.field_h;
              stackIn_10_0 = stackOut_8_0;
              break L19;
            }
          }
          L20: {
            var9 = stackIn_10_0;
            if (gb.field_i <= var6) {
              stackOut_12_0 = gb.field_i;
              stackIn_13_0 = stackOut_12_0;
              break L20;
            } else {
              stackOut_11_0 = var6;
              stackIn_13_0 = stackOut_11_0;
              break L20;
            }
          }
          L21: {
            var10 = stackIn_13_0;
            if (gb.field_l > param1) {
              break L21;
            } else {
              if (param1 < gb.field_h) {
                var11 = param1 + gb.field_d * var8;
                var12 = -var8 + var10 + 1 >> -428364607;
                L22: while (true) {
                  var12--;
                  if ((var12 ^ -1) > -1) {
                    break L21;
                  } else {
                    gb.field_a[var11] = 16777215;
                    var11 = var11 + gb.field_d * 2;
                    continue L22;
                  }
                }
              } else {
                L23: {
                  if (gb.field_b > param2) {
                    break L23;
                  } else {
                    if (var6 >= gb.field_i) {
                      break L23;
                    } else {
                      var11 = param2 * gb.field_d + var7;
                      var12 = var9 + (1 - var7) >> -384811807;
                      L24: while (true) {
                        var12--;
                        if (-1 < (var12 ^ -1)) {
                          break L23;
                        } else {
                          gb.field_a[var11] = 16777215;
                          var11 += 2;
                          continue L24;
                        }
                      }
                    }
                  }
                }
                L25: {
                  if (gb.field_l > var5) {
                    break L25;
                  } else {
                    if (var5 >= gb.field_h) {
                      break L25;
                    } else {
                      var11 = var5 + ((var5 + -param1 & 1) + var8) * gb.field_d;
                      var12 = var10 + 1 - var8 >> -738592351;
                      L26: while (true) {
                        var12--;
                        if (0 > var12) {
                          break L25;
                        } else {
                          gb.field_a[var11] = 16777215;
                          var11 = var11 + 2 * gb.field_d;
                          continue L26;
                        }
                      }
                    }
                  }
                }
                L27: {
                  if (gb.field_b > param2) {
                    break L27;
                  } else {
                    if (gb.field_i > var6) {
                      var11 = var7 + var6 * gb.field_d - -(1 & -param2 + var6);
                      var12 = -var7 + (var9 + 1) >> -725892063;
                      L28: while (true) {
                        var12--;
                        if (0 > var12) {
                          break L27;
                        } else {
                          gb.field_a[var11] = 16777215;
                          var11 += 2;
                          continue L28;
                        }
                      }
                    } else {
                      break L27;
                    }
                  }
                }
                return;
              }
            }
          }
          L29: {
            if (gb.field_b > param2) {
              break L29;
            } else {
              if (var6 >= gb.field_i) {
                break L29;
              } else {
                var11 = param2 * gb.field_d + var7;
                var12 = var9 + (1 - var7) >> -384811807;
                L30: while (true) {
                  var12--;
                  if (-1 < (var12 ^ -1)) {
                    break L29;
                  } else {
                    gb.field_a[var11] = 16777215;
                    var11 += 2;
                    continue L30;
                  }
                }
              }
            }
          }
          L31: {
            if (gb.field_l > var5) {
              break L31;
            } else {
              if (var5 >= gb.field_h) {
                break L31;
              } else {
                var11 = var5 + ((var5 + -param1 & 1) + var8) * gb.field_d;
                var12 = var10 + 1 - var8 >> -738592351;
                L32: while (true) {
                  var12--;
                  if (0 > var12) {
                    break L31;
                  } else {
                    gb.field_a[var11] = 16777215;
                    var11 = var11 + 2 * gb.field_d;
                    continue L32;
                  }
                }
              }
            }
          }
          if (gb.field_b <= param2) {
            if (gb.field_i <= var6) {
              return;
            } else {
              var11 = var7 + var6 * gb.field_d - -(1 & -param2 + var6);
              var12 = -var7 + (var9 + 1) >> -725892063;
              L33: while (true) {
                var12--;
                if (0 > var12) {
                  return;
                } else {
                  gb.field_a[var11] = 16777215;
                  var11 += 2;
                  continue L33;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    final static void a(byte param0) {
        String var1 = null;
        if (jg.field_d) {
          if (ok.field_x == null) {
            var1 = ni.d(true);
            lg.field_b = new ul(var1, (String) null, true, false, false);
            nb.field_a.b((qa) (Object) ak.field_a, (byte) -35);
            if (param0 != -6) {
              ek.a((byte) 6);
              ak.field_a.d((qa) (Object) lg.field_b, 26034);
              ak.field_a.l(param0 ^ 5);
              return;
            } else {
              ak.field_a.d((qa) (Object) lg.field_b, 26034);
              ak.field_a.l(param0 ^ 5);
              return;
            }
          } else {
            ok.field_x.n(param0 ^ 22641);
            var1 = ni.d(true);
            lg.field_b = new ul(var1, (String) null, true, false, false);
            nb.field_a.b((qa) (Object) ak.field_a, (byte) -35);
            if (param0 == -6) {
              ak.field_a.d((qa) (Object) lg.field_b, 26034);
              ak.field_a.l(param0 ^ 5);
              return;
            } else {
              ek.a((byte) 6);
              ak.field_a.d((qa) (Object) lg.field_b, 26034);
              ak.field_a.l(param0 ^ 5);
              return;
            }
          }
        } else {
          throw new IllegalStateException();
        }
    }

    final static void a(int param0, int param1) {
        cl.field_a = ol.field_b[param1];
        if (param0 != 10) {
            return;
        }
        sg.field_a = hg.field_p[param1];
        mk.field_a = sa.field_c[param1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new fh(15, 0, 1, 0);
        field_d = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_b = new int[10];
    }
}
