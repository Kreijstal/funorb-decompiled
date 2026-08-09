/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg extends vk implements qk, ga {
    private dk field_C;
    kd field_z;
    private dk field_E;
    private ng field_A;
    static String field_D;
    static tk field_y;

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_D = null;
        field_y = null;
    }

    private final void h(byte param0) {
        if (param0 <= 116) {
            return;
        }
        if (!this.g((byte) -126)) {
            return;
        }
        bf.a((byte) 79, this.field_A.field_k);
    }

    final void a(int param0, int param1, uj param2, int param3) {
        boolean discarded$1 = false;
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a(116, param1, param2, param3);
              this.field_E.field_u = this.g((byte) -110);
              if (param0 > 27) {
                break L1;
              } else {
                discarded$1 = this.g((byte) 3);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("hg.U(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param3 + ')');
        }
    }

    private final int a(int param0, int param1, int param2, int param3, uj param4, String param5, String param6) {
        boolean discarded$1 = false;
        RuntimeException var8 = null;
        pa var9 = null;
        ad var10 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                discarded$1 = this.g((byte) -31);
                break L1;
              }
            }
            var10 = new ad(20, param1, param2 + 120, 25, param4, false, 120, 3, nb.field_c, 16777215, param6);
            this.a(true, var10);
            var9 = new pa(((ub) ((Object) param4)).a(false), param5, 126, var10.field_f + param1, param2 + 25, param3);
            var9.field_g = (qg) (this);
            this.a(true, var9);
            stackIn_3_0 = var9.field_f + var10.field_f;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var8);

            stackIn_6_1 = new StringBuilder().append("hg.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param6 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    final static vc b(int param0, int param1, int param2, int param3, int param4) {
        vc var5;
        int var6;
        var6 = StarCannon.field_A;
        var5 = (vc) ((Object) ne.field_c.c(-3905));
        L0: while (true) {
          if (var5 == null) {
            var5 = new vc();
            var5.field_i = param1;
            var5.field_l = param2;
            var5.field_h = param4;
            ne.field_c.b(117, var5);
            if (param3 >= -68) {
              field_D = (String) null;
              ea.a((byte) 70, var5, param0);
              return var5;
            } else {
              ea.a((byte) 70, var5, param0);
              return var5;
            }
          } else {
            if ((var5.field_i ^ -1) != (param1 ^ -1)) {
              var5 = (vc) ((Object) ne.field_c.a(-16913));
              continue L0;
            } else {
              return var5;
            }
          }
        }
    }

    final static ld a(int param0, String param1) {
        String var2 = null;
        ld var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        ld stackIn_19_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = StarCannon.field_A;
        try {
          L0: {
            if (m.field_d != null) {
              if (param1 != null) {
                if (-1 != (param1.length() ^ -1)) {
                  L1: {
                    if (param0 == 120) {
                      break L1;
                    } else {
                      hg.a(false);
                      break L1;
                    }
                  }
                  var6 = (CharSequence) ((Object) param1);
                  var2 = ni.a(param0 ^ 21, var6);
                  if (var2 != null) {
                    var3 = (ld) ((Object) m.field_d.a((long)var2.hashCode(), 26));
                    L2: while (true) {
                      if (var3 != null) {
                        var7 = (CharSequence) ((Object) var3.field_kb);
                        var4 = ni.a(108, var7);
                        if (var4.equals(var2)) {
                          stackIn_19_0 = (ld) (var3);
                          break L0;
                        } else {
                          var3 = (ld) ((Object) m.field_d.b(param0 ^ 121));
                          continue L2;
                        }
                      } else {
                        return null;
                      }
                    }
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2_ref);

            stackIn_24_1 = new StringBuilder().append("hg.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L3;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        return stackIn_19_0;
    }

    private final boolean a(byte param0, ub param1) {
        he var3 = null;
        RuntimeException var3_ref = null;
        p var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = param1.a(false);
            if (var3 == null) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 == 79) {
                  break L1;
                } else {
                  this.a(12);
                  break L1;
                }
              }
              L2: {
                var4 = var3.b((byte) -123);
                if (var4 != bf.field_x) {
                  stackIn_9_0 = 0;
                  break L2;
                } else {
                  stackIn_9_0 = 1;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("hg.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    public final void a(String param0, byte param1) {
        ng var3 = null;
        String var4 = null;
        if (param1 > -120) {
            return;
        }
        try {
            var3 = this.field_A;
            var4 = param0;
            ((fe) ((Object) var3)).a((byte) -91, false, var4);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "hg.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final boolean g(byte param0) {
        if (param0 <= -79) {
          if (!this.a((byte) 79, (ub) (this.field_A))) {
            return false;
          } else {
            return true;
          }
        } else {
          this.a(113);
          if (!this.a((byte) 79, (ub) (this.field_A))) {
            return false;
          } else {
            return true;
          }
        }
    }

    public hg() {
        super(0, 0, 496, 0, (de) null);
        this.field_A = new ng("", (qg) null, 12);
        hd var1 = new hd(nb.field_b, 0, 0, 0, 0, 16777215, -1, 3, 0, nb.field_c.field_p, -1, 2147483647, true);
        uj var2 = new uj(ih.field_f, var1, (qg) null);
        this.field_E = new dk(rc.field_b, (qg) null);
        this.field_C = new dk(ta.field_d, (qg) null);
        this.field_A.field_p = ld.field_jb;
        this.field_A.a(new nd(this.field_A), 0);
        this.field_E.field_u = false;
        this.field_E.field_o = (de) ((Object) new gb());
        this.field_C.field_o = (de) ((Object) new wa());
        this.field_A.field_o = (de) ((Object) new fh(10000536));
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(20, 270, (byte) 121, 50, var3);
        this.a(true, var2);
        var3 += 50;
        var3 = var3 + (5 + this.a(var3, (byte) 27, this.field_A, d.field_c, 170, tg.field_w));
        this.field_E.a(496 - var5 >> 1475324961, var5, (byte) 127, 40, var3);
        this.field_C.a(var4 - -3, 60, (byte) 119, 40, var3 + 15);
        this.field_C.field_g = (qg) (this);
        this.field_E.field_g = (qg) (this);
        this.a(true, this.field_E);
        this.a(true, this.field_C);
        this.field_z = new kd((qk) (this));
        this.field_z.a(this.field_A.field_i + (this.field_A.field_s - -60), -this.field_A.field_i + -this.field_A.field_s + (this.field_i + -60), (byte) 122, 150, 20);
        this.a(true, this.field_z);
        this.a(0, 496, (byte) 116, var4 + var3 + 55, 0);
    }

    public final void a(int param0) {
        int discarded$1 = 0;
        String var3;
        if (param0 != -12920) {
          var3 = (String) null;
          discarded$1 = this.a(-86, (byte) 31, (uj) null, (String) null, 79, (String) null);
          ((nd) ((Object) this.field_A.a(false))).f(param0 ^ 31293);
          return;
        } else {
          ((nd) ((Object) this.field_A.a(false))).f(param0 ^ 31293);
          return;
        }
    }

    final boolean a(uj param0, char param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((param3 ^ -1) != -99) {
                if (99 == param3) {
                  stackIn_10_0 = this.a((byte) -103, param0);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackIn_6_0 = this.b(param2 ^ 44, param0);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("hg.EA(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    private final int a(int param0, byte param1, uj param2, String param3, int param4, String param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 27) {
                break L1;
              } else {
                this.field_z = (kd) null;
                break L1;
              }
            }
            stackIn_3_0 = this.a(0, param0, param4, 35, param2, param5, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7);

            stackIn_6_1 = new StringBuilder().append("hg.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    public final void a(dk param0, int param1, boolean param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param2) {
                break L1;
              } else {
                field_y = (tk) null;
                break L1;
              }
            }
            if (param0 != this.field_C) {
              if (this.field_E == param0) {
                this.h((byte) 118);
                break L0;
              } else {
                return;
              }
            } else {
              ag.k(-1108);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var6);

            stackIn_10_1 = new StringBuilder().append("hg.E(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_D = "Difficulty - HARD";
    }
}
