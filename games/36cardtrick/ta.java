/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ta extends jc {
    private int field_X;
    static cc field_eb;
    private td field_Y;
    private int field_gb;
    private int field_ab;
    private int field_cb;
    private n field_W;
    private int field_bb;
    static String field_fb;
    static qj field_hb;
    private lk field_db;
    static double field_Z;
    static String[] field_ib;

    final static int a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var6 = Main.field_T;
        try {
          L0: {
            var2_int = param1.length();
            var3 = 105 / ((param0 - 12) / 45);
            var4 = 0;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var2_int) {
                stackOut_4_0 = var4;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var4 = ec.a((byte) -123, param1.charAt(var5)) + (var4 << -1097858139) + -var4;
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var2);
            stackOut_6_1 = new StringBuilder().append("ta.JA(").append(param0).append(',');
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
          throw ma.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0;
    }

    boolean a(boolean param0) {
        int fieldTemp$38 = 0;
        int fieldTemp$39 = 0;
        int var3 = 0;
        var3 = Main.field_T;
        if (param0) {
          L0: {
            if (null != this.field_Y) {
              if (rb.field_h != this.field_Y) {
                if (this.field_Y != jk.field_b) {
                  break L0;
                } else {
                  fieldTemp$38 = this.field_ab + 1;
                  this.field_ab = this.field_ab + 1;
                  if (this.field_X == fieldTemp$38) {
                    this.field_W.field_A = 256;
                    this.field_Y = null;
                    break L0;
                  } else {
                    this.field_W.field_A = (this.field_ab << -1075429240) / this.field_X;
                    break L0;
                  }
                }
              } else {
                fieldTemp$39 = this.field_ab + 1;
                this.field_ab = this.field_ab + 1;
                if (fieldTemp$39 == this.field_bb) {
                  this.field_Y = aj.field_q;
                  this.a((byte) -36, 12 + this.field_db.field_h, this.field_cb + 12 + this.field_db.field_q, this.field_gb);
                  this.field_ab = 0;
                  this.field_W.field_A = 0;
                  break L0;
                } else {
                  this.field_W.field_A = -((this.field_ab << -1728140152) / this.field_bb) + 256;
                  break L0;
                }
              }
            } else {
              break L0;
            }
          }
          return super.a(true);
        } else {
          return true;
        }
    }

    private final void c(int param0, lk param1) {
        if (!(null == this.field_W)) {
            this.field_W.c(90);
        }
        if (param0 != 0) {
            return;
        }
        try {
            if (param1 == null) {
                this.field_W = new n();
            } else {
                param1.a(param1.field_q, this.field_cb + 6, param1.field_h, 6, true);
                this.field_W = new n(param1);
            }
            this.b(this.field_W, (byte) 118);
            this.field_db = null;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "ta.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean o(int param0) {
        this.q(0);
        if (param0 != 928516712) {
            return true;
        }
        return super.o(928516712);
    }

    boolean a(char param0, byte param1, int param2, lk param3) {
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (super.a(param0, (byte) -114, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 <= -99) {
                  break L1;
                } else {
                  this.field_W = (n) null;
                  break L1;
                }
              }
              L2: {
                if (null == this.field_W) {
                  break L2;
                } else {
                  L3: {
                    if ((param2 ^ -1) != -99) {
                      break L3;
                    } else {
                      discarded$4 = this.field_W.a(123, param3);
                      break L3;
                    }
                  }
                  if (99 == param2) {
                    discarded$5 = this.field_W.a(117, param3);
                    break L2;
                  } else {
                    return false;
                  }
                }
              }
              stackOut_12_0 = 0;
              stackIn_13_0 = stackOut_12_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var5);
            stackOut_14_1 = new StringBuilder().append("ta.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_13_0 != 0;
        }
    }

    final void d(byte param0) {
        if (this.field_Y == rb.field_h) {
            return;
        }
        this.field_Y = jk.field_b;
        if (param0 > -29) {
            return;
        }
        this.field_ab = 0;
        this.c(0, this.field_db);
        this.field_db = null;
        this.field_W.field_A = 0;
    }

    final static void c(boolean param0) {
        dg.field_H.field_b = 0;
        if (!param0) {
            return;
        }
        dg.field_H.field_l = 0;
    }

    public static void e(byte param0) {
        field_fb = null;
        int var1 = -62 % ((param0 - 58) / 50);
        field_ib = null;
        field_hb = null;
        field_eb = null;
    }

    ta(j param0, lk param1, int param2, int param3, int param4) {
        super(param0, param1.field_h + 12, param1.field_q + (12 + param2));
        try {
            this.field_X = param3;
            this.field_bb = param3;
            this.field_gb = param4;
            this.field_cb = param2;
            this.c(0, param1);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "ta.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void q(int param0) {
        if (!(null == this.field_Y)) {
            if (!(jk.field_b == this.field_Y)) {
                this.a(this.field_cb + (12 - -this.field_db.field_q), this.field_db.field_h + 12, param0 ^ -1);
                this.c(0, this.field_db);
            }
            this.field_Y = null;
            this.field_W.field_A = 256;
        }
        super.q(param0);
    }

    void c(lk param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
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
            if (param1 >= 28) {
              L1: {
                this.field_db = param0;
                if (this.field_Y != aj.field_q) {
                  if (rb.field_h != this.field_Y) {
                    this.field_Y = rb.field_h;
                    this.field_ab = 0;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  this.a((byte) -86, this.field_db.field_h + 12, 12 - -this.field_cb - -this.field_db.field_q, this.field_gb);
                  this.field_ab = 0;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("ta.J(");
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
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_fb = "This password contains repeated characters, and would be easy to guess";
        field_eb = new cc();
        field_Z = Math.atan2(1.0, 0.0);
        field_ib = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
    }
}
