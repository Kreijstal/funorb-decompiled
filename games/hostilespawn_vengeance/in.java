/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class in {
    static int[] field_c;
    static bd field_d;
    static String field_a;
    static int field_b;

    abstract int a(byte param0, long param1);

    final static boolean a(boolean param0, int param1, int param2, CharSequence param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var12 = HostileSpawn.field_I ? 1 : 0;
          if (param1 < 2) {
            break L0;
          } else {
            if (36 >= param1) {
              var4 = 0;
              var5 = 0;
              var6 = 104 / ((16 - param2) / 50);
              var7 = 0;
              var8 = param3.length();
              var9 = 0;
              L1: while (true) {
                if (var9 >= var8) {
                  return var5 != 0;
                } else {
                  L2: {
                    var10 = param3.charAt(var9);
                    if (var9 == 0) {
                      if (var10 == 45) {
                        var4 = 1;
                        var9++;
                        continue L1;
                      } else {
                        if (43 != var10) {
                          break L2;
                        } else {
                          if (!param0) {
                            break L2;
                          } else {
                            var9++;
                            continue L1;
                          }
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      if (48 > var10) {
                        break L4;
                      } else {
                        if (57 < var10) {
                          break L4;
                        } else {
                          var10 -= 48;
                          break L3;
                        }
                      }
                    }
                    L5: {
                      if (var10 < 65) {
                        break L5;
                      } else {
                        if (var10 <= 90) {
                          var10 -= 55;
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var10 < 97) {
                        break L6;
                      } else {
                        if (122 < var10) {
                          break L6;
                        } else {
                          var10 -= 87;
                          break L3;
                        }
                      }
                    }
                    return false;
                  }
                  if (var10 < param1) {
                    L7: {
                      if (var4 != 0) {
                        var10 = -var10;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var11 = param1 * var7 + var10;
                    if (var7 != var11 / param1) {
                      return false;
                    } else {
                      var7 = var11;
                      var5 = 1;
                      var9++;
                      continue L1;
                    }
                  } else {
                    return false;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("" + param1);
    }

    final static void a(int param0, p param1, int param2, int param3) {
        int var4 = param1.field_e / param0;
        if (var4 >= 0) {
            if (id.field_p.length > var4) {
                id.field_p[var4].a(true, 128, (int)param1.field_c, param3, param2);
            }
        }
    }

    final static void a(double param0, p param1, byte param2, int[] param3, int param4, double param5) {
        int var10 = HostileSpawn.field_I ? 1 : 0;
        if (param2 != 29) {
            return;
        }
        oc var11 = new oc(param1.field_j);
        og var9 = new og(param1.field_l);
        param1.field_e = 0;
        param3[param4] = 0;
        do {
            // if_icmpne L178
            param1.field_l.a(2, (byte) 94, param1.field_c);
            param1.a(8573);
            if (2 == param3[param1.field_j.b(-4)]) {
                param1.field_e = 1;
            }
        } while (!param1.a(param0, param5, 29821));
        param1.field_i = 13;
        param1.field_e = 0;
        param1.field_j.a((byte) 46, var11);
        param1.field_l.a(var9, -28860);
        param3[param4] = 3;
        if (-14 != (param1.field_i ^ -1)) {
            param1.field_i = -1;
        }
    }

    abstract void b(boolean param0);

    abstract long a(byte param0);

    final int a(long param0, int param1) {
        if (param1 < 90) {
            field_a = null;
        }
        long var4 = ((in) this).a((byte) -78);
        if (!((var4 ^ -1L) >= -1L)) {
            vj.a(var4, (byte) -49);
        }
        return ((in) this).a((byte) -125, param0);
    }

    public static void a(int param0) {
        field_a = null;
        int var1 = -86 % ((param0 - -24) / 52);
        field_d = null;
        field_c = null;
    }

    final static void a(boolean param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String var8_ref_String = null;
        int var8 = 0;
        String var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_65_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        int stackIn_66_2 = 0;
        int stackIn_66_3 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        int stackIn_67_2 = 0;
        int stackIn_67_3 = 0;
        int stackIn_68_0 = 0;
        int stackIn_68_1 = 0;
        int stackIn_68_2 = 0;
        int stackIn_68_3 = 0;
        int stackIn_68_4 = 0;
        nc stackIn_86_0 = null;
        String stackIn_86_1 = null;
        int stackIn_86_2 = 0;
        int stackIn_86_3 = 0;
        nc stackIn_87_0 = null;
        String stackIn_87_1 = null;
        int stackIn_87_2 = 0;
        int stackIn_87_3 = 0;
        nc stackIn_88_0 = null;
        String stackIn_88_1 = null;
        int stackIn_88_2 = 0;
        int stackIn_88_3 = 0;
        int stackIn_88_4 = 0;
        int stackOut_64_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_65_1 = 0;
        int stackOut_65_2 = 0;
        int stackOut_65_3 = 0;
        int stackOut_67_0 = 0;
        int stackOut_67_1 = 0;
        int stackOut_67_2 = 0;
        int stackOut_67_3 = 0;
        int stackOut_67_4 = 0;
        int stackOut_66_0 = 0;
        int stackOut_66_1 = 0;
        int stackOut_66_2 = 0;
        int stackOut_66_3 = 0;
        int stackOut_66_4 = 0;
        nc stackOut_85_0 = null;
        String stackOut_85_1 = null;
        int stackOut_85_2 = 0;
        int stackOut_85_3 = 0;
        nc stackOut_87_0 = null;
        String stackOut_87_1 = null;
        int stackOut_87_2 = 0;
        int stackOut_87_3 = 0;
        int stackOut_87_4 = 0;
        nc stackOut_86_0 = null;
        String stackOut_86_1 = null;
        int stackOut_86_2 = 0;
        int stackOut_86_3 = 0;
        int stackOut_86_4 = 0;
        var12 = HostileSpawn.field_I ? 1 : 0;
        var4 = new String[8];
        var4[0] = pc.field_b;
        var4[1] = Integer.toString(kh.field_ib[an.field_r[1]]);
        var4[2] = Integer.toString((9 + kh.field_ib[an.field_r[2]]) / 10);
        var4[3] = Integer.toString((kh.field_ib[an.field_r[3]] + 49) / 50);
        var4[4] = Integer.toString((kh.field_ib[an.field_r[4]] + 4) / 5);
        var4[5] = Integer.toString(kh.field_ib[an.field_r[5]]);
        var4[6] = Integer.toString(kh.field_ib[an.field_r[6]]);
        var4[7] = Integer.toString(kh.field_ib[an.field_r[7]]);
        var1 = 0;
        L0: while (true) {
          if ((var1 ^ -1) <= -3) {
            var5 = 150;
            var6 = 5;
            var1 = 0;
            L1: while (true) {
              if (var1 >= kh.field_Q.length) {
                L2: {
                  if (!param0) {
                    break L2;
                  } else {
                    field_b = 104;
                    break L2;
                  }
                }
                var1 = 0;
                L3: while (true) {
                  if (-9 <= var1) {
                    return;
                  } else {
                    if (kh.field_Q[var1]) {
                      L4: {
                        if (-1 != (5 & el.field_m ^ -1)) {
                          break L4;
                        } else {
                          if (j.field_c < -7 + var5) {
                            break L4;
                          } else {
                            if (j.field_c >= ti.field_j.field_z + var5 - -9) {
                              break L4;
                            } else {
                              if (rb.field_m < ti.field_j.field_A + var6) {
                                ri.field_h = var1;
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      }
                      L5: {
                        var7 = 0;
                        if (var1 == ri.field_h) {
                          L6: {
                            if (0 == (el.field_m & 5)) {
                              stackOut_64_0 = 0;
                              stackIn_65_0 = stackOut_64_0;
                              break L6;
                            } else {
                              stackOut_63_0 = 1;
                              stackIn_65_0 = stackOut_63_0;
                              break L6;
                            }
                          }
                          L7: {
                            var7 = stackIn_65_0;
                            stackOut_65_0 = var5 + 2;
                            stackOut_65_1 = var6 + 2;
                            stackOut_65_2 = -7 + ti.field_j.field_z;
                            stackOut_65_3 = ti.field_j.field_A + -6;
                            stackIn_67_0 = stackOut_65_0;
                            stackIn_67_1 = stackOut_65_1;
                            stackIn_67_2 = stackOut_65_2;
                            stackIn_67_3 = stackOut_65_3;
                            stackIn_66_0 = stackOut_65_0;
                            stackIn_66_1 = stackOut_65_1;
                            stackIn_66_2 = stackOut_65_2;
                            stackIn_66_3 = stackOut_65_3;
                            if (var7 != 0) {
                              stackOut_67_0 = stackIn_67_0;
                              stackOut_67_1 = stackIn_67_1;
                              stackOut_67_2 = stackIn_67_2;
                              stackOut_67_3 = stackIn_67_3;
                              stackOut_67_4 = 16776960;
                              stackIn_68_0 = stackOut_67_0;
                              stackIn_68_1 = stackOut_67_1;
                              stackIn_68_2 = stackOut_67_2;
                              stackIn_68_3 = stackOut_67_3;
                              stackIn_68_4 = stackOut_67_4;
                              break L7;
                            } else {
                              stackOut_66_0 = stackIn_66_0;
                              stackOut_66_1 = stackIn_66_1;
                              stackOut_66_2 = stackIn_66_2;
                              stackOut_66_3 = stackIn_66_3;
                              stackOut_66_4 = 8421504;
                              stackIn_68_0 = stackOut_66_0;
                              stackIn_68_1 = stackOut_66_1;
                              stackIn_68_2 = stackOut_66_2;
                              stackIn_68_3 = stackOut_66_3;
                              stackIn_68_4 = stackOut_66_4;
                              break L7;
                            }
                          }
                          si.c(stackIn_68_0, stackIn_68_1, stackIn_68_2, stackIn_68_3, stackIn_68_4);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L8: {
                        L9: {
                          ti.field_j.e(var5, var6);
                          if ((var1 ^ -1) >= -1) {
                            break L9;
                          } else {
                            if (kh.field_ib[an.field_r[var1]] > 0) {
                              break L9;
                            } else {
                              var8 = 0;
                              var9 = 0;
                              L10: while (true) {
                                if (di.field_b[var1].field_A <= var9) {
                                  break L8;
                                } else {
                                  var10 = 0;
                                  L11: while (true) {
                                    if (di.field_b[var1].field_z <= var10) {
                                      var8 = var8 + di.field_b[var1].field_u * 2;
                                      var9 += 2;
                                      continue L10;
                                    } else {
                                      var11 = di.field_b[var1].field_D[var8 + var10];
                                      var11 = (255 & var11 >> -1527634544) / 4;
                                      var11 = var11 * 262401;
                                      si.a(4 + var10 / 2 - -var5, var9 / 2 + var6, var11);
                                      var10 += 2;
                                      continue L11;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        di.field_b[var1].b(var5 + 4, var6, di.field_b[var1].field_z / 2, di.field_b[var1].field_A / 2, 256);
                        break L8;
                      }
                      L12: {
                        if (!kh.field_cb[var1]) {
                          break L12;
                        } else {
                          var8 = 12 + var5;
                          var9 = var6 - -3;
                          of.field_e.a('2', var8 + -1, var9, 65793);
                          of.field_e.a('2', var8 + 1, var9, 65793);
                          of.field_e.a('2', var8, -1 + var9, 65793);
                          of.field_e.a('2', var8, 1 + var9, 65793);
                          of.field_e.a('2', var8, var9, 16772608);
                          break L12;
                        }
                      }
                      L13: {
                        if (hf.field_i != var1) {
                          break L13;
                        } else {
                          var7 = 1;
                          break L13;
                        }
                      }
                      L14: {
                        if (var7 != 0) {
                          si.c(var5 + 24, var6 - -16, 9, 10, 16776960);
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      L15: {
                        stackOut_85_0 = al.field_Z;
                        stackOut_85_1 = Integer.toString(1 + var1);
                        stackOut_85_2 = var5 - -29;
                        stackOut_85_3 = var6 - -26;
                        stackIn_87_0 = stackOut_85_0;
                        stackIn_87_1 = stackOut_85_1;
                        stackIn_87_2 = stackOut_85_2;
                        stackIn_87_3 = stackOut_85_3;
                        stackIn_86_0 = stackOut_85_0;
                        stackIn_86_1 = stackOut_85_1;
                        stackIn_86_2 = stackOut_85_2;
                        stackIn_86_3 = stackOut_85_3;
                        if (var7 != 0) {
                          stackOut_87_0 = (nc) (Object) stackIn_87_0;
                          stackOut_87_1 = (String) (Object) stackIn_87_1;
                          stackOut_87_2 = stackIn_87_2;
                          stackOut_87_3 = stackIn_87_3;
                          stackOut_87_4 = 0;
                          stackIn_88_0 = stackOut_87_0;
                          stackIn_88_1 = stackOut_87_1;
                          stackIn_88_2 = stackOut_87_2;
                          stackIn_88_3 = stackOut_87_3;
                          stackIn_88_4 = stackOut_87_4;
                          break L15;
                        } else {
                          stackOut_86_0 = (nc) (Object) stackIn_86_0;
                          stackOut_86_1 = (String) (Object) stackIn_86_1;
                          stackOut_86_2 = stackIn_86_2;
                          stackOut_86_3 = stackIn_86_3;
                          stackOut_86_4 = 16776960;
                          stackIn_88_0 = stackOut_86_0;
                          stackIn_88_1 = stackOut_86_1;
                          stackIn_88_2 = stackOut_86_2;
                          stackIn_88_3 = stackOut_86_3;
                          stackIn_88_4 = stackOut_86_4;
                          break L15;
                        }
                      }
                      ((nc) (Object) stackIn_88_0).b(stackIn_88_1, stackIn_88_2, stackIn_88_3, stackIn_88_4, -1);
                      var5 += 46;
                      var1++;
                      continue L3;
                    } else {
                      var5 += 46;
                      var1++;
                      continue L3;
                    }
                  }
                }
              } else {
                if (kh.field_Q[var1]) {
                  if (an.field_r[var1] > -1) {
                    var1++;
                    continue L1;
                  } else {
                    var1++;
                    continue L1;
                  }
                } else {
                  var1++;
                  continue L1;
                }
              }
            }
          } else {
            L16: {
              var2 = 8;
              if (1 != var1) {
                break L16;
              } else {
                var2 = 632 + -qa.field_g[0].field_u;
                break L16;
              }
            }
            var3 = 8;
            var5 = kh.field_U[var1];
            if ((var5 ^ -1) <= -1) {
              L17: {
                var6 = 16772608;
                var7 = an.field_r[var5];
                if (var7 < 0) {
                  break L17;
                } else {
                  if (kh.field_ib[var7] >= -1) {
                    var6 = 16728128;
                    break L17;
                  } else {
                    break L17;
                  }
                }
              }
              L18: {
                if (-1 == var1) {
                  oc.field_c.e(0, 0);
                  dn.a(var2, -112, var5, var3 + -16, var6);
                  break L18;
                } else {
                  oc.field_c.d(640 + -oc.field_c.field_z, 0);
                  pf.a(var2, -16 + var3, 0, var5, var6);
                  break L18;
                }
              }
              L19: {
                if (var1 != 0) {
                  si.d(515, 0, 640, 480);
                  si.c();
                  break L19;
                } else {
                  si.d(0, 0, 125, 480);
                  si.c();
                  break L19;
                }
              }
              L20: {
                if (0 != var7) {
                  if (-1 == var1) {
                    var2 = var2 + (8 + qa.field_g[0].field_u);
                    hh.field_a[var7].e(46, 5 + var3);
                    break L20;
                  } else {
                    if (-2 == (var1 ^ -1)) {
                      var2 -= 24;
                      hh.field_a[var7].e(562, 5 + var3);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                } else {
                  break L20;
                }
              }
              if (-1 >= var5) {
                L21: {
                  var8_ref_String = var4[var5];
                  if (0 > var7) {
                    break L21;
                  } else {
                    if (-1 >= kh.field_ib[var7]) {
                      var8_ref = nf.field_p.toUpperCase();
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                }
                if (var1 != 0) {
                  if ((var1 ^ -1) == -2) {
                    var2 -= 24;
                    if (var5 == 0) {
                      of.field_e.c(var8_ref, 572, 32 + var3, 16772608, 0);
                      var1++;
                      continue L0;
                    } else {
                      kb.a(7, 42 + var3, var6, 0, var8_ref, (vm) (Object) al.field_Z, 572);
                      var1++;
                      continue L0;
                    }
                  } else {
                    var1++;
                    continue L0;
                  }
                } else {
                  if (var5 == 0) {
                    of.field_e.a(var8_ref, 68, var3 - -32, 16772608, 0);
                    var2 += 24;
                    var1++;
                    continue L0;
                  } else {
                    ec.a(7, var3 - -42, false, (vm) (Object) al.field_Z, 68, var6, var8_ref);
                    var2 += 24;
                    var1++;
                    continue L0;
                  }
                }
              } else {
                var1++;
                continue L0;
              }
            } else {
              var1++;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[8192];
        field_b = 838899712;
        field_a = "Loading fonts";
    }
}
