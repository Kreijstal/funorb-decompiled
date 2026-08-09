/*
 * Decompiled by CFR-JS 0.4.0.
 */
class si extends al implements n {
    private pk field_rb;
    static sd field_ob;
    private boolean field_mb;
    private hm field_kb;
    static String field_hb;
    static cm field_nb;
    private boolean field_qb;
    private boolean field_jb;
    static boolean field_gb;
    static byte[] field_ib;
    private boolean field_lb;
    static String field_pb;

    final void l(int param0) {
        this.field_kb.a(4210752, -7062047, 2121792);
        oi var2 = new oi((si) (this), this.field_rb, field_pb);
        var2.a(15, ib.field_bb, (byte) 121);
        int var3 = 93 % ((param0 - -44) / 51);
        this.a(var2, -42);
    }

    final void a(boolean param0, String param1, int param2) {
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        oi stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        oi stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        String stackIn_16_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        oi var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        oi var6 = null;
        var5 = Terraphoenix.field_V;
        try {
          L0: {
            if (this.field_lb) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                stackIn_6_0 = this;

                if (!param0) {
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
                ((si) (this)).field_lb = stackIn_7_1 != 0;
                stackIn_9_0 = this;

                if (256 != param2) {
                  stackIn_10_0 = this;
                  stackIn_10_1 = 0;
                  break L2;
                } else {
                  stackIn_10_0 = this;
                  stackIn_10_1 = 1;
                  break L2;
                }
              }
              L3: {
                ((si) (this)).field_jb = stackIn_10_1 != 0;
                this.field_kb.a(4210752, -7062047, 8405024);
                var6 = new oi((si) (this), this.field_rb, param1);
                var4 = var6;
                if (param2 != 5) {
                  if (-257 == (param2 ^ -1)) {
                    var6.a((byte) 23, (sc) (this), rb.field_c);
                    break L3;
                  } else {
                    L4: {
                      stackIn_15_0 = (oi) (var6);

                      stackIn_15_1 = -1;

                      if (this.field_qb) {
                        stackIn_16_0 = (oi) ((Object) stackIn_15_0);
                        stackIn_16_1 = stackIn_15_1;
                        stackIn_16_2 = rb.field_c;
                        break L4;
                      } else {
                        stackIn_16_0 = (oi) ((Object) stackIn_15_0);
                        stackIn_16_1 = stackIn_15_1;
                        stackIn_16_2 = gd.field_b;
                        break L4;
                      }
                    }
                    ((oi) (Object) stackIn_16_0).a(stackIn_16_1, stackIn_16_2, (byte) 70);
                    break L3;
                  }
                } else {
                  var6.a(11, hf.field_u, (byte) -84);
                  var6.a(17, ed.field_c, (byte) -58);
                  break L3;
                }
              }
              L5: {
                if (-4 != (param2 ^ -1)) {
                  if ((param2 ^ -1) != -5) {
                    if ((param2 ^ -1) == -7) {
                      var6.a(9, fc.field_b, (byte) -111);
                      break L5;
                    } else {
                      if (param2 != 9) {
                        break L5;
                      } else {
                        var6.a((byte) 23, (sc) (this), ec.field_c);
                        break L5;
                      }
                    }
                  } else {
                    var6.a(8, pl.field_V, (byte) 57);
                    break L5;
                  }
                } else {
                  var6.a(7, mi.field_i, (byte) -51);
                  break L5;
                }
              }
              this.a(var6, -108);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var4_ref);

            stackIn_30_1 = new StringBuilder().append("si.A(").append(param0).append(',');

            if (param1 == null) {
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
          throw qk.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public void a(eb param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6_int = 37 / ((-5 - param4) / 57);
          if (!this.field_jb) {
            nl.a((byte) 8, "tochangedisplayname.ws", dg.a(false));
            return;
          } else {
            bm.a(3, (byte) 1);
            this.h((byte) -126);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var6 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var6);

            stackIn_6_1 = new StringBuilder().append("si.I(");

            if (param0 == null) {
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
          throw qk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(char param0, gl param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
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
            if (param3 != 13) {
              L1: {
                if (param2 == 30) {
                  break L1;
                } else {
                  si.n(16);
                  break L1;
                }
              }
              stackIn_6_0 = super.a(param0, param1, 30, param3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.h((byte) -126);
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("si.K(").append(param0).append(',');

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
          throw qk.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0;
        }
    }

    final static void m(int param0) {
        bm.a(17, (byte) 1);
        if (param0 > -54) {
            field_gb = false;
        }
    }

    public static void n(int param0) {
        field_ob = null;
        field_hb = null;
        field_nb = null;
        if (param0 != 8) {
          field_ob = (sd) null;
          field_pb = null;
          field_ib = null;
          return;
        } else {
          field_pb = null;
          field_ib = null;
          return;
        }
    }

    final static boolean o(int param0) {
        if (param0 == 10) {
          if (null != cl.field_J) {
            if (null == cl.field_J.c(true)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_nb = (cm) null;
          if (null != cl.field_J) {
            if (null == cl.field_J.c(true)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    si(d param0, pk param1, String param2, boolean param3, boolean param4) {
        super(param0, new oi((si) null, param1, param2), 77, 10, 10);
        try {
            this.field_qb = param3 ? true : false;
            this.field_jb = false;
            this.field_mb = param4 ? true : false;
            this.field_lb = false;
            this.field_rb = param1;
            this.field_kb = new hm(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_kb.field_P = true;
            this.b((byte) 95, this.field_kb);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "si.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(String param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 3) {
                break L1;
              } else {
                si.n(13);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("si.N(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final void h(byte param0) {
        if (!this.field_J) {
          return;
        } else {
          this.field_J = false;
          if (this.field_qb) {
            nd.a(25);
            if (param0 != -126) {
              this.field_jb = false;
              return;
            } else {
              return;
            }
          } else {
            if (this.field_mb) {
              jl.i((byte) -124);
              if (param0 == -126) {
                return;
              } else {
                this.field_jb = false;
                return;
              }
            } else {
              if (param0 == -126) {
                return;
              } else {
                this.field_jb = false;
                return;
              }
            }
          }
        }
    }

    static {
        field_nb = new cm(0);
        field_ib = null;
        field_pb = "Connection restored.";
    }
}
