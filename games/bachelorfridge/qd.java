/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd extends pv {
    static String field_l;
    static float field_q;
    static String field_k;
    private double field_j;
    static String field_n;
    private int field_o;
    private int field_m;
    static String field_p;

    private final void c(int param0) {
        if (param0 >= -116) {
          return;
        } else {
          this.field_f.field_n = this.field_f.c((byte) -125);
          this.field_f.field_k = this.field_f.b(true);
          return;
        }
    }

    public static void c(byte param0) {
        field_k = null;
        if (param0 < 31) {
            return;
        }
        field_p = null;
        field_l = null;
        field_n = null;
    }

    final boolean b(boolean param0) {
        int stackIn_11_0 = 0;
        Object stackIn_11_1 = null;
        int stackIn_12_0 = 0;
        Object stackIn_12_1 = null;
        int stackIn_12_2 = 0;
        int fieldTemp$1 = this.field_g + 1;
        this.field_g = this.field_g + 1;
        if (fieldTemp$1 <= this.c(false)) {
          if (this.field_m != 0) {
            L0: {
              if (1 == this.field_g) {
                this.field_f.field_l = this.field_f.field_l + (int)((double)this.field_m / 39.0);
                this.field_f.field_v.a((byte) 55, this.field_f.field_g.field_o.field_b, 2);
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (-19 < (this.field_g ^ -1)) {
                break L1;
              } else {
                L2: {
                  stackIn_11_0 = this.field_g ^ -1;

                  stackIn_11_1 = this;

                  if (param0) {
                    stackIn_12_0 = stackIn_11_0;
                    stackIn_12_1 = this;
                    stackIn_12_2 = 0;
                    break L2;
                  } else {
                    stackIn_12_0 = stackIn_11_0;
                    stackIn_12_1 = this;
                    stackIn_12_2 = 1;
                    break L2;
                  }
                }
                if (stackIn_12_0 >= (this.c(stackIn_12_2 != 0) - 25 ^ -1)) {
                  this.field_f.field_k = this.b(-102);
                  break L1;
                } else {
                  if (!param0) {
                    field_p = (String) null;
                    return false;
                  } else {
                    return false;
                  }
                }
              }
            }
            if (!param0) {
              field_p = (String) null;
              return false;
            } else {
              return false;
            }
          } else {
            this.c(-123);
            return true;
          }
        } else {
          this.c(-123);
          return true;
        }
    }

    private final int c(boolean param0) {
        if (param0) {
            return -126;
        }
        return 40 * Math.abs(this.field_m) / 39;
    }

    private final int b(int param0) {
        int discarded$1 = 0;
        if (param0 > -101) {
          discarded$1 = this.c(true);
          return (int)((double)(this.field_g - 18) * this.field_j) - -this.field_o;
        } else {
          return (int)((double)(this.field_g - 18) * this.field_j) - -this.field_o;
        }
    }

    final static boolean a(String param0, int param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            try {
              L1: {
                if (!ht.field_i.startsWith("win")) {
                  stackIn_4_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L1;
                } else {
                  L2: {
                    if (param0.startsWith("http://")) {
                      break L2;
                    } else {
                      if (!param0.startsWith("https://")) {
                        stackIn_9_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    if (param1 < -119) {
                      break L3;
                    } else {
                      qd.c((byte) -22);
                      break L3;
                    }
                  }
                  var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                  var3 = 0;
                  L4: while (true) {
                    if (param0.length() <= var3) {
                      Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                      stackIn_20_0 = 1;
                      decompiledRegionSelector0 = 3;
                      break L1;
                    } else {
                      if (0 == (var2.indexOf((int) param0.charAt(var3)) ^ -1)) {
                        stackIn_17_0 = 0;
                        decompiledRegionSelector0 = 2;
                        break L1;
                      } else {
                        var3++;
                        continue L4;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              stackIn_22_0 = 0;
              return stackIn_22_0 != 0;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                decompiledRegionSelector1 = 1;
                break L0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  decompiledRegionSelector1 = 2;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var2_ref2);

            stackIn_25_1 = new StringBuilder().append("qd.I(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L5;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L5;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return stackIn_17_0 != 0;
            } else {
              return stackIn_20_0 != 0;
            }
          }
        }
    }

    qd(jfa param0, int param1) {
        try {
            this.field_f = param0;
            this.field_m = param1;
            this.field_o = this.field_f.field_k;
            this.field_j = (double)this.field_m / (-43.0 + (double)this.c(false));
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "qd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_l = "Add to Cart";
        field_k = "Shortcut Reference";
        field_p = "This is your RuneScape clan if you have one.";
        field_n = "Error connecting to server. Please try using a different server.";
    }
}
