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

    private final void b(faa param0, byte param1) {
        int var4 = VoidHunters.field_G;
        ((mib) this).field_g = param0.i(0, bnb.field_p);
        if (param1 <= 35) {
            ((mib) this).field_b = false;
        }
        uqb var5 = (uqb) (Object) ((mib) this).field_f.d(0);
        while (var5 != null) {
            var5.field_g = false;
            var5 = (uqb) (Object) ((mib) this).field_f.a((byte) 88);
        }
        tja var3 = ((mib) this).b(28120);
        var3.a(param0, false);
    }

    final tja a(int param0, int param1) {
        if (param1 > -65) {
            return null;
        }
        if (!(-1 != (param0 ^ -1))) {
            return ((mib) this).b(28120);
        }
        if (((mib) this).field_b) {
            return this.a(0);
        }
        return ((mib) this).field_a[(-param0 + ((mib) this).field_a.length + ((mib) this).field_i) % ((mib) this).field_a.length];
    }

    final static String a(byte param0, String param1) {
        if (param0 == -33) {
          if (!fjb.field_b.startsWith("win")) {
            if (fjb.field_b.startsWith("linux")) {
              return "lib" + param1 + ".so";
            } else {
              if (fjb.field_b.startsWith("mac")) {
                return "lib" + param1 + ".dylib";
              } else {
                return null;
              }
            }
          } else {
            return param1 + ".dll";
          }
        } else {
          return null;
        }
    }

    private final void a(mfa param0, boolean param1, byte param2) {
        int var5 = 0;
        int var6 = VoidHunters.field_G;
        int var4 = wsb.field_b;
        if (param1) {
            var4 = lla.field_b;
        }
        ((mib) this).field_a = new tja[var4];
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
    }

    public final void b(byte param0, tv param1) {
        mib var3 = (mib) (Object) param1;
        if (param0 < 54) {
            ((mib) this).field_j = null;
        }
        var3.field_i = var3.field_i;
        var3.field_a = (tja[]) (Object) sqb.a((tv[]) (Object) var3.field_a, (tv[]) (Object) var3.field_a, 1, gva.field_a, false);
        this.b(param1, -128);
    }

    final void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        if (!(((mib) this).field_g >= param0)) {
            var4 = -((mib) this).field_g + param0;
            if (var4 > ((mib) this).field_c) {
                if (1 != bma.field_o) {
                    // ifeq L52
                }
                ((mib) this).field_c = var4;
            }
        }
        if (param2 != 0) {
            ((mib) this).field_a = null;
        }
    }

    public final void b(faa param0, int param1) {
        if (param1 > -109) {
            ((mib) this).c(47);
        }
        this.a(param0, 0);
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

    private final void b(tv param0, int param1) {
        if (param1 >= -124) {
            return;
        }
        mib var3 = (mib) (Object) param0;
        var3.field_f = kk.a(var3.field_f, var3.field_f, 1, wc.field_a, 77);
        var3.field_g = var3.field_g;
    }

    public final void a(faa param0, boolean param1) {
        if (param1) {
            return;
        }
        this.a((byte) 5, param0);
    }

    private final void b(byte param0) {
        int var2 = 0;
        wc var3_ref = null;
        int var3 = 0;
        wc var4 = null;
        uqb var5 = null;
        uqb var6 = null;
        uqb var7 = null;
        uqb var8 = null;
        int var9 = 0;
        var9 = VoidHunters.field_G;
        var2 = 0;
        L0: while (true) {
          var2 = 0;
          var3_ref = new wc(((mib) this).field_f);
          var4 = new wc(((mib) this).field_f);
          var5 = null;
          var6 = null;
          var7 = (uqb) (Object) var3_ref.c(570);
          L1: while (true) {
            L2: {
              if (var7 == null) {
                break L2;
              } else {
                var8 = (uqb) (Object) var4.c(570);
                L3: while (true) {
                  if (var8 == null) {
                    var7 = (uqb) (Object) var3_ref.a(19072);
                    continue L1;
                  } else {
                    L4: {
                      if (var7 == var8) {
                        break L4;
                      } else {
                        if (var7.a((byte) -51, (tv) (Object) var8)) {
                          break L4;
                        } else {
                          var5 = var8;
                          var6 = var8;
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
                  var5.b(-3846);
                  var6.b(-3846);
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
        return ((mib) this).field_h;
    }

    final boolean a(int param0, uqb param1) {
        int var3 = 0;
        int var4 = 0;
        uqb var5 = null;
        var4 = VoidHunters.field_G;
        if (param1.field_e > ((mib) this).field_g - (wsb.field_b - param0)) {
          L0: {
            L1: {
              if (param1.field_d == null) {
                break L1;
              } else {
                if (param1.field_d.field_c) {
                  param1.field_d = null;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (!ujb.field_j) {
              break L0;
            } else {
              var5 = (uqb) (Object) ((mib) this).field_f.d(param0 + -1);
              L2: while (true) {
                if (var5 == null) {
                  break L0;
                } else {
                  L3: {
                    if (param1 == var5) {
                      break L3;
                    } else {
                      if (var5.a((byte) -41, (tv) (Object) param1)) {
                        break L3;
                      } else {
                        var5.field_f = true;
                        return true;
                      }
                    }
                  }
                  var5 = (uqb) (Object) ((mib) this).field_f.a((byte) 121);
                  continue L2;
                }
              }
            }
          }
          L4: {
            ((mib) this).field_f.b(-10258, (ksa) (Object) param1);
            if (((mib) this).field_g >= param1.field_e) {
              break L4;
            } else {
              if (pba.field_p == 1) {
                var3 = param1.field_e - ((mib) this).field_g;
                if (var3 <= ((mib) this).field_c) {
                  break L4;
                } else {
                  ((mib) this).field_c = var3;
                  break L4;
                }
              } else {
                return true;
              }
            }
          }
          return true;
        } else {
          tfb.a((byte) -84, "Oh dear, this action is off the end of the carousel: " + ((Object) (Object) param1).toString() + ", tick=" + param1.field_e + " (my tick=" + ((mib) this).field_g + ")");
          return false;
        }
    }

    final boolean d(int param0) {
        if (param0 < 11) {
            return true;
        }
        return ((mib) this).field_b;
    }

    private final void a(byte param0, faa param1) {
        if (!osa.field_e) {
            this.a(param1, (byte) -19);
        } else {
            this.b(param1, (byte) 42);
        }
        int var3 = 64 % ((-35 - param0) / 33);
    }

    private final void a(int param0, faa param1) {
        param1.a(param0 + -631, ((mib) this).field_g, bnb.field_p);
        tja var3 = ((mib) this).b(28120);
        var3.b(param1, param0 ^ 127);
        if (param0 != -1) {
            mfa discarded$0 = ((mib) this).e(-85);
        }
    }

    final int c(byte param0) {
        if (param0 <= 98) {
            return -50;
        }
        return ((mib) this).field_a.length;
    }

    public final void a(tv param0, int param1) {
        mib var6 = (mib) (Object) param0;
        int var4 = 0;
        if (!(var6.field_i == var6.field_i)) {
            iva.a(-6940, "int carouselslot has changed. before=" + var6.field_i + ", now=" + var6.field_i);
            var4 = 1;
        }
        boolean discarded$22 = tja.a((ntb[]) (Object) var6.field_a, 1, (ntb[]) (Object) var6.field_a, false, 5547);
        boolean discarded$34 = trb.a(1, var6.field_f, 13, false, var6.field_f);
        if (dn.a((tv[]) (Object) var6.field_a, false, 1, (tv[]) (Object) var6.field_a, -66)) {
            var4 = 1;
            iva.a(-6940, "CarouselSlot[] carousel has changed. ");
        }
        if (param1 >= -19) {
            Object var5 = null;
            this.a(87, (faa) null);
        }
        if (dn.a(hob.a(var6.field_f, 210377952), false, 1, hob.a(var6.field_f, 210377952), 121)) {
            var4 = 1;
            iva.a(-6940, "linklist eventqueue has changed. ");
        }
        if (var4 != 0) {
            iva.a(-6940, "This instance of Carousel_commongame_Info has changed");
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

    private final void a(faa param0, byte param1) {
        uqb[] var3 = null;
        int var4 = 0;
        tja var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        uqb[] var9 = null;
        uqb var10 = null;
        L0: {
          var7 = VoidHunters.field_G;
          ((mib) this).field_f = new ij();
          var8 = null;
          var9 = (uqb[]) (Object) kcb.a(12, wc.field_a, param0, 1, -71, (tv[]) null);
          var3 = var9;
          if (var3 != null) {
            var4 = 0;
            L1: while (true) {
              if (var9.length <= var4) {
                break L0;
              } else {
                ((mib) this).field_f.b(-10258, (ksa) (Object) var9[var4]);
                var4++;
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        L2: {
          ((mib) this).field_g = param0.i(param1 ^ -19, bnb.field_p);
          var10 = (uqb) (Object) ((mib) this).field_f.d(0);
          if (param1 == -19) {
            break L2;
          } else {
            int discarded$1 = ((mib) this).c((byte) -98);
            break L2;
          }
        }
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
            iva.a(param1 + -6921, "Tick was " + ((mib) this).field_g);
            ((mib) this).field_g = -var4 + ((mib) this).field_g;
            iva.a(-6940, "Running post read custom from tick=" + ((mib) this).field_g + " when ticksbehind=" + ((mib) this).field_c);
            var6 = 0;
            L5: while (true) {
              if (var6 >= var4) {
                iva.a(-6940, "Ends as " + ((mib) this).field_g);
                return;
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

    public final boolean a(byte param0, tv param1) {
        mib var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var4 = 1 / ((param0 - 22) / 59);
            var3 = (mib) (Object) param1;
            if (dn.a(hob.a(var3.field_f, 210377952), false, 1, hob.a(var3.field_f, 210377952), 122)) {
              break L1;
            } else {
              if (var3.field_g == var3.field_g) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackOut_3_0 = 1;
          stackIn_5_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_5_0 != 0;
    }

    private final void a(faa param0, int param1) {
        if (osa.field_e) {
            this.a(param1 ^ -1, param0);
        } else {
            this.c(param0, (byte) 43);
        }
        if (param1 != 0) {
            ((mib) this).field_l = null;
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
            return this.a(0);
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

    private final void c(faa param0, byte param1) {
        faa var3_ref = null;
        int var3 = 0;
        tv[] var4 = null;
        int var5 = 0;
        tv[] var6 = null;
        int var7 = 0;
        tv var8 = null;
        int var9 = 0;
        tv[] var10 = null;
        faa var11 = null;
        tja var12 = null;
        int stackIn_3_0 = 0;
        faa stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        faa stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        faa stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        faa stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        faa stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        faa stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        L0: {
          var9 = VoidHunters.field_G;
          var11 = param0;
          var3_ref = var11;
          var10 = hob.a(((mib) this).field_f, 210377952);
          var4 = var10;
          if (var4 != null) {
            stackOut_2_0 = var10.length;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          var11.a(-632, var5, 12);
          if (var5 != 0) {
            var6 = var10;
            var7 = 0;
            L2: while (true) {
              if (var6.length <= var7) {
                break L1;
              } else {
                L3: {
                  var8 = var6[var7];
                  stackOut_7_0 = (faa) var3_ref;
                  stackOut_7_1 = 93;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  if (var8 == null) {
                    stackOut_9_0 = (faa) (Object) stackIn_9_0;
                    stackOut_9_1 = stackIn_9_1;
                    stackOut_9_2 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    stackIn_10_2 = stackOut_9_2;
                    break L3;
                  } else {
                    stackOut_8_0 = (faa) (Object) stackIn_8_0;
                    stackOut_8_1 = stackIn_8_1;
                    stackOut_8_2 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    stackIn_10_2 = stackOut_8_2;
                    break L3;
                  }
                }
                if (vq.a(stackIn_10_0, stackIn_10_1, stackIn_10_2 != 0)) {
                  stb.a(2, 1, var11, var8);
                  var7++;
                  continue L2;
                } else {
                  var7++;
                  continue L2;
                }
              }
            }
          } else {
            break L1;
          }
        }
        L4: {
          param0.a(-632, ((mib) this).field_g, bnb.field_p);
          var3 = ((mib) this).field_a.length - 1;
          if (((mib) this).field_g < var3) {
            var3 = ((mib) this).field_g;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (param1 == 43) {
            break L5;
          } else {
            ((mib) this).field_l = null;
            break L5;
          }
        }
        var12 = ((mib) this).a(var3, -105);
        var12.b(param0, -120);
    }

    private final tja a(int param0) {
        if (param0 != 0) {
            ((mib) this).field_c = -42;
        }
        if (null != ((mib) this).field_d) {
            if (((mib) this).field_d.c(116) != null) {
                return ((mib) this).field_d.c(param0 ^ 116).d(param0 + 0);
            }
        }
        return ((mib) this).field_a[((mib) this).field_i];
    }

    final void a(int param0, byte param1) {
        bhb var3 = null;
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
            var3 = ((mib) this).field_d.c(116);
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
              var4 = var3.c(param1 + -161);
              ((mib) this).field_b = false;
              if (((mib) this).field_g < var4) {
                break L1;
              } else {
                L2: {
                  if (param0 % ela.field_p > ela.field_p / 2) {
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
                ((mib) this).field_c = ((mib) this).field_c + 1;
                return;
              }
            }
            L7: {
              if (var5 <= ((mib) this).field_g + -((mib) this).field_a.length) {
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
                      if (iob.field_g == -1) {
                        break L8;
                      } else {
                        if (-1 != (param0 & iob.field_g)) {
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
                if (var3 == null) {
                  break L9;
                } else {
                  var6 = var3.c(-80);
                  if (var6 != ((mib) this).field_g) {
                    break L9;
                  } else {
                    var7 = System.out;
                    var14 = new StringBuilder();
                    var9 = new PrintStream((OutputStream) (Object) new hp(var14));
                    System.setOut(var9);
                    var10 = var3.d(0);
                    var10.a((tv) (Object) ((mib) this).field_a[((mib) this).field_i], -100);
                    System.setOut(var7);
                    ((mib) this).field_j = var14.toString();
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
              if (((mib) this).field_g + -((mib) this).field_a.length > var6_ref_uqb.field_e) {
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
                      var13 = new wc(((mib) this).field_f);
                      var12 = (uqb) (Object) var13.c(570);
                      L12: while (true) {
                        L13: {
                          if (var12 == null) {
                            break L13;
                          } else {
                            L14: {
                              if (var6_ref_uqb == var12) {
                                break L14;
                              } else {
                                if (var12.a((byte) -55, (tv) (Object) var6_ref_uqb)) {
                                  break L14;
                                } else {
                                  var7_int = 1;
                                  break L13;
                                }
                              }
                            }
                            var12 = (uqb) (Object) var13.a(19072);
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
                  nc.a((byte) 68);
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
                if (-2 == (ndb.field_c ^ -1)) {
                  this.b((byte) 71);
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
                      uea.c(9487);
                      var8 = tmb.a((tv) (Object) ((mib) this).field_a[var5], (byte) -117);
                      if (var8 == var7) {
                        ((mib) this).field_e = false;
                        break L7;
                      } else {
                        L8: {
                          var9 = dnb.c((byte) -39);
                          uea.c(9487);
                          this.a(var5, var6, 42);
                          ((mib) this).field_a[var5] = dnb.c((byte) -39);
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
        this.a(param0, false, (byte) -55);
    }

    mib(mfa param0, boolean param1) {
        this.a(param0, param1, (byte) -27);
    }

    static {
    }
}
