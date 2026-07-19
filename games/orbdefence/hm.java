/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm extends ta implements ai {
    private s field_B;
    static int field_C;
    private s field_E;
    private s field_D;

    public hm() {
        super(0, 0, 476, 225, (td) null);
        this.field_D = new s(ki.field_h, (ag) null);
        this.field_B = new s(bi.field_b, (ag) null);
        this.field_E = new s(gl.field_k, (ag) null);
        vk var1 = new vk();
        this.field_D.field_j = (td) ((Object) var1);
        this.field_B.field_j = (td) ((Object) var1);
        this.field_E.field_j = (td) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> 229140609;
        this.field_B.a(-var3 + this.field_m >> 925249953, this.field_r + -48 - var2, 30, (byte) -90, var4);
        this.field_E.a(var2 + (var4 + (-var3 + this.field_m >> -254843839)), -var2 + -48 + this.field_r, 30, (byte) -90, var4);
        this.field_D.a(this.field_m - var3 >> -271686975, -(2 * var2) + -78 + this.field_r, 30, (byte) -90, var3);
        this.field_B.field_h = (ag) (this);
        this.field_D.field_h = (ag) (this);
        this.field_D.field_i = ec.field_J;
        this.field_E.field_h = (ag) (this);
        this.field_E.field_i = og.field_j;
        this.a(this.field_B, (byte) 74);
        this.a(this.field_D, (byte) 74);
        this.a(this.field_E, (byte) 74);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = this.field_s + param3;
        int var6 = this.field_n - -param0;
        int discarded$0 = lm.field_f.a(bm.field_b, var5 - -20, 20 + var6, this.field_m - 40, this.field_r - 50, 16777215, -1, 1, 0, lm.field_f.field_H);
        super.a(param0, param1, param2, param3);
    }

    final static ki a(int param0, boolean param1, boolean param2, int param3, int param4) {
        String var6 = null;
        if (param0 != 48) {
          var6 = (String) null;
          hm.a((String) null, (byte) 56, false, true);
          return al.a(param1, 5200, param3, param4, param2, false);
        } else {
          return al.a(param1, 5200, param3, param4, param2, false);
        }
    }

    final static void a(String param0, byte param1, boolean param2, boolean param3) {
        ki discarded$0 = null;
        try {
            bg.a(false);
            bm.field_d.n(7920);
            ig.field_ib = new pk(vh.field_k, (String) null, vh.field_j, param3, param2);
            kg.field_j = new pc(bm.field_d, ig.field_ib);
            if (param1 != 33) {
                discarded$0 = hm.a(-114, false, true, 50, -56);
            }
            bm.field_d.b((byte) 74, (pj) (kg.field_j));
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "hm.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static boolean a(int param0, char param1) {
        String var3 = null;
        if (param0 == -20625) {
          if (48 <= param1) {
            if (param1 > 57) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          var3 = (String) null;
          hm.a((String) null, (byte) -28, true, true);
          if (48 <= param1) {
            if (param1 > 57) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final boolean a(char param0, int param1, pj param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        int stackOut_10_0 = 0;
        boolean stackOut_8_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3 ^ param3)) {
              if ((param1 ^ -1) == -99) {
                stackOut_5_0 = this.a(param2, false);
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if ((param1 ^ -1) != -100) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackOut_8_0 = this.b(param2, false);
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var5);
            stackOut_12_1 = new StringBuilder().append("hm.I(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return stackIn_11_0 != 0;
            }
          }
        }
    }

    final static void a(int[] param0, int param1, int param2, int param3) {
        try {
            pc.a((byte) 53, 0, 160, 0, param2, 120, ul.field_b, 0, 0, param3, 1920, param0);
            jl.a(0, 160, param1, 0, -1, 120, 0, 0, ul.field_b, 0);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "hm.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void a(byte param0, int param1, int param2, s param3, int param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param3 == this.field_B) {
                  break L2;
                } else {
                  L3: {
                    if (this.field_D != param3) {
                      break L3;
                    } else {
                      d.c((byte) -126);
                      if (var7 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (this.field_E != param3) {
                    break L1;
                  } else {
                    kj.j(4);
                    if (var7 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              sg.k(-16);
              break L1;
            }
            var6_int = -128 % ((param0 - -3) / 62);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (runtimeException);
            stackOut_11_1 = new StringBuilder().append("hm.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param4 + ')');
        }
    }

    static {
    }
}
