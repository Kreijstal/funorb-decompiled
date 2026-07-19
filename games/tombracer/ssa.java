/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ssa {
    private iea field_c;
    private int[] field_a;
    private ha field_b;
    static String field_d;
    static jea field_g;
    private iea field_f;
    private nh field_e;

    final static void a(String param0, byte param1, Throwable param2) {
        try {
            int discarded$1 = 0;
            Exception var3 = null;
            String var3_ref = null;
            naa var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            fia stackIn_15_0 = null;
            java.net.URL stackIn_15_1 = null;
            java.net.URL stackIn_15_2 = null;
            java.net.URL stackIn_15_3 = null;
            StringBuilder stackIn_15_4 = null;
            fia stackIn_16_0 = null;
            java.net.URL stackIn_16_1 = null;
            java.net.URL stackIn_16_2 = null;
            java.net.URL stackIn_16_3 = null;
            StringBuilder stackIn_16_4 = null;
            fia stackIn_17_0 = null;
            java.net.URL stackIn_17_1 = null;
            java.net.URL stackIn_17_2 = null;
            java.net.URL stackIn_17_3 = null;
            StringBuilder stackIn_17_4 = null;
            String stackIn_17_5 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            fia stackOut_14_0 = null;
            java.net.URL stackOut_14_1 = null;
            java.net.URL stackOut_14_2 = null;
            java.net.URL stackOut_14_3 = null;
            StringBuilder stackOut_14_4 = null;
            fia stackOut_16_0 = null;
            java.net.URL stackOut_16_1 = null;
            java.net.URL stackOut_16_2 = null;
            java.net.URL stackOut_16_3 = null;
            StringBuilder stackOut_16_4 = null;
            String stackOut_16_5 = null;
            fia stackOut_15_0 = null;
            java.net.URL stackOut_15_1 = null;
            java.net.URL stackOut_15_2 = null;
            java.net.URL stackOut_15_3 = null;
            StringBuilder stackOut_15_4 = null;
            String stackOut_15_5 = null;
            var6 = TombRacer.field_G ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (param1 >= 112) {
                    break L1;
                  } else {
                    ssa.d(-5);
                    break L1;
                  }
                }
                L2: {
                  var3_ref = "";
                  if (param2 == null) {
                    break L2;
                  } else {
                    var3_ref = qi.a(107, param2);
                    break L2;
                  }
                }
                L3: {
                  if (param0 != null) {
                    L4: {
                      if (param2 != null) {
                        var3_ref = var3_ref + " | ";
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var3_ref = var3_ref + param0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                upa.a(var3_ref, (byte) -24);
                var7 = qf.a(966747152, "%3a", ":", var3_ref);
                var8 = qf.a(966747152, "%40", "@", var7);
                var9 = qf.a(966747152, "%26", "&", var8);
                var10 = qf.a(966747152, "%23", "#", var9);
                if (dfa.field_e == null) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  L5: {
                    stackOut_14_0 = nea.field_c;
                    stackOut_14_1 = null;
                    stackOut_14_2 = null;
                    stackOut_14_3 = dfa.field_e.getCodeBase();
                    stackOut_14_4 = new StringBuilder().append("clienterror.ws?c=").append(sua.field_L).append("&u=");
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
                    if (toa.field_f != null) {
                      stackOut_16_0 = (fia) ((Object) stackIn_16_0);
                      stackOut_16_1 = null;
                      stackOut_16_2 = null;
                      stackOut_16_3 = (java.net.URL) ((Object) stackIn_16_3);
                      stackOut_16_4 = (StringBuilder) ((Object) stackIn_16_4);
                      stackOut_16_5 = toa.field_f;
                      stackIn_17_0 = stackOut_16_0;
                      stackIn_17_1 = stackOut_16_1;
                      stackIn_17_2 = stackOut_16_2;
                      stackIn_17_3 = stackOut_16_3;
                      stackIn_17_4 = stackOut_16_4;
                      stackIn_17_5 = stackOut_16_5;
                      break L5;
                    } else {
                      stackOut_15_0 = (fia) ((Object) stackIn_15_0);
                      stackOut_15_1 = null;
                      stackOut_15_2 = null;
                      stackOut_15_3 = (java.net.URL) ((Object) stackIn_15_3);
                      stackOut_15_4 = (StringBuilder) ((Object) stackIn_15_4);
                      stackOut_15_5 = "" + ic.field_b;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      stackIn_17_2 = stackOut_15_2;
                      stackIn_17_3 = stackOut_15_3;
                      stackIn_17_4 = stackOut_15_4;
                      stackIn_17_5 = stackOut_15_5;
                      break L5;
                    }
                  }
                  var4 = ((fia) (Object) stackIn_17_0).a(new java.net.URL(stackIn_17_3, stackIn_17_5 + "&v1=" + fia.field_e + "&v2=" + fia.field_v + "&e=" + var10), 122);
                  L6: while (true) {
                    L7: {
                      L8: {
                        if (var4.field_b != 0) {
                          break L8;
                        } else {
                          vja.a(0, 1L);
                          if (var6 != 0) {
                            break L7;
                          } else {
                            if (var6 == 0) {
                              continue L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      if (1 == var4.field_b) {
                        break L7;
                      } else {
                        return;
                      }
                    }
                    var5 = (DataInputStream) (var4.field_f);
                    discarded$1 = var5.read();
                    var5.close();
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (Exception) (Object) decompiledCaughtException;
              return;
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

    private final void c(int param0) {
        iea var2 = null;
        this.field_b.K(this.field_a);
        if (param0 != -31138) {
          return;
        } else {
          L0: {
            L1: {
              if (null == this.field_f) {
                break L1;
              } else {
                var2 = this.field_f;
                this.field_f = this.field_f.field_b;
                if (!TombRacer.field_G) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var2 = new iea();
            break L0;
          }
          var2.a(this.field_a[3], this.field_a[2], this.field_a[1], this.field_a[0], this.field_c, this.field_e, param0 ^ -31170);
          this.field_c = var2;
          return;
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        this.c(param2 ^ 31146);
        this.field_b.T(param4, param1, param0, param3);
        if (param2 != -12) {
            this.c(-41);
        }
    }

    final void a(int param0) {
        if (this.field_e != this.field_c.field_a) {
            this.field_b.d();
            if (!(this.field_c.field_a == null)) {
                this.field_b.a(this.field_c.field_a, true);
            }
            this.field_e = this.field_c.field_a;
        }
        this.field_b.KA(this.field_c.field_d, this.field_c.field_h, this.field_c.field_c, this.field_c.field_f);
        int var2 = -7 / ((param0 - 36) / 59);
        iea var3 = this.field_c;
        this.field_c = this.field_c.field_b;
        var3.field_b = this.field_f;
        var3.field_a = null;
        this.field_f = var3;
    }

    final static byte[] a(uia param0, int param1, boolean param2) throws Exception {
        int[] array$1 = null;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        Object var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int[] var19 = null;
        int[] var20 = null;
        uia var21 = null;
        uia var22 = null;
        byte[] var24 = null;
        int[] var25 = null;
        byte[] var27 = null;
        int[] var28 = null;
        int[] var31 = null;
        byte[] var32 = null;
        Object stackIn_5_0 = null;
        int[] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_38_2 = 0;
        int[] stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int stackIn_40_2 = 0;
        Object stackIn_59_0 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        int[] stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int stackOut_39_2 = 0;
        Object stackOut_58_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        var17 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var4 = -82 % ((41 - param1) / 37);
            var3_int = param0.d(121);
            if (var3_int != 0) {
              var5 = param0.field_h;
              var6 = var5 + var3_int;
              var7 = param0.d(126);
              if (2 < var7) {
                throw ssa.<RuntimeException>$cfr$sneakyThrow(new Exception("Local: header error: version=" + var7));
              } else {
                var28 = fqa.e(true);
                var25 = var28;
                var8 = var25;
                var31 = var8;
                var10_int = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      L4: {
                        if ((var10_int ^ -1) <= -9) {
                          break L4;
                        } else {
                          var31[var10_int] = 0;
                          var10_int++;
                          if (var17 != 0) {
                            break L3;
                          } else {
                            if (var17 == 0) {
                              continue L1;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      if (var7 == 0) {
                        break L3;
                      } else {
                        if (1 != var7) {
                          var20 = var8;
                          var22 = param0;
                          var11 = var22.h(255);
                          var12 = 0;
                          L5: while (true) {
                            if (var11 <= var12) {
                              break L2;
                            } else {
                              var20[var12] = var22.e(-35);
                              var12++;
                              if (var17 != 0) {
                                break L2;
                              } else {
                                continue L5;
                              }
                            }
                          }
                        } else {
                          var19 = var8;
                          var21 = param0;
                          var11 = 0;
                          L6: while (true) {
                            if (-9 >= (var11 ^ -1)) {
                              break L2;
                            } else {
                              var19[var11] = var21.e(100);
                              var11++;
                              if (var17 != 0) {
                                break L2;
                              } else {
                                if (var17 == 0) {
                                  continue L6;
                                } else {
                                  break L2;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    var8[0] = param0.e(105);
                    break L2;
                  }
                  L7: {
                    var9 = param0.h(255);
                    if (-1 > (var9 ^ -1)) {
                      var10 = new int[var9][];
                      var11 = 0;
                      L8: while (true) {
                        if (var11 >= var9) {
                          break L7;
                        } else {
                          var12 = param0.field_h;
                          L9: while (true) {
                            L10: {
                              L11: {
                                var13_int = param0.h(255);
                                if ((var13_int ^ -1) <= -129) {
                                  break L11;
                                } else {
                                  if (var17 == 0) {
                                    break L10;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              if (var17 == 0) {
                                continue L9;
                              } else {
                                break L10;
                              }
                            }
                            array$1 = new int[31 + (-var12 + param0.field_h) * 7 >> -613839035];
                            ((Object[]) (var10))[var11] = array$1;
                            var13 = array$1;
                            param0.field_h = var12;
                            var14 = 0;
                            var15 = 0;
                            L12: while (true) {
                              var16 = param0.h(255);
                              stackOut_37_0 = (int[]) (var13);
                              stackOut_37_1 = var14;
                              stackOut_37_2 = var13[var14] + (sea.c(var16, 127) << var15);
                              stackIn_38_0 = stackOut_37_0;
                              stackIn_38_1 = stackOut_37_1;
                              stackIn_38_2 = stackOut_37_2;
                              L13: while (true) {
                                L14: {
                                  stackIn_38_0[stackIn_38_1] = stackIn_38_2;
                                  if (var15 < 26) {
                                    break L14;
                                  } else {
                                    stackOut_39_0 = (int[]) (var13);
                                    stackOut_39_1 = var14 - -1;
                                    stackOut_39_2 = var13[var14 - -1] + (sea.c(127, var16) >> -var15 + 32);
                                    stackIn_38_0 = stackOut_39_0;
                                    stackIn_38_1 = stackOut_39_1;
                                    stackIn_38_2 = stackOut_39_2;
                                    stackIn_40_0 = stackOut_39_0;
                                    stackIn_40_1 = stackOut_39_1;
                                    stackIn_40_2 = stackOut_39_2;
                                    if (var17 != 0) {
                                      continue L13;
                                    } else {
                                      stackIn_40_0[stackIn_40_1] = stackIn_40_2;
                                      break L14;
                                    }
                                  }
                                }
                                L15: {
                                  L16: {
                                    if (var16 >= 128) {
                                      break L16;
                                    } else {
                                      if (var17 == 0) {
                                        break L15;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                  var15 += 7;
                                  var14 = var14 + (var15 >> -1448925019);
                                  var15 = var15 & 31;
                                  if (var17 == 0) {
                                    continue L12;
                                  } else {
                                    break L15;
                                  }
                                }
                                var11++;
                                continue L8;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      break L7;
                    }
                  }
                  L17: {
                    var10 = null;
                    if (param0.field_h < var6) {
                      L18: {
                        var11 = param0.h(255);
                        if (var11 > 0) {
                          var32 = new byte[var11];
                          param0.a(var32, 0, -101, var11);
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                      var12 = var6 - param0.field_h;
                      if (0 >= var12) {
                        break L17;
                      } else {
                        var27 = new byte[var12];
                        var24 = var27;
                        var10 = var24;
                        param0.a(var27, 0, -93, var12);
                        break L17;
                      }
                    } else {
                      break L17;
                    }
                  }
                  if (param0.field_h <= var6) {
                    L19: {
                      if (param2) {
                        System.out.println("Loading funorbprofile local: achievements=" + wg.a(0, var28));
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    stackOut_58_0 = var10;
                    stackIn_59_0 = stackOut_58_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    throw ssa.<RuntimeException>$cfr$sneakyThrow(new Exception("Local: data overrun: start=" + var5 + " length=" + var3_int + " end=" + var6 + " overranto=" + param0.field_h));
                  }
                }
              }
            } else {
              if (param2) {
                System.out.println("Loading funorbprofile local: blank");
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var3 = decompiledCaughtException;
            stackOut_60_0 = (RuntimeException) (var3);
            stackOut_60_1 = new StringBuilder().append("ssa.B(");
            stackIn_62_0 = stackOut_60_0;
            stackIn_62_1 = stackOut_60_1;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            if (param0 == null) {
              stackOut_62_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackOut_62_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L20;
            } else {
              stackOut_61_0 = (RuntimeException) ((Object) stackIn_61_0);
              stackOut_61_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackOut_61_2 = "{...}";
              stackIn_63_0 = stackOut_61_0;
              stackIn_63_1 = stackOut_61_1;
              stackIn_63_2 = stackOut_61_2;
              break L20;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_63_0), stackIn_63_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_5_0);
        } else {
          return (byte[]) ((Object) stackIn_59_0);
        }
    }

    ssa(ha param0) {
        this.field_e = null;
        this.field_a = new int[4];
        try {
            this.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ssa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0) {
        int incrementValue$40 = 0;
        int incrementValue$41 = 0;
        int incrementValue$42 = 0;
        int incrementValue$43 = 0;
        int incrementValue$44 = 0;
        int incrementValue$45 = 0;
        int incrementValue$46 = 0;
        int incrementValue$47 = 0;
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var5 = ow.field_q;
            var1 = var5;
            var2 = param0;
            var3 = var5.length;
            L1: while (true) {
              if (var2 >= var3) {
                break L0;
              } else {
                incrementValue$40 = var2;
                var2++;
                var5[incrementValue$40] = 0;
                incrementValue$41 = var2;
                var2++;
                var5[incrementValue$41] = 0;
                incrementValue$42 = var2;
                var2++;
                var5[incrementValue$42] = 0;
                incrementValue$43 = var2;
                var2++;
                var5[incrementValue$43] = 0;
                incrementValue$44 = var2;
                var2++;
                var5[incrementValue$44] = 0;
                incrementValue$45 = var2;
                var2++;
                var5[incrementValue$45] = 0;
                incrementValue$46 = var2;
                var2++;
                var5[incrementValue$46] = 0;
                incrementValue$47 = var2;
                var2++;
                var5[incrementValue$47] = 0;
                if (var4 == 0) {
                  continue L1;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1_ref), "ssa.E(" + param0 + ')');
        }
    }

    public static void d(int param0) {
        field_g = null;
        field_d = null;
        if (param0 > -89) {
            field_d = (String) null;
        }
    }

    static {
        field_d = "Names should contain a maximum of 12 characters";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
