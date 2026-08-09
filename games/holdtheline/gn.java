/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gn {
    private Object[][] field_b;
    private Object[] field_c;
    static boolean field_g;
    static go field_f;
    private boolean field_d;
    private kn field_a;
    static String field_h;
    static int[] field_j;
    private ff field_i;
    private int field_e;

    final static void a(boolean param0, vi param1, byte param2, int param3) {
        tf stackIn_2_0;
        int stackIn_2_1;
        int stackIn_2_2;
        vi stackIn_2_3;
        int stackIn_2_4;
        tf stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        vi stackIn_3_3 = null;
        int stackIn_3_4 = 0;
        int stackIn_3_5 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              stackIn_2_0 = ai.field_a;

              stackIn_2_1 = param3;

              stackIn_2_2 = 1000000;

              stackIn_2_3 = (vi) (param1);

              stackIn_2_4 = -114;

              if (param0) {
                stackIn_3_0 = (tf) ((Object) stackIn_2_0);
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = stackIn_2_2;
                stackIn_3_3 = (vi) ((Object) stackIn_2_3);
                stackIn_3_4 = stackIn_2_4;
                stackIn_3_5 = 0;
                break L1;
              } else {
                stackIn_3_0 = (tf) ((Object) stackIn_2_0);
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = stackIn_2_2;
                stackIn_3_3 = (vi) ((Object) stackIn_2_3);
                stackIn_3_4 = stackIn_2_4;
                stackIn_3_5 = 1;
                break L1;
              }
            }
            L2: {
              ((tf) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, stackIn_3_3, (byte) stackIn_3_4, stackIn_3_5 != 0, 256);
              if (param2 == 69) {
                break L2;
              } else {
                field_h = (String) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("gn.AA(").append(param0).append(',');

            if (param1 == null) {
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
          throw kk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int b(int param0) {
        if (param0 != -1) {
            this.e(-20, -90);
        }
        if (!this.b((byte) -95)) {
            return -1;
        }
        return this.field_a.field_k.length;
    }

    final synchronized int a(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = HoldTheLine.field_D;
        if (this.b((byte) -85)) {
          var2 = param0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (var4 >= this.field_c.length) {
              if (var2 != 0) {
                var4 = 100 * var3 / var2;
                return var4;
              } else {
                return 100;
              }
            } else {
              if (this.field_a.field_u[var4] > 0) {
                var3 = var3 + this.a(96, var4);
                var2 += 100;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return 0;
        }
    }

    final int a(int param0, String param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param2) {
                break L1;
              } else {
                this.a((byte) -110, (String) (this.field_c[6]));
                break L1;
              }
            }
            if (!this.c(-1, param0)) {
              stackIn_5_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param1 = param1.toLowerCase();
              var5 = (CharSequence) ((Object) param1);
              var4_int = this.field_a.field_c[param0].a(an.a(var5, 0), (byte) 24);
              if (!this.a(var4_int, param0, 877)) {
                stackIn_9_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return var4_int;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("gn.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_9_0;
        }
    }

    private final synchronized boolean b(int[] param0, int param1, int param2, int param3) {
        Object[] array$0 = null;
        byte[] array$1 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_57_0 = 0;
        int stackIn_101_0 = 0;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_105_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        int var9_int = 0;
        byte[] var9 = null;
        int var10 = 0;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        int[] var14 = null;
        int var14_int = 0;
        int var15_int = 0;
        byte[][] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        byte[] var23 = null;
        int[] var24 = null;
        byte[] var25 = null;
        th var26 = null;
        byte[] var27 = null;
        th var29 = null;
        th var31 = null;
        int[] var32 = null;
        byte[][] var33 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        var22 = HoldTheLine.field_D;
        try {
          L0: {
            if (this.c(-1, param3)) {
              if (null == this.field_c[param3]) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  var5_int = this.field_a.field_u[param3];
                  var34 = this.field_a.field_m[param3];
                  var24 = var34;
                  var6 = var24;
                  if (null == this.field_b[param3]) {
                    array$0 = new Object[this.field_a.field_k[param3]];
                    this.field_b[param3] = array$0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var7 = this.field_b[param3];
                var8 = 1;
                var9_int = 0;
                L2: while (true) {
                  L3: {
                    if (var5_int <= var9_int) {
                      break L3;
                    } else {
                      L4: {
                        if (null == var6) {
                          var10 = var9_int;
                          break L4;
                        } else {
                          var10 = var34[var9_int];
                          break L4;
                        }
                      }
                      if (null != var7[var10]) {
                        var9_int++;
                        continue L2;
                      } else {
                        var8 = 0;
                        break L3;
                      }
                    }
                  }
                  if (var8 != 0) {
                    stackIn_22_0 = 1;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    L5: {
                      L6: {
                        if (null == param0) {
                          break L6;
                        } else {
                          L7: {
                            if (param0[0] != 0) {
                              break L7;
                            } else {
                              if (0 != param0[1]) {
                                break L7;
                              } else {
                                if (param0[2] != 0) {
                                  break L7;
                                } else {
                                  if (-1 != (param0[3] ^ -1)) {
                                    break L7;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          var35 = ne.a(90, this.field_c[param3], true);
                          var25 = var35;
                          var9 = var25;
                          var26 = new th(var35);
                          var26.a(5, var26.field_i.length, param1 ^ 12875, param0);
                          break L5;
                        }
                      }
                      var9 = ne.a(90, this.field_c[param3], false);
                      break L5;
                    }
                    try {
                      L8: {
                        var36 = ph.a((byte) -1, var9);
                        var27 = var36;
                        var23 = var27;
                        var43 = var23;
                        break L8;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L9: {
                        var11_ref_RuntimeException = decompiledCaughtException;
                        stackIn_35_0 = (RuntimeException) (var11_ref_RuntimeException);

                        stackIn_35_1 = new StringBuilder();

                        if (param0 == null) {
                          stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
                          stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
                          stackIn_36_2 = 0;
                          break L9;
                        } else {
                          stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
                          stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
                          stackIn_36_2 = 1;
                          break L9;
                        }
                      }
                      throw kk.a((Throwable) ((Object) stackIn_36_0), (stackIn_36_2 != 0) + " " + param3 + " " + param0.length + " " + pg.a((byte) 120, var9, param0.length) + " " + pg.a((byte) 122, var9, param0.length + -2) + " " + this.field_a.field_e[param3] + " " + this.field_a.field_t);
                    }
                    L10: {
                      if (this.field_d) {
                        this.field_c[param3] = null;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (param1 <= (var5_int ^ -1)) {
                        L12: {
                          if (var6 == null) {
                            var11 = 0;
                            break L12;
                          } else {
                            var11 = var34[0];
                            break L12;
                          }
                        }
                        if (-1 == (this.field_e ^ -1)) {
                          var7[var11] = mg.a((byte) 95, var43, false);
                          break L11;
                        } else {
                          var7[var11] = var36;
                          break L11;
                        }
                      } else {
                        if (2 != this.field_e) {
                          var11 = var36.length;
                          var11--;
                          var12 = var23[var11] & 255;
                          var11 = var11 - 4 * var5_int * var12;
                          var31 = new th(var43);
                          var39 = new int[var5_int];
                          var32 = var39;
                          var14 = var32;
                          var31.field_l = var11;
                          var15_int = 0;
                          L13: while (true) {
                            if (var12 <= var15_int) {
                              var40 = new byte[var5_int][];
                              var33 = var40;
                              var15 = var33;
                              var16 = 0;
                              L14: while (true) {
                                if (var16 >= var5_int) {
                                  var31.field_l = var11;
                                  var16 = 0;
                                  var17 = 0;
                                  L15: while (true) {
                                    if (var12 <= var17) {
                                      var17 = 0;
                                      L16: while (true) {
                                        if (var5_int <= var17) {
                                          break L11;
                                        } else {
                                          L17: {
                                            if (var6 == null) {
                                              var18 = var17;
                                              break L17;
                                            } else {
                                              var18 = var34[var17];
                                              break L17;
                                            }
                                          }
                                          L18: {
                                            if (0 != this.field_e) {
                                              var7[var18] = var40[var17];
                                              break L18;
                                            } else {
                                              var7[var18] = mg.a((byte) 112, var40[var17], false);
                                              break L18;
                                            }
                                          }
                                          var17++;
                                          continue L16;
                                        }
                                      }
                                    } else {
                                      var18 = 0;
                                      var19 = 0;
                                      L19: while (true) {
                                        if (var19 >= var5_int) {
                                          var17++;
                                          continue L15;
                                        } else {
                                          var18 = var18 + var31.a(-107);
                                          bc.a(var43, var16, var40[var19], var39[var19], var18);
                                          var14[var19] = var14[var19] + var18;
                                          var16 = var16 + var18;
                                          var19++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  array$1 = new byte[var39[var16]];
                                  var15[var16] = array$1;
                                  var39[var16] = 0;
                                  var16++;
                                  continue L14;
                                }
                              }
                            } else {
                              var16 = 0;
                              var17 = 0;
                              L20: while (true) {
                                if (var5_int <= var17) {
                                  var15_int++;
                                  continue L13;
                                } else {
                                  var16 = var16 + var31.a(-83);
                                  var14[var17] = var14[var17] + var16;
                                  var17++;
                                  continue L20;
                                }
                              }
                            }
                          }
                        } else {
                          var11 = var36.length;
                          var11--;
                          var12 = var23[var11] & 255;
                          var11 = var11 - 4 * (var12 * var5_int);
                          var29 = new th(var43);
                          var14_int = 0;
                          var29.field_l = var11;
                          var15_int = 0;
                          var16 = 0;
                          L21: while (true) {
                            if (var12 <= var16) {
                              if (var14_int == 0) {
                                stackIn_57_0 = 1;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                var44 = new byte[var14_int];
                                var14_int = 0;
                                var29.field_l = var11;
                                var17 = 0;
                                var18 = 0;
                                L22: while (true) {
                                  if (var18 >= var12) {
                                    var7[var15_int] = var44;
                                    return true;
                                  } else {
                                    var19 = 0;
                                    var20 = 0;
                                    L23: while (true) {
                                      if (var20 >= var5_int) {
                                        var18++;
                                        continue L22;
                                      } else {
                                        L24: {
                                          var19 = var19 + var29.a(91);
                                          if (var6 == null) {
                                            var21 = var20;
                                            break L24;
                                          } else {
                                            var21 = var34[var20];
                                            break L24;
                                          }
                                        }
                                        L25: {
                                          if (param2 != var21) {
                                            break L25;
                                          } else {
                                            bc.a(var43, var17, var44, var14_int, var19);
                                            var14_int = var14_int + var19;
                                            break L25;
                                          }
                                        }
                                        var17 = var17 + var19;
                                        var20++;
                                        continue L23;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              var17 = 0;
                              var18 = 0;
                              L26: while (true) {
                                if (var5_int <= var18) {
                                  var16++;
                                  continue L21;
                                } else {
                                  L27: {
                                    var17 = var17 + var29.a(-50);
                                    if (var6 == null) {
                                      var19 = var18;
                                      break L27;
                                    } else {
                                      var19 = var34[var18];
                                      break L27;
                                    }
                                  }
                                  L28: {
                                    if (param2 == var19) {
                                      var15_int = var19;
                                      var14_int = var14_int + var17;
                                      break L28;
                                    } else {
                                      break L28;
                                    }
                                  }
                                  var18++;
                                  continue L26;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    stackIn_101_0 = 1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L29: {
            var5 = decompiledCaughtException;
            stackIn_104_0 = (RuntimeException) (var5);

            stackIn_104_1 = new StringBuilder().append("gn.R(");

            if (param0 == null) {
              stackIn_105_0 = (RuntimeException) ((Object) stackIn_104_0);
              stackIn_105_1 = (StringBuilder) ((Object) stackIn_104_1);
              stackIn_105_2 = "null";
              break L29;
            } else {
              stackIn_105_0 = (RuntimeException) ((Object) stackIn_104_0);
              stackIn_105_1 = (StringBuilder) ((Object) stackIn_104_1);
              stackIn_105_2 = "{...}";
              break L29;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_105_0), stackIn_105_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_22_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_57_0 != 0;
              } else {
                return stackIn_101_0 != 0;
              }
            }
          }
        }
    }

    final boolean b(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.b((byte) -49)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param2 > 0) {
                  break L1;
                } else {
                  ((int[]) (this.field_c[15]))[2] = -38;
                  break L1;
                }
              }
              param0 = param0.toLowerCase();
              param1 = param1.toLowerCase();
              var6 = (CharSequence) ((Object) param0);
              var4_int = this.field_a.field_h.a(an.a(var6, 0), (byte) 24);
              if (!this.c(-1, var4_int)) {
                stackIn_9_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var7 = (CharSequence) ((Object) param1);
                var5 = this.field_a.field_c[var4_int].a(an.a(var7, 0), (byte) 24);
                stackIn_11_0 = this.b(var4_int, var5, -1);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("gn.DA(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    final synchronized int a(int param0, int param1) {
        if (param0 <= 63) {
            return -15;
        }
        if (!this.c(-1, param1)) {
            return 0;
        }
        if (!(null == this.field_c[param1])) {
            return 100;
        }
        return this.field_i.a(false, param1);
    }

    final byte[] a(String param0, int param1, int[] param2, String param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        byte[] stackIn_7_0 = null;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.b((byte) -54)) {
              param3 = param3.toLowerCase();
              param0 = param0.toLowerCase();
              var7 = (CharSequence) ((Object) param3);
              var5_int = this.field_a.field_h.a(an.a(var7, 0), (byte) 24);
              if (this.c(-1, var5_int)) {
                var8 = (CharSequence) ((Object) param0);
                var6 = this.field_a.field_c[var5_int].a(an.a(var8, param1), (byte) 24);
                stackIn_7_0 = this.a(param2, var6, var5_int, -4599);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("gn.K(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_11_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (byte[]) ((Object) stackIn_5_0);
          } else {
            return stackIn_7_0;
          }
        }
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        if (!(this.b((byte) -113))) {
            return false;
        }
        if (param2 != 877) {
            field_f = (go) null;
        }
        if (-1 < (param1 ^ -1) || 0 > param0 || param1 >= this.field_a.field_k.length || param0 >= this.field_a.field_k[param1]) {
            if (uj.field_e) {
                throw new IllegalArgumentException(param1 + " " + param0);
            }
            return false;
        }
        return true;
    }

    final int a(byte param0, int param1) {
        if (param0 < 109) {
            String var4 = (String) null;
            this.a(-3, (String) null, true);
        }
        if (!this.c(-1, param1)) {
            return 0;
        }
        return this.field_a.field_k[param1];
    }

    final synchronized byte[] b(int param0, int param1) {
        if (!this.b((byte) -94)) {
            return null;
        }
        if (param0 != 15950) {
            this.a(30, true, 45);
        }
        if (!((this.field_a.field_k.length ^ -1) != -2)) {
            return this.a(0, true, param1);
        }
        if (!this.c(param0 + -15951, param1)) {
            return null;
        }
        if (!((this.field_a.field_k[param1] ^ -1) != -2)) {
            return this.a(param1, true, 0);
        }
        throw new RuntimeException();
    }

    final boolean a(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.b((byte) -75)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                param1 = param1.toLowerCase();
                param0 = param0.toLowerCase();
                if (param2 == 23158) {
                  break L1;
                } else {
                  this.field_d = true;
                  break L1;
                }
              }
              var6 = (CharSequence) ((Object) param1);
              var4_int = this.field_a.field_h.a(an.a(var6, 0), (byte) 24);
              if (var4_int < 0) {
                stackIn_9_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var7 = (CharSequence) ((Object) param0);
                var5 = this.field_a.field_c[var4_int].a(an.a(var7, 0), (byte) 24);
                if (-1 >= (var5 ^ -1)) {
                  stackIn_14_0 = 1;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_12_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("gn.D(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0 != 0;
            } else {
              return stackIn_14_0 != 0;
            }
          }
        }
    }

    private final synchronized void e(int param0, int param1) {
        if (param1 < 68) {
            this.field_d = ((boolean[]) (this.field_c[2]))[3];
        }
        if (!this.field_d) {
            this.field_c[param0] = mg.a((byte) 106, this.field_i.a((byte) -83, param0), false);
        } else {
            this.field_c[param0] = this.field_i.a((byte) -95, param0);
        }
    }

    final synchronized boolean b(byte param0) {
        if (null == this.field_a) {
            this.field_a = this.field_i.a((byte) 74);
            if (!(null != this.field_a)) {
                return false;
            }
            this.field_c = new Object[this.field_a.field_o];
            this.field_b = new Object[this.field_a.field_o][];
        }
        if (param0 > -45) {
            return ((boolean[]) (((Object[]) (((Object[]) (this.field_c[34]))[0]))[1]))[7];
        }
        return true;
    }

    final int a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.b((byte) -94)) {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) ((Object) param0);
              var3_int = this.field_a.field_h.a(an.a(var4, param1), (byte) 24);
              stackIn_4_0 = this.a(param1 + 77, var3_int);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("gn.T(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final byte[] a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = this.c("", 3);
            if (-1 == var3_int) {
              var4 = 14 % ((-28 - param0) / 43);
              stackIn_4_0 = this.a("", false, param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = this.a(param1, false, "");
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("gn.BA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void a(boolean param0) {
        field_h = null;
        field_f = null;
        if (param0) {
            gn.a(false);
        }
        field_j = null;
    }

    private final synchronized boolean c(int param0, int param1) {
        if (!this.b((byte) -111)) {
          return false;
        } else {
          L0: {
            if (param1 < 0) {
              break L0;
            } else {
              if (param1 >= this.field_a.field_k.length) {
                break L0;
              } else {
                if (this.field_a.field_k[param1] == 0) {
                  break L0;
                } else {
                  if (param0 == -1) {
                    return true;
                  } else {
                    ((long[]) (((Object[]) (this.field_c[28]))[0]))[4] = ((long[]) (this.field_c[0]))[1];
                    return true;
                  }
                }
              }
            }
          }
          if (uj.field_e) {
            throw new IllegalArgumentException(Integer.toString(param1));
          } else {
            return false;
          }
        }
    }

    final boolean a(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.b((byte) -125)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1) {
                  break L1;
                } else {
                  this.field_a = (kn) (this.field_c[1]);
                  break L1;
                }
              }
              param0 = param0.toLowerCase();
              var4 = (CharSequence) ((Object) param0);
              var3_int = this.field_a.field_h.a(an.a(var4, 0), (byte) 24);
              if (-1 < (var3_int ^ -1)) {
                stackIn_9_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("gn.O(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    final byte[] a(int param0, boolean param1, int param2) {
        if (!param1) {
            ((long[]) (this.field_c[2]))[0] = 92L;
        }
        return this.a((int[]) null, param2, param0, -4599);
    }

    final synchronized byte[] a(String param0, boolean param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.b((byte) -71)) {
              L1: {
                param2 = param2.toLowerCase();
                param0 = param0.toLowerCase();
                var6 = (CharSequence) ((Object) param2);
                var4_int = this.field_a.field_h.a(an.a(var6, 0), (byte) 24);
                if (!param1) {
                  break L1;
                } else {
                  this.field_i = (ff) (((Object[]) (this.field_c[4]))[1]);
                  break L1;
                }
              }
              if (this.c(-1, var4_int)) {
                var7 = (CharSequence) ((Object) param0);
                var5 = this.field_a.field_c[var4_int].a(an.a(var7, 0), (byte) 24);
                stackIn_9_0 = this.a(var4_int, true, var5);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_7_0 = null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("gn.W(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_7_0);
        } else {
          return stackIn_9_0;
        }
    }

    final synchronized boolean d(int param0, int param1) {
        int var3 = -14 / ((-30 - param1) / 46);
        if (!this.c(-1, param0)) {
            return false;
        }
        if (!(this.field_c[param0] == null)) {
            return true;
        }
        this.e(param0, 89);
        if (this.field_c[param0] == null) {
            return false;
        }
        return true;
    }

    final boolean b(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.b((byte) -91)) {
              var3_int = -1 % ((param1 - -19) / 59);
              param0 = param0.toLowerCase();
              var5 = (CharSequence) ((Object) param0);
              var4 = this.field_a.field_h.a(an.a(var5, 0), (byte) 24);
              stackIn_4_0 = this.d(var4, 113);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("gn.J(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    private final synchronized byte[] a(int[] param0, int param1, int param2, int param3) {
        Object stackIn_4_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        Object stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        byte[] var7 = null;
        try {
          L0: {
            L1: {
              if (param3 == -4599) {
                break L1;
              } else {
                this.a((String) (this.field_c[1]), (String) (this.field_c[23]), ((int[]) (this.field_c[9]))[18]);
                break L1;
              }
            }
            if (this.a(param1, param2, param3 + 5476)) {
              L2: {
                L3: {
                  var5 = null;
                  if (this.field_b[param2] == null) {
                    break L3;
                  } else {
                    if (null == this.field_b[param2][param1]) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                if (!this.b(param0, param3 ^ 4599, param1, param2)) {
                  this.e(param2, param3 ^ -4515);
                  if (this.b(param0, -2, param1, param2)) {
                    break L2;
                  } else {
                    stackIn_12_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L2;
                }
              }
              if (null == this.field_b[param2]) {
                throw new RuntimeException("");
              } else {
                L4: {
                  if (null == this.field_b[param2][param1]) {
                    break L4;
                  } else {
                    var7 = ne.a(90, this.field_b[param2][param1], false);
                    var5 = var7;
                    if (var7 != null) {
                      break L4;
                    } else {
                      throw new RuntimeException("");
                    }
                  }
                }
                L5: {
                  if (var5 == null) {
                    break L5;
                  } else {
                    if (this.field_e != 1) {
                      if (2 == this.field_e) {
                        this.field_b[param2] = null;
                        break L5;
                      } else {
                        break L5;
                      }
                    } else {
                      this.field_b[param2][param1] = null;
                      if ((this.field_a.field_k[param2] ^ -1) != -2) {
                        break L5;
                      } else {
                        this.field_b[param2] = null;
                        break L5;
                      }
                    }
                  }
                }
                stackIn_27_0 = var5;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_30_0 = var5;

            stackIn_30_1 = new StringBuilder().append("gn.Q(");

            if (param0 == null) {
              stackIn_31_0 = stackIn_30_0;
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L6;
            } else {
              stackIn_31_0 = stackIn_30_0;
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L6;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (byte[]) ((Object) stackIn_12_0);
          } else {
            return (byte[]) ((Object) stackIn_27_0);
          }
        }
    }

    final int c(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.b((byte) -84)) {
              stackIn_3_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) ((Object) param0);
              var3_int = this.field_a.field_h.a(an.a(var4, 0), (byte) 24);
              if (!this.c(-1, var3_int)) {
                stackIn_7_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param1 == 3) {
                  stackIn_12_0 = var3_int;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_10_0 = -69;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("gn.N(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L1;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L1;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_12_0;
            }
          }
        }
    }

    final synchronized boolean b(int param0, int param1, int param2) {
        if (!this.a(param1, param0, 877)) {
            return false;
        }
        if (null != this.field_b[param0]) {
            if (!(this.field_b[param0][param1] == null)) {
                return true;
            }
        }
        if (!(this.field_c[param0] == null)) {
            return true;
        }
        this.e(param0, 83);
        if (param2 != -1) {
            this.a(-30, 89);
        }
        if (null == this.field_c[param0]) {
            return false;
        }
        return true;
    }

    final synchronized boolean a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = HoldTheLine.field_D;
        if (this.b((byte) -100)) {
          var3 = -65 % ((8 - param0) / 57);
          var2 = 1;
          var4 = 0;
          L0: while (true) {
            if (this.field_a.field_n.length <= var4) {
              return var2 != 0;
            } else {
              var5 = this.field_a.field_n[var4];
              if (this.field_c[var5] == null) {
                this.e(var5, 112);
                if (this.field_c[var5] == null) {
                  var2 = 0;
                  var4++;
                  continue L0;
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return false;
        }
    }

    gn(ff param0, boolean param1, int param2) {
        this.field_a = null;
        try {
            if (0 > param2 || param2 > 2) {
                throw new IllegalArgumentException("");
            }
            this.field_d = param1 ? true : false;
            this.field_e = param2;
            this.field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "gn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_g = false;
        field_h = "Speed";
        field_j = new int[]{5, 5, 2};
    }
}
