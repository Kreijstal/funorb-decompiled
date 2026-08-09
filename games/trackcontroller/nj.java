/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj {
    static String field_d;
    String field_c;
    boolean field_e;
    boolean field_f;
    String[] field_a;
    int field_b;

    final static void a(int param0) {
        jf.e(640);
        vg.field_o = true;
        u.field_i = true;
        gl.field_E.l(24910);
        nb.a(oj.field_c, false, -16257);
        if (param0 != -27958) {
            nj.b((byte) -82);
        }
    }

    public static void b(int param0) {
        if (param0 <= 6) {
            nj.a((byte) -57);
        }
        field_d = null;
    }

    final static void b(byte param0) {
        int var1 = 82 % ((param0 - 2) / 59);
        hb.field_i = null;
        dc.field_s = null;
    }

    final static ve a(byte param0, String param1) {
        String var2 = null;
        ve var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        ve stackIn_17_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (ug.field_cb != null) {
              L1: {
                var6 = (CharSequence) ((Object) param1);
                var2 = r.a(var6, -11133);
                if (param0 >= 122) {
                  break L1;
                } else {
                  field_d = (String) null;
                  break L1;
                }
              }
              L2: {
                if (var2 == null) {
                  var2 = param1;
                  break L2;
                } else {
                  break L2;
                }
              }
              var3 = (ve) ((Object) ug.field_cb.a(-1, (long)var2.hashCode()));
              L3: while (true) {
                if (var3 != null) {
                  L4: {
                    var7 = (CharSequence) ((Object) var3.field_jb);
                    var4 = r.a(var7, -11133);
                    if (var4 == null) {
                      var4 = var3.field_jb;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if (!var4.equals(var2)) {
                    var3 = (ve) ((Object) ug.field_cb.a(-1));
                    continue L3;
                  } else {
                    stackIn_17_0 = (ve) (var3);
                    break L0;
                  }
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2_ref = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var2_ref);

            stackIn_22_1 = new StringBuilder().append("nj.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        return stackIn_17_0;
    }

    final static void a(byte param0) {
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var5 = ok.field_F;
            var1 = var5;
            var2 = 0;
            var3 = var5.length;
            L1: while (true) {
              if (var3 <= var2) {
                L2: {
                  if (param0 == 125) {
                    break L2;
                  } else {
                    field_d = (String) null;
                    break L2;
                  }
                }
                break L0;
              } else {
                incrementValue$8 = var2;
                var2++;
                var5[incrementValue$8] = 0;
                incrementValue$9 = var2;
                var2++;
                var5[incrementValue$9] = 0;
                incrementValue$10 = var2;
                var2++;
                var5[incrementValue$10] = 0;
                incrementValue$11 = var2;
                var2++;
                var5[incrementValue$11] = 0;
                incrementValue$12 = var2;
                var2++;
                var5[incrementValue$12] = 0;
                incrementValue$13 = var2;
                var2++;
                var5[incrementValue$13] = 0;
                incrementValue$14 = var2;
                var2++;
                var5[incrementValue$14] = 0;
                incrementValue$15 = var2;
                var2++;
                var5[incrementValue$15] = 0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var1_ref), "nj.C(" + param0 + ')');
        }
    }

    final static void a(q param0, byte param1) {
        int dupTemp$0 = 0;
        int fieldTemp$1 = 0;
        int incrementValue$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= 3) {
                var2_int = 0;
                L2: while (true) {
                  if (var2_int >= rk.field_ab) {
                    L3: {
                      if (param1 >= 16) {
                        break L3;
                      } else {
                        field_d = (String) null;
                        break L3;
                      }
                    }
                    dupTemp$0 = param0.a((byte) -94);
                    rk.field_T[dupTemp$0] = rk.field_T[dupTemp$0] + 1;
                    var2_int = 0;
                    var3 = 0;
                    L4: while (true) {
                      if (var3 >= rk.field_ab) {
                        rk.field_ab = var2_int;
                        fieldTemp$1 = rk.field_ab;
                        rk.field_ab = rk.field_ab + 1;
                        rl.field_C[fieldTemp$1] = param0;
                        break L0;
                      } else {
                        L5: {
                          L6: {
                            if (param0.field_e == rl.field_C[var3].field_e) {
                              var4 = rl.field_C[var3].a((byte) -123);
                              if (hi.field_y >= rk.field_T[var4]) {
                                break L6;
                              } else {
                                rk.field_T[var4] = rk.field_T[var4] - 1;
                                break L5;
                              }
                            } else {
                              break L6;
                            }
                          }
                          incrementValue$2 = var2_int;
                          var2_int++;
                          rl.field_C[incrementValue$2] = rl.field_C[var3];
                          break L5;
                        }
                        var3++;
                        continue L4;
                      }
                    }
                  } else {
                    L7: {
                      if ((rl.field_C[var2_int].field_e ^ -1) != (param0.field_e ^ -1)) {
                        break L7;
                      } else {
                        dupTemp$3 = rl.field_C[var2_int].a((byte) -111);
                        rk.field_T[dupTemp$3] = rk.field_T[dupTemp$3] + 1;
                        break L7;
                      }
                    }
                    var2_int++;
                    continue L2;
                  }
                }
              } else {
                rk.field_T[var2_int] = 0;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var2);

            stackIn_25_1 = new StringBuilder().append("nj.E(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
        }
    }

    nj(boolean param0) {
        this.field_e = param0 ? true : false;
    }

    static {
        field_d = "Score: ";
    }
}
