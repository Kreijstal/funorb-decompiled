/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe extends fj implements ij {
    private boolean field_ub;
    static String field_rb;
    private boolean field_nb;
    static ee field_qb;
    static String field_sb;
    static tr field_pb;
    private mk field_tb;
    static int[][] field_ob;
    static String field_vb;

    final static byte[] a(int param0, byte[] param1, int param2, mi param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var4_int = param3.c((byte) -96, param2);
            if (-1 != (var4_int ^ -1)) {
              L1: {
                L2: {
                  if (param1 == null) {
                    break L2;
                  } else {
                    if (param1.length == var4_int) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                param1 = new byte[var4_int];
                break L1;
              }
              L3: {
                var5 = param3.c((byte) -118, 3);
                if (param0 == 12635) {
                  break L3;
                } else {
                  field_qb = (ee) null;
                  break L3;
                }
              }
              L4: {
                var6 = (byte)param3.c((byte) -101, 8);
                if ((var5 ^ -1) >= -1) {
                  var7 = 0;
                  L5: while (true) {
                    if (var7 >= var4_int) {
                      break L4;
                    } else {
                      param1[var7] = (byte)var6;
                      var7++;
                      continue L5;
                    }
                  }
                } else {
                  var7 = 0;
                  L6: while (true) {
                    if (var7 >= var4_int) {
                      break L4;
                    } else {
                      param1[var7] = (byte)(param3.c((byte) -125, var5) + var6);
                      var7++;
                      continue L6;
                    }
                  }
                }
              }
              stackIn_18_0 = (byte[]) (param1);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("oe.SB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ')');
        }
        return stackIn_18_0;
    }

    public static void p(int param0) {
        field_qb = null;
        field_sb = null;
        field_vb = null;
        field_pb = null;
        field_ob = (int[][]) null;
        if (param0 != 12705) {
            oe.p(83);
        }
        field_rb = null;
    }

    final static boolean q(int param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 > 59) {
            break L0;
          } else {
            field_rb = (String) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == lo.field_k) {
              break L2;
            } else {
              if (bm.field_I != rg.field_d) {
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

    final void o(int param0) {
        this.a(fn.a(248, true, af.field_J), true, -120);
        if (param0 != 16614) {
            oe.q(56);
        }
    }

    final boolean j(int param0) {
        ch var2 = null;
        if (param0 != 17) {
            this.field_ub = false;
        }
        if (this.field_I && !this.field_nb) {
            var2 = ar.b(param0 ^ 17);
            if (!(var2 == null)) {
                this.a(var2, false, param0 ^ -64);
            }
        }
        return super.j(17);
    }

    private final void a(ch param0, boolean param1, int param2) {
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        rh var5 = null;
        int var6 = 0;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_nb = true;
              if (param2 < -45) {
                break L1;
              } else {
                field_pb = (tr) null;
                break L1;
              }
            }
            L2: {
              if (!param0.field_a) {
                if (param0.field_b == null) {
                  var4 = param0.field_j;
                  if (param0.field_h == 248) {
                    L3: {
                      if (param1) {
                        break L3;
                      } else {
                        mr.a(false);
                        break L3;
                      }
                    }
                    this.field_ub = true;
                    var4 = af.field_J;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  var4 = wa.field_g;
                  if (this.field_tb != null) {
                    this.field_tb.a(-4384);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              } else {
                var4 = dh.field_c;
                break L2;
              }
            }
            L4: {
              L5: {
                var5 = new rh((fj) (this), sg.field_a, var4);
                if (!param0.field_a) {
                  L6: {
                    if (!this.field_ub) {
                      if ((param0.field_h ^ -1) != -6) {
                        var5.a(ap.field_f, -1, -61);
                        break L6;
                      } else {
                        var5.a(jb.field_A, 11, -123);
                        var5.a(jd.field_b, 17, -50);
                        break L6;
                      }
                    } else {
                      var5.a(vi.field_x, (uf) (this), -116);
                      break L6;
                    }
                  }
                  if (param0.field_h == 3) {
                    var5.a(hb.field_o, 7, -33);
                    break L5;
                  } else {
                    if (param0.field_h == 6) {
                      var5.a(hm.field_H, 9, -26);
                      break L5;
                    } else {
                      this.a(false, var5);
                      break L4;
                    }
                  }
                } else {
                  if (!param0.field_i) {
                    var5.a(vi.field_x, (uf) (this), -110);
                    break L5;
                  } else {
                    this.a(false, new ue((oe) (this)));
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
              this.a(false, var5);
              break L4;
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4_ref = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var4_ref);

            stackIn_33_1 = new StringBuilder().append("oe.UA(");

            if (param0 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L7;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L7;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    oe(sd param0, mk param1) {
        super(param0, sg.field_a, ac.field_L, false, false);
        try {
            this.field_tb = param1;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "oe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, d param1, byte param2, int param3, int param4) {
        if (this.field_ub) {
            ak.a(true, false, 3);
            return;
        }
        try {
            fj.g((byte) -127);
            this.h((byte) 57);
            int var6_int = 112 % ((-63 - param2) / 51);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "oe.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_rb = "TAB - hide chat temporarily";
        field_ob = (int[][]) null;
        field_sb = "Unpacking sound effects";
        field_qb = new ee();
        field_vb = "Instructions";
    }
}
