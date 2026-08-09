/*
 * Decompiled by CFR-JS 0.4.0.
 */
class af extends ta implements qh {
    private ng field_kb;
    static int field_ob;
    private boolean field_qb;
    static int field_jb;
    private boolean field_lb;
    private boolean field_nb;
    private ee field_pb;
    private boolean field_mb;

    final void d(boolean param0) {
        this.field_kb.a(0, 4210752, 2121792);
        ui var2 = new ui((af) (this), this.field_pb, dg.field_E);
        var2.a(sh.field_h, 15, -14);
        if (param0) {
            lk var3 = (lk) null;
            this.a('9', (byte) -80, 48, (lk) null);
        }
        this.c(var2, (byte) 110);
    }

    final boolean a(char param0, byte param1, int param2, lk param3) {
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
              if (param1 < -99) {
                break L1;
              } else {
                this.d(true);
                break L1;
              }
            }
            if (13 != param2) {
              stackIn_6_0 = super.a(param0, (byte) -106, param2, param3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.s(-122);
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

            stackIn_9_1 = new StringBuilder().append("af.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw ma.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_6_0;
        }
    }

    public void a(int param0, int param1, int param2, hl param3, int param4) {
        try {
            if (this.field_qb) {
                gh.a(3, 31888);
                this.s(13);
            } else {
                pa.a(mk.g(-125), "tochangedisplayname.ws", -61);
            }
            int var6_int = -72 % ((-62 - param1) / 32);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "af.I(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static int a(int param0, boolean param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Main.field_T;
        try {
          L0: {
            var3_int = 0;
            var4 = qe.field_E;
            L1: while (true) {
              if (var3_int >= me.field_a.length) {
                L2: {
                  if (param1) {
                    break L2;
                  } else {
                    field_ob = -30;
                    break L2;
                  }
                }
                stackIn_15_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  var5 = wd.field_d[var3_int];
                  if (-1 < (var5 ^ -1)) {
                    var4 = var4 + sa.field_d;
                    break L3;
                  } else {
                    var6 = hj.a(false, true, me.field_a[var3_int]);
                    var4 = var4 + e.field_i;
                    var7 = -(var6 >> -1487873151) + dl.field_g;
                    if (!vc.a(tl.field_b - -(a.field_o << -1632356223), param2, param0, var4, var7 + -tc.field_b, 0, var6 - -(tc.field_b << 1230477249))) {
                      var4 = var4 + (e.field_i + ((a.field_o << -1916794559) + tl.field_b));
                      break L3;
                    } else {
                      stackIn_8_0 = var5;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var3), "af.VB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          return stackIn_15_0;
        }
    }

    final void s(int param0) {
        int var2;
        var2 = 115 % ((param0 - -41) / 41);
        if (!this.field_E) {
          return;
        } else {
          L0: {
            this.field_E = false;
            if (this.field_lb) {
              ag.a(-9145);
              break L0;
            } else {
              if (this.field_nb) {
                ff.b(-96);
                break L0;
              } else {
                break L0;
              }
            }
          }
          return;
        }
    }

    final static qj r(int param0) {
        if (param0 != 77) {
            return (qj) null;
        }
        return gh.field_k;
    }

    final static java.awt.Container t(int param0) {
        if (null != q.field_g) {
            return (java.awt.Container) ((Object) q.field_g);
        }
        if (param0 != 3) {
            return (java.awt.Container) null;
        }
        return (java.awt.Container) ((Object) mk.g(-120));
    }

    af(j param0, ee param1, String param2, boolean param3, boolean param4) {
        super(param0, new ui((af) null, param1, param2), 77, 10, 10);
        try {
            this.field_nb = param4 ? true : false;
            this.field_mb = false;
            this.field_lb = param3 ? true : false;
            this.field_pb = param1;
            this.field_qb = false;
            this.field_kb = new ng(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_kb.field_I = true;
            this.b(this.field_kb, (byte) 118);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "af.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static String a(int param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param0 < 33) {
            CharSequence var5 = (CharSequence) null;
            af.a(-80, (CharSequence) null, (byte) 110);
        }
        if (param2) {
            var4 += 4;
        }
        if (!(!param3)) {
            var4 += 2;
        }
        if (!(!param1)) {
            var4++;
        }
        return sb.field_b[var4];
    }

    final static void a(ee param0, int param1, int param2, int param3, byte param4, int param5, int param6, int param7, int param8, int param9, int param10, kc[] param11, int param12, kc[] param13, int param14, int param15, ee param16, int param17, int param18, int param19, kc[] param20) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
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
        RuntimeException decompiledCaughtException = null;
        int var21_int = 0;
        RuntimeException var21 = null;
        try {
          L0: {
            var21_int = 82 / ((-59 - param4) / 59);
            me.a(param0, param5, param16, param8, param3, param14, param9, new vg(param13), param12, param10, param2, param15, -26024, param17, param6, param7, new vg(param20), param18, param19, param1, new vg(param11));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var21 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var21);

            stackIn_4_1 = new StringBuilder().append("af.AC(");

            if (param0 == null) {
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
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');

            if (param11 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param12).append(',');

            if (param13 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param14).append(',').append(param15).append(',');

            if (param16 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param17).append(',').append(param18).append(',').append(param19).append(',');

            if (param20 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_5_0), stackIn_17_2 + ')');
        }
    }

    final static int a(int param0, CharSequence param1, byte param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 == 54) {
              stackIn_4_0 = bd.a(true, param1, (byte) 122, param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -11;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("af.UB(").append(param0).append(',');

            if (param1 == null) {
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
          throw ma.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(String param0, byte param1, int param2) {
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        ui stackIn_13_0 = null;
        ui stackIn_14_0 = null;
        String stackIn_14_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        ui var6 = null;
        var5 = Main.field_T;
        try {
          L0: {
            if (!this.field_mb) {
              L1: {
                if (param1 == -109) {
                  break L1;
                } else {
                  af.r(87);
                  break L1;
                }
              }
              L2: {
                stackIn_7_0 = this;

                if (param2 != 256) {
                  stackIn_8_0 = this;
                  stackIn_8_1 = 0;
                  break L2;
                } else {
                  stackIn_8_0 = this;
                  stackIn_8_1 = 1;
                  break L2;
                }
              }
              L3: {
                ((af) (this)).field_qb = stackIn_8_1 != 0;
                this.field_mb = true;
                this.field_kb.a(param1 + 109, 4210752, 8405024);
                var6 = new ui((af) (this), this.field_pb, param0);
                if (param2 == 5) {
                  var6.a(na.field_p, 11, -14);
                  var6.a(pg.field_f, 17, -14);
                  break L3;
                } else {
                  if ((param2 ^ -1) != -257) {
                    L4: {
                      stackIn_13_0 = (ui) (var6);

                      if (!this.field_lb) {
                        stackIn_14_0 = (ui) ((Object) stackIn_13_0);
                        stackIn_14_1 = uc.field_r;
                        break L4;
                      } else {
                        stackIn_14_0 = (ui) ((Object) stackIn_13_0);
                        stackIn_14_1 = tc.field_c;
                        break L4;
                      }
                    }
                    ((ui) (Object) stackIn_14_0).a(stackIn_14_1, -1, -14);
                    break L3;
                  } else {
                    var6.a((pl) (this), true, tc.field_c);
                    break L3;
                  }
                }
              }
              L5: {
                L6: {
                  if (param2 != 3) {
                    if (param2 == 4) {
                      var6.a(s.field_a, 8, -14);
                      break L6;
                    } else {
                      if (-7 != (param2 ^ -1)) {
                        if (param2 == 9) {
                          var6.a((pl) (this), true, wf.field_a);
                          break L6;
                        } else {
                          this.c(var6, (byte) 95);
                          break L5;
                        }
                      } else {
                        var6.a(jh.field_a, 9, -14);
                        break L6;
                      }
                    }
                  } else {
                    var6.a(sk.field_a, 7, -14);
                    break L6;
                  }
                }
                this.c(var6, (byte) 95);
                break L5;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var4);

            stackIn_29_1 = new StringBuilder().append("af.RB(");

            if (param0 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L7;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L7;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_ob = 0;
    }
}
