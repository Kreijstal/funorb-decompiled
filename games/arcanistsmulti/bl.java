/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl extends ee implements bn, ak {
    static int[] field_i;
    mg field_h;

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var4 = hf.field_r;
            L1: while (true) {
              if (var3_int >= ib.field_v.length) {
                L2: {
                  if (param1 > 33) {
                    break L2;
                  } else {
                    field_i = (int[]) null;
                    break L2;
                  }
                }
                stackIn_13_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  var5 = oe.field_c[var3_int];
                  if (-1 < (var5 ^ -1)) {
                    var4 = var4 + qj.field_a;
                    break L3;
                  } else {
                    var6 = vh.a(true, (byte) 29, ib.field_v[var3_int]);
                    var4 = var4 + da.field_c;
                    var7 = vd.field_l + -(var6 >> 1892184385);
                    if (!bj.a(param0, 30, var4, var6 - -(la.field_d << -349087167), mo.field_h + (bm.field_h << 959670625), param2, -la.field_d + var7)) {
                      var4 = var4 + (mo.field_h + da.field_c + (bm.field_h << 852707329));
                      break L3;
                    } else {
                      stackIn_6_0 = var5;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "bl.S(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_13_0;
        }
    }

    final static void d(byte param0) {
        String var2 = (String) null;
        bb.a("", -3, (String) null);
        int var1 = -117 / ((-16 - param0) / 36);
    }

    final static ij a(boolean param0, kc param1, kc param2, oo param3, kc param4) {
        Object stackIn_3_0 = null;
        int stackIn_7_0 = 0;
        ij stackIn_9_0 = null;
        int stackIn_13_0 = 0;
        ij stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        ij[] var11 = null;
        int var12 = 0;
        oo var13_ref_oo = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        tk var16 = null;
        int var17 = 0;
        int[] var18 = null;
        char[] var19 = null;
        int[] var20 = null;
        char[] var21 = null;
        var17 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (param3 != null) {
              L1: {
                if (null != param3.field_p) {
                  stackIn_7_0 = param3.field_p.length;
                  break L1;
                } else {
                  stackIn_7_0 = 0;
                  break L1;
                }
              }
              var5_int = stackIn_7_0;
              if (param0) {
                L2: {
                  if (param3.field_D != null) {
                    stackIn_13_0 = param3.field_D.length;
                    break L2;
                  } else {
                    stackIn_13_0 = 0;
                    break L2;
                  }
                }
                L3: {
                  var6 = stackIn_13_0;
                  var7 = var5_int + var6;
                  var8 = new String[var7];
                  var21 = new char[var7];
                  var19 = var21;
                  var9 = var19;
                  var20 = new int[var7];
                  var18 = var20;
                  var10 = var18;
                  var11 = new ij[var7];
                  if (param3.field_p != null) {
                    var12 = 0;
                    L4: while (true) {
                      if (var12 >= param3.field_p.length) {
                        break L3;
                      } else {
                        var13_ref_oo = bg.field_d.a(3, param3.field_p[var12]);
                        var8[var12] = var13_ref_oo.field_w;
                        var9[var12] = param3.field_n[var12];
                        var11[var12] = bl.a(true, param1, param2, var13_ref_oo, param4);
                        var12++;
                        continue L4;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                L5: {
                  if (null == param3.field_D) {
                    break L5;
                  } else {
                    var12 = var5_int;
                    var13 = 49;
                    var14 = 0;
                    L6: while (true) {
                      if (param3.field_D.length <= var14) {
                        break L5;
                      } else {
                        L7: {
                          var15 = param3.field_D[var14];
                          if (0 == (var15 ^ -1)) {
                            var8[var12 - -var14] = mo.field_j;
                            var9[var12 + var14] = param3.field_z[var14];
                            var10[var12 - -var14] = param3.field_D[var14];
                            break L7;
                          } else {
                            L8: {
                              var16 = th.field_d.a(var15, (byte) -70);
                              var8[var14 + var12] = var16.c(true);
                              var9[var12 + var14] = param3.field_z[var14];
                              if (var9[var12 - -var14] > 0) {
                                break L8;
                              } else {
                                var13 = (char)(var13 + 1);
                                var9[var12 + var14] = (char)var13;
                                break L8;
                              }
                            }
                            var10[var14 + var12] = param3.field_D[var14];
                            break L7;
                          }
                        }
                        var14++;
                        continue L6;
                      }
                    }
                  }
                }
                stackIn_28_0 = new ij(0L, param2, param4, param1, var11, var20, var8, var21);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_9_0 = (ij) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var5);

            stackIn_31_1 = new StringBuilder().append("bl.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L9;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_34_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');

            if (param2 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L10;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_37_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',');

            if (param3 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L11;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_40_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(',');

            if (param4 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L12;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L12;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_32_0), stackIn_41_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ij) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_28_0;
          }
        }
    }

    public final void a(rn param0, int param1) {
        try {
            this.b(-17444);
            if (param1 != -20626) {
                this.field_h = (mg) null;
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "bl.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(ti param0, int param1) {
        try {
            this.b(-17444);
            if (param1 != -6509) {
                this.b((byte) -51);
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "bl.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean d(int param0) {
        oh var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        oh var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var4 = (oh) ((Object) la.field_b.b(12623));
            var1 = var4;
            if (var1 == null) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var2 = param0;
              L1: while (true) {
                if (var2 >= var1.field_s) {
                  stackIn_18_0 = 1;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  L2: {
                    if (null != var4.field_n[var2]) {
                      if (-1 != (var4.field_n[var2].field_e ^ -1)) {
                        break L2;
                      } else {
                        stackIn_11_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (var4.field_g[var2] == null) {
                      break L3;
                    } else {
                      if (var4.field_g[var2].field_e != 0) {
                        break L3;
                      } else {
                        stackIn_15_0 = 0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  }
                  var2++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1_ref), "bl.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0 != 0;
            } else {
              return stackIn_18_0 != 0;
            }
          }
        }
    }

    public final boolean a(byte param0) {
        if (param0 > -72) {
            this.field_h = (mg) null;
        }
        return this.field_h.j(-28612);
    }

    public static void c(byte param0) {
        int var1 = 48 % ((-29 - param0) / 33);
        field_i = null;
    }

    public final void b(rn param0, int param1) {
        try {
            if (param1 < 73) {
                this.field_h = (mg) null;
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "bl.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(kd param0, int param1) {
        try {
            pc.field_e.a(param0);
            if (param1 < 119) {
                kd var3 = (kd) null;
                bl.a((kd) null, 64);
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "bl.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String a(boolean param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = this.field_h.h(68);
              var3 = this.field_h.g(105);
              var4 = this.field_h.e(param0);
              var5 = ra.a(-109);
              if (1890 > var4) {
                break L1;
              } else {
                if (var4 <= -3 + var5) {
                  if (!tn.a(var3, (byte) 119, var4, var2_int)) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    stackIn_7_0 = null;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            stackIn_4_0 = tj.a(125, new String[]{"1890", Integer.toString(-3 + var5)}, af.field_Kb);
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = (NumberFormatException) (Object) decompiledCaughtException;
            decompiledRegionSelector0 = 1;
            break L2;
          }
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return gl.field_d;
          } else {
            return (String) ((Object) stackIn_7_0);
          }
        }
    }

    final eh b(byte param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        rn var6 = null;
        eh stackIn_2_0 = null;
        eh stackIn_5_0 = null;
        eh stackIn_11_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            var2_int = this.field_h.h(69);
            var3 = this.field_h.g(param0 + 134);
            var4 = this.field_h.e(true);
            var5 = ra.a(-26);
            if (1890 <= var4) {
              if (var4 <= -3 + var5) {
                L1: {
                  if (param0 == -66) {
                    break L1;
                  } else {
                    var6 = (rn) null;
                    this.a((rn) null, -112);
                    break L1;
                  }
                }
                if (!tn.a(var3, (byte) 115, var4, var2_int)) {
                  stackIn_11_0 = ra.field_k;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = ra.field_k;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = ra.field_k;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return ra.field_k;
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return nn.field_s;
            } else {
              return stackIn_11_0;
            }
          }
        }
    }

    public bl() {
    }

    static {
        $cfr$clinit: {
            int var0;
            int var1;
            int var2;
            field_i = new int[256];
            var1 = 0;
            L0: while (true) {
              if (-257 >= (var1 ^ -1)) {
                break $cfr$clinit;
              } else {
                var0 = var1;
                var2 = 0;
                L1: while (true) {
                  if ((var2 ^ -1) <= -9) {
                    field_i[var1] = var0;
                    var1++;
                    continue L0;
                  } else {
                    if (-2 == (1 & var0 ^ -1)) {
                      var0 = -306674912 ^ var0 >>> -1742307583;
                      var2++;
                      continue L1;
                    } else {
                      var0 = var0 >>> 1;
                      var2++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }
}
