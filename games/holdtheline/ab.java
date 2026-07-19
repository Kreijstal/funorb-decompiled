/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ab extends dc implements pi {
    private boolean field_ob;
    static int field_pb;
    private ea field_rb;
    static int field_jb;
    private boolean field_mb;
    static int field_lb;
    private boolean field_qb;
    private boolean field_kb;
    private qi field_nb;

    final void h(byte param0) {
        if (!this.field_F) {
          return;
        } else {
          this.field_F = false;
          if (this.field_kb) {
            wh.a((byte) -41);
            if (param0 <= -47) {
              return;
            } else {
              this.o(87);
              return;
            }
          } else {
            if (!this.field_ob) {
              if (param0 > -47) {
                this.o(87);
                return;
              } else {
                return;
              }
            } else {
              j.b(58);
              if (param0 <= -47) {
                return;
              } else {
                this.o(87);
                return;
              }
            }
          }
        }
    }

    public void a(int param0, rm param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
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
            if (param2 == -4) {
              if (this.field_mb) {
                go.a(param2 + 4, 3);
                this.h((byte) -89);
                return;
              } else {
                sh.a((byte) -116, en.a(param2 ^ -75), "tochangedisplayname.ws");
                return;
              }
            } else {
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var6);
            stackOut_6_1 = new StringBuilder().append("ab.M(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
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
          throw kk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void o(int param0) {
        nh var2 = null;
        this.field_rb.a(2121792, 4210752, false);
        var2 = new nh((ab) (this), this.field_nb, sk.field_b);
        if (param0 > -12) {
          return;
        } else {
          var2.a(15, ge.field_d, (byte) 69);
          this.a((n) (var2), (byte) -104);
          return;
        }
    }

    ab(qj param0, qi param1, String param2, boolean param3, boolean param4) {
        super(param0, new nh((ab) null, param1, param2), 77, 10, 10);
        try {
            this.field_ob = param4 ? true : false;
            this.field_qb = false;
            this.field_mb = false;
            this.field_kb = param3 ? true : false;
            this.field_nb = param1;
            this.field_rb = new ea(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_rb.field_K = true;
            this.a(true, this.field_rb);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "ab.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean n(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 < 103) {
          L0: {
            field_pb = 24;
            if (ak.field_b != sf.field_n) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (ak.field_b != sf.field_n) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static java.net.URL a(String param0, String param1, java.net.URL param2, byte param3, int param4) {
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
            int var7 = 0;
            int var8_int = 0;
            StringBuilder var8 = null;
            Exception var9 = null;
            int var10 = 0;
            java.net.URL stackIn_40_0 = null;
            java.net.URL stackIn_42_0 = null;
            RuntimeException stackIn_44_0 = null;
            StringBuilder stackIn_44_1 = null;
            RuntimeException stackIn_45_0 = null;
            StringBuilder stackIn_45_1 = null;
            RuntimeException stackIn_46_0 = null;
            StringBuilder stackIn_46_1 = null;
            String stackIn_46_2 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            String stackIn_49_2 = null;
            RuntimeException stackIn_50_0 = null;
            StringBuilder stackIn_50_1 = null;
            RuntimeException stackIn_51_0 = null;
            StringBuilder stackIn_51_1 = null;
            RuntimeException stackIn_52_0 = null;
            StringBuilder stackIn_52_1 = null;
            String stackIn_52_2 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_39_0 = null;
            java.net.URL stackOut_41_0 = null;
            RuntimeException stackOut_43_0 = null;
            StringBuilder stackOut_43_1 = null;
            RuntimeException stackOut_45_0 = null;
            StringBuilder stackOut_45_1 = null;
            String stackOut_45_2 = null;
            RuntimeException stackOut_44_0 = null;
            StringBuilder stackOut_44_1 = null;
            String stackOut_44_2 = null;
            RuntimeException stackOut_46_0 = null;
            StringBuilder stackOut_46_1 = null;
            RuntimeException stackOut_48_0 = null;
            StringBuilder stackOut_48_1 = null;
            String stackOut_48_2 = null;
            RuntimeException stackOut_47_0 = null;
            StringBuilder stackOut_47_1 = null;
            String stackOut_47_2 = null;
            RuntimeException stackOut_49_0 = null;
            StringBuilder stackOut_49_1 = null;
            RuntimeException stackOut_51_0 = null;
            StringBuilder stackOut_51_1 = null;
            String stackOut_51_2 = null;
            RuntimeException stackOut_50_0 = null;
            StringBuilder stackOut_50_1 = null;
            String stackOut_50_2 = null;
            var10 = HoldTheLine.field_D;
            try {
              L0: {
                var5_ref = param2.getFile();
                var7 = -22 / ((param3 - -36) / 60);
                var6 = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      if (var5_ref.regionMatches(var6, "/l=", 0, 3)) {
                        var8_int = var5_ref.indexOf('/', var6 - -1);
                        if (var8_int >= 0) {
                          if (-1 < (param4 ^ -1)) {
                            break L2;
                          } else {
                            var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var8_int);
                            continue L1;
                          }
                        } else {
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      if (var5_ref.regionMatches(var6, "/a=", 0, 3)) {
                        var8_int = var5_ref.indexOf('/', 1 + var6);
                        if (-1 >= (var8_int ^ -1)) {
                          break L2;
                        } else {
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (var5_ref.regionMatches(var6, "/p=", 0, 3)) {
                        var8_int = var5_ref.indexOf('/', var6 - -1);
                        if (0 > var8_int) {
                          break L5;
                        } else {
                          if (param0 != null) {
                            var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var8_int);
                            continue L1;
                          } else {
                            var6 = var8_int;
                            continue L1;
                          }
                        }
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      L7: {
                        if (var5_ref.regionMatches(var6, "/s=", 0, 3)) {
                          break L7;
                        } else {
                          if (var5_ref.regionMatches(var6, "/c=", 0, 3)) {
                            break L7;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var8_int = var5_ref.indexOf('/', 1 + var6);
                      if (0 > var8_int) {
                        break L6;
                      } else {
                        if (param1 != null) {
                          var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var8_int);
                          continue L1;
                        } else {
                          var6 = var8_int;
                          continue L1;
                        }
                      }
                    }
                    L8: {
                      var8 = new StringBuilder(var6);
                      discarded$9 = var8.append(var5_ref.substring(0, var6));
                      if (param4 <= 0) {
                        break L8;
                      } else {
                        discarded$10 = var8.append("/l=");
                        discarded$11 = var8.append(Integer.toString(param4));
                        break L8;
                      }
                    }
                    L9: {
                      if (param0 == null) {
                        break L9;
                      } else {
                        if (0 < param0.length()) {
                          discarded$12 = var8.append("/p=");
                          discarded$13 = var8.append(param0);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (param1 == null) {
                        break L10;
                      } else {
                        if (-1 <= (param1.length() ^ -1)) {
                          break L10;
                        } else {
                          discarded$14 = var8.append("/s=");
                          discarded$15 = var8.append(param1);
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (var5_ref.length() > var6) {
                        discarded$16 = var8.append(var5_ref.substring(var6, var5_ref.length()));
                        break L11;
                      } else {
                        discarded$17 = var8.append('/');
                        break L11;
                      }
                    }
                    try {
                      L12: {
                        stackOut_39_0 = new java.net.URL(param2, var8.toString());
                        stackIn_40_0 = stackOut_39_0;
                        break L12;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var9 = (Exception) (Object) decompiledCaughtException;
                      var9.printStackTrace();
                      stackOut_41_0 = (java.net.URL) (param2);
                      stackIn_42_0 = stackOut_41_0;
                      return stackIn_42_0;
                    }
                    break L0;
                  }
                  var6 = var8_int;
                  continue L1;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L13: {
                var5 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_43_0 = (RuntimeException) (var5);
                stackOut_43_1 = new StringBuilder().append("ab.V(");
                stackIn_45_0 = stackOut_43_0;
                stackIn_45_1 = stackOut_43_1;
                stackIn_44_0 = stackOut_43_0;
                stackIn_44_1 = stackOut_43_1;
                if (param0 == null) {
                  stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
                  stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
                  stackOut_45_2 = "null";
                  stackIn_46_0 = stackOut_45_0;
                  stackIn_46_1 = stackOut_45_1;
                  stackIn_46_2 = stackOut_45_2;
                  break L13;
                } else {
                  stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
                  stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
                  stackOut_44_2 = "{...}";
                  stackIn_46_0 = stackOut_44_0;
                  stackIn_46_1 = stackOut_44_1;
                  stackIn_46_2 = stackOut_44_2;
                  break L13;
                }
              }
              L14: {
                stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
                stackOut_46_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(',');
                stackIn_48_0 = stackOut_46_0;
                stackIn_48_1 = stackOut_46_1;
                stackIn_47_0 = stackOut_46_0;
                stackIn_47_1 = stackOut_46_1;
                if (param1 == null) {
                  stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
                  stackOut_48_2 = "null";
                  stackIn_49_0 = stackOut_48_0;
                  stackIn_49_1 = stackOut_48_1;
                  stackIn_49_2 = stackOut_48_2;
                  break L14;
                } else {
                  stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
                  stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
                  stackOut_47_2 = "{...}";
                  stackIn_49_0 = stackOut_47_0;
                  stackIn_49_1 = stackOut_47_1;
                  stackIn_49_2 = stackOut_47_2;
                  break L14;
                }
              }
              L15: {
                stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
                stackOut_49_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(',');
                stackIn_51_0 = stackOut_49_0;
                stackIn_51_1 = stackOut_49_1;
                stackIn_50_0 = stackOut_49_0;
                stackIn_50_1 = stackOut_49_1;
                if (param2 == null) {
                  stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
                  stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
                  stackOut_51_2 = "null";
                  stackIn_52_0 = stackOut_51_0;
                  stackIn_52_1 = stackOut_51_1;
                  stackIn_52_2 = stackOut_51_2;
                  break L15;
                } else {
                  stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
                  stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
                  stackOut_50_2 = "{...}";
                  stackIn_52_0 = stackOut_50_0;
                  stackIn_52_1 = stackOut_50_1;
                  stackIn_52_2 = stackOut_50_2;
                  break L15;
                }
              }
              throw kk.a((Throwable) ((Object) stackIn_52_0), stackIn_52_2 + ',' + param3 + ',' + param4 + ')');
            }
            return stackIn_40_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(n param0, int param1, byte param2, char param3) {
        RuntimeException var5 = null;
        rm var6 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        int stackOut_1_0 = 0;
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
            if ((param1 ^ -1) != -14) {
              L1: {
                if (param2 == -78) {
                  break L1;
                } else {
                  var6 = (rm) null;
                  this.a(-76, (rm) null, 64, 32, -8);
                  break L1;
                }
              }
              stackOut_5_0 = super.a(param0, param1, (byte) -78, param3);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.h((byte) -102);
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("ab.T(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0;
        }
    }

    final static void a(int param0, byte param1) {
        boolean discarded$0 = false;
        aj.field_d = ei.field_f[param0];
        rg.field_f = lj.field_c[param0];
        pb.field_d = kl.field_r[param0];
        if (param1 <= 76) {
            discarded$0 = ab.n(-60);
        }
    }

    final void a(boolean param0, String param1, int param2) {
        rm discarded$2 = null;
        rm discarded$3 = null;
        RuntimeException var4 = null;
        nh var4_ref = null;
        int var5 = 0;
        nh var6 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        nh stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        nh stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        nh stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        String stackIn_16_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        nh stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        nh stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        String stackOut_15_2 = null;
        nh stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        String stackOut_14_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var5 = HoldTheLine.field_D;
        try {
          L0: {
            if (this.field_qb) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                stackOut_4_0 = this;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if ((param2 ^ -1) != -257) {
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
                ((ab) (this)).field_mb = stackIn_7_1 != 0;
                stackOut_7_0 = this;
                stackIn_9_0 = stackOut_7_0;
                stackIn_8_0 = stackOut_7_0;
                if (!param0) {
                  stackOut_9_0 = this;
                  stackOut_9_1 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  break L2;
                } else {
                  stackOut_8_0 = this;
                  stackOut_8_1 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  break L2;
                }
              }
              L3: {
                ((ab) (this)).field_qb = stackIn_10_1 != 0;
                this.field_rb.a(8405024, 4210752, false);
                var6 = new nh((ab) (this), this.field_nb, param1);
                var4_ref = var6;
                if (5 != param2) {
                  if (param2 == 256) {
                    discarded$2 = var6.a(88, (tb) (this), lg.field_p);
                    break L3;
                  } else {
                    L4: {
                      stackOut_13_0 = (nh) (var6);
                      stackOut_13_1 = -1;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      if (this.field_kb) {
                        stackOut_15_0 = (nh) ((Object) stackIn_15_0);
                        stackOut_15_1 = stackIn_15_1;
                        stackOut_15_2 = lg.field_p;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        stackIn_16_2 = stackOut_15_2;
                        break L4;
                      } else {
                        stackOut_14_0 = (nh) ((Object) stackIn_14_0);
                        stackOut_14_1 = stackIn_14_1;
                        stackOut_14_2 = kn.field_i;
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        stackIn_16_2 = stackOut_14_2;
                        break L4;
                      }
                    }
                    ((nh) (Object) stackIn_16_0).a(stackIn_16_1, stackIn_16_2, (byte) 59);
                    break L3;
                  }
                } else {
                  var6.a(11, vn.field_b, (byte) 69);
                  var6.a(17, dl.field_n, (byte) 97);
                  break L3;
                }
              }
              L5: {
                if (param2 == 3) {
                  var6.a(7, ek.field_u, (byte) 122);
                  break L5;
                } else {
                  if (-5 != (param2 ^ -1)) {
                    if (-7 == (param2 ^ -1)) {
                      var6.a(9, gb.field_d, (byte) 68);
                      break L5;
                    } else {
                      if (-10 != (param2 ^ -1)) {
                        break L5;
                      } else {
                        discarded$3 = var6.a(49, (tb) (this), uh.field_e);
                        break L5;
                      }
                    }
                  } else {
                    var6.a(8, vn.field_a, (byte) 65);
                    break L5;
                  }
                }
              }
              this.a((n) (var6), (byte) 79);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var4);
            stackOut_28_1 = new StringBuilder().append("ab.AA(").append(param0).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L6;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L6;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_pb = -1;
    }
}
