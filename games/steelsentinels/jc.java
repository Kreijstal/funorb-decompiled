/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc {
    static String field_j;
    static boolean field_k;
    private ul field_h;
    static int field_f;
    private ck field_a;
    static String field_i;
    static boolean field_d;
    static gk[] field_c;
    static wk field_b;
    static String field_e;
    static String field_g;

    final ck a(int param0, ck param1) {
        ck var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        ck stackIn_8_0 = null;
        ck stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                var3 = this.field_h.field_e.field_i;
                break L1;
              } else {
                var3 = param1;
                break L1;
              }
            }
            if (this.field_h.field_e != var3) {
              this.field_a = var3.field_i;
              if (param0 == 24192) {
                stackIn_10_0 = (ck) (var3);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_8_0 = (ck) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              this.field_a = null;
              stackIn_5_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("jc.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ck) ((Object) stackIn_5_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    final ck b(int param0) {
        ck var2 = null;
        if (param0 != 2) {
            ck var3 = (ck) null;
            this.a(-4, (ck) null);
            var2 = this.field_h.field_e.field_k;
            if (!(var2 != this.field_h.field_e)) {
                this.field_a = null;
                return null;
            }
            this.field_a = var2.field_k;
            return var2;
        }
        var2 = this.field_h.field_e.field_k;
        if (!(var2 != this.field_h.field_e)) {
            this.field_a = null;
            return null;
        }
        this.field_a = var2.field_k;
        return var2;
    }

    final static String b(byte param0) {
        if (!pg.field_A) {
          if (si.field_m >= ik.field_c) {
            if (ik.field_c + ni.field_c <= si.field_m) {
              if (param0 == -122) {
                return null;
              } else {
                field_j = (String) null;
                return null;
              }
            } else {
              return rc.field_b;
            }
          } else {
            if (param0 == -122) {
              return null;
            } else {
              field_j = (String) null;
              return null;
            }
          }
        } else {
          if (param0 == -122) {
            return null;
          } else {
            field_j = (String) null;
            return null;
          }
        }
    }

    final static boolean a(int param0) {
        int stackIn_8_0 = 0;
        int stackIn_20_0 = 0;
        if (param0 == 2) {
          if (an.field_i == null) {
            if (!fk.a(0)) {
              if (n.field_x == null) {
                if (a.a(false)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackIn_20_0 = 1;
                return stackIn_20_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          field_c = (gk[]) null;
          if (an.field_i == null) {
            if (!fk.a(0)) {
              if (n.field_x == null) {
                if (a.a(false)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackIn_8_0 = 1;
                return stackIn_8_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    jc(ul param0) {
        try {
            this.field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "jc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final ck d(int param0) {
        ck var2;
        if (param0 == 2) {
          var2 = this.field_a;
          if (this.field_h.field_e == var2) {
            this.field_a = null;
            return null;
          } else {
            this.field_a = var2.field_k;
            return var2;
          }
        } else {
          return (ck) null;
        }
    }

    final static void a(byte param0) {
        nm.field_n = null;
        dj.field_j = null;
        vl.field_r = false;
        oc.field_d = null;
        a.field_g = null;
        if (param0 != -2) {
            jc.b((byte) 42);
        }
    }

    final ck c(int param0) {
        ck var2 = null;
        if (param0 != 2) {
            this.field_h = (ul) null;
            var2 = this.field_h.field_e.field_i;
            if (!(var2 != this.field_h.field_e)) {
                this.field_a = null;
                return null;
            }
            this.field_a = var2.field_i;
            return var2;
        }
        var2 = this.field_h.field_e.field_i;
        if (!(var2 != this.field_h.field_e)) {
            this.field_a = null;
            return null;
        }
        this.field_a = var2.field_i;
        return var2;
    }

    final ck a(boolean param0) {
        ck var2 = null;
        if (!param0) {
            jc.a(-87);
            var2 = this.field_a;
            if (!(this.field_h.field_e != var2)) {
                this.field_a = null;
                return null;
            }
            this.field_a = var2.field_i;
            return var2;
        }
        var2 = this.field_a;
        if (!(this.field_h.field_e != var2)) {
            this.field_a = null;
            return null;
        }
        this.field_a = var2.field_i;
        return var2;
    }

    final ck a(boolean param0, ck param1) {
        ck var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        ck stackIn_8_0 = null;
        ck stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                var3 = this.field_h.field_e.field_k;
                break L1;
              } else {
                var3 = param1;
                break L1;
              }
            }
            if (this.field_h.field_e != var3) {
              this.field_a = var3.field_k;
              if (!param0) {
                stackIn_10_0 = (ck) (var3);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_8_0 = (ck) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              this.field_a = null;
              stackIn_5_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("jc.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ck) ((Object) stackIn_5_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    public static void e(int param0) {
        field_i = null;
        if (param0 != 5370) {
          field_d = false;
          field_j = null;
          field_b = null;
          field_g = null;
          field_e = null;
          field_c = null;
          return;
        } else {
          field_j = null;
          field_b = null;
          field_g = null;
          field_e = null;
          field_c = null;
          return;
        }
    }

    static {
        field_j = "Movement and Navigation";
        field_f = 2;
        field_k = false;
        field_e = "RESIGNED";
        field_i = "Return to Main Menu";
        field_g = "Your ignore list is full. Max of 100 hit.";
    }
}
