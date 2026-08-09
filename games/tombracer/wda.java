/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wda extends vg implements lj, noa, gr {
    private la field_f;
    boolean field_k;
    private gpa field_g;
    fsa field_n;
    boolean field_i;
    private gpa field_h;
    static String field_m;
    static String field_l;
    boolean field_j;

    final la c(boolean param0) {
        if (!param0) {
            return (la) null;
        }
        return this.field_f;
    }

    public final boolean a(int param0) {
        if (param0 >= -49) {
            return false;
        }
        return this.field_k;
    }

    public final fsa f(byte param0) {
        int var2 = 73 / ((-32 - param0) / 50);
        return this.field_n;
    }

    void a(kh param0, byte param1) {
        param0.a((byte) 61, this.c(1), 6);
        if (param1 > -78) {
            return;
        }
        try {
            param0.a((byte) -126, !this.field_k ? 0 : 1, 1);
            param0.a((byte) 107, !this.field_i ? 0 : 1, 1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "wda.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        if (param0 == 87) {
          if (null != this.field_n) {
            if (this.field_j) {
              return true;
            } else {
              return false;
            }
          } else {
            stackIn_11_0 = 1;
            return stackIn_11_0 != 0;
          }
        } else {
          field_m = (String) null;
          if (null == this.field_n) {
            return true;
          } else {
            L0: {
              if (!this.field_j) {
                stackIn_5_0 = 0;
                break L0;
              } else {
                stackIn_5_0 = 1;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    void a(boolean param0, byte param1, ui param2, ui param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 != null) {
                this.field_h = param2.a(-75, param0);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param3 != null) {
                this.field_g = param3.a(-47, false);
                break L2;
              } else {
                break L2;
              }
            }
            if (param1 <= -106) {
              break L0;
            } else {
              this.b((byte) -110);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("wda.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
        }
    }

    public void m(int param0) {
        int var2;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        if (this.field_i) {
          return;
        } else {
          L0: {
            stackIn_3_0 = this;

            if (this.field_k) {
              stackIn_4_0 = this;
              stackIn_4_1 = 0;
              break L0;
            } else {
              stackIn_4_0 = this;
              stackIn_4_1 = 1;
              break L0;
            }
          }
          ((wda) (this)).field_k = stackIn_4_1 != 0;
          var2 = -124 / ((param0 - 28) / 49);
          return;
        }
    }

    final int b(int param0, int param1) {
        if (param0 != 0) {
            this.field_k = false;
            return wma.a((byte) 8, 4, param1);
        }
        return wma.a((byte) 8, 4, param1);
    }

    final int d(byte param0) {
        if (param0 >= -43) {
            this.a(-18, true);
            return this.field_n.O(80);
        }
        return this.field_n.O(80);
    }

    void c(byte param0) {
        if (param0 > -116) {
            this.field_k = false;
        }
    }

    abstract void b(int param0);

    abstract int c(int param0);

    abstract void b(byte param0);

    public static void d(int param0) {
        field_l = null;
        field_m = null;
        if (param0 != 12072) {
            wda.d(-112);
        }
    }

    final int a(int param0, boolean param1) {
        if (param1) {
            this.field_f = (la) null;
            return ji.a(param0, 122, 4);
        }
        return ji.a(param0, 122, 4);
    }

    wda(la param0, kh param1, boolean param2) {
        this(param0, param2);
        RuntimeException var4 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              stackIn_3_0 = this;

              if (param1.b((byte) 44, 1) != 1) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            ((wda) (this)).field_k = stackIn_4_1 != 0;
            if (-23 >= (param0.field_E ^ -1)) {
              L2: {
                stackIn_8_0 = this;

                if (-2 != (param1.b((byte) 44, 1) ^ -1)) {
                  stackIn_9_0 = this;
                  stackIn_9_1 = 0;
                  break L2;
                } else {
                  stackIn_9_0 = this;
                  stackIn_9_1 = 1;
                  break L2;
                }
              }
              ((wda) (this)).field_i = stackIn_9_1 != 0;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("wda.<init>(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ',' + param2 + ')');
        }
    }

    abstract int a(int param0, int param1);

    final lj a(boolean param0, int param1, int param2) {
        if (param1 == 1) {
          if (!vh.a(param2, param0, -27201, (lj) (this))) {
            return null;
          } else {
            return (lj) (this);
          }
        } else {
          this.field_j = false;
          if (!vh.a(param2, param0, -27201, (lj) (this))) {
            return null;
          } else {
            return (lj) (this);
          }
        }
    }

    final void a(boolean param0, boolean param1) {
        if (this.field_i) {
            return;
        }
        this.field_k = param1 ? true : false;
        if (!param0) {
            this.field_j = false;
        }
    }

    public final gpa i(byte param0) {
        if (param0 != 84) {
            return (gpa) null;
        }
        return this.field_g;
    }

    public final gpa n(int param0) {
        if (param0 != 31974) {
            wda.d(-9);
            return this.field_h;
        }
        return this.field_h;
    }

    final int a(boolean param0) {
        if (param0) {
            field_m = (String) null;
            return this.field_n.o((byte) -124);
        }
        return this.field_n.o((byte) -124);
    }

    void a(int param0, fsa param1) {
        try {
            this.field_n = param1;
            if (param0 < 35) {
                this.i((byte) 25);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "wda.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final ew h(byte param0) {
        if (param0 < 105) {
            return (ew) null;
        }
        return (ew) ((Object) this.field_n.r(0));
    }

    final int b(boolean param0) {
        if (!param0) {
            this.field_i = true;
            return this.field_n.M(0);
        }
        return this.field_n.M(0);
    }

    wda(la param0, boolean param1) {
        this.field_k = true;
        this.field_i = false;
        this.field_j = false;
        ir discarded$0 = new ir();
        try {
            this.field_f = param0;
            this.a(param1, (byte) -119, param0.e(116), (ui) null);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "wda.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_m = "<%0> has declined the invitation.";
        field_l = "Concluded";
    }
}
