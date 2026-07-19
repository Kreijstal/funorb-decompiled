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
            this.field_c = null;
            return;
        }
        int var6_int = 118 / ((-3 - param1) / 61);
        if (param0 == this.field_l) {
            if (this.field_j) {
                if (-1 == (this.field_h ^ -1)) {
                    if (null != this.field_k) {
                        if (this.field_k.equals(param4)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            this.field_j = true;
            this.field_k = param4;
            this.field_h = 0;
            this.field_l = param0;
            var7 = this.a(param0, param4, param3, (byte) 125);
            var7.field_c[0] = param2;
            var7.field_c[param4.length()] = param0.b(param4) + param2;
            lc.a(123, 0, param4, var7, param0);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "vk.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, mg param3, String param4) {
        le var8 = null;
        int var7 = 0;
        if (!(param4 != null)) {
            this.field_c = null;
            return;
        }
        if (param3 == this.field_l) {
            if (this.field_j) {
                if ((this.field_h ^ -1) == -2) {
                    if (null != this.field_k) {
                        if (!(!this.field_k.equals(param4))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            this.field_l = param3;
            this.field_h = 1;
            this.field_j = true;
            var8 = this.a(param3, param4, param2, (byte) 127);
            var7 = param3.b(param4);
            var8.field_c[0] = -(var7 >> -1161140319) + param0;
            var8.field_c[param4.length()] = (var7 >> -1664397695) + param0;
            lc.a(125, param1, param4, var8, param3);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "vk.O(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, mg param1, int param2, String param3, int param4) {
        le var8 = null;
        le var9 = null;
        if (!(param3 != null)) {
            this.field_c = null;
            return;
        }
        if (this.field_l == param1) {
            if (this.field_j) {
                if (-3 == (this.field_h ^ -1)) {
                    if (this.field_k != null) {
                        if (this.field_k.equals(param3)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            this.field_j = true;
            this.field_k = param3;
            this.field_l = param1;
            this.field_h = 2;
            var8 = this.a(param1, param3, param2, (byte) 127);
            var9 = var8;
            var9.field_c[0] = param4 - param1.b(param3);
            if (param0 != -13323) {
                this.field_d = -67;
            }
            var9.field_c[param3.length()] = param4;
            lc.a(113, 0, param3, var9, param1);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "vk.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    private final le a(mg param0, String param1, int param2, byte param3) {
        le var5 = null;
        RuntimeException var5_ref = null;
        le var6 = null;
        le stackIn_2_0 = null;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        le stackOut_3_0 = null;
        le stackOut_1_0 = null;
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
              this.field_c = new le[]{var6};
              stackOut_3_0 = (le) (var5);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (le) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var5_ref);
            stackOut_5_1 = new StringBuilder().append("vk.N(");
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
          throw fc.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
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
              if (param0 < -116) {
                break L1;
              } else {
                field_e = (char[]) null;
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  var1_int = -16000;
                  var2 = -7680;
                  var3 = ud.field_k;
                  if (kf.field_G == null) {
                    break L4;
                  } else {
                    var5 = kf.field_G.length + -1;
                    L5: while (true) {
                      L6: {
                        L7: {
                          if (var5 <= 0) {
                            break L7;
                          } else {
                            if (var6 != 0) {
                              break L6;
                            } else {
                              L8: {
                                if (null == kf.field_G[var5]) {
                                  break L8;
                                } else {
                                  if ((kf.field_G[var5].field_j ^ -1) > -26) {
                                    break L8;
                                  } else {
                                    if (-32 == (kf.field_G[var5].field_j ^ -1)) {
                                      break L8;
                                    } else {
                                      L9: {
                                        if (Math.abs(kf.field_G[var5].field_a) - -Math.abs(-7680 + kf.field_G[var5].field_b) >= Math.abs(var1_int) + Math.abs(var2 - 7680)) {
                                          break L9;
                                        } else {
                                          if (kf.field_G[var5].field_b >= 7040) {
                                            break L9;
                                          } else {
                                            var1_int = kf.field_G[var5].field_c * 15 + kf.field_G[var5].field_a;
                                            var2 = kf.field_G[var5].field_d * 15 + kf.field_G[var5].field_b;
                                            break L9;
                                          }
                                        }
                                      }
                                      L10: {
                                        if (null == kf.field_G[-1 + var5]) {
                                          break L10;
                                        } else {
                                          if ((kf.field_G[-1 + var5].field_j ^ -1) > -26) {
                                            break L10;
                                          } else {
                                            if (31 != kf.field_G[var5 + -1].field_j) {
                                              break L8;
                                            } else {
                                              break L10;
                                            }
                                          }
                                        }
                                      }
                                      var4_ref_rb = kf.field_G[var5];
                                      kf.field_G[var5] = kf.field_G[-1 + var5];
                                      kf.field_G[var5 - 1] = var4_ref_rb;
                                      break L8;
                                    }
                                  }
                                }
                              }
                              var5--;
                              if (var6 == 0) {
                                continue L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        var5 = 0;
                        break L6;
                      }
                      L11: while (true) {
                        if (kf.field_G.length <= var5) {
                          break L4;
                        } else {
                          if (var6 != 0) {
                            break L3;
                          } else {
                            L12: {
                              if (kf.field_G[var5] == null) {
                                break L12;
                              } else {
                                kf.field_G[var5] = kf.field_G[var5].b(15);
                                break L12;
                              }
                            }
                            var5++;
                            if (var6 == 0) {
                              continue L11;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                if (-16000 == var1_int) {
                  break L3;
                } else {
                  break L2;
                }
              }
              var1_int = 0;
              break L2;
            }
            L13: {
              if (0 <= ve.field_b) {
                ic.field_t = ic.field_t - (lc.field_h >>> 1363236177) * ud.field_k;
                bi.field_i = bi.field_i - ud.field_k;
                ud.field_k = 0;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (ud.field_k <= qh.field_a[7]) {
                break L14;
              } else {
                var4 = ud.field_k + -qh.field_a[7];
                ic.field_t = ic.field_t - (lc.field_h >>> -418187375) * var4;
                bi.field_i = bi.field_i - var4;
                ud.field_k = qh.field_a[7];
                break L14;
              }
            }
            L15: {
              wg.field_e = (wg.field_e * 9 + var2) / 10;
              sk.field_o = (sk.field_o * 9 - -var1_int) / 10;
              if (1 * qh.field_a[7] / 10 <= var3) {
                break L15;
              } else {
                if (ud.field_k >= qh.field_a[7] * 1 / 10) {
                  vk.a(250, (byte) 89, 5);
                  break L15;
                } else {
                  break L15;
                }
              }
            }
            L16: {
              if (var3 >= qh.field_a[7] * 3 / 10) {
                break L16;
              } else {
                if (ud.field_k >= qh.field_a[7] * 3 / 10) {
                  vk.a(249, (byte) 89, 6);
                  break L16;
                } else {
                  break L16;
                }
              }
            }
            L17: {
              if (6 * qh.field_a[7] / 10 <= var3) {
                break L17;
              } else {
                if (qh.field_a[7] * 6 / 10 > ud.field_k) {
                  break L17;
                } else {
                  vk.a(248, (byte) 89, 7);
                  break L17;
                }
              }
            }
            L18: {
              if (var3 >= qh.field_a[7]) {
                break L18;
              } else {
                if (ud.field_k >= qh.field_a[7]) {
                  vk.a(247, (byte) 89, 8);
                  break L18;
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
          throw fc.a((Throwable) ((Object) var1), "vk.J(" + param0 + ')');
        }
    }

    public static void c(int param0) {
        if (param0 != -14275) {
            field_g = 28;
            field_e = null;
            field_i = null;
            return;
        }
        field_e = null;
        field_i = null;
    }

    final static void a(int param0, byte param1, int param2) {
        int var3 = 0;
        var3 = 1 << param2;
        if ((ah.field_f & var3) == 0) {
          ah.field_f = ah.field_f | var3;
          jl.field_d = jl.field_d | var3;
          lc.field_t.a(new la(param2), -7044);
          if (oa.field_n) {
            if (param1 == 89) {
              return;
            } else {
              vk.b((byte) 46);
              return;
            }
          } else {
            w.field_a.a(new bl(param2, param0, bi.field_i, ic.field_t, lc.field_h, lk.field_e), -7044);
            if (param1 == 89) {
              return;
            } else {
              vk.b((byte) 46);
              return;
            }
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
        le stackIn_38_0 = null;
        le stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        le stackIn_39_0 = null;
        le stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        int stackIn_39_3 = 0;
        le stackIn_40_0 = null;
        le stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        int stackIn_40_3 = 0;
        int stackIn_40_4 = 0;
        int stackIn_42_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        le stackOut_37_0 = null;
        le stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        int stackOut_37_3 = 0;
        le stackOut_39_0 = null;
        le stackOut_39_1 = null;
        int stackOut_39_2 = 0;
        int stackOut_39_3 = 0;
        int stackOut_39_4 = 0;
        le stackOut_38_0 = null;
        le stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        int stackOut_38_3 = 0;
        int stackOut_38_4 = 0;
        int stackOut_41_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_43_1 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
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
              this.field_c = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (param4 != this.field_l) {
                  break L2;
                } else {
                  if (this.field_j) {
                    break L2;
                  } else {
                    if (param2 != this.field_h) {
                      break L2;
                    } else {
                      if (this.field_f != param7) {
                        break L2;
                      } else {
                        if (this.field_o != param1) {
                          break L2;
                        } else {
                          if (param6 != this.field_n) {
                            break L2;
                          } else {
                            if (param5 != this.field_d) {
                              break L2;
                            } else {
                              if (this.field_k == null) {
                                break L2;
                              } else {
                                if (!this.field_k.equals(param0)) {
                                  break L2;
                                } else {
                                  decompiledRegionSelector0 = 1;
                                  break L0;
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
                this.field_d = param5;
                this.field_k = param0;
                this.field_h = param2;
                this.field_n = param6;
                this.field_l = param4;
                if (param3 > 36) {
                  break L3;
                } else {
                  this.field_l = (mg) null;
                  break L3;
                }
              }
              L4: {
                this.field_f = param7;
                this.field_j = false;
                this.field_o = param1;
                var16 = new String[param4.b(param0, param5) + 1];
                var17 = var16;
                var10 = Math.max(1, param4.a(param0, new int[]{param5}, var17));
                if (this.field_f != 3) {
                  break L4;
                } else {
                  if (-2 != (var10 ^ -1)) {
                    break L4;
                  } else {
                    this.field_f = 1;
                    break L4;
                  }
                }
              }
              L5: {
                L6: {
                  if (this.field_f == 0) {
                    break L6;
                  } else {
                    L7: {
                      if (-2 == (this.field_f ^ -1)) {
                        break L7;
                      } else {
                        L8: {
                          if (this.field_f == 2) {
                            break L8;
                          } else {
                            L9: {
                              var12 = (-(this.field_o * var10) + this.field_n) / (var10 + 1);
                              if ((var12 ^ -1) > -1) {
                                var12 = 0;
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            this.field_o = this.field_o + var12;
                            var11 = var12 + param4.field_F;
                            if (var15 == 0) {
                              break L5;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var11 = -param4.field_s + (this.field_n + -(var10 * this.field_o));
                        if (var15 == 0) {
                          break L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var11 = param4.field_F - -(-(var10 * this.field_o) + this.field_n >> 1225931425);
                    if (var15 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                var11 = param4.field_F;
                break L5;
              }
              this.field_c = new le[var10];
              var12 = 0;
              L10: while (true) {
                if (var10 <= var12) {
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var13 = var16[var12];
                  if (var15 != 0) {
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L11: {
                      stackOut_37_0 = null;
                      stackOut_37_1 = null;
                      stackOut_37_2 = var11 - param4.field_F;
                      stackOut_37_3 = param4.field_s + var11;
                      stackIn_39_0 = stackOut_37_0;
                      stackIn_39_1 = stackOut_37_1;
                      stackIn_39_2 = stackOut_37_2;
                      stackIn_39_3 = stackOut_37_3;
                      stackIn_38_0 = stackOut_37_0;
                      stackIn_38_1 = stackOut_37_1;
                      stackIn_38_2 = stackOut_37_2;
                      stackIn_38_3 = stackOut_37_3;
                      if (var13 == null) {
                        stackOut_39_0 = null;
                        stackOut_39_1 = null;
                        stackOut_39_2 = stackIn_39_2;
                        stackOut_39_3 = stackIn_39_3;
                        stackOut_39_4 = 0;
                        stackIn_40_0 = stackOut_39_0;
                        stackIn_40_1 = stackOut_39_1;
                        stackIn_40_2 = stackOut_39_2;
                        stackIn_40_3 = stackOut_39_3;
                        stackIn_40_4 = stackOut_39_4;
                        break L11;
                      } else {
                        stackOut_38_0 = null;
                        stackOut_38_1 = null;
                        stackOut_38_2 = stackIn_38_2;
                        stackOut_38_3 = stackIn_38_3;
                        stackOut_38_4 = var13.length();
                        stackIn_40_0 = stackOut_38_0;
                        stackIn_40_1 = stackOut_38_1;
                        stackIn_40_2 = stackOut_38_2;
                        stackIn_40_3 = stackOut_38_3;
                        stackIn_40_4 = stackOut_38_4;
                        break L11;
                      }
                    }
                    L12: {
                      var14 = new le(stackIn_40_2, stackIn_40_3, stackIn_40_4);
                      var14.field_c[0] = 0;
                      if (var13 == null) {
                        break L12;
                      } else {
                        L13: {
                          var14.field_c[var13.length()] = param4.b(var13);
                          stackOut_41_0 = 114;
                          stackIn_43_0 = stackOut_41_0;
                          stackIn_42_0 = stackOut_41_0;
                          if (-4 != (param2 ^ -1)) {
                            stackOut_43_0 = stackIn_43_0;
                            stackOut_43_1 = 0;
                            stackIn_44_0 = stackOut_43_0;
                            stackIn_44_1 = stackOut_43_1;
                            break L13;
                          } else {
                            stackOut_42_0 = stackIn_42_0;
                            stackOut_42_1 = this.a(param4.b(var13), param5, 21107, var13);
                            stackIn_44_0 = stackOut_42_0;
                            stackIn_44_1 = stackOut_42_1;
                            break L13;
                          }
                        }
                        lc.a(stackIn_44_0, stackIn_44_1, var13, var14, param4);
                        break L12;
                      }
                    }
                    var11 = var11 + param1;
                    this.field_c[var12] = var14;
                    var12++;
                    continue L10;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var9 = decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) (var9);
            stackOut_47_1 = new StringBuilder().append("vk.M(");
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param0 == null) {
              stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L14;
            } else {
              stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L14;
            }
          }
          L15: {
            stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
            stackOut_50_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param4 == null) {
              stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L15;
            } else {
              stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L15;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    public vk() {
    }

    static {
        field_e = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}
