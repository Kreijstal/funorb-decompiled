/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh extends og implements vd {
    private String[] field_B;
    private pc[] field_D;
    private fd field_E;
    static wb field_A;
    static String field_z;
    static int[] field_H;
    static int field_F;
    static String field_C;

    public final void a(byte param0, int param1, int param2, int param3, pc param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var8 = CrazyCrystals.field_B;
        try {
          L0: {
            var6_int = 26 / ((83 - param0) / 36);
            var7 = 0;
            L1: while (true) {
              if (var7 >= this.field_B.length) {
                L2: {
                  if (param4 != this.field_D[this.field_B.length]) {
                    break L2;
                  } else {
                    this.field_E.a(20);
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  if (this.field_D[var7] != param4) {
                    break L3;
                  } else {
                    this.field_E.a(this.field_B[var7], -23752);
                    break L3;
                  }
                }
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var6);

            stackIn_13_1 = new StringBuilder().append("nh.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    final boolean a(int param0, int param1, qm param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              if (-99 != (param0 ^ -1)) {
                if (param0 == 99) {
                  stackIn_9_0 = this.a(param2, -25911);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackIn_5_0 = this.a((byte) -73, param2);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("nh.AA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L1;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L1;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_9_0;
          }
        }
    }

    final static jg a(int param0, md param1) {
        jg stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        jg var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = CrazyCrystals.field_B;
        try {
          L0: {
            var2_int = param1.d((byte) -79, 8);
            if (-1 > (var2_int ^ -1)) {
              throw new IllegalStateException("" + var2_int);
            } else {
              L1: {
                var3 = fn.a(1, param1) ? 1 : 0;
                var4 = fn.a(param0 ^ -31742, param1) ? 1 : 0;
                var5 = new jg();
                var5.field_n = (short)param1.d((byte) -87, 16);
                var5.field_L = mh.a((byte) -2, param1, 16, var5.field_L);
                if (param0 == -31741) {
                  break L1;
                } else {
                  field_z = (String) null;
                  break L1;
                }
              }
              L2: {
                var5.field_G = mh.a((byte) -2, param1, 16, var5.field_G);
                var5.field_b = mh.a((byte) -2, param1, 16, var5.field_b);
                var5.field_I = (short)param1.d((byte) -56, 16);
                var5.field_K = mh.a((byte) -2, param1, 16, var5.field_K);
                var5.field_g = mh.a((byte) -2, param1, 16, var5.field_g);
                var5.field_c = mh.a((byte) -2, param1, 16, var5.field_c);
                if (var3 == 0) {
                  break L2;
                } else {
                  var5.field_D = (short)param1.d((byte) -73, 16);
                  var5.field_a = mh.a((byte) -2, param1, 16, var5.field_a);
                  var5.field_N = mh.a((byte) -2, param1, 16, var5.field_N);
                  var5.field_u = mh.a((byte) -2, param1, 16, var5.field_u);
                  var5.field_A = mh.a((byte) -2, param1, 16, var5.field_A);
                  var5.field_v = mh.a((byte) -2, param1, 16, var5.field_v);
                  var5.field_R = mh.a((byte) -2, param1, 16, var5.field_R);
                  break L2;
                }
              }
              L3: {
                if (var4 == 0) {
                  break L3;
                } else {
                  param1.d((byte) -94, 16);
                  var5.field_l = mh.a((byte) -2, param1, 16, var5.field_l);
                  var5.field_r = mh.a((byte) -2, param1, 16, var5.field_r);
                  var5.field_J = mh.a((byte) -2, param1, 16, var5.field_J);
                  var5.field_k = mh.a((byte) -2, param1, 16, var5.field_k);
                  var5.field_w = mh.a((byte) -2, param1, 16, var5.field_w);
                  break L3;
                }
              }
              L4: {
                if (!fn.a(1, param1)) {
                  break L4;
                } else {
                  var5.field_B = mh.a((byte) -2, param1, 16, var5.field_B);
                  break L4;
                }
              }
              L5: {
                if (fn.a(param0 ^ -31742, param1)) {
                  var5.field_o = cj.a(16, 2048, param1, var5.field_o);
                  var6 = 0;
                  var7 = 0;
                  L6: while (true) {
                    if (var5.field_o.length <= var7) {
                      if (0 != var6) {
                        var5.field_s = (byte)(var6 + 1);
                        break L5;
                      } else {
                        var5.field_o = null;
                        break L5;
                      }
                    } else {
                      if (var6 < (255 & var5.field_o[var7])) {
                        var6 = var5.field_o[var7] & 255;
                        var7++;
                        continue L6;
                      } else {
                        var7++;
                        continue L6;
                      }
                    }
                  }
                } else {
                  break L5;
                }
              }
              stackIn_24_0 = (jg) (var5);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var2);

            stackIn_27_1 = new StringBuilder().append("nh.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L7;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L7;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
        return stackIn_24_0;
    }

    final static Class a(byte param0, String param1) throws ClassNotFoundException {
        int var2_int = 0;
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_7_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_13_0 = null;
        Class stackIn_17_0 = null;
        Class stackIn_20_0 = null;
        Class stackIn_24_0 = null;
        Class stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1.equals("B")) {
              stackIn_3_0 = Byte.TYPE;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var2_int = 59 % ((36 - param0) / 42);
              if (param1.equals("I")) {
                stackIn_7_0 = Integer.TYPE;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!param1.equals("S")) {
                  if (!param1.equals("J")) {
                    if (param1.equals("Z")) {
                      stackIn_17_0 = Boolean.TYPE;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (!param1.equals("F")) {
                        if (param1.equals("D")) {
                          stackIn_24_0 = Double.TYPE;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if (param1.equals("C")) {
                            stackIn_28_0 = Character.TYPE;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            return Class.forName(param1);
                          }
                        }
                      } else {
                        stackIn_20_0 = Float.TYPE;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  } else {
                    stackIn_13_0 = Long.TYPE;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_10_0 = Short.TYPE;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var2);

            stackIn_31_1 = new StringBuilder().append("nh.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L1;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L1;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_17_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_20_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_24_0;
                    } else {
                      return stackIn_28_0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static void a(int param0, byte param1, ca param2) {
        md var5 = null;
        int var4 = 0;
        if (param1 > -13) {
            return;
        }
        try {
            var5 = tp.field_f;
            var5.d(8, param0);
            var5.field_f = var5.field_f + 1;
            var4 = var5.field_f;
            var5.a(true, 1);
            var5.a(true, param2.field_i);
            var5.a(true, param2.field_k);
            var5.a(param2.field_n, -16384);
            var5.a(param2.field_h, -16384);
            var5.a(param2.field_f, -16384);
            var5.a(param2.field_l, -16384);
            var5.b(var4, (byte) -79);
            var5.c((byte) 61, -var4 + var5.field_f);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "nh.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        super.a(param0, (byte) -30, param2, param3);
        if (param1 > -12) {
            this.field_E = (fd) null;
        }
        if (!(param3 == 0)) {
            return;
        }
        vc var5 = ai.field_h;
        if (null != this.field_B) {
            var5.a(wb.field_b, this.field_r + param2, this.field_j + param0, this.field_g, 20, 16777215, -1, 0, 0, var5.field_u + var5.field_o);
        }
    }

    public static void a(int param0) {
        if (param0 != -7397) {
            return;
        }
        field_H = null;
        field_A = null;
        field_z = null;
        field_C = null;
    }

    nh(fd param0) {
        super(0, 0, 0, 0, (wo) null);
        try {
            this.field_E = param0;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "nh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(String[] param0, int param1) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        ok var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              this.field_v.a(param1 ^ 22800);
              if (param0 == null) {
                break L1;
              } else {
                if (param0.length == 0) {
                  break L1;
                } else {
                  var3_int = param0.length;
                  this.field_B = new String[var3_int];
                  var4_int = 0;
                  L2: while (true) {
                    if (var4_int >= var3_int) {
                      var4 = new ok(ai.field_h, 0, 1);
                      this.field_D = new pc[var3_int - -1];
                      var5 = param1;
                      L3: while (true) {
                        if (var3_int <= var5) {
                          this.field_D[var3_int] = new pc(qo.field_p, (bi) (this));
                          this.field_D[var3_int].field_i = (wo) ((Object) var4);
                          this.field_D[var3_int].a(15, 0, 20 - -((1 + var3_int) * 16), 100, (byte) -52);
                          this.b(this.field_D[var3_int], param1 + -118);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          this.field_D[var5] = new pc(this.field_B[var5], (bi) (this));
                          this.field_D[var5].field_i = (wo) ((Object) var4);
                          this.field_D[var5].field_t = fg.field_l;
                          this.field_D[var5].a(15, 0, 16 * var5 + 20, 80, (byte) -52);
                          this.b(this.field_D[var5], param1 + 60);
                          var5++;
                          continue L3;
                        }
                      }
                    } else {
                      this.field_B[var4_int] = gd.a((byte) 127, (CharSequence) ((Object) param0[var4_int])).replace(' ', ' ');
                      var4_int++;
                      continue L2;
                    }
                  }
                }
              }
            }
            this.field_B = null;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("nh.B(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_A = new wb();
        field_C = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}
