/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.io.PrintStream;

final class mib implements ntb {
    private boolean field_b;
    int field_g;
    boolean field_h;
    private int field_i;
    boolean field_k;
    private String field_j;
    private mfa field_l;
    af field_d;
    ij field_f;
    int field_c;
    private tja[] field_a;
    private boolean field_e;

    private final void b(faa param0, byte param1) {
        uqb var5 = null;
        tja var3 = null;
        int var4 = VoidHunters.field_G;
        try {
            this.field_g = param0.i(0, bnb.field_p);
            if (param1 <= 35) {
                this.field_b = false;
            }
            var5 = (uqb) ((Object) this.field_f.d(0));
            while (var5 != null) {
                var5.field_g = false;
                var5 = (uqb) ((Object) this.field_f.a((byte) 88));
            }
            var3 = this.b(28120);
            var3.a(param0, false);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "mib.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final tja a(int param0, int param1) {
        if (param1 > -65) {
            return (tja) null;
        }
        if (!(-1 != (param0 ^ -1))) {
            return this.b(28120);
        }
        if (this.field_b) {
            return this.a(0);
        }
        return this.field_a[(-param0 + this.field_a.length + this.field_i) % this.field_a.length];
    }

    final static String a(byte param0, String param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_10_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_11_0 = null;
        String stackOut_9_0 = null;
        String stackOut_4_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (param0 == -33) {
              if (!fjb.field_b.startsWith("win")) {
                if (fjb.field_b.startsWith("linux")) {
                  stackOut_11_0 = "lib" + param1 + ".so";
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  if (fjb.field_b.startsWith("mac")) {
                    stackOut_9_0 = "lib" + param1 + ".dylib";
                    stackIn_10_0 = stackOut_9_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    return null;
                  }
                }
              } else {
                stackOut_4_0 = param1 + ".dll";
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = (String) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var2);
            stackOut_13_1 = new StringBuilder().append("mib.HA(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_12_0;
            }
          }
        }
    }

    private final void a(mfa param0, boolean param1, byte param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = VoidHunters.field_G;
        try {
            var4_int = wsb.field_b;
            if (param1) {
                var4_int = lla.field_b;
            }
            this.field_a = new tja[var4_int];
            for (var5 = 0; this.field_a.length > var5; var5++) {
                this.field_a[var5] = (tja) ((Object) gva.field_a.a((byte) 94));
            }
            this.field_f = new ij();
            this.field_l = param0;
            this.field_i = 0;
            if (param2 >= -25) {
                this.field_e = false;
            }
            this.field_g = 0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "mib.AA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        mib var3 = null;
        try {
            var3 = (mib) ((Object) param1);
            if (param0 < 54) {
                this.field_j = (String) null;
            }
            var3.field_i = this.field_i;
            var3.field_a = (tja[]) ((Object) sqb.a(var3.field_a, this.field_a, 1, gva.field_a, false));
            this.b(param1, -128);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "mib.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        L0: {
          if (this.field_g < param0) {
            var4 = -this.field_g + param0;
            if (var4 <= this.field_c) {
              break L0;
            } else {
              L1: {
                if (1 == bma.field_o) {
                  break L1;
                } else {
                  if (!param1) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              this.field_c = var4;
              break L0;
            }
          } else {
            break L0;
          }
        }
        L2: {
          if (param2 == 0) {
            break L2;
          } else {
            this.field_a = (tja[]) null;
            break L2;
          }
        }
    }

    public final void b(faa param0, int param1) {
        try {
            if (param1 > -109) {
                this.c(47);
            }
            this.a(param0, 0);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "mib.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void b(int param0, int param1) {
        int var4 = VoidHunters.field_G;
        int var3 = 0;
        if (param1 < 103) {
            return;
        }
        while (this.field_a.length > var3) {
            this.field_a[var3].a(param0, 113);
            var3++;
        }
    }

    final String a(byte param0) {
        if (param0 != -75) {
            return (String) null;
        }
        return this.field_j;
    }

    private final void b(tv param0, int param1) {
        mib var3 = null;
        if (param1 >= -124) {
            return;
        }
        try {
            var3 = (mib) ((Object) param0);
            var3.field_f = kk.a(var3.field_f, this.field_f, 1, wc.field_a, 77);
            var3.field_g = this.field_g;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "mib.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(faa param0, boolean param1) {
        if (param1) {
            return;
        }
        try {
            this.a((byte) 5, param0);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "mib.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void b(byte param0) {
        int var2 = 0;
        wc var3_ref_wc = null;
        int var3 = 0;
        wc var4 = null;
        Object var5 = null;
        Object var6 = null;
        uqb var7 = null;
        uqb var8 = null;
        int var9 = 0;
        var9 = VoidHunters.field_G;
        var2 = 0;
        L0: while (true) {
          var2 = 0;
          var3_ref_wc = new wc(this.field_f);
          var4 = new wc(this.field_f);
          var5 = null;
          var6 = null;
          var7 = (uqb) ((Object) var3_ref_wc.c(570));
          L1: while (true) {
            L2: {
              if (var7 == null) {
                break L2;
              } else {
                var8 = (uqb) ((Object) var4.c(570));
                L3: while (true) {
                  if (var8 == null) {
                    var7 = (uqb) ((Object) var3_ref_wc.a(19072));
                    continue L1;
                  } else {
                    L4: {
                      if (var7 == var8) {
                        break L4;
                      } else {
                        if (var7.a((byte) -51, var8)) {
                          break L4;
                        } else {
                          var5 = var8;
                          var6 = var8;
                          break L2;
                        }
                      }
                    }
                    var8 = (uqb) ((Object) var4.a(19072));
                    continue L3;
                  }
                }
              }
            }
            L5: {
              if (var5 == null) {
                break L5;
              } else {
                if (var6 != null) {
                  ((uqb) (var5)).b(-3846);
                  ((uqb) (var6)).b(-3846);
                  var2 = 1;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            if (var2 != 0) {
              continue L0;
            } else {
              var3 = 62 % ((param0 - 9) / 53);
              return;
            }
          }
        }
    }

    final boolean f(int param0) {
        if (param0 != 1) {
            return true;
        }
        return this.field_h;
    }

    final boolean a(int param0, uqb param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        uqb var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            if (param1.field_e > this.field_g - (wsb.field_b - param0)) {
              L1: {
                L2: {
                  if (param1.field_d == null) {
                    break L2;
                  } else {
                    if (param1.field_d.field_c) {
                      param1.field_d = null;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (!ujb.field_j) {
                  break L1;
                } else {
                  var5 = (uqb) ((Object) this.field_f.d(param0 + -1));
                  L3: while (true) {
                    if (var5 == null) {
                      break L1;
                    } else {
                      L4: {
                        if (param1 == var5) {
                          break L4;
                        } else {
                          if (var5.a((byte) -41, param1)) {
                            break L4;
                          } else {
                            var5.field_f = true;
                            stackOut_12_0 = 1;
                            stackIn_13_0 = stackOut_12_0;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                      var5 = (uqb) ((Object) this.field_f.a((byte) 121));
                      continue L3;
                    }
                  }
                }
              }
              L5: {
                this.field_f.b(-10258, param1);
                if (this.field_g >= param1.field_e) {
                  break L5;
                } else {
                  if (pba.field_p == 1) {
                    var3_int = param1.field_e - this.field_g;
                    if (var3_int <= this.field_c) {
                      break L5;
                    } else {
                      this.field_c = var3_int;
                      break L5;
                    }
                  } else {
                    return true;
                  }
                }
              }
              stackOut_21_0 = 1;
              stackIn_22_0 = stackOut_21_0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              tfb.a((byte) -84, "Oh dear, this action is off the end of the carousel: " + param1.toString() + ", tick=" + param1.field_e + " (my tick=" + this.field_g + ")");
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var3);
            stackOut_23_1 = new StringBuilder().append("mib.U(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            return stackIn_22_0 != 0;
          }
        }
    }

    final boolean d(int param0) {
        if (param0 < 11) {
            return true;
        }
        return this.field_b;
    }

    private final void a(byte param0, faa param1) {
        try {
            if (!osa.field_e) {
                this.a(param1, (byte) -19);
            } else {
                this.b(param1, (byte) 42);
            }
            int var3_int = 64 % ((-35 - param0) / 33);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "mib.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, faa param1) {
        mfa discarded$2 = null;
        tja var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param1.a(param0 + -631, this.field_g, bnb.field_p);
              var3 = this.b(28120);
              var3.b(param1, param0 ^ 127);
              if (param0 == -1) {
                break L1;
              } else {
                discarded$2 = this.e(-85);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var3_ref);
            stackOut_3_1 = new StringBuilder().append("mib.L(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final int c(byte param0) {
        if (param0 <= 98) {
            return -50;
        }
        return this.field_a.length;
    }

    public final void a(tv param0, int param1) {
        boolean discarded$37 = false;
        boolean discarded$38 = false;
        RuntimeException var3 = null;
        int var4 = 0;
        faa var5 = null;
        mib var6 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              var6 = (mib) ((Object) param0);
              var4 = 0;
              if (this.field_i != var6.field_i) {
                iva.a(-6940, "int carouselslot has changed. before=" + var6.field_i + ", now=" + this.field_i);
                var4 = 1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              discarded$37 = tja.a(var6.field_a, 1, this.field_a, false, 5547);
              discarded$38 = trb.a(1, this.field_f, 13, false, var6.field_f);
              if (!dn.a(var6.field_a, false, 1, this.field_a, -66)) {
                break L2;
              } else {
                var4 = 1;
                iva.a(-6940, "CarouselSlot[] carousel has changed. ");
                break L2;
              }
            }
            L3: {
              if (param1 < -19) {
                break L3;
              } else {
                var5 = (faa) null;
                this.a(87, (faa) null);
                break L3;
              }
            }
            L4: {
              if (!dn.a(hob.a(var6.field_f, 210377952), false, 1, hob.a(this.field_f, 210377952), 121)) {
                break L4;
              } else {
                var4 = 1;
                iva.a(-6940, "linklist eventqueue has changed. ");
                break L4;
              }
            }
            L5: {
              if (var4 == 0) {
                break L5;
              } else {
                iva.a(-6940, "This instance of Carousel_commongame_Info has changed");
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3);
            stackOut_12_1 = new StringBuilder().append("mib.F(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L6;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
    }

    final void c(int param0) {
        this.field_k = false;
        int var2 = -1 + this.field_a.length;
        this.field_j = null;
        int var3 = 59 % ((param0 - 45) / 52);
        if (var2 > this.field_g) {
            var2 = this.field_g;
        }
        this.field_g = -var2 + this.field_g;
        this.field_i = -var2 + this.field_i;
        if (!(this.field_i >= 0)) {
            this.field_i = this.field_i + this.field_a.length;
        }
    }

    private final void a(faa param0, byte param1) {
        int discarded$1 = 0;
        RuntimeException var3 = null;
        uqb[] var3_array = null;
        int var4 = 0;
        tja var5 = null;
        int var6 = 0;
        int var7 = 0;
        tv[] var8 = null;
        uqb[] var9 = null;
        uqb var10 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              this.field_f = new ij();
              var8 = (tv[]) null;
              var9 = (uqb[]) ((Object) kcb.a(12, wc.field_a, param0, 1, -71, (tv[]) null));
              var3_array = var9;
              if (var3_array != null) {
                var4 = 0;
                L2: while (true) {
                  if (var9.length <= var4) {
                    break L1;
                  } else {
                    this.field_f.b(-10258, var9[var4]);
                    var4++;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L3: {
              this.field_g = param0.i(param1 ^ -19, bnb.field_p);
              var10 = (uqb) ((Object) this.field_f.d(0));
              if (param1 == -19) {
                break L3;
              } else {
                discarded$1 = this.c((byte) -98);
                break L3;
              }
            }
            L4: while (true) {
              if (var10 == null) {
                L5: {
                  var4 = this.field_a.length - 1;
                  if (var4 > this.field_g) {
                    var4 = this.field_g;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var5 = this.field_a[this.field_i];
                var5.a(param0, false);
                iva.a(param1 + -6921, "Tick was " + this.field_g);
                this.field_g = -var4 + this.field_g;
                iva.a(-6940, "Running post read custom from tick=" + this.field_g + " when ticksbehind=" + this.field_c);
                var6 = 0;
                L6: while (true) {
                  if (var6 >= var4) {
                    iva.a(-6940, "Ends as " + this.field_g);
                    break L0;
                  } else {
                    this.a(0, (byte) 106);
                    var6++;
                    continue L6;
                  }
                }
              } else {
                var10.field_g = false;
                var10 = (uqb) ((Object) this.field_f.a((byte) 40));
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var3);
            stackOut_18_1 = new StringBuilder().append("mib.M(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        mib var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
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
            L1: {
              L2: {
                var4 = 1 / ((param0 - 22) / 59);
                var3 = (mib) ((Object) param1);
                if (dn.a(hob.a(var3.field_f, 210377952), false, 1, hob.a(this.field_f, 210377952), 122)) {
                  break L2;
                } else {
                  if (var3.field_g == this.field_g) {
                    stackOut_4_0 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var3_ref);
            stackOut_6_1 = new StringBuilder().append("mib.C(").append(param0).append(',');
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
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    private final void a(faa param0, int param1) {
        RuntimeException var3 = null;
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
            L1: {
              if (!osa.field_e) {
                this.c(param0, (byte) 43);
                break L1;
              } else {
                this.a(param1 ^ -1, param0);
                break L1;
              }
            }
            L2: {
              if (param1 == 0) {
                break L2;
              } else {
                this.field_l = (mfa) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var3);
            stackOut_6_1 = new StringBuilder().append("mib.K(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final void g(int param0) {
        int var2 = 0;
        int var3 = VoidHunters.field_G;
        if (0 >= this.field_c) {
            return;
        }
        iva.a(-6940, "Updating all the way with " + this.field_c + " ticks behind");
        if (param0 != -1) {
            this.field_b = true;
        }
        for (var2 = 0; this.field_c > var2; var2++) {
            this.c(0, param0 ^ -123);
            this.field_g = this.field_g + 1;
        }
        this.field_c = 0;
    }

    final tja b(int param0) {
        if (param0 != 28120) {
            this.field_d = (af) null;
        }
        if (this.field_b) {
            return this.a(0);
        }
        return this.field_a[this.field_i];
    }

    final void a(boolean param0, int param1) {
        if (Math.abs(param1) > Math.abs(this.field_c)) {
            this.field_c = (param1 + this.field_c) / 2;
        }
        if (param0) {
            mfa var4 = (mfa) null;
            this.a((mfa) null, false, (byte) -69);
        }
    }

    private final void c(faa param0, byte param1) {
        faa var11 = null;
        faa var3 = null;
        tv[] var10 = null;
        tv[] var4 = null;
        int var5 = 0;
        tv[] var6 = null;
        int var7 = 0;
        tv var8 = null;
        int var3_int = 0;
        tja var12 = null;
        int var9 = VoidHunters.field_G;
        try {
            var11 = param0;
            var3 = var11;
            var10 = hob.a(this.field_f, 210377952);
            var4 = var10;
            var5 = var4 == null ? 0 : var10.length;
            var11.a(-632, var5, 12);
            if (!(var5 == 0)) {
                var6 = var10;
                for (var7 = 0; var6.length > var7; var7++) {
                    var8 = var6[var7];
                    if (!(vq.a(var3, 93, var8 == null ? true : false))) {
                        stb.a(2, 1, var11, var8);
                    }
                }
            }
            param0.a(-632, this.field_g, bnb.field_p);
            var3_int = this.field_a.length - 1;
            if (!(this.field_g >= var3_int)) {
                var3_int = this.field_g;
            }
            if (param1 != 43) {
                this.field_l = (mfa) null;
            }
            var12 = this.a(var3_int, -105);
            var12.b(param0, -120);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "mib.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final tja a(int param0) {
        if (param0 != 0) {
            this.field_c = -42;
        }
        if (null != this.field_d) {
            if (this.field_d.c(116) != null) {
                return this.field_d.c(param0 ^ 116).d(param0 + 0);
            }
        }
        return this.field_a[this.field_i];
    }

    final void a(int param0, byte param1) {
        Object var3 = null;
        int var4 = 0;
        int var5 = 0;
        uqb var6_ref_uqb = null;
        int var6 = 0;
        int var7_int = 0;
        PrintStream var7 = null;
        PrintStream var9 = null;
        tja var10 = null;
        int var11 = 0;
        uqb var12 = null;
        wc var13 = null;
        StringBuilder var14 = null;
        L0: {
          var11 = VoidHunters.field_G;
          var3 = null;
          if (null == this.field_d) {
            break L0;
          } else {
            var3 = this.field_d.c(116);
            break L0;
          }
        }
        L1: {
          if (null == this.field_d) {
            break L1;
          } else {
            if (var3 == null) {
              break L1;
            } else {
              var4 = ((bhb) (var3)).c(param1 + -161);
              this.field_b = false;
              if (this.field_g < var4) {
                break L1;
              } else {
                L2: {
                  if (param0 % ela.field_p > ela.field_p / 2) {
                    this.field_b = true;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                return;
              }
            }
          }
        }
        L3: {
          var4 = this.field_g;
          var5 = this.field_g;
          if (param1 == 106) {
            break L3;
          } else {
            this.field_a = (tja[]) null;
            break L3;
          }
        }
        var6_ref_uqb = (uqb) ((Object) this.field_f.d(0));
        L4: while (true) {
          if (var6_ref_uqb == null) {
            L5: {
              if (0 <= this.field_c) {
                break L5;
              } else {
                L6: {
                  if (-1 == (nv.field_o ^ -1)) {
                    break L6;
                  } else {
                    if ((param0 & nv.field_o) != 0) {
                      break L6;
                    } else {
                      break L5;
                    }
                  }
                }
                this.field_c = this.field_c + 1;
                return;
              }
            }
            L7: {
              if (var5 <= this.field_g + -this.field_a.length) {
                break L7;
              } else {
                this.c(-var4 + this.field_g, 113);
                this.field_g = this.field_g + 1;
                if (var5 <= this.field_g + -this.field_a.length) {
                  break L7;
                } else {
                  if (this.field_c <= 0) {
                    break L7;
                  } else {
                    L8: {
                      if (iob.field_g == 0) {
                        break L8;
                      } else {
                        if (-1 != (param0 & iob.field_g ^ -1)) {
                          break L8;
                        } else {
                          break L7;
                        }
                      }
                    }
                    this.c(0, 124);
                    this.field_g = this.field_g + 1;
                    this.field_c = this.field_c - 1;
                    break L7;
                  }
                }
              }
            }
            L9: {
              if (null == this.field_d) {
                break L9;
              } else {
                if (var3 == null) {
                  break L9;
                } else {
                  var6 = ((bhb) (var3)).c(-80);
                  if (var6 != this.field_g) {
                    break L9;
                  } else {
                    var7 = System.out;
                    var14 = new StringBuilder();
                    var9 = new PrintStream((OutputStream) ((Object) new hp(var14)));
                    System.setOut(var9);
                    var10 = ((bhb) (var3)).d(0);
                    var10.a(this.field_a[this.field_i], -100);
                    System.setOut(var7);
                    this.field_j = var14.toString();
                    iva.a(param1 ^ -7026, "\n>>>>>> Black box recording debug diffs start");
                    ubb.a(var14.toString(), 0);
                    iva.a(-6940, "<<<<<< Black box recording debug diffs end\n");
                    break L9;
                  }
                }
              }
            }
            return;
          } else {
            L10: {
              if (this.field_g + -this.field_a.length > var6_ref_uqb.field_e) {
                var6_ref_uqb.b(-3846);
                break L10;
              } else {
                L11: {
                  if (var6_ref_uqb.field_f) {
                    break L11;
                  } else {
                    if (var5 <= var6_ref_uqb.field_e) {
                      break L11;
                    } else {
                      var7_int = 0;
                      var13 = new wc(this.field_f);
                      var12 = (uqb) ((Object) var13.c(570));
                      L12: while (true) {
                        L13: {
                          if (var12 == null) {
                            break L13;
                          } else {
                            L14: {
                              if (var6_ref_uqb == var12) {
                                break L14;
                              } else {
                                if (var12.a((byte) -55, var6_ref_uqb)) {
                                  break L14;
                                } else {
                                  var7_int = 1;
                                  break L13;
                                }
                              }
                            }
                            var12 = (uqb) ((Object) var13.a(19072));
                            continue L12;
                          }
                        }
                        if (var7_int != 0) {
                          break L11;
                        } else {
                          var5 = -2 + var6_ref_uqb.field_e;
                          break L11;
                        }
                      }
                    }
                  }
                }
                if (!var6_ref_uqb.field_g) {
                  break L10;
                } else {
                  if (var6_ref_uqb.field_e >= var4) {
                    break L10;
                  } else {
                    var4 = var6_ref_uqb.field_e;
                    break L10;
                  }
                }
              }
            }
            var6_ref_uqb = (uqb) ((Object) this.field_f.a((byte) 52));
            continue L4;
          }
        }
    }

    private final void c(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        uqb var8_ref_uqb = null;
        int var8 = 0;
        tja var9 = null;
        int var10 = 0;
        tja stackIn_22_0 = null;
        tja stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        tja stackIn_23_0 = null;
        tja stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        tja stackIn_24_0 = null;
        tja stackIn_24_1 = null;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        int stackIn_24_4 = 0;
        tja stackOut_21_0 = null;
        tja stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        tja stackOut_23_0 = null;
        tja stackOut_23_1 = null;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        int stackOut_23_4 = 0;
        tja stackOut_22_0 = null;
        tja stackOut_22_1 = null;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        int stackOut_22_4 = 0;
        var10 = VoidHunters.field_G;
        var3 = (this.field_i - -this.field_a.length - param0) % this.field_a.length;
        var4 = -param0 + this.field_g;
        if (param1 > 83) {
          var5 = var3;
          L0: while (true) {
            if ((1 + this.field_i) % this.field_a.length == var5) {
              this.field_i = (this.field_i + 1) % this.field_a.length;
              return;
            } else {
              L1: {
                var6 = (var5 - -1) % this.field_a.length;
                if (tga.field_N) {
                  nc.a((byte) 68);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                this.field_a[var5].b((byte) 77, this.field_a[var6]);
                this.a(var5, var6, -121);
                if (!tga.field_N) {
                  break L2;
                } else {
                  mba.a(-112);
                  break L2;
                }
              }
              L3: {
                var7 = 0;
                if (poa.field_o) {
                  var7 = tmb.a(this.field_a[var5], (byte) -9);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                this.field_a[var6].a(false, var4);
                if (-2 == (ndb.field_c ^ -1)) {
                  this.b((byte) 71);
                  break L4;
                } else {
                  break L4;
                }
              }
              var8_ref_uqb = (uqb) ((Object) this.field_f.d(0));
              L5: while (true) {
                if (var8_ref_uqb == null) {
                  L6: {
                    stackOut_21_0 = this.field_a[var6];
                    stackOut_21_1 = this.field_a[var5];
                    stackOut_21_2 = var4;
                    stackOut_21_3 = 1;
                    stackIn_23_0 = stackOut_21_0;
                    stackIn_23_1 = stackOut_21_1;
                    stackIn_23_2 = stackOut_21_2;
                    stackIn_23_3 = stackOut_21_3;
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    stackIn_22_2 = stackOut_21_2;
                    stackIn_22_3 = stackOut_21_3;
                    if (this.field_g != var4) {
                      stackOut_23_0 = (tja) ((Object) stackIn_23_0);
                      stackOut_23_1 = (tja) ((Object) stackIn_23_1);
                      stackOut_23_2 = stackIn_23_2;
                      stackOut_23_3 = stackIn_23_3;
                      stackOut_23_4 = 0;
                      stackIn_24_0 = stackOut_23_0;
                      stackIn_24_1 = stackOut_23_1;
                      stackIn_24_2 = stackOut_23_2;
                      stackIn_24_3 = stackOut_23_3;
                      stackIn_24_4 = stackOut_23_4;
                      break L6;
                    } else {
                      stackOut_22_0 = (tja) ((Object) stackIn_22_0);
                      stackOut_22_1 = (tja) ((Object) stackIn_22_1);
                      stackOut_22_2 = stackIn_22_2;
                      stackOut_22_3 = stackIn_22_3;
                      stackOut_22_4 = 1;
                      stackIn_24_0 = stackOut_22_0;
                      stackIn_24_1 = stackOut_22_1;
                      stackIn_24_2 = stackOut_22_2;
                      stackIn_24_3 = stackOut_22_3;
                      stackIn_24_4 = stackOut_22_4;
                      break L6;
                    }
                  }
                  L7: {
                    ((tja) (Object) stackIn_24_0).a(stackIn_24_1, stackIn_24_2, stackIn_24_3, stackIn_24_4 != 0);
                    if (poa.field_o) {
                      uea.c(9487);
                      var8 = tmb.a(this.field_a[var5], (byte) -117);
                      if (var8 == var7) {
                        this.field_e = false;
                        break L7;
                      } else {
                        L8: {
                          var9 = dnb.c((byte) -39);
                          uea.c(9487);
                          this.a(var5, var6, 42);
                          this.field_a[var5] = dnb.c((byte) -39);
                          if (!this.field_e) {
                            iva.a(-6940, "Carousel_commongame shallow copy check: A field was changed before it was prepared");
                            iva.a(-6940, "******************************************");
                            if (nia.field_o) {
                              var9.a(this.field_a[var5], -109);
                              break L8;
                            } else {
                              break L8;
                            }
                          } else {
                            break L8;
                          }
                        }
                        this.field_e = true;
                        this.field_g = this.field_g - 1;
                        return;
                      }
                    } else {
                      break L7;
                    }
                  }
                  var4++;
                  var5 = (1 + var5) % this.field_a.length;
                  continue L0;
                } else {
                  L9: {
                    if (var8_ref_uqb.field_e == var4) {
                      var8_ref_uqb.a((byte) -122, this.field_l, this.field_a[var6]);
                      var8_ref_uqb.field_g = false;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  var8_ref_uqb = (uqb) ((Object) this.field_f.a((byte) 117));
                  continue L5;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    private final void a(int param0, int param1, int param2) {
        tja var5 = null;
        int var4 = -85 % ((-55 - param2) / 38);
        if (1 == ko.field_g) {
            if (!(param0 != this.field_i)) {
                var5 = this.field_a[param1];
                this.field_a[param1] = this.field_a[param0];
                this.field_a[param0] = var5;
            }
        }
    }

    final mfa e(int param0) {
        if (param0 <= 25) {
            this.field_c = -62;
        }
        return this.field_l;
    }

    mib() {
        this.a((mfa) null, false, (byte) -126);
    }

    mib(mfa param0) {
        try {
            this.a(param0, false, (byte) -55);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "mib.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    mib(mfa param0, boolean param1) {
        try {
            this.a(param0, param1, (byte) -27);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "mib.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
