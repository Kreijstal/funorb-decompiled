/*
 * Decompiled by CFR-JS 0.4.0.
 */
class gk extends ca implements vn {
    static String field_Db;
    static boolean field_Ib;
    private boolean field_Fb;
    private boolean field_Ab;
    private mm field_Bb;
    private r field_xb;
    static byte[][] field_yb;
    static int[] field_Cb;
    static w field_Hb;
    static String field_Gb;
    private boolean field_Eb;
    private boolean field_zb;

    final void n(int param0) {
        int var2;
        if (this.field_S) {
          this.field_S = false;
          var2 = 6 % ((-68 - param0) / 51);
          if (!this.field_Ab) {
            if (!this.field_Eb) {
              return;
            } else {
              ai.h(-73);
              return;
            }
          } else {
            qf.a(true);
            return;
          }
        } else {
          return;
        }
    }

    final void o(int param0) {
        this.field_xb.a(param0, 4088, 2121792);
        dj var2 = new dj((gk) (this), this.field_Bb, fm.field_a);
        var2.a(mn.field_a, 15, param0 ^ 4210766);
        this.c(var2, (byte) 51);
    }

    final static int c(int param0, int param1, int param2) {
        if (param1 != param2) {
            return fc.field_b[param2];
        }
        if (!ll.a(param0, (byte) -96)) {
            return fc.field_b[param2];
        }
        return 29;
    }

    gk(ka param0, mm param1, String param2, boolean param3, boolean param4) {
        super(param0, new dj((gk) null, param1, param2), 77, 10, 10);
        try {
            this.field_Bb = param1;
            this.field_Ab = param3 ? true : false;
            this.field_zb = false;
            this.field_Fb = false;
            this.field_Eb = param4 ? true : false;
            this.field_xb = new r(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_xb.field_L = true;
            this.b(this.field_xb, (byte) -55);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "gk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(w param0, boolean param1) {
        w var4 = null;
        w var5 = null;
        int var3 = client.field_A ? 1 : 0;
        try {
            var4 = (w) ((Object) param0.field_M.c((byte) -76));
            w var2 = var4;
            while (var4 != null) {
                var4.field_Ib = 0;
                var4.field_Mb = 0;
                var4.field_F = 0;
                var4.field_N = 0;
                var5 = (w) ((Object) param0.field_M.d(true));
                var5 = var5;
            }
            if (!param1) {
                field_yb = (byte[][]) null;
            }
            param0.field_Mb = 0;
            param0.field_Ib = 0;
            param0.field_F = 0;
            param0.field_N = 0;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "gk.IA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte param0, String param1, int param2) {
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        dj stackIn_14_0 = null;
        dj stackIn_15_0 = null;
        String stackIn_15_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        dj var6 = null;
        var5 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (param0 == 48) {
              if (!this.field_Fb) {
                L1: {
                  stackIn_7_0 = this;

                  if (256 != param2) {
                    stackIn_8_0 = this;
                    stackIn_8_1 = 0;
                    break L1;
                  } else {
                    stackIn_8_0 = this;
                    stackIn_8_1 = 1;
                    break L1;
                  }
                }
                L2: {
                  ((gk) (this)).field_zb = stackIn_8_1 != 0;
                  this.field_Fb = true;
                  this.field_xb.a(4210752, 4088, 8405024);
                  var6 = new dj((gk) (this), this.field_Bb, param1);
                  if (-6 != (param2 ^ -1)) {
                    if (-257 != (param2 ^ -1)) {
                      L3: {
                        stackIn_14_0 = (dj) (var6);

                        if (!this.field_Ab) {
                          stackIn_15_0 = (dj) ((Object) stackIn_14_0);
                          stackIn_15_1 = bl.field_X;
                          break L3;
                        } else {
                          stackIn_15_0 = (dj) ((Object) stackIn_14_0);
                          stackIn_15_1 = sh.field_c;
                          break L3;
                        }
                      }
                      ((dj) (Object) stackIn_15_0).a(stackIn_15_1, -1, 14);
                      break L2;
                    } else {
                      var6.a(116, sh.field_c, (kg) (this));
                      break L2;
                    }
                  } else {
                    var6.a(pb.field_e, 11, 14);
                    var6.a(ig.field_Tb, 17, param0 ^ 62);
                    break L2;
                  }
                }
                L4: {
                  if (3 != param2) {
                    if ((param2 ^ -1) != -5) {
                      if (6 != param2) {
                        if (-10 == (param2 ^ -1)) {
                          var6.a(127, pc.field_e, (kg) (this));
                          break L4;
                        } else {
                          break L4;
                        }
                      } else {
                        var6.a(vb.field_Y, 9, 14);
                        break L4;
                      }
                    } else {
                      var6.a(ai.field_U, 8, 14);
                      break L4;
                    }
                  } else {
                    var6.a(ce.field_z, 7, 14);
                    break L4;
                  }
                }
                this.c(var6, (byte) 84);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var4);

            stackIn_29_1 = new StringBuilder().append("gk.EA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L5;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param2 + ')');
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

    final static void a(int param0, int param1, byte param2, cc param3) {
        try {
            int var4_int = -111 % ((param2 - 41) / 38);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "gk.JA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0, int param1, ce param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 13) {
              this.n(63);
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var5_int = -15 / ((param0 - -22) / 49);
              stackIn_5_0 = super.a(123, param1, param2, param3);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("gk.QA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_5_0;
        }
    }

    public void a(byte param0, int param1, ek param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 67) {
              break L0;
            } else {
              this.field_Eb = true;
              break L0;
            }
          }
          if (!this.field_zb) {
            aj.a("tochangedisplayname.ws", param0 ^ -79, se.h(param0 ^ 25211));
            return;
          } else {
            hm.a(3, (byte) -124);
            this.n(-9);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var6);

            stackIn_8_1 = new StringBuilder().append("gk.H(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void p(int param0) {
        field_Gb = null;
        field_yb = (byte[][]) null;
        int var1 = 107 % ((-66 - param0) / 34);
        field_Db = null;
        field_Cb = null;
        field_Hb = null;
    }

    static {
        field_Db = "Options";
        field_yb = new byte[50][];
        field_Cb = new int[4];
        field_Gb = "Quick Chat Help";
    }
}
