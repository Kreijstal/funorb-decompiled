/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me implements ch {
    static String field_e;
    private int field_d;
    static String field_b;
    private fa field_j;
    static String field_c;
    static sf field_k;
    static String field_a;
    static String field_f;
    private int field_h;
    static int[] field_i;
    static dd field_g;

    public final void a(int param0, int param1, boolean param2, qa param3, int param4) {
        int stackIn_7_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 < -36) {
                break L1;
              } else {
                field_g = (dd) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (param3.field_x) {
                  break L3;
                } else {
                  if (param3.e(1)) {
                    break L3;
                  } else {
                    stackIn_7_0 = 2188450;
                    break L2;
                  }
                }
              }
              stackIn_7_0 = 3249872;
              break L2;
            }
            var6_int = stackIn_7_0;
            this.field_j.a("<u=" + Integer.toString(var6_int, 16) + ">" + param3.field_i + "</u>", param1 + param3.field_y, param4 + param3.field_z, param3.field_u, param3.field_j, var6_int, -1, this.field_h, this.field_d, this.field_j.field_H + this.field_j.field_K);
            if (param3.e(1)) {
              L4: {
                L5: {
                  var7 = this.field_j.b(param3.field_i);
                  var8 = this.field_j.field_H + this.field_j.field_K;
                  var9 = param3.field_y + param1;
                  var10 = param4 + param3.field_z;
                  if (-3 != (this.field_h ^ -1)) {
                    break L5;
                  } else {
                    var9 = var9 + (param3.field_u - var7);
                    if (var11 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                if ((this.field_h ^ -1) != -2) {
                  break L4;
                } else {
                  var9 = var9 + (-var7 + param3.field_u >> -1626499839);
                  break L4;
                }
              }
              L6: {
                L7: {
                  if (2 == this.field_d) {
                    break L7;
                  } else {
                    if ((this.field_d ^ -1) != -2) {
                      break L6;
                    } else {
                      var10 = var10 + (param3.field_j + -var8 >> 229519201);
                      if (var11 == 0) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                var10 = var10 + (-var8 + param3.field_j);
                break L6;
              }
              ek.a(var8, var9 - 2, 2 + var10, 1, var7 - -4);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var6);

            stackIn_21_1 = new StringBuilder().append("me.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L8;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L8;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param4 + ')');
        }
    }

    final static void a(java.applet.Applet param0, int param1, String param2, boolean param3) {
        try {
            java.net.MalformedURLException var4 = null;
            RuntimeException var4_ref = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            String stackIn_13_2 = null;
            StringBuilder stackIn_15_1 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  if (!ce.field_d.startsWith("win")) {
                    break L1;
                  } else {
                    if (ld.a(122, param2)) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (param1 < -39) {
                    break L2;
                  } else {
                    field_g = (dd) null;
                    break L2;
                  }
                }
                try {
                  L3: {
                    param0.getAppletContext().showDocument(new java.net.URL(param2), "_blank");
                    break L3;
                  }
                } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
                  ud.a("MGR1: " + param2, (Throwable) null, 0);
                  return;
                }
                return;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_12_0 = (RuntimeException) (var4_ref);

                stackIn_12_1 = new StringBuilder().append("me.E(");

                if (param0 == null) {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackIn_13_2 = "null";
                  break L4;
                } else {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackIn_13_2 = "{...}";
                  break L4;
                }
              }
              L5: {


                stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "null";
                  break L5;
                } else {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "{...}";
                  break L5;
                }
              }
              throw pf.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param3 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static dd[] b(int param0) {
        int var1 = 0;
        dd[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        byte[] var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = fleas.field_A ? 1 : 0;
                    var1 = -93 / ((param0 - -66) / 37);
                    var2 = new dd[ef.field_l];
                    var3 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (ef.field_l <= var3) {
                        statePc = 11;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var4 = ij.field_H[var3] * ob.field_a[var3];
                    var10 = of.field_d[var3];
                    var6 = new int[var4];
                    stackIn_12_0 = 0;
                    stackIn_3_0 = stackIn_12_0;
                    if (var8 != 0) {
                        statePc = 12;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var7 = stackIn_3_0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (var4 <= var7) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var6[var7] = rd.field_d[sc.a((int) var10[var7], 255)];
                    var7++;
                    if (var8 != 0) {
                        statePc = 10;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (var8 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var2[var3] = new dd(e.field_e, uf.field_k, vg.field_I[var3], b.field_b[var3], ij.field_H[var3], ob.field_a[var3], var6);
                    var3++;
                    statePc = 10;
                    continue stateLoop;
                }
                case 9: {
                    var2[var3] = new dd(e.field_e, uf.field_k, vg.field_I[var3], b.field_b[var3], ij.field_H[var3], ob.field_a[var3], var6);
                    var3++;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (var8 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    stackIn_12_0 = -28210;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    c.o(stackIn_12_0);
                    return var2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1, boolean param2) {
        w.field_l = param0;
        mf.field_c = param1;
        vk.field_L = 1;
        if (param2) {
            field_g = (dd) null;
        }
    }

    public me() {
        this.field_j = ug.field_e;
        this.field_h = 1;
        this.field_d = 1;
    }

    public static void a(int param0) {
        field_b = null;
        field_i = null;
        field_e = null;
        field_f = null;
        field_c = null;
        field_k = null;
        field_g = null;
        if (param0 != 4283) {
          return;
        } else {
          field_a = null;
          return;
        }
    }

    me(fa param0, int param1, int param2) {
        try {
            this.field_h = param1;
            this.field_d = param2;
            this.field_j = param0;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "me.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_e = "Orb coins: <%0>";
        field_c = "Invalid password.";
        field_a = "Player Name: ";
        field_f = "Age:";
        field_i = new int[4];
    }
}
