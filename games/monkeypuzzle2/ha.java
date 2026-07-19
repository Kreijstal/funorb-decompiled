/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ha extends pc implements ql {
    static li field_Z;
    static ad field_fb;
    private boolean field_eb;
    static long field_ab;
    private jh field_gb;
    private boolean field_cb;
    private boolean field_hb;
    private boolean field_bb;
    static boolean field_db;
    private ta field_ib;

    final boolean a(we param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param2 != 13) {
              var5_int = -44 / ((param3 - 37) / 50);
              stackOut_3_0 = super.a(param0, param1, param2, 120);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.g((byte) -75);
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var5);
            stackOut_5_1 = new StringBuilder().append("ha.V(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    public void a(int param0, int param1, int param2, int param3, t param4) {
        RuntimeException var6 = null;
        String var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param3 == 7) {
                break L1;
              } else {
                var7 = (String) null;
                this.a(59, (String) null, -95);
                break L1;
              }
            }
            L2: {
              if (this.field_bb) {
                break L2;
              } else {
                k.a(ii.a(false), (byte) -31, "tochangedisplayname.ws");
                if (!MonkeyPuzzle2.field_F) {
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            qh.a(3, true);
            this.g((byte) -75);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var6);
            stackOut_7_1 = new StringBuilder().append("ha.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param4 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final static float a(byte param0, float param1) {
        float discarded$2 = 0.0f;
        if (param0 != 51) {
          discarded$2 = ha.a((byte) 30, 0.09005918353796005f);
          return vh.field_H[(int)((double)(32768.0f * param1) / 3.141592653589793) & 65535];
        } else {
          return vh.field_H[(int)((double)(32768.0f * param1) / 3.141592653589793) & 65535];
        }
    }

    final static String a(byte param0, long param1) {
        ec.field_b.setTime(new Date(param1));
        int var3 = ec.field_b.get(7);
        int var4 = ec.field_b.get(5);
        int var5 = ec.field_b.get(2);
        int var6 = ec.field_b.get(1);
        int var7 = -5 % ((param0 - -46) / 62);
        int var8 = ec.field_b.get(11);
        int var9 = ec.field_b.get(12);
        int var10 = ec.field_b.get(13);
        return jk.field_y[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + uc.field_f[var5] + "-" + var6 + " " + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10 + " GMT";
    }

    final static void a(int param0, int param1, int param2, int param3, le[] param4, le[] param5, int param6, int param7, int param8, int param9, ta param10) {
        try {
            cf.a((byte) 66);
            int var11_int = -74 / ((68 - param1) / 47);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "ha.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + (param10 != null ? "{...}" : "null") + ')');
        }
    }

    public static void f(byte param0) {
        if (param0 > -39) {
            field_db = true;
            field_Z = null;
            field_fb = null;
            return;
        }
        field_Z = null;
        field_fb = null;
    }

    ha(kj param0, ta param1, String param2, boolean param3, boolean param4) {
        super(param0, new sk((ha) null, param1, param2), 77, 10, 10);
        try {
            this.field_hb = param3 ? true : false;
            this.field_bb = false;
            this.field_ib = param1;
            this.field_cb = false;
            this.field_eb = param4 ? true : false;
            this.field_gb = new jh(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_gb.field_G = true;
            this.b((byte) -104, this.field_gb);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "ha.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void g(byte param0) {
        if (!this.field_z) {
          return;
        } else {
          this.field_z = false;
          if (this.field_hb) {
            vb.a((byte) 28);
            if (param0 != -75) {
              field_fb = (ad) null;
              return;
            } else {
              return;
            }
          } else {
            if (this.field_eb) {
              nc.a(1);
              if (MonkeyPuzzle2.field_F) {
                vb.a((byte) 28);
                if (param0 != -75) {
                  field_fb = (ad) null;
                  return;
                } else {
                  return;
                }
              } else {
                if (param0 != -75) {
                  field_fb = (ad) null;
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (param0 != -75) {
                field_fb = (ad) null;
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final void a(int param0, String param1, int param2) {
        t discarded$2 = null;
        t discarded$3 = null;
        RuntimeException var4 = null;
        int var5 = 0;
        sk var6 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        sk stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        sk stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        sk stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        String stackIn_12_3 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        sk stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        sk stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        String stackOut_11_3 = null;
        sk stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        String stackOut_10_3 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (this.field_cb) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                stackOut_4_0 = this;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (param2 != 256) {
                  stackOut_6_0 = this;
                  stackOut_6_1 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L1;
                } else {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L1;
                }
              }
              L2: {
                ((ha) (this)).field_bb = stackIn_7_1 != 0;
                this.field_cb = true;
                this.field_gb.a((byte) -115, 8405024, 4210752);
                var6 = new sk((ha) (this), this.field_ib, param1);
                if ((param2 ^ -1) == -6) {
                  var6.a((byte) -116, 11, wc.field_g);
                  var6.a((byte) 102, 17, vh.field_L);
                  break L2;
                } else {
                  L3: {
                    if (-257 == (param2 ^ -1)) {
                      break L3;
                    } else {
                      L4: {
                        stackOut_9_0 = (sk) (var6);
                        stackOut_9_1 = 92;
                        stackOut_9_2 = -1;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        stackIn_11_2 = stackOut_9_2;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        stackIn_10_2 = stackOut_9_2;
                        if (this.field_hb) {
                          stackOut_11_0 = (sk) ((Object) stackIn_11_0);
                          stackOut_11_1 = stackIn_11_1;
                          stackOut_11_2 = stackIn_11_2;
                          stackOut_11_3 = qd.field_c;
                          stackIn_12_0 = stackOut_11_0;
                          stackIn_12_1 = stackOut_11_1;
                          stackIn_12_2 = stackOut_11_2;
                          stackIn_12_3 = stackOut_11_3;
                          break L4;
                        } else {
                          stackOut_10_0 = (sk) ((Object) stackIn_10_0);
                          stackOut_10_1 = stackIn_10_1;
                          stackOut_10_2 = stackIn_10_2;
                          stackOut_10_3 = nf.field_E;
                          stackIn_12_0 = stackOut_10_0;
                          stackIn_12_1 = stackOut_10_1;
                          stackIn_12_2 = stackOut_10_2;
                          stackIn_12_3 = stackOut_10_3;
                          break L4;
                        }
                      }
                      ((sk) (Object) stackIn_12_0).a((byte) stackIn_12_1, stackIn_12_2, stackIn_12_3);
                      if (var5 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  discarded$2 = var6.a(0, (of) (this), qd.field_c);
                  if (var5 == 0) {
                    break L2;
                  } else {
                    var6.a((byte) -116, 11, wc.field_g);
                    var6.a((byte) 102, 17, vh.field_L);
                    break L2;
                  }
                }
              }
              L5: {
                L6: {
                  if (param2 != 3) {
                    break L6;
                  } else {
                    var6.a((byte) -27, 7, fc.field_m);
                    if (var5 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (4 != param2) {
                    break L7;
                  } else {
                    var6.a((byte) -51, 8, ub.field_d);
                    if (var5 == 0) {
                      break L5;
                    } else {
                      break L7;
                    }
                  }
                }
                if ((param2 ^ -1) == -7) {
                  var6.a((byte) 108, 9, uf.field_k);
                  break L5;
                } else {
                  if (-10 != (param2 ^ -1)) {
                    break L5;
                  } else {
                    discarded$3 = var6.a(0, (of) (this), qa.field_b);
                    if (var5 == 0) {
                      break L5;
                    } else {
                      var6.a((byte) 108, 9, uf.field_k);
                      break L5;
                    }
                  }
                }
              }
              if (param0 == -10) {
                this.c((byte) 108, var6);
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
          L8: {
            var4 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) (var4);
            stackOut_33_1 = new StringBuilder().append("ha.KB(").append(param0).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param1 == null) {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L8;
            } else {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L8;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ',' + param2 + ')');
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

    final void q(int param0) {
        this.field_gb.a((byte) -115, 2121792, 4210752);
        sk var2 = new sk((ha) (this), this.field_ib, sg.field_h);
        int var3 = 123 % ((11 - param0) / 43);
        var2.a((byte) -10, 15, a.field_d);
        this.c((byte) 50, var2);
    }

    static {
        field_Z = null;
        field_db = true;
    }
}
