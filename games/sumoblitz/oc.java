/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc extends rq {
    static int field_f;
    static int field_e;
    static long field_g;

    final void a(boolean param0, int param1) {
        if (param1 != 20186) {
            return;
        }
        ((oc) this).field_b.a(true, true);
    }

    oc(aw param0) {
        super(param0);
    }

    final static void a(ah param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        nm var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ah var11 = null;
        cb var12 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (db.field_l <= var2_int) {
                var12 = new cb(is.field_c);
                var3 = (nm) (Object) var12.b((byte) -80);
                L2: while (true) {
                  if (var3 == null) {
                    L3: {
                      if (-param0.field_m + param0.field_C >= 6656) {
                        break L3;
                      } else {
                        param0.field_C = param0.field_C + (26 << 9 - -param0.field_m);
                        break L3;
                      }
                    }
                    L4: {
                      if (-param0.field_m + param0.field_z < 6656) {
                        param0.field_z = param0.field_z + (26 << param0.field_m + 9);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (param0.field_m + param0.field_C <= rj.field_c + -26 << 8) {
                        break L5;
                      } else {
                        param0.field_C = param0.field_C - (26 << 9 - -param0.field_m);
                        break L5;
                      }
                    }
                    L6: {
                      if (rl.field_k - 26 << 8 >= param0.field_m + param0.field_z) {
                        break L6;
                      } else {
                        param0.field_z = param0.field_z - (26 << 9 - -param0.field_m);
                        break L6;
                      }
                    }
                    var4 = 0;
                    L7: while (true) {
                      if (var4 >= db.field_l) {
                        L8: {
                          if (aa.field_a.length > db.field_l) {
                            int fieldTemp$1 = db.field_l;
                            db.field_l = db.field_l + 1;
                            aa.field_a[fieldTemp$1] = param0;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        break L0;
                      } else {
                        L9: {
                          if (aa.field_a[var4] != null) {
                            break L9;
                          } else {
                            if (var4 == 0) {
                              break L9;
                            } else {
                              aa.field_a[var4] = param0;
                              return;
                            }
                          }
                        }
                        var4++;
                        continue L7;
                      }
                    }
                  } else {
                    L10: {
                      var4 = (var3.field_m << 8) + param0.field_m;
                      if (!wn.a(param0.field_z, var4, -114, var3.field_q, param0.field_C, var3.field_l)) {
                        break L10;
                      } else {
                        L11: {
                          var5 = -var3.field_q + param0.field_C;
                          if (var5 == 0) {
                            var5 = -1 + (2 & iw.field_b << 1);
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        L12: {
                          var6 = -var3.field_l + param0.field_z;
                          if (var6 == 0) {
                            var6 = -1 + ((iw.field_b & 1) << 1);
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        var7 = (int)Math.round(Math.sqrt((double)((float)var6 * (float)var6 + (float)var5 * (float)var5)));
                        if (var4 > var7) {
                          var8 = var5 * (-var7 + var4) / var7;
                          param0.field_C = param0.field_C + (var8 << 1);
                          var9 = (var4 - var7) * var6 / var7;
                          param0.field_z = param0.field_z + (var9 << 1);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                    }
                    var3 = (nm) (Object) var12.b(0);
                    continue L2;
                  }
                }
              } else {
                L13: {
                  var11 = aa.field_a[var2_int];
                  if (var11 != null) {
                    var4 = var11.field_m - -param0.field_m;
                    if (wn.a(var11.field_z, var4, -104, param0.field_C, var11.field_C, param0.field_z)) {
                      L14: {
                        var5 = -var11.field_C + param0.field_C;
                        var6 = param0.field_z + -var11.field_z;
                        if (var5 == 0) {
                          var5 = -1 + (2 & iw.field_b << 1);
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      L15: {
                        if (var6 != 0) {
                          break L15;
                        } else {
                          var6 = ((1 & iw.field_b) << 1) + -1;
                          break L15;
                        }
                      }
                      L16: {
                        var7 = (int)Math.round(Math.sqrt((double)((float)var5 * (float)var5 + (float)var6 * (float)var6)));
                        if (var4 <= var7) {
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                      var2_int++;
                      continue L1;
                    } else {
                      break L13;
                    }
                  } else {
                    break L13;
                  }
                }
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var2 = decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) var2;
            stackOut_50_1 = new StringBuilder().append("oc.P(");
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param0 == null) {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L17;
            } else {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L17;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_53_0, stackIn_53_2 + ',' + false + ')');
        }
    }

    final static int d(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = 0;
              if (param0 == 17079) {
                break L1;
              } else {
                field_f = -57;
                break L1;
              }
            }
            var2 = 0;
            L2: while (true) {
              if (var2 >= 25) {
                stackOut_9_0 = var1_int;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                L3: {
                  if (wm.field_f[var2]) {
                    var1_int++;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var2++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var1, "oc.N(" + param0 + ')');
        }
        return stackIn_10_0;
    }

    final static void a(String param0, boolean param1, byte param2) {
        try {
            lc.field_A = true;
            int var3_int = -70 % ((param2 - -39) / 44);
            ih.field_c = param1 ? true : false;
            hc.field_c = new gt(rf.field_a, tq.field_a, param0, pg.field_a, ih.field_c);
            rf.field_a.a((byte) 108, (pk) (Object) hc.field_c);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "oc.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void c(boolean param0) {
        ((oc) this).field_b.a(param0, true);
    }

    final boolean b(byte param0) {
        if (param0 > -8) {
            int discarded$0 = 0;
            oc.a((ah) null);
        }
        return true;
    }

    final static boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            if (param3 > param2) {
              break L1;
            } else {
              if (param2 >= param6 + param3) {
                break L1;
              } else {
                if (param5 < param0) {
                  break L1;
                } else {
                  if (param4 + param0 <= param5) {
                    break L1;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L0;
                  }
                }
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_6_0 != 0;
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        pn.field_p[se.field_d] = param3;
        pd.field_q[se.field_d] = se.field_d;
        lj.field_a[se.field_d] = param5;
        if (!(param5 >= qu.field_k)) {
            ab.field_c = param5;
        }
        if (!(kc.field_l >= param5)) {
            field_f = param5;
        }
        jf.field_f[se.field_d] = param1;
        ic.field_c[se.field_d] = param4;
        vi.field_z[se.field_d] = param0;
        int var6 = param0 + param4 + param1;
        int var7 = 0 != var6 ? 1000 * param1 / var6 : 0;
        uc.field_c[se.field_d] = var7;
        se.field_d = se.field_d + 1;
        if (ab.field_c > var7) {
            ab.field_c = var7;
        }
        if (var7 > field_f) {
            field_f = var7;
        }
    }

    final static String a(int param0, char param1, int param2) {
        int var4 = 0;
        int var5 = Sumoblitz.field_L ? 1 : 0;
        char[] var6 = new char[param0];
        char[] var3 = var6;
        for (var4 = 0; param0 > var4; var4++) {
            var6[var4] = '*';
        }
        return new String(var3);
    }

    final void a(int param0, int param1, ed param2) {
        try {
            ((oc) this).field_b.a(param2, 106);
            if (param1 != 18834) {
                field_f = -50;
            }
            ((oc) this).field_b.h(109, param0);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "oc.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, byte param1) {
        if (param1 > -71) {
            field_g = 53L;
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param0 != 34023) {
            Object var5 = null;
            oc.a((String) null, false, (byte) -121);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 1000;
    }
}
