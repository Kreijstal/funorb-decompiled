/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jm {
    private am[] field_d;
    static String field_h;
    private int field_f;
    static bd field_b;
    private am field_g;
    private am field_c;
    private int field_a;
    static int field_e;

    public static void a(boolean param0) {
        field_b = null;
        if (!param0) {
            Object var2 = null;
            jm.a((int[]) null, -57, (byte) 5, (p) null);
        }
        field_h = null;
    }

    final void a(int param0, long param1, am param2) {
        if (!(null == param2.field_f)) {
            param2.b(-39);
        }
        am var5 = ((jm) this).field_d[(int)((long)(((jm) this).field_f - 1) & param1)];
        param2.field_g = var5;
        param2.field_f = var5.field_f;
        param2.field_f.field_g = param2;
        param2.field_c = param1;
        param2.field_g.field_f = param2;
        if (param0 > -61) {
            ((jm) this).field_f = -71;
        }
    }

    final am b(int param0) {
        am var2 = null;
        int var3 = 0;
        am var4 = null;
        L0: {
          var3 = HostileSpawn.field_I ? 1 : 0;
          if ((((jm) this).field_a ^ -1) >= param0) {
            break L0;
          } else {
            if (((jm) this).field_d[-1 + ((jm) this).field_a] == ((jm) this).field_c) {
              break L0;
            } else {
              var2 = ((jm) this).field_c;
              ((jm) this).field_c = var2.field_g;
              return var2;
            }
          }
        }
        L1: while (true) {
          if (((jm) this).field_a < ((jm) this).field_f) {
            ((jm) this).field_a = ((jm) this).field_a + 1;
            var4 = ((jm) this).field_d[((jm) this).field_a].field_g;
            var2 = var4;
            if (var4 != ((jm) this).field_d[((jm) this).field_a + -1]) {
              ((jm) this).field_c = var2.field_g;
              return var2;
            } else {
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final am a(int param0) {
        if (param0 > -92) {
            am discarded$0 = ((jm) this).b(31);
        }
        ((jm) this).field_a = 0;
        return ((jm) this).b(-1);
    }

    final static void a(int[] param0, int param1, byte param2, p param3) {
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        int var10 = 0;
        double var11 = 0.0;
        double var13 = 0.0;
        oj var15 = null;
        double var16 = 0.0;
        double var18 = 0.0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        double var26 = 0.0;
        double var28 = 0.0;
        int var30 = 0;
        oj var31 = null;
        int var32 = 0;
        double var33 = 0.0;
        int var35 = 0;
        double var36 = 0.0;
        double var38 = 0.0;
        int var40 = 0;
        int var41 = 0;
        double var42 = 0.0;
        int var44 = 0;
        int var45 = 0;
        int var46 = 0;
        Object var47 = null;
        int stackIn_31_0 = 0;
        int stackIn_42_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_37_0 = 0;
        L0: {
          var46 = HostileSpawn.field_I ? 1 : 0;
          if (param2 <= -126) {
            break L0;
          } else {
            field_e = 96;
            break L0;
          }
        }
        L1: {
          if (0 != param3.field_e) {
            break L1;
          } else {
            var6 = (double)param3.field_j.field_e + param3.field_l.field_f;
            var8 = (double)param3.field_j.field_g + param3.field_l.field_a;
            var10 = 0;
            L2: while (true) {
              L3: {
                if (param3.field_e != 0) {
                  break L3;
                } else {
                  L4: {
                    param3.field_l.a(2, (byte) 94, param3.field_c);
                    param3.a(8573);
                    param0[param1] = 0;
                    if (-3 != (param0[param3.field_j.b(-4)] ^ -1)) {
                      break L4;
                    } else {
                      param3.field_e = 1;
                      param3.field_c = 255.0 * Math.random();
                      var10 = 1;
                      break L4;
                    }
                  }
                  param0[param1] = 3;
                  if (0 == 0) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              L5: {
                var11 = (double)param3.field_j.field_e + param3.field_l.field_f;
                var13 = param3.field_l.field_a + (double)param3.field_j.field_g;
                if (var10 != 0) {
                  var13 = (double)param3.field_j.field_g + param3.field_l.field_a + 0.5;
                  var11 = 0.5 + ((double)param3.field_j.field_e + param3.field_l.field_f);
                  break L5;
                } else {
                  break L5;
                }
              }
              var15 = null;
              var16 = (-var13 + var8) * (-var13 + var8) + (-var11 + var6) * (var6 - var11);
              var30 = 0;
              L6: while (true) {
                L7: {
                  if (var30 >= rc.field_e) {
                    break L7;
                  } else {
                    L8: {
                      L9: {
                        var31 = re.field_n[var30];
                        var15 = var31;
                        var15 = var31;
                        var32 = var31.field_i;
                        if (0 == var30) {
                          break L9;
                        } else {
                          if ((var31.field_I ^ -1) >= -1) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                      if (var31.b(6)) {
                        break L8;
                      } else {
                        if (var32 == 5) {
                          break L8;
                        } else {
                          if (var32 == 22) {
                            break L8;
                          } else {
                            L10: {
                              if (var32 < 12) {
                                break L10;
                              } else {
                                if (var32 >= 18) {
                                  break L10;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            L11: {
                              var33 = 1.0;
                              var28 = var31.field_l.field_a + (double)var31.field_j.field_g;
                              if (20 != var32) {
                                break L11;
                              } else {
                                var33 = 0.5;
                                break L11;
                              }
                            }
                            L12: {
                              L13: {
                                var26 = (double)var31.field_j.field_e + var31.field_l.field_f;
                                var18 = -var33 + var26;
                                var20 = -var33 + var28;
                                var24 = var20 + 2.0 * var33;
                                var22 = var18 + 2.0 * var33;
                                var35 = 0;
                                if (var31.field_u == null) {
                                  break L13;
                                } else {
                                  var36 = -var6 + var11;
                                  var38 = -var8 + var13;
                                  var40 = -(var31.field_u.field_z >> -496631679) + (int)(var26 * 24.0);
                                  var41 = -(var31.field_u.field_A >> -1667441151) + (int)(24.0 * var28);
                                  var42 = 0.0;
                                  L14: while (true) {
                                    L15: {
                                      if (1.0 <= var42) {
                                        break L15;
                                      } else {
                                        if (var35 != 0) {
                                          break L15;
                                        } else {
                                          L16: {
                                            var44 = (int)((var6 + var42 * var36) * 24.0);
                                            var45 = (int)((var8 + var42 * var38) * 24.0);
                                            if (!var31.field_u.d(var40, var41, var44, var45)) {
                                              stackOut_30_0 = 0;
                                              stackIn_31_0 = stackOut_30_0;
                                              break L16;
                                            } else {
                                              stackOut_29_0 = 1;
                                              stackIn_31_0 = stackOut_29_0;
                                              break L16;
                                            }
                                          }
                                          L17: {
                                            var35 = stackIn_31_0;
                                            if (var35 != 0) {
                                              var6 = var6 + var36 * var42;
                                              var8 = var8 + var42 * var38;
                                              break L17;
                                            } else {
                                              break L17;
                                            }
                                          }
                                          var42 = var42 + 0.05;
                                          if (0 == 0) {
                                            continue L14;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                    }
                                    if (0 == 0) {
                                      break L12;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                              }
                              L18: {
                                if (!fb.a(var20, (byte) 43, var24, var11, var18, var8, var22, var13, var6)) {
                                  if (fb.a(var24, (byte) 43, var20, var11, var18, var8, var22, var13, var6)) {
                                    stackOut_40_0 = 1;
                                    stackIn_42_0 = stackOut_40_0;
                                    break L18;
                                  } else {
                                    stackOut_39_0 = 0;
                                    stackIn_42_0 = stackOut_39_0;
                                    break L18;
                                  }
                                } else {
                                  stackOut_37_0 = 1;
                                  stackIn_42_0 = stackOut_37_0;
                                  break L18;
                                }
                              }
                              var35 = stackIn_42_0;
                              break L12;
                            }
                            if (var35 == 0) {
                              break L8;
                            } else {
                              var4 = (-var28 + var8) * (var8 - var28) + (-var26 + var6) * (-var26 + var6);
                              if (var16 > var4) {
                                var15 = var31;
                                var16 = var4;
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                      }
                    }
                    var30++;
                    if (0 == 0) {
                      continue L6;
                    } else {
                      break L7;
                    }
                  }
                }
                L19: {
                  if (var15 == null) {
                    break L19;
                  } else {
                    L20: {
                      if (!var15.a(param3.field_i, -93)) {
                        break L20;
                      } else {
                        if (var15.field_i == 5) {
                          break L20;
                        } else {
                          if (22 != var15.field_i) {
                            var15.field_I = var15.field_I - 1;
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                      }
                    }
                    L21: {
                      if (0 > var15.field_I) {
                        var15.field_I = 0;
                        break L21;
                      } else {
                        break L21;
                      }
                    }
                    L22: {
                      if (var15.field_i == 0) {
                        ci.a(25, 60);
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                    L23: {
                      var15.field_F = 255;
                      param3.field_e = 1;
                      param3.field_c = Math.random() * 255.0;
                      param3.field_j.field_g = var15.field_j.field_g;
                      param3.field_j.field_e = var15.field_j.field_e;
                      param3.field_l.field_f = var15.field_l.field_f + Math.random() - 0.5;
                      param3.field_l.field_a = var15.field_l.field_a + Math.random() - 0.5;
                      if (var15.field_I >= -1) {
                        param3.field_i = 3;
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    L24: {
                      nh.a(var15, -29966);
                      if (-6 == var15.field_i) {
                        break L24;
                      } else {
                        if (var15.b(6)) {
                          break L24;
                        } else {
                          if (-23 != (var15.field_i ^ -1)) {
                            break L1;
                          } else {
                            break L24;
                          }
                        }
                      }
                    }
                    if (1 != uj.field_l) {
                      break L1;
                    } else {
                      eh.field_c.a(lm.field_A[11], 100, uh.field_i);
                      if (0 == 0) {
                        break L1;
                      } else {
                        break L19;
                      }
                    }
                  }
                }
                var47 = null;
                nh.a((oj) null, -29966);
                break L1;
              }
            }
          }
        }
        L25: {
          if (0 >= param3.field_e) {
            break L25;
          } else {
            param3.field_e = param3.field_e + 1;
            break L25;
          }
        }
        L26: {
          if ((param3.field_e ^ -1) >= -33) {
            break L26;
          } else {
            param3.field_i = -1;
            break L26;
          }
        }
    }

    final am a(boolean param0, long param1) {
        am var4 = null;
        am var5 = null;
        int var6 = 0;
        L0: {
          var6 = HostileSpawn.field_I ? 1 : 0;
          var4 = ((jm) this).field_d[(int)((long)(((jm) this).field_f - 1) & param1)];
          ((jm) this).field_g = var4.field_g;
          if (!param0) {
            break L0;
          } else {
            am discarded$2 = ((jm) this).a(false, 79L);
            break L0;
          }
        }
        L1: while (true) {
          if (var4 != ((jm) this).field_g) {
            if (param1 != ((jm) this).field_g.field_c) {
              ((jm) this).field_g = ((jm) this).field_g.field_g;
              continue L1;
            } else {
              var5 = ((jm) this).field_g;
              ((jm) this).field_g = ((jm) this).field_g.field_g;
              return var5;
            }
          } else {
            ((jm) this).field_g = null;
            return null;
          }
        }
    }

    final static String a(byte param0) {
        Object var2 = null;
        if (od.field_I == ti.field_b) {
          return fj.field_Sb;
        } else {
          if (c.field_a.d((byte) -59)) {
            L0: {
              if (param0 == 93) {
                break L0;
              } else {
                var2 = null;
                jm.a((int[]) null, -43, (byte) 16, (p) null);
                break L0;
              }
            }
            if (ki.field_f == ti.field_b) {
              return c.field_a.a((byte) -34);
            } else {
              return rf.field_e;
            }
          } else {
            return c.field_a.a((byte) -34);
          }
        }
    }

    jm(int param0) {
        int var2 = 0;
        am var3 = null;
        ((jm) this).field_a = 0;
        ((jm) this).field_f = param0;
        ((jm) this).field_d = new am[param0];
        for (var2 = 0; param0 > var2; var2++) {
            var3 = new am();
            ((jm) this).field_d[var2] = new am();
            var3.field_f = var3;
            var3.field_g = var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = -1;
        field_h = "Please try again in a few minutes.";
    }
}
