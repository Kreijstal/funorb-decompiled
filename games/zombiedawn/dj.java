/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj {
    private Object[] field_j;
    static vo field_l;
    private int field_d;
    private w field_h;
    static String field_a;
    private boolean field_f;
    static vo field_m;
    static int[] field_g;
    private Object[][] field_c;
    static hi field_e;
    private jh field_b;
    static vn[] field_k;
    static int[] field_i;

    private final synchronized boolean a(int[] param0, int param1, int param2, byte param3) {
        Object[] array$0 = null;
        byte[] array$1 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        int stackIn_65_0 = 0;
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
        String var23 = null;
        byte[] var24 = null;
        int[] var25 = null;
        byte[] var26 = null;
        de var27 = null;
        byte[] var28 = null;
        de var30 = null;
        de var32 = null;
        int[] var33 = null;
        byte[][] var34 = null;
        int[] var35 = null;
        byte[] var36 = null;
        byte[] var37 = null;
        int[] var40 = null;
        byte[][] var41 = null;
        byte[] var44 = null;
        byte[] var45 = null;
        var22 = ZombieDawn.field_J;
        try {
          L0: {
            if (this.b(param2, (byte) -82)) {
              if (this.field_j[param2] == null) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  var5_int = this.field_b.field_t[param2];
                  var35 = this.field_b.field_p[param2];
                  var25 = var35;
                  var6 = var25;
                  if (this.field_c[param2] == null) {
                    array$0 = new Object[this.field_b.field_d[param2]];
                    this.field_c[param2] = array$0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var7 = this.field_c[param2];
                var8 = 1;
                var9_int = 0;
                L2: while (true) {
                  L3: {
                    if (var5_int <= var9_int) {
                      break L3;
                    } else {
                      L4: {
                        if (var6 == null) {
                          var10 = var9_int;
                          break L4;
                        } else {
                          var10 = var35[var9_int];
                          break L4;
                        }
                      }
                      if (var7[var10] == null) {
                        var8 = 0;
                        break L3;
                      } else {
                        var9_int++;
                        continue L2;
                      }
                    }
                  }
                  if (var8 != 0) {
                    stackIn_23_0 = 1;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    L5: {
                      L6: {
                        if (param0 == null) {
                          break L6;
                        } else {
                          L7: {
                            if (-1 != (param0[0] ^ -1)) {
                              break L7;
                            } else {
                              if (param0[1] != 0) {
                                break L7;
                              } else {
                                if (0 != param0[2]) {
                                  break L7;
                                } else {
                                  if (param0[3] == 0) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                          var36 = ag.a(this.field_j[param2], (byte) 125, true);
                          var26 = var36;
                          var9 = var26;
                          var27 = new de(var36);
                          var27.a(153818020, var27.field_h.length, param0, 5);
                          break L5;
                        }
                      }
                      var9 = ag.a(this.field_j[param2], (byte) 88, false);
                      break L5;
                    }
                    L8: {
                      if (param3 <= -28) {
                        break L8;
                      } else {
                        var23 = (String) null;
                        this.a((String) (this.field_j[2]), -6, (String) null);
                        break L8;
                      }
                    }
                    try {
                      L9: {
                        var37 = va.a((byte) -112, var9);
                        var28 = var37;
                        var24 = var28;
                        var44 = var24;
                        break L9;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L10: {
                        var11_ref_RuntimeException = decompiledCaughtException;
                        stackIn_38_0 = (RuntimeException) (var11_ref_RuntimeException);

                        stackIn_38_1 = new StringBuilder();

                        if (param0 == null) {
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
                      throw sh.a((Throwable) ((Object) stackIn_39_0), (stackIn_39_2 != 0) + " " + param2 + " " + var9.length + " " + ii.a(8099, var9.length, var9) + " " + ii.a(8099, var9.length - 2, var9) + " " + this.field_b.field_j[param2] + " " + this.field_b.field_m);
                    }
                    L11: {
                      if (!this.field_f) {
                        break L11;
                      } else {
                        this.field_j[param2] = null;
                        break L11;
                      }
                    }
                    L12: {
                      if (1 < var5_int) {
                        if (-3 != (this.field_d ^ -1)) {
                          var11 = var37.length;
                          var11--;
                          var12 = 255 & var24[var11];
                          var11 = var11 - 4 * (var12 * var5_int);
                          var32 = new de(var44);
                          var40 = new int[var5_int];
                          var33 = var40;
                          var14 = var33;
                          var32.field_j = var11;
                          var15_int = 0;
                          L13: while (true) {
                            if (var15_int >= var12) {
                              var41 = new byte[var5_int][];
                              var34 = var41;
                              var15 = var34;
                              var16 = 0;
                              L14: while (true) {
                                if (var16 >= var5_int) {
                                  var32.field_j = var11;
                                  var16 = 0;
                                  var17 = 0;
                                  L15: while (true) {
                                    if (var12 <= var17) {
                                      var17 = 0;
                                      L16: while (true) {
                                        if (var5_int <= var17) {
                                          break L12;
                                        } else {
                                          L17: {
                                            if (var6 == null) {
                                              var18 = var17;
                                              break L17;
                                            } else {
                                              var18 = var35[var17];
                                              break L17;
                                            }
                                          }
                                          L18: {
                                            if (this.field_d != 0) {
                                              var7[var18] = var41[var17];
                                              break L18;
                                            } else {
                                              var7[var18] = el.a((byte) 94, false, var41[var17]);
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
                                        if (var5_int <= var19) {
                                          var17++;
                                          continue L15;
                                        } else {
                                          var18 = var18 + var32.c(-48);
                                          gp.a(var44, var16, var41[var19], var40[var19], var18);
                                          var14[var19] = var14[var19] + var18;
                                          var16 = var16 + var18;
                                          var19++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  array$1 = new byte[var40[var16]];
                                  var15[var16] = array$1;
                                  var40[var16] = 0;
                                  var16++;
                                  continue L14;
                                }
                              }
                            } else {
                              var16 = 0;
                              var17 = 0;
                              L20: while (true) {
                                if (var17 >= var5_int) {
                                  var15_int++;
                                  continue L13;
                                } else {
                                  var16 = var16 + var32.c(124);
                                  var14[var17] = var14[var17] + var16;
                                  var17++;
                                  continue L20;
                                }
                              }
                            }
                          }
                        } else {
                          var11 = var37.length;
                          var11--;
                          var12 = 255 & var24[var11];
                          var11 = var11 - var12 * (var5_int * 4);
                          var30 = new de(var44);
                          var14_int = 0;
                          var30.field_j = var11;
                          var15_int = 0;
                          var16 = 0;
                          L21: while (true) {
                            if (var12 <= var16) {
                              if (var14_int == 0) {
                                stackIn_65_0 = 1;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                var45 = new byte[var14_int];
                                var14_int = 0;
                                var30.field_j = var11;
                                var17 = 0;
                                var18 = 0;
                                L22: while (true) {
                                  if (var12 <= var18) {
                                    var7[var15_int] = var45;
                                    break L12;
                                  } else {
                                    var19 = 0;
                                    var20 = 0;
                                    L23: while (true) {
                                      if (var20 >= var5_int) {
                                        var18++;
                                        continue L22;
                                      } else {
                                        L24: {
                                          var19 = var19 + var30.c(-44);
                                          if (var6 == null) {
                                            var21 = var20;
                                            break L24;
                                          } else {
                                            var21 = var35[var20];
                                            break L24;
                                          }
                                        }
                                        L25: {
                                          if (var21 == param1) {
                                            gp.a(var44, var17, var45, var14_int, var19);
                                            var14_int = var14_int + var19;
                                            break L25;
                                          } else {
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
                                    var17 = var17 + var30.c(100);
                                    if (var6 != null) {
                                      var19 = var35[var18];
                                      break L27;
                                    } else {
                                      var19 = var18;
                                      break L27;
                                    }
                                  }
                                  L28: {
                                    if (var19 == param1) {
                                      var14_int = var14_int + var17;
                                      var15_int = var19;
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
                      } else {
                        L29: {
                          if (var6 == null) {
                            var11 = 0;
                            break L29;
                          } else {
                            var11 = var35[0];
                            break L29;
                          }
                        }
                        if (this.field_d == 0) {
                          var7[var11] = el.a((byte) 94, false, var44);
                          break L12;
                        } else {
                          var7[var11] = var37;
                          return true;
                        }
                      }
                    }
                    stackIn_104_0 = 1;
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
          L30: {
            var5 = decompiledCaughtException;
            stackIn_107_0 = (RuntimeException) (var5);

            stackIn_107_1 = new StringBuilder().append("dj.A(");

            if (param0 == null) {
              stackIn_108_0 = (RuntimeException) ((Object) stackIn_107_0);
              stackIn_108_1 = (StringBuilder) ((Object) stackIn_107_1);
              stackIn_108_2 = "null";
              break L30;
            } else {
              stackIn_108_0 = (RuntimeException) ((Object) stackIn_107_0);
              stackIn_108_1 = (StringBuilder) ((Object) stackIn_107_1);
              stackIn_108_2 = "{...}";
              break L30;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_108_0), stackIn_108_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_23_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_65_0 != 0;
              } else {
                return stackIn_104_0 != 0;
              }
            }
          }
        }
    }

    final boolean a(String param0, byte param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_9_0 = false;
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
            if (this.a((byte) 73)) {
              L1: {
                param0 = param0.toLowerCase();
                if (param1 < -9) {
                  break L1;
                } else {
                  this.a(76, (byte) -89, 2);
                  break L1;
                }
              }
              param2 = param2.toLowerCase();
              var6 = (CharSequence) ((Object) param0);
              var4_int = this.field_b.field_g.a(1, tc.a(var6, 14));
              if (this.b(var4_int, (byte) -82)) {
                var7 = (CharSequence) ((Object) param2);
                var5 = this.field_b.field_a[var4_int].a(1, tc.a(var7, 14));
                stackIn_9_0 = this.a(var5, (byte) -128, var4_int);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_7_0 = 0;
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
          L2: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("dj.B(");

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
          throw sh.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            return stackIn_9_0;
          }
        }
    }

    final int d(int param0) {
        if (!this.a((byte) 73)) {
            return -1;
        }
        if (param0 != -1) {
            field_l = (vo) null;
        }
        return this.field_b.field_d.length;
    }

    private final synchronized byte[] a(int[] param0, int param1, int param2, int param3) {
        Object stackIn_4_0 = null;
        Object stackIn_11_0 = null;
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
              if (param3 >= 124) {
                break L1;
              } else {
                this.field_b = (jh) (((Object[]) (this.field_j[16]))[1]);
                break L1;
              }
            }
            if (this.a(param1, param2, 105)) {
              L2: {
                L3: {
                  var5 = null;
                  if (this.field_c[param2] == null) {
                    break L3;
                  } else {
                    if (this.field_c[param2][param1] != null) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (this.a(param0, param1, param2, (byte) -57)) {
                  break L2;
                } else {
                  this.c(4, param2);
                  if (this.a(param0, param1, param2, (byte) -85)) {
                    break L2;
                  } else {
                    stackIn_11_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              if (this.field_c[param2] == null) {
                throw new RuntimeException("");
              } else {
                L4: {
                  if (null == this.field_c[param2][param1]) {
                    break L4;
                  } else {
                    var7 = ag.a(this.field_c[param2][param1], (byte) 98, false);
                    var5 = var7;
                    if (var7 == null) {
                      throw new RuntimeException("");
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (var5 != null) {
                    if (1 != this.field_d) {
                      if (this.field_d != 2) {
                        break L5;
                      } else {
                        this.field_c[param2] = null;
                        break L5;
                      }
                    } else {
                      this.field_c[param2][param1] = null;
                      if (-2 != (this.field_b.field_d[param2] ^ -1)) {
                        break L5;
                      } else {
                        this.field_c[param2] = null;
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

            stackIn_30_1 = new StringBuilder().append("dj.D(");

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
          throw sh.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (byte[]) ((Object) stackIn_11_0);
          } else {
            return (byte[]) ((Object) stackIn_27_0);
          }
        }
    }

    final synchronized boolean a(byte param0) {
        if (param0 != 73) {
            this.field_b = (jh) (this.field_j[19]);
        }
        if (this.field_b != null) {
            return true;
        }
        this.field_b = this.field_h.b((byte) 106);
        if (null == this.field_b) {
            return false;
        }
        this.field_j = new Object[this.field_b.field_s];
        this.field_c = new Object[this.field_b.field_s][];
        return true;
    }

    final static void a(int param0) {
        String var2 = (String) null;
        jm.a((String) null, "", -901373652);
        int var1 = -106 % ((67 - param0) / 40);
    }

    final synchronized int e(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = ZombieDawn.field_J;
        if (this.a((byte) 73)) {
          L0: {
            var2 = 0;
            if (param0 < -79) {
              break L0;
            } else {
              this.a((byte) -52, 65);
              break L0;
            }
          }
          var3 = 0;
          var4 = 0;
          L1: while (true) {
            if (this.field_j.length <= var4) {
              if (-1 != (var2 ^ -1)) {
                var4 = var3 * 100 / var2;
                return var4;
              } else {
                return 100;
              }
            } else {
              if (0 < this.field_b.field_t[var4]) {
                var3 = var3 + this.a(var4, -5366);
                var2 += 100;
                var4++;
                continue L1;
              } else {
                var4++;
                continue L1;
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
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
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
            if (!this.b(param0, (byte) -82)) {
              stackIn_3_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param1 = param1.toLowerCase();
              if (param2) {
                var5 = (CharSequence) ((Object) param1);
                var4_int = this.field_b.field_a[param0].a(1, tc.a(var5, 14));
                if (!this.a(var4_int, param0, 126)) {
                  stackIn_10_0 = -1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return var4_int;
                }
              } else {
                stackIn_6_0 = 8;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("dj.Q(").append(param0).append(',');

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
          throw sh.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    final int b(String param0, int param1) {
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
            if (!this.a((byte) 73)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 > 83) {
                  break L1;
                } else {
                  this.field_d = -4;
                  break L1;
                }
              }
              param0 = param0.toLowerCase();
              var4 = (CharSequence) ((Object) param0);
              var3_int = this.field_b.field_g.a(1, tc.a(var4, 14));
              stackIn_7_0 = this.a(var3_int, -5366);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("dj.V(");

            if (param0 == null) {
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
          throw sh.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_7_0;
        }
    }

    final synchronized boolean a(int param0, byte param1, int param2) {
        if (!this.a(param0, param2, 113)) {
            return false;
        }
        int var4 = -105 / ((-38 - param1) / 58);
        if (this.field_c[param2] != null && null != this.field_c[param2][param0]) {
            return true;
        }
        if (!(null == this.field_j[param2])) {
            return true;
        }
        this.c(4, param2);
        if (this.field_j[param2] == null) {
            return false;
        }
        return true;
    }

    final synchronized byte[] a(String param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_2_0 = null;
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
            if (this.a((byte) 73)) {
              L1: {
                if (param1 < -82) {
                  break L1;
                } else {
                  this.a((String) null, (byte) 28, (String) (this.field_j[1]));
                  break L1;
                }
              }
              param2 = param2.toLowerCase();
              param0 = param0.toLowerCase();
              var6 = (CharSequence) ((Object) param2);
              var4_int = this.field_b.field_g.a(1, tc.a(var6, 14));
              if (this.b(var4_int, (byte) -82)) {
                var7 = (CharSequence) ((Object) param0);
                var5 = this.field_b.field_a[var4_int].a(1, tc.a(var7, 14));
                stackIn_9_0 = this.a((byte) 51, var4_int, var5);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_7_0 = null;
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
          L2: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("dj.AA(");

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
          throw sh.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (byte[]) ((Object) stackIn_7_0);
          } else {
            return stackIn_9_0;
          }
        }
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
            if (!this.a((byte) 73)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                param1 = param1.toLowerCase();
                if (param0 == -1) {
                  break L1;
                } else {
                  this.a(((int[]) (this.field_j[7]))[0], -46);
                  break L1;
                }
              }
              var4 = (CharSequence) ((Object) param1);
              var3_int = this.field_b.field_g.a(1, tc.a(var4, param0 + 15));
              stackIn_7_0 = this.b(-29092, var3_int);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("dj.U(").append(param0).append(',');

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
          throw sh.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_7_0;
        }
    }

    private final synchronized void c(int param0, int param1) {
        if (param0 != 4) {
            return;
        }
        if (this.field_f) {
            this.field_j[param1] = this.field_h.a(param1, (byte) 112);
        } else {
            this.field_j[param1] = el.a((byte) 94, false, this.field_h.a(param1, (byte) 112));
        }
    }

    private final synchronized boolean b(int param0, byte param1) {
        if (param1 != -82) {
            this.c(((int[]) (this.field_j[4]))[0], 99);
        }
        if (!this.a((byte) 73)) {
            return false;
        }
        if ((param0 ^ -1) > -1 || param0 >= this.field_b.field_d.length || -1 == (this.field_b.field_d[param0] ^ -1)) {
            if (sg.field_ib) {
                throw new IllegalArgumentException(Integer.toString(param0));
            }
            return false;
        }
        return true;
    }

    final byte[] a(byte param0, int param1, int param2) {
        if (param0 != 51) {
            this.field_d = -23;
        }
        return this.a((int[]) null, param2, param1, param0 ^ 77);
    }

    public static void b(int param0) {
        field_k = null;
        field_i = null;
        field_a = null;
        field_m = null;
        field_l = null;
        if (param0 <= 67) {
            field_e = (hi) null;
        }
        field_e = null;
        field_g = null;
    }

    final int a(byte param0, int param1) {
        if (param0 < 53) {
            return 18;
        }
        if (!(this.b(param1, (byte) -82))) {
            return 0;
        }
        return this.field_b.field_d[param1];
    }

    final synchronized int a(int param0, int param1) {
        if (!this.b(param0, (byte) -82)) {
            return 0;
        }
        if (!(this.field_j[param0] == null)) {
            return 100;
        }
        if (param1 != -5366) {
            this.a((String) null, -127, (String) (this.field_j[4]));
        }
        return this.field_h.a(-90, param0);
    }

    final boolean a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
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
            if (!this.a((byte) 73)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) ((Object) param0);
              var3_int = this.field_b.field_g.a(1, tc.a(var4, 14));
              if (param1 <= var3_int) {
                stackIn_8_0 = 1;
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
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("dj.O(");

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
          throw sh.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            return stackIn_8_0 != 0;
          }
        }
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        int var4;
        if (!this.a((byte) 73)) {
          return false;
        } else {
          L0: {
            if (0 > param1) {
              break L0;
            } else {
              if (param0 < 0) {
                break L0;
              } else {
                if (param1 >= this.field_b.field_d.length) {
                  break L0;
                } else {
                  if (param0 >= this.field_b.field_d[param1]) {
                    break L0;
                  } else {
                    var4 = -60 % ((63 - param2) / 41);
                    return true;
                  }
                }
              }
            }
          }
          if (!sg.field_ib) {
            return false;
          } else {
            throw new IllegalArgumentException(param1 + " " + param0);
          }
        }
    }

    final synchronized byte[] a(int param0, byte param1) {
        if (!this.a((byte) 73)) {
            return null;
        }
        if (1 == this.field_b.field_d.length) {
            return this.a((byte) 51, 0, param0);
        }
        int var3 = 84 % ((-21 - param1) / 37);
        if (!this.b(param0, (byte) -82)) {
            return null;
        }
        if (!(-2 != (this.field_b.field_d[param0] ^ -1))) {
            return this.a((byte) 51, param0, 0);
        }
        throw new RuntimeException();
    }

    final int a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
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
            if (!this.a((byte) 73)) {
              stackIn_3_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                param0 = param0.toLowerCase();
                if (param1 == 8) {
                  break L1;
                } else {
                  field_a = (String) null;
                  break L1;
                }
              }
              var4 = (CharSequence) ((Object) param0);
              var3_int = this.field_b.field_g.a(param1 ^ 9, tc.a(var4, 14));
              if (this.b(var3_int, (byte) -82)) {
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

            stackIn_13_1 = new StringBuilder().append("dj.L(");

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
          throw sh.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
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

    final synchronized boolean b(int param0, int param1) {
        if (!(this.b(param1, (byte) -82))) {
            return false;
        }
        if (param0 != -29092) {
            return false;
        }
        if (null != this.field_j[param1]) {
            return true;
        }
        this.c(4, param1);
        if (this.field_j[param1] == null) {
            return false;
        }
        return true;
    }

    final synchronized boolean c(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = ZombieDawn.field_J;
        if (this.a((byte) 73)) {
          var2 = 1;
          var3 = 0;
          L0: while (true) {
            if (this.field_b.field_n.length <= var3) {
              L1: {
                if (param0 == 9001) {
                  break L1;
                } else {
                  this.a(70, ((byte[]) (this.field_j[19]))[2], 26);
                  break L1;
                }
              }
              return var2 != 0;
            } else {
              var4 = this.field_b.field_n[var3];
              if (this.field_j[var4] == null) {
                this.c(param0 + -8997, var4);
                if (null == this.field_j[var4]) {
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

    dj(w param0, boolean param1, int param2) {
        this.field_b = null;
        try {
            if ((param2 ^ -1) > -1 || (param2 ^ -1) < -3) {
                throw new IllegalArgumentException("");
            }
            this.field_f = param1 ? true : false;
            this.field_d = param2;
            this.field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "dj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_a = "Passwords can only contain letters and numbers";
        field_l = new vo();
        field_i = ae.a(14821);
    }
}
