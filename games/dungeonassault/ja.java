/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja {
    static String[] field_d;
    private int[] field_e;
    private int[] field_c;
    static cn[] field_b;
    static String field_a;

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
            field_b = null;
        }
        field_d = null;
        field_b = null;
    }

    final int a(byte[] param0, byte[] param1, byte param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        L0: {
          var11 = DungeonAssault.field_K;
          if (param2 == -88) {
            break L0;
          } else {
            var12 = null;
            int discarded$1 = ((ja) this).a((byte[]) null, (byte[]) null, (byte) 93, -112, -52, -44);
            break L0;
          }
        }
        if (-1 == (param5 ^ -1)) {
          return 0;
        } else {
          param5 = param5 + param4;
          var7 = 0;
          var8 = param3;
          L1: while (true) {
            L2: {
              var9 = param0[var8];
              if ((var9 ^ -1) > -1) {
                var7 = ((ja) this).field_e[var7];
                break L2;
              } else {
                var7++;
                break L2;
              }
            }
            L3: {
              L4: {
                var10 = ((ja) this).field_e[var7];
                if (((ja) this).field_e[var7] < 0) {
                  param4++;
                  param1[param4] = (byte)(var10 ^ -1);
                  if (param4 < param5) {
                    var7 = 0;
                    break L4;
                  } else {
                    break L3;
                  }
                } else {
                  break L4;
                }
              }
              L5: {
                if ((var9 & 64) != 0) {
                  var7 = ((ja) this).field_e[var7];
                  break L5;
                } else {
                  var7++;
                  break L5;
                }
              }
              L6: {
                var10 = ((ja) this).field_e[var7];
                if (((ja) this).field_e[var7] >= 0) {
                  break L6;
                } else {
                  param4++;
                  param1[param4] = (byte)(var10 ^ -1);
                  if (param4 < param5) {
                    var7 = 0;
                    break L6;
                  } else {
                    break L3;
                  }
                }
              }
              L7: {
                if ((var9 & 32) == 0) {
                  var7++;
                  break L7;
                } else {
                  var7 = ((ja) this).field_e[var7];
                  break L7;
                }
              }
              L8: {
                var10 = ((ja) this).field_e[var7];
                if (((ja) this).field_e[var7] >= 0) {
                  break L8;
                } else {
                  param4++;
                  param1[param4] = (byte)(var10 ^ -1);
                  if (param5 > param4) {
                    var7 = 0;
                    break L8;
                  } else {
                    break L3;
                  }
                }
              }
              L9: {
                if (0 != (16 & var9)) {
                  var7 = ((ja) this).field_e[var7];
                  break L9;
                } else {
                  var7++;
                  break L9;
                }
              }
              L10: {
                var10 = ((ja) this).field_e[var7];
                if (-1 < (((ja) this).field_e[var7] ^ -1)) {
                  param4++;
                  param1[param4] = (byte)(var10 ^ -1);
                  if (param5 <= param4) {
                    break L3;
                  } else {
                    var7 = 0;
                    break L10;
                  }
                } else {
                  break L10;
                }
              }
              L11: {
                if (0 != (var9 & 8)) {
                  var7 = ((ja) this).field_e[var7];
                  break L11;
                } else {
                  var7++;
                  break L11;
                }
              }
              L12: {
                var10 = ((ja) this).field_e[var7];
                if (((ja) this).field_e[var7] >= 0) {
                  break L12;
                } else {
                  param4++;
                  param1[param4] = (byte)(var10 ^ -1);
                  if (param4 < param5) {
                    var7 = 0;
                    break L12;
                  } else {
                    break L3;
                  }
                }
              }
              L13: {
                if ((var9 & 4) != 0) {
                  var7 = ((ja) this).field_e[var7];
                  break L13;
                } else {
                  var7++;
                  break L13;
                }
              }
              L14: {
                var10 = ((ja) this).field_e[var7];
                if (((ja) this).field_e[var7] < 0) {
                  param4++;
                  param1[param4] = (byte)(var10 ^ -1);
                  if (param4 < param5) {
                    var7 = 0;
                    break L14;
                  } else {
                    return -param3 + (1 + var8);
                  }
                } else {
                  break L14;
                }
              }
              L15: {
                if (0 == (var9 & 2)) {
                  var7++;
                  break L15;
                } else {
                  var7 = ((ja) this).field_e[var7];
                  break L15;
                }
              }
              L16: {
                var10 = ((ja) this).field_e[var7];
                if (-1 >= (((ja) this).field_e[var7] ^ -1)) {
                  break L16;
                } else {
                  param4++;
                  param1[param4] = (byte)var10;
                  if (param4 >= param5) {
                    break L3;
                  } else {
                    var7 = 0;
                    break L16;
                  }
                }
              }
              L17: {
                if (-1 == (var9 & 1)) {
                  var7++;
                  break L17;
                } else {
                  var7 = ((ja) this).field_e[var7];
                  break L17;
                }
              }
              L18: {
                var10 = ((ja) this).field_e[var7];
                if (0 > ((ja) this).field_e[var7]) {
                  param4++;
                  param1[param4] = (byte)(var10 ^ -1);
                  if (param4 < param5) {
                    var7 = 0;
                    break L18;
                  } else {
                    break L3;
                  }
                } else {
                  break L18;
                }
              }
              var8++;
              continue L1;
            }
            return -param3 + (1 + var8);
          }
        }
    }

    ja(byte[] param0) {
        int var2 = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int var14 = 0;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        var2 = param0.length;
        ((ja) this).field_c = new int[var2];
        ((ja) this).field_e = new int[8];
        var19 = new int[33];
        var18 = var19;
        var17 = var18;
        var16 = var17;
        var3 = var16;
        var4 = 0;
        var5 = 0;
        L0: while (true) {
          if (var2 <= var5) {
          } else {
            var6 = param0[var5];
            if (-1 != (var6 ^ -1)) {
              L1: {
                var7 = 1 << 32 - var6;
                var8 = var19[var6];
                ((ja) this).field_c[var5] = var8;
                if ((var7 & var8) == 0) {
                  var9 = var8 | var7;
                  var10 = var6 + -1;
                  L2: while (true) {
                    if (var10 < 1) {
                      break L1;
                    } else {
                      var11 = var19[var10];
                      if (var11 != var8) {
                        break L1;
                      } else {
                        var12 = 1 << -var10 + 32;
                        if (0 != (var12 & var11)) {
                          var3[var10] = var3[-1 + var10];
                          break L1;
                        } else {
                          var3[var10] = mp.a(var11, var12);
                          var10--;
                          continue L2;
                        }
                      }
                    }
                  }
                } else {
                  var9 = var3[-1 + var6];
                  break L1;
                }
              }
              var19[var6] = var9;
              var10 = var6 + 1;
              L3: while (true) {
                if (var10 > 32) {
                  var10 = 0;
                  var11 = 0;
                  L4: while (true) {
                    if (var11 >= var6) {
                      L5: {
                        if (var4 > var10) {
                          break L5;
                        } else {
                          var4 = 1 + var10;
                          break L5;
                        }
                      }
                      ((ja) this).field_e[var10] = var5 ^ -1;
                      var5++;
                      continue L0;
                    } else {
                      L6: {
                        var12 = -2147483648 >>> var11;
                        if ((var12 & var8) != 0) {
                          L7: {
                            if (-1 != (((ja) this).field_e[var10] ^ -1)) {
                              break L7;
                            } else {
                              ((ja) this).field_e[var10] = var4;
                              break L7;
                            }
                          }
                          var10 = ((ja) this).field_e[var10];
                          break L6;
                        } else {
                          var10++;
                          break L6;
                        }
                      }
                      var12 = var12 >>> 1;
                      if (((ja) this).field_e.length <= var10) {
                        var13 = new int[2 * ((ja) this).field_e.length];
                        var14 = 0;
                        L8: while (true) {
                          if (var14 >= ((ja) this).field_e.length) {
                            ((ja) this).field_e = var13;
                            var11++;
                            continue L4;
                          } else {
                            var13[var14] = ((ja) this).field_e[var14];
                            var14++;
                            continue L8;
                          }
                        }
                      } else {
                        var11++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  if (var19[var10] == var8) {
                    var19[var10] = var9;
                    var10++;
                    continue L3;
                  } else {
                    var10++;
                    continue L3;
                  }
                }
              }
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    final static void a(int param0, int param1, byte param2, boolean param3, di[] param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = DungeonAssault.field_K;
          bj.field_G = false;
          ao.field_o = param0;
          hi.field_c.b(4973, -10 + ao.field_o);
          if (9 < hi.field_c.field_H) {
            hi.field_c.field_H = 9;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (fb.field_d == null) {
            fb.field_d = new di[10];
            break L1;
          } else {
            break L1;
          }
        }
        if (param2 == 22) {
          L2: {
            if (hi.field_c.field_D > 9) {
              hi.field_c.field_D = 9;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (param3) {
              var5 = 0;
              if (null != ip.field_j) {
                og.field_f = param1;
                vd.field_a = param1;
                hi.field_c.field_z = param1;
                var6 = 0;
                L4: while (true) {
                  if (param4.length <= var6) {
                    L5: {
                      if (var5 != 0) {
                        break L5;
                      } else {
                        qc.field_y = -1;
                        break L5;
                      }
                    }
                    gg.a((byte) -84);
                    break L3;
                  } else {
                    param4[var6].field_b = param1 + var6;
                    fb.field_d[var6] = param4[var6];
                    if (le.a(ip.field_j, fb.field_d[var6].field_i, param2 ^ -127)) {
                      qc.field_y = var6 + vd.field_a;
                      var5 = 1;
                      var6++;
                      continue L4;
                    } else {
                      var6++;
                      continue L4;
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              L6: {
                var5 = 0;
                if (og.field_f <= param1) {
                  break L6;
                } else {
                  var5 = -param1 + og.field_f;
                  break L6;
                }
              }
              L7: {
                var6 = param4.length;
                if (param4.length + param1 > fb.field_d.length + og.field_f) {
                  var6 = fb.field_d.length + (og.field_f + -param1);
                  break L7;
                } else {
                  break L7;
                }
              }
              var7 = var5;
              L8: while (true) {
                if (var7 >= var6) {
                  break L3;
                } else {
                  param4[var7].field_b = var7 + param1;
                  fb.field_d[var7 + param1 - og.field_f] = param4[var7];
                  var7++;
                  continue L8;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[]{"Circumvent", "Equally adept with the arts of mechanics and deception, the trusty toolkit of the <%0> is enough to disable any obstacle. (Single use)"};
        field_a = "Music: ";
    }
}
