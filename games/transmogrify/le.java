/*
 * Decompiled by CFR-JS 0.4.0.
 */
class le extends lj {
    static sa field_A;
    private String[] field_D;
    private nj field_B;
    private qj field_E;
    static qj field_C;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(-109, param1, param2, param3, param4);
        this.j(-91);
        int var6 = 112 / ((param0 - -29) / 53);
    }

    final void a(String param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (this.field_D == null) {
                  break L2;
                } else {
                  if (param2 >= this.field_D.length) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                var7 = new String[1 + param2];
                var8 = var7;
                var4 = var8;
                if (this.field_D != null) {
                  var5 = 0;
                  L4: while (true) {
                    if (var5 >= this.field_D.length) {
                      break L3;
                    } else {
                      var7[var5] = this.field_D[var5];
                      var5++;
                      continue L4;
                    }
                  }
                } else {
                  break L3;
                }
              }
              this.field_D = var8;
              break L1;
            }
            L5: {
              if (param1 == 0) {
                break L5;
              } else {
                this.j(48);
                break L5;
              }
            }
            this.field_D[param2] = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (runtimeException);

            stackIn_16_1 = new StringBuilder().append("le.W(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L6;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    boolean a(qg param0, int param1) {
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
            if (param1 <= -11) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              field_A = (sa) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("le.M(");

            if (param0 == null) {
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
          throw ch.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final void j(int param0) {
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int var2;
        m var3;
        ue var4;
        int var5;
        String var6;
        int var7;
        int var8;
        int var9;
        Object var10;
        int var11;
        ol var12;
        int var13;
        int var14;
        nj var15;
        int var16;
        var16 = Transmogrify.field_A ? 1 : 0;
        this.field_E = new qj();
        if (param0 <= -39) {
          var2 = 0;
          var3 = (m) ((Object) this.field_q);
          var4 = var3.a((qg) (this), -2);
          L0: while (true) {
            var5 = this.field_k.indexOf("<hotspot=", var2);
            if ((var5 ^ -1) == 0) {
              return;
            } else {
              var7 = this.field_k.indexOf(">", var5);
              var6 = this.field_k.substring(var5 - -9, var7);
              var7 = Integer.parseInt(var6);
              var2 = this.field_k.indexOf("</hotspot>", var5);
              var8 = var4.b(-1, var5);
              var9 = var4.b(-1, var2);
              var10 = null;
              var11 = var8;
              L1: while (true) {
                if (var11 > var9) {
                  continue L0;
                } else {
                  L2: {
                    var12 = var4.field_b[var11];
                    if ((var11 ^ -1) != (var8 ^ -1)) {
                      stackIn_9_0 = var12.field_g[0];
                      break L2;
                    } else {
                      stackIn_9_0 = var4.c(0, var5);
                      break L2;
                    }
                  }
                  L3: {
                    var13 = stackIn_9_0;
                    if (var11 != var9) {
                      if (var12 == null) {
                        stackIn_14_0 = 0;
                        break L3;
                      } else {
                        stackIn_14_0 = var12.field_g[var12.field_g.length + -1];
                        break L3;
                      }
                    } else {
                      stackIn_14_0 = var4.c(0, var2);
                      break L3;
                    }
                  }
                  L4: {
                    var14 = stackIn_14_0;
                    var15 = new nj(var7, var13, var12.field_a, var14 - var13, Math.max(var3.a(true), -var12.field_a + var12.field_f));
                    if (var10 != null) {
                      ((nj) (var10)).field_s = var15;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  this.field_E.a(var15, -105);
                  var10 = var15;
                  var11++;
                  continue L1;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        super.a((byte) -127, param1, param2, param3);
        int var5 = -this.field_p + param3;
        int var6 = param1 + -this.field_n;
        int var7 = -35 / ((50 - param0) / 45);
        nj var8 = this.a(var6, (byte) -5, var5);
        if (var8 != null) {
            if (!(null == this.field_m)) {
                ((hl) ((Object) this.field_m)).a(param2, 2818, var8.field_n, (le) (this));
            }
        }
    }

    private final nj a(int param0, byte param1, int param2) {
        nj var5 = null;
        int var6 = Transmogrify.field_A ? 1 : 0;
        nj var4 = (nj) ((Object) this.field_E.a((byte) -95));
        while (var4 != null) {
            var5 = var4;
            while (var5 != null) {
                if ((param2 ^ -1) <= (var5.field_i ^ -1)) {
                    if (param0 >= var5.field_h && var5.field_q + var5.field_i > param2 && var5.field_h - -var5.field_o >= param0) {
                        return var4;
                    }
                }
                var5 = var5.field_s;
            }
            var4 = (nj) ((Object) this.field_E.a(true));
        }
        if (param1 == -5) {
            return null;
        }
        return (nj) null;
    }

    final static Boolean d(boolean param0) {
        if (!param0) {
            field_A = (sa) null;
        }
        Boolean var1 = ch.field_f;
        ch.field_f = null;
        return var1;
    }

    void a(int param0, byte param1, qg param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        try {
            super.a(param0, param1, param2, param3);
            this.field_B = null;
            if (this.field_g) {
                var5_int = -this.field_p + oa.field_j - param3;
                var6 = -this.field_n + (bk.field_a + -param0);
                this.field_B = this.a(var6, (byte) -5, var5_int);
            }
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "le.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    String f(int param0) {
        if (this.field_B == null) {
            return null;
        }
        if (null == this.field_D) {
            return null;
        }
        if (this.field_B.field_n >= this.field_D.length) {
            return null;
        }
        if (param0 != 4) {
            this.a(-19, 125, -68, (byte) 31);
        }
        return this.field_D[this.field_B.field_n];
    }

    final static String h(int param0) {
        if (rh.field_v == of.field_d) {
            return hf.field_g;
        }
        if (!(dl.field_l.b(-26753))) {
            return dl.field_l.a((byte) 85);
        }
        if (db.field_a == of.field_d) {
            return dl.field_l.a((byte) -85);
        }
        int var1 = 25 % ((-59 - param0) / 35);
        return ob.field_F;
    }

    public static void i(int param0) {
        field_A = null;
        if (param0 != -1) {
            field_C = (qj) null;
        }
        field_C = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        this.a(26, param3, param0, param1, ((m) ((Object) this.field_q)).b((qg) (this), 228));
        if (param2 != -1) {
            field_C = (qj) null;
        }
    }

    le(String param0, ui param1) {
        super(param0, (ma) null);
        this.field_B = null;
        try {
            this.field_q = param1;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "le.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    void a(int param0, int param1, int param2, byte param3) {
        int var8 = 0;
        int var9 = 0;
        super.a(param0, param1, param2, (byte) -31);
        if (!(-1 == (param2 ^ -1))) {
            return;
        }
        int var6 = 13 % ((param3 - 77) / 34);
        m var10 = (m) ((Object) this.field_q);
        nj var7 = this.field_B;
        if (var7 != null) {
            var8 = var10.a(9112, (qg) (this), param0);
            var9 = var10.a((qg) (this), 62, param1);
            do {
                ri.a(2 + var7.field_q, var7.field_i + (var8 - 2), -2 + var9 + var7.field_h, (byte) -120, var7.field_o - -2);
                var7 = var7.field_s;
            } while (var7 != null);
        }
    }

    static {
    }
}
