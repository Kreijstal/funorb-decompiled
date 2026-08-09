/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa {
    static ci field_d;
    private Object[][] field_g;
    private boolean field_j;
    private int field_h;
    static int field_a;
    static String field_e;
    private uj field_b;
    static pk field_i;
    private Object[] field_k;
    static String field_c;
    private km field_f;

    final boolean a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.a(param0 ^ param0)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param1 = param1.toLowerCase();
              var4 = (CharSequence) ((Object) param1);
              var3_int = this.field_f.field_g.b(1, lb.a(var4, -2964));
              stackIn_5_0 = this.e(var3_int, 4);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("fa.S(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_5_0;
        }
    }

    final synchronized byte[] a(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
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
            if (this.a(param2 ^ param2)) {
              param0 = param0.toLowerCase();
              param1 = param1.toLowerCase();
              var6 = (CharSequence) ((Object) param0);
              var4_int = this.field_f.field_g.b(1, lb.a(var6, -2964));
              if (this.d(var4_int, 121)) {
                var7 = (CharSequence) ((Object) param1);
                var5 = this.field_f.field_f[var4_int].b(1, lb.a(var7, -2964));
                stackIn_7_0 = this.b(var4_int, param2 + 21565, var5);
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

            stackIn_10_1 = new StringBuilder().append("fa.E(");

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


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
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
          throw qk.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param2 + ')');
        }
        return stackIn_7_0;
    }

    private final synchronized void a(int param0, int param1) {
        if (!this.field_j) {
            this.field_k[param0] = pl.a(this.field_b.a(param0, param1 + -3979), false, false);
        } else {
            this.field_k[param0] = this.field_b.a(param0, -126);
        }
        if (param1 != 3864) {
            this.field_g = (Object[][]) null;
        }
    }

    final int c(int param0) {
        if (!(this.a(0))) {
            return -1;
        }
        if (param0 != -1) {
            this.c(((int[]) (((Object[]) (this.field_k[1]))[0]))[2]);
        }
        return this.field_f.field_k.length;
    }

    final synchronized byte[] b(int param0, int param1) {
        if (!this.a(param1)) {
            return null;
        }
        if (!((this.field_f.field_k.length ^ -1) != -2)) {
            return this.b(0, param1 + -117, param0);
        }
        if (!this.d(param0, param1 + -11)) {
            return null;
        }
        if (!(-2 != (this.field_f.field_k[param0] ^ -1))) {
            return this.b(param0, param1 + 124, 0);
        }
        throw new RuntimeException();
    }

    final int b(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
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
            if (this.a(0)) {
              param1 = param1.toLowerCase();
              var5 = (CharSequence) ((Object) param1);
              var3_int = this.field_f.field_g.b(1, lb.a(var5, -2964));
              var4 = 88 % ((44 - param0) / 46);
              stackIn_4_0 = this.a((byte) -91, var3_int);
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

            stackIn_7_1 = new StringBuilder().append("fa.P(").append(param0).append(',');

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
          throw qk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final byte[] b(int param0, int param1, int param2) {
        int var4 = 5 / ((param1 - 84) / 32);
        return this.a((int[]) null, (byte) 110, param2, param0);
    }

    final synchronized boolean a(int param0) {
        if (param0 != 0) {
            ((boolean[]) (((Object[]) (this.field_k[8]))[13]))[0] = true;
        }
        if (null == this.field_f) {
            this.field_f = this.field_b.a((byte) 68);
            if (!(this.field_f != null)) {
                return false;
            }
            this.field_g = new Object[this.field_f.field_j][];
            this.field_k = new Object[this.field_f.field_j];
        }
        return true;
    }

    private final synchronized boolean a(int param0, boolean param1, int[] param2, int param3) {
        Object[] array$0 = null;
        byte[] array$1 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_25_0 = 0;
        Object stackIn_33_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        int stackIn_89_0 = 0;
        int stackIn_103_0 = 0;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        String stackIn_107_2 = null;
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
        int var14 = 0;
        int[] var14_ref_int__ = null;
        int var15 = 0;
        byte[][] var15_ref_byte____ = null;
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
        dh var26 = null;
        byte[] var27 = null;
        dh var29 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        dh var32 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var38 = null;
        byte[][] var39 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        var22 = Terraphoenix.field_V;
        try {
          L0: {
            if (!this.d(param3, -45)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (null == this.field_k[param3]) {
                stackIn_8_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  var5_int = this.field_f.field_d[param3];
                  var34 = this.field_f.field_r[param3];
                  var24 = var34;
                  var6 = var24;
                  if (!param1) {
                    break L1;
                  } else {
                    this.field_g = (Object[][]) null;
                    break L1;
                  }
                }
                L2: {
                  if (null != this.field_g[param3]) {
                    break L2;
                  } else {
                    array$0 = new Object[this.field_f.field_k[param3]];
                    this.field_g[param3] = array$0;
                    break L2;
                  }
                }
                var7 = this.field_g[param3];
                var8 = 1;
                var9_int = 0;
                L3: while (true) {
                  L4: {
                    if (var9_int >= var5_int) {
                      break L4;
                    } else {
                      L5: {
                        if (var6 != null) {
                          var10 = var34[var9_int];
                          break L5;
                        } else {
                          var10 = var9_int;
                          break L5;
                        }
                      }
                      if (null == var7[var10]) {
                        var8 = 0;
                        break L4;
                      } else {
                        var9_int++;
                        continue L3;
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
                        if (param2 == null) {
                          break L7;
                        } else {
                          L8: {
                            if (param2[0] != 0) {
                              break L8;
                            } else {
                              if (param2[1] != 0) {
                                break L8;
                              } else {
                                if (-1 != (param2[2] ^ -1)) {
                                  break L8;
                                } else {
                                  if (-1 != (param2[3] ^ -1)) {
                                    break L8;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                          var35 = ei.a(this.field_k[param3], true, false);
                          var25 = var35;
                          var9 = var25;
                          var26 = new dh(var35);
                          var26.a(-14328, param2, 5, var26.field_i.length);
                          break L6;
                        }
                      }
                      stackIn_33_0 = this.field_k[param3];
                      var9 = ei.a(stackIn_33_0, false, false);
                      break L6;
                    }
                    try {
                      L9: {
                        var36 = qg.a(-1, var9);
                        var27 = var36;
                        var23 = var27;
                        var43 = var23;
                        break L9;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L10: {
                        var11_ref_RuntimeException = decompiledCaughtException;
                        stackIn_39_0 = (RuntimeException) (var11_ref_RuntimeException);

                        stackIn_39_1 = new StringBuilder();

                        if (param2 == null) {
                          stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
                          stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
                          stackIn_40_2 = 0;
                          break L10;
                        } else {
                          stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
                          stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
                          stackIn_40_2 = 1;
                          break L10;
                        }
                      }
                      throw qk.a((Throwable) ((Object) stackIn_40_0), (stackIn_40_2 != 0) + " " + param3 + " " + param2.length + " " + j.a(0, param2.length, var9) + " " + j.a(0, -2 + param2.length, var9) + " " + this.field_f.field_h[param3] + " " + this.field_f.field_i);
                    }
                    L11: {
                      if (!this.field_j) {
                        break L11;
                      } else {
                        this.field_k[param3] = null;
                        break L11;
                      }
                    }
                    L12: {
                      if (var5_int > 1) {
                        if (-3 == (this.field_h ^ -1)) {
                          var11 = var36.length;
                          var11--;
                          var12 = var23[var11] & 255;
                          var11 = var11 - 4 * var12 * var5_int;
                          var32 = new dh(var43);
                          var14 = 0;
                          var15 = 0;
                          var32.field_k = var11;
                          var16 = 0;
                          L13: while (true) {
                            if (var12 <= var16) {
                              if (-1 != (var14 ^ -1)) {
                                var44 = new byte[var14];
                                var32.field_k = var11;
                                var14 = 0;
                                var17 = 0;
                                var18 = 0;
                                L14: while (true) {
                                  if (var12 <= var18) {
                                    var7[var15] = var44;
                                    break L12;
                                  } else {
                                    var19 = 0;
                                    var20 = 0;
                                    L15: while (true) {
                                      if (var5_int <= var20) {
                                        var18++;
                                        continue L14;
                                      } else {
                                        L16: {
                                          var19 = var19 + var32.f((byte) -107);
                                          if (var6 == null) {
                                            var21 = var20;
                                            break L16;
                                          } else {
                                            var21 = var34[var20];
                                            break L16;
                                          }
                                        }
                                        L17: {
                                          if (var21 != param0) {
                                            break L17;
                                          } else {
                                            ka.a(var43, var17, var44, var14, var19);
                                            var14 = var14 + var19;
                                            break L17;
                                          }
                                        }
                                        var17 = var17 + var19;
                                        var20++;
                                        continue L15;
                                      }
                                    }
                                  }
                                }
                              } else {
                                stackIn_89_0 = 1;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              }
                            } else {
                              var17 = 0;
                              var18 = 0;
                              L18: while (true) {
                                if (var18 >= var5_int) {
                                  var16++;
                                  continue L13;
                                } else {
                                  L19: {
                                    var17 = var17 + var32.f((byte) -107);
                                    if (var6 == null) {
                                      var19 = var18;
                                      break L19;
                                    } else {
                                      var19 = var34[var18];
                                      break L19;
                                    }
                                  }
                                  L20: {
                                    if (param0 == var19) {
                                      var15 = var19;
                                      var14 = var14 + var17;
                                      break L20;
                                    } else {
                                      break L20;
                                    }
                                  }
                                  var18++;
                                  continue L18;
                                }
                              }
                            }
                          }
                        } else {
                          var11 = var36.length;
                          var11--;
                          var12 = var23[var11] & 255;
                          var11 = var11 - 4 * var12 * var5_int;
                          var29 = new dh(var43);
                          var38 = new int[var5_int];
                          var30 = var38;
                          var14_ref_int__ = var30;
                          var29.field_k = var11;
                          var15 = 0;
                          L21: while (true) {
                            if (var15 >= var12) {
                              var39 = new byte[var5_int][];
                              var31 = var39;
                              var15_ref_byte____ = var31;
                              var16 = 0;
                              L22: while (true) {
                                if (var5_int <= var16) {
                                  var29.field_k = var11;
                                  var16 = 0;
                                  var17 = 0;
                                  L23: while (true) {
                                    if (var12 <= var17) {
                                      var17 = 0;
                                      L24: while (true) {
                                        if (var5_int <= var17) {
                                          break L12;
                                        } else {
                                          L25: {
                                            if (var6 != null) {
                                              var18 = var34[var17];
                                              break L25;
                                            } else {
                                              var18 = var17;
                                              break L25;
                                            }
                                          }
                                          L26: {
                                            if (0 != this.field_h) {
                                              var7[var18] = var39[var17];
                                              break L26;
                                            } else {
                                              var7[var18] = pl.a(var39[var17], false, param1);
                                              break L26;
                                            }
                                          }
                                          var17++;
                                          continue L24;
                                        }
                                      }
                                    } else {
                                      var18 = 0;
                                      var19 = 0;
                                      L27: while (true) {
                                        if (var5_int <= var19) {
                                          var17++;
                                          continue L23;
                                        } else {
                                          var18 = var18 + var29.f((byte) -107);
                                          ka.a(var43, var16, var39[var19], var38[var19], var18);
                                          var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                                          var16 = var16 + var18;
                                          var19++;
                                          continue L27;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  array$1 = new byte[var38[var16]];
                                  var15_ref_byte____[var16] = array$1;
                                  var38[var16] = 0;
                                  var16++;
                                  continue L22;
                                }
                              }
                            } else {
                              var16 = 0;
                              var17 = 0;
                              L28: while (true) {
                                if (var5_int <= var17) {
                                  var15++;
                                  continue L21;
                                } else {
                                  var16 = var16 + var29.f((byte) -107);
                                  var14_ref_int__[var17] = var14_ref_int__[var17] + var16;
                                  var17++;
                                  continue L28;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        L29: {
                          if (var6 == null) {
                            var11 = 0;
                            break L29;
                          } else {
                            var11 = var34[0];
                            break L29;
                          }
                        }
                        if (this.field_h != 0) {
                          var7[var11] = var43;
                          break L12;
                        } else {
                          var7[var11] = pl.a(var36, false, false);
                          return true;
                        }
                      }
                    }
                    stackIn_103_0 = 1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L30: {
            var5 = decompiledCaughtException;
            stackIn_106_0 = (RuntimeException) (var5);

            stackIn_106_1 = new StringBuilder().append("fa.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_107_0 = (RuntimeException) ((Object) stackIn_106_0);
              stackIn_107_1 = (StringBuilder) ((Object) stackIn_106_1);
              stackIn_107_2 = "null";
              break L30;
            } else {
              stackIn_107_0 = (RuntimeException) ((Object) stackIn_106_0);
              stackIn_107_1 = (StringBuilder) ((Object) stackIn_106_1);
              stackIn_107_2 = "{...}";
              break L30;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_107_0), stackIn_107_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_25_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_89_0 != 0;
              } else {
                return stackIn_103_0 != 0;
              }
            }
          }
        }
    }

    final boolean d(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
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
            if (this.a(0)) {
              param1 = param1.toLowerCase();
              var4 = (CharSequence) ((Object) param1);
              var3_int = this.field_f.field_g.b(1, lb.a(var4, param0 + -2963));
              if (param0 >= (var3_int ^ -1)) {
                stackIn_7_0 = 1;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
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
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("fa.V(").append(param0).append(',');

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
          throw qk.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            return stackIn_7_0 != 0;
          }
        }
    }

    public static void b(int param0) {
        field_d = null;
        field_e = null;
        field_c = null;
        if (param0 < 34) {
            fa.b(29);
        }
        field_i = null;
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        if (param0 != -12432) {
            ((long[]) (this.field_k[0]))[0] = 43L;
        }
        if (!(this.a(0))) {
            return false;
        }
        if ((param2 ^ -1) > -1 || 0 > param1 || this.field_f.field_k.length <= param2 || this.field_f.field_k[param2] <= param1) {
            if (rd.field_o) {
                throw new IllegalArgumentException(param2 + " " + param1);
            }
            return false;
        }
        return true;
    }

    final synchronized boolean a(boolean param0, int param1, int param2) {
        if (!(this.a(-12432, param1, param2))) {
            return false;
        }
        if (this.field_g[param2] != null) {
            if (!(this.field_g[param2][param1] == null)) {
                return true;
            }
        }
        if (param0) {
            this.a(((int[]) (this.field_k[1]))[0]);
        }
        if (!(this.field_k[param2] == null)) {
            return true;
        }
        this.a(param2, 3864);
        if (this.field_k[param2] != null) {
            return true;
        }
        return false;
    }

    private final synchronized boolean d(int param0, int param1) {
        if (!(this.a(0))) {
            return false;
        }
        if (0 > param0 || this.field_f.field_k.length <= param0 || -1 == (this.field_f.field_k[param0] ^ -1)) {
            if (rd.field_o) {
                throw new IllegalArgumentException(Integer.toString(param0));
            }
            return false;
        }
        int var3 = -115 / ((53 - param1) / 32);
        return true;
    }

    final boolean a(String param0, byte param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.a(0)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param2 = param2.toLowerCase();
              param0 = param0.toLowerCase();
              var6 = (CharSequence) ((Object) param2);
              var4_int = this.field_f.field_g.b(1, lb.a(var6, param1 ^ -3068));
              if (this.d(var4_int, -50)) {
                L1: {
                  if (param1 == 104) {
                    break L1;
                  } else {
                    ((boolean[]) (this.field_k[0]))[5] = false;
                    break L1;
                  }
                }
                var7 = (CharSequence) ((Object) param0);
                var5 = this.field_f.field_f[var4_int].b(param1 ^ 105, lb.a(var7, -2964));
                stackIn_10_0 = this.a(false, var5, var4_int);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("fa.O(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    final synchronized int a(byte param0, int param1) {
        if (!(this.d(param1, 106))) {
            return 0;
        }
        int var3 = 71 % ((param0 - 17) / 61);
        if (!(null == this.field_k[param1])) {
            return 100;
        }
        return this.field_b.b(0, param1);
    }

    private final synchronized byte[] a(int[] param0, byte param1, int param2, int param3) {
        Object stackIn_9_0 = null;
        byte[] stackIn_19_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        Object stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        byte[] var7 = null;
        try {
          L0: {
            if (this.a(-12432, param2, param3)) {
              L1: {
                L2: {
                  var5 = null;
                  if (null == this.field_g[param3]) {
                    break L2;
                  } else {
                    if (null != this.field_g[param3][param2]) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (this.a(param2, false, param0, param3)) {
                  break L1;
                } else {
                  this.a(param3, 3864);
                  if (this.a(param2, false, param0, param3)) {
                    break L1;
                  } else {
                    stackIn_9_0 = null;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
              if (null == this.field_g[param3]) {
                throw new RuntimeException("");
              } else {
                L3: {
                  if (this.field_g[param3][param2] == null) {
                    break L3;
                  } else {
                    var7 = ei.a(this.field_g[param3][param2], false, false);
                    var5 = var7;
                    if (var7 == null) {
                      throw new RuntimeException("");
                    } else {
                      break L3;
                    }
                  }
                }
                if (param1 >= 75) {
                  L4: {
                    if (var5 != null) {
                      if (this.field_h == 1) {
                        this.field_g[param3][param2] = null;
                        if (this.field_f.field_k[param3] == 1) {
                          this.field_g[param3] = null;
                          break L4;
                        } else {
                          break L4;
                        }
                      } else {
                        if (this.field_h != 2) {
                          break L4;
                        } else {
                          this.field_g[param3] = null;
                          break L4;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                  stackIn_29_0 = var5;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_19_0 = (byte[]) (this.field_k[10]);
                  decompiledRegionSelector0 = 1;
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
            stackIn_32_0 = var5;

            stackIn_32_1 = new StringBuilder().append("fa.M(");

            if (param0 == null) {
              stackIn_33_0 = stackIn_32_0;
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L5;
            } else {
              stackIn_33_0 = stackIn_32_0;
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L5;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_9_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_19_0;
          } else {
            return (byte[]) ((Object) stackIn_29_0);
          }
        }
    }

    final int c(int param0, int param1) {
        if (!this.d(param1, 101)) {
            return 0;
        }
        if (param0 != -540) {
            return -24;
        }
        return this.field_f.field_k[param1];
    }

    final int c(int param0, String param1) {
        boolean discarded$1 = false;
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
            if (this.a(param0 + 1)) {
              param1 = param1.toLowerCase();
              var4 = (CharSequence) ((Object) param1);
              var3_int = this.field_f.field_g.b(1, lb.a(var4, -2964));
              if (this.d(var3_int, param0 ^ 101)) {
                L1: {
                  if (param0 == -1) {
                    break L1;
                  } else {
                    discarded$1 = this.a(127, 122, 13);
                    break L1;
                  }
                }
                stackIn_9_0 = var3_int;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = -1;
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
          L2: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("fa.AA(").append(param0).append(',');

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
          throw qk.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
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

    final int a(int param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
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
            if (this.d(param1, -71)) {
              param2 = param2.toLowerCase();
              var5 = (CharSequence) ((Object) param2);
              var4_int = this.field_f.field_f[param1].b(1, lb.a(var5, -2964));
              if (this.a(-12432, var4_int, param1)) {
                L1: {
                  if (param0 < -75) {
                    break L1;
                  } else {
                    ((long[]) (this.field_k[0]))[4] = -101L;
                    break L1;
                  }
                }
                stackIn_9_0 = var4_int;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = -1;
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
          L2: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("fa.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw qk.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
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

    final synchronized int a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = Terraphoenix.field_V;
        if (!this.a(0)) {
          return 0;
        } else {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (var4 >= this.field_k.length) {
              L1: {
                if (param0 == 127) {
                  break L1;
                } else {
                  this.a((byte) -72);
                  break L1;
                }
              }
              if (var2 != 0) {
                var4 = 100 * var3 / var2;
                return var4;
              } else {
                return 100;
              }
            } else {
              if (-1 > (this.field_f.field_d[var4] ^ -1)) {
                var3 = var3 + this.a((byte) -91, var4);
                var2 += 100;
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

    final synchronized boolean b(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = Terraphoenix.field_V;
        if (!this.a(0)) {
          return false;
        } else {
          L0: {
            var2 = 1;
            var3 = 0;
            if (param0 < -127) {
              break L0;
            } else {
              this.field_g = (Object[][]) null;
              break L0;
            }
          }
          L1: while (true) {
            if (this.field_f.field_b.length <= var3) {
              return var2 != 0;
            } else {
              var4 = this.field_f.field_b[var3];
              if (null == this.field_k[var4]) {
                this.a(var4, 3864);
                if (null == this.field_k[var4]) {
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

    final synchronized boolean e(int param0, int param1) {
        if (!(this.d(param0, 110))) {
            return false;
        }
        if (!(this.field_k[param0] == null)) {
            return true;
        }
        this.a(param0, 3864);
        if (null != this.field_k[param0]) {
            return true;
        }
        if (param1 != 4) {
            String var4 = (String) null;
            this.d(-3, (String) null);
            return false;
        }
        return false;
    }

    final static ci[] f(int param0, int param1) {
        ci[] var3 = new ci[9];
        ci[] var2 = var3;
        var3[param1] = nb.a(64, param0, 119);
        return var2;
    }

    fa(uj param0, boolean param1, int param2) {
        this.field_f = null;
        try {
            if (-1 < (param2 ^ -1) || 2 < param2) {
                throw new IllegalArgumentException("");
            }
            this.field_b = param0;
            this.field_h = param2;
            this.field_j = param1 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "fa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_a = 0;
        field_c = "Squiddy with shielded armour";
        field_e = "Select 'ready' mode";
    }
}
