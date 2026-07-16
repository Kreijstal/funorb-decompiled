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
        field_g = null;
        field_b = null;
        field_j = null;
        if (param0 >= -98) {
            Object var2 = null;
            boolean discarded$0 = ck.a(true, (java.applet.Applet) null);
        }
    }

    final static rg a(String param0, String param1, boolean param2, long param3, int param4) {
        L0: {
          if ((param3 ^ -1L) != -1L) {
            break L0;
          } else {
            if (param1 != null) {
              return (rg) (Object) new wk(param1, param0);
            } else {
              break L0;
            }
          }
        }
        if (!param2) {
          if (param4 >= 60) {
            return (rg) (Object) new go(param3, param0);
          } else {
            return null;
          }
        } else {
          return (rg) (Object) new gq(param3, param0);
        }
    }

    final void b(int param0) {
        if (-1 > (((ck) this).field_f ^ -1)) {
            ((ck) this).field_f = ((ck) this).field_f - 1;
            return;
        }
        ((ck) this).field_c = ((ck) this).field_c - ((ck) this).field_d;
        ((ck) this).field_a = ((ck) this).field_a + ((ck) this).field_e;
        if (param0 != -26338) {
            return;
        }
        ((ck) this).field_h = ((ck) this).field_h + ((ck) this).field_i;
        if (0.0f > ((ck) this).field_c) {
            this.a(-22970);
        }
        ((ck) this).field_k = (int)((ck) this).field_c * 100 / 400;
        if (-101 > (((ck) this).field_k ^ -1)) {
            ((ck) this).field_k = 100;
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
          ((ck) this).field_f = ok.a(ea.field_b, -101, 50) + 20;
          ((ck) this).field_d = 1.5f + (float)ok.a(ea.field_b, -125, 100) / 100.0f;
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
              ((ck) this).field_h = (float)(-100 + ok.a(ea.field_b, param0 ^ 22992, 740));
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
            ((ck) this).field_a = stackIn_14_1;
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
            ((ck) this).field_h = stackIn_10_1;
            ((ck) this).field_a = (float)(ok.a(ea.field_b, -109, 580) + -100);
            break L2;
          }
        }
        var4 = 320 + -(int)((ck) this).field_h;
        var5 = 240 - (int)((ck) this).field_a;
        ((ck) this).field_c = (float)hd.a(var4 * var4 - -(var5 * var5), param0 + 23096);
        var6 = ((ck) this).field_d / ((ck) this).field_c;
        ((ck) this).field_i = var6 * (float)var4;
        if (param0 == -22970) {
          ((ck) this).field_e = var6 * (float)var5;
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
        if (-9 > (((ck) this).field_k ^ -1)) {
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
              if ((((ck) this).field_k ^ -1) > -25) {
                L2: {
                  var4 = -8 + ((ck) this).field_k << -1232732703;
                  var5 = -1 + ((ck) this).field_k / 2;
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
                  t.a((int)((ck) this).field_h, (int)((ck) this).field_a, ((ck) this).field_k, ((ck) this).field_k, var5, var3, var4);
                  break L1;
                } else {
                  t.a((int)((ck) this).field_h, (int)((ck) this).field_a, ((ck) this).field_k, ((ck) this).field_k, var3, var4);
                  break L1;
                }
              } else {
                if (!jc.field_d) {
                  t.a((int)((ck) this).field_h, (int)((ck) this).field_a, ((ck) this).field_k, ((ck) this).field_k, var3, 100);
                  break L1;
                } else {
                  t.a((int)((ck) this).field_h, (int)((ck) this).field_a, ((ck) this).field_k, ((ck) this).field_k, 5, var3, 32);
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
        int var3 = 0;
        qe var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        Object var11 = null;
        Object var12 = null;
        int[] var16 = null;
        var9 = Pixelate.field_H ? 1 : 0;
        var3 = wo.field_d;
        bn.field_I = new ak(0L, (ak) null);
        if (param2 == null) {
          var10 = null;
          jo.a(1, "QC1", (Throwable) null);
          return;
        } else {
          param2.field_i = false;
          param2.field_e = 0;
          w.field_y = new il(var3, param2, param2);
          jd.field_k = new u(var3, param2, param2, (hj) (Object) new dn());
          var4 = fl.c(-3060);
          if (var4 == null) {
            var11 = null;
            jo.a(1, "QC2", (Throwable) null);
            return;
          } else {
            oo.a(-1, var4);
            var12 = null;
            vl.field_L = ka.a(65793, 4020342, 65793, (jl) null, 1513239, 0, 8947848, param0, 21, 1513239, 2245737, 5138823, 1127256);
            ue.field_t = ka.a(0, 0, 0, param1, 0, 16764006, 0, 0, 21, 0, 0, 0, 0);
            ve.field_Ib = ka.a(0, 0, 0, param1, 0, 16777215, 0, 0, 21, 0, 0, 0, 0);
            var5 = t.field_j;
            var6 = t.field_d;
            var16 = t.field_k;
            fe.field_b = new tf(10, 14);
            fe.field_b.c();
            var8 = 2;
            L0: while (true) {
              if ((var8 ^ -1) <= -8) {
                t.a(var16, var5, var6);
                pi.field_Rb = lj.a(ue.field_t, ve.field_Ib, -55, vl.field_L, var4);
                bn.field_I.field_L = new bb();
                return;
              } else {
                t.g(var8, 1 + var8, -(var8 << -1108621535) + 14, 16777215);
                var8++;
                continue L0;
              }
            }
          }
        }
    }

    final static boolean a(boolean param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_4_0 = 0;
            int stackIn_10_0 = 0;
            int stackIn_17_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_9_0 = 0;
            int stackOut_3_0 = 0;
            int stackOut_16_0 = 0;
            int stackOut_15_0 = 0;
            var7 = Pixelate.field_H ? 1 : 0;
            if (!c.field_T) {
              try {
                L0: {
                  var2 = "tuhstatbut";
                  if (param0) {
                    var3 = (String) cq.a("getcookies", (byte) -113, param1);
                    var4 = dd.a(var3, (byte) -52, ';');
                    var5 = 0;
                    L1: while (true) {
                      if (var5 >= var4.length) {
                        break L0;
                      } else {
                        L2: {
                          var6 = var4[var5].indexOf('=');
                          if (0 > var6) {
                            break L2;
                          } else {
                            if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                              break L2;
                            } else {
                              stackOut_9_0 = 1;
                              stackIn_10_0 = stackOut_9_0;
                              return stackIn_10_0 != 0;
                            }
                          }
                        }
                        var5++;
                        continue L1;
                      }
                    }
                  } else {
                    stackOut_3_0 = 1;
                    stackIn_4_0 = stackOut_3_0;
                    return stackIn_4_0 != 0;
                  }
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  var2_ref = decompiledCaughtException;
                  break L3;
                }
              }
              L4: {
                if (param1.getParameter("tuhstatbut") == null) {
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  break L4;
                } else {
                  stackOut_15_0 = 1;
                  stackIn_17_0 = stackOut_15_0;
                  break L4;
                }
              }
              return stackIn_17_0 != 0;
            } else {
              return true;
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
            ((ck) this).field_f = ((ck) this).field_f + ok.a(ea.field_b, -116, 50);
            break L0;
          } else {
            L1: {
              ((ck) this).field_f = 0;
              ((ck) this).field_a = ((ck) this).field_a + ((ck) this).field_e * (float)var1;
              ((ck) this).field_h = ((ck) this).field_h + (float)var1 * ((ck) this).field_i;
              ((ck) this).field_c = ((ck) this).field_c - (float)var1 * ((ck) this).field_d;
              if (((ck) this).field_c >= 0.0f) {
                break L1;
              } else {
                this.a(-22970);
                break L1;
              }
            }
            ((ck) this).field_k = (int)((ck) this).field_c * 100 / 400;
            if (((ck) this).field_k <= 100) {
              break L0;
            } else {
              ((ck) this).field_k = 100;
              break L0;
            }
          }
        }
    }

    static {
    }
}
