/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf {
    static int field_c;
    private pf field_f;
    private int field_g;
    private vi field_b;
    private int field_a;
    static String field_e;
    static jc field_d;

    private final void a(byte param0, long param1) {
        dl var4 = (dl) ((Object) this.field_b.a(-1, param1));
        if (param0 >= -34) {
            return;
        }
        this.a(0, var4);
    }

    private final void a(Object param0, int param1, int param2, long param3) {
        RuntimeException runtimeException = null;
        dl var6 = null;
        hc var6_ref = null;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (param1 > this.field_g) {
              throw new IllegalStateException();
            } else {
              this.a((byte) -116, param3);
              this.field_a = this.field_a - param1;
              L1: while (true) {
                L2: {
                  if (this.field_a >= 0) {
                    break L2;
                  } else {
                    var6 = (dl) ((Object) this.field_f.a(false));
                    this.a(0, var6);
                    if (var7 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  var6_ref = new hc(param0, param1);
                  if (param2 < -73) {
                    break L3;
                  } else {
                    this.field_a = 94;
                    break L3;
                  }
                }
                this.field_b.a(var6_ref, (byte) 63, param3);
                this.field_f.a(false, var6_ref);
                ((dl) ((Object) var6_ref)).field_j = 0L;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (runtimeException);

            stackIn_13_1 = new StringBuilder().append("lf.D(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 <= 27) {
            lf.a(true);
            field_d = null;
            return;
        }
        field_d = null;
    }

    final void a(Object param0, int param1, long param2) {
        if (param1 != -22137) {
            return;
        }
        try {
            this.a(param0, 1, param1 ^ 22019, param2);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "lf.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(boolean param0) {
        hj stackIn_4_0 = null;
        hj stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        hj stackIn_13_0 = null;
        hj stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        qd.b(5);
        if (null == gd.field_k) {
          L0: {
            jh.a(false);
            lk.b(false);
            eh.b((byte) 99);
            if (!ua.a((byte) 69)) {
              break L0;
            } else {
              L1: {
                stackIn_13_0 = ff.field_D;

                if (param0) {
                  stackIn_14_0 = (hj) ((Object) stackIn_13_0);
                  stackIn_14_1 = 0;
                  break L1;
                } else {
                  stackIn_14_0 = (hj) ((Object) stackIn_13_0);
                  stackIn_14_1 = 1;
                  break L1;
                }
              }
              ((hj) (Object) stackIn_14_0).a(stackIn_14_1 != 0, 1);
              rb.a(0, -377);
              break L0;
            }
          }
          pc.a(1);
          if (!param0) {
            lf.a((byte) 48);
            return;
          } else {
            return;
          }
        } else {
          L2: {
            gd.a(gd.field_k, (byte) 118);
            jh.a(false);
            lk.b(false);
            eh.b((byte) 99);
            if (!ua.a((byte) 69)) {
              break L2;
            } else {
              L3: {
                stackIn_4_0 = ff.field_D;

                if (param0) {
                  stackIn_5_0 = (hj) ((Object) stackIn_4_0);
                  stackIn_5_1 = 0;
                  break L3;
                } else {
                  stackIn_5_0 = (hj) ((Object) stackIn_4_0);
                  stackIn_5_1 = 1;
                  break L3;
                }
              }
              ((hj) (Object) stackIn_5_0).a(stackIn_5_1 != 0, 1);
              rb.a(0, -377);
              break L2;
            }
          }
          pc.a(1);
          if (!param0) {
            lf.a((byte) 48);
            return;
          } else {
            return;
          }
        }
    }

    private lf() throws Throwable {
        throw new Error();
    }

    final Object a(int param0, long param1) {
        Object var5;
        hc var6;
        byte[] var7;
        dl var8;
        dl var9;
        Object var10;
        dl var11;
        Object var12;
        if (param0 == 17699) {
          var11 = (dl) ((Object) this.field_b.a(-1, param1));
          if (var11 != null) {
            var12 = var11.c((byte) -82);
            if (var12 == null) {
              var11.c(5);
              var11.b((byte) -121);
              this.field_a = this.field_a + var11.field_o;
              return null;
            } else {
              if (!var11.d(8)) {
                this.field_f.a(false, var11);
                var11.field_j = 0L;
                if (Transmogrify.field_A) {
                  var6 = new hc(var12, var11.field_o);
                  this.field_b.a(var6, (byte) 93, var11.field_c);
                  this.field_f.a(false, var6);
                  ((dl) ((Object) var6)).field_j = 0L;
                  var11.c(param0 + -17694);
                  var11.b((byte) -69);
                  return var12;
                } else {
                  return var12;
                }
              } else {
                var6 = new hc(var12, var11.field_o);
                this.field_b.a(var6, (byte) 93, var11.field_c);
                this.field_f.a(false, var6);
                ((dl) ((Object) var6)).field_j = 0L;
                var11.c(param0 + -17694);
                var11.b((byte) -69);
                return var12;
              }
            }
          } else {
            return null;
          }
        } else {
          var7 = (byte[]) null;
          lf.a((byte) 50, false, (byte[]) null);
          var9 = (dl) ((Object) this.field_b.a(-1, param1));
          var8 = var9;
          if (var9 != null) {
            var10 = var9.c((byte) -82);
            var5 = var10;
            if (var10 == null) {
              var9.c(5);
              var9.b((byte) -121);
              this.field_a = this.field_a + var9.field_o;
              return null;
            } else {
              if (!var9.d(8)) {
                this.field_f.a(false, var9);
                var9.field_j = 0L;
                if (!Transmogrify.field_A) {
                  return var10;
                } else {
                  var6 = new hc(var10, var9.field_o);
                  this.field_b.a(var6, (byte) 93, var9.field_c);
                  this.field_f.a(false, var6);
                  ((dl) ((Object) var6)).field_j = 0L;
                  var9.c(param0 + -17694);
                  var9.b((byte) -69);
                  return var10;
                }
              } else {
                var6 = new hc(var10, var9.field_o);
                this.field_b.a(var6, (byte) 93, var9.field_c);
                this.field_f.a(false, var6);
                ((dl) ((Object) var6)).field_j = 0L;
                var9.c(param0 + -17694);
                var9.b((byte) -69);
                return var10;
              }
            }
          } else {
            return null;
          }
        }
    }

    private final void a(int param0, dl param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 != null) {
                param1.c(param0 + 5);
                param1.b((byte) -119);
                this.field_a = this.field_a + param1.field_o;
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 == 0) {
              break L0;
            } else {
              this.a((Object) null, 86, 46, -115L);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("lf.H(").append(param0).append(',');

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
          throw ch.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final static void a(byte param0) {
        int var1;
        if (-225 < (kc.field_g ^ -1)) {
          var1 = kc.field_g % 32;
          ec.a(kc.field_g + (32 + -var1), 9956);
          if (Transmogrify.field_A) {
            ec.a(256, 9956);
            var1 = 4 / ((param0 - 58) / 47);
            return;
          } else {
            var1 = 4 / ((param0 - 58) / 47);
            return;
          }
        } else {
          ec.a(256, 9956);
          var1 = 4 / ((param0 - 58) / 47);
          return;
        }
    }

    final static Object a(byte param0, boolean param1, byte[] param2) {
        hf var3 = null;
        RuntimeException var3_ref = null;
        hf stackIn_6_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 != null) {
              if (param2.length > 136) {
                var3 = new hf();
                ((dj) ((Object) var3)).a(param2, (byte) -128);
                stackIn_6_0 = (hf) (var3);
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                L1: {
                  if (param0 == -43) {
                    break L1;
                  } else {
                    field_c = 124;
                    break L1;
                  }
                }
                if (!param1) {
                  stackIn_13_0 = (byte[]) (param2);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_11_0 = pi.a((byte) -29, param2);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("lf.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    static {
        field_e = "Name is available";
    }
}
