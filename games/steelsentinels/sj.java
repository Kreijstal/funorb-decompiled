/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sj extends we {
    static gh field_J;
    static String field_C;
    static int[] field_v;
    static String field_B;
    private int[] field_G;
    private boolean field_H;
    private int field_D;
    private tg field_L;
    private int field_K;
    static wk[] field_x;
    static cm field_y;
    static gh field_z;
    private ic field_O;
    private int[] field_I;
    private ic field_M;
    private tg field_s;
    private int field_E;
    private ic field_t;
    private int field_A;
    static wk field_F;
    private tg field_w;
    static gi field_u;
    private boolean field_N;

    final synchronized int a() {
        return 2;
    }

    public static void b(boolean param0) {
        field_F = null;
        field_y = null;
        field_x = null;
        field_z = null;
        field_B = null;
        field_u = null;
        field_v = null;
        if (param0) {
            Throwable var2 = (Throwable) null;
            sj.a((String) null, -123, (Throwable) null);
        }
        field_J = null;
        field_C = null;
    }

    final void a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_33_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_62_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        var11 = SteelSentinels.field_G;
        try {
          L0: {
            if (this.field_A <= 0) {
              this.d(param2);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (this.field_N) {
                  L2: {
                    if (this.field_K <= 0) {
                      break L2;
                    } else {
                      if (this.field_O.d((byte) 90)) {
                        break L2;
                      } else {
                        this.field_N = false;
                        this.field_s = null;
                        this.field_K = -this.field_K;
                        break L1;
                      }
                    }
                  }
                  if (this.field_K >= 0) {
                    break L1;
                  } else {
                    if (!this.field_M.d((byte) 90)) {
                      this.field_K = -this.field_K;
                      this.field_N = false;
                      this.field_w = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              L3: {
                var4_int = (this.field_D >> -1888025300) * this.field_A / 256;
                var5 = -var4_int + this.field_A;
                if (0 == this.field_K) {
                  break L3;
                } else {
                  this.field_D = this.field_D + this.field_K * param2;
                  if ((this.field_D ^ -1) > -1048577) {
                    if ((this.field_D ^ -1) >= -1) {
                      this.field_D = 0;
                      if (!this.field_N) {
                        this.field_K = 0;
                        if (this.field_H) {
                          break L3;
                        } else {
                          L4: {
                            if (this.field_s != null) {
                              this.field_O.c((byte) -109);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          this.field_s = null;
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  } else {
                    this.field_D = 1048576;
                    if (this.field_N) {
                      break L3;
                    } else {
                      this.field_K = 0;
                      if (this.field_H) {
                        break L3;
                      } else {
                        L5: {
                          if (this.field_w == null) {
                            break L5;
                          } else {
                            this.field_M.c((byte) -40);
                            break L5;
                          }
                        }
                        this.field_w = null;
                        break L3;
                      }
                    }
                  }
                }
              }
              L6: {
                if (tb.field_b) {
                  stackOut_32_0 = param2 << 86814241;
                  stackIn_33_0 = stackOut_32_0;
                  break L6;
                } else {
                  stackOut_31_0 = param2;
                  stackIn_33_0 = stackOut_31_0;
                  break L6;
                }
              }
              L7: {
                var6 = stackIn_33_0;
                if (256 <= this.field_E) {
                  break L7;
                } else {
                  L8: {
                    if (this.field_s != null) {
                      break L8;
                    } else {
                      if (null == this.field_w) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  if (var4_int == 256) {
                    this.field_O.a(param0, param1, param2);
                    break L7;
                  } else {
                    if (-257 != (var5 ^ -1)) {
                      L9: {
                        L10: {
                          if (null == this.field_G) {
                            break L10;
                          } else {
                            if (var6 > this.field_G.length) {
                              break L10;
                            } else {
                              ii.a(this.field_G, 0, var6);
                              ii.a(this.field_I, 0, var6);
                              break L9;
                            }
                          }
                        }
                        this.field_I = new int[var6];
                        this.field_G = new int[var6];
                        break L9;
                      }
                      L11: {
                        this.field_O.a(this.field_G, 0, param2);
                        this.field_M.a(this.field_I, 0, param2);
                        if (tb.field_b) {
                          param1 = param1 << 1;
                          stackOut_46_0 = param1 << 1;
                          stackIn_47_0 = stackOut_46_0;
                          break L11;
                        } else {
                          stackOut_45_0 = param1;
                          stackIn_47_0 = stackOut_45_0;
                          break L11;
                        }
                      }
                      var7 = stackIn_47_0;
                      var8 = 0;
                      L12: while (true) {
                        if (var8 >= var6) {
                          break L7;
                        } else {
                          param0[var7 - -var8] = param0[var7 - -var8] + (this.field_G[var8] * var4_int - -(var5 * this.field_I[var8]) >> -990402872);
                          var8++;
                          continue L12;
                        }
                      }
                    } else {
                      this.field_M.a(param0, param1, param2);
                      break L7;
                    }
                  }
                }
              }
              L13: {
                if (this.field_L == null) {
                  break L13;
                } else {
                  if (0 != this.field_E) {
                    L14: {
                      L15: {
                        if (null == this.field_G) {
                          break L15;
                        } else {
                          if (this.field_G.length >= var6) {
                            ii.a(this.field_G, 0, var6);
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                      this.field_G = new int[var6];
                      this.field_I = new int[var6];
                      break L14;
                    }
                    L16: {
                      this.field_t.a(this.field_G, 0, param2);
                      if (!tb.field_b) {
                        stackOut_61_0 = param1;
                        stackIn_62_0 = stackOut_61_0;
                        break L16;
                      } else {
                        param1 = param1 << 1;
                        stackOut_60_0 = param1 << 1;
                        stackIn_62_0 = stackOut_60_0;
                        break L16;
                      }
                    }
                    var7 = stackIn_62_0;
                    var8 = this.field_A * this.field_E / 256;
                    var9 = this.field_A + -var8;
                    var10 = 0;
                    L17: while (true) {
                      if (var10 >= var6) {
                        break L13;
                      } else {
                        param0[var10 + var7] = var8 * this.field_G[var10] + param0[var10 + var7] * var9 >> 1373565576;
                        var10++;
                        continue L17;
                      }
                    }
                  } else {
                    break L13;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var4 = decompiledCaughtException;
            stackOut_66_0 = (RuntimeException) (var4);
            stackOut_66_1 = new StringBuilder().append("sj.K(");
            stackIn_68_0 = stackOut_66_0;
            stackIn_68_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param0 == null) {
              stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackOut_68_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L18;
            } else {
              stackOut_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackOut_67_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackOut_67_2 = "{...}";
              stackIn_69_0 = stackOut_67_0;
              stackIn_69_1 = stackOut_67_1;
              stackIn_69_2 = stackOut_67_2;
              break L18;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_69_0), stackIn_69_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(String param0, String param1, int param2, byte param3, String param4, int param5) {
        na var6 = null;
        try {
            if (param3 != 21) {
                field_x = (wk[]) null;
            }
            var6 = new na(param5, param4, param2, param0, param1);
            tf.a(var6, (byte) -107);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "sj.F(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final synchronized void d(int param0) {
        int var3 = 0;
        L0: {
          var3 = SteelSentinels.field_G;
          if ((this.field_D ^ -1) >= -1) {
            if (1048576 > this.field_D) {
              if (null == this.field_w) {
                break L0;
              } else {
                this.field_M.d(param0);
                break L0;
              }
            } else {
              if (1048576 <= this.field_D) {
                break L0;
              } else {
                if (null == this.field_w) {
                  break L0;
                } else {
                  this.field_M.d(param0);
                  break L0;
                }
              }
            }
          } else {
            if (1048576 <= this.field_D) {
              break L0;
            } else {
              if (null == this.field_w) {
                break L0;
              } else {
                this.field_M.d(param0);
                break L0;
              }
            }
          }
        }
        L1: {
          if (0 >= this.field_E) {
            break L1;
          } else {
            if (null != this.field_L) {
              this.field_t.d(param0);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (this.field_N) {
            L3: {
              if (-1 <= (this.field_K ^ -1)) {
                break L3;
              } else {
                if (this.field_O.d((byte) 90)) {
                  break L3;
                } else {
                  this.field_K = -this.field_K;
                  this.field_s = null;
                  this.field_N = false;
                  break L2;
                }
              }
            }
            if ((this.field_K ^ -1) <= -1) {
              break L2;
            } else {
              if (!this.field_M.d((byte) 90)) {
                this.field_N = false;
                this.field_K = -this.field_K;
                this.field_w = null;
                break L2;
              } else {
                break L2;
              }
            }
          } else {
            break L2;
          }
        }
        L4: {
          if (-1 == (this.field_K ^ -1)) {
            break L4;
          } else {
            this.field_D = this.field_D + this.field_K * param0;
            if (-1048577 >= (this.field_D ^ -1)) {
              this.field_D = 1048576;
              if (!this.field_N) {
                this.field_K = 0;
                if (this.field_H) {
                  break L4;
                } else {
                  L5: {
                    if (this.field_w == null) {
                      break L5;
                    } else {
                      this.field_M.c((byte) -72);
                      break L5;
                    }
                  }
                  this.field_w = null;
                  break L4;
                }
              } else {
                break L4;
              }
            } else {
              if ((this.field_D ^ -1) < -1) {
                break L4;
              } else {
                this.field_D = 0;
                if (this.field_N) {
                  break L4;
                } else {
                  this.field_K = 0;
                  if (this.field_H) {
                    break L4;
                  } else {
                    L6: {
                      if (this.field_s != null) {
                        this.field_O.c((byte) -49);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    this.field_s = null;
                    break L4;
                  }
                }
              }
            }
          }
        }
    }

    private final void a(int param0, ic param1, int param2, int param3) {
        try {
            if (param2 != 17396) {
                this.a(-97, 18);
            }
            param1.a(-1, (byte) 37, param3);
            param1.a((byte) 61, param0);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "sj.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(String param0, int param1, Throwable param2) {
        try {
            int discarded$1 = 0;
            Exception var3 = null;
            String var3_ref = null;
            wj var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            pn stackIn_14_0 = null;
            java.net.URL stackIn_14_1 = null;
            java.net.URL stackIn_14_2 = null;
            java.net.URL stackIn_14_3 = null;
            StringBuilder stackIn_14_4 = null;
            pn stackIn_15_0 = null;
            java.net.URL stackIn_15_1 = null;
            java.net.URL stackIn_15_2 = null;
            java.net.URL stackIn_15_3 = null;
            StringBuilder stackIn_15_4 = null;
            pn stackIn_16_0 = null;
            java.net.URL stackIn_16_1 = null;
            java.net.URL stackIn_16_2 = null;
            java.net.URL stackIn_16_3 = null;
            StringBuilder stackIn_16_4 = null;
            String stackIn_16_5 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            pn stackOut_13_0 = null;
            java.net.URL stackOut_13_1 = null;
            java.net.URL stackOut_13_2 = null;
            java.net.URL stackOut_13_3 = null;
            StringBuilder stackOut_13_4 = null;
            pn stackOut_15_0 = null;
            java.net.URL stackOut_15_1 = null;
            java.net.URL stackOut_15_2 = null;
            java.net.URL stackOut_15_3 = null;
            StringBuilder stackOut_15_4 = null;
            String stackOut_15_5 = null;
            pn stackOut_14_0 = null;
            java.net.URL stackOut_14_1 = null;
            java.net.URL stackOut_14_2 = null;
            java.net.URL stackOut_14_3 = null;
            StringBuilder stackOut_14_4 = null;
            String stackOut_14_5 = null;
            var6 = SteelSentinels.field_G;
            try {
              L0: {
                L1: {
                  var3_ref = "";
                  if (param2 != null) {
                    var3_ref = pg.a((byte) -85, param2);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param0 == null) {
                    break L2;
                  } else {
                    L3: {
                      if (param2 != null) {
                        var3_ref = var3_ref + " | ";
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var3_ref = var3_ref + param0;
                    break L2;
                  }
                }
                ji.a(var3_ref, -29771);
                if (param1 < -13) {
                  var7 = ee.a(":", var3_ref, "%3a", 98);
                  var8 = ee.a("@", var7, "%40", 101);
                  var9 = ee.a("&", var8, "%26", -20);
                  var10 = ee.a("#", var9, "%23", 97);
                  if (null != ug.field_O) {
                    L4: {
                      stackOut_13_0 = ug.field_M;
                      stackOut_13_1 = null;
                      stackOut_13_2 = null;
                      stackOut_13_3 = ug.field_O.getCodeBase();
                      stackOut_13_4 = new StringBuilder().append("clienterror.ws?c=").append(dd.field_d).append("&u=");
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      stackIn_15_2 = stackOut_13_2;
                      stackIn_15_3 = stackOut_13_3;
                      stackIn_15_4 = stackOut_13_4;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      stackIn_14_2 = stackOut_13_2;
                      stackIn_14_3 = stackOut_13_3;
                      stackIn_14_4 = stackOut_13_4;
                      if (ih.field_q == null) {
                        stackOut_15_0 = (pn) ((Object) stackIn_15_0);
                        stackOut_15_1 = null;
                        stackOut_15_2 = null;
                        stackOut_15_3 = (java.net.URL) ((Object) stackIn_15_3);
                        stackOut_15_4 = (StringBuilder) ((Object) stackIn_15_4);
                        stackOut_15_5 = "" + oa.field_P;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        stackIn_16_2 = stackOut_15_2;
                        stackIn_16_3 = stackOut_15_3;
                        stackIn_16_4 = stackOut_15_4;
                        stackIn_16_5 = stackOut_15_5;
                        break L4;
                      } else {
                        stackOut_14_0 = (pn) ((Object) stackIn_14_0);
                        stackOut_14_1 = null;
                        stackOut_14_2 = null;
                        stackOut_14_3 = (java.net.URL) ((Object) stackIn_14_3);
                        stackOut_14_4 = (StringBuilder) ((Object) stackIn_14_4);
                        stackOut_14_5 = ih.field_q;
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        stackIn_16_2 = stackOut_14_2;
                        stackIn_16_3 = stackOut_14_3;
                        stackIn_16_4 = stackOut_14_4;
                        stackIn_16_5 = stackOut_14_5;
                        break L4;
                      }
                    }
                    var4 = ((pn) (Object) stackIn_16_0).a(new java.net.URL(stackIn_16_3, stackIn_16_5 + "&v1=" + pn.field_p + "&v2=" + pn.field_r + "&e=" + var10), 38);
                    L5: while (true) {
                      if (-1 != (var4.field_a ^ -1)) {
                        L6: {
                          if ((var4.field_a ^ -1) != -2) {
                            break L6;
                          } else {
                            var5 = (DataInputStream) (var4.field_c);
                            discarded$1 = var5.read();
                            var5.close();
                            break L6;
                          }
                        }
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        a.a((byte) 126, 1L);
                        continue L5;
                      }
                    }
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L7: {
                var3 = (Exception) (Object) decompiledCaughtException;
                decompiledRegionSelector0 = 2;
                break L7;
              }
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
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final we d() {
        return null;
    }

    final static boolean a(boolean param0) {
        boolean discarded$1 = false;
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        double var3 = 0.0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        var15 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var1_int = 0;
              if (param0) {
                break L1;
              } else {
                discarded$1 = sj.a(false);
                break L1;
              }
            }
            var2 = 0;
            L2: while (true) {
              if (var2 >= 640) {
                stackOut_14_0 = var1_int;
                stackIn_15_0 = stackOut_14_0;
                break L0;
              } else {
                L3: {
                  var3 = 374.0 + (double)(var2 - 320) * (0.000234375 * (double)(var2 - 320));
                  var5 = (int)Math.ceil(var3);
                  if (var2 != oh.field_f) {
                    break L3;
                  } else {
                    if (var5 > pi.field_c) {
                      break L3;
                    } else {
                      var1_int = 1;
                      break L3;
                    }
                  }
                }
                jg.a(0, 48, var2, false, 480, var5);
                var6 = var5 - 1;
                var7 = var5 + 1;
                var8 = (int)(((double)var5 - var3) * 256.0);
                var9 = 200;
                var5 = var6 - 1;
                L4: while (true) {
                  if (var5 <= var6 + -20) {
                    pb.d(var2, var6, -var6 + var7, 4210752);
                    if (-1 >= (var8 ^ -1)) {
                      var10 = var2 + (var6 + -1) * pb.field_c;
                      var11 = (pb.field_g[var10] & 16711680) >> 1550233776;
                      var12 = pb.field_g[var10] >> -1705008472 & 255;
                      var13 = pb.field_g[var10] & 255;
                      var14 = var8 * 64;
                      var13 = (var13 * (256 - var8) + var14) / 256;
                      var12 = (var14 + var12 * (256 - var8)) / 256;
                      var11 = (var14 + var11 * (256 - var8)) / 256;
                      pb.field_g[var10] = vn.a(var13, vn.a(var11 << 351878352, var12 << 1390114664));
                      var10 = var2 + pb.field_c * var7;
                      var13 = 255 & pb.field_g[var10];
                      var14 = 16384 - var8 * 64;
                      var12 = pb.field_g[var10] >> 799734824 & 255;
                      var11 = (pb.field_g[var10] & 16711680) >> 74252304;
                      var11 = (var11 * var8 - -var14) / 256;
                      var13 = (var13 * var8 + var14) / 256;
                      var12 = (var8 * var12 + var14) / 256;
                      pb.field_g[var10] = vn.a(vn.a(var12 << 1004630152, var11 << 1735337648), var13);
                      var2++;
                      continue L2;
                    } else {
                      var2++;
                      continue L2;
                    }
                  } else {
                    var10 = var2 + var5 * pb.field_c;
                    var11 = (16711680 & pb.field_g[var10]) >> 1633023952;
                    var12 = (pb.field_g[var10] & 65280) >> 1918875112;
                    var13 = 255 & pb.field_g[var10];
                    var11 = var11 * (256 + -var9) / 256;
                    var12 = var12 * (-var9 + 256) / 256;
                    var13 = var13 * (256 - var9) / 256;
                    var9 = var9 * 6 / 7;
                    pb.field_g[var10] = vn.a(vn.a(var11 << -407074608, var12 << 1257349608), var13);
                    var5--;
                    continue L4;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "sj.H(" + param0 + ')');
        }
        return stackIn_15_0 != 0;
    }

    final synchronized void a(int param0, int param1) {
        if (param1 != -1) {
            return;
        }
        this.field_A = param0;
    }

    final synchronized void a(int param0, tg param1, int param2, int param3, boolean param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_33_0 = 0;
        ic stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        ic stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        ic stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_44_2 = 0;
        ic stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        ic stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        ic stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        int stackIn_54_2 = 0;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_17_0 = null;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        ic stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        ic stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        int stackOut_53_2 = 0;
        ic stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        int stackOut_52_2 = 0;
        ic stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        ic stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        int stackOut_43_2 = 0;
        ic stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int stackOut_42_2 = 0;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (!this.field_N) {
                break L1;
              } else {
                if (!param4) {
                  break L1;
                } else {
                  L2: {
                    if (-1 > (this.field_K ^ -1)) {
                      L3: {
                        if (null == this.field_s) {
                          break L3;
                        } else {
                          this.field_O.c((byte) -98);
                          break L3;
                        }
                      }
                      this.field_s = param1;
                      if (param1 != null) {
                        this.field_O.a(true, false, param1);
                        this.a(param3, this.field_O, 17396, param0);
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      L4: {
                        if (this.field_w == null) {
                          break L4;
                        } else {
                          this.field_M.c((byte) -69);
                          break L4;
                        }
                      }
                      this.field_w = param1;
                      if (param1 != null) {
                        this.field_M.a(true, false, param1);
                        this.a(param3, this.field_M, 17396, param0);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L5: {
              if (param5 == 21997) {
                break L5;
              } else {
                this.field_D = 96;
                break L5;
              }
            }
            L6: {
              stackOut_17_0 = this;
              stackIn_19_0 = stackOut_17_0;
              stackIn_18_0 = stackOut_17_0;
              if (!param4) {
                stackOut_19_0 = this;
                stackOut_19_1 = 0;
                stackIn_20_0 = stackOut_19_0;
                stackIn_20_1 = stackOut_19_1;
                break L6;
              } else {
                stackOut_18_0 = this;
                stackOut_18_1 = 1;
                stackIn_20_0 = stackOut_18_0;
                stackIn_20_1 = stackOut_18_1;
                break L6;
              }
            }
            ((sj) (this)).field_N = stackIn_20_1 != 0;
            if (param1 != this.field_s) {
              if (this.field_w == param1) {
                this.field_K = -param2;
                this.a(param3, this.field_M, 17396, param0);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                L7: {
                  if (null == this.field_s) {
                    var7_int = 1;
                    break L7;
                  } else {
                    if (null != this.field_w) {
                      L8: {
                        if ((this.field_D ^ -1) <= -524289) {
                          stackOut_32_0 = 0;
                          stackIn_33_0 = stackOut_32_0;
                          break L8;
                        } else {
                          stackOut_31_0 = 1;
                          stackIn_33_0 = stackOut_31_0;
                          break L8;
                        }
                      }
                      var7_int = stackIn_33_0;
                      break L7;
                    } else {
                      var7_int = 0;
                      break L7;
                    }
                  }
                }
                L9: {
                  if (var7_int == 0) {
                    L10: {
                      if (null != this.field_w) {
                        this.field_M.c((byte) -51);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      this.field_w = param1;
                      if (param1 != null) {
                        L12: {
                          stackOut_51_0 = this.field_M;
                          stackOut_51_1 = 1;
                          stackIn_53_0 = stackOut_51_0;
                          stackIn_53_1 = stackOut_51_1;
                          stackIn_52_0 = stackOut_51_0;
                          stackIn_52_1 = stackOut_51_1;
                          if (param4) {
                            stackOut_53_0 = (ic) ((Object) stackIn_53_0);
                            stackOut_53_1 = stackIn_53_1;
                            stackOut_53_2 = 0;
                            stackIn_54_0 = stackOut_53_0;
                            stackIn_54_1 = stackOut_53_1;
                            stackIn_54_2 = stackOut_53_2;
                            break L12;
                          } else {
                            stackOut_52_0 = (ic) ((Object) stackIn_52_0);
                            stackOut_52_1 = stackIn_52_1;
                            stackOut_52_2 = 1;
                            stackIn_54_0 = stackOut_52_0;
                            stackIn_54_1 = stackOut_52_1;
                            stackIn_54_2 = stackOut_52_2;
                            break L12;
                          }
                        }
                        ((ic) (Object) stackIn_54_0).a(stackIn_54_1 != 0, stackIn_54_2 != 0, param1);
                        this.a(param3, this.field_M, 17396, param0);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    this.field_K = -param2;
                    break L9;
                  } else {
                    L13: {
                      if (null != this.field_s) {
                        this.field_O.c((byte) -77);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    L14: {
                      this.field_s = param1;
                      if (param1 != null) {
                        L15: {
                          stackOut_41_0 = this.field_O;
                          stackOut_41_1 = 1;
                          stackIn_43_0 = stackOut_41_0;
                          stackIn_43_1 = stackOut_41_1;
                          stackIn_42_0 = stackOut_41_0;
                          stackIn_42_1 = stackOut_41_1;
                          if (param4) {
                            stackOut_43_0 = (ic) ((Object) stackIn_43_0);
                            stackOut_43_1 = stackIn_43_1;
                            stackOut_43_2 = 0;
                            stackIn_44_0 = stackOut_43_0;
                            stackIn_44_1 = stackOut_43_1;
                            stackIn_44_2 = stackOut_43_2;
                            break L15;
                          } else {
                            stackOut_42_0 = (ic) ((Object) stackIn_42_0);
                            stackOut_42_1 = stackIn_42_1;
                            stackOut_42_2 = 1;
                            stackIn_44_0 = stackOut_42_0;
                            stackIn_44_1 = stackOut_42_1;
                            stackIn_44_2 = stackOut_42_2;
                            break L15;
                          }
                        }
                        ((ic) (Object) stackIn_44_0).a(stackIn_44_1 != 0, stackIn_44_2 != 0, param1);
                        this.a(param3, this.field_O, 17396, param0);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    this.field_K = param2;
                    break L9;
                  }
                }
                decompiledRegionSelector0 = 3;
                break L0;
              }
            } else {
              this.field_K = param2;
              this.a(param3, this.field_O, 17396, param0);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var7 = decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) (var7);
            stackOut_57_1 = new StringBuilder().append("sj.D(").append(param0).append(',');
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param1 == null) {
              stackOut_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackOut_59_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L16;
            } else {
              stackOut_58_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackOut_58_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackOut_58_2 = "{...}";
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              break L16;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_60_0), stackIn_60_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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

    final static int a(byte param0) {
        int var1 = -51 % ((-72 - param0) / 33);
        return (int)(1000000000L / ud.field_v);
    }

    final we b() {
        return null;
    }

    private sj() throws Throwable {
        throw new Error();
    }

    static {
        field_C = "You have no sentinel to configure.";
        field_v = new int[110];
        field_B = "(<%0> players want to join)";
        field_v[58] = 75;
        field_v[18] = 75;
        field_v[68] = 400;
        field_v[71] = 400;
        field_v[61] = 200;
        field_v[30] = 75;
        field_v[35] = 900;
        field_v[95] = 1000;
        field_v[88] = 900;
        field_v[64] = 300;
        field_v[83] = 600;
        field_v[79] = 700;
        field_v[36] = 700;
        field_v[17] = 75;
        field_v[23] = 75;
        field_v[65] = 300;
        field_v[87] = 800;
        field_v[48] = 1000;
        field_v[54] = 75;
        field_v[85] = 800;
        field_v[81] = 700;
        field_v[62] = 200;
        field_v[84] = 800;
        field_v[24] = 75;
        field_v[21] = 75;
        field_v[19] = 400;
        field_v[74] = 500;
        field_v[59] = 75;
        field_v[93] = 1000;
        field_v[1] = 75;
        field_v[51] = 700;
        field_v[47] = 800;
        field_v[43] = 500;
        field_v[29] = 75;
        field_v[67] = 300;
        field_v[56] = 75;
        field_v[22] = 300;
        field_v[76] = 600;
        field_v[63] = 200;
        field_v[33] = 400;
        field_v[78] = 600;
        field_v[72] = 500;
        field_v[75] = 600;
        field_v[45] = 600;
        field_v[31] = 200;
        field_v[25] = 300;
        field_v[34] = 500;
        field_v[50] = 1000;
        field_v[66] = 300;
        field_v[52] = 1000;
        field_v[69] = 400;
        field_v[37] = 200;
        field_v[91] = 900;
        field_v[53] = 75;
        field_v[60] = 75;
        field_v[26] = 75;
        field_v[89] = 900;
        field_v[82] = 700;
        field_v[86] = 800;
        field_v[77] = 600;
        field_v[80] = 700;
        field_v[2] = 75;
        field_v[44] = 700;
        field_v[90] = 900;
        field_v[28] = 600;
        field_v[32] = 300;
        field_v[46] = 900;
        field_v[27] = 600;
        field_v[38] = 700;
        field_v[49] = 1000;
        field_v[20] = 200;
        field_v[3] = 75;
        field_v[73] = 500;
        field_v[92] = 1000;
        field_v[70] = 400;
    }
}
