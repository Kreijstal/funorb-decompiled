/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh extends na {
    private int field_Y;
    private nf field_eb;
    static ej field_ab;
    private String field_cb;
    private dm field_bb;
    static int field_X;
    static String field_db;
    static nf field_Z;

    final void a(int param0, int param1, byte param2, int param3) {
        String var5 = null;
        fi var6 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        nf var16 = null;
        Object var17 = null;
        nf var18 = null;
        nf var19 = null;
        nf var20 = null;
        nf var21 = null;
        Object var23 = null;
        nf var24 = null;
        nf var25 = null;
        nf var26 = null;
        pj var27 = null;
        pj var28 = null;
        L0: {
          L1: {
            var17 = null;
            var23 = null;
            var13 = Confined.field_J ? 1 : 0;
            var6 = this.field_bb.a(-3621);
            if (ab.field_b == var6) {
              break L1;
            } else {
              if (qh.field_x != var6) {
                var5 = this.field_bb.a((byte) 75);
                if (var5 == null) {
                  var5 = this.field_cb;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                break L1;
              }
            }
          }
          var5 = lk.field_f;
          break L0;
        }
        L2: {
          if (!var5.equals(this.field_B)) {
            this.field_B = var5;
            this.b(false);
            break L2;
          } else {
            break L2;
          }
        }
        if (param2 >= 36) {
          L3: {
            super.a(param0, param1, (byte) 94, param3);
            var6 = this.field_bb.a(-3621);
            var28 = (pj) ((Object) this.field_n);
            var9 = this.field_q + param3;
            var10 = var28.a(param0, 2, (fj) (this)) + (var28.a((fj) (this), (byte) -88).b(23791) >> 628868513);
            if (ab.field_b == var6) {
              break L3;
            } else {
              if (var6 == qh.field_x) {
                break L3;
              } else {
                if (var6 != fb.field_e) {
                  if (nn.field_q == var6) {
                    var25 = gg.field_q[1];
                    var25.c(var9, var10 + -(var25.field_w >> 2035161569), 256);
                    return;
                  } else {
                    return;
                  }
                } else {
                  var24 = gg.field_q[2];
                  var24.c(var9, -(var24.field_w >> -1412188959) + var10, 256);
                  return;
                }
              }
            }
          }
          var26 = gg.field_q[0];
          var11 = var26.field_t << 1388282337;
          var12 = var26.field_x << 1510852449;
          if (null != this.field_eb) {
            if (var11 <= this.field_eb.field_u) {
              if (this.field_eb.field_w < var12) {
                this.field_eb = new nf(var11, var12);
                vm.a(this.field_eb, -8409);
                var26.a(112, 144, var26.field_t << 1934768036, var26.field_x << -125617596, -this.field_Y << 860968586, 4096);
                ib.b(false);
                this.field_eb.c(var9 - (var26.field_t >> -2112280831), var10 - var26.field_x, 256);
                return;
              } else {
                vm.a(this.field_eb, -8409);
                fn.d();
                var26.a(112, 144, var26.field_t << 1934768036, var26.field_x << -125617596, -this.field_Y << 860968586, 4096);
                ib.b(false);
                this.field_eb.c(var9 - (var26.field_t >> -2112280831), var10 - var26.field_x, 256);
                return;
              }
            } else {
              this.field_eb = new nf(var11, var12);
              vm.a(this.field_eb, -8409);
              var26.a(112, 144, var26.field_t << 1934768036, var26.field_x << -125617596, -this.field_Y << 860968586, 4096);
              ib.b(false);
              this.field_eb.c(var9 - (var26.field_t >> -2112280831), var10 - var26.field_x, 256);
              return;
            }
          } else {
            this.field_eb = new nf(var11, var12);
            vm.a(this.field_eb, -8409);
            var26.a(112, 144, var26.field_t << 1934768036, var26.field_x << -125617596, -this.field_Y << 860968586, 4096);
            ib.b(false);
            this.field_eb.c(var9 - (var26.field_t >> -2112280831), var10 - var26.field_x, 256);
            return;
          }
        } else {
          this.a(-64, 111, (byte) -111, 110);
          super.a(param0, param1, (byte) 94, param3);
          var6 = this.field_bb.a(-3621);
          var27 = (pj) ((Object) this.field_n);
          var9 = this.field_q + param3;
          var10 = var27.a(param0, 2, (fj) (this)) + (var27.a((fj) (this), (byte) -88).b(23791) >> 628868513);
          if (ab.field_b != var6) {
            if (var6 != qh.field_x) {
              if (var6 != fb.field_e) {
                if (nn.field_q == var6) {
                  var21 = gg.field_q[1];
                  var21.c(var9, var10 + -(var21.field_w >> 2035161569), 256);
                  return;
                } else {
                  return;
                }
              } else {
                var20 = gg.field_q[2];
                var20.c(var9, -(var20.field_w >> -1412188959) + var10, 256);
                return;
              }
            } else {
              L4: {
                L5: {
                  var19 = gg.field_q[0];
                  var16 = var19;
                  var11 = var19.field_t << 1388282337;
                  var12 = var19.field_x << 1510852449;
                  if (null == this.field_eb) {
                    break L5;
                  } else {
                    if (var11 > this.field_eb.field_u) {
                      break L5;
                    } else {
                      if (this.field_eb.field_w >= var12) {
                        vm.a(this.field_eb, -8409);
                        fn.d();
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                this.field_eb = new nf(var11, var12);
                vm.a(this.field_eb, -8409);
                break L4;
              }
              var19.a(112, 144, var19.field_t << 1934768036, var19.field_x << -125617596, -this.field_Y << 860968586, 4096);
              ib.b(false);
              this.field_eb.c(var9 - (var19.field_t >> -2112280831), var10 - var19.field_x, 256);
              return;
            }
          } else {
            L6: {
              L7: {
                var18 = gg.field_q[0];
                var11 = var18.field_t << 1388282337;
                var12 = var18.field_x << 1510852449;
                if (null == this.field_eb) {
                  break L7;
                } else {
                  if (var11 > this.field_eb.field_u) {
                    break L7;
                  } else {
                    if (this.field_eb.field_w >= var12) {
                      vm.a(this.field_eb, -8409);
                      fn.d();
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              this.field_eb = new nf(var11, var12);
              vm.a(this.field_eb, -8409);
              break L6;
            }
            var18.a(112, 144, var18.field_t << 1934768036, var18.field_x << -125617596, -this.field_Y << 860968586, 4096);
            ib.b(false);
            this.field_eb.c(var9 - (var18.field_t >> -2112280831), var10 - var18.field_x, 256);
            return;
          }
        }
    }

    public static void g(int param0) {
        field_Z = null;
        field_db = null;
        if (param0 != 8692) {
            rh.g(-116);
            field_ab = null;
            return;
        }
        field_ab = null;
    }

    final boolean a(fj param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 == 418) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("rh.I(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    rh(dm param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, kc.a((byte) 93));
        try {
            this.field_cb = param1;
            this.field_bb = param0;
            this.a(-123, param4, param3, param5, param2);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "rh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(fj param0, int param1, int param2, int param3) {
        try {
            this.field_Y = this.field_Y + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "rh.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final String f(byte param0) {
        if (param0 <= -82) {
            return null;
        }
        fj var3 = (fj) null;
        boolean discarded$0 = this.a((fj) null, -88);
        return null;
    }

    static {
        field_ab = new ej();
        field_X = 0;
        field_db = "You already have lasers";
    }
}
