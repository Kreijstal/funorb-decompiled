/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf extends fg {
    private int field_g;
    private int field_j;
    static String field_c;
    private long[] field_i;
    static String field_k;
    static String field_e;
    private long field_d;
    private long field_h;
    private long field_f;

    public static void a(byte param0) {
        field_e = null;
        if (param0 >= -106) {
            field_k = (String) null;
            field_c = null;
            field_k = null;
            return;
        }
        field_c = null;
        field_k = null;
    }

    private final long b(int param0) {
        long var2;
        long var4;
        long var6;
        int var8;
        int var9;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        var2 = System.nanoTime();
        var4 = var2 + -this.field_h;
        this.field_h = var2;
        if (-5000000000L < var4) {
          if (-5000000001L < (var4 ^ -1L)) {
            this.field_i[this.field_j] = var4;
            if (1 <= this.field_g) {
              this.field_j = (this.field_j - -1) % 10;
              var6 = (long)param0;
              var8 = 1;
              L0: while (true) {
                if (this.field_g < var8) {
                  return var6 / (long)this.field_g;
                } else {
                  var6 = var6 + this.field_i[(-var8 + this.field_j - -10) % 10];
                  var8++;
                  continue L0;
                }
              }
            } else {
              this.field_g = this.field_g + 1;
              this.field_j = (this.field_j - -1) % 10;
              var6 = (long)param0;
              var8 = 1;
              L1: while (true) {
                if (this.field_g < var8) {
                  return var6 / (long)this.field_g;
                } else {
                  var6 = var6 + this.field_i[(-var8 + this.field_j - -10) % 10];
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            var6 = (long)param0;
            var8 = 1;
            L2: while (true) {
              if (this.field_g < var8) {
                return var6 / (long)this.field_g;
              } else {
                var6 = var6 + this.field_i[(-var8 + this.field_j - -10) % 10];
                var8++;
                continue L2;
              }
            }
          }
        } else {
          var6 = (long)param0;
          var8 = 1;
          L3: while (true) {
            if (this.field_g < var8) {
              return var6 / (long)this.field_g;
            } else {
              var6 = var6 + this.field_i[(-var8 + this.field_j - -10) % 10];
              var8++;
              continue L3;
            }
          }
        }
    }

    final long a(int param0) {
        this.field_d = this.field_d + this.b(0);
        if (!(this.field_d >= this.field_f)) {
            return (this.field_f - this.field_d) / 1000000L;
        }
        int var2 = -90 % ((34 - param0) / 38);
        return 0L;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 76 % ((param0 - -1) / 36);
        int var4 = param2 >> -398340353 & -1 + param1;
        return var4 + (param2 - -(param2 >>> -1780228321)) % param1;
    }

    final int a(long param0, byte param1) {
        int var4;
        int var5;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param1 == 37) {
          if ((this.field_f ^ -1L) >= (this.field_d ^ -1L)) {
            var4 = 0;
            L0: while (true) {
              L1: {
                this.field_f = this.field_f + param0;
                var4++;
                if (var4 >= 10) {
                  break L1;
                } else {
                  if ((this.field_d ^ -1L) < (this.field_f ^ -1L)) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
              if (this.field_f < this.field_d) {
                this.field_f = this.field_d;
                return var4;
              } else {
                return var4;
              }
            }
          } else {
            this.field_h = this.field_h + (-this.field_d + this.field_f);
            this.field_d = this.field_d + (-this.field_d + this.field_f);
            this.field_f = this.field_f + param0;
            return 1;
          }
        } else {
          field_k = (String) null;
          if ((this.field_f ^ -1L) >= (this.field_d ^ -1L)) {
            var4 = 0;
            L2: while (true) {
              L3: {
                this.field_f = this.field_f + param0;
                var4++;
                if (var4 >= 10) {
                  break L3;
                } else {
                  if ((this.field_d ^ -1L) < (this.field_f ^ -1L)) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (this.field_f >= this.field_d) {
                return var4;
              } else {
                this.field_f = this.field_d;
                return var4;
              }
            }
          } else {
            this.field_h = this.field_h + (-this.field_d + this.field_f);
            this.field_d = this.field_d + (-this.field_d + this.field_f);
            this.field_f = this.field_f + param0;
            return 1;
          }
        }
    }

    final static java.net.URL a(java.applet.Applet param0, byte param1, java.net.URL param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_2_0 = null;
        java.net.URL stackIn_12_0 = null;
        Object stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        Object stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = null;
            if (param1 > 74) {
              L1: {
                if (e.field_c == null) {
                  break L1;
                } else {
                  if (!e.field_c.equals(param0.getParameter("settings"))) {
                    var3 = e.field_c;
                    var4 = var3;
                    var4 = var3;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                var4 = null;
                if (null == kd.field_e) {
                  break L2;
                } else {
                  if (!kd.field_e.equals(param0.getParameter("session"))) {
                    var4 = kd.field_e;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              stackIn_12_0 = fc.a((String) (var3), param2, (String) (var4), -1, 35);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (java.net.URL) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = var3;

            stackIn_15_1 = new StringBuilder().append("uf.H(");

            if (param0 == null) {
              stackIn_16_0 = stackIn_15_0;
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = stackIn_15_0;
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');

            if (param2 == null) {

              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {

              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_12_0;
        }
    }

    final void a(boolean param0) {
        L0: {
          if (this.field_d < this.field_f) {
            this.field_d = this.field_d + (-this.field_d + this.field_f);
            break L0;
          } else {
            break L0;
          }
        }
        if (!param0) {
          return;
        } else {
          this.field_h = 0L;
          return;
        }
    }

    uf() {
        this.field_g = 1;
        this.field_h = 0L;
        this.field_i = new long[10];
        this.field_j = 0;
        this.field_f = 0L;
        this.field_d = 0L;
        this.field_d = System.nanoTime();
        this.field_f = System.nanoTime();
    }

    static {
        field_c = "Cancel";
        field_e = "Not yet achieved";
        field_k = "To Customer Support";
    }
}
