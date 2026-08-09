/*
 * Decompiled by CFR-JS 0.4.0.
 */
class dg extends me implements qk {
    private ba field_ob;
    private boolean field_jb;
    static String field_sb;
    static String field_qb;
    private vm field_lb;
    static String field_rb;
    private boolean field_kb;
    private boolean field_mb;
    static String field_nb;
    static ji field_tb;
    private boolean field_pb;

    final void g(byte param0) {
        int var2;
        var2 = -74 % ((param0 - -80) / 36);
        if (this.field_F) {
          this.field_F = false;
          if (!this.field_kb) {
            if (this.field_pb) {
              pe.b(true);
              return;
            } else {
              return;
            }
          } else {
            ed.b(0);
            return;
          }
        } else {
          return;
        }
    }

    public static void q(int param0) {
        field_tb = null;
        field_rb = null;
        field_sb = null;
        if (param0 != -257) {
            return;
        }
        field_nb = null;
        field_qb = null;
    }

    public void a(int param0, int param1, int param2, ph param3, byte param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6_int = 60 / ((-63 - param4) / 52);
          if (this.field_mb) {
            g.a((byte) 62, 3);
            this.g((byte) -122);
            return;
          } else {
            ta.a(-320, "tochangedisplayname.ws", bn.c(-1));
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var6 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var6);

            stackIn_6_1 = new StringBuilder().append("dg.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L0;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L0;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param4 + ')');
        }
    }

    dg(gg param0, vm param1, String param2, boolean param3, boolean param4) {
        super(param0, new qi((dg) null, param1, param2), 77, 10, 10);
        try {
            this.field_mb = false;
            this.field_jb = false;
            this.field_pb = param4 ? true : false;
            this.field_kb = param3 ? true : false;
            this.field_lb = param1;
            this.field_ob = new ba(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_ob.field_E = true;
            this.a(51448, this.field_ob);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "dg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void p(int param0) {
        qi var2;
        String var3;
        this.field_ob.a(2121792, 4210752, -1);
        var2 = new qi((dg) (this), this.field_lb, id.field_l);
        if (param0 >= -33) {
          var3 = (String) null;
          this.a(117, -124, (String) null);
          var2.a(22770, 15, ui.field_h);
          this.b(var2, (byte) 110);
          return;
        } else {
          var2.a(22770, 15, ui.field_h);
          this.b(var2, (byte) 110);
          return;
        }
    }

    final boolean a(int param0, ag param1, int param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 274) {
                break L1;
              } else {
                this.g((byte) 92);
                break L1;
              }
            }
            if (param2 != 13) {
              stackIn_6_0 = super.a(274, param1, param2, param3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.g((byte) -116);
              stackIn_4_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("dg.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_6_0;
        }
    }

    final void a(int param0, int param1, String param2) {
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        qi stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        qi stackIn_15_0;
        int stackIn_15_1;
        int stackIn_15_2;
        String stackIn_15_3;
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
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (this.field_jb) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                this.field_jb = true;
                stackIn_6_0 = this;

                if ((param0 ^ -1) != -257) {
                  stackIn_7_0 = this;
                  stackIn_7_1 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = this;
                  stackIn_7_1 = 1;
                  break L1;
                }
              }
              L2: {
                ((dg) (this)).field_mb = stackIn_7_1 != 0;
                this.field_ob.a(8405024, 4210752, -1);
                if (param1 == 17) {
                  break L2;
                } else {
                  this.field_kb = false;
                  break L2;
                }
              }
              L3: {
                var6 = new qi((dg) (this), this.field_lb, param2);
                if (param0 != 5) {
                  if (-257 == (param0 ^ -1)) {
                    var6.a((mh) (this), hf.field_f, 30);
                    break L3;
                  } else {
                    L4: {
                      stackIn_14_0 = (qi) (var6);

                      stackIn_14_1 = param1 + 22753;

                      stackIn_14_2 = -1;

                      if (!this.field_kb) {
                        stackIn_15_0 = (qi) ((Object) stackIn_14_0);
                        stackIn_15_1 = stackIn_14_1;
                        stackIn_15_2 = stackIn_14_2;
                        stackIn_15_3 = hg.field_d;
                        break L4;
                      } else {
                        stackIn_15_0 = (qi) ((Object) stackIn_14_0);
                        stackIn_15_1 = stackIn_14_1;
                        stackIn_15_2 = stackIn_14_2;
                        stackIn_15_3 = hf.field_f;
                        break L4;
                      }
                    }
                    ((qi) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_15_2, stackIn_15_3);
                    break L3;
                  }
                } else {
                  var6.a(param1 + 22753, 11, im.field_b);
                  var6.a(22770, 17, sc.field_k);
                  break L3;
                }
              }
              L5: {
                if ((param0 ^ -1) != -4) {
                  if (-5 != (param0 ^ -1)) {
                    if (param0 == 6) {
                      var6.a(param1 + 22753, 9, wc.field_k);
                      break L5;
                    } else {
                      if ((param0 ^ -1) == -10) {
                        var6.a((mh) (this), md.field_j, 30);
                        break L5;
                      } else {
                        this.b(var6, (byte) 110);
                        return;
                      }
                    }
                  } else {
                    var6.a(param1 + 22753, 8, pe.field_gb);
                    break L5;
                  }
                } else {
                  var6.a(22770, 7, pf.field_N);
                  break L5;
                }
              }
              this.b(var6, (byte) 110);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var4);

            stackIn_30_1 = new StringBuilder().append("dg.CB(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L6;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L6;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_qb = "Waiting for extra data";
        field_nb = "Username: ";
        field_rb = "Waiting for levels";
        field_sb = "Unfortunately you are not eligible to create an account.";
    }
}
