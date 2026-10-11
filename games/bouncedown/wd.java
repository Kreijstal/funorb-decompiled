/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class wd extends lk {
    static boolean field_x;
    private boolean field_A;
    boolean field_y;
    boolean field_z;
    private boolean field_w;

    void a(int param0, int param1, int param2, lk param3) {
        try {
          super.a(param0, param1, param2, param3);
          if (this.field_u != 0 &&
            this.field_u != n.field_m) {
            if (this.c(uc.field_C, 0, param2, param1, ll.field_y) &&
              n.field_m == 0) {
              this.a(ll.field_y - param2, uc.field_C - param1, (byte) -127, this.field_u);
            }
            this.a(ll.field_y, param1, param3, param2, 34, uc.field_C);
          }
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "wd.P(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    boolean a(int param0, lk param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_y &&
            this.c(param3, param4 - 28455, param6, param2, param5)) {
            this.a(param1, false);
            this.field_u = param0;
            if (this.field_n != null &&
              this.field_n instanceof cc) {
              ((cc) (this.field_n)).a(74, this, param3, param2, param6, param5, param0);
            }
            return true;
          }
          if (param4 == 28455) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("wd.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    wd(String param0, fc param1, sk param2) {
        super(param0, param1, param2);
        this.field_y = true;
        this.field_A = false;
        this.field_w = true;
    }

    final void a(int param0, int param1, lk param2, int param3, int param4, int param5) {
        try {
          if (param4 != 34) {
            this.field_z = true;
          }
          if (null != this.field_n &&
            this.field_n instanceof cc) {
            ((cc) (this.field_n)).a(param3, param5, this, -53, param0, param1);
          }
          this.field_u = 0;
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "wd.MA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final StringBuilder a(int param0, boolean param1, Hashtable param2, StringBuilder param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            stackIn_2_0 = (StringBuilder) null;
            return stackIn_2_0;
          }
          if (this.a(param2, param3, (byte) 14, param0)) {
            this.a(param0, param3, param2, 32362);
            if (this.field_z) {
              discarded$2 = param3.append(" active");
            }
            if (!this.field_y) {
              discarded$3 = param3.append(" disabled");
            }
          }
          stackIn_11_0 = (StringBuilder) (param3);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("wd.HA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    boolean a(lk param0, boolean param1) {
        RuntimeException var3 = null;
        lk var4 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.field_y) {
            return false;
          }
          if (!this.field_w) {
            return false;
          }
          param0.c((byte) 102);
          if (param1) {
            var4 = (lk) null;
            this.a(-13, 60, -58, (lk) null);
          }
          this.field_A = true;
          if (this.field_n != null &&
            this.field_n instanceof dc) {
            ((dc) (this.field_n)).a(-78, this.field_A, (lk) (this));
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("wd.PA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    boolean a(lk param0, char param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -14565) {
            this.a(22, 87, (byte) -62, 99);
          }
          if (!this.e(1)) {
            return false;
          }
          if (param2 != 84 &&
            param2 != 83) {
            return false;
          }
          this.a(-1, -1, (byte) -119, 1);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("wd.E(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static int a(int param0, int param1) {
        int var2;
        int var2Lifetime1;
        int var2Lifetime2;
        if (param1 < -71) {
          if (0 == param0) {
            return 0;
          }
          if (param0 > 0) {
            var2 = 1;
            if (param0 > 65535) {
              var2 += 16;
              param0 = param0 >> 16;
            }
            if (param0 > 255) {
              param0 = param0 >> 8;
              var2 += 8;
            }
            if (param0 > 15) {
              var2 += 4;
              param0 = param0 >> 4;
            }
            if (param0 > 3) {
              var2 += 2;
              param0 = param0 >> 2;
            }
            if (param0 > 1) {
              var2++;
              param0 = param0 >> 1;
            }
            return var2;
          }
          var2Lifetime2 = 2;
          if (param0 < -65536) {
            param0 = param0 >> 16;
            var2Lifetime2 += 16;
          }
          if (-256 > param0) {
            var2Lifetime2 += 8;
            param0 = param0 >> 8;
          }
          if (param0 < -16) {
            var2Lifetime2 += 4;
            param0 = param0 >> 4;
          }
          if (param0 < -4) {
            var2Lifetime2 += 2;
            param0 = param0 >> 2;
          }
          if (param0 < -2) {
            var2Lifetime2++;
            param0 = param0 >> 1;
          }
          return var2Lifetime2;
        }
        field_x = false;
        if (0 == param0) {
          return 0;
        }
        if (param0 > 0) {
          var2Lifetime1 = 1;
          if (param0 > 65535) {
            var2Lifetime1 += 16;
            param0 = param0 >> 16;
          }
          if (param0 > 255) {
            param0 = param0 >> 8;
            var2Lifetime1 += 8;
          }
          if (param0 > 15) {
            var2Lifetime1 += 4;
            param0 = param0 >> 4;
          }
          if (param0 > 3) {
            var2Lifetime1 += 2;
            param0 = param0 >> 2;
          }
          if (param0 > 1) {
            var2Lifetime1++;
            param0 = param0 >> 1;
          }
        } else {
          var2Lifetime1 = 2;
          if (param0 < -65536) {
            param0 = param0 >> 16;
            var2Lifetime1 += 16;
          }
          if (-256 > param0) {
            var2Lifetime1 += 8;
            param0 = param0 >> 8;
          }
          if (param0 < -16) {
            var2Lifetime1 += 4;
            param0 = param0 >> 4;
          }
          if (param0 < -4) {
            var2Lifetime1 += 2;
            param0 = param0 >> 2;
          }
          if (param0 < -2) {
            var2Lifetime1++;
            param0 = param0 >> 1;
          }
        }
        return var2Lifetime1;
    }

    final void c(byte param0) {
        if (param0 < 80) {
          this.field_w = true;
          if (!this.field_A) {
            return;
          }
          this.field_A = false;
          if (this.field_n == null) {
            return;
          }
          if (this.field_n instanceof dc) {
            ((dc) (this.field_n)).a(-70, this.field_A, (lk) (this));
            return;
          }
          return;
        }
        if (!this.field_A) {
          return;
        }
        this.field_A = false;
        if (this.field_n == null) {
          return;
        }
        if (this.field_n instanceof dc) {
          ((dc) (this.field_n)).a(-70, this.field_A, (lk) (this));
          return;
        }
    }

    final boolean e(int param0) {
        if (param0 != 1) {
          this.field_z = false;
          return this.field_A;
        }
        return this.field_A;
    }

    void a(int param0, int param1, byte param2, int param3) {
        lk var6 = null;
        lk var6Lifetime1;
        if (null != this.field_n) {
          if (!(this.field_n instanceof rc)) {
            if (param2 >= -77) {
              var6 = (lk) null;
              this.a(-122, -33, 38, (lk) null);
              return;
            }
            return;
          }
          ((rc) (this.field_n)).a((byte) 110, param0, param3, param1, this);
        }
        if (param2 < -77) {
          return;
        }
        var6Lifetime1 = (lk) null;
        this.a(-122, -33, 38, (lk) null);
    }

    wd(String param0, sk param1) {
        this(param0, ma.field_m.field_b, param1);
    }

    protected wd() {
        this.field_y = true;
        this.field_A = false;
        this.field_w = true;
        this.field_j = ma.field_m.field_l;
    }

    static {
        field_x = true;
    }
}
