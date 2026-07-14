/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th {
    static int field_f;
    private fm[] field_h;
    static gn field_d;
    static String field_i;
    static int[] field_g;
    static lg field_k;
    static String field_j;
    private we field_e;
    static kc field_c;
    static String field_a;
    static int[] field_b;

    final void a(int param0, int param1, String param2, int param3) {
        L0: {
          if (-1 < (param3 ^ -1)) {
            break L0;
          } else {
            if (((th) this).field_h.length > param3) {
              L1: {
                if (param0 < param1) {
                  break L1;
                } else {
                  if (((th) this).field_e.field_c.length <= param0) {
                    break L1;
                  } else {
                    ((th) this).field_h[param3].field_b[param0] = param2;
                    return;
                  }
                }
              }
              return;
            } else {
              break L0;
            }
          }
        }
    }

    final static qb[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        qb[] var10 = null;
        qb[] var11_ref_qb__ = null;
        int var11 = 0;
        int var12 = 0;
        qb var13 = null;
        int var14 = 0;
        int var15 = 0;
        var15 = ArcanistsMulti.field_G ? 1 : 0;
        var9 = param1 + param7 - -param6;
        var10 = new qb[]{new qb(var9, var9), new qb(param2, var9), new qb(var9, var9), new qb(var9, param2), new qb(64, 64), new qb(var9, param2), new qb(var9, var9), new qb(param2, var9), new qb(var9, var9)};
        var11_ref_qb__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var11_ref_qb__.length <= var12) {
            var10 = var11_ref_qb__;
            var11 = 0;
            L1: while (true) {
              if (param7 <= var11) {
                L2: {
                  if (param4 == -32573) {
                    break L2;
                  } else {
                    field_d = null;
                    break L2;
                  }
                }
                var11 = 0;
                L3: while (true) {
                  if (var11 >= param7) {
                    var11 = 0;
                    L4: while (true) {
                      if (var11 >= param2) {
                        var11 = 0;
                        L5: while (true) {
                          if (param2 >> 1812807105 <= var11) {
                            return var10;
                          } else {
                            var12 = 0;
                            L6: while (true) {
                              if (var12 >= param1) {
                                var11++;
                                continue L5;
                              } else {
                                var10[1].field_A[var11 + (-1 + -var12 + var9) * param2] = param0;
                                var10[3].field_A[var9 - 1 + (-var12 + var11 * var9)] = param0;
                                var10[7].field_A[param2 * var12 + var11] = param0;
                                var10[5].field_A[var11 * var9 + var12] = param0;
                                var12++;
                                continue L6;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = 0;
                        L7: while (true) {
                          if (var12 < param7) {
                            var10[7].field_A[var11 + param2 * (-1 + var9 - var12)] = param5;
                            var10[5].field_A[var9 - 1 - (var12 - var9 * var11)] = param5;
                            var10[1].field_A[var11 + var12 * param2] = param3;
                            var10[3].field_A[var11 * var9 + var12] = param3;
                            var12++;
                            continue L7;
                          } else {
                            var11++;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L8: while (true) {
                      if (var12 < var9) {
                        var10[0].field_A[var12 - -(var11 * var9)] = param3;
                        var10[0].field_A[var9 * var12 - -var11] = param3;
                        if (var9 - var11 > var12) {
                          var10[2].field_A[var12 + var9 * var11] = param3;
                          var10[6].field_A[var9 * var12 + var11] = param3;
                          var12++;
                          continue L8;
                        } else {
                          var12++;
                          continue L8;
                        }
                      } else {
                        var11++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var12 = 0;
                L9: while (true) {
                  if (var12 >= var9) {
                    var11++;
                    continue L1;
                  } else {
                    var10[6].field_A[var12 + (-1 + var9 - var11) * var9] = param5;
                    var10[8].field_A[var12 + (-var11 + var9 + -1) * var9] = param5;
                    var10[2].field_A[-1 - -var9 - (var11 - var12 * var9)] = param5;
                    var10[8].field_A[-var11 - (-var9 + 1) + var12 * var9] = param5;
                    var12++;
                    continue L9;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_qb__[var12];
            var14 = 0;
            L10: while (true) {
              if (var13.field_A.length <= var14) {
                var12++;
                continue L0;
              } else {
                var13.field_A[var14] = param8;
                var14++;
                continue L10;
              }
            }
          }
        }
    }

    final static void a(eg param0, eg param1, eg param2, byte param3, boolean param4) {
        wn.field_z = nj.a("", param3 + 133);
        wn.field_z.a(false, (byte) -59);
        aa.a(param3 ^ -121, param2, param1, param0);
        ci.a((byte) 50);
        hb.field_Gb = uj.field_h;
        in.field_Gb = uj.field_h;
        if (param3 != -40) {
            field_c = null;
        }
    }

    final boolean a(int param0, int param1) {
        if (param0 > param1) {
          return false;
        } else {
          if (param1 < ((th) this).field_h.length) {
            if (-1L != ((th) this).field_h[param1].field_f) {
              return false;
            } else {
              ((th) this).field_h[param1].field_f = ((th) this).field_e.a(0);
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void a(byte param0) {
        field_g = null;
        field_k = null;
        field_a = null;
        field_i = null;
        field_d = null;
        field_b = null;
        if (param0 != -113) {
            Object var2 = null;
            th.a((nf) null, (ll) null, -127, -97, -25, -84);
        }
        field_j = null;
        field_c = null;
    }

    final static void a(nf param0, ll param1, int param2, int param3, int param4, int param5) {
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
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        var18 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1 == null) {
          return;
        } else {
          L0: {
            if (0 <= param3) {
              break L0;
            } else {
              param3 = -param3;
              break L0;
            }
          }
          L1: {
            var6 = -param3 + param5;
            if (0 <= var6) {
              break L1;
            } else {
              var6 = 0;
              break L1;
            }
          }
          L2: {
            var7 = 1 + (param5 + param3);
            if (param2 + param0.field_H >= var7) {
              break L2;
            } else {
              var7 = -1 + param0.field_H;
              break L2;
            }
          }
          L3: {
            var8 = var6;
            var9 = param3 * param3;
            var10 = 0;
            var11 = -var8 + param5;
            var12 = var11 * var11;
            if (param5 <= var7) {
              break L3;
            } else {
              param5 = var7;
              break L3;
            }
          }
          var13 = var12 + -var11;
          L4: while (true) {
            if (var8 >= param5) {
              var11 = -param5 + var8;
              var10 = param3;
              var13 = var9 + var11 * var11;
              var12 = var13 - var10;
              var13 = var13 - var11;
              L5: while (true) {
                if (var7 <= var8) {
                  return;
                } else {
                  L6: while (true) {
                    L7: {
                      if (var9 >= var13) {
                        break L7;
                      } else {
                        if (var9 >= var12) {
                          break L7;
                        } else {
                          var10--;
                          var13 = var13 - (var10 - -var10);
                          var12 = var12 - (var10 + var10);
                          continue L6;
                        }
                      }
                    }
                    L8: {
                      var14 = param4 - var10;
                      if (var14 < 0) {
                        var14 = 0;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      var15 = param4 - -var10;
                      if (-1 + param0.field_y < var15) {
                        var15 = -1 + param0.field_y;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    var19 = var14 + var8 * param0.field_y;
                    var16 = var19;
                    var17 = var14;
                    L10: while (true) {
                      if (var17 > var15) {
                        var13 = var13 + (var11 + var11);
                        var8++;
                        var11++;
                        var12 = var12 + (var11 - -var11);
                        continue L5;
                      } else {
                        if (0 != param1.field_m[var19]) {
                          param1.field_m[var19] = (byte)-4;
                          var19++;
                          var17++;
                          continue L10;
                        } else {
                          var19++;
                          var17++;
                          continue L10;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              L11: while (true) {
                L12: {
                  if (var13 <= var9) {
                    break L12;
                  } else {
                    if (var9 < var12) {
                      L13: {
                        var14 = 1 + param4 - var10;
                        if (-1 >= (var14 ^ -1)) {
                          break L13;
                        } else {
                          var14 = 0;
                          break L13;
                        }
                      }
                      L14: {
                        var15 = param4 - -var10;
                        if (var15 <= param0.field_y + -1) {
                          break L14;
                        } else {
                          var15 = param0.field_y + -1;
                          break L14;
                        }
                      }
                      var16 = var8 * param0.field_y + var14;
                      var11--;
                      var12 = var12 - (var11 - -var11);
                      var17 = var14;
                      L15: while (true) {
                        if (var17 >= var15) {
                          var8++;
                          var13 = var13 - (var11 - -var11);
                          continue L4;
                        } else {
                          if (0 != param1.field_m[var16]) {
                            param1.field_m[var16] = (byte)-2;
                            var16++;
                            var17++;
                            continue L15;
                          } else {
                            var16++;
                            var17++;
                            continue L15;
                          }
                        }
                      }
                    } else {
                      break L12;
                    }
                  }
                }
                var12 = var12 + (var10 + var10);
                var10++;
                var13 = var13 + (var10 + var10);
                continue L11;
              }
            }
          }
        }
    }

    final String a(byte param0, int param1) {
        if (param0 <= 107) {
            return null;
        }
        if ((param1 ^ -1) > -1) {
            return null;
        }
        if (param1 >= ((th) this).field_h.length) {
            return null;
        }
        return fd.a(false, ((th) this).field_h[param1]);
    }

    private th() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Music: ";
        field_j = "Hair";
        field_g = new int[]{13, 14, 15, 16, 17, 18, 43, 44, 59, 40};
        field_a = "GAME DRAWN<br><br>";
        field_b = new int[]{4};
    }
}
