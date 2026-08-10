/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf {
    static qr field_g;
    oh field_h;
    static volatile boolean field_c;
    static String field_f;
    static long field_e;
    private oh field_b;
    static bi field_d;
    static bi[] field_a;

    final boolean g(int param0) {
        int var2 = -83 / ((param0 - -24) / 49);
        return this.field_h == this.field_h.field_f ? true : false;
    }

    final int a(byte param0, oh[] param1) {
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        oh var5 = null;
        int var6 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var4 = -101 / ((param0 - -4) / 48);
            var3_int = 0;
            var5 = this.field_h.field_f;
            L1: while (true) {
              if (this.field_h == var5) {
                stackIn_5_0 = var3_int;
                break L0;
              } else {
                incrementValue$1 = var3_int;
                var3_int++;
                param1[incrementValue$1] = var5;
                var5 = var5.field_f;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("pf.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0;
    }

    final static void a(int param0, boolean param1, int param2) {
        fc var4 = null;
        String var5_ref_String = null;
        int var5 = 0;
        int var6 = 0;
        if (param2 != -1043) {
            return;
        }
        ve var3 = rq.a(true, param0, param1);
        if (!(var3 == null)) {
            hp.field_m.a(false, param2 + -15618);
            var4 = hp.field_m;
            var5_ref_String = qc.field_u;
            var4.field_j.a(param2 ^ -1044, 5, var5_ref_String);
            var4 = hp.field_m;
            var5 = nh.field_p;
            var6 = td.field_P;
            var4.field_j.b(0, 0, 0, var5, var6);
        }
        di.a(-7904, param1, param0);
    }

    final oh f(int param0) {
        oh var2 = this.field_h.field_e;
        if (var2 == this.field_h) {
            this.field_b = null;
            return null;
        }
        this.field_b = var2.field_e;
        if (param0 != 3725) {
            return (oh) null;
        }
        return var2;
    }

    final oh b(int param0) {
        oh var2 = this.field_b;
        if (!(this.field_h != var2)) {
            this.field_b = null;
            return null;
        }
        this.field_b = var2.field_e;
        if (param0 >= -120) {
            field_a = (bi[]) null;
        }
        return var2;
    }

    final int e(int param0) {
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        int var2 = param0;
        oh var3 = this.field_h.field_f;
        while (var3 != this.field_h) {
            var2++;
            var3 = var3.field_f;
        }
        return var2;
    }

    final oh b(oh param0, int param1) {
        oh var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_7_0 = null;
        oh stackIn_9_0 = null;
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
              if (param1 == -9189) {
                break L1;
              } else {
                this.a(-87);
                break L1;
              }
            }
            L2: {
              if (param0 == null) {
                var3 = this.field_h.field_f;
                break L2;
              } else {
                var3 = param0;
                break L2;
              }
            }
            if (this.field_h != var3) {
              this.field_b = var3.field_f;
              stackIn_9_0 = (oh) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.field_b = null;
              stackIn_7_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("pf.C(");

            if (param0 == null) {
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
          throw r.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (oh) ((Object) stackIn_7_0);
        } else {
          return stackIn_9_0;
        }
    }

    final oh h(int param0) {
        oh var2 = this.field_h.field_f;
        if (var2 == this.field_h) {
            return null;
        }
        var2.b((byte) -104);
        if (param0 <= 25) {
            return (oh) null;
        }
        return var2;
    }

    public static void c(int param0) {
        if (param0 != 0) {
            field_a = (bi[]) null;
        }
        field_g = null;
        field_f = null;
        field_d = null;
        field_a = null;
    }

    final oh d(int param0) {
        oh var2 = this.field_h.field_f;
        if (param0 != 0) {
            field_f = (String) null;
        }
        if (this.field_h == var2) {
            this.field_b = null;
            return null;
        }
        this.field_b = var2.field_f;
        return var2;
    }

    final void a(oh param0, int param1) {
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
              if (null == param0.field_e) {
                break L1;
              } else {
                param0.b((byte) -90);
                break L1;
              }
            }
            L2: {
              param0.field_f = this.field_h.field_f;
              param0.field_e = this.field_h;
              param0.field_e.field_f = param0;
              param0.field_f.field_e = param0;
              if (param1 == 0) {
                break L2;
              } else {
                field_a = (bi[]) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("pf.O(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
    }

    final oh a(boolean param0) {
        if (!param0) {
            this.field_h = (oh) null;
        }
        oh var2 = this.field_h.field_e;
        if (var2 == this.field_h) {
            return null;
        }
        var2.b((byte) -125);
        return var2;
    }

    private final void a(boolean param0, oh param1, pf param2) {
        oh var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          L0: {
            L1: {
              var4 = this.field_h.field_e;
              if (!param0) {
                break L1;
              } else {
                field_f = (String) null;
                break L1;
              }
            }
            L2: {
              this.field_h.field_e = param1.field_e;
              param1.field_e.field_f = this.field_h;
              if (param1 != this.field_h) {
                param1.field_e = param2.field_h.field_e;
                param1.field_e.field_f = param1;
                var4.field_f = param2.field_h;
                param2.field_h.field_e = var4;
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4_ref);

            stackIn_8_1 = new StringBuilder().append("pf.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
        }
    }

    final void a(byte param0, oh param1) {
        if (null != param1.field_e) {
            param1.b((byte) -104);
        }
        param1.field_e = this.field_h.field_e;
        param1.field_f = this.field_h;
        param1.field_e.field_f = param1;
        if (param0 != -113) {
            return;
        }
        try {
            param1.field_f.field_e = param1;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "pf.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final oh a(byte param0) {
        oh var2 = this.field_b;
        if (var2 == this.field_h) {
            this.field_b = null;
            return null;
        }
        if (param0 != -71) {
            return (oh) null;
        }
        this.field_b = var2.field_f;
        return var2;
    }

    final static boolean a(String param0, byte param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param0.charAt(0);
            var3 = 1;
            L1: while (true) {
              if (var3 >= param0.length()) {
                if (param1 == 24) {
                  stackIn_12_0 = 1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  field_f = (String) null;
                  return true;
                }
              } else {
                if (var2_int != param0.charAt(var3)) {
                  stackIn_7_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var2);

            stackIn_15_1 = new StringBuilder().append("pf.A(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    final void a(int param0) {
        oh var2 = null;
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        while (true) {
            var2 = this.field_h.field_f;
            if (this.field_h == var2) {
                break;
            }
            var2.b((byte) -72);
        }
        this.field_b = null;
        if (param0 != 0) {
            oh var4 = (oh) null;
            this.a((byte) -24, (oh) null);
        }
    }

    public pf() {
        this.field_h = new oh();
        this.field_h.field_f = this.field_h;
        this.field_h.field_e = this.field_h;
    }

    final void a(byte param0, pf param1) {
        try {
            this.a(false, this.field_h.field_f, param1);
            if (param0 != -90) {
                this.field_b = (oh) null;
            }
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "pf.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = "Play free version";
        field_c = false;
    }
}
