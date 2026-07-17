/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hda extends k {
    private int field_k;
    static int field_o;
    private int[] field_p;
    private int field_m;
    private int[] field_q;
    static String field_l;
    private int field_n;

    final static void a(byte param0, boolean param1) {
        if (param0 != -91) {
            hda.a((byte) 27, true);
        }
        if (null != jja.field_m) {
            gp.b(-25942, jja.field_m);
        }
        if (!(ms.field_u == null)) {
            ms.field_u.a((byte) -120, param1);
        }
        bga.a(param0 ^ 10043, param1);
        if (!(null == wt.field_n)) {
            wt.field_n.a(param1, 7802);
        }
        vja.a((byte) 88, param1);
    }

    final void a(byte param0, lu param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param0 == -71) {
                break L1;
              } else {
                hda.e(36);
                break L1;
              }
            }
            L2: {
              var4_int = param2;
              if (var4_int != 0) {
                if (var4_int == 1) {
                  ((hda) this).field_n = param1.e((byte) 119);
                  break L2;
                } else {
                  if (var4_int == 2) {
                    ((hda) this).field_m = param1.b(16711935);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              } else {
                ((hda) this).field_k = param1.b(16711935);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("hda.E(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param2 + 41);
        }
    }

    public static void e(int param0) {
        int var1 = 7 % ((param0 - 52) / 62);
        field_l = null;
    }

    final int[] a(int param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        L0: {
          var10 = BachelorFridge.field_y;
          var15 = ((hda) this).field_j.a(param0, -1);
          var14 = var15;
          var13 = var14;
          var12 = var13;
          var3 = var12;
          if (!((hda) this).field_j.field_m) {
            break L0;
          } else {
            var4 = tj.field_f[param0];
            if (0 == ((hda) this).field_m) {
              var5 = 0;
              var6 = 0;
              L1: while (true) {
                L2: {
                  if (var6 >= ((hda) this).field_k) {
                    break L2;
                  } else {
                    if (var4 >= ((hda) this).field_q[var6]) {
                      if (((hda) this).field_q[1 + var6] > var4) {
                        if (((hda) this).field_p[var6] <= var4) {
                          break L2;
                        } else {
                          var5 = 4096;
                          break L2;
                        }
                      } else {
                        var6++;
                        continue L1;
                      }
                    } else {
                      var6++;
                      continue L1;
                    }
                  }
                }
                bl.a(var15, 0, hh.field_d, var5);
                break L0;
              }
            } else {
              var5 = 0;
              L3: while (true) {
                if (var5 >= hh.field_d) {
                  break L0;
                } else {
                  L4: {
                    var6 = 0;
                    var7 = 0;
                    var8 = jq.field_k[var5];
                    var9 = ((hda) this).field_m;
                    if (var9 != 1) {
                      if (2 != var9) {
                        if (var9 == 3) {
                          var6 = (var8 - var4 >> 1) + 2048;
                          break L4;
                        } else {
                          break L4;
                        }
                      } else {
                        var6 = (var8 - (-var4 + 4096) >> 1) + 2048;
                        break L4;
                      }
                    } else {
                      var6 = var8;
                      break L4;
                    }
                  }
                  var11 = 0;
                  var9 = var11;
                  L5: while (true) {
                    L6: {
                      if (var11 >= ((hda) this).field_k) {
                        break L6;
                      } else {
                        if (((hda) this).field_q[var11] <= var6) {
                          if (var6 < ((hda) this).field_q[1 + var11]) {
                            if (((hda) this).field_p[var11] > var6) {
                              var7 = 4096;
                              break L6;
                            } else {
                              break L6;
                            }
                          } else {
                            var11++;
                            continue L5;
                          }
                        } else {
                          var11++;
                          continue L5;
                        }
                      }
                    }
                    var15 = var14;
                    var15[var5] = var7;
                    var5++;
                    continue L3;
                  }
                }
              }
            }
          }
        }
        L7: {
          if (param1 == 0) {
            break L7;
          } else {
            int[] discarded$1 = ((hda) this).a(-64, -61);
            break L7;
          }
        }
        return var3;
    }

    public hda() {
        super(0, true);
        ((hda) this).field_k = 10;
        ((hda) this).field_n = 2048;
        ((hda) this).field_m = 0;
    }

    private final void d(int param0) {
        int var5 = 0;
        int var6 = BachelorFridge.field_y;
        ((hda) this).field_q = new int[((hda) this).field_k + 1];
        int var2 = 0;
        ((hda) this).field_p = new int[((hda) this).field_k - -1];
        int var3 = 4096 / ((hda) this).field_k;
        int var4 = var3 * ((hda) this).field_n >> 12;
        for (var5 = 0; var5 < ((hda) this).field_k; var5++) {
            ((hda) this).field_q[var5] = var2;
            ((hda) this).field_p[var5] = var4 + var2;
            var2 = var2 + var3;
        }
        ((hda) this).field_q[((hda) this).field_k] = 4096;
        ((hda) this).field_p[((hda) this).field_k] = ((hda) this).field_p[0] + 4096;
    }

    final static void a(int param0, kia param1, boolean param2, int param3) {
        Object var4 = null;
        RuntimeException var4_ref = null;
        Throwable var5 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                field_l = null;
                break L1;
              }
            }
            L2: {
              if (kw.field_j != null) {
                uka.a(1048576, param1, 256, param2, (byte) -112);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (null != uf.field_c) {
                var4 = (Object) (Object) lc.field_l;
                synchronized (var4) {
                  L4: {
                    uf.field_c.a(-1, 256, (byte) -107);
                    if (param1 != uw.field_o) {
                      L5: {
                        uf.field_c.b(true);
                        lc.field_l.c();
                        uw.field_o = param1;
                        if (uw.field_o == null) {
                          break L5;
                        } else {
                          uf.field_c.a(uw.field_o, (byte) -115, param2);
                          break L5;
                        }
                      }
                      break L4;
                    } else {
                      return;
                    }
                  }
                }
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4_ref;
            stackOut_18_1 = new StringBuilder().append("hda.F(").append(param0).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param2 + 44 + 256 + 41);
        }
    }

    final void d(byte param0) {
        if (param0 != -68) {
            return;
        }
        this.d(2048);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = -1;
    }
}
