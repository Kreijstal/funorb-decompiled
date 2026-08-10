/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sq {
    static int[] field_a;
    static int field_b;
    al field_d;
    static no field_c;

    abstract int a(boolean param0);

    int e(int param0) {
        if (param0 <= 64) {
            this.field_d = (al) null;
        }
        return this.field_d.field_n;
    }

    final static boolean k(int param0) {
        if (param0 != 0) {
            String var2 = (String) null;
            sq.a((String[]) null, false, -52, (String) null);
        }
        return ie.a((byte) 28, hk.d(71));
    }

    void a(qe param0, boolean param1) {
        RuntimeException runtimeException = null;
        qe stackIn_3_0 = null;
        qe stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                param0.field_z = this.a(-1);
                stackIn_3_0 = (qe) (param0);

                if (0 != param0.field_u) {
                  break L2;
                } else {
                  stackIn_3_0 = (qe) ((Object) stackIn_3_0);

                  if (!this.a(param0.field_L, -35)) {
                    break L2;
                  } else {
                    stackIn_4_0 = (qe) ((Object) stackIn_3_0);
                    stackIn_4_1 = 1;
                    break L1;
                  }
                }
              }
              stackIn_4_0 = (qe) ((Object) stackIn_3_0);
              stackIn_4_1 = 0;
              break L1;
            }
            L3: {
              stackIn_4_0.field_E = stackIn_4_1 != 0;
              if (!param1) {
                break L3;
              } else {
                this.field_d = (al) null;
                break L3;
              }
            }
            param0.field_I = this.j(0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (runtimeException);

            stackIn_10_1 = new StringBuilder().append("sq.K(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    abstract int a(int param0);

    abstract int[] a(int param0, byte param1);

    abstract boolean a(int param0, byte param1, qe param2);

    abstract int i(int param0);

    abstract int b(int param0);

    void n(int param0) {
        if (param0 != 11828) {
            this.field_d = (al) null;
        }
    }

    abstract int h(int param0);

    final void l(int param0) {
        qe var2 = this.field_d.j(45);
        var2.field_u = this.b(-120);
        int var3 = -67 % ((param0 - -14) / 58);
        if (!(0 > var2.field_L)) {
            this.a(var2, false);
        }
    }

    abstract boolean c(qe param0, int param1);

    int c(int param0, int param1) {
        if (param0 >= -36) {
            sq.k(73);
        }
        return param1;
    }

    abstract boolean f(int param0);

    abstract byte b(int param0, int param1);

    public static void d(int param0) {
        field_a = null;
        if (param0 != 13) {
            String var2 = (String) null;
            sq.a((String[]) null, false, 81, (String) null);
        }
        field_c = null;
    }

    abstract dd b(qe param0, int param1);

    int m(int param0) {
        if (param0 != 0) {
            field_a = (int[]) null;
            return 0;
        }
        return 0;
    }

    final static void b(byte param0) {
        al.field_B = new tm[7];
        al.field_B[0] = (tm) ((Object) new mf());
        al.field_B[1] = (tm) ((Object) new vl());
        al.field_B[2] = (tm) ((Object) new jr());
        al.field_B[3] = (tm) ((Object) new to());
        if (param0 != 118) {
            sq.k(35);
        }
        al.field_B[4] = (tm) ((Object) new lm());
        al.field_B[5] = (tm) ((Object) new ac());
        al.field_B[6] = (tm) ((Object) new ul());
    }

    int a(qe param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = (1 + param0.field_L) % this.field_d.field_n;
            var4 = 1;
            L1: while (true) {
              L2: {
                if (var4 > this.field_d.field_n) {
                  break L2;
                } else {
                  L3: {
                    var3_int = (var4 + param0.field_L) % this.field_d.field_n;
                    if (!this.a((byte) -112, var3_int)) {
                      break L3;
                    } else {
                      if ((this.field_d.field_p & 1 << var3_int) == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var4++;
                  continue L1;
                }
              }
              L4: {
                if (param1 >= 82) {
                  break L4;
                } else {
                  field_b = 82;
                  break L4;
                }
              }
              stackIn_9_0 = var3_int;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("sq.I(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L5;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    abstract boolean a(int param0, int param1);

    final static int g(int param0) {
        if (param0 <= 107) {
            sq.k(-99);
        }
        return or.field_b;
    }

    final static void a(String[] args, boolean param1, int param2, String param3) {
        String[] var5 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] var4 = null;
        RuntimeException var4_ref = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                field_b = 100;
                break L1;
              }
            }
            L2: {
              pa.field_I = td.field_f;
              if ((param2 ^ -1) != -256) {
                L3: {
                  if ((param2 ^ -1) > -101) {
                    break L3;
                  } else {
                    if (-106 <= (param2 ^ -1)) {
                      var4 = args;
                      gf.a(92, var4);
                      uf.field_gb = jo.a(args, 57);
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                uf.field_gb = gg.a(param2, true, param3);
                break L2;
              } else {
                L4: {
                  if (j.field_b >= 13) {
                    stackIn_6_0 = 0;
                    break L4;
                  } else {
                    stackIn_6_0 = 1;
                    break L4;
                  }
                }
                uf.field_gb = ta.a(stackIn_6_0 != 0, -30914);
                var5 = (String[]) null;
                gf.a(108, (String[]) null);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4_ref);

            stackIn_15_1 = new StringBuilder().append("sq.S(");

            if (args == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
        }
    }

    abstract void c(int param0);

    sq(al param0) {
        try {
            this.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "sq.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    boolean a(byte param0, int param1) {
        int var3 = 35 % ((-16 - param0) / 46);
        return true;
    }

    void a(ge param0, boolean param1) {
        try {
            if (!param1) {
                this.a(-101);
            }
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "sq.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    String a(int param0, String[] param1) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        StringBuilder var4 = null;
        int var5 = 0;
        int var6 = 0;
        String stackIn_6_0 = null;
        String stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Pool.field_O;
        try {
          L0: {
            if (param0 < this.field_d.field_n) {
              if (-3 != (this.field_d.field_n ^ -1)) {
                var3_int = 0;
                var4_int = 0;
                L1: while (true) {
                  if (param1.length <= var4_int) {
                    var4 = new StringBuilder(var3_int);
                    var5 = 0;
                    L2: while (true) {
                      if (param1.length <= var5) {
                        stackIn_19_0 = var4.toString();
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        L3: {
                          if ((var5 ^ -1) < -1) {
                            discarded$2 = var4.append("<br>");
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        discarded$3 = var4.append(param1[var5]);
                        var5++;
                        continue L2;
                      }
                    }
                  } else {
                    L4: {
                      if (var4_int <= 0) {
                        break L4;
                      } else {
                        var3_int += 4;
                        break L4;
                      }
                    }
                    var3_int = var3_int + param1[var4_int].length();
                    var4_int++;
                    continue L1;
                  }
                }
              } else {
                stackIn_6_0 = nr.a(param1, param0 ^ -2, w.field_g);
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var3);

            stackIn_22_1 = new StringBuilder().append("sq.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_19_0;
        }
    }

    abstract int a(byte param0);

    int b(byte param0, int param1) {
        if (param0 >= -113) {
            field_a = (int[]) null;
        }
        return 1 << param1;
    }

    int j(int param0) {
        if (param0 != 0) {
            return 82;
        }
        return -1;
    }

    void a(int param0, int param1, int param2) {
        if (param1 != -1) {
            this.j(100);
        }
    }

    abstract boolean a(int param0, byte param1, int param2);

    abstract int a(qe param0, int param1);

    static {
        field_a = new int[4];
    }
}
