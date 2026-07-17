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
        field_h = null;
    }

    final void a(int param0, long param1, am param2) {
        am var5 = null;
        RuntimeException var5_ref = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (null != param2.field_f) {
                param2.b(-39);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var5 = ((jm) this).field_d[(int)((long)(((jm) this).field_f - 1) & param1)];
              param2.field_g = var5;
              param2.field_f = var5.field_f;
              param2.field_f.field_g = param2;
              param2.field_c = param1;
              param2.field_g.field_f = param2;
              if (param0 <= -61) {
                break L2;
              } else {
                ((jm) this).field_f = -71;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5_ref;
            stackOut_6_1 = new StringBuilder().append("jm.A(").append(param0).append(44).append(param1).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    final am b(int param0) {
        am var2 = null;
        int var3 = 0;
        am var4 = null;
        L0: {
          var3 = HostileSpawn.field_I ? 1 : 0;
          if (~((jm) this).field_a >= param0) {
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
            int fieldTemp$2 = ((jm) this).field_a;
            ((jm) this).field_a = ((jm) this).field_a + 1;
            var4 = ((jm) this).field_d[fieldTemp$2].field_g;
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
        RuntimeException var4 = null;
        double var4_double = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        int var10 = 0;
        double var11 = 0.0;
        double var13 = 0.0;
        Object var15 = null;
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
        int stackIn_32_0 = 0;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        var46 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 <= -126) {
                break L1;
              } else {
                field_e = 96;
                break L1;
              }
            }
            L2: {
              if (0 != param3.field_e) {
                break L2;
              } else {
                var6 = (double)param3.field_j.field_e + param3.field_l.field_f;
                var8 = (double)param3.field_j.field_g + param3.field_l.field_a;
                var10 = 0;
                L3: while (true) {
                  if (param3.field_e != 0) {
                    L4: {
                      var11 = (double)param3.field_j.field_e + param3.field_l.field_f;
                      var13 = param3.field_l.field_a + (double)param3.field_j.field_g;
                      if (var10 != 0) {
                        var13 = (double)param3.field_j.field_g + param3.field_l.field_a + 0.5;
                        var11 = 0.5 + ((double)param3.field_j.field_e + param3.field_l.field_f);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var15 = null;
                    var16 = (-var13 + var8) * (-var13 + var8) + (-var11 + var6) * (var6 - var11);
                    var30 = 0;
                    L5: while (true) {
                      if (~var30 <= ~rc.field_e) {
                        if (var15 == null) {
                          var47 = null;
                          nh.a((oj) null, -29966);
                          break L2;
                        } else {
                          L6: {
                            if (!((oj) var15).a(param3.field_i, -93)) {
                              break L6;
                            } else {
                              if (((oj) var15).field_i == 5) {
                                break L6;
                              } else {
                                if (22 != ((oj) var15).field_i) {
                                  ((oj) var15).field_I = ((oj) var15).field_I - 1;
                                  break L6;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          L7: {
                            if (0 > ((oj) var15).field_I) {
                              ((oj) var15).field_I = 0;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          L8: {
                            if (((oj) var15).field_i == 0) {
                              ci.a(25, 60);
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          L9: {
                            ((oj) var15).field_F = 255;
                            param3.field_e = 1;
                            param3.field_c = Math.random() * 255.0;
                            param3.field_j.field_g = ((oj) var15).field_j.field_g;
                            param3.field_j.field_e = ((oj) var15).field_j.field_e;
                            param3.field_l.field_f = ((oj) var15).field_l.field_f + Math.random() - 0.5;
                            param3.field_l.field_a = ((oj) var15).field_l.field_a + Math.random() - 0.5;
                            if (((oj) var15).field_I <= 0) {
                              param3.field_i = 3;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          L10: {
                            nh.a((oj) var15, -29966);
                            if (((oj) var15).field_i == 5) {
                              break L10;
                            } else {
                              if (((oj) var15).b(6)) {
                                break L10;
                              } else {
                                if (((oj) var15).field_i != 22) {
                                  break L2;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                          if (1 != uj.field_l) {
                            break L2;
                          } else {
                            eh.field_c.a(lm.field_A[11], 100, uh.field_i);
                            break L2;
                          }
                        }
                      } else {
                        L11: {
                          L12: {
                            var31 = re.field_n[var30];
                            var15 = (Object) (Object) var31;
                            var15 = (Object) (Object) var31;
                            var32 = var31.field_i;
                            if (0 == var30) {
                              break L12;
                            } else {
                              if (var31.field_I <= 0) {
                                break L11;
                              } else {
                                break L12;
                              }
                            }
                          }
                          if (var31.b(6)) {
                            break L11;
                          } else {
                            if (var32 == 5) {
                              break L11;
                            } else {
                              if (var32 == 22) {
                                break L11;
                              } else {
                                L13: {
                                  if (var32 < 12) {
                                    break L13;
                                  } else {
                                    if (var32 >= 18) {
                                      break L13;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                L14: {
                                  var33 = 1.0;
                                  var28 = var31.field_l.field_a + (double)var31.field_j.field_g;
                                  if (20 != var32) {
                                    break L14;
                                  } else {
                                    var33 = 0.5;
                                    break L14;
                                  }
                                }
                                L15: {
                                  var26 = (double)var31.field_j.field_e + var31.field_l.field_f;
                                  var18 = -var33 + var26;
                                  var20 = -var33 + var28;
                                  var24 = var20 + 2.0 * var33;
                                  var22 = var18 + 2.0 * var33;
                                  var35 = 0;
                                  if (var31.field_u == null) {
                                    L16: {
                                      L17: {
                                        if (fb.a(var20, (byte) 43, var24, var11, var18, var8, var22, var13, var6)) {
                                          break L17;
                                        } else {
                                          if (!fb.a(var24, (byte) 43, var20, var11, var18, var8, var22, var13, var6)) {
                                            stackOut_41_0 = 0;
                                            stackIn_42_0 = stackOut_41_0;
                                            break L16;
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                      stackOut_40_0 = 1;
                                      stackIn_42_0 = stackOut_40_0;
                                      break L16;
                                    }
                                    var35 = stackIn_42_0;
                                    break L15;
                                  } else {
                                    var36 = -var6 + var11;
                                    var38 = -var8 + var13;
                                    var40 = -(var31.field_u.field_z >> 1) + (int)(var26 * 24.0);
                                    var41 = -(var31.field_u.field_A >> 1) + (int)(24.0 * var28);
                                    var42 = 0.0;
                                    L18: while (true) {
                                      L19: {
                                        if (1.0 <= var42) {
                                          break L19;
                                        } else {
                                          if (var35 != 0) {
                                            break L19;
                                          } else {
                                            L20: {
                                              var44 = (int)((var6 + var42 * var36) * 24.0);
                                              var45 = (int)((var8 + var42 * var38) * 24.0);
                                              if (!var31.field_u.d(var40, var41, var44, var45)) {
                                                stackOut_31_0 = 0;
                                                stackIn_32_0 = stackOut_31_0;
                                                break L20;
                                              } else {
                                                stackOut_30_0 = 1;
                                                stackIn_32_0 = stackOut_30_0;
                                                break L20;
                                              }
                                            }
                                            L21: {
                                              var35 = stackIn_32_0;
                                              if (var35 != 0) {
                                                var6 = var6 + var36 * var42;
                                                var8 = var8 + var42 * var38;
                                                break L21;
                                              } else {
                                                break L21;
                                              }
                                            }
                                            var42 = var42 + 0.05;
                                            continue L18;
                                          }
                                        }
                                      }
                                      break L15;
                                    }
                                  }
                                }
                                if (var35 == 0) {
                                  break L11;
                                } else {
                                  var4_double = (-var28 + var8) * (var8 - var28) + (-var26 + var6) * (-var26 + var6);
                                  if (var16 > var4_double) {
                                    var15 = (Object) (Object) var31;
                                    var16 = var4_double;
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var30++;
                        continue L5;
                      }
                    }
                  } else {
                    L22: {
                      param3.field_l.a(2, (byte) 94, param3.field_c);
                      param3.a(8573);
                      param0[param1] = 0;
                      if (param0[param3.field_j.b(-4)] != 2) {
                        break L22;
                      } else {
                        param3.field_e = 1;
                        param3.field_c = 255.0 * Math.random();
                        var10 = 1;
                        break L22;
                      }
                    }
                    param0[param1] = 3;
                    continue L3;
                  }
                }
              }
            }
            L23: {
              if (0 >= param3.field_e) {
                break L23;
              } else {
                param3.field_e = param3.field_e + 1;
                break L23;
              }
            }
            L24: {
              if (param3.field_e <= 32) {
                break L24;
              } else {
                param3.field_i = -1;
                break L24;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L25: {
            var4 = decompiledCaughtException;
            stackOut_75_0 = (RuntimeException) var4;
            stackOut_75_1 = new StringBuilder().append("jm.E(");
            stackIn_77_0 = stackOut_75_0;
            stackIn_77_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param0 == null) {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L25;
            } else {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "{...}";
              stackIn_78_0 = stackOut_76_0;
              stackIn_78_1 = stackOut_76_1;
              stackIn_78_2 = stackOut_76_2;
              break L25;
            }
          }
          L26: {
            stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
            stackOut_78_1 = ((StringBuilder) (Object) stackIn_78_1).append(stackIn_78_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param3 == null) {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L26;
            } else {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L26;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_81_0, stackIn_81_2 + 41);
        }
    }

    final am a(boolean param0, long param1) {
        am var5 = null;
        int var6 = HostileSpawn.field_I ? 1 : 0;
        am var4 = ((jm) this).field_d[(int)((long)(((jm) this).field_f - 1) & param1)];
        ((jm) this).field_g = var4.field_g;
        if (param0) {
            am discarded$0 = ((jm) this).a(false, 79L);
        }
        while (var4 != ((jm) this).field_g) {
            if (param1 == ((jm) this).field_g.field_c) {
                var5 = ((jm) this).field_g;
                ((jm) this).field_g = ((jm) this).field_g.field_g;
                return var5;
            }
            ((jm) this).field_g = ((jm) this).field_g.field_g;
        }
        ((jm) this).field_g = null;
        return null;
    }

    final static String a(byte param0) {
        if (!(od.field_I != ti.field_b)) {
            return fj.field_Sb;
        }
        if (!c.field_a.d((byte) -59)) {
            return c.field_a.a((byte) -34);
        }
        if (ki.field_f == ti.field_b) {
            return c.field_a.a((byte) -34);
        }
        return rf.field_e;
    }

    jm(int param0) {
        int var2 = 0;
        am var3 = null;
        ((jm) this).field_a = 0;
        ((jm) this).field_f = param0;
        ((jm) this).field_d = new am[param0];
        for (var2 = 0; param0 > var2; var2++) {
            am dupTemp$0 = new am();
            var3 = dupTemp$0;
            ((jm) this).field_d[var2] = dupTemp$0;
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
