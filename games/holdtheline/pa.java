/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa {
    private byte[] field_f;
    private long[] field_j;
    static int field_h;
    private long[] field_g;
    private byte[] field_c;
    private long[] field_k;
    private long[] field_d;
    private int field_e;
    static String field_i;
    private int field_a;
    private long[] field_b;

    final static void a(byte param0) {
        fo var1 = (fo) (Object) ji.field_a.b((byte) 87);
        if (!(var1 != null)) {
            r.a(-28036);
            return;
        }
        da var2 = rd.field_e;
        if (param0 <= 68) {
            return;
        }
        var1.field_i = new int[]{var2.a(45), var2.a(-72), var2.a(-47), var2.a(79)};
        var1.d(0);
    }

    final void a(int param0, byte[] param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        Object var9 = null;
        L0: {
          var8 = HoldTheLine.field_D;
          ((pa) this).field_f[((pa) this).field_e] = (byte)kc.a((int) ((pa) this).field_f[((pa) this).field_e], 128 >>> pk.a(7, ((pa) this).field_a));
          ((pa) this).field_e = ((pa) this).field_e + 1;
          if (((pa) this).field_e <= 32) {
            break L0;
          } else {
            L1: while (true) {
              if (-65 >= (((pa) this).field_e ^ -1)) {
                this.c(true);
                ((pa) this).field_e = 0;
                break L0;
              } else {
                ((pa) this).field_e = ((pa) this).field_e + 1;
                ((pa) this).field_f[((pa) this).field_e] = (byte) 0;
                continue L1;
              }
            }
          }
        }
        L2: while (true) {
          if (((pa) this).field_e >= 32) {
            bc.a(((pa) this).field_c, 0, ((pa) this).field_f, 32, 32);
            this.c(true);
            var4 = 0;
            var5 = param2;
            L3: while (true) {
              if (8 <= var4) {
                L4: {
                  if (param0 == 6934) {
                    break L4;
                  } else {
                    var9 = null;
                    pa.a(-73, -103, -36, (hj) null);
                    break L4;
                  }
                }
                return;
              } else {
                var6 = ((pa) this).field_k[var4];
                param1[var5] = (byte)(int)(var6 >>> 1024255288);
                param1[var5 - -1] = (byte)(int)(var6 >>> -1486375504);
                param1[2 + var5] = (byte)(int)(var6 >>> -1273126872);
                param1[var5 + 3] = (byte)(int)(var6 >>> -386314976);
                param1[4 + var5] = (byte)(int)(var6 >>> -1327392552);
                param1[5 + var5] = (byte)(int)(var6 >>> -1906317104);
                param1[6 + var5] = (byte)(int)(var6 >>> -1117382904);
                param1[var5 + 7] = (byte)(int)var6;
                var4++;
                var5 += 8;
                continue L3;
              }
            }
          } else {
            ((pa) this).field_e = ((pa) this).field_e + 1;
            ((pa) this).field_f[((pa) this).field_e] = (byte) 0;
            continue L2;
          }
        }
    }

    final void b(boolean param0) {
        int var2 = 0;
        int var3 = HoldTheLine.field_D;
        for (var2 = 0; (var2 ^ -1) > -33; var2++) {
            ((pa) this).field_c[var2] = (byte) 0;
        }
        ((pa) this).field_f[0] = (byte) 0;
        if (param0) {
            return;
        }
        ((pa) this).field_a = 0;
        ((pa) this).field_e = 0;
        for (var2 = 0; 8 > var2; var2++) {
            ((pa) this).field_k[var2] = 0L;
        }
    }

    final static void a(int param0, int param1, int param2) {
        in.field_i = param1;
        if (param0 > -32) {
            field_h = 30;
        }
        mk.field_i = param2;
    }

    final static void a(qi param0, qi param1, byte param2, int param3) {
        sj.field_G = param1;
        q.field_a = param0;
        if (param2 > -39) {
            return;
        }
        p.field_j = param3;
        pa.a(-90, tc.field_c / 2, tc.field_j / 2);
        dd.a(param1.field_s, param0.field_s, param0.field_s + param0.field_I, param1.field_I + param1.field_s, (byte) -108);
    }

    final static void a(int param0, int param1, int param2, hj param3) {
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
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        L0: {
          var20 = HoldTheLine.field_D;
          var4 = 0;
          var5 = 0;
          var6 = param3.field_s;
          var7 = param3.field_y;
          if (param1 > -1) {
            var6 = var6 + param1;
            var4 = var4 - param1;
            param1 = 0;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (-641 >= var6 + param1) {
            break L1;
          } else {
            var6 = 640 - param1;
            break L1;
          }
        }
        L2: {
          if (param0 >= 0) {
            break L2;
          } else {
            var7 = var7 + param0;
            var5 = var5 - param0;
            param0 = 0;
            break L2;
          }
        }
        L3: {
          if ((param0 - -var7 ^ -1) >= -481) {
            break L3;
          } else {
            var7 = -param0 + 480;
            break L3;
          }
        }
        var8 = var4 + (param3.field_o * (var5 + (var7 + -1)) + -1);
        var9 = (-1 + var7 + param0) * tc.field_j + param1 - 1;
        var13 = var7;
        L4: while (true) {
          if (-1 <= var13) {
            L5: {
              if (param2 > 97) {
                break L5;
              } else {
                field_h = -97;
                break L5;
              }
            }
            return;
          } else {
            var12 = var6;
            L6: while (true) {
              if (-1 >= var12) {
                var13--;
                var8 = var8 - (param3.field_o + var6);
                var9 = var9 - (var6 + tc.field_j);
                continue L4;
              } else {
                var9++;
                var11 = tc.field_b[var9];
                var8++;
                var10 = param3.field_z[var8];
                if (var10 != 0) {
                  if (0 != var11) {
                    var15 = 255 & var11 >> -705083096;
                    var18 = var10 >> 761443752 & 255;
                    var14 = (var11 & 16711680) >> -1017304112;
                    var19 = 255 & var10;
                    var16 = 255 & var11;
                    var17 = var10 >> 172500464 & 255;
                    var14 = var14 + (var17 - (var17 * var14 >> -541659768) + -1);
                    var16 = var16 + (-(var16 * var19 >> 158940200) + (var19 - 1));
                    var15 = var15 + (-1 + -(var15 * var18 >> 1123792008) + var18);
                    tc.field_b[var9] = kc.a(kc.a(var14 << 1575606768, var15 << -1517032632), var16);
                    var12--;
                    continue L6;
                  } else {
                    tc.field_b[var9] = var10;
                    var12--;
                    continue L6;
                  }
                } else {
                  var12--;
                  continue L6;
                }
              }
            }
          }
        }
    }

    private final void c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = HoldTheLine.field_D;
        if (param0) {
          var2 = 0;
          var3 = 0;
          L0: while (true) {
            if (var2 >= 8) {
              var2 = 0;
              L1: while (true) {
                if ((var2 ^ -1) <= -9) {
                  var2 = 1;
                  L2: while (true) {
                    if (var2 > 10) {
                      var2 = 0;
                      L3: while (true) {
                        if (-9 >= (var2 ^ -1)) {
                          return;
                        } else {
                          ((pa) this).field_k[var2] = en.a(((pa) this).field_k[var2], en.a(((pa) this).field_b[var2], ((pa) this).field_g[var2]));
                          var2++;
                          continue L3;
                        }
                      }
                    } else {
                      var3 = 0;
                      L4: while (true) {
                        if (var3 >= 8) {
                          var3 = 0;
                          L5: while (true) {
                            if (var3 >= 8) {
                              ((pa) this).field_d[0] = en.a(((pa) this).field_d[0], ri.field_f[var2]);
                              var3 = 0;
                              L6: while (true) {
                                if (var3 >= 8) {
                                  var3 = 0;
                                  L7: while (true) {
                                    if (8 <= var3) {
                                      var2++;
                                      continue L2;
                                    } else {
                                      ((pa) this).field_b[var3] = ((pa) this).field_j[var3];
                                      var3++;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  ((pa) this).field_j[var3] = ((pa) this).field_d[var3];
                                  var7 = 0;
                                  var4 = var7;
                                  var5 = 56;
                                  L8: while (true) {
                                    if ((var7 ^ -1) <= -9) {
                                      var3++;
                                      continue L6;
                                    } else {
                                      ((pa) this).field_j[var3] = en.a(((pa) this).field_j[var3], ri.field_g[var7][pk.a((int)(((pa) this).field_b[pk.a(-var7 + var3, 7)] >>> var5), 255)]);
                                      var7++;
                                      var5 -= 8;
                                      continue L8;
                                    }
                                  }
                                }
                              }
                            } else {
                              ((pa) this).field_d[var3] = ((pa) this).field_j[var3];
                              var3++;
                              continue L5;
                            }
                          }
                        } else {
                          ((pa) this).field_j[var3] = 0L;
                          var4 = 0;
                          var5 = 56;
                          L9: while (true) {
                            if (8 <= var4) {
                              var3++;
                              continue L4;
                            } else {
                              ((pa) this).field_j[var3] = en.a(((pa) this).field_j[var3], ri.field_g[var4][pk.a((int)(((pa) this).field_d[pk.a(var3 - var4, 7)] >>> var5), 255)]);
                              var4++;
                              var5 -= 8;
                              continue L9;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  ((pa) this).field_d[var2] = ((pa) this).field_k[var2];
                  ((pa) this).field_b[var2] = en.a(((pa) this).field_g[var2], ((pa) this).field_k[var2]);
                  var2++;
                  continue L1;
                }
              }
            } else {
              ((pa) this).field_g[var2] = en.a(en.a(gh.a(65280L, (long)((pa) this).field_f[var3 - -6] << 1398752776), en.a(gh.a((long)((pa) this).field_f[5 + var3] << -330391664, 16711680L), en.a(en.a(en.a(en.a((long)((pa) this).field_f[var3] << -1038136008, gh.a(255L, (long)((pa) this).field_f[1 + var3]) << -46476112), gh.a((long)((pa) this).field_f[2 + var3], 255L) << -1406089688), gh.a(1095216660480L, (long)((pa) this).field_f[3 + var3] << 276935776)), gh.a((long)((pa) this).field_f[4 + var3] << -147066024, 4278190080L)))), gh.a(255L, (long)((pa) this).field_f[var3 + 7]));
              var2++;
              var3 += 8;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        field_i = null;
        if (!param0) {
            pa.a(false);
        }
    }

    final void a(byte[] param0, byte param1, long param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        long var10 = 0L;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = HoldTheLine.field_D;
        var5 = 0;
        var6 = -73 / ((-14 - param1) / 44);
        var7 = 7 & -(7 & (int)param2) + 8;
        var8 = ((pa) this).field_a & 7;
        var10 = param2;
        var12 = 31;
        var13 = 0;
        L0: while (true) {
          if ((var12 ^ -1) > -1) {
            L1: while (true) {
              if ((param2 ^ -1L) >= -9L) {
                L2: {
                  if (0L < param2) {
                    var9 = 255 & param0[var5] << var7;
                    ((pa) this).field_f[((pa) this).field_e] = (byte)kc.a((int) ((pa) this).field_f[((pa) this).field_e], var9 >>> var8);
                    break L2;
                  } else {
                    var9 = 0;
                    break L2;
                  }
                }
                L3: {
                  if ((param2 + (long)var8 ^ -1L) > -9L) {
                    ((pa) this).field_a = (int)((long)((pa) this).field_a + param2);
                    break L3;
                  } else {
                    L4: {
                      param2 = param2 - (long)(-var8 + 8);
                      ((pa) this).field_a = ((pa) this).field_a + (8 - var8);
                      ((pa) this).field_e = ((pa) this).field_e + 1;
                      if ((((pa) this).field_a ^ -1) != -513) {
                        break L4;
                      } else {
                        this.c(true);
                        ((pa) this).field_e = 0;
                        ((pa) this).field_a = 0;
                        break L4;
                      }
                    }
                    ((pa) this).field_f[((pa) this).field_e] = (byte)pk.a(var9 << 8 + -var8, 255);
                    ((pa) this).field_a = ((pa) this).field_a + (int)param2;
                    break L3;
                  }
                }
                return;
              } else {
                L5: {
                  var9 = 255 & param0[var5] << var7 | (255 & param0[1 + var5]) >>> -var7 + 8;
                  if ((var9 ^ -1) > -1) {
                    break L5;
                  } else {
                    if ((var9 ^ -1) <= -257) {
                      break L5;
                    } else {
                      L6: {
                        ((pa) this).field_f[((pa) this).field_e] = (byte)kc.a((int) ((pa) this).field_f[((pa) this).field_e], var9 >>> var8);
                        ((pa) this).field_e = ((pa) this).field_e + 1;
                        ((pa) this).field_a = ((pa) this).field_a + (-var8 + 8);
                        if (-513 != (((pa) this).field_a ^ -1)) {
                          break L6;
                        } else {
                          this.c(true);
                          ((pa) this).field_e = 0;
                          ((pa) this).field_a = 0;
                          break L6;
                        }
                      }
                      ((pa) this).field_f[((pa) this).field_e] = (byte)pk.a(var9 << -var8 + 8, 255);
                      param2 = param2 - 8L;
                      var5++;
                      ((pa) this).field_a = ((pa) this).field_a + var8;
                      continue L1;
                    }
                  }
                }
                throw new RuntimeException("LOGIC ERROR");
              }
            }
          } else {
            var13 = var13 + (((int)var10 & 255) + (255 & ((pa) this).field_c[var12]));
            ((pa) this).field_c[var12] = (byte)var13;
            var10 = var10 >>> 8;
            var13 = var13 >>> 8;
            var12--;
            continue L0;
          }
        }
    }

    pa() {
        ((pa) this).field_f = new byte[64];
        ((pa) this).field_j = new long[8];
        ((pa) this).field_k = new long[8];
        ((pa) this).field_g = new long[8];
        ((pa) this).field_a = 0;
        ((pa) this).field_d = new long[8];
        ((pa) this).field_e = 0;
        ((pa) this).field_b = new long[8];
        ((pa) this).field_c = new byte[32];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Brake/reverse";
    }
}
