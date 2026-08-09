/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v {
    vm field_i;
    private int field_b;
    static int field_g;
    int field_l;
    int field_d;
    String field_k;
    int field_h;
    private boolean field_e;
    private int field_c;
    int field_m;
    int field_a;
    private int field_f;
    static bd field_j;

    public static void b(int param0) {
        field_j = null;
        if (param0 != 2) {
            String var2 = (String) null;
            v.a(-74, 'ￋ', (String) null, (String) null);
        }
    }

    v(String param0, int param1, int param2, int param3, int param4) {
        this(param0, param1, param2, param3);
        try {
            this.field_f = param4;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "v.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final boolean d(int param0) {
        int var2 = -48 / ((79 - param0) / 42);
        return this.field_f == ul.field_L ? true : false;
    }

    v(String param0, int param1, int param2) {
        this(param0, param1, param2, 200);
    }

    final static void a(int param0, java.awt.Canvas param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            ea.a(1, (java.awt.Component) ((Object) param1));
            var2_int = 111 / ((param0 - -52) / 39);
            te.a((java.awt.Component) ((Object) param1), -100);
            if (null == h.field_b) {
              break L0;
            } else {
              h.field_b.a(0, (java.awt.Component) ((Object) param1));
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var2);

            stackIn_5_1 = new StringBuilder().append("v.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final boolean a(int param0) {
        if (param0 != 32669) {
            field_g = 7;
            if (this.d(123)) {
                this.a((byte) -69);
                return true;
            }
            return false;
        }
        if (!(!this.d(123))) {
            this.a((byte) -69);
            return true;
        }
        return false;
    }

    private final void c(int param0) {
        if (param0 != 16) {
            return;
        }
        int var2 = this.field_i.b(this.field_k, this.field_m, this.field_b);
        this.field_h = var2;
    }

    v(String param0, int param1, int param2, int param3, int param4, boolean param5) {
        this(param0, param1, param2, param3);
        try {
            this.field_e = param5 ? true : false;
            this.field_f = param4;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "v.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static String a(int param0, char param1, String param2, String param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        int var11 = 0;
        String stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        var11 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param3.length();
              if (param0 == -18214) {
                break L1;
              } else {
                field_j = (bd) null;
                break L1;
              }
            }
            L2: {
              var5 = param2.length();
              var6 = var4_int;
              var7 = -1 + var5;
              if (0 == var7) {
                break L2;
              } else {
                var8_int = 0;
                L3: while (true) {
                  var8_int = param3.indexOf((int) param1, var8_int);
                  if (var8_int >= 0) {
                    var6 = var6 + var7;
                    var8_int++;
                    continue L3;
                  } else {
                    break L2;
                  }
                }
              }
            }
            var8 = new StringBuilder(var6);
            var9 = 0;
            L4: while (true) {
              var10 = param3.indexOf((int) param1, var9);
              if (-1 >= (var10 ^ -1)) {
                discarded$0 = var8.append(param3.substring(var9, var10));
                var9 = var10 - -1;
                discarded$1 = var8.append(param2);
                continue L4;
              } else {
                discarded$2 = var8.append(param3.substring(var9));
                stackIn_13_0 = var8.toString();
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4);

            stackIn_16_1 = new StringBuilder().append("v.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
        }
        return stackIn_13_0;
    }

    final void e(int param0) {
        if (param0 >= -104) {
            return;
        }
        if (this.field_a != 1) {
            return;
        }
        if (this.a((byte) -61)) {
            return;
        }
        this.field_a = 2;
    }

    v(String param0, int param1, int param2, int param3, boolean param4) {
        this(param0, param1, param2, param3);
        try {
            this.field_e = param4 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "v.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        L0: {
          var2 = -uj.field_p.field_e + this.field_l;
          var3 = this.field_d - uj.field_p.field_g;
          if (param0 <= -48) {
            break L0;
          } else {
            this.a(65);
            break L0;
          }
        }
        var4 = this.field_m;
        var5 = this.field_h;
        var6 = 1;
        if (0 <= var2 + (var4 - -8)) {
          if (640 >= var2 + -8) {
            if (8 + (var5 + var3) >= 0) {
              if ((-8 + var3 ^ -1) >= -481) {
                L1: {
                  if (var6 != 0) {
                    ni.a(-87, 16 + var4, 256, -8 + var3, var5 + 16, -8 + var2);
                    this.field_i.a(this.field_k, var2, -6 + var3, var4, var5, this.field_c, -1, 0, 1, this.field_b);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                if (this.field_e) {
                  nh.field_P.b((byte) -61);
                  return var6 != 0;
                } else {
                  return var6 != 0;
                }
              } else {
                L2: {
                  var6 = 0;
                  if (var6 != 0) {
                    ni.a(-87, 16 + var4, 256, -8 + var3, var5 + 16, -8 + var2);
                    this.field_i.a(this.field_k, var2, -6 + var3, var4, var5, this.field_c, -1, 0, 1, this.field_b);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (this.field_e) {
                  nh.field_P.b((byte) -61);
                  return var6 != 0;
                } else {
                  return var6 != 0;
                }
              }
            } else {
              L3: {
                var6 = 0;
                if (var6 != 0) {
                  ni.a(-87, 16 + var4, 256, -8 + var3, var5 + 16, -8 + var2);
                  this.field_i.a(this.field_k, var2, -6 + var3, var4, var5, this.field_c, -1, 0, 1, this.field_b);
                  break L3;
                } else {
                  break L3;
                }
              }
              if (this.field_e) {
                nh.field_P.b((byte) -61);
                return var6 != 0;
              } else {
                return var6 != 0;
              }
            }
          } else {
            L4: {
              var6 = 0;
              if (var6 != 0) {
                ni.a(-87, 16 + var4, 256, -8 + var3, var5 + 16, -8 + var2);
                this.field_i.a(this.field_k, var2, -6 + var3, var4, var5, this.field_c, -1, 0, 1, this.field_b);
                break L4;
              } else {
                break L4;
              }
            }
            if (this.field_e) {
              nh.field_P.b((byte) -61);
              return var6 != 0;
            } else {
              return var6 != 0;
            }
          }
        } else {
          L5: {
            var6 = 0;
            if (var6 != 0) {
              ni.a(-87, 16 + var4, 256, -8 + var3, var5 + 16, -8 + var2);
              this.field_i.a(this.field_k, var2, -6 + var3, var4, var5, this.field_c, -1, 0, 1, this.field_b);
              break L5;
            } else {
              break L5;
            }
          }
          if (this.field_e) {
            nh.field_P.b((byte) -61);
            return var6 != 0;
          } else {
            return var6 != 0;
          }
        }
    }

    v(String param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        this.field_e = false;
        this.field_c = 16776960;
        this.field_b = 15;
        this.field_i = (vm) ((Object) al.field_Z);
        this.field_a = 0;
        try {
          L0: {
            this.field_m = param3;
            this.field_k = param0;
            this.field_l = param1 - this.field_m / 2;
            this.field_d = param2;
            if (null == this.field_k) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              this.field_k = this.field_k.toUpperCase();
              this.c(16);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("v.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
    }
}
