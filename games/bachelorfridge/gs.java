/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gs {
    sna field_h;
    int field_b;
    boolean field_i;
    int field_m;
    int field_p;
    static eaa field_l;
    int field_j;
    String field_k;
    String field_g;
    String field_n;
    static saa field_f;
    int field_d;
    long field_a;
    static int[] field_c;
    int[] field_o;
    String field_e;

    public static void a(int param0) {
        field_c = null;
        if (param0 != 0) {
            return;
        }
        field_f = null;
        field_l = null;
    }

    final static byte[] a(byte param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = param1.length;
              var3 = new byte[var2_int];
              bl.a(param1, 0, var3, 0, var2_int);
              if (param0 >= 118) {
                break L1;
              } else {
                gs.a(-47);
                break L1;
              }
            }
            stackIn_3_0 = (byte[]) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("gs.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final int a(byte param0) {
        if (!this.field_i) {
          if ((this.field_p ^ -1) != -3) {
            if ((this.field_a ^ -1L) == (ge.field_F ^ -1L)) {
              return 1;
            } else {
              if (-3 != (um.field_c ^ -1)) {
                if (param0 < 117) {
                  this.field_h = (sna) null;
                  return 0;
                } else {
                  return 0;
                }
              } else {
                if (!gl.a(3, this.field_g)) {
                  if (param0 < 117) {
                    this.field_h = (sna) null;
                    return 0;
                  } else {
                    return 0;
                  }
                } else {
                  return 1;
                }
              }
            }
          } else {
            if (-1 <= (this.field_b ^ -1)) {
              if ((this.field_a ^ -1L) == (ge.field_F ^ -1L)) {
                return 1;
              } else {
                if (-3 != (um.field_c ^ -1)) {
                  if (param0 < 117) {
                    this.field_h = (sna) null;
                    return 0;
                  } else {
                    return 0;
                  }
                } else {
                  if (!gl.a(3, this.field_g)) {
                    if (param0 < 117) {
                      this.field_h = (sna) null;
                      return 0;
                    } else {
                      return 0;
                    }
                  } else {
                    return 1;
                  }
                }
              }
            } else {
              return 2;
            }
          }
        } else {
          return 2;
        }
    }

    gs(boolean param0) {
        this.field_m = ad.field_g;
        this.field_i = gq.field_x;
        this.field_e = gba.field_yb;
        this.field_b = vv.field_d;
        this.field_k = to.field_a;
        this.field_d = laa.field_m;
        this.field_g = qia.field_b;
        this.field_n = qk.field_n;
        this.field_p = wka.field_a;
        this.field_j = bna.field_w;
        if (param0) {
            this.field_o = hv.field_a;
        } else {
            this.field_o = null;
        }
        this.field_a = sr.field_a;
    }

    gs(int param0, String param1, int param2, String param3, String param4) {
        try {
            this.field_k = param3;
            this.field_i = true;
            this.field_e = param1;
            this.field_b = 0;
            this.field_a = 0L;
            this.field_j = 0;
            this.field_o = null;
            this.field_d = param2;
            this.field_n = param4;
            this.field_m = 0;
            this.field_g = param1;
            this.field_p = param0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "gs.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static pp a(boolean param0, lu param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        pp stackIn_2_0 = null;
        o stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0) {
              var2_int = param1.e((byte) 113);
              stackIn_4_0 = new o(var2_int);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (pp) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("gs.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (pp) ((Object) stackIn_4_0);
        }
    }

    static {
        field_l = new eaa();
        field_c = new int[24];
    }
}
