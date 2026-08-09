/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mi {
    static int field_g;
    static int field_f;
    int field_k;
    private tk field_i;
    private Object[][] field_h;
    private boolean field_e;
    private we field_j;
    static nf field_a;
    private Object[] field_d;
    static int[] field_c;
    static bi[] field_b;

    private final synchronized boolean b(int param0, byte param1) {
        if (param1 != 23) {
            this.field_j = (we) null;
        }
        if (!(this.b(0))) {
            return false;
        }
        if (-1 < (param0 ^ -1) || param0 >= this.field_j.field_q.length || -1 == (this.field_j.field_q[param0] ^ -1)) {
            if (!oe.field_P) {
                return false;
            }
            throw new IllegalArgumentException(Integer.toString(param0));
        }
        return true;
    }

    final synchronized boolean a(int param0, int param1) {
        if (!(this.b(param0, (byte) 23))) {
            return false;
        }
        if (param1 != 0) {
            return ((boolean[]) (this.field_d[0]))[21];
        }
        if (this.field_d[param0] != null) {
            return true;
        }
        this.c(param0, param1 ^ 124);
        if (null != this.field_d[param0]) {
            return true;
        }
        return false;
    }

    private final synchronized boolean a(int param0, int[] param1, byte param2, int param3) {
        Object[] array$0 = null;
        byte[] array$1 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_84_0 = 0;
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
        int var6 = 0;
        int[] var7 = null;
        Object[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        byte[] var10 = null;
        int var11 = 0;
        RuntimeException var12_ref_RuntimeException = null;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        int[] var15_ref_int__ = null;
        int var16 = 0;
        byte[][] var16_ref_byte____ = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        byte[] var24 = null;
        int[] var25 = null;
        byte[] var26 = null;
        kg var27 = null;
        byte[] var28 = null;
        kg var30 = null;
        int[] var31 = null;
        byte[][] var32 = null;
        kg var33 = null;
        int[] var35 = null;
        byte[] var36 = null;
        byte[] var37 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        byte[] var44 = null;
        byte[] var45 = null;
        var23 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (!this.b(param0, (byte) 23)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (this.field_d[param0] == null) {
                stackIn_8_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  var5_int = this.field_j.field_t[param0];
                  var6 = 74 % ((param2 - 41) / 46);
                  var35 = this.field_j.field_r[param0];
                  var25 = var35;
                  var7 = var25;
                  if (this.field_h[param0] != null) {
                    break L1;
                  } else {
                    array$0 = new Object[this.field_j.field_q[param0]];
                    this.field_h[param0] = array$0;
                    break L1;
                  }
                }
                var8 = this.field_h[param0];
                var9 = 1;
                var10_int = 0;
                L2: while (true) {
                  L3: {
                    if (var5_int <= var10_int) {
                      break L3;
                    } else {
                      L4: {
                        if (null == var7) {
                          var11 = var10_int;
                          break L4;
                        } else {
                          var11 = var35[var10_int];
                          break L4;
                        }
                      }
                      if (null != var8[var11]) {
                        var10_int++;
                        continue L2;
                      } else {
                        var9 = 0;
                        break L3;
                      }
                    }
                  }
                  if (var9 != 0) {
                    stackIn_22_0 = 1;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    L5: {
                      L6: {
                        if (null == param1) {
                          break L6;
                        } else {
                          L7: {
                            if (param1[0] != 0) {
                              break L7;
                            } else {
                              if (param1[1] != 0) {
                                break L7;
                              } else {
                                if (0 != param1[2]) {
                                  break L7;
                                } else {
                                  if (param1[3] == 0) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                          var36 = vb.a(true, 6, this.field_d[param0]);
                          var26 = var36;
                          var10 = var26;
                          var27 = new kg(var36);
                          var27.a(5, param1, var27.field_m.length, (byte) 72);
                          break L5;
                        }
                      }
                      var10 = vb.a(false, 6, this.field_d[param0]);
                      break L5;
                    }
                    try {
                      L8: {
                        var37 = tm.a(119, var10);
                        var28 = var37;
                        var24 = var28;
                        var44 = var24;
                        break L8;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L9: {
                        var12_ref_RuntimeException = decompiledCaughtException;
                        stackIn_35_0 = (RuntimeException) (var12_ref_RuntimeException);

                        stackIn_35_1 = new StringBuilder();

                        if (param1 == null) {
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
                      throw sd.a((Throwable) ((Object) stackIn_36_0), (stackIn_36_2 != 0) + " " + param0 + " " + param1.length + " " + in.a(param1.length, var10, -97) + " " + in.a(-2 + param1.length, var10, -116) + " " + this.field_j.field_l[param0] + " " + this.field_j.field_s);
                    }
                    L10: {
                      if (!this.field_e) {
                        break L10;
                      } else {
                        this.field_d[param0] = null;
                        break L10;
                      }
                    }
                    L11: {
                      if (-2 > (var5_int ^ -1)) {
                        if ((this.field_k ^ -1) == -3) {
                          var12 = var37.length;
                          var12--;
                          var13 = var24[var12] & 255;
                          var12 = var12 - var5_int * (var13 * 4);
                          var33 = new kg(var44);
                          var15 = 0;
                          var16 = 0;
                          var33.field_n = var12;
                          var17 = 0;
                          L12: while (true) {
                            if (var17 >= var13) {
                              if (-1 != (var15 ^ -1)) {
                                var45 = new byte[var15];
                                var33.field_n = var12;
                                var15 = 0;
                                var18 = 0;
                                var19 = 0;
                                L13: while (true) {
                                  if (var19 >= var13) {
                                    var8[var16] = var45;
                                    break L11;
                                  } else {
                                    var20 = 0;
                                    var21 = 0;
                                    L14: while (true) {
                                      if (var21 >= var5_int) {
                                        var19++;
                                        continue L13;
                                      } else {
                                        L15: {
                                          var20 = var20 + var33.f((byte) 51);
                                          if (var7 == null) {
                                            var22 = var21;
                                            break L15;
                                          } else {
                                            var22 = var35[var21];
                                            break L15;
                                          }
                                        }
                                        L16: {
                                          if (param3 == var22) {
                                            lj.a(var44, var18, var45, var15, var20);
                                            var15 = var15 + var20;
                                            break L16;
                                          } else {
                                            break L16;
                                          }
                                        }
                                        var18 = var18 + var20;
                                        var21++;
                                        continue L14;
                                      }
                                    }
                                  }
                                }
                              } else {
                                stackIn_84_0 = 1;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              }
                            } else {
                              var18 = 0;
                              var19 = 0;
                              L17: while (true) {
                                if (var19 >= var5_int) {
                                  var17++;
                                  continue L12;
                                } else {
                                  L18: {
                                    var18 = var18 + var33.f((byte) 92);
                                    if (var7 == null) {
                                      var20 = var19;
                                      break L18;
                                    } else {
                                      var20 = var35[var19];
                                      break L18;
                                    }
                                  }
                                  if (param3 == var20) {
                                    var15 = var15 + var18;
                                    var16 = var20;
                                    var19++;
                                    continue L17;
                                  } else {
                                    var19++;
                                    continue L17;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var12 = var37.length;
                          var12--;
                          var13 = 255 & var24[var12];
                          var12 = var12 - var5_int * (var13 * 4);
                          var30 = new kg(var44);
                          var39 = new int[var5_int];
                          var31 = var39;
                          var15_ref_int__ = var31;
                          var30.field_n = var12;
                          var16 = 0;
                          L19: while (true) {
                            if (var13 <= var16) {
                              var40 = new byte[var5_int][];
                              var32 = var40;
                              var16_ref_byte____ = var32;
                              var17 = 0;
                              L20: while (true) {
                                if (var5_int <= var17) {
                                  var30.field_n = var12;
                                  var17 = 0;
                                  var18 = 0;
                                  L21: while (true) {
                                    if (var13 <= var18) {
                                      var18 = 0;
                                      L22: while (true) {
                                        if (var5_int <= var18) {
                                          break L11;
                                        } else {
                                          L23: {
                                            if (var7 != null) {
                                              var19 = var35[var18];
                                              break L23;
                                            } else {
                                              var19 = var18;
                                              break L23;
                                            }
                                          }
                                          L24: {
                                            if (this.field_k != 0) {
                                              var8[var19] = var40[var18];
                                              break L24;
                                            } else {
                                              var8[var19] = ug.a(127, false, var40[var18]);
                                              break L24;
                                            }
                                          }
                                          var18++;
                                          continue L22;
                                        }
                                      }
                                    } else {
                                      var19 = 0;
                                      var20 = 0;
                                      L25: while (true) {
                                        if (var5_int <= var20) {
                                          var18++;
                                          continue L21;
                                        } else {
                                          var19 = var19 + var30.f((byte) 59);
                                          lj.a(var44, var17, var40[var20], var39[var20], var19);
                                          var15_ref_int__[var20] = var15_ref_int__[var20] + var19;
                                          var17 = var17 + var19;
                                          var20++;
                                          continue L25;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  array$1 = new byte[var39[var17]];
                                  var16_ref_byte____[var17] = array$1;
                                  var39[var17] = 0;
                                  var17++;
                                  continue L20;
                                }
                              }
                            } else {
                              var17 = 0;
                              var18 = 0;
                              L26: while (true) {
                                if (var18 >= var5_int) {
                                  var16++;
                                  continue L19;
                                } else {
                                  var17 = var17 + var30.f((byte) 81);
                                  var15_ref_int__[var18] = var15_ref_int__[var18] + var17;
                                  var18++;
                                  continue L26;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        L27: {
                          if (var7 == null) {
                            var12 = 0;
                            break L27;
                          } else {
                            var12 = var35[0];
                            break L27;
                          }
                        }
                        if (-1 == (this.field_k ^ -1)) {
                          var8[var12] = ug.a(125, false, var44);
                          break L11;
                        } else {
                          var8[var12] = var37;
                          return true;
                        }
                      }
                    }
                    stackIn_99_0 = 1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L28: {
            var5 = decompiledCaughtException;
            stackIn_102_0 = (RuntimeException) (var5);

            stackIn_102_1 = new StringBuilder().append("mi.W(").append(param0).append(',');

            if (param1 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_103_0), stackIn_103_2 + ',' + param2 + ',' + param3 + ')');
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
                return stackIn_84_0 != 0;
              } else {
                return stackIn_99_0 != 0;
              }
            }
          }
        }
    }

    final int a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
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
            if (!this.b(0)) {
              stackIn_3_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param1 = param1.toLowerCase();
              var4 = (CharSequence) ((Object) param1);
              var3_int = this.field_j.field_h.a((byte) 76, mg.a(var4, (byte) -95));
              if (this.b(var3_int, (byte) 23)) {
                if (param0 < -25) {
                  stackIn_11_0 = var3_int;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_9_0 = ((int[]) (((Object[]) (((Object[]) (this.field_d[2]))[4]))[0]))[0];
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
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("mi.G(").append(param0).append(',');

            if (param1 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
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

    final synchronized int[] a(byte param0, int param1) {
        int[] var6 = null;
        int var4 = 0;
        int var5 = Confined.field_J ? 1 : 0;
        if (param0 >= -39) {
            return (int[]) null;
        }
        if (!this.b(param1, (byte) 23)) {
            return null;
        }
        int[] var3 = this.field_j.field_r[param1];
        if (var3 == null) {
            var6 = new int[this.field_j.field_t[param1]];
            var3 = var6;
            for (var4 = 0; var6.length > var4; var4++) {
                var6[var4] = var4;
            }
        }
        return var3;
    }

    final synchronized boolean a(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        String var6;
        var5 = Confined.field_J ? 1 : 0;
        if (this.b(0)) {
          L0: {
            var2 = 1;
            if (param0 == 25057) {
              break L0;
            } else {
              var6 = (String) null;
              this.a(((int[]) (this.field_d[9]))[36], (String) null, -11);
              break L0;
            }
          }
          var3 = 0;
          L1: while (true) {
            if (this.field_j.field_u.length <= var3) {
              return var2 != 0;
            } else {
              var4 = this.field_j.field_u[var3];
              if (this.field_d[var4] == null) {
                this.c(var4, param0 + -24987);
                if (this.field_d[var4] == null) {
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

    final boolean b(String param0, int param1) {
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
            if (this.b(0)) {
              L1: {
                if (param1 == -4308) {
                  break L1;
                } else {
                  this.a(((int[]) (this.field_d[7]))[0], (String) null, ((int[]) (this.field_d[0]))[8]);
                  break L1;
                }
              }
              param0 = param0.toLowerCase();
              var4 = (CharSequence) ((Object) param0);
              var3_int = this.field_j.field_h.a((byte) 76, mg.a(var4, (byte) -100));
              if (-1 >= (var3_int ^ -1)) {
                stackIn_9_0 = 1;
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
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("mi.O(");

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
          throw sd.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            return stackIn_9_0 != 0;
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0 > -61) {
            field_b = (bi[]) null;
        }
    }

    final byte[] a(byte param0, int param1, int param2) {
        if (param0 != -2) {
            field_a = (nf) null;
        }
        return this.a(param0 ^ -60, param2, param1, (int[]) null);
    }

    private final synchronized boolean b(int param0, int param1, int param2) {
        if (!this.b(param2 + 0)) {
            return false;
        }
        if (param1 >= param2 && param0 >= 0 && this.field_j.field_q.length > param1 && this.field_j.field_q[param1] > param0) {
            return true;
        }
        if (oe.field_P) {
            throw new IllegalArgumentException(param1 + " " + param0);
        }
        return false;
    }

    private final synchronized void c(int param0, int param1) {
        if (!this.field_e) {
            this.field_d[param0] = ug.a(126, false, this.field_i.a(param0, 0));
        } else {
            this.field_d[param0] = this.field_i.a(param0, 0);
        }
        int var3 = -45 % ((-19 - param1) / 57);
    }

    final synchronized boolean b(int param0) {
        if (param0 != 0) {
            return false;
        }
        if (null != this.field_j) {
            return true;
        }
        this.field_j = this.field_i.a((byte) -55);
        if (!(null != this.field_j)) {
            return false;
        }
        this.field_h = new Object[this.field_j.field_i][];
        this.field_d = new Object[this.field_j.field_i];
        return true;
    }

    final boolean a(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_2_0 = 0;
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
            if (this.b(param2 ^ param2)) {
              param0 = param0.toLowerCase();
              param1 = param1.toLowerCase();
              var6 = (CharSequence) ((Object) param0);
              var4_int = this.field_j.field_h.a((byte) 76, mg.a(var6, (byte) 71));
              if (!this.b(var4_int, (byte) 23)) {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var7 = (CharSequence) ((Object) param1);
                var5 = this.field_j.field_j[var4_int].a((byte) 76, mg.a(var7, (byte) 94));
                stackIn_8_0 = this.a(var4_int, var5, 0);
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
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("mi.AA(");

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
          L2: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param1 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ',' + param2 + ')');
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

    final synchronized byte[] c(int param0, byte param1) {
        if (!this.b(0)) {
            return null;
        }
        if (param1 < 24) {
            ((int[]) (((Object[]) (this.field_d[36]))[4]))[10] = -56;
        }
        if (!((this.field_j.field_q.length ^ -1) != -2)) {
            return this.a((byte) -2, 0, param0);
        }
        if (!this.b(param0, (byte) 23)) {
            return null;
        }
        if (!(1 != this.field_j.field_q[param0])) {
            return this.a((byte) -2, param0, 0);
        }
        throw new RuntimeException();
    }

    private final synchronized byte[] a(int param0, int param1, int param2, int[] param3) {
        byte[] stackIn_27_0 = null;
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
            if (this.b(param1, param2, 0)) {
              L1: {
                L2: {
                  var5 = null;
                  if (null == this.field_h[param2]) {
                    break L2;
                  } else {
                    if (null != this.field_h[param2][param1]) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (!this.a(param2, param3, (byte) 87, param1)) {
                  this.c(param2, 95);
                  if (this.a(param2, param3, (byte) 98, param1)) {
                    break L1;
                  } else {
                    return null;
                  }
                } else {
                  break L1;
                }
              }
              if (this.field_h[param2] != null) {
                L3: {
                  if (this.field_h[param2][param1] != null) {
                    var7 = vb.a(false, 6, this.field_h[param2][param1]);
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
                  if (var5 != null) {
                    if (-2 == (this.field_k ^ -1)) {
                      this.field_h[param2][param1] = null;
                      if (-2 != (this.field_j.field_q[param2] ^ -1)) {
                        break L4;
                      } else {
                        this.field_h[param2] = null;
                        break L4;
                      }
                    } else {
                      if (this.field_k != 2) {
                        break L4;
                      } else {
                        this.field_h[param2] = null;
                        break L4;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                if (param0 >= 47) {
                  stackIn_29_0 = var5;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_27_0 = (byte[]) (this.field_d[0]);
                  decompiledRegionSelector0 = 0;
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
            stackIn_32_0 = var5;

            stackIn_32_1 = new StringBuilder().append("mi.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_27_0;
        } else {
          return (byte[]) ((Object) stackIn_29_0);
        }
    }

    final synchronized boolean a(int param0, int param1, int param2) {
        if (!this.b(param1, param0, param2)) {
            return false;
        }
        if (this.field_h[param0] != null && this.field_h[param0][param1] != null) {
            return true;
        }
        if (!(null == this.field_d[param0])) {
            return true;
        }
        this.c(param0, 62);
        if (null != this.field_d[param0]) {
            return true;
        }
        return false;
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
            if (this.b(0)) {
              param1 = param1.toLowerCase();
              param2 = param2.toLowerCase();
              var5 = -25 % ((param0 - 19) / 55);
              var7 = (CharSequence) ((Object) param1);
              var4_int = this.field_j.field_h.a((byte) 76, mg.a(var7, (byte) 65));
              if (this.b(var4_int, (byte) 23)) {
                var8 = (CharSequence) ((Object) param2);
                var6 = this.field_j.field_j[var4_int].a((byte) 76, mg.a(var8, (byte) -87));
                stackIn_7_0 = this.a((byte) -2, var4_int, var6);
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

            stackIn_10_1 = new StringBuilder().append("mi.R(").append(param0).append(',');

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
          throw sd.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        return stackIn_7_0;
    }

    final int d(int param0, byte param1) {
        if (param1 > -70) {
            this.a(-88, (String) (this.field_d[0]));
        }
        if (!(this.b(param0, (byte) 23))) {
            return 0;
        }
        return this.field_j.field_q[param0];
    }

    final int b(int param0, String param1) {
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
            if (this.b(0)) {
              if (param0 == -8087) {
                param1 = param1.toLowerCase();
                var4 = (CharSequence) ((Object) param1);
                var3_int = this.field_j.field_h.a((byte) 76, mg.a(var4, (byte) 88));
                stackIn_7_0 = this.b(var3_int, -102);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = ((int[]) (((Object[]) (this.field_d[10]))[4]))[1];
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

            stackIn_10_1 = new StringBuilder().append("mi.M(").append(param0).append(',');

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
          throw sd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
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
            if (!this.b(param0, (byte) 23)) {
              stackIn_3_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                param1 = param1.toLowerCase();
                if (param2 < -23) {
                  break L1;
                } else {
                  this.a(25, (String) (this.field_d[5]));
                  break L1;
                }
              }
              var5 = (CharSequence) ((Object) param1);
              var4_int = this.field_j.field_j[param0].a((byte) 76, mg.a(var5, (byte) -107));
              if (this.b(var4_int, param0, 0)) {
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

            stackIn_13_1 = new StringBuilder().append("mi.H(").append(param0).append(',');

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
          throw sd.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
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

    final synchronized int c(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = Confined.field_J ? 1 : 0;
        if (!this.b(0)) {
          return 0;
        } else {
          L0: {
            if (param0 <= -121) {
              break L0;
            } else {
              ((Object[]) (this.field_d[8]))[2] = (Object) null;
              break L0;
            }
          }
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L1: while (true) {
            if (this.field_d.length <= var4) {
              if (var2 != 0) {
                var4 = 100 * var3 / var2;
                return var4;
              } else {
                return 100;
              }
            } else {
              if (-1 > (this.field_j.field_t[var4] ^ -1)) {
                var3 = var3 + this.b(var4, -109);
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

    final boolean a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
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
            if (this.b(param1)) {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) ((Object) param0);
              var3_int = this.field_j.field_h.a((byte) 76, mg.a(var4, (byte) 65));
              stackIn_4_0 = this.a(var3_int, 0);
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

            stackIn_7_1 = new StringBuilder().append("mi.C(");

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
          throw sd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    final synchronized boolean a(int param0, byte param1) {
        if (!this.b(param1 + 37)) {
            return false;
        }
        if (this.field_j.field_q.length == 1) {
            return this.a(0, param0, param1 ^ -37);
        }
        if (!(this.b(param0, (byte) 23))) {
            return false;
        }
        if (param1 != -37) {
            this.b(-115, -51);
        }
        if (!((this.field_j.field_q[param0] ^ -1) != -2)) {
            return this.a(param0, 0, 0);
        }
        throw new RuntimeException();
    }

    final synchronized int b(int param0, int param1) {
        if (param1 > -18) {
            return 67;
        }
        if (!this.b(param0, (byte) 23)) {
            return 0;
        }
        if (!(null == this.field_d[param0])) {
            return 100;
        }
        return this.field_i.a(param0, true);
    }

    mi(tk param0, boolean param1, int param2) {
        this.field_j = null;
        try {
            if (-1 < (param2 ^ -1) || -3 > (param2 ^ -1)) {
                throw new IllegalArgumentException("");
            }
            this.field_i = param0;
            this.field_e = param1 ? true : false;
            this.field_k = param2;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "mi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_g = 0;
        field_a = new nf(540, 140);
        field_c = new int[8192];
        field_b = new bi[4];
    }
}
