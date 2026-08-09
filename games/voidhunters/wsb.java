/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wsb {
    private int field_d;
    private int field_j;
    private ujb[] field_i;
    private int field_h;
    float field_g;
    String field_a;
    static dja field_e;
    static String field_c;
    static int field_f;
    static int field_b;

    final boolean a(byte param0) {
        ujb var2;
        int var3;
        String var4;
        ujb var5;
        var3 = VoidHunters.field_G;
        L0: while (true) {
          if (this.field_h <= this.field_j) {
            if (param0 <= 85) {
              var4 = (String) null;
              this.a((asb) null, (String) null, false, (String) null, (String) null);
              return true;
            } else {
              return true;
            }
          } else {
            var5 = this.field_i[this.field_j];
            var2 = var5;
            if (!var5.field_f.b((byte) 123)) {
              this.a(var5, 0, (byte) 125);
              return false;
            } else {
              L1: {
                if (0 > var5.field_b) {
                  break L1;
                } else {
                  if (var5.field_f.c(68, var5.field_b)) {
                    break L1;
                  } else {
                    this.a(var2, var5.field_f.a(var5.field_b, 1045), (byte) 118);
                    return false;
                  }
                }
              }
              L2: {
                if (var5.field_e == null) {
                  break L2;
                } else {
                  if (var5.field_f.a(32171, var5.field_e)) {
                    break L2;
                  } else {
                    this.a(var2, var5.field_f.a(var5.field_e, -2118), (byte) 25);
                    return false;
                  }
                }
              }
              L3: {
                if (-1 >= (var5.field_b ^ -1)) {
                  break L3;
                } else {
                  if (var5.field_e != null) {
                    break L3;
                  } else {
                    if (var5.field_a == null) {
                      break L3;
                    } else {
                      if (var5.field_f.a(105)) {
                        break L3;
                      } else {
                        this.a(var2, var5.field_f.b(-107), (byte) 120);
                        return false;
                      }
                    }
                  }
                }
              }
              this.field_j = this.field_j + 1;
              continue L0;
            }
          }
        }
    }

    final static int a(int param0, int param1) {
        int var2;
        var2 = param0 >>> -139758655;
        if (param1 != 1302374146) {
          return -70;
        } else {
          var2 = var2 | var2 >>> -1581314495;
          var2 = var2 | var2 >>> 1302374146;
          var2 = var2 | var2 >>> 637979588;
          var2 = var2 | var2 >>> -867754360;
          var2 = var2 | var2 >>> -641961200;
          return param0 & (var2 ^ -1);
        }
    }

    private final void a(String param0, byte param1, int param2, String param3, String param4, asb param5) {
        ujb[] var10 = null;
        ujb var9 = null;
        ujb var11 = null;
        int fieldTemp$0 = 0;
        try {
            if (this.field_i.length <= this.field_h) {
                var10 = new ujb[this.field_h * 2];
                ujb[] var7 = var10;
                cua.a(this.field_i, 0, var10, 0, this.field_h);
                this.field_i = var10;
            }
            if (param1 != -62) {
                asb var8 = (asb) null;
                this.a((String) null, 126, (String) null, (asb) null);
            }
            var9 = new ujb();
            var11 = var9;
            ujb var7_ref = var11;
            var11.field_b = param2;
            var11.field_f = param5;
            var11.field_a = param0;
            var11.field_e = param3;
            var11.field_i = param4;
            fieldTemp$0 = this.field_h;
            this.field_h = this.field_h + 1;
            this.field_i[fieldTemp$0] = var9;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "wsb.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(asb param0, String param1, boolean param2, String param3, String param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.a(param1, (byte) -62, -1, param3, param4, param0);
              if (!param2) {
                break L1;
              } else {
                field_b = -110;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("wsb.D(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param4 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), stackIn_15_2 + ')');
        }
    }

    final void a(String param0, int param1, String param2, asb param3) {
        try {
            this.a(param0, (byte) -62, param1, (String) null, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "wsb.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(byte param0) {
        field_c = null;
        if (param0 > -102) {
            field_f = -17;
            field_e = null;
            return;
        }
        field_e = null;
    }

    wsb(int param0) {
        this.field_i = new ujb[16];
        this.field_d = param0;
    }

    private final void a(ujb param0, int param1, byte param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_float = (float)param1 / 100.0f + (float)(this.field_j - -1);
          var5 = 40 % ((-27 - param2) / 40);
          this.field_g = (float)this.field_d * var4_float / (float)(1 + this.field_h);
          if (-1 != (param1 ^ -1)) {
            this.field_a = param0.field_a + " - " + param1 + "%";
            return;
          } else {
            this.field_a = param0.field_i;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("wsb.B(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L0;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L0;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_e = (dja) ((Object) new kfa());
        field_b = 200;
        field_f = field_b / 2;
        field_c = "Hull triangle";
    }
}
