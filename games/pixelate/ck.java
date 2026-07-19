/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ck {
    private float field_i;
    private float field_d;
    private float field_c;
    private float field_h;
    private int field_f;
    static String field_g;
    private int field_k;
    private float field_a;
    static am field_j;
    private float field_e;
    static rl[] field_b;

    public static void a(byte param0) {
        boolean discarded$0 = false;
        field_g = null;
        field_b = null;
        field_j = null;
        if (param0 >= -98) {
            java.applet.Applet var2 = (java.applet.Applet) null;
            discarded$0 = ck.a(true, (java.applet.Applet) null);
        }
    }

    final static rg a(String param0, String param1, boolean param2, long param3, int param4) {
        RuntimeException var6 = null;
        gq stackIn_5_0 = null;
        wk stackIn_7_0 = null;
        rg stackIn_10_0 = null;
        go stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        wk stackOut_6_0 = null;
        go stackOut_11_0 = null;
        rg stackOut_9_0 = null;
        gq stackOut_4_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if ((param3 ^ -1L) != -1L) {
                break L1;
              } else {
                if (param1 != null) {
                  stackOut_6_0 = new wk(param1, param0);
                  stackIn_7_0 = stackOut_6_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (!param2) {
              if (param4 >= 60) {
                stackOut_11_0 = new go(param3, param0);
                stackIn_12_0 = stackOut_11_0;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackOut_9_0 = (rg) null;
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackOut_4_0 = new gq(param3, param0);
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var6);
            stackOut_13_1 = new StringBuilder().append("ck.E(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          L3: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (rg) ((Object) stackIn_5_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (rg) ((Object) stackIn_7_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return (rg) ((Object) stackIn_12_0);
            }
          }
        }
    }

    final void b(int param0) {
        if (-1 > (this.field_f ^ -1)) {
            this.field_f = this.field_f - 1;
            return;
        }
        this.field_c = this.field_c - this.field_d;
        this.field_a = this.field_a + this.field_e;
        if (param0 != -26338) {
            return;
        }
        this.field_h = this.field_h + this.field_i;
        if (0.0f > this.field_c) {
            this.a(-22970);
        }
        this.field_k = (int)this.field_c * 100 / 400;
        if (-101 > (this.field_k ^ -1)) {
            this.field_k = 100;
        }
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        float var6 = 0.0f;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        float stackIn_10_1 = 0.0f;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        float stackIn_14_1 = 0.0f;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        Object stackOut_11_0 = null;
        Object stackOut_13_0 = null;
        float stackOut_13_1 = 0.0f;
        Object stackOut_12_0 = null;
        float stackOut_12_1 = 0.0f;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        float stackOut_9_1 = 0.0f;
        Object stackOut_8_0 = null;
        float stackOut_8_1 = 0.0f;
        L0: {
          this.field_f = ok.a(ea.field_b, -101, 50) + 20;
          this.field_d = 1.5f + (float)ok.a(ea.field_b, -125, 100) / 100.0f;
          if ((ok.a(ea.field_b, param0 ^ 22979, 2) ^ -1) != -2) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var2 = stackIn_3_0;
          if ((ok.a(ea.field_b, -115, 2) ^ -1) != -2) {
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 1;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var3 = stackIn_6_0;
          if (var2 == 0) {
            L3: {
              this.field_h = (float)(-100 + ok.a(ea.field_b, param0 ^ 22992, 740));
              stackOut_11_0 = this;
              stackIn_13_0 = stackOut_11_0;
              stackIn_12_0 = stackOut_11_0;
              if (var3 != 0) {
                stackOut_13_0 = this;
                stackOut_13_1 = 480.0f;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                break L3;
              } else {
                stackOut_12_0 = this;
                stackOut_12_1 = -100.0f;
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                break L3;
              }
            }
            ((ck) (this)).field_a = stackIn_14_1;
            break L2;
          } else {
            L4: {
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (var3 == 0) {
                stackOut_9_0 = this;
                stackOut_9_1 = -100.0f;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L4;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 640.0f;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L4;
              }
            }
            ((ck) (this)).field_h = stackIn_10_1;
            this.field_a = (float)(ok.a(ea.field_b, -109, 580) + -100);
            break L2;
          }
        }
        var4 = 320 + -(int)this.field_h;
        var5 = 240 - (int)this.field_a;
        this.field_c = (float)hd.a(var4 * var4 - -(var5 * var5), param0 + 23096);
        var6 = this.field_d / this.field_c;
        this.field_i = var6 * (float)var4;
        if (param0 == -22970) {
          this.field_e = var6 * (float)var5;
          return;
        } else {
          return;
        }
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        var6 = Pixelate.field_H ? 1 : 0;
        if (-9 > (this.field_k ^ -1)) {
          if (param0 == 100) {
            L0: {
              if (param1) {
                stackOut_6_0 = 16777215;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_5_0 = 0;
                stackIn_7_0 = stackOut_5_0;
                break L0;
              }
            }
            L1: {
              var3 = stackIn_7_0;
              if ((this.field_k ^ -1) > -25) {
                L2: {
                  var4 = -8 + this.field_k << -1232732703;
                  var5 = -1 + this.field_k / 2;
                  if ((var5 ^ -1) > -1) {
                    var5 = 0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (var5 <= 5) {
                    break L3;
                  } else {
                    var5 = 5;
                    break L3;
                  }
                }
                if (jc.field_d) {
                  t.a((int)this.field_h, (int)this.field_a, this.field_k, this.field_k, var5, var3, var4);
                  break L1;
                } else {
                  t.a((int)this.field_h, (int)this.field_a, this.field_k, this.field_k, var3, var4);
                  break L1;
                }
              } else {
                if (!jc.field_d) {
                  t.a((int)this.field_h, (int)this.field_a, this.field_k, this.field_k, var3, 100);
                  break L1;
                } else {
                  t.a((int)this.field_h, (int)this.field_a, this.field_k, this.field_k, 5, var3, 32);
                  break L1;
                }
              }
            }
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0, jl param1, fm param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        qe var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        Throwable var10 = null;
        Throwable var11 = null;
        jl var12 = null;
        int[] var16 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var9 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var3_int = wo.field_d;
            bn.field_I = new ak(0L, (ak) null);
            if (param2 == null) {
              var10 = (Throwable) null;
              jo.a(1, "QC1", (Throwable) null);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param2.field_i = false;
              param2.field_e = 0;
              w.field_y = new il(var3_int, param2, param2);
              jd.field_k = new u(var3_int, param2, param2, new dn());
              var4 = fl.c(-3060);
              if (var4 == null) {
                var11 = (Throwable) null;
                jo.a(1, "QC2", (Throwable) null);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                oo.a(-1, var4);
                var12 = (jl) null;
                vl.field_L = ka.a(65793, 4020342, 65793, (jl) null, 1513239, 0, 8947848, param0, 21, 1513239, 2245737, 5138823, 1127256);
                ue.field_t = ka.a(0, 0, 0, param1, 0, 16764006, 0, 0, 21, 0, 0, 0, 0);
                ve.field_Ib = ka.a(0, 0, 0, param1, 0, 16777215, 0, 0, 21, 0, 0, 0, 0);
                var5 = t.field_j;
                var6 = t.field_d;
                var16 = t.field_k;
                fe.field_b = new tf(10, 14);
                fe.field_b.c();
                var8 = 2;
                L1: while (true) {
                  if ((var8 ^ -1) <= -8) {
                    t.a(var16, var5, var6);
                    pi.field_Rb = lj.a(ue.field_t, ve.field_Ib, -55, vl.field_L, var4);
                    bn.field_I.field_L = new bb();
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    t.g(var8, 1 + var8, -(var8 << -1108621535) + 14, 16777215);
                    var8++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("ck.A(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          L3: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
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

    final static boolean a(boolean param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            RuntimeException var2_ref2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_3_0 = 0;
            int stackIn_6_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_19_0 = 0;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            String stackIn_23_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_11_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_18_0 = 0;
            int stackOut_17_0 = 0;
            int stackOut_2_0 = 0;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            String stackOut_22_2 = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            String stackOut_21_2 = null;
            var7 = Pixelate.field_H ? 1 : 0;
            try {
              L0: {
                if (!c.field_T) {
                  try {
                    L1: {
                      var2 = "tuhstatbut";
                      if (param0) {
                        var3 = (String) (cq.a("getcookies", (byte) -113, param1));
                        var4 = dd.a(var3, (byte) -52, ';');
                        var5 = 0;
                        L2: while (true) {
                          if (var5 >= var4.length) {
                            decompiledRegionSelector0 = 1;
                            break L1;
                          } else {
                            L3: {
                              var6 = var4[var5].indexOf('=');
                              if (0 > var6) {
                                break L3;
                              } else {
                                if (!var4[var5].substring(0, var6).trim().equals(var2)) {
                                  break L3;
                                } else {
                                  stackOut_11_0 = 1;
                                  stackIn_12_0 = stackOut_11_0;
                                  decompiledRegionSelector0 = 2;
                                  break L1;
                                }
                              }
                            }
                            var5++;
                            continue L2;
                          }
                        }
                      } else {
                        stackOut_5_0 = 1;
                        stackIn_6_0 = stackOut_5_0;
                        decompiledRegionSelector0 = 0;
                        break L1;
                      }
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L4: {
                      var2_ref = decompiledCaughtException;
                      decompiledRegionSelector0 = 1;
                      break L4;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    decompiledRegionSelector1 = 2;
                    break L0;
                  } else {
                    if (decompiledRegionSelector0 == 1) {
                      L5: {
                        if (param1.getParameter("tuhstatbut") == null) {
                          stackOut_18_0 = 0;
                          stackIn_19_0 = stackOut_18_0;
                          break L5;
                        } else {
                          stackOut_17_0 = 1;
                          stackIn_19_0 = stackOut_17_0;
                          break L5;
                        }
                      }
                      decompiledRegionSelector1 = 1;
                      break L0;
                    } else {
                      decompiledRegionSelector1 = 3;
                      break L0;
                    }
                  }
                } else {
                  stackOut_2_0 = 1;
                  stackIn_3_0 = stackOut_2_0;
                  decompiledRegionSelector1 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_20_0 = (RuntimeException) (var2_ref2);
                stackOut_20_1 = new StringBuilder().append("ck.F(").append(param0).append(',');
                stackIn_22_0 = stackOut_20_0;
                stackIn_22_1 = stackOut_20_1;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                if (param1 == null) {
                  stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
                  stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
                  stackOut_22_2 = "null";
                  stackIn_23_0 = stackOut_22_0;
                  stackIn_23_1 = stackOut_22_1;
                  stackIn_23_2 = stackOut_22_2;
                  break L6;
                } else {
                  stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
                  stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
                  stackOut_21_2 = "{...}";
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_23_1 = stackOut_21_1;
                  stackIn_23_2 = stackOut_21_2;
                  break L6;
                }
              }
              throw aa.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_3_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_19_0 != 0;
              } else {
                if (decompiledRegionSelector1 == 2) {
                  return stackIn_6_0 != 0;
                } else {
                  return stackIn_12_0 != 0;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    ck() {
        int var1 = 0;
        L0: {
          this.a(-22970);
          var1 = ok.a(ea.field_b, -128, 250);
          if (var1 >= 180) {
            this.field_f = this.field_f + ok.a(ea.field_b, -116, 50);
            break L0;
          } else {
            L1: {
              this.field_f = 0;
              this.field_a = this.field_a + this.field_e * (float)var1;
              this.field_h = this.field_h + (float)var1 * this.field_i;
              this.field_c = this.field_c - (float)var1 * this.field_d;
              if (this.field_c >= 0.0f) {
                break L1;
              } else {
                this.a(-22970);
                break L1;
              }
            }
            this.field_k = (int)this.field_c * 100 / 400;
            if (this.field_k <= 100) {
              break L0;
            } else {
              this.field_k = 100;
              break L0;
            }
          }
        }
    }

    static {
    }
}
