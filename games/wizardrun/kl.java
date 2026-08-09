/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl {
    private Object[][] field_c;
    private Object[] field_b;
    private boolean field_a;
    static String field_e;
    private hl field_g;
    private int field_f;
    private pc field_d;

    final boolean a(byte param0, String param1) {
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
            if (!this.b(17820)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                param1 = param1.toLowerCase();
                if (param0 == 29) {
                  break L1;
                } else {
                  ((long[]) (this.field_b[0]))[20] = -49L;
                  break L1;
                }
              }
              var4 = (CharSequence) ((Object) param1);
              var3_int = this.field_d.field_h.b((byte) 60, wj.a(var4, 2148));
              stackIn_7_0 = this.a(false, var3_int);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("kl.D(").append(param0).append(',');

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
          throw bd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_7_0;
        }
    }

    final int b(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
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
            if (this.b(param0 + 17821)) {
              L1: {
                if (param0 == -1) {
                  break L1;
                } else {
                  var4 = (String) null;
                  this.a(((byte[]) (this.field_b[0]))[10], (String) null);
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              var5 = (CharSequence) ((Object) param1);
              var3_int = this.field_d.field_h.b((byte) 98, wj.a(var5, 2148));
              if (!this.a(var3_int, 6447)) {
                stackIn_8_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return var3_int;
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
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("kl.AA(").append(param0).append(',');

            if (param1 == null) {
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
          throw bd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_8_0;
        }
    }

    final int a(int param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
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
              if (param2 == -11986) {
                break L1;
              } else {
                this.field_b = (Object[]) null;
                break L1;
              }
            }
            if (this.a(param0, 6447)) {
              param1 = param1.toLowerCase();
              var5 = (CharSequence) ((Object) param1);
              var4_int = this.field_d.field_x[param0].b((byte) 80, wj.a(var5, 2148));
              if (this.a(var4_int, param0, true)) {
                stackIn_9_0 = var4_int;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_7_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_4_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("kl.T(").append(param0).append(',');

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
          throw bd.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_9_0;
          }
        }
    }

    private final synchronized boolean a(boolean param0, int[] param1, int param2, int param3) {
        Object[] array$0 = null;
        byte[] array$1 = null;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        int stackIn_58_0 = 0;
        int stackIn_102_0 = 0;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        String stackIn_106_2 = null;
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
        va var26 = null;
        byte[] var27 = null;
        va var29 = null;
        va var31 = null;
        int[] var32 = null;
        byte[][] var33 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        var22 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                ((long[]) (this.field_b[0]))[29] = 95L;
                break L1;
              }
            }
            if (!this.a(param2, 6447)) {
              stackIn_6_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (null == this.field_b[param2]) {
                stackIn_10_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L2: {
                  var5_int = this.field_d.field_p[param2];
                  var34 = this.field_d.field_w[param2];
                  var24 = var34;
                  var6 = var24;
                  if (this.field_c[param2] == null) {
                    array$0 = new Object[this.field_d.field_t[param2]];
                    this.field_c[param2] = array$0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var7 = this.field_c[param2];
                var8 = 1;
                var9_int = 0;
                L3: while (true) {
                  L4: {
                    if (var9_int >= var5_int) {
                      break L4;
                    } else {
                      L5: {
                        if (null == var6) {
                          var10 = var9_int;
                          break L5;
                        } else {
                          var10 = var34[var9_int];
                          break L5;
                        }
                      }
                      if (null != var7[var10]) {
                        var9_int++;
                        continue L3;
                      } else {
                        var8 = 0;
                        break L4;
                      }
                    }
                  }
                  if (var8 != 0) {
                    stackIn_25_0 = 1;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    L6: {
                      L7: {
                        if (null == param1) {
                          break L7;
                        } else {
                          L8: {
                            if (param1[0] != 0) {
                              break L8;
                            } else {
                              if (param1[1] != 0) {
                                break L8;
                              } else {
                                if (0 != param1[2]) {
                                  break L8;
                                } else {
                                  if (0 != param1[3]) {
                                    break L8;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                          var35 = bh.a((byte) 104, this.field_b[param2], true);
                          var25 = var35;
                          var9 = var25;
                          var26 = new va(var35);
                          var26.a(param0, param1, 5, var26.field_k.length);
                          break L6;
                        }
                      }
                      var9 = bh.a((byte) 115, this.field_b[param2], false);
                      break L6;
                    }
                    try {
                      L9: {
                        var36 = dg.a(var9, 31027);
                        var27 = var36;
                        var23 = var27;
                        var43 = var23;
                        break L9;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L10: {
                        var11_ref_RuntimeException = decompiledCaughtException;
                        stackIn_38_0 = (RuntimeException) (var11_ref_RuntimeException);

                        stackIn_38_1 = new StringBuilder();

                        if (param1 == null) {
                          stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
                          stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
                          stackIn_39_2 = 0;
                          break L10;
                        } else {
                          stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
                          stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
                          stackIn_39_2 = 1;
                          break L10;
                        }
                      }
                      throw bd.a((Throwable) ((Object) stackIn_39_0), (stackIn_39_2 != 0) + " " + param2 + " " + param1.length + " " + bi.a(var9, 10510, param1.length) + " " + bi.a(var9, 10510, -2 + param1.length) + " " + this.field_d.field_q[param2] + " " + this.field_d.field_i);
                    }
                    L11: {
                      if (this.field_a) {
                        this.field_b[param2] = null;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (1 >= var5_int) {
                        L13: {
                          if (var6 != null) {
                            var11 = var34[0];
                            break L13;
                          } else {
                            var11 = 0;
                            break L13;
                          }
                        }
                        if (this.field_f != 0) {
                          var7[var11] = var43;
                          break L12;
                        } else {
                          var7[var11] = pi.a(var36, 0, false);
                          break L12;
                        }
                      } else {
                        if ((this.field_f ^ -1) != -3) {
                          var11 = var36.length;
                          var11--;
                          var12 = 255 & var23[var11];
                          var11 = var11 - var5_int * var12 * 4;
                          var31 = new va(var43);
                          var39 = new int[var5_int];
                          var32 = var39;
                          var14 = var32;
                          var31.field_m = var11;
                          var15_int = 0;
                          L14: while (true) {
                            if (var12 <= var15_int) {
                              var40 = new byte[var5_int][];
                              var33 = var40;
                              var15 = var33;
                              var16 = 0;
                              L15: while (true) {
                                if (var16 >= var5_int) {
                                  var31.field_m = var11;
                                  var16 = 0;
                                  var17 = 0;
                                  L16: while (true) {
                                    if (var17 >= var12) {
                                      var17 = 0;
                                      L17: while (true) {
                                        if (var5_int <= var17) {
                                          break L12;
                                        } else {
                                          L18: {
                                            if (var6 != null) {
                                              var18 = var34[var17];
                                              break L18;
                                            } else {
                                              var18 = var17;
                                              break L18;
                                            }
                                          }
                                          L19: {
                                            if (0 == this.field_f) {
                                              var7[var18] = pi.a(var40[var17], 0, false);
                                              break L19;
                                            } else {
                                              var7[var18] = var40[var17];
                                              break L19;
                                            }
                                          }
                                          var17++;
                                          continue L17;
                                        }
                                      }
                                    } else {
                                      var18 = 0;
                                      var19 = 0;
                                      L20: while (true) {
                                        if (var19 >= var5_int) {
                                          var17++;
                                          continue L16;
                                        } else {
                                          var18 = var18 + var31.i(255);
                                          g.a(var43, var16, var40[var19], var39[var19], var18);
                                          var16 = var16 + var18;
                                          var14[var19] = var14[var19] + var18;
                                          var19++;
                                          continue L20;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  array$1 = new byte[var39[var16]];
                                  var15[var16] = array$1;
                                  var39[var16] = 0;
                                  var16++;
                                  continue L15;
                                }
                              }
                            } else {
                              var16 = 0;
                              var17 = 0;
                              L21: while (true) {
                                if (var17 >= var5_int) {
                                  var15_int++;
                                  continue L14;
                                } else {
                                  var16 = var16 + var31.i(255);
                                  var14[var17] = var14[var17] + var16;
                                  var17++;
                                  continue L21;
                                }
                              }
                            }
                          }
                        } else {
                          var11 = var36.length;
                          var11--;
                          var12 = var23[var11] & 255;
                          var11 = var11 - 4 * var12 * var5_int;
                          var29 = new va(var43);
                          var14_int = 0;
                          var15_int = 0;
                          var29.field_m = var11;
                          var16 = 0;
                          L22: while (true) {
                            if (var16 >= var12) {
                              if (-1 != (var14_int ^ -1)) {
                                var44 = new byte[var14_int];
                                var29.field_m = var11;
                                var14_int = 0;
                                var17 = 0;
                                var18 = 0;
                                L23: while (true) {
                                  if (var18 >= var12) {
                                    var7[var15_int] = var44;
                                    return true;
                                  } else {
                                    var19 = 0;
                                    var20 = 0;
                                    L24: while (true) {
                                      if (var5_int <= var20) {
                                        var18++;
                                        continue L23;
                                      } else {
                                        L25: {
                                          var19 = var19 + var29.i(255);
                                          if (var6 != null) {
                                            var21 = var34[var20];
                                            break L25;
                                          } else {
                                            var21 = var20;
                                            break L25;
                                          }
                                        }
                                        L26: {
                                          if (param3 != var21) {
                                            break L26;
                                          } else {
                                            g.a(var43, var17, var44, var14_int, var19);
                                            var14_int = var14_int + var19;
                                            break L26;
                                          }
                                        }
                                        var17 = var17 + var19;
                                        var20++;
                                        continue L24;
                                      }
                                    }
                                  }
                                }
                              } else {
                                stackIn_58_0 = 1;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              }
                            } else {
                              var17 = 0;
                              var18 = 0;
                              L27: while (true) {
                                if (var5_int <= var18) {
                                  var16++;
                                  continue L22;
                                } else {
                                  L28: {
                                    var17 = var17 + var29.i(255);
                                    if (var6 == null) {
                                      var19 = var18;
                                      break L28;
                                    } else {
                                      var19 = var34[var18];
                                      break L28;
                                    }
                                  }
                                  if (param3 == var19) {
                                    var14_int = var14_int + var17;
                                    var15_int = var19;
                                    var18++;
                                    continue L27;
                                  } else {
                                    var18++;
                                    continue L27;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    stackIn_102_0 = 1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L29: {
            var5 = decompiledCaughtException;
            stackIn_105_0 = (RuntimeException) (var5);

            stackIn_105_1 = new StringBuilder().append("kl.Q(").append(param0).append(',');

            if (param1 == null) {
              stackIn_106_0 = (RuntimeException) ((Object) stackIn_105_0);
              stackIn_106_1 = (StringBuilder) ((Object) stackIn_105_1);
              stackIn_106_2 = "null";
              break L29;
            } else {
              stackIn_106_0 = (RuntimeException) ((Object) stackIn_105_0);
              stackIn_106_1 = (StringBuilder) ((Object) stackIn_105_1);
              stackIn_106_2 = "{...}";
              break L29;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_106_0), stackIn_106_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_25_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_58_0 != 0;
              } else {
                return stackIn_102_0 != 0;
              }
            }
          }
        }
    }

    final static void a(int param0, java.awt.Component param1) {
        param1.setFocusTraversalKeysEnabled(false);
        param1.addKeyListener(ff.field_H);
        if (param0 != 0) {
            return;
        }
        try {
            param1.addFocusListener(ff.field_H);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "kl.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized boolean d(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = wizardrun.field_H;
        if (!this.b(17820)) {
          return false;
        } else {
          var2 = -35 / ((param0 - 0) / 45);
          var3 = 1;
          var4 = 0;
          L0: while (true) {
            if (this.field_d.field_c.length <= var4) {
              return var3 != 0;
            } else {
              var5 = this.field_d.field_c[var4];
              if (this.field_b[var5] == null) {
                this.c(var5, -15053);
                if (this.field_b[var5] == null) {
                  var3 = 0;
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
        }
    }

    private final synchronized boolean a(int param0, int param1, boolean param2) {
        if (!param2) {
            field_e = (String) null;
        }
        if (!this.b(17820)) {
            return false;
        }
        if ((param1 ^ -1) > -1 || 0 > param0 || param1 >= this.field_d.field_t.length || this.field_d.field_t[param1] <= param0) {
            if (v.field_a) {
                throw new IllegalArgumentException(param1 + " " + param0);
            }
            return false;
        }
        return true;
    }

    private final synchronized byte[] a(int param0, int param1, int[] param2, int param3) {
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
              if (param0 == 1) {
                break L1;
              } else {
                this.field_g = (hl) null;
                break L1;
              }
            }
            if (this.a(param1, param3, true)) {
              L2: {
                L3: {
                  var5 = null;
                  if (this.field_c[param3] == null) {
                    break L3;
                  } else {
                    if (this.field_c[param3][param1] != null) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (!this.a(false, param2, param3, param1)) {
                  this.c(param3, -15053);
                  if (this.a(false, param2, param3, param1)) {
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
              if (null != this.field_c[param3]) {
                L4: {
                  if (this.field_c[param3][param1] == null) {
                    break L4;
                  } else {
                    var7 = bh.a((byte) 115, this.field_c[param3][param1], false);
                    var5 = var7;
                    if (var7 != null) {
                      break L4;
                    } else {
                      throw new RuntimeException("");
                    }
                  }
                }
                L5: {
                  if (var5 != null) {
                    if (1 == this.field_f) {
                      this.field_c[param3][param1] = null;
                      if ((this.field_d.field_t[param3] ^ -1) == -2) {
                        this.field_c[param3] = null;
                        break L5;
                      } else {
                        break L5;
                      }
                    } else {
                      if (-3 != (this.field_f ^ -1)) {
                        break L5;
                      } else {
                        this.field_c[param3] = null;
                        break L5;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                stackIn_27_0 = var5;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                throw new RuntimeException("");
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

            stackIn_30_1 = new StringBuilder().append("kl.H(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw bd.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param3 + ')');
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

    final synchronized boolean b(int param0) {
        if (param0 != 17820) {
            return true;
        }
        if (this.field_d != null) {
            return true;
        }
        this.field_d = this.field_g.b(false);
        if (null == this.field_d) {
            return false;
        }
        this.field_b = new Object[this.field_d.field_s];
        this.field_c = new Object[this.field_d.field_s][];
        return true;
    }

    final boolean c(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.b(17820)) {
              param1 = param1.toLowerCase();
              var4 = (CharSequence) ((Object) param1);
              var3_int = this.field_d.field_h.b((byte) 117, wj.a(var4, param0 ^ -2149));
              if (param0 < (var3_int ^ -1)) {
                stackIn_6_0 = 0;
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
          L1: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("kl.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L1;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L1;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    final int d(int param0, int param1) {
        if (!(this.a(param1, 6447))) {
            return 0;
        }
        if (param0 > -81) {
            this.field_f = ((int[]) (this.field_b[1]))[2];
        }
        return this.field_d.field_t[param1];
    }

    final synchronized byte[] a(int param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = -66 / ((param0 - -18) / 54);
            if (this.b(17820)) {
              param2 = param2.toLowerCase();
              param1 = param1.toLowerCase();
              var7 = (CharSequence) ((Object) param2);
              var5 = this.field_d.field_h.b((byte) 104, wj.a(var7, 2148));
              if (this.a(var5, 6447)) {
                var8 = (CharSequence) ((Object) param1);
                var6 = this.field_d.field_x[var5].b((byte) 99, wj.a(var8, 2148));
                stackIn_7_0 = this.a(var6, var5, 1);
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
          L1: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("kl.S(").append(param0).append(',');

            if (param1 == null) {
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


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

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
          throw bd.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        return stackIn_7_0;
    }

    private final synchronized boolean a(int param0, int param1) {
        if (this.b(17820)) {
          L0: {
            if (-1 < (param0 ^ -1)) {
              break L0;
            } else {
              if (param0 >= this.field_d.field_t.length) {
                break L0;
              } else {
                if (this.field_d.field_t[param0] == 0) {
                  break L0;
                } else {
                  if (param1 == 6447) {
                    return true;
                  } else {
                    return false;
                  }
                }
              }
            }
          }
          if (v.field_a) {
            throw new IllegalArgumentException(Integer.toString(param0));
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final int a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                this.field_c = (Object[][]) null;
                break L1;
              }
            }
            if (this.b(17820)) {
              param1 = param1.toLowerCase();
              var4 = (CharSequence) ((Object) param1);
              var3_int = this.field_d.field_h.b((byte) 102, wj.a(var4, 2148));
              stackIn_6_0 = this.b((byte) -72, var3_int);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("kl.BA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    final int c(int param0) {
        if (param0 != 0) {
            this.a(51, (String) null, (String) (((Object[]) (this.field_b[10]))[2]));
        }
        if (!(this.b(17820))) {
            return -1;
        }
        return this.field_d.field_t.length;
    }

    final synchronized int b(byte param0, int param1) {
        if (!(this.a(param1, 6447))) {
            return 0;
        }
        if (param0 >= -33) {
            return 44;
        }
        if (!(this.field_b[param1] == null)) {
            return 100;
        }
        return this.field_g.a(false, param1);
    }

    final synchronized int a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        java.awt.Component var6;
        var5 = wizardrun.field_H;
        if (!this.b(17820)) {
          return 0;
        } else {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (var4 >= this.field_b.length) {
              L1: {
                if (param0 == 75) {
                  break L1;
                } else {
                  var6 = (java.awt.Component) null;
                  kl.a(-90, (java.awt.Component) null);
                  break L1;
                }
              }
              if (var2 == 0) {
                return 100;
              } else {
                var4 = var3 * 100 / var2;
                return var4;
              }
            } else {
              if (0 < this.field_d.field_p[var4]) {
                var2 += 100;
                var3 = var3 + this.b((byte) -95, var4);
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

    final synchronized byte[] a(byte param0, int param1) {
        if (!this.b(17820)) {
            return null;
        }
        if (!(this.field_d.field_t.length != 1)) {
            return this.a(param1, 0, 1);
        }
        if (!this.a(param1, 6447)) {
            return null;
        }
        if (param0 >= -126) {
            return (byte[]) null;
        }
        if ((this.field_d.field_t[param1] ^ -1) == -2) {
            return this.a(0, param1, 1);
        }
        throw new RuntimeException();
    }

    private final synchronized void c(int param0, int param1) {
        if (param1 != -15053) {
            return;
        }
        if (!this.field_a) {
            this.field_b[param0] = pi.a(this.field_g.a((byte) -23, param0), 0, false);
        } else {
            this.field_b[param0] = this.field_g.a((byte) -22, param0);
        }
    }

    final static boolean a(char param0, boolean param1) {
        int stackIn_13_0 = 0;
        L0: {
          if (param1) {
            break L0;
          } else {
            kl.a(18);
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (param0 < 48) {
                break L3;
              } else {
                if (param0 <= 57) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (param0 < 65) {
                break L4;
              } else {
                if (param0 <= 90) {
                  break L2;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              if (param0 < 97) {
                break L5;
              } else {
                if (param0 > 122) {
                  break L5;
                } else {
                  break L2;
                }
              }
            }
            stackIn_13_0 = 0;
            break L1;
          }
          stackIn_13_0 = 1;
          break L1;
        }
        return stackIn_13_0 != 0;
    }

    static int b(int param0, int param1) {
        return param0 & param1;
    }

    final synchronized boolean a(int param0, int param1, byte param2) {
        if (!this.a(param1, param0, true)) {
            return false;
        }
        if (this.field_c[param0] != null && null != this.field_c[param0][param1]) {
            return true;
        }
        if (!(null == this.field_b[param0])) {
            return true;
        }
        this.c(param0, param2 + -14987);
        if (this.field_b[param0] != null) {
            return true;
        }
        if (param2 != -66) {
            this.field_f = -125;
            return false;
        }
        return false;
    }

    final boolean a(String param0, String param1, int param2) {
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
            if (!this.b(17820)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param2 < -125) {
                  break L1;
                } else {
                  this.d(-13);
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              param0 = param0.toLowerCase();
              var6 = (CharSequence) ((Object) param1);
              var4_int = this.field_d.field_h.b((byte) 63, wj.a(var6, 2148));
              if (!this.a(var4_int, 6447)) {
                stackIn_9_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var7 = (CharSequence) ((Object) param0);
                var5 = this.field_d.field_x[var4_int].b((byte) 89, wj.a(var7, 2148));
                stackIn_11_0 = this.a(var4_int, var5, (byte) -66);
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

            stackIn_14_1 = new StringBuilder().append("kl.A(");

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
          throw bd.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ',' + param2 + ')');
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

    final synchronized boolean a(boolean param0, int param1) {
        if (param0) {
            ((byte[]) (this.field_b[7]))[1] = (byte) -124;
        }
        if (!(this.a(param1, 6447))) {
            return false;
        }
        if (null != this.field_b[param1]) {
            return true;
        }
        this.c(param1, -15053);
        if (this.field_b[param1] != null) {
            return true;
        }
        return false;
    }

    final byte[] a(int param0, int param1, int param2) {
        if (param2 != 1) {
            kl.a('', true);
        }
        return this.a(1, param0, (int[]) null, param1);
    }

    public static void a(int param0) {
        if (param0 != 22775) {
            field_e = (String) null;
        }
        field_e = null;
    }

    kl(hl param0, boolean param1, int param2) {
        this.field_d = null;
        try {
            if ((param2 ^ -1) > -1 || 2 < param2) {
                throw new IllegalArgumentException("");
            }
            this.field_g = param0;
            this.field_a = param1 ? true : false;
            this.field_f = param2;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "kl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_e = "Orb points: <%0>";
    }
}
