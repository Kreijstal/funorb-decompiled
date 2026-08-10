/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la {
    private Object[] field_f;
    private me field_a;
    private fd field_e;
    static t field_j;
    static long field_g;
    static int[] field_h;
    private Object[][] field_d;
    static pi field_c;
    static String field_b;
    private int field_l;
    static wl[] field_k;
    private boolean field_i;

    private final synchronized boolean a(boolean param0, int param1, int param2) {
        if (!param0) {
            la.d(126);
        }
        if (!this.a(-12749)) {
            return false;
        }
        if (-1 < (param2 ^ -1) || param1 < 0 || param2 >= this.field_e.field_h.length || param1 >= this.field_e.field_h[param2]) {
            if (fa.field_a) {
                throw new IllegalArgumentException(param2 + " " + param1);
            }
            return false;
        }
        return true;
    }

    final static boolean a(boolean param0) {
        int stackIn_6_0 = 0;
        if (param0) {
          L0: {
            L1: {
              if ((op.field_i ^ -1) > -11) {
                break L1;
              } else {
                if (-14 < (b.field_x ^ -1)) {
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    public static void d(int param0) {
        field_k = null;
        field_j = null;
        if (param0 < 98) {
            int[] var2 = (int[]) null;
            la.a(10, 1, (int[]) null, 117, (int[]) null, -51, -19, -100, 65, 28);
        }
        field_h = null;
        field_b = null;
        field_c = null;
    }

    final boolean b(int param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        String var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
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
            if (!this.a(-12749)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                param2 = param2.toLowerCase();
                if (param0 == 0) {
                  break L1;
                } else {
                  var6 = (String) null;
                  this.a((int[]) (((Object[]) (this.field_f[25]))[3]), ((byte[]) (this.field_f[2]))[4], (String) null, (String) null);
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              var7 = (CharSequence) ((Object) param2);
              var4_int = this.field_e.field_n.a(wc.a((byte) -56, var7), param0 ^ -485);
              if (!this.b((byte) -79, var4_int)) {
                stackIn_9_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var8 = (CharSequence) ((Object) param1);
                var5 = this.field_e.field_j[var4_int].a(wc.a((byte) 85, var8), -485);
                stackIn_11_0 = this.a(var4_int, var5, (byte) -110);
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

            stackIn_14_1 = new StringBuilder().append("la.G(").append(param0).append(',');

            if (param1 == null) {
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

            if (param2 == null) {
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
          throw rb.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ')');
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

    final synchronized boolean c(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = Torquing.field_u;
        if (!this.a(-12749)) {
          return false;
        } else {
          L0: {
            if (param0 == -19375) {
              break L0;
            } else {
              field_h = (int[]) null;
              break L0;
            }
          }
          var2 = 1;
          var3 = 0;
          L1: while (true) {
            if (this.field_e.field_b.length <= var3) {
              return var2 != 0;
            } else {
              var4 = this.field_e.field_b[var3];
              if (null == this.field_f[var4]) {
                this.a(var4, (byte) 124);
                if (null == this.field_f[var4]) {
                  var2 = 0;
                  var3++;
                  continue L1;
                } else {
                  var3++;
                  continue L1;
                }
              } else {
                var3++;
                continue L1;
              }
            }
          }
        }
    }

    private final synchronized boolean a(int param0, int param1, int param2, int[] param3) {
        Object[] array$0 = null;
        byte[] array$1 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        int stackIn_66_0 = 0;
        int stackIn_104_0 = 0;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        String stackIn_108_2 = null;
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
        fj var26 = null;
        byte[] var27 = null;
        fj var29 = null;
        fj var31 = null;
        int[] var32 = null;
        byte[][] var33 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        var22 = Torquing.field_u;
        try {
          L0: {
            if (!this.b((byte) -122, param2)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (null == this.field_f[param2]) {
                stackIn_8_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  var5_int = this.field_e.field_l[param2];
                  var34 = this.field_e.field_m[param2];
                  var24 = var34;
                  var6 = var24;
                  if (null == this.field_d[param2]) {
                    array$0 = new Object[this.field_e.field_h[param2]];
                    this.field_d[param2] = array$0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var7 = this.field_d[param2];
                if (param0 == 2700) {
                  var8 = 1;
                  var9_int = 0;
                  L2: while (true) {
                    L3: {
                      if (var9_int >= var5_int) {
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
                      stackIn_26_0 = 1;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      L5: {
                        L6: {
                          if (null == param3) {
                            break L6;
                          } else {
                            L7: {
                              if (param3[0] != 0) {
                                break L7;
                              } else {
                                if (param3[1] != 0) {
                                  break L7;
                                } else {
                                  if (param3[2] != 0) {
                                    break L7;
                                  } else {
                                    if (0 != param3[3]) {
                                      break L7;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                            }
                            var35 = ui.a(true, this.field_f[param2], (byte) 37);
                            var25 = var35;
                            var9 = var25;
                            var26 = new fj(var35);
                            var26.a(5, param3, var26.field_j.length, param0 ^ 30937);
                            break L5;
                          }
                        }
                        var9 = ui.a(false, this.field_f[param2], (byte) 37);
                        break L5;
                      }
                      try {
                        L8: {
                          var36 = l.a(param0 + -2700, var9);
                          var27 = var36;
                          var23 = var27;
                          var43 = var23;
                          break L8;
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L9: {
                          var11_ref_RuntimeException = decompiledCaughtException;
                          stackIn_39_0 = (RuntimeException) (var11_ref_RuntimeException);

                          stackIn_39_1 = new StringBuilder();

                          if (param3 == null) {
                            stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
                            stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
                            stackIn_40_2 = 0;
                            break L9;
                          } else {
                            stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
                            stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
                            stackIn_40_2 = 1;
                            break L9;
                          }
                        }
                        throw rb.a((Throwable) ((Object) stackIn_40_0), (stackIn_40_2 != 0) + " " + param2 + " " + var9.length + " " + wf.a((byte) -117, var9.length, var9) + " " + wf.a((byte) -117, var9.length + -2, var9) + " " + this.field_e.field_p[param2] + " " + this.field_e.field_o);
                      }
                      L10: {
                        if (!this.field_i) {
                          break L10;
                        } else {
                          this.field_f[param2] = null;
                          break L10;
                        }
                      }
                      L11: {
                        if (-2 > (var5_int ^ -1)) {
                          if (-3 != (this.field_l ^ -1)) {
                            var11 = var36.length;
                            var11--;
                            var12 = var23[var11] & 255;
                            var11 = var11 - 4 * var5_int * var12;
                            var31 = new fj(var43);
                            var39 = new int[var5_int];
                            var32 = var39;
                            var14 = var32;
                            var31.field_n = var11;
                            var15_int = 0;
                            L12: while (true) {
                              if (var15_int >= var12) {
                                var40 = new byte[var5_int][];
                                var33 = var40;
                                var15 = var33;
                                var16 = 0;
                                L13: while (true) {
                                  if (var5_int <= var16) {
                                    var31.field_n = var11;
                                    var16 = 0;
                                    var17 = 0;
                                    L14: while (true) {
                                      if (var17 >= var12) {
                                        var17 = 0;
                                        L15: while (true) {
                                          if (var5_int <= var17) {
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
                                              if (this.field_l == 0) {
                                                var7[var18] = md.a((byte) -5, var40[var17], false);
                                                break L17;
                                              } else {
                                                var7[var18] = var40[var17];
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
                                          if (var5_int <= var19) {
                                            var17++;
                                            continue L14;
                                          } else {
                                            var18 = var18 + var31.c((byte) -49);
                                            dk.a(var43, var16, var40[var19], var39[var19], var18);
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
                                  if (var17 >= var5_int) {
                                    var15_int++;
                                    continue L12;
                                  } else {
                                    var16 = var16 + var31.c((byte) -61);
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
                            var11 = var11 - var5_int * var12 * 4;
                            var29 = new fj(var43);
                            var14_int = 0;
                            var15_int = 0;
                            var29.field_n = var11;
                            var16 = 0;
                            L20: while (true) {
                              if (var12 <= var16) {
                                if (var14_int == 0) {
                                  stackIn_66_0 = 1;
                                  decompiledRegionSelector0 = 4;
                                  break L0;
                                } else {
                                  var44 = new byte[var14_int];
                                  var14_int = 0;
                                  var29.field_n = var11;
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
                                            var19 = var19 + var29.c((byte) -108);
                                            if (var6 != null) {
                                              var21 = var34[var20];
                                              break L23;
                                            } else {
                                              var21 = var20;
                                              break L23;
                                            }
                                          }
                                          L24: {
                                            if (param1 != var21) {
                                              break L24;
                                            } else {
                                              dk.a(var43, var17, var44, var14_int, var19);
                                              var14_int = var14_int + var19;
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
                                      var17 = var17 + var29.c((byte) -120);
                                      if (var6 != null) {
                                        var19 = var34[var18];
                                        break L26;
                                      } else {
                                        var19 = var18;
                                        break L26;
                                      }
                                    }
                                    L27: {
                                      if (param1 == var19) {
                                        var15_int = var19;
                                        var14_int = var14_int + var17;
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
                          if (this.field_l == 0) {
                            var7[var11] = md.a((byte) -5, var43, false);
                            break L11;
                          } else {
                            var7[var11] = var36;
                            return true;
                          }
                        }
                      }
                      stackIn_104_0 = 1;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  }
                } else {
                  stackIn_14_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L29: {
            var5 = decompiledCaughtException;
            stackIn_107_0 = (RuntimeException) (var5);

            stackIn_107_1 = new StringBuilder().append("la.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_108_0 = (RuntimeException) ((Object) stackIn_107_0);
              stackIn_108_1 = (StringBuilder) ((Object) stackIn_107_1);
              stackIn_108_2 = "null";
              break L29;
            } else {
              stackIn_108_0 = (RuntimeException) ((Object) stackIn_107_0);
              stackIn_108_1 = (StringBuilder) ((Object) stackIn_107_1);
              stackIn_108_2 = "{...}";
              break L29;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_108_0), stackIn_108_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_26_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_66_0 != 0;
                } else {
                  return stackIn_104_0 != 0;
                }
              }
            }
          }
        }
    }

    final synchronized byte[] b(int param0, byte param1) {
        if (!this.a(-12749)) {
            return null;
        }
        if (!(-2 != (this.field_e.field_h.length ^ -1))) {
            return this.a(0, 100, param0);
        }
        if (!this.b((byte) -65, param0)) {
            return null;
        }
        if (param1 < 68) {
            field_h = (int[]) null;
        }
        if (!(this.field_e.field_h[param0] != 1)) {
            return this.a(param0, 100, 0);
        }
        throw new RuntimeException();
    }

    final synchronized int a(boolean param0, int param1) {
        if (!(this.b((byte) -110, param1))) {
            return 0;
        }
        if (!param0) {
            la.d(38);
        }
        if (!(null == this.field_f[param1])) {
            return 100;
        }
        return this.field_a.a(param1, -26954);
    }

    final synchronized boolean a(int param0) {
        if (param0 != -12749) {
            this.field_e = (fd) (this.field_f[10]);
        }
        if (this.field_e == null) {
            this.field_e = this.field_a.b((byte) -126);
            if (this.field_e == null) {
                return false;
            }
            this.field_d = new Object[this.field_e.field_c][];
            this.field_f = new Object[this.field_e.field_c];
        }
        return true;
    }

    private final synchronized byte[] a(int[] param0, int param1, int param2, int param3) {
        Object stackIn_2_0 = null;
        Object stackIn_24_0 = null;
        Object stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        Object stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        int var6 = 0;
        byte[] var7 = null;
        try {
          L0: {
            if (this.a(true, param2, param1)) {
              L1: {
                L2: {
                  var5 = null;
                  if (this.field_d[param1] == null) {
                    break L2;
                  } else {
                    if (null == this.field_d[param1][param2]) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                if (this.a(2700, param2, param1, param0)) {
                  break L1;
                } else {
                  this.a(param1, (byte) -106);
                  if (this.a(2700, param2, param1, param0)) {
                    break L1;
                  } else {
                    return null;
                  }
                }
              }
              if (this.field_d[param1] != null) {
                L3: {
                  if (this.field_d[param1][param2] == null) {
                    break L3;
                  } else {
                    var7 = ui.a(false, this.field_d[param1][param2], (byte) 37);
                    var5 = var7;
                    if (var7 != null) {
                      break L3;
                    } else {
                      throw new RuntimeException("");
                    }
                  }
                }
                L4: {
                  if (var5 != null) {
                    if (-2 == (this.field_l ^ -1)) {
                      this.field_d[param1][param2] = null;
                      if (this.field_e.field_h[param1] != 1) {
                        break L4;
                      } else {
                        this.field_d[param1] = null;
                        break L4;
                      }
                    } else {
                      if (-3 == (this.field_l ^ -1)) {
                        this.field_d[param1] = null;
                        break L4;
                      } else {
                        var6 = 120 % ((-57 - param3) / 33);
                        return (byte[]) (var5);
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                var6 = 120 % ((-57 - param3) / 33);
                stackIn_24_0 = var5;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                throw new RuntimeException("");
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_27_0 = var5;

            stackIn_27_1 = new StringBuilder().append("la.B(");

            if (param0 == null) {
              stackIn_28_0 = stackIn_27_0;
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L5;
            } else {
              stackIn_28_0 = stackIn_27_0;
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L5;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_2_0);
        } else {
          return (byte[]) ((Object) stackIn_24_0);
        }
    }

    final synchronized boolean a(int param0, int param1, byte param2) {
        if (!(this.a(true, param1, param0))) {
            return false;
        }
        if (null != this.field_d[param0]) {
            if (!(null == this.field_d[param0][param1])) {
                return true;
            }
        }
        if (param2 > -70) {
            field_j = (t) null;
        }
        if (this.field_f[param0] != null) {
            return true;
        }
        this.a(param0, (byte) -102);
        if (null != this.field_f[param0]) {
            return true;
        }
        return false;
    }

    final boolean b(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.a(-12749)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param1 = param1.toLowerCase();
              var4 = (CharSequence) ((Object) param1);
              var3_int = this.field_e.field_n.a(wc.a((byte) 114, var4), -485);
              if (param0 < -7) {
                if ((var3_int ^ -1) > -1) {
                  stackIn_10_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return true;
                }
              } else {
                stackIn_6_0 = ((boolean[]) (this.field_f[0]))[10];
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("la.R(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_10_0 != 0;
          }
        }
    }

    private final synchronized boolean b(byte param0, int param1) {
        if (!this.a(-12749)) {
            return false;
        }
        if (param0 > -62) {
            return true;
        }
        if (0 <= param1 && param1 < this.field_e.field_h.length && this.field_e.field_h[param1] != 0) {
            return true;
        }
        if (fa.field_a) {
            throw new IllegalArgumentException(Integer.toString(param1));
        }
        return false;
    }

    final int a(String param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.b((byte) -74, param2)) {
              stackIn_3_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param0 = param0.toLowerCase();
              var5 = (CharSequence) ((Object) param0);
              var4_int = this.field_e.field_j[param2].a(wc.a((byte) -107, var5), -485);
              if (this.a(true, var4_int, param2)) {
                if (param1 <= -98) {
                  stackIn_11_0 = var4_int;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_9_0 = 11;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("la.T(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L1;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L1;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return stackIn_11_0;
            }
          }
        }
    }

    private final synchronized void a(int param0, byte param1) {
        if (this.field_i) {
            this.field_f[param0] = this.field_a.a(param0, true);
        } else {
            this.field_f[param0] = md.a((byte) -5, this.field_a.a(param0, true), false);
        }
        int var3 = -47 % ((32 - param1) / 62);
    }

    final synchronized int a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = Torquing.field_u;
        if (!this.a(-12749)) {
          return 0;
        } else {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (var4 >= this.field_f.length) {
              if (0 != var2) {
                if (param0 == -32) {
                  var4 = var3 * 100 / var2;
                  return var4;
                } else {
                  return 35;
                }
              } else {
                return 100;
              }
            } else {
              if (0 < this.field_e.field_l[var4]) {
                var2 += 100;
                var3 = var3 + this.a(true, var4);
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

    final boolean a(boolean param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a(-12749)) {
              L1: {
                param1 = param1.toLowerCase();
                if (param0) {
                  break L1;
                } else {
                  this.a(((int[]) (((Object[]) (this.field_f[12]))[26]))[0]);
                  break L1;
                }
              }
              var4 = (CharSequence) ((Object) param1);
              var3_int = this.field_e.field_n.a(wc.a((byte) 120, var4), -485);
              stackIn_6_0 = this.a((byte) 113, var3_int);
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
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("la.BA(").append(param0).append(',');

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
          throw rb.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0;
        }
    }

    final int a(byte param0, String param1) {
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
            if (this.a(-12749)) {
              L1: {
                if (param0 > 45) {
                  break L1;
                } else {
                  field_k = (wl[]) null;
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              var4 = (CharSequence) ((Object) param1);
              var3_int = this.field_e.field_n.a(wc.a((byte) -120, var4), -485);
              stackIn_6_0 = this.a(true, var3_int);
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
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("la.F(").append(param0).append(',');

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
          throw rb.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_6_0;
        }
    }

    final byte[] a(int param0, int param1, int param2) {
        if (param1 != 100) {
            field_j = (t) null;
        }
        return this.a((int[]) null, param0, param2, 30);
    }

    final int a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
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
            if (this.a(-12749)) {
              param1 = param1.toLowerCase();
              var4 = (CharSequence) ((Object) param1);
              var3_int = this.field_e.field_n.a(wc.a((byte) 99, var4), -485);
              if (param0 == -1) {
                if (!this.b((byte) -128, var3_int)) {
                  stackIn_9_0 = -1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return var3_int;
                }
              } else {
                stackIn_5_0 = 11;
                decompiledRegionSelector0 = 1;
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
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("la.S(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L1;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L1;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_9_0;
          }
        }
    }

    final byte[] a(int[] param0, byte param1, String param2, String param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        Object stackIn_5_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a(-12749)) {
              param2 = param2.toLowerCase();
              param3 = param3.toLowerCase();
              var7 = (CharSequence) ((Object) param2);
              var5_int = this.field_e.field_n.a(wc.a((byte) 56, var7), -485);
              if (this.b((byte) -73, var5_int)) {
                L1: {
                  if (param1 < -52) {
                    break L1;
                  } else {
                    ((int[]) (this.field_f[3]))[18] = ((int[]) (this.field_f[2]))[0];
                    break L1;
                  }
                }
                var8 = (CharSequence) ((Object) param3);
                var6 = this.field_e.field_j[var5_int].a(wc.a((byte) 59, var8), -485);
                stackIn_9_0 = this.a(param0, var5_int, var6, 77);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_5_0 = null;
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
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("la.AA(");

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
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_13_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_5_0);
        } else {
          return stackIn_9_0;
        }
    }

    final synchronized boolean a(int param0, boolean param1) {
        if (!this.a(-12749)) {
            return false;
        }
        if (-2 == (this.field_e.field_h.length ^ -1)) {
            return this.a(0, param0, (byte) -117);
        }
        if (!(this.b((byte) -109, param0))) {
            return false;
        }
        if (param1) {
            this.a((int[]) null, (byte) -91, (String) null, (String) (this.field_f[11]));
        }
        if (!(-2 != (this.field_e.field_h[param0] ^ -1))) {
            return this.a(param0, 0, (byte) -79);
        }
        throw new RuntimeException();
    }

    final synchronized boolean a(byte param0, int param1) {
        if (!(this.b((byte) -96, param1))) {
            return false;
        }
        if (param0 < 92) {
            this.field_i = ((boolean[]) (this.field_f[0]))[12];
        }
        if (!(this.field_f[param1] == null)) {
            return true;
        }
        this.a(param1, (byte) 94);
        if (null == this.field_f[param1]) {
            return false;
        }
        return true;
    }

    la(me param0, boolean param1, int param2) {
        this.field_e = null;
        try {
            if ((param2 ^ -1) > -1 || param2 > 2) {
                throw new IllegalArgumentException("");
            }
            this.field_i = param1 ? true : false;
            this.field_a = param0;
            this.field_l = param2;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "la.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized byte[] a(int param0, String param1, String param2) {
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
            if (this.a(-12749)) {
              L1: {
                param2 = param2.toLowerCase();
                if (param0 <= -105) {
                  break L1;
                } else {
                  this.a(((byte[]) (((Object[]) (this.field_f[10]))[6]))[2], 123);
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              var6 = (CharSequence) ((Object) param2);
              var4_int = this.field_e.field_n.a(wc.a((byte) 79, var6), -485);
              if (this.b((byte) -70, var4_int)) {
                var7 = (CharSequence) ((Object) param1);
                var5 = this.field_e.field_j[var4_int].a(wc.a((byte) 77, var7), -485);
                stackIn_9_0 = this.a(var4_int, 100, var5);
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

            stackIn_12_1 = new StringBuilder().append("la.D(").append(param0).append(',');

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
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

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
          throw rb.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_7_0);
        } else {
          return stackIn_9_0;
        }
    }

    final static void a(int param0, int param1, int[] param2, int param3, int[] param4, int param5, int param6, int param7, int param8, int param9) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        var17 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (param8 == 65280) {
                break L1;
              } else {
                la.b(123);
                break L1;
              }
            }
            var10_int = -param6;
            L2: while (true) {
              if (var10_int >= 0) {
                break L0;
              } else {
                var11 = -param5;
                L3: while (true) {
                  if (-1 >= (var11 ^ -1)) {
                    param1 = param1 + param9;
                    param7 = param7 + param3;
                    var10_int++;
                    continue L2;
                  } else {
                    L4: {
                      incrementValue$0 = param1;
                      param1++;
                      param0 = param2[incrementValue$0];
                      if (-1 != (param0 ^ -1)) {
                        var12 = 255 & param0;
                        var13 = 256 - var12;
                        var14 = param4[param7];
                        var15 = var14 & 16711935;
                        var16 = 65280 & var14;
                        incrementValue$1 = param7;
                        param7++;
                        param4[incrementValue$1] = gm.a(ie.a(16711855, var13 * var16) >> 1885321640, ie.a(16711935, var13 * var15 >> 748574184));
                        break L4;
                      } else {
                        param7++;
                        break L4;
                      }
                    }
                    var11++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var10 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var10);

            stackIn_15_1 = new StringBuilder().append("la.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    final static vc b(int param0) {
        try {
            Throwable var1 = null;
            vc stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            if (param0 > 11) {
              try {
                L0: {
                  stackIn_3_0 = (vc) (Class.forName("dl").newInstance());
                  break L0;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = decompiledCaughtException;
                return null;
              }
              return stackIn_3_0;
            } else {
              return (vc) null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = "Loading extra data";
        field_k = new wl[13];
        field_h = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
