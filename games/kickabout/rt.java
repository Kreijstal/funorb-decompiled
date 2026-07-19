/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rt extends i {
    private int field_N;
    static String[] field_G;
    private int field_P;
    private int field_H;
    private up field_J;
    private int[] field_M;
    static vg field_F;
    private gm field_I;
    private hd field_L;
    static String field_K;
    private hd[] field_O;

    final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        hd stackIn_9_0 = null;
        hd stackIn_10_0 = null;
        hd stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        hd stackOut_8_0 = null;
        hd stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        hd stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        var4 = Kickabout.field_G;
        this.field_I.g((byte) 125);
        this.field_L.b(0, param1);
        var3 = 0;
        L0: while (true) {
          if (3 <= var3) {
            L1: {
              stackOut_8_0 = this.field_i[0];
              stackIn_10_0 = stackOut_8_0;
              stackIn_9_0 = stackOut_8_0;
              if (this.field_H == -1) {
                stackOut_10_0 = (hd) ((Object) stackIn_10_0);
                stackOut_10_1 = 0;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                break L1;
              } else {
                stackOut_9_0 = (hd) ((Object) stackIn_9_0);
                stackOut_9_1 = 1;
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                break L1;
              }
            }
            L2: {
              stackIn_11_0.field_lb = stackIn_11_1 != 0;
              var3 = param0;
              if (-1 == (this.field_H ^ -1)) {
                var3 = 16;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if ((this.field_H ^ -1) != -2) {
                break L3;
              } else {
                var3 = 5;
                break L3;
              }
            }
            L4: {
              if (-3 == (this.field_H ^ -1)) {
                var3 = 9;
                break L4;
              } else {
                break L4;
              }
            }
            this.field_I.b((byte) -128, var3);
            this.field_I.field_R = 128;
            return;
          } else {
            if (1 == this.field_O[var3].field_sb) {
              L5: {
                stackOut_4_0 = this;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (this.field_H != var3) {
                  stackOut_6_0 = this;
                  stackOut_6_1 = var3;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L5;
                } else {
                  stackOut_5_0 = this;
                  stackOut_5_1 = -1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L5;
                }
              }
              ((rt) (this)).field_H = stackIn_7_1;
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    rt(int param0, int param1, up param2) {
        super(20);
        RuntimeException var4 = null;
        int var4_int = 0;
        gr var6 = null;
        hd stackIn_4_0 = null;
        hd stackIn_5_0 = null;
        hd stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_8_0 = null;
        up stackIn_8_1 = null;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        up stackIn_8_4 = null;
        int stackIn_8_5 = 0;
        Object stackIn_9_0 = null;
        up stackIn_9_1 = null;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        up stackIn_9_4 = null;
        int stackIn_9_5 = 0;
        Object stackIn_10_0 = null;
        up stackIn_10_1 = null;
        int stackIn_10_2 = 0;
        int stackIn_10_3 = 0;
        up stackIn_10_4 = null;
        int stackIn_10_5 = 0;
        Object stackIn_11_0 = null;
        up stackIn_11_1 = null;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        up stackIn_11_4 = null;
        int stackIn_11_5 = 0;
        int stackIn_11_6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        up stackOut_7_1 = null;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        up stackOut_7_4 = null;
        int stackOut_7_5 = 0;
        Object stackOut_8_0 = null;
        up stackOut_8_1 = null;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        up stackOut_8_4 = null;
        int stackOut_8_5 = 0;
        Object stackOut_9_0 = null;
        up stackOut_9_1 = null;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        up stackOut_9_4 = null;
        int stackOut_9_5 = 0;
        int stackOut_9_6 = 0;
        Object stackOut_10_0 = null;
        up stackOut_10_1 = null;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        up stackOut_10_4 = null;
        int stackOut_10_5 = 0;
        int stackOut_10_6 = 0;
        hd stackOut_3_0 = null;
        hd stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        hd stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        this.field_H = -1;
        this.field_N = -1;
        try {
          L0: {
            this.field_J = param2;
            this.field_P = param0;
            this.field_N = param1;
            this.field_L = new hd();
            this.field_L.field_q = 150;
            this.field_O = new hd[3];
            this.field_M = new int[]{this.field_J.field_n, this.field_J.field_g, this.field_J.field_o};
            this.field_L.field_mb = 110;
            var4_int = 0;
            L1: while (true) {
              if (3 <= var4_int) {
                L2: {
                  L3: {
                    var6 = tu.field_E;
                    stackOut_7_0 = this;
                    stackOut_7_1 = this.field_J;
                    stackOut_7_2 = var6.field_w;
                    stackOut_7_3 = var6.field_k;
                    stackOut_7_4 = this.field_J;
                    stackOut_7_5 = -107;
                    stackIn_10_0 = stackOut_7_0;
                    stackIn_10_1 = stackOut_7_1;
                    stackIn_10_2 = stackOut_7_2;
                    stackIn_10_3 = stackOut_7_3;
                    stackIn_10_4 = stackOut_7_4;
                    stackIn_10_5 = stackOut_7_5;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    stackIn_8_2 = stackOut_7_2;
                    stackIn_8_3 = stackOut_7_3;
                    stackIn_8_4 = stackOut_7_4;
                    stackIn_8_5 = stackOut_7_5;
                    if (jd.f(-1)) {
                      break L3;
                    } else {
                      stackOut_8_0 = this;
                      stackOut_8_1 = (up) ((Object) stackIn_8_1);
                      stackOut_8_2 = stackIn_8_2;
                      stackOut_8_3 = stackIn_8_3;
                      stackOut_8_4 = (up) ((Object) stackIn_8_4);
                      stackOut_8_5 = stackIn_8_5;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      stackIn_10_2 = stackOut_8_2;
                      stackIn_10_3 = stackOut_8_3;
                      stackIn_10_4 = stackOut_8_4;
                      stackIn_10_5 = stackOut_8_5;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      stackIn_9_2 = stackOut_8_2;
                      stackIn_9_3 = stackOut_8_3;
                      stackIn_9_4 = stackOut_8_4;
                      stackIn_9_5 = stackOut_8_5;
                      if (!wn.a((byte) -3)) {
                        break L3;
                      } else {
                        stackOut_9_0 = this;
                        stackOut_9_1 = (up) ((Object) stackIn_9_1);
                        stackOut_9_2 = stackIn_9_2;
                        stackOut_9_3 = stackIn_9_3;
                        stackOut_9_4 = (up) ((Object) stackIn_9_4);
                        stackOut_9_5 = stackIn_9_5;
                        stackOut_9_6 = 1;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        stackIn_11_2 = stackOut_9_2;
                        stackIn_11_3 = stackOut_9_3;
                        stackIn_11_4 = stackOut_9_4;
                        stackIn_11_5 = stackOut_9_5;
                        stackIn_11_6 = stackOut_9_6;
                        break L2;
                      }
                    }
                  }
                  stackOut_10_0 = this;
                  stackOut_10_1 = (up) ((Object) stackIn_10_1);
                  stackOut_10_2 = stackIn_10_2;
                  stackOut_10_3 = stackIn_10_3;
                  stackOut_10_4 = (up) ((Object) stackIn_10_4);
                  stackOut_10_5 = stackIn_10_5;
                  stackOut_10_6 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  stackIn_11_3 = stackOut_10_3;
                  stackIn_11_4 = stackOut_10_4;
                  stackIn_11_5 = stackOut_10_5;
                  stackIn_11_6 = stackOut_10_6;
                  break L2;
                }
                ((rt) (this)).field_I = mg.a(stackIn_11_1, stackIn_11_2, stackIn_11_3, ((up) (Object) stackIn_11_4).c((byte) stackIn_11_5, stackIn_11_6 != 0), var6.field_R, (byte) 120);
                this.field_i[0].field_lb = false;
                this.field_I.field_nb = true;
                break L0;
              } else {
                L4: {
                  this.field_O[var4_int] = new hd();
                  this.field_O[var4_int].a(true, 150, 0, var4_int * 40, 30);
                  stackOut_3_0 = this.field_O[var4_int];
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (-101 >= (this.field_M[var4_int] ^ -1)) {
                    stackOut_5_0 = (hd) ((Object) stackIn_5_0);
                    stackOut_5_1 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    break L4;
                  } else {
                    stackOut_4_0 = (hd) ((Object) stackIn_4_0);
                    stackOut_4_1 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    break L4;
                  }
                }
                stackIn_6_0.field_lb = stackIn_6_1 != 0;
                this.field_L.a((byte) -127, this.field_O[var4_int]);
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var4);
            stackOut_13_1 = new StringBuilder().append("rt.<init>(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    final void a(int param0, int param1) {
        int discarded$0 = 0;
        hn var4 = null;
        if (param0 < 60) {
            discarded$0 = this.a((byte) 89);
        }
        super.a(62, param1);
        if (-1 == (param1 ^ -1)) {
            if (this.field_H != -1) {
                if (this.field_M[this.field_H] < 100) {
                    if (cq.field_h instanceof ta) {
                        cu.a((byte) -5, this.field_P, this.field_H);
                    } else {
                        if (!(la.a(100))) {
                            var4 = new hn(3, new int[]{this.field_P, this.field_H});
                            if (cq.field_h instanceof ap) {
                                if (null != um.field_e) {
                                    if (um.field_e.d((byte) 76)) {
                                        um.field_e.a(this.field_N, var4, (byte) -78, this.field_H);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    final int a(byte param0) {
        if (param0 <= 75) {
            this.field_N = 96;
        }
        return 280;
    }

    final static java.net.URL a(java.net.URL param0, String param1, int param2, String param3, boolean param4) {
        try {
            StringBuilder discarded$9 = null;
            StringBuilder discarded$10 = null;
            StringBuilder discarded$11 = null;
            StringBuilder discarded$12 = null;
            StringBuilder discarded$13 = null;
            StringBuilder discarded$14 = null;
            StringBuilder discarded$15 = null;
            StringBuilder discarded$16 = null;
            StringBuilder discarded$17 = null;
            RuntimeException var5 = null;
            String var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_3_0 = null;
            java.net.URL stackIn_44_0 = null;
            java.net.URL stackIn_46_0 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            RuntimeException stackIn_50_0 = null;
            StringBuilder stackIn_50_1 = null;
            String stackIn_50_2 = null;
            RuntimeException stackIn_51_0 = null;
            StringBuilder stackIn_51_1 = null;
            RuntimeException stackIn_52_0 = null;
            StringBuilder stackIn_52_1 = null;
            RuntimeException stackIn_53_0 = null;
            StringBuilder stackIn_53_1 = null;
            String stackIn_53_2 = null;
            RuntimeException stackIn_54_0 = null;
            StringBuilder stackIn_54_1 = null;
            RuntimeException stackIn_55_0 = null;
            StringBuilder stackIn_55_1 = null;
            RuntimeException stackIn_56_0 = null;
            StringBuilder stackIn_56_1 = null;
            String stackIn_56_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_43_0 = null;
            java.net.URL stackOut_45_0 = null;
            java.net.URL stackOut_2_0 = null;
            RuntimeException stackOut_47_0 = null;
            StringBuilder stackOut_47_1 = null;
            RuntimeException stackOut_49_0 = null;
            StringBuilder stackOut_49_1 = null;
            String stackOut_49_2 = null;
            RuntimeException stackOut_48_0 = null;
            StringBuilder stackOut_48_1 = null;
            String stackOut_48_2 = null;
            RuntimeException stackOut_50_0 = null;
            StringBuilder stackOut_50_1 = null;
            RuntimeException stackOut_52_0 = null;
            StringBuilder stackOut_52_1 = null;
            String stackOut_52_2 = null;
            RuntimeException stackOut_51_0 = null;
            StringBuilder stackOut_51_1 = null;
            String stackOut_51_2 = null;
            RuntimeException stackOut_53_0 = null;
            StringBuilder stackOut_53_1 = null;
            RuntimeException stackOut_55_0 = null;
            StringBuilder stackOut_55_1 = null;
            String stackOut_55_2 = null;
            RuntimeException stackOut_54_0 = null;
            StringBuilder stackOut_54_1 = null;
            String stackOut_54_2 = null;
            var9 = Kickabout.field_G;
            try {
              L0: {
                if (!param4) {
                  var5_ref = param0.getFile();
                  var6 = 0;
                  L1: while (true) {
                    L2: {
                      if (var5_ref.regionMatches(var6, "/l=", 0, 3)) {
                        var7_int = var5_ref.indexOf('/', var6 - -1);
                        if (var7_int >= 0) {
                          if (param2 < 0) {
                            var6 = var7_int;
                            continue L1;
                          } else {
                            var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                            continue L1;
                          }
                        } else {
                          break L2;
                        }
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      if (!var5_ref.regionMatches(var6, "/a=", 0, 3)) {
                        break L3;
                      } else {
                        var7_int = var5_ref.indexOf('/', 1 + var6);
                        if (-1 < (var7_int ^ -1)) {
                          break L3;
                        } else {
                          var6 = var7_int;
                          continue L1;
                        }
                      }
                    }
                    L4: {
                      if (var5_ref.regionMatches(var6, "/p=", 0, 3)) {
                        var7_int = var5_ref.indexOf('/', 1 + var6);
                        if ((var7_int ^ -1) <= -1) {
                          if (param3 != null) {
                            var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                            continue L1;
                          } else {
                            var6 = var7_int;
                            continue L1;
                          }
                        } else {
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      L6: {
                        if (var5_ref.regionMatches(var6, "/s=", 0, 3)) {
                          break L6;
                        } else {
                          if (!var5_ref.regionMatches(var6, "/c=", 0, 3)) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var7_int = var5_ref.indexOf('/', 1 + var6);
                      if ((var7_int ^ -1) <= -1) {
                        if (param1 != null) {
                          var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                          continue L1;
                        } else {
                          var6 = var7_int;
                          continue L1;
                        }
                      } else {
                        break L5;
                      }
                    }
                    L7: {
                      var7 = new StringBuilder(var6);
                      discarded$9 = var7.append(var5_ref.substring(0, var6));
                      if (0 < param2) {
                        discarded$10 = var7.append("/l=");
                        discarded$11 = var7.append(Integer.toString(param2));
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (param3 == null) {
                        break L8;
                      } else {
                        if ((param3.length() ^ -1) < -1) {
                          discarded$12 = var7.append("/p=");
                          discarded$13 = var7.append(param3);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (param1 == null) {
                        break L9;
                      } else {
                        if (0 >= param1.length()) {
                          break L9;
                        } else {
                          discarded$14 = var7.append("/s=");
                          discarded$15 = var7.append(param1);
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (var6 < var5_ref.length()) {
                        discarded$16 = var7.append(var5_ref.substring(var6, var5_ref.length()));
                        break L10;
                      } else {
                        discarded$17 = var7.append('/');
                        break L10;
                      }
                    }
                    try {
                      L11: {
                        stackOut_43_0 = new java.net.URL(param0, var7.toString());
                        stackIn_44_0 = stackOut_43_0;
                        break L11;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var8 = (Exception) (Object) decompiledCaughtException;
                      var8.printStackTrace();
                      stackOut_45_0 = (java.net.URL) (param0);
                      stackIn_46_0 = stackOut_45_0;
                      return stackIn_46_0;
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  stackOut_2_0 = (java.net.URL) null;
                  stackIn_3_0 = stackOut_2_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L12: {
                var5 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_47_0 = (RuntimeException) (var5);
                stackOut_47_1 = new StringBuilder().append("rt.A(");
                stackIn_49_0 = stackOut_47_0;
                stackIn_49_1 = stackOut_47_1;
                stackIn_48_0 = stackOut_47_0;
                stackIn_48_1 = stackOut_47_1;
                if (param0 == null) {
                  stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
                  stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
                  stackOut_49_2 = "null";
                  stackIn_50_0 = stackOut_49_0;
                  stackIn_50_1 = stackOut_49_1;
                  stackIn_50_2 = stackOut_49_2;
                  break L12;
                } else {
                  stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
                  stackOut_48_2 = "{...}";
                  stackIn_50_0 = stackOut_48_0;
                  stackIn_50_1 = stackOut_48_1;
                  stackIn_50_2 = stackOut_48_2;
                  break L12;
                }
              }
              L13: {
                stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
                stackOut_50_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(',');
                stackIn_52_0 = stackOut_50_0;
                stackIn_52_1 = stackOut_50_1;
                stackIn_51_0 = stackOut_50_0;
                stackIn_51_1 = stackOut_50_1;
                if (param1 == null) {
                  stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
                  stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
                  stackOut_52_2 = "null";
                  stackIn_53_0 = stackOut_52_0;
                  stackIn_53_1 = stackOut_52_1;
                  stackIn_53_2 = stackOut_52_2;
                  break L13;
                } else {
                  stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
                  stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
                  stackOut_51_2 = "{...}";
                  stackIn_53_0 = stackOut_51_0;
                  stackIn_53_1 = stackOut_51_1;
                  stackIn_53_2 = stackOut_51_2;
                  break L13;
                }
              }
              L14: {
                stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
                stackOut_53_1 = ((StringBuilder) (Object) stackIn_53_1).append(stackIn_53_2).append(',').append(param2).append(',');
                stackIn_55_0 = stackOut_53_0;
                stackIn_55_1 = stackOut_53_1;
                stackIn_54_0 = stackOut_53_0;
                stackIn_54_1 = stackOut_53_1;
                if (param3 == null) {
                  stackOut_55_0 = (RuntimeException) ((Object) stackIn_55_0);
                  stackOut_55_1 = (StringBuilder) ((Object) stackIn_55_1);
                  stackOut_55_2 = "null";
                  stackIn_56_0 = stackOut_55_0;
                  stackIn_56_1 = stackOut_55_1;
                  stackIn_56_2 = stackOut_55_2;
                  break L14;
                } else {
                  stackOut_54_0 = (RuntimeException) ((Object) stackIn_54_0);
                  stackOut_54_1 = (StringBuilder) ((Object) stackIn_54_1);
                  stackOut_54_2 = "{...}";
                  stackIn_56_0 = stackOut_54_0;
                  stackIn_56_1 = stackOut_54_1;
                  stackIn_56_2 = stackOut_54_2;
                  break L14;
                }
              }
              throw nb.a((Throwable) ((Object) stackIn_56_0), stackIn_56_2 + ',' + param4 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return stackIn_3_0;
            } else {
              return stackIn_44_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void g(int param0) {
        field_G = null;
        if (param0 != 25996) {
            rt.b(-32, 113, 1);
        }
        field_F = null;
        field_K = null;
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = Kickabout.field_G;
          super.a((byte) -70, param1, param2);
          this.field_L.field_J = 95 + param2;
          this.field_L.field_s = param1 + 180;
          this.field_L.b(0, true);
          iw.a(-65, c.field_b);
          on.b();
          this.field_I.a(1200, 0, on.field_g >> 247256193, on.field_f + -10, (byte) -68);
          if (param0 < -11) {
            break L0;
          } else {
            this.field_P = 5;
            break L0;
          }
        }
        ta.e(123);
        c.field_b.f(40 + param1, param2 - -80);
        pb.field_C.d(this.field_J.d(100), param1 + 90, param2 + 190, 16777215, -1);
        eo.a(param1 + 40, 200 + param2, this.field_J.field_r, 3, true, 0);
        var4 = 0;
        L1: while (true) {
          if ((var4 ^ -1) <= -4) {
            return;
          } else {
            L2: {
              var5 = this.field_O[var4].field_F;
              var6 = this.field_O[var4].field_T;
              var7 = this.field_O[var4].field_q;
              var8 = this.field_O[var4].field_mb;
              if (var4 != this.field_H) {
                if (!this.field_O[var4].field_gb) {
                  if (this.field_M[var4] >= 100) {
                    q.field_d.a(ne.field_L, 123 + var5, var6 - -19, 13382451, 65793);
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  on.f(var5, var6, var7, var8, 8, 4473924);
                  q.field_d.a("+1%", 123 + var5, var6 - -19, 5592405, -1);
                  break L2;
                }
              } else {
                on.a(var5, var6, var7, var8, 8, 65793, 128);
                on.f(var5, var6, var7, var8, 8, 10066329);
                q.field_d.a("+1%", 123 + var5, 19 + var6, 16777215, 65793);
                break L2;
              }
            }
            L3: {
              var9 = 0;
              if (0 == var4) {
                var9 = this.field_J.c(true, oi.b(-79));
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (-2 != (var4 ^ -1)) {
                break L4;
              } else {
                var9 = this.field_J.a(5205, oi.b(-79));
                break L4;
              }
            }
            L5: {
              if (-3 == (var4 ^ -1)) {
                var9 = this.field_J.b((byte) 120, oi.b(27));
                break L5;
              } else {
                break L5;
              }
            }
            eo.a(16 + var5, 9 + var6, this.field_M[var4], var4, true, var9);
            var4++;
            continue L1;
          }
        }
    }

    final int b(int param0) {
        if (param0 != -1379118556) {
            rt.g(-26);
        }
        return 370;
    }

    final static void b(int param0, int param1, int param2) {
        hn var3 = null;
        int var4 = Kickabout.field_G;
        try {
            var3 = (hn) ((Object) da.field_h.g(24009));
            while (var3 != null) {
                if (8 == var3.field_i) {
                    var3.c((byte) -109);
                }
                var3 = (hn) ((Object) da.field_h.c(33));
            }
            if (param1 <= 32) {
                field_F = (vg) null;
            }
            var3 = new hn(8, new int[]{param0, param2});
            ii.a(var3, 76);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "rt.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_G = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_K = "Achievements are awarded during games of Kickabout. Some will only be awarded in <col=ffff00>rated</col> games or Tournaments with at least 8 starting players. No achievements are awarded in <col=ffff00>Exhibition</col> games.";
    }
}
