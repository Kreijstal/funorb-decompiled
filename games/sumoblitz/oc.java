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
        this.field_b.a(true, true);
    }

    oc(aw param0) {
        super(param0);
    }

    final static void a(ah param0, boolean param1) {
        int fieldTemp$1 = 0;
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
        boolean stackIn_20_0 = false;
        int stackIn_32_0 = 0;
        ah[] stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        ah[] stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_19_0 = false;
        int stackOut_31_0 = 0;
        ah[] stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        ah[] stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              L2: {
                if (db.field_l <= var2_int) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      var11 = aa.field_a[var2_int];
                      if (var11 != null) {
                        break L4;
                      } else {
                        if (var10 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var4 = var11.field_m - -param0.field_m;
                    if (wn.a(var11.field_z, var4, -104, param0.field_C, var11.field_C, param0.field_z)) {
                      L5: {
                        var5 = -var11.field_C + param0.field_C;
                        var6 = param0.field_z + -var11.field_z;
                        if (var5 == 0) {
                          var5 = -1 + (2 & iw.field_b << -973964671);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        if (var6 != 0) {
                          break L6;
                        } else {
                          var6 = ((1 & iw.field_b) << 1213738753) + -1;
                          break L6;
                        }
                      }
                      var7 = (int)Math.round(Math.sqrt((double)((float)var5 * (float)var5 + (float)var6 * (float)var6)));
                      if (var4 <= var7) {
                        break L3;
                      } else {
                        var8 = var5 * (-var7 + var4) / var7;
                        var9 = (var4 + -var7) * var6 / var7;
                        param0.field_C = param0.field_C + var8;
                        param0.field_z = param0.field_z + var9;
                        var11.field_C = var11.field_C - var8;
                        var11.field_z = var11.field_z - var9;
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  var2_int++;
                  if (var10 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              var12 = new cb(is.field_c);
              var3 = (nm) ((Object) var12.b((byte) -80));
              if (!param1) {
                L7: while (true) {
                  L8: {
                    L9: {
                      if (var3 == null) {
                        break L9;
                      } else {
                        var4 = (var3.field_m << 1304536040) + param0.field_m;
                        stackOut_19_0 = wn.a(param0.field_z, var4, -114, var3.field_q, param0.field_C, var3.field_l);
                        stackIn_32_0 = stackOut_19_0 ? 1 : 0;
                        stackIn_20_0 = stackOut_19_0;
                        if (var10 != 0) {
                          break L8;
                        } else {
                          L10: {
                            if (!stackIn_20_0) {
                              break L10;
                            } else {
                              L11: {
                                var5 = -var3.field_q + param0.field_C;
                                if (var5 == 0) {
                                  var5 = -1 + (2 & iw.field_b << -500754367);
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                              L12: {
                                var6 = -var3.field_l + param0.field_z;
                                if (var6 == 0) {
                                  var6 = -1 + ((iw.field_b & 1) << 1095891649);
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                              var7 = (int)Math.round(Math.sqrt((double)((float)var6 * (float)var6 + (float)var5 * (float)var5)));
                              if (var4 > var7) {
                                var8 = var5 * (-var7 + var4) / var7;
                                param0.field_C = param0.field_C + (var8 << 326972737);
                                var9 = (var4 - var7) * var6 / var7;
                                param0.field_z = param0.field_z + (var9 << 1467127937);
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                          }
                          var3 = (nm) ((Object) var12.b(0));
                          if (var10 == 0) {
                            continue L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    stackOut_31_0 = -param0.field_m + param0.field_C;
                    stackIn_32_0 = stackOut_31_0;
                    break L8;
                  }
                  L13: {
                    if (stackIn_32_0 >= 6656) {
                      break L13;
                    } else {
                      param0.field_C = param0.field_C + (26 << 9 - -param0.field_m);
                      break L13;
                    }
                  }
                  L14: {
                    if ((-param0.field_m + param0.field_z ^ -1) > -6657) {
                      param0.field_z = param0.field_z + (26 << param0.field_m + 9);
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (param0.field_m + param0.field_C <= rj.field_c + -26 << 613162376) {
                      break L15;
                    } else {
                      param0.field_C = param0.field_C - (26 << 9 - -param0.field_m);
                      break L15;
                    }
                  }
                  L16: {
                    if (rl.field_k - 26 << 533514344 >= param0.field_m + param0.field_z) {
                      break L16;
                    } else {
                      param0.field_z = param0.field_z - (26 << 9 - -param0.field_m);
                      break L16;
                    }
                  }
                  var4 = 0;
                  L17: while (true) {
                    L18: {
                      L19: {
                        L20: {
                          if (var4 >= db.field_l) {
                            break L20;
                          } else {
                            stackOut_43_0 = aa.field_a;
                            stackOut_43_1 = var4;
                            stackIn_52_0 = stackOut_43_0;
                            stackIn_52_1 = stackOut_43_1;
                            stackIn_44_0 = stackOut_43_0;
                            stackIn_44_1 = stackOut_43_1;
                            if (var10 != 0) {
                              break L19;
                            } else {
                              L21: {
                                if (stackIn_44_0[stackIn_44_1] != null) {
                                  break L21;
                                } else {
                                  if (var4 == 0) {
                                    break L21;
                                  } else {
                                    aa.field_a[var4] = param0;
                                    decompiledRegionSelector0 = 1;
                                    break L0;
                                  }
                                }
                              }
                              var4++;
                              if (var10 == 0) {
                                continue L17;
                              } else {
                                break L20;
                              }
                            }
                          }
                        }
                        if (aa.field_a.length > db.field_l) {
                          fieldTemp$1 = db.field_l;
                          db.field_l = db.field_l + 1;
                          stackOut_51_0 = aa.field_a;
                          stackOut_51_1 = fieldTemp$1;
                          stackIn_52_0 = stackOut_51_0;
                          stackIn_52_1 = stackOut_51_1;
                          break L19;
                        } else {
                          break L18;
                        }
                      }
                      stackIn_52_0[stackIn_52_1] = param0;
                      break L18;
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              } else {
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var2 = decompiledCaughtException;
            stackOut_54_0 = (RuntimeException) (var2);
            stackOut_54_1 = new StringBuilder().append("oc.P(");
            stackIn_56_0 = stackOut_54_0;
            stackIn_56_1 = stackOut_54_1;
            stackIn_55_0 = stackOut_54_0;
            stackIn_55_1 = stackOut_54_1;
            if (param0 == null) {
              stackOut_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackOut_56_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackOut_56_2 = "null";
              stackIn_57_0 = stackOut_56_0;
              stackIn_57_1 = stackOut_56_1;
              stackIn_57_2 = stackOut_56_2;
              break L22;
            } else {
              stackOut_55_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackOut_55_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackOut_55_2 = "{...}";
              stackIn_57_0 = stackOut_55_0;
              stackIn_57_1 = stackOut_55_1;
              stackIn_57_2 = stackOut_55_2;
              break L22;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_57_0), stackIn_57_2 + ',' + param1 + ')');
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

    final static int d(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        boolean stackIn_6_0 = false;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        boolean stackOut_5_0 = false;
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
              L3: {
                if (var2 >= 25) {
                  stackOut_10_0 = var1_int;
                  stackIn_11_0 = stackOut_10_0;
                  break L3;
                } else {
                  stackOut_5_0 = wm.field_f[var2];
                  stackIn_11_0 = stackOut_5_0 ? 1 : 0;
                  stackIn_6_0 = stackOut_5_0;
                  if (var3 != 0) {
                    break L3;
                  } else {
                    L4: {
                      if (stackIn_6_0) {
                        var1_int++;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var2++;
                    continue L2;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1), "oc.N(" + param0 + ')');
        }
        return stackIn_11_0;
    }

    final static void a(String param0, boolean param1, byte param2) {
        try {
            lc.field_A = true;
            int var3_int = -70 % ((param2 - -39) / 44);
            ih.field_c = param1 ? true : false;
            hc.field_c = new gt(rf.field_a, tq.field_a, param0, pg.field_a, ih.field_c);
            rf.field_a.a((byte) 108, hc.field_c);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "oc.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void c(boolean param0) {
        this.field_b.a(param0, true);
    }

    final boolean b(byte param0) {
        if (param0 > -8) {
            ah var3 = (ah) null;
            oc.a((ah) null, false);
        }
        return true;
    }

    final static boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6) {
        int discarded$2 = 0;
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param1 == 122) {
            break L0;
          } else {
            discarded$2 = oc.d(-55);
            break L0;
          }
        }
        L1: {
          L2: {
            if (param3 > param2) {
              break L2;
            } else {
              if (param2 >= param6 + param3) {
                break L2;
              } else {
                if (param5 < param0) {
                  break L2;
                } else {
                  if (param4 + param0 <= param5) {
                    break L2;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_7_0 = 0;
          stackIn_8_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_8_0 != 0;
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
        if (!param2) {
            String var8 = (String) null;
            oc.a((String) null, false, (byte) 69);
        }
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
        boolean discarded$1 = false;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        var6 = new char[param0];
        var3 = var6;
        var4 = 0;
        L0: while (true) {
          L1: {
            if (param0 <= var4) {
              if (param2 == -1) {
                break L1;
              } else {
                discarded$1 = oc.a(-114, (byte) 68, -4, 84, 1, -123, 101);
                break L1;
              }
            } else {
              var6[var4] = param1;
              var4++;
              if (var5 != 0) {
                break L1;
              } else {
                continue L0;
              }
            }
          }
          return new String(var6);
        }
    }

    final void a(int param0, int param1, ed param2) {
        try {
            this.field_b.a(param2, 106);
            if (param1 != 18834) {
                field_f = -50;
            }
            this.field_b.h(109, param0);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "oc.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, byte param1) {
        if (param1 > -71) {
            field_g = 53L;
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param0 != 34023) {
            String var5 = (String) null;
            oc.a((String) null, false, (byte) -121);
        }
    }

    static {
        field_e = 1000;
    }
}
