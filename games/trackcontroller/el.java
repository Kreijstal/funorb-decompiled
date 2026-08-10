/*
 * Decompiled by CFR-JS 0.4.0.
 */
class el extends rh {
    static String field_J;
    private String[] field_M;
    static String[] field_O;
    static String field_K;
    private ja field_I;
    static kk field_L;
    private fi field_N;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1 + 0, param2, param3, param4);
        if (param1 != -3050) {
            field_O = (String[]) null;
        }
        this.b(true);
    }

    public static void c(boolean param0) {
        if (param0) {
            el.j(40);
        }
        field_L = null;
        field_O = null;
        field_J = null;
        field_K = null;
    }

    final static Boolean j(int param0) {
        Boolean var1 = qi.field_c;
        qi.field_c = null;
        if (param0 != 2) {
            field_J = (String) null;
        }
        return var1;
    }

    final void b(boolean param0) {
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int var2;
        dl var3;
        rb var4;
        int var5;
        String var6;
        int var7;
        int var8;
        int var9;
        Object var10;
        int var11;
        va var12;
        int var13;
        int var14;
        fi var15;
        int var16;
        var16 = TrackController.field_F ? 1 : 0;
        this.field_I = new ja();
        var2 = 0;
        var3 = (dl) ((Object) this.field_y);
        if (param0) {
          var4 = var3.a((byte) 96, (al) (this));
          L0: while (true) {
            var5 = this.field_s.indexOf("<hotspot=", var2);
            if (0 != (var5 ^ -1)) {
              var7 = this.field_s.indexOf(">", var5);
              var6 = this.field_s.substring(var5 + 9, var7);
              var7 = Integer.parseInt(var6);
              var2 = this.field_s.indexOf("</hotspot>", var5);
              var8 = var4.a(var5, (byte) -36);
              var9 = var4.a(var2, (byte) -36);
              var10 = null;
              var11 = var8;
              L1: while (true) {
                if (var9 < var11) {
                  continue L0;
                } else {
                  L2: {
                    var12 = var4.field_b[var11];
                    if ((var8 ^ -1) == (var11 ^ -1)) {
                      stackIn_10_0 = var4.a((byte) 111, var5);
                      break L2;
                    } else {
                      stackIn_10_0 = var12.field_b[0];
                      break L2;
                    }
                  }
                  L3: {
                    var13 = stackIn_10_0;
                    if (var11 != var9) {
                      if (var12 == null) {
                        stackIn_15_0 = 0;
                        break L3;
                      } else {
                        stackIn_15_0 = var12.field_b[var12.field_b.length + -1];
                        break L3;
                      }
                    } else {
                      stackIn_15_0 = var4.a((byte) 111, var2);
                      break L3;
                    }
                  }
                  L4: {
                    var14 = stackIn_15_0;
                    var15 = new fi(var7, var13, var12.field_c, var14 + -var13, Math.max(var3.a((byte) 46), var12.field_f + -var12.field_c));
                    if (var10 != null) {
                      ((fi) (var10)).field_j = var15;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  this.field_I.a((byte) -121, var15);
                  var10 = var15;
                  var11++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    String e(int param0) {
        if (null == this.field_N) {
            return null;
        }
        if (null == this.field_M) {
            return null;
        }
        if (param0 != 0) {
            this.a(-54, (byte) 36, -103, -82);
        }
        if (this.field_N.field_q >= this.field_M.length) {
            return null;
        }
        return this.field_M[this.field_N.field_q];
    }

    final void b(int param0, int param1, int param2, int param3) {
        super.b(param0, param1, param2 + param2, param3);
        int var5 = param1 - this.field_p;
        int var6 = param0 + -this.field_m;
        fi var7 = this.b(var5, var6, 9);
        if (var7 != null) {
            if (!(this.field_l == null)) {
                ((jg) ((Object) this.field_l)).a((el) (this), var7.field_q, param3, 1);
            }
        }
    }

    el(String param0, t param1) {
        super(param0, (tg) null);
        this.field_N = null;
        try {
            this.field_y = param1;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "el.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final fi b(int param0, int param1, int param2) {
        fi var4;
        fi var5;
        int var6;
        L0: {
          var6 = TrackController.field_F ? 1 : 0;
          if (param2 == 9) {
            break L0;
          } else {
            field_O = (String[]) null;
            break L0;
          }
        }
        var4 = (fi) ((Object) this.field_I.b(param2 ^ 11));
        L1: while (true) {
          if (var4 != null) {
            var5 = var4;
            L2: while (true) {
              if (var5 == null) {
                var4 = (fi) ((Object) this.field_I.a(10));
                continue L1;
              } else {
                L3: {
                  if (var5.field_n > param0) {
                    break L3;
                  } else {
                    if (var5.field_r > param1) {
                      break L3;
                    } else {
                      if (param0 >= var5.field_k + var5.field_n) {
                        break L3;
                      } else {
                        if (var5.field_r - -var5.field_m >= param1) {
                          return var4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                var5 = var5.field_j;
                continue L2;
              }
            }
          } else {
            return null;
          }
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (!(param0 == 0)) {
            return;
        }
        dl var5 = (dl) ((Object) this.field_y);
        fi var6 = this.field_N;
        if (var6 != null) {
            var7 = var5.a(param1, (al) (this), 0);
            var8 = var5.a((al) (this), -62, param2);
            do {
                bc.a(var6.field_m - -2, -28846, 2 + var6.field_k, var8 - (-var6.field_r + 2), -2 + (var7 - -var6.field_n));
                var6 = var6.field_j;
            } while (var6 != null);
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (param1 != -44) {
            return;
        }
        this.a(((dl) ((Object) this.field_y)).a(103, (al) (this)), -3050, param0, param2, param3);
    }

    boolean a(byte param0, al param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 <= -104) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              this.field_I = (ja) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("el.QA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    void a(int param0, int param1, byte param2, al param3) {
        int var5_int = 0;
        int var6 = 0;
        try {
            super.a(param0, param1, param2, param3);
            this.field_N = null;
            if (this.field_q) {
                var5_int = kf.field_b - (param1 - -this.field_p);
                var6 = -this.field_m + (fg.field_a - param0);
                this.field_N = this.b(var5_int, var6, param2 + 133);
            }
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "el.EA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, String param1, int param2) {
        String[] var5 = null;
        int var6 = 0;
        int var7 = TrackController.field_F ? 1 : 0;
        try {
            int var4_int = 118 % ((param0 - -2) / 52);
            if (null == this.field_M || this.field_M.length <= param2) {
                var5 = new String[1 + param2];
                if (null != this.field_M) {
                    for (var6 = 0; var6 < this.field_M.length; var6++) {
                        var5[var6] = this.field_M[var6];
                    }
                }
                this.field_M = var5;
            }
            this.field_M[param2] = param1;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "el.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_J = "Unable to connect to the data server. Please check any firewall you are using.";
        field_K = "Suggested names: ";
    }
}
