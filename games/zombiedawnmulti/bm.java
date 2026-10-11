/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bm extends fc {
    private final boolean c(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 33554432) {
            this.a(-55);
          }
          stackIn_10_0 = ((33554432 & this.b(param2, (byte) -124, param1)) == 0) || !((this.b(param2, (byte) -75, param1) >> 7 & 511) <= 64);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "bm.P(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int b(int param0, int param1, int param2) {
        int discarded$0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_270_0 = 0;
        int stackIn_273_1 = 0;
        int stackIn_277_0 = 0;
        int stackIn_280_1 = 0;
        int stackIn_284_0 = 0;
        int stackIn_311_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var9Lifetime1;
        int var10Lifetime1;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var4_int = this.b(param1, (byte) -83, param0);
          var4_int = var4_int & -67108865;
          if (param2 != -8130) {
            discarded$0 = this.b(-33, (byte) 40, -88);
          }
          var5 = (var4_int & 65408) >> 7;
          if ((var4_int & 33554432) != 0 &&
            var5 == 0) {
            var4_int = var4_int & -65409;
            if (!this.c(33554432, param0 + 1, param1) &&
              !this.a(param1, (byte) 2, 1 + param0)) {
              stackIn_17_0 = 1;
            } else {
              stackIn_17_0 = 0;
            }
            var6 = stackIn_17_0;
            var7 = this.c(33554432, param0, param1 + 3) ? 1 : 0;
            var8 = this.c(33554432, param0, param1 - 1) ? 1 : 0;
            if (!this.c(33554432, param0 - 1, param1) &&
              this.a(param1, (byte) 2, param0 - 1)) {
              stackIn_24_0 = 0;
            } else {
              stackIn_24_0 = 1;
            }
            boolean decompiledFrameRemainder0 = true;
            var9 = stackIn_24_0;
            var10 = this.c(param2 ^ -33562562, 1 + param0, param1) ? 1 : 0;
            if (this.a(param1, (byte) 2, param0) &&
              var6 == 0) {
              if (var7 != 0 &&
                var8 != 0 &&
                var9 != 0 &&
                var10 != 0) {
                var4_int = var4_int | this.a(9, 0);
              }
              if (var7 != 0 &&
                var8 != 0 &&
                var9 != 0 &&
                var10 == 0) {
                var4_int = var4_int | this.a(10, 0);
              }
              if (var7 != 0 &&
                var8 != 0 &&
                var9 == 0 &&
                var10 != 0) {
                var4_int = var4_int | this.a(11, 0);
              }
              if (var7 != 0 &&
                var8 != 0 &&
                var9 == 0 &&
                var10 == 0) {
                var4_int = var4_int | this.a(18, param2 ^ -8130);
              }
              if (var7 != 0 &&
                var8 == 0 &&
                var9 != 0 &&
                var10 != 0) {
                var4_int = var4_int | this.a(12, 0);
              }
              if (var7 != 0 &&
                var8 == 0 &&
                var9 != 0 &&
                var10 == 0) {
                var4_int = var4_int | this.a(14, 0);
              }
              if (var7 != 0 &&
                var8 == 0 &&
                var9 == 0 &&
                var10 != 0) {
                var4_int = var4_int | this.a(15, 0);
              }
              if (var7 != 0 &&
                var8 == 0 &&
                var9 == 0 &&
                var10 == 0) {
                var4_int = var4_int | this.a(21, param2 ^ -8130);
              }
              if (var7 == 0 &&
                var8 != 0 &&
                var9 != 0 &&
                var10 != 0) {
                var4_int = var4_int | this.a(13, 0);
              }
              if (var7 == 0 &&
                var8 != 0 &&
                var9 != 0 &&
                var10 == 0) {
                var4_int = var4_int | this.a(16, 0);
              }
              if (var7 == 0 &&
                var8 != 0 &&
                var9 == 0 &&
                var10 != 0) {
                var4_int = var4_int | this.a(17, 0);
              }
              if (var7 == 0 &&
                var8 != 0 &&
                var9 == 0 &&
                var10 == 0) {
                var4_int = var4_int | this.a(20, param2 + 8130);
              }
              if (var7 == 0 &&
                var8 == 0 &&
                var9 != 0 &&
                var10 != 0) {
                var4_int = var4_int | this.a(19, 0);
              }
              if (var7 == 0 &&
                var8 == 0 &&
                var9 != 0 &&
                var10 == 0) {
                var4_int = var4_int | this.a(22, param2 + 8130);
              }
              if (var7 == 0 &&
                var8 == 0 &&
                var9 == 0 &&
                var10 != 0) {
                var4_int = var4_int | this.a(23, 0);
              }
              decompiledFrameRemainder0 = (var7 == 0);
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameRemainder0 = (var8 == 0)) &&
                (decompiledFrameRemainder0 = (var9 == 0)) &&
                (decompiledFrameRemainder0 = (var10 == 0))) {
                var4_int = var4_int | this.a(24, 0);
                decompiledFrameRemainder0 = (var12 != 0);
              }
            }
            if (decompiledFrameRemainder0) {
              if (!this.a(param1, (byte) 2, param0) ||
                var6 == 0) {
                if ((!this.c(param2 ^ -33562562, param0, 1 + param1)) &&
                  (decompiledFrameRemainder0 = !(!this.c(param2 + 33562562, param0, param1 + 2)))) {
                  if (this.c(param2 ^ -33562562, 1 + param0, param1) &&
                    this.c(33554432, -1 + param0, param1)) {
                    var4_int = var4_int | this.a(6, param2 + 8130);
                    decompiledFrameRemainder0 = (var12 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    if (this.c(param2 + 33562562, param0 + 1, param1)) {
                      var4_int = var4_int | this.a(8, 0);
                      decompiledFrameRemainder0 = (var12 != 0);
                    }
                    if (decompiledFrameRemainder0) {
                      if (this.c(param2 ^ -33562562, param0 - 1, param1)) {
                        var4_int = var4_int | this.a(4, 0);
                        decompiledFrameRemainder0 = (var12 != 0);
                      }
                      if (decompiledFrameRemainder0) {
                        var4_int = var4_int | this.a(2, param2 + 8130);
                        decompiledFrameRemainder0 = (var12 != 0);
                      }
                    }
                  }
                }
                if (decompiledFrameRemainder0) {
                  if (this.c(33554432, param0 + 1, param1) &&
                    this.c(33554432, -1 + param0, param1)) {
                    var4_int = var4_int | this.a(5, 0);
                    decompiledFrameRemainder0 = (var12 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    if (this.c(33554432, param0 + 1, param1)) {
                      var4_int = var4_int | this.a(7, 0);
                      decompiledFrameRemainder0 = (var12 != 0);
                    }
                    if (decompiledFrameRemainder0) {
                      if (!this.c(param2 + 33562562, param0 - 1, param1)) {
                        var4_int = var4_int | this.a(1, param2 + 8130);
                        decompiledFrameRemainder0 = (var12 != 0);
                      }
                      if (decompiledFrameRemainder0) {
                        var4_int = var4_int | this.a(3, 0);
                        decompiledFrameRemainder0 = (var12 != 0);
                      }
                    }
                  }
                }
              }
              if (decompiledFrameRemainder0) {
                stackIn_270_0 = var10;
                if (!this.c(33554432, param0 + 1, 2 + param1) &&
                  !this.c(33554432, param0 + 1, param1 + 1)) {
                  stackIn_273_1 = 0;
                } else {
                  stackIn_273_1 = 1;
                }
                var10Lifetime1 = stackIn_270_0 | stackIn_273_1;
                stackIn_277_0 = var9;
                if (!this.c(param2 ^ -33562562, param0 - 1, 2 + param1) &&
                  !this.c(param2 + 33562562, -1 + param0, param1 + 1)) {
                  stackIn_280_1 = 0;
                } else {
                  stackIn_280_1 = 1;
                }
                var9Lifetime1 = stackIn_277_0 | stackIn_280_1;
                stackIn_284_0 = (!this.c(33554432, param0 + 1, 1 + param1)) ? 0 : 128;
                var11 = stackIn_284_0;
                if (var7 == 0 &&
                  var8 == 0 &&
                  var9Lifetime1 != 0 &&
                  var10Lifetime1 != 0) {
                  var4_int = var4_int | this.a(26, 0) - var11;
                }
                if (var7 == 0 &&
                  var8 == 0 &&
                  var9Lifetime1 == 0 &&
                  var10Lifetime1 != 0) {
                  var4_int = var4_int | -var11 + this.a(28, 0);
                }
              }
            }
            if ((65408 & var4_int) == 0) {
              var4_int = var4_int | this.a(24, 0);
            }
            stackIn_311_0 = var4_int;
            return stackIn_311_0;
          }
          stackIn_9_0 = var4_int;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "bm.V(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(byte param0) {
        this.a(this.field_g, 9);
        if (param0 <= 120) {
          return;
        }
        try {
          this.a((byte) -117, this.field_g);
          this.field_d = this.field_g[0].length;
          this.field_e = this.field_g.length;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "bm.G(" + param0 + ')');
        }
    }

    final void a(kb param0, byte param1) {
        int stackIn_21_0 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_66_2 = null;
        RuntimeException decompiledCaughtException = null;
        th var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        ek var6 = null;
        ge var7 = null;
        int var8 = 0;
        int var9 = 0;
        ge var10 = null;
        int var11 = 0;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var3 = this.a(-103);
          param0.field_f = 1;
          var4 = 0;
          do {
            if (!(var4 < param0.field_y.length)) {
              var4 = 0;
              break;
            }
            param0.field_y[var4] = var4;
            var4++;
          } while (var11 == 0);
          do {
            if (!((param0.field_t - 1) > var4)) {
              var4 = 0;
              var5 = 0;
              break;
            }
            var5 = hp.a((byte) 10, g.field_a, param0.field_t - var4) + var4;
            var6_int = param0.field_y[var5];
            param0.field_y[var5] = param0.field_y[var4];
            param0.field_y[var4] = var6_int;
            var4++;
          } while (var11 == 0);
          if (param1 <= 7) {
            return;
          }
          var6 = (ek) (var3.c(48));
          while (null != var6) {
            if (var11 != 0) {
              return;
            }
            stackIn_21_0 = var6 instanceof lm ? 1 : 0;
            if (stackIn_21_0 != 0 ||
              var6 instanceof ge) {
              if (var6 instanceof ge) {
                var7 = (ge) (var6);
                if (!(var7.field_gb > 1) ||
                  !(param0.field_t <= var7.field_gb) ||
                  var11 != 0) {
                  var7.field_gb = param0.field_y[var7.field_gb];
                  var8 = 1;
                  if (param0.b((byte) -121, 52, var7.field_gb)) {
                    var8++;
                  }
                  if (param0.b((byte) -62, 50, var7.field_gb)) {
                    var8 += 2;
                  }
                  if (var4 == 0 ||
                    var5 <= 0) {
                    if (var4 != 0) {
                      var8 = 1;
                    }
                    var5 = var5 + var8;
                    var9 = 0;
                    while (var8 > var9) {
                      var10 = new ge(var7.e((byte) -112) + (-3 + var9 % 5) * 2, var7.g(1829947600) + (var9 * 11 % 7 - 3) * 2, var7.d(true));
                      var10.field_gb = var7.field_gb;
                      var10.field_x = param0.a(-16777216);
                      stackIn_21_0 = var4;
                      if (stackIn_21_0 != 0) {
                        System.out.println("Zombie! oid " + var10.field_x);
                      }
                      param0.field_K.a(var10, false);
                      var9++;
                    }
                  }
                }
              } else {
                var6.field_x = param0.a(-16777216);
                param0.field_K.a(var6, false);
              }
            }
            var6 = (ek) (var3.b(6));
            continue;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_65_0 = var3_ref;
          stackIn_65_1 = new StringBuilder().append("bm.U(");
          if (param0 == null) {
            stackIn_66_2 = "null";
          } else {
            stackIn_66_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_65_0), ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, ul param1) {
        RuntimeException runtimeException = null;
        ja var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new ja(param1.a("final_frame.jpg", "", false), (java.awt.Component) ((Object) dk.field_Ib));
          var3 = var2.field_x;
          var4 = var2.field_w;
          m.c(540);
          if (param0 != 30651) {
            return;
          }
          qp.field_v = new ja(var3, var4 * 3 / 4);
          qp.field_v.a();
          var2.c(0, 0);
          qd.field_s = new ja(var3, -qp.field_v.field_w + var4);
          qd.field_s.a();
          var2.c(0, -qp.field_v.field_w);
          qd.field_s.field_y = qp.field_v.field_w;
          ql.a(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("bm.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final boolean a(int param0, byte param1, int param2) {
        RuntimeException var4 = null;
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 2) {
            return false;
          }
          stackIn_10_0 = (!this.c(33554432, param2, param0 + 1)) && (!this.c(33554432, param2, param0 + 2));
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "bm.Q(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final ek a(int param0, int param1, int param2, int param3, int param4) {
        sh var6 = null;
        int var6_int = 0;
        RuntimeException var6_ref = null;
        ge var7 = null;
        ek stackIn_2_0 = null;
        lm stackIn_8_0 = null;
        sh stackIn_11_0 = null;
        ge stackIn_13_0 = null;
        Object stackIn_15_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -8944) {
            stackIn_2_0 = (ek) null;
            return stackIn_2_0;
          }
          if (0 == param4) {
            var6_int = 1073741823 & param3;
            var7 = new ge(param0, param1, var6_int);
            var7.field_gb = (byte)((-1073741824 & param3) >>> 30);
            stackIn_13_0 = var7;
            return (ek) ((Object) stackIn_13_0);
          }
          if (param4 == 1) {
            stackIn_8_0 = ee.a(param3, param1, param0, true);
            return (ek) ((Object) stackIn_8_0);
          }
          if (param4 != 4) {
            stackIn_15_0 = null;
            return (ek) (stackIn_15_0);
          }
          var6 = new sh(param0, param1);
          var6.field_O = (byte)(3 & param3 >>> 30);
          stackIn_11_0 = var6;
          return (ek) ((Object) stackIn_11_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var6_ref), "bm.S(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(byte param0, int[][] param1) {
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var3_int = 0;
          if (param0 >= -105) {
            return;
          }
          L0: while (true) {
            stackIn_4_0 = var3_int;
            stackIn_4_1 = param1.length;
            if (stackIn_4_0 < stackIn_4_1) {
              if (var8 != 0) {
                return;
              }
              var4 = 0;
              while (param1[0].length > var4) {
                var5 = this.b(var4, var3_int, -8130);
                var6 = (65408 & var5) >> 7;
                var7 = (33488896 & var5) >> 16;
                stackIn_4_0 = 0;
                stackIn_4_1 = -2147483648 & var5;
                if (stackIn_4_0 != stackIn_4_1 && (var6 >= 9 &&
                  var6 <= 32 ||
                  9 <= var7 &&
                  var7 <= 32 ||
                  (this.b(var4, 1 + var3_int, -8130) >> 7 & 511) == 16)) {
                  var5 = var5 | 67108864;
                }
                this.field_f[var3_int][var4] = var5;
                var4++;
              }
              var3_int++;
              continue L0;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_32_0 = var3;
          stackIn_32_1 = new StringBuilder().append("bm.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3) {
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          en.a(-1, 1);
          if (param1 == 10 &&
            1 == op.field_m.field_t) {
            bi.field_e = true;
            param3 = 1;
            param1 = 15;
          }
          gk.field_b = 0;
          vd.field_d = param3;
          sp.field_g = param1;
          if (param2 <= 124) {
            return;
          }
          if (sp.field_g == -4 ||
            sp.field_g == -2 ||
            sp.field_g == -5 ||
            1 == sp.field_g ||
            8 == sp.field_g) {
            cj.d(false, 0);
            if ((var5 != 0) &&
              (sp.field_g == 15)) {
              cj.d(false, 10);
            }
          } else {
            if (sp.field_g == 15) {
              cj.d(false, 10);
            }
          }
          if (-4 == sp.field_g) {
            iq.field_f = true;
            if ((var5 != 0) &&
              (sp.field_g == -7)) {
              iq.field_f = false;
            }
          } else {
            if (sp.field_g == -7) {
              iq.field_f = false;
            }
          }
          if (lb.a((byte) 53, sp.field_g)) {
            var4_int = 0;
            if (sp.field_g == 8) {
              var4_int = -1;
            }
            if (null == gk.a(2, sp.field_g)) {
              bd.a("no target_menu ", (Throwable) null, false);
              return;
            }
            gk.a(2, sp.field_g).a(0, param0, var4_int);
            if (8 == sp.field_g) {
              fc.a((byte) 127, param0);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "bm.O(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final th a(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        th var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ek var9 = null;
        int var10 = 0;
        th stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var2_int = -86 / ((37 - param0) / 41);
          var3 = new th();
          var4 = 0;
          while (this.field_l.length > var4) {
            var5 = this.field_l[var4];
            var6 = this.field_l[1 + var4];
            var7 = this.field_l[2 + var4];
            var8 = this.field_l[3 + var4];
            var9 = this.a(var7, var8, -8944, var6, var5);
            if (var9 != null) {
              var3.a(var9, false);
            }
            var4 += 4;
            if (var10 == 0) {
              continue;
            }
            break;
          }
          stackIn_9_0 = var3;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "bm.J(" + param0 + ')');
        }
    }

    private final int b(int param0, byte param1, int param2) {
        int discarded$1 = 0;
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 < 0) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          if (param1 >= -59) {
            discarded$1 = this.a(-21, -32);
          }
          if (param0 < 0) {
            stackIn_8_0 = 0;
            return stackIn_8_0;
          }
          if (this.field_g.length <= param0) {
            stackIn_13_0 = 0;
            return stackIn_13_0;
          }
          if (param2 < this.field_g[0].length) {
            stackIn_18_0 = this.field_g[param0][param2];
            return stackIn_18_0;
          }
          stackIn_16_0 = 0;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "bm.R(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int a(int param0, int param1) {
        int discarded$1 = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            discarded$1 = this.b(-118, (byte) -56, 0);
          }
          stackIn_4_0 = param0 << 7;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "bm.T(" + param0 + ',' + param1 + ')');
        }
    }

    bm(int[][] param0, int[] param1, int param2, int param3, int param4, int[] param5, int[] param6, int param7, int param8) {
        super(param0, param1, param2, param3, param4, param5, param6, param7, param8);
    }

    static {
    }
}
