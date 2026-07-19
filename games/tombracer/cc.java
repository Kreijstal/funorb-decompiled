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
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_9_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        if (!this.a(false)) {
          return;
        } else {
          L0: {
            stackOut_3_0 = param1;
            stackIn_5_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (!this.b(true)) {
              stackOut_5_0 = stackIn_5_0;
              stackOut_5_1 = jw.field_z[this.field_g];
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              break L0;
            } else {
              stackOut_4_0 = stackIn_4_0;
              stackOut_4_1 = this.field_j;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              break L0;
            }
          }
          L1: {
            var4 = stackIn_6_0 - -stackIn_6_1;
            if (this.b(true)) {
              stackOut_8_0 = this.field_k;
              stackIn_9_0 = stackOut_8_0;
              break L1;
            } else {
              stackOut_7_0 = hq.field_b[this.field_g];
              stackIn_9_0 = stackOut_7_0;
              break L1;
            }
          }
          var5 = stackIn_9_0 + param2;
          this.a(this.field_h, param2 + hq.field_b[this.field_i], var4, var5, jw.field_z[this.field_i] + param1, (byte) 35);
          if (param0 != 99) {
            L2: {
              field_l = (String) null;
              if (this.b(true)) {
                this.a(this.field_f, var5, param1 - -jw.field_z[this.field_g], hq.field_b[this.field_g] + param2, var4, (byte) 35);
                uda.field_r.a(this.field_j + param1 + uda.field_r.a(), param2 + (this.field_k + uda.field_r.c()));
                break L2;
              } else {
                break L2;
              }
            }
            return;
          } else {
            L3: {
              if (this.b(true)) {
                this.a(this.field_f, var5, param1 - -jw.field_z[this.field_g], hq.field_b[this.field_g] + param2, var4, (byte) 35);
                uda.field_r.a(this.field_j + param1 + uda.field_r.a(), param2 + (this.field_k + uda.field_r.c()));
                break L3;
              } else {
                break L3;
              }
            }
            return;
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, byte param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = TombRacer.field_G ? 1 : 0;
          var7 = param2 + -param4 << 1158868720;
          var8 = -param1 + param3 << -1419409680;
          var9 = var7 / (param0 + 1);
          var10 = var8 / (1 + param0);
          var11 = 1;
          if (!bma.d(107, this.field_i)) {
            var11 = 0;
            break L0;
          } else {
            if (bma.d(-121, this.field_g)) {
              break L0;
            } else {
              var11 = 0;
              var12 = 0;
              if (param5 != 35) {
                this.field_g = -113;
                L1: while (true) {
                  if (var12 < param0) {
                    uda.field_r.a((var9 * (1 + var12) >> 39471760) + (param4 - -uda.field_r.a()), param1 + (var10 * (var12 - -1) >> -1779826736) + uda.field_r.c(), var11, -1695485712, 1);
                    var12++;
                    if (var13 == 0) {
                      continue L1;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                L2: while (true) {
                  if (var12 < param0) {
                    uda.field_r.a((var9 * (1 + var12) >> 39471760) + (param4 - -uda.field_r.a()), param1 + (var10 * (var12 - -1) >> -1779826736) + uda.field_r.c(), var11, -1695485712, 1);
                    var12++;
                    if (var13 == 0) {
                      continue L2;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
          }
        }
        var12 = 0;
        if (param5 != 35) {
          this.field_g = -113;
          L3: while (true) {
            if (var12 < param0) {
              uda.field_r.a((var9 * (1 + var12) >> 39471760) + (param4 - -uda.field_r.a()), param1 + (var10 * (var12 - -1) >> -1779826736) + uda.field_r.c(), var11, -1695485712, 1);
              var12++;
              if (var13 == 0) {
                continue L3;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          L4: while (true) {
            if (var12 < param0) {
              uda.field_r.a((var9 * (1 + var12) >> 39471760) + (param4 - -uda.field_r.a()), param1 + (var10 * (var12 - -1) >> -1779826736) + uda.field_r.c(), var11, -1695485712, 1);
              var12++;
              if (var13 == 0) {
                continue L4;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final boolean b(boolean param0) {
        if (!param0) {
            return false;
        }
        return -1 != this.field_j ? true : false;
    }

    final boolean a(pfa param0, int param1, byte param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int[] stackIn_12_0 = null;
        int[] stackIn_13_0 = null;
        int[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int[] stackIn_15_0 = null;
        int[] stackIn_16_0 = null;
        int[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_50_0 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        int[] stackOut_11_0 = null;
        int[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int[] stackOut_14_0 = null;
        int[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        try {
          L0: {
            if (!this.a((byte) -95, param0)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                L2: {
                  var4_int = param0.field_j >> -645428560;
                  var5 = param0.field_e >> -1233826000;
                  if (this.b(true)) {
                    break L2;
                  } else {
                    L3: {
                      if (var4_int == jw.field_z[this.field_i]) {
                        if (hq.field_b[this.field_i] == var5) {
                          stackOut_9_0 = 1;
                          stackIn_11_0 = stackOut_9_0;
                          break L3;
                        } else {
                          stackOut_8_0 = 0;
                          stackIn_11_0 = stackOut_8_0;
                          break L3;
                        }
                      } else {
                        stackOut_6_0 = 0;
                        stackIn_11_0 = stackOut_6_0;
                        break L3;
                      }
                    }
                    L4: {
                      var8 = stackIn_11_0;
                      stackOut_11_0 = jw.field_z;
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_12_0 = stackOut_11_0;
                      if (var8 == 0) {
                        stackOut_13_0 = (int[]) ((Object) stackIn_13_0);
                        stackOut_13_1 = this.field_i;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        break L4;
                      } else {
                        stackOut_12_0 = (int[]) ((Object) stackIn_12_0);
                        stackOut_12_1 = this.field_g;
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        break L4;
                      }
                    }
                    L5: {
                      var6 = stackIn_14_0[stackIn_14_1];
                      stackOut_14_0 = hq.field_b;
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_15_0 = stackOut_14_0;
                      if (var8 != 0) {
                        stackOut_16_0 = (int[]) ((Object) stackIn_16_0);
                        stackOut_16_1 = this.field_g;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        break L5;
                      } else {
                        stackOut_15_0 = (int[]) ((Object) stackIn_15_0);
                        stackOut_15_1 = this.field_i;
                        stackIn_17_0 = stackOut_15_0;
                        stackIn_17_1 = stackOut_15_1;
                        break L5;
                      }
                    }
                    var7 = stackIn_17_0[stackIn_17_1];
                    if (!TombRacer.field_G) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var7 = this.field_k;
                var6 = this.field_j;
                break L1;
              }
              var8 = var6 + -var4_int;
              var9 = -var5 + var7;
              if (param2 == 116) {
                if (var8 * var8 > var9 * var9) {
                  L6: {
                    L7: {
                      L8: {
                        L9: {
                          if (kda.field_hd == param1) {
                            break L9;
                          } else {
                            if (param1 != 96) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        if (-1 < (var8 ^ -1)) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                      L10: {
                        if (param1 == mf.field_a) {
                          break L10;
                        } else {
                          if ((param1 ^ -1) != -98) {
                            stackOut_47_0 = 0;
                            stackIn_48_0 = stackOut_47_0;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          } else {
                            break L10;
                          }
                        }
                      }
                      if (-1 > (var8 ^ -1)) {
                        break L7;
                      } else {
                        stackOut_44_0 = 0;
                        stackIn_46_0 = stackOut_44_0;
                        break L6;
                      }
                    }
                    stackOut_45_0 = 1;
                    stackIn_46_0 = stackOut_45_0;
                    break L6;
                  }
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  L11: {
                    L12: {
                      L13: {
                        if (mi.field_k == param1) {
                          break L13;
                        } else {
                          if ((param1 ^ -1) != -99) {
                            break L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                      if (0 > var9) {
                        break L11;
                      } else {
                        break L12;
                      }
                    }
                    L14: {
                      if (fp.field_a == param1) {
                        break L14;
                      } else {
                        if (99 != param1) {
                          stackOut_49_0 = 0;
                          stackIn_50_0 = stackOut_49_0;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          break L14;
                        }
                      }
                    }
                    if (var9 > 0) {
                      break L11;
                    } else {
                      return false;
                    }
                  }
                  stackOut_33_0 = 1;
                  stackIn_34_0 = stackOut_33_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_20_0 = 1;
                stackIn_21_0 = stackOut_20_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var4 = decompiledCaughtException;
            stackOut_51_0 = (RuntimeException) (var4);
            stackOut_51_1 = new StringBuilder().append("cc.C(");
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param0 == null) {
              stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackOut_53_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L15;
            } else {
              stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackOut_52_2 = "{...}";
              stackIn_54_0 = stackOut_52_0;
              stackIn_54_1 = stackOut_52_1;
              stackIn_54_2 = stackOut_52_2;
              break L15;
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
            field_l = null;
            return;
        }
        field_l = null;
    }

    private final boolean a(byte param0, pfa param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_2_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
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
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L1;
                }
                stackOut_9_0 = 1;
                stackIn_11_0 = stackOut_9_0;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3);
            stackOut_12_1 = new StringBuilder().append("cc.G(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
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
        String var3 = null;
        if (!param0) {
          if (mca.a((byte) 6, this.field_i)) {
            if (!mca.a((byte) 6, this.field_g)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          var3 = (String) null;
          cc.a(42, (java.applet.Applet) null, (String) null);
          if (mca.a((byte) 6, this.field_i)) {
            if (!mca.a((byte) 6, this.field_g)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
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
        nl stackIn_8_0 = null;
        nl stackIn_10_0 = null;
        nl stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        nl stackOut_3_0 = null;
        nl stackOut_7_0 = null;
        nl stackOut_9_0 = null;
        nl stackOut_12_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = -61 / ((param0 - 61) / 57);
            var3 = og.a(param1, "jagex-last-login-method", (byte) 86);
            if (var3 == null) {
              stackOut_3_0 = npa.field_f;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4 = aga.a(-1025);
              var5 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var5 >= var4.length) {
                      break L3;
                    } else {
                      var6 = var4[var5];
                      stackOut_7_0 = (nl) (var6);
                      stackIn_13_0 = stackOut_7_0;
                      stackIn_8_0 = stackOut_7_0;
                      if (var7 != 0) {
                        break L2;
                      } else {
                        if (!((nl) (Object) stackIn_8_0).a(var3, 5)) {
                          var5++;
                          if (var7 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        } else {
                          stackOut_9_0 = (nl) (var6);
                          stackIn_10_0 = stackOut_9_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                  stackOut_12_0 = npa.field_f;
                  stackIn_13_0 = stackOut_12_0;
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var2);
            stackOut_14_1 = new StringBuilder().append("cc.F(").append(param0).append(',');
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
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0;
          } else {
            return stackIn_10_0;
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
