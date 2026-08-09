/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hm {
    static mi field_c;
    static ud field_d;
    static jc field_a;
    static w field_b;
    static int[][] field_e;

    abstract int a(int param0);

    final static void a(nf param0, mm param1, int param2, String param3, int param4) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = client.field_A ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = param4;
            var7 = 1;
            L1: while (true) {
              L2: {
                if (param3.length() <= var7) {
                  break L2;
                } else {
                  var8 = param3.charAt(var7);
                  if (var9 == 0) {
                    L3: {
                      if (var8 == 60) {
                        var6 = param0.field_a[0] + ((var5_int >> 1028880040) - -param1.a(param3.substring(0, var7)));
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      L5: {
                        if (-1 != var6) {
                          break L5;
                        } else {
                          L6: {
                            if (32 != var8) {
                              break L6;
                            } else {
                              var5_int = var5_int + param2;
                              break L6;
                            }
                          }
                          param0.field_a[var7] = (var5_int >> 685930120) - -param0.field_a[0] - (-param1.a(param3.substring(0, var7 + 1)) + param1.a((char) var8));
                          if (var9 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      param0.field_a[var7] = var6;
                      break L4;
                    }
                    L7: {
                      if (var8 == 62) {
                        var6 = -1;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var7++;
                    if (var9 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  } else {
                    return;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var5);

            stackIn_20_1 = new StringBuilder().append("hm.B(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L8;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L9;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L10;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L10;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_21_0), stackIn_27_2 + ',' + param4 + ')');
        }
    }

    public static void b(int param0) {
        field_c = null;
        field_d = null;
        field_b = null;
        int var1 = -36 / ((param0 - -11) / 52);
        field_a = null;
        field_e = (int[][]) null;
    }

    abstract void a(int param0, java.awt.Component param1);

    final static void a(int param0, byte param1) {
        if (param1 >= -101) {
            return;
        }
        ai.field_P = param0;
    }

    final static fm a(boolean param0, String param1, String param2, int param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        fm stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == 9507) {
                break L1;
              } else {
                field_d = (ud) null;
                break L1;
              }
            }
            L2: {
              L3: {
                var4_long = 0L;
                var6 = null;
                if (param2.indexOf('@') != -1) {
                  break L3;
                } else {
                  var7 = (CharSequence) ((Object) param2);
                  var4_long = ab.a(121, var7);
                  if (!client.field_A) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var6 = param2;
              break L2;
            }
            stackIn_6_0 = sb.a(var4_long, param1, param0, (String) (var6), 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("hm.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L5;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    abstract void a(java.awt.Component param0, int param1);

    final static void a(int param0, boolean param1) {
        L0: {
          if (null != sl.field_g) {
            qd.a(sl.field_g, -2);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (w.field_H != null) {
            w.field_H.a((byte) 39, param1);
            break L1;
          } else {
            break L1;
          }
        }
        r.a(param1, 4028);
        if (param0 == -1) {
          if (null != pd.field_f) {
            pd.field_f.a(1141039778, param1);
            lg.a(param1, -123);
            return;
          } else {
            lg.a(param1, -123);
            return;
          }
        } else {
          field_d = (ud) null;
          if (null == pd.field_f) {
            lg.a(param1, -123);
            return;
          } else {
            pd.field_f.a(1141039778, param1);
            lg.a(param1, -123);
            return;
          }
        }
    }

    static {
        field_a = new jc();
        field_e = (int[][]) null;
    }
}
