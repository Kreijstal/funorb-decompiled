/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj extends pe implements qd {
    static long field_E;
    private ha field_H;
    static String field_G;
    private pl[] field_I;
    private String[] field_F;

    public final void a(int param0, pl param1, int param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              var6_int = 0;
              if (param0 == -18905) {
                break L1;
              } else {
                field_G = (String) null;
                break L1;
              }
            }
            L2: while (true) {
              if (var6_int >= this.field_F.length) {
                L3: {
                  if (this.field_I[this.field_F.length] == param1) {
                    this.field_H.a(2147483647);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                break L0;
              } else {
                L4: {
                  if (param1 != this.field_I[var6_int]) {
                    break L4;
                  } else {
                    this.field_H.a(this.field_F[var6_int], (byte) 88);
                    break L4;
                  }
                }
                var6_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var6);

            stackIn_15_1 = new StringBuilder().append("wj.DA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static int a(CharSequence param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = wizardrun.field_H;
        try {
          L0: {
            var2_int = param0.length();
            var3 = 0;
            var4 = 0;
            L1: while (true) {
              if (var2_int <= var4) {
                L2: {
                  if (param1 == 2148) {
                    break L2;
                  } else {
                    wj.g(-126);
                    break L2;
                  }
                }
                stackIn_7_0 = var3;
                break L0;
              } else {
                var3 = nf.a(26614, param0.charAt(var4)) + (var3 << -1868718555) - var3;
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("wj.CA(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final boolean a(char param0, int param1, byte param2, ub param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, (byte) -97, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (98 == param1) {
                stackIn_7_0 = this.a((byte) -117, param3);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param1 != 99) {
                  if (param2 < -96) {
                    stackIn_14_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    wj.b(35, 113, -120, 21);
                    return false;
                  }
                } else {
                  stackIn_10_0 = this.b(param3, 1);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var5);

            stackIn_17_1 = new StringBuilder().append("wj.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L1;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L1;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_14_0 != 0;
            }
          }
        }
    }

    final static String g(int param0) {
        if (!(-3 >= (ri.field_a ^ -1))) {
            return jf.field_f;
        }
        if (!(qh.field_c == null)) {
            if (!qh.field_c.b(param0 + 495)) {
                return bl.field_c;
            }
            return td.field_e;
        }
        if (!ub.field_x.b(17820)) {
            return qb.field_q;
        }
        if (!(ub.field_x.a((byte) 29, "commonui"))) {
            return tk.field_e + " - " + ub.field_x.a(0, "commonui") + "%";
        }
        if (!vj.field_b.b(param0 ^ 1585)) {
            return hj.field_d;
        }
        if (!vj.field_b.a((byte) 29, "commonui")) {
            return mj.field_d + " - " + vj.field_b.a(0, "commonui") + "%";
        }
        if (!(cc.field_a.b(17820))) {
            return nh.field_o;
        }
        if (param0 != 17325) {
            wj.a(113);
        }
        if (!(cc.field_a.d(-97))) {
            return od.field_s + " - " + cc.field_a.a((byte) 75) + "%";
        }
        return u.field_u;
    }

    final static boolean a(int param0) {
        CharSequence var2;
        int stackIn_6_0 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            var2 = (CharSequence) null;
            wj.a((CharSequence) null, -18);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == jc.field_H) {
              break L2;
            } else {
              if (wh.field_j != hi.field_l) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static o[] b(int param0, int param1, int param2, int param3) {
        if (param3 != 1) {
            return (o[]) null;
        }
        return ei.a(param2, param0, param1, 1, 20230);
    }

    public static void d(boolean param0) {
        if (param0) {
            field_G = (String) null;
        }
        field_G = null;
    }

    final static boolean g(byte param0) {
        if (param0 >= -77) {
            wj.g(-18);
        }
        return !we.field_c.a(true) ? true : false;
    }

    wj(ha param0) {
        super(0, 0, 0, 0, (bf) null);
        try {
            this.field_H = param0;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "wj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (-1 != (param2 ^ -1)) {
            return;
        }
        vd var5 = gh.field_b;
        if (null != this.field_F) {
            var5.a(ml.field_p, param0 - -this.field_o, param3 - -this.field_l, this.field_r, 20, 16777215, -1, 0, 0, var5.field_B + var5.field_M);
        }
    }

    final void a(byte param0, String[] param1) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        tk var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              this.field_A.a(false);
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length == 0) {
                  break L1;
                } else {
                  L2: {
                    var3_int = param1.length;
                    this.field_F = new String[var3_int];
                    if (param0 == 87) {
                      break L2;
                    } else {
                      this.a(-86, 120, 101, 56);
                      break L2;
                    }
                  }
                  var4_int = 0;
                  L3: while (true) {
                    if (var4_int >= var3_int) {
                      var4 = new tk(gh.field_b, 0, 1);
                      this.field_I = new pl[var3_int - -1];
                      var5 = 0;
                      L4: while (true) {
                        if (var5 >= var3_int) {
                          this.field_I[var3_int] = new pl(eg.field_t, (ce) (this));
                          this.field_I[var3_int].field_w = (bf) ((Object) var4);
                          this.field_I[var3_int].a(param0 ^ 44, 16 * var3_int - -36, 15, 100, 0);
                          this.a((ub) (this.field_I[var3_int]), (byte) 71);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          this.field_I[var5] = new pl(this.field_F[var5], (ce) (this));
                          this.field_I[var5].field_w = (bf) ((Object) var4);
                          this.field_I[var5].field_p = ni.field_a;
                          this.field_I[var5].a(109, 20 - -(var5 * 16), 15, 80, 0);
                          this.a((ub) (this.field_I[var5]), (byte) 64);
                          var5++;
                          continue L4;
                        }
                      }
                    } else {
                      this.field_F[var4_int] = oe.a((byte) 27, (CharSequence) ((Object) param1[var4_int])).replace(' ', ' ');
                      var4_int++;
                      continue L3;
                    }
                  }
                }
              }
            }
            this.field_F = null;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("wj.EA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_G = "Loading...";
        field_E = 20000000L;
    }
}
