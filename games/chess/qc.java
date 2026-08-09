/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qc {
    static km[][] field_d;
    private v field_f;
    static long field_a;
    private um field_g;
    private um field_b;
    static int field_e;
    static String field_c;

    final dj a(byte param0, int param1) {
        dj var3;
        byte[] var4;
        var3 = (dj) (this.field_f.a((byte) -77, (long)param1));
        if (var3 == null) {
          L0: {
            if (param1 >= 32768) {
              var4 = this.field_b.a(1, param1 & 32767, 5847);
              break L0;
            } else {
              var4 = this.field_g.a(1, param1, 5847);
              break L0;
            }
          }
          if (param0 != 79) {
            return (dj) null;
          } else {
            L1: {
              var3 = new dj();
              if (var4 != null) {
                var3.a(new p(var4), true);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if ((param1 ^ -1) <= -32769) {
                var3.f(32768);
                break L2;
              } else {
                break L2;
              }
            }
            this.field_f.a((long)param1, param0 ^ 78, var3);
            return var3;
          }
        } else {
          return var3;
        }
    }

    final static String a(CharSequence param0, boolean param1, byte param2) {
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_15_0 = null;
        String stackIn_20_0 = null;
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
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        CharSequence var9 = null;
        var8 = Chess.field_G;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                var3_int = param0.length();
                if (1 > var3_int) {
                  break L1;
                } else {
                  if (12 < var3_int) {
                    break L1;
                  } else {
                    L2: {
                      var4 = ad.a(param0, -2);
                      if (param2 >= 63) {
                        break L2;
                      } else {
                        var9 = (CharSequence) null;
                        qc.a((CharSequence) null, false, (byte) 34);
                        break L2;
                      }
                    }
                    L3: {
                      if (var4 == null) {
                        break L3;
                      } else {
                        if (var4.length() >= 1) {
                          L4: {
                            if (cg.a(2, var4.charAt(0))) {
                              break L4;
                            } else {
                              if (cg.a(2, var4.charAt(var4.length() + -1))) {
                                break L4;
                              } else {
                                var5 = 0;
                                var6 = 0;
                                L5: while (true) {
                                  if (param0.length() <= var6) {
                                    if (0 < var5) {
                                      stackIn_34_0 = am.field_a;
                                      decompiledRegionSelector0 = 5;
                                      break L0;
                                    } else {
                                      return null;
                                    }
                                  } else {
                                    L6: {
                                      var7 = param0.charAt(var6);
                                      if (!cg.a(2, (char) var7)) {
                                        var5 = 0;
                                        break L6;
                                      } else {
                                        var5++;
                                        break L6;
                                      }
                                    }
                                    L7: {
                                      if (-3 < (var5 ^ -1)) {
                                        break L7;
                                      } else {
                                        if (param1) {
                                          break L7;
                                        } else {
                                          stackIn_29_0 = ji.field_Q;
                                          decompiledRegionSelector0 = 4;
                                          break L0;
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
                          stackIn_20_0 = am.field_a;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    stackIn_15_0 = sh.field_d;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              stackIn_8_0 = sh.field_d;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = sh.field_d;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_37_0 = (RuntimeException) (var3);

            stackIn_37_1 = new StringBuilder().append("qc.C(");

            if (param0 == null) {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L8;
            } else {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L8;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_20_0;
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

    public static void a(int param0) {
        field_c = null;
        if (param0 != 7) {
            return;
        }
        field_d = (km[][]) null;
    }

    qc(int param0, um param1, um param2, ui param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_f = new v(64);
        try {
          L0: {
            L1: {
              this.field_g = param1;
              this.field_b = param2;
              if (null == this.field_g) {
                break L1;
              } else {
                this.field_g.a((byte) -57, 1);
                break L1;
              }
            }
            if (null == this.field_b) {
              break L0;
            } else {
              this.field_b.a((byte) -98, 1);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("qc.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_9_0), stackIn_15_2 + ')');
        }
    }

    static {
        field_d = new km[2][7];
        field_c = "Hide players in <%0>'s game";
    }
}
