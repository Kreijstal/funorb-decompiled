/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class cf implements Iterator {
    private gp field_c;
    private sr field_e;
    private gp field_d;
    static String field_b;
    static volatile int field_a;

    final static cr a(boolean param0) {
        if (!param0) {
            return (cr) null;
        }
        return pp.f(-126);
    }

    final static boolean a(int param0, int param1, int param2) {
        if (param0 == 31077) {
          if ((de.field_f ^ -1) == -14) {
            on.a(9110);
            return true;
          } else {
            if (-103 == (de.field_f ^ -1)) {
              ji.field_n.a((byte) 34);
              return true;
            } else {
              if (ji.field_n != null) {
                if (!ji.field_n.a(param1, false, param2)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            }
          }
        } else {
          return true;
        }
    }

    final static void a(int param0, int param1, int param2, byte param3) {
        if (param3 >= 47) {
          L0: {
            if (param0 != 0) {
              break L0;
            } else {
              if (rm.field_B != param1) {
                rm.field_B = param1;
                dc.field_B = true;
                jm.d(1, param2);
                break L0;
              } else {
                if (-2 == (param0 ^ -1)) {
                  L1: {
                    if (param1 != oa.field_p) {
                      oa.field_p = param1;
                      dc.field_B = true;
                      jm.d(1, param2);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  if (2 == param0) {
                    if (param1 != mf.field_b) {
                      mf.field_b = param1;
                      dc.field_B = true;
                      jm.d(1, param2);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  if (2 == param0) {
                    if (param1 == mf.field_b) {
                      return;
                    } else {
                      mf.field_b = param1;
                      dc.field_B = true;
                      jm.d(1, param2);
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
          }
          L2: {
            if (-2 != (param0 ^ -1)) {
              break L2;
            } else {
              if (param1 != oa.field_p) {
                oa.field_p = param1;
                dc.field_B = true;
                jm.d(1, param2);
                break L2;
              } else {
                if (2 == param0) {
                  if (param1 == mf.field_b) {
                    return;
                  } else {
                    mf.field_b = param1;
                    dc.field_B = true;
                    jm.d(1, param2);
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
          if (2 == param0) {
            if (param1 == mf.field_b) {
              return;
            } else {
              mf.field_b = param1;
              dc.field_B = true;
              jm.d(1, param2);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public final void remove() {
        if (null == this.field_c) {
            throw new IllegalStateException();
        }
        this.field_c.a(-105);
        this.field_c = null;
    }

    public static void a(int param0) {
        int var1 = 21 / ((36 - param0) / 55);
        field_b = null;
    }

    final static int a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 > 68) {
              stackOut_3_0 = li.a(10, true, param1, true);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = -31;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("cf.D(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final Object next() {
        gp var1 = this.field_d;
        if (this.field_e.field_b == var1) {
            this.field_d = null;
            var1 = null;
        } else {
            this.field_d = var1.field_p;
        }
        this.field_c = var1;
        return var1;
    }

    final static int a(int param0, CharSequence param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3_int = 83 % ((param2 - 8) / 48);
            stackOut_0_0 = li.a(param0, true, param1, true);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var3);
            stackOut_2_1 = new StringBuilder().append("cf.F(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    public final boolean hasNext() {
        return this.field_e.field_b != this.field_d;
    }

    cf(sr param0) {
        this.field_c = null;
        try {
            this.field_e = param0;
            this.field_c = null;
            this.field_d = this.field_e.field_b.field_p;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "cf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = 0;
        field_b = "Your request to join has been declined.";
    }
}
