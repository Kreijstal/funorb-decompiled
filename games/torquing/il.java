/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il extends gf {
    static int[][] field_m;
    private boolean field_n;
    static int field_l;
    static int[] field_o;
    private String field_r;
    static int[] field_p;
    static java.awt.Frame field_q;

    public static void c(byte param0) {
        field_p = null;
        if (param0 > -111) {
            String var2 = (String) null;
            il.a((String) null, (la) null, (String) null, (byte) 10);
        }
        field_o = null;
        field_m = (int[][]) null;
        field_q = null;
    }

    final String a(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        dn var4 = null;
        CharSequence var5 = null;
        String stackIn_3_0 = null;
        Object stackIn_11_0 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = (CharSequence) ((Object) param1);
            var3 = fd.a(0, var5);
            if (var3 != null) {
              stackIn_3_0 = (String) (var3);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 == -121) {
                  break L1;
                } else {
                  this.field_r = (String) null;
                  break L1;
                }
              }
              L2: {
                if (param1.equals(this.field_r)) {
                  break L2;
                } else {
                  var4 = he.a(1, param1);
                  if (var4 != null) {
                    if (var4.field_e == null) {
                      this.field_n = var4.field_b;
                      this.field_r = param1;
                      break L2;
                    } else {
                      stackIn_11_0 = null;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                }
              }
              if (!this.field_n) {
                stackIn_16_0 = s.field_u;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                return rk.field_d;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("il.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (String) ((Object) stackIn_11_0);
          } else {
            return stackIn_16_0;
          }
        }
    }

    final void e(int param0) {
        this.field_r = null;
        if (param0 >= -38) {
            il.a((byte) 36, 103);
        }
    }

    final static void a(byte param0, int param1) {
        ip.field_c = hc.field_d[param1];
        if (param0 != 52) {
            String var3 = (String) null;
            il.a((String) null, (la) null, (String) null, (byte) -45);
        }
        Torquing.field_w = in.field_a[param1];
        md.field_b = oc.field_a[param1];
    }

    il(tk param0) {
        super(param0);
        this.field_n = false;
    }

    final static String a(String param0, la param1, String param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String stackIn_3_0 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = 17 % ((-22 - param3) / 48);
            if (!param1.a(-12749)) {
              stackIn_3_0 = (String) (param0);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              stackIn_5_0 = param2 + " - " + param1.a((byte) -32) + "%";
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("il.J(");

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
          L2: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_9_0), stackIn_15_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_5_0;
        }
    }

    final static void f(int param0) {
        String[][] dupTemp$0 = null;
        long[][] dupTemp$1 = null;
        int[][] dupTemp$2 = null;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        bm var4_ref_bm = null;
        int var5 = 0;
        wc var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        df var27 = null;
        var26 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (param0 == -30593) {
                break L1;
              } else {
                field_l = -4;
                break L1;
              }
            }
            L2: {
              var27 = kj.field_d;
              var2 = var27.i((byte) -101);
              if (0 != var2) {
                if (1 == var2) {
                  var3 = var27.i(param0 + 37681);
                  var4 = var27.b(68);
                  var6 = (wc) ((Object) so.field_t.b(0));
                  L3: while (true) {
                    L4: {
                      if (var6 == null) {
                        break L4;
                      } else {
                        if (var3 != var6.field_q) {
                          var6 = (wc) ((Object) so.field_t.f(param0 + 6534));
                          continue L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (var6 != null) {
                      var6.field_l = var4;
                      var6.f(0);
                      break L2;
                    } else {
                      ih.b(true);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                } else {
                  nn.a("HS1: " + me.a(-1), (Throwable) null, param0 ^ 20837);
                  ih.b(true);
                  break L2;
                }
              } else {
                var3 = var27.i(7088);
                var4_ref_bm = (bm) ((Object) gl.field_d.b(0));
                L5: while (true) {
                  L6: {
                    if (var4_ref_bm == null) {
                      break L6;
                    } else {
                      if (var4_ref_bm.field_s != var3) {
                        var4_ref_bm = (bm) ((Object) gl.field_d.f(-24059));
                        continue L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  if (var4_ref_bm != null) {
                    L7: {
                      var5 = var27.i((byte) -101);
                      if (var5 == 0) {
                        break L7;
                      } else {
                        var6_int = var4_ref_bm.field_q;
                        cb.field_m[0].field_c = null;
                        cb.field_m[0].field_e = false;
                        cb.field_m[0].field_d = re.field_e;
                        var7 = var4_ref_bm.field_o;
                        var8_int = 1;
                        L8: while (true) {
                          if (var8_int >= var5) {
                            dupTemp$0 = new String[3][var6_int];
                            var4_ref_bm.field_p = dupTemp$0;
                            var8 = dupTemp$0;
                            var9 = new String[3][var6_int];
                            dupTemp$1 = new long[3][var6_int];
                            var4_ref_bm.field_m = dupTemp$1;
                            var10 = dupTemp$1;
                            dupTemp$2 = new int[3][var6_int * var7];
                            var4_ref_bm.field_n = dupTemp$2;
                            var11 = dupTemp$2;
                            var12 = 0;
                            var13 = 0;
                            var14 = 0;
                            var15 = 0;
                            var16 = 0;
                            var17 = 0;
                            var18 = var27.i((byte) -101);
                            if ((var18 ^ -1) < -1) {
                              var19 = 0;
                              L9: while (true) {
                                if (var19 >= var18) {
                                  break L7;
                                } else {
                                  L10: {
                                    var20 = var27.i((byte) -101);
                                    var21 = cb.field_m[var20].field_d;
                                    var22 = var27.b(67);
                                    var24 = var27.field_n;
                                    if (var19 < var6_int) {
                                      var8[0][var12] = var21;
                                      var9[0][var12] = cb.field_m[var20].field_c;
                                      var10[0][var12] = var22;
                                      var12++;
                                      var25 = 0;
                                      L11: while (true) {
                                        if (var25 >= var7) {
                                          break L10;
                                        } else {
                                          incrementValue$3 = var15;
                                          var15++;
                                          var11[0][incrementValue$3] = var27.c((byte) -33);
                                          var25++;
                                          continue L11;
                                        }
                                      }
                                    } else {
                                      break L10;
                                    }
                                  }
                                  L12: {
                                    if (var21 == null) {
                                      break L12;
                                    } else {
                                      if (!bn.a(var21, -17310)) {
                                        break L12;
                                      } else {
                                        var8[1][var13] = re.field_e;
                                        var9[1][var13] = null;
                                        var10[1][var13] = var22;
                                        var27.field_n = var24;
                                        var13++;
                                        var25 = 0;
                                        L13: while (true) {
                                          if (var7 <= var25) {
                                            break L12;
                                          } else {
                                            incrementValue$4 = var16;
                                            var16++;
                                            var11[1][incrementValue$4] = var27.c((byte) -76);
                                            var25++;
                                            continue L13;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L14: {
                                    if (var6_int <= var14) {
                                      break L14;
                                    } else {
                                      if (!cb.field_m[var20].field_e) {
                                        cb.field_m[var20].field_e = true;
                                        var8[2][var14] = var21;
                                        var9[2][var14] = cb.field_m[var20].field_c;
                                        var10[2][var14] = var22;
                                        var14++;
                                        var27.field_n = var24;
                                        var25 = 0;
                                        L15: while (true) {
                                          if (var7 <= var25) {
                                            break L14;
                                          } else {
                                            incrementValue$5 = var17;
                                            var17++;
                                            var11[2][incrementValue$5] = var27.c((byte) -55);
                                            var25++;
                                            continue L15;
                                          }
                                        }
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  var19++;
                                  continue L9;
                                }
                              }
                            } else {
                              break L7;
                            }
                          } else {
                            L16: {
                              cb.field_m[var8_int].field_d = var27.h((byte) 124);
                              cb.field_m[var8_int].field_e = false;
                              if ((var27.i((byte) -101) ^ -1) != -2) {
                                cb.field_m[var8_int].field_c = null;
                                break L16;
                              } else {
                                cb.field_m[var8_int].field_c = var27.h((byte) 123);
                                break L16;
                              }
                            }
                            var8_int++;
                            continue L8;
                          }
                        }
                      }
                    }
                    var4_ref_bm.field_k = true;
                    var4_ref_bm.f(param0 ^ -30593);
                    break L2;
                  } else {
                    ih.b(true);
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var1), "il.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final cd a(int param0, String param1) {
        dn var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        cd stackIn_3_0 = null;
        cd stackIn_6_0 = null;
        cd stackIn_13_0 = null;
        cd stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = (CharSequence) ((Object) param1);
            if (!va.a(-21369, var4)) {
              stackIn_3_0 = so.field_u;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 > 62) {
                L1: {
                  if (!param1.equals(this.field_r)) {
                    L2: {
                      var3 = he.a(1, param1);
                      if (var3 == null) {
                        break L2;
                      } else {
                        if (null != var3.field_e) {
                          break L2;
                        } else {
                          this.field_n = var3.field_b;
                          this.field_r = param1;
                          break L1;
                        }
                      }
                    }
                    stackIn_13_0 = gn.field_h;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L1;
                  }
                }
                L3: {
                  if (this.field_n) {
                    stackIn_18_0 = so.field_s;
                    break L3;
                  } else {
                    stackIn_18_0 = so.field_u;
                    break L3;
                  }
                }
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackIn_6_0 = (cd) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3_ref);

            stackIn_21_1 = new StringBuilder().append("il.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              return stackIn_18_0;
            }
          }
        }
    }

    static {
        field_m = new int[][]{new int[]{1766, 1968, 0}, new int[]{1877, 0, 0}};
        field_l = -1;
        field_p = new int[3];
    }
}
