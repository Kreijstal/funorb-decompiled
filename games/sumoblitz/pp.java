/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pp implements Runnable {
    volatile du[] field_c;
    volatile boolean field_b;
    static String field_f;
    static String[] field_e;
    wi field_g;
    volatile boolean field_a;
    static gm field_d;
    static int field_h;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        var13 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param3 - -param1;
              var6 = param0 + param4;
              if (lk.field_k < param3) {
                stackOut_3_0 = param3;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = lk.field_k;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0;
              if (lk.field_i >= param0) {
                stackOut_6_0 = lk.field_i;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = param0;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0;
              if (var5_int >= lk.field_j) {
                stackOut_9_0 = lk.field_j;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = var5_int;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            L4: {
              var9 = stackIn_10_0;
              if (lk.field_e <= var6) {
                stackOut_12_0 = lk.field_e;
                stackIn_13_0 = stackOut_12_0;
                break L4;
              } else {
                stackOut_11_0 = var6;
                stackIn_13_0 = stackOut_11_0;
                break L4;
              }
            }
            L5: {
              L6: {
                var10 = stackIn_13_0;
                if (lk.field_k > param3) {
                  break L6;
                } else {
                  if (lk.field_j > param3) {
                    var11 = param3 + var8 * lk.field_b;
                    var12 = 1 - -var10 + -var8 >> -2219903;
                    L7: while (true) {
                      var12--;
                      if (-1 < (var12 ^ -1)) {
                        break L6;
                      } else {
                        lk.field_a[var11] = 16777215;
                        var11 = var11 + lk.field_b * 2;
                        if (var13 != 0) {
                          break L5;
                        } else {
                          if (var13 == 0) {
                            continue L7;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                  } else {
                    break L6;
                  }
                }
              }
              if (param2 == -13181) {
                break L5;
              } else {
                pp.a(5, 111, 100, -88, -57);
                break L5;
              }
            }
            L8: {
              L9: {
                L10: {
                  if (lk.field_i > param0) {
                    break L10;
                  } else {
                    if (var6 < lk.field_e) {
                      var11 = param0 * lk.field_b - -var7;
                      var12 = -var7 + (1 + var9) >> 220154369;
                      L11: while (true) {
                        var12--;
                        if (var12 < 0) {
                          break L10;
                        } else {
                          lk.field_a[var11] = 16777215;
                          var11 += 2;
                          if (var13 != 0) {
                            break L9;
                          } else {
                            if (var13 == 0) {
                              continue L11;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                    } else {
                      break L10;
                    }
                  }
                }
                if (lk.field_k > var5_int) {
                  break L9;
                } else {
                  if (var5_int >= lk.field_j) {
                    break L9;
                  } else {
                    var11 = var5_int + lk.field_b * ((1 & var5_int + -param3) + var8);
                    var12 = var10 + 1 + -var8 >> -1169820063;
                    L12: while (true) {
                      var12--;
                      if ((var12 ^ -1) > -1) {
                        break L9;
                      } else {
                        lk.field_a[var11] = 16777215;
                        var11 = var11 + 2 * lk.field_b;
                        if (var13 != 0) {
                          break L8;
                        } else {
                          if (var13 == 0) {
                            continue L12;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                  }
                }
              }
              if (lk.field_i > param0) {
                break L8;
              } else {
                if (lk.field_e <= var6) {
                  break L8;
                } else {
                  var11 = (1 & -param0 + var6) + (var7 + lk.field_b * var6);
                  var12 = -var7 + (1 - -var9) >> 883457121;
                  L13: while (true) {
                    var12--;
                    if (-1 < (var12 ^ -1)) {
                      break L8;
                    } else {
                      lk.field_a[var11] = 16777215;
                      var11 += 2;
                      if (var13 == 0) {
                        continue L13;
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var5), "pp.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != 2) {
            pp.a(-25);
            field_f = null;
            field_e = null;
            return;
        }
        field_f = null;
        field_e = null;
    }

    public final void run() {
        Exception exception = null;
        int var1_int = 0;
        du var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        String var5 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        this.field_b = true;
        try {
          L0: {
            try {
              L1: {
                L2: while (true) {
                  L3: {
                    if (this.field_a) {
                      break L3;
                    } else {
                      if (var4 != 0) {
                        decompiledRegionSelector0 = 1;
                        break L1;
                      } else {
                        var1_int = 0;
                        L4: while (true) {
                          L5: {
                            L6: {
                              if (2 <= var1_int) {
                                break L6;
                              } else {
                                var2 = this.field_c[var1_int];
                                if (var4 != 0) {
                                  break L5;
                                } else {
                                  L7: {
                                    if (var2 != null) {
                                      var2.b();
                                      break L7;
                                    } else {
                                      break L7;
                                    }
                                  }
                                  var1_int++;
                                  if (var4 == 0) {
                                    continue L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            tg.a(10L, (byte) 107);
                            rd.a((Object) null, this.field_g, -11030);
                            break L5;
                          }
                          if (var4 == 0) {
                            continue L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              exception = (Exception) (Object) decompiledCaughtException;
              var5 = (String) null;
              ms.a((String) null, (Throwable) ((Object) exception), 0);
              this.field_b = false;
              return;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              decompiledRegionSelector1 = 1;
              break L0;
            }
          }
        } catch (java.lang.Throwable decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          this.field_b = false;
          throw pp.<RuntimeException>$cfr$sneakyThrow(var3);
        }
        L8: {
          if (decompiledRegionSelector1 == 0) {
            this.field_b = false;
            break L8;
          } else {
            break L8;
          }
        }
    }

    pp() {
        this.field_c = new du[2];
        this.field_a = false;
        this.field_b = false;
    }

    static {
        field_e = new String[]{"Accelerator pad", "Ice pad", "Teleporter pad", "Pinball bouncer", "Attractor", "Repeller", "Spike pad", "Landmine"};
        field_f = "Members";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
