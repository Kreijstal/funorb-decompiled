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

    private final void a(int param0, String param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String[] var5 = null;
        String[] var6 = null;
        int var7 = 0;
        String var8 = null;
        tf var9 = null;
        lj var10 = null;
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
        var11 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var4_int = -15 + (-10 + this.field_g.field_q);
              if (param2 == -122) {
                break L1;
              } else {
                be.d((byte) 97);
                break L1;
              }
            }
            var5 = wr.a(param1, 2, '\n');
            var6 = var5;
            var7 = 0;
            L2: while (true) {
              if (var7 >= var6.length) {
                break L0;
              } else {
                L3: {
                  var8 = var6[var7];
                  if (this.field_d.a(var8) < var4_int) {
                    this.a(31779, param0, var8);
                    break L3;
                  } else {
                    var9 = this.b(0, var8, var4_int);
                    var10 = (lj) ((Object) var9.g(24009));
                    L4: while (true) {
                      if (var10 == null) {
                        break L3;
                      } else {
                        this.a(31779, param0, var10.field_i);
                        var10 = (lj) ((Object) var9.c(33));
                        continue L4;
                      }
                    }
                  }
                }
                var7++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var4);
            stackOut_12_1 = new StringBuilder().append("be.G(").append(param0).append(',');
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
          throw nb.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ')');
        }
    }

    public void a(int param0) {
        int var6 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = Kickabout.field_G;
        if ((this.field_l.field_mb + this.field_l.field_J ^ -1) < -1) {
            on.a(this.field_l.field_F, this.field_l.field_T, this.field_g.field_s, this.field_l.field_mb, 5592405, 230);
            on.a(this.field_g.field_F - -this.field_g.field_q, this.field_l.field_T, this.field_g.field_s, this.field_l.field_mb, 5592405, 230);
            on.a(this.field_g.field_F, this.field_l.field_T, this.field_g.field_q, this.field_g.field_J, 5592405, 230);
            on.a(this.field_g.field_F, this.field_g.field_mb + this.field_g.field_T, this.field_g.field_q, -this.field_g.field_mb + -this.field_g.field_T + this.field_k.field_T, 5592405, 230);
            on.a(this.field_g.field_F, this.field_k.field_mb + this.field_k.field_T, this.field_g.field_q, -this.field_k.field_mb + (this.field_l.field_mb - this.field_k.field_J), 5592405, 230);
            on.a(this.field_g.field_F, this.field_g.field_T, this.field_g.field_q, this.field_g.field_mb, 2236962, 240);
            on.a(this.field_k.field_F, this.field_k.field_T, this.field_k.field_q, this.field_k.field_mb, 2236962, 240);
            var2 = 256 + this.field_l.field_J;
            if (!((var2 ^ -1) <= -1)) {
                var2 = 0;
            }
            on.a(this.field_l.field_F, this.field_l.field_T - -this.field_l.field_mb, this.field_l.field_q, -this.field_l.field_mb + vc.field_B + -this.field_l.field_T, 0, var2 >> 1034905985);
            var3 = 5 + (this.field_l.field_mb + this.field_l.field_J);
            for (var4 = 0; 6 > var4; var4++) {
                on.c(0, var3, f.field_d, 0, var4 << -1774521947);
                var3--;
            }
            this.field_l.a(127, 0 == (this.field_n & 8) ? true : false);
        }
        var2 = 20 / ((50 - param0) / 45);
        if (null != this.field_c) {
            if (!(!this.field_h)) {
                var3 = this.field_l.field_J - -this.field_l.field_mb;
                this.field_j.field_J = var3;
                this.field_j.a(78, false);
                var3 = var3 + (5 + this.field_f);
                var6 = 0;
                var4 = var6;
                while (this.field_c.length > var6) {
                    this.field_d.a(this.field_c[var6], 10 + this.field_j.field_F, var3, 13421772, -1);
                    var3 = var3 + this.field_f;
                    var6++;
                }
            }
        }
    }

    private final tf b(int param0, String param1, int param2) {
        hd discarded$3 = null;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException var4 = null;
        tf var4_ref = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        tf stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        tf stackOut_19_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                var9 = (String) null;
                discarded$3 = this.a(92, (String) null, -8);
                break L1;
              }
            }
            var4_ref = new tf();
            L2: while (true) {
              if (param1 == null) {
                stackOut_19_0 = (tf) (var4_ref);
                stackIn_20_0 = stackOut_19_0;
                break L0;
              } else {
                L3: {
                  var5 = this.field_d.a(param1);
                  var6 = param1;
                  if (var5 > param2) {
                    var7 = param1.length() - 1;
                    L4: while (true) {
                      L5: {
                        if (0 >= var7) {
                          break L5;
                        } else {
                          L6: {
                            if (param2 < var5) {
                              break L6;
                            } else {
                              if (param1.charAt(var7) == 32) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          incrementValue$4 = var7;
                          var7--;
                          var5 = var5 - this.field_d.a(param1.charAt(incrementValue$4));
                          continue L4;
                        }
                      }
                      L7: {
                        if (var7 != 0) {
                          break L7;
                        } else {
                          var5 = this.field_d.a(param1);
                          var7 = -1 + param1.length();
                          L8: while (true) {
                            if (param2 >= var5) {
                              break L7;
                            } else {
                              incrementValue$5 = var7;
                              var7--;
                              var5 = var5 - this.field_d.a(param1.charAt(incrementValue$5));
                              continue L8;
                            }
                          }
                        }
                      }
                      var6 = param1.substring(0, var7);
                      param1 = param1.substring(var7 + 1);
                      break L3;
                    }
                  } else {
                    param1 = null;
                    break L3;
                  }
                }
                var4_ref.a(new lj(var6), param0 ^ 3);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var4);
            stackOut_21_1 = new StringBuilder().append("be.K(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L9;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L9;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param2 + ')');
        }
        return stackIn_20_0;
    }

    abstract boolean a(String param0, boolean param1);

    private final hd a(int param0, int param1) {
        if (param0 != 4) {
            return (hd) null;
        }
        hd var3 = new hd(0L, (hd) null);
        var3.field_R = sp.a((byte) 26, param1);
        return var3;
    }

    abstract String[] b(byte param0);

    private final void a(int param0, int param1, String param2) {
        gn discarded$0 = null;
        int var4_int = 0;
        hd var5 = null;
        int var6 = Kickabout.field_G;
        try {
            this.field_g.field_Ab.a((byte) -109, this.a(param1, param2, -73));
            if (!(256 >= this.field_g.field_Ab.field_jb.a(false))) {
                discarded$0 = this.field_g.field_Ab.field_jb.b((byte) 125);
            }
            var4_int = 5;
            var5 = (hd) ((Object) this.field_g.field_Ab.field_jb.g(24009));
            while (var5 != null) {
                var5.field_J = var4_int;
                var4_int = var4_int + this.field_f;
                var5 = (hd) ((Object) this.field_g.field_Ab.field_jb.c(param0 + -31746));
            }
            if (param0 != 31779) {
                this.field_p = (String) null;
            }
            this.field_g.field_Ab.field_mb = var4_int;
            this.field_g.field_Ab.field_J = -var4_int + this.field_g.field_mb;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "be.M(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean a(byte param0) {
        hd discarded$0 = null;
        if (param0 < 63) {
            discarded$0 = this.a(40, -60, 5);
        }
        return this.field_h;
    }

    public boolean a(int param0, int param1, char param2) {
        boolean discarded$1 = false;
        hd var5 = null;
        int var6 = 0;
        String var7 = null;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        gn stackIn_26_1 = null;
        Object stackOut_23_0 = null;
        Object stackOut_25_0 = null;
        gn stackOut_25_1 = null;
        Object stackOut_24_0 = null;
        gn stackOut_24_1 = null;
        var6 = Kickabout.field_G;
        if (param0 == 11516) {
          if (param2 == 96) {
            this.c((byte) -23);
            return true;
          } else {
            if (!this.field_h) {
              return false;
            } else {
              L0: {
                if (param1 != 84) {
                  if (-99 == (param1 ^ -1)) {
                    L1: {
                      if (this.field_o == null) {
                        break L1;
                      } else {
                        if (this.field_m.field_c != this.field_o.field_d) {
                          break L1;
                        } else {
                          break L0;
                        }
                      }
                    }
                    L2: {
                      stackOut_23_0 = this;
                      stackIn_25_0 = stackOut_23_0;
                      stackIn_24_0 = stackOut_23_0;
                      if (null == this.field_o) {
                        stackOut_25_0 = this;
                        stackOut_25_1 = this.field_m.g(param0 ^ 28981);
                        stackIn_26_0 = stackOut_25_0;
                        stackIn_26_1 = stackOut_25_1;
                        break L2;
                      } else {
                        stackOut_24_0 = this;
                        stackOut_24_1 = this.field_o.field_d;
                        stackIn_26_0 = stackOut_24_0;
                        stackIn_26_1 = stackOut_24_1;
                        break L2;
                      }
                    }
                    ((be) (this)).field_o = (lj) ((Object) stackIn_26_1);
                    if (this.field_o == null) {
                      break L0;
                    } else {
                      this.field_k.b(this.field_o.field_i, param0 ^ -30330);
                      break L0;
                    }
                  } else {
                    if ((param1 ^ -1) != -100) {
                      if (-81 != (param1 ^ -1)) {
                        discarded$1 = this.field_k.a(param1, param2, param0 ^ 12183);
                        break L0;
                      } else {
                        this.b(72);
                        break L0;
                      }
                    } else {
                      if (this.field_o == null) {
                        break L0;
                      } else {
                        if (this.field_m.field_c != this.field_o.field_b) {
                          this.field_o = (lj) ((Object) this.field_o.field_b);
                          this.field_k.b(this.field_o.field_i, -23174);
                          break L0;
                        } else {
                          break L0;
                        }
                      }
                    }
                  }
                } else {
                  var7 = this.field_k.j((byte) -16);
                  if (-1 > (var7.length() ^ -1)) {
                    L3: {
                      this.a(5635925, this.field_a + var7, (byte) -122);
                      var5 = (hd) ((Object) this.field_g.field_Ab.field_jb.d(param0 ^ -4021));
                      if (!this.a(var7, true)) {
                        var5.field_y = 16733525;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    this.field_k.k(param0 ^ -26138);
                    this.a(var7, 30);
                    this.field_o = null;
                    break L0;
                  } else {
                    return true;
                  }
                }
              }
              return true;
            }
          }
        } else {
          return true;
        }
    }

    private final void a(String param0, int param1) {
        gn discarded$2 = null;
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
                var3 = (lj) ((Object) this.field_m.g(24009));
                if (var3 == null) {
                  break L2;
                } else {
                  if (param0.equals(var3.field_i)) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.field_m.a(0, new lj(param0));
              break L1;
            }
            L3: {
              if (this.field_m.a(false) > param1) {
                discarded$2 = this.field_m.h(-124);
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
            stackOut_8_0 = (RuntimeException) (var3_ref);
            stackOut_8_1 = new StringBuilder().append("be.B(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    private final hd a(int param0, String param1, int param2) {
        hd var4 = null;
        RuntimeException var4_ref = null;
        String var5 = null;
        hd stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        hd stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var4 = new hd(0L, (hd) null, param1);
              var4.field_X = this.field_d;
              var4.field_y = param0;
              var4.a(true, this.field_d.a(var4.field_E), 5, 0, this.field_f);
              if (param2 <= 0) {
                break L1;
              } else {
                var5 = (String) null;
                this.a((String) null, (byte) -100);
                break L1;
              }
            }
            stackOut_2_0 = (hd) (var4);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4_ref);
            stackOut_4_1 = new StringBuilder().append("be.C(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
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
              this.a(13421772, param0, (byte) -122);
              if (param1 == 94) {
                break L1;
              } else {
                this.field_e = 33;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("be.Q(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    private final hd b(int param0, int param1) {
        hd var3 = new hd();
        var3.field_R = ih.a(param0, param1 ^ param1, 0);
        return var3;
    }

    private final hd a(int param0, int param1, int param2) {
        if (param1 != 200) {
            this.field_o = (lj) null;
        }
        hd var4 = new hd(0L, (hd) null);
        var4.field_R = ih.a(param0, param1 + -200, param2);
        return var4;
    }

    abstract void b(int param0);

    public static void d(byte param0) {
        field_i = null;
        if (param0 >= -9) {
            return;
        }
        field_q = null;
    }

    final void a(int param0, Object param1) {
        try {
            if (param0 > -49) {
                this.field_b = -72;
            }
            this.a(param1 == null ? "null" : param1.toString(), (byte) 94);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "be.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
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
          var2 = qi.a(false);
          if (param0 >= 45) {
            break L0;
          } else {
            field_q = (hd) null;
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
              if ((var1 ^ -1) != -11) {
                break L4;
              } else {
                if ((var2 ^ -1) < -12) {
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

    private final void c(byte param0) {
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
          if (this.field_h) {
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
          ((be) (this)).field_h = stackIn_3_1 != 0;
          if (this.field_h) {
            this.field_e = 15;
            if (this.field_l != null) {
              this.field_l.a(-95, this.field_k);
              break L1;
            } else {
              break L1;
            }
          } else {
            if (null == this.field_l) {
              break L1;
            } else {
              this.field_l.a(param0 ^ -100, (hd) null);
              break L1;
            }
          }
        }
        L2: {
          if (param0 == -23) {
            break L2;
          } else {
            this.field_a = (String) null;
            break L2;
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
            this.field_p = (String) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (!this.field_h) {
              break L2;
            } else {
              if (0 < this.field_e) {
                this.field_e = this.field_e - 1;
                this.field_l.field_J = this.field_e * -200 * this.field_e / 225;
                break L1;
              } else {
                break L2;
              }
            }
          }
          if (this.field_h) {
            break L1;
          } else {
            if (-1 > (200 + this.field_l.field_J ^ -1)) {
              this.field_l.field_J = this.field_l.field_J - 28;
              break L1;
            } else {
              break L1;
            }
          }
        }
        L3: {
          L4: {
            if (!this.field_k.j((byte) -16).equals(this.field_p)) {
              break L4;
            } else {
              if (this.field_k.j(-1) == this.field_b) {
                break L3;
              } else {
                break L4;
              }
            }
          }
          L5: {
            this.field_p = this.field_k.j((byte) -16);
            this.field_b = this.field_k.j(-1);
            this.field_c = this.b((byte) -86);
            if (null == this.field_c) {
              break L5;
            } else {
              if (0 != this.field_c.length) {
                break L5;
              } else {
                this.field_c = null;
                break L5;
              }
            }
          }
          if (null != this.field_c) {
            var3 = 0;
            var4 = 0;
            L6: while (true) {
              if (var4 >= this.field_c.length) {
                this.field_j.field_q = var3 - -20;
                this.field_j.field_mb = this.field_c.length * this.field_f + 15;
                break L3;
              } else {
                var5 = this.field_d.a(this.field_c[var4]);
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
        this.field_n = this.field_n + 1;
        this.field_l.b(0, param1);
        this.field_g.a(this.field_f, id.field_v * (this.field_f * 2), true, 0);
        this.field_k.b(11570);
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
        this.field_a = "# ";
        this.field_m = new tf();
        this.field_h = false;
        this.field_n = 0;
        this.field_c = null;
        this.field_e = 0;
        try {
          L0: {
            this.field_d = param0;
            this.field_f = this.field_d.field_G + this.field_d.field_p;
            var3_int = this.field_f + 4;
            var4 = this.b(65793, 186);
            var5 = var4;
            var6 = var4;
            var7 = var4;
            var8 = this.a(2236962, 200, 7829367);
            var9 = this.a(65793, 200, 65793);
            var10 = this.a(65793, 200, 3355443);
            var11 = this.a(4, 2263074);
            var12 = this.a(65793, 200, 2236962);
            this.field_l = new hd(0L, var5);
            this.field_l.a(true, f.field_d, 0, -200, 200);
            var13 = new na(0L, var8, var8, var9, var10);
            var14 = new hd();
            var14.field_jb = new tf();
            this.field_g = new np(0L, var14, var6, var13);
            this.field_g.field_Ab.field_jb = new tf();
            this.field_g.a(0, 94, -var3_int + 185, 5, 5, -10 + this.field_l.field_q, 15);
            this.field_l.a((byte) -118, (hd) (this.field_g));
            var15 = new hd();
            var15.field_y = 13421772;
            var15.field_D = 5;
            var15.field_B = 2;
            var15.field_X = this.field_d;
            this.field_k = new vg(0L, var7, var11, var15);
            this.field_k.a(-630, this.field_g.field_s, 5 + (this.field_g.field_J + this.field_g.field_mb), var3_int, this.field_g.field_q);
            this.field_k.a(param1, -17421);
            this.field_l.a((byte) -119, (hd) (this.field_k));
            this.field_j = new hd(0L, var12);
            this.field_j.field_s = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var3);
            stackOut_3_1 = new StringBuilder().append("be.<init>(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    static {
    }
}
