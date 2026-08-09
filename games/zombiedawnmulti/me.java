/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me {
    static String field_m;
    static String field_e;
    private ul field_b;
    static String field_c;
    static vk field_k;
    private f field_i;
    static int field_h;
    static int[] field_f;
    static String field_d;
    static boolean field_g;
    private ul field_l;
    static String field_j;
    private f field_a;

    final jd a(int param0, byte param1, int[] param2) {
        RuntimeException var4 = null;
        byte[] var5 = null;
        jd stackIn_2_0 = null;
        jd stackIn_5_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (1 != this.field_l.c(-1)) {
              if (-2 != (this.field_l.d(param0, -2) ^ -1)) {
                L1: {
                  if (param1 == -64) {
                    break L1;
                  } else {
                    var5 = (byte[]) null;
                    me.a((byte[]) null, false);
                    break L1;
                  }
                }
                throw new RuntimeException();
              } else {
                stackIn_5_0 = this.a(param0, 0, false, param2);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = this.a(0, param0, false, param2);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("me.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_5_0;
        }
    }

    final jd a(int param0, int[] param1, int param2) {
        RuntimeException var4 = null;
        jd stackIn_3_0 = null;
        jd stackIn_9_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_b.c(-1) == 1) {
              stackIn_3_0 = this.a(-1991540092, param1, 0, param0);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param2 > 99) {
                  break L1;
                } else {
                  field_c = (String) null;
                  break L1;
                }
              }
              if (this.field_b.d(param0, -2) == 1) {
                stackIn_9_0 = this.a(-1991540092, param1, param0, 0);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                throw new RuntimeException();
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("me.C(").append(param0).append(',');

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
          throw fa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_9_0;
        }
    }

    final static bo a(int param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        bo[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        bo var6 = null;
        int var7 = 0;
        bo stackIn_4_0 = null;
        bo stackIn_11_0 = null;
        bo stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var2 = ec.a(param1, (byte) 112, "jagex-last-login-method");
            if (var2 == null) {
              stackIn_4_0 = wi.field_h;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3 = io.a(true);
              var4 = 53 % ((param0 - 52) / 37);
              var5 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var5 >= var3.length) {
                      break L3;
                    } else {
                      var6 = var3[var5];
                      stackIn_14_0 = (bo) (var6);

                      if (var7 != 0) {
                        break L2;
                      } else {
                        if (((bo) (Object) stackIn_14_0).a(var2, (byte) -107)) {
                          stackIn_11_0 = (bo) (var6);
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          var5++;
                          if (var7 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackIn_14_0 = wi.field_h;
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var2_ref);

            stackIn_17_1 = new StringBuilder().append("me.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    public static void a(byte param0) {
        field_m = null;
        field_d = null;
        if (param0 != 119) {
          me.a((byte) -96);
          field_f = null;
          field_e = null;
          field_c = null;
          field_j = null;
          field_k = null;
          return;
        } else {
          field_f = null;
          field_e = null;
          field_c = null;
          field_j = null;
          field_k = null;
          return;
        }
    }

    final static int[] a(int param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        var3 = on.a(param2, -18924);
        var4 = wn.a(-126, param2);
        var5 = on.a(param0, -18924);
        if (param1 != -2106461552) {
          return (int[]) null;
        } else {
          var6 = wn.a(-127, param0);
          var7 = (int)((long)var3 * (long)var5 >> 1988394960);
          var8 = (int)((long)var3 * (long)var6 >> 1889680848);
          var9 = (int)((long)var5 * (long)var4 >> -1063871984);
          var10 = (int)((long)var6 * (long)var4 >> -2106461552);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        }
    }

    final static sl a(byte[] param0, boolean param1) {
        sl var2 = null;
        RuntimeException var2_ref = null;
        sl stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                var2 = new sl(param0, k.field_i, qj.field_o, oq.field_w, vj.field_p, tp.field_t, qp.field_t);
                if (param1) {
                  break L1;
                } else {
                  field_h = -18;
                  break L1;
                }
              }
              fd.h((byte) 126);
              stackIn_6_0 = (sl) (var2);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2_ref);

            stackIn_9_1 = new StringBuilder().append("me.A(");

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
          throw fa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    private final jd a(int param0, int param1, boolean param2, int[] param3) {
        jd stackIn_4_0 = null;
        Object stackIn_8_0 = null;
        f stackIn_15_0 = null;
        f stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        ac stackIn_22_0 = null;
        ac stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        jd stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        jd var8 = null;
        ac var9 = null;
        try {
          L0: {
            L1: {
              var5_int = ((536875007 & param0) << 1153577700 | param0 >>> -1105277716) ^ param1;
              var5_int = var5_int | param0 << -1460177968;
              if (!param2) {
                break L1;
              } else {
                field_h = -103;
                break L1;
              }
            }
            var6 = 4294967296L ^ (long)var5_int;
            var8 = (jd) ((Object) this.field_a.a(0, var6));
            if (var8 == null) {
              L2: {
                if (param3 == null) {
                  break L2;
                } else {
                  if (-1 > (param3[0] ^ -1)) {
                    break L2;
                  } else {
                    stackIn_8_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              L3: {
                var9 = (ac) ((Object) this.field_i.a(0, var6));
                if (var9 != null) {
                  break L3;
                } else {
                  var9 = ac.a(this.field_l, param0, param1);
                  if (var9 != null) {
                    L4: {
                      stackIn_15_0 = this.field_i;

                      if (param2) {
                        stackIn_16_0 = (f) ((Object) stackIn_15_0);
                        stackIn_16_1 = 0;
                        break L4;
                      } else {
                        stackIn_16_0 = (f) ((Object) stackIn_15_0);
                        stackIn_16_1 = 1;
                        break L4;
                      }
                    }
                    ((f) (Object) stackIn_16_0).a(stackIn_16_1 != 0, var6, var9);
                    break L3;
                  } else {
                    return null;
                  }
                }
              }
              var8 = var9.a(param3);
              if (var8 != null) {
                L5: {
                  stackIn_22_0 = (ac) (var9);

                  if (param2) {
                    stackIn_23_0 = (ac) ((Object) stackIn_22_0);
                    stackIn_23_1 = 0;
                    break L5;
                  } else {
                    stackIn_23_0 = (ac) ((Object) stackIn_22_0);
                    stackIn_23_1 = 1;
                    break L5;
                  }
                }
                ((ac) (Object) stackIn_23_0).a(stackIn_23_1 != 0);
                this.field_a.a(true, var6, var8);
                stackIn_24_0 = (jd) (var8);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                return null;
              }
            } else {
              stackIn_4_0 = (jd) (var8);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var5);

            stackIn_27_1 = new StringBuilder().append("me.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L6;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L6;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (jd) ((Object) stackIn_8_0);
          } else {
            return stackIn_24_0;
          }
        }
    }

    private final jd a(int param0, int[] param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        jd var8 = null;
        jc var9 = null;
        jd var10 = null;
        jd stackIn_2_0 = null;
        Object stackIn_9_0 = null;
        jd stackIn_14_0 = null;
        jd stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = (param2 << -1991540092 & 65526 | param2 >>> 871629708) ^ param3;
            var5_int = var5_int | param2 << -376634288;
            var6 = (long)var5_int;
            var8 = (jd) ((Object) this.field_a.a(0, var6));
            if (var8 == null) {
              L1: {
                if (param1 == null) {
                  break L1;
                } else {
                  if ((param1[0] ^ -1) < -1) {
                    break L1;
                  } else {
                    return null;
                  }
                }
              }
              var9 = jc.a(this.field_b, param2, param3);
              if (var9 != null) {
                L2: {
                  var10 = var9.a();
                  var8 = var10;
                  this.field_a.a(true, var6, var8);
                  if (param1 == null) {
                    break L2;
                  } else {
                    param1[0] = param1[0] - var10.field_h.length;
                    break L2;
                  }
                }
                if (param0 == -1991540092) {
                  stackIn_16_0 = (jd) (var8);
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_14_0 = (jd) null;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_9_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (jd) (var8);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var5);

            stackIn_19_1 = new StringBuilder().append("me.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (jd) ((Object) stackIn_9_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              return stackIn_16_0;
            }
          }
        }
    }

    me(ul param0, ul param1) {
        this.field_i = new f(256);
        this.field_a = new f(256);
        try {
            this.field_b = param0;
            this.field_l = param1;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "me.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = "Refuse to believe. The truth is in here.";
        field_f = new int[]{};
        field_c = "Block their path.";
        field_d = "Kick";
        field_e = "Unpacking music";
        field_j = "Expert";
    }
}
