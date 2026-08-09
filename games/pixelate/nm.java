/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm {
    static String field_b;
    private bb field_a;
    static tf field_f;
    private fa field_e;
    static int field_c;
    static boolean field_d;

    final fa a(byte param0) {
        fa var2 = this.field_e;
        if (var2 == this.field_a.field_f) {
            this.field_e = null;
            return null;
        }
        this.field_e = var2.field_a;
        if (param0 != -104) {
            return (fa) null;
        }
        return var2;
    }

    public static void a(boolean param0) {
        field_b = null;
        if (param0) {
            nm.c(44);
        }
        field_f = null;
    }

    final fa d(int param0) {
        fa var2 = this.field_a.field_f.field_a;
        if (param0 != 0) {
            field_b = (String) null;
        }
        if (this.field_a.field_f == var2) {
            this.field_e = null;
            return null;
        }
        this.field_e = var2.field_a;
        return var2;
    }

    final static void c(int param0) {
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        uj var1 = null;
        eq var1_ref = null;
        RuntimeException var1_ref2 = null;
        int var2 = 0;
        String var3 = null;
        var2 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                var3 = (String) null;
                nm.a((String) null, -43);
                break L1;
              }
            }
            var1 = (uj) ((Object) i.field_n.c(1504642273));
            L2: while (true) {
              if (var1 == null) {
                var1_ref = (eq) ((Object) nk.field_a.c(param0 ^ -1504642274));
                L3: while (true) {
                  if (var1_ref == null) {
                    var1 = (uj) ((Object) wi.field_a.c(1504642273));
                    L4: while (true) {
                      if (var1 == null) {
                        break L0;
                      } else {
                        stackIn_23_0 = -1;
                        L5: {
                          if (stackIn_23_0 <= (var1.field_Tb ^ -1)) {
                            break L5;
                          } else {
                            var1.field_Tb = var1.field_Tb - 1;
                            if (var1.field_Tb == 0) {
                              var1.field_Eb = 0;
                              if (!var1.b((byte) -116)) {
                                break L5;
                              } else {
                                var1.c(2779);
                                break L5;
                              }
                            } else {
                              var1 = (uj) ((Object) wi.field_a.f(1504642273));
                              continue L4;
                            }
                          }
                        }
                        var1 = (uj) ((Object) wi.field_a.f(1504642273));
                        continue L4;
                      }
                    }
                  } else {
                    L6: {
                      if (-1 > (var1_ref.field_Rb ^ -1)) {
                        var1_ref.field_Rb = var1_ref.field_Rb - 1;
                        if (-1 == (var1_ref.field_Rb ^ -1)) {
                          var1_ref.field_Qb = 0;
                          if (!var1_ref.j(433)) {
                            break L6;
                          } else {
                            var1_ref.c(2779);
                            break L6;
                          }
                        } else {
                          break L6;
                        }
                      } else {
                        break L6;
                      }
                    }
                    var1_ref = (eq) ((Object) nk.field_a.f(1504642273));
                    continue L3;
                  }
                }
              } else {
                L7: {
                  if (var1.field_Tb <= 0) {
                    break L7;
                  } else {
                    var1.field_Tb = var1.field_Tb - 1;
                    if (var1.field_Tb != 0) {
                      break L7;
                    } else {
                      var1.field_Eb = 0;
                      if (var1.b((byte) 109)) {
                        var1.c(param0 ^ -2780);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                var1 = (uj) ((Object) i.field_n.f(param0 ^ -1504642274));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1_ref2), "nm.I(" + param0 + ')');
        }
    }

    final fa b(byte param0, fa param1) {
        fa var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        fa stackIn_8_0 = null;
        fa stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 != null) {
                var3 = param1;
                break L1;
              } else {
                var3 = this.field_a.field_f.field_a;
                break L1;
              }
            }
            if (this.field_a.field_f != var3) {
              this.field_e = var3.field_a;
              if (param0 < -72) {
                stackIn_10_0 = (fa) (var3);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_8_0 = (fa) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              this.field_e = null;
              stackIn_5_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("nm.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (fa) ((Object) stackIn_5_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    final static void b(boolean param0) {
        String var2 = (String) null;
        al.a("", -110, (String) null);
        if (!param0) {
            field_f = (tf) null;
        }
    }

    final fa e(int param0) {
        fa var2 = this.field_e;
        if (!(this.field_a.field_f != var2)) {
            this.field_e = null;
            return null;
        }
        if (param0 > -56) {
            return (fa) null;
        }
        this.field_e = var2.field_h;
        return var2;
    }

    final fa a(byte param0, fa param1) {
        fa var3 = null;
        RuntimeException var3_ref = null;
        fa var4 = null;
        Object stackIn_6_0 = null;
        fa stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 != null) {
                var3 = param1;
                break L1;
              } else {
                var3 = this.field_a.field_f.field_h;
                break L1;
              }
            }
            if (var3 == this.field_a.field_f) {
              this.field_e = null;
              stackIn_6_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                this.field_e = var3.field_h;
                if (param0 == -99) {
                  break L2;
                } else {
                  var4 = (fa) null;
                  this.b((byte) -11, (fa) null);
                  break L2;
                }
              }
              stackIn_10_0 = (fa) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("nm.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (fa) ((Object) stackIn_6_0);
        } else {
          return stackIn_10_0;
        }
    }

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (param1 >= 18) {
              var2_int = 0;
              L1: while (true) {
                if (var2_int >= param0.length()) {
                  stackIn_13_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L2: {
                    var3 = param0.charAt(var2_int);
                    if (tk.a(-66, (char) var3)) {
                      break L2;
                    } else {
                      if (!ti.a(57, (char) var3)) {
                        stackIn_10_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var2_int++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2);

            stackIn_16_1 = new StringBuilder().append("nm.K(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    final fa b(int param0) {
        if (param0 != -1) {
            field_c = 52;
        }
        fa var2 = this.field_a.field_f.field_h;
        if (var2 == this.field_a.field_f) {
            this.field_e = null;
            return null;
        }
        this.field_e = var2.field_h;
        return var2;
    }

    final static void a(int param0) {
        if (fc.field_e == ti.field_t) {
            return;
        }
        if (!(!tk.a((byte) -104, fc.field_e))) {
            wo.b(126, fc.field_e).a(true);
        }
        fc.field_e = ti.field_t;
        if (og.field_l) {
            og.field_l = false;
            qo.field_r = null;
            ro.field_e = null;
        }
        ec.field_t = param0;
        if (!(!ce.field_a)) {
            wh.field_p = null;
            nj.field_h = new bb();
            go.field_k = 0;
            ce.field_a = false;
            de.field_n = 0;
        }
        if (!(!mi.field_o)) {
            ak.i(param0 ^ 0);
            kj.a(23949);
            bd.a((byte) -1);
            mi.field_o = false;
        }
    }

    nm(bb param0) {
        try {
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "nm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Clan";
        field_d = false;
        field_c = 0;
    }
}
