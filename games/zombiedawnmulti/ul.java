/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul {
    int field_b;
    static ip field_n;
    static String[][] field_m;
    boolean field_j;
    private Object[][] field_l;
    private Object[] field_g;
    private be field_k;
    static String field_c;
    private ng field_a;
    static String field_i;
    static String field_d;
    static String field_h;
    static boolean field_e;
    static ri field_f;

    final synchronized byte[] a(String param0, String param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a((byte) -120)) {
              L1: {
                param0 = param0.toLowerCase();
                param1 = param1.toLowerCase();
                var6 = (CharSequence) ((Object) param0);
                var4_int = this.field_k.field_d.a(1481485697, kd.a(var6, -79));
                if (!param2) {
                  break L1;
                } else {
                  ul.b(((byte[]) (this.field_g[3]))[9]);
                  break L1;
                }
              }
              if (this.b(var4_int, -120)) {
                var7 = (CharSequence) ((Object) param1);
                var5 = this.field_k.field_n[var4_int].a(1481485697, kd.a(var7, -93));
                stackIn_9_0 = this.a(var4_int, true, var5);
                break L0;
              } else {
                return null;
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

            stackIn_12_1 = new StringBuilder().append("ul.V(");

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


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param2 + ')');
        }
        return stackIn_9_0;
    }

    final boolean a(boolean param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.a((byte) -110)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (!param0) {
                  break L1;
                } else {
                  this.field_l = (Object[][]) null;
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              var4 = (CharSequence) ((Object) param1);
              var3_int = this.field_k.field_d.a(1481485697, kd.a(var4, -53));
              stackIn_7_0 = this.a(-126, var3_int);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("ul.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_7_0;
        }
    }

    final synchronized boolean a(int param0, int param1) {
        if (!(this.b(param1, 101))) {
            return false;
        }
        if (this.field_g[param1] != null) {
            return true;
        }
        this.c(-127, param1);
        if (param0 > -118) {
            return false;
        }
        if (this.field_g[param1] == null) {
            return false;
        }
        return true;
    }

    final synchronized boolean b(int param0, int param1, int param2) {
        if (!this.a(param0, 6327, param1)) {
            return false;
        }
        if (param2 != 0) {
            return false;
        }
        if (null != this.field_l[param1] && null != this.field_l[param1][param0]) {
            return true;
        }
        if (!(null == this.field_g[param1])) {
            return true;
        }
        this.c(-113, param1);
        if (null == this.field_g[param1]) {
            return false;
        }
        return true;
    }

    private final synchronized void c(int param0, int param1) {
        if (!this.field_j) {
            this.field_g[param1] = ai.a(-137, false, this.field_a.a(-123, param1));
        } else {
            this.field_g[param1] = this.field_a.a(-123, param1);
        }
        if (param0 >= -85) {
            this.field_k = (be) null;
        }
    }

    public static void b(byte param0) {
        field_c = null;
        field_h = null;
        if (param0 != -35) {
            ul.b((byte) -55);
        }
        field_m = (String[][]) null;
        field_n = null;
        field_f = null;
        field_d = null;
        field_i = null;
    }

    private final synchronized byte[] a(int param0, int param1, int param2, int[] param3) {
        byte[] stackIn_20_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        Object stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        byte[] var7 = null;
        try {
          L0: {
            if (this.a(param1, param2 ^ -31366, param0)) {
              L1: {
                L2: {
                  var5 = null;
                  if (this.field_l[param0] == null) {
                    break L2;
                  } else {
                    if (null == this.field_l[param0][param1]) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                if (this.a(param0, true, param3, param1)) {
                  break L1;
                } else {
                  this.c(-101, param0);
                  if (this.a(param0, true, param3, param1)) {
                    break L1;
                  } else {
                    return null;
                  }
                }
              }
              if (this.field_l[param0] == null) {
                throw new RuntimeException("");
              } else {
                L3: {
                  if (null != this.field_l[param0][param1]) {
                    var7 = h.a(this.field_l[param0][param1], -110, false);
                    var5 = var7;
                    if (var7 == null) {
                      throw new RuntimeException("");
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                if (param2 == -25139) {
                  L4: {
                    if (var5 == null) {
                      break L4;
                    } else {
                      if (1 != this.field_b) {
                        if (2 != this.field_b) {
                          break L4;
                        } else {
                          this.field_l[param0] = null;
                          break L4;
                        }
                      } else {
                        this.field_l[param0][param1] = null;
                        if ((this.field_k.field_b[param0] ^ -1) != -2) {
                          break L4;
                        } else {
                          this.field_l[param0] = null;
                          break L4;
                        }
                      }
                    }
                  }
                  stackIn_28_0 = var5;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_20_0 = (byte[]) null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_31_0 = var5;

            stackIn_31_1 = new StringBuilder().append("ul.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_32_0 = stackIn_31_0;
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L5;
            } else {
              stackIn_32_0 = stackIn_31_0;
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_20_0;
        } else {
          return (byte[]) ((Object) stackIn_28_0);
        }
    }

    private final synchronized boolean a(int param0, boolean param1, int[] param2, int param3) {
        Object[] array$0 = null;
        byte[] array$1 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_62_0 = 0;
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
        k var26 = null;
        byte[] var27 = null;
        k var29 = null;
        k var31 = null;
        int[] var32 = null;
        byte[][] var33 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        var22 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (this.b(param0, -116)) {
              if (this.field_g[param0] != null) {
                L1: {
                  var5_int = this.field_k.field_s[param0];
                  var34 = this.field_k.field_i[param0];
                  var24 = var34;
                  var6 = var24;
                  if (null == this.field_l[param0]) {
                    array$0 = new Object[this.field_k.field_b[param0]];
                    this.field_l[param0] = array$0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var7 = this.field_l[param0];
                var8 = param1 ? 1 : 0;
                var9_int = 0;
                L2: while (true) {
                  L3: {
                    if (var9_int >= var5_int) {
                      break L3;
                    } else {
                      L4: {
                        if (var6 != null) {
                          var10 = var34[var9_int];
                          break L4;
                        } else {
                          var10 = var9_int;
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
                    stackIn_21_0 = 1;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    L5: {
                      L6: {
                        if (param2 == null) {
                          break L6;
                        } else {
                          L7: {
                            if (0 != param2[0]) {
                              break L7;
                            } else {
                              if (-1 != (param2[1] ^ -1)) {
                                break L7;
                              } else {
                                if (param2[2] != 0) {
                                  break L7;
                                } else {
                                  if (-1 == (param2[3] ^ -1)) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                          var35 = h.a(this.field_g[param0], -42, true);
                          var25 = var35;
                          var9 = var25;
                          var26 = new k(var35);
                          var26.a(var26.field_m.length, param2, -2564, 5);
                          break L5;
                        }
                      }
                      var9 = h.a(this.field_g[param0], -124, false);
                      break L5;
                    }
                    try {
                      L8: {
                        var36 = hb.a(var9, 0);
                        var27 = var36;
                        var23 = var27;
                        var43 = var23;
                        break L8;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L9: {
                        var11_ref_RuntimeException = decompiledCaughtException;
                        stackIn_34_0 = (RuntimeException) (var11_ref_RuntimeException);

                        stackIn_34_1 = new StringBuilder();

                        if (param2 == null) {
                          stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
                          stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
                          stackIn_35_2 = 0;
                          break L9;
                        } else {
                          stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
                          stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
                          stackIn_35_2 = 1;
                          break L9;
                        }
                      }
                      throw fa.a((Throwable) ((Object) stackIn_35_0), (stackIn_35_2 != 0) + " " + param0 + " " + var9.length + " " + pb.a(var9, var9.length, (byte) -42) + " " + pb.a(var9, -2 + var9.length, (byte) 109) + " " + this.field_k.field_r[param0] + " " + this.field_k.field_o);
                    }
                    L10: {
                      if (this.field_j) {
                        this.field_g[param0] = null;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (-2 > (var5_int ^ -1)) {
                        if (this.field_b != 2) {
                          var11 = var36.length;
                          var11--;
                          var12 = 255 & var23[var11];
                          var11 = var11 - 4 * var12 * var5_int;
                          var31 = new k(var43);
                          var39 = new int[var5_int];
                          var32 = var39;
                          var14 = var32;
                          var31.field_j = var11;
                          var15_int = 0;
                          L12: while (true) {
                            if (var12 <= var15_int) {
                              var40 = new byte[var5_int][];
                              var33 = var40;
                              var15 = var33;
                              var16 = 0;
                              L13: while (true) {
                                if (var16 >= var5_int) {
                                  var31.field_j = var11;
                                  var16 = 0;
                                  var17 = 0;
                                  L14: while (true) {
                                    if (var12 <= var17) {
                                      var17 = 0;
                                      L15: while (true) {
                                        if (var17 >= var5_int) {
                                          break L11;
                                        } else {
                                          L16: {
                                            if (var6 != null) {
                                              var18 = var34[var17];
                                              break L16;
                                            } else {
                                              var18 = var17;
                                              break L16;
                                            }
                                          }
                                          L17: {
                                            if (this.field_b != 0) {
                                              var7[var18] = var40[var17];
                                              break L17;
                                            } else {
                                              var7[var18] = ai.a(-137, false, var40[var17]);
                                              break L17;
                                            }
                                          }
                                          var17++;
                                          continue L15;
                                        }
                                      }
                                    } else {
                                      var18 = 0;
                                      var19 = 0;
                                      L18: while (true) {
                                        if (var19 >= var5_int) {
                                          var17++;
                                          continue L14;
                                        } else {
                                          var18 = var18 + var31.i(-1478490344);
                                          d.a(var43, var16, var40[var19], var39[var19], var18);
                                          var16 = var16 + var18;
                                          var14[var19] = var14[var19] + var18;
                                          var19++;
                                          continue L18;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  array$1 = new byte[var39[var16]];
                                  var15[var16] = array$1;
                                  var39[var16] = 0;
                                  var16++;
                                  continue L13;
                                }
                              }
                            } else {
                              var16 = 0;
                              var17 = 0;
                              L19: while (true) {
                                if (var5_int <= var17) {
                                  var15_int++;
                                  continue L12;
                                } else {
                                  var16 = var16 + var31.i(-1478490344);
                                  var14[var17] = var14[var17] + var16;
                                  var17++;
                                  continue L19;
                                }
                              }
                            }
                          }
                        } else {
                          var11 = var36.length;
                          var11--;
                          var12 = 255 & var23[var11];
                          var11 = var11 - var12 * (var5_int * 4);
                          var29 = new k(var43);
                          var14_int = 0;
                          var15_int = 0;
                          var29.field_j = var11;
                          var16 = 0;
                          L20: while (true) {
                            if (var16 >= var12) {
                              if (0 == var14_int) {
                                stackIn_62_0 = 1;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                var44 = new byte[var14_int];
                                var29.field_j = var11;
                                var14_int = 0;
                                var17 = 0;
                                var18 = 0;
                                L21: while (true) {
                                  if (var18 >= var12) {
                                    var7[var15_int] = var44;
                                    break L11;
                                  } else {
                                    var19 = 0;
                                    var20 = 0;
                                    L22: while (true) {
                                      if (var20 >= var5_int) {
                                        var18++;
                                        continue L21;
                                      } else {
                                        L23: {
                                          var19 = var19 + var29.i(-1478490344);
                                          if (var6 != null) {
                                            var21 = var34[var20];
                                            break L23;
                                          } else {
                                            var21 = var20;
                                            break L23;
                                          }
                                        }
                                        L24: {
                                          if (var21 == param3) {
                                            d.a(var43, var17, var44, var14_int, var19);
                                            var14_int = var14_int + var19;
                                            break L24;
                                          } else {
                                            break L24;
                                          }
                                        }
                                        var17 = var17 + var19;
                                        var20++;
                                        continue L22;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              var17 = 0;
                              var18 = 0;
                              L25: while (true) {
                                if (var5_int <= var18) {
                                  var16++;
                                  continue L20;
                                } else {
                                  L26: {
                                    var17 = var17 + var29.i(-1478490344);
                                    if (var6 != null) {
                                      var19 = var34[var18];
                                      break L26;
                                    } else {
                                      var19 = var18;
                                      break L26;
                                    }
                                  }
                                  L27: {
                                    if (var19 == param3) {
                                      var14_int = var14_int + var17;
                                      var15_int = var19;
                                      break L27;
                                    } else {
                                      break L27;
                                    }
                                  }
                                  var18++;
                                  continue L25;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        L28: {
                          if (var6 == null) {
                            var11 = 0;
                            break L28;
                          } else {
                            var11 = var34[0];
                            break L28;
                          }
                        }
                        if (this.field_b != 0) {
                          var7[var11] = var43;
                          break L11;
                        } else {
                          var7[var11] = ai.a(-137, false, var36);
                          return true;
                        }
                      }
                    }
                    stackIn_101_0 = 1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                }
              } else {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
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

            stackIn_104_1 = new StringBuilder().append("ul.M(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_105_0), stackIn_105_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_21_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_62_0 != 0;
              } else {
                return stackIn_101_0 != 0;
              }
            }
          }
        }
    }

    final synchronized int b(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (!this.a((byte) -115)) {
          return 0;
        } else {
          var2 = 0;
          var3 = param0;
          var4 = 0;
          L0: while (true) {
            if (this.field_g.length <= var4) {
              if (-1 == (var2 ^ -1)) {
                return 100;
              } else {
                var4 = var3 * 100 / var2;
                return var4;
              }
            } else {
              if (-1 > (this.field_k.field_s[var4] ^ -1)) {
                var2 += 100;
                var3 = var3 + this.a(var4, (byte) 120);
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        }
    }

    final int a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a((byte) -109)) {
              param0 = param0.toLowerCase();
              var5 = (CharSequence) ((Object) param0);
              var3_int = this.field_k.field_d.a(1481485697, kd.a(var5, -37));
              if (!this.b(var3_int, -114)) {
                stackIn_6_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var4 = 7 % ((54 - param1) / 51);
                stackIn_8_0 = var3_int;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_2_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("ul.P(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L1;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L1;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_8_0;
          }
        }
    }

    final int a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.a((byte) -115)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                param1 = param1.toLowerCase();
                if (param0 == 0) {
                  break L1;
                } else {
                  this.field_a = (ng) (this.field_g[27]);
                  break L1;
                }
              }
              var4 = (CharSequence) ((Object) param1);
              var3_int = this.field_k.field_d.a(1481485697, kd.a(var4, param0 + -17));
              stackIn_7_0 = this.a(var3_int, (byte) 125);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("ul.W(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_7_0;
        }
    }

    final int c(int param0) {
        if (param0 != -1) {
            return 115;
        }
        if (!(this.a((byte) -108))) {
            return -1;
        }
        return this.field_k.field_b.length;
    }

    final int d(int param0, int param1) {
        if (!this.b(param0, param1 ^ -16)) {
            return 0;
        }
        if (param1 != -2) {
            this.c(((int[]) (((Object[]) (this.field_g[7]))[9]))[0], ((int[]) (this.field_g[0]))[2]);
        }
        return this.field_k.field_b[param0];
    }

    final synchronized boolean a(byte param0) {
        if (param0 > -107) {
            return false;
        }
        if (null == this.field_k) {
            this.field_k = this.field_a.a((byte) -106);
            if (this.field_k == null) {
                return false;
            }
            this.field_l = new Object[this.field_k.field_e][];
            this.field_g = new Object[this.field_k.field_e];
        }
        return true;
    }

    final synchronized boolean a(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.a((byte) -109)) {
          var2 = 1;
          var3 = param0;
          L0: while (true) {
            if (var3 >= this.field_k.field_l.length) {
              return var2 != 0;
            } else {
              var4 = this.field_k.field_l[var3];
              if (null == this.field_g[var4]) {
                this.c(-91, var4);
                if (null == this.field_g[var4]) {
                  var2 = 0;
                  var3++;
                  continue L0;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return false;
        }
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        if (!this.a((byte) -116)) {
          return false;
        } else {
          L0: {
            if ((param2 ^ -1) > -1) {
              break L0;
            } else {
              if ((param0 ^ -1) > -1) {
                break L0;
              } else {
                if (param2 >= this.field_k.field_b.length) {
                  break L0;
                } else {
                  if (this.field_k.field_b[param2] <= param0) {
                    break L0;
                  } else {
                    if (param1 == 6327) {
                      return true;
                    } else {
                      return ((boolean[]) (this.field_g[17]))[2];
                    }
                  }
                }
              }
            }
          }
          if (em.field_P) {
            throw new IllegalArgumentException(param2 + " " + param0);
          } else {
            return false;
          }
        }
    }

    private final synchronized boolean b(int param0, int param1) {
        int var3;
        if (!this.a((byte) -111)) {
          return false;
        } else {
          L0: {
            if ((param0 ^ -1) > -1) {
              break L0;
            } else {
              if (param0 >= this.field_k.field_b.length) {
                break L0;
              } else {
                if (-1 == (this.field_k.field_b[param0] ^ -1)) {
                  break L0;
                } else {
                  var3 = -116 / ((param1 - -61) / 53);
                  return true;
                }
              }
            }
          }
          if (!em.field_P) {
            return false;
          } else {
            throw new IllegalArgumentException(Integer.toString(param0));
          }
        }
    }

    final boolean a(byte param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.a((byte) -118)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param2 = param2.toLowerCase();
              param1 = param1.toLowerCase();
              var6 = (CharSequence) ((Object) param2);
              var4_int = this.field_k.field_d.a(1481485697, kd.a(var6, 121));
              if (!this.b(var4_int, 10)) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0 < -23) {
                  var7 = (CharSequence) ((Object) param1);
                  var5 = this.field_k.field_n[var4_int].a(1481485697, kd.a(var7, 125));
                  stackIn_12_0 = this.b(var5, var4_int, 0);
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_10_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("ul.R(").append(param0).append(',');

            if (param1 == null) {
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
          L2: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0 != 0;
            } else {
              return stackIn_12_0;
            }
          }
        }
    }

    final boolean a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a((byte) -112)) {
              L1: {
                param0 = param0.toLowerCase();
                var4 = (CharSequence) ((Object) param0);
                var3_int = this.field_k.field_d.a(1481485697, kd.a(var4, param1 ^ -81));
                if (param1 == 2) {
                  break L1;
                } else {
                  ((long[]) (this.field_g[1]))[15] = 4L;
                  break L1;
                }
              }
              if ((var3_int ^ -1) > -1) {
                stackIn_8_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return true;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("ul.G(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    final synchronized byte[] a(byte param0, int param1) {
        if (param0 != -77) {
            ul.b((byte) -63);
        }
        if (!this.a((byte) -128)) {
            return null;
        }
        if (!(this.field_k.field_b.length != 1)) {
            return this.a(0, true, param1);
        }
        if (!this.b(param1, -123)) {
            return null;
        }
        if (this.field_k.field_b[param1] == 1) {
            return this.a(param1, true, 0);
        }
        throw new RuntimeException();
    }

    final synchronized int a(int param0, byte param1) {
        if (!(this.b(param0, 55))) {
            return 0;
        }
        if (null != this.field_g[param0]) {
            return 100;
        }
        if (param1 < 96) {
            this.field_b = ((int[]) (this.field_g[16]))[7];
        }
        return this.field_a.b(param0, -3);
    }

    final int a(String param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.b(param1, param2 + -117)) {
              L1: {
                param0 = param0.toLowerCase();
                if (param2 == -1) {
                  break L1;
                } else {
                  ((boolean[]) (this.field_g[0]))[27] = true;
                  break L1;
                }
              }
              var5 = (CharSequence) ((Object) param0);
              var4_int = this.field_k.field_n[param1].a(param2 ^ -1481485698, kd.a(var5, param2 + 126));
              if (!this.a(var4_int, 6327, param1)) {
                stackIn_8_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return var4_int;
              }
            } else {
              stackIn_2_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("ul.U(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_8_0;
        }
    }

    final byte[] a(int param0, boolean param1, int param2) {
        if (!param1) {
            this.b(((int[]) (this.field_g[0]))[5]);
        }
        return this.a(param0, param2, -25139, (int[]) null);
    }

    ul(ng param0, boolean param1, int param2) {
        this.field_k = null;
        try {
            if (0 > param2 || 2 < param2) {
                throw new IllegalArgumentException("");
            }
            this.field_a = param0;
            this.field_j = param1 ? true : false;
            this.field_b = param2;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ul.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_c = "Your zombies won't wander about if you train them to focus.";
        field_i = "Your hordes will move as fast as lightning...especially if you also equip Determined.";
        field_n = new ip();
        field_d = "Detonate";
        field_h = "Starve your zombies before unleashing them on humans! They'll lunge even faster and from further away than with Hungry.";
    }
}
