/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc extends vg {
    int field_i;
    int field_g;
    static String field_l;
    private int field_f;
    private int field_h;
    int field_k;
    int field_j;

    final void a(int param0, int param1, int param2) {
        if (!(this.a(false))) {
            return;
        }
        int var4 = param1 - -(this.b(true) ? this.field_j : jw.field_z[this.field_g]);
        int var5 = (!this.b(true) ? hq.field_b[this.field_g] : this.field_k) + param2;
        this.a(this.field_h, param2 + hq.field_b[this.field_i], var4, var5, jw.field_z[this.field_i] + param1, (byte) 35);
        if (param0 != 99) {
            field_l = (String) null;
        }
        if (!(!this.b(true))) {
            this.a(this.field_f, var5, param1 - -jw.field_z[this.field_g], hq.field_b[this.field_g] + param2, var4, (byte) 35);
            uda.field_r.a(this.field_j + param1 + uda.field_r.a(), param2 + (this.field_k + uda.field_r.c()));
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, byte param5) {
        int var13 = TombRacer.field_G ? 1 : 0;
        int var7 = param2 + -param4 << 1158868720;
        int var8 = -param1 + param3 << -1419409680;
        int var9 = var7 / (param0 + 1);
        int var10 = var8 / (1 + param0);
        int var11 = 1;
        if (!bma.d(107, this.field_i) || !bma.d(-121, this.field_g)) {
            var11 = 0;
        }
        int var12 = 0;
        if (param5 != 35) {
            this.field_g = -113;
        }
        while (var12 < param0) {
            uda.field_r.a((var9 * (1 + var12) >> 39471760) + (param4 - -uda.field_r.a()), param1 + (var10 * (var12 - -1) >> -1779826736) + uda.field_r.c(), var11, -1695485712, 1);
            var12++;
        }
    }

    final boolean b(boolean param0) {
        if (!param0) {
            return false;
        }
        return -1 != this.field_j ? true : false;
    }

    final boolean a(pfa param0, int param1, byte param2) {
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int[] stackIn_13_0 = null;
        int[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int[] stackIn_16_0 = null;
        int[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_50_0 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        try {
          L0: {
            if (!this.a((byte) -95, param0)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var4_int = param0.field_j >> -645428560;
                var5 = param0.field_e >> -1233826000;
                if (this.b(true)) {
                  var7 = this.field_k;
                  var6 = this.field_j;
                  break L1;
                } else {
                  L2: {
                    if (var4_int == jw.field_z[this.field_i]) {
                      if (hq.field_b[this.field_i] == var5) {
                        stackIn_11_0 = 1;
                        break L2;
                      } else {
                        stackIn_11_0 = 0;
                        break L2;
                      }
                    } else {
                      stackIn_11_0 = 0;
                      break L2;
                    }
                  }
                  L3: {
                    var8 = stackIn_11_0;
                    stackIn_13_0 = jw.field_z;

                    if (var8 == 0) {
                      stackIn_14_0 = (int[]) ((Object) stackIn_13_0);
                      stackIn_14_1 = this.field_i;
                      break L3;
                    } else {
                      stackIn_14_0 = (int[]) ((Object) stackIn_13_0);
                      stackIn_14_1 = this.field_g;
                      break L3;
                    }
                  }
                  L4: {
                    var6 = stackIn_14_0[stackIn_14_1];
                    stackIn_16_0 = hq.field_b;

                    if (var8 != 0) {
                      stackIn_17_0 = (int[]) ((Object) stackIn_16_0);
                      stackIn_17_1 = this.field_g;
                      break L4;
                    } else {
                      stackIn_17_0 = (int[]) ((Object) stackIn_16_0);
                      stackIn_17_1 = this.field_i;
                      break L4;
                    }
                  }
                  var7 = stackIn_17_0[stackIn_17_1];
                  break L1;
                }
              }
              var8 = var6 + -var4_int;
              var9 = -var5 + var7;
              if (param2 == 116) {
                if (var8 * var8 > var9 * var9) {
                  L5: {
                    L6: {
                      L7: {
                        L8: {
                          if (kda.field_hd == param1) {
                            break L8;
                          } else {
                            if (param1 != 96) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        if (-1 < (var8 ^ -1)) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                      L9: {
                        if (param1 == mf.field_a) {
                          break L9;
                        } else {
                          if ((param1 ^ -1) != -98) {
                            stackIn_48_0 = 0;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          } else {
                            break L9;
                          }
                        }
                      }
                      if (-1 > (var8 ^ -1)) {
                        break L6;
                      } else {
                        stackIn_46_0 = 0;
                        break L5;
                      }
                    }
                    stackIn_46_0 = 1;
                    break L5;
                  }
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  L10: {
                    L11: {
                      L12: {
                        if (mi.field_k == param1) {
                          break L12;
                        } else {
                          if ((param1 ^ -1) != -99) {
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      if (0 > var9) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                    L13: {
                      if (fp.field_a == param1) {
                        break L13;
                      } else {
                        if (99 != param1) {
                          stackIn_50_0 = 0;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          break L13;
                        }
                      }
                    }
                    if (var9 > 0) {
                      break L10;
                    } else {
                      return false;
                    }
                  }
                  stackIn_34_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_21_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var4 = decompiledCaughtException;
            stackIn_53_0 = (RuntimeException) (var4);

            stackIn_53_1 = new StringBuilder().append("cc.C(");

            if (param0 == null) {
              stackIn_54_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "null";
              break L14;
            } else {
              stackIn_54_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "{...}";
              break L14;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_54_0), stackIn_54_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_21_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_34_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_46_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_48_0 != 0;
                } else {
                  return stackIn_50_0 != 0;
                }
              }
            }
          }
        }
    }

    final static void a(int param0, java.applet.Applet param1, String param2) {
        try {
            String var7 = null;
            String var4 = null;
            String var8 = null;
            String var5 = null;
            try {
                aia.field_j = param2;
                try {
                    var7 = param1.getParameter("cookieprefix");
                    if (param0 <= 1) {
                        String var6 = (String) null;
                        cc.a(-59, (java.applet.Applet) null, (String) null);
                    }
                    var4 = param1.getParameter("cookiehost");
                    var8 = var7 + "session=" + param2 + "; version=1; path=/; domain=" + var4;
                    var5 = var8;
                    if (!(0 != param2.length())) {
                        var5 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    }
                    lb.a(param1, 19467, "document.cookie=\"" + var5 + "\"");
                } catch (Throwable throwable) {
                }
                v.a((byte) 64, param1);
            } catch (RuntimeException runtimeException) {
                throw tba.a((Throwable) ((Object) runtimeException), "cc.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            cc.a(62);
        }
        field_l = null;
    }

    private final boolean a(byte param0, pfa param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_2_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 <= -92) {
              L1: {
                L2: {
                  L3: {
                    var3_int = param1.field_j >> -368605424;
                    var4 = param1.field_e >> 1910987216;
                    if (var3_int != jw.field_z[this.field_i]) {
                      break L3;
                    } else {
                      if (hq.field_b[this.field_i] == var4) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (jw.field_z[this.field_g] != var3_int) {
                      break L4;
                    } else {
                      if (var4 != hq.field_b[this.field_g]) {
                        break L4;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackIn_11_0 = 0;
                  break L1;
                }
                stackIn_11_0 = 1;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("cc.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    private final boolean a(boolean param0) {
        String var3;
        int stackIn_6_0 = 0;
        L0: {
          if (!param0) {
            break L0;
          } else {
            var3 = (String) null;
            cc.a(42, (java.applet.Applet) null, (String) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if (!mca.a((byte) 6, this.field_i)) {
              break L2;
            } else {
              if (!mca.a((byte) 6, this.field_g)) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    cc(int param0, int param1, int param2) {
        this(param0, param1, -1, -1, param2, 0);
    }

    final static nl a(byte param0, java.applet.Applet param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        nl[] var4 = null;
        int var5 = 0;
        nl var6 = null;
        int var7 = 0;
        nl stackIn_4_0 = null;
        nl stackIn_9_0 = null;
        nl stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = -61 / ((param0 - 61) / 57);
            var3 = og.a(param1, "jagex-last-login-method", (byte) 86);
            if (var3 == null) {
              stackIn_4_0 = npa.field_f;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4 = aga.a(-1025);
              var5 = 0;
              L1: while (true) {
                if (var5 >= var4.length) {
                  stackIn_12_0 = npa.field_f;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var6 = var4[var5];
                  if (!var6.a(var3, 5)) {
                    var5++;
                    continue L1;
                  } else {
                    stackIn_9_0 = (nl) (var6);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var2);

            stackIn_15_1 = new StringBuilder().append("cc.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    cc(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_i = param0;
        this.field_j = param2;
        this.field_f = param5;
        this.field_h = param4;
        this.field_g = param1;
        this.field_k = param3;
    }

    static {
        field_l = "Finish Time:";
    }
}
