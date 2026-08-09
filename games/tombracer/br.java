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
        char[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        char[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        char[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        char[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        char stackIn_18_2 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        uia var8 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (1 != param0) {
                if ((param0 ^ -1) != -3) {
                  if (param0 == 3) {
                    var4_int = param2.h(255);
                    this.field_o = new char[var4_int];
                    this.field_l = new int[var4_int];
                    var5 = 0;
                    L2: while (true) {
                      if (var5 >= var4_int) {
                        break L1;
                      } else {
                        L3: {
                          this.field_l[var5] = param2.d(126);
                          var6 = param2.c((byte) 71);
                          stackIn_17_0 = this.field_o;

                          stackIn_17_1 = var5;

                          if (var6 == 0) {
                            stackIn_18_0 = (char[]) ((Object) stackIn_17_0);
                            stackIn_18_1 = stackIn_17_1;
                            stackIn_18_2 = (char)0;
                            break L3;
                          } else {
                            stackIn_18_0 = (char[]) ((Object) stackIn_17_0);
                            stackIn_18_1 = stackIn_17_1;
                            stackIn_18_2 = wpa.a((byte) 11, (byte) var6);
                            break L3;
                          }
                        }
                        stackIn_18_0[stackIn_18_1] = stackIn_18_2;
                        var5++;
                        continue L2;
                      }
                    }
                  } else {
                    if (-5 != (param0 ^ -1)) {
                      break L1;
                    } else {
                      this.field_m = true;
                      break L1;
                    }
                  }
                } else {
                  var4_int = param2.h(255);
                  this.field_q = new int[var4_int];
                  this.field_k = new char[var4_int];
                  var5 = 0;
                  L4: while (true) {
                    if (var4_int <= var5) {
                      break L1;
                    } else {
                      L5: {
                        this.field_q[var5] = param2.d(126);
                        var6 = param2.c((byte) 99);
                        stackIn_8_0 = this.field_k;

                        stackIn_8_1 = var5;

                        if (-1 != (var6 ^ -1)) {
                          stackIn_9_0 = (char[]) ((Object) stackIn_8_0);
                          stackIn_9_1 = stackIn_8_1;
                          stackIn_9_2 = wpa.a((byte) 11, (byte) var6);
                          break L5;
                        } else {
                          stackIn_9_0 = (char[]) ((Object) stackIn_8_0);
                          stackIn_9_1 = stackIn_8_1;
                          stackIn_9_2 = 0;
                          break L5;
                        }
                      }
                      stackIn_9_0[stackIn_9_1] = (char) stackIn_9_2;
                      var5++;
                      continue L4;
                    }
                  }
                }
              } else {
                this.field_n = param2.e((byte) -76);
                break L1;
              }
            }
            L6: {
              if (param1 <= -67) {
                break L6;
              } else {
                var8 = (uia) null;
                this.a((uia) null, -82);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var4);

            stackIn_24_1 = new StringBuilder().append("br.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L7;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
    }

    final void a(int param0) {
        int var4 = 0;
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        if (this.field_l != null) {
            for (var2 = 0; this.field_l.length > var2; var2++) {
                this.field_l[var2] = fh.a(this.field_l[var2], 32768);
            }
        }
        if (!(null == this.field_q)) {
            var4 = 0;
            var2 = var4;
            while (var4 < this.field_q.length) {
                this.field_q[var4] = fh.a(this.field_q[var4], 32768);
                var4++;
            }
        }
        if (param0 != 10211) {
            this.field_n = (String) null;
        }
    }

    final void a(uia param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        uia var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -26706) {
                break L1;
              } else {
                var5 = (uia) null;
                this.a((uia) null, -59);
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
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("br.C(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    br() {
        this.field_m = false;
    }

    static {
    }
}
