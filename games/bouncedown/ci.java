/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ci extends lc implements gl, rc {
    private boolean field_J;
    private String field_E;
    private wd field_H;
    private ba field_z;
    private ba field_I;
    private boolean field_B;
    private wd field_D;
    private wd field_K;
    static bc field_F;
    static tg[] field_G;
    private boolean field_C;
    static rg field_L;

    final void b(int param0, String param1) {
        ba var3 = null;
        String var4 = null;
        try {
            if (param0 != 190) {
                boolean discarded$0 = ci.k(125);
            }
            var3 = ((ci) this).field_I;
            var4 = param1;
            var3.a(false, var4, true);
            ((ci) this).field_z.h(117);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "ci.CA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (null != ((ci) this).field_E) {
            int discarded$0 = sg.field_a.a(((ci) this).field_E, ((ci) this).field_r + (param3 + 20), 15 + (param1 + ((ci) this).field_i), -40 + ((ci) this).field_k, ((ci) this).field_m, 16777215, -1, 1, 0, sg.field_a.field_s);
        }
        if (((ci) this).field_H != null) {
            na.a(10 + param3, 134 + param1, ((ci) this).field_k + -20, 4210752);
        }
        super.a(param0, param1, 37, param3);
        if (param2 <= 33) {
            ((ci) this).field_C = true;
        }
    }

    final static void a(byte param0, gk param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        jk var5 = null;
        int[] var6 = null;
        int var7 = 0;
        ii var8 = null;
        int var9 = 0;
        ii var10 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var7 = Bounce.field_N;
        try {
          L0: {
            var8 = new ii(param1.b("logo.fo3d", "", -88));
            var10 = var8;
            var3 = var10.d((byte) -124);
            var10.o(8);
            wi.field_g = lb.a(98, var10);
            li.field_e = new int[var3][];
            q.field_G = new jk[var3];
            var4 = 0;
            L1: while (true) {
              if (var3 <= var4) {
                var10.m(-91);
                var9 = 0;
                var4 = var9;
                L2: while (true) {
                  if (var3 <= var9) {
                    L3: {
                      if (param0 == -116) {
                        break L3;
                      } else {
                        boolean discarded$1 = ci.k(-56);
                        break L3;
                      }
                    }
                    break L0;
                  } else {
                    var5 = q.field_G[var9];
                    var5.a((byte) -26, 6, 6, 6, 1);
                    var5.a(true);
                    var6 = new int[]{var5.field_n + var5.field_e >> 1, var5.field_N + var5.field_H >> 1, var5.field_D + var5.field_R >> 1};
                    li.field_e[var9] = var6;
                    var5.a(-var6[1], 126, -var6[2], -var6[0]);
                    var9++;
                    continue L2;
                  }
                }
              } else {
                q.field_G[var4] = lf.a(var8, (byte) -111);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2;
            stackOut_10_1 = new StringBuilder().append("ci.W(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    public final void a(byte param0, int param1, int param2, int param3, wd param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var7 = Bounce.field_N;
        try {
          L0: {
            L1: {
              if (param0 > 6) {
                break L1;
              } else {
                ((ci) this).field_J = false;
                break L1;
              }
            }
            L2: {
              if (param4 == ((ci) this).field_D) {
                int discarded$93 = 0;
                this.b();
                break L2;
              } else {
                if (((ci) this).field_H != param4) {
                  if (param4 != ((ci) this).field_K) {
                    break L2;
                  } else {
                    if (((ci) this).field_J) {
                      int discarded$94 = -60;
                      hh.c();
                      break L2;
                    } else {
                      if (((ci) this).field_B) {
                        int discarded$95 = 1;
                        oh.b();
                        break L2;
                      } else {
                        wk.h((byte) -124);
                        break L2;
                      }
                    }
                  }
                } else {
                  int discarded$96 = 8;
                  ii.n();
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var6;
            stackOut_14_1 = new StringBuilder().append("ci.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param4 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
    }

    final String a(int param0) {
        if (null == ((ci) this).field_I.field_h) {
            return "";
        }
        if (param0 != 0) {
            ((ci) this).field_B = false;
        }
        return ((ci) this).field_I.field_h;
    }

    public static void a() {
        field_L = null;
        field_F = null;
        field_G = null;
    }

    ci(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (fc) null);
        RuntimeException var6 = null;
        jh var6_ref = null;
        tj var7 = null;
        String var8 = null;
        ph var9 = null;
        hb var12 = null;
        hb var13 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_16_0 = null;
        wd stackIn_16_1 = null;
        wd stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        wd stackIn_17_1 = null;
        wd stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        wd stackIn_18_1 = null;
        wd stackIn_18_2 = null;
        String stackIn_18_3 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_15_0 = null;
        wd stackOut_15_1 = null;
        wd stackOut_15_2 = null;
        Object stackOut_17_0 = null;
        wd stackOut_17_1 = null;
        wd stackOut_17_2 = null;
        String stackOut_17_3 = null;
        Object stackOut_16_0 = null;
        wd stackOut_16_1 = null;
        wd stackOut_16_2 = null;
        String stackOut_16_3 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        try {
          L0: {
            L1: {
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param4) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((ci) this).field_B = stackIn_4_1 != 0;
              ((ci) this).field_E = param1;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param3) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              ((ci) this).field_C = stackIn_7_1 != 0;
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (!param2) {
                stackOut_9_0 = this;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L3;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L3;
              }
            }
            L4: {
              ((ci) this).field_J = stackIn_10_1 != 0;
              if (!((ci) this).field_J) {
                break L4;
              } else {
                L5: {
                  if (((ci) this).field_C) {
                    break L5;
                  } else {
                    if (!((ci) this).field_B) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                throw new IllegalStateException();
              }
            }
            L6: {
              ((ci) this).field_I = (ba) (Object) new ti(param0, (sk) this, 100);
              ((ci) this).field_z = (ba) (Object) new ti("", (sk) this, 20);
              if (((ci) this).field_J) {
                ((ci) this).field_D = new wd(mh.field_W, (sk) null);
                ((ci) this).field_K = new wd(i.field_g, (sk) null);
                ((ci) this).field_I.field_y = false;
                break L6;
              } else {
                L7: {
                  ((ci) this).field_D = new wd(bi.field_k, (sk) null);
                  stackOut_15_0 = this;
                  stackOut_15_1 = null;
                  stackOut_15_2 = null;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  if (!((ci) this).field_B) {
                    stackOut_17_0 = this;
                    stackOut_17_1 = null;
                    stackOut_17_2 = null;
                    stackOut_17_3 = pe.field_h;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    stackIn_18_3 = stackOut_17_3;
                    break L7;
                  } else {
                    stackOut_16_0 = this;
                    stackOut_16_1 = null;
                    stackOut_16_2 = null;
                    stackOut_16_3 = bi.field_i;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_18_2 = stackOut_16_2;
                    stackIn_18_3 = stackOut_16_3;
                    break L7;
                  }
                }
                ((ci) this).field_K = new wd(stackIn_18_3, (sk) null);
                if (!((ci) this).field_C) {
                  break L6;
                } else {
                  ((ci) this).field_H = new wd(gk.field_m, (sk) this);
                  break L6;
                }
              }
            }
            L8: {
              ((ci) this).field_I.field_j = (fc) (Object) new tc(10000536);
              ((ci) this).field_z.field_j = (fc) (Object) new wg(10000536);
              var6_ref = new jh();
              ((ci) this).field_D.field_j = (fc) (Object) var6_ref;
              if (null == ((ci) this).field_K) {
                break L8;
              } else {
                ((ci) this).field_K.field_j = (fc) (Object) var6_ref;
                break L8;
              }
            }
            L9: {
              if (((ci) this).field_H == null) {
                break L9;
              } else {
                ((ci) this).field_H.field_j = (fc) (Object) var6_ref;
                break L9;
              }
            }
            L10: {
              ((ci) this).field_I.field_q = hf.field_a;
              if (null == ((ci) this).field_H) {
                break L10;
              } else {
                ((ci) this).field_H.field_q = ge.field_a;
                break L10;
              }
            }
            L11: {
              if (((ci) this).field_J) {
                ((ci) this).field_K.field_q = mi.field_e;
                break L11;
              } else {
                if (!((ci) this).field_B) {
                  ((ci) this).field_K.field_j = (fc) (Object) new r();
                  break L11;
                } else {
                  ((ci) this).field_K.field_q = nf.field_a;
                  ((ci) this).field_K.field_j = (fc) (Object) new r();
                  break L11;
                }
              }
            }
            L12: {
              ((ci) this).field_i = 15;
              var7 = sg.field_a;
              if (((ci) this).field_E == null) {
                break L12;
              } else {
                ((ci) this).field_i = ((ci) this).field_i + (5 + var7.b(((ci) this).field_E, ((ci) this).field_k - 40, var7.field_s));
                break L12;
              }
            }
            L13: {
              var8 = wj.field_b;
              int discarded$3 = -90;
              var9 = ib.a(vi.b(0));
              if (nj.field_k != var9) {
                if (w.field_g != var9) {
                  break L13;
                } else {
                  var8 = dl.field_a;
                  break L13;
                }
              } else {
                var8 = ha.field_j;
                break L13;
              }
            }
            L14: {
              hb dupTemp$4 = new hb(10, ((ci) this).field_i, ((ci) this).field_k + -20, 25, (lk) (Object) ((ci) this).field_I, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$4;
              ((ci) this).b((lk) (Object) dupTemp$4, true);
              ((ci) this).field_i = ((ci) this).field_i + (5 + ((lk) (Object) var12).field_m);
              hb dupTemp$5 = new hb(10, ((ci) this).field_i, -20 + ((ci) this).field_k, 25, (lk) (Object) ((ci) this).field_z, false, 80, 3, var7, 16777215, ae.field_d);
              var13 = dupTemp$5;
              ((ci) this).b((lk) (Object) dupTemp$5, true);
              ((ci) this).field_D.field_n = (sk) this;
              ((ci) this).field_i = ((ci) this).field_i + (5 + ((lk) (Object) var13).field_m);
              if (((ci) this).field_H == null) {
                break L14;
              } else {
                ((ci) this).field_H.field_n = (sk) this;
                break L14;
              }
            }
            L15: {
              if (null == ((ci) this).field_K) {
                break L15;
              } else {
                ((ci) this).field_K.field_n = (sk) this;
                break L15;
              }
            }
            L16: {
              if (((ci) this).field_H != null) {
                ((ci) this).field_D.b(30, 80, -95 + ((ci) this).field_k, 85, ((ci) this).field_i);
                ((ci) this).field_i = ((ci) this).field_i + 60;
                break L16;
              } else {
                ((ci) this).field_D.b(30, 80, -10 + ((ci) this).field_k - 6, 8, ((ci) this).field_i);
                ((ci) this).field_i = ((ci) this).field_i + 35;
                break L16;
              }
            }
            L17: {
              if (null == ((ci) this).field_H) {
                break L17;
              } else {
                ((ci) this).field_H.b(30, 80, -6 + (((ci) this).field_k + -10), 8, ((ci) this).field_i);
                ((ci) this).field_i = ((ci) this).field_i + 35;
                break L17;
              }
            }
            L18: {
              if (null == ((ci) this).field_K) {
                break L18;
              } else {
                L19: {
                  if (((ci) this).field_J) {
                    break L19;
                  } else {
                    if (!((ci) this).field_B) {
                      ((ci) this).field_K.b(20, 80, 40, 8, ((ci) this).field_i);
                      ((ci) this).field_i = ((ci) this).field_i + 25;
                      break L18;
                    } else {
                      break L19;
                    }
                  }
                }
                ((ci) this).field_K.b(30, 80, -10 + (-6 + ((ci) this).field_k), 8, ((ci) this).field_i);
                ((ci) this).field_i = ((ci) this).field_i + 35;
                break L18;
              }
            }
            L20: {
              ((ci) this).b(((ci) this).field_i + 3, 80, ((ci) this).field_k, 0, 0);
              ((ci) this).b((lk) (Object) ((ci) this).field_D, true);
              if (null == ((ci) this).field_H) {
                break L20;
              } else {
                ((ci) this).b((lk) (Object) ((ci) this).field_H, true);
                break L20;
              }
            }
            L21: {
              if (((ci) this).field_K == null) {
                break L21;
              } else {
                ((ci) this).b((lk) (Object) ((ci) this).field_K, true);
                break L21;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var6 = decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) var6;
            stackOut_57_1 = new StringBuilder().append("ci.<init>(");
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param0 == null) {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L22;
            } else {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "{...}";
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              break L22;
            }
          }
          L23: {
            stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
            stackOut_60_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_60_2).append(',');
            stackIn_62_0 = stackOut_60_0;
            stackIn_62_1 = stackOut_60_1;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            if (param1 == null) {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L23;
            } else {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "{...}";
              stackIn_63_0 = stackOut_61_0;
              stackIn_63_1 = stackOut_61_1;
              stackIn_63_2 = stackOut_61_2;
              break L23;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void e(byte param0) {
        if (param0 != -100) {
            return;
        }
        ((ci) this).field_I.h(123);
        ((ci) this).field_z.h(param0 + 225);
    }

    public final void a(byte param0, ba param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              var3_int = 12 / ((0 - param0) / 33);
              if (((ci) this).field_I == param1) {
                boolean discarded$4 = ((ci) this).field_z.a((lk) this, false);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((ci) this).field_z != param1) {
                break L2;
              } else {
                int discarded$5 = 0;
                this.b();
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("ci.F(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    private final void b() {
        L0: {
          L1: {
            if (td.a(1)) {
              break L1;
            } else {
              if (((ci) this).field_I.field_h.length() <= 0) {
                break L0;
              } else {
                if (0 >= ((ci) this).field_z.field_h.length()) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          rg.a(-8742, ((ci) this).field_I.field_h, ((ci) this).field_z.field_h);
          break L0;
        }
        ((ci) this).field_J = true;
    }

    final boolean a(lk param0, char param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_8_0 = false;
        boolean stackOut_4_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              if (98 != param2) {
                if (param2 == 99) {
                  stackOut_8_0 = ((ci) this).a(param0, 19755);
                  stackIn_9_0 = stackOut_8_0;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackOut_4_0 = ((ci) this).a((byte) -102, param0);
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("ci.E(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L1;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_9_0;
    }

    final static boolean k(int param0) {
        Object var2 = null;
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 == -31077) {
            break L0;
          } else {
            var2 = null;
            ci.a((byte) -62, (gk) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if (sa.field_k < 20) {
              break L2;
            } else {
              if (!hi.a((byte) -126)) {
                break L2;
              } else {
                L3: {
                  if (0 >= nb.field_d) {
                    break L3;
                  } else {
                    if (cg.a(param0 + 31078)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L1;
              }
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    public final void a(ba param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param1 >= 81) {
                break L1;
              } else {
                ((ci) this).field_I = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ci.D(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = new bc();
    }
}
