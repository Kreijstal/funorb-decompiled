/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ka extends ma {
    static String field_M;
    private vj field_Q;
    static String field_O;
    static af field_P;
    static pl field_N;

    final bl g(byte param0) {
        rd var2;
        bl var3;
        int var4;
        L0: {
          var4 = client.field_A ? 1 : 0;
          var2 = new rd(this.field_Q);
          var3 = (bl) ((Object) var2.a((byte) 71));
          if (param0 <= -73) {
            break L0;
          } else {
            ka.h((byte) 44);
            break L0;
          }
        }
        L1: while (true) {
          if (var3 != null) {
            if (var3.field_S) {
              return var3;
            } else {
              var3 = (bl) ((Object) var2.a(-93));
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final void c(boolean param0) {
        int var4 = client.field_A ? 1 : 0;
        if (!param0) {
            field_O = (String) null;
        }
        rd var2 = new rd(this.field_Q);
        bl var3 = (bl) ((Object) var2.a((byte) 71));
        while (var3 != null) {
            var3.field_S = false;
            var3 = (bl) ((Object) var2.a(-48));
        }
        this.field_L = null;
    }

    final static int a(byte param0, int param1, Random param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 <= 0) {
              throw new IllegalArgumentException();
            } else {
              if (!pe.a(922790152, param1)) {
                L1: {
                  if (param0 >= 42) {
                    break L1;
                  } else {
                    field_N = (pl) null;
                    break L1;
                  }
                }
                var3_int = -(int)(4294967296L % (long)param1) + -2147483648;
                L2: while (true) {
                  var4 = param2.nextInt();
                  if (var3_int > var4) {
                    stackIn_12_0 = oi.a(param1, 105, var4);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    continue L2;
                  }
                }
              } else {
                stackIn_5_0 = (int)(((long)param2.nextInt() & 4294967295L) * (long)param1 >> -627379424);
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("ka.S(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_12_0;
        }
    }

    public ka() {
        super(0, 0, cf.field_f, vd.field_n, (gl) null, (kg) null);
        this.field_Q = new vj();
    }

    final static void a(boolean param0, int param1) {
        int var2;
        int var3;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0;
        int stackIn_14_1;
        int stackIn_14_2;
        int stackIn_14_3;
        int stackIn_14_4;
        int stackIn_14_5;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        int stackIn_16_4 = 0;
        int stackIn_16_5 = 0;
        int stackIn_16_6 = 0;
        int stackIn_18_7;
        boolean stackIn_18_8;
        int stackIn_18_9;
        int stackIn_18_10;
        int stackIn_19_7;
        boolean stackIn_19_8;
        int stackIn_19_9;
        int stackIn_19_10;
        int stackIn_19_11;
        L0: {
          sb.c((byte) 123);
          if (hh.field_a == tc.field_Tb) {
            gn.b(param1 + -26499);
            break L0;
          } else {
            L1: {
              if (cd.field_m != null) {
                if (km.b(cd.field_m.field_rc, -8222)) {
                  stackIn_7_0 = 1;
                  break L1;
                } else {
                  stackIn_7_0 = 0;
                  break L1;
                }
              } else {
                stackIn_7_0 = 0;
                break L1;
              }
            }
            L2: {
              var2 = stackIn_7_0;
              if (hh.field_a == null) {
                stackIn_10_0 = 0;
                break L2;
              } else {
                stackIn_10_0 = 1;
                break L2;
              }
            }
            L3: {
              L4: {
                var3 = stackIn_10_0;
                stackIn_14_0 = 0;

                stackIn_14_1 = 1;

                stackIn_14_2 = 14;

                stackIn_14_3 = 11;

                stackIn_14_4 = 13;

                stackIn_14_5 = jk.field_c;

                if (fm.field_b) {
                  break L4;
                } else {

                  if (fa.field_n) {
                    break L4;
                  } else {












                    if (var3 == 0) {
                      stackIn_16_0 = stackIn_14_0;
                      stackIn_16_1 = stackIn_14_1;
                      stackIn_16_2 = stackIn_14_2;
                      stackIn_16_3 = stackIn_14_3;
                      stackIn_16_4 = stackIn_14_4;
                      stackIn_16_5 = stackIn_14_5;
                      stackIn_16_6 = 0;
                      break L3;
                    } else {






                      break L4;
                    }
                  }
                }
              }
              stackIn_16_0 = stackIn_14_0;
              stackIn_16_1 = stackIn_14_1;
              stackIn_16_2 = stackIn_14_2;
              stackIn_16_3 = stackIn_14_3;
              stackIn_16_4 = stackIn_14_4;
              stackIn_16_5 = stackIn_14_5;
              stackIn_16_6 = 1;
              break L3;
            }
            L5: {














              stackIn_18_7 = 15;

              stackIn_18_8 = param0;

              stackIn_18_9 = 1;

              stackIn_18_10 = var2;

              if (50 >= pm.field_g) {







                stackIn_19_7 = stackIn_18_7;
                stackIn_19_8 = stackIn_18_8;
                stackIn_19_9 = stackIn_18_9;
                stackIn_19_10 = stackIn_18_10;
                stackIn_19_11 = 0;
                break L5;
              } else {







                stackIn_19_7 = stackIn_18_7;
                stackIn_19_8 = stackIn_18_8;
                stackIn_19_9 = stackIn_18_9;
                stackIn_19_10 = stackIn_18_10;
                stackIn_19_11 = 1;
                break L5;
              }
            }
            lk.a(stackIn_16_0, stackIn_16_1 != 0, stackIn_16_2, stackIn_16_3, stackIn_16_4, stackIn_16_5, stackIn_16_6 != 0, stackIn_19_7, stackIn_19_8, stackIn_19_9 != 0, stackIn_19_10 != 0, stackIn_19_11 != 0);
            break L0;
          }
        }
        if (param1 == -3051) {
          L6: {
            if (sn.field_g) {
              jb.a((byte) 126, uj.field_g);
              sn.field_g = false;
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (gm.field_I) {
              we.field_b.f(58, -4);
              gm.field_I = false;
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            if (nh.field_a) {
              we.field_b.f(10, -4);
              nh.field_a = false;
              break L8;
            } else {
              break L8;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void g(int param0) {
        int var4 = client.field_A ? 1 : 0;
        if (param0 != 0) {
            field_O = (String) null;
        }
        rd var2 = new rd(this.field_Q);
        bl var3 = (bl) ((Object) var2.a((byte) 71));
        while (var3 != null) {
            if (!(!var3.h((byte) 39))) {
                var3.b((byte) 124);
            }
            var3 = (bl) ((Object) var2.a(param0 + -70));
        }
        this.field_L = (ce) ((Object) this.g((byte) -87));
    }

    public static void h(byte param0) {
        field_N = null;
        field_O = null;
        field_M = null;
        field_P = null;
        int var1 = 99 % ((-85 - param0) / 40);
    }

    final ce a(int param0) {
        rd var2;
        bl var3;
        int var4;
        var4 = client.field_A ? 1 : 0;
        var2 = new rd(this.field_Q);
        if (param0 == 14) {
          var3 = (bl) ((Object) var2.a((byte) 71));
          L0: while (true) {
            if (var3 != null) {
              if (!var3.field_S) {
                var3 = (bl) ((Object) var2.a(-93));
                continue L0;
              } else {
                return var3.e((byte) -74);
              }
            } else {
              return null;
            }
          }
        } else {
          return (ce) null;
        }
    }

    final void f(byte param0) {
        int var4 = client.field_A ? 1 : 0;
        if (param0 != -66) {
            field_P = (af) null;
        }
        rd var2 = new rd(this.field_Q);
        bl var3 = (bl) ((Object) var2.a((byte) 71));
        while (var3 != null) {
            if (var3.f((byte) 110)) {
                var3.b((byte) 120);
            }
            var3 = (bl) ((Object) var2.a(param0 ^ 8));
        }
    }

    final void a(byte param0, ce param1) {
        bl var3 = null;
        try {
            if (!(param1 instanceof bl)) {
                throw new IllegalArgumentException();
            }
            if (param0 > -104) {
                ce var4 = (ce) null;
                this.a((byte) -72, (ce) null);
            }
            var3 = (bl) ((Object) param1);
            this.field_Q.b(var3, 7143);
            var3.field_S = true;
            var3.a(false, (ce) (this));
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "ka.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var7 = client.field_A ? 1 : 0;
        if (null != this.field_p) {
            this.field_p.a(true, param0, param3, (byte) -100, (ce) (this));
        }
        rd var5 = new rd(this.field_Q);
        if (param1 > -103) {
            return;
        }
        ce var6 = (ce) ((Object) var5.a(true));
        while (var6 != null) {
            var6.a(param0 + this.field_u, -116, param2, this.field_D + param3);
            var6 = (ce) ((Object) var5.d(2078965185));
        }
    }

    static {
        field_M = "CHALLENGE!";
        field_O = "Members' Benefits";
    }
}
