/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class rg extends tj {
    private int field_N;
    static int field_R;
    private int field_T;
    private int field_O;
    static String field_S;
    private int field_M;
    private int field_Q;
    static int field_P;
    private int field_L;

    void j(int param0) {
        if (param0 != -8144) {
            rg.i(49);
            return;
        }
    }

    final static void a(Throwable param0, String param1, int param2) {
        try {
            int discarded$1 = 0;
            Exception var3 = null;
            String var3_ref = null;
            jh var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            vh stackIn_15_0 = null;
            java.net.URL stackIn_15_1 = null;
            java.net.URL stackIn_15_2 = null;
            java.net.URL stackIn_15_3 = null;
            StringBuilder stackIn_15_4 = null;
            vh stackIn_16_0 = null;
            java.net.URL stackIn_16_1 = null;
            java.net.URL stackIn_16_2 = null;
            java.net.URL stackIn_16_3 = null;
            StringBuilder stackIn_16_4 = null;
            vh stackIn_17_0 = null;
            java.net.URL stackIn_17_1 = null;
            java.net.URL stackIn_17_2 = null;
            java.net.URL stackIn_17_3 = null;
            StringBuilder stackIn_17_4 = null;
            String stackIn_17_5 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            vh stackOut_14_0 = null;
            java.net.URL stackOut_14_1 = null;
            java.net.URL stackOut_14_2 = null;
            java.net.URL stackOut_14_3 = null;
            StringBuilder stackOut_14_4 = null;
            vh stackOut_16_0 = null;
            java.net.URL stackOut_16_1 = null;
            java.net.URL stackOut_16_2 = null;
            java.net.URL stackOut_16_3 = null;
            StringBuilder stackOut_16_4 = null;
            String stackOut_16_5 = null;
            vh stackOut_15_0 = null;
            java.net.URL stackOut_15_1 = null;
            java.net.URL stackOut_15_2 = null;
            java.net.URL stackOut_15_3 = null;
            StringBuilder stackOut_15_4 = null;
            String stackOut_15_5 = null;
            var6 = wizardrun.field_H;
            try {
              L0: {
                L1: {
                  var3_ref = "";
                  if (param0 != null) {
                    var3_ref = mj.a(param0, (byte) -91);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param1 != null) {
                    L3: {
                      if (param0 == null) {
                        break L3;
                      } else {
                        var3_ref = var3_ref + " | ";
                        break L3;
                      }
                    }
                    var3_ref = var3_ref + param1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L4: {
                  ve.a(118, var3_ref);
                  var7 = md.a(":", var3_ref, param2 + 29396, "%3a");
                  var8 = md.a("@", var7, 28834, "%40");
                  var9 = md.a("&", var8, 28834, "%26");
                  var10 = md.a("#", var9, param2 + 29396, "%23");
                  if (param2 == -562) {
                    break L4;
                  } else {
                    field_R = -121;
                    break L4;
                  }
                }
                if (null == ej.field_a) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  L5: {
                    stackOut_14_0 = qf.field_m;
                    stackOut_14_1 = null;
                    stackOut_14_2 = null;
                    stackOut_14_3 = ej.field_a.getCodeBase();
                    stackOut_14_4 = new StringBuilder().append("clienterror.ws?c=").append(fi.field_A).append("&u=");
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    stackIn_16_2 = stackOut_14_2;
                    stackIn_16_3 = stackOut_14_3;
                    stackIn_16_4 = stackOut_14_4;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    stackIn_15_2 = stackOut_14_2;
                    stackIn_15_3 = stackOut_14_3;
                    stackIn_15_4 = stackOut_14_4;
                    if (null != gf.field_Y) {
                      stackOut_16_0 = (vh) ((Object) stackIn_16_0);
                      stackOut_16_1 = null;
                      stackOut_16_2 = null;
                      stackOut_16_3 = (java.net.URL) ((Object) stackIn_16_3);
                      stackOut_16_4 = (StringBuilder) ((Object) stackIn_16_4);
                      stackOut_16_5 = gf.field_Y;
                      stackIn_17_0 = stackOut_16_0;
                      stackIn_17_1 = stackOut_16_1;
                      stackIn_17_2 = stackOut_16_2;
                      stackIn_17_3 = stackOut_16_3;
                      stackIn_17_4 = stackOut_16_4;
                      stackIn_17_5 = stackOut_16_5;
                      break L5;
                    } else {
                      stackOut_15_0 = (vh) ((Object) stackIn_15_0);
                      stackOut_15_1 = null;
                      stackOut_15_2 = null;
                      stackOut_15_3 = (java.net.URL) ((Object) stackIn_15_3);
                      stackOut_15_4 = (StringBuilder) ((Object) stackIn_15_4);
                      stackOut_15_5 = "" + h.field_m;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      stackIn_17_2 = stackOut_15_2;
                      stackIn_17_3 = stackOut_15_3;
                      stackIn_17_4 = stackOut_15_4;
                      stackIn_17_5 = stackOut_15_5;
                      break L5;
                    }
                  }
                  var4 = ((vh) (Object) stackIn_17_0).a(new java.net.URL(stackIn_17_3, stackIn_17_5 + "&v1=" + vh.field_p + "&v2=" + vh.field_b + "&e=" + var10), 123);
                  L6: while (true) {
                    if (var4.field_a != 0) {
                      L7: {
                        if (var4.field_a != 1) {
                          break L7;
                        } else {
                          var5 = (DataInputStream) (var4.field_e);
                          discarded$1 = var5.read();
                          var5.close();
                          break L7;
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      tg.a(1L, false);
                      continue L6;
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L8: {
                var3 = (Exception) (Object) decompiledCaughtException;
                decompiledRegionSelector0 = 1;
                break L8;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    void g(byte param0) {
        if (-1 > (this.field_O ^ -1)) {
          this.a(6154, this.field_M, this.field_N);
          if (param0 != -3) {
            return;
          } else {
            this.field_O = 0;
            this.j(-8144);
            return;
          }
        } else {
          return;
        }
    }

    rg(wi param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_O = 0;
        this.field_T = 0;
    }

    public static void i(int param0) {
        field_S = null;
        if (param0 != -6) {
            String var2 = (String) null;
            rg.a((Throwable) null, (String) null, -82);
            return;
        }
    }

    void b(int param0, int param1, int param2) {
        int var4 = 0;
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
        int var16 = 0;
        var16 = wizardrun.field_H;
        ed.e(param0 + 6, param2 - -35, this.field_r - 12, this.field_n - 40, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 0;
        var8 = param2;
        L0: while (true) {
          if (var4 <= var7) {
            var6 = 169;
            var5 = 194;
            var4 = 22;
            var7 = 0;
            var8 = param2 + 35;
            L1: while (true) {
              if (var4 <= var7) {
                hg.field_d.e(-90 + (this.field_r + param0), param2 + 10);
                nf.a(5 + param0, param2 + 35, -10 + this.field_r, (byte) -106, ok.field_a);
                nf.a(param0, param2 - (-this.field_n - -22), this.field_r, (byte) -114, ia.field_i);
                var5 = 169;
                var6 = 127;
                var4 = this.field_n - 79;
                var7 = 0;
                var8 = param2 + 57;
                if (param1 == -1) {
                  L2: while (true) {
                    if (var7 >= var4) {
                      return;
                    } else {
                      var9 = var7 * (var6 - var5) / var4 + var5;
                      var9 = var9 | (var9 << -813635792 | var9 << -1380555832);
                      ed.f(param0, var8, 6, var9);
                      ed.f(-6 + (param0 - -this.field_r), var8, 6, var9);
                      var7++;
                      var8++;
                      continue L2;
                    }
                  }
                } else {
                  rg.i(61);
                  L3: while (true) {
                    if (var7 >= var4) {
                      return;
                    } else {
                      var9 = var7 * (var6 - var5) / var4 + var5;
                      var9 = var9 | (var9 << -813635792 | var9 << -1380555832);
                      ed.f(param0, var8, 6, var9);
                      ed.f(-6 + (param0 - -this.field_r), var8, 6, var9);
                      var7++;
                      var8++;
                      continue L3;
                    }
                  }
                }
              } else {
                var9 = var5 + (-var5 + var6) * var7 / var4;
                var9 = var9 | (var9 << 2003382472 | var9 << 628685072);
                ed.f(param0, var8, 6, var9);
                ed.f(this.field_r + (param0 + -6), var8, 6, var9);
                var8++;
                var7++;
                continue L1;
              }
            }
          } else {
            if (var8 >= ed.field_i) {
              if (ed.field_b > var8) {
                L4: {
                  var9 = var7 * (var6 + -var5) / var4 + var5;
                  var10 = 0;
                  var11 = this.field_r;
                  if (20 >= var7) {
                    L5: while (true) {
                      if (-21 > (var10 ^ -1)) {
                        break L4;
                      } else {
                        var12 = (20 + -var10) * (-var10 + 20) + (-var7 + 20) * (-var7 + 20);
                        if (var12 <= 462) {
                          if ((var12 ^ -1) <= -421) {
                            var13 = (462 + -var12) * var9 / 42;
                            var13 = var13 | (var13 << -1922040592 | var13 << -1323366616);
                            ed.field_k[var8 * ed.field_h + param0 - -var10] = var13;
                            var10++;
                            continue L5;
                          } else {
                            break L4;
                          }
                        } else {
                          var10++;
                          continue L5;
                        }
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                L6: {
                  if (var7 <= 20) {
                    var12 = var11;
                    var11 -= 21;
                    var13 = 0;
                    L7: while (true) {
                      L8: {
                        if (var13 > 20) {
                          break L8;
                        } else {
                          var14 = (20 + -var7) * (-var7 + 20) + var13 * var13;
                          if (-463 <= (var14 ^ -1)) {
                            if (-421 < (var14 ^ -1)) {
                              var12 = var11 - -1;
                              var13++;
                              var11++;
                              continue L7;
                            } else {
                              var15 = (462 - var14) * var9 / 42;
                              var15 = var15 | (var15 << 1098962416 | var15 << -20939352);
                              ed.field_k[var11 + ed.field_h * var8 - -param0] = var15;
                              var13++;
                              var11++;
                              continue L7;
                            }
                          } else {
                            break L8;
                          }
                        }
                      }
                      var11 = var12;
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
                var9 = var9 | (var9 << 2128477512 | var9 << -931083280);
                ed.f(var10 - -param0, var8, -var10 + var11, var9);
                var7++;
                var8++;
                continue L0;
              } else {
                var7++;
                var8++;
                continue L0;
              }
            } else {
              var7++;
              var8++;
              continue L0;
            }
          }
        }
    }

    boolean a(int param0) {
        this.g((byte) -3);
        if (param0 != 16) {
          rg.i(-88);
          return super.a(param0 + 0);
        } else {
          return super.a(param0 + 0);
        }
    }

    boolean g(int param0) {
        int fieldTemp$1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        if (this.field_O <= 0) {
          if (param0 != 1) {
            var6 = (String) null;
            rg.a((Throwable) null, (String) null, 94);
            return super.g(1);
          } else {
            return super.g(1);
          }
        } else {
          var2 = this.field_N;
          var3 = this.field_M;
          fieldTemp$1 = this.field_T + 1;
          this.field_T = this.field_T + 1;
          if (this.field_O <= fieldTemp$1) {
            this.field_O = 0;
            this.j(-8144);
            this.a(6154, var3, var2);
            if (param0 == 1) {
              return super.g(1);
            } else {
              var6 = (String) null;
              rg.a((Throwable) null, (String) null, 94);
              return super.g(1);
            }
          } else {
            var4 = this.field_T * (-this.field_T + 2 * this.field_O);
            var5 = this.field_O * this.field_O;
            var2 = var4 * (this.field_N - this.field_L) / var5 + this.field_L;
            var3 = this.field_Q + var4 * (this.field_M - this.field_Q) / var5;
            this.a(6154, var3, var2);
            if (param0 == 1) {
              return super.g(1);
            } else {
              var6 = (String) null;
              rg.a((Throwable) null, (String) null, 94);
              return super.g(1);
            }
          }
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (!(param2 < param3)) {
            this.a(6154, param1, param0);
            return;
        }
        this.field_T = 0;
        this.field_Q = this.field_n;
        this.field_M = param1;
        this.field_O = param3;
        this.field_L = this.field_r;
        this.field_N = param0;
    }

    static {
    }
}
