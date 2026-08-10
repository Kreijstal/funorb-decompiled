/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wta extends sc implements en, aca {
    vq field_c;

    public final void a(uf param0, byte param1) {
        try {
            this.a(18);
            if (param1 != 100) {
                this.field_c = (vq) null;
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "wta.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(int param0, nva param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param0 != -3) {
                this.field_c = (vq) null;
                this.a(79);
                break L1;
              } else {
                this.a(79);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("wta.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    public wta() {
    }

    final String d(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            var2_int = this.field_c.e(-5);
            var3 = this.field_c.c(true);
            var4 = this.field_c.f(3476);
            if (param0 == 16384) {
              L1: {
                var5 = vga.a(true);
                if (-1891 < (var4 ^ -1)) {
                  break L1;
                } else {
                  if (-3 + var5 < var4) {
                    break L1;
                  } else {
                    if (!iia.a(var3, var2_int, true, var4)) {
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      return null;
                    }
                  }
                }
              }
              stackIn_7_0 = isa.a(fob.field_d, new String[]{"1890", Integer.toString(var5 + -3)}, 79);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = (NumberFormatException) (Object) decompiledCaughtException;
            decompiledRegionSelector0 = 2;
            break L2;
          }
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return apa.field_o;
          }
        }
    }

    final qrb b(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        qrb stackIn_5_0 = null;
        qrb stackIn_9_0 = null;
        qrb stackIn_12_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = this.field_c.e(-5);
              var3 = this.field_c.c(true);
              if (param0 == -1) {
                break L1;
              } else {
                this.field_c = (vq) null;
                break L1;
              }
            }
            var4 = this.field_c.f(3476);
            var5 = vga.a(true);
            if (-1891 < (var4 ^ -1)) {
              stackIn_5_0 = cca.field_o;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (var4 > -3 + var5) {
                stackIn_9_0 = cca.field_o;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (iia.a(var3, var2_int, true, var4)) {
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_12_0 = cca.field_o;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return cca.field_o;
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return lea.field_o;
            } else {
              return stackIn_12_0;
            }
          }
        }
    }

    public final void a(int param0, uf param1) {
        try {
            if (param0 != -12409) {
                this.d(116);
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "wta.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean b(byte param0) {
        if (param0 >= -100) {
            this.b((byte) 87);
            return this.field_c.d(0);
        }
        return this.field_c.d(0);
    }

    static {
    }
}
