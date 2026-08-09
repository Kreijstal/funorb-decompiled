/*
 * Decompiled by CFR-JS 0.4.0.
 */
class pn extends fj implements qb {
    private boolean field_lb;
    private boolean field_ob;
    private boolean field_tb;
    static char[] field_nb;
    static tb field_pb;
    private wl field_sb;
    private boolean field_mb;
    private jm field_rb;
    static String[] field_qb;

    final void a(String param0, int param1, int param2) {
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        qi stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        qi stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        String stackIn_15_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        qi var6 = null;
        var5 = EscapeVector.field_A;
        try {
          L0: {
            if (this.field_mb) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                stackIn_6_0 = this;

                if (-257 != (param2 ^ -1)) {
                  stackIn_7_0 = this;
                  stackIn_7_1 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = this;
                  stackIn_7_1 = 1;
                  break L1;
                }
              }
              ((pn) (this)).field_tb = stackIn_7_1 != 0;
              if (param1 == -1) {
                L2: {
                  this.field_mb = true;
                  this.field_rb.a(4210752, 8405024, -127);
                  var6 = new qi((pn) (this), this.field_sb, param0);
                  if ((param2 ^ -1) != -6) {
                    if ((param2 ^ -1) == -257) {
                      var6.a((wn) (this), (byte) -67, sh.field_s);
                      break L2;
                    } else {
                      L3: {
                        stackIn_14_0 = (qi) (var6);

                        stackIn_14_1 = 0;

                        if (this.field_ob) {
                          stackIn_15_0 = (qi) ((Object) stackIn_14_0);
                          stackIn_15_1 = stackIn_14_1;
                          stackIn_15_2 = sh.field_s;
                          break L3;
                        } else {
                          stackIn_15_0 = (qi) ((Object) stackIn_14_0);
                          stackIn_15_1 = stackIn_14_1;
                          stackIn_15_2 = li.field_O;
                          break L3;
                        }
                      }
                      ((qi) (Object) stackIn_15_0).a(stackIn_15_1 != 0, stackIn_15_2, -1);
                      break L2;
                    }
                  } else {
                    var6.a(false, vc.field_i, 11);
                    var6.a(false, d.field_d, 17);
                    break L2;
                  }
                }
                L4: {
                  if (param2 != 3) {
                    if (-5 == (param2 ^ -1)) {
                      var6.a(false, ei.field_k, 8);
                      break L4;
                    } else {
                      if (6 != param2) {
                        if (9 == param2) {
                          var6.a((wn) (this), (byte) -67, lj.field_g);
                          break L4;
                        } else {
                          this.a(var6, 30);
                          return;
                        }
                      } else {
                        var6.a(false, ej.field_c, 9);
                        break L4;
                      }
                    }
                  } else {
                    var6.a(false, qk.field_a, 7);
                    break L4;
                  }
                }
                this.a(var6, 30);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var4);

            stackIn_30_1 = new StringBuilder().append("pn.MB(");

            if (param0 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L5;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L5;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static boolean p(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        Throwable decompiledCaughtException = null;
        var1_ref = ck.field_v;
        synchronized (var1_ref) {
          L0: {
            L1: {
              if (param0 < -66) {
                break L1;
              } else {
                field_nb = (char[]) null;
                break L1;
              }
            }
            if (ta.field_w != ve.field_l) {
              nk.field_n = td.field_b[ve.field_l];
              jc.field_c = ek.field_a[ve.field_l];
              ve.field_l = 127 & 1 + ve.field_l;
              stackIn_7_0 = 1;
              break L0;
            } else {
              stackIn_5_0 = 0;
              return stackIn_5_0 != 0;
            }
          }
        }
        return stackIn_7_0 != 0;
    }

    final void r(int param0) {
        int var3 = -15 / ((26 - param0) / 47);
        this.field_rb.a(4210752, 2121792, -127);
        qi var2 = new qi((pn) (this), this.field_sb, ni.field_K);
        var2.a(false, gj.field_u, 15);
        this.a(var2, 30);
    }

    public static void q(int param0) {
        field_nb = null;
        if (param0 != -5) {
            return;
        }
        field_qb = null;
        field_pb = null;
    }

    final static byte[][][] a(int[] param0, mf param1, byte[][][] param2, mf param3, byte param4) {
        RuntimeException var5 = null;
        byte[][][] stackIn_2_0 = null;
        byte[][][] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param4 > 53) {
              stackIn_4_0 = sl.a(param1, param3, param0, param2, 2, 0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (byte[][][]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("pn.J(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), stackIn_17_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final boolean a(hm param0, char param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 >= 0) {
              if ((param2 ^ -1) != -14) {
                stackIn_7_0 = super.a(param0, param1, param2, 117);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                this.o(-18861);
                stackIn_5_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("pn.G(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    public void a(hc param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 == 1) {
              if (!this.field_tb) {
                md.a(oc.d((byte) -85), (byte) -96, "tochangedisplayname.ws");
                return;
              } else {
                lj.a(3, param3 + 106);
                this.o(-18861);
                return;
              }
            } else {
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var6);

            stackIn_8_1 = new StringBuilder().append("pn.K(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void o(int param0) {
        if (!this.field_G) {
          return;
        } else {
          if (param0 == -18861) {
            this.field_G = false;
            if (!this.field_ob) {
              if (!this.field_lb) {
                return;
              } else {
                eb.k(0);
                return;
              }
            } else {
              jj.a(0);
              return;
            }
          } else {
            return;
          }
        }
    }

    pn(tb param0, wl param1, String param2, boolean param3, boolean param4) {
        super(param0, new qi((pn) null, param1, param2), 77, 10, 10);
        try {
            this.field_mb = false;
            this.field_lb = param4 ? true : false;
            this.field_tb = false;
            this.field_sb = param1;
            this.field_ob = param3 ? true : false;
            this.field_rb = new jm(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_rb.field_G = true;
            this.b(this.field_rb, false);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "pn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static byte[] a(int param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = param1.length;
            var3 = new byte[var2_int];
            qg.a(param1, param0, var3, 0, var2_int);
            stackIn_1_0 = (byte[]) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("pn.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    static {
        field_nb = new char[]{(char)91, (char)93, (char)35};
        field_qb = new String[]{"Fly the container out of the cave<br>and away from the asteroid.", "Fly the container out of the cave<br>and away from the moon.", "Fly the container out of the cave<br>and away from the planet."};
    }
}
