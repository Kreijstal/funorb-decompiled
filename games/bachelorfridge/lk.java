/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk extends bca {
    static int field_q;
    static int field_r;

    final static String a(CharSequence param0, boolean param1, byte param2) {
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_14_0 = null;
        String stackIn_19_0 = null;
        String stackIn_29_0 = null;
        String stackIn_34_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            if (param0 == null) {
              stackIn_4_0 = tb.field_a;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var3_int = param0.length();
                var4 = 57 / ((71 - param2) / 51);
                if (-2 < (var3_int ^ -1)) {
                  break L1;
                } else {
                  if (12 < var3_int) {
                    break L1;
                  } else {
                    L2: {
                      var5 = fq.a(0, param0);
                      if (var5 == null) {
                        break L2;
                      } else {
                        if (1 > var5.length()) {
                          break L2;
                        } else {
                          L3: {
                            if (mp.a(true, var5.charAt(0))) {
                              break L3;
                            } else {
                              if (!mp.a(true, var5.charAt(var5.length() - 1))) {
                                var6 = 0;
                                var7 = 0;
                                L4: while (true) {
                                  if (param0.length() <= var7) {
                                    if ((var6 ^ -1) < -1) {
                                      stackIn_34_0 = oga.field_r;
                                      decompiledRegionSelector0 = 5;
                                      break L0;
                                    } else {
                                      return null;
                                    }
                                  } else {
                                    L5: {
                                      var8 = param0.charAt(var7);
                                      if (!mp.a(true, (char) var8)) {
                                        var6 = 0;
                                        break L5;
                                      } else {
                                        var6++;
                                        break L5;
                                      }
                                    }
                                    L6: {
                                      if (var6 < 2) {
                                        break L6;
                                      } else {
                                        if (!param1) {
                                          stackIn_29_0 = jr.field_a;
                                          decompiledRegionSelector0 = 4;
                                          break L0;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                    var7++;
                                    continue L4;
                                  }
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          stackIn_19_0 = oga.field_r;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    }
                    stackIn_14_0 = tb.field_a;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              stackIn_9_0 = tb.field_a;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_37_0 = (RuntimeException) (var3);

            stackIn_37_1 = new StringBuilder().append("lk.D(");

            if (param0 == null) {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L7;
            } else {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L7;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_29_0;
                } else {
                  return stackIn_34_0;
                }
              }
            }
          }
        }
    }

    lk(int param0, nq param1) {
        super(param0, param1);
    }

    lk(lu param0) {
        super(param0);
        int var2_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            this.field_k = param0.e((byte) 85);
            this.field_o = new eaa();
            var2_int = param0.b(16711935);
            L1: while (true) {
              var2_int--;
              if (var2_int < 0) {
                break L0;
              } else {
                this.field_o.a(dca.a((byte) 102, param0), true);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("lk.<init>(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        CharSequence var4 = null;
        nt stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 5) {
                break L1;
              } else {
                var4 = (CharSequence) null;
                lk.a((CharSequence) null, true, (byte) 120);
                break L1;
              }
            }
            stackIn_3_0 = new nt(param1, (lk) (this));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("lk.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return (at) ((Object) stackIn_3_0);
    }

    final static uha c(int param0, int param1) {
        CharSequence var3;
        eo stackIn_4_0 = null;
        eo stackIn_8_0 = null;
        if (param0 != -12411) {
          L0: {
            var3 = (CharSequence) null;
            lk.a((CharSequence) null, true, (byte) 50);
            if (null == ola.field_g) {
              stackIn_8_0 = null;
              break L0;
            } else {
              stackIn_8_0 = ola.field_g.a((long)param1, (byte) -87);
              break L0;
            }
          }
          return (uha) ((Object) stackIn_8_0);
        } else {
          L1: {
            if (null == ola.field_g) {
              stackIn_4_0 = null;
              break L1;
            } else {
              stackIn_4_0 = ola.field_g.a((long)param1, (byte) -87);
              break L1;
            }
          }
          return (uha) ((Object) stackIn_4_0);
        }
    }

    final static boolean d(int param0) {
        if (param0 != 2) {
            return false;
        }
        if (null == wh.field_p) {
            return false;
        }
        if (!wh.field_p.b(true)) {
            return false;
        }
        return true;
    }

    final void a(op param0, int param1) {
        try {
            int var3_int = 49 / ((12 - param1) / 35);
            this.a(param0, (byte) -2);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "lk.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
