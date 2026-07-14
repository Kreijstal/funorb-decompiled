/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class oe extends dd {
    static int[] field_P;
    private int field_R;
    static String field_O;
    private int field_M;
    private int field_U;
    private int field_N;
    private int field_L;
    static gk field_T;
    private int field_Q;
    static int field_V;
    static boolean field_S;

    public static void j(int param0) {
        field_T = null;
        if (param0 != 89) {
            field_S = false;
        }
        field_P = null;
        field_O = null;
    }

    boolean h(int param0) {
        ((oe) this).b(true);
        if (param0 != 229) {
            boolean discarded$0 = ((oe) this).f(45);
        }
        return super.h(229);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!(param3 > 0)) {
            ((oe) this).c(param0, param2 + 5373, param1);
            return;
        }
        ((oe) this).field_R = ((oe) this).field_r;
        ((oe) this).field_Q = 0;
        if (param2 != -5269) {
            ((oe) this).field_R = 59;
        }
        ((oe) this).field_M = param0;
        ((oe) this).field_L = ((oe) this).field_h;
        ((oe) this).field_N = param1;
        ((oe) this).field_U = param3;
    }

    final static String a(byte param0, CharSequence param1) {
        if (param0 != 44) {
            return null;
        }
        return ei.a(false, false, param1);
    }

    void b(boolean param0) {
        if ((((oe) this).field_U ^ -1) >= -1) {
            return;
        }
        if (!param0) {
            return;
        }
        ((oe) this).c(((oe) this).field_M, 105, ((oe) this).field_N);
        ((oe) this).field_U = 0;
        ((oe) this).k(-107);
    }

    final static void l(int param0) {
        int var4 = Geoblox.field_C;
        int[] var5 = ch.field_d;
        int[] var1 = var5;
        int var2 = param0;
        int var3 = var5.length;
        while (var2 < var3) {
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
        }
    }

    oe(ng param0, int param1, int param2) {
        super(param0, param1, param2);
        ((oe) this).field_U = 0;
        ((oe) this).field_Q = 0;
    }

    void k(int param0) {
        if (param0 > -20) {
            ((oe) this).field_N = 122;
        }
    }

    final static int a(int param0, byte[] param1, int param2, int param3) {
        int var5 = 0;
        if (param2 > -27) {
            Object var6 = null;
            String discarded$0 = oe.a((CharSequence) null, -115);
        }
        int var4 = -1;
        for (var5 = param3; var5 < param0; var5++) {
            var4 = sb.field_b[(var4 ^ param1[var5]) & 255] ^ var4 >>> 1495180680;
        }
        var4 = var4 ^ -1;
        return var4;
    }

    boolean f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var5 = 0;
        int var4 = 0;
        if ((((oe) this).field_U ^ -1) < param0) {
            var2 = ((oe) this).field_N;
            var3 = ((oe) this).field_M;
            ((oe) this).field_Q = ((oe) this).field_Q + 1;
            if (((oe) this).field_Q + 1 < ((oe) this).field_U) {
                var4 = (-((oe) this).field_Q + 2 * ((oe) this).field_U) * ((oe) this).field_Q;
                var5 = ((oe) this).field_U * ((oe) this).field_U;
                var2 = ((oe) this).field_R + var4 * (((oe) this).field_N + -((oe) this).field_R) / var5;
                var3 = var4 * (((oe) this).field_M + -((oe) this).field_L) / var5 + ((oe) this).field_L;
            } else {
                ((oe) this).field_U = 0;
                ((oe) this).k(-31);
            }
            ((oe) this).c(var3, 113, var2);
        }
        return super.f(param0 ^ 0);
    }

    final static void a(int param0, byte param1, int param2) {
        k.field_g = param2;
        if (param1 > -20) {
            return;
        }
        gb.field_e = param0;
    }

    final static String a(CharSequence param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (param0 != null) {
          var2 = 0;
          var3 = param0.length();
          L0: while (true) {
            L1: {
              if (var3 <= var2) {
                break L1;
              } else {
                if (!gg.a((byte) 125, param0.charAt(var2))) {
                  break L1;
                } else {
                  var2++;
                  continue L0;
                }
              }
            }
            L2: while (true) {
              L3: {
                if (var2 >= var3) {
                  break L3;
                } else {
                  if (!gg.a((byte) -47, param0.charAt(var3 - 1))) {
                    break L3;
                  } else {
                    var3--;
                    continue L2;
                  }
                }
              }
              var4 = -var2 + var3;
              if (1 <= var4) {
                if (12 >= var4) {
                  L4: {
                    if (param1 == 12) {
                      break L4;
                    } else {
                      field_O = null;
                      break L4;
                    }
                  }
                  var5 = new StringBuilder(var4);
                  var6 = var2;
                  L5: while (true) {
                    if (var6 >= var3) {
                      if (var5.length() != 0) {
                        return var5.toString();
                      } else {
                        return null;
                      }
                    } else {
                      var7 = param0.charAt(var6);
                      if (fb.a((char) var7, -47)) {
                        var8 = hc.a((char) var7, param1 + -239);
                        if (var8 != 0) {
                          StringBuilder discarded$1 = var5.append(var8);
                          var6++;
                          continue L5;
                        } else {
                          var6++;
                          continue L5;
                        }
                      } else {
                        var6++;
                        continue L5;
                      }
                    }
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          return null;
        }
    }

    final static void a(boolean param0, boolean param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var10 = Geoblox.field_C;
          var3 = 160;
          var4 = 190;
          if (!param1) {
            var4 -= 10;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param0) {
            stackOut_5_0 = ug.field_c;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = vl.field_p;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        var5 = stackIn_6_0;
        var6 = 0;
        if (param2 == 160) {
          L2: {
            var7 = 0;
            var8 = 0;
            if (param0) {
              var9 = 15;
              L3: while (true) {
                if (-1 > var9) {
                  L4: {
                    if ((var8 ^ -1) <= -9) {
                      var3 = var3 + (-160 + var7);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var9 = 0;
                  L5: while (true) {
                    if (pg.field_a.length <= var9) {
                      break L2;
                    } else {
                      L6: {
                        if (-1 != (1 << var9 & var5 ^ -1)) {
                          break L6;
                        } else {
                          if (!param0) {
                            break L6;
                          } else {
                            var9++;
                            continue L5;
                          }
                        }
                      }
                      L7: {
                        if (da.a(0, 88)) {
                          break L7;
                        } else {
                          if (var9 != 16) {
                            break L7;
                          } else {
                            if (qi.d(109)) {
                              break L7;
                            } else {
                              var9++;
                              continue L5;
                            }
                          }
                        }
                      }
                      L8: {
                        if (mc.field_a < var3) {
                          break L8;
                        } else {
                          if (mc.field_a > var3 - -32) {
                            break L8;
                          } else {
                            if (var4 > he.field_d) {
                              break L8;
                            } else {
                              if (he.field_d > var4 - -32) {
                                break L8;
                              } else {
                                if (a.field_e == var9) {
                                  a.field_e = -1;
                                  break L2;
                                } else {
                                  a.field_e = var9;
                                  break L2;
                                }
                              }
                            }
                          }
                        }
                      }
                      var6++;
                      if (7 != var6) {
                        var3 += 40;
                        var9++;
                        continue L5;
                      } else {
                        L9: {
                          var3 = 160;
                          var4 += 40;
                          if (!param1) {
                            var4 += 5;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        if (param0) {
                          if ((var8 ^ -1) > -9) {
                            var3 = var3 + var7;
                            var9++;
                            continue L5;
                          } else {
                            var9++;
                            continue L5;
                          }
                        } else {
                          var9++;
                          continue L5;
                        }
                      }
                    }
                  }
                } else {
                  if ((var5 & 1 << var9) == 0) {
                    var7 += 20;
                    var8++;
                    var9--;
                    continue L3;
                  } else {
                    var9--;
                    continue L3;
                  }
                }
              }
            } else {
              L10: {
                if ((var8 ^ -1) <= -9) {
                  var3 = var3 + (-160 + var7);
                  break L10;
                } else {
                  break L10;
                }
              }
              var9 = 0;
              L11: while (true) {
                if (pg.field_a.length <= var9) {
                  break L2;
                } else {
                  L12: {
                    if (-1 != (1 << var9 & var5 ^ -1)) {
                      break L12;
                    } else {
                      if (!param0) {
                        break L12;
                      } else {
                        var9++;
                        continue L11;
                      }
                    }
                  }
                  L13: {
                    if (da.a(0, 88)) {
                      break L13;
                    } else {
                      if (var9 != 16) {
                        break L13;
                      } else {
                        if (qi.d(109)) {
                          break L13;
                        } else {
                          var9++;
                          continue L11;
                        }
                      }
                    }
                  }
                  L14: {
                    if (mc.field_a < var3) {
                      break L14;
                    } else {
                      if (mc.field_a > var3 - -32) {
                        break L14;
                      } else {
                        if (var4 > he.field_d) {
                          break L14;
                        } else {
                          if (he.field_d > var4 - -32) {
                            break L14;
                          } else {
                            if (a.field_e == var9) {
                              a.field_e = -1;
                              break L2;
                            } else {
                              a.field_e = var9;
                              break L2;
                            }
                          }
                        }
                      }
                    }
                  }
                  var6++;
                  if (7 != var6) {
                    var3 += 40;
                    var9++;
                    continue L11;
                  } else {
                    L15: {
                      var3 = 160;
                      var4 += 40;
                      if (!param1) {
                        var4 += 5;
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    if (param0) {
                      if (var8 > -9) {
                        var3 = var3 + var7;
                        var9++;
                        continue L11;
                      } else {
                        var9++;
                        continue L11;
                      }
                    } else {
                      var9++;
                      continue L11;
                    }
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var16 = Geoblox.field_C;
        vb.d(param0 - -6, param2 + 35, -12 + ((oe) this).field_r, -40 + ((oe) this).field_h, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 0;
        var8 = param2;
        L0: while (true) {
          if (var4 <= var7) {
            var4 = 22;
            var5 = 194;
            var6 = 169;
            var7 = 0;
            var8 = 35 + param2;
            L1: while (true) {
              if (var7 >= var4) {
                L2: {
                  jc.field_a.b(-90 + ((oe) this).field_r + param0, 10 + param2);
                  if (param1 == 20) {
                    break L2;
                  } else {
                    ((oe) this).field_M = -34;
                    break L2;
                  }
                }
                vl.a(id.field_c, -10 + ((oe) this).field_r, 35 + param2, 5 + param0, (byte) 107);
                vl.a(fh.field_e, ((oe) this).field_r, -22 + (((oe) this).field_h + param2), param0, (byte) 107);
                var4 = ((oe) this).field_h + -79;
                var5 = 169;
                var6 = 127;
                var7 = 0;
                var8 = param2 - -57;
                L3: while (true) {
                  if (var7 >= var4) {
                    return;
                  } else {
                    var9 = var7 * (var6 - var5) / var4 + var5;
                    var9 = var9 | (var9 << -367904048 | var9 << -1047298264);
                    vb.c(param0, var8, 6, var9);
                    vb.c(-6 + (((oe) this).field_r + param0), var8, 6, var9);
                    var8++;
                    var7++;
                    continue L3;
                  }
                }
              } else {
                var9 = var5 + (-var5 + var6) * var7 / var4;
                var9 = var9 | (var9 << 712590696 | var9 << 386207504);
                vb.c(param0, var8, 6, var9);
                vb.c(((oe) this).field_r + param0 + -6, var8, 6, var9);
                var7++;
                var8++;
                continue L1;
              }
            }
          } else {
            if (var8 >= vb.field_i) {
              if (vb.field_d > var8) {
                L4: {
                  var9 = (-var5 + var6) * var7 / var4 + var5;
                  var10 = 0;
                  var11 = ((oe) this).field_r;
                  if (var7 > 20) {
                    break L4;
                  } else {
                    L5: while (true) {
                      if (var10 > 20) {
                        break L4;
                      } else {
                        var12 = (-var7 + 20) * (-var7 + 20) - -((-var10 + 20) * (20 - var10));
                        if (var12 >= -463) {
                          if (-421 > var12) {
                            break L4;
                          } else {
                            var13 = (-var12 + 462) * var9 / 42;
                            var13 = var13 | (var13 << -340900600 | var13 << 756381136);
                            vb.field_c[var8 * vb.field_f - -param0 - -var10] = var13;
                            var10++;
                            continue L5;
                          }
                        } else {
                          var10++;
                          continue L5;
                        }
                      }
                    }
                  }
                }
                L6: {
                  if (20 < var7) {
                    break L6;
                  } else {
                    var12 = var11;
                    var11 -= 21;
                    var13 = 0;
                    L7: while (true) {
                      L8: {
                        if (-21 > (var13 ^ -1)) {
                          break L8;
                        } else {
                          var14 = (-var7 + 20) * (-var7 + 20) - -(var13 * var13);
                          if (var14 <= 462) {
                            if (-421 < (var14 ^ -1)) {
                              var12 = var11 + 1;
                              var11++;
                              var13++;
                              continue L7;
                            } else {
                              var15 = var9 * (462 + -var14) / 42;
                              var15 = var15 | (var15 << -321143672 | var15 << -1775523120);
                              vb.field_c[var11 + param0 + vb.field_f * var8] = var15;
                              var11++;
                              var13++;
                              continue L7;
                            }
                          } else {
                            break L8;
                          }
                        }
                      }
                      var11 = var12;
                      break L6;
                    }
                  }
                }
                var9 = var9 | (var9 << -1618164592 | var9 << -946803448);
                vb.c(var10 - -param0, var8, var11 + -var10, var9);
                var8++;
                var7++;
                continue L0;
              } else {
                var8++;
                var7++;
                continue L0;
              }
            } else {
              var8++;
              var7++;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_O = "Connection restored.";
        field_T = new gk();
        field_V = 0;
        field_S = false;
    }
}
