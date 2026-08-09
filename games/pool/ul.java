/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul extends tm {
    static cg field_m;
    static String field_l;

    public static void a(byte param0) {
        field_m = null;
        if (param0 >= -5) {
            return;
        }
        field_l = null;
    }

    final static void i(int param0) {
        if (param0 != 3) {
            return;
        }
        ea.field_z = false;
        hr.field_y = 0 == kn.field_e.g(-83) ? true : false;
    }

    final int a(int param0, boolean param1) {
        if (0 == param0) {
            return 16777215;
        }
        if ((param0 ^ -1) == -9) {
            return 3355443;
        }
        if (!param1) {
            this.a((byte) -72, -37);
        }
        return 7824981;
    }

    final static boolean a(char param0, byte param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        char[] var5 = null;
        char[] var6 = null;
        int var7 = 0;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!Character.isISOControl(param0)) {
              if (td.a(param0, (byte) 123)) {
                stackIn_6_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var5 = pd.field_d;
                var2 = var5;
                var3 = 0;
                L1: while (true) {
                  if (var3 >= var5.length) {
                    var6 = g.field_o;
                    var2 = var6;
                    var7 = 0;
                    var3 = var7;
                    L2: while (true) {
                      if (var7 >= var6.length) {
                        if (param1 > 123) {
                          stackIn_23_0 = 0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          ul.a('￉', (byte) 82);
                          return false;
                        }
                      } else {
                        var4 = var6[var7];
                        if (param0 == var4) {
                          stackIn_18_0 = 1;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          var7++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    var4 = var5[var3];
                    if (param0 != var4) {
                      var3++;
                      continue L1;
                    } else {
                      stackIn_11_0 = 1;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2_ref), "ul.F(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0 != 0;
              } else {
                return stackIn_23_0 != 0;
              }
            }
          }
        }
    }

    final String a(byte param0, int param1) {
        if (param0 < 9) {
            return (String) null;
        }
        return ae.field_b;
    }

    final void a(int param0, byte param1, pq[] param2) {
        int var4_int = 0;
        int var5 = 0;
        eg var6 = null;
        eg stackIn_7_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (param1 == -37) {
                break L1;
              } else {
                ul.a((byte) 26);
                break L1;
              }
            }
            var4_int = 0;
            L2: while (true) {
              if (-15 >= (var4_int ^ -1)) {
                break L0;
              } else {
                L3: {
                  var5 = 1 - (-var4_int - var4_int / 7);
                  if (param0 == var5) {
                    stackIn_7_0 = sf.field_E;
                    break L3;
                  } else {
                    stackIn_7_0 = jp.field_P;
                    break L3;
                  }
                }
                L4: {
                  var6 = stackIn_7_0;
                  if (this.field_a[var5] != var6) {
                    this.field_a[var5] = var6;
                    this.a(false, param2[var5].field_G, var5);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var4_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("ul.H(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    final static String a(byte param0, String param1, int param2) {
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        Object stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        eo var7 = null;
        eo var8 = null;
        oq var9 = null;
        CharSequence var10 = null;
        try {
          L0: {
            var10 = (CharSequence) ((Object) param1);
            if (!gj.a(-25908, var10)) {
              stackIn_3_0 = p.field_g;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (2 == th.field_a) {
                var8 = gf.a(-83, param1);
                if (var8 == null) {
                  stackIn_10_0 = nr.a(new String[]{param1}, -1, aa.field_f);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  cf.field_k.a(var8, 0);
                  L1: while (true) {
                    var7 = (eo) ((Object) cf.field_k.f((byte) -5));
                    if (var7 == null) {
                      var8.a((byte) -117);
                      var8.a(false);
                      nr.field_S = nr.field_S - 1;
                      var9 = ej.field_j;
                      var9.b(false, param2);
                      var9.field_v = var9.field_v + 1;
                      var6 = -10 % ((param0 - 20) / 53);
                      var5 = var9.field_v;
                      var9.a(1, false);
                      var9.a(-9946, param1);
                      var9.b(var9.field_v + -var5, true);
                      stackIn_15_0 = null;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      var7.field_Mb = var7.field_Mb - 1;
                      continue L1;
                    }
                  }
                }
              } else {
                stackIn_6_0 = qe.field_K;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("ul.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L2;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return (String) ((Object) stackIn_15_0);
            }
          }
        }
    }

    final boolean c(int param0) {
        if (param0 != 2) {
            return true;
        }
        return false;
    }

    final void a(int param0, di param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 198123656) {
                break L1;
              } else {
                field_l = (String) null;
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

            stackIn_5_1 = new StringBuilder().append("ul.D(").append(param0).append(',');

            if (param1 == null) {
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
          throw wm.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final void a(di param0, byte param1) {
        if (param1 != 117) {
            pq[] var4 = (pq[]) null;
            this.a(-110, (byte) 38, (pq[]) null);
        }
        if (this.field_a != null) {
            return;
        }
        try {
            jp.field_P = eg.a(param0, "", "balls/TIKI/tiki_ball_halloween");
            sf.field_E = eg.a(param0, "", "balls/TIKI/tiki_ball_halloween_lit");
            jp.field_P.a(8, 8, 8, 8);
            sf.field_E.a(8, 8, 8, 8);
            this.field_a = new eg[16];
            this.field_a[0] = al.field_B[2].field_a[0];
            this.field_a[15] = jp.field_P;
            this.field_a[14] = jp.field_P;
            this.field_a[13] = jp.field_P;
            this.field_a[12] = jp.field_P;
            this.field_a[11] = jp.field_P;
            this.field_a[10] = jp.field_P;
            this.field_a[9] = jp.field_P;
            this.field_a[7] = jp.field_P;
            this.field_a[6] = jp.field_P;
            this.field_a[5] = jp.field_P;
            this.field_a[4] = jp.field_P;
            this.field_a[3] = jp.field_P;
            this.field_a[2] = jp.field_P;
            this.field_a[1] = jp.field_P;
            this.field_a[8] = al.field_B[2].field_a[8];
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "ul.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ul() {
        this.field_g = false;
    }

    static {
        field_l = "FULL ACCESS";
    }
}
