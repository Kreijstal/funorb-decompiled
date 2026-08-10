/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class o extends wj {
    static int field_m;
    private long field_e;
    private long field_i;
    static String field_g;
    static boolean field_l;
    private long[] field_j;
    private int field_h;
    private long field_k;
    private int field_f;

    final long b(int param0) {
        if (param0 != -31887) {
            this.field_k = 83L;
        }
        this.field_e = this.field_e + this.a((byte) -63);
        if (!((this.field_e ^ -1L) <= (this.field_k ^ -1L))) {
            return (-this.field_e + this.field_k) / 1000000L;
        }
        return 0L;
    }

    final static String a(byte param0, int param1, int param2) {
        if (param0 != 85) {
            o.c((byte) -64);
        }
        return param1 + "/" + param2;
    }

    private final long a(byte param0) {
        int var8 = 0;
        int var9 = fleas.field_A ? 1 : 0;
        long var2 = System.nanoTime();
        long var4 = -this.field_i + var2;
        this.field_i = var2;
        if (-5000000000L < var4) {
            if (!(5000000000L <= var4)) {
                this.field_j[this.field_h] = var4;
                this.field_h = (this.field_h + 1) % 10;
                if (!(-2 >= (this.field_f ^ -1))) {
                    this.field_f = this.field_f + 1;
                }
            }
        }
        long var6 = 0L;
        if (param0 != -63) {
            o.b((byte) -81);
        }
        for (var8 = 1; var8 <= this.field_f; var8++) {
            var6 = var6 + this.field_j[(this.field_h + (-var8 - -10)) % 10];
        }
        return var6 / (long)this.field_f;
    }

    public static void b(byte param0) {
        field_g = null;
        if (param0 < 55) {
            field_g = (String) null;
        }
    }

    final int a(int param0, long param1) {
        int var4;
        int var5;
        L0: {
          var5 = fleas.field_A ? 1 : 0;
          if (param0 == -23124) {
            break L0;
          } else {
            this.b(-73);
            break L0;
          }
        }
        if ((this.field_e ^ -1L) <= (this.field_k ^ -1L)) {
          var4 = 0;
          L1: while (true) {
            L2: {
              this.field_k = this.field_k + param1;
              var4++;
              if (-11 >= (var4 ^ -1)) {
                break L2;
              } else {
                if (this.field_e > this.field_k) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (this.field_e > this.field_k) {
                this.field_k = this.field_e;
                break L3;
              } else {
                break L3;
              }
            }
            return var4;
          }
        } else {
          this.field_i = this.field_i + (this.field_k - this.field_e);
          this.field_e = this.field_e + (this.field_k + -this.field_e);
          this.field_k = this.field_k + param1;
          return 1;
        }
    }

    final static boolean c(byte param0) {
        if (param0 != 39) {
            field_m = 21;
        }
        return jg.field_d;
    }

    final static boolean a(boolean param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length() < rf.field_d) {
                  break L1;
                } else {
                  if (param1.length() <= rh.field_a) {
                    L2: {
                      if (!param0) {
                        break L2;
                      } else {
                        field_m = -82;
                        break L2;
                      }
                    }
                    stackIn_9_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    return true;
                  }
                }
              }
            }
            stackIn_5_0 = 1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var2);

            stackIn_12_1 = new StringBuilder().append("o.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    final void c(int param0) {
        this.field_i = 0L;
        if (this.field_e < this.field_k) {
            this.field_e = this.field_e + (-this.field_e + this.field_k);
        }
        if (param0 != 12445) {
            String var3 = (String) null;
            o.a(true, (String) null);
        }
    }

    o() {
        this.field_j = new long[10];
        this.field_i = 0L;
        this.field_e = 0L;
        this.field_h = 0;
        this.field_k = 0L;
        this.field_f = 1;
        this.field_e = System.nanoTime();
        this.field_k = System.nanoTime();
    }

    static {
        field_g = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_l = false;
    }
}
