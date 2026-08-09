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
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_8_0 = (RuntimeException) (var6);

            stackIn_8_1 = new StringBuilder().append("ab.M(").append(param0).append(',');

            if (param1 == null) {
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
          throw kk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void o(int param0) {
        nh var2;
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
        if (param0 < 103) {
          L0: {
            field_pb = 24;
            if (ak.field_b != sf.field_n) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (ak.field_b != sf.field_n) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static java.net.URL a(String param0, String param1, java.net.URL param2, byte param3, int param4) {
        try {
            StringBuilder discarded$0 = null;
            StringBuilder discarded$1 = null;
            StringBuilder discarded$2 = null;
            StringBuilder discarded$3 = null;
            StringBuilder discarded$4 = null;
            StringBuilder discarded$5 = null;
            StringBuilder discarded$6 = null;
            StringBuilder discarded$7 = null;
            StringBuilder discarded$8 = null;
            java.net.URL stackIn_40_0 = null;
            java.net.URL stackIn_42_0 = null;
            RuntimeException stackIn_45_0 = null;
            StringBuilder stackIn_45_1 = null;
            RuntimeException stackIn_46_0 = null;
            StringBuilder stackIn_46_1 = null;
            String stackIn_46_2 = null;
            StringBuilder stackIn_48_1 = null;
            StringBuilder stackIn_49_1 = null;
            String stackIn_49_2 = null;
            StringBuilder stackIn_51_1 = null;
            StringBuilder stackIn_52_1 = null;
            String stackIn_52_2 = null;
            Throwable decompiledCaughtException = null;
            String var5 = null;
            RuntimeException var5_ref = null;
            int var6 = 0;
            int var7 = 0;
            int var8_int = 0;
            StringBuilder var8 = null;
            Exception var9 = null;
            int var10 = 0;
            var10 = HoldTheLine.field_D;
            try {
              L0: {
                var5 = param2.getFile();
                var7 = -22 / ((param3 - -36) / 60);
                var6 = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      if (var5.regionMatches(var6, "/l=", 0, 3)) {
                        var8_int = var5.indexOf('/', var6 - -1);
                        if (var8_int >= 0) {
                          if (-1 < (param4 ^ -1)) {
                            break L2;
                          } else {
                            var5 = var5.substring(0, var6) + var5.substring(var8_int);
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
                      if (var5.regionMatches(var6, "/a=", 0, 3)) {
                        var8_int = var5.indexOf('/', 1 + var6);
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
                      if (var5.regionMatches(var6, "/p=", 0, 3)) {
                        var8_int = var5.indexOf('/', var6 - -1);
                        if (0 > var8_int) {
                          break L5;
                        } else {
                          if (param0 != null) {
                            var5 = var5.substring(0, var6) + var5.substring(var8_int);
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
                        if (var5.regionMatches(var6, "/s=", 0, 3)) {
                          break L7;
                        } else {
                          if (var5.regionMatches(var6, "/c=", 0, 3)) {
                            break L7;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var8_int = var5.indexOf('/', 1 + var6);
                      if (0 > var8_int) {
                        break L6;
                      } else {
                        if (param1 != null) {
                          var5 = var5.substring(0, var6) + var5.substring(var8_int);
                          continue L1;
                        } else {
                          var6 = var8_int;
                          continue L1;
                        }
                      }
                    }
                    L8: {
                      var8 = new StringBuilder(var6);
                      discarded$0 = var8.append(var5.substring(0, var6));
                      if (param4 <= 0) {
                        break L8;
                      } else {
                        discarded$1 = var8.append("/l=");
                        discarded$2 = var8.append(Integer.toString(param4));
                        break L8;
                      }
                    }
                    L9: {
                      if (param0 == null) {
                        break L9;
                      } else {
                        if (0 < param0.length()) {
                          discarded$3 = var8.append("/p=");
                          discarded$4 = var8.append(param0);
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
                          discarded$5 = var8.append("/s=");
                          discarded$6 = var8.append(param1);
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (var5.length() > var6) {
                        discarded$7 = var8.append(var5.substring(var6, var5.length()));
                        break L11;
                      } else {
                        discarded$8 = var8.append('/');
                        break L11;
                      }
                    }
                    try {
                      L12: {
                        stackIn_40_0 = new java.net.URL(param2, var8.toString());
                        break L12;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var9 = (Exception) (Object) decompiledCaughtException;
                      var9.printStackTrace();
                      stackIn_42_0 = (java.net.URL) (param2);
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
                var5_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_45_0 = (RuntimeException) (var5_ref);

                stackIn_45_1 = new StringBuilder().append("ab.V(");

                if (param0 == null) {
                  stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
                  stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
                  stackIn_46_2 = "null";
                  break L13;
                } else {
                  stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
                  stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
                  stackIn_46_2 = "{...}";
                  break L13;
                }
              }
              L14: {


                stackIn_48_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(',');

                if (param1 == null) {
                  stackIn_46_0 = (RuntimeException) ((Object) stackIn_46_0);
                  stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
                  stackIn_49_2 = "null";
                  break L14;
                } else {
                  stackIn_46_0 = (RuntimeException) ((Object) stackIn_46_0);
                  stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
                  stackIn_49_2 = "{...}";
                  break L14;
                }
              }
              L15: {


                stackIn_51_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(',');

                if (param2 == null) {
                  stackIn_46_0 = (RuntimeException) ((Object) stackIn_46_0);
                  stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
                  stackIn_52_2 = "null";
                  break L15;
                } else {
                  stackIn_46_0 = (RuntimeException) ((Object) stackIn_46_0);
                  stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
                  stackIn_52_2 = "{...}";
                  break L15;
                }
              }
              throw kk.a((Throwable) ((Object) stackIn_46_0), stackIn_52_2 + ',' + param3 + ',' + param4 + ')');
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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
              stackIn_6_0 = super.a(param0, param1, (byte) -78, param3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.h((byte) -102);
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

            stackIn_9_1 = new StringBuilder().append("ab.T(");

            if (param0 == null) {
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
          throw kk.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0;
        }
    }

    final static void a(int param0, byte param1) {
        aj.field_d = ei.field_f[param0];
        rg.field_f = lj.field_c[param0];
        pb.field_d = kl.field_r[param0];
        if (param1 <= 76) {
            ab.n(-60);
        }
    }

    final void a(boolean param0, String param1, int param2) {
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        nh stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        nh stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        String stackIn_16_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        nh var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        nh var6 = null;
        var5 = HoldTheLine.field_D;
        try {
          L0: {
            if (this.field_qb) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                stackIn_6_0 = this;

                if ((param2 ^ -1) != -257) {
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
                ((ab) (this)).field_mb = stackIn_7_1 != 0;
                stackIn_9_0 = this;

                if (!param0) {
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
                ((ab) (this)).field_qb = stackIn_10_1 != 0;
                this.field_rb.a(8405024, 4210752, false);
                var6 = new nh((ab) (this), this.field_nb, param1);
                var4 = var6;
                if (5 != param2) {
                  if (param2 == 256) {
                    var6.a(88, (tb) (this), lg.field_p);
                    break L3;
                  } else {
                    L4: {
                      stackIn_15_0 = (nh) (var6);

                      stackIn_15_1 = -1;

                      if (this.field_kb) {
                        stackIn_16_0 = (nh) ((Object) stackIn_15_0);
                        stackIn_16_1 = stackIn_15_1;
                        stackIn_16_2 = lg.field_p;
                        break L4;
                      } else {
                        stackIn_16_0 = (nh) ((Object) stackIn_15_0);
                        stackIn_16_1 = stackIn_15_1;
                        stackIn_16_2 = kn.field_i;
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
                        var6.a(49, (tb) (this), uh.field_e);
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
            var4_ref = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var4_ref);

            stackIn_30_1 = new StringBuilder().append("ab.AA(").append(param0).append(',');

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
