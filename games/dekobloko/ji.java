/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji {
    static String field_h;
    int field_g;
    private ad field_f;
    private of field_a;
    static String field_c;
    private Object[][] field_e;
    private Object[] field_d;
    boolean field_b;

    private final synchronized void a(int param0, int param1) {
        if (this.field_b) {
            this.field_d[param1] = this.field_a.a(param1, (byte) 91);
        } else {
            this.field_d[param1] = qk.a(this.field_a.a(param1, (byte) 91), -1389597532, false);
        }
        if (param0 != 20351) {
            field_c = (String) null;
        }
    }

    final synchronized boolean b(int param0, byte param1) {
        if (!(this.a(param0, (byte) -83))) {
            return false;
        }
        if (this.field_d[param0] != null) {
            return true;
        }
        if (param1 != -106) {
            return ((boolean[]) (this.field_d[0]))[0];
        }
        this.a(20351, param0);
        if (null != this.field_d[param0]) {
            return true;
        }
        return false;
    }

    final int b(int param0, String param1) {
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
            if (!this.a((byte) 121)) {
              stackIn_3_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 == -1) {
                  break L1;
                } else {
                  field_h = (String) null;
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              var4 = (CharSequence) ((Object) param1);
              var3_int = this.field_f.field_e.a((byte) -68, ta.a(var4, 90));
              if (!this.a(var3_int, (byte) -83)) {
                stackIn_9_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return var3_int;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("ji.D(").append(param0).append(',');

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
          throw dh.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_9_0;
        }
    }

    final boolean a(String param0, boolean param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_2_0 = 0;
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
            if (param1) {
              if (!this.a((byte) 121)) {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                param2 = param2.toLowerCase();
                param0 = param0.toLowerCase();
                var6 = (CharSequence) ((Object) param2);
                var4_int = this.field_f.field_e.a((byte) -68, ta.a(var6, -10));
                if (!this.a(var4_int, (byte) -83)) {
                  stackIn_10_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var7 = (CharSequence) ((Object) param0);
                  var5 = this.field_f.field_o[var4_int].a((byte) -68, ta.a(var7, 11));
                  stackIn_12_0 = this.a((byte) -84, var5, var4_int);
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("ji.N(");

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
          L2: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');

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
          throw dh.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
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

    final int b(int param0, int param1) {
        if (param0 != -5228) {
            return -48;
        }
        if (!(this.a(param1, (byte) -83))) {
            return 0;
        }
        return this.field_f.field_k[param1];
    }

    public static void a(int param0) {
        field_c = null;
        field_h = null;
        if (param0 < 125) {
            field_c = (String) null;
        }
    }

    final boolean a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
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
            if (!this.a((byte) 121)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param0 = param0.toLowerCase();
              var3_int = -49 / ((param1 - 13) / 42);
              var5 = (CharSequence) ((Object) param0);
              var4 = this.field_f.field_e.a((byte) -68, ta.a(var5, -112));
              stackIn_5_0 = this.b(var4, (byte) -106);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("ji.K(");

            if (param0 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_5_0;
        }
    }

    final boolean a(String param0, int param1) {
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
            if (this.a((byte) 121)) {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) ((Object) param0);
              var3_int = this.field_f.field_e.a((byte) -68, ta.a(var4, 86));
              if (var3_int < param1) {
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

            stackIn_9_1 = new StringBuilder().append("ji.W(");

            if (param0 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    private final synchronized boolean a(int[] param0, int param1, int param2, int param3) {
        Object[] array$0 = null;
        byte[] array$1 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_12_0 = false;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_79_0 = 0;
        int stackIn_99_0 = 0;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_103_2 = null;
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
        wl var26 = null;
        byte[] var27 = null;
        wl var29 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        wl var32 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var38 = null;
        byte[][] var39 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        var22 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (this.a(param1, (byte) -83)) {
              if (null != this.field_d[param1]) {
                L1: {
                  var5_int = this.field_f.field_B[param1];
                  var34 = this.field_f.field_v[param1];
                  var24 = var34;
                  var6 = var24;
                  if (this.field_e[param1] == null) {
                    array$0 = new Object[this.field_f.field_k[param1]];
                    this.field_e[param1] = array$0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                if (param3 == 26687) {
                  var7 = this.field_e[param1];
                  var8 = 1;
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
                        if (var7[var10] != null) {
                          var9_int++;
                          continue L2;
                        } else {
                          var8 = 0;
                          break L3;
                        }
                      }
                    }
                    if (var8 == 0) {
                      L5: {
                        L6: {
                          if (param0 == null) {
                            break L6;
                          } else {
                            L7: {
                              if (param0[0] != 0) {
                                break L7;
                              } else {
                                if (param0[1] != 0) {
                                  break L7;
                                } else {
                                  if (param0[2] != 0) {
                                    break L7;
                                  } else {
                                    if (0 == param0[3]) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                            }
                            var35 = cf.a(true, 78, this.field_d[param1]);
                            var25 = var35;
                            var9 = var25;
                            var26 = new wl(var35);
                            var26.a((byte) 51, 5, param0, var26.field_r.length);
                            break L5;
                          }
                        }
                        var9 = cf.a(false, param3 ^ 26717, this.field_d[param1]);
                        break L5;
                      }
                      try {
                        L8: {
                          var36 = i.a(var9, -120);
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

                          if (param0 == null) {
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
                        throw dh.a((Throwable) ((Object) stackIn_37_0), (stackIn_37_2 != 0) + " " + param1 + " " + var9.length + " " + tj.a(var9.length, 0, var9) + " " + tj.a(-2 + var9.length, 0, var9) + " " + this.field_f.field_c[param1] + " " + this.field_f.field_s);
                      }
                      L10: {
                        if (!this.field_b) {
                          break L10;
                        } else {
                          this.field_d[param1] = null;
                          break L10;
                        }
                      }
                      L11: {
                        if (-2 <= (var5_int ^ -1)) {
                          L12: {
                            if (var6 == null) {
                              var11 = 0;
                              break L12;
                            } else {
                              var11 = var34[0];
                              break L12;
                            }
                          }
                          if (-1 != (this.field_g ^ -1)) {
                            var7[var11] = var43;
                            break L11;
                          } else {
                            var7[var11] = qk.a(var36, -1389597532, false);
                            break L11;
                          }
                        } else {
                          if (-3 == (this.field_g ^ -1)) {
                            var11 = var36.length;
                            var11--;
                            var12 = 255 & var23[var11];
                            var11 = var11 - var12 * var5_int * 4;
                            var32 = new wl(var43);
                            var14 = 0;
                            var32.field_n = var11;
                            var15 = 0;
                            var16 = 0;
                            L13: while (true) {
                              if (var12 <= var16) {
                                if (var14 != 0) {
                                  var44 = new byte[var14];
                                  var32.field_n = var11;
                                  var14 = 0;
                                  var17 = 0;
                                  var18 = 0;
                                  L14: while (true) {
                                    if (var18 >= var12) {
                                      var7[var15] = var44;
                                      return true;
                                    } else {
                                      var19 = 0;
                                      var20 = 0;
                                      L15: while (true) {
                                        if (var20 >= var5_int) {
                                          var18++;
                                          continue L14;
                                        } else {
                                          L16: {
                                            var19 = var19 + var32.i(param3 ^ 30142);
                                            if (var6 != null) {
                                              var21 = var34[var20];
                                              break L16;
                                            } else {
                                              var21 = var20;
                                              break L16;
                                            }
                                          }
                                          L17: {
                                            if (var21 != param2) {
                                              break L17;
                                            } else {
                                              an.a(var43, var17, var44, var14, var19);
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
                                  stackIn_79_0 = 1;
                                  decompiledRegionSelector0 = 4;
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
                                      var17 = var17 + var32.i(7553);
                                      if (var6 == null) {
                                        var19 = var18;
                                        break L19;
                                      } else {
                                        var19 = var34[var18];
                                        break L19;
                                      }
                                    }
                                    if (param2 == var19) {
                                      var15 = var19;
                                      var14 = var14 + var17;
                                      var18++;
                                      continue L18;
                                    } else {
                                      var18++;
                                      continue L18;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            var11 = var36.length;
                            var11--;
                            var12 = var23[var11] & 255;
                            var11 = var11 - 4 * (var12 * var5_int);
                            var29 = new wl(var43);
                            var38 = new int[var5_int];
                            var30 = var38;
                            var14_ref_int__ = var30;
                            var29.field_n = var11;
                            var15 = 0;
                            L20: while (true) {
                              if (var15 >= var12) {
                                var39 = new byte[var5_int][];
                                var31 = var39;
                                var15_ref_byte____ = var31;
                                var16 = 0;
                                L21: while (true) {
                                  if (var5_int <= var16) {
                                    var29.field_n = var11;
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
                                              if (var6 != null) {
                                                var18 = var34[var17];
                                                break L24;
                                              } else {
                                                var18 = var17;
                                                break L24;
                                              }
                                            }
                                            L25: {
                                              if (this.field_g == 0) {
                                                var7[var18] = qk.a(var39[var17], -1389597532, false);
                                                break L25;
                                              } else {
                                                var7[var18] = var39[var17];
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
                                            var18 = var18 + var29.i(7553);
                                            an.a(var43, var16, var39[var19], var38[var19], var18);
                                            var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                                            var16 = var16 + var18;
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
                                    var16 = var16 + var29.i(7553);
                                    var14_ref_int__[var17] = var14_ref_int__[var17] + var16;
                                    var17++;
                                    continue L27;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      stackIn_99_0 = 1;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      stackIn_23_0 = 1;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                } else {
                  stackIn_12_0 = ((boolean[]) (((Object[]) (this.field_d[3]))[13]))[3];
                  decompiledRegionSelector0 = 2;
                  break L0;
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
          L28: {
            var5 = decompiledCaughtException;
            stackIn_102_0 = (RuntimeException) (var5);

            stackIn_102_1 = new StringBuilder().append("ji.U(");

            if (param0 == null) {
              stackIn_103_0 = (RuntimeException) ((Object) stackIn_102_0);
              stackIn_103_1 = (StringBuilder) ((Object) stackIn_102_1);
              stackIn_103_2 = "null";
              break L28;
            } else {
              stackIn_103_0 = (RuntimeException) ((Object) stackIn_102_0);
              stackIn_103_1 = (StringBuilder) ((Object) stackIn_102_1);
              stackIn_103_2 = "{...}";
              break L28;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_103_0), stackIn_103_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_23_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_79_0 != 0;
                } else {
                  return stackIn_99_0 != 0;
                }
              }
            }
          }
        }
    }

    final synchronized int b(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = client.field_A ? 1 : 0;
        if (!this.a((byte) 121)) {
          return 0;
        } else {
          L0: {
            if (param0 <= -44) {
              break L0;
            } else {
              this.a(91, ((int[]) (((Object[]) (this.field_d[2]))[0]))[0]);
              break L0;
            }
          }
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L1: while (true) {
            if (this.field_d.length <= var4) {
              if (0 == var2) {
                return 100;
              } else {
                var4 = 100 * var3 / var2;
                return var4;
              }
            } else {
              if (this.field_f.field_B[var4] > 0) {
                var3 = var3 + this.a((byte) 34, var4);
                var2 += 100;
                var4++;
                continue L1;
              } else {
                var4++;
                continue L1;
              }
            }
          }
        }
    }

    final synchronized boolean a(byte param0) {
        if (this.field_f == null) {
            this.field_f = this.field_a.a(true);
            if (!(null != this.field_f)) {
                return false;
            }
            this.field_e = new Object[this.field_f.field_n][];
            this.field_d = new Object[this.field_f.field_n];
        }
        if (param0 != 121) {
            return false;
        }
        return true;
    }

    final synchronized byte[] a(int param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_8_0 = null;
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
            if (this.a((byte) 121)) {
              param2 = param2.toLowerCase();
              param1 = param1.toLowerCase();
              var6 = (CharSequence) ((Object) param2);
              var4_int = this.field_f.field_e.a((byte) -68, ta.a(var6, 79));
              if (this.a(var4_int, (byte) -83)) {
                if (param0 == 0) {
                  var7 = (CharSequence) ((Object) param1);
                  var5 = this.field_f.field_o[var4_int].a((byte) -68, ta.a(var7, -112));
                  stackIn_10_0 = this.a(var5, 32, var4_int);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_8_0 = (byte[]) null;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                return null;
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

            stackIn_13_1 = new StringBuilder().append("ji.F(").append(param0).append(',');

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
          L2: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

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
          throw dh.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    private final synchronized boolean a(int param0, int param1, byte param2) {
        if (!this.a((byte) 121)) {
            return false;
        }
        if (param2 != -33) {
            this.a((byte) 6, ((int[]) (this.field_d[0]))[26]);
        }
        if ((param0 ^ -1) <= -1 && (param1 ^ -1) <= -1 && param0 < this.field_f.field_k.length && this.field_f.field_k[param0] > param1) {
            return true;
        }
        if (cd.field_i) {
            throw new IllegalArgumentException(param0 + " " + param1);
        }
        return false;
    }

    final byte[] a(int param0, int param1, int param2) {
        int var4 = 118 / ((param1 - -44) / 62);
        return this.a(param0, (int[]) null, param2, (byte) -33);
    }

    final static String[] a(char param0, byte param1, String param2) {
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_3_0 = null;
        String[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (param1 == 66) {
              var10 = (CharSequence) ((Object) param2);
              var3_int = wg.a(true, var10, param0);
              var4 = new String[1 + var3_int];
              var5 = 0;
              var6 = 0;
              var7 = 0;
              L1: while (true) {
                if (var7 >= var3_int) {
                  var4[var3_int] = param2.substring(var6);
                  stackIn_11_0 = (String[]) (var4);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var8 = var6;
                  L2: while (true) {
                    if (param2.charAt(var8) == param0) {
                      incrementValue$1 = var5;
                      var5++;
                      var4[incrementValue$1] = param2.substring(var6, var8);
                      var6 = var8 + 1;
                      var7++;
                      continue L1;
                    } else {
                      var8++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              stackIn_3_0 = (String[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("ji.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_11_0;
        }
    }

    private final synchronized boolean a(int param0, byte param1) {
        if (param1 != -83) {
            this.field_a = (of) (this.field_d[0]);
        }
        if (!this.a((byte) 121)) {
            return false;
        }
        if (-1 < (param0 ^ -1) || param0 >= this.field_f.field_k.length || -1 == (this.field_f.field_k[param0] ^ -1)) {
            if (!cd.field_i) {
                return false;
            }
            throw new IllegalArgumentException(Integer.toString(param0));
        }
        return true;
    }

    final static void a(int param0, int param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        if (null != pd.field_f) {
            var3 = pd.field_f.c(497, param2);
            if (-2 != var3) {
                if (!((var3 ^ -1) == 0)) {
                    var4 = pd.field_f.e(5658) ? 1 : 0;
                    sn.a(pd.field_f.field_Tb, param0, pd.field_f.g((byte) -96), 97, var4 != 0, var3);
                }
                pd.field_f = null;
                tf.i((byte) -76);
            }
        }
        if (param1 != 0) {
            field_c = (String) null;
        }
    }

    final int a(int param0, int param1, String param2) {
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
            if (!this.a(param0, (byte) -83)) {
              stackIn_3_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 == 13030) {
                  break L1;
                } else {
                  this.field_d = new Object[6];
                  break L1;
                }
              }
              param2 = param2.toLowerCase();
              var5 = (CharSequence) ((Object) param2);
              var4_int = this.field_f.field_o[param0].a((byte) -68, ta.a(var5, -127));
              if (this.a(param0, var4_int, (byte) -33)) {
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

            stackIn_13_1 = new StringBuilder().append("ji.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
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

    final static void c(int param0, int param1) {
        uf var2 = we.field_b;
        var2.f(param0, param1 ^ -3);
        var2.a(true, param1);
        var2.a(true, 3);
    }

    final synchronized int a(byte param0, int param1) {
        if (!(this.a(param1, (byte) -83))) {
            return 0;
        }
        if (param0 != 34) {
            field_h = (String) null;
        }
        if (!(this.field_d[param1] == null)) {
            return 100;
        }
        return this.field_a.a(param1, param0 ^ -102);
    }

    final int a(int param0, String param1) {
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
            if (this.a((byte) 121)) {
              param1 = param1.toLowerCase();
              var5 = (CharSequence) ((Object) param1);
              var3_int = this.field_f.field_e.a((byte) -68, ta.a(var5, -128));
              var4 = 39 / ((param0 - -55) / 53);
              stackIn_4_0 = this.a((byte) 34, var3_int);
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

            stackIn_7_1 = new StringBuilder().append("ji.G(").append(param0).append(',');

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
          throw dh.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final synchronized byte[] a(int param0, int[] param1, int param2, byte param3) {
        Object stackIn_2_0 = null;
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
            if (this.a(param2, param0, param3)) {
              L1: {
                L2: {
                  var5 = null;
                  if (this.field_e[param2] == null) {
                    break L2;
                  } else {
                    if (this.field_e[param2][param0] == null) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                if (!this.a(param1, param2, param0, 26687)) {
                  this.a(20351, param2);
                  if (this.a(param1, param2, param0, param3 + 26720)) {
                    break L1;
                  } else {
                    return null;
                  }
                } else {
                  break L1;
                }
              }
              if (null != this.field_e[param2]) {
                L3: {
                  if (this.field_e[param2][param0] == null) {
                    break L3;
                  } else {
                    var7 = cf.a(false, 95, this.field_e[param2][param0]);
                    var5 = var7;
                    if (var7 == null) {
                      throw new RuntimeException("");
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (var5 != null) {
                    if (-2 == (this.field_g ^ -1)) {
                      this.field_e[param2][param0] = null;
                      if ((this.field_f.field_k[param2] ^ -1) == -2) {
                        this.field_e[param2] = null;
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      if ((this.field_g ^ -1) == -3) {
                        this.field_e[param2] = null;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                stackIn_27_0 = var5;
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
            stackIn_30_0 = var5;

            stackIn_30_1 = new StringBuilder().append("ji.AA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_31_0 = stackIn_30_0;
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L5;
            } else {
              stackIn_31_0 = stackIn_30_0;
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_2_0);
        } else {
          return (byte[]) ((Object) stackIn_27_0);
        }
    }

    final synchronized boolean a(boolean param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = client.field_A ? 1 : 0;
        if (this.a((byte) 121)) {
          if (!param0) {
            var2 = 1;
            var3 = 0;
            L0: while (true) {
              if (var3 >= this.field_f.field_f.length) {
                return var2 != 0;
              } else {
                var4 = this.field_f.field_f[var3];
                if (this.field_d[var4] == null) {
                  this.a(20351, var4);
                  if (null == this.field_d[var4]) {
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
            return true;
          }
        } else {
          return false;
        }
    }

    final synchronized boolean a(byte param0, int param1, int param2) {
        if (!this.a(param2, param1, (byte) -33)) {
            return false;
        }
        if (null != this.field_e[param2]) {
            if (!(this.field_e[param2][param1] == null)) {
                return true;
            }
        }
        if (null != this.field_d[param2]) {
            return true;
        }
        this.a(20351, param2);
        if (null != this.field_d[param2]) {
            return true;
        }
        if (param0 >= -59) {
            this.a(false);
            return false;
        }
        return false;
    }

    ji(of param0, boolean param1, int param2) {
        this.field_f = null;
        try {
            if (-1 < (param2 ^ -1) || 2 < param2) {
                throw new IllegalArgumentException("");
            }
            this.field_b = param1 ? true : false;
            this.field_a = param0;
            this.field_g = param2;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "ji.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_c = "Offer rematch";
        field_h = "FINAL!";
    }
}
