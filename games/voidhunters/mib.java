/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

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

    private final void b(faa param0) {
        uqb var5 = null;
        tja var3 = null;
        int var4 = VoidHunters.field_G;
        try {
            ((mib) this).field_g = param0.i(0, bnb.field_p);
            var5 = (uqb) (Object) ((mib) this).field_f.d(0);
            while (var5 != null) {
                var5.field_g = false;
                var5 = (uqb) (Object) ((mib) this).field_f.a((byte) 88);
            }
            var3 = ((mib) this).b(28120);
            var3.a(param0, false);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "mib.E(" + (param0 != null ? "{...}" : "null") + 44 + 42 + 41);
        }
    }

    final tja a(int param0, int param1) {
        if (param1 > -65) {
            return null;
        }
        if (!(param0 != 0)) {
            return ((mib) this).b(28120);
        }
        if (((mib) this).field_b) {
            int discarded$0 = 0;
            return this.a();
        }
        return ((mib) this).field_a[(-param0 + ((mib) this).field_a.length + ((mib) this).field_i) % ((mib) this).field_a.length];
    }

    final static String a(byte param0, String param1) {
        RuntimeException var2 = null;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_10_0 = null;
        String stackOut_8_0 = null;
        String stackOut_3_0 = null;
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
            if (!fjb.field_b.startsWith("win")) {
              if (fjb.field_b.startsWith("linux")) {
                stackOut_10_0 = "lib" + param1 + ".so";
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                if (fjb.field_b.startsWith("mac")) {
                  stackOut_8_0 = "lib" + param1 + ".dylib";
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                } else {
                  return null;
                }
              }
            } else {
              stackOut_3_0 = param1 + ".dll";
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("mib.HA(").append(-33).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_11_0;
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
            ((mib) this).field_a = new tja[var4_int];
            for (var5 = 0; ((mib) this).field_a.length > var5; var5++) {
                ((mib) this).field_a[var5] = (tja) (Object) gva.field_a.a((byte) 94);
            }
            ((mib) this).field_f = new ij();
            ((mib) this).field_l = param0;
            ((mib) this).field_i = 0;
            if (param2 >= -25) {
                ((mib) this).field_e = false;
            }
            ((mib) this).field_g = 0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "mib.AA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    public final void b(byte param0, tv param1) {
        mib var3 = null;
        try {
            var3 = (mib) (Object) param1;
            if (param0 < 54) {
                ((mib) this).field_j = null;
            }
            var3.field_i = var3.field_i;
            int discarded$0 = 0;
            var3.field_a = (tja[]) (Object) sqb.a((tv[]) (Object) var3.field_a, (tv[]) (Object) var3.field_a, 1, gva.field_a);
            int discarded$1 = -128;
            this.b(param1);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "mib.D(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        L0: {
          if (((mib) this).field_g < param0) {
            var4 = -((mib) this).field_g + param0;
            if (var4 <= ((mib) this).field_c) {
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
              ((mib) this).field_c = var4;
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
            ((mib) this).field_a = null;
            break L2;
          }
        }
    }

    public final void b(faa param0, int param1) {
        try {
            if (param1 > -109) {
                ((mib) this).c(47);
            }
            this.a(param0, 0);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "mib.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void b(int param0, int param1) {
        int var4 = VoidHunters.field_G;
        int var3 = 0;
        if (param1 < 103) {
            return;
        }
        while (((mib) this).field_a.length > var3) {
            ((mib) this).field_a[var3].a(param0, 113);
            var3++;
        }
    }

    final String a(byte param0) {
        if (param0 != -75) {
            return null;
        }
        return ((mib) this).field_j;
    }

    private final void b(tv param0) {
        mib var3 = null;
        try {
            var3 = (mib) (Object) param0;
            var3.field_f = kk.a(var3.field_f, var3.field_f, 1, wc.field_a, 77);
            var3.field_g = var3.field_g;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "mib.W(" + (param0 != null ? "{...}" : "null") + 44 + -128 + 41);
        }
    }

    public final void a(faa param0, boolean param1) {
        if (param1) {
            return;
        }
        try {
            this.a((byte) 5, param0);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "mib.H(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    private final void b() {
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
          var3_ref_wc = new wc(((mib) this).field_f);
          var4 = new wc(((mib) this).field_f);
          var5 = null;
          var6 = null;
          var7 = (uqb) (Object) var3_ref_wc.c(570);
          L1: while (true) {
            L2: {
              if (var7 == null) {
                break L2;
              } else {
                var8 = (uqb) (Object) var4.c(570);
                L3: while (true) {
                  if (var8 == null) {
                    var7 = (uqb) (Object) var3_ref_wc.a(19072);
                    continue L1;
                  } else {
                    L4: {
                      if (var7 == var8) {
                        break L4;
                      } else {
                        if (var7.a((byte) -51, (tv) (Object) var8)) {
                          break L4;
                        } else {
                          var5 = (Object) (Object) var8;
                          var6 = (Object) (Object) var8;
                          break L2;
                        }
                      }
                    }
                    var8 = (uqb) (Object) var4.a(19072);
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
                  ((uqb) var5).b(-3846);
                  ((uqb) var6).b(-3846);
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
              var3 = 0;
              return;
            }
          }
        }
    }

    final boolean f(int param0) {
        if (param0 != 1) {
            return true;
        }
        return ((mib) this).field_h;
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
            if (param1.field_e > ((mib) this).field_g - (wsb.field_b - param0)) {
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
                  var5 = (uqb) (Object) ((mib) this).field_f.d(param0 + -1);
                  L3: while (true) {
                    if (var5 == null) {
                      break L1;
                    } else {
                      L4: {
                        if (param1 == var5) {
                          break L4;
                        } else {
                          if (var5.a((byte) -41, (tv) (Object) param1)) {
                            break L4;
                          } else {
                            var5.field_f = true;
                            stackOut_12_0 = 1;
                            stackIn_13_0 = stackOut_12_0;
                            return stackIn_13_0 != 0;
                          }
                        }
                      }
                      var5 = (uqb) (Object) ((mib) this).field_f.a((byte) 121);
                      continue L3;
                    }
                  }
                }
              }
              L5: {
                ((mib) this).field_f.b(-10258, (ksa) (Object) param1);
                if (((mib) this).field_g >= param1.field_e) {
                  break L5;
                } else {
                  if (pba.field_p == 1) {
                    var3_int = param1.field_e - ((mib) this).field_g;
                    if (var3_int <= ((mib) this).field_c) {
                      break L5;
                    } else {
                      ((mib) this).field_c = var3_int;
                      break L5;
                    }
                  } else {
                    return true;
                  }
                }
              }
              stackOut_21_0 = 1;
              stackIn_22_0 = stackOut_21_0;
              break L0;
            } else {
              tfb.a((byte) -84, "Oh dear, this action is off the end of the carousel: " + ((Object) (Object) param1).toString() + ", tick=" + param1.field_e + " (my tick=" + ((mib) this).field_g + ")");
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var3;
            stackOut_23_1 = new StringBuilder().append("mib.U(").append(param0).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
        return stackIn_22_0 != 0;
    }

    final boolean d(int param0) {
        if (param0 < 11) {
            return true;
        }
        return ((mib) this).field_b;
    }

    private final void a(byte param0, faa param1) {
        try {
            if (!osa.field_e) {
                int discarded$1 = -19;
                this.a(param1);
            } else {
                int discarded$2 = 42;
                this.b(param1);
            }
            int var3_int = 0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "mib.I(" + 5 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private final void a(int param0, faa param1) {
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
              param1.a(param0 + -631, ((mib) this).field_g, bnb.field_p);
              var3 = ((mib) this).b(28120);
              var3.b(param1, param0 ^ 127);
              if (param0 == -1) {
                break L1;
              } else {
                mfa discarded$2 = ((mib) this).e(-85);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var3_ref;
            stackOut_3_1 = new StringBuilder().append("mib.L(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final int c(byte param0) {
        if (param0 <= 98) {
            return -50;
        }
        return ((mib) this).field_a.length;
    }

    public final void a(tv param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        Object var5 = null;
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
              var6 = (mib) (Object) param0;
              var4 = 0;
              if (var6.field_i != var6.field_i) {
                iva.a(-6940, "int carouselslot has changed. before=" + var6.field_i + ", now=" + var6.field_i);
                var4 = 1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              boolean discarded$4 = tja.a((ntb[]) (Object) var6.field_a, 1, (ntb[]) (Object) var6.field_a, false, 5547);
              boolean discarded$5 = trb.a(1, var6.field_f, 13, false, var6.field_f);
              if (!dn.a((tv[]) (Object) var6.field_a, false, 1, (tv[]) (Object) var6.field_a, -66)) {
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
                var5 = null;
                this.a(87, (faa) null);
                break L3;
              }
            }
            L4: {
              int discarded$6 = 210377952;
              int discarded$7 = 210377952;
              if (!dn.a(hob.a(var6.field_f), false, 1, hob.a(var6.field_f), 121)) {
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
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("mib.F(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L6;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 41);
        }
    }

    final void c(int param0) {
        ((mib) this).field_k = false;
        int var2 = -1 + ((mib) this).field_a.length;
        ((mib) this).field_j = null;
        int var3 = 59 % ((param0 - 45) / 52);
        if (var2 > ((mib) this).field_g) {
            var2 = ((mib) this).field_g;
        }
        ((mib) this).field_g = -var2 + ((mib) this).field_g;
        ((mib) this).field_i = -var2 + ((mib) this).field_i;
        if (!(((mib) this).field_i >= 0)) {
            ((mib) this).field_i = ((mib) this).field_i + ((mib) this).field_a.length;
        }
    }

    private final void a(faa param0) {
        RuntimeException var3 = null;
        uqb[] var3_array = null;
        int var4 = 0;
        tja var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        uqb[] var9 = null;
        uqb var10 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              ((mib) this).field_f = new ij();
              var8 = null;
              var9 = (uqb[]) (Object) kcb.a(12, wc.field_a, param0, 1, -71, (tv[]) null);
              var3_array = var9;
              if (var3_array != null) {
                var4 = 0;
                L2: while (true) {
                  if (var9.length <= var4) {
                    break L1;
                  } else {
                    ((mib) this).field_f.b(-10258, (ksa) (Object) var9[var4]);
                    var4++;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            ((mib) this).field_g = param0.i(0, bnb.field_p);
            var10 = (uqb) (Object) ((mib) this).field_f.d(0);
            L3: while (true) {
              if (var10 == null) {
                L4: {
                  var4 = ((mib) this).field_a.length - 1;
                  if (var4 > ((mib) this).field_g) {
                    var4 = ((mib) this).field_g;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var5 = ((mib) this).field_a[((mib) this).field_i];
                var5.a(param0, false);
                iva.a(-6940, "Tick was " + ((mib) this).field_g);
                ((mib) this).field_g = -var4 + ((mib) this).field_g;
                iva.a(-6940, "Running post read custom from tick=" + ((mib) this).field_g + " when ticksbehind=" + ((mib) this).field_c);
                var6 = 0;
                L5: while (true) {
                  if (var6 >= var4) {
                    iva.a(-6940, "Ends as " + ((mib) this).field_g);
                    break L0;
                  } else {
                    ((mib) this).a(0, (byte) 106);
                    var6++;
                    continue L5;
                  }
                }
              } else {
                var10.field_g = false;
                var10 = (uqb) (Object) ((mib) this).field_f.a((byte) 40);
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3;
            stackOut_17_1 = new StringBuilder().append("mib.M(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + -19 + 41);
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
                var3 = (mib) (Object) param1;
                int discarded$21 = 210377952;
                int discarded$22 = 210377952;
                if (dn.a(hob.a(var3.field_f), false, 1, hob.a(var3.field_f), 122)) {
                  break L2;
                } else {
                  if (var3.field_g == var3.field_g) {
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
            stackOut_6_0 = (RuntimeException) var3_ref;
            stackOut_6_1 = new StringBuilder().append("mib.C(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
        return stackIn_5_0 != 0;
    }

    private final void a(faa param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (!osa.field_e) {
                int discarded$2 = 43;
                this.c(param0);
                break L1;
              } else {
                this.a(-1, param0);
                break L1;
              }
            }
            ((mib) this).field_l = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("mib.K(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + 0 + 41);
        }
    }

    final void g(int param0) {
        int var2 = 0;
        int var3 = VoidHunters.field_G;
        if (0 >= ((mib) this).field_c) {
            return;
        }
        iva.a(-6940, "Updating all the way with " + ((mib) this).field_c + " ticks behind");
        if (param0 != -1) {
            ((mib) this).field_b = true;
        }
        for (var2 = 0; ((mib) this).field_c > var2; var2++) {
            this.c(0, param0 ^ -123);
            ((mib) this).field_g = ((mib) this).field_g + 1;
        }
        ((mib) this).field_c = 0;
    }

    final tja b(int param0) {
        if (param0 != 28120) {
            ((mib) this).field_d = null;
        }
        if (((mib) this).field_b) {
            int discarded$0 = 0;
            return this.a();
        }
        return ((mib) this).field_a[((mib) this).field_i];
    }

    final void a(boolean param0, int param1) {
        if (Math.abs(param1) > Math.abs(((mib) this).field_c)) {
            ((mib) this).field_c = (param1 + ((mib) this).field_c) / 2;
        }
        if (param0) {
            Object var4 = null;
            this.a((mfa) null, false, (byte) -69);
        }
    }

    private final void c(faa param0) {
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
            int discarded$0 = 210377952;
            var10 = hob.a(((mib) this).field_f);
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
            param0.a(-632, ((mib) this).field_g, bnb.field_p);
            var3_int = ((mib) this).field_a.length - 1;
            if (!(((mib) this).field_g >= var3_int)) {
                var3_int = ((mib) this).field_g;
            }
            var12 = ((mib) this).a(var3_int, -105);
            var12.b(param0, -120);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "mib.O(" + (param0 != null ? "{...}" : "null") + 44 + 43 + 41);
        }
    }

    private final tja a() {
        if (null != ((mib) this).field_d) {
            if (((mib) this).field_d.c(116) != null) {
                return ((mib) this).field_d.c(116).d(0);
            }
        }
        return ((mib) this).field_a[((mib) this).field_i];
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
          if (null == ((mib) this).field_d) {
            break L0;
          } else {
            var3 = (Object) (Object) ((mib) this).field_d.c(116);
            break L0;
          }
        }
        L1: {
          if (null == ((mib) this).field_d) {
            break L1;
          } else {
            if (var3 == null) {
              break L1;
            } else {
              var4 = ((bhb) var3).c(param1 + -161);
              ((mib) this).field_b = false;
              if (~((mib) this).field_g > ~var4) {
                break L1;
              } else {
                L2: {
                  if (~(param0 % ela.field_p) < ~(ela.field_p / 2)) {
                    ((mib) this).field_b = true;
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
          var4 = ((mib) this).field_g;
          var5 = ((mib) this).field_g;
          if (param1 == 106) {
            break L3;
          } else {
            ((mib) this).field_a = null;
            break L3;
          }
        }
        var6_ref_uqb = (uqb) (Object) ((mib) this).field_f.d(0);
        L4: while (true) {
          if (var6_ref_uqb == null) {
            L5: {
              if (0 <= ((mib) this).field_c) {
                break L5;
              } else {
                L6: {
                  if (nv.field_o == 0) {
                    break L6;
                  } else {
                    if ((param0 & nv.field_o) != 0) {
                      break L6;
                    } else {
                      break L5;
                    }
                  }
                }
                ((mib) this).field_c = ((mib) this).field_c + 1;
                return;
              }
            }
            L7: {
              if (~var5 >= ~(((mib) this).field_g + -((mib) this).field_a.length)) {
                break L7;
              } else {
                this.c(-var4 + ((mib) this).field_g, 113);
                ((mib) this).field_g = ((mib) this).field_g + 1;
                if (var5 <= ((mib) this).field_g + -((mib) this).field_a.length) {
                  break L7;
                } else {
                  if (((mib) this).field_c <= 0) {
                    break L7;
                  } else {
                    L8: {
                      if (iob.field_g == 0) {
                        break L8;
                      } else {
                        if ((param0 & iob.field_g) != 0) {
                          break L8;
                        } else {
                          break L7;
                        }
                      }
                    }
                    this.c(0, 124);
                    ((mib) this).field_g = ((mib) this).field_g + 1;
                    ((mib) this).field_c = ((mib) this).field_c - 1;
                    break L7;
                  }
                }
              }
            }
            L9: {
              if (null == ((mib) this).field_d) {
                break L9;
              } else {
                L10: {
                  if (var3 == null) {
                    break L10;
                  } else {
                    var6 = ((bhb) var3).c(-80);
                    if (~var6 != ~((mib) this).field_g) {
                      break L10;
                    } else {
                      var7 = System.out;
                      var14 = new StringBuilder();
                      var9 = new PrintStream((OutputStream) (Object) new hp(var14));
                      System.setOut(var9);
                      var10 = ((bhb) var3).d(0);
                      var10.a((tv) (Object) ((mib) this).field_a[((mib) this).field_i], -100);
                      System.setOut(var7);
                      ((mib) this).field_j = var14.toString();
                      iva.a(param1 ^ -7026, "\n>>>>>> Black box recording debug diffs start");
                      ubb.a(var14.toString(), 0);
                      iva.a(-6940, "<<<<<< Black box recording debug diffs end\n");
                      break L10;
                    }
                  }
                }
                break L9;
              }
            }
            return;
          } else {
            L11: {
              if (((mib) this).field_g + -((mib) this).field_a.length > var6_ref_uqb.field_e) {
                var6_ref_uqb.b(-3846);
                break L11;
              } else {
                L12: {
                  if (var6_ref_uqb.field_f) {
                    break L12;
                  } else {
                    if (var5 <= var6_ref_uqb.field_e) {
                      break L12;
                    } else {
                      var7_int = 0;
                      var13 = new wc(((mib) this).field_f);
                      var12 = (uqb) (Object) var13.c(570);
                      L13: while (true) {
                        L14: {
                          if (var12 == null) {
                            break L14;
                          } else {
                            L15: {
                              if (var6_ref_uqb == var12) {
                                break L15;
                              } else {
                                if (var12.a((byte) -55, (tv) (Object) var6_ref_uqb)) {
                                  break L15;
                                } else {
                                  var7_int = 1;
                                  break L14;
                                }
                              }
                            }
                            var12 = (uqb) (Object) var13.a(19072);
                            continue L13;
                          }
                        }
                        if (var7_int != 0) {
                          break L12;
                        } else {
                          var5 = -2 + var6_ref_uqb.field_e;
                          break L12;
                        }
                      }
                    }
                  }
                }
                if (!var6_ref_uqb.field_g) {
                  break L11;
                } else {
                  if (var6_ref_uqb.field_e >= var4) {
                    break L11;
                  } else {
                    var4 = var6_ref_uqb.field_e;
                    break L11;
                  }
                }
              }
            }
            var6_ref_uqb = (uqb) (Object) ((mib) this).field_f.a((byte) 52);
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
        var3 = (((mib) this).field_i - -((mib) this).field_a.length - param0) % ((mib) this).field_a.length;
        var4 = -param0 + ((mib) this).field_g;
        if (param1 > 83) {
          var5 = var3;
          L0: while (true) {
            if ((1 + ((mib) this).field_i) % ((mib) this).field_a.length == var5) {
              ((mib) this).field_i = (((mib) this).field_i + 1) % ((mib) this).field_a.length;
              return;
            } else {
              L1: {
                var6 = (var5 - -1) % ((mib) this).field_a.length;
                if (tga.field_N) {
                  int discarded$6 = 68;
                  nc.a();
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                ((mib) this).field_a[var5].b((byte) 77, (tv) (Object) ((mib) this).field_a[var6]);
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
                  var7 = tmb.a((tv) (Object) ((mib) this).field_a[var5], (byte) -9);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                ((mib) this).field_a[var6].a(false, var4);
                if (ndb.field_c == 1) {
                  int discarded$7 = 71;
                  this.b();
                  break L4;
                } else {
                  break L4;
                }
              }
              var8_ref_uqb = (uqb) (Object) ((mib) this).field_f.d(0);
              L5: while (true) {
                if (var8_ref_uqb == null) {
                  L6: {
                    stackOut_21_0 = ((mib) this).field_a[var6];
                    stackOut_21_1 = ((mib) this).field_a[var5];
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
                    if (((mib) this).field_g != var4) {
                      stackOut_23_0 = (tja) (Object) stackIn_23_0;
                      stackOut_23_1 = (tja) (Object) stackIn_23_1;
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
                      stackOut_22_0 = (tja) (Object) stackIn_22_0;
                      stackOut_22_1 = (tja) (Object) stackIn_22_1;
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
                      int discarded$8 = 9487;
                      uea.c();
                      var8 = tmb.a((tv) (Object) ((mib) this).field_a[var5], (byte) -117);
                      if (var8 == var7) {
                        ((mib) this).field_e = false;
                        break L7;
                      } else {
                        L8: {
                          int discarded$9 = -39;
                          var9 = dnb.c();
                          int discarded$10 = 9487;
                          uea.c();
                          this.a(var5, var6, 42);
                          int discarded$11 = -39;
                          ((mib) this).field_a[var5] = dnb.c();
                          if (!((mib) this).field_e) {
                            iva.a(-6940, "Carousel_commongame shallow copy check: A field was changed before it was prepared");
                            iva.a(-6940, "******************************************");
                            if (nia.field_o) {
                              var9.a((tv) (Object) ((mib) this).field_a[var5], -109);
                              break L8;
                            } else {
                              break L8;
                            }
                          } else {
                            break L8;
                          }
                        }
                        ((mib) this).field_e = true;
                        ((mib) this).field_g = ((mib) this).field_g - 1;
                        return;
                      }
                    } else {
                      break L7;
                    }
                  }
                  var4++;
                  var5 = (1 + var5) % ((mib) this).field_a.length;
                  continue L0;
                } else {
                  L9: {
                    if (var8_ref_uqb.field_e == var4) {
                      var8_ref_uqb.a((byte) -122, ((mib) this).field_l, ((mib) this).field_a[var6]);
                      var8_ref_uqb.field_g = false;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  var8_ref_uqb = (uqb) (Object) ((mib) this).field_f.a((byte) 117);
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
            if (!(param0 != ((mib) this).field_i)) {
                var5 = ((mib) this).field_a[param1];
                ((mib) this).field_a[param1] = ((mib) this).field_a[param0];
                ((mib) this).field_a[param0] = var5;
            }
        }
    }

    final mfa e(int param0) {
        if (param0 <= 25) {
            ((mib) this).field_c = -62;
        }
        return ((mib) this).field_l;
    }

    mib() {
        this.a((mfa) null, false, (byte) -126);
    }

    mib(mfa param0) {
        try {
            this.a(param0, false, (byte) -55);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "mib.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    mib(mfa param0, boolean param1) {
        try {
            this.a(param0, param1, (byte) -27);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "mib.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    static {
    }
}
