/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dd extends ee {
    private ng field_K;
    boolean field_I;
    static nc field_G;
    static int variantMatchCandidateCount;
    static rh field_J;
    private int field_H;
    static int field_C;
    static String loadingMusicText;
    static String[] field_E;

    final static boolean a(byte param0) {
        if (param0 != 47) {
            field_J = (rh) null;
            return cg.b(true);
        }
        return cg.b(true);
    }

    final void c(int param0, int param1, int param2) {
        if (param1 > 95) {
            this.a(param0, param2, (byte) -87, -param0 + fa.field_i >> 1, kb.field_b - param2 >> 1);
            return;
        }
        field_G = (nc) null;
        this.a(param0, param2, (byte) -87, -param0 + fa.field_i >> 1, kb.field_b - param2 >> 1);
    }

    private final int g(int param0) {
        int var2 = 80 % ((-11 - param0) / 46);
        return !this.field_I ? 0 : this.field_K.j(81) != this ? 0 : 256;
    }

    abstract void b(int param0, int param1, int param2);

    boolean f(int param0) {
        int var2 = this.g(-75);
        int var3 = -this.field_H + var2;
        if (!(~var3 >= param0)) {
            this.field_H = this.field_H + (var3 + 8 + -1) / 8;
        }
        if (var3 < 0) {
            this.field_H = this.field_H + (-16 + (var3 + 1)) / 16;
            if (this.field_H != 0) {
                return false;
            }
            if (0 == var2) {
                return !this.field_I ? true : false;
            }
            return false;
        }
        if (this.field_H != 0) {
            return false;
        }
        if (0 == var2) {
            return !this.field_I ? true : false;
        }
        return false;
    }

    dd(ng param0, int param1, int param2) {
        super(kb.field_b - param1 >> 1, -param2 + fa.field_i >> 1, param1, param2, (dh) null);
        try {
            this.field_K = param0;
            this.field_H = 0;
            this.field_I = false;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "dd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean a(String param0, String param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ak.a(param0, (byte) -67)) {
            stackIn_3_0 = 0;
            decompiledRegionSelector0 = 0;
          } else {
            if (ra.a(18725, param0)) {
              stackIn_7_0 = 0;
              decompiledRegionSelector0 = 1;
            } else {
              if (!em.a(param0, param2 + 25409)) {
                if (param1.length() != 0) {
                  if (!ak.a(param0, param1, -75)) {
                    if (param2 != -25321) {
                      dd.i(31);
                    }
                    if (uk.a(8, param1, param0)) {
                      stackIn_22_0 = 0;
                      decompiledRegionSelector0 = 5;
                    } else {
                      if (wc.a(param0, param1, (byte) -107)) {
                        stackIn_26_0 = 0;
                        decompiledRegionSelector0 = 6;
                      } else {
                        return true;
                      }
                    }
                  } else {
                    stackIn_16_0 = 0;
                    decompiledRegionSelector0 = 4;
                  }
                } else {
                  stackIn_13_0 = 1;
                  decompiledRegionSelector0 = 3;
                }
              } else {
                stackIn_10_0 = 0;
                decompiledRegionSelector0 = 2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_29_0 = (RuntimeException) (var3);

          stackIn_29_1 = new StringBuilder().append("dd.MB(");

          if (param0 == null) {
            stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
            stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
            stackIn_30_2 = "null";
          } else {
            stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
            stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
            stackIn_30_2 = "{...}";
          }


          stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

          if (param1 == null) {
            stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
            stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
            stackIn_33_2 = "null";
          } else {
            stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
            stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
            stackIn_33_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',').append(param2).append(')').toString());
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_16_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_22_0 != 0;
                  } else {
                    return stackIn_26_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    boolean h(int param0) {
        this.field_H = this.g(param0 + -297);
        if (param0 != 229) {
            return true;
        }
        if (0 != this.field_H) {
            return false;
        }
        if (!this.field_I) {
            return true;
        }
        return false;
    }

    public static void i(int param0) {
        if (param0 == 256) {
            field_J = null;
            loadingMusicText = null;
            field_G = null;
            field_E = null;
            return;
        }
        dd.a((byte) -87);
        field_J = null;
        loadingMusicText = null;
        field_G = null;
        field_E = null;
    }

    final el f(byte param0) {
        el var2 = super.f((byte) -62);
        if (param0 > -60) {
            this.field_I = false;
            if (!(var2 == null)) {
                return var2;
            }
            return (el) (this);
        }
        if (!(var2 == null)) {
            return var2;
        }
        return (el) (this);
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        if (this.field_H == 0) {
            return;
        }
        if (256 <= this.field_H) {
            if (!(param3 == 0)) {
                return;
            }
            this.b(this.field_v + param0, 20, param1 + this.field_m);
            super.a(param0, param1, (byte) -52, param3);
            return;
        }
        if (oi.field_b == null) {
            oi.field_b = new Sprite(this.field_r, this.field_h);
            var5 = 111 / ((1 - param2) / 43);
            Geoblox.setRasterTarget(1, oi.field_b);
            SoftwareRasterizer.c();
            this.b(0, 20, 0);
            super.a(-param0 - this.field_v, -param1 - this.field_m, (byte) 104, param3);
            id.a(true);
            oi.field_b.d(param0 + this.field_v, this.field_m + param1, this.field_H);
            return;
        }
        if (oi.field_b.width < this.field_r) {
            oi.field_b = new Sprite(this.field_r, this.field_h);
            var5 = 111 / ((1 - param2) / 43);
            Geoblox.setRasterTarget(1, oi.field_b);
            SoftwareRasterizer.c();
            this.b(0, 20, 0);
            super.a(-param0 - this.field_v, -param1 - this.field_m, (byte) 104, param3);
            id.a(true);
            oi.field_b.d(param0 + this.field_v, this.field_m + param1, this.field_H);
            return;
        }
        if (oi.field_b.height < this.field_h) {
            oi.field_b = new Sprite(this.field_r, this.field_h);
            var5 = 111 / ((1 - param2) / 43);
            Geoblox.setRasterTarget(1, oi.field_b);
            SoftwareRasterizer.c();
            this.b(0, 20, 0);
            super.a(-param0 - this.field_v, -param1 - this.field_m, (byte) 104, param3);
            id.a(true);
            oi.field_b.d(param0 + this.field_v, this.field_m + param1, this.field_H);
            return;
        }
        var5 = 111 / ((1 - param2) / 43);
        Geoblox.setRasterTarget(1, oi.field_b);
        SoftwareRasterizer.c();
        this.b(0, 20, 0);
        super.a(-param0 - this.field_v, -param1 - this.field_m, (byte) 104, param3);
        id.a(true);
        oi.field_b.d(param0 + this.field_v, this.field_m + param1, this.field_H);
    }

    static {
        variantMatchCandidateCount = 0;
        loadingMusicText = "Loading music";
    }
}
