/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf {
    private int field_d;
    private int field_e;
    static int[] field_a;
    static int field_g;
    private ji field_b;
    private bg field_c;
    static String field_f;

    final static void b(byte param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        var1 = hh.field_M;
        synchronized (var1) {
          L0: {
            ul.field_o = bb.field_I;
            uc.field_eb = uc.field_eb + 1;
            bk.field_b = cj.field_i;
            sh.field_e = ij.field_h;
            ob.field_c = ql.field_K;
            ql.field_K = false;
            nk.field_z = lj.field_a;
            ef.field_a = qb.field_j;
            ck.field_a = gk.field_b;
            lj.field_a = 0;
            var2 = -8 / ((param0 - 30) / 41);
            break L0;
          }
        }
    }

    final void a(Object param0, int param1, long param2) {
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
              this.a(param2, (byte) 62, 1, param0);
              if (param1 == -25253) {
                break L1;
              } else {
                field_g = -94;
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
            stackOut_3_1 = new StringBuilder().append("bf.F(");
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
          throw ld.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static jb a(int[] param0, jb param1, int param2) {
        jb var3 = null;
        RuntimeException var3_ref = null;
        jb stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        jb stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var3 = new jb(param2, 0, 0);
            var3.field_h = param1.field_h;
            var3.field_e = param1.field_e;
            var3.field_c = param1.field_c;
            var3.field_j = param0;
            var3.field_g = param1.field_g;
            var3.field_f = param1.field_f;
            var3.field_b = param1.field_b;
            var3.field_i = param1.field_i;
            stackOut_0_0 = (jb) (var3);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var3_ref);
            stackOut_2_1 = new StringBuilder().append("bf.D(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
          throw ld.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    final Object a(long param0, int param1) {
        Object var5 = null;
        gj var6 = null;
        rh var7 = null;
        rh var8 = null;
        rh var9 = null;
        Object var10 = null;
        rh var11 = null;
        Object var12 = null;
        if (param1 == 0) {
          var11 = (rh) ((Object) this.field_b.a((byte) 42, param0));
          if (var11 != null) {
            var12 = var11.c((byte) 30);
            if (var12 != null) {
              if (!var11.d((byte) -90)) {
                this.field_c.a(var11, (byte) 25);
                var11.field_j = 0L;
                if (Lexicominos.field_L) {
                  var6 = new gj(var12, var11.field_q);
                  this.field_b.a(var6, 1, var11.field_d);
                  this.field_c.a(var6, (byte) 25);
                  ((rh) ((Object) var6)).field_j = 0L;
                  var11.b((byte) -122);
                  var11.b(12);
                  return var12;
                } else {
                  return var12;
                }
              } else {
                var6 = new gj(var12, var11.field_q);
                this.field_b.a(var6, 1, var11.field_d);
                this.field_c.a(var6, (byte) 25);
                ((rh) ((Object) var6)).field_j = 0L;
                var11.b((byte) -122);
                var11.b(12);
                return var12;
              }
            } else {
              var11.b((byte) -124);
              var11.b(param1 ^ 12);
              this.field_d = this.field_d + var11.field_q;
              return null;
            }
          } else {
            return null;
          }
        } else {
          var7 = (rh) null;
          this.a((rh) null, (byte) 68);
          var9 = (rh) ((Object) this.field_b.a((byte) 42, param0));
          var8 = var9;
          if (var9 != null) {
            var10 = var9.c((byte) 30);
            var5 = var10;
            if (var10 != null) {
              if (!var9.d((byte) -90)) {
                this.field_c.a(var9, (byte) 25);
                var9.field_j = 0L;
                if (!Lexicominos.field_L) {
                  return var10;
                } else {
                  var6 = new gj(var10, var9.field_q);
                  this.field_b.a(var6, 1, var9.field_d);
                  this.field_c.a(var6, (byte) 25);
                  ((rh) ((Object) var6)).field_j = 0L;
                  var9.b((byte) -122);
                  var9.b(12);
                  return var10;
                }
              } else {
                var6 = new gj(var10, var9.field_q);
                this.field_b.a(var6, 1, var9.field_d);
                this.field_c.a(var6, (byte) 25);
                ((rh) ((Object) var6)).field_j = 0L;
                var9.b((byte) -122);
                var9.b(12);
                return var10;
              }
            } else {
              var9.b((byte) -124);
              var9.b(param1 ^ 12);
              this.field_d = this.field_d + var9.field_q;
              return null;
            }
          } else {
            return null;
          }
        }
    }

    private final void a(long param0, byte param1, int param2, Object param3) {
        RuntimeException runtimeException = null;
        rh var6 = null;
        gj var6_ref = null;
        int var7 = 0;
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
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (this.field_e >= param2) {
              this.b(param0, 111);
              this.field_d = this.field_d - param2;
              L1: while (true) {
                L2: {
                  if (this.field_d >= 0) {
                    break L2;
                  } else {
                    var6 = (rh) ((Object) this.field_c.b((byte) 112));
                    this.a(var6, (byte) 9);
                    if (var7 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  var6_ref = new gj(param3, param2);
                  this.field_b.a(var6_ref, 1, param0);
                  this.field_c.a(var6_ref, (byte) 25);
                  if (param1 == 62) {
                    break L3;
                  } else {
                    bf.a((byte) 17);
                    break L3;
                  }
                }
                ((rh) ((Object) var6_ref)).field_j = 0L;
                break L0;
              }
            } else {
              throw new IllegalStateException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (runtimeException);
            stackOut_10_1 = new StringBuilder().append("bf.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    private final void b(long param0, int param1) {
        rh var4 = (rh) ((Object) this.field_b.a((byte) 42, param0));
        if (param1 <= 46) {
            return;
        }
        this.a(var4, (byte) 9);
    }

    private bf() throws Throwable {
        throw new Error();
    }

    public static void a(byte param0) {
        jb discarded$0 = null;
        field_a = null;
        field_f = null;
        if (param0 > -51) {
            jb var2 = (jb) null;
            discarded$0 = bf.a((int[]) null, (jb) null, 69);
        }
    }

    private final void a(rh param0, byte param1) {
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
              if (param1 == 9) {
                break L1;
              } else {
                this.field_d = 77;
                break L1;
              }
            }
            if (param0 != null) {
              param0.b((byte) -122);
              param0.b(param1 + 3);
              this.field_d = this.field_d + param0.field_q;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var3);
            stackOut_6_1 = new StringBuilder().append("bf.H(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
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
          throw ld.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    static {
        field_g = -1;
        field_a = new int[16384];
        field_f = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
