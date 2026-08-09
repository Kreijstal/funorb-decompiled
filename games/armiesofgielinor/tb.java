/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tb implements pa {
    static String field_d;
    private int[] field_k;
    private int field_m;
    static volatile int field_g;
    private ha field_c;
    static oc field_e;
    static int[] field_h;
    static wk[] field_j;
    private v field_i;
    private vb field_f;
    static String field_b;
    static String field_a;
    private boolean field_l;

    public final void a(int param0) {
        if (param0 <= 94) {
            oj var3 = (oj) null;
            this.a((oj) null, (byte) -97);
        }
    }

    public final boolean b(byte param0) {
        if (param0 > -25) {
            return false;
        }
        return false;
    }

    public final boolean b(int param0) {
        if (param0 != 8865) {
            field_e = (oc) null;
        }
        return this.field_l;
    }

    final static void d(int param0) {
        ou.a(true);
        pl.field_A = true;
        fh.field_i = true;
        rl.field_C.j(-102);
        if (param0 != 7) {
            tb.c(101);
        }
        af.a(false, bm.field_z, -1);
    }

    final static void a(boolean param0, int param1, boolean param2, int param3, byte param4, int param5) {
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int[][] stackIn_34_2 = null;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int[][] stackIn_35_2 = null;
        int stackIn_35_3 = 0;
        int stackIn_37_2;
        int stackIn_37_3;
        int stackIn_38_2;
        int stackIn_38_3;
        int stackIn_38_4;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
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
        var16 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param5 == -1) {
                break L1;
              } else {
                if ((param5 ^ -1) == -256) {
                  break L1;
                } else {
                  L2: {
                    if (param4 == -33) {
                      break L2;
                    } else {
                      field_g = 60;
                      break L2;
                    }
                  }
                  L3: {
                    if (param2) {
                      stackIn_10_0 = 1;
                      break L3;
                    } else {
                      stackIn_10_0 = -1;
                      break L3;
                    }
                  }
                  L4: {
                    var6_int = stackIn_10_0;
                    if (!param0) {
                      stackIn_13_0 = 1;
                      break L4;
                    } else {
                      stackIn_13_0 = -1;
                      break L4;
                    }
                  }
                  L5: {
                    var7 = stackIn_13_0;
                    if (param2) {
                      stackIn_16_0 = 0;
                      break L5;
                    } else {
                      stackIn_16_0 = 1;
                      break L5;
                    }
                  }
                  L6: {


                    if (param0) {

                      stackIn_19_1 = 0;
                      break L6;
                    } else {

                      stackIn_19_1 = 1;
                      break L6;
                    }
                  }
                  L7: {
                    if (stackIn_16_0 != stackIn_19_1) {
                      stackIn_22_0 = -1;
                      break L7;
                    } else {
                      stackIn_22_0 = 1;
                      break L7;
                    }
                  }
                  var8 = stackIn_22_0;
                  var9 = so.field_b.field_a;
                  var10 = 0;
                  L8: while (true) {
                    if ((var10 ^ -1) <= -41) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L9: {
                        var11 = var6_int * var10 + param1;
                        if (!param2) {
                          break L9;
                        } else {
                          var11++;
                          break L9;
                        }
                      }
                      L10: {
                        if ((var11 ^ -1) > -1) {
                          break L10;
                        } else {
                          if (var9 >= var11) {
                            var12 = (int)(Math.sin((double)(var10 - -(ug.field_b * (var8 * 2))) * 3.141592653589793 / 20.0) * 3.0 * (double)var8);
                            var12 = var12 + (int)((double)var8 * (3.0 * Math.sin(3.141592653589793 * (double)(-(3 * var8 * ug.field_b) + 2 * var10) / 20.0)));
                            var13 = 32;
                            var14 = 256;
                            var15 = 0;
                            L11: while (true) {
                              if (-17 >= (var15 ^ -1)) {
                                break L10;
                              } else {
                                L12: {
                                  L13: {
                                    stackIn_34_0 = var11;

                                    stackIn_34_1 = param3 - (-((20 - (var10 >> 484623361)) * var7) - (-var15 + -var12));

                                    stackIn_34_2 = op.field_c;

                                    if (bv.field_w == null) {
                                      break L13;
                                    } else {

                                      stackIn_34_2 = (int[][]) ((Object) stackIn_34_2);

                                      if (!bv.field_w.field_wb) {
                                        break L13;
                                      } else {
                                        stackIn_35_0 = stackIn_34_0;
                                        stackIn_35_1 = stackIn_34_1;
                                        stackIn_35_2 = (int[][]) ((Object) stackIn_34_2);
                                        stackIn_35_3 = 1;
                                        break L12;
                                      }
                                    }
                                  }
                                  stackIn_35_0 = stackIn_34_0;
                                  stackIn_35_1 = stackIn_34_1;
                                  stackIn_35_2 = (int[][]) ((Object) stackIn_34_2);
                                  stackIn_35_3 = 0;
                                  break L12;
                                }
                                L14: {




                                  stackIn_37_2 = stackIn_35_2[stackIn_35_3][param5];

                                  stackIn_37_3 = 256;

                                  if (var14 <= 0) {


                                    stackIn_38_2 = stackIn_37_2;
                                    stackIn_38_3 = stackIn_37_3;
                                    stackIn_38_4 = -var14;
                                    break L14;
                                  } else {


                                    stackIn_38_2 = stackIn_37_2;
                                    stackIn_38_3 = stackIn_37_3;
                                    stackIn_38_4 = var14;
                                    break L14;
                                  }
                                }
                                qn.g(stackIn_35_0, stackIn_35_1, stackIn_38_2, stackIn_38_3 - stackIn_38_4);
                                var14 = var14 - var13;
                                var15++;
                                continue L11;
                              }
                            }
                          } else {
                            break L10;
                          }
                        }
                      }
                      var10++;
                      continue L8;
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var6), "tb.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void c(int param0) {
        field_j = null;
        field_b = null;
        field_a = null;
        field_d = null;
        if (param0 > -58) {
            field_j = (wk[]) null;
        }
        field_h = null;
        field_e = null;
    }

    final static boolean a(boolean param0, int param1) {
        long dupTemp$2 = 0L;
        L0: {
          if (kd.field_J != null) {
            break L0;
          } else {
            kd.field_J = wj.field_n.a(rn.field_d, (byte) 120, k.field_c);
            break L0;
          }
        }
        if (param1 == kd.field_J.field_g) {
          return false;
        } else {
          L1: {
            dupTemp$2 = vi.b(82);
            mb.field_G = dupTemp$2;
            iq.field_h = dupTemp$2;
            if ((kd.field_J.field_g ^ -1) != -2) {
              break L1;
            } else {
              break L1;
            }
          }
          ov.field_g = cj.field_o;
          kd.field_J = null;
          return true;
        }
    }

    public final void b(oj param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_i.field_c[0] = this.field_f.field_x % this.field_m;
            this.field_i.field_c[1] = this.field_f.field_x / this.field_m;
            this.field_i.f(-111);
            this.field_i.i(0);
            this.field_k[1] = this.field_i.field_e[1];
            this.field_k[0] = this.field_i.field_e[0];
            var3_int = 127 % ((param1 - -26) / 48);
            this.field_f.field_m = this.field_k[0];
            this.field_f.field_v = this.field_k[1];
            if (param0 != null) {
              this.field_l = this.field_f.field_u.a(this.field_f.field_m + 1, -35, this.field_f.field_v + -6, -1, param0.field_w);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("tb.Q(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int[] param0, vh param1, boolean param2, int[] param3) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = 0;
              if (!param2) {
                break L1;
              } else {
                field_d = (String) null;
                break L1;
              }
            }
            L2: while (true) {
              if (-7 >= (var4_int ^ -1)) {
                break L0;
              } else {
                L3: {
                  param0[var4_int] = param1.k(0);
                  param3[var4_int] = param1.k(0);
                  if (param0[var4_int] != 255) {
                    break L3;
                  } else {
                    param0[var4_int] = -1;
                    break L3;
                  }
                }
                var4_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("tb.A(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L6;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), stackIn_17_2 + ')');
        }
    }

    public final boolean a(oj param0, byte param1) {
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_71_0 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        String var4_ref_String = null;
        int var6 = 0;
        hp var7 = null;
        String var8 = null;
        kf var9 = null;
        String var10 = null;
        qq var11 = null;
        String var12 = null;
        ec var13 = null;
        String var14 = null;
        tr var15 = null;
        String var16 = null;
        String var17 = null;
        Object var18 = null;
        qq var18_ref = null;
        String var19 = null;
        Object var20 = null;
        kn var20_ref = null;
        Object var21 = null;
        q var21_ref = null;
        String var22 = null;
        Object var23 = null;
        qq var23_ref = null;
        String var24 = null;
        var18 = null;
        var20 = null;
        var21 = null;
        var23 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-11 != (param0.field_m ^ -1)) {
                if ((param0.field_m ^ -1) != -12) {
                  if (3 == param0.field_m) {
                    var23_ref = (qq) ((Object) param0);
                    var4 = this.field_m * var23_ref.field_J + var23_ref.field_I;
                    this.field_f.field_x = var4;
                    var23_ref.field_w = this.field_c.c(var23_ref.field_J, true, var23_ref.field_I);
                    if (var23_ref.field_w == null) {
                      var24 = nv.field_bb + ": Can see capture";
                      this.field_c.a(param1 ^ 57, var24, param0);
                      stackIn_66_0 = 0;
                      decompiledRegionSelector0 = 9;
                      break L0;
                    } else {
                      ub.a((byte) 91, im.field_v[8]);
                      var23_ref.field_w.field_z = 5;
                      var23_ref.a(var23_ref.field_w, 12);
                      this.b(var23_ref, (byte) -95);
                      break L1;
                    }
                  } else {
                    if (param0.field_m != 17) {
                      if (param0.field_m != 21) {
                        if ((param0.field_m ^ -1) == -7) {
                          L2: {
                            var21_ref = (q) ((Object) param0);
                            var21_ref.field_w = this.field_c.c(var21_ref.field_E, true, var21_ref.field_z);
                            var4 = var21_ref.field_z - -(this.field_m * var21_ref.field_E);
                            this.field_f.field_x = var4;
                            if (null == var21_ref.field_w) {
                              break L2;
                            } else {
                              if (var21_ref.field_w.field_bb) {
                                var21_ref.field_w = var21_ref.field_w.b(false);
                                break L2;
                              } else {
                                break L2;
                              }
                            }
                          }
                          if (null != var21_ref.field_w) {
                            var21_ref.field_w.field_z = 2;
                            var21_ref.a(var21_ref.field_w, 12);
                            this.b(var21_ref, (byte) -103);
                            break L1;
                          } else {
                            var22 = nv.field_bb + ": Can see telepop";
                            this.field_c.a(0, var22, param0);
                            stackIn_61_0 = 0;
                            decompiledRegionSelector0 = 8;
                            break L0;
                          }
                        } else {
                          if (-6 == (param0.field_m ^ -1)) {
                            var20_ref = (kn) ((Object) param0);
                            if (var20_ref.field_w != null) {
                              var4 = var20_ref.field_w.field_J + var20_ref.field_w.field_w * this.field_m;
                              var20_ref.field_w.field_z = 1;
                              this.field_f.field_x = var4;
                              dh.a(var20_ref.field_w.field_N, 0, param1 ^ 25);
                              var20_ref.a(var20_ref.field_w, 12);
                              this.b(var20_ref, (byte) -115);
                              break L1;
                            } else {
                              var4_ref_String = nv.field_bb + ": Telefrag unit null";
                              this.field_c.a(0, var4_ref_String, param0);
                              stackIn_53_0 = 0;
                              decompiledRegionSelector0 = 7;
                              break L0;
                            }
                          } else {
                            L3: {
                              if (12 == param0.field_m) {
                                break L3;
                              } else {
                                if (-17 == (param0.field_m ^ -1)) {
                                  break L3;
                                } else {
                                  if ((param0.field_m ^ -1) == -15) {
                                    break L3;
                                  } else {
                                    if (-19 == (param0.field_m ^ -1)) {
                                      var15 = (tr) ((Object) param0);
                                      var4 = var15.field_E - -(this.field_m * var15.field_D);
                                      this.field_f.field_x = var4;
                                      var15.field_w = this.field_c.c(var15.field_D, true, var15.field_E);
                                      if (var15.field_w == null) {
                                        var16 = nv.field_bb + ": Can see deployment";
                                        this.field_c.a(0, var16, param0);
                                        stackIn_37_0 = 0;
                                        decompiledRegionSelector0 = 4;
                                        break L0;
                                      } else {
                                        L4: {
                                          if (34 == var15.field_w.field_N) {
                                            var15.field_w.c(75, param1 ^ 49);
                                            var15.field_w.field_z = 1;
                                            break L4;
                                          } else {
                                            L5: {
                                              if ((var15.field_w.field_N ^ -1) == -8) {
                                                break L5;
                                              } else {
                                                if (17 == var15.field_w.field_N) {
                                                  break L5;
                                                } else {
                                                  var17 = nv.field_bb + ": Unit not deployable";
                                                  this.field_c.a(0, var17, param0);
                                                  stackIn_42_0 = 0;
                                                  decompiledRegionSelector0 = 5;
                                                  break L0;
                                                }
                                              }
                                            }
                                            var15.field_w.field_z = 4;
                                            break L4;
                                          }
                                        }
                                        var15.a(var15.field_w, 12);
                                        this.b(var15, (byte) -75);
                                        break L1;
                                      }
                                    } else {
                                      break L1;
                                    }
                                  }
                                }
                              }
                            }
                            var18_ref = (qq) ((Object) param0);
                            var4 = var18_ref.field_I - -(var18_ref.field_J * this.field_m);
                            this.field_f.field_x = var4;
                            var18_ref.field_w = this.field_c.c(var18_ref.field_J, true, var18_ref.field_I);
                            if (var18_ref.field_w == null) {
                              var19 = nv.field_bb + ": Can see heal, raise, pump";
                              this.field_c.a(0, var19, param0);
                              stackIn_49_0 = 0;
                              decompiledRegionSelector0 = 6;
                              break L0;
                            } else {
                              var18_ref.field_w.field_z = 8;
                              var18_ref.a(var18_ref.field_w, 12);
                              this.b(var18_ref, (byte) -124);
                              break L1;
                            }
                          }
                        }
                      } else {
                        L6: {
                          var13 = (ec) ((Object) param0);
                          var4 = var13.field_A - -(var13.field_B * this.field_m);
                          var13.field_w = this.field_c.c(var13.field_B, true, var13.field_A);
                          if (null == var13.field_w) {
                            break L6;
                          } else {
                            if (!var13.field_w.field_bb) {
                              break L6;
                            } else {
                              var13.field_w = var13.field_w.b(false);
                              break L6;
                            }
                          }
                        }
                        this.field_f.field_x = var4;
                        if (var13.field_w != null) {
                          dh.a(var13.field_w.field_N, 0, 32);
                          var13.field_w.field_z = 2;
                          var13.a(var13.field_w, 12);
                          this.b(var13, (byte) 73);
                          break L1;
                        } else {
                          var14 = nv.field_bb + ": Can see teleport";
                          this.field_c.a(0, var14, param0);
                          stackIn_25_0 = 0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    } else {
                      var11 = (qq) ((Object) param0);
                      var4 = this.field_m * var11.field_J + var11.field_I;
                      this.field_f.field_x = var4;
                      var11.field_w = this.field_c.c(var11.field_J, true, var11.field_I);
                      if (null != var11.field_w) {
                        var11.field_w.field_z = 4;
                        var11.a(var11.field_w, 12);
                        this.b(var11, (byte) -126);
                        break L1;
                      } else {
                        var12 = nv.field_bb + ": Can see burial";
                        this.field_c.a(0, var12, param0);
                        stackIn_17_0 = 0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  }
                } else {
                  var9 = (kf) ((Object) param0);
                  var4 = var9.field_H + var9.field_F * this.field_m;
                  this.field_f.field_x = var4;
                  if (null != var9.field_w) {
                    var9.field_w.field_z = 1;
                    var9.a(var9.field_w, 12);
                    this.b(var9, (byte) 123);
                    break L1;
                  } else {
                    var10 = nv.field_bb + ": Can see growth";
                    this.field_c.a(0, var10, param0);
                    stackIn_11_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              } else {
                L7: {
                  var7 = (hp) ((Object) param0);
                  var4 = var7.field_y - -(var7.field_D * this.field_m);
                  this.field_f.field_x = var4;
                  if (null != var7.field_w) {
                    break L7;
                  } else {
                    var7.field_w = this.field_c.c(var7.field_D, true, var7.field_y);
                    break L7;
                  }
                }
                if (null != var7.field_w) {
                  var7.field_w.field_z = 7;
                  dh.a(var7.field_w.field_N, 5, param1 + -25);
                  var7.a(var7.field_w, 12);
                  this.b(var7, (byte) 68);
                  break L1;
                } else {
                  var8 = nv.field_bb + ": Can see death";
                  this.field_c.a(0, var8, param0);
                  stackIn_6_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            if (param1 == 57) {
              stackIn_71_0 = 1;
              decompiledRegionSelector0 = 10;
              break L0;
            } else {
              field_e = (oc) null;
              return true;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_74_0 = (RuntimeException) (var3);

            stackIn_74_1 = new StringBuilder().append("tb.E(");

            if (param0 == null) {
              stackIn_75_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "null";
              break L8;
            } else {
              stackIn_75_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "{...}";
              break L8;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_75_0), stackIn_75_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_25_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_37_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_42_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_49_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_53_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_61_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_66_0 != 0;
                          } else {
                            return stackIn_71_0 != 0;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    public final void a(byte param0) {
        if (param0 != -52) {
            this.b(76);
        }
    }

    public final void c(byte param0) {
        if (param0 >= -119) {
            field_h = (int[]) null;
        }
    }

    tb(ha param0, v param1, vb param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_m = param0.field_v;
            this.field_i = param1;
            this.field_f = param2;
            this.field_c = param0;
            this.field_k = new int[2];
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var4);

            stackIn_5_1 = new StringBuilder().append("tb.<init>(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), stackIn_12_2 + ')');
        }
    }

    static {
        field_d = "Game options";
        field_g = 0;
        field_b = "Asking for or providing contact information";
        field_a = "Unable to delete name - system busy";
    }
}
