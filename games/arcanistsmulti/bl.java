/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl extends ee implements bn, ak {
    static int[] field_i;
    mg field_h;

    final static int a(int param0, byte param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        var3 = 0;
        var4 = hf.field_r;
        L0: while (true) {
          if (var3 >= ib.field_v.length) {
            L1: {
              if (param1 > 33) {
                break L1;
              } else {
                field_i = null;
                break L1;
              }
            }
            return -1;
          } else {
            var5 = oe.field_c[var3];
            if (-1 < (var5 ^ -1)) {
              var4 = var4 + qj.field_a;
              var3++;
              continue L0;
            } else {
              var6 = vh.a(true, (byte) 29, ib.field_v[var3]);
              var4 = var4 + da.field_c;
              var7 = vd.field_l + -(var6 >> 1892184385);
              if (!bj.a(param0, 30, var4, var6 - -(la.field_d << -349087167), mo.field_h + (bm.field_h << 959670625), param2, -la.field_d + var7)) {
                var4 = var4 + (mo.field_h + da.field_c + (bm.field_h << 852707329));
                var3++;
                continue L0;
              } else {
                return var5;
              }
            }
          }
        }
    }

    final static void d(byte param0) {
        Object var2 = null;
        bb.a("", -3, (String) null);
        int var1 = -117 / ((-16 - param0) / 36);
    }

    final static ij a(boolean param0, kc param1, kc param2, oo param3, kc param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        ij[] var11 = null;
        int var12 = 0;
        oo var13_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        tk var16 = null;
        int var17 = 0;
        int[] var18 = null;
        char[] var19 = null;
        int[] var20 = null;
        char[] var21 = null;
        int[] var22 = null;
        char[] var23 = null;
        int[] var24 = null;
        char[] var25 = null;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        var17 = ArcanistsMulti.field_G ? 1 : 0;
        if (param3 != null) {
          L0: {
            if (null != param3.field_p) {
              stackOut_4_0 = param3.field_p.length;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          var5 = stackIn_5_0;
          if (param0) {
            L1: {
              if (param3.field_D != null) {
                stackOut_9_0 = param3.field_D.length;
                stackIn_10_0 = stackOut_9_0;
                break L1;
              } else {
                stackOut_8_0 = 0;
                stackIn_10_0 = stackOut_8_0;
                break L1;
              }
            }
            L2: {
              var6 = stackIn_10_0;
              var7 = var5 + var6;
              var8 = new String[var7];
              var25 = new char[var7];
              var23 = var25;
              var21 = var23;
              var19 = var21;
              var9 = var19;
              var24 = new int[var7];
              var22 = var24;
              var20 = var22;
              var18 = var20;
              var10 = var18;
              var11 = new ij[var7];
              if (param3.field_p != null) {
                var12 = 0;
                L3: while (true) {
                  if (var12 >= param3.field_p.length) {
                    break L2;
                  } else {
                    var13_ref = bg.field_d.a(3, param3.field_p[var12]);
                    var8[var12] = var13_ref.field_w;
                    var9[var12] = param3.field_n[var12];
                    var11[var12] = bl.a(true, param1, param2, var13_ref, param4);
                    var12++;
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            L4: {
              if (null == param3.field_D) {
                break L4;
              } else {
                var12 = var5;
                var13 = 49;
                var14 = 0;
                L5: while (true) {
                  if (param3.field_D.length <= var14) {
                    break L4;
                  } else {
                    var15 = param3.field_D[var14];
                    if (0 == (var15 ^ -1)) {
                      var8[var12 - -var14] = mo.field_j;
                      var9[var12 + var14] = param3.field_z[var14];
                      var10[var12 - -var14] = param3.field_D[var14];
                      var14++;
                      continue L5;
                    } else {
                      L6: {
                        var16 = th.field_d.a(var15, (byte) -70);
                        var8[var14 + var12] = var16.c(true);
                        var9[var12 + var14] = param3.field_z[var14];
                        if (var9[var12 - -var14] > 0) {
                          break L6;
                        } else {
                          var13 = (char)(var13 + 1);
                          var9[var12 + var14] = (char)var13;
                          break L6;
                        }
                      }
                      var10[var14 + var12] = param3.field_D[var14];
                      var14++;
                      continue L5;
                    }
                  }
                }
              }
            }
            return new ij(0L, param2, param4, param1, var11, var24, var8, var25);
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public final void a(rn param0, int param1) {
        ((bl) this).b(-17444);
        if (param1 != -20626) {
            ((bl) this).field_h = null;
        }
    }

    public final void a(ti param0, int param1) {
        ((bl) this).b(-17444);
        if (param1 != -6509) {
            eh discarded$0 = ((bl) this).b((byte) -51);
        }
    }

    final static boolean d(int param0) {
        oh var1 = null;
        int var2 = 0;
        int var3 = 0;
        oh var4 = null;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        var4 = (oh) (Object) la.field_b.b(12623);
        var1 = var4;
        if (var1 == null) {
          return false;
        } else {
          var2 = param0;
          L0: while (true) {
            if (var2 >= var1.field_s) {
              return true;
            } else {
              L1: {
                if (null != var4.field_n[var2]) {
                  if (-1 != (var4.field_n[var2].field_e ^ -1)) {
                    break L1;
                  } else {
                    return false;
                  }
                } else {
                  break L1;
                }
              }
              if (var4.field_g[var2] != null) {
                if (var4.field_g[var2].field_e == 0) {
                  return false;
                } else {
                  var2++;
                  continue L0;
                }
              } else {
                var2++;
                continue L0;
              }
            }
          }
        }
    }

    public final boolean a(byte param0) {
        if (param0 > -72) {
            ((bl) this).field_h = null;
        }
        return ((bl) this).field_h.j(-28612);
    }

    public static void c(byte param0) {
        int var1 = 48 % ((-29 - param0) / 33);
        field_i = null;
    }

    public final void b(rn param0, int param1) {
        if (param1 < 73) {
            ((bl) this).field_h = null;
        }
    }

    final static void a(kd param0, int param1) {
        pc.field_e.a((sg) (Object) param0);
        if (param1 < 119) {
            Object var3 = null;
            bl.a((kd) null, 64);
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
        Throwable decompiledCaughtException = null;
        String stackOut_3_0 = null;
        Object stackOut_6_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var2_int = ((bl) this).field_h.h(68);
                        var3 = ((bl) this).field_h.g(105);
                        var4 = ((bl) this).field_h.e(param0);
                        var5 = ra.a(-109);
                        if (1890 > var4) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        if (var4 <= -3 + var5) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = tj.a(125, new String[2], af.field_Kb);
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return (String) (Object) stackIn_4_0;
                }
                case 5: {
                    try {
                        if (!tn.a(var3, (byte) 119, var4, var2_int)) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = null;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return (String) (Object) stackIn_7_0;
                }
                case 8: {
                    var2 = (NumberFormatException) (Object) caughtException;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    return gl.field_d;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final eh b(byte param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        eh stackIn_2_0 = null;
        eh stackIn_5_0 = null;
        eh stackIn_11_0 = null;
        Throwable decompiledCaughtException = null;
        eh stackOut_4_0 = null;
        eh stackOut_1_0 = null;
        eh stackOut_10_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var2_int = ((bl) this).field_h.h(69);
                        var3 = ((bl) this).field_h.g(param0 + 134);
                        var4 = ((bl) this).field_h.e(true);
                        var5 = ra.a(-26);
                        if (1890 <= var4) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = ra.field_k;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return (eh) (Object) stackIn_2_0;
                }
                case 3: {
                    try {
                        if (var4 <= -3 + var5) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = ra.field_k;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return (eh) (Object) stackIn_5_0;
                }
                case 6: {
                    try {
                        if (param0 == -66) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var6 = null;
                        ((bl) this).a((rn) null, -112);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (!tn.a(var3, (byte) 115, var4, var2_int)) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = ra.field_k;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return (eh) (Object) stackIn_11_0;
                }
                case 12: {
                    var2 = (NumberFormatException) (Object) caughtException;
                    return ra.field_k;
                }
                case 13: {
                    return nn.field_s;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public bl() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_i = new int[256];
        var1 = 0;
        L0: while (true) {
          if (-257 >= (var1 ^ -1)) {
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if (var2 <= -9) {
                field_i[var1] = var0;
                var1++;
                continue L0;
              } else {
                if (-2 == (1 & var0)) {
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
