/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class dh extends hl implements ai {
    private kc field_db;
    private dg field_ab;
    static tl field_bb;
    static hj field_X;
    static int field_Z;
    private boolean field_cb;
    private boolean field_eb;
    private boolean field_W;
    private boolean field_Y;

    final boolean a(char param0, int param1, pj param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        boolean stackOut_7_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (param3 == 0) {
              if ((param1 ^ -1) == -14) {
                this.q(4210752);
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackOut_7_0 = super.a(param0, param1, param2, 0);
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
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
            stackOut_9_0 = (RuntimeException) (var5);
            stackOut_9_1 = new StringBuilder().append("dh.I(").append(param0).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            return stackIn_8_0;
          }
        }
    }

    public static void e(byte param0) {
        if (param0 != -94) {
            field_Z = 63;
            field_bb = null;
            field_X = null;
            return;
        }
        field_bb = null;
        field_X = null;
    }

    final static String a(int param0, long param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        qc.field_c.setTime(new Date(param1));
        var3 = qc.field_c.get(7);
        var4 = qc.field_c.get(5);
        var5 = qc.field_c.get(2);
        var6 = qc.field_c.get(1);
        var7 = qc.field_c.get(11);
        var8 = qc.field_c.get(12);
        var9 = qc.field_c.get(13);
        if (param0 != -15591) {
          field_bb = (tl) null;
          return te.field_N[var3 + -1] + ", " + var4 / 10 + var4 % 10 + "-" + md.field_e[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        } else {
          return te.field_N[var3 + -1] + ", " + var4 / 10 + var4 % 10 + "-" + md.field_e[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
    }

    final void d(byte param0) {
        this.field_ab.a(16711422, 2121792, 4210752);
        int var2 = 96 % ((param0 - 8) / 44);
        ec var3 = new ec((dh) (this), this.field_db, oa.field_e);
        var3.a(il.field_d, 15, -15858);
        this.a(false, var3);
    }

    final void q(int param0) {
        s var3 = null;
        if (param0 == 4210752) {
          if (this.field_A) {
            this.field_A = false;
            if (!this.field_W) {
              if (!this.field_cb) {
                return;
              } else {
                rf.d(false);
                return;
              }
            } else {
              jk.a(121);
              if (OrbDefence.field_D) {
                L0: {
                  if (this.field_cb) {
                    rf.d(false);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                return;
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } else {
          var3 = (s) null;
          this.a((byte) 120, -34, 27, (s) null, 96);
          if (this.field_A) {
            this.field_A = false;
            if (this.field_W) {
              jk.a(121);
              if (!OrbDefence.field_D) {
                return;
              } else {
                L1: {
                  if (this.field_cb) {
                    rf.d(false);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return;
              }
            } else {
              L2: {
                if (this.field_cb) {
                  rf.d(false);
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            }
          } else {
            return;
          }
        }
    }

    final static e a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        e stackIn_3_0 = null;
        Object stackIn_10_0 = null;
        e stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_9_0 = null;
        e stackOut_12_0 = null;
        e stackOut_2_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (param1 >= 63) {
              var2_int = param0.length();
              var3 = 0;
              L1: while (true) {
                L2: {
                  if (var3 >= var2_int) {
                    break L2;
                  } else {
                    var4 = param0.charAt(var3);
                    if (48 <= var4) {
                      if (57 >= var4) {
                        var3++;
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L2;
                        }
                      } else {
                        stackOut_9_0 = null;
                        stackIn_10_0 = stackOut_9_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      return null;
                    }
                  }
                }
                stackOut_12_0 = ba.field_a;
                stackIn_13_0 = stackOut_12_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackOut_2_0 = (e) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var2);
            stackOut_14_1 = new StringBuilder().append("dh.MA(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (e) ((Object) stackIn_10_0);
          } else {
            return stackIn_13_0;
          }
        }
    }

    final void a(int param0, int param1, String param2) {
        s discarded$2 = null;
        s discarded$3 = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        ec var7 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        ec stackIn_12_0 = null;
        ec stackIn_13_0 = null;
        ec stackIn_14_0 = null;
        String stackIn_14_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        ec stackOut_11_0 = null;
        ec stackOut_13_0 = null;
        String stackOut_13_1 = null;
        ec stackOut_12_0 = null;
        String stackOut_12_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (this.field_Y) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                this.field_Y = true;
                stackOut_4_0 = this;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if ((param1 ^ -1) != -257) {
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
                L3: {
                  ((dh) (this)).field_eb = stackIn_7_1 != 0;
                  this.field_ab.a(16711422, 8405024, 4210752);
                  var7 = new ec((dh) (this), this.field_db, param2);
                  var5 = -74 % ((param0 - 43) / 46);
                  if ((param1 ^ -1) == -6) {
                    break L3;
                  } else {
                    L4: {
                      if (-257 != (param1 ^ -1)) {
                        break L4;
                      } else {
                        discarded$2 = var7.a(tk.field_l, -34, (ag) (this));
                        if (var6 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      stackOut_11_0 = (ec) (var7);
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_12_0 = stackOut_11_0;
                      if (this.field_W) {
                        stackOut_13_0 = (ec) ((Object) stackIn_13_0);
                        stackOut_13_1 = tk.field_l;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        break L5;
                      } else {
                        stackOut_12_0 = (ec) ((Object) stackIn_12_0);
                        stackOut_12_1 = vc.field_i;
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        break L5;
                      }
                    }
                    ((ec) (Object) stackIn_14_0).a(stackIn_14_1, -1, -15858);
                    if (var6 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var7.a(vc.field_n, 11, -15858);
                var7.a(ld.field_d, 17, -15858);
                break L2;
              }
              L6: {
                L7: {
                  if (-4 != (param1 ^ -1)) {
                    break L7;
                  } else {
                    var7.a(vk.field_y, 7, -15858);
                    if (var6 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                if ((param1 ^ -1) == -5) {
                  var7.a(l.field_a, 8, -15858);
                  break L6;
                } else {
                  L8: {
                    if (param1 != 6) {
                      break L8;
                    } else {
                      var7.a(qf.field_k, 9, -15858);
                      if (var6 == 0) {
                        break L6;
                      } else {
                        break L8;
                      }
                    }
                  }
                  if ((param1 ^ -1) != -10) {
                    break L6;
                  } else {
                    discarded$3 = var7.a(fk.field_d, -34, (ag) (this));
                    if (var6 == 0) {
                      break L6;
                    } else {
                      var7.a(l.field_a, 8, -15858);
                      break L6;
                    }
                  }
                }
              }
              this.a(false, var7);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) (var4);
            stackOut_30_1 = new StringBuilder().append("dh.PA(").append(param0).append(',').append(param1).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param2 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L9;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L9;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    dh(sk param0, kc param1, String param2, boolean param3, boolean param4) {
        super(param0, new ec((dh) null, param1, param2), 77, 10, 10);
        try {
            this.field_eb = false;
            this.field_Y = false;
            this.field_db = param1;
            this.field_W = param3 ? true : false;
            this.field_cb = param4 ? true : false;
            this.field_ab = new dg(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_ab.field_z = true;
            this.a(this.field_ab, (byte) 74);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "dh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public void a(byte param0, int param1, int param2, s param3, int param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (this.field_eb) {
                  break L2;
                } else {
                  jj.a("tochangedisplayname.ws", (byte) -93, uj.b((byte) -120));
                  if (!OrbDefence.field_D) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              il.a(3, 0);
              this.q(4210752);
              break L1;
            }
            var6_int = -39 % ((-3 - param0) / 62);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (runtimeException);
            stackOut_6_1 = new StringBuilder().append("dh.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param4 + ')');
        }
    }

    static {
        field_Z = 0;
    }
}
