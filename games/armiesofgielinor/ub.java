/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub {
    private int field_c;
    private jr[] field_b;
    static boolean field_e;
    static String field_a;
    private int field_f;
    static int field_d;

    final static te a(byte param0, sn param1) {
        RuntimeException var2 = null;
        te stackIn_2_0 = null;
        te stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        te stackOut_3_0 = null;
        te stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 > 24) {
              stackOut_3_0 = ne.a(-69, aa.a(param1, 100, 96));
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (te) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("ub.F(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final boolean b(byte param0, int param1, int param2, int param3, int param4) {
        te discarded$1 = null;
        int var6 = 0;
        int var7 = 0;
        sn var8 = null;
        boolean stackIn_4_0 = false;
        boolean stackIn_5_0 = false;
        int stackIn_9_0 = 0;
        boolean stackIn_16_0 = false;
        boolean stackIn_17_0 = false;
        int stackIn_21_0 = 0;
        boolean stackOut_15_0 = false;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        boolean stackOut_3_0 = false;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        var6 = 0;
        if (param0 != 117) {
          var8 = (sn) null;
          discarded$1 = ub.a((byte) 7, (sn) null);
          L0: while (true) {
            if (this.field_c > var6) {
              stackOut_15_0 = this.field_b[var6].b(42, param4, param2, param3, param1);
              stackIn_17_0 = stackOut_15_0;
              stackIn_16_0 = stackOut_15_0;
              if (var7 == 0) {
                if (!stackIn_17_0) {
                  var6++;
                  continue L0;
                } else {
                  L1: {
                    if (this.field_c >> 1452281729 >= var6) {
                      stackOut_20_0 = 0;
                      stackIn_21_0 = stackOut_20_0;
                      break L1;
                    } else {
                      stackOut_19_0 = 1;
                      stackIn_21_0 = stackOut_19_0;
                      break L1;
                    }
                  }
                  return stackIn_21_0 != 0;
                }
              } else {
                return stackIn_16_0;
              }
            } else {
              return false;
            }
          }
        } else {
          L2: while (true) {
            if (this.field_c > var6) {
              stackOut_3_0 = this.field_b[var6].b(42, param4, param2, param3, param1);
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (var7 == 0) {
                if (!stackIn_5_0) {
                  var6++;
                  continue L2;
                } else {
                  L3: {
                    if (this.field_c >> 1452281729 >= var6) {
                      stackOut_8_0 = 0;
                      stackIn_9_0 = stackOut_8_0;
                      break L3;
                    } else {
                      stackOut_7_0 = 1;
                      stackIn_9_0 = stackOut_7_0;
                      break L3;
                    }
                  }
                  return stackIn_9_0 != 0;
                }
              } else {
                return stackIn_4_0;
              }
            } else {
              return false;
            }
          }
        }
    }

    final int a(byte param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_7_0 = false;
        boolean stackOut_5_0 = false;
        L0: {
          var7 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 < -92) {
            break L0;
          } else {
            field_d = 33;
            break L0;
          }
        }
        var6 = 0;
        L1: while (true) {
          if (this.field_c > var6) {
            stackOut_5_0 = this.field_b[var6].b(71, param3, param4, param2, param1);
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (var7 == 0) {
              if (stackIn_7_0) {
                return this.field_b[var6].field_i;
              } else {
                var6++;
                continue L1;
              }
            } else {
              return stackIn_6_0 ? 1 : 0;
            }
          } else {
            return -1;
          }
        }
    }

    final void a(int param0, int param1, int[] param2, int param3, int param4) {
        boolean discarded$1 = false;
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        boolean stackIn_4_0 = false;
        jr stackIn_8_0 = null;
        jr stackIn_9_0 = null;
        jr stackIn_10_0 = null;
        jr stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        jr stackOut_7_0 = null;
        jr stackOut_8_0 = null;
        jr stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        jr stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var6_int = param2[6];
            var7 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (this.field_c <= var7) {
                    break L3;
                  } else {
                    stackOut_3_0 = this.field_b[var7].field_a;
                    stackIn_18_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var8 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (!stackIn_4_0) {
                            break L5;
                          } else {
                            L6: {
                              if (-1 == bw.field_m[this.field_b[var7].field_i][1]) {
                                break L6;
                              } else {
                                var6_int = param2[bw.field_m[this.field_b[var7].field_i][1]];
                                break L6;
                              }
                            }
                            L7: {
                              L8: {
                                stackOut_7_0 = this.field_b[var7];
                                stackIn_10_0 = stackOut_7_0;
                                stackIn_8_0 = stackOut_7_0;
                                if (param0 < bw.field_m[this.field_b[var7].field_i][8]) {
                                  break L8;
                                } else {
                                  stackOut_8_0 = (jr) ((Object) stackIn_8_0);
                                  stackIn_10_0 = stackOut_8_0;
                                  stackIn_9_0 = stackOut_8_0;
                                  if (var6_int < bw.field_m[this.field_b[var7].field_i][2]) {
                                    break L8;
                                  } else {
                                    stackOut_9_0 = (jr) ((Object) stackIn_9_0);
                                    stackOut_9_1 = 1;
                                    stackIn_11_0 = stackOut_9_0;
                                    stackIn_11_1 = stackOut_9_1;
                                    break L7;
                                  }
                                }
                              }
                              stackOut_10_0 = (jr) ((Object) stackIn_10_0);
                              stackOut_10_1 = 0;
                              stackIn_11_0 = stackOut_10_0;
                              stackIn_11_1 = stackOut_10_1;
                              break L7;
                            }
                            ((jr) (Object) stackIn_11_0).a(stackIn_11_1, 16 + param4, false, param3 - -16);
                            if (var8 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        L9: {
                          if (this.field_b[var7].field_c == 0) {
                            break L9;
                          } else {
                            this.field_b[var7].a(param2[-1 + this.field_b[var7].field_c], param4 + 16, false, param3 + 16);
                            if (var8 == 0) {
                              break L4;
                            } else {
                              break L9;
                            }
                          }
                        }
                        this.field_b[var7].a(var6_int, param4 + 16, false, param3 + 16);
                        break L4;
                      }
                      var7++;
                      if (var8 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_17_0 = param1;
                stackIn_18_0 = stackOut_17_0;
                break L2;
              }
              if (stackIn_18_0 == -23451) {
                break L0;
              } else {
                discarded$1 = this.b((byte) 112, 3, 116, -86, -110);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var6);
            stackOut_21_1 = new StringBuilder().append("ub.E(").append(param0).append(',').append(param1).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L10;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L10;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static String a(byte param0, int param1) {
        String var2 = null;
        int var3 = 0;
        int var4 = 0;
        String stackIn_10_0 = null;
        String stackIn_11_0 = null;
        String stackOut_9_0 = null;
        L0: {
          var4 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (0 > param1) {
            break L0;
          } else {
            if (-4 < (param1 ^ -1)) {
              var2 = "";
              if (param0 >= 19) {
                var3 = 0;
                L1: while (true) {
                  if (var3 < cd.field_a[param1].field_n.length) {
                    stackOut_9_0 = var2 + var3 + ": " + cd.field_a[param1].field_n[var3].field_J + "\n";
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    if (var4 == 0) {
                      var2 = stackIn_11_0;
                      var3++;
                      continue L1;
                    } else {
                      return stackIn_10_0;
                    }
                  } else {
                    return var2;
                  }
                }
              } else {
                return (String) null;
              }
            } else {
              break L0;
            }
          }
        }
        return "Unkown Campaign " + param1;
    }

    final jr a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = 0;
        if (param1 != -15050) {
          field_a = (String) null;
          L0: while (true) {
            if (var3 < this.field_c) {
              if (param0 != this.field_b[var3].field_i) {
                var3++;
                if (var4 == 0) {
                  continue L0;
                } else {
                  return null;
                }
              } else {
                return this.field_b[var3];
              }
            } else {
              return null;
            }
          }
        } else {
          L1: while (true) {
            if (var3 < this.field_c) {
              if (param0 != this.field_b[var3].field_i) {
                var3++;
                if (var4 == 0) {
                  continue L1;
                } else {
                  return null;
                }
              } else {
                return this.field_b[var3];
              }
            } else {
              return null;
            }
          }
        }
    }

    final static void a(boolean param0, boolean param1) {
        ij.field_w = !param1 ? new ea(ob.field_O, eb.field_c) : new ea(ur.field_x, uj.field_l);
        if (param0) {
            return;
        }
        lk.field_a = new je(0L, (je) null);
        lk.field_a.a(ij.field_w.field_a, 126);
        lk.field_a.a(mp.field_Lb, 97);
        ta.field_R = new je(0L, jm.field_b);
        df.field_K = new je(0L, (je) null);
        ta.field_R.a(bk.field_f, 54);
        ta.field_R.a(df.field_K, 70);
        df.field_K.a(nf.field_Kb, 112);
        df.field_K.a(dv.field_m, 74);
        je.a(27, param1);
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 == -122) {
            return;
        }
        field_a = (String) null;
    }

    ub(int param0, jr[] param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        jr stackIn_6_0 = null;
        jr stackIn_7_0 = null;
        jr stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        jr stackOut_5_0 = null;
        jr stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        jr stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            this.field_c = param1.length;
            this.field_f = param0;
            this.field_b = param1;
            var4_int = 0;
            L1: while (true) {
              if (var4_int >= this.field_c) {
                break L0;
              } else {
                if (var5 == 0) {
                  L2: {
                    stackOut_5_0 = this.field_b[var4_int];
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (!param2) {
                      stackOut_7_0 = (jr) ((Object) stackIn_7_0);
                      stackOut_7_1 = -1;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      break L2;
                    } else {
                      stackOut_6_0 = (jr) ((Object) stackIn_6_0);
                      stackOut_6_1 = 1;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      break L2;
                    }
                  }
                  stackIn_8_0.field_b = stackIn_8_1 * (int)(Math.sin(2.0 * (3.141592653589793 * (double)var4_int) / (double)this.field_c) * (double)this.field_f);
                  this.field_b[var4_int].field_g = -(int)(Math.cos(2.0 * (3.141592653589793 * (double)var4_int) / (double)this.field_c) * (double)this.field_f);
                  var4_int++;
                  continue L1;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var4);
            stackOut_10_1 = new StringBuilder().append("ub.<init>(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ')');
        }
    }

    final static vb a(oj param0, ha param1, boolean param2, int param3, ic param4, int param5, int param6, eo param7) {
        int var8_int = 0;
        RuntimeException var8 = null;
        vb var9 = null;
        Object stackIn_2_0 = null;
        vb stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        vb stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            var8_int = -39 / ((-87 - param5) / 33);
            var9 = new vb(param4, param1, param7, param0, param6, param3, param2);
            if (var9.b(param6, param3, true)) {
              stackOut_3_0 = (vb) (var9);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var8);
            stackOut_5_1 = new StringBuilder().append("ub.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param4 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          L4: {
            stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param7 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (vb) ((Object) stackIn_2_0);
        } else {
          return stackIn_4_0;
        }
    }

    static {
        field_a = "Portal";
    }
}
