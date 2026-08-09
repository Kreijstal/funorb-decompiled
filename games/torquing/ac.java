/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac extends nk {
    byte field_y;
    int field_x;
    fj field_z;
    static String field_A;

    public static void c(int param0) {
        field_A = null;
        if (param0 != 0) {
            field_A = (String) null;
        }
    }

    final static String a(int param0, CharSequence[] param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 < -103) {
                break L1;
              } else {
                field_A = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = wi.a(0, 0, param1.length, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ac.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static int d(byte param0) {
        if (param0 != -97) {
            String var2 = (String) null;
            ac.a((String) null, -50);
            return jl.field_S;
        }
        return jl.field_S;
    }

    final byte[] c(byte param0) {
        if (param0 > 102) {
          if (!this.field_r) {
            if (this.field_z.field_j.length + -this.field_y > this.field_z.field_n) {
              throw new RuntimeException();
            } else {
              return this.field_z.field_j;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          this.field_z = (fj) null;
          if (!this.field_r) {
            if (this.field_z.field_j.length + -this.field_y > this.field_z.field_n) {
              throw new RuntimeException();
            } else {
              return this.field_z.field_j;
            }
          } else {
            throw new RuntimeException();
          }
        }
    }

    final static ae a(String param0, int param1) {
        String var2 = null;
        ae var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        ae stackIn_16_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = Torquing.field_u;
        try {
          L0: {
            if (null != ed.field_c) {
              L1: {
                var6 = (CharSequence) ((Object) param0);
                var2 = hf.a(var6, 102);
                if (var2 != null) {
                  break L1;
                } else {
                  var2 = param0;
                  break L1;
                }
              }
              L2: {
                if (param1 == 0) {
                  break L2;
                } else {
                  field_A = (String) null;
                  break L2;
                }
              }
              var3 = (ae) ((Object) ed.field_c.a((long)var2.hashCode(), param1 + -56));
              L3: while (true) {
                if (var3 != null) {
                  L4: {
                    var7 = (CharSequence) ((Object) var3.field_ob);
                    var4 = hf.a(var7, param1 ^ 118);
                    if (var4 == null) {
                      var4 = var3.field_ob;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if (!var4.equals(var2)) {
                    var3 = (ae) ((Object) ed.field_c.b(-1));
                    continue L3;
                  } else {
                    stackIn_16_0 = (ae) (var3);
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
            stackIn_21_0 = (RuntimeException) (var2_ref);

            stackIn_21_1 = new StringBuilder().append("ac.H(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
        return stackIn_16_0;
    }

    final int b(int param0) {
        if (param0 < 91) {
            this.field_x = -38;
            if (!(this.field_z != null)) {
                return 0;
            }
            return 100 * this.field_z.field_n / (this.field_z.field_j.length - this.field_y);
        }
        if (!(this.field_z != null)) {
            return 0;
        }
        return 100 * this.field_z.field_n / (this.field_z.field_j.length - this.field_y);
    }

    ac() {
    }

    final static boolean a(fj param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        fj var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = param0.i((byte) -101);
              if ((var2_int ^ -1) == -2) {
                stackIn_3_0 = 1;
                break L1;
              } else {
                stackIn_3_0 = 0;
                break L1;
              }
            }
            L2: {
              var3 = stackIn_3_0;
              if (param1 == 28066) {
                break L2;
              } else {
                var4 = (fj) null;
                ac.a((fj) null, -59);
                break L2;
              }
            }
            stackIn_6_0 = var3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("ac.G(");

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
          throw rb.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0 != 0;
    }

    static {
        field_A = "Loading music";
    }
}
