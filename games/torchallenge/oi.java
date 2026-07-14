/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi extends of {
    static boolean field_g;
    static int field_j;
    private java.nio.ByteBuffer field_i;
    static String field_h;

    final byte[] c(int param0) {
        byte[] var3 = new byte[((oi) this).field_i.capacity()];
        byte[] var2 = var3;
        if (param0 != 2) {
            byte[] discarded$0 = ((oi) this).c(-92);
        }
        java.nio.Buffer discarded$1 = ((oi) this).field_i.position(0);
        java.nio.ByteBuffer discarded$2 = ((oi) this).field_i.get(var3);
        return var3;
    }

    final static void a(boolean param0, boolean param1, boolean param2) {
        int var3 = 0;
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
        L0: {
          var15 = TorChallenge.field_F ? 1 : 0;
          if (!gh.field_x) {
            pi.field_d[vj.field_c][ea.field_e] = p.a(pi.field_d[vj.field_c][ea.field_e], vi.field_a);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (gh.field_x) {
            if (!gh.field_x) {
              break L1;
            } else {
              hk.field_c[vj.field_c] = p.a(hk.field_c[vj.field_c], 1 << -6 + ea.field_e);
              qi.a(false);
              break L1;
            }
          } else {
            if (!gh.field_x) {
              break L1;
            } else {
              if (param0) {
                break L1;
              } else {
                hk.field_c[vj.field_c] = p.a(hk.field_c[vj.field_c], 1 << -6 + ea.field_e);
                qi.a(false);
                break L1;
              }
            }
          }
        }
        L2: {
          L3: {
            var3 = 28;
            if (null == hf.field_d) {
              break L3;
            } else {
              if (var3 <= hf.field_d.length) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          hf.field_d = null;
          hf.field_d = new byte[var3];
          break L2;
        }
        L4: {
          var4 = vj.field_c;
          var5 = 8 * var4;
          var6 = 0;
          if (param1) {
            break L4;
          } else {
            int discarded$1 = oi.a((byte) -108, 92);
            break L4;
          }
        }
        var7 = 0;
        var10 = 0;
        L5: while (true) {
          if (4 <= var10) {
            var10 = 0;
            L6: while (true) {
              if (var10 >= 4) {
                L7: {
                  var11 = 0;
                  var13 = ea.field_e + -6;
                  if (!gh.field_x) {
                    var14 = 0;
                    L8: while (true) {
                      if (wl.field_l[ea.field_e] <= var14) {
                        if (param0) {
                          break L7;
                        } else {
                          L9: {
                            var11 = 0;
                            var12 = k.field_b[var4];
                            if (-1 >= (uk.field_U[ea.field_e] ^ -1)) {
                              var12 = var12 << uk.field_U[ea.field_e];
                              break L9;
                            } else {
                              var12 = var12 >> -uk.field_U[ea.field_e];
                              break L9;
                            }
                          }
                          L10: {
                            if (-1 == (b.field_N[ea.field_e] ^ -1)) {
                              var10 = var6;
                              break L10;
                            } else {
                              var10 = var7;
                              break L10;
                            }
                          }
                          L11: {
                            var12 = var12 & nd.field_h[ea.field_e];
                            var10 = var10 & nd.field_h[ea.field_e];
                            if (0 == (var12 ^ var10)) {
                              break L11;
                            } else {
                              var11 = 1;
                              break L11;
                            }
                          }
                          L12: {
                            if ((ea.field_e + 1) % 2 != 0) {
                              break L12;
                            } else {
                              var11 = 0;
                              break L12;
                            }
                          }
                          L13: {
                            if (var11 != 0) {
                              var5 = 8 * var4 - -(b.field_N[ea.field_e] * 4);
                              hf.field_d[0 + var5] = (byte)p.a((int) hf.field_d[0 + var5], jh.a(var12, 255));
                              hf.field_d[1 + var5] = (byte)p.a((int) hf.field_d[1 + var5], jh.a(255, jh.a(65280, var12) >> -1267211576));
                              hf.field_d[2 + var5] = (byte)p.a((int) hf.field_d[2 + var5], jh.a(jh.a(16711680, var12), 16759179) >> -195707536);
                              hf.field_d[var5 - -3] = (byte)p.a((int) hf.field_d[var5 - -3], jh.a(255, jh.a(-16777216, var12) >> 317283480));
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                          var11 = 0;
                          break L7;
                        }
                      } else {
                        L14: {
                          var12 = pi.field_d[var4][ea.field_e];
                          if (-1 < (ra.field_p[ea.field_e][var14] ^ -1)) {
                            var12 = var12 >> -ra.field_p[ea.field_e][var14];
                            break L14;
                          } else {
                            var12 = var12 << ra.field_p[ea.field_e][var14];
                            break L14;
                          }
                        }
                        L15: {
                          var12 = al.field_A[ea.field_e][var14] & var12;
                          if (0 != lc.field_p[ea.field_e][var14]) {
                            var10 = var7;
                            break L15;
                          } else {
                            var10 = var6;
                            break L15;
                          }
                        }
                        L16: {
                          var10 = var10 & al.field_A[ea.field_e][var14];
                          if (-1 == (var12 ^ var10 ^ -1)) {
                            break L16;
                          } else {
                            var11 = 1;
                            break L16;
                          }
                        }
                        L17: {
                          if (var11 == 0) {
                            break L17;
                          } else {
                            var5 = var4 * 8 - -(4 * lc.field_p[ea.field_e][var14]);
                            hf.field_d[var5 + 0] = (byte)p.a((int) hf.field_d[var5 + 0], jh.a(var12, 255));
                            hf.field_d[var5 + 1] = (byte)p.a((int) hf.field_d[var5 + 1], jh.a(jh.a(65280, var12) >> -1140173336, 255));
                            hf.field_d[2 + var5] = (byte)p.a((int) hf.field_d[2 + var5], jh.a(16741916, jh.a(16711680, var12)) >> -1211097232);
                            hf.field_d[3 + var5] = (byte)p.a((int) hf.field_d[3 + var5], jh.a(255, jh.a(var12 >> -1062740168, -1)));
                            break L17;
                          }
                        }
                        var11 = 0;
                        var14++;
                        continue L8;
                      }
                    }
                  } else {
                    break L7;
                  }
                }
                L18: {
                  if (!gh.field_x) {
                    break L18;
                  } else {
                    if (!param0) {
                      L19: {
                        var12 = hk.field_c[var4];
                        var11 = 0;
                        if (gb.field_c[var13] >= 0) {
                          var12 = var12 << gb.field_c[var13];
                          break L19;
                        } else {
                          var12 = var12 >> -gb.field_c[var13];
                          break L19;
                        }
                      }
                      L20: {
                        if (pd.field_f[var13] == 0) {
                          var10 = var6;
                          break L20;
                        } else {
                          var10 = var7;
                          break L20;
                        }
                      }
                      L21: {
                        var12 = var12 & rf.field_jb[var13];
                        var10 = var10 & rf.field_jb[var13];
                        if (0 != (var12 ^ var10)) {
                          var11 = 1;
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      L22: {
                        if (var11 != 0) {
                          var5 = pd.field_f[var13] * 4 + 8 * var4;
                          hf.field_d[var5 + 0] = (byte)p.a((int) hf.field_d[var5 + 0], jh.a(255, var12));
                          hf.field_d[var5 - -1] = (byte)p.a((int) hf.field_d[var5 - -1], jh.a(jh.a(var12, 65280), 65479) >> -606540440);
                          hf.field_d[var5 - -2] = (byte)p.a((int) hf.field_d[var5 - -2], jh.a(16744105, jh.a(16711680, var12)) >> 157865200);
                          hf.field_d[3 + var5] = (byte)p.a((int) hf.field_d[3 + var5], jh.a(jh.a(-16777216, var12) >> -28807240, 255));
                          break L22;
                        } else {
                          break L22;
                        }
                      }
                      var11 = 0;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                }
                L23: {
                  var11 = 0;
                  var5 = 24;
                  var6 = hf.field_d[var5] + ((hf.field_d[var5 - -1] << -1160340952) + ((hf.field_d[var5 + 2] << -561530064) + (hf.field_d[3 + var5] << -2046100552)));
                  if (gh.field_x) {
                    break L23;
                  } else {
                    L24: {
                      var12 = hd.field_c[var4];
                      if ((bj.field_a[var4] ^ -1) > -1) {
                        var12 = var12 >> -bj.field_a[var4];
                        break L24;
                      } else {
                        var12 = var12 << bj.field_a[var4];
                        break L24;
                      }
                    }
                    L25: {
                      var10 = var6;
                      var12 = oe.field_b[var4] & var12;
                      var10 = oe.field_b[var4] & var10;
                      if (-1 != (var12 ^ var10 ^ -1)) {
                        var11 = 1;
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                    L26: {
                      if (var11 != 0) {
                        var5 = 4 * oe.field_a[var4] + 24;
                        hf.field_d[0 + var5] = (byte)p.a((int) hf.field_d[0 + var5], jh.a(var12, 255));
                        hf.field_d[1 + var5] = (byte)p.a((int) hf.field_d[1 + var5], jh.a(65506, jh.a(65280, var12)) >> -1025894552);
                        hf.field_d[2 + var5] = (byte)p.a((int) hf.field_d[2 + var5], jh.a(jh.a(var12 >> -1882915888, 255), 255));
                        hf.field_d[var5 - -3] = (byte)p.a((int) hf.field_d[var5 - -3], jh.a(255, jh.a(-16777216, var12) >> 547759128));
                        break L26;
                      } else {
                        break L26;
                      }
                    }
                    var11 = 0;
                    break L23;
                  }
                }
                if (!param2) {
                  return;
                } else {
                  L27: {
                    if (bh.field_p) {
                      break L27;
                    } else {
                      if (!d.p(-113)) {
                        wj.field_b.a((da) (Object) new eh(hf.field_d), -50);
                        break L27;
                      } else {
                        break L27;
                      }
                    }
                  }
                  return;
                }
              } else {
                L28: {
                  var8 = 0;
                  var9 = 0;
                  var8 = var8 | hf.field_d[var10 + var5 + 4];
                  if (0 == var10) {
                    var9 = 255;
                    break L28;
                  } else {
                    if (-2 != (var10 ^ -1)) {
                      if (var10 == -3) {
                        var9 = 16711680;
                        break L28;
                      } else {
                        if (-4 != var10) {
                          break L28;
                        } else {
                          var9 = -16777216;
                          break L28;
                        }
                      }
                    } else {
                      var9 = 65280;
                      break L28;
                    }
                  }
                }
                var7 = var7 | (255 & var8) << var10 * 8 & var9;
                var10++;
                continue L6;
              }
            }
          } else {
            L29: {
              var8 = 0;
              var9 = 0;
              if (var10 == 0) {
                var9 = 255;
                break L29;
              } else {
                if (1 != var10) {
                  if (2 == var10) {
                    var9 = 16711680;
                    break L29;
                  } else {
                    if ((var10 ^ -1) == -4) {
                      var9 = -16777216;
                      break L29;
                    } else {
                      var8 = var8 | hf.field_d[var5 + var10];
                      var6 = var6 | (255 & var8) << 8 * var10 & var9;
                      var10++;
                      continue L5;
                    }
                  }
                } else {
                  var9 = 65280;
                  break L29;
                }
              }
            }
            var8 = var8 | hf.field_d[var5 + var10];
            var6 = var6 | (255 & var8) << 8 * var10 & var9;
            var10++;
            continue L5;
          }
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        if (!param2) {
            oi.a(true, true, true);
        }
        qa.field_f = param1;
        ai.field_d = param0;
        lg.field_f = param3;
    }

    final static int a(byte param0, int param1) {
        int var7 = 0;
        int var6 = 0;
        int var5 = 0;
        int var8 = TorChallenge.field_F ? 1 : 0;
        int var2 = ra.field_j[0];
        if (!(param1 != var2)) {
            return 0;
        }
        int[][][] var3 = pa.field_v;
        int var4 = -1;
        var4 = 0;
        if (param0 >= -31) {
            int discarded$0 = oi.a((byte) 8, -19);
        }
        while ((var4 ^ -1) >= -3) {
            var7 = var3[var4][0][3];
            var6 = var3[var4][0][2];
            for (var5 = var6; var5 <= var7; var5++) {
                if (!(param1 != var5)) {
                    return var4;
                }
            }
            var4++;
        }
        return -1;
    }

    final void a(int param0, byte[] param1) {
        ((oi) this).field_i = java.nio.ByteBuffer.allocateDirect(param1.length);
        java.nio.Buffer discarded$12 = ((oi) this).field_i.position(0);
        java.nio.ByteBuffer discarded$19 = ((oi) this).field_i.put(param1);
        if (param0 != 50) {
            oi.d(-112);
        }
    }

    public static void d(int param0) {
        field_h = null;
        if (param0 != 10166) {
            field_g = true;
        }
    }

    oi() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Score: ";
        field_g = false;
    }
}
