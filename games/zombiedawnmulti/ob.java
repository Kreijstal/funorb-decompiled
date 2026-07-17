/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends qa {
    char[] field_D;
    int[] field_x;
    boolean field_y;
    char[] field_r;
    static String field_v;
    static String field_C;
    static String field_z;
    static String field_w;
    static String field_u;
    int[] field_B;
    static String field_t;
    static String field_q;
    String field_s;
    static String field_A;

    final static String e(int param0) {
        String var1 = "";
        if (param0 != -24093) {
            return null;
        }
        if (null != b.field_c) {
            var1 = b.field_c.h(6728);
        }
        if (!(var1.length() != 0)) {
            int discarded$0 = -127;
            var1 = ki.a();
        }
        if (!(var1.length() != 0)) {
            var1 = hg.field_vb;
        }
        return var1;
    }

    private final void a(int param0, k param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        char[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        char[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        char[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        char[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        char[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        char[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        char[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        char[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        char stackOut_18_2 = 0;
        char[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        char[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        char[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        char stackOut_12_2 = 0;
        char[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (1 != param2) {
                L2: {
                  if (param2 == 2) {
                    var4_int = param1.g(31365);
                    ((ob) this).field_r = new char[var4_int];
                    ((ob) this).field_x = new int[var4_int];
                    var5 = 0;
                    L3: while (true) {
                      if (~var4_int >= ~var5) {
                        break L2;
                      } else {
                        L4: {
                          ((ob) this).field_x[var5] = param1.d((byte) 69);
                          var6 = param1.d(-249699580);
                          stackOut_16_0 = ((ob) this).field_r;
                          stackOut_16_1 = var5;
                          stackIn_18_0 = stackOut_16_0;
                          stackIn_18_1 = stackOut_16_1;
                          stackIn_17_0 = stackOut_16_0;
                          stackIn_17_1 = stackOut_16_1;
                          if (var6 != 0) {
                            stackOut_18_0 = (char[]) (Object) stackIn_18_0;
                            stackOut_18_1 = stackIn_18_1;
                            stackOut_18_2 = ob.a((byte) var6, -1);
                            stackIn_19_0 = stackOut_18_0;
                            stackIn_19_1 = stackOut_18_1;
                            stackIn_19_2 = stackOut_18_2;
                            break L4;
                          } else {
                            stackOut_17_0 = (char[]) (Object) stackIn_17_0;
                            stackOut_17_1 = stackIn_17_1;
                            stackOut_17_2 = 0;
                            stackIn_19_0 = stackOut_17_0;
                            stackIn_19_1 = stackOut_17_1;
                            stackIn_19_2 = stackOut_17_2;
                            break L4;
                          }
                        }
                        stackIn_19_0[stackIn_19_1] = (char) stackIn_19_2;
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    if (param2 == 3) {
                      var4_int = param1.g(31365);
                      ((ob) this).field_D = new char[var4_int];
                      ((ob) this).field_B = new int[var4_int];
                      var5 = 0;
                      L5: while (true) {
                        if (var4_int <= var5) {
                          break L2;
                        } else {
                          L6: {
                            ((ob) this).field_B[var5] = param1.d((byte) 69);
                            var6 = param1.d(-249699580);
                            stackOut_10_0 = ((ob) this).field_D;
                            stackOut_10_1 = var5;
                            stackIn_12_0 = stackOut_10_0;
                            stackIn_12_1 = stackOut_10_1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            if (0 != var6) {
                              stackOut_12_0 = (char[]) (Object) stackIn_12_0;
                              stackOut_12_1 = stackIn_12_1;
                              stackOut_12_2 = ob.a((byte) var6, -1);
                              stackIn_13_0 = stackOut_12_0;
                              stackIn_13_1 = stackOut_12_1;
                              stackIn_13_2 = stackOut_12_2;
                              break L6;
                            } else {
                              stackOut_11_0 = (char[]) (Object) stackIn_11_0;
                              stackOut_11_1 = stackIn_11_1;
                              stackOut_11_2 = 0;
                              stackIn_13_0 = stackOut_11_0;
                              stackIn_13_1 = stackOut_11_1;
                              stackIn_13_2 = stackOut_11_2;
                              break L6;
                            }
                          }
                          stackIn_13_0[stackIn_13_1] = (char) stackIn_13_2;
                          var5++;
                          continue L5;
                        }
                      }
                    } else {
                      if (param2 == 4) {
                        ((ob) this).field_y = true;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                break L1;
              } else {
                ((ob) this).field_s = param1.f((byte) -93);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var4;
            stackOut_21_1 = new StringBuilder().append("ob.L(").append(-56).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param2 + 41);
        }
    }

    final void e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (null != ((ob) this).field_B) {
          var2 = 0;
          L0: while (true) {
            if (((ob) this).field_B.length <= var2) {
              if (((ob) this).field_x != null) {
                var4 = 0;
                var2 = var4;
                L1: while (true) {
                  if (((ob) this).field_x.length <= var4) {
                    if (param0 == -72) {
                      return;
                    } else {
                      char discarded$19 = ob.a((byte) -85, -72);
                      return;
                    }
                  } else {
                    ((ob) this).field_x[var4] = cr.b(((ob) this).field_x[var4], 32768);
                    var4++;
                    continue L1;
                  }
                }
              } else {
                if (param0 == -72) {
                  return;
                } else {
                  char discarded$20 = ob.a((byte) -85, -72);
                  return;
                }
              }
            } else {
              ((ob) this).field_B[var2] = cr.b(((ob) this).field_B[var2], 32768);
              var2++;
              continue L0;
            }
          }
        } else {
          if (((ob) this).field_x != null) {
            var4 = 0;
            var2 = var4;
            L2: while (true) {
              if (((ob) this).field_x.length > var4) {
                ((ob) this).field_x[var4] = cr.b(((ob) this).field_x[var4], 32768);
                var4++;
                continue L2;
              } else {
                L3: {
                  if (param0 == -72) {
                    break L3;
                  } else {
                    char discarded$21 = ob.a((byte) -85, -72);
                    break L3;
                  }
                }
                return;
              }
            }
          } else {
            if (param0 != -72) {
              char discarded$22 = ob.a((byte) -85, -72);
              return;
            } else {
              return;
            }
          }
        }
    }

    final static boolean d() {
        int var6 = ZombieDawnMulti.field_E ? 1 : 0;
        long var1 = bl.a((byte) 55);
        long var3 = -wn.field_r + var1;
        if (var3 > 30000L) {
            vd.field_c = 0;
            wn.field_r = var1;
            return true;
        }
        int var5 = 3000;
        if (vd.field_c >= 7) {
            var5 = 12000;
            if (~(long)var5 <= ~var3) {
                return false;
            }
            wn.field_r = var1;
            vd.field_c = vd.field_c + 1;
            return true;
        }
        if (vd.field_c >= 5) {
            var5 = 9000;
            if (!(~(long)var5 <= ~var3)) {
                wn.field_r = var1;
                vd.field_c = vd.field_c + 1;
                return true;
            }
            return false;
        }
        if (vd.field_c < 3) {
            if (!(~(long)var5 <= ~var3)) {
                wn.field_r = var1;
                vd.field_c = vd.field_c + 1;
                return true;
            }
            return false;
        }
        var5 = 6000;
        if (!(~(long)var5 <= ~var3)) {
            wn.field_r = var1;
            vd.field_c = vd.field_c + 1;
            return true;
        }
        return false;
    }

    final void a(int param0, k param1) {
        int var3_int = 0;
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
            while (true) {
                var3_int = param1.g(31365);
                if (0 == var3_int) {
                    break;
                }
                this.a(-56, param1, var3_int);
            }
            var3_int = -23 / ((param0 - 19) / 42);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "ob.M(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static char a(byte param0, int param1) {
        int var3 = 0;
        int var2 = param0 & 255;
        if (!(param1 != ~var2)) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (var2 >= 128) {
            if (var2 >= 160) {
                return (char)var2;
            }
            var3 = vg.field_s[-128 + var2];
            if (!(var3 != 0)) {
                var3 = 63;
            }
            var2 = var3;
        }
        return (char)var2;
    }

    public static void c(byte param0) {
        field_A = null;
        field_C = null;
        field_t = null;
        if (param0 != -52) {
            ob.c((byte) -29);
            field_q = null;
            field_z = null;
            field_w = null;
            field_u = null;
            field_v = null;
            return;
        }
        field_q = null;
        field_z = null;
        field_w = null;
        field_u = null;
        field_v = null;
    }

    final static void a(cj param0, int param1) {
        cj var4 = null;
        int var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
            var4 = (cj) (Object) param0.field_Cb.c(87);
            if (param1 < 30) {
                String discarded$0 = ob.e(34);
            }
            while (var4 != null) {
                var4.field_mb = 0;
                var4.field_z = 0;
                var4.field_I = 0;
                var4.field_Q = 0;
                var4 = (cj) (Object) param0.field_Cb.b(6);
            }
            param0.field_I = 0;
            param0.field_Q = 0;
            param0.field_z = 0;
            param0.field_mb = 0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "ob.H(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    ob() {
        ((ob) this).field_y = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Your rating is <%0>";
        field_z = "Please enter your age in years";
        field_u = "Teleport";
        field_t = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
        field_C = "??? points ";
        field_w = "to over <%0> great games";
        field_q = "x<%0>";
        field_A = "(Click or press 'SPACE' to close)";
    }
}
