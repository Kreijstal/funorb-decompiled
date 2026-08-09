/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl extends ff {
    private String field_d;
    static int field_h;
    static bk field_e;
    private String field_f;
    static long field_c;
    static de field_g;

    public static void c(byte param0) {
        field_e = null;
        if (param0 < 123) {
            return;
        }
        field_g = null;
    }

    final void a(int param0, pb param1) {
        try {
            if (param0 != -1) {
                field_e = (bk) null;
            }
            param1.a(744825352, this.field_f);
            param1.b(this.field_d, 15045);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "jl.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(byte param0) {
        if (param0 != 22) {
            return;
        }
        if (null != wd.field_e) {
            wd.field_e.c();
        }
        if (!(null == cb.field_g)) {
            cb.field_g.c();
        }
    }

    final fe a(byte param0) {
        if (param0 != -24) {
            this.field_d = (String) null;
        }
        return tf.field_o;
    }

    final static String a(boolean param0, CharSequence param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_13_0 = null;
        String stackIn_18_0 = null;
        String stackIn_30_0 = null;
        String stackIn_35_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Main.field_T;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                var3_int = param1.length();
                if (1 > var3_int) {
                  break L1;
                } else {
                  if (12 < var3_int) {
                    break L1;
                  } else {
                    L2: {
                      var4 = ff.a((byte) 116, param1);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (-2 >= (var4.length() ^ -1)) {
                          L3: {
                            if (tg.a((byte) -63, var4.charAt(0))) {
                              break L3;
                            } else {
                              if (tg.a((byte) -63, var4.charAt(var4.length() + -1))) {
                                break L3;
                              } else {
                                L4: {
                                  var5 = 0;
                                  if (!param0) {
                                    break L4;
                                  } else {
                                    jl.c((byte) 94);
                                    break L4;
                                  }
                                }
                                var6 = 0;
                                L5: while (true) {
                                  if (var6 >= param1.length()) {
                                    if (0 < var5) {
                                      stackIn_35_0 = kl.field_P;
                                      decompiledRegionSelector0 = 5;
                                      break L0;
                                    } else {
                                      return null;
                                    }
                                  } else {
                                    L6: {
                                      var7 = param1.charAt(var6);
                                      if (!tg.a((byte) -63, (char) var7)) {
                                        var5 = 0;
                                        break L6;
                                      } else {
                                        var5++;
                                        break L6;
                                      }
                                    }
                                    L7: {
                                      if (2 > var5) {
                                        break L7;
                                      } else {
                                        if (!param2) {
                                          stackIn_30_0 = g.field_B;
                                          decompiledRegionSelector0 = 4;
                                          break L0;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    var6++;
                                    continue L5;
                                  }
                                }
                              }
                            }
                          }
                          stackIn_18_0 = kl.field_P;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackIn_13_0 = ke.field_b;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              stackIn_8_0 = ke.field_b;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = ke.field_b;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_38_0 = (RuntimeException) (var3);

            stackIn_38_1 = new StringBuilder().append("jl.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L8;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L8;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_30_0;
                } else {
                  return stackIn_35_0;
                }
              }
            }
          }
        }
    }

    jl(String param0, String param1) {
        try {
            this.field_d = param1;
            this.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "jl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = 20971555;
        field_g = new de(15, 0, 1, 0);
    }
}
