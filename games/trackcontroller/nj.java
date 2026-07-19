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
        RuntimeException var2_ref = null;
        ve var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        ve stackIn_17_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        ve stackOut_16_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
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
                    stackOut_16_0 = (ve) (var3);
                    stackIn_17_0 = stackOut_16_0;
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
            stackOut_20_0 = (RuntimeException) (var2_ref);
            stackOut_20_1 = new StringBuilder().append("nj.A(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        return stackIn_17_0;
    }

    final static void a(byte param0) {
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
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
                incrementValue$16 = var2;
                var2++;
                var5[incrementValue$16] = 0;
                incrementValue$17 = var2;
                var2++;
                var5[incrementValue$17] = 0;
                incrementValue$18 = var2;
                var2++;
                var5[incrementValue$18] = 0;
                incrementValue$19 = var2;
                var2++;
                var5[incrementValue$19] = 0;
                incrementValue$20 = var2;
                var2++;
                var5[incrementValue$20] = 0;
                incrementValue$21 = var2;
                var2++;
                var5[incrementValue$21] = 0;
                incrementValue$22 = var2;
                var2++;
                var5[incrementValue$22] = 0;
                incrementValue$23 = var2;
                var2++;
                var5[incrementValue$23] = 0;
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
        int dupTemp$4 = 0;
        int fieldTemp$5 = 0;
        int incrementValue$6 = 0;
        int dupTemp$7 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
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
                    dupTemp$4 = param0.a((byte) -94);
                    rk.field_T[dupTemp$4] = rk.field_T[dupTemp$4] + 1;
                    var2_int = 0;
                    var3 = 0;
                    L4: while (true) {
                      if (var3 >= rk.field_ab) {
                        rk.field_ab = var2_int;
                        fieldTemp$5 = rk.field_ab;
                        rk.field_ab = rk.field_ab + 1;
                        rl.field_C[fieldTemp$5] = param0;
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
                          incrementValue$6 = var2_int;
                          var2_int++;
                          rl.field_C[incrementValue$6] = rl.field_C[var3];
                          break L5;
                        }
                        var3++;
                        continue L4;
                      }
                    }
                  } else {
                    L7: {
                      if (rl.field_C[var2_int].field_e != param0.field_e) {
                        break L7;
                      } else {
                        dupTemp$7 = rl.field_C[var2_int].a((byte) -111);
                        rk.field_T[dupTemp$7] = rk.field_T[dupTemp$7] + 1;
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
            stackOut_21_0 = (RuntimeException) (var2);
            stackOut_21_1 = new StringBuilder().append("nj.E(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
    }

    nj(boolean param0) {
        this.field_e = param0 ? true : false;
    }

    static {
        field_d = "Score: ";
    }
}
