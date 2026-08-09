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
            p var2 = (p) null;
            jm.a((int[]) null, -57, (byte) 5, (p) null);
        }
        field_h = null;
    }

    final void a(int param0, long param1, am param2) {
        am var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
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
              var5 = this.field_d[(int)((long)(this.field_f - 1) & param1)];
              param2.field_g = var5;
              param2.field_f = var5.field_f;
              param2.field_f.field_g = param2;
              param2.field_c = param1;
              param2.field_g.field_f = param2;
              if (param0 <= -61) {
                break L2;
              } else {
                this.field_f = -71;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5_ref);

            stackIn_8_1 = new StringBuilder().append("jm.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final am b(int param0) {
        int fieldTemp$1 = 0;
        am var2;
        int var3;
        am var4;
        L0: {
          var3 = HostileSpawn.field_I ? 1 : 0;
          if ((this.field_a ^ -1) >= param0) {
            break L0;
          } else {
            if (this.field_d[-1 + this.field_a] == this.field_c) {
              break L0;
            } else {
              var2 = this.field_c;
              this.field_c = var2.field_g;
              return var2;
            }
          }
        }
        L1: while (true) {
          if (this.field_a < this.field_f) {
            fieldTemp$1 = this.field_a;
            this.field_a = this.field_a + 1;
            var4 = this.field_d[fieldTemp$1].field_g;
            var2 = var4;
            if (var4 != this.field_d[this.field_a + -1]) {
              this.field_c = var2.field_g;
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
            this.b(31);
        }
        this.field_a = 0;
        return this.b(-1);
    }

    final static void a(int[] param0, int param1, byte param2, p param3) {
        int stackIn_36_0 = 0;
        int stackIn_47_0 = 0;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_84_2 = null;
        StringBuilder stackIn_86_1 = null;
        StringBuilder stackIn_87_1 = null;
        String stackIn_87_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var4_double = 0.0;
        RuntimeException var4 = null;
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
        oj var47 = null;
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
                      if (var30 >= rc.field_e) {
                        if (var15 == null) {
                          var47 = (oj) null;
                          nh.a((oj) null, -29966);
                          break L2;
                        } else {
                          L6: {
                            if (!((oj) (var15)).a(param3.field_i, -93)) {
                              break L6;
                            } else {
                              if (((oj) (var15)).field_i == 5) {
                                break L6;
                              } else {
                                if (22 != ((oj) (var15)).field_i) {
                                  ((oj) (var15)).field_I = ((oj) (var15)).field_I - 1;
                                  break L6;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          L7: {
                            if (0 > ((oj) (var15)).field_I) {
                              ((oj) (var15)).field_I = 0;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          L8: {
                            if (((oj) (var15)).field_i == 0) {
                              ci.a(25, 60);
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          L9: {
                            ((oj) (var15)).field_F = 255;
                            param3.field_e = 1;
                            param3.field_c = Math.random() * 255.0;
                            param3.field_j.field_g = ((oj) (var15)).field_j.field_g;
                            param3.field_j.field_e = ((oj) (var15)).field_j.field_e;
                            param3.field_l.field_f = ((oj) (var15)).field_l.field_f + Math.random() - 0.5;
                            param3.field_l.field_a = ((oj) (var15)).field_l.field_a + Math.random() - 0.5;
                            if ((((oj) (var15)).field_I ^ -1) >= -1) {
                              param3.field_i = 3;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          L10: {
                            nh.a((oj) (var15), -29966);
                            if (-6 == (((oj) (var15)).field_i ^ -1)) {
                              break L10;
                            } else {
                              if (((oj) (var15)).b(6)) {
                                break L10;
                              } else {
                                if (-23 != (((oj) (var15)).field_i ^ -1)) {
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
                          var31 = re.field_n[var30];
                          var15 = var31;
                          var15 = var31;
                          var32 = var31.field_i;
                          if (0 == var30) {
                            break L11;
                          } else {
                            if ((var31.field_I ^ -1) < -1) {
                              break L11;
                            } else {
                              var30++;
                              continue L5;
                            }
                          }
                        }
                        if (!var31.b(6)) {
                          if (-6 != (var32 ^ -1)) {
                            if ((var32 ^ -1) != -23) {
                              L12: {
                                L13: {
                                  if ((var32 ^ -1) > -13) {
                                    break L13;
                                  } else {
                                    if (-19 >= (var32 ^ -1)) {
                                      break L13;
                                    } else {
                                      break L12;
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
                                      if (!fb.a(var20, (byte) 43, var24, var11, var18, var8, var22, var13, var6)) {
                                        if (fb.a(var24, (byte) 43, var20, var11, var18, var8, var22, var13, var6)) {
                                          stackIn_47_0 = 1;
                                          break L16;
                                        } else {
                                          stackIn_47_0 = 0;
                                          break L16;
                                        }
                                      } else {
                                        stackIn_47_0 = 1;
                                        break L16;
                                      }
                                    }
                                    var35 = stackIn_47_0;
                                    break L15;
                                  } else {
                                    var36 = -var6 + var11;
                                    var38 = -var8 + var13;
                                    var40 = -(var31.field_u.field_z >> -496631679) + (int)(var26 * 24.0);
                                    var41 = -(var31.field_u.field_A >> -1667441151) + (int)(24.0 * var28);
                                    var42 = 0.0;
                                    L17: while (true) {
                                      if (1.0 <= var42) {
                                        break L15;
                                      } else {
                                        if (var35 != 0) {
                                          break L15;
                                        } else {
                                          L18: {
                                            var44 = (int)((var6 + var42 * var36) * 24.0);
                                            var45 = (int)((var8 + var42 * var38) * 24.0);
                                            if (!var31.field_u.d(var40, var41, var44, var45)) {
                                              stackIn_36_0 = 0;
                                              break L18;
                                            } else {
                                              stackIn_36_0 = 1;
                                              break L18;
                                            }
                                          }
                                          L19: {
                                            var35 = stackIn_36_0;
                                            if (var35 != 0) {
                                              var6 = var6 + var36 * var42;
                                              var8 = var8 + var42 * var38;
                                              break L19;
                                            } else {
                                              break L19;
                                            }
                                          }
                                          var42 = var42 + 0.05;
                                          continue L17;
                                        }
                                      }
                                    }
                                  }
                                }
                                if (var35 != 0) {
                                  var4_double = (-var28 + var8) * (var8 - var28) + (-var26 + var6) * (-var26 + var6);
                                  if (var16 > var4_double) {
                                    var15 = var31;
                                    var16 = var4_double;
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                } else {
                                  var30++;
                                  continue L5;
                                }
                              }
                              var30++;
                              continue L5;
                            } else {
                              var30++;
                              continue L5;
                            }
                          } else {
                            var30++;
                            continue L5;
                          }
                        } else {
                          var30++;
                          continue L5;
                        }
                      }
                    }
                  } else {
                    L20: {
                      param3.field_l.a(2, (byte) 94, param3.field_c);
                      param3.a(8573);
                      param0[param1] = 0;
                      if (-3 != (param0[param3.field_j.b(-4)] ^ -1)) {
                        break L20;
                      } else {
                        param3.field_e = 1;
                        param3.field_c = 255.0 * Math.random();
                        var10 = 1;
                        break L20;
                      }
                    }
                    param0[param1] = 3;
                    continue L3;
                  }
                }
              }
            }
            L21: {
              if (0 >= param3.field_e) {
                break L21;
              } else {
                param3.field_e = param3.field_e + 1;
                break L21;
              }
            }
            L22: {
              if ((param3.field_e ^ -1) >= -33) {
                break L22;
              } else {
                param3.field_i = -1;
                break L22;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var4 = decompiledCaughtException;
            stackIn_83_0 = (RuntimeException) (var4);

            stackIn_83_1 = new StringBuilder().append("jm.E(");

            if (param0 == null) {
              stackIn_84_0 = (RuntimeException) ((Object) stackIn_83_0);
              stackIn_84_1 = (StringBuilder) ((Object) stackIn_83_1);
              stackIn_84_2 = "null";
              break L23;
            } else {
              stackIn_84_0 = (RuntimeException) ((Object) stackIn_83_0);
              stackIn_84_1 = (StringBuilder) ((Object) stackIn_83_1);
              stackIn_84_2 = "{...}";
              break L23;
            }
          }
          L24: {


            stackIn_86_1 = ((StringBuilder) (Object) stackIn_84_1).append(stackIn_84_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_84_0 = (RuntimeException) ((Object) stackIn_84_0);
              stackIn_87_1 = (StringBuilder) ((Object) stackIn_86_1);
              stackIn_87_2 = "null";
              break L24;
            } else {
              stackIn_84_0 = (RuntimeException) ((Object) stackIn_84_0);
              stackIn_87_1 = (StringBuilder) ((Object) stackIn_86_1);
              stackIn_87_2 = "{...}";
              break L24;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_84_0), stackIn_87_2 + ')');
        }
    }

    final am a(boolean param0, long param1) {
        am var5 = null;
        int var6 = HostileSpawn.field_I ? 1 : 0;
        am var4 = this.field_d[(int)((long)(this.field_f - 1) & param1)];
        this.field_g = var4.field_g;
        if (param0) {
            this.a(false, 79L);
        }
        while (var4 != this.field_g) {
            if (param1 == this.field_g.field_c) {
                var5 = this.field_g;
                this.field_g = this.field_g.field_g;
                return var5;
            }
            this.field_g = this.field_g.field_g;
        }
        this.field_g = null;
        return null;
    }

    final static String a(byte param0) {
        if (!(od.field_I != ti.field_b)) {
            return fj.field_Sb;
        }
        if (!c.field_a.d((byte) -59)) {
            return c.field_a.a((byte) -34);
        }
        if (param0 != 93) {
            p var2 = (p) null;
            jm.a((int[]) null, -43, (byte) 16, (p) null);
        }
        if (ki.field_f == ti.field_b) {
            return c.field_a.a((byte) -34);
        }
        return rf.field_e;
    }

    jm(int param0) {
        int var2 = 0;
        am dupTemp$0 = null;
        am var3 = null;
        this.field_a = 0;
        this.field_f = param0;
        this.field_d = new am[param0];
        for (var2 = 0; param0 > var2; var2++) {
            dupTemp$0 = new am();
            var3 = dupTemp$0;
            this.field_d[var2] = dupTemp$0;
            var3.field_f = var3;
            var3.field_g = var3;
        }
    }

    static {
        field_e = -1;
        field_h = "Please try again in a few minutes.";
    }
}
