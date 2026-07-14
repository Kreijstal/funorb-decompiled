/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd {
    private gb field_f;
    static bd field_a;
    static boolean field_d;
    private gb field_c;
    static String field_g;
    static int field_h;
    private jm field_b;
    private jm field_e;

    private final jb a(int[] param0, int param1, int param2, byte param3) {
        qf var9_ref = null;
        int var5 = param2 ^ (param1 >>> -1126962644 | (-1610608641 & param1) << 1158547780);
        var5 = var5 | param1 << -1119876656;
        long var6 = (long)var5 ^ 4294967296L;
        jb var8 = (jb) (Object) ((rd) this).field_e.a(false, var6);
        if (!(var8 == null)) {
            return var8;
        }
        if (param0 != null) {
            if (0 >= param0[0]) {
                return null;
            }
        }
        qf var9 = (qf) (Object) ((rd) this).field_b.a(false, var6);
        if (var9 == null) {
            var9_ref = qf.a(((rd) this).field_c, param1, param2);
            if (var9_ref == null) {
                return null;
            }
            ((rd) this).field_b.a(-122, var6, (am) (Object) var9_ref);
        }
        jb var8_ref = var9_ref.a(param0);
        if (param3 != 97) {
            return null;
        }
        if (var8_ref == null) {
            return null;
        }
        var9_ref.b(126);
        ((rd) this).field_e.a(param3 ^ -21, var6, (am) (Object) var8_ref);
        return var8_ref;
    }

    private final jb a(int param0, int param1, int[] param2, int param3) {
        int var5 = param3 ^ ((-1879044097 & param1) << 58583140 | param1 >>> 1335754348);
        var5 = var5 | param1 << -1217036240;
        long var6 = (long)var5;
        jb var8 = (jb) (Object) ((rd) this).field_e.a(false, var6);
        if (var8 != null) {
            return var8;
        }
        if (param2 != null) {
            if ((param2[0] ^ -1) >= -1) {
                return null;
            }
        }
        va var9 = va.a(((rd) this).field_f, param1, param3);
        if (var9 == null) {
            return null;
        }
        jb var11 = var9.a();
        jb var8_ref = var11;
        ((rd) this).field_e.a(-107, var6, (am) (Object) var8_ref);
        if (!(param2 == null)) {
            param2[0] = param2[0] - var11.field_k.length;
        }
        int var10 = -41 % ((param0 - -60) / 44);
        return var8_ref;
    }

    final jb a(byte param0, int[] param1, int param2) {
        if (param0 >= -22) {
            return null;
        }
        if (!(1 != ((rd) this).field_c.f(-120))) {
            return this.a(param1, 0, param2, (byte) 97);
        }
        if (1 == ((rd) this).field_c.c(0, param2)) {
            return this.a(param1, param2, 0, (byte) 97);
        }
        throw new RuntimeException();
    }

    final jb a(int[] param0, int param1, int param2) {
        if (!(-2 != (((rd) this).field_f.f(-114) ^ -1))) {
            return this.a(-117, 0, param0, param2);
        }
        if (param1 != 128) {
            Object var5 = null;
            jb discarded$0 = this.a(44, 65, (int[]) null, 71);
        }
        if (((rd) this).field_f.c(0, param2) == 1) {
            return this.a(param1 + -76, param2, param0, 0);
        }
        throw new RuntimeException();
    }

    public static void b(int param0) {
        if (param0 != 1) {
            return;
        }
        field_a = null;
        field_g = null;
    }

    final static void a(boolean param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        oj var5 = null;
        oc var6_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        oc var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        boolean[] var16 = null;
        boolean[] var17 = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        boolean[] var29 = null;
        boolean[] var34 = null;
        boolean[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        boolean[] var43 = null;
        boolean[] var44 = null;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_14_3 = 0;
        int stackIn_115_0 = 0;
        int stackIn_115_1 = 0;
        int stackIn_115_2 = 0;
        int stackIn_115_3 = 0;
        int stackIn_115_4 = 0;
        int stackIn_116_0 = 0;
        int stackIn_116_1 = 0;
        int stackIn_116_2 = 0;
        int stackIn_116_3 = 0;
        int stackIn_116_4 = 0;
        int stackIn_117_0 = 0;
        int stackIn_117_1 = 0;
        int stackIn_117_2 = 0;
        int stackIn_117_3 = 0;
        int stackIn_117_4 = 0;
        int stackIn_117_5 = 0;
        int stackIn_118_0 = 0;
        int stackIn_118_1 = 0;
        int stackIn_118_2 = 0;
        int stackIn_118_3 = 0;
        int stackIn_118_4 = 0;
        int stackIn_119_0 = 0;
        int stackIn_119_1 = 0;
        int stackIn_119_2 = 0;
        int stackIn_119_3 = 0;
        int stackIn_119_4 = 0;
        int stackIn_120_0 = 0;
        int stackIn_120_1 = 0;
        int stackIn_120_2 = 0;
        int stackIn_120_3 = 0;
        int stackIn_120_4 = 0;
        int stackIn_120_5 = 0;
        int stackIn_121_0 = 0;
        int stackIn_121_1 = 0;
        int stackIn_121_2 = 0;
        int stackIn_121_3 = 0;
        int stackIn_121_4 = 0;
        int stackIn_122_0 = 0;
        int stackIn_122_1 = 0;
        int stackIn_122_2 = 0;
        int stackIn_122_3 = 0;
        int stackIn_122_4 = 0;
        int stackIn_123_0 = 0;
        int stackIn_123_1 = 0;
        int stackIn_123_2 = 0;
        int stackIn_123_3 = 0;
        int stackIn_123_4 = 0;
        int stackIn_123_5 = 0;
        int stackIn_139_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        int stackOut_114_0 = 0;
        int stackOut_114_1 = 0;
        int stackOut_114_2 = 0;
        int stackOut_114_3 = 0;
        int stackOut_114_4 = 0;
        int stackOut_116_0 = 0;
        int stackOut_116_1 = 0;
        int stackOut_116_2 = 0;
        int stackOut_116_3 = 0;
        int stackOut_116_4 = 0;
        int stackOut_116_5 = 0;
        int stackOut_115_0 = 0;
        int stackOut_115_1 = 0;
        int stackOut_115_2 = 0;
        int stackOut_115_3 = 0;
        int stackOut_115_4 = 0;
        int stackOut_115_5 = 0;
        int stackOut_117_0 = 0;
        int stackOut_117_1 = 0;
        int stackOut_117_2 = 0;
        int stackOut_117_3 = 0;
        int stackOut_117_4 = 0;
        int stackOut_119_0 = 0;
        int stackOut_119_1 = 0;
        int stackOut_119_2 = 0;
        int stackOut_119_3 = 0;
        int stackOut_119_4 = 0;
        int stackOut_119_5 = 0;
        int stackOut_118_0 = 0;
        int stackOut_118_1 = 0;
        int stackOut_118_2 = 0;
        int stackOut_118_3 = 0;
        int stackOut_118_4 = 0;
        int stackOut_118_5 = 0;
        int stackOut_120_0 = 0;
        int stackOut_120_1 = 0;
        int stackOut_120_2 = 0;
        int stackOut_120_3 = 0;
        int stackOut_120_4 = 0;
        int stackOut_122_0 = 0;
        int stackOut_122_1 = 0;
        int stackOut_122_2 = 0;
        int stackOut_122_3 = 0;
        int stackOut_122_4 = 0;
        int stackOut_122_5 = 0;
        int stackOut_121_0 = 0;
        int stackOut_121_1 = 0;
        int stackOut_121_2 = 0;
        int stackOut_121_3 = 0;
        int stackOut_121_4 = 0;
        int stackOut_121_5 = 0;
        int stackOut_137_0 = 0;
        int stackOut_136_0 = 0;
        int stackOut_134_0 = 0;
        L0: {
          var24 = HostileSpawn.field_I ? 1 : 0;
          if (!param0) {
            break L0;
          } else {
            field_h = -14;
            break L0;
          }
        }
        L1: {
          pf.field_I = null;
          if ((5 & el.field_m) == 0) {
            ri.field_h = -1;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var1 = ln.field_a.field_d;
          var2 = ln.field_a.field_n;
          var3 = uj.field_p.field_e;
          var4 = uj.field_p.field_g;
          if (1 == ln.field_a.field_m) {
            si.d();
            break L2;
          } else {
            uf.field_i[4].c(-24 + -var3 / 16, -var4 / 16 + -24);
            break L2;
          }
        }
        L3: {
          stackOut_8_0 = qa.field_b;
          stackIn_10_0 = stackOut_8_0;
          stackIn_9_0 = stackOut_8_0;
          if (80 > qa.field_b) {
            stackOut_10_0 = stackIn_10_0;
            stackOut_10_1 = 0;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            break L3;
          } else {
            stackOut_9_0 = stackIn_9_0;
            stackOut_9_1 = -80 + qa.field_b;
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            break L3;
          }
        }
        L4: {
          stackOut_11_0 = stackIn_11_0;
          stackOut_11_1 = stackIn_11_1;
          stackOut_11_2 = 640 + -qa.field_b;
          stackIn_13_0 = stackOut_11_0;
          stackIn_13_1 = stackOut_11_1;
          stackIn_13_2 = stackOut_11_2;
          stackIn_12_0 = stackOut_11_0;
          stackIn_12_1 = stackOut_11_1;
          stackIn_12_2 = stackOut_11_2;
          if (qa.field_b < 80) {
            stackOut_13_0 = stackIn_13_0;
            stackOut_13_1 = stackIn_13_1;
            stackOut_13_2 = stackIn_13_2;
            stackOut_13_3 = 480;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            stackIn_14_2 = stackOut_13_2;
            stackIn_14_3 = stackOut_13_3;
            break L4;
          } else {
            stackOut_12_0 = stackIn_12_0;
            stackOut_12_1 = stackIn_12_1;
            stackOut_12_2 = stackIn_12_2;
            stackOut_12_3 = 80 + (-qa.field_b + 480);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_14_2 = stackOut_12_2;
            stackIn_14_3 = stackOut_12_3;
            break L4;
          }
        }
        L5: {
          L6: {
            si.d(stackIn_14_0, stackIn_14_1, stackIn_14_2, stackIn_14_3);
            var5 = mm.field_m[0];
            if (hg.field_e != 1) {
              uf.field_i[4].c(-(uf.field_i[4].field_z / 2) + 320, 240 + -(uf.field_i[4].field_A / 2));
              break L6;
            } else {
              L7: {
                var6_ref = new oc();
                ln.field_a.a(-2, 1);
                var10 = var5.field_j;
                if (jf.field_c == 0) {
                  L8: {
                    var11 = var10.field_e;
                    var12 = var10.field_g;
                    if (-6 != (ha.field_t ^ -1)) {
                      L9: {
                        if (-7 != ha.field_t) {
                          break L9;
                        } else {
                          if (var11 < nh.field_E.field_e) {
                            break L9;
                          } else {
                            if (nh.field_E.field_g > var12) {
                              break L9;
                            } else {
                              if (nh.field_E.field_e - -2 < var11) {
                                break L9;
                              } else {
                                if (var12 > 2 + nh.field_E.field_g) {
                                  break L9;
                                } else {
                                  kd.a(9, 1);
                                  break L8;
                                }
                              }
                            }
                          }
                        }
                      }
                      L10: {
                        L11: {
                          if (-1 != (ha.field_t ^ -1)) {
                            break L11;
                          } else {
                            if (var11 < nh.field_E.field_e) {
                              break L11;
                            } else {
                              if (var12 < nh.field_E.field_g) {
                                break L11;
                              } else {
                                if (nh.field_E.field_e - -2 < var11) {
                                  break L11;
                                } else {
                                  if (var12 <= 2 + nh.field_E.field_g) {
                                    break L10;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                            }
                          }
                        }
                        if (-15 != (ha.field_t ^ -1)) {
                          break L8;
                        } else {
                          if (nh.field_E.field_e > var11) {
                            break L8;
                          } else {
                            if (var12 < -3 + nh.field_E.field_g) {
                              break L8;
                            } else {
                              if (var11 > nh.field_E.field_e + 4) {
                                break L8;
                              } else {
                                if (var12 <= 4 + nh.field_E.field_g) {
                                  break L10;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                        }
                      }
                      if (bm.field_c == 0) {
                        L12: {
                          if (-1 != rl.field_c) {
                            break L12;
                          } else {
                            if (!bj.field_a) {
                              bj.field_a = true;
                              break L8;
                            } else {
                              break L12;
                            }
                          }
                        }
                        L13: {
                          if (-2 != rl.field_c) {
                            break L13;
                          } else {
                            if (!tg.field_a) {
                              tg.field_a = true;
                              break L8;
                            } else {
                              break L13;
                            }
                          }
                        }
                        if ((rl.field_c ^ -1) == -10) {
                          mf.a(false, 3);
                          ti.a(253, (byte) -122, 2);
                          break L8;
                        } else {
                          if (2 == rl.field_c) {
                            mf.a(false, 2);
                            ti.a(255, (byte) -112, 0);
                            break L8;
                          } else {
                            mf.a(false, 2);
                            if (6 != rl.field_c) {
                              break L8;
                            } else {
                              ti.a(254, (byte) -10, 1);
                              break L8;
                            }
                          }
                        }
                      } else {
                        break L8;
                      }
                    } else {
                      L14: {
                        var13 = var11 - nh.field_E.field_e;
                        if (0 > var13) {
                          var13 = -var13;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      var14 = var12 + -nh.field_E.field_g;
                      if ((var14 ^ -1) <= -1) {
                        if ((var13 ^ -1) <= -11) {
                          break L8;
                        } else {
                          if ((var14 ^ -1) <= -11) {
                            break L8;
                          } else {
                            kd.a(6, 1);
                            break L8;
                          }
                        }
                      } else {
                        if ((var13 ^ -1) <= -11) {
                          break L8;
                        } else {
                          if ((var14 ^ -1) <= -11) {
                            break L8;
                          } else {
                            kd.a(6, 1);
                            break L8;
                          }
                        }
                      }
                    }
                  }
                  if (eh.field_g > 0) {
                    break L7;
                  } else {
                    L15: {
                      if (4 <= mc.field_I) {
                        break L15;
                      } else {
                        eh.field_c.a(fg.field_b[17], 100, 2 * uh.field_i);
                        break L15;
                      }
                    }
                    mf.a(false, 4);
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              L16: {
                var11 = var3 / 24;
                var12 = -1 + var4 / 24;
                var14 = 20 + var12 + 1;
                var13 = 2 + var11 + 26;
                if (var12 <= 0) {
                  var12 = 1;
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                if (var1 - 1 <= var14) {
                  var14 = var1 + -2;
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if (var13 >= -1 + var1) {
                  var13 = -2 + var1;
                  break L18;
                } else {
                  break L18;
                }
              }
              L19: {
                if (var11 > 0) {
                  break L19;
                } else {
                  var11 = 1;
                  break L19;
                }
              }
              var41 = ln.field_a.field_y;
              var44 = ln.field_a.field_B;
              var39 = var44;
              var34 = var39;
              var29 = var34;
              var16 = var29;
              var17 = ln.field_a.field_r;
              var40 = ln.field_a.field_o;
              var43 = ln.field_a.field_e;
              var20 = var12;
              L20: while (true) {
                if (var20 > var14) {
                  var9 = 0;
                  var8 = 0;
                  var42 = ln.field_a.field_u;
                  var6_ref.field_g = var12;
                  L21: while (true) {
                    if (var14 < var6_ref.field_g) {
                      L22: {
                        L23: {
                          lg.a(var4, 0, 0, var3);
                          bi.a(var4, -457, var42, var3);
                          gn.a(var4, var8, var3, 101, var9, var43, var44);
                          if (14 == ul.field_L) {
                            break L23;
                          } else {
                            if (!tg.field_a) {
                              break L22;
                            } else {
                              if (of.field_d == dn.field_i) {
                                break L22;
                              } else {
                                break L23;
                              }
                            }
                          }
                        }
                        L24: {
                          var21 = 688 + -var3;
                          var22 = 560 + -var4;
                          stackOut_114_0 = var21;
                          stackOut_114_1 = var22;
                          stackOut_114_2 = 64;
                          stackOut_114_3 = 64;
                          stackOut_114_4 = 16776960;
                          stackIn_116_0 = stackOut_114_0;
                          stackIn_116_1 = stackOut_114_1;
                          stackIn_116_2 = stackOut_114_2;
                          stackIn_116_3 = stackOut_114_3;
                          stackIn_116_4 = stackOut_114_4;
                          stackIn_115_0 = stackOut_114_0;
                          stackIn_115_1 = stackOut_114_1;
                          stackIn_115_2 = stackOut_114_2;
                          stackIn_115_3 = stackOut_114_3;
                          stackIn_115_4 = stackOut_114_4;
                          if (ca.field_c >= 256) {
                            stackOut_116_0 = stackIn_116_0;
                            stackOut_116_1 = stackIn_116_1;
                            stackOut_116_2 = stackIn_116_2;
                            stackOut_116_3 = stackIn_116_3;
                            stackOut_116_4 = stackIn_116_4;
                            stackOut_116_5 = 512 - ca.field_c;
                            stackIn_117_0 = stackOut_116_0;
                            stackIn_117_1 = stackOut_116_1;
                            stackIn_117_2 = stackOut_116_2;
                            stackIn_117_3 = stackOut_116_3;
                            stackIn_117_4 = stackOut_116_4;
                            stackIn_117_5 = stackOut_116_5;
                            break L24;
                          } else {
                            stackOut_115_0 = stackIn_115_0;
                            stackOut_115_1 = stackIn_115_1;
                            stackOut_115_2 = stackIn_115_2;
                            stackOut_115_3 = stackIn_115_3;
                            stackOut_115_4 = stackIn_115_4;
                            stackOut_115_5 = ca.field_c;
                            stackIn_117_0 = stackOut_115_0;
                            stackIn_117_1 = stackOut_115_1;
                            stackIn_117_2 = stackOut_115_2;
                            stackIn_117_3 = stackOut_115_3;
                            stackIn_117_4 = stackOut_115_4;
                            stackIn_117_5 = stackOut_115_5;
                            break L24;
                          }
                        }
                        L25: {
                          si.e(stackIn_117_0, stackIn_117_1, stackIn_117_2, stackIn_117_3, stackIn_117_4, stackIn_117_5 >> -109076927);
                          var23 = 511 & ca.field_c + 64;
                          stackOut_117_0 = 4 + var21;
                          stackOut_117_1 = 4 + var22;
                          stackOut_117_2 = 56;
                          stackOut_117_3 = 56;
                          stackOut_117_4 = 16776960;
                          stackIn_119_0 = stackOut_117_0;
                          stackIn_119_1 = stackOut_117_1;
                          stackIn_119_2 = stackOut_117_2;
                          stackIn_119_3 = stackOut_117_3;
                          stackIn_119_4 = stackOut_117_4;
                          stackIn_118_0 = stackOut_117_0;
                          stackIn_118_1 = stackOut_117_1;
                          stackIn_118_2 = stackOut_117_2;
                          stackIn_118_3 = stackOut_117_3;
                          stackIn_118_4 = stackOut_117_4;
                          if ((var23 ^ -1) > -257) {
                            stackOut_119_0 = stackIn_119_0;
                            stackOut_119_1 = stackIn_119_1;
                            stackOut_119_2 = stackIn_119_2;
                            stackOut_119_3 = stackIn_119_3;
                            stackOut_119_4 = stackIn_119_4;
                            stackOut_119_5 = var23;
                            stackIn_120_0 = stackOut_119_0;
                            stackIn_120_1 = stackOut_119_1;
                            stackIn_120_2 = stackOut_119_2;
                            stackIn_120_3 = stackOut_119_3;
                            stackIn_120_4 = stackOut_119_4;
                            stackIn_120_5 = stackOut_119_5;
                            break L25;
                          } else {
                            stackOut_118_0 = stackIn_118_0;
                            stackOut_118_1 = stackIn_118_1;
                            stackOut_118_2 = stackIn_118_2;
                            stackOut_118_3 = stackIn_118_3;
                            stackOut_118_4 = stackIn_118_4;
                            stackOut_118_5 = 512 - var23;
                            stackIn_120_0 = stackOut_118_0;
                            stackIn_120_1 = stackOut_118_1;
                            stackIn_120_2 = stackOut_118_2;
                            stackIn_120_3 = stackOut_118_3;
                            stackIn_120_4 = stackOut_118_4;
                            stackIn_120_5 = stackOut_118_5;
                            break L25;
                          }
                        }
                        L26: {
                          si.e(stackIn_120_0, stackIn_120_1, stackIn_120_2, stackIn_120_3, stackIn_120_4, stackIn_120_5 >> -147454815);
                          var23 = var23 + 64 & 511;
                          stackOut_120_0 = var21 + 8;
                          stackOut_120_1 = 8 + var22;
                          stackOut_120_2 = 48;
                          stackOut_120_3 = 48;
                          stackOut_120_4 = 16776960;
                          stackIn_122_0 = stackOut_120_0;
                          stackIn_122_1 = stackOut_120_1;
                          stackIn_122_2 = stackOut_120_2;
                          stackIn_122_3 = stackOut_120_3;
                          stackIn_122_4 = stackOut_120_4;
                          stackIn_121_0 = stackOut_120_0;
                          stackIn_121_1 = stackOut_120_1;
                          stackIn_121_2 = stackOut_120_2;
                          stackIn_121_3 = stackOut_120_3;
                          stackIn_121_4 = stackOut_120_4;
                          if (var23 < 256) {
                            stackOut_122_0 = stackIn_122_0;
                            stackOut_122_1 = stackIn_122_1;
                            stackOut_122_2 = stackIn_122_2;
                            stackOut_122_3 = stackIn_122_3;
                            stackOut_122_4 = stackIn_122_4;
                            stackOut_122_5 = var23;
                            stackIn_123_0 = stackOut_122_0;
                            stackIn_123_1 = stackOut_122_1;
                            stackIn_123_2 = stackOut_122_2;
                            stackIn_123_3 = stackOut_122_3;
                            stackIn_123_4 = stackOut_122_4;
                            stackIn_123_5 = stackOut_122_5;
                            break L26;
                          } else {
                            stackOut_121_0 = stackIn_121_0;
                            stackOut_121_1 = stackIn_121_1;
                            stackOut_121_2 = stackIn_121_2;
                            stackOut_121_3 = stackIn_121_3;
                            stackOut_121_4 = stackIn_121_4;
                            stackOut_121_5 = -var23 + 512;
                            stackIn_123_0 = stackOut_121_0;
                            stackIn_123_1 = stackOut_121_1;
                            stackIn_123_2 = stackOut_121_2;
                            stackIn_123_3 = stackOut_121_3;
                            stackIn_123_4 = stackOut_121_4;
                            stackIn_123_5 = stackOut_121_5;
                            break L26;
                          }
                        }
                        si.e(stackIn_123_0, stackIn_123_1, stackIn_123_2, stackIn_123_3, stackIn_123_4, stackIn_123_5 >> -1633242975);
                        break L22;
                      }
                      L27: {
                        if (vj.field_g != -2) {
                          if (-3 != vj.field_g) {
                            break L27;
                          } else {
                            ad.a((byte) -118);
                            break L27;
                          }
                        } else {
                          lf.a((byte) -122);
                          break L27;
                        }
                      }
                      L28: {
                        vf.a(var1, var2, var11, 28, var12, var14, var13);
                        lg.a(var4, 0, 1, var3);
                        ih.a(-15587, var1);
                        nj.a(11178);
                        nm.a(var1, 3);
                        hi.b(false);
                        qa.a(var11, 18, var12, var13, var14, var1, var2);
                        ei.d(-114);
                        if (null == pf.field_I) {
                          break L28;
                        } else {
                          id.field_A.b(pf.field_I, lh.field_a, -8 + aj.field_d, 16772608, 0);
                          break L28;
                        }
                      }
                      L29: {
                        dd.g(-125);
                        if (null == q.field_g) {
                          break L29;
                        } else {
                          if (!q.field_g.b(96)) {
                            break L6;
                          } else {
                            break L29;
                          }
                        }
                      }
                      L30: {
                        if ((ul.field_L ^ -1) >= -2) {
                          if ((ul.field_L ^ -1) == 0) {
                            stackOut_137_0 = 1;
                            stackIn_139_0 = stackOut_137_0;
                            break L30;
                          } else {
                            stackOut_136_0 = 0;
                            stackIn_139_0 = stackOut_136_0;
                            break L30;
                          }
                        } else {
                          stackOut_134_0 = 1;
                          stackIn_139_0 = stackOut_134_0;
                          break L30;
                        }
                      }
                      L31: {
                        var21 = stackIn_139_0;
                        if (bm.field_c != 0) {
                          break L31;
                        } else {
                          if (rl.field_c != 0) {
                            break L31;
                          } else {
                            if (of.field_d == dn.field_i) {
                              var21 = 0;
                              break L31;
                            } else {
                              break L31;
                            }
                          }
                        }
                      }
                      L32: {
                        if (0 != bm.field_c) {
                          break L32;
                        } else {
                          if (1 != rl.field_c) {
                            break L32;
                          } else {
                            if (dn.field_i != of.field_d) {
                              break L32;
                            } else {
                              var21 = 0;
                              break L32;
                            }
                          }
                        }
                      }
                      L33: {
                        if (bm.field_c != 0) {
                          break L33;
                        } else {
                          if (8 != rl.field_c) {
                            break L33;
                          } else {
                            if (3 != ha.field_t) {
                              break L33;
                            } else {
                              if (!pm.field_a) {
                                break L33;
                              } else {
                                var21 = 0;
                                break L33;
                              }
                            }
                          }
                        }
                      }
                      if (var21 != 0) {
                        nh.field_P.a((byte) -46);
                        break L6;
                      } else {
                        L34: {
                          var6 = 0;
                          if (-6 == (mc.field_I ^ -1)) {
                            var6 = 16777215;
                            break L34;
                          } else {
                            break L34;
                          }
                        }
                        L35: {
                          if (0 >= jf.field_c) {
                            break L35;
                          } else {
                            if (128 > jf.field_c) {
                              si.a(0, 0, 640, 480, var6, jf.field_c * 2);
                              break L35;
                            } else {
                              break L35;
                            }
                          }
                        }
                        L36: {
                          if (128 > jf.field_c) {
                            break L36;
                          } else {
                            if (jf.field_c < 256) {
                              si.a(0, 0, 640, 480, var6, 512 + -(2 * jf.field_c));
                              break L36;
                            } else {
                              break L36;
                            }
                          }
                        }
                        cb.a(631, var5);
                        if (0 < lg.field_f) {
                          var7 = 0;
                          L37: while (true) {
                            if (20 <= var7) {
                              break L5;
                            } else {
                              si.e(0 - -var7, 0 + var7, -(var7 * 2) + 640, -(var7 * 2) + 480, 16711680, lg.field_f * (20 - var7) / 4);
                              var7++;
                              continue L37;
                            }
                          }
                        } else {
                          break L5;
                        }
                      }
                    } else {
                      var6_ref.field_e = var11;
                      L38: while (true) {
                        if (var13 < var6_ref.field_e) {
                          var6_ref.field_g = var6_ref.field_g + 1;
                          continue L21;
                        } else {
                          L39: {
                            var7 = var6_ref.b(-4);
                            vf.a(-63, var7);
                            if (18 > var41[var7]) {
                              break L39;
                            } else {
                              if (21 < var41[var7]) {
                                break L39;
                              } else {
                                if (16 <= var42[var7]) {
                                  break L39;
                                } else {
                                  var42[var7] = 16;
                                  break L39;
                                }
                              }
                            }
                          }
                          var6_ref.field_e = var6_ref.field_e + 1;
                          continue L38;
                        }
                      }
                    }
                  }
                } else {
                  var9 = -var4 + var20 * 24;
                  var7 = var1 * var20 - -var11;
                  var21 = var11;
                  L40: while (true) {
                    if (var21 > var13) {
                      var20++;
                      continue L20;
                    } else {
                      L41: {
                        var7++;
                        var22 = var40[var7];
                        if ((var22 >> -1484167384 ^ -1) != -5) {
                          break L41;
                        } else {
                          if (bm.field_c != 0) {
                            break L41;
                          } else {
                            if (rl.field_c != 2) {
                              break L41;
                            } else {
                              if ((ha.field_t ^ -1) == -15) {
                                break L41;
                              } else {
                                var21++;
                                continue L40;
                              }
                            }
                          }
                        }
                      }
                      L42: {
                        if (-1 == var40[var7]) {
                          break L42;
                        } else {
                          if (0 < ak.field_b[var22].field_a) {
                            break L42;
                          } else {
                            var21++;
                            continue L40;
                          }
                        }
                      }
                      L43: {
                        if (!pa.field_d) {
                          break L43;
                        } else {
                          if (var16[var7]) {
                            break L43;
                          } else {
                            if (!var17[var7]) {
                              break L43;
                            } else {
                              var21++;
                              continue L40;
                            }
                          }
                        }
                      }
                      if (pk.field_d[var41[var7]] != null) {
                        var8 = -var3 + 24 * var21;
                        pk.field_d[var41[var7]].e(var8, var9);
                        var21++;
                        continue L40;
                      } else {
                        var21++;
                        continue L40;
                      }
                    }
                  }
                }
              }
            }
          }
          L44: {
            var6 = 0;
            if (-6 == (mc.field_I ^ -1)) {
              var6 = 16777215;
              break L44;
            } else {
              break L44;
            }
          }
          L45: {
            if (0 >= jf.field_c) {
              break L45;
            } else {
              if (128 > jf.field_c) {
                si.a(0, 0, 640, 480, var6, jf.field_c * 2);
                break L45;
              } else {
                break L45;
              }
            }
          }
          L46: {
            if (128 > jf.field_c) {
              break L46;
            } else {
              if (jf.field_c < 256) {
                si.a(0, 0, 640, 480, var6, 512 + -(2 * jf.field_c));
                break L46;
              } else {
                break L46;
              }
            }
          }
          cb.a(631, var5);
          if (0 < lg.field_f) {
            var7 = 0;
            L47: while (true) {
              if (20 <= var7) {
                break L5;
              } else {
                si.e(0 - -var7, 0 + var7, -(var7 * 2) + 640, -(var7 * 2) + 480, 16711680, lg.field_f * (20 - var7) / 4);
                var7++;
                continue L47;
              }
            }
          } else {
            break L5;
          }
        }
        L48: {
          if ((li.field_q ^ -1) > -3) {
            break L48;
          } else {
            break L48;
          }
        }
    }

    final static void a(int param0) {
        try {
            if (param0 != -6) {
                rd.a(false);
            }
            if (null != q.field_b) {
                try {
                    q.field_b.a(0L, (byte) 109);
                    q.field_b.a(24, sc.field_g.field_i, sc.field_g.field_n, (byte) 60);
                } catch (Exception exception) {
                }
            }
            sc.field_g.field_i = sc.field_g.field_i + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    rd(gb param0, gb param1) {
        ((rd) this).field_b = new jm(256);
        ((rd) this).field_e = new jm(256);
        ((rd) this).field_f = param0;
        ((rd) this).field_c = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Waiting for music";
        field_h = 10;
        field_d = false;
    }
}
