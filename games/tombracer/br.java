/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class br extends od {
    char[] field_k;
    int[] field_l;
    static long field_p;
    char[] field_o;
    int[] field_q;
    boolean field_m;
    String field_n;

    private final void a(int param0, int param1, uia param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        char[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        char[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        char[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        char[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        char[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        char[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        char[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        char[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        char[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        char stackOut_16_2 = 0;
        char[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        char[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        char stackOut_8_2 = 0;
        char[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (1 != param0) {
                L2: {
                  if (param0 != 2) {
                    if (param0 == 3) {
                      var4_int = param2.h(255);
                      ((br) this).field_o = new char[var4_int];
                      ((br) this).field_l = new int[var4_int];
                      var5 = 0;
                      L3: while (true) {
                        if (~var5 <= ~var4_int) {
                          break L2;
                        } else {
                          L4: {
                            ((br) this).field_l[var5] = param2.d(126);
                            var6 = param2.c((byte) 71);
                            stackOut_15_0 = ((br) this).field_o;
                            stackOut_15_1 = var5;
                            stackIn_17_0 = stackOut_15_0;
                            stackIn_17_1 = stackOut_15_1;
                            stackIn_16_0 = stackOut_15_0;
                            stackIn_16_1 = stackOut_15_1;
                            if (var6 == 0) {
                              stackOut_17_0 = (char[]) (Object) stackIn_17_0;
                              stackOut_17_1 = stackIn_17_1;
                              stackOut_17_2 = 0;
                              stackIn_18_0 = stackOut_17_0;
                              stackIn_18_1 = stackOut_17_1;
                              stackIn_18_2 = stackOut_17_2;
                              break L4;
                            } else {
                              stackOut_16_0 = (char[]) (Object) stackIn_16_0;
                              stackOut_16_1 = stackIn_16_1;
                              stackOut_16_2 = wpa.a((byte) 11, (byte) var6);
                              stackIn_18_0 = stackOut_16_0;
                              stackIn_18_1 = stackOut_16_1;
                              stackIn_18_2 = stackOut_16_2;
                              break L4;
                            }
                          }
                          stackIn_18_0[stackIn_18_1] = (char) stackIn_18_2;
                          var5++;
                          continue L3;
                        }
                      }
                    } else {
                      if (param0 != 4) {
                        break L2;
                      } else {
                        ((br) this).field_m = true;
                        break L1;
                      }
                    }
                  } else {
                    var4_int = param2.h(255);
                    ((br) this).field_q = new int[var4_int];
                    ((br) this).field_k = new char[var4_int];
                    var5 = 0;
                    L5: while (true) {
                      if (var4_int <= var5) {
                        break L2;
                      } else {
                        L6: {
                          ((br) this).field_q[var5] = param2.d(126);
                          var6 = param2.c((byte) 99);
                          stackOut_6_0 = ((br) this).field_k;
                          stackOut_6_1 = var5;
                          stackIn_8_0 = stackOut_6_0;
                          stackIn_8_1 = stackOut_6_1;
                          stackIn_7_0 = stackOut_6_0;
                          stackIn_7_1 = stackOut_6_1;
                          if (var6 != 0) {
                            stackOut_8_0 = (char[]) (Object) stackIn_8_0;
                            stackOut_8_1 = stackIn_8_1;
                            stackOut_8_2 = wpa.a((byte) 11, (byte) var6);
                            stackIn_9_0 = stackOut_8_0;
                            stackIn_9_1 = stackOut_8_1;
                            stackIn_9_2 = stackOut_8_2;
                            break L6;
                          } else {
                            stackOut_7_0 = (char[]) (Object) stackIn_7_0;
                            stackOut_7_1 = stackIn_7_1;
                            stackOut_7_2 = 0;
                            stackIn_9_0 = stackOut_7_0;
                            stackIn_9_1 = stackOut_7_1;
                            stackIn_9_2 = stackOut_7_2;
                            break L6;
                          }
                        }
                        stackIn_9_0[stackIn_9_1] = (char) stackIn_9_2;
                        var5++;
                        continue L5;
                      }
                    }
                  }
                }
                break L1;
              } else {
                ((br) this).field_n = param2.e((byte) -76);
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
            stackOut_21_1 = new StringBuilder().append("br.B(").append(param0).append(',').append(-90).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var4 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        if (((br) this).field_l != null) {
            for (var2 = 0; ((br) this).field_l.length > var2; var2++) {
                ((br) this).field_l[var2] = fh.a(((br) this).field_l[var2], 32768);
            }
        }
        if (!(null == ((br) this).field_q)) {
            var4 = 0;
            var2 = var4;
            while (var4 < ((br) this).field_q.length) {
                ((br) this).field_q[var4] = fh.a(((br) this).field_q[var4], 32768);
                var4++;
            }
        }
        if (param0 != 10211) {
            ((br) this).field_n = null;
        }
    }

    final void a(uia param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        Object var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -26706) {
                break L1;
              } else {
                var5 = null;
                ((br) this).a((uia) null, -59);
                break L1;
              }
            }
            L2: while (true) {
              var3_int = param0.h(255);
              if (var3_int != 0) {
                this.a(var3_int, -90, param0);
                continue L2;
              } else {
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("br.C(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ')');
        }
    }

    br() {
        ((br) this).field_m = false;
    }

    static {
    }
}
