/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lm extends ae {
    static java.math.BigInteger field_z;
    byte field_B;
    vi field_C;
    static jb[] field_A;
    int field_x;
    static bd field_y;

    final byte[] c(byte param0) {
        if (this.field_v || this.field_C.field_i < -this.field_B + this.field_C.field_n.length) {
            throw new RuntimeException();
        }
        if (param0 != 127) {
            lm.e(46);
        }
        return this.field_C.field_n;
    }

    final static boolean a(int param0, String param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  if (param0 == 26) {
                    break L2;
                  } else {
                    lm.e(77);
                    break L2;
                  }
                }
                if (!fd.field_c.startsWith("win")) {
                  stackIn_6_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L1;
                } else {
                  L3: {
                    if (param1.startsWith("http://")) {
                      break L3;
                    } else {
                      if (!param1.startsWith("https://")) {
                        stackIn_11_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                  var3 = 0;
                  L4: while (true) {
                    if (param1.length() <= var3) {
                      Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                      stackIn_20_0 = 1;
                      decompiledRegionSelector0 = 3;
                      break L1;
                    } else {
                      if (-1 == var2.indexOf((int) param1.charAt(var3))) {
                        stackIn_17_0 = 0;
                        decompiledRegionSelector0 = 2;
                        break L1;
                      } else {
                        var3++;
                        continue L4;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              stackIn_22_0 = 0;
              return stackIn_22_0 != 0;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                decompiledRegionSelector1 = 1;
                break L0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  decompiledRegionSelector1 = 2;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var2_ref2);

            stackIn_25_1 = new StringBuilder().append("lm.O(").append(param0).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L5;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L5;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return stackIn_17_0 != 0;
            } else {
              return stackIn_20_0 != 0;
            }
          }
        }
    }

    public static void b(boolean param0) {
        if (!param0) {
            p var2 = (p) null;
            lm.a((p) null, (p) null, 66);
        }
        field_y = null;
        field_z = null;
        field_A = null;
    }

    final static int e(int param0) {
        if (param0 != 0) {
            String var2 = (String) null;
            lm.a(-49, (String) null);
        }
        return -hg.field_f + pc.field_d;
    }

    final int d(int param0) {
        if (null == this.field_C) {
            return 0;
        }
        if (param0 > -72) {
            this.field_x = -24;
        }
        return 100 * this.field_C.field_i / (-this.field_B + this.field_C.field_n.length);
    }

    lm() {
    }

    final static boolean a(p param0, p param1, int param2) {
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var3_double = 0.0;
        RuntimeException var3 = null;
        double var5 = 0.0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              oa.field_d.field_i = 13;
              oa.field_d.field_j.a((byte) 46, param1.field_j);
              oa.field_d.field_l.a(param1.field_l.field_a - 0.5, param1.field_l.field_f - 0.5, 1);
              if (0.0 > oa.field_d.field_l.field_a) {
                oa.field_d.field_l.field_a = oa.field_d.field_l.field_a + 1.0;
                oa.field_d.field_j.field_g = oa.field_d.field_j.field_g - 1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (0.0 <= oa.field_d.field_l.field_f) {
                break L2;
              } else {
                oa.field_d.field_l.field_f = oa.field_d.field_l.field_f + 1.0;
                oa.field_d.field_j.field_e = oa.field_d.field_j.field_e - 1;
                break L2;
              }
            }
            L3: {
              oa.field_d.field_c = nh.a(-12149, param1, param0);
              var3_double = param0.field_l.field_f + (double)param0.field_j.field_e;
              var5 = param0.field_l.field_a + (double)param0.field_j.field_g;
              oa.field_d.field_l.a(20, (byte) 94, oa.field_d.field_c);
              var7 = 0;
              var8 = param0.field_j.b(-4);
              var9 = ln.field_a.field_c[var8];
              ln.field_a.field_c[var8] = 0;
              if (param2 <= -40) {
                break L3;
              } else {
                field_z = (java.math.BigInteger) null;
                break L3;
              }
            }
            var10 = 0;
            L4: while (true) {
              L5: {
                if ((var10 ^ -1) <= -101) {
                  break L5;
                } else {
                  oa.field_d.a(8573);
                  var7 = ln.field_a.field_c[oa.field_d.field_j.b(-4)];
                  if (-3 == (var7 ^ -1)) {
                    break L5;
                  } else {
                    if (!oa.field_d.a(var3_double, var5, 29821)) {
                      oa.field_d.field_l.a(2, (byte) 94, oa.field_d.field_c);
                      var10++;
                      continue L4;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              L6: {
                ln.field_a.field_c[var8] = var9;
                if ((var7 ^ -1) == -3) {
                  stackIn_19_0 = 0;
                  break L6;
                } else {
                  stackIn_19_0 = 1;
                  break L6;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var3);

            stackIn_22_1 = new StringBuilder().append("lm.F(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_23_0), stackIn_26_2 + ',' + param2 + ')');
        }
        return stackIn_19_0 != 0;
    }

    static {
        field_z = new java.math.BigInteger("65537");
        field_A = new jb[26];
    }
}
