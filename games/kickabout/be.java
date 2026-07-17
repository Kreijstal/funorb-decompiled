/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class be implements hc {
    private tf field_m;
    vg field_k;
    static hd field_q;
    hu field_d;
    private hd field_l;
    hd field_j;
    private int field_f;
    np field_g;
    String field_a;
    static tf field_i;
    private String[] field_c;
    private boolean field_h;
    private int field_b;
    private int field_n;
    private lj field_o;
    private String field_p;
    private int field_e;

    private final void a(int param0, String param1) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String[] var5 = null;
        String[] var6 = null;
        int var7 = 0;
        String var8 = null;
        tf var9 = null;
        lj var10 = null;
        int var11 = 0;
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
        var11 = Kickabout.field_G;
        try {
          L0: {
            var4_int = -15 + (-10 + ((be) this).field_g.field_q);
            var5 = wr.a(param1, 2, '\n');
            var6 = var5;
            var7 = 0;
            L1: while (true) {
              if (var7 >= var6.length) {
                break L0;
              } else {
                L2: {
                  var8 = var6[var7];
                  if (((be) this).field_d.a(var8) < var4_int) {
                    this.a(31779, param0, var8);
                    break L2;
                  } else {
                    var9 = this.b(0, var8, var4_int);
                    var10 = (lj) (Object) var9.g(24009);
                    L3: while (true) {
                      if (var10 == null) {
                        break L2;
                      } else {
                        this.a(31779, param0, var10.field_i);
                        var10 = (lj) (Object) var9.c(33);
                        continue L3;
                      }
                    }
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
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("be.G(").append(param0).append(44);
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
          throw nb.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + -122 + 41);
        }
    }

    public void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var6 = 0;
        int var5 = Kickabout.field_G;
        if (((be) this).field_l.field_mb + ((be) this).field_l.field_J > 0) {
            on.a(((be) this).field_l.field_F, ((be) this).field_l.field_T, ((be) this).field_g.field_s, ((be) this).field_l.field_mb, 5592405, 230);
            on.a(((be) this).field_g.field_F - -((be) this).field_g.field_q, ((be) this).field_l.field_T, ((be) this).field_g.field_s, ((be) this).field_l.field_mb, 5592405, 230);
            on.a(((be) this).field_g.field_F, ((be) this).field_l.field_T, ((be) this).field_g.field_q, ((be) this).field_g.field_J, 5592405, 230);
            on.a(((be) this).field_g.field_F, ((be) this).field_g.field_mb + ((be) this).field_g.field_T, ((be) this).field_g.field_q, -((be) this).field_g.field_mb + -((be) this).field_g.field_T + ((be) this).field_k.field_T, 5592405, 230);
            on.a(((be) this).field_g.field_F, ((be) this).field_k.field_mb + ((be) this).field_k.field_T, ((be) this).field_g.field_q, -((be) this).field_k.field_mb + (((be) this).field_l.field_mb - ((be) this).field_k.field_J), 5592405, 230);
            on.a(((be) this).field_g.field_F, ((be) this).field_g.field_T, ((be) this).field_g.field_q, ((be) this).field_g.field_mb, 2236962, 240);
            on.a(((be) this).field_k.field_F, ((be) this).field_k.field_T, ((be) this).field_k.field_q, ((be) this).field_k.field_mb, 2236962, 240);
            var2 = 256 + ((be) this).field_l.field_J;
            if (!(var2 >= 0)) {
                var2 = 0;
            }
            on.a(((be) this).field_l.field_F, ((be) this).field_l.field_T - -((be) this).field_l.field_mb, ((be) this).field_l.field_q, -((be) this).field_l.field_mb + vc.field_B + -((be) this).field_l.field_T, 0, var2 >> 1);
            var3 = 5 + (((be) this).field_l.field_mb + ((be) this).field_l.field_J);
            for (var4 = 0; 6 > var4; var4++) {
                on.c(0, var3, f.field_d, 0, var4 << 5);
                var3--;
            }
            ((be) this).field_l.a(127, 0 == (((be) this).field_n & 8) ? true : false);
        }
        var2 = 10;
        if (null != ((be) this).field_c) {
            if (!(!((be) this).field_h)) {
                var3 = ((be) this).field_l.field_J - -((be) this).field_l.field_mb;
                ((be) this).field_j.field_J = var3;
                ((be) this).field_j.a(78, false);
                var3 = var3 + (5 + ((be) this).field_f);
                var6 = 0;
                var4 = var6;
                while (((be) this).field_c.length > var6) {
                    ((be) this).field_d.a(((be) this).field_c[var6], 10 + ((be) this).field_j.field_F, var3, 13421772, -1);
                    var3 = var3 + ((be) this).field_f;
                    var6++;
                }
            }
        }
    }

    private final tf b(int param0, String param1, int param2) {
        tf var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        tf stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        tf stackOut_17_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            var4 = new tf();
            L1: while (true) {
              if (param1 == null) {
                stackOut_17_0 = (tf) var4;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              } else {
                L2: {
                  var5 = ((be) this).field_d.a(param1);
                  var6 = param1;
                  if (var5 > param2) {
                    var7 = param1.length() - 1;
                    L3: while (true) {
                      L4: {
                        if (0 >= var7) {
                          break L4;
                        } else {
                          L5: {
                            if (param2 < var5) {
                              break L5;
                            } else {
                              if (param1.charAt(var7) == 32) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          int incrementValue$4 = var7;
                          var7--;
                          var5 = var5 - ((be) this).field_d.a(param1.charAt(incrementValue$4));
                          continue L3;
                        }
                      }
                      L6: {
                        if (var7 != 0) {
                          break L6;
                        } else {
                          var5 = ((be) this).field_d.a(param1);
                          var7 = -1 + param1.length();
                          L7: while (true) {
                            if (param2 >= var5) {
                              break L6;
                            } else {
                              int incrementValue$5 = var7;
                              var7--;
                              var5 = var5 - ((be) this).field_d.a(param1.charAt(incrementValue$5));
                              continue L7;
                            }
                          }
                        }
                      }
                      var6 = param1.substring(0, var7);
                      param1 = param1.substring(var7 + 1);
                      break L2;
                    }
                  } else {
                    param1 = null;
                    break L2;
                  }
                }
                var4.a((gn) (Object) new lj(var6), 3);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4_ref = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4_ref;
            stackOut_19_1 = new StringBuilder().append("be.K(").append(0).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
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
          throw nb.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param2 + 41);
        }
        return stackIn_18_0;
    }

    abstract boolean a(String param0, boolean param1);

    private final hd a() {
        hd var3 = new hd(0L, (hd) null);
        var3.field_R = sp.a((byte) 26, 2263074);
        return var3;
    }

    abstract String[] b(byte param0);

    private final void a(int param0, int param1, String param2) {
        int var4_int = 0;
        hd var5 = null;
        int var6 = Kickabout.field_G;
        try {
            ((be) this).field_g.field_Ab.a((byte) -109, this.a(param1, param2, -73));
            if (!(256 >= ((be) this).field_g.field_Ab.field_jb.a(false))) {
                gn discarded$0 = ((be) this).field_g.field_Ab.field_jb.b((byte) 125);
            }
            var4_int = 5;
            var5 = (hd) (Object) ((be) this).field_g.field_Ab.field_jb.g(24009);
            while (var5 != null) {
                var5.field_J = var4_int;
                var4_int = var4_int + ((be) this).field_f;
                var5 = (hd) (Object) ((be) this).field_g.field_Ab.field_jb.c(33);
            }
            ((be) this).field_g.field_Ab.field_mb = var4_int;
            ((be) this).field_g.field_Ab.field_J = -var4_int + ((be) this).field_g.field_mb;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "be.M(" + 31779 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    public final boolean a(byte param0) {
        if (param0 < 63) {
            hd discarded$0 = this.a(40, -60, 5);
        }
        return ((be) this).field_h;
    }

    public boolean a(int param0, int param1, char param2) {
        hd var5 = null;
        int var6 = 0;
        String var7 = null;
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        gn stackIn_24_1 = null;
        Object stackOut_21_0 = null;
        Object stackOut_23_0 = null;
        gn stackOut_23_1 = null;
        Object stackOut_22_0 = null;
        gn stackOut_22_1 = null;
        var6 = Kickabout.field_G;
        if (param2 == 96) {
          int discarded$4 = -23;
          this.c();
          return true;
        } else {
          if (!((be) this).field_h) {
            return false;
          } else {
            L0: {
              if (param1 != 84) {
                if (param1 == 98) {
                  L1: {
                    if (((be) this).field_o == null) {
                      break L1;
                    } else {
                      if (((be) this).field_m.field_c != ((be) this).field_o.field_d) {
                        break L1;
                      } else {
                        break L0;
                      }
                    }
                  }
                  L2: {
                    stackOut_21_0 = this;
                    stackIn_23_0 = stackOut_21_0;
                    stackIn_22_0 = stackOut_21_0;
                    if (null == ((be) this).field_o) {
                      stackOut_23_0 = this;
                      stackOut_23_1 = ((be) this).field_m.g(24009);
                      stackIn_24_0 = stackOut_23_0;
                      stackIn_24_1 = stackOut_23_1;
                      break L2;
                    } else {
                      stackOut_22_0 = this;
                      stackOut_22_1 = ((be) this).field_o.field_d;
                      stackIn_24_0 = stackOut_22_0;
                      stackIn_24_1 = stackOut_22_1;
                      break L2;
                    }
                  }
                  ((be) this).field_o = (lj) (Object) stackIn_24_1;
                  if (((be) this).field_o == null) {
                    break L0;
                  } else {
                    ((be) this).field_k.b(((be) this).field_o.field_i, -23174);
                    break L0;
                  }
                } else {
                  if (param1 != 99) {
                    if (param1 != 80) {
                      boolean discarded$5 = ((be) this).field_k.a(param1, param2, 875);
                      break L0;
                    } else {
                      ((be) this).b(72);
                      break L0;
                    }
                  } else {
                    if (((be) this).field_o == null) {
                      break L0;
                    } else {
                      if (((be) this).field_m.field_c != ((be) this).field_o.field_b) {
                        ((be) this).field_o = (lj) (Object) ((be) this).field_o.field_b;
                        ((be) this).field_k.b(((be) this).field_o.field_i, -23174);
                        break L0;
                      } else {
                        break L0;
                      }
                    }
                  }
                }
              } else {
                var7 = ((be) this).field_k.j((byte) -16);
                if (var7.length() > 0) {
                  L3: {
                    int discarded$6 = -122;
                    this.a(5635925, ((be) this).field_a + var7);
                    var5 = (hd) (Object) ((be) this).field_g.field_Ab.field_jb.d(-9033);
                    if (!((be) this).a(var7, true)) {
                      var5.field_y = 16733525;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  ((be) this).field_k.k(-19174);
                  int discarded$7 = 30;
                  this.a(var7);
                  ((be) this).field_o = null;
                  break L0;
                } else {
                  return true;
                }
              }
            }
            return true;
          }
        }
    }

    private final void a(String param0) {
        lj var3 = null;
        RuntimeException var3_ref = null;
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
                var3 = (lj) (Object) ((be) this).field_m.g(24009);
                if (var3 == null) {
                  break L2;
                } else {
                  if (param0.equals((Object) (Object) var3.field_i)) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((be) this).field_m.a(0, (gn) (Object) new lj(param0));
              break L1;
            }
            L3: {
              if (((be) this).field_m.a(false) > 30) {
                gn discarded$2 = ((be) this).field_m.h(-124);
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
            stackOut_8_1 = new StringBuilder().append("be.B(");
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
          throw nb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + 30 + 41);
        }
    }

    private final hd a(int param0, String param1, int param2) {
        hd var4 = null;
        RuntimeException var4_ref = null;
        hd stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        hd stackOut_0_0 = null;
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
            var4 = new hd(0L, (hd) null, param1);
            var4.field_X = ((be) this).field_d;
            var4.field_y = param0;
            var4.a(true, ((be) this).field_d.a(var4.field_E), 5, 0, ((be) this).field_f);
            stackOut_0_0 = (hd) var4;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4_ref;
            stackOut_2_1 = new StringBuilder().append("be.C(").append(param0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
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
          throw nb.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + -73 + 41);
        }
        return stackIn_1_0;
    }

    final void a(String param0, byte param1) {
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
              int discarded$2 = -122;
              this.a(13421772, param0);
              if (param1 == 94) {
                break L1;
              } else {
                ((be) this).field_e = 33;
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
            stackOut_3_1 = new StringBuilder().append("be.Q(");
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
          throw nb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    private final hd b() {
        hd var3 = new hd();
        var3.field_R = ih.a(65793, 0, 0);
        return var3;
    }

    private final hd a(int param0, int param1, int param2) {
        if (param1 != 200) {
            ((be) this).field_o = null;
        }
        hd var4 = new hd(0L, (hd) null);
        var4.field_R = ih.a(param0, param1 + -200, param2);
        return var4;
    }

    abstract void b(int param0);

    public static void d() {
        field_i = null;
        field_q = null;
    }

    final void a(int param0, Object param1) {
        try {
            if (param0 > -49) {
                ((be) this).field_b = -72;
            }
            ((be) this).a(param1 == null ? "null" : param1.toString(), (byte) 94);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "be.N(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static boolean e(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var1 = bk.a(2);
          int discarded$2 = 0;
          var2 = qi.a();
          if (param0 >= 45) {
            break L0;
          } else {
            field_q = null;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (var1 != 9) {
                break L3;
              } else {
                if (var2 >= 28) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (var1 != 10) {
                break L4;
              } else {
                if (var2 > 11) {
                  break L4;
                } else {
                  break L2;
                }
              }
            }
            stackOut_9_0 = 0;
            stackIn_10_0 = stackOut_9_0;
            break L1;
          }
          stackOut_8_0 = 1;
          stackIn_10_0 = stackOut_8_0;
          break L1;
        }
        return stackIn_10_0 != 0;
    }

    private final void c() {
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
          if (((be) this).field_h) {
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
          ((be) this).field_h = stackIn_3_1 != 0;
          if (((be) this).field_h) {
            ((be) this).field_e = 15;
            if (((be) this).field_l != null) {
              ((be) this).field_l.a(-95, (hd) (Object) ((be) this).field_k);
              break L1;
            } else {
              break L1;
            }
          } else {
            if (null == ((be) this).field_l) {
              break L1;
            } else {
              ((be) this).field_l.a(117, (hd) null);
              break L1;
            }
          }
        }
    }

    public final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Kickabout.field_G;
          if (param0 == -25) {
            break L0;
          } else {
            ((be) this).field_p = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (!((be) this).field_h) {
              break L2;
            } else {
              if (0 < ((be) this).field_e) {
                ((be) this).field_e = ((be) this).field_e - 1;
                ((be) this).field_l.field_J = ((be) this).field_e * -200 * ((be) this).field_e / 225;
                break L1;
              } else {
                break L2;
              }
            }
          }
          if (((be) this).field_h) {
            break L1;
          } else {
            if (200 + ((be) this).field_l.field_J > 0) {
              ((be) this).field_l.field_J = ((be) this).field_l.field_J - 28;
              break L1;
            } else {
              break L1;
            }
          }
        }
        L3: {
          L4: {
            if (!((be) this).field_k.j((byte) -16).equals((Object) (Object) ((be) this).field_p)) {
              break L4;
            } else {
              if (((be) this).field_k.j(-1) == ((be) this).field_b) {
                break L3;
              } else {
                break L4;
              }
            }
          }
          L5: {
            ((be) this).field_p = ((be) this).field_k.j((byte) -16);
            ((be) this).field_b = ((be) this).field_k.j(-1);
            ((be) this).field_c = ((be) this).b((byte) -86);
            if (null == ((be) this).field_c) {
              break L5;
            } else {
              if (0 != ((be) this).field_c.length) {
                break L5;
              } else {
                ((be) this).field_c = null;
                break L5;
              }
            }
          }
          if (null != ((be) this).field_c) {
            var3 = 0;
            var4 = 0;
            L6: while (true) {
              if (var4 >= ((be) this).field_c.length) {
                ((be) this).field_j.field_q = var3 - -20;
                ((be) this).field_j.field_mb = ((be) this).field_c.length * ((be) this).field_f + 15;
                break L3;
              } else {
                var5 = ((be) this).field_d.a(((be) this).field_c[var4]);
                if (var3 < var5) {
                  var3 = var5;
                  var4++;
                  continue L6;
                } else {
                  var4++;
                  continue L6;
                }
              }
            }
          } else {
            break L3;
          }
        }
        ((be) this).field_n = ((be) this).field_n + 1;
        ((be) this).field_l.b(0, param1);
        ((be) this).field_g.a(((be) this).field_f, id.field_v * (((be) this).field_f * 2), true, 0);
        ((be) this).field_k.b(11570);
    }

    be(hu param0, bu param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        hd var4 = null;
        hd var5 = null;
        hd var6 = null;
        hd var7 = null;
        hd var8 = null;
        hd var9 = null;
        hd var10 = null;
        hd var11 = null;
        hd var12 = null;
        na var13 = null;
        hd var14 = null;
        hd var15 = null;
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
        ((be) this).field_a = "# ";
        ((be) this).field_m = new tf();
        ((be) this).field_h = false;
        ((be) this).field_n = 0;
        ((be) this).field_c = null;
        ((be) this).field_e = 0;
        try {
          L0: {
            ((be) this).field_d = param0;
            ((be) this).field_f = ((be) this).field_d.field_G + ((be) this).field_d.field_p;
            var3_int = ((be) this).field_f + 4;
            int discarded$4 = 186;
            int discarded$5 = 65793;
            var4 = this.b();
            var5 = var4;
            var6 = var4;
            var7 = var4;
            var8 = this.a(2236962, 200, 7829367);
            var9 = this.a(65793, 200, 65793);
            var10 = this.a(65793, 200, 3355443);
            int discarded$6 = 2263074;
            int discarded$7 = 4;
            var11 = this.a();
            var12 = this.a(65793, 200, 2236962);
            ((be) this).field_l = new hd(0L, var5);
            ((be) this).field_l.a(true, f.field_d, 0, -200, 200);
            var13 = new na(0L, var8, var8, var9, var10);
            var14 = new hd();
            var14.field_jb = new tf();
            ((be) this).field_g = new np(0L, var14, var6, var13);
            ((be) this).field_g.field_Ab.field_jb = new tf();
            ((be) this).field_g.a(0, 94, -var3_int + 185, 5, 5, -10 + ((be) this).field_l.field_q, 15);
            ((be) this).field_l.a((byte) -118, (hd) (Object) ((be) this).field_g);
            var15 = new hd();
            var15.field_y = 13421772;
            var15.field_D = 5;
            var15.field_B = 2;
            var15.field_X = ((be) this).field_d;
            ((be) this).field_k = new vg(0L, var7, var11, var15);
            ((be) this).field_k.a(-630, ((be) this).field_g.field_s, 5 + (((be) this).field_g.field_J + ((be) this).field_g.field_mb), var3_int, ((be) this).field_g.field_q);
            ((be) this).field_k.a(param1, -17421);
            ((be) this).field_l.a((byte) -119, (hd) (Object) ((be) this).field_k);
            ((be) this).field_j = new hd(0L, var12);
            ((be) this).field_j.field_s = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var3;
            stackOut_3_1 = new StringBuilder().append("be.<init>(");
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
          throw nb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    static {
    }
}
