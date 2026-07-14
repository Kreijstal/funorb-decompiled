/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de {
    static ka field_a;
    static ll field_b;
    static boolean[][] field_c;
    static int field_d;

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 < 24) {
            boolean discarded$0 = de.a(57);
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static ka[] a(boolean param0) {
        ka[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var13 = null;
        int[] var16 = null;
        int[] var20 = null;
        int[] var24 = null;
        byte[] var29 = null;
        int[] var30 = null;
        byte[] var31 = null;
        int[] var32 = null;
        byte[] var33 = null;
        int[] var34 = null;
        byte[] var35 = null;
        int[] var36 = null;
        var8 = TorChallenge.field_F ? 1 : 0;
        if (param0) {
          L0: {
            var1 = new ka[vl.field_b];
            var2 = 0;
            if (vl.field_b <= var2) {
              break L0;
            } else {
              L1: {
                var3 = lg.field_e[var2] * pg.field_r[var2];
                var29 = h.field_a[var2];
                if (vd.field_c[var2]) {
                  var31 = gf.field_t[var2];
                  var32 = new int[var3];
                  var20 = var32;
                  var16 = var20;
                  var13 = var16;
                  var6 = var13;
                  var7 = 0;
                  L2: while (true) {
                    if (var3 <= var7) {
                      var1[var2] = (ka) (Object) new el(ij.field_B, le.field_g, ug.field_e[var2], dd.field_t[var2], pg.field_r[var2], lg.field_e[var2], var32);
                      break L1;
                    } else {
                      var6[var7] = p.a(jh.a(255, (int) var31[var7]) << -1479920776, td.field_m[jh.a(255, (int) var29[var7])]);
                      var7++;
                      continue L2;
                    }
                  }
                } else {
                  var9 = new int[var3];
                  var30 = var9;
                  var6_int = 0;
                  L3: while (true) {
                    if (var3 <= var6_int) {
                      var1[var2] = new ka(ij.field_B, le.field_g, ug.field_e[var2], dd.field_t[var2], pg.field_r[var2], lg.field_e[var2], var30);
                      var2++;
                      break L1;
                    } else {
                      var9[var6_int] = td.field_m[jh.a((int) var29[var6_int], 255)];
                      var6_int++;
                      continue L3;
                    }
                  }
                }
              }
              var2++;
              var2++;
              var2++;
              break L0;
            }
          }
          p.a(0);
          return var1;
        } else {
          field_c = null;
          L4: {
            var1 = new ka[vl.field_b];
            var2 = 0;
            if (vl.field_b <= var2) {
              break L4;
            } else {
              L5: {
                var3 = lg.field_e[var2] * pg.field_r[var2];
                var33 = h.field_a[var2];
                if (vd.field_c[var2]) {
                  var35 = gf.field_t[var2];
                  var36 = new int[var3];
                  var24 = var36;
                  var16 = var24;
                  var13 = var16;
                  var6 = var13;
                  var7 = 0;
                  L6: while (true) {
                    if (var3 <= var7) {
                      var1[var2] = (ka) (Object) new el(ij.field_B, le.field_g, ug.field_e[var2], dd.field_t[var2], pg.field_r[var2], lg.field_e[var2], var36);
                      break L5;
                    } else {
                      var6[var7] = p.a(jh.a(255, (int) var35[var7]) << -1479920776, td.field_m[jh.a(255, (int) var33[var7])]);
                      var7++;
                      continue L6;
                    }
                  }
                } else {
                  var9 = new int[var3];
                  var34 = var9;
                  var6_int = 0;
                  L7: while (true) {
                    if (var3 <= var6_int) {
                      var1[var2] = new ka(ij.field_B, le.field_g, ug.field_e[var2], dd.field_t[var2], pg.field_r[var2], lg.field_e[var2], var34);
                      var2++;
                      break L5;
                    } else {
                      var9[var6_int] = td.field_m[jh.a((int) var33[var6_int], 255)];
                      var6_int++;
                      continue L7;
                    }
                  }
                }
              }
              var2++;
              var2++;
              var2++;
              break L4;
            }
          }
          p.a(0);
          return var1;
        }
    }

    final static boolean a(int param0) {
        gh var1 = null;
        int var2 = 0;
        int var3 = 0;
        gh var4 = null;
        var3 = TorChallenge.field_F ? 1 : 0;
        var4 = (gh) (Object) pf.field_d.c((byte) -66);
        var1 = var4;
        if (var1 == null) {
          return false;
        } else {
          var2 = 0;
          L0: while (true) {
            if (var1.field_p > var2) {
              L1: {
                if (null != var4.field_j[var2]) {
                  if (var4.field_j[var2].field_d != 0) {
                    break L1;
                  } else {
                    return false;
                  }
                } else {
                  break L1;
                }
              }
              if (null != var4.field_q[var2]) {
                if (-1 == (var4.field_q[var2].field_d ^ -1)) {
                  return false;
                } else {
                  var2++;
                  continue L0;
                }
              } else {
                var2++;
                var2++;
                continue L0;
              }
            } else {
              L2: {
                if (param0 == -1) {
                  break L2;
                } else {
                  field_a = null;
                  break L2;
                }
              }
              return true;
            }
          }
        }
    }

    final static void b(int param0) {
        int var1 = 0;
        boolean[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var9 = TorChallenge.field_F ? 1 : 0;
        var1 = nh.field_hb.length;
        if (ma.field_j >= var1) {
          return;
        } else {
          var2 = ra.field_k[ma.field_j];
          if (var2[a.field_c]) {
            var3 = nh.field_hb[ma.field_j];
            var4 = we.field_l[ma.field_j];
            var5 = 200;
            var6 = var4 * var5;
            if (param0 == -131073) {
              var7 = var3 * var6;
              var8 = ef.field_k % var7 / var6;
              cj.field_j = -var8 + a.field_c;
              if (cj.field_j < 0) {
                L0: {
                  cj.field_j = cj.field_j + var3;
                  var10 = 0;
                  var8 = var10;
                  if (3 <= var10) {
                    break L0;
                  } else {
                    L1: {
                      if (lj.field_n[var10] != null) {
                        lj.field_n[var10].field_kb = 0;
                        break L1;
                      } else {
                        var10++;
                        break L1;
                      }
                    }
                    var10++;
                    var10++;
                    var10++;
                    break L0;
                  }
                }
                return;
              } else {
                var10 = 0;
                var8 = var10;
                L2: while (true) {
                  if (3 <= var10) {
                    return;
                  } else {
                    if (lj.field_n[var10] != null) {
                      lj.field_n[var10].field_kb = 0;
                      var10++;
                      continue L2;
                    } else {
                      var10++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final static boolean a(int param0, lj param1) {
        int var2 = 64 % ((-52 - param0) / 32);
        return param1.b((byte) 79);
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = TorChallenge.field_F ? 1 : 0;
        if (param0 < 100) {
          boolean discarded$1 = de.a(-50);
          if (param1 != 0) {
            if (param1 < 0) {
              throw new IllegalArgumentException("");
            } else {
              if (32768 <= param1) {
                if ((param1 ^ -1) <= -131073) {
                  if (param1 >= 33554432) {
                    if (-536870913 < (param1 ^ -1)) {
                      if (param1 < 134217728) {
                        var2 = 5;
                        param1 = param1 >> (var2 << -1593251263);
                        return dd.field_p[param1 - 32768] << var2;
                      } else {
                        var2 = 6;
                        param1 = param1 >> (var2 << -1593251263);
                        return dd.field_p[param1 - 32768] << var2;
                      }
                    } else {
                      var2 = 7;
                      param1 = param1 >> (var2 << -1593251263);
                      return dd.field_p[param1 - 32768] << var2;
                    }
                  } else {
                    if (2097152 > param1) {
                      if ((param1 ^ -1) <= -524289) {
                        var2 = 2;
                        param1 = param1 >> (var2 << -1593251263);
                        return dd.field_p[param1 - 32768] << var2;
                      } else {
                        var2 = 1;
                        param1 = param1 >> (var2 << -1593251263);
                        return dd.field_p[param1 - 32768] << var2;
                      }
                    } else {
                      if (param1 < 8388608) {
                        var2 = 3;
                        param1 = param1 >> (var2 << -1593251263);
                        return dd.field_p[param1 - 32768] << var2;
                      } else {
                        var2 = 4;
                        param1 = param1 >> (var2 << -1593251263);
                        return dd.field_p[param1 - 32768] << var2;
                      }
                    }
                  }
                } else {
                  return dd.field_p[-32768 + param1];
                }
              } else {
                if (param1 < 128) {
                  if (-9 < (param1 ^ -1)) {
                    if (param1 >= 2) {
                      var2 = 7;
                      param1 = param1 << (var2 << 135160417);
                      return dd.field_p[param1 - 32768] >> var2;
                    } else {
                      return 256;
                    }
                  } else {
                    if (param1 < 32) {
                      var2 = 6;
                      param1 = param1 << (var2 << 135160417);
                      return dd.field_p[param1 - 32768] >> var2;
                    } else {
                      var2 = 5;
                      param1 = param1 << (var2 << 135160417);
                      return dd.field_p[param1 - 32768] >> var2;
                    }
                  }
                } else {
                  if (2048 <= param1) {
                    if (param1 < 8192) {
                      var2 = 2;
                      param1 = param1 << (var2 << 135160417);
                      return dd.field_p[param1 - 32768] >> var2;
                    } else {
                      var2 = 1;
                      param1 = param1 << (var2 << 135160417);
                      return dd.field_p[param1 - 32768] >> var2;
                    }
                  } else {
                    if (-513 < (param1 ^ -1)) {
                      var2 = 4;
                      param1 = param1 << (var2 << 135160417);
                      return dd.field_p[param1 - 32768] >> var2;
                    } else {
                      var2 = 3;
                      param1 = param1 << (var2 << 135160417);
                      return dd.field_p[param1 - 32768] >> var2;
                    }
                  }
                }
              }
            }
          } else {
            return 0;
          }
        } else {
          if (param1 != 0) {
            if (param1 < 0) {
              throw new IllegalArgumentException("");
            } else {
              if (32768 <= param1) {
                if ((param1 ^ -1) <= -131073) {
                  if (param1 >= 33554432) {
                    if (-536870913 < (param1 ^ -1)) {
                      if (param1 >= 134217728) {
                        var2 = 6;
                        param1 = param1 >> (var2 << -1593251263);
                        return dd.field_p[param1 - 32768] << var2;
                      } else {
                        var2 = 5;
                        param1 = param1 >> (var2 << -1593251263);
                        return dd.field_p[param1 - 32768] << var2;
                      }
                    } else {
                      var2 = 7;
                      param1 = param1 >> (var2 << -1593251263);
                      return dd.field_p[param1 - 32768] << var2;
                    }
                  } else {
                    if (2097152 > param1) {
                      if ((param1 ^ -1) > -524289) {
                        var2 = 1;
                        param1 = param1 >> (var2 << -1593251263);
                        return dd.field_p[param1 - 32768] << var2;
                      } else {
                        var2 = 2;
                        param1 = param1 >> (var2 << -1593251263);
                        return dd.field_p[param1 - 32768] << var2;
                      }
                    } else {
                      if (param1 >= 8388608) {
                        var2 = 4;
                        param1 = param1 >> (var2 << -1593251263);
                        return dd.field_p[param1 - 32768] << var2;
                      } else {
                        var2 = 3;
                        param1 = param1 >> (var2 << -1593251263);
                        return dd.field_p[param1 - 32768] << var2;
                      }
                    }
                  }
                } else {
                  return dd.field_p[-32768 + param1];
                }
              } else {
                L0: {
                  if (param1 < 128) {
                    if (-9 < (param1 ^ -1)) {
                      if (param1 < 2) {
                        return 256;
                      } else {
                        var2 = 7;
                        break L0;
                      }
                    } else {
                      if (param1 >= 32) {
                        var2 = 5;
                        break L0;
                      } else {
                        var2 = 6;
                        break L0;
                      }
                    }
                  } else {
                    if (2048 <= param1) {
                      if (param1 >= 8192) {
                        var2 = 1;
                        break L0;
                      } else {
                        var2 = 2;
                        break L0;
                      }
                    } else {
                      if (-513 < (param1 ^ -1)) {
                        var2 = 4;
                        break L0;
                      } else {
                        var2 = 3;
                        break L0;
                      }
                    }
                  }
                }
                param1 = param1 << (var2 << 135160417);
                return dd.field_p[param1 - 32768] >> var2;
              }
            }
          } else {
            return 0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = null;
        field_c = new boolean[][]{new boolean[3], new boolean[3], new boolean[3], new boolean[3], new boolean[3], new boolean[3], new boolean[3], new boolean[3], new boolean[1], new boolean[1]};
        field_b = new ll();
        field_d = 0;
    }
}
