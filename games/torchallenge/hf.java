/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf implements j {
    static ka field_a;
    static int field_c;
    static byte[] field_d;
    static int[][] field_f;
    static int field_e;
    static ne field_b;

    final static boolean a(int param0) {
        int stackIn_6_0 = 0;
        if (param0 == 4) {
          L0: {
            L1: {
              if (qf.field_a == null) {
                break L1;
              } else {
                if (qc.field_d != aj.field_c) {
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    final static void a(byte param0, boolean param1, int param2, String param3, String param4, boolean param5) {
        int var7 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -73) {
                break L1;
              } else {
                field_c = -14;
                break L1;
              }
            }
            L2: {
              if (!param1) {
                break L2;
              } else {
                L3: {
                  if (param4 != null) {
                    break L3;
                  } else {
                    if (param3 == null) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (param4 == param3) {
                    break L4;
                  } else {
                    if (param3 == null) {
                      break L4;
                    } else {
                      param2--;
                      if ((param2 ^ -1) >= -1) {
                        param3 = param4;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                L5: {
                  if (30 <= param2) {
                    break L5;
                  } else {
                    param2++;
                    break L5;
                  }
                }
                param3 = param4;
                break L2;
              }
            }
            L6: {
              if (!param5) {
                cd.field_c = param2;
                ci.field_q = param3;
                gf.field_v = param4;
                break L6;
              } else {
                pi.field_c = param3;
                ng.field_I = param2;
                rj.field_d = param4;
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var6);

            stackIn_21_1 = new StringBuilder().append("hf.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param4 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ',' + param5 + ')');
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param1 < 11) {
            return;
        }
        int var3 = 1 << param2;
        if (!(0 == (var3 & jj.field_c))) {
            return;
        }
        ac.field_d = ac.field_d ^ 4;
        ae.field_z = ae.field_z ^ 4;
        jj.field_c = jj.field_c | var3;
        eh.field_l = eh.field_l | var3;
        db.field_D.a(new ul(param2), -83);
        if (!(bh.field_p)) {
            wc.field_g.a(new rd(param2, param0, al.field_z, pi.field_a, pi.field_f, ub.field_j), -53);
        }
    }

    final static byte[] a(int param0, byte[] param1, int param2, pa param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        byte[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var4_int = param3.e(param2, 119);
            if ((var4_int ^ -1) != param0) {
              L1: {
                L2: {
                  if (param1 == null) {
                    break L2;
                  } else {
                    if (param1.length == var4_int) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                param1 = new byte[var4_int];
                break L1;
              }
              L3: {
                var5 = param3.e(3, param0 + 5);
                var6 = (byte)param3.e(8, 100);
                if (0 < var5) {
                  var7 = 0;
                  L4: while (true) {
                    if (var7 >= var4_int) {
                      break L3;
                    } else {
                      param1[var7] = (byte)(param3.e(var5, 119) + var6);
                      var7++;
                      continue L4;
                    }
                  }
                } else {
                  var7 = 0;
                  L5: while (true) {
                    if (var7 >= var4_int) {
                      break L3;
                    } else {
                      param1[var7] = (byte)var6;
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
              stackIn_16_0 = (byte[]) (param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4);

            stackIn_19_1 = new StringBuilder().append("hf.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_3_0);
        } else {
          return stackIn_16_0;
        }
    }

    public static void b(int param0) {
        field_d = null;
        field_a = null;
        field_b = null;
        if (param0 != 19199) {
            return;
        }
        field_f = (int[][]) null;
    }

    final static void a(byte param0) {
        ba.c((byte) 15);
        if (param0 >= -105) {
            return;
        }
        fk.a(true, 4);
    }

    public final void a(ee param0, int param1, int param2, byte param3, boolean param4) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        ka var8 = null;
        try {
          L0: {
            L1: {
              var6_int = param0.field_m + param2;
              if (param3 == 97) {
                break L1;
              } else {
                field_c = -88;
                break L1;
              }
            }
            L2: {
              var7 = param1 - -param0.field_i;
              v.b(var6_int, 12105912, param0.field_p, var7, param0.field_l);
              var8 = ub.field_f[1];
              if (!(param0 instanceof ng)) {
                break L2;
              } else {
                if (!((ng) ((Object) param0)).field_D) {
                  break L2;
                } else {
                  var8.b(var6_int - -1 - -(param0.field_p - var8.field_q >> -180256799), (-var8.field_v + param0.field_l >> 1420933345) + (var7 - -1), 256);
                  break L2;
                }
              }
            }
            L3: {
              if (param0.c(param3 + -11)) {
                jc.a((byte) -115, var6_int + 2, param0.field_l - 4, param0.field_p - 4, 2 + var7);
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var6);

            stackIn_11_1 = new StringBuilder().append("hf.A(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_c = 0;
        field_f = new int[][]{new int[]{222, 147}, new int[]{198, 144}, new int[]{235, 151}};
        field_b = new ne();
    }
}
