/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk {
    private byte[] field_i;
    static String[] field_h;
    private int[] field_j;
    static vl field_f;
    static int field_g;
    static double field_b;
    static String field_c;
    private int[] field_a;
    static jp field_e;
    static String field_d;

    final static boolean a(mf param0, mf param1, mf param2, int param3) {
        if (!param1.a((byte) -127)) {
          return false;
        } else {
          if (param1.a("commonui", -28138)) {
            if (param3 <= -63) {
              L0: {
                if (!param0.a((byte) -127)) {
                  break L0;
                } else {
                  if (param0.a("commonui", -28138)) {
                    L1: {
                      if (!param2.a((byte) -127)) {
                        break L1;
                      } else {
                        if (param2.a("button.gif", -28138)) {
                          return true;
                        } else {
                          break L1;
                        }
                      }
                    }
                    return false;
                  } else {
                    break L0;
                  }
                }
              }
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static void a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = BrickABrac.field_J ? 1 : 0;
        var2 = 0;
        var3 = ld.field_t;
        if (param1 == 77) {
          L0: {
            if ((var3 ^ -1) <= -6) {
              if (105 > var3) {
                var2 = (-40960 + var3 * 16384) / 220;
                break L0;
              } else {
                if (120 > var3) {
                  var3 = 120 - var3;
                  var2 = -(var3 * (var3 * 8192) / 3300) + 8192;
                  break L0;
                } else {
                  break L0;
                }
              }
            } else {
              var2 = var3 * (var3 * 8192) / 1100;
              break L0;
            }
          }
          L1: {
            var4 = 1;
            var5 = 0;
            if (-4 == (param0 ^ -1)) {
              var4 = -1;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if ((param0 ^ -1) != -2) {
              break L2;
            } else {
              var5 = 1;
              break L2;
            }
          }
          L3: {
            if (4 == param0) {
              var5 = 1;
              var4 = 1;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (param0 != 5) {
              break L4;
            } else {
              var4 = -1;
              var5 = 1;
              break L4;
            }
          }
          L5: {
            if (param0 == 6) {
              var4 = 1;
              var5 = -1;
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            L7: {
              if (-8 == (param0 ^ -1)) {
                break L7;
              } else {
                if ((param0 ^ -1) == -9) {
                  break L7;
                } else {
                  break L6;
                }
              }
            }
            var4 = -1;
            var5 = -1;
            break L6;
          }
          L8: {
            if (param0 != 11) {
              break L8;
            } else {
              var4 = -1;
              break L8;
            }
          }
          L9: {
            if (param0 != 12) {
              break L9;
            } else {
              var5 = -1;
              var4 = -1;
              break L9;
            }
          }
          L10: {
            if (13 != param0) {
              break L10;
            } else {
              var5 = -1;
              var4 = 1;
              break L10;
            }
          }
          L11: {
            if (param0 == -15) {
              var5 = 1;
              var4 = -1;
              break L11;
            } else {
              break L11;
            }
          }
          L12: {
            if (-16 != param0) {
              break L12;
            } else {
              var4 = 1;
              var5 = 1;
              break L12;
            }
          }
          ld.field_w = e.a(var4 * var2, 0, var2 * var5);
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, og param1) {
        if (!(param1 != null)) {
            return;
        }
        hd.field_a = param1;
        if (param0 != 105) {
            Object var3 = null;
            fk.a((byte) 84, (java.applet.Applet) null, (String) null, false);
        }
        wd.field_w.field_bb.c((byte) -72);
        wd.field_w.a((mh) (Object) hd.field_a, 0);
        nq.field_p = true;
    }

    final int a(byte param0, int param1, int param2, byte[] param3, int param4, byte[] param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = BrickABrac.field_J ? 1 : 0;
        var7 = 0;
        param1 = param1 + param2;
        var8 = param4 << 214554147;
        L0: while (true) {
          if (param2 >= param1) {
            L1: {
              if (param0 < -91) {
                break L1;
              } else {
                fk.a(-104, (byte) 88);
                break L1;
              }
            }
            return (7 + var8 >> -466134301) + -param4;
          } else {
            var9 = param5[param2] & 255;
            var10 = ((fk) this).field_a[var9];
            var11 = ((fk) this).field_i[var9];
            if (var11 == 0) {
              throw new RuntimeException("" + var9);
            } else {
              var12 = var8 >> -1172185181;
              var13 = var8 & 7;
              var7 = var7 & -var13 >> -1381413057;
              var14 = var12 - -(var13 + (var11 - 1) >> -163513405);
              var8 = var8 + var11;
              var13 += 24;
              var7 = ud.d(var7, var10 >>> var13);
              param3[var12] = (byte)ud.d(var7, var10 >>> var13);
              if (var14 > var12) {
                var12++;
                var13 -= 8;
                var7 = var10 >>> var13;
                param3[var12] = (byte)(var10 >>> var13);
                if (var14 > var12) {
                  var13 -= 8;
                  var12++;
                  var7 = var10 >>> var13;
                  param3[var12] = (byte)(var10 >>> var13);
                  if (var12 < var14) {
                    var12++;
                    var13 -= 8;
                    var7 = var10 >>> var13;
                    param3[var12] = (byte)(var10 >>> var13);
                    if (var12 < var14) {
                      var12++;
                      var13 -= 8;
                      var7 = var10 << -var13;
                      param3[var12] = (byte)(var10 << -var13);
                      param2++;
                      continue L0;
                    } else {
                      param2++;
                      continue L0;
                    }
                  } else {
                    param2++;
                    continue L0;
                  }
                } else {
                  param2++;
                  continue L0;
                }
              } else {
                param2++;
                continue L0;
              }
            }
          }
        }
    }

    final static void a(int param0) {
        int var2 = 0;
        int var3 = BrickABrac.field_J ? 1 : 0;
        if (param0 != 14114) {
            Object var4 = null;
            boolean discarded$0 = fk.a((mf) null, (mf) null, (mf) null, -121);
        }
        pi var1 = k.field_h;
        while (ik.a(104)) {
            var1.e(-13413, 8);
            var1.field_l = var1.field_l + 1;
            var2 = var1.field_l + 1;
            ah.a(var1, (byte) 9);
            k.field_h.d((byte) 118, -var2 + var1.field_l);
        }
    }

    public static void a(byte param0) {
        field_h = null;
        field_c = null;
        field_e = null;
        field_f = null;
        if (param0 != -94) {
            fk.a(119, (byte) 34);
        }
        field_d = null;
    }

    final int a(int param0, int param1, int param2, boolean param3, byte[] param4, byte[] param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = BrickABrac.field_J ? 1 : 0;
        if (0 == param0) {
          return 0;
        } else {
          L0: {
            if (param3) {
              break L0;
            } else {
              fk.a((byte) 104);
              break L0;
            }
          }
          param0 = param0 + param1;
          var7 = 0;
          var8 = param2;
          L1: while (true) {
            L2: {
              var9 = param5[var8];
              if (var9 >= 0) {
                var7++;
                break L2;
              } else {
                var7 = ((fk) this).field_j[var7];
                break L2;
              }
            }
            L3: {
              L4: {
                var10 = ((fk) this).field_j[var7];
                if (0 <= ((fk) this).field_j[var7]) {
                  break L4;
                } else {
                  param1++;
                  param4[param1] = (byte)(var10 ^ -1);
                  if (param1 < param0) {
                    var7 = 0;
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              L5: {
                if (0 != (64 & var9)) {
                  var7 = ((fk) this).field_j[var7];
                  break L5;
                } else {
                  var7++;
                  break L5;
                }
              }
              L6: {
                var10 = ((fk) this).field_j[var7];
                if (((fk) this).field_j[var7] < 0) {
                  param1++;
                  param4[param1] = (byte)var10;
                  if (param1 >= param0) {
                    break L3;
                  } else {
                    var7 = 0;
                    break L6;
                  }
                } else {
                  break L6;
                }
              }
              L7: {
                if (-1 == (32 & var9)) {
                  var7++;
                  break L7;
                } else {
                  var7 = ((fk) this).field_j[var7];
                  break L7;
                }
              }
              L8: {
                var10 = ((fk) this).field_j[var7];
                if (0 > ((fk) this).field_j[var7]) {
                  param1++;
                  param4[param1] = (byte)(var10 ^ -1);
                  if (param0 <= param1) {
                    break L3;
                  } else {
                    var7 = 0;
                    break L8;
                  }
                } else {
                  break L8;
                }
              }
              L9: {
                if ((16 & var9) == 0) {
                  var7++;
                  break L9;
                } else {
                  var7 = ((fk) this).field_j[var7];
                  break L9;
                }
              }
              L10: {
                var10 = ((fk) this).field_j[var7];
                if (((fk) this).field_j[var7] < 0) {
                  param1++;
                  param4[param1] = (byte)(var10 ^ -1);
                  if (param0 <= param1) {
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
                if (0 == (var9 & 8)) {
                  var7++;
                  break L11;
                } else {
                  var7 = ((fk) this).field_j[var7];
                  break L11;
                }
              }
              L12: {
                var10 = ((fk) this).field_j[var7];
                if (-1 < (((fk) this).field_j[var7] ^ -1)) {
                  param1++;
                  param4[param1] = (byte)(var10 ^ -1);
                  if (param1 < param0) {
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
                if ((var9 & 4) != -1) {
                  var7 = ((fk) this).field_j[var7];
                  break L13;
                } else {
                  var7++;
                  break L13;
                }
              }
              L14: {
                var10 = ((fk) this).field_j[var7];
                if (-1 > ((fk) this).field_j[var7]) {
                  param1++;
                  param4[param1] = (byte)(var10 ^ -1);
                  if (param1 < param0) {
                    var7 = 0;
                    break L14;
                  } else {
                    return -param2 + (1 + var8);
                  }
                } else {
                  break L14;
                }
              }
              L15: {
                if ((2 & var9) == 0) {
                  var7++;
                  break L15;
                } else {
                  var7 = ((fk) this).field_j[var7];
                  break L15;
                }
              }
              L16: {
                var10 = ((fk) this).field_j[var7];
                if (-1 < (((fk) this).field_j[var7] ^ -1)) {
                  param1++;
                  param4[param1] = (byte)(var10 ^ -1);
                  if (param1 >= param0) {
                    break L3;
                  } else {
                    var7 = 0;
                    break L16;
                  }
                } else {
                  break L16;
                }
              }
              L17: {
                if (0 == (var9 & 1)) {
                  var7++;
                  break L17;
                } else {
                  var7 = ((fk) this).field_j[var7];
                  break L17;
                }
              }
              var10 = ((fk) this).field_j[var7];
              if (((fk) this).field_j[var7] < 0) {
                param1++;
                param4[param1] = (byte)(var10 ^ -1);
                if (param1 < param0) {
                  var7 = 0;
                  var8++;
                  continue L1;
                } else {
                  break L3;
                }
              } else {
                var8++;
                continue L1;
              }
            }
            return -param2 + (1 + var8);
          }
        }
    }

    final static void a(byte param0, java.applet.Applet param1, String param2, boolean param3) {
        try {
            int var4 = 60 / ((1 - param0) / 62);
            if (tg.field_b.startsWith("win")) {
                if (!(!ie.a(param2, false))) {
                    return;
                }
            }
            try {
                param1.getAppletContext().showDocument(new java.net.URL(param2), "_blank");
            } catch (java.net.MalformedURLException malformedURLException) {
                rk.a("MGR1: " + param2, (Throwable) null, 77);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    fk(byte[] param0) {
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
        ((fk) this).field_i = param0;
        ((fk) this).field_a = new int[var2];
        var19 = new int[33];
        var18 = var19;
        var17 = var18;
        var16 = var17;
        var3 = var16;
        ((fk) this).field_j = new int[8];
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
                ((fk) this).field_a[var5] = var8;
                if ((var8 & var7) == 0) {
                  var9 = var7 | var8;
                  var10 = var6 + -1;
                  L2: while (true) {
                    if (var10 < 1) {
                      break L1;
                    } else {
                      var11 = var19[var10];
                      if (var8 != var11) {
                        break L1;
                      } else {
                        var12 = 1 << 32 - var10;
                        if (-1 != (var12 & var11 ^ -1)) {
                          var3[var10] = var3[var10 + -1];
                          break L1;
                        } else {
                          var3[var10] = ud.d(var12, var11);
                          var10--;
                          continue L2;
                        }
                      }
                    }
                  }
                } else {
                  var9 = var3[var6 + -1];
                  break L1;
                }
              }
              var19[var6] = var9;
              var10 = var6 - -1;
              L3: while (true) {
                if (var10 > 32) {
                  var10 = 0;
                  var11 = 0;
                  L4: while (true) {
                    if (var6 <= var11) {
                      ((fk) this).field_j[var10] = var5 ^ -1;
                      if (var10 >= var4) {
                        var4 = 1 + var10;
                        var5++;
                        continue L0;
                      } else {
                        var5++;
                        continue L0;
                      }
                    } else {
                      L5: {
                        var12 = -2147483648 >>> var11;
                        if ((var8 & var12) == -1) {
                          var10++;
                          break L5;
                        } else {
                          L6: {
                            if (-1 != ((fk) this).field_j[var10]) {
                              break L6;
                            } else {
                              ((fk) this).field_j[var10] = var4;
                              break L6;
                            }
                          }
                          var10 = ((fk) this).field_j[var10];
                          break L5;
                        }
                      }
                      L7: {
                        if (((fk) this).field_j.length > var10) {
                          break L7;
                        } else {
                          var13 = new int[((fk) this).field_j.length * 2];
                          var14 = 0;
                          L8: while (true) {
                            if (((fk) this).field_j.length <= var14) {
                              ((fk) this).field_j = var13;
                              break L7;
                            } else {
                              var13[var14] = ((fk) this).field_j[var14];
                              var14++;
                              continue L8;
                            }
                          }
                        }
                      }
                      var12 = var12 >>> 1;
                      var11++;
                      continue L4;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new vl();
        field_c = "Passwords can only contain letters and numbers";
        field_b = 0.0;
        field_d = "Age:";
    }
}
