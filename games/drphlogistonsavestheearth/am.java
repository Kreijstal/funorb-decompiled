/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am extends ic {
    static int field_p;
    static od field_n;
    private ug field_s;
    vd field_q;
    static int field_l;
    ec field_r;
    static String field_m;
    static nh field_o;

    final int d() {
        return 0;
    }

    final ic c() {
        cc var1;
        int var2;
        var2 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        L0: while (true) {
          var1 = (cc) ((Object) this.field_q.e(0));
          if (var1 != null) {
            if (var1.field_D != null) {
              return (ic) ((Object) var1.field_D);
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final ic a() {
        cc var1;
        var1 = (cc) ((Object) this.field_q.h(-11151));
        if (var1 != null) {
          if (var1.field_D != null) {
            return (ic) ((Object) var1.field_D);
          } else {
            return this.c();
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, int param1, int param2, nh[] param3, int param4, int param5) {
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
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
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        var22 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (param3 == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (0 >= param2) {
                  break L1;
                } else {
                  if (0 >= param1) {
                    break L1;
                  } else {
                    L2: {
                      if (null == param3[3]) {
                        stackIn_11_0 = 0;
                        break L2;
                      } else {
                        stackIn_11_0 = param3[3].field_z;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_11_0;
                      if (null == param3[5]) {
                        stackIn_14_0 = 0;
                        break L3;
                      } else {
                        stackIn_14_0 = param3[5].field_z;
                        break L3;
                      }
                    }
                    L4: {
                      var7 = stackIn_14_0;
                      if (param4 == 14673) {
                        break L4;
                      } else {
                        field_n = (od) null;
                        break L4;
                      }
                    }
                    L5: {
                      if (param3[1] == null) {
                        stackIn_19_0 = 0;
                        break L5;
                      } else {
                        stackIn_19_0 = param3[1].field_C;
                        break L5;
                      }
                    }
                    L6: {
                      var8 = stackIn_19_0;
                      if (null == param3[7]) {
                        stackIn_22_0 = 0;
                        break L6;
                      } else {
                        stackIn_22_0 = param3[7].field_C;
                        break L6;
                      }
                    }
                    L7: {
                      var9 = stackIn_22_0;
                      var10 = param2 + param5;
                      var11 = param0 - -param1;
                      var12 = var6_int + param5;
                      var13 = var10 + -var7;
                      var14 = param0 - -var8;
                      var15 = var11 + -var9;
                      var16 = var12;
                      var17 = var13;
                      if (var16 > var17) {
                        var17 = param2 * var6_int / (var7 + var6_int) + param5;
                        var16 = param2 * var6_int / (var7 + var6_int) + param5;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      var18 = var14;
                      var19 = var15;
                      wj.b(tg.field_i);
                      if (var18 <= var19) {
                        break L8;
                      } else {
                        var19 = var8 * param1 / (var8 - -var9) + param0;
                        var18 = var8 * param1 / (var8 - -var9) + param0;
                        break L8;
                      }
                    }
                    L9: {
                      if (param3[0] != null) {
                        wj.d(param5, param0, var16, var18);
                        param3[0].d(param5, param0);
                        wj.a(tg.field_i);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (param3[2] == null) {
                        break L10;
                      } else {
                        wj.d(var17, param0, var10, var18);
                        param3[2].d(var13, param0);
                        wj.a(tg.field_i);
                        break L10;
                      }
                    }
                    L11: {
                      if (null != param3[6]) {
                        wj.d(param5, var19, var16, var11);
                        param3[6].d(param5, var15);
                        wj.a(tg.field_i);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (null == param3[8]) {
                        break L12;
                      } else {
                        wj.d(var17, var19, var10, var11);
                        param3[8].d(var13, var15);
                        wj.a(tg.field_i);
                        break L12;
                      }
                    }
                    L13: {
                      if (param3[1] == null) {
                        break L13;
                      } else {
                        if (0 != param3[1].field_z) {
                          wj.d(var16, param0, var17, var18);
                          var20 = var12;
                          L14: while (true) {
                            if (var20 >= var13) {
                              wj.a(tg.field_i);
                              break L13;
                            } else {
                              param3[1].d(var20, param0);
                              var20 = var20 + param3[1].field_z;
                              continue L14;
                            }
                          }
                        } else {
                          break L13;
                        }
                      }
                    }
                    L15: {
                      if (param3[7] == null) {
                        break L15;
                      } else {
                        if (param3[7].field_z != 0) {
                          wj.d(var16, var19, var17, var11);
                          var20 = var12;
                          L16: while (true) {
                            if (var13 <= var20) {
                              wj.a(tg.field_i);
                              break L15;
                            } else {
                              param3[7].d(var20, var15);
                              var20 = var20 + param3[7].field_z;
                              continue L16;
                            }
                          }
                        } else {
                          break L15;
                        }
                      }
                    }
                    L17: {
                      if (null == param3[3]) {
                        break L17;
                      } else {
                        if (param3[3].field_C == 0) {
                          break L17;
                        } else {
                          wj.d(param5, var18, var16, var19);
                          var20 = var14;
                          L18: while (true) {
                            if (var20 >= var15) {
                              wj.a(tg.field_i);
                              break L17;
                            } else {
                              param3[3].d(param5, var20);
                              var20 = var20 + param3[3].field_C;
                              continue L18;
                            }
                          }
                        }
                      }
                    }
                    L19: {
                      if (null == param3[5]) {
                        break L19;
                      } else {
                        if (param3[5].field_C != 0) {
                          wj.d(var17, var18, var10, var19);
                          var20 = var14;
                          L20: while (true) {
                            if (var15 <= var20) {
                              wj.a(tg.field_i);
                              break L19;
                            } else {
                              param3[5].d(var13, var20);
                              var20 = var20 + param3[5].field_C;
                              continue L20;
                            }
                          }
                        } else {
                          break L19;
                        }
                      }
                    }
                    L21: {
                      if (null == param3[4]) {
                        break L21;
                      } else {
                        if (-1 == (param3[4].field_z ^ -1)) {
                          break L21;
                        } else {
                          if (param3[4].field_C == 0) {
                            break L21;
                          } else {
                            wj.d(var16, var18, var17, var19);
                            var20 = var14;
                            L22: while (true) {
                              if (var15 <= var20) {
                                wj.a(tg.field_i);
                                break L21;
                              } else {
                                var21 = var12;
                                L23: while (true) {
                                  if (var21 >= var13) {
                                    var20 = var20 + param3[4].field_C;
                                    continue L22;
                                  } else {
                                    param3[4].d(var21, var20);
                                    var21 = var21 + param3[4].field_z;
                                    continue L23;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L24: {
            var6 = decompiledCaughtException;
            stackIn_77_0 = (RuntimeException) (var6);

            stackIn_77_1 = new StringBuilder().append("am.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackIn_78_2 = "null";
              break L24;
            } else {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackIn_78_2 = "{...}";
              break L24;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_78_0), stackIn_78_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static String h(int param0) {
        if (!(null != oa.field_d)) {
            return "";
        }
        if (param0 != 0) {
            return (String) null;
        }
        return oa.field_d;
    }

    final static void g(int param0) {
        oa.field_d = dh.field_N.b((byte) -53);
        CharSequence var2 = (CharSequence) ((Object) oa.field_d);
        tf.field_pb = rh.a(119, var2);
        if (param0 != 11) {
            am.g(-127);
        }
    }

    private final void a(int param0, int param1, cc param2, byte param3, int[] param4, int param5) {
        ug stackIn_13_0 = null;
        cc stackIn_13_1 = null;
        ug stackIn_14_0 = null;
        cc stackIn_14_1 = null;
        int stackIn_14_2 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ag var11 = null;
        int var12 = 0;
        var12 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == 97) {
                break L1;
              } else {
                field_l = -91;
                break L1;
              }
            }
            L2: {
              if (-1 == (4 & this.field_s.field_C[param2.field_u] ^ -1)) {
                break L2;
              } else {
                if ((param2.field_k ^ -1) <= -1) {
                  break L2;
                } else {
                  var7_int = this.field_s.field_B[param2.field_u] / id.field_d;
                  L3: while (true) {
                    var8 = (-param2.field_i + 1048575 - -var7_int) / var7_int;
                    if (param1 >= var8) {
                      L4: {
                        param2.field_D.b(param4, param0, var8);
                        param0 = param0 + var8;
                        param2.field_i = param2.field_i + (var8 * var7_int - 1048576);
                        param1 = param1 - var8;
                        var9 = id.field_d / 100;
                        var10 = 262144 / var7_int;
                        if (var9 <= var10) {
                          break L4;
                        } else {
                          var9 = var10;
                          break L4;
                        }
                      }
                      L5: {
                        var11 = param2.field_D;
                        if (this.field_s.field_E[param2.field_u] == 0) {
                          param2.field_D = ag.b(param2.field_C, var11.j(), var11.e(), var11.h());
                          break L5;
                        } else {
                          L6: {
                            param2.field_D = ag.b(param2.field_C, var11.j(), 0, var11.h());
                            stackIn_13_0 = this.field_s;

                            stackIn_13_1 = (cc) (param2);

                            if ((param2.field_o.field_p[param2.field_F] ^ -1) <= -1) {
                              stackIn_14_0 = (ug) ((Object) stackIn_13_0);
                              stackIn_14_1 = (cc) ((Object) stackIn_13_1);
                              stackIn_14_2 = 0;
                              break L6;
                            } else {
                              stackIn_14_0 = (ug) ((Object) stackIn_13_0);
                              stackIn_14_1 = (cc) ((Object) stackIn_13_1);
                              stackIn_14_2 = 1;
                              break L6;
                            }
                          }
                          ((ug) (Object) stackIn_14_0).a(stackIn_14_1, stackIn_14_2 != 0, (byte) -88);
                          param2.field_D.e(var9, var11.e());
                          break L5;
                        }
                      }
                      L7: {
                        if (-1 >= (param2.field_o.field_p[param2.field_F] ^ -1)) {
                          break L7;
                        } else {
                          param2.field_D.f(-1);
                          break L7;
                        }
                      }
                      var11.k(var9);
                      var11.b(param4, param0, param5 - param0);
                      if (var11.g()) {
                        this.field_r.a(var11);
                        continue L3;
                      } else {
                        continue L3;
                      }
                    } else {
                      param2.field_i = param2.field_i + param1 * var7_int;
                      break L2;
                    }
                  }
                }
              }
            }
            param2.field_D.b(param4, param0, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var7);

            stackIn_26_1 = new StringBuilder().append("am.J(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L9;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L9;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_27_0), stackIn_30_2 + ',' + param5 + ')');
        }
    }

    private final void a(int param0, cc param1, int param2) {
        ug stackIn_9_0 = null;
        cc stackIn_9_1 = null;
        ug stackIn_10_0 = null;
        cc stackIn_10_1 = null;
        int stackIn_10_2 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          L0: {
            L1: {
              if ((this.field_s.field_C[param1.field_u] & 4) == 0) {
                break L1;
              } else {
                if (0 > param1.field_k) {
                  var4_int = this.field_s.field_B[param1.field_u] / id.field_d;
                  var5 = (var4_int + (1048575 + -param1.field_i)) / var4_int;
                  param1.field_i = param2 * var4_int + param1.field_i & 1048575;
                  if (var5 <= param2) {
                    L2: {
                      if (this.field_s.field_E[param1.field_u] != 0) {
                        L3: {
                          param1.field_D = ag.b(param1.field_C, param1.field_D.j(), 0, param1.field_D.h());
                          stackIn_9_0 = this.field_s;

                          stackIn_9_1 = (cc) (param1);

                          if (0 <= param1.field_o.field_p[param1.field_F]) {
                            stackIn_10_0 = (ug) ((Object) stackIn_9_0);
                            stackIn_10_1 = (cc) ((Object) stackIn_9_1);
                            stackIn_10_2 = 0;
                            break L3;
                          } else {
                            stackIn_10_0 = (ug) ((Object) stackIn_9_0);
                            stackIn_10_1 = (cc) ((Object) stackIn_9_1);
                            stackIn_10_2 = 1;
                            break L3;
                          }
                        }
                        ((ug) (Object) stackIn_10_0).a(stackIn_10_1, stackIn_10_2 != 0, (byte) -102);
                        break L2;
                      } else {
                        param1.field_D = ag.b(param1.field_C, param1.field_D.j(), param1.field_D.e(), param1.field_D.h());
                        break L2;
                      }
                    }
                    L4: {
                      if (0 > param1.field_o.field_p[param1.field_F]) {
                        param1.field_D.f(-1);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    param2 = param1.field_i / var4_int;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
            }
            if (param0 < -24) {
              param1.field_D.d(param2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("am.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void b(int[] param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        cc var6 = null;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            this.field_r.b(param0, param1, param2);
            var6 = (cc) ((Object) this.field_q.h(-11151));
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L2: {
                  if (this.field_s.a(-128, var6)) {
                    break L2;
                  } else {
                    var4_int = param1;
                    var5 = param2;
                    L3: while (true) {
                      if (var6.field_l >= var5) {
                        this.a(var4_int, var5, var6, (byte) 97, param0, var5 + var4_int);
                        var6.field_l = var6.field_l - var5;
                        break L2;
                      } else {
                        this.a(var4_int, var6.field_l, var6, (byte) 97, param0, var4_int - -var5);
                        var5 = var5 - var6.field_l;
                        var4_int = var4_int + var6.field_l;
                        if (!this.field_s.a(var4_int, param0, -128, var6, var5)) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                var6 = (cc) ((Object) this.field_q.e(0));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("am.A(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void f(int param0) {
        field_o = null;
        field_m = null;
        if (param0 >= -108) {
            return;
        }
        field_n = null;
    }

    final void d(int param0) {
        int var2;
        cc var3;
        int var4;
        boolean stackIn_3_0 = false;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        this.field_r.d(param0);
        var3 = (cc) ((Object) this.field_q.h(-11151));
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            stackIn_3_0 = this.field_s.a(-124, var3);
            L1: {
              if (!stackIn_3_0) {
                var2 = param0;
                L2: while (true) {
                  if (var3.field_l >= var2) {
                    this.a(-59, var3, var2);
                    var3.field_l = var3.field_l - var2;
                    break L1;
                  } else {
                    this.a(-127, var3, var3.field_l);
                    var2 = var2 - var3.field_l;
                    if (this.field_s.a(0, (int[]) null, -128, var3, var2)) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            var3 = (cc) ((Object) this.field_q.e(0));
            continue L0;
          }
        }
    }

    final static void e(int param0) {
        if (param0 != 11) {
            am.g(115);
        }
        if (-11 == (af.field_b ^ -1) || !hc.a(true)) {
            re.a(true);
            af.field_b = 11;
        }
        kl.field_S = true;
    }

    am(ug param0) {
        this.field_q = new vd();
        this.field_r = new ec();
        try {
            this.field_s = param0;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "am.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = 75;
        field_p = field_l / 2;
        field_n = new od(256);
    }
}
