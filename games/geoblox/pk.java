/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk extends qc {
    static String field_r;
    static int field_n;
    private ne field_p;
    private int field_s;
    static gk field_l;
    static String field_q;
    static dm field_k;
    static boolean[] field_o;
    static int field_m;

    final void c(int param0, int param1, byte[] param2, int param3) {
        int fieldTemp$5 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        var7 = Geoblox.field_C;
        try {
          L0: {
            var5_int = 31 % ((param0 - -36) / 37);
            var6 = 0;
            L1: while (true) {
              if (var6 >= param3) {
                break L0;
              } else {
                fieldTemp$5 = this.field_f;
                this.field_f = this.field_f + 1;
                param2[var6 + param1] = (byte)(this.field_j[fieldTemp$5] + -this.field_p.b(0));
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var5);
            stackOut_5_1 = new StringBuilder().append("pk.FB(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param3 + ')');
        }
    }

    final static int a(int param0, byte param1, int param2) {
        int var3 = param2 >>> 2037282111;
        if (param1 != -6) {
            pk.k((byte) 101);
        }
        return -var3 + (param2 + var3) / param0;
    }

    final static void k(byte param0) {
        int discarded$0 = 0;
        da.field_a = 0;
        if (param0 != -13) {
            discarded$0 = pk.a(106, (byte) 22, 96);
        }
    }

    final void a(int[] param0, boolean param1) {
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
              this.field_p = new ne(param0);
              if (!param1) {
                break L1;
              } else {
                this.i(-68);
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
            stackOut_3_1 = new StringBuilder().append("pk.JB(");
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
          throw t.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final void k(int param0) {
        this.field_s = param0 * this.field_f;
    }

    pk(byte[] param0) {
        super(param0);
    }

    final static void h(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        gd var3 = null;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = 0;
            if (param0 < -117) {
              L1: while (true) {
                if (33 <= var2_int) {
                  var4 = 0;
                  var2_int = var4;
                  L2: while (true) {
                    if (var4 >= 33) {
                      p.field_i = null;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      if (!vg.field_j[var4]) {
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        var4++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  if (param1 == ck.field_c[var2_int]) {
                    L3: {
                      if (!vg.field_j[var2_int]) {
                        L4: {
                          L5: {
                            if (10 > var2_int) {
                              break L5;
                            } else {
                              if (26 >= var2_int) {
                                var3 = te.field_c.c(-1879044097, w.field_b[var2_int]);
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          var3 = te.field_c.b(1, w.field_b[var2_int]);
                          break L4;
                        }
                        fl.field_c[var2_int] = var3.a(p.field_i);
                        vg.field_j[var2_int] = true;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var2_int++;
                    continue L1;
                  } else {
                    var2_int++;
                    continue L1;
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
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "pk.IB(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public static void j(int param0) {
        field_o = null;
        field_k = null;
        if (param0 != 0) {
            field_r = (String) null;
        }
        field_r = null;
        field_q = null;
        field_l = null;
    }

    final int e(byte param0, int param1) {
        int incrementValue$0 = 0;
        int var6 = Geoblox.field_C;
        int var3 = this.field_s >> 2101762179;
        if (param0 != -17) {
            return -69;
        }
        int var4 = 8 + -(7 & this.field_s);
        int var5 = 0;
        this.field_s = this.field_s + param1;
        while (var4 < param1) {
            incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((this.field_j[incrementValue$0] & kj.field_G[var4]) << -var4 + param1);
            param1 = param1 - var4;
            var4 = 8;
        }
        if (param1 == var4) {
            var5 = var5 + (this.field_j[var3] & kj.field_G[var4]);
        } else {
            var5 = var5 + (this.field_j[var3] >> var4 - param1 & kj.field_G[param1]);
        }
        return var5;
    }

    final void a(int param0, byte param1) {
        int fieldTemp$0 = this.field_f;
        this.field_f = this.field_f + 1;
        this.field_j[fieldTemp$0] = (byte)(param0 + this.field_p.b(0));
        if (param1 >= -12) {
            pk.h(-6, -80);
        }
    }

    final void i(int param0) {
        this.field_f = (7 + this.field_s) / 8;
        if (param0 != -16989) {
            this.field_p = (ne) null;
        }
    }

    final int j(byte param0) {
        if (param0 != 122) {
            this.k(-51);
        }
        int fieldTemp$0 = this.field_f;
        this.field_f = this.field_f + 1;
        return 255 & this.field_j[fieldTemp$0] + -this.field_p.b(0);
    }

    pk(int param0) {
        super(param0);
    }

    static {
        field_r = "   ";
        field_q = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_m = 15;
        field_o = new boolean[1000];
    }
}
