/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rua extends ij implements tsa {
    static String field_jb;
    static String field_hb;
    static jea field_gb;
    private mr field_fb;
    private boolean field_eb;
    private boolean field_ib;

    public final void a(int param0, int param1, rj param2, int param3, byte param4) {
        if (param4 < 44) {
            jua var7 = (jua) null;
            this.a(-122, true, (jua) null);
        }
        if (!(!this.field_ib)) {
            gl.a(true, false, (byte) 101);
            return;
        }
        try {
            qr.d(-7694);
            this.i((byte) 13);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "rua.M(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    rua(jta param0, mr param1) {
        super(param0, ft.field_c, dsa.field_d, false, false);
        try {
            this.field_fb = param1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "rua.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void h(boolean param0) {
        this.a(7, param0, doa.a(qp.field_v, 248, (byte) 114));
    }

    final static String a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            var3 = 114 % ((param1 - 34) / 44);
            L1: while (true) {
              if (var2_int >= 4) {
                stackIn_8_0 = "Learn to spell";
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!rf.field_c[var2_int].equalsIgnoreCase(param0)) {
                  var2_int++;
                  continue L1;
                } else {
                  er.b(1, var2_int);
                  stackIn_5_0 = "Playing track " + param0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var2);

            stackIn_11_1 = new StringBuilder().append("rua.MB(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_8_0;
        }
    }

    public static void g(boolean param0) {
        field_jb = null;
        if (param0) {
            field_hb = (String) null;
        }
        field_hb = null;
        field_gb = null;
    }

    private final void a(int param0, boolean param1, jua param2) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        sr var5 = null;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_eb = true;
              if (!param2.field_e) {
                if (param2.field_c == null) {
                  var4 = param2.field_b;
                  if (param2.field_f != 248) {
                    break L1;
                  } else {
                    L2: {
                      if (param1) {
                        break L2;
                      } else {
                        jp.a(false);
                        break L2;
                      }
                    }
                    this.field_ib = true;
                    var4 = qp.field_v;
                    break L1;
                  }
                } else {
                  var4 = qma.field_f;
                  if (this.field_fb != null) {
                    this.field_fb.a(10000536);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                var4 = jo.field_K;
                break L1;
              }
            }
            var5 = new sr((ij) (this), ft.field_c, var4);
            if (param0 == 7) {
              L3: {
                if (param2.field_e) {
                  if (!param2.field_a) {
                    var5.a(aua.field_d, (byte) -102, (qc) (this));
                    break L3;
                  } else {
                    this.a(param0 ^ 86, new pg((rua) (this)));
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  L4: {
                    if (!this.field_ib) {
                      if (param2.field_f != 5) {
                        var5.a(sm.field_o, -1, 40);
                        break L4;
                      } else {
                        var5.a(sba.field_n, 11, 102);
                        var5.a(nj.field_q, 17, 59);
                        break L4;
                      }
                    } else {
                      var5.a(aua.field_d, (byte) -102, (qc) (this));
                      break L4;
                    }
                  }
                  if (param2.field_f != 3) {
                    if (-7 != (param2.field_f ^ -1)) {
                      break L3;
                    } else {
                      var5.a(vf.field_a, 9, -126);
                      break L3;
                    }
                  } else {
                    var5.a(tca.field_M, 7, 58);
                    break L3;
                  }
                }
              }
              this.a(param0 + 80, var5);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var4_ref);

            stackIn_31_1 = new StringBuilder().append("rua.OB(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L5;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
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

    final static ha a(boolean param0, d param1, cn param2, java.awt.Canvas param3, int param4) {
        RuntimeException var5 = null;
        long var6 = 0L;
        kda var8 = null;
        jaggl.OpenGL var9 = null;
        ha stackIn_8_0 = null;
        kda stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (mja.a((byte) -50)) {
              if (in.a("jaggl", 480)) {
                var9 = new jaggl.OpenGL();
                var6 = var9.init(param3, 8, 8, 8, 24, 0, param4);
                if (-1L != (var6 ^ -1L)) {
                  if (param0) {
                    var8 = new kda(var9, param3, var6, param1, param2, param4);
                    var8.K(-74);
                    stackIn_10_0 = (kda) (var8);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    stackIn_8_0 = (ha) null;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                } else {
                  throw new RuntimeException("");
                }
              } else {
                throw new RuntimeException("");
              }
            } else {
              throw new RuntimeException("");
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("rua.AA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_20_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          return (ha) ((Object) stackIn_10_0);
        }
    }

    final boolean a(int param0) {
        jua var2 = null;
        if (this.field_B) {
            if (!(this.field_eb)) {
                var2 = dqa.a(3239);
                if (var2 != null) {
                    this.a(7, false, var2);
                }
            }
        }
        if (param0 < 126) {
            this.field_fb = (mr) null;
        }
        return super.a(127);
    }

    static {
        field_hb = "Mobile Lindemann totems";
        field_jb = "Breaking real-world laws";
    }
}
