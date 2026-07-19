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
        int var2 = 0;
        if (this.field_S) {
          this.field_S = false;
          var2 = 6 % ((-68 - param0) / 51);
          if (!this.field_Ab) {
            if (this.field_Eb) {
              ai.h(-73);
              if (client.field_A) {
                qf.a(true);
                return;
              } else {
                return;
              }
            } else {
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
        RuntimeException runtimeException = null;
        int var3 = 0;
        w var4 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var3 = client.field_A ? 1 : 0;
        try {
          L0: {
            var4 = (w) ((Object) param0.field_M.c((byte) -76));
            L1: while (true) {
              L2: {
                L3: {
                  if (var4 == null) {
                    break L3;
                  } else {
                    var4.field_Ib = 0;
                    var4.field_Mb = 0;
                    var4.field_F = 0;
                    var4.field_N = 0;
                    var4 = (w) ((Object) param0.field_M.d(true));
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L4: {
                  if (param1) {
                    break L4;
                  } else {
                    field_yb = (byte[][]) null;
                    break L4;
                  }
                }
                param0.field_Mb = 0;
                param0.field_Ib = 0;
                param0.field_F = 0;
                param0.field_N = 0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (runtimeException);
            stackOut_10_1 = new StringBuilder().append("gk.IA(");
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
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    final void a(byte param0, String param1, int param2) {
        ek discarded$2 = null;
        ek discarded$3 = null;
        RuntimeException var4 = null;
        int var5 = 0;
        dj var6 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        dj stackIn_15_0 = null;
        dj stackIn_16_0 = null;
        dj stackIn_17_0 = null;
        String stackIn_17_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        dj stackOut_14_0 = null;
        dj stackOut_16_0 = null;
        String stackOut_16_1 = null;
        dj stackOut_15_0 = null;
        String stackOut_15_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var5 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (param0 == 48) {
              if (!this.field_Fb) {
                L1: {
                  stackOut_5_0 = this;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (256 != param2) {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    break L1;
                  } else {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    break L1;
                  }
                }
                L2: {
                  L3: {
                    ((gk) (this)).field_zb = stackIn_8_1 != 0;
                    this.field_Fb = true;
                    this.field_xb.a(4210752, 4088, 8405024);
                    var6 = new dj((gk) (this), this.field_Bb, param1);
                    if (-6 != (param2 ^ -1)) {
                      break L3;
                    } else {
                      var6.a(pb.field_e, 11, 14);
                      var6.a(ig.field_Tb, 17, param0 ^ 62);
                      if (var5 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (-257 != (param2 ^ -1)) {
                      break L4;
                    } else {
                      discarded$2 = var6.a(116, sh.field_c, (kg) (this));
                      if (var5 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    stackOut_14_0 = (dj) (var6);
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_15_0 = stackOut_14_0;
                    if (!this.field_Ab) {
                      stackOut_16_0 = (dj) ((Object) stackIn_16_0);
                      stackOut_16_1 = bl.field_X;
                      stackIn_17_0 = stackOut_16_0;
                      stackIn_17_1 = stackOut_16_1;
                      break L5;
                    } else {
                      stackOut_15_0 = (dj) ((Object) stackIn_15_0);
                      stackOut_15_1 = sh.field_c;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      break L5;
                    }
                  }
                  ((dj) (Object) stackIn_17_0).a(stackIn_17_1, -1, 14);
                  break L2;
                }
                L6: {
                  L7: {
                    if (3 != param2) {
                      break L7;
                    } else {
                      var6.a(ce.field_z, 7, 14);
                      if (var5 == 0) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if ((param2 ^ -1) != -5) {
                      break L8;
                    } else {
                      var6.a(ai.field_U, 8, 14);
                      if (var5 == 0) {
                        break L6;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (6 != param2) {
                      break L9;
                    } else {
                      var6.a(vb.field_Y, 9, 14);
                      if (var5 == 0) {
                        break L6;
                      } else {
                        break L9;
                      }
                    }
                  }
                  if (-10 == (param2 ^ -1)) {
                    discarded$3 = var6.a(127, pc.field_e, (kg) (this));
                    break L6;
                  } else {
                    break L6;
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
          L10: {
            var4 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) (var4);
            stackOut_32_1 = new StringBuilder().append("gk.EA(").append(param0).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param1 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L10;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L10;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param2 + ')');
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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_4_0 = false;
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
            if (param1 == 13) {
              this.n(63);
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var5_int = -15 / ((param0 - -22) / 49);
              stackOut_4_0 = super.a(123, param1, param2, param3);
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var5);
            stackOut_6_1 = new StringBuilder().append("gk.QA(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
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
              if (param0 == 67) {
                break L1;
              } else {
                this.field_Eb = true;
                break L1;
              }
            }
            L2: {
              if (!this.field_zb) {
                break L2;
              } else {
                hm.a(3, (byte) -124);
                this.n(-9);
                if (!client.field_A) {
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            aj.a("tochangedisplayname.ws", param0 ^ -79, se.h(param0 ^ 25211));
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var6);
            stackOut_7_1 = new StringBuilder().append("gk.H(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ',' + param4 + ')');
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
