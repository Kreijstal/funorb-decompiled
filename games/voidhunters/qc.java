/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qc implements kd {
    private int field_e;
    String field_c;
    kw field_p;
    private llb field_m;
    llb field_o;
    no field_n;
    soa field_h;
    private ij field_i;
    static ri field_g;
    static llb field_q;
    private String[] field_d;
    private int field_l;
    private boolean field_j;
    private ila field_k;
    private int field_f;
    private String field_a;
    private int field_b;

    private final llb b(int param0, int param1, String param2) {
        llb var4 = null;
        RuntimeException var4_ref = null;
        llb stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        llb stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var4 = new llb(0L, (llb) null, param2);
            var4.field_eb = ((qc) this).field_n;
            var4.field_Y = param0;
            var4.a(5, 124, ((qc) this).field_n.b(var4.field_R), 0, ((qc) this).field_e);
            stackOut_0_0 = (llb) var4;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4_ref;
            stackOut_2_1 = new StringBuilder().append("qc.U(").append(param0).append(44).append(0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
        return stackIn_1_0;
    }

    private final void a(int param0, int param1, String param2) {
        int var4_int = 0;
        llb var5 = null;
        int var6 = VoidHunters.field_G;
        try {
            ((qc) this).field_h.field_wb.b(-561, this.b(param1, 0, param2));
            if (!(((qc) this).field_h.field_wb.field_lb.c(3) <= 256)) {
                ksa discarded$0 = ((qc) this).field_h.field_wb.field_lb.a(true);
            }
            var4_int = 5;
            var5 = (llb) (Object) ((qc) this).field_h.field_wb.field_lb.d(0);
            while (var5 != null) {
                var5.field_K = var4_int;
                var4_int = var4_int + ((qc) this).field_e;
                var5 = (llb) (Object) ((qc) this).field_h.field_wb.field_lb.a((byte) 30);
            }
            ((qc) this).field_h.field_wb.field_G = var4_int;
            ((qc) this).field_h.field_wb.field_K = -var4_int + ((qc) this).field_h.field_G;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "qc.L(" + -257 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final boolean c(int param0) {
        if (param0 != 13462) {
            ((qc) this).b((byte) -120);
        }
        return ((qc) this).field_j;
    }

    final void a(byte param0, String param1) {
        RuntimeException runtimeException = null;
        Object var4 = null;
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
              this.a(param1, false, 13421772);
              if (param0 >= 65) {
                break L1;
              } else {
                var4 = null;
                ((qc) this).a((byte) -84, (String) null);
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
            stackOut_3_1 = new StringBuilder().append("qc.S(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    private final ij a(int param0, byte param1, String param2) {
        ij var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        ij stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        ij stackOut_17_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            var5 = -120;
            var4 = new ij();
            L1: while (true) {
              if (param2 == null) {
                stackOut_17_0 = (ij) var4;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              } else {
                L2: {
                  var6 = ((qc) this).field_n.b(param2);
                  var7 = param2;
                  if (param0 < var6) {
                    var8 = -1 + param2.length();
                    L3: while (true) {
                      L4: {
                        if (var8 <= 0) {
                          break L4;
                        } else {
                          L5: {
                            if (var6 > param0) {
                              break L5;
                            } else {
                              if (param2.charAt(var8) == 32) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          int incrementValue$4 = var8;
                          var8--;
                          var6 = var6 - ((qc) this).field_n.a(param2.charAt(incrementValue$4));
                          continue L3;
                        }
                      }
                      L6: {
                        if (var8 != 0) {
                          break L6;
                        } else {
                          var6 = ((qc) this).field_n.b(param2);
                          var8 = param2.length() - 1;
                          L7: while (true) {
                            if (param0 >= var6) {
                              break L6;
                            } else {
                              int incrementValue$5 = var8;
                              var8--;
                              var6 = var6 - ((qc) this).field_n.a(param2.charAt(incrementValue$5));
                              continue L7;
                            }
                          }
                        }
                      }
                      var7 = param2.substring(0, var8);
                      param2 = param2.substring(var8 + 1);
                      break L2;
                    }
                  } else {
                    param2 = null;
                    break L2;
                  }
                }
                var4.b(-10258, (ksa) (Object) new ila(var7));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4_ref = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4_ref;
            stackOut_19_1 = new StringBuilder().append("qc.R(").append(param0).append(44).append(-128).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
        return stackIn_18_0;
    }

    public static void a() {
        field_q = null;
        field_g = null;
    }

    abstract String[] d(int param0);

    private final void a(String param0, int param1) {
        ila var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var3 = (ila) (Object) ((qc) this).field_i.d(0);
                var4 = -50 / ((74 - param1) / 41);
                if (var3 == null) {
                  break L2;
                } else {
                  if (!param0.equals((Object) (Object) var3.field_d)) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              ((qc) this).field_i.a((ksa) (Object) new ila(param0), (byte) -55);
              break L1;
            }
            L3: {
              if (((qc) this).field_i.c(3) > 30) {
                ksa discarded$2 = ((qc) this).field_i.c((byte) -115);
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("qc.O(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
    }

    void b(byte param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = VoidHunters.field_G;
        int var2 = 59 / ((param0 - 44) / 43);
        if (((qc) this).field_m.field_K + ((qc) this).field_m.field_G > 0) {
            dma.e(((qc) this).field_m.field_M, ((qc) this).field_m.field_u, ((qc) this).field_h.field_L, ((qc) this).field_m.field_G, 5592405, 230);
            dma.e(((qc) this).field_h.field_hb + ((qc) this).field_h.field_M, ((qc) this).field_m.field_u, ((qc) this).field_h.field_L, ((qc) this).field_m.field_G, 5592405, 230);
            dma.e(((qc) this).field_h.field_M, ((qc) this).field_m.field_u, ((qc) this).field_h.field_hb, ((qc) this).field_h.field_K, 5592405, 230);
            dma.e(((qc) this).field_h.field_M, ((qc) this).field_h.field_G + ((qc) this).field_h.field_u, ((qc) this).field_h.field_hb, -((qc) this).field_h.field_G + ((qc) this).field_p.field_u + -((qc) this).field_h.field_u, 5592405, 230);
            dma.e(((qc) this).field_h.field_M, ((qc) this).field_p.field_G + ((qc) this).field_p.field_u, ((qc) this).field_h.field_hb, -((qc) this).field_p.field_G + (((qc) this).field_m.field_G + -((qc) this).field_p.field_K), 5592405, 230);
            dma.e(((qc) this).field_h.field_M, ((qc) this).field_h.field_u, ((qc) this).field_h.field_hb, ((qc) this).field_h.field_G, 2236962, 240);
            dma.e(((qc) this).field_p.field_M, ((qc) this).field_p.field_u, ((qc) this).field_p.field_hb, ((qc) this).field_p.field_G, 2236962, 240);
            var3 = ((qc) this).field_m.field_K + 256;
            if (0 > var3) {
                var3 = 0;
            }
            dma.e(((qc) this).field_m.field_M, ((qc) this).field_m.field_G + ((qc) this).field_m.field_u, ((qc) this).field_m.field_hb, -((qc) this).field_m.field_G + fua.field_p - ((qc) this).field_m.field_u, 0, var3 >> 1);
            var4 = 5 + (((qc) this).field_m.field_G + ((qc) this).field_m.field_K);
            for (var5 = 0; 6 > var5; var5++) {
                dma.g(0, var4, rda.field_p, 0, var5 << 5);
                var4--;
            }
            ((qc) this).field_m.b((8 & ((qc) this).field_b) == 0 ? true : false, 111);
        }
        if (((qc) this).field_d != null) {
            if (((qc) this).field_j) {
                var3 = ((qc) this).field_m.field_G + ((qc) this).field_m.field_K;
                ((qc) this).field_o.field_K = var3;
                ((qc) this).field_o.b(false, 43);
                var3 = var3 + (((qc) this).field_e - -5);
                for (var4 = 0; ((qc) this).field_d.length > var4; var4++) {
                    ((qc) this).field_n.c(((qc) this).field_d[var4], ((qc) this).field_o.field_M + 10, var3, 13421772, -1);
                    var3 = var3 + ((qc) this).field_e;
                }
            }
        }
    }

    private final llb a(byte param0, int param1, int param2) {
        if (param0 > -57) {
            ((qc) this).field_d = null;
        }
        llb var4 = new llb(0L, (llb) null);
        var4.field_gb = va.a(-26998, param1, param2);
        return var4;
    }

    abstract boolean a(int param0, String param1);

    abstract void a(int param0);

    final static asb b() {
        return pj.a((byte) 52, qw.field_e.field_a);
    }

    private final llb a(int param0, int param1) {
        llb var3 = new llb(0L, (llb) null);
        var3.field_gb = prb.a(true, 2263074);
        return var3;
    }

    final void a(boolean param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = VoidHunters.field_G;
        if (param1 > 73) {
          L0: {
            L1: {
              if (!((qc) this).field_j) {
                break L1;
              } else {
                if (0 < ((qc) this).field_f) {
                  ((qc) this).field_f = ((qc) this).field_f - 1;
                  ((qc) this).field_m.field_K = ((qc) this).field_f * -200 * ((qc) this).field_f / 225;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (((qc) this).field_j) {
              break L0;
            } else {
              if (0 < 200 + ((qc) this).field_m.field_K) {
                ((qc) this).field_m.field_K = ((qc) this).field_m.field_K - 28;
                break L0;
              } else {
                break L0;
              }
            }
          }
          L2: {
            L3: {
              if (((qc) this).field_p.l(-14453).equals((Object) (Object) ((qc) this).field_a)) {
                if (((qc) this).field_p.j(0) == ((qc) this).field_l) {
                  break L2;
                } else {
                  ((qc) this).field_a = ((qc) this).field_p.l(-14453);
                  ((qc) this).field_l = ((qc) this).field_p.j(0);
                  ((qc) this).field_d = ((qc) this).d(-85);
                  if (((qc) this).field_d == null) {
                    break L3;
                  } else {
                    if (((qc) this).field_d.length != 0) {
                      break L3;
                    } else {
                      ((qc) this).field_d = null;
                      break L3;
                    }
                  }
                }
              } else {
                ((qc) this).field_a = ((qc) this).field_p.l(-14453);
                ((qc) this).field_l = ((qc) this).field_p.j(0);
                ((qc) this).field_d = ((qc) this).d(-85);
                if (((qc) this).field_d == null) {
                  break L3;
                } else {
                  if (((qc) this).field_d.length != 0) {
                    break L3;
                  } else {
                    ((qc) this).field_d = null;
                    break L3;
                  }
                }
              }
            }
            if (((qc) this).field_d == null) {
              break L2;
            } else {
              var3 = 0;
              var4 = 0;
              L4: while (true) {
                if (((qc) this).field_d.length <= var4) {
                  ((qc) this).field_o.field_hb = 20 + var3;
                  ((qc) this).field_o.field_G = 15 + ((qc) this).field_e * ((qc) this).field_d.length;
                  break L2;
                } else {
                  var5 = ((qc) this).field_n.b(((qc) this).field_d[var4]);
                  if (var3 < var5) {
                    var3 = var5;
                    var4++;
                    continue L4;
                  } else {
                    var4++;
                    continue L4;
                  }
                }
              }
            }
          }
          ((qc) this).field_b = ((qc) this).field_b + 1;
          ((qc) this).field_m.a(param0, 1332);
          ((qc) this).field_h.a(2 * (((qc) this).field_e * tcb.field_o), true, ((qc) this).field_e, 0);
          ((qc) this).field_p.f((byte) -6);
          return;
        } else {
          return;
        }
    }

    private final void a(String param0, boolean param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String[] var5 = null;
        String[] var6 = null;
        int var7 = 0;
        String var8 = null;
        ij var9 = null;
        ila var10 = null;
        int var11 = 0;
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
        var11 = VoidHunters.field_G;
        try {
          L0: {
            var4_int = ((qc) this).field_h.field_hb + -25;
            var5 = up.a((byte) -67, '\n', param0);
            var6 = var5;
            var7 = 0;
            L1: while (true) {
              if (var6.length <= var7) {
                break L0;
              } else {
                L2: {
                  var8 = var6[var7];
                  if (var4_int <= ((qc) this).field_n.b(var8)) {
                    var9 = this.a(var4_int, (byte) -128, var8);
                    var10 = (ila) (Object) var9.d(0);
                    L3: while (true) {
                      if (var10 == null) {
                        break L2;
                      } else {
                        this.a(-257, param2, var10.field_d);
                        var10 = (ila) (Object) var9.a((byte) 26);
                        continue L3;
                      }
                    }
                  } else {
                    this.a(-257, param2, var8);
                    break L2;
                  }
                }
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("qc.T(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + 0 + 44 + param2 + 41);
        }
    }

    private final llb a(int param0, byte param1) {
        int var3 = -103 / ((param1 - -68) / 35);
        llb var4 = new llb();
        var4.field_gb = va.a(-26998, 0, param0);
        return var4;
    }

    private final void a(boolean param0) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (((qc) this).field_j) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ((qc) this).field_j = stackIn_3_1 != 0;
          if (((qc) this).field_j) {
            ((qc) this).field_f = 15;
            if (null != ((qc) this).field_m) {
              ((qc) this).field_m.a(false, (llb) (Object) ((qc) this).field_p);
              break L1;
            } else {
              break L1;
            }
          } else {
            if (null == ((qc) this).field_m) {
              break L1;
            } else {
              ((qc) this).field_m.a(false, (llb) null);
              break L1;
            }
          }
        }
    }

    boolean a(int param0, char param1, int param2) {
        llb var5 = null;
        int var6 = 0;
        String var7 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        ksa stackIn_18_1 = null;
        Object stackOut_15_0 = null;
        Object stackOut_17_0 = null;
        ksa stackOut_17_1 = null;
        Object stackOut_16_0 = null;
        ksa stackOut_16_1 = null;
        L0: {
          var6 = VoidHunters.field_G;
          if (param2 == -40) {
            break L0;
          } else {
            llb discarded$2 = this.a(77, (byte) 52);
            break L0;
          }
        }
        if (96 == param1) {
          this.a(true);
          return true;
        } else {
          if (!((qc) this).field_j) {
            return false;
          } else {
            L1: {
              if (param0 != 84) {
                if (param0 != 98) {
                  if (99 != param0) {
                    if (param0 != 80) {
                      boolean discarded$3 = ((qc) this).field_p.a(param0, -1, param1);
                      break L1;
                    } else {
                      ((qc) this).a(-35);
                      break L1;
                    }
                  } else {
                    if (null == ((qc) this).field_k) {
                      break L1;
                    } else {
                      if (((qc) this).field_i.field_a != ((qc) this).field_k.field_a) {
                        ((qc) this).field_k = (ila) (Object) ((qc) this).field_k.field_a;
                        ((qc) this).field_p.a(((qc) this).field_k.field_d, -114);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                } else {
                  L2: {
                    if (((qc) this).field_k == null) {
                      break L2;
                    } else {
                      if (((qc) this).field_i.field_a != ((qc) this).field_k.field_c) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  L3: {
                    stackOut_15_0 = this;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_16_0 = stackOut_15_0;
                    if (null != ((qc) this).field_k) {
                      stackOut_17_0 = this;
                      stackOut_17_1 = ((qc) this).field_k.field_c;
                      stackIn_18_0 = stackOut_17_0;
                      stackIn_18_1 = stackOut_17_1;
                      break L3;
                    } else {
                      stackOut_16_0 = this;
                      stackOut_16_1 = ((qc) this).field_i.d(param2 + 40);
                      stackIn_18_0 = stackOut_16_0;
                      stackIn_18_1 = stackOut_16_1;
                      break L3;
                    }
                  }
                  ((qc) this).field_k = (ila) (Object) stackIn_18_1;
                  if (null == ((qc) this).field_k) {
                    break L1;
                  } else {
                    ((qc) this).field_p.a(((qc) this).field_k.field_d, -121);
                    break L1;
                  }
                }
              } else {
                var7 = ((qc) this).field_p.l(-14453);
                if (var7.length() > 0) {
                  L4: {
                    this.a(((qc) this).field_c + var7, false, 5635925);
                    var5 = (llb) (Object) ((qc) this).field_h.field_wb.field_lb.b((byte) 127);
                    if (!((qc) this).a(-10278, var7)) {
                      var5.field_Y = 16733525;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  ((qc) this).field_p.a(true);
                  this.a(var7, param2 ^ 122);
                  ((qc) this).field_k = null;
                  break L1;
                } else {
                  return true;
                }
              }
            }
            return true;
          }
        }
    }

    final void a(Object param0, int param1) {
        if (param1 >= -16) {
            return;
        }
        try {
            ((qc) this).a((byte) 115, param0 != null ? param0.toString() : "null");
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "qc.N(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    qc(no param0, eab param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        llb var4 = null;
        llb var5 = null;
        llb var6 = null;
        llb var7 = null;
        llb var8 = null;
        llb var9 = null;
        llb var10 = null;
        llb var11 = null;
        llb var12 = null;
        pjb var13 = null;
        llb var14 = null;
        llb var15 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        ((qc) this).field_c = "# ";
        ((qc) this).field_i = new ij();
        ((qc) this).field_d = null;
        ((qc) this).field_f = 0;
        ((qc) this).field_j = false;
        ((qc) this).field_b = 0;
        try {
          L0: {
            ((qc) this).field_n = param0;
            ((qc) this).field_e = ((qc) this).field_n.field_k + ((qc) this).field_n.field_A;
            var3_int = ((qc) this).field_e + 4;
            var4 = this.a(65793, (byte) 79);
            var5 = var4;
            var6 = var4;
            var7 = var4;
            var8 = this.a((byte) -59, 7829367, 2236962);
            var9 = this.a((byte) -91, 65793, 65793);
            var10 = this.a((byte) -63, 3355443, 65793);
            var11 = this.a(4, 2263074);
            var12 = this.a((byte) -105, 2236962, 65793);
            ((qc) this).field_m = new llb(0L, var5);
            ((qc) this).field_m.a(0, 16, rda.field_p, -200, 200);
            var13 = new pjb(0L, var8, var8, var9, var10);
            var14 = new llb();
            var14.field_lb = new ij();
            ((qc) this).field_h = new soa(0L, var14, var6, var13);
            ((qc) this).field_h.field_wb.field_lb = new ij();
            ((qc) this).field_h.a(((qc) this).field_m.field_hb + -10, 0, -1, -var3_int + 185, 5, 5, 15);
            ((qc) this).field_m.b(-561, (llb) (Object) ((qc) this).field_h);
            var15 = new llb();
            var15.field_Y = 13421772;
            var15.field_t = 5;
            var15.field_eb = ((qc) this).field_n;
            var15.field_v = 2;
            ((qc) this).field_p = new kw(0L, var7, var11, var15);
            ((qc) this).field_p.a(((qc) this).field_h.field_hb, ((qc) this).field_h.field_L, var3_int, ((qc) this).field_h.field_G + (((qc) this).field_h.field_K - -5), true);
            ((qc) this).field_p.a(-20640, param1);
            ((qc) this).field_m.b(-561, (llb) (Object) ((qc) this).field_p);
            ((qc) this).field_o = new llb(0L, var12);
            ((qc) this).field_o.field_L = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var3;
            stackOut_3_1 = new StringBuilder().append("qc.<init>(");
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
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44);
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
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new ri(15, 0, 1, 0);
    }
}
