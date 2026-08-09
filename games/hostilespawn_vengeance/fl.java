/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    static String field_b;
    private vl field_c;
    private am field_a;
    static String field_d;

    final am a(am param0, boolean param1) {
        am var3 = null;
        RuntimeException var3_ref = null;
        am stackIn_2_0 = null;
        Object stackIn_9_0 = null;
        am stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param1) {
              L1: {
                if (param0 == null) {
                  var3 = this.field_c.field_b.field_g;
                  break L1;
                } else {
                  var3 = param0;
                  break L1;
                }
              }
              if (this.field_c.field_b == var3) {
                this.field_a = null;
                stackIn_9_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                this.field_a = var3.field_g;
                stackIn_11_0 = (am) (var3);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_2_0 = (am) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("fl.A(");

            if (param0 == null) {
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
          throw wg.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (am) ((Object) stackIn_9_0);
          } else {
            return stackIn_11_0;
          }
        }
    }

    public static void a(byte param0) {
        if (param0 >= -25) {
            return;
        }
        field_b = null;
        field_d = null;
    }

    final static int d(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if ((sg.field_i ^ -1) > -51) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 < -60) {
                  break L1;
                } else {
                  fl.a((byte) 15);
                  break L1;
                }
              }
              var1_int = 1;
              L2: while (true) {
                if (pm.field_g.length <= var1_int) {
                  stackIn_14_0 = pm.field_g.length + -1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (pm.field_g[var1_int] <= vj.field_s) {
                    var1_int++;
                    continue L2;
                  } else {
                    stackIn_11_0 = -1 + var1_int;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1), "fl.H(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    final am a(boolean param0) {
        am var2;
        var2 = this.field_a;
        if (this.field_c.field_b != var2) {
          if (param0) {
            field_b = (String) null;
            this.field_a = var2.field_f;
            return var2;
          } else {
            this.field_a = var2.field_f;
            return var2;
          }
        } else {
          this.field_a = null;
          return null;
        }
    }

    final am a(int param0) {
        if (param0 != 0) {
            return (am) null;
        }
        am var2 = this.field_c.field_b.field_f;
        if (!(var2 != this.field_c.field_b)) {
            this.field_a = null;
            return null;
        }
        this.field_a = var2.field_f;
        return var2;
    }

    final am a(int param0, am param1) {
        am var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_7_0 = null;
        am stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                this.field_a = (am) null;
                break L1;
              }
            }
            L2: {
              if (param1 == null) {
                var3 = this.field_c.field_b.field_f;
                break L2;
              } else {
                var3 = param1;
                break L2;
              }
            }
            if (this.field_c.field_b != var3) {
              this.field_a = var3.field_f;
              stackIn_9_0 = (am) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.field_a = null;
              stackIn_7_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("fl.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (am) ((Object) stackIn_7_0);
        } else {
          return stackIn_9_0;
        }
    }

    final am c(int param0) {
        am var2;
        var2 = this.field_a;
        if (var2 != this.field_c.field_b) {
          if (param0 != 0) {
            field_d = (String) null;
            this.field_a = var2.field_g;
            return var2;
          } else {
            this.field_a = var2.field_g;
            return var2;
          }
        } else {
          this.field_a = null;
          return null;
        }
    }

    fl(vl param0) {
        try {
            this.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "fl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final am b(int param0) {
        am var2;
        var2 = this.field_c.field_b.field_g;
        if (this.field_c.field_b == var2) {
          this.field_a = null;
          return null;
        } else {
          if (param0 != 1) {
            return (am) null;
          } else {
            this.field_a = var2.field_g;
            return var2;
          }
        }
    }

    static {
        field_d = "Error connecting to server. Please try using a different server.";
    }
}
