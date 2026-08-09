/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm {
    private fa field_o;
    boolean field_f;
    int field_d;
    private Object[] field_k;
    private jl field_a;
    private Object[][] field_i;
    static int[] field_l;
    static String field_c;
    static String field_n;
    static int[] field_e;
    static String[] field_m;
    static wk[] field_b;
    static String field_p;
    static tb field_j;
    static int field_g;
    static gh field_h;

    final synchronized boolean a(byte param0, int param1, int param2) {
        if (!(this.b(param2, param1, -17637))) {
            return false;
        }
        if (null != this.field_i[param2]) {
            if (!(null == this.field_i[param2][param1])) {
                return true;
            }
        }
        if (!(null == this.field_k[param2])) {
            return true;
        }
        this.a(-66, param2);
        if (null != this.field_k[param2]) {
            return true;
        }
        if (param0 <= 53) {
            this.a(98);
            return false;
        }
        return false;
    }

    private final synchronized boolean b(int param0, int param1, int param2) {
        if (!this.a(true)) {
            return false;
        }
        if (param2 != -17637) {
            return false;
        }
        if (-1 < (param0 ^ -1) || (param1 ^ -1) > -1 || this.field_a.field_g.length <= param0 || param1 >= this.field_a.field_g[param0]) {
            if (qi.field_l) {
                throw new IllegalArgumentException(param0 + " " + param1);
            }
            return false;
        }
        return true;
    }

    private final synchronized boolean a(int param0, int param1, int param2, int[] param3) {
        Object[] array$0 = null;
        byte[] array$1 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_22_0 = 0;
        int[] stackIn_25_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_88_0 = 0;
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
        gi var26 = null;
        byte[] var27 = null;
        gi var29 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        gi var32 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var38 = null;
        byte[][] var39 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        var22 = SteelSentinels.field_G;
        try {
          L0: {
            if (!this.b(param1, true)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (null == this.field_k[param1]) {
                stackIn_8_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  var5_int = this.field_a.field_j[param1];
                  var34 = this.field_a.field_o[param1];
                  var24 = var34;
                  var6 = var24;
                  if (null != this.field_i[param1]) {
                    break L1;
                  } else {
                    array$0 = new Object[this.field_a.field_g[param1]];
                    this.field_i[param1] = array$0;
                    break L1;
                  }
                }
                var7 = this.field_i[param1];
                var8 = 1;
                var9_int = param2;
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
                      if (null == var7[var10]) {
                        var8 = 0;
                        break L3;
                      } else {
                        var9_int++;
                        continue L2;
                      }
                    }
                  }
                  if (var8 == 0) {
                    L5: {
                      L6: {
                        if (param3 == null) {
                          break L6;
                        } else {
                          stackIn_25_0 = (int[]) (param3);
                          L7: {
                            if (stackIn_25_0[0] != 0) {
                              break L7;
                            } else {
                              if (0 != param3[1]) {
                                break L7;
                              } else {
                                if (param3[2] != 0) {
                                  break L7;
                                } else {
                                  if (param3[3] == 0) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                          var35 = dk.a(true, this.field_k[param1], 0);
                          var25 = var35;
                          var9 = var25;
                          var26 = new gi(var35);
                          var26.a(5, param2 ^ 32203, var26.field_t.length, param3);
                          break L5;
                        }
                      }
                      var9 = dk.a(false, this.field_k[param1], 0);
                      break L5;
                    }
                    try {
                      L8: {
                        var36 = ln.a(var9, (byte) 127);
                        var27 = var36;
                        var23 = var27;
                        var43 = var23;
                        break L8;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L9: {
                        var11_ref_RuntimeException = decompiledCaughtException;
                        stackIn_36_0 = (RuntimeException) (var11_ref_RuntimeException);

                        stackIn_36_1 = new StringBuilder();

                        if (param3 == null) {
                          stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
                          stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
                          stackIn_37_2 = 0;
                          break L9;
                        } else {
                          stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
                          stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
                          stackIn_37_2 = 1;
                          break L9;
                        }
                      }
                      throw ci.a((Throwable) ((Object) stackIn_37_0), (stackIn_37_2 != 0) + " " + param1 + " " + param3.length + " " + ba.a((byte) -107, var9, param3.length) + " " + ba.a((byte) -107, var9, param3.length + -2) + " " + this.field_a.field_a[param1] + " " + this.field_a.field_e);
                    }
                    L10: {
                      if (this.field_f) {
                        this.field_k[param1] = null;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (1 < var5_int) {
                        if ((this.field_d ^ -1) == -3) {
                          var11 = var36.length;
                          var11--;
                          var12 = var23[var11] & 255;
                          var11 = var11 - var5_int * var12 * 4;
                          var32 = new gi(var43);
                          var14 = 0;
                          var32.field_p = var11;
                          var15 = 0;
                          var16 = 0;
                          L12: while (true) {
                            if (var12 <= var16) {
                              if (var14 == 0) {
                                stackIn_88_0 = 1;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                var44 = new byte[var14];
                                var14 = 0;
                                var32.field_p = var11;
                                var17 = 0;
                                var18 = 0;
                                L13: while (true) {
                                  if (var18 >= var12) {
                                    var7[var15] = var44;
                                    break L11;
                                  } else {
                                    var19 = 0;
                                    var20 = 0;
                                    L14: while (true) {
                                      if (var5_int <= var20) {
                                        var18++;
                                        continue L13;
                                      } else {
                                        L15: {
                                          var19 = var19 + var32.i(param2 + 0);
                                          if (var6 != null) {
                                            var21 = var34[var20];
                                            break L15;
                                          } else {
                                            var21 = var20;
                                            break L15;
                                          }
                                        }
                                        L16: {
                                          if (var21 == param0) {
                                            ii.a(var43, var17, var44, var14, var19);
                                            var14 = var14 + var19;
                                            break L16;
                                          } else {
                                            break L16;
                                          }
                                        }
                                        var17 = var17 + var19;
                                        var20++;
                                        continue L14;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              var17 = 0;
                              var18 = 0;
                              L17: while (true) {
                                if (var18 >= var5_int) {
                                  var16++;
                                  continue L12;
                                } else {
                                  L18: {
                                    var17 = var17 + var32.i(0);
                                    if (var6 != null) {
                                      var19 = var34[var18];
                                      break L18;
                                    } else {
                                      var19 = var18;
                                      break L18;
                                    }
                                  }
                                  L19: {
                                    if (param0 == var19) {
                                      var15 = var19;
                                      var14 = var14 + var17;
                                      break L19;
                                    } else {
                                      break L19;
                                    }
                                  }
                                  var18++;
                                  continue L17;
                                }
                              }
                            }
                          }
                        } else {
                          var11 = var36.length;
                          var11--;
                          var12 = var23[var11] & 255;
                          var11 = var11 - var12 * var5_int * 4;
                          var29 = new gi(var43);
                          var29.field_p = var11;
                          var38 = new int[var5_int];
                          var30 = var38;
                          var14_ref_int__ = var30;
                          var15 = 0;
                          L20: while (true) {
                            if (var15 >= var12) {
                              var39 = new byte[var5_int][];
                              var31 = var39;
                              var15_ref_byte____ = var31;
                              var16 = 0;
                              L21: while (true) {
                                if (var16 >= var5_int) {
                                  var29.field_p = var11;
                                  var16 = 0;
                                  var17 = 0;
                                  L22: while (true) {
                                    if (var17 >= var12) {
                                      var17 = 0;
                                      L23: while (true) {
                                        if (var17 >= var5_int) {
                                          break L11;
                                        } else {
                                          L24: {
                                            if (var6 == null) {
                                              var18 = var17;
                                              break L24;
                                            } else {
                                              var18 = var34[var17];
                                              break L24;
                                            }
                                          }
                                          L25: {
                                            if (0 != this.field_d) {
                                              var7[var18] = var39[var17];
                                              break L25;
                                            } else {
                                              var7[var18] = ah.a(false, var39[var17], 0);
                                              break L25;
                                            }
                                          }
                                          var17++;
                                          continue L23;
                                        }
                                      }
                                    } else {
                                      var18 = 0;
                                      var19 = 0;
                                      L26: while (true) {
                                        if (var19 >= var5_int) {
                                          var17++;
                                          continue L22;
                                        } else {
                                          var18 = var18 + var29.i(0);
                                          ii.a(var43, var16, var39[var19], var38[var19], var18);
                                          var16 = var16 + var18;
                                          var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                                          var19++;
                                          continue L26;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  array$1 = new byte[var38[var16]];
                                  var15_ref_byte____[var16] = array$1;
                                  var38[var16] = 0;
                                  var16++;
                                  continue L21;
                                }
                              }
                            } else {
                              var16 = 0;
                              var17 = 0;
                              L27: while (true) {
                                if (var5_int <= var17) {
                                  var15++;
                                  continue L20;
                                } else {
                                  var16 = var16 + var29.i(0);
                                  var14_ref_int__[var17] = var14_ref_int__[var17] + var16;
                                  var17++;
                                  continue L27;
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
                        if (this.field_d == 0) {
                          var7[var11] = ah.a(false, var43, 0);
                          break L11;
                        } else {
                          var7[var11] = var36;
                          return true;
                        }
                      }
                    }
                    stackIn_103_0 = 1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    stackIn_22_0 = 1;
                    decompiledRegionSelector0 = 2;
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
            stackIn_106_0 = (RuntimeException) (var5);

            stackIn_106_1 = new StringBuilder().append("cm.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_107_0 = (RuntimeException) ((Object) stackIn_106_0);
              stackIn_107_1 = (StringBuilder) ((Object) stackIn_106_1);
              stackIn_107_2 = "null";
              break L29;
            } else {
              stackIn_107_0 = (RuntimeException) ((Object) stackIn_106_0);
              stackIn_107_1 = (StringBuilder) ((Object) stackIn_106_1);
              stackIn_107_2 = "{...}";
              break L29;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_107_0), stackIn_107_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_22_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_88_0 != 0;
              } else {
                return stackIn_103_0 != 0;
              }
            }
          }
        }
    }

    final int a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
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
            L1: {
              if (param1 >= 0) {
                break L1;
              } else {
                ((byte[]) (this.field_k[18]))[0] = (byte) -10;
                break L1;
              }
            }
            if (!this.a(true)) {
              stackIn_5_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) ((Object) param0);
              var3_int = this.field_a.field_n.a(ij.a(var4, false), (byte) 120);
              if (this.b(var3_int, true)) {
                stackIn_10_0 = var3_int;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_8_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("cm.C(");

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
          throw ci.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    final int a(boolean param0, int param1) {
        if (!(this.b(param1, param0))) {
            return 0;
        }
        return this.field_a.field_g[param1];
    }

    final synchronized int b(int param0, int param1) {
        if (!this.b(param1, true)) {
            return 0;
        }
        if (param0 != 10407) {
            this.field_i = (Object[][]) null;
        }
        if (!(this.field_k[param1] == null)) {
            return 100;
        }
        return this.field_o.a(false, param1);
    }

    private final synchronized void a(int param0, int param1) {
        if (this.field_f) {
            this.field_k[param1] = this.field_o.a(param1, 82);
        } else {
            this.field_k[param1] = ah.a(false, this.field_o.a(param1, 2), 0);
        }
        if (param0 > -12) {
            cm.b(true);
        }
    }

    final synchronized int a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = SteelSentinels.field_G;
        if (param0 == -33) {
          if (!this.a(true)) {
            return 0;
          } else {
            var2 = 0;
            var3 = 0;
            var4 = 0;
            L0: while (true) {
              if (this.field_k.length <= var4) {
                if (-1 == (var2 ^ -1)) {
                  return 100;
                } else {
                  var4 = var3 * 100 / var2;
                  return var4;
                }
              } else {
                if ((this.field_a.field_j[var4] ^ -1) < -1) {
                  var2 += 100;
                  var3 = var3 + this.b(10407, var4);
                  var4++;
                  continue L0;
                } else {
                  var4++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return ((int[]) (this.field_k[12]))[1];
        }
    }

    public static void b(boolean param0) {
        field_l = null;
        field_m = null;
        field_p = null;
        if (param0) {
            byte[] var2 = (byte[]) null;
            cm.a((String[][]) null, (byte) 89, (cm) null, (int[]) null, (cm) null, (wk[][]) null, false, 80, 61, (String[]) null, (gk[]) null, (int[]) null, (wk[][]) null, (cm) null, (byte[]) null, (String[][]) null, (byte[]) null);
        }
        field_c = null;
        field_b = null;
        field_e = null;
        field_n = null;
        field_j = null;
        field_h = null;
    }

    private final synchronized boolean b(int param0, boolean param1) {
        if (!(this.a(param1))) {
            return false;
        }
        if ((param0 ^ -1) <= -1 && param0 < this.field_a.field_g.length && -1 != (this.field_a.field_g[param0] ^ -1)) {
            return true;
        }
        if (qi.field_l) {
            throw new IllegalArgumentException(Integer.toString(param0));
        }
        return false;
    }

    final int a(int param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String var5 = null;
        CharSequence var6 = null;
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
            if (this.b(param0, true)) {
              L1: {
                param2 = param2.toLowerCase();
                var6 = (CharSequence) ((Object) param2);
                var4_int = this.field_a.field_d[param0].a(ij.a(var6, false), (byte) 114);
                if (param1 == -32759) {
                  break L1;
                } else {
                  var5 = (String) null;
                  this.a((byte) -29, (String) null);
                  break L1;
                }
              }
              if (!this.b(param0, var4_int, -17637)) {
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

            stackIn_11_1 = new StringBuilder().append("cm.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw ci.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_8_0;
        }
    }

    final boolean a(byte param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.a(true)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param2 = param2.toLowerCase();
              param1 = param1.toLowerCase();
              var7 = (CharSequence) ((Object) param2);
              var4_int = this.field_a.field_n.a(ij.a(var7, false), (byte) 116);
              if (this.b(var4_int, true)) {
                var6 = -120 % ((param0 - 40) / 43);
                var8 = (CharSequence) ((Object) param1);
                var5 = this.field_a.field_d[var4_int].a(ij.a(var8, false), (byte) -77);
                stackIn_8_0 = this.a((byte) 97, var5, var4_int);
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
          L1: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("cm.Q(").append(param0).append(',');

            if (param1 == null) {
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
          L2: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            return stackIn_8_0;
          }
        }
    }

    final boolean a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 90) {
              if (!this.a(true)) {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                param0 = param0.toLowerCase();
                var4 = (CharSequence) ((Object) param0);
                var3_int = this.field_a.field_n.a(ij.a(var4, false), (byte) 123);
                stackIn_8_0 = this.a(var3_int, true);
                decompiledRegionSelector0 = 2;
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
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("cm.K(");

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
          throw ci.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            return stackIn_8_0;
          }
        }
    }

    final boolean a(int param0, String param1) {
        boolean discarded$1 = false;
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
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
              if (param0 == 12145) {
                break L1;
              } else {
                discarded$1 = this.b(((int[]) (((Object[]) (this.field_k[29]))[8]))[0], -80, -37);
                break L1;
              }
            }
            if (this.a(true)) {
              param1 = param1.toLowerCase();
              var4 = (CharSequence) ((Object) param1);
              var3_int = this.field_a.field_n.a(ij.a(var4, false), (byte) -121);
              if ((var3_int ^ -1) <= -1) {
                stackIn_9_0 = 1;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
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
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("cm.O(").append(param0).append(',');

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
          throw ci.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            return stackIn_9_0 != 0;
          }
        }
    }

    final static void a(String[][] param0, byte param1, cm param2, int[] param3, cm param4, wk[][] param5, boolean param6, int param7, int param8, String[] param9, gk[] param10, int[] param11, wk[][] param12, cm param13, byte[] param14, String[][] param15, byte[] param16) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_42_1 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var17 = null;
        String[] var18 = null;
        try {
          L0: {
            L1: {
              if (param1 >= 53) {
                break L1;
              } else {
                cm.b(false);
                break L1;
              }
            }
            var18 = (String[]) null;
            lh.a(param11, param5, 72, param15, param4, param3, param6, param13, param9, param10, param2, param0, param14, param12, param8, (String[]) null, param16, 1, param7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var17 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var17);

            stackIn_6_1 = new StringBuilder().append("cm.H(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');

            if (param9 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param10 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param11 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L9;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');

            if (param12 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L10;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param13 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L11;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_36_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',');

            if (param14 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L12;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_39_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',');

            if (param15 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L13;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L13;
            }
          }
          L14: {


            stackIn_42_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_40_2).append(',');

            if (param16 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L14;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L14;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), stackIn_43_2 + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (param1 != 200) {
            cm.b(false);
        }
        if (param2 == 0) {
            if (-1 == (param0 ^ -1)) {
                return 0;
            }
            if (0 > param0) {
                return -2048;
            }
            return 2048;
        }
        if (0 > param2) {
            if (-1 == (param0 ^ -1)) {
                return 4096;
            }
            if (param0 < 0) {
                return rb.a(-param2, 2048, -param0) + -4096;
            }
            return 4096 - rb.a(-param2, 2048, param0);
        }
        if (0 == param0) {
            return 0;
        }
        if ((param0 ^ -1) > -1) {
            return -rb.a(param2, 2048, -param0);
        }
        return rb.a(param2, 2048, param0);
    }

    final byte[] a(int param0, byte param1, int param2) {
        if (param1 <= 20) {
            return (byte[]) null;
        }
        return this.b(param2, 126, param0, (int[]) null);
    }

    final synchronized boolean a(boolean param0) {
        if (!(null != this.field_a)) {
            this.field_a = this.field_o.b((byte) 114);
            if (!(this.field_a != null)) {
                return false;
            }
            this.field_i = new Object[this.field_a.field_u][];
            this.field_k = new Object[this.field_a.field_u];
        }
        if (!param0) {
            this.b(((byte[]) (this.field_k[0]))[10]);
            return true;
        }
        return true;
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
            if (this.a(true)) {
              L1: {
                param1 = param1.toLowerCase();
                var4 = (CharSequence) ((Object) param1);
                var3_int = this.field_a.field_n.a(ij.a(var4, false), (byte) -95);
                if (param0 > 66) {
                  break L1;
                } else {
                  this.a((String) (this.field_k[20]), (byte) -91);
                  break L1;
                }
              }
              stackIn_6_0 = this.b(10407, var3_int);
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

            stackIn_9_1 = new StringBuilder().append("cm.S(").append(param0).append(',');

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
          throw ci.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_6_0;
        }
    }

    final synchronized boolean a(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = SteelSentinels.field_G;
        if (this.a(true)) {
          L0: {
            var2 = 1;
            if (param0 == 25) {
              break L0;
            } else {
              this.a(((int[]) (((Object[]) (this.field_k[2]))[10]))[1], -7);
              break L0;
            }
          }
          var3 = 0;
          L1: while (true) {
            if (this.field_a.field_h.length <= var3) {
              return var2 != 0;
            } else {
              var4 = this.field_a.field_h[var3];
              if (null == this.field_k[var4]) {
                this.a(-52, var4);
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
        } else {
          return false;
        }
    }

    final int b(byte param0) {
        int var2 = -38 / ((param0 - 62) / 49);
        if (!(this.a(true))) {
            return -1;
        }
        return this.field_a.field_g.length;
    }

    final synchronized boolean a(int param0, boolean param1) {
        if (!this.b(param0, param1)) {
            return false;
        }
        if (null != this.field_k[param0]) {
            return true;
        }
        this.a(-123, param0);
        if (null != this.field_k[param0]) {
            return true;
        }
        return false;
    }

    final synchronized byte[] c(int param0, int param1) {
        if (!this.a(true)) {
            return null;
        }
        if (-2 == (this.field_a.field_g.length ^ -1)) {
            return this.a(0, (byte) 94, param0);
        }
        if (!this.b(param0, true)) {
            return null;
        }
        if (param1 != 28694) {
            this.b((byte) -24);
        }
        if ((this.field_a.field_g[param0] ^ -1) == -2) {
            return this.a(param0, (byte) 105, 0);
        }
        throw new RuntimeException();
    }

    private final synchronized byte[] b(int param0, int param1, int param2, int[] param3) {
        Object stackIn_12_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        Object stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        byte[] var7 = null;
        try {
          L0: {
            L1: {
              if (param1 > 57) {
                break L1;
              } else {
                this.field_d = ((int[]) (this.field_k[0]))[7];
                break L1;
              }
            }
            if (this.b(param2, param0, -17637)) {
              L2: {
                L3: {
                  var5 = null;
                  if (this.field_i[param2] == null) {
                    break L3;
                  } else {
                    if (null != this.field_i[param2][param0]) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (!this.a(param0, param2, 0, param3)) {
                  this.a(-70, param2);
                  if (this.a(param0, param2, 0, param3)) {
                    break L2;
                  } else {
                    stackIn_12_0 = null;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                } else {
                  break L2;
                }
              }
              if (this.field_i[param2] != null) {
                L4: {
                  if (null == this.field_i[param2][param0]) {
                    break L4;
                  } else {
                    var7 = dk.a(false, this.field_i[param2][param0], 0);
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
                    if (1 != this.field_d) {
                      if (-3 != (this.field_d ^ -1)) {
                        break L5;
                      } else {
                        this.field_i[param2] = null;
                        break L5;
                      }
                    } else {
                      this.field_i[param2][param0] = null;
                      if (-2 != (this.field_a.field_g[param2] ^ -1)) {
                        break L5;
                      } else {
                        this.field_i[param2] = null;
                        break L5;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                stackIn_26_0 = var5;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                throw new RuntimeException("");
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_29_0 = var5;

            stackIn_29_1 = new StringBuilder().append("cm.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_30_0 = stackIn_29_0;
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L6;
            } else {
              stackIn_30_0 = stackIn_29_0;
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L6;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_12_0);
        } else {
          return (byte[]) ((Object) stackIn_26_0);
        }
    }

    final synchronized byte[] a(String param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        byte[] stackIn_10_0 = null;
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
            if (this.a(true)) {
              param2 = param2.toLowerCase();
              param0 = param0.toLowerCase();
              if (param1 == -742) {
                var6 = (CharSequence) ((Object) param2);
                var4_int = this.field_a.field_n.a(ij.a(var6, false), (byte) 117);
                if (this.b(var4_int, true)) {
                  var7 = (CharSequence) ((Object) param0);
                  var5 = this.field_a.field_d[var4_int].a(ij.a(var7, false), (byte) -17);
                  stackIn_10_0 = this.a(var4_int, (byte) 56, var5);
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_8_0 = null;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = (byte[]) null;
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
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("cm.U(");

            if (param0 == null) {
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
          L2: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (byte[]) ((Object) stackIn_8_0);
            } else {
              return stackIn_10_0;
            }
          }
        }
    }

    cm(fa param0, boolean param1, int param2) {
        this.field_a = null;
        try {
            if ((param2 ^ -1) > -1 || (param2 ^ -1) < -3) {
                throw new IllegalArgumentException("");
            }
            this.field_f = param1 ? true : false;
            this.field_d = param2;
            this.field_o = param0;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "cm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        int var0 = 0;
        field_l = new int[8192];
        field_c = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find a suitable opponent in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_e = new int[105];
        field_n = "Unpacking sound effects";
        field_e[1] = 256;
        field_e[39] = 148;
        field_e[63] = 100;
        field_e[38] = 16;
        field_e[42] = 105;
        field_e[49] = 40;
        field_e[82] = 128;
        field_e[10] = 256;
        field_e[46] = 149;
        field_e[100] = 256;
        field_e[40] = 20;
        field_e[2] = 256;
        field_e[33] = 148;
        field_e[21] = 200;
        field_e[98] = 256;
        field_e[32] = 150;
        field_e[71] = 128;
        field_e[89] = 150;
        field_e[4] = 200;
        field_e[54] = 150;
        field_e[83] = 128;
        field_e[26] = 90;
        field_e[93] = 256;
        field_e[31] = 137;
        field_e[48] = 150;
        field_e[74] = 128;
        field_e[44] = 89;
        field_e[79] = 128;
        field_e[102] = 256;
        field_e[12] = 256;
        field_e[92] = 256;
        field_e[69] = 256;
        field_e[47] = 150;
        field_e[66] = 25;
        field_e[95] = 256;
        field_e[60] = 256;
        field_e[97] = 256;
        field_e[7] = 256;
        field_e[35] = 256;
        field_e[84] = 150;
        field_e[85] = 150;
        field_e[20] = 179;
        field_e[17] = 256;
        field_e[56] = 150;
        field_e[13] = 120;
        field_e[16] = 32;
        field_e[86] = 150;
        field_e[104] = 256;
        field_e[103] = 256;
        field_e[80] = 128;
        field_e[81] = 128;
        field_e[50] = 137;
        field_e[8] = 200;
        field_e[15] = 118;
        field_e[37] = 52;
        field_e[64] = 114;
        field_e[87] = 150;
        field_e[90] = 200;
        field_e[67] = 40;
        field_e[91] = 256;
        field_e[75] = 128;
        field_e[25] = 150;
        field_e[9] = 200;
        field_e[73] = 128;
        field_e[94] = 166;
        field_e[11] = 110;
        field_e[96] = 256;
        field_e[19] = 177;
        field_e[58] = 256;
        field_e[88] = 150;
        field_e[76] = 128;
        field_e[77] = 128;
        field_e[59] = 25;
        field_e[27] = 256;
        field_e[68] = 16;
        field_e[61] = 160;
        field_e[14] = 150;
        field_e[62] = 73;
        field_e[28] = 90;
        field_e[57] = 150;
        field_e[22] = 144;
        field_e[23] = 256;
        field_e[99] = 256;
        field_e[43] = 139;
        field_e[24] = 155;
        field_e[18] = 256;
        field_e[30] = 256;
        field_e[65] = 256;
        field_e[6] = 256;
        field_e[51] = 170;
        field_e[55] = 100;
        field_e[72] = 128;
        field_e[41] = 256;
        field_e[5] = 256;
        field_e[36] = 16;
        field_e[29] = 256;
        field_e[45] = 150;
        field_e[78] = 128;
        field_e[34] = 150;
        field_e[52] = 150;
        field_e[3] = 256;
        field_e[53] = 150;
        field_e[0] = 200;
        for (var0 = 0; var0 < field_e.length; var0++) {
            field_e[var0] = field_e[var0] * 3 / 4;
        }
        field_m = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_p = "FAVOURITES";
    }
}
