/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od {
    static wk[] field_a;
    static String field_h;
    static String field_e;
    static wk[] field_d;
    static String field_f;
    static int field_b;
    static String field_g;
    static boolean[] field_c;

    final synchronized static byte[] a(int param0, int param1) {
        int fieldTemp$0 = 0;
        byte[][] fieldTemp$1 = null;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int dupTemp$4 = 0;
        byte[][] arrayValue$5 = null;
        byte[] var2_ref_byte__;
        int var2;
        byte[] var3;
        L0: {
          if (-101 != (param0 ^ -1)) {
            break L0;
          } else {
            if ((af.field_b ^ -1) >= -1) {
              break L0;
            } else {
              fieldTemp$0 = af.field_b - 1;
              af.field_b = af.field_b - 1;
              var2_ref_byte__ = ut.field_W[fieldTemp$0];
              ut.field_W[af.field_b] = null;
              return var2_ref_byte__;
            }
          }
        }
        L1: {
          if (-5001 != (param0 ^ -1)) {
            break L1;
          } else {
            if (0 >= ul.field_d) {
              break L1;
            } else {
              fieldTemp$1 = oo.field_d;
              fieldTemp$2 = ul.field_d - 1;
              ul.field_d = ul.field_d - 1;
              var2_ref_byte__ = fieldTemp$1[fieldTemp$2];
              oo.field_d[ul.field_d] = null;
              return var2_ref_byte__;
            }
          }
        }
        L2: {
          if ((param0 ^ -1) != -30001) {
            break L2;
          } else {
            if ((oj.field_v ^ -1) < -1) {
              fieldTemp$3 = oj.field_v - 1;
              oj.field_v = oj.field_v - 1;
              var2_ref_byte__ = dh.field_j[fieldTemp$3];
              dh.field_j[oj.field_v] = null;
              return var2_ref_byte__;
            } else {
              break L2;
            }
          }
        }
        if (param1 == 50) {
          L3: {
            if (vh.field_k != null) {
              var2 = 0;
              L4: while (true) {
                if (var2 >= at.field_b.length) {
                  break L3;
                } else {
                  if (at.field_b[var2] == param0) {
                    if ((ca.field_a[var2] ^ -1) < -1) {
                      dupTemp$4 = ca.field_a[var2] - 1;
                      arrayValue$5 = vh.field_k[var2];
                      ca.field_a[var2] = dupTemp$4;
                      var3 = arrayValue$5[dupTemp$4];
                      vh.field_k[var2][ca.field_a[var2]] = null;
                      return var3;
                    } else {
                      var2++;
                      continue L4;
                    }
                  } else {
                    var2++;
                    continue L4;
                  }
                }
              }
            } else {
              break L3;
            }
          }
          return new byte[param0];
        } else {
          return (byte[]) null;
        }
    }

    final static String[] a(int param0, String param1) {
        Object var2 = null;
        String[] var2_array = null;
        RuntimeException var2_ref = null;
        String[] var3 = null;
        Object stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        String[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -16399) {
                break L1;
              } else {
                od.a(36);
                break L1;
              }
            }
            var2 = null;
            if (-2 != (param1.length() ^ -1)) {
              var3 = dj.a(77, ' ', param1);
              var2_array = var3;
              if (-2 != (var3.length ^ -1)) {
                stackIn_9_0 = (String[]) (var2_array);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_7_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var2_ref);

            stackIn_12_1 = new StringBuilder().append("od.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String[]) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (String[]) ((Object) stackIn_7_0);
          } else {
            return stackIn_9_0;
          }
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_e = null;
        field_f = null;
        field_h = null;
        field_g = null;
        field_c = null;
        field_a = null;
        if (param0 != -1) {
            field_e = (String) null;
        }
    }

    final synchronized static void a(int param0, byte[] param1) {
        int fieldTemp$6 = 0;
        byte[][] fieldTemp$7 = null;
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int dupTemp$10 = 0;
        byte[][] arrayValue$11 = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-101 != (param1.length ^ -1)) {
                break L1;
              } else {
                if ((af.field_b ^ -1) > -1001) {
                  fieldTemp$6 = af.field_b;
                  af.field_b = af.field_b + 1;
                  ut.field_W[fieldTemp$6] = param1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (-5001 != (param1.length ^ -1)) {
                break L2;
              } else {
                if ((ul.field_d ^ -1) <= -251) {
                  break L2;
                } else {
                  fieldTemp$7 = oo.field_d;
                  fieldTemp$8 = ul.field_d;
                  ul.field_d = ul.field_d + 1;
                  fieldTemp$7[fieldTemp$8] = param1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            L3: {
              if ((param1.length ^ -1) != param0) {
                break L3;
              } else {
                if (oj.field_v < 50) {
                  fieldTemp$9 = oj.field_v;
                  oj.field_v = oj.field_v + 1;
                  dh.field_j[fieldTemp$9] = param1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (vh.field_k == null) {
                break L4;
              } else {
                var2_int = 0;
                L5: while (true) {
                  if (at.field_b.length <= var2_int) {
                    break L4;
                  } else {
                    L6: {
                      if (at.field_b[var2_int] != param1.length) {
                        break L6;
                      } else {
                        if (vh.field_k[var2_int].length <= ca.field_a[var2_int]) {
                          break L6;
                        } else {
                          dupTemp$10 = ca.field_a[var2_int];
                          arrayValue$11 = vh.field_k[var2_int];
                          ca.field_a[var2_int] = dupTemp$10 + 1;
                          arrayValue$11[dupTemp$10] = param1;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    }
                    var2_int++;
                    continue L5;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 4;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var2);

            stackIn_26_1 = new StringBuilder().append("od.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L7;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L7;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    static {
        field_f = "Army Setup";
        field_h = "Names can only contain letters, numbers, spaces and underscores";
        field_c = new boolean[]{false, true, true, false, true, true};
        field_e = "to keep fullscreen or";
        field_g = "Training";
    }
}
