/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua extends ki implements ka {
    static String[] field_M;
    private ge field_K;
    static String field_E;
    static o[] field_F;
    private pj[] field_J;
    static mf field_I;
    static int field_L;
    static int field_N;
    static mg field_G;
    static int field_H;
    private String[] field_D;

    final static int a(int param0, byte param1) {
        int var3 = SolKnight.field_L ? 1 : 0;
        qf.field_a = null;
        ug.field_f = 0;
        if (param1 != -86) {
            field_L = -67;
        }
        ik.field_b = null;
        int var2 = ue.field_a;
        ue.field_a = vc.field_e;
        if (param0 == 51) {
            il.field_c.field_c = 2;
        } else {
            if (param0 != 50) {
                il.field_c.field_c = 1;
            } else {
                il.field_c.field_c = 5;
            }
        }
        vc.field_e = var2;
        il.field_c.field_l = il.field_c.field_l + 1;
        if (2 <= il.field_c.field_l && (param0 ^ -1) == -52) {
            return 2;
        }
        if (-3 >= (il.field_c.field_l ^ -1)) {
            if (!(param0 != 50)) {
                return 5;
            }
        }
        if ((il.field_c.field_l ^ -1) <= -5) {
            return 1;
        }
        return -1;
    }

    final boolean a(char param0, byte param1, int param2, rc param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
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
            if (!super.a(param0, (byte) -77, param2, param3)) {
              var5_int = -102 / ((param1 - 31) / 56);
              if (98 != param2) {
                if (99 != param2) {
                  stackIn_10_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_8_0 = this.b(108, param3);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = this.a((byte) -112, param3);
                decompiledRegionSelector0 = 1;
                break L0;
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
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("ua.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw fc.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              return stackIn_10_0 != 0;
            }
          }
        }
    }

    public static void e(byte param0) {
        field_I = null;
        int var1 = -23 % ((param0 - 11) / 52);
        field_F = null;
        field_M = null;
        field_E = null;
        field_G = null;
    }

    final static void a(byte param0) {
        if (param0 > -92) {
            ua.a((byte) 57);
        }
        hc.a(lf.field_e, false, ug.field_d, true);
        ga.field_G = true;
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (!(-1 == (param1 ^ -1))) {
            return;
        }
        mg var5 = field_G;
        if (this.field_D != null) {
            var5.a(nb.field_d, param2 + this.field_m, this.field_j + param0, this.field_t, 20, 16777215, -1, 0, 0, var5.field_s + var5.field_F);
        }
    }

    final static void a(int param0, byte[] param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        gb var16 = null;
        gb var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        var15 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var16 = new gb(param1);
            var17 = var16;
            var17.field_m = -2 + param1.length;
            nb.field_c = var17.i(39);
            qf.field_d = new int[nb.field_c];
            rg.field_e = new boolean[nb.field_c];
            ph.field_h = new int[nb.field_c];
            uj.field_b = new int[nb.field_c];
            sa.field_l = new int[nb.field_c];
            jc.field_c = new byte[nb.field_c][];
            uf.field_s = new byte[nb.field_c][];
            var17.field_m = -(nb.field_c * 8) + param1.length - 7;
            kl.field_a = var17.i(param0 ^ -8);
            we.field_e = var17.i(28);
            var3 = 1 + (255 & var17.j(255));
            var4 = 0;
            L1: while (true) {
              if (nb.field_c <= var4) {
                var4 = 0;
                L2: while (true) {
                  if (var4 >= nb.field_c) {
                    var4 = 0;
                    L3: while (true) {
                      if (var4 >= nb.field_c) {
                        var4 = 0;
                        L4: while (true) {
                          if (nb.field_c <= var4) {
                            var17.field_m = param1.length + (-7 + -(8 * nb.field_c) + 3 + -(3 * var3));
                            ig.field_H = new int[var3];
                            var4 = 1;
                            L5: while (true) {
                              if (var4 >= var3) {
                                var17.field_m = 0;
                                var4 = param0;
                                L6: while (true) {
                                  if (var4 >= nb.field_c) {
                                    break L0;
                                  } else {
                                    L7: {
                                      var5 = sa.field_l[var4];
                                      var6 = uj.field_b[var4];
                                      var7 = var5 * var6;
                                      var20 = new byte[var7];
                                      var18 = var20;
                                      var8 = var18;
                                      jc.field_c[var4] = var20;
                                      var21 = new byte[var7];
                                      var19 = var21;
                                      var9 = var19;
                                      uf.field_s[var4] = var21;
                                      var10 = 0;
                                      var11 = var17.j(255);
                                      if (0 != (var11 & 1)) {
                                        var12 = 0;
                                        L8: while (true) {
                                          if (var5 <= var12) {
                                            if ((var11 & 2) == 0) {
                                              break L7;
                                            } else {
                                              var12 = 0;
                                              L9: while (true) {
                                                if (var12 >= var5) {
                                                  break L7;
                                                } else {
                                                  var13 = 0;
                                                  L10: while (true) {
                                                    if (var6 <= var13) {
                                                      var12++;
                                                      continue L9;
                                                    } else {
                                                      L11: {
                                                        dupTemp$0 = var17.a((byte) -14);
                                                        var9[var12 - -(var13 * var5)] = dupTemp$0;
                                                        var14 = dupTemp$0;
                                                        stackIn_44_0 = var10;

                                                        if (0 == (var14 ^ -1)) {
                                                          stackIn_45_0 = stackIn_44_0;
                                                          stackIn_45_1 = 0;
                                                          break L11;
                                                        } else {
                                                          stackIn_45_0 = stackIn_44_0;
                                                          stackIn_45_1 = 1;
                                                          break L11;
                                                        }
                                                      }
                                                      var10 = stackIn_45_0 | stackIn_45_1;
                                                      var13++;
                                                      continue L10;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            var13 = 0;
                                            L12: while (true) {
                                              if (var6 <= var13) {
                                                var12++;
                                                continue L8;
                                              } else {
                                                var8[var12 - -(var13 * var5)] = var17.a((byte) -14);
                                                var13++;
                                                continue L12;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        var12 = 0;
                                        L13: while (true) {
                                          if (var12 >= var7) {
                                            if ((2 & var11) == 0) {
                                              break L7;
                                            } else {
                                              var12 = 0;
                                              L14: while (true) {
                                                if (var7 <= var12) {
                                                  break L7;
                                                } else {
                                                  L15: {
                                                    dupTemp$1 = var17.a((byte) -14);
                                                    var9[var12] = dupTemp$1;
                                                    var13 = dupTemp$1;
                                                    stackIn_29_0 = var10;

                                                    if ((var13 ^ -1) == 0) {
                                                      stackIn_30_0 = stackIn_29_0;
                                                      stackIn_30_1 = 0;
                                                      break L15;
                                                    } else {
                                                      stackIn_30_0 = stackIn_29_0;
                                                      stackIn_30_1 = 1;
                                                      break L15;
                                                    }
                                                  }
                                                  var10 = stackIn_30_0 | stackIn_30_1;
                                                  var12++;
                                                  continue L14;
                                                }
                                              }
                                            }
                                          } else {
                                            var8[var12] = var17.a((byte) -14);
                                            var12++;
                                            continue L13;
                                          }
                                        }
                                      }
                                    }
                                    rg.field_e[var4] = var10 != 0;
                                    var4++;
                                    continue L6;
                                  }
                                }
                              } else {
                                L16: {
                                  ig.field_H[var4] = var17.b(false);
                                  if (ig.field_H[var4] != 0) {
                                    break L16;
                                  } else {
                                    ig.field_H[var4] = 1;
                                    break L16;
                                  }
                                }
                                var4++;
                                continue L5;
                              }
                            }
                          } else {
                            uj.field_b[var4] = var17.i(param0 + 40);
                            var4++;
                            continue L4;
                          }
                        }
                      } else {
                        sa.field_l[var4] = var17.i(11);
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    qf.field_d[var4] = var17.i(-110);
                    var4++;
                    continue L2;
                  }
                }
              } else {
                ph.field_h[var4] = var16.i(-116);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var2 = decompiledCaughtException;
            stackIn_51_0 = (RuntimeException) (var2);

            stackIn_51_1 = new StringBuilder().append("ua.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "null";
              break L17;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "{...}";
              break L17;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_52_0), stackIn_52_2 + ')');
        }
    }

    final static ol a(boolean param0, byte[] param1) {
        ol var2 = null;
        RuntimeException var2_ref = null;
        ol stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                if (param0) {
                  break L1;
                } else {
                  field_H = -117;
                  break L1;
                }
              }
              var2 = new ol(param1, ph.field_h, qf.field_d, sa.field_l, uj.field_b, ig.field_H, jc.field_c);
              og.a((byte) -97);
              stackIn_6_0 = (ol) (var2);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2_ref);

            stackIn_9_1 = new StringBuilder().append("ua.E(").append(param0).append(',');

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
          throw fc.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    public final void a(int param0, int param1, int param2, pj param3, boolean param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (param4) {
              var6_int = 0;
              L1: while (true) {
                if (var6_int >= this.field_D.length) {
                  L2: {
                    if (param3 != this.field_J[this.field_D.length]) {
                      break L2;
                    } else {
                      this.field_K.a((byte) 22);
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    if (param3 != this.field_J[var6_int]) {
                      break L3;
                    } else {
                      this.field_K.a(param4, this.field_D[var6_int]);
                      break L3;
                    }
                  }
                  var6_int++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var6);

            stackIn_13_1 = new StringBuilder().append("ua.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static mb h(int param0) {
        if (param0 != 0) {
            field_F = (o[]) null;
        }
        return new mb(sg.b(-1), he.a(71));
    }

    ua(ge param0) {
        super(0, 0, 0, 0, (j) null);
        try {
            this.field_K = param0;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "ua.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, String[] param1) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        ri var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_B.a(true);
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length != 0) {
                  var3_int = param1.length;
                  this.field_D = new String[var3_int];
                  var4_int = 0;
                  L2: while (true) {
                    if (var4_int >= var3_int) {
                      L3: {
                        var4 = new ri(field_G, 0, 1);
                        this.field_J = new pj[var3_int + 1];
                        if (param0 == 20870) {
                          break L3;
                        } else {
                          field_L = -28;
                          break L3;
                        }
                      }
                      var5 = 0;
                      L4: while (true) {
                        if (var3_int <= var5) {
                          this.field_J[var3_int] = new pj(wc.field_d, (dg) (this));
                          this.field_J[var3_int].field_w = (j) ((Object) var4);
                          this.field_J[var3_int].b(15, 100, 0, 0, 20 - -((1 + var3_int) * 16));
                          this.a(this.field_J[var3_int], 5411);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          this.field_J[var5] = new pj(this.field_D[var5], (dg) (this));
                          this.field_J[var5].field_w = (j) ((Object) var4);
                          this.field_J[var5].field_z = he.field_f;
                          this.field_J[var5].b(15, 80, 0, 0, 20 - -(16 * var5));
                          this.a(this.field_J[var5], 5411);
                          var5++;
                          continue L4;
                        }
                      }
                    } else {
                      this.field_D[var4_int] = gh.a(-31433, (CharSequence) ((Object) param1[var4_int])).replace(' ', ' ');
                      var4_int++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            this.field_D = null;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("ua.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_E = "Subscribing members have access to fullscreen mode.<br>TODO Game-specific benefits, screenshots, etc.";
        field_M = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_L = 0;
    }
}
