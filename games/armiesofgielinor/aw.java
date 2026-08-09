/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aw extends sm {
    static wk field_m;
    static String field_k;
    static boolean field_l;
    static int[][][] field_j;
    static String field_h;
    static wr field_i;

    final static boolean a(boolean param0) {
        long var1;
        long var3;
        int var5;
        int var6;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0) {
          var1 = vi.b(-45);
          var3 = var1 + -dp.field_Lb;
          if (-30001L > (var3 ^ -1L)) {
            dp.field_Lb = var1;
            mu.field_d = 0;
            return true;
          } else {
            L0: {
              var5 = 3000;
              if (7 <= mu.field_d) {
                var5 = 12000;
                break L0;
              } else {
                if (mu.field_d < 5) {
                  if (3 > mu.field_d) {
                    break L0;
                  } else {
                    var5 = 6000;
                    if ((var3 ^ -1L) < ((long)var5 ^ -1L)) {
                      dp.field_Lb = var1;
                      mu.field_d = mu.field_d + 1;
                      return true;
                    } else {
                      return false;
                    }
                  }
                } else {
                  var5 = 9000;
                  if ((var3 ^ -1L) < ((long)var5 ^ -1L)) {
                    dp.field_Lb = var1;
                    mu.field_d = mu.field_d + 1;
                    return true;
                  } else {
                    return false;
                  }
                }
              }
            }
            if ((var3 ^ -1L) < ((long)var5 ^ -1L)) {
              dp.field_Lb = var1;
              mu.field_d = mu.field_d + 1;
              return true;
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    final void a(int param0, jb param1) {
        RuntimeException runtimeException = null;
        jb var3 = null;
        jb var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = (jb) ((Object) this.field_a.a(0));
              if (param0 == 16777062) {
                break L1;
              } else {
                var4 = (jb) null;
                this.a(64, (jb) null);
                break L1;
              }
            }
            L2: {
              L3: {
                if (var3 == null) {
                  break L3;
                } else {
                  if (param1.field_t > var3.field_t) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              var3 = param1;
              break L2;
            }
            this.field_a.a(750, var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (runtimeException);

            stackIn_10_1 = new StringBuilder().append("aw.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final jb a(byte param0) {
        jb var2;
        if (param0 > -28) {
          this.a((byte) -5);
          var2 = (jb) ((Object) this.field_a.a(0));
          return var2;
        } else {
          var2 = (jb) ((Object) this.field_a.a(0));
          return var2;
        }
    }

    final static og a(byte param0, mt param1) {
        int fieldTemp$4 = 0;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        StringBuilder var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_15_0 = 0;
        og stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              fieldTemp$4 = param1.field_c - 1;
              param1.field_c = param1.field_c - 1;
              var2_int = fieldTemp$4;
              var3 = new StringBuilder();
              var4 = param1.b(-1);
              if (param0 > 95) {
                break L1;
              } else {
                field_h = (String) null;
                break L1;
              }
            }
            discarded$5 = var3.append((char) var4);
            var5 = 0;
            L2: while (true) {
              L3: {
                if (param1.a((byte) 16)) {
                  break L3;
                } else {
                  var6 = param1.b(-1);
                  if (var5 != 0) {
                    var5 = 0;
                    discarded$6 = var3.append((char) var6);
                    continue L2;
                  } else {
                    L4: {
                      if (var6 != 92) {
                        discarded$7 = var3.append((char) var6);
                        break L4;
                      } else {
                        var5 = 1;
                        break L4;
                      }
                    }
                    if (var4 != var6) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              L5: {
                if (var4 != 34) {
                  stackIn_15_0 = hf.field_h;
                  break L5;
                } else {
                  stackIn_15_0 = iu.field_x;
                  break L5;
                }
              }
              var6 = stackIn_15_0;
              stackIn_16_0 = new og(var6, var2_int, var3.toString());
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var2);

            stackIn_19_1 = new StringBuilder().append("aw.B(").append(param0).append(',');

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
          throw ig.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        return stackIn_16_0;
    }

    final static void a(co param0, co[] param1, int param2) {
        try {
            if (param2 != -5841) {
                field_h = (String) null;
            }
            param1[param0.field_d] = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "aw.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        nt var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4 = (nt) ((Object) s.field_a.e((byte) 104));
            L1: while (true) {
              if (var4 == null) {
                if (param1 == 1742) {
                  break L0;
                } else {
                  aw.a(true);
                  return;
                }
              } else {
                tf.a(param0, var4, (byte) -64);
                var4 = (nt) ((Object) s.field_a.a((byte) 123));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "aw.R(" + param0 + ',' + param1 + ')');
        }
    }

    public static void c(byte param0) {
        int var1 = 13 % ((-54 - param0) / 57);
        field_h = null;
        field_k = null;
        field_m = null;
        field_j = (int[][][]) null;
        field_i = null;
    }

    aw(ej param0) {
        super(param0);
    }

    static {
        field_h = null;
    }
}
