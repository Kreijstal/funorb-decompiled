/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh {
    static String field_h;
    private int[] field_e;
    static String field_f;
    private int[] field_d;
    static String field_g;
    static int field_b;
    static String field_c;
    private byte[] field_a;

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        if ((f.field_a ^ -1) <= -1) {
          L0: {
            var3 = param0 - 135;
            var4 = param1 - 35;
            var5 = 256;
            if (f.field_a < 75) {
              var5 = (f.field_a << 1028906568) / 75;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (200 < f.field_a) {
              var5 = (-f.field_a + 250 << 1472587048) / 50;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            r.a(0, m.field_w);
            ep.e();
            oo.b();
            rl.a((byte) 125);
            if ((var5 ^ -1) > -257) {
              oo.f(0, 0, oo.field_b, oo.field_l, 0, -var5 + 256);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            ql.a(true);
            if ((f.field_a ^ -1) > -151) {
              m.field_w.f(var3, var4);
              break L3;
            } else {
              qp.field_v.c(15 + var3, var4 - -10, var5);
              break L3;
            }
          }
          if (param2 >= 70) {
            L4: {
              var6 = f.field_a + -125;
              if (0 >= var6) {
                break L4;
              } else {
                if (-51 < (var6 ^ -1)) {
                  if ((var6 ^ -1) <= -21) {
                    if (30 <= var6) {
                      var7 = 256 * (50 + -var6) / 20;
                      kk.field_r.e(var3, var4, var7);
                      break L4;
                    } else {
                      kk.field_r.e(var3, var4, 256);
                      break L4;
                    }
                  } else {
                    var7 = 256 * var6 / 20;
                    kk.field_r.e(var3, var4, var7);
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
            }
            L5: {
              var6 = f.field_a + -140;
              if (-1 > (var6 ^ -1)) {
                L6: {
                  var7 = 256;
                  if ((var6 ^ -1) <= -21) {
                    break L6;
                  } else {
                    var7 = var6 * 256 / 20;
                    break L6;
                  }
                }
                qd.field_s.c(var3 + 15, 10 + var4, var7 * var5 >> 853037672);
                break L5;
              } else {
                break L5;
              }
            }
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static ld a(boolean param0, cj param1, cj param2, cj param3, ob param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        ld[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        ob var13_ref = null;
        int var14 = 0;
        int var15 = 0;
        tl var16 = null;
        int var17 = 0;
        Object var18 = null;
        int[] var19 = null;
        char[] var20 = null;
        int[] var21 = null;
        char[] var22 = null;
        int[] var23 = null;
        char[] var24 = null;
        int[] var25 = null;
        char[] var26 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var17 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param4 != null) {
          L0: {
            if (param4.field_x != null) {
              stackOut_4_0 = param4.field_x.length;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var5 = stackIn_5_0;
            if (null != param4.field_B) {
              stackOut_7_0 = param4.field_B.length;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            } else {
              stackOut_6_0 = 0;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
          }
          L2: {
            var6 = stackIn_8_0;
            var7 = var5 + var6;
            if (!param0) {
              break L2;
            } else {
              var18 = null;
              ld discarded$1 = eh.a(false, (cj) null, (cj) null, (cj) null, (ob) null);
              break L2;
            }
          }
          L3: {
            var8 = new String[var7];
            var26 = new char[var7];
            var24 = var26;
            var22 = var24;
            var20 = var22;
            var9 = var20;
            var25 = new int[var7];
            var23 = var25;
            var21 = var23;
            var19 = var21;
            var10 = var19;
            var11 = new ld[var7];
            if (null == param4.field_x) {
              break L3;
            } else {
              var12 = 0;
              L4: while (true) {
                if (param4.field_x.length <= var12) {
                  break L3;
                } else {
                  var13_ref = ok.field_p.a(param4.field_x[var12], 32767);
                  var8[var12] = var13_ref.field_s;
                  var9[var12] = param4.field_r[var12];
                  var11[var12] = eh.a(false, param1, param2, param3, var13_ref);
                  var12++;
                  continue L4;
                }
              }
            }
          }
          L5: {
            if (param4.field_B == null) {
              break L5;
            } else {
              var12 = var5;
              var13 = 49;
              var14 = 0;
              L6: while (true) {
                if (param4.field_B.length <= var14) {
                  break L5;
                } else {
                  var15 = param4.field_B[var14];
                  if (var15 == -1) {
                    var8[var14 + var12] = le.field_I;
                    var9[var14 + var12] = param4.field_D[var14];
                    var10[var12 + var14] = param4.field_B[var14];
                    var14++;
                    continue L6;
                  } else {
                    L7: {
                      var16 = bd.field_c.a(var15, -11452);
                      var8[var12 - -var14] = var16.e(-18572);
                      var9[var12 + var14] = param4.field_D[var14];
                      if (var9[var12 + var14] <= 0) {
                        var13 = (char)(var13 + 1);
                        var9[var14 + var12] = (char)var13;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var10[var12 + var14] = param4.field_B[var14];
                    var14++;
                    continue L6;
                  }
                }
              }
            }
          }
          return new ld(0L, param3, param1, param2, var11, var25, var8, var26);
        } else {
          return null;
        }
    }

    final static void a(int param0) {
        int var3 = 0;
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        ja var1 = new ja(540, 140);
        r.a(0, var1);
        ep.e();
        oo.b();
        f.field_a = 0;
        rl.a((byte) 120);
        ja var2 = var1.c();
        for (var3 = 0; -16 < (var3 ^ -1); var3++) {
            var2.f(-2, -2, 16777215);
            oo.i(4, 4, 0, 0, 540, 140);
        }
        kk.field_r.a();
        var1.f(0, 0);
        if (param0 != -1741) {
            field_f = null;
        }
        ql.a(true);
    }

    public static void a(byte param0) {
        field_h = null;
        field_g = null;
        field_f = null;
        if (param0 <= 26) {
            Object var2 = null;
            ld discarded$0 = eh.a(false, (cj) null, (cj) null, (cj) null, (ob) null);
        }
        field_c = null;
    }

    final int a(int param0, int param1, int param2, byte[] param3, byte[] param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 != 0) {
          var7 = 0;
          param0 = param0 + param2;
          var9 = 77 / ((param1 - -1) / 54);
          var8 = param5;
          L0: while (true) {
            L1: {
              var10 = param3[var8];
              if ((var10 ^ -1) > -1) {
                var7 = ((eh) this).field_d[var7];
                break L1;
              } else {
                var7++;
                break L1;
              }
            }
            L2: {
              L3: {
                var11 = ((eh) this).field_d[var7];
                if (((eh) this).field_d[var7] < 0) {
                  param2++;
                  param4[param2] = (byte)(var11 ^ -1);
                  if (param0 > param2) {
                    var7 = 0;
                    break L3;
                  } else {
                    break L2;
                  }
                } else {
                  break L3;
                }
              }
              L4: {
                if ((64 & var10) == 0) {
                  var7++;
                  break L4;
                } else {
                  var7 = ((eh) this).field_d[var7];
                  break L4;
                }
              }
              L5: {
                var11 = ((eh) this).field_d[var7];
                if (((eh) this).field_d[var7] >= 0) {
                  break L5;
                } else {
                  param2++;
                  param4[param2] = (byte)(var11 ^ -1);
                  if (param0 > param2) {
                    var7 = 0;
                    break L5;
                  } else {
                    break L2;
                  }
                }
              }
              L6: {
                if (0 != (32 & var10)) {
                  var7 = ((eh) this).field_d[var7];
                  break L6;
                } else {
                  var7++;
                  break L6;
                }
              }
              L7: {
                var11 = ((eh) this).field_d[var7];
                if (0 <= ((eh) this).field_d[var7]) {
                  break L7;
                } else {
                  param2++;
                  param4[param2] = (byte)(var11 ^ -1);
                  if (param2 < param0) {
                    var7 = 0;
                    break L7;
                  } else {
                    return 1 + (var8 - param5);
                  }
                }
              }
              L8: {
                if ((16 & var10) != 0) {
                  var7 = ((eh) this).field_d[var7];
                  break L8;
                } else {
                  var7++;
                  break L8;
                }
              }
              L9: {
                var11 = ((eh) this).field_d[var7];
                if (((eh) this).field_d[var7] < 0) {
                  param2++;
                  param4[param2] = (byte)(var11 ^ -1);
                  if (param2 >= param0) {
                    break L2;
                  } else {
                    var7 = 0;
                    break L9;
                  }
                } else {
                  break L9;
                }
              }
              L10: {
                if ((var10 & 8) != 0) {
                  var7 = ((eh) this).field_d[var7];
                  break L10;
                } else {
                  var7++;
                  break L10;
                }
              }
              L11: {
                var11 = ((eh) this).field_d[var7];
                if (((eh) this).field_d[var7] >= 0) {
                  break L11;
                } else {
                  param2++;
                  param4[param2] = (byte)(var11 ^ -1);
                  if (param0 <= param2) {
                    break L2;
                  } else {
                    var7 = 0;
                    break L11;
                  }
                }
              }
              L12: {
                if (0 == (4 & var10)) {
                  var7++;
                  break L12;
                } else {
                  var7 = ((eh) this).field_d[var7];
                  break L12;
                }
              }
              L13: {
                var11 = ((eh) this).field_d[var7];
                if (((eh) this).field_d[var7] < 0) {
                  param2++;
                  param4[param2] = (byte)(var11 ^ -1);
                  if (param0 <= param2) {
                    break L2;
                  } else {
                    var7 = 0;
                    break L13;
                  }
                } else {
                  break L13;
                }
              }
              L14: {
                if ((var10 & 2) == 0) {
                  var7++;
                  break L14;
                } else {
                  var7 = ((eh) this).field_d[var7];
                  break L14;
                }
              }
              L15: {
                var11 = ((eh) this).field_d[var7];
                if (((eh) this).field_d[var7] >= 0) {
                  break L15;
                } else {
                  param2++;
                  param4[param2] = (byte)(var11 ^ -1);
                  if (param2 >= param0) {
                    break L2;
                  } else {
                    var7 = 0;
                    break L15;
                  }
                }
              }
              L16: {
                if (0 != (1 & var10)) {
                  var7 = ((eh) this).field_d[var7];
                  break L16;
                } else {
                  var7++;
                  break L16;
                }
              }
              L17: {
                var11 = ((eh) this).field_d[var7];
                if (((eh) this).field_d[var7] >= 0) {
                  break L17;
                } else {
                  break L17;
                }
              }
              var8++;
              continue L0;
            }
            return 1 + (var8 - param5);
          }
        } else {
          return 0;
        }
    }

    final int a(int param0, byte param1, int param2, byte[] param3, int param4, byte[] param5) {
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
          var15 = ZombieDawnMulti.field_E ? 1 : 0;
          var7 = 0;
          param0 = param0 + param2;
          var8 = param4 << 1814084963;
          if (param1 == -62) {
            break L0;
          } else {
            ((eh) this).field_a = null;
            break L0;
          }
        }
        L1: while (true) {
          if (param2 >= param0) {
            return (7 + var8 >> -616822749) - param4;
          } else {
            var9 = 255 & param5[param2];
            var10 = ((eh) this).field_e[var9];
            var11 = ((eh) this).field_a[var9];
            if (var11 != 0) {
              var12 = var8 >> -1904571293;
              var13 = 7 & var8;
              var7 = var7 & -var13 >> -268071617;
              var14 = (-1 + (var13 - -var11) >> -1655675549) + var12;
              var8 = var8 + var11;
              var13 += 24;
              var7 = cr.b(var7, var10 >>> var13);
              param3[var12] = (byte)cr.b(var7, var10 >>> var13);
              if (var14 > var12) {
                var12++;
                var13 -= 8;
                var7 = var10 >>> var13;
                param3[var12] = (byte)(var10 >>> var13);
                if (var12 < var14) {
                  var12++;
                  var13 -= 8;
                  var7 = var10 >>> var13;
                  param3[var12] = (byte)(var10 >>> var13);
                  if (var12 < var14) {
                    var13 -= 8;
                    var12++;
                    var7 = var10 >>> var13;
                    param3[var12] = (byte)(var10 >>> var13);
                    if (var14 > var12) {
                      var13 -= 8;
                      var12++;
                      var7 = var10 << -var13;
                      param3[var12] = (byte)(var10 << -var13);
                      param2++;
                      continue L1;
                    } else {
                      param2++;
                      continue L1;
                    }
                  } else {
                    param2++;
                    continue L1;
                  }
                } else {
                  param2++;
                  continue L1;
                }
              } else {
                param2++;
                continue L1;
              }
            } else {
              throw new RuntimeException("" + var9);
            }
          }
        }
    }

    eh(byte[] param0) {
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
        ((eh) this).field_e = new int[var2];
        ((eh) this).field_a = param0;
        var19 = new int[33];
        var18 = var19;
        var17 = var18;
        var16 = var17;
        var3 = var16;
        ((eh) this).field_d = new int[8];
        var4 = 0;
        var5 = 0;
        L0: while (true) {
          if (var5 >= var2) {
          } else {
            var6 = param0[var5];
            if (0 != var6) {
              L1: {
                var7 = 1 << 32 + -var6;
                var8 = var19[var6];
                ((eh) this).field_e[var5] = var8;
                if (-1 == (var7 & var8 ^ -1)) {
                  var10 = var6 + -1;
                  L2: while (true) {
                    L3: {
                      if (var10 < 1) {
                        break L3;
                      } else {
                        var11 = var19[var10];
                        if (var11 != var8) {
                          break L3;
                        } else {
                          var12 = 1 << 32 + -var10;
                          if (-1 == (var11 & var12 ^ -1)) {
                            var3[var10] = cr.b(var12, var11);
                            var10--;
                            continue L2;
                          } else {
                            var3[var10] = var3[-1 + var10];
                            break L3;
                          }
                        }
                      }
                    }
                    var9 = var8 | var7;
                    break L1;
                  }
                } else {
                  var9 = var3[-1 + var6];
                  break L1;
                }
              }
              var19[var6] = var9;
              var10 = var6 + 1;
              L4: while (true) {
                if (var10 > 32) {
                  var10 = 0;
                  var11 = 0;
                  L5: while (true) {
                    if (var11 >= var6) {
                      L6: {
                        if (var4 > var10) {
                          break L6;
                        } else {
                          var4 = 1 + var10;
                          break L6;
                        }
                      }
                      ((eh) this).field_d[var10] = var5 ^ -1;
                      var5++;
                      continue L0;
                    } else {
                      L7: {
                        var12 = -2147483648 >>> var11;
                        if (0 == (var8 & var12)) {
                          var10++;
                          break L7;
                        } else {
                          L8: {
                            if (((eh) this).field_d[var10] != 0) {
                              break L8;
                            } else {
                              ((eh) this).field_d[var10] = var4;
                              break L8;
                            }
                          }
                          var10 = ((eh) this).field_d[var10];
                          break L7;
                        }
                      }
                      L9: {
                        if (var10 < ((eh) this).field_d.length) {
                          break L9;
                        } else {
                          var13 = new int[2 * ((eh) this).field_d.length];
                          var14 = 0;
                          L10: while (true) {
                            if (var14 >= ((eh) this).field_d.length) {
                              ((eh) this).field_d = var13;
                              break L9;
                            } else {
                              var13[var14] = ((eh) this).field_d[var14];
                              var14++;
                              continue L10;
                            }
                          }
                        }
                      }
                      var12 = var12 >>> 1;
                      var11++;
                      continue L5;
                    }
                  }
                } else {
                  if (var19[var10] == var8) {
                    var19[var10] = var9;
                    var10++;
                    continue L4;
                  } else {
                    var10++;
                    continue L4;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_f = "Scamming";
        field_c = "Enter multiplayer lobby";
        field_h = "From only <%0>/month";
        field_g = "Your friend list is full. Max of 100 for free users, and 200 for members.";
    }
}
