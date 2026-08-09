/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kga extends dg {
    private bua field_s;
    private int field_p;
    private int field_r;
    private int field_t;
    private int field_m;
    static String field_q;
    static dn field_o;
    static eua field_n;

    final void a(gr param0, gma param1, byte param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2);
              if (this.a(127).field_E >= 20) {
                break L1;
              } else {
                this.a(param1, -2159, param0);
                break L1;
              }
            }
            if (0 != this.field_t) {
              break L0;
            } else {
              this.field_s = new bua(3, 0);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("kga.E(");

            if (param0 == null) {
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
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param2 + ')');
        }
    }

    final void a(gma param0, int param1, gr param2) {
        int var5 = 0;
        int var6 = 0;
        ue var7 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            super.a(param0, param1, param2);
            if (!(param2 instanceof ue)) {
              if (!(param2 instanceof rl)) {
                if (!(param2 instanceof ok)) {
                  if (param2 instanceof ef) {
                    this.field_t = 4;
                    break L0;
                  } else {
                    return;
                  }
                } else {
                  this.field_t = 5;
                  return;
                }
              } else {
                this.field_t = 5;
                return;
              }
            } else {
              var7 = (ue) ((Object) param2);
              var5 = var7.j((byte) -77);
              if (var5 != 0) {
                if (var5 == 3) {
                  this.field_t = 2;
                  return;
                } else {
                  if (var5 != 1) {
                    if (-3 == (var5 ^ -1)) {
                      this.field_t = 1;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    this.field_t = 0;
                    return;
                  }
                }
              } else {
                this.field_t = 3;
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var4);

            stackIn_23_1 = new StringBuilder().append("kga.C(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L1;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L2;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_24_0), stackIn_27_2 + ')');
        }
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        int stackIn_9_0 = 0;
        ka stackIn_21_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (null != this.field_h) {
              L1: {
                if (this.field_k instanceof pd) {
                  if (((pd) ((Object) this.field_k)).c(-72)) {
                    stackIn_9_0 = 1;
                    break L1;
                  } else {
                    stackIn_9_0 = 0;
                    break L1;
                  }
                } else {
                  stackIn_9_0 = 0;
                  break L1;
                }
              }
              L2: {
                var6_int = stackIn_9_0;
                var7 = null;
                var8 = this.field_t;
                if (var8 == 0) {
                  L3: {
                    if (var6_int == 0) {
                      stackIn_21_0 = rl.field_t[0];
                      break L3;
                    } else {
                      stackIn_21_0 = this.field_s.b((byte) 74);
                      break L3;
                    }
                  }
                  var7 = stackIn_21_0;
                  if (var6_int != 0) {
                    this.field_s.a(3, false, (byte) -84, 9);
                    var7 = this.field_s.b((byte) 74);
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  if (-2 != (var8 ^ -1)) {
                    if (var8 != 2) {
                      if (3 == var8) {
                        var7 = rl.field_t[4];
                        break L2;
                      } else {
                        if ((var8 ^ -1) == -5) {
                          var7 = rl.field_t[5];
                          break L2;
                        } else {
                          if ((var8 ^ -1) != -6) {
                            break L2;
                          } else {
                            var7 = rl.field_t[7];
                            break L2;
                          }
                        }
                      }
                    } else {
                      var7 = rl.field_t[2];
                      break L2;
                    }
                  } else {
                    var7 = rl.field_t[1];
                    break L2;
                  }
                }
              }
              L4: {
                var8 = 73 / ((-38 - param4) / 47);
                if (var6_int == 0) {
                  param3 = param3 + this.field_r;
                  break L4;
                } else {
                  if (this.field_t != 0) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (var7 == null) {
                  break L5;
                } else {
                  var9 = dfa.a(-this.field_h.g(-25787) + 4096 - -this.field_m >> 414378818, 2048, -117);
                  gqa.a(var9, -83584144, param1, param2, (ka) (var7), param3);
                  break L5;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackIn_39_0 = (RuntimeException) (var6);

            stackIn_39_1 = new StringBuilder().append("kga.D(");

            if (param0 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L6;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public static void n(byte param0) {
        field_n = null;
        field_o = null;
        if (param0 != 9) {
            return;
        }
        field_q = null;
    }

    final void a(int param0, la param1, kh param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a(124, param1, param2);
              if (param0 > 119) {
                break L1;
              } else {
                this.f(88);
                break L1;
              }
            }
            if (-21 >= (param1.field_E ^ -1)) {
              this.field_t = param2.b((byte) 44, 4);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("kga.G(").append(param0).append(',');

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
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
        }
    }

    final static void i(int param0) {
        qpa.a(275, ht.field_Pb, 3, 40, 440, 126, 200);
        qpa.a(275, cla.field_n, 5, 40, 440, 126, 200);
        qpa.a(275, se.field_s, 6, 40, 440, 124, 200);
        qpa.a(335, jta.field_z, 9, 40, 440, 125, 200);
        if (param0 < 97) {
            cka var2 = (cka) null;
            kga.a((cka) null, -2);
        }
    }

    kga(int param0, la param1, kh param2) {
        super(param0, param1, param2);
        this.field_m = 0;
        this.field_p = 0;
    }

    public final void f(int param0) {
        super.f(param0 ^ 0);
        if (param0 == -4366) {
          L0: {
            if (null != this.field_s) {
              this.field_s.a(0);
              break L0;
            } else {
              break L0;
            }
          }
          if ((this.field_t ^ -1) != -2) {
            if ((this.field_t ^ -1) == -3) {
              return;
            } else {
              this.field_p = this.field_p + 32;
              this.field_m = this.field_m + 96;
              this.field_r = 524288 + hua.a((byte) 119, dfa.a(this.field_p, 2048, -122)) * 8;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void a(byte param0, kh param1) {
        try {
            super.a((byte) -58, param1);
            param1.a((byte) 61, this.field_t, 4);
            int var3_int = 15 % ((-8 - param0) / 40);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "kga.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(cka param0, int param1) {
        ama var7 = null;
        byte[] var19 = null;
        dca var9 = null;
        byte[] var20 = null;
        mq var11 = null;
        byte[] var21 = null;
        try {
            if (hna.field_e == null) {
                var7 = new ama();
                var19 = var7.a(16, 128, 0, 128);
                hna.field_e = bw.a(270, var19, false);
            }
            if (null == gu.field_l) {
                var9 = new dca();
                var20 = var9.a(128, 16, 123, 128);
                gu.field_l = bw.a(270, var20, false);
            }
            var11 = param0.field_zc;
            if (param1 < 116) {
                kga.n((byte) 16);
            }
            if (var11.a((byte) 89)) {
                if (uga.field_m != null) {
                    return;
                }
                var21 = gaa.a(4.0f, 16.0f, 128, new tda(419684), 8, 128, 0.5f, 16, 4, 4.0f, 0.6000000238418579f);
                uga.field_m = bw.a(270, var21, false);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "kga.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void b(byte param0, int param1) {
        this.field_t = param1;
        if (param0 <= 73) {
            cka var4 = (cka) null;
            kga.a((cka) null, 79);
        }
    }

    kga(int param0) {
        super(param0);
        this.field_m = 0;
        this.field_p = 0;
    }

    static {
        field_q = "Bouncy Fireballs";
        field_o = new dn();
    }
}
