/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bw extends qt {
    static boolean field_d;
    static String field_c;

    public static void c(byte param0) {
        if (param0 <= 110) {
            bw.c((byte) 4);
            field_c = null;
            return;
        }
        field_c = null;
    }

    final void a(boolean param0, ha param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        ha var5 = null;
        int var6 = 0;
        hr[] var7 = null;
        int var8 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param0) {
              wo.a(up.field_c, 360, -5, -16777216, 3, param1, 650, 50, 1, param0);
              hc.field_e.a(hc.field_d, -1, -16777216, 150, 320, 0);
              var3_int = 45;
              var4 = 0;
              L1: while (true) {
                if (-601 >= (var3_int ^ -1)) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var5 = param1;
                  var6 = var3_int;
                  var7 = up.field_c;
                  wo.a(var7, 100, var6, 0, 1, var5, 250, 200, 1, true);
                  if (var8 == 0) {
                    L2: {
                      L3: {
                        if (this.field_a == var4) {
                          break L3;
                        } else {
                          hc.field_e.a(vd.field_a[var4], -1, -16777216, 260, 125 + var3_int, 0);
                          if (var8 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      be.field_t.a(vd.field_a[var4], -1, -16777216, 258, var3_int - -125 - 4, 0);
                      break L2;
                    }
                    var4++;
                    var3_int += 300;
                    continue L1;
                  } else {
                    return;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("bw.J(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static wb[] b(int param0) {
        wb[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var13 = null;
        int[] var15 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        boolean stackIn_3_0 = false;
        int stackIn_22_0 = 0;
        boolean stackOut_2_0 = false;
        int stackOut_21_0 = 0;
        var9 = Sumoblitz.field_L ? 1 : 0;
        var1 = new wb[rl.field_n];
        var2 = 0;
        var3 = 126 / ((-69 - param0) / 52);
        L0: while (true) {
          L1: {
            L2: {
              if (var2 >= rl.field_n) {
                break L2;
              } else {
                var4 = we.field_B[var2] * vg.field_k[var2];
                var18 = ag.field_d[var2];
                stackOut_2_0 = og.field_d[var2];
                stackIn_22_0 = stackOut_2_0 ? 1 : 0;
                stackIn_3_0 = stackOut_2_0;
                if (var9 != 0) {
                  break L1;
                } else {
                  L3: {
                    L4: {
                      L5: {
                        if (stackIn_3_0) {
                          break L5;
                        } else {
                          var10 = new int[var4];
                          var7_int = 0;
                          L6: while (true) {
                            L7: {
                              if (var7_int >= var4) {
                                var1[var2] = new wb(vf.field_d, li.field_u, er.field_h[var2], av.field_C[var2], vg.field_k[var2], we.field_B[var2], var10);
                                break L7;
                              } else {
                                var10[var7_int] = iv.field_l[eb.a((int) var18[var7_int], 255)];
                                var7_int++;
                                if (var9 != 0) {
                                  break L7;
                                } else {
                                  continue L6;
                                }
                              }
                            }
                            if (var9 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      var19 = fl.field_o[var2];
                      var15 = new int[var4];
                      var13 = var15;
                      var7 = var13;
                      var8 = 0;
                      L8: while (true) {
                        if (var8 >= var4) {
                          var1[var2] = (wb) ((Object) new mg(vf.field_d, li.field_u, er.field_h[var2], av.field_C[var2], vg.field_k[var2], we.field_B[var2], var15));
                          break L4;
                        } else {
                          var7[var8] = ic.a(iv.field_l[eb.a((int) var18[var8], 255)], eb.a((int) var19[var8], 255) << 596863480);
                          var8++;
                          if (var9 != 0) {
                            break L3;
                          } else {
                            continue L8;
                          }
                        }
                      }
                    }
                    var2++;
                    break L3;
                  }
                  if (var9 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_21_0 = -46;
            stackIn_22_0 = stackOut_21_0;
            break L1;
          }
          tl.a((byte) stackIn_22_0);
          return var1;
        }
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (param0 == 5008) {
          var2 = (ko.field_p + -45) / 300;
          var3 = (pi.field_e + -200) / 100;
          this.field_a = var2 + 2 * var3;
          if (-251 <= ((ko.field_p - 45) % 300 ^ -1)) {
            L0: {
              if (-3 >= (this.field_a ^ -1)) {
                this.field_a = -1;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (hk.field_c != 1) {
                break L1;
              } else {
                if (this.field_a == 0) {
                  wt.a(1 + oh.field_e % 5, (byte) 56);
                  this.b((byte) -127);
                  return;
                } else {
                  av.a(-7753, true, 7);
                  ut.field_j = 0;
                  ag.a(0, 0);
                  ph.field_b.a(88);
                  this.b((byte) -128);
                  if (!Sumoblitz.field_L) {
                    break L1;
                  } else {
                    wt.a(1 + oh.field_e % 5, (byte) 56);
                    this.b((byte) -127);
                    return;
                  }
                }
              }
            }
            return;
          } else {
            L2: {
              this.field_a = -1;
              if (-3 >= (this.field_a ^ -1)) {
                this.field_a = -1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (hk.field_c != 1) {
                break L3;
              } else {
                if (this.field_a == 0) {
                  wt.a(1 + oh.field_e % 5, (byte) 56);
                  this.b((byte) -127);
                  return;
                } else {
                  av.a(-7753, true, 7);
                  ut.field_j = 0;
                  ag.a(0, 0);
                  ph.field_b.a(88);
                  this.b((byte) -128);
                  if (!Sumoblitz.field_L) {
                    break L3;
                  } else {
                    wt.a(1 + oh.field_e % 5, (byte) 56);
                    this.b((byte) -127);
                    return;
                  }
                }
              }
            }
            return;
          }
        } else {
          field_c = (String) null;
          var2 = (ko.field_p + -45) / 300;
          var3 = (pi.field_e + -200) / 100;
          this.field_a = var2 + 2 * var3;
          if (-251 > ((ko.field_p - 45) % 300 ^ -1)) {
            L4: {
              this.field_a = -1;
              if (-3 >= (this.field_a ^ -1)) {
                this.field_a = -1;
                break L4;
              } else {
                break L4;
              }
            }
            if (hk.field_c == 1) {
              if (this.field_a == 0) {
                wt.a(1 + oh.field_e % 5, (byte) 56);
                this.b((byte) -127);
                return;
              } else {
                av.a(-7753, true, 7);
                ut.field_j = 0;
                ag.a(0, 0);
                ph.field_b.a(88);
                this.b((byte) -128);
                if (!Sumoblitz.field_L) {
                  return;
                } else {
                  wt.a(1 + oh.field_e % 5, (byte) 56);
                  this.b((byte) -127);
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            L5: {
              if (-3 >= (this.field_a ^ -1)) {
                this.field_a = -1;
                break L5;
              } else {
                break L5;
              }
            }
            if (hk.field_c == 1) {
              if (this.field_a != 0) {
                av.a(-7753, true, 7);
                ut.field_j = 0;
                ag.a(0, 0);
                ph.field_b.a(88);
                this.b((byte) -128);
                if (!Sumoblitz.field_L) {
                  return;
                } else {
                  wt.a(1 + oh.field_e % 5, (byte) 56);
                  this.b((byte) -127);
                  return;
                }
              } else {
                wt.a(1 + oh.field_e % 5, (byte) 56);
                this.b((byte) -127);
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        try {
            rq.field_d = true;
            var2 = "tuhstatbut";
            if (param0) {
                java.applet.Applet var6 = (java.applet.Applet) null;
                bw.a(true, (java.applet.Applet) null);
            }
            var3 = "rvnadlm";
            var4 = -1L;
            gj.a(var4, param1, true, var3, var2);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "bw.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public bw() {
    }

    static {
        field_c = "REASSIGN POWERUPS";
    }
}
