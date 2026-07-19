/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi extends nt {
    private int field_w;
    static tg field_v;
    private int field_t;
    private int field_x;
    static int[] field_z;
    boolean field_u;
    static dc field_y;
    private int field_s;

    final static void e(int param0) {
        od.a(5178);
        rd.a(param0, param0 + -31);
    }

    final boolean a(int param0) {
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (this.field_t > this.field_p) {
          this.field_k = this.field_k + this.field_w;
          this.field_o = this.field_o + this.field_x;
          this.field_w = this.field_w * 251 / 300;
          this.field_x = this.field_x * 251 / 300;
          if (this.field_w < 0) {
            this.field_w = this.field_w - 1;
            if (this.field_x < 0) {
              this.field_x = this.field_x - 1;
              if (param0 != -2567) {
                return true;
              } else {
                return super.a(-2567);
              }
            } else {
              this.field_x = this.field_x + 1;
              if (var3 == 0) {
                if (param0 != -2567) {
                  return true;
                } else {
                  return super.a(-2567);
                }
              } else {
                this.field_x = this.field_x - 1;
                if (param0 != -2567) {
                  return true;
                } else {
                  return super.a(-2567);
                }
              }
            }
          } else {
            this.field_w = this.field_w + 1;
            if (var3 == 0) {
              if (this.field_x < 0) {
                this.field_x = this.field_x - 1;
                if (param0 == -2567) {
                  return super.a(-2567);
                } else {
                  return true;
                }
              } else {
                this.field_x = this.field_x + 1;
                if (var3 == 0) {
                  if (param0 == -2567) {
                    return super.a(-2567);
                  } else {
                    return true;
                  }
                } else {
                  this.field_x = this.field_x - 1;
                  if (param0 != -2567) {
                    return true;
                  } else {
                    return super.a(-2567);
                  }
                }
              }
            } else {
              this.field_w = this.field_w - 1;
              if (this.field_x >= 0) {
                this.field_x = this.field_x + 1;
                if (var3 != 0) {
                  this.field_x = this.field_x - 1;
                  if (param0 != -2567) {
                    return true;
                  } else {
                    return super.a(-2567);
                  }
                } else {
                  if (param0 != -2567) {
                    return true;
                  } else {
                    return super.a(-2567);
                  }
                }
              } else {
                this.field_x = this.field_x - 1;
                if (param0 != -2567) {
                  return true;
                } else {
                  return super.a(-2567);
                }
              }
            }
          }
        } else {
          if (param0 != -2567) {
            return true;
          } else {
            return super.a(-2567);
          }
        }
    }

    final static boolean f(int param0) {
        int var1 = 0;
        if (null == kd.field_a[0]) {
          si.a(135, 38, 148, 2, new int[]{0, 23, 24, 3, 2, 14, 11}, 0, 492);
          si.a(150, 38, 170, param0 + -3, new int[]{1, 28, 12, 13, 3, 7}, 1, 470);
          si.a(150, 38, 170, param0 + -3, new int[]{12, 13, 27, 4, param0}, 8, 470);
          si.a(400, 38, 150, 2, new int[]{15, 5}, 2, 490);
          si.a(430, 38, 170, 2, new int[]{18, 6, 17}, 3, 470);
          si.a(430, 38, 170, 2, new int[]{15, 5}, 4, 470);
          si.a(430, 38, 170, 2, new int[]{2, 5}, 5, 470);
          si.a(200, 96, 170, param0 + -3, new int[]{15, 16}, 6, 470);
          si.a(390, 38, 170, 2, new int[]{29, 5}, 7, 468);
          si.a(400, 38, 200, 2, new int[]{30, 6}, 9, 440);
          si.a(370, 38, 200, 2, new int[]{31, 32}, 10, 440);
          si.a(240, 38, 200, 2, new int[]{28, 33}, 11, 440);
          si.a(370, 38, 200, 2, new int[]{33}, 12, 440);
          t.field_q = (int)((double)ma.field_b.a(fn.field_u[12], 0) * 1.5);
          var1 = (int)((double)ma.field_b.a(fn.field_u[13], 0) * 1.5);
          if (t.field_q < var1) {
            t.field_q = var1;
            hg.field_o = new lg();
            return true;
          } else {
            hg.field_o = new lg();
            return true;
          }
        } else {
          return false;
        }
    }

    public static void c(boolean param0) {
        field_y = null;
        field_z = null;
        field_v = null;
        if (!param0) {
            vi.c((byte) 28);
        }
    }

    final void a(ha param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (-1 == (this.field_s ^ -1)) {
                  break L2;
                } else {
                  im.field_a.a((float)(this.field_k >> -1559474904), (float)(this.field_o >> -128733688), 8192, 0, 0, (256 / this.field_t * this.field_p << -492257544) + this.field_q, 1);
                  if (!Sumoblitz.field_L) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              uc.field_a.a((float)(this.field_k >> 46931400), (float)(this.field_o >> -354740696), 2048, 0, 3, 16777215 - -(this.field_p * (256 / this.field_t) << -2105821224), 1);
              break L1;
            }
            if (param1 <= -121) {
              break L0;
            } else {
              field_v = (tg) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("vi.C(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    vi(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        super(param0, param1, param2, param3);
        this.field_s = param6;
        this.field_x = param5;
        this.field_t = param0;
        this.field_w = param4;
    }

    final static void c(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        km var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        pl var13 = null;
        pl var14 = null;
        int[][] var18 = null;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_30_0 = 0;
        boolean stackIn_33_0 = false;
        int stackIn_40_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_39_0 = 0;
        boolean stackOut_32_0 = false;
        var12 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 == -77) {
              var13 = ig.field_a;
              var14 = var13;
              var2 = var14.e(-31302);
              var3 = (km) ((Object) dk.field_a.b(122));
              L1: while (true) {
                L2: {
                  L3: {
                    if (var3 == null) {
                      break L3;
                    } else {
                      stackOut_5_0 = var2 ^ -1;
                      stackIn_12_0 = stackOut_5_0;
                      stackIn_6_0 = stackOut_5_0;
                      if (var12 != 0) {
                        break L2;
                      } else {
                        if (stackIn_6_0 == (var3.field_n ^ -1)) {
                          break L3;
                        } else {
                          var3 = (km) ((Object) dk.field_a.d((byte) 18));
                          if (var12 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  if (var3 != null) {
                    stackOut_11_0 = var14.e(-31302);
                    stackIn_12_0 = stackOut_11_0;
                    break L2;
                  } else {
                    kk.a((byte) -115);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
                L4: {
                  var4 = stackIn_12_0;
                  if (var4 != 0) {
                    var5 = var3.field_l;
                    rf.field_b[0] = qv.field_o;
                    var6_int = 1;
                    L5: while (true) {
                      L6: {
                        if (var4 <= var6_int) {
                          tn.b(var4, -2147483648, var5);
                          break L6;
                        } else {
                          rf.field_b[var6_int] = var13.d(-1);
                          var6_int++;
                          if (var12 != 0) {
                            break L6;
                          } else {
                            continue L5;
                          }
                        }
                      }
                      var6_int = 0;
                      L7: while (true) {
                        L8: {
                          if (var4 <= var6_int) {
                            qr.a(13136, var5);
                            stackOut_29_0 = 2;
                            stackIn_30_0 = stackOut_29_0;
                            break L8;
                          } else {
                            nm.a(var14, (byte) 61);
                            stackOut_22_0 = var6_int;
                            stackIn_30_0 = stackOut_22_0;
                            stackIn_23_0 = stackOut_22_0;
                            if (var12 != 0) {
                              break L8;
                            } else {
                              L9: {
                                if (stackIn_23_0 == 0) {
                                  oc.a(bb.field_l, qk.field_U, true, var6_int, sd.field_f, ch.field_d);
                                  break L9;
                                } else {
                                  oc.a(bb.field_l, qk.field_U, true, var6_int, sd.field_f, ch.field_d);
                                  if (var12 == 0) {
                                    break L9;
                                  } else {
                                    oc.a(bb.field_l, qk.field_U, true, var6_int, sd.field_f, ch.field_d);
                                    break L9;
                                  }
                                }
                              }
                              var6_int++;
                              continue L7;
                            }
                          }
                        }
                        var6 = new String[stackIn_30_0][var5];
                        var18 = new int[2][var5 * 4];
                        var8 = se.field_d;
                        var9 = 0;
                        var10 = 0;
                        L10: while (true) {
                          L11: {
                            if (var9 >= var8) {
                              var9 = 0;
                              stackOut_39_0 = 0;
                              stackIn_40_0 = stackOut_39_0;
                              break L11;
                            } else {
                              var11 = pd.field_q[var9];
                              var6[0][var10] = rf.field_b[var11];
                              var18[0][var10 * 4] = lj.field_a[var11];
                              var18[0][var10 * 4 + 1] = jf.field_f[var11];
                              var18[0][2 + 4 * var10] = ic.field_c[var11];
                              var18[0][var10 * 4 + 3] = field_z[var11];
                              stackOut_32_0 = ea.a(rf.field_b[var11], (byte) -25);
                              stackIn_40_0 = stackOut_32_0 ? 1 : 0;
                              stackIn_33_0 = stackOut_32_0;
                              if (var12 != 0) {
                                break L11;
                              } else {
                                L12: {
                                  if (stackIn_33_0) {
                                    if (field_z[var11] + jf.field_f[var11] + ic.field_c[var11] == 0) {
                                      var6[0][var10] = null;
                                      var10--;
                                      break L12;
                                    } else {
                                      break L12;
                                    }
                                  } else {
                                    break L12;
                                  }
                                }
                                var9++;
                                var10++;
                                continue L10;
                              }
                            }
                          }
                          var10 = stackIn_40_0;
                          L13: while (true) {
                            if (var9 < var8) {
                              var11 = pd.field_q[var9 + var5];
                              var6[1][var10] = rf.field_b[var11];
                              var18[1][4 * var10] = lj.field_a[var11];
                              var18[1][1 + 4 * var10] = jf.field_f[var11];
                              var18[1][2 + 4 * var10] = ic.field_c[var11];
                              var18[1][var10 * 4 + 3] = field_z[var11];
                              if (var12 != 0) {
                                break L4;
                              } else {
                                L14: {
                                  if (!ea.a(rf.field_b[var11], (byte) -25)) {
                                    break L14;
                                  } else {
                                    if (-1 != (jf.field_f[var11] - (-ic.field_c[var11] - field_z[var11]) ^ -1)) {
                                      break L14;
                                    } else {
                                      var6[1][var10] = null;
                                      var10--;
                                      break L14;
                                    }
                                  }
                                }
                                var10++;
                                var9++;
                                continue L13;
                              }
                            } else {
                              var3.b(false);
                              break L4;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    var3.b(false);
                    break L4;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1), "vi.A(" + param0 + ')');
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

    final static void a(int param0, byte param1) {
        id var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        of var4 = null;
        id stackIn_4_0 = null;
        Object stackIn_6_0 = null;
        RuntimeException decompiledCaughtException = null;
        id stackOut_3_0 = null;
        ms stackOut_5_0 = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2 = (id) ((Object) ow.field_f.b(85));
            L1: while (true) {
              L2: {
                L3: {
                  if (var2 == null) {
                    break L3;
                  } else {
                    km.a((byte) -120, param0, var2);
                    stackOut_3_0 = (id) ((Object) ow.field_f.d((byte) 18));
                    stackIn_6_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      var2 = stackIn_4_0;
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_5_0 = oi.field_b.b(109);
                stackIn_6_0 = stackOut_5_0;
                break L2;
              }
              var4 = (of) ((Object) stackIn_6_0);
              L4: while (true) {
                L5: {
                  L6: {
                    if (var4 == null) {
                      break L6;
                    } else {
                      pd.a((byte) -65, param0, var4);
                      var4 = (of) ((Object) oi.field_b.d((byte) 18));
                      if (var3 != 0) {
                        break L5;
                      } else {
                        if (var3 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  if (param1 <= -63) {
                    break L5;
                  } else {
                    field_z = (int[]) null;
                    return;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2_ref), "vi.D(" + param0 + ',' + param1 + ')');
        }
    }

    final static String a(int param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        var4 = param0;
        if (!param3) {
          if (!param1) {
            if (param2) {
              var4++;
              return kr.field_f[var4];
            } else {
              return kr.field_f[var4];
            }
          } else {
            var4 += 2;
            if (param2) {
              var4++;
              return kr.field_f[var4];
            } else {
              return kr.field_f[var4];
            }
          }
        } else {
          var4 += 4;
          if (param1) {
            var4 += 2;
            if (!param2) {
              return kr.field_f[var4];
            } else {
              var4++;
              return kr.field_f[var4];
            }
          } else {
            if (param2) {
              var4++;
              return kr.field_f[var4];
            } else {
              return kr.field_f[var4];
            }
          }
        }
    }

    static {
        field_v = new tg();
    }
}
