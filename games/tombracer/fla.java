/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fla extends vg {
    private int field_j;
    private int field_m;
    private int field_l;
    private int field_k;
    private int field_n;
    private int field_g;
    vb field_i;
    int field_h;
    static vna field_f;

    final void a(w param0, byte param1) {
        try {
            if (param1 > -32) {
                ((fla) this).field_l = 53;
            }
            if (!(0 >= param0.field_i[((fla) this).field_l])) {
                param0.field_i[((fla) this).field_l] = param0.field_i[((fla) this).field_l] - 1;
            }
            ((fla) this).p(25);
            rs.a((fla) this, -110);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "fla.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, w param1, boolean param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 564550600) {
                break L1;
              } else {
                ((fla) this).a(0, -104, 21, 61, -117);
                break L1;
              }
            }
            L2: {
              if (!param2) {
                break L2;
              } else {
                if (((fla) this).field_h > 0) {
                  ((fla) this).c(-90);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (param2) {
                break L3;
              } else {
                if (((fla) this).field_j >> 8 == ((fla) this).field_h) {
                  break L3;
                } else {
                  this.b(4216);
                  break L3;
                }
              }
            }
            if (((fla) this).field_i == null) {
              ((fla) this).a(-91, param1);
              return;
            } else {
              if (((fla) this).field_i.field_f == null) {
                ((fla) this).a(-91, param1);
                return;
              } else {
                if (((fla) this).field_i.field_f.e()) {
                  ((fla) this).a(-91, param1);
                  return;
                } else {
                  if (((fla) this).field_i.l((byte) 103)) {
                    break L0;
                  } else {
                    ((fla) this).a(-91, param1);
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4;
            stackOut_19_1 = new StringBuilder().append("fla.E(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param2 + ')');
        }
    }

    public static void a() {
        field_f = null;
    }

    final void c(int param0) {
        int var2 = 0;
        ((fla) this).field_g = ((fla) this).field_g - ((fla) this).field_n;
        var2 = -91 % ((param0 - -18) / 36);
        if (0 > ((fla) this).field_g) {
          ((fla) this).field_g = 0;
          ((fla) this).field_h = ((fla) this).field_g >> 8;
          ((fla) this).field_i.a(((fla) this).field_m, ((fla) this).field_h, (byte) -21);
          return;
        } else {
          ((fla) this).field_h = ((fla) this).field_g >> 8;
          ((fla) this).field_i.a(((fla) this).field_m, ((fla) this).field_h, (byte) -21);
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        Object var7 = null;
        ((fla) this).field_h = ol.a(param0, ((fla) this).field_l, (byte) -91, param3, param4, param1);
        if (param2 > -127) {
          var7 = null;
          ((fla) this).a(-1, (w) null, false);
          ((fla) this).field_m = jba.a(param3, true, param0);
          ((fla) this).field_i.a(((fla) this).field_m, ((fla) this).field_h, (byte) -21);
          return;
        } else {
          ((fla) this).field_m = jba.a(param3, true, param0);
          ((fla) this).field_i.a(((fla) this).field_m, ((fla) this).field_h, (byte) -21);
          return;
        }
    }

    final void a(int param0, w param1) {
        try {
            int var3_int = 54 % ((-44 - param0) / 44);
            if (!(0 >= param1.field_i[((fla) this).field_l])) {
                param1.field_i[((fla) this).field_l] = param1.field_i[((fla) this).field_l] - 1;
            }
            ((fla) this).p(18);
            rs.a((fla) this, -77);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "fla.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    fla(vb param0, int param1, boolean param2, int param3, int param4, int param5) {
        this(param0, param4, param5);
        try {
            ((fla) this).field_l = param1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "fla.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    fla(vb param0, int param1, int param2) {
        try {
            ((fla) this).field_i = param0;
            ((fla) this).field_h = param1;
            ((fla) this).field_m = param2;
            ((fla) this).field_g = ((fla) this).field_h << 8;
            ((fla) this).field_j = ((fla) this).field_g;
            ((fla) this).field_k = 50;
            ((fla) this).field_n = ((fla) this).field_g / ((fla) this).field_k;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "fla.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void b(int param0) {
        L0: {
          ((fla) this).field_g = ((fla) this).field_g + ((fla) this).field_n;
          if (((fla) this).field_g >= ((fla) this).field_j) {
            ((fla) this).field_g = ((fla) this).field_j;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 4216) {
          this.b(22);
          ((fla) this).field_h = ((fla) this).field_g >> 8;
          ((fla) this).field_i.a(((fla) this).field_m, ((fla) this).field_h, (byte) -21);
          return;
        } else {
          ((fla) this).field_h = ((fla) this).field_g >> 8;
          ((fla) this).field_i.a(((fla) this).field_m, ((fla) this).field_h, (byte) -21);
          return;
        }
    }

    static {
    }
}
