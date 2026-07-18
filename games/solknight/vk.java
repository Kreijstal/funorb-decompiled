/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk extends jf {
    private int field_d;
    static o[] field_i;
    static char[] field_e;
    private int field_h;
    private String field_k;
    static int field_m;
    static int field_g;
    static int field_p;
    private int field_n;
    private int field_o;
    private int field_f;
    private boolean field_j;
    private mg field_l;

    final void a(mg param0, byte param1, int param2, int param3, String param4) {
        le var7 = null;
        if (param4 == null) {
            ((vk) this).field_c = null;
            return;
        }
        int var6_int = 118 / ((-3 - param1) / 61);
        if (param0 == ((vk) this).field_l) {
            if (((vk) this).field_j) {
                if (((vk) this).field_h == 0) {
                    if (null != ((vk) this).field_k) {
                        if (((vk) this).field_k.equals((Object) (Object) param4)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((vk) this).field_j = true;
            ((vk) this).field_k = param4;
            ((vk) this).field_h = 0;
            ((vk) this).field_l = param0;
            var7 = this.a(param0, param4, param3, (byte) 125);
            var7.field_c[0] = param2;
            var7.field_c[param4.length()] = param0.b(param4) + param2;
            lc.a(123, 0, param4, var7, param0);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "vk.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, mg param3, String param4) {
        le var8 = null;
        int var7 = 0;
        if (!(param4 != null)) {
            ((vk) this).field_c = null;
            return;
        }
        if (param3 == ((vk) this).field_l) {
            if (((vk) this).field_j) {
                if (((vk) this).field_h == 1) {
                    if (null != ((vk) this).field_k) {
                        if (!(!((vk) this).field_k.equals((Object) (Object) param4))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((vk) this).field_l = param3;
            ((vk) this).field_h = 1;
            ((vk) this).field_j = true;
            var8 = this.a(param3, param4, param2, (byte) 127);
            var7 = param3.b(param4);
            var8.field_c[0] = -(var7 >> 1) + param0;
            var8.field_c[param4.length()] = (var7 >> 1) + param0;
            lc.a(125, param1, param4, var8, param3);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "vk.O(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, mg param1, int param2, String param3, int param4) {
        le var8 = null;
        le var9 = null;
        if (!(param3 != null)) {
            ((vk) this).field_c = null;
            return;
        }
        if (((vk) this).field_l == param1) {
            if (((vk) this).field_j) {
                if (((vk) this).field_h == 2) {
                    if (((vk) this).field_k != null) {
                        if (((vk) this).field_k.equals((Object) (Object) param3)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((vk) this).field_j = true;
            ((vk) this).field_k = param3;
            ((vk) this).field_l = param1;
            ((vk) this).field_h = 2;
            var8 = this.a(param1, param3, param2, (byte) 127);
            var9 = var8;
            var9.field_c[0] = param4 - param1.b(param3);
            if (param0 != -13323) {
                ((vk) this).field_d = -67;
            }
            var9.field_c[param3.length()] = param4;
            lc.a(113, 0, param3, var9, param1);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "vk.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    private final le a(mg param0, String param1, int param2, byte param3) {
        le var5 = null;
        RuntimeException var5_ref = null;
        le var6 = null;
        Object stackIn_2_0 = null;
        le stackIn_4_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        le stackOut_3_0 = null;
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
        try {
          L0: {
            if (param3 > 121) {
              var6 = new le(param2 + -param0.field_F, param2 - -param0.field_s, param1.length());
              var5 = var6;
              ((vk) this).field_c = new le[]{var6};
              stackOut_3_0 = (le) var5;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (le) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5_ref;
            stackOut_5_1 = new StringBuilder().append("vk.N(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_4_0;
    }

    final static void b(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        rb var4_ref_rb = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = -16000;
              var2 = -7680;
              var3 = ud.field_k;
              if (kf.field_G == null) {
                break L1;
              } else {
                var5 = kf.field_G.length + -1;
                L2: while (true) {
                  if (var5 <= 0) {
                    var5 = 0;
                    if (kf.field_G.length <= var5) {
                      break L1;
                    } else {
                      L3: {
                        if (kf.field_G[var5] == null) {
                          var5++;
                          break L3;
                        } else {
                          kf.field_G[var5] = kf.field_G[var5].b(15);
                          var5++;
                          break L3;
                        }
                      }
                      var5++;
                      var5++;
                      break L1;
                    }
                  } else {
                    if (null == kf.field_G[var5]) {
                      var5--;
                      var5--;
                      continue L2;
                    } else {
                      if (kf.field_G[var5].field_j < 25) {
                        var5--;
                        var5--;
                        continue L2;
                      } else {
                        if (kf.field_G[var5].field_j == 31) {
                          var5--;
                          continue L2;
                        } else {
                          L4: {
                            if (Math.abs(kf.field_G[var5].field_a) - -Math.abs(-7680 + kf.field_G[var5].field_b) >= Math.abs(var1_int) + Math.abs(var2 - 7680)) {
                              break L4;
                            } else {
                              if (kf.field_G[var5].field_b >= 7040) {
                                break L4;
                              } else {
                                var1_int = kf.field_G[var5].field_c * 15 + kf.field_G[var5].field_a;
                                var2 = kf.field_G[var5].field_d * 15 + kf.field_G[var5].field_b;
                                break L4;
                              }
                            }
                          }
                          L5: {
                            if (null == kf.field_G[-1 + var5]) {
                              break L5;
                            } else {
                              if (kf.field_G[-1 + var5].field_j < 25) {
                                break L5;
                              } else {
                                if (31 != kf.field_G[var5 + -1].field_j) {
                                  var5--;
                                  continue L2;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                          var4_ref_rb = kf.field_G[var5];
                          kf.field_G[var5] = kf.field_G[-1 + var5];
                          kf.field_G[var5 - 1] = var4_ref_rb;
                          var5--;
                          continue L2;
                        }
                      }
                    }
                  }
                }
              }
            }
            L6: {
              if (-16000 == var1_int) {
                var1_int = 0;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (0 <= ve.field_b) {
                ic.field_t = ic.field_t - (lc.field_h >>> 17) * ud.field_k;
                bi.field_i = bi.field_i - ud.field_k;
                ud.field_k = 0;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (~ud.field_k >= ~qh.field_a[7]) {
                break L8;
              } else {
                var4 = ud.field_k + -qh.field_a[7];
                ic.field_t = ic.field_t - (lc.field_h >>> 17) * var4;
                bi.field_i = bi.field_i - var4;
                ud.field_k = qh.field_a[7];
                break L8;
              }
            }
            L9: {
              wg.field_e = (wg.field_e * 9 + var2) / 10;
              sk.field_o = (sk.field_o * 9 - -var1_int) / 10;
              if (qh.field_a[7] / 10 <= var3) {
                break L9;
              } else {
                if (~ud.field_k <= ~(qh.field_a[7] / 10)) {
                  vk.a(250, (byte) 89, 5);
                  break L9;
                } else {
                  break L9;
                }
              }
            }
            L10: {
              if (var3 >= qh.field_a[7] * 3 / 10) {
                break L10;
              } else {
                if (~ud.field_k <= ~(qh.field_a[7] * 3 / 10)) {
                  vk.a(249, (byte) 89, 6);
                  break L10;
                } else {
                  break L10;
                }
              }
            }
            L11: {
              if (~(6 * qh.field_a[7] / 10) >= ~var3) {
                break L11;
              } else {
                if (~(qh.field_a[7] * 6 / 10) < ~ud.field_k) {
                  break L11;
                } else {
                  vk.a(248, (byte) 89, 7);
                  break L11;
                }
              }
            }
            L12: {
              if (~var3 <= ~qh.field_a[7]) {
                break L12;
              } else {
                if (~ud.field_k <= ~qh.field_a[7]) {
                  vk.a(247, (byte) 89, 8);
                  break L12;
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fc.a((Throwable) (Object) var1, "vk.J(" + -126 + ')');
        }
    }

    public static void c(int param0) {
        field_e = null;
        field_i = null;
    }

    final static void a(int param0, byte param1, int param2) {
        int var3 = 0;
        var3 = 1 << param2;
        if ((ah.field_f & var3) == 0) {
          ah.field_f = ah.field_f | var3;
          jl.field_d = jl.field_d | var3;
          lc.field_t.a((gg) (Object) new la(param2), -7044);
          if (oa.field_n) {
            return;
          } else {
            w.field_a.a((gg) (Object) new bl(param2, param0, bi.field_i, ic.field_t, lc.field_h, lk.field_e), -7044);
            return;
          }
        } else {
          return;
        }
    }

    final void a(String param0, int param1, int param2, int param3, mg param4, int param5, int param6, int param7) {
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        le var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        le stackIn_37_0 = null;
        le stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        le stackIn_38_0 = null;
        le stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        le stackIn_39_0 = null;
        le stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        int stackIn_39_3 = 0;
        int stackIn_39_4 = 0;
        int stackIn_41_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        le stackOut_36_0 = null;
        le stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        le stackOut_38_0 = null;
        le stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        int stackOut_38_3 = 0;
        int stackOut_38_4 = 0;
        le stackOut_37_0 = null;
        le stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        int stackOut_37_3 = 0;
        int stackOut_37_4 = 0;
        int stackOut_40_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        var15 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 == param1) {
                param1 = param4.field_x;
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 == null) {
              ((vk) this).field_c = null;
              return;
            } else {
              L2: {
                if (param4 != ((vk) this).field_l) {
                  break L2;
                } else {
                  if (((vk) this).field_j) {
                    break L2;
                  } else {
                    if (param2 != ((vk) this).field_h) {
                      break L2;
                    } else {
                      if (~((vk) this).field_f != ~param7) {
                        break L2;
                      } else {
                        if (~((vk) this).field_o != ~param1) {
                          break L2;
                        } else {
                          if (~param6 != ~((vk) this).field_n) {
                            break L2;
                          } else {
                            if (~param5 != ~((vk) this).field_d) {
                              break L2;
                            } else {
                              if (((vk) this).field_k == null) {
                                break L2;
                              } else {
                                if (!((vk) this).field_k.equals((Object) (Object) param0)) {
                                  break L2;
                                } else {
                                  return;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              L3: {
                ((vk) this).field_d = param5;
                ((vk) this).field_k = param0;
                ((vk) this).field_h = param2;
                ((vk) this).field_n = param6;
                ((vk) this).field_l = param4;
                if (param3 > 36) {
                  break L3;
                } else {
                  ((vk) this).field_l = null;
                  break L3;
                }
              }
              L4: {
                ((vk) this).field_f = param7;
                ((vk) this).field_j = false;
                ((vk) this).field_o = param1;
                var16 = new String[param4.b(param0, param5) + 1];
                var17 = var16;
                var10 = Math.max(1, param4.a(param0, new int[1], var17));
                if (((vk) this).field_f != 3) {
                  break L4;
                } else {
                  if (var10 != 1) {
                    break L4;
                  } else {
                    ((vk) this).field_f = 1;
                    break L4;
                  }
                }
              }
              L5: {
                if (((vk) this).field_f == 0) {
                  var11 = param4.field_F;
                  break L5;
                } else {
                  if (((vk) this).field_f == 1) {
                    var11 = param4.field_F - -(-(var10 * ((vk) this).field_o) + ((vk) this).field_n >> 1);
                    break L5;
                  } else {
                    if (((vk) this).field_f == 2) {
                      var11 = -param4.field_s + (((vk) this).field_n + -(var10 * ((vk) this).field_o));
                      break L5;
                    } else {
                      L6: {
                        var12 = (-(((vk) this).field_o * var10) + ((vk) this).field_n) / (var10 + 1);
                        if (var12 < 0) {
                          var12 = 0;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      ((vk) this).field_o = ((vk) this).field_o + var12;
                      var11 = var12 + param4.field_F;
                      break L5;
                    }
                  }
                }
              }
              ((vk) this).field_c = new le[var10];
              var12 = 0;
              L7: while (true) {
                if (~var10 >= ~var12) {
                  break L0;
                } else {
                  L8: {
                    var13 = var16[var12];
                    stackOut_36_0 = null;
                    stackOut_36_1 = null;
                    stackOut_36_2 = var11 - param4.field_F;
                    stackOut_36_3 = param4.field_s + var11;
                    stackIn_38_0 = stackOut_36_0;
                    stackIn_38_1 = stackOut_36_1;
                    stackIn_38_2 = stackOut_36_2;
                    stackIn_38_3 = stackOut_36_3;
                    stackIn_37_0 = stackOut_36_0;
                    stackIn_37_1 = stackOut_36_1;
                    stackIn_37_2 = stackOut_36_2;
                    stackIn_37_3 = stackOut_36_3;
                    if (var13 == null) {
                      stackOut_38_0 = null;
                      stackOut_38_1 = null;
                      stackOut_38_2 = stackIn_38_2;
                      stackOut_38_3 = stackIn_38_3;
                      stackOut_38_4 = 0;
                      stackIn_39_0 = stackOut_38_0;
                      stackIn_39_1 = stackOut_38_1;
                      stackIn_39_2 = stackOut_38_2;
                      stackIn_39_3 = stackOut_38_3;
                      stackIn_39_4 = stackOut_38_4;
                      break L8;
                    } else {
                      stackOut_37_0 = null;
                      stackOut_37_1 = null;
                      stackOut_37_2 = stackIn_37_2;
                      stackOut_37_3 = stackIn_37_3;
                      stackOut_37_4 = var13.length();
                      stackIn_39_0 = stackOut_37_0;
                      stackIn_39_1 = stackOut_37_1;
                      stackIn_39_2 = stackOut_37_2;
                      stackIn_39_3 = stackOut_37_3;
                      stackIn_39_4 = stackOut_37_4;
                      break L8;
                    }
                  }
                  L9: {
                    var14 = new le(stackIn_39_2, stackIn_39_3, stackIn_39_4);
                    var14.field_c[0] = 0;
                    if (var13 == null) {
                      break L9;
                    } else {
                      L10: {
                        var14.field_c[var13.length()] = param4.b(var13);
                        stackOut_40_0 = 114;
                        stackIn_42_0 = stackOut_40_0;
                        stackIn_41_0 = stackOut_40_0;
                        if (param2 != 3) {
                          stackOut_42_0 = stackIn_42_0;
                          stackOut_42_1 = 0;
                          stackIn_43_0 = stackOut_42_0;
                          stackIn_43_1 = stackOut_42_1;
                          break L10;
                        } else {
                          stackOut_41_0 = stackIn_41_0;
                          stackOut_41_1 = ((vk) this).a(param4.b(var13), param5, 21107, var13);
                          stackIn_43_0 = stackOut_41_0;
                          stackIn_43_1 = stackOut_41_1;
                          break L10;
                        }
                      }
                      lc.a(stackIn_43_0, stackIn_43_1, var13, var14, param4);
                      break L9;
                    }
                  }
                  var11 = var11 + param1;
                  ((vk) this).field_c[var12] = var14;
                  var12++;
                  continue L7;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var9 = decompiledCaughtException;
            stackOut_46_0 = (RuntimeException) var9;
            stackOut_46_1 = new StringBuilder().append("vk.M(");
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param0 == null) {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L11;
            } else {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "{...}";
              stackIn_49_0 = stackOut_47_0;
              stackIn_49_1 = stackOut_47_1;
              stackIn_49_2 = stackOut_47_2;
              break L11;
            }
          }
          L12: {
            stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
            stackOut_49_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param4 == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L12;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L12;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_52_0, stackIn_52_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public vk() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new char[]{'€', ' ', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', ' ', 'Ž', ' ', ' ', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', ' ', 'ž', 'Ÿ'};
    }
}
