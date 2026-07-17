/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul {
    boolean field_g;
    private int field_p;
    private int field_d;
    int field_c;
    private int field_l;
    private int field_k;
    private int field_o;
    private int field_q;
    private int field_e;
    private float field_b;
    private int field_h;
    static int field_f;
    private int field_n;
    private int field_j;
    private int field_r;
    private oo field_a;
    private int field_i;
    int field_s;
    private int field_m;

    final void d(int param0) {
        if (null == gk.field_o) {
          L0: {
            if (ct.field_x > 0) {
              break L0;
            } else {
              ((ul) this).field_g = false;
              break L0;
            }
          }
          if (((ul) this).field_g) {
            int fieldTemp$4 = ((ul) this).field_h - 1;
            ((ul) this).field_h = ((ul) this).field_h - 1;
            if (fieldTemp$4 <= 0) {
              ((ul) this).field_h = ((ul) this).field_m;
              if (wh.field_x >= ((ul) this).field_l) {
                L1: {
                  if (param0 == 2) {
                    break L1;
                  } else {
                    wb[] discarded$5 = ul.a(47);
                    break L1;
                  }
                }
                this.b(0);
                return;
              } else {
                ((ul) this).field_g = false;
                return;
              }
            } else {
              return;
            }
          } else {
            L2: {
              if (((ul) this).field_i <= gi.field_h) {
                if (((ul) this).field_i <= 0) {
                  break L2;
                } else {
                  th.field_H = 0;
                  break L2;
                }
              } else {
                th.field_H = (-gi.field_h + ((ul) this).field_i) / 2;
                break L2;
              }
            }
            L3: {
              L4: {
                if (gi.field_h != ((ul) this).field_e) {
                  break L4;
                } else {
                  if (wq.field_b != ((ul) this).field_n) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              ((ul) this).field_a.a(param0 ^ 8308, ((ul) this).field_e, ((ul) this).field_n);
              break L3;
            }
            return;
          }
        } else {
          return;
        }
    }

    final static cd[] a(byte param0, wi param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        cd[] var4 = null;
        int var5 = 0;
        cd var6 = null;
        int var7 = 0;
        jr var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        cd[] stackIn_5_0 = null;
        cd[] stackIn_12_0 = null;
        cd[] stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        cd[] stackOut_11_0 = null;
        cd[] stackOut_16_0 = null;
        cd[] stackOut_4_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 < -44) {
                break L1;
              } else {
                ul.a(42, -110, 34);
                break L1;
              }
            }
            if (param1.a((byte) 112)) {
              var8 = param1.b((byte) 21);
              L2: while (true) {
                if (var8.field_c != 0) {
                  if (var8.field_c == 2) {
                    stackOut_11_0 = new cd[]{};
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  } else {
                    var12 = (int[]) var8.field_d;
                    var11 = var12;
                    var10 = var11;
                    var9 = var10;
                    var3 = var9;
                    var4 = new cd[var12.length >> 2];
                    var5 = 0;
                    L3: while (true) {
                      if (var4.length <= var5) {
                        stackOut_16_0 = (cd[]) var4;
                        stackIn_17_0 = stackOut_16_0;
                        break L0;
                      } else {
                        var6 = new cd();
                        var4[var5] = var6;
                        var6.field_a = var3[var5 << 2];
                        var6.field_g = var3[1 + (var5 << 2)];
                        var6.field_e = var3[(var5 << 2) - -2];
                        var6.field_b = var3[(var5 << 2) - -3];
                        var5++;
                        continue L3;
                      }
                    }
                  }
                } else {
                  tg.a(10L, (byte) 80);
                  continue L2;
                }
              }
            } else {
              stackOut_4_0 = new cd[]{};
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var2;
            stackOut_18_1 = new StringBuilder().append("ul.G(").append(param0).append(44);
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
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
        return stackIn_17_0;
    }

    final boolean a(int param0, byte param1, int param2) {
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_10_0 = 0;
        if (param1 < -29) {
          L0: {
            L1: {
              if (param2 < ((ul) this).field_k) {
                break L1;
              } else {
                if (param2 > ((ul) this).field_p) {
                  break L1;
                } else {
                  if (param0 < ((ul) this).field_o) {
                    break L1;
                  } else {
                    if (((ul) this).field_j < param0) {
                      break L1;
                    } else {
                      L2: {
                        if (0.0f == ((ul) this).field_b) {
                          break L2;
                        } else {
                          if (param2 != Math.round(((ul) this).field_b * (float)param0)) {
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                      stackOut_9_0 = 1;
                      stackIn_11_0 = stackOut_9_0;
                      break L0;
                    }
                  }
                }
              }
            }
            stackOut_10_0 = 0;
            stackIn_11_0 = stackOut_10_0;
            break L0;
          }
          return stackIn_11_0 != 0;
        } else {
          return true;
        }
    }

    final boolean f(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == -1) {
          L0: {
            L1: {
              if (ct.field_x <= 0) {
                break L1;
              } else {
                if (wh.field_x >= ((ul) this).field_l) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    final cq g(int param0) {
        ((ul) this).field_d = wq.field_b;
        ((ul) this).field_r = gi.field_h;
        ((ul) this).field_a.a(8310, ((ul) this).field_s, ((ul) this).field_c);
        int var2 = -25 % ((50 - param0) / 48);
        aj.field_A = false;
        cq var3 = pb.a(((ul) this).field_s, 8089, 0, ((ul) this).field_c, lt.field_m, 0);
        if (!(var3 != null)) {
            ((ul) this).e(2);
        }
        return var3;
    }

    final void e(int param0) {
        ((ul) this).field_a.a(8310, ((ul) this).field_r, ((ul) this).field_d);
        if (param0 != 2) {
            this.b(115);
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param0 != 4025) {
            wb[] discarded$0 = ul.a(102);
        }
        ro.field_d = param1;
        ra.field_e = 1;
        qw.field_b = param2;
    }

    final static wb[] a(int param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var10 = null;
        int[] var11 = null;
        int[] var9 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = Sumoblitz.field_L ? 1 : 0;
        wb[] var1 = new wb[rl.field_n];
        if (param0 != 255) {
            wb[] discarded$0 = ul.a(79);
        }
        for (var2 = 0; var2 < rl.field_n; var2++) {
            var3 = vg.field_k[var2] * we.field_B[var2];
            var10 = ag.field_d[var2];
            var11 = new int[var3];
            var9 = var11;
            var5 = var9;
            for (var6 = 0; var3 > var6; var6++) {
                var5[var6] = iv.field_l[eb.a(255, (int) var10[var6])];
            }
            var1[var2] = new wb(vf.field_d, li.field_u, er.field_h[var2], av.field_C[var2], vg.field_k[var2], we.field_B[var2], var11);
        }
        tl.a((byte) -79);
        return var1;
    }

    final void a(int param0, int param1, byte param2) {
        ((ul) this).field_i = param1;
        if (param2 > -31) {
            return;
        }
        ((ul) this).field_q = param0;
    }

    final boolean c(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -1) {
            break L0;
          } else {
            ((ul) this).field_b = 2.1707825660705566f;
            break L0;
          }
        }
        L1: {
          L2: {
            if (wh.field_x < ((ul) this).field_l) {
              break L2;
            } else {
              if (0 >= ct.field_x) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 32 / ((param2 - -57) / 44);
        ((ul) this).field_s = param1;
        ((ul) this).field_c = param0;
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Sumoblitz.field_L ? 1 : 0;
        var2 = ((ul) this).field_i;
        var3 = ((ul) this).field_q;
        if (((ul) this).c(param0 + -1)) {
          L0: {
            if (((ul) this).field_j >= var3) {
              if (((ul) this).field_o > var3) {
                var3 = ((ul) this).field_o;
                break L0;
              } else {
                break L0;
              }
            } else {
              var3 = ((ul) this).field_j;
              break L0;
            }
          }
          L1: {
            if (((ul) this).field_p < var2) {
              var2 = ((ul) this).field_p;
              break L1;
            } else {
              if (((ul) this).field_k > var2) {
                var2 = ((ul) this).field_k;
                break L1;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (((ul) this).field_b > (float)param0) {
              var4 = (int)(0.5f + ((ul) this).field_b * (float)var3);
              if (var2 < var4) {
                var3 = (int)((float)var2 / ((ul) this).field_b);
                break L2;
              } else {
                if (var4 < var2) {
                  var2 = var4;
                  break L2;
                } else {
                  break L2;
                }
              }
            } else {
              break L2;
            }
          }
          L3: {
            if (var2 != gi.field_h) {
              ((ul) this).field_a.a(8310, var2, var3);
              break L3;
            } else {
              if (wq.field_b == var3) {
                break L3;
              } else {
                ((ul) this).field_a.a(8310, var2, var3);
                break L3;
              }
            }
          }
          L4: {
            if (((ul) this).field_i <= 0) {
              break L4;
            } else {
              th.field_H = (-gi.field_h + ((ul) this).field_i) / 2;
              break L4;
            }
          }
          return;
        } else {
          ((ul) this).field_g = false;
          return;
        }
    }

    private ul() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
    }
}
