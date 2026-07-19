/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class te {
    int field_b;
    static String field_e;
    int field_f;
    static String[] field_a;
    int[] field_c;
    java.awt.Image field_d;
    static kf field_g;

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        uc var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        eg var11 = null;
        uc var12 = null;
        ok var13 = null;
        int[] var14 = null;
        ok var15 = null;
        int[] var16 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              var12 = mk.field_j;
              if (param0 == 67) {
                break L1;
              } else {
                field_e = (String) null;
                break L1;
              }
            }
            L2: {
              var2 = var12.a(-16384);
              if (0 == var2) {
                var10 = a.b(3922);
                var16 = var10;
                var14 = var16;
                var3 = var14;
                var9 = var10;
                var4 = var9;
                var5 = var12;
                var6 = ((dh) ((Object) var5)).a(-16384);
                var7 = 0;
                L3: while (true) {
                  if (var6 <= var7) {
                    var15 = (ok) ((Object) vc.field_g.d(9272));
                    if (var15 == null) {
                      gb.g(-17464);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      var15.field_l = var3;
                      var15.field_m = var16[0];
                      var15.field_k = true;
                      var15.b((byte) 12);
                      break L2;
                    }
                  } else {
                    var9[var7] = ((dh) ((Object) var5)).f((byte) -107);
                    var7++;
                    continue L3;
                  }
                }
              } else {
                if (var2 == 1) {
                  var11 = (eg) ((Object) ic.field_s.d(9272));
                  if (var11 != null) {
                    var11.b((byte) 12);
                    break L2;
                  } else {
                    gb.g(-17464);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  if ((var2 ^ -1) != -3) {
                    bd.a((Throwable) null, "A1: " + r.i(-15465), -87);
                    gb.g(-17464);
                    break L2;
                  } else {
                    var13 = (ok) ((Object) vc.field_g.d(9272));
                    if (var13 == null) {
                      gb.g(param0 + -17531);
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var13.field_l = a.b(3922);
                      var13.field_k = true;
                      var13.field_m = var13.field_l[0];
                      var13.b((byte) 12);
                      break L2;
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var1), "te.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final static void a(long param0, int param1) {
        try {
            try {
                Thread.sleep(param0);
            } catch (InterruptedException interruptedException) {
            }
            if (param1 != 0) {
                te.b((byte) -85);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(CharSequence param0, boolean param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1) {
              stackOut_3_0 = bk.a((byte) 120, true, 10, param0);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("te.D(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        boolean discarded$7 = false;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        RuntimeException var7 = null;
        int var7_int = 0;
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
        int var23 = 0;
        CharSequence var24 = null;
        int var25 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var23 = Terraphoenix.field_V;
        try {
          L0: {
            var9 = param3;
            param3 = param3 - param4;
            if (param1 == 0) {
              l.a(param2, param3, param5);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (0 > param1) {
                  param1 = -param1;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                var11 = -param1 + param3;
                if (l.field_d <= var11) {
                  break L2;
                } else {
                  var11 = l.field_d;
                  break L2;
                }
              }
              L3: {
                var12 = param3 - -param1 - -1;
                if (var12 > l.field_c) {
                  var12 = l.field_c;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                var13 = var11;
                var14 = param1 * param1;
                var15 = 0;
                var16 = -var13 + param3;
                var17 = var16 * var16;
                var8 = var13;
                var18 = -var16 + var17;
                if (var12 < param3) {
                  param3 = var12;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: while (true) {
                if (var13 >= param3) {
                  L6: {
                    var15 = param1;
                    var16 = -param3 + var13;
                    if (param0 == 99) {
                      break L6;
                    } else {
                      var24 = (CharSequence) null;
                      discarded$7 = te.a((CharSequence) null, false);
                      break L6;
                    }
                  }
                  var18 = var16 * var16 - -var14;
                  var17 = var18 + -var15;
                  var18 = var18 - var16;
                  L7: while (true) {
                    if (var12 <= var13) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L8: while (true) {
                        L9: {
                          if (var14 >= var18) {
                            break L9;
                          } else {
                            if (var14 >= var17) {
                              break L9;
                            } else {
                              incrementValue$8 = var15;
                              var15--;
                              var18 = var18 - (incrementValue$8 + var15);
                              var17 = var17 - (var15 + var15);
                              continue L8;
                            }
                          }
                        }
                        L10: {
                          var19 = -var15 + param2;
                          if (var19 >= l.field_b) {
                            break L10;
                          } else {
                            var19 = l.field_b;
                            break L10;
                          }
                        }
                        L11: {
                          var20 = var15 + param2;
                          if (l.field_f - 1 < var20) {
                            var20 = l.field_f - 1;
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        var21 = var13 * l.field_k + var19;
                        var25 = var19;
                        var7_int = var25;
                        var22 = var19;
                        L12: while (true) {
                          if (var20 <= var22) {
                            var18 = var18 + (var16 + var16);
                            var13++;
                            var8++;
                            incrementValue$9 = var16;
                            var16++;
                            var17 = var17 + (incrementValue$9 + var16);
                            continue L7;
                          } else {
                            L13: {
                              var10 = (int)(Math.sqrt((double)(-((-param2 + var25) * (var25 - param2)) + -((-param3 + var8) * (-param3 + var8)) + param1 * param1)) + (double)var9);
                              if (gd.field_a[var25][var8] <= var10) {
                                L14: {
                                  if (param6) {
                                    gd.field_a[var25][var8] = var10;
                                    break L14;
                                  } else {
                                    break L14;
                                  }
                                }
                                incrementValue$10 = var21;
                                var21++;
                                l.field_i[incrementValue$10] = param5;
                                break L13;
                              } else {
                                var21++;
                                break L13;
                              }
                            }
                            var25++;
                            var22++;
                            continue L12;
                          }
                        }
                      }
                    }
                  }
                } else {
                  L15: while (true) {
                    L16: {
                      if (var18 <= var14) {
                        break L16;
                      } else {
                        if (var17 > var14) {
                          L17: {
                            var19 = param2 + -var15 + 1;
                            if (var19 >= l.field_b) {
                              break L17;
                            } else {
                              var19 = l.field_b;
                              break L17;
                            }
                          }
                          L18: {
                            var20 = param2 + var15;
                            if (l.field_f < var20) {
                              var20 = l.field_f;
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                          var7_int = var19;
                          var21 = l.field_k * var13 + var19;
                          var22 = var19;
                          L19: while (true) {
                            if (var20 <= var22) {
                              var13++;
                              var8++;
                              incrementValue$11 = var16;
                              var16--;
                              var17 = var17 - (incrementValue$11 - -var16);
                              var18 = var18 - (var16 + var16);
                              continue L5;
                            } else {
                              L20: {
                                var10 = (int)((double)var9 + Math.sqrt((double)(-((-param3 + var8) * (var8 - param3)) + -((var7_int + -param2) * (var7_int + -param2)) + param1 * param1)));
                                if (var10 >= gd.field_a[var7_int][var8]) {
                                  L21: {
                                    if (param6) {
                                      gd.field_a[var7_int][var8] = var10;
                                      break L21;
                                    } else {
                                      break L21;
                                    }
                                  }
                                  incrementValue$12 = var21;
                                  var21++;
                                  l.field_i[incrementValue$12] = param5;
                                  break L20;
                                } else {
                                  var21++;
                                  break L20;
                                }
                              }
                              var7_int++;
                              var22++;
                              continue L19;
                            }
                          }
                        } else {
                          break L16;
                        }
                      }
                    }
                    var17 = var17 + (var15 + var15);
                    incrementValue$13 = var15;
                    var15++;
                    var18 = var18 + (incrementValue$13 + var15);
                    continue L15;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var7), "te.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0) {
        if (param0 != 0) {
            return;
        }
        l.a(this.field_c, this.field_b, this.field_f);
    }

    abstract void a(int param0, int param1, byte param2, java.awt.Component param3);

    public static void b(byte param0) {
        field_a = null;
        field_e = null;
        if (param0 > -51) {
            return;
        }
        field_g = null;
    }

    abstract void a(int param0, int param1, java.awt.Graphics param2, int param3);

    static {
        field_e = "Close";
        field_g = new kf("email");
    }
}
