/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii {
    private byte[] field_c;
    private int[] field_f;
    static pd field_a;
    private int[] field_e;
    static int field_b;
    static km field_d;

    final static void b(byte param0) {
        vi.b((byte) -123);
        co.field_d = true;
        kb.field_c = true;
        if (param0 >= -94) {
            ii.a((byte) 80);
        }
        tm.field_l.a((byte) 76);
        gk.a(false, jm.field_a, false);
    }

    final int a(int param0, int param1, int param2, int param3, byte[] param4, byte[] param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        L0: {
          var15 = Virogrid.field_F ? 1 : 0;
          var7 = 0;
          if (param2 == -7089) {
            break L0;
          } else {
            field_d = null;
            break L0;
          }
        }
        param0 = param0 + param3;
        var8 = param1 << -1824655709;
        L1: while (true) {
          if (param0 <= param3) {
            return -param1 + (7 + var8 >> -687354173);
          } else {
            var9 = 255 & param4[param3];
            var10 = ((ii) this).field_e[var9];
            var11 = ((ii) this).field_c[var9];
            if (var11 == 0) {
              throw new RuntimeException("" + var9);
            } else {
              L2: {
                var12 = var8 >> -1169947773;
                var13 = var8 & 7;
                var7 = var7 & -var13 >> 1461743583;
                var14 = var12 + (-1 + (var13 + var11) >> 1566349763);
                var13 += 24;
                var7 = oh.a(var7, var10 >>> var13);
                param5[var12] = (byte)oh.a(var7, var10 >>> var13);
                if (var12 >= var14) {
                  break L2;
                } else {
                  var13 -= 8;
                  var12++;
                  var7 = var10 >>> var13;
                  param5[var12] = (byte)(var10 >>> var13);
                  if (var14 > var12) {
                    var12++;
                    var13 -= 8;
                    var7 = var10 >>> var13;
                    param5[var12] = (byte)(var10 >>> var13);
                    if (var12 >= var14) {
                      break L2;
                    } else {
                      var12++;
                      var13 -= 8;
                      var7 = var10 >>> var13;
                      param5[var12] = (byte)(var10 >>> var13);
                      if (var12 >= var14) {
                        break L2;
                      } else {
                        var12++;
                        var13 -= 8;
                        var7 = var10 << -var13;
                        param5[var12] = (byte)(var10 << -var13);
                        break L2;
                      }
                    }
                  } else {
                    var8 = var8 + var11;
                    param3++;
                    continue L1;
                  }
                }
              }
              var8 = var8 + var11;
              param3++;
              continue L1;
            }
          }
        }
    }

    final int a(byte[] param0, int param1, int param2, int param3, byte[] param4, boolean param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Virogrid.field_F ? 1 : 0;
        if (param3 != 0) {
          L0: {
            param3 = param3 + param2;
            var7 = 0;
            if (param5) {
              break L0;
            } else {
              ((ii) this).field_c = null;
              break L0;
            }
          }
          var8 = param1;
          L1: while (true) {
            L2: {
              var9 = param4[var8];
              if (var9 >= 0) {
                var7++;
                break L2;
              } else {
                var7 = ((ii) this).field_f[var7];
                break L2;
              }
            }
            L3: {
              L4: {
                var10 = ((ii) this).field_f[var7];
                if (0 > ((ii) this).field_f[var7]) {
                  param2++;
                  param0[param2] = (byte)(var10 ^ -1);
                  if (param2 >= param3) {
                    break L3;
                  } else {
                    var7 = 0;
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
              L5: {
                if (0 != (64 & var9)) {
                  var7 = ((ii) this).field_f[var7];
                  break L5;
                } else {
                  var7++;
                  break L5;
                }
              }
              L6: {
                var10 = ((ii) this).field_f[var7];
                if (((ii) this).field_f[var7] >= 0) {
                  break L6;
                } else {
                  param2++;
                  param0[param2] = (byte)(var10 ^ -1);
                  if (param3 > param2) {
                    var7 = 0;
                    break L6;
                  } else {
                    break L3;
                  }
                }
              }
              L7: {
                if ((32 & var9) == 0) {
                  var7++;
                  break L7;
                } else {
                  var7 = ((ii) this).field_f[var7];
                  break L7;
                }
              }
              L8: {
                var10 = ((ii) this).field_f[var7];
                if (0 <= ((ii) this).field_f[var7]) {
                  break L8;
                } else {
                  param2++;
                  param0[param2] = (byte)var10;
                  if (param2 < param3) {
                    var7 = 0;
                    break L8;
                  } else {
                    break L3;
                  }
                }
              }
              L9: {
                if (-1 == (16 & var9)) {
                  var7++;
                  break L9;
                } else {
                  var7 = ((ii) this).field_f[var7];
                  break L9;
                }
              }
              L10: {
                var10 = ((ii) this).field_f[var7];
                if (((ii) this).field_f[var7] < 0) {
                  param2++;
                  param0[param2] = (byte)(var10 ^ -1);
                  if (param2 < param3) {
                    var7 = 0;
                    break L10;
                  } else {
                    break L3;
                  }
                } else {
                  break L10;
                }
              }
              L11: {
                if (0 == (var9 & 8)) {
                  var7++;
                  break L11;
                } else {
                  var7 = ((ii) this).field_f[var7];
                  break L11;
                }
              }
              L12: {
                var10 = ((ii) this).field_f[var7];
                if (-1 < (((ii) this).field_f[var7] ^ -1)) {
                  param2++;
                  param0[param2] = (byte)var10;
                  if (param2 < param3) {
                    var7 = 0;
                    break L12;
                  } else {
                    break L3;
                  }
                } else {
                  break L12;
                }
              }
              L13: {
                if (-1 == (var9 & 4)) {
                  var7++;
                  break L13;
                } else {
                  var7 = ((ii) this).field_f[var7];
                  break L13;
                }
              }
              L14: {
                var10 = ((ii) this).field_f[var7];
                if (((ii) this).field_f[var7] >= 0) {
                  break L14;
                } else {
                  param2++;
                  param0[param2] = (byte)(var10 ^ -1);
                  if (param2 < param3) {
                    var7 = 0;
                    break L14;
                  } else {
                    return -param1 + (var8 - -1);
                  }
                }
              }
              L15: {
                if (-1 != (2 & var9 ^ -1)) {
                  var7 = ((ii) this).field_f[var7];
                  break L15;
                } else {
                  var7++;
                  break L15;
                }
              }
              L16: {
                var10 = ((ii) this).field_f[var7];
                if (((ii) this).field_f[var7] >= 0) {
                  break L16;
                } else {
                  param2++;
                  param0[param2] = (byte)(var10 ^ -1);
                  if (param2 >= param3) {
                    break L3;
                  } else {
                    var7 = 0;
                    break L16;
                  }
                }
              }
              L17: {
                if ((1 & var9) == 0) {
                  var7++;
                  break L17;
                } else {
                  var7 = ((ii) this).field_f[var7];
                  break L17;
                }
              }
              var10 = ((ii) this).field_f[var7];
              if (-1 < (((ii) this).field_f[var7] ^ -1)) {
                param2++;
                param0[param2] = (byte)(var10 ^ -1);
                if (param2 >= param3) {
                  break L3;
                } else {
                  var7 = 0;
                  var8++;
                  continue L1;
                }
              } else {
                var8++;
                continue L1;
              }
            }
            return -param1 + (var8 - -1);
          }
        } else {
          return 0;
        }
    }

    final static String a(byte param0, boolean param1, CharSequence param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Virogrid.field_F ? 1 : 0;
        if (param2 != null) {
          L0: {
            var3 = param2.length();
            if (-2 < (var3 ^ -1)) {
              break L0;
            } else {
              if (var3 > 12) {
                break L0;
              } else {
                var4 = c.a(param2, true);
                if (param0 == 105) {
                  L1: {
                    if (var4 == null) {
                      break L1;
                    } else {
                      if (1 > var4.length()) {
                        break L1;
                      } else {
                        L2: {
                          if (ck.a(var4.charAt(0), -46)) {
                            break L2;
                          } else {
                            if (!ck.a(var4.charAt(-1 + var4.length()), param0 + -151)) {
                              var5 = 0;
                              var6 = 0;
                              L3: while (true) {
                                if (var6 >= param2.length()) {
                                  if ((var5 ^ -1) < -1) {
                                    return wa.field_H;
                                  } else {
                                    return null;
                                  }
                                } else {
                                  L4: {
                                    var7 = param2.charAt(var6);
                                    if (!ck.a((char) var7, -46)) {
                                      var5 = 0;
                                      break L4;
                                    } else {
                                      var5++;
                                      break L4;
                                    }
                                  }
                                  if (-3 >= (var5 ^ -1)) {
                                    if (!param1) {
                                      return km.field_P;
                                    } else {
                                      var6++;
                                      continue L3;
                                    }
                                  } else {
                                    var6++;
                                    continue L3;
                                  }
                                }
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                        return wa.field_H;
                      }
                    }
                  }
                  return ti.field_a;
                } else {
                  return null;
                }
              }
            }
          }
          return ti.field_a;
        } else {
          return ti.field_a;
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != 6) {
            Object var2 = null;
            String discarded$0 = ii.a((byte) -116, false, (CharSequence) null);
        }
        field_d = null;
    }

    ii(byte[] param0) {
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
        ((ii) this).field_c = param0;
        ((ii) this).field_e = new int[var2];
        ((ii) this).field_f = new int[8];
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
            if (var6 != 0) {
              L1: {
                var7 = 1 << -var6 + 32;
                var8 = var19[var6];
                ((ii) this).field_e[var5] = var8;
                if ((var7 & var8) != 0) {
                  var9 = var3[var6 + -1];
                  break L1;
                } else {
                  var9 = var8 | var7;
                  var10 = var6 - 1;
                  L2: while (true) {
                    if (var10 < 1) {
                      break L1;
                    } else {
                      var11 = var19[var10];
                      if (var8 != var11) {
                        break L1;
                      } else {
                        var12 = 1 << 32 - var10;
                        if (-1 != (var11 & var12 ^ -1)) {
                          var3[var10] = var3[-1 + var10];
                          break L1;
                        } else {
                          var3[var10] = oh.a(var12, var11);
                          var10--;
                          continue L2;
                        }
                      }
                    }
                  }
                }
              }
              var19[var6] = var9;
              var10 = 1 + var6;
              L3: while (true) {
                if (32 < var10) {
                  var10 = 0;
                  var11 = 0;
                  L4: while (true) {
                    if (var6 <= var11) {
                      L5: {
                        if (var10 < var4) {
                          break L5;
                        } else {
                          var4 = var10 + 1;
                          break L5;
                        }
                      }
                      ((ii) this).field_f[var10] = var5 ^ -1;
                      var5++;
                      continue L0;
                    } else {
                      L6: {
                        var12 = -2147483648 >>> var11;
                        if (0 != (var8 & var12)) {
                          L7: {
                            if (0 != ((ii) this).field_f[var10]) {
                              break L7;
                            } else {
                              ((ii) this).field_f[var10] = var4;
                              break L7;
                            }
                          }
                          var10 = ((ii) this).field_f[var10];
                          break L6;
                        } else {
                          var10++;
                          break L6;
                        }
                      }
                      var12 = var12 >>> 1;
                      if (var10 >= ((ii) this).field_f.length) {
                        var13 = new int[2 * ((ii) this).field_f.length];
                        var14 = 0;
                        L8: while (true) {
                          if (var14 >= ((ii) this).field_f.length) {
                            ((ii) this).field_f = var13;
                            var11++;
                            continue L4;
                          } else {
                            var13[var14] = ((ii) this).field_f[var14];
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
                  if (var8 == var19[var10]) {
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

    final static int a(uh param0, uh param1, int param2) {
        if (param2 != 27984) {
            field_a = null;
        }
        Object var4 = null;
        return wh.a(0, false, 0, true, (String) null, param1, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
    }
}
