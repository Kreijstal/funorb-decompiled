/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jpa extends rna implements ntb {
    private int field_b;
    static dja field_c;
    static boolean field_a;
    private int field_d;

    final ucb a(pe param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 != 26964) {
              this.a(-98, -31);
              stackIn_3_0 = null;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("jpa.I(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return (ucb) ((Object) stackIn_3_0);
    }

    final void a(pe param0, boolean param1, int param2, int param3) {
        RuntimeException var5 = null;
        pe var6 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (-1 == (param2 ^ -1)) {
                this.field_b = param3;
                if (-1 < (this.field_b ^ -1)) {
                  this.field_b = 0;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                this.field_d = (param3 + 2) % 2;
                break L1;
              }
            }
            if (!param1) {
              break L0;
            } else {
              var6 = (pe) null;
              this.a((pe) null, false, 39, -42);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("jpa.K(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int[] param1, rsb param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        tv var8 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            if (param1 == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 == 1) {
                  break L1;
                } else {
                  var8 = (tv) null;
                  this.a((byte) 94, (tv) null);
                  break L1;
                }
              }
              var4_int = 0;
              L2: while (true) {
                if (param1.length <= var4_int) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var5 = 1;
                  var6 = this.field_d;
                  if (-1 == (var6 ^ -1)) {
                    var5 = 1;
                    param2.field_e.a((byte) -93, var5, this.field_b);
                    var4_int++;
                    continue L2;
                  } else {
                    if (1 != var6) {
                      param2.field_e.a((byte) -93, var5, this.field_b);
                      var4_int++;
                      continue L2;
                    } else {
                      var5 = -1;
                      param2.field_e.a((byte) -93, var5, this.field_b);
                      var4_int++;
                      continue L2;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4);

            stackIn_19_1 = new StringBuilder().append("jpa.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
            super.a(param0, param1);
            this.field_b = param0.i(0, 8);
            this.field_d = param0.i(0, 1);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "jpa.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        jpa var4 = (jpa) ((Object) param1);
        jpa var3 = var4;
        super.b((byte) 90, param1);
        if (param0 < 54) {
            return;
        }
        try {
            var4.field_d = this.field_d;
            var4.field_b = this.field_b;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "jpa.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        if (!param0) {
            jpa.b(127);
        }
    }

    final String a(int param0) {
        int var3;
        int var4;
        String var5;
        String var6;
        String var7;
        String var8;
        String var9;
        String var10;
        var4 = VoidHunters.field_G;
        if (param0 == -1325) {
          var8 = "Unknown mode";
          var3 = this.field_d;
          if (var3 != 0) {
            if ((var3 ^ -1) != -2) {
              return var8 + " custom variable " + this.field_b;
            } else {
              var10 = "Subtract 1 from";
              return var10 + " custom variable " + this.field_b;
            }
          } else {
            var9 = "Add 1 to";
            return var9 + " custom variable " + this.field_b;
          }
        } else {
          jpa.a(true);
          var5 = "Unknown mode";
          var3 = this.field_d;
          if (var3 != 0) {
            if ((var3 ^ -1) != -2) {
              return var5 + " custom variable " + this.field_b;
            } else {
              var7 = "Subtract 1 from";
              return var7 + " custom variable " + this.field_b;
            }
          } else {
            var6 = "Add 1 to";
            return var6 + " custom variable " + this.field_b;
          }
        }
    }

    public final void b(faa param0, int param1) {
        try {
            super.b(param0, -116);
            param0.a(-632, this.field_b, 8);
            if (param1 >= -109) {
                field_c = (dja) null;
            }
            param0.a(-632, this.field_d, 1);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "jpa.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean b(int param0) {
        long var1;
        long var3;
        int var5;
        int var6;
        var6 = VoidHunters.field_G;
        var1 = wt.a(false);
        if (param0 == 7) {
          var3 = -pkb.field_o + var1;
          if (30000L >= var3) {
            var5 = 3000;
            if (nkb.field_q < 7) {
              if (nkb.field_q < 5) {
                if (3 <= nkb.field_q) {
                  var5 = 6000;
                  if (var3 > (long)var5) {
                    nkb.field_q = nkb.field_q + 1;
                    pkb.field_o = var1;
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  if (var3 > (long)var5) {
                    nkb.field_q = nkb.field_q + 1;
                    pkb.field_o = var1;
                    return true;
                  } else {
                    return false;
                  }
                }
              } else {
                var5 = 9000;
                if (var3 > (long)var5) {
                  nkb.field_q = nkb.field_q + 1;
                  pkb.field_o = var1;
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              var5 = 12000;
              if (var3 > (long)var5) {
                nkb.field_q = nkb.field_q + 1;
                pkb.field_o = var1;
                return true;
              } else {
                return false;
              }
            }
          } else {
            pkb.field_o = var1;
            nkb.field_q = 0;
            return true;
          }
        } else {
          return true;
        }
    }

    public final void a(tv param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        faa var5 = null;
        jpa var6 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a(param0, -67);
              var6 = (jpa) ((Object) param0);
              var4 = 0;
              if (param1 <= -19) {
                break L1;
              } else {
                var5 = (faa) null;
                this.a((faa) null, false);
                break L1;
              }
            }
            L2: {
              if (this.field_b == var6.field_b) {
                break L2;
              } else {
                System.out.println("int index has changed. before=" + var6.field_b + ", now=" + this.field_b);
                var4 = 1;
                break L2;
              }
            }
            L3: {
              if (var6.field_d == this.field_d) {
                break L3;
              } else {
                var4 = 1;
                System.out.println("int mode has changed. before=" + var6.field_d + ", now=" + this.field_d);
                break L3;
              }
            }
            if (var4 == 0) {
              break L0;
            } else {
              System.out.println("This instance of MissionActionAddNodeInfo has changed");
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("jpa.F(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        jpa var3 = null;
        int var4 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              L2: {
                var3 = (jpa) ((Object) param1);
                var4 = 67 % ((22 - param0) / 59);
                if (super.a((byte) 92, param1)) {
                  break L2;
                } else {
                  if (this.field_b != var3.field_b) {
                    break L2;
                  } else {
                    if (var3.field_d == this.field_d) {
                      stackIn_6_0 = 0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackIn_6_0 = 1;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3_ref);

            stackIn_9_1 = new StringBuilder().append("jpa.C(").append(param0).append(',');

            if (param1 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0 != 0;
    }

    jpa() {
    }

    final int a(int param0, int param1) {
        pe var4;
        if (param1 < -100) {
          if (-1 == (param0 ^ -1)) {
            return this.field_b;
          } else {
            return this.field_d;
          }
        } else {
          var4 = (pe) null;
          this.a((pe) null, 85);
          if (-1 == (param0 ^ -1)) {
            return this.field_b;
          } else {
            return this.field_d;
          }
        }
    }

    jpa(int param0, int param1) {
        this.field_d = param1;
        this.field_b = param0;
    }

    static {
        field_c = (dja) ((Object) new csb());
    }
}
