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
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_8_0 = null;
        String stackOut_3_0 = null;
        String stackOut_5_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            var3 = 114 % ((param1 - 34) / 44);
            L1: while (true) {
              L2: {
                if (var2_int >= 4) {
                  stackOut_8_0 = "Learn to spell";
                  stackIn_9_0 = stackOut_8_0;
                  break L2;
                } else {
                  stackOut_3_0 = rf.field_c[var2_int];
                  stackIn_9_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var4 != 0) {
                    break L2;
                  } else {
                    if (!((String) (Object) stackIn_4_0).equalsIgnoreCase(param0)) {
                      var2_int++;
                      continue L1;
                    } else {
                      er.b(1, var2_int);
                      stackOut_5_0 = "Playing track " + param0;
                      stackIn_6_0 = stackOut_5_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var2);
            stackOut_10_1 = new StringBuilder().append("rua.MB(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_6_0;
        }
    }

    public static void g(boolean param0) {
        field_jb = null;
        if (param0) {
            field_hb = (String) null;
            field_hb = null;
            field_gb = null;
            return;
        }
        field_hb = null;
        field_gb = null;
    }

    private final void a(int param0, boolean param1, jua param2) {
        rj discarded$2 = null;
        rj discarded$3 = null;
        RuntimeException var4 = null;
        String var4_ref = null;
        sr var5 = null;
        int var6 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                this.field_eb = true;
                if (!param2.field_e) {
                  break L2;
                } else {
                  var4_ref = jo.field_K;
                  if (var6 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param2.field_c == null) {
                  break L3;
                } else {
                  var4_ref = qma.field_f;
                  if (this.field_fb != null) {
                    this.field_fb.a(10000536);
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              var4_ref = param2.field_b;
              if (param2.field_f != 248) {
                break L1;
              } else {
                L4: {
                  if (param1) {
                    break L4;
                  } else {
                    jp.a(false);
                    break L4;
                  }
                }
                this.field_ib = true;
                var4_ref = qp.field_v;
                break L1;
              }
            }
            var5 = new sr((ij) (this), ft.field_c, var4_ref);
            if (param0 == 7) {
              L5: {
                L6: {
                  if (param2.field_e) {
                    break L6;
                  } else {
                    L7: {
                      L8: {
                        if (!this.field_ib) {
                          break L8;
                        } else {
                          discarded$2 = var5.a(aua.field_d, (byte) -102, (qc) (this));
                          if (var6 == 0) {
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                      if (param2.field_f != 5) {
                        var5.a(sm.field_o, -1, 40);
                        break L7;
                      } else {
                        var5.a(sba.field_n, 11, 102);
                        var5.a(nj.field_q, 17, 59);
                        if (var6 == 0) {
                          break L7;
                        } else {
                          var5.a(sm.field_o, -1, 40);
                          break L7;
                        }
                      }
                    }
                    L9: {
                      if (param2.field_f != 3) {
                        break L9;
                      } else {
                        var5.a(tca.field_M, 7, 58);
                        if (var6 == 0) {
                          break L5;
                        } else {
                          break L9;
                        }
                      }
                    }
                    if (-7 != (param2.field_f ^ -1)) {
                      break L5;
                    } else {
                      var5.a(vf.field_a, 9, -126);
                      if (var6 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                if (!param2.field_a) {
                  discarded$3 = var5.a(aua.field_d, (byte) -102, (qc) (this));
                  break L5;
                } else {
                  this.a(param0 ^ 86, new pg((rua) (this)));
                  decompiledRegionSelector0 = 1;
                  break L0;
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
          L10: {
            var4 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) (var4);
            stackOut_34_1 = new StringBuilder().append("rua.OB(").append(param0).append(',').append(param1).append(',');
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param2 == null) {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L10;
            } else {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L10;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ')');
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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        kda stackOut_9_0 = null;
        ha stackOut_7_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
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
                    stackOut_9_0 = (kda) (var8);
                    stackIn_10_0 = stackOut_9_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    stackOut_7_0 = (ha) null;
                    stackIn_8_0 = stackOut_7_0;
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
            stackOut_11_0 = (RuntimeException) (var5);
            stackOut_11_1 = new StringBuilder().append("rua.AA(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          L2: {
            stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          L3: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param4 + ')');
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
          if (!this.field_eb) {
            var2 = dqa.a(3239);
            if (var2 == null) {
              if (param0 < 126) {
                this.field_fb = (mr) null;
                return super.a(127);
              } else {
                return super.a(127);
              }
            } else {
              this.a(7, false, var2);
              if (param0 < 126) {
                this.field_fb = (mr) null;
                return super.a(127);
              } else {
                return super.a(127);
              }
            }
          } else {
            if (param0 >= 126) {
              return super.a(127);
            } else {
              this.field_fb = (mr) null;
              return super.a(127);
            }
          }
        } else {
          if (param0 < 126) {
            this.field_fb = (mr) null;
            return super.a(127);
          } else {
            return super.a(127);
          }
        }
    }

    static {
        field_hb = "Mobile Lindemann totems";
        field_jb = "Breaking real-world laws";
    }
}
