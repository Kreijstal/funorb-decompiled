/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad {
    private int field_i;
    String field_e;
    static boolean field_d;
    static char field_h;
    private wa[] field_f;
    private int field_a;
    float field_g;
    private int field_c;
    static nf field_b;

    final void a(boolean param0, String param1, String param2, mi param3, String param4) {
        try {
            if (param0) {
                this.field_a = 77;
            }
            this.a(param4, param2, -1, -7057, param3, param1);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ad.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(wa param0, boolean param1, int param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_float = (float)param2 / 100.0f + (float)(1 + this.field_c);
            this.field_g = var4_float * (float)this.field_a / (float)(1 + this.field_i);
            if (param1) {
              if (param2 == 0) {
                this.field_e = param0.field_a;
                return;
              } else {
                this.field_e = param0.field_c + " - " + param2 + "%";
                return;
              }
            } else {
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("ad.B(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 >= -2) {
            ad.a((byte) -25);
        }
    }

    final void a(byte param0, mi param1, String param2, String param3) {
        try {
            this.a((String) null, param3, -1, param0 ^ 7061, param1, param2);
            if (param0 != -6) {
                String var6 = (String) null;
                this.a((String) null, (String) null, -81, 87, (mi) null, (String) null);
            }
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ad.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(String param0, String param1, int param2, int param3, mi param4, String param5) {
        wa[] var9 = null;
        wa var8 = null;
        wa var10 = null;
        int fieldTemp$0 = 0;
        try {
            if (this.field_f.length <= this.field_i) {
                var9 = new wa[2 * this.field_i];
                wa[] var7 = var9;
                lj.a(this.field_f, 0, var9, 0, this.field_i);
                this.field_f = var9;
            }
            var8 = new wa();
            var10 = var8;
            wa var7_ref = var10;
            var10.field_a = param5;
            var10.field_b = param0;
            var10.field_f = param2;
            if (param3 != -7057) {
                this.field_g = -0.6586758494377136f;
            }
            var10.field_e = param4;
            var10.field_c = param1;
            fieldTemp$0 = this.field_i;
            this.field_i = this.field_i + 1;
            this.field_f[fieldTemp$0] = var8;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ad.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0) {
        wa var2;
        int var3;
        wa var4;
        var3 = Confined.field_J ? 1 : 0;
        L0: while (true) {
          if (this.field_c >= this.field_i) {
            if (param0 != -1) {
              return false;
            } else {
              return true;
            }
          } else {
            var4 = this.field_f[this.field_c];
            var2 = var4;
            if (!var4.field_e.b(param0 + 1)) {
              this.a(var4, true, 0);
              return false;
            } else {
              L1: {
                if ((var4.field_f ^ -1) > -1) {
                  break L1;
                } else {
                  if (var4.field_e.a(var4.field_f, 0)) {
                    break L1;
                  } else {
                    this.a(var2, true, var4.field_e.b(var4.field_f, -72));
                    return false;
                  }
                }
              }
              L2: {
                if (var4.field_b == null) {
                  break L2;
                } else {
                  if (var4.field_e.a(var4.field_b, param0 ^ -1)) {
                    break L2;
                  } else {
                    this.a(var2, true, var4.field_e.b(-8087, var4.field_b));
                    return false;
                  }
                }
              }
              L3: {
                if (-1 >= (var4.field_f ^ -1)) {
                  break L3;
                } else {
                  if (var4.field_b != null) {
                    break L3;
                  } else {
                    if (var4.field_c == null) {
                      break L3;
                    } else {
                      if (!var4.field_e.a(25057)) {
                        this.a(var2, true, var4.field_e.c(param0 + -123));
                        return false;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              this.field_c = this.field_c + 1;
              continue L0;
            }
          }
        }
    }

    ad(int param0) {
        this.field_f = new wa[16];
        this.field_a = param0;
    }

    static {
        field_d = false;
    }
}
