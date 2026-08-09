/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ik implements Iterator {
    static boolean field_j;
    static mh field_a;
    private ji field_e;
    private int field_d;
    static tq field_g;
    private nm field_h;
    private nm field_k;
    static mh[] field_i;
    static jp[] field_f;
    static String[] field_b;
    static jp field_c;

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    private final void b(int param0) {
        this.field_d = 1;
        this.field_h = this.field_e.field_d[0].field_e;
        if (param0 > -71) {
            return;
        }
        this.field_k = null;
    }

    public final boolean hasNext() {
        nm[] fieldTemp$4 = null;
        int fieldTemp$5 = 0;
        int var2;
        var2 = BrickABrac.field_J ? 1 : 0;
        if (this.field_h == this.field_e.field_d[this.field_d - 1]) {
          L0: while (true) {
            if (this.field_e.field_c <= this.field_d) {
              return false;
            } else {
              fieldTemp$4 = this.field_e.field_d;
              fieldTemp$5 = this.field_d;
              this.field_d = this.field_d + 1;
              if (fieldTemp$4[fieldTemp$5].field_e != this.field_e.field_d[this.field_d + -1]) {
                this.field_h = this.field_e.field_d[this.field_d + -1].field_e;
                return true;
              } else {
                this.field_h = this.field_e.field_d[this.field_d - 1];
                continue L0;
              }
            }
          }
        } else {
          return true;
        }
    }

    public final Object next() {
        nm[] fieldTemp$0 = null;
        int fieldTemp$1 = 0;
        nm var1 = null;
        int var2 = BrickABrac.field_J ? 1 : 0;
        if (this.field_h != this.field_e.field_d[-1 + this.field_d]) {
            var1 = this.field_h;
            this.field_h = var1.field_e;
            this.field_k = var1;
            return var1;
        }
        do {
            if (this.field_d >= this.field_e.field_c) {
                return null;
            }
            fieldTemp$0 = this.field_e.field_d;
            fieldTemp$1 = this.field_d;
            this.field_d = this.field_d + 1;
            var1 = fieldTemp$0[fieldTemp$1].field_e;
        } while (this.field_e.field_d[this.field_d + -1] == var1);
        this.field_h = var1.field_e;
        this.field_k = var1;
        return var1;
    }

    final static boolean a(boolean param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (!param0) {
            break L0;
          } else {
            field_g = (tq) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == eq.field_g) {
              break L2;
            } else {
              if (q.field_i != rf.field_b) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static int a(int param0, gb param1) {
        int var2_int = 0;
        int var3 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = cn.field_d;
              if (-3 != (param1.field_c ^ -1)) {
                if (-5 != (param1.field_c ^ -1)) {
                  if ((param1.field_k ^ -1L) != (oc.field_p ^ -1L)) {
                    var2_int = r.field_C[param1.field_c];
                    break L1;
                  } else {
                    var2_int = ki.field_i[param1.field_c];
                    break L1;
                  }
                } else {
                  var2_int = r.field_C[param1.field_c];
                  break L1;
                }
              } else {
                if (!param1.field_e) {
                  L2: {
                    if (param1.field_f != 0) {
                      break L2;
                    } else {
                      if (param1.field_d == 0) {
                        var2_int = ki.field_i[param1.field_c];
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var2_int = r.field_C[param1.field_c];
                  break L1;
                } else {
                  var2_int = cn.field_d;
                  break L1;
                }
              }
            }
            if (param0 == -31126) {
              stackIn_18_0 = var2_int;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_16_0 = -27;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var2);

            stackIn_21_1 = new StringBuilder().append("ik.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L3;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_16_0;
        } else {
          return stackIn_18_0;
        }
    }

    public final void remove() {
        if (this.field_k == null) {
            throw new IllegalStateException();
        }
        this.field_k.b((byte) 111);
        this.field_k = null;
    }

    final static boolean a(int param0) {
        bg var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        bg var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var5 = (bg) ((Object) mf.field_i.d(-78));
            var1 = var5;
            if (var1 == null) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var2 = 0;
              var3 = -90 / ((param0 - -28) / 50);
              L1: while (true) {
                if (var2 >= var1.field_s) {
                  stackIn_17_0 = 1;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  L2: {
                    if (var5.field_j[var2] == null) {
                      break L2;
                    } else {
                      if (0 != var5.field_j[var2].field_f) {
                        break L2;
                      } else {
                        stackIn_10_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                  L3: {
                    if (var5.field_l[var2] == null) {
                      break L3;
                    } else {
                      if (var5.field_l[var2].field_f != 0) {
                        break L3;
                      } else {
                        stackIn_14_0 = 0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  }
                  var2++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var1_ref), "ik.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              return stackIn_17_0 != 0;
            }
          }
        }
    }

    public static void c(int param0) {
        if (param0 > -8) {
            return;
        }
        field_g = null;
        field_f = null;
        field_i = null;
        field_b = null;
        field_c = null;
        field_a = null;
    }

    final static boolean a(byte param0, char param1) {
        int stackIn_9_0 = 0;
        L0: {
          if (param0 == -9) {
            break L0;
          } else {
            ik.a((byte) -124, 'V');
            break L0;
          }
        }
        L1: {
          L2: {
            if (param1 == 160) {
              break L2;
            } else {
              if (param1 == 32) {
                break L2;
              } else {
                if (param1 == 95) {
                  break L2;
                } else {
                  if (param1 != 45) {
                    stackIn_9_0 = 0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          stackIn_9_0 = 1;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    ik(ji param0) {
        this.field_k = null;
        try {
            this.field_e = param0;
            this.b(-101);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "ik.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_j = false;
    }
}
