/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ia {
    int field_g;
    static ba field_a;
    int field_h;
    static eb field_f;
    int field_d;
    int field_c;
    int field_b;
    int field_i;
    static int[] field_j;
    static String field_e;

    final static boolean a(int param0) {
        int stackIn_9_0 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            field_j = (int[]) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (pi.field_j != null) {
              break L2;
            } else {
              if (gj.c(1024)) {
                break L2;
              } else {
                if (am.field_h != null) {
                  break L2;
                } else {
                  if (!l.a(-1)) {
                    stackIn_9_0 = 0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          stackIn_9_0 = 1;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    public static void a(byte param0) {
        int var1 = 67 / ((66 - param0) / 58);
        field_a = null;
        field_j = null;
        field_f = null;
        field_e = null;
    }

    final static void b(int param0, int param1) {
        ij.field_g = param0;
        if (!(ml.field_c == null)) {
            ml.field_c.b(param0, 111);
        }
        if (!(gi.field_f == null)) {
            gi.field_f.a(0, param0);
        }
        if (param1 != -23235) {
            field_f = (eb) null;
        }
    }

    final static void a(int param0, int param1, fb param2) {
        se var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              var3 = uk.field_b;
              var3.i(param1, 126);
              var3.a(2, -29);
              var3.a(0, -63);
              var3.a(param2.field_h, -21);
              if (param0 < -11) {
                break L1;
              } else {
                field_a = (ba) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var3_ref);

            stackIn_5_1 = new StringBuilder().append("ia.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw dd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final static void a(og param0, boolean param1) {
        int dupTemp$0 = 0;
        int fieldTemp$1 = 0;
        int incrementValue$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= 3) {
                L2: {
                  var2_int = 0;
                  if (!param1) {
                    break L2;
                  } else {
                    field_e = (String) null;
                    break L2;
                  }
                }
                L3: while (true) {
                  if (gl.field_b <= var2_int) {
                    dupTemp$0 = param0.b((byte) -12);
                    od.field_j[dupTemp$0] = od.field_j[dupTemp$0] + 1;
                    var2_int = 0;
                    var3 = 0;
                    L4: while (true) {
                      if (gl.field_b <= var3) {
                        gl.field_b = var2_int;
                        fieldTemp$1 = gl.field_b;
                        gl.field_b = gl.field_b + 1;
                        jk.field_d[fieldTemp$1] = param0;
                        break L0;
                      } else {
                        L5: {
                          L6: {
                            if (param0.field_d == jk.field_d[var3].field_d) {
                              var4 = jk.field_d[var3].b((byte) -25);
                              if (df.field_b < od.field_j[var4]) {
                                od.field_j[var4] = od.field_j[var4] - 1;
                                break L5;
                              } else {
                                break L6;
                              }
                            } else {
                              break L6;
                            }
                          }
                          incrementValue$2 = var2_int;
                          var2_int++;
                          jk.field_d[incrementValue$2] = jk.field_d[var3];
                          break L5;
                        }
                        var3++;
                        continue L4;
                      }
                    }
                  } else {
                    L7: {
                      if (param0.field_d != jk.field_d[var2_int].field_d) {
                        break L7;
                      } else {
                        dupTemp$3 = jk.field_d[var2_int].b((byte) -63);
                        od.field_j[dupTemp$3] = od.field_j[dupTemp$3] + 1;
                        break L7;
                      }
                    }
                    var2_int++;
                    continue L3;
                  }
                }
              } else {
                od.field_j[var2_int] = 0;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var2);

            stackIn_23_1 = new StringBuilder().append("ia.H(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L8;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L8;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
    }

    abstract void a(int param0, int param1, int param2);

    abstract void a(int param0, int param1);

    static {
        field_j = new int[8192];
        field_a = new ba(2, 4, 4, 0);
        field_e = "<%0> BOSS";
    }
}
