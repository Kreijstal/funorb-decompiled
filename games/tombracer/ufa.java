/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ufa {
    boolean field_a;
    static int[] field_e;
    int field_h;
    static int[] field_d;
    int field_g;
    private static int[] field_p;
    private static int[] field_f;
    static String field_u;
    boolean field_l;
    private vna field_i;
    private BitSet field_s;
    int field_k;
    static int[] field_t;
    private static int[] field_b;
    int[] field_n;
    private static int[] field_j;
    BitSet field_o;
    private BitSet field_m;
    static int field_c;
    static String[] field_q;
    static nh[] field_r;

    final static void a(boolean param0) {
        if (!param0) {
            ufa.b(-1);
        }
        vc.field_n.setLength(0);
        bta.field_q = 0;
    }

    public final String toString() {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        String var7 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        var4 = "Profile - ";
        var1 = var4;
        var1 = var4;
        var5 = var4 + "RoomsComplete[" + this.field_o + "]";
        var1 = var5;
        var1 = var5;
        var6 = var5 + "CharUnlocked[" + this.field_s.toString() + "]";
        var1 = var6;
        var1 = var6;
        var7 = var6 + "CourUnlocked[" + this.field_m.toString() + "]";
        var1 = var7;
        var1 = var7;
        var1 = var7 + "WorldMedals[";
        var2 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (this.field_n.length <= var2) {
                break L2;
              } else {
                var1 = var1 + this.field_n[var2] + " ,";
                var2++;
                if (var3 != 0) {
                  break L1;
                } else {
                  if (var3 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            var1 = var1 + "]";
            break L1;
          }
          return var1;
        }
    }

    public static void b(int param0) {
        field_f = null;
        field_e = null;
        field_p = null;
        int var1 = 76 / ((-14 - param0) / 48);
        field_u = null;
        field_t = null;
        field_d = null;
        field_b = null;
        field_r = null;
        field_j = null;
        field_q = null;
    }

    final boolean a(byte param0, int param1) {
        if (param0 >= -22) {
            return true;
        }
        return this.field_m.get(param1);
    }

    final void a(kh param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        boolean stackIn_6_0 = false;
        int stackIn_10_0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_18_0 = 0;
        boolean stackIn_21_0 = false;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        boolean stackOut_5_0 = false;
        int stackOut_17_0 = 0;
        boolean stackOut_12_0 = false;
        boolean stackOut_20_0 = false;
        int stackOut_24_0 = 0;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = param0.h(255);
            if (-17 >= (var3_int ^ -1)) {
              param0.h((byte) -11);
              this.field_l = uha.a(5907, param0);
              var4 = param0.b((byte) 44, 8);
              var5 = 0;
              L1: while (true) {
                L2: {
                  if (var4 <= var5) {
                    stackOut_9_0 = -25 % ((69 - param1) / 53);
                    stackIn_10_0 = stackOut_9_0;
                    break L2;
                  } else {
                    stackOut_5_0 = uha.a(5907, param0);
                    stackIn_10_0 = stackOut_5_0 ? 1 : 0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      L3: {
                        if (!stackIn_6_0) {
                          break L3;
                        } else {
                          this.field_o.set(var5);
                          break L3;
                        }
                      }
                      var5++;
                      continue L1;
                    }
                  }
                }
                var6 = stackIn_10_0;
                var5 = 0;
                L4: while (true) {
                  L5: {
                    if (var5 >= 13) {
                      stackOut_17_0 = 0;
                      stackIn_18_0 = stackOut_17_0;
                      break L5;
                    } else {
                      stackOut_12_0 = uha.a(5907, param0);
                      stackIn_18_0 = stackOut_12_0 ? 1 : 0;
                      stackIn_13_0 = stackOut_12_0;
                      if (var7 != 0) {
                        break L5;
                      } else {
                        L6: {
                          if (stackIn_13_0) {
                            this.field_s.set(var5);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var5++;
                        continue L4;
                      }
                    }
                  }
                  var5 = stackIn_18_0;
                  L7: while (true) {
                    L8: {
                      L9: {
                        if ((var5 ^ -1) <= -10) {
                          break L9;
                        } else {
                          stackOut_20_0 = uha.a(5907, param0);
                          stackIn_25_0 = stackOut_20_0 ? 1 : 0;
                          stackIn_21_0 = stackOut_20_0;
                          if (var7 != 0) {
                            break L8;
                          } else {
                            L10: {
                              if (!stackIn_21_0) {
                                break L10;
                              } else {
                                this.field_m.set(var5);
                                break L10;
                              }
                            }
                            var5++;
                            if (var7 == 0) {
                              continue L7;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                      stackOut_24_0 = 0;
                      stackIn_25_0 = stackOut_24_0;
                      break L8;
                    }
                    var5 = stackIn_25_0;
                    L11: while (true) {
                      L12: {
                        L13: {
                          if (this.field_n.length <= var5) {
                            break L13;
                          } else {
                            this.field_n[var5] = param0.b((byte) 44, 2);
                            var5++;
                            if (var7 != 0) {
                              break L12;
                            } else {
                              if (var7 == 0) {
                                continue L11;
                              } else {
                                break L13;
                              }
                            }
                          }
                        }
                        this.field_g = param0.b((byte) 44, 4);
                        this.field_h = param0.b((byte) 44, 8);
                        this.field_k = param0.b((byte) 44, 8);
                        param0.i((byte) 98);
                        break L12;
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
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
          L14: {
            var3 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) (var3);
            stackOut_32_1 = new StringBuilder().append("ufa.C(");
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param0 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L14;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L14;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean b(byte param0, int param1) {
        if (param0 != 4) {
            this.field_l = false;
        }
        return this.field_s.get(param1);
    }

    final taa c(int param0) {
        if (param0 < 29) {
            ufa.b(90);
        }
        return (taa) ((Object) this.field_i.c(59));
    }

    final int a(int param0) {
        int var2 = -45 / ((-54 - param0) / 34);
        return this.field_i.a((byte) -16);
    }

    final static void a(int param0, int param1) {
        L0: {
          L1: {
            if (null == pqa.field_m) {
              break L1;
            } else {
              if (param1 <= pqa.field_m.length) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          pqa.field_m = new int[param1];
          break L0;
        }
        L2: {
          if (param0 < -29) {
            break L2;
          } else {
            field_b = (int[]) null;
            break L2;
          }
        }
    }

    final void a(int param0, kh param1) {
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        boolean discarded$6 = false;
        boolean discarded$7 = false;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            param1.i(16, 0);
            param1.i(8);
            discarded$4 = wfa.a(this.field_l, 126, param1);
            var3_int = -1 + this.field_o.size();
            param1.a((byte) -4, var3_int, 8);
            var4 = 0;
            L1: while (true) {
              L2: {
                if (var4 >= var3_int) {
                  var4 = 0;
                  break L2;
                } else {
                  discarded$5 = wfa.a(this.field_o.get(var4), -52, param1);
                  var4++;
                  if (var5 != 0) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              L3: while (true) {
                L4: {
                  if (var4 >= 13) {
                    var4 = 0;
                    break L4;
                  } else {
                    discarded$6 = wfa.a(this.field_s.get(var4), param0 + 2016803960, param1);
                    var4++;
                    if (var5 != 0) {
                      break L4;
                    } else {
                      continue L3;
                    }
                  }
                }
                L5: while (true) {
                  L6: {
                    L7: {
                      if ((var4 ^ -1) <= -10) {
                        break L7;
                      } else {
                        discarded$7 = wfa.a(this.field_m.get(var4), param0 ^ -2016803978, param1);
                        var4++;
                        if (var5 != 0) {
                          break L6;
                        } else {
                          if (var5 == 0) {
                            continue L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    if (param0 == -2016804080) {
                      break L6;
                    } else {
                      field_e = (int[]) null;
                      break L6;
                    }
                  }
                  var4 = 0;
                  L8: while (true) {
                    L9: {
                      L10: {
                        if (this.field_n.length <= var4) {
                          break L10;
                        } else {
                          param1.a((byte) -125, this.field_n[var4], 2);
                          var4++;
                          if (var5 != 0) {
                            break L9;
                          } else {
                            if (var5 == 0) {
                              continue L8;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                      param1.a((byte) 93, this.field_g, 4);
                      param1.a((byte) -128, this.field_h, 8);
                      param1.a((byte) -26, this.field_k, 8);
                      param1.k(-1826190686);
                      break L9;
                    }
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var3);
            stackOut_25_1 = new StringBuilder().append("ufa.G(").append(param0).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L11;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L11;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
    }

    public ufa() {
        this.field_l = false;
        this.field_a = false;
        this.field_o = new BitSet(255);
        this.field_i = new vna();
        this.field_n = new int[9];
        this.field_s = new BitSet(13);
        this.field_m = new BitSet(9);
        this.field_s.set(0);
        this.field_s.set(6);
        this.field_m.set(0);
        this.field_g = 0;
        this.field_h = 255;
        this.field_k = 255;
    }

    final void a(int param0, taa param1) {
        try {
            if (param0 != 8) {
                ufa.a(true);
            }
            this.field_i.b((byte) -48, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ufa.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit: {
            int var0 = 0;
            field_u = "Won";
            field_p = new int[256];
            var0 = 0;
            L0: while (true) {
              if (256 <= var0) {
                field_b = new int[256];
                var0 = 0;
                L1: while (true) {
                  if (-257 >= (var0 ^ -1)) {
                    field_j = new int[256];
                    var0 = 0;
                    L2: while (true) {
                      if (-257 >= (var0 ^ -1)) {
                        field_f = new int[256];
                        var0 = 0;
                        L3: while (true) {
                          if (var0 >= 256) {
                            field_d = new int[256];
                            var0 = 0;
                            L4: while (true) {
                              if (256 <= var0) {
                                field_e = new int[8];
                                var0 = 0;
                                L5: while (true) {
                                  if (-9 >= (var0 ^ -1)) {
                                    field_t = new int[8];
                                    var0 = 0;
                                    L6: while (true) {
                                      if (8 <= var0) {
                                        field_q = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
                                        field_c = -1;
                                        break $cfr$clinit;
                                      } else {
                                        field_t[var0] = fh.a(var0, fh.a(var0 << -482298736, sea.c(-127926241, var0) << -1344922165));
                                        var0++;
                                        continue L6;
                                      }
                                    }
                                  } else {
                                    field_e[var0] = fh.a(var0, fh.a(var0 << -1308765163, sea.c(var0, -480247777) << -1332941813));
                                    var0++;
                                    continue L5;
                                  }
                                }
                              } else {
                                field_d[var0] = fh.a(var0, fh.a(var0 << -2016804080, sea.c(var0, 1795162367) << 140109576));
                                var0++;
                                continue L4;
                              }
                            }
                          } else {
                            field_f[var0] = fh.a(var0 >> -1694236635, fh.a(var0 << -1958801712, sea.c(-1207958532, var0) << -1355441594));
                            var0++;
                            continue L3;
                          }
                        }
                      } else {
                        field_j[var0] = fh.a(fh.a(sea.c(65306, var0 << -43075481), sea.c(-861666308, var0) << 42100206), var0);
                        var0++;
                        continue L2;
                      }
                    }
                  } else {
                    field_b[var0] = fh.a(fh.a(sea.c(65308, var0 << -1807910522), sea.c(var0, 762841080) << -676866195), var0);
                    var0++;
                    continue L1;
                  }
                }
              } else {
                field_p[var0] = fh.a(var0 >> 175413507, fh.a(var0 << -1283928720, sea.c(1342178300, var0) << 1331522726));
                var0++;
                continue L0;
              }
            }
        }
    }
}
