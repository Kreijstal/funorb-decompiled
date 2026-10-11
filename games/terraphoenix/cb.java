/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class cb extends jc {
    private int field_K;
    private int field_N;
    private boolean field_H;
    private boolean field_L;
    static o field_J;
    private int field_A;
    private int field_M;
    static int field_I;

    final static void a(boolean param0, int param1) {
        wl stackIn_3_0 = null;
        wl stackIn_11_0 = null;
        if (!param0) {
          stackIn_11_0 = uk.field_b;
          if (param1 == 6) {
            ((wl) (Object) stackIn_11_0).a(false, (byte) 127, ca.field_a[param1]);
          } else {
            if (param1 == 4) {
              ((wl) (Object) stackIn_11_0).a(false, (byte) 127, ca.field_a[param1]);
            } else {
              if (param1 == 5) {
                ((wl) (Object) stackIn_11_0).a(false, (byte) 127, ca.field_a[param1]);
              } else {
                ((wl) (Object) stackIn_11_0).a(true, (byte) 127, ca.field_a[param1]);
              }
            }
          }
        } else {
          field_I = -26;
          stackIn_3_0 = uk.field_b;
          if (param1 == 6) {
            ((wl) (Object) stackIn_3_0).a(false, (byte) 127, ca.field_a[param1]);
          } else {
            if (param1 == 4) {
              ((wl) (Object) stackIn_3_0).a(false, (byte) 127, ca.field_a[param1]);
            } else {
              if (param1 == 5) {
                ((wl) (Object) stackIn_3_0).a(false, (byte) 127, ca.field_a[param1]);
              } else {
                ((wl) (Object) stackIn_3_0).a(true, (byte) 127, ca.field_a[param1]);
              }
            }
          }
        }
    }

    final void a(gl param0, int param1, int param2, int param3) {
        int stackIn_12_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_17_1 = 0;
        int stackIn_20_2 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          if ((!(this.field_F instanceof eb) ||
            ((eb) (this.field_F)).field_A) &&
            this.field_j == 1) {
            var5_int = -param2 + (ef.field_j - this.field_A);
            var6 = -param1 + (jb.field_b - this.field_K);
            if (var5_int != this.field_w ||
              this.field_u != var6) {
              this.field_w = var5_int;
              this.field_u = var6;
              if (this.field_r instanceof hc) {
                ((hc) (this.field_r)).a(-29856, param2, this, param1);
              }
            }
          } else {
            if (this.field_L) {
              if (this.field_N != this.field_w) {
                var5_int = this.field_N - this.field_w;
                stackIn_12_1 = this.field_w;
                if (Math.abs(var5_int) > 2) {
                  stackIn_13_2 = var5_int >> 1;
                } else {
                  if (0 < var5_int) {
                    stackIn_13_2 = 1;
                  } else {
                    stackIn_13_2 = -1;
                  }
                }
                this.field_w = stackIn_12_1 + stackIn_13_2;
              }
              if (this.field_u != this.field_M) {
                var5_int = this.field_M - this.field_u;
                stackIn_17_1 = this.field_u;
                if (Math.abs(var5_int) <= 2) {
                  if (var5_int > 0) {
                    stackIn_20_2 = 1;
                  } else {
                    stackIn_20_2 = -1;
                  }
                } else {
                  stackIn_20_2 = var5_int >> 1;
                }
                this.field_u = stackIn_17_1 + stackIn_20_2;
              }
            }
          }
          if (param3 < 25) {
            this.field_A = -17;
          }
          super.a(param0, param1, param2, 66);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_33_0 = var5;
          stackIn_33_1 = new StringBuilder().append("cb.B(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(boolean param0, int param1, int param2, int param3, int param4, gl param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
          if (var8_int != 0 &&
            this.field_H) {
            return true;
          }
          if (!this.a(param3, param2, false, param6, param1)) {
            stackIn_10_0 = var8_int;
            return stackIn_10_0 != 0;
          }
          this.field_j = param4;
          if (param4 != 1) {
            return true;
          }
          this.field_K = param6 + (-this.field_u - param2);
          oj.field_w = this;
          this.field_A = -param3 + (param1 - this.field_w);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_13_0 = var8;
          stackIn_13_1 = new StringBuilder().append("cb.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param6).append(')').toString());
        }
    }

    final static boolean a(dh param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param0.a(-16384);
          if (param1 < 72) {
            return true;
          }
          stackIn_6_0 = (var2_int != 1) ? 0 : 1;
          var3 = stackIn_6_0;
          stackIn_7_0 = var3;
          return stackIn_7_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("cb.G(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        field_J = null;
        if (!param0) {
          field_J = (o) null;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, gl param5) {
        super.a(77, param1, param2, param3, param4, param5);
        if (param0 < 36) {
          return;
        }
        try {
          this.field_j = 0;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "cb.HA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0) {
        super.a(param0 ^ param0);
        this.field_F.a(0, (byte) 85, this.field_p, 0, this.field_n);
        this.field_N = this.field_w;
        this.field_M = this.field_u;
    }

    final StringBuilder a(int param0, StringBuilder param1, int param2, Hashtable param3) {
        StringBuilder discarded$62 = null;
        StringBuilder discarded$63 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 34) {
            stackIn_2_0 = (StringBuilder) null;
            return stackIn_2_0;
          }
          if (this.a(param1, param3, param0 ^ -10, param2)) {
            this.a(param3, param2, (byte) 27, param1);
            this.b(param1, param3, param2, 0);
            discarded$62 = param1.append(" revert=").append(this.field_L);
            if (this.field_N != 2147483647 &&
              this.field_M != 2147483647) {
              discarded$63 = param1.append(" to ").append(this.field_N).append(',').append(this.field_M);
            }
          }
          stackIn_9_0 = (StringBuilder) (param1);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("cb.KA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private cb(int param0, int param1, int param2, int param3, cj param4, sc param5, gl param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_N = 2147483647;
        this.field_M = 2147483647;
        try {
          this.field_H = param8 ? true : false;
          this.field_F = param6;
          this.field_L = param7 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "cb.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_J = new o();
    }
}
