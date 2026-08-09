/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db {
    private qg field_b;
    static int field_i;
    private int field_d;
    private Object[][] field_e;
    private Object[] field_h;
    private boolean field_c;
    static String field_f;
    private lk field_g;
    static dl[] field_j;
    static wj[] field_a;

    private final synchronized boolean a(byte param0, int param1) {
        if (!this.a((byte) 102)) {
          return false;
        } else {
          L0: {
            if (param1 < 0) {
              break L0;
            } else {
              if (this.field_b.field_l.length <= param1) {
                break L0;
              } else {
                if (this.field_b.field_l[param1] == 0) {
                  break L0;
                } else {
                  if (param0 == 4) {
                    return true;
                  } else {
                    ((long[]) (this.field_h[6]))[10] = 74L;
                    return true;
                  }
                }
              }
            }
          }
          if (aq.field_r) {
            throw new IllegalArgumentException(Integer.toString(param1));
          } else {
            return false;
          }
        }
    }

    final synchronized boolean a(int param0, byte param1, int param2) {
        if (!(this.a(param2, 0, param0))) {
            return false;
        }
        if (this.field_e[param0] != null && this.field_e[param0][param2] != null) {
            return true;
        }
        if (null != this.field_h[param0]) {
            return true;
        }
        if (param1 <= 126) {
            field_f = (String) null;
        }
        this.c(param0, 24634);
        if (this.field_h[param0] != null) {
            return true;
        }
        return false;
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        if (!this.a((byte) 102)) {
            return false;
        }
        if (param1 != 0) {
            return ((boolean[]) (this.field_h[2]))[0];
        }
        if ((param2 ^ -1) > -1 || param0 < 0 || this.field_b.field_l.length <= param2 || param0 >= this.field_b.field_l[param2]) {
            if (aq.field_r) {
                throw new IllegalArgumentException(param2 + " " + param0);
            }
            return false;
        }
        return true;
    }

    final boolean c(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
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
            if (this.a((byte) 102)) {
              param0 = param0.toLowerCase();
              if (param1 < -42) {
                var4 = (CharSequence) ((Object) param0);
                var3_int = this.field_b.field_t.a(0, v.a(-2057727803, var4));
                if ((var3_int ^ -1) <= -1) {
                  stackIn_10_0 = 1;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_8_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = ((boolean[]) (this.field_h[8]))[2];
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
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("db.J(");

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
          throw dn.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0 != 0;
            } else {
              return stackIn_10_0 != 0;
            }
          }
        }
    }

    final byte[] a(boolean param0, int[] param1, String param2, String param3) {
        boolean discarded$1 = false;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        byte[] stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a((byte) 102)) {
              L1: {
                param3 = param3.toLowerCase();
                param2 = param2.toLowerCase();
                if (!param0) {
                  break L1;
                } else {
                  discarded$1 = this.a((byte) -107, ((int[]) (this.field_h[3]))[1]);
                  break L1;
                }
              }
              var7 = (CharSequence) ((Object) param3);
              var5_int = this.field_b.field_t.a(0, v.a(-2057727803, var7));
              if (this.a((byte) 4, var5_int)) {
                L2: {
                  var8 = (CharSequence) ((Object) param2);
                  var6 = this.field_b.field_i[var5_int].a(0, v.a(-2057727803, var8));
                  stackIn_10_0 = this;

                  stackIn_10_1 = var5_int;

                  if (param0) {
                    stackIn_11_0 = this;
                    stackIn_11_1 = stackIn_10_1;
                    stackIn_11_2 = 0;
                    break L2;
                  } else {
                    stackIn_11_0 = this;
                    stackIn_11_1 = stackIn_10_1;
                    stackIn_11_2 = 1;
                    break L2;
                  }
                }
                stackIn_12_0 = this.a(stackIn_11_1, stackIn_11_2 != 0, param1, var6);
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
          L3: {
            var5 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("db.W(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_16_0), stackIn_22_2 + ')');
        }
        return stackIn_12_0;
    }

    final synchronized byte[] d(int param0, int param1) {
        if (!this.a((byte) 102)) {
            return null;
        }
        if (!(this.field_b.field_l.length != 1)) {
            return this.b(param1, 0, 0);
        }
        if (!this.a((byte) 4, param1)) {
            return null;
        }
        if (this.field_b.field_l[param1] == 1) {
            return this.b(0, 0, param1);
        }
        if (param0 >= -47) {
            return (byte[]) (this.field_h[9]);
        }
        throw new RuntimeException();
    }

    final synchronized int b(int param0, int param1) {
        if (!(this.a((byte) 4, param1))) {
            return 0;
        }
        if (null != this.field_h[param1]) {
            return 100;
        }
        if (param0 != 25030) {
            field_j = (dl[]) null;
        }
        return this.field_g.a(param1, 486289953);
    }

    final byte[] b(int param0, int param1, int param2) {
        if (param1 != 0) {
            return (byte[]) (this.field_h[19]);
        }
        return this.a(param2, true, (int[]) null, param0);
    }

    final boolean a(int param0, String param1) {
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
            if (!this.a((byte) 102)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 == -20402) {
                  break L1;
                } else {
                  db.b((byte) -19);
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              var4 = (CharSequence) ((Object) param1);
              var3_int = this.field_b.field_t.a(0, v.a(param0 + -2057707401, var4));
              stackIn_7_0 = this.e(var3_int, 83);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("db.T(").append(param0).append(',');

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
          throw dn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_7_0;
        }
    }

    public static void b(byte param0) {
        field_a = null;
        if (param0 != 127) {
            db.b((byte) -99);
        }
        field_j = null;
        field_f = null;
    }

    final static String a(byte param0, byte[] param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 87) {
                break L1;
              } else {
                field_a = (wj[]) null;
                break L1;
              }
            }
            stackIn_3_0 = uh.a(param1, 192, 0, param1.length);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("db.H(").append(param0).append(',');

            if (param1 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    private final synchronized boolean a(int param0, int[] param1, int param2, int param3) {
        Object[] array$0 = null;
        byte[] array$1 = null;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_80_0 = 0;
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
        ng var26 = null;
        byte[] var27 = null;
        ng var29 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        ng var32 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var38 = null;
        byte[][] var39 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        var22 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (param3 == 30511) {
                break L1;
              } else {
                ((boolean[]) (this.field_h[32]))[0] = true;
                break L1;
              }
            }
            if (!this.a((byte) 4, param0)) {
              stackIn_6_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (null != this.field_h[param0]) {
                L2: {
                  var5_int = this.field_b.field_f[param0];
                  var34 = this.field_b.field_h[param0];
                  var24 = var34;
                  var6 = var24;
                  if (null != this.field_e[param0]) {
                    break L2;
                  } else {
                    array$0 = new Object[this.field_b.field_l[param0]];
                    this.field_e[param0] = array$0;
                    break L2;
                  }
                }
                var7 = this.field_e[param0];
                var8 = 1;
                var9_int = 0;
                L3: while (true) {
                  L4: {
                    if (var5_int <= var9_int) {
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
                      if (var7[var10] != null) {
                        var9_int++;
                        continue L3;
                      } else {
                        var8 = 0;
                        break L4;
                      }
                    }
                  }
                  if (var8 != 0) {
                    stackIn_23_0 = 1;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    L6: {
                      L7: {
                        if (null == param1) {
                          break L7;
                        } else {
                          L8: {
                            if (-1 != (param1[0] ^ -1)) {
                              break L8;
                            } else {
                              if (param1[1] != 0) {
                                break L8;
                              } else {
                                if (param1[2] != 0) {
                                  break L8;
                                } else {
                                  if (-1 != (param1[3] ^ -1)) {
                                    break L8;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                          var35 = l.a((byte) 110, true, this.field_h[param0]);
                          var25 = var35;
                          var9 = var25;
                          var26 = new ng(var35);
                          var26.a(8, 5, var26.field_h.length, param1);
                          break L6;
                        }
                      }
                      var9 = l.a((byte) 110, false, this.field_h[param0]);
                      break L6;
                    }
                    try {
                      L9: {
                        var36 = b.a(var9, -1);
                        var27 = var36;
                        var23 = var27;
                        var43 = var23;
                        break L9;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L10: {
                        var11_ref_RuntimeException = decompiledCaughtException;
                        stackIn_36_0 = (RuntimeException) (var11_ref_RuntimeException);

                        stackIn_36_1 = new StringBuilder();

                        if (param1 == null) {
                          stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
                          stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
                          stackIn_37_2 = 0;
                          break L10;
                        } else {
                          stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
                          stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
                          stackIn_37_2 = 1;
                          break L10;
                        }
                      }
                      throw dn.a((Throwable) ((Object) stackIn_37_0), (stackIn_37_2 != 0) + " " + param0 + " " + param1.length + " " + gi.a(param1.length, var9, 26009) + " " + gi.a(-2 + param1.length, var9, param3 + -4502) + " " + this.field_b.field_n[param0] + " " + this.field_b.field_b);
                    }
                    L11: {
                      if (this.field_c) {
                        this.field_h[param0] = null;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (-2 <= (var5_int ^ -1)) {
                        L13: {
                          if (var6 != null) {
                            var11 = var34[0];
                            break L13;
                          } else {
                            var11 = 0;
                            break L13;
                          }
                        }
                        if (this.field_d == 0) {
                          var7[var11] = fj.a(false, true, var43);
                          break L12;
                        } else {
                          var7[var11] = var36;
                          break L12;
                        }
                      } else {
                        if (2 == this.field_d) {
                          var11 = var36.length;
                          var11--;
                          var12 = 255 & var23[var11];
                          var11 = var11 - 4 * var5_int * var12;
                          var32 = new ng(var43);
                          var14 = 0;
                          var15 = 0;
                          var32.field_f = var11;
                          var16 = 0;
                          L14: while (true) {
                            if (var16 >= var12) {
                              if (-1 != (var14 ^ -1)) {
                                var44 = new byte[var14];
                                var32.field_f = var11;
                                var14 = 0;
                                var17 = 0;
                                var18 = 0;
                                L15: while (true) {
                                  if (var18 >= var12) {
                                    var7[var15] = var44;
                                    return true;
                                  } else {
                                    var19 = 0;
                                    var20 = 0;
                                    L16: while (true) {
                                      if (var20 >= var5_int) {
                                        var18++;
                                        continue L15;
                                      } else {
                                        L17: {
                                          var19 = var19 + var32.b((byte) 127);
                                          if (var6 == null) {
                                            var21 = var20;
                                            break L17;
                                          } else {
                                            var21 = var34[var20];
                                            break L17;
                                          }
                                        }
                                        L18: {
                                          if (var21 == param2) {
                                            eg.a(var43, var17, var44, var14, var19);
                                            var14 = var14 + var19;
                                            break L18;
                                          } else {
                                            break L18;
                                          }
                                        }
                                        var17 = var17 + var19;
                                        var20++;
                                        continue L16;
                                      }
                                    }
                                  }
                                }
                              } else {
                                stackIn_80_0 = 1;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              }
                            } else {
                              var17 = 0;
                              var18 = 0;
                              L19: while (true) {
                                if (var18 >= var5_int) {
                                  var16++;
                                  continue L14;
                                } else {
                                  L20: {
                                    var17 = var17 + var32.b((byte) -32);
                                    if (var6 != null) {
                                      var19 = var34[var18];
                                      break L20;
                                    } else {
                                      var19 = var18;
                                      break L20;
                                    }
                                  }
                                  if (param2 == var19) {
                                    var15 = var19;
                                    var14 = var14 + var17;
                                    var18++;
                                    continue L19;
                                  } else {
                                    var18++;
                                    continue L19;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var11 = var36.length;
                          var11--;
                          var12 = var23[var11] & 255;
                          var11 = var11 - var12 * (var5_int * 4);
                          var29 = new ng(var43);
                          var38 = new int[var5_int];
                          var30 = var38;
                          var14_ref_int__ = var30;
                          var29.field_f = var11;
                          var15 = 0;
                          L21: while (true) {
                            if (var12 <= var15) {
                              var39 = new byte[var5_int][];
                              var31 = var39;
                              var15_ref_byte____ = var31;
                              var16 = 0;
                              L22: while (true) {
                                if (var16 >= var5_int) {
                                  var29.field_f = var11;
                                  var16 = 0;
                                  var17 = 0;
                                  L23: while (true) {
                                    if (var12 <= var17) {
                                      var17 = 0;
                                      L24: while (true) {
                                        if (var17 >= var5_int) {
                                          break L12;
                                        } else {
                                          L25: {
                                            if (var6 == null) {
                                              var18 = var17;
                                              break L25;
                                            } else {
                                              var18 = var34[var17];
                                              break L25;
                                            }
                                          }
                                          L26: {
                                            if (0 != this.field_d) {
                                              var7[var18] = var39[var17];
                                              break L26;
                                            } else {
                                              var7[var18] = fj.a(false, true, var39[var17]);
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
                                          var18 = var18 + var29.b((byte) 127);
                                          eg.a(var43, var16, var39[var19], var38[var19], var18);
                                          var16 = var16 + var18;
                                          var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
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
                                  var16 = var16 + var29.b((byte) -65);
                                  var14_ref_int__[var17] = var14_ref_int__[var17] + var16;
                                  var17++;
                                  continue L28;
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
              } else {
                stackIn_9_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L29: {
            var5 = decompiledCaughtException;
            stackIn_104_0 = (RuntimeException) (var5);

            stackIn_104_1 = new StringBuilder().append("db.BA(").append(param0).append(',');

            if (param1 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_105_0), stackIn_105_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_23_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_80_0 != 0;
              } else {
                return stackIn_101_0 != 0;
              }
            }
          }
        }
    }

    private final synchronized void c(int param0, int param1) {
        if (this.field_c) {
            this.field_h[param0] = this.field_g.a(param0, false);
        } else {
            this.field_h[param0] = fj.a(false, true, this.field_g.a(param0, false));
        }
        if (param1 != 24634) {
            field_a = (wj[]) (this.field_h[2]);
        }
    }

    final int b(String param0, int param1) {
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
            if (this.a((byte) 102)) {
              L1: {
                param0 = param0.toLowerCase();
                if (param1 < -27) {
                  break L1;
                } else {
                  this.a((String) (this.field_h[4]), 25);
                  break L1;
                }
              }
              var4 = (CharSequence) ((Object) param0);
              var3_int = this.field_b.field_t.a(0, v.a(-2057727803, var4));
              stackIn_6_0 = this.b(25030, var3_int);
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

            stackIn_9_1 = new StringBuilder().append("db.A(");

            if (param0 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_6_0;
        }
    }

    final int a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
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
            if (this.a((byte) 102)) {
              L1: {
                if (param1 == -1) {
                  break L1;
                } else {
                  this.field_d = ((int[]) (this.field_h[7]))[20];
                  break L1;
                }
              }
              param0 = param0.toLowerCase();
              var4 = (CharSequence) ((Object) param0);
              var3_int = this.field_b.field_t.a(0, v.a(-2057727803, var4));
              if (this.a((byte) 4, var3_int)) {
                stackIn_9_0 = var3_int;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_7_0 = -1;
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

            stackIn_12_1 = new StringBuilder().append("db.I(");

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
          throw dn.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_9_0;
          }
        }
    }

    final synchronized boolean a(byte param0) {
        if (param0 != 102) {
            return false;
        }
        if (null != this.field_b) {
            return true;
        }
        this.field_b = this.field_g.a(630779105);
        if (null == this.field_b) {
            return false;
        }
        this.field_h = new Object[this.field_b.field_a];
        this.field_e = new Object[this.field_b.field_a][];
        return true;
    }

    final synchronized byte[] a(int param0, String param1, String param2) {
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
            if (this.a((byte) 102)) {
              L1: {
                param2 = param2.toLowerCase();
                if (param0 == 7693) {
                  break L1;
                } else {
                  this.field_d = -38;
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              var6 = (CharSequence) ((Object) param2);
              var4_int = this.field_b.field_t.a(0, v.a(-2057727803, var6));
              if (this.a((byte) 4, var4_int)) {
                var7 = (CharSequence) ((Object) param1);
                var5 = this.field_b.field_i[var4_int].a(0, v.a(-2057727803, var7));
                stackIn_9_0 = this.b(var5, 0, var4_int);
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

            stackIn_12_1 = new StringBuilder().append("db.R(").append(param0).append(',');

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
          throw dn.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
        return stackIn_9_0;
    }

    final synchronized boolean a(boolean param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = CrazyCrystals.field_B;
        if (this.a((byte) 102)) {
          var2 = 1;
          var3 = 0;
          L0: while (true) {
            if (var3 >= this.field_b.field_e.length) {
              if (!param0) {
                return var2 != 0;
              } else {
                return true;
              }
            } else {
              var4 = this.field_b.field_e[var3];
              if (null == this.field_h[var4]) {
                this.c(var4, 24634);
                if (this.field_h[var4] == null) {
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

    final synchronized int b(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = CrazyCrystals.field_B;
        if (this.a((byte) 102)) {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (var4 >= this.field_h.length) {
              if (var2 != 0) {
                L1: {
                  if (param0 == 3492) {
                    break L1;
                  } else {
                    ((byte[]) (this.field_h[4]))[1] = (byte) -15;
                    break L1;
                  }
                }
                var4 = var3 * 100 / var2;
                return var4;
              } else {
                return 100;
              }
            } else {
              if ((this.field_b.field_f[var4] ^ -1) < -1) {
                var3 = var3 + this.b(25030, var4);
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

    final int a(int param0, int param1) {
        if (!(this.a((byte) 4, param0))) {
            return 0;
        }
        if (param1 != 0) {
            return 32;
        }
        return this.field_b.field_l[param0];
    }

    final synchronized boolean e(int param0, int param1) {
        if (param1 <= 46) {
            this.b(102, 116);
        }
        if (!this.a((byte) 4, param0)) {
            return false;
        }
        if (this.field_h[param0] != null) {
            return true;
        }
        this.c(param0, 24634);
        if (this.field_h[param0] == null) {
            return false;
        }
        return true;
    }

    final int a(int param0) {
        if (param0 < 17) {
            String var3 = (String) null;
            this.a((String) null, 104);
        }
        if (!this.a((byte) 102)) {
            return -1;
        }
        return this.field_b.field_l.length;
    }

    final int a(int param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_3_0 = 0;
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
            if (!this.a((byte) 4, param2)) {
              stackIn_3_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 == -2862) {
                  break L1;
                } else {
                  this.field_e = (Object[][]) null;
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              var5 = (CharSequence) ((Object) param1);
              var4_int = this.field_b.field_i[param2].a(0, v.a(-2057727803, var5));
              if (this.a(var4_int, 0, param2)) {
                stackIn_10_0 = var4_int;
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
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("db.M(").append(param0).append(',');

            if (param1 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    private final synchronized byte[] a(int param0, boolean param1, int[] param2, int param3) {
        Object stackIn_9_0 = null;
        byte[] stackIn_14_0 = null;
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
            if (this.a(param3, 0, param0)) {
              L1: {
                L2: {
                  var5 = null;
                  if (this.field_e[param0] == null) {
                    break L2;
                  } else {
                    if (this.field_e[param0][param3] == null) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                if (this.a(param0, param2, param3, 30511)) {
                  break L1;
                } else {
                  this.c(param0, 24634);
                  if (this.a(param0, param2, param3, 30511)) {
                    break L1;
                  } else {
                    stackIn_9_0 = null;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
              if (this.field_e[param0] != null) {
                if (param1) {
                  L3: {
                    if (this.field_e[param0][param3] != null) {
                      var7 = l.a((byte) 110, false, this.field_e[param0][param3]);
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
                  L4: {
                    if (var5 == null) {
                      break L4;
                    } else {
                      if (1 == this.field_d) {
                        this.field_e[param0][param3] = null;
                        if (this.field_b.field_l[param0] != 1) {
                          break L4;
                        } else {
                          this.field_e[param0] = null;
                          break L4;
                        }
                      } else {
                        if (-3 == (this.field_d ^ -1)) {
                          this.field_e[param0] = null;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  stackIn_28_0 = var5;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_14_0 = (byte[]) null;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                throw new RuntimeException("");
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

            stackIn_31_1 = new StringBuilder().append("db.AA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_9_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0;
          } else {
            return (byte[]) ((Object) stackIn_28_0);
          }
        }
    }

    db(lk param0, boolean param1, int param2) {
        this.field_b = null;
        try {
            if (0 > param2 || 2 < param2) {
                throw new IllegalArgumentException("");
            }
            this.field_g = param0;
            this.field_c = param1 ? true : false;
            this.field_d = param2;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "db.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean a(byte param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
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
            if (!this.a((byte) 102)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param1 = param1.toLowerCase();
              param2 = param2.toLowerCase();
              if (param0 == 43) {
                var6 = (CharSequence) ((Object) param1);
                var4_int = this.field_b.field_t.a(param0 ^ 43, v.a(-2057727803, var6));
                if (!this.a((byte) 4, var4_int)) {
                  stackIn_10_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var7 = (CharSequence) ((Object) param2);
                  var5 = this.field_b.field_i[var4_int].a(0, v.a(param0 + -2057727846, var7));
                  stackIn_12_0 = this.a(var4_int, (byte) 127, var5);
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                stackIn_6_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("db.U(").append(param0).append(',');

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
          throw dn.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0 != 0;
            } else {
              return stackIn_12_0;
            }
          }
        }
    }

    static {
        field_f = "That name is not available";
    }
}
