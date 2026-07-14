/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh {
    static int field_e;
    private int[] field_f;
    static int[] field_g;
    private byte[] field_a;
    static String field_d;
    private int[] field_c;
    static int field_b;

    final int a(int param0, int param1, byte[] param2, int param3, byte[] param4, boolean param5) {
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
          var15 = Pixelate.field_H ? 1 : 0;
          var7 = 0;
          var8 = param0 << 1314838659;
          if (!param5) {
            break L0;
          } else {
            field_d = null;
            break L0;
          }
        }
        param1 = param1 + param3;
        L1: while (true) {
          if (param1 <= param3) {
            return (7 + var8 >> -1153508893) + -param0;
          } else {
            var9 = 255 & param4[param3];
            var10 = ((oh) this).field_f[var9];
            var11 = ((oh) this).field_a[var9];
            if (var11 != 0) {
              L2: {
                var12 = var8 >> 1196724291;
                var13 = 7 & var8;
                var7 = var7 & -var13 >> 1193059231;
                var14 = (var11 + var13 + -1 >> -517084765) + var12;
                var13 += 24;
                var7 = bq.a(var7, var10 >>> var13);
                param2[var12] = (byte)bq.a(var7, var10 >>> var13);
                if (var14 <= var12) {
                  break L2;
                } else {
                  var13 -= 8;
                  var12++;
                  var7 = var10 >>> var13;
                  param2[var12] = (byte)(var10 >>> var13);
                  if (var12 < var14) {
                    var13 -= 8;
                    var12++;
                    var7 = var10 >>> var13;
                    param2[var12] = (byte)(var10 >>> var13);
                    if (var12 >= var14) {
                      break L2;
                    } else {
                      var13 -= 8;
                      var12++;
                      var7 = var10 >>> var13;
                      param2[var12] = (byte)(var10 >>> var13);
                      if (var14 > var12) {
                        var12++;
                        var13 -= 8;
                        var7 = var10 << -var13;
                        param2[var12] = (byte)(var10 << -var13);
                        break L2;
                      } else {
                        var8 = var8 + var11;
                        param3++;
                        continue L1;
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
            } else {
              throw new RuntimeException("" + var9);
            }
          }
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_g = null;
        field_d = null;
    }

    final static void a(boolean param0, int param1, int param2) {
        wi var4 = null;
        String var5_ref = null;
        int var5 = 0;
        int var6 = 0;
        im var3 = pc.a(param2, param0, (byte) 113);
        if (var3 != null) {
            eg.field_n.b(false, (byte) -98);
            var4 = eg.field_n;
            var5_ref = op.field_q;
            var4.field_b.a(var5_ref, (byte) -68, 5);
            var4 = eg.field_n;
            var5 = uo.field_a;
            var6 = ji.field_c;
            var4.field_b.b(0, var5, 115, var6, 0);
        }
        vf.a(param0, param1, param2);
    }

    oh(byte[] param0) {
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
        ((oh) this).field_f = new int[var2];
        ((oh) this).field_a = param0;
        ((oh) this).field_c = new int[8];
        var19 = new int[33];
        var18 = var19;
        var17 = var18;
        var16 = var17;
        var3 = var16;
        var4 = 0;
        var5 = 0;
        L0: while (true) {
          if (var5 >= var2) {
          } else {
            var6 = param0[var5];
            if (var6 != 0) {
              L1: {
                var7 = 1 << -var6 + 32;
                var8 = var19[var6];
                ((oh) this).field_f[var5] = var8;
                if ((var8 & var7) == 0) {
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
                          if (-1 != (var12 & var11 ^ -1)) {
                            var3[var10] = var3[var10 - 1];
                            break L3;
                          } else {
                            var3[var10] = bq.a(var12, var11);
                            var10--;
                            continue L2;
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
              var10 = 1 + var6;
              L4: while (true) {
                if (32 < var10) {
                  var10 = 0;
                  var11 = 0;
                  L5: while (true) {
                    if (var6 <= var11) {
                      ((oh) this).field_c[var10] = var5 ^ -1;
                      if (var10 >= var4) {
                        var4 = var10 + 1;
                        var5++;
                        continue L0;
                      } else {
                        var5++;
                        continue L0;
                      }
                    } else {
                      L6: {
                        var12 = -2147483648 >>> var11;
                        if (0 != (var8 & var12)) {
                          L7: {
                            if (((oh) this).field_c[var10] != 0) {
                              break L7;
                            } else {
                              ((oh) this).field_c[var10] = var4;
                              break L7;
                            }
                          }
                          var10 = ((oh) this).field_c[var10];
                          break L6;
                        } else {
                          var10++;
                          break L6;
                        }
                      }
                      L8: {
                        if (var10 < ((oh) this).field_c.length) {
                          break L8;
                        } else {
                          var13 = new int[((oh) this).field_c.length * 2];
                          var14 = 0;
                          L9: while (true) {
                            if (((oh) this).field_c.length <= var14) {
                              ((oh) this).field_c = var13;
                              break L8;
                            } else {
                              var13[var14] = ((oh) this).field_c[var14];
                              var14++;
                              continue L9;
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
                  if (var8 == var19[var10]) {
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

    final static void a(int param0, int param1, boolean param2, int param3, byte param4, java.awt.Component param5, cb param6, vi param7) {
        if (param4 > -91) {
            boolean discarded$0 = oh.a('ﾢ', 24);
        }
        mm.a(param1, param2, 10);
        to.field_t = mm.a(param6, param5, 0, param3);
        ib.field_h = mm.a(param6, param5, 1, param0);
        wi.field_d = new vj();
        ba.field_f = param0;
        ib.field_h.b((sj) (Object) wi.field_d);
        ri.field_a = param7;
        ri.field_a.a(wn.field_u, (byte) 2);
        to.field_t.b((sj) (Object) ri.field_a);
    }

    final static boolean a(char param0, int param1) {
        if (Character.isISOControl(param0)) {
            return false;
        }
        if (!(!dd.a(param0, (byte) 126))) {
            return true;
        }
        int var2 = -37 % ((-11 - param1) / 41);
        if (param0 != 45) {
            if (param0 != 160) {
                if (32 != param0) {
                    if (param0 != 95) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    final int a(int param0, int param1, byte[] param2, int param3, int param4, byte[] param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Pixelate.field_H ? 1 : 0;
        if (param0 == (param1 ^ -1)) {
          return 0;
        } else {
          param1 = param1 + param3;
          var7 = 0;
          var8 = param4;
          L0: while (true) {
            L1: {
              var9 = param2[var8];
              if (0 > var9) {
                var7 = ((oh) this).field_c[var7];
                break L1;
              } else {
                var7++;
                break L1;
              }
            }
            L2: {
              L3: {
                var10 = ((oh) this).field_c[var7];
                if (((oh) this).field_c[var7] >= 0) {
                  break L3;
                } else {
                  param3++;
                  param5[param3] = (byte)(var10 ^ -1);
                  if (param1 <= param3) {
                    break L2;
                  } else {
                    var7 = 0;
                    break L3;
                  }
                }
              }
              L4: {
                if ((var9 & 64) != 0) {
                  var7 = ((oh) this).field_c[var7];
                  break L4;
                } else {
                  var7++;
                  break L4;
                }
              }
              L5: {
                var10 = ((oh) this).field_c[var7];
                if (((oh) this).field_c[var7] >= 0) {
                  break L5;
                } else {
                  param3++;
                  param5[param3] = (byte)(var10 ^ -1);
                  if (param3 < param1) {
                    var7 = 0;
                    break L5;
                  } else {
                    break L2;
                  }
                }
              }
              L6: {
                if ((32 & var9) == 0) {
                  var7++;
                  break L6;
                } else {
                  var7 = ((oh) this).field_c[var7];
                  break L6;
                }
              }
              L7: {
                var10 = ((oh) this).field_c[var7];
                if (((oh) this).field_c[var7] >= 0) {
                  break L7;
                } else {
                  param3++;
                  param5[param3] = (byte)var10;
                  if (param3 >= param1) {
                    break L2;
                  } else {
                    var7 = 0;
                    break L7;
                  }
                }
              }
              L8: {
                if (-1 != (16 & var9)) {
                  var7 = ((oh) this).field_c[var7];
                  break L8;
                } else {
                  var7++;
                  break L8;
                }
              }
              L9: {
                var10 = ((oh) this).field_c[var7];
                if (((oh) this).field_c[var7] >= 0) {
                  break L9;
                } else {
                  param3++;
                  param5[param3] = (byte)(var10 ^ -1);
                  if (param1 > param3) {
                    var7 = 0;
                    break L9;
                  } else {
                    break L2;
                  }
                }
              }
              L10: {
                if ((8 & var9) != 0) {
                  var7 = ((oh) this).field_c[var7];
                  break L10;
                } else {
                  var7++;
                  break L10;
                }
              }
              L11: {
                var10 = ((oh) this).field_c[var7];
                if (0 > ((oh) this).field_c[var7]) {
                  param3++;
                  param5[param3] = (byte)(var10 ^ -1);
                  if (param1 <= param3) {
                    break L2;
                  } else {
                    var7 = 0;
                    break L11;
                  }
                } else {
                  break L11;
                }
              }
              L12: {
                if (0 != (var9 & 4)) {
                  var7 = ((oh) this).field_c[var7];
                  break L12;
                } else {
                  var7++;
                  break L12;
                }
              }
              L13: {
                var10 = ((oh) this).field_c[var7];
                if (((oh) this).field_c[var7] >= 0) {
                  break L13;
                } else {
                  param3++;
                  param5[param3] = (byte)(var10 ^ -1);
                  if (param1 > param3) {
                    var7 = 0;
                    break L13;
                  } else {
                    break L2;
                  }
                }
              }
              L14: {
                if (0 == (var9 & 2)) {
                  var7++;
                  break L14;
                } else {
                  var7 = ((oh) this).field_c[var7];
                  break L14;
                }
              }
              L15: {
                var10 = ((oh) this).field_c[var7];
                if (-1 >= (((oh) this).field_c[var7] ^ -1)) {
                  break L15;
                } else {
                  param3++;
                  param5[param3] = (byte)(var10 ^ -1);
                  if (param1 > param3) {
                    var7 = 0;
                    break L15;
                  } else {
                    return -param4 + (1 + var8);
                  }
                }
              }
              L16: {
                if (-1 != (var9 & 1 ^ -1)) {
                  var7 = ((oh) this).field_c[var7];
                  break L16;
                } else {
                  var7++;
                  break L16;
                }
              }
              var10 = ((oh) this).field_c[var7];
              if (0 > ((oh) this).field_c[var7]) {
                param3++;
                param5[param3] = (byte)(var10 ^ -1);
                if (param1 > param3) {
                  var7 = 0;
                  var8++;
                  continue L0;
                } else {
                  break L2;
                }
              } else {
                var8++;
                continue L0;
              }
            }
            return -param4 + (1 + var8);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find suitable opponents in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_e = 500;
    }
}
