/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa {
    private int field_a;
    private long[] field_e;
    static uj field_g;
    static int field_m;
    private byte[] field_n;
    static dd[] field_k;
    static String field_p;
    private long[] field_i;
    private long[] field_j;
    private int field_o;
    static float field_l;
    static String field_q;
    private long[] field_b;
    private byte[] field_c;
    static String[] field_f;
    static String field_d;
    private long[] field_h;

    final void b(int param0) {
        int var2 = 0;
        int var3 = fleas.field_A ? 1 : 0;
        for (var2 = 0; var2 < 32; var2++) {
            ((wa) this).field_n[var2] = (byte) 0;
        }
        ((wa) this).field_a = 0;
        ((wa) this).field_o = 0;
        ((wa) this).field_c[0] = (byte) 0;
        var2 = 0;
        if (param0 > -91) {
            wa.a(89);
        }
        while (var2 < 8) {
            ((wa) this).field_j[var2] = 0L;
            var2++;
        }
    }

    final static String a(boolean param0) {
        int var1 = em.field_b;
        if (!(var1 >= 0)) {
            var1 = 0;
        }
        var1 = var1 / 50;
        if (param0) {
            wa.a(false, false, -70);
        }
        String var2 = 0 == (1 & ni.field_j * 2 / 50) ? ":" : "<col=<%0>>:</col>";
        String var3 = var2;
        var3 = var2;
        var3 = Integer.toString(var1 % 60);
        if (1 == var3.length()) {
            var3 = 0 + var3;
        }
        return var1 / 60 + var2 + var3;
    }

    final void a(byte param0, long param1, byte[] param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = fleas.field_A ? 1 : 0;
        var5 = 0;
        var6 = 7 & -(7 & (int)param1) + 8;
        if (param0 < -92) {
          var7 = 7 & ((wa) this).field_o;
          var9 = param1;
          var11 = 31;
          var12 = 0;
          L0: while (true) {
            if (0 > var11) {
              L1: while (true) {
                if ((param1 ^ -1L) >= -9L) {
                  L2: {
                    if (param1 <= 0L) {
                      var8 = 0;
                      break L2;
                    } else {
                      var8 = 255 & param2[var5] << var6;
                      ((wa) this).field_c[((wa) this).field_a] = (byte)ne.a((int) ((wa) this).field_c[((wa) this).field_a], var8 >>> var7);
                      break L2;
                    }
                  }
                  L3: {
                    if (8L > param1 + (long)var7) {
                      ((wa) this).field_o = (int)((long)((wa) this).field_o + param1);
                      break L3;
                    } else {
                      L4: {
                        ((wa) this).field_o = ((wa) this).field_o + (-var7 + 8);
                        param1 = param1 - (long)(8 + -var7);
                        ((wa) this).field_a = ((wa) this).field_a + 1;
                        if (512 == ((wa) this).field_o) {
                          this.a((byte) -128);
                          ((wa) this).field_a = 0;
                          ((wa) this).field_o = 0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      ((wa) this).field_c[((wa) this).field_a] = (byte)sc.a(var8 << -var7 + 8, 255);
                      ((wa) this).field_o = ((wa) this).field_o + (int)param1;
                      break L3;
                    }
                  }
                  return;
                } else {
                  L5: {
                    var8 = param2[var5] << var6 & 255 | (param2[1 + var5] & 255) >>> -var6 + 8;
                    if ((var8 ^ -1) > -1) {
                      break L5;
                    } else {
                      if (var8 >= 256) {
                        break L5;
                      } else {
                        L6: {
                          ((wa) this).field_c[((wa) this).field_a] = (byte)ne.a((int) ((wa) this).field_c[((wa) this).field_a], var8 >>> var7);
                          ((wa) this).field_a = ((wa) this).field_a + 1;
                          ((wa) this).field_o = ((wa) this).field_o + (8 + -var7);
                          if ((((wa) this).field_o ^ -1) != -513) {
                            break L6;
                          } else {
                            this.a((byte) -125);
                            ((wa) this).field_a = 0;
                            ((wa) this).field_o = 0;
                            break L6;
                          }
                        }
                        ((wa) this).field_c[((wa) this).field_a] = (byte)sc.a(var8 << -var7 + 8, 255);
                        param1 = param1 - 8L;
                        ((wa) this).field_o = ((wa) this).field_o + var7;
                        var5++;
                        continue L1;
                      }
                    }
                  }
                  throw new RuntimeException("LOGIC ERROR");
                }
              }
            } else {
              var12 = var12 + (((int)var9 & 255) + (255 & ((wa) this).field_n[var11]));
              ((wa) this).field_n[var11] = (byte)var12;
              var9 = var9 >>> 8;
              var12 = var12 >>> 8;
              var11--;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_k = null;
        field_p = null;
        field_d = null;
        if (param0 != -1731) {
            return;
        }
        field_f = null;
        field_g = null;
        field_q = null;
    }

    final void a(byte[] param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        L0: {
          var8 = fleas.field_A ? 1 : 0;
          ((wa) this).field_c[((wa) this).field_a] = (byte)ne.a((int) ((wa) this).field_c[((wa) this).field_a], 128 >>> sc.a(7, ((wa) this).field_o));
          ((wa) this).field_a = ((wa) this).field_a + 1;
          if ((((wa) this).field_a ^ -1) < -33) {
            L1: while (true) {
              if (-65 >= (((wa) this).field_a ^ -1)) {
                this.a((byte) -115);
                ((wa) this).field_a = 0;
                break L0;
              } else {
                int fieldTemp$2 = ((wa) this).field_a;
                ((wa) this).field_a = ((wa) this).field_a + 1;
                ((wa) this).field_c[fieldTemp$2] = (byte) 0;
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        L2: {
          if (param2 == -85) {
            break L2;
          } else {
            ((wa) this).field_h = null;
            break L2;
          }
        }
        L3: while (true) {
          if (32 <= ((wa) this).field_a) {
            dm.a(((wa) this).field_n, 0, ((wa) this).field_c, 32, 32);
            this.a((byte) -117);
            var4 = 0;
            var5 = param1;
            L4: while (true) {
              if (-9 >= (var4 ^ -1)) {
                return;
              } else {
                var6 = ((wa) this).field_j[var4];
                param0[var5] = (byte)(int)(var6 >>> 538960760);
                param0[1 + var5] = (byte)(int)(var6 >>> 1954047344);
                param0[var5 + 2] = (byte)(int)(var6 >>> -1796767512);
                param0[var5 - -3] = (byte)(int)(var6 >>> 636793824);
                param0[4 + var5] = (byte)(int)(var6 >>> 757218776);
                param0[var5 - -5] = (byte)(int)(var6 >>> -1341704880);
                param0[6 + var5] = (byte)(int)(var6 >>> -850735352);
                param0[7 + var5] = (byte)(int)var6;
                var4++;
                var5 += 8;
                continue L4;
              }
            }
          } else {
            int fieldTemp$3 = ((wa) this).field_a;
            ((wa) this).field_a = ((wa) this).field_a + 1;
            ((wa) this).field_c[fieldTemp$3] = (byte) 0;
            continue L3;
          }
        }
    }

    final static void a(boolean param0, boolean param1, int param2) {
        int var3 = -32 / ((-43 - param2) / 32);
        Object var4 = null;
        fl.a(param1, param0, (String) null, -22175);
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = fleas.field_A ? 1 : 0;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (-9 >= (var2 ^ -1)) {
            var2 = 0;
            L1: while (true) {
              if ((var2 ^ -1) <= -9) {
                var2 = 1;
                L2: while (true) {
                  if (10 < var2) {
                    L3: {
                      if (param0 < -86) {
                        break L3;
                      } else {
                        wa.a(31);
                        break L3;
                      }
                    }
                    var2 = 0;
                    L4: while (true) {
                      if (8 <= var2) {
                        return;
                      } else {
                        ((wa) this).field_j[var2] = ik.a(((wa) this).field_j[var2], ik.a(((wa) this).field_h[var2], ((wa) this).field_i[var2]));
                        var2++;
                        continue L4;
                      }
                    }
                  } else {
                    var3 = 0;
                    L5: while (true) {
                      if ((var3 ^ -1) <= -9) {
                        var3 = 0;
                        L6: while (true) {
                          if (var3 >= 8) {
                            ((wa) this).field_b[0] = ik.a(((wa) this).field_b[0], td.field_c[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if (var3 >= 8) {
                                var3 = 0;
                                L8: while (true) {
                                  if (var3 >= 8) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    ((wa) this).field_h[var3] = ((wa) this).field_e[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                ((wa) this).field_e[var3] = ((wa) this).field_b[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L9: while (true) {
                                  if (var7 >= 8) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    ((wa) this).field_e[var3] = ik.a(((wa) this).field_e[var3], td.field_f[var7][sc.a((int)(((wa) this).field_h[sc.a(var3 + -var7, 7)] >>> var5), 255)]);
                                    var5 -= 8;
                                    var7++;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            ((wa) this).field_b[var3] = ((wa) this).field_e[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        ((wa) this).field_e[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if ((var4 ^ -1) <= -9) {
                            var3++;
                            continue L5;
                          } else {
                            ((wa) this).field_e[var3] = ik.a(((wa) this).field_e[var3], td.field_f[var4][sc.a(255, (int)(((wa) this).field_b[sc.a(var3 + -var4, 7)] >>> var5))]);
                            var4++;
                            var5 -= 8;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                ((wa) this).field_b[var2] = ((wa) this).field_j[var2];
                ((wa) this).field_h[var2] = ik.a(((wa) this).field_i[var2], ((wa) this).field_j[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((wa) this).field_i[var2] = ik.a(ik.a(re.a((long)((wa) this).field_c[6 + var3], 255L) << -591758840, ik.a(re.a((long)((wa) this).field_c[var3 + 5] << 290890832, 16711680L), ik.a(ik.a(re.a(255L, (long)((wa) this).field_c[3 + var3]) << 1641855392, ik.a(ik.a(re.a((long)((wa) this).field_c[1 + var3], 255L) << -1955081744, (long)((wa) this).field_c[var3] << -2134972424), re.a(255L, (long)((wa) this).field_c[2 + var3]) << -638846808)), re.a(255L, (long)((wa) this).field_c[4 + var3]) << 2080686232))), re.a((long)((wa) this).field_c[7 + var3], 255L));
            var3 += 8;
            var2++;
            continue L0;
          }
        }
    }

    wa() {
        ((wa) this).field_a = 0;
        ((wa) this).field_n = new byte[32];
        ((wa) this).field_i = new long[8];
        ((wa) this).field_j = new long[8];
        ((wa) this).field_e = new long[8];
        ((wa) this).field_c = new byte[64];
        ((wa) this).field_h = new long[8];
        ((wa) this).field_b = new long[8];
        ((wa) this).field_o = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new uj(3);
        field_p = "<%0>One-touch wall:<%1> Acts like a normal wall, but are destroyed after being touched once, from the side, by a flea.";
        field_f = new String[]{"Flea to the Circus", "Circus Performer", "Circus Act", "Circus Master", "Golden Fleas", "Master Flea", "Flea while you still can", "Lord of the Fleas", "Flea Lunch", "Fleadom", "Flea over troubled waters", "Frequent flea-er", "Sensi-flea", "Thought-flea", "Flea thinker", "Philoso-flea"};
        field_q = "If you do nothing the game will revert to normal view in <%0> second.";
        field_d = "Blocks can be used to bridge gaps or to block ways you don't want the fleas to go. Slopes can be chained together to help fleas reach new areas of the level. Fleas are very tough, and don't die if they fall too far. Be careful however: there are many ways for a flea to die!";
    }
}
