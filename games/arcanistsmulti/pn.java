/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pn {
    static qb[][] field_b;
    static int field_d;
    static int[] field_a;
    static qb field_c;
    static qb field_e;

    public static void b(byte param0) {
        field_c = null;
        field_e = null;
        int var1 = -20 / ((34 - param0) / 57);
        field_a = null;
        field_b = (qb[][]) null;
    }

    final static void a(int param0) {
        if (param0 > -21) {
            field_d = -35;
        }
        io.field_n = oo.d(-9685);
        pm.field_e = new h();
        ke.g((byte) 94);
    }

    final static String a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            var3 = new char[var2_int];
            var4 = 0;
            if (param0 == 8671) {
              L1: while (true) {
                if (var4 >= var2_int) {
                  stackIn_7_0 = new String(var3);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var3[var2_int - 1 - var4] = param1.charAt(var4);
                  var4++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("pn.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_7_0;
        }
    }

    final static void c(int param0) {
        if (param0 != -11090) {
            return;
        }
        String var2 = (String) null;
        bb.a(on.field_d, -3, (String) null);
    }

    final static boolean a(byte param0) {
        int var1;
        int stackIn_7_0 = 0;
        L0: {
          L1: {
            var1 = 75 / ((param0 - 48) / 54);
            if (eo.field_c != null) {
              break L1;
            } else {
              if (rc.c(-1321)) {
                break L1;
              } else {
                if (null != db.field_a) {
                  break L1;
                } else {
                  if (!we.a((byte) -80)) {
                    stackIn_7_0 = 0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          stackIn_7_0 = 1;
          break L0;
        }
        return stackIn_7_0 != 0;
    }

    final static void a(String[] args, int param1, int param2, String param3) {
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (param2 < -35) {
              L1: {
                in.field_Gb = pa.field_g;
                if (255 != param1) {
                  L2: {
                    if (param1 < 100) {
                      break L2;
                    } else {
                      if (param1 <= 105) {
                        i.field_i = ho.a((byte) 102, args);
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  i.field_i = ab.a(0, param1, param3);
                  break L1;
                } else {
                  L3: {
                    stackIn_6_0 = 32517;

                    if (-14 >= (qm.field_u ^ -1)) {
                      stackIn_7_0 = stackIn_6_0;
                      stackIn_7_1 = 0;
                      break L3;
                    } else {
                      stackIn_7_0 = stackIn_6_0;
                      stackIn_7_1 = 1;
                      break L3;
                    }
                  }
                  i.field_i = oj.a(stackIn_7_0, stackIn_7_1 != 0);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4);

            stackIn_16_1 = new StringBuilder().append("pn.G(");

            if (args == null) {
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
          L5: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean b(int param0) {
        if (!(-1 != fj.field_h)) {
            if (!(pe.a((byte) -86, 1))) {
                return false;
            }
            fj.field_h = df.field_z.e((byte) -108);
            df.field_z.field_g = 0;
        }
        if (fj.field_h == -2) {
            if (!(pe.a((byte) -86, 2))) {
                return false;
            }
            fj.field_h = df.field_z.n(-98);
            df.field_z.field_g = 0;
        }
        if (param0 != -12564) {
            return false;
        }
        return pe.a((byte) -86, fj.field_h);
    }

    final static ri a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        ri var5 = null;
        ri stackIn_4_0 = null;
        ri stackIn_7_0 = null;
        ri stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length() == 0) {
                  break L1;
                } else {
                  var2_int = param1.indexOf('@');
                  if ((var2_int ^ -1) != 0) {
                    L2: {
                      if (param0 == 78) {
                        break L2;
                      } else {
                        field_e = (qb) null;
                        break L2;
                      }
                    }
                    var3 = param1.substring(0, var2_int);
                    var4 = param1.substring(1 + var2_int);
                    var5 = pm.a((byte) -58, var3);
                    if (var5 != null) {
                      stackIn_13_0 = (ri) (var5);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      return tf.a(32752, var4);
                    }
                  } else {
                    stackIn_7_0 = uh.field_i;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
            stackIn_4_0 = fc.field_c;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2);

            stackIn_16_1 = new StringBuilder().append("pn.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    static {
        field_a = null;
    }
}
