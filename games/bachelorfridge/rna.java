/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rna {
    private eaa field_c;
    static String field_b;
    static String[] field_a;
    private bw field_d;

    final bw c(byte param0) {
        bw var2;
        var2 = this.field_c.field_g.field_e;
        if (param0 >= 118) {
          if (var2 == this.field_c.field_g) {
            this.field_d = null;
            return null;
          } else {
            this.field_d = var2.field_e;
            return var2;
          }
        } else {
          return (bw) null;
        }
    }

    final bw a(byte param0) {
        bw var2;
        if (param0 == 0) {
          var2 = this.field_d;
          if (this.field_c.field_g == var2) {
            this.field_d = null;
            return null;
          } else {
            this.field_d = var2.field_b;
            return var2;
          }
        } else {
          return (bw) null;
        }
    }

    final bw b(byte param0) {
        bw var2;
        int var3;
        var3 = 30 / ((param0 - -47) / 53);
        var2 = this.field_c.field_g.field_b;
        if (var2 == this.field_c.field_g) {
          this.field_d = null;
          return null;
        } else {
          this.field_d = var2.field_b;
          return var2;
        }
    }

    final static boolean b(int param0) {
        long var1;
        long var3;
        int var5;
        int var6;
        var6 = BachelorFridge.field_y;
        if (param0 == 7) {
          var1 = f.b((byte) 73);
          var3 = -pla.field_g + var1;
          if (30000L >= var3) {
            L0: {
              var5 = 3000;
              if (qla.field_f >= 7) {
                var5 = 12000;
                break L0;
              } else {
                if (-6 < (qla.field_f ^ -1)) {
                  if ((qla.field_f ^ -1) > -4) {
                    break L0;
                  } else {
                    var5 = 6000;
                    if (((long)var5 ^ -1L) > (var3 ^ -1L)) {
                      qla.field_f = qla.field_f + 1;
                      pla.field_g = var1;
                      return true;
                    } else {
                      return false;
                    }
                  }
                } else {
                  var5 = 9000;
                  if (((long)var5 ^ -1L) <= (var3 ^ -1L)) {
                    return false;
                  } else {
                    qla.field_f = qla.field_f + 1;
                    pla.field_g = var1;
                    return true;
                  }
                }
              }
            }
            if (((long)var5 ^ -1L) > (var3 ^ -1L)) {
              qla.field_f = qla.field_f + 1;
              pla.field_g = var1;
              return true;
            } else {
              return false;
            }
          } else {
            pla.field_g = var1;
            qla.field_f = 0;
            return true;
          }
        } else {
          return true;
        }
    }

    public static void a(int param0) {
        if (param0 != 7) {
            return;
        }
        field_b = null;
        field_a = null;
    }

    final bw d(byte param0) {
        bw var2 = this.field_d;
        if (param0 != -124) {
            return (bw) null;
        }
        if (!(this.field_c.field_g != var2)) {
            this.field_d = null;
            return null;
        }
        this.field_d = var2.field_e;
        return var2;
    }

    final bw a(bw param0, byte param1) {
        bw var3 = null;
        RuntimeException var3_ref = null;
        bw stackIn_2_0 = null;
        Object stackIn_8_0 = null;
        bw stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -86) {
              L1: {
                if (param0 == null) {
                  var3 = this.field_c.field_g.field_e;
                  break L1;
                } else {
                  var3 = param0;
                  break L1;
                }
              }
              if (var3 != this.field_c.field_g) {
                this.field_d = var3.field_e;
                stackIn_10_0 = (bw) (var3);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                this.field_d = null;
                stackIn_8_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (bw) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("rna.D(");

            if (param0 == null) {
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
          throw pe.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (bw) ((Object) stackIn_8_0);
          } else {
            return stackIn_10_0;
          }
        }
    }

    final bw a(int param0, bw param1) {
        bw var3 = null;
        RuntimeException var3_ref = null;
        bw stackIn_5_0 = null;
        Object stackIn_9_0 = null;
        bw stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                var3 = this.field_c.field_g.field_b;
                break L1;
              } else {
                var3 = param1;
                break L1;
              }
            }
            if (param0 == 6000) {
              if (var3 == this.field_c.field_g) {
                this.field_d = null;
                stackIn_9_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                this.field_d = var3.field_b;
                stackIn_11_0 = (bw) (var3);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_5_0 = (bw) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("rna.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (bw) ((Object) stackIn_9_0);
          } else {
            return stackIn_11_0;
          }
        }
    }

    rna(eaa param0) {
        try {
            this.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "rna.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Offer unrated rematch";
    }
}
