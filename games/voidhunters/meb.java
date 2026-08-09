/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class meb implements wwa {
    private int field_a;
    static uja field_d;
    private no field_b;
    private int field_e;
    static float[] field_c;

    public static void a(byte param0) {
        if (param0 != -52) {
            field_c = (float[]) null;
            field_d = null;
            field_c = null;
            return;
        }
        field_d = null;
        field_c = null;
    }

    final static mm a(int param0, int param1) {
        fh stackIn_4_0 = null;
        fh stackIn_8_0 = null;
        if (param1 != 1) {
          L0: {
            meb.a(-8, 53);
            if (ks.field_r != null) {
              stackIn_8_0 = ks.field_r.a(-1, (long)param0);
              break L0;
            } else {
              stackIn_8_0 = null;
              break L0;
            }
          }
          return (mm) ((Object) stackIn_8_0);
        } else {
          L1: {
            if (ks.field_r != null) {
              stackIn_4_0 = ks.field_r.a(-1, (long)param0);
              break L1;
            } else {
              stackIn_4_0 = null;
              break L1;
            }
          }
          return (mm) ((Object) stackIn_4_0);
        }
    }

    public final void a(int param0, shb param1, int param2, int param3, boolean param4) {
        int stackIn_5_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (param1.field_e) {
                  break L2;
                } else {
                  if (param1.e((byte) -120)) {
                    break L2;
                  } else {
                    stackIn_5_0 = 2188450;
                    break L1;
                  }
                }
              }
              stackIn_5_0 = 3249872;
              break L1;
            }
            var6_int = stackIn_5_0;
            var7 = 122 / ((param0 - -27) / 35);
            this.field_b.a("<u=" + Integer.toString(var6_int, 16) + ">" + param1.field_j + "</u>", param2 + param1.field_g, param3 - -param1.field_r, param1.field_h, param1.field_f, var6_int, -1, this.field_e, this.field_a, this.field_b.field_A + this.field_b.field_k);
            if (param1.e((byte) -120)) {
              L3: {
                var8 = this.field_b.b(param1.field_j);
                var9 = this.field_b.field_A + this.field_b.field_k;
                var10 = param2 + param1.field_g;
                if (2 != this.field_e) {
                  if ((this.field_e ^ -1) != -2) {
                    break L3;
                  } else {
                    var10 = var10 + (-var8 + param1.field_h >> 1500556705);
                    break L3;
                  }
                } else {
                  var10 = var10 + (-var8 + param1.field_h);
                  break L3;
                }
              }
              L4: {
                var11 = param1.field_r + param3;
                if (-3 == (this.field_a ^ -1)) {
                  var11 = var11 + (-var9 + param1.field_f);
                  break L4;
                } else {
                  if (this.field_a != 1) {
                    break L4;
                  } else {
                    var11 = var11 + (-var9 + param1.field_f >> -840340319);
                    break L4;
                  }
                }
              }
              aha.a(var11 - -2, var8 + 4, var10 - 2, var9, (byte) -79);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var6);

            stackIn_19_1 = new StringBuilder().append("meb.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public meb() {
        this.field_b = loa.field_o;
        this.field_e = 1;
        this.field_a = 1;
    }

    meb(no param0, int param1, int param2) {
        try {
            this.field_a = param2;
            this.field_b = param0;
            this.field_e = param1;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "meb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_d = new uja();
        field_c = new float[4];
    }
}
