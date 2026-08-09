/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl {
    private bf field_d;
    static boolean[] field_c;
    static boolean field_b;
    private bf field_e;
    static String field_f;
    static long[] field_a;

    public static void b(byte param0) {
        field_c = null;
        field_f = null;
        if (param0 != 54) {
            field_c = (boolean[]) null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final void c(int param0) {
        bf var2 = null;
        int var3 = 0;
        String var4 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    var2 = this.field_d.field_g;
                    if (this.field_d == var2) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var2.a(7847);
                    statePc = 7;
                    continue stateLoop;
                }
                case 3: {
                    if (var3 != 0) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var3 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var2.a(7847);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (var3 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    this.field_e = null;
                    if (param0 == 32) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var4 = (String) null;
                    dl.a((java.applet.Applet) null, 95, (String) null);
                    return;
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final bf a(boolean param0) {
        bf var2;
        var2 = this.field_d.field_g;
        if (this.field_d != var2) {
          if (!param0) {
            return (bf) null;
          } else {
            this.field_e = var2.field_g;
            return var2;
          }
        } else {
          this.field_e = null;
          return null;
        }
    }

    final bf c(byte param0) {
        bf var2 = null;
        if (param0 != -75) {
            this.c(82);
            var2 = this.field_e;
            if (!(this.field_d != var2)) {
                this.field_e = null;
                return null;
            }
            this.field_e = var2.field_g;
            return var2;
        }
        var2 = this.field_e;
        if (!(this.field_d != var2)) {
            this.field_e = null;
            return null;
        }
        this.field_e = var2.field_g;
        return var2;
    }

    final void a(bf param0, byte param1) {
        try {
            if (!(param0.field_e == null)) {
                param0.a(7847);
            }
            param0.field_g = this.field_d;
            param0.field_e = this.field_d.field_e;
            param0.field_e.field_g = param0;
            int var3_int = 73 % ((param1 - 44) / 45);
            param0.field_g.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "dl.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int a(int param0) {
        int var2;
        bf var3;
        int var4;
        String var5;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        var2 = 0;
        if (param0 >= -68) {
          var5 = (String) null;
          dl.a((java.applet.Applet) null, -12, (String) null);
          var3 = this.field_d.field_g;
          L0: while (true) {
            L1: {
              if (var3 == this.field_d) {
                break L1;
              } else {
                var3 = var3.field_g;
                var2++;
                if (var4 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            return var2;
          }
        } else {
          var3 = this.field_d.field_g;
          L2: while (true) {
            L3: {
              if (var3 == this.field_d) {
                break L3;
              } else {
                var3 = var3.field_g;
                var2++;
                if (var4 == 0) {
                  continue L2;
                } else {
                  break L3;
                }
              }
            }
            return var2;
          }
        }
    }

    final static String a(java.applet.Applet param0, int param1, String param2) {
        try {
            RuntimeException var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String var8 = null;
            String stackIn_10_0 = null;
            Object stackIn_15_0 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            StringBuilder stackIn_21_1 = null;
            StringBuilder stackIn_22_1 = null;
            String stackIn_22_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var3_ref = null;
            var7 = MonkeyPuzzle2.field_F ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var8 = (String) (mf.a(param1 ^ -20969, "getcookies", param0));
                      var4 = ma.a(127, ';', var8);
                      var5 = 0;
                      if (param1 == 14278) {
                        break L2;
                      } else {
                        field_c = (boolean[]) null;
                        break L2;
                      }
                    }
                    L3: while (true) {
                      L4: {
                        if (var4.length <= var5) {
                          break L4;
                        } else {
                          var6 = var4[var5].indexOf('=');
                          if (var7 == 0) {
                            L5: {
                              if (-1 < (var6 ^ -1)) {
                                break L5;
                              } else {
                                if (var4[var5].substring(0, var6).trim().equals(param2)) {
                                  stackIn_10_0 = var4[var5].substring(var6 - -1).trim();
                                  decompiledRegionSelector0 = 1;
                                  break L1;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            var5++;
                            if (var7 == 0) {
                              continue L3;
                            } else {
                              break L4;
                            }
                          } else {
                            return null;
                          }
                        }
                      }
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L6: {
                    var3_ref = decompiledCaughtException;
                    decompiledRegionSelector0 = 0;
                    break L6;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  stackIn_15_0 = null;
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var3 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_18_0 = (RuntimeException) (var3);

                stackIn_18_1 = new StringBuilder().append("dl.G(");

                if (param0 == null) {
                  stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "null";
                  break L7;
                } else {
                  stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "{...}";
                  break L7;
                }
              }
              L8: {


                stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
                  stackIn_22_2 = "null";
                  break L8;
                } else {
                  stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
                  stackIn_22_2 = "{...}";
                  break L8;
                }
              }
              throw la.a((Throwable) ((Object) stackIn_19_0), stackIn_22_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return (String) ((Object) stackIn_15_0);
            } else {
              return stackIn_10_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static cj b(int param0) {
        if (param0 != 0) {
            return (cj) null;
        }
        if (!(di.field_a != ch.field_d)) {
            throw new IllegalStateException();
        }
        if (!(f.field_i != ch.field_d)) {
            ch.field_d = di.field_a;
            return cg.field_a;
        }
        return null;
    }

    public dl() {
        this.field_d = new bf();
        this.field_d.field_e = this.field_d;
        this.field_d.field_g = this.field_d;
    }

    final bf a(byte param0) {
        bf var2;
        var2 = this.field_d.field_g;
        if (param0 == -120) {
          if (this.field_d == var2) {
            return null;
          } else {
            var2.a(7847);
            return var2;
          }
        } else {
          return (bf) null;
        }
    }

    final void a(int param0, bf param1) {
        try {
            if (null != param1.field_e) {
                param1.a(7847);
            }
            param1.field_g = this.field_d.field_g;
            if (param0 > -104) {
                field_a = (long[]) null;
            }
            param1.field_e = this.field_d;
            param1.field_e.field_g = param1;
            param1.field_g.field_e = param1;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "dl.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, ad param1) {
        le var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
            if (param0 != 11405) {
                field_b = false;
            }
            var2 = new le(param1.a("", "final_frame.jpg", 25), (java.awt.Component) ((Object) ie.field_e));
            var3 = var2.field_k;
            var4 = var2.field_j;
            vf.a((byte) 127);
            ki.field_H = new le(var3, var4 * 3 / 4);
            ki.field_H.e();
            var2.a(0, 0);
            dj.field_b = new le(var3, -ki.field_H.field_j + var4);
            dj.field_b.e();
            var2.a(0, -ki.field_H.field_j);
            dj.field_b.field_q = ki.field_H.field_j;
            tj.b(653);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "dl.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = new boolean[112];
        field_b = false;
        field_a = new long[32];
        field_f = "Music: ";
    }
}
