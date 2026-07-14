/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    cn field_a;
    int[] field_c;
    int field_d;
    int field_b;
    private static String field_z;

    private final void e(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          param0 = param0 + ((ph) this).field_a.field_w;
          param1 = param1 + ((ph) this).field_a.field_A;
          var3 = param0 + param1 * gf.field_i;
          var4 = 0;
          var5 = ((ph) this).field_b;
          var6 = ((ph) this).field_d;
          var7 = gf.field_i - var6;
          var8 = 0;
          if (param1 >= gf.field_f) {
            break L0;
          } else {
            var9 = gf.field_f - param1;
            var5 = var5 - var9;
            param1 = gf.field_f;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * gf.field_i;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= gf.field_e) {
            break L1;
          } else {
            var5 = var5 - (param1 + var5 - gf.field_e);
            break L1;
          }
        }
        L2: {
          if (param0 >= gf.field_j) {
            break L2;
          } else {
            var9 = gf.field_j - param0;
            var6 = var6 - var9;
            param0 = gf.field_j;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= gf.field_h) {
            break L3;
          } else {
            var9 = param0 + var6 - gf.field_h;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L3;
          }
        }
        L4: {
          if (var6 <= 0) {
            break L4;
          } else {
            if (var5 > 0) {
              ph.a(jh.field_f, ((ph) this).field_c, var4, var3, var6, var5, var7, var8);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    private final void g(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          param0 = param0 + ((ph) this).field_a.field_w;
          param1 = param1 + (((ph) this).field_a.field_G - ((ph) this).field_a.field_v - ((ph) this).field_a.field_A);
          var3 = param0 + (param1 + ((ph) this).field_b - 1) * gf.field_i;
          var4 = 0;
          var5 = ((ph) this).field_b;
          var6 = ((ph) this).field_d;
          var7 = -gf.field_i - var6;
          var8 = 0;
          if (param1 >= gf.field_f) {
            break L0;
          } else {
            var5 = var5 - (gf.field_f - param1);
            param1 = gf.field_f;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= gf.field_e) {
            break L1;
          } else {
            var9 = param1 + var5 - gf.field_e;
            var5 = var5 - var9;
            var3 = var3 - var9 * gf.field_i;
            var4 = var4 + var9 * var6;
            break L1;
          }
        }
        L2: {
          if (param0 >= gf.field_j) {
            break L2;
          } else {
            var9 = gf.field_j - param0;
            var6 = var6 - var9;
            param0 = gf.field_j;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= gf.field_h) {
            break L3;
          } else {
            var9 = param0 + var6 - gf.field_h;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L3;
          }
        }
        L4: {
          if (var6 <= 0) {
            break L4;
          } else {
            if (var5 > 0) {
              ph.a(jh.field_f, ((ph) this).field_c, 0, var4, var3, 65280, var6, var5, var7, var8);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    final void h(int param0, int param1) {
        ((ph) this).field_a.h(param0, param1);
        ((ph) this).d(param0, param1);
    }

    final static ph a(nh param0, String param1, String param2) {
        cn var4 = null;
        cn var3 = oh.a(param0, param1, 11091, param2);
        param2 = param2 + field_z;
        if (param0.b(param2, param1, (byte) -82)) {
            var4 = oh.a(param0, param1, 11091, param2);
            return new ph(var3, var4);
        }
        return new ph(var3, ph.a(var3));
    }

    final void f(int param0, int param1) {
        ((ph) this).field_a.b(param0, param1);
        this.c(param0, param1);
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        int var10 = 0;
        int var8 = -(param4 >> 2);
        param4 = -(param4 & 3);
        for (var9 = -param5; var9 < 0; var9++) {
            for (var10 = var8; var10 < 0; var10++) {
                param3++;
                param2++;
                param0[param3] = param1[param2];
                param3++;
                param2++;
                param0[param3] = param1[param2];
                param3++;
                param2++;
                param0[param3] = param1[param2];
                param3++;
                param2++;
                param0[param3] = param1[param2];
            }
            for (var10 = param4; var10 < 0; var10++) {
                param3++;
                param2++;
                param0[param3] = param1[param2];
            }
            param3 = param3 + param6;
            param2 = param2 + param7;
        }
    }

    final void i(int param0, int param1) {
        ((ph) this).field_a.g(param0, param1);
        this.g(param0, param1);
    }

    private final void c(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          param0 = param0 + ((ph) this).field_a.field_w;
          param1 = param1 + (((ph) this).field_a.field_G - ((ph) this).field_b - ((ph) this).field_a.field_A);
          var3 = param0 + (param1 + ((ph) this).field_b - 1) * gf.field_i;
          var4 = ((ph) this).field_d - 1;
          var5 = ((ph) this).field_b;
          var6 = ((ph) this).field_d;
          var7 = -gf.field_i - var6;
          var8 = var6 + var6;
          if (param1 >= gf.field_f) {
            break L0;
          } else {
            var5 = var5 - (gf.field_f - param1);
            param1 = gf.field_f;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= gf.field_e) {
            break L1;
          } else {
            var9 = param1 + var5 - gf.field_e;
            var5 = var5 - var9;
            var3 = var3 - var9 * gf.field_i;
            var4 = var4 + var9 * var6;
            break L1;
          }
        }
        L2: {
          if (param0 >= gf.field_j) {
            break L2;
          } else {
            var9 = gf.field_j - param0;
            var6 = var6 - var9;
            param0 = gf.field_j;
            var4 = var4 - var9;
            var3 = var3 + var9;
            var8 = var8 - var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= gf.field_h) {
            break L3;
          } else {
            var9 = param0 + var6 - gf.field_h;
            var6 = var6 - var9;
            var8 = var8 - var9;
            var7 = var7 + var9;
            break L3;
          }
        }
        L4: {
          if (var6 <= 0) {
            break L4;
          } else {
            if (var5 > 0) {
              ph.b(jh.field_f, ((ph) this).field_c, 0, var4, var3, 16776960, var6, var5, var7, var8);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    final void d(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          param0 = param0 + ((ph) this).field_a.field_w;
          param1 = param1 + ((ph) this).field_a.field_A;
          var3 = param0 + param1 * gf.field_i;
          var4 = 0;
          var5 = ((ph) this).field_b;
          var6 = ((ph) this).field_d;
          var7 = gf.field_i - var6;
          var8 = 0;
          if (param1 >= gf.field_f) {
            break L0;
          } else {
            var9 = gf.field_f - param1;
            var5 = var5 - var9;
            param1 = gf.field_f;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * gf.field_i;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= gf.field_e) {
            break L1;
          } else {
            var5 = var5 - (param1 + var5 - gf.field_e);
            break L1;
          }
        }
        L2: {
          if (param0 >= gf.field_j) {
            break L2;
          } else {
            var9 = gf.field_j - param0;
            var6 = var6 - var9;
            param0 = gf.field_j;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= gf.field_h) {
            break L3;
          } else {
            var9 = param0 + var6 - gf.field_h;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L3;
          }
        }
        L4: {
          if (var6 <= 0) {
            break L4;
          } else {
            if (var5 > 0) {
              ph.a(jh.field_f, ((ph) this).field_c, 0, var4, var3, 0, var6, var5, var7, var8);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    private final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          param0 = param0 + (((ph) this).field_a.field_E - ((ph) this).field_a.field_y - ((ph) this).field_a.field_w);
          param1 = param1 + ((ph) this).field_a.field_A;
          var3 = param0 + param1 * gf.field_i;
          var4 = ((ph) this).field_a.field_y - 1;
          var5 = ((ph) this).field_a.field_v;
          var6 = ((ph) this).field_a.field_y;
          var7 = gf.field_i - var6;
          var8 = var6 + var6;
          if (param1 >= gf.field_f) {
            break L0;
          } else {
            var9 = gf.field_f - param1;
            var5 = var5 - var9;
            param1 = gf.field_f;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * gf.field_i;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= gf.field_e) {
            break L1;
          } else {
            var5 = var5 - (param1 + var5 - gf.field_e);
            break L1;
          }
        }
        L2: {
          if (param0 >= gf.field_j) {
            break L2;
          } else {
            var9 = gf.field_j - param0;
            var6 = var6 - var9;
            param0 = gf.field_j;
            var4 = var4 - var9;
            var3 = var3 + var9;
            var8 = var8 - var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= gf.field_h) {
            break L3;
          } else {
            var9 = param0 + var6 - gf.field_h;
            var6 = var6 - var9;
            var8 = var8 - var9;
            var7 = var7 + var9;
            break L3;
          }
        }
        L4: {
          if (var6 <= 0) {
            break L4;
          } else {
            if (var5 > 0) {
              ph.b(jh.field_f, ((ph) this).field_c, 0, var4, var3, 16711680, var6, var5, var7, var8);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    final void b(int param0, int param1) {
        ((ph) this).field_a.c(param0, param1);
        this.e(param0, param1);
    }

    private final static int[] a(cn param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        var12 = new int[param0.field_y * param0.field_v];
        var11 = var12;
        var10 = var11;
        var9 = var10;
        var1 = var9;
        var2 = 0;
        var3 = -1;
        var4 = 0;
        L0: while (true) {
          if (var4 >= param0.field_v) {
            var4 = -1;
            var5 = 0;
            L1: while (true) {
              if (var5 >= param0.field_y) {
                return var1;
              } else {
                var6 = 0;
                var4 = -1;
                var2 = var5;
                L2: while (true) {
                  if (var6 >= param0.field_v) {
                    if (var4 != -1) {
                      var2 = var4 * param0.field_y + var5;
                      var7 = var4;
                      L3: while (true) {
                        if (var7 < var6) {
                          var8 = 64 - 128 * (var7 - var4) / (var6 - var4);
                          var1[var2] = var1[var2] | (byte)var8 << 8;
                          var2 = var2 + param0.field_y;
                          var7++;
                          continue L3;
                        } else {
                          var5++;
                          continue L1;
                        }
                      }
                    } else {
                      var5++;
                      continue L1;
                    }
                  } else {
                    L4: {
                      if (param0.field_B[var2] != 0) {
                        if (var4 != -1) {
                          break L4;
                        } else {
                          var4 = var6;
                          break L4;
                        }
                      } else {
                        L5: {
                          if (var4 == -1) {
                            break L5;
                          } else {
                            var2 = var4 * param0.field_y + var5;
                            var7 = var4;
                            L6: while (true) {
                              if (var7 >= var6) {
                                break L5;
                              } else {
                                var8 = 64 - 128 * (var7 - var4) / (var6 - var4);
                                var1[var2] = var1[var2] | (byte)var8 << 8;
                                var2 = var2 + param0.field_y;
                                var7++;
                                continue L6;
                              }
                            }
                          }
                        }
                        var4 = -1;
                        break L4;
                      }
                    }
                    var6++;
                    var2 = var2 + param0.field_y;
                    continue L2;
                  }
                }
              }
            }
          } else {
            var5 = 0;
            var3 = -1;
            L7: while (true) {
              if (var5 >= param0.field_y) {
                var12 = var11;
                if (var3 != -1) {
                  var2 = var4 * param0.field_y + var3;
                  var6 = var3;
                  L8: while (true) {
                    if (var6 < var5) {
                      var7 = 64 - 128 * (var6 - var3) / (var5 - var3);
                      var8 = (byte)var7 << 16 | 16;
                      var12[var2] = var8;
                      var2++;
                      var6++;
                      continue L8;
                    } else {
                      var4++;
                      continue L0;
                    }
                  }
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                if (param0.field_B[var2] != 0) {
                  param0.field_B[var2] = param0.field_B[var2] | -2147483648;
                  if (var3 == -1) {
                    var3 = var5;
                    var5++;
                    var2++;
                    continue L7;
                  } else {
                    var5++;
                    var2++;
                    continue L7;
                  }
                } else {
                  L9: {
                    if (var3 == -1) {
                      break L9;
                    } else {
                      var2 = var4 * param0.field_y + var3;
                      var6 = var3;
                      L10: while (true) {
                        if (var6 >= var5) {
                          break L9;
                        } else {
                          var7 = 64 - 128 * (var6 - var3) / (var5 - var3);
                          var8 = (byte)var7 << 16 | 16;
                          var12[var2] = var8;
                          var2++;
                          var6++;
                          continue L10;
                        }
                      }
                    }
                  }
                  var3 = -1;
                  var5++;
                  var2++;
                  continue L7;
                }
              }
            }
          }
        }
    }

    ph(cn param0, cn param1) {
        ((ph) this).field_a = param0;
        ((ph) this).field_c = param1.field_B;
        ((ph) this).field_d = param0.field_y;
        ((ph) this).field_b = param0.field_v;
    }

    ph(cn param0, int[] param1) {
        ((ph) this).field_a = param0;
        ((ph) this).field_c = param1;
        ((ph) this).field_d = param0.field_y;
        ((ph) this).field_b = param0.field_v;
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var10 = -(param6 >> 2);
        param6 = -(param6 & 3);
        var11 = -param7;
        L0: while (true) {
          if (var11 >= 0) {
            return;
          } else {
            var12 = var10;
            L1: while (true) {
              if (var12 >= 0) {
                var12 = param6;
                L2: while (true) {
                  if (var12 >= 0) {
                    param4 = param4 + param8;
                    param3 = param3 + param9;
                    var11++;
                    continue L0;
                  } else {
                    param3++;
                    param2 = param1[param3];
                    if (param2 == 0) {
                      param4++;
                      var12++;
                      continue L2;
                    } else {
                      param4++;
                      param0[param4] = param2 ^ param5;
                      var12++;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  param3++;
                  param2 = param1[param3];
                  if (param2 == 0) {
                    param4++;
                    break L3;
                  } else {
                    param4++;
                    param0[param4] = param2 ^ param5;
                    break L3;
                  }
                }
                L4: {
                  param3++;
                  param2 = param1[param3];
                  if (param2 == 0) {
                    param4++;
                    break L4;
                  } else {
                    param4++;
                    param0[param4] = param2 ^ param5;
                    break L4;
                  }
                }
                L5: {
                  param3++;
                  param2 = param1[param3];
                  if (param2 == 0) {
                    param4++;
                    break L5;
                  } else {
                    param4++;
                    param0[param4] = param2 ^ param5;
                    break L5;
                  }
                }
                param3++;
                param2 = param1[param3];
                if (param2 == 0) {
                  param4++;
                  var12++;
                  continue L1;
                } else {
                  param4++;
                  param0[param4] = param2 ^ param5;
                  var12++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void j(int param0, int param1) {
        ((ph) this).field_a.f(param0, param1);
        this.a(param0, param1);
    }

    private final static void b(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var10 = -(param6 >> 2);
        param6 = -(param6 & 3);
        var11 = -param7;
        L0: while (true) {
          if (var11 >= 0) {
            return;
          } else {
            var12 = var10;
            L1: while (true) {
              if (var12 >= 0) {
                var12 = param6;
                L2: while (true) {
                  if (var12 >= 0) {
                    param4 = param4 + param8;
                    param3 = param3 + param9;
                    var11++;
                    continue L0;
                  } else {
                    param3--;
                    param2 = param1[param3];
                    if (param2 == 0) {
                      param4++;
                      var12++;
                      continue L2;
                    } else {
                      param4++;
                      param0[param4] = param2 ^ param5;
                      var12++;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  param3--;
                  param2 = param1[param3];
                  if (param2 == 0) {
                    param4++;
                    break L3;
                  } else {
                    param4++;
                    param0[param4] = param2 ^ param5;
                    break L3;
                  }
                }
                L4: {
                  param3--;
                  param2 = param1[param3];
                  if (param2 == 0) {
                    param4++;
                    break L4;
                  } else {
                    param4++;
                    param0[param4] = param2 ^ param5;
                    break L4;
                  }
                }
                L5: {
                  param3--;
                  param2 = param1[param3];
                  if (param2 == 0) {
                    param4++;
                    break L5;
                  } else {
                    param4++;
                    param0[param4] = param2 ^ param5;
                    break L5;
                  }
                }
                param3--;
                param2 = param1[param3];
                if (param2 == 0) {
                  param4++;
                  var12++;
                  continue L1;
                } else {
                  param4++;
                  param0[param4] = param2 ^ param5;
                  var12++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "_normals";
    }
}
